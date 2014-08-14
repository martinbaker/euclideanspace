package com.euclideanspace.aldor.serializer;

import com.euclideanspace.aldor.editor.AlwaysPart_AnyStatement;
import com.euclideanspace.aldor.editor.AlwaysPart_BalStatement;
import com.euclideanspace.aldor.editor.ArrowTok;
import com.euclideanspace.aldor.editor.Atom;
import com.euclideanspace.aldor.editor.BindingL_Infixed_AnyStatement;
import com.euclideanspace.aldor.editor.Bracketed;
import com.euclideanspace.aldor.editor.ButExpr;
import com.euclideanspace.aldor.editor.CurlyContentB_Labeled;
import com.euclideanspace.aldor.editor.CurlyContentsList_Labeled;
import com.euclideanspace.aldor.editor.DeclMolecule;
import com.euclideanspace.aldor.editor.Declaration;
import com.euclideanspace.aldor.editor.E12;
import com.euclideanspace.aldor.editor.E13;
import com.euclideanspace.aldor.editor.E14;
import com.euclideanspace.aldor.editor.E3;
import com.euclideanspace.aldor.editor.E4;
import com.euclideanspace.aldor.editor.E5;
import com.euclideanspace.aldor.editor.E6;
import com.euclideanspace.aldor.editor.E7;
import com.euclideanspace.aldor.editor.E8;
import com.euclideanspace.aldor.editor.E9;
import com.euclideanspace.aldor.editor.EditorPackage;
import com.euclideanspace.aldor.editor.ExportDecl;
import com.euclideanspace.aldor.editor.Expr;
import com.euclideanspace.aldor.editor.Flow_AnyStatement;
import com.euclideanspace.aldor.editor.Flow_BalStatement;
import com.euclideanspace.aldor.editor.GenBound;
import com.euclideanspace.aldor.editor.Id;
import com.euclideanspace.aldor.editor.Infixed;
import com.euclideanspace.aldor.editor.Iterator;
import com.euclideanspace.aldor.editor.Iterators1;
import com.euclideanspace.aldor.editor.Jleft_Atom;
import com.euclideanspace.aldor.editor.Jleft_Molecule;
import com.euclideanspace.aldor.editor.Jright_Atom;
import com.euclideanspace.aldor.editor.Jright_Molecule;
import com.euclideanspace.aldor.editor.LatticeTok;
import com.euclideanspace.aldor.editor.Model;
import com.euclideanspace.aldor.editor.Name;
import com.euclideanspace.aldor.editor.Names;
import com.euclideanspace.aldor.editor.Op;
import com.euclideanspace.aldor.editor.OpQualTail;
import com.euclideanspace.aldor.editor.Parened;
import com.euclideanspace.aldor.editor.PlusTok;
import com.euclideanspace.aldor.editor.PowerTok;
import com.euclideanspace.aldor.editor.QualOp_ArrowTok;
import com.euclideanspace.aldor.editor.QualOp_LatticeTok;
import com.euclideanspace.aldor.editor.QualOp_PlusTok;
import com.euclideanspace.aldor.editor.QualOp_PowerTok;
import com.euclideanspace.aldor.editor.QualOp_QuotientTok;
import com.euclideanspace.aldor.editor.QualOp_RelationTok;
import com.euclideanspace.aldor.editor.QualOp_SegTok;
import com.euclideanspace.aldor.editor.QualOp_TimesTok;
import com.euclideanspace.aldor.editor.QuotedIds;
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
			case EditorPackage.ALWAYS_PART_ANY_STATEMENT:
				if(context == grammarAccess.getAlwaysPart_AnyStatementRule()) {
					sequence_AlwaysPart_AnyStatement(context, (AlwaysPart_AnyStatement) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.ALWAYS_PART_BAL_STATEMENT:
				if(context == grammarAccess.getAlwaysPart_BalStatementRule()) {
					sequence_AlwaysPart_BalStatement(context, (AlwaysPart_BalStatement) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.ARROW_TOK:
				if(context == grammarAccess.getNakedOpRule() ||
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
				else if(context == grammarAccess.getJright_AtomRule()) {
					sequence_Atom_Jleft_Atom_Jright_Atom(context, (Atom) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getLabeledRule()) {
					sequence_Atom_Labeled(context, (Atom) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.BINDING_LINFIXED_ANY_STATEMENT:
				if(context == grammarAccess.getAnyStatementRule()) {
					sequence_AnyStatement_BindingL_Infixed_AnyStatement_CommaItem(context, (BindingL_Infixed_AnyStatement) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getBindingL_Infixed_AnyStatementRule() ||
				   context == grammarAccess.getBinding_AnyStatementRule()) {
					sequence_BindingL_Infixed_AnyStatement(context, (BindingL_Infixed_AnyStatement) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getCommaItemRule()) {
					sequence_BindingL_Infixed_AnyStatement_CommaItem(context, (BindingL_Infixed_AnyStatement) semanticObject); 
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
			case EditorPackage.BRACKETED:
				if(context == grammarAccess.getBlockEnclosureRule() ||
				   context == grammarAccess.getBlockMoleculeRule() ||
				   context == grammarAccess.getBracketedRule() ||
				   context == grammarAccess.getEnclosureRule() ||
				   context == grammarAccess.getMoleculeRule()) {
					sequence_Bracketed(context, (Bracketed) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.BUT_EXPR:
				if(context == grammarAccess.getButExprRule()) {
					sequence_ButExpr(context, (ButExpr) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.CURLY_CONTENT_BLABELED:
				if(context == grammarAccess.getCurlyContentB_LabeledRule()) {
					sequence_CurlyContentB_Labeled(context, (CurlyContentB_Labeled) semanticObject); 
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
				   context == grammarAccess.getMacroBodyRule() ||
				   context == grammarAccess.getSigRule()) {
					sequence_CurlyContentsList_Labeled(context, (CurlyContentsList_Labeled) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.DECL_MOLECULE:
				if(context == grammarAccess.getDeclMoleculeRule()) {
					sequence_DeclMolecule(context, (DeclMolecule) semanticObject); 
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
			case EditorPackage.E12:
				if(context == grammarAccess.getE12Rule() ||
				   context == grammarAccess.getE12Access().getE12LeftAction_1_0()) {
					sequence_E12(context, (E12) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.E13:
				if(context == grammarAccess.getE13Rule() ||
				   context == grammarAccess.getE13Access().getE13LeftAction_1_0()) {
					sequence_E13(context, (E13) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.E14:
				if(context == grammarAccess.getE14Rule()) {
					sequence_E14(context, (E14) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.E3:
				if(context == grammarAccess.getBindingR_InfixedExprsDecl_AnyStatementRule() ||
				   context == grammarAccess.getDeclBindingRule() ||
				   context == grammarAccess.getMacroBodyRule() ||
				   context == grammarAccess.getSigRule()) {
					sequence_BindingR_InfixedExprsDecl_AnyStatement_E3_InfixedExprsDecl_enlister1_InfixedExpr_Comma(context, (E3) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getE3Rule() ||
				   context == grammarAccess.getE3Access().getE3LeftAction_1_0() ||
				   context == grammarAccess.getInfixedExprRule()) {
					sequence_E3(context, (E3) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getInfixedExprsDeclRule()) {
					sequence_E3_InfixedExprsDecl_enlister1_InfixedExpr_Comma(context, (E3) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getInfixedExprsRule() ||
				   context == grammarAccess.getEnlist1_InfixedExpr_Comma_ABRule() ||
				   context == grammarAccess.getEnlister1_InfixedExpr_CommaRule()) {
					sequence_E3_enlister1_InfixedExpr_Comma(context, (E3) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.E4:
				if(context == grammarAccess.getE4Rule() ||
				   context == grammarAccess.getE4Access().getE4LeftAction_1_0()) {
					sequence_E4(context, (E4) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.E5:
				if(context == grammarAccess.getE5Rule() ||
				   context == grammarAccess.getE5Access().getE5LeftAction_1_0()) {
					sequence_E5(context, (E5) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.E6:
				if(context == grammarAccess.getE6Rule() ||
				   context == grammarAccess.getE6Access().getE6LeftAction_1_0()) {
					sequence_E6(context, (E6) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.E7:
				if(context == grammarAccess.getE7Rule() ||
				   context == grammarAccess.getE7Access().getE7LeftAction_1_0()) {
					sequence_E7(context, (E7) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.E8:
				if(context == grammarAccess.getE8Rule() ||
				   context == grammarAccess.getE8Access().getE8LeftAction_1_0()) {
					sequence_E8(context, (E8) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.E9:
				if(context == grammarAccess.getE9Rule() ||
				   context == grammarAccess.getE9Access().getE9LeftAction_1_0()) {
					sequence_E9(context, (E9) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.EXPORT_DECL:
				if(context == grammarAccess.getExportDeclRule() ||
				   context == grammarAccess.getMacroBodyRule()) {
					sequence_ExportDecl(context, (ExportDecl) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.EXPR:
				if(context == grammarAccess.getBindingR_InfixedExprsDecl_AnyStatementRule() ||
				   context == grammarAccess.getDeclBindingRule() ||
				   context == grammarAccess.getMacroBodyRule() ||
				   context == grammarAccess.getSigRule()) {
					sequence_BindingR_InfixedExprsDecl_AnyStatement_E11_Op_E3_InfixedExpr_InfixedExprsDecl_enlister1_InfixedExpr_Comma(context, (Expr) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getDeclPartRule() ||
				   context == grammarAccess.getE11_E12Rule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_E11_E12(context, (Expr) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getInfixedExprRule()) {
					sequence_E11_Op_E3_InfixedExpr(context, (Expr) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getInfixedExprsDeclRule()) {
					sequence_E11_Op_E3_InfixedExpr_InfixedExprsDecl_enlister1_InfixedExpr_Comma(context, (Expr) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getInfixedExprsRule() ||
				   context == grammarAccess.getEnlist1_InfixedExpr_Comma_ABRule() ||
				   context == grammarAccess.getEnlister1_InfixedExpr_CommaRule()) {
					sequence_E11_Op_E3_InfixedExpr_enlister1_InfixedExpr_Comma(context, (Expr) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getE11_OpRule()) {
					sequence_E11_Op(context, (Expr) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getE3Rule() ||
				   context == grammarAccess.getE3Access().getE3LeftAction_1_0()) {
					sequence_E3(context, (Expr) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getE4Rule() ||
				   context == grammarAccess.getE4Access().getE4LeftAction_1_0()) {
					sequence_E4(context, (Expr) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getE5Rule() ||
				   context == grammarAccess.getE5Access().getE5LeftAction_1_0()) {
					sequence_E5(context, (Expr) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getE6Rule() ||
				   context == grammarAccess.getE6Access().getE6LeftAction_1_0()) {
					sequence_E6(context, (Expr) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getE7Rule() ||
				   context == grammarAccess.getE7Access().getE7LeftAction_1_0()) {
					sequence_E7(context, (Expr) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getE8Rule() ||
				   context == grammarAccess.getE8Access().getE8LeftAction_1_0()) {
					sequence_E8(context, (Expr) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getE9Rule() ||
				   context == grammarAccess.getE9Access().getE9LeftAction_1_0()) {
					sequence_E9(context, (Expr) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.FLOW_ANY_STATEMENT:
				if(context == grammarAccess.getAnyStatementRule() ||
				   context == grammarAccess.getFlow_AnyStatementRule()) {
					sequence_Flow_AnyStatement(context, (Flow_AnyStatement) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.FLOW_BAL_STATEMENT:
				if(context == grammarAccess.getBalStatementRule() ||
				   context == grammarAccess.getBindingL_Infixed_BalStatementRule() ||
				   context == grammarAccess.getBinding_BalStatementRule() ||
				   context == grammarAccess.getFlow_BalStatementRule()) {
					sequence_Flow_BalStatement(context, (Flow_BalStatement) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.GEN_BOUND:
				if(context == grammarAccess.getGenBoundRule()) {
					sequence_GenBound(context, (GenBound) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.ID:
				if(context == grammarAccess.getIdRule()) {
					sequence_Id(context, (Id) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.INFIXED:
				if(context == grammarAccess.getBalStatementRule() ||
				   context == grammarAccess.getBindingL_Infixed_BalStatementRule() ||
				   context == grammarAccess.getBinding_BalStatementRule() ||
				   context == grammarAccess.getFlow_BalStatementRule()) {
					sequence_Collection_Flow_BalStatement_Infixed(context, (Infixed) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getBindingL_Infixed_CollectionRule() ||
				   context == grammarAccess.getBinding_CollectionRule() ||
				   context == grammarAccess.getCasesRule() ||
				   context == grammarAccess.getCollectionRule()) {
					sequence_Collection_Infixed(context, (Infixed) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getForLhsRule() ||
				   context == grammarAccess.getInfixedRule() ||
				   context == grammarAccess.getSuchthatPartRule() ||
				   context == grammarAccess.getToPartRule()) {
					sequence_Infixed(context, (Infixed) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getIteratorRule()) {
					sequence_Infixed_Iterator(context, (Infixed) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getFromPartRule() ||
				   context == grammarAccess.getEnlist1_Infixed_Comma_ABRule() ||
				   context == grammarAccess.getEnlister1_Infixed_CommaRule()) {
					sequence_Infixed_enlister1_Infixed_Comma(context, (Infixed) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.ITERATOR:
				if(context == grammarAccess.getIteratorRule()) {
					sequence_Iterator(context, (Iterator) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.ITERATORS1:
				if(context == grammarAccess.getAnyStatementRule() ||
				   context == grammarAccess.getFlow_AnyStatementRule()) {
					sequence_Flow_AnyStatement_Iterators1(context, (Iterators1) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getBalStatementRule() ||
				   context == grammarAccess.getBindingL_Infixed_BalStatementRule() ||
				   context == grammarAccess.getBinding_BalStatementRule() ||
				   context == grammarAccess.getFlow_BalStatementRule()) {
					sequence_Flow_BalStatement_Iterators1(context, (Iterators1) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getIteratorsRule() ||
				   context == grammarAccess.getIterators1Rule()) {
					sequence_Iterators1(context, (Iterators1) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.JLEFT_ATOM:
				if(context == grammarAccess.getJleft_AtomRule()) {
					sequence_Jleft_Atom(context, (Jleft_Atom) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getJright_AtomRule()) {
					sequence_Jleft_Atom_Jright_Atom(context, (Jleft_Atom) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.JLEFT_MOLECULE:
				if(context == grammarAccess.getJleft_MoleculeRule() ||
				   context == grammarAccess.getLeftJuxtaposedRule()) {
					sequence_Jleft_Molecule(context, (Jleft_Molecule) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getApplicationRule() ||
				   context == grammarAccess.getE15Rule() ||
				   context == grammarAccess.getJright_MoleculeRule() ||
				   context == grammarAccess.getRightJuxtaposedRule()) {
					sequence_Jleft_Molecule_Jright_Molecule(context, (Jleft_Molecule) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getQualTailRule()) {
					sequence_Jleft_Molecule_QualTail(context, (Jleft_Molecule) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.JRIGHT_ATOM:
				if(context == grammarAccess.getJright_AtomRule()) {
					sequence_Jright_Atom(context, (Jright_Atom) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.JRIGHT_MOLECULE:
				if(context == grammarAccess.getApplicationRule() ||
				   context == grammarAccess.getE15Rule() ||
				   context == grammarAccess.getJright_MoleculeRule() ||
				   context == grammarAccess.getRightJuxtaposedRule()) {
					sequence_Jright_Molecule(context, (Jright_Molecule) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.LATTICE_TOK:
				if(context == grammarAccess.getNakedOpRule() ||
				   context == grammarAccess.getUnqualOp_LatticeTokRule()) {
					sequence_UnqualOp_LatticeTok(context, (LatticeTok) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.NAME:
				if(context == grammarAccess.getNameRule()) {
					sequence_Name(context, (Name) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.NAMES:
				if(context == grammarAccess.getNamesRule()) {
					sequence_Names(context, (Names) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.OP:
				if(context == grammarAccess.getOpRule()) {
					sequence_Op(context, (Op) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.OP_QUAL_TAIL:
				if(context == grammarAccess.getOpQualTailRule()) {
					sequence_OpQualTail(context, (OpQualTail) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.PARENED:
				if(context == grammarAccess.getBlockEnclosureRule() ||
				   context == grammarAccess.getBlockMoleculeRule() ||
				   context == grammarAccess.getEnclosureRule() ||
				   context == grammarAccess.getMoleculeRule() ||
				   context == grammarAccess.getParenedRule()) {
					sequence_Parened(context, (Parened) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.PLUS_TOK:
				if(context == grammarAccess.getNakedOpRule() ||
				   context == grammarAccess.getUnqualOp_PlusTokRule()) {
					sequence_UnqualOp_PlusTok(context, (PlusTok) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.POWER_TOK:
				if(context == grammarAccess.getNakedOpRule() ||
				   context == grammarAccess.getUnqualOp_PowerTokRule()) {
					sequence_UnqualOp_PowerTok(context, (PowerTok) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.QUAL_OP_ARROW_TOK:
				if(context == grammarAccess.getArrowOpRule() ||
				   context == grammarAccess.getQualOp_ArrowTokRule()) {
					sequence_QualOp_ArrowTok(context, (QualOp_ArrowTok) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.QUAL_OP_LATTICE_TOK:
				if(context == grammarAccess.getLatticeOpRule() ||
				   context == grammarAccess.getQualOp_LatticeTokRule()) {
					sequence_QualOp_LatticeTok(context, (QualOp_LatticeTok) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.QUAL_OP_PLUS_TOK:
				if(context == grammarAccess.getPlusOpRule() ||
				   context == grammarAccess.getQualOp_PlusTokRule()) {
					sequence_QualOp_PlusTok(context, (QualOp_PlusTok) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.QUAL_OP_POWER_TOK:
				if(context == grammarAccess.getPowerOpRule() ||
				   context == grammarAccess.getQualOp_PowerTokRule()) {
					sequence_QualOp_PowerTok(context, (QualOp_PowerTok) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.QUAL_OP_QUOTIENT_TOK:
				if(context == grammarAccess.getQualOp_QuotientTokRule() ||
				   context == grammarAccess.getQuotientOpRule()) {
					sequence_QualOp_QuotientTok(context, (QualOp_QuotientTok) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.QUAL_OP_RELATION_TOK:
				if(context == grammarAccess.getQualOp_RelationTokRule() ||
				   context == grammarAccess.getRelationOpRule()) {
					sequence_QualOp_RelationTok(context, (QualOp_RelationTok) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.QUAL_OP_SEG_TOK:
				if(context == grammarAccess.getQualOp_SegTokRule() ||
				   context == grammarAccess.getSegOpRule()) {
					sequence_QualOp_SegTok(context, (QualOp_SegTok) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.QUAL_OP_TIMES_TOK:
				if(context == grammarAccess.getQualOp_TimesTokRule() ||
				   context == grammarAccess.getTimesOpRule()) {
					sequence_QualOp_TimesTok(context, (QualOp_TimesTok) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.QUOTED_IDS:
				if(context == grammarAccess.getBlockEnclosureRule() ||
				   context == grammarAccess.getBlockMoleculeRule() ||
				   context == grammarAccess.getEnclosureRule() ||
				   context == grammarAccess.getMoleculeRule() ||
				   context == grammarAccess.getQuotedIdsRule()) {
					sequence_QuotedIds(context, (QuotedIds) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.QUOTIENT_TOK:
				if(context == grammarAccess.getNakedOpRule() ||
				   context == grammarAccess.getUnqualOp_QuotientTokRule()) {
					sequence_UnqualOp_QuotientTok(context, (QuotientTok) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.RELATION_TOK:
				if(context == grammarAccess.getNakedOpRule() ||
				   context == grammarAccess.getUnqualOp_RelationTokRule()) {
					sequence_UnqualOp_RelationTok(context, (RelationTok) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.SEG_TOK:
				if(context == grammarAccess.getNakedOpRule() ||
				   context == grammarAccess.getUnqualOp_SegTokRule()) {
					sequence_UnqualOp_SegTok(context, (SegTok) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.TIMES_TOK:
				if(context == grammarAccess.getNakedOpRule() ||
				   context == grammarAccess.getUnqualOp_TimesTokRule()) {
					sequence_UnqualOp_TimesTok(context, (TimesTok) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.ENLISTER1A_LABELED_SEMICOLON:
				if(context == grammarAccess.getExpressionRule() ||
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
	 *     ((bas7=Binding_AnyStatement | bas7=Binding_AnyStatement)?)
	 */
	protected void sequence_AlwaysPart_AnyStatement(EObject context, AlwaysPart_AnyStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((bas7=Binding_BalStatement | bas7=Binding_BalStatement)?)
	 */
	protected void sequence_AlwaysPart_BalStatement(EObject context, AlwaysPart_BalStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (bas9=AnyStatement ci+=CommaItem* bas=Binding_AnyStatement)
	 */
	protected void sequence_AnyStatement_BindingL_Infixed_AnyStatement_CommaItem(EObject context, BindingL_Infixed_AnyStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (iden=Id | lit=Literal)
	 */
	protected void sequence_Atom(EObject context, Atom semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((iden=Id | lit=Literal) bm4+=BlockMolecule*)
	 */
	protected void sequence_Atom_Jleft_Atom(EObject context, Atom semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((iden=Id | lit=Literal) bm4+=BlockMolecule* right2=Jright_Atom?)
	 */
	protected void sequence_Atom_Jleft_Atom_Jright_Atom(EObject context, Atom semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((iden=Id | lit=Literal) lab=Labeled?)
	 */
	protected void sequence_Atom_Labeled(EObject context, Atom semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     bas9=AnyStatement
	 */
	protected void sequence_BindingL_Infixed_AnyStatement(EObject context, BindingL_Infixed_AnyStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (bas9=AnyStatement ci+=CommaItem*)
	 */
	protected void sequence_BindingL_Infixed_AnyStatement_CommaItem(EObject context, BindingL_Infixed_AnyStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (bas9=AnyStatement ci+=CommaItem* ci+=CommaItem*)
	 */
	protected void sequence_BindingL_Infixed_AnyStatement_CommaItem_enlister1_CommaItem_Comma(EObject context, BindingL_Infixed_AnyStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (((left=Op ((op+=KW_2COLON | op+=KW_AT | op+='pretend') right+=E12)*) | left=E4) ie+=InfixedExpr* dp+=DeclPart* bas=Binding_AnyStatement?)
	 */
	protected void sequence_BindingR_InfixedExprsDecl_AnyStatement_E11_Op_E3_InfixedExpr_InfixedExprsDecl_enlister1_InfixedExpr_Comma(EObject context, Expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         left=E3_E3_1_0 
	 *         (op='and' | op='or' | op=LatticeTok) 
	 *         right=E4 
	 *         ie+=InfixedExpr* 
	 *         dp+=DeclPart* 
	 *         bas=Binding_AnyStatement?
	 *     )
	 */
	protected void sequence_BindingR_InfixedExprsDecl_AnyStatement_E3_InfixedExprsDecl_enlister1_InfixedExpr_Comma(EObject context, E3 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (op=KW_OBRACK e=Expression?)
	 */
	protected void sequence_Bracketed(EObject context, Bracketed semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((db=DeclBinding ca=Cases)?)
	 */
	protected void sequence_ButExpr(EObject context, ButExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (((ifx=InfixedExpr dp+=DeclPart*) | b=Block) i3=Iterators (st2='implies' bbs3=Binding_BalStatement)?)
	 */
	protected void sequence_Collection_Flow_BalStatement_Infixed(EObject context, Infixed semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (((ifx=InfixedExpr dp+=DeclPart*) | b=Block) i3=Iterators)
	 */
	protected void sequence_Collection_Infixed(EObject context, Infixed semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (pred=PreDocument l=Labeled pd=PostDocument)
	 */
	protected void sequence_CurlyContentB_Labeled(EObject context, CurlyContentB_Labeled semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EditorPackage.Literals.CURLY_CONTENT_BLABELED__PRED) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EditorPackage.Literals.CURLY_CONTENT_BLABELED__PRED));
			if(transientValues.isValueTransient(semanticObject, EditorPackage.Literals.CURLY_CONTENT_BLABELED__L) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EditorPackage.Literals.CURLY_CONTENT_BLABELED__L));
			if(transientValues.isValueTransient(semanticObject, EditorPackage.Literals.CURLY_CONTENT_BLABELED__PD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EditorPackage.Literals.CURLY_CONTENT_BLABELED__PD));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCurlyContentB_LabeledAccess().getPredPreDocumentParserRuleCall_0_0(), semanticObject.getPred());
		feeder.accept(grammarAccess.getCurlyContentB_LabeledAccess().getLLabeledParserRuleCall_1_0(), semanticObject.getL());
		feeder.accept(grammarAccess.getCurlyContentB_LabeledAccess().getPdPostDocumentParserRuleCall_2_0(), semanticObject.getPd());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (statemts+=CurlyContentB_Labeled statemts+=CurlyContentB_Labeled*)
	 */
	protected void sequence_CurlyContentsList_Labeled(EObject context, CurlyContentsList_Labeled semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (a=Application?)
	 */
	protected void sequence_DeclMolecule(EObject context, DeclMolecule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         mb=MacroBody | 
	 *         si=Sig | 
	 *         si=Sig | 
	 *         si=Sig | 
	 *         si=Sig | 
	 *         si=Sig | 
	 *         si=Sig | 
	 *         si=Sig | 
	 *         (si=Sig? fp=FromPart?) | 
	 *         (si=Sig? fp=FromPart?) | 
	 *         ed=ExportDecl
	 *     )
	 */
	protected void sequence_Declaration(EObject context, Declaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=E12 ((op+=KW_2COLON | op+=KW_AT | op+='pretend') right+=E12)*)
	 */
	protected void sequence_E11_E12(EObject context, Expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((left=Op ((op+=KW_2COLON | op+=KW_AT | op+='pretend') right+=E12)*) | left=E4)
	 */
	protected void sequence_E11_Op_E3_InfixedExpr(EObject context, Expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (((left=Op ((op+=KW_2COLON | op+=KW_AT | op+='pretend') right+=E12)*) | left=E4) ie+=InfixedExpr* dp+=DeclPart*)
	 */
	protected void sequence_E11_Op_E3_InfixedExpr_InfixedExprsDecl_enlister1_InfixedExpr_Comma(EObject context, Expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (((left=Op ((op+=KW_2COLON | op+=KW_AT | op+='pretend') right+=E12)*) | left=E4) ie+=InfixedExpr*)
	 */
	protected void sequence_E11_Op_E3_InfixedExpr_enlister1_InfixedExpr_Comma(EObject context, Expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Op ((op+=KW_2COLON | op+=KW_AT | op+='pretend') right+=E12)*)
	 */
	protected void sequence_E11_Op(EObject context, Expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((left=E12_E12_1_0 op+=ArrowOp right+=E13) | left=E13)
	 */
	protected void sequence_E12(EObject context, E12 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((left=E13_E13_1_0 op+=KW_DOLLAR right+=QualTail) | left=E14)
	 */
	protected void sequence_E13(EObject context, E13 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         e15left=E15 | 
	 *         (e15left=E15? op='with' dm=DeclMolecule) | 
	 *         (e15left=E15? op='add' dm=DeclMolecule) | 
	 *         (e15left=E15 op='except' e15right=E15) | 
	 *         (e15left=E15 op='throw' e15right=E15)
	 *     )
	 */
	protected void sequence_E14(EObject context, E14 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=E3_E3_1_0 (op='and' | op='or' | op=LatticeTok) right=E4)
	 */
	protected void sequence_E3(EObject context, E3 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     left=E4
	 */
	protected void sequence_E3(EObject context, Expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=E3_E3_1_0 (op='and' | op='or' | op=LatticeTok) right=E4 ie+=InfixedExpr* dp+=DeclPart*)
	 */
	protected void sequence_E3_InfixedExprsDecl_enlister1_InfixedExpr_Comma(EObject context, E3 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=E3_E3_1_0 (op='and' | op='or' | op=LatticeTok) right=E4 ie+=InfixedExpr*)
	 */
	protected void sequence_E3_enlister1_InfixedExpr_Comma(EObject context, E3 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=E4_E4_1_0 (op='has' | op=RelationTok) right=E5)
	 */
	protected void sequence_E4(EObject context, E4 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     left=E5
	 */
	protected void sequence_E4(EObject context, Expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=E5_E5_1_0 op=SegTok right=E6)
	 */
	protected void sequence_E5(EObject context, E5 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     left=E6
	 */
	protected void sequence_E5(EObject context, Expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=E6_E6_1_0 op=PlusTok right=E7)
	 */
	protected void sequence_E6(EObject context, E6 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     left=E7
	 */
	protected void sequence_E6(EObject context, Expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=E7_E7_1_0 op=QuotientTok right=E8)
	 */
	protected void sequence_E7(EObject context, E7 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     left=E8
	 */
	protected void sequence_E7(EObject context, Expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=E8_E8_1_0 op=TimesTok right=E9)
	 */
	protected void sequence_E8(EObject context, E8 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     left=E9
	 */
	protected void sequence_E8(EObject context, Expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=E9_E9_1_0 op=PowerTok right=E11_E12)
	 */
	protected void sequence_E9(EObject context, E9 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     left=E11_E12
	 */
	protected void sequence_E9(EObject context, Expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (s=Sig?)
	 */
	protected void sequence_ExportDecl(EObject context, ExportDecl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (c=Collection (st='implies' bas2=Binding_AnyStatement)?)
	 */
	protected void sequence_Flow_AnyStatement(EObject context, Flow_AnyStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (itr+=Iterator* bas3=Binding_AnyStatement)
	 */
	protected void sequence_Flow_AnyStatement_Iterators1(EObject context, Iterators1 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (st2='if' ci2=CommaItem bbs4+=Binding_BalStatement bbs4+=Binding_BalStatement) | 
	 *         (st2='repeat' bbs5=Binding_BalStatement) | 
	 *         (st2='try' bbs2=Binding_AnyStatement be=ButExpr apb=AlwaysPart_BalStatement) | 
	 *         (st2='select' bbs2=Binding_AnyStatement ca2=Cases) | 
	 *         (st2='do' bbs5=Binding_BalStatement) | 
	 *         (st2='delay' bbs5=Binding_BalStatement) | 
	 *         (st2='reference' bbs5=Binding_BalStatement) | 
	 *         (st2='generate' gb2=GenBound bbs5=Binding_BalStatement) | 
	 *         (st2='assert' bbs5=Binding_BalStatement) | 
	 *         (st2='iterate' n2=Name?) | 
	 *         (st2='break' n2=Name?) | 
	 *         (st2='return' c2=Collection?) | 
	 *         (st2='yield' bbs5=Binding_BalStatement) | 
	 *         (st2='except' bbs5=Binding_BalStatement) | 
	 *         (st2='throw' bbs5=Binding_BalStatement) | 
	 *         (st2='goto' i3=Id) | 
	 *         st2='never'
	 *     )
	 */
	protected void sequence_Flow_BalStatement(EObject context, Flow_BalStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (itr+=Iterator* st2='repeat' bbs3=Binding_BalStatement)
	 */
	protected void sequence_Flow_BalStatement_Iterators1(EObject context, Iterators1 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ci=CommaItem?)
	 */
	protected void sequence_GenBound(EObject context, GenBound semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=TK_ID | name=KW_SHARP | name=KW_TILDE)
	 */
	protected void sequence_Id(EObject context, Id semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((ifx=InfixedExpr dp+=DeclPart*) | b=Block)
	 */
	protected void sequence_Infixed(EObject context, Infixed semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (((ifx=InfixedExpr dp+=DeclPart*) | b=Block) i=Infixed sp=SuchthatPart?)
	 */
	protected void sequence_Infixed_Iterator(EObject context, Infixed semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (((ifx=InfixedExpr dp+=DeclPart*) | b=Block) i2+=Infixed*)
	 */
	protected void sequence_Infixed_enlister1_Infixed_Comma(EObject context, Infixed semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     i=Infixed
	 */
	protected void sequence_Iterator(EObject context, Iterator semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EditorPackage.Literals.ITERATOR__I) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EditorPackage.Literals.ITERATOR__I));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIteratorAccess().getIInfixedParserRuleCall_1_1_0(), semanticObject.getI());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (itr+=Iterator*)
	 */
	protected void sequence_Iterators1(EObject context, Iterators1 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (a=Atom be+=BlockEnclosure* n='not' be+=BlockEnclosure)
	 */
	protected void sequence_Jleft_Atom(EObject context, Jleft_Atom semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (a=Atom be+=BlockEnclosure* n='not' be+=BlockEnclosure right2=Jright_Atom?)
	 */
	protected void sequence_Jleft_Atom_Jright_Atom(EObject context, Jleft_Atom semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (be+=BlockEnclosure | (m=Molecule be+=BlockEnclosure*) | (m=Molecule bm+=BlockMolecule*))
	 */
	protected void sequence_Jleft_Molecule(EObject context, Jleft_Molecule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((be+=BlockEnclosure | (m=Molecule be+=BlockEnclosure*) | (m=Molecule bm+=BlockMolecule*)) right=Jright_Atom?)
	 */
	protected void sequence_Jleft_Molecule_Jright_Molecule(EObject context, Jleft_Molecule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((be+=BlockEnclosure | (m=Molecule be+=BlockEnclosure*) | (m=Molecule bm+=BlockMolecule*)) qt=QualTail?)
	 */
	protected void sequence_Jleft_Molecule_QualTail(EObject context, Jleft_Molecule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     right2=Jright_Atom
	 */
	protected void sequence_Jright_Atom(EObject context, Jright_Atom semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EditorPackage.Literals.JRIGHT_ATOM__RIGHT2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EditorPackage.Literals.JRIGHT_ATOM__RIGHT2));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getJright_AtomAccess().getRight2Jright_AtomParserRuleCall_1_1_0(), semanticObject.getRight2());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     right=Jright_Atom
	 */
	protected void sequence_Jright_Molecule(EObject context, Jright_Molecule semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EditorPackage.Literals.JRIGHT_MOLECULE__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EditorPackage.Literals.JRIGHT_MOLECULE__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getJright_MoleculeAccess().getRightJright_AtomParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (insert+=TK_STRING* cc=CurlyContents_Labeled)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=Id
	 */
	protected void sequence_Name(EObject context, Name semanticObject) {
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
	 *     nam=Molecule
	 */
	protected void sequence_OpQualTail(EObject context, OpQualTail semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EditorPackage.Literals.OP_QUAL_TAIL__NAM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EditorPackage.Literals.OP_QUAL_TAIL__NAM));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOpQualTailAccess().getNamMoleculeParserRuleCall_0_0(), semanticObject.getNam());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         aop=ArrowOp | 
	 *         aop=LatticeOp | 
	 *         aop=RelationOp | 
	 *         aop=SegOp | 
	 *         aop=PlusOp | 
	 *         aop=QuotientOp | 
	 *         aop=TimesOp | 
	 *         aop=PowerOp
	 *     )
	 */
	protected void sequence_Op(EObject context, Op semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (op=KW_OPAREN e=Expression?)
	 */
	protected void sequence_Parened(EObject context, Parened semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (oqt=OpQualTail?)
	 */
	protected void sequence_QualOp_ArrowTok(EObject context, QualOp_ArrowTok semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (oqt=OpQualTail?)
	 */
	protected void sequence_QualOp_LatticeTok(EObject context, QualOp_LatticeTok semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (oqt=OpQualTail?)
	 */
	protected void sequence_QualOp_PlusTok(EObject context, QualOp_PlusTok semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (oqt=OpQualTail?)
	 */
	protected void sequence_QualOp_PowerTok(EObject context, QualOp_PowerTok semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (oqt=OpQualTail?)
	 */
	protected void sequence_QualOp_QuotientTok(EObject context, QualOp_QuotientTok semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((op+=KW_DOLLAR oqt=OpQualTail)?)
	 */
	protected void sequence_QualOp_RelationTok(EObject context, QualOp_RelationTok semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (oqt=OpQualTail?)
	 */
	protected void sequence_QualOp_SegTok(EObject context, QualOp_SegTok semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (oqt=OpQualTail?)
	 */
	protected void sequence_QualOp_TimesTok(EObject context, QualOp_TimesTok semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (op=KW_QUOTE n=Names?)
	 */
	protected void sequence_QuotedIds(EObject context, QuotedIds semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
