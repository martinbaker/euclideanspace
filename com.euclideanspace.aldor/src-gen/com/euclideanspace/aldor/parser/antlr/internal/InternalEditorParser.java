package com.euclideanspace.aldor.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.euclideanspace.aldor.services.EditorGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalEditorParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_KW_AT", "RULE_KW_COLON", "RULE_KW_COLONSTAR", "RULE_KW_2EQ", "RULE_KW_MARROW", "RULE_KW_MAPSTO", "RULE_KW_MAPSTOSTAR", "RULE_KW_DOLLAR", "RULE_KW_RARROW", "RULE_KW_LARROW", "RULE_KW_MAPSTAR", "RULE_KW_VEE", "RULE_KW_WEDGE", "RULE_KW_EQ", "RULE_KW_TILDEE", "RULE_KW_HATE", "RULE_KW_GE", "RULE_KW_GT", "RULE_KW_2GT", "RULE_KW_LE", "RULE_KW_LT", "RULE_KW_2LT", "RULE_KW_2DOT", "RULE_KW_PLUS", "RULE_KW_MINUS", "RULE_KW_PLUSMINUS", "RULE_KW_STAR", "RULE_KW_SLASH", "RULE_KW_BACKSLASH", "RULE_KW_2STAR", "RULE_KW_HAT", "RULE_KW_OPAREN", "RULE_KW_CPAREN", "RULE_KW_OBRACK", "RULE_KW_CBRACK", "RULE_KW_QUOTE", "RULE_TK_ID", "RULE_KW_COMMA", "RULE_KW_SHARP", "RULE_KW_TILDE", "RULE_TK_INT", "RULE_TK_STRING", "RULE_TK_PREDOC", "RULE_TK_POSTDOC", "RULE_KW_SEMICOLON", "RULE_WS", "RULE_KW_NEWLINE", "RULE_MACROVALUE", "RULE_KW_OCURLY", "RULE_KW_CCURLY", "RULE_KW_BAR", "RULE_KW_DOT", "RULE_KW_2COLON", "RULE_KW_AMPERSAND", "RULE_SLASHSLASH", "RULE_BACKSLASHBACKSLASH", "RULE_TIMESDOLAR", "RULE_DIVDOLAR", "RULE_PLUSDOLAR", "RULE_MINUSDOLAR", "RULE_EQUALSDOLAR", "RULE_KW_IMPLIES", "RULE_KW_ASSIGN", "RULE_PERCENT", "RULE_PRIMEPERCENT", "RULE_ELLIPSIS", "RULE_SUMLIST", "RULE_ANY_OTHER", "'macro'", "'extend'", "'local'", "'free'", "'fluid'", "'default'", "'define'", "'fix'", "'inline'", "'import'", "'export'", "'to'", "'from'", "'where'", "'assign'", "'temp19'", "'temp32'", "'temp41'", "'is'", "'isnt'", "'case'", "'by'", "'mod'", "'quo'", "'rem'", "'exquo'", "'temp52'", "'temp65'"
    };
    public static final int RULE_KW_GE=20;
    public static final int RULE_KW_DOT=55;
    public static final int RULE_KW_AMPERSAND=57;
    public static final int RULE_ANY_OTHER=71;
    public static final int RULE_KW_WEDGE=16;
    public static final int RULE_PERCENT=67;
    public static final int RULE_PRIMEPERCENT=68;
    public static final int RULE_KW_GT=21;
    public static final int EOF=-1;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int RULE_KW_IMPLIES=65;
    public static final int RULE_KW_2EQ=7;
    public static final int T__92=92;
    public static final int T__90=90;
    public static final int RULE_KW_2LT=25;
    public static final int RULE_KW_DOLLAR=11;
    public static final int RULE_KW_TILDE=43;
    public static final int RULE_KW_MAPSTAR=14;
    public static final int RULE_KW_PLUSMINUS=29;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int RULE_KW_COLON=5;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int RULE_KW_MINUS=28;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_KW_MARROW=8;
    public static final int RULE_KW_MAPSTO=9;
    public static final int RULE_KW_SLASH=31;
    public static final int RULE_KW_2COLON=56;
    public static final int RULE_TK_ID=40;
    public static final int RULE_PLUSDOLAR=62;
    public static final int RULE_ELLIPSIS=69;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int RULE_KW_TILDEE=18;
    public static final int T__88=88;
    public static final int RULE_KW_CCURLY=53;
    public static final int RULE_MACROVALUE=51;
    public static final int T__72=72;
    public static final int RULE_TK_POSTDOC=47;
    public static final int RULE_KW_2GT=22;
    public static final int RULE_SUMLIST=70;
    public static final int RULE_KW_ASSIGN=66;
    public static final int RULE_KW_COLONSTAR=6;
    public static final int T__76=76;
    public static final int RULE_KW_OBRACK=37;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int RULE_KW_BAR=54;
    public static final int T__73=73;
    public static final int RULE_KW_CBRACK=38;
    public static final int RULE_KW_RARROW=12;
    public static final int RULE_KW_AT=4;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;
    public static final int RULE_KW_OPAREN=35;
    public static final int RULE_TK_PREDOC=46;
    public static final int RULE_TIMESDOLAR=60;
    public static final int RULE_KW_CPAREN=36;
    public static final int RULE_KW_LT=24;
    public static final int RULE_KW_STAR=30;
    public static final int RULE_KW_HATE=19;
    public static final int RULE_KW_PLUS=27;
    public static final int RULE_KW_SEMICOLON=48;
    public static final int RULE_KW_SHARP=42;
    public static final int RULE_KW_LE=23;
    public static final int RULE_EQUALSDOLAR=64;
    public static final int RULE_KW_QUOTE=39;
    public static final int RULE_KW_BACKSLASH=32;
    public static final int RULE_KW_MAPSTOSTAR=10;
    public static final int RULE_KW_VEE=15;
    public static final int RULE_KW_HAT=34;
    public static final int RULE_KW_LARROW=13;
    public static final int RULE_KW_EQ=17;
    public static final int RULE_TK_STRING=45;
    public static final int RULE_KW_NEWLINE=50;
    public static final int RULE_MINUSDOLAR=63;
    public static final int RULE_BACKSLASHBACKSLASH=59;
    public static final int RULE_KW_OCURLY=52;
    public static final int RULE_SLASHSLASH=58;
    public static final int RULE_DIVDOLAR=61;
    public static final int RULE_KW_2DOT=26;
    public static final int RULE_KW_2STAR=33;
    public static final int RULE_KW_COMMA=41;
    public static final int RULE_TK_INT=44;
    public static final int RULE_WS=49;

    // delegates
    // delegators


        public InternalEditorParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEditorParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEditorParser.tokenNames; }
    public String getGrammarFileName() { return "../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g"; }



     	private EditorGrammarAccess grammarAccess;
     	
        public InternalEditorParser(TokenStream input, EditorGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected EditorGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:69:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:76:1: ruleModel returns [EObject current=null] : this_CurlyContents_Labeled_0= ruleCurlyContents_Labeled ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject this_CurlyContents_Labeled_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:79:28: (this_CurlyContents_Labeled_0= ruleCurlyContents_Labeled )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:81:5: this_CurlyContents_Labeled_0= ruleCurlyContents_Labeled
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getModelAccess().getCurlyContents_LabeledParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleCurlyContents_Labeled_in_ruleModel131);
            this_CurlyContents_Labeled_0=ruleCurlyContents_Labeled();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_CurlyContents_Labeled_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleExpression"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:99:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:100:2: (iv_ruleExpression= ruleExpression EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:101:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression167);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression177); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:108:1: ruleExpression returns [EObject current=null] : this_enlist1a_Labeled_Semicolon_AB_0= ruleenlist1a_Labeled_Semicolon_AB ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_enlist1a_Labeled_Semicolon_AB_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:111:28: (this_enlist1a_Labeled_Semicolon_AB_0= ruleenlist1a_Labeled_Semicolon_AB )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:113:5: this_enlist1a_Labeled_Semicolon_AB_0= ruleenlist1a_Labeled_Semicolon_AB
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getEnlist1a_Labeled_Semicolon_ABParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleenlist1a_Labeled_Semicolon_AB_in_ruleExpression223);
            this_enlist1a_Labeled_Semicolon_AB_0=ruleenlist1a_Labeled_Semicolon_AB();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_enlist1a_Labeled_Semicolon_AB_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleLabeled"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:129:1: entryRuleLabeled returns [EObject current=null] : iv_ruleLabeled= ruleLabeled EOF ;
    public final EObject entryRuleLabeled() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabeled = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:133:2: (iv_ruleLabeled= ruleLabeled EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:134:2: iv_ruleLabeled= ruleLabeled EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLabeledRule()); 
            }
            pushFollow(FOLLOW_ruleLabeled_in_entryRuleLabeled263);
            iv_ruleLabeled=ruleLabeled();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLabeled; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabeled273); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleLabeled"


    // $ANTLR start "ruleLabeled"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:144:1: ruleLabeled returns [EObject current=null] : ( ruleComma | ruleDeclaration | (this_KW_AT_2= RULE_KW_AT this_Atom_3= ruleAtom ( (lv_lab_4_0= ruleLabeled ) )? ) ) ;
    public final EObject ruleLabeled() throws RecognitionException {
        EObject current = null;

        Token this_KW_AT_2=null;
        EObject this_Atom_3 = null;

        EObject lv_lab_4_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:148:28: ( ( ruleComma | ruleDeclaration | (this_KW_AT_2= RULE_KW_AT this_Atom_3= ruleAtom ( (lv_lab_4_0= ruleLabeled ) )? ) ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:149:1: ( ruleComma | ruleDeclaration | (this_KW_AT_2= RULE_KW_AT this_Atom_3= ruleAtom ( (lv_lab_4_0= ruleLabeled ) )? ) )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:149:1: ( ruleComma | ruleDeclaration | (this_KW_AT_2= RULE_KW_AT this_Atom_3= ruleAtom ( (lv_lab_4_0= ruleLabeled ) )? ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 87:
            case 88:
            case 99:
                {
                alt2=1;
                }
                break;
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
                {
                alt2=2;
                }
                break;
            case RULE_KW_AT:
                {
                alt2=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:150:5: ruleComma
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLabeledAccess().getCommaParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleComma_in_ruleLabeled318);
                    ruleComma();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:159:5: ruleDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLabeledAccess().getDeclarationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDeclaration_in_ruleLabeled339);
                    ruleDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:167:6: (this_KW_AT_2= RULE_KW_AT this_Atom_3= ruleAtom ( (lv_lab_4_0= ruleLabeled ) )? )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:167:6: (this_KW_AT_2= RULE_KW_AT this_Atom_3= ruleAtom ( (lv_lab_4_0= ruleLabeled ) )? )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:167:7: this_KW_AT_2= RULE_KW_AT this_Atom_3= ruleAtom ( (lv_lab_4_0= ruleLabeled ) )?
                    {
                    this_KW_AT_2=(Token)match(input,RULE_KW_AT,FOLLOW_RULE_KW_AT_in_ruleLabeled356); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_AT_2, grammarAccess.getLabeledAccess().getKW_ATTerminalRuleCall_2_0()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLabeledAccess().getAtomParserRuleCall_2_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAtom_in_ruleLabeled377);
                    this_Atom_3=ruleAtom();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Atom_3; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:180:1: ( (lv_lab_4_0= ruleLabeled ) )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==RULE_KW_AT||(LA1_0>=72 && LA1_0<=82)||(LA1_0>=87 && LA1_0<=88)||LA1_0==99) ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:181:1: (lv_lab_4_0= ruleLabeled )
                            {
                            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:181:1: (lv_lab_4_0= ruleLabeled )
                            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:182:3: lv_lab_4_0= ruleLabeled
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLabeledAccess().getLabLabeledParserRuleCall_2_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleLabeled_in_ruleLabeled397);
                            lv_lab_4_0=ruleLabeled();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getLabeledRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"lab",
                                      		lv_lab_4_0, 
                                      		"Labeled");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleLabeled"


    // $ANTLR start "entryRuleDeclaration"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:209:1: entryRuleDeclaration returns [String current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final String entryRuleDeclaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDeclaration = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:213:2: (iv_ruleDeclaration= ruleDeclaration EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:214:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration446);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeclaration.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration457); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:224:1: ruleDeclaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'macro' this_MacroBody_1= ruleMacroBody ) | (kw= 'extend' this_Sig_3= ruleSig ) | (kw= 'local' this_Sig_5= ruleSig ) | (kw= 'free' this_Sig_7= ruleSig ) | (kw= 'fluid' this_Sig_9= ruleSig ) | (kw= 'default' this_Sig_11= ruleSig ) | (kw= 'define' this_Sig_13= ruleSig ) | (kw= 'fix' this_Sig_15= ruleSig ) | (kw= 'inline' (this_Sig_17= ruleSig )? (this_FromPart_18= ruleFromPart )? ) | (kw= 'import' (this_Sig_20= ruleSig )? (this_FromPart_21= ruleFromPart )? ) | this_ExportDecl_22= ruleExportDecl ) ;
    public final AntlrDatatypeRuleToken ruleDeclaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_MacroBody_1 = null;

        AntlrDatatypeRuleToken this_Sig_3 = null;

        AntlrDatatypeRuleToken this_Sig_5 = null;

        AntlrDatatypeRuleToken this_Sig_7 = null;

        AntlrDatatypeRuleToken this_Sig_9 = null;

        AntlrDatatypeRuleToken this_Sig_11 = null;

        AntlrDatatypeRuleToken this_Sig_13 = null;

        AntlrDatatypeRuleToken this_Sig_15 = null;

        AntlrDatatypeRuleToken this_Sig_17 = null;

        AntlrDatatypeRuleToken this_FromPart_18 = null;

        AntlrDatatypeRuleToken this_Sig_20 = null;

        AntlrDatatypeRuleToken this_FromPart_21 = null;

        AntlrDatatypeRuleToken this_ExportDecl_22 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:228:28: ( ( (kw= 'macro' this_MacroBody_1= ruleMacroBody ) | (kw= 'extend' this_Sig_3= ruleSig ) | (kw= 'local' this_Sig_5= ruleSig ) | (kw= 'free' this_Sig_7= ruleSig ) | (kw= 'fluid' this_Sig_9= ruleSig ) | (kw= 'default' this_Sig_11= ruleSig ) | (kw= 'define' this_Sig_13= ruleSig ) | (kw= 'fix' this_Sig_15= ruleSig ) | (kw= 'inline' (this_Sig_17= ruleSig )? (this_FromPart_18= ruleFromPart )? ) | (kw= 'import' (this_Sig_20= ruleSig )? (this_FromPart_21= ruleFromPart )? ) | this_ExportDecl_22= ruleExportDecl ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:229:1: ( (kw= 'macro' this_MacroBody_1= ruleMacroBody ) | (kw= 'extend' this_Sig_3= ruleSig ) | (kw= 'local' this_Sig_5= ruleSig ) | (kw= 'free' this_Sig_7= ruleSig ) | (kw= 'fluid' this_Sig_9= ruleSig ) | (kw= 'default' this_Sig_11= ruleSig ) | (kw= 'define' this_Sig_13= ruleSig ) | (kw= 'fix' this_Sig_15= ruleSig ) | (kw= 'inline' (this_Sig_17= ruleSig )? (this_FromPart_18= ruleFromPart )? ) | (kw= 'import' (this_Sig_20= ruleSig )? (this_FromPart_21= ruleFromPart )? ) | this_ExportDecl_22= ruleExportDecl )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:229:1: ( (kw= 'macro' this_MacroBody_1= ruleMacroBody ) | (kw= 'extend' this_Sig_3= ruleSig ) | (kw= 'local' this_Sig_5= ruleSig ) | (kw= 'free' this_Sig_7= ruleSig ) | (kw= 'fluid' this_Sig_9= ruleSig ) | (kw= 'default' this_Sig_11= ruleSig ) | (kw= 'define' this_Sig_13= ruleSig ) | (kw= 'fix' this_Sig_15= ruleSig ) | (kw= 'inline' (this_Sig_17= ruleSig )? (this_FromPart_18= ruleFromPart )? ) | (kw= 'import' (this_Sig_20= ruleSig )? (this_FromPart_21= ruleFromPart )? ) | this_ExportDecl_22= ruleExportDecl )
            int alt7=11;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:229:2: (kw= 'macro' this_MacroBody_1= ruleMacroBody )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:229:2: (kw= 'macro' this_MacroBody_1= ruleMacroBody )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:230:2: kw= 'macro' this_MacroBody_1= ruleMacroBody
                    {
                    kw=(Token)match(input,72,FOLLOW_72_in_ruleDeclaration500); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getDeclarationAccess().getMacroKeyword_0_0()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getMacroBodyParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMacroBody_in_ruleDeclaration522);
                    this_MacroBody_1=ruleMacroBody();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_MacroBody_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:247:6: (kw= 'extend' this_Sig_3= ruleSig )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:247:6: (kw= 'extend' this_Sig_3= ruleSig )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:248:2: kw= 'extend' this_Sig_3= ruleSig
                    {
                    kw=(Token)match(input,73,FOLLOW_73_in_ruleDeclaration548); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getDeclarationAccess().getExtendKeyword_1_0()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getSigParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSig_in_ruleDeclaration570);
                    this_Sig_3=ruleSig();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Sig_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:265:6: (kw= 'local' this_Sig_5= ruleSig )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:265:6: (kw= 'local' this_Sig_5= ruleSig )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:266:2: kw= 'local' this_Sig_5= ruleSig
                    {
                    kw=(Token)match(input,74,FOLLOW_74_in_ruleDeclaration596); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getDeclarationAccess().getLocalKeyword_2_0()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getSigParserRuleCall_2_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSig_in_ruleDeclaration618);
                    this_Sig_5=ruleSig();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Sig_5);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:283:6: (kw= 'free' this_Sig_7= ruleSig )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:283:6: (kw= 'free' this_Sig_7= ruleSig )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:284:2: kw= 'free' this_Sig_7= ruleSig
                    {
                    kw=(Token)match(input,75,FOLLOW_75_in_ruleDeclaration644); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getDeclarationAccess().getFreeKeyword_3_0()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getSigParserRuleCall_3_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSig_in_ruleDeclaration666);
                    this_Sig_7=ruleSig();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Sig_7);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:301:6: (kw= 'fluid' this_Sig_9= ruleSig )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:301:6: (kw= 'fluid' this_Sig_9= ruleSig )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:302:2: kw= 'fluid' this_Sig_9= ruleSig
                    {
                    kw=(Token)match(input,76,FOLLOW_76_in_ruleDeclaration692); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getDeclarationAccess().getFluidKeyword_4_0()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getSigParserRuleCall_4_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSig_in_ruleDeclaration714);
                    this_Sig_9=ruleSig();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Sig_9);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:319:6: (kw= 'default' this_Sig_11= ruleSig )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:319:6: (kw= 'default' this_Sig_11= ruleSig )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:320:2: kw= 'default' this_Sig_11= ruleSig
                    {
                    kw=(Token)match(input,77,FOLLOW_77_in_ruleDeclaration740); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getDeclarationAccess().getDefaultKeyword_5_0()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getSigParserRuleCall_5_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSig_in_ruleDeclaration762);
                    this_Sig_11=ruleSig();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Sig_11);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:337:6: (kw= 'define' this_Sig_13= ruleSig )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:337:6: (kw= 'define' this_Sig_13= ruleSig )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:338:2: kw= 'define' this_Sig_13= ruleSig
                    {
                    kw=(Token)match(input,78,FOLLOW_78_in_ruleDeclaration788); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getDeclarationAccess().getDefineKeyword_6_0()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getSigParserRuleCall_6_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSig_in_ruleDeclaration810);
                    this_Sig_13=ruleSig();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Sig_13);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:355:6: (kw= 'fix' this_Sig_15= ruleSig )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:355:6: (kw= 'fix' this_Sig_15= ruleSig )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:356:2: kw= 'fix' this_Sig_15= ruleSig
                    {
                    kw=(Token)match(input,79,FOLLOW_79_in_ruleDeclaration836); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getDeclarationAccess().getFixKeyword_7_0()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getSigParserRuleCall_7_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSig_in_ruleDeclaration858);
                    this_Sig_15=ruleSig();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Sig_15);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:373:6: (kw= 'inline' (this_Sig_17= ruleSig )? (this_FromPart_18= ruleFromPart )? )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:373:6: (kw= 'inline' (this_Sig_17= ruleSig )? (this_FromPart_18= ruleFromPart )? )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:374:2: kw= 'inline' (this_Sig_17= ruleSig )? (this_FromPart_18= ruleFromPart )?
                    {
                    kw=(Token)match(input,80,FOLLOW_80_in_ruleDeclaration884); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getDeclarationAccess().getInlineKeyword_8_0()); 
                          
                    }
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:379:1: (this_Sig_17= ruleSig )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==88||LA3_0==99) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:380:5: this_Sig_17= ruleSig
                            {
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getDeclarationAccess().getSigParserRuleCall_8_1()); 
                                  
                            }
                            pushFollow(FOLLOW_ruleSig_in_ruleDeclaration907);
                            this_Sig_17=ruleSig();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_Sig_17);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                      afterParserOrEnumRuleCall();
                                  
                            }

                            }
                            break;

                    }

                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:390:3: (this_FromPart_18= ruleFromPart )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==84) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:391:5: this_FromPart_18= ruleFromPart
                            {
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getDeclarationAccess().getFromPartParserRuleCall_8_2()); 
                                  
                            }
                            pushFollow(FOLLOW_ruleFromPart_in_ruleDeclaration937);
                            this_FromPart_18=ruleFromPart();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_FromPart_18);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                      afterParserOrEnumRuleCall();
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 10 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:402:6: (kw= 'import' (this_Sig_20= ruleSig )? (this_FromPart_21= ruleFromPart )? )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:402:6: (kw= 'import' (this_Sig_20= ruleSig )? (this_FromPart_21= ruleFromPart )? )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:403:2: kw= 'import' (this_Sig_20= ruleSig )? (this_FromPart_21= ruleFromPart )?
                    {
                    kw=(Token)match(input,81,FOLLOW_81_in_ruleDeclaration965); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getDeclarationAccess().getImportKeyword_9_0()); 
                          
                    }
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:408:1: (this_Sig_20= ruleSig )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==88||LA5_0==99) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:409:5: this_Sig_20= ruleSig
                            {
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getDeclarationAccess().getSigParserRuleCall_9_1()); 
                                  
                            }
                            pushFollow(FOLLOW_ruleSig_in_ruleDeclaration988);
                            this_Sig_20=ruleSig();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_Sig_20);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                      afterParserOrEnumRuleCall();
                                  
                            }

                            }
                            break;

                    }

                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:419:3: (this_FromPart_21= ruleFromPart )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==84) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:420:5: this_FromPart_21= ruleFromPart
                            {
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getDeclarationAccess().getFromPartParserRuleCall_9_2()); 
                                  
                            }
                            pushFollow(FOLLOW_ruleFromPart_in_ruleDeclaration1018);
                            this_FromPart_21=ruleFromPart();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_FromPart_21);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                      afterParserOrEnumRuleCall();
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 11 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:432:5: this_ExportDecl_22= ruleExportDecl
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getExportDeclParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExportDecl_in_ruleDeclaration1054);
                    this_ExportDecl_22=ruleExportDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ExportDecl_22);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleExportDecl"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:453:1: entryRuleExportDecl returns [String current=null] : iv_ruleExportDecl= ruleExportDecl EOF ;
    public final String entryRuleExportDecl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExportDecl = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:457:2: (iv_ruleExportDecl= ruleExportDecl EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:458:2: iv_ruleExportDecl= ruleExportDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExportDeclRule()); 
            }
            pushFollow(FOLLOW_ruleExportDecl_in_entryRuleExportDecl1110);
            iv_ruleExportDecl=ruleExportDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExportDecl.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExportDecl1121); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleExportDecl"


    // $ANTLR start "ruleExportDecl"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:468:1: ruleExportDecl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'export' (this_Sig_1= ruleSig )? ) | ( ( ( 'export' ( ruleSig )? ruleToPart ) )=> (kw= 'export' (this_Sig_3= ruleSig )? this_ToPart_4= ruleToPart ) ) | ( ( ( 'export' ( ruleSig )? ruleFromPart ) )=> (kw= 'export' (this_Sig_6= ruleSig )? this_FromPart_7= ruleFromPart ) ) ) ;
    public final AntlrDatatypeRuleToken ruleExportDecl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Sig_1 = null;

        AntlrDatatypeRuleToken this_Sig_3 = null;

        AntlrDatatypeRuleToken this_ToPart_4 = null;

        AntlrDatatypeRuleToken this_Sig_6 = null;

        AntlrDatatypeRuleToken this_FromPart_7 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:472:28: ( ( (kw= 'export' (this_Sig_1= ruleSig )? ) | ( ( ( 'export' ( ruleSig )? ruleToPart ) )=> (kw= 'export' (this_Sig_3= ruleSig )? this_ToPart_4= ruleToPart ) ) | ( ( ( 'export' ( ruleSig )? ruleFromPart ) )=> (kw= 'export' (this_Sig_6= ruleSig )? this_FromPart_7= ruleFromPart ) ) ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:473:1: ( (kw= 'export' (this_Sig_1= ruleSig )? ) | ( ( ( 'export' ( ruleSig )? ruleToPart ) )=> (kw= 'export' (this_Sig_3= ruleSig )? this_ToPart_4= ruleToPart ) ) | ( ( ( 'export' ( ruleSig )? ruleFromPart ) )=> (kw= 'export' (this_Sig_6= ruleSig )? this_FromPart_7= ruleFromPart ) ) )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:473:1: ( (kw= 'export' (this_Sig_1= ruleSig )? ) | ( ( ( 'export' ( ruleSig )? ruleToPart ) )=> (kw= 'export' (this_Sig_3= ruleSig )? this_ToPart_4= ruleToPart ) ) | ( ( ( 'export' ( ruleSig )? ruleFromPart ) )=> (kw= 'export' (this_Sig_6= ruleSig )? this_FromPart_7= ruleFromPart ) ) )
            int alt11=3;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==82) ) {
                int LA11_1 = input.LA(2);

                if ( (true) ) {
                    alt11=1;
                }
                else if ( (synpred1_InternalEditor()) ) {
                    alt11=2;
                }
                else if ( (synpred2_InternalEditor()) ) {
                    alt11=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:473:2: (kw= 'export' (this_Sig_1= ruleSig )? )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:473:2: (kw= 'export' (this_Sig_1= ruleSig )? )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:474:2: kw= 'export' (this_Sig_1= ruleSig )?
                    {
                    kw=(Token)match(input,82,FOLLOW_82_in_ruleExportDecl1164); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExportDeclAccess().getExportKeyword_0_0()); 
                          
                    }
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:479:1: (this_Sig_1= ruleSig )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==88||LA8_0==99) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:480:5: this_Sig_1= ruleSig
                            {
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getExportDeclAccess().getSigParserRuleCall_0_1()); 
                                  
                            }
                            pushFollow(FOLLOW_ruleSig_in_ruleExportDecl1187);
                            this_Sig_1=ruleSig();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_Sig_1);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                      afterParserOrEnumRuleCall();
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:491:6: ( ( ( 'export' ( ruleSig )? ruleToPart ) )=> (kw= 'export' (this_Sig_3= ruleSig )? this_ToPart_4= ruleToPart ) )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:491:6: ( ( ( 'export' ( ruleSig )? ruleToPart ) )=> (kw= 'export' (this_Sig_3= ruleSig )? this_ToPart_4= ruleToPart ) )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:491:7: ( ( 'export' ( ruleSig )? ruleToPart ) )=> (kw= 'export' (this_Sig_3= ruleSig )? this_ToPart_4= ruleToPart )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:493:27: (kw= 'export' (this_Sig_3= ruleSig )? this_ToPart_4= ruleToPart )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:494:2: kw= 'export' (this_Sig_3= ruleSig )? this_ToPart_4= ruleToPart
                    {
                    kw=(Token)match(input,82,FOLLOW_82_in_ruleExportDecl1233); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExportDeclAccess().getExportKeyword_1_0_0()); 
                          
                    }
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:499:1: (this_Sig_3= ruleSig )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==88||LA9_0==99) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:500:5: this_Sig_3= ruleSig
                            {
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getExportDeclAccess().getSigParserRuleCall_1_0_1()); 
                                  
                            }
                            pushFollow(FOLLOW_ruleSig_in_ruleExportDecl1256);
                            this_Sig_3=ruleSig();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_Sig_3);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                      afterParserOrEnumRuleCall();
                                  
                            }

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExportDeclAccess().getToPartParserRuleCall_1_0_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleToPart_in_ruleExportDecl1285);
                    this_ToPart_4=ruleToPart();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ToPart_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:522:6: ( ( ( 'export' ( ruleSig )? ruleFromPart ) )=> (kw= 'export' (this_Sig_6= ruleSig )? this_FromPart_7= ruleFromPart ) )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:522:6: ( ( ( 'export' ( ruleSig )? ruleFromPart ) )=> (kw= 'export' (this_Sig_6= ruleSig )? this_FromPart_7= ruleFromPart ) )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:522:7: ( ( 'export' ( ruleSig )? ruleFromPart ) )=> (kw= 'export' (this_Sig_6= ruleSig )? this_FromPart_7= ruleFromPart )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:524:29: (kw= 'export' (this_Sig_6= ruleSig )? this_FromPart_7= ruleFromPart )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:525:2: kw= 'export' (this_Sig_6= ruleSig )? this_FromPart_7= ruleFromPart
                    {
                    kw=(Token)match(input,82,FOLLOW_82_in_ruleExportDecl1330); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExportDeclAccess().getExportKeyword_2_0_0()); 
                          
                    }
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:530:1: (this_Sig_6= ruleSig )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==88||LA10_0==99) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:531:5: this_Sig_6= ruleSig
                            {
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getExportDeclAccess().getSigParserRuleCall_2_0_1()); 
                                  
                            }
                            pushFollow(FOLLOW_ruleSig_in_ruleExportDecl1353);
                            this_Sig_6=ruleSig();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_Sig_6);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                      afterParserOrEnumRuleCall();
                                  
                            }

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExportDeclAccess().getFromPartParserRuleCall_2_0_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFromPart_in_ruleExportDecl1382);
                    this_FromPart_7=ruleFromPart();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_FromPart_7);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleExportDecl"


    // $ANTLR start "entryRuleToPart"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:563:1: entryRuleToPart returns [String current=null] : iv_ruleToPart= ruleToPart EOF ;
    public final String entryRuleToPart() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleToPart = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:567:2: (iv_ruleToPart= ruleToPart EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:568:2: iv_ruleToPart= ruleToPart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getToPartRule()); 
            }
            pushFollow(FOLLOW_ruleToPart_in_entryRuleToPart1440);
            iv_ruleToPart=ruleToPart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleToPart.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleToPart1451); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleToPart"


    // $ANTLR start "ruleToPart"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:578:1: ruleToPart returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'to' this_Infixed_1= ruleInfixed ) ;
    public final AntlrDatatypeRuleToken ruleToPart() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Infixed_1 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:582:28: ( (kw= 'to' this_Infixed_1= ruleInfixed ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:583:1: (kw= 'to' this_Infixed_1= ruleInfixed )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:583:1: (kw= 'to' this_Infixed_1= ruleInfixed )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:584:2: kw= 'to' this_Infixed_1= ruleInfixed
            {
            kw=(Token)match(input,83,FOLLOW_83_in_ruleToPart1493); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getToPartAccess().getToKeyword_0()); 
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getToPartAccess().getInfixedParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleInfixed_in_ruleToPart1515);
            this_Infixed_1=ruleInfixed();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Infixed_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleToPart"


    // $ANTLR start "entryRuleFromPart"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:611:1: entryRuleFromPart returns [String current=null] : iv_ruleFromPart= ruleFromPart EOF ;
    public final String entryRuleFromPart() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFromPart = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:615:2: (iv_ruleFromPart= ruleFromPart EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:616:2: iv_ruleFromPart= ruleFromPart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFromPartRule()); 
            }
            pushFollow(FOLLOW_ruleFromPart_in_entryRuleFromPart1571);
            iv_ruleFromPart=ruleFromPart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFromPart.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFromPart1582); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleFromPart"


    // $ANTLR start "ruleFromPart"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:626:1: ruleFromPart returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'from' this_enlist1_Infixed_Comma_AB_1= ruleenlist1_Infixed_Comma_AB ) ;
    public final AntlrDatatypeRuleToken ruleFromPart() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_enlist1_Infixed_Comma_AB_1 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:630:28: ( (kw= 'from' this_enlist1_Infixed_Comma_AB_1= ruleenlist1_Infixed_Comma_AB ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:631:1: (kw= 'from' this_enlist1_Infixed_Comma_AB_1= ruleenlist1_Infixed_Comma_AB )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:631:1: (kw= 'from' this_enlist1_Infixed_Comma_AB_1= ruleenlist1_Infixed_Comma_AB )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:632:2: kw= 'from' this_enlist1_Infixed_Comma_AB_1= ruleenlist1_Infixed_Comma_AB
            {
            kw=(Token)match(input,84,FOLLOW_84_in_ruleFromPart1624); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getFromPartAccess().getFromKeyword_0()); 
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getFromPartAccess().getEnlist1_Infixed_Comma_ABParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleenlist1_Infixed_Comma_AB_in_ruleFromPart1646);
            this_enlist1_Infixed_Comma_AB_1=ruleenlist1_Infixed_Comma_AB();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_enlist1_Infixed_Comma_AB_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleFromPart"


    // $ANTLR start "entryRuleMacroBody"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:659:1: entryRuleMacroBody returns [String current=null] : iv_ruleMacroBody= ruleMacroBody EOF ;
    public final String entryRuleMacroBody() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMacroBody = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:663:2: (iv_ruleMacroBody= ruleMacroBody EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:664:2: iv_ruleMacroBody= ruleMacroBody EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMacroBodyRule()); 
            }
            pushFollow(FOLLOW_ruleMacroBody_in_entryRuleMacroBody1702);
            iv_ruleMacroBody=ruleMacroBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMacroBody.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMacroBody1713); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleMacroBody"


    // $ANTLR start "ruleMacroBody"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:674:1: ruleMacroBody returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Sig_0= ruleSig | this_ExportDecl_1= ruleExportDecl | (kw= 'import' this_Sig_3= ruleSig (this_FromPart_4= ruleFromPart )? ) ) ;
    public final AntlrDatatypeRuleToken ruleMacroBody() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Sig_0 = null;

        AntlrDatatypeRuleToken this_ExportDecl_1 = null;

        AntlrDatatypeRuleToken this_Sig_3 = null;

        AntlrDatatypeRuleToken this_FromPart_4 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:678:28: ( (this_Sig_0= ruleSig | this_ExportDecl_1= ruleExportDecl | (kw= 'import' this_Sig_3= ruleSig (this_FromPart_4= ruleFromPart )? ) ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:679:1: (this_Sig_0= ruleSig | this_ExportDecl_1= ruleExportDecl | (kw= 'import' this_Sig_3= ruleSig (this_FromPart_4= ruleFromPart )? ) )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:679:1: (this_Sig_0= ruleSig | this_ExportDecl_1= ruleExportDecl | (kw= 'import' this_Sig_3= ruleSig (this_FromPart_4= ruleFromPart )? ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 88:
            case 99:
                {
                alt13=1;
                }
                break;
            case 82:
                {
                alt13=2;
                }
                break;
            case 81:
                {
                alt13=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:680:5: this_Sig_0= ruleSig
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMacroBodyAccess().getSigParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSig_in_ruleMacroBody1764);
                    this_Sig_0=ruleSig();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Sig_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:692:5: this_ExportDecl_1= ruleExportDecl
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMacroBodyAccess().getExportDeclParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExportDecl_in_ruleMacroBody1797);
                    this_ExportDecl_1=ruleExportDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ExportDecl_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:703:6: (kw= 'import' this_Sig_3= ruleSig (this_FromPart_4= ruleFromPart )? )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:703:6: (kw= 'import' this_Sig_3= ruleSig (this_FromPart_4= ruleFromPart )? )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:704:2: kw= 'import' this_Sig_3= ruleSig (this_FromPart_4= ruleFromPart )?
                    {
                    kw=(Token)match(input,81,FOLLOW_81_in_ruleMacroBody1822); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getMacroBodyAccess().getImportKeyword_2_0()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMacroBodyAccess().getSigParserRuleCall_2_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSig_in_ruleMacroBody1844);
                    this_Sig_3=ruleSig();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Sig_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:720:1: (this_FromPart_4= ruleFromPart )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==84) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:721:5: this_FromPart_4= ruleFromPart
                            {
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getMacroBodyAccess().getFromPartParserRuleCall_2_2()); 
                                  
                            }
                            pushFollow(FOLLOW_ruleFromPart_in_ruleMacroBody1872);
                            this_FromPart_4=ruleFromPart();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_FromPart_4);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                      afterParserOrEnumRuleCall();
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleMacroBody"


    // $ANTLR start "entryRuleSig"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:742:1: entryRuleSig returns [String current=null] : iv_ruleSig= ruleSig EOF ;
    public final String entryRuleSig() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSig = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:746:2: (iv_ruleSig= ruleSig EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:747:2: iv_ruleSig= ruleSig EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSigRule()); 
            }
            pushFollow(FOLLOW_ruleSig_in_entryRuleSig1931);
            iv_ruleSig=ruleSig();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSig.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSig1942); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleSig"


    // $ANTLR start "ruleSig"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:757:1: ruleSig returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DeclBinding_0= ruleDeclBinding | this_Block_1= ruleBlock ) ;
    public final AntlrDatatypeRuleToken ruleSig() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_DeclBinding_0 = null;

        AntlrDatatypeRuleToken this_Block_1 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:761:28: ( (this_DeclBinding_0= ruleDeclBinding | this_Block_1= ruleBlock ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:762:1: (this_DeclBinding_0= ruleDeclBinding | this_Block_1= ruleBlock )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:762:1: (this_DeclBinding_0= ruleDeclBinding | this_Block_1= ruleBlock )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==88) ) {
                alt14=1;
            }
            else if ( (LA14_0==99) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:763:5: this_DeclBinding_0= ruleDeclBinding
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSigAccess().getDeclBindingParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDeclBinding_in_ruleSig1993);
                    this_DeclBinding_0=ruleDeclBinding();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_DeclBinding_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:775:5: this_Block_1= ruleBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSigAccess().getBlockParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBlock_in_ruleSig2026);
                    this_Block_1=ruleBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Block_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleSig"


    // $ANTLR start "entryRuleDeclPart"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:796:1: entryRuleDeclPart returns [String current=null] : iv_ruleDeclPart= ruleDeclPart EOF ;
    public final String entryRuleDeclPart() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDeclPart = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:800:2: (iv_ruleDeclPart= ruleDeclPart EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:801:2: iv_ruleDeclPart= ruleDeclPart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclPartRule()); 
            }
            pushFollow(FOLLOW_ruleDeclPart_in_entryRuleDeclPart2082);
            iv_ruleDeclPart=ruleDeclPart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeclPart.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclPart2093); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleDeclPart"


    // $ANTLR start "ruleDeclPart"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:811:1: ruleDeclPart returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_KW_COLON_0= RULE_KW_COLON this_Type_1= ruleType ) | (this_KW_COLONSTAR_2= RULE_KW_COLONSTAR this_Type_3= ruleType ) ) ;
    public final AntlrDatatypeRuleToken ruleDeclPart() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_KW_COLON_0=null;
        Token this_KW_COLONSTAR_2=null;
        AntlrDatatypeRuleToken this_Type_1 = null;

        AntlrDatatypeRuleToken this_Type_3 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:815:28: ( ( (this_KW_COLON_0= RULE_KW_COLON this_Type_1= ruleType ) | (this_KW_COLONSTAR_2= RULE_KW_COLONSTAR this_Type_3= ruleType ) ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:816:1: ( (this_KW_COLON_0= RULE_KW_COLON this_Type_1= ruleType ) | (this_KW_COLONSTAR_2= RULE_KW_COLONSTAR this_Type_3= ruleType ) )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:816:1: ( (this_KW_COLON_0= RULE_KW_COLON this_Type_1= ruleType ) | (this_KW_COLONSTAR_2= RULE_KW_COLONSTAR this_Type_3= ruleType ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_KW_COLON) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_KW_COLONSTAR) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:816:2: (this_KW_COLON_0= RULE_KW_COLON this_Type_1= ruleType )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:816:2: (this_KW_COLON_0= RULE_KW_COLON this_Type_1= ruleType )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:816:7: this_KW_COLON_0= RULE_KW_COLON this_Type_1= ruleType
                    {
                    this_KW_COLON_0=(Token)match(input,RULE_KW_COLON,FOLLOW_RULE_KW_COLON_in_ruleDeclPart2138); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_KW_COLON_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_COLON_0, grammarAccess.getDeclPartAccess().getKW_COLONTerminalRuleCall_0_0()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclPartAccess().getTypeParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleType_in_ruleDeclPart2165);
                    this_Type_1=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Type_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:835:6: (this_KW_COLONSTAR_2= RULE_KW_COLONSTAR this_Type_3= ruleType )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:835:6: (this_KW_COLONSTAR_2= RULE_KW_COLONSTAR this_Type_3= ruleType )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:835:11: this_KW_COLONSTAR_2= RULE_KW_COLONSTAR this_Type_3= ruleType
                    {
                    this_KW_COLONSTAR_2=(Token)match(input,RULE_KW_COLONSTAR,FOLLOW_RULE_KW_COLONSTAR_in_ruleDeclPart2193); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_KW_COLONSTAR_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_COLONSTAR_2, grammarAccess.getDeclPartAccess().getKW_COLONSTARTerminalRuleCall_1_0()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclPartAccess().getTypeParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleType_in_ruleDeclPart2220);
                    this_Type_3=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Type_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleDeclPart"


    // $ANTLR start "entryRuleComma"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:864:1: entryRuleComma returns [String current=null] : iv_ruleComma= ruleComma EOF ;
    public final String entryRuleComma() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleComma = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:868:2: (iv_ruleComma= ruleComma EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:869:2: iv_ruleComma= ruleComma EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommaRule()); 
            }
            pushFollow(FOLLOW_ruleComma_in_entryRuleComma2277);
            iv_ruleComma=ruleComma();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComma.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComma2288); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleComma"


    // $ANTLR start "ruleComma"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:879:1: ruleComma returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_enlist1_CommaItem_Comma_AB_0= ruleenlist1_CommaItem_Comma_AB ;
    public final AntlrDatatypeRuleToken ruleComma() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_enlist1_CommaItem_Comma_AB_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:883:28: (this_enlist1_CommaItem_Comma_AB_0= ruleenlist1_CommaItem_Comma_AB )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:885:5: this_enlist1_CommaItem_Comma_AB_0= ruleenlist1_CommaItem_Comma_AB
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCommaAccess().getEnlist1_CommaItem_Comma_ABParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleenlist1_CommaItem_Comma_AB_in_ruleComma2338);
            this_enlist1_CommaItem_Comma_AB_0=ruleenlist1_CommaItem_Comma_AB();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_enlist1_CommaItem_Comma_AB_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleComma"


    // $ANTLR start "entryRuleCommaItem"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:906:1: entryRuleCommaItem returns [String current=null] : iv_ruleCommaItem= ruleCommaItem EOF ;
    public final String entryRuleCommaItem() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCommaItem = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:910:2: (iv_ruleCommaItem= ruleCommaItem EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:911:2: iv_ruleCommaItem= ruleCommaItem EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommaItemRule()); 
            }
            pushFollow(FOLLOW_ruleCommaItem_in_entryRuleCommaItem2393);
            iv_ruleCommaItem=ruleCommaItem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommaItem.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommaItem2404); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleCommaItem"


    // $ANTLR start "ruleCommaItem"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:921:1: ruleCommaItem returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Binding_AnyStatement_0= ruleBinding_AnyStatement ( ( ( 'where' ruleCommaItem ) )=> (kw= 'where' this_CommaItem_2= ruleCommaItem ) )* ) ;
    public final AntlrDatatypeRuleToken ruleCommaItem() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Binding_AnyStatement_0 = null;

        AntlrDatatypeRuleToken this_CommaItem_2 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:925:28: ( (this_Binding_AnyStatement_0= ruleBinding_AnyStatement ( ( ( 'where' ruleCommaItem ) )=> (kw= 'where' this_CommaItem_2= ruleCommaItem ) )* ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:926:1: (this_Binding_AnyStatement_0= ruleBinding_AnyStatement ( ( ( 'where' ruleCommaItem ) )=> (kw= 'where' this_CommaItem_2= ruleCommaItem ) )* )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:926:1: (this_Binding_AnyStatement_0= ruleBinding_AnyStatement ( ( ( 'where' ruleCommaItem ) )=> (kw= 'where' this_CommaItem_2= ruleCommaItem ) )* )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:927:5: this_Binding_AnyStatement_0= ruleBinding_AnyStatement ( ( ( 'where' ruleCommaItem ) )=> (kw= 'where' this_CommaItem_2= ruleCommaItem ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCommaItemAccess().getBinding_AnyStatementParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBinding_AnyStatement_in_ruleCommaItem2455);
            this_Binding_AnyStatement_0=ruleBinding_AnyStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Binding_AnyStatement_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:937:1: ( ( ( 'where' ruleCommaItem ) )=> (kw= 'where' this_CommaItem_2= ruleCommaItem ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==85) ) {
                    int LA16_2 = input.LA(2);

                    if ( (synpred3_InternalEditor()) ) {
                        alt16=1;
                    }


                }


                switch (alt16) {
            	case 1 :
            	    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:937:2: ( ( 'where' ruleCommaItem ) )=> (kw= 'where' this_CommaItem_2= ruleCommaItem )
            	    {
            	    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:939:18: (kw= 'where' this_CommaItem_2= ruleCommaItem )
            	    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:940:2: kw= 'where' this_CommaItem_2= ruleCommaItem
            	    {
            	    kw=(Token)match(input,85,FOLLOW_85_in_ruleCommaItem2486); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getCommaItemAccess().getWhereKeyword_1_0_0()); 
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getCommaItemAccess().getCommaItemParserRuleCall_1_0_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleCommaItem_in_ruleCommaItem2508);
            	    this_CommaItem_2=ruleCommaItem();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_CommaItem_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleCommaItem"


    // $ANTLR start "entryRuleDeclBinding"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:967:1: entryRuleDeclBinding returns [String current=null] : iv_ruleDeclBinding= ruleDeclBinding EOF ;
    public final String entryRuleDeclBinding() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDeclBinding = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:971:2: (iv_ruleDeclBinding= ruleDeclBinding EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:972:2: iv_ruleDeclBinding= ruleDeclBinding EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclBindingRule()); 
            }
            pushFollow(FOLLOW_ruleDeclBinding_in_entryRuleDeclBinding2567);
            iv_ruleDeclBinding=ruleDeclBinding();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeclBinding.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclBinding2578); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleDeclBinding"


    // $ANTLR start "ruleDeclBinding"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:982:1: ruleDeclBinding returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_BindingR_InfixedExprsDecl_AnyStatement_0= ruleBindingR_InfixedExprsDecl_AnyStatement ;
    public final AntlrDatatypeRuleToken ruleDeclBinding() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_BindingR_InfixedExprsDecl_AnyStatement_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:986:28: (this_BindingR_InfixedExprsDecl_AnyStatement_0= ruleBindingR_InfixedExprsDecl_AnyStatement )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:988:5: this_BindingR_InfixedExprsDecl_AnyStatement_0= ruleBindingR_InfixedExprsDecl_AnyStatement
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDeclBindingAccess().getBindingR_InfixedExprsDecl_AnyStatementParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleBindingR_InfixedExprsDecl_AnyStatement_in_ruleDeclBinding2628);
            this_BindingR_InfixedExprsDecl_AnyStatement_0=ruleBindingR_InfixedExprsDecl_AnyStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_BindingR_InfixedExprsDecl_AnyStatement_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleDeclBinding"


    // $ANTLR start "entryRuleInfixedExprsDecl"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1009:1: entryRuleInfixedExprsDecl returns [String current=null] : iv_ruleInfixedExprsDecl= ruleInfixedExprsDecl EOF ;
    public final String entryRuleInfixedExprsDecl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInfixedExprsDecl = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1013:2: (iv_ruleInfixedExprsDecl= ruleInfixedExprsDecl EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1014:2: iv_ruleInfixedExprsDecl= ruleInfixedExprsDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInfixedExprsDeclRule()); 
            }
            pushFollow(FOLLOW_ruleInfixedExprsDecl_in_entryRuleInfixedExprsDecl2683);
            iv_ruleInfixedExprsDecl=ruleInfixedExprsDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInfixedExprsDecl.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInfixedExprsDecl2694); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleInfixedExprsDecl"


    // $ANTLR start "ruleInfixedExprsDecl"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1024:1: ruleInfixedExprsDecl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_InfixedExprs_0= ruleInfixedExprs (this_DeclPart_1= ruleDeclPart )* ) ;
    public final AntlrDatatypeRuleToken ruleInfixedExprsDecl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_InfixedExprs_0 = null;

        AntlrDatatypeRuleToken this_DeclPart_1 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1028:28: ( (this_InfixedExprs_0= ruleInfixedExprs (this_DeclPart_1= ruleDeclPart )* ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1029:1: (this_InfixedExprs_0= ruleInfixedExprs (this_DeclPart_1= ruleDeclPart )* )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1029:1: (this_InfixedExprs_0= ruleInfixedExprs (this_DeclPart_1= ruleDeclPart )* )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1030:5: this_InfixedExprs_0= ruleInfixedExprs (this_DeclPart_1= ruleDeclPart )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getInfixedExprsDeclAccess().getInfixedExprsParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleInfixedExprs_in_ruleInfixedExprsDecl2745);
            this_InfixedExprs_0=ruleInfixedExprs();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_InfixedExprs_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1040:1: (this_DeclPart_1= ruleDeclPart )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=RULE_KW_COLON && LA17_0<=RULE_KW_COLONSTAR)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1041:5: this_DeclPart_1= ruleDeclPart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getInfixedExprsDeclAccess().getDeclPartParserRuleCall_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleDeclPart_in_ruleInfixedExprsDecl2773);
            	    this_DeclPart_1=ruleDeclPart();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_DeclPart_1);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleInfixedExprsDecl"


    // $ANTLR start "entryRuleInfixedExprs"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1062:1: entryRuleInfixedExprs returns [String current=null] : iv_ruleInfixedExprs= ruleInfixedExprs EOF ;
    public final String entryRuleInfixedExprs() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInfixedExprs = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1066:2: (iv_ruleInfixedExprs= ruleInfixedExprs EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1067:2: iv_ruleInfixedExprs= ruleInfixedExprs EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInfixedExprsRule()); 
            }
            pushFollow(FOLLOW_ruleInfixedExprs_in_entryRuleInfixedExprs2831);
            iv_ruleInfixedExprs=ruleInfixedExprs();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInfixedExprs.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInfixedExprs2842); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleInfixedExprs"


    // $ANTLR start "ruleInfixedExprs"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1077:1: ruleInfixedExprs returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_enlist1_InfixedExpr_Comma_AB_0= ruleenlist1_InfixedExpr_Comma_AB ;
    public final AntlrDatatypeRuleToken ruleInfixedExprs() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_enlist1_InfixedExpr_Comma_AB_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1081:28: (this_enlist1_InfixedExpr_Comma_AB_0= ruleenlist1_InfixedExpr_Comma_AB )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1083:5: this_enlist1_InfixedExpr_Comma_AB_0= ruleenlist1_InfixedExpr_Comma_AB
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getInfixedExprsAccess().getEnlist1_InfixedExpr_Comma_ABParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleenlist1_InfixedExpr_Comma_AB_in_ruleInfixedExprs2892);
            this_enlist1_InfixedExpr_Comma_AB_0=ruleenlist1_InfixedExpr_Comma_AB();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_enlist1_InfixedExpr_Comma_AB_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleInfixedExprs"


    // $ANTLR start "entryRuleBinding_AnyStatement"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1104:1: entryRuleBinding_AnyStatement returns [String current=null] : iv_ruleBinding_AnyStatement= ruleBinding_AnyStatement EOF ;
    public final String entryRuleBinding_AnyStatement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBinding_AnyStatement = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1108:2: (iv_ruleBinding_AnyStatement= ruleBinding_AnyStatement EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1109:2: iv_ruleBinding_AnyStatement= ruleBinding_AnyStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBinding_AnyStatementRule()); 
            }
            pushFollow(FOLLOW_ruleBinding_AnyStatement_in_entryRuleBinding_AnyStatement2947);
            iv_ruleBinding_AnyStatement=ruleBinding_AnyStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBinding_AnyStatement.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinding_AnyStatement2958); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleBinding_AnyStatement"


    // $ANTLR start "ruleBinding_AnyStatement"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1119:1: ruleBinding_AnyStatement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_BindingL_Infixed_AnyStatement_0= ruleBindingL_Infixed_AnyStatement ;
    public final AntlrDatatypeRuleToken ruleBinding_AnyStatement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_BindingL_Infixed_AnyStatement_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1123:28: (this_BindingL_Infixed_AnyStatement_0= ruleBindingL_Infixed_AnyStatement )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1125:5: this_BindingL_Infixed_AnyStatement_0= ruleBindingL_Infixed_AnyStatement
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBinding_AnyStatementAccess().getBindingL_Infixed_AnyStatementParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleBindingL_Infixed_AnyStatement_in_ruleBinding_AnyStatement3008);
            this_BindingL_Infixed_AnyStatement_0=ruleBindingL_Infixed_AnyStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_BindingL_Infixed_AnyStatement_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleBinding_AnyStatement"


    // $ANTLR start "entryRuleBindingL_Infixed_AnyStatement"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1146:1: entryRuleBindingL_Infixed_AnyStatement returns [String current=null] : iv_ruleBindingL_Infixed_AnyStatement= ruleBindingL_Infixed_AnyStatement EOF ;
    public final String entryRuleBindingL_Infixed_AnyStatement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBindingL_Infixed_AnyStatement = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1150:2: (iv_ruleBindingL_Infixed_AnyStatement= ruleBindingL_Infixed_AnyStatement EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1151:2: iv_ruleBindingL_Infixed_AnyStatement= ruleBindingL_Infixed_AnyStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBindingL_Infixed_AnyStatementRule()); 
            }
            pushFollow(FOLLOW_ruleBindingL_Infixed_AnyStatement_in_entryRuleBindingL_Infixed_AnyStatement3063);
            iv_ruleBindingL_Infixed_AnyStatement=ruleBindingL_Infixed_AnyStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBindingL_Infixed_AnyStatement.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBindingL_Infixed_AnyStatement3074); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleBindingL_Infixed_AnyStatement"


    // $ANTLR start "ruleBindingL_Infixed_AnyStatement"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1161:1: ruleBindingL_Infixed_AnyStatement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_AnyStatement_0= ruleAnyStatement | (this_Infixed_1= ruleInfixed kw= 'assign' this_BindingL_Infixed_AnyStatement_3= ruleBindingL_Infixed_AnyStatement ) | (this_Infixed_4= ruleInfixed this_KW_2EQ_5= RULE_KW_2EQ this_BindingL_Infixed_AnyStatement_6= ruleBindingL_Infixed_AnyStatement ) | (this_Infixed_7= ruleInfixed this_KW_MARROW_8= RULE_KW_MARROW this_BindingL_Infixed_AnyStatement_9= ruleBindingL_Infixed_AnyStatement ) | (this_Infixed_10= ruleInfixed this_KW_MAPSTO_11= RULE_KW_MAPSTO this_BindingL_Infixed_AnyStatement_12= ruleBindingL_Infixed_AnyStatement ) | (this_Infixed_13= ruleInfixed this_KW_MAPSTOSTAR_14= RULE_KW_MAPSTOSTAR this_BindingL_Infixed_AnyStatement_15= ruleBindingL_Infixed_AnyStatement ) ) ;
    public final AntlrDatatypeRuleToken ruleBindingL_Infixed_AnyStatement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_KW_2EQ_5=null;
        Token this_KW_MARROW_8=null;
        Token this_KW_MAPSTO_11=null;
        Token this_KW_MAPSTOSTAR_14=null;
        AntlrDatatypeRuleToken this_AnyStatement_0 = null;

        AntlrDatatypeRuleToken this_Infixed_1 = null;

        AntlrDatatypeRuleToken this_BindingL_Infixed_AnyStatement_3 = null;

        AntlrDatatypeRuleToken this_Infixed_4 = null;

        AntlrDatatypeRuleToken this_BindingL_Infixed_AnyStatement_6 = null;

        AntlrDatatypeRuleToken this_Infixed_7 = null;

        AntlrDatatypeRuleToken this_BindingL_Infixed_AnyStatement_9 = null;

        AntlrDatatypeRuleToken this_Infixed_10 = null;

        AntlrDatatypeRuleToken this_BindingL_Infixed_AnyStatement_12 = null;

        AntlrDatatypeRuleToken this_Infixed_13 = null;

        AntlrDatatypeRuleToken this_BindingL_Infixed_AnyStatement_15 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1165:28: ( (this_AnyStatement_0= ruleAnyStatement | (this_Infixed_1= ruleInfixed kw= 'assign' this_BindingL_Infixed_AnyStatement_3= ruleBindingL_Infixed_AnyStatement ) | (this_Infixed_4= ruleInfixed this_KW_2EQ_5= RULE_KW_2EQ this_BindingL_Infixed_AnyStatement_6= ruleBindingL_Infixed_AnyStatement ) | (this_Infixed_7= ruleInfixed this_KW_MARROW_8= RULE_KW_MARROW this_BindingL_Infixed_AnyStatement_9= ruleBindingL_Infixed_AnyStatement ) | (this_Infixed_10= ruleInfixed this_KW_MAPSTO_11= RULE_KW_MAPSTO this_BindingL_Infixed_AnyStatement_12= ruleBindingL_Infixed_AnyStatement ) | (this_Infixed_13= ruleInfixed this_KW_MAPSTOSTAR_14= RULE_KW_MAPSTOSTAR this_BindingL_Infixed_AnyStatement_15= ruleBindingL_Infixed_AnyStatement ) ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1166:1: (this_AnyStatement_0= ruleAnyStatement | (this_Infixed_1= ruleInfixed kw= 'assign' this_BindingL_Infixed_AnyStatement_3= ruleBindingL_Infixed_AnyStatement ) | (this_Infixed_4= ruleInfixed this_KW_2EQ_5= RULE_KW_2EQ this_BindingL_Infixed_AnyStatement_6= ruleBindingL_Infixed_AnyStatement ) | (this_Infixed_7= ruleInfixed this_KW_MARROW_8= RULE_KW_MARROW this_BindingL_Infixed_AnyStatement_9= ruleBindingL_Infixed_AnyStatement ) | (this_Infixed_10= ruleInfixed this_KW_MAPSTO_11= RULE_KW_MAPSTO this_BindingL_Infixed_AnyStatement_12= ruleBindingL_Infixed_AnyStatement ) | (this_Infixed_13= ruleInfixed this_KW_MAPSTOSTAR_14= RULE_KW_MAPSTOSTAR this_BindingL_Infixed_AnyStatement_15= ruleBindingL_Infixed_AnyStatement ) )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1166:1: (this_AnyStatement_0= ruleAnyStatement | (this_Infixed_1= ruleInfixed kw= 'assign' this_BindingL_Infixed_AnyStatement_3= ruleBindingL_Infixed_AnyStatement ) | (this_Infixed_4= ruleInfixed this_KW_2EQ_5= RULE_KW_2EQ this_BindingL_Infixed_AnyStatement_6= ruleBindingL_Infixed_AnyStatement ) | (this_Infixed_7= ruleInfixed this_KW_MARROW_8= RULE_KW_MARROW this_BindingL_Infixed_AnyStatement_9= ruleBindingL_Infixed_AnyStatement ) | (this_Infixed_10= ruleInfixed this_KW_MAPSTO_11= RULE_KW_MAPSTO this_BindingL_Infixed_AnyStatement_12= ruleBindingL_Infixed_AnyStatement ) | (this_Infixed_13= ruleInfixed this_KW_MAPSTOSTAR_14= RULE_KW_MAPSTOSTAR this_BindingL_Infixed_AnyStatement_15= ruleBindingL_Infixed_AnyStatement ) )
            int alt18=6;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1167:5: this_AnyStatement_0= ruleAnyStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBindingL_Infixed_AnyStatementAccess().getAnyStatementParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAnyStatement_in_ruleBindingL_Infixed_AnyStatement3125);
                    this_AnyStatement_0=ruleAnyStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_AnyStatement_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1178:6: (this_Infixed_1= ruleInfixed kw= 'assign' this_BindingL_Infixed_AnyStatement_3= ruleBindingL_Infixed_AnyStatement )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1178:6: (this_Infixed_1= ruleInfixed kw= 'assign' this_BindingL_Infixed_AnyStatement_3= ruleBindingL_Infixed_AnyStatement )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1179:5: this_Infixed_1= ruleInfixed kw= 'assign' this_BindingL_Infixed_AnyStatement_3= ruleBindingL_Infixed_AnyStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBindingL_Infixed_AnyStatementAccess().getInfixedParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInfixed_in_ruleBindingL_Infixed_AnyStatement3159);
                    this_Infixed_1=ruleInfixed();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Infixed_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    kw=(Token)match(input,86,FOLLOW_86_in_ruleBindingL_Infixed_AnyStatement3177); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBindingL_Infixed_AnyStatementAccess().getAssignKeyword_1_1()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBindingL_Infixed_AnyStatementAccess().getBindingL_Infixed_AnyStatementParserRuleCall_1_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBindingL_Infixed_AnyStatement_in_ruleBindingL_Infixed_AnyStatement3199);
                    this_BindingL_Infixed_AnyStatement_3=ruleBindingL_Infixed_AnyStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BindingL_Infixed_AnyStatement_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1207:6: (this_Infixed_4= ruleInfixed this_KW_2EQ_5= RULE_KW_2EQ this_BindingL_Infixed_AnyStatement_6= ruleBindingL_Infixed_AnyStatement )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1207:6: (this_Infixed_4= ruleInfixed this_KW_2EQ_5= RULE_KW_2EQ this_BindingL_Infixed_AnyStatement_6= ruleBindingL_Infixed_AnyStatement )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1208:5: this_Infixed_4= ruleInfixed this_KW_2EQ_5= RULE_KW_2EQ this_BindingL_Infixed_AnyStatement_6= ruleBindingL_Infixed_AnyStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBindingL_Infixed_AnyStatementAccess().getInfixedParserRuleCall_2_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInfixed_in_ruleBindingL_Infixed_AnyStatement3234);
                    this_Infixed_4=ruleInfixed();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Infixed_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    this_KW_2EQ_5=(Token)match(input,RULE_KW_2EQ,FOLLOW_RULE_KW_2EQ_in_ruleBindingL_Infixed_AnyStatement3254); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_KW_2EQ_5);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_2EQ_5, grammarAccess.getBindingL_Infixed_AnyStatementAccess().getKW_2EQTerminalRuleCall_2_1()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBindingL_Infixed_AnyStatementAccess().getBindingL_Infixed_AnyStatementParserRuleCall_2_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBindingL_Infixed_AnyStatement_in_ruleBindingL_Infixed_AnyStatement3281);
                    this_BindingL_Infixed_AnyStatement_6=ruleBindingL_Infixed_AnyStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BindingL_Infixed_AnyStatement_6);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1237:6: (this_Infixed_7= ruleInfixed this_KW_MARROW_8= RULE_KW_MARROW this_BindingL_Infixed_AnyStatement_9= ruleBindingL_Infixed_AnyStatement )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1237:6: (this_Infixed_7= ruleInfixed this_KW_MARROW_8= RULE_KW_MARROW this_BindingL_Infixed_AnyStatement_9= ruleBindingL_Infixed_AnyStatement )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1238:5: this_Infixed_7= ruleInfixed this_KW_MARROW_8= RULE_KW_MARROW this_BindingL_Infixed_AnyStatement_9= ruleBindingL_Infixed_AnyStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBindingL_Infixed_AnyStatementAccess().getInfixedParserRuleCall_3_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInfixed_in_ruleBindingL_Infixed_AnyStatement3316);
                    this_Infixed_7=ruleInfixed();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Infixed_7);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    this_KW_MARROW_8=(Token)match(input,RULE_KW_MARROW,FOLLOW_RULE_KW_MARROW_in_ruleBindingL_Infixed_AnyStatement3336); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_KW_MARROW_8);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_MARROW_8, grammarAccess.getBindingL_Infixed_AnyStatementAccess().getKW_MARROWTerminalRuleCall_3_1()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBindingL_Infixed_AnyStatementAccess().getBindingL_Infixed_AnyStatementParserRuleCall_3_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBindingL_Infixed_AnyStatement_in_ruleBindingL_Infixed_AnyStatement3363);
                    this_BindingL_Infixed_AnyStatement_9=ruleBindingL_Infixed_AnyStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BindingL_Infixed_AnyStatement_9);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1267:6: (this_Infixed_10= ruleInfixed this_KW_MAPSTO_11= RULE_KW_MAPSTO this_BindingL_Infixed_AnyStatement_12= ruleBindingL_Infixed_AnyStatement )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1267:6: (this_Infixed_10= ruleInfixed this_KW_MAPSTO_11= RULE_KW_MAPSTO this_BindingL_Infixed_AnyStatement_12= ruleBindingL_Infixed_AnyStatement )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1268:5: this_Infixed_10= ruleInfixed this_KW_MAPSTO_11= RULE_KW_MAPSTO this_BindingL_Infixed_AnyStatement_12= ruleBindingL_Infixed_AnyStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBindingL_Infixed_AnyStatementAccess().getInfixedParserRuleCall_4_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInfixed_in_ruleBindingL_Infixed_AnyStatement3398);
                    this_Infixed_10=ruleInfixed();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Infixed_10);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    this_KW_MAPSTO_11=(Token)match(input,RULE_KW_MAPSTO,FOLLOW_RULE_KW_MAPSTO_in_ruleBindingL_Infixed_AnyStatement3418); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_KW_MAPSTO_11);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_MAPSTO_11, grammarAccess.getBindingL_Infixed_AnyStatementAccess().getKW_MAPSTOTerminalRuleCall_4_1()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBindingL_Infixed_AnyStatementAccess().getBindingL_Infixed_AnyStatementParserRuleCall_4_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBindingL_Infixed_AnyStatement_in_ruleBindingL_Infixed_AnyStatement3445);
                    this_BindingL_Infixed_AnyStatement_12=ruleBindingL_Infixed_AnyStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BindingL_Infixed_AnyStatement_12);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1297:6: (this_Infixed_13= ruleInfixed this_KW_MAPSTOSTAR_14= RULE_KW_MAPSTOSTAR this_BindingL_Infixed_AnyStatement_15= ruleBindingL_Infixed_AnyStatement )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1297:6: (this_Infixed_13= ruleInfixed this_KW_MAPSTOSTAR_14= RULE_KW_MAPSTOSTAR this_BindingL_Infixed_AnyStatement_15= ruleBindingL_Infixed_AnyStatement )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1298:5: this_Infixed_13= ruleInfixed this_KW_MAPSTOSTAR_14= RULE_KW_MAPSTOSTAR this_BindingL_Infixed_AnyStatement_15= ruleBindingL_Infixed_AnyStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBindingL_Infixed_AnyStatementAccess().getInfixedParserRuleCall_5_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInfixed_in_ruleBindingL_Infixed_AnyStatement3480);
                    this_Infixed_13=ruleInfixed();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Infixed_13);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    this_KW_MAPSTOSTAR_14=(Token)match(input,RULE_KW_MAPSTOSTAR,FOLLOW_RULE_KW_MAPSTOSTAR_in_ruleBindingL_Infixed_AnyStatement3500); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_KW_MAPSTOSTAR_14);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_MAPSTOSTAR_14, grammarAccess.getBindingL_Infixed_AnyStatementAccess().getKW_MAPSTOSTARTerminalRuleCall_5_1()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBindingL_Infixed_AnyStatementAccess().getBindingL_Infixed_AnyStatementParserRuleCall_5_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBindingL_Infixed_AnyStatement_in_ruleBindingL_Infixed_AnyStatement3527);
                    this_BindingL_Infixed_AnyStatement_15=ruleBindingL_Infixed_AnyStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BindingL_Infixed_AnyStatement_15);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleBindingL_Infixed_AnyStatement"


    // $ANTLR start "entryRuleBindingR_InfixedExprsDecl_AnyStatement"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1337:1: entryRuleBindingR_InfixedExprsDecl_AnyStatement returns [String current=null] : iv_ruleBindingR_InfixedExprsDecl_AnyStatement= ruleBindingR_InfixedExprsDecl_AnyStatement EOF ;
    public final String entryRuleBindingR_InfixedExprsDecl_AnyStatement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBindingR_InfixedExprsDecl_AnyStatement = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1341:2: (iv_ruleBindingR_InfixedExprsDecl_AnyStatement= ruleBindingR_InfixedExprsDecl_AnyStatement EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1342:2: iv_ruleBindingR_InfixedExprsDecl_AnyStatement= ruleBindingR_InfixedExprsDecl_AnyStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBindingR_InfixedExprsDecl_AnyStatementRule()); 
            }
            pushFollow(FOLLOW_ruleBindingR_InfixedExprsDecl_AnyStatement_in_entryRuleBindingR_InfixedExprsDecl_AnyStatement3584);
            iv_ruleBindingR_InfixedExprsDecl_AnyStatement=ruleBindingR_InfixedExprsDecl_AnyStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBindingR_InfixedExprsDecl_AnyStatement.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBindingR_InfixedExprsDecl_AnyStatement3595); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleBindingR_InfixedExprsDecl_AnyStatement"


    // $ANTLR start "ruleBindingR_InfixedExprsDecl_AnyStatement"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1352:1: ruleBindingR_InfixedExprsDecl_AnyStatement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_InfixedExprsDecl_0= ruleInfixedExprsDecl | (this_InfixedExprsDecl_1= ruleInfixedExprsDecl kw= 'assign' this_Binding_AnyStatement_3= ruleBinding_AnyStatement ) | (this_InfixedExprsDecl_4= ruleInfixedExprsDecl this_KW_2EQ_5= RULE_KW_2EQ this_Binding_AnyStatement_6= ruleBinding_AnyStatement ) | (this_InfixedExprsDecl_7= ruleInfixedExprsDecl this_KW_MARROW_8= RULE_KW_MARROW this_Binding_AnyStatement_9= ruleBinding_AnyStatement ) | (this_InfixedExprsDecl_10= ruleInfixedExprsDecl this_KW_MAPSTO_11= RULE_KW_MAPSTO this_Binding_AnyStatement_12= ruleBinding_AnyStatement ) | (this_InfixedExprsDecl_13= ruleInfixedExprsDecl this_KW_MAPSTOSTAR_14= RULE_KW_MAPSTOSTAR this_Binding_AnyStatement_15= ruleBinding_AnyStatement ) ) ;
    public final AntlrDatatypeRuleToken ruleBindingR_InfixedExprsDecl_AnyStatement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_KW_2EQ_5=null;
        Token this_KW_MARROW_8=null;
        Token this_KW_MAPSTO_11=null;
        Token this_KW_MAPSTOSTAR_14=null;
        AntlrDatatypeRuleToken this_InfixedExprsDecl_0 = null;

        AntlrDatatypeRuleToken this_InfixedExprsDecl_1 = null;

        AntlrDatatypeRuleToken this_Binding_AnyStatement_3 = null;

        AntlrDatatypeRuleToken this_InfixedExprsDecl_4 = null;

        AntlrDatatypeRuleToken this_Binding_AnyStatement_6 = null;

        AntlrDatatypeRuleToken this_InfixedExprsDecl_7 = null;

        AntlrDatatypeRuleToken this_Binding_AnyStatement_9 = null;

        AntlrDatatypeRuleToken this_InfixedExprsDecl_10 = null;

        AntlrDatatypeRuleToken this_Binding_AnyStatement_12 = null;

        AntlrDatatypeRuleToken this_InfixedExprsDecl_13 = null;

        AntlrDatatypeRuleToken this_Binding_AnyStatement_15 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1356:28: ( (this_InfixedExprsDecl_0= ruleInfixedExprsDecl | (this_InfixedExprsDecl_1= ruleInfixedExprsDecl kw= 'assign' this_Binding_AnyStatement_3= ruleBinding_AnyStatement ) | (this_InfixedExprsDecl_4= ruleInfixedExprsDecl this_KW_2EQ_5= RULE_KW_2EQ this_Binding_AnyStatement_6= ruleBinding_AnyStatement ) | (this_InfixedExprsDecl_7= ruleInfixedExprsDecl this_KW_MARROW_8= RULE_KW_MARROW this_Binding_AnyStatement_9= ruleBinding_AnyStatement ) | (this_InfixedExprsDecl_10= ruleInfixedExprsDecl this_KW_MAPSTO_11= RULE_KW_MAPSTO this_Binding_AnyStatement_12= ruleBinding_AnyStatement ) | (this_InfixedExprsDecl_13= ruleInfixedExprsDecl this_KW_MAPSTOSTAR_14= RULE_KW_MAPSTOSTAR this_Binding_AnyStatement_15= ruleBinding_AnyStatement ) ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1357:1: (this_InfixedExprsDecl_0= ruleInfixedExprsDecl | (this_InfixedExprsDecl_1= ruleInfixedExprsDecl kw= 'assign' this_Binding_AnyStatement_3= ruleBinding_AnyStatement ) | (this_InfixedExprsDecl_4= ruleInfixedExprsDecl this_KW_2EQ_5= RULE_KW_2EQ this_Binding_AnyStatement_6= ruleBinding_AnyStatement ) | (this_InfixedExprsDecl_7= ruleInfixedExprsDecl this_KW_MARROW_8= RULE_KW_MARROW this_Binding_AnyStatement_9= ruleBinding_AnyStatement ) | (this_InfixedExprsDecl_10= ruleInfixedExprsDecl this_KW_MAPSTO_11= RULE_KW_MAPSTO this_Binding_AnyStatement_12= ruleBinding_AnyStatement ) | (this_InfixedExprsDecl_13= ruleInfixedExprsDecl this_KW_MAPSTOSTAR_14= RULE_KW_MAPSTOSTAR this_Binding_AnyStatement_15= ruleBinding_AnyStatement ) )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1357:1: (this_InfixedExprsDecl_0= ruleInfixedExprsDecl | (this_InfixedExprsDecl_1= ruleInfixedExprsDecl kw= 'assign' this_Binding_AnyStatement_3= ruleBinding_AnyStatement ) | (this_InfixedExprsDecl_4= ruleInfixedExprsDecl this_KW_2EQ_5= RULE_KW_2EQ this_Binding_AnyStatement_6= ruleBinding_AnyStatement ) | (this_InfixedExprsDecl_7= ruleInfixedExprsDecl this_KW_MARROW_8= RULE_KW_MARROW this_Binding_AnyStatement_9= ruleBinding_AnyStatement ) | (this_InfixedExprsDecl_10= ruleInfixedExprsDecl this_KW_MAPSTO_11= RULE_KW_MAPSTO this_Binding_AnyStatement_12= ruleBinding_AnyStatement ) | (this_InfixedExprsDecl_13= ruleInfixedExprsDecl this_KW_MAPSTOSTAR_14= RULE_KW_MAPSTOSTAR this_Binding_AnyStatement_15= ruleBinding_AnyStatement ) )
            int alt19=6;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1358:5: this_InfixedExprsDecl_0= ruleInfixedExprsDecl
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBindingR_InfixedExprsDecl_AnyStatementAccess().getInfixedExprsDeclParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInfixedExprsDecl_in_ruleBindingR_InfixedExprsDecl_AnyStatement3646);
                    this_InfixedExprsDecl_0=ruleInfixedExprsDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_InfixedExprsDecl_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1369:6: (this_InfixedExprsDecl_1= ruleInfixedExprsDecl kw= 'assign' this_Binding_AnyStatement_3= ruleBinding_AnyStatement )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1369:6: (this_InfixedExprsDecl_1= ruleInfixedExprsDecl kw= 'assign' this_Binding_AnyStatement_3= ruleBinding_AnyStatement )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1370:5: this_InfixedExprsDecl_1= ruleInfixedExprsDecl kw= 'assign' this_Binding_AnyStatement_3= ruleBinding_AnyStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBindingR_InfixedExprsDecl_AnyStatementAccess().getInfixedExprsDeclParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInfixedExprsDecl_in_ruleBindingR_InfixedExprsDecl_AnyStatement3680);
                    this_InfixedExprsDecl_1=ruleInfixedExprsDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_InfixedExprsDecl_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    kw=(Token)match(input,86,FOLLOW_86_in_ruleBindingR_InfixedExprsDecl_AnyStatement3698); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBindingR_InfixedExprsDecl_AnyStatementAccess().getAssignKeyword_1_1()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBindingR_InfixedExprsDecl_AnyStatementAccess().getBinding_AnyStatementParserRuleCall_1_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBinding_AnyStatement_in_ruleBindingR_InfixedExprsDecl_AnyStatement3720);
                    this_Binding_AnyStatement_3=ruleBinding_AnyStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Binding_AnyStatement_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1398:6: (this_InfixedExprsDecl_4= ruleInfixedExprsDecl this_KW_2EQ_5= RULE_KW_2EQ this_Binding_AnyStatement_6= ruleBinding_AnyStatement )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1398:6: (this_InfixedExprsDecl_4= ruleInfixedExprsDecl this_KW_2EQ_5= RULE_KW_2EQ this_Binding_AnyStatement_6= ruleBinding_AnyStatement )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1399:5: this_InfixedExprsDecl_4= ruleInfixedExprsDecl this_KW_2EQ_5= RULE_KW_2EQ this_Binding_AnyStatement_6= ruleBinding_AnyStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBindingR_InfixedExprsDecl_AnyStatementAccess().getInfixedExprsDeclParserRuleCall_2_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInfixedExprsDecl_in_ruleBindingR_InfixedExprsDecl_AnyStatement3755);
                    this_InfixedExprsDecl_4=ruleInfixedExprsDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_InfixedExprsDecl_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    this_KW_2EQ_5=(Token)match(input,RULE_KW_2EQ,FOLLOW_RULE_KW_2EQ_in_ruleBindingR_InfixedExprsDecl_AnyStatement3775); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_KW_2EQ_5);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_2EQ_5, grammarAccess.getBindingR_InfixedExprsDecl_AnyStatementAccess().getKW_2EQTerminalRuleCall_2_1()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBindingR_InfixedExprsDecl_AnyStatementAccess().getBinding_AnyStatementParserRuleCall_2_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBinding_AnyStatement_in_ruleBindingR_InfixedExprsDecl_AnyStatement3802);
                    this_Binding_AnyStatement_6=ruleBinding_AnyStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Binding_AnyStatement_6);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1428:6: (this_InfixedExprsDecl_7= ruleInfixedExprsDecl this_KW_MARROW_8= RULE_KW_MARROW this_Binding_AnyStatement_9= ruleBinding_AnyStatement )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1428:6: (this_InfixedExprsDecl_7= ruleInfixedExprsDecl this_KW_MARROW_8= RULE_KW_MARROW this_Binding_AnyStatement_9= ruleBinding_AnyStatement )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1429:5: this_InfixedExprsDecl_7= ruleInfixedExprsDecl this_KW_MARROW_8= RULE_KW_MARROW this_Binding_AnyStatement_9= ruleBinding_AnyStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBindingR_InfixedExprsDecl_AnyStatementAccess().getInfixedExprsDeclParserRuleCall_3_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInfixedExprsDecl_in_ruleBindingR_InfixedExprsDecl_AnyStatement3837);
                    this_InfixedExprsDecl_7=ruleInfixedExprsDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_InfixedExprsDecl_7);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    this_KW_MARROW_8=(Token)match(input,RULE_KW_MARROW,FOLLOW_RULE_KW_MARROW_in_ruleBindingR_InfixedExprsDecl_AnyStatement3857); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_KW_MARROW_8);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_MARROW_8, grammarAccess.getBindingR_InfixedExprsDecl_AnyStatementAccess().getKW_MARROWTerminalRuleCall_3_1()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBindingR_InfixedExprsDecl_AnyStatementAccess().getBinding_AnyStatementParserRuleCall_3_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBinding_AnyStatement_in_ruleBindingR_InfixedExprsDecl_AnyStatement3884);
                    this_Binding_AnyStatement_9=ruleBinding_AnyStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Binding_AnyStatement_9);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1458:6: (this_InfixedExprsDecl_10= ruleInfixedExprsDecl this_KW_MAPSTO_11= RULE_KW_MAPSTO this_Binding_AnyStatement_12= ruleBinding_AnyStatement )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1458:6: (this_InfixedExprsDecl_10= ruleInfixedExprsDecl this_KW_MAPSTO_11= RULE_KW_MAPSTO this_Binding_AnyStatement_12= ruleBinding_AnyStatement )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1459:5: this_InfixedExprsDecl_10= ruleInfixedExprsDecl this_KW_MAPSTO_11= RULE_KW_MAPSTO this_Binding_AnyStatement_12= ruleBinding_AnyStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBindingR_InfixedExprsDecl_AnyStatementAccess().getInfixedExprsDeclParserRuleCall_4_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInfixedExprsDecl_in_ruleBindingR_InfixedExprsDecl_AnyStatement3919);
                    this_InfixedExprsDecl_10=ruleInfixedExprsDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_InfixedExprsDecl_10);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    this_KW_MAPSTO_11=(Token)match(input,RULE_KW_MAPSTO,FOLLOW_RULE_KW_MAPSTO_in_ruleBindingR_InfixedExprsDecl_AnyStatement3939); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_KW_MAPSTO_11);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_MAPSTO_11, grammarAccess.getBindingR_InfixedExprsDecl_AnyStatementAccess().getKW_MAPSTOTerminalRuleCall_4_1()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBindingR_InfixedExprsDecl_AnyStatementAccess().getBinding_AnyStatementParserRuleCall_4_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBinding_AnyStatement_in_ruleBindingR_InfixedExprsDecl_AnyStatement3966);
                    this_Binding_AnyStatement_12=ruleBinding_AnyStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Binding_AnyStatement_12);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1488:6: (this_InfixedExprsDecl_13= ruleInfixedExprsDecl this_KW_MAPSTOSTAR_14= RULE_KW_MAPSTOSTAR this_Binding_AnyStatement_15= ruleBinding_AnyStatement )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1488:6: (this_InfixedExprsDecl_13= ruleInfixedExprsDecl this_KW_MAPSTOSTAR_14= RULE_KW_MAPSTOSTAR this_Binding_AnyStatement_15= ruleBinding_AnyStatement )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1489:5: this_InfixedExprsDecl_13= ruleInfixedExprsDecl this_KW_MAPSTOSTAR_14= RULE_KW_MAPSTOSTAR this_Binding_AnyStatement_15= ruleBinding_AnyStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBindingR_InfixedExprsDecl_AnyStatementAccess().getInfixedExprsDeclParserRuleCall_5_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInfixedExprsDecl_in_ruleBindingR_InfixedExprsDecl_AnyStatement4001);
                    this_InfixedExprsDecl_13=ruleInfixedExprsDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_InfixedExprsDecl_13);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    this_KW_MAPSTOSTAR_14=(Token)match(input,RULE_KW_MAPSTOSTAR,FOLLOW_RULE_KW_MAPSTOSTAR_in_ruleBindingR_InfixedExprsDecl_AnyStatement4021); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_KW_MAPSTOSTAR_14);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_MAPSTOSTAR_14, grammarAccess.getBindingR_InfixedExprsDecl_AnyStatementAccess().getKW_MAPSTOSTARTerminalRuleCall_5_1()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBindingR_InfixedExprsDecl_AnyStatementAccess().getBinding_AnyStatementParserRuleCall_5_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBinding_AnyStatement_in_ruleBindingR_InfixedExprsDecl_AnyStatement4048);
                    this_Binding_AnyStatement_15=ruleBinding_AnyStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Binding_AnyStatement_15);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleBindingR_InfixedExprsDecl_AnyStatement"


    // $ANTLR start "entryRuleAnyStatement"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1528:1: entryRuleAnyStatement returns [String current=null] : iv_ruleAnyStatement= ruleAnyStatement EOF ;
    public final String entryRuleAnyStatement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAnyStatement = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1532:2: (iv_ruleAnyStatement= ruleAnyStatement EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1533:2: iv_ruleAnyStatement= ruleAnyStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnyStatementRule()); 
            }
            pushFollow(FOLLOW_ruleAnyStatement_in_entryRuleAnyStatement4105);
            iv_ruleAnyStatement=ruleAnyStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnyStatement.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnyStatement4116); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleAnyStatement"


    // $ANTLR start "ruleAnyStatement"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1543:1: ruleAnyStatement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'temp19' ;
    public final AntlrDatatypeRuleToken ruleAnyStatement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1547:28: (kw= 'temp19' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1549:2: kw= 'temp19'
            {
            kw=(Token)match(input,87,FOLLOW_87_in_ruleAnyStatement4157); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getAnyStatementAccess().getTemp19Keyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleAnyStatement"


    // $ANTLR start "entryRuleInfixed"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1569:1: entryRuleInfixed returns [String current=null] : iv_ruleInfixed= ruleInfixed EOF ;
    public final String entryRuleInfixed() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInfixed = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1573:2: (iv_ruleInfixed= ruleInfixed EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1574:2: iv_ruleInfixed= ruleInfixed EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInfixedRule()); 
            }
            pushFollow(FOLLOW_ruleInfixed_in_entryRuleInfixed4211);
            iv_ruleInfixed=ruleInfixed();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInfixed.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInfixed4222); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleInfixed"


    // $ANTLR start "ruleInfixed"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1584:1: ruleInfixed returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_InfixedExpr_0= ruleInfixedExpr (this_DeclPart_1= ruleDeclPart )* ) | this_Block_2= ruleBlock ) ;
    public final AntlrDatatypeRuleToken ruleInfixed() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_InfixedExpr_0 = null;

        AntlrDatatypeRuleToken this_DeclPart_1 = null;

        AntlrDatatypeRuleToken this_Block_2 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1588:28: ( ( (this_InfixedExpr_0= ruleInfixedExpr (this_DeclPart_1= ruleDeclPart )* ) | this_Block_2= ruleBlock ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1589:1: ( (this_InfixedExpr_0= ruleInfixedExpr (this_DeclPart_1= ruleDeclPart )* ) | this_Block_2= ruleBlock )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1589:1: ( (this_InfixedExpr_0= ruleInfixedExpr (this_DeclPart_1= ruleDeclPart )* ) | this_Block_2= ruleBlock )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==88) ) {
                alt21=1;
            }
            else if ( (LA21_0==99) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1589:2: (this_InfixedExpr_0= ruleInfixedExpr (this_DeclPart_1= ruleDeclPart )* )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1589:2: (this_InfixedExpr_0= ruleInfixedExpr (this_DeclPart_1= ruleDeclPart )* )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1590:5: this_InfixedExpr_0= ruleInfixedExpr (this_DeclPart_1= ruleDeclPart )*
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInfixedAccess().getInfixedExprParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInfixedExpr_in_ruleInfixed4274);
                    this_InfixedExpr_0=ruleInfixedExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_InfixedExpr_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1600:1: (this_DeclPart_1= ruleDeclPart )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( ((LA20_0>=RULE_KW_COLON && LA20_0<=RULE_KW_COLONSTAR)) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1601:5: this_DeclPart_1= ruleDeclPart
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getInfixedAccess().getDeclPartParserRuleCall_0_1()); 
                    	          
                    	    }
                    	    pushFollow(FOLLOW_ruleDeclPart_in_ruleInfixed4302);
                    	    this_DeclPart_1=ruleDeclPart();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		current.merge(this_DeclPart_1);
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              afterParserOrEnumRuleCall();
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1613:5: this_Block_2= ruleBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInfixedAccess().getBlockParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBlock_in_ruleInfixed4338);
                    this_Block_2=ruleBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Block_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleInfixed"


    // $ANTLR start "entryRuleInfixedExpr"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1634:1: entryRuleInfixedExpr returns [String current=null] : iv_ruleInfixedExpr= ruleInfixedExpr EOF ;
    public final String entryRuleInfixedExpr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInfixedExpr = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1638:2: (iv_ruleInfixedExpr= ruleInfixedExpr EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1639:2: iv_ruleInfixedExpr= ruleInfixedExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInfixedExprRule()); 
            }
            pushFollow(FOLLOW_ruleInfixedExpr_in_entryRuleInfixedExpr4394);
            iv_ruleInfixedExpr=ruleInfixedExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInfixedExpr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInfixedExpr4405); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleInfixedExpr"


    // $ANTLR start "ruleInfixedExpr"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1649:1: ruleInfixedExpr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'temp32' ;
    public final AntlrDatatypeRuleToken ruleInfixedExpr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1653:28: (kw= 'temp32' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1655:2: kw= 'temp32'
            {
            kw=(Token)match(input,88,FOLLOW_88_in_ruleInfixedExpr4446); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getInfixedExprAccess().getTemp32Keyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleInfixedExpr"


    // $ANTLR start "entryRuleType"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1671:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1675:2: (iv_ruleType= ruleType EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1676:2: iv_ruleType= ruleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_ruleType_in_entryRuleType4496);
            iv_ruleType=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleType4507); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1686:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'temp41' ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1690:28: (kw= 'temp41' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1692:2: kw= 'temp41'
            {
            kw=(Token)match(input,89,FOLLOW_89_in_ruleType4548); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getTypeAccess().getTemp41Keyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleOpQualTail"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1708:1: entryRuleOpQualTail returns [EObject current=null] : iv_ruleOpQualTail= ruleOpQualTail EOF ;
    public final EObject entryRuleOpQualTail() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpQualTail = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1712:2: (iv_ruleOpQualTail= ruleOpQualTail EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1713:2: iv_ruleOpQualTail= ruleOpQualTail EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpQualTailRule()); 
            }
            pushFollow(FOLLOW_ruleOpQualTail_in_entryRuleOpQualTail4597);
            iv_ruleOpQualTail=ruleOpQualTail();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpQualTail; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpQualTail4607); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleOpQualTail"


    // $ANTLR start "ruleOpQualTail"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1723:1: ruleOpQualTail returns [EObject current=null] : ( ( (lv_name_0_0= ruleMolecule ) ) | ( ( ( ( ( ruleMolecule ) ) RULE_KW_DOLLAR ruleOpQualTail ) )=> ( ( (lv_name_1_0= ruleMolecule ) ) this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail ) ) ) ;
    public final EObject ruleOpQualTail() throws RecognitionException {
        EObject current = null;

        Token this_KW_DOLLAR_2=null;
        EObject lv_name_0_0 = null;

        EObject lv_name_1_0 = null;

        EObject this_OpQualTail_3 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1727:28: ( ( ( (lv_name_0_0= ruleMolecule ) ) | ( ( ( ( ( ruleMolecule ) ) RULE_KW_DOLLAR ruleOpQualTail ) )=> ( ( (lv_name_1_0= ruleMolecule ) ) this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail ) ) ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1728:1: ( ( (lv_name_0_0= ruleMolecule ) ) | ( ( ( ( ( ruleMolecule ) ) RULE_KW_DOLLAR ruleOpQualTail ) )=> ( ( (lv_name_1_0= ruleMolecule ) ) this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail ) ) )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1728:1: ( ( (lv_name_0_0= ruleMolecule ) ) | ( ( ( ( ( ruleMolecule ) ) RULE_KW_DOLLAR ruleOpQualTail ) )=> ( ( (lv_name_1_0= ruleMolecule ) ) this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail ) ) )
            int alt22=2;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1728:2: ( (lv_name_0_0= ruleMolecule ) )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1728:2: ( (lv_name_0_0= ruleMolecule ) )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1729:1: (lv_name_0_0= ruleMolecule )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1729:1: (lv_name_0_0= ruleMolecule )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1730:3: lv_name_0_0= ruleMolecule
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOpQualTailAccess().getNameMoleculeParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleMolecule_in_ruleOpQualTail4657);
                    lv_name_0_0=ruleMolecule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getOpQualTailRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_0_0, 
                              		"Molecule");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1747:6: ( ( ( ( ( ruleMolecule ) ) RULE_KW_DOLLAR ruleOpQualTail ) )=> ( ( (lv_name_1_0= ruleMolecule ) ) this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail ) )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1747:6: ( ( ( ( ( ruleMolecule ) ) RULE_KW_DOLLAR ruleOpQualTail ) )=> ( ( (lv_name_1_0= ruleMolecule ) ) this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail ) )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1747:7: ( ( ( ( ruleMolecule ) ) RULE_KW_DOLLAR ruleOpQualTail ) )=> ( ( (lv_name_1_0= ruleMolecule ) ) this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1751:36: ( ( (lv_name_1_0= ruleMolecule ) ) this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1751:37: ( (lv_name_1_0= ruleMolecule ) ) this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1751:37: ( (lv_name_1_0= ruleMolecule ) )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1752:1: (lv_name_1_0= ruleMolecule )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1752:1: (lv_name_1_0= ruleMolecule )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1753:3: lv_name_1_0= ruleMolecule
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOpQualTailAccess().getNameMoleculeParserRuleCall_1_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleMolecule_in_ruleOpQualTail4704);
                    lv_name_1_0=ruleMolecule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getOpQualTailRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_1_0, 
                              		"Molecule");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_KW_DOLLAR_2=(Token)match(input,RULE_KW_DOLLAR,FOLLOW_RULE_KW_DOLLAR_in_ruleOpQualTail4715); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_DOLLAR_2, grammarAccess.getOpQualTailAccess().getKW_DOLLARTerminalRuleCall_1_0_1()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOpQualTailAccess().getOpQualTailParserRuleCall_1_0_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOpQualTail_in_ruleOpQualTail4736);
                    this_OpQualTail_3=ruleOpQualTail();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_OpQualTail_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleOpQualTail"


    // $ANTLR start "entryRuleNakedOp"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1799:1: entryRuleNakedOp returns [EObject current=null] : iv_ruleNakedOp= ruleNakedOp EOF ;
    public final EObject entryRuleNakedOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNakedOp = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1803:2: (iv_ruleNakedOp= ruleNakedOp EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1804:2: iv_ruleNakedOp= ruleNakedOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNakedOpRule()); 
            }
            pushFollow(FOLLOW_ruleNakedOp_in_entryRuleNakedOp4789);
            iv_ruleNakedOp=ruleNakedOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNakedOp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNakedOp4799); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleNakedOp"


    // $ANTLR start "ruleNakedOp"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1814:1: ruleNakedOp returns [EObject current=null] : (this_UnqualOp_ArrowTok_0= ruleUnqualOp_ArrowTok | this_UnqualOp_LatticeTok_1= ruleUnqualOp_LatticeTok | this_UnqualOp_RelationTok_2= ruleUnqualOp_RelationTok | this_UnqualOp_SegTok_3= ruleUnqualOp_SegTok | this_UnqualOp_PlusTok_4= ruleUnqualOp_PlusTok | this_UnqualOp_QuotientTok_5= ruleUnqualOp_QuotientTok | this_UnqualOp_TimesTok_6= ruleUnqualOp_TimesTok | this_UnqualOp_PowerTok_7= ruleUnqualOp_PowerTok ) ;
    public final EObject ruleNakedOp() throws RecognitionException {
        EObject current = null;

        EObject this_UnqualOp_ArrowTok_0 = null;

        EObject this_UnqualOp_LatticeTok_1 = null;

        EObject this_UnqualOp_RelationTok_2 = null;

        EObject this_UnqualOp_SegTok_3 = null;

        EObject this_UnqualOp_PlusTok_4 = null;

        EObject this_UnqualOp_QuotientTok_5 = null;

        EObject this_UnqualOp_TimesTok_6 = null;

        EObject this_UnqualOp_PowerTok_7 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1818:28: ( (this_UnqualOp_ArrowTok_0= ruleUnqualOp_ArrowTok | this_UnqualOp_LatticeTok_1= ruleUnqualOp_LatticeTok | this_UnqualOp_RelationTok_2= ruleUnqualOp_RelationTok | this_UnqualOp_SegTok_3= ruleUnqualOp_SegTok | this_UnqualOp_PlusTok_4= ruleUnqualOp_PlusTok | this_UnqualOp_QuotientTok_5= ruleUnqualOp_QuotientTok | this_UnqualOp_TimesTok_6= ruleUnqualOp_TimesTok | this_UnqualOp_PowerTok_7= ruleUnqualOp_PowerTok ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1819:1: (this_UnqualOp_ArrowTok_0= ruleUnqualOp_ArrowTok | this_UnqualOp_LatticeTok_1= ruleUnqualOp_LatticeTok | this_UnqualOp_RelationTok_2= ruleUnqualOp_RelationTok | this_UnqualOp_SegTok_3= ruleUnqualOp_SegTok | this_UnqualOp_PlusTok_4= ruleUnqualOp_PlusTok | this_UnqualOp_QuotientTok_5= ruleUnqualOp_QuotientTok | this_UnqualOp_TimesTok_6= ruleUnqualOp_TimesTok | this_UnqualOp_PowerTok_7= ruleUnqualOp_PowerTok )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1819:1: (this_UnqualOp_ArrowTok_0= ruleUnqualOp_ArrowTok | this_UnqualOp_LatticeTok_1= ruleUnqualOp_LatticeTok | this_UnqualOp_RelationTok_2= ruleUnqualOp_RelationTok | this_UnqualOp_SegTok_3= ruleUnqualOp_SegTok | this_UnqualOp_PlusTok_4= ruleUnqualOp_PlusTok | this_UnqualOp_QuotientTok_5= ruleUnqualOp_QuotientTok | this_UnqualOp_TimesTok_6= ruleUnqualOp_TimesTok | this_UnqualOp_PowerTok_7= ruleUnqualOp_PowerTok )
            int alt23=8;
            switch ( input.LA(1) ) {
            case RULE_KW_RARROW:
            case RULE_KW_LARROW:
            case RULE_KW_MAPSTAR:
                {
                alt23=1;
                }
                break;
            case RULE_KW_VEE:
            case RULE_KW_WEDGE:
                {
                alt23=2;
                }
                break;
            case RULE_KW_EQ:
            case RULE_KW_TILDEE:
            case RULE_KW_HATE:
            case RULE_KW_GE:
            case RULE_KW_GT:
            case RULE_KW_2GT:
            case RULE_KW_LE:
            case RULE_KW_LT:
            case RULE_KW_2LT:
            case 90:
            case 91:
            case 92:
                {
                alt23=3;
                }
                break;
            case RULE_KW_2DOT:
            case 93:
                {
                alt23=4;
                }
                break;
            case RULE_KW_PLUS:
            case RULE_KW_MINUS:
            case RULE_KW_PLUSMINUS:
                {
                alt23=5;
                }
                break;
            case 94:
            case 95:
            case 96:
            case 97:
                {
                alt23=6;
                }
                break;
            case RULE_KW_STAR:
            case RULE_KW_SLASH:
            case RULE_KW_BACKSLASH:
                {
                alt23=7;
                }
                break;
            case RULE_KW_2STAR:
            case RULE_KW_HAT:
                {
                alt23=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1820:5: this_UnqualOp_ArrowTok_0= ruleUnqualOp_ArrowTok
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNakedOpAccess().getUnqualOp_ArrowTokParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnqualOp_ArrowTok_in_ruleNakedOp4850);
                    this_UnqualOp_ArrowTok_0=ruleUnqualOp_ArrowTok();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_UnqualOp_ArrowTok_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1830:5: this_UnqualOp_LatticeTok_1= ruleUnqualOp_LatticeTok
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNakedOpAccess().getUnqualOp_LatticeTokParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnqualOp_LatticeTok_in_ruleNakedOp4877);
                    this_UnqualOp_LatticeTok_1=ruleUnqualOp_LatticeTok();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_UnqualOp_LatticeTok_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1840:5: this_UnqualOp_RelationTok_2= ruleUnqualOp_RelationTok
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNakedOpAccess().getUnqualOp_RelationTokParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnqualOp_RelationTok_in_ruleNakedOp4904);
                    this_UnqualOp_RelationTok_2=ruleUnqualOp_RelationTok();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_UnqualOp_RelationTok_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1850:5: this_UnqualOp_SegTok_3= ruleUnqualOp_SegTok
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNakedOpAccess().getUnqualOp_SegTokParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnqualOp_SegTok_in_ruleNakedOp4931);
                    this_UnqualOp_SegTok_3=ruleUnqualOp_SegTok();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_UnqualOp_SegTok_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1860:5: this_UnqualOp_PlusTok_4= ruleUnqualOp_PlusTok
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNakedOpAccess().getUnqualOp_PlusTokParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnqualOp_PlusTok_in_ruleNakedOp4958);
                    this_UnqualOp_PlusTok_4=ruleUnqualOp_PlusTok();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_UnqualOp_PlusTok_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1870:5: this_UnqualOp_QuotientTok_5= ruleUnqualOp_QuotientTok
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNakedOpAccess().getUnqualOp_QuotientTokParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnqualOp_QuotientTok_in_ruleNakedOp4985);
                    this_UnqualOp_QuotientTok_5=ruleUnqualOp_QuotientTok();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_UnqualOp_QuotientTok_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1880:5: this_UnqualOp_TimesTok_6= ruleUnqualOp_TimesTok
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNakedOpAccess().getUnqualOp_TimesTokParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnqualOp_TimesTok_in_ruleNakedOp5012);
                    this_UnqualOp_TimesTok_6=ruleUnqualOp_TimesTok();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_UnqualOp_TimesTok_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1890:5: this_UnqualOp_PowerTok_7= ruleUnqualOp_PowerTok
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNakedOpAccess().getUnqualOp_PowerTokParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnqualOp_PowerTok_in_ruleNakedOp5039);
                    this_UnqualOp_PowerTok_7=ruleUnqualOp_PowerTok();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_UnqualOp_PowerTok_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleNakedOp"


    // $ANTLR start "entryRuleArrowOp"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1909:1: entryRuleArrowOp returns [EObject current=null] : iv_ruleArrowOp= ruleArrowOp EOF ;
    public final EObject entryRuleArrowOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrowOp = null;


        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1910:2: (iv_ruleArrowOp= ruleArrowOp EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1911:2: iv_ruleArrowOp= ruleArrowOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrowOpRule()); 
            }
            pushFollow(FOLLOW_ruleArrowOp_in_entryRuleArrowOp5078);
            iv_ruleArrowOp=ruleArrowOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrowOp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrowOp5088); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArrowOp"


    // $ANTLR start "ruleArrowOp"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1918:1: ruleArrowOp returns [EObject current=null] : this_QualOp_ArrowTok_0= ruleQualOp_ArrowTok ;
    public final EObject ruleArrowOp() throws RecognitionException {
        EObject current = null;

        EObject this_QualOp_ArrowTok_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1921:28: (this_QualOp_ArrowTok_0= ruleQualOp_ArrowTok )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1923:5: this_QualOp_ArrowTok_0= ruleQualOp_ArrowTok
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getArrowOpAccess().getQualOp_ArrowTokParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleQualOp_ArrowTok_in_ruleArrowOp5134);
            this_QualOp_ArrowTok_0=ruleQualOp_ArrowTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_QualOp_ArrowTok_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArrowOp"


    // $ANTLR start "entryRuleLatticeOp"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1939:1: entryRuleLatticeOp returns [EObject current=null] : iv_ruleLatticeOp= ruleLatticeOp EOF ;
    public final EObject entryRuleLatticeOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLatticeOp = null;


        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1940:2: (iv_ruleLatticeOp= ruleLatticeOp EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1941:2: iv_ruleLatticeOp= ruleLatticeOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLatticeOpRule()); 
            }
            pushFollow(FOLLOW_ruleLatticeOp_in_entryRuleLatticeOp5168);
            iv_ruleLatticeOp=ruleLatticeOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLatticeOp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLatticeOp5178); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLatticeOp"


    // $ANTLR start "ruleLatticeOp"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1948:1: ruleLatticeOp returns [EObject current=null] : this_QualOp_LatticeTok_0= ruleQualOp_LatticeTok ;
    public final EObject ruleLatticeOp() throws RecognitionException {
        EObject current = null;

        EObject this_QualOp_LatticeTok_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1951:28: (this_QualOp_LatticeTok_0= ruleQualOp_LatticeTok )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1953:5: this_QualOp_LatticeTok_0= ruleQualOp_LatticeTok
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLatticeOpAccess().getQualOp_LatticeTokParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleQualOp_LatticeTok_in_ruleLatticeOp5224);
            this_QualOp_LatticeTok_0=ruleQualOp_LatticeTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_QualOp_LatticeTok_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLatticeOp"


    // $ANTLR start "entryRuleRelationOp"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1969:1: entryRuleRelationOp returns [EObject current=null] : iv_ruleRelationOp= ruleRelationOp EOF ;
    public final EObject entryRuleRelationOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationOp = null;


        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1970:2: (iv_ruleRelationOp= ruleRelationOp EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1971:2: iv_ruleRelationOp= ruleRelationOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationOpRule()); 
            }
            pushFollow(FOLLOW_ruleRelationOp_in_entryRuleRelationOp5258);
            iv_ruleRelationOp=ruleRelationOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationOp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationOp5268); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelationOp"


    // $ANTLR start "ruleRelationOp"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1978:1: ruleRelationOp returns [EObject current=null] : this_QualOp_RelationTok_0= ruleQualOp_RelationTok ;
    public final EObject ruleRelationOp() throws RecognitionException {
        EObject current = null;

        EObject this_QualOp_RelationTok_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1981:28: (this_QualOp_RelationTok_0= ruleQualOp_RelationTok )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1983:5: this_QualOp_RelationTok_0= ruleQualOp_RelationTok
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getRelationOpAccess().getQualOp_RelationTokParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleQualOp_RelationTok_in_ruleRelationOp5314);
            this_QualOp_RelationTok_0=ruleQualOp_RelationTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_QualOp_RelationTok_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationOp"


    // $ANTLR start "entryRuleSegOp"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1999:1: entryRuleSegOp returns [EObject current=null] : iv_ruleSegOp= ruleSegOp EOF ;
    public final EObject entryRuleSegOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSegOp = null;


        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2000:2: (iv_ruleSegOp= ruleSegOp EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2001:2: iv_ruleSegOp= ruleSegOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSegOpRule()); 
            }
            pushFollow(FOLLOW_ruleSegOp_in_entryRuleSegOp5348);
            iv_ruleSegOp=ruleSegOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSegOp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSegOp5358); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSegOp"


    // $ANTLR start "ruleSegOp"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2008:1: ruleSegOp returns [EObject current=null] : this_QualOp_SegTok_0= ruleQualOp_SegTok ;
    public final EObject ruleSegOp() throws RecognitionException {
        EObject current = null;

        EObject this_QualOp_SegTok_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2011:28: (this_QualOp_SegTok_0= ruleQualOp_SegTok )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2013:5: this_QualOp_SegTok_0= ruleQualOp_SegTok
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSegOpAccess().getQualOp_SegTokParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleQualOp_SegTok_in_ruleSegOp5404);
            this_QualOp_SegTok_0=ruleQualOp_SegTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_QualOp_SegTok_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSegOp"


    // $ANTLR start "entryRulePlusOp"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2029:1: entryRulePlusOp returns [EObject current=null] : iv_rulePlusOp= rulePlusOp EOF ;
    public final EObject entryRulePlusOp() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusOp = null;


        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2030:2: (iv_rulePlusOp= rulePlusOp EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2031:2: iv_rulePlusOp= rulePlusOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPlusOpRule()); 
            }
            pushFollow(FOLLOW_rulePlusOp_in_entryRulePlusOp5438);
            iv_rulePlusOp=rulePlusOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePlusOp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePlusOp5448); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlusOp"


    // $ANTLR start "rulePlusOp"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2038:1: rulePlusOp returns [EObject current=null] : this_QualOp_PlusTok_0= ruleQualOp_PlusTok ;
    public final EObject rulePlusOp() throws RecognitionException {
        EObject current = null;

        EObject this_QualOp_PlusTok_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2041:28: (this_QualOp_PlusTok_0= ruleQualOp_PlusTok )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2043:5: this_QualOp_PlusTok_0= ruleQualOp_PlusTok
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getPlusOpAccess().getQualOp_PlusTokParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleQualOp_PlusTok_in_rulePlusOp5494);
            this_QualOp_PlusTok_0=ruleQualOp_PlusTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_QualOp_PlusTok_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlusOp"


    // $ANTLR start "entryRuleQuotientOp"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2059:1: entryRuleQuotientOp returns [EObject current=null] : iv_ruleQuotientOp= ruleQuotientOp EOF ;
    public final EObject entryRuleQuotientOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuotientOp = null;


        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2060:2: (iv_ruleQuotientOp= ruleQuotientOp EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2061:2: iv_ruleQuotientOp= ruleQuotientOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQuotientOpRule()); 
            }
            pushFollow(FOLLOW_ruleQuotientOp_in_entryRuleQuotientOp5528);
            iv_ruleQuotientOp=ruleQuotientOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQuotientOp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuotientOp5538); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuotientOp"


    // $ANTLR start "ruleQuotientOp"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2068:1: ruleQuotientOp returns [EObject current=null] : this_QualOp_QuotientTok_0= ruleQualOp_QuotientTok ;
    public final EObject ruleQuotientOp() throws RecognitionException {
        EObject current = null;

        EObject this_QualOp_QuotientTok_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2071:28: (this_QualOp_QuotientTok_0= ruleQualOp_QuotientTok )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2073:5: this_QualOp_QuotientTok_0= ruleQualOp_QuotientTok
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQuotientOpAccess().getQualOp_QuotientTokParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleQualOp_QuotientTok_in_ruleQuotientOp5584);
            this_QualOp_QuotientTok_0=ruleQualOp_QuotientTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_QualOp_QuotientTok_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuotientOp"


    // $ANTLR start "entryRuleTimesOp"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2089:1: entryRuleTimesOp returns [EObject current=null] : iv_ruleTimesOp= ruleTimesOp EOF ;
    public final EObject entryRuleTimesOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimesOp = null;


        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2090:2: (iv_ruleTimesOp= ruleTimesOp EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2091:2: iv_ruleTimesOp= ruleTimesOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTimesOpRule()); 
            }
            pushFollow(FOLLOW_ruleTimesOp_in_entryRuleTimesOp5618);
            iv_ruleTimesOp=ruleTimesOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTimesOp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimesOp5628); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTimesOp"


    // $ANTLR start "ruleTimesOp"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2098:1: ruleTimesOp returns [EObject current=null] : this_QualOp_TimesTok_0= ruleQualOp_TimesTok ;
    public final EObject ruleTimesOp() throws RecognitionException {
        EObject current = null;

        EObject this_QualOp_TimesTok_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2101:28: (this_QualOp_TimesTok_0= ruleQualOp_TimesTok )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2103:5: this_QualOp_TimesTok_0= ruleQualOp_TimesTok
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getTimesOpAccess().getQualOp_TimesTokParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleQualOp_TimesTok_in_ruleTimesOp5674);
            this_QualOp_TimesTok_0=ruleQualOp_TimesTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_QualOp_TimesTok_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTimesOp"


    // $ANTLR start "entryRulePowerOp"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2119:1: entryRulePowerOp returns [EObject current=null] : iv_rulePowerOp= rulePowerOp EOF ;
    public final EObject entryRulePowerOp() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePowerOp = null;


        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2120:2: (iv_rulePowerOp= rulePowerOp EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2121:2: iv_rulePowerOp= rulePowerOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPowerOpRule()); 
            }
            pushFollow(FOLLOW_rulePowerOp_in_entryRulePowerOp5708);
            iv_rulePowerOp=rulePowerOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePowerOp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePowerOp5718); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePowerOp"


    // $ANTLR start "rulePowerOp"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2128:1: rulePowerOp returns [EObject current=null] : this_QualOp_PowerTok_0= ruleQualOp_PowerTok ;
    public final EObject rulePowerOp() throws RecognitionException {
        EObject current = null;

        EObject this_QualOp_PowerTok_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2131:28: (this_QualOp_PowerTok_0= ruleQualOp_PowerTok )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2133:5: this_QualOp_PowerTok_0= ruleQualOp_PowerTok
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getPowerOpAccess().getQualOp_PowerTokParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleQualOp_PowerTok_in_rulePowerOp5764);
            this_QualOp_PowerTok_0=ruleQualOp_PowerTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_QualOp_PowerTok_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePowerOp"


    // $ANTLR start "entryRuleArrowTok"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2149:1: entryRuleArrowTok returns [String current=null] : iv_ruleArrowTok= ruleArrowTok EOF ;
    public final String entryRuleArrowTok() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArrowTok = null;


        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2150:2: (iv_ruleArrowTok= ruleArrowTok EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2151:2: iv_ruleArrowTok= ruleArrowTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrowTokRule()); 
            }
            pushFollow(FOLLOW_ruleArrowTok_in_entryRuleArrowTok5799);
            iv_ruleArrowTok=ruleArrowTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrowTok.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrowTok5810); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArrowTok"


    // $ANTLR start "ruleArrowTok"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2158:1: ruleArrowTok returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_KW_RARROW_0= RULE_KW_RARROW | this_KW_LARROW_1= RULE_KW_LARROW | this_KW_MAPSTAR_2= RULE_KW_MAPSTAR ) ;
    public final AntlrDatatypeRuleToken ruleArrowTok() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_KW_RARROW_0=null;
        Token this_KW_LARROW_1=null;
        Token this_KW_MAPSTAR_2=null;

         enterRule(); 
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2161:28: ( (this_KW_RARROW_0= RULE_KW_RARROW | this_KW_LARROW_1= RULE_KW_LARROW | this_KW_MAPSTAR_2= RULE_KW_MAPSTAR ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2162:1: (this_KW_RARROW_0= RULE_KW_RARROW | this_KW_LARROW_1= RULE_KW_LARROW | this_KW_MAPSTAR_2= RULE_KW_MAPSTAR )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2162:1: (this_KW_RARROW_0= RULE_KW_RARROW | this_KW_LARROW_1= RULE_KW_LARROW | this_KW_MAPSTAR_2= RULE_KW_MAPSTAR )
            int alt24=3;
            switch ( input.LA(1) ) {
            case RULE_KW_RARROW:
                {
                alt24=1;
                }
                break;
            case RULE_KW_LARROW:
                {
                alt24=2;
                }
                break;
            case RULE_KW_MAPSTAR:
                {
                alt24=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2162:6: this_KW_RARROW_0= RULE_KW_RARROW
                    {
                    this_KW_RARROW_0=(Token)match(input,RULE_KW_RARROW,FOLLOW_RULE_KW_RARROW_in_ruleArrowTok5850); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_KW_RARROW_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_RARROW_0, grammarAccess.getArrowTokAccess().getKW_RARROWTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2170:10: this_KW_LARROW_1= RULE_KW_LARROW
                    {
                    this_KW_LARROW_1=(Token)match(input,RULE_KW_LARROW,FOLLOW_RULE_KW_LARROW_in_ruleArrowTok5876); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_KW_LARROW_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_LARROW_1, grammarAccess.getArrowTokAccess().getKW_LARROWTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2178:10: this_KW_MAPSTAR_2= RULE_KW_MAPSTAR
                    {
                    this_KW_MAPSTAR_2=(Token)match(input,RULE_KW_MAPSTAR,FOLLOW_RULE_KW_MAPSTAR_in_ruleArrowTok5902); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_KW_MAPSTAR_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_MAPSTAR_2, grammarAccess.getArrowTokAccess().getKW_MAPSTARTerminalRuleCall_2()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArrowTok"


    // $ANTLR start "entryRuleLatticeTok"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2193:1: entryRuleLatticeTok returns [String current=null] : iv_ruleLatticeTok= ruleLatticeTok EOF ;
    public final String entryRuleLatticeTok() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLatticeTok = null;


        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2194:2: (iv_ruleLatticeTok= ruleLatticeTok EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2195:2: iv_ruleLatticeTok= ruleLatticeTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLatticeTokRule()); 
            }
            pushFollow(FOLLOW_ruleLatticeTok_in_entryRuleLatticeTok5948);
            iv_ruleLatticeTok=ruleLatticeTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLatticeTok.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLatticeTok5959); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLatticeTok"


    // $ANTLR start "ruleLatticeTok"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2202:1: ruleLatticeTok returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_KW_VEE_0= RULE_KW_VEE | this_KW_WEDGE_1= RULE_KW_WEDGE ) ;
    public final AntlrDatatypeRuleToken ruleLatticeTok() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_KW_VEE_0=null;
        Token this_KW_WEDGE_1=null;

         enterRule(); 
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2205:28: ( (this_KW_VEE_0= RULE_KW_VEE | this_KW_WEDGE_1= RULE_KW_WEDGE ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2206:1: (this_KW_VEE_0= RULE_KW_VEE | this_KW_WEDGE_1= RULE_KW_WEDGE )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2206:1: (this_KW_VEE_0= RULE_KW_VEE | this_KW_WEDGE_1= RULE_KW_WEDGE )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_KW_VEE) ) {
                alt25=1;
            }
            else if ( (LA25_0==RULE_KW_WEDGE) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2206:6: this_KW_VEE_0= RULE_KW_VEE
                    {
                    this_KW_VEE_0=(Token)match(input,RULE_KW_VEE,FOLLOW_RULE_KW_VEE_in_ruleLatticeTok5999); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_KW_VEE_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_VEE_0, grammarAccess.getLatticeTokAccess().getKW_VEETerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2214:10: this_KW_WEDGE_1= RULE_KW_WEDGE
                    {
                    this_KW_WEDGE_1=(Token)match(input,RULE_KW_WEDGE,FOLLOW_RULE_KW_WEDGE_in_ruleLatticeTok6025); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_KW_WEDGE_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_WEDGE_1, grammarAccess.getLatticeTokAccess().getKW_WEDGETerminalRuleCall_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLatticeTok"


    // $ANTLR start "entryRuleRelationTok"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2229:1: entryRuleRelationTok returns [String current=null] : iv_ruleRelationTok= ruleRelationTok EOF ;
    public final String entryRuleRelationTok() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRelationTok = null;


        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2230:2: (iv_ruleRelationTok= ruleRelationTok EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2231:2: iv_ruleRelationTok= ruleRelationTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationTokRule()); 
            }
            pushFollow(FOLLOW_ruleRelationTok_in_entryRuleRelationTok6071);
            iv_ruleRelationTok=ruleRelationTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationTok.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationTok6082); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelationTok"


    // $ANTLR start "ruleRelationTok"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2238:1: ruleRelationTok returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_KW_EQ_0= RULE_KW_EQ | this_KW_TILDEE_1= RULE_KW_TILDEE | this_KW_HATE_2= RULE_KW_HATE | this_KW_GE_3= RULE_KW_GE | this_KW_GT_4= RULE_KW_GT | this_KW_2GT_5= RULE_KW_2GT | this_KW_LE_6= RULE_KW_LE | this_KW_LT_7= RULE_KW_LT | this_KW_2LT_8= RULE_KW_2LT | kw= 'is' | kw= 'isnt' | kw= 'case' ) ;
    public final AntlrDatatypeRuleToken ruleRelationTok() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_KW_EQ_0=null;
        Token this_KW_TILDEE_1=null;
        Token this_KW_HATE_2=null;
        Token this_KW_GE_3=null;
        Token this_KW_GT_4=null;
        Token this_KW_2GT_5=null;
        Token this_KW_LE_6=null;
        Token this_KW_LT_7=null;
        Token this_KW_2LT_8=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2241:28: ( (this_KW_EQ_0= RULE_KW_EQ | this_KW_TILDEE_1= RULE_KW_TILDEE | this_KW_HATE_2= RULE_KW_HATE | this_KW_GE_3= RULE_KW_GE | this_KW_GT_4= RULE_KW_GT | this_KW_2GT_5= RULE_KW_2GT | this_KW_LE_6= RULE_KW_LE | this_KW_LT_7= RULE_KW_LT | this_KW_2LT_8= RULE_KW_2LT | kw= 'is' | kw= 'isnt' | kw= 'case' ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2242:1: (this_KW_EQ_0= RULE_KW_EQ | this_KW_TILDEE_1= RULE_KW_TILDEE | this_KW_HATE_2= RULE_KW_HATE | this_KW_GE_3= RULE_KW_GE | this_KW_GT_4= RULE_KW_GT | this_KW_2GT_5= RULE_KW_2GT | this_KW_LE_6= RULE_KW_LE | this_KW_LT_7= RULE_KW_LT | this_KW_2LT_8= RULE_KW_2LT | kw= 'is' | kw= 'isnt' | kw= 'case' )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2242:1: (this_KW_EQ_0= RULE_KW_EQ | this_KW_TILDEE_1= RULE_KW_TILDEE | this_KW_HATE_2= RULE_KW_HATE | this_KW_GE_3= RULE_KW_GE | this_KW_GT_4= RULE_KW_GT | this_KW_2GT_5= RULE_KW_2GT | this_KW_LE_6= RULE_KW_LE | this_KW_LT_7= RULE_KW_LT | this_KW_2LT_8= RULE_KW_2LT | kw= 'is' | kw= 'isnt' | kw= 'case' )
            int alt26=12;
            switch ( input.LA(1) ) {
            case RULE_KW_EQ:
                {
                alt26=1;
                }
                break;
            case RULE_KW_TILDEE:
                {
                alt26=2;
                }
                break;
            case RULE_KW_HATE:
                {
                alt26=3;
                }
                break;
            case RULE_KW_GE:
                {
                alt26=4;
                }
                break;
            case RULE_KW_GT:
                {
                alt26=5;
                }
                break;
            case RULE_KW_2GT:
                {
                alt26=6;
                }
                break;
            case RULE_KW_LE:
                {
                alt26=7;
                }
                break;
            case RULE_KW_LT:
                {
                alt26=8;
                }
                break;
            case RULE_KW_2LT:
                {
                alt26=9;
                }
                break;
            case 90:
                {
                alt26=10;
                }
                break;
            case 91:
                {
                alt26=11;
                }
                break;
            case 92:
                {
                alt26=12;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2242:6: this_KW_EQ_0= RULE_KW_EQ
                    {
                    this_KW_EQ_0=(Token)match(input,RULE_KW_EQ,FOLLOW_RULE_KW_EQ_in_ruleRelationTok6122); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_KW_EQ_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_EQ_0, grammarAccess.getRelationTokAccess().getKW_EQTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2250:10: this_KW_TILDEE_1= RULE_KW_TILDEE
                    {
                    this_KW_TILDEE_1=(Token)match(input,RULE_KW_TILDEE,FOLLOW_RULE_KW_TILDEE_in_ruleRelationTok6148); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_KW_TILDEE_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_TILDEE_1, grammarAccess.getRelationTokAccess().getKW_TILDEETerminalRuleCall_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2258:10: this_KW_HATE_2= RULE_KW_HATE
                    {
                    this_KW_HATE_2=(Token)match(input,RULE_KW_HATE,FOLLOW_RULE_KW_HATE_in_ruleRelationTok6174); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_KW_HATE_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_HATE_2, grammarAccess.getRelationTokAccess().getKW_HATETerminalRuleCall_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2266:10: this_KW_GE_3= RULE_KW_GE
                    {
                    this_KW_GE_3=(Token)match(input,RULE_KW_GE,FOLLOW_RULE_KW_GE_in_ruleRelationTok6200); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_KW_GE_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_GE_3, grammarAccess.getRelationTokAccess().getKW_GETerminalRuleCall_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2274:10: this_KW_GT_4= RULE_KW_GT
                    {
                    this_KW_GT_4=(Token)match(input,RULE_KW_GT,FOLLOW_RULE_KW_GT_in_ruleRelationTok6226); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_KW_GT_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_GT_4, grammarAccess.getRelationTokAccess().getKW_GTTerminalRuleCall_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2282:10: this_KW_2GT_5= RULE_KW_2GT
                    {
                    this_KW_2GT_5=(Token)match(input,RULE_KW_2GT,FOLLOW_RULE_KW_2GT_in_ruleRelationTok6252); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_KW_2GT_5);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_2GT_5, grammarAccess.getRelationTokAccess().getKW_2GTTerminalRuleCall_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2290:10: this_KW_LE_6= RULE_KW_LE
                    {
                    this_KW_LE_6=(Token)match(input,RULE_KW_LE,FOLLOW_RULE_KW_LE_in_ruleRelationTok6278); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_KW_LE_6);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_LE_6, grammarAccess.getRelationTokAccess().getKW_LETerminalRuleCall_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2298:10: this_KW_LT_7= RULE_KW_LT
                    {
                    this_KW_LT_7=(Token)match(input,RULE_KW_LT,FOLLOW_RULE_KW_LT_in_ruleRelationTok6304); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_KW_LT_7);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_LT_7, grammarAccess.getRelationTokAccess().getKW_LTTerminalRuleCall_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2306:10: this_KW_2LT_8= RULE_KW_2LT
                    {
                    this_KW_2LT_8=(Token)match(input,RULE_KW_2LT,FOLLOW_RULE_KW_2LT_in_ruleRelationTok6330); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_KW_2LT_8);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_2LT_8, grammarAccess.getRelationTokAccess().getKW_2LTTerminalRuleCall_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2315:2: kw= 'is'
                    {
                    kw=(Token)match(input,90,FOLLOW_90_in_ruleRelationTok6354); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRelationTokAccess().getIsKeyword_9()); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2322:2: kw= 'isnt'
                    {
                    kw=(Token)match(input,91,FOLLOW_91_in_ruleRelationTok6373); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRelationTokAccess().getIsntKeyword_10()); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2329:2: kw= 'case'
                    {
                    kw=(Token)match(input,92,FOLLOW_92_in_ruleRelationTok6392); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRelationTokAccess().getCaseKeyword_11()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationTok"


    // $ANTLR start "entryRuleSegTok"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2342:1: entryRuleSegTok returns [String current=null] : iv_ruleSegTok= ruleSegTok EOF ;
    public final String entryRuleSegTok() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSegTok = null;


        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2343:2: (iv_ruleSegTok= ruleSegTok EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2344:2: iv_ruleSegTok= ruleSegTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSegTokRule()); 
            }
            pushFollow(FOLLOW_ruleSegTok_in_entryRuleSegTok6433);
            iv_ruleSegTok=ruleSegTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSegTok.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSegTok6444); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSegTok"


    // $ANTLR start "ruleSegTok"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2351:1: ruleSegTok returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_KW_2DOT_0= RULE_KW_2DOT | kw= 'by' ) ;
    public final AntlrDatatypeRuleToken ruleSegTok() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_KW_2DOT_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2354:28: ( (this_KW_2DOT_0= RULE_KW_2DOT | kw= 'by' ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2355:1: (this_KW_2DOT_0= RULE_KW_2DOT | kw= 'by' )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2355:1: (this_KW_2DOT_0= RULE_KW_2DOT | kw= 'by' )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_KW_2DOT) ) {
                alt27=1;
            }
            else if ( (LA27_0==93) ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2355:6: this_KW_2DOT_0= RULE_KW_2DOT
                    {
                    this_KW_2DOT_0=(Token)match(input,RULE_KW_2DOT,FOLLOW_RULE_KW_2DOT_in_ruleSegTok6484); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_KW_2DOT_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_2DOT_0, grammarAccess.getSegTokAccess().getKW_2DOTTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2364:2: kw= 'by'
                    {
                    kw=(Token)match(input,93,FOLLOW_93_in_ruleSegTok6508); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSegTokAccess().getByKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSegTok"


    // $ANTLR start "entryRulePlusTok"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2377:1: entryRulePlusTok returns [String current=null] : iv_rulePlusTok= rulePlusTok EOF ;
    public final String entryRulePlusTok() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePlusTok = null;


        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2378:2: (iv_rulePlusTok= rulePlusTok EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2379:2: iv_rulePlusTok= rulePlusTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPlusTokRule()); 
            }
            pushFollow(FOLLOW_rulePlusTok_in_entryRulePlusTok6549);
            iv_rulePlusTok=rulePlusTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePlusTok.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePlusTok6560); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlusTok"


    // $ANTLR start "rulePlusTok"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2386:1: rulePlusTok returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_KW_PLUS_0= RULE_KW_PLUS | this_KW_MINUS_1= RULE_KW_MINUS | this_KW_PLUSMINUS_2= RULE_KW_PLUSMINUS ) ;
    public final AntlrDatatypeRuleToken rulePlusTok() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_KW_PLUS_0=null;
        Token this_KW_MINUS_1=null;
        Token this_KW_PLUSMINUS_2=null;

         enterRule(); 
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2389:28: ( (this_KW_PLUS_0= RULE_KW_PLUS | this_KW_MINUS_1= RULE_KW_MINUS | this_KW_PLUSMINUS_2= RULE_KW_PLUSMINUS ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2390:1: (this_KW_PLUS_0= RULE_KW_PLUS | this_KW_MINUS_1= RULE_KW_MINUS | this_KW_PLUSMINUS_2= RULE_KW_PLUSMINUS )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2390:1: (this_KW_PLUS_0= RULE_KW_PLUS | this_KW_MINUS_1= RULE_KW_MINUS | this_KW_PLUSMINUS_2= RULE_KW_PLUSMINUS )
            int alt28=3;
            switch ( input.LA(1) ) {
            case RULE_KW_PLUS:
                {
                alt28=1;
                }
                break;
            case RULE_KW_MINUS:
                {
                alt28=2;
                }
                break;
            case RULE_KW_PLUSMINUS:
                {
                alt28=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2390:6: this_KW_PLUS_0= RULE_KW_PLUS
                    {
                    this_KW_PLUS_0=(Token)match(input,RULE_KW_PLUS,FOLLOW_RULE_KW_PLUS_in_rulePlusTok6600); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_KW_PLUS_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_PLUS_0, grammarAccess.getPlusTokAccess().getKW_PLUSTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2398:10: this_KW_MINUS_1= RULE_KW_MINUS
                    {
                    this_KW_MINUS_1=(Token)match(input,RULE_KW_MINUS,FOLLOW_RULE_KW_MINUS_in_rulePlusTok6626); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_KW_MINUS_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_MINUS_1, grammarAccess.getPlusTokAccess().getKW_MINUSTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2406:10: this_KW_PLUSMINUS_2= RULE_KW_PLUSMINUS
                    {
                    this_KW_PLUSMINUS_2=(Token)match(input,RULE_KW_PLUSMINUS,FOLLOW_RULE_KW_PLUSMINUS_in_rulePlusTok6652); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_KW_PLUSMINUS_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_PLUSMINUS_2, grammarAccess.getPlusTokAccess().getKW_PLUSMINUSTerminalRuleCall_2()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlusTok"


    // $ANTLR start "entryRuleQuotientTok"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2421:1: entryRuleQuotientTok returns [String current=null] : iv_ruleQuotientTok= ruleQuotientTok EOF ;
    public final String entryRuleQuotientTok() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQuotientTok = null;


        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2422:2: (iv_ruleQuotientTok= ruleQuotientTok EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2423:2: iv_ruleQuotientTok= ruleQuotientTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQuotientTokRule()); 
            }
            pushFollow(FOLLOW_ruleQuotientTok_in_entryRuleQuotientTok6698);
            iv_ruleQuotientTok=ruleQuotientTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQuotientTok.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuotientTok6709); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuotientTok"


    // $ANTLR start "ruleQuotientTok"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2430:1: ruleQuotientTok returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'mod' | kw= 'quo' | kw= 'rem' | kw= 'exquo' ) ;
    public final AntlrDatatypeRuleToken ruleQuotientTok() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2433:28: ( (kw= 'mod' | kw= 'quo' | kw= 'rem' | kw= 'exquo' ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2434:1: (kw= 'mod' | kw= 'quo' | kw= 'rem' | kw= 'exquo' )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2434:1: (kw= 'mod' | kw= 'quo' | kw= 'rem' | kw= 'exquo' )
            int alt29=4;
            switch ( input.LA(1) ) {
            case 94:
                {
                alt29=1;
                }
                break;
            case 95:
                {
                alt29=2;
                }
                break;
            case 96:
                {
                alt29=3;
                }
                break;
            case 97:
                {
                alt29=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2435:2: kw= 'mod'
                    {
                    kw=(Token)match(input,94,FOLLOW_94_in_ruleQuotientTok6747); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQuotientTokAccess().getModKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2442:2: kw= 'quo'
                    {
                    kw=(Token)match(input,95,FOLLOW_95_in_ruleQuotientTok6766); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQuotientTokAccess().getQuoKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2449:2: kw= 'rem'
                    {
                    kw=(Token)match(input,96,FOLLOW_96_in_ruleQuotientTok6785); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQuotientTokAccess().getRemKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2456:2: kw= 'exquo'
                    {
                    kw=(Token)match(input,97,FOLLOW_97_in_ruleQuotientTok6804); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQuotientTokAccess().getExquoKeyword_3()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuotientTok"


    // $ANTLR start "entryRuleTimesTok"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2469:1: entryRuleTimesTok returns [String current=null] : iv_ruleTimesTok= ruleTimesTok EOF ;
    public final String entryRuleTimesTok() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTimesTok = null;


        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2470:2: (iv_ruleTimesTok= ruleTimesTok EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2471:2: iv_ruleTimesTok= ruleTimesTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTimesTokRule()); 
            }
            pushFollow(FOLLOW_ruleTimesTok_in_entryRuleTimesTok6845);
            iv_ruleTimesTok=ruleTimesTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTimesTok.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimesTok6856); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTimesTok"


    // $ANTLR start "ruleTimesTok"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2478:1: ruleTimesTok returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_KW_STAR_0= RULE_KW_STAR | this_KW_SLASH_1= RULE_KW_SLASH | this_KW_BACKSLASH_2= RULE_KW_BACKSLASH ) ;
    public final AntlrDatatypeRuleToken ruleTimesTok() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_KW_STAR_0=null;
        Token this_KW_SLASH_1=null;
        Token this_KW_BACKSLASH_2=null;

         enterRule(); 
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2481:28: ( (this_KW_STAR_0= RULE_KW_STAR | this_KW_SLASH_1= RULE_KW_SLASH | this_KW_BACKSLASH_2= RULE_KW_BACKSLASH ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2482:1: (this_KW_STAR_0= RULE_KW_STAR | this_KW_SLASH_1= RULE_KW_SLASH | this_KW_BACKSLASH_2= RULE_KW_BACKSLASH )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2482:1: (this_KW_STAR_0= RULE_KW_STAR | this_KW_SLASH_1= RULE_KW_SLASH | this_KW_BACKSLASH_2= RULE_KW_BACKSLASH )
            int alt30=3;
            switch ( input.LA(1) ) {
            case RULE_KW_STAR:
                {
                alt30=1;
                }
                break;
            case RULE_KW_SLASH:
                {
                alt30=2;
                }
                break;
            case RULE_KW_BACKSLASH:
                {
                alt30=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2482:6: this_KW_STAR_0= RULE_KW_STAR
                    {
                    this_KW_STAR_0=(Token)match(input,RULE_KW_STAR,FOLLOW_RULE_KW_STAR_in_ruleTimesTok6896); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_KW_STAR_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_STAR_0, grammarAccess.getTimesTokAccess().getKW_STARTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2490:10: this_KW_SLASH_1= RULE_KW_SLASH
                    {
                    this_KW_SLASH_1=(Token)match(input,RULE_KW_SLASH,FOLLOW_RULE_KW_SLASH_in_ruleTimesTok6922); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_KW_SLASH_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_SLASH_1, grammarAccess.getTimesTokAccess().getKW_SLASHTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2498:10: this_KW_BACKSLASH_2= RULE_KW_BACKSLASH
                    {
                    this_KW_BACKSLASH_2=(Token)match(input,RULE_KW_BACKSLASH,FOLLOW_RULE_KW_BACKSLASH_in_ruleTimesTok6948); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_KW_BACKSLASH_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_BACKSLASH_2, grammarAccess.getTimesTokAccess().getKW_BACKSLASHTerminalRuleCall_2()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTimesTok"


    // $ANTLR start "entryRulePowerTok"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2513:1: entryRulePowerTok returns [String current=null] : iv_rulePowerTok= rulePowerTok EOF ;
    public final String entryRulePowerTok() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePowerTok = null;


        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2514:2: (iv_rulePowerTok= rulePowerTok EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2515:2: iv_rulePowerTok= rulePowerTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPowerTokRule()); 
            }
            pushFollow(FOLLOW_rulePowerTok_in_entryRulePowerTok6994);
            iv_rulePowerTok=rulePowerTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePowerTok.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePowerTok7005); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePowerTok"


    // $ANTLR start "rulePowerTok"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2522:1: rulePowerTok returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_KW_2STAR_0= RULE_KW_2STAR | this_KW_HAT_1= RULE_KW_HAT ) ;
    public final AntlrDatatypeRuleToken rulePowerTok() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_KW_2STAR_0=null;
        Token this_KW_HAT_1=null;

         enterRule(); 
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2525:28: ( (this_KW_2STAR_0= RULE_KW_2STAR | this_KW_HAT_1= RULE_KW_HAT ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2526:1: (this_KW_2STAR_0= RULE_KW_2STAR | this_KW_HAT_1= RULE_KW_HAT )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2526:1: (this_KW_2STAR_0= RULE_KW_2STAR | this_KW_HAT_1= RULE_KW_HAT )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_KW_2STAR) ) {
                alt31=1;
            }
            else if ( (LA31_0==RULE_KW_HAT) ) {
                alt31=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2526:6: this_KW_2STAR_0= RULE_KW_2STAR
                    {
                    this_KW_2STAR_0=(Token)match(input,RULE_KW_2STAR,FOLLOW_RULE_KW_2STAR_in_rulePowerTok7045); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_KW_2STAR_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_2STAR_0, grammarAccess.getPowerTokAccess().getKW_2STARTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2534:10: this_KW_HAT_1= RULE_KW_HAT
                    {
                    this_KW_HAT_1=(Token)match(input,RULE_KW_HAT,FOLLOW_RULE_KW_HAT_in_rulePowerTok7071); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_KW_HAT_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_HAT_1, grammarAccess.getPowerTokAccess().getKW_HATTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePowerTok"


    // $ANTLR start "entryRuleApplication"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2549:1: entryRuleApplication returns [String current=null] : iv_ruleApplication= ruleApplication EOF ;
    public final String entryRuleApplication() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleApplication = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2553:2: (iv_ruleApplication= ruleApplication EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2554:2: iv_ruleApplication= ruleApplication EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getApplicationRule()); 
            }
            pushFollow(FOLLOW_ruleApplication_in_entryRuleApplication7123);
            iv_ruleApplication=ruleApplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleApplication.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplication7134); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleApplication"


    // $ANTLR start "ruleApplication"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2564:1: ruleApplication returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'temp52' ;
    public final AntlrDatatypeRuleToken ruleApplication() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2568:28: (kw= 'temp52' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2570:2: kw= 'temp52'
            {
            kw=(Token)match(input,98,FOLLOW_98_in_ruleApplication7175); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getApplicationAccess().getTemp52Keyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleApplication"


    // $ANTLR start "entryRuleMolecule"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2598:1: entryRuleMolecule returns [EObject current=null] : iv_ruleMolecule= ruleMolecule EOF ;
    public final EObject entryRuleMolecule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMolecule = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2602:2: (iv_ruleMolecule= ruleMolecule EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2603:2: iv_ruleMolecule= ruleMolecule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMoleculeRule()); 
            }
            pushFollow(FOLLOW_ruleMolecule_in_entryRuleMolecule7236);
            iv_ruleMolecule=ruleMolecule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMolecule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMolecule7246); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleMolecule"


    // $ANTLR start "ruleMolecule"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2613:1: ruleMolecule returns [EObject current=null] : (this_Atom_0= ruleAtom | this_Enclosure_1= ruleEnclosure ) ;
    public final EObject ruleMolecule() throws RecognitionException {
        EObject current = null;

        EObject this_Atom_0 = null;

        EObject this_Enclosure_1 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2617:28: ( (this_Atom_0= ruleAtom | this_Enclosure_1= ruleEnclosure ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2618:1: (this_Atom_0= ruleAtom | this_Enclosure_1= ruleEnclosure )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2618:1: (this_Atom_0= ruleAtom | this_Enclosure_1= ruleEnclosure )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_TK_ID||(LA32_0>=RULE_KW_SHARP && LA32_0<=RULE_TK_STRING)) ) {
                alt32=1;
            }
            else if ( (LA32_0==RULE_KW_OPAREN||LA32_0==RULE_KW_OBRACK||LA32_0==RULE_KW_QUOTE) ) {
                alt32=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2619:5: this_Atom_0= ruleAtom
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMoleculeAccess().getAtomParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAtom_in_ruleMolecule7297);
                    this_Atom_0=ruleAtom();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Atom_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2629:5: this_Enclosure_1= ruleEnclosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMoleculeAccess().getEnclosureParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEnclosure_in_ruleMolecule7324);
                    this_Enclosure_1=ruleEnclosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Enclosure_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleMolecule"


    // $ANTLR start "entryRuleEnclosure"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2648:1: entryRuleEnclosure returns [EObject current=null] : iv_ruleEnclosure= ruleEnclosure EOF ;
    public final EObject entryRuleEnclosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnclosure = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2652:2: (iv_ruleEnclosure= ruleEnclosure EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2653:2: iv_ruleEnclosure= ruleEnclosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnclosureRule()); 
            }
            pushFollow(FOLLOW_ruleEnclosure_in_entryRuleEnclosure7369);
            iv_ruleEnclosure=ruleEnclosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnclosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnclosure7379); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleEnclosure"


    // $ANTLR start "ruleEnclosure"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2663:1: ruleEnclosure returns [EObject current=null] : (this_Parened_0= ruleParened | this_Bracketed_1= ruleBracketed | this_QuotedIds_2= ruleQuotedIds ) ;
    public final EObject ruleEnclosure() throws RecognitionException {
        EObject current = null;

        EObject this_Parened_0 = null;

        EObject this_Bracketed_1 = null;

        EObject this_QuotedIds_2 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2667:28: ( (this_Parened_0= ruleParened | this_Bracketed_1= ruleBracketed | this_QuotedIds_2= ruleQuotedIds ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2668:1: (this_Parened_0= ruleParened | this_Bracketed_1= ruleBracketed | this_QuotedIds_2= ruleQuotedIds )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2668:1: (this_Parened_0= ruleParened | this_Bracketed_1= ruleBracketed | this_QuotedIds_2= ruleQuotedIds )
            int alt33=3;
            switch ( input.LA(1) ) {
            case RULE_KW_OPAREN:
                {
                alt33=1;
                }
                break;
            case RULE_KW_OBRACK:
                {
                alt33=2;
                }
                break;
            case RULE_KW_QUOTE:
                {
                alt33=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2669:5: this_Parened_0= ruleParened
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEnclosureAccess().getParenedParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParened_in_ruleEnclosure7430);
                    this_Parened_0=ruleParened();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Parened_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2679:5: this_Bracketed_1= ruleBracketed
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEnclosureAccess().getBracketedParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBracketed_in_ruleEnclosure7457);
                    this_Bracketed_1=ruleBracketed();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Bracketed_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2689:5: this_QuotedIds_2= ruleQuotedIds
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEnclosureAccess().getQuotedIdsParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleQuotedIds_in_ruleEnclosure7484);
                    this_QuotedIds_2=ruleQuotedIds();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_QuotedIds_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleEnclosure"


    // $ANTLR start "entryRuleBlockMolecule"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2710:1: entryRuleBlockMolecule returns [EObject current=null] : iv_ruleBlockMolecule= ruleBlockMolecule EOF ;
    public final EObject entryRuleBlockMolecule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockMolecule = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2714:2: (iv_ruleBlockMolecule= ruleBlockMolecule EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2715:2: iv_ruleBlockMolecule= ruleBlockMolecule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBlockMoleculeRule()); 
            }
            pushFollow(FOLLOW_ruleBlockMolecule_in_entryRuleBlockMolecule7531);
            iv_ruleBlockMolecule=ruleBlockMolecule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBlockMolecule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlockMolecule7541); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleBlockMolecule"


    // $ANTLR start "ruleBlockMolecule"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2725:1: ruleBlockMolecule returns [EObject current=null] : (this_Atom_0= ruleAtom | this_Enclosure_1= ruleEnclosure | ruleBlock ) ;
    public final EObject ruleBlockMolecule() throws RecognitionException {
        EObject current = null;

        EObject this_Atom_0 = null;

        EObject this_Enclosure_1 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2729:28: ( (this_Atom_0= ruleAtom | this_Enclosure_1= ruleEnclosure | ruleBlock ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2730:1: (this_Atom_0= ruleAtom | this_Enclosure_1= ruleEnclosure | ruleBlock )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2730:1: (this_Atom_0= ruleAtom | this_Enclosure_1= ruleEnclosure | ruleBlock )
            int alt34=3;
            switch ( input.LA(1) ) {
            case RULE_TK_ID:
            case RULE_KW_SHARP:
            case RULE_KW_TILDE:
            case RULE_TK_INT:
            case RULE_TK_STRING:
                {
                alt34=1;
                }
                break;
            case RULE_KW_OPAREN:
            case RULE_KW_OBRACK:
            case RULE_KW_QUOTE:
                {
                alt34=2;
                }
                break;
            case 99:
                {
                alt34=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2731:5: this_Atom_0= ruleAtom
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBlockMoleculeAccess().getAtomParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAtom_in_ruleBlockMolecule7592);
                    this_Atom_0=ruleAtom();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Atom_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2741:5: this_Enclosure_1= ruleEnclosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBlockMoleculeAccess().getEnclosureParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEnclosure_in_ruleBlockMolecule7619);
                    this_Enclosure_1=ruleEnclosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Enclosure_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2751:5: ruleBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBlockMoleculeAccess().getBlockParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBlock_in_ruleBlockMolecule7640);
                    ruleBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleBlockMolecule"


    // $ANTLR start "entryRuleBlockEnclosure"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2769:1: entryRuleBlockEnclosure returns [EObject current=null] : iv_ruleBlockEnclosure= ruleBlockEnclosure EOF ;
    public final EObject entryRuleBlockEnclosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockEnclosure = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2773:2: (iv_ruleBlockEnclosure= ruleBlockEnclosure EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2774:2: iv_ruleBlockEnclosure= ruleBlockEnclosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBlockEnclosureRule()); 
            }
            pushFollow(FOLLOW_ruleBlockEnclosure_in_entryRuleBlockEnclosure7685);
            iv_ruleBlockEnclosure=ruleBlockEnclosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBlockEnclosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlockEnclosure7695); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleBlockEnclosure"


    // $ANTLR start "ruleBlockEnclosure"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2784:1: ruleBlockEnclosure returns [EObject current=null] : (this_Enclosure_0= ruleEnclosure | ruleBlock ) ;
    public final EObject ruleBlockEnclosure() throws RecognitionException {
        EObject current = null;

        EObject this_Enclosure_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2788:28: ( (this_Enclosure_0= ruleEnclosure | ruleBlock ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2789:1: (this_Enclosure_0= ruleEnclosure | ruleBlock )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2789:1: (this_Enclosure_0= ruleEnclosure | ruleBlock )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_KW_OPAREN||LA35_0==RULE_KW_OBRACK||LA35_0==RULE_KW_QUOTE) ) {
                alt35=1;
            }
            else if ( (LA35_0==99) ) {
                alt35=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2790:5: this_Enclosure_0= ruleEnclosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBlockEnclosureAccess().getEnclosureParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEnclosure_in_ruleBlockEnclosure7746);
                    this_Enclosure_0=ruleEnclosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Enclosure_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2800:5: ruleBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBlockEnclosureAccess().getBlockParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBlock_in_ruleBlockEnclosure7767);
                    ruleBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleBlockEnclosure"


    // $ANTLR start "entryRuleBlock"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2818:1: entryRuleBlock returns [String current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final String entryRuleBlock() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBlock = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2822:2: (iv_ruleBlock= ruleBlock EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2823:2: iv_ruleBlock= ruleBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBlockRule()); 
            }
            pushFollow(FOLLOW_ruleBlock_in_entryRuleBlock7813);
            iv_ruleBlock=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBlock.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlock7824); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2833:1: ruleBlock returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'temp65' ;
    public final AntlrDatatypeRuleToken ruleBlock() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2837:28: (kw= 'temp65' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2839:2: kw= 'temp65'
            {
            kw=(Token)match(input,99,FOLLOW_99_in_ruleBlock7865); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getBlockAccess().getTemp65Keyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleParened"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2855:1: entryRuleParened returns [EObject current=null] : iv_ruleParened= ruleParened EOF ;
    public final EObject entryRuleParened() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParened = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2859:2: (iv_ruleParened= ruleParened EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2860:2: iv_ruleParened= ruleParened EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParenedRule()); 
            }
            pushFollow(FOLLOW_ruleParened_in_entryRuleParened7914);
            iv_ruleParened=ruleParened();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParened; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParened7924); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleParened"


    // $ANTLR start "ruleParened"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2870:1: ruleParened returns [EObject current=null] : ( (this_KW_OPAREN_0= RULE_KW_OPAREN this_KW_CPAREN_1= RULE_KW_CPAREN ) | (this_KW_OPAREN_2= RULE_KW_OPAREN this_Expression_3= ruleExpression this_KW_CPAREN_4= RULE_KW_CPAREN ) ) ;
    public final EObject ruleParened() throws RecognitionException {
        EObject current = null;

        Token this_KW_OPAREN_0=null;
        Token this_KW_CPAREN_1=null;
        Token this_KW_OPAREN_2=null;
        Token this_KW_CPAREN_4=null;
        EObject this_Expression_3 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2874:28: ( ( (this_KW_OPAREN_0= RULE_KW_OPAREN this_KW_CPAREN_1= RULE_KW_CPAREN ) | (this_KW_OPAREN_2= RULE_KW_OPAREN this_Expression_3= ruleExpression this_KW_CPAREN_4= RULE_KW_CPAREN ) ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2875:1: ( (this_KW_OPAREN_0= RULE_KW_OPAREN this_KW_CPAREN_1= RULE_KW_CPAREN ) | (this_KW_OPAREN_2= RULE_KW_OPAREN this_Expression_3= ruleExpression this_KW_CPAREN_4= RULE_KW_CPAREN ) )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2875:1: ( (this_KW_OPAREN_0= RULE_KW_OPAREN this_KW_CPAREN_1= RULE_KW_CPAREN ) | (this_KW_OPAREN_2= RULE_KW_OPAREN this_Expression_3= ruleExpression this_KW_CPAREN_4= RULE_KW_CPAREN ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_KW_OPAREN) ) {
                int LA36_1 = input.LA(2);

                if ( (LA36_1==RULE_KW_AT||(LA36_1>=72 && LA36_1<=82)||(LA36_1>=87 && LA36_1<=88)||LA36_1==99) ) {
                    alt36=2;
                }
                else if ( (LA36_1==RULE_KW_CPAREN) ) {
                    alt36=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2875:2: (this_KW_OPAREN_0= RULE_KW_OPAREN this_KW_CPAREN_1= RULE_KW_CPAREN )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2875:2: (this_KW_OPAREN_0= RULE_KW_OPAREN this_KW_CPAREN_1= RULE_KW_CPAREN )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2875:3: this_KW_OPAREN_0= RULE_KW_OPAREN this_KW_CPAREN_1= RULE_KW_CPAREN
                    {
                    this_KW_OPAREN_0=(Token)match(input,RULE_KW_OPAREN,FOLLOW_RULE_KW_OPAREN_in_ruleParened7965); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_OPAREN_0, grammarAccess.getParenedAccess().getKW_OPARENTerminalRuleCall_0_0()); 
                          
                    }
                    this_KW_CPAREN_1=(Token)match(input,RULE_KW_CPAREN,FOLLOW_RULE_KW_CPAREN_in_ruleParened7975); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_CPAREN_1, grammarAccess.getParenedAccess().getKW_CPARENTerminalRuleCall_0_1()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2884:6: (this_KW_OPAREN_2= RULE_KW_OPAREN this_Expression_3= ruleExpression this_KW_CPAREN_4= RULE_KW_CPAREN )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2884:6: (this_KW_OPAREN_2= RULE_KW_OPAREN this_Expression_3= ruleExpression this_KW_CPAREN_4= RULE_KW_CPAREN )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2884:7: this_KW_OPAREN_2= RULE_KW_OPAREN this_Expression_3= ruleExpression this_KW_CPAREN_4= RULE_KW_CPAREN
                    {
                    this_KW_OPAREN_2=(Token)match(input,RULE_KW_OPAREN,FOLLOW_RULE_KW_OPAREN_in_ruleParened7993); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_OPAREN_2, grammarAccess.getParenedAccess().getKW_OPARENTerminalRuleCall_1_0()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getParenedAccess().getExpressionParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleParened8014);
                    this_Expression_3=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Expression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    this_KW_CPAREN_4=(Token)match(input,RULE_KW_CPAREN,FOLLOW_RULE_KW_CPAREN_in_ruleParened8024); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_CPAREN_4, grammarAccess.getParenedAccess().getKW_CPARENTerminalRuleCall_1_2()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleParened"


    // $ANTLR start "entryRuleBracketed"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2912:1: entryRuleBracketed returns [EObject current=null] : iv_ruleBracketed= ruleBracketed EOF ;
    public final EObject entryRuleBracketed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBracketed = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2916:2: (iv_ruleBracketed= ruleBracketed EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2917:2: iv_ruleBracketed= ruleBracketed EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBracketedRule()); 
            }
            pushFollow(FOLLOW_ruleBracketed_in_entryRuleBracketed8070);
            iv_ruleBracketed=ruleBracketed();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBracketed; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBracketed8080); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleBracketed"


    // $ANTLR start "ruleBracketed"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2927:1: ruleBracketed returns [EObject current=null] : ( (this_KW_OBRACK_0= RULE_KW_OBRACK this_KW_CBRACK_1= RULE_KW_CBRACK ) | (this_KW_OBRACK_2= RULE_KW_OBRACK this_Expression_3= ruleExpression this_KW_CBRACK_4= RULE_KW_CBRACK ) ) ;
    public final EObject ruleBracketed() throws RecognitionException {
        EObject current = null;

        Token this_KW_OBRACK_0=null;
        Token this_KW_CBRACK_1=null;
        Token this_KW_OBRACK_2=null;
        Token this_KW_CBRACK_4=null;
        EObject this_Expression_3 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2931:28: ( ( (this_KW_OBRACK_0= RULE_KW_OBRACK this_KW_CBRACK_1= RULE_KW_CBRACK ) | (this_KW_OBRACK_2= RULE_KW_OBRACK this_Expression_3= ruleExpression this_KW_CBRACK_4= RULE_KW_CBRACK ) ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2932:1: ( (this_KW_OBRACK_0= RULE_KW_OBRACK this_KW_CBRACK_1= RULE_KW_CBRACK ) | (this_KW_OBRACK_2= RULE_KW_OBRACK this_Expression_3= ruleExpression this_KW_CBRACK_4= RULE_KW_CBRACK ) )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2932:1: ( (this_KW_OBRACK_0= RULE_KW_OBRACK this_KW_CBRACK_1= RULE_KW_CBRACK ) | (this_KW_OBRACK_2= RULE_KW_OBRACK this_Expression_3= ruleExpression this_KW_CBRACK_4= RULE_KW_CBRACK ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_KW_OBRACK) ) {
                int LA37_1 = input.LA(2);

                if ( (LA37_1==RULE_KW_CBRACK) ) {
                    alt37=1;
                }
                else if ( (LA37_1==RULE_KW_AT||(LA37_1>=72 && LA37_1<=82)||(LA37_1>=87 && LA37_1<=88)||LA37_1==99) ) {
                    alt37=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2932:2: (this_KW_OBRACK_0= RULE_KW_OBRACK this_KW_CBRACK_1= RULE_KW_CBRACK )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2932:2: (this_KW_OBRACK_0= RULE_KW_OBRACK this_KW_CBRACK_1= RULE_KW_CBRACK )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2932:3: this_KW_OBRACK_0= RULE_KW_OBRACK this_KW_CBRACK_1= RULE_KW_CBRACK
                    {
                    this_KW_OBRACK_0=(Token)match(input,RULE_KW_OBRACK,FOLLOW_RULE_KW_OBRACK_in_ruleBracketed8121); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_OBRACK_0, grammarAccess.getBracketedAccess().getKW_OBRACKTerminalRuleCall_0_0()); 
                          
                    }
                    this_KW_CBRACK_1=(Token)match(input,RULE_KW_CBRACK,FOLLOW_RULE_KW_CBRACK_in_ruleBracketed8131); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_CBRACK_1, grammarAccess.getBracketedAccess().getKW_CBRACKTerminalRuleCall_0_1()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2941:6: (this_KW_OBRACK_2= RULE_KW_OBRACK this_Expression_3= ruleExpression this_KW_CBRACK_4= RULE_KW_CBRACK )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2941:6: (this_KW_OBRACK_2= RULE_KW_OBRACK this_Expression_3= ruleExpression this_KW_CBRACK_4= RULE_KW_CBRACK )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2941:7: this_KW_OBRACK_2= RULE_KW_OBRACK this_Expression_3= ruleExpression this_KW_CBRACK_4= RULE_KW_CBRACK
                    {
                    this_KW_OBRACK_2=(Token)match(input,RULE_KW_OBRACK,FOLLOW_RULE_KW_OBRACK_in_ruleBracketed8149); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_OBRACK_2, grammarAccess.getBracketedAccess().getKW_OBRACKTerminalRuleCall_1_0()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBracketedAccess().getExpressionParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleBracketed8170);
                    this_Expression_3=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Expression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    this_KW_CBRACK_4=(Token)match(input,RULE_KW_CBRACK,FOLLOW_RULE_KW_CBRACK_in_ruleBracketed8180); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_CBRACK_4, grammarAccess.getBracketedAccess().getKW_CBRACKTerminalRuleCall_1_2()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleBracketed"


    // $ANTLR start "entryRuleQuotedIds"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2969:1: entryRuleQuotedIds returns [EObject current=null] : iv_ruleQuotedIds= ruleQuotedIds EOF ;
    public final EObject entryRuleQuotedIds() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuotedIds = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2973:2: (iv_ruleQuotedIds= ruleQuotedIds EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2974:2: iv_ruleQuotedIds= ruleQuotedIds EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQuotedIdsRule()); 
            }
            pushFollow(FOLLOW_ruleQuotedIds_in_entryRuleQuotedIds8226);
            iv_ruleQuotedIds=ruleQuotedIds();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQuotedIds; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuotedIds8236); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleQuotedIds"


    // $ANTLR start "ruleQuotedIds"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2984:1: ruleQuotedIds returns [EObject current=null] : ( (this_KW_QUOTE_0= RULE_KW_QUOTE this_KW_QUOTE_1= RULE_KW_QUOTE ) | (this_KW_QUOTE_2= RULE_KW_QUOTE this_Names_3= ruleNames this_KW_QUOTE_4= RULE_KW_QUOTE ) ) ;
    public final EObject ruleQuotedIds() throws RecognitionException {
        EObject current = null;

        Token this_KW_QUOTE_0=null;
        Token this_KW_QUOTE_1=null;
        Token this_KW_QUOTE_2=null;
        Token this_KW_QUOTE_4=null;
        EObject this_Names_3 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2988:28: ( ( (this_KW_QUOTE_0= RULE_KW_QUOTE this_KW_QUOTE_1= RULE_KW_QUOTE ) | (this_KW_QUOTE_2= RULE_KW_QUOTE this_Names_3= ruleNames this_KW_QUOTE_4= RULE_KW_QUOTE ) ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2989:1: ( (this_KW_QUOTE_0= RULE_KW_QUOTE this_KW_QUOTE_1= RULE_KW_QUOTE ) | (this_KW_QUOTE_2= RULE_KW_QUOTE this_Names_3= ruleNames this_KW_QUOTE_4= RULE_KW_QUOTE ) )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2989:1: ( (this_KW_QUOTE_0= RULE_KW_QUOTE this_KW_QUOTE_1= RULE_KW_QUOTE ) | (this_KW_QUOTE_2= RULE_KW_QUOTE this_Names_3= ruleNames this_KW_QUOTE_4= RULE_KW_QUOTE ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_KW_QUOTE) ) {
                int LA38_1 = input.LA(2);

                if ( (LA38_1==RULE_KW_QUOTE) ) {
                    alt38=1;
                }
                else if ( (LA38_1==RULE_TK_ID) ) {
                    alt38=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2989:2: (this_KW_QUOTE_0= RULE_KW_QUOTE this_KW_QUOTE_1= RULE_KW_QUOTE )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2989:2: (this_KW_QUOTE_0= RULE_KW_QUOTE this_KW_QUOTE_1= RULE_KW_QUOTE )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2989:3: this_KW_QUOTE_0= RULE_KW_QUOTE this_KW_QUOTE_1= RULE_KW_QUOTE
                    {
                    this_KW_QUOTE_0=(Token)match(input,RULE_KW_QUOTE,FOLLOW_RULE_KW_QUOTE_in_ruleQuotedIds8277); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_QUOTE_0, grammarAccess.getQuotedIdsAccess().getKW_QUOTETerminalRuleCall_0_0()); 
                          
                    }
                    this_KW_QUOTE_1=(Token)match(input,RULE_KW_QUOTE,FOLLOW_RULE_KW_QUOTE_in_ruleQuotedIds8287); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_QUOTE_1, grammarAccess.getQuotedIdsAccess().getKW_QUOTETerminalRuleCall_0_1()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2998:6: (this_KW_QUOTE_2= RULE_KW_QUOTE this_Names_3= ruleNames this_KW_QUOTE_4= RULE_KW_QUOTE )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2998:6: (this_KW_QUOTE_2= RULE_KW_QUOTE this_Names_3= ruleNames this_KW_QUOTE_4= RULE_KW_QUOTE )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2998:7: this_KW_QUOTE_2= RULE_KW_QUOTE this_Names_3= ruleNames this_KW_QUOTE_4= RULE_KW_QUOTE
                    {
                    this_KW_QUOTE_2=(Token)match(input,RULE_KW_QUOTE,FOLLOW_RULE_KW_QUOTE_in_ruleQuotedIds8305); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_QUOTE_2, grammarAccess.getQuotedIdsAccess().getKW_QUOTETerminalRuleCall_1_0()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQuotedIdsAccess().getNamesParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNames_in_ruleQuotedIds8326);
                    this_Names_3=ruleNames();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Names_3; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    this_KW_QUOTE_4=(Token)match(input,RULE_KW_QUOTE,FOLLOW_RULE_KW_QUOTE_in_ruleQuotedIds8336); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_QUOTE_4, grammarAccess.getQuotedIdsAccess().getKW_QUOTETerminalRuleCall_1_2()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleQuotedIds"


    // $ANTLR start "entryRuleNames"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3026:1: entryRuleNames returns [EObject current=null] : iv_ruleNames= ruleNames EOF ;
    public final EObject entryRuleNames() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNames = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3030:2: (iv_ruleNames= ruleNames EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3031:2: iv_ruleNames= ruleNames EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNamesRule()); 
            }
            pushFollow(FOLLOW_ruleNames_in_entryRuleNames8382);
            iv_ruleNames=ruleNames();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNames; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNames8392); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleNames"


    // $ANTLR start "ruleNames"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3041:1: ruleNames returns [EObject current=null] : ( ( (lv_firstName_0_0= RULE_TK_ID ) ) (this_KW_COMMA_1= RULE_KW_COMMA ( (lv_subsequentNames_2_0= RULE_TK_ID ) ) )* ) ;
    public final EObject ruleNames() throws RecognitionException {
        EObject current = null;

        Token lv_firstName_0_0=null;
        Token this_KW_COMMA_1=null;
        Token lv_subsequentNames_2_0=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3045:28: ( ( ( (lv_firstName_0_0= RULE_TK_ID ) ) (this_KW_COMMA_1= RULE_KW_COMMA ( (lv_subsequentNames_2_0= RULE_TK_ID ) ) )* ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3046:1: ( ( (lv_firstName_0_0= RULE_TK_ID ) ) (this_KW_COMMA_1= RULE_KW_COMMA ( (lv_subsequentNames_2_0= RULE_TK_ID ) ) )* )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3046:1: ( ( (lv_firstName_0_0= RULE_TK_ID ) ) (this_KW_COMMA_1= RULE_KW_COMMA ( (lv_subsequentNames_2_0= RULE_TK_ID ) ) )* )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3046:2: ( (lv_firstName_0_0= RULE_TK_ID ) ) (this_KW_COMMA_1= RULE_KW_COMMA ( (lv_subsequentNames_2_0= RULE_TK_ID ) ) )*
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3046:2: ( (lv_firstName_0_0= RULE_TK_ID ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3047:1: (lv_firstName_0_0= RULE_TK_ID )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3047:1: (lv_firstName_0_0= RULE_TK_ID )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3048:3: lv_firstName_0_0= RULE_TK_ID
            {
            lv_firstName_0_0=(Token)match(input,RULE_TK_ID,FOLLOW_RULE_TK_ID_in_ruleNames8438); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_firstName_0_0, grammarAccess.getNamesAccess().getFirstNameTK_IDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getNamesRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"firstName",
                      		lv_firstName_0_0, 
                      		"TK_ID");
              	    
            }

            }


            }

            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3064:2: (this_KW_COMMA_1= RULE_KW_COMMA ( (lv_subsequentNames_2_0= RULE_TK_ID ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_KW_COMMA) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3064:3: this_KW_COMMA_1= RULE_KW_COMMA ( (lv_subsequentNames_2_0= RULE_TK_ID ) )
            	    {
            	    this_KW_COMMA_1=(Token)match(input,RULE_KW_COMMA,FOLLOW_RULE_KW_COMMA_in_ruleNames8455); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_KW_COMMA_1, grammarAccess.getNamesAccess().getKW_COMMATerminalRuleCall_1_0()); 
            	          
            	    }
            	    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3068:1: ( (lv_subsequentNames_2_0= RULE_TK_ID ) )
            	    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3069:1: (lv_subsequentNames_2_0= RULE_TK_ID )
            	    {
            	    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3069:1: (lv_subsequentNames_2_0= RULE_TK_ID )
            	    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3070:3: lv_subsequentNames_2_0= RULE_TK_ID
            	    {
            	    lv_subsequentNames_2_0=(Token)match(input,RULE_TK_ID,FOLLOW_RULE_TK_ID_in_ruleNames8471); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_subsequentNames_2_0, grammarAccess.getNamesAccess().getSubsequentNamesTK_IDTerminalRuleCall_1_1_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getNamesRule());
            	      	        }
            	             		addWithLastConsumed(
            	             			current, 
            	             			"subsequentNames",
            	              		lv_subsequentNames_2_0, 
            	              		"TK_ID");
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleNames"


    // $ANTLR start "entryRuleAtom"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3097:1: entryRuleAtom returns [EObject current=null] : iv_ruleAtom= ruleAtom EOF ;
    public final EObject entryRuleAtom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtom = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3101:2: (iv_ruleAtom= ruleAtom EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3102:2: iv_ruleAtom= ruleAtom EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomRule()); 
            }
            pushFollow(FOLLOW_ruleAtom_in_entryRuleAtom8524);
            iv_ruleAtom=ruleAtom();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtom; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtom8534); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleAtom"


    // $ANTLR start "ruleAtom"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3112:1: ruleAtom returns [EObject current=null] : ( ( (lv_id_0_0= ruleId ) ) | ( (lv_lit_1_0= ruleLiteral ) ) ) ;
    public final EObject ruleAtom() throws RecognitionException {
        EObject current = null;

        EObject lv_id_0_0 = null;

        AntlrDatatypeRuleToken lv_lit_1_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3116:28: ( ( ( (lv_id_0_0= ruleId ) ) | ( (lv_lit_1_0= ruleLiteral ) ) ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3117:1: ( ( (lv_id_0_0= ruleId ) ) | ( (lv_lit_1_0= ruleLiteral ) ) )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3117:1: ( ( (lv_id_0_0= ruleId ) ) | ( (lv_lit_1_0= ruleLiteral ) ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_TK_ID||(LA40_0>=RULE_KW_SHARP && LA40_0<=RULE_KW_TILDE)) ) {
                alt40=1;
            }
            else if ( ((LA40_0>=RULE_TK_INT && LA40_0<=RULE_TK_STRING)) ) {
                alt40=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3117:2: ( (lv_id_0_0= ruleId ) )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3117:2: ( (lv_id_0_0= ruleId ) )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3118:1: (lv_id_0_0= ruleId )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3118:1: (lv_id_0_0= ruleId )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3119:3: lv_id_0_0= ruleId
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAtomAccess().getIdIdParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleId_in_ruleAtom8584);
                    lv_id_0_0=ruleId();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAtomRule());
                      	        }
                             		set(
                             			current, 
                             			"id",
                              		lv_id_0_0, 
                              		"Id");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3136:6: ( (lv_lit_1_0= ruleLiteral ) )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3136:6: ( (lv_lit_1_0= ruleLiteral ) )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3137:1: (lv_lit_1_0= ruleLiteral )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3137:1: (lv_lit_1_0= ruleLiteral )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3138:3: lv_lit_1_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAtomAccess().getLitLiteralParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLiteral_in_ruleAtom8611);
                    lv_lit_1_0=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAtomRule());
                      	        }
                             		set(
                             			current, 
                             			"lit",
                              		lv_lit_1_0, 
                              		"Literal");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleAtom"


    // $ANTLR start "entryRuleId"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3167:1: entryRuleId returns [EObject current=null] : iv_ruleId= ruleId EOF ;
    public final EObject entryRuleId() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleId = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3171:2: (iv_ruleId= ruleId EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3172:2: iv_ruleId= ruleId EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdRule()); 
            }
            pushFollow(FOLLOW_ruleId_in_entryRuleId8659);
            iv_ruleId=ruleId();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleId; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleId8669); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleId"


    // $ANTLR start "ruleId"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3182:1: ruleId returns [EObject current=null] : ( ( (lv_AB_Id_0_0= RULE_TK_ID ) ) | ( (lv_op_1_0= RULE_KW_SHARP ) ) | ( (lv_op_2_0= RULE_KW_TILDE ) ) ) ;
    public final EObject ruleId() throws RecognitionException {
        EObject current = null;

        Token lv_AB_Id_0_0=null;
        Token lv_op_1_0=null;
        Token lv_op_2_0=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3186:28: ( ( ( (lv_AB_Id_0_0= RULE_TK_ID ) ) | ( (lv_op_1_0= RULE_KW_SHARP ) ) | ( (lv_op_2_0= RULE_KW_TILDE ) ) ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3187:1: ( ( (lv_AB_Id_0_0= RULE_TK_ID ) ) | ( (lv_op_1_0= RULE_KW_SHARP ) ) | ( (lv_op_2_0= RULE_KW_TILDE ) ) )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3187:1: ( ( (lv_AB_Id_0_0= RULE_TK_ID ) ) | ( (lv_op_1_0= RULE_KW_SHARP ) ) | ( (lv_op_2_0= RULE_KW_TILDE ) ) )
            int alt41=3;
            switch ( input.LA(1) ) {
            case RULE_TK_ID:
                {
                alt41=1;
                }
                break;
            case RULE_KW_SHARP:
                {
                alt41=2;
                }
                break;
            case RULE_KW_TILDE:
                {
                alt41=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3187:2: ( (lv_AB_Id_0_0= RULE_TK_ID ) )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3187:2: ( (lv_AB_Id_0_0= RULE_TK_ID ) )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3188:1: (lv_AB_Id_0_0= RULE_TK_ID )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3188:1: (lv_AB_Id_0_0= RULE_TK_ID )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3189:3: lv_AB_Id_0_0= RULE_TK_ID
                    {
                    lv_AB_Id_0_0=(Token)match(input,RULE_TK_ID,FOLLOW_RULE_TK_ID_in_ruleId8715); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_AB_Id_0_0, grammarAccess.getIdAccess().getAB_IdTK_IDTerminalRuleCall_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getIdRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"AB_Id",
                              		lv_AB_Id_0_0, 
                              		"TK_ID");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3206:6: ( (lv_op_1_0= RULE_KW_SHARP ) )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3206:6: ( (lv_op_1_0= RULE_KW_SHARP ) )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3207:1: (lv_op_1_0= RULE_KW_SHARP )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3207:1: (lv_op_1_0= RULE_KW_SHARP )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3208:3: lv_op_1_0= RULE_KW_SHARP
                    {
                    lv_op_1_0=(Token)match(input,RULE_KW_SHARP,FOLLOW_RULE_KW_SHARP_in_ruleId8743); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_op_1_0, grammarAccess.getIdAccess().getOpKW_SHARPTerminalRuleCall_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getIdRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"op",
                              		lv_op_1_0, 
                              		"KW_SHARP");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3225:6: ( (lv_op_2_0= RULE_KW_TILDE ) )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3225:6: ( (lv_op_2_0= RULE_KW_TILDE ) )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3226:1: (lv_op_2_0= RULE_KW_TILDE )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3226:1: (lv_op_2_0= RULE_KW_TILDE )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3227:3: lv_op_2_0= RULE_KW_TILDE
                    {
                    lv_op_2_0=(Token)match(input,RULE_KW_TILDE,FOLLOW_RULE_KW_TILDE_in_ruleId8771); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_op_2_0, grammarAccess.getIdAccess().getOpKW_TILDETerminalRuleCall_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getIdRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"op",
                              		lv_op_2_0, 
                              		"KW_TILDE");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleId"


    // $ANTLR start "entryRuleLiteral"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3254:1: entryRuleLiteral returns [String current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final String entryRuleLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLiteral = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3258:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3259:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral8823);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral8834); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3269:1: ruleLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TK_INT_0= RULE_TK_INT | this_TK_STRING_1= RULE_TK_STRING ) ;
    public final AntlrDatatypeRuleToken ruleLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_TK_INT_0=null;
        Token this_TK_STRING_1=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3273:28: ( (this_TK_INT_0= RULE_TK_INT | this_TK_STRING_1= RULE_TK_STRING ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3274:1: (this_TK_INT_0= RULE_TK_INT | this_TK_STRING_1= RULE_TK_STRING )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3274:1: (this_TK_INT_0= RULE_TK_INT | this_TK_STRING_1= RULE_TK_STRING )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_TK_INT) ) {
                alt42=1;
            }
            else if ( (LA42_0==RULE_TK_STRING) ) {
                alt42=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3274:6: this_TK_INT_0= RULE_TK_INT
                    {
                    this_TK_INT_0=(Token)match(input,RULE_TK_INT,FOLLOW_RULE_TK_INT_in_ruleLiteral8878); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_TK_INT_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_TK_INT_0, grammarAccess.getLiteralAccess().getTK_INTTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3282:10: this_TK_STRING_1= RULE_TK_STRING
                    {
                    this_TK_STRING_1=(Token)match(input,RULE_TK_STRING,FOLLOW_RULE_TK_STRING_in_ruleLiteral8904); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_TK_STRING_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_TK_STRING_1, grammarAccess.getLiteralAccess().getTK_STRINGTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleUnqualOp_ArrowTok"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3300:1: entryRuleUnqualOp_ArrowTok returns [EObject current=null] : iv_ruleUnqualOp_ArrowTok= ruleUnqualOp_ArrowTok EOF ;
    public final EObject entryRuleUnqualOp_ArrowTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnqualOp_ArrowTok = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3304:2: (iv_ruleUnqualOp_ArrowTok= ruleUnqualOp_ArrowTok EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3305:2: iv_ruleUnqualOp_ArrowTok= ruleUnqualOp_ArrowTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnqualOp_ArrowTokRule()); 
            }
            pushFollow(FOLLOW_ruleUnqualOp_ArrowTok_in_entryRuleUnqualOp_ArrowTok8959);
            iv_ruleUnqualOp_ArrowTok=ruleUnqualOp_ArrowTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnqualOp_ArrowTok; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnqualOp_ArrowTok8969); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleUnqualOp_ArrowTok"


    // $ANTLR start "ruleUnqualOp_ArrowTok"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3315:1: ruleUnqualOp_ArrowTok returns [EObject current=null] : ( ruleArrowTok () ) ;
    public final EObject ruleUnqualOp_ArrowTok() throws RecognitionException {
        EObject current = null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3319:28: ( ( ruleArrowTok () ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3320:1: ( ruleArrowTok () )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3320:1: ( ruleArrowTok () )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3321:5: ruleArrowTok ()
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getUnqualOp_ArrowTokAccess().getArrowTokParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleArrowTok_in_ruleUnqualOp_ArrowTok9014);
            ruleArrowTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3328:1: ()
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3329:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getUnqualOp_ArrowTokAccess().getArrowTokAction_1(),
                          current);
                  
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleUnqualOp_ArrowTok"


    // $ANTLR start "entryRuleUnqualOp_LatticeTok"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3345:1: entryRuleUnqualOp_LatticeTok returns [EObject current=null] : iv_ruleUnqualOp_LatticeTok= ruleUnqualOp_LatticeTok EOF ;
    public final EObject entryRuleUnqualOp_LatticeTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnqualOp_LatticeTok = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3349:2: (iv_ruleUnqualOp_LatticeTok= ruleUnqualOp_LatticeTok EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3350:2: iv_ruleUnqualOp_LatticeTok= ruleUnqualOp_LatticeTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnqualOp_LatticeTokRule()); 
            }
            pushFollow(FOLLOW_ruleUnqualOp_LatticeTok_in_entryRuleUnqualOp_LatticeTok9068);
            iv_ruleUnqualOp_LatticeTok=ruleUnqualOp_LatticeTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnqualOp_LatticeTok; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnqualOp_LatticeTok9078); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleUnqualOp_LatticeTok"


    // $ANTLR start "ruleUnqualOp_LatticeTok"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3360:1: ruleUnqualOp_LatticeTok returns [EObject current=null] : ( ruleLatticeTok () ) ;
    public final EObject ruleUnqualOp_LatticeTok() throws RecognitionException {
        EObject current = null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3364:28: ( ( ruleLatticeTok () ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3365:1: ( ruleLatticeTok () )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3365:1: ( ruleLatticeTok () )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3366:5: ruleLatticeTok ()
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getUnqualOp_LatticeTokAccess().getLatticeTokParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLatticeTok_in_ruleUnqualOp_LatticeTok9123);
            ruleLatticeTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3373:1: ()
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3374:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getUnqualOp_LatticeTokAccess().getLatticeTokAction_1(),
                          current);
                  
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleUnqualOp_LatticeTok"


    // $ANTLR start "entryRuleUnqualOp_RelationTok"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3390:1: entryRuleUnqualOp_RelationTok returns [EObject current=null] : iv_ruleUnqualOp_RelationTok= ruleUnqualOp_RelationTok EOF ;
    public final EObject entryRuleUnqualOp_RelationTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnqualOp_RelationTok = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3394:2: (iv_ruleUnqualOp_RelationTok= ruleUnqualOp_RelationTok EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3395:2: iv_ruleUnqualOp_RelationTok= ruleUnqualOp_RelationTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnqualOp_RelationTokRule()); 
            }
            pushFollow(FOLLOW_ruleUnqualOp_RelationTok_in_entryRuleUnqualOp_RelationTok9177);
            iv_ruleUnqualOp_RelationTok=ruleUnqualOp_RelationTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnqualOp_RelationTok; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnqualOp_RelationTok9187); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleUnqualOp_RelationTok"


    // $ANTLR start "ruleUnqualOp_RelationTok"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3405:1: ruleUnqualOp_RelationTok returns [EObject current=null] : ( ruleRelationTok () ) ;
    public final EObject ruleUnqualOp_RelationTok() throws RecognitionException {
        EObject current = null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3409:28: ( ( ruleRelationTok () ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3410:1: ( ruleRelationTok () )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3410:1: ( ruleRelationTok () )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3411:5: ruleRelationTok ()
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getUnqualOp_RelationTokAccess().getRelationTokParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleRelationTok_in_ruleUnqualOp_RelationTok9232);
            ruleRelationTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3418:1: ()
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3419:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getUnqualOp_RelationTokAccess().getRelationTokAction_1(),
                          current);
                  
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleUnqualOp_RelationTok"


    // $ANTLR start "entryRuleUnqualOp_SegTok"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3435:1: entryRuleUnqualOp_SegTok returns [EObject current=null] : iv_ruleUnqualOp_SegTok= ruleUnqualOp_SegTok EOF ;
    public final EObject entryRuleUnqualOp_SegTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnqualOp_SegTok = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3439:2: (iv_ruleUnqualOp_SegTok= ruleUnqualOp_SegTok EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3440:2: iv_ruleUnqualOp_SegTok= ruleUnqualOp_SegTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnqualOp_SegTokRule()); 
            }
            pushFollow(FOLLOW_ruleUnqualOp_SegTok_in_entryRuleUnqualOp_SegTok9286);
            iv_ruleUnqualOp_SegTok=ruleUnqualOp_SegTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnqualOp_SegTok; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnqualOp_SegTok9296); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleUnqualOp_SegTok"


    // $ANTLR start "ruleUnqualOp_SegTok"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3450:1: ruleUnqualOp_SegTok returns [EObject current=null] : ( ruleSegTok () ) ;
    public final EObject ruleUnqualOp_SegTok() throws RecognitionException {
        EObject current = null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3454:28: ( ( ruleSegTok () ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3455:1: ( ruleSegTok () )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3455:1: ( ruleSegTok () )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3456:5: ruleSegTok ()
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getUnqualOp_SegTokAccess().getSegTokParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleSegTok_in_ruleUnqualOp_SegTok9341);
            ruleSegTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3463:1: ()
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3464:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getUnqualOp_SegTokAccess().getSegTokAction_1(),
                          current);
                  
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleUnqualOp_SegTok"


    // $ANTLR start "entryRuleUnqualOp_PlusTok"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3480:1: entryRuleUnqualOp_PlusTok returns [EObject current=null] : iv_ruleUnqualOp_PlusTok= ruleUnqualOp_PlusTok EOF ;
    public final EObject entryRuleUnqualOp_PlusTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnqualOp_PlusTok = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3484:2: (iv_ruleUnqualOp_PlusTok= ruleUnqualOp_PlusTok EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3485:2: iv_ruleUnqualOp_PlusTok= ruleUnqualOp_PlusTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnqualOp_PlusTokRule()); 
            }
            pushFollow(FOLLOW_ruleUnqualOp_PlusTok_in_entryRuleUnqualOp_PlusTok9395);
            iv_ruleUnqualOp_PlusTok=ruleUnqualOp_PlusTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnqualOp_PlusTok; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnqualOp_PlusTok9405); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleUnqualOp_PlusTok"


    // $ANTLR start "ruleUnqualOp_PlusTok"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3495:1: ruleUnqualOp_PlusTok returns [EObject current=null] : ( rulePlusTok () ) ;
    public final EObject ruleUnqualOp_PlusTok() throws RecognitionException {
        EObject current = null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3499:28: ( ( rulePlusTok () ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3500:1: ( rulePlusTok () )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3500:1: ( rulePlusTok () )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3501:5: rulePlusTok ()
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getUnqualOp_PlusTokAccess().getPlusTokParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_rulePlusTok_in_ruleUnqualOp_PlusTok9450);
            rulePlusTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3508:1: ()
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3509:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getUnqualOp_PlusTokAccess().getPlusTokAction_1(),
                          current);
                  
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleUnqualOp_PlusTok"


    // $ANTLR start "entryRuleUnqualOp_QuotientTok"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3525:1: entryRuleUnqualOp_QuotientTok returns [EObject current=null] : iv_ruleUnqualOp_QuotientTok= ruleUnqualOp_QuotientTok EOF ;
    public final EObject entryRuleUnqualOp_QuotientTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnqualOp_QuotientTok = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3529:2: (iv_ruleUnqualOp_QuotientTok= ruleUnqualOp_QuotientTok EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3530:2: iv_ruleUnqualOp_QuotientTok= ruleUnqualOp_QuotientTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnqualOp_QuotientTokRule()); 
            }
            pushFollow(FOLLOW_ruleUnqualOp_QuotientTok_in_entryRuleUnqualOp_QuotientTok9504);
            iv_ruleUnqualOp_QuotientTok=ruleUnqualOp_QuotientTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnqualOp_QuotientTok; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnqualOp_QuotientTok9514); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleUnqualOp_QuotientTok"


    // $ANTLR start "ruleUnqualOp_QuotientTok"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3540:1: ruleUnqualOp_QuotientTok returns [EObject current=null] : ( ruleQuotientTok () ) ;
    public final EObject ruleUnqualOp_QuotientTok() throws RecognitionException {
        EObject current = null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3544:28: ( ( ruleQuotientTok () ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3545:1: ( ruleQuotientTok () )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3545:1: ( ruleQuotientTok () )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3546:5: ruleQuotientTok ()
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getUnqualOp_QuotientTokAccess().getQuotientTokParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQuotientTok_in_ruleUnqualOp_QuotientTok9559);
            ruleQuotientTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3553:1: ()
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3554:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getUnqualOp_QuotientTokAccess().getQuotientTokAction_1(),
                          current);
                  
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleUnqualOp_QuotientTok"


    // $ANTLR start "entryRuleUnqualOp_TimesTok"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3570:1: entryRuleUnqualOp_TimesTok returns [EObject current=null] : iv_ruleUnqualOp_TimesTok= ruleUnqualOp_TimesTok EOF ;
    public final EObject entryRuleUnqualOp_TimesTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnqualOp_TimesTok = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3574:2: (iv_ruleUnqualOp_TimesTok= ruleUnqualOp_TimesTok EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3575:2: iv_ruleUnqualOp_TimesTok= ruleUnqualOp_TimesTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnqualOp_TimesTokRule()); 
            }
            pushFollow(FOLLOW_ruleUnqualOp_TimesTok_in_entryRuleUnqualOp_TimesTok9613);
            iv_ruleUnqualOp_TimesTok=ruleUnqualOp_TimesTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnqualOp_TimesTok; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnqualOp_TimesTok9623); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleUnqualOp_TimesTok"


    // $ANTLR start "ruleUnqualOp_TimesTok"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3585:1: ruleUnqualOp_TimesTok returns [EObject current=null] : ( ruleTimesTok () ) ;
    public final EObject ruleUnqualOp_TimesTok() throws RecognitionException {
        EObject current = null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3589:28: ( ( ruleTimesTok () ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3590:1: ( ruleTimesTok () )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3590:1: ( ruleTimesTok () )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3591:5: ruleTimesTok ()
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getUnqualOp_TimesTokAccess().getTimesTokParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleTimesTok_in_ruleUnqualOp_TimesTok9668);
            ruleTimesTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3598:1: ()
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3599:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getUnqualOp_TimesTokAccess().getTimesTokAction_1(),
                          current);
                  
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleUnqualOp_TimesTok"


    // $ANTLR start "entryRuleUnqualOp_PowerTok"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3615:1: entryRuleUnqualOp_PowerTok returns [EObject current=null] : iv_ruleUnqualOp_PowerTok= ruleUnqualOp_PowerTok EOF ;
    public final EObject entryRuleUnqualOp_PowerTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnqualOp_PowerTok = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3619:2: (iv_ruleUnqualOp_PowerTok= ruleUnqualOp_PowerTok EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3620:2: iv_ruleUnqualOp_PowerTok= ruleUnqualOp_PowerTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnqualOp_PowerTokRule()); 
            }
            pushFollow(FOLLOW_ruleUnqualOp_PowerTok_in_entryRuleUnqualOp_PowerTok9722);
            iv_ruleUnqualOp_PowerTok=ruleUnqualOp_PowerTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnqualOp_PowerTok; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnqualOp_PowerTok9732); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleUnqualOp_PowerTok"


    // $ANTLR start "ruleUnqualOp_PowerTok"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3630:1: ruleUnqualOp_PowerTok returns [EObject current=null] : ( rulePowerTok () ) ;
    public final EObject ruleUnqualOp_PowerTok() throws RecognitionException {
        EObject current = null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3634:28: ( ( rulePowerTok () ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3635:1: ( rulePowerTok () )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3635:1: ( rulePowerTok () )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3636:5: rulePowerTok ()
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getUnqualOp_PowerTokAccess().getPowerTokParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_rulePowerTok_in_ruleUnqualOp_PowerTok9777);
            rulePowerTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3643:1: ()
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3644:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getUnqualOp_PowerTokAccess().getPowerTokAction_1(),
                          current);
                  
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleUnqualOp_PowerTok"


    // $ANTLR start "entryRuleQualOp_ArrowTok"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3660:1: entryRuleQualOp_ArrowTok returns [EObject current=null] : iv_ruleQualOp_ArrowTok= ruleQualOp_ArrowTok EOF ;
    public final EObject entryRuleQualOp_ArrowTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualOp_ArrowTok = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3664:2: (iv_ruleQualOp_ArrowTok= ruleQualOp_ArrowTok EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3665:2: iv_ruleQualOp_ArrowTok= ruleQualOp_ArrowTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualOp_ArrowTokRule()); 
            }
            pushFollow(FOLLOW_ruleQualOp_ArrowTok_in_entryRuleQualOp_ArrowTok9831);
            iv_ruleQualOp_ArrowTok=ruleQualOp_ArrowTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualOp_ArrowTok; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualOp_ArrowTok9841); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleQualOp_ArrowTok"


    // $ANTLR start "ruleQualOp_ArrowTok"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3675:1: ruleQualOp_ArrowTok returns [EObject current=null] : ( ruleArrowTok | ( ruleArrowTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail ) ) ;
    public final EObject ruleQualOp_ArrowTok() throws RecognitionException {
        EObject current = null;

        Token this_KW_DOLLAR_2=null;
        EObject this_OpQualTail_3 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3679:28: ( ( ruleArrowTok | ( ruleArrowTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail ) ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3680:1: ( ruleArrowTok | ( ruleArrowTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail ) )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3680:1: ( ruleArrowTok | ( ruleArrowTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail ) )
            int alt43=2;
            switch ( input.LA(1) ) {
            case RULE_KW_RARROW:
                {
                int LA43_1 = input.LA(2);

                if ( (LA43_1==EOF) ) {
                    alt43=1;
                }
                else if ( (LA43_1==RULE_KW_DOLLAR) ) {
                    alt43=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 43, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_KW_LARROW:
                {
                int LA43_2 = input.LA(2);

                if ( (LA43_2==RULE_KW_DOLLAR) ) {
                    alt43=2;
                }
                else if ( (LA43_2==EOF) ) {
                    alt43=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 43, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_KW_MAPSTAR:
                {
                int LA43_3 = input.LA(2);

                if ( (LA43_3==EOF) ) {
                    alt43=1;
                }
                else if ( (LA43_3==RULE_KW_DOLLAR) ) {
                    alt43=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 43, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3681:5: ruleArrowTok
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQualOp_ArrowTokAccess().getArrowTokParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleArrowTok_in_ruleQualOp_ArrowTok9886);
                    ruleArrowTok();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3689:6: ( ruleArrowTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3689:6: ( ruleArrowTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3690:5: ruleArrowTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQualOp_ArrowTokAccess().getArrowTokParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleArrowTok_in_ruleQualOp_ArrowTok9908);
                    ruleArrowTok();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    this_KW_DOLLAR_2=(Token)match(input,RULE_KW_DOLLAR,FOLLOW_RULE_KW_DOLLAR_in_ruleQualOp_ArrowTok9918); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_DOLLAR_2, grammarAccess.getQualOp_ArrowTokAccess().getKW_DOLLARTerminalRuleCall_1_1()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQualOp_ArrowTokAccess().getOpQualTailParserRuleCall_1_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOpQualTail_in_ruleQualOp_ArrowTok9939);
                    this_OpQualTail_3=ruleOpQualTail();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_OpQualTail_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleQualOp_ArrowTok"


    // $ANTLR start "entryRuleQualOp_LatticeTok"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3721:1: entryRuleQualOp_LatticeTok returns [EObject current=null] : iv_ruleQualOp_LatticeTok= ruleQualOp_LatticeTok EOF ;
    public final EObject entryRuleQualOp_LatticeTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualOp_LatticeTok = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3725:2: (iv_ruleQualOp_LatticeTok= ruleQualOp_LatticeTok EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3726:2: iv_ruleQualOp_LatticeTok= ruleQualOp_LatticeTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualOp_LatticeTokRule()); 
            }
            pushFollow(FOLLOW_ruleQualOp_LatticeTok_in_entryRuleQualOp_LatticeTok9985);
            iv_ruleQualOp_LatticeTok=ruleQualOp_LatticeTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualOp_LatticeTok; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualOp_LatticeTok9995); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleQualOp_LatticeTok"


    // $ANTLR start "ruleQualOp_LatticeTok"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3736:1: ruleQualOp_LatticeTok returns [EObject current=null] : ( ruleLatticeTok | ( ruleLatticeTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail ) ) ;
    public final EObject ruleQualOp_LatticeTok() throws RecognitionException {
        EObject current = null;

        Token this_KW_DOLLAR_2=null;
        EObject this_OpQualTail_3 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3740:28: ( ( ruleLatticeTok | ( ruleLatticeTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail ) ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3741:1: ( ruleLatticeTok | ( ruleLatticeTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail ) )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3741:1: ( ruleLatticeTok | ( ruleLatticeTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail ) )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_KW_VEE) ) {
                int LA44_1 = input.LA(2);

                if ( (LA44_1==EOF) ) {
                    alt44=1;
                }
                else if ( (LA44_1==RULE_KW_DOLLAR) ) {
                    alt44=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 44, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA44_0==RULE_KW_WEDGE) ) {
                int LA44_2 = input.LA(2);

                if ( (LA44_2==RULE_KW_DOLLAR) ) {
                    alt44=2;
                }
                else if ( (LA44_2==EOF) ) {
                    alt44=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 44, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3742:5: ruleLatticeTok
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQualOp_LatticeTokAccess().getLatticeTokParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLatticeTok_in_ruleQualOp_LatticeTok10040);
                    ruleLatticeTok();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3750:6: ( ruleLatticeTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3750:6: ( ruleLatticeTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3751:5: ruleLatticeTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQualOp_LatticeTokAccess().getLatticeTokParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLatticeTok_in_ruleQualOp_LatticeTok10062);
                    ruleLatticeTok();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    this_KW_DOLLAR_2=(Token)match(input,RULE_KW_DOLLAR,FOLLOW_RULE_KW_DOLLAR_in_ruleQualOp_LatticeTok10072); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_DOLLAR_2, grammarAccess.getQualOp_LatticeTokAccess().getKW_DOLLARTerminalRuleCall_1_1()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQualOp_LatticeTokAccess().getOpQualTailParserRuleCall_1_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOpQualTail_in_ruleQualOp_LatticeTok10093);
                    this_OpQualTail_3=ruleOpQualTail();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_OpQualTail_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleQualOp_LatticeTok"


    // $ANTLR start "entryRuleQualOp_RelationTok"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3782:1: entryRuleQualOp_RelationTok returns [EObject current=null] : iv_ruleQualOp_RelationTok= ruleQualOp_RelationTok EOF ;
    public final EObject entryRuleQualOp_RelationTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualOp_RelationTok = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3786:2: (iv_ruleQualOp_RelationTok= ruleQualOp_RelationTok EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3787:2: iv_ruleQualOp_RelationTok= ruleQualOp_RelationTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualOp_RelationTokRule()); 
            }
            pushFollow(FOLLOW_ruleQualOp_RelationTok_in_entryRuleQualOp_RelationTok10139);
            iv_ruleQualOp_RelationTok=ruleQualOp_RelationTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualOp_RelationTok; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualOp_RelationTok10149); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleQualOp_RelationTok"


    // $ANTLR start "ruleQualOp_RelationTok"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3797:1: ruleQualOp_RelationTok returns [EObject current=null] : ( ruleRelationTok | ( ruleRelationTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail ) ) ;
    public final EObject ruleQualOp_RelationTok() throws RecognitionException {
        EObject current = null;

        Token this_KW_DOLLAR_2=null;
        EObject this_OpQualTail_3 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3801:28: ( ( ruleRelationTok | ( ruleRelationTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail ) ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3802:1: ( ruleRelationTok | ( ruleRelationTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail ) )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3802:1: ( ruleRelationTok | ( ruleRelationTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail ) )
            int alt45=2;
            alt45 = dfa45.predict(input);
            switch (alt45) {
                case 1 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3803:5: ruleRelationTok
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQualOp_RelationTokAccess().getRelationTokParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRelationTok_in_ruleQualOp_RelationTok10194);
                    ruleRelationTok();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3811:6: ( ruleRelationTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3811:6: ( ruleRelationTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3812:5: ruleRelationTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQualOp_RelationTokAccess().getRelationTokParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRelationTok_in_ruleQualOp_RelationTok10216);
                    ruleRelationTok();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    this_KW_DOLLAR_2=(Token)match(input,RULE_KW_DOLLAR,FOLLOW_RULE_KW_DOLLAR_in_ruleQualOp_RelationTok10226); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_DOLLAR_2, grammarAccess.getQualOp_RelationTokAccess().getKW_DOLLARTerminalRuleCall_1_1()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQualOp_RelationTokAccess().getOpQualTailParserRuleCall_1_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOpQualTail_in_ruleQualOp_RelationTok10247);
                    this_OpQualTail_3=ruleOpQualTail();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_OpQualTail_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleQualOp_RelationTok"


    // $ANTLR start "entryRuleQualOp_SegTok"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3843:1: entryRuleQualOp_SegTok returns [EObject current=null] : iv_ruleQualOp_SegTok= ruleQualOp_SegTok EOF ;
    public final EObject entryRuleQualOp_SegTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualOp_SegTok = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3847:2: (iv_ruleQualOp_SegTok= ruleQualOp_SegTok EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3848:2: iv_ruleQualOp_SegTok= ruleQualOp_SegTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualOp_SegTokRule()); 
            }
            pushFollow(FOLLOW_ruleQualOp_SegTok_in_entryRuleQualOp_SegTok10293);
            iv_ruleQualOp_SegTok=ruleQualOp_SegTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualOp_SegTok; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualOp_SegTok10303); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleQualOp_SegTok"


    // $ANTLR start "ruleQualOp_SegTok"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3858:1: ruleQualOp_SegTok returns [EObject current=null] : ( ruleSegTok | ( ruleSegTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail ) ) ;
    public final EObject ruleQualOp_SegTok() throws RecognitionException {
        EObject current = null;

        Token this_KW_DOLLAR_2=null;
        EObject this_OpQualTail_3 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3862:28: ( ( ruleSegTok | ( ruleSegTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail ) ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3863:1: ( ruleSegTok | ( ruleSegTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail ) )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3863:1: ( ruleSegTok | ( ruleSegTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail ) )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_KW_2DOT) ) {
                int LA46_1 = input.LA(2);

                if ( (LA46_1==RULE_KW_DOLLAR) ) {
                    alt46=2;
                }
                else if ( (LA46_1==EOF) ) {
                    alt46=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 46, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA46_0==93) ) {
                int LA46_2 = input.LA(2);

                if ( (LA46_2==EOF) ) {
                    alt46=1;
                }
                else if ( (LA46_2==RULE_KW_DOLLAR) ) {
                    alt46=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 46, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3864:5: ruleSegTok
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQualOp_SegTokAccess().getSegTokParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSegTok_in_ruleQualOp_SegTok10348);
                    ruleSegTok();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3872:6: ( ruleSegTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3872:6: ( ruleSegTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3873:5: ruleSegTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQualOp_SegTokAccess().getSegTokParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSegTok_in_ruleQualOp_SegTok10370);
                    ruleSegTok();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    this_KW_DOLLAR_2=(Token)match(input,RULE_KW_DOLLAR,FOLLOW_RULE_KW_DOLLAR_in_ruleQualOp_SegTok10380); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_DOLLAR_2, grammarAccess.getQualOp_SegTokAccess().getKW_DOLLARTerminalRuleCall_1_1()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQualOp_SegTokAccess().getOpQualTailParserRuleCall_1_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOpQualTail_in_ruleQualOp_SegTok10401);
                    this_OpQualTail_3=ruleOpQualTail();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_OpQualTail_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleQualOp_SegTok"


    // $ANTLR start "entryRuleQualOp_PlusTok"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3904:1: entryRuleQualOp_PlusTok returns [EObject current=null] : iv_ruleQualOp_PlusTok= ruleQualOp_PlusTok EOF ;
    public final EObject entryRuleQualOp_PlusTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualOp_PlusTok = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3908:2: (iv_ruleQualOp_PlusTok= ruleQualOp_PlusTok EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3909:2: iv_ruleQualOp_PlusTok= ruleQualOp_PlusTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualOp_PlusTokRule()); 
            }
            pushFollow(FOLLOW_ruleQualOp_PlusTok_in_entryRuleQualOp_PlusTok10447);
            iv_ruleQualOp_PlusTok=ruleQualOp_PlusTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualOp_PlusTok; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualOp_PlusTok10457); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleQualOp_PlusTok"


    // $ANTLR start "ruleQualOp_PlusTok"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3919:1: ruleQualOp_PlusTok returns [EObject current=null] : ( rulePlusTok | ( rulePlusTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail ) ) ;
    public final EObject ruleQualOp_PlusTok() throws RecognitionException {
        EObject current = null;

        Token this_KW_DOLLAR_2=null;
        EObject this_OpQualTail_3 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3923:28: ( ( rulePlusTok | ( rulePlusTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail ) ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3924:1: ( rulePlusTok | ( rulePlusTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail ) )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3924:1: ( rulePlusTok | ( rulePlusTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail ) )
            int alt47=2;
            switch ( input.LA(1) ) {
            case RULE_KW_PLUS:
                {
                int LA47_1 = input.LA(2);

                if ( (LA47_1==EOF) ) {
                    alt47=1;
                }
                else if ( (LA47_1==RULE_KW_DOLLAR) ) {
                    alt47=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 47, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_KW_MINUS:
                {
                int LA47_2 = input.LA(2);

                if ( (LA47_2==RULE_KW_DOLLAR) ) {
                    alt47=2;
                }
                else if ( (LA47_2==EOF) ) {
                    alt47=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 47, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_KW_PLUSMINUS:
                {
                int LA47_3 = input.LA(2);

                if ( (LA47_3==EOF) ) {
                    alt47=1;
                }
                else if ( (LA47_3==RULE_KW_DOLLAR) ) {
                    alt47=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 47, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3925:5: rulePlusTok
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQualOp_PlusTokAccess().getPlusTokParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePlusTok_in_ruleQualOp_PlusTok10502);
                    rulePlusTok();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3933:6: ( rulePlusTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3933:6: ( rulePlusTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3934:5: rulePlusTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQualOp_PlusTokAccess().getPlusTokParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePlusTok_in_ruleQualOp_PlusTok10524);
                    rulePlusTok();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    this_KW_DOLLAR_2=(Token)match(input,RULE_KW_DOLLAR,FOLLOW_RULE_KW_DOLLAR_in_ruleQualOp_PlusTok10534); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_DOLLAR_2, grammarAccess.getQualOp_PlusTokAccess().getKW_DOLLARTerminalRuleCall_1_1()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQualOp_PlusTokAccess().getOpQualTailParserRuleCall_1_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOpQualTail_in_ruleQualOp_PlusTok10555);
                    this_OpQualTail_3=ruleOpQualTail();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_OpQualTail_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleQualOp_PlusTok"


    // $ANTLR start "entryRuleQualOp_QuotientTok"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3965:1: entryRuleQualOp_QuotientTok returns [EObject current=null] : iv_ruleQualOp_QuotientTok= ruleQualOp_QuotientTok EOF ;
    public final EObject entryRuleQualOp_QuotientTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualOp_QuotientTok = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3969:2: (iv_ruleQualOp_QuotientTok= ruleQualOp_QuotientTok EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3970:2: iv_ruleQualOp_QuotientTok= ruleQualOp_QuotientTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualOp_QuotientTokRule()); 
            }
            pushFollow(FOLLOW_ruleQualOp_QuotientTok_in_entryRuleQualOp_QuotientTok10601);
            iv_ruleQualOp_QuotientTok=ruleQualOp_QuotientTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualOp_QuotientTok; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualOp_QuotientTok10611); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleQualOp_QuotientTok"


    // $ANTLR start "ruleQualOp_QuotientTok"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3980:1: ruleQualOp_QuotientTok returns [EObject current=null] : ( ruleQuotientTok | ( ruleQuotientTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail ) ) ;
    public final EObject ruleQualOp_QuotientTok() throws RecognitionException {
        EObject current = null;

        Token this_KW_DOLLAR_2=null;
        EObject this_OpQualTail_3 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3984:28: ( ( ruleQuotientTok | ( ruleQuotientTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail ) ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3985:1: ( ruleQuotientTok | ( ruleQuotientTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail ) )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3985:1: ( ruleQuotientTok | ( ruleQuotientTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail ) )
            int alt48=2;
            switch ( input.LA(1) ) {
            case 94:
                {
                int LA48_1 = input.LA(2);

                if ( (LA48_1==RULE_KW_DOLLAR) ) {
                    alt48=2;
                }
                else if ( (LA48_1==EOF) ) {
                    alt48=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 48, 1, input);

                    throw nvae;
                }
                }
                break;
            case 95:
                {
                int LA48_2 = input.LA(2);

                if ( (LA48_2==RULE_KW_DOLLAR) ) {
                    alt48=2;
                }
                else if ( (LA48_2==EOF) ) {
                    alt48=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 48, 2, input);

                    throw nvae;
                }
                }
                break;
            case 96:
                {
                int LA48_3 = input.LA(2);

                if ( (LA48_3==RULE_KW_DOLLAR) ) {
                    alt48=2;
                }
                else if ( (LA48_3==EOF) ) {
                    alt48=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 48, 3, input);

                    throw nvae;
                }
                }
                break;
            case 97:
                {
                int LA48_4 = input.LA(2);

                if ( (LA48_4==EOF) ) {
                    alt48=1;
                }
                else if ( (LA48_4==RULE_KW_DOLLAR) ) {
                    alt48=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 48, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3986:5: ruleQuotientTok
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQualOp_QuotientTokAccess().getQuotientTokParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleQuotientTok_in_ruleQualOp_QuotientTok10656);
                    ruleQuotientTok();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3994:6: ( ruleQuotientTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3994:6: ( ruleQuotientTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3995:5: ruleQuotientTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQualOp_QuotientTokAccess().getQuotientTokParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleQuotientTok_in_ruleQualOp_QuotientTok10678);
                    ruleQuotientTok();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    this_KW_DOLLAR_2=(Token)match(input,RULE_KW_DOLLAR,FOLLOW_RULE_KW_DOLLAR_in_ruleQualOp_QuotientTok10688); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_DOLLAR_2, grammarAccess.getQualOp_QuotientTokAccess().getKW_DOLLARTerminalRuleCall_1_1()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQualOp_QuotientTokAccess().getOpQualTailParserRuleCall_1_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOpQualTail_in_ruleQualOp_QuotientTok10709);
                    this_OpQualTail_3=ruleOpQualTail();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_OpQualTail_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleQualOp_QuotientTok"


    // $ANTLR start "entryRuleQualOp_TimesTok"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4026:1: entryRuleQualOp_TimesTok returns [EObject current=null] : iv_ruleQualOp_TimesTok= ruleQualOp_TimesTok EOF ;
    public final EObject entryRuleQualOp_TimesTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualOp_TimesTok = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4030:2: (iv_ruleQualOp_TimesTok= ruleQualOp_TimesTok EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4031:2: iv_ruleQualOp_TimesTok= ruleQualOp_TimesTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualOp_TimesTokRule()); 
            }
            pushFollow(FOLLOW_ruleQualOp_TimesTok_in_entryRuleQualOp_TimesTok10755);
            iv_ruleQualOp_TimesTok=ruleQualOp_TimesTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualOp_TimesTok; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualOp_TimesTok10765); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleQualOp_TimesTok"


    // $ANTLR start "ruleQualOp_TimesTok"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4041:1: ruleQualOp_TimesTok returns [EObject current=null] : ( ruleTimesTok | ( ruleTimesTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail ) ) ;
    public final EObject ruleQualOp_TimesTok() throws RecognitionException {
        EObject current = null;

        Token this_KW_DOLLAR_2=null;
        EObject this_OpQualTail_3 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4045:28: ( ( ruleTimesTok | ( ruleTimesTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail ) ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4046:1: ( ruleTimesTok | ( ruleTimesTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail ) )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4046:1: ( ruleTimesTok | ( ruleTimesTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail ) )
            int alt49=2;
            switch ( input.LA(1) ) {
            case RULE_KW_STAR:
                {
                int LA49_1 = input.LA(2);

                if ( (LA49_1==RULE_KW_DOLLAR) ) {
                    alt49=2;
                }
                else if ( (LA49_1==EOF) ) {
                    alt49=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 49, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_KW_SLASH:
                {
                int LA49_2 = input.LA(2);

                if ( (LA49_2==EOF) ) {
                    alt49=1;
                }
                else if ( (LA49_2==RULE_KW_DOLLAR) ) {
                    alt49=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 49, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_KW_BACKSLASH:
                {
                int LA49_3 = input.LA(2);

                if ( (LA49_3==RULE_KW_DOLLAR) ) {
                    alt49=2;
                }
                else if ( (LA49_3==EOF) ) {
                    alt49=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 49, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4047:5: ruleTimesTok
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQualOp_TimesTokAccess().getTimesTokParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTimesTok_in_ruleQualOp_TimesTok10810);
                    ruleTimesTok();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4055:6: ( ruleTimesTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4055:6: ( ruleTimesTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4056:5: ruleTimesTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQualOp_TimesTokAccess().getTimesTokParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTimesTok_in_ruleQualOp_TimesTok10832);
                    ruleTimesTok();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    this_KW_DOLLAR_2=(Token)match(input,RULE_KW_DOLLAR,FOLLOW_RULE_KW_DOLLAR_in_ruleQualOp_TimesTok10842); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_DOLLAR_2, grammarAccess.getQualOp_TimesTokAccess().getKW_DOLLARTerminalRuleCall_1_1()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQualOp_TimesTokAccess().getOpQualTailParserRuleCall_1_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOpQualTail_in_ruleQualOp_TimesTok10863);
                    this_OpQualTail_3=ruleOpQualTail();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_OpQualTail_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleQualOp_TimesTok"


    // $ANTLR start "entryRuleQualOp_PowerTok"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4087:1: entryRuleQualOp_PowerTok returns [EObject current=null] : iv_ruleQualOp_PowerTok= ruleQualOp_PowerTok EOF ;
    public final EObject entryRuleQualOp_PowerTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualOp_PowerTok = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4091:2: (iv_ruleQualOp_PowerTok= ruleQualOp_PowerTok EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4092:2: iv_ruleQualOp_PowerTok= ruleQualOp_PowerTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualOp_PowerTokRule()); 
            }
            pushFollow(FOLLOW_ruleQualOp_PowerTok_in_entryRuleQualOp_PowerTok10909);
            iv_ruleQualOp_PowerTok=ruleQualOp_PowerTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualOp_PowerTok; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualOp_PowerTok10919); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleQualOp_PowerTok"


    // $ANTLR start "ruleQualOp_PowerTok"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4102:1: ruleQualOp_PowerTok returns [EObject current=null] : ( rulePowerTok | ( rulePowerTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail ) ) ;
    public final EObject ruleQualOp_PowerTok() throws RecognitionException {
        EObject current = null;

        Token this_KW_DOLLAR_2=null;
        EObject this_OpQualTail_3 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4106:28: ( ( rulePowerTok | ( rulePowerTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail ) ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4107:1: ( rulePowerTok | ( rulePowerTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail ) )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4107:1: ( rulePowerTok | ( rulePowerTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_KW_2STAR) ) {
                int LA50_1 = input.LA(2);

                if ( (LA50_1==RULE_KW_DOLLAR) ) {
                    alt50=2;
                }
                else if ( (LA50_1==EOF) ) {
                    alt50=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 50, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA50_0==RULE_KW_HAT) ) {
                int LA50_2 = input.LA(2);

                if ( (LA50_2==EOF) ) {
                    alt50=1;
                }
                else if ( (LA50_2==RULE_KW_DOLLAR) ) {
                    alt50=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 50, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4108:5: rulePowerTok
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQualOp_PowerTokAccess().getPowerTokParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePowerTok_in_ruleQualOp_PowerTok10964);
                    rulePowerTok();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4116:6: ( rulePowerTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4116:6: ( rulePowerTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4117:5: rulePowerTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQualOp_PowerTokAccess().getPowerTokParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePowerTok_in_ruleQualOp_PowerTok10986);
                    rulePowerTok();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    this_KW_DOLLAR_2=(Token)match(input,RULE_KW_DOLLAR,FOLLOW_RULE_KW_DOLLAR_in_ruleQualOp_PowerTok10996); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_DOLLAR_2, grammarAccess.getQualOp_PowerTokAccess().getKW_DOLLARTerminalRuleCall_1_1()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQualOp_PowerTokAccess().getOpQualTailParserRuleCall_1_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOpQualTail_in_ruleQualOp_PowerTok11017);
                    this_OpQualTail_3=ruleOpQualTail();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_OpQualTail_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleQualOp_PowerTok"


    // $ANTLR start "entryRulePreDocumentList"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4152:1: entryRulePreDocumentList returns [String current=null] : iv_rulePreDocumentList= rulePreDocumentList EOF ;
    public final String entryRulePreDocumentList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePreDocumentList = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4156:2: (iv_rulePreDocumentList= rulePreDocumentList EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4157:2: iv_rulePreDocumentList= rulePreDocumentList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPreDocumentListRule()); 
            }
            pushFollow(FOLLOW_rulePreDocumentList_in_entryRulePreDocumentList11068);
            iv_rulePreDocumentList=rulePreDocumentList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePreDocumentList.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePreDocumentList11079); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRulePreDocumentList"


    // $ANTLR start "rulePreDocumentList"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4167:1: rulePreDocumentList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TK_PREDOC_0= RULE_TK_PREDOC this_PreDocumentList_1= rulePreDocumentList )? ;
    public final AntlrDatatypeRuleToken rulePreDocumentList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_TK_PREDOC_0=null;
        AntlrDatatypeRuleToken this_PreDocumentList_1 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4171:28: ( (this_TK_PREDOC_0= RULE_TK_PREDOC this_PreDocumentList_1= rulePreDocumentList )? )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4172:1: (this_TK_PREDOC_0= RULE_TK_PREDOC this_PreDocumentList_1= rulePreDocumentList )?
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4172:1: (this_TK_PREDOC_0= RULE_TK_PREDOC this_PreDocumentList_1= rulePreDocumentList )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_TK_PREDOC) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4172:6: this_TK_PREDOC_0= RULE_TK_PREDOC this_PreDocumentList_1= rulePreDocumentList
                    {
                    this_TK_PREDOC_0=(Token)match(input,RULE_TK_PREDOC,FOLLOW_RULE_TK_PREDOC_in_rulePreDocumentList11123); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_TK_PREDOC_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_TK_PREDOC_0, grammarAccess.getPreDocumentListAccess().getTK_PREDOCTerminalRuleCall_0()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPreDocumentListAccess().getPreDocumentListParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_rulePreDocumentList_in_rulePreDocumentList11150);
                    this_PreDocumentList_1=rulePreDocumentList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_PreDocumentList_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "rulePreDocumentList"


    // $ANTLR start "entryRulePostDocumentList"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4201:1: entryRulePostDocumentList returns [String current=null] : iv_rulePostDocumentList= rulePostDocumentList EOF ;
    public final String entryRulePostDocumentList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePostDocumentList = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4205:2: (iv_rulePostDocumentList= rulePostDocumentList EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4206:2: iv_rulePostDocumentList= rulePostDocumentList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPostDocumentListRule()); 
            }
            pushFollow(FOLLOW_rulePostDocumentList_in_entryRulePostDocumentList11207);
            iv_rulePostDocumentList=rulePostDocumentList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePostDocumentList.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePostDocumentList11218); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRulePostDocumentList"


    // $ANTLR start "rulePostDocumentList"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4216:1: rulePostDocumentList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TK_POSTDOC_0= RULE_TK_POSTDOC this_PostDocumentList_1= rulePostDocumentList )? ;
    public final AntlrDatatypeRuleToken rulePostDocumentList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_TK_POSTDOC_0=null;
        AntlrDatatypeRuleToken this_PostDocumentList_1 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4220:28: ( (this_TK_POSTDOC_0= RULE_TK_POSTDOC this_PostDocumentList_1= rulePostDocumentList )? )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4221:1: (this_TK_POSTDOC_0= RULE_TK_POSTDOC this_PostDocumentList_1= rulePostDocumentList )?
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4221:1: (this_TK_POSTDOC_0= RULE_TK_POSTDOC this_PostDocumentList_1= rulePostDocumentList )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_TK_POSTDOC) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4221:6: this_TK_POSTDOC_0= RULE_TK_POSTDOC this_PostDocumentList_1= rulePostDocumentList
                    {
                    this_TK_POSTDOC_0=(Token)match(input,RULE_TK_POSTDOC,FOLLOW_RULE_TK_POSTDOC_in_rulePostDocumentList11262); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_TK_POSTDOC_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_TK_POSTDOC_0, grammarAccess.getPostDocumentListAccess().getTK_POSTDOCTerminalRuleCall_0()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPostDocumentListAccess().getPostDocumentListParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_rulePostDocumentList_in_rulePostDocumentList11289);
                    this_PostDocumentList_1=rulePostDocumentList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_PostDocumentList_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "rulePostDocumentList"


    // $ANTLR start "entryRuleenlist1_CommaItem_Comma_AB"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4250:1: entryRuleenlist1_CommaItem_Comma_AB returns [String current=null] : iv_ruleenlist1_CommaItem_Comma_AB= ruleenlist1_CommaItem_Comma_AB EOF ;
    public final String entryRuleenlist1_CommaItem_Comma_AB() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleenlist1_CommaItem_Comma_AB = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4254:2: (iv_ruleenlist1_CommaItem_Comma_AB= ruleenlist1_CommaItem_Comma_AB EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4255:2: iv_ruleenlist1_CommaItem_Comma_AB= ruleenlist1_CommaItem_Comma_AB EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnlist1_CommaItem_Comma_ABRule()); 
            }
            pushFollow(FOLLOW_ruleenlist1_CommaItem_Comma_AB_in_entryRuleenlist1_CommaItem_Comma_AB11346);
            iv_ruleenlist1_CommaItem_Comma_AB=ruleenlist1_CommaItem_Comma_AB();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleenlist1_CommaItem_Comma_AB.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleenlist1_CommaItem_Comma_AB11357); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleenlist1_CommaItem_Comma_AB"


    // $ANTLR start "ruleenlist1_CommaItem_Comma_AB"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4265:1: ruleenlist1_CommaItem_Comma_AB returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_enlister1_CommaItem_Comma_0= ruleenlister1_CommaItem_Comma ;
    public final AntlrDatatypeRuleToken ruleenlist1_CommaItem_Comma_AB() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_enlister1_CommaItem_Comma_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4269:28: (this_enlister1_CommaItem_Comma_0= ruleenlister1_CommaItem_Comma )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4271:5: this_enlister1_CommaItem_Comma_0= ruleenlister1_CommaItem_Comma
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getEnlist1_CommaItem_Comma_ABAccess().getEnlister1_CommaItem_CommaParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleenlister1_CommaItem_Comma_in_ruleenlist1_CommaItem_Comma_AB11407);
            this_enlister1_CommaItem_Comma_0=ruleenlister1_CommaItem_Comma();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_enlister1_CommaItem_Comma_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleenlist1_CommaItem_Comma_AB"


    // $ANTLR start "entryRuleenlist1_Infixed_Comma_AB"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4292:1: entryRuleenlist1_Infixed_Comma_AB returns [String current=null] : iv_ruleenlist1_Infixed_Comma_AB= ruleenlist1_Infixed_Comma_AB EOF ;
    public final String entryRuleenlist1_Infixed_Comma_AB() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleenlist1_Infixed_Comma_AB = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4296:2: (iv_ruleenlist1_Infixed_Comma_AB= ruleenlist1_Infixed_Comma_AB EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4297:2: iv_ruleenlist1_Infixed_Comma_AB= ruleenlist1_Infixed_Comma_AB EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnlist1_Infixed_Comma_ABRule()); 
            }
            pushFollow(FOLLOW_ruleenlist1_Infixed_Comma_AB_in_entryRuleenlist1_Infixed_Comma_AB11462);
            iv_ruleenlist1_Infixed_Comma_AB=ruleenlist1_Infixed_Comma_AB();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleenlist1_Infixed_Comma_AB.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleenlist1_Infixed_Comma_AB11473); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleenlist1_Infixed_Comma_AB"


    // $ANTLR start "ruleenlist1_Infixed_Comma_AB"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4307:1: ruleenlist1_Infixed_Comma_AB returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_enlister1_Infixed_Comma_0= ruleenlister1_Infixed_Comma ;
    public final AntlrDatatypeRuleToken ruleenlist1_Infixed_Comma_AB() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_enlister1_Infixed_Comma_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4311:28: (this_enlister1_Infixed_Comma_0= ruleenlister1_Infixed_Comma )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4313:5: this_enlister1_Infixed_Comma_0= ruleenlister1_Infixed_Comma
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getEnlist1_Infixed_Comma_ABAccess().getEnlister1_Infixed_CommaParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleenlister1_Infixed_Comma_in_ruleenlist1_Infixed_Comma_AB11523);
            this_enlister1_Infixed_Comma_0=ruleenlister1_Infixed_Comma();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_enlister1_Infixed_Comma_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleenlist1_Infixed_Comma_AB"


    // $ANTLR start "entryRuleenlist1_InfixedExpr_Comma_AB"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4334:1: entryRuleenlist1_InfixedExpr_Comma_AB returns [String current=null] : iv_ruleenlist1_InfixedExpr_Comma_AB= ruleenlist1_InfixedExpr_Comma_AB EOF ;
    public final String entryRuleenlist1_InfixedExpr_Comma_AB() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleenlist1_InfixedExpr_Comma_AB = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4338:2: (iv_ruleenlist1_InfixedExpr_Comma_AB= ruleenlist1_InfixedExpr_Comma_AB EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4339:2: iv_ruleenlist1_InfixedExpr_Comma_AB= ruleenlist1_InfixedExpr_Comma_AB EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnlist1_InfixedExpr_Comma_ABRule()); 
            }
            pushFollow(FOLLOW_ruleenlist1_InfixedExpr_Comma_AB_in_entryRuleenlist1_InfixedExpr_Comma_AB11578);
            iv_ruleenlist1_InfixedExpr_Comma_AB=ruleenlist1_InfixedExpr_Comma_AB();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleenlist1_InfixedExpr_Comma_AB.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleenlist1_InfixedExpr_Comma_AB11589); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleenlist1_InfixedExpr_Comma_AB"


    // $ANTLR start "ruleenlist1_InfixedExpr_Comma_AB"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4349:1: ruleenlist1_InfixedExpr_Comma_AB returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_enlister1_InfixedExpr_Comma_0= ruleenlister1_InfixedExpr_Comma ;
    public final AntlrDatatypeRuleToken ruleenlist1_InfixedExpr_Comma_AB() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_enlister1_InfixedExpr_Comma_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4353:28: (this_enlister1_InfixedExpr_Comma_0= ruleenlister1_InfixedExpr_Comma )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4355:5: this_enlister1_InfixedExpr_Comma_0= ruleenlister1_InfixedExpr_Comma
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getEnlist1_InfixedExpr_Comma_ABAccess().getEnlister1_InfixedExpr_CommaParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleenlister1_InfixedExpr_Comma_in_ruleenlist1_InfixedExpr_Comma_AB11639);
            this_enlister1_InfixedExpr_Comma_0=ruleenlister1_InfixedExpr_Comma();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_enlister1_InfixedExpr_Comma_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleenlist1_InfixedExpr_Comma_AB"


    // $ANTLR start "entryRuleenlister1_CommaItem_Comma"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4376:1: entryRuleenlister1_CommaItem_Comma returns [String current=null] : iv_ruleenlister1_CommaItem_Comma= ruleenlister1_CommaItem_Comma EOF ;
    public final String entryRuleenlister1_CommaItem_Comma() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleenlister1_CommaItem_Comma = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4380:2: (iv_ruleenlister1_CommaItem_Comma= ruleenlister1_CommaItem_Comma EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4381:2: iv_ruleenlister1_CommaItem_Comma= ruleenlister1_CommaItem_Comma EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnlister1_CommaItem_CommaRule()); 
            }
            pushFollow(FOLLOW_ruleenlister1_CommaItem_Comma_in_entryRuleenlister1_CommaItem_Comma11694);
            iv_ruleenlister1_CommaItem_Comma=ruleenlister1_CommaItem_Comma();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleenlister1_CommaItem_Comma.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleenlister1_CommaItem_Comma11705); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleenlister1_CommaItem_Comma"


    // $ANTLR start "ruleenlister1_CommaItem_Comma"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4391:1: ruleenlister1_CommaItem_Comma returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_CommaItem_0= ruleCommaItem (this_KW_COMMA_1= RULE_KW_COMMA this_CommaItem_2= ruleCommaItem )* ) ;
    public final AntlrDatatypeRuleToken ruleenlister1_CommaItem_Comma() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_KW_COMMA_1=null;
        AntlrDatatypeRuleToken this_CommaItem_0 = null;

        AntlrDatatypeRuleToken this_CommaItem_2 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4395:28: ( (this_CommaItem_0= ruleCommaItem (this_KW_COMMA_1= RULE_KW_COMMA this_CommaItem_2= ruleCommaItem )* ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4396:1: (this_CommaItem_0= ruleCommaItem (this_KW_COMMA_1= RULE_KW_COMMA this_CommaItem_2= ruleCommaItem )* )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4396:1: (this_CommaItem_0= ruleCommaItem (this_KW_COMMA_1= RULE_KW_COMMA this_CommaItem_2= ruleCommaItem )* )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4397:5: this_CommaItem_0= ruleCommaItem (this_KW_COMMA_1= RULE_KW_COMMA this_CommaItem_2= ruleCommaItem )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getEnlister1_CommaItem_CommaAccess().getCommaItemParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleCommaItem_in_ruleenlister1_CommaItem_Comma11756);
            this_CommaItem_0=ruleCommaItem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_CommaItem_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4407:1: (this_KW_COMMA_1= RULE_KW_COMMA this_CommaItem_2= ruleCommaItem )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==RULE_KW_COMMA) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4407:6: this_KW_COMMA_1= RULE_KW_COMMA this_CommaItem_2= ruleCommaItem
            	    {
            	    this_KW_COMMA_1=(Token)match(input,RULE_KW_COMMA,FOLLOW_RULE_KW_COMMA_in_ruleenlister1_CommaItem_Comma11777); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_KW_COMMA_1);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_KW_COMMA_1, grammarAccess.getEnlister1_CommaItem_CommaAccess().getKW_COMMATerminalRuleCall_1_0()); 
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getEnlister1_CommaItem_CommaAccess().getCommaItemParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleCommaItem_in_ruleenlister1_CommaItem_Comma11804);
            	    this_CommaItem_2=ruleCommaItem();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_CommaItem_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleenlister1_CommaItem_Comma"


    // $ANTLR start "entryRuleenlister1_Infixed_Comma"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4436:1: entryRuleenlister1_Infixed_Comma returns [String current=null] : iv_ruleenlister1_Infixed_Comma= ruleenlister1_Infixed_Comma EOF ;
    public final String entryRuleenlister1_Infixed_Comma() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleenlister1_Infixed_Comma = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4440:2: (iv_ruleenlister1_Infixed_Comma= ruleenlister1_Infixed_Comma EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4441:2: iv_ruleenlister1_Infixed_Comma= ruleenlister1_Infixed_Comma EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnlister1_Infixed_CommaRule()); 
            }
            pushFollow(FOLLOW_ruleenlister1_Infixed_Comma_in_entryRuleenlister1_Infixed_Comma11862);
            iv_ruleenlister1_Infixed_Comma=ruleenlister1_Infixed_Comma();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleenlister1_Infixed_Comma.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleenlister1_Infixed_Comma11873); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleenlister1_Infixed_Comma"


    // $ANTLR start "ruleenlister1_Infixed_Comma"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4451:1: ruleenlister1_Infixed_Comma returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Infixed_0= ruleInfixed (this_KW_COMMA_1= RULE_KW_COMMA this_Infixed_2= ruleInfixed )* ) ;
    public final AntlrDatatypeRuleToken ruleenlister1_Infixed_Comma() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_KW_COMMA_1=null;
        AntlrDatatypeRuleToken this_Infixed_0 = null;

        AntlrDatatypeRuleToken this_Infixed_2 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4455:28: ( (this_Infixed_0= ruleInfixed (this_KW_COMMA_1= RULE_KW_COMMA this_Infixed_2= ruleInfixed )* ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4456:1: (this_Infixed_0= ruleInfixed (this_KW_COMMA_1= RULE_KW_COMMA this_Infixed_2= ruleInfixed )* )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4456:1: (this_Infixed_0= ruleInfixed (this_KW_COMMA_1= RULE_KW_COMMA this_Infixed_2= ruleInfixed )* )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4457:5: this_Infixed_0= ruleInfixed (this_KW_COMMA_1= RULE_KW_COMMA this_Infixed_2= ruleInfixed )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getEnlister1_Infixed_CommaAccess().getInfixedParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleInfixed_in_ruleenlister1_Infixed_Comma11924);
            this_Infixed_0=ruleInfixed();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Infixed_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4467:1: (this_KW_COMMA_1= RULE_KW_COMMA this_Infixed_2= ruleInfixed )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==RULE_KW_COMMA) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4467:6: this_KW_COMMA_1= RULE_KW_COMMA this_Infixed_2= ruleInfixed
            	    {
            	    this_KW_COMMA_1=(Token)match(input,RULE_KW_COMMA,FOLLOW_RULE_KW_COMMA_in_ruleenlister1_Infixed_Comma11945); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_KW_COMMA_1);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_KW_COMMA_1, grammarAccess.getEnlister1_Infixed_CommaAccess().getKW_COMMATerminalRuleCall_1_0()); 
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getEnlister1_Infixed_CommaAccess().getInfixedParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleInfixed_in_ruleenlister1_Infixed_Comma11972);
            	    this_Infixed_2=ruleInfixed();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_Infixed_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleenlister1_Infixed_Comma"


    // $ANTLR start "entryRuleenlister1_InfixedExpr_Comma"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4496:1: entryRuleenlister1_InfixedExpr_Comma returns [String current=null] : iv_ruleenlister1_InfixedExpr_Comma= ruleenlister1_InfixedExpr_Comma EOF ;
    public final String entryRuleenlister1_InfixedExpr_Comma() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleenlister1_InfixedExpr_Comma = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4500:2: (iv_ruleenlister1_InfixedExpr_Comma= ruleenlister1_InfixedExpr_Comma EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4501:2: iv_ruleenlister1_InfixedExpr_Comma= ruleenlister1_InfixedExpr_Comma EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnlister1_InfixedExpr_CommaRule()); 
            }
            pushFollow(FOLLOW_ruleenlister1_InfixedExpr_Comma_in_entryRuleenlister1_InfixedExpr_Comma12030);
            iv_ruleenlister1_InfixedExpr_Comma=ruleenlister1_InfixedExpr_Comma();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleenlister1_InfixedExpr_Comma.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleenlister1_InfixedExpr_Comma12041); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleenlister1_InfixedExpr_Comma"


    // $ANTLR start "ruleenlister1_InfixedExpr_Comma"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4511:1: ruleenlister1_InfixedExpr_Comma returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_InfixedExpr_0= ruleInfixedExpr (this_KW_COMMA_1= RULE_KW_COMMA this_InfixedExpr_2= ruleInfixedExpr )* ) ;
    public final AntlrDatatypeRuleToken ruleenlister1_InfixedExpr_Comma() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_KW_COMMA_1=null;
        AntlrDatatypeRuleToken this_InfixedExpr_0 = null;

        AntlrDatatypeRuleToken this_InfixedExpr_2 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4515:28: ( (this_InfixedExpr_0= ruleInfixedExpr (this_KW_COMMA_1= RULE_KW_COMMA this_InfixedExpr_2= ruleInfixedExpr )* ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4516:1: (this_InfixedExpr_0= ruleInfixedExpr (this_KW_COMMA_1= RULE_KW_COMMA this_InfixedExpr_2= ruleInfixedExpr )* )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4516:1: (this_InfixedExpr_0= ruleInfixedExpr (this_KW_COMMA_1= RULE_KW_COMMA this_InfixedExpr_2= ruleInfixedExpr )* )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4517:5: this_InfixedExpr_0= ruleInfixedExpr (this_KW_COMMA_1= RULE_KW_COMMA this_InfixedExpr_2= ruleInfixedExpr )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getEnlister1_InfixedExpr_CommaAccess().getInfixedExprParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleInfixedExpr_in_ruleenlister1_InfixedExpr_Comma12092);
            this_InfixedExpr_0=ruleInfixedExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_InfixedExpr_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4527:1: (this_KW_COMMA_1= RULE_KW_COMMA this_InfixedExpr_2= ruleInfixedExpr )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==RULE_KW_COMMA) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4527:6: this_KW_COMMA_1= RULE_KW_COMMA this_InfixedExpr_2= ruleInfixedExpr
            	    {
            	    this_KW_COMMA_1=(Token)match(input,RULE_KW_COMMA,FOLLOW_RULE_KW_COMMA_in_ruleenlister1_InfixedExpr_Comma12113); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_KW_COMMA_1);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_KW_COMMA_1, grammarAccess.getEnlister1_InfixedExpr_CommaAccess().getKW_COMMATerminalRuleCall_1_0()); 
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getEnlister1_InfixedExpr_CommaAccess().getInfixedExprParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleInfixedExpr_in_ruleenlister1_InfixedExpr_Comma12140);
            	    this_InfixedExpr_2=ruleInfixedExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_InfixedExpr_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleenlister1_InfixedExpr_Comma"


    // $ANTLR start "entryRuleenlist1a_Labeled_Semicolon_AB"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4556:1: entryRuleenlist1a_Labeled_Semicolon_AB returns [EObject current=null] : iv_ruleenlist1a_Labeled_Semicolon_AB= ruleenlist1a_Labeled_Semicolon_AB EOF ;
    public final EObject entryRuleenlist1a_Labeled_Semicolon_AB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleenlist1a_Labeled_Semicolon_AB = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4560:2: (iv_ruleenlist1a_Labeled_Semicolon_AB= ruleenlist1a_Labeled_Semicolon_AB EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4561:2: iv_ruleenlist1a_Labeled_Semicolon_AB= ruleenlist1a_Labeled_Semicolon_AB EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnlist1a_Labeled_Semicolon_ABRule()); 
            }
            pushFollow(FOLLOW_ruleenlist1a_Labeled_Semicolon_AB_in_entryRuleenlist1a_Labeled_Semicolon_AB12197);
            iv_ruleenlist1a_Labeled_Semicolon_AB=ruleenlist1a_Labeled_Semicolon_AB();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleenlist1a_Labeled_Semicolon_AB; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleenlist1a_Labeled_Semicolon_AB12207); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleenlist1a_Labeled_Semicolon_AB"


    // $ANTLR start "ruleenlist1a_Labeled_Semicolon_AB"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4571:1: ruleenlist1a_Labeled_Semicolon_AB returns [EObject current=null] : this_enlister1a_Labeled_Semicolon_0= ruleenlister1a_Labeled_Semicolon ;
    public final EObject ruleenlist1a_Labeled_Semicolon_AB() throws RecognitionException {
        EObject current = null;

        EObject this_enlister1a_Labeled_Semicolon_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4575:28: (this_enlister1a_Labeled_Semicolon_0= ruleenlister1a_Labeled_Semicolon )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4577:5: this_enlister1a_Labeled_Semicolon_0= ruleenlister1a_Labeled_Semicolon
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getEnlist1a_Labeled_Semicolon_ABAccess().getEnlister1a_Labeled_SemicolonParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleenlister1a_Labeled_Semicolon_in_ruleenlist1a_Labeled_Semicolon_AB12257);
            this_enlister1a_Labeled_Semicolon_0=ruleenlister1a_Labeled_Semicolon();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_enlister1a_Labeled_Semicolon_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleenlist1a_Labeled_Semicolon_AB"


    // $ANTLR start "entryRuleenlister1a_Labeled_Semicolon"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4596:1: entryRuleenlister1a_Labeled_Semicolon returns [EObject current=null] : iv_ruleenlister1a_Labeled_Semicolon= ruleenlister1a_Labeled_Semicolon EOF ;
    public final EObject entryRuleenlister1a_Labeled_Semicolon() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleenlister1a_Labeled_Semicolon = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4600:2: (iv_ruleenlister1a_Labeled_Semicolon= ruleenlister1a_Labeled_Semicolon EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4601:2: iv_ruleenlister1a_Labeled_Semicolon= ruleenlister1a_Labeled_Semicolon EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnlister1a_Labeled_SemicolonRule()); 
            }
            pushFollow(FOLLOW_ruleenlister1a_Labeled_Semicolon_in_entryRuleenlister1a_Labeled_Semicolon12301);
            iv_ruleenlister1a_Labeled_Semicolon=ruleenlister1a_Labeled_Semicolon();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleenlister1a_Labeled_Semicolon; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleenlister1a_Labeled_Semicolon12311); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleenlister1a_Labeled_Semicolon"


    // $ANTLR start "ruleenlister1a_Labeled_Semicolon"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4611:1: ruleenlister1a_Labeled_Semicolon returns [EObject current=null] : ( ( (lv_statemnts_0_0= ruleLabeled ) ) (this_KW_SEMICOLON_1= RULE_KW_SEMICOLON ( (lv_statemnts_2_0= ruleLabeled ) ) ) (this_KW_SEMICOLON_3= RULE_KW_SEMICOLON )? ) ;
    public final EObject ruleenlister1a_Labeled_Semicolon() throws RecognitionException {
        EObject current = null;

        Token this_KW_SEMICOLON_1=null;
        Token this_KW_SEMICOLON_3=null;
        EObject lv_statemnts_0_0 = null;

        EObject lv_statemnts_2_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4615:28: ( ( ( (lv_statemnts_0_0= ruleLabeled ) ) (this_KW_SEMICOLON_1= RULE_KW_SEMICOLON ( (lv_statemnts_2_0= ruleLabeled ) ) ) (this_KW_SEMICOLON_3= RULE_KW_SEMICOLON )? ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4616:1: ( ( (lv_statemnts_0_0= ruleLabeled ) ) (this_KW_SEMICOLON_1= RULE_KW_SEMICOLON ( (lv_statemnts_2_0= ruleLabeled ) ) ) (this_KW_SEMICOLON_3= RULE_KW_SEMICOLON )? )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4616:1: ( ( (lv_statemnts_0_0= ruleLabeled ) ) (this_KW_SEMICOLON_1= RULE_KW_SEMICOLON ( (lv_statemnts_2_0= ruleLabeled ) ) ) (this_KW_SEMICOLON_3= RULE_KW_SEMICOLON )? )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4616:2: ( (lv_statemnts_0_0= ruleLabeled ) ) (this_KW_SEMICOLON_1= RULE_KW_SEMICOLON ( (lv_statemnts_2_0= ruleLabeled ) ) ) (this_KW_SEMICOLON_3= RULE_KW_SEMICOLON )?
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4616:2: ( (lv_statemnts_0_0= ruleLabeled ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4617:1: (lv_statemnts_0_0= ruleLabeled )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4617:1: (lv_statemnts_0_0= ruleLabeled )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4618:3: lv_statemnts_0_0= ruleLabeled
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEnlister1a_Labeled_SemicolonAccess().getStatemntsLabeledParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLabeled_in_ruleenlister1a_Labeled_Semicolon12361);
            lv_statemnts_0_0=ruleLabeled();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEnlister1a_Labeled_SemicolonRule());
              	        }
                     		add(
                     			current, 
                     			"statemnts",
                      		lv_statemnts_0_0, 
                      		"Labeled");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4634:2: (this_KW_SEMICOLON_1= RULE_KW_SEMICOLON ( (lv_statemnts_2_0= ruleLabeled ) ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4634:3: this_KW_SEMICOLON_1= RULE_KW_SEMICOLON ( (lv_statemnts_2_0= ruleLabeled ) )
            {
            this_KW_SEMICOLON_1=(Token)match(input,RULE_KW_SEMICOLON,FOLLOW_RULE_KW_SEMICOLON_in_ruleenlister1a_Labeled_Semicolon12373); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_KW_SEMICOLON_1, grammarAccess.getEnlister1a_Labeled_SemicolonAccess().getKW_SEMICOLONTerminalRuleCall_1_0()); 
                  
            }
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4638:1: ( (lv_statemnts_2_0= ruleLabeled ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4639:1: (lv_statemnts_2_0= ruleLabeled )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4639:1: (lv_statemnts_2_0= ruleLabeled )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4640:3: lv_statemnts_2_0= ruleLabeled
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEnlister1a_Labeled_SemicolonAccess().getStatemntsLabeledParserRuleCall_1_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLabeled_in_ruleenlister1a_Labeled_Semicolon12393);
            lv_statemnts_2_0=ruleLabeled();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEnlister1a_Labeled_SemicolonRule());
              	        }
                     		add(
                     			current, 
                     			"statemnts",
                      		lv_statemnts_2_0, 
                      		"Labeled");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4656:3: (this_KW_SEMICOLON_3= RULE_KW_SEMICOLON )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_KW_SEMICOLON) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4656:4: this_KW_SEMICOLON_3= RULE_KW_SEMICOLON
                    {
                    this_KW_SEMICOLON_3=(Token)match(input,RULE_KW_SEMICOLON,FOLLOW_RULE_KW_SEMICOLON_in_ruleenlister1a_Labeled_Semicolon12406); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_SEMICOLON_3, grammarAccess.getEnlister1a_Labeled_SemicolonAccess().getKW_SEMICOLONTerminalRuleCall_2()); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleenlister1a_Labeled_Semicolon"


    // $ANTLR start "entryRuleCurlyContents_Labeled"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4673:1: entryRuleCurlyContents_Labeled returns [EObject current=null] : iv_ruleCurlyContents_Labeled= ruleCurlyContents_Labeled EOF ;
    public final EObject entryRuleCurlyContents_Labeled() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCurlyContents_Labeled = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4677:2: (iv_ruleCurlyContents_Labeled= ruleCurlyContents_Labeled EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4678:2: iv_ruleCurlyContents_Labeled= ruleCurlyContents_Labeled EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCurlyContents_LabeledRule()); 
            }
            pushFollow(FOLLOW_ruleCurlyContents_Labeled_in_entryRuleCurlyContents_Labeled12455);
            iv_ruleCurlyContents_Labeled=ruleCurlyContents_Labeled();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCurlyContents_Labeled; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCurlyContents_Labeled12465); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleCurlyContents_Labeled"


    // $ANTLR start "ruleCurlyContents_Labeled"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4688:1: ruleCurlyContents_Labeled returns [EObject current=null] : this_CurlyContentsList_Labeled_0= ruleCurlyContentsList_Labeled ;
    public final EObject ruleCurlyContents_Labeled() throws RecognitionException {
        EObject current = null;

        EObject this_CurlyContentsList_Labeled_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4692:28: (this_CurlyContentsList_Labeled_0= ruleCurlyContentsList_Labeled )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4694:5: this_CurlyContentsList_Labeled_0= ruleCurlyContentsList_Labeled
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCurlyContents_LabeledAccess().getCurlyContentsList_LabeledParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleCurlyContentsList_Labeled_in_ruleCurlyContents_Labeled12515);
            this_CurlyContentsList_Labeled_0=ruleCurlyContentsList_Labeled();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_CurlyContentsList_Labeled_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleCurlyContents_Labeled"


    // $ANTLR start "entryRuleCurlyContentsList_Labeled"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4713:1: entryRuleCurlyContentsList_Labeled returns [EObject current=null] : iv_ruleCurlyContentsList_Labeled= ruleCurlyContentsList_Labeled EOF ;
    public final EObject entryRuleCurlyContentsList_Labeled() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCurlyContentsList_Labeled = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4717:2: (iv_ruleCurlyContentsList_Labeled= ruleCurlyContentsList_Labeled EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4718:2: iv_ruleCurlyContentsList_Labeled= ruleCurlyContentsList_Labeled EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCurlyContentsList_LabeledRule()); 
            }
            pushFollow(FOLLOW_ruleCurlyContentsList_Labeled_in_entryRuleCurlyContentsList_Labeled12559);
            iv_ruleCurlyContentsList_Labeled=ruleCurlyContentsList_Labeled();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCurlyContentsList_Labeled; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCurlyContentsList_Labeled12569); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleCurlyContentsList_Labeled"


    // $ANTLR start "ruleCurlyContentsList_Labeled"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4728:1: ruleCurlyContentsList_Labeled returns [EObject current=null] : ( ( (lv_statemts_0_0= ruleLabeled ) ) (this_KW_SEMICOLON_1= RULE_KW_SEMICOLON ( (lv_statemts_2_0= ruleLabeled ) ) )* (this_KW_SEMICOLON_3= RULE_KW_SEMICOLON )? ) ;
    public final EObject ruleCurlyContentsList_Labeled() throws RecognitionException {
        EObject current = null;

        Token this_KW_SEMICOLON_1=null;
        Token this_KW_SEMICOLON_3=null;
        EObject lv_statemts_0_0 = null;

        EObject lv_statemts_2_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4732:28: ( ( ( (lv_statemts_0_0= ruleLabeled ) ) (this_KW_SEMICOLON_1= RULE_KW_SEMICOLON ( (lv_statemts_2_0= ruleLabeled ) ) )* (this_KW_SEMICOLON_3= RULE_KW_SEMICOLON )? ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4733:1: ( ( (lv_statemts_0_0= ruleLabeled ) ) (this_KW_SEMICOLON_1= RULE_KW_SEMICOLON ( (lv_statemts_2_0= ruleLabeled ) ) )* (this_KW_SEMICOLON_3= RULE_KW_SEMICOLON )? )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4733:1: ( ( (lv_statemts_0_0= ruleLabeled ) ) (this_KW_SEMICOLON_1= RULE_KW_SEMICOLON ( (lv_statemts_2_0= ruleLabeled ) ) )* (this_KW_SEMICOLON_3= RULE_KW_SEMICOLON )? )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4733:2: ( (lv_statemts_0_0= ruleLabeled ) ) (this_KW_SEMICOLON_1= RULE_KW_SEMICOLON ( (lv_statemts_2_0= ruleLabeled ) ) )* (this_KW_SEMICOLON_3= RULE_KW_SEMICOLON )?
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4733:2: ( (lv_statemts_0_0= ruleLabeled ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4734:1: (lv_statemts_0_0= ruleLabeled )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4734:1: (lv_statemts_0_0= ruleLabeled )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4735:3: lv_statemts_0_0= ruleLabeled
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCurlyContentsList_LabeledAccess().getStatemtsLabeledParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLabeled_in_ruleCurlyContentsList_Labeled12619);
            lv_statemts_0_0=ruleLabeled();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCurlyContentsList_LabeledRule());
              	        }
                     		add(
                     			current, 
                     			"statemts",
                      		lv_statemts_0_0, 
                      		"Labeled");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4751:2: (this_KW_SEMICOLON_1= RULE_KW_SEMICOLON ( (lv_statemts_2_0= ruleLabeled ) ) )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==RULE_KW_SEMICOLON) ) {
                    int LA57_1 = input.LA(2);

                    if ( (LA57_1==RULE_KW_AT||(LA57_1>=72 && LA57_1<=82)||(LA57_1>=87 && LA57_1<=88)||LA57_1==99) ) {
                        alt57=1;
                    }


                }


                switch (alt57) {
            	case 1 :
            	    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4751:3: this_KW_SEMICOLON_1= RULE_KW_SEMICOLON ( (lv_statemts_2_0= ruleLabeled ) )
            	    {
            	    this_KW_SEMICOLON_1=(Token)match(input,RULE_KW_SEMICOLON,FOLLOW_RULE_KW_SEMICOLON_in_ruleCurlyContentsList_Labeled12631); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_KW_SEMICOLON_1, grammarAccess.getCurlyContentsList_LabeledAccess().getKW_SEMICOLONTerminalRuleCall_1_0()); 
            	          
            	    }
            	    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4755:1: ( (lv_statemts_2_0= ruleLabeled ) )
            	    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4756:1: (lv_statemts_2_0= ruleLabeled )
            	    {
            	    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4756:1: (lv_statemts_2_0= ruleLabeled )
            	    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4757:3: lv_statemts_2_0= ruleLabeled
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCurlyContentsList_LabeledAccess().getStatemtsLabeledParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLabeled_in_ruleCurlyContentsList_Labeled12651);
            	    lv_statemts_2_0=ruleLabeled();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCurlyContentsList_LabeledRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statemts",
            	              		lv_statemts_2_0, 
            	              		"Labeled");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4773:4: (this_KW_SEMICOLON_3= RULE_KW_SEMICOLON )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_KW_SEMICOLON) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4773:5: this_KW_SEMICOLON_3= RULE_KW_SEMICOLON
                    {
                    this_KW_SEMICOLON_3=(Token)match(input,RULE_KW_SEMICOLON,FOLLOW_RULE_KW_SEMICOLON_in_ruleCurlyContentsList_Labeled12665); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_SEMICOLON_3, grammarAccess.getCurlyContentsList_LabeledAccess().getKW_SEMICOLONTerminalRuleCall_2()); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleCurlyContentsList_Labeled"

    // $ANTLR start synpred1_InternalEditor
    public final void synpred1_InternalEditor_fragment() throws RecognitionException {   
        // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:491:7: ( ( 'export' ( ruleSig )? ruleToPart ) )
        // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:491:8: ( 'export' ( ruleSig )? ruleToPart )
        {
        // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:491:8: ( 'export' ( ruleSig )? ruleToPart )
        // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:492:2: 'export' ( ruleSig )? ruleToPart
        {
        match(input,82,FOLLOW_82_in_synpred1_InternalEditor1215); if (state.failed) return ;
        // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:493:1: ( ruleSig )?
        int alt59=2;
        int LA59_0 = input.LA(1);

        if ( (LA59_0==88||LA59_0==99) ) {
            alt59=1;
        }
        switch (alt59) {
            case 1 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:493:3: ruleSig
                {
                pushFollow(FOLLOW_ruleSig_in_synpred1_InternalEditor1220);
                ruleSig();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_ruleToPart_in_synpred1_InternalEditor1224);
        ruleToPart();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalEditor

    // $ANTLR start synpred2_InternalEditor
    public final void synpred2_InternalEditor_fragment() throws RecognitionException {   
        // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:522:7: ( ( 'export' ( ruleSig )? ruleFromPart ) )
        // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:522:8: ( 'export' ( ruleSig )? ruleFromPart )
        {
        // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:522:8: ( 'export' ( ruleSig )? ruleFromPart )
        // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:523:2: 'export' ( ruleSig )? ruleFromPart
        {
        match(input,82,FOLLOW_82_in_synpred2_InternalEditor1312); if (state.failed) return ;
        // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:524:1: ( ruleSig )?
        int alt60=2;
        int LA60_0 = input.LA(1);

        if ( (LA60_0==88||LA60_0==99) ) {
            alt60=1;
        }
        switch (alt60) {
            case 1 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:524:3: ruleSig
                {
                pushFollow(FOLLOW_ruleSig_in_synpred2_InternalEditor1317);
                ruleSig();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_ruleFromPart_in_synpred2_InternalEditor1321);
        ruleFromPart();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_InternalEditor

    // $ANTLR start synpred3_InternalEditor
    public final void synpred3_InternalEditor_fragment() throws RecognitionException {   
        // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:937:2: ( ( 'where' ruleCommaItem ) )
        // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:937:3: ( 'where' ruleCommaItem )
        {
        // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:937:3: ( 'where' ruleCommaItem )
        // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:938:2: 'where' ruleCommaItem
        {
        match(input,85,FOLLOW_85_in_synpred3_InternalEditor2474); if (state.failed) return ;
        pushFollow(FOLLOW_ruleCommaItem_in_synpred3_InternalEditor2477);
        ruleCommaItem();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred3_InternalEditor

    // $ANTLR start synpred4_InternalEditor
    public final void synpred4_InternalEditor_fragment() throws RecognitionException {   
        // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1747:7: ( ( ( ( ruleMolecule ) ) RULE_KW_DOLLAR ruleOpQualTail ) )
        // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1747:8: ( ( ( ruleMolecule ) ) RULE_KW_DOLLAR ruleOpQualTail )
        {
        // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1747:8: ( ( ( ruleMolecule ) ) RULE_KW_DOLLAR ruleOpQualTail )
        // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1747:9: ( ( ruleMolecule ) ) RULE_KW_DOLLAR ruleOpQualTail
        {
        // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1747:9: ( ( ruleMolecule ) )
        // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1748:1: ( ruleMolecule )
        {
        // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1748:1: ( ruleMolecule )
        // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1749:1: ruleMolecule
        {
        pushFollow(FOLLOW_ruleMolecule_in_synpred4_InternalEditor4679);
        ruleMolecule();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,RULE_KW_DOLLAR,FOLLOW_RULE_KW_DOLLAR_in_synpred4_InternalEditor4685); if (state.failed) return ;
        pushFollow(FOLLOW_ruleOpQualTail_in_synpred4_InternalEditor4687);
        ruleOpQualTail();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred4_InternalEditor

    // Delegated rules

    public final boolean synpred2_InternalEditor() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalEditor_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalEditor() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalEditor_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalEditor() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalEditor_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalEditor() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalEditor_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA7 dfa7 = new DFA7(this);
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA22 dfa22 = new DFA22(this);
    protected DFA45 dfa45 = new DFA45(this);
    static final String DFA7_eotS =
        "\14\uffff";
    static final String DFA7_eofS =
        "\14\uffff";
    static final String DFA7_minS =
        "\1\110\13\uffff";
    static final String DFA7_maxS =
        "\1\122\13\uffff";
    static final String DFA7_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13";
    static final String DFA7_specialS =
        "\14\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "229:1: ( (kw= 'macro' this_MacroBody_1= ruleMacroBody ) | (kw= 'extend' this_Sig_3= ruleSig ) | (kw= 'local' this_Sig_5= ruleSig ) | (kw= 'free' this_Sig_7= ruleSig ) | (kw= 'fluid' this_Sig_9= ruleSig ) | (kw= 'default' this_Sig_11= ruleSig ) | (kw= 'define' this_Sig_13= ruleSig ) | (kw= 'fix' this_Sig_15= ruleSig ) | (kw= 'inline' (this_Sig_17= ruleSig )? (this_FromPart_18= ruleFromPart )? ) | (kw= 'import' (this_Sig_20= ruleSig )? (this_FromPart_21= ruleFromPart )? ) | this_ExportDecl_22= ruleExportDecl )";
        }
    }
    static final String DFA18_eotS =
        "\15\uffff";
    static final String DFA18_eofS =
        "\15\uffff";
    static final String DFA18_minS =
        "\1\127\1\uffff\1\5\1\7\2\131\5\uffff\2\5";
    static final String DFA18_maxS =
        "\1\143\1\uffff\2\126\2\131\5\uffff\2\126";
    static final String DFA18_acceptS =
        "\1\uffff\1\1\4\uffff\1\2\1\6\1\4\1\5\1\3\2\uffff";
    static final String DFA18_specialS =
        "\15\uffff}>";
    static final String[] DFA18_transitionS = {
            "\1\1\1\2\12\uffff\1\3",
            "",
            "\1\4\1\5\1\12\1\10\1\11\1\7\113\uffff\1\6",
            "\1\12\1\10\1\11\1\7\113\uffff\1\6",
            "\1\13",
            "\1\14",
            "",
            "",
            "",
            "",
            "",
            "\1\4\1\5\1\12\1\10\1\11\1\7\113\uffff\1\6",
            "\1\4\1\5\1\12\1\10\1\11\1\7\113\uffff\1\6"
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "1166:1: (this_AnyStatement_0= ruleAnyStatement | (this_Infixed_1= ruleInfixed kw= 'assign' this_BindingL_Infixed_AnyStatement_3= ruleBindingL_Infixed_AnyStatement ) | (this_Infixed_4= ruleInfixed this_KW_2EQ_5= RULE_KW_2EQ this_BindingL_Infixed_AnyStatement_6= ruleBindingL_Infixed_AnyStatement ) | (this_Infixed_7= ruleInfixed this_KW_MARROW_8= RULE_KW_MARROW this_BindingL_Infixed_AnyStatement_9= ruleBindingL_Infixed_AnyStatement ) | (this_Infixed_10= ruleInfixed this_KW_MAPSTO_11= RULE_KW_MAPSTO this_BindingL_Infixed_AnyStatement_12= ruleBindingL_Infixed_AnyStatement ) | (this_Infixed_13= ruleInfixed this_KW_MAPSTOSTAR_14= RULE_KW_MAPSTOSTAR this_BindingL_Infixed_AnyStatement_15= ruleBindingL_Infixed_AnyStatement ) )";
        }
    }
    static final String DFA19_eotS =
        "\16\uffff";
    static final String DFA19_eofS =
        "\1\uffff\1\12\11\uffff\3\12";
    static final String DFA19_minS =
        "\1\130\1\5\1\130\2\131\6\uffff\3\5";
    static final String DFA19_maxS =
        "\1\130\1\126\1\130\2\131\6\uffff\3\126";
    static final String DFA19_acceptS =
        "\5\uffff\1\4\1\6\1\2\1\5\1\3\1\1\3\uffff";
    static final String DFA19_specialS =
        "\16\uffff}>";
    static final String[] DFA19_transitionS = {
            "\1\1",
            "\1\3\1\4\1\11\1\5\1\10\1\6\31\uffff\1\12\1\uffff\1\12\2\uffff"+
            "\1\2\6\uffff\1\12\42\uffff\2\12\1\uffff\1\7",
            "\1\13",
            "\1\14",
            "\1\15",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\3\1\4\1\11\1\5\1\10\1\6\31\uffff\1\12\1\uffff\1\12\2\uffff"+
            "\1\2\6\uffff\1\12\42\uffff\2\12\1\uffff\1\7",
            "\1\3\1\4\1\11\1\5\1\10\1\6\31\uffff\1\12\1\uffff\1\12\11\uffff"+
            "\1\12\42\uffff\2\12\1\uffff\1\7",
            "\1\3\1\4\1\11\1\5\1\10\1\6\31\uffff\1\12\1\uffff\1\12\11\uffff"+
            "\1\12\42\uffff\2\12\1\uffff\1\7"
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "1357:1: (this_InfixedExprsDecl_0= ruleInfixedExprsDecl | (this_InfixedExprsDecl_1= ruleInfixedExprsDecl kw= 'assign' this_Binding_AnyStatement_3= ruleBinding_AnyStatement ) | (this_InfixedExprsDecl_4= ruleInfixedExprsDecl this_KW_2EQ_5= RULE_KW_2EQ this_Binding_AnyStatement_6= ruleBinding_AnyStatement ) | (this_InfixedExprsDecl_7= ruleInfixedExprsDecl this_KW_MARROW_8= RULE_KW_MARROW this_Binding_AnyStatement_9= ruleBinding_AnyStatement ) | (this_InfixedExprsDecl_10= ruleInfixedExprsDecl this_KW_MAPSTO_11= RULE_KW_MAPSTO this_Binding_AnyStatement_12= ruleBinding_AnyStatement ) | (this_InfixedExprsDecl_13= ruleInfixedExprsDecl this_KW_MAPSTOSTAR_14= RULE_KW_MAPSTOSTAR this_Binding_AnyStatement_15= ruleBinding_AnyStatement ) )";
        }
    }
    static final String DFA22_eotS =
        "\13\uffff";
    static final String DFA22_eofS =
        "\13\uffff";
    static final String DFA22_minS =
        "\1\43\10\0\2\uffff";
    static final String DFA22_maxS =
        "\1\55\10\0\2\uffff";
    static final String DFA22_acceptS =
        "\11\uffff\1\1\1\2";
    static final String DFA22_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\2\uffff}>";
    static final String[] DFA22_transitionS = {
            "\1\6\1\uffff\1\7\1\uffff\1\10\1\1\1\uffff\1\2\1\3\1\4\1\5",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "1728:1: ( ( (lv_name_0_0= ruleMolecule ) ) | ( ( ( ( ( ruleMolecule ) ) RULE_KW_DOLLAR ruleOpQualTail ) )=> ( ( (lv_name_1_0= ruleMolecule ) ) this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_1 = input.LA(1);

                         
                        int index22_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 9;}

                        else if ( (synpred4_InternalEditor()) ) {s = 10;}

                         
                        input.seek(index22_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA22_2 = input.LA(1);

                         
                        int index22_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 9;}

                        else if ( (synpred4_InternalEditor()) ) {s = 10;}

                         
                        input.seek(index22_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA22_3 = input.LA(1);

                         
                        int index22_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 9;}

                        else if ( (synpred4_InternalEditor()) ) {s = 10;}

                         
                        input.seek(index22_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA22_4 = input.LA(1);

                         
                        int index22_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 9;}

                        else if ( (synpred4_InternalEditor()) ) {s = 10;}

                         
                        input.seek(index22_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA22_5 = input.LA(1);

                         
                        int index22_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 9;}

                        else if ( (synpred4_InternalEditor()) ) {s = 10;}

                         
                        input.seek(index22_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA22_6 = input.LA(1);

                         
                        int index22_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 9;}

                        else if ( (synpred4_InternalEditor()) ) {s = 10;}

                         
                        input.seek(index22_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA22_7 = input.LA(1);

                         
                        int index22_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 9;}

                        else if ( (synpred4_InternalEditor()) ) {s = 10;}

                         
                        input.seek(index22_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA22_8 = input.LA(1);

                         
                        int index22_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 9;}

                        else if ( (synpred4_InternalEditor()) ) {s = 10;}

                         
                        input.seek(index22_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 22, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA45_eotS =
        "\17\uffff";
    static final String DFA45_eofS =
        "\1\uffff\14\15\2\uffff";
    static final String DFA45_minS =
        "\1\21\14\13\2\uffff";
    static final String DFA45_maxS =
        "\1\134\14\13\2\uffff";
    static final String DFA45_acceptS =
        "\15\uffff\1\1\1\2";
    static final String DFA45_specialS =
        "\17\uffff}>";
    static final String[] DFA45_transitionS = {
            "\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\100\uffff\1\12\1\13\1"+
            "\14",
            "\1\16",
            "\1\16",
            "\1\16",
            "\1\16",
            "\1\16",
            "\1\16",
            "\1\16",
            "\1\16",
            "\1\16",
            "\1\16",
            "\1\16",
            "\1\16",
            "",
            ""
    };

    static final short[] DFA45_eot = DFA.unpackEncodedString(DFA45_eotS);
    static final short[] DFA45_eof = DFA.unpackEncodedString(DFA45_eofS);
    static final char[] DFA45_min = DFA.unpackEncodedStringToUnsignedChars(DFA45_minS);
    static final char[] DFA45_max = DFA.unpackEncodedStringToUnsignedChars(DFA45_maxS);
    static final short[] DFA45_accept = DFA.unpackEncodedString(DFA45_acceptS);
    static final short[] DFA45_special = DFA.unpackEncodedString(DFA45_specialS);
    static final short[][] DFA45_transition;

    static {
        int numStates = DFA45_transitionS.length;
        DFA45_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA45_transition[i] = DFA.unpackEncodedString(DFA45_transitionS[i]);
        }
    }

    class DFA45 extends DFA {

        public DFA45(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 45;
            this.eot = DFA45_eot;
            this.eof = DFA45_eof;
            this.min = DFA45_min;
            this.max = DFA45_max;
            this.accept = DFA45_accept;
            this.special = DFA45_special;
            this.transition = DFA45_transition;
        }
        public String getDescription() {
            return "3802:1: ( ruleRelationTok | ( ruleRelationTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCurlyContents_Labeled_in_ruleModel131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression167 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleenlist1a_Labeled_Semicolon_AB_in_ruleExpression223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabeled_in_entryRuleLabeled263 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabeled273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComma_in_ruleLabeled318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleLabeled339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_AT_in_ruleLabeled356 = new BitSet(new long[]{0x00003D0000000000L});
    public static final BitSet FOLLOW_ruleAtom_in_ruleLabeled377 = new BitSet(new long[]{0x0000000000000012L,0x000000080187FF00L});
    public static final BitSet FOLLOW_ruleLabeled_in_ruleLabeled397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration446 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleDeclaration500 = new BitSet(new long[]{0x0000000000000000L,0x000000080107FF00L});
    public static final BitSet FOLLOW_ruleMacroBody_in_ruleDeclaration522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleDeclaration548 = new BitSet(new long[]{0x0000000000000000L,0x0000000801000000L});
    public static final BitSet FOLLOW_ruleSig_in_ruleDeclaration570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleDeclaration596 = new BitSet(new long[]{0x0000000000000000L,0x0000000801000000L});
    public static final BitSet FOLLOW_ruleSig_in_ruleDeclaration618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleDeclaration644 = new BitSet(new long[]{0x0000000000000000L,0x0000000801000000L});
    public static final BitSet FOLLOW_ruleSig_in_ruleDeclaration666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleDeclaration692 = new BitSet(new long[]{0x0000000000000000L,0x0000000801000000L});
    public static final BitSet FOLLOW_ruleSig_in_ruleDeclaration714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleDeclaration740 = new BitSet(new long[]{0x0000000000000000L,0x0000000801000000L});
    public static final BitSet FOLLOW_ruleSig_in_ruleDeclaration762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleDeclaration788 = new BitSet(new long[]{0x0000000000000000L,0x0000000801000000L});
    public static final BitSet FOLLOW_ruleSig_in_ruleDeclaration810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleDeclaration836 = new BitSet(new long[]{0x0000000000000000L,0x0000000801000000L});
    public static final BitSet FOLLOW_ruleSig_in_ruleDeclaration858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleDeclaration884 = new BitSet(new long[]{0x0000000000000002L,0x0000000801100000L});
    public static final BitSet FOLLOW_ruleSig_in_ruleDeclaration907 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_ruleFromPart_in_ruleDeclaration937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleDeclaration965 = new BitSet(new long[]{0x0000000000000002L,0x0000000801100000L});
    public static final BitSet FOLLOW_ruleSig_in_ruleDeclaration988 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_ruleFromPart_in_ruleDeclaration1018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExportDecl_in_ruleDeclaration1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExportDecl_in_entryRuleExportDecl1110 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExportDecl1121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleExportDecl1164 = new BitSet(new long[]{0x0000000000000002L,0x0000000801000000L});
    public static final BitSet FOLLOW_ruleSig_in_ruleExportDecl1187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleExportDecl1233 = new BitSet(new long[]{0x0000000000000000L,0x0000000801080000L});
    public static final BitSet FOLLOW_ruleSig_in_ruleExportDecl1256 = new BitSet(new long[]{0x0000000000000000L,0x0000000801080000L});
    public static final BitSet FOLLOW_ruleToPart_in_ruleExportDecl1285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleExportDecl1330 = new BitSet(new long[]{0x0000000000000000L,0x0000000801100000L});
    public static final BitSet FOLLOW_ruleSig_in_ruleExportDecl1353 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_ruleFromPart_in_ruleExportDecl1382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleToPart_in_entryRuleToPart1440 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleToPart1451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleToPart1493 = new BitSet(new long[]{0x0000000000000000L,0x0000000801000000L});
    public static final BitSet FOLLOW_ruleInfixed_in_ruleToPart1515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromPart_in_entryRuleFromPart1571 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFromPart1582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleFromPart1624 = new BitSet(new long[]{0x0000000000000000L,0x0000000801000000L});
    public static final BitSet FOLLOW_ruleenlist1_Infixed_Comma_AB_in_ruleFromPart1646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMacroBody_in_entryRuleMacroBody1702 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMacroBody1713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSig_in_ruleMacroBody1764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExportDecl_in_ruleMacroBody1797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleMacroBody1822 = new BitSet(new long[]{0x0000000000000000L,0x0000000801000000L});
    public static final BitSet FOLLOW_ruleSig_in_ruleMacroBody1844 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_ruleFromPart_in_ruleMacroBody1872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSig_in_entryRuleSig1931 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSig1942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclBinding_in_ruleSig1993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleSig2026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclPart_in_entryRuleDeclPart2082 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclPart2093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_COLON_in_ruleDeclPart2138 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_ruleType_in_ruleDeclPart2165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_COLONSTAR_in_ruleDeclPart2193 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_ruleType_in_ruleDeclPart2220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComma_in_entryRuleComma2277 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComma2288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleenlist1_CommaItem_Comma_AB_in_ruleComma2338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommaItem_in_entryRuleCommaItem2393 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommaItem2404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinding_AnyStatement_in_ruleCommaItem2455 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_ruleCommaItem2486 = new BitSet(new long[]{0x0000000000000000L,0x0000000801800000L});
    public static final BitSet FOLLOW_ruleCommaItem_in_ruleCommaItem2508 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_ruleDeclBinding_in_entryRuleDeclBinding2567 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclBinding2578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindingR_InfixedExprsDecl_AnyStatement_in_ruleDeclBinding2628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInfixedExprsDecl_in_entryRuleInfixedExprsDecl2683 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInfixedExprsDecl2694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInfixedExprs_in_ruleInfixedExprsDecl2745 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_ruleDeclPart_in_ruleInfixedExprsDecl2773 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_ruleInfixedExprs_in_entryRuleInfixedExprs2831 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInfixedExprs2842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleenlist1_InfixedExpr_Comma_AB_in_ruleInfixedExprs2892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinding_AnyStatement_in_entryRuleBinding_AnyStatement2947 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinding_AnyStatement2958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindingL_Infixed_AnyStatement_in_ruleBinding_AnyStatement3008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindingL_Infixed_AnyStatement_in_entryRuleBindingL_Infixed_AnyStatement3063 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBindingL_Infixed_AnyStatement3074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnyStatement_in_ruleBindingL_Infixed_AnyStatement3125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInfixed_in_ruleBindingL_Infixed_AnyStatement3159 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_ruleBindingL_Infixed_AnyStatement3177 = new BitSet(new long[]{0x0000000000000000L,0x0000000801800000L});
    public static final BitSet FOLLOW_ruleBindingL_Infixed_AnyStatement_in_ruleBindingL_Infixed_AnyStatement3199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInfixed_in_ruleBindingL_Infixed_AnyStatement3234 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_KW_2EQ_in_ruleBindingL_Infixed_AnyStatement3254 = new BitSet(new long[]{0x0000000000000000L,0x0000000801800000L});
    public static final BitSet FOLLOW_ruleBindingL_Infixed_AnyStatement_in_ruleBindingL_Infixed_AnyStatement3281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInfixed_in_ruleBindingL_Infixed_AnyStatement3316 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_KW_MARROW_in_ruleBindingL_Infixed_AnyStatement3336 = new BitSet(new long[]{0x0000000000000000L,0x0000000801800000L});
    public static final BitSet FOLLOW_ruleBindingL_Infixed_AnyStatement_in_ruleBindingL_Infixed_AnyStatement3363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInfixed_in_ruleBindingL_Infixed_AnyStatement3398 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_KW_MAPSTO_in_ruleBindingL_Infixed_AnyStatement3418 = new BitSet(new long[]{0x0000000000000000L,0x0000000801800000L});
    public static final BitSet FOLLOW_ruleBindingL_Infixed_AnyStatement_in_ruleBindingL_Infixed_AnyStatement3445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInfixed_in_ruleBindingL_Infixed_AnyStatement3480 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_KW_MAPSTOSTAR_in_ruleBindingL_Infixed_AnyStatement3500 = new BitSet(new long[]{0x0000000000000000L,0x0000000801800000L});
    public static final BitSet FOLLOW_ruleBindingL_Infixed_AnyStatement_in_ruleBindingL_Infixed_AnyStatement3527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindingR_InfixedExprsDecl_AnyStatement_in_entryRuleBindingR_InfixedExprsDecl_AnyStatement3584 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBindingR_InfixedExprsDecl_AnyStatement3595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInfixedExprsDecl_in_ruleBindingR_InfixedExprsDecl_AnyStatement3646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInfixedExprsDecl_in_ruleBindingR_InfixedExprsDecl_AnyStatement3680 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_ruleBindingR_InfixedExprsDecl_AnyStatement3698 = new BitSet(new long[]{0x0000000000000000L,0x0000000801800000L});
    public static final BitSet FOLLOW_ruleBinding_AnyStatement_in_ruleBindingR_InfixedExprsDecl_AnyStatement3720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInfixedExprsDecl_in_ruleBindingR_InfixedExprsDecl_AnyStatement3755 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_KW_2EQ_in_ruleBindingR_InfixedExprsDecl_AnyStatement3775 = new BitSet(new long[]{0x0000000000000000L,0x0000000801800000L});
    public static final BitSet FOLLOW_ruleBinding_AnyStatement_in_ruleBindingR_InfixedExprsDecl_AnyStatement3802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInfixedExprsDecl_in_ruleBindingR_InfixedExprsDecl_AnyStatement3837 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_KW_MARROW_in_ruleBindingR_InfixedExprsDecl_AnyStatement3857 = new BitSet(new long[]{0x0000000000000000L,0x0000000801800000L});
    public static final BitSet FOLLOW_ruleBinding_AnyStatement_in_ruleBindingR_InfixedExprsDecl_AnyStatement3884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInfixedExprsDecl_in_ruleBindingR_InfixedExprsDecl_AnyStatement3919 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_KW_MAPSTO_in_ruleBindingR_InfixedExprsDecl_AnyStatement3939 = new BitSet(new long[]{0x0000000000000000L,0x0000000801800000L});
    public static final BitSet FOLLOW_ruleBinding_AnyStatement_in_ruleBindingR_InfixedExprsDecl_AnyStatement3966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInfixedExprsDecl_in_ruleBindingR_InfixedExprsDecl_AnyStatement4001 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_KW_MAPSTOSTAR_in_ruleBindingR_InfixedExprsDecl_AnyStatement4021 = new BitSet(new long[]{0x0000000000000000L,0x0000000801800000L});
    public static final BitSet FOLLOW_ruleBinding_AnyStatement_in_ruleBindingR_InfixedExprsDecl_AnyStatement4048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnyStatement_in_entryRuleAnyStatement4105 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnyStatement4116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleAnyStatement4157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInfixed_in_entryRuleInfixed4211 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInfixed4222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInfixedExpr_in_ruleInfixed4274 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_ruleDeclPart_in_ruleInfixed4302 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleInfixed4338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInfixedExpr_in_entryRuleInfixedExpr4394 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInfixedExpr4405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleInfixedExpr4446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType4496 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType4507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleType4548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpQualTail_in_entryRuleOpQualTail4597 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpQualTail4607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMolecule_in_ruleOpQualTail4657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMolecule_in_ruleOpQualTail4704 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_KW_DOLLAR_in_ruleOpQualTail4715 = new BitSet(new long[]{0x00003DA800000000L});
    public static final BitSet FOLLOW_ruleOpQualTail_in_ruleOpQualTail4736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNakedOp_in_entryRuleNakedOp4789 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNakedOp4799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnqualOp_ArrowTok_in_ruleNakedOp4850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnqualOp_LatticeTok_in_ruleNakedOp4877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnqualOp_RelationTok_in_ruleNakedOp4904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnqualOp_SegTok_in_ruleNakedOp4931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnqualOp_PlusTok_in_ruleNakedOp4958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnqualOp_QuotientTok_in_ruleNakedOp4985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnqualOp_TimesTok_in_ruleNakedOp5012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnqualOp_PowerTok_in_ruleNakedOp5039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrowOp_in_entryRuleArrowOp5078 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrowOp5088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualOp_ArrowTok_in_ruleArrowOp5134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLatticeOp_in_entryRuleLatticeOp5168 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLatticeOp5178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualOp_LatticeTok_in_ruleLatticeOp5224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationOp_in_entryRuleRelationOp5258 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationOp5268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualOp_RelationTok_in_ruleRelationOp5314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSegOp_in_entryRuleSegOp5348 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSegOp5358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualOp_SegTok_in_ruleSegOp5404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOp_in_entryRulePlusOp5438 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlusOp5448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualOp_PlusTok_in_rulePlusOp5494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuotientOp_in_entryRuleQuotientOp5528 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuotientOp5538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualOp_QuotientTok_in_ruleQuotientOp5584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimesOp_in_entryRuleTimesOp5618 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimesOp5628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualOp_TimesTok_in_ruleTimesOp5674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePowerOp_in_entryRulePowerOp5708 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePowerOp5718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualOp_PowerTok_in_rulePowerOp5764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrowTok_in_entryRuleArrowTok5799 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrowTok5810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_RARROW_in_ruleArrowTok5850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_LARROW_in_ruleArrowTok5876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_MAPSTAR_in_ruleArrowTok5902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLatticeTok_in_entryRuleLatticeTok5948 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLatticeTok5959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_VEE_in_ruleLatticeTok5999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_WEDGE_in_ruleLatticeTok6025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationTok_in_entryRuleRelationTok6071 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationTok6082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_EQ_in_ruleRelationTok6122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_TILDEE_in_ruleRelationTok6148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_HATE_in_ruleRelationTok6174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_GE_in_ruleRelationTok6200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_GT_in_ruleRelationTok6226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_2GT_in_ruleRelationTok6252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_LE_in_ruleRelationTok6278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_LT_in_ruleRelationTok6304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_2LT_in_ruleRelationTok6330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleRelationTok6354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleRelationTok6373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleRelationTok6392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSegTok_in_entryRuleSegTok6433 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSegTok6444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_2DOT_in_ruleSegTok6484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleSegTok6508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusTok_in_entryRulePlusTok6549 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlusTok6560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_PLUS_in_rulePlusTok6600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_MINUS_in_rulePlusTok6626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_PLUSMINUS_in_rulePlusTok6652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuotientTok_in_entryRuleQuotientTok6698 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuotientTok6709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleQuotientTok6747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleQuotientTok6766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleQuotientTok6785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleQuotientTok6804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimesTok_in_entryRuleTimesTok6845 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimesTok6856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_STAR_in_ruleTimesTok6896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_SLASH_in_ruleTimesTok6922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_BACKSLASH_in_ruleTimesTok6948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePowerTok_in_entryRulePowerTok6994 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePowerTok7005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_2STAR_in_rulePowerTok7045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_HAT_in_rulePowerTok7071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplication_in_entryRuleApplication7123 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplication7134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_ruleApplication7175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMolecule_in_entryRuleMolecule7236 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMolecule7246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtom_in_ruleMolecule7297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnclosure_in_ruleMolecule7324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnclosure_in_entryRuleEnclosure7369 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnclosure7379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParened_in_ruleEnclosure7430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBracketed_in_ruleEnclosure7457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuotedIds_in_ruleEnclosure7484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockMolecule_in_entryRuleBlockMolecule7531 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlockMolecule7541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtom_in_ruleBlockMolecule7592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnclosure_in_ruleBlockMolecule7619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleBlockMolecule7640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockEnclosure_in_entryRuleBlockEnclosure7685 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlockEnclosure7695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnclosure_in_ruleBlockEnclosure7746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleBlockEnclosure7767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_entryRuleBlock7813 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlock7824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_ruleBlock7865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParened_in_entryRuleParened7914 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParened7924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_OPAREN_in_ruleParened7965 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RULE_KW_CPAREN_in_ruleParened7975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_OPAREN_in_ruleParened7993 = new BitSet(new long[]{0x0000000000000010L,0x000000080187FF00L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleParened8014 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RULE_KW_CPAREN_in_ruleParened8024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBracketed_in_entryRuleBracketed8070 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBracketed8080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_OBRACK_in_ruleBracketed8121 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_RULE_KW_CBRACK_in_ruleBracketed8131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_OBRACK_in_ruleBracketed8149 = new BitSet(new long[]{0x0000000000000010L,0x000000080187FF00L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBracketed8170 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_RULE_KW_CBRACK_in_ruleBracketed8180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuotedIds_in_entryRuleQuotedIds8226 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuotedIds8236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_QUOTE_in_ruleQuotedIds8277 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_RULE_KW_QUOTE_in_ruleQuotedIds8287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_QUOTE_in_ruleQuotedIds8305 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ruleNames_in_ruleQuotedIds8326 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_RULE_KW_QUOTE_in_ruleQuotedIds8336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNames_in_entryRuleNames8382 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNames8392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TK_ID_in_ruleNames8438 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_RULE_KW_COMMA_in_ruleNames8455 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_RULE_TK_ID_in_ruleNames8471 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_ruleAtom_in_entryRuleAtom8524 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtom8534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleId_in_ruleAtom8584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleAtom8611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleId_in_entryRuleId8659 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleId8669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TK_ID_in_ruleId8715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_SHARP_in_ruleId8743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_TILDE_in_ruleId8771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral8823 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral8834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TK_INT_in_ruleLiteral8878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TK_STRING_in_ruleLiteral8904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnqualOp_ArrowTok_in_entryRuleUnqualOp_ArrowTok8959 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnqualOp_ArrowTok8969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrowTok_in_ruleUnqualOp_ArrowTok9014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnqualOp_LatticeTok_in_entryRuleUnqualOp_LatticeTok9068 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnqualOp_LatticeTok9078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLatticeTok_in_ruleUnqualOp_LatticeTok9123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnqualOp_RelationTok_in_entryRuleUnqualOp_RelationTok9177 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnqualOp_RelationTok9187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationTok_in_ruleUnqualOp_RelationTok9232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnqualOp_SegTok_in_entryRuleUnqualOp_SegTok9286 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnqualOp_SegTok9296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSegTok_in_ruleUnqualOp_SegTok9341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnqualOp_PlusTok_in_entryRuleUnqualOp_PlusTok9395 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnqualOp_PlusTok9405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusTok_in_ruleUnqualOp_PlusTok9450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnqualOp_QuotientTok_in_entryRuleUnqualOp_QuotientTok9504 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnqualOp_QuotientTok9514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuotientTok_in_ruleUnqualOp_QuotientTok9559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnqualOp_TimesTok_in_entryRuleUnqualOp_TimesTok9613 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnqualOp_TimesTok9623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimesTok_in_ruleUnqualOp_TimesTok9668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnqualOp_PowerTok_in_entryRuleUnqualOp_PowerTok9722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnqualOp_PowerTok9732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePowerTok_in_ruleUnqualOp_PowerTok9777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualOp_ArrowTok_in_entryRuleQualOp_ArrowTok9831 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualOp_ArrowTok9841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrowTok_in_ruleQualOp_ArrowTok9886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrowTok_in_ruleQualOp_ArrowTok9908 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_KW_DOLLAR_in_ruleQualOp_ArrowTok9918 = new BitSet(new long[]{0x00003DA800000000L});
    public static final BitSet FOLLOW_ruleOpQualTail_in_ruleQualOp_ArrowTok9939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualOp_LatticeTok_in_entryRuleQualOp_LatticeTok9985 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualOp_LatticeTok9995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLatticeTok_in_ruleQualOp_LatticeTok10040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLatticeTok_in_ruleQualOp_LatticeTok10062 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_KW_DOLLAR_in_ruleQualOp_LatticeTok10072 = new BitSet(new long[]{0x00003DA800000000L});
    public static final BitSet FOLLOW_ruleOpQualTail_in_ruleQualOp_LatticeTok10093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualOp_RelationTok_in_entryRuleQualOp_RelationTok10139 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualOp_RelationTok10149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationTok_in_ruleQualOp_RelationTok10194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationTok_in_ruleQualOp_RelationTok10216 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_KW_DOLLAR_in_ruleQualOp_RelationTok10226 = new BitSet(new long[]{0x00003DA800000000L});
    public static final BitSet FOLLOW_ruleOpQualTail_in_ruleQualOp_RelationTok10247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualOp_SegTok_in_entryRuleQualOp_SegTok10293 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualOp_SegTok10303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSegTok_in_ruleQualOp_SegTok10348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSegTok_in_ruleQualOp_SegTok10370 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_KW_DOLLAR_in_ruleQualOp_SegTok10380 = new BitSet(new long[]{0x00003DA800000000L});
    public static final BitSet FOLLOW_ruleOpQualTail_in_ruleQualOp_SegTok10401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualOp_PlusTok_in_entryRuleQualOp_PlusTok10447 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualOp_PlusTok10457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusTok_in_ruleQualOp_PlusTok10502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusTok_in_ruleQualOp_PlusTok10524 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_KW_DOLLAR_in_ruleQualOp_PlusTok10534 = new BitSet(new long[]{0x00003DA800000000L});
    public static final BitSet FOLLOW_ruleOpQualTail_in_ruleQualOp_PlusTok10555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualOp_QuotientTok_in_entryRuleQualOp_QuotientTok10601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualOp_QuotientTok10611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuotientTok_in_ruleQualOp_QuotientTok10656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuotientTok_in_ruleQualOp_QuotientTok10678 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_KW_DOLLAR_in_ruleQualOp_QuotientTok10688 = new BitSet(new long[]{0x00003DA800000000L});
    public static final BitSet FOLLOW_ruleOpQualTail_in_ruleQualOp_QuotientTok10709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualOp_TimesTok_in_entryRuleQualOp_TimesTok10755 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualOp_TimesTok10765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimesTok_in_ruleQualOp_TimesTok10810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimesTok_in_ruleQualOp_TimesTok10832 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_KW_DOLLAR_in_ruleQualOp_TimesTok10842 = new BitSet(new long[]{0x00003DA800000000L});
    public static final BitSet FOLLOW_ruleOpQualTail_in_ruleQualOp_TimesTok10863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualOp_PowerTok_in_entryRuleQualOp_PowerTok10909 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualOp_PowerTok10919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePowerTok_in_ruleQualOp_PowerTok10964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePowerTok_in_ruleQualOp_PowerTok10986 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_KW_DOLLAR_in_ruleQualOp_PowerTok10996 = new BitSet(new long[]{0x00003DA800000000L});
    public static final BitSet FOLLOW_ruleOpQualTail_in_ruleQualOp_PowerTok11017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreDocumentList_in_entryRulePreDocumentList11068 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePreDocumentList11079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TK_PREDOC_in_rulePreDocumentList11123 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rulePreDocumentList_in_rulePreDocumentList11150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePostDocumentList_in_entryRulePostDocumentList11207 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePostDocumentList11218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TK_POSTDOC_in_rulePostDocumentList11262 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rulePostDocumentList_in_rulePostDocumentList11289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleenlist1_CommaItem_Comma_AB_in_entryRuleenlist1_CommaItem_Comma_AB11346 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleenlist1_CommaItem_Comma_AB11357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleenlister1_CommaItem_Comma_in_ruleenlist1_CommaItem_Comma_AB11407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleenlist1_Infixed_Comma_AB_in_entryRuleenlist1_Infixed_Comma_AB11462 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleenlist1_Infixed_Comma_AB11473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleenlister1_Infixed_Comma_in_ruleenlist1_Infixed_Comma_AB11523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleenlist1_InfixedExpr_Comma_AB_in_entryRuleenlist1_InfixedExpr_Comma_AB11578 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleenlist1_InfixedExpr_Comma_AB11589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleenlister1_InfixedExpr_Comma_in_ruleenlist1_InfixedExpr_Comma_AB11639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleenlister1_CommaItem_Comma_in_entryRuleenlister1_CommaItem_Comma11694 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleenlister1_CommaItem_Comma11705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommaItem_in_ruleenlister1_CommaItem_Comma11756 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_RULE_KW_COMMA_in_ruleenlister1_CommaItem_Comma11777 = new BitSet(new long[]{0x0000000000000000L,0x0000000801800000L});
    public static final BitSet FOLLOW_ruleCommaItem_in_ruleenlister1_CommaItem_Comma11804 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_ruleenlister1_Infixed_Comma_in_entryRuleenlister1_Infixed_Comma11862 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleenlister1_Infixed_Comma11873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInfixed_in_ruleenlister1_Infixed_Comma11924 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_RULE_KW_COMMA_in_ruleenlister1_Infixed_Comma11945 = new BitSet(new long[]{0x0000000000000000L,0x0000000801000000L});
    public static final BitSet FOLLOW_ruleInfixed_in_ruleenlister1_Infixed_Comma11972 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_ruleenlister1_InfixedExpr_Comma_in_entryRuleenlister1_InfixedExpr_Comma12030 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleenlister1_InfixedExpr_Comma12041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInfixedExpr_in_ruleenlister1_InfixedExpr_Comma12092 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_RULE_KW_COMMA_in_ruleenlister1_InfixedExpr_Comma12113 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_ruleInfixedExpr_in_ruleenlister1_InfixedExpr_Comma12140 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_ruleenlist1a_Labeled_Semicolon_AB_in_entryRuleenlist1a_Labeled_Semicolon_AB12197 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleenlist1a_Labeled_Semicolon_AB12207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleenlister1a_Labeled_Semicolon_in_ruleenlist1a_Labeled_Semicolon_AB12257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleenlister1a_Labeled_Semicolon_in_entryRuleenlister1a_Labeled_Semicolon12301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleenlister1a_Labeled_Semicolon12311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabeled_in_ruleenlister1a_Labeled_Semicolon12361 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_RULE_KW_SEMICOLON_in_ruleenlister1a_Labeled_Semicolon12373 = new BitSet(new long[]{0x0000000000000010L,0x000000080187FF00L});
    public static final BitSet FOLLOW_ruleLabeled_in_ruleenlister1a_Labeled_Semicolon12393 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_RULE_KW_SEMICOLON_in_ruleenlister1a_Labeled_Semicolon12406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCurlyContents_Labeled_in_entryRuleCurlyContents_Labeled12455 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCurlyContents_Labeled12465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCurlyContentsList_Labeled_in_ruleCurlyContents_Labeled12515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCurlyContentsList_Labeled_in_entryRuleCurlyContentsList_Labeled12559 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCurlyContentsList_Labeled12569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabeled_in_ruleCurlyContentsList_Labeled12619 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_RULE_KW_SEMICOLON_in_ruleCurlyContentsList_Labeled12631 = new BitSet(new long[]{0x0000000000000010L,0x000000080187FF00L});
    public static final BitSet FOLLOW_ruleLabeled_in_ruleCurlyContentsList_Labeled12651 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_RULE_KW_SEMICOLON_in_ruleCurlyContentsList_Labeled12665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_synpred1_InternalEditor1215 = new BitSet(new long[]{0x0000000000000000L,0x0000000801080000L});
    public static final BitSet FOLLOW_ruleSig_in_synpred1_InternalEditor1220 = new BitSet(new long[]{0x0000000000000000L,0x0000000801080000L});
    public static final BitSet FOLLOW_ruleToPart_in_synpred1_InternalEditor1224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_synpred2_InternalEditor1312 = new BitSet(new long[]{0x0000000000000000L,0x0000000801100000L});
    public static final BitSet FOLLOW_ruleSig_in_synpred2_InternalEditor1317 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_ruleFromPart_in_synpred2_InternalEditor1321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_synpred3_InternalEditor2474 = new BitSet(new long[]{0x0000000000000000L,0x0000000801800000L});
    public static final BitSet FOLLOW_ruleCommaItem_in_synpred3_InternalEditor2477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMolecule_in_synpred4_InternalEditor4679 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_KW_DOLLAR_in_synpred4_InternalEditor4685 = new BitSet(new long[]{0x00003DA800000000L});
    public static final BitSet FOLLOW_ruleOpQualTail_in_synpred4_InternalEditor4687 = new BitSet(new long[]{0x0000000000000002L});

}