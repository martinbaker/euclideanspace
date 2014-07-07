package com.euclideanspace.aldor.serializer;

import com.euclideanspace.aldor.editor.ArrowTok;
import com.euclideanspace.aldor.editor.Atom;
import com.euclideanspace.aldor.editor.BindingL_Infixed_AnyStatement;
import com.euclideanspace.aldor.editor.Bracketed;
import com.euclideanspace.aldor.editor.ButExpr;
import com.euclideanspace.aldor.editor.CurlyContentB_Labeled;
import com.euclideanspace.aldor.editor.CurlyContentsList_Labeled;
import com.euclideanspace.aldor.editor.DeclMolecule;
import com.euclideanspace.aldor.editor.Declaration;
import com.euclideanspace.aldor.editor.E11_E12;
import com.euclideanspace.aldor.editor.E11_Op;
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
import com.euclideanspace.aldor.editor.Flow_BalStatement;
import com.euclideanspace.aldor.editor.Id;
import com.euclideanspace.aldor.editor.Infixed;
import com.euclideanspace.aldor.editor.Iterator;
import com.euclideanspace.aldor.editor.Iterators1;
import com.euclideanspace.aldor.editor.Jleft_Molecule;
import com.euclideanspace.aldor.editor.Jright_Atom;
import com.euclideanspace.aldor.editor.LatticeTok;
import com.euclideanspace.aldor.editor.Model;
import com.euclideanspace.aldor.editor.Names;
import com.euclideanspace.aldor.editor.OpQualTail;
import com.euclideanspace.aldor.editor.Parened;
import com.euclideanspace.aldor.editor.PlusTok;
import com.euclideanspace.aldor.editor.PowerTok;
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
			case EditorPackage.ARROW_TOK:
				if(context == grammarAccess.getAlwaysPart_BalStatementRule() ||
				   context == grammarAccess.getAnyStatementRule() ||
				   context == grammarAccess.getBalStatementRule() ||
				   context == grammarAccess.getBindingL_Infixed_BalStatementRule() ||
				   context == grammarAccess.getBinding_BalStatementRule() ||
				   context == grammarAccess.getFlow_AnyStatementRule() ||
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
				else if(context == grammarAccess.getAlwaysPart_AnyStatementRule() ||
				   context == grammarAccess.getBindingL_Infixed_AnyStatementRule() ||
				   context == grammarAccess.getBinding_AnyStatementRule()) {
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
				else if(context == grammarAccess.getAlwaysPart_BalStatementRule() ||
				   context == grammarAccess.getBalStatementRule() ||
				   context == grammarAccess.getBindingL_Infixed_BalStatementRule() ||
				   context == grammarAccess.getBinding_BalStatementRule() ||
				   context == grammarAccess.getFlow_BalStatementRule()) {
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
			case EditorPackage.BRACKETED:
				if(context == grammarAccess.getJright_AtomRule()) {
					sequence_Jright_Atom(context, (Bracketed) semanticObject); 
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
				   context == grammarAccess.getDeclarationRule() ||
				   context == grammarAccess.getExportDeclRule() ||
				   context == grammarAccess.getJleft_AtomRule() ||
				   context == grammarAccess.getLabeledRule() ||
				   context == grammarAccess.getMacroBodyRule() ||
				   context == grammarAccess.getSigRule()) {
					sequence_CurlyContentsList_Labeled(context, (CurlyContentsList_Labeled) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getJright_AtomRule()) {
					sequence_CurlyContentsList_Labeled_Jright_Atom(context, (CurlyContentsList_Labeled) semanticObject); 
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
			case EditorPackage.E11_E12:
				if(context == grammarAccess.getDeclPartRule() ||
				   context == grammarAccess.getE11_E12Rule() ||
				   context == grammarAccess.getE11_E12Access().getE11_E12LeftAction_1_0() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_E11_E12(context, (E11_E12) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.E11_OP:
				if(context == grammarAccess.getE11_OpRule() ||
				   context == grammarAccess.getE11_OpAccess().getE11_OpLeftAction_1_0() ||
				   context == grammarAccess.getInfixedExprRule()) {
					sequence_E11_Op(context, (E11_Op) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getBindingR_InfixedExprsDecl_AnyStatementRule() ||
				   context == grammarAccess.getDeclBindingRule() ||
				   context == grammarAccess.getDeclarationRule() ||
				   context == grammarAccess.getExportDeclRule() ||
				   context == grammarAccess.getInfixedExprsDeclRule() ||
				   context == grammarAccess.getLabeledRule() ||
				   context == grammarAccess.getMacroBodyRule() ||
				   context == grammarAccess.getSigRule()) {
					sequence_E11_Op_InfixedExprsDecl_enlister1_InfixedExpr_Comma(context, (E11_Op) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getInfixedExprsRule() ||
				   context == grammarAccess.getEnlist1_InfixedExpr_Comma_ABRule() ||
				   context == grammarAccess.getEnlister1_InfixedExpr_CommaRule()) {
					sequence_E11_Op_enlister1_InfixedExpr_Comma(context, (E11_Op) semanticObject); 
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
				if(context == grammarAccess.getE3Rule() ||
				   context == grammarAccess.getE3Access().getE3LeftAction_1_0() ||
				   context == grammarAccess.getInfixedExprRule()) {
					sequence_E3(context, (E3) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getBindingR_InfixedExprsDecl_AnyStatementRule() ||
				   context == grammarAccess.getDeclBindingRule() ||
				   context == grammarAccess.getDeclarationRule() ||
				   context == grammarAccess.getExportDeclRule() ||
				   context == grammarAccess.getInfixedExprsDeclRule() ||
				   context == grammarAccess.getLabeledRule() ||
				   context == grammarAccess.getMacroBodyRule() ||
				   context == grammarAccess.getSigRule()) {
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
				   context == grammarAccess.getE4Access().getE4LeftAction_0_1_0()) {
					sequence_E4(context, (E4) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.E5:
				if(context == grammarAccess.getE5Rule() ||
				   context == grammarAccess.getE5Access().getE5LeftAction_0_0_1_0()) {
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
				if(context == grammarAccess.getDeclarationRule() ||
				   context == grammarAccess.getExportDeclRule() ||
				   context == grammarAccess.getLabeledRule() ||
				   context == grammarAccess.getMacroBodyRule()) {
					sequence_ExportDecl(context, (ExportDecl) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.EXPR:
				if(context == grammarAccess.getDeclPartRule() ||
				   context == grammarAccess.getE11_E12Rule() ||
				   context == grammarAccess.getE11_E12Access().getE11_E12LeftAction_1_0() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_E11_E12(context, (Expr) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getInfixedExprRule()) {
					sequence_E11_Op_E3_InfixedExpr(context, (Expr) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getBindingR_InfixedExprsDecl_AnyStatementRule() ||
				   context == grammarAccess.getDeclBindingRule() ||
				   context == grammarAccess.getDeclarationRule() ||
				   context == grammarAccess.getExportDeclRule() ||
				   context == grammarAccess.getInfixedExprsDeclRule() ||
				   context == grammarAccess.getLabeledRule() ||
				   context == grammarAccess.getMacroBodyRule() ||
				   context == grammarAccess.getSigRule()) {
					sequence_E11_Op_E3_InfixedExpr_InfixedExprsDecl_enlister1_InfixedExpr_Comma(context, (Expr) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getInfixedExprsRule() ||
				   context == grammarAccess.getEnlist1_InfixedExpr_Comma_ABRule() ||
				   context == grammarAccess.getEnlister1_InfixedExpr_CommaRule()) {
					sequence_E11_Op_E3_InfixedExpr_enlister1_InfixedExpr_Comma(context, (Expr) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getE11_OpRule() ||
				   context == grammarAccess.getE11_OpAccess().getE11_OpLeftAction_1_0()) {
					sequence_E11_Op(context, (Expr) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getE3Rule() ||
				   context == grammarAccess.getE3Access().getE3LeftAction_1_0()) {
					sequence_E3(context, (Expr) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getE4Access().getE4LeftAction_0_1_0()) {
					sequence_E4_E4_0_1_0(context, (Expr) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getE4Rule()) {
					sequence_E4(context, (Expr) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getE5Access().getE5LeftAction_0_0_1_0()) {
					sequence_E5_E5_0_0_1_0(context, (Expr) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getE5Rule()) {
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
			case EditorPackage.FLOW_BAL_STATEMENT:
				if(context == grammarAccess.getAlwaysPart_BalStatementRule() ||
				   context == grammarAccess.getBalStatementRule() ||
				   context == grammarAccess.getBindingL_Infixed_BalStatementRule() ||
				   context == grammarAccess.getBinding_BalStatementRule() ||
				   context == grammarAccess.getFlow_BalStatementRule()) {
					sequence_Flow_BalStatement(context, (Flow_BalStatement) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.ID:
				if(context == grammarAccess.getAlwaysPart_BalStatementRule() ||
				   context == grammarAccess.getAnyStatementRule() ||
				   context == grammarAccess.getBalStatementRule() ||
				   context == grammarAccess.getBindingL_Infixed_BalStatementRule() ||
				   context == grammarAccess.getBinding_BalStatementRule() ||
				   context == grammarAccess.getFlow_AnyStatementRule() ||
				   context == grammarAccess.getFlow_BalStatementRule() ||
				   context == grammarAccess.getIdRule() ||
				   context == grammarAccess.getNameRule()) {
					sequence_Id(context, (Id) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.INFIXED:
				if(context == grammarAccess.getAnyStatementRule()) {
					sequence_AnyStatement_BindingL_Infixed_AnyStatement_CommaItem_Infixed(context, (Infixed) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getCommaItemRule() ||
				   context == grammarAccess.getGenBoundRule()) {
					sequence_BindingL_Infixed_AnyStatement_CommaItem_Infixed(context, (Infixed) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getCommaRule() ||
				   context == grammarAccess.getLabeledRule() ||
				   context == grammarAccess.getEnlist1_CommaItem_Comma_ABRule() ||
				   context == grammarAccess.getEnlister1_CommaItem_CommaRule()) {
					sequence_BindingL_Infixed_AnyStatement_CommaItem_Infixed_enlister1_CommaItem_Comma(context, (Infixed) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getAlwaysPart_AnyStatementRule() ||
				   context == grammarAccess.getBindingL_Infixed_AnyStatementRule() ||
				   context == grammarAccess.getBinding_AnyStatementRule()) {
					sequence_BindingL_Infixed_AnyStatement_Infixed(context, (Infixed) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getFlow_AnyStatementRule()) {
					sequence_Collection_Flow_AnyStatement_Infixed(context, (Infixed) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getAlwaysPart_BalStatementRule() ||
				   context == grammarAccess.getBalStatementRule() ||
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
				else if(context == grammarAccess.getAlwaysPart_BalStatementRule() ||
				   context == grammarAccess.getBalStatementRule() ||
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
			case EditorPackage.JLEFT_MOLECULE:
				if(context == grammarAccess.getJleft_MoleculeRule() ||
				   context == grammarAccess.getLeftJuxtaposedRule() ||
				   context == grammarAccess.getQualTailRule()) {
					sequence_Jleft_Molecule(context, (Jleft_Molecule) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.JRIGHT_ATOM:
				if(context == grammarAccess.getJright_AtomRule()) {
					sequence_Jright_Atom(context, (Jright_Atom) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.LATTICE_TOK:
				if(context == grammarAccess.getAlwaysPart_BalStatementRule() ||
				   context == grammarAccess.getAnyStatementRule() ||
				   context == grammarAccess.getBalStatementRule() ||
				   context == grammarAccess.getBindingL_Infixed_BalStatementRule() ||
				   context == grammarAccess.getBinding_BalStatementRule() ||
				   context == grammarAccess.getFlow_AnyStatementRule() ||
				   context == grammarAccess.getFlow_BalStatementRule() ||
				   context == grammarAccess.getNakedOpRule() ||
				   context == grammarAccess.getNameRule() ||
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
			case EditorPackage.NAMES:
				if(context == grammarAccess.getJright_AtomRule()) {
					sequence_Jright_Atom_Names(context, (Names) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getBlockEnclosureRule() ||
				   context == grammarAccess.getBlockMoleculeRule() ||
				   context == grammarAccess.getEnclosureRule() ||
				   context == grammarAccess.getJleft_AtomRule() ||
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
				   context == grammarAccess.getQualOp_SegTokRule() ||
				   context == grammarAccess.getQualOp_TimesTokRule() ||
				   context == grammarAccess.getQuotientOpRule() ||
				   context == grammarAccess.getSegOpRule() ||
				   context == grammarAccess.getTimesOpRule()) {
					sequence_OpQualTail(context, (OpQualTail) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.PARENED:
				if(context == grammarAccess.getJright_AtomRule()) {
					sequence_Jright_Atom(context, (Parened) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.PLUS_TOK:
				if(context == grammarAccess.getAlwaysPart_BalStatementRule() ||
				   context == grammarAccess.getAnyStatementRule() ||
				   context == grammarAccess.getBalStatementRule() ||
				   context == grammarAccess.getBindingL_Infixed_BalStatementRule() ||
				   context == grammarAccess.getBinding_BalStatementRule() ||
				   context == grammarAccess.getFlow_AnyStatementRule() ||
				   context == grammarAccess.getFlow_BalStatementRule() ||
				   context == grammarAccess.getNakedOpRule() ||
				   context == grammarAccess.getNameRule() ||
				   context == grammarAccess.getUnqualOp_PlusTokRule()) {
					sequence_UnqualOp_PlusTok(context, (PlusTok) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.POWER_TOK:
				if(context == grammarAccess.getAlwaysPart_BalStatementRule() ||
				   context == grammarAccess.getAnyStatementRule() ||
				   context == grammarAccess.getBalStatementRule() ||
				   context == grammarAccess.getBindingL_Infixed_BalStatementRule() ||
				   context == grammarAccess.getBinding_BalStatementRule() ||
				   context == grammarAccess.getFlow_AnyStatementRule() ||
				   context == grammarAccess.getFlow_BalStatementRule() ||
				   context == grammarAccess.getNakedOpRule() ||
				   context == grammarAccess.getNameRule() ||
				   context == grammarAccess.getUnqualOp_PowerTokRule()) {
					sequence_UnqualOp_PowerTok(context, (PowerTok) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.QUOTED_IDS:
				if(context == grammarAccess.getJright_AtomRule()) {
					sequence_Jright_Atom(context, (QuotedIds) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.QUOTIENT_TOK:
				if(context == grammarAccess.getAlwaysPart_BalStatementRule() ||
				   context == grammarAccess.getAnyStatementRule() ||
				   context == grammarAccess.getBalStatementRule() ||
				   context == grammarAccess.getBindingL_Infixed_BalStatementRule() ||
				   context == grammarAccess.getBinding_BalStatementRule() ||
				   context == grammarAccess.getFlow_AnyStatementRule() ||
				   context == grammarAccess.getFlow_BalStatementRule() ||
				   context == grammarAccess.getNakedOpRule() ||
				   context == grammarAccess.getNameRule() ||
				   context == grammarAccess.getUnqualOp_QuotientTokRule()) {
					sequence_UnqualOp_QuotientTok(context, (QuotientTok) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.RELATION_TOK:
				if(context == grammarAccess.getAlwaysPart_BalStatementRule() ||
				   context == grammarAccess.getAnyStatementRule() ||
				   context == grammarAccess.getBalStatementRule() ||
				   context == grammarAccess.getBindingL_Infixed_BalStatementRule() ||
				   context == grammarAccess.getBinding_BalStatementRule() ||
				   context == grammarAccess.getFlow_AnyStatementRule() ||
				   context == grammarAccess.getFlow_BalStatementRule() ||
				   context == grammarAccess.getNakedOpRule() ||
				   context == grammarAccess.getNameRule() ||
				   context == grammarAccess.getUnqualOp_RelationTokRule()) {
					sequence_UnqualOp_RelationTok(context, (RelationTok) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.SEG_TOK:
				if(context == grammarAccess.getAlwaysPart_BalStatementRule() ||
				   context == grammarAccess.getAnyStatementRule() ||
				   context == grammarAccess.getBalStatementRule() ||
				   context == grammarAccess.getBindingL_Infixed_BalStatementRule() ||
				   context == grammarAccess.getBinding_BalStatementRule() ||
				   context == grammarAccess.getFlow_AnyStatementRule() ||
				   context == grammarAccess.getFlow_BalStatementRule() ||
				   context == grammarAccess.getNakedOpRule() ||
				   context == grammarAccess.getNameRule() ||
				   context == grammarAccess.getUnqualOp_SegTokRule()) {
					sequence_UnqualOp_SegTok(context, (SegTok) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.TIMES_TOK:
				if(context == grammarAccess.getAlwaysPart_BalStatementRule() ||
				   context == grammarAccess.getAnyStatementRule() ||
				   context == grammarAccess.getBalStatementRule() ||
				   context == grammarAccess.getBindingL_Infixed_BalStatementRule() ||
				   context == grammarAccess.getBinding_BalStatementRule() ||
				   context == grammarAccess.getFlow_AnyStatementRule() ||
				   context == grammarAccess.getFlow_BalStatementRule() ||
				   context == grammarAccess.getNakedOpRule() ||
				   context == grammarAccess.getNameRule() ||
				   context == grammarAccess.getUnqualOp_TimesTokRule()) {
					sequence_UnqualOp_TimesTok(context, (TimesTok) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.ENLISTER1A_LABELED_SEMICOLON:
				if(context == grammarAccess.getJright_AtomRule()) {
					sequence_Jright_Atom_enlister1a_Labeled_Semicolon(context, (enlister1a_Labeled_Semicolon) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getBlockEnclosureRule() ||
				   context == grammarAccess.getBlockMoleculeRule() ||
				   context == grammarAccess.getBracketedRule() ||
				   context == grammarAccess.getEnclosureRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getJleft_AtomRule() ||
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
	 *     (bas9=AnyStatement ci=CommaItem* bas=Binding_AnyStatement)
	 */
	protected void sequence_AnyStatement_BindingL_Infixed_AnyStatement_CommaItem(EObject context, BindingL_Infixed_AnyStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (((ifx=InfixedExpr dp+=DeclPart*) | b=Block) bia=BindingL_Infixed_AnyStatement ci=CommaItem* bas=Binding_AnyStatement)
	 */
	protected void sequence_AnyStatement_BindingL_Infixed_AnyStatement_CommaItem_Infixed(EObject context, Infixed semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     ((id=Id | lit=Literal) bm4+=BlockMolecule* right2=Jright_Atom?)
	 */
	protected void sequence_Atom_Jleft_Atom_Jright_Atom(EObject context, Atom semanticObject) {
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
	 *     bas9=AnyStatement
	 */
	protected void sequence_BindingL_Infixed_AnyStatement(EObject context, BindingL_Infixed_AnyStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (bas9=AnyStatement ci=CommaItem*)
	 */
	protected void sequence_BindingL_Infixed_AnyStatement_CommaItem(EObject context, BindingL_Infixed_AnyStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (bas9=AnyStatement ci=CommaItem* bbs=Binding_BalStatement bas=Binding_AnyStatement)
	 */
	protected void sequence_BindingL_Infixed_AnyStatement_CommaItem_Flow_AnyStatement(EObject context, BindingL_Infixed_AnyStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (bas9=AnyStatement ci=CommaItem* bbs=Binding_BalStatement bbs2=Binding_BalStatement)
	 */
	protected void sequence_BindingL_Infixed_AnyStatement_CommaItem_Flow_BalStatement(EObject context, BindingL_Infixed_AnyStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (((ifx=InfixedExpr dp+=DeclPart*) | b=Block) bia=BindingL_Infixed_AnyStatement ci=CommaItem*)
	 */
	protected void sequence_BindingL_Infixed_AnyStatement_CommaItem_Infixed(EObject context, Infixed semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (((ifx=InfixedExpr dp+=DeclPart*) | b=Block) bia=BindingL_Infixed_AnyStatement ci=CommaItem* ci=CommaItem*)
	 */
	protected void sequence_BindingL_Infixed_AnyStatement_CommaItem_Infixed_enlister1_CommaItem_Comma(EObject context, Infixed semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (bas9=AnyStatement ci=CommaItem* ci=CommaItem*)
	 */
	protected void sequence_BindingL_Infixed_AnyStatement_CommaItem_enlister1_CommaItem_Comma(EObject context, BindingL_Infixed_AnyStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (((ifx=InfixedExpr dp+=DeclPart*) | b=Block) bia=BindingL_Infixed_AnyStatement)
	 */
	protected void sequence_BindingL_Infixed_AnyStatement_Infixed(EObject context, Infixed semanticObject) {
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
	 *     (((ifx=InfixedExpr dp+=DeclPart*) | b=Block) i3=Iterators? bas2=Binding_AnyStatement?)
	 */
	protected void sequence_Collection_Flow_AnyStatement_Infixed(EObject context, Infixed semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (((ifx=InfixedExpr dp+=DeclPart*) | b=Block) i3=Iterators? bbs3=Binding_BalStatement?)
	 */
	protected void sequence_Collection_Flow_BalStatement_Infixed(EObject context, Infixed semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (((ifx=InfixedExpr dp+=DeclPart*) | b=Block) i3=Iterators?)
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
	 *     (statemts+=CurlyContentB_Labeled statemts+=CurlyContentB_Labeled* right2=Jright_Atom?)
	 */
	protected void sequence_CurlyContentsList_Labeled_Jright_Atom(EObject context, CurlyContentsList_Labeled semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (a=Application? | b=Block)
	 */
	protected void sequence_DeclMolecule(EObject context, DeclMolecule semanticObject) {
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
	 *     (left=E11_E12_E11_E12_1_0 (op+=KW_2COLON | op+=KW_AT | op+='pretend') right=E12)
	 */
	protected void sequence_E11_E12(EObject context, E11_E12 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     left=E12
	 */
	protected void sequence_E11_E12(EObject context, Expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=E11_Op_E11_Op_1_0 (op+=KW_2COLON | op+=KW_AT | op+='pretend') right=E12)
	 */
	protected void sequence_E11_Op(EObject context, E11_Op semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Op | left=E4)
	 */
	protected void sequence_E11_Op_E3_InfixedExpr(EObject context, Expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((left=Op | left=E4) ie=InfixedExpr* dp+=DeclPart*)
	 */
	protected void sequence_E11_Op_E3_InfixedExpr_InfixedExprsDecl_enlister1_InfixedExpr_Comma(EObject context, Expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((left=Op | left=E4) ie=InfixedExpr*)
	 */
	protected void sequence_E11_Op_E3_InfixedExpr_enlister1_InfixedExpr_Comma(EObject context, Expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     left=Op
	 */
	protected void sequence_E11_Op(EObject context, Expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=E11_Op_E11_Op_1_0 (op+=KW_2COLON | op+=KW_AT | op+='pretend') right=E12 ie=InfixedExpr* dp+=DeclPart*)
	 */
	protected void sequence_E11_Op_InfixedExprsDecl_enlister1_InfixedExpr_Comma(EObject context, E11_Op semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=E11_Op_E11_Op_1_0 (op+=KW_2COLON | op+=KW_AT | op+='pretend') right=E12 ie=InfixedExpr*)
	 */
	protected void sequence_E11_Op_enlister1_InfixedExpr_Comma(EObject context, E11_Op semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((left=E12_E12_1_0 op+=ArrowOp right=E13) | left=E13)
	 */
	protected void sequence_E12(EObject context, E12 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((left=E13_E13_1_0 op+=KW_DOLLAR right=QualTail) | left=E14)
	 */
	protected void sequence_E13(EObject context, E13 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (e15left=E15 | (e15left=E15? dm=DeclMolecule) | (e15left=E15? dm=DeclMolecule) | (e15left=E15 e15right=E15) | (e15left=E15 e15right=E15))
	 */
	protected void sequence_E14(EObject context, E14 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=E3_E3_1_0 (op+='and' | op+='or' | op2+=LatticeOp) right=E4)
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
	 *     (left=E3_E3_1_0 (op+='and' | op+='or' | op2+=LatticeOp) right=E4 ie=InfixedExpr* dp+=DeclPart*)
	 */
	protected void sequence_E3_InfixedExprsDecl_enlister1_InfixedExpr_Comma(EObject context, E3 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=E3_E3_1_0 (op+='and' | op+='or' | op2+=LatticeOp) right=E4 ie=InfixedExpr*)
	 */
	protected void sequence_E3_enlister1_InfixedExpr_Comma(EObject context, E3 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=E4_E4_0_1_0 (op+='has' | op2+=RelationOp) right=E5)
	 */
	protected void sequence_E4(EObject context, E4 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     left=E5
	 */
	protected void sequence_E4_E4_0_1_0(EObject context, Expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=E5 | right=E5)
	 */
	protected void sequence_E4(EObject context, Expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=E5_E5_0_0_1_0 op5+=SegOp right=E6)
	 */
	protected void sequence_E5(EObject context, E5 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     left=E6
	 */
	protected void sequence_E5_E5_0_0_1_0(EObject context, Expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=E6 | (left=E6 op5+=SegOp))
	 */
	protected void sequence_E5(EObject context, Expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=E6_E6_1_0 op6+=PlusOp right=E7)
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
	 *     (left=E7_E7_1_0 op7+=QuotientOp right=E8)
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
	 *     (left=E8_E8_1_0 op8+=TimesOp right=E9)
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
	 *     (left=E9_E9_1_0 op9+=PowerOp right=E11_E12)
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
	 *     (tp=ToPart | fp=FromPart)
	 */
	protected void sequence_ExportDecl(EObject context, ExportDecl semanticObject) {
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
	 *         bbs5=Binding_BalStatement | 
	 *         bbs5=Binding_BalStatement | 
	 *         bbs5=Binding_BalStatement | 
	 *         bbs5=Binding_BalStatement | 
	 *         bbs5=Binding_BalStatement | 
	 *         bbs5=Binding_BalStatement | 
	 *         bbs5=Binding_BalStatement | 
	 *         bbs5=Binding_BalStatement
	 *     )
	 */
	protected void sequence_Flow_BalStatement(EObject context, Flow_BalStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (itr+=Iterator* bbs4=Binding_BalStatement)
	 */
	protected void sequence_Flow_BalStatement_Iterators1(EObject context, Iterators1 semanticObject) {
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
	 *     (((ifx=InfixedExpr dp+=DeclPart*) | b=Block) i2=Infixed*)
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
	 *     (be=BlockEnclosure | (m=Molecule bm+=BlockMolecule*))
	 */
	protected void sequence_Jleft_Molecule(EObject context, Jleft_Molecule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     right2=Jright_Atom
	 */
	protected void sequence_Jright_Atom(EObject context, Bracketed semanticObject) {
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
	 *     (firstName=TK_ID subsequentNames+=TK_ID* right2=Jright_Atom?)
	 */
	protected void sequence_Jright_Atom_Names(EObject context, Names semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     right2=Jright_Atom
	 */
	protected void sequence_Jright_Atom(EObject context, Parened semanticObject) {
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
	 *     right2=Jright_Atom
	 */
	protected void sequence_Jright_Atom(EObject context, QuotedIds semanticObject) {
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
	 *     (statemnts+=Labeled statemnts+=Labeled right2=Jright_Atom?)
	 */
	protected void sequence_Jright_Atom_enlister1a_Labeled_Semicolon(EObject context, enlister1a_Labeled_Semicolon semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
