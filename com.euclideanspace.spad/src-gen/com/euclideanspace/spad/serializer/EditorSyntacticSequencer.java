package com.euclideanspace.spad.serializer;

import com.euclideanspace.spad.services.EditorGrammarAccess;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class EditorSyntacticSequencer extends AbstractSyntacticSequencer {

	protected EditorGrammarAccess grammarAccess;
	protected AbstractElementAlias match_AddPart_NLTerminalRuleCall_1_a;
	protected AbstractElementAlias match_AddPart_NLTerminalRuleCall_3_a;
	protected AbstractElementAlias match_AddPart_NLTerminalRuleCall_6_a;
	protected AbstractElementAlias match_AddPart___NLTerminalRuleCall_4_1_0_or_SEMICOLONTerminalRuleCall_4_1_1__p;
	protected AbstractElementAlias match_Block_NLTerminalRuleCall_1_a;
	protected AbstractElementAlias match_Block___NLTerminalRuleCall_2_1_0_or_SEMICOLONTerminalRuleCall_2_1_1__p;
	protected AbstractElementAlias match_CategoryDef_NLTerminalRuleCall_8_1_1_a;
	protected AbstractElementAlias match_CategoryDef_NLTerminalRuleCall_8_1_5_a;
	protected AbstractElementAlias match_DoStatement_NLTerminalRuleCall_3_q;
	protected AbstractElementAlias match_ForStatement_NLTerminalRuleCall_3_q;
	protected AbstractElementAlias match_ForStatement_SEGTerminalRuleCall_1_3_q;
	protected AbstractElementAlias match_ForStatement_SEGTerminalRuleCall_1_4_4_q;
	protected AbstractElementAlias match_FunctionDefinitionBlock_NLTerminalRuleCall_1_a;
	protected AbstractElementAlias match_FunctionDefinitionBlock___NLTerminalRuleCall_2_0_1_0_or_SEMICOLONTerminalRuleCall_2_0_1_1__p;
	protected AbstractElementAlias match_FunctionDefinitionBlock___NLTerminalRuleCall_2_1_4_0_or_SEMICOLONTerminalRuleCall_2_1_4_1__p;
	protected AbstractElementAlias match_IfStatement_NLTerminalRuleCall_2_1_1_p;
	protected AbstractElementAlias match_IfStatement_NLTerminalRuleCall_2_1_4_a;
	protected AbstractElementAlias match_IfStatement_NLTerminalRuleCall_2_1_5_2_a;
	protected AbstractElementAlias match_NameOrFunctionCall_ApostropheKeyword_0_q;
	protected AbstractElementAlias match_NameOrFunctionCall___LPARENTerminalRuleCall_3_0_0_0_RPARENTerminalRuleCall_3_0_0_3___LPARENTerminalRuleCall_3_0_1_0_RPARENTerminalRuleCall_3_0_1_3__a__q;
	protected AbstractElementAlias match_NameOrFunctionCall___LPARENTerminalRuleCall_3_0_1_0_RPARENTerminalRuleCall_3_0_1_3__a;
	protected AbstractElementAlias match_NameOrFunctionCall___RPARENTerminalRuleCall_3_0_1_3_LPARENTerminalRuleCall_3_0_1_0__a;
	protected AbstractElementAlias match_NameOrFunctionCall___RPARENTerminalRuleCall_3_0_1_3_LPARENTerminalRuleCall_3_0_1_0__p;
	protected AbstractElementAlias match_TypeArguments___IDTerminalRuleCall_3_1_0_0_COLONTerminalRuleCall_3_1_0_1__q;
	protected AbstractElementAlias match_TypeArguments___IDTerminalRuleCall_3_2_1_0_COLONTerminalRuleCall_3_2_1_1__q;
	protected AbstractElementAlias match_TypeNameOrFunctionCall___IDTerminalRuleCall_1_0_0_1_0_COLONTerminalRuleCall_1_0_0_1_1__q;
	protected AbstractElementAlias match_TypeNameOrFunctionCall___IDTerminalRuleCall_1_0_0_3_1_0_COLONTerminalRuleCall_1_0_0_3_1_1__q;
	protected AbstractElementAlias match_TypeNameOrFunctionCall___LPARENTerminalRuleCall_1_0_0_0___IDTerminalRuleCall_1_0_0_1_0_COLONTerminalRuleCall_1_0_0_1_1__q_RPARENTerminalRuleCall_1_0_0_4___LPARENTerminalRuleCall_1_0_1_0_RPARENTerminalRuleCall_1_0_1_3__a__q;
	protected AbstractElementAlias match_TypeNameOrFunctionCall___LPARENTerminalRuleCall_1_0_1_0_RPARENTerminalRuleCall_1_0_1_3__a;
	protected AbstractElementAlias match_TypeNameOrFunctionCall___RPARENTerminalRuleCall_1_0_1_3_LPARENTerminalRuleCall_1_0_1_0__a;
	protected AbstractElementAlias match_TypeNameOrFunctionCall___RPARENTerminalRuleCall_1_0_1_3_LPARENTerminalRuleCall_1_0_1_0__p;
	protected AbstractElementAlias match_VariableDeclarationBlock_NLTerminalRuleCall_1_a;
	protected AbstractElementAlias match_VariableDeclarationBlock___NLTerminalRuleCall_2_1_0_or_SEMICOLONTerminalRuleCall_2_1_1__p;
	protected AbstractElementAlias match_WherePart_DEFTerminalRuleCall_5_1_0_0_or_MDEFTerminalRuleCall_5_1_0_1;
	protected AbstractElementAlias match_WherePart_DEFTerminalRuleCall_6_0_1_0_or_MDEFTerminalRuleCall_6_0_1_1;
	protected AbstractElementAlias match_WherePart_NLTerminalRuleCall_1_a;
	protected AbstractElementAlias match_WherePart_NLTerminalRuleCall_3_a;
	protected AbstractElementAlias match_WherePart_NLTerminalRuleCall_8_p;
	protected AbstractElementAlias match_WherePart___DEFTerminalRuleCall_5_1_0_0_or_MDEFTerminalRuleCall_5_1_0_1__q;
	protected AbstractElementAlias match_WherePart___NLTerminalRuleCall_4_1_0_or_SEMICOLONTerminalRuleCall_4_1_1__p;
	protected AbstractElementAlias match_WhileStatement_NLTerminalRuleCall_3_q;
	protected AbstractElementAlias match_WithPart_NLTerminalRuleCall_1_a;
	protected AbstractElementAlias match_WithPart_NLTerminalRuleCall_3_a;
	protected AbstractElementAlias match_WithPart_NLTerminalRuleCall_6_a;
	protected AbstractElementAlias match_WithPart___NLTerminalRuleCall_4_1_0_or_SEMICOLONTerminalRuleCall_4_1_1__p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (EditorGrammarAccess) access;
		match_AddPart_NLTerminalRuleCall_1_a = new TokenAlias(true, true, grammarAccess.getAddPartAccess().getNLTerminalRuleCall_1());
		match_AddPart_NLTerminalRuleCall_3_a = new TokenAlias(true, true, grammarAccess.getAddPartAccess().getNLTerminalRuleCall_3());
		match_AddPart_NLTerminalRuleCall_6_a = new TokenAlias(true, true, grammarAccess.getAddPartAccess().getNLTerminalRuleCall_6());
		match_AddPart___NLTerminalRuleCall_4_1_0_or_SEMICOLONTerminalRuleCall_4_1_1__p = new AlternativeAlias(true, false, new TokenAlias(false, false, grammarAccess.getAddPartAccess().getNLTerminalRuleCall_4_1_0()), new TokenAlias(false, false, grammarAccess.getAddPartAccess().getSEMICOLONTerminalRuleCall_4_1_1()));
		match_Block_NLTerminalRuleCall_1_a = new TokenAlias(true, true, grammarAccess.getBlockAccess().getNLTerminalRuleCall_1());
		match_Block___NLTerminalRuleCall_2_1_0_or_SEMICOLONTerminalRuleCall_2_1_1__p = new AlternativeAlias(true, false, new TokenAlias(false, false, grammarAccess.getBlockAccess().getNLTerminalRuleCall_2_1_0()), new TokenAlias(false, false, grammarAccess.getBlockAccess().getSEMICOLONTerminalRuleCall_2_1_1()));
		match_CategoryDef_NLTerminalRuleCall_8_1_1_a = new TokenAlias(true, true, grammarAccess.getCategoryDefAccess().getNLTerminalRuleCall_8_1_1());
		match_CategoryDef_NLTerminalRuleCall_8_1_5_a = new TokenAlias(true, true, grammarAccess.getCategoryDefAccess().getNLTerminalRuleCall_8_1_5());
		match_DoStatement_NLTerminalRuleCall_3_q = new TokenAlias(false, true, grammarAccess.getDoStatementAccess().getNLTerminalRuleCall_3());
		match_ForStatement_NLTerminalRuleCall_3_q = new TokenAlias(false, true, grammarAccess.getForStatementAccess().getNLTerminalRuleCall_3());
		match_ForStatement_SEGTerminalRuleCall_1_3_q = new TokenAlias(false, true, grammarAccess.getForStatementAccess().getSEGTerminalRuleCall_1_3());
		match_ForStatement_SEGTerminalRuleCall_1_4_4_q = new TokenAlias(false, true, grammarAccess.getForStatementAccess().getSEGTerminalRuleCall_1_4_4());
		match_FunctionDefinitionBlock_NLTerminalRuleCall_1_a = new TokenAlias(true, true, grammarAccess.getFunctionDefinitionBlockAccess().getNLTerminalRuleCall_1());
		match_FunctionDefinitionBlock___NLTerminalRuleCall_2_0_1_0_or_SEMICOLONTerminalRuleCall_2_0_1_1__p = new AlternativeAlias(true, false, new TokenAlias(false, false, grammarAccess.getFunctionDefinitionBlockAccess().getNLTerminalRuleCall_2_0_1_0()), new TokenAlias(false, false, grammarAccess.getFunctionDefinitionBlockAccess().getSEMICOLONTerminalRuleCall_2_0_1_1()));
		match_FunctionDefinitionBlock___NLTerminalRuleCall_2_1_4_0_or_SEMICOLONTerminalRuleCall_2_1_4_1__p = new AlternativeAlias(true, false, new TokenAlias(false, false, grammarAccess.getFunctionDefinitionBlockAccess().getNLTerminalRuleCall_2_1_4_0()), new TokenAlias(false, false, grammarAccess.getFunctionDefinitionBlockAccess().getSEMICOLONTerminalRuleCall_2_1_4_1()));
		match_IfStatement_NLTerminalRuleCall_2_1_1_p = new TokenAlias(true, false, grammarAccess.getIfStatementAccess().getNLTerminalRuleCall_2_1_1());
		match_IfStatement_NLTerminalRuleCall_2_1_4_a = new TokenAlias(true, true, grammarAccess.getIfStatementAccess().getNLTerminalRuleCall_2_1_4());
		match_IfStatement_NLTerminalRuleCall_2_1_5_2_a = new TokenAlias(true, true, grammarAccess.getIfStatementAccess().getNLTerminalRuleCall_2_1_5_2());
		match_NameOrFunctionCall_ApostropheKeyword_0_q = new TokenAlias(false, true, grammarAccess.getNameOrFunctionCallAccess().getApostropheKeyword_0());
		match_NameOrFunctionCall___LPARENTerminalRuleCall_3_0_0_0_RPARENTerminalRuleCall_3_0_0_3___LPARENTerminalRuleCall_3_0_1_0_RPARENTerminalRuleCall_3_0_1_3__a__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getNameOrFunctionCallAccess().getLPARENTerminalRuleCall_3_0_0_0()), new TokenAlias(false, false, grammarAccess.getNameOrFunctionCallAccess().getRPARENTerminalRuleCall_3_0_0_3()), new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getNameOrFunctionCallAccess().getLPARENTerminalRuleCall_3_0_1_0()), new TokenAlias(false, false, grammarAccess.getNameOrFunctionCallAccess().getRPARENTerminalRuleCall_3_0_1_3())));
		match_NameOrFunctionCall___LPARENTerminalRuleCall_3_0_1_0_RPARENTerminalRuleCall_3_0_1_3__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getNameOrFunctionCallAccess().getLPARENTerminalRuleCall_3_0_1_0()), new TokenAlias(false, false, grammarAccess.getNameOrFunctionCallAccess().getRPARENTerminalRuleCall_3_0_1_3()));
		match_NameOrFunctionCall___RPARENTerminalRuleCall_3_0_1_3_LPARENTerminalRuleCall_3_0_1_0__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getNameOrFunctionCallAccess().getRPARENTerminalRuleCall_3_0_1_3()), new TokenAlias(false, false, grammarAccess.getNameOrFunctionCallAccess().getLPARENTerminalRuleCall_3_0_1_0()));
		match_NameOrFunctionCall___RPARENTerminalRuleCall_3_0_1_3_LPARENTerminalRuleCall_3_0_1_0__p = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getNameOrFunctionCallAccess().getRPARENTerminalRuleCall_3_0_1_3()), new TokenAlias(false, false, grammarAccess.getNameOrFunctionCallAccess().getLPARENTerminalRuleCall_3_0_1_0()));
		match_TypeArguments___IDTerminalRuleCall_3_1_0_0_COLONTerminalRuleCall_3_1_0_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getTypeArgumentsAccess().getIDTerminalRuleCall_3_1_0_0()), new TokenAlias(false, false, grammarAccess.getTypeArgumentsAccess().getCOLONTerminalRuleCall_3_1_0_1()));
		match_TypeArguments___IDTerminalRuleCall_3_2_1_0_COLONTerminalRuleCall_3_2_1_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getTypeArgumentsAccess().getIDTerminalRuleCall_3_2_1_0()), new TokenAlias(false, false, grammarAccess.getTypeArgumentsAccess().getCOLONTerminalRuleCall_3_2_1_1()));
		match_TypeNameOrFunctionCall___IDTerminalRuleCall_1_0_0_1_0_COLONTerminalRuleCall_1_0_0_1_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getTypeNameOrFunctionCallAccess().getIDTerminalRuleCall_1_0_0_1_0()), new TokenAlias(false, false, grammarAccess.getTypeNameOrFunctionCallAccess().getCOLONTerminalRuleCall_1_0_0_1_1()));
		match_TypeNameOrFunctionCall___IDTerminalRuleCall_1_0_0_3_1_0_COLONTerminalRuleCall_1_0_0_3_1_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getTypeNameOrFunctionCallAccess().getIDTerminalRuleCall_1_0_0_3_1_0()), new TokenAlias(false, false, grammarAccess.getTypeNameOrFunctionCallAccess().getCOLONTerminalRuleCall_1_0_0_3_1_1()));
		match_TypeNameOrFunctionCall___LPARENTerminalRuleCall_1_0_0_0___IDTerminalRuleCall_1_0_0_1_0_COLONTerminalRuleCall_1_0_0_1_1__q_RPARENTerminalRuleCall_1_0_0_4___LPARENTerminalRuleCall_1_0_1_0_RPARENTerminalRuleCall_1_0_1_3__a__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getTypeNameOrFunctionCallAccess().getLPARENTerminalRuleCall_1_0_0_0()), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getTypeNameOrFunctionCallAccess().getIDTerminalRuleCall_1_0_0_1_0()), new TokenAlias(false, false, grammarAccess.getTypeNameOrFunctionCallAccess().getCOLONTerminalRuleCall_1_0_0_1_1())), new TokenAlias(false, false, grammarAccess.getTypeNameOrFunctionCallAccess().getRPARENTerminalRuleCall_1_0_0_4()), new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getTypeNameOrFunctionCallAccess().getLPARENTerminalRuleCall_1_0_1_0()), new TokenAlias(false, false, grammarAccess.getTypeNameOrFunctionCallAccess().getRPARENTerminalRuleCall_1_0_1_3())));
		match_TypeNameOrFunctionCall___LPARENTerminalRuleCall_1_0_1_0_RPARENTerminalRuleCall_1_0_1_3__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getTypeNameOrFunctionCallAccess().getLPARENTerminalRuleCall_1_0_1_0()), new TokenAlias(false, false, grammarAccess.getTypeNameOrFunctionCallAccess().getRPARENTerminalRuleCall_1_0_1_3()));
		match_TypeNameOrFunctionCall___RPARENTerminalRuleCall_1_0_1_3_LPARENTerminalRuleCall_1_0_1_0__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getTypeNameOrFunctionCallAccess().getRPARENTerminalRuleCall_1_0_1_3()), new TokenAlias(false, false, grammarAccess.getTypeNameOrFunctionCallAccess().getLPARENTerminalRuleCall_1_0_1_0()));
		match_TypeNameOrFunctionCall___RPARENTerminalRuleCall_1_0_1_3_LPARENTerminalRuleCall_1_0_1_0__p = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getTypeNameOrFunctionCallAccess().getRPARENTerminalRuleCall_1_0_1_3()), new TokenAlias(false, false, grammarAccess.getTypeNameOrFunctionCallAccess().getLPARENTerminalRuleCall_1_0_1_0()));
		match_VariableDeclarationBlock_NLTerminalRuleCall_1_a = new TokenAlias(true, true, grammarAccess.getVariableDeclarationBlockAccess().getNLTerminalRuleCall_1());
		match_VariableDeclarationBlock___NLTerminalRuleCall_2_1_0_or_SEMICOLONTerminalRuleCall_2_1_1__p = new AlternativeAlias(true, false, new TokenAlias(false, false, grammarAccess.getVariableDeclarationBlockAccess().getNLTerminalRuleCall_2_1_0()), new TokenAlias(false, false, grammarAccess.getVariableDeclarationBlockAccess().getSEMICOLONTerminalRuleCall_2_1_1()));
		match_WherePart_DEFTerminalRuleCall_5_1_0_0_or_MDEFTerminalRuleCall_5_1_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getWherePartAccess().getDEFTerminalRuleCall_5_1_0_0()), new TokenAlias(false, false, grammarAccess.getWherePartAccess().getMDEFTerminalRuleCall_5_1_0_1()));
		match_WherePart_DEFTerminalRuleCall_6_0_1_0_or_MDEFTerminalRuleCall_6_0_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getWherePartAccess().getDEFTerminalRuleCall_6_0_1_0()), new TokenAlias(false, false, grammarAccess.getWherePartAccess().getMDEFTerminalRuleCall_6_0_1_1()));
		match_WherePart_NLTerminalRuleCall_1_a = new TokenAlias(true, true, grammarAccess.getWherePartAccess().getNLTerminalRuleCall_1());
		match_WherePart_NLTerminalRuleCall_3_a = new TokenAlias(true, true, grammarAccess.getWherePartAccess().getNLTerminalRuleCall_3());
		match_WherePart_NLTerminalRuleCall_8_p = new TokenAlias(true, false, grammarAccess.getWherePartAccess().getNLTerminalRuleCall_8());
		match_WherePart___DEFTerminalRuleCall_5_1_0_0_or_MDEFTerminalRuleCall_5_1_0_1__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getWherePartAccess().getDEFTerminalRuleCall_5_1_0_0()), new TokenAlias(false, false, grammarAccess.getWherePartAccess().getMDEFTerminalRuleCall_5_1_0_1()));
		match_WherePart___NLTerminalRuleCall_4_1_0_or_SEMICOLONTerminalRuleCall_4_1_1__p = new AlternativeAlias(true, false, new TokenAlias(false, false, grammarAccess.getWherePartAccess().getNLTerminalRuleCall_4_1_0()), new TokenAlias(false, false, grammarAccess.getWherePartAccess().getSEMICOLONTerminalRuleCall_4_1_1()));
		match_WhileStatement_NLTerminalRuleCall_3_q = new TokenAlias(false, true, grammarAccess.getWhileStatementAccess().getNLTerminalRuleCall_3());
		match_WithPart_NLTerminalRuleCall_1_a = new TokenAlias(true, true, grammarAccess.getWithPartAccess().getNLTerminalRuleCall_1());
		match_WithPart_NLTerminalRuleCall_3_a = new TokenAlias(true, true, grammarAccess.getWithPartAccess().getNLTerminalRuleCall_3());
		match_WithPart_NLTerminalRuleCall_6_a = new TokenAlias(true, true, grammarAccess.getWithPartAccess().getNLTerminalRuleCall_6());
		match_WithPart___NLTerminalRuleCall_4_1_0_or_SEMICOLONTerminalRuleCall_4_1_1__p = new AlternativeAlias(true, false, new TokenAlias(false, false, grammarAccess.getWithPartAccess().getNLTerminalRuleCall_4_1_0()), new TokenAlias(false, false, grammarAccess.getWithPartAccess().getSEMICOLONTerminalRuleCall_4_1_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getARROWRule())
			return getARROWToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getATRule())
			return getATToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getBECOMESRule())
			return getBECOMESToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getCOLONRule())
			return getCOLONToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getCOMMARule())
			return getCOMMAToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getDEFRule())
			return getDEFToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getEXITRule())
			return getEXITToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getIDRule())
			return getIDToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getLBRACERule())
			return getLBRACEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getLPARENRule())
			return getLPARENToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getMACROVALUERule())
			return getMACROVALUEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getMDEFRule())
			return getMDEFToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getNLRule())
			return getNLToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getRBRACERule())
			return getRBRACEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getRBRACKETRule())
			return getRBRACKETToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getRPARENRule())
			return getRPARENToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSEGRule())
			return getSEGToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSEMICOLONRule())
			return getSEMICOLONToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getWSRule())
			return getWSToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal ARROW: '->';
	 */
	protected String getARROWToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "->";
	}
	
	/**
	 * terminal AT: '@';
	 */
	protected String getATToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "@";
	}
	
	/**
	 * terminal BECOMES: ':=';
	 */
	protected String getBECOMESToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ":=";
	}
	
	/**
	 * terminal COLON: ':';
	 */
	protected String getCOLONToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ":";
	}
	
	/**
	 * terminal COMMA: ',';
	 */
	protected String getCOMMAToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ",";
	}
	
	/**
	 * terminal DEF: '==';
	 */
	protected String getDEFToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "==";
	}
	
	/**
	 * terminal EXIT: '=>';
	 */
	protected String getEXITToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "=>";
	}
	
	/**
	 * terminal ID : ('a'..'z'|'A'..'Z'|('_'.)) ('a'..'z'|'A'..'Z'|('_'.)|'0'..'9')*'!'?'?'?;
	 */
	protected String getIDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * terminal LBRACE: '{';
	 */
	protected String getLBRACEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "{";
	}
	
	/**
	 * terminal LPAREN: '(';
	 */
	protected String getLPARENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "(";
	}
	
	/**
	 * terminal MACROVALUE :
	 *   '===>' !('\n'|'\r')*;
	 */
	protected String getMACROVALUEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "===>";
	}
	
	/**
	 * terminal MDEF: '==>';
	 */
	protected String getMDEFToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "==>";
	}
	
	/**
	 * terminal NL: ('\r'|'\n') ;
	 */
	protected String getNLToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\r";
	}
	
	/**
	 * terminal RBRACE: '}';
	 */
	protected String getRBRACEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "}";
	}
	
	/**
	 * terminal RBRACKET: ']';
	 */
	protected String getRBRACKETToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "]";
	}
	
	/**
	 * terminal RPAREN: ')';
	 */
	protected String getRPARENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ")";
	}
	
	/**
	 * terminal SEG: '..';
	 */
	protected String getSEGToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "..";
	}
	
	/**
	 * terminal SEMICOLON: ';';
	 */
	protected String getSEMICOLONToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ";";
	}
	
	/**
	 * terminal WS : (' '|'\t')+;
	 */
	protected String getWSToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return " ";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_AddPart_NLTerminalRuleCall_1_a.equals(syntax))
				emit_AddPart_NLTerminalRuleCall_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AddPart_NLTerminalRuleCall_3_a.equals(syntax))
				emit_AddPart_NLTerminalRuleCall_3_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AddPart_NLTerminalRuleCall_6_a.equals(syntax))
				emit_AddPart_NLTerminalRuleCall_6_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AddPart___NLTerminalRuleCall_4_1_0_or_SEMICOLONTerminalRuleCall_4_1_1__p.equals(syntax))
				emit_AddPart___NLTerminalRuleCall_4_1_0_or_SEMICOLONTerminalRuleCall_4_1_1__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Block_NLTerminalRuleCall_1_a.equals(syntax))
				emit_Block_NLTerminalRuleCall_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Block___NLTerminalRuleCall_2_1_0_or_SEMICOLONTerminalRuleCall_2_1_1__p.equals(syntax))
				emit_Block___NLTerminalRuleCall_2_1_0_or_SEMICOLONTerminalRuleCall_2_1_1__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_CategoryDef_NLTerminalRuleCall_8_1_1_a.equals(syntax))
				emit_CategoryDef_NLTerminalRuleCall_8_1_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_CategoryDef_NLTerminalRuleCall_8_1_5_a.equals(syntax))
				emit_CategoryDef_NLTerminalRuleCall_8_1_5_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_DoStatement_NLTerminalRuleCall_3_q.equals(syntax))
				emit_DoStatement_NLTerminalRuleCall_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ForStatement_NLTerminalRuleCall_3_q.equals(syntax))
				emit_ForStatement_NLTerminalRuleCall_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ForStatement_SEGTerminalRuleCall_1_3_q.equals(syntax))
				emit_ForStatement_SEGTerminalRuleCall_1_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ForStatement_SEGTerminalRuleCall_1_4_4_q.equals(syntax))
				emit_ForStatement_SEGTerminalRuleCall_1_4_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunctionDefinitionBlock_NLTerminalRuleCall_1_a.equals(syntax))
				emit_FunctionDefinitionBlock_NLTerminalRuleCall_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunctionDefinitionBlock___NLTerminalRuleCall_2_0_1_0_or_SEMICOLONTerminalRuleCall_2_0_1_1__p.equals(syntax))
				emit_FunctionDefinitionBlock___NLTerminalRuleCall_2_0_1_0_or_SEMICOLONTerminalRuleCall_2_0_1_1__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunctionDefinitionBlock___NLTerminalRuleCall_2_1_4_0_or_SEMICOLONTerminalRuleCall_2_1_4_1__p.equals(syntax))
				emit_FunctionDefinitionBlock___NLTerminalRuleCall_2_1_4_0_or_SEMICOLONTerminalRuleCall_2_1_4_1__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_IfStatement_NLTerminalRuleCall_2_1_1_p.equals(syntax))
				emit_IfStatement_NLTerminalRuleCall_2_1_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_IfStatement_NLTerminalRuleCall_2_1_4_a.equals(syntax))
				emit_IfStatement_NLTerminalRuleCall_2_1_4_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_IfStatement_NLTerminalRuleCall_2_1_5_2_a.equals(syntax))
				emit_IfStatement_NLTerminalRuleCall_2_1_5_2_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_NameOrFunctionCall_ApostropheKeyword_0_q.equals(syntax))
				emit_NameOrFunctionCall_ApostropheKeyword_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_NameOrFunctionCall___LPARENTerminalRuleCall_3_0_0_0_RPARENTerminalRuleCall_3_0_0_3___LPARENTerminalRuleCall_3_0_1_0_RPARENTerminalRuleCall_3_0_1_3__a__q.equals(syntax))
				emit_NameOrFunctionCall___LPARENTerminalRuleCall_3_0_0_0_RPARENTerminalRuleCall_3_0_0_3___LPARENTerminalRuleCall_3_0_1_0_RPARENTerminalRuleCall_3_0_1_3__a__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_NameOrFunctionCall___LPARENTerminalRuleCall_3_0_1_0_RPARENTerminalRuleCall_3_0_1_3__a.equals(syntax))
				emit_NameOrFunctionCall___LPARENTerminalRuleCall_3_0_1_0_RPARENTerminalRuleCall_3_0_1_3__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_NameOrFunctionCall___RPARENTerminalRuleCall_3_0_1_3_LPARENTerminalRuleCall_3_0_1_0__a.equals(syntax))
				emit_NameOrFunctionCall___RPARENTerminalRuleCall_3_0_1_3_LPARENTerminalRuleCall_3_0_1_0__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_NameOrFunctionCall___RPARENTerminalRuleCall_3_0_1_3_LPARENTerminalRuleCall_3_0_1_0__p.equals(syntax))
				emit_NameOrFunctionCall___RPARENTerminalRuleCall_3_0_1_3_LPARENTerminalRuleCall_3_0_1_0__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TypeArguments___IDTerminalRuleCall_3_1_0_0_COLONTerminalRuleCall_3_1_0_1__q.equals(syntax))
				emit_TypeArguments___IDTerminalRuleCall_3_1_0_0_COLONTerminalRuleCall_3_1_0_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TypeArguments___IDTerminalRuleCall_3_2_1_0_COLONTerminalRuleCall_3_2_1_1__q.equals(syntax))
				emit_TypeArguments___IDTerminalRuleCall_3_2_1_0_COLONTerminalRuleCall_3_2_1_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TypeNameOrFunctionCall___IDTerminalRuleCall_1_0_0_1_0_COLONTerminalRuleCall_1_0_0_1_1__q.equals(syntax))
				emit_TypeNameOrFunctionCall___IDTerminalRuleCall_1_0_0_1_0_COLONTerminalRuleCall_1_0_0_1_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TypeNameOrFunctionCall___IDTerminalRuleCall_1_0_0_3_1_0_COLONTerminalRuleCall_1_0_0_3_1_1__q.equals(syntax))
				emit_TypeNameOrFunctionCall___IDTerminalRuleCall_1_0_0_3_1_0_COLONTerminalRuleCall_1_0_0_3_1_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TypeNameOrFunctionCall___LPARENTerminalRuleCall_1_0_0_0___IDTerminalRuleCall_1_0_0_1_0_COLONTerminalRuleCall_1_0_0_1_1__q_RPARENTerminalRuleCall_1_0_0_4___LPARENTerminalRuleCall_1_0_1_0_RPARENTerminalRuleCall_1_0_1_3__a__q.equals(syntax))
				emit_TypeNameOrFunctionCall___LPARENTerminalRuleCall_1_0_0_0___IDTerminalRuleCall_1_0_0_1_0_COLONTerminalRuleCall_1_0_0_1_1__q_RPARENTerminalRuleCall_1_0_0_4___LPARENTerminalRuleCall_1_0_1_0_RPARENTerminalRuleCall_1_0_1_3__a__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TypeNameOrFunctionCall___LPARENTerminalRuleCall_1_0_1_0_RPARENTerminalRuleCall_1_0_1_3__a.equals(syntax))
				emit_TypeNameOrFunctionCall___LPARENTerminalRuleCall_1_0_1_0_RPARENTerminalRuleCall_1_0_1_3__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TypeNameOrFunctionCall___RPARENTerminalRuleCall_1_0_1_3_LPARENTerminalRuleCall_1_0_1_0__a.equals(syntax))
				emit_TypeNameOrFunctionCall___RPARENTerminalRuleCall_1_0_1_3_LPARENTerminalRuleCall_1_0_1_0__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TypeNameOrFunctionCall___RPARENTerminalRuleCall_1_0_1_3_LPARENTerminalRuleCall_1_0_1_0__p.equals(syntax))
				emit_TypeNameOrFunctionCall___RPARENTerminalRuleCall_1_0_1_3_LPARENTerminalRuleCall_1_0_1_0__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_VariableDeclarationBlock_NLTerminalRuleCall_1_a.equals(syntax))
				emit_VariableDeclarationBlock_NLTerminalRuleCall_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_VariableDeclarationBlock___NLTerminalRuleCall_2_1_0_or_SEMICOLONTerminalRuleCall_2_1_1__p.equals(syntax))
				emit_VariableDeclarationBlock___NLTerminalRuleCall_2_1_0_or_SEMICOLONTerminalRuleCall_2_1_1__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_WherePart_DEFTerminalRuleCall_5_1_0_0_or_MDEFTerminalRuleCall_5_1_0_1.equals(syntax))
				emit_WherePart_DEFTerminalRuleCall_5_1_0_0_or_MDEFTerminalRuleCall_5_1_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_WherePart_DEFTerminalRuleCall_6_0_1_0_or_MDEFTerminalRuleCall_6_0_1_1.equals(syntax))
				emit_WherePart_DEFTerminalRuleCall_6_0_1_0_or_MDEFTerminalRuleCall_6_0_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_WherePart_NLTerminalRuleCall_1_a.equals(syntax))
				emit_WherePart_NLTerminalRuleCall_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_WherePart_NLTerminalRuleCall_3_a.equals(syntax))
				emit_WherePart_NLTerminalRuleCall_3_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_WherePart_NLTerminalRuleCall_8_p.equals(syntax))
				emit_WherePart_NLTerminalRuleCall_8_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_WherePart___DEFTerminalRuleCall_5_1_0_0_or_MDEFTerminalRuleCall_5_1_0_1__q.equals(syntax))
				emit_WherePart___DEFTerminalRuleCall_5_1_0_0_or_MDEFTerminalRuleCall_5_1_0_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_WherePart___NLTerminalRuleCall_4_1_0_or_SEMICOLONTerminalRuleCall_4_1_1__p.equals(syntax))
				emit_WherePart___NLTerminalRuleCall_4_1_0_or_SEMICOLONTerminalRuleCall_4_1_1__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_WhileStatement_NLTerminalRuleCall_3_q.equals(syntax))
				emit_WhileStatement_NLTerminalRuleCall_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_WithPart_NLTerminalRuleCall_1_a.equals(syntax))
				emit_WithPart_NLTerminalRuleCall_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_WithPart_NLTerminalRuleCall_3_a.equals(syntax))
				emit_WithPart_NLTerminalRuleCall_3_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_WithPart_NLTerminalRuleCall_6_a.equals(syntax))
				emit_WithPart_NLTerminalRuleCall_6_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_WithPart___NLTerminalRuleCall_4_1_0_or_SEMICOLONTerminalRuleCall_4_1_1__p.equals(syntax))
				emit_WithPart___NLTerminalRuleCall_4_1_0_or_SEMICOLONTerminalRuleCall_4_1_1__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     NL*
	 */
	protected void emit_AddPart_NLTerminalRuleCall_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     NL*
	 */
	protected void emit_AddPart_NLTerminalRuleCall_3_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     NL*
	 */
	protected void emit_AddPart_NLTerminalRuleCall_6_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (SEMICOLON | NL)+
	 */
	protected void emit_AddPart___NLTerminalRuleCall_4_1_0_or_SEMICOLONTerminalRuleCall_4_1_1__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     NL*
	 */
	protected void emit_Block_NLTerminalRuleCall_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (SEMICOLON | NL)+
	 */
	protected void emit_Block___NLTerminalRuleCall_2_1_0_or_SEMICOLONTerminalRuleCall_2_1_1__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     NL*
	 */
	protected void emit_CategoryDef_NLTerminalRuleCall_8_1_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     NL*
	 */
	protected void emit_CategoryDef_NLTerminalRuleCall_8_1_5_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     NL?
	 */
	protected void emit_DoStatement_NLTerminalRuleCall_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     NL?
	 */
	protected void emit_ForStatement_NLTerminalRuleCall_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SEG?
	 */
	protected void emit_ForStatement_SEGTerminalRuleCall_1_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SEG?
	 */
	protected void emit_ForStatement_SEGTerminalRuleCall_1_4_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     NL*
	 */
	protected void emit_FunctionDefinitionBlock_NLTerminalRuleCall_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (NL | SEMICOLON)+
	 */
	protected void emit_FunctionDefinitionBlock___NLTerminalRuleCall_2_0_1_0_or_SEMICOLONTerminalRuleCall_2_0_1_1__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (SEMICOLON | NL)+
	 */
	protected void emit_FunctionDefinitionBlock___NLTerminalRuleCall_2_1_4_0_or_SEMICOLONTerminalRuleCall_2_1_4_1__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     NL+
	 */
	protected void emit_IfStatement_NLTerminalRuleCall_2_1_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     NL*
	 */
	protected void emit_IfStatement_NLTerminalRuleCall_2_1_4_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     NL*
	 */
	protected void emit_IfStatement_NLTerminalRuleCall_2_1_5_2_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '''?
	 */
	protected void emit_NameOrFunctionCall_ApostropheKeyword_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (LPAREN RPAREN (LPAREN RPAREN)*)?
	 */
	protected void emit_NameOrFunctionCall___LPARENTerminalRuleCall_3_0_0_0_RPARENTerminalRuleCall_3_0_0_3___LPARENTerminalRuleCall_3_0_1_0_RPARENTerminalRuleCall_3_0_1_3__a__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (LPAREN RPAREN)*
	 */
	protected void emit_NameOrFunctionCall___LPARENTerminalRuleCall_3_0_1_0_RPARENTerminalRuleCall_3_0_1_3__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (RPAREN LPAREN)*
	 */
	protected void emit_NameOrFunctionCall___RPARENTerminalRuleCall_3_0_1_3_LPARENTerminalRuleCall_3_0_1_0__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (RPAREN LPAREN)+
	 */
	protected void emit_NameOrFunctionCall___RPARENTerminalRuleCall_3_0_1_3_LPARENTerminalRuleCall_3_0_1_0__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (ID COLON)?
	 */
	protected void emit_TypeArguments___IDTerminalRuleCall_3_1_0_0_COLONTerminalRuleCall_3_1_0_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (ID COLON)?
	 */
	protected void emit_TypeArguments___IDTerminalRuleCall_3_2_1_0_COLONTerminalRuleCall_3_2_1_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (ID COLON)?
	 */
	protected void emit_TypeNameOrFunctionCall___IDTerminalRuleCall_1_0_0_1_0_COLONTerminalRuleCall_1_0_0_1_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (ID COLON)?
	 */
	protected void emit_TypeNameOrFunctionCall___IDTerminalRuleCall_1_0_0_3_1_0_COLONTerminalRuleCall_1_0_0_3_1_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (LPAREN (ID COLON)? RPAREN (LPAREN RPAREN)*)?
	 */
	protected void emit_TypeNameOrFunctionCall___LPARENTerminalRuleCall_1_0_0_0___IDTerminalRuleCall_1_0_0_1_0_COLONTerminalRuleCall_1_0_0_1_1__q_RPARENTerminalRuleCall_1_0_0_4___LPARENTerminalRuleCall_1_0_1_0_RPARENTerminalRuleCall_1_0_1_3__a__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (LPAREN RPAREN)*
	 */
	protected void emit_TypeNameOrFunctionCall___LPARENTerminalRuleCall_1_0_1_0_RPARENTerminalRuleCall_1_0_1_3__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (RPAREN LPAREN)*
	 */
	protected void emit_TypeNameOrFunctionCall___RPARENTerminalRuleCall_1_0_1_3_LPARENTerminalRuleCall_1_0_1_0__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (RPAREN LPAREN)+
	 */
	protected void emit_TypeNameOrFunctionCall___RPARENTerminalRuleCall_1_0_1_3_LPARENTerminalRuleCall_1_0_1_0__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     NL*
	 */
	protected void emit_VariableDeclarationBlock_NLTerminalRuleCall_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (NL | SEMICOLON)+
	 */
	protected void emit_VariableDeclarationBlock___NLTerminalRuleCall_2_1_0_or_SEMICOLONTerminalRuleCall_2_1_1__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     DEF | MDEF
	 */
	protected void emit_WherePart_DEFTerminalRuleCall_5_1_0_0_or_MDEFTerminalRuleCall_5_1_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     DEF | MDEF
	 */
	protected void emit_WherePart_DEFTerminalRuleCall_6_0_1_0_or_MDEFTerminalRuleCall_6_0_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     NL*
	 */
	protected void emit_WherePart_NLTerminalRuleCall_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     NL*
	 */
	protected void emit_WherePart_NLTerminalRuleCall_3_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     NL+
	 */
	protected void emit_WherePart_NLTerminalRuleCall_8_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (DEF | MDEF)?
	 */
	protected void emit_WherePart___DEFTerminalRuleCall_5_1_0_0_or_MDEFTerminalRuleCall_5_1_0_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (NL | SEMICOLON)+
	 */
	protected void emit_WherePart___NLTerminalRuleCall_4_1_0_or_SEMICOLONTerminalRuleCall_4_1_1__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     NL?
	 */
	protected void emit_WhileStatement_NLTerminalRuleCall_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     NL*
	 */
	protected void emit_WithPart_NLTerminalRuleCall_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     NL*
	 */
	protected void emit_WithPart_NLTerminalRuleCall_3_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     NL*
	 */
	protected void emit_WithPart_NLTerminalRuleCall_6_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (NL | SEMICOLON)+
	 */
	protected void emit_WithPart___NLTerminalRuleCall_4_1_0_or_SEMICOLONTerminalRuleCall_4_1_1__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
