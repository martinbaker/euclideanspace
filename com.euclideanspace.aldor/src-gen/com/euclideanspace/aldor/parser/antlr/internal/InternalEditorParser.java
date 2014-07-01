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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_KW_AT", "RULE_KW_COLON", "RULE_KW_COLONSTAR", "RULE_KW_2EQ", "RULE_KW_MARROW", "RULE_KW_MAPSTO", "RULE_KW_MAPSTOSTAR", "RULE_KW_BAR", "RULE_KW_DOLLAR", "RULE_KW_RARROW", "RULE_KW_LARROW", "RULE_KW_MAPSTAR", "RULE_KW_VEE", "RULE_KW_WEDGE", "RULE_KW_EQ", "RULE_KW_TILDEE", "RULE_KW_HATE", "RULE_KW_GE", "RULE_KW_GT", "RULE_KW_2GT", "RULE_KW_LE", "RULE_KW_LT", "RULE_KW_2LT", "RULE_KW_2DOT", "RULE_KW_PLUS", "RULE_KW_MINUS", "RULE_KW_PLUSMINUS", "RULE_KW_STAR", "RULE_KW_SLASH", "RULE_KW_BACKSLASH", "RULE_KW_2STAR", "RULE_KW_HAT", "RULE_KW_OPAREN", "RULE_KW_CPAREN", "RULE_KW_OBRACK", "RULE_KW_CBRACK", "RULE_KW_QUOTE", "RULE_TK_ID", "RULE_KW_COMMA", "RULE_KW_SHARP", "RULE_KW_TILDE", "RULE_TK_INT", "RULE_TK_STRING", "RULE_TK_PREDOC", "RULE_TK_POSTDOC", "RULE_KW_SEMICOLON", "RULE_KW_OCURLY", "RULE_KW_CCURLY", "RULE_WS", "RULE_KW_NEWLINE", "RULE_MACROVALUE", "RULE_KW_DOT", "RULE_KW_2COLON", "RULE_KW_AMPERSAND", "RULE_SLASHSLASH", "RULE_BACKSLASHBACKSLASH", "RULE_TIMESDOLAR", "RULE_DIVDOLAR", "RULE_PLUSDOLAR", "RULE_MINUSDOLAR", "RULE_EQUALSDOLAR", "RULE_KW_IMPLIES", "RULE_KW_ASSIGN", "RULE_PERCENT", "RULE_PRIMEPERCENT", "RULE_ELLIPSIS", "RULE_SUMLIST", "RULE_ANY_OTHER", "'macro'", "'extend'", "'local'", "'free'", "'fluid'", "'default'", "'define'", "'fix'", "'inline'", "'import'", "'export'", "'to'", "'from'", "'where'", "'assign'", "'temp19'", "'temp20'", "'of'", "'in'", "'always'", "'finally'", "'temp27'", "'temp30'", "'temp31'", "'temp32'", "'temp41'", "'is'", "'isnt'", "'case'", "'by'", "'mod'", "'quo'", "'rem'", "'exquo'", "'temp52'"
    };
    public static final int RULE_KW_GE=21;
    public static final int RULE_KW_AMPERSAND=57;
    public static final int RULE_KW_DOT=55;
    public static final int RULE_ANY_OTHER=71;
    public static final int RULE_KW_WEDGE=17;
    public static final int RULE_PERCENT=67;
    public static final int RULE_PRIMEPERCENT=68;
    public static final int RULE_KW_GT=22;
    public static final int EOF=-1;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int RULE_KW_IMPLIES=65;
    public static final int RULE_KW_2EQ=7;
    public static final int T__92=92;
    public static final int T__90=90;
    public static final int RULE_KW_2LT=26;
    public static final int RULE_KW_DOLLAR=12;
    public static final int RULE_KW_TILDE=44;
    public static final int RULE_KW_MAPSTAR=15;
    public static final int RULE_KW_PLUSMINUS=30;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int RULE_KW_COLON=5;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int RULE_KW_MINUS=29;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_KW_MARROW=8;
    public static final int RULE_KW_MAPSTO=9;
    public static final int RULE_KW_SLASH=32;
    public static final int RULE_KW_2COLON=56;
    public static final int RULE_TK_ID=41;
    public static final int RULE_PLUSDOLAR=62;
    public static final int RULE_ELLIPSIS=69;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int RULE_KW_TILDEE=19;
    public static final int T__88=88;
    public static final int RULE_KW_CCURLY=51;
    public static final int RULE_MACROVALUE=54;
    public static final int T__72=72;
    public static final int RULE_TK_POSTDOC=48;
    public static final int RULE_KW_2GT=23;
    public static final int RULE_SUMLIST=70;
    public static final int RULE_KW_ASSIGN=66;
    public static final int RULE_KW_COLONSTAR=6;
    public static final int T__76=76;
    public static final int RULE_KW_OBRACK=38;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int RULE_KW_BAR=11;
    public static final int T__73=73;
    public static final int RULE_KW_CBRACK=39;
    public static final int RULE_KW_RARROW=13;
    public static final int RULE_KW_AT=4;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;
    public static final int RULE_KW_OPAREN=36;
    public static final int RULE_TIMESDOLAR=60;
    public static final int RULE_TK_PREDOC=47;
    public static final int RULE_KW_CPAREN=37;
    public static final int RULE_KW_LT=25;
    public static final int RULE_KW_STAR=31;
    public static final int RULE_KW_HATE=20;
    public static final int RULE_KW_PLUS=28;
    public static final int RULE_KW_SEMICOLON=49;
    public static final int RULE_KW_SHARP=43;
    public static final int RULE_KW_LE=24;
    public static final int RULE_EQUALSDOLAR=64;
    public static final int T__103=103;
    public static final int RULE_KW_QUOTE=40;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int RULE_KW_BACKSLASH=33;
    public static final int RULE_KW_MAPSTOSTAR=10;
    public static final int RULE_KW_VEE=16;
    public static final int RULE_KW_HAT=35;
    public static final int RULE_KW_LARROW=14;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int RULE_KW_EQ=18;
    public static final int RULE_TK_STRING=46;
    public static final int RULE_KW_NEWLINE=53;
    public static final int RULE_MINUSDOLAR=63;
    public static final int RULE_BACKSLASHBACKSLASH=59;
    public static final int RULE_KW_OCURLY=50;
    public static final int RULE_SLASHSLASH=58;
    public static final int RULE_DIVDOLAR=61;
    public static final int RULE_KW_2DOT=27;
    public static final int RULE_KW_2STAR=34;
    public static final int RULE_KW_COMMA=42;
    public static final int RULE_TK_INT=45;
    public static final int RULE_WS=52;

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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:144:1: ruleLabeled returns [EObject current=null] : (this_Comma_0= ruleComma | this_Declaration_1= ruleDeclaration | (this_KW_AT_2= RULE_KW_AT this_Atom_3= ruleAtom ( (lv_lab_4_0= ruleLabeled ) )? ) ) ;
    public final EObject ruleLabeled() throws RecognitionException {
        EObject current = null;

        Token this_KW_AT_2=null;
        EObject this_Comma_0 = null;

        EObject this_Declaration_1 = null;

        EObject this_Atom_3 = null;

        EObject lv_lab_4_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:148:28: ( (this_Comma_0= ruleComma | this_Declaration_1= ruleDeclaration | (this_KW_AT_2= RULE_KW_AT this_Atom_3= ruleAtom ( (lv_lab_4_0= ruleLabeled ) )? ) ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:149:1: (this_Comma_0= ruleComma | this_Declaration_1= ruleDeclaration | (this_KW_AT_2= RULE_KW_AT this_Atom_3= ruleAtom ( (lv_lab_4_0= ruleLabeled ) )? ) )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:149:1: (this_Comma_0= ruleComma | this_Declaration_1= ruleDeclaration | (this_KW_AT_2= RULE_KW_AT this_Atom_3= ruleAtom ( (lv_lab_4_0= ruleLabeled ) )? ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 87:
            case 95:
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
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:150:5: this_Comma_0= ruleComma
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLabeledAccess().getCommaParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleComma_in_ruleLabeled324);
                    this_Comma_0=ruleComma();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Comma_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:160:5: this_Declaration_1= ruleDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLabeledAccess().getDeclarationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDeclaration_in_ruleLabeled351);
                    this_Declaration_1=ruleDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Declaration_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:169:6: (this_KW_AT_2= RULE_KW_AT this_Atom_3= ruleAtom ( (lv_lab_4_0= ruleLabeled ) )? )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:169:6: (this_KW_AT_2= RULE_KW_AT this_Atom_3= ruleAtom ( (lv_lab_4_0= ruleLabeled ) )? )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:169:7: this_KW_AT_2= RULE_KW_AT this_Atom_3= ruleAtom ( (lv_lab_4_0= ruleLabeled ) )?
                    {
                    this_KW_AT_2=(Token)match(input,RULE_KW_AT,FOLLOW_RULE_KW_AT_in_ruleLabeled368); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_AT_2, grammarAccess.getLabeledAccess().getKW_ATTerminalRuleCall_2_0()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLabeledAccess().getAtomParserRuleCall_2_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAtom_in_ruleLabeled389);
                    this_Atom_3=ruleAtom();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Atom_3; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:182:1: ( (lv_lab_4_0= ruleLabeled ) )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==RULE_KW_AT||(LA1_0>=72 && LA1_0<=82)||LA1_0==87||LA1_0==95) ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:183:1: (lv_lab_4_0= ruleLabeled )
                            {
                            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:183:1: (lv_lab_4_0= ruleLabeled )
                            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:184:3: lv_lab_4_0= ruleLabeled
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLabeledAccess().getLabLabeledParserRuleCall_2_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleLabeled_in_ruleLabeled409);
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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:211:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:215:2: (iv_ruleDeclaration= ruleDeclaration EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:216:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration457);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration467); if (state.failed) return current;

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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:226:1: ruleDeclaration returns [EObject current=null] : ( (otherlv_0= 'macro' this_MacroBody_1= ruleMacroBody ) | (otherlv_2= 'extend' this_Sig_3= ruleSig ) | (otherlv_4= 'local' this_Sig_5= ruleSig ) | (otherlv_6= 'free' this_Sig_7= ruleSig ) | (otherlv_8= 'fluid' this_Sig_9= ruleSig ) | (otherlv_10= 'default' this_Sig_11= ruleSig ) | (otherlv_12= 'define' this_Sig_13= ruleSig ) | (otherlv_14= 'fix' this_Sig_15= ruleSig ) | (otherlv_16= 'inline' (this_Sig_17= ruleSig )? ( (lv_fp_18_0= ruleFromPart ) )? ) | (otherlv_19= 'import' (this_Sig_20= ruleSig )? ( (lv_fp_21_0= ruleFromPart ) )? ) | this_ExportDecl_22= ruleExportDecl ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_19=null;
        EObject this_MacroBody_1 = null;

        EObject this_Sig_3 = null;

        EObject this_Sig_5 = null;

        EObject this_Sig_7 = null;

        EObject this_Sig_9 = null;

        EObject this_Sig_11 = null;

        EObject this_Sig_13 = null;

        EObject this_Sig_15 = null;

        EObject this_Sig_17 = null;

        EObject lv_fp_18_0 = null;

        EObject this_Sig_20 = null;

        EObject lv_fp_21_0 = null;

        EObject this_ExportDecl_22 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:230:28: ( ( (otherlv_0= 'macro' this_MacroBody_1= ruleMacroBody ) | (otherlv_2= 'extend' this_Sig_3= ruleSig ) | (otherlv_4= 'local' this_Sig_5= ruleSig ) | (otherlv_6= 'free' this_Sig_7= ruleSig ) | (otherlv_8= 'fluid' this_Sig_9= ruleSig ) | (otherlv_10= 'default' this_Sig_11= ruleSig ) | (otherlv_12= 'define' this_Sig_13= ruleSig ) | (otherlv_14= 'fix' this_Sig_15= ruleSig ) | (otherlv_16= 'inline' (this_Sig_17= ruleSig )? ( (lv_fp_18_0= ruleFromPart ) )? ) | (otherlv_19= 'import' (this_Sig_20= ruleSig )? ( (lv_fp_21_0= ruleFromPart ) )? ) | this_ExportDecl_22= ruleExportDecl ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:231:1: ( (otherlv_0= 'macro' this_MacroBody_1= ruleMacroBody ) | (otherlv_2= 'extend' this_Sig_3= ruleSig ) | (otherlv_4= 'local' this_Sig_5= ruleSig ) | (otherlv_6= 'free' this_Sig_7= ruleSig ) | (otherlv_8= 'fluid' this_Sig_9= ruleSig ) | (otherlv_10= 'default' this_Sig_11= ruleSig ) | (otherlv_12= 'define' this_Sig_13= ruleSig ) | (otherlv_14= 'fix' this_Sig_15= ruleSig ) | (otherlv_16= 'inline' (this_Sig_17= ruleSig )? ( (lv_fp_18_0= ruleFromPart ) )? ) | (otherlv_19= 'import' (this_Sig_20= ruleSig )? ( (lv_fp_21_0= ruleFromPart ) )? ) | this_ExportDecl_22= ruleExportDecl )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:231:1: ( (otherlv_0= 'macro' this_MacroBody_1= ruleMacroBody ) | (otherlv_2= 'extend' this_Sig_3= ruleSig ) | (otherlv_4= 'local' this_Sig_5= ruleSig ) | (otherlv_6= 'free' this_Sig_7= ruleSig ) | (otherlv_8= 'fluid' this_Sig_9= ruleSig ) | (otherlv_10= 'default' this_Sig_11= ruleSig ) | (otherlv_12= 'define' this_Sig_13= ruleSig ) | (otherlv_14= 'fix' this_Sig_15= ruleSig ) | (otherlv_16= 'inline' (this_Sig_17= ruleSig )? ( (lv_fp_18_0= ruleFromPart ) )? ) | (otherlv_19= 'import' (this_Sig_20= ruleSig )? ( (lv_fp_21_0= ruleFromPart ) )? ) | this_ExportDecl_22= ruleExportDecl )
            int alt7=11;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:231:2: (otherlv_0= 'macro' this_MacroBody_1= ruleMacroBody )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:231:2: (otherlv_0= 'macro' this_MacroBody_1= ruleMacroBody )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:231:4: otherlv_0= 'macro' this_MacroBody_1= ruleMacroBody
                    {
                    otherlv_0=(Token)match(input,72,FOLLOW_72_in_ruleDeclaration509); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getDeclarationAccess().getMacroKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getMacroBodyParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMacroBody_in_ruleDeclaration531);
                    this_MacroBody_1=ruleMacroBody();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MacroBody_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:245:6: (otherlv_2= 'extend' this_Sig_3= ruleSig )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:245:6: (otherlv_2= 'extend' this_Sig_3= ruleSig )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:245:8: otherlv_2= 'extend' this_Sig_3= ruleSig
                    {
                    otherlv_2=(Token)match(input,73,FOLLOW_73_in_ruleDeclaration550); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getDeclarationAccess().getExtendKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getSigParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSig_in_ruleDeclaration572);
                    this_Sig_3=ruleSig();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Sig_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:259:6: (otherlv_4= 'local' this_Sig_5= ruleSig )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:259:6: (otherlv_4= 'local' this_Sig_5= ruleSig )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:259:8: otherlv_4= 'local' this_Sig_5= ruleSig
                    {
                    otherlv_4=(Token)match(input,74,FOLLOW_74_in_ruleDeclaration591); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getDeclarationAccess().getLocalKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getSigParserRuleCall_2_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSig_in_ruleDeclaration613);
                    this_Sig_5=ruleSig();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Sig_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:273:6: (otherlv_6= 'free' this_Sig_7= ruleSig )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:273:6: (otherlv_6= 'free' this_Sig_7= ruleSig )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:273:8: otherlv_6= 'free' this_Sig_7= ruleSig
                    {
                    otherlv_6=(Token)match(input,75,FOLLOW_75_in_ruleDeclaration632); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getDeclarationAccess().getFreeKeyword_3_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getSigParserRuleCall_3_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSig_in_ruleDeclaration654);
                    this_Sig_7=ruleSig();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Sig_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:287:6: (otherlv_8= 'fluid' this_Sig_9= ruleSig )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:287:6: (otherlv_8= 'fluid' this_Sig_9= ruleSig )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:287:8: otherlv_8= 'fluid' this_Sig_9= ruleSig
                    {
                    otherlv_8=(Token)match(input,76,FOLLOW_76_in_ruleDeclaration673); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getDeclarationAccess().getFluidKeyword_4_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getSigParserRuleCall_4_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSig_in_ruleDeclaration695);
                    this_Sig_9=ruleSig();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Sig_9; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:301:6: (otherlv_10= 'default' this_Sig_11= ruleSig )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:301:6: (otherlv_10= 'default' this_Sig_11= ruleSig )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:301:8: otherlv_10= 'default' this_Sig_11= ruleSig
                    {
                    otherlv_10=(Token)match(input,77,FOLLOW_77_in_ruleDeclaration714); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getDeclarationAccess().getDefaultKeyword_5_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getSigParserRuleCall_5_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSig_in_ruleDeclaration736);
                    this_Sig_11=ruleSig();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Sig_11; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:315:6: (otherlv_12= 'define' this_Sig_13= ruleSig )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:315:6: (otherlv_12= 'define' this_Sig_13= ruleSig )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:315:8: otherlv_12= 'define' this_Sig_13= ruleSig
                    {
                    otherlv_12=(Token)match(input,78,FOLLOW_78_in_ruleDeclaration755); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getDeclarationAccess().getDefineKeyword_6_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getSigParserRuleCall_6_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSig_in_ruleDeclaration777);
                    this_Sig_13=ruleSig();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Sig_13; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:329:6: (otherlv_14= 'fix' this_Sig_15= ruleSig )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:329:6: (otherlv_14= 'fix' this_Sig_15= ruleSig )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:329:8: otherlv_14= 'fix' this_Sig_15= ruleSig
                    {
                    otherlv_14=(Token)match(input,79,FOLLOW_79_in_ruleDeclaration796); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getDeclarationAccess().getFixKeyword_7_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getSigParserRuleCall_7_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSig_in_ruleDeclaration818);
                    this_Sig_15=ruleSig();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Sig_15; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:343:6: (otherlv_16= 'inline' (this_Sig_17= ruleSig )? ( (lv_fp_18_0= ruleFromPart ) )? )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:343:6: (otherlv_16= 'inline' (this_Sig_17= ruleSig )? ( (lv_fp_18_0= ruleFromPart ) )? )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:343:8: otherlv_16= 'inline' (this_Sig_17= ruleSig )? ( (lv_fp_18_0= ruleFromPart ) )?
                    {
                    otherlv_16=(Token)match(input,80,FOLLOW_80_in_ruleDeclaration837); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getDeclarationAccess().getInlineKeyword_8_0());
                          
                    }
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:347:1: (this_Sig_17= ruleSig )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==RULE_KW_OCURLY||LA3_0==96) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:348:5: this_Sig_17= ruleSig
                            {
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getDeclarationAccess().getSigParserRuleCall_8_1()); 
                                  
                            }
                            pushFollow(FOLLOW_ruleSig_in_ruleDeclaration860);
                            this_Sig_17=ruleSig();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                      current = this_Sig_17; 
                                      afterParserOrEnumRuleCall();
                                  
                            }

                            }
                            break;

                    }

                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:356:3: ( (lv_fp_18_0= ruleFromPart ) )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==84) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:357:1: (lv_fp_18_0= ruleFromPart )
                            {
                            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:357:1: (lv_fp_18_0= ruleFromPart )
                            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:358:3: lv_fp_18_0= ruleFromPart
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getDeclarationAccess().getFpFromPartParserRuleCall_8_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleFromPart_in_ruleDeclaration882);
                            lv_fp_18_0=ruleFromPart();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getDeclarationRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"fp",
                                      		lv_fp_18_0, 
                                      		"FromPart");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 10 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:375:6: (otherlv_19= 'import' (this_Sig_20= ruleSig )? ( (lv_fp_21_0= ruleFromPart ) )? )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:375:6: (otherlv_19= 'import' (this_Sig_20= ruleSig )? ( (lv_fp_21_0= ruleFromPart ) )? )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:375:8: otherlv_19= 'import' (this_Sig_20= ruleSig )? ( (lv_fp_21_0= ruleFromPart ) )?
                    {
                    otherlv_19=(Token)match(input,81,FOLLOW_81_in_ruleDeclaration903); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_19, grammarAccess.getDeclarationAccess().getImportKeyword_9_0());
                          
                    }
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:379:1: (this_Sig_20= ruleSig )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==RULE_KW_OCURLY||LA5_0==96) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:380:5: this_Sig_20= ruleSig
                            {
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getDeclarationAccess().getSigParserRuleCall_9_1()); 
                                  
                            }
                            pushFollow(FOLLOW_ruleSig_in_ruleDeclaration926);
                            this_Sig_20=ruleSig();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                      current = this_Sig_20; 
                                      afterParserOrEnumRuleCall();
                                  
                            }

                            }
                            break;

                    }

                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:388:3: ( (lv_fp_21_0= ruleFromPart ) )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==84) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:389:1: (lv_fp_21_0= ruleFromPart )
                            {
                            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:389:1: (lv_fp_21_0= ruleFromPart )
                            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:390:3: lv_fp_21_0= ruleFromPart
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getDeclarationAccess().getFpFromPartParserRuleCall_9_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleFromPart_in_ruleDeclaration948);
                            lv_fp_21_0=ruleFromPart();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getDeclarationRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"fp",
                                      		lv_fp_21_0, 
                                      		"FromPart");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 11 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:408:5: this_ExportDecl_22= ruleExportDecl
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getExportDeclParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExportDecl_in_ruleDeclaration978);
                    this_ExportDecl_22=ruleExportDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ExportDecl_22; 
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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:427:1: entryRuleExportDecl returns [EObject current=null] : iv_ruleExportDecl= ruleExportDecl EOF ;
    public final EObject entryRuleExportDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExportDecl = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:431:2: (iv_ruleExportDecl= ruleExportDecl EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:432:2: iv_ruleExportDecl= ruleExportDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExportDeclRule()); 
            }
            pushFollow(FOLLOW_ruleExportDecl_in_entryRuleExportDecl1023);
            iv_ruleExportDecl=ruleExportDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExportDecl; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExportDecl1033); if (state.failed) return current;

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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:442:1: ruleExportDecl returns [EObject current=null] : ( (otherlv_0= 'export' (this_Sig_1= ruleSig )? ) | ( ( ( 'export' ( ruleSig )? ( ( ruleToPart ) ) ) )=> (otherlv_2= 'export' (this_Sig_3= ruleSig )? ( (lv_tp_4_0= ruleToPart ) ) ) ) | ( ( ( 'export' ( ruleSig )? ( ( ruleFromPart ) ) ) )=> (otherlv_5= 'export' (this_Sig_6= ruleSig )? ( (lv_fp_7_0= ruleFromPart ) ) ) ) ) ;
    public final EObject ruleExportDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_Sig_1 = null;

        EObject this_Sig_3 = null;

        AntlrDatatypeRuleToken lv_tp_4_0 = null;

        EObject this_Sig_6 = null;

        EObject lv_fp_7_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:446:28: ( ( (otherlv_0= 'export' (this_Sig_1= ruleSig )? ) | ( ( ( 'export' ( ruleSig )? ( ( ruleToPart ) ) ) )=> (otherlv_2= 'export' (this_Sig_3= ruleSig )? ( (lv_tp_4_0= ruleToPart ) ) ) ) | ( ( ( 'export' ( ruleSig )? ( ( ruleFromPart ) ) ) )=> (otherlv_5= 'export' (this_Sig_6= ruleSig )? ( (lv_fp_7_0= ruleFromPart ) ) ) ) ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:447:1: ( (otherlv_0= 'export' (this_Sig_1= ruleSig )? ) | ( ( ( 'export' ( ruleSig )? ( ( ruleToPart ) ) ) )=> (otherlv_2= 'export' (this_Sig_3= ruleSig )? ( (lv_tp_4_0= ruleToPart ) ) ) ) | ( ( ( 'export' ( ruleSig )? ( ( ruleFromPart ) ) ) )=> (otherlv_5= 'export' (this_Sig_6= ruleSig )? ( (lv_fp_7_0= ruleFromPart ) ) ) ) )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:447:1: ( (otherlv_0= 'export' (this_Sig_1= ruleSig )? ) | ( ( ( 'export' ( ruleSig )? ( ( ruleToPart ) ) ) )=> (otherlv_2= 'export' (this_Sig_3= ruleSig )? ( (lv_tp_4_0= ruleToPart ) ) ) ) | ( ( ( 'export' ( ruleSig )? ( ( ruleFromPart ) ) ) )=> (otherlv_5= 'export' (this_Sig_6= ruleSig )? ( (lv_fp_7_0= ruleFromPart ) ) ) ) )
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
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:447:2: (otherlv_0= 'export' (this_Sig_1= ruleSig )? )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:447:2: (otherlv_0= 'export' (this_Sig_1= ruleSig )? )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:447:4: otherlv_0= 'export' (this_Sig_1= ruleSig )?
                    {
                    otherlv_0=(Token)match(input,82,FOLLOW_82_in_ruleExportDecl1075); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getExportDeclAccess().getExportKeyword_0_0());
                          
                    }
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:451:1: (this_Sig_1= ruleSig )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==RULE_KW_OCURLY||LA8_0==96) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:452:5: this_Sig_1= ruleSig
                            {
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getExportDeclAccess().getSigParserRuleCall_0_1()); 
                                  
                            }
                            pushFollow(FOLLOW_ruleSig_in_ruleExportDecl1098);
                            this_Sig_1=ruleSig();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                      current = this_Sig_1; 
                                      afterParserOrEnumRuleCall();
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:461:6: ( ( ( 'export' ( ruleSig )? ( ( ruleToPart ) ) ) )=> (otherlv_2= 'export' (this_Sig_3= ruleSig )? ( (lv_tp_4_0= ruleToPart ) ) ) )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:461:6: ( ( ( 'export' ( ruleSig )? ( ( ruleToPart ) ) ) )=> (otherlv_2= 'export' (this_Sig_3= ruleSig )? ( (lv_tp_4_0= ruleToPart ) ) ) )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:461:7: ( ( 'export' ( ruleSig )? ( ( ruleToPart ) ) ) )=> (otherlv_2= 'export' (this_Sig_3= ruleSig )? ( (lv_tp_4_0= ruleToPart ) ) )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:466:6: (otherlv_2= 'export' (this_Sig_3= ruleSig )? ( (lv_tp_4_0= ruleToPart ) ) )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:466:8: otherlv_2= 'export' (this_Sig_3= ruleSig )? ( (lv_tp_4_0= ruleToPart ) )
                    {
                    otherlv_2=(Token)match(input,82,FOLLOW_82_in_ruleExportDecl1143); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getExportDeclAccess().getExportKeyword_1_0_0());
                          
                    }
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:470:1: (this_Sig_3= ruleSig )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==RULE_KW_OCURLY||LA9_0==96) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:471:5: this_Sig_3= ruleSig
                            {
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getExportDeclAccess().getSigParserRuleCall_1_0_1()); 
                                  
                            }
                            pushFollow(FOLLOW_ruleSig_in_ruleExportDecl1166);
                            this_Sig_3=ruleSig();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                      current = this_Sig_3; 
                                      afterParserOrEnumRuleCall();
                                  
                            }

                            }
                            break;

                    }

                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:479:3: ( (lv_tp_4_0= ruleToPart ) )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:480:1: (lv_tp_4_0= ruleToPart )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:480:1: (lv_tp_4_0= ruleToPart )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:481:3: lv_tp_4_0= ruleToPart
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExportDeclAccess().getTpToPartParserRuleCall_1_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleToPart_in_ruleExportDecl1188);
                    lv_tp_4_0=ruleToPart();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExportDeclRule());
                      	        }
                             		set(
                             			current, 
                             			"tp",
                              		lv_tp_4_0, 
                              		"ToPart");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:498:6: ( ( ( 'export' ( ruleSig )? ( ( ruleFromPart ) ) ) )=> (otherlv_5= 'export' (this_Sig_6= ruleSig )? ( (lv_fp_7_0= ruleFromPart ) ) ) )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:498:6: ( ( ( 'export' ( ruleSig )? ( ( ruleFromPart ) ) ) )=> (otherlv_5= 'export' (this_Sig_6= ruleSig )? ( (lv_fp_7_0= ruleFromPart ) ) ) )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:498:7: ( ( 'export' ( ruleSig )? ( ( ruleFromPart ) ) ) )=> (otherlv_5= 'export' (this_Sig_6= ruleSig )? ( (lv_fp_7_0= ruleFromPart ) ) )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:503:6: (otherlv_5= 'export' (this_Sig_6= ruleSig )? ( (lv_fp_7_0= ruleFromPart ) ) )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:503:8: otherlv_5= 'export' (this_Sig_6= ruleSig )? ( (lv_fp_7_0= ruleFromPart ) )
                    {
                    otherlv_5=(Token)match(input,82,FOLLOW_82_in_ruleExportDecl1233); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getExportDeclAccess().getExportKeyword_2_0_0());
                          
                    }
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:507:1: (this_Sig_6= ruleSig )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==RULE_KW_OCURLY||LA10_0==96) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:508:5: this_Sig_6= ruleSig
                            {
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getExportDeclAccess().getSigParserRuleCall_2_0_1()); 
                                  
                            }
                            pushFollow(FOLLOW_ruleSig_in_ruleExportDecl1256);
                            this_Sig_6=ruleSig();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                      current = this_Sig_6; 
                                      afterParserOrEnumRuleCall();
                                  
                            }

                            }
                            break;

                    }

                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:516:3: ( (lv_fp_7_0= ruleFromPart ) )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:517:1: (lv_fp_7_0= ruleFromPart )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:517:1: (lv_fp_7_0= ruleFromPart )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:518:3: lv_fp_7_0= ruleFromPart
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExportDeclAccess().getFpFromPartParserRuleCall_2_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFromPart_in_ruleExportDecl1278);
                    lv_fp_7_0=ruleFromPart();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExportDeclRule());
                      	        }
                             		set(
                             			current, 
                             			"fp",
                              		lv_fp_7_0, 
                              		"FromPart");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:545:1: entryRuleToPart returns [String current=null] : iv_ruleToPart= ruleToPart EOF ;
    public final String entryRuleToPart() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleToPart = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:549:2: (iv_ruleToPart= ruleToPart EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:550:2: iv_ruleToPart= ruleToPart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getToPartRule()); 
            }
            pushFollow(FOLLOW_ruleToPart_in_entryRuleToPart1327);
            iv_ruleToPart=ruleToPart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleToPart.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleToPart1338); if (state.failed) return current;

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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:560:1: ruleToPart returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'to' this_Infixed_1= ruleInfixed ) ;
    public final AntlrDatatypeRuleToken ruleToPart() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Infixed_1 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:564:28: ( (kw= 'to' this_Infixed_1= ruleInfixed ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:565:1: (kw= 'to' this_Infixed_1= ruleInfixed )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:565:1: (kw= 'to' this_Infixed_1= ruleInfixed )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:566:2: kw= 'to' this_Infixed_1= ruleInfixed
            {
            kw=(Token)match(input,83,FOLLOW_83_in_ruleToPart1380); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getToPartAccess().getToKeyword_0()); 
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getToPartAccess().getInfixedParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleInfixed_in_ruleToPart1402);
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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:593:1: entryRuleFromPart returns [EObject current=null] : iv_ruleFromPart= ruleFromPart EOF ;
    public final EObject entryRuleFromPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFromPart = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:597:2: (iv_ruleFromPart= ruleFromPart EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:598:2: iv_ruleFromPart= ruleFromPart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFromPartRule()); 
            }
            pushFollow(FOLLOW_ruleFromPart_in_entryRuleFromPart1457);
            iv_ruleFromPart=ruleFromPart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFromPart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFromPart1467); if (state.failed) return current;

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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:608:1: ruleFromPart returns [EObject current=null] : (otherlv_0= 'from' this_enlist1_Infixed_Comma_AB_1= ruleenlist1_Infixed_Comma_AB ) ;
    public final EObject ruleFromPart() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_enlist1_Infixed_Comma_AB_1 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:612:28: ( (otherlv_0= 'from' this_enlist1_Infixed_Comma_AB_1= ruleenlist1_Infixed_Comma_AB ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:613:1: (otherlv_0= 'from' this_enlist1_Infixed_Comma_AB_1= ruleenlist1_Infixed_Comma_AB )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:613:1: (otherlv_0= 'from' this_enlist1_Infixed_Comma_AB_1= ruleenlist1_Infixed_Comma_AB )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:613:3: otherlv_0= 'from' this_enlist1_Infixed_Comma_AB_1= ruleenlist1_Infixed_Comma_AB
            {
            otherlv_0=(Token)match(input,84,FOLLOW_84_in_ruleFromPart1508); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFromPartAccess().getFromKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getFromPartAccess().getEnlist1_Infixed_Comma_ABParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleenlist1_Infixed_Comma_AB_in_ruleFromPart1530);
            this_enlist1_Infixed_Comma_AB_1=ruleenlist1_Infixed_Comma_AB();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_enlist1_Infixed_Comma_AB_1; 
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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:637:1: entryRuleMacroBody returns [EObject current=null] : iv_ruleMacroBody= ruleMacroBody EOF ;
    public final EObject entryRuleMacroBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMacroBody = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:641:2: (iv_ruleMacroBody= ruleMacroBody EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:642:2: iv_ruleMacroBody= ruleMacroBody EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMacroBodyRule()); 
            }
            pushFollow(FOLLOW_ruleMacroBody_in_entryRuleMacroBody1575);
            iv_ruleMacroBody=ruleMacroBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMacroBody; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMacroBody1585); if (state.failed) return current;

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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:652:1: ruleMacroBody returns [EObject current=null] : (this_Sig_0= ruleSig | this_ExportDecl_1= ruleExportDecl | (otherlv_2= 'import' this_Sig_3= ruleSig ( (lv_fp_4_0= ruleFromPart ) )? ) ) ;
    public final EObject ruleMacroBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Sig_0 = null;

        EObject this_ExportDecl_1 = null;

        EObject this_Sig_3 = null;

        EObject lv_fp_4_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:656:28: ( (this_Sig_0= ruleSig | this_ExportDecl_1= ruleExportDecl | (otherlv_2= 'import' this_Sig_3= ruleSig ( (lv_fp_4_0= ruleFromPart ) )? ) ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:657:1: (this_Sig_0= ruleSig | this_ExportDecl_1= ruleExportDecl | (otherlv_2= 'import' this_Sig_3= ruleSig ( (lv_fp_4_0= ruleFromPart ) )? ) )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:657:1: (this_Sig_0= ruleSig | this_ExportDecl_1= ruleExportDecl | (otherlv_2= 'import' this_Sig_3= ruleSig ( (lv_fp_4_0= ruleFromPart ) )? ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case RULE_KW_OCURLY:
            case 96:
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
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:658:5: this_Sig_0= ruleSig
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMacroBodyAccess().getSigParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSig_in_ruleMacroBody1636);
                    this_Sig_0=ruleSig();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Sig_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:668:5: this_ExportDecl_1= ruleExportDecl
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMacroBodyAccess().getExportDeclParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExportDecl_in_ruleMacroBody1663);
                    this_ExportDecl_1=ruleExportDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ExportDecl_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:677:6: (otherlv_2= 'import' this_Sig_3= ruleSig ( (lv_fp_4_0= ruleFromPart ) )? )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:677:6: (otherlv_2= 'import' this_Sig_3= ruleSig ( (lv_fp_4_0= ruleFromPart ) )? )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:677:8: otherlv_2= 'import' this_Sig_3= ruleSig ( (lv_fp_4_0= ruleFromPart ) )?
                    {
                    otherlv_2=(Token)match(input,81,FOLLOW_81_in_ruleMacroBody1681); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getMacroBodyAccess().getImportKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMacroBodyAccess().getSigParserRuleCall_2_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSig_in_ruleMacroBody1703);
                    this_Sig_3=ruleSig();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Sig_3; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:690:1: ( (lv_fp_4_0= ruleFromPart ) )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==84) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:691:1: (lv_fp_4_0= ruleFromPart )
                            {
                            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:691:1: (lv_fp_4_0= ruleFromPart )
                            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:692:3: lv_fp_4_0= ruleFromPart
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getMacroBodyAccess().getFpFromPartParserRuleCall_2_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleFromPart_in_ruleMacroBody1723);
                            lv_fp_4_0=ruleFromPart();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getMacroBodyRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"fp",
                                      		lv_fp_4_0, 
                                      		"FromPart");
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
    // $ANTLR end "ruleMacroBody"


    // $ANTLR start "entryRuleSig"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:719:1: entryRuleSig returns [EObject current=null] : iv_ruleSig= ruleSig EOF ;
    public final EObject entryRuleSig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSig = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:723:2: (iv_ruleSig= ruleSig EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:724:2: iv_ruleSig= ruleSig EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSigRule()); 
            }
            pushFollow(FOLLOW_ruleSig_in_entryRuleSig1771);
            iv_ruleSig=ruleSig();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSig; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSig1781); if (state.failed) return current;

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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:734:1: ruleSig returns [EObject current=null] : (this_DeclBinding_0= ruleDeclBinding | this_Block_1= ruleBlock ) ;
    public final EObject ruleSig() throws RecognitionException {
        EObject current = null;

        EObject this_DeclBinding_0 = null;

        EObject this_Block_1 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:738:28: ( (this_DeclBinding_0= ruleDeclBinding | this_Block_1= ruleBlock ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:739:1: (this_DeclBinding_0= ruleDeclBinding | this_Block_1= ruleBlock )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:739:1: (this_DeclBinding_0= ruleDeclBinding | this_Block_1= ruleBlock )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==96) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_KW_OCURLY) ) {
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
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:740:5: this_DeclBinding_0= ruleDeclBinding
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSigAccess().getDeclBindingParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDeclBinding_in_ruleSig1832);
                    this_DeclBinding_0=ruleDeclBinding();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DeclBinding_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:750:5: this_Block_1= ruleBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSigAccess().getBlockParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBlock_in_ruleSig1859);
                    this_Block_1=ruleBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Block_1; 
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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:769:1: entryRuleDeclPart returns [String current=null] : iv_ruleDeclPart= ruleDeclPart EOF ;
    public final String entryRuleDeclPart() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDeclPart = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:773:2: (iv_ruleDeclPart= ruleDeclPart EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:774:2: iv_ruleDeclPart= ruleDeclPart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclPartRule()); 
            }
            pushFollow(FOLLOW_ruleDeclPart_in_entryRuleDeclPart1905);
            iv_ruleDeclPart=ruleDeclPart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeclPart.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclPart1916); if (state.failed) return current;

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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:784:1: ruleDeclPart returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_KW_COLON_0= RULE_KW_COLON this_Type_1= ruleType ) | (this_KW_COLONSTAR_2= RULE_KW_COLONSTAR this_Type_3= ruleType ) ) ;
    public final AntlrDatatypeRuleToken ruleDeclPart() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_KW_COLON_0=null;
        Token this_KW_COLONSTAR_2=null;
        AntlrDatatypeRuleToken this_Type_1 = null;

        AntlrDatatypeRuleToken this_Type_3 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:788:28: ( ( (this_KW_COLON_0= RULE_KW_COLON this_Type_1= ruleType ) | (this_KW_COLONSTAR_2= RULE_KW_COLONSTAR this_Type_3= ruleType ) ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:789:1: ( (this_KW_COLON_0= RULE_KW_COLON this_Type_1= ruleType ) | (this_KW_COLONSTAR_2= RULE_KW_COLONSTAR this_Type_3= ruleType ) )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:789:1: ( (this_KW_COLON_0= RULE_KW_COLON this_Type_1= ruleType ) | (this_KW_COLONSTAR_2= RULE_KW_COLONSTAR this_Type_3= ruleType ) )
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
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:789:2: (this_KW_COLON_0= RULE_KW_COLON this_Type_1= ruleType )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:789:2: (this_KW_COLON_0= RULE_KW_COLON this_Type_1= ruleType )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:789:7: this_KW_COLON_0= RULE_KW_COLON this_Type_1= ruleType
                    {
                    this_KW_COLON_0=(Token)match(input,RULE_KW_COLON,FOLLOW_RULE_KW_COLON_in_ruleDeclPart1961); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_KW_COLON_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_COLON_0, grammarAccess.getDeclPartAccess().getKW_COLONTerminalRuleCall_0_0()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclPartAccess().getTypeParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleType_in_ruleDeclPart1988);
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
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:808:6: (this_KW_COLONSTAR_2= RULE_KW_COLONSTAR this_Type_3= ruleType )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:808:6: (this_KW_COLONSTAR_2= RULE_KW_COLONSTAR this_Type_3= ruleType )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:808:11: this_KW_COLONSTAR_2= RULE_KW_COLONSTAR this_Type_3= ruleType
                    {
                    this_KW_COLONSTAR_2=(Token)match(input,RULE_KW_COLONSTAR,FOLLOW_RULE_KW_COLONSTAR_in_ruleDeclPart2016); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_KW_COLONSTAR_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_COLONSTAR_2, grammarAccess.getDeclPartAccess().getKW_COLONSTARTerminalRuleCall_1_0()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclPartAccess().getTypeParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleType_in_ruleDeclPart2043);
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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:837:1: entryRuleComma returns [EObject current=null] : iv_ruleComma= ruleComma EOF ;
    public final EObject entryRuleComma() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComma = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:841:2: (iv_ruleComma= ruleComma EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:842:2: iv_ruleComma= ruleComma EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommaRule()); 
            }
            pushFollow(FOLLOW_ruleComma_in_entryRuleComma2099);
            iv_ruleComma=ruleComma();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComma; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComma2109); if (state.failed) return current;

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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:852:1: ruleComma returns [EObject current=null] : this_enlist1_CommaItem_Comma_AB_0= ruleenlist1_CommaItem_Comma_AB ;
    public final EObject ruleComma() throws RecognitionException {
        EObject current = null;

        EObject this_enlist1_CommaItem_Comma_AB_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:856:28: (this_enlist1_CommaItem_Comma_AB_0= ruleenlist1_CommaItem_Comma_AB )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:858:5: this_enlist1_CommaItem_Comma_AB_0= ruleenlist1_CommaItem_Comma_AB
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCommaAccess().getEnlist1_CommaItem_Comma_ABParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleenlist1_CommaItem_Comma_AB_in_ruleComma2159);
            this_enlist1_CommaItem_Comma_AB_0=ruleenlist1_CommaItem_Comma_AB();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_enlist1_CommaItem_Comma_AB_0; 
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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:877:1: entryRuleCommaItem returns [EObject current=null] : iv_ruleCommaItem= ruleCommaItem EOF ;
    public final EObject entryRuleCommaItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommaItem = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:881:2: (iv_ruleCommaItem= ruleCommaItem EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:882:2: iv_ruleCommaItem= ruleCommaItem EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommaItemRule()); 
            }
            pushFollow(FOLLOW_ruleCommaItem_in_entryRuleCommaItem2203);
            iv_ruleCommaItem=ruleCommaItem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommaItem; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommaItem2213); if (state.failed) return current;

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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:892:1: ruleCommaItem returns [EObject current=null] : (this_Binding_AnyStatement_0= ruleBinding_AnyStatement ( ( ( 'where' ( ( ruleCommaItem ) ) ) )=> (otherlv_1= 'where' ( (lv_ci_2_0= ruleCommaItem ) ) ) )* ) ;
    public final EObject ruleCommaItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_Binding_AnyStatement_0 = null;

        EObject lv_ci_2_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:896:28: ( (this_Binding_AnyStatement_0= ruleBinding_AnyStatement ( ( ( 'where' ( ( ruleCommaItem ) ) ) )=> (otherlv_1= 'where' ( (lv_ci_2_0= ruleCommaItem ) ) ) )* ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:897:1: (this_Binding_AnyStatement_0= ruleBinding_AnyStatement ( ( ( 'where' ( ( ruleCommaItem ) ) ) )=> (otherlv_1= 'where' ( (lv_ci_2_0= ruleCommaItem ) ) ) )* )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:897:1: (this_Binding_AnyStatement_0= ruleBinding_AnyStatement ( ( ( 'where' ( ( ruleCommaItem ) ) ) )=> (otherlv_1= 'where' ( (lv_ci_2_0= ruleCommaItem ) ) ) )* )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:898:5: this_Binding_AnyStatement_0= ruleBinding_AnyStatement ( ( ( 'where' ( ( ruleCommaItem ) ) ) )=> (otherlv_1= 'where' ( (lv_ci_2_0= ruleCommaItem ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCommaItemAccess().getBinding_AnyStatementParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBinding_AnyStatement_in_ruleCommaItem2264);
            this_Binding_AnyStatement_0=ruleBinding_AnyStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Binding_AnyStatement_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:906:1: ( ( ( 'where' ( ( ruleCommaItem ) ) ) )=> (otherlv_1= 'where' ( (lv_ci_2_0= ruleCommaItem ) ) ) )*
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
            	    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:906:2: ( ( 'where' ( ( ruleCommaItem ) ) ) )=> (otherlv_1= 'where' ( (lv_ci_2_0= ruleCommaItem ) ) )
            	    {
            	    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:911:6: (otherlv_1= 'where' ( (lv_ci_2_0= ruleCommaItem ) ) )
            	    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:911:8: otherlv_1= 'where' ( (lv_ci_2_0= ruleCommaItem ) )
            	    {
            	    otherlv_1=(Token)match(input,85,FOLLOW_85_in_ruleCommaItem2295); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getCommaItemAccess().getWhereKeyword_1_0_0());
            	          
            	    }
            	    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:915:1: ( (lv_ci_2_0= ruleCommaItem ) )
            	    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:916:1: (lv_ci_2_0= ruleCommaItem )
            	    {
            	    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:916:1: (lv_ci_2_0= ruleCommaItem )
            	    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:917:3: lv_ci_2_0= ruleCommaItem
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCommaItemAccess().getCiCommaItemParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleCommaItem_in_ruleCommaItem2316);
            	    lv_ci_2_0=ruleCommaItem();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCommaItemRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"ci",
            	              		lv_ci_2_0, 
            	              		"CommaItem");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:944:1: entryRuleDeclBinding returns [EObject current=null] : iv_ruleDeclBinding= ruleDeclBinding EOF ;
    public final EObject entryRuleDeclBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclBinding = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:948:2: (iv_ruleDeclBinding= ruleDeclBinding EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:949:2: iv_ruleDeclBinding= ruleDeclBinding EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclBindingRule()); 
            }
            pushFollow(FOLLOW_ruleDeclBinding_in_entryRuleDeclBinding2365);
            iv_ruleDeclBinding=ruleDeclBinding();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeclBinding; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclBinding2375); if (state.failed) return current;

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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:959:1: ruleDeclBinding returns [EObject current=null] : this_BindingR_InfixedExprsDecl_AnyStatement_0= ruleBindingR_InfixedExprsDecl_AnyStatement ;
    public final EObject ruleDeclBinding() throws RecognitionException {
        EObject current = null;

        EObject this_BindingR_InfixedExprsDecl_AnyStatement_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:963:28: (this_BindingR_InfixedExprsDecl_AnyStatement_0= ruleBindingR_InfixedExprsDecl_AnyStatement )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:965:5: this_BindingR_InfixedExprsDecl_AnyStatement_0= ruleBindingR_InfixedExprsDecl_AnyStatement
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDeclBindingAccess().getBindingR_InfixedExprsDecl_AnyStatementParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleBindingR_InfixedExprsDecl_AnyStatement_in_ruleDeclBinding2425);
            this_BindingR_InfixedExprsDecl_AnyStatement_0=ruleBindingR_InfixedExprsDecl_AnyStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BindingR_InfixedExprsDecl_AnyStatement_0; 
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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:984:1: entryRuleInfixedExprsDecl returns [String current=null] : iv_ruleInfixedExprsDecl= ruleInfixedExprsDecl EOF ;
    public final String entryRuleInfixedExprsDecl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInfixedExprsDecl = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:988:2: (iv_ruleInfixedExprsDecl= ruleInfixedExprsDecl EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:989:2: iv_ruleInfixedExprsDecl= ruleInfixedExprsDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInfixedExprsDeclRule()); 
            }
            pushFollow(FOLLOW_ruleInfixedExprsDecl_in_entryRuleInfixedExprsDecl2470);
            iv_ruleInfixedExprsDecl=ruleInfixedExprsDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInfixedExprsDecl.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInfixedExprsDecl2481); if (state.failed) return current;

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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:999:1: ruleInfixedExprsDecl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_InfixedExprs_0= ruleInfixedExprs (this_DeclPart_1= ruleDeclPart )* ) ;
    public final AntlrDatatypeRuleToken ruleInfixedExprsDecl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_InfixedExprs_0 = null;

        AntlrDatatypeRuleToken this_DeclPart_1 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1003:28: ( (this_InfixedExprs_0= ruleInfixedExprs (this_DeclPart_1= ruleDeclPart )* ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1004:1: (this_InfixedExprs_0= ruleInfixedExprs (this_DeclPart_1= ruleDeclPart )* )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1004:1: (this_InfixedExprs_0= ruleInfixedExprs (this_DeclPart_1= ruleDeclPart )* )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1005:5: this_InfixedExprs_0= ruleInfixedExprs (this_DeclPart_1= ruleDeclPart )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getInfixedExprsDeclAccess().getInfixedExprsParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleInfixedExprs_in_ruleInfixedExprsDecl2532);
            this_InfixedExprs_0=ruleInfixedExprs();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_InfixedExprs_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1015:1: (this_DeclPart_1= ruleDeclPart )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=RULE_KW_COLON && LA17_0<=RULE_KW_COLONSTAR)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1016:5: this_DeclPart_1= ruleDeclPart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getInfixedExprsDeclAccess().getDeclPartParserRuleCall_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleDeclPart_in_ruleInfixedExprsDecl2560);
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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1037:1: entryRuleInfixedExprs returns [String current=null] : iv_ruleInfixedExprs= ruleInfixedExprs EOF ;
    public final String entryRuleInfixedExprs() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInfixedExprs = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1041:2: (iv_ruleInfixedExprs= ruleInfixedExprs EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1042:2: iv_ruleInfixedExprs= ruleInfixedExprs EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInfixedExprsRule()); 
            }
            pushFollow(FOLLOW_ruleInfixedExprs_in_entryRuleInfixedExprs2618);
            iv_ruleInfixedExprs=ruleInfixedExprs();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInfixedExprs.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInfixedExprs2629); if (state.failed) return current;

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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1052:1: ruleInfixedExprs returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_enlist1_InfixedExpr_Comma_AB_0= ruleenlist1_InfixedExpr_Comma_AB ;
    public final AntlrDatatypeRuleToken ruleInfixedExprs() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_enlist1_InfixedExpr_Comma_AB_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1056:28: (this_enlist1_InfixedExpr_Comma_AB_0= ruleenlist1_InfixedExpr_Comma_AB )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1058:5: this_enlist1_InfixedExpr_Comma_AB_0= ruleenlist1_InfixedExpr_Comma_AB
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getInfixedExprsAccess().getEnlist1_InfixedExpr_Comma_ABParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleenlist1_InfixedExpr_Comma_AB_in_ruleInfixedExprs2679);
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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1079:1: entryRuleBinding_AnyStatement returns [EObject current=null] : iv_ruleBinding_AnyStatement= ruleBinding_AnyStatement EOF ;
    public final EObject entryRuleBinding_AnyStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinding_AnyStatement = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1083:2: (iv_ruleBinding_AnyStatement= ruleBinding_AnyStatement EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1084:2: iv_ruleBinding_AnyStatement= ruleBinding_AnyStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBinding_AnyStatementRule()); 
            }
            pushFollow(FOLLOW_ruleBinding_AnyStatement_in_entryRuleBinding_AnyStatement2733);
            iv_ruleBinding_AnyStatement=ruleBinding_AnyStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBinding_AnyStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinding_AnyStatement2743); if (state.failed) return current;

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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1094:1: ruleBinding_AnyStatement returns [EObject current=null] : this_BindingL_Infixed_AnyStatement_0= ruleBindingL_Infixed_AnyStatement ;
    public final EObject ruleBinding_AnyStatement() throws RecognitionException {
        EObject current = null;

        EObject this_BindingL_Infixed_AnyStatement_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1098:28: (this_BindingL_Infixed_AnyStatement_0= ruleBindingL_Infixed_AnyStatement )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1100:5: this_BindingL_Infixed_AnyStatement_0= ruleBindingL_Infixed_AnyStatement
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBinding_AnyStatementAccess().getBindingL_Infixed_AnyStatementParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleBindingL_Infixed_AnyStatement_in_ruleBinding_AnyStatement2793);
            this_BindingL_Infixed_AnyStatement_0=ruleBindingL_Infixed_AnyStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BindingL_Infixed_AnyStatement_0; 
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


    // $ANTLR start "entryRuleBinding_BalStatement"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1119:1: entryRuleBinding_BalStatement returns [EObject current=null] : iv_ruleBinding_BalStatement= ruleBinding_BalStatement EOF ;
    public final EObject entryRuleBinding_BalStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinding_BalStatement = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1123:2: (iv_ruleBinding_BalStatement= ruleBinding_BalStatement EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1124:2: iv_ruleBinding_BalStatement= ruleBinding_BalStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBinding_BalStatementRule()); 
            }
            pushFollow(FOLLOW_ruleBinding_BalStatement_in_entryRuleBinding_BalStatement2837);
            iv_ruleBinding_BalStatement=ruleBinding_BalStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBinding_BalStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinding_BalStatement2847); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBinding_BalStatement"


    // $ANTLR start "ruleBinding_BalStatement"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1134:1: ruleBinding_BalStatement returns [EObject current=null] : this_BindingL_Infixed_BalStatement_0= ruleBindingL_Infixed_BalStatement ;
    public final EObject ruleBinding_BalStatement() throws RecognitionException {
        EObject current = null;

        EObject this_BindingL_Infixed_BalStatement_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1138:28: (this_BindingL_Infixed_BalStatement_0= ruleBindingL_Infixed_BalStatement )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1140:5: this_BindingL_Infixed_BalStatement_0= ruleBindingL_Infixed_BalStatement
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBinding_BalStatementAccess().getBindingL_Infixed_BalStatementParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleBindingL_Infixed_BalStatement_in_ruleBinding_BalStatement2897);
            this_BindingL_Infixed_BalStatement_0=ruleBindingL_Infixed_BalStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BindingL_Infixed_BalStatement_0; 
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
    // $ANTLR end "ruleBinding_BalStatement"


    // $ANTLR start "entryRuleBinding_Collection"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1159:1: entryRuleBinding_Collection returns [EObject current=null] : iv_ruleBinding_Collection= ruleBinding_Collection EOF ;
    public final EObject entryRuleBinding_Collection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinding_Collection = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1163:2: (iv_ruleBinding_Collection= ruleBinding_Collection EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1164:2: iv_ruleBinding_Collection= ruleBinding_Collection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBinding_CollectionRule()); 
            }
            pushFollow(FOLLOW_ruleBinding_Collection_in_entryRuleBinding_Collection2941);
            iv_ruleBinding_Collection=ruleBinding_Collection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBinding_Collection; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinding_Collection2951); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBinding_Collection"


    // $ANTLR start "ruleBinding_Collection"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1174:1: ruleBinding_Collection returns [EObject current=null] : this_BindingL_Infixed_Collection_0= ruleBindingL_Infixed_Collection ;
    public final EObject ruleBinding_Collection() throws RecognitionException {
        EObject current = null;

        EObject this_BindingL_Infixed_Collection_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1178:28: (this_BindingL_Infixed_Collection_0= ruleBindingL_Infixed_Collection )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1180:5: this_BindingL_Infixed_Collection_0= ruleBindingL_Infixed_Collection
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBinding_CollectionAccess().getBindingL_Infixed_CollectionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleBindingL_Infixed_Collection_in_ruleBinding_Collection3001);
            this_BindingL_Infixed_Collection_0=ruleBindingL_Infixed_Collection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BindingL_Infixed_Collection_0; 
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
    // $ANTLR end "ruleBinding_Collection"


    // $ANTLR start "entryRuleBindingL_Infixed_AnyStatement"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1199:1: entryRuleBindingL_Infixed_AnyStatement returns [EObject current=null] : iv_ruleBindingL_Infixed_AnyStatement= ruleBindingL_Infixed_AnyStatement EOF ;
    public final EObject entryRuleBindingL_Infixed_AnyStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBindingL_Infixed_AnyStatement = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1203:2: (iv_ruleBindingL_Infixed_AnyStatement= ruleBindingL_Infixed_AnyStatement EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1204:2: iv_ruleBindingL_Infixed_AnyStatement= ruleBindingL_Infixed_AnyStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBindingL_Infixed_AnyStatementRule()); 
            }
            pushFollow(FOLLOW_ruleBindingL_Infixed_AnyStatement_in_entryRuleBindingL_Infixed_AnyStatement3045);
            iv_ruleBindingL_Infixed_AnyStatement=ruleBindingL_Infixed_AnyStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBindingL_Infixed_AnyStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBindingL_Infixed_AnyStatement3055); if (state.failed) return current;

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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1214:1: ruleBindingL_Infixed_AnyStatement returns [EObject current=null] : ( ruleAnyStatement | ( ruleInfixed otherlv_2= 'assign' ( (lv_bia_3_0= ruleBindingL_Infixed_AnyStatement ) ) ) | ( ruleInfixed this_KW_2EQ_5= RULE_KW_2EQ ( (lv_bia_6_0= ruleBindingL_Infixed_AnyStatement ) ) ) | ( ruleInfixed this_KW_MARROW_8= RULE_KW_MARROW ( (lv_bia_9_0= ruleBindingL_Infixed_AnyStatement ) ) ) | ( ruleInfixed this_KW_MAPSTO_11= RULE_KW_MAPSTO ( (lv_bia_12_0= ruleBindingL_Infixed_AnyStatement ) ) ) | ( ruleInfixed this_KW_MAPSTOSTAR_14= RULE_KW_MAPSTOSTAR ( (lv_bia_15_0= ruleBindingL_Infixed_AnyStatement ) ) ) ) ;
    public final EObject ruleBindingL_Infixed_AnyStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token this_KW_2EQ_5=null;
        Token this_KW_MARROW_8=null;
        Token this_KW_MAPSTO_11=null;
        Token this_KW_MAPSTOSTAR_14=null;
        EObject lv_bia_3_0 = null;

        EObject lv_bia_6_0 = null;

        EObject lv_bia_9_0 = null;

        EObject lv_bia_12_0 = null;

        EObject lv_bia_15_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1218:28: ( ( ruleAnyStatement | ( ruleInfixed otherlv_2= 'assign' ( (lv_bia_3_0= ruleBindingL_Infixed_AnyStatement ) ) ) | ( ruleInfixed this_KW_2EQ_5= RULE_KW_2EQ ( (lv_bia_6_0= ruleBindingL_Infixed_AnyStatement ) ) ) | ( ruleInfixed this_KW_MARROW_8= RULE_KW_MARROW ( (lv_bia_9_0= ruleBindingL_Infixed_AnyStatement ) ) ) | ( ruleInfixed this_KW_MAPSTO_11= RULE_KW_MAPSTO ( (lv_bia_12_0= ruleBindingL_Infixed_AnyStatement ) ) ) | ( ruleInfixed this_KW_MAPSTOSTAR_14= RULE_KW_MAPSTOSTAR ( (lv_bia_15_0= ruleBindingL_Infixed_AnyStatement ) ) ) ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1219:1: ( ruleAnyStatement | ( ruleInfixed otherlv_2= 'assign' ( (lv_bia_3_0= ruleBindingL_Infixed_AnyStatement ) ) ) | ( ruleInfixed this_KW_2EQ_5= RULE_KW_2EQ ( (lv_bia_6_0= ruleBindingL_Infixed_AnyStatement ) ) ) | ( ruleInfixed this_KW_MARROW_8= RULE_KW_MARROW ( (lv_bia_9_0= ruleBindingL_Infixed_AnyStatement ) ) ) | ( ruleInfixed this_KW_MAPSTO_11= RULE_KW_MAPSTO ( (lv_bia_12_0= ruleBindingL_Infixed_AnyStatement ) ) ) | ( ruleInfixed this_KW_MAPSTOSTAR_14= RULE_KW_MAPSTOSTAR ( (lv_bia_15_0= ruleBindingL_Infixed_AnyStatement ) ) ) )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1219:1: ( ruleAnyStatement | ( ruleInfixed otherlv_2= 'assign' ( (lv_bia_3_0= ruleBindingL_Infixed_AnyStatement ) ) ) | ( ruleInfixed this_KW_2EQ_5= RULE_KW_2EQ ( (lv_bia_6_0= ruleBindingL_Infixed_AnyStatement ) ) ) | ( ruleInfixed this_KW_MARROW_8= RULE_KW_MARROW ( (lv_bia_9_0= ruleBindingL_Infixed_AnyStatement ) ) ) | ( ruleInfixed this_KW_MAPSTO_11= RULE_KW_MAPSTO ( (lv_bia_12_0= ruleBindingL_Infixed_AnyStatement ) ) ) | ( ruleInfixed this_KW_MAPSTOSTAR_14= RULE_KW_MAPSTOSTAR ( (lv_bia_15_0= ruleBindingL_Infixed_AnyStatement ) ) ) )
            int alt18=6;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==87) ) {
                alt18=1;
            }
            else if ( (LA18_0==95) ) {
                switch ( input.LA(2) ) {
                case 86:
                    {
                    alt18=2;
                    }
                    break;
                case RULE_KW_MAPSTO:
                    {
                    alt18=5;
                    }
                    break;
                case RULE_KW_2EQ:
                    {
                    alt18=3;
                    }
                    break;
                case RULE_KW_MAPSTOSTAR:
                    {
                    alt18=6;
                    }
                    break;
                case RULE_KW_MARROW:
                    {
                    alt18=4;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 2, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1220:5: ruleAnyStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBindingL_Infixed_AnyStatementAccess().getAnyStatementParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAnyStatement_in_ruleBindingL_Infixed_AnyStatement3100);
                    ruleAnyStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1228:6: ( ruleInfixed otherlv_2= 'assign' ( (lv_bia_3_0= ruleBindingL_Infixed_AnyStatement ) ) )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1228:6: ( ruleInfixed otherlv_2= 'assign' ( (lv_bia_3_0= ruleBindingL_Infixed_AnyStatement ) ) )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1229:5: ruleInfixed otherlv_2= 'assign' ( (lv_bia_3_0= ruleBindingL_Infixed_AnyStatement ) )
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBindingL_Infixed_AnyStatementAccess().getInfixedParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInfixed_in_ruleBindingL_Infixed_AnyStatement3122);
                    ruleInfixed();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_2=(Token)match(input,86,FOLLOW_86_in_ruleBindingL_Infixed_AnyStatement3133); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getBindingL_Infixed_AnyStatementAccess().getAssignKeyword_1_1());
                          
                    }
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1240:1: ( (lv_bia_3_0= ruleBindingL_Infixed_AnyStatement ) )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1241:1: (lv_bia_3_0= ruleBindingL_Infixed_AnyStatement )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1241:1: (lv_bia_3_0= ruleBindingL_Infixed_AnyStatement )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1242:3: lv_bia_3_0= ruleBindingL_Infixed_AnyStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBindingL_Infixed_AnyStatementAccess().getBiaBindingL_Infixed_AnyStatementParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBindingL_Infixed_AnyStatement_in_ruleBindingL_Infixed_AnyStatement3154);
                    lv_bia_3_0=ruleBindingL_Infixed_AnyStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBindingL_Infixed_AnyStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"bia",
                              		lv_bia_3_0, 
                              		"BindingL_Infixed_AnyStatement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1259:6: ( ruleInfixed this_KW_2EQ_5= RULE_KW_2EQ ( (lv_bia_6_0= ruleBindingL_Infixed_AnyStatement ) ) )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1259:6: ( ruleInfixed this_KW_2EQ_5= RULE_KW_2EQ ( (lv_bia_6_0= ruleBindingL_Infixed_AnyStatement ) ) )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1260:5: ruleInfixed this_KW_2EQ_5= RULE_KW_2EQ ( (lv_bia_6_0= ruleBindingL_Infixed_AnyStatement ) )
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBindingL_Infixed_AnyStatementAccess().getInfixedParserRuleCall_2_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInfixed_in_ruleBindingL_Infixed_AnyStatement3178);
                    ruleInfixed();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    this_KW_2EQ_5=(Token)match(input,RULE_KW_2EQ,FOLLOW_RULE_KW_2EQ_in_ruleBindingL_Infixed_AnyStatement3188); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_2EQ_5, grammarAccess.getBindingL_Infixed_AnyStatementAccess().getKW_2EQTerminalRuleCall_2_1()); 
                          
                    }
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1271:1: ( (lv_bia_6_0= ruleBindingL_Infixed_AnyStatement ) )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1272:1: (lv_bia_6_0= ruleBindingL_Infixed_AnyStatement )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1272:1: (lv_bia_6_0= ruleBindingL_Infixed_AnyStatement )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1273:3: lv_bia_6_0= ruleBindingL_Infixed_AnyStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBindingL_Infixed_AnyStatementAccess().getBiaBindingL_Infixed_AnyStatementParserRuleCall_2_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBindingL_Infixed_AnyStatement_in_ruleBindingL_Infixed_AnyStatement3208);
                    lv_bia_6_0=ruleBindingL_Infixed_AnyStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBindingL_Infixed_AnyStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"bia",
                              		lv_bia_6_0, 
                              		"BindingL_Infixed_AnyStatement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1290:6: ( ruleInfixed this_KW_MARROW_8= RULE_KW_MARROW ( (lv_bia_9_0= ruleBindingL_Infixed_AnyStatement ) ) )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1290:6: ( ruleInfixed this_KW_MARROW_8= RULE_KW_MARROW ( (lv_bia_9_0= ruleBindingL_Infixed_AnyStatement ) ) )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1291:5: ruleInfixed this_KW_MARROW_8= RULE_KW_MARROW ( (lv_bia_9_0= ruleBindingL_Infixed_AnyStatement ) )
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBindingL_Infixed_AnyStatementAccess().getInfixedParserRuleCall_3_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInfixed_in_ruleBindingL_Infixed_AnyStatement3232);
                    ruleInfixed();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    this_KW_MARROW_8=(Token)match(input,RULE_KW_MARROW,FOLLOW_RULE_KW_MARROW_in_ruleBindingL_Infixed_AnyStatement3242); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_MARROW_8, grammarAccess.getBindingL_Infixed_AnyStatementAccess().getKW_MARROWTerminalRuleCall_3_1()); 
                          
                    }
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1302:1: ( (lv_bia_9_0= ruleBindingL_Infixed_AnyStatement ) )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1303:1: (lv_bia_9_0= ruleBindingL_Infixed_AnyStatement )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1303:1: (lv_bia_9_0= ruleBindingL_Infixed_AnyStatement )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1304:3: lv_bia_9_0= ruleBindingL_Infixed_AnyStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBindingL_Infixed_AnyStatementAccess().getBiaBindingL_Infixed_AnyStatementParserRuleCall_3_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBindingL_Infixed_AnyStatement_in_ruleBindingL_Infixed_AnyStatement3262);
                    lv_bia_9_0=ruleBindingL_Infixed_AnyStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBindingL_Infixed_AnyStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"bia",
                              		lv_bia_9_0, 
                              		"BindingL_Infixed_AnyStatement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1321:6: ( ruleInfixed this_KW_MAPSTO_11= RULE_KW_MAPSTO ( (lv_bia_12_0= ruleBindingL_Infixed_AnyStatement ) ) )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1321:6: ( ruleInfixed this_KW_MAPSTO_11= RULE_KW_MAPSTO ( (lv_bia_12_0= ruleBindingL_Infixed_AnyStatement ) ) )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1322:5: ruleInfixed this_KW_MAPSTO_11= RULE_KW_MAPSTO ( (lv_bia_12_0= ruleBindingL_Infixed_AnyStatement ) )
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBindingL_Infixed_AnyStatementAccess().getInfixedParserRuleCall_4_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInfixed_in_ruleBindingL_Infixed_AnyStatement3286);
                    ruleInfixed();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    this_KW_MAPSTO_11=(Token)match(input,RULE_KW_MAPSTO,FOLLOW_RULE_KW_MAPSTO_in_ruleBindingL_Infixed_AnyStatement3296); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_MAPSTO_11, grammarAccess.getBindingL_Infixed_AnyStatementAccess().getKW_MAPSTOTerminalRuleCall_4_1()); 
                          
                    }
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1333:1: ( (lv_bia_12_0= ruleBindingL_Infixed_AnyStatement ) )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1334:1: (lv_bia_12_0= ruleBindingL_Infixed_AnyStatement )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1334:1: (lv_bia_12_0= ruleBindingL_Infixed_AnyStatement )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1335:3: lv_bia_12_0= ruleBindingL_Infixed_AnyStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBindingL_Infixed_AnyStatementAccess().getBiaBindingL_Infixed_AnyStatementParserRuleCall_4_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBindingL_Infixed_AnyStatement_in_ruleBindingL_Infixed_AnyStatement3316);
                    lv_bia_12_0=ruleBindingL_Infixed_AnyStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBindingL_Infixed_AnyStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"bia",
                              		lv_bia_12_0, 
                              		"BindingL_Infixed_AnyStatement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1352:6: ( ruleInfixed this_KW_MAPSTOSTAR_14= RULE_KW_MAPSTOSTAR ( (lv_bia_15_0= ruleBindingL_Infixed_AnyStatement ) ) )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1352:6: ( ruleInfixed this_KW_MAPSTOSTAR_14= RULE_KW_MAPSTOSTAR ( (lv_bia_15_0= ruleBindingL_Infixed_AnyStatement ) ) )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1353:5: ruleInfixed this_KW_MAPSTOSTAR_14= RULE_KW_MAPSTOSTAR ( (lv_bia_15_0= ruleBindingL_Infixed_AnyStatement ) )
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBindingL_Infixed_AnyStatementAccess().getInfixedParserRuleCall_5_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInfixed_in_ruleBindingL_Infixed_AnyStatement3340);
                    ruleInfixed();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    this_KW_MAPSTOSTAR_14=(Token)match(input,RULE_KW_MAPSTOSTAR,FOLLOW_RULE_KW_MAPSTOSTAR_in_ruleBindingL_Infixed_AnyStatement3350); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_MAPSTOSTAR_14, grammarAccess.getBindingL_Infixed_AnyStatementAccess().getKW_MAPSTOSTARTerminalRuleCall_5_1()); 
                          
                    }
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1364:1: ( (lv_bia_15_0= ruleBindingL_Infixed_AnyStatement ) )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1365:1: (lv_bia_15_0= ruleBindingL_Infixed_AnyStatement )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1365:1: (lv_bia_15_0= ruleBindingL_Infixed_AnyStatement )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1366:3: lv_bia_15_0= ruleBindingL_Infixed_AnyStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBindingL_Infixed_AnyStatementAccess().getBiaBindingL_Infixed_AnyStatementParserRuleCall_5_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBindingL_Infixed_AnyStatement_in_ruleBindingL_Infixed_AnyStatement3370);
                    lv_bia_15_0=ruleBindingL_Infixed_AnyStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBindingL_Infixed_AnyStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"bia",
                              		lv_bia_15_0, 
                              		"BindingL_Infixed_AnyStatement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

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
    // $ANTLR end "ruleBindingL_Infixed_AnyStatement"


    // $ANTLR start "entryRuleBindingL_Infixed_BalStatement"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1393:1: entryRuleBindingL_Infixed_BalStatement returns [EObject current=null] : iv_ruleBindingL_Infixed_BalStatement= ruleBindingL_Infixed_BalStatement EOF ;
    public final EObject entryRuleBindingL_Infixed_BalStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBindingL_Infixed_BalStatement = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1397:2: (iv_ruleBindingL_Infixed_BalStatement= ruleBindingL_Infixed_BalStatement EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1398:2: iv_ruleBindingL_Infixed_BalStatement= ruleBindingL_Infixed_BalStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBindingL_Infixed_BalStatementRule()); 
            }
            pushFollow(FOLLOW_ruleBindingL_Infixed_BalStatement_in_entryRuleBindingL_Infixed_BalStatement3417);
            iv_ruleBindingL_Infixed_BalStatement=ruleBindingL_Infixed_BalStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBindingL_Infixed_BalStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBindingL_Infixed_BalStatement3427); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBindingL_Infixed_BalStatement"


    // $ANTLR start "ruleBindingL_Infixed_BalStatement"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1408:1: ruleBindingL_Infixed_BalStatement returns [EObject current=null] : ( ruleBalStatement | ( ruleInfixed otherlv_2= 'assign' ( (lv_bib_3_0= ruleBindingL_Infixed_BalStatement ) ) ) | ( ruleInfixed this_KW_2EQ_5= RULE_KW_2EQ ( (lv_bib_6_0= ruleBindingL_Infixed_BalStatement ) ) ) | ( ruleInfixed this_KW_MARROW_8= RULE_KW_MARROW ( (lv_bib_9_0= ruleBindingL_Infixed_BalStatement ) ) ) | ( ruleInfixed this_KW_MAPSTO_11= RULE_KW_MAPSTO ( (lv_bib_12_0= ruleBindingL_Infixed_BalStatement ) ) ) | ( ruleInfixed this_KW_MAPSTOSTAR_14= RULE_KW_MAPSTOSTAR ( (lv_bib_15_0= ruleBindingL_Infixed_BalStatement ) ) ) ) ;
    public final EObject ruleBindingL_Infixed_BalStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token this_KW_2EQ_5=null;
        Token this_KW_MARROW_8=null;
        Token this_KW_MAPSTO_11=null;
        Token this_KW_MAPSTOSTAR_14=null;
        EObject lv_bib_3_0 = null;

        EObject lv_bib_6_0 = null;

        EObject lv_bib_9_0 = null;

        EObject lv_bib_12_0 = null;

        EObject lv_bib_15_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1412:28: ( ( ruleBalStatement | ( ruleInfixed otherlv_2= 'assign' ( (lv_bib_3_0= ruleBindingL_Infixed_BalStatement ) ) ) | ( ruleInfixed this_KW_2EQ_5= RULE_KW_2EQ ( (lv_bib_6_0= ruleBindingL_Infixed_BalStatement ) ) ) | ( ruleInfixed this_KW_MARROW_8= RULE_KW_MARROW ( (lv_bib_9_0= ruleBindingL_Infixed_BalStatement ) ) ) | ( ruleInfixed this_KW_MAPSTO_11= RULE_KW_MAPSTO ( (lv_bib_12_0= ruleBindingL_Infixed_BalStatement ) ) ) | ( ruleInfixed this_KW_MAPSTOSTAR_14= RULE_KW_MAPSTOSTAR ( (lv_bib_15_0= ruleBindingL_Infixed_BalStatement ) ) ) ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1413:1: ( ruleBalStatement | ( ruleInfixed otherlv_2= 'assign' ( (lv_bib_3_0= ruleBindingL_Infixed_BalStatement ) ) ) | ( ruleInfixed this_KW_2EQ_5= RULE_KW_2EQ ( (lv_bib_6_0= ruleBindingL_Infixed_BalStatement ) ) ) | ( ruleInfixed this_KW_MARROW_8= RULE_KW_MARROW ( (lv_bib_9_0= ruleBindingL_Infixed_BalStatement ) ) ) | ( ruleInfixed this_KW_MAPSTO_11= RULE_KW_MAPSTO ( (lv_bib_12_0= ruleBindingL_Infixed_BalStatement ) ) ) | ( ruleInfixed this_KW_MAPSTOSTAR_14= RULE_KW_MAPSTOSTAR ( (lv_bib_15_0= ruleBindingL_Infixed_BalStatement ) ) ) )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1413:1: ( ruleBalStatement | ( ruleInfixed otherlv_2= 'assign' ( (lv_bib_3_0= ruleBindingL_Infixed_BalStatement ) ) ) | ( ruleInfixed this_KW_2EQ_5= RULE_KW_2EQ ( (lv_bib_6_0= ruleBindingL_Infixed_BalStatement ) ) ) | ( ruleInfixed this_KW_MARROW_8= RULE_KW_MARROW ( (lv_bib_9_0= ruleBindingL_Infixed_BalStatement ) ) ) | ( ruleInfixed this_KW_MAPSTO_11= RULE_KW_MAPSTO ( (lv_bib_12_0= ruleBindingL_Infixed_BalStatement ) ) ) | ( ruleInfixed this_KW_MAPSTOSTAR_14= RULE_KW_MAPSTOSTAR ( (lv_bib_15_0= ruleBindingL_Infixed_BalStatement ) ) ) )
            int alt19=6;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==88) ) {
                alt19=1;
            }
            else if ( (LA19_0==95) ) {
                switch ( input.LA(2) ) {
                case RULE_KW_MAPSTOSTAR:
                    {
                    alt19=6;
                    }
                    break;
                case RULE_KW_MARROW:
                    {
                    alt19=4;
                    }
                    break;
                case 86:
                    {
                    alt19=2;
                    }
                    break;
                case RULE_KW_MAPSTO:
                    {
                    alt19=5;
                    }
                    break;
                case RULE_KW_2EQ:
                    {
                    alt19=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 2, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1414:5: ruleBalStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBindingL_Infixed_BalStatementAccess().getBalStatementParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBalStatement_in_ruleBindingL_Infixed_BalStatement3472);
                    ruleBalStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1422:6: ( ruleInfixed otherlv_2= 'assign' ( (lv_bib_3_0= ruleBindingL_Infixed_BalStatement ) ) )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1422:6: ( ruleInfixed otherlv_2= 'assign' ( (lv_bib_3_0= ruleBindingL_Infixed_BalStatement ) ) )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1423:5: ruleInfixed otherlv_2= 'assign' ( (lv_bib_3_0= ruleBindingL_Infixed_BalStatement ) )
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBindingL_Infixed_BalStatementAccess().getInfixedParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInfixed_in_ruleBindingL_Infixed_BalStatement3494);
                    ruleInfixed();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_2=(Token)match(input,86,FOLLOW_86_in_ruleBindingL_Infixed_BalStatement3505); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getBindingL_Infixed_BalStatementAccess().getAssignKeyword_1_1());
                          
                    }
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1434:1: ( (lv_bib_3_0= ruleBindingL_Infixed_BalStatement ) )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1435:1: (lv_bib_3_0= ruleBindingL_Infixed_BalStatement )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1435:1: (lv_bib_3_0= ruleBindingL_Infixed_BalStatement )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1436:3: lv_bib_3_0= ruleBindingL_Infixed_BalStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBindingL_Infixed_BalStatementAccess().getBibBindingL_Infixed_BalStatementParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBindingL_Infixed_BalStatement_in_ruleBindingL_Infixed_BalStatement3526);
                    lv_bib_3_0=ruleBindingL_Infixed_BalStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBindingL_Infixed_BalStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"bib",
                              		lv_bib_3_0, 
                              		"BindingL_Infixed_BalStatement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1453:6: ( ruleInfixed this_KW_2EQ_5= RULE_KW_2EQ ( (lv_bib_6_0= ruleBindingL_Infixed_BalStatement ) ) )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1453:6: ( ruleInfixed this_KW_2EQ_5= RULE_KW_2EQ ( (lv_bib_6_0= ruleBindingL_Infixed_BalStatement ) ) )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1454:5: ruleInfixed this_KW_2EQ_5= RULE_KW_2EQ ( (lv_bib_6_0= ruleBindingL_Infixed_BalStatement ) )
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBindingL_Infixed_BalStatementAccess().getInfixedParserRuleCall_2_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInfixed_in_ruleBindingL_Infixed_BalStatement3550);
                    ruleInfixed();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    this_KW_2EQ_5=(Token)match(input,RULE_KW_2EQ,FOLLOW_RULE_KW_2EQ_in_ruleBindingL_Infixed_BalStatement3560); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_2EQ_5, grammarAccess.getBindingL_Infixed_BalStatementAccess().getKW_2EQTerminalRuleCall_2_1()); 
                          
                    }
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1465:1: ( (lv_bib_6_0= ruleBindingL_Infixed_BalStatement ) )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1466:1: (lv_bib_6_0= ruleBindingL_Infixed_BalStatement )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1466:1: (lv_bib_6_0= ruleBindingL_Infixed_BalStatement )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1467:3: lv_bib_6_0= ruleBindingL_Infixed_BalStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBindingL_Infixed_BalStatementAccess().getBibBindingL_Infixed_BalStatementParserRuleCall_2_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBindingL_Infixed_BalStatement_in_ruleBindingL_Infixed_BalStatement3580);
                    lv_bib_6_0=ruleBindingL_Infixed_BalStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBindingL_Infixed_BalStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"bib",
                              		lv_bib_6_0, 
                              		"BindingL_Infixed_BalStatement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1484:6: ( ruleInfixed this_KW_MARROW_8= RULE_KW_MARROW ( (lv_bib_9_0= ruleBindingL_Infixed_BalStatement ) ) )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1484:6: ( ruleInfixed this_KW_MARROW_8= RULE_KW_MARROW ( (lv_bib_9_0= ruleBindingL_Infixed_BalStatement ) ) )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1485:5: ruleInfixed this_KW_MARROW_8= RULE_KW_MARROW ( (lv_bib_9_0= ruleBindingL_Infixed_BalStatement ) )
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBindingL_Infixed_BalStatementAccess().getInfixedParserRuleCall_3_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInfixed_in_ruleBindingL_Infixed_BalStatement3604);
                    ruleInfixed();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    this_KW_MARROW_8=(Token)match(input,RULE_KW_MARROW,FOLLOW_RULE_KW_MARROW_in_ruleBindingL_Infixed_BalStatement3614); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_MARROW_8, grammarAccess.getBindingL_Infixed_BalStatementAccess().getKW_MARROWTerminalRuleCall_3_1()); 
                          
                    }
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1496:1: ( (lv_bib_9_0= ruleBindingL_Infixed_BalStatement ) )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1497:1: (lv_bib_9_0= ruleBindingL_Infixed_BalStatement )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1497:1: (lv_bib_9_0= ruleBindingL_Infixed_BalStatement )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1498:3: lv_bib_9_0= ruleBindingL_Infixed_BalStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBindingL_Infixed_BalStatementAccess().getBibBindingL_Infixed_BalStatementParserRuleCall_3_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBindingL_Infixed_BalStatement_in_ruleBindingL_Infixed_BalStatement3634);
                    lv_bib_9_0=ruleBindingL_Infixed_BalStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBindingL_Infixed_BalStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"bib",
                              		lv_bib_9_0, 
                              		"BindingL_Infixed_BalStatement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1515:6: ( ruleInfixed this_KW_MAPSTO_11= RULE_KW_MAPSTO ( (lv_bib_12_0= ruleBindingL_Infixed_BalStatement ) ) )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1515:6: ( ruleInfixed this_KW_MAPSTO_11= RULE_KW_MAPSTO ( (lv_bib_12_0= ruleBindingL_Infixed_BalStatement ) ) )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1516:5: ruleInfixed this_KW_MAPSTO_11= RULE_KW_MAPSTO ( (lv_bib_12_0= ruleBindingL_Infixed_BalStatement ) )
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBindingL_Infixed_BalStatementAccess().getInfixedParserRuleCall_4_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInfixed_in_ruleBindingL_Infixed_BalStatement3658);
                    ruleInfixed();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    this_KW_MAPSTO_11=(Token)match(input,RULE_KW_MAPSTO,FOLLOW_RULE_KW_MAPSTO_in_ruleBindingL_Infixed_BalStatement3668); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_MAPSTO_11, grammarAccess.getBindingL_Infixed_BalStatementAccess().getKW_MAPSTOTerminalRuleCall_4_1()); 
                          
                    }
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1527:1: ( (lv_bib_12_0= ruleBindingL_Infixed_BalStatement ) )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1528:1: (lv_bib_12_0= ruleBindingL_Infixed_BalStatement )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1528:1: (lv_bib_12_0= ruleBindingL_Infixed_BalStatement )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1529:3: lv_bib_12_0= ruleBindingL_Infixed_BalStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBindingL_Infixed_BalStatementAccess().getBibBindingL_Infixed_BalStatementParserRuleCall_4_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBindingL_Infixed_BalStatement_in_ruleBindingL_Infixed_BalStatement3688);
                    lv_bib_12_0=ruleBindingL_Infixed_BalStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBindingL_Infixed_BalStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"bib",
                              		lv_bib_12_0, 
                              		"BindingL_Infixed_BalStatement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1546:6: ( ruleInfixed this_KW_MAPSTOSTAR_14= RULE_KW_MAPSTOSTAR ( (lv_bib_15_0= ruleBindingL_Infixed_BalStatement ) ) )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1546:6: ( ruleInfixed this_KW_MAPSTOSTAR_14= RULE_KW_MAPSTOSTAR ( (lv_bib_15_0= ruleBindingL_Infixed_BalStatement ) ) )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1547:5: ruleInfixed this_KW_MAPSTOSTAR_14= RULE_KW_MAPSTOSTAR ( (lv_bib_15_0= ruleBindingL_Infixed_BalStatement ) )
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBindingL_Infixed_BalStatementAccess().getInfixedParserRuleCall_5_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInfixed_in_ruleBindingL_Infixed_BalStatement3712);
                    ruleInfixed();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    this_KW_MAPSTOSTAR_14=(Token)match(input,RULE_KW_MAPSTOSTAR,FOLLOW_RULE_KW_MAPSTOSTAR_in_ruleBindingL_Infixed_BalStatement3722); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_MAPSTOSTAR_14, grammarAccess.getBindingL_Infixed_BalStatementAccess().getKW_MAPSTOSTARTerminalRuleCall_5_1()); 
                          
                    }
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1558:1: ( (lv_bib_15_0= ruleBindingL_Infixed_BalStatement ) )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1559:1: (lv_bib_15_0= ruleBindingL_Infixed_BalStatement )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1559:1: (lv_bib_15_0= ruleBindingL_Infixed_BalStatement )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1560:3: lv_bib_15_0= ruleBindingL_Infixed_BalStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBindingL_Infixed_BalStatementAccess().getBibBindingL_Infixed_BalStatementParserRuleCall_5_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBindingL_Infixed_BalStatement_in_ruleBindingL_Infixed_BalStatement3742);
                    lv_bib_15_0=ruleBindingL_Infixed_BalStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBindingL_Infixed_BalStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"bib",
                              		lv_bib_15_0, 
                              		"BindingL_Infixed_BalStatement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

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
    // $ANTLR end "ruleBindingL_Infixed_BalStatement"


    // $ANTLR start "entryRuleBindingL_Infixed_Collection"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1587:1: entryRuleBindingL_Infixed_Collection returns [EObject current=null] : iv_ruleBindingL_Infixed_Collection= ruleBindingL_Infixed_Collection EOF ;
    public final EObject entryRuleBindingL_Infixed_Collection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBindingL_Infixed_Collection = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1591:2: (iv_ruleBindingL_Infixed_Collection= ruleBindingL_Infixed_Collection EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1592:2: iv_ruleBindingL_Infixed_Collection= ruleBindingL_Infixed_Collection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBindingL_Infixed_CollectionRule()); 
            }
            pushFollow(FOLLOW_ruleBindingL_Infixed_Collection_in_entryRuleBindingL_Infixed_Collection3789);
            iv_ruleBindingL_Infixed_Collection=ruleBindingL_Infixed_Collection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBindingL_Infixed_Collection; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBindingL_Infixed_Collection3799); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBindingL_Infixed_Collection"


    // $ANTLR start "ruleBindingL_Infixed_Collection"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1602:1: ruleBindingL_Infixed_Collection returns [EObject current=null] : (this_Collection_0= ruleCollection | ( ruleInfixed otherlv_2= 'assign' ( (lv_bic_3_0= ruleBindingL_Infixed_Collection ) ) ) | ( ruleInfixed this_KW_2EQ_5= RULE_KW_2EQ ( (lv_bic_6_0= ruleBindingL_Infixed_Collection ) ) ) | ( ruleInfixed this_KW_MARROW_8= RULE_KW_MARROW ( (lv_bic_9_0= ruleBindingL_Infixed_Collection ) ) ) | ( ruleInfixed this_KW_MAPSTO_11= RULE_KW_MAPSTO ( (lv_bic_12_0= ruleBindingL_Infixed_Collection ) ) ) | ( ruleInfixed this_KW_MAPSTOSTAR_14= RULE_KW_MAPSTOSTAR ( (lv_bic_15_0= ruleBindingL_Infixed_Collection ) ) ) ) ;
    public final EObject ruleBindingL_Infixed_Collection() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token this_KW_2EQ_5=null;
        Token this_KW_MARROW_8=null;
        Token this_KW_MAPSTO_11=null;
        Token this_KW_MAPSTOSTAR_14=null;
        EObject this_Collection_0 = null;

        EObject lv_bic_3_0 = null;

        EObject lv_bic_6_0 = null;

        EObject lv_bic_9_0 = null;

        EObject lv_bic_12_0 = null;

        EObject lv_bic_15_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1606:28: ( (this_Collection_0= ruleCollection | ( ruleInfixed otherlv_2= 'assign' ( (lv_bic_3_0= ruleBindingL_Infixed_Collection ) ) ) | ( ruleInfixed this_KW_2EQ_5= RULE_KW_2EQ ( (lv_bic_6_0= ruleBindingL_Infixed_Collection ) ) ) | ( ruleInfixed this_KW_MARROW_8= RULE_KW_MARROW ( (lv_bic_9_0= ruleBindingL_Infixed_Collection ) ) ) | ( ruleInfixed this_KW_MAPSTO_11= RULE_KW_MAPSTO ( (lv_bic_12_0= ruleBindingL_Infixed_Collection ) ) ) | ( ruleInfixed this_KW_MAPSTOSTAR_14= RULE_KW_MAPSTOSTAR ( (lv_bic_15_0= ruleBindingL_Infixed_Collection ) ) ) ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1607:1: (this_Collection_0= ruleCollection | ( ruleInfixed otherlv_2= 'assign' ( (lv_bic_3_0= ruleBindingL_Infixed_Collection ) ) ) | ( ruleInfixed this_KW_2EQ_5= RULE_KW_2EQ ( (lv_bic_6_0= ruleBindingL_Infixed_Collection ) ) ) | ( ruleInfixed this_KW_MARROW_8= RULE_KW_MARROW ( (lv_bic_9_0= ruleBindingL_Infixed_Collection ) ) ) | ( ruleInfixed this_KW_MAPSTO_11= RULE_KW_MAPSTO ( (lv_bic_12_0= ruleBindingL_Infixed_Collection ) ) ) | ( ruleInfixed this_KW_MAPSTOSTAR_14= RULE_KW_MAPSTOSTAR ( (lv_bic_15_0= ruleBindingL_Infixed_Collection ) ) ) )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1607:1: (this_Collection_0= ruleCollection | ( ruleInfixed otherlv_2= 'assign' ( (lv_bic_3_0= ruleBindingL_Infixed_Collection ) ) ) | ( ruleInfixed this_KW_2EQ_5= RULE_KW_2EQ ( (lv_bic_6_0= ruleBindingL_Infixed_Collection ) ) ) | ( ruleInfixed this_KW_MARROW_8= RULE_KW_MARROW ( (lv_bic_9_0= ruleBindingL_Infixed_Collection ) ) ) | ( ruleInfixed this_KW_MAPSTO_11= RULE_KW_MAPSTO ( (lv_bic_12_0= ruleBindingL_Infixed_Collection ) ) ) | ( ruleInfixed this_KW_MAPSTOSTAR_14= RULE_KW_MAPSTOSTAR ( (lv_bic_15_0= ruleBindingL_Infixed_Collection ) ) ) )
            int alt20=6;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==95) ) {
                switch ( input.LA(2) ) {
                case RULE_KW_MARROW:
                    {
                    alt20=4;
                    }
                    break;
                case EOF:
                case 93:
                    {
                    alt20=1;
                    }
                    break;
                case RULE_KW_2EQ:
                    {
                    alt20=3;
                    }
                    break;
                case RULE_KW_MAPSTO:
                    {
                    alt20=5;
                    }
                    break;
                case 86:
                    {
                    alt20=2;
                    }
                    break;
                case RULE_KW_MAPSTOSTAR:
                    {
                    alt20=6;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1608:5: this_Collection_0= ruleCollection
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBindingL_Infixed_CollectionAccess().getCollectionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCollection_in_ruleBindingL_Infixed_Collection3850);
                    this_Collection_0=ruleCollection();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Collection_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1617:6: ( ruleInfixed otherlv_2= 'assign' ( (lv_bic_3_0= ruleBindingL_Infixed_Collection ) ) )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1617:6: ( ruleInfixed otherlv_2= 'assign' ( (lv_bic_3_0= ruleBindingL_Infixed_Collection ) ) )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1618:5: ruleInfixed otherlv_2= 'assign' ( (lv_bic_3_0= ruleBindingL_Infixed_Collection ) )
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBindingL_Infixed_CollectionAccess().getInfixedParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInfixed_in_ruleBindingL_Infixed_Collection3872);
                    ruleInfixed();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_2=(Token)match(input,86,FOLLOW_86_in_ruleBindingL_Infixed_Collection3883); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getBindingL_Infixed_CollectionAccess().getAssignKeyword_1_1());
                          
                    }
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1629:1: ( (lv_bic_3_0= ruleBindingL_Infixed_Collection ) )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1630:1: (lv_bic_3_0= ruleBindingL_Infixed_Collection )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1630:1: (lv_bic_3_0= ruleBindingL_Infixed_Collection )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1631:3: lv_bic_3_0= ruleBindingL_Infixed_Collection
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBindingL_Infixed_CollectionAccess().getBicBindingL_Infixed_CollectionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBindingL_Infixed_Collection_in_ruleBindingL_Infixed_Collection3904);
                    lv_bic_3_0=ruleBindingL_Infixed_Collection();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBindingL_Infixed_CollectionRule());
                      	        }
                             		set(
                             			current, 
                             			"bic",
                              		lv_bic_3_0, 
                              		"BindingL_Infixed_Collection");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1648:6: ( ruleInfixed this_KW_2EQ_5= RULE_KW_2EQ ( (lv_bic_6_0= ruleBindingL_Infixed_Collection ) ) )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1648:6: ( ruleInfixed this_KW_2EQ_5= RULE_KW_2EQ ( (lv_bic_6_0= ruleBindingL_Infixed_Collection ) ) )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1649:5: ruleInfixed this_KW_2EQ_5= RULE_KW_2EQ ( (lv_bic_6_0= ruleBindingL_Infixed_Collection ) )
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBindingL_Infixed_CollectionAccess().getInfixedParserRuleCall_2_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInfixed_in_ruleBindingL_Infixed_Collection3928);
                    ruleInfixed();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    this_KW_2EQ_5=(Token)match(input,RULE_KW_2EQ,FOLLOW_RULE_KW_2EQ_in_ruleBindingL_Infixed_Collection3938); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_2EQ_5, grammarAccess.getBindingL_Infixed_CollectionAccess().getKW_2EQTerminalRuleCall_2_1()); 
                          
                    }
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1660:1: ( (lv_bic_6_0= ruleBindingL_Infixed_Collection ) )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1661:1: (lv_bic_6_0= ruleBindingL_Infixed_Collection )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1661:1: (lv_bic_6_0= ruleBindingL_Infixed_Collection )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1662:3: lv_bic_6_0= ruleBindingL_Infixed_Collection
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBindingL_Infixed_CollectionAccess().getBicBindingL_Infixed_CollectionParserRuleCall_2_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBindingL_Infixed_Collection_in_ruleBindingL_Infixed_Collection3958);
                    lv_bic_6_0=ruleBindingL_Infixed_Collection();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBindingL_Infixed_CollectionRule());
                      	        }
                             		set(
                             			current, 
                             			"bic",
                              		lv_bic_6_0, 
                              		"BindingL_Infixed_Collection");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1679:6: ( ruleInfixed this_KW_MARROW_8= RULE_KW_MARROW ( (lv_bic_9_0= ruleBindingL_Infixed_Collection ) ) )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1679:6: ( ruleInfixed this_KW_MARROW_8= RULE_KW_MARROW ( (lv_bic_9_0= ruleBindingL_Infixed_Collection ) ) )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1680:5: ruleInfixed this_KW_MARROW_8= RULE_KW_MARROW ( (lv_bic_9_0= ruleBindingL_Infixed_Collection ) )
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBindingL_Infixed_CollectionAccess().getInfixedParserRuleCall_3_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInfixed_in_ruleBindingL_Infixed_Collection3982);
                    ruleInfixed();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    this_KW_MARROW_8=(Token)match(input,RULE_KW_MARROW,FOLLOW_RULE_KW_MARROW_in_ruleBindingL_Infixed_Collection3992); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_MARROW_8, grammarAccess.getBindingL_Infixed_CollectionAccess().getKW_MARROWTerminalRuleCall_3_1()); 
                          
                    }
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1691:1: ( (lv_bic_9_0= ruleBindingL_Infixed_Collection ) )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1692:1: (lv_bic_9_0= ruleBindingL_Infixed_Collection )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1692:1: (lv_bic_9_0= ruleBindingL_Infixed_Collection )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1693:3: lv_bic_9_0= ruleBindingL_Infixed_Collection
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBindingL_Infixed_CollectionAccess().getBicBindingL_Infixed_CollectionParserRuleCall_3_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBindingL_Infixed_Collection_in_ruleBindingL_Infixed_Collection4012);
                    lv_bic_9_0=ruleBindingL_Infixed_Collection();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBindingL_Infixed_CollectionRule());
                      	        }
                             		set(
                             			current, 
                             			"bic",
                              		lv_bic_9_0, 
                              		"BindingL_Infixed_Collection");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1710:6: ( ruleInfixed this_KW_MAPSTO_11= RULE_KW_MAPSTO ( (lv_bic_12_0= ruleBindingL_Infixed_Collection ) ) )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1710:6: ( ruleInfixed this_KW_MAPSTO_11= RULE_KW_MAPSTO ( (lv_bic_12_0= ruleBindingL_Infixed_Collection ) ) )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1711:5: ruleInfixed this_KW_MAPSTO_11= RULE_KW_MAPSTO ( (lv_bic_12_0= ruleBindingL_Infixed_Collection ) )
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBindingL_Infixed_CollectionAccess().getInfixedParserRuleCall_4_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInfixed_in_ruleBindingL_Infixed_Collection4036);
                    ruleInfixed();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    this_KW_MAPSTO_11=(Token)match(input,RULE_KW_MAPSTO,FOLLOW_RULE_KW_MAPSTO_in_ruleBindingL_Infixed_Collection4046); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_MAPSTO_11, grammarAccess.getBindingL_Infixed_CollectionAccess().getKW_MAPSTOTerminalRuleCall_4_1()); 
                          
                    }
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1722:1: ( (lv_bic_12_0= ruleBindingL_Infixed_Collection ) )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1723:1: (lv_bic_12_0= ruleBindingL_Infixed_Collection )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1723:1: (lv_bic_12_0= ruleBindingL_Infixed_Collection )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1724:3: lv_bic_12_0= ruleBindingL_Infixed_Collection
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBindingL_Infixed_CollectionAccess().getBicBindingL_Infixed_CollectionParserRuleCall_4_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBindingL_Infixed_Collection_in_ruleBindingL_Infixed_Collection4066);
                    lv_bic_12_0=ruleBindingL_Infixed_Collection();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBindingL_Infixed_CollectionRule());
                      	        }
                             		set(
                             			current, 
                             			"bic",
                              		lv_bic_12_0, 
                              		"BindingL_Infixed_Collection");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1741:6: ( ruleInfixed this_KW_MAPSTOSTAR_14= RULE_KW_MAPSTOSTAR ( (lv_bic_15_0= ruleBindingL_Infixed_Collection ) ) )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1741:6: ( ruleInfixed this_KW_MAPSTOSTAR_14= RULE_KW_MAPSTOSTAR ( (lv_bic_15_0= ruleBindingL_Infixed_Collection ) ) )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1742:5: ruleInfixed this_KW_MAPSTOSTAR_14= RULE_KW_MAPSTOSTAR ( (lv_bic_15_0= ruleBindingL_Infixed_Collection ) )
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBindingL_Infixed_CollectionAccess().getInfixedParserRuleCall_5_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInfixed_in_ruleBindingL_Infixed_Collection4090);
                    ruleInfixed();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    this_KW_MAPSTOSTAR_14=(Token)match(input,RULE_KW_MAPSTOSTAR,FOLLOW_RULE_KW_MAPSTOSTAR_in_ruleBindingL_Infixed_Collection4100); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_MAPSTOSTAR_14, grammarAccess.getBindingL_Infixed_CollectionAccess().getKW_MAPSTOSTARTerminalRuleCall_5_1()); 
                          
                    }
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1753:1: ( (lv_bic_15_0= ruleBindingL_Infixed_Collection ) )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1754:1: (lv_bic_15_0= ruleBindingL_Infixed_Collection )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1754:1: (lv_bic_15_0= ruleBindingL_Infixed_Collection )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1755:3: lv_bic_15_0= ruleBindingL_Infixed_Collection
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBindingL_Infixed_CollectionAccess().getBicBindingL_Infixed_CollectionParserRuleCall_5_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBindingL_Infixed_Collection_in_ruleBindingL_Infixed_Collection4120);
                    lv_bic_15_0=ruleBindingL_Infixed_Collection();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBindingL_Infixed_CollectionRule());
                      	        }
                             		set(
                             			current, 
                             			"bic",
                              		lv_bic_15_0, 
                              		"BindingL_Infixed_Collection");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

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
    // $ANTLR end "ruleBindingL_Infixed_Collection"


    // $ANTLR start "entryRuleBindingR_InfixedExprsDecl_AnyStatement"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1782:1: entryRuleBindingR_InfixedExprsDecl_AnyStatement returns [EObject current=null] : iv_ruleBindingR_InfixedExprsDecl_AnyStatement= ruleBindingR_InfixedExprsDecl_AnyStatement EOF ;
    public final EObject entryRuleBindingR_InfixedExprsDecl_AnyStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBindingR_InfixedExprsDecl_AnyStatement = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1786:2: (iv_ruleBindingR_InfixedExprsDecl_AnyStatement= ruleBindingR_InfixedExprsDecl_AnyStatement EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1787:2: iv_ruleBindingR_InfixedExprsDecl_AnyStatement= ruleBindingR_InfixedExprsDecl_AnyStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBindingR_InfixedExprsDecl_AnyStatementRule()); 
            }
            pushFollow(FOLLOW_ruleBindingR_InfixedExprsDecl_AnyStatement_in_entryRuleBindingR_InfixedExprsDecl_AnyStatement4167);
            iv_ruleBindingR_InfixedExprsDecl_AnyStatement=ruleBindingR_InfixedExprsDecl_AnyStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBindingR_InfixedExprsDecl_AnyStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBindingR_InfixedExprsDecl_AnyStatement4177); if (state.failed) return current;

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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1797:1: ruleBindingR_InfixedExprsDecl_AnyStatement returns [EObject current=null] : ( ruleInfixedExprsDecl | ( ruleInfixedExprsDecl otherlv_2= 'assign' this_Binding_AnyStatement_3= ruleBinding_AnyStatement ) | ( ruleInfixedExprsDecl this_KW_2EQ_5= RULE_KW_2EQ this_Binding_AnyStatement_6= ruleBinding_AnyStatement ) | ( ruleInfixedExprsDecl this_KW_MARROW_8= RULE_KW_MARROW this_Binding_AnyStatement_9= ruleBinding_AnyStatement ) | ( ruleInfixedExprsDecl this_KW_MAPSTO_11= RULE_KW_MAPSTO this_Binding_AnyStatement_12= ruleBinding_AnyStatement ) | ( ruleInfixedExprsDecl this_KW_MAPSTOSTAR_14= RULE_KW_MAPSTOSTAR this_Binding_AnyStatement_15= ruleBinding_AnyStatement ) ) ;
    public final EObject ruleBindingR_InfixedExprsDecl_AnyStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token this_KW_2EQ_5=null;
        Token this_KW_MARROW_8=null;
        Token this_KW_MAPSTO_11=null;
        Token this_KW_MAPSTOSTAR_14=null;
        EObject this_Binding_AnyStatement_3 = null;

        EObject this_Binding_AnyStatement_6 = null;

        EObject this_Binding_AnyStatement_9 = null;

        EObject this_Binding_AnyStatement_12 = null;

        EObject this_Binding_AnyStatement_15 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1801:28: ( ( ruleInfixedExprsDecl | ( ruleInfixedExprsDecl otherlv_2= 'assign' this_Binding_AnyStatement_3= ruleBinding_AnyStatement ) | ( ruleInfixedExprsDecl this_KW_2EQ_5= RULE_KW_2EQ this_Binding_AnyStatement_6= ruleBinding_AnyStatement ) | ( ruleInfixedExprsDecl this_KW_MARROW_8= RULE_KW_MARROW this_Binding_AnyStatement_9= ruleBinding_AnyStatement ) | ( ruleInfixedExprsDecl this_KW_MAPSTO_11= RULE_KW_MAPSTO this_Binding_AnyStatement_12= ruleBinding_AnyStatement ) | ( ruleInfixedExprsDecl this_KW_MAPSTOSTAR_14= RULE_KW_MAPSTOSTAR this_Binding_AnyStatement_15= ruleBinding_AnyStatement ) ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1802:1: ( ruleInfixedExprsDecl | ( ruleInfixedExprsDecl otherlv_2= 'assign' this_Binding_AnyStatement_3= ruleBinding_AnyStatement ) | ( ruleInfixedExprsDecl this_KW_2EQ_5= RULE_KW_2EQ this_Binding_AnyStatement_6= ruleBinding_AnyStatement ) | ( ruleInfixedExprsDecl this_KW_MARROW_8= RULE_KW_MARROW this_Binding_AnyStatement_9= ruleBinding_AnyStatement ) | ( ruleInfixedExprsDecl this_KW_MAPSTO_11= RULE_KW_MAPSTO this_Binding_AnyStatement_12= ruleBinding_AnyStatement ) | ( ruleInfixedExprsDecl this_KW_MAPSTOSTAR_14= RULE_KW_MAPSTOSTAR this_Binding_AnyStatement_15= ruleBinding_AnyStatement ) )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1802:1: ( ruleInfixedExprsDecl | ( ruleInfixedExprsDecl otherlv_2= 'assign' this_Binding_AnyStatement_3= ruleBinding_AnyStatement ) | ( ruleInfixedExprsDecl this_KW_2EQ_5= RULE_KW_2EQ this_Binding_AnyStatement_6= ruleBinding_AnyStatement ) | ( ruleInfixedExprsDecl this_KW_MARROW_8= RULE_KW_MARROW this_Binding_AnyStatement_9= ruleBinding_AnyStatement ) | ( ruleInfixedExprsDecl this_KW_MAPSTO_11= RULE_KW_MAPSTO this_Binding_AnyStatement_12= ruleBinding_AnyStatement ) | ( ruleInfixedExprsDecl this_KW_MAPSTOSTAR_14= RULE_KW_MAPSTOSTAR this_Binding_AnyStatement_15= ruleBinding_AnyStatement ) )
            int alt21=6;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1803:5: ruleInfixedExprsDecl
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBindingR_InfixedExprsDecl_AnyStatementAccess().getInfixedExprsDeclParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInfixedExprsDecl_in_ruleBindingR_InfixedExprsDecl_AnyStatement4222);
                    ruleInfixedExprsDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1811:6: ( ruleInfixedExprsDecl otherlv_2= 'assign' this_Binding_AnyStatement_3= ruleBinding_AnyStatement )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1811:6: ( ruleInfixedExprsDecl otherlv_2= 'assign' this_Binding_AnyStatement_3= ruleBinding_AnyStatement )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1812:5: ruleInfixedExprsDecl otherlv_2= 'assign' this_Binding_AnyStatement_3= ruleBinding_AnyStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBindingR_InfixedExprsDecl_AnyStatementAccess().getInfixedExprsDeclParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInfixedExprsDecl_in_ruleBindingR_InfixedExprsDecl_AnyStatement4244);
                    ruleInfixedExprsDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_2=(Token)match(input,86,FOLLOW_86_in_ruleBindingR_InfixedExprsDecl_AnyStatement4255); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getBindingR_InfixedExprsDecl_AnyStatementAccess().getAssignKeyword_1_1());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBindingR_InfixedExprsDecl_AnyStatementAccess().getBinding_AnyStatementParserRuleCall_1_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBinding_AnyStatement_in_ruleBindingR_InfixedExprsDecl_AnyStatement4277);
                    this_Binding_AnyStatement_3=ruleBinding_AnyStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Binding_AnyStatement_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1833:6: ( ruleInfixedExprsDecl this_KW_2EQ_5= RULE_KW_2EQ this_Binding_AnyStatement_6= ruleBinding_AnyStatement )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1833:6: ( ruleInfixedExprsDecl this_KW_2EQ_5= RULE_KW_2EQ this_Binding_AnyStatement_6= ruleBinding_AnyStatement )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1834:5: ruleInfixedExprsDecl this_KW_2EQ_5= RULE_KW_2EQ this_Binding_AnyStatement_6= ruleBinding_AnyStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBindingR_InfixedExprsDecl_AnyStatementAccess().getInfixedExprsDeclParserRuleCall_2_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInfixedExprsDecl_in_ruleBindingR_InfixedExprsDecl_AnyStatement4300);
                    ruleInfixedExprsDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    this_KW_2EQ_5=(Token)match(input,RULE_KW_2EQ,FOLLOW_RULE_KW_2EQ_in_ruleBindingR_InfixedExprsDecl_AnyStatement4310); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_2EQ_5, grammarAccess.getBindingR_InfixedExprsDecl_AnyStatementAccess().getKW_2EQTerminalRuleCall_2_1()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBindingR_InfixedExprsDecl_AnyStatementAccess().getBinding_AnyStatementParserRuleCall_2_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBinding_AnyStatement_in_ruleBindingR_InfixedExprsDecl_AnyStatement4331);
                    this_Binding_AnyStatement_6=ruleBinding_AnyStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Binding_AnyStatement_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1855:6: ( ruleInfixedExprsDecl this_KW_MARROW_8= RULE_KW_MARROW this_Binding_AnyStatement_9= ruleBinding_AnyStatement )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1855:6: ( ruleInfixedExprsDecl this_KW_MARROW_8= RULE_KW_MARROW this_Binding_AnyStatement_9= ruleBinding_AnyStatement )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1856:5: ruleInfixedExprsDecl this_KW_MARROW_8= RULE_KW_MARROW this_Binding_AnyStatement_9= ruleBinding_AnyStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBindingR_InfixedExprsDecl_AnyStatementAccess().getInfixedExprsDeclParserRuleCall_3_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInfixedExprsDecl_in_ruleBindingR_InfixedExprsDecl_AnyStatement4354);
                    ruleInfixedExprsDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    this_KW_MARROW_8=(Token)match(input,RULE_KW_MARROW,FOLLOW_RULE_KW_MARROW_in_ruleBindingR_InfixedExprsDecl_AnyStatement4364); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_MARROW_8, grammarAccess.getBindingR_InfixedExprsDecl_AnyStatementAccess().getKW_MARROWTerminalRuleCall_3_1()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBindingR_InfixedExprsDecl_AnyStatementAccess().getBinding_AnyStatementParserRuleCall_3_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBinding_AnyStatement_in_ruleBindingR_InfixedExprsDecl_AnyStatement4385);
                    this_Binding_AnyStatement_9=ruleBinding_AnyStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Binding_AnyStatement_9; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1877:6: ( ruleInfixedExprsDecl this_KW_MAPSTO_11= RULE_KW_MAPSTO this_Binding_AnyStatement_12= ruleBinding_AnyStatement )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1877:6: ( ruleInfixedExprsDecl this_KW_MAPSTO_11= RULE_KW_MAPSTO this_Binding_AnyStatement_12= ruleBinding_AnyStatement )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1878:5: ruleInfixedExprsDecl this_KW_MAPSTO_11= RULE_KW_MAPSTO this_Binding_AnyStatement_12= ruleBinding_AnyStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBindingR_InfixedExprsDecl_AnyStatementAccess().getInfixedExprsDeclParserRuleCall_4_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInfixedExprsDecl_in_ruleBindingR_InfixedExprsDecl_AnyStatement4408);
                    ruleInfixedExprsDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    this_KW_MAPSTO_11=(Token)match(input,RULE_KW_MAPSTO,FOLLOW_RULE_KW_MAPSTO_in_ruleBindingR_InfixedExprsDecl_AnyStatement4418); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_MAPSTO_11, grammarAccess.getBindingR_InfixedExprsDecl_AnyStatementAccess().getKW_MAPSTOTerminalRuleCall_4_1()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBindingR_InfixedExprsDecl_AnyStatementAccess().getBinding_AnyStatementParserRuleCall_4_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBinding_AnyStatement_in_ruleBindingR_InfixedExprsDecl_AnyStatement4439);
                    this_Binding_AnyStatement_12=ruleBinding_AnyStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Binding_AnyStatement_12; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1899:6: ( ruleInfixedExprsDecl this_KW_MAPSTOSTAR_14= RULE_KW_MAPSTOSTAR this_Binding_AnyStatement_15= ruleBinding_AnyStatement )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1899:6: ( ruleInfixedExprsDecl this_KW_MAPSTOSTAR_14= RULE_KW_MAPSTOSTAR this_Binding_AnyStatement_15= ruleBinding_AnyStatement )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1900:5: ruleInfixedExprsDecl this_KW_MAPSTOSTAR_14= RULE_KW_MAPSTOSTAR this_Binding_AnyStatement_15= ruleBinding_AnyStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBindingR_InfixedExprsDecl_AnyStatementAccess().getInfixedExprsDeclParserRuleCall_5_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInfixedExprsDecl_in_ruleBindingR_InfixedExprsDecl_AnyStatement4462);
                    ruleInfixedExprsDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    this_KW_MAPSTOSTAR_14=(Token)match(input,RULE_KW_MAPSTOSTAR,FOLLOW_RULE_KW_MAPSTOSTAR_in_ruleBindingR_InfixedExprsDecl_AnyStatement4472); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_MAPSTOSTAR_14, grammarAccess.getBindingR_InfixedExprsDecl_AnyStatementAccess().getKW_MAPSTOSTARTerminalRuleCall_5_1()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBindingR_InfixedExprsDecl_AnyStatementAccess().getBinding_AnyStatementParserRuleCall_5_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBinding_AnyStatement_in_ruleBindingR_InfixedExprsDecl_AnyStatement4493);
                    this_Binding_AnyStatement_15=ruleBinding_AnyStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Binding_AnyStatement_15; 
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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1931:1: entryRuleAnyStatement returns [String current=null] : iv_ruleAnyStatement= ruleAnyStatement EOF ;
    public final String entryRuleAnyStatement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAnyStatement = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1935:2: (iv_ruleAnyStatement= ruleAnyStatement EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1936:2: iv_ruleAnyStatement= ruleAnyStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnyStatementRule()); 
            }
            pushFollow(FOLLOW_ruleAnyStatement_in_entryRuleAnyStatement4540);
            iv_ruleAnyStatement=ruleAnyStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnyStatement.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnyStatement4551); if (state.failed) return current;

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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1946:1: ruleAnyStatement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'temp19' ;
    public final AntlrDatatypeRuleToken ruleAnyStatement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1950:28: (kw= 'temp19' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1952:2: kw= 'temp19'
            {
            kw=(Token)match(input,87,FOLLOW_87_in_ruleAnyStatement4592); if (state.failed) return current;
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


    // $ANTLR start "entryRuleBalStatement"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1968:1: entryRuleBalStatement returns [String current=null] : iv_ruleBalStatement= ruleBalStatement EOF ;
    public final String entryRuleBalStatement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBalStatement = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1972:2: (iv_ruleBalStatement= ruleBalStatement EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1973:2: iv_ruleBalStatement= ruleBalStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBalStatementRule()); 
            }
            pushFollow(FOLLOW_ruleBalStatement_in_entryRuleBalStatement4642);
            iv_ruleBalStatement=ruleBalStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBalStatement.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBalStatement4653); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBalStatement"


    // $ANTLR start "ruleBalStatement"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1983:1: ruleBalStatement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'temp20' ;
    public final AntlrDatatypeRuleToken ruleBalStatement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1987:28: (kw= 'temp20' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1989:2: kw= 'temp20'
            {
            kw=(Token)match(input,88,FOLLOW_88_in_ruleBalStatement4694); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getBalStatementAccess().getTemp20Keyword()); 
                  
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
    // $ANTLR end "ruleBalStatement"


    // $ANTLR start "entryRuleGenBound"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2009:1: entryRuleGenBound returns [EObject current=null] : iv_ruleGenBound= ruleGenBound EOF ;
    public final EObject entryRuleGenBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenBound = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2013:2: (iv_ruleGenBound= ruleGenBound EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2014:2: iv_ruleGenBound= ruleGenBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGenBoundRule()); 
            }
            pushFollow(FOLLOW_ruleGenBound_in_entryRuleGenBound4747);
            iv_ruleGenBound=ruleGenBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGenBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGenBound4757); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGenBound"


    // $ANTLR start "ruleGenBound"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2024:1: ruleGenBound returns [EObject current=null] : (otherlv_0= 'to' this_CommaItem_1= ruleCommaItem otherlv_2= 'of' )? ;
    public final EObject ruleGenBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_CommaItem_1 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2028:28: ( (otherlv_0= 'to' this_CommaItem_1= ruleCommaItem otherlv_2= 'of' )? )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2029:1: (otherlv_0= 'to' this_CommaItem_1= ruleCommaItem otherlv_2= 'of' )?
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2029:1: (otherlv_0= 'to' this_CommaItem_1= ruleCommaItem otherlv_2= 'of' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==83) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2029:3: otherlv_0= 'to' this_CommaItem_1= ruleCommaItem otherlv_2= 'of'
                    {
                    otherlv_0=(Token)match(input,83,FOLLOW_83_in_ruleGenBound4798); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getGenBoundAccess().getToKeyword_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGenBoundAccess().getCommaItemParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCommaItem_in_ruleGenBound4820);
                    this_CommaItem_1=ruleCommaItem();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CommaItem_1; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_2=(Token)match(input,89,FOLLOW_89_in_ruleGenBound4831); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getGenBoundAccess().getOfKeyword_2());
                          
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
    // $ANTLR end "ruleGenBound"


    // $ANTLR start "entryRuleButExpr"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2057:1: entryRuleButExpr returns [EObject current=null] : iv_ruleButExpr= ruleButExpr EOF ;
    public final EObject entryRuleButExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButExpr = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2061:2: (iv_ruleButExpr= ruleButExpr EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2062:2: iv_ruleButExpr= ruleButExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getButExprRule()); 
            }
            pushFollow(FOLLOW_ruleButExpr_in_entryRuleButExpr4878);
            iv_ruleButExpr=ruleButExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleButExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleButExpr4888); if (state.failed) return current;

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
    // $ANTLR end "entryRuleButExpr"


    // $ANTLR start "ruleButExpr"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2072:1: ruleButExpr returns [EObject current=null] : ( ( (lv_db_0_0= ruleDeclBinding ) ) otherlv_1= 'in' ( (lv_ca_2_0= ruleCases ) ) )? ;
    public final EObject ruleButExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_db_0_0 = null;

        EObject lv_ca_2_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2076:28: ( ( ( (lv_db_0_0= ruleDeclBinding ) ) otherlv_1= 'in' ( (lv_ca_2_0= ruleCases ) ) )? )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2077:1: ( ( (lv_db_0_0= ruleDeclBinding ) ) otherlv_1= 'in' ( (lv_ca_2_0= ruleCases ) ) )?
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2077:1: ( ( (lv_db_0_0= ruleDeclBinding ) ) otherlv_1= 'in' ( (lv_ca_2_0= ruleCases ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==96) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2077:2: ( (lv_db_0_0= ruleDeclBinding ) ) otherlv_1= 'in' ( (lv_ca_2_0= ruleCases ) )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2077:2: ( (lv_db_0_0= ruleDeclBinding ) )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2078:1: (lv_db_0_0= ruleDeclBinding )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2078:1: (lv_db_0_0= ruleDeclBinding )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2079:3: lv_db_0_0= ruleDeclBinding
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getButExprAccess().getDbDeclBindingParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDeclBinding_in_ruleButExpr4938);
                    lv_db_0_0=ruleDeclBinding();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getButExprRule());
                      	        }
                             		set(
                             			current, 
                             			"db",
                              		lv_db_0_0, 
                              		"DeclBinding");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,90,FOLLOW_90_in_ruleButExpr4950); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getButExprAccess().getInKeyword_1());
                          
                    }
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2099:1: ( (lv_ca_2_0= ruleCases ) )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2100:1: (lv_ca_2_0= ruleCases )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2100:1: (lv_ca_2_0= ruleCases )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2101:3: lv_ca_2_0= ruleCases
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getButExprAccess().getCaCasesParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCases_in_ruleButExpr4971);
                    lv_ca_2_0=ruleCases();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getButExprRule());
                      	        }
                             		set(
                             			current, 
                             			"ca",
                              		lv_ca_2_0, 
                              		"Cases");
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
    // $ANTLR end "ruleButExpr"


    // $ANTLR start "entryRuleCases"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2128:1: entryRuleCases returns [EObject current=null] : iv_ruleCases= ruleCases EOF ;
    public final EObject entryRuleCases() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCases = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2132:2: (iv_ruleCases= ruleCases EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2133:2: iv_ruleCases= ruleCases EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCasesRule()); 
            }
            pushFollow(FOLLOW_ruleCases_in_entryRuleCases5018);
            iv_ruleCases=ruleCases();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCases; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCases5028); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCases"


    // $ANTLR start "ruleCases"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2143:1: ruleCases returns [EObject current=null] : this_Binding_Collection_0= ruleBinding_Collection ;
    public final EObject ruleCases() throws RecognitionException {
        EObject current = null;

        EObject this_Binding_Collection_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2147:28: (this_Binding_Collection_0= ruleBinding_Collection )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2149:5: this_Binding_Collection_0= ruleBinding_Collection
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCasesAccess().getBinding_CollectionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleBinding_Collection_in_ruleCases5078);
            this_Binding_Collection_0=ruleBinding_Collection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Binding_Collection_0; 
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
    // $ANTLR end "ruleCases"


    // $ANTLR start "entryRuleAlwaysPart_AnyStatement"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2168:1: entryRuleAlwaysPart_AnyStatement returns [EObject current=null] : iv_ruleAlwaysPart_AnyStatement= ruleAlwaysPart_AnyStatement EOF ;
    public final EObject entryRuleAlwaysPart_AnyStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlwaysPart_AnyStatement = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2172:2: (iv_ruleAlwaysPart_AnyStatement= ruleAlwaysPart_AnyStatement EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2173:2: iv_ruleAlwaysPart_AnyStatement= ruleAlwaysPart_AnyStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAlwaysPart_AnyStatementRule()); 
            }
            pushFollow(FOLLOW_ruleAlwaysPart_AnyStatement_in_entryRuleAlwaysPart_AnyStatement5122);
            iv_ruleAlwaysPart_AnyStatement=ruleAlwaysPart_AnyStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAlwaysPart_AnyStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlwaysPart_AnyStatement5132); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAlwaysPart_AnyStatement"


    // $ANTLR start "ruleAlwaysPart_AnyStatement"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2183:1: ruleAlwaysPart_AnyStatement returns [EObject current=null] : ( (otherlv_0= 'always' this_Binding_AnyStatement_1= ruleBinding_AnyStatement ) | (otherlv_2= 'finally' this_Binding_AnyStatement_3= ruleBinding_AnyStatement ) )? ;
    public final EObject ruleAlwaysPart_AnyStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Binding_AnyStatement_1 = null;

        EObject this_Binding_AnyStatement_3 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2187:28: ( ( (otherlv_0= 'always' this_Binding_AnyStatement_1= ruleBinding_AnyStatement ) | (otherlv_2= 'finally' this_Binding_AnyStatement_3= ruleBinding_AnyStatement ) )? )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2188:1: ( (otherlv_0= 'always' this_Binding_AnyStatement_1= ruleBinding_AnyStatement ) | (otherlv_2= 'finally' this_Binding_AnyStatement_3= ruleBinding_AnyStatement ) )?
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2188:1: ( (otherlv_0= 'always' this_Binding_AnyStatement_1= ruleBinding_AnyStatement ) | (otherlv_2= 'finally' this_Binding_AnyStatement_3= ruleBinding_AnyStatement ) )?
            int alt24=3;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==91) ) {
                alt24=1;
            }
            else if ( (LA24_0==92) ) {
                alt24=2;
            }
            switch (alt24) {
                case 1 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2188:2: (otherlv_0= 'always' this_Binding_AnyStatement_1= ruleBinding_AnyStatement )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2188:2: (otherlv_0= 'always' this_Binding_AnyStatement_1= ruleBinding_AnyStatement )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2188:4: otherlv_0= 'always' this_Binding_AnyStatement_1= ruleBinding_AnyStatement
                    {
                    otherlv_0=(Token)match(input,91,FOLLOW_91_in_ruleAlwaysPart_AnyStatement5174); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getAlwaysPart_AnyStatementAccess().getAlwaysKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAlwaysPart_AnyStatementAccess().getBinding_AnyStatementParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBinding_AnyStatement_in_ruleAlwaysPart_AnyStatement5196);
                    this_Binding_AnyStatement_1=ruleBinding_AnyStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Binding_AnyStatement_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2202:6: (otherlv_2= 'finally' this_Binding_AnyStatement_3= ruleBinding_AnyStatement )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2202:6: (otherlv_2= 'finally' this_Binding_AnyStatement_3= ruleBinding_AnyStatement )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2202:8: otherlv_2= 'finally' this_Binding_AnyStatement_3= ruleBinding_AnyStatement
                    {
                    otherlv_2=(Token)match(input,92,FOLLOW_92_in_ruleAlwaysPart_AnyStatement5215); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAlwaysPart_AnyStatementAccess().getFinallyKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAlwaysPart_AnyStatementAccess().getBinding_AnyStatementParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBinding_AnyStatement_in_ruleAlwaysPart_AnyStatement5237);
                    this_Binding_AnyStatement_3=ruleBinding_AnyStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Binding_AnyStatement_3; 
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
    // $ANTLR end "ruleAlwaysPart_AnyStatement"


    // $ANTLR start "entryRuleAlwaysPart_BalStatement"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2226:1: entryRuleAlwaysPart_BalStatement returns [EObject current=null] : iv_ruleAlwaysPart_BalStatement= ruleAlwaysPart_BalStatement EOF ;
    public final EObject entryRuleAlwaysPart_BalStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlwaysPart_BalStatement = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2230:2: (iv_ruleAlwaysPart_BalStatement= ruleAlwaysPart_BalStatement EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2231:2: iv_ruleAlwaysPart_BalStatement= ruleAlwaysPart_BalStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAlwaysPart_BalStatementRule()); 
            }
            pushFollow(FOLLOW_ruleAlwaysPart_BalStatement_in_entryRuleAlwaysPart_BalStatement5284);
            iv_ruleAlwaysPart_BalStatement=ruleAlwaysPart_BalStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAlwaysPart_BalStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlwaysPart_BalStatement5294); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAlwaysPart_BalStatement"


    // $ANTLR start "ruleAlwaysPart_BalStatement"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2241:1: ruleAlwaysPart_BalStatement returns [EObject current=null] : ( (otherlv_0= 'always' this_Binding_BalStatement_1= ruleBinding_BalStatement ) | (otherlv_2= 'finally' this_Binding_BalStatement_3= ruleBinding_BalStatement ) )? ;
    public final EObject ruleAlwaysPart_BalStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Binding_BalStatement_1 = null;

        EObject this_Binding_BalStatement_3 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2245:28: ( ( (otherlv_0= 'always' this_Binding_BalStatement_1= ruleBinding_BalStatement ) | (otherlv_2= 'finally' this_Binding_BalStatement_3= ruleBinding_BalStatement ) )? )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2246:1: ( (otherlv_0= 'always' this_Binding_BalStatement_1= ruleBinding_BalStatement ) | (otherlv_2= 'finally' this_Binding_BalStatement_3= ruleBinding_BalStatement ) )?
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2246:1: ( (otherlv_0= 'always' this_Binding_BalStatement_1= ruleBinding_BalStatement ) | (otherlv_2= 'finally' this_Binding_BalStatement_3= ruleBinding_BalStatement ) )?
            int alt25=3;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==91) ) {
                alt25=1;
            }
            else if ( (LA25_0==92) ) {
                alt25=2;
            }
            switch (alt25) {
                case 1 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2246:2: (otherlv_0= 'always' this_Binding_BalStatement_1= ruleBinding_BalStatement )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2246:2: (otherlv_0= 'always' this_Binding_BalStatement_1= ruleBinding_BalStatement )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2246:4: otherlv_0= 'always' this_Binding_BalStatement_1= ruleBinding_BalStatement
                    {
                    otherlv_0=(Token)match(input,91,FOLLOW_91_in_ruleAlwaysPart_BalStatement5336); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getAlwaysPart_BalStatementAccess().getAlwaysKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAlwaysPart_BalStatementAccess().getBinding_BalStatementParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBinding_BalStatement_in_ruleAlwaysPart_BalStatement5358);
                    this_Binding_BalStatement_1=ruleBinding_BalStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Binding_BalStatement_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2260:6: (otherlv_2= 'finally' this_Binding_BalStatement_3= ruleBinding_BalStatement )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2260:6: (otherlv_2= 'finally' this_Binding_BalStatement_3= ruleBinding_BalStatement )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2260:8: otherlv_2= 'finally' this_Binding_BalStatement_3= ruleBinding_BalStatement
                    {
                    otherlv_2=(Token)match(input,92,FOLLOW_92_in_ruleAlwaysPart_BalStatement5377); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAlwaysPart_BalStatementAccess().getFinallyKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAlwaysPart_BalStatementAccess().getBinding_BalStatementParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBinding_BalStatement_in_ruleAlwaysPart_BalStatement5399);
                    this_Binding_BalStatement_3=ruleBinding_BalStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Binding_BalStatement_3; 
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
    // $ANTLR end "ruleAlwaysPart_BalStatement"


    // $ANTLR start "entryRuleCollection"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2284:1: entryRuleCollection returns [EObject current=null] : iv_ruleCollection= ruleCollection EOF ;
    public final EObject entryRuleCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollection = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2288:2: (iv_ruleCollection= ruleCollection EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2289:2: iv_ruleCollection= ruleCollection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionRule()); 
            }
            pushFollow(FOLLOW_ruleCollection_in_entryRuleCollection5446);
            iv_ruleCollection=ruleCollection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollection; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollection5456); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCollection"


    // $ANTLR start "ruleCollection"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2299:1: ruleCollection returns [EObject current=null] : ( ruleInfixed ( (lv_i_1_0= ruleIterators ) )? ) ;
    public final EObject ruleCollection() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_i_1_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2303:28: ( ( ruleInfixed ( (lv_i_1_0= ruleIterators ) )? ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2304:1: ( ruleInfixed ( (lv_i_1_0= ruleIterators ) )? )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2304:1: ( ruleInfixed ( (lv_i_1_0= ruleIterators ) )? )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2305:5: ruleInfixed ( (lv_i_1_0= ruleIterators ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCollectionAccess().getInfixedParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleInfixed_in_ruleCollection5501);
            ruleInfixed();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2312:1: ( (lv_i_1_0= ruleIterators ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==93) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2313:1: (lv_i_1_0= ruleIterators )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2313:1: (lv_i_1_0= ruleIterators )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2314:3: lv_i_1_0= ruleIterators
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCollectionAccess().getIIteratorsParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIterators_in_ruleCollection5521);
                    lv_i_1_0=ruleIterators();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCollectionRule());
                      	        }
                             		set(
                             			current, 
                             			"i",
                              		lv_i_1_0, 
                              		"Iterators");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

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
    // $ANTLR end "ruleCollection"


    // $ANTLR start "entryRuleIterators"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2341:1: entryRuleIterators returns [String current=null] : iv_ruleIterators= ruleIterators EOF ;
    public final String entryRuleIterators() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIterators = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2345:2: (iv_ruleIterators= ruleIterators EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2346:2: iv_ruleIterators= ruleIterators EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIteratorsRule()); 
            }
            pushFollow(FOLLOW_ruleIterators_in_entryRuleIterators5569);
            iv_ruleIterators=ruleIterators();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIterators.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIterators5580); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIterators"


    // $ANTLR start "ruleIterators"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2356:1: ruleIterators returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Iterators1_0= ruleIterators1 ;
    public final AntlrDatatypeRuleToken ruleIterators() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Iterators1_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2360:28: (this_Iterators1_0= ruleIterators1 )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2362:5: this_Iterators1_0= ruleIterators1
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getIteratorsAccess().getIterators1ParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleIterators1_in_ruleIterators5630);
            this_Iterators1_0=ruleIterators1();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Iterators1_0);
                  
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
    // $ANTLR end "ruleIterators"


    // $ANTLR start "entryRuleIterators1"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2383:1: entryRuleIterators1 returns [String current=null] : iv_ruleIterators1= ruleIterators1 EOF ;
    public final String entryRuleIterators1() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIterators1 = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2387:2: (iv_ruleIterators1= ruleIterators1 EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2388:2: iv_ruleIterators1= ruleIterators1 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIterators1Rule()); 
            }
            pushFollow(FOLLOW_ruleIterators1_in_entryRuleIterators15685);
            iv_ruleIterators1=ruleIterators1();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIterators1.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIterators15696); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIterators1"


    // $ANTLR start "ruleIterators1"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2398:1: ruleIterators1 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'temp27' ;
    public final AntlrDatatypeRuleToken ruleIterators1() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2402:28: (kw= 'temp27' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2404:2: kw= 'temp27'
            {
            kw=(Token)match(input,93,FOLLOW_93_in_ruleIterators15737); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getIterators1Access().getTemp27Keyword()); 
                  
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
    // $ANTLR end "ruleIterators1"


    // $ANTLR start "entryRuleForLhs"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2422:1: entryRuleForLhs returns [String current=null] : iv_ruleForLhs= ruleForLhs EOF ;
    public final String entryRuleForLhs() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleForLhs = null;


        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2423:2: (iv_ruleForLhs= ruleForLhs EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2424:2: iv_ruleForLhs= ruleForLhs EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForLhsRule()); 
            }
            pushFollow(FOLLOW_ruleForLhs_in_entryRuleForLhs5783);
            iv_ruleForLhs=ruleForLhs();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForLhs.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleForLhs5794); if (state.failed) return current;

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
    // $ANTLR end "entryRuleForLhs"


    // $ANTLR start "ruleForLhs"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2431:1: ruleForLhs returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Infixed_0= ruleInfixed | (kw= 'free' this_Infixed_2= ruleInfixed ) | (kw= 'local' this_Infixed_4= ruleInfixed ) | (kw= 'fluid' this_Infixed_6= ruleInfixed ) ) ;
    public final AntlrDatatypeRuleToken ruleForLhs() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Infixed_0 = null;

        AntlrDatatypeRuleToken this_Infixed_2 = null;

        AntlrDatatypeRuleToken this_Infixed_4 = null;

        AntlrDatatypeRuleToken this_Infixed_6 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2434:28: ( (this_Infixed_0= ruleInfixed | (kw= 'free' this_Infixed_2= ruleInfixed ) | (kw= 'local' this_Infixed_4= ruleInfixed ) | (kw= 'fluid' this_Infixed_6= ruleInfixed ) ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2435:1: (this_Infixed_0= ruleInfixed | (kw= 'free' this_Infixed_2= ruleInfixed ) | (kw= 'local' this_Infixed_4= ruleInfixed ) | (kw= 'fluid' this_Infixed_6= ruleInfixed ) )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2435:1: (this_Infixed_0= ruleInfixed | (kw= 'free' this_Infixed_2= ruleInfixed ) | (kw= 'local' this_Infixed_4= ruleInfixed ) | (kw= 'fluid' this_Infixed_6= ruleInfixed ) )
            int alt27=4;
            switch ( input.LA(1) ) {
            case 95:
                {
                alt27=1;
                }
                break;
            case 75:
                {
                alt27=2;
                }
                break;
            case 74:
                {
                alt27=3;
                }
                break;
            case 76:
                {
                alt27=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2436:5: this_Infixed_0= ruleInfixed
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getForLhsAccess().getInfixedParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInfixed_in_ruleForLhs5841);
                    this_Infixed_0=ruleInfixed();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Infixed_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2447:6: (kw= 'free' this_Infixed_2= ruleInfixed )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2447:6: (kw= 'free' this_Infixed_2= ruleInfixed )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2448:2: kw= 'free' this_Infixed_2= ruleInfixed
                    {
                    kw=(Token)match(input,75,FOLLOW_75_in_ruleForLhs5866); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getForLhsAccess().getFreeKeyword_1_0()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getForLhsAccess().getInfixedParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInfixed_in_ruleForLhs5888);
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


                    }
                    break;
                case 3 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2465:6: (kw= 'local' this_Infixed_4= ruleInfixed )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2465:6: (kw= 'local' this_Infixed_4= ruleInfixed )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2466:2: kw= 'local' this_Infixed_4= ruleInfixed
                    {
                    kw=(Token)match(input,74,FOLLOW_74_in_ruleForLhs5914); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getForLhsAccess().getLocalKeyword_2_0()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getForLhsAccess().getInfixedParserRuleCall_2_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInfixed_in_ruleForLhs5936);
                    this_Infixed_4=ruleInfixed();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Infixed_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2483:6: (kw= 'fluid' this_Infixed_6= ruleInfixed )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2483:6: (kw= 'fluid' this_Infixed_6= ruleInfixed )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2484:2: kw= 'fluid' this_Infixed_6= ruleInfixed
                    {
                    kw=(Token)match(input,76,FOLLOW_76_in_ruleForLhs5962); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getForLhsAccess().getFluidKeyword_3_0()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getForLhsAccess().getInfixedParserRuleCall_3_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInfixed_in_ruleForLhs5984);
                    this_Infixed_6=ruleInfixed();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Infixed_6);
                          
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
        }
        return current;
    }
    // $ANTLR end "ruleForLhs"


    // $ANTLR start "entryRuleSuchthatPart"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2508:1: entryRuleSuchthatPart returns [String current=null] : iv_ruleSuchthatPart= ruleSuchthatPart EOF ;
    public final String entryRuleSuchthatPart() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSuchthatPart = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2512:2: (iv_ruleSuchthatPart= ruleSuchthatPart EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2513:2: iv_ruleSuchthatPart= ruleSuchthatPart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSuchthatPartRule()); 
            }
            pushFollow(FOLLOW_ruleSuchthatPart_in_entryRuleSuchthatPart6037);
            iv_ruleSuchthatPart=ruleSuchthatPart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSuchthatPart.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSuchthatPart6048); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSuchthatPart"


    // $ANTLR start "ruleSuchthatPart"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2523:1: ruleSuchthatPart returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'temp30' this_KW_BAR_1= RULE_KW_BAR this_Infixed_2= ruleInfixed ) ;
    public final AntlrDatatypeRuleToken ruleSuchthatPart() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_KW_BAR_1=null;
        AntlrDatatypeRuleToken this_Infixed_2 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2527:28: ( (kw= 'temp30' this_KW_BAR_1= RULE_KW_BAR this_Infixed_2= ruleInfixed ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2528:1: (kw= 'temp30' this_KW_BAR_1= RULE_KW_BAR this_Infixed_2= ruleInfixed )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2528:1: (kw= 'temp30' this_KW_BAR_1= RULE_KW_BAR this_Infixed_2= ruleInfixed )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2529:2: kw= 'temp30' this_KW_BAR_1= RULE_KW_BAR this_Infixed_2= ruleInfixed
            {
            kw=(Token)match(input,94,FOLLOW_94_in_ruleSuchthatPart6090); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getSuchthatPartAccess().getTemp30Keyword_0()); 
                  
            }
            this_KW_BAR_1=(Token)match(input,RULE_KW_BAR,FOLLOW_RULE_KW_BAR_in_ruleSuchthatPart6105); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_KW_BAR_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_KW_BAR_1, grammarAccess.getSuchthatPartAccess().getKW_BARTerminalRuleCall_1()); 
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSuchthatPartAccess().getInfixedParserRuleCall_2()); 
                  
            }
            pushFollow(FOLLOW_ruleInfixed_in_ruleSuchthatPart6132);
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
    // $ANTLR end "ruleSuchthatPart"


    // $ANTLR start "entryRuleInfixed"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2563:1: entryRuleInfixed returns [String current=null] : iv_ruleInfixed= ruleInfixed EOF ;
    public final String entryRuleInfixed() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInfixed = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2567:2: (iv_ruleInfixed= ruleInfixed EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2568:2: iv_ruleInfixed= ruleInfixed EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInfixedRule()); 
            }
            pushFollow(FOLLOW_ruleInfixed_in_entryRuleInfixed6188);
            iv_ruleInfixed=ruleInfixed();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInfixed.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInfixed6199); if (state.failed) return current;

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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2578:1: ruleInfixed returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'temp31' ;
    public final AntlrDatatypeRuleToken ruleInfixed() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2582:28: (kw= 'temp31' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2584:2: kw= 'temp31'
            {
            kw=(Token)match(input,95,FOLLOW_95_in_ruleInfixed6240); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getInfixedAccess().getTemp31Keyword()); 
                  
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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2600:1: entryRuleInfixedExpr returns [String current=null] : iv_ruleInfixedExpr= ruleInfixedExpr EOF ;
    public final String entryRuleInfixedExpr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInfixedExpr = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2604:2: (iv_ruleInfixedExpr= ruleInfixedExpr EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2605:2: iv_ruleInfixedExpr= ruleInfixedExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInfixedExprRule()); 
            }
            pushFollow(FOLLOW_ruleInfixedExpr_in_entryRuleInfixedExpr6290);
            iv_ruleInfixedExpr=ruleInfixedExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInfixedExpr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInfixedExpr6301); if (state.failed) return current;

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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2615:1: ruleInfixedExpr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'temp32' ;
    public final AntlrDatatypeRuleToken ruleInfixedExpr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2619:28: (kw= 'temp32' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2621:2: kw= 'temp32'
            {
            kw=(Token)match(input,96,FOLLOW_96_in_ruleInfixedExpr6342); if (state.failed) return current;
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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2637:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2641:2: (iv_ruleType= ruleType EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2642:2: iv_ruleType= ruleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_ruleType_in_entryRuleType6392);
            iv_ruleType=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleType6403); if (state.failed) return current;

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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2652:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'temp41' ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2656:28: (kw= 'temp41' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2658:2: kw= 'temp41'
            {
            kw=(Token)match(input,97,FOLLOW_97_in_ruleType6444); if (state.failed) return current;
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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2674:1: entryRuleOpQualTail returns [EObject current=null] : iv_ruleOpQualTail= ruleOpQualTail EOF ;
    public final EObject entryRuleOpQualTail() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpQualTail = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2678:2: (iv_ruleOpQualTail= ruleOpQualTail EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2679:2: iv_ruleOpQualTail= ruleOpQualTail EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpQualTailRule()); 
            }
            pushFollow(FOLLOW_ruleOpQualTail_in_entryRuleOpQualTail6493);
            iv_ruleOpQualTail=ruleOpQualTail();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpQualTail; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpQualTail6503); if (state.failed) return current;

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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2689:1: ruleOpQualTail returns [EObject current=null] : ( ( (lv_name_0_0= ruleMolecule ) ) | ( ( ( ( ( ruleMolecule ) ) RULE_KW_DOLLAR ruleOpQualTail ) )=> ( ( (lv_name_1_0= ruleMolecule ) ) this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail ) ) ) ;
    public final EObject ruleOpQualTail() throws RecognitionException {
        EObject current = null;

        Token this_KW_DOLLAR_2=null;
        EObject lv_name_0_0 = null;

        EObject lv_name_1_0 = null;

        EObject this_OpQualTail_3 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2693:28: ( ( ( (lv_name_0_0= ruleMolecule ) ) | ( ( ( ( ( ruleMolecule ) ) RULE_KW_DOLLAR ruleOpQualTail ) )=> ( ( (lv_name_1_0= ruleMolecule ) ) this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail ) ) ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2694:1: ( ( (lv_name_0_0= ruleMolecule ) ) | ( ( ( ( ( ruleMolecule ) ) RULE_KW_DOLLAR ruleOpQualTail ) )=> ( ( (lv_name_1_0= ruleMolecule ) ) this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail ) ) )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2694:1: ( ( (lv_name_0_0= ruleMolecule ) ) | ( ( ( ( ( ruleMolecule ) ) RULE_KW_DOLLAR ruleOpQualTail ) )=> ( ( (lv_name_1_0= ruleMolecule ) ) this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail ) ) )
            int alt28=2;
            alt28 = dfa28.predict(input);
            switch (alt28) {
                case 1 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2694:2: ( (lv_name_0_0= ruleMolecule ) )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2694:2: ( (lv_name_0_0= ruleMolecule ) )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2695:1: (lv_name_0_0= ruleMolecule )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2695:1: (lv_name_0_0= ruleMolecule )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2696:3: lv_name_0_0= ruleMolecule
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOpQualTailAccess().getNameMoleculeParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleMolecule_in_ruleOpQualTail6553);
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
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2713:6: ( ( ( ( ( ruleMolecule ) ) RULE_KW_DOLLAR ruleOpQualTail ) )=> ( ( (lv_name_1_0= ruleMolecule ) ) this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail ) )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2713:6: ( ( ( ( ( ruleMolecule ) ) RULE_KW_DOLLAR ruleOpQualTail ) )=> ( ( (lv_name_1_0= ruleMolecule ) ) this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail ) )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2713:7: ( ( ( ( ruleMolecule ) ) RULE_KW_DOLLAR ruleOpQualTail ) )=> ( ( (lv_name_1_0= ruleMolecule ) ) this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2717:36: ( ( (lv_name_1_0= ruleMolecule ) ) this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2717:37: ( (lv_name_1_0= ruleMolecule ) ) this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2717:37: ( (lv_name_1_0= ruleMolecule ) )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2718:1: (lv_name_1_0= ruleMolecule )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2718:1: (lv_name_1_0= ruleMolecule )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2719:3: lv_name_1_0= ruleMolecule
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOpQualTailAccess().getNameMoleculeParserRuleCall_1_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleMolecule_in_ruleOpQualTail6600);
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

                    this_KW_DOLLAR_2=(Token)match(input,RULE_KW_DOLLAR,FOLLOW_RULE_KW_DOLLAR_in_ruleOpQualTail6611); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_DOLLAR_2, grammarAccess.getOpQualTailAccess().getKW_DOLLARTerminalRuleCall_1_0_1()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOpQualTailAccess().getOpQualTailParserRuleCall_1_0_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOpQualTail_in_ruleOpQualTail6632);
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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2765:1: entryRuleNakedOp returns [EObject current=null] : iv_ruleNakedOp= ruleNakedOp EOF ;
    public final EObject entryRuleNakedOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNakedOp = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2769:2: (iv_ruleNakedOp= ruleNakedOp EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2770:2: iv_ruleNakedOp= ruleNakedOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNakedOpRule()); 
            }
            pushFollow(FOLLOW_ruleNakedOp_in_entryRuleNakedOp6685);
            iv_ruleNakedOp=ruleNakedOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNakedOp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNakedOp6695); if (state.failed) return current;

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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2780:1: ruleNakedOp returns [EObject current=null] : (this_UnqualOp_ArrowTok_0= ruleUnqualOp_ArrowTok | this_UnqualOp_LatticeTok_1= ruleUnqualOp_LatticeTok | this_UnqualOp_RelationTok_2= ruleUnqualOp_RelationTok | this_UnqualOp_SegTok_3= ruleUnqualOp_SegTok | this_UnqualOp_PlusTok_4= ruleUnqualOp_PlusTok | this_UnqualOp_QuotientTok_5= ruleUnqualOp_QuotientTok | this_UnqualOp_TimesTok_6= ruleUnqualOp_TimesTok | this_UnqualOp_PowerTok_7= ruleUnqualOp_PowerTok ) ;
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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2784:28: ( (this_UnqualOp_ArrowTok_0= ruleUnqualOp_ArrowTok | this_UnqualOp_LatticeTok_1= ruleUnqualOp_LatticeTok | this_UnqualOp_RelationTok_2= ruleUnqualOp_RelationTok | this_UnqualOp_SegTok_3= ruleUnqualOp_SegTok | this_UnqualOp_PlusTok_4= ruleUnqualOp_PlusTok | this_UnqualOp_QuotientTok_5= ruleUnqualOp_QuotientTok | this_UnqualOp_TimesTok_6= ruleUnqualOp_TimesTok | this_UnqualOp_PowerTok_7= ruleUnqualOp_PowerTok ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2785:1: (this_UnqualOp_ArrowTok_0= ruleUnqualOp_ArrowTok | this_UnqualOp_LatticeTok_1= ruleUnqualOp_LatticeTok | this_UnqualOp_RelationTok_2= ruleUnqualOp_RelationTok | this_UnqualOp_SegTok_3= ruleUnqualOp_SegTok | this_UnqualOp_PlusTok_4= ruleUnqualOp_PlusTok | this_UnqualOp_QuotientTok_5= ruleUnqualOp_QuotientTok | this_UnqualOp_TimesTok_6= ruleUnqualOp_TimesTok | this_UnqualOp_PowerTok_7= ruleUnqualOp_PowerTok )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2785:1: (this_UnqualOp_ArrowTok_0= ruleUnqualOp_ArrowTok | this_UnqualOp_LatticeTok_1= ruleUnqualOp_LatticeTok | this_UnqualOp_RelationTok_2= ruleUnqualOp_RelationTok | this_UnqualOp_SegTok_3= ruleUnqualOp_SegTok | this_UnqualOp_PlusTok_4= ruleUnqualOp_PlusTok | this_UnqualOp_QuotientTok_5= ruleUnqualOp_QuotientTok | this_UnqualOp_TimesTok_6= ruleUnqualOp_TimesTok | this_UnqualOp_PowerTok_7= ruleUnqualOp_PowerTok )
            int alt29=8;
            switch ( input.LA(1) ) {
            case RULE_KW_RARROW:
            case RULE_KW_LARROW:
            case RULE_KW_MAPSTAR:
                {
                alt29=1;
                }
                break;
            case RULE_KW_VEE:
            case RULE_KW_WEDGE:
                {
                alt29=2;
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
            case 98:
            case 99:
            case 100:
                {
                alt29=3;
                }
                break;
            case RULE_KW_2DOT:
            case 101:
                {
                alt29=4;
                }
                break;
            case RULE_KW_PLUS:
            case RULE_KW_MINUS:
            case RULE_KW_PLUSMINUS:
                {
                alt29=5;
                }
                break;
            case 102:
            case 103:
            case 104:
            case 105:
                {
                alt29=6;
                }
                break;
            case RULE_KW_STAR:
            case RULE_KW_SLASH:
            case RULE_KW_BACKSLASH:
                {
                alt29=7;
                }
                break;
            case RULE_KW_2STAR:
            case RULE_KW_HAT:
                {
                alt29=8;
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
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2786:5: this_UnqualOp_ArrowTok_0= ruleUnqualOp_ArrowTok
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNakedOpAccess().getUnqualOp_ArrowTokParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnqualOp_ArrowTok_in_ruleNakedOp6746);
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
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2796:5: this_UnqualOp_LatticeTok_1= ruleUnqualOp_LatticeTok
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNakedOpAccess().getUnqualOp_LatticeTokParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnqualOp_LatticeTok_in_ruleNakedOp6773);
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
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2806:5: this_UnqualOp_RelationTok_2= ruleUnqualOp_RelationTok
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNakedOpAccess().getUnqualOp_RelationTokParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnqualOp_RelationTok_in_ruleNakedOp6800);
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
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2816:5: this_UnqualOp_SegTok_3= ruleUnqualOp_SegTok
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNakedOpAccess().getUnqualOp_SegTokParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnqualOp_SegTok_in_ruleNakedOp6827);
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
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2826:5: this_UnqualOp_PlusTok_4= ruleUnqualOp_PlusTok
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNakedOpAccess().getUnqualOp_PlusTokParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnqualOp_PlusTok_in_ruleNakedOp6854);
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
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2836:5: this_UnqualOp_QuotientTok_5= ruleUnqualOp_QuotientTok
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNakedOpAccess().getUnqualOp_QuotientTokParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnqualOp_QuotientTok_in_ruleNakedOp6881);
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
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2846:5: this_UnqualOp_TimesTok_6= ruleUnqualOp_TimesTok
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNakedOpAccess().getUnqualOp_TimesTokParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnqualOp_TimesTok_in_ruleNakedOp6908);
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
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2856:5: this_UnqualOp_PowerTok_7= ruleUnqualOp_PowerTok
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNakedOpAccess().getUnqualOp_PowerTokParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnqualOp_PowerTok_in_ruleNakedOp6935);
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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2875:1: entryRuleArrowOp returns [EObject current=null] : iv_ruleArrowOp= ruleArrowOp EOF ;
    public final EObject entryRuleArrowOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrowOp = null;


        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2876:2: (iv_ruleArrowOp= ruleArrowOp EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2877:2: iv_ruleArrowOp= ruleArrowOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrowOpRule()); 
            }
            pushFollow(FOLLOW_ruleArrowOp_in_entryRuleArrowOp6974);
            iv_ruleArrowOp=ruleArrowOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrowOp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrowOp6984); if (state.failed) return current;

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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2884:1: ruleArrowOp returns [EObject current=null] : this_QualOp_ArrowTok_0= ruleQualOp_ArrowTok ;
    public final EObject ruleArrowOp() throws RecognitionException {
        EObject current = null;

        EObject this_QualOp_ArrowTok_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2887:28: (this_QualOp_ArrowTok_0= ruleQualOp_ArrowTok )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2889:5: this_QualOp_ArrowTok_0= ruleQualOp_ArrowTok
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getArrowOpAccess().getQualOp_ArrowTokParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleQualOp_ArrowTok_in_ruleArrowOp7030);
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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2905:1: entryRuleLatticeOp returns [EObject current=null] : iv_ruleLatticeOp= ruleLatticeOp EOF ;
    public final EObject entryRuleLatticeOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLatticeOp = null;


        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2906:2: (iv_ruleLatticeOp= ruleLatticeOp EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2907:2: iv_ruleLatticeOp= ruleLatticeOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLatticeOpRule()); 
            }
            pushFollow(FOLLOW_ruleLatticeOp_in_entryRuleLatticeOp7064);
            iv_ruleLatticeOp=ruleLatticeOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLatticeOp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLatticeOp7074); if (state.failed) return current;

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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2914:1: ruleLatticeOp returns [EObject current=null] : this_QualOp_LatticeTok_0= ruleQualOp_LatticeTok ;
    public final EObject ruleLatticeOp() throws RecognitionException {
        EObject current = null;

        EObject this_QualOp_LatticeTok_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2917:28: (this_QualOp_LatticeTok_0= ruleQualOp_LatticeTok )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2919:5: this_QualOp_LatticeTok_0= ruleQualOp_LatticeTok
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLatticeOpAccess().getQualOp_LatticeTokParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleQualOp_LatticeTok_in_ruleLatticeOp7120);
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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2935:1: entryRuleRelationOp returns [EObject current=null] : iv_ruleRelationOp= ruleRelationOp EOF ;
    public final EObject entryRuleRelationOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationOp = null;


        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2936:2: (iv_ruleRelationOp= ruleRelationOp EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2937:2: iv_ruleRelationOp= ruleRelationOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationOpRule()); 
            }
            pushFollow(FOLLOW_ruleRelationOp_in_entryRuleRelationOp7154);
            iv_ruleRelationOp=ruleRelationOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationOp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationOp7164); if (state.failed) return current;

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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2944:1: ruleRelationOp returns [EObject current=null] : this_QualOp_RelationTok_0= ruleQualOp_RelationTok ;
    public final EObject ruleRelationOp() throws RecognitionException {
        EObject current = null;

        EObject this_QualOp_RelationTok_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2947:28: (this_QualOp_RelationTok_0= ruleQualOp_RelationTok )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2949:5: this_QualOp_RelationTok_0= ruleQualOp_RelationTok
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getRelationOpAccess().getQualOp_RelationTokParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleQualOp_RelationTok_in_ruleRelationOp7210);
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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2965:1: entryRuleSegOp returns [EObject current=null] : iv_ruleSegOp= ruleSegOp EOF ;
    public final EObject entryRuleSegOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSegOp = null;


        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2966:2: (iv_ruleSegOp= ruleSegOp EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2967:2: iv_ruleSegOp= ruleSegOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSegOpRule()); 
            }
            pushFollow(FOLLOW_ruleSegOp_in_entryRuleSegOp7244);
            iv_ruleSegOp=ruleSegOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSegOp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSegOp7254); if (state.failed) return current;

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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2974:1: ruleSegOp returns [EObject current=null] : this_QualOp_SegTok_0= ruleQualOp_SegTok ;
    public final EObject ruleSegOp() throws RecognitionException {
        EObject current = null;

        EObject this_QualOp_SegTok_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2977:28: (this_QualOp_SegTok_0= ruleQualOp_SegTok )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2979:5: this_QualOp_SegTok_0= ruleQualOp_SegTok
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSegOpAccess().getQualOp_SegTokParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleQualOp_SegTok_in_ruleSegOp7300);
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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2995:1: entryRulePlusOp returns [EObject current=null] : iv_rulePlusOp= rulePlusOp EOF ;
    public final EObject entryRulePlusOp() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusOp = null;


        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2996:2: (iv_rulePlusOp= rulePlusOp EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2997:2: iv_rulePlusOp= rulePlusOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPlusOpRule()); 
            }
            pushFollow(FOLLOW_rulePlusOp_in_entryRulePlusOp7334);
            iv_rulePlusOp=rulePlusOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePlusOp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePlusOp7344); if (state.failed) return current;

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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3004:1: rulePlusOp returns [EObject current=null] : this_QualOp_PlusTok_0= ruleQualOp_PlusTok ;
    public final EObject rulePlusOp() throws RecognitionException {
        EObject current = null;

        EObject this_QualOp_PlusTok_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3007:28: (this_QualOp_PlusTok_0= ruleQualOp_PlusTok )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3009:5: this_QualOp_PlusTok_0= ruleQualOp_PlusTok
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getPlusOpAccess().getQualOp_PlusTokParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleQualOp_PlusTok_in_rulePlusOp7390);
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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3025:1: entryRuleQuotientOp returns [EObject current=null] : iv_ruleQuotientOp= ruleQuotientOp EOF ;
    public final EObject entryRuleQuotientOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuotientOp = null;


        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3026:2: (iv_ruleQuotientOp= ruleQuotientOp EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3027:2: iv_ruleQuotientOp= ruleQuotientOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQuotientOpRule()); 
            }
            pushFollow(FOLLOW_ruleQuotientOp_in_entryRuleQuotientOp7424);
            iv_ruleQuotientOp=ruleQuotientOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQuotientOp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuotientOp7434); if (state.failed) return current;

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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3034:1: ruleQuotientOp returns [EObject current=null] : this_QualOp_QuotientTok_0= ruleQualOp_QuotientTok ;
    public final EObject ruleQuotientOp() throws RecognitionException {
        EObject current = null;

        EObject this_QualOp_QuotientTok_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3037:28: (this_QualOp_QuotientTok_0= ruleQualOp_QuotientTok )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3039:5: this_QualOp_QuotientTok_0= ruleQualOp_QuotientTok
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQuotientOpAccess().getQualOp_QuotientTokParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleQualOp_QuotientTok_in_ruleQuotientOp7480);
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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3055:1: entryRuleTimesOp returns [EObject current=null] : iv_ruleTimesOp= ruleTimesOp EOF ;
    public final EObject entryRuleTimesOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimesOp = null;


        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3056:2: (iv_ruleTimesOp= ruleTimesOp EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3057:2: iv_ruleTimesOp= ruleTimesOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTimesOpRule()); 
            }
            pushFollow(FOLLOW_ruleTimesOp_in_entryRuleTimesOp7514);
            iv_ruleTimesOp=ruleTimesOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTimesOp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimesOp7524); if (state.failed) return current;

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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3064:1: ruleTimesOp returns [EObject current=null] : this_QualOp_TimesTok_0= ruleQualOp_TimesTok ;
    public final EObject ruleTimesOp() throws RecognitionException {
        EObject current = null;

        EObject this_QualOp_TimesTok_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3067:28: (this_QualOp_TimesTok_0= ruleQualOp_TimesTok )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3069:5: this_QualOp_TimesTok_0= ruleQualOp_TimesTok
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getTimesOpAccess().getQualOp_TimesTokParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleQualOp_TimesTok_in_ruleTimesOp7570);
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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3085:1: entryRulePowerOp returns [EObject current=null] : iv_rulePowerOp= rulePowerOp EOF ;
    public final EObject entryRulePowerOp() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePowerOp = null;


        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3086:2: (iv_rulePowerOp= rulePowerOp EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3087:2: iv_rulePowerOp= rulePowerOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPowerOpRule()); 
            }
            pushFollow(FOLLOW_rulePowerOp_in_entryRulePowerOp7604);
            iv_rulePowerOp=rulePowerOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePowerOp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePowerOp7614); if (state.failed) return current;

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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3094:1: rulePowerOp returns [EObject current=null] : this_QualOp_PowerTok_0= ruleQualOp_PowerTok ;
    public final EObject rulePowerOp() throws RecognitionException {
        EObject current = null;

        EObject this_QualOp_PowerTok_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3097:28: (this_QualOp_PowerTok_0= ruleQualOp_PowerTok )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3099:5: this_QualOp_PowerTok_0= ruleQualOp_PowerTok
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getPowerOpAccess().getQualOp_PowerTokParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleQualOp_PowerTok_in_rulePowerOp7660);
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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3115:1: entryRuleArrowTok returns [String current=null] : iv_ruleArrowTok= ruleArrowTok EOF ;
    public final String entryRuleArrowTok() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArrowTok = null;


        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3116:2: (iv_ruleArrowTok= ruleArrowTok EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3117:2: iv_ruleArrowTok= ruleArrowTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrowTokRule()); 
            }
            pushFollow(FOLLOW_ruleArrowTok_in_entryRuleArrowTok7695);
            iv_ruleArrowTok=ruleArrowTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrowTok.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrowTok7706); if (state.failed) return current;

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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3124:1: ruleArrowTok returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_KW_RARROW_0= RULE_KW_RARROW | this_KW_LARROW_1= RULE_KW_LARROW | this_KW_MAPSTAR_2= RULE_KW_MAPSTAR ) ;
    public final AntlrDatatypeRuleToken ruleArrowTok() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_KW_RARROW_0=null;
        Token this_KW_LARROW_1=null;
        Token this_KW_MAPSTAR_2=null;

         enterRule(); 
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3127:28: ( (this_KW_RARROW_0= RULE_KW_RARROW | this_KW_LARROW_1= RULE_KW_LARROW | this_KW_MAPSTAR_2= RULE_KW_MAPSTAR ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3128:1: (this_KW_RARROW_0= RULE_KW_RARROW | this_KW_LARROW_1= RULE_KW_LARROW | this_KW_MAPSTAR_2= RULE_KW_MAPSTAR )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3128:1: (this_KW_RARROW_0= RULE_KW_RARROW | this_KW_LARROW_1= RULE_KW_LARROW | this_KW_MAPSTAR_2= RULE_KW_MAPSTAR )
            int alt30=3;
            switch ( input.LA(1) ) {
            case RULE_KW_RARROW:
                {
                alt30=1;
                }
                break;
            case RULE_KW_LARROW:
                {
                alt30=2;
                }
                break;
            case RULE_KW_MAPSTAR:
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
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3128:6: this_KW_RARROW_0= RULE_KW_RARROW
                    {
                    this_KW_RARROW_0=(Token)match(input,RULE_KW_RARROW,FOLLOW_RULE_KW_RARROW_in_ruleArrowTok7746); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_KW_RARROW_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_RARROW_0, grammarAccess.getArrowTokAccess().getKW_RARROWTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3136:10: this_KW_LARROW_1= RULE_KW_LARROW
                    {
                    this_KW_LARROW_1=(Token)match(input,RULE_KW_LARROW,FOLLOW_RULE_KW_LARROW_in_ruleArrowTok7772); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_KW_LARROW_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_LARROW_1, grammarAccess.getArrowTokAccess().getKW_LARROWTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3144:10: this_KW_MAPSTAR_2= RULE_KW_MAPSTAR
                    {
                    this_KW_MAPSTAR_2=(Token)match(input,RULE_KW_MAPSTAR,FOLLOW_RULE_KW_MAPSTAR_in_ruleArrowTok7798); if (state.failed) return current;
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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3159:1: entryRuleLatticeTok returns [String current=null] : iv_ruleLatticeTok= ruleLatticeTok EOF ;
    public final String entryRuleLatticeTok() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLatticeTok = null;


        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3160:2: (iv_ruleLatticeTok= ruleLatticeTok EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3161:2: iv_ruleLatticeTok= ruleLatticeTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLatticeTokRule()); 
            }
            pushFollow(FOLLOW_ruleLatticeTok_in_entryRuleLatticeTok7844);
            iv_ruleLatticeTok=ruleLatticeTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLatticeTok.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLatticeTok7855); if (state.failed) return current;

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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3168:1: ruleLatticeTok returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_KW_VEE_0= RULE_KW_VEE | this_KW_WEDGE_1= RULE_KW_WEDGE ) ;
    public final AntlrDatatypeRuleToken ruleLatticeTok() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_KW_VEE_0=null;
        Token this_KW_WEDGE_1=null;

         enterRule(); 
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3171:28: ( (this_KW_VEE_0= RULE_KW_VEE | this_KW_WEDGE_1= RULE_KW_WEDGE ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3172:1: (this_KW_VEE_0= RULE_KW_VEE | this_KW_WEDGE_1= RULE_KW_WEDGE )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3172:1: (this_KW_VEE_0= RULE_KW_VEE | this_KW_WEDGE_1= RULE_KW_WEDGE )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_KW_VEE) ) {
                alt31=1;
            }
            else if ( (LA31_0==RULE_KW_WEDGE) ) {
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
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3172:6: this_KW_VEE_0= RULE_KW_VEE
                    {
                    this_KW_VEE_0=(Token)match(input,RULE_KW_VEE,FOLLOW_RULE_KW_VEE_in_ruleLatticeTok7895); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_KW_VEE_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_VEE_0, grammarAccess.getLatticeTokAccess().getKW_VEETerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3180:10: this_KW_WEDGE_1= RULE_KW_WEDGE
                    {
                    this_KW_WEDGE_1=(Token)match(input,RULE_KW_WEDGE,FOLLOW_RULE_KW_WEDGE_in_ruleLatticeTok7921); if (state.failed) return current;
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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3195:1: entryRuleRelationTok returns [String current=null] : iv_ruleRelationTok= ruleRelationTok EOF ;
    public final String entryRuleRelationTok() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRelationTok = null;


        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3196:2: (iv_ruleRelationTok= ruleRelationTok EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3197:2: iv_ruleRelationTok= ruleRelationTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationTokRule()); 
            }
            pushFollow(FOLLOW_ruleRelationTok_in_entryRuleRelationTok7967);
            iv_ruleRelationTok=ruleRelationTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationTok.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationTok7978); if (state.failed) return current;

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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3204:1: ruleRelationTok returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_KW_EQ_0= RULE_KW_EQ | this_KW_TILDEE_1= RULE_KW_TILDEE | this_KW_HATE_2= RULE_KW_HATE | this_KW_GE_3= RULE_KW_GE | this_KW_GT_4= RULE_KW_GT | this_KW_2GT_5= RULE_KW_2GT | this_KW_LE_6= RULE_KW_LE | this_KW_LT_7= RULE_KW_LT | this_KW_2LT_8= RULE_KW_2LT | kw= 'is' | kw= 'isnt' | kw= 'case' ) ;
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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3207:28: ( (this_KW_EQ_0= RULE_KW_EQ | this_KW_TILDEE_1= RULE_KW_TILDEE | this_KW_HATE_2= RULE_KW_HATE | this_KW_GE_3= RULE_KW_GE | this_KW_GT_4= RULE_KW_GT | this_KW_2GT_5= RULE_KW_2GT | this_KW_LE_6= RULE_KW_LE | this_KW_LT_7= RULE_KW_LT | this_KW_2LT_8= RULE_KW_2LT | kw= 'is' | kw= 'isnt' | kw= 'case' ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3208:1: (this_KW_EQ_0= RULE_KW_EQ | this_KW_TILDEE_1= RULE_KW_TILDEE | this_KW_HATE_2= RULE_KW_HATE | this_KW_GE_3= RULE_KW_GE | this_KW_GT_4= RULE_KW_GT | this_KW_2GT_5= RULE_KW_2GT | this_KW_LE_6= RULE_KW_LE | this_KW_LT_7= RULE_KW_LT | this_KW_2LT_8= RULE_KW_2LT | kw= 'is' | kw= 'isnt' | kw= 'case' )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3208:1: (this_KW_EQ_0= RULE_KW_EQ | this_KW_TILDEE_1= RULE_KW_TILDEE | this_KW_HATE_2= RULE_KW_HATE | this_KW_GE_3= RULE_KW_GE | this_KW_GT_4= RULE_KW_GT | this_KW_2GT_5= RULE_KW_2GT | this_KW_LE_6= RULE_KW_LE | this_KW_LT_7= RULE_KW_LT | this_KW_2LT_8= RULE_KW_2LT | kw= 'is' | kw= 'isnt' | kw= 'case' )
            int alt32=12;
            switch ( input.LA(1) ) {
            case RULE_KW_EQ:
                {
                alt32=1;
                }
                break;
            case RULE_KW_TILDEE:
                {
                alt32=2;
                }
                break;
            case RULE_KW_HATE:
                {
                alt32=3;
                }
                break;
            case RULE_KW_GE:
                {
                alt32=4;
                }
                break;
            case RULE_KW_GT:
                {
                alt32=5;
                }
                break;
            case RULE_KW_2GT:
                {
                alt32=6;
                }
                break;
            case RULE_KW_LE:
                {
                alt32=7;
                }
                break;
            case RULE_KW_LT:
                {
                alt32=8;
                }
                break;
            case RULE_KW_2LT:
                {
                alt32=9;
                }
                break;
            case 98:
                {
                alt32=10;
                }
                break;
            case 99:
                {
                alt32=11;
                }
                break;
            case 100:
                {
                alt32=12;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3208:6: this_KW_EQ_0= RULE_KW_EQ
                    {
                    this_KW_EQ_0=(Token)match(input,RULE_KW_EQ,FOLLOW_RULE_KW_EQ_in_ruleRelationTok8018); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_KW_EQ_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_EQ_0, grammarAccess.getRelationTokAccess().getKW_EQTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3216:10: this_KW_TILDEE_1= RULE_KW_TILDEE
                    {
                    this_KW_TILDEE_1=(Token)match(input,RULE_KW_TILDEE,FOLLOW_RULE_KW_TILDEE_in_ruleRelationTok8044); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_KW_TILDEE_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_TILDEE_1, grammarAccess.getRelationTokAccess().getKW_TILDEETerminalRuleCall_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3224:10: this_KW_HATE_2= RULE_KW_HATE
                    {
                    this_KW_HATE_2=(Token)match(input,RULE_KW_HATE,FOLLOW_RULE_KW_HATE_in_ruleRelationTok8070); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_KW_HATE_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_HATE_2, grammarAccess.getRelationTokAccess().getKW_HATETerminalRuleCall_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3232:10: this_KW_GE_3= RULE_KW_GE
                    {
                    this_KW_GE_3=(Token)match(input,RULE_KW_GE,FOLLOW_RULE_KW_GE_in_ruleRelationTok8096); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_KW_GE_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_GE_3, grammarAccess.getRelationTokAccess().getKW_GETerminalRuleCall_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3240:10: this_KW_GT_4= RULE_KW_GT
                    {
                    this_KW_GT_4=(Token)match(input,RULE_KW_GT,FOLLOW_RULE_KW_GT_in_ruleRelationTok8122); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_KW_GT_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_GT_4, grammarAccess.getRelationTokAccess().getKW_GTTerminalRuleCall_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3248:10: this_KW_2GT_5= RULE_KW_2GT
                    {
                    this_KW_2GT_5=(Token)match(input,RULE_KW_2GT,FOLLOW_RULE_KW_2GT_in_ruleRelationTok8148); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_KW_2GT_5);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_2GT_5, grammarAccess.getRelationTokAccess().getKW_2GTTerminalRuleCall_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3256:10: this_KW_LE_6= RULE_KW_LE
                    {
                    this_KW_LE_6=(Token)match(input,RULE_KW_LE,FOLLOW_RULE_KW_LE_in_ruleRelationTok8174); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_KW_LE_6);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_LE_6, grammarAccess.getRelationTokAccess().getKW_LETerminalRuleCall_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3264:10: this_KW_LT_7= RULE_KW_LT
                    {
                    this_KW_LT_7=(Token)match(input,RULE_KW_LT,FOLLOW_RULE_KW_LT_in_ruleRelationTok8200); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_KW_LT_7);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_LT_7, grammarAccess.getRelationTokAccess().getKW_LTTerminalRuleCall_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3272:10: this_KW_2LT_8= RULE_KW_2LT
                    {
                    this_KW_2LT_8=(Token)match(input,RULE_KW_2LT,FOLLOW_RULE_KW_2LT_in_ruleRelationTok8226); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_KW_2LT_8);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_2LT_8, grammarAccess.getRelationTokAccess().getKW_2LTTerminalRuleCall_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3281:2: kw= 'is'
                    {
                    kw=(Token)match(input,98,FOLLOW_98_in_ruleRelationTok8250); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRelationTokAccess().getIsKeyword_9()); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3288:2: kw= 'isnt'
                    {
                    kw=(Token)match(input,99,FOLLOW_99_in_ruleRelationTok8269); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRelationTokAccess().getIsntKeyword_10()); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3295:2: kw= 'case'
                    {
                    kw=(Token)match(input,100,FOLLOW_100_in_ruleRelationTok8288); if (state.failed) return current;
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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3308:1: entryRuleSegTok returns [String current=null] : iv_ruleSegTok= ruleSegTok EOF ;
    public final String entryRuleSegTok() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSegTok = null;


        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3309:2: (iv_ruleSegTok= ruleSegTok EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3310:2: iv_ruleSegTok= ruleSegTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSegTokRule()); 
            }
            pushFollow(FOLLOW_ruleSegTok_in_entryRuleSegTok8329);
            iv_ruleSegTok=ruleSegTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSegTok.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSegTok8340); if (state.failed) return current;

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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3317:1: ruleSegTok returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_KW_2DOT_0= RULE_KW_2DOT | kw= 'by' ) ;
    public final AntlrDatatypeRuleToken ruleSegTok() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_KW_2DOT_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3320:28: ( (this_KW_2DOT_0= RULE_KW_2DOT | kw= 'by' ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3321:1: (this_KW_2DOT_0= RULE_KW_2DOT | kw= 'by' )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3321:1: (this_KW_2DOT_0= RULE_KW_2DOT | kw= 'by' )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_KW_2DOT) ) {
                alt33=1;
            }
            else if ( (LA33_0==101) ) {
                alt33=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3321:6: this_KW_2DOT_0= RULE_KW_2DOT
                    {
                    this_KW_2DOT_0=(Token)match(input,RULE_KW_2DOT,FOLLOW_RULE_KW_2DOT_in_ruleSegTok8380); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_KW_2DOT_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_2DOT_0, grammarAccess.getSegTokAccess().getKW_2DOTTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3330:2: kw= 'by'
                    {
                    kw=(Token)match(input,101,FOLLOW_101_in_ruleSegTok8404); if (state.failed) return current;
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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3343:1: entryRulePlusTok returns [String current=null] : iv_rulePlusTok= rulePlusTok EOF ;
    public final String entryRulePlusTok() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePlusTok = null;


        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3344:2: (iv_rulePlusTok= rulePlusTok EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3345:2: iv_rulePlusTok= rulePlusTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPlusTokRule()); 
            }
            pushFollow(FOLLOW_rulePlusTok_in_entryRulePlusTok8445);
            iv_rulePlusTok=rulePlusTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePlusTok.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePlusTok8456); if (state.failed) return current;

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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3352:1: rulePlusTok returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_KW_PLUS_0= RULE_KW_PLUS | this_KW_MINUS_1= RULE_KW_MINUS | this_KW_PLUSMINUS_2= RULE_KW_PLUSMINUS ) ;
    public final AntlrDatatypeRuleToken rulePlusTok() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_KW_PLUS_0=null;
        Token this_KW_MINUS_1=null;
        Token this_KW_PLUSMINUS_2=null;

         enterRule(); 
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3355:28: ( (this_KW_PLUS_0= RULE_KW_PLUS | this_KW_MINUS_1= RULE_KW_MINUS | this_KW_PLUSMINUS_2= RULE_KW_PLUSMINUS ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3356:1: (this_KW_PLUS_0= RULE_KW_PLUS | this_KW_MINUS_1= RULE_KW_MINUS | this_KW_PLUSMINUS_2= RULE_KW_PLUSMINUS )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3356:1: (this_KW_PLUS_0= RULE_KW_PLUS | this_KW_MINUS_1= RULE_KW_MINUS | this_KW_PLUSMINUS_2= RULE_KW_PLUSMINUS )
            int alt34=3;
            switch ( input.LA(1) ) {
            case RULE_KW_PLUS:
                {
                alt34=1;
                }
                break;
            case RULE_KW_MINUS:
                {
                alt34=2;
                }
                break;
            case RULE_KW_PLUSMINUS:
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
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3356:6: this_KW_PLUS_0= RULE_KW_PLUS
                    {
                    this_KW_PLUS_0=(Token)match(input,RULE_KW_PLUS,FOLLOW_RULE_KW_PLUS_in_rulePlusTok8496); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_KW_PLUS_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_PLUS_0, grammarAccess.getPlusTokAccess().getKW_PLUSTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3364:10: this_KW_MINUS_1= RULE_KW_MINUS
                    {
                    this_KW_MINUS_1=(Token)match(input,RULE_KW_MINUS,FOLLOW_RULE_KW_MINUS_in_rulePlusTok8522); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_KW_MINUS_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_MINUS_1, grammarAccess.getPlusTokAccess().getKW_MINUSTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3372:10: this_KW_PLUSMINUS_2= RULE_KW_PLUSMINUS
                    {
                    this_KW_PLUSMINUS_2=(Token)match(input,RULE_KW_PLUSMINUS,FOLLOW_RULE_KW_PLUSMINUS_in_rulePlusTok8548); if (state.failed) return current;
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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3387:1: entryRuleQuotientTok returns [String current=null] : iv_ruleQuotientTok= ruleQuotientTok EOF ;
    public final String entryRuleQuotientTok() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQuotientTok = null;


        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3388:2: (iv_ruleQuotientTok= ruleQuotientTok EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3389:2: iv_ruleQuotientTok= ruleQuotientTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQuotientTokRule()); 
            }
            pushFollow(FOLLOW_ruleQuotientTok_in_entryRuleQuotientTok8594);
            iv_ruleQuotientTok=ruleQuotientTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQuotientTok.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuotientTok8605); if (state.failed) return current;

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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3396:1: ruleQuotientTok returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'mod' | kw= 'quo' | kw= 'rem' | kw= 'exquo' ) ;
    public final AntlrDatatypeRuleToken ruleQuotientTok() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3399:28: ( (kw= 'mod' | kw= 'quo' | kw= 'rem' | kw= 'exquo' ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3400:1: (kw= 'mod' | kw= 'quo' | kw= 'rem' | kw= 'exquo' )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3400:1: (kw= 'mod' | kw= 'quo' | kw= 'rem' | kw= 'exquo' )
            int alt35=4;
            switch ( input.LA(1) ) {
            case 102:
                {
                alt35=1;
                }
                break;
            case 103:
                {
                alt35=2;
                }
                break;
            case 104:
                {
                alt35=3;
                }
                break;
            case 105:
                {
                alt35=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3401:2: kw= 'mod'
                    {
                    kw=(Token)match(input,102,FOLLOW_102_in_ruleQuotientTok8643); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQuotientTokAccess().getModKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3408:2: kw= 'quo'
                    {
                    kw=(Token)match(input,103,FOLLOW_103_in_ruleQuotientTok8662); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQuotientTokAccess().getQuoKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3415:2: kw= 'rem'
                    {
                    kw=(Token)match(input,104,FOLLOW_104_in_ruleQuotientTok8681); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQuotientTokAccess().getRemKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3422:2: kw= 'exquo'
                    {
                    kw=(Token)match(input,105,FOLLOW_105_in_ruleQuotientTok8700); if (state.failed) return current;
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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3435:1: entryRuleTimesTok returns [String current=null] : iv_ruleTimesTok= ruleTimesTok EOF ;
    public final String entryRuleTimesTok() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTimesTok = null;


        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3436:2: (iv_ruleTimesTok= ruleTimesTok EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3437:2: iv_ruleTimesTok= ruleTimesTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTimesTokRule()); 
            }
            pushFollow(FOLLOW_ruleTimesTok_in_entryRuleTimesTok8741);
            iv_ruleTimesTok=ruleTimesTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTimesTok.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimesTok8752); if (state.failed) return current;

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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3444:1: ruleTimesTok returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_KW_STAR_0= RULE_KW_STAR | this_KW_SLASH_1= RULE_KW_SLASH | this_KW_BACKSLASH_2= RULE_KW_BACKSLASH ) ;
    public final AntlrDatatypeRuleToken ruleTimesTok() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_KW_STAR_0=null;
        Token this_KW_SLASH_1=null;
        Token this_KW_BACKSLASH_2=null;

         enterRule(); 
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3447:28: ( (this_KW_STAR_0= RULE_KW_STAR | this_KW_SLASH_1= RULE_KW_SLASH | this_KW_BACKSLASH_2= RULE_KW_BACKSLASH ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3448:1: (this_KW_STAR_0= RULE_KW_STAR | this_KW_SLASH_1= RULE_KW_SLASH | this_KW_BACKSLASH_2= RULE_KW_BACKSLASH )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3448:1: (this_KW_STAR_0= RULE_KW_STAR | this_KW_SLASH_1= RULE_KW_SLASH | this_KW_BACKSLASH_2= RULE_KW_BACKSLASH )
            int alt36=3;
            switch ( input.LA(1) ) {
            case RULE_KW_STAR:
                {
                alt36=1;
                }
                break;
            case RULE_KW_SLASH:
                {
                alt36=2;
                }
                break;
            case RULE_KW_BACKSLASH:
                {
                alt36=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3448:6: this_KW_STAR_0= RULE_KW_STAR
                    {
                    this_KW_STAR_0=(Token)match(input,RULE_KW_STAR,FOLLOW_RULE_KW_STAR_in_ruleTimesTok8792); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_KW_STAR_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_STAR_0, grammarAccess.getTimesTokAccess().getKW_STARTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3456:10: this_KW_SLASH_1= RULE_KW_SLASH
                    {
                    this_KW_SLASH_1=(Token)match(input,RULE_KW_SLASH,FOLLOW_RULE_KW_SLASH_in_ruleTimesTok8818); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_KW_SLASH_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_SLASH_1, grammarAccess.getTimesTokAccess().getKW_SLASHTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3464:10: this_KW_BACKSLASH_2= RULE_KW_BACKSLASH
                    {
                    this_KW_BACKSLASH_2=(Token)match(input,RULE_KW_BACKSLASH,FOLLOW_RULE_KW_BACKSLASH_in_ruleTimesTok8844); if (state.failed) return current;
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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3479:1: entryRulePowerTok returns [String current=null] : iv_rulePowerTok= rulePowerTok EOF ;
    public final String entryRulePowerTok() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePowerTok = null;


        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3480:2: (iv_rulePowerTok= rulePowerTok EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3481:2: iv_rulePowerTok= rulePowerTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPowerTokRule()); 
            }
            pushFollow(FOLLOW_rulePowerTok_in_entryRulePowerTok8890);
            iv_rulePowerTok=rulePowerTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePowerTok.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePowerTok8901); if (state.failed) return current;

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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3488:1: rulePowerTok returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_KW_2STAR_0= RULE_KW_2STAR | this_KW_HAT_1= RULE_KW_HAT ) ;
    public final AntlrDatatypeRuleToken rulePowerTok() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_KW_2STAR_0=null;
        Token this_KW_HAT_1=null;

         enterRule(); 
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3491:28: ( (this_KW_2STAR_0= RULE_KW_2STAR | this_KW_HAT_1= RULE_KW_HAT ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3492:1: (this_KW_2STAR_0= RULE_KW_2STAR | this_KW_HAT_1= RULE_KW_HAT )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3492:1: (this_KW_2STAR_0= RULE_KW_2STAR | this_KW_HAT_1= RULE_KW_HAT )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_KW_2STAR) ) {
                alt37=1;
            }
            else if ( (LA37_0==RULE_KW_HAT) ) {
                alt37=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3492:6: this_KW_2STAR_0= RULE_KW_2STAR
                    {
                    this_KW_2STAR_0=(Token)match(input,RULE_KW_2STAR,FOLLOW_RULE_KW_2STAR_in_rulePowerTok8941); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_KW_2STAR_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_2STAR_0, grammarAccess.getPowerTokAccess().getKW_2STARTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3500:10: this_KW_HAT_1= RULE_KW_HAT
                    {
                    this_KW_HAT_1=(Token)match(input,RULE_KW_HAT,FOLLOW_RULE_KW_HAT_in_rulePowerTok8967); if (state.failed) return current;
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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3515:1: entryRuleApplication returns [String current=null] : iv_ruleApplication= ruleApplication EOF ;
    public final String entryRuleApplication() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleApplication = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3519:2: (iv_ruleApplication= ruleApplication EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3520:2: iv_ruleApplication= ruleApplication EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getApplicationRule()); 
            }
            pushFollow(FOLLOW_ruleApplication_in_entryRuleApplication9019);
            iv_ruleApplication=ruleApplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleApplication.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplication9030); if (state.failed) return current;

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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3530:1: ruleApplication returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'temp52' ;
    public final AntlrDatatypeRuleToken ruleApplication() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3534:28: (kw= 'temp52' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3536:2: kw= 'temp52'
            {
            kw=(Token)match(input,106,FOLLOW_106_in_ruleApplication9071); if (state.failed) return current;
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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3564:1: entryRuleMolecule returns [EObject current=null] : iv_ruleMolecule= ruleMolecule EOF ;
    public final EObject entryRuleMolecule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMolecule = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3568:2: (iv_ruleMolecule= ruleMolecule EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3569:2: iv_ruleMolecule= ruleMolecule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMoleculeRule()); 
            }
            pushFollow(FOLLOW_ruleMolecule_in_entryRuleMolecule9132);
            iv_ruleMolecule=ruleMolecule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMolecule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMolecule9142); if (state.failed) return current;

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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3579:1: ruleMolecule returns [EObject current=null] : (this_Atom_0= ruleAtom | this_Enclosure_1= ruleEnclosure ) ;
    public final EObject ruleMolecule() throws RecognitionException {
        EObject current = null;

        EObject this_Atom_0 = null;

        EObject this_Enclosure_1 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3583:28: ( (this_Atom_0= ruleAtom | this_Enclosure_1= ruleEnclosure ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3584:1: (this_Atom_0= ruleAtom | this_Enclosure_1= ruleEnclosure )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3584:1: (this_Atom_0= ruleAtom | this_Enclosure_1= ruleEnclosure )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_TK_ID||(LA38_0>=RULE_KW_SHARP && LA38_0<=RULE_TK_STRING)) ) {
                alt38=1;
            }
            else if ( (LA38_0==RULE_KW_OPAREN||LA38_0==RULE_KW_OBRACK||LA38_0==RULE_KW_QUOTE) ) {
                alt38=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3585:5: this_Atom_0= ruleAtom
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMoleculeAccess().getAtomParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAtom_in_ruleMolecule9193);
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
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3595:5: this_Enclosure_1= ruleEnclosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMoleculeAccess().getEnclosureParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEnclosure_in_ruleMolecule9220);
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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3614:1: entryRuleEnclosure returns [EObject current=null] : iv_ruleEnclosure= ruleEnclosure EOF ;
    public final EObject entryRuleEnclosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnclosure = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3618:2: (iv_ruleEnclosure= ruleEnclosure EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3619:2: iv_ruleEnclosure= ruleEnclosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnclosureRule()); 
            }
            pushFollow(FOLLOW_ruleEnclosure_in_entryRuleEnclosure9265);
            iv_ruleEnclosure=ruleEnclosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnclosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnclosure9275); if (state.failed) return current;

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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3629:1: ruleEnclosure returns [EObject current=null] : (this_Parened_0= ruleParened | this_Bracketed_1= ruleBracketed | this_QuotedIds_2= ruleQuotedIds ) ;
    public final EObject ruleEnclosure() throws RecognitionException {
        EObject current = null;

        EObject this_Parened_0 = null;

        EObject this_Bracketed_1 = null;

        EObject this_QuotedIds_2 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3633:28: ( (this_Parened_0= ruleParened | this_Bracketed_1= ruleBracketed | this_QuotedIds_2= ruleQuotedIds ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3634:1: (this_Parened_0= ruleParened | this_Bracketed_1= ruleBracketed | this_QuotedIds_2= ruleQuotedIds )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3634:1: (this_Parened_0= ruleParened | this_Bracketed_1= ruleBracketed | this_QuotedIds_2= ruleQuotedIds )
            int alt39=3;
            switch ( input.LA(1) ) {
            case RULE_KW_OPAREN:
                {
                alt39=1;
                }
                break;
            case RULE_KW_OBRACK:
                {
                alt39=2;
                }
                break;
            case RULE_KW_QUOTE:
                {
                alt39=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3635:5: this_Parened_0= ruleParened
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEnclosureAccess().getParenedParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParened_in_ruleEnclosure9326);
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
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3645:5: this_Bracketed_1= ruleBracketed
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEnclosureAccess().getBracketedParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBracketed_in_ruleEnclosure9353);
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
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3655:5: this_QuotedIds_2= ruleQuotedIds
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEnclosureAccess().getQuotedIdsParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleQuotedIds_in_ruleEnclosure9380);
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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3676:1: entryRuleBlockMolecule returns [EObject current=null] : iv_ruleBlockMolecule= ruleBlockMolecule EOF ;
    public final EObject entryRuleBlockMolecule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockMolecule = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3680:2: (iv_ruleBlockMolecule= ruleBlockMolecule EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3681:2: iv_ruleBlockMolecule= ruleBlockMolecule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBlockMoleculeRule()); 
            }
            pushFollow(FOLLOW_ruleBlockMolecule_in_entryRuleBlockMolecule9427);
            iv_ruleBlockMolecule=ruleBlockMolecule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBlockMolecule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlockMolecule9437); if (state.failed) return current;

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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3691:1: ruleBlockMolecule returns [EObject current=null] : (this_Atom_0= ruleAtom | this_Enclosure_1= ruleEnclosure | this_Block_2= ruleBlock ) ;
    public final EObject ruleBlockMolecule() throws RecognitionException {
        EObject current = null;

        EObject this_Atom_0 = null;

        EObject this_Enclosure_1 = null;

        EObject this_Block_2 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3695:28: ( (this_Atom_0= ruleAtom | this_Enclosure_1= ruleEnclosure | this_Block_2= ruleBlock ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3696:1: (this_Atom_0= ruleAtom | this_Enclosure_1= ruleEnclosure | this_Block_2= ruleBlock )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3696:1: (this_Atom_0= ruleAtom | this_Enclosure_1= ruleEnclosure | this_Block_2= ruleBlock )
            int alt40=3;
            switch ( input.LA(1) ) {
            case RULE_TK_ID:
            case RULE_KW_SHARP:
            case RULE_KW_TILDE:
            case RULE_TK_INT:
            case RULE_TK_STRING:
                {
                alt40=1;
                }
                break;
            case RULE_KW_OPAREN:
            case RULE_KW_OBRACK:
            case RULE_KW_QUOTE:
                {
                alt40=2;
                }
                break;
            case RULE_KW_OCURLY:
                {
                alt40=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3697:5: this_Atom_0= ruleAtom
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBlockMoleculeAccess().getAtomParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAtom_in_ruleBlockMolecule9488);
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
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3707:5: this_Enclosure_1= ruleEnclosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBlockMoleculeAccess().getEnclosureParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEnclosure_in_ruleBlockMolecule9515);
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
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3717:5: this_Block_2= ruleBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBlockMoleculeAccess().getBlockParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBlock_in_ruleBlockMolecule9542);
                    this_Block_2=ruleBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Block_2; 
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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3736:1: entryRuleBlockEnclosure returns [EObject current=null] : iv_ruleBlockEnclosure= ruleBlockEnclosure EOF ;
    public final EObject entryRuleBlockEnclosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockEnclosure = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3740:2: (iv_ruleBlockEnclosure= ruleBlockEnclosure EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3741:2: iv_ruleBlockEnclosure= ruleBlockEnclosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBlockEnclosureRule()); 
            }
            pushFollow(FOLLOW_ruleBlockEnclosure_in_entryRuleBlockEnclosure9587);
            iv_ruleBlockEnclosure=ruleBlockEnclosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBlockEnclosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlockEnclosure9597); if (state.failed) return current;

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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3751:1: ruleBlockEnclosure returns [EObject current=null] : (this_Enclosure_0= ruleEnclosure | this_Block_1= ruleBlock ) ;
    public final EObject ruleBlockEnclosure() throws RecognitionException {
        EObject current = null;

        EObject this_Enclosure_0 = null;

        EObject this_Block_1 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3755:28: ( (this_Enclosure_0= ruleEnclosure | this_Block_1= ruleBlock ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3756:1: (this_Enclosure_0= ruleEnclosure | this_Block_1= ruleBlock )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3756:1: (this_Enclosure_0= ruleEnclosure | this_Block_1= ruleBlock )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_KW_OPAREN||LA41_0==RULE_KW_OBRACK||LA41_0==RULE_KW_QUOTE) ) {
                alt41=1;
            }
            else if ( (LA41_0==RULE_KW_OCURLY) ) {
                alt41=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3757:5: this_Enclosure_0= ruleEnclosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBlockEnclosureAccess().getEnclosureParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEnclosure_in_ruleBlockEnclosure9648);
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
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3767:5: this_Block_1= ruleBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBlockEnclosureAccess().getBlockParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBlock_in_ruleBlockEnclosure9675);
                    this_Block_1=ruleBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Block_1; 
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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3786:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3790:2: (iv_ruleBlock= ruleBlock EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3791:2: iv_ruleBlock= ruleBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBlockRule()); 
            }
            pushFollow(FOLLOW_ruleBlock_in_entryRuleBlock9720);
            iv_ruleBlock=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlock9730); if (state.failed) return current;

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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3801:1: ruleBlock returns [EObject current=null] : this_Curly_Labeled_0= ruleCurly_Labeled ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        EObject this_Curly_Labeled_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3805:28: (this_Curly_Labeled_0= ruleCurly_Labeled )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3807:5: this_Curly_Labeled_0= ruleCurly_Labeled
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBlockAccess().getCurly_LabeledParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleCurly_Labeled_in_ruleBlock9780);
            this_Curly_Labeled_0=ruleCurly_Labeled();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Curly_Labeled_0; 
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
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleParened"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3826:1: entryRuleParened returns [EObject current=null] : iv_ruleParened= ruleParened EOF ;
    public final EObject entryRuleParened() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParened = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3830:2: (iv_ruleParened= ruleParened EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3831:2: iv_ruleParened= ruleParened EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParenedRule()); 
            }
            pushFollow(FOLLOW_ruleParened_in_entryRuleParened9824);
            iv_ruleParened=ruleParened();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParened; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParened9834); if (state.failed) return current;

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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3841:1: ruleParened returns [EObject current=null] : ( (this_KW_OPAREN_0= RULE_KW_OPAREN this_KW_CPAREN_1= RULE_KW_CPAREN ) | (this_KW_OPAREN_2= RULE_KW_OPAREN this_Expression_3= ruleExpression this_KW_CPAREN_4= RULE_KW_CPAREN ) ) ;
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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3845:28: ( ( (this_KW_OPAREN_0= RULE_KW_OPAREN this_KW_CPAREN_1= RULE_KW_CPAREN ) | (this_KW_OPAREN_2= RULE_KW_OPAREN this_Expression_3= ruleExpression this_KW_CPAREN_4= RULE_KW_CPAREN ) ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3846:1: ( (this_KW_OPAREN_0= RULE_KW_OPAREN this_KW_CPAREN_1= RULE_KW_CPAREN ) | (this_KW_OPAREN_2= RULE_KW_OPAREN this_Expression_3= ruleExpression this_KW_CPAREN_4= RULE_KW_CPAREN ) )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3846:1: ( (this_KW_OPAREN_0= RULE_KW_OPAREN this_KW_CPAREN_1= RULE_KW_CPAREN ) | (this_KW_OPAREN_2= RULE_KW_OPAREN this_Expression_3= ruleExpression this_KW_CPAREN_4= RULE_KW_CPAREN ) )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_KW_OPAREN) ) {
                int LA42_1 = input.LA(2);

                if ( (LA42_1==RULE_KW_AT||(LA42_1>=72 && LA42_1<=82)||LA42_1==87||LA42_1==95) ) {
                    alt42=2;
                }
                else if ( (LA42_1==RULE_KW_CPAREN) ) {
                    alt42=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3846:2: (this_KW_OPAREN_0= RULE_KW_OPAREN this_KW_CPAREN_1= RULE_KW_CPAREN )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3846:2: (this_KW_OPAREN_0= RULE_KW_OPAREN this_KW_CPAREN_1= RULE_KW_CPAREN )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3846:3: this_KW_OPAREN_0= RULE_KW_OPAREN this_KW_CPAREN_1= RULE_KW_CPAREN
                    {
                    this_KW_OPAREN_0=(Token)match(input,RULE_KW_OPAREN,FOLLOW_RULE_KW_OPAREN_in_ruleParened9875); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_OPAREN_0, grammarAccess.getParenedAccess().getKW_OPARENTerminalRuleCall_0_0()); 
                          
                    }
                    this_KW_CPAREN_1=(Token)match(input,RULE_KW_CPAREN,FOLLOW_RULE_KW_CPAREN_in_ruleParened9885); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_CPAREN_1, grammarAccess.getParenedAccess().getKW_CPARENTerminalRuleCall_0_1()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3855:6: (this_KW_OPAREN_2= RULE_KW_OPAREN this_Expression_3= ruleExpression this_KW_CPAREN_4= RULE_KW_CPAREN )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3855:6: (this_KW_OPAREN_2= RULE_KW_OPAREN this_Expression_3= ruleExpression this_KW_CPAREN_4= RULE_KW_CPAREN )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3855:7: this_KW_OPAREN_2= RULE_KW_OPAREN this_Expression_3= ruleExpression this_KW_CPAREN_4= RULE_KW_CPAREN
                    {
                    this_KW_OPAREN_2=(Token)match(input,RULE_KW_OPAREN,FOLLOW_RULE_KW_OPAREN_in_ruleParened9903); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_OPAREN_2, grammarAccess.getParenedAccess().getKW_OPARENTerminalRuleCall_1_0()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getParenedAccess().getExpressionParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleParened9924);
                    this_Expression_3=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Expression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    this_KW_CPAREN_4=(Token)match(input,RULE_KW_CPAREN,FOLLOW_RULE_KW_CPAREN_in_ruleParened9934); if (state.failed) return current;
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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3883:1: entryRuleBracketed returns [EObject current=null] : iv_ruleBracketed= ruleBracketed EOF ;
    public final EObject entryRuleBracketed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBracketed = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3887:2: (iv_ruleBracketed= ruleBracketed EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3888:2: iv_ruleBracketed= ruleBracketed EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBracketedRule()); 
            }
            pushFollow(FOLLOW_ruleBracketed_in_entryRuleBracketed9980);
            iv_ruleBracketed=ruleBracketed();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBracketed; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBracketed9990); if (state.failed) return current;

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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3898:1: ruleBracketed returns [EObject current=null] : ( (this_KW_OBRACK_0= RULE_KW_OBRACK this_KW_CBRACK_1= RULE_KW_CBRACK ) | (this_KW_OBRACK_2= RULE_KW_OBRACK this_Expression_3= ruleExpression this_KW_CBRACK_4= RULE_KW_CBRACK ) ) ;
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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3902:28: ( ( (this_KW_OBRACK_0= RULE_KW_OBRACK this_KW_CBRACK_1= RULE_KW_CBRACK ) | (this_KW_OBRACK_2= RULE_KW_OBRACK this_Expression_3= ruleExpression this_KW_CBRACK_4= RULE_KW_CBRACK ) ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3903:1: ( (this_KW_OBRACK_0= RULE_KW_OBRACK this_KW_CBRACK_1= RULE_KW_CBRACK ) | (this_KW_OBRACK_2= RULE_KW_OBRACK this_Expression_3= ruleExpression this_KW_CBRACK_4= RULE_KW_CBRACK ) )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3903:1: ( (this_KW_OBRACK_0= RULE_KW_OBRACK this_KW_CBRACK_1= RULE_KW_CBRACK ) | (this_KW_OBRACK_2= RULE_KW_OBRACK this_Expression_3= ruleExpression this_KW_CBRACK_4= RULE_KW_CBRACK ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_KW_OBRACK) ) {
                int LA43_1 = input.LA(2);

                if ( (LA43_1==RULE_KW_AT||(LA43_1>=72 && LA43_1<=82)||LA43_1==87||LA43_1==95) ) {
                    alt43=2;
                }
                else if ( (LA43_1==RULE_KW_CBRACK) ) {
                    alt43=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 43, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3903:2: (this_KW_OBRACK_0= RULE_KW_OBRACK this_KW_CBRACK_1= RULE_KW_CBRACK )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3903:2: (this_KW_OBRACK_0= RULE_KW_OBRACK this_KW_CBRACK_1= RULE_KW_CBRACK )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3903:3: this_KW_OBRACK_0= RULE_KW_OBRACK this_KW_CBRACK_1= RULE_KW_CBRACK
                    {
                    this_KW_OBRACK_0=(Token)match(input,RULE_KW_OBRACK,FOLLOW_RULE_KW_OBRACK_in_ruleBracketed10031); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_OBRACK_0, grammarAccess.getBracketedAccess().getKW_OBRACKTerminalRuleCall_0_0()); 
                          
                    }
                    this_KW_CBRACK_1=(Token)match(input,RULE_KW_CBRACK,FOLLOW_RULE_KW_CBRACK_in_ruleBracketed10041); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_CBRACK_1, grammarAccess.getBracketedAccess().getKW_CBRACKTerminalRuleCall_0_1()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3912:6: (this_KW_OBRACK_2= RULE_KW_OBRACK this_Expression_3= ruleExpression this_KW_CBRACK_4= RULE_KW_CBRACK )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3912:6: (this_KW_OBRACK_2= RULE_KW_OBRACK this_Expression_3= ruleExpression this_KW_CBRACK_4= RULE_KW_CBRACK )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3912:7: this_KW_OBRACK_2= RULE_KW_OBRACK this_Expression_3= ruleExpression this_KW_CBRACK_4= RULE_KW_CBRACK
                    {
                    this_KW_OBRACK_2=(Token)match(input,RULE_KW_OBRACK,FOLLOW_RULE_KW_OBRACK_in_ruleBracketed10059); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_OBRACK_2, grammarAccess.getBracketedAccess().getKW_OBRACKTerminalRuleCall_1_0()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBracketedAccess().getExpressionParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleBracketed10080);
                    this_Expression_3=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Expression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    this_KW_CBRACK_4=(Token)match(input,RULE_KW_CBRACK,FOLLOW_RULE_KW_CBRACK_in_ruleBracketed10090); if (state.failed) return current;
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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3940:1: entryRuleQuotedIds returns [EObject current=null] : iv_ruleQuotedIds= ruleQuotedIds EOF ;
    public final EObject entryRuleQuotedIds() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuotedIds = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3944:2: (iv_ruleQuotedIds= ruleQuotedIds EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3945:2: iv_ruleQuotedIds= ruleQuotedIds EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQuotedIdsRule()); 
            }
            pushFollow(FOLLOW_ruleQuotedIds_in_entryRuleQuotedIds10136);
            iv_ruleQuotedIds=ruleQuotedIds();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQuotedIds; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuotedIds10146); if (state.failed) return current;

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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3955:1: ruleQuotedIds returns [EObject current=null] : ( (this_KW_QUOTE_0= RULE_KW_QUOTE this_KW_QUOTE_1= RULE_KW_QUOTE ) | (this_KW_QUOTE_2= RULE_KW_QUOTE this_Names_3= ruleNames this_KW_QUOTE_4= RULE_KW_QUOTE ) ) ;
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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3959:28: ( ( (this_KW_QUOTE_0= RULE_KW_QUOTE this_KW_QUOTE_1= RULE_KW_QUOTE ) | (this_KW_QUOTE_2= RULE_KW_QUOTE this_Names_3= ruleNames this_KW_QUOTE_4= RULE_KW_QUOTE ) ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3960:1: ( (this_KW_QUOTE_0= RULE_KW_QUOTE this_KW_QUOTE_1= RULE_KW_QUOTE ) | (this_KW_QUOTE_2= RULE_KW_QUOTE this_Names_3= ruleNames this_KW_QUOTE_4= RULE_KW_QUOTE ) )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3960:1: ( (this_KW_QUOTE_0= RULE_KW_QUOTE this_KW_QUOTE_1= RULE_KW_QUOTE ) | (this_KW_QUOTE_2= RULE_KW_QUOTE this_Names_3= ruleNames this_KW_QUOTE_4= RULE_KW_QUOTE ) )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_KW_QUOTE) ) {
                int LA44_1 = input.LA(2);

                if ( (LA44_1==RULE_KW_QUOTE) ) {
                    alt44=1;
                }
                else if ( (LA44_1==RULE_TK_ID) ) {
                    alt44=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 44, 1, input);

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
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3960:2: (this_KW_QUOTE_0= RULE_KW_QUOTE this_KW_QUOTE_1= RULE_KW_QUOTE )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3960:2: (this_KW_QUOTE_0= RULE_KW_QUOTE this_KW_QUOTE_1= RULE_KW_QUOTE )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3960:3: this_KW_QUOTE_0= RULE_KW_QUOTE this_KW_QUOTE_1= RULE_KW_QUOTE
                    {
                    this_KW_QUOTE_0=(Token)match(input,RULE_KW_QUOTE,FOLLOW_RULE_KW_QUOTE_in_ruleQuotedIds10187); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_QUOTE_0, grammarAccess.getQuotedIdsAccess().getKW_QUOTETerminalRuleCall_0_0()); 
                          
                    }
                    this_KW_QUOTE_1=(Token)match(input,RULE_KW_QUOTE,FOLLOW_RULE_KW_QUOTE_in_ruleQuotedIds10197); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_QUOTE_1, grammarAccess.getQuotedIdsAccess().getKW_QUOTETerminalRuleCall_0_1()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3969:6: (this_KW_QUOTE_2= RULE_KW_QUOTE this_Names_3= ruleNames this_KW_QUOTE_4= RULE_KW_QUOTE )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3969:6: (this_KW_QUOTE_2= RULE_KW_QUOTE this_Names_3= ruleNames this_KW_QUOTE_4= RULE_KW_QUOTE )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3969:7: this_KW_QUOTE_2= RULE_KW_QUOTE this_Names_3= ruleNames this_KW_QUOTE_4= RULE_KW_QUOTE
                    {
                    this_KW_QUOTE_2=(Token)match(input,RULE_KW_QUOTE,FOLLOW_RULE_KW_QUOTE_in_ruleQuotedIds10215); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_QUOTE_2, grammarAccess.getQuotedIdsAccess().getKW_QUOTETerminalRuleCall_1_0()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQuotedIdsAccess().getNamesParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNames_in_ruleQuotedIds10236);
                    this_Names_3=ruleNames();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Names_3; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    this_KW_QUOTE_4=(Token)match(input,RULE_KW_QUOTE,FOLLOW_RULE_KW_QUOTE_in_ruleQuotedIds10246); if (state.failed) return current;
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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:3997:1: entryRuleNames returns [EObject current=null] : iv_ruleNames= ruleNames EOF ;
    public final EObject entryRuleNames() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNames = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4001:2: (iv_ruleNames= ruleNames EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4002:2: iv_ruleNames= ruleNames EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNamesRule()); 
            }
            pushFollow(FOLLOW_ruleNames_in_entryRuleNames10292);
            iv_ruleNames=ruleNames();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNames; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNames10302); if (state.failed) return current;

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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4012:1: ruleNames returns [EObject current=null] : ( ( (lv_firstName_0_0= RULE_TK_ID ) ) (this_KW_COMMA_1= RULE_KW_COMMA ( (lv_subsequentNames_2_0= RULE_TK_ID ) ) )* ) ;
    public final EObject ruleNames() throws RecognitionException {
        EObject current = null;

        Token lv_firstName_0_0=null;
        Token this_KW_COMMA_1=null;
        Token lv_subsequentNames_2_0=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4016:28: ( ( ( (lv_firstName_0_0= RULE_TK_ID ) ) (this_KW_COMMA_1= RULE_KW_COMMA ( (lv_subsequentNames_2_0= RULE_TK_ID ) ) )* ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4017:1: ( ( (lv_firstName_0_0= RULE_TK_ID ) ) (this_KW_COMMA_1= RULE_KW_COMMA ( (lv_subsequentNames_2_0= RULE_TK_ID ) ) )* )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4017:1: ( ( (lv_firstName_0_0= RULE_TK_ID ) ) (this_KW_COMMA_1= RULE_KW_COMMA ( (lv_subsequentNames_2_0= RULE_TK_ID ) ) )* )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4017:2: ( (lv_firstName_0_0= RULE_TK_ID ) ) (this_KW_COMMA_1= RULE_KW_COMMA ( (lv_subsequentNames_2_0= RULE_TK_ID ) ) )*
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4017:2: ( (lv_firstName_0_0= RULE_TK_ID ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4018:1: (lv_firstName_0_0= RULE_TK_ID )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4018:1: (lv_firstName_0_0= RULE_TK_ID )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4019:3: lv_firstName_0_0= RULE_TK_ID
            {
            lv_firstName_0_0=(Token)match(input,RULE_TK_ID,FOLLOW_RULE_TK_ID_in_ruleNames10348); if (state.failed) return current;
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

            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4035:2: (this_KW_COMMA_1= RULE_KW_COMMA ( (lv_subsequentNames_2_0= RULE_TK_ID ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==RULE_KW_COMMA) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4035:3: this_KW_COMMA_1= RULE_KW_COMMA ( (lv_subsequentNames_2_0= RULE_TK_ID ) )
            	    {
            	    this_KW_COMMA_1=(Token)match(input,RULE_KW_COMMA,FOLLOW_RULE_KW_COMMA_in_ruleNames10365); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_KW_COMMA_1, grammarAccess.getNamesAccess().getKW_COMMATerminalRuleCall_1_0()); 
            	          
            	    }
            	    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4039:1: ( (lv_subsequentNames_2_0= RULE_TK_ID ) )
            	    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4040:1: (lv_subsequentNames_2_0= RULE_TK_ID )
            	    {
            	    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4040:1: (lv_subsequentNames_2_0= RULE_TK_ID )
            	    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4041:3: lv_subsequentNames_2_0= RULE_TK_ID
            	    {
            	    lv_subsequentNames_2_0=(Token)match(input,RULE_TK_ID,FOLLOW_RULE_TK_ID_in_ruleNames10381); if (state.failed) return current;
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
            	    break loop45;
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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4068:1: entryRuleAtom returns [EObject current=null] : iv_ruleAtom= ruleAtom EOF ;
    public final EObject entryRuleAtom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtom = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4072:2: (iv_ruleAtom= ruleAtom EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4073:2: iv_ruleAtom= ruleAtom EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomRule()); 
            }
            pushFollow(FOLLOW_ruleAtom_in_entryRuleAtom10434);
            iv_ruleAtom=ruleAtom();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtom; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtom10444); if (state.failed) return current;

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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4083:1: ruleAtom returns [EObject current=null] : ( ( (lv_id_0_0= ruleId ) ) | ( (lv_lit_1_0= ruleLiteral ) ) ) ;
    public final EObject ruleAtom() throws RecognitionException {
        EObject current = null;

        EObject lv_id_0_0 = null;

        AntlrDatatypeRuleToken lv_lit_1_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4087:28: ( ( ( (lv_id_0_0= ruleId ) ) | ( (lv_lit_1_0= ruleLiteral ) ) ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4088:1: ( ( (lv_id_0_0= ruleId ) ) | ( (lv_lit_1_0= ruleLiteral ) ) )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4088:1: ( ( (lv_id_0_0= ruleId ) ) | ( (lv_lit_1_0= ruleLiteral ) ) )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_TK_ID||(LA46_0>=RULE_KW_SHARP && LA46_0<=RULE_KW_TILDE)) ) {
                alt46=1;
            }
            else if ( ((LA46_0>=RULE_TK_INT && LA46_0<=RULE_TK_STRING)) ) {
                alt46=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4088:2: ( (lv_id_0_0= ruleId ) )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4088:2: ( (lv_id_0_0= ruleId ) )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4089:1: (lv_id_0_0= ruleId )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4089:1: (lv_id_0_0= ruleId )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4090:3: lv_id_0_0= ruleId
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAtomAccess().getIdIdParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleId_in_ruleAtom10494);
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
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4107:6: ( (lv_lit_1_0= ruleLiteral ) )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4107:6: ( (lv_lit_1_0= ruleLiteral ) )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4108:1: (lv_lit_1_0= ruleLiteral )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4108:1: (lv_lit_1_0= ruleLiteral )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4109:3: lv_lit_1_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAtomAccess().getLitLiteralParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLiteral_in_ruleAtom10521);
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


    // $ANTLR start "entryRuleName"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4136:1: entryRuleName returns [EObject current=null] : iv_ruleName= ruleName EOF ;
    public final EObject entryRuleName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleName = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4140:2: (iv_ruleName= ruleName EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4141:2: iv_ruleName= ruleName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNameRule()); 
            }
            pushFollow(FOLLOW_ruleName_in_entryRuleName10567);
            iv_ruleName=ruleName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleName; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleName10577); if (state.failed) return current;

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
    // $ANTLR end "entryRuleName"


    // $ANTLR start "ruleName"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4151:1: ruleName returns [EObject current=null] : (this_Id_0= ruleId | this_NakedOp_1= ruleNakedOp ) ;
    public final EObject ruleName() throws RecognitionException {
        EObject current = null;

        EObject this_Id_0 = null;

        EObject this_NakedOp_1 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4155:28: ( (this_Id_0= ruleId | this_NakedOp_1= ruleNakedOp ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4156:1: (this_Id_0= ruleId | this_NakedOp_1= ruleNakedOp )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4156:1: (this_Id_0= ruleId | this_NakedOp_1= ruleNakedOp )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_TK_ID||(LA47_0>=RULE_KW_SHARP && LA47_0<=RULE_KW_TILDE)) ) {
                alt47=1;
            }
            else if ( ((LA47_0>=RULE_KW_RARROW && LA47_0<=RULE_KW_HAT)||(LA47_0>=98 && LA47_0<=105)) ) {
                alt47=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4157:5: this_Id_0= ruleId
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNameAccess().getIdParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleId_in_ruleName10628);
                    this_Id_0=ruleId();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Id_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4167:5: this_NakedOp_1= ruleNakedOp
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNameAccess().getNakedOpParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNakedOp_in_ruleName10655);
                    this_NakedOp_1=ruleNakedOp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NakedOp_1; 
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
    // $ANTLR end "ruleName"


    // $ANTLR start "entryRuleId"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4186:1: entryRuleId returns [EObject current=null] : iv_ruleId= ruleId EOF ;
    public final EObject entryRuleId() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleId = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4190:2: (iv_ruleId= ruleId EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4191:2: iv_ruleId= ruleId EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdRule()); 
            }
            pushFollow(FOLLOW_ruleId_in_entryRuleId10700);
            iv_ruleId=ruleId();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleId; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleId10710); if (state.failed) return current;

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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4201:1: ruleId returns [EObject current=null] : ( ( (lv_AB_Id_0_0= RULE_TK_ID ) ) | ( (lv_op_1_0= RULE_KW_SHARP ) ) | ( (lv_op_2_0= RULE_KW_TILDE ) ) ) ;
    public final EObject ruleId() throws RecognitionException {
        EObject current = null;

        Token lv_AB_Id_0_0=null;
        Token lv_op_1_0=null;
        Token lv_op_2_0=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4205:28: ( ( ( (lv_AB_Id_0_0= RULE_TK_ID ) ) | ( (lv_op_1_0= RULE_KW_SHARP ) ) | ( (lv_op_2_0= RULE_KW_TILDE ) ) ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4206:1: ( ( (lv_AB_Id_0_0= RULE_TK_ID ) ) | ( (lv_op_1_0= RULE_KW_SHARP ) ) | ( (lv_op_2_0= RULE_KW_TILDE ) ) )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4206:1: ( ( (lv_AB_Id_0_0= RULE_TK_ID ) ) | ( (lv_op_1_0= RULE_KW_SHARP ) ) | ( (lv_op_2_0= RULE_KW_TILDE ) ) )
            int alt48=3;
            switch ( input.LA(1) ) {
            case RULE_TK_ID:
                {
                alt48=1;
                }
                break;
            case RULE_KW_SHARP:
                {
                alt48=2;
                }
                break;
            case RULE_KW_TILDE:
                {
                alt48=3;
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
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4206:2: ( (lv_AB_Id_0_0= RULE_TK_ID ) )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4206:2: ( (lv_AB_Id_0_0= RULE_TK_ID ) )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4207:1: (lv_AB_Id_0_0= RULE_TK_ID )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4207:1: (lv_AB_Id_0_0= RULE_TK_ID )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4208:3: lv_AB_Id_0_0= RULE_TK_ID
                    {
                    lv_AB_Id_0_0=(Token)match(input,RULE_TK_ID,FOLLOW_RULE_TK_ID_in_ruleId10756); if (state.failed) return current;
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
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4225:6: ( (lv_op_1_0= RULE_KW_SHARP ) )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4225:6: ( (lv_op_1_0= RULE_KW_SHARP ) )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4226:1: (lv_op_1_0= RULE_KW_SHARP )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4226:1: (lv_op_1_0= RULE_KW_SHARP )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4227:3: lv_op_1_0= RULE_KW_SHARP
                    {
                    lv_op_1_0=(Token)match(input,RULE_KW_SHARP,FOLLOW_RULE_KW_SHARP_in_ruleId10784); if (state.failed) return current;
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
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4244:6: ( (lv_op_2_0= RULE_KW_TILDE ) )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4244:6: ( (lv_op_2_0= RULE_KW_TILDE ) )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4245:1: (lv_op_2_0= RULE_KW_TILDE )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4245:1: (lv_op_2_0= RULE_KW_TILDE )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4246:3: lv_op_2_0= RULE_KW_TILDE
                    {
                    lv_op_2_0=(Token)match(input,RULE_KW_TILDE,FOLLOW_RULE_KW_TILDE_in_ruleId10812); if (state.failed) return current;
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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4273:1: entryRuleLiteral returns [String current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final String entryRuleLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLiteral = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4277:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4278:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral10864);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral10875); if (state.failed) return current;

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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4288:1: ruleLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TK_INT_0= RULE_TK_INT | this_TK_STRING_1= RULE_TK_STRING ) ;
    public final AntlrDatatypeRuleToken ruleLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_TK_INT_0=null;
        Token this_TK_STRING_1=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4292:28: ( (this_TK_INT_0= RULE_TK_INT | this_TK_STRING_1= RULE_TK_STRING ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4293:1: (this_TK_INT_0= RULE_TK_INT | this_TK_STRING_1= RULE_TK_STRING )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4293:1: (this_TK_INT_0= RULE_TK_INT | this_TK_STRING_1= RULE_TK_STRING )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_TK_INT) ) {
                alt49=1;
            }
            else if ( (LA49_0==RULE_TK_STRING) ) {
                alt49=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4293:6: this_TK_INT_0= RULE_TK_INT
                    {
                    this_TK_INT_0=(Token)match(input,RULE_TK_INT,FOLLOW_RULE_TK_INT_in_ruleLiteral10919); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_TK_INT_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_TK_INT_0, grammarAccess.getLiteralAccess().getTK_INTTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4301:10: this_TK_STRING_1= RULE_TK_STRING
                    {
                    this_TK_STRING_1=(Token)match(input,RULE_TK_STRING,FOLLOW_RULE_TK_STRING_in_ruleLiteral10945); if (state.failed) return current;
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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4319:1: entryRuleUnqualOp_ArrowTok returns [EObject current=null] : iv_ruleUnqualOp_ArrowTok= ruleUnqualOp_ArrowTok EOF ;
    public final EObject entryRuleUnqualOp_ArrowTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnqualOp_ArrowTok = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4323:2: (iv_ruleUnqualOp_ArrowTok= ruleUnqualOp_ArrowTok EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4324:2: iv_ruleUnqualOp_ArrowTok= ruleUnqualOp_ArrowTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnqualOp_ArrowTokRule()); 
            }
            pushFollow(FOLLOW_ruleUnqualOp_ArrowTok_in_entryRuleUnqualOp_ArrowTok11000);
            iv_ruleUnqualOp_ArrowTok=ruleUnqualOp_ArrowTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnqualOp_ArrowTok; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnqualOp_ArrowTok11010); if (state.failed) return current;

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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4334:1: ruleUnqualOp_ArrowTok returns [EObject current=null] : ( ruleArrowTok () ) ;
    public final EObject ruleUnqualOp_ArrowTok() throws RecognitionException {
        EObject current = null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4338:28: ( ( ruleArrowTok () ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4339:1: ( ruleArrowTok () )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4339:1: ( ruleArrowTok () )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4340:5: ruleArrowTok ()
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getUnqualOp_ArrowTokAccess().getArrowTokParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleArrowTok_in_ruleUnqualOp_ArrowTok11055);
            ruleArrowTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4347:1: ()
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4348:5: 
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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4364:1: entryRuleUnqualOp_LatticeTok returns [EObject current=null] : iv_ruleUnqualOp_LatticeTok= ruleUnqualOp_LatticeTok EOF ;
    public final EObject entryRuleUnqualOp_LatticeTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnqualOp_LatticeTok = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4368:2: (iv_ruleUnqualOp_LatticeTok= ruleUnqualOp_LatticeTok EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4369:2: iv_ruleUnqualOp_LatticeTok= ruleUnqualOp_LatticeTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnqualOp_LatticeTokRule()); 
            }
            pushFollow(FOLLOW_ruleUnqualOp_LatticeTok_in_entryRuleUnqualOp_LatticeTok11109);
            iv_ruleUnqualOp_LatticeTok=ruleUnqualOp_LatticeTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnqualOp_LatticeTok; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnqualOp_LatticeTok11119); if (state.failed) return current;

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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4379:1: ruleUnqualOp_LatticeTok returns [EObject current=null] : ( ruleLatticeTok () ) ;
    public final EObject ruleUnqualOp_LatticeTok() throws RecognitionException {
        EObject current = null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4383:28: ( ( ruleLatticeTok () ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4384:1: ( ruleLatticeTok () )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4384:1: ( ruleLatticeTok () )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4385:5: ruleLatticeTok ()
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getUnqualOp_LatticeTokAccess().getLatticeTokParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLatticeTok_in_ruleUnqualOp_LatticeTok11164);
            ruleLatticeTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4392:1: ()
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4393:5: 
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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4409:1: entryRuleUnqualOp_RelationTok returns [EObject current=null] : iv_ruleUnqualOp_RelationTok= ruleUnqualOp_RelationTok EOF ;
    public final EObject entryRuleUnqualOp_RelationTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnqualOp_RelationTok = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4413:2: (iv_ruleUnqualOp_RelationTok= ruleUnqualOp_RelationTok EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4414:2: iv_ruleUnqualOp_RelationTok= ruleUnqualOp_RelationTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnqualOp_RelationTokRule()); 
            }
            pushFollow(FOLLOW_ruleUnqualOp_RelationTok_in_entryRuleUnqualOp_RelationTok11218);
            iv_ruleUnqualOp_RelationTok=ruleUnqualOp_RelationTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnqualOp_RelationTok; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnqualOp_RelationTok11228); if (state.failed) return current;

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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4424:1: ruleUnqualOp_RelationTok returns [EObject current=null] : ( ruleRelationTok () ) ;
    public final EObject ruleUnqualOp_RelationTok() throws RecognitionException {
        EObject current = null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4428:28: ( ( ruleRelationTok () ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4429:1: ( ruleRelationTok () )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4429:1: ( ruleRelationTok () )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4430:5: ruleRelationTok ()
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getUnqualOp_RelationTokAccess().getRelationTokParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleRelationTok_in_ruleUnqualOp_RelationTok11273);
            ruleRelationTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4437:1: ()
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4438:5: 
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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4454:1: entryRuleUnqualOp_SegTok returns [EObject current=null] : iv_ruleUnqualOp_SegTok= ruleUnqualOp_SegTok EOF ;
    public final EObject entryRuleUnqualOp_SegTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnqualOp_SegTok = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4458:2: (iv_ruleUnqualOp_SegTok= ruleUnqualOp_SegTok EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4459:2: iv_ruleUnqualOp_SegTok= ruleUnqualOp_SegTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnqualOp_SegTokRule()); 
            }
            pushFollow(FOLLOW_ruleUnqualOp_SegTok_in_entryRuleUnqualOp_SegTok11327);
            iv_ruleUnqualOp_SegTok=ruleUnqualOp_SegTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnqualOp_SegTok; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnqualOp_SegTok11337); if (state.failed) return current;

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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4469:1: ruleUnqualOp_SegTok returns [EObject current=null] : ( ruleSegTok () ) ;
    public final EObject ruleUnqualOp_SegTok() throws RecognitionException {
        EObject current = null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4473:28: ( ( ruleSegTok () ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4474:1: ( ruleSegTok () )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4474:1: ( ruleSegTok () )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4475:5: ruleSegTok ()
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getUnqualOp_SegTokAccess().getSegTokParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleSegTok_in_ruleUnqualOp_SegTok11382);
            ruleSegTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4482:1: ()
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4483:5: 
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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4499:1: entryRuleUnqualOp_PlusTok returns [EObject current=null] : iv_ruleUnqualOp_PlusTok= ruleUnqualOp_PlusTok EOF ;
    public final EObject entryRuleUnqualOp_PlusTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnqualOp_PlusTok = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4503:2: (iv_ruleUnqualOp_PlusTok= ruleUnqualOp_PlusTok EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4504:2: iv_ruleUnqualOp_PlusTok= ruleUnqualOp_PlusTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnqualOp_PlusTokRule()); 
            }
            pushFollow(FOLLOW_ruleUnqualOp_PlusTok_in_entryRuleUnqualOp_PlusTok11436);
            iv_ruleUnqualOp_PlusTok=ruleUnqualOp_PlusTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnqualOp_PlusTok; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnqualOp_PlusTok11446); if (state.failed) return current;

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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4514:1: ruleUnqualOp_PlusTok returns [EObject current=null] : ( rulePlusTok () ) ;
    public final EObject ruleUnqualOp_PlusTok() throws RecognitionException {
        EObject current = null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4518:28: ( ( rulePlusTok () ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4519:1: ( rulePlusTok () )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4519:1: ( rulePlusTok () )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4520:5: rulePlusTok ()
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getUnqualOp_PlusTokAccess().getPlusTokParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_rulePlusTok_in_ruleUnqualOp_PlusTok11491);
            rulePlusTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4527:1: ()
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4528:5: 
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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4544:1: entryRuleUnqualOp_QuotientTok returns [EObject current=null] : iv_ruleUnqualOp_QuotientTok= ruleUnqualOp_QuotientTok EOF ;
    public final EObject entryRuleUnqualOp_QuotientTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnqualOp_QuotientTok = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4548:2: (iv_ruleUnqualOp_QuotientTok= ruleUnqualOp_QuotientTok EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4549:2: iv_ruleUnqualOp_QuotientTok= ruleUnqualOp_QuotientTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnqualOp_QuotientTokRule()); 
            }
            pushFollow(FOLLOW_ruleUnqualOp_QuotientTok_in_entryRuleUnqualOp_QuotientTok11545);
            iv_ruleUnqualOp_QuotientTok=ruleUnqualOp_QuotientTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnqualOp_QuotientTok; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnqualOp_QuotientTok11555); if (state.failed) return current;

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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4559:1: ruleUnqualOp_QuotientTok returns [EObject current=null] : ( ruleQuotientTok () ) ;
    public final EObject ruleUnqualOp_QuotientTok() throws RecognitionException {
        EObject current = null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4563:28: ( ( ruleQuotientTok () ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4564:1: ( ruleQuotientTok () )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4564:1: ( ruleQuotientTok () )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4565:5: ruleQuotientTok ()
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getUnqualOp_QuotientTokAccess().getQuotientTokParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQuotientTok_in_ruleUnqualOp_QuotientTok11600);
            ruleQuotientTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4572:1: ()
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4573:5: 
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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4589:1: entryRuleUnqualOp_TimesTok returns [EObject current=null] : iv_ruleUnqualOp_TimesTok= ruleUnqualOp_TimesTok EOF ;
    public final EObject entryRuleUnqualOp_TimesTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnqualOp_TimesTok = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4593:2: (iv_ruleUnqualOp_TimesTok= ruleUnqualOp_TimesTok EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4594:2: iv_ruleUnqualOp_TimesTok= ruleUnqualOp_TimesTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnqualOp_TimesTokRule()); 
            }
            pushFollow(FOLLOW_ruleUnqualOp_TimesTok_in_entryRuleUnqualOp_TimesTok11654);
            iv_ruleUnqualOp_TimesTok=ruleUnqualOp_TimesTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnqualOp_TimesTok; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnqualOp_TimesTok11664); if (state.failed) return current;

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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4604:1: ruleUnqualOp_TimesTok returns [EObject current=null] : ( ruleTimesTok () ) ;
    public final EObject ruleUnqualOp_TimesTok() throws RecognitionException {
        EObject current = null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4608:28: ( ( ruleTimesTok () ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4609:1: ( ruleTimesTok () )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4609:1: ( ruleTimesTok () )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4610:5: ruleTimesTok ()
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getUnqualOp_TimesTokAccess().getTimesTokParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleTimesTok_in_ruleUnqualOp_TimesTok11709);
            ruleTimesTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4617:1: ()
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4618:5: 
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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4634:1: entryRuleUnqualOp_PowerTok returns [EObject current=null] : iv_ruleUnqualOp_PowerTok= ruleUnqualOp_PowerTok EOF ;
    public final EObject entryRuleUnqualOp_PowerTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnqualOp_PowerTok = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4638:2: (iv_ruleUnqualOp_PowerTok= ruleUnqualOp_PowerTok EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4639:2: iv_ruleUnqualOp_PowerTok= ruleUnqualOp_PowerTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnqualOp_PowerTokRule()); 
            }
            pushFollow(FOLLOW_ruleUnqualOp_PowerTok_in_entryRuleUnqualOp_PowerTok11763);
            iv_ruleUnqualOp_PowerTok=ruleUnqualOp_PowerTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnqualOp_PowerTok; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnqualOp_PowerTok11773); if (state.failed) return current;

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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4649:1: ruleUnqualOp_PowerTok returns [EObject current=null] : ( rulePowerTok () ) ;
    public final EObject ruleUnqualOp_PowerTok() throws RecognitionException {
        EObject current = null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4653:28: ( ( rulePowerTok () ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4654:1: ( rulePowerTok () )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4654:1: ( rulePowerTok () )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4655:5: rulePowerTok ()
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getUnqualOp_PowerTokAccess().getPowerTokParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_rulePowerTok_in_ruleUnqualOp_PowerTok11818);
            rulePowerTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4662:1: ()
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4663:5: 
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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4679:1: entryRuleQualOp_ArrowTok returns [EObject current=null] : iv_ruleQualOp_ArrowTok= ruleQualOp_ArrowTok EOF ;
    public final EObject entryRuleQualOp_ArrowTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualOp_ArrowTok = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4683:2: (iv_ruleQualOp_ArrowTok= ruleQualOp_ArrowTok EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4684:2: iv_ruleQualOp_ArrowTok= ruleQualOp_ArrowTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualOp_ArrowTokRule()); 
            }
            pushFollow(FOLLOW_ruleQualOp_ArrowTok_in_entryRuleQualOp_ArrowTok11872);
            iv_ruleQualOp_ArrowTok=ruleQualOp_ArrowTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualOp_ArrowTok; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualOp_ArrowTok11882); if (state.failed) return current;

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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4694:1: ruleQualOp_ArrowTok returns [EObject current=null] : ( ruleArrowTok | ( ruleArrowTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail ) ) ;
    public final EObject ruleQualOp_ArrowTok() throws RecognitionException {
        EObject current = null;

        Token this_KW_DOLLAR_2=null;
        EObject this_OpQualTail_3 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4698:28: ( ( ruleArrowTok | ( ruleArrowTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail ) ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4699:1: ( ruleArrowTok | ( ruleArrowTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail ) )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4699:1: ( ruleArrowTok | ( ruleArrowTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail ) )
            int alt50=2;
            switch ( input.LA(1) ) {
            case RULE_KW_RARROW:
                {
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
                break;
            case RULE_KW_LARROW:
                {
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
                break;
            case RULE_KW_MAPSTAR:
                {
                int LA50_3 = input.LA(2);

                if ( (LA50_3==EOF) ) {
                    alt50=1;
                }
                else if ( (LA50_3==RULE_KW_DOLLAR) ) {
                    alt50=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 50, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4700:5: ruleArrowTok
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQualOp_ArrowTokAccess().getArrowTokParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleArrowTok_in_ruleQualOp_ArrowTok11927);
                    ruleArrowTok();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4708:6: ( ruleArrowTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4708:6: ( ruleArrowTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4709:5: ruleArrowTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQualOp_ArrowTokAccess().getArrowTokParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleArrowTok_in_ruleQualOp_ArrowTok11949);
                    ruleArrowTok();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    this_KW_DOLLAR_2=(Token)match(input,RULE_KW_DOLLAR,FOLLOW_RULE_KW_DOLLAR_in_ruleQualOp_ArrowTok11959); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_DOLLAR_2, grammarAccess.getQualOp_ArrowTokAccess().getKW_DOLLARTerminalRuleCall_1_1()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQualOp_ArrowTokAccess().getOpQualTailParserRuleCall_1_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOpQualTail_in_ruleQualOp_ArrowTok11980);
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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4740:1: entryRuleQualOp_LatticeTok returns [EObject current=null] : iv_ruleQualOp_LatticeTok= ruleQualOp_LatticeTok EOF ;
    public final EObject entryRuleQualOp_LatticeTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualOp_LatticeTok = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4744:2: (iv_ruleQualOp_LatticeTok= ruleQualOp_LatticeTok EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4745:2: iv_ruleQualOp_LatticeTok= ruleQualOp_LatticeTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualOp_LatticeTokRule()); 
            }
            pushFollow(FOLLOW_ruleQualOp_LatticeTok_in_entryRuleQualOp_LatticeTok12026);
            iv_ruleQualOp_LatticeTok=ruleQualOp_LatticeTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualOp_LatticeTok; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualOp_LatticeTok12036); if (state.failed) return current;

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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4755:1: ruleQualOp_LatticeTok returns [EObject current=null] : ( ruleLatticeTok | ( ruleLatticeTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail ) ) ;
    public final EObject ruleQualOp_LatticeTok() throws RecognitionException {
        EObject current = null;

        Token this_KW_DOLLAR_2=null;
        EObject this_OpQualTail_3 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4759:28: ( ( ruleLatticeTok | ( ruleLatticeTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail ) ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4760:1: ( ruleLatticeTok | ( ruleLatticeTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail ) )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4760:1: ( ruleLatticeTok | ( ruleLatticeTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail ) )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_KW_VEE) ) {
                int LA51_1 = input.LA(2);

                if ( (LA51_1==RULE_KW_DOLLAR) ) {
                    alt51=2;
                }
                else if ( (LA51_1==EOF) ) {
                    alt51=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 51, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA51_0==RULE_KW_WEDGE) ) {
                int LA51_2 = input.LA(2);

                if ( (LA51_2==EOF) ) {
                    alt51=1;
                }
                else if ( (LA51_2==RULE_KW_DOLLAR) ) {
                    alt51=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 51, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4761:5: ruleLatticeTok
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQualOp_LatticeTokAccess().getLatticeTokParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLatticeTok_in_ruleQualOp_LatticeTok12081);
                    ruleLatticeTok();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4769:6: ( ruleLatticeTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4769:6: ( ruleLatticeTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4770:5: ruleLatticeTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQualOp_LatticeTokAccess().getLatticeTokParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLatticeTok_in_ruleQualOp_LatticeTok12103);
                    ruleLatticeTok();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    this_KW_DOLLAR_2=(Token)match(input,RULE_KW_DOLLAR,FOLLOW_RULE_KW_DOLLAR_in_ruleQualOp_LatticeTok12113); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_DOLLAR_2, grammarAccess.getQualOp_LatticeTokAccess().getKW_DOLLARTerminalRuleCall_1_1()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQualOp_LatticeTokAccess().getOpQualTailParserRuleCall_1_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOpQualTail_in_ruleQualOp_LatticeTok12134);
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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4801:1: entryRuleQualOp_RelationTok returns [EObject current=null] : iv_ruleQualOp_RelationTok= ruleQualOp_RelationTok EOF ;
    public final EObject entryRuleQualOp_RelationTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualOp_RelationTok = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4805:2: (iv_ruleQualOp_RelationTok= ruleQualOp_RelationTok EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4806:2: iv_ruleQualOp_RelationTok= ruleQualOp_RelationTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualOp_RelationTokRule()); 
            }
            pushFollow(FOLLOW_ruleQualOp_RelationTok_in_entryRuleQualOp_RelationTok12180);
            iv_ruleQualOp_RelationTok=ruleQualOp_RelationTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualOp_RelationTok; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualOp_RelationTok12190); if (state.failed) return current;

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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4816:1: ruleQualOp_RelationTok returns [EObject current=null] : ( ruleRelationTok | ( ruleRelationTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail ) ) ;
    public final EObject ruleQualOp_RelationTok() throws RecognitionException {
        EObject current = null;

        Token this_KW_DOLLAR_2=null;
        EObject this_OpQualTail_3 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4820:28: ( ( ruleRelationTok | ( ruleRelationTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail ) ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4821:1: ( ruleRelationTok | ( ruleRelationTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail ) )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4821:1: ( ruleRelationTok | ( ruleRelationTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail ) )
            int alt52=2;
            alt52 = dfa52.predict(input);
            switch (alt52) {
                case 1 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4822:5: ruleRelationTok
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQualOp_RelationTokAccess().getRelationTokParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRelationTok_in_ruleQualOp_RelationTok12235);
                    ruleRelationTok();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4830:6: ( ruleRelationTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4830:6: ( ruleRelationTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4831:5: ruleRelationTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQualOp_RelationTokAccess().getRelationTokParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRelationTok_in_ruleQualOp_RelationTok12257);
                    ruleRelationTok();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    this_KW_DOLLAR_2=(Token)match(input,RULE_KW_DOLLAR,FOLLOW_RULE_KW_DOLLAR_in_ruleQualOp_RelationTok12267); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_DOLLAR_2, grammarAccess.getQualOp_RelationTokAccess().getKW_DOLLARTerminalRuleCall_1_1()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQualOp_RelationTokAccess().getOpQualTailParserRuleCall_1_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOpQualTail_in_ruleQualOp_RelationTok12288);
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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4862:1: entryRuleQualOp_SegTok returns [EObject current=null] : iv_ruleQualOp_SegTok= ruleQualOp_SegTok EOF ;
    public final EObject entryRuleQualOp_SegTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualOp_SegTok = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4866:2: (iv_ruleQualOp_SegTok= ruleQualOp_SegTok EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4867:2: iv_ruleQualOp_SegTok= ruleQualOp_SegTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualOp_SegTokRule()); 
            }
            pushFollow(FOLLOW_ruleQualOp_SegTok_in_entryRuleQualOp_SegTok12334);
            iv_ruleQualOp_SegTok=ruleQualOp_SegTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualOp_SegTok; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualOp_SegTok12344); if (state.failed) return current;

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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4877:1: ruleQualOp_SegTok returns [EObject current=null] : ( ruleSegTok | ( ruleSegTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail ) ) ;
    public final EObject ruleQualOp_SegTok() throws RecognitionException {
        EObject current = null;

        Token this_KW_DOLLAR_2=null;
        EObject this_OpQualTail_3 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4881:28: ( ( ruleSegTok | ( ruleSegTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail ) ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4882:1: ( ruleSegTok | ( ruleSegTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail ) )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4882:1: ( ruleSegTok | ( ruleSegTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail ) )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_KW_2DOT) ) {
                int LA53_1 = input.LA(2);

                if ( (LA53_1==EOF) ) {
                    alt53=1;
                }
                else if ( (LA53_1==RULE_KW_DOLLAR) ) {
                    alt53=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 53, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA53_0==101) ) {
                int LA53_2 = input.LA(2);

                if ( (LA53_2==RULE_KW_DOLLAR) ) {
                    alt53=2;
                }
                else if ( (LA53_2==EOF) ) {
                    alt53=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 53, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4883:5: ruleSegTok
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQualOp_SegTokAccess().getSegTokParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSegTok_in_ruleQualOp_SegTok12389);
                    ruleSegTok();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4891:6: ( ruleSegTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4891:6: ( ruleSegTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4892:5: ruleSegTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQualOp_SegTokAccess().getSegTokParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSegTok_in_ruleQualOp_SegTok12411);
                    ruleSegTok();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    this_KW_DOLLAR_2=(Token)match(input,RULE_KW_DOLLAR,FOLLOW_RULE_KW_DOLLAR_in_ruleQualOp_SegTok12421); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_DOLLAR_2, grammarAccess.getQualOp_SegTokAccess().getKW_DOLLARTerminalRuleCall_1_1()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQualOp_SegTokAccess().getOpQualTailParserRuleCall_1_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOpQualTail_in_ruleQualOp_SegTok12442);
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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4923:1: entryRuleQualOp_PlusTok returns [EObject current=null] : iv_ruleQualOp_PlusTok= ruleQualOp_PlusTok EOF ;
    public final EObject entryRuleQualOp_PlusTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualOp_PlusTok = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4927:2: (iv_ruleQualOp_PlusTok= ruleQualOp_PlusTok EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4928:2: iv_ruleQualOp_PlusTok= ruleQualOp_PlusTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualOp_PlusTokRule()); 
            }
            pushFollow(FOLLOW_ruleQualOp_PlusTok_in_entryRuleQualOp_PlusTok12488);
            iv_ruleQualOp_PlusTok=ruleQualOp_PlusTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualOp_PlusTok; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualOp_PlusTok12498); if (state.failed) return current;

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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4938:1: ruleQualOp_PlusTok returns [EObject current=null] : ( rulePlusTok | ( rulePlusTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail ) ) ;
    public final EObject ruleQualOp_PlusTok() throws RecognitionException {
        EObject current = null;

        Token this_KW_DOLLAR_2=null;
        EObject this_OpQualTail_3 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4942:28: ( ( rulePlusTok | ( rulePlusTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail ) ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4943:1: ( rulePlusTok | ( rulePlusTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail ) )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4943:1: ( rulePlusTok | ( rulePlusTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail ) )
            int alt54=2;
            switch ( input.LA(1) ) {
            case RULE_KW_PLUS:
                {
                int LA54_1 = input.LA(2);

                if ( (LA54_1==RULE_KW_DOLLAR) ) {
                    alt54=2;
                }
                else if ( (LA54_1==EOF) ) {
                    alt54=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 54, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_KW_MINUS:
                {
                int LA54_2 = input.LA(2);

                if ( (LA54_2==EOF) ) {
                    alt54=1;
                }
                else if ( (LA54_2==RULE_KW_DOLLAR) ) {
                    alt54=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 54, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_KW_PLUSMINUS:
                {
                int LA54_3 = input.LA(2);

                if ( (LA54_3==EOF) ) {
                    alt54=1;
                }
                else if ( (LA54_3==RULE_KW_DOLLAR) ) {
                    alt54=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 54, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }

            switch (alt54) {
                case 1 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4944:5: rulePlusTok
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQualOp_PlusTokAccess().getPlusTokParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePlusTok_in_ruleQualOp_PlusTok12543);
                    rulePlusTok();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4952:6: ( rulePlusTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4952:6: ( rulePlusTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4953:5: rulePlusTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQualOp_PlusTokAccess().getPlusTokParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePlusTok_in_ruleQualOp_PlusTok12565);
                    rulePlusTok();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    this_KW_DOLLAR_2=(Token)match(input,RULE_KW_DOLLAR,FOLLOW_RULE_KW_DOLLAR_in_ruleQualOp_PlusTok12575); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_DOLLAR_2, grammarAccess.getQualOp_PlusTokAccess().getKW_DOLLARTerminalRuleCall_1_1()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQualOp_PlusTokAccess().getOpQualTailParserRuleCall_1_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOpQualTail_in_ruleQualOp_PlusTok12596);
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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4984:1: entryRuleQualOp_QuotientTok returns [EObject current=null] : iv_ruleQualOp_QuotientTok= ruleQualOp_QuotientTok EOF ;
    public final EObject entryRuleQualOp_QuotientTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualOp_QuotientTok = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4988:2: (iv_ruleQualOp_QuotientTok= ruleQualOp_QuotientTok EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4989:2: iv_ruleQualOp_QuotientTok= ruleQualOp_QuotientTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualOp_QuotientTokRule()); 
            }
            pushFollow(FOLLOW_ruleQualOp_QuotientTok_in_entryRuleQualOp_QuotientTok12642);
            iv_ruleQualOp_QuotientTok=ruleQualOp_QuotientTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualOp_QuotientTok; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualOp_QuotientTok12652); if (state.failed) return current;

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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:4999:1: ruleQualOp_QuotientTok returns [EObject current=null] : ( ruleQuotientTok | ( ruleQuotientTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail ) ) ;
    public final EObject ruleQualOp_QuotientTok() throws RecognitionException {
        EObject current = null;

        Token this_KW_DOLLAR_2=null;
        EObject this_OpQualTail_3 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5003:28: ( ( ruleQuotientTok | ( ruleQuotientTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail ) ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5004:1: ( ruleQuotientTok | ( ruleQuotientTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail ) )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5004:1: ( ruleQuotientTok | ( ruleQuotientTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail ) )
            int alt55=2;
            switch ( input.LA(1) ) {
            case 102:
                {
                int LA55_1 = input.LA(2);

                if ( (LA55_1==EOF) ) {
                    alt55=1;
                }
                else if ( (LA55_1==RULE_KW_DOLLAR) ) {
                    alt55=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 55, 1, input);

                    throw nvae;
                }
                }
                break;
            case 103:
                {
                int LA55_2 = input.LA(2);

                if ( (LA55_2==EOF) ) {
                    alt55=1;
                }
                else if ( (LA55_2==RULE_KW_DOLLAR) ) {
                    alt55=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 55, 2, input);

                    throw nvae;
                }
                }
                break;
            case 104:
                {
                int LA55_3 = input.LA(2);

                if ( (LA55_3==RULE_KW_DOLLAR) ) {
                    alt55=2;
                }
                else if ( (LA55_3==EOF) ) {
                    alt55=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 55, 3, input);

                    throw nvae;
                }
                }
                break;
            case 105:
                {
                int LA55_4 = input.LA(2);

                if ( (LA55_4==RULE_KW_DOLLAR) ) {
                    alt55=2;
                }
                else if ( (LA55_4==EOF) ) {
                    alt55=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 55, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5005:5: ruleQuotientTok
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQualOp_QuotientTokAccess().getQuotientTokParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleQuotientTok_in_ruleQualOp_QuotientTok12697);
                    ruleQuotientTok();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5013:6: ( ruleQuotientTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5013:6: ( ruleQuotientTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5014:5: ruleQuotientTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQualOp_QuotientTokAccess().getQuotientTokParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleQuotientTok_in_ruleQualOp_QuotientTok12719);
                    ruleQuotientTok();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    this_KW_DOLLAR_2=(Token)match(input,RULE_KW_DOLLAR,FOLLOW_RULE_KW_DOLLAR_in_ruleQualOp_QuotientTok12729); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_DOLLAR_2, grammarAccess.getQualOp_QuotientTokAccess().getKW_DOLLARTerminalRuleCall_1_1()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQualOp_QuotientTokAccess().getOpQualTailParserRuleCall_1_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOpQualTail_in_ruleQualOp_QuotientTok12750);
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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5045:1: entryRuleQualOp_TimesTok returns [EObject current=null] : iv_ruleQualOp_TimesTok= ruleQualOp_TimesTok EOF ;
    public final EObject entryRuleQualOp_TimesTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualOp_TimesTok = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5049:2: (iv_ruleQualOp_TimesTok= ruleQualOp_TimesTok EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5050:2: iv_ruleQualOp_TimesTok= ruleQualOp_TimesTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualOp_TimesTokRule()); 
            }
            pushFollow(FOLLOW_ruleQualOp_TimesTok_in_entryRuleQualOp_TimesTok12796);
            iv_ruleQualOp_TimesTok=ruleQualOp_TimesTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualOp_TimesTok; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualOp_TimesTok12806); if (state.failed) return current;

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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5060:1: ruleQualOp_TimesTok returns [EObject current=null] : ( ruleTimesTok | ( ruleTimesTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail ) ) ;
    public final EObject ruleQualOp_TimesTok() throws RecognitionException {
        EObject current = null;

        Token this_KW_DOLLAR_2=null;
        EObject this_OpQualTail_3 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5064:28: ( ( ruleTimesTok | ( ruleTimesTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail ) ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5065:1: ( ruleTimesTok | ( ruleTimesTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail ) )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5065:1: ( ruleTimesTok | ( ruleTimesTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail ) )
            int alt56=2;
            switch ( input.LA(1) ) {
            case RULE_KW_STAR:
                {
                int LA56_1 = input.LA(2);

                if ( (LA56_1==EOF) ) {
                    alt56=1;
                }
                else if ( (LA56_1==RULE_KW_DOLLAR) ) {
                    alt56=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 56, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_KW_SLASH:
                {
                int LA56_2 = input.LA(2);

                if ( (LA56_2==RULE_KW_DOLLAR) ) {
                    alt56=2;
                }
                else if ( (LA56_2==EOF) ) {
                    alt56=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 56, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_KW_BACKSLASH:
                {
                int LA56_3 = input.LA(2);

                if ( (LA56_3==RULE_KW_DOLLAR) ) {
                    alt56=2;
                }
                else if ( (LA56_3==EOF) ) {
                    alt56=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 56, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5066:5: ruleTimesTok
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQualOp_TimesTokAccess().getTimesTokParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTimesTok_in_ruleQualOp_TimesTok12851);
                    ruleTimesTok();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5074:6: ( ruleTimesTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5074:6: ( ruleTimesTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5075:5: ruleTimesTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQualOp_TimesTokAccess().getTimesTokParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTimesTok_in_ruleQualOp_TimesTok12873);
                    ruleTimesTok();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    this_KW_DOLLAR_2=(Token)match(input,RULE_KW_DOLLAR,FOLLOW_RULE_KW_DOLLAR_in_ruleQualOp_TimesTok12883); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_DOLLAR_2, grammarAccess.getQualOp_TimesTokAccess().getKW_DOLLARTerminalRuleCall_1_1()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQualOp_TimesTokAccess().getOpQualTailParserRuleCall_1_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOpQualTail_in_ruleQualOp_TimesTok12904);
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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5106:1: entryRuleQualOp_PowerTok returns [EObject current=null] : iv_ruleQualOp_PowerTok= ruleQualOp_PowerTok EOF ;
    public final EObject entryRuleQualOp_PowerTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualOp_PowerTok = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5110:2: (iv_ruleQualOp_PowerTok= ruleQualOp_PowerTok EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5111:2: iv_ruleQualOp_PowerTok= ruleQualOp_PowerTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualOp_PowerTokRule()); 
            }
            pushFollow(FOLLOW_ruleQualOp_PowerTok_in_entryRuleQualOp_PowerTok12950);
            iv_ruleQualOp_PowerTok=ruleQualOp_PowerTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualOp_PowerTok; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualOp_PowerTok12960); if (state.failed) return current;

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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5121:1: ruleQualOp_PowerTok returns [EObject current=null] : ( rulePowerTok | ( rulePowerTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail ) ) ;
    public final EObject ruleQualOp_PowerTok() throws RecognitionException {
        EObject current = null;

        Token this_KW_DOLLAR_2=null;
        EObject this_OpQualTail_3 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5125:28: ( ( rulePowerTok | ( rulePowerTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail ) ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5126:1: ( rulePowerTok | ( rulePowerTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail ) )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5126:1: ( rulePowerTok | ( rulePowerTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail ) )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_KW_2STAR) ) {
                int LA57_1 = input.LA(2);

                if ( (LA57_1==EOF) ) {
                    alt57=1;
                }
                else if ( (LA57_1==RULE_KW_DOLLAR) ) {
                    alt57=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 57, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA57_0==RULE_KW_HAT) ) {
                int LA57_2 = input.LA(2);

                if ( (LA57_2==RULE_KW_DOLLAR) ) {
                    alt57=2;
                }
                else if ( (LA57_2==EOF) ) {
                    alt57=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 57, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5127:5: rulePowerTok
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQualOp_PowerTokAccess().getPowerTokParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePowerTok_in_ruleQualOp_PowerTok13005);
                    rulePowerTok();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5135:6: ( rulePowerTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail )
                    {
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5135:6: ( rulePowerTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail )
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5136:5: rulePowerTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQualOp_PowerTokAccess().getPowerTokParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePowerTok_in_ruleQualOp_PowerTok13027);
                    rulePowerTok();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    this_KW_DOLLAR_2=(Token)match(input,RULE_KW_DOLLAR,FOLLOW_RULE_KW_DOLLAR_in_ruleQualOp_PowerTok13037); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_KW_DOLLAR_2, grammarAccess.getQualOp_PowerTokAccess().getKW_DOLLARTerminalRuleCall_1_1()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQualOp_PowerTokAccess().getOpQualTailParserRuleCall_1_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOpQualTail_in_ruleQualOp_PowerTok13058);
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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5171:1: entryRulePreDocumentList returns [String current=null] : iv_rulePreDocumentList= rulePreDocumentList EOF ;
    public final String entryRulePreDocumentList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePreDocumentList = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5175:2: (iv_rulePreDocumentList= rulePreDocumentList EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5176:2: iv_rulePreDocumentList= rulePreDocumentList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPreDocumentListRule()); 
            }
            pushFollow(FOLLOW_rulePreDocumentList_in_entryRulePreDocumentList13109);
            iv_rulePreDocumentList=rulePreDocumentList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePreDocumentList.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePreDocumentList13120); if (state.failed) return current;

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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5186:1: rulePreDocumentList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TK_PREDOC_0= RULE_TK_PREDOC this_PreDocumentList_1= rulePreDocumentList )? ;
    public final AntlrDatatypeRuleToken rulePreDocumentList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_TK_PREDOC_0=null;
        AntlrDatatypeRuleToken this_PreDocumentList_1 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5190:28: ( (this_TK_PREDOC_0= RULE_TK_PREDOC this_PreDocumentList_1= rulePreDocumentList )? )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5191:1: (this_TK_PREDOC_0= RULE_TK_PREDOC this_PreDocumentList_1= rulePreDocumentList )?
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5191:1: (this_TK_PREDOC_0= RULE_TK_PREDOC this_PreDocumentList_1= rulePreDocumentList )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_TK_PREDOC) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5191:6: this_TK_PREDOC_0= RULE_TK_PREDOC this_PreDocumentList_1= rulePreDocumentList
                    {
                    this_TK_PREDOC_0=(Token)match(input,RULE_TK_PREDOC,FOLLOW_RULE_TK_PREDOC_in_rulePreDocumentList13164); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_TK_PREDOC_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_TK_PREDOC_0, grammarAccess.getPreDocumentListAccess().getTK_PREDOCTerminalRuleCall_0()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPreDocumentListAccess().getPreDocumentListParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_rulePreDocumentList_in_rulePreDocumentList13191);
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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5220:1: entryRulePostDocumentList returns [String current=null] : iv_rulePostDocumentList= rulePostDocumentList EOF ;
    public final String entryRulePostDocumentList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePostDocumentList = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5224:2: (iv_rulePostDocumentList= rulePostDocumentList EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5225:2: iv_rulePostDocumentList= rulePostDocumentList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPostDocumentListRule()); 
            }
            pushFollow(FOLLOW_rulePostDocumentList_in_entryRulePostDocumentList13248);
            iv_rulePostDocumentList=rulePostDocumentList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePostDocumentList.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePostDocumentList13259); if (state.failed) return current;

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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5235:1: rulePostDocumentList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TK_POSTDOC_0= RULE_TK_POSTDOC this_PostDocumentList_1= rulePostDocumentList )? ;
    public final AntlrDatatypeRuleToken rulePostDocumentList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_TK_POSTDOC_0=null;
        AntlrDatatypeRuleToken this_PostDocumentList_1 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5239:28: ( (this_TK_POSTDOC_0= RULE_TK_POSTDOC this_PostDocumentList_1= rulePostDocumentList )? )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5240:1: (this_TK_POSTDOC_0= RULE_TK_POSTDOC this_PostDocumentList_1= rulePostDocumentList )?
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5240:1: (this_TK_POSTDOC_0= RULE_TK_POSTDOC this_PostDocumentList_1= rulePostDocumentList )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_TK_POSTDOC) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5240:6: this_TK_POSTDOC_0= RULE_TK_POSTDOC this_PostDocumentList_1= rulePostDocumentList
                    {
                    this_TK_POSTDOC_0=(Token)match(input,RULE_TK_POSTDOC,FOLLOW_RULE_TK_POSTDOC_in_rulePostDocumentList13303); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_TK_POSTDOC_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_TK_POSTDOC_0, grammarAccess.getPostDocumentListAccess().getTK_POSTDOCTerminalRuleCall_0()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPostDocumentListAccess().getPostDocumentListParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_rulePostDocumentList_in_rulePostDocumentList13330);
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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5269:1: entryRuleenlist1_CommaItem_Comma_AB returns [EObject current=null] : iv_ruleenlist1_CommaItem_Comma_AB= ruleenlist1_CommaItem_Comma_AB EOF ;
    public final EObject entryRuleenlist1_CommaItem_Comma_AB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleenlist1_CommaItem_Comma_AB = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5273:2: (iv_ruleenlist1_CommaItem_Comma_AB= ruleenlist1_CommaItem_Comma_AB EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5274:2: iv_ruleenlist1_CommaItem_Comma_AB= ruleenlist1_CommaItem_Comma_AB EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnlist1_CommaItem_Comma_ABRule()); 
            }
            pushFollow(FOLLOW_ruleenlist1_CommaItem_Comma_AB_in_entryRuleenlist1_CommaItem_Comma_AB13386);
            iv_ruleenlist1_CommaItem_Comma_AB=ruleenlist1_CommaItem_Comma_AB();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleenlist1_CommaItem_Comma_AB; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleenlist1_CommaItem_Comma_AB13396); if (state.failed) return current;

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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5284:1: ruleenlist1_CommaItem_Comma_AB returns [EObject current=null] : this_enlister1_CommaItem_Comma_0= ruleenlister1_CommaItem_Comma ;
    public final EObject ruleenlist1_CommaItem_Comma_AB() throws RecognitionException {
        EObject current = null;

        EObject this_enlister1_CommaItem_Comma_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5288:28: (this_enlister1_CommaItem_Comma_0= ruleenlister1_CommaItem_Comma )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5290:5: this_enlister1_CommaItem_Comma_0= ruleenlister1_CommaItem_Comma
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getEnlist1_CommaItem_Comma_ABAccess().getEnlister1_CommaItem_CommaParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleenlister1_CommaItem_Comma_in_ruleenlist1_CommaItem_Comma_AB13446);
            this_enlister1_CommaItem_Comma_0=ruleenlister1_CommaItem_Comma();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_enlister1_CommaItem_Comma_0; 
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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5309:1: entryRuleenlist1_Infixed_Comma_AB returns [EObject current=null] : iv_ruleenlist1_Infixed_Comma_AB= ruleenlist1_Infixed_Comma_AB EOF ;
    public final EObject entryRuleenlist1_Infixed_Comma_AB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleenlist1_Infixed_Comma_AB = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5313:2: (iv_ruleenlist1_Infixed_Comma_AB= ruleenlist1_Infixed_Comma_AB EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5314:2: iv_ruleenlist1_Infixed_Comma_AB= ruleenlist1_Infixed_Comma_AB EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnlist1_Infixed_Comma_ABRule()); 
            }
            pushFollow(FOLLOW_ruleenlist1_Infixed_Comma_AB_in_entryRuleenlist1_Infixed_Comma_AB13490);
            iv_ruleenlist1_Infixed_Comma_AB=ruleenlist1_Infixed_Comma_AB();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleenlist1_Infixed_Comma_AB; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleenlist1_Infixed_Comma_AB13500); if (state.failed) return current;

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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5324:1: ruleenlist1_Infixed_Comma_AB returns [EObject current=null] : this_enlister1_Infixed_Comma_0= ruleenlister1_Infixed_Comma ;
    public final EObject ruleenlist1_Infixed_Comma_AB() throws RecognitionException {
        EObject current = null;

        EObject this_enlister1_Infixed_Comma_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5328:28: (this_enlister1_Infixed_Comma_0= ruleenlister1_Infixed_Comma )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5330:5: this_enlister1_Infixed_Comma_0= ruleenlister1_Infixed_Comma
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getEnlist1_Infixed_Comma_ABAccess().getEnlister1_Infixed_CommaParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleenlister1_Infixed_Comma_in_ruleenlist1_Infixed_Comma_AB13550);
            this_enlister1_Infixed_Comma_0=ruleenlister1_Infixed_Comma();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_enlister1_Infixed_Comma_0; 
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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5349:1: entryRuleenlist1_InfixedExpr_Comma_AB returns [String current=null] : iv_ruleenlist1_InfixedExpr_Comma_AB= ruleenlist1_InfixedExpr_Comma_AB EOF ;
    public final String entryRuleenlist1_InfixedExpr_Comma_AB() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleenlist1_InfixedExpr_Comma_AB = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5353:2: (iv_ruleenlist1_InfixedExpr_Comma_AB= ruleenlist1_InfixedExpr_Comma_AB EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5354:2: iv_ruleenlist1_InfixedExpr_Comma_AB= ruleenlist1_InfixedExpr_Comma_AB EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnlist1_InfixedExpr_Comma_ABRule()); 
            }
            pushFollow(FOLLOW_ruleenlist1_InfixedExpr_Comma_AB_in_entryRuleenlist1_InfixedExpr_Comma_AB13595);
            iv_ruleenlist1_InfixedExpr_Comma_AB=ruleenlist1_InfixedExpr_Comma_AB();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleenlist1_InfixedExpr_Comma_AB.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleenlist1_InfixedExpr_Comma_AB13606); if (state.failed) return current;

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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5364:1: ruleenlist1_InfixedExpr_Comma_AB returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_enlister1_InfixedExpr_Comma_0= ruleenlister1_InfixedExpr_Comma ;
    public final AntlrDatatypeRuleToken ruleenlist1_InfixedExpr_Comma_AB() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_enlister1_InfixedExpr_Comma_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5368:28: (this_enlister1_InfixedExpr_Comma_0= ruleenlister1_InfixedExpr_Comma )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5370:5: this_enlister1_InfixedExpr_Comma_0= ruleenlister1_InfixedExpr_Comma
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getEnlist1_InfixedExpr_Comma_ABAccess().getEnlister1_InfixedExpr_CommaParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleenlister1_InfixedExpr_Comma_in_ruleenlist1_InfixedExpr_Comma_AB13656);
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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5391:1: entryRuleenlister1_CommaItem_Comma returns [EObject current=null] : iv_ruleenlister1_CommaItem_Comma= ruleenlister1_CommaItem_Comma EOF ;
    public final EObject entryRuleenlister1_CommaItem_Comma() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleenlister1_CommaItem_Comma = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5395:2: (iv_ruleenlister1_CommaItem_Comma= ruleenlister1_CommaItem_Comma EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5396:2: iv_ruleenlister1_CommaItem_Comma= ruleenlister1_CommaItem_Comma EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnlister1_CommaItem_CommaRule()); 
            }
            pushFollow(FOLLOW_ruleenlister1_CommaItem_Comma_in_entryRuleenlister1_CommaItem_Comma13710);
            iv_ruleenlister1_CommaItem_Comma=ruleenlister1_CommaItem_Comma();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleenlister1_CommaItem_Comma; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleenlister1_CommaItem_Comma13720); if (state.failed) return current;

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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5406:1: ruleenlister1_CommaItem_Comma returns [EObject current=null] : (this_CommaItem_0= ruleCommaItem (this_KW_COMMA_1= RULE_KW_COMMA ( (lv_ci_2_0= ruleCommaItem ) ) )* ) ;
    public final EObject ruleenlister1_CommaItem_Comma() throws RecognitionException {
        EObject current = null;

        Token this_KW_COMMA_1=null;
        EObject this_CommaItem_0 = null;

        EObject lv_ci_2_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5410:28: ( (this_CommaItem_0= ruleCommaItem (this_KW_COMMA_1= RULE_KW_COMMA ( (lv_ci_2_0= ruleCommaItem ) ) )* ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5411:1: (this_CommaItem_0= ruleCommaItem (this_KW_COMMA_1= RULE_KW_COMMA ( (lv_ci_2_0= ruleCommaItem ) ) )* )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5411:1: (this_CommaItem_0= ruleCommaItem (this_KW_COMMA_1= RULE_KW_COMMA ( (lv_ci_2_0= ruleCommaItem ) ) )* )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5412:5: this_CommaItem_0= ruleCommaItem (this_KW_COMMA_1= RULE_KW_COMMA ( (lv_ci_2_0= ruleCommaItem ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getEnlister1_CommaItem_CommaAccess().getCommaItemParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleCommaItem_in_ruleenlister1_CommaItem_Comma13771);
            this_CommaItem_0=ruleCommaItem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_CommaItem_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5420:1: (this_KW_COMMA_1= RULE_KW_COMMA ( (lv_ci_2_0= ruleCommaItem ) ) )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==RULE_KW_COMMA) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5420:2: this_KW_COMMA_1= RULE_KW_COMMA ( (lv_ci_2_0= ruleCommaItem ) )
            	    {
            	    this_KW_COMMA_1=(Token)match(input,RULE_KW_COMMA,FOLLOW_RULE_KW_COMMA_in_ruleenlister1_CommaItem_Comma13782); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_KW_COMMA_1, grammarAccess.getEnlister1_CommaItem_CommaAccess().getKW_COMMATerminalRuleCall_1_0()); 
            	          
            	    }
            	    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5424:1: ( (lv_ci_2_0= ruleCommaItem ) )
            	    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5425:1: (lv_ci_2_0= ruleCommaItem )
            	    {
            	    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5425:1: (lv_ci_2_0= ruleCommaItem )
            	    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5426:3: lv_ci_2_0= ruleCommaItem
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEnlister1_CommaItem_CommaAccess().getCiCommaItemParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleCommaItem_in_ruleenlister1_CommaItem_Comma13802);
            	    lv_ci_2_0=ruleCommaItem();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getEnlister1_CommaItem_CommaRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"ci",
            	              		lv_ci_2_0, 
            	              		"CommaItem");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop60;
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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5453:1: entryRuleenlister1_Infixed_Comma returns [EObject current=null] : iv_ruleenlister1_Infixed_Comma= ruleenlister1_Infixed_Comma EOF ;
    public final EObject entryRuleenlister1_Infixed_Comma() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleenlister1_Infixed_Comma = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5457:2: (iv_ruleenlister1_Infixed_Comma= ruleenlister1_Infixed_Comma EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5458:2: iv_ruleenlister1_Infixed_Comma= ruleenlister1_Infixed_Comma EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnlister1_Infixed_CommaRule()); 
            }
            pushFollow(FOLLOW_ruleenlister1_Infixed_Comma_in_entryRuleenlister1_Infixed_Comma13850);
            iv_ruleenlister1_Infixed_Comma=ruleenlister1_Infixed_Comma();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleenlister1_Infixed_Comma; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleenlister1_Infixed_Comma13860); if (state.failed) return current;

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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5468:1: ruleenlister1_Infixed_Comma returns [EObject current=null] : ( ruleInfixed (this_KW_COMMA_1= RULE_KW_COMMA ( (lv_i_2_0= ruleInfixed ) ) )* ) ;
    public final EObject ruleenlister1_Infixed_Comma() throws RecognitionException {
        EObject current = null;

        Token this_KW_COMMA_1=null;
        AntlrDatatypeRuleToken lv_i_2_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5472:28: ( ( ruleInfixed (this_KW_COMMA_1= RULE_KW_COMMA ( (lv_i_2_0= ruleInfixed ) ) )* ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5473:1: ( ruleInfixed (this_KW_COMMA_1= RULE_KW_COMMA ( (lv_i_2_0= ruleInfixed ) ) )* )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5473:1: ( ruleInfixed (this_KW_COMMA_1= RULE_KW_COMMA ( (lv_i_2_0= ruleInfixed ) ) )* )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5474:5: ruleInfixed (this_KW_COMMA_1= RULE_KW_COMMA ( (lv_i_2_0= ruleInfixed ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getEnlister1_Infixed_CommaAccess().getInfixedParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleInfixed_in_ruleenlister1_Infixed_Comma13905);
            ruleInfixed();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5481:1: (this_KW_COMMA_1= RULE_KW_COMMA ( (lv_i_2_0= ruleInfixed ) ) )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==RULE_KW_COMMA) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5481:2: this_KW_COMMA_1= RULE_KW_COMMA ( (lv_i_2_0= ruleInfixed ) )
            	    {
            	    this_KW_COMMA_1=(Token)match(input,RULE_KW_COMMA,FOLLOW_RULE_KW_COMMA_in_ruleenlister1_Infixed_Comma13916); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_KW_COMMA_1, grammarAccess.getEnlister1_Infixed_CommaAccess().getKW_COMMATerminalRuleCall_1_0()); 
            	          
            	    }
            	    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5485:1: ( (lv_i_2_0= ruleInfixed ) )
            	    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5486:1: (lv_i_2_0= ruleInfixed )
            	    {
            	    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5486:1: (lv_i_2_0= ruleInfixed )
            	    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5487:3: lv_i_2_0= ruleInfixed
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEnlister1_Infixed_CommaAccess().getIInfixedParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleInfixed_in_ruleenlister1_Infixed_Comma13936);
            	    lv_i_2_0=ruleInfixed();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getEnlister1_Infixed_CommaRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"i",
            	              		lv_i_2_0, 
            	              		"Infixed");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop61;
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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5514:1: entryRuleenlister1_InfixedExpr_Comma returns [String current=null] : iv_ruleenlister1_InfixedExpr_Comma= ruleenlister1_InfixedExpr_Comma EOF ;
    public final String entryRuleenlister1_InfixedExpr_Comma() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleenlister1_InfixedExpr_Comma = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5518:2: (iv_ruleenlister1_InfixedExpr_Comma= ruleenlister1_InfixedExpr_Comma EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5519:2: iv_ruleenlister1_InfixedExpr_Comma= ruleenlister1_InfixedExpr_Comma EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnlister1_InfixedExpr_CommaRule()); 
            }
            pushFollow(FOLLOW_ruleenlister1_InfixedExpr_Comma_in_entryRuleenlister1_InfixedExpr_Comma13985);
            iv_ruleenlister1_InfixedExpr_Comma=ruleenlister1_InfixedExpr_Comma();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleenlister1_InfixedExpr_Comma.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleenlister1_InfixedExpr_Comma13996); if (state.failed) return current;

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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5529:1: ruleenlister1_InfixedExpr_Comma returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_InfixedExpr_0= ruleInfixedExpr (this_KW_COMMA_1= RULE_KW_COMMA this_InfixedExpr_2= ruleInfixedExpr )* ) ;
    public final AntlrDatatypeRuleToken ruleenlister1_InfixedExpr_Comma() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_KW_COMMA_1=null;
        AntlrDatatypeRuleToken this_InfixedExpr_0 = null;

        AntlrDatatypeRuleToken this_InfixedExpr_2 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5533:28: ( (this_InfixedExpr_0= ruleInfixedExpr (this_KW_COMMA_1= RULE_KW_COMMA this_InfixedExpr_2= ruleInfixedExpr )* ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5534:1: (this_InfixedExpr_0= ruleInfixedExpr (this_KW_COMMA_1= RULE_KW_COMMA this_InfixedExpr_2= ruleInfixedExpr )* )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5534:1: (this_InfixedExpr_0= ruleInfixedExpr (this_KW_COMMA_1= RULE_KW_COMMA this_InfixedExpr_2= ruleInfixedExpr )* )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5535:5: this_InfixedExpr_0= ruleInfixedExpr (this_KW_COMMA_1= RULE_KW_COMMA this_InfixedExpr_2= ruleInfixedExpr )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getEnlister1_InfixedExpr_CommaAccess().getInfixedExprParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleInfixedExpr_in_ruleenlister1_InfixedExpr_Comma14047);
            this_InfixedExpr_0=ruleInfixedExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_InfixedExpr_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5545:1: (this_KW_COMMA_1= RULE_KW_COMMA this_InfixedExpr_2= ruleInfixedExpr )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==RULE_KW_COMMA) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5545:6: this_KW_COMMA_1= RULE_KW_COMMA this_InfixedExpr_2= ruleInfixedExpr
            	    {
            	    this_KW_COMMA_1=(Token)match(input,RULE_KW_COMMA,FOLLOW_RULE_KW_COMMA_in_ruleenlister1_InfixedExpr_Comma14068); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_KW_COMMA_1);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_KW_COMMA_1, grammarAccess.getEnlister1_InfixedExpr_CommaAccess().getKW_COMMATerminalRuleCall_1_0()); 
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getEnlister1_InfixedExpr_CommaAccess().getInfixedExprParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleInfixedExpr_in_ruleenlister1_InfixedExpr_Comma14095);
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
            	    break loop62;
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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5574:1: entryRuleenlist1a_Labeled_Semicolon_AB returns [EObject current=null] : iv_ruleenlist1a_Labeled_Semicolon_AB= ruleenlist1a_Labeled_Semicolon_AB EOF ;
    public final EObject entryRuleenlist1a_Labeled_Semicolon_AB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleenlist1a_Labeled_Semicolon_AB = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5578:2: (iv_ruleenlist1a_Labeled_Semicolon_AB= ruleenlist1a_Labeled_Semicolon_AB EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5579:2: iv_ruleenlist1a_Labeled_Semicolon_AB= ruleenlist1a_Labeled_Semicolon_AB EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnlist1a_Labeled_Semicolon_ABRule()); 
            }
            pushFollow(FOLLOW_ruleenlist1a_Labeled_Semicolon_AB_in_entryRuleenlist1a_Labeled_Semicolon_AB14152);
            iv_ruleenlist1a_Labeled_Semicolon_AB=ruleenlist1a_Labeled_Semicolon_AB();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleenlist1a_Labeled_Semicolon_AB; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleenlist1a_Labeled_Semicolon_AB14162); if (state.failed) return current;

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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5589:1: ruleenlist1a_Labeled_Semicolon_AB returns [EObject current=null] : this_enlister1a_Labeled_Semicolon_0= ruleenlister1a_Labeled_Semicolon ;
    public final EObject ruleenlist1a_Labeled_Semicolon_AB() throws RecognitionException {
        EObject current = null;

        EObject this_enlister1a_Labeled_Semicolon_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5593:28: (this_enlister1a_Labeled_Semicolon_0= ruleenlister1a_Labeled_Semicolon )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5595:5: this_enlister1a_Labeled_Semicolon_0= ruleenlister1a_Labeled_Semicolon
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getEnlist1a_Labeled_Semicolon_ABAccess().getEnlister1a_Labeled_SemicolonParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleenlister1a_Labeled_Semicolon_in_ruleenlist1a_Labeled_Semicolon_AB14212);
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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5614:1: entryRuleenlister1a_Labeled_Semicolon returns [EObject current=null] : iv_ruleenlister1a_Labeled_Semicolon= ruleenlister1a_Labeled_Semicolon EOF ;
    public final EObject entryRuleenlister1a_Labeled_Semicolon() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleenlister1a_Labeled_Semicolon = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5618:2: (iv_ruleenlister1a_Labeled_Semicolon= ruleenlister1a_Labeled_Semicolon EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5619:2: iv_ruleenlister1a_Labeled_Semicolon= ruleenlister1a_Labeled_Semicolon EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnlister1a_Labeled_SemicolonRule()); 
            }
            pushFollow(FOLLOW_ruleenlister1a_Labeled_Semicolon_in_entryRuleenlister1a_Labeled_Semicolon14256);
            iv_ruleenlister1a_Labeled_Semicolon=ruleenlister1a_Labeled_Semicolon();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleenlister1a_Labeled_Semicolon; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleenlister1a_Labeled_Semicolon14266); if (state.failed) return current;

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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5629:1: ruleenlister1a_Labeled_Semicolon returns [EObject current=null] : ( ( (lv_statemnts_0_0= ruleLabeled ) ) (this_KW_SEMICOLON_1= RULE_KW_SEMICOLON ( (lv_statemnts_2_0= ruleLabeled ) ) ) (this_KW_SEMICOLON_3= RULE_KW_SEMICOLON )? ) ;
    public final EObject ruleenlister1a_Labeled_Semicolon() throws RecognitionException {
        EObject current = null;

        Token this_KW_SEMICOLON_1=null;
        Token this_KW_SEMICOLON_3=null;
        EObject lv_statemnts_0_0 = null;

        EObject lv_statemnts_2_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_KW_NEWLINE");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5633:28: ( ( ( (lv_statemnts_0_0= ruleLabeled ) ) (this_KW_SEMICOLON_1= RULE_KW_SEMICOLON ( (lv_statemnts_2_0= ruleLabeled ) ) ) (this_KW_SEMICOLON_3= RULE_KW_SEMICOLON )? ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5634:1: ( ( (lv_statemnts_0_0= ruleLabeled ) ) (this_KW_SEMICOLON_1= RULE_KW_SEMICOLON ( (lv_statemnts_2_0= ruleLabeled ) ) ) (this_KW_SEMICOLON_3= RULE_KW_SEMICOLON )? )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5634:1: ( ( (lv_statemnts_0_0= ruleLabeled ) ) (this_KW_SEMICOLON_1= RULE_KW_SEMICOLON ( (lv_statemnts_2_0= ruleLabeled ) ) ) (this_KW_SEMICOLON_3= RULE_KW_SEMICOLON )? )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5634:2: ( (lv_statemnts_0_0= ruleLabeled ) ) (this_KW_SEMICOLON_1= RULE_KW_SEMICOLON ( (lv_statemnts_2_0= ruleLabeled ) ) ) (this_KW_SEMICOLON_3= RULE_KW_SEMICOLON )?
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5634:2: ( (lv_statemnts_0_0= ruleLabeled ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5635:1: (lv_statemnts_0_0= ruleLabeled )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5635:1: (lv_statemnts_0_0= ruleLabeled )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5636:3: lv_statemnts_0_0= ruleLabeled
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEnlister1a_Labeled_SemicolonAccess().getStatemntsLabeledParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLabeled_in_ruleenlister1a_Labeled_Semicolon14316);
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

            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5652:2: (this_KW_SEMICOLON_1= RULE_KW_SEMICOLON ( (lv_statemnts_2_0= ruleLabeled ) ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5652:3: this_KW_SEMICOLON_1= RULE_KW_SEMICOLON ( (lv_statemnts_2_0= ruleLabeled ) )
            {
            this_KW_SEMICOLON_1=(Token)match(input,RULE_KW_SEMICOLON,FOLLOW_RULE_KW_SEMICOLON_in_ruleenlister1a_Labeled_Semicolon14328); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_KW_SEMICOLON_1, grammarAccess.getEnlister1a_Labeled_SemicolonAccess().getKW_SEMICOLONTerminalRuleCall_1_0()); 
                  
            }
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5656:1: ( (lv_statemnts_2_0= ruleLabeled ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5657:1: (lv_statemnts_2_0= ruleLabeled )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5657:1: (lv_statemnts_2_0= ruleLabeled )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5658:3: lv_statemnts_2_0= ruleLabeled
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEnlister1a_Labeled_SemicolonAccess().getStatemntsLabeledParserRuleCall_1_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLabeled_in_ruleenlister1a_Labeled_Semicolon14348);
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

            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5674:3: (this_KW_SEMICOLON_3= RULE_KW_SEMICOLON )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==RULE_KW_SEMICOLON) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5674:4: this_KW_SEMICOLON_3= RULE_KW_SEMICOLON
                    {
                    this_KW_SEMICOLON_3=(Token)match(input,RULE_KW_SEMICOLON,FOLLOW_RULE_KW_SEMICOLON_in_ruleenlister1a_Labeled_Semicolon14361); if (state.failed) return current;
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


    // $ANTLR start "entryRuleCurly_Labeled"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5689:1: entryRuleCurly_Labeled returns [EObject current=null] : iv_ruleCurly_Labeled= ruleCurly_Labeled EOF ;
    public final EObject entryRuleCurly_Labeled() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCurly_Labeled = null;


        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5690:2: (iv_ruleCurly_Labeled= ruleCurly_Labeled EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5691:2: iv_ruleCurly_Labeled= ruleCurly_Labeled EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCurly_LabeledRule()); 
            }
            pushFollow(FOLLOW_ruleCurly_Labeled_in_entryRuleCurly_Labeled14402);
            iv_ruleCurly_Labeled=ruleCurly_Labeled();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCurly_Labeled; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCurly_Labeled14412); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCurly_Labeled"


    // $ANTLR start "ruleCurly_Labeled"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5698:1: ruleCurly_Labeled returns [EObject current=null] : (this_KW_OCURLY_0= RULE_KW_OCURLY this_CurlyContents_Labeled_1= ruleCurlyContents_Labeled this_KW_CCURLY_2= RULE_KW_CCURLY ) ;
    public final EObject ruleCurly_Labeled() throws RecognitionException {
        EObject current = null;

        Token this_KW_OCURLY_0=null;
        Token this_KW_CCURLY_2=null;
        EObject this_CurlyContents_Labeled_1 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5701:28: ( (this_KW_OCURLY_0= RULE_KW_OCURLY this_CurlyContents_Labeled_1= ruleCurlyContents_Labeled this_KW_CCURLY_2= RULE_KW_CCURLY ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5702:1: (this_KW_OCURLY_0= RULE_KW_OCURLY this_CurlyContents_Labeled_1= ruleCurlyContents_Labeled this_KW_CCURLY_2= RULE_KW_CCURLY )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5702:1: (this_KW_OCURLY_0= RULE_KW_OCURLY this_CurlyContents_Labeled_1= ruleCurlyContents_Labeled this_KW_CCURLY_2= RULE_KW_CCURLY )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5702:2: this_KW_OCURLY_0= RULE_KW_OCURLY this_CurlyContents_Labeled_1= ruleCurlyContents_Labeled this_KW_CCURLY_2= RULE_KW_CCURLY
            {
            this_KW_OCURLY_0=(Token)match(input,RULE_KW_OCURLY,FOLLOW_RULE_KW_OCURLY_in_ruleCurly_Labeled14448); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_KW_OCURLY_0, grammarAccess.getCurly_LabeledAccess().getKW_OCURLYTerminalRuleCall_0()); 
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCurly_LabeledAccess().getCurlyContents_LabeledParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleCurlyContents_Labeled_in_ruleCurly_Labeled14469);
            this_CurlyContents_Labeled_1=ruleCurlyContents_Labeled();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_CurlyContents_Labeled_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            this_KW_CCURLY_2=(Token)match(input,RULE_KW_CCURLY,FOLLOW_RULE_KW_CCURLY_in_ruleCurly_Labeled14479); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_KW_CCURLY_2, grammarAccess.getCurly_LabeledAccess().getKW_CCURLYTerminalRuleCall_2()); 
                  
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
        }
        return current;
    }
    // $ANTLR end "ruleCurly_Labeled"


    // $ANTLR start "entryRuleCurlyContents_Labeled"
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5727:1: entryRuleCurlyContents_Labeled returns [EObject current=null] : iv_ruleCurlyContents_Labeled= ruleCurlyContents_Labeled EOF ;
    public final EObject entryRuleCurlyContents_Labeled() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCurlyContents_Labeled = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5731:2: (iv_ruleCurlyContents_Labeled= ruleCurlyContents_Labeled EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5732:2: iv_ruleCurlyContents_Labeled= ruleCurlyContents_Labeled EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCurlyContents_LabeledRule()); 
            }
            pushFollow(FOLLOW_ruleCurlyContents_Labeled_in_entryRuleCurlyContents_Labeled14520);
            iv_ruleCurlyContents_Labeled=ruleCurlyContents_Labeled();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCurlyContents_Labeled; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCurlyContents_Labeled14530); if (state.failed) return current;

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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5742:1: ruleCurlyContents_Labeled returns [EObject current=null] : this_CurlyContentsList_Labeled_0= ruleCurlyContentsList_Labeled ;
    public final EObject ruleCurlyContents_Labeled() throws RecognitionException {
        EObject current = null;

        EObject this_CurlyContentsList_Labeled_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5746:28: (this_CurlyContentsList_Labeled_0= ruleCurlyContentsList_Labeled )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5748:5: this_CurlyContentsList_Labeled_0= ruleCurlyContentsList_Labeled
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCurlyContents_LabeledAccess().getCurlyContentsList_LabeledParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleCurlyContentsList_Labeled_in_ruleCurlyContents_Labeled14580);
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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5767:1: entryRuleCurlyContentsList_Labeled returns [EObject current=null] : iv_ruleCurlyContentsList_Labeled= ruleCurlyContentsList_Labeled EOF ;
    public final EObject entryRuleCurlyContentsList_Labeled() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCurlyContentsList_Labeled = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        	
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5771:2: (iv_ruleCurlyContentsList_Labeled= ruleCurlyContentsList_Labeled EOF )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5772:2: iv_ruleCurlyContentsList_Labeled= ruleCurlyContentsList_Labeled EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCurlyContentsList_LabeledRule()); 
            }
            pushFollow(FOLLOW_ruleCurlyContentsList_Labeled_in_entryRuleCurlyContentsList_Labeled14624);
            iv_ruleCurlyContentsList_Labeled=ruleCurlyContentsList_Labeled();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCurlyContentsList_Labeled; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCurlyContentsList_Labeled14634); if (state.failed) return current;

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
    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5782:1: ruleCurlyContentsList_Labeled returns [EObject current=null] : ( ( (lv_statemts_0_0= ruleLabeled ) ) (this_KW_SEMICOLON_1= RULE_KW_SEMICOLON ( (lv_statemts_2_0= ruleLabeled ) ) )* (this_KW_SEMICOLON_3= RULE_KW_SEMICOLON )? ) ;
    public final EObject ruleCurlyContentsList_Labeled() throws RecognitionException {
        EObject current = null;

        Token this_KW_SEMICOLON_1=null;
        Token this_KW_SEMICOLON_3=null;
        EObject lv_statemts_0_0 = null;

        EObject lv_statemts_2_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
            
        try {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5786:28: ( ( ( (lv_statemts_0_0= ruleLabeled ) ) (this_KW_SEMICOLON_1= RULE_KW_SEMICOLON ( (lv_statemts_2_0= ruleLabeled ) ) )* (this_KW_SEMICOLON_3= RULE_KW_SEMICOLON )? ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5787:1: ( ( (lv_statemts_0_0= ruleLabeled ) ) (this_KW_SEMICOLON_1= RULE_KW_SEMICOLON ( (lv_statemts_2_0= ruleLabeled ) ) )* (this_KW_SEMICOLON_3= RULE_KW_SEMICOLON )? )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5787:1: ( ( (lv_statemts_0_0= ruleLabeled ) ) (this_KW_SEMICOLON_1= RULE_KW_SEMICOLON ( (lv_statemts_2_0= ruleLabeled ) ) )* (this_KW_SEMICOLON_3= RULE_KW_SEMICOLON )? )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5787:2: ( (lv_statemts_0_0= ruleLabeled ) ) (this_KW_SEMICOLON_1= RULE_KW_SEMICOLON ( (lv_statemts_2_0= ruleLabeled ) ) )* (this_KW_SEMICOLON_3= RULE_KW_SEMICOLON )?
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5787:2: ( (lv_statemts_0_0= ruleLabeled ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5788:1: (lv_statemts_0_0= ruleLabeled )
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5788:1: (lv_statemts_0_0= ruleLabeled )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5789:3: lv_statemts_0_0= ruleLabeled
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCurlyContentsList_LabeledAccess().getStatemtsLabeledParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLabeled_in_ruleCurlyContentsList_Labeled14684);
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

            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5805:2: (this_KW_SEMICOLON_1= RULE_KW_SEMICOLON ( (lv_statemts_2_0= ruleLabeled ) ) )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==RULE_KW_SEMICOLON) ) {
                    int LA64_1 = input.LA(2);

                    if ( (LA64_1==RULE_KW_AT||(LA64_1>=72 && LA64_1<=82)||LA64_1==87||LA64_1==95) ) {
                        alt64=1;
                    }


                }


                switch (alt64) {
            	case 1 :
            	    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5805:3: this_KW_SEMICOLON_1= RULE_KW_SEMICOLON ( (lv_statemts_2_0= ruleLabeled ) )
            	    {
            	    this_KW_SEMICOLON_1=(Token)match(input,RULE_KW_SEMICOLON,FOLLOW_RULE_KW_SEMICOLON_in_ruleCurlyContentsList_Labeled14696); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_KW_SEMICOLON_1, grammarAccess.getCurlyContentsList_LabeledAccess().getKW_SEMICOLONTerminalRuleCall_1_0()); 
            	          
            	    }
            	    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5809:1: ( (lv_statemts_2_0= ruleLabeled ) )
            	    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5810:1: (lv_statemts_2_0= ruleLabeled )
            	    {
            	    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5810:1: (lv_statemts_2_0= ruleLabeled )
            	    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5811:3: lv_statemts_2_0= ruleLabeled
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCurlyContentsList_LabeledAccess().getStatemtsLabeledParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLabeled_in_ruleCurlyContentsList_Labeled14716);
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
            	    break loop64;
                }
            } while (true);

            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5827:4: (this_KW_SEMICOLON_3= RULE_KW_SEMICOLON )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==RULE_KW_SEMICOLON) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:5827:5: this_KW_SEMICOLON_3= RULE_KW_SEMICOLON
                    {
                    this_KW_SEMICOLON_3=(Token)match(input,RULE_KW_SEMICOLON,FOLLOW_RULE_KW_SEMICOLON_in_ruleCurlyContentsList_Labeled14730); if (state.failed) return current;
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
        // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:461:7: ( ( 'export' ( ruleSig )? ( ( ruleToPart ) ) ) )
        // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:461:8: ( 'export' ( ruleSig )? ( ( ruleToPart ) ) )
        {
        // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:461:8: ( 'export' ( ruleSig )? ( ( ruleToPart ) ) )
        // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:461:10: 'export' ( ruleSig )? ( ( ruleToPart ) )
        {
        match(input,82,FOLLOW_82_in_synpred1_InternalEditor1119); if (state.failed) return ;
        // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:462:1: ( ruleSig )?
        int alt66=2;
        int LA66_0 = input.LA(1);

        if ( (LA66_0==RULE_KW_OCURLY||LA66_0==96) ) {
            alt66=1;
        }
        switch (alt66) {
            case 1 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:462:3: ruleSig
                {
                pushFollow(FOLLOW_ruleSig_in_synpred1_InternalEditor1124);
                ruleSig();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:462:12: ( ( ruleToPart ) )
        // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:463:1: ( ruleToPart )
        {
        // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:463:1: ( ruleToPart )
        // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:464:1: ruleToPart
        {
        pushFollow(FOLLOW_ruleToPart_in_synpred1_InternalEditor1131);
        ruleToPart();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred1_InternalEditor

    // $ANTLR start synpred2_InternalEditor
    public final void synpred2_InternalEditor_fragment() throws RecognitionException {   
        // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:498:7: ( ( 'export' ( ruleSig )? ( ( ruleFromPart ) ) ) )
        // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:498:8: ( 'export' ( ruleSig )? ( ( ruleFromPart ) ) )
        {
        // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:498:8: ( 'export' ( ruleSig )? ( ( ruleFromPart ) ) )
        // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:498:10: 'export' ( ruleSig )? ( ( ruleFromPart ) )
        {
        match(input,82,FOLLOW_82_in_synpred2_InternalEditor1209); if (state.failed) return ;
        // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:499:1: ( ruleSig )?
        int alt67=2;
        int LA67_0 = input.LA(1);

        if ( (LA67_0==RULE_KW_OCURLY||LA67_0==96) ) {
            alt67=1;
        }
        switch (alt67) {
            case 1 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:499:3: ruleSig
                {
                pushFollow(FOLLOW_ruleSig_in_synpred2_InternalEditor1214);
                ruleSig();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:499:12: ( ( ruleFromPart ) )
        // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:500:1: ( ruleFromPart )
        {
        // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:500:1: ( ruleFromPart )
        // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:501:1: ruleFromPart
        {
        pushFollow(FOLLOW_ruleFromPart_in_synpred2_InternalEditor1221);
        ruleFromPart();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalEditor

    // $ANTLR start synpred3_InternalEditor
    public final void synpred3_InternalEditor_fragment() throws RecognitionException {   
        // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:906:2: ( ( 'where' ( ( ruleCommaItem ) ) ) )
        // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:906:3: ( 'where' ( ( ruleCommaItem ) ) )
        {
        // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:906:3: ( 'where' ( ( ruleCommaItem ) ) )
        // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:906:5: 'where' ( ( ruleCommaItem ) )
        {
        match(input,85,FOLLOW_85_in_synpred3_InternalEditor2276); if (state.failed) return ;
        // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:907:1: ( ( ruleCommaItem ) )
        // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:908:1: ( ruleCommaItem )
        {
        // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:908:1: ( ruleCommaItem )
        // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:909:1: ruleCommaItem
        {
        pushFollow(FOLLOW_ruleCommaItem_in_synpred3_InternalEditor2283);
        ruleCommaItem();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred3_InternalEditor

    // $ANTLR start synpred4_InternalEditor
    public final void synpred4_InternalEditor_fragment() throws RecognitionException {   
        // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2713:7: ( ( ( ( ruleMolecule ) ) RULE_KW_DOLLAR ruleOpQualTail ) )
        // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2713:8: ( ( ( ruleMolecule ) ) RULE_KW_DOLLAR ruleOpQualTail )
        {
        // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2713:8: ( ( ( ruleMolecule ) ) RULE_KW_DOLLAR ruleOpQualTail )
        // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2713:9: ( ( ruleMolecule ) ) RULE_KW_DOLLAR ruleOpQualTail
        {
        // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2713:9: ( ( ruleMolecule ) )
        // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2714:1: ( ruleMolecule )
        {
        // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2714:1: ( ruleMolecule )
        // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:2715:1: ruleMolecule
        {
        pushFollow(FOLLOW_ruleMolecule_in_synpred4_InternalEditor6575);
        ruleMolecule();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,RULE_KW_DOLLAR,FOLLOW_RULE_KW_DOLLAR_in_synpred4_InternalEditor6581); if (state.failed) return ;
        pushFollow(FOLLOW_ruleOpQualTail_in_synpred4_InternalEditor6583);
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
    protected DFA21 dfa21 = new DFA21(this);
    protected DFA28 dfa28 = new DFA28(this);
    protected DFA52 dfa52 = new DFA52(this);
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
            return "231:1: ( (otherlv_0= 'macro' this_MacroBody_1= ruleMacroBody ) | (otherlv_2= 'extend' this_Sig_3= ruleSig ) | (otherlv_4= 'local' this_Sig_5= ruleSig ) | (otherlv_6= 'free' this_Sig_7= ruleSig ) | (otherlv_8= 'fluid' this_Sig_9= ruleSig ) | (otherlv_10= 'default' this_Sig_11= ruleSig ) | (otherlv_12= 'define' this_Sig_13= ruleSig ) | (otherlv_14= 'fix' this_Sig_15= ruleSig ) | (otherlv_16= 'inline' (this_Sig_17= ruleSig )? ( (lv_fp_18_0= ruleFromPart ) )? ) | (otherlv_19= 'import' (this_Sig_20= ruleSig )? ( (lv_fp_21_0= ruleFromPart ) )? ) | this_ExportDecl_22= ruleExportDecl )";
        }
    }
    static final String DFA21_eotS =
        "\16\uffff";
    static final String DFA21_eofS =
        "\1\uffff\1\12\11\uffff\3\12";
    static final String DFA21_minS =
        "\1\140\1\5\1\140\2\141\6\uffff\3\5";
    static final String DFA21_maxS =
        "\1\140\1\132\1\140\2\141\6\uffff\3\132";
    static final String DFA21_acceptS =
        "\5\uffff\1\6\1\5\1\2\1\3\1\4\1\1\3\uffff";
    static final String DFA21_specialS =
        "\16\uffff}>";
    static final String[] DFA21_transitionS = {
            "\1\1",
            "\1\3\1\4\1\10\1\11\1\6\1\5\32\uffff\1\12\1\uffff\1\12\2\uffff"+
            "\1\2\6\uffff\1\12\1\uffff\1\12\37\uffff\2\12\1\uffff\1\7\3\uffff"+
            "\1\12",
            "\1\13",
            "\1\14",
            "\1\15",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\3\1\4\1\10\1\11\1\6\1\5\32\uffff\1\12\1\uffff\1\12\2\uffff"+
            "\1\2\6\uffff\1\12\1\uffff\1\12\37\uffff\2\12\1\uffff\1\7\3\uffff"+
            "\1\12",
            "\1\3\1\4\1\10\1\11\1\6\1\5\32\uffff\1\12\1\uffff\1\12\11\uffff"+
            "\1\12\1\uffff\1\12\37\uffff\2\12\1\uffff\1\7\3\uffff\1\12",
            "\1\3\1\4\1\10\1\11\1\6\1\5\32\uffff\1\12\1\uffff\1\12\11\uffff"+
            "\1\12\1\uffff\1\12\37\uffff\2\12\1\uffff\1\7\3\uffff\1\12"
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "1802:1: ( ruleInfixedExprsDecl | ( ruleInfixedExprsDecl otherlv_2= 'assign' this_Binding_AnyStatement_3= ruleBinding_AnyStatement ) | ( ruleInfixedExprsDecl this_KW_2EQ_5= RULE_KW_2EQ this_Binding_AnyStatement_6= ruleBinding_AnyStatement ) | ( ruleInfixedExprsDecl this_KW_MARROW_8= RULE_KW_MARROW this_Binding_AnyStatement_9= ruleBinding_AnyStatement ) | ( ruleInfixedExprsDecl this_KW_MAPSTO_11= RULE_KW_MAPSTO this_Binding_AnyStatement_12= ruleBinding_AnyStatement ) | ( ruleInfixedExprsDecl this_KW_MAPSTOSTAR_14= RULE_KW_MAPSTOSTAR this_Binding_AnyStatement_15= ruleBinding_AnyStatement ) )";
        }
    }
    static final String DFA28_eotS =
        "\13\uffff";
    static final String DFA28_eofS =
        "\13\uffff";
    static final String DFA28_minS =
        "\1\44\10\0\2\uffff";
    static final String DFA28_maxS =
        "\1\56\10\0\2\uffff";
    static final String DFA28_acceptS =
        "\11\uffff\1\1\1\2";
    static final String DFA28_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\2\uffff}>";
    static final String[] DFA28_transitionS = {
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

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "2694:1: ( ( (lv_name_0_0= ruleMolecule ) ) | ( ( ( ( ( ruleMolecule ) ) RULE_KW_DOLLAR ruleOpQualTail ) )=> ( ( (lv_name_1_0= ruleMolecule ) ) this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA28_1 = input.LA(1);

                         
                        int index28_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 9;}

                        else if ( (synpred4_InternalEditor()) ) {s = 10;}

                         
                        input.seek(index28_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA28_2 = input.LA(1);

                         
                        int index28_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 9;}

                        else if ( (synpred4_InternalEditor()) ) {s = 10;}

                         
                        input.seek(index28_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA28_3 = input.LA(1);

                         
                        int index28_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 9;}

                        else if ( (synpred4_InternalEditor()) ) {s = 10;}

                         
                        input.seek(index28_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA28_4 = input.LA(1);

                         
                        int index28_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 9;}

                        else if ( (synpred4_InternalEditor()) ) {s = 10;}

                         
                        input.seek(index28_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA28_5 = input.LA(1);

                         
                        int index28_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 9;}

                        else if ( (synpred4_InternalEditor()) ) {s = 10;}

                         
                        input.seek(index28_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA28_6 = input.LA(1);

                         
                        int index28_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 9;}

                        else if ( (synpred4_InternalEditor()) ) {s = 10;}

                         
                        input.seek(index28_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA28_7 = input.LA(1);

                         
                        int index28_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 9;}

                        else if ( (synpred4_InternalEditor()) ) {s = 10;}

                         
                        input.seek(index28_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA28_8 = input.LA(1);

                         
                        int index28_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 9;}

                        else if ( (synpred4_InternalEditor()) ) {s = 10;}

                         
                        input.seek(index28_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 28, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA52_eotS =
        "\17\uffff";
    static final String DFA52_eofS =
        "\1\uffff\14\16\2\uffff";
    static final String DFA52_minS =
        "\1\22\14\14\2\uffff";
    static final String DFA52_maxS =
        "\1\144\14\14\2\uffff";
    static final String DFA52_acceptS =
        "\15\uffff\1\2\1\1";
    static final String DFA52_specialS =
        "\17\uffff}>";
    static final String[] DFA52_transitionS = {
            "\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\107\uffff\1\12\1\13\1"+
            "\14",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "",
            ""
    };

    static final short[] DFA52_eot = DFA.unpackEncodedString(DFA52_eotS);
    static final short[] DFA52_eof = DFA.unpackEncodedString(DFA52_eofS);
    static final char[] DFA52_min = DFA.unpackEncodedStringToUnsignedChars(DFA52_minS);
    static final char[] DFA52_max = DFA.unpackEncodedStringToUnsignedChars(DFA52_maxS);
    static final short[] DFA52_accept = DFA.unpackEncodedString(DFA52_acceptS);
    static final short[] DFA52_special = DFA.unpackEncodedString(DFA52_specialS);
    static final short[][] DFA52_transition;

    static {
        int numStates = DFA52_transitionS.length;
        DFA52_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA52_transition[i] = DFA.unpackEncodedString(DFA52_transitionS[i]);
        }
    }

    class DFA52 extends DFA {

        public DFA52(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 52;
            this.eot = DFA52_eot;
            this.eof = DFA52_eof;
            this.min = DFA52_min;
            this.max = DFA52_max;
            this.accept = DFA52_accept;
            this.special = DFA52_special;
            this.transition = DFA52_transition;
        }
        public String getDescription() {
            return "4821:1: ( ruleRelationTok | ( ruleRelationTok this_KW_DOLLAR_2= RULE_KW_DOLLAR this_OpQualTail_3= ruleOpQualTail ) )";
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
    public static final BitSet FOLLOW_ruleComma_in_ruleLabeled324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleLabeled351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_AT_in_ruleLabeled368 = new BitSet(new long[]{0x00007A0000000000L});
    public static final BitSet FOLLOW_ruleAtom_in_ruleLabeled389 = new BitSet(new long[]{0x0000000000000012L,0x000000008087FF00L});
    public static final BitSet FOLLOW_ruleLabeled_in_ruleLabeled409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration457 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleDeclaration509 = new BitSet(new long[]{0x0004000000000000L,0x000000010007FF00L});
    public static final BitSet FOLLOW_ruleMacroBody_in_ruleDeclaration531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleDeclaration550 = new BitSet(new long[]{0x0004000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_ruleSig_in_ruleDeclaration572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleDeclaration591 = new BitSet(new long[]{0x0004000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_ruleSig_in_ruleDeclaration613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleDeclaration632 = new BitSet(new long[]{0x0004000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_ruleSig_in_ruleDeclaration654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleDeclaration673 = new BitSet(new long[]{0x0004000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_ruleSig_in_ruleDeclaration695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleDeclaration714 = new BitSet(new long[]{0x0004000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_ruleSig_in_ruleDeclaration736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleDeclaration755 = new BitSet(new long[]{0x0004000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_ruleSig_in_ruleDeclaration777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleDeclaration796 = new BitSet(new long[]{0x0004000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_ruleSig_in_ruleDeclaration818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleDeclaration837 = new BitSet(new long[]{0x0004000000000002L,0x0000000100100000L});
    public static final BitSet FOLLOW_ruleSig_in_ruleDeclaration860 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_ruleFromPart_in_ruleDeclaration882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleDeclaration903 = new BitSet(new long[]{0x0004000000000002L,0x0000000100100000L});
    public static final BitSet FOLLOW_ruleSig_in_ruleDeclaration926 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_ruleFromPart_in_ruleDeclaration948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExportDecl_in_ruleDeclaration978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExportDecl_in_entryRuleExportDecl1023 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExportDecl1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleExportDecl1075 = new BitSet(new long[]{0x0004000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_ruleSig_in_ruleExportDecl1098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleExportDecl1143 = new BitSet(new long[]{0x0004000000000000L,0x0000000100080000L});
    public static final BitSet FOLLOW_ruleSig_in_ruleExportDecl1166 = new BitSet(new long[]{0x0004000000000000L,0x0000000100080000L});
    public static final BitSet FOLLOW_ruleToPart_in_ruleExportDecl1188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleExportDecl1233 = new BitSet(new long[]{0x0004000000000000L,0x0000000100100000L});
    public static final BitSet FOLLOW_ruleSig_in_ruleExportDecl1256 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_ruleFromPart_in_ruleExportDecl1278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleToPart_in_entryRuleToPart1327 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleToPart1338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleToPart1380 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_ruleInfixed_in_ruleToPart1402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromPart_in_entryRuleFromPart1457 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFromPart1467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleFromPart1508 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_ruleenlist1_Infixed_Comma_AB_in_ruleFromPart1530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMacroBody_in_entryRuleMacroBody1575 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMacroBody1585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSig_in_ruleMacroBody1636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExportDecl_in_ruleMacroBody1663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleMacroBody1681 = new BitSet(new long[]{0x0004000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_ruleSig_in_ruleMacroBody1703 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_ruleFromPart_in_ruleMacroBody1723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSig_in_entryRuleSig1771 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSig1781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclBinding_in_ruleSig1832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleSig1859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclPart_in_entryRuleDeclPart1905 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclPart1916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_COLON_in_ruleDeclPart1961 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_ruleType_in_ruleDeclPart1988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_COLONSTAR_in_ruleDeclPart2016 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_ruleType_in_ruleDeclPart2043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComma_in_entryRuleComma2099 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComma2109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleenlist1_CommaItem_Comma_AB_in_ruleComma2159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommaItem_in_entryRuleCommaItem2203 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommaItem2213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinding_AnyStatement_in_ruleCommaItem2264 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_ruleCommaItem2295 = new BitSet(new long[]{0x0000000000000000L,0x0000000080800000L});
    public static final BitSet FOLLOW_ruleCommaItem_in_ruleCommaItem2316 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_ruleDeclBinding_in_entryRuleDeclBinding2365 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclBinding2375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindingR_InfixedExprsDecl_AnyStatement_in_ruleDeclBinding2425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInfixedExprsDecl_in_entryRuleInfixedExprsDecl2470 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInfixedExprsDecl2481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInfixedExprs_in_ruleInfixedExprsDecl2532 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_ruleDeclPart_in_ruleInfixedExprsDecl2560 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_ruleInfixedExprs_in_entryRuleInfixedExprs2618 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInfixedExprs2629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleenlist1_InfixedExpr_Comma_AB_in_ruleInfixedExprs2679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinding_AnyStatement_in_entryRuleBinding_AnyStatement2733 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinding_AnyStatement2743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindingL_Infixed_AnyStatement_in_ruleBinding_AnyStatement2793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinding_BalStatement_in_entryRuleBinding_BalStatement2837 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinding_BalStatement2847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindingL_Infixed_BalStatement_in_ruleBinding_BalStatement2897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinding_Collection_in_entryRuleBinding_Collection2941 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinding_Collection2951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindingL_Infixed_Collection_in_ruleBinding_Collection3001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindingL_Infixed_AnyStatement_in_entryRuleBindingL_Infixed_AnyStatement3045 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBindingL_Infixed_AnyStatement3055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnyStatement_in_ruleBindingL_Infixed_AnyStatement3100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInfixed_in_ruleBindingL_Infixed_AnyStatement3122 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_ruleBindingL_Infixed_AnyStatement3133 = new BitSet(new long[]{0x0000000000000000L,0x0000000080800000L});
    public static final BitSet FOLLOW_ruleBindingL_Infixed_AnyStatement_in_ruleBindingL_Infixed_AnyStatement3154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInfixed_in_ruleBindingL_Infixed_AnyStatement3178 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_KW_2EQ_in_ruleBindingL_Infixed_AnyStatement3188 = new BitSet(new long[]{0x0000000000000000L,0x0000000080800000L});
    public static final BitSet FOLLOW_ruleBindingL_Infixed_AnyStatement_in_ruleBindingL_Infixed_AnyStatement3208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInfixed_in_ruleBindingL_Infixed_AnyStatement3232 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_KW_MARROW_in_ruleBindingL_Infixed_AnyStatement3242 = new BitSet(new long[]{0x0000000000000000L,0x0000000080800000L});
    public static final BitSet FOLLOW_ruleBindingL_Infixed_AnyStatement_in_ruleBindingL_Infixed_AnyStatement3262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInfixed_in_ruleBindingL_Infixed_AnyStatement3286 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_KW_MAPSTO_in_ruleBindingL_Infixed_AnyStatement3296 = new BitSet(new long[]{0x0000000000000000L,0x0000000080800000L});
    public static final BitSet FOLLOW_ruleBindingL_Infixed_AnyStatement_in_ruleBindingL_Infixed_AnyStatement3316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInfixed_in_ruleBindingL_Infixed_AnyStatement3340 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_KW_MAPSTOSTAR_in_ruleBindingL_Infixed_AnyStatement3350 = new BitSet(new long[]{0x0000000000000000L,0x0000000080800000L});
    public static final BitSet FOLLOW_ruleBindingL_Infixed_AnyStatement_in_ruleBindingL_Infixed_AnyStatement3370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindingL_Infixed_BalStatement_in_entryRuleBindingL_Infixed_BalStatement3417 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBindingL_Infixed_BalStatement3427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBalStatement_in_ruleBindingL_Infixed_BalStatement3472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInfixed_in_ruleBindingL_Infixed_BalStatement3494 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_ruleBindingL_Infixed_BalStatement3505 = new BitSet(new long[]{0x0000000000000000L,0x0000000081000000L});
    public static final BitSet FOLLOW_ruleBindingL_Infixed_BalStatement_in_ruleBindingL_Infixed_BalStatement3526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInfixed_in_ruleBindingL_Infixed_BalStatement3550 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_KW_2EQ_in_ruleBindingL_Infixed_BalStatement3560 = new BitSet(new long[]{0x0000000000000000L,0x0000000081000000L});
    public static final BitSet FOLLOW_ruleBindingL_Infixed_BalStatement_in_ruleBindingL_Infixed_BalStatement3580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInfixed_in_ruleBindingL_Infixed_BalStatement3604 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_KW_MARROW_in_ruleBindingL_Infixed_BalStatement3614 = new BitSet(new long[]{0x0000000000000000L,0x0000000081000000L});
    public static final BitSet FOLLOW_ruleBindingL_Infixed_BalStatement_in_ruleBindingL_Infixed_BalStatement3634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInfixed_in_ruleBindingL_Infixed_BalStatement3658 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_KW_MAPSTO_in_ruleBindingL_Infixed_BalStatement3668 = new BitSet(new long[]{0x0000000000000000L,0x0000000081000000L});
    public static final BitSet FOLLOW_ruleBindingL_Infixed_BalStatement_in_ruleBindingL_Infixed_BalStatement3688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInfixed_in_ruleBindingL_Infixed_BalStatement3712 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_KW_MAPSTOSTAR_in_ruleBindingL_Infixed_BalStatement3722 = new BitSet(new long[]{0x0000000000000000L,0x0000000081000000L});
    public static final BitSet FOLLOW_ruleBindingL_Infixed_BalStatement_in_ruleBindingL_Infixed_BalStatement3742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindingL_Infixed_Collection_in_entryRuleBindingL_Infixed_Collection3789 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBindingL_Infixed_Collection3799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollection_in_ruleBindingL_Infixed_Collection3850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInfixed_in_ruleBindingL_Infixed_Collection3872 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_ruleBindingL_Infixed_Collection3883 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_ruleBindingL_Infixed_Collection_in_ruleBindingL_Infixed_Collection3904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInfixed_in_ruleBindingL_Infixed_Collection3928 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_KW_2EQ_in_ruleBindingL_Infixed_Collection3938 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_ruleBindingL_Infixed_Collection_in_ruleBindingL_Infixed_Collection3958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInfixed_in_ruleBindingL_Infixed_Collection3982 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_KW_MARROW_in_ruleBindingL_Infixed_Collection3992 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_ruleBindingL_Infixed_Collection_in_ruleBindingL_Infixed_Collection4012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInfixed_in_ruleBindingL_Infixed_Collection4036 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_KW_MAPSTO_in_ruleBindingL_Infixed_Collection4046 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_ruleBindingL_Infixed_Collection_in_ruleBindingL_Infixed_Collection4066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInfixed_in_ruleBindingL_Infixed_Collection4090 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_KW_MAPSTOSTAR_in_ruleBindingL_Infixed_Collection4100 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_ruleBindingL_Infixed_Collection_in_ruleBindingL_Infixed_Collection4120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindingR_InfixedExprsDecl_AnyStatement_in_entryRuleBindingR_InfixedExprsDecl_AnyStatement4167 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBindingR_InfixedExprsDecl_AnyStatement4177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInfixedExprsDecl_in_ruleBindingR_InfixedExprsDecl_AnyStatement4222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInfixedExprsDecl_in_ruleBindingR_InfixedExprsDecl_AnyStatement4244 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_ruleBindingR_InfixedExprsDecl_AnyStatement4255 = new BitSet(new long[]{0x0000000000000000L,0x0000000080800000L});
    public static final BitSet FOLLOW_ruleBinding_AnyStatement_in_ruleBindingR_InfixedExprsDecl_AnyStatement4277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInfixedExprsDecl_in_ruleBindingR_InfixedExprsDecl_AnyStatement4300 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_KW_2EQ_in_ruleBindingR_InfixedExprsDecl_AnyStatement4310 = new BitSet(new long[]{0x0000000000000000L,0x0000000080800000L});
    public static final BitSet FOLLOW_ruleBinding_AnyStatement_in_ruleBindingR_InfixedExprsDecl_AnyStatement4331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInfixedExprsDecl_in_ruleBindingR_InfixedExprsDecl_AnyStatement4354 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_KW_MARROW_in_ruleBindingR_InfixedExprsDecl_AnyStatement4364 = new BitSet(new long[]{0x0000000000000000L,0x0000000080800000L});
    public static final BitSet FOLLOW_ruleBinding_AnyStatement_in_ruleBindingR_InfixedExprsDecl_AnyStatement4385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInfixedExprsDecl_in_ruleBindingR_InfixedExprsDecl_AnyStatement4408 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_KW_MAPSTO_in_ruleBindingR_InfixedExprsDecl_AnyStatement4418 = new BitSet(new long[]{0x0000000000000000L,0x0000000080800000L});
    public static final BitSet FOLLOW_ruleBinding_AnyStatement_in_ruleBindingR_InfixedExprsDecl_AnyStatement4439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInfixedExprsDecl_in_ruleBindingR_InfixedExprsDecl_AnyStatement4462 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_KW_MAPSTOSTAR_in_ruleBindingR_InfixedExprsDecl_AnyStatement4472 = new BitSet(new long[]{0x0000000000000000L,0x0000000080800000L});
    public static final BitSet FOLLOW_ruleBinding_AnyStatement_in_ruleBindingR_InfixedExprsDecl_AnyStatement4493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnyStatement_in_entryRuleAnyStatement4540 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnyStatement4551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleAnyStatement4592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBalStatement_in_entryRuleBalStatement4642 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBalStatement4653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleBalStatement4694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenBound_in_entryRuleGenBound4747 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGenBound4757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleGenBound4798 = new BitSet(new long[]{0x0000000000000000L,0x0000000080800000L});
    public static final BitSet FOLLOW_ruleCommaItem_in_ruleGenBound4820 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_ruleGenBound4831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButExpr_in_entryRuleButExpr4878 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleButExpr4888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclBinding_in_ruleButExpr4938 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_ruleButExpr4950 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_ruleCases_in_ruleButExpr4971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCases_in_entryRuleCases5018 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCases5028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinding_Collection_in_ruleCases5078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlwaysPart_AnyStatement_in_entryRuleAlwaysPart_AnyStatement5122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlwaysPart_AnyStatement5132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleAlwaysPart_AnyStatement5174 = new BitSet(new long[]{0x0000000000000000L,0x0000000080800000L});
    public static final BitSet FOLLOW_ruleBinding_AnyStatement_in_ruleAlwaysPart_AnyStatement5196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleAlwaysPart_AnyStatement5215 = new BitSet(new long[]{0x0000000000000000L,0x0000000080800000L});
    public static final BitSet FOLLOW_ruleBinding_AnyStatement_in_ruleAlwaysPart_AnyStatement5237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlwaysPart_BalStatement_in_entryRuleAlwaysPart_BalStatement5284 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlwaysPart_BalStatement5294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleAlwaysPart_BalStatement5336 = new BitSet(new long[]{0x0000000000000000L,0x0000000081000000L});
    public static final BitSet FOLLOW_ruleBinding_BalStatement_in_ruleAlwaysPart_BalStatement5358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleAlwaysPart_BalStatement5377 = new BitSet(new long[]{0x0000000000000000L,0x0000000081000000L});
    public static final BitSet FOLLOW_ruleBinding_BalStatement_in_ruleAlwaysPart_BalStatement5399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollection_in_entryRuleCollection5446 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollection5456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInfixed_in_ruleCollection5501 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});
    public static final BitSet FOLLOW_ruleIterators_in_ruleCollection5521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIterators_in_entryRuleIterators5569 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIterators5580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIterators1_in_ruleIterators5630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIterators1_in_entryRuleIterators15685 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIterators15696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleIterators15737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForLhs_in_entryRuleForLhs5783 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForLhs5794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInfixed_in_ruleForLhs5841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleForLhs5866 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_ruleInfixed_in_ruleForLhs5888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleForLhs5914 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_ruleInfixed_in_ruleForLhs5936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleForLhs5962 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_ruleInfixed_in_ruleForLhs5984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSuchthatPart_in_entryRuleSuchthatPart6037 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSuchthatPart6048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleSuchthatPart6090 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_KW_BAR_in_ruleSuchthatPart6105 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_ruleInfixed_in_ruleSuchthatPart6132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInfixed_in_entryRuleInfixed6188 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInfixed6199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleInfixed6240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInfixedExpr_in_entryRuleInfixedExpr6290 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInfixedExpr6301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleInfixedExpr6342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType6392 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType6403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleType6444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpQualTail_in_entryRuleOpQualTail6493 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpQualTail6503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMolecule_in_ruleOpQualTail6553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMolecule_in_ruleOpQualTail6600 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_KW_DOLLAR_in_ruleOpQualTail6611 = new BitSet(new long[]{0x00007B5000000000L});
    public static final BitSet FOLLOW_ruleOpQualTail_in_ruleOpQualTail6632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNakedOp_in_entryRuleNakedOp6685 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNakedOp6695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnqualOp_ArrowTok_in_ruleNakedOp6746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnqualOp_LatticeTok_in_ruleNakedOp6773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnqualOp_RelationTok_in_ruleNakedOp6800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnqualOp_SegTok_in_ruleNakedOp6827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnqualOp_PlusTok_in_ruleNakedOp6854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnqualOp_QuotientTok_in_ruleNakedOp6881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnqualOp_TimesTok_in_ruleNakedOp6908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnqualOp_PowerTok_in_ruleNakedOp6935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrowOp_in_entryRuleArrowOp6974 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrowOp6984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualOp_ArrowTok_in_ruleArrowOp7030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLatticeOp_in_entryRuleLatticeOp7064 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLatticeOp7074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualOp_LatticeTok_in_ruleLatticeOp7120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationOp_in_entryRuleRelationOp7154 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationOp7164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualOp_RelationTok_in_ruleRelationOp7210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSegOp_in_entryRuleSegOp7244 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSegOp7254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualOp_SegTok_in_ruleSegOp7300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOp_in_entryRulePlusOp7334 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlusOp7344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualOp_PlusTok_in_rulePlusOp7390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuotientOp_in_entryRuleQuotientOp7424 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuotientOp7434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualOp_QuotientTok_in_ruleQuotientOp7480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimesOp_in_entryRuleTimesOp7514 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimesOp7524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualOp_TimesTok_in_ruleTimesOp7570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePowerOp_in_entryRulePowerOp7604 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePowerOp7614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualOp_PowerTok_in_rulePowerOp7660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrowTok_in_entryRuleArrowTok7695 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrowTok7706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_RARROW_in_ruleArrowTok7746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_LARROW_in_ruleArrowTok7772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_MAPSTAR_in_ruleArrowTok7798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLatticeTok_in_entryRuleLatticeTok7844 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLatticeTok7855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_VEE_in_ruleLatticeTok7895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_WEDGE_in_ruleLatticeTok7921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationTok_in_entryRuleRelationTok7967 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationTok7978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_EQ_in_ruleRelationTok8018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_TILDEE_in_ruleRelationTok8044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_HATE_in_ruleRelationTok8070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_GE_in_ruleRelationTok8096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_GT_in_ruleRelationTok8122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_2GT_in_ruleRelationTok8148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_LE_in_ruleRelationTok8174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_LT_in_ruleRelationTok8200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_2LT_in_ruleRelationTok8226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_ruleRelationTok8250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_ruleRelationTok8269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_ruleRelationTok8288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSegTok_in_entryRuleSegTok8329 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSegTok8340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_2DOT_in_ruleSegTok8380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_ruleSegTok8404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusTok_in_entryRulePlusTok8445 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlusTok8456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_PLUS_in_rulePlusTok8496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_MINUS_in_rulePlusTok8522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_PLUSMINUS_in_rulePlusTok8548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuotientTok_in_entryRuleQuotientTok8594 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuotientTok8605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_ruleQuotientTok8643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_ruleQuotientTok8662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_ruleQuotientTok8681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_ruleQuotientTok8700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimesTok_in_entryRuleTimesTok8741 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimesTok8752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_STAR_in_ruleTimesTok8792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_SLASH_in_ruleTimesTok8818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_BACKSLASH_in_ruleTimesTok8844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePowerTok_in_entryRulePowerTok8890 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePowerTok8901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_2STAR_in_rulePowerTok8941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_HAT_in_rulePowerTok8967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplication_in_entryRuleApplication9019 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplication9030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_ruleApplication9071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMolecule_in_entryRuleMolecule9132 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMolecule9142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtom_in_ruleMolecule9193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnclosure_in_ruleMolecule9220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnclosure_in_entryRuleEnclosure9265 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnclosure9275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParened_in_ruleEnclosure9326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBracketed_in_ruleEnclosure9353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuotedIds_in_ruleEnclosure9380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockMolecule_in_entryRuleBlockMolecule9427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlockMolecule9437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtom_in_ruleBlockMolecule9488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnclosure_in_ruleBlockMolecule9515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleBlockMolecule9542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockEnclosure_in_entryRuleBlockEnclosure9587 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlockEnclosure9597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnclosure_in_ruleBlockEnclosure9648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleBlockEnclosure9675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_entryRuleBlock9720 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlock9730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCurly_Labeled_in_ruleBlock9780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParened_in_entryRuleParened9824 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParened9834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_OPAREN_in_ruleParened9875 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_RULE_KW_CPAREN_in_ruleParened9885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_OPAREN_in_ruleParened9903 = new BitSet(new long[]{0x0000000000000010L,0x000000008087FF00L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleParened9924 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_RULE_KW_CPAREN_in_ruleParened9934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBracketed_in_entryRuleBracketed9980 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBracketed9990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_OBRACK_in_ruleBracketed10031 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_RULE_KW_CBRACK_in_ruleBracketed10041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_OBRACK_in_ruleBracketed10059 = new BitSet(new long[]{0x0000000000000010L,0x000000008087FF00L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBracketed10080 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_RULE_KW_CBRACK_in_ruleBracketed10090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuotedIds_in_entryRuleQuotedIds10136 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuotedIds10146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_QUOTE_in_ruleQuotedIds10187 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_RULE_KW_QUOTE_in_ruleQuotedIds10197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_QUOTE_in_ruleQuotedIds10215 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ruleNames_in_ruleQuotedIds10236 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_RULE_KW_QUOTE_in_ruleQuotedIds10246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNames_in_entryRuleNames10292 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNames10302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TK_ID_in_ruleNames10348 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_RULE_KW_COMMA_in_ruleNames10365 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_RULE_TK_ID_in_ruleNames10381 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_ruleAtom_in_entryRuleAtom10434 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtom10444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleId_in_ruleAtom10494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleAtom10521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_entryRuleName10567 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleName10577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleId_in_ruleName10628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNakedOp_in_ruleName10655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleId_in_entryRuleId10700 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleId10710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TK_ID_in_ruleId10756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_SHARP_in_ruleId10784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_TILDE_in_ruleId10812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral10864 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral10875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TK_INT_in_ruleLiteral10919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TK_STRING_in_ruleLiteral10945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnqualOp_ArrowTok_in_entryRuleUnqualOp_ArrowTok11000 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnqualOp_ArrowTok11010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrowTok_in_ruleUnqualOp_ArrowTok11055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnqualOp_LatticeTok_in_entryRuleUnqualOp_LatticeTok11109 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnqualOp_LatticeTok11119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLatticeTok_in_ruleUnqualOp_LatticeTok11164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnqualOp_RelationTok_in_entryRuleUnqualOp_RelationTok11218 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnqualOp_RelationTok11228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationTok_in_ruleUnqualOp_RelationTok11273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnqualOp_SegTok_in_entryRuleUnqualOp_SegTok11327 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnqualOp_SegTok11337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSegTok_in_ruleUnqualOp_SegTok11382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnqualOp_PlusTok_in_entryRuleUnqualOp_PlusTok11436 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnqualOp_PlusTok11446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusTok_in_ruleUnqualOp_PlusTok11491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnqualOp_QuotientTok_in_entryRuleUnqualOp_QuotientTok11545 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnqualOp_QuotientTok11555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuotientTok_in_ruleUnqualOp_QuotientTok11600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnqualOp_TimesTok_in_entryRuleUnqualOp_TimesTok11654 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnqualOp_TimesTok11664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimesTok_in_ruleUnqualOp_TimesTok11709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnqualOp_PowerTok_in_entryRuleUnqualOp_PowerTok11763 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnqualOp_PowerTok11773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePowerTok_in_ruleUnqualOp_PowerTok11818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualOp_ArrowTok_in_entryRuleQualOp_ArrowTok11872 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualOp_ArrowTok11882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrowTok_in_ruleQualOp_ArrowTok11927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrowTok_in_ruleQualOp_ArrowTok11949 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_KW_DOLLAR_in_ruleQualOp_ArrowTok11959 = new BitSet(new long[]{0x00007B5000000000L});
    public static final BitSet FOLLOW_ruleOpQualTail_in_ruleQualOp_ArrowTok11980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualOp_LatticeTok_in_entryRuleQualOp_LatticeTok12026 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualOp_LatticeTok12036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLatticeTok_in_ruleQualOp_LatticeTok12081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLatticeTok_in_ruleQualOp_LatticeTok12103 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_KW_DOLLAR_in_ruleQualOp_LatticeTok12113 = new BitSet(new long[]{0x00007B5000000000L});
    public static final BitSet FOLLOW_ruleOpQualTail_in_ruleQualOp_LatticeTok12134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualOp_RelationTok_in_entryRuleQualOp_RelationTok12180 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualOp_RelationTok12190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationTok_in_ruleQualOp_RelationTok12235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationTok_in_ruleQualOp_RelationTok12257 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_KW_DOLLAR_in_ruleQualOp_RelationTok12267 = new BitSet(new long[]{0x00007B5000000000L});
    public static final BitSet FOLLOW_ruleOpQualTail_in_ruleQualOp_RelationTok12288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualOp_SegTok_in_entryRuleQualOp_SegTok12334 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualOp_SegTok12344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSegTok_in_ruleQualOp_SegTok12389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSegTok_in_ruleQualOp_SegTok12411 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_KW_DOLLAR_in_ruleQualOp_SegTok12421 = new BitSet(new long[]{0x00007B5000000000L});
    public static final BitSet FOLLOW_ruleOpQualTail_in_ruleQualOp_SegTok12442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualOp_PlusTok_in_entryRuleQualOp_PlusTok12488 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualOp_PlusTok12498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusTok_in_ruleQualOp_PlusTok12543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusTok_in_ruleQualOp_PlusTok12565 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_KW_DOLLAR_in_ruleQualOp_PlusTok12575 = new BitSet(new long[]{0x00007B5000000000L});
    public static final BitSet FOLLOW_ruleOpQualTail_in_ruleQualOp_PlusTok12596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualOp_QuotientTok_in_entryRuleQualOp_QuotientTok12642 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualOp_QuotientTok12652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuotientTok_in_ruleQualOp_QuotientTok12697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuotientTok_in_ruleQualOp_QuotientTok12719 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_KW_DOLLAR_in_ruleQualOp_QuotientTok12729 = new BitSet(new long[]{0x00007B5000000000L});
    public static final BitSet FOLLOW_ruleOpQualTail_in_ruleQualOp_QuotientTok12750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualOp_TimesTok_in_entryRuleQualOp_TimesTok12796 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualOp_TimesTok12806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimesTok_in_ruleQualOp_TimesTok12851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimesTok_in_ruleQualOp_TimesTok12873 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_KW_DOLLAR_in_ruleQualOp_TimesTok12883 = new BitSet(new long[]{0x00007B5000000000L});
    public static final BitSet FOLLOW_ruleOpQualTail_in_ruleQualOp_TimesTok12904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualOp_PowerTok_in_entryRuleQualOp_PowerTok12950 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualOp_PowerTok12960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePowerTok_in_ruleQualOp_PowerTok13005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePowerTok_in_ruleQualOp_PowerTok13027 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_KW_DOLLAR_in_ruleQualOp_PowerTok13037 = new BitSet(new long[]{0x00007B5000000000L});
    public static final BitSet FOLLOW_ruleOpQualTail_in_ruleQualOp_PowerTok13058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreDocumentList_in_entryRulePreDocumentList13109 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePreDocumentList13120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TK_PREDOC_in_rulePreDocumentList13164 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rulePreDocumentList_in_rulePreDocumentList13191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePostDocumentList_in_entryRulePostDocumentList13248 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePostDocumentList13259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TK_POSTDOC_in_rulePostDocumentList13303 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rulePostDocumentList_in_rulePostDocumentList13330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleenlist1_CommaItem_Comma_AB_in_entryRuleenlist1_CommaItem_Comma_AB13386 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleenlist1_CommaItem_Comma_AB13396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleenlister1_CommaItem_Comma_in_ruleenlist1_CommaItem_Comma_AB13446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleenlist1_Infixed_Comma_AB_in_entryRuleenlist1_Infixed_Comma_AB13490 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleenlist1_Infixed_Comma_AB13500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleenlister1_Infixed_Comma_in_ruleenlist1_Infixed_Comma_AB13550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleenlist1_InfixedExpr_Comma_AB_in_entryRuleenlist1_InfixedExpr_Comma_AB13595 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleenlist1_InfixedExpr_Comma_AB13606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleenlister1_InfixedExpr_Comma_in_ruleenlist1_InfixedExpr_Comma_AB13656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleenlister1_CommaItem_Comma_in_entryRuleenlister1_CommaItem_Comma13710 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleenlister1_CommaItem_Comma13720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommaItem_in_ruleenlister1_CommaItem_Comma13771 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_RULE_KW_COMMA_in_ruleenlister1_CommaItem_Comma13782 = new BitSet(new long[]{0x0000000000000000L,0x0000000080800000L});
    public static final BitSet FOLLOW_ruleCommaItem_in_ruleenlister1_CommaItem_Comma13802 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_ruleenlister1_Infixed_Comma_in_entryRuleenlister1_Infixed_Comma13850 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleenlister1_Infixed_Comma13860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInfixed_in_ruleenlister1_Infixed_Comma13905 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_RULE_KW_COMMA_in_ruleenlister1_Infixed_Comma13916 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_ruleInfixed_in_ruleenlister1_Infixed_Comma13936 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_ruleenlister1_InfixedExpr_Comma_in_entryRuleenlister1_InfixedExpr_Comma13985 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleenlister1_InfixedExpr_Comma13996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInfixedExpr_in_ruleenlister1_InfixedExpr_Comma14047 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_RULE_KW_COMMA_in_ruleenlister1_InfixedExpr_Comma14068 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_ruleInfixedExpr_in_ruleenlister1_InfixedExpr_Comma14095 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_ruleenlist1a_Labeled_Semicolon_AB_in_entryRuleenlist1a_Labeled_Semicolon_AB14152 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleenlist1a_Labeled_Semicolon_AB14162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleenlister1a_Labeled_Semicolon_in_ruleenlist1a_Labeled_Semicolon_AB14212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleenlister1a_Labeled_Semicolon_in_entryRuleenlister1a_Labeled_Semicolon14256 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleenlister1a_Labeled_Semicolon14266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabeled_in_ruleenlister1a_Labeled_Semicolon14316 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_RULE_KW_SEMICOLON_in_ruleenlister1a_Labeled_Semicolon14328 = new BitSet(new long[]{0x0000000000000010L,0x000000008087FF00L});
    public static final BitSet FOLLOW_ruleLabeled_in_ruleenlister1a_Labeled_Semicolon14348 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_RULE_KW_SEMICOLON_in_ruleenlister1a_Labeled_Semicolon14361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCurly_Labeled_in_entryRuleCurly_Labeled14402 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCurly_Labeled14412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_OCURLY_in_ruleCurly_Labeled14448 = new BitSet(new long[]{0x0000000000000010L,0x000000008087FF00L});
    public static final BitSet FOLLOW_ruleCurlyContents_Labeled_in_ruleCurly_Labeled14469 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_RULE_KW_CCURLY_in_ruleCurly_Labeled14479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCurlyContents_Labeled_in_entryRuleCurlyContents_Labeled14520 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCurlyContents_Labeled14530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCurlyContentsList_Labeled_in_ruleCurlyContents_Labeled14580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCurlyContentsList_Labeled_in_entryRuleCurlyContentsList_Labeled14624 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCurlyContentsList_Labeled14634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabeled_in_ruleCurlyContentsList_Labeled14684 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_RULE_KW_SEMICOLON_in_ruleCurlyContentsList_Labeled14696 = new BitSet(new long[]{0x0000000000000010L,0x000000008087FF00L});
    public static final BitSet FOLLOW_ruleLabeled_in_ruleCurlyContentsList_Labeled14716 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_RULE_KW_SEMICOLON_in_ruleCurlyContentsList_Labeled14730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_synpred1_InternalEditor1119 = new BitSet(new long[]{0x0004000000000000L,0x0000000100080000L});
    public static final BitSet FOLLOW_ruleSig_in_synpred1_InternalEditor1124 = new BitSet(new long[]{0x0004000000000000L,0x0000000100080000L});
    public static final BitSet FOLLOW_ruleToPart_in_synpred1_InternalEditor1131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_synpred2_InternalEditor1209 = new BitSet(new long[]{0x0004000000000000L,0x0000000100100000L});
    public static final BitSet FOLLOW_ruleSig_in_synpred2_InternalEditor1214 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_ruleFromPart_in_synpred2_InternalEditor1221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_synpred3_InternalEditor2276 = new BitSet(new long[]{0x0000000000000000L,0x0000000080800000L});
    public static final BitSet FOLLOW_ruleCommaItem_in_synpred3_InternalEditor2283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMolecule_in_synpred4_InternalEditor6575 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_KW_DOLLAR_in_synpred4_InternalEditor6581 = new BitSet(new long[]{0x00007B5000000000L});
    public static final BitSet FOLLOW_ruleOpQualTail_in_synpred4_InternalEditor6583 = new BitSet(new long[]{0x0000000000000002L});

}