package com.euclideanspace.spad.serializer;

import com.euclideanspace.spad.editor.AddPart;
import com.euclideanspace.spad.editor.AddStatements;
import com.euclideanspace.spad.editor.AdditiveExpression;
import com.euclideanspace.spad.editor.AndExpression;
import com.euclideanspace.spad.editor.AssignExpression;
import com.euclideanspace.spad.editor.Block;
import com.euclideanspace.spad.editor.BooleanLiteral;
import com.euclideanspace.spad.editor.BreakStatement;
import com.euclideanspace.spad.editor.CaseExpression;
import com.euclideanspace.spad.editor.CategoryDef;
import com.euclideanspace.spad.editor.CharacterLiteral;
import com.euclideanspace.spad.editor.CoerceExpression;
import com.euclideanspace.spad.editor.ConditionExpression;
import com.euclideanspace.spad.editor.DivisionExpression;
import com.euclideanspace.spad.editor.DoStatement;
import com.euclideanspace.spad.editor.DomainDef;
import com.euclideanspace.spad.editor.EditorPackage;
import com.euclideanspace.spad.editor.EltExpression;
import com.euclideanspace.spad.editor.EqualityExpression;
import com.euclideanspace.spad.editor.ExplicitTypeExpression;
import com.euclideanspace.spad.editor.ExponentExpression;
import com.euclideanspace.spad.editor.Expr;
import com.euclideanspace.spad.editor.ExquoExpression;
import com.euclideanspace.spad.editor.ForStatement;
import com.euclideanspace.spad.editor.FreeVariable;
import com.euclideanspace.spad.editor.FunctionDefinition;
import com.euclideanspace.spad.editor.FunctionDefinitionBlock;
import com.euclideanspace.spad.editor.FunctionSignature;
import com.euclideanspace.spad.editor.HasExpression;
import com.euclideanspace.spad.editor.HintTypeExpression;
import com.euclideanspace.spad.editor.IfElseStatement;
import com.euclideanspace.spad.editor.IfStatement;
import com.euclideanspace.spad.editor.Import;
import com.euclideanspace.spad.editor.InnerProdExpression;
import com.euclideanspace.spad.editor.IsExpression;
import com.euclideanspace.spad.editor.IterateStatement;
import com.euclideanspace.spad.editor.ListLiteral;
import com.euclideanspace.spad.editor.Literal;
import com.euclideanspace.spad.editor.LocalVariable;
import com.euclideanspace.spad.editor.MacroDef;
import com.euclideanspace.spad.editor.MapDefinition;
import com.euclideanspace.spad.editor.ModExpression;
import com.euclideanspace.spad.editor.Model;
import com.euclideanspace.spad.editor.MultiplicativeExpression;
import com.euclideanspace.spad.editor.NameOrFunctionCall;
import com.euclideanspace.spad.editor.OuterProdExpression;
import com.euclideanspace.spad.editor.PackageDef;
import com.euclideanspace.spad.editor.PretendExpression;
import com.euclideanspace.spad.editor.PrimaryPrefix;
import com.euclideanspace.spad.editor.QuoExpression;
import com.euclideanspace.spad.editor.RelationalExpression;
import com.euclideanspace.spad.editor.RemExpression;
import com.euclideanspace.spad.editor.RepeatStatement;
import com.euclideanspace.spad.editor.ReturnStatement;
import com.euclideanspace.spad.editor.SegmentExpression;
import com.euclideanspace.spad.editor.Statement;
import com.euclideanspace.spad.editor.StatementExpression;
import com.euclideanspace.spad.editor.TupleDefinition;
import com.euclideanspace.spad.editor.TypeArguments;
import com.euclideanspace.spad.editor.TypeExpression;
import com.euclideanspace.spad.editor.TypeLiteral;
import com.euclideanspace.spad.editor.TypeNameOrFunctionCall;
import com.euclideanspace.spad.editor.TypeParameterList;
import com.euclideanspace.spad.editor.TypePrimaryExpression;
import com.euclideanspace.spad.editor.TypeResult;
import com.euclideanspace.spad.editor.TypeWithName;
import com.euclideanspace.spad.editor.UnaryExpression;
import com.euclideanspace.spad.editor.VariableDeclaration;
import com.euclideanspace.spad.editor.VariableDeclarationAssign;
import com.euclideanspace.spad.editor.VariableDeclarationBlock;
import com.euclideanspace.spad.editor.VariableTyped;
import com.euclideanspace.spad.editor.WherePart;
import com.euclideanspace.spad.editor.WhileStatement;
import com.euclideanspace.spad.editor.WithPart;
import com.euclideanspace.spad.services.EditorGrammarAccess;
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
			case EditorPackage.ADD_PART:
				if(context == grammarAccess.getAddPartRule()) {
					sequence_AddPart(context, (AddPart) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.ADD_STATEMENTS:
				if(context == grammarAccess.getAddStatementsRule()) {
					sequence_AddStatements(context, (AddStatements) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.ADDITIVE_EXPRESSION:
				if(context == grammarAccess.getAdditiveExpressionRule() ||
				   context == grammarAccess.getAdditiveExpressionAccess().getAdditiveExpressionLeftAction_1_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getInnerProdExpressionLeftAction_1_0() ||
				   context == grammarAccess.getCaseExpressionRule() ||
				   context == grammarAccess.getCaseExpressionAccess().getCaseExpressionLeftAction_1_0() ||
				   context == grammarAccess.getConditionExpressionRule() ||
				   context == grammarAccess.getConditionExpressionAccess().getConditionExpressionLeftAction_1_0() ||
				   context == grammarAccess.getEqualityExpressionRule() ||
				   context == grammarAccess.getEqualityExpressionAccess().getEqualityExpressionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getHasExpressionRule() ||
				   context == grammarAccess.getHasExpressionAccess().getHasExpressionLeftAction_1_0() ||
				   context == grammarAccess.getInnerProdExpressionRule() ||
				   context == grammarAccess.getInnerProdExpressionAccess().getInnerProdExpressionLeftAction_1_0() ||
				   context == grammarAccess.getIsExpressionRule() ||
				   context == grammarAccess.getIsExpressionAccess().getIsExpressionLeftAction_1_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getAndExpressionLeftAction_1_0() ||
				   context == grammarAccess.getOuterProdExpressionRule() ||
				   context == grammarAccess.getOuterProdExpressionAccess().getOuterProdExpressionLeftAction_1_0() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0() ||
				   context == grammarAccess.getSegmentExpressionRule() ||
				   context == grammarAccess.getSegmentExpressionAccess().getSegmentExpressionLeftAction_1_0()) {
					sequence_AdditiveExpression(context, (AdditiveExpression) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.AND_EXPRESSION:
				if(context == grammarAccess.getConditionExpressionRule() ||
				   context == grammarAccess.getConditionExpressionAccess().getConditionExpressionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getAndExpressionLeftAction_1_0()) {
					sequence_OrExpression(context, (AndExpression) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.ASSIGN_EXPRESSION:
				if(context == grammarAccess.getAdditiveExpressionRule() ||
				   context == grammarAccess.getAdditiveExpressionAccess().getAdditiveExpressionLeftAction_1_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getInnerProdExpressionLeftAction_1_0() ||
				   context == grammarAccess.getAssignExpressionRule() ||
				   context == grammarAccess.getAssignExpressionAccess().getAssignExpressionLeftAction_1_0() ||
				   context == grammarAccess.getCaseExpressionRule() ||
				   context == grammarAccess.getCaseExpressionAccess().getCaseExpressionLeftAction_1_0() ||
				   context == grammarAccess.getConditionExpressionRule() ||
				   context == grammarAccess.getConditionExpressionAccess().getConditionExpressionLeftAction_1_0() ||
				   context == grammarAccess.getDivisionExpressionRule() ||
				   context == grammarAccess.getDivisionExpressionAccess().getDivisionExpressionLeftAction_1_0() ||
				   context == grammarAccess.getEqualityExpressionRule() ||
				   context == grammarAccess.getEqualityExpressionAccess().getEqualityExpressionLeftAction_1_0() ||
				   context == grammarAccess.getExponentExpressionRule() ||
				   context == grammarAccess.getExponentExpressionAccess().getExponentExpressionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExquoExpressionRule() ||
				   context == grammarAccess.getExquoExpressionAccess().getExquoExpressionLeftAction_1_0() ||
				   context == grammarAccess.getHasExpressionRule() ||
				   context == grammarAccess.getHasExpressionAccess().getHasExpressionLeftAction_1_0() ||
				   context == grammarAccess.getInnerProdExpressionRule() ||
				   context == grammarAccess.getInnerProdExpressionAccess().getInnerProdExpressionLeftAction_1_0() ||
				   context == grammarAccess.getIsExpressionRule() ||
				   context == grammarAccess.getIsExpressionAccess().getIsExpressionLeftAction_1_0() ||
				   context == grammarAccess.getMapDefinitionRule() ||
				   context == grammarAccess.getMapDefinitionAccess().getMapDefinitionLeftAction_1_0() ||
				   context == grammarAccess.getModExpressionRule() ||
				   context == grammarAccess.getModExpressionAccess().getModExpressionLeftAction_1_0() ||
				   context == grammarAccess.getMultiplicativeExpressionRule() ||
				   context == grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExpressionLeftAction_1_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getAndExpressionLeftAction_1_0() ||
				   context == grammarAccess.getOuterProdExpressionRule() ||
				   context == grammarAccess.getOuterProdExpressionAccess().getOuterProdExpressionLeftAction_1_0() ||
				   context == grammarAccess.getQuoExpressionRule() ||
				   context == grammarAccess.getQuoExpressionAccess().getQuoExpressionLeftAction_1_0() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0() ||
				   context == grammarAccess.getRemExpressionRule() ||
				   context == grammarAccess.getRemExpressionAccess().getRemExpressionLeftAction_1_0() ||
				   context == grammarAccess.getSegmentExpressionRule() ||
				   context == grammarAccess.getSegmentExpressionAccess().getSegmentExpressionLeftAction_1_0()) {
					sequence_AssignExpression(context, (AssignExpression) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.BLOCK:
				if(context == grammarAccess.getBlockRule()) {
					sequence_Block(context, (Block) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.BOOLEAN_LITERAL:
				if(context == grammarAccess.getAdditiveExpressionRule() ||
				   context == grammarAccess.getAdditiveExpressionAccess().getAdditiveExpressionLeftAction_1_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getInnerProdExpressionLeftAction_1_0() ||
				   context == grammarAccess.getAssignExpressionRule() ||
				   context == grammarAccess.getAssignExpressionAccess().getAssignExpressionLeftAction_1_0() ||
				   context == grammarAccess.getBooleanLiteralRule() ||
				   context == grammarAccess.getCaseExpressionRule() ||
				   context == grammarAccess.getCaseExpressionAccess().getCaseExpressionLeftAction_1_0() ||
				   context == grammarAccess.getCoerceExpressionRule() ||
				   context == grammarAccess.getCoerceExpressionAccess().getCoerceExpressionLeftAction_1_0() ||
				   context == grammarAccess.getConditionExpressionRule() ||
				   context == grammarAccess.getConditionExpressionAccess().getConditionExpressionLeftAction_1_0() ||
				   context == grammarAccess.getDivisionExpressionRule() ||
				   context == grammarAccess.getDivisionExpressionAccess().getDivisionExpressionLeftAction_1_0() ||
				   context == grammarAccess.getEltExpressionRule() ||
				   context == grammarAccess.getEltExpressionAccess().getEltExpressionLeftAction_1_0() ||
				   context == grammarAccess.getEqualityExpressionRule() ||
				   context == grammarAccess.getEqualityExpressionAccess().getEqualityExpressionLeftAction_1_0() ||
				   context == grammarAccess.getExplicitTypeExpressionRule() ||
				   context == grammarAccess.getExplicitTypeExpressionAccess().getExplicitTypeExpressionLeftAction_1_0() ||
				   context == grammarAccess.getExponentExpressionRule() ||
				   context == grammarAccess.getExponentExpressionAccess().getExponentExpressionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExquoExpressionRule() ||
				   context == grammarAccess.getExquoExpressionAccess().getExquoExpressionLeftAction_1_0() ||
				   context == grammarAccess.getHasExpressionRule() ||
				   context == grammarAccess.getHasExpressionAccess().getHasExpressionLeftAction_1_0() ||
				   context == grammarAccess.getHintTypeExpressionRule() ||
				   context == grammarAccess.getHintTypeExpressionAccess().getHintTypeExpressionLeftAction_1_0() ||
				   context == grammarAccess.getInnerProdExpressionRule() ||
				   context == grammarAccess.getInnerProdExpressionAccess().getInnerProdExpressionLeftAction_1_0() ||
				   context == grammarAccess.getIsExpressionRule() ||
				   context == grammarAccess.getIsExpressionAccess().getIsExpressionLeftAction_1_0() ||
				   context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getMapDefinitionRule() ||
				   context == grammarAccess.getMapDefinitionAccess().getMapDefinitionLeftAction_1_0() ||
				   context == grammarAccess.getModExpressionRule() ||
				   context == grammarAccess.getModExpressionAccess().getModExpressionLeftAction_1_0() ||
				   context == grammarAccess.getMultiplicativeExpressionRule() ||
				   context == grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExpressionLeftAction_1_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getAndExpressionLeftAction_1_0() ||
				   context == grammarAccess.getOuterProdExpressionRule() ||
				   context == grammarAccess.getOuterProdExpressionAccess().getOuterProdExpressionLeftAction_1_0() ||
				   context == grammarAccess.getPretendExpressionRule() ||
				   context == grammarAccess.getPretendExpressionAccess().getPretendExpressionLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getPrimaryPrefixRule() ||
				   context == grammarAccess.getQuoExpressionRule() ||
				   context == grammarAccess.getQuoExpressionAccess().getQuoExpressionLeftAction_1_0() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0() ||
				   context == grammarAccess.getRemExpressionRule() ||
				   context == grammarAccess.getRemExpressionAccess().getRemExpressionLeftAction_1_0() ||
				   context == grammarAccess.getSegmentExpressionRule() ||
				   context == grammarAccess.getSegmentExpressionAccess().getSegmentExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUnaryExpressionRule()) {
					sequence_BooleanLiteral(context, (BooleanLiteral) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.BREAK_STATEMENT:
				if(context == grammarAccess.getBreakStatementRule()) {
					sequence_BreakStatement(context, (BreakStatement) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.CASE_EXPRESSION:
				if(context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getInnerProdExpressionLeftAction_1_0() ||
				   context == grammarAccess.getCaseExpressionRule() ||
				   context == grammarAccess.getConditionExpressionRule() ||
				   context == grammarAccess.getConditionExpressionAccess().getConditionExpressionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getHasExpressionRule() ||
				   context == grammarAccess.getHasExpressionAccess().getHasExpressionLeftAction_1_0() ||
				   context == grammarAccess.getInnerProdExpressionRule() ||
				   context == grammarAccess.getInnerProdExpressionAccess().getInnerProdExpressionLeftAction_1_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getAndExpressionLeftAction_1_0() ||
				   context == grammarAccess.getOuterProdExpressionRule() ||
				   context == grammarAccess.getOuterProdExpressionAccess().getOuterProdExpressionLeftAction_1_0()) {
					sequence_CaseExpression(context, (CaseExpression) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.CATEGORY_DEF:
				if(context == grammarAccess.getCategoryDefRule()) {
					sequence_CategoryDef(context, (CategoryDef) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.CHARACTER_LITERAL:
				if(context == grammarAccess.getAdditiveExpressionRule() ||
				   context == grammarAccess.getAdditiveExpressionAccess().getAdditiveExpressionLeftAction_1_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getInnerProdExpressionLeftAction_1_0() ||
				   context == grammarAccess.getAssignExpressionRule() ||
				   context == grammarAccess.getAssignExpressionAccess().getAssignExpressionLeftAction_1_0() ||
				   context == grammarAccess.getCaseExpressionRule() ||
				   context == grammarAccess.getCaseExpressionAccess().getCaseExpressionLeftAction_1_0() ||
				   context == grammarAccess.getCharacterLiteralRule() ||
				   context == grammarAccess.getCoerceExpressionRule() ||
				   context == grammarAccess.getCoerceExpressionAccess().getCoerceExpressionLeftAction_1_0() ||
				   context == grammarAccess.getConditionExpressionRule() ||
				   context == grammarAccess.getConditionExpressionAccess().getConditionExpressionLeftAction_1_0() ||
				   context == grammarAccess.getDivisionExpressionRule() ||
				   context == grammarAccess.getDivisionExpressionAccess().getDivisionExpressionLeftAction_1_0() ||
				   context == grammarAccess.getEltExpressionRule() ||
				   context == grammarAccess.getEltExpressionAccess().getEltExpressionLeftAction_1_0() ||
				   context == grammarAccess.getEqualityExpressionRule() ||
				   context == grammarAccess.getEqualityExpressionAccess().getEqualityExpressionLeftAction_1_0() ||
				   context == grammarAccess.getExplicitTypeExpressionRule() ||
				   context == grammarAccess.getExplicitTypeExpressionAccess().getExplicitTypeExpressionLeftAction_1_0() ||
				   context == grammarAccess.getExponentExpressionRule() ||
				   context == grammarAccess.getExponentExpressionAccess().getExponentExpressionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExquoExpressionRule() ||
				   context == grammarAccess.getExquoExpressionAccess().getExquoExpressionLeftAction_1_0() ||
				   context == grammarAccess.getHasExpressionRule() ||
				   context == grammarAccess.getHasExpressionAccess().getHasExpressionLeftAction_1_0() ||
				   context == grammarAccess.getHintTypeExpressionRule() ||
				   context == grammarAccess.getHintTypeExpressionAccess().getHintTypeExpressionLeftAction_1_0() ||
				   context == grammarAccess.getInnerProdExpressionRule() ||
				   context == grammarAccess.getInnerProdExpressionAccess().getInnerProdExpressionLeftAction_1_0() ||
				   context == grammarAccess.getIsExpressionRule() ||
				   context == grammarAccess.getIsExpressionAccess().getIsExpressionLeftAction_1_0() ||
				   context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getMapDefinitionRule() ||
				   context == grammarAccess.getMapDefinitionAccess().getMapDefinitionLeftAction_1_0() ||
				   context == grammarAccess.getModExpressionRule() ||
				   context == grammarAccess.getModExpressionAccess().getModExpressionLeftAction_1_0() ||
				   context == grammarAccess.getMultiplicativeExpressionRule() ||
				   context == grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExpressionLeftAction_1_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getAndExpressionLeftAction_1_0() ||
				   context == grammarAccess.getOuterProdExpressionRule() ||
				   context == grammarAccess.getOuterProdExpressionAccess().getOuterProdExpressionLeftAction_1_0() ||
				   context == grammarAccess.getPretendExpressionRule() ||
				   context == grammarAccess.getPretendExpressionAccess().getPretendExpressionLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getPrimaryPrefixRule() ||
				   context == grammarAccess.getQuoExpressionRule() ||
				   context == grammarAccess.getQuoExpressionAccess().getQuoExpressionLeftAction_1_0() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0() ||
				   context == grammarAccess.getRemExpressionRule() ||
				   context == grammarAccess.getRemExpressionAccess().getRemExpressionLeftAction_1_0() ||
				   context == grammarAccess.getSegmentExpressionRule() ||
				   context == grammarAccess.getSegmentExpressionAccess().getSegmentExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUnaryExpressionRule()) {
					sequence_CharacterLiteral(context, (CharacterLiteral) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.COERCE_EXPRESSION:
				if(context == grammarAccess.getAdditiveExpressionRule() ||
				   context == grammarAccess.getAdditiveExpressionAccess().getAdditiveExpressionLeftAction_1_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getInnerProdExpressionLeftAction_1_0() ||
				   context == grammarAccess.getAssignExpressionRule() ||
				   context == grammarAccess.getAssignExpressionAccess().getAssignExpressionLeftAction_1_0() ||
				   context == grammarAccess.getCaseExpressionRule() ||
				   context == grammarAccess.getCaseExpressionAccess().getCaseExpressionLeftAction_1_0() ||
				   context == grammarAccess.getCoerceExpressionRule() ||
				   context == grammarAccess.getCoerceExpressionAccess().getCoerceExpressionLeftAction_1_0() ||
				   context == grammarAccess.getConditionExpressionRule() ||
				   context == grammarAccess.getConditionExpressionAccess().getConditionExpressionLeftAction_1_0() ||
				   context == grammarAccess.getDivisionExpressionRule() ||
				   context == grammarAccess.getDivisionExpressionAccess().getDivisionExpressionLeftAction_1_0() ||
				   context == grammarAccess.getEqualityExpressionRule() ||
				   context == grammarAccess.getEqualityExpressionAccess().getEqualityExpressionLeftAction_1_0() ||
				   context == grammarAccess.getExponentExpressionRule() ||
				   context == grammarAccess.getExponentExpressionAccess().getExponentExpressionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExquoExpressionRule() ||
				   context == grammarAccess.getExquoExpressionAccess().getExquoExpressionLeftAction_1_0() ||
				   context == grammarAccess.getHasExpressionRule() ||
				   context == grammarAccess.getHasExpressionAccess().getHasExpressionLeftAction_1_0() ||
				   context == grammarAccess.getInnerProdExpressionRule() ||
				   context == grammarAccess.getInnerProdExpressionAccess().getInnerProdExpressionLeftAction_1_0() ||
				   context == grammarAccess.getIsExpressionRule() ||
				   context == grammarAccess.getIsExpressionAccess().getIsExpressionLeftAction_1_0() ||
				   context == grammarAccess.getMapDefinitionRule() ||
				   context == grammarAccess.getMapDefinitionAccess().getMapDefinitionLeftAction_1_0() ||
				   context == grammarAccess.getModExpressionRule() ||
				   context == grammarAccess.getModExpressionAccess().getModExpressionLeftAction_1_0() ||
				   context == grammarAccess.getMultiplicativeExpressionRule() ||
				   context == grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExpressionLeftAction_1_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getAndExpressionLeftAction_1_0() ||
				   context == grammarAccess.getOuterProdExpressionRule() ||
				   context == grammarAccess.getOuterProdExpressionAccess().getOuterProdExpressionLeftAction_1_0() ||
				   context == grammarAccess.getPretendExpressionRule() ||
				   context == grammarAccess.getPretendExpressionAccess().getPretendExpressionLeftAction_1_0() ||
				   context == grammarAccess.getQuoExpressionRule() ||
				   context == grammarAccess.getQuoExpressionAccess().getQuoExpressionLeftAction_1_0() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0() ||
				   context == grammarAccess.getRemExpressionRule() ||
				   context == grammarAccess.getRemExpressionAccess().getRemExpressionLeftAction_1_0() ||
				   context == grammarAccess.getSegmentExpressionRule() ||
				   context == grammarAccess.getSegmentExpressionAccess().getSegmentExpressionLeftAction_1_0()) {
					sequence_CoerceExpression(context, (CoerceExpression) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.CONDITION_EXPRESSION:
				if(context == grammarAccess.getConditionExpressionRule() ||
				   context == grammarAccess.getConditionExpressionAccess().getConditionExpressionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule()) {
					sequence_ConditionExpression(context, (ConditionExpression) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.DIVISION_EXPRESSION:
				if(context == grammarAccess.getAdditiveExpressionRule() ||
				   context == grammarAccess.getAdditiveExpressionAccess().getAdditiveExpressionLeftAction_1_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getInnerProdExpressionLeftAction_1_0() ||
				   context == grammarAccess.getCaseExpressionRule() ||
				   context == grammarAccess.getCaseExpressionAccess().getCaseExpressionLeftAction_1_0() ||
				   context == grammarAccess.getConditionExpressionRule() ||
				   context == grammarAccess.getConditionExpressionAccess().getConditionExpressionLeftAction_1_0() ||
				   context == grammarAccess.getDivisionExpressionRule() ||
				   context == grammarAccess.getDivisionExpressionAccess().getDivisionExpressionLeftAction_1_0() ||
				   context == grammarAccess.getEqualityExpressionRule() ||
				   context == grammarAccess.getEqualityExpressionAccess().getEqualityExpressionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExquoExpressionRule() ||
				   context == grammarAccess.getExquoExpressionAccess().getExquoExpressionLeftAction_1_0() ||
				   context == grammarAccess.getHasExpressionRule() ||
				   context == grammarAccess.getHasExpressionAccess().getHasExpressionLeftAction_1_0() ||
				   context == grammarAccess.getInnerProdExpressionRule() ||
				   context == grammarAccess.getInnerProdExpressionAccess().getInnerProdExpressionLeftAction_1_0() ||
				   context == grammarAccess.getIsExpressionRule() ||
				   context == grammarAccess.getIsExpressionAccess().getIsExpressionLeftAction_1_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getAndExpressionLeftAction_1_0() ||
				   context == grammarAccess.getOuterProdExpressionRule() ||
				   context == grammarAccess.getOuterProdExpressionAccess().getOuterProdExpressionLeftAction_1_0() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0() ||
				   context == grammarAccess.getSegmentExpressionRule() ||
				   context == grammarAccess.getSegmentExpressionAccess().getSegmentExpressionLeftAction_1_0()) {
					sequence_DivisionExpression(context, (DivisionExpression) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.DO_STATEMENT:
				if(context == grammarAccess.getDoStatementRule()) {
					sequence_DoStatement(context, (DoStatement) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.DOMAIN_DEF:
				if(context == grammarAccess.getDomainDefRule()) {
					sequence_DomainDef(context, (DomainDef) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.ELT_EXPRESSION:
				if(context == grammarAccess.getAdditiveExpressionRule() ||
				   context == grammarAccess.getAdditiveExpressionAccess().getAdditiveExpressionLeftAction_1_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getInnerProdExpressionLeftAction_1_0() ||
				   context == grammarAccess.getAssignExpressionRule() ||
				   context == grammarAccess.getAssignExpressionAccess().getAssignExpressionLeftAction_1_0() ||
				   context == grammarAccess.getCaseExpressionRule() ||
				   context == grammarAccess.getCaseExpressionAccess().getCaseExpressionLeftAction_1_0() ||
				   context == grammarAccess.getCoerceExpressionRule() ||
				   context == grammarAccess.getCoerceExpressionAccess().getCoerceExpressionLeftAction_1_0() ||
				   context == grammarAccess.getConditionExpressionRule() ||
				   context == grammarAccess.getConditionExpressionAccess().getConditionExpressionLeftAction_1_0() ||
				   context == grammarAccess.getDivisionExpressionRule() ||
				   context == grammarAccess.getDivisionExpressionAccess().getDivisionExpressionLeftAction_1_0() ||
				   context == grammarAccess.getEltExpressionRule() ||
				   context == grammarAccess.getEltExpressionAccess().getEltExpressionLeftAction_1_0() ||
				   context == grammarAccess.getEqualityExpressionRule() ||
				   context == grammarAccess.getEqualityExpressionAccess().getEqualityExpressionLeftAction_1_0() ||
				   context == grammarAccess.getExponentExpressionRule() ||
				   context == grammarAccess.getExponentExpressionAccess().getExponentExpressionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExquoExpressionRule() ||
				   context == grammarAccess.getExquoExpressionAccess().getExquoExpressionLeftAction_1_0() ||
				   context == grammarAccess.getHasExpressionRule() ||
				   context == grammarAccess.getHasExpressionAccess().getHasExpressionLeftAction_1_0() ||
				   context == grammarAccess.getHintTypeExpressionRule() ||
				   context == grammarAccess.getHintTypeExpressionAccess().getHintTypeExpressionLeftAction_1_0() ||
				   context == grammarAccess.getInnerProdExpressionRule() ||
				   context == grammarAccess.getInnerProdExpressionAccess().getInnerProdExpressionLeftAction_1_0() ||
				   context == grammarAccess.getIsExpressionRule() ||
				   context == grammarAccess.getIsExpressionAccess().getIsExpressionLeftAction_1_0() ||
				   context == grammarAccess.getMapDefinitionRule() ||
				   context == grammarAccess.getMapDefinitionAccess().getMapDefinitionLeftAction_1_0() ||
				   context == grammarAccess.getModExpressionRule() ||
				   context == grammarAccess.getModExpressionAccess().getModExpressionLeftAction_1_0() ||
				   context == grammarAccess.getMultiplicativeExpressionRule() ||
				   context == grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExpressionLeftAction_1_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getAndExpressionLeftAction_1_0() ||
				   context == grammarAccess.getOuterProdExpressionRule() ||
				   context == grammarAccess.getOuterProdExpressionAccess().getOuterProdExpressionLeftAction_1_0() ||
				   context == grammarAccess.getPretendExpressionRule() ||
				   context == grammarAccess.getPretendExpressionAccess().getPretendExpressionLeftAction_1_0() ||
				   context == grammarAccess.getQuoExpressionRule() ||
				   context == grammarAccess.getQuoExpressionAccess().getQuoExpressionLeftAction_1_0() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0() ||
				   context == grammarAccess.getRemExpressionRule() ||
				   context == grammarAccess.getRemExpressionAccess().getRemExpressionLeftAction_1_0() ||
				   context == grammarAccess.getSegmentExpressionRule() ||
				   context == grammarAccess.getSegmentExpressionAccess().getSegmentExpressionLeftAction_1_0()) {
					sequence_EltExpression(context, (EltExpression) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.EQUALITY_EXPRESSION:
				if(context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getInnerProdExpressionLeftAction_1_0() ||
				   context == grammarAccess.getCaseExpressionRule() ||
				   context == grammarAccess.getCaseExpressionAccess().getCaseExpressionLeftAction_1_0() ||
				   context == grammarAccess.getConditionExpressionRule() ||
				   context == grammarAccess.getConditionExpressionAccess().getConditionExpressionLeftAction_1_0() ||
				   context == grammarAccess.getEqualityExpressionRule() ||
				   context == grammarAccess.getEqualityExpressionAccess().getEqualityExpressionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getHasExpressionRule() ||
				   context == grammarAccess.getHasExpressionAccess().getHasExpressionLeftAction_1_0() ||
				   context == grammarAccess.getInnerProdExpressionRule() ||
				   context == grammarAccess.getInnerProdExpressionAccess().getInnerProdExpressionLeftAction_1_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getAndExpressionLeftAction_1_0() ||
				   context == grammarAccess.getOuterProdExpressionRule() ||
				   context == grammarAccess.getOuterProdExpressionAccess().getOuterProdExpressionLeftAction_1_0()) {
					sequence_EqualityExpression(context, (EqualityExpression) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.EXPLICIT_TYPE_EXPRESSION:
				if(context == grammarAccess.getAdditiveExpressionRule() ||
				   context == grammarAccess.getAdditiveExpressionAccess().getAdditiveExpressionLeftAction_1_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getInnerProdExpressionLeftAction_1_0() ||
				   context == grammarAccess.getAssignExpressionRule() ||
				   context == grammarAccess.getAssignExpressionAccess().getAssignExpressionLeftAction_1_0() ||
				   context == grammarAccess.getCaseExpressionRule() ||
				   context == grammarAccess.getCaseExpressionAccess().getCaseExpressionLeftAction_1_0() ||
				   context == grammarAccess.getCoerceExpressionRule() ||
				   context == grammarAccess.getCoerceExpressionAccess().getCoerceExpressionLeftAction_1_0() ||
				   context == grammarAccess.getConditionExpressionRule() ||
				   context == grammarAccess.getConditionExpressionAccess().getConditionExpressionLeftAction_1_0() ||
				   context == grammarAccess.getDivisionExpressionRule() ||
				   context == grammarAccess.getDivisionExpressionAccess().getDivisionExpressionLeftAction_1_0() ||
				   context == grammarAccess.getEltExpressionRule() ||
				   context == grammarAccess.getEltExpressionAccess().getEltExpressionLeftAction_1_0() ||
				   context == grammarAccess.getEqualityExpressionRule() ||
				   context == grammarAccess.getEqualityExpressionAccess().getEqualityExpressionLeftAction_1_0() ||
				   context == grammarAccess.getExplicitTypeExpressionRule() ||
				   context == grammarAccess.getExponentExpressionRule() ||
				   context == grammarAccess.getExponentExpressionAccess().getExponentExpressionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExquoExpressionRule() ||
				   context == grammarAccess.getExquoExpressionAccess().getExquoExpressionLeftAction_1_0() ||
				   context == grammarAccess.getHasExpressionRule() ||
				   context == grammarAccess.getHasExpressionAccess().getHasExpressionLeftAction_1_0() ||
				   context == grammarAccess.getHintTypeExpressionRule() ||
				   context == grammarAccess.getHintTypeExpressionAccess().getHintTypeExpressionLeftAction_1_0() ||
				   context == grammarAccess.getInnerProdExpressionRule() ||
				   context == grammarAccess.getInnerProdExpressionAccess().getInnerProdExpressionLeftAction_1_0() ||
				   context == grammarAccess.getIsExpressionRule() ||
				   context == grammarAccess.getIsExpressionAccess().getIsExpressionLeftAction_1_0() ||
				   context == grammarAccess.getMapDefinitionRule() ||
				   context == grammarAccess.getMapDefinitionAccess().getMapDefinitionLeftAction_1_0() ||
				   context == grammarAccess.getModExpressionRule() ||
				   context == grammarAccess.getModExpressionAccess().getModExpressionLeftAction_1_0() ||
				   context == grammarAccess.getMultiplicativeExpressionRule() ||
				   context == grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExpressionLeftAction_1_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getAndExpressionLeftAction_1_0() ||
				   context == grammarAccess.getOuterProdExpressionRule() ||
				   context == grammarAccess.getOuterProdExpressionAccess().getOuterProdExpressionLeftAction_1_0() ||
				   context == grammarAccess.getPretendExpressionRule() ||
				   context == grammarAccess.getPretendExpressionAccess().getPretendExpressionLeftAction_1_0() ||
				   context == grammarAccess.getQuoExpressionRule() ||
				   context == grammarAccess.getQuoExpressionAccess().getQuoExpressionLeftAction_1_0() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0() ||
				   context == grammarAccess.getRemExpressionRule() ||
				   context == grammarAccess.getRemExpressionAccess().getRemExpressionLeftAction_1_0() ||
				   context == grammarAccess.getSegmentExpressionRule() ||
				   context == grammarAccess.getSegmentExpressionAccess().getSegmentExpressionLeftAction_1_0()) {
					sequence_ExplicitTypeExpression(context, (ExplicitTypeExpression) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.EXPONENT_EXPRESSION:
				if(context == grammarAccess.getAdditiveExpressionRule() ||
				   context == grammarAccess.getAdditiveExpressionAccess().getAdditiveExpressionLeftAction_1_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getInnerProdExpressionLeftAction_1_0() ||
				   context == grammarAccess.getCaseExpressionRule() ||
				   context == grammarAccess.getCaseExpressionAccess().getCaseExpressionLeftAction_1_0() ||
				   context == grammarAccess.getConditionExpressionRule() ||
				   context == grammarAccess.getConditionExpressionAccess().getConditionExpressionLeftAction_1_0() ||
				   context == grammarAccess.getDivisionExpressionRule() ||
				   context == grammarAccess.getDivisionExpressionAccess().getDivisionExpressionLeftAction_1_0() ||
				   context == grammarAccess.getEqualityExpressionRule() ||
				   context == grammarAccess.getEqualityExpressionAccess().getEqualityExpressionLeftAction_1_0() ||
				   context == grammarAccess.getExponentExpressionRule() ||
				   context == grammarAccess.getExponentExpressionAccess().getExponentExpressionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExquoExpressionRule() ||
				   context == grammarAccess.getExquoExpressionAccess().getExquoExpressionLeftAction_1_0() ||
				   context == grammarAccess.getHasExpressionRule() ||
				   context == grammarAccess.getHasExpressionAccess().getHasExpressionLeftAction_1_0() ||
				   context == grammarAccess.getInnerProdExpressionRule() ||
				   context == grammarAccess.getInnerProdExpressionAccess().getInnerProdExpressionLeftAction_1_0() ||
				   context == grammarAccess.getIsExpressionRule() ||
				   context == grammarAccess.getIsExpressionAccess().getIsExpressionLeftAction_1_0() ||
				   context == grammarAccess.getModExpressionRule() ||
				   context == grammarAccess.getModExpressionAccess().getModExpressionLeftAction_1_0() ||
				   context == grammarAccess.getMultiplicativeExpressionRule() ||
				   context == grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExpressionLeftAction_1_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getAndExpressionLeftAction_1_0() ||
				   context == grammarAccess.getOuterProdExpressionRule() ||
				   context == grammarAccess.getOuterProdExpressionAccess().getOuterProdExpressionLeftAction_1_0() ||
				   context == grammarAccess.getQuoExpressionRule() ||
				   context == grammarAccess.getQuoExpressionAccess().getQuoExpressionLeftAction_1_0() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0() ||
				   context == grammarAccess.getRemExpressionRule() ||
				   context == grammarAccess.getRemExpressionAccess().getRemExpressionLeftAction_1_0() ||
				   context == grammarAccess.getSegmentExpressionRule() ||
				   context == grammarAccess.getSegmentExpressionAccess().getSegmentExpressionLeftAction_1_0()) {
					sequence_ExponentExpression(context, (ExponentExpression) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.EXPR:
				if(context == grammarAccess.getAdditiveExpressionRule() ||
				   context == grammarAccess.getAdditiveExpressionAccess().getAdditiveExpressionLeftAction_1_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getInnerProdExpressionLeftAction_1_0() ||
				   context == grammarAccess.getAssignExpressionRule() ||
				   context == grammarAccess.getAssignExpressionAccess().getAssignExpressionLeftAction_1_0() ||
				   context == grammarAccess.getCaseExpressionRule() ||
				   context == grammarAccess.getCaseExpressionAccess().getCaseExpressionLeftAction_1_0() ||
				   context == grammarAccess.getCoerceExpressionRule() ||
				   context == grammarAccess.getCoerceExpressionAccess().getCoerceExpressionLeftAction_1_0() ||
				   context == grammarAccess.getConditionExpressionRule() ||
				   context == grammarAccess.getConditionExpressionAccess().getConditionExpressionLeftAction_1_0() ||
				   context == grammarAccess.getDivisionExpressionRule() ||
				   context == grammarAccess.getDivisionExpressionAccess().getDivisionExpressionLeftAction_1_0() ||
				   context == grammarAccess.getEltExpressionRule() ||
				   context == grammarAccess.getEltExpressionAccess().getEltExpressionLeftAction_1_0() ||
				   context == grammarAccess.getEqualityExpressionRule() ||
				   context == grammarAccess.getEqualityExpressionAccess().getEqualityExpressionLeftAction_1_0() ||
				   context == grammarAccess.getExplicitTypeExpressionRule() ||
				   context == grammarAccess.getExplicitTypeExpressionAccess().getExplicitTypeExpressionLeftAction_1_0() ||
				   context == grammarAccess.getExponentExpressionRule() ||
				   context == grammarAccess.getExponentExpressionAccess().getExponentExpressionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExquoExpressionRule() ||
				   context == grammarAccess.getExquoExpressionAccess().getExquoExpressionLeftAction_1_0() ||
				   context == grammarAccess.getHasExpressionRule() ||
				   context == grammarAccess.getHasExpressionAccess().getHasExpressionLeftAction_1_0() ||
				   context == grammarAccess.getHintTypeExpressionRule() ||
				   context == grammarAccess.getHintTypeExpressionAccess().getHintTypeExpressionLeftAction_1_0() ||
				   context == grammarAccess.getInnerProdExpressionRule() ||
				   context == grammarAccess.getInnerProdExpressionAccess().getInnerProdExpressionLeftAction_1_0() ||
				   context == grammarAccess.getIsExpressionRule() ||
				   context == grammarAccess.getIsExpressionAccess().getIsExpressionLeftAction_1_0() ||
				   context == grammarAccess.getMapDefinitionRule() ||
				   context == grammarAccess.getMapDefinitionAccess().getMapDefinitionLeftAction_1_0() ||
				   context == grammarAccess.getModExpressionRule() ||
				   context == grammarAccess.getModExpressionAccess().getModExpressionLeftAction_1_0() ||
				   context == grammarAccess.getMultiplicativeExpressionRule() ||
				   context == grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExpressionLeftAction_1_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getAndExpressionLeftAction_1_0() ||
				   context == grammarAccess.getOuterProdExpressionRule() ||
				   context == grammarAccess.getOuterProdExpressionAccess().getOuterProdExpressionLeftAction_1_0() ||
				   context == grammarAccess.getPretendExpressionRule() ||
				   context == grammarAccess.getPretendExpressionAccess().getPretendExpressionLeftAction_1_0() ||
				   context == grammarAccess.getQuoExpressionRule() ||
				   context == grammarAccess.getQuoExpressionAccess().getQuoExpressionLeftAction_1_0() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0() ||
				   context == grammarAccess.getRemExpressionRule() ||
				   context == grammarAccess.getRemExpressionAccess().getRemExpressionLeftAction_1_0() ||
				   context == grammarAccess.getSegmentExpressionRule() ||
				   context == grammarAccess.getSegmentExpressionAccess().getSegmentExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUnaryExpressionRule()) {
					sequence_UnaryExpression(context, (Expr) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.EXQUO_EXPRESSION:
				if(context == grammarAccess.getAdditiveExpressionRule() ||
				   context == grammarAccess.getAdditiveExpressionAccess().getAdditiveExpressionLeftAction_1_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getInnerProdExpressionLeftAction_1_0() ||
				   context == grammarAccess.getCaseExpressionRule() ||
				   context == grammarAccess.getCaseExpressionAccess().getCaseExpressionLeftAction_1_0() ||
				   context == grammarAccess.getConditionExpressionRule() ||
				   context == grammarAccess.getConditionExpressionAccess().getConditionExpressionLeftAction_1_0() ||
				   context == grammarAccess.getEqualityExpressionRule() ||
				   context == grammarAccess.getEqualityExpressionAccess().getEqualityExpressionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExquoExpressionRule() ||
				   context == grammarAccess.getExquoExpressionAccess().getExquoExpressionLeftAction_1_0() ||
				   context == grammarAccess.getHasExpressionRule() ||
				   context == grammarAccess.getHasExpressionAccess().getHasExpressionLeftAction_1_0() ||
				   context == grammarAccess.getInnerProdExpressionRule() ||
				   context == grammarAccess.getInnerProdExpressionAccess().getInnerProdExpressionLeftAction_1_0() ||
				   context == grammarAccess.getIsExpressionRule() ||
				   context == grammarAccess.getIsExpressionAccess().getIsExpressionLeftAction_1_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getAndExpressionLeftAction_1_0() ||
				   context == grammarAccess.getOuterProdExpressionRule() ||
				   context == grammarAccess.getOuterProdExpressionAccess().getOuterProdExpressionLeftAction_1_0() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0() ||
				   context == grammarAccess.getSegmentExpressionRule() ||
				   context == grammarAccess.getSegmentExpressionAccess().getSegmentExpressionLeftAction_1_0()) {
					sequence_ExquoExpression(context, (ExquoExpression) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.FOR_STATEMENT:
				if(context == grammarAccess.getForStatementRule()) {
					sequence_ForStatement(context, (ForStatement) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.FREE_VARIABLE:
				if(context == grammarAccess.getFreeVariableRule()) {
					sequence_FreeVariable(context, (FreeVariable) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.FUNCTION_DEFINITION:
				if(context == grammarAccess.getAddStatementsRule() ||
				   context == grammarAccess.getFunctionDefinitionRule()) {
					sequence_FunctionDefinition(context, (FunctionDefinition) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.FUNCTION_DEFINITION_BLOCK:
				if(context == grammarAccess.getFunctionDefinitionBlockRule()) {
					sequence_FunctionDefinitionBlock(context, (FunctionDefinitionBlock) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.FUNCTION_SIGNATURE:
				if(context == grammarAccess.getFunctionSignatureRule()) {
					sequence_FunctionSignature(context, (FunctionSignature) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.HAS_EXPRESSION:
				if(context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getInnerProdExpressionLeftAction_1_0() ||
				   context == grammarAccess.getConditionExpressionRule() ||
				   context == grammarAccess.getConditionExpressionAccess().getConditionExpressionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getHasExpressionRule() ||
				   context == grammarAccess.getHasExpressionAccess().getHasExpressionLeftAction_1_0() ||
				   context == grammarAccess.getInnerProdExpressionRule() ||
				   context == grammarAccess.getInnerProdExpressionAccess().getInnerProdExpressionLeftAction_1_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getAndExpressionLeftAction_1_0() ||
				   context == grammarAccess.getOuterProdExpressionRule() ||
				   context == grammarAccess.getOuterProdExpressionAccess().getOuterProdExpressionLeftAction_1_0()) {
					sequence_HasExpression(context, (HasExpression) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.HINT_TYPE_EXPRESSION:
				if(context == grammarAccess.getAdditiveExpressionRule() ||
				   context == grammarAccess.getAdditiveExpressionAccess().getAdditiveExpressionLeftAction_1_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getInnerProdExpressionLeftAction_1_0() ||
				   context == grammarAccess.getAssignExpressionRule() ||
				   context == grammarAccess.getAssignExpressionAccess().getAssignExpressionLeftAction_1_0() ||
				   context == grammarAccess.getCaseExpressionRule() ||
				   context == grammarAccess.getCaseExpressionAccess().getCaseExpressionLeftAction_1_0() ||
				   context == grammarAccess.getCoerceExpressionRule() ||
				   context == grammarAccess.getCoerceExpressionAccess().getCoerceExpressionLeftAction_1_0() ||
				   context == grammarAccess.getConditionExpressionRule() ||
				   context == grammarAccess.getConditionExpressionAccess().getConditionExpressionLeftAction_1_0() ||
				   context == grammarAccess.getDivisionExpressionRule() ||
				   context == grammarAccess.getDivisionExpressionAccess().getDivisionExpressionLeftAction_1_0() ||
				   context == grammarAccess.getEqualityExpressionRule() ||
				   context == grammarAccess.getEqualityExpressionAccess().getEqualityExpressionLeftAction_1_0() ||
				   context == grammarAccess.getExponentExpressionRule() ||
				   context == grammarAccess.getExponentExpressionAccess().getExponentExpressionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExquoExpressionRule() ||
				   context == grammarAccess.getExquoExpressionAccess().getExquoExpressionLeftAction_1_0() ||
				   context == grammarAccess.getHasExpressionRule() ||
				   context == grammarAccess.getHasExpressionAccess().getHasExpressionLeftAction_1_0() ||
				   context == grammarAccess.getHintTypeExpressionRule() ||
				   context == grammarAccess.getInnerProdExpressionRule() ||
				   context == grammarAccess.getInnerProdExpressionAccess().getInnerProdExpressionLeftAction_1_0() ||
				   context == grammarAccess.getIsExpressionRule() ||
				   context == grammarAccess.getIsExpressionAccess().getIsExpressionLeftAction_1_0() ||
				   context == grammarAccess.getMapDefinitionRule() ||
				   context == grammarAccess.getMapDefinitionAccess().getMapDefinitionLeftAction_1_0() ||
				   context == grammarAccess.getModExpressionRule() ||
				   context == grammarAccess.getModExpressionAccess().getModExpressionLeftAction_1_0() ||
				   context == grammarAccess.getMultiplicativeExpressionRule() ||
				   context == grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExpressionLeftAction_1_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getAndExpressionLeftAction_1_0() ||
				   context == grammarAccess.getOuterProdExpressionRule() ||
				   context == grammarAccess.getOuterProdExpressionAccess().getOuterProdExpressionLeftAction_1_0() ||
				   context == grammarAccess.getPretendExpressionRule() ||
				   context == grammarAccess.getPretendExpressionAccess().getPretendExpressionLeftAction_1_0() ||
				   context == grammarAccess.getQuoExpressionRule() ||
				   context == grammarAccess.getQuoExpressionAccess().getQuoExpressionLeftAction_1_0() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0() ||
				   context == grammarAccess.getRemExpressionRule() ||
				   context == grammarAccess.getRemExpressionAccess().getRemExpressionLeftAction_1_0() ||
				   context == grammarAccess.getSegmentExpressionRule() ||
				   context == grammarAccess.getSegmentExpressionAccess().getSegmentExpressionLeftAction_1_0()) {
					sequence_HintTypeExpression(context, (HintTypeExpression) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.IF_ELSE_STATEMENT:
				if(context == grammarAccess.getIfElseStatementRule()) {
					sequence_IfElseStatement(context, (IfElseStatement) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.IF_STATEMENT:
				if(context == grammarAccess.getIfStatementRule()) {
					sequence_IfStatement(context, (IfStatement) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.IMPORT:
				if(context == grammarAccess.getAddStatementsRule() ||
				   context == grammarAccess.getImportRule() ||
				   context == grammarAccess.getWhereAssignmentsRule()) {
					sequence_Import(context, (Import) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.INNER_PROD_EXPRESSION:
				if(context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getInnerProdExpressionLeftAction_1_0() ||
				   context == grammarAccess.getConditionExpressionRule() ||
				   context == grammarAccess.getConditionExpressionAccess().getConditionExpressionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getAndExpressionLeftAction_1_0()) {
					sequence_AndExpression_InnerProdExpression(context, (InnerProdExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getInnerProdExpressionRule() ||
				   context == grammarAccess.getInnerProdExpressionAccess().getInnerProdExpressionLeftAction_1_0()) {
					sequence_InnerProdExpression(context, (InnerProdExpression) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.IS_EXPRESSION:
				if(context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getInnerProdExpressionLeftAction_1_0() ||
				   context == grammarAccess.getCaseExpressionRule() ||
				   context == grammarAccess.getCaseExpressionAccess().getCaseExpressionLeftAction_1_0() ||
				   context == grammarAccess.getConditionExpressionRule() ||
				   context == grammarAccess.getConditionExpressionAccess().getConditionExpressionLeftAction_1_0() ||
				   context == grammarAccess.getEqualityExpressionRule() ||
				   context == grammarAccess.getEqualityExpressionAccess().getEqualityExpressionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getHasExpressionRule() ||
				   context == grammarAccess.getHasExpressionAccess().getHasExpressionLeftAction_1_0() ||
				   context == grammarAccess.getInnerProdExpressionRule() ||
				   context == grammarAccess.getInnerProdExpressionAccess().getInnerProdExpressionLeftAction_1_0() ||
				   context == grammarAccess.getIsExpressionRule() ||
				   context == grammarAccess.getIsExpressionAccess().getIsExpressionLeftAction_1_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getAndExpressionLeftAction_1_0() ||
				   context == grammarAccess.getOuterProdExpressionRule() ||
				   context == grammarAccess.getOuterProdExpressionAccess().getOuterProdExpressionLeftAction_1_0() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0()) {
					sequence_IsExpression(context, (IsExpression) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.ITERATE_STATEMENT:
				if(context == grammarAccess.getIterateStatementRule()) {
					sequence_IterateStatement(context, (IterateStatement) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.LIST_LITERAL:
				if(context == grammarAccess.getAdditiveExpressionRule() ||
				   context == grammarAccess.getAdditiveExpressionAccess().getAdditiveExpressionLeftAction_1_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getInnerProdExpressionLeftAction_1_0() ||
				   context == grammarAccess.getAssignExpressionRule() ||
				   context == grammarAccess.getAssignExpressionAccess().getAssignExpressionLeftAction_1_0() ||
				   context == grammarAccess.getCaseExpressionRule() ||
				   context == grammarAccess.getCaseExpressionAccess().getCaseExpressionLeftAction_1_0() ||
				   context == grammarAccess.getCoerceExpressionRule() ||
				   context == grammarAccess.getCoerceExpressionAccess().getCoerceExpressionLeftAction_1_0() ||
				   context == grammarAccess.getConditionExpressionRule() ||
				   context == grammarAccess.getConditionExpressionAccess().getConditionExpressionLeftAction_1_0() ||
				   context == grammarAccess.getDivisionExpressionRule() ||
				   context == grammarAccess.getDivisionExpressionAccess().getDivisionExpressionLeftAction_1_0() ||
				   context == grammarAccess.getEltExpressionRule() ||
				   context == grammarAccess.getEltExpressionAccess().getEltExpressionLeftAction_1_0() ||
				   context == grammarAccess.getEqualityExpressionRule() ||
				   context == grammarAccess.getEqualityExpressionAccess().getEqualityExpressionLeftAction_1_0() ||
				   context == grammarAccess.getExplicitTypeExpressionRule() ||
				   context == grammarAccess.getExplicitTypeExpressionAccess().getExplicitTypeExpressionLeftAction_1_0() ||
				   context == grammarAccess.getExponentExpressionRule() ||
				   context == grammarAccess.getExponentExpressionAccess().getExponentExpressionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExquoExpressionRule() ||
				   context == grammarAccess.getExquoExpressionAccess().getExquoExpressionLeftAction_1_0() ||
				   context == grammarAccess.getHasExpressionRule() ||
				   context == grammarAccess.getHasExpressionAccess().getHasExpressionLeftAction_1_0() ||
				   context == grammarAccess.getHintTypeExpressionRule() ||
				   context == grammarAccess.getHintTypeExpressionAccess().getHintTypeExpressionLeftAction_1_0() ||
				   context == grammarAccess.getInnerProdExpressionRule() ||
				   context == grammarAccess.getInnerProdExpressionAccess().getInnerProdExpressionLeftAction_1_0() ||
				   context == grammarAccess.getIsExpressionRule() ||
				   context == grammarAccess.getIsExpressionAccess().getIsExpressionLeftAction_1_0() ||
				   context == grammarAccess.getListLiteralRule() ||
				   context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getMapDefinitionRule() ||
				   context == grammarAccess.getMapDefinitionAccess().getMapDefinitionLeftAction_1_0() ||
				   context == grammarAccess.getModExpressionRule() ||
				   context == grammarAccess.getModExpressionAccess().getModExpressionLeftAction_1_0() ||
				   context == grammarAccess.getMultiplicativeExpressionRule() ||
				   context == grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExpressionLeftAction_1_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getAndExpressionLeftAction_1_0() ||
				   context == grammarAccess.getOuterProdExpressionRule() ||
				   context == grammarAccess.getOuterProdExpressionAccess().getOuterProdExpressionLeftAction_1_0() ||
				   context == grammarAccess.getPretendExpressionRule() ||
				   context == grammarAccess.getPretendExpressionAccess().getPretendExpressionLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getPrimaryPrefixRule() ||
				   context == grammarAccess.getQuoExpressionRule() ||
				   context == grammarAccess.getQuoExpressionAccess().getQuoExpressionLeftAction_1_0() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0() ||
				   context == grammarAccess.getRemExpressionRule() ||
				   context == grammarAccess.getRemExpressionAccess().getRemExpressionLeftAction_1_0() ||
				   context == grammarAccess.getSegmentExpressionRule() ||
				   context == grammarAccess.getSegmentExpressionAccess().getSegmentExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUnaryExpressionRule()) {
					sequence_ListLiteral(context, (ListLiteral) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.LITERAL:
				if(context == grammarAccess.getAdditiveExpressionRule() ||
				   context == grammarAccess.getAdditiveExpressionAccess().getAdditiveExpressionLeftAction_1_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getInnerProdExpressionLeftAction_1_0() ||
				   context == grammarAccess.getAssignExpressionRule() ||
				   context == grammarAccess.getAssignExpressionAccess().getAssignExpressionLeftAction_1_0() ||
				   context == grammarAccess.getCaseExpressionRule() ||
				   context == grammarAccess.getCaseExpressionAccess().getCaseExpressionLeftAction_1_0() ||
				   context == grammarAccess.getCoerceExpressionRule() ||
				   context == grammarAccess.getCoerceExpressionAccess().getCoerceExpressionLeftAction_1_0() ||
				   context == grammarAccess.getConditionExpressionRule() ||
				   context == grammarAccess.getConditionExpressionAccess().getConditionExpressionLeftAction_1_0() ||
				   context == grammarAccess.getDivisionExpressionRule() ||
				   context == grammarAccess.getDivisionExpressionAccess().getDivisionExpressionLeftAction_1_0() ||
				   context == grammarAccess.getEltExpressionRule() ||
				   context == grammarAccess.getEltExpressionAccess().getEltExpressionLeftAction_1_0() ||
				   context == grammarAccess.getEqualityExpressionRule() ||
				   context == grammarAccess.getEqualityExpressionAccess().getEqualityExpressionLeftAction_1_0() ||
				   context == grammarAccess.getExplicitTypeExpressionRule() ||
				   context == grammarAccess.getExplicitTypeExpressionAccess().getExplicitTypeExpressionLeftAction_1_0() ||
				   context == grammarAccess.getExponentExpressionRule() ||
				   context == grammarAccess.getExponentExpressionAccess().getExponentExpressionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExquoExpressionRule() ||
				   context == grammarAccess.getExquoExpressionAccess().getExquoExpressionLeftAction_1_0() ||
				   context == grammarAccess.getHasExpressionRule() ||
				   context == grammarAccess.getHasExpressionAccess().getHasExpressionLeftAction_1_0() ||
				   context == grammarAccess.getHintTypeExpressionRule() ||
				   context == grammarAccess.getHintTypeExpressionAccess().getHintTypeExpressionLeftAction_1_0() ||
				   context == grammarAccess.getInnerProdExpressionRule() ||
				   context == grammarAccess.getInnerProdExpressionAccess().getInnerProdExpressionLeftAction_1_0() ||
				   context == grammarAccess.getIsExpressionRule() ||
				   context == grammarAccess.getIsExpressionAccess().getIsExpressionLeftAction_1_0() ||
				   context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getMapDefinitionRule() ||
				   context == grammarAccess.getMapDefinitionAccess().getMapDefinitionLeftAction_1_0() ||
				   context == grammarAccess.getModExpressionRule() ||
				   context == grammarAccess.getModExpressionAccess().getModExpressionLeftAction_1_0() ||
				   context == grammarAccess.getMultiplicativeExpressionRule() ||
				   context == grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExpressionLeftAction_1_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getAndExpressionLeftAction_1_0() ||
				   context == grammarAccess.getOuterProdExpressionRule() ||
				   context == grammarAccess.getOuterProdExpressionAccess().getOuterProdExpressionLeftAction_1_0() ||
				   context == grammarAccess.getPretendExpressionRule() ||
				   context == grammarAccess.getPretendExpressionAccess().getPretendExpressionLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getPrimaryPrefixRule() ||
				   context == grammarAccess.getQuoExpressionRule() ||
				   context == grammarAccess.getQuoExpressionAccess().getQuoExpressionLeftAction_1_0() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0() ||
				   context == grammarAccess.getRemExpressionRule() ||
				   context == grammarAccess.getRemExpressionAccess().getRemExpressionLeftAction_1_0() ||
				   context == grammarAccess.getSegmentExpressionRule() ||
				   context == grammarAccess.getSegmentExpressionAccess().getSegmentExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUnaryExpressionRule()) {
					sequence_Literal(context, (Literal) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.LOCAL_VARIABLE:
				if(context == grammarAccess.getLocalVariableRule()) {
					sequence_LocalVariable(context, (LocalVariable) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.MACRO_DEF:
				if(context == grammarAccess.getAddStatementsRule() ||
				   context == grammarAccess.getMacroDefRule() ||
				   context == grammarAccess.getWhereAssignmentsRule()) {
					sequence_MacroDef(context, (MacroDef) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.MAP_DEFINITION:
				if(context == grammarAccess.getAdditiveExpressionRule() ||
				   context == grammarAccess.getAdditiveExpressionAccess().getAdditiveExpressionLeftAction_1_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getInnerProdExpressionLeftAction_1_0() ||
				   context == grammarAccess.getCaseExpressionRule() ||
				   context == grammarAccess.getCaseExpressionAccess().getCaseExpressionLeftAction_1_0() ||
				   context == grammarAccess.getConditionExpressionRule() ||
				   context == grammarAccess.getConditionExpressionAccess().getConditionExpressionLeftAction_1_0() ||
				   context == grammarAccess.getDivisionExpressionRule() ||
				   context == grammarAccess.getDivisionExpressionAccess().getDivisionExpressionLeftAction_1_0() ||
				   context == grammarAccess.getEqualityExpressionRule() ||
				   context == grammarAccess.getEqualityExpressionAccess().getEqualityExpressionLeftAction_1_0() ||
				   context == grammarAccess.getExponentExpressionRule() ||
				   context == grammarAccess.getExponentExpressionAccess().getExponentExpressionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExquoExpressionRule() ||
				   context == grammarAccess.getExquoExpressionAccess().getExquoExpressionLeftAction_1_0() ||
				   context == grammarAccess.getHasExpressionRule() ||
				   context == grammarAccess.getHasExpressionAccess().getHasExpressionLeftAction_1_0() ||
				   context == grammarAccess.getInnerProdExpressionRule() ||
				   context == grammarAccess.getInnerProdExpressionAccess().getInnerProdExpressionLeftAction_1_0() ||
				   context == grammarAccess.getIsExpressionRule() ||
				   context == grammarAccess.getIsExpressionAccess().getIsExpressionLeftAction_1_0() ||
				   context == grammarAccess.getMapDefinitionRule() ||
				   context == grammarAccess.getMapDefinitionAccess().getMapDefinitionLeftAction_1_0() ||
				   context == grammarAccess.getModExpressionRule() ||
				   context == grammarAccess.getModExpressionAccess().getModExpressionLeftAction_1_0() ||
				   context == grammarAccess.getMultiplicativeExpressionRule() ||
				   context == grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExpressionLeftAction_1_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getAndExpressionLeftAction_1_0() ||
				   context == grammarAccess.getOuterProdExpressionRule() ||
				   context == grammarAccess.getOuterProdExpressionAccess().getOuterProdExpressionLeftAction_1_0() ||
				   context == grammarAccess.getQuoExpressionRule() ||
				   context == grammarAccess.getQuoExpressionAccess().getQuoExpressionLeftAction_1_0() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0() ||
				   context == grammarAccess.getRemExpressionRule() ||
				   context == grammarAccess.getRemExpressionAccess().getRemExpressionLeftAction_1_0() ||
				   context == grammarAccess.getSegmentExpressionRule() ||
				   context == grammarAccess.getSegmentExpressionAccess().getSegmentExpressionLeftAction_1_0()) {
					sequence_MapDefinition(context, (MapDefinition) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.MOD_EXPRESSION:
				if(context == grammarAccess.getAdditiveExpressionRule() ||
				   context == grammarAccess.getAdditiveExpressionAccess().getAdditiveExpressionLeftAction_1_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getInnerProdExpressionLeftAction_1_0() ||
				   context == grammarAccess.getCaseExpressionRule() ||
				   context == grammarAccess.getCaseExpressionAccess().getCaseExpressionLeftAction_1_0() ||
				   context == grammarAccess.getConditionExpressionRule() ||
				   context == grammarAccess.getConditionExpressionAccess().getConditionExpressionLeftAction_1_0() ||
				   context == grammarAccess.getDivisionExpressionRule() ||
				   context == grammarAccess.getDivisionExpressionAccess().getDivisionExpressionLeftAction_1_0() ||
				   context == grammarAccess.getEqualityExpressionRule() ||
				   context == grammarAccess.getEqualityExpressionAccess().getEqualityExpressionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExquoExpressionRule() ||
				   context == grammarAccess.getExquoExpressionAccess().getExquoExpressionLeftAction_1_0() ||
				   context == grammarAccess.getHasExpressionRule() ||
				   context == grammarAccess.getHasExpressionAccess().getHasExpressionLeftAction_1_0() ||
				   context == grammarAccess.getInnerProdExpressionRule() ||
				   context == grammarAccess.getInnerProdExpressionAccess().getInnerProdExpressionLeftAction_1_0() ||
				   context == grammarAccess.getIsExpressionRule() ||
				   context == grammarAccess.getIsExpressionAccess().getIsExpressionLeftAction_1_0() ||
				   context == grammarAccess.getModExpressionRule() ||
				   context == grammarAccess.getModExpressionAccess().getModExpressionLeftAction_1_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getAndExpressionLeftAction_1_0() ||
				   context == grammarAccess.getOuterProdExpressionRule() ||
				   context == grammarAccess.getOuterProdExpressionAccess().getOuterProdExpressionLeftAction_1_0() ||
				   context == grammarAccess.getQuoExpressionRule() ||
				   context == grammarAccess.getQuoExpressionAccess().getQuoExpressionLeftAction_1_0() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0() ||
				   context == grammarAccess.getSegmentExpressionRule() ||
				   context == grammarAccess.getSegmentExpressionAccess().getSegmentExpressionLeftAction_1_0()) {
					sequence_ModExpression(context, (ModExpression) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.MULTIPLICATIVE_EXPRESSION:
				if(context == grammarAccess.getAdditiveExpressionRule() ||
				   context == grammarAccess.getAdditiveExpressionAccess().getAdditiveExpressionLeftAction_1_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getInnerProdExpressionLeftAction_1_0() ||
				   context == grammarAccess.getCaseExpressionRule() ||
				   context == grammarAccess.getCaseExpressionAccess().getCaseExpressionLeftAction_1_0() ||
				   context == grammarAccess.getConditionExpressionRule() ||
				   context == grammarAccess.getConditionExpressionAccess().getConditionExpressionLeftAction_1_0() ||
				   context == grammarAccess.getDivisionExpressionRule() ||
				   context == grammarAccess.getDivisionExpressionAccess().getDivisionExpressionLeftAction_1_0() ||
				   context == grammarAccess.getEqualityExpressionRule() ||
				   context == grammarAccess.getEqualityExpressionAccess().getEqualityExpressionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExquoExpressionRule() ||
				   context == grammarAccess.getExquoExpressionAccess().getExquoExpressionLeftAction_1_0() ||
				   context == grammarAccess.getHasExpressionRule() ||
				   context == grammarAccess.getHasExpressionAccess().getHasExpressionLeftAction_1_0() ||
				   context == grammarAccess.getInnerProdExpressionRule() ||
				   context == grammarAccess.getInnerProdExpressionAccess().getInnerProdExpressionLeftAction_1_0() ||
				   context == grammarAccess.getIsExpressionRule() ||
				   context == grammarAccess.getIsExpressionAccess().getIsExpressionLeftAction_1_0() ||
				   context == grammarAccess.getModExpressionRule() ||
				   context == grammarAccess.getModExpressionAccess().getModExpressionLeftAction_1_0() ||
				   context == grammarAccess.getMultiplicativeExpressionRule() ||
				   context == grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExpressionLeftAction_1_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getAndExpressionLeftAction_1_0() ||
				   context == grammarAccess.getOuterProdExpressionRule() ||
				   context == grammarAccess.getOuterProdExpressionAccess().getOuterProdExpressionLeftAction_1_0() ||
				   context == grammarAccess.getQuoExpressionRule() ||
				   context == grammarAccess.getQuoExpressionAccess().getQuoExpressionLeftAction_1_0() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0() ||
				   context == grammarAccess.getRemExpressionRule() ||
				   context == grammarAccess.getRemExpressionAccess().getRemExpressionLeftAction_1_0() ||
				   context == grammarAccess.getSegmentExpressionRule() ||
				   context == grammarAccess.getSegmentExpressionAccess().getSegmentExpressionLeftAction_1_0()) {
					sequence_MultiplicativeExpression(context, (MultiplicativeExpression) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.NAME_OR_FUNCTION_CALL:
				if(context == grammarAccess.getNameOrFunctionCallRule()) {
					sequence_NameOrFunctionCall(context, (NameOrFunctionCall) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.OUTER_PROD_EXPRESSION:
				if(context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getInnerProdExpressionLeftAction_1_0() ||
				   context == grammarAccess.getConditionExpressionRule() ||
				   context == grammarAccess.getConditionExpressionAccess().getConditionExpressionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getInnerProdExpressionRule() ||
				   context == grammarAccess.getInnerProdExpressionAccess().getInnerProdExpressionLeftAction_1_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getAndExpressionLeftAction_1_0() ||
				   context == grammarAccess.getOuterProdExpressionRule() ||
				   context == grammarAccess.getOuterProdExpressionAccess().getOuterProdExpressionLeftAction_1_0()) {
					sequence_OuterProdExpression(context, (OuterProdExpression) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.PACKAGE_DEF:
				if(context == grammarAccess.getPackageDefRule()) {
					sequence_PackageDef(context, (PackageDef) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.PRETEND_EXPRESSION:
				if(context == grammarAccess.getAdditiveExpressionRule() ||
				   context == grammarAccess.getAdditiveExpressionAccess().getAdditiveExpressionLeftAction_1_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getInnerProdExpressionLeftAction_1_0() ||
				   context == grammarAccess.getAssignExpressionRule() ||
				   context == grammarAccess.getAssignExpressionAccess().getAssignExpressionLeftAction_1_0() ||
				   context == grammarAccess.getCaseExpressionRule() ||
				   context == grammarAccess.getCaseExpressionAccess().getCaseExpressionLeftAction_1_0() ||
				   context == grammarAccess.getConditionExpressionRule() ||
				   context == grammarAccess.getConditionExpressionAccess().getConditionExpressionLeftAction_1_0() ||
				   context == grammarAccess.getDivisionExpressionRule() ||
				   context == grammarAccess.getDivisionExpressionAccess().getDivisionExpressionLeftAction_1_0() ||
				   context == grammarAccess.getEqualityExpressionRule() ||
				   context == grammarAccess.getEqualityExpressionAccess().getEqualityExpressionLeftAction_1_0() ||
				   context == grammarAccess.getExponentExpressionRule() ||
				   context == grammarAccess.getExponentExpressionAccess().getExponentExpressionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExquoExpressionRule() ||
				   context == grammarAccess.getExquoExpressionAccess().getExquoExpressionLeftAction_1_0() ||
				   context == grammarAccess.getHasExpressionRule() ||
				   context == grammarAccess.getHasExpressionAccess().getHasExpressionLeftAction_1_0() ||
				   context == grammarAccess.getInnerProdExpressionRule() ||
				   context == grammarAccess.getInnerProdExpressionAccess().getInnerProdExpressionLeftAction_1_0() ||
				   context == grammarAccess.getIsExpressionRule() ||
				   context == grammarAccess.getIsExpressionAccess().getIsExpressionLeftAction_1_0() ||
				   context == grammarAccess.getMapDefinitionRule() ||
				   context == grammarAccess.getMapDefinitionAccess().getMapDefinitionLeftAction_1_0() ||
				   context == grammarAccess.getModExpressionRule() ||
				   context == grammarAccess.getModExpressionAccess().getModExpressionLeftAction_1_0() ||
				   context == grammarAccess.getMultiplicativeExpressionRule() ||
				   context == grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExpressionLeftAction_1_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getAndExpressionLeftAction_1_0() ||
				   context == grammarAccess.getOuterProdExpressionRule() ||
				   context == grammarAccess.getOuterProdExpressionAccess().getOuterProdExpressionLeftAction_1_0() ||
				   context == grammarAccess.getPretendExpressionRule() ||
				   context == grammarAccess.getPretendExpressionAccess().getPretendExpressionLeftAction_1_0() ||
				   context == grammarAccess.getQuoExpressionRule() ||
				   context == grammarAccess.getQuoExpressionAccess().getQuoExpressionLeftAction_1_0() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0() ||
				   context == grammarAccess.getRemExpressionRule() ||
				   context == grammarAccess.getRemExpressionAccess().getRemExpressionLeftAction_1_0() ||
				   context == grammarAccess.getSegmentExpressionRule() ||
				   context == grammarAccess.getSegmentExpressionAccess().getSegmentExpressionLeftAction_1_0()) {
					sequence_PretendExpression(context, (PretendExpression) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.PRIMARY_PREFIX:
				if(context == grammarAccess.getAdditiveExpressionRule() ||
				   context == grammarAccess.getAdditiveExpressionAccess().getAdditiveExpressionLeftAction_1_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getInnerProdExpressionLeftAction_1_0() ||
				   context == grammarAccess.getAssignExpressionRule() ||
				   context == grammarAccess.getAssignExpressionAccess().getAssignExpressionLeftAction_1_0() ||
				   context == grammarAccess.getCaseExpressionRule() ||
				   context == grammarAccess.getCaseExpressionAccess().getCaseExpressionLeftAction_1_0() ||
				   context == grammarAccess.getCoerceExpressionRule() ||
				   context == grammarAccess.getCoerceExpressionAccess().getCoerceExpressionLeftAction_1_0() ||
				   context == grammarAccess.getConditionExpressionRule() ||
				   context == grammarAccess.getConditionExpressionAccess().getConditionExpressionLeftAction_1_0() ||
				   context == grammarAccess.getDivisionExpressionRule() ||
				   context == grammarAccess.getDivisionExpressionAccess().getDivisionExpressionLeftAction_1_0() ||
				   context == grammarAccess.getEltExpressionRule() ||
				   context == grammarAccess.getEltExpressionAccess().getEltExpressionLeftAction_1_0() ||
				   context == grammarAccess.getEqualityExpressionRule() ||
				   context == grammarAccess.getEqualityExpressionAccess().getEqualityExpressionLeftAction_1_0() ||
				   context == grammarAccess.getExplicitTypeExpressionRule() ||
				   context == grammarAccess.getExplicitTypeExpressionAccess().getExplicitTypeExpressionLeftAction_1_0() ||
				   context == grammarAccess.getExponentExpressionRule() ||
				   context == grammarAccess.getExponentExpressionAccess().getExponentExpressionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExquoExpressionRule() ||
				   context == grammarAccess.getExquoExpressionAccess().getExquoExpressionLeftAction_1_0() ||
				   context == grammarAccess.getHasExpressionRule() ||
				   context == grammarAccess.getHasExpressionAccess().getHasExpressionLeftAction_1_0() ||
				   context == grammarAccess.getHintTypeExpressionRule() ||
				   context == grammarAccess.getHintTypeExpressionAccess().getHintTypeExpressionLeftAction_1_0() ||
				   context == grammarAccess.getInnerProdExpressionRule() ||
				   context == grammarAccess.getInnerProdExpressionAccess().getInnerProdExpressionLeftAction_1_0() ||
				   context == grammarAccess.getIsExpressionRule() ||
				   context == grammarAccess.getIsExpressionAccess().getIsExpressionLeftAction_1_0() ||
				   context == grammarAccess.getMapDefinitionRule() ||
				   context == grammarAccess.getMapDefinitionAccess().getMapDefinitionLeftAction_1_0() ||
				   context == grammarAccess.getModExpressionRule() ||
				   context == grammarAccess.getModExpressionAccess().getModExpressionLeftAction_1_0() ||
				   context == grammarAccess.getMultiplicativeExpressionRule() ||
				   context == grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExpressionLeftAction_1_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getAndExpressionLeftAction_1_0() ||
				   context == grammarAccess.getOuterProdExpressionRule() ||
				   context == grammarAccess.getOuterProdExpressionAccess().getOuterProdExpressionLeftAction_1_0() ||
				   context == grammarAccess.getPretendExpressionRule() ||
				   context == grammarAccess.getPretendExpressionAccess().getPretendExpressionLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getPrimaryPrefixRule() ||
				   context == grammarAccess.getQuoExpressionRule() ||
				   context == grammarAccess.getQuoExpressionAccess().getQuoExpressionLeftAction_1_0() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0() ||
				   context == grammarAccess.getRemExpressionRule() ||
				   context == grammarAccess.getRemExpressionAccess().getRemExpressionLeftAction_1_0() ||
				   context == grammarAccess.getSegmentExpressionRule() ||
				   context == grammarAccess.getSegmentExpressionAccess().getSegmentExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUnaryExpressionRule()) {
					sequence_PrimaryPrefix(context, (PrimaryPrefix) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.QUO_EXPRESSION:
				if(context == grammarAccess.getAdditiveExpressionRule() ||
				   context == grammarAccess.getAdditiveExpressionAccess().getAdditiveExpressionLeftAction_1_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getInnerProdExpressionLeftAction_1_0() ||
				   context == grammarAccess.getCaseExpressionRule() ||
				   context == grammarAccess.getCaseExpressionAccess().getCaseExpressionLeftAction_1_0() ||
				   context == grammarAccess.getConditionExpressionRule() ||
				   context == grammarAccess.getConditionExpressionAccess().getConditionExpressionLeftAction_1_0() ||
				   context == grammarAccess.getDivisionExpressionRule() ||
				   context == grammarAccess.getDivisionExpressionAccess().getDivisionExpressionLeftAction_1_0() ||
				   context == grammarAccess.getEqualityExpressionRule() ||
				   context == grammarAccess.getEqualityExpressionAccess().getEqualityExpressionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExquoExpressionRule() ||
				   context == grammarAccess.getExquoExpressionAccess().getExquoExpressionLeftAction_1_0() ||
				   context == grammarAccess.getHasExpressionRule() ||
				   context == grammarAccess.getHasExpressionAccess().getHasExpressionLeftAction_1_0() ||
				   context == grammarAccess.getInnerProdExpressionRule() ||
				   context == grammarAccess.getInnerProdExpressionAccess().getInnerProdExpressionLeftAction_1_0() ||
				   context == grammarAccess.getIsExpressionRule() ||
				   context == grammarAccess.getIsExpressionAccess().getIsExpressionLeftAction_1_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getAndExpressionLeftAction_1_0() ||
				   context == grammarAccess.getOuterProdExpressionRule() ||
				   context == grammarAccess.getOuterProdExpressionAccess().getOuterProdExpressionLeftAction_1_0() ||
				   context == grammarAccess.getQuoExpressionRule() ||
				   context == grammarAccess.getQuoExpressionAccess().getQuoExpressionLeftAction_1_0() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0() ||
				   context == grammarAccess.getSegmentExpressionRule() ||
				   context == grammarAccess.getSegmentExpressionAccess().getSegmentExpressionLeftAction_1_0()) {
					sequence_QuoExpression(context, (QuoExpression) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.RELATIONAL_EXPRESSION:
				if(context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getInnerProdExpressionLeftAction_1_0() ||
				   context == grammarAccess.getCaseExpressionRule() ||
				   context == grammarAccess.getCaseExpressionAccess().getCaseExpressionLeftAction_1_0() ||
				   context == grammarAccess.getConditionExpressionRule() ||
				   context == grammarAccess.getConditionExpressionAccess().getConditionExpressionLeftAction_1_0() ||
				   context == grammarAccess.getEqualityExpressionRule() ||
				   context == grammarAccess.getEqualityExpressionAccess().getEqualityExpressionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getHasExpressionRule() ||
				   context == grammarAccess.getHasExpressionAccess().getHasExpressionLeftAction_1_0() ||
				   context == grammarAccess.getInnerProdExpressionRule() ||
				   context == grammarAccess.getInnerProdExpressionAccess().getInnerProdExpressionLeftAction_1_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getAndExpressionLeftAction_1_0() ||
				   context == grammarAccess.getOuterProdExpressionRule() ||
				   context == grammarAccess.getOuterProdExpressionAccess().getOuterProdExpressionLeftAction_1_0() ||
				   context == grammarAccess.getRelationalExpressionRule()) {
					sequence_RelationalExpression(context, (RelationalExpression) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.REM_EXPRESSION:
				if(context == grammarAccess.getAdditiveExpressionRule() ||
				   context == grammarAccess.getAdditiveExpressionAccess().getAdditiveExpressionLeftAction_1_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getInnerProdExpressionLeftAction_1_0() ||
				   context == grammarAccess.getCaseExpressionRule() ||
				   context == grammarAccess.getCaseExpressionAccess().getCaseExpressionLeftAction_1_0() ||
				   context == grammarAccess.getConditionExpressionRule() ||
				   context == grammarAccess.getConditionExpressionAccess().getConditionExpressionLeftAction_1_0() ||
				   context == grammarAccess.getDivisionExpressionRule() ||
				   context == grammarAccess.getDivisionExpressionAccess().getDivisionExpressionLeftAction_1_0() ||
				   context == grammarAccess.getEqualityExpressionRule() ||
				   context == grammarAccess.getEqualityExpressionAccess().getEqualityExpressionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExquoExpressionRule() ||
				   context == grammarAccess.getExquoExpressionAccess().getExquoExpressionLeftAction_1_0() ||
				   context == grammarAccess.getHasExpressionRule() ||
				   context == grammarAccess.getHasExpressionAccess().getHasExpressionLeftAction_1_0() ||
				   context == grammarAccess.getInnerProdExpressionRule() ||
				   context == grammarAccess.getInnerProdExpressionAccess().getInnerProdExpressionLeftAction_1_0() ||
				   context == grammarAccess.getIsExpressionRule() ||
				   context == grammarAccess.getIsExpressionAccess().getIsExpressionLeftAction_1_0() ||
				   context == grammarAccess.getModExpressionRule() ||
				   context == grammarAccess.getModExpressionAccess().getModExpressionLeftAction_1_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getAndExpressionLeftAction_1_0() ||
				   context == grammarAccess.getOuterProdExpressionRule() ||
				   context == grammarAccess.getOuterProdExpressionAccess().getOuterProdExpressionLeftAction_1_0() ||
				   context == grammarAccess.getQuoExpressionRule() ||
				   context == grammarAccess.getQuoExpressionAccess().getQuoExpressionLeftAction_1_0() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0() ||
				   context == grammarAccess.getRemExpressionRule() ||
				   context == grammarAccess.getRemExpressionAccess().getRemExpressionLeftAction_1_0() ||
				   context == grammarAccess.getSegmentExpressionRule() ||
				   context == grammarAccess.getSegmentExpressionAccess().getSegmentExpressionLeftAction_1_0()) {
					sequence_RemExpression(context, (RemExpression) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.REPEAT_STATEMENT:
				if(context == grammarAccess.getRepeatStatementRule()) {
					sequence_RepeatStatement(context, (RepeatStatement) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.RETURN_STATEMENT:
				if(context == grammarAccess.getReturnStatementRule()) {
					sequence_ReturnStatement(context, (ReturnStatement) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.SEGMENT_EXPRESSION:
				if(context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getInnerProdExpressionLeftAction_1_0() ||
				   context == grammarAccess.getCaseExpressionRule() ||
				   context == grammarAccess.getCaseExpressionAccess().getCaseExpressionLeftAction_1_0() ||
				   context == grammarAccess.getConditionExpressionRule() ||
				   context == grammarAccess.getConditionExpressionAccess().getConditionExpressionLeftAction_1_0() ||
				   context == grammarAccess.getEqualityExpressionRule() ||
				   context == grammarAccess.getEqualityExpressionAccess().getEqualityExpressionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getHasExpressionRule() ||
				   context == grammarAccess.getHasExpressionAccess().getHasExpressionLeftAction_1_0() ||
				   context == grammarAccess.getInnerProdExpressionRule() ||
				   context == grammarAccess.getInnerProdExpressionAccess().getInnerProdExpressionLeftAction_1_0() ||
				   context == grammarAccess.getIsExpressionRule() ||
				   context == grammarAccess.getIsExpressionAccess().getIsExpressionLeftAction_1_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getAndExpressionLeftAction_1_0() ||
				   context == grammarAccess.getOuterProdExpressionRule() ||
				   context == grammarAccess.getOuterProdExpressionAccess().getOuterProdExpressionLeftAction_1_0() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0() ||
				   context == grammarAccess.getSegmentExpressionRule() ||
				   context == grammarAccess.getSegmentExpressionAccess().getSegmentExpressionLeftAction_1_0()) {
					sequence_SegmentExpression(context, (SegmentExpression) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.STATEMENT:
				if(context == grammarAccess.getStatementRule()) {
					sequence_Statement(context, (Statement) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.STATEMENT_EXPRESSION:
				if(context == grammarAccess.getStatementExpressionRule()) {
					sequence_StatementExpression(context, (StatementExpression) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.TUPLE_DEFINITION:
				if(context == grammarAccess.getTupleDefinitionRule() ||
				   context == grammarAccess.getTypeExpressionRule() ||
				   context == grammarAccess.getTypePrimaryExpressionRule()) {
					sequence_TupleDefinition(context, (TupleDefinition) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.TYPE_ARGUMENTS:
				if(context == grammarAccess.getTypeArgumentsRule()) {
					sequence_TypeArguments(context, (TypeArguments) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.TYPE_EXPRESSION:
				if(context == grammarAccess.getTypeExpressionRule()) {
					sequence_TypeExpression(context, (TypeExpression) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.TYPE_LITERAL:
				if(context == grammarAccess.getTypeExpressionRule() ||
				   context == grammarAccess.getTypeLiteralRule() ||
				   context == grammarAccess.getTypePrimaryExpressionRule()) {
					sequence_TypeLiteral(context, (TypeLiteral) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.TYPE_NAME_OR_FUNCTION_CALL:
				if(context == grammarAccess.getTypeExpressionRule() ||
				   context == grammarAccess.getTypeNameOrFunctionCallRule() ||
				   context == grammarAccess.getTypePrimaryExpressionRule()) {
					sequence_TypeNameOrFunctionCall(context, (TypeNameOrFunctionCall) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.TYPE_PARAMETER_LIST:
				if(context == grammarAccess.getTypeParameterListRule()) {
					sequence_TypeParameterList(context, (TypeParameterList) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.TYPE_PRIMARY_EXPRESSION:
				if(context == grammarAccess.getTypeExpressionRule() ||
				   context == grammarAccess.getTypePrimaryExpressionRule()) {
					sequence_TypePrimaryExpression(context, (TypePrimaryExpression) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.TYPE_RESULT:
				if(context == grammarAccess.getTypeResultRule()) {
					sequence_TypeResult(context, (TypeResult) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.TYPE_WITH_NAME:
				if(context == grammarAccess.getTypeWithNameRule()) {
					sequence_TypeWithName(context, (TypeWithName) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.UNARY_EXPRESSION:
				if(context == grammarAccess.getAdditiveExpressionRule() ||
				   context == grammarAccess.getAdditiveExpressionAccess().getAdditiveExpressionLeftAction_1_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getInnerProdExpressionLeftAction_1_0() ||
				   context == grammarAccess.getAssignExpressionRule() ||
				   context == grammarAccess.getAssignExpressionAccess().getAssignExpressionLeftAction_1_0() ||
				   context == grammarAccess.getCaseExpressionRule() ||
				   context == grammarAccess.getCaseExpressionAccess().getCaseExpressionLeftAction_1_0() ||
				   context == grammarAccess.getCoerceExpressionRule() ||
				   context == grammarAccess.getCoerceExpressionAccess().getCoerceExpressionLeftAction_1_0() ||
				   context == grammarAccess.getConditionExpressionRule() ||
				   context == grammarAccess.getConditionExpressionAccess().getConditionExpressionLeftAction_1_0() ||
				   context == grammarAccess.getDivisionExpressionRule() ||
				   context == grammarAccess.getDivisionExpressionAccess().getDivisionExpressionLeftAction_1_0() ||
				   context == grammarAccess.getEltExpressionRule() ||
				   context == grammarAccess.getEltExpressionAccess().getEltExpressionLeftAction_1_0() ||
				   context == grammarAccess.getEqualityExpressionRule() ||
				   context == grammarAccess.getEqualityExpressionAccess().getEqualityExpressionLeftAction_1_0() ||
				   context == grammarAccess.getExplicitTypeExpressionRule() ||
				   context == grammarAccess.getExplicitTypeExpressionAccess().getExplicitTypeExpressionLeftAction_1_0() ||
				   context == grammarAccess.getExponentExpressionRule() ||
				   context == grammarAccess.getExponentExpressionAccess().getExponentExpressionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExquoExpressionRule() ||
				   context == grammarAccess.getExquoExpressionAccess().getExquoExpressionLeftAction_1_0() ||
				   context == grammarAccess.getHasExpressionRule() ||
				   context == grammarAccess.getHasExpressionAccess().getHasExpressionLeftAction_1_0() ||
				   context == grammarAccess.getHintTypeExpressionRule() ||
				   context == grammarAccess.getHintTypeExpressionAccess().getHintTypeExpressionLeftAction_1_0() ||
				   context == grammarAccess.getInnerProdExpressionRule() ||
				   context == grammarAccess.getInnerProdExpressionAccess().getInnerProdExpressionLeftAction_1_0() ||
				   context == grammarAccess.getIsExpressionRule() ||
				   context == grammarAccess.getIsExpressionAccess().getIsExpressionLeftAction_1_0() ||
				   context == grammarAccess.getMapDefinitionRule() ||
				   context == grammarAccess.getMapDefinitionAccess().getMapDefinitionLeftAction_1_0() ||
				   context == grammarAccess.getModExpressionRule() ||
				   context == grammarAccess.getModExpressionAccess().getModExpressionLeftAction_1_0() ||
				   context == grammarAccess.getMultiplicativeExpressionRule() ||
				   context == grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExpressionLeftAction_1_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getAndExpressionLeftAction_1_0() ||
				   context == grammarAccess.getOuterProdExpressionRule() ||
				   context == grammarAccess.getOuterProdExpressionAccess().getOuterProdExpressionLeftAction_1_0() ||
				   context == grammarAccess.getPretendExpressionRule() ||
				   context == grammarAccess.getPretendExpressionAccess().getPretendExpressionLeftAction_1_0() ||
				   context == grammarAccess.getQuoExpressionRule() ||
				   context == grammarAccess.getQuoExpressionAccess().getQuoExpressionLeftAction_1_0() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0() ||
				   context == grammarAccess.getRemExpressionRule() ||
				   context == grammarAccess.getRemExpressionAccess().getRemExpressionLeftAction_1_0() ||
				   context == grammarAccess.getSegmentExpressionRule() ||
				   context == grammarAccess.getSegmentExpressionAccess().getSegmentExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUnaryExpressionRule()) {
					sequence_UnaryExpression(context, (UnaryExpression) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.VARIABLE_DECLARATION:
				if(context == grammarAccess.getVariableDeclarationRule() ||
				   context == grammarAccess.getWhereAssignmentsRule()) {
					sequence_VariableDeclaration(context, (VariableDeclaration) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.VARIABLE_DECLARATION_ASSIGN:
				if(context == grammarAccess.getAddStatementsRule() ||
				   context == grammarAccess.getVariableDeclarationAssignRule()) {
					sequence_VariableDeclarationAssign(context, (VariableDeclarationAssign) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.VARIABLE_DECLARATION_BLOCK:
				if(context == grammarAccess.getVariableDeclarationBlockRule()) {
					sequence_VariableDeclarationBlock(context, (VariableDeclarationBlock) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.VARIABLE_TYPED:
				if(context == grammarAccess.getVariableTypedRule()) {
					sequence_VariableTyped(context, (VariableTyped) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.WHERE_PART:
				if(context == grammarAccess.getWherePartRule()) {
					sequence_WherePart(context, (WherePart) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.WHILE_STATEMENT:
				if(context == grammarAccess.getWhileStatementRule()) {
					sequence_WhileStatement(context, (WhileStatement) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.WITH_PART:
				if(context == grammarAccess.getWithPartRule()) {
					sequence_WithPart(context, (WithPart) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name='add' t+=AddStatements*)
	 */
	protected void sequence_AddPart(EObject context, AddPart semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (t1=Expression t13=FunctionDefinitionBlock)
	 */
	protected void sequence_AddStatements(EObject context, AddStatements semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EditorPackage.Literals.ADD_STATEMENTS__T1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EditorPackage.Literals.ADD_STATEMENTS__T1));
			if(transientValues.isValueTransient(semanticObject, EditorPackage.Literals.ADD_STATEMENTS__T13) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EditorPackage.Literals.ADD_STATEMENTS__T13));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAddStatementsAccess().getT1ExpressionParserRuleCall_2_1_0(), semanticObject.getT1());
		feeder.accept(grammarAccess.getAddStatementsAccess().getT13FunctionDefinitionBlockParserRuleCall_2_3_0(), semanticObject.getT13());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=AdditiveExpression_AdditiveExpression_1_0 (op=PLUS | op=MINUS) right=ExquoExpression)
	 */
	protected void sequence_AdditiveExpression(EObject context, AdditiveExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (left=AndExpression_InnerProdExpression_1_0 op='and' right=InnerProdExpression) | 
	 *         (left=InnerProdExpression_InnerProdExpression_1_0 op=BACKSLASHSLASH right=OuterProdExpression)
	 *     )
	 */
	protected void sequence_AndExpression_InnerProdExpression(EObject context, InnerProdExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         left=AssignExpression_AssignExpression_1_0 
	 *         op=BECOMES 
	 *         (right=PretendExpression | (ifname='if' ifpred=ConditionExpression thenexp=ConditionExpression elseexp=PretendExpression))
	 *     )
	 */
	protected void sequence_AssignExpression(EObject context, AssignExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (stname=LBRACE statemBl+=Statement*)
	 */
	protected void sequence_Block(EObject context, Block semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (litname='true' | litname='false' | litname='true' | litname='false')
	 */
	protected void sequence_BooleanLiteral(EObject context, BooleanLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     stname='break'
	 */
	protected void sequence_BreakStatement(EObject context, BreakStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EditorPackage.Literals.BREAK_STATEMENT__STNAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EditorPackage.Literals.BREAK_STATEMENT__STNAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBreakStatementAccess().getStnameBreakKeyword_0(), semanticObject.getStname());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=CaseExpression_CaseExpression_1_0 op='case' right=EqualityExpression)
	 */
	protected void sequence_CaseExpression(EObject context, CaseExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name='category' 
	 *         shortname=ID 
	 *         longname=ID 
	 *         longname2=ID 
	 *         cp=TypeParameterList? 
	 *         (
	 *             (implName=TypeArguments? ((w=WithPart? a=AddPart?) | wh5=WherePart)) | 
	 *             (implName=TypeArguments ((w=WithPart? a=AddPart?) | wh5=WherePart) a2=AddPart?)
	 *         )
	 *     )
	 */
	protected void sequence_CategoryDef(EObject context, CategoryDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     c1=ANY_OTHER
	 */
	protected void sequence_CharacterLiteral(EObject context, CharacterLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=CoerceExpression_CoerceExpression_1_0 op=COERCE rightType=TypeExpression)
	 */
	protected void sequence_CoerceExpression(EObject context, CoerceExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=ConditionExpression_ConditionExpression_1_0 op=BAR right=OrExpression)
	 */
	protected void sequence_ConditionExpression(EObject context, ConditionExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=DivisionExpression_DivisionExpression_1_0 op=SLASH right=QuoExpression)
	 */
	protected void sequence_DivisionExpression(EObject context, DivisionExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (stname='do' s1=Statement t2=Expression)
	 */
	protected void sequence_DoStatement(EObject context, DoStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EditorPackage.Literals.DO_STATEMENT__STNAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EditorPackage.Literals.DO_STATEMENT__STNAME));
			if(transientValues.isValueTransient(semanticObject, EditorPackage.Literals.DO_STATEMENT__S1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EditorPackage.Literals.DO_STATEMENT__S1));
			if(transientValues.isValueTransient(semanticObject, EditorPackage.Literals.DO_STATEMENT__T2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EditorPackage.Literals.DO_STATEMENT__T2));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDoStatementAccess().getStnameDoKeyword_0_0(), semanticObject.getStname());
		feeder.accept(grammarAccess.getDoStatementAccess().getS1StatementParserRuleCall_1_0(), semanticObject.getS1());
		feeder.accept(grammarAccess.getDoStatementAccess().getT2ExpressionParserRuleCall_4_0(), semanticObject.getT2());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name='domain' 
	 *         shortname5=ID 
	 *         longname5=ID 
	 *         longname6=ID 
	 *         cp5=TypeParameterList? 
	 *         exportName=ID 
	 *         implName5=ID 
	 *         (w=WithPart | wh5=WherePart)
	 *     )
	 */
	protected void sequence_DomainDef(EObject context, DomainDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=EltExpression_EltExpression_1_0 op=DOT right=ExplicitTypeExpression)
	 */
	protected void sequence_EltExpression(EObject context, EltExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=EqualityExpression_EqualityExpression_1_0 (op=EQUAL | op=NOTEQUAL | op='^=') right=RelationalExpression)
	 */
	protected void sequence_EqualityExpression(EObject context, EqualityExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=ExplicitTypeExpression_ExplicitTypeExpression_1_0 op=DOLAR rightType=TypeExpression)
	 */
	protected void sequence_ExplicitTypeExpression(EObject context, ExplicitTypeExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=ExponentExpression_ExponentExpression_1_0 (op=CARAT | op=POWER) right=MapDefinition)
	 */
	protected void sequence_ExponentExpression(EObject context, ExponentExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=ExquoExpression_ExquoExpression_1_0 op='exquo' right=DivisionExpression)
	 */
	protected void sequence_ExquoExpression(EObject context, ExquoExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (stname=ID t1=Expression (stname2+=ID t2+=Expression)* t2+=Expression* s1=Statement)
	 */
	protected void sequence_ForStatement(EObject context, ForStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     var=ID
	 */
	protected void sequence_FreeVariable(EObject context, FreeVariable semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EditorPackage.Literals.FREE_VARIABLE__VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EditorPackage.Literals.FREE_VARIABLE__VAR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFreeVariableAccess().getVarIDTerminalRuleCall_1_0(), semanticObject.getVar());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (fnDecBr=LBRACE (fnDecBk+=FunctionDefinition | vars+=VariableDeclarationAssign | (t1+=Expression t13+=FunctionDefinitionBlock))*)
	 */
	protected void sequence_FunctionDefinitionBlock(EObject context, FunctionDefinitionBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (par3=FunctionSignature par4=TypeExpression? par5=Statement)
	 */
	protected void sequence_FunctionDefinition(EObject context, FunctionDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (fnNam=ID par2=VariableTyped? par3+=VariableTyped*) | 
	 *         (fnNam=ID par=ID) | 
	 *         (
	 *             t4=ID 
	 *             (
	 *                 b1=EQUAL | 
	 *                 b1=LT | 
	 *                 b1=GT | 
	 *                 b1=LE | 
	 *                 b1=GE | 
	 *                 b1=PLUS | 
	 *                 b1=MINUS | 
	 *                 b1=TIMES | 
	 *                 b1=SLASH | 
	 *                 b1=AMPERSAND | 
	 *                 b1=BAR | 
	 *                 b1=CARAT
	 *             ) 
	 *             t5=ID
	 *         ) | 
	 *         b3=INT | 
	 *         (b2=MINUS t6=ID) | 
	 *         (b4=TILDE t7=ID) | 
	 *         (b5='not' t8=ID) | 
	 *         (b6=HASH t8=ID)
	 *     )
	 */
	protected void sequence_FunctionSignature(EObject context, FunctionSignature semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=HasExpression_HasExpression_1_0 op='has' rightType=TypeExpression)
	 */
	protected void sequence_HasExpression(EObject context, HasExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=HintTypeExpression_HintTypeExpression_1_0 op=AT rightType=TypeExpression)
	 */
	protected void sequence_HintTypeExpression(EObject context, HintTypeExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     s2=Statement
	 */
	protected void sequence_IfElseStatement(EObject context, IfElseStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EditorPackage.Literals.IF_ELSE_STATEMENT__S2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EditorPackage.Literals.IF_ELSE_STATEMENT__S2));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIfElseStatementAccess().getS2StatementParserRuleCall_1_0(), semanticObject.getS2());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (t2=Expression ((s1=Statement s2=Statement?) | (b?=LBRACE s11=Statement s12=Statement?)))
	 */
	protected void sequence_IfStatement(EObject context, IfStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (impname+=ID+ (par22+=TypeExpression par22+=TypeExpression*)?)
	 */
	protected void sequence_Import(EObject context, Import semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=InnerProdExpression_InnerProdExpression_1_0 op=BACKSLASHSLASH right=OuterProdExpression)
	 */
	protected void sequence_InnerProdExpression(EObject context, InnerProdExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=IsExpression_IsExpression_1_0 (op='is' | op='isnt') rightType=TypeExpression)
	 */
	protected void sequence_IsExpression(EObject context, IsExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     stname='iterate'
	 */
	protected void sequence_IterateStatement(EObject context, IterateStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EditorPackage.Literals.ITERATE_STATEMENT__STNAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EditorPackage.Literals.ITERATE_STATEMENT__STNAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIterateStatementAccess().getStnameIterateKeyword_0(), semanticObject.getStname());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (litname=LBRACKET l2=Expression? t3+=Expression* (t14+=Expression l5+=Expression)?)
	 */
	protected void sequence_ListLiteral(EObject context, ListLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value=INT | (t2=STRING (e1=NameOrFunctionCall (t31+=STRING e4+=NameOrFunctionCall?)*)?))
	 */
	protected void sequence_Literal(EObject context, Literal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     var=ID
	 */
	protected void sequence_LocalVariable(EObject context, LocalVariable semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EditorPackage.Literals.LOCAL_VARIABLE__VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EditorPackage.Literals.LOCAL_VARIABLE__VAR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLocalVariableAccess().getVarIDTerminalRuleCall_1_0(), semanticObject.getVar());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     macroname=ID
	 */
	protected void sequence_MacroDef(EObject context, MacroDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=MapDefinition_MapDefinition_1_0 op=GIVES right=AssignExpression)
	 */
	protected void sequence_MapDefinition(EObject context, MapDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=ModExpression_ModExpression_1_0 op='mod' right=RemExpression)
	 */
	protected void sequence_ModExpression(EObject context, ModExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (c=CategoryDef | p=PackageDef | d=DomainDef)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=MultiplicativeExpression_MultiplicativeExpression_1_0 op=TIMES right=ExponentExpression)
	 */
	protected void sequence_MultiplicativeExpression(EObject context, MultiplicativeExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         fnname=ID 
	 *         lsp=DOLAR? 
	 *         ((t4=StatementExpression? t5+=Expression* (t14+=StatementExpression? t15+=Expression*)*) | t6=PrimaryExpression)? 
	 *         rightType2=TypeExpression?
	 *     )
	 */
	protected void sequence_NameOrFunctionCall(EObject context, NameOrFunctionCall semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=OrExpression_AndExpression_1_0 op='or' right=AndExpression)
	 */
	protected void sequence_OrExpression(EObject context, AndExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=OuterProdExpression_OuterProdExpression_1_0 op=SLASHBACKSLASH right=HasExpression)
	 */
	protected void sequence_OuterProdExpression(EObject context, OuterProdExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name='package' 
	 *         shortname=ID 
	 *         longname=ID 
	 *         longname2=ID 
	 *         cp=TypeParameterList? 
	 *         exportName=ID 
	 *         implName=ID 
	 *         (w=WithPart | wh5=WherePart)
	 *     )
	 */
	protected void sequence_PackageDef(EObject context, PackageDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=PretendExpression_PretendExpression_1_0 op='pretend' rightType=TypeExpression)
	 */
	protected void sequence_PretendExpression(EObject context, PretendExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((t4=Expression t25+=Expression* rightType3=TypeExpression?) | t7=NameOrFunctionCall)
	 */
	protected void sequence_PrimaryPrefix(EObject context, PrimaryPrefix semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=QuoExpression_QuoExpression_1_0 op='quo' right=ModExpression)
	 */
	protected void sequence_QuoExpression(EObject context, QuoExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=RelationalExpression_RelationalExpression_1_0 (op=LT | op=GT | op=LE | op=GE) right=IsExpression)
	 */
	protected void sequence_RelationalExpression(EObject context, RelationalExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=RemExpression_RemExpression_1_0 op='rem' right=MultiplicativeExpression)
	 */
	protected void sequence_RemExpression(EObject context, RemExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (stname='repeat' s1=Statement)
	 */
	protected void sequence_RepeatStatement(EObject context, RepeatStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EditorPackage.Literals.REPEAT_STATEMENT__STNAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EditorPackage.Literals.REPEAT_STATEMENT__STNAME));
			if(transientValues.isValueTransient(semanticObject, EditorPackage.Literals.REPEAT_STATEMENT__S1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EditorPackage.Literals.REPEAT_STATEMENT__S1));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRepeatStatementAccess().getStnameRepeatKeyword_0_0(), semanticObject.getStname());
		feeder.accept(grammarAccess.getRepeatStatementAccess().getS1StatementParserRuleCall_1_0(), semanticObject.getS1());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (stname='return' t2=Expression)
	 */
	protected void sequence_ReturnStatement(EObject context, ReturnStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EditorPackage.Literals.RETURN_STATEMENT__STNAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EditorPackage.Literals.RETURN_STATEMENT__STNAME));
			if(transientValues.isValueTransient(semanticObject, EditorPackage.Literals.RETURN_STATEMENT__T2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EditorPackage.Literals.RETURN_STATEMENT__T2));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getReturnStatementAccess().getStnameReturnKeyword_0_0(), semanticObject.getStname());
		feeder.accept(grammarAccess.getReturnStatementAccess().getT2ExpressionParserRuleCall_1_0(), semanticObject.getT2());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=SegmentExpression_SegmentExpression_1_0 op=SEG right=AdditiveExpression)
	 */
	protected void sequence_SegmentExpression(EObject context, SegmentExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (t=ConditionExpression t5=Block? t4=Statement?)
	 */
	protected void sequence_StatementExpression(EObject context, StatementExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         s1=Block | 
	 *         s3=StatementExpression | 
	 *         s4=IfStatement | 
	 *         s4b=IfElseStatement | 
	 *         s5=WhileStatement | 
	 *         s6=DoStatement | 
	 *         s7=ForStatement | 
	 *         s8=BreakStatement | 
	 *         s12=RepeatStatement | 
	 *         s9=IterateStatement | 
	 *         s10=ReturnStatement
	 *     )
	 */
	protected void sequence_Statement(EObject context, Statement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (t4=TypeExpression t25+=TypeExpression*)
	 */
	protected void sequence_TupleDefinition(EObject context, TupleDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         t=TypeLiteral | 
	 *         t2=PERCENT | 
	 *         t3='Type' | 
	 *         (b1?=LPAREN t4=TypeExpression? t16+=TypeExpression*) | 
	 *         (t5='Record' t6=TypeExpression t22+=TypeExpression? (t21+=TypeExpression t23+=TypeExpression?)*) | 
	 *         (t9='Union' t10=TypeExpression t25+=TypeExpression? (t24+=TypeExpression t26+=TypeExpression?)*) | 
	 *         (t11='Join' t12=TypeExpression t13+=TypeExpression*) | 
	 *         t15=TypeNameOrFunctionCall
	 *     )
	 */
	protected void sequence_TypeArguments(EObject context, TypeArguments semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (t2=TypeArguments t3=TypeResult)
	 */
	protected void sequence_TypeExpression(EObject context, TypeExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EditorPackage.Literals.TYPE_EXPRESSION__T2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EditorPackage.Literals.TYPE_EXPRESSION__T2));
			if(transientValues.isValueTransient(semanticObject, EditorPackage.Literals.TYPE_EXPRESSION__T3) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EditorPackage.Literals.TYPE_EXPRESSION__T3));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTypeExpressionAccess().getT2TypeArgumentsParserRuleCall_0_0_0_0(), semanticObject.getT2());
		feeder.accept(grammarAccess.getTypeExpressionAccess().getT3TypeResultParserRuleCall_0_0_2_0(), semanticObject.getT3());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (t1=INT | t22=STRING | t34=CharacterLiteral | t35=BooleanLiteral)
	 */
	protected void sequence_TypeLiteral(EObject context, TypeLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (tfnname=ID ((t4=TypeExpression? t25+=TypeExpression* (t44+=StatementExpression? t45+=Expression*)*) | t6=TypePrimaryExpression)?)
	 */
	protected void sequence_TypeNameOrFunctionCall(EObject context, TypeNameOrFunctionCall semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (tyname=LPAREN par=ID? par22+=TypeExpression? (par2+=ID par22+=TypeExpression?)*)
	 */
	protected void sequence_TypeParameterList(EObject context, TypeParameterList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         t32=PERCENT | 
	 *         tyname='Type' | 
	 *         tyname='Lisp' | 
	 *         t5=TypeExpression | 
	 *         (tyname='Record' t7=TypeExpression t8+=TypeExpression? (t21+=TypeExpression t23+=TypeExpression?)*) | 
	 *         (tyname='Union' t10=TypeExpression t11+=TypeExpression? (t24+=TypeExpression t26+=TypeExpression?)*) | 
	 *         (tyname='Join' t13=TypeExpression t14+=TypeExpression*)
	 *     )
	 */
	protected void sequence_TypePrimaryExpression(EObject context, TypePrimaryExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         t=TypeLiteral | 
	 *         t2=PERCENT | 
	 *         tyname='Type' | 
	 *         (tyname='Record' t7=TypeExpression t8+=TypeExpression? (t21+=TypeExpression t23+=TypeExpression?)*) | 
	 *         (tyname='Union' t10=TypeExpression t11+=TypeExpression? (t24+=TypeExpression t26+=TypeExpression?)*) | 
	 *         (tyname='Join' t12=TypeExpression t13+=TypeExpression*) | 
	 *         t15=TypeNameOrFunctionCall
	 *     )
	 */
	protected void sequence_TypeResult(EObject context, TypeResult semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((varName=ID | varNameSt=STRING)? typ=TypeExpression)
	 */
	protected void sequence_TypeWithName(EObject context, TypeWithName semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         e2=PERCENT | 
	 *         e3='Type' | 
	 *         (e5='Record' e6=TypeExpression e22+=TypeExpression? (e21+=TypeExpression e23+=TypeExpression?)*) | 
	 *         (e9='Union' e10=TypeExpression e25+=TypeExpression? (e24+=TypeExpression e26+=TypeExpression?)*) | 
	 *         (e11='Join' e12=TypeExpression e13+=TypeExpression*)
	 *     )
	 */
	protected void sequence_UnaryExpression(EObject context, Expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((uop=TILDE expr=UnaryExpression) | (uop=MINUS expr=UnaryExpression) | (uop=HASH expr=UnaryExpression) | (uop='not' expr=PrimaryExpression))
	 */
	protected void sequence_UnaryExpression(EObject context, UnaryExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (varName=ID t2+=ID* typ=TypeExpression? t4=Expression?)
	 */
	protected void sequence_VariableDeclarationAssign(EObject context, VariableDeclarationAssign semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (vardecbr=LBRACE vardecBlk+=VariableDeclaration*)
	 */
	protected void sequence_VariableDeclarationBlock(EObject context, VariableDeclarationBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (t1=Expression? (v1=TypeWithName | v2=VariableDeclarationBlock))
	 */
	protected void sequence_VariableDeclaration(EObject context, VariableDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((varName=ID | varNameSt=STRING) typ=TypeExpression?)
	 */
	protected void sequence_VariableTyped(EObject context, VariableTyped semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name='where' 
	 *         whereAssig+=WhereAssignments* 
	 *         (longname8=ID imp=TypeExpression? w8=WithPart)? 
	 *         (longname9=ID? (fs=ID par2=ID? par3+=ID*)? add=AddPart)?
	 *     )
	 */
	protected void sequence_WherePart(EObject context, WherePart semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (stname='while' t2=Expression s1=Statement)
	 */
	protected void sequence_WhileStatement(EObject context, WhileStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EditorPackage.Literals.WHILE_STATEMENT__STNAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EditorPackage.Literals.WHILE_STATEMENT__STNAME));
			if(transientValues.isValueTransient(semanticObject, EditorPackage.Literals.WHILE_STATEMENT__T2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EditorPackage.Literals.WHILE_STATEMENT__T2));
			if(transientValues.isValueTransient(semanticObject, EditorPackage.Literals.WHILE_STATEMENT__S1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EditorPackage.Literals.WHILE_STATEMENT__S1));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getWhileStatementAccess().getStnameWhileKeyword_0_0(), semanticObject.getStname());
		feeder.accept(grammarAccess.getWhileStatementAccess().getT2ExpressionParserRuleCall_1_0(), semanticObject.getT2());
		feeder.accept(grammarAccess.getWhileStatementAccess().getS1StatementParserRuleCall_4_0(), semanticObject.getS1());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name='with' fundec+=VariableDeclaration*)
	 */
	protected void sequence_WithPart(EObject context, WithPart semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
