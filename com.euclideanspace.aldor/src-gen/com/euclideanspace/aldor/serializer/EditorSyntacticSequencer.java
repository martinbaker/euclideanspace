package com.euclideanspace.aldor.serializer;

import com.euclideanspace.aldor.services.EditorGrammarAccess;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class EditorSyntacticSequencer extends AbstractSyntacticSequencer {

	protected EditorGrammarAccess grammarAccess;
	protected AbstractElementAlias match_BindingR_InfixedExprsDecl_AnyStatement_KW_2EQTerminalRuleCall_1_0_1_or_KW_ASSIGNTerminalRuleCall_1_0_0_or_KW_MAPSTOSTARTerminalRuleCall_1_0_4_or_KW_MAPSTOTerminalRuleCall_1_0_3_or_KW_MARROWTerminalRuleCall_1_0_2;
	protected AbstractElementAlias match_CurlyContentsList_Labeled_KW_SEMICOLONTerminalRuleCall_1_0_p;
	protected AbstractElementAlias match_CurlyContentsList_Labeled_KW_SEMICOLONTerminalRuleCall_2_a;
	protected AbstractElementAlias match_DeclPart_KW_COLONSTARTerminalRuleCall_1_0_or_KW_COLONTerminalRuleCall_0_0;
	protected AbstractElementAlias match_Declaration_ImportKeyword_9_1_or_InlineKeyword_8_1;
	protected AbstractElementAlias match_Flow_AnyStatement_ButKeyword_4_2_0_or_CatchKeyword_4_2_1;
	protected AbstractElementAlias match_Flow_BalStatement_ButKeyword_4_2_0_or_CatchKeyword_4_2_1;
	protected AbstractElementAlias match_ForLhs___FluidKeyword_0_2_or_FreeKeyword_0_0_or_LocalKeyword_0_1__q;
	protected AbstractElementAlias match_MacroBody_ImportKeyword_2_0_q;
	protected AbstractElementAlias match_enlister1a_Labeled_Semicolon_KW_SEMICOLONTerminalRuleCall_1_0_p;
	protected AbstractElementAlias match_enlister1a_Labeled_Semicolon_KW_SEMICOLONTerminalRuleCall_2_a;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (EditorGrammarAccess) access;
		match_BindingR_InfixedExprsDecl_AnyStatement_KW_2EQTerminalRuleCall_1_0_1_or_KW_ASSIGNTerminalRuleCall_1_0_0_or_KW_MAPSTOSTARTerminalRuleCall_1_0_4_or_KW_MAPSTOTerminalRuleCall_1_0_3_or_KW_MARROWTerminalRuleCall_1_0_2 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getBindingR_InfixedExprsDecl_AnyStatementAccess().getKW_2EQTerminalRuleCall_1_0_1()), new TokenAlias(false, false, grammarAccess.getBindingR_InfixedExprsDecl_AnyStatementAccess().getKW_ASSIGNTerminalRuleCall_1_0_0()), new TokenAlias(false, false, grammarAccess.getBindingR_InfixedExprsDecl_AnyStatementAccess().getKW_MAPSTOSTARTerminalRuleCall_1_0_4()), new TokenAlias(false, false, grammarAccess.getBindingR_InfixedExprsDecl_AnyStatementAccess().getKW_MAPSTOTerminalRuleCall_1_0_3()), new TokenAlias(false, false, grammarAccess.getBindingR_InfixedExprsDecl_AnyStatementAccess().getKW_MARROWTerminalRuleCall_1_0_2()));
		match_CurlyContentsList_Labeled_KW_SEMICOLONTerminalRuleCall_1_0_p = new TokenAlias(true, false, grammarAccess.getCurlyContentsList_LabeledAccess().getKW_SEMICOLONTerminalRuleCall_1_0());
		match_CurlyContentsList_Labeled_KW_SEMICOLONTerminalRuleCall_2_a = new TokenAlias(true, true, grammarAccess.getCurlyContentsList_LabeledAccess().getKW_SEMICOLONTerminalRuleCall_2());
		match_DeclPart_KW_COLONSTARTerminalRuleCall_1_0_or_KW_COLONTerminalRuleCall_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getDeclPartAccess().getKW_COLONSTARTerminalRuleCall_1_0()), new TokenAlias(false, false, grammarAccess.getDeclPartAccess().getKW_COLONTerminalRuleCall_0_0()));
		match_Declaration_ImportKeyword_9_1_or_InlineKeyword_8_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getDeclarationAccess().getImportKeyword_9_1()), new TokenAlias(false, false, grammarAccess.getDeclarationAccess().getInlineKeyword_8_1()));
		match_Flow_AnyStatement_ButKeyword_4_2_0_or_CatchKeyword_4_2_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getButKeyword_4_2_0()), new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getCatchKeyword_4_2_1()));
		match_Flow_BalStatement_ButKeyword_4_2_0_or_CatchKeyword_4_2_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getFlow_BalStatementAccess().getButKeyword_4_2_0()), new TokenAlias(false, false, grammarAccess.getFlow_BalStatementAccess().getCatchKeyword_4_2_1()));
		match_ForLhs___FluidKeyword_0_2_or_FreeKeyword_0_0_or_LocalKeyword_0_1__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getForLhsAccess().getFluidKeyword_0_2()), new TokenAlias(false, false, grammarAccess.getForLhsAccess().getFreeKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getForLhsAccess().getLocalKeyword_0_1()));
		match_MacroBody_ImportKeyword_2_0_q = new TokenAlias(false, true, grammarAccess.getMacroBodyAccess().getImportKeyword_2_0());
		match_enlister1a_Labeled_Semicolon_KW_SEMICOLONTerminalRuleCall_1_0_p = new TokenAlias(true, false, grammarAccess.getEnlister1a_Labeled_SemicolonAccess().getKW_SEMICOLONTerminalRuleCall_1_0());
		match_enlister1a_Labeled_Semicolon_KW_SEMICOLONTerminalRuleCall_2_a = new TokenAlias(true, true, grammarAccess.getEnlister1a_Labeled_SemicolonAccess().getKW_SEMICOLONTerminalRuleCall_2());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getArrowTokRule())
			return getArrowTokToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getKW_2EQRule())
			return getKW_2EQToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getKW_ASSIGNRule())
			return getKW_ASSIGNToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getKW_ATRule())
			return getKW_ATToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getKW_BARRule())
			return getKW_BARToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getKW_CBRACKRule())
			return getKW_CBRACKToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getKW_CCURLYRule())
			return getKW_CCURLYToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getKW_COLONRule())
			return getKW_COLONToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getKW_COLONSTARRule())
			return getKW_COLONSTARToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getKW_COMMARule())
			return getKW_COMMAToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getKW_CPARENRule())
			return getKW_CPARENToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getKW_DOLLARRule())
			return getKW_DOLLARToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getKW_DOTRule())
			return getKW_DOTToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getKW_MAPSTORule())
			return getKW_MAPSTOToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getKW_MAPSTOSTARRule())
			return getKW_MAPSTOSTARToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getKW_MARROWRule())
			return getKW_MARROWToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getKW_OCURLYRule())
			return getKW_OCURLYToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getKW_QUOTERule())
			return getKW_QUOTEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getKW_SEMICOLONRule())
			return getKW_SEMICOLONToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getLatticeTokRule())
			return getLatticeTokToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getPlusTokRule())
			return getPlusTokToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getPowerTokRule())
			return getPowerTokToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getQuotientTokRule())
			return getQuotientTokToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getRelationTokRule())
			return getRelationTokToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSegTokRule())
			return getSegTokToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getTimesTokRule())
			return getTimesTokToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * ArrowTok hidden(WS,KW_NEWLINE): KW_RARROW | KW_LARROW | KW_MAPSTAR ;
	 */
	protected String getArrowTokToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "->";
	}
	
	/**
	 * terminal KW_2EQ: '==';
	 */
	protected String getKW_2EQToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "==";
	}
	
	/**
	 * terminal KW_ASSIGN: ':=';
	 */
	protected String getKW_ASSIGNToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ":=";
	}
	
	/**
	 * terminal KW_AT: '@';
	 */
	protected String getKW_ATToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "@";
	}
	
	/**
	 * terminal KW_BAR: '|';
	 */
	protected String getKW_BARToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "|";
	}
	
	/**
	 * terminal KW_CBRACK: ']';
	 */
	protected String getKW_CBRACKToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "]";
	}
	
	/**
	 * terminal KW_CCURLY: '}';
	 */
	protected String getKW_CCURLYToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "}";
	}
	
	/**
	 * terminal KW_COLON: ':';
	 */
	protected String getKW_COLONToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ":";
	}
	
	/**
	 * terminal KW_COLONSTAR: ':*';
	 */
	protected String getKW_COLONSTARToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ":*";
	}
	
	/**
	 * terminal KW_COMMA: ',';
	 */
	protected String getKW_COMMAToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ",";
	}
	
	/**
	 * terminal KW_CPAREN: ')';
	 */
	protected String getKW_CPARENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ")";
	}
	
	/**
	 * terminal KW_DOLLAR: '$';
	 */
	protected String getKW_DOLLARToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "$";
	}
	
	/**
	 * terminal KW_DOT: '.';
	 */
	protected String getKW_DOTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ".";
	}
	
	/**
	 * terminal KW_MAPSTO: '+->';
	 */
	protected String getKW_MAPSTOToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "+->";
	}
	
	/**
	 * terminal KW_MAPSTOSTAR: '+->*';
	 */
	protected String getKW_MAPSTOSTARToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "+->*";
	}
	
	/**
	 * terminal KW_MARROW: '==>';
	 */
	protected String getKW_MARROWToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "==>";
	}
	
	/**
	 * terminal KW_OCURLY: '{';
	 */
	protected String getKW_OCURLYToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "{";
	}
	
	/**
	 * terminal KW_QUOTE: "'";
	 */
	protected String getKW_QUOTEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\'";
	}
	
	/**
	 * terminal KW_SEMICOLON: ';';
	 */
	protected String getKW_SEMICOLONToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ";";
	}
	
	/**
	 * LatticeTok hidden(WS,KW_NEWLINE): KW_VEE | KW_WEDGE ;
	 */
	protected String getLatticeTokToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\\/";
	}
	
	/**
	 * PlusTok hidden(WS,KW_NEWLINE): KW_PLUS | KW_MINUS | KW_PLUSMINUS ;
	 */
	protected String getPlusTokToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "+";
	}
	
	/**
	 * PowerTok hidden(WS,KW_NEWLINE): KW_2STAR | KW_HAT ;
	 */
	protected String getPowerTokToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "**";
	}
	
	/**
	 * QuotientTok hidden(WS,KW_NEWLINE):'mod' | 'quo' | 'rem' | 'exquo' ;
	 */
	protected String getQuotientTokToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "mod";
	}
	
	/**
	 * RelationTok hidden(WS,KW_NEWLINE):KW_EQ | KW_TILDEE | KW_HATE |
	 * KW_GE | KW_GT | KW_2GT |
	 * KW_LE | KW_LT | KW_2LT |
	 * 'is' | 'isnt' | 'case' ;
	 */
	protected String getRelationTokToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "=";
	}
	
	/**
	 * SegTok hidden(WS,KW_NEWLINE): KW_2DOT | 'by' ;
	 */
	protected String getSegTokToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "..";
	}
	
	/**
	 * TimesTok hidden(WS,KW_NEWLINE): KW_STAR | KW_SLASH | KW_BACKSLASH ;
	 */
	protected String getTimesTokToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "*";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_BindingR_InfixedExprsDecl_AnyStatement_KW_2EQTerminalRuleCall_1_0_1_or_KW_ASSIGNTerminalRuleCall_1_0_0_or_KW_MAPSTOSTARTerminalRuleCall_1_0_4_or_KW_MAPSTOTerminalRuleCall_1_0_3_or_KW_MARROWTerminalRuleCall_1_0_2.equals(syntax))
				emit_BindingR_InfixedExprsDecl_AnyStatement_KW_2EQTerminalRuleCall_1_0_1_or_KW_ASSIGNTerminalRuleCall_1_0_0_or_KW_MAPSTOSTARTerminalRuleCall_1_0_4_or_KW_MAPSTOTerminalRuleCall_1_0_3_or_KW_MARROWTerminalRuleCall_1_0_2(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_CurlyContentsList_Labeled_KW_SEMICOLONTerminalRuleCall_1_0_p.equals(syntax))
				emit_CurlyContentsList_Labeled_KW_SEMICOLONTerminalRuleCall_1_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_CurlyContentsList_Labeled_KW_SEMICOLONTerminalRuleCall_2_a.equals(syntax))
				emit_CurlyContentsList_Labeled_KW_SEMICOLONTerminalRuleCall_2_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_DeclPart_KW_COLONSTARTerminalRuleCall_1_0_or_KW_COLONTerminalRuleCall_0_0.equals(syntax))
				emit_DeclPart_KW_COLONSTARTerminalRuleCall_1_0_or_KW_COLONTerminalRuleCall_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Declaration_ImportKeyword_9_1_or_InlineKeyword_8_1.equals(syntax))
				emit_Declaration_ImportKeyword_9_1_or_InlineKeyword_8_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Flow_AnyStatement_ButKeyword_4_2_0_or_CatchKeyword_4_2_1.equals(syntax))
				emit_Flow_AnyStatement_ButKeyword_4_2_0_or_CatchKeyword_4_2_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Flow_BalStatement_ButKeyword_4_2_0_or_CatchKeyword_4_2_1.equals(syntax))
				emit_Flow_BalStatement_ButKeyword_4_2_0_or_CatchKeyword_4_2_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ForLhs___FluidKeyword_0_2_or_FreeKeyword_0_0_or_LocalKeyword_0_1__q.equals(syntax))
				emit_ForLhs___FluidKeyword_0_2_or_FreeKeyword_0_0_or_LocalKeyword_0_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MacroBody_ImportKeyword_2_0_q.equals(syntax))
				emit_MacroBody_ImportKeyword_2_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_enlister1a_Labeled_Semicolon_KW_SEMICOLONTerminalRuleCall_1_0_p.equals(syntax))
				emit_enlister1a_Labeled_Semicolon_KW_SEMICOLONTerminalRuleCall_1_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_enlister1a_Labeled_Semicolon_KW_SEMICOLONTerminalRuleCall_2_a.equals(syntax))
				emit_enlister1a_Labeled_Semicolon_KW_SEMICOLONTerminalRuleCall_2_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     KW_MAPSTOSTAR | KW_2EQ | KW_MARROW | KW_ASSIGN | KW_MAPSTO
	 */
	protected void emit_BindingR_InfixedExprsDecl_AnyStatement_KW_2EQTerminalRuleCall_1_0_1_or_KW_ASSIGNTerminalRuleCall_1_0_0_or_KW_MAPSTOSTARTerminalRuleCall_1_0_4_or_KW_MAPSTOTerminalRuleCall_1_0_3_or_KW_MARROWTerminalRuleCall_1_0_2(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     KW_SEMICOLON+
	 */
	protected void emit_CurlyContentsList_Labeled_KW_SEMICOLONTerminalRuleCall_1_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     KW_SEMICOLON*
	 */
	protected void emit_CurlyContentsList_Labeled_KW_SEMICOLONTerminalRuleCall_2_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     KW_COLONSTAR | KW_COLON
	 */
	protected void emit_DeclPart_KW_COLONSTARTerminalRuleCall_1_0_or_KW_COLONTerminalRuleCall_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'import' | 'inline'
	 */
	protected void emit_Declaration_ImportKeyword_9_1_or_InlineKeyword_8_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'but' | 'catch'
	 */
	protected void emit_Flow_AnyStatement_ButKeyword_4_2_0_or_CatchKeyword_4_2_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'catch' | 'but'
	 */
	protected void emit_Flow_BalStatement_ButKeyword_4_2_0_or_CatchKeyword_4_2_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('fluid' | 'free' | 'local')?
	 */
	protected void emit_ForLhs___FluidKeyword_0_2_or_FreeKeyword_0_0_or_LocalKeyword_0_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'import'?
	 */
	protected void emit_MacroBody_ImportKeyword_2_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     KW_SEMICOLON+
	 */
	protected void emit_enlister1a_Labeled_Semicolon_KW_SEMICOLONTerminalRuleCall_1_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     KW_SEMICOLON*
	 */
	protected void emit_enlister1a_Labeled_Semicolon_KW_SEMICOLONTerminalRuleCall_2_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
