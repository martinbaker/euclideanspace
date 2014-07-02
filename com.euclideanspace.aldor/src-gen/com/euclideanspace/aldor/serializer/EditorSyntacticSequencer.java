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
	protected AbstractElementAlias match_Bracketed_Parened_KW_OBRACKTerminalRuleCall_1_0_or_KW_OPARENTerminalRuleCall_1_0;
	protected AbstractElementAlias match_CurlyContentsList_Labeled_KW_SEMICOLONTerminalRuleCall_2_q;
	protected AbstractElementAlias match_DeclMolecule_ApplicationParserRuleCall_0_q;
	protected AbstractElementAlias match_DeclPart_KW_COLONSTARTerminalRuleCall_1_0_or_KW_COLONTerminalRuleCall_0_0;
	protected AbstractElementAlias match_Declaration_ExportDecl_MacroBody___DefaultKeyword_5_0_or_DefineKeyword_6_0_or_ExtendKeyword_1_0_or_FixKeyword_7_0_or_FluidKeyword_4_0_or_FreeKeyword_3_0_or_ImportKeyword_9_0_or_InlineKeyword_8_0_or_LocalKeyword_2_0___or___MacroKeyword_0_0_q_ImportKeyword_2_0_q___or___MacroKeyword_0_0_q___ExportKeyword_0_0_or_ExportKeyword_1_0_0_or_ExportKeyword_2_0_0____;
	protected AbstractElementAlias match_Declaration_ImportKeyword_9_0_or_InlineKeyword_8_0;
	protected AbstractElementAlias match_Declaration_InfixedExprsDecl_ImportKeyword_9_0_or___InlineKeyword_8_0_InfixedExprsParserRuleCall_0__;
	protected AbstractElementAlias match_Declaration_InfixedExprsDecl_InlineKeyword_8_0_or___ImportKeyword_9_0_InfixedExprsParserRuleCall_0__;
	protected AbstractElementAlias match_Declaration_InfixedExprsDecl___ImportKeyword_9_0_or_InlineKeyword_8_0___or_____DefaultKeyword_5_0_or_DefineKeyword_6_0_or_ExtendKeyword_1_0_or_FixKeyword_7_0_or_FluidKeyword_4_0_or_FreeKeyword_3_0_or_LocalKeyword_2_0___InfixedExprsParserRuleCall_0__;
	protected AbstractElementAlias match_Declaration_MacroKeyword_0_0_q;
	protected AbstractElementAlias match_E14_E15ParserRuleCall_0_or___E15ParserRuleCall_3_0_ExceptKeyword_3_1_E15ParserRuleCall_3_2___or___E15ParserRuleCall_4_0_ThrowKeyword_4_1_E15ParserRuleCall_4_2__;
	protected AbstractElementAlias match_E14___E15ParserRuleCall_1_0_q_WithKeyword_1_1___or___E15ParserRuleCall_2_0_q_AddKeyword_2_1__;
	protected AbstractElementAlias match_ExportDecl_ExportKeyword_0_0_or_ExportKeyword_1_0_0_or_ExportKeyword_2_0_0;
	protected AbstractElementAlias match_ExportDecl_InfixedExprsDecl_ExportKeyword_1_0_0_or___ExportKeyword_2_0_0_InfixedExprsParserRuleCall_0__;
	protected AbstractElementAlias match_ExportDecl_InfixedExprsDecl_ExportKeyword_2_0_0_or___ExportKeyword_1_0_0_InfixedExprsParserRuleCall_0__;
	protected AbstractElementAlias match_ExportDecl_MacroBody___ExportKeyword_0_0_or_ExportKeyword_1_0_0_or_ExportKeyword_2_0_0_or_ImportKeyword_2_0__q;
	protected AbstractElementAlias match_Flow_AnyStatement_BreakKeyword_14_0_or_GotoKeyword_19_0_or_IterateKeyword_13_0;
	protected AbstractElementAlias match_Flow_AnyStatement_BreakKeyword_14_0_or_IterateKeyword_13_0;
	protected AbstractElementAlias match_Flow_AnyStatement_BreakKeyword_14_0_or_IterateKeyword_13_0_or_NeverKeyword_20;
	protected AbstractElementAlias match_Flow_AnyStatement_GenBound___AssertKeyword_12_0_or_DelayKeyword_9_0_or_DoKeyword_8_0_or_ExceptKeyword_17_0_or_IfKeyword_1_0_or_ReferenceKeyword_10_0_or_RepeatKeyword_4_0_or_SelectKeyword_7_0_or_ThrowKeyword_18_0_or_TryKeyword_5_0_or_TryKeyword_6_0_or_YieldKeyword_16_0___or___GenerateKeyword_11_0_ToKeyword_0__;
	protected AbstractElementAlias match_Flow_AnyStatement_GenBound___GenerateKeyword_11_0_ToKeyword_0___or___IfKeyword_1_0_or_SelectKeyword_7_0_or_TryKeyword_5_0_or_TryKeyword_6_0__;
	protected AbstractElementAlias match_Flow_AnyStatement_ReturnKeyword_15_0_q;
	protected AbstractElementAlias match_Flow_BalStatement_AssertKeyword_12_0_or_DelayKeyword_9_0_or_DoKeyword_8_0_or_ExceptKeyword_17_0_or_ReferenceKeyword_10_0_or_RepeatKeyword_4_0_or_ThrowKeyword_18_0_or_YieldKeyword_16_0;
	protected AbstractElementAlias match_Flow_BalStatement_BreakKeyword_14_0_or_GotoKeyword_19_0_or_IterateKeyword_13_0;
	protected AbstractElementAlias match_Flow_BalStatement_BreakKeyword_14_0_or_IterateKeyword_13_0;
	protected AbstractElementAlias match_Flow_BalStatement_BreakKeyword_14_0_or_IterateKeyword_13_0_or_NeverKeyword_20;
	protected AbstractElementAlias match_Flow_BalStatement_GenBound___GenerateKeyword_11_0_ToKeyword_0___or___IfKeyword_1_0_or_SelectKeyword_7_0_or_TryKeyword_5_0_or_TryKeyword_6_0__;
	protected AbstractElementAlias match_Flow_BalStatement_ReturnKeyword_15_0_q;
	protected AbstractElementAlias match_Jleft_Molecule_NotKeyword_0_0_q;
	protected AbstractElementAlias match_QualOp_ArrowTok_QualOp_LatticeTok_QualOp_PlusTok_QualOp_PowerTok_QualOp_QuotientTok_QualOp_SegTok_QualOp_TimesTok___ArrowTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1___or___LatticeTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1___or___PlusTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1___or___PowerTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1___or___QuotientTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1___or___SegTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1___or___TimesTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1__;
	protected AbstractElementAlias match_enlister1a_Labeled_Semicolon_KW_SEMICOLONTerminalRuleCall_2_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (EditorGrammarAccess) access;
		match_AlwaysPart_AnyStatement_AlwaysKeyword_0_0_or_FinallyKeyword_1_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getAlwaysPart_AnyStatementAccess().getAlwaysKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getAlwaysPart_AnyStatementAccess().getFinallyKeyword_1_0()));
		match_AlwaysPart_BalStatement_AlwaysKeyword_0_0_or_FinallyKeyword_1_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getAlwaysPart_BalStatementAccess().getAlwaysKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getAlwaysPart_BalStatementAccess().getFinallyKeyword_1_0()));
		match_Bracketed_Parened_KW_OBRACKTerminalRuleCall_1_0_or_KW_OPARENTerminalRuleCall_1_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getBracketedAccess().getKW_OBRACKTerminalRuleCall_1_0()), new TokenAlias(false, false, grammarAccess.getParenedAccess().getKW_OPARENTerminalRuleCall_1_0()));
		match_CurlyContentsList_Labeled_KW_SEMICOLONTerminalRuleCall_2_q = new TokenAlias(false, true, grammarAccess.getCurlyContentsList_LabeledAccess().getKW_SEMICOLONTerminalRuleCall_2());
		match_DeclMolecule_ApplicationParserRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getDeclMoleculeAccess().getApplicationParserRuleCall_0());
		match_DeclPart_KW_COLONSTARTerminalRuleCall_1_0_or_KW_COLONTerminalRuleCall_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getDeclPartAccess().getKW_COLONSTARTerminalRuleCall_1_0()), new TokenAlias(false, false, grammarAccess.getDeclPartAccess().getKW_COLONTerminalRuleCall_0_0()));
		match_Declaration_ExportDecl_MacroBody___DefaultKeyword_5_0_or_DefineKeyword_6_0_or_ExtendKeyword_1_0_or_FixKeyword_7_0_or_FluidKeyword_4_0_or_FreeKeyword_3_0_or_ImportKeyword_9_0_or_InlineKeyword_8_0_or_LocalKeyword_2_0___or___MacroKeyword_0_0_q_ImportKeyword_2_0_q___or___MacroKeyword_0_0_q___ExportKeyword_0_0_or_ExportKeyword_1_0_0_or_ExportKeyword_2_0_0____ = new AlternativeAlias(false, false, new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getDeclarationAccess().getDefaultKeyword_5_0()), new TokenAlias(false, false, grammarAccess.getDeclarationAccess().getDefineKeyword_6_0()), new TokenAlias(false, false, grammarAccess.getDeclarationAccess().getExtendKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getDeclarationAccess().getFixKeyword_7_0()), new TokenAlias(false, false, grammarAccess.getDeclarationAccess().getFluidKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getDeclarationAccess().getFreeKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getDeclarationAccess().getImportKeyword_9_0()), new TokenAlias(false, false, grammarAccess.getDeclarationAccess().getInlineKeyword_8_0()), new TokenAlias(false, false, grammarAccess.getDeclarationAccess().getLocalKeyword_2_0())), new GroupAlias(false, false, new TokenAlias(false, true, grammarAccess.getDeclarationAccess().getMacroKeyword_0_0()), new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getExportDeclAccess().getExportKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getExportDeclAccess().getExportKeyword_1_0_0()), new TokenAlias(false, false, grammarAccess.getExportDeclAccess().getExportKeyword_2_0_0()))), new GroupAlias(false, false, new TokenAlias(false, true, grammarAccess.getDeclarationAccess().getMacroKeyword_0_0()), new TokenAlias(false, true, grammarAccess.getMacroBodyAccess().getImportKeyword_2_0())));
		match_Declaration_ImportKeyword_9_0_or_InlineKeyword_8_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getDeclarationAccess().getImportKeyword_9_0()), new TokenAlias(false, false, grammarAccess.getDeclarationAccess().getInlineKeyword_8_0()));
		match_Declaration_InfixedExprsDecl_ImportKeyword_9_0_or___InlineKeyword_8_0_InfixedExprsParserRuleCall_0__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getDeclarationAccess().getInlineKeyword_8_0()), new TokenAlias(false, false, grammarAccess.getInfixedExprsDeclAccess().getInfixedExprsParserRuleCall_0())), new TokenAlias(false, false, grammarAccess.getDeclarationAccess().getImportKeyword_9_0()));
		match_Declaration_InfixedExprsDecl_InlineKeyword_8_0_or___ImportKeyword_9_0_InfixedExprsParserRuleCall_0__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getDeclarationAccess().getImportKeyword_9_0()), new TokenAlias(false, false, grammarAccess.getInfixedExprsDeclAccess().getInfixedExprsParserRuleCall_0())), new TokenAlias(false, false, grammarAccess.getDeclarationAccess().getInlineKeyword_8_0()));
		match_Declaration_InfixedExprsDecl___ImportKeyword_9_0_or_InlineKeyword_8_0___or_____DefaultKeyword_5_0_or_DefineKeyword_6_0_or_ExtendKeyword_1_0_or_FixKeyword_7_0_or_FluidKeyword_4_0_or_FreeKeyword_3_0_or_LocalKeyword_2_0___InfixedExprsParserRuleCall_0__ = new AlternativeAlias(false, false, new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getDeclarationAccess().getImportKeyword_9_0()), new TokenAlias(false, false, grammarAccess.getDeclarationAccess().getInlineKeyword_8_0())), new GroupAlias(false, false, new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getDeclarationAccess().getDefaultKeyword_5_0()), new TokenAlias(false, false, grammarAccess.getDeclarationAccess().getDefineKeyword_6_0()), new TokenAlias(false, false, grammarAccess.getDeclarationAccess().getExtendKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getDeclarationAccess().getFixKeyword_7_0()), new TokenAlias(false, false, grammarAccess.getDeclarationAccess().getFluidKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getDeclarationAccess().getFreeKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getDeclarationAccess().getLocalKeyword_2_0())), new TokenAlias(false, false, grammarAccess.getInfixedExprsDeclAccess().getInfixedExprsParserRuleCall_0())));
		match_Declaration_MacroKeyword_0_0_q = new TokenAlias(false, true, grammarAccess.getDeclarationAccess().getMacroKeyword_0_0());
		match_E14_E15ParserRuleCall_0_or___E15ParserRuleCall_3_0_ExceptKeyword_3_1_E15ParserRuleCall_3_2___or___E15ParserRuleCall_4_0_ThrowKeyword_4_1_E15ParserRuleCall_4_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getE14Access().getE15ParserRuleCall_3_0()), new TokenAlias(false, false, grammarAccess.getE14Access().getExceptKeyword_3_1()), new TokenAlias(false, false, grammarAccess.getE14Access().getE15ParserRuleCall_3_2())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getE14Access().getE15ParserRuleCall_4_0()), new TokenAlias(false, false, grammarAccess.getE14Access().getThrowKeyword_4_1()), new TokenAlias(false, false, grammarAccess.getE14Access().getE15ParserRuleCall_4_2())), new TokenAlias(false, false, grammarAccess.getE14Access().getE15ParserRuleCall_0()));
		match_E14___E15ParserRuleCall_1_0_q_WithKeyword_1_1___or___E15ParserRuleCall_2_0_q_AddKeyword_2_1__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, true, grammarAccess.getE14Access().getE15ParserRuleCall_1_0()), new TokenAlias(false, false, grammarAccess.getE14Access().getWithKeyword_1_1())), new GroupAlias(false, false, new TokenAlias(false, true, grammarAccess.getE14Access().getE15ParserRuleCall_2_0()), new TokenAlias(false, false, grammarAccess.getE14Access().getAddKeyword_2_1())));
		match_ExportDecl_ExportKeyword_0_0_or_ExportKeyword_1_0_0_or_ExportKeyword_2_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getExportDeclAccess().getExportKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getExportDeclAccess().getExportKeyword_1_0_0()), new TokenAlias(false, false, grammarAccess.getExportDeclAccess().getExportKeyword_2_0_0()));
		match_ExportDecl_InfixedExprsDecl_ExportKeyword_1_0_0_or___ExportKeyword_2_0_0_InfixedExprsParserRuleCall_0__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getExportDeclAccess().getExportKeyword_2_0_0()), new TokenAlias(false, false, grammarAccess.getInfixedExprsDeclAccess().getInfixedExprsParserRuleCall_0())), new TokenAlias(false, false, grammarAccess.getExportDeclAccess().getExportKeyword_1_0_0()));
		match_ExportDecl_InfixedExprsDecl_ExportKeyword_2_0_0_or___ExportKeyword_1_0_0_InfixedExprsParserRuleCall_0__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getExportDeclAccess().getExportKeyword_1_0_0()), new TokenAlias(false, false, grammarAccess.getInfixedExprsDeclAccess().getInfixedExprsParserRuleCall_0())), new TokenAlias(false, false, grammarAccess.getExportDeclAccess().getExportKeyword_2_0_0()));
		match_ExportDecl_MacroBody___ExportKeyword_0_0_or_ExportKeyword_1_0_0_or_ExportKeyword_2_0_0_or_ImportKeyword_2_0__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getExportDeclAccess().getExportKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getExportDeclAccess().getExportKeyword_1_0_0()), new TokenAlias(false, false, grammarAccess.getExportDeclAccess().getExportKeyword_2_0_0()), new TokenAlias(false, false, grammarAccess.getMacroBodyAccess().getImportKeyword_2_0()));
		match_Flow_AnyStatement_BreakKeyword_14_0_or_GotoKeyword_19_0_or_IterateKeyword_13_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getBreakKeyword_14_0()), new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getGotoKeyword_19_0()), new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getIterateKeyword_13_0()));
		match_Flow_AnyStatement_BreakKeyword_14_0_or_IterateKeyword_13_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getBreakKeyword_14_0()), new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getIterateKeyword_13_0()));
		match_Flow_AnyStatement_BreakKeyword_14_0_or_IterateKeyword_13_0_or_NeverKeyword_20 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getBreakKeyword_14_0()), new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getIterateKeyword_13_0()), new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getNeverKeyword_20()));
		match_Flow_AnyStatement_GenBound___AssertKeyword_12_0_or_DelayKeyword_9_0_or_DoKeyword_8_0_or_ExceptKeyword_17_0_or_IfKeyword_1_0_or_ReferenceKeyword_10_0_or_RepeatKeyword_4_0_or_SelectKeyword_7_0_or_ThrowKeyword_18_0_or_TryKeyword_5_0_or_TryKeyword_6_0_or_YieldKeyword_16_0___or___GenerateKeyword_11_0_ToKeyword_0__ = new AlternativeAlias(false, false, new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getAssertKeyword_12_0()), new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getDelayKeyword_9_0()), new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getDoKeyword_8_0()), new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getExceptKeyword_17_0()), new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getIfKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getReferenceKeyword_10_0()), new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getRepeatKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getSelectKeyword_7_0()), new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getThrowKeyword_18_0()), new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getTryKeyword_5_0()), new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getTryKeyword_6_0()), new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getYieldKeyword_16_0())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getGenerateKeyword_11_0()), new TokenAlias(false, false, grammarAccess.getGenBoundAccess().getToKeyword_0())));
		match_Flow_AnyStatement_GenBound___GenerateKeyword_11_0_ToKeyword_0___or___IfKeyword_1_0_or_SelectKeyword_7_0_or_TryKeyword_5_0_or_TryKeyword_6_0__ = new AlternativeAlias(false, false, new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getIfKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getSelectKeyword_7_0()), new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getTryKeyword_5_0()), new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getTryKeyword_6_0())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getFlow_AnyStatementAccess().getGenerateKeyword_11_0()), new TokenAlias(false, false, grammarAccess.getGenBoundAccess().getToKeyword_0())));
		match_Flow_AnyStatement_ReturnKeyword_15_0_q = new TokenAlias(false, true, grammarAccess.getFlow_AnyStatementAccess().getReturnKeyword_15_0());
		match_Flow_BalStatement_AssertKeyword_12_0_or_DelayKeyword_9_0_or_DoKeyword_8_0_or_ExceptKeyword_17_0_or_ReferenceKeyword_10_0_or_RepeatKeyword_4_0_or_ThrowKeyword_18_0_or_YieldKeyword_16_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getFlow_BalStatementAccess().getAssertKeyword_12_0()), new TokenAlias(false, false, grammarAccess.getFlow_BalStatementAccess().getDelayKeyword_9_0()), new TokenAlias(false, false, grammarAccess.getFlow_BalStatementAccess().getDoKeyword_8_0()), new TokenAlias(false, false, grammarAccess.getFlow_BalStatementAccess().getExceptKeyword_17_0()), new TokenAlias(false, false, grammarAccess.getFlow_BalStatementAccess().getReferenceKeyword_10_0()), new TokenAlias(false, false, grammarAccess.getFlow_BalStatementAccess().getRepeatKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getFlow_BalStatementAccess().getThrowKeyword_18_0()), new TokenAlias(false, false, grammarAccess.getFlow_BalStatementAccess().getYieldKeyword_16_0()));
		match_Flow_BalStatement_BreakKeyword_14_0_or_GotoKeyword_19_0_or_IterateKeyword_13_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getFlow_BalStatementAccess().getBreakKeyword_14_0()), new TokenAlias(false, false, grammarAccess.getFlow_BalStatementAccess().getGotoKeyword_19_0()), new TokenAlias(false, false, grammarAccess.getFlow_BalStatementAccess().getIterateKeyword_13_0()));
		match_Flow_BalStatement_BreakKeyword_14_0_or_IterateKeyword_13_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getFlow_BalStatementAccess().getBreakKeyword_14_0()), new TokenAlias(false, false, grammarAccess.getFlow_BalStatementAccess().getIterateKeyword_13_0()));
		match_Flow_BalStatement_BreakKeyword_14_0_or_IterateKeyword_13_0_or_NeverKeyword_20 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getFlow_BalStatementAccess().getBreakKeyword_14_0()), new TokenAlias(false, false, grammarAccess.getFlow_BalStatementAccess().getIterateKeyword_13_0()), new TokenAlias(false, false, grammarAccess.getFlow_BalStatementAccess().getNeverKeyword_20()));
		match_Flow_BalStatement_GenBound___GenerateKeyword_11_0_ToKeyword_0___or___IfKeyword_1_0_or_SelectKeyword_7_0_or_TryKeyword_5_0_or_TryKeyword_6_0__ = new AlternativeAlias(false, false, new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getFlow_BalStatementAccess().getIfKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getFlow_BalStatementAccess().getSelectKeyword_7_0()), new TokenAlias(false, false, grammarAccess.getFlow_BalStatementAccess().getTryKeyword_5_0()), new TokenAlias(false, false, grammarAccess.getFlow_BalStatementAccess().getTryKeyword_6_0())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getFlow_BalStatementAccess().getGenerateKeyword_11_0()), new TokenAlias(false, false, grammarAccess.getGenBoundAccess().getToKeyword_0())));
		match_Flow_BalStatement_ReturnKeyword_15_0_q = new TokenAlias(false, true, grammarAccess.getFlow_BalStatementAccess().getReturnKeyword_15_0());
		match_Jleft_Molecule_NotKeyword_0_0_q = new TokenAlias(false, true, grammarAccess.getJleft_MoleculeAccess().getNotKeyword_0_0());
		match_QualOp_ArrowTok_QualOp_LatticeTok_QualOp_PlusTok_QualOp_PowerTok_QualOp_QuotientTok_QualOp_SegTok_QualOp_TimesTok___ArrowTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1___or___LatticeTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1___or___PlusTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1___or___PowerTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1___or___QuotientTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1___or___SegTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1___or___TimesTokParserRuleCall_1_0_KW_DOLLARTerminalRuleCall_1_1__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getQualOp_ArrowTokAccess().getArrowTokParserRuleCall_1_0()), new TokenAlias(false, false, grammarAccess.getQualOp_ArrowTokAccess().getKW_DOLLARTerminalRuleCall_1_1())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getQualOp_LatticeTokAccess().getLatticeTokParserRuleCall_1_0()), new TokenAlias(false, false, grammarAccess.getQualOp_LatticeTokAccess().getKW_DOLLARTerminalRuleCall_1_1())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getQualOp_PlusTokAccess().getPlusTokParserRuleCall_1_0()), new TokenAlias(false, false, grammarAccess.getQualOp_PlusTokAccess().getKW_DOLLARTerminalRuleCall_1_1())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getQualOp_PowerTokAccess().getPowerTokParserRuleCall_1_0()), new TokenAlias(false, false, grammarAccess.getQualOp_PowerTokAccess().getKW_DOLLARTerminalRuleCall_1_1())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getQualOp_QuotientTokAccess().getQuotientTokParserRuleCall_1_0()), new TokenAlias(false, false, grammarAccess.getQualOp_QuotientTokAccess().getKW_DOLLARTerminalRuleCall_1_1())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getQualOp_SegTokAccess().getSegTokParserRuleCall_1_0()), new TokenAlias(false, false, grammarAccess.getQualOp_SegTokAccess().getKW_DOLLARTerminalRuleCall_1_1())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getQualOp_TimesTokAccess().getTimesTokParserRuleCall_1_0()), new TokenAlias(false, false, grammarAccess.getQualOp_TimesTokAccess().getKW_DOLLARTerminalRuleCall_1_1())));
		match_enlister1a_Labeled_Semicolon_KW_SEMICOLONTerminalRuleCall_2_q = new TokenAlias(false, true, grammarAccess.getEnlister1a_Labeled_SemicolonAccess().getKW_SEMICOLONTerminalRuleCall_2());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getAnyStatementRule())
			return getAnyStatementToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getApplicationRule())
			return getApplicationToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getArrowTokRule())
			return getArrowTokToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getBalStatementRule())
			return getBalStatementToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getE15Rule())
			return getE15Token(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getForLhsRule())
			return getForLhsToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getInfixedRule())
			return getInfixedToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getInfixedExprsRule())
			return getInfixedExprsToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getIteratorsRule())
			return getIteratorsToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getKW_2EQRule())
			return getKW_2EQToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getKW_ATRule())
			return getKW_ATToken(semanticObject, ruleCall, node);
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
	 * AnyStatement hidden(WS,KW_NEWLINE):
	 * 	'temp19'
	 * ;
	 */
	protected String getAnyStatementToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "temp19";
	}
	
	/**
	 * Application hidden(WS,KW_NEWLINE):
	 * 	'temp52'
	 *  ;
	 */
	protected String getApplicationToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "temp52";
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
	 * BalStatement hidden(WS,KW_NEWLINE):
	 * 	'temp20'
	 * ;
	 */
	protected String getBalStatementToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "temp20";
	}
	
	/**
	 * E15 hidden(WS,KW_NEWLINE):
	 *   Application
	 * ;
	 */
	protected String getE15Token(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "temp52";
	}
	
	/**
	 * ForLhs
	 * : Infixed
	 * | 'free' Infixed
	 * | 'local' Infixed
	 * | 'fluid' Infixed
	 * ;
	 */
	protected String getForLhsToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "temp31";
	}
	
	/**
	 * Infixed hidden(WS,KW_NEWLINE):
	 * 	'temp31'
	 * ;
	 */
	protected String getInfixedToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "temp31";
	}
	
	/**
	 * InfixedExprs hidden(WS,KW_NEWLINE):
	 *  enlist1_InfixedExpr_Comma_AB
	 * ;
	 */
	protected String getInfixedExprsToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "temp32";
	}
	
	/**
	 * Iterators hidden(WS,KW_NEWLINE):
	 *  Iterators1
	 * ;
	 */
	protected String getIteratorsToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "temp27";
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
			else if(match_Bracketed_Parened_KW_OBRACKTerminalRuleCall_1_0_or_KW_OPARENTerminalRuleCall_1_0.equals(syntax))
				emit_Bracketed_Parened_KW_OBRACKTerminalRuleCall_1_0_or_KW_OPARENTerminalRuleCall_1_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_CurlyContentsList_Labeled_KW_SEMICOLONTerminalRuleCall_2_q.equals(syntax))
				emit_CurlyContentsList_Labeled_KW_SEMICOLONTerminalRuleCall_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_DeclMolecule_ApplicationParserRuleCall_0_q.equals(syntax))
				emit_DeclMolecule_ApplicationParserRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_DeclPart_KW_COLONSTARTerminalRuleCall_1_0_or_KW_COLONTerminalRuleCall_0_0.equals(syntax))
				emit_DeclPart_KW_COLONSTARTerminalRuleCall_1_0_or_KW_COLONTerminalRuleCall_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Declaration_ExportDecl_MacroBody___DefaultKeyword_5_0_or_DefineKeyword_6_0_or_ExtendKeyword_1_0_or_FixKeyword_7_0_or_FluidKeyword_4_0_or_FreeKeyword_3_0_or_ImportKeyword_9_0_or_InlineKeyword_8_0_or_LocalKeyword_2_0___or___MacroKeyword_0_0_q_ImportKeyword_2_0_q___or___MacroKeyword_0_0_q___ExportKeyword_0_0_or_ExportKeyword_1_0_0_or_ExportKeyword_2_0_0____.equals(syntax))
				emit_Declaration_ExportDecl_MacroBody___DefaultKeyword_5_0_or_DefineKeyword_6_0_or_ExtendKeyword_1_0_or_FixKeyword_7_0_or_FluidKeyword_4_0_or_FreeKeyword_3_0_or_ImportKeyword_9_0_or_InlineKeyword_8_0_or_LocalKeyword_2_0___or___MacroKeyword_0_0_q_ImportKeyword_2_0_q___or___MacroKeyword_0_0_q___ExportKeyword_0_0_or_ExportKeyword_1_0_0_or_ExportKeyword_2_0_0____(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Declaration_ImportKeyword_9_0_or_InlineKeyword_8_0.equals(syntax))
				emit_Declaration_ImportKeyword_9_0_or_InlineKeyword_8_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Declaration_InfixedExprsDecl_ImportKeyword_9_0_or___InlineKeyword_8_0_InfixedExprsParserRuleCall_0__.equals(syntax))
				emit_Declaration_InfixedExprsDecl_ImportKeyword_9_0_or___InlineKeyword_8_0_InfixedExprsParserRuleCall_0__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Declaration_InfixedExprsDecl_InlineKeyword_8_0_or___ImportKeyword_9_0_InfixedExprsParserRuleCall_0__.equals(syntax))
				emit_Declaration_InfixedExprsDecl_InlineKeyword_8_0_or___ImportKeyword_9_0_InfixedExprsParserRuleCall_0__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Declaration_InfixedExprsDecl___ImportKeyword_9_0_or_InlineKeyword_8_0___or_____DefaultKeyword_5_0_or_DefineKeyword_6_0_or_ExtendKeyword_1_0_or_FixKeyword_7_0_or_FluidKeyword_4_0_or_FreeKeyword_3_0_or_LocalKeyword_2_0___InfixedExprsParserRuleCall_0__.equals(syntax))
				emit_Declaration_InfixedExprsDecl___ImportKeyword_9_0_or_InlineKeyword_8_0___or_____DefaultKeyword_5_0_or_DefineKeyword_6_0_or_ExtendKeyword_1_0_or_FixKeyword_7_0_or_FluidKeyword_4_0_or_FreeKeyword_3_0_or_LocalKeyword_2_0___InfixedExprsParserRuleCall_0__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Declaration_MacroKeyword_0_0_q.equals(syntax))
				emit_Declaration_MacroKeyword_0_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_E14_E15ParserRuleCall_0_or___E15ParserRuleCall_3_0_ExceptKeyword_3_1_E15ParserRuleCall_3_2___or___E15ParserRuleCall_4_0_ThrowKeyword_4_1_E15ParserRuleCall_4_2__.equals(syntax))
				emit_E14_E15ParserRuleCall_0_or___E15ParserRuleCall_3_0_ExceptKeyword_3_1_E15ParserRuleCall_3_2___or___E15ParserRuleCall_4_0_ThrowKeyword_4_1_E15ParserRuleCall_4_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_E14___E15ParserRuleCall_1_0_q_WithKeyword_1_1___or___E15ParserRuleCall_2_0_q_AddKeyword_2_1__.equals(syntax))
				emit_E14___E15ParserRuleCall_1_0_q_WithKeyword_1_1___or___E15ParserRuleCall_2_0_q_AddKeyword_2_1__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ExportDecl_ExportKeyword_0_0_or_ExportKeyword_1_0_0_or_ExportKeyword_2_0_0.equals(syntax))
				emit_ExportDecl_ExportKeyword_0_0_or_ExportKeyword_1_0_0_or_ExportKeyword_2_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ExportDecl_InfixedExprsDecl_ExportKeyword_1_0_0_or___ExportKeyword_2_0_0_InfixedExprsParserRuleCall_0__.equals(syntax))
				emit_ExportDecl_InfixedExprsDecl_ExportKeyword_1_0_0_or___ExportKeyword_2_0_0_InfixedExprsParserRuleCall_0__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ExportDecl_InfixedExprsDecl_ExportKeyword_2_0_0_or___ExportKeyword_1_0_0_InfixedExprsParserRuleCall_0__.equals(syntax))
				emit_ExportDecl_InfixedExprsDecl_ExportKeyword_2_0_0_or___ExportKeyword_1_0_0_InfixedExprsParserRuleCall_0__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ExportDecl_MacroBody___ExportKeyword_0_0_or_ExportKeyword_1_0_0_or_ExportKeyword_2_0_0_or_ImportKeyword_2_0__q.equals(syntax))
				emit_ExportDecl_MacroBody___ExportKeyword_0_0_or_ExportKeyword_1_0_0_or_ExportKeyword_2_0_0_or_ImportKeyword_2_0__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Flow_AnyStatement_BreakKeyword_14_0_or_GotoKeyword_19_0_or_IterateKeyword_13_0.equals(syntax))
				emit_Flow_AnyStatement_BreakKeyword_14_0_or_GotoKeyword_19_0_or_IterateKeyword_13_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Flow_AnyStatement_BreakKeyword_14_0_or_IterateKeyword_13_0.equals(syntax))
				emit_Flow_AnyStatement_BreakKeyword_14_0_or_IterateKeyword_13_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Flow_AnyStatement_BreakKeyword_14_0_or_IterateKeyword_13_0_or_NeverKeyword_20.equals(syntax))
				emit_Flow_AnyStatement_BreakKeyword_14_0_or_IterateKeyword_13_0_or_NeverKeyword_20(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Flow_AnyStatement_GenBound___AssertKeyword_12_0_or_DelayKeyword_9_0_or_DoKeyword_8_0_or_ExceptKeyword_17_0_or_IfKeyword_1_0_or_ReferenceKeyword_10_0_or_RepeatKeyword_4_0_or_SelectKeyword_7_0_or_ThrowKeyword_18_0_or_TryKeyword_5_0_or_TryKeyword_6_0_or_YieldKeyword_16_0___or___GenerateKeyword_11_0_ToKeyword_0__.equals(syntax))
				emit_Flow_AnyStatement_GenBound___AssertKeyword_12_0_or_DelayKeyword_9_0_or_DoKeyword_8_0_or_ExceptKeyword_17_0_or_IfKeyword_1_0_or_ReferenceKeyword_10_0_or_RepeatKeyword_4_0_or_SelectKeyword_7_0_or_ThrowKeyword_18_0_or_TryKeyword_5_0_or_TryKeyword_6_0_or_YieldKeyword_16_0___or___GenerateKeyword_11_0_ToKeyword_0__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Flow_AnyStatement_GenBound___GenerateKeyword_11_0_ToKeyword_0___or___IfKeyword_1_0_or_SelectKeyword_7_0_or_TryKeyword_5_0_or_TryKeyword_6_0__.equals(syntax))
				emit_Flow_AnyStatement_GenBound___GenerateKeyword_11_0_ToKeyword_0___or___IfKeyword_1_0_or_SelectKeyword_7_0_or_TryKeyword_5_0_or_TryKeyword_6_0__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Flow_AnyStatement_ReturnKeyword_15_0_q.equals(syntax))
				emit_Flow_AnyStatement_ReturnKeyword_15_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Flow_BalStatement_AssertKeyword_12_0_or_DelayKeyword_9_0_or_DoKeyword_8_0_or_ExceptKeyword_17_0_or_ReferenceKeyword_10_0_or_RepeatKeyword_4_0_or_ThrowKeyword_18_0_or_YieldKeyword_16_0.equals(syntax))
				emit_Flow_BalStatement_AssertKeyword_12_0_or_DelayKeyword_9_0_or_DoKeyword_8_0_or_ExceptKeyword_17_0_or_ReferenceKeyword_10_0_or_RepeatKeyword_4_0_or_ThrowKeyword_18_0_or_YieldKeyword_16_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Flow_BalStatement_BreakKeyword_14_0_or_GotoKeyword_19_0_or_IterateKeyword_13_0.equals(syntax))
				emit_Flow_BalStatement_BreakKeyword_14_0_or_GotoKeyword_19_0_or_IterateKeyword_13_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Flow_BalStatement_BreakKeyword_14_0_or_IterateKeyword_13_0.equals(syntax))
				emit_Flow_BalStatement_BreakKeyword_14_0_or_IterateKeyword_13_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Flow_BalStatement_BreakKeyword_14_0_or_IterateKeyword_13_0_or_NeverKeyword_20.equals(syntax))
				emit_Flow_BalStatement_BreakKeyword_14_0_or_IterateKeyword_13_0_or_NeverKeyword_20(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Flow_BalStatement_GenBound___GenerateKeyword_11_0_ToKeyword_0___or___IfKeyword_1_0_or_SelectKeyword_7_0_or_TryKeyword_5_0_or_TryKeyword_6_0__.equals(syntax))
				emit_Flow_BalStatement_GenBound___GenerateKeyword_11_0_ToKeyword_0___or___IfKeyword_1_0_or_SelectKeyword_7_0_or_TryKeyword_5_0_or_TryKeyword_6_0__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Flow_BalStatement_ReturnKeyword_15_0_q.equals(syntax))
				emit_Flow_BalStatement_ReturnKeyword_15_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Jleft_Molecule_NotKeyword_0_0_q.equals(syntax))
				emit_Jleft_Molecule_NotKeyword_0_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
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
	 *     'always' | 'finally'
	 */
	protected void emit_AlwaysPart_BalStatement_AlwaysKeyword_0_0_or_FinallyKeyword_1_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	 *     Application?
	 */
	protected void emit_DeclMolecule_ApplicationParserRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     KW_COLON | KW_COLONSTAR
	 */
	protected void emit_DeclPart_KW_COLONSTARTerminalRuleCall_1_0_or_KW_COLONTerminalRuleCall_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (
	     ('macro'? ('export' | 'export' | 'export')) | 
	     ('macro'? 'import'?) | 
	     (
	         'free' | 
	         'inline' | 
	         'import' | 
	         'fluid' | 
	         'fix' | 
	         'extend' | 
	         'default' | 
	         'local' | 
	         'define'
	     )
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
	 *     'import' | ('inline' InfixedExprs)
	 */
	protected void emit_Declaration_InfixedExprsDecl_ImportKeyword_9_0_or___InlineKeyword_8_0_InfixedExprsParserRuleCall_0__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'inline' | ('import' InfixedExprs)
	 */
	protected void emit_Declaration_InfixedExprsDecl_InlineKeyword_8_0_or___ImportKeyword_9_0_InfixedExprsParserRuleCall_0__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (
	     ('inline' | 'import') | 
	     (
	         (
	             'free' | 
	             'fluid' | 
	             'fix' | 
	             'extend' | 
	             'default' | 
	             'local' | 
	             'define'
	         ) 
	         InfixedExprs
	     )
	 )
	 */
	protected void emit_Declaration_InfixedExprsDecl___ImportKeyword_9_0_or_InlineKeyword_8_0___or_____DefaultKeyword_5_0_or_DefineKeyword_6_0_or_ExtendKeyword_1_0_or_FixKeyword_7_0_or_FluidKeyword_4_0_or_FreeKeyword_3_0_or_LocalKeyword_2_0___InfixedExprsParserRuleCall_0__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	 *     (E15 'throw' E15) | E15 | (E15 'except' E15)
	 */
	protected void emit_E14_E15ParserRuleCall_0_or___E15ParserRuleCall_3_0_ExceptKeyword_3_1_E15ParserRuleCall_3_2___or___E15ParserRuleCall_4_0_ThrowKeyword_4_1_E15ParserRuleCall_4_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (E15? 'with') | (E15? 'add')
	 */
	protected void emit_E14___E15ParserRuleCall_1_0_q_WithKeyword_1_1___or___E15ParserRuleCall_2_0_q_AddKeyword_2_1__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	 *     ('export' InfixedExprs) | 'export'
	 */
	protected void emit_ExportDecl_InfixedExprsDecl_ExportKeyword_1_0_0_or___ExportKeyword_2_0_0_InfixedExprsParserRuleCall_0__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'export' | ('export' InfixedExprs)
	 */
	protected void emit_ExportDecl_InfixedExprsDecl_ExportKeyword_2_0_0_or___ExportKeyword_1_0_0_InfixedExprsParserRuleCall_0__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('import' | 'export' | 'export' | 'export')?
	 */
	protected void emit_ExportDecl_MacroBody___ExportKeyword_0_0_or_ExportKeyword_1_0_0_or_ExportKeyword_2_0_0_or_ImportKeyword_2_0__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'iterate' | 'break' | 'goto'
	 */
	protected void emit_Flow_AnyStatement_BreakKeyword_14_0_or_GotoKeyword_19_0_or_IterateKeyword_13_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'break' | 'iterate'
	 */
	protected void emit_Flow_AnyStatement_BreakKeyword_14_0_or_IterateKeyword_13_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'iterate' | 'break' | 'never'
	 */
	protected void emit_Flow_AnyStatement_BreakKeyword_14_0_or_IterateKeyword_13_0_or_NeverKeyword_20(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (
	     ('generate' 'to') | 
	     (
	         'delay' | 
	         'throw' | 
	         'reference' | 
	         'yield' | 
	         'if' | 
	         'repeat' | 
	         'assert' | 
	         'do' | 
	         'select' | 
	         'try' | 
	         'except' | 
	         'try'
	     )
	 )
	 */
	protected void emit_Flow_AnyStatement_GenBound___AssertKeyword_12_0_or_DelayKeyword_9_0_or_DoKeyword_8_0_or_ExceptKeyword_17_0_or_IfKeyword_1_0_or_ReferenceKeyword_10_0_or_RepeatKeyword_4_0_or_SelectKeyword_7_0_or_ThrowKeyword_18_0_or_TryKeyword_5_0_or_TryKeyword_6_0_or_YieldKeyword_16_0___or___GenerateKeyword_11_0_ToKeyword_0__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('generate' 'to') | ('if' | 'select' | 'try' | 'try')
	 */
	protected void emit_Flow_AnyStatement_GenBound___GenerateKeyword_11_0_ToKeyword_0___or___IfKeyword_1_0_or_SelectKeyword_7_0_or_TryKeyword_5_0_or_TryKeyword_6_0__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'return'?
	 */
	protected void emit_Flow_AnyStatement_ReturnKeyword_15_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (
	     'except' | 
	     'yield' | 
	     'reference' | 
	     'delay' | 
	     'assert' | 
	     'do' | 
	     'throw' | 
	     'repeat'
	 )
	 */
	protected void emit_Flow_BalStatement_AssertKeyword_12_0_or_DelayKeyword_9_0_or_DoKeyword_8_0_or_ExceptKeyword_17_0_or_ReferenceKeyword_10_0_or_RepeatKeyword_4_0_or_ThrowKeyword_18_0_or_YieldKeyword_16_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'iterate' | 'break' | 'goto'
	 */
	protected void emit_Flow_BalStatement_BreakKeyword_14_0_or_GotoKeyword_19_0_or_IterateKeyword_13_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'iterate' | 'break'
	 */
	protected void emit_Flow_BalStatement_BreakKeyword_14_0_or_IterateKeyword_13_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'iterate' | 'break' | 'never'
	 */
	protected void emit_Flow_BalStatement_BreakKeyword_14_0_or_IterateKeyword_13_0_or_NeverKeyword_20(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('if' | 'try' | 'try' | 'select') | ('generate' 'to')
	 */
	protected void emit_Flow_BalStatement_GenBound___GenerateKeyword_11_0_ToKeyword_0___or___IfKeyword_1_0_or_SelectKeyword_7_0_or_TryKeyword_5_0_or_TryKeyword_6_0__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'return'?
	 */
	protected void emit_Flow_BalStatement_ReturnKeyword_15_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	 *     (
	     (SegTok KW_DOLLAR) | 
	     (ArrowTok KW_DOLLAR) | 
	     (LatticeTok KW_DOLLAR) | 
	     (PowerTok KW_DOLLAR) | 
	     (PlusTok KW_DOLLAR) | 
	     (TimesTok KW_DOLLAR) | 
	     (QuotientTok KW_DOLLAR)
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
