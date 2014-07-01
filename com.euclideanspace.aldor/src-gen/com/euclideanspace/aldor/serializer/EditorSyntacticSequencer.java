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
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class EditorSyntacticSequencer extends AbstractSyntacticSequencer {

	protected EditorGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Bracketed_Parened_KW_OBRACKTerminalRuleCall_1_0_or_KW_OPARENTerminalRuleCall_1_0;
	protected AbstractElementAlias match_CurlyContentsList_Labeled_KW_SEMICOLONTerminalRuleCall_2_q;
	protected AbstractElementAlias match_Jleft_Molecule_NotKeyword_0_0_q;
	protected AbstractElementAlias match_Labeled_CommaParserRuleCall_0_or_DeclarationParserRuleCall_1;
	protected AbstractElementAlias match_QualOp_ArrowTok_QualOp_LatticeTok_QualOp_PlusTok_QualOp_PowerTok_QualOp_QuotientTok_QualOp_RelationTok_QualOp_SegTok_QualOp_TimesTok___ArrowTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1___or___LatticeTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1___or___PlusTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1___or___PowerTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1___or___QuotientTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1___or___RelationTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1___or___SegTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1___or___TimesTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1__;
	protected AbstractElementAlias match_enlister1a_Labeled_Semicolon_KW_SEMICOLONTerminalRuleCall_2_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (EditorGrammarAccess) access;
		match_Bracketed_Parened_KW_OBRACKTerminalRuleCall_1_0_or_KW_OPARENTerminalRuleCall_1_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getBracketedAccess().getKW_OBRACKTerminalRuleCall_1_0()), new TokenAlias(false, false, grammarAccess.getParenedAccess().getKW_OPARENTerminalRuleCall_1_0()));
		match_CurlyContentsList_Labeled_KW_SEMICOLONTerminalRuleCall_2_q = new TokenAlias(false, true, grammarAccess.getCurlyContentsList_LabeledAccess().getKW_SEMICOLONTerminalRuleCall_2());
		match_Jleft_Molecule_NotKeyword_0_0_q = new TokenAlias(false, true, grammarAccess.getJleft_MoleculeAccess().getNotKeyword_0_0());
		match_Labeled_CommaParserRuleCall_0_or_DeclarationParserRuleCall_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getLabeledAccess().getCommaParserRuleCall_0()), new TokenAlias(false, false, grammarAccess.getLabeledAccess().getDeclarationParserRuleCall_1()));
		match_QualOp_ArrowTok_QualOp_LatticeTok_QualOp_PlusTok_QualOp_PowerTok_QualOp_QuotientTok_QualOp_RelationTok_QualOp_SegTok_QualOp_TimesTok___ArrowTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1___or___LatticeTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1___or___PlusTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1___or___PowerTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1___or___QuotientTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1___or___RelationTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1___or___SegTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1___or___TimesTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getQualOp_ArrowTokAccess().getArrowTokParserRuleCall_1_0()), new TokenAlias(false, false, grammarAccess.getQualOp_ArrowTokAccess().getKW_DOLLARTerminalRuleCall_1_1())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getQualOp_LatticeTokAccess().getLatticeTokParserRuleCall_1_0()), new TokenAlias(false, false, grammarAccess.getQualOp_LatticeTokAccess().getKW_DOLLARTerminalRuleCall_1_1())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getQualOp_PlusTokAccess().getPlusTokParserRuleCall_1_0()), new TokenAlias(false, false, grammarAccess.getQualOp_PlusTokAccess().getKW_DOLLARTerminalRuleCall_1_1())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getQualOp_PowerTokAccess().getPowerTokParserRuleCall_1_0()), new TokenAlias(false, false, grammarAccess.getQualOp_PowerTokAccess().getKW_DOLLARTerminalRuleCall_1_1())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getQualOp_QuotientTokAccess().getQuotientTokParserRuleCall_1_0()), new TokenAlias(false, false, grammarAccess.getQualOp_QuotientTokAccess().getKW_DOLLARTerminalRuleCall_1_1())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getQualOp_RelationTokAccess().getRelationTokParserRuleCall_1_0()), new TokenAlias(false, false, grammarAccess.getQualOp_RelationTokAccess().getKW_DOLLARTerminalRuleCall_1_1())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getQualOp_SegTokAccess().getSegTokParserRuleCall_1_0()), new TokenAlias(false, false, grammarAccess.getQualOp_SegTokAccess().getKW_DOLLARTerminalRuleCall_1_1())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getQualOp_TimesTokAccess().getTimesTokParserRuleCall_1_0()), new TokenAlias(false, false, grammarAccess.getQualOp_TimesTokAccess().getKW_DOLLARTerminalRuleCall_1_1())));
		match_enlister1a_Labeled_Semicolon_KW_SEMICOLONTerminalRuleCall_2_q = new TokenAlias(false, true, grammarAccess.getEnlister1a_Labeled_SemicolonAccess().getKW_SEMICOLONTerminalRuleCall_2());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getArrowTokRule())
			return getArrowTokToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getBlockRule())
			return getBlockToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getCommaRule())
			return getCommaToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getDeclarationRule())
			return getDeclarationToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getKW_ATRule())
			return getKW_ATToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getKW_CBRACKRule())
			return getKW_CBRACKToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getKW_CCURLYRule())
			return getKW_CCURLYToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getKW_COMMARule())
			return getKW_COMMAToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getKW_CPARENRule())
			return getKW_CPARENToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getKW_DOLLARRule())
			return getKW_DOLLARToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getKW_DOTRule())
			return getKW_DOTToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getKW_OBRACKRule())
			return getKW_OBRACKToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getKW_OCURLYRule())
			return getKW_OCURLYToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getKW_OPARENRule())
			return getKW_OPARENToken(semanticObject, ruleCall, node);
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
	 * ArrowTok: KW_RARROW | KW_LARROW | KW_MAPSTAR ;
	 */
	protected String getArrowTokToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "->";
	}
	
	/**
	 * Block hidden(WS,KW_NEWLINE):
	 * 	'temp65'
	 * ;
	 */
	protected String getBlockToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "temp65";
	}
	
	/**
	 * Comma hidden(WS,KW_NEWLINE):
	 *   enlist1_CommaItem_Comma_AB
	 * ;
	 */
	protected String getCommaToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "temp19";
	}
	
	/**
	 * Declaration hidden(WS,KW_NEWLINE):
	 *  'macro' MacroBody
	 * | 'extend' Sig
	 * | 'local' Sig
	 * | 'free' Sig
	 * | 'fluid' Sig
	 * | 'default' Sig
	 * | 'define' Sig
	 * | 'fix' Sig
	 * | 'inline' Sig? FromPart?
	 * | 'import' Sig? FromPart?
	 * | ExportDecl
	 * ;
	 */
	protected String getDeclarationToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "macrotemp32";
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
	 * terminal KW_OBRACK: '[';
	 */
	protected String getKW_OBRACKToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "[";
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
	 * terminal KW_OPAREN: '(';
	 */
	protected String getKW_OPARENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "(";
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
	 * LatticeTok: KW_VEE | KW_WEDGE ;
	 */
	protected String getLatticeTokToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\\/";
	}
	
	/**
	 * PlusTok: KW_PLUS | KW_MINUS | KW_PLUSMINUS ;
	 */
	protected String getPlusTokToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "+";
	}
	
	/**
	 * PowerTok: KW_2STAR | KW_HAT ;
	 */
	protected String getPowerTokToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "**";
	}
	
	/**
	 * QuotientTok:'mod' | 'quo' | 'rem' | 'exquo' ;
	 */
	protected String getQuotientTokToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "mod";
	}
	
	/**
	 * RelationTok:KW_EQ | KW_TILDEE | KW_HATE |
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
	 * SegTok: KW_2DOT | 'by' ;
	 */
	protected String getSegTokToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "..";
	}
	
	/**
	 * TimesTok: KW_STAR | KW_SLASH | KW_BACKSLASH ;
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
			if(match_Bracketed_Parened_KW_OBRACKTerminalRuleCall_1_0_or_KW_OPARENTerminalRuleCall_1_0.equals(syntax))
				emit_Bracketed_Parened_KW_OBRACKTerminalRuleCall_1_0_or_KW_OPARENTerminalRuleCall_1_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_CurlyContentsList_Labeled_KW_SEMICOLONTerminalRuleCall_2_q.equals(syntax))
				emit_CurlyContentsList_Labeled_KW_SEMICOLONTerminalRuleCall_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Jleft_Molecule_NotKeyword_0_0_q.equals(syntax))
				emit_Jleft_Molecule_NotKeyword_0_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Labeled_CommaParserRuleCall_0_or_DeclarationParserRuleCall_1.equals(syntax))
				emit_Labeled_CommaParserRuleCall_0_or_DeclarationParserRuleCall_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_QualOp_ArrowTok_QualOp_LatticeTok_QualOp_PlusTok_QualOp_PowerTok_QualOp_QuotientTok_QualOp_RelationTok_QualOp_SegTok_QualOp_TimesTok___ArrowTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1___or___LatticeTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1___or___PlusTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1___or___PowerTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1___or___QuotientTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1___or___RelationTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1___or___SegTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1___or___TimesTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1__.equals(syntax))
				emit_QualOp_ArrowTok_QualOp_LatticeTok_QualOp_PlusTok_QualOp_PowerTok_QualOp_QuotientTok_QualOp_RelationTok_QualOp_SegTok_QualOp_TimesTok___ArrowTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1___or___LatticeTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1___or___PlusTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1___or___PowerTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1___or___QuotientTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1___or___RelationTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1___or___SegTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1___or___TimesTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_enlister1a_Labeled_Semicolon_KW_SEMICOLONTerminalRuleCall_2_q.equals(syntax))
				emit_enlister1a_Labeled_Semicolon_KW_SEMICOLONTerminalRuleCall_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     KW_OPAREN | KW_OBRACK
	 */
	protected void emit_Bracketed_Parened_KW_OBRACKTerminalRuleCall_1_0_or_KW_OPARENTerminalRuleCall_1_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     KW_SEMICOLON?
	 */
	protected void emit_CurlyContentsList_Labeled_KW_SEMICOLONTerminalRuleCall_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'not'?
	 */
	protected void emit_Jleft_Molecule_NotKeyword_0_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     Comma | Declaration
	 */
	protected void emit_Labeled_CommaParserRuleCall_0_or_DeclarationParserRuleCall_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (
	     (RelationTok KW_DOLLAR) | 
	     (PowerTok KW_DOLLAR) | 
	     (ArrowTok KW_DOLLAR) | 
	     (LatticeTok KW_DOLLAR) | 
	     (QuotientTok KW_DOLLAR) | 
	     (TimesTok KW_DOLLAR) | 
	     (PlusTok KW_DOLLAR) | 
	     (SegTok KW_DOLLAR)
	 )
	 */
	protected void emit_QualOp_ArrowTok_QualOp_LatticeTok_QualOp_PlusTok_QualOp_PowerTok_QualOp_QuotientTok_QualOp_RelationTok_QualOp_SegTok_QualOp_TimesTok___ArrowTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1___or___LatticeTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1___or___PlusTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1___or___PowerTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1___or___QuotientTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1___or___RelationTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1___or___SegTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1___or___TimesTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     KW_SEMICOLON?
	 */
	protected void emit_enlister1a_Labeled_Semicolon_KW_SEMICOLONTerminalRuleCall_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
