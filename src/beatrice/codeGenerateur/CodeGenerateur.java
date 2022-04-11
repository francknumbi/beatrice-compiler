package beatrice.codeGenerateur;

import beatrice.analysis.DepthFirstAdapter;
import beatrice.compiler.Main;
import beatrice.node.*;
import jas.*;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;

public class CodeGenerateur extends DepthFirstAdapter {

    //class principale
    private ClassEnv classPrincipale = new ClassEnv();
    //methode constructeur
    private CodeAttr constructeur = new CodeAttr();
    //methode principale de la class
    private CodeAttr main_methode = new CodeAttr();

    private String nomClass;

    private String typeVariableActuelle =null;

    private HashMap<String,String> table_symboles = Main.table_symboles;

    /**
     *    definition du constructeur
     *    Definition d une partie de la methode main
     */
    public void inAAlgorithmeProgramme(AAlgorithmeProgramme node)
    {
        try{
            constructeur.addInsn(new Insn(RuntimeConstants.opc_aload_0));
            constructeur.addInsn(new Insn(RuntimeConstants.opc_invokespecial, new MethodCP(
                    "java/lang/Object", "<init>", "()V")));
            constructeur.addInsn(new Insn(RuntimeConstants.opc_return));

            main_methode.setStackSize((short) 100);
        } catch (jas.jasError jasError) {
            jasError.printStackTrace();
        }
    }

    /**
     * Definition de la class principale
     */
    public void outANomAlgorithme(ANomAlgorithme node)
    {
        nomClass = node.getIdentifiant().getText();
        try{
            classPrincipale.setClass(new ClassCP(nomClass));
            classPrincipale.setSuperClass(new ClassCP("java/lang/Object"));
            classPrincipale.setSource(new SourceAttr(""));
            classPrincipale.setClassAccess((short) RuntimeConstants.ACC_PUBLIC);
            classPrincipale.addMethod((short) RuntimeConstants.ACC_PUBLIC,
                    "<init>", "()V",constructeur,new ExceptAttr());

            /**
             * Ajout d'attributs (variables) a la class
             */

            if(table_symboles!=null){

                table_symboles.forEach((identifiant,type) ->{
                    switch (type) {
                        case "entier":
                        case "byte":
                            classPrincipale.addField(new Var((short) (RuntimeConstants.ACC_STATIC | RuntimeConstants.ACC_PUBLIC),
                                    new AsciiCP(identifiant), new AsciiCP("I"), new ConstAttr(new IntegerCP(1))));
                            break;
                        case "reel":
                            classPrincipale.addField(new Var((short) (RuntimeConstants.ACC_STATIC | RuntimeConstants.ACC_PUBLIC),
                                    new AsciiCP(identifiant), new AsciiCP("F"), new ConstAttr(new FloatCP(1))));
                            break;
                        case "caractere":
                            //classPrincipale.addField(new Var((short) (RuntimeConstants.ACC_STATIC | RuntimeConstants.ACC_PUBLIC),
                            //new AsciiCP(identifiant), new AsciiCP("C"), new ConstAttr(new StringCP("null"))));
                            break;
                    }
                });
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**********************************************************
     ************************* OPERATIONS **********************
     *********************************************************/


    /**
     *  AFFECTATIONS
     */
    public void inAAffectation(AAffectation node)
    {
        typeVariableActuelle = table_symboles.get(node.getIdentifiant().getText());
    }
    public void outAAffectation(AAffectation node)
    {
        String identifiant = node.getIdentifiant().getText();
        if(typeVariableActuelle.equals("reel")){
            try {
                main_methode.addInsn(new Insn(RuntimeConstants.opc_putstatic,new FieldCP(nomClass,identifiant,"F")));
            } catch (jas.jasError jasError) {
                jasError.printStackTrace();
            }
        }
        else if (typeVariableActuelle.equals("entier") | typeVariableActuelle.equals("byte")){
            try {
                main_methode.addInsn(new Insn(RuntimeConstants.opc_putstatic,new FieldCP(nomClass,identifiant,"I")));
            } catch (jas.jasError jasError) {
                jasError.printStackTrace();
            }
        }
        typeVariableActuelle =null;
    }
    /**
     *  PLACER LA VALEUR ENTIERE DANS LA PILE
     */
    public void caseAValeurEntiereTerme(AValeurEntiereTerme node)  {

        if (typeVariableActuelle != null && typeVariableActuelle.equals("reel")){
            float valeur = Float.parseFloat(node.getNombreEntier().getText());
            try {
                main_methode.addInsn(new Insn(RuntimeConstants.opc_ldc,new FloatCP(valeur)));
            } catch (jas.jasError jasError) {
                jasError.printStackTrace();
            }
        }
        else {
            int valeur = Integer.parseInt(node.getNombreEntier().getText());
            if (valeur > -1){
                try {
                    main_methode.addInsn(new Insn(RuntimeConstants.opc_bipush,valeur));
                } catch (jas.jasError jasError) {
                    jasError.printStackTrace();
                }
            }
        }
    }
    /**
     *  PLACER LA VALEUR DECIMALE DANS LA PILE
     */
    public void outAValeurReelTerme(AValeurReelTerme node)
    {
        float valeur = Float.parseFloat(node.getNombreReel().getText());
        try {
            main_methode.addInsn(new Insn(RuntimeConstants.opc_ldc,new FloatCP(valeur)));
        } catch (jas.jasError jasError) {
            jasError.printStackTrace();
        }
    }
    /**
     *    OPERATIONS ARITHMETIQUES
     */
    public void outAAdditionExpress(AAdditionExpress node)
    {
        try {
            if(typeVariableActuelle.equals("reel"))
                main_methode.addInsn(new Insn(RuntimeConstants.opc_fadd));
            else if(typeVariableActuelle.equals("entier") | typeVariableActuelle.equals("byte"))
                main_methode.addInsn(new Insn(RuntimeConstants.opc_iadd));
        } catch (jas.jasError jasError) {
            jasError.printStackTrace();
        }
    }
    public void outASoustractionExpress(ASoustractionExpress node)
    {
        try {
            if(typeVariableActuelle.equals("reel"))
                main_methode.addInsn(new Insn(RuntimeConstants.opc_fsub));
            else if(typeVariableActuelle.equals("entier") | typeVariableActuelle.equals("byte"))
                main_methode.addInsn(new Insn(RuntimeConstants.opc_isub));
        } catch (jas.jasError jasError) {
            jasError.printStackTrace();
        }
    }
    public void outAMultiplicationFacteur(AMultiplicationFacteur node)
    {
        try {
            if(typeVariableActuelle.equals("reel"))
                main_methode.addInsn(new Insn(RuntimeConstants.opc_fmul));
            else if(typeVariableActuelle.equals("entier") | typeVariableActuelle.equals("byte"))
                main_methode.addInsn(new Insn(RuntimeConstants.opc_imul));
        } catch (jas.jasError jasError) {
            jasError.printStackTrace();
        }
    }
    public void outADivisionFacteur(ADivisionFacteur node)
    {
        try {
            if(typeVariableActuelle.equals("reel"))
                main_methode.addInsn(new Insn(RuntimeConstants.opc_fdiv));
            else if(typeVariableActuelle.equals("entier") | typeVariableActuelle.equals("byte"))
                main_methode.addInsn(new Insn(RuntimeConstants.opc_idiv));
        } catch (jas.jasError jasError) {
            jasError.printStackTrace();
        }
    }
    public void outAModuloFacteur(AModuloFacteur node)
    {
        try {
            if(typeVariableActuelle.equals("reel"))
                main_methode.addInsn(new Insn(RuntimeConstants.opc_frem));
            else if(typeVariableActuelle.equals("entier") | typeVariableActuelle.equals("byte"))
                main_methode.addInsn(new Insn(RuntimeConstants.opc_irem));
        } catch (jas.jasError jasError) {
            jasError.printStackTrace();
        }
    }
    public void outAPuissanceFacteur(APuissanceFacteur node)
    {

    }


    /**
     * Affichage d un simple message ou simple identifiant
     */
    public void inASinglePrint(ASinglePrint node)
    {
        try {
            main_methode.addInsn(new Insn(RuntimeConstants.opc_getstatic,new FieldCP("java/lang/System", "out", "Ljava/io/PrintStream;")));
        } catch (jas.jasError jasError) {
            jasError.printStackTrace();
        }

    }
    public void outASinglePrint(ASinglePrint node)
    {
        String message = node.getMessageAdd().toString().replaceAll(" ","");
        System.out.println(message);
        // AFFCHER IDENTIFIANT
        if(table_symboles.containsKey(message)){
            try {
                String type = table_symboles.get(message);
                switch (type) {

                    case "entier":
                    case "byte":
                        main_methode.addInsn(new Insn(RuntimeConstants.opc_getstatic,new FieldCP(nomClass, message,"I")));
                        System.out.println("byte entier");
                        main_methode.addInsn(new Insn(RuntimeConstants.opc_invokevirtual, new MethodCP("java/io/PrintStream", "println", "(I)V")));
                        break;
                    case "reel":
                        System.out.println("relllll");
                        main_methode.addInsn(new Insn(RuntimeConstants.opc_getstatic,new FieldCP(nomClass, message,"F")));
                        main_methode.addInsn(new Insn(RuntimeConstants.opc_invokevirtual, new MethodCP("java/io/PrintStream", "println", "(F)V")));
                        break;
                    case "caractere":
                        System.out.println("caractere");
                        main_methode.addInsn(new Insn(RuntimeConstants.opc_getstatic,new FieldCP(nomClass, message,"C")));
                        main_methode.addInsn(new Insn(RuntimeConstants.opc_invokevirtual, new MethodCP("java/io/PrintStream", "println", "(Ljava/lang/String;)V")));
                        break;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        //AFFICHER MESSAGE
        else {
            message = node.getMessageAdd().toString().replaceAll("\"","");
            try {
                main_methode.addInsn(new Insn(RuntimeConstants.opc_ldc, new StringCP(message)));
                main_methode.addInsn(new Insn(RuntimeConstants.opc_invokevirtual, new MethodCP("java/io/PrintStream", "println", "(Ljava/lang/String;)V")));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Ajout de la methode principale (main) a la class principale
     */
    public void outAAlgorithmeProgramme(AAlgorithmeProgramme node)
    {
        try{
            main_methode.addInsn(new Insn(RuntimeConstants.opc_return));
            classPrincipale.addMethod((short)(RuntimeConstants.ACC_STATIC| RuntimeConstants.ACC_PUBLIC),"main","([Ljava/lang/String;)V",main_methode,new ExceptAttr());

            classPrincipale.write(new DataOutputStream(new FileOutputStream(nomClass+".class")));

        } catch (jas.jasError | IOException jasError) {
            jasError.printStackTrace();
        }
    }


}
