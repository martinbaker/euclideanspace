package com.euclideanspace.aldor.serializer;

import com.euclideanspace.aldor.editor.ArrowTok;
import com.euclideanspace.aldor.editor.Atom;
import com.euclideanspace.aldor.editor.CurlyContentsList_Labeled;
import com.euclideanspace.aldor.editor.EditorPackage;
import com.euclideanspace.aldor.editor.Id;
import com.euclideanspace.aldor.editor.LatticeTok;
import com.euclideanspace.aldor.editor.Names;
import com.euclideanspace.aldor.editor.OpQualTail;
import com.euclideanspace.aldor.editor.PlusTok;
import com.euclideanspace.aldor.editor.PowerTok;
import com.euclideanspace.aldor.editor.QuotientTok;
import com.euclideanspace.aldor.editor.RelationTok;
import com.euclideanspace.aldor.editor.SegTok;
import com.euclideanspace.aldor.editor.TimesTok;
import com.euclideanspace.aldor.editor.enlister1a_Labeled_Semicolon;
import com.euclideanspace.aldor.services.EditorGrammarAccess;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class EditorSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private EditorGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == EditorPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case EditorPackage.ARROW_TOK:
				if(context == grammarAccess.getNakedOpRule() ||
				   context == grammarAccess.getNameRule() ||
				   context == grammarAccess.getUnqualOp_ArrowTokRule()) {
					sequence_UnqualOp_ArrowTok(context, (ArrowTok) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.ATOM:
				if(context == grammarAccess.getAtomRule() ||
				   context == grammarAccess.getBlockMoleculeRule() ||
				   context == grammarAccess.getMoleculeRule()) {
					sequence_Atom(context, (Atom) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getJleft_AtomRule()) {
					sequence_Atom_Jleft_Atom(context, (Atom) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getJleft_MoleculeRule()) {
					sequence_Atom_Jleft_Molecule(context, (Atom) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getLabeledRule()) {
					sequence_Atom_Labeled(context, (Atom) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.CURLY_CONTENTS_LIST_LABELED:
				if(context == grammarAccess.getCurlyContentsList_LabeledRule() ||
				   context == grammarAccess.getCurlyContents_LabeledRule() ||
				   context == grammarAccess.getCurly_LabeledRule() ||
				   context == grammarAccess.getModelRule()) {
					sequence_CurlyContentsList_Labeled(context, (CurlyContentsList_Labeled) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.ID:
				if(context == grammarAccess.getIdRule() ||
				   context == grammarAccess.getNameRule()) {
					sequence_Id(context, (Id) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.LATTICE_TOK:
				if(context == grammarAccess.getNakedOpRule() ||
				   context == grammarAccess.getNameRule() ||
				   context == grammarAccess.getUnqualOp_LatticeTokRule()) {
					sequence_UnqualOp_LatticeTok(context, (LatticeTok) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.NAMES:
				if(context == grammarAccess.getBlockEnclosureRule() ||
				   context == grammarAccess.getBlockMoleculeRule() ||
				   context == grammarAccess.getEnclosureRule() ||
				   context == grammarAccess.getJleft_AtomRule() ||
				   context == grammarAccess.getJleft_MoleculeRule() ||
				   context == grammarAccess.getMoleculeRule() ||
				   context == grammarAccess.getNamesRule() ||
				   context == grammarAccess.getQuotedIdsRule()) {
					sequence_Names(context, (Names) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.OP_QUAL_TAIL:
				if(context == grammarAccess.getArrowOpRule() ||
				   context == grammarAccess.getLatticeOpRule() ||
				   context == grammarAccess.getOpRule() ||
				   context == grammarAccess.getOpQualTailRule() ||
				   context == grammarAccess.getPlusOpRule() ||
				   context == grammarAccess.getPowerOpRule() ||
				   context == grammarAccess.getQualOp_ArrowTokRule() ||
				   context == grammarAccess.getQualOp_LatticeTokRule() ||
				   context == grammarAccess.getQualOp_PlusTokRule() ||
				   context == grammarAccess.getQualOp_PowerTokRule() ||
				   context == grammarAccess.getQualOp_QuotientTokRule() ||
				   context == grammarAccess.getQualOp_RelationTokRule() ||
				   context == grammarAccess.getQualOp_SegTokRule() ||
				   context == grammarAccess.getQualOp_TimesTokRule() ||
				   context == grammarAccess.getQuotientOpRule() ||
				   context == grammarAccess.getRelationOpRule() ||
				   context == grammarAccess.getSegOpRule() ||
				   context == grammarAccess.getTimesOpRule()) {
					sequence_OpQualTail(context, (OpQualTail) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.PLUS_TOK:
				if(context == grammarAccess.getNakedOpRule() ||
				   context == grammarAccess.getNameRule() ||
				   context == grammarAccess.getUnqualOp_PlusTokRule()) {
					sequence_UnqualOp_PlusTok(context, (PlusTok) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.POWER_TOK:
				if(context == grammarAccess.getNakedOpRule() ||
				   context == grammarAccess.getNameRule() ||
				   context == grammarAccess.getUnqualOp_PowerTokRule()) {
					sequence_UnqualOp_PowerTok(context, (PowerTok) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.QUOTIENT_TOK:
				if(context == grammarAccess.getNakedOpRule() ||
				   context == grammarAccess.getNameRule() ||
				   context == grammarAccess.getUnqualOp_QuotientTokRule()) {
					sequence_UnqualOp_QuotientTok(context, (QuotientTok) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.RELATION_TOK:
				if(context == grammarAccess.getNakedOpRule() ||
				   context == grammarAccess.getNameRule() ||
				   context == grammarAccess.getUnqualOp_RelationTokRule()) {
					sequence_UnqualOp_RelationTok(context, (RelationTok) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.SEG_TOK:
				if(context == grammarAccess.getNakedOpRule() ||
				   context == grammarAccess.getNameRule() ||
				   context == grammarAccess.getUnqualOp_SegTokRule()) {
					sequence_UnqualOp_SegTok(context, (SegTok) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.TIMES_TOK:
				if(context == grammarAccess.getNakedOpRule() ||
				   context == grammarAccess.getNameRule() ||
				   context == grammarAccess.getUnqualOp_TimesTokRule()) {
					sequence_UnqualOp_TimesTok(context, (TimesTok) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.ENLISTER1A_LABELED_SEMICOLON:
				if(context == grammarAccess.getBlockEnclosureRule() ||
				   context == grammarAccess.getBlockMoleculeRule() ||
				   context == grammarAccess.getBracketedRule() ||
				   context == grammarAccess.getEnclosureRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getJleft_AtomRule() ||
				   context == grammarAccess.getJleft_MoleculeRule() ||
				   context == grammarAccess.getMoleculeRule() ||
				   context == grammarAccess.getParenedRule() ||
				   context == grammarAccess.getEnlist1a_Labeled_Semicolon_ABRule() ||
				   context == grammarAccess.getEnlister1a_Labeled_SemicolonRule()) {
					sequence_enlister1a_Labeled_Semicolon(context, (enlister1a_Labeled_Semicolon) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (id=Id | lit=Literal)
	 */
	protected void sequence_Atom(EObject context, Atom semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((id=Id | lit=Literal) bm4+=BlockMolecule*)
	 */
	protected void sequence_Atom_Jleft_Atom(EObject context, Atom semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((id=Id | lit=Literal) bm+=BlockMolecule*)
	 */
	protected void sequence_Atom_Jleft_Molecule(EObject context, Atom semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((id=Id | lit=Literal) lab=Labeled?)
	 */
	protected void sequence_Atom_Labeled(EObject context, Atom semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (statemts+=Labeled statemts+=Labeled*)
	 */
	protected void sequence_CurlyContentsList_Labeled(EObject context, CurlyContentsList_Labeled semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (AB_Id=TK_ID | op=KW_SHARP | op=KW_TILDE)
	 */
	protected void sequence_Id(EObject context, Id semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (firstName=TK_ID subsequentNames+=TK_ID*)
	 */
	protected void sequence_Names(EObject context, Names semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=Molecule
	 */
	protected void sequence_OpQualTail(EObject context, OpQualTail semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EditorPackage.Literals.OP_QUAL_TAIL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EditorPackage.Literals.OP_QUAL_TAIL__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOpQualTailAccess().getNameMoleculeParserRuleCall_0_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {ArrowTok}
	 */
	protected void sequence_UnqualOp_ArrowTok(EObject context, ArrowTok semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {LatticeTok}
	 */
	protected void sequence_UnqualOp_LatticeTok(EObject context, LatticeTok semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {PlusTok}
	 */
	protected void sequence_UnqualOp_PlusTok(EObject context, PlusTok semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {PowerTok}
	 */
	protected void sequence_UnqualOp_PowerTok(EObject context, PowerTok semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {QuotientTok}
	 */
	protected void sequence_UnqualOp_QuotientTok(EObject context, QuotientTok semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {RelationTok}
	 */
	protected void sequence_UnqualOp_RelationTok(EObject context, RelationTok semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {SegTok}
	 */
	protected void sequence_UnqualOp_SegTok(EObject context, SegTok semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {TimesTok}
	 */
	protected void sequence_UnqualOp_TimesTok(EObject context, TimesTok semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (statemnts+=Labeled statemnts+=Labeled)
	 */
	protected void sequence_enlister1a_Labeled_Semicolon(EObject context, enlister1a_Labeled_Semicolon semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
