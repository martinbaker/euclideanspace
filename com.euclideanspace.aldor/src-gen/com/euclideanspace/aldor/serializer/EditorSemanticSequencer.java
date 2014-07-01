package com.euclideanspace.aldor.serializer;

import com.euclideanspace.aldor.editor.ArrowTok;
import com.euclideanspace.aldor.editor.Atom;
import com.euclideanspace.aldor.editor.BindingL_Infixed_AnyStatement;
import com.euclideanspace.aldor.editor.BindingL_Infixed_BalStatement;
import com.euclideanspace.aldor.editor.BindingL_Infixed_Collection;
import com.euclideanspace.aldor.editor.ButExpr;
import com.euclideanspace.aldor.editor.Collection;
import com.euclideanspace.aldor.editor.CurlyContentsList_Labeled;
import com.euclideanspace.aldor.editor.Declaration;
import com.euclideanspace.aldor.editor.EditorPackage;
import com.euclideanspace.aldor.editor.ExportDecl;
import com.euclideanspace.aldor.editor.Flow_AnyStatement;
import com.euclideanspace.aldor.editor.Flow_BalStatement;
import com.euclideanspace.aldor.editor.Id;
import com.euclideanspace.aldor.editor.Iterator;
import com.euclideanspace.aldor.editor.LatticeTok;
import com.euclideanspace.aldor.editor.Names;
import com.euclideanspace.aldor.editor.OpQualTail;
import com.euclideanspace.aldor.editor.PlusTok;
import com.euclideanspace.aldor.editor.PowerTok;
import com.euclideanspace.aldor.editor.QuotientTok;
import com.euclideanspace.aldor.editor.RelationTok;
import com.euclideanspace.aldor.editor.SegTok;
import com.euclideanspace.aldor.editor.TimesTok;
import com.euclideanspace.aldor.editor.enlister1_Infixed_Comma;
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
				if(context == grammarAccess.getFlow_AnyStatementRule() ||
				   context == grammarAccess.getFlow_BalStatementRule() ||
				   context == grammarAccess.getNakedOpRule() ||
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
			case EditorPackage.BINDING_LINFIXED_ANY_STATEMENT:
				if(context == grammarAccess.getAlwaysPart_AnyStatementRule() ||
				   context == grammarAccess.getBindingL_Infixed_AnyStatementRule() ||
				   context == grammarAccess.getBindingR_InfixedExprsDecl_AnyStatementRule() ||
				   context == grammarAccess.getBinding_AnyStatementRule() ||
				   context == grammarAccess.getDeclBindingRule() ||
				   context == grammarAccess.getDeclarationRule() ||
				   context == grammarAccess.getExportDeclRule() ||
				   context == grammarAccess.getMacroBodyRule() ||
				   context == grammarAccess.getSigRule()) {
					sequence_BindingL_Infixed_AnyStatement(context, (BindingL_Infixed_AnyStatement) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getCommaItemRule() ||
				   context == grammarAccess.getGenBoundRule()) {
					sequence_BindingL_Infixed_AnyStatement_CommaItem(context, (BindingL_Infixed_AnyStatement) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getFlow_AnyStatementRule()) {
					sequence_BindingL_Infixed_AnyStatement_CommaItem_Flow_AnyStatement(context, (BindingL_Infixed_AnyStatement) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getFlow_BalStatementRule()) {
					sequence_BindingL_Infixed_AnyStatement_CommaItem_Flow_BalStatement(context, (BindingL_Infixed_AnyStatement) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getCommaRule() ||
				   context == grammarAccess.getLabeledRule() ||
				   context == grammarAccess.getEnlist1_CommaItem_Comma_ABRule() ||
				   context == grammarAccess.getEnlister1_CommaItem_CommaRule()) {
					sequence_BindingL_Infixed_AnyStatement_CommaItem_enlister1_CommaItem_Comma(context, (BindingL_Infixed_AnyStatement) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.BINDING_LINFIXED_BAL_STATEMENT:
				if(context == grammarAccess.getAlwaysPart_BalStatementRule() ||
				   context == grammarAccess.getBindingL_Infixed_BalStatementRule() ||
				   context == grammarAccess.getBinding_BalStatementRule() ||
				   context == grammarAccess.getFlow_BalStatementRule()) {
					sequence_BindingL_Infixed_BalStatement(context, (BindingL_Infixed_BalStatement) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.BINDING_LINFIXED_COLLECTION:
				if(context == grammarAccess.getBindingL_Infixed_CollectionRule() ||
				   context == grammarAccess.getBinding_CollectionRule() ||
				   context == grammarAccess.getCasesRule()) {
					sequence_BindingL_Infixed_Collection(context, (BindingL_Infixed_Collection) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.BUT_EXPR:
				if(context == grammarAccess.getButExprRule()) {
					sequence_ButExpr(context, (ButExpr) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.COLLECTION:
				if(context == grammarAccess.getBindingL_Infixed_CollectionRule() ||
				   context == grammarAccess.getBinding_CollectionRule() ||
				   context == grammarAccess.getCasesRule() ||
				   context == grammarAccess.getCollectionRule() ||
				   context == grammarAccess.getFlow_AnyStatementRule() ||
				   context == grammarAccess.getFlow_BalStatementRule()) {
					sequence_Collection(context, (Collection) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.CURLY_CONTENTS_LIST_LABELED:
				if(context == grammarAccess.getBlockRule() ||
				   context == grammarAccess.getBlockEnclosureRule() ||
				   context == grammarAccess.getBlockMoleculeRule() ||
				   context == grammarAccess.getCurlyContentsList_LabeledRule() ||
				   context == grammarAccess.getCurlyContents_LabeledRule() ||
				   context == grammarAccess.getCurly_LabeledRule() ||
				   context == grammarAccess.getDeclMoleculeRule() ||
				   context == grammarAccess.getDeclarationRule() ||
				   context == grammarAccess.getExportDeclRule() ||
				   context == grammarAccess.getJleft_AtomRule() ||
				   context == grammarAccess.getJleft_MoleculeRule() ||
				   context == grammarAccess.getLabeledRule() ||
				   context == grammarAccess.getMacroBodyRule() ||
				   context == grammarAccess.getModelRule() ||
				   context == grammarAccess.getSigRule()) {
					sequence_CurlyContentsList_Labeled(context, (CurlyContentsList_Labeled) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.DECLARATION:
				if(context == grammarAccess.getDeclarationRule() ||
				   context == grammarAccess.getLabeledRule()) {
					sequence_Declaration(context, (Declaration) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.EXPORT_DECL:
				if(context == grammarAccess.getDeclarationRule() ||
				   context == grammarAccess.getExportDeclRule() ||
				   context == grammarAccess.getLabeledRule() ||
				   context == grammarAccess.getMacroBodyRule()) {
					sequence_ExportDecl(context, (ExportDecl) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.FLOW_ANY_STATEMENT:
				if(context == grammarAccess.getFlow_AnyStatementRule()) {
					sequence_Flow_AnyStatement(context, (Flow_AnyStatement) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.FLOW_BAL_STATEMENT:
				if(context == grammarAccess.getFlow_BalStatementRule()) {
					sequence_Flow_BalStatement(context, (Flow_BalStatement) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.ID:
				if(context == grammarAccess.getFlow_AnyStatementRule() ||
				   context == grammarAccess.getFlow_BalStatementRule() ||
				   context == grammarAccess.getIdRule() ||
				   context == grammarAccess.getNameRule()) {
					sequence_Id(context, (Id) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.ITERATOR:
				if(context == grammarAccess.getIteratorRule()) {
					sequence_Iterator(context, (Iterator) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.LATTICE_TOK:
				if(context == grammarAccess.getFlow_AnyStatementRule() ||
				   context == grammarAccess.getFlow_BalStatementRule() ||
				   context == grammarAccess.getNakedOpRule() ||
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
				if(context == grammarAccess.getFlow_AnyStatementRule() ||
				   context == grammarAccess.getFlow_BalStatementRule() ||
				   context == grammarAccess.getNakedOpRule() ||
				   context == grammarAccess.getNameRule() ||
				   context == grammarAccess.getUnqualOp_PlusTokRule()) {
					sequence_UnqualOp_PlusTok(context, (PlusTok) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.POWER_TOK:
				if(context == grammarAccess.getFlow_AnyStatementRule() ||
				   context == grammarAccess.getFlow_BalStatementRule() ||
				   context == grammarAccess.getNakedOpRule() ||
				   context == grammarAccess.getNameRule() ||
				   context == grammarAccess.getUnqualOp_PowerTokRule()) {
					sequence_UnqualOp_PowerTok(context, (PowerTok) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.QUOTIENT_TOK:
				if(context == grammarAccess.getFlow_AnyStatementRule() ||
				   context == grammarAccess.getFlow_BalStatementRule() ||
				   context == grammarAccess.getNakedOpRule() ||
				   context == grammarAccess.getNameRule() ||
				   context == grammarAccess.getUnqualOp_QuotientTokRule()) {
					sequence_UnqualOp_QuotientTok(context, (QuotientTok) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.RELATION_TOK:
				if(context == grammarAccess.getFlow_AnyStatementRule() ||
				   context == grammarAccess.getFlow_BalStatementRule() ||
				   context == grammarAccess.getNakedOpRule() ||
				   context == grammarAccess.getNameRule() ||
				   context == grammarAccess.getUnqualOp_RelationTokRule()) {
					sequence_UnqualOp_RelationTok(context, (RelationTok) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.SEG_TOK:
				if(context == grammarAccess.getFlow_AnyStatementRule() ||
				   context == grammarAccess.getFlow_BalStatementRule() ||
				   context == grammarAccess.getNakedOpRule() ||
				   context == grammarAccess.getNameRule() ||
				   context == grammarAccess.getUnqualOp_SegTokRule()) {
					sequence_UnqualOp_SegTok(context, (SegTok) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.TIMES_TOK:
				if(context == grammarAccess.getFlow_AnyStatementRule() ||
				   context == grammarAccess.getFlow_BalStatementRule() ||
				   context == grammarAccess.getNakedOpRule() ||
				   context == grammarAccess.getNameRule() ||
				   context == grammarAccess.getUnqualOp_TimesTokRule()) {
					sequence_UnqualOp_TimesTok(context, (TimesTok) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.ENLISTER1_INFIXED_COMMA:
				if(context == grammarAccess.getFromPartRule() ||
				   context == grammarAccess.getEnlist1_Infixed_Comma_ABRule() ||
				   context == grammarAccess.getEnlister1_Infixed_CommaRule()) {
					sequence_enlister1_Infixed_Comma(context, (enlister1_Infixed_Comma) semanticObject); 
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
	 *     (
	 *         bia=BindingL_Infixed_AnyStatement | 
	 *         bia=BindingL_Infixed_AnyStatement | 
	 *         bia=BindingL_Infixed_AnyStatement | 
	 *         bia=BindingL_Infixed_AnyStatement | 
	 *         bia=BindingL_Infixed_AnyStatement
	 *     )
	 */
	protected void sequence_BindingL_Infixed_AnyStatement(EObject context, BindingL_Infixed_AnyStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             bia=BindingL_Infixed_AnyStatement | 
	 *             bia=BindingL_Infixed_AnyStatement | 
	 *             bia=BindingL_Infixed_AnyStatement | 
	 *             bia=BindingL_Infixed_AnyStatement | 
	 *             bia=BindingL_Infixed_AnyStatement
	 *         ) 
	 *         ci=CommaItem*
	 *     )
	 */
	protected void sequence_BindingL_Infixed_AnyStatement_CommaItem(EObject context, BindingL_Infixed_AnyStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             bia=BindingL_Infixed_AnyStatement | 
	 *             bia=BindingL_Infixed_AnyStatement | 
	 *             bia=BindingL_Infixed_AnyStatement | 
	 *             bia=BindingL_Infixed_AnyStatement | 
	 *             bia=BindingL_Infixed_AnyStatement
	 *         ) 
	 *         ci=CommaItem* 
	 *         bbs=Binding_BalStatement 
	 *         bas=Binding_AnyStatement
	 *     )
	 */
	protected void sequence_BindingL_Infixed_AnyStatement_CommaItem_Flow_AnyStatement(EObject context, BindingL_Infixed_AnyStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             bia=BindingL_Infixed_AnyStatement | 
	 *             bia=BindingL_Infixed_AnyStatement | 
	 *             bia=BindingL_Infixed_AnyStatement | 
	 *             bia=BindingL_Infixed_AnyStatement | 
	 *             bia=BindingL_Infixed_AnyStatement
	 *         ) 
	 *         ci=CommaItem* 
	 *         bbs=Binding_BalStatement 
	 *         bbs2=Binding_BalStatement
	 *     )
	 */
	protected void sequence_BindingL_Infixed_AnyStatement_CommaItem_Flow_BalStatement(EObject context, BindingL_Infixed_AnyStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             bia=BindingL_Infixed_AnyStatement | 
	 *             bia=BindingL_Infixed_AnyStatement | 
	 *             bia=BindingL_Infixed_AnyStatement | 
	 *             bia=BindingL_Infixed_AnyStatement | 
	 *             bia=BindingL_Infixed_AnyStatement
	 *         ) 
	 *         ci=CommaItem* 
	 *         ci=CommaItem*
	 *     )
	 */
	protected void sequence_BindingL_Infixed_AnyStatement_CommaItem_enlister1_CommaItem_Comma(EObject context, BindingL_Infixed_AnyStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         bib=BindingL_Infixed_BalStatement | 
	 *         bib=BindingL_Infixed_BalStatement | 
	 *         bib=BindingL_Infixed_BalStatement | 
	 *         bib=BindingL_Infixed_BalStatement | 
	 *         bib=BindingL_Infixed_BalStatement
	 *     )
	 */
	protected void sequence_BindingL_Infixed_BalStatement(EObject context, BindingL_Infixed_BalStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         bic=BindingL_Infixed_Collection | 
	 *         bic=BindingL_Infixed_Collection | 
	 *         bic=BindingL_Infixed_Collection | 
	 *         bic=BindingL_Infixed_Collection | 
	 *         bic=BindingL_Infixed_Collection
	 *     )
	 */
	protected void sequence_BindingL_Infixed_Collection(EObject context, BindingL_Infixed_Collection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (db=DeclBinding ca=Cases)?
	 */
	protected void sequence_ButExpr(EObject context, ButExpr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EditorPackage.Literals.BUT_EXPR__DB) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EditorPackage.Literals.BUT_EXPR__DB));
			if(transientValues.isValueTransient(semanticObject, EditorPackage.Literals.BUT_EXPR__CA) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EditorPackage.Literals.BUT_EXPR__CA));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getButExprAccess().getDbDeclBindingParserRuleCall_0_0(), semanticObject.getDb());
		feeder.accept(grammarAccess.getButExprAccess().getCaCasesParserRuleCall_2_0(), semanticObject.getCa());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     i=Iterators
	 */
	protected void sequence_Collection(EObject context, Collection semanticObject) {
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
	 *     (fp=FromPart? | fp=FromPart?)
	 */
	protected void sequence_Declaration(EObject context, Declaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (tp=ToPart | fp=FromPart)
	 */
	protected void sequence_ExportDecl(EObject context, ExportDecl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     bas3=Binding_AnyStatement?
	 */
	protected void sequence_Flow_AnyStatement(EObject context, Flow_AnyStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     bbs4=Binding_BalStatement?
	 */
	protected void sequence_Flow_BalStatement(EObject context, Flow_BalStatement semanticObject) {
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
	 *     (i=Infixed sp=SuchthatPart?)?
	 */
	protected void sequence_Iterator(EObject context, Iterator semanticObject) {
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
	 *     i=Infixed+
	 */
	protected void sequence_enlister1_Infixed_Comma(EObject context, enlister1_Infixed_Comma semanticObject) {
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
