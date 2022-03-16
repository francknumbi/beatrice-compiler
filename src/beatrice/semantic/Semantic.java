package beatrice.semantic;

import beatrice.analysis.DepthFirstAdapter;
import beatrice.node.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Semantic extends DepthFirstAdapter {

    HashMap<String,String> table_symboles = new HashMap<String,String>();
    ArrayList<String> listeVariables = new ArrayList<>();
    String  identifiantCourant =null;
    /*
    Parcours de l arbre contenant les variables
     */
   public void outAPrefixe(APrefixe node)
   {
       String identifiant = node.getIdentifiant().getText();
       listeVariables.add(identifiant);
   }
   public void outASuffixe(ASuffixe node)
   {
       /*
       * initialisation du tableau des symboles des informations necessaire
       * concernants les identifiants
       * */
        String type = node.getType().toString();
        if(listeVariables.size()>1){
            for (String identifiant: listeVariables
            ) {
                if(table_symboles.containsKey(identifiant)){
                    System.out.println("ERREUR DE DECLARATION");
                    System.exit(0);
                }
                else
                    table_symboles.put(identifiant,type);
            }
            System.out.println(table_symboles);
        }
        else if(listeVariables.size()==1){
            if (table_symboles.containsKey(listeVariables.get(0))){
                System.out.println("ERREUR DECLARATION");
                System.exit(0);
            }
            else
                table_symboles.put(listeVariables.get(0),type);
        }
        listeVariables.clear();
    }
    /*
    verification sur la premiere variable afin de savoir si cette derniere n a pas ete declare
    et que cette derniere a bien un type
     */
    public void outASequenceVariableDeclaration(ASequenceVariableDeclaration node)
    {
        String chaine = node.getDefAdd().toString();
        String[] types = new String[]{"entier","reel","caractere","byte"};
        HashMap<Integer,Integer> list = new HashMap<>();
        ArrayList<Integer> indices = new ArrayList<>();
        int indicePlusPetit =0;
        int i =0;
        int plusPetitIndex;

        if(table_symboles.containsKey(node.getIdentifiant().getText()))
        {
            System.out.println("ERREUR DE DECLARATION LA VARIABLE" );
            System.exit(0);
        }
        if (node.getSuffixe()!=null)
        {
            for (String type: types) {
                if(node.getSuffixe().toString().indexOf(type) > 0){
                    break;
                }
                i+=1;
            }
            table_symboles.put(node.getIdentifiant().getText(), types[i]);
        }
        else
        {
            System.out.println("TYPE : "+node.getSuffixe());
            System.out.println(chaine);
            for (String type : types) {

                if (chaine.indexOf(type) > 0){
                    list.put(i,chaine.indexOf(type));
                }
                i+=1;
            }
            for (Map.Entry<Integer, Integer> indice: list.entrySet()
            ) {
                indices.add(indice.getKey());
            }
            i=0;

            if(list.size() > 1){
                plusPetitIndex = list.get(indices.get(0));
                for (Integer valeur : indices)
                {
                    if (list.get(valeur) < plusPetitIndex)
                    {

                        plusPetitIndex = list.get(valeur);
                        indicePlusPetit = valeur;
                        System.out.println(plusPetitIndex);
                    }

                    i++;
                }
            }
            else
                indicePlusPetit = indices.get(0);

            table_symboles.put(node.getIdentifiant().getText(),types[indicePlusPetit]);
            System.out.println(table_symboles);

        }
    }
    public void inAAffectation(AAffectation node)
    {
        identifiantCourant = node.getIdentifiant().getText();
    }
    public void outAAffectation(AAffectation node)
    {
        /*
        verifier si une variable a été déclaré avant son utilisation
     */
        String identifiantAffectation = node.getIdentifiant().getText();
        if (!table_symboles.containsKey(identifiantAffectation)){
            System.out.println("Erreur d initialisation "+ node.getIdentifiant().getText()+"N EST PAS DECLAREE");
            System.exit(0);
        }
        identifiantCourant =null;

    }
     /*
     verifier que la variable dans l expression a ete declaree
      */
    public void outAIdentifiantTerme(AIdentifiantTerme node)
    {
        String identifiantExpression = node.getIdentifiant().getText();
        if (!table_symboles.containsKey(identifiantExpression))
        {
            System.out.println("Erreur : la variable " + node.getIdentifiant().getText() +" n est pas declaree");
            System.exit(0);
        }

    }

    /*
        verifier que l identifiant dans l affichage [message_Add] a ete declare avant son utilisation
    */
    public void outAMessageAdd(AMessageAdd node)
    {
        String idenfiantEcritureMessageAdd = node.getIdentifiant().getText();
        if (!table_symboles.containsKey(idenfiantEcritureMessageAdd)){
            System.out.println("Erreur : la variable " +idenfiantEcritureMessageAdd +" n est pas declaree");
            System.exit(0);
        }
    }

    /*
    verifier que l identifiant dans la lecture a ete declare avant son utilisation
     */
    public void inAInput(AInput node)
    {
        String identifiantLecture = node.getIdentifiant().getText();
        if (!table_symboles.containsKey(identifiantLecture)){
            System.out.println("Erreur : la variable" +identifiantLecture +" n est pas declaree");
            System.exit(0);
        }

    }

    /*
    Vefication des types dans les operations d affectations et arithmetiques
     */

    public void inAValeurReelTerme(AValeurReelTerme node)
    {
        System.out.println(table_symboles);
        String type = table_symboles.get(identifiantCourant);
        System.out.println(type);
        if(type != "reel")
        {
            System.out.println("Erreur : types non compatibles " + identifiantCourant);
            System.exit(0);
        }
    }

    public void outAChaineTerme(AChaineTerme node)
    {
        String type = table_symboles.get(identifiantCourant);
        System.out.println(type);
        if(type != "caractere")
        {
            System.out.println("Erreur : types non compatibles " + identifiantCourant);
            System.exit(0);
        }
    }

    public void outAAlgorithmeProgramme(AAlgorithmeProgramme node)
    {
        System.out.println(table_symboles);
    }


}
