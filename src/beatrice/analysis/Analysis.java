/* This file was generated by SableCC (http://www.sablecc.org/). */

package beatrice.analysis;

import beatrice.node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

    void caseStart(Start node);
    void caseAAlgorithmeProgramme(AAlgorithmeProgramme node);
    void caseAVideEntete(AVideEntete node);
    void caseADefinitionEntete(ADefinitionEntete node);
    void caseASingleVariableDeclaration(ASingleVariableDeclaration node);
    void caseASequenceVariableDeclaration(ASequenceVariableDeclaration node);
    void caseADefAdd(ADefAdd node);
    void caseAPrefixeCompose(APrefixeCompose node);
    void caseAPrefixe(APrefixe node);
    void caseASuffixe(ASuffixe node);
    void caseACaractereType(ACaractereType node);
    void caseAEntierType(AEntierType node);
    void caseAByteType(AByteType node);
    void caseAReelType(AReelType node);
    void caseAAfficherInstructions(AAfficherInstructions node);
    void caseAEcritureInstructions(AEcritureInstructions node);
    void caseAConditionnelleInstructions(AConditionnelleInstructions node);
    void caseAInstructions(AInstructions node);
    void caseAAffectation(AAffectation node);
    void caseAExpress(AExpress node);
    void caseAAdditionExpress(AAdditionExpress node);
    void caseASoustractionExpress(ASoustractionExpress node);
    void caseATermeFacteur(ATermeFacteur node);
    void caseAMultiplicationFacteur(AMultiplicationFacteur node);
    void caseADivisionFacteur(ADivisionFacteur node);
    void caseAModuloFacteur(AModuloFacteur node);
    void caseAPuissanceFacteur(APuissanceFacteur node);
    void caseAValeurEntiereTerme(AValeurEntiereTerme node);
    void caseAValeurReelTerme(AValeurReelTerme node);
    void caseAIdentifiantTerme(AIdentifiantTerme node);
    void caseAChaineTerme(AChaineTerme node);
    void caseAParenthesesTerme(AParenthesesTerme node);
    void caseAInput(AInput node);
    void caseASequencePrint(ASequencePrint node);
    void caseASinglePrint(ASinglePrint node);
    void caseAMessage(AMessage node);
    void caseAMessageAdd(AMessageAdd node);
    void caseAChaineMessageAdd(AChaineMessageAdd node);
    void caseASimpleStructureConditionnelle(ASimpleStructureConditionnelle node);
    void caseACompleteStructureConditionnelle(ACompleteStructureConditionnelle node);
    void caseAGlobaleStructureConditionnelle(AGlobaleStructureConditionnelle node);
    void caseAFormeSimple(AFormeSimple node);
    void caseAFormeComplete(AFormeComplete node);
    void caseAFormeGlobale(AFormeGlobale node);
    void caseAConditionAdditionnelles(AConditionAdditionnelles node);
    void caseASinonsi(ASinonsi node);
    void caseASimpleCondition(ASimpleCondition node);
    void caseAComposeCondition(AComposeCondition node);
    void caseAInferieurConditionSimple(AInferieurConditionSimple node);
    void caseASuperieurConditionSimple(ASuperieurConditionSimple node);
    void caseADifferentConditionSimple(ADifferentConditionSimple node);
    void caseAEgalConditionSimple(AEgalConditionSimple node);
    void caseASupegalConditionSimple(ASupegalConditionSimple node);
    void caseAInfegalConditionSimple(AInfegalConditionSimple node);
    void caseAParentheseConditionSimple(AParentheseConditionSimple node);
    void caseAEtConditionCompose(AEtConditionCompose node);
    void caseAOuConditionCompose(AOuConditionCompose node);
    void caseAConditionCompose(AConditionCompose node);

    void caseTVariables(TVariables node);
    void caseTVariable(TVariable node);
    void caseTConst(TConst node);
    void caseTDebut(TDebut node);
    void caseTFin(TFin node);
    void caseTEntier(TEntier node);
    void caseTReel(TReel node);
    void caseTByte(TByte node);
    void caseTDef(TDef node);
    void caseTEcriture(TEcriture node);
    void caseTLecture(TLecture node);
    void caseTSi(TSi node);
    void caseTSinon(TSinon node);
    void caseTSinonsi(TSinonsi node);
    void caseTAlors(TAlors node);
    void caseTFinsi(TFinsi node);
    void caseTNombreEntier(TNombreEntier node);
    void caseTNombreReel(TNombreReel node);
    void caseTCaractere(TCaractere node);
    void caseTCaracteres(TCaracteres node);
    void caseTIdentifiant(TIdentifiant node);
    void caseTMoins(TMoins node);
    void caseTPlus(TPlus node);
    void caseTMult(TMult node);
    void caseTDiv(TDiv node);
    void caseTMod(TMod node);
    void caseTPuissance(TPuissance node);
    void caseTOperateurSuperieur(TOperateurSuperieur node);
    void caseTOperateurInferieur(TOperateurInferieur node);
    void caseTOperateurSuperieurEgal(TOperateurSuperieurEgal node);
    void caseTOperateurInferieurEgal(TOperateurInferieurEgal node);
    void caseTOperateurEgal(TOperateurEgal node);
    void caseTOperateurDifferent(TOperateurDifferent node);
    void caseTOperateurEt(TOperateurEt node);
    void caseTOperateurOu(TOperateurOu node);
    void caseTOperateurAffectation(TOperateurAffectation node);
    void caseTConcat(TConcat node);
    void caseTSeparateur(TSeparateur node);
    void caseTParentheseO(TParentheseO node);
    void caseTParentheseF(TParentheseF node);
    void caseTCommentaireLigne(TCommentaireLigne node);
    void caseTCommentaireMultiligne(TCommentaireMultiligne node);
    void caseTBlanc(TBlanc node);
    void caseEOF(EOF node);
    void caseInvalidToken(InvalidToken node);
}
