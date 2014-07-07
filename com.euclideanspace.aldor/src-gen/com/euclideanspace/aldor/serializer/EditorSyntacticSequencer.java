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
	protected AbstractElementAlias match_AlwaysPart_AnyStatement_AlwaysKeyword_0_0_or_FinallyKeyword_1_0;
	protected AbstractElementAlias match_AlwaysPart_BalStatement_AlwaysKeyword_0_0_or_FinallyKeyword_1_0;
	protected AbstractElementAlias match_AnyStatement_Flow_AnyStatement_GenBound___AssertKeyword_10_0_or_DelayKeyword_7_0_or_DoKeyword_6_0_or_ExceptKeyword_15_0_or_IfKeyword_0_0_0_or_IfKeyword_1_0_or_ReferenceKeyword_8_0_or_RepeatKeyword_3_0_or_ReturnKeyword_13_0_or_SelectKeyword_5_0_or_ThrowKeyword_16_0_or_TryKeyword_4_0_or_YieldKeyword_14_0__q_or___GenerateKeyword_9_0_ToKeyword_0__;
	protected AbstractElementAlias match_AnyStatement_Flow_AnyStatement_GenBound___AssertKeyword_10_0_or_DelayKeyword_7_0_or_DoKeyword_6_0_or_ExceptKeyword_15_0_or_IfKeyword_0_0_0_or_IfKeyword_1_0_or_ReferenceKeyword_8_0_or_RepeatKeyword_3_0_or_SelectKeyword_5_0_or_ThrowKeyword_16_0_or_TryKeyword_4_0_or_YieldKeyword_14_0___or___GenerateKeyword_9_0_ToKeyword_0__;
	protected AbstractElementAlias match_Bracketed_Parened_KW_OBRACKTerminalRuleCall_1_0_or_KW_OPARENTerminalRuleCall_1_0;
	protected AbstractElementAlias match_CurlyContentsList_Labeled_KW_SEMICOLONTerminalRuleCall_2_q;
	protected AbstractElementAlias match_DeclPart_KW_COLONSTARTerminalRuleCall_1_0_or_KW_COLONTerminalRuleCall_0_0;
	protected AbstractElementAlias match_Declaration_ExportDecl_MacroBody___DefaultKeyword_5_0_or_DefineKeyword_6_0_or_ExtendKeyword_1_0_or_FixKeyword_7_0_or_FluidKeyword_4_0_or_FreeKeyword_3_0_or_ImportKeyword_9_0_or_InlineKeyword_8_0_or_LocalKeyword_2_0___or___MacroKeyword_0_0_q_ImportKeyword_2_0_q___or___MacroKeyword_0_0_q___ExportKeyword_0_0_or_ExportKeyword_1_0_0_or_ExportKeyword_2_0_0____;
	protected AbstractElementAlias match_Declaration_ImportKeyword_9_0_or_InlineKeyword_8_0;
	protected AbstractElementAlias match_Declaration_MacroKeyword_0_0_q;
	protected AbstractElementAlias match_ExportDecl_ExportKeyword_0_0_or_ExportKeyword_1_0_0_or_ExportKeyword_2_0_0;
	protected AbstractElementAlias match_ExportDecl_MacroBody___ExportKeyword_0_0_or_ExportKeyword_1_0_0_or_ExportKeyword_2_0_0_or_ImportKeyword_2_0__q;
	protected AbstractElementAlias match_Flow_AnyStatement_BreakKeyword_12_0_or_GotoKeyword_17_0_or_IterateKeyword_11_0;
	protected AbstractElementAlias match_Flow_AnyStatement_BreakKeyword_12_0_or_IterateKeyword_11_0;
	protected AbstractElementAlias match_Flow_AnyStatement_BreakKeyword_12_0_or_IterateKeyword_11_0_or_NeverKeyword_18_or_ReturnKeyword_13_0;
	protected AbstractElementAlias match_Flow_AnyStatement_ButKeyword_4_2_0_or_CatchKeyword_4_2_1;
	protected AbstractElementAlias match_Flow_AnyStatement_GenBound___AssertKeyword_10_0_or_DelayKeyword_7_0_or_DoKeyword_6_0_or_ExceptKeyword_15_0_or_IfKeyword_1_0_or_ReferenceKeyword_8_0_or_RepeatKeyword_3_0_or_ReturnKeyword_13_0_or_SelectKeyword_5_0_or_ThrowKeyword_16_0_or_TryKeyword_4_0_or_YieldKeyword_14_0__q_or___GenerateKeyword_9_0_ToKeyword_0__;
	protected AbstractElementAlias match_Flow_AnyStatement_GenBound___AssertKeyword_10_0_or_DelayKeyword_7_0_or_DoKeyword_6_0_or_ExceptKeyword_15_0_or_IfKeyword_1_0_or_ReferenceKeyword_8_0_or_RepeatKeyword_3_0_or_SelectKeyword_5_0_or_ThrowKeyword_16_0_or_TryKeyword_4_0_or_YieldKeyword_14_0___or___GenerateKeyword_9_0_ToKeyword_0__;
	protected AbstractElementAlias match_Flow_BalStatement_BreakKeyword_12_0_or_GotoKeyword_17_0_or_IterateKeyword_11_0;
	protected AbstractElementAlias match_Flow_BalStatement_BreakKeyword_12_0_or_IterateKeyword_11_0;
	protected AbstractElementAlias match_Flow_BalStatement_BreakKeyword_12_0_or_IterateKeyword_11_0_or_NeverKeyword_18_or_ReturnKeyword_13_0;
	protected AbstractElementAlias match_Flow_BalStatement_ButKeyword_4_2_0_or_CatchKeyword_4_2_1;
	protected AbstractElementAlias match_Flow_BalStatement_GenBound_IfKeyword_1_0_q_or_ReturnKeyword_13_0_q_or_SelectKeyword_5_0_q_or_TryKeyword_4_0_q_or___GenerateKeyword_9_0_ToKeyword_0__;
	protected AbstractElementAlias match_Flow_BalStatement_GenBound___GenerateKeyword_9_0_ToKeyword_0___or___IfKeyword_1_0_or_ReturnKeyword_13_0_or_SelectKeyword_5_0_or_TryKeyword_4_0__q;
	protected AbstractElementAlias match_Flow_BalStatement_GenBound___GenerateKeyword_9_0_ToKeyword_0___or___IfKeyword_1_0_or_SelectKeyword_5_0_or_TryKeyword_4_0__;
	protected AbstractElementAlias match_ForLhs___FluidKeyword_0_2_or_FreeKeyword_0_0_or_LocalKeyword_0_1__q;
	protected AbstractElementAlias match_QualOp_ArrowTok_QualOp_LatticeTok_QualOp_PlusTok_QualOp_PowerTok_QualOp_QuotientTok_QualOp_SegTok_QualOp_TimesTok___ArrowTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1___or___LatticeTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1___or___PlusTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1___or___PowerTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1___or___QuotientTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1___or___SegTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1___or___TimesTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1__;
	protected AbstractElementAlias match_enlister1a_Labeled_Semicolon_KW_SEMICOLONTerminalRuleCall_2_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (EditorGrammarAccess) access;
		match_AlwaysPart_AnyStatement_AlwaysKeyword_0_0_or_FinallyKeyword_1_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getAlwaysPart_AnyStatementAccess().getAlwaysKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getAlwaysPart_AnyStatementAccess().getFinallyKeyword_1_0()));
		match_AlwaysPart_BalStatement_AlwaysKeyword_0_0_or_FinallyKeyword_1_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getAlwaysPart_BalStatementAccess().getAlwaysKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getAlwaysPart_BalStatementAccess().getFinallyKeyword_1_0()));
		match_AnyStatement_Flow_AnyStatement_GenBound___AssertKeyword_10_0_or_DelayKeyword_7_0_or_DoKeyword_6_0_or_ExceptKeyword_15_0_or_IfKeyword_0_0_0_or_IfKeyword_1_0_or_ReferenceKeyword_8_0_or_RepeatKeyword_3_0_or_ReturnKeyword_13_0_or_SelectKeyword_5_0_or_ThrowKeyword_16_0_or_TryKeyword_4_0_or_YieldKeyword_14_0__q_or___GenerateKeyword_9_0_ToKeyword_0__ = new AlternativeAlias(false, false, new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getAnyStatementAccess().getIfKeyword_0_0_0()), new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getAssertKeyword_10_0()), new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getDelayKeyword_7_0()), new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getDoKeyword_6_0()), new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getExceptKeyword_15_0()), new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getIfKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getReferenceKeyword_8_0()), new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getRepeatKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getReturnKeyword_13_0()), new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getSelectKeyword_5_0()), new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getThrowKeyword_16_0()), new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getTryKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getYieldKeyword_14_0())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getGenerateKeyword_9_0()), new TokenAlias(false, false, grammarAccess.getGenBoundAccess().getToKeyword_0())));
		match_AnyStatement_Flow_AnyStatement_GenBound___AssertKeyword_10_0_or_DelayKeyword_7_0_or_DoKeyword_6_0_or_ExceptKeyword_15_0_or_IfKeyword_0_0_0_or_IfKeyword_1_0_or_ReferenceKeyword_8_0_or_RepeatKeyword_3_0_or_SelectKeyword_5_0_or_ThrowKeyword_16_0_or_TryKeyword_4_0_or_YieldKeyword_14_0___or___GenerateKeyword_9_0_ToKeyword_0__ = new AlternativeAlias(false, false, new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getAnyStatementAccess().getIfKeyword_0_0_0()), new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getAssertKeyword_10_0()), new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getDelayKeyword_7_0()), new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getDoKeyword_6_0()), new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getExceptKeyword_15_0()), new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getIfKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getReferenceKeyword_8_0()), new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getRepeatKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getSelectKeyword_5_0()), new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getThrowKeyword_16_0()), new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getTryKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getYieldKeyword_14_0())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getGenerateKeyword_9_0()), new TokenAlias(false, false, grammarAccess.getGenBoundAccess().getToKeyword_0())));
		match_Bracketed_Parened_KW_OBRACKTerminalRuleCall_1_0_or_KW_OPARENTerminalRuleCall_1_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getBracketedAccess().getKW_OBRACKTerminalRuleCall_1_0()), new TokenAlias(false, false, grammarAccess.getParenedAccess().getKW_OPARENTerminalRuleCall_1_0()));
		match_CurlyContentsList_Labeled_KW_SEMICOLONTerminalRuleCall_2_q = new TokenAlias(false, true, grammarAccess.getCurlyContentsList_LabeledAccess().getKW_SEMICOLONTerminalRuleCall_2());
		match_DeclPart_KW_COLONSTARTerminalRuleCall_1_0_or_KW_COLONTerminalRuleCall_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getDeclPartAccess().getKW_COLONSTARTerminalRuleCall_1_0()), new TokenAlias(false, false, grammarAccess.getDeclPartAccess().getKW_COLONTerminalRuleCall_0_0()));
		match_Declaration_ExportDecl_MacroBody___DefaultKeyword_5_0_or_DefineKeyword_6_0_or_ExtendKeyword_1_0_or_FixKeyword_7_0_or_FluidKeyword_4_0_or_FreeKeyword_3_0_or_ImportKeyword_9_0_or_InlineKeyword_8_0_or_LocalKeyword_2_0___or___MacroKeyword_0_0_q_ImportKeyword_2_0_q___or___MacroKeyword_0_0_q___ExportKeyword_0_0_or_ExportKeyword_1_0_0_or_ExportKeyword_2_0_0____ = new AlternativeAlias(false, false, new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getDeclarationAccess().getDefaultKeyword_5_0()), new TokenAlias(false, false, grammarAccess.getDeclarationAccess().getDefineKeyword_6_0()), new TokenAlias(false, false, grammarAccess.getDeclarationAccess().getExtendKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getDeclarationAccess().getFixKeyword_7_0()), new TokenAlias(false, false, grammarAccess.getDeclarationAccess().getFluidKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getDeclarationAccess().getFreeKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getDeclarationAccess().getImportKeyword_9_0()), new TokenAlias(false, false, grammarAccess.getDeclarationAccess().getInlineKeyword_8_0()), new TokenAlias(false, false, grammarAccess.getDeclarationAccess().getLocalKeyword_2_0())), new GroupAlias(false, false, new TokenAlias(false, true, grammarAccess.getDeclarationAccess().getMacroKeyword_0_0()), new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getExportDeclAccess().getExportKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getExportDeclAccess().getExportKeyword_1_0_0()), new TokenAlias(false, false, grammarAccess.getExportDeclAccess().getExportKeyword_2_0_0()))), new GroupAlias(false, false, new TokenAlias(false, true, grammarAccess.getDeclarationAccess().getMacroKeyword_0_0()), new TokenAlias(false, true, grammarAccess.getMacroBodyAccess().getImportKeyword_2_0())));
		match_Declaration_ImportKeyword_9_0_or_InlineKeyword_8_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getDeclarationAccess().getImportKeyword_9_0()), new TokenAlias(false, false, grammarAccess.getDeclarationAccess().getInlineKeyword_8_0()));
		match_Declaration_MacroKeyword_0_0_q = new TokenAlias(false, true, grammarAccess.getDeclarationAccess().getMacroKeyword_0_0());
		match_ExportDecl_ExportKeyword_0_0_or_ExportKeyword_1_0_0_or_ExportKeyword_2_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getExportDeclAccess().getExportKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getExportDeclAccess().getExportKeyword_1_0_0()), new TokenAlias(false, false, grammarAccess.getExportDeclAccess().getExportKeyword_2_0_0()));
		match_ExportDecl_MacroBody___ExportKeyword_0_0_or_ExportKeyword_1_0_0_or_ExportKeyword_2_0_0_or_ImportKeyword_2_0__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getExportDeclAccess().getExportKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getExportDeclAccess().getExportKeyword_1_0_0()), new TokenAlias(false, false, grammarAccess.getExportDeclAccess().getExportKeyword_2_0_0()), new TokenAlias(false, false, grammarAccess.getMacroBodyAccess().getImportKeyword_2_0()));
		match_Flow_AnyStatement_BreakKeyword_12_0_or_GotoKeyword_17_0_or_IterateKeyword_11_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getBreakKeyword_12_0()), new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getGotoKeyword_17_0()), new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getIterateKeyword_11_0()));
		match_Flow_AnyStatement_BreakKeyword_12_0_or_IterateKeyword_11_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getBreakKeyword_12_0()), new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getIterateKeyword_11_0()));
		match_Flow_AnyStatement_BreakKeyword_12_0_or_IterateKeyword_11_0_or_NeverKeyword_18_or_ReturnKeyword_13_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getBreakKeyword_12_0()), new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getIterateKeyword_11_0()), new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getNeverKeyword_18()), new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getReturnKeyword_13_0()));
		match_Flow_AnyStatement_ButKeyword_4_2_0_or_CatchKeyword_4_2_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getButKeyword_4_2_0()), new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getCatchKeyword_4_2_1()));
		match_Flow_AnyStatement_GenBound___AssertKeyword_10_0_or_DelayKeyword_7_0_or_DoKeyword_6_0_or_ExceptKeyword_15_0_or_IfKeyword_1_0_or_ReferenceKeyword_8_0_or_RepeatKeyword_3_0_or_ReturnKeyword_13_0_or_SelectKeyword_5_0_or_ThrowKeyword_16_0_or_TryKeyword_4_0_or_YieldKeyword_14_0__q_or___GenerateKeyword_9_0_ToKeyword_0__ = new AlternativeAlias(false, false, new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getAssertKeyword_10_0()), new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getDelayKeyword_7_0()), new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getDoKeyword_6_0()), new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getExceptKeyword_15_0()), new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getIfKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getReferenceKeyword_8_0()), new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getRepeatKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getReturnKeyword_13_0()), new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getSelectKeyword_5_0()), new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getThrowKeyword_16_0()), new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getTryKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getYieldKeyword_14_0())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getGenerateKeyword_9_0()), new TokenAlias(false, false, grammarAccess.getGenBoundAccess().getToKeyword_0())));
		match_Flow_AnyStatement_GenBound___AssertKeyword_10_0_or_DelayKeyword_7_0_or_DoKeyword_6_0_or_ExceptKeyword_15_0_or_IfKeyword_1_0_or_ReferenceKeyword_8_0_or_RepeatKeyword_3_0_or_SelectKeyword_5_0_or_ThrowKeyword_16_0_or_TryKeyword_4_0_or_YieldKeyword_14_0___or___GenerateKeyword_9_0_ToKeyword_0__ = new AlternativeAlias(false, false, new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getAssertKeyword_10_0()), new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getDelayKeyword_7_0()), new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getDoKeyword_6_0()), new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getExceptKeyword_15_0()), new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getIfKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getReferenceKeyword_8_0()), new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getRepeatKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getSelectKeyword_5_0()), new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getThrowKeyword_16_0()), new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getTryKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getYieldKeyword_14_0())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getGenerateKeyword_9_0()), new TokenAlias(false, false, grammarAccess.getGenBoundAccess().getToKeyword_0())));
		match_Flow_BalStatement_BreakKeyword_12_0_or_GotoKeyword_17_0_or_IterateKeyword_11_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getFlow_BalStatementAccess().getBreakKeyword_12_0()), new TokenAlias(false, false, grammarAccess.getFlow_BalStatementAccess().getGotoKeyword_17_0()), new TokenAlias(false, false, grammarAccess.getFlow_BalStatementAccess().getIterateKeyword_11_0()));
		match_Flow_BalStatement_BreakKeyword_12_0_or_IterateKeyword_11_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getFlow_BalStatementAccess().getBreakKeyword_12_0()), new TokenAlias(false, false, grammarAccess.getFlow_BalStatementAccess().getIterateKeyword_11_0()));
		match_Flow_BalStatement_BreakKeyword_12_0_or_IterateKeyword_11_0_or_NeverKeyword_18_or_ReturnKeyword_13_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getFlow_BalStatementAccess().getBreakKeyword_12_0()), new TokenAlias(false, false, grammarAccess.getFlow_BalStatementAccess().getIterateKeyword_11_0()), new TokenAlias(false, false, grammarAccess.getFlow_BalStatementAccess().getNeverKeyword_18()), new TokenAlias(false, false, grammarAccess.getFlow_BalStatementAccess().getReturnKeyword_13_0()));
		match_Flow_BalStatement_ButKeyword_4_2_0_or_CatchKeyword_4_2_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getFlow_BalStatementAccess().getButKeyword_4_2_0()), new TokenAlias(false, false, grammarAccess.getFlow_BalStatementAccess().getCatchKeyword_4_2_1()));
		match_Flow_BalStatement_GenBound_IfKeyword_1_0_q_or_ReturnKeyword_13_0_q_or_SelectKeyword_5_0_q_or_TryKeyword_4_0_q_or___GenerateKeyword_9_0_ToKeyword_0__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getFlow_BalStatementAccess().getGenerateKeyword_9_0()), new TokenAlias(false, false, grammarAccess.getGenBoundAccess().getToKeyword_0())), new TokenAlias(false, true, grammarAccess.getFlow_BalStatementAccess().getIfKeyword_1_0()), new TokenAlias(false, true, grammarAccess.getFlow_BalStatementAccess().getReturnKeyword_13_0()), new TokenAlias(false, true, grammarAccess.getFlow_BalStatementAccess().getSelectKeyword_5_0()), new TokenAlias(false, true, grammarAccess.getFlow_BalStatementAccess().getTryKeyword_4_0()));
		match_Flow_BalStatement_GenBound___GenerateKeyword_9_0_ToKeyword_0___or___IfKeyword_1_0_or_ReturnKeyword_13_0_or_SelectKeyword_5_0_or_TryKeyword_4_0__q = new AlternativeAlias(false, false, new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getFlow_BalStatementAccess().getIfKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getFlow_BalStatementAccess().getReturnKeyword_13_0()), new TokenAlias(false, false, grammarAccess.getFlow_BalStatementAccess().getSelectKeyword_5_0()), new TokenAlias(false, false, grammarAccess.getFlow_BalStatementAccess().getTryKeyword_4_0())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getFlow_BalStatementAccess().getGenerateKeyword_9_0()), new TokenAlias(false, false, grammarAccess.getGenBoundAccess().getToKeyword_0())));
		match_Flow_BalStatement_GenBound___GenerateKeyword_9_0_ToKeyword_0___or___IfKeyword_1_0_or_SelectKeyword_5_0_or_TryKeyword_4_0__ = new AlternativeAlias(false, false, new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getFlow_BalStatementAccess().getIfKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getFlow_BalStatementAccess().getSelectKeyword_5_0()), new TokenAlias(false, false, grammarAccess.getFlow_BalStatementAccess().getTryKeyword_4_0())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getFlow_BalStatementAccess().getGenerateKeyword_9_0()), new TokenAlias(false, false, grammarAccess.getGenBoundAccess().getToKeyword_0())));
		match_ForLhs___FluidKeyword_0_2_or_FreeKeyword_0_0_or_LocalKeyword_0_1__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getForLhsAccess().getFluidKeyword_0_2()), new TokenAlias(false, false, grammarAccess.getForLhsAccess().getFreeKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getForLhsAccess().getLocalKeyword_0_1()));
		match_QualOp_ArrowTok_QualOp_LatticeTok_QualOp_PlusTok_QualOp_PowerTok_QualOp_QuotientTok_QualOp_SegTok_QualOp_TimesTok___ArrowTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1___or___LatticeTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1___or___PlusTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1___or___PowerTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1___or___QuotientTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1___or___SegTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1___or___TimesTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getQualOp_ArrowTokAccess().getArrowTokParserRuleCall_1_0()), new TokenAlias(false, false, grammarAccess.getQualOp_ArrowTokAccess().getKW_DOLLARTerminalRuleCall_1_1())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getQualOp_LatticeTokAccess().getLatticeTokParserRuleCall_1_0()), new TokenAlias(false, false, grammarAccess.getQualOp_LatticeTokAccess().getKW_DOLLARTerminalRuleCall_1_1())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getQualOp_PlusTokAccess().getPlusTokParserRuleCall_1_0()), new TokenAlias(false, false, grammarAccess.getQualOp_PlusTokAccess().getKW_DOLLARTerminalRuleCall_1_1())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getQualOp_PowerTokAccess().getPowerTokParserRuleCall_1_0()), new TokenAlias(false, false, grammarAccess.getQualOp_PowerTokAccess().getKW_DOLLARTerminalRuleCall_1_1())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getQualOp_QuotientTokAccess().getQuotientTokParserRuleCall_1_0()), new TokenAlias(false, false, grammarAccess.getQualOp_QuotientTokAccess().getKW_DOLLARTerminalRuleCall_1_1())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getQualOp_SegTokAccess().getSegTokParserRuleCall_1_0()), new TokenAlias(false, false, grammarAccess.getQualOp_SegTokAccess().getKW_DOLLARTerminalRuleCall_1_1())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getQualOp_TimesTokAccess().getTimesTokParserRuleCall_1_0()), new TokenAlias(false, false, grammarAccess.getQualOp_TimesTokAccess().getKW_DOLLARTerminalRuleCall_1_1())));
		match_enlister1a_Labeled_Semicolon_KW_SEMICOLONTerminalRuleCall_2_q = new TokenAlias(false, true, grammarAccess.getEnlister1a_Labeled_SemicolonAccess().getKW_SEMICOLONTerminalRuleCall_2());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getArrowTokRule())
			return getArrowTokToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getKW_2EQRule())
			return getKW_2EQToken(semanticObject, ruleCall, node);
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
		else if(ruleCall.getRule() == grammarAccess.getRelationOpRule())
			return getRelationOpToken(semanticObject, ruleCall, node);
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
	 * terminal KW_2EQ: '==';
	 */
	protected String getKW_2EQToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "==";
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
	 * RelationOp: QualOp_RelationTok;
	 */
	protected String getRelationOpToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "temp99";
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
			if(match_AlwaysPart_AnyStatement_AlwaysKeyword_0_0_or_FinallyKeyword_1_0.equals(syntax))
				emit_AlwaysPart_AnyStatement_AlwaysKeyword_0_0_or_FinallyKeyword_1_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AlwaysPart_BalStatement_AlwaysKeyword_0_0_or_FinallyKeyword_1_0.equals(syntax))
				emit_AlwaysPart_BalStatement_AlwaysKeyword_0_0_or_FinallyKeyword_1_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AnyStatement_Flow_AnyStatement_GenBound___AssertKeyword_10_0_or_DelayKeyword_7_0_or_DoKeyword_6_0_or_ExceptKeyword_15_0_or_IfKeyword_0_0_0_or_IfKeyword_1_0_or_ReferenceKeyword_8_0_or_RepeatKeyword_3_0_or_ReturnKeyword_13_0_or_SelectKeyword_5_0_or_ThrowKeyword_16_0_or_TryKeyword_4_0_or_YieldKeyword_14_0__q_or___GenerateKeyword_9_0_ToKeyword_0__.equals(syntax))
				emit_AnyStatement_Flow_AnyStatement_GenBound___AssertKeyword_10_0_or_DelayKeyword_7_0_or_DoKeyword_6_0_or_ExceptKeyword_15_0_or_IfKeyword_0_0_0_or_IfKeyword_1_0_or_ReferenceKeyword_8_0_or_RepeatKeyword_3_0_or_ReturnKeyword_13_0_or_SelectKeyword_5_0_or_ThrowKeyword_16_0_or_TryKeyword_4_0_or_YieldKeyword_14_0__q_or___GenerateKeyword_9_0_ToKeyword_0__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AnyStatement_Flow_AnyStatement_GenBound___AssertKeyword_10_0_or_DelayKeyword_7_0_or_DoKeyword_6_0_or_ExceptKeyword_15_0_or_IfKeyword_0_0_0_or_IfKeyword_1_0_or_ReferenceKeyword_8_0_or_RepeatKeyword_3_0_or_SelectKeyword_5_0_or_ThrowKeyword_16_0_or_TryKeyword_4_0_or_YieldKeyword_14_0___or___GenerateKeyword_9_0_ToKeyword_0__.equals(syntax))
				emit_AnyStatement_Flow_AnyStatement_GenBound___AssertKeyword_10_0_or_DelayKeyword_7_0_or_DoKeyword_6_0_or_ExceptKeyword_15_0_or_IfKeyword_0_0_0_or_IfKeyword_1_0_or_ReferenceKeyword_8_0_or_RepeatKeyword_3_0_or_SelectKeyword_5_0_or_ThrowKeyword_16_0_or_TryKeyword_4_0_or_YieldKeyword_14_0___or___GenerateKeyword_9_0_ToKeyword_0__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Bracketed_Parened_KW_OBRACKTerminalRuleCall_1_0_or_KW_OPARENTerminalRuleCall_1_0.equals(syntax))
				emit_Bracketed_Parened_KW_OBRACKTerminalRuleCall_1_0_or_KW_OPARENTerminalRuleCall_1_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_CurlyContentsList_Labeled_KW_SEMICOLONTerminalRuleCall_2_q.equals(syntax))
				emit_CurlyContentsList_Labeled_KW_SEMICOLONTerminalRuleCall_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_DeclPart_KW_COLONSTARTerminalRuleCall_1_0_or_KW_COLONTerminalRuleCall_0_0.equals(syntax))
				emit_DeclPart_KW_COLONSTARTerminalRuleCall_1_0_or_KW_COLONTerminalRuleCall_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Declaration_ExportDecl_MacroBody___DefaultKeyword_5_0_or_DefineKeyword_6_0_or_ExtendKeyword_1_0_or_FixKeyword_7_0_or_FluidKeyword_4_0_or_FreeKeyword_3_0_or_ImportKeyword_9_0_or_InlineKeyword_8_0_or_LocalKeyword_2_0___or___MacroKeyword_0_0_q_ImportKeyword_2_0_q___or___MacroKeyword_0_0_q___ExportKeyword_0_0_or_ExportKeyword_1_0_0_or_ExportKeyword_2_0_0____.equals(syntax))
				emit_Declaration_ExportDecl_MacroBody___DefaultKeyword_5_0_or_DefineKeyword_6_0_or_ExtendKeyword_1_0_or_FixKeyword_7_0_or_FluidKeyword_4_0_or_FreeKeyword_3_0_or_ImportKeyword_9_0_or_InlineKeyword_8_0_or_LocalKeyword_2_0___or___MacroKeyword_0_0_q_ImportKeyword_2_0_q___or___MacroKeyword_0_0_q___ExportKeyword_0_0_or_ExportKeyword_1_0_0_or_ExportKeyword_2_0_0____(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Declaration_ImportKeyword_9_0_or_InlineKeyword_8_0.equals(syntax))
				emit_Declaration_ImportKeyword_9_0_or_InlineKeyword_8_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Declaration_MacroKeyword_0_0_q.equals(syntax))
				emit_Declaration_MacroKeyword_0_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ExportDecl_ExportKeyword_0_0_or_ExportKeyword_1_0_0_or_ExportKeyword_2_0_0.equals(syntax))
				emit_ExportDecl_ExportKeyword_0_0_or_ExportKeyword_1_0_0_or_ExportKeyword_2_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ExportDecl_MacroBody___ExportKeyword_0_0_or_ExportKeyword_1_0_0_or_ExportKeyword_2_0_0_or_ImportKeyword_2_0__q.equals(syntax))
				emit_ExportDecl_MacroBody___ExportKeyword_0_0_or_ExportKeyword_1_0_0_or_ExportKeyword_2_0_0_or_ImportKeyword_2_0__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Flow_AnyStatement_BreakKeyword_12_0_or_GotoKeyword_17_0_or_IterateKeyword_11_0.equals(syntax))
				emit_Flow_AnyStatement_BreakKeyword_12_0_or_GotoKeyword_17_0_or_IterateKeyword_11_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Flow_AnyStatement_BreakKeyword_12_0_or_IterateKeyword_11_0.equals(syntax))
				emit_Flow_AnyStatement_BreakKeyword_12_0_or_IterateKeyword_11_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Flow_AnyStatement_BreakKeyword_12_0_or_IterateKeyword_11_0_or_NeverKeyword_18_or_ReturnKeyword_13_0.equals(syntax))
				emit_Flow_AnyStatement_BreakKeyword_12_0_or_IterateKeyword_11_0_or_NeverKeyword_18_or_ReturnKeyword_13_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Flow_AnyStatement_ButKeyword_4_2_0_or_CatchKeyword_4_2_1.equals(syntax))
				emit_Flow_AnyStatement_ButKeyword_4_2_0_or_CatchKeyword_4_2_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Flow_AnyStatement_GenBound___AssertKeyword_10_0_or_DelayKeyword_7_0_or_DoKeyword_6_0_or_ExceptKeyword_15_0_or_IfKeyword_1_0_or_ReferenceKeyword_8_0_or_RepeatKeyword_3_0_or_ReturnKeyword_13_0_or_SelectKeyword_5_0_or_ThrowKeyword_16_0_or_TryKeyword_4_0_or_YieldKeyword_14_0__q_or___GenerateKeyword_9_0_ToKeyword_0__.equals(syntax))
				emit_Flow_AnyStatement_GenBound___AssertKeyword_10_0_or_DelayKeyword_7_0_or_DoKeyword_6_0_or_ExceptKeyword_15_0_or_IfKeyword_1_0_or_ReferenceKeyword_8_0_or_RepeatKeyword_3_0_or_ReturnKeyword_13_0_or_SelectKeyword_5_0_or_ThrowKeyword_16_0_or_TryKeyword_4_0_or_YieldKeyword_14_0__q_or___GenerateKeyword_9_0_ToKeyword_0__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Flow_AnyStatement_GenBound___AssertKeyword_10_0_or_DelayKeyword_7_0_or_DoKeyword_6_0_or_ExceptKeyword_15_0_or_IfKeyword_1_0_or_ReferenceKeyword_8_0_or_RepeatKeyword_3_0_or_SelectKeyword_5_0_or_ThrowKeyword_16_0_or_TryKeyword_4_0_or_YieldKeyword_14_0___or___GenerateKeyword_9_0_ToKeyword_0__.equals(syntax))
				emit_Flow_AnyStatement_GenBound___AssertKeyword_10_0_or_DelayKeyword_7_0_or_DoKeyword_6_0_or_ExceptKeyword_15_0_or_IfKeyword_1_0_or_ReferenceKeyword_8_0_or_RepeatKeyword_3_0_or_SelectKeyword_5_0_or_ThrowKeyword_16_0_or_TryKeyword_4_0_or_YieldKeyword_14_0___or___GenerateKeyword_9_0_ToKeyword_0__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Flow_BalStatement_BreakKeyword_12_0_or_GotoKeyword_17_0_or_IterateKeyword_11_0.equals(syntax))
				emit_Flow_BalStatement_BreakKeyword_12_0_or_GotoKeyword_17_0_or_IterateKeyword_11_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Flow_BalStatement_BreakKeyword_12_0_or_IterateKeyword_11_0.equals(syntax))
				emit_Flow_BalStatement_BreakKeyword_12_0_or_IterateKeyword_11_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Flow_BalStatement_BreakKeyword_12_0_or_IterateKeyword_11_0_or_NeverKeyword_18_or_ReturnKeyword_13_0.equals(syntax))
				emit_Flow_BalStatement_BreakKeyword_12_0_or_IterateKeyword_11_0_or_NeverKeyword_18_or_ReturnKeyword_13_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Flow_BalStatement_ButKeyword_4_2_0_or_CatchKeyword_4_2_1.equals(syntax))
				emit_Flow_BalStatement_ButKeyword_4_2_0_or_CatchKeyword_4_2_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Flow_BalStatement_GenBound_IfKeyword_1_0_q_or_ReturnKeyword_13_0_q_or_SelectKeyword_5_0_q_or_TryKeyword_4_0_q_or___GenerateKeyword_9_0_ToKeyword_0__.equals(syntax))
				emit_Flow_BalStatement_GenBound_IfKeyword_1_0_q_or_ReturnKeyword_13_0_q_or_SelectKeyword_5_0_q_or_TryKeyword_4_0_q_or___GenerateKeyword_9_0_ToKeyword_0__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Flow_BalStatement_GenBound___GenerateKeyword_9_0_ToKeyword_0___or___IfKeyword_1_0_or_ReturnKeyword_13_0_or_SelectKeyword_5_0_or_TryKeyword_4_0__q.equals(syntax))
				emit_Flow_BalStatement_GenBound___GenerateKeyword_9_0_ToKeyword_0___or___IfKeyword_1_0_or_ReturnKeyword_13_0_or_SelectKeyword_5_0_or_TryKeyword_4_0__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Flow_BalStatement_GenBound___GenerateKeyword_9_0_ToKeyword_0___or___IfKeyword_1_0_or_SelectKeyword_5_0_or_TryKeyword_4_0__.equals(syntax))
				emit_Flow_BalStatement_GenBound___GenerateKeyword_9_0_ToKeyword_0___or___IfKeyword_1_0_or_SelectKeyword_5_0_or_TryKeyword_4_0__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ForLhs___FluidKeyword_0_2_or_FreeKeyword_0_0_or_LocalKeyword_0_1__q.equals(syntax))
				emit_ForLhs___FluidKeyword_0_2_or_FreeKeyword_0_0_or_LocalKeyword_0_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_QualOp_ArrowTok_QualOp_LatticeTok_QualOp_PlusTok_QualOp_PowerTok_QualOp_QuotientTok_QualOp_SegTok_QualOp_TimesTok___ArrowTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1___or___LatticeTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1___or___PlusTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1___or___PowerTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1___or___QuotientTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1___or___SegTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1___or___TimesTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1__.equals(syntax))
				emit_QualOp_ArrowTok_QualOp_LatticeTok_QualOp_PlusTok_QualOp_PowerTok_QualOp_QuotientTok_QualOp_SegTok_QualOp_TimesTok___ArrowTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1___or___LatticeTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1___or___PlusTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1___or___PowerTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1___or___QuotientTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1___or___SegTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1___or___TimesTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_enlister1a_Labeled_Semicolon_KW_SEMICOLONTerminalRuleCall_2_q.equals(syntax))
				emit_enlister1a_Labeled_Semicolon_KW_SEMICOLONTerminalRuleCall_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     'always' | 'finally'
	 */
	protected void emit_AlwaysPart_AnyStatement_AlwaysKeyword_0_0_or_FinallyKeyword_1_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'finally' | 'always'
	 */
	protected void emit_AlwaysPart_BalStatement_AlwaysKeyword_0_0_or_FinallyKeyword_1_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (
	     ('generate' 'to') | 
	     (
	         'except' | 
	         'yield' | 
	         'delay' | 
	         'try' | 
	         'repeat' | 
	         'do' | 
	         'assert' | 
	         'select' | 
	         'reference' | 
	         'return' | 
	         'throw' | 
	         'if' | 
	         'if'
	     )?
	 )
	 */
	protected void emit_AnyStatement_Flow_AnyStatement_GenBound___AssertKeyword_10_0_or_DelayKeyword_7_0_or_DoKeyword_6_0_or_ExceptKeyword_15_0_or_IfKeyword_0_0_0_or_IfKeyword_1_0_or_ReferenceKeyword_8_0_or_RepeatKeyword_3_0_or_ReturnKeyword_13_0_or_SelectKeyword_5_0_or_ThrowKeyword_16_0_or_TryKeyword_4_0_or_YieldKeyword_14_0__q_or___GenerateKeyword_9_0_ToKeyword_0__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (
	     ('generate' 'to') | 
	     (
	         'reference' | 
	         'select' | 
	         'except' | 
	         'yield' | 
	         'delay' | 
	         'throw' | 
	         'try' | 
	         'if' | 
	         'repeat' | 
	         'do' | 
	         'assert' | 
	         'if'
	     )
	 )
	 */
	protected void emit_AnyStatement_Flow_AnyStatement_GenBound___AssertKeyword_10_0_or_DelayKeyword_7_0_or_DoKeyword_6_0_or_ExceptKeyword_15_0_or_IfKeyword_0_0_0_or_IfKeyword_1_0_or_ReferenceKeyword_8_0_or_RepeatKeyword_3_0_or_SelectKeyword_5_0_or_ThrowKeyword_16_0_or_TryKeyword_4_0_or_YieldKeyword_14_0___or___GenerateKeyword_9_0_ToKeyword_0__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
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
	 *     KW_COLONSTAR | KW_COLON
	 */
	protected void emit_DeclPart_KW_COLONSTARTerminalRuleCall_1_0_or_KW_COLONTerminalRuleCall_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (
	     (
	         'inline' | 
	         'import' | 
	         'fluid' | 
	         'fix' | 
	         'local' | 
	         'extend' | 
	         'default' | 
	         'define' | 
	         'free'
	     ) | 
	     ('macro'? 'import'?) | 
	     ('macro'? ('export' | 'export' | 'export'))
	 )
	 */
	protected void emit_Declaration_ExportDecl_MacroBody___DefaultKeyword_5_0_or_DefineKeyword_6_0_or_ExtendKeyword_1_0_or_FixKeyword_7_0_or_FluidKeyword_4_0_or_FreeKeyword_3_0_or_ImportKeyword_9_0_or_InlineKeyword_8_0_or_LocalKeyword_2_0___or___MacroKeyword_0_0_q_ImportKeyword_2_0_q___or___MacroKeyword_0_0_q___ExportKeyword_0_0_or_ExportKeyword_1_0_0_or_ExportKeyword_2_0_0____(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'inline' | 'import'
	 */
	protected void emit_Declaration_ImportKeyword_9_0_or_InlineKeyword_8_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'macro'?
	 */
	protected void emit_Declaration_MacroKeyword_0_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'export' | 'export' | 'export'
	 */
	protected void emit_ExportDecl_ExportKeyword_0_0_or_ExportKeyword_1_0_0_or_ExportKeyword_2_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('export' | 'export' | 'export' | 'import')?
	 */
	protected void emit_ExportDecl_MacroBody___ExportKeyword_0_0_or_ExportKeyword_1_0_0_or_ExportKeyword_2_0_0_or_ImportKeyword_2_0__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'break' | 'goto' | 'iterate'
	 */
	protected void emit_Flow_AnyStatement_BreakKeyword_12_0_or_GotoKeyword_17_0_or_IterateKeyword_11_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'break' | 'iterate'
	 */
	protected void emit_Flow_AnyStatement_BreakKeyword_12_0_or_IterateKeyword_11_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'return' | 'break' | 'never' | 'iterate'
	 */
	protected void emit_Flow_AnyStatement_BreakKeyword_12_0_or_IterateKeyword_11_0_or_NeverKeyword_18_or_ReturnKeyword_13_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	 *     (
	     ('generate' 'to') | 
	     (
	         'select' | 
	         'reference' | 
	         'return' | 
	         'except' | 
	         'yield' | 
	         'delay' | 
	         'throw' | 
	         'try' | 
	         'if' | 
	         'repeat' | 
	         'do' | 
	         'assert'
	     )?
	 )
	 */
	protected void emit_Flow_AnyStatement_GenBound___AssertKeyword_10_0_or_DelayKeyword_7_0_or_DoKeyword_6_0_or_ExceptKeyword_15_0_or_IfKeyword_1_0_or_ReferenceKeyword_8_0_or_RepeatKeyword_3_0_or_ReturnKeyword_13_0_or_SelectKeyword_5_0_or_ThrowKeyword_16_0_or_TryKeyword_4_0_or_YieldKeyword_14_0__q_or___GenerateKeyword_9_0_ToKeyword_0__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (
	     ('generate' 'to') | 
	     (
	         'select' | 
	         'reference' | 
	         'except' | 
	         'yield' | 
	         'delay' | 
	         'throw' | 
	         'try' | 
	         'if' | 
	         'repeat' | 
	         'do' | 
	         'assert'
	     )
	 )
	 */
	protected void emit_Flow_AnyStatement_GenBound___AssertKeyword_10_0_or_DelayKeyword_7_0_or_DoKeyword_6_0_or_ExceptKeyword_15_0_or_IfKeyword_1_0_or_ReferenceKeyword_8_0_or_RepeatKeyword_3_0_or_SelectKeyword_5_0_or_ThrowKeyword_16_0_or_TryKeyword_4_0_or_YieldKeyword_14_0___or___GenerateKeyword_9_0_ToKeyword_0__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'goto' | 'break' | 'iterate'
	 */
	protected void emit_Flow_BalStatement_BreakKeyword_12_0_or_GotoKeyword_17_0_or_IterateKeyword_11_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'break' | 'iterate'
	 */
	protected void emit_Flow_BalStatement_BreakKeyword_12_0_or_IterateKeyword_11_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'never' | 'break' | 'iterate' | 'return'
	 */
	protected void emit_Flow_BalStatement_BreakKeyword_12_0_or_IterateKeyword_11_0_or_NeverKeyword_18_or_ReturnKeyword_13_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	 *     'if'? | 'return'? | 'select'? | 'try'? | ('generate' 'to')
	 */
	protected void emit_Flow_BalStatement_GenBound_IfKeyword_1_0_q_or_ReturnKeyword_13_0_q_or_SelectKeyword_5_0_q_or_TryKeyword_4_0_q_or___GenerateKeyword_9_0_ToKeyword_0__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('generate' 'to') | ('if' | 'select' | 'try' | 'return')?
	 */
	protected void emit_Flow_BalStatement_GenBound___GenerateKeyword_9_0_ToKeyword_0___or___IfKeyword_1_0_or_ReturnKeyword_13_0_or_SelectKeyword_5_0_or_TryKeyword_4_0__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('if' | 'select' | 'try') | ('generate' 'to')
	 */
	protected void emit_Flow_BalStatement_GenBound___GenerateKeyword_9_0_ToKeyword_0___or___IfKeyword_1_0_or_SelectKeyword_5_0_or_TryKeyword_4_0__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('fluid' | 'local' | 'free')?
	 */
	protected void emit_ForLhs___FluidKeyword_0_2_or_FreeKeyword_0_0_or_LocalKeyword_0_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (
	     (TimesTok KW_DOLLAR) | 
	     (PlusTok KW_DOLLAR) | 
	     (ArrowTok KW_DOLLAR) | 
	     (QuotientTok KW_DOLLAR) | 
	     (SegTok KW_DOLLAR) | 
	     (PowerTok KW_DOLLAR) | 
	     (LatticeTok KW_DOLLAR)
	 )
	 */
	protected void emit_QualOp_ArrowTok_QualOp_LatticeTok_QualOp_PlusTok_QualOp_PowerTok_QualOp_QuotientTok_QualOp_SegTok_QualOp_TimesTok___ArrowTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1___or___LatticeTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1___or___PlusTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1___or___PowerTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1___or___QuotientTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1___or___SegTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1___or___TimesTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
