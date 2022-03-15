/* This file was generated by SableCC (http://www.sablecc.org/). */

package beatrice.analysis;

import java.util.*;
import beatrice.node.*;

public class AnalysisAdapter implements Analysis
{
    private Hashtable<Node,Object> in;
    private Hashtable<Node,Object> out;

    @Override
    public Object getIn(Node node)
    {
        if(this.in == null)
        {
            return null;
        }

        return this.in.get(node);
    }

    @Override
    public void setIn(Node node, Object o)
    {
        if(this.in == null)
        {
            this.in = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.in.put(node, o);
        }
        else
        {
            this.in.remove(node);
        }
    }

    @Override
    public Object getOut(Node node)
    {
        if(this.out == null)
        {
            return null;
        }

        return this.out.get(node);
    }

    @Override
    public void setOut(Node node, Object o)
    {
        if(this.out == null)
        {
            this.out = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.out.put(node, o);
        }
        else
        {
            this.out.remove(node);
        }
    }

    @Override
    public void caseStart(Start node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAlgorithmeProgramme(AAlgorithmeProgramme node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVideEntete(AVideEntete node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADefinitionEntete(ADefinitionEntete node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASingleVariableDeclaration(ASingleVariableDeclaration node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASequenceVariableDeclaration(ASequenceVariableDeclaration node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADefAdd(ADefAdd node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPrefixeCompose(APrefixeCompose node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPrefixe(APrefixe node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASuffixe(ASuffixe node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACaractereType(ACaractereType node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEntierType(AEntierType node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAByteType(AByteType node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAReelType(AReelType node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAfficherInstructions(AAfficherInstructions node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEcritureInstructions(AEcritureInstructions node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAConditionnelleInstructions(AConditionnelleInstructions node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAInstructions(AInstructions node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAffectation(AAffectation node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpress(AExpress node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAdditionExpress(AAdditionExpress node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASoustractionExpress(ASoustractionExpress node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATermeFacteur(ATermeFacteur node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMultiplicationFacteur(AMultiplicationFacteur node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADivisionFacteur(ADivisionFacteur node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAModuloFacteur(AModuloFacteur node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPuissanceFacteur(APuissanceFacteur node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAValeurEntiereTerme(AValeurEntiereTerme node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAValeurReelTerme(AValeurReelTerme node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIdentifiantTerme(AIdentifiantTerme node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAChaineTerme(AChaineTerme node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParenthesesTerme(AParenthesesTerme node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAInput(AInput node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASequencePrint(ASequencePrint node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASinglePrint(ASinglePrint node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMessage(AMessage node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMessageAdd(AMessageAdd node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAChaineMessageAdd(AChaineMessageAdd node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASimpleStructureConditionnelle(ASimpleStructureConditionnelle node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACompleteStructureConditionnelle(ACompleteStructureConditionnelle node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAGlobaleStructureConditionnelle(AGlobaleStructureConditionnelle node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFormeSimple(AFormeSimple node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFormeComplete(AFormeComplete node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFormeGlobale(AFormeGlobale node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAConditionAdditionnelles(AConditionAdditionnelles node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASinonsi(ASinonsi node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASimpleCondition(ASimpleCondition node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAComposeCondition(AComposeCondition node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAInferieurConditionSimple(AInferieurConditionSimple node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASuperieurConditionSimple(ASuperieurConditionSimple node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADifferentConditionSimple(ADifferentConditionSimple node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEgalConditionSimple(AEgalConditionSimple node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASupegalConditionSimple(ASupegalConditionSimple node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAInfegalConditionSimple(AInfegalConditionSimple node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParentheseConditionSimple(AParentheseConditionSimple node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEtConditionCompose(AEtConditionCompose node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAOuConditionCompose(AOuConditionCompose node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAConditionCompose(AConditionCompose node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTVariables(TVariables node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTVariable(TVariable node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTConst(TConst node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDebut(TDebut node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFin(TFin node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEntier(TEntier node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTReel(TReel node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTByte(TByte node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDef(TDef node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEcriture(TEcriture node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLecture(TLecture node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSi(TSi node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSinon(TSinon node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSinonsi(TSinonsi node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAlors(TAlors node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFinsi(TFinsi node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNombreEntier(TNombreEntier node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNombreReel(TNombreReel node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCaractere(TCaractere node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCaracteres(TCaracteres node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTIdentifiant(TIdentifiant node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMoins(TMoins node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPlus(TPlus node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMult(TMult node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDiv(TDiv node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMod(TMod node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPuissance(TPuissance node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTOperateurSuperieur(TOperateurSuperieur node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTOperateurInferieur(TOperateurInferieur node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTOperateurSuperieurEgal(TOperateurSuperieurEgal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTOperateurInferieurEgal(TOperateurInferieurEgal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTOperateurEgal(TOperateurEgal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTOperateurDifferent(TOperateurDifferent node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTOperateurEt(TOperateurEt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTOperateurOu(TOperateurOu node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTOperateurAffectation(TOperateurAffectation node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTConcat(TConcat node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSeparateur(TSeparateur node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTParentheseO(TParentheseO node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTParentheseF(TParentheseF node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCommentaireLigne(TCommentaireLigne node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCommentaireMultiligne(TCommentaireMultiligne node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBlanc(TBlanc node)
    {
        defaultCase(node);
    }

    @Override
    public void caseEOF(EOF node)
    {
        defaultCase(node);
    }

    @Override
    public void caseInvalidToken(InvalidToken node)
    {
        defaultCase(node);
    }

    public void defaultCase(@SuppressWarnings("unused") Node node)
    {
        // do nothing
    }
}
