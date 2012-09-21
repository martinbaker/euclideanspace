package com.euclideanspace.euclid.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.euclideanspace.euclid.services.EditorGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalEditorParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_HEX", "RULE_INT", "RULE_DECIMAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'import'", "'.*'", "'class'", "'extends'", "'{'", "'}'", "'var'", "':'", "'='", "'val'", "'ref'", "'def'", "'+='", "'||'", "'&&'", "'=='", "'!='", "'instanceof'", "'>='", "'<='", "'>'", "'<'", "'->'", "'..'", "'=>'", "'<>'", "'?:'", "'<=>'", "'+'", "'-'", "'*'", "'**'", "'/'", "'%'", "'!'", "'as'", "'.'", "'?.'", "'*.'", "','", "'('", "')'", "'['", "'|'", "']'", "';'", "'if'", "'else'", "'switch'", "'default'", "'case'", "'for'", "'while'", "'do'", "'super'", "'::'", "'new'", "'false'", "'true'", "'null'", "'typeof'", "'throw'", "'return'", "'try'", "'finally'", "'catch'", "'?'", "'&'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=4;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int RULE_HEX=6;
    public static final int T__58=58;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=7;
    public static final int RULE_DECIMAL=8;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__80=80;
    public static final int T__46=46;
    public static final int T__81=81;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=10;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__72=72;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=11;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;

    // delegates
    // delegators


        public InternalEditorParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEditorParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEditorParser.tokenNames; }
    public String getGrammarFileName() { return "../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g"; }



     	private EditorGrammarAccess grammarAccess;
     	
        public InternalEditorParser(TokenStream input, EditorGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Domainmodel";	
       	}
       	
       	@Override
       	protected EditorGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleDomainmodel"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:67:1: entryRuleDomainmodel returns [EObject current=null] : iv_ruleDomainmodel= ruleDomainmodel EOF ;
    public final EObject entryRuleDomainmodel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainmodel = null;


        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:68:2: (iv_ruleDomainmodel= ruleDomainmodel EOF )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:69:2: iv_ruleDomainmodel= ruleDomainmodel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDomainmodelRule()); 
            }
            pushFollow(FOLLOW_ruleDomainmodel_in_entryRuleDomainmodel75);
            iv_ruleDomainmodel=ruleDomainmodel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDomainmodel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainmodel85); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDomainmodel"


    // $ANTLR start "ruleDomainmodel"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:76:1: ruleDomainmodel returns [EObject current=null] : ( ( (lv_packages_0_0= rulePackageDeclaration ) )* ( (lv_imports_1_0= ruleImport ) )* ( (lv_classes_2_0= ruleClass ) )* ) ;
    public final EObject ruleDomainmodel() throws RecognitionException {
        EObject current = null;

        EObject lv_packages_0_0 = null;

        EObject lv_imports_1_0 = null;

        EObject lv_classes_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:79:28: ( ( ( (lv_packages_0_0= rulePackageDeclaration ) )* ( (lv_imports_1_0= ruleImport ) )* ( (lv_classes_2_0= ruleClass ) )* ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:80:1: ( ( (lv_packages_0_0= rulePackageDeclaration ) )* ( (lv_imports_1_0= ruleImport ) )* ( (lv_classes_2_0= ruleClass ) )* )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:80:1: ( ( (lv_packages_0_0= rulePackageDeclaration ) )* ( (lv_imports_1_0= ruleImport ) )* ( (lv_classes_2_0= ruleClass ) )* )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:80:2: ( (lv_packages_0_0= rulePackageDeclaration ) )* ( (lv_imports_1_0= ruleImport ) )* ( (lv_classes_2_0= ruleClass ) )*
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:80:2: ( (lv_packages_0_0= rulePackageDeclaration ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:81:1: (lv_packages_0_0= rulePackageDeclaration )
            	    {
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:81:1: (lv_packages_0_0= rulePackageDeclaration )
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:82:3: lv_packages_0_0= rulePackageDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDomainmodelAccess().getPackagesPackageDeclarationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePackageDeclaration_in_ruleDomainmodel131);
            	    lv_packages_0_0=rulePackageDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDomainmodelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"packages",
            	              		lv_packages_0_0, 
            	              		"PackageDeclaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:98:3: ( (lv_imports_1_0= ruleImport ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:99:1: (lv_imports_1_0= ruleImport )
            	    {
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:99:1: (lv_imports_1_0= ruleImport )
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:100:3: lv_imports_1_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDomainmodelAccess().getImportsImportParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImport_in_ruleDomainmodel153);
            	    lv_imports_1_0=ruleImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDomainmodelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"imports",
            	              		lv_imports_1_0, 
            	              		"Import");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:116:3: ( (lv_classes_2_0= ruleClass ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:117:1: (lv_classes_2_0= ruleClass )
            	    {
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:117:1: (lv_classes_2_0= ruleClass )
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:118:3: lv_classes_2_0= ruleClass
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDomainmodelAccess().getClassesClassParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleClass_in_ruleDomainmodel175);
            	    lv_classes_2_0=ruleClass();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDomainmodelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"classes",
            	              		lv_classes_2_0, 
            	              		"Class");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
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
        }
        return current;
    }
    // $ANTLR end "ruleDomainmodel"


    // $ANTLR start "entryRulePackageDeclaration"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:142:1: entryRulePackageDeclaration returns [EObject current=null] : iv_rulePackageDeclaration= rulePackageDeclaration EOF ;
    public final EObject entryRulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDeclaration = null;


        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:143:2: (iv_rulePackageDeclaration= rulePackageDeclaration EOF )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:144:2: iv_rulePackageDeclaration= rulePackageDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackageDeclarationRule()); 
            }
            pushFollow(FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration212);
            iv_rulePackageDeclaration=rulePackageDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackageDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackageDeclaration222); if (state.failed) return current;

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
    // $ANTLR end "entryRulePackageDeclaration"


    // $ANTLR start "rulePackageDeclaration"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:151:1: rulePackageDeclaration returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ) ;
    public final EObject rulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:154:28: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:155:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:155:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:155:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_rulePackageDeclaration259); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0());
                  
            }
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:159:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:160:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:160:1: (lv_name_1_0= ruleQualifiedName )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:161:3: lv_name_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rulePackageDeclaration280);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

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
        }
        return current;
    }
    // $ANTLR end "rulePackageDeclaration"


    // $ANTLR start "entryRuleImport"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:185:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:186:2: (iv_ruleImport= ruleImport EOF )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:187:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport316);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport326); if (state.failed) return current;

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:194:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:197:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:198:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:198:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:198:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleImport363); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                  
            }
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:202:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:203:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:203:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:204:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport384);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getImportRule());
              	        }
                     		set(
                     			current, 
                     			"importedNamespace",
                      		lv_importedNamespace_1_0, 
                      		"QualifiedNameWithWildcard");
              	        afterParserOrEnumRuleCall();
              	    
            }

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
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:228:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:229:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:230:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard421);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard432); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:237:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:240:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:241:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:241:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:242:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard479);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:252:1: (kw= '.*' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:253:2: kw= '.*'
                    {
                    kw=(Token)match(input,15,FOLLOW_15_in_ruleQualifiedNameWithWildcard498); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
                          
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
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleClass"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:266:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:267:2: (iv_ruleClass= ruleClass EOF )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:268:2: iv_ruleClass= ruleClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassRule()); 
            }
            pushFollow(FOLLOW_ruleClass_in_entryRuleClass540);
            iv_ruleClass=ruleClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClass; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass550); if (state.failed) return current;

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
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:275:1: ruleClass returns [EObject current=null] : (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (lv_superType_3_0= ruleJvmTypeReference ) ) )? otherlv_4= '{' ( ( (lv_variables_5_0= ruleVariableDef ) ) | ( (lv_values_6_0= ruleValueDef ) ) | ( (lv_references_7_0= ruleReference ) ) | ( (lv_functions_8_0= ruleFunctionDef ) ) )* otherlv_9= '}' ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_9=null;
        EObject lv_superType_3_0 = null;

        EObject lv_variables_5_0 = null;

        EObject lv_values_6_0 = null;

        EObject lv_references_7_0 = null;

        EObject lv_functions_8_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:278:28: ( (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (lv_superType_3_0= ruleJvmTypeReference ) ) )? otherlv_4= '{' ( ( (lv_variables_5_0= ruleVariableDef ) ) | ( (lv_values_6_0= ruleValueDef ) ) | ( (lv_references_7_0= ruleReference ) ) | ( (lv_functions_8_0= ruleFunctionDef ) ) )* otherlv_9= '}' ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:279:1: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (lv_superType_3_0= ruleJvmTypeReference ) ) )? otherlv_4= '{' ( ( (lv_variables_5_0= ruleVariableDef ) ) | ( (lv_values_6_0= ruleValueDef ) ) | ( (lv_references_7_0= ruleReference ) ) | ( (lv_functions_8_0= ruleFunctionDef ) ) )* otherlv_9= '}' )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:279:1: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (lv_superType_3_0= ruleJvmTypeReference ) ) )? otherlv_4= '{' ( ( (lv_variables_5_0= ruleVariableDef ) ) | ( (lv_values_6_0= ruleValueDef ) ) | ( (lv_references_7_0= ruleReference ) ) | ( (lv_functions_8_0= ruleFunctionDef ) ) )* otherlv_9= '}' )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:279:3: otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (lv_superType_3_0= ruleJvmTypeReference ) ) )? otherlv_4= '{' ( ( (lv_variables_5_0= ruleVariableDef ) ) | ( (lv_values_6_0= ruleValueDef ) ) | ( (lv_references_7_0= ruleReference ) ) | ( (lv_functions_8_0= ruleFunctionDef ) ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleClass587); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getClassAccess().getClassKeyword_0());
                  
            }
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:283:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:284:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:284:1: (lv_name_1_0= RULE_ID )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:285:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClass604); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getClassAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getClassRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:301:2: (otherlv_2= 'extends' ( (lv_superType_3_0= ruleJvmTypeReference ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:301:4: otherlv_2= 'extends' ( (lv_superType_3_0= ruleJvmTypeReference ) )
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleClass622); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getClassAccess().getExtendsKeyword_2_0());
                          
                    }
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:305:1: ( (lv_superType_3_0= ruleJvmTypeReference ) )
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:306:1: (lv_superType_3_0= ruleJvmTypeReference )
                    {
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:306:1: (lv_superType_3_0= ruleJvmTypeReference )
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:307:3: lv_superType_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getClassAccess().getSuperTypeJvmTypeReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleClass643);
                    lv_superType_3_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getClassRule());
                      	        }
                             		set(
                             			current, 
                             			"superType",
                              		lv_superType_3_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleClass657); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:327:1: ( ( (lv_variables_5_0= ruleVariableDef ) ) | ( (lv_values_6_0= ruleValueDef ) ) | ( (lv_references_7_0= ruleReference ) ) | ( (lv_functions_8_0= ruleFunctionDef ) ) )*
            loop6:
            do {
                int alt6=5;
                switch ( input.LA(1) ) {
                case 20:
                    {
                    alt6=1;
                    }
                    break;
                case 23:
                    {
                    alt6=2;
                    }
                    break;
                case 24:
                    {
                    alt6=3;
                    }
                    break;
                case 25:
                    {
                    alt6=4;
                    }
                    break;

                }

                switch (alt6) {
            	case 1 :
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:327:2: ( (lv_variables_5_0= ruleVariableDef ) )
            	    {
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:327:2: ( (lv_variables_5_0= ruleVariableDef ) )
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:328:1: (lv_variables_5_0= ruleVariableDef )
            	    {
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:328:1: (lv_variables_5_0= ruleVariableDef )
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:329:3: lv_variables_5_0= ruleVariableDef
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getClassAccess().getVariablesVariableDefParserRuleCall_4_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVariableDef_in_ruleClass679);
            	    lv_variables_5_0=ruleVariableDef();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getClassRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"variables",
            	              		lv_variables_5_0, 
            	              		"VariableDef");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:346:6: ( (lv_values_6_0= ruleValueDef ) )
            	    {
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:346:6: ( (lv_values_6_0= ruleValueDef ) )
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:347:1: (lv_values_6_0= ruleValueDef )
            	    {
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:347:1: (lv_values_6_0= ruleValueDef )
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:348:3: lv_values_6_0= ruleValueDef
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getClassAccess().getValuesValueDefParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValueDef_in_ruleClass706);
            	    lv_values_6_0=ruleValueDef();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getClassRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"values",
            	              		lv_values_6_0, 
            	              		"ValueDef");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:365:6: ( (lv_references_7_0= ruleReference ) )
            	    {
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:365:6: ( (lv_references_7_0= ruleReference ) )
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:366:1: (lv_references_7_0= ruleReference )
            	    {
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:366:1: (lv_references_7_0= ruleReference )
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:367:3: lv_references_7_0= ruleReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getClassAccess().getReferencesReferenceParserRuleCall_4_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleReference_in_ruleClass733);
            	    lv_references_7_0=ruleReference();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getClassRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"references",
            	              		lv_references_7_0, 
            	              		"Reference");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:384:6: ( (lv_functions_8_0= ruleFunctionDef ) )
            	    {
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:384:6: ( (lv_functions_8_0= ruleFunctionDef ) )
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:385:1: (lv_functions_8_0= ruleFunctionDef )
            	    {
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:385:1: (lv_functions_8_0= ruleFunctionDef )
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:386:3: lv_functions_8_0= ruleFunctionDef
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getClassAccess().getFunctionsFunctionDefParserRuleCall_4_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFunctionDef_in_ruleClass760);
            	    lv_functions_8_0=ruleFunctionDef();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getClassRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"functions",
            	              		lv_functions_8_0, 
            	              		"FunctionDef");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_9=(Token)match(input,19,FOLLOW_19_in_ruleClass774); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_5());
                  
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
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleVariableDef"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:414:1: entryRuleVariableDef returns [EObject current=null] : iv_ruleVariableDef= ruleVariableDef EOF ;
    public final EObject entryRuleVariableDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDef = null;


        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:415:2: (iv_ruleVariableDef= ruleVariableDef EOF )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:416:2: iv_ruleVariableDef= ruleVariableDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDefRule()); 
            }
            pushFollow(FOLLOW_ruleVariableDef_in_entryRuleVariableDef810);
            iv_ruleVariableDef=ruleVariableDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDef820); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVariableDef"


    // $ANTLR start "ruleVariableDef"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:423:1: ruleVariableDef returns [EObject current=null] : (otherlv_0= 'var' ( (lv_varname_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleJvmTypeReference ) ) otherlv_4= '=' ( (lv_vars_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleVariableDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_varname_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_type_3_0 = null;

        EObject lv_vars_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:426:28: ( (otherlv_0= 'var' ( (lv_varname_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleJvmTypeReference ) ) otherlv_4= '=' ( (lv_vars_5_0= ruleXExpression ) ) ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:427:1: (otherlv_0= 'var' ( (lv_varname_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleJvmTypeReference ) ) otherlv_4= '=' ( (lv_vars_5_0= ruleXExpression ) ) )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:427:1: (otherlv_0= 'var' ( (lv_varname_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleJvmTypeReference ) ) otherlv_4= '=' ( (lv_vars_5_0= ruleXExpression ) ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:427:3: otherlv_0= 'var' ( (lv_varname_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleJvmTypeReference ) ) otherlv_4= '=' ( (lv_vars_5_0= ruleXExpression ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleVariableDef857); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getVariableDefAccess().getVarKeyword_0());
                  
            }
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:431:1: ( (lv_varname_1_0= RULE_ID ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:432:1: (lv_varname_1_0= RULE_ID )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:432:1: (lv_varname_1_0= RULE_ID )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:433:3: lv_varname_1_0= RULE_ID
            {
            lv_varname_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableDef874); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_varname_1_0, grammarAccess.getVariableDefAccess().getVarnameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableDefRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"varname",
                      		lv_varname_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleVariableDef891); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getVariableDefAccess().getColonKeyword_2());
                  
            }
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:453:1: ( (lv_type_3_0= ruleJvmTypeReference ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:454:1: (lv_type_3_0= ruleJvmTypeReference )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:454:1: (lv_type_3_0= ruleJvmTypeReference )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:455:3: lv_type_3_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableDefAccess().getTypeJvmTypeReferenceParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleVariableDef912);
            lv_type_3_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVariableDefRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_3_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleVariableDef924); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getVariableDefAccess().getEqualsSignKeyword_4());
                  
            }
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:475:1: ( (lv_vars_5_0= ruleXExpression ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:476:1: (lv_vars_5_0= ruleXExpression )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:476:1: (lv_vars_5_0= ruleXExpression )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:477:3: lv_vars_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableDefAccess().getVarsXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleVariableDef945);
            lv_vars_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVariableDefRule());
              	        }
                     		add(
                     			current, 
                     			"vars",
                      		lv_vars_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

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
        }
        return current;
    }
    // $ANTLR end "ruleVariableDef"


    // $ANTLR start "entryRuleValueDef"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:501:1: entryRuleValueDef returns [EObject current=null] : iv_ruleValueDef= ruleValueDef EOF ;
    public final EObject entryRuleValueDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueDef = null;


        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:502:2: (iv_ruleValueDef= ruleValueDef EOF )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:503:2: iv_ruleValueDef= ruleValueDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueDefRule()); 
            }
            pushFollow(FOLLOW_ruleValueDef_in_entryRuleValueDef981);
            iv_ruleValueDef=ruleValueDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValueDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueDef991); if (state.failed) return current;

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
    // $ANTLR end "entryRuleValueDef"


    // $ANTLR start "ruleValueDef"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:510:1: ruleValueDef returns [EObject current=null] : (otherlv_0= 'val' ( (lv_valname_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleJvmTypeReference ) ) (otherlv_4= '=' ( (lv_vals_5_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleValueDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_valname_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_type_3_0 = null;

        EObject lv_vals_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:513:28: ( (otherlv_0= 'val' ( (lv_valname_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleJvmTypeReference ) ) (otherlv_4= '=' ( (lv_vals_5_0= ruleXExpression ) ) )? ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:514:1: (otherlv_0= 'val' ( (lv_valname_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleJvmTypeReference ) ) (otherlv_4= '=' ( (lv_vals_5_0= ruleXExpression ) ) )? )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:514:1: (otherlv_0= 'val' ( (lv_valname_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleJvmTypeReference ) ) (otherlv_4= '=' ( (lv_vals_5_0= ruleXExpression ) ) )? )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:514:3: otherlv_0= 'val' ( (lv_valname_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleJvmTypeReference ) ) (otherlv_4= '=' ( (lv_vals_5_0= ruleXExpression ) ) )?
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleValueDef1028); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getValueDefAccess().getValKeyword_0());
                  
            }
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:518:1: ( (lv_valname_1_0= RULE_ID ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:519:1: (lv_valname_1_0= RULE_ID )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:519:1: (lv_valname_1_0= RULE_ID )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:520:3: lv_valname_1_0= RULE_ID
            {
            lv_valname_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValueDef1045); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_valname_1_0, grammarAccess.getValueDefAccess().getValnameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getValueDefRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"valname",
                      		lv_valname_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleValueDef1062); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getValueDefAccess().getColonKeyword_2());
                  
            }
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:540:1: ( (lv_type_3_0= ruleJvmTypeReference ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:541:1: (lv_type_3_0= ruleJvmTypeReference )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:541:1: (lv_type_3_0= ruleJvmTypeReference )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:542:3: lv_type_3_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getValueDefAccess().getTypeJvmTypeReferenceParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleValueDef1083);
            lv_type_3_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getValueDefRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_3_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:558:2: (otherlv_4= '=' ( (lv_vals_5_0= ruleXExpression ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:558:4: otherlv_4= '=' ( (lv_vals_5_0= ruleXExpression ) )
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleValueDef1096); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getValueDefAccess().getEqualsSignKeyword_4_0());
                          
                    }
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:562:1: ( (lv_vals_5_0= ruleXExpression ) )
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:563:1: (lv_vals_5_0= ruleXExpression )
                    {
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:563:1: (lv_vals_5_0= ruleXExpression )
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:564:3: lv_vals_5_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getValueDefAccess().getValsXExpressionParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleValueDef1117);
                    lv_vals_5_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getValueDefRule());
                      	        }
                             		add(
                             			current, 
                             			"vals",
                              		lv_vals_5_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

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
        }
        return current;
    }
    // $ANTLR end "ruleValueDef"


    // $ANTLR start "entryRuleReference"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:588:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:589:2: (iv_ruleReference= ruleReference EOF )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:590:2: iv_ruleReference= ruleReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleReference_in_entryRuleReference1155);
            iv_ruleReference=ruleReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReference1165); if (state.failed) return current;

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
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:597:1: ruleReference returns [EObject current=null] : (otherlv_0= 'ref' ( (lv_refname_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleJvmTypeReference ) ) (otherlv_4= '=' ( (lv_refs_5_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_refname_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_type_3_0 = null;

        EObject lv_refs_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:600:28: ( (otherlv_0= 'ref' ( (lv_refname_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleJvmTypeReference ) ) (otherlv_4= '=' ( (lv_refs_5_0= ruleXExpression ) ) )? ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:601:1: (otherlv_0= 'ref' ( (lv_refname_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleJvmTypeReference ) ) (otherlv_4= '=' ( (lv_refs_5_0= ruleXExpression ) ) )? )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:601:1: (otherlv_0= 'ref' ( (lv_refname_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleJvmTypeReference ) ) (otherlv_4= '=' ( (lv_refs_5_0= ruleXExpression ) ) )? )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:601:3: otherlv_0= 'ref' ( (lv_refname_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleJvmTypeReference ) ) (otherlv_4= '=' ( (lv_refs_5_0= ruleXExpression ) ) )?
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleReference1202); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getReferenceAccess().getRefKeyword_0());
                  
            }
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:605:1: ( (lv_refname_1_0= RULE_ID ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:606:1: (lv_refname_1_0= RULE_ID )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:606:1: (lv_refname_1_0= RULE_ID )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:607:3: lv_refname_1_0= RULE_ID
            {
            lv_refname_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReference1219); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_refname_1_0, grammarAccess.getReferenceAccess().getRefnameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getReferenceRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"refname",
                      		lv_refname_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleReference1236); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getReferenceAccess().getColonKeyword_2());
                  
            }
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:627:1: ( (lv_type_3_0= ruleJvmTypeReference ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:628:1: (lv_type_3_0= ruleJvmTypeReference )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:628:1: (lv_type_3_0= ruleJvmTypeReference )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:629:3: lv_type_3_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReferenceAccess().getTypeJvmTypeReferenceParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleReference1257);
            lv_type_3_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getReferenceRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_3_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:645:2: (otherlv_4= '=' ( (lv_refs_5_0= ruleXExpression ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:645:4: otherlv_4= '=' ( (lv_refs_5_0= ruleXExpression ) )
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleReference1270); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getReferenceAccess().getEqualsSignKeyword_4_0());
                          
                    }
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:649:1: ( (lv_refs_5_0= ruleXExpression ) )
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:650:1: (lv_refs_5_0= ruleXExpression )
                    {
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:650:1: (lv_refs_5_0= ruleXExpression )
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:651:3: lv_refs_5_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReferenceAccess().getRefsXExpressionParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleReference1291);
                    lv_refs_5_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"refs",
                              		lv_refs_5_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

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
        }
        return current;
    }
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleFunctionDef"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:675:1: entryRuleFunctionDef returns [EObject current=null] : iv_ruleFunctionDef= ruleFunctionDef EOF ;
    public final EObject entryRuleFunctionDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionDef = null;


        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:676:2: (iv_ruleFunctionDef= ruleFunctionDef EOF )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:677:2: iv_ruleFunctionDef= ruleFunctionDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionDefRule()); 
            }
            pushFollow(FOLLOW_ruleFunctionDef_in_entryRuleFunctionDef1329);
            iv_ruleFunctionDef=ruleFunctionDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionDef1339); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFunctionDef"


    // $ANTLR start "ruleFunctionDef"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:684:1: ruleFunctionDef returns [EObject current=null] : (otherlv_0= 'def' ( (lv_defname_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleJvmTypeReference ) ) otherlv_4= '{' ( (lv_features_5_0= ruleXExpression ) )* otherlv_6= '}' ) ;
    public final EObject ruleFunctionDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_defname_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_type_3_0 = null;

        EObject lv_features_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:687:28: ( (otherlv_0= 'def' ( (lv_defname_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleJvmTypeReference ) ) otherlv_4= '{' ( (lv_features_5_0= ruleXExpression ) )* otherlv_6= '}' ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:688:1: (otherlv_0= 'def' ( (lv_defname_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleJvmTypeReference ) ) otherlv_4= '{' ( (lv_features_5_0= ruleXExpression ) )* otherlv_6= '}' )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:688:1: (otherlv_0= 'def' ( (lv_defname_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleJvmTypeReference ) ) otherlv_4= '{' ( (lv_features_5_0= ruleXExpression ) )* otherlv_6= '}' )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:688:3: otherlv_0= 'def' ( (lv_defname_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleJvmTypeReference ) ) otherlv_4= '{' ( (lv_features_5_0= ruleXExpression ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleFunctionDef1376); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFunctionDefAccess().getDefKeyword_0());
                  
            }
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:692:1: ( (lv_defname_1_0= RULE_ID ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:693:1: (lv_defname_1_0= RULE_ID )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:693:1: (lv_defname_1_0= RULE_ID )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:694:3: lv_defname_1_0= RULE_ID
            {
            lv_defname_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionDef1393); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_defname_1_0, grammarAccess.getFunctionDefAccess().getDefnameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFunctionDefRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"defname",
                      		lv_defname_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleFunctionDef1410); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getFunctionDefAccess().getColonKeyword_2());
                  
            }
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:714:1: ( (lv_type_3_0= ruleJvmTypeReference ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:715:1: (lv_type_3_0= ruleJvmTypeReference )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:715:1: (lv_type_3_0= ruleJvmTypeReference )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:716:3: lv_type_3_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionDefAccess().getTypeJvmTypeReferenceParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleFunctionDef1431);
            lv_type_3_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFunctionDefRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_3_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleFunctionDef1443); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getFunctionDefAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:736:1: ( (lv_features_5_0= ruleXExpression ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_ID && LA9_0<=RULE_DECIMAL)||LA9_0==18||LA9_0==35||(LA9_0>=42 && LA9_0<=43)||LA9_0==48||LA9_0==54||LA9_0==56||LA9_0==60||LA9_0==62||(LA9_0>=65 && LA9_0<=68)||(LA9_0>=70 && LA9_0<=77)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:737:1: (lv_features_5_0= ruleXExpression )
            	    {
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:737:1: (lv_features_5_0= ruleXExpression )
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:738:3: lv_features_5_0= ruleXExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFunctionDefAccess().getFeaturesXExpressionParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpression_in_ruleFunctionDef1464);
            	    lv_features_5_0=ruleXExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getFunctionDefRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"features",
            	              		lv_features_5_0, 
            	              		"XExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleFunctionDef1477); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getFunctionDefAccess().getRightCurlyBracketKeyword_6());
                  
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
    // $ANTLR end "ruleFunctionDef"


    // $ANTLR start "entryRuleXExpression"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:766:1: entryRuleXExpression returns [EObject current=null] : iv_ruleXExpression= ruleXExpression EOF ;
    public final EObject entryRuleXExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression = null;


        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:767:2: (iv_ruleXExpression= ruleXExpression EOF )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:768:2: iv_ruleXExpression= ruleXExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXExpression_in_entryRuleXExpression1513);
            iv_ruleXExpression=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression1523); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXExpression"


    // $ANTLR start "ruleXExpression"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:775:1: ruleXExpression returns [EObject current=null] : this_XAssignment_0= ruleXAssignment ;
    public final EObject ruleXExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAssignment_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:778:28: (this_XAssignment_0= ruleXAssignment )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:780:5: this_XAssignment_0= ruleXAssignment
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXExpressionAccess().getXAssignmentParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleXAssignment_in_ruleXExpression1569);
            this_XAssignment_0=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAssignment_0; 
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
    // $ANTLR end "ruleXExpression"


    // $ANTLR start "entryRuleXAssignment"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:796:1: entryRuleXAssignment returns [EObject current=null] : iv_ruleXAssignment= ruleXAssignment EOF ;
    public final EObject entryRuleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAssignment = null;


        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:797:2: (iv_ruleXAssignment= ruleXAssignment EOF )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:798:2: iv_ruleXAssignment= ruleXAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleXAssignment_in_entryRuleXAssignment1603);
            iv_ruleXAssignment=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAssignment1613); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXAssignment"


    // $ANTLR start "ruleXAssignment"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:805:1: ruleXAssignment returns [EObject current=null] : ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) ;
    public final EObject ruleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_value_3_0 = null;

        EObject this_XOrExpression_4 = null;

        EObject lv_rightOperand_7_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:808:28: ( ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:809:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:809:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==22) ) {
                    alt11=1;
                }
                else if ( (LA11_1==EOF||(LA11_1>=RULE_ID && LA11_1<=RULE_DECIMAL)||(LA11_1>=18 && LA11_1<=21)||(LA11_1>=23 && LA11_1<=56)||(LA11_1>=58 && LA11_1<=79)) ) {
                    alt11=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA11_0>=RULE_STRING && LA11_0<=RULE_DECIMAL)||LA11_0==18||LA11_0==35||(LA11_0>=42 && LA11_0<=43)||LA11_0==48||LA11_0==54||LA11_0==56||LA11_0==60||LA11_0==62||(LA11_0>=65 && LA11_0<=68)||(LA11_0>=70 && LA11_0<=77)) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:809:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    {
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:809:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:809:3: () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) )
                    {
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:809:3: ()
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:810:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXAssignmentAccess().getXAssignmentAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:815:2: ( ( ruleValidID ) )
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:816:1: ( ruleValidID )
                    {
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:816:1: ( ruleValidID )
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:817:3: ruleValidID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXAssignmentRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXAssignment1671);
                    ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getOpSingleAssignParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXAssignment1687);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:838:1: ( (lv_value_3_0= ruleXAssignment ) )
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:839:1: (lv_value_3_0= ruleXAssignment )
                    {
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:839:1: (lv_value_3_0= ruleXAssignment )
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:840:3: lv_value_3_0= ruleXAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getValueXAssignmentParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment1707);
                    lv_value_3_0=ruleXAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXAssignmentRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_3_0, 
                              		"XAssignment");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:857:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    {
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:857:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:858:5: this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getXOrExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXOrExpression_in_ruleXAssignment1737);
                    this_XOrExpression_4=ruleXOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XOrExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:866:1: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==26) ) {
                        int LA10_1 = input.LA(2);

                        if ( (synpred1_InternalEditor()) ) {
                            alt10=1;
                        }
                    }
                    switch (alt10) {
                        case 1 :
                            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:866:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            {
                            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:866:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) )
                            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:866:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) )
                            {
                            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:871:6: ( () ( ( ruleOpMultiAssign ) ) )
                            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:871:7: () ( ( ruleOpMultiAssign ) )
                            {
                            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:871:7: ()
                            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:872:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
                                          current);
                                  
                            }

                            }

                            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:877:2: ( ( ruleOpMultiAssign ) )
                            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:878:1: ( ruleOpMultiAssign )
                            {
                            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:878:1: ( ruleOpMultiAssign )
                            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:879:3: ruleOpMultiAssign
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getXAssignmentRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleOpMultiAssign_in_ruleXAssignment1790);
                            ruleOpMultiAssign();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }


                            }

                            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:892:4: ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:893:1: (lv_rightOperand_7_0= ruleXAssignment )
                            {
                            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:893:1: (lv_rightOperand_7_0= ruleXAssignment )
                            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:894:3: lv_rightOperand_7_0= ruleXAssignment
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getRightOperandXAssignmentParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment1813);
                            lv_rightOperand_7_0=ruleXAssignment();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXAssignmentRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"rightOperand",
                                      		lv_rightOperand_7_0, 
                                      		"XAssignment");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

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
        }
        return current;
    }
    // $ANTLR end "ruleXAssignment"


    // $ANTLR start "entryRuleOpSingleAssign"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:918:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:919:2: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:920:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign1853);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpSingleAssign1864); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpSingleAssign"


    // $ANTLR start "ruleOpSingleAssign"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:927:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:930:28: (kw= '=' )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:932:2: kw= '='
            {
            kw=(Token)match(input,22,FOLLOW_22_in_ruleOpSingleAssign1901); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpSingleAssignAccess().getEqualsSignKeyword()); 
                  
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
    // $ANTLR end "ruleOpSingleAssign"


    // $ANTLR start "entryRuleOpMultiAssign"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:945:1: entryRuleOpMultiAssign returns [String current=null] : iv_ruleOpMultiAssign= ruleOpMultiAssign EOF ;
    public final String entryRuleOpMultiAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMultiAssign = null;


        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:946:2: (iv_ruleOpMultiAssign= ruleOpMultiAssign EOF )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:947:2: iv_ruleOpMultiAssign= ruleOpMultiAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign1941);
            iv_ruleOpMultiAssign=ruleOpMultiAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMultiAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMultiAssign1952); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpMultiAssign"


    // $ANTLR start "ruleOpMultiAssign"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:954:1: ruleOpMultiAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+=' ;
    public final AntlrDatatypeRuleToken ruleOpMultiAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:957:28: (kw= '+=' )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:959:2: kw= '+='
            {
            kw=(Token)match(input,26,FOLLOW_26_in_ruleOpMultiAssign1989); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getPlusSignEqualsSignKeyword()); 
                  
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
    // $ANTLR end "ruleOpMultiAssign"


    // $ANTLR start "entryRuleXOrExpression"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:972:1: entryRuleXOrExpression returns [EObject current=null] : iv_ruleXOrExpression= ruleXOrExpression EOF ;
    public final EObject entryRuleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrExpression = null;


        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:973:2: (iv_ruleXOrExpression= ruleXOrExpression EOF )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:974:2: iv_ruleXOrExpression= ruleXOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression2028);
            iv_ruleXOrExpression=ruleXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrExpression2038); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXOrExpression"


    // $ANTLR start "ruleXOrExpression"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:981:1: ruleXOrExpression returns [EObject current=null] : (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) ;
    public final EObject ruleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:984:28: ( (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:985:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:985:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:986:5: this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOrExpressionAccess().getXAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression2085);
            this_XAndExpression_0=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:994:1: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==27) ) {
                    int LA12_2 = input.LA(2);

                    if ( (synpred2_InternalEditor()) ) {
                        alt12=1;
                    }


                }


                switch (alt12) {
            	case 1 :
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:994:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    {
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:994:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) )
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:994:3: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) )
            	    {
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:999:6: ( () ( ( ruleOpOr ) ) )
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:999:7: () ( ( ruleOpOr ) )
            	    {
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:999:7: ()
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1000:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1005:2: ( ( ruleOpOr ) )
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1006:1: ( ruleOpOr )
            	    {
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1006:1: ( ruleOpOr )
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1007:3: ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOrExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOr_in_ruleXOrExpression2138);
            	    ruleOpOr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1020:4: ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1021:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    {
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1021:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1022:3: lv_rightOperand_3_0= ruleXAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getRightOperandXAndExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression2161);
            	    lv_rightOperand_3_0=ruleXAndExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXOrExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XAndExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
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
        }
        return current;
    }
    // $ANTLR end "ruleXOrExpression"


    // $ANTLR start "entryRuleOpOr"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1046:1: entryRuleOpOr returns [String current=null] : iv_ruleOpOr= ruleOpOr EOF ;
    public final String entryRuleOpOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOr = null;


        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1047:2: (iv_ruleOpOr= ruleOpOr EOF )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1048:2: iv_ruleOpOr= ruleOpOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOrRule()); 
            }
            pushFollow(FOLLOW_ruleOpOr_in_entryRuleOpOr2200);
            iv_ruleOpOr=ruleOpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOr2211); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpOr"


    // $ANTLR start "ruleOpOr"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1055:1: ruleOpOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleOpOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1058:28: (kw= '||' )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1060:2: kw= '||'
            {
            kw=(Token)match(input,27,FOLLOW_27_in_ruleOpOr2248); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpOrAccess().getVerticalLineVerticalLineKeyword()); 
                  
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
    // $ANTLR end "ruleOpOr"


    // $ANTLR start "entryRuleXAndExpression"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1073:1: entryRuleXAndExpression returns [EObject current=null] : iv_ruleXAndExpression= ruleXAndExpression EOF ;
    public final EObject entryRuleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAndExpression = null;


        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1074:2: (iv_ruleXAndExpression= ruleXAndExpression EOF )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1075:2: iv_ruleXAndExpression= ruleXAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression2287);
            iv_ruleXAndExpression=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAndExpression2297); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXAndExpression"


    // $ANTLR start "ruleXAndExpression"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1082:1: ruleXAndExpression returns [EObject current=null] : (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) ;
    public final EObject ruleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XEqualityExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1085:28: ( (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1086:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1086:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1087:5: this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAndExpressionAccess().getXEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2344);
            this_XEqualityExpression_0=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XEqualityExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1095:1: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==28) ) {
                    int LA13_2 = input.LA(2);

                    if ( (synpred3_InternalEditor()) ) {
                        alt13=1;
                    }


                }


                switch (alt13) {
            	case 1 :
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1095:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    {
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1095:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) )
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1095:3: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) )
            	    {
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1100:6: ( () ( ( ruleOpAnd ) ) )
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1100:7: () ( ( ruleOpAnd ) )
            	    {
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1100:7: ()
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1101:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1106:2: ( ( ruleOpAnd ) )
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1107:1: ( ruleOpAnd )
            	    {
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1107:1: ( ruleOpAnd )
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1108:3: ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAndExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAnd_in_ruleXAndExpression2397);
            	    ruleOpAnd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1121:4: ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1122:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    {
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1122:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1123:3: lv_rightOperand_3_0= ruleXEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getRightOperandXEqualityExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2420);
            	    lv_rightOperand_3_0=ruleXEqualityExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXAndExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XEqualityExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
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
        }
        return current;
    }
    // $ANTLR end "ruleXAndExpression"


    // $ANTLR start "entryRuleOpAnd"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1147:1: entryRuleOpAnd returns [String current=null] : iv_ruleOpAnd= ruleOpAnd EOF ;
    public final String entryRuleOpAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAnd = null;


        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1148:2: (iv_ruleOpAnd= ruleOpAnd EOF )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1149:2: iv_ruleOpAnd= ruleOpAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAndRule()); 
            }
            pushFollow(FOLLOW_ruleOpAnd_in_entryRuleOpAnd2459);
            iv_ruleOpAnd=ruleOpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAnd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAnd2470); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpAnd"


    // $ANTLR start "ruleOpAnd"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1156:1: ruleOpAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleOpAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1159:28: (kw= '&&' )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1161:2: kw= '&&'
            {
            kw=(Token)match(input,28,FOLLOW_28_in_ruleOpAnd2507); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpAndAccess().getAmpersandAmpersandKeyword()); 
                  
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
    // $ANTLR end "ruleOpAnd"


    // $ANTLR start "entryRuleXEqualityExpression"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1174:1: entryRuleXEqualityExpression returns [EObject current=null] : iv_ruleXEqualityExpression= ruleXEqualityExpression EOF ;
    public final EObject entryRuleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEqualityExpression = null;


        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1175:2: (iv_ruleXEqualityExpression= ruleXEqualityExpression EOF )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1176:2: iv_ruleXEqualityExpression= ruleXEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression2546);
            iv_ruleXEqualityExpression=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXEqualityExpression2556); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXEqualityExpression"


    // $ANTLR start "ruleXEqualityExpression"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1183:1: ruleXEqualityExpression returns [EObject current=null] : (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) ;
    public final EObject ruleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XRelationalExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1186:28: ( (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1187:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1187:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1188:5: this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getXRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2603);
            this_XRelationalExpression_0=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XRelationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1196:1: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==29) ) {
                    int LA14_2 = input.LA(2);

                    if ( (synpred4_InternalEditor()) ) {
                        alt14=1;
                    }


                }
                else if ( (LA14_0==30) ) {
                    int LA14_3 = input.LA(2);

                    if ( (synpred4_InternalEditor()) ) {
                        alt14=1;
                    }


                }


                switch (alt14) {
            	case 1 :
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1196:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    {
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1196:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) )
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1196:3: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) )
            	    {
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1201:6: ( () ( ( ruleOpEquality ) ) )
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1201:7: () ( ( ruleOpEquality ) )
            	    {
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1201:7: ()
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1202:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1207:2: ( ( ruleOpEquality ) )
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1208:1: ( ruleOpEquality )
            	    {
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1208:1: ( ruleOpEquality )
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1209:3: ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpEquality_in_ruleXEqualityExpression2656);
            	    ruleOpEquality();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1222:4: ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1223:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    {
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1223:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1224:3: lv_rightOperand_3_0= ruleXRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getRightOperandXRelationalExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2679);
            	    lv_rightOperand_3_0=ruleXRelationalExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XRelationalExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
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
        }
        return current;
    }
    // $ANTLR end "ruleXEqualityExpression"


    // $ANTLR start "entryRuleOpEquality"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1248:1: entryRuleOpEquality returns [String current=null] : iv_ruleOpEquality= ruleOpEquality EOF ;
    public final String entryRuleOpEquality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpEquality = null;


        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1249:2: (iv_ruleOpEquality= ruleOpEquality EOF )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1250:2: iv_ruleOpEquality= ruleOpEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpEqualityRule()); 
            }
            pushFollow(FOLLOW_ruleOpEquality_in_entryRuleOpEquality2718);
            iv_ruleOpEquality=ruleOpEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpEquality.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpEquality2729); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpEquality"


    // $ANTLR start "ruleOpEquality"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1257:1: ruleOpEquality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleOpEquality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1260:28: ( (kw= '==' | kw= '!=' ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1261:1: (kw= '==' | kw= '!=' )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1261:1: (kw= '==' | kw= '!=' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==29) ) {
                alt15=1;
            }
            else if ( (LA15_0==30) ) {
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
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1262:2: kw= '=='
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleOpEquality2767); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1269:2: kw= '!='
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleOpEquality2786); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getExclamationMarkEqualsSignKeyword_1()); 
                          
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
    // $ANTLR end "ruleOpEquality"


    // $ANTLR start "entryRuleXRelationalExpression"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1282:1: entryRuleXRelationalExpression returns [EObject current=null] : iv_ruleXRelationalExpression= ruleXRelationalExpression EOF ;
    public final EObject entryRuleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXRelationalExpression = null;


        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1283:2: (iv_ruleXRelationalExpression= ruleXRelationalExpression EOF )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1284:2: iv_ruleXRelationalExpression= ruleXRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression2826);
            iv_ruleXRelationalExpression=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXRelationalExpression2836); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXRelationalExpression"


    // $ANTLR start "ruleXRelationalExpression"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1291:1: ruleXRelationalExpression returns [EObject current=null] : (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XOtherOperatorExpression_0 = null;

        EObject lv_type_3_0 = null;

        EObject lv_rightOperand_6_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1294:28: ( (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1295:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1295:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1296:5: this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getXOtherOperatorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2883);
            this_XOtherOperatorExpression_0=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XOtherOperatorExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1304:1: ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            loop16:
            do {
                int alt16=3;
                switch ( input.LA(1) ) {
                case 35:
                    {
                    int LA16_2 = input.LA(2);

                    if ( (synpred6_InternalEditor()) ) {
                        alt16=2;
                    }


                    }
                    break;
                case 34:
                    {
                    int LA16_3 = input.LA(2);

                    if ( (synpred6_InternalEditor()) ) {
                        alt16=2;
                    }


                    }
                    break;
                case 31:
                    {
                    int LA16_4 = input.LA(2);

                    if ( (synpred5_InternalEditor()) ) {
                        alt16=1;
                    }


                    }
                    break;
                case 32:
                    {
                    int LA16_5 = input.LA(2);

                    if ( (synpred6_InternalEditor()) ) {
                        alt16=2;
                    }


                    }
                    break;
                case 33:
                    {
                    int LA16_6 = input.LA(2);

                    if ( (synpred6_InternalEditor()) ) {
                        alt16=2;
                    }


                    }
                    break;

                }

                switch (alt16) {
            	case 1 :
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1304:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    {
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1304:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1304:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1304:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) )
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1304:4: ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' )
            	    {
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1306:5: ( () otherlv_2= 'instanceof' )
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1306:6: () otherlv_2= 'instanceof'
            	    {
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1306:6: ()
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1307:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleXRelationalExpression2919); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXRelationalExpressionAccess().getInstanceofKeyword_1_0_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1316:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1317:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1317:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1318:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXRelationalExpression2942);
            	    lv_type_3_0=ruleJvmTypeReference();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"type",
            	              		lv_type_3_0, 
            	              		"JvmTypeReference");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1335:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    {
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1335:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1335:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    {
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1335:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) )
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1335:8: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) )
            	    {
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1340:6: ( () ( ( ruleOpCompare ) ) )
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1340:7: () ( ( ruleOpCompare ) )
            	    {
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1340:7: ()
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1341:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1346:2: ( ( ruleOpCompare ) )
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1347:1: ( ruleOpCompare )
            	    {
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1347:1: ( ruleOpCompare )
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1348:3: ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpCompare_in_ruleXRelationalExpression3003);
            	    ruleOpCompare();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1361:4: ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1362:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    {
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1362:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1363:3: lv_rightOperand_6_0= ruleXOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getRightOperandXOtherOperatorExpressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression3026);
            	    lv_rightOperand_6_0=ruleXOtherOperatorExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_6_0, 
            	              		"XOtherOperatorExpression");
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
        }
        return current;
    }
    // $ANTLR end "ruleXRelationalExpression"


    // $ANTLR start "entryRuleOpCompare"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1387:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1388:2: (iv_ruleOpCompare= ruleOpCompare EOF )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1389:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FOLLOW_ruleOpCompare_in_entryRuleOpCompare3066);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpCompare3077); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpCompare"


    // $ANTLR start "ruleOpCompare"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1396:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1399:28: ( (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1400:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1400:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            int alt17=4;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt17=1;
                }
                break;
            case 33:
                {
                alt17=2;
                }
                break;
            case 34:
                {
                alt17=3;
                }
                break;
            case 35:
                {
                alt17=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1401:2: kw= '>='
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleOpCompare3115); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1408:2: kw= '<='
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleOpCompare3134); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1415:2: kw= '>'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleOpCompare3153); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1422:2: kw= '<'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpCompare3172); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignKeyword_3()); 
                          
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
    // $ANTLR end "ruleOpCompare"


    // $ANTLR start "entryRuleXOtherOperatorExpression"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1435:1: entryRuleXOtherOperatorExpression returns [EObject current=null] : iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF ;
    public final EObject entryRuleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOtherOperatorExpression = null;


        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1436:2: (iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1437:2: iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression3212);
            iv_ruleXOtherOperatorExpression=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOtherOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOtherOperatorExpression3222); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXOtherOperatorExpression"


    // $ANTLR start "ruleXOtherOperatorExpression"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1444:1: ruleXOtherOperatorExpression returns [EObject current=null] : (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) ;
    public final EObject ruleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAdditiveExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1447:28: ( (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1448:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1448:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1449:5: this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getXAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3269);
            this_XAdditiveExpression_0=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1457:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            loop18:
            do {
                int alt18=2;
                alt18 = dfa18.predict(input);
                switch (alt18) {
            	case 1 :
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1457:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    {
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1457:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) )
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1457:3: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) )
            	    {
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1462:6: ( () ( ( ruleOpOther ) ) )
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1462:7: () ( ( ruleOpOther ) )
            	    {
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1462:7: ()
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1463:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1468:2: ( ( ruleOpOther ) )
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1469:1: ( ruleOpOther )
            	    {
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1469:1: ( ruleOpOther )
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1470:3: ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression3322);
            	    ruleOpOther();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1483:4: ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1484:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    {
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1484:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1485:3: lv_rightOperand_3_0= ruleXAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getRightOperandXAdditiveExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3345);
            	    lv_rightOperand_3_0=ruleXAdditiveExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XAdditiveExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
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
        }
        return current;
    }
    // $ANTLR end "ruleXOtherOperatorExpression"


    // $ANTLR start "entryRuleOpOther"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1509:1: entryRuleOpOther returns [String current=null] : iv_ruleOpOther= ruleOpOther EOF ;
    public final String entryRuleOpOther() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOther = null;


        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1510:2: (iv_ruleOpOther= ruleOpOther EOF )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1511:2: iv_ruleOpOther= ruleOpOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOtherRule()); 
            }
            pushFollow(FOLLOW_ruleOpOther_in_entryRuleOpOther3384);
            iv_ruleOpOther=ruleOpOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOther.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOther3395); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpOther"


    // $ANTLR start "ruleOpOther"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1518:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1521:28: ( (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1522:1: (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1522:1: (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' )
            int alt21=8;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt21=1;
                }
                break;
            case 37:
                {
                alt21=2;
                }
                break;
            case 38:
                {
                alt21=3;
                }
                break;
            case 34:
                {
                alt21=4;
                }
                break;
            case 35:
                {
                alt21=5;
                }
                break;
            case 39:
                {
                alt21=6;
                }
                break;
            case 40:
                {
                alt21=7;
                }
                break;
            case 41:
                {
                alt21=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1523:2: kw= '->'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleOpOther3433); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1530:2: kw= '..'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleOpOther3452); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getFullStopFullStopKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1537:2: kw= '=>'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleOpOther3471); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getEqualsSignGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1543:6: (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) )
                    {
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1543:6: (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) )
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1544:2: kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' )
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleOpOther3491); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_0()); 
                          
                    }
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1549:1: ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' )
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==34) ) {
                        int LA19_1 = input.LA(2);

                        if ( (LA19_1==34) && (synpred8_InternalEditor())) {
                            alt19=1;
                        }
                        else if ( (LA19_1==EOF||(LA19_1>=RULE_ID && LA19_1<=RULE_DECIMAL)||LA19_1==18||LA19_1==35||(LA19_1>=42 && LA19_1<=43)||LA19_1==48||LA19_1==54||LA19_1==56||LA19_1==60||LA19_1==62||(LA19_1>=65 && LA19_1<=68)||(LA19_1>=70 && LA19_1<=77)) ) {
                            alt19=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 19, 1, input);

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
                            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1549:2: ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) )
                            {
                            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1549:2: ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) )
                            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1549:3: ( ( '>' '>' ) )=> (kw= '>' kw= '>' )
                            {
                            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1553:5: (kw= '>' kw= '>' )
                            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1554:2: kw= '>' kw= '>'
                            {
                            kw=(Token)match(input,34,FOLLOW_34_in_ruleOpOther3522); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_1_0_0_0()); 
                                  
                            }
                            kw=(Token)match(input,34,FOLLOW_34_in_ruleOpOther3535); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_1_0_0_1()); 
                                  
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1567:2: kw= '>'
                            {
                            kw=(Token)match(input,34,FOLLOW_34_in_ruleOpOther3556); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_1_1()); 
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1573:6: (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) )
                    {
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1573:6: (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) )
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1574:2: kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' )
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpOther3578); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_0()); 
                          
                    }
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1579:1: ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' )
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==35) ) {
                        int LA20_1 = input.LA(2);

                        if ( (synpred9_InternalEditor()) ) {
                            alt20=1;
                        }
                        else if ( (true) ) {
                            alt20=2;
                        }
                        else {
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
                            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1579:2: ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) )
                            {
                            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1579:2: ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) )
                            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1579:3: ( ( '<' '<' ) )=> (kw= '<' kw= '<' )
                            {
                            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1583:5: (kw= '<' kw= '<' )
                            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1584:2: kw= '<' kw= '<'
                            {
                            kw=(Token)match(input,35,FOLLOW_35_in_ruleOpOther3609); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_1_0_0_0()); 
                                  
                            }
                            kw=(Token)match(input,35,FOLLOW_35_in_ruleOpOther3622); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_1_0_0_1()); 
                                  
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1597:2: kw= '<'
                            {
                            kw=(Token)match(input,35,FOLLOW_35_in_ruleOpOther3643); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_1_1()); 
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1604:2: kw= '<>'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleOpOther3664); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignGreaterThanSignKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1611:2: kw= '?:'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleOpOther3683); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getQuestionMarkColonKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1618:2: kw= '<=>'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleOpOther3702); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_7()); 
                          
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
    // $ANTLR end "ruleOpOther"


    // $ANTLR start "entryRuleXAdditiveExpression"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1631:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1632:2: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1633:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression3742);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAdditiveExpression3752); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXAdditiveExpression"


    // $ANTLR start "ruleXAdditiveExpression"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1640:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1643:28: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1644:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1644:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1645:5: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3799);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1653:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==43) ) {
                    int LA22_2 = input.LA(2);

                    if ( (synpred10_InternalEditor()) ) {
                        alt22=1;
                    }


                }
                else if ( (LA22_0==42) ) {
                    int LA22_3 = input.LA(2);

                    if ( (synpred10_InternalEditor()) ) {
                        alt22=1;
                    }


                }


                switch (alt22) {
            	case 1 :
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1653:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1653:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1653:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1658:6: ( () ( ( ruleOpAdd ) ) )
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1658:7: () ( ( ruleOpAdd ) )
            	    {
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1658:7: ()
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1659:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1664:2: ( ( ruleOpAdd ) )
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1665:1: ( ruleOpAdd )
            	    {
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1665:1: ( ruleOpAdd )
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1666:3: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression3852);
            	    ruleOpAdd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1679:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1680:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1680:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1681:3: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3875);
            	    lv_rightOperand_3_0=ruleXMultiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XMultiplicativeExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
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
        }
        return current;
    }
    // $ANTLR end "ruleXAdditiveExpression"


    // $ANTLR start "entryRuleOpAdd"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1705:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1706:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1707:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_ruleOpAdd_in_entryRuleOpAdd3914);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAdd3925); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpAdd"


    // $ANTLR start "ruleOpAdd"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1714:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1717:28: ( (kw= '+' | kw= '-' ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1718:1: (kw= '+' | kw= '-' )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1718:1: (kw= '+' | kw= '-' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==42) ) {
                alt23=1;
            }
            else if ( (LA23_0==43) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1719:2: kw= '+'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleOpAdd3963); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1726:2: kw= '-'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleOpAdd3982); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getHyphenMinusKeyword_1()); 
                          
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
    // $ANTLR end "ruleOpAdd"


    // $ANTLR start "entryRuleXMultiplicativeExpression"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1739:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1740:2: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1741:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression4022);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMultiplicativeExpression4032); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXMultiplicativeExpression"


    // $ANTLR start "ruleXMultiplicativeExpression"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1748:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1751:28: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1752:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1752:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1753:5: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression4079);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XUnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1761:1: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            loop24:
            do {
                int alt24=2;
                switch ( input.LA(1) ) {
                case 44:
                    {
                    int LA24_2 = input.LA(2);

                    if ( (synpred11_InternalEditor()) ) {
                        alt24=1;
                    }


                    }
                    break;
                case 45:
                    {
                    int LA24_3 = input.LA(2);

                    if ( (synpred11_InternalEditor()) ) {
                        alt24=1;
                    }


                    }
                    break;
                case 46:
                    {
                    int LA24_4 = input.LA(2);

                    if ( (synpred11_InternalEditor()) ) {
                        alt24=1;
                    }


                    }
                    break;
                case 47:
                    {
                    int LA24_5 = input.LA(2);

                    if ( (synpred11_InternalEditor()) ) {
                        alt24=1;
                    }


                    }
                    break;

                }

                switch (alt24) {
            	case 1 :
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1761:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1761:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1761:3: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1766:6: ( () ( ( ruleOpMulti ) ) )
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1766:7: () ( ( ruleOpMulti ) )
            	    {
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1766:7: ()
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1767:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1772:2: ( ( ruleOpMulti ) )
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1773:1: ( ruleOpMulti )
            	    {
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1773:1: ( ruleOpMulti )
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1774:3: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression4132);
            	    ruleOpMulti();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1787:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1788:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1788:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1789:3: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression4155);
            	    lv_rightOperand_3_0=ruleXUnaryOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XUnaryOperation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
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
        }
        return current;
    }
    // $ANTLR end "ruleXMultiplicativeExpression"


    // $ANTLR start "entryRuleOpMulti"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1813:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1814:2: (iv_ruleOpMulti= ruleOpMulti EOF )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1815:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_ruleOpMulti_in_entryRuleOpMulti4194);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMulti4205); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpMulti"


    // $ANTLR start "ruleOpMulti"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1822:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1825:28: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1826:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1826:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            int alt25=4;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt25=1;
                }
                break;
            case 45:
                {
                alt25=2;
                }
                break;
            case 46:
                {
                alt25=3;
                }
                break;
            case 47:
                {
                alt25=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1827:2: kw= '*'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleOpMulti4243); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1834:2: kw= '**'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleOpMulti4262); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1841:2: kw= '/'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleOpMulti4281); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1848:2: kw= '%'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleOpMulti4300); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getPercentSignKeyword_3()); 
                          
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
    // $ANTLR end "ruleOpMulti"


    // $ANTLR start "entryRuleXUnaryOperation"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1861:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1862:2: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1863:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation4340);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnaryOperation4350); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXUnaryOperation"


    // $ANTLR start "ruleXUnaryOperation"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1870:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_XCastedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1873:28: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1874:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1874:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=42 && LA26_0<=43)||LA26_0==48) ) {
                alt26=1;
            }
            else if ( ((LA26_0>=RULE_ID && LA26_0<=RULE_DECIMAL)||LA26_0==18||LA26_0==35||LA26_0==54||LA26_0==56||LA26_0==60||LA26_0==62||(LA26_0>=65 && LA26_0<=68)||(LA26_0>=70 && LA26_0<=77)) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1874:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    {
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1874:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1874:3: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) )
                    {
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1874:3: ()
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1875:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1880:2: ( ( ruleOpUnary ) )
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1881:1: ( ruleOpUnary )
                    {
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1881:1: ( ruleOpUnary )
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1882:3: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXUnaryOperationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleXUnaryOperation4408);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1895:2: ( (lv_operand_2_0= ruleXCastedExpression ) )
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1896:1: (lv_operand_2_0= ruleXCastedExpression )
                    {
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1896:1: (lv_operand_2_0= ruleXCastedExpression )
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1897:3: lv_operand_2_0= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXCastedExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4429);
                    lv_operand_2_0=ruleXCastedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXUnaryOperationRule());
                      	        }
                             		set(
                             			current, 
                             			"operand",
                              		lv_operand_2_0, 
                              		"XCastedExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1915:5: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4458);
                    this_XCastedExpression_3=ruleXCastedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XCastedExpression_3; 
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
        }
        return current;
    }
    // $ANTLR end "ruleXUnaryOperation"


    // $ANTLR start "entryRuleOpUnary"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1931:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1932:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1933:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleOpUnary_in_entryRuleOpUnary4494);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpUnary4505); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpUnary"


    // $ANTLR start "ruleOpUnary"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1940:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1943:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1944:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1944:1: (kw= '!' | kw= '-' | kw= '+' )
            int alt27=3;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt27=1;
                }
                break;
            case 43:
                {
                alt27=2;
                }
                break;
            case 42:
                {
                alt27=3;
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
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1945:2: kw= '!'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleOpUnary4543); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1952:2: kw= '-'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleOpUnary4562); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1959:2: kw= '+'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleOpUnary4581); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getPlusSignKeyword_2()); 
                          
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
    // $ANTLR end "ruleOpUnary"


    // $ANTLR start "entryRuleXCastedExpression"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1972:1: entryRuleXCastedExpression returns [EObject current=null] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final EObject entryRuleXCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCastedExpression = null;


        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1973:2: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1974:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression4621);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCastedExpression4631); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXCastedExpression"


    // $ANTLR start "ruleXCastedExpression"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1981:1: ruleXCastedExpression returns [EObject current=null] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final EObject ruleXCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XMemberFeatureCall_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1984:28: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1985:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1985:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1986:5: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXCastedExpressionAccess().getXMemberFeatureCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression4678);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMemberFeatureCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1994:1: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==49) ) {
                    int LA28_2 = input.LA(2);

                    if ( (synpred12_InternalEditor()) ) {
                        alt28=1;
                    }


                }


                switch (alt28) {
            	case 1 :
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1994:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1994:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1994:3: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1996:5: ( () otherlv_2= 'as' )
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1996:6: () otherlv_2= 'as'
            	    {
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1996:6: ()
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1997:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,49,FOLLOW_49_in_ruleXCastedExpression4713); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2006:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2007:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2007:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2008:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXCastedExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression4736);
            	    lv_type_3_0=ruleJvmTypeReference();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXCastedExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"type",
            	              		lv_type_3_0, 
            	              		"JvmTypeReference");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
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
        }
        return current;
    }
    // $ANTLR end "ruleXCastedExpression"


    // $ANTLR start "entryRuleXMemberFeatureCall"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2032:1: entryRuleXMemberFeatureCall returns [EObject current=null] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final EObject entryRuleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMemberFeatureCall = null;


        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2033:2: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2034:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall4774);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMemberFeatureCall4784); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXMemberFeatureCall"


    // $ANTLR start "ruleXMemberFeatureCall"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2041:1: ruleXMemberFeatureCall returns [EObject current=null] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) ;
    public final EObject ruleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_7=null;
        Token lv_nullSafe_8_0=null;
        Token lv_spreading_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token lv_explicitOperationCall_16_0=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        EObject this_XPrimaryExpression_0 = null;

        EObject lv_value_5_0 = null;

        EObject lv_typeArguments_11_0 = null;

        EObject lv_typeArguments_13_0 = null;

        EObject lv_memberCallArguments_17_0 = null;

        EObject lv_memberCallArguments_18_0 = null;

        EObject lv_memberCallArguments_20_0 = null;

        EObject lv_memberCallArguments_22_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2044:28: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2045:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2045:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2046:5: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getXPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall4831);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XPrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2054:1: ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            loop36:
            do {
                int alt36=3;
                switch ( input.LA(1) ) {
                case 50:
                    {
                    int LA36_2 = input.LA(2);

                    if ( (synpred13_InternalEditor()) ) {
                        alt36=1;
                    }
                    else if ( (synpred14_InternalEditor()) ) {
                        alt36=2;
                    }


                    }
                    break;
                case 51:
                    {
                    int LA36_3 = input.LA(2);

                    if ( (synpred14_InternalEditor()) ) {
                        alt36=2;
                    }


                    }
                    break;
                case 52:
                    {
                    int LA36_4 = input.LA(2);

                    if ( (synpred14_InternalEditor()) ) {
                        alt36=2;
                    }


                    }
                    break;

                }

                switch (alt36) {
            	case 1 :
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2054:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    {
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2054:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2054:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) )
            	    {
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2054:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2054:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    {
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2060:25: ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2060:26: () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign
            	    {
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2060:26: ()
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2061:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,50,FOLLOW_50_in_ruleXMemberFeatureCall4880); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1());
            	          
            	    }
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2070:1: ( ( ruleValidID ) )
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2071:1: ( ruleValidID )
            	    {
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2071:1: ( ruleValidID )
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2072:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4903);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getOpSingleAssignParserRuleCall_1_0_0_0_3()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall4919);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2093:3: ( (lv_value_5_0= ruleXAssignment ) )
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2094:1: (lv_value_5_0= ruleXAssignment )
            	    {
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2094:1: (lv_value_5_0= ruleXAssignment )
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2095:3: lv_value_5_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getValueXAssignmentParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall4941);
            	    lv_value_5_0=ruleXAssignment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"value",
            	              		lv_value_5_0, 
            	              		"XAssignment");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2112:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    {
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2112:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2112:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    {
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2112:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) )
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2112:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    {
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2128:7: ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2128:8: () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    {
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2128:8: ()
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2129:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2134:2: (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    int alt29=3;
            	    switch ( input.LA(1) ) {
            	    case 50:
            	        {
            	        alt29=1;
            	        }
            	        break;
            	    case 51:
            	        {
            	        alt29=2;
            	        }
            	        break;
            	    case 52:
            	        {
            	        alt29=3;
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
            	            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2134:4: otherlv_7= '.'
            	            {
            	            otherlv_7=(Token)match(input,50,FOLLOW_50_in_ruleXMemberFeatureCall5027); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_7, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_1_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2139:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            {
            	            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2139:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2140:1: (lv_nullSafe_8_0= '?.' )
            	            {
            	            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2140:1: (lv_nullSafe_8_0= '?.' )
            	            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2141:3: lv_nullSafe_8_0= '?.'
            	            {
            	            lv_nullSafe_8_0=(Token)match(input,51,FOLLOW_51_in_ruleXMemberFeatureCall5051); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_nullSafe_8_0, grammarAccess.getXMemberFeatureCallAccess().getNullSafeQuestionMarkFullStopKeyword_1_1_0_0_1_1_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "nullSafe", true, "?.");
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;
            	        case 3 :
            	            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2155:6: ( (lv_spreading_9_0= '*.' ) )
            	            {
            	            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2155:6: ( (lv_spreading_9_0= '*.' ) )
            	            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2156:1: (lv_spreading_9_0= '*.' )
            	            {
            	            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2156:1: (lv_spreading_9_0= '*.' )
            	            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2157:3: lv_spreading_9_0= '*.'
            	            {
            	            lv_spreading_9_0=(Token)match(input,52,FOLLOW_52_in_ruleXMemberFeatureCall5088); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_spreading_9_0, grammarAccess.getXMemberFeatureCallAccess().getSpreadingAsteriskFullStopKeyword_1_1_0_0_1_2_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "spreading", true, "*.");
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2170:5: (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )?
            	    int alt31=2;
            	    int LA31_0 = input.LA(1);

            	    if ( (LA31_0==35) ) {
            	        alt31=1;
            	    }
            	    switch (alt31) {
            	        case 1 :
            	            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2170:7: otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>'
            	            {
            	            otherlv_10=(Token)match(input,35,FOLLOW_35_in_ruleXMemberFeatureCall5117); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_10, grammarAccess.getXMemberFeatureCallAccess().getLessThanSignKeyword_1_1_1_0());
            	                  
            	            }
            	            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2174:1: ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) )
            	            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2175:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            {
            	            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2175:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2176:3: lv_typeArguments_11_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall5138);
            	            lv_typeArguments_11_0=ruleJvmArgumentTypeReference();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"typeArguments",
            	                      		lv_typeArguments_11_0, 
            	                      		"JvmArgumentTypeReference");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }

            	            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2192:2: (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop30:
            	            do {
            	                int alt30=2;
            	                int LA30_0 = input.LA(1);

            	                if ( (LA30_0==53) ) {
            	                    alt30=1;
            	                }


            	                switch (alt30) {
            	            	case 1 :
            	            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2192:4: otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    otherlv_12=(Token)match(input,53,FOLLOW_53_in_ruleXMemberFeatureCall5151); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_12, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_1_2_0());
            	            	          
            	            	    }
            	            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2196:1: ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2197:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2197:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2198:3: lv_typeArguments_13_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_2_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall5172);
            	            	    lv_typeArguments_13_0=ruleJvmArgumentTypeReference();

            	            	    state._fsp--;
            	            	    if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	      	        if (current==null) {
            	            	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	            	      	        }
            	            	             		add(
            	            	             			current, 
            	            	             			"typeArguments",
            	            	              		lv_typeArguments_13_0, 
            	            	              		"JvmArgumentTypeReference");
            	            	      	        afterParserOrEnumRuleCall();
            	            	      	    
            	            	    }

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop30;
            	                }
            	            } while (true);

            	            otherlv_14=(Token)match(input,34,FOLLOW_34_in_ruleXMemberFeatureCall5186); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_14, grammarAccess.getXMemberFeatureCallAccess().getGreaterThanSignKeyword_1_1_1_3());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2218:3: ( ( ruleValidID ) )
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2219:1: ( ruleValidID )
            	    {
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2219:1: ( ruleValidID )
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2220:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall5211);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2233:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    int alt34=2;
            	    alt34 = dfa34.predict(input);
            	    switch (alt34) {
            	        case 1 :
            	            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2233:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')'
            	            {
            	            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2233:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) )
            	            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2233:4: ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' )
            	            {
            	            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2240:1: (lv_explicitOperationCall_16_0= '(' )
            	            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2241:3: lv_explicitOperationCall_16_0= '('
            	            {
            	            lv_explicitOperationCall_16_0=(Token)match(input,54,FOLLOW_54_in_ruleXMemberFeatureCall5245); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_explicitOperationCall_16_0, grammarAccess.getXMemberFeatureCallAccess().getExplicitOperationCallLeftParenthesisKeyword_1_1_3_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "explicitOperationCall", true, "(");
            	              	    
            	            }

            	            }


            	            }

            	            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2254:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?
            	            int alt33=3;
            	            alt33 = dfa33.predict(input);
            	            switch (alt33) {
            	                case 1 :
            	                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2254:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    {
            	                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2254:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2254:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    {
            	                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2271:1: (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2272:3: lv_memberCallArguments_17_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXShortClosureParserRuleCall_1_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall5330);
            	                    lv_memberCallArguments_17_0=ruleXShortClosure();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      	        if (current==null) {
            	                      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                      	        }
            	                             		add(
            	                             			current, 
            	                             			"memberCallArguments",
            	                              		lv_memberCallArguments_17_0, 
            	                              		"XShortClosure");
            	                      	        afterParserOrEnumRuleCall();
            	                      	    
            	                    }

            	                    }


            	                    }


            	                    }
            	                    break;
            	                case 2 :
            	                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2289:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    {
            	                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2289:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2289:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    {
            	                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2289:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) )
            	                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2290:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    {
            	                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2290:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2291:3: lv_memberCallArguments_18_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall5358);
            	                    lv_memberCallArguments_18_0=ruleXExpression();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      	        if (current==null) {
            	                      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                      	        }
            	                             		add(
            	                             			current, 
            	                             			"memberCallArguments",
            	                              		lv_memberCallArguments_18_0, 
            	                              		"XExpression");
            	                      	        afterParserOrEnumRuleCall();
            	                      	    
            	                    }

            	                    }


            	                    }

            	                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2307:2: (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    loop32:
            	                    do {
            	                        int alt32=2;
            	                        int LA32_0 = input.LA(1);

            	                        if ( (LA32_0==53) ) {
            	                            alt32=1;
            	                        }


            	                        switch (alt32) {
            	                    	case 1 :
            	                    	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2307:4: otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    {
            	                    	    otherlv_19=(Token)match(input,53,FOLLOW_53_in_ruleXMemberFeatureCall5371); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_19, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_3_1_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2311:1: ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2312:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    {
            	                    	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2312:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2313:3: lv_memberCallArguments_20_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall5392);
            	                    	    lv_memberCallArguments_20_0=ruleXExpression();

            	                    	    state._fsp--;
            	                    	    if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	      	        if (current==null) {
            	                    	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                    	      	        }
            	                    	             		add(
            	                    	             			current, 
            	                    	             			"memberCallArguments",
            	                    	              		lv_memberCallArguments_20_0, 
            	                    	              		"XExpression");
            	                    	      	        afterParserOrEnumRuleCall();
            	                    	      	    
            	                    	    }

            	                    	    }


            	                    	    }


            	                    	    }
            	                    	    break;

            	                    	default :
            	                    	    break loop32;
            	                        }
            	                    } while (true);


            	                    }


            	                    }
            	                    break;

            	            }

            	            otherlv_21=(Token)match(input,55,FOLLOW_55_in_ruleXMemberFeatureCall5409); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_21, grammarAccess.getXMemberFeatureCallAccess().getRightParenthesisKeyword_1_1_3_2());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2333:3: ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    int alt35=2;
            	    alt35 = dfa35.predict(input);
            	    switch (alt35) {
            	        case 1 :
            	            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2333:4: ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure )
            	            {
            	            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2336:1: (lv_memberCallArguments_22_0= ruleXClosure )
            	            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2337:3: lv_memberCallArguments_22_0= ruleXClosure
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXClosureParserRuleCall_1_1_4_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall5444);
            	            lv_memberCallArguments_22_0=ruleXClosure();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"memberCallArguments",
            	                      		lv_memberCallArguments_22_0, 
            	                      		"XClosure");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
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
        }
        return current;
    }
    // $ANTLR end "ruleXMemberFeatureCall"


    // $ANTLR start "entryRuleXPrimaryExpression"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2361:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2362:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2363:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression5484);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPrimaryExpression5494); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXPrimaryExpression"


    // $ANTLR start "ruleXPrimaryExpression"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2370:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) ;
    public final EObject ruleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XConstructorCall_0 = null;

        EObject this_XBlockExpression_1 = null;

        EObject this_XSwitchExpression_2 = null;

        EObject this_XFeatureCall_3 = null;

        EObject this_XLiteral_4 = null;

        EObject this_XIfExpression_5 = null;

        EObject this_XForLoopExpression_6 = null;

        EObject this_XWhileExpression_7 = null;

        EObject this_XDoWhileExpression_8 = null;

        EObject this_XThrowExpression_9 = null;

        EObject this_XReturnExpression_10 = null;

        EObject this_XTryCatchFinallyExpression_11 = null;

        EObject this_XParenthesizedExpression_12 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2373:28: ( (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2374:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2374:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            int alt37=13;
            alt37 = dfa37.predict(input);
            switch (alt37) {
                case 1 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2375:5: this_XConstructorCall_0= ruleXConstructorCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXConstructorCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression5541);
                    this_XConstructorCall_0=ruleXConstructorCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XConstructorCall_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2385:5: this_XBlockExpression_1= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXBlockExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression5568);
                    this_XBlockExpression_1=ruleXBlockExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XBlockExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2395:5: this_XSwitchExpression_2= ruleXSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSwitchExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression5595);
                    this_XSwitchExpression_2=ruleXSwitchExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XSwitchExpression_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2405:5: this_XFeatureCall_3= ruleXFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXFeatureCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression5622);
                    this_XFeatureCall_3=ruleXFeatureCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XFeatureCall_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2415:5: this_XLiteral_4= ruleXLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression5649);
                    this_XLiteral_4=ruleXLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XLiteral_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2425:5: this_XIfExpression_5= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIfExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression5676);
                    this_XIfExpression_5=ruleXIfExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XIfExpression_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2435:5: this_XForLoopExpression_6= ruleXForLoopExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXForLoopExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression5703);
                    this_XForLoopExpression_6=ruleXForLoopExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XForLoopExpression_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2445:5: this_XWhileExpression_7= ruleXWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXWhileExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression5730);
                    this_XWhileExpression_7=ruleXWhileExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XWhileExpression_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2455:5: this_XDoWhileExpression_8= ruleXDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXDoWhileExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression5757);
                    this_XDoWhileExpression_8=ruleXDoWhileExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XDoWhileExpression_8; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 10 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2465:5: this_XThrowExpression_9= ruleXThrowExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXThrowExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression5784);
                    this_XThrowExpression_9=ruleXThrowExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XThrowExpression_9; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 11 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2475:5: this_XReturnExpression_10= ruleXReturnExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXReturnExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression5811);
                    this_XReturnExpression_10=ruleXReturnExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XReturnExpression_10; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 12 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2485:5: this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTryCatchFinallyExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression5838);
                    this_XTryCatchFinallyExpression_11=ruleXTryCatchFinallyExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XTryCatchFinallyExpression_11; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 13 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2495:5: this_XParenthesizedExpression_12= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression5865);
                    this_XParenthesizedExpression_12=ruleXParenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XParenthesizedExpression_12; 
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
        }
        return current;
    }
    // $ANTLR end "ruleXPrimaryExpression"


    // $ANTLR start "entryRuleXLiteral"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2511:1: entryRuleXLiteral returns [EObject current=null] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final EObject entryRuleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXLiteral = null;


        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2512:2: (iv_ruleXLiteral= ruleXLiteral EOF )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2513:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXLiteral_in_entryRuleXLiteral5900);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXLiteral5910); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXLiteral"


    // $ANTLR start "ruleXLiteral"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2520:1: ruleXLiteral returns [EObject current=null] : ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) ;
    public final EObject ruleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_XClosure_0 = null;

        EObject this_XBooleanLiteral_1 = null;

        EObject this_XNumberLiteral_2 = null;

        EObject this_XNullLiteral_3 = null;

        EObject this_XStringLiteral_4 = null;

        EObject this_XTypeLiteral_5 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2523:28: ( ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2524:1: ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2524:1: ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            int alt38=6;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==56) && (synpred18_InternalEditor())) {
                alt38=1;
            }
            else if ( ((LA38_0>=71 && LA38_0<=72)) ) {
                alt38=2;
            }
            else if ( ((LA38_0>=RULE_HEX && LA38_0<=RULE_DECIMAL)) ) {
                alt38=3;
            }
            else if ( (LA38_0==73) ) {
                alt38=4;
            }
            else if ( (LA38_0==RULE_STRING) ) {
                alt38=5;
            }
            else if ( (LA38_0==74) ) {
                alt38=6;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2524:2: ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure )
                    {
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2524:2: ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure )
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2524:3: ( ( () '[' ) )=>this_XClosure_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXClosureParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXLiteral5970);
                    this_XClosure_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XClosure_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2537:5: this_XBooleanLiteral_1= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral5998);
                    this_XBooleanLiteral_1=ruleXBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XBooleanLiteral_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2547:5: this_XNumberLiteral_2= ruleXNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNumberLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNumberLiteral_in_ruleXLiteral6025);
                    this_XNumberLiteral_2=ruleXNumberLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XNumberLiteral_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2557:5: this_XNullLiteral_3= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNullLiteral_in_ruleXLiteral6052);
                    this_XNullLiteral_3=ruleXNullLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XNullLiteral_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2567:5: this_XStringLiteral_4= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStringLiteral_in_ruleXLiteral6079);
                    this_XStringLiteral_4=ruleXStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XStringLiteral_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2577:5: this_XTypeLiteral_5= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXTypeLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTypeLiteral_in_ruleXLiteral6106);
                    this_XTypeLiteral_5=ruleXTypeLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XTypeLiteral_5; 
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
        }
        return current;
    }
    // $ANTLR end "ruleXLiteral"


    // $ANTLR start "entryRuleXClosure"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2593:1: entryRuleXClosure returns [EObject current=null] : iv_ruleXClosure= ruleXClosure EOF ;
    public final EObject entryRuleXClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClosure = null;


        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2594:2: (iv_ruleXClosure= ruleXClosure EOF )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2595:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXClosure_in_entryRuleXClosure6141);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXClosure6151); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXClosure"


    // $ANTLR start "ruleXClosure"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2602:1: ruleXClosure returns [EObject current=null] : ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) ;
    public final EObject ruleXClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_explicitSyntax_5_0=null;
        Token otherlv_7=null;
        EObject lv_declaredFormalParameters_2_0 = null;

        EObject lv_declaredFormalParameters_4_0 = null;

        EObject lv_expression_6_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2605:28: ( ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2606:1: ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2606:1: ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2606:2: ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']'
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2606:2: ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2606:3: ( ( () '[' ) )=> ( () otherlv_1= '[' )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2608:5: ( () otherlv_1= '[' )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2608:6: () otherlv_1= '['
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2608:6: ()
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2609:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleXClosure6211); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXClosureAccess().getLeftSquareBracketKeyword_0_0_1());
                  
            }

            }


            }

            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2618:3: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?
            int alt41=2;
            alt41 = dfa41.predict(input);
            switch (alt41) {
                case 1 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2618:4: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    {
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2633:6: ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2633:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) )
                    {
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2633:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==RULE_ID||LA40_0==38||LA40_0==54) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2633:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            {
                            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2633:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) )
                            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2634:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            {
                            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2634:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2635:3: lv_declaredFormalParameters_2_0= ruleJvmFormalParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_1_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure6284);
                            lv_declaredFormalParameters_2_0=ruleJvmFormalParameter();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXClosureRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"declaredFormalParameters",
                                      		lv_declaredFormalParameters_2_0, 
                                      		"JvmFormalParameter");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2651:2: (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            loop39:
                            do {
                                int alt39=2;
                                int LA39_0 = input.LA(1);

                                if ( (LA39_0==53) ) {
                                    alt39=1;
                                }


                                switch (alt39) {
                            	case 1 :
                            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2651:4: otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    {
                            	    otherlv_3=(Token)match(input,53,FOLLOW_53_in_ruleXClosure6297); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_3, grammarAccess.getXClosureAccess().getCommaKeyword_1_0_0_1_0());
                            	          
                            	    }
                            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2655:1: ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2656:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    {
                            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2656:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2657:3: lv_declaredFormalParameters_4_0= ruleJvmFormalParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_1_0_0_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure6318);
                            	    lv_declaredFormalParameters_4_0=ruleJvmFormalParameter();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXClosureRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"declaredFormalParameters",
                            	              		lv_declaredFormalParameters_4_0, 
                            	              		"JvmFormalParameter");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
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
                            break;

                    }

                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2673:6: ( (lv_explicitSyntax_5_0= '|' ) )
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2674:1: (lv_explicitSyntax_5_0= '|' )
                    {
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2674:1: (lv_explicitSyntax_5_0= '|' )
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2675:3: lv_explicitSyntax_5_0= '|'
                    {
                    lv_explicitSyntax_5_0=(Token)match(input,57,FOLLOW_57_in_ruleXClosure6340); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_explicitSyntax_5_0, grammarAccess.getXClosureAccess().getExplicitSyntaxVerticalLineKeyword_1_0_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXClosureRule());
                      	        }
                             		setWithLastConsumed(current, "explicitSyntax", true, "|");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2688:5: ( (lv_expression_6_0= ruleXExpressionInClosure ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2689:1: (lv_expression_6_0= ruleXExpressionInClosure )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2689:1: (lv_expression_6_0= ruleXExpressionInClosure )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2690:3: lv_expression_6_0= ruleXExpressionInClosure
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXClosureAccess().getExpressionXExpressionInClosureParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_ruleXClosure6377);
            lv_expression_6_0=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXClosureRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_6_0, 
                      		"XExpressionInClosure");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,58,FOLLOW_58_in_ruleXClosure6389); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getXClosureAccess().getRightSquareBracketKeyword_3());
                  
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
    // $ANTLR end "ruleXClosure"


    // $ANTLR start "entryRuleXExpressionInClosure"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2718:1: entryRuleXExpressionInClosure returns [EObject current=null] : iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF ;
    public final EObject entryRuleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInClosure = null;


        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2719:2: (iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2720:2: iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure6425);
            iv_ruleXExpressionInClosure=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInClosure6435); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXExpressionInClosure"


    // $ANTLR start "ruleXExpressionInClosure"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2727:1: ruleXExpressionInClosure returns [EObject current=null] : ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) ;
    public final EObject ruleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expressions_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2730:28: ( ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2731:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2731:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2731:2: () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2731:2: ()
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2732:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXExpressionInClosureAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2737:2: ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>=RULE_ID && LA43_0<=RULE_DECIMAL)||LA43_0==18||LA43_0==20||LA43_0==23||LA43_0==35||(LA43_0>=42 && LA43_0<=43)||LA43_0==48||LA43_0==54||LA43_0==56||LA43_0==60||LA43_0==62||(LA43_0>=65 && LA43_0<=68)||(LA43_0>=70 && LA43_0<=77)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2737:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )?
            	    {
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2737:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) )
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2738:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2738:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2739:3: lv_expressions_1_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpressionInClosureAccess().getExpressionsXExpressionInsideBlockParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure6491);
            	    lv_expressions_1_0=ruleXExpressionInsideBlock();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXExpressionInClosureRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_1_0, 
            	              		"XExpressionInsideBlock");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2755:2: (otherlv_2= ';' )?
            	    int alt42=2;
            	    int LA42_0 = input.LA(1);

            	    if ( (LA42_0==59) ) {
            	        alt42=1;
            	    }
            	    switch (alt42) {
            	        case 1 :
            	            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2755:4: otherlv_2= ';'
            	            {
            	            otherlv_2=(Token)match(input,59,FOLLOW_59_in_ruleXExpressionInClosure6504); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getXExpressionInClosureAccess().getSemicolonKeyword_1_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
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
        }
        return current;
    }
    // $ANTLR end "ruleXExpressionInClosure"


    // $ANTLR start "entryRuleXShortClosure"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2767:1: entryRuleXShortClosure returns [EObject current=null] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final EObject entryRuleXShortClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXShortClosure = null;


        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2768:2: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2769:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXShortClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure6544);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXShortClosure6554); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXShortClosure"


    // $ANTLR start "ruleXShortClosure"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2776:1: ruleXShortClosure returns [EObject current=null] : ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXShortClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_explicitSyntax_4_0=null;
        EObject lv_declaredFormalParameters_1_0 = null;

        EObject lv_declaredFormalParameters_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2779:28: ( ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2780:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2780:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2780:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2780:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2780:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2796:6: ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2796:7: () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2796:7: ()
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2797:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXShortClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2802:2: ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_ID||LA45_0==38||LA45_0==54) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2802:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2802:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) )
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2803:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2803:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2804:3: lv_declaredFormalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6662);
                    lv_declaredFormalParameters_1_0=ruleJvmFormalParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
                      	        }
                             		add(
                             			current, 
                             			"declaredFormalParameters",
                              		lv_declaredFormalParameters_1_0, 
                              		"JvmFormalParameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2820:2: (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==53) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2820:4: otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,53,FOLLOW_53_in_ruleXShortClosure6675); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXShortClosureAccess().getCommaKeyword_0_0_1_1_0());
                    	          
                    	    }
                    	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2824:1: ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2825:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2825:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2826:3: lv_declaredFormalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6696);
                    	    lv_declaredFormalParameters_3_0=ruleJvmFormalParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"declaredFormalParameters",
                    	              		lv_declaredFormalParameters_3_0, 
                    	              		"JvmFormalParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2842:6: ( (lv_explicitSyntax_4_0= '|' ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2843:1: (lv_explicitSyntax_4_0= '|' )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2843:1: (lv_explicitSyntax_4_0= '|' )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2844:3: lv_explicitSyntax_4_0= '|'
            {
            lv_explicitSyntax_4_0=(Token)match(input,57,FOLLOW_57_in_ruleXShortClosure6718); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_explicitSyntax_4_0, grammarAccess.getXShortClosureAccess().getExplicitSyntaxVerticalLineKeyword_0_0_2_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXShortClosureRule());
              	        }
                     		setWithLastConsumed(current, "explicitSyntax", true, "|");
              	    
            }

            }


            }


            }


            }

            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2857:4: ( (lv_expression_5_0= ruleXExpression ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2858:1: (lv_expression_5_0= ruleXExpression )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2858:1: (lv_expression_5_0= ruleXExpression )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2859:3: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXShortClosureAccess().getExpressionXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXShortClosure6754);
            lv_expression_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

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
        }
        return current;
    }
    // $ANTLR end "ruleXShortClosure"


    // $ANTLR start "entryRuleXParenthesizedExpression"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2883:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2884:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2885:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression6790);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression6800); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXParenthesizedExpression"


    // $ANTLR start "ruleXParenthesizedExpression"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2892:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2895:28: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2896:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2896:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2896:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_54_in_ruleXParenthesizedExpression6837); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression6859);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,55,FOLLOW_55_in_ruleXParenthesizedExpression6870); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXParenthesizedExpressionAccess().getRightParenthesisKeyword_2());
                  
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
    // $ANTLR end "ruleXParenthesizedExpression"


    // $ANTLR start "entryRuleXIfExpression"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2921:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2922:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2923:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression6906);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression6916); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXIfExpression"


    // $ANTLR start "ruleXIfExpression"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2930:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleXIfExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_if_3_0 = null;

        EObject lv_then_5_0 = null;

        EObject lv_else_7_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2933:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2934:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2934:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2934:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2934:2: ()
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2935:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,60,FOLLOW_60_in_ruleXIfExpression6962); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,54,FOLLOW_54_in_ruleXIfExpression6974); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2948:1: ( (lv_if_3_0= ruleXExpression ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2949:1: (lv_if_3_0= ruleXExpression )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2949:1: (lv_if_3_0= ruleXExpression )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2950:3: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6995);
            lv_if_3_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"if",
                      		lv_if_3_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,55,FOLLOW_55_in_ruleXIfExpression7007); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2970:1: ( (lv_then_5_0= ruleXExpression ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2971:1: (lv_then_5_0= ruleXExpression )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2971:1: (lv_then_5_0= ruleXExpression )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2972:3: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression7028);
            lv_then_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"then",
                      		lv_then_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2988:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==61) ) {
                int LA46_1 = input.LA(2);

                if ( (synpred22_InternalEditor()) ) {
                    alt46=1;
                }
            }
            switch (alt46) {
                case 1 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2988:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2988:3: ( ( 'else' )=>otherlv_6= 'else' )
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2988:4: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,61,FOLLOW_61_in_ruleXIfExpression7049); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                          
                    }

                    }

                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2993:2: ( (lv_else_7_0= ruleXExpression ) )
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2994:1: (lv_else_7_0= ruleXExpression )
                    {
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2994:1: (lv_else_7_0= ruleXExpression )
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2995:3: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression7071);
                    lv_else_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"else",
                              		lv_else_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

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
        }
        return current;
    }
    // $ANTLR end "ruleXIfExpression"


    // $ANTLR start "entryRuleXSwitchExpression"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3019:1: entryRuleXSwitchExpression returns [EObject current=null] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final EObject entryRuleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSwitchExpression = null;


        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3020:2: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3021:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression7109);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSwitchExpression7119); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXSwitchExpression"


    // $ANTLR start "ruleXSwitchExpression"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3028:1: ruleXSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) ;
    public final EObject ruleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_localVarName_2_0 = null;

        EObject lv_switch_4_0 = null;

        AntlrDatatypeRuleToken lv_localVarName_6_0 = null;

        EObject lv_switch_8_0 = null;

        EObject lv_cases_11_0 = null;

        EObject lv_default_14_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3031:28: ( ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3032:1: ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3032:1: ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3032:2: () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}'
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3032:2: ()
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3033:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSwitchExpressionAccess().getXSwitchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,62,FOLLOW_62_in_ruleXSwitchExpression7165); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3042:1: ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=RULE_ID && LA48_0<=RULE_DECIMAL)||LA48_0==18||LA48_0==35||(LA48_0>=42 && LA48_0<=43)||LA48_0==48||LA48_0==56||LA48_0==60||LA48_0==62||(LA48_0>=65 && LA48_0<=68)||(LA48_0>=70 && LA48_0<=77)) ) {
                alt48=1;
            }
            else if ( (LA48_0==54) ) {
                int LA48_2 = input.LA(2);

                if ( (LA48_2==RULE_ID) ) {
                    int LA48_3 = input.LA(3);

                    if ( (LA48_3==22||(LA48_3>=26 && LA48_3<=47)||(LA48_3>=49 && LA48_3<=52)||(LA48_3>=54 && LA48_3<=56)||LA48_3==69) ) {
                        alt48=1;
                    }
                    else if ( (LA48_3==21) && (synpred24_InternalEditor())) {
                        alt48=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 48, 3, input);

                        throw nvae;
                    }
                }
                else if ( ((LA48_2>=RULE_STRING && LA48_2<=RULE_DECIMAL)||LA48_2==18||LA48_2==35||(LA48_2>=42 && LA48_2<=43)||LA48_2==48||LA48_2==54||LA48_2==56||LA48_2==60||LA48_2==62||(LA48_2>=65 && LA48_2<=68)||(LA48_2>=70 && LA48_2<=77)) ) {
                    alt48=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 48, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3042:2: ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) )
                    {
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3042:2: ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) )
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3042:3: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) )
                    {
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3042:3: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==RULE_ID) ) {
                        int LA47_1 = input.LA(2);

                        if ( (LA47_1==21) && (synpred23_InternalEditor())) {
                            alt47=1;
                        }
                    }
                    switch (alt47) {
                        case 1 :
                            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3042:4: ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                            {
                            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3047:5: ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3047:6: ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':'
                            {
                            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3047:6: ( (lv_localVarName_2_0= ruleValidID ) )
                            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3048:1: (lv_localVarName_2_0= ruleValidID )
                            {
                            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3048:1: (lv_localVarName_2_0= ruleValidID )
                            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3049:3: lv_localVarName_2_0= ruleValidID
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_0_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression7208);
                            lv_localVarName_2_0=ruleValidID();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"localVarName",
                                      		lv_localVarName_2_0, 
                                      		"ValidID");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleXSwitchExpression7220); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_0_0_0_1());
                                  
                            }

                            }


                            }
                            break;

                    }

                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3069:4: ( (lv_switch_4_0= ruleXExpression ) )
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3070:1: (lv_switch_4_0= ruleXExpression )
                    {
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3070:1: (lv_switch_4_0= ruleXExpression )
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3071:3: lv_switch_4_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression7244);
                    lv_switch_4_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"switch",
                              		lv_switch_4_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3088:6: ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' )
                    {
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3088:6: ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' )
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3088:7: ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')'
                    {
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3088:7: ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) )
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3088:8: ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' )
                    {
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3094:5: (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' )
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3094:7: otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':'
                    {
                    otherlv_5=(Token)match(input,54,FOLLOW_54_in_ruleXSwitchExpression7288); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getXSwitchExpressionAccess().getLeftParenthesisKeyword_2_1_0_0_0());
                          
                    }
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3098:1: ( (lv_localVarName_6_0= ruleValidID ) )
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3099:1: (lv_localVarName_6_0= ruleValidID )
                    {
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3099:1: (lv_localVarName_6_0= ruleValidID )
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3100:3: lv_localVarName_6_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_1_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression7309);
                    lv_localVarName_6_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"localVarName",
                              		lv_localVarName_6_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleXSwitchExpression7321); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_1_0_0_2());
                          
                    }

                    }


                    }

                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3120:3: ( (lv_switch_8_0= ruleXExpression ) )
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3121:1: (lv_switch_8_0= ruleXExpression )
                    {
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3121:1: (lv_switch_8_0= ruleXExpression )
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3122:3: lv_switch_8_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression7344);
                    lv_switch_8_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"switch",
                              		lv_switch_8_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,55,FOLLOW_55_in_ruleXSwitchExpression7356); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getXSwitchExpressionAccess().getRightParenthesisKeyword_2_1_2());
                          
                    }

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,18,FOLLOW_18_in_ruleXSwitchExpression7370); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getXSwitchExpressionAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3146:1: ( (lv_cases_11_0= ruleXCasePart ) )+
            int cnt49=0;
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==RULE_ID||LA49_0==21||LA49_0==38||LA49_0==54||LA49_0==64) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3147:1: (lv_cases_11_0= ruleXCasePart )
            	    {
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3147:1: (lv_cases_11_0= ruleXCasePart )
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3148:3: lv_cases_11_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getCasesXCasePartParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXCasePart_in_ruleXSwitchExpression7391);
            	    lv_cases_11_0=ruleXCasePart();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"cases",
            	              		lv_cases_11_0, 
            	              		"XCasePart");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt49 >= 1 ) break loop49;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(49, input);
                        throw eee;
                }
                cnt49++;
            } while (true);

            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3164:3: (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==63) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3164:5: otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) )
                    {
                    otherlv_12=(Token)match(input,63,FOLLOW_63_in_ruleXSwitchExpression7405); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_5_0());
                          
                    }
                    otherlv_13=(Token)match(input,21,FOLLOW_21_in_ruleXSwitchExpression7417); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_5_1());
                          
                    }
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3172:1: ( (lv_default_14_0= ruleXExpression ) )
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3173:1: (lv_default_14_0= ruleXExpression )
                    {
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3173:1: (lv_default_14_0= ruleXExpression )
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3174:3: lv_default_14_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDefaultXExpressionParserRuleCall_5_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression7438);
                    lv_default_14_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"default",
                              		lv_default_14_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,19,FOLLOW_19_in_ruleXSwitchExpression7452); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_15, grammarAccess.getXSwitchExpressionAccess().getRightCurlyBracketKeyword_6());
                  
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
    // $ANTLR end "ruleXSwitchExpression"


    // $ANTLR start "entryRuleXCasePart"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3202:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3203:2: (iv_ruleXCasePart= ruleXCasePart EOF )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3204:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FOLLOW_ruleXCasePart_in_entryRuleXCasePart7488);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCasePart7498); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXCasePart"


    // $ANTLR start "ruleXCasePart"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3211:1: ruleXCasePart returns [EObject current=null] : ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeGuard_0_0 = null;

        EObject lv_case_2_0 = null;

        EObject lv_then_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3214:28: ( ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3215:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3215:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3215:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3215:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_ID||LA51_0==38||LA51_0==54) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3216:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    {
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3216:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3217:3: lv_typeGuard_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getTypeGuardJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCasePart7544);
                    lv_typeGuard_0_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
                      	        }
                             		set(
                             			current, 
                             			"typeGuard",
                              		lv_typeGuard_0_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3233:3: (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==64) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3233:5: otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) )
                    {
                    otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleXCasePart7558); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXCasePartAccess().getCaseKeyword_1_0());
                          
                    }
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3237:1: ( (lv_case_2_0= ruleXExpression ) )
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3238:1: (lv_case_2_0= ruleXExpression )
                    {
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3238:1: (lv_case_2_0= ruleXExpression )
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3239:3: lv_case_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart7579);
                    lv_case_2_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
                      	        }
                             		set(
                             			current, 
                             			"case",
                              		lv_case_2_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleXCasePart7593); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCasePartAccess().getColonKeyword_2());
                  
            }
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3259:1: ( (lv_then_4_0= ruleXExpression ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3260:1: (lv_then_4_0= ruleXExpression )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3260:1: (lv_then_4_0= ruleXExpression )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3261:3: lv_then_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart7614);
            lv_then_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
              	        }
                     		set(
                     			current, 
                     			"then",
                      		lv_then_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

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
        }
        return current;
    }
    // $ANTLR end "ruleXCasePart"


    // $ANTLR start "entryRuleXForLoopExpression"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3285:1: entryRuleXForLoopExpression returns [EObject current=null] : iv_ruleXForLoopExpression= ruleXForLoopExpression EOF ;
    public final EObject entryRuleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXForLoopExpression = null;


        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3286:2: (iv_ruleXForLoopExpression= ruleXForLoopExpression EOF )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3287:2: iv_ruleXForLoopExpression= ruleXForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression7650);
            iv_ruleXForLoopExpression=ruleXForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForLoopExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXForLoopExpression7660); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXForLoopExpression"


    // $ANTLR start "ruleXForLoopExpression"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3294:1: ruleXForLoopExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) ;
    public final EObject ruleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_declaredParam_3_0 = null;

        EObject lv_forExpression_5_0 = null;

        EObject lv_eachExpression_7_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3297:28: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3298:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3298:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3298:2: () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3298:2: ()
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3299:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXForLoopExpressionAccess().getXForLoopExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,65,FOLLOW_65_in_ruleXForLoopExpression7706); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXForLoopExpressionAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,54,FOLLOW_54_in_ruleXForLoopExpression7718); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXForLoopExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3312:1: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3313:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3313:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3314:3: lv_declaredParam_3_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression7739);
            lv_declaredParam_3_0=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"declaredParam",
                      		lv_declaredParam_3_0, 
                      		"JvmFormalParameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleXForLoopExpression7751); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXForLoopExpressionAccess().getColonKeyword_4());
                  
            }
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3334:1: ( (lv_forExpression_5_0= ruleXExpression ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3335:1: (lv_forExpression_5_0= ruleXExpression )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3335:1: (lv_forExpression_5_0= ruleXExpression )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3336:3: lv_forExpression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getForExpressionXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression7772);
            lv_forExpression_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"forExpression",
                      		lv_forExpression_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,55,FOLLOW_55_in_ruleXForLoopExpression7784); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXForLoopExpressionAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3356:1: ( (lv_eachExpression_7_0= ruleXExpression ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3357:1: (lv_eachExpression_7_0= ruleXExpression )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3357:1: (lv_eachExpression_7_0= ruleXExpression )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3358:3: lv_eachExpression_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression7805);
            lv_eachExpression_7_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"eachExpression",
                      		lv_eachExpression_7_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

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
        }
        return current;
    }
    // $ANTLR end "ruleXForLoopExpression"


    // $ANTLR start "entryRuleXWhileExpression"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3382:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3383:2: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3384:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression7841);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXWhileExpression7851); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXWhileExpression"


    // $ANTLR start "ruleXWhileExpression"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3391:1: ruleXWhileExpression returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3394:28: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3395:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3395:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3395:2: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3395:2: ()
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3396:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXWhileExpressionAccess().getXWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,66,FOLLOW_66_in_ruleXWhileExpression7897); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,54,FOLLOW_54_in_ruleXWhileExpression7909); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3409:1: ( (lv_predicate_3_0= ruleXExpression ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3410:1: (lv_predicate_3_0= ruleXExpression )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3410:1: (lv_predicate_3_0= ruleXExpression )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3411:3: lv_predicate_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getPredicateXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression7930);
            lv_predicate_3_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"predicate",
                      		lv_predicate_3_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,55,FOLLOW_55_in_ruleXWhileExpression7942); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3431:1: ( (lv_body_5_0= ruleXExpression ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3432:1: (lv_body_5_0= ruleXExpression )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3432:1: (lv_body_5_0= ruleXExpression )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3433:3: lv_body_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getBodyXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression7963);
            lv_body_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

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
        }
        return current;
    }
    // $ANTLR end "ruleXWhileExpression"


    // $ANTLR start "entryRuleXDoWhileExpression"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3457:1: entryRuleXDoWhileExpression returns [EObject current=null] : iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF ;
    public final EObject entryRuleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDoWhileExpression = null;


        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3458:2: (iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3459:2: iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXDoWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression7999);
            iv_ruleXDoWhileExpression=ruleXDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDoWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDoWhileExpression8009); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXDoWhileExpression"


    // $ANTLR start "ruleXDoWhileExpression"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3466:1: ruleXDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) ;
    public final EObject ruleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_body_2_0 = null;

        EObject lv_predicate_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3469:28: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3470:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3470:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3470:2: () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')'
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3470:2: ()
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3471:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXDoWhileExpressionAccess().getXDoWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,67,FOLLOW_67_in_ruleXDoWhileExpression8055); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXDoWhileExpressionAccess().getDoKeyword_1());
                  
            }
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3480:1: ( (lv_body_2_0= ruleXExpression ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3481:1: (lv_body_2_0= ruleXExpression )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3481:1: (lv_body_2_0= ruleXExpression )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3482:3: lv_body_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getBodyXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression8076);
            lv_body_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXDoWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,66,FOLLOW_66_in_ruleXDoWhileExpression8088); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXDoWhileExpressionAccess().getWhileKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,54,FOLLOW_54_in_ruleXDoWhileExpression8100); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXDoWhileExpressionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3506:1: ( (lv_predicate_5_0= ruleXExpression ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3507:1: (lv_predicate_5_0= ruleXExpression )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3507:1: (lv_predicate_5_0= ruleXExpression )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3508:3: lv_predicate_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getPredicateXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression8121);
            lv_predicate_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXDoWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"predicate",
                      		lv_predicate_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,55,FOLLOW_55_in_ruleXDoWhileExpression8133); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXDoWhileExpressionAccess().getRightParenthesisKeyword_6());
                  
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
    // $ANTLR end "ruleXDoWhileExpression"


    // $ANTLR start "entryRuleXBlockExpression"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3536:1: entryRuleXBlockExpression returns [EObject current=null] : iv_ruleXBlockExpression= ruleXBlockExpression EOF ;
    public final EObject entryRuleXBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBlockExpression = null;


        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3537:2: (iv_ruleXBlockExpression= ruleXBlockExpression EOF )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3538:2: iv_ruleXBlockExpression= ruleXBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression8169);
            iv_ruleXBlockExpression=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBlockExpression8179); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXBlockExpression"


    // $ANTLR start "ruleXBlockExpression"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3545:1: ruleXBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleXBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3548:28: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3549:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3549:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3549:2: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3549:2: ()
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3550:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBlockExpressionAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleXBlockExpression8225); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3559:1: ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( ((LA54_0>=RULE_ID && LA54_0<=RULE_DECIMAL)||LA54_0==18||LA54_0==20||LA54_0==23||LA54_0==35||(LA54_0>=42 && LA54_0<=43)||LA54_0==48||LA54_0==54||LA54_0==56||LA54_0==60||LA54_0==62||(LA54_0>=65 && LA54_0<=68)||(LA54_0>=70 && LA54_0<=77)) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3559:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )?
            	    {
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3559:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) )
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3560:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3560:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3561:3: lv_expressions_2_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXBlockExpressionAccess().getExpressionsXExpressionInsideBlockParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression8247);
            	    lv_expressions_2_0=ruleXExpressionInsideBlock();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXBlockExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_2_0, 
            	              		"XExpressionInsideBlock");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3577:2: (otherlv_3= ';' )?
            	    int alt53=2;
            	    int LA53_0 = input.LA(1);

            	    if ( (LA53_0==59) ) {
            	        alt53=1;
            	    }
            	    switch (alt53) {
            	        case 1 :
            	            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3577:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,59,FOLLOW_59_in_ruleXBlockExpression8260); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getXBlockExpressionAccess().getSemicolonKeyword_2_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleXBlockExpression8276); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXBlockExpressionAccess().getRightCurlyBracketKeyword_3());
                  
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
    // $ANTLR end "ruleXBlockExpression"


    // $ANTLR start "entryRuleXExpressionInsideBlock"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3593:1: entryRuleXExpressionInsideBlock returns [EObject current=null] : iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF ;
    public final EObject entryRuleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInsideBlock = null;


        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3594:2: (iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3595:2: iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInsideBlockRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock8312);
            iv_ruleXExpressionInsideBlock=ruleXExpressionInsideBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInsideBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInsideBlock8322); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXExpressionInsideBlock"


    // $ANTLR start "ruleXExpressionInsideBlock"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3602:1: ruleXExpressionInsideBlock returns [EObject current=null] : (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) ;
    public final EObject ruleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableDeclaration_0 = null;

        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3605:28: ( (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3606:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3606:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==20||LA55_0==23) ) {
                alt55=1;
            }
            else if ( ((LA55_0>=RULE_ID && LA55_0<=RULE_DECIMAL)||LA55_0==18||LA55_0==35||(LA55_0>=42 && LA55_0<=43)||LA55_0==48||LA55_0==54||LA55_0==56||LA55_0==60||LA55_0==62||(LA55_0>=65 && LA55_0<=68)||(LA55_0>=70 && LA55_0<=77)) ) {
                alt55=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3607:5: this_XVariableDeclaration_0= ruleXVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock8369);
                    this_XVariableDeclaration_0=ruleXVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XVariableDeclaration_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3617:5: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock8396);
                    this_XExpression_1=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XExpression_1; 
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
        }
        return current;
    }
    // $ANTLR end "ruleXExpressionInsideBlock"


    // $ANTLR start "entryRuleXVariableDeclaration"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3633:1: entryRuleXVariableDeclaration returns [EObject current=null] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final EObject entryRuleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableDeclaration = null;


        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3634:2: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3635:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration8431);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXVariableDeclaration8441); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXVariableDeclaration"


    // $ANTLR start "ruleXVariableDeclaration"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3642:1: ruleXVariableDeclaration returns [EObject current=null] : ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_writeable_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_type_3_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_name_5_0 = null;

        EObject lv_right_7_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3645:28: ( ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3646:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3646:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3646:2: () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3646:2: ()
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3647:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXVariableDeclarationAccess().getXVariableDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3652:2: ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==20) ) {
                alt56=1;
            }
            else if ( (LA56_0==23) ) {
                alt56=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3652:3: ( (lv_writeable_1_0= 'var' ) )
                    {
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3652:3: ( (lv_writeable_1_0= 'var' ) )
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3653:1: (lv_writeable_1_0= 'var' )
                    {
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3653:1: (lv_writeable_1_0= 'var' )
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3654:3: lv_writeable_1_0= 'var'
                    {
                    lv_writeable_1_0=(Token)match(input,20,FOLLOW_20_in_ruleXVariableDeclaration8494); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_writeable_1_0, grammarAccess.getXVariableDeclarationAccess().getWriteableVarKeyword_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		setWithLastConsumed(current, "writeable", true, "var");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3668:7: otherlv_2= 'val'
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleXVariableDeclaration8525); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXVariableDeclarationAccess().getValKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3672:2: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_ID) ) {
                int LA57_1 = input.LA(2);

                if ( (synpred25_InternalEditor()) ) {
                    alt57=1;
                }
                else if ( (true) ) {
                    alt57=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 57, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA57_0==54) && (synpred25_InternalEditor())) {
                alt57=1;
            }
            else if ( (LA57_0==38) && (synpred25_InternalEditor())) {
                alt57=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3672:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    {
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3672:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3672:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    {
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3680:6: ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3680:7: ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) )
                    {
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3680:7: ( (lv_type_3_0= ruleJvmTypeReference ) )
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3681:1: (lv_type_3_0= ruleJvmTypeReference )
                    {
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3681:1: (lv_type_3_0= ruleJvmTypeReference )
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3682:3: lv_type_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration8573);
                    lv_type_3_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_3_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3698:2: ( (lv_name_4_0= ruleValidID ) )
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3699:1: (lv_name_4_0= ruleValidID )
                    {
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3699:1: (lv_name_4_0= ruleValidID )
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3700:3: lv_name_4_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration8594);
                    lv_name_4_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_4_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3717:6: ( (lv_name_5_0= ruleValidID ) )
                    {
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3717:6: ( (lv_name_5_0= ruleValidID ) )
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3718:1: (lv_name_5_0= ruleValidID )
                    {
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3718:1: (lv_name_5_0= ruleValidID )
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3719:3: lv_name_5_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration8623);
                    lv_name_5_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_5_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3735:3: (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==22) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3735:5: otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,22,FOLLOW_22_in_ruleXVariableDeclaration8637); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3739:1: ( (lv_right_7_0= ruleXExpression ) )
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3740:1: (lv_right_7_0= ruleXExpression )
                    {
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3740:1: (lv_right_7_0= ruleXExpression )
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3741:3: lv_right_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getRightXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXVariableDeclaration8658);
                    lv_right_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

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
        }
        return current;
    }
    // $ANTLR end "ruleXVariableDeclaration"


    // $ANTLR start "entryRuleJvmFormalParameter"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3765:1: entryRuleJvmFormalParameter returns [EObject current=null] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final EObject entryRuleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmFormalParameter = null;


        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3766:2: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3767:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter8696);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmFormalParameter8706); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmFormalParameter"


    // $ANTLR start "ruleJvmFormalParameter"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3774:1: ruleJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3777:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3778:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3778:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3778:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3778:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_ID) ) {
                int LA59_1 = input.LA(2);

                if ( (LA59_1==RULE_ID||LA59_1==35||LA59_1==50||LA59_1==56) ) {
                    alt59=1;
                }
            }
            else if ( (LA59_0==38||LA59_0==54) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3779:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3779:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3780:3: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter8752);
                    lv_parameterType_0_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmFormalParameterRule());
                      	        }
                             		set(
                             			current, 
                             			"parameterType",
                              		lv_parameterType_0_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3796:3: ( (lv_name_1_0= ruleValidID ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3797:1: (lv_name_1_0= ruleValidID )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3797:1: (lv_name_1_0= ruleValidID )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3798:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleJvmFormalParameter8774);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmFormalParameterRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

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
        }
        return current;
    }
    // $ANTLR end "ruleJvmFormalParameter"


    // $ANTLR start "entryRuleFullJvmFormalParameter"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3822:1: entryRuleFullJvmFormalParameter returns [EObject current=null] : iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF ;
    public final EObject entryRuleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFullJvmFormalParameter = null;


        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3823:2: (iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3824:2: iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFullJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter8810);
            iv_ruleFullJvmFormalParameter=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFullJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFullJvmFormalParameter8820); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFullJvmFormalParameter"


    // $ANTLR start "ruleFullJvmFormalParameter"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3831:1: ruleFullJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3834:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3835:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3835:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3835:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3835:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3836:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3836:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3837:3: lv_parameterType_0_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter8866);
            lv_parameterType_0_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFullJvmFormalParameterRule());
              	        }
                     		set(
                     			current, 
                     			"parameterType",
                      		lv_parameterType_0_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3853:2: ( (lv_name_1_0= ruleValidID ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3854:1: (lv_name_1_0= ruleValidID )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3854:1: (lv_name_1_0= ruleValidID )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3855:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter8887);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFullJvmFormalParameterRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

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
        }
        return current;
    }
    // $ANTLR end "ruleFullJvmFormalParameter"


    // $ANTLR start "entryRuleXFeatureCall"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3879:1: entryRuleXFeatureCall returns [EObject current=null] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final EObject entryRuleXFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFeatureCall = null;


        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3880:2: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3881:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall8923);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFeatureCall8933); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXFeatureCall"


    // $ANTLR start "ruleXFeatureCall"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3888:1: ruleXFeatureCall returns [EObject current=null] : ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) ;
    public final EObject ruleXFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_explicitOperationCall_8_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_typeArguments_3_0 = null;

        EObject lv_typeArguments_5_0 = null;

        EObject lv_featureCallArguments_9_0 = null;

        EObject lv_featureCallArguments_10_0 = null;

        EObject lv_featureCallArguments_12_0 = null;

        EObject lv_featureCallArguments_14_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3891:28: ( ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3892:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3892:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3892:2: () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3892:2: ()
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3893:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXFeatureCallAccess().getXFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3898:2: ( ( ruleStaticQualifier ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_ID) ) {
                int LA60_1 = input.LA(2);

                if ( (LA60_1==69) ) {
                    alt60=1;
                }
            }
            switch (alt60) {
                case 1 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3899:1: ( ruleStaticQualifier )
                    {
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3899:1: ( ruleStaticQualifier )
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3900:3: ruleStaticQualifier
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getDeclaringTypeJvmDeclaredTypeCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall8990);
                    ruleStaticQualifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3913:3: (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==35) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3913:5: otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleXFeatureCall9004); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXFeatureCallAccess().getLessThanSignKeyword_2_0());
                          
                    }
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3917:1: ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) )
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3918:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    {
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3918:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3919:3: lv_typeArguments_3_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall9025);
                    lv_typeArguments_3_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                      	        }
                             		add(
                             			current, 
                             			"typeArguments",
                              		lv_typeArguments_3_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3935:2: (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==53) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3935:4: otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_4=(Token)match(input,53,FOLLOW_53_in_ruleXFeatureCall9038); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXFeatureCallAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3939:1: ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3940:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3940:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3941:3: lv_typeArguments_5_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall9059);
                    	    lv_typeArguments_5_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"typeArguments",
                    	              		lv_typeArguments_5_0, 
                    	              		"JvmArgumentTypeReference");
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

                    otherlv_6=(Token)match(input,34,FOLLOW_34_in_ruleXFeatureCall9073); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXFeatureCallAccess().getGreaterThanSignKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3961:3: ( ( ruleIdOrSuper ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3962:1: ( ruleIdOrSuper )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3962:1: ( ruleIdOrSuper )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3963:3: ruleIdOrSuper
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXFeatureCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall9098);
            ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3976:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt65=2;
            alt65 = dfa65.predict(input);
            switch (alt65) {
                case 1 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3976:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3976:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) )
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3976:4: ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' )
                    {
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3983:1: (lv_explicitOperationCall_8_0= '(' )
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3984:3: lv_explicitOperationCall_8_0= '('
                    {
                    lv_explicitOperationCall_8_0=(Token)match(input,54,FOLLOW_54_in_ruleXFeatureCall9132); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_explicitOperationCall_8_0, grammarAccess.getXFeatureCallAccess().getExplicitOperationCallLeftParenthesisKeyword_4_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                             		setWithLastConsumed(current, "explicitOperationCall", true, "(");
                      	    
                    }

                    }


                    }

                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3997:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt64=3;
                    alt64 = dfa64.predict(input);
                    switch (alt64) {
                        case 1 :
                            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3997:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            {
                            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3997:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3997:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure )
                            {
                            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4014:1: (lv_featureCallArguments_9_0= ruleXShortClosure )
                            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4015:3: lv_featureCallArguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXFeatureCall9217);
                            lv_featureCallArguments_9_0=ruleXShortClosure();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"featureCallArguments",
                                      		lv_featureCallArguments_9_0, 
                                      		"XShortClosure");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4032:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4032:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4032:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4032:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) )
                            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4033:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            {
                            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4033:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4034:3: lv_featureCallArguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall9245);
                            lv_featureCallArguments_10_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"featureCallArguments",
                                      		lv_featureCallArguments_10_0, 
                                      		"XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4050:2: (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            loop63:
                            do {
                                int alt63=2;
                                int LA63_0 = input.LA(1);

                                if ( (LA63_0==53) ) {
                                    alt63=1;
                                }


                                switch (alt63) {
                            	case 1 :
                            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4050:4: otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,53,FOLLOW_53_in_ruleXFeatureCall9258); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXFeatureCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4054:1: ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4055:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    {
                            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4055:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4056:3: lv_featureCallArguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall9279);
                            	    lv_featureCallArguments_12_0=ruleXExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"featureCallArguments",
                            	              		lv_featureCallArguments_12_0, 
                            	              		"XExpression");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop63;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,55,FOLLOW_55_in_ruleXFeatureCall9296); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXFeatureCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4076:3: ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            int alt66=2;
            alt66 = dfa66.predict(input);
            switch (alt66) {
                case 1 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4076:4: ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure )
                    {
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4079:1: (lv_featureCallArguments_14_0= ruleXClosure )
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4080:3: lv_featureCallArguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXFeatureCall9331);
                    lv_featureCallArguments_14_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                      	        }
                             		add(
                             			current, 
                             			"featureCallArguments",
                              		lv_featureCallArguments_14_0, 
                              		"XClosure");
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
        }
        return current;
    }
    // $ANTLR end "ruleXFeatureCall"


    // $ANTLR start "entryRuleIdOrSuper"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4104:1: entryRuleIdOrSuper returns [String current=null] : iv_ruleIdOrSuper= ruleIdOrSuper EOF ;
    public final String entryRuleIdOrSuper() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrSuper = null;


        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4105:2: (iv_ruleIdOrSuper= ruleIdOrSuper EOF )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4106:2: iv_ruleIdOrSuper= ruleIdOrSuper EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdOrSuperRule()); 
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper9369);
            iv_ruleIdOrSuper=ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdOrSuper.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdOrSuper9380); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIdOrSuper"


    // $ANTLR start "ruleIdOrSuper"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4113:1: ruleIdOrSuper returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID | kw= 'super' ) ;
    public final AntlrDatatypeRuleToken ruleIdOrSuper() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4116:28: ( (this_ValidID_0= ruleValidID | kw= 'super' ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4117:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4117:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==RULE_ID) ) {
                alt67=1;
            }
            else if ( (LA67_0==68) ) {
                alt67=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4118:5: this_ValidID_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIdOrSuperAccess().getValidIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleIdOrSuper9427);
                    this_ValidID_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ValidID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4130:2: kw= 'super'
                    {
                    kw=(Token)match(input,68,FOLLOW_68_in_ruleIdOrSuper9451); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIdOrSuperAccess().getSuperKeyword_1()); 
                          
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
    // $ANTLR end "ruleIdOrSuper"


    // $ANTLR start "entryRuleStaticQualifier"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4143:1: entryRuleStaticQualifier returns [String current=null] : iv_ruleStaticQualifier= ruleStaticQualifier EOF ;
    public final String entryRuleStaticQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStaticQualifier = null;


        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4144:2: (iv_ruleStaticQualifier= ruleStaticQualifier EOF )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4145:2: iv_ruleStaticQualifier= ruleStaticQualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticQualifierRule()); 
            }
            pushFollow(FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier9492);
            iv_ruleStaticQualifier=ruleStaticQualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticQualifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticQualifier9503); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStaticQualifier"


    // $ANTLR start "ruleStaticQualifier"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4152:1: ruleStaticQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID kw= '::' )+ ;
    public final AntlrDatatypeRuleToken ruleStaticQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4155:28: ( (this_ValidID_0= ruleValidID kw= '::' )+ )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4156:1: (this_ValidID_0= ruleValidID kw= '::' )+
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4156:1: (this_ValidID_0= ruleValidID kw= '::' )+
            int cnt68=0;
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==RULE_ID) ) {
                    int LA68_2 = input.LA(2);

                    if ( (LA68_2==69) ) {
                        alt68=1;
                    }


                }


                switch (alt68) {
            	case 1 :
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4157:5: this_ValidID_0= ruleValidID kw= '::'
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getStaticQualifierAccess().getValidIDParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleStaticQualifier9550);
            	    this_ValidID_0=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    kw=(Token)match(input,69,FOLLOW_69_in_ruleStaticQualifier9568); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getStaticQualifierAccess().getColonColonKeyword_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt68 >= 1 ) break loop68;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(68, input);
                        throw eee;
                }
                cnt68++;
            } while (true);


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
    // $ANTLR end "ruleStaticQualifier"


    // $ANTLR start "entryRuleXConstructorCall"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4181:1: entryRuleXConstructorCall returns [EObject current=null] : iv_ruleXConstructorCall= ruleXConstructorCall EOF ;
    public final EObject entryRuleXConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstructorCall = null;


        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4182:2: (iv_ruleXConstructorCall= ruleXConstructorCall EOF )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4183:2: iv_ruleXConstructorCall= ruleXConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXConstructorCallRule()); 
            }
            pushFollow(FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall9609);
            iv_ruleXConstructorCall=ruleXConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXConstructorCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXConstructorCall9619); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXConstructorCall"


    // $ANTLR start "ruleXConstructorCall"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4190:1: ruleXConstructorCall returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) ;
    public final EObject ruleXConstructorCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_typeArguments_4_0 = null;

        EObject lv_typeArguments_6_0 = null;

        EObject lv_arguments_9_0 = null;

        EObject lv_arguments_10_0 = null;

        EObject lv_arguments_12_0 = null;

        EObject lv_arguments_14_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4193:28: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4194:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4194:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4194:2: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4194:2: ()
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4195:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXConstructorCallAccess().getXConstructorCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,70,FOLLOW_70_in_ruleXConstructorCall9665); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXConstructorCallAccess().getNewKeyword_1());
                  
            }
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4204:1: ( ( ruleQualifiedName ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4205:1: ( ruleQualifiedName )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4205:1: ( ruleQualifiedName )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4206:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXConstructorCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getConstructorJvmConstructorCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXConstructorCall9688);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4219:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?
            int alt70=2;
            alt70 = dfa70.predict(input);
            switch (alt70) {
                case 1 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4219:3: ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>'
                    {
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4219:3: ( ( '<' )=>otherlv_3= '<' )
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4219:4: ( '<' )=>otherlv_3= '<'
                    {
                    otherlv_3=(Token)match(input,35,FOLLOW_35_in_ruleXConstructorCall9709); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXConstructorCallAccess().getLessThanSignKeyword_3_0());
                          
                    }

                    }

                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4224:2: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4225:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    {
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4225:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4226:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9731);
                    lv_typeArguments_4_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"typeArguments",
                              		lv_typeArguments_4_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4242:2: (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==53) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4242:4: otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,53,FOLLOW_53_in_ruleXConstructorCall9744); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getXConstructorCallAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4246:1: ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4247:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4247:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4248:3: lv_typeArguments_6_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9765);
                    	    lv_typeArguments_6_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"typeArguments",
                    	              		lv_typeArguments_6_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop69;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,34,FOLLOW_34_in_ruleXConstructorCall9779); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXConstructorCallAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4268:3: ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt73=2;
            alt73 = dfa73.predict(input);
            switch (alt73) {
                case 1 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4268:4: ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4268:4: ( ( '(' )=>otherlv_8= '(' )
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4268:5: ( '(' )=>otherlv_8= '('
                    {
                    otherlv_8=(Token)match(input,54,FOLLOW_54_in_ruleXConstructorCall9802); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4_0());
                          
                    }

                    }

                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4273:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt72=3;
                    alt72 = dfa72.predict(input);
                    switch (alt72) {
                        case 1 :
                            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4273:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            {
                            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4273:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4273:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure )
                            {
                            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4290:1: (lv_arguments_9_0= ruleXShortClosure )
                            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4291:3: lv_arguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXConstructorCall9875);
                            lv_arguments_9_0=ruleXShortClosure();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"arguments",
                                      		lv_arguments_9_0, 
                                      		"XShortClosure");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4308:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4308:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4308:7: ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4308:7: ( (lv_arguments_10_0= ruleXExpression ) )
                            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4309:1: (lv_arguments_10_0= ruleXExpression )
                            {
                            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4309:1: (lv_arguments_10_0= ruleXExpression )
                            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4310:3: lv_arguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall9903);
                            lv_arguments_10_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"arguments",
                                      		lv_arguments_10_0, 
                                      		"XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4326:2: (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            loop71:
                            do {
                                int alt71=2;
                                int LA71_0 = input.LA(1);

                                if ( (LA71_0==53) ) {
                                    alt71=1;
                                }


                                switch (alt71) {
                            	case 1 :
                            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4326:4: otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,53,FOLLOW_53_in_ruleXConstructorCall9916); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXConstructorCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4330:1: ( (lv_arguments_12_0= ruleXExpression ) )
                            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4331:1: (lv_arguments_12_0= ruleXExpression )
                            	    {
                            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4331:1: (lv_arguments_12_0= ruleXExpression )
                            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4332:3: lv_arguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall9937);
                            	    lv_arguments_12_0=ruleXExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"arguments",
                            	              		lv_arguments_12_0, 
                            	              		"XExpression");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop71;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,55,FOLLOW_55_in_ruleXConstructorCall9954); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXConstructorCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4352:3: ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            int alt74=2;
            alt74 = dfa74.predict(input);
            switch (alt74) {
                case 1 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4352:4: ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure )
                    {
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4355:1: (lv_arguments_14_0= ruleXClosure )
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4356:3: lv_arguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXConstructorCall9989);
                    lv_arguments_14_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_14_0, 
                              		"XClosure");
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
        }
        return current;
    }
    // $ANTLR end "ruleXConstructorCall"


    // $ANTLR start "entryRuleXBooleanLiteral"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4380:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4381:2: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4382:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral10026);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBooleanLiteral10036); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXBooleanLiteral"


    // $ANTLR start "ruleXBooleanLiteral"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4389:1: ruleXBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4392:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4393:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4393:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4393:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4393:2: ()
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4394:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4399:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==71) ) {
                alt75=1;
            }
            else if ( (LA75_0==72) ) {
                alt75=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4399:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,71,FOLLOW_71_in_ruleXBooleanLiteral10083); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4404:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4404:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4405:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4405:1: (lv_isTrue_2_0= 'true' )
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4406:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,72,FOLLOW_72_in_ruleXBooleanLiteral10107); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isTrue_2_0, grammarAccess.getXBooleanLiteralAccess().getIsTrueTrueKeyword_1_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXBooleanLiteralRule());
                      	        }
                             		setWithLastConsumed(current, "isTrue", true, "true");
                      	    
                    }

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
        }
        return current;
    }
    // $ANTLR end "ruleXBooleanLiteral"


    // $ANTLR start "entryRuleXNullLiteral"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4427:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4428:2: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4429:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral10157);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNullLiteral10167); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXNullLiteral"


    // $ANTLR start "ruleXNullLiteral"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4436:1: ruleXNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4439:28: ( ( () otherlv_1= 'null' ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4440:1: ( () otherlv_1= 'null' )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4440:1: ( () otherlv_1= 'null' )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4440:2: () otherlv_1= 'null'
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4440:2: ()
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4441:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,73,FOLLOW_73_in_ruleXNullLiteral10213); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXNullLiteralAccess().getNullKeyword_1());
                  
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
    // $ANTLR end "ruleXNullLiteral"


    // $ANTLR start "entryRuleXNumberLiteral"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4458:1: entryRuleXNumberLiteral returns [EObject current=null] : iv_ruleXNumberLiteral= ruleXNumberLiteral EOF ;
    public final EObject entryRuleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNumberLiteral = null;


        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4459:2: (iv_ruleXNumberLiteral= ruleXNumberLiteral EOF )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4460:2: iv_ruleXNumberLiteral= ruleXNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNumberLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral10249);
            iv_ruleXNumberLiteral=ruleXNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNumberLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNumberLiteral10259); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXNumberLiteral"


    // $ANTLR start "ruleXNumberLiteral"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4467:1: ruleXNumberLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleNumber ) ) ) ;
    public final EObject ruleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4470:28: ( ( () ( (lv_value_1_0= ruleNumber ) ) ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4471:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4471:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4471:2: () ( (lv_value_1_0= ruleNumber ) )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4471:2: ()
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4472:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNumberLiteralAccess().getXNumberLiteralAction_0(),
                          current);
                  
            }

            }

            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4477:2: ( (lv_value_1_0= ruleNumber ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4478:1: (lv_value_1_0= ruleNumber )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4478:1: (lv_value_1_0= ruleNumber )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4479:3: lv_value_1_0= ruleNumber
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXNumberLiteralAccess().getValueNumberParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumber_in_ruleXNumberLiteral10314);
            lv_value_1_0=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXNumberLiteralRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"Number");
              	        afterParserOrEnumRuleCall();
              	    
            }

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
        }
        return current;
    }
    // $ANTLR end "ruleXNumberLiteral"


    // $ANTLR start "entryRuleXStringLiteral"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4503:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4504:2: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4505:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral10350);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStringLiteral10360); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXStringLiteral"


    // $ANTLR start "ruleXStringLiteral"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4512:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4515:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4516:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4516:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4516:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4516:2: ()
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4517:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4522:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4523:1: (lv_value_1_0= RULE_STRING )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4523:1: (lv_value_1_0= RULE_STRING )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4524:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXStringLiteral10411); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getXStringLiteralAccess().getValueSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXStringLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"STRING");
              	    
            }

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
        }
        return current;
    }
    // $ANTLR end "ruleXStringLiteral"


    // $ANTLR start "entryRuleXTypeLiteral"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4548:1: entryRuleXTypeLiteral returns [EObject current=null] : iv_ruleXTypeLiteral= ruleXTypeLiteral EOF ;
    public final EObject entryRuleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypeLiteral = null;


        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4549:2: (iv_ruleXTypeLiteral= ruleXTypeLiteral EOF )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4550:2: iv_ruleXTypeLiteral= ruleXTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral10452);
            iv_ruleXTypeLiteral=ruleXTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTypeLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTypeLiteral10462); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXTypeLiteral"


    // $ANTLR start "ruleXTypeLiteral"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4557:1: ruleXTypeLiteral returns [EObject current=null] : ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) ;
    public final EObject ruleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4560:28: ( ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4561:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4561:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4561:2: () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')'
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4561:2: ()
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4562:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTypeLiteralAccess().getXTypeLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,74,FOLLOW_74_in_ruleXTypeLiteral10508); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTypeLiteralAccess().getTypeofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,54,FOLLOW_54_in_ruleXTypeLiteral10520); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXTypeLiteralAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4575:1: ( ( ruleQualifiedName ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4576:1: ( ruleQualifiedName )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4576:1: ( ruleQualifiedName )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4577:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXTypeLiteralRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getTypeJvmTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral10543);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,55,FOLLOW_55_in_ruleXTypeLiteral10555); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXTypeLiteralAccess().getRightParenthesisKeyword_4());
                  
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
    // $ANTLR end "ruleXTypeLiteral"


    // $ANTLR start "entryRuleXThrowExpression"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4602:1: entryRuleXThrowExpression returns [EObject current=null] : iv_ruleXThrowExpression= ruleXThrowExpression EOF ;
    public final EObject entryRuleXThrowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXThrowExpression = null;


        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4603:2: (iv_ruleXThrowExpression= ruleXThrowExpression EOF )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4604:2: iv_ruleXThrowExpression= ruleXThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXThrowExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression10591);
            iv_ruleXThrowExpression=ruleXThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXThrowExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXThrowExpression10601); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXThrowExpression"


    // $ANTLR start "ruleXThrowExpression"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4611:1: ruleXThrowExpression returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleXThrowExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4614:28: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4615:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4615:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4615:2: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4615:2: ()
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4616:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXThrowExpressionAccess().getXThrowExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,75,FOLLOW_75_in_ruleXThrowExpression10647); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXThrowExpressionAccess().getThrowKeyword_1());
                  
            }
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4625:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4626:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4626:1: (lv_expression_2_0= ruleXExpression )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4627:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXThrowExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXThrowExpression10668);
            lv_expression_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXThrowExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

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
        }
        return current;
    }
    // $ANTLR end "ruleXThrowExpression"


    // $ANTLR start "entryRuleXReturnExpression"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4651:1: entryRuleXReturnExpression returns [EObject current=null] : iv_ruleXReturnExpression= ruleXReturnExpression EOF ;
    public final EObject entryRuleXReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXReturnExpression = null;


        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4652:2: (iv_ruleXReturnExpression= ruleXReturnExpression EOF )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4653:2: iv_ruleXReturnExpression= ruleXReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXReturnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression10704);
            iv_ruleXReturnExpression=ruleXReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXReturnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXReturnExpression10714); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXReturnExpression"


    // $ANTLR start "ruleXReturnExpression"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4660:1: ruleXReturnExpression returns [EObject current=null] : ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) ;
    public final EObject ruleXReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4663:28: ( ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4664:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4664:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4664:2: () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4664:2: ()
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4665:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXReturnExpressionAccess().getXReturnExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,76,FOLLOW_76_in_ruleXReturnExpression10760); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXReturnExpressionAccess().getReturnKeyword_1());
                  
            }
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4674:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            int alt76=2;
            alt76 = dfa76.predict(input);
            switch (alt76) {
                case 1 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4674:2: ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression )
                    {
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4679:1: (lv_expression_2_0= ruleXExpression )
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4680:3: lv_expression_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXReturnExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXReturnExpression10791);
                    lv_expression_2_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXReturnExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_2_0, 
                              		"XExpression");
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
        }
        return current;
    }
    // $ANTLR end "ruleXReturnExpression"


    // $ANTLR start "entryRuleXTryCatchFinallyExpression"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4704:1: entryRuleXTryCatchFinallyExpression returns [EObject current=null] : iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF ;
    public final EObject entryRuleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTryCatchFinallyExpression = null;


        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4705:2: (iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4706:2: iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression10828);
            iv_ruleXTryCatchFinallyExpression=ruleXTryCatchFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTryCatchFinallyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression10838); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXTryCatchFinallyExpression"


    // $ANTLR start "ruleXTryCatchFinallyExpression"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4713:1: ruleXTryCatchFinallyExpression returns [EObject current=null] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) ;
    public final EObject ruleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_expression_2_0 = null;

        EObject lv_catchClauses_3_0 = null;

        EObject lv_finallyExpression_5_0 = null;

        EObject lv_finallyExpression_7_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4716:28: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4717:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4717:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4717:2: () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4717:2: ()
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4718:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTryCatchFinallyExpressionAccess().getXTryCatchFinallyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,77,FOLLOW_77_in_ruleXTryCatchFinallyExpression10884); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTryCatchFinallyExpressionAccess().getTryKeyword_1());
                  
            }
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4727:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4728:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4728:1: (lv_expression_2_0= ruleXExpression )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4729:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10905);
            lv_expression_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4745:2: ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==79) ) {
                alt79=1;
            }
            else if ( (LA79_0==78) ) {
                alt79=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }
            switch (alt79) {
                case 1 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4745:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    {
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4745:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4745:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    {
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4745:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+
                    int cnt77=0;
                    loop77:
                    do {
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( (LA77_0==79) ) {
                            int LA77_2 = input.LA(2);

                            if ( (synpred34_InternalEditor()) ) {
                                alt77=1;
                            }


                        }


                        switch (alt77) {
                    	case 1 :
                    	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4745:5: ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause )
                    	    {
                    	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4747:1: (lv_catchClauses_3_0= ruleXCatchClause )
                    	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4748:3: lv_catchClauses_3_0= ruleXCatchClause
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getCatchClausesXCatchClauseParserRuleCall_3_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression10935);
                    	    lv_catchClauses_3_0=ruleXCatchClause();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"catchClauses",
                    	              		lv_catchClauses_3_0, 
                    	              		"XCatchClause");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt77 >= 1 ) break loop77;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(77, input);
                                throw eee;
                        }
                        cnt77++;
                    } while (true);

                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4764:3: ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==78) ) {
                        int LA78_1 = input.LA(2);

                        if ( (synpred35_InternalEditor()) ) {
                            alt78=1;
                        }
                    }
                    switch (alt78) {
                        case 1 :
                            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4764:4: ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            {
                            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4764:4: ( ( 'finally' )=>otherlv_4= 'finally' )
                            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4764:5: ( 'finally' )=>otherlv_4= 'finally'
                            {
                            otherlv_4=(Token)match(input,78,FOLLOW_78_in_ruleXTryCatchFinallyExpression10957); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_0_1_0());
                                  
                            }

                            }

                            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4769:2: ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4770:1: (lv_finallyExpression_5_0= ruleXExpression )
                            {
                            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4770:1: (lv_finallyExpression_5_0= ruleXExpression )
                            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4771:3: lv_finallyExpression_5_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10979);
                            lv_finallyExpression_5_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"finallyExpression",
                                      		lv_finallyExpression_5_0, 
                                      		"XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4788:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    {
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4788:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4788:8: otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,78,FOLLOW_78_in_ruleXTryCatchFinallyExpression11001); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_1_0());
                          
                    }
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4792:1: ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4793:1: (lv_finallyExpression_7_0= ruleXExpression )
                    {
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4793:1: (lv_finallyExpression_7_0= ruleXExpression )
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4794:3: lv_finallyExpression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression11022);
                    lv_finallyExpression_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"finallyExpression",
                              		lv_finallyExpression_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


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
        }
        return current;
    }
    // $ANTLR end "ruleXTryCatchFinallyExpression"


    // $ANTLR start "entryRuleXCatchClause"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4818:1: entryRuleXCatchClause returns [EObject current=null] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final EObject entryRuleXCatchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCatchClause = null;


        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4819:2: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4820:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCatchClauseRule()); 
            }
            pushFollow(FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause11060);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCatchClause11070); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXCatchClause"


    // $ANTLR start "ruleXCatchClause"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4827:1: ruleXCatchClause returns [EObject current=null] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCatchClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4830:28: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4831:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4831:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4831:2: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4831:2: ( ( 'catch' )=>otherlv_0= 'catch' )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4831:3: ( 'catch' )=>otherlv_0= 'catch'
            {
            otherlv_0=(Token)match(input,79,FOLLOW_79_in_ruleXCatchClause11115); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXCatchClauseAccess().getCatchKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleXCatchClause11128); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXCatchClauseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4840:1: ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4841:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4841:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4842:3: lv_declaredParam_2_0= ruleFullJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getDeclaredParamFullJvmFormalParameterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause11149);
            lv_declaredParam_2_0=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCatchClauseRule());
              	        }
                     		set(
                     			current, 
                     			"declaredParam",
                      		lv_declaredParam_2_0, 
                      		"FullJvmFormalParameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,55,FOLLOW_55_in_ruleXCatchClause11161); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCatchClauseAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4862:1: ( (lv_expression_4_0= ruleXExpression ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4863:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4863:1: (lv_expression_4_0= ruleXExpression )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4864:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCatchClause11182);
            lv_expression_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCatchClauseRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

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
        }
        return current;
    }
    // $ANTLR end "ruleXCatchClause"


    // $ANTLR start "entryRuleQualifiedName"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4888:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4889:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4890:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName11219);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName11230); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4897:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4900:28: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4901:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4901:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4902:5: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName11277);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4912:1: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==50) ) {
                    int LA80_2 = input.LA(2);

                    if ( (LA80_2==RULE_ID) ) {
                        int LA80_3 = input.LA(3);

                        if ( (synpred37_InternalEditor()) ) {
                            alt80=1;
                        }


                    }


                }


                switch (alt80) {
            	case 1 :
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4912:2: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4912:2: ( ( '.' )=>kw= '.' )
            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4912:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,50,FOLLOW_50_in_ruleQualifiedName11305); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName11328);
            	    this_ValidID_2=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop80;
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
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleNumber"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4939:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4943:2: (iv_ruleNumber= ruleNumber EOF )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4944:2: iv_ruleNumber= ruleNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberRule()); 
            }
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber11382);
            iv_ruleNumber=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumber.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber11393); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4954:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_HEX_0=null;
        Token this_INT_1=null;
        Token this_DECIMAL_2=null;
        Token kw=null;
        Token this_INT_4=null;
        Token this_DECIMAL_5=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4958:28: ( (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4959:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4959:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==RULE_HEX) ) {
                alt84=1;
            }
            else if ( ((LA84_0>=RULE_INT && LA84_0<=RULE_DECIMAL)) ) {
                alt84=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }
            switch (alt84) {
                case 1 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4959:6: this_HEX_0= RULE_HEX
                    {
                    this_HEX_0=(Token)match(input,RULE_HEX,FOLLOW_RULE_HEX_in_ruleNumber11437); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_HEX_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_HEX_0, grammarAccess.getNumberAccess().getHEXTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4967:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    {
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4967:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4967:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    {
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4967:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL )
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==RULE_INT) ) {
                        alt81=1;
                    }
                    else if ( (LA81_0==RULE_DECIMAL) ) {
                        alt81=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 81, 0, input);

                        throw nvae;
                    }
                    switch (alt81) {
                        case 1 :
                            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4967:12: this_INT_1= RULE_INT
                            {
                            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber11465); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_INT_1);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_INT_1, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_0_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4975:10: this_DECIMAL_2= RULE_DECIMAL
                            {
                            this_DECIMAL_2=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber11491); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_DECIMAL_2);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_DECIMAL_2, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_0_1()); 
                                  
                            }

                            }
                            break;

                    }

                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4982:2: (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==50) ) {
                        int LA83_1 = input.LA(2);

                        if ( ((LA83_1>=RULE_INT && LA83_1<=RULE_DECIMAL)) ) {
                            alt83=1;
                        }
                    }
                    switch (alt83) {
                        case 1 :
                            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4983:2: kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            {
                            kw=(Token)match(input,50,FOLLOW_50_in_ruleNumber11511); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getNumberAccess().getFullStopKeyword_1_1_0()); 
                                  
                            }
                            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4988:1: (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            int alt82=2;
                            int LA82_0 = input.LA(1);

                            if ( (LA82_0==RULE_INT) ) {
                                alt82=1;
                            }
                            else if ( (LA82_0==RULE_DECIMAL) ) {
                                alt82=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 82, 0, input);

                                throw nvae;
                            }
                            switch (alt82) {
                                case 1 :
                                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4988:6: this_INT_4= RULE_INT
                                    {
                                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber11527); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      		current.merge(this_INT_4);
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                          newLeafNode(this_INT_4, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1_1_0()); 
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4996:10: this_DECIMAL_5= RULE_DECIMAL
                                    {
                                    this_DECIMAL_5=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber11553); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      		current.merge(this_DECIMAL_5);
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                          newLeafNode(this_DECIMAL_5, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_1_1_1()); 
                                          
                                    }

                                    }
                                    break;

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
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleJvmTypeReference"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5014:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5015:2: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5016:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference11606);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmTypeReference11616); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmTypeReference"


    // $ANTLR start "ruleJvmTypeReference"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5023:1: ruleJvmTypeReference returns [EObject current=null] : ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_4 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5026:28: ( ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5027:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5027:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==RULE_ID) ) {
                alt86=1;
            }
            else if ( (LA86_0==38||LA86_0==54) ) {
                alt86=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }
            switch (alt86) {
                case 1 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5027:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    {
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5027:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5028:5: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference11664);
                    this_JvmParameterizedTypeReference_0=ruleJvmParameterizedTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmParameterizedTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5036:1: ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    loop85:
                    do {
                        int alt85=2;
                        int LA85_0 = input.LA(1);

                        if ( (LA85_0==56) ) {
                            int LA85_2 = input.LA(2);

                            if ( (LA85_2==58) ) {
                                int LA85_3 = input.LA(3);

                                if ( (synpred38_InternalEditor()) ) {
                                    alt85=1;
                                }


                            }


                        }


                        switch (alt85) {
                    	case 1 :
                    	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5036:2: ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' )
                    	    {
                    	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5039:5: ( () otherlv_2= '[' otherlv_3= ']' )
                    	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5039:6: () otherlv_2= '[' otherlv_3= ']'
                    	    {
                    	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5039:6: ()
                    	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5040:5: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndSet(
                    	                  grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    otherlv_2=(Token)match(input,56,FOLLOW_56_in_ruleJvmTypeReference11702); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getJvmTypeReferenceAccess().getLeftSquareBracketKeyword_0_1_0_1());
                    	          
                    	    }
                    	    otherlv_3=(Token)match(input,58,FOLLOW_58_in_ruleJvmTypeReference11714); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmTypeReferenceAccess().getRightSquareBracketKeyword_0_1_0_2());
                    	          
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop85;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5055:5: this_XFunctionTypeRef_4= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference11746);
                    this_XFunctionTypeRef_4=ruleXFunctionTypeRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XFunctionTypeRef_4; 
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
        }
        return current;
    }
    // $ANTLR end "ruleJvmTypeReference"


    // $ANTLR start "entryRuleXFunctionTypeRef"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5071:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5072:2: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5073:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef11781);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFunctionTypeRef11791); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXFunctionTypeRef"


    // $ANTLR start "ruleXFunctionTypeRef"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5080:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_paramTypes_1_0 = null;

        EObject lv_paramTypes_3_0 = null;

        EObject lv_returnType_6_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5083:28: ( ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5084:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5084:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5084:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5084:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==54) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5084:4: otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,54,FOLLOW_54_in_ruleXFunctionTypeRef11829); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5088:1: ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )?
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==RULE_ID||LA88_0==38||LA88_0==54) ) {
                        alt88=1;
                    }
                    switch (alt88) {
                        case 1 :
                            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5088:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            {
                            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5088:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5089:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            {
                            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5089:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5090:3: lv_paramTypes_1_0= ruleJvmTypeReference
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11851);
                            lv_paramTypes_1_0=ruleJvmTypeReference();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"paramTypes",
                                      		lv_paramTypes_1_0, 
                                      		"JvmTypeReference");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5106:2: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            loop87:
                            do {
                                int alt87=2;
                                int LA87_0 = input.LA(1);

                                if ( (LA87_0==53) ) {
                                    alt87=1;
                                }


                                switch (alt87) {
                            	case 1 :
                            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5106:4: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    {
                            	    otherlv_2=(Token)match(input,53,FOLLOW_53_in_ruleXFunctionTypeRef11864); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_1_1_0());
                            	          
                            	    }
                            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5110:1: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5111:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    {
                            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5111:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5112:3: lv_paramTypes_3_0= ruleJvmTypeReference
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11885);
                            	    lv_paramTypes_3_0=ruleJvmTypeReference();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"paramTypes",
                            	              		lv_paramTypes_3_0, 
                            	              		"JvmTypeReference");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop87;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,55,FOLLOW_55_in_ruleXFunctionTypeRef11901); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,38,FOLLOW_38_in_ruleXFunctionTypeRef11915); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5136:1: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5137:1: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5137:1: (lv_returnType_6_0= ruleJvmTypeReference )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5138:3: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11936);
            lv_returnType_6_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
              	        }
                     		set(
                     			current, 
                     			"returnType",
                      		lv_returnType_6_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

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
        }
        return current;
    }
    // $ANTLR end "ruleXFunctionTypeRef"


    // $ANTLR start "entryRuleJvmParameterizedTypeReference"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5162:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5163:2: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5164:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference11972);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference11982); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmParameterizedTypeReference"


    // $ANTLR start "ruleJvmParameterizedTypeReference"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5171:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5174:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5175:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5175:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5175:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5175:2: ( ( ruleQualifiedName ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5176:1: ( ruleQualifiedName )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5176:1: ( ruleQualifiedName )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5177:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference12030);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5190:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt91=2;
            alt91 = dfa91.predict(input);
            switch (alt91) {
                case 1 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5190:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5190:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5190:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleJvmParameterizedTypeReference12051); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5195:2: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5196:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5196:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5197:3: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference12073);
                    lv_arguments_2_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_2_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5213:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop90:
                    do {
                        int alt90=2;
                        int LA90_0 = input.LA(1);

                        if ( (LA90_0==53) ) {
                            alt90=1;
                        }


                        switch (alt90) {
                    	case 1 :
                    	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5213:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,53,FOLLOW_53_in_ruleJvmParameterizedTypeReference12086); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5217:1: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5218:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5218:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5219:3: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference12107);
                    	    lv_arguments_4_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"arguments",
                    	              		lv_arguments_4_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop90;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,34,FOLLOW_34_in_ruleJvmParameterizedTypeReference12121); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getJvmParameterizedTypeReferenceAccess().getGreaterThanSignKeyword_1_3());
                          
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
        }
        return current;
    }
    // $ANTLR end "ruleJvmParameterizedTypeReference"


    // $ANTLR start "entryRuleJvmArgumentTypeReference"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5247:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5248:2: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5249:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference12159);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference12169); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmArgumentTypeReference"


    // $ANTLR start "ruleJvmArgumentTypeReference"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5256:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5259:28: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5260:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5260:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==RULE_ID||LA92_0==38||LA92_0==54) ) {
                alt92=1;
            }
            else if ( (LA92_0==80) ) {
                alt92=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;
            }
            switch (alt92) {
                case 1 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5261:5: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference12216);
                    this_JvmTypeReference_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5271:5: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference12243);
                    this_JvmWildcardTypeReference_1=ruleJvmWildcardTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmWildcardTypeReference_1; 
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
        }
        return current;
    }
    // $ANTLR end "ruleJvmArgumentTypeReference"


    // $ANTLR start "entryRuleJvmWildcardTypeReference"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5287:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5288:2: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5289:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference12278);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference12288); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmWildcardTypeReference"


    // $ANTLR start "ruleJvmWildcardTypeReference"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5296:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5299:28: ( ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5300:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5300:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5300:2: () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5300:2: ()
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5301:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,80,FOLLOW_80_in_ruleJvmWildcardTypeReference12334); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5310:1: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            int alt93=3;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==17) ) {
                alt93=1;
            }
            else if ( (LA93_0==68) ) {
                alt93=2;
            }
            switch (alt93) {
                case 1 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5310:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    {
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5310:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5311:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5311:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5312:3: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference12356);
                    lv_constraints_2_0=ruleJvmUpperBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"constraints",
                              		lv_constraints_2_0, 
                              		"JvmUpperBound");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5329:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    {
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5329:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5330:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    {
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5330:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5331:3: lv_constraints_3_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference12383);
                    lv_constraints_3_0=ruleJvmLowerBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"constraints",
                              		lv_constraints_3_0, 
                              		"JvmLowerBound");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

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
        }
        return current;
    }
    // $ANTLR end "ruleJvmWildcardTypeReference"


    // $ANTLR start "entryRuleJvmUpperBound"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5355:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5356:2: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5357:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound12421);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBound12431); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmUpperBound"


    // $ANTLR start "ruleJvmUpperBound"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5364:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5367:28: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5368:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5368:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5368:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleJvmUpperBound12468); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
                  
            }
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5372:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5373:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5373:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5374:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound12489);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmUpperBoundRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

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
        }
        return current;
    }
    // $ANTLR end "ruleJvmUpperBound"


    // $ANTLR start "entryRuleJvmUpperBoundAnded"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5398:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5399:2: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5400:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded12525);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded12535); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmUpperBoundAnded"


    // $ANTLR start "ruleJvmUpperBoundAnded"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5407:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5410:28: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5411:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5411:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5411:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,81,FOLLOW_81_in_ruleJvmUpperBoundAnded12572); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
                  
            }
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5415:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5416:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5416:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5417:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded12593);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmUpperBoundAndedRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

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
        }
        return current;
    }
    // $ANTLR end "ruleJvmUpperBoundAnded"


    // $ANTLR start "entryRuleJvmLowerBound"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5441:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5442:2: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5443:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound12629);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmLowerBound12639); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmLowerBound"


    // $ANTLR start "ruleJvmLowerBound"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5450:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5453:28: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5454:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5454:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5454:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,68,FOLLOW_68_in_ruleJvmLowerBound12676); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
                  
            }
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5458:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5459:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5459:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5460:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound12697);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmLowerBoundRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

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
        }
        return current;
    }
    // $ANTLR end "ruleJvmLowerBound"


    // $ANTLR start "entryRuleValidID"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5486:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5487:2: (iv_ruleValidID= ruleValidID EOF )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5488:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID12736);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID12747); if (state.failed) return current;

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
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5495:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5498:28: (this_ID_0= RULE_ID )
            // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5499:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID12786); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getValidIDAccess().getIDTerminalRuleCall()); 
                  
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
    // $ANTLR end "ruleValidID"

    // $ANTLR start synpred1_InternalEditor
    public final void synpred1_InternalEditor_fragment() throws RecognitionException {   
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:866:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:866:4: ( () ( ( ruleOpMultiAssign ) ) )
        {
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:866:4: ( () ( ( ruleOpMultiAssign ) ) )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:866:5: () ( ( ruleOpMultiAssign ) )
        {
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:866:5: ()
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:867:1: 
        {
        }

        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:867:2: ( ( ruleOpMultiAssign ) )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:868:1: ( ruleOpMultiAssign )
        {
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:868:1: ( ruleOpMultiAssign )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:869:3: ruleOpMultiAssign
        {
        pushFollow(FOLLOW_ruleOpMultiAssign_in_synpred1_InternalEditor1758);
        ruleOpMultiAssign();

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
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:994:3: ( ( () ( ( ruleOpOr ) ) ) )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:994:4: ( () ( ( ruleOpOr ) ) )
        {
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:994:4: ( () ( ( ruleOpOr ) ) )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:994:5: () ( ( ruleOpOr ) )
        {
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:994:5: ()
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:995:1: 
        {
        }

        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:995:2: ( ( ruleOpOr ) )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:996:1: ( ruleOpOr )
        {
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:996:1: ( ruleOpOr )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:997:3: ruleOpOr
        {
        pushFollow(FOLLOW_ruleOpOr_in_synpred2_InternalEditor2106);
        ruleOpOr();

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
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1095:3: ( ( () ( ( ruleOpAnd ) ) ) )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1095:4: ( () ( ( ruleOpAnd ) ) )
        {
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1095:4: ( () ( ( ruleOpAnd ) ) )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1095:5: () ( ( ruleOpAnd ) )
        {
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1095:5: ()
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1096:1: 
        {
        }

        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1096:2: ( ( ruleOpAnd ) )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1097:1: ( ruleOpAnd )
        {
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1097:1: ( ruleOpAnd )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1098:3: ruleOpAnd
        {
        pushFollow(FOLLOW_ruleOpAnd_in_synpred3_InternalEditor2365);
        ruleOpAnd();

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
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1196:3: ( ( () ( ( ruleOpEquality ) ) ) )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1196:4: ( () ( ( ruleOpEquality ) ) )
        {
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1196:4: ( () ( ( ruleOpEquality ) ) )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1196:5: () ( ( ruleOpEquality ) )
        {
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1196:5: ()
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1197:1: 
        {
        }

        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1197:2: ( ( ruleOpEquality ) )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1198:1: ( ruleOpEquality )
        {
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1198:1: ( ruleOpEquality )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1199:3: ruleOpEquality
        {
        pushFollow(FOLLOW_ruleOpEquality_in_synpred4_InternalEditor2624);
        ruleOpEquality();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred4_InternalEditor

    // $ANTLR start synpred5_InternalEditor
    public final void synpred5_InternalEditor_fragment() throws RecognitionException {   
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1304:4: ( ( () 'instanceof' ) )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1304:5: ( () 'instanceof' )
        {
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1304:5: ( () 'instanceof' )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1304:6: () 'instanceof'
        {
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1304:6: ()
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1305:1: 
        {
        }

        match(input,31,FOLLOW_31_in_synpred5_InternalEditor2900); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalEditor

    // $ANTLR start synpred6_InternalEditor
    public final void synpred6_InternalEditor_fragment() throws RecognitionException {   
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1335:8: ( ( () ( ( ruleOpCompare ) ) ) )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1335:9: ( () ( ( ruleOpCompare ) ) )
        {
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1335:9: ( () ( ( ruleOpCompare ) ) )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1335:10: () ( ( ruleOpCompare ) )
        {
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1335:10: ()
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1336:1: 
        {
        }

        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1336:2: ( ( ruleOpCompare ) )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1337:1: ( ruleOpCompare )
        {
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1337:1: ( ruleOpCompare )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1338:3: ruleOpCompare
        {
        pushFollow(FOLLOW_ruleOpCompare_in_synpred6_InternalEditor2971);
        ruleOpCompare();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred6_InternalEditor

    // $ANTLR start synpred7_InternalEditor
    public final void synpred7_InternalEditor_fragment() throws RecognitionException {   
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1457:3: ( ( () ( ( ruleOpOther ) ) ) )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1457:4: ( () ( ( ruleOpOther ) ) )
        {
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1457:4: ( () ( ( ruleOpOther ) ) )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1457:5: () ( ( ruleOpOther ) )
        {
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1457:5: ()
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1458:1: 
        {
        }

        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1458:2: ( ( ruleOpOther ) )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1459:1: ( ruleOpOther )
        {
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1459:1: ( ruleOpOther )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1460:3: ruleOpOther
        {
        pushFollow(FOLLOW_ruleOpOther_in_synpred7_InternalEditor3290);
        ruleOpOther();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred7_InternalEditor

    // $ANTLR start synpred8_InternalEditor
    public final void synpred8_InternalEditor_fragment() throws RecognitionException {   
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1549:3: ( ( '>' '>' ) )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1549:4: ( '>' '>' )
        {
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1549:4: ( '>' '>' )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1550:2: '>' '>'
        {
        match(input,34,FOLLOW_34_in_synpred8_InternalEditor3506); if (state.failed) return ;
        match(input,34,FOLLOW_34_in_synpred8_InternalEditor3511); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred8_InternalEditor

    // $ANTLR start synpred9_InternalEditor
    public final void synpred9_InternalEditor_fragment() throws RecognitionException {   
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1579:3: ( ( '<' '<' ) )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1579:4: ( '<' '<' )
        {
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1579:4: ( '<' '<' )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1580:2: '<' '<'
        {
        match(input,35,FOLLOW_35_in_synpred9_InternalEditor3593); if (state.failed) return ;
        match(input,35,FOLLOW_35_in_synpred9_InternalEditor3598); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred9_InternalEditor

    // $ANTLR start synpred10_InternalEditor
    public final void synpred10_InternalEditor_fragment() throws RecognitionException {   
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1653:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1653:4: ( () ( ( ruleOpAdd ) ) )
        {
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1653:4: ( () ( ( ruleOpAdd ) ) )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1653:5: () ( ( ruleOpAdd ) )
        {
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1653:5: ()
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1654:1: 
        {
        }

        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1654:2: ( ( ruleOpAdd ) )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1655:1: ( ruleOpAdd )
        {
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1655:1: ( ruleOpAdd )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1656:3: ruleOpAdd
        {
        pushFollow(FOLLOW_ruleOpAdd_in_synpred10_InternalEditor3820);
        ruleOpAdd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred10_InternalEditor

    // $ANTLR start synpred11_InternalEditor
    public final void synpred11_InternalEditor_fragment() throws RecognitionException {   
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1761:3: ( ( () ( ( ruleOpMulti ) ) ) )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1761:4: ( () ( ( ruleOpMulti ) ) )
        {
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1761:4: ( () ( ( ruleOpMulti ) ) )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1761:5: () ( ( ruleOpMulti ) )
        {
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1761:5: ()
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1762:1: 
        {
        }

        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1762:2: ( ( ruleOpMulti ) )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1763:1: ( ruleOpMulti )
        {
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1763:1: ( ruleOpMulti )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1764:3: ruleOpMulti
        {
        pushFollow(FOLLOW_ruleOpMulti_in_synpred11_InternalEditor4100);
        ruleOpMulti();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred11_InternalEditor

    // $ANTLR start synpred12_InternalEditor
    public final void synpred12_InternalEditor_fragment() throws RecognitionException {   
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1994:3: ( ( () 'as' ) )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1994:4: ( () 'as' )
        {
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1994:4: ( () 'as' )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1994:5: () 'as'
        {
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1994:5: ()
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:1995:1: 
        {
        }

        match(input,49,FOLLOW_49_in_synpred12_InternalEditor4694); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred12_InternalEditor

    // $ANTLR start synpred13_InternalEditor
    public final void synpred13_InternalEditor_fragment() throws RecognitionException {   
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2054:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2054:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        {
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2054:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2054:6: () '.' ( ( ruleValidID ) ) ruleOpSingleAssign
        {
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2054:6: ()
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2055:1: 
        {
        }

        match(input,50,FOLLOW_50_in_synpred13_InternalEditor4848); if (state.failed) return ;
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2056:1: ( ( ruleValidID ) )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2057:1: ( ruleValidID )
        {
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2057:1: ( ruleValidID )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2058:3: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred13_InternalEditor4857);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleOpSingleAssign_in_synpred13_InternalEditor4863);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalEditor

    // $ANTLR start synpred14_InternalEditor
    public final void synpred14_InternalEditor_fragment() throws RecognitionException {   
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2112:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2112:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        {
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2112:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2112:10: () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        {
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2112:10: ()
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2113:1: 
        {
        }

        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2113:2: ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        int alt94=3;
        switch ( input.LA(1) ) {
        case 50:
            {
            alt94=1;
            }
            break;
        case 51:
            {
            alt94=2;
            }
            break;
        case 52:
            {
            alt94=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 94, 0, input);

            throw nvae;
        }

        switch (alt94) {
            case 1 :
                // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2113:4: '.'
                {
                match(input,50,FOLLOW_50_in_synpred14_InternalEditor4966); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2115:6: ( ( '?.' ) )
                {
                // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2115:6: ( ( '?.' ) )
                // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2116:1: ( '?.' )
                {
                // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2116:1: ( '?.' )
                // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2117:2: '?.'
                {
                match(input,51,FOLLOW_51_in_synpred14_InternalEditor4980); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2122:6: ( ( '*.' ) )
                {
                // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2122:6: ( ( '*.' ) )
                // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2123:1: ( '*.' )
                {
                // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2123:1: ( '*.' )
                // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2124:2: '*.'
                {
                match(input,52,FOLLOW_52_in_synpred14_InternalEditor5000); if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred14_InternalEditor

    // $ANTLR start synpred15_InternalEditor
    public final void synpred15_InternalEditor_fragment() throws RecognitionException {   
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2233:4: ( ( '(' ) )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2234:1: ( '(' )
        {
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2234:1: ( '(' )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2235:2: '('
        {
        match(input,54,FOLLOW_54_in_synpred15_InternalEditor5227); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred15_InternalEditor

    // $ANTLR start synpred16_InternalEditor
    public final void synpred16_InternalEditor_fragment() throws RecognitionException {   
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2254:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2254:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2254:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2254:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2254:6: ()
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2255:1: 
        {
        }

        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2255:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt96=2;
        int LA96_0 = input.LA(1);

        if ( (LA96_0==RULE_ID||LA96_0==38||LA96_0==54) ) {
            alt96=1;
        }
        switch (alt96) {
            case 1 :
                // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2255:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2255:3: ( ( ruleJvmFormalParameter ) )
                // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2256:1: ( ruleJvmFormalParameter )
                {
                // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2256:1: ( ruleJvmFormalParameter )
                // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2257:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalEditor5279);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2259:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop95:
                do {
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==53) ) {
                        alt95=1;
                    }


                    switch (alt95) {
                	case 1 :
                	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2259:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,53,FOLLOW_53_in_synpred16_InternalEditor5286); if (state.failed) return ;
                	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2260:1: ( ( ruleJvmFormalParameter ) )
                	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2261:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2261:1: ( ruleJvmFormalParameter )
                	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2262:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalEditor5293);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop95;
                    }
                } while (true);


                }
                break;

        }

        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2264:6: ( ( '|' ) )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2265:1: ( '|' )
        {
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2265:1: ( '|' )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2266:2: '|'
        {
        match(input,57,FOLLOW_57_in_synpred16_InternalEditor5307); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred16_InternalEditor

    // $ANTLR start synpred17_InternalEditor
    public final void synpred17_InternalEditor_fragment() throws RecognitionException {   
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2333:4: ( ( () '[' ) )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2333:5: ( () '[' )
        {
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2333:5: ( () '[' )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2333:6: () '['
        {
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2333:6: ()
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2334:1: 
        {
        }

        match(input,56,FOLLOW_56_in_synpred17_InternalEditor5427); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred17_InternalEditor

    // $ANTLR start synpred18_InternalEditor
    public final void synpred18_InternalEditor_fragment() throws RecognitionException {   
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2524:3: ( ( () '[' ) )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2524:4: ( () '[' )
        {
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2524:4: ( () '[' )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2524:5: () '['
        {
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2524:5: ()
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2525:1: 
        {
        }

        match(input,56,FOLLOW_56_in_synpred18_InternalEditor5951); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred18_InternalEditor

    // $ANTLR start synpred20_InternalEditor
    public final void synpred20_InternalEditor_fragment() throws RecognitionException {   
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2618:4: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2618:5: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2618:5: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2618:6: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2618:6: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt98=2;
        int LA98_0 = input.LA(1);

        if ( (LA98_0==RULE_ID||LA98_0==38||LA98_0==54) ) {
            alt98=1;
        }
        switch (alt98) {
            case 1 :
                // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2618:7: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2618:7: ( ( ruleJvmFormalParameter ) )
                // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2619:1: ( ruleJvmFormalParameter )
                {
                // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2619:1: ( ruleJvmFormalParameter )
                // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2620:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalEditor6230);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2622:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop97:
                do {
                    int alt97=2;
                    int LA97_0 = input.LA(1);

                    if ( (LA97_0==53) ) {
                        alt97=1;
                    }


                    switch (alt97) {
                	case 1 :
                	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2622:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,53,FOLLOW_53_in_synpred20_InternalEditor6237); if (state.failed) return ;
                	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2623:1: ( ( ruleJvmFormalParameter ) )
                	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2624:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2624:1: ( ruleJvmFormalParameter )
                	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2625:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalEditor6244);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop97;
                    }
                } while (true);


                }
                break;

        }

        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2627:6: ( ( '|' ) )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2628:1: ( '|' )
        {
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2628:1: ( '|' )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2629:2: '|'
        {
        match(input,57,FOLLOW_57_in_synpred20_InternalEditor6258); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred20_InternalEditor

    // $ANTLR start synpred22_InternalEditor
    public final void synpred22_InternalEditor_fragment() throws RecognitionException {   
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2988:4: ( 'else' )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:2988:6: 'else'
        {
        match(input,61,FOLLOW_61_in_synpred22_InternalEditor7041); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_InternalEditor

    // $ANTLR start synpred23_InternalEditor
    public final void synpred23_InternalEditor_fragment() throws RecognitionException {   
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3042:4: ( ( ( ( ruleValidID ) ) ':' ) )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3042:5: ( ( ( ruleValidID ) ) ':' )
        {
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3042:5: ( ( ( ruleValidID ) ) ':' )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3042:6: ( ( ruleValidID ) ) ':'
        {
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3042:6: ( ( ruleValidID ) )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3043:1: ( ruleValidID )
        {
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3043:1: ( ruleValidID )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3044:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred23_InternalEditor7183);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,21,FOLLOW_21_in_synpred23_InternalEditor7189); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred23_InternalEditor

    // $ANTLR start synpred24_InternalEditor
    public final void synpred24_InternalEditor_fragment() throws RecognitionException {   
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3088:8: ( ( '(' ( ( ruleValidID ) ) ':' ) )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3088:9: ( '(' ( ( ruleValidID ) ) ':' )
        {
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3088:9: ( '(' ( ( ruleValidID ) ) ':' )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3088:11: '(' ( ( ruleValidID ) ) ':'
        {
        match(input,54,FOLLOW_54_in_synpred24_InternalEditor7265); if (state.failed) return ;
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3089:1: ( ( ruleValidID ) )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3090:1: ( ruleValidID )
        {
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3090:1: ( ruleValidID )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3091:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred24_InternalEditor7272);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,21,FOLLOW_21_in_synpred24_InternalEditor7278); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred24_InternalEditor

    // $ANTLR start synpred25_InternalEditor
    public final void synpred25_InternalEditor_fragment() throws RecognitionException {   
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3672:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3672:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        {
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3672:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3672:6: ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) )
        {
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3672:6: ( ( ruleJvmTypeReference ) )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3673:1: ( ruleJvmTypeReference )
        {
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3673:1: ( ruleJvmTypeReference )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3674:1: ruleJvmTypeReference
        {
        pushFollow(FOLLOW_ruleJvmTypeReference_in_synpred25_InternalEditor8543);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3676:2: ( ( ruleValidID ) )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3677:1: ( ruleValidID )
        {
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3677:1: ( ruleValidID )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3678:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred25_InternalEditor8552);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred25_InternalEditor

    // $ANTLR start synpred26_InternalEditor
    public final void synpred26_InternalEditor_fragment() throws RecognitionException {   
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3976:4: ( ( '(' ) )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3977:1: ( '(' )
        {
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3977:1: ( '(' )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3978:2: '('
        {
        match(input,54,FOLLOW_54_in_synpred26_InternalEditor9114); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred26_InternalEditor

    // $ANTLR start synpred27_InternalEditor
    public final void synpred27_InternalEditor_fragment() throws RecognitionException {   
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3997:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3997:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3997:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3997:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3997:6: ()
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3998:1: 
        {
        }

        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3998:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt102=2;
        int LA102_0 = input.LA(1);

        if ( (LA102_0==RULE_ID||LA102_0==38||LA102_0==54) ) {
            alt102=1;
        }
        switch (alt102) {
            case 1 :
                // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3998:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3998:3: ( ( ruleJvmFormalParameter ) )
                // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3999:1: ( ruleJvmFormalParameter )
                {
                // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:3999:1: ( ruleJvmFormalParameter )
                // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4000:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalEditor9166);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4002:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop101:
                do {
                    int alt101=2;
                    int LA101_0 = input.LA(1);

                    if ( (LA101_0==53) ) {
                        alt101=1;
                    }


                    switch (alt101) {
                	case 1 :
                	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4002:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,53,FOLLOW_53_in_synpred27_InternalEditor9173); if (state.failed) return ;
                	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4003:1: ( ( ruleJvmFormalParameter ) )
                	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4004:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4004:1: ( ruleJvmFormalParameter )
                	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4005:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalEditor9180);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop101;
                    }
                } while (true);


                }
                break;

        }

        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4007:6: ( ( '|' ) )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4008:1: ( '|' )
        {
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4008:1: ( '|' )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4009:2: '|'
        {
        match(input,57,FOLLOW_57_in_synpred27_InternalEditor9194); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred27_InternalEditor

    // $ANTLR start synpred28_InternalEditor
    public final void synpred28_InternalEditor_fragment() throws RecognitionException {   
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4076:4: ( ( () '[' ) )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4076:5: ( () '[' )
        {
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4076:5: ( () '[' )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4076:6: () '['
        {
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4076:6: ()
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4077:1: 
        {
        }

        match(input,56,FOLLOW_56_in_synpred28_InternalEditor9314); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred28_InternalEditor

    // $ANTLR start synpred29_InternalEditor
    public final void synpred29_InternalEditor_fragment() throws RecognitionException {   
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4219:4: ( '<' )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4219:6: '<'
        {
        match(input,35,FOLLOW_35_in_synpred29_InternalEditor9701); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred29_InternalEditor

    // $ANTLR start synpred30_InternalEditor
    public final void synpred30_InternalEditor_fragment() throws RecognitionException {   
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4268:5: ( '(' )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4268:7: '('
        {
        match(input,54,FOLLOW_54_in_synpred30_InternalEditor9794); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_InternalEditor

    // $ANTLR start synpred31_InternalEditor
    public final void synpred31_InternalEditor_fragment() throws RecognitionException {   
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4273:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4273:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4273:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4273:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4273:6: ()
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4274:1: 
        {
        }

        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4274:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt104=2;
        int LA104_0 = input.LA(1);

        if ( (LA104_0==RULE_ID||LA104_0==38||LA104_0==54) ) {
            alt104=1;
        }
        switch (alt104) {
            case 1 :
                // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4274:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4274:3: ( ( ruleJvmFormalParameter ) )
                // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4275:1: ( ruleJvmFormalParameter )
                {
                // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4275:1: ( ruleJvmFormalParameter )
                // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4276:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalEditor9824);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4278:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop103:
                do {
                    int alt103=2;
                    int LA103_0 = input.LA(1);

                    if ( (LA103_0==53) ) {
                        alt103=1;
                    }


                    switch (alt103) {
                	case 1 :
                	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4278:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,53,FOLLOW_53_in_synpred31_InternalEditor9831); if (state.failed) return ;
                	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4279:1: ( ( ruleJvmFormalParameter ) )
                	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4280:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4280:1: ( ruleJvmFormalParameter )
                	    // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4281:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalEditor9838);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop103;
                    }
                } while (true);


                }
                break;

        }

        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4283:6: ( ( '|' ) )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4284:1: ( '|' )
        {
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4284:1: ( '|' )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4285:2: '|'
        {
        match(input,57,FOLLOW_57_in_synpred31_InternalEditor9852); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred31_InternalEditor

    // $ANTLR start synpred32_InternalEditor
    public final void synpred32_InternalEditor_fragment() throws RecognitionException {   
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4352:4: ( ( () '[' ) )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4352:5: ( () '[' )
        {
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4352:5: ( () '[' )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4352:6: () '['
        {
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4352:6: ()
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4353:1: 
        {
        }

        match(input,56,FOLLOW_56_in_synpred32_InternalEditor9972); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred32_InternalEditor

    // $ANTLR start synpred33_InternalEditor
    public final void synpred33_InternalEditor_fragment() throws RecognitionException {   
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4674:2: ( ( ruleXExpression ) )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4675:1: ( ruleXExpression )
        {
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4675:1: ( ruleXExpression )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4676:1: ruleXExpression
        {
        pushFollow(FOLLOW_ruleXExpression_in_synpred33_InternalEditor10774);
        ruleXExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred33_InternalEditor

    // $ANTLR start synpred34_InternalEditor
    public final void synpred34_InternalEditor_fragment() throws RecognitionException {   
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4745:5: ( 'catch' )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4745:7: 'catch'
        {
        match(input,79,FOLLOW_79_in_synpred34_InternalEditor10919); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred34_InternalEditor

    // $ANTLR start synpred35_InternalEditor
    public final void synpred35_InternalEditor_fragment() throws RecognitionException {   
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4764:5: ( 'finally' )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4764:7: 'finally'
        {
        match(input,78,FOLLOW_78_in_synpred35_InternalEditor10949); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred35_InternalEditor

    // $ANTLR start synpred37_InternalEditor
    public final void synpred37_InternalEditor_fragment() throws RecognitionException {   
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4912:3: ( '.' )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:4913:2: '.'
        {
        match(input,50,FOLLOW_50_in_synpred37_InternalEditor11296); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred37_InternalEditor

    // $ANTLR start synpred38_InternalEditor
    public final void synpred38_InternalEditor_fragment() throws RecognitionException {   
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5036:2: ( ( () '[' ']' ) )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5036:3: ( () '[' ']' )
        {
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5036:3: ( () '[' ']' )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5036:4: () '[' ']'
        {
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5036:4: ()
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5037:1: 
        {
        }

        match(input,56,FOLLOW_56_in_synpred38_InternalEditor11679); if (state.failed) return ;
        match(input,58,FOLLOW_58_in_synpred38_InternalEditor11683); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred38_InternalEditor

    // $ANTLR start synpred39_InternalEditor
    public final void synpred39_InternalEditor_fragment() throws RecognitionException {   
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5190:4: ( '<' )
        // ../com.euclideanspace.euclid/src-gen/com/euclideanspace/euclid/parser/antlr/internal/InternalEditor.g:5190:6: '<'
        {
        match(input,35,FOLLOW_35_in_synpred39_InternalEditor12043); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred39_InternalEditor

    // Delegated rules

    public final boolean synpred7_InternalEditor() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalEditor_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_InternalEditor() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalEditor_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalEditor() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalEditor_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalEditor() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalEditor_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred37_InternalEditor() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred37_InternalEditor_fragment(); // can never throw exception
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
    public final boolean synpred18_InternalEditor() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalEditor_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalEditor() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalEditor_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalEditor() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalEditor_fragment(); // can never throw exception
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
    public final boolean synpred20_InternalEditor() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalEditor_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred38_InternalEditor() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_InternalEditor_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalEditor() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalEditor_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalEditor() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalEditor_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred30_InternalEditor() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_InternalEditor_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_InternalEditor() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_InternalEditor_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
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
    public final boolean synpred24_InternalEditor() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_InternalEditor_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred32_InternalEditor() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_InternalEditor_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred34_InternalEditor() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_InternalEditor_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_InternalEditor() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_InternalEditor_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred33_InternalEditor() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_InternalEditor_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_InternalEditor() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalEditor_fragment(); // can never throw exception
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
    public final boolean synpred11_InternalEditor() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalEditor_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_InternalEditor() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_InternalEditor_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalEditor() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalEditor_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalEditor() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalEditor_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalEditor() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalEditor_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred39_InternalEditor() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred39_InternalEditor_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred29_InternalEditor() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_InternalEditor_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred35_InternalEditor() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred35_InternalEditor_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_InternalEditor() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalEditor_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalEditor() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalEditor_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred28_InternalEditor() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_InternalEditor_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalEditor() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalEditor_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA18 dfa18 = new DFA18(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA35 dfa35 = new DFA35(this);
    protected DFA37 dfa37 = new DFA37(this);
    protected DFA41 dfa41 = new DFA41(this);
    protected DFA65 dfa65 = new DFA65(this);
    protected DFA64 dfa64 = new DFA64(this);
    protected DFA66 dfa66 = new DFA66(this);
    protected DFA70 dfa70 = new DFA70(this);
    protected DFA73 dfa73 = new DFA73(this);
    protected DFA72 dfa72 = new DFA72(this);
    protected DFA74 dfa74 = new DFA74(this);
    protected DFA76 dfa76 = new DFA76(this);
    protected DFA91 dfa91 = new DFA91(this);
    static final String DFA18_eotS =
        "\13\uffff";
    static final String DFA18_eofS =
        "\1\1\12\uffff";
    static final String DFA18_minS =
        "\1\4\1\uffff\10\0\1\uffff";
    static final String DFA18_maxS =
        "\1\117\1\uffff\10\0\1\uffff";
    static final String DFA18_acceptS =
        "\1\uffff\1\2\10\uffff\1\1";
    static final String DFA18_specialS =
        "\2\uffff\1\2\1\6\1\5\1\7\1\0\1\1\1\3\1\4\1\uffff}>";
    static final String[] DFA18_transitionS = {
            "\5\1\11\uffff\4\1\1\uffff\13\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10"+
            "\1\11\17\1\1\uffff\13\1\1\uffff\12\1",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            ""
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
            return "()* loopback of 1457:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_6 = input.LA(1);

                         
                        int index18_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalEditor()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index18_6);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA18_7 = input.LA(1);

                         
                        int index18_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalEditor()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index18_7);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA18_2 = input.LA(1);

                         
                        int index18_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalEditor()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index18_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA18_8 = input.LA(1);

                         
                        int index18_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalEditor()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index18_8);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA18_9 = input.LA(1);

                         
                        int index18_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalEditor()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index18_9);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA18_4 = input.LA(1);

                         
                        int index18_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalEditor()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index18_4);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA18_3 = input.LA(1);

                         
                        int index18_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalEditor()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index18_3);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA18_5 = input.LA(1);

                         
                        int index18_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalEditor()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index18_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA34_eotS =
        "\103\uffff";
    static final String DFA34_eofS =
        "\1\2\102\uffff";
    static final String DFA34_minS =
        "\1\4\1\0\101\uffff";
    static final String DFA34_maxS =
        "\1\117\1\0\101\uffff";
    static final String DFA34_acceptS =
        "\2\uffff\1\2\77\uffff\1\1";
    static final String DFA34_specialS =
        "\1\uffff\1\0\101\uffff}>";
    static final String[] DFA34_transitionS = {
            "\5\2\11\uffff\4\2\1\uffff\37\2\1\1\2\2\1\uffff\13\2\1\uffff"+
            "\12\2",
            "\1\uffff",
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
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
    static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
    static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
    static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
    static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
    static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
    static final short[][] DFA34_transition;

    static {
        int numStates = DFA34_transitionS.length;
        DFA34_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
        }
    }

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = DFA34_eot;
            this.eof = DFA34_eof;
            this.min = DFA34_min;
            this.max = DFA34_max;
            this.accept = DFA34_accept;
            this.special = DFA34_special;
            this.transition = DFA34_transition;
        }
        public String getDescription() {
            return "2233:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA34_1 = input.LA(1);

                         
                        int index34_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalEditor()) ) {s = 66;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index34_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 34, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA33_eotS =
        "\36\uffff";
    static final String DFA33_eofS =
        "\36\uffff";
    static final String DFA33_minS =
        "\1\4\2\0\33\uffff";
    static final String DFA33_maxS =
        "\1\115\2\0\33\uffff";
    static final String DFA33_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA33_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA33_transitionS = {
            "\1\1\4\5\11\uffff\1\5\20\uffff\1\5\2\uffff\1\3\3\uffff\2\5\4"+
            "\uffff\1\5\5\uffff\1\2\1\35\1\5\1\4\2\uffff\1\5\1\uffff\1\5"+
            "\2\uffff\4\5\1\uffff\10\5",
            "\1\uffff",
            "\1\uffff",
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
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA33_eot = DFA.unpackEncodedString(DFA33_eotS);
    static final short[] DFA33_eof = DFA.unpackEncodedString(DFA33_eofS);
    static final char[] DFA33_min = DFA.unpackEncodedStringToUnsignedChars(DFA33_minS);
    static final char[] DFA33_max = DFA.unpackEncodedStringToUnsignedChars(DFA33_maxS);
    static final short[] DFA33_accept = DFA.unpackEncodedString(DFA33_acceptS);
    static final short[] DFA33_special = DFA.unpackEncodedString(DFA33_specialS);
    static final short[][] DFA33_transition;

    static {
        int numStates = DFA33_transitionS.length;
        DFA33_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA33_transition[i] = DFA.unpackEncodedString(DFA33_transitionS[i]);
        }
    }

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = DFA33_eot;
            this.eof = DFA33_eof;
            this.min = DFA33_min;
            this.max = DFA33_max;
            this.accept = DFA33_accept;
            this.special = DFA33_special;
            this.transition = DFA33_transition;
        }
        public String getDescription() {
            return "2254:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA33_0 = input.LA(1);

                         
                        int index33_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA33_0==RULE_ID) ) {s = 1;}

                        else if ( (LA33_0==54) ) {s = 2;}

                        else if ( (LA33_0==38) && (synpred16_InternalEditor())) {s = 3;}

                        else if ( (LA33_0==57) && (synpred16_InternalEditor())) {s = 4;}

                        else if ( ((LA33_0>=RULE_STRING && LA33_0<=RULE_DECIMAL)||LA33_0==18||LA33_0==35||(LA33_0>=42 && LA33_0<=43)||LA33_0==48||LA33_0==56||LA33_0==60||LA33_0==62||(LA33_0>=65 && LA33_0<=68)||(LA33_0>=70 && LA33_0<=77)) ) {s = 5;}

                        else if ( (LA33_0==55) ) {s = 29;}

                         
                        input.seek(index33_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA33_1 = input.LA(1);

                         
                        int index33_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalEditor()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index33_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA33_2 = input.LA(1);

                         
                        int index33_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalEditor()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index33_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 33, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA35_eotS =
        "\103\uffff";
    static final String DFA35_eofS =
        "\1\2\102\uffff";
    static final String DFA35_minS =
        "\1\4\1\0\101\uffff";
    static final String DFA35_maxS =
        "\1\117\1\0\101\uffff";
    static final String DFA35_acceptS =
        "\2\uffff\1\2\77\uffff\1\1";
    static final String DFA35_specialS =
        "\1\uffff\1\0\101\uffff}>";
    static final String[] DFA35_transitionS = {
            "\5\2\11\uffff\4\2\1\uffff\41\2\1\1\1\uffff\13\2\1\uffff\12\2",
            "\1\uffff",
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
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA35_eot = DFA.unpackEncodedString(DFA35_eotS);
    static final short[] DFA35_eof = DFA.unpackEncodedString(DFA35_eofS);
    static final char[] DFA35_min = DFA.unpackEncodedStringToUnsignedChars(DFA35_minS);
    static final char[] DFA35_max = DFA.unpackEncodedStringToUnsignedChars(DFA35_maxS);
    static final short[] DFA35_accept = DFA.unpackEncodedString(DFA35_acceptS);
    static final short[] DFA35_special = DFA.unpackEncodedString(DFA35_specialS);
    static final short[][] DFA35_transition;

    static {
        int numStates = DFA35_transitionS.length;
        DFA35_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA35_transition[i] = DFA.unpackEncodedString(DFA35_transitionS[i]);
        }
    }

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = DFA35_eot;
            this.eof = DFA35_eof;
            this.min = DFA35_min;
            this.max = DFA35_max;
            this.accept = DFA35_accept;
            this.special = DFA35_special;
            this.transition = DFA35_transition;
        }
        public String getDescription() {
            return "2333:3: ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA35_1 = input.LA(1);

                         
                        int index35_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalEditor()) ) {s = 66;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index35_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 35, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA37_eotS =
        "\16\uffff";
    static final String DFA37_eofS =
        "\16\uffff";
    static final String DFA37_minS =
        "\1\4\15\uffff";
    static final String DFA37_maxS =
        "\1\115\15\uffff";
    static final String DFA37_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15";
    static final String DFA37_specialS =
        "\16\uffff}>";
    static final String[] DFA37_transitionS = {
            "\1\4\4\5\11\uffff\1\2\20\uffff\1\4\22\uffff\1\15\1\uffff\1\5"+
            "\3\uffff\1\6\1\uffff\1\3\2\uffff\1\7\1\10\1\11\1\4\1\uffff\1"+
            "\1\4\5\1\12\1\13\1\14",
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
            "",
            "",
            ""
    };

    static final short[] DFA37_eot = DFA.unpackEncodedString(DFA37_eotS);
    static final short[] DFA37_eof = DFA.unpackEncodedString(DFA37_eofS);
    static final char[] DFA37_min = DFA.unpackEncodedStringToUnsignedChars(DFA37_minS);
    static final char[] DFA37_max = DFA.unpackEncodedStringToUnsignedChars(DFA37_maxS);
    static final short[] DFA37_accept = DFA.unpackEncodedString(DFA37_acceptS);
    static final short[] DFA37_special = DFA.unpackEncodedString(DFA37_specialS);
    static final short[][] DFA37_transition;

    static {
        int numStates = DFA37_transitionS.length;
        DFA37_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA37_transition[i] = DFA.unpackEncodedString(DFA37_transitionS[i]);
        }
    }

    class DFA37 extends DFA {

        public DFA37(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 37;
            this.eot = DFA37_eot;
            this.eof = DFA37_eof;
            this.min = DFA37_min;
            this.max = DFA37_max;
            this.accept = DFA37_accept;
            this.special = DFA37_special;
            this.transition = DFA37_transition;
        }
        public String getDescription() {
            return "2374:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )";
        }
    }
    static final String DFA41_eotS =
        "\40\uffff";
    static final String DFA41_eofS =
        "\40\uffff";
    static final String DFA41_minS =
        "\1\4\2\0\35\uffff";
    static final String DFA41_maxS =
        "\1\115\2\0\35\uffff";
    static final String DFA41_acceptS =
        "\3\uffff\2\1\1\2\32\uffff";
    static final String DFA41_specialS =
        "\1\0\1\1\1\2\35\uffff}>";
    static final String[] DFA41_transitionS = {
            "\1\1\4\5\11\uffff\1\5\1\uffff\1\5\2\uffff\1\5\13\uffff\1\5\2"+
            "\uffff\1\3\3\uffff\2\5\4\uffff\1\5\5\uffff\1\2\1\uffff\1\5\1"+
            "\4\1\5\1\uffff\1\5\1\uffff\1\5\2\uffff\4\5\1\uffff\10\5",
            "\1\uffff",
            "\1\uffff",
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

    static final short[] DFA41_eot = DFA.unpackEncodedString(DFA41_eotS);
    static final short[] DFA41_eof = DFA.unpackEncodedString(DFA41_eofS);
    static final char[] DFA41_min = DFA.unpackEncodedStringToUnsignedChars(DFA41_minS);
    static final char[] DFA41_max = DFA.unpackEncodedStringToUnsignedChars(DFA41_maxS);
    static final short[] DFA41_accept = DFA.unpackEncodedString(DFA41_acceptS);
    static final short[] DFA41_special = DFA.unpackEncodedString(DFA41_specialS);
    static final short[][] DFA41_transition;

    static {
        int numStates = DFA41_transitionS.length;
        DFA41_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA41_transition[i] = DFA.unpackEncodedString(DFA41_transitionS[i]);
        }
    }

    class DFA41 extends DFA {

        public DFA41(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 41;
            this.eot = DFA41_eot;
            this.eof = DFA41_eof;
            this.min = DFA41_min;
            this.max = DFA41_max;
            this.accept = DFA41_accept;
            this.special = DFA41_special;
            this.transition = DFA41_transition;
        }
        public String getDescription() {
            return "2618:3: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA41_0 = input.LA(1);

                         
                        int index41_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA41_0==RULE_ID) ) {s = 1;}

                        else if ( (LA41_0==54) ) {s = 2;}

                        else if ( (LA41_0==38) && (synpred20_InternalEditor())) {s = 3;}

                        else if ( (LA41_0==57) && (synpred20_InternalEditor())) {s = 4;}

                        else if ( ((LA41_0>=RULE_STRING && LA41_0<=RULE_DECIMAL)||LA41_0==18||LA41_0==20||LA41_0==23||LA41_0==35||(LA41_0>=42 && LA41_0<=43)||LA41_0==48||LA41_0==56||LA41_0==58||LA41_0==60||LA41_0==62||(LA41_0>=65 && LA41_0<=68)||(LA41_0>=70 && LA41_0<=77)) ) {s = 5;}

                         
                        input.seek(index41_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA41_1 = input.LA(1);

                         
                        int index41_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalEditor()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index41_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA41_2 = input.LA(1);

                         
                        int index41_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalEditor()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index41_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 41, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA65_eotS =
        "\103\uffff";
    static final String DFA65_eofS =
        "\1\2\102\uffff";
    static final String DFA65_minS =
        "\1\4\1\0\101\uffff";
    static final String DFA65_maxS =
        "\1\117\1\0\101\uffff";
    static final String DFA65_acceptS =
        "\2\uffff\1\2\77\uffff\1\1";
    static final String DFA65_specialS =
        "\1\uffff\1\0\101\uffff}>";
    static final String[] DFA65_transitionS = {
            "\5\2\11\uffff\4\2\1\uffff\37\2\1\1\2\2\1\uffff\13\2\1\uffff"+
            "\12\2",
            "\1\uffff",
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
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA65_eot = DFA.unpackEncodedString(DFA65_eotS);
    static final short[] DFA65_eof = DFA.unpackEncodedString(DFA65_eofS);
    static final char[] DFA65_min = DFA.unpackEncodedStringToUnsignedChars(DFA65_minS);
    static final char[] DFA65_max = DFA.unpackEncodedStringToUnsignedChars(DFA65_maxS);
    static final short[] DFA65_accept = DFA.unpackEncodedString(DFA65_acceptS);
    static final short[] DFA65_special = DFA.unpackEncodedString(DFA65_specialS);
    static final short[][] DFA65_transition;

    static {
        int numStates = DFA65_transitionS.length;
        DFA65_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA65_transition[i] = DFA.unpackEncodedString(DFA65_transitionS[i]);
        }
    }

    class DFA65 extends DFA {

        public DFA65(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 65;
            this.eot = DFA65_eot;
            this.eof = DFA65_eof;
            this.min = DFA65_min;
            this.max = DFA65_max;
            this.accept = DFA65_accept;
            this.special = DFA65_special;
            this.transition = DFA65_transition;
        }
        public String getDescription() {
            return "3976:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA65_1 = input.LA(1);

                         
                        int index65_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalEditor()) ) {s = 66;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index65_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 65, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA64_eotS =
        "\36\uffff";
    static final String DFA64_eofS =
        "\36\uffff";
    static final String DFA64_minS =
        "\1\4\2\0\33\uffff";
    static final String DFA64_maxS =
        "\1\115\2\0\33\uffff";
    static final String DFA64_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA64_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA64_transitionS = {
            "\1\1\4\5\11\uffff\1\5\20\uffff\1\5\2\uffff\1\3\3\uffff\2\5\4"+
            "\uffff\1\5\5\uffff\1\2\1\35\1\5\1\4\2\uffff\1\5\1\uffff\1\5"+
            "\2\uffff\4\5\1\uffff\10\5",
            "\1\uffff",
            "\1\uffff",
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
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA64_eot = DFA.unpackEncodedString(DFA64_eotS);
    static final short[] DFA64_eof = DFA.unpackEncodedString(DFA64_eofS);
    static final char[] DFA64_min = DFA.unpackEncodedStringToUnsignedChars(DFA64_minS);
    static final char[] DFA64_max = DFA.unpackEncodedStringToUnsignedChars(DFA64_maxS);
    static final short[] DFA64_accept = DFA.unpackEncodedString(DFA64_acceptS);
    static final short[] DFA64_special = DFA.unpackEncodedString(DFA64_specialS);
    static final short[][] DFA64_transition;

    static {
        int numStates = DFA64_transitionS.length;
        DFA64_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA64_transition[i] = DFA.unpackEncodedString(DFA64_transitionS[i]);
        }
    }

    class DFA64 extends DFA {

        public DFA64(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 64;
            this.eot = DFA64_eot;
            this.eof = DFA64_eof;
            this.min = DFA64_min;
            this.max = DFA64_max;
            this.accept = DFA64_accept;
            this.special = DFA64_special;
            this.transition = DFA64_transition;
        }
        public String getDescription() {
            return "3997:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA64_0 = input.LA(1);

                         
                        int index64_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA64_0==RULE_ID) ) {s = 1;}

                        else if ( (LA64_0==54) ) {s = 2;}

                        else if ( (LA64_0==38) && (synpred27_InternalEditor())) {s = 3;}

                        else if ( (LA64_0==57) && (synpred27_InternalEditor())) {s = 4;}

                        else if ( ((LA64_0>=RULE_STRING && LA64_0<=RULE_DECIMAL)||LA64_0==18||LA64_0==35||(LA64_0>=42 && LA64_0<=43)||LA64_0==48||LA64_0==56||LA64_0==60||LA64_0==62||(LA64_0>=65 && LA64_0<=68)||(LA64_0>=70 && LA64_0<=77)) ) {s = 5;}

                        else if ( (LA64_0==55) ) {s = 29;}

                         
                        input.seek(index64_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA64_1 = input.LA(1);

                         
                        int index64_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalEditor()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index64_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA64_2 = input.LA(1);

                         
                        int index64_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalEditor()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index64_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 64, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA66_eotS =
        "\103\uffff";
    static final String DFA66_eofS =
        "\1\2\102\uffff";
    static final String DFA66_minS =
        "\1\4\1\0\101\uffff";
    static final String DFA66_maxS =
        "\1\117\1\0\101\uffff";
    static final String DFA66_acceptS =
        "\2\uffff\1\2\77\uffff\1\1";
    static final String DFA66_specialS =
        "\1\uffff\1\0\101\uffff}>";
    static final String[] DFA66_transitionS = {
            "\5\2\11\uffff\4\2\1\uffff\41\2\1\1\1\uffff\13\2\1\uffff\12\2",
            "\1\uffff",
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
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA66_eot = DFA.unpackEncodedString(DFA66_eotS);
    static final short[] DFA66_eof = DFA.unpackEncodedString(DFA66_eofS);
    static final char[] DFA66_min = DFA.unpackEncodedStringToUnsignedChars(DFA66_minS);
    static final char[] DFA66_max = DFA.unpackEncodedStringToUnsignedChars(DFA66_maxS);
    static final short[] DFA66_accept = DFA.unpackEncodedString(DFA66_acceptS);
    static final short[] DFA66_special = DFA.unpackEncodedString(DFA66_specialS);
    static final short[][] DFA66_transition;

    static {
        int numStates = DFA66_transitionS.length;
        DFA66_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA66_transition[i] = DFA.unpackEncodedString(DFA66_transitionS[i]);
        }
    }

    class DFA66 extends DFA {

        public DFA66(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 66;
            this.eot = DFA66_eot;
            this.eof = DFA66_eof;
            this.min = DFA66_min;
            this.max = DFA66_max;
            this.accept = DFA66_accept;
            this.special = DFA66_special;
            this.transition = DFA66_transition;
        }
        public String getDescription() {
            return "4076:3: ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA66_1 = input.LA(1);

                         
                        int index66_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalEditor()) ) {s = 66;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index66_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 66, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA70_eotS =
        "\103\uffff";
    static final String DFA70_eofS =
        "\1\2\102\uffff";
    static final String DFA70_minS =
        "\1\4\1\0\101\uffff";
    static final String DFA70_maxS =
        "\1\117\1\0\101\uffff";
    static final String DFA70_acceptS =
        "\2\uffff\1\2\77\uffff\1\1";
    static final String DFA70_specialS =
        "\1\uffff\1\0\101\uffff}>";
    static final String[] DFA70_transitionS = {
            "\5\2\11\uffff\4\2\1\uffff\14\2\1\1\25\2\1\uffff\13\2\1\uffff"+
            "\12\2",
            "\1\uffff",
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
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA70_eot = DFA.unpackEncodedString(DFA70_eotS);
    static final short[] DFA70_eof = DFA.unpackEncodedString(DFA70_eofS);
    static final char[] DFA70_min = DFA.unpackEncodedStringToUnsignedChars(DFA70_minS);
    static final char[] DFA70_max = DFA.unpackEncodedStringToUnsignedChars(DFA70_maxS);
    static final short[] DFA70_accept = DFA.unpackEncodedString(DFA70_acceptS);
    static final short[] DFA70_special = DFA.unpackEncodedString(DFA70_specialS);
    static final short[][] DFA70_transition;

    static {
        int numStates = DFA70_transitionS.length;
        DFA70_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA70_transition[i] = DFA.unpackEncodedString(DFA70_transitionS[i]);
        }
    }

    class DFA70 extends DFA {

        public DFA70(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 70;
            this.eot = DFA70_eot;
            this.eof = DFA70_eof;
            this.min = DFA70_min;
            this.max = DFA70_max;
            this.accept = DFA70_accept;
            this.special = DFA70_special;
            this.transition = DFA70_transition;
        }
        public String getDescription() {
            return "4219:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA70_1 = input.LA(1);

                         
                        int index70_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalEditor()) ) {s = 66;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index70_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 70, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA73_eotS =
        "\103\uffff";
    static final String DFA73_eofS =
        "\1\2\102\uffff";
    static final String DFA73_minS =
        "\1\4\1\0\101\uffff";
    static final String DFA73_maxS =
        "\1\117\1\0\101\uffff";
    static final String DFA73_acceptS =
        "\2\uffff\1\2\77\uffff\1\1";
    static final String DFA73_specialS =
        "\1\uffff\1\0\101\uffff}>";
    static final String[] DFA73_transitionS = {
            "\5\2\11\uffff\4\2\1\uffff\37\2\1\1\2\2\1\uffff\13\2\1\uffff"+
            "\12\2",
            "\1\uffff",
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
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA73_eot = DFA.unpackEncodedString(DFA73_eotS);
    static final short[] DFA73_eof = DFA.unpackEncodedString(DFA73_eofS);
    static final char[] DFA73_min = DFA.unpackEncodedStringToUnsignedChars(DFA73_minS);
    static final char[] DFA73_max = DFA.unpackEncodedStringToUnsignedChars(DFA73_maxS);
    static final short[] DFA73_accept = DFA.unpackEncodedString(DFA73_acceptS);
    static final short[] DFA73_special = DFA.unpackEncodedString(DFA73_specialS);
    static final short[][] DFA73_transition;

    static {
        int numStates = DFA73_transitionS.length;
        DFA73_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA73_transition[i] = DFA.unpackEncodedString(DFA73_transitionS[i]);
        }
    }

    class DFA73 extends DFA {

        public DFA73(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 73;
            this.eot = DFA73_eot;
            this.eof = DFA73_eof;
            this.min = DFA73_min;
            this.max = DFA73_max;
            this.accept = DFA73_accept;
            this.special = DFA73_special;
            this.transition = DFA73_transition;
        }
        public String getDescription() {
            return "4268:3: ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA73_1 = input.LA(1);

                         
                        int index73_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalEditor()) ) {s = 66;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index73_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 73, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA72_eotS =
        "\36\uffff";
    static final String DFA72_eofS =
        "\36\uffff";
    static final String DFA72_minS =
        "\1\4\2\0\33\uffff";
    static final String DFA72_maxS =
        "\1\115\2\0\33\uffff";
    static final String DFA72_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA72_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA72_transitionS = {
            "\1\1\4\5\11\uffff\1\5\20\uffff\1\5\2\uffff\1\3\3\uffff\2\5\4"+
            "\uffff\1\5\5\uffff\1\2\1\35\1\5\1\4\2\uffff\1\5\1\uffff\1\5"+
            "\2\uffff\4\5\1\uffff\10\5",
            "\1\uffff",
            "\1\uffff",
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
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA72_eot = DFA.unpackEncodedString(DFA72_eotS);
    static final short[] DFA72_eof = DFA.unpackEncodedString(DFA72_eofS);
    static final char[] DFA72_min = DFA.unpackEncodedStringToUnsignedChars(DFA72_minS);
    static final char[] DFA72_max = DFA.unpackEncodedStringToUnsignedChars(DFA72_maxS);
    static final short[] DFA72_accept = DFA.unpackEncodedString(DFA72_acceptS);
    static final short[] DFA72_special = DFA.unpackEncodedString(DFA72_specialS);
    static final short[][] DFA72_transition;

    static {
        int numStates = DFA72_transitionS.length;
        DFA72_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA72_transition[i] = DFA.unpackEncodedString(DFA72_transitionS[i]);
        }
    }

    class DFA72 extends DFA {

        public DFA72(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 72;
            this.eot = DFA72_eot;
            this.eof = DFA72_eof;
            this.min = DFA72_min;
            this.max = DFA72_max;
            this.accept = DFA72_accept;
            this.special = DFA72_special;
            this.transition = DFA72_transition;
        }
        public String getDescription() {
            return "4273:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA72_0 = input.LA(1);

                         
                        int index72_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA72_0==RULE_ID) ) {s = 1;}

                        else if ( (LA72_0==54) ) {s = 2;}

                        else if ( (LA72_0==38) && (synpred31_InternalEditor())) {s = 3;}

                        else if ( (LA72_0==57) && (synpred31_InternalEditor())) {s = 4;}

                        else if ( ((LA72_0>=RULE_STRING && LA72_0<=RULE_DECIMAL)||LA72_0==18||LA72_0==35||(LA72_0>=42 && LA72_0<=43)||LA72_0==48||LA72_0==56||LA72_0==60||LA72_0==62||(LA72_0>=65 && LA72_0<=68)||(LA72_0>=70 && LA72_0<=77)) ) {s = 5;}

                        else if ( (LA72_0==55) ) {s = 29;}

                         
                        input.seek(index72_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA72_1 = input.LA(1);

                         
                        int index72_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalEditor()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index72_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA72_2 = input.LA(1);

                         
                        int index72_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalEditor()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index72_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 72, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA74_eotS =
        "\103\uffff";
    static final String DFA74_eofS =
        "\1\2\102\uffff";
    static final String DFA74_minS =
        "\1\4\1\0\101\uffff";
    static final String DFA74_maxS =
        "\1\117\1\0\101\uffff";
    static final String DFA74_acceptS =
        "\2\uffff\1\2\77\uffff\1\1";
    static final String DFA74_specialS =
        "\1\uffff\1\0\101\uffff}>";
    static final String[] DFA74_transitionS = {
            "\5\2\11\uffff\4\2\1\uffff\41\2\1\1\1\uffff\13\2\1\uffff\12\2",
            "\1\uffff",
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
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA74_eot = DFA.unpackEncodedString(DFA74_eotS);
    static final short[] DFA74_eof = DFA.unpackEncodedString(DFA74_eofS);
    static final char[] DFA74_min = DFA.unpackEncodedStringToUnsignedChars(DFA74_minS);
    static final char[] DFA74_max = DFA.unpackEncodedStringToUnsignedChars(DFA74_maxS);
    static final short[] DFA74_accept = DFA.unpackEncodedString(DFA74_acceptS);
    static final short[] DFA74_special = DFA.unpackEncodedString(DFA74_specialS);
    static final short[][] DFA74_transition;

    static {
        int numStates = DFA74_transitionS.length;
        DFA74_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA74_transition[i] = DFA.unpackEncodedString(DFA74_transitionS[i]);
        }
    }

    class DFA74 extends DFA {

        public DFA74(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 74;
            this.eot = DFA74_eot;
            this.eof = DFA74_eof;
            this.min = DFA74_min;
            this.max = DFA74_max;
            this.accept = DFA74_accept;
            this.special = DFA74_special;
            this.transition = DFA74_transition;
        }
        public String getDescription() {
            return "4352:3: ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA74_1 = input.LA(1);

                         
                        int index74_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalEditor()) ) {s = 66;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index74_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 74, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA76_eotS =
        "\103\uffff";
    static final String DFA76_eofS =
        "\1\33\102\uffff";
    static final String DFA76_minS =
        "\1\4\32\0\50\uffff";
    static final String DFA76_maxS =
        "\1\117\32\0\50\uffff";
    static final String DFA76_acceptS =
        "\33\uffff\1\2\46\uffff\1\1";
    static final String DFA76_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
        "\50\uffff}>";
    static final String[] DFA76_transitionS = {
            "\1\1\1\21\1\15\1\16\1\17\11\uffff\1\6\3\33\1\uffff\14\33\1\10"+
            "\6\33\1\4\1\3\4\33\1\2\5\33\1\32\1\33\1\12\1\uffff\2\33\1\23"+
            "\1\33\1\7\2\33\1\24\1\25\1\26\1\11\1\uffff\1\5\1\13\1\14\1\20"+
            "\1\22\1\27\1\30\1\31\2\33",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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

    static final short[] DFA76_eot = DFA.unpackEncodedString(DFA76_eotS);
    static final short[] DFA76_eof = DFA.unpackEncodedString(DFA76_eofS);
    static final char[] DFA76_min = DFA.unpackEncodedStringToUnsignedChars(DFA76_minS);
    static final char[] DFA76_max = DFA.unpackEncodedStringToUnsignedChars(DFA76_maxS);
    static final short[] DFA76_accept = DFA.unpackEncodedString(DFA76_acceptS);
    static final short[] DFA76_special = DFA.unpackEncodedString(DFA76_specialS);
    static final short[][] DFA76_transition;

    static {
        int numStates = DFA76_transitionS.length;
        DFA76_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA76_transition[i] = DFA.unpackEncodedString(DFA76_transitionS[i]);
        }
    }

    class DFA76 extends DFA {

        public DFA76(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 76;
            this.eot = DFA76_eot;
            this.eof = DFA76_eof;
            this.min = DFA76_min;
            this.max = DFA76_max;
            this.accept = DFA76_accept;
            this.special = DFA76_special;
            this.transition = DFA76_transition;
        }
        public String getDescription() {
            return "4674:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA76_1 = input.LA(1);

                         
                        int index76_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalEditor()) ) {s = 66;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA76_2 = input.LA(1);

                         
                        int index76_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalEditor()) ) {s = 66;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA76_3 = input.LA(1);

                         
                        int index76_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalEditor()) ) {s = 66;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA76_4 = input.LA(1);

                         
                        int index76_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalEditor()) ) {s = 66;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA76_5 = input.LA(1);

                         
                        int index76_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalEditor()) ) {s = 66;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA76_6 = input.LA(1);

                         
                        int index76_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalEditor()) ) {s = 66;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA76_7 = input.LA(1);

                         
                        int index76_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalEditor()) ) {s = 66;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA76_8 = input.LA(1);

                         
                        int index76_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalEditor()) ) {s = 66;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA76_9 = input.LA(1);

                         
                        int index76_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalEditor()) ) {s = 66;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA76_10 = input.LA(1);

                         
                        int index76_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalEditor()) ) {s = 66;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA76_11 = input.LA(1);

                         
                        int index76_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalEditor()) ) {s = 66;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA76_12 = input.LA(1);

                         
                        int index76_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalEditor()) ) {s = 66;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA76_13 = input.LA(1);

                         
                        int index76_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalEditor()) ) {s = 66;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA76_14 = input.LA(1);

                         
                        int index76_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalEditor()) ) {s = 66;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA76_15 = input.LA(1);

                         
                        int index76_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalEditor()) ) {s = 66;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA76_16 = input.LA(1);

                         
                        int index76_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalEditor()) ) {s = 66;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA76_17 = input.LA(1);

                         
                        int index76_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalEditor()) ) {s = 66;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA76_18 = input.LA(1);

                         
                        int index76_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalEditor()) ) {s = 66;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA76_19 = input.LA(1);

                         
                        int index76_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalEditor()) ) {s = 66;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA76_20 = input.LA(1);

                         
                        int index76_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalEditor()) ) {s = 66;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA76_21 = input.LA(1);

                         
                        int index76_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalEditor()) ) {s = 66;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA76_22 = input.LA(1);

                         
                        int index76_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalEditor()) ) {s = 66;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA76_23 = input.LA(1);

                         
                        int index76_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalEditor()) ) {s = 66;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA76_24 = input.LA(1);

                         
                        int index76_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalEditor()) ) {s = 66;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA76_25 = input.LA(1);

                         
                        int index76_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalEditor()) ) {s = 66;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA76_26 = input.LA(1);

                         
                        int index76_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalEditor()) ) {s = 66;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_26);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 76, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA91_eotS =
        "\104\uffff";
    static final String DFA91_eofS =
        "\1\2\103\uffff";
    static final String DFA91_minS =
        "\1\4\1\0\102\uffff";
    static final String DFA91_maxS =
        "\1\117\1\0\102\uffff";
    static final String DFA91_acceptS =
        "\2\uffff\1\2\100\uffff\1\1";
    static final String DFA91_specialS =
        "\1\uffff\1\0\102\uffff}>";
    static final String[] DFA91_transitionS = {
            "\5\2\11\uffff\21\2\1\1\25\2\1\uffff\13\2\1\uffff\12\2",
            "\1\uffff",
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
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA91_eot = DFA.unpackEncodedString(DFA91_eotS);
    static final short[] DFA91_eof = DFA.unpackEncodedString(DFA91_eofS);
    static final char[] DFA91_min = DFA.unpackEncodedStringToUnsignedChars(DFA91_minS);
    static final char[] DFA91_max = DFA.unpackEncodedStringToUnsignedChars(DFA91_maxS);
    static final short[] DFA91_accept = DFA.unpackEncodedString(DFA91_acceptS);
    static final short[] DFA91_special = DFA.unpackEncodedString(DFA91_specialS);
    static final short[][] DFA91_transition;

    static {
        int numStates = DFA91_transitionS.length;
        DFA91_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA91_transition[i] = DFA.unpackEncodedString(DFA91_transitionS[i]);
        }
    }

    class DFA91 extends DFA {

        public DFA91(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 91;
            this.eot = DFA91_eot;
            this.eof = DFA91_eof;
            this.min = DFA91_min;
            this.max = DFA91_max;
            this.accept = DFA91_accept;
            this.special = DFA91_special;
            this.transition = DFA91_transition;
        }
        public String getDescription() {
            return "5190:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA91_1 = input.LA(1);

                         
                        int index91_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred39_InternalEditor()) ) {s = 67;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index91_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 91, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleDomainmodel_in_entryRuleDomainmodel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainmodel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_ruleDomainmodel131 = new BitSet(new long[]{0x0000000000016002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleDomainmodel153 = new BitSet(new long[]{0x0000000000014002L});
    public static final BitSet FOLLOW_ruleClass_in_ruleDomainmodel175 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration212 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackageDeclaration222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rulePackageDeclaration259 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePackageDeclaration280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport316 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleImport363 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard479 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleQualifiedNameWithWildcard498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_entryRuleClass540 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleClass587 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClass604 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleClass622 = new BitSet(new long[]{0x0040004000000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleClass643 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleClass657 = new BitSet(new long[]{0x0000000003980000L});
    public static final BitSet FOLLOW_ruleVariableDef_in_ruleClass679 = new BitSet(new long[]{0x0000000003980000L});
    public static final BitSet FOLLOW_ruleValueDef_in_ruleClass706 = new BitSet(new long[]{0x0000000003980000L});
    public static final BitSet FOLLOW_ruleReference_in_ruleClass733 = new BitSet(new long[]{0x0000000003980000L});
    public static final BitSet FOLLOW_ruleFunctionDef_in_ruleClass760 = new BitSet(new long[]{0x0000000003980000L});
    public static final BitSet FOLLOW_19_in_ruleClass774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDef_in_entryRuleVariableDef810 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDef820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleVariableDef857 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableDef874 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleVariableDef891 = new BitSet(new long[]{0x0040004000000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleVariableDef912 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleVariableDef924 = new BitSet(new long[]{0x51410C08000401F0L,0x0000000000003FDEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleVariableDef945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueDef_in_entryRuleValueDef981 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueDef991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleValueDef1028 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValueDef1045 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleValueDef1062 = new BitSet(new long[]{0x0040004000000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleValueDef1083 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleValueDef1096 = new BitSet(new long[]{0x51410C08000401F0L,0x0000000000003FDEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleValueDef1117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_entryRuleReference1155 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReference1165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleReference1202 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReference1219 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleReference1236 = new BitSet(new long[]{0x0040004000000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleReference1257 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleReference1270 = new BitSet(new long[]{0x51410C08000401F0L,0x0000000000003FDEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleReference1291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDef_in_entryRuleFunctionDef1329 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionDef1339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleFunctionDef1376 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionDef1393 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleFunctionDef1410 = new BitSet(new long[]{0x0040004000000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleFunctionDef1431 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFunctionDef1443 = new BitSet(new long[]{0x51410C08000C01F0L,0x0000000000003FDEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleFunctionDef1464 = new BitSet(new long[]{0x51410C08000C01F0L,0x0000000000003FDEL});
    public static final BitSet FOLLOW_19_in_ruleFunctionDef1477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_entryRuleXExpression1513 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression1523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXExpression1569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_entryRuleXAssignment1603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAssignment1613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXAssignment1671 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXAssignment1687 = new BitSet(new long[]{0x51410C08000401F0L,0x0000000000003FDEL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment1707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_ruleXAssignment1737 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleXAssignment1790 = new BitSet(new long[]{0x51410C08000401F0L,0x0000000000003FDEL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment1813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign1853 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpSingleAssign1864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleOpSingleAssign1901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign1941 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMultiAssign1952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOpMultiAssign1989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression2028 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrExpression2038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression2085 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_ruleXOrExpression2138 = new BitSet(new long[]{0x51410C08000401F0L,0x0000000000003FDEL});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression2161 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr2200 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOr2211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOpOr2248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression2287 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAndExpression2297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2344 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleXAndExpression2397 = new BitSet(new long[]{0x51410C08000401F0L,0x0000000000003FDEL});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2420 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd2459 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd2470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpAnd2507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression2546 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXEqualityExpression2556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2603 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_ruleXEqualityExpression2656 = new BitSet(new long[]{0x51410C08000401F0L,0x0000000000003FDEL});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2679 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_entryRuleOpEquality2718 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpEquality2729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOpEquality2767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOpEquality2786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression2826 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXRelationalExpression2836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2883 = new BitSet(new long[]{0x0000000F80000002L});
    public static final BitSet FOLLOW_31_in_ruleXRelationalExpression2919 = new BitSet(new long[]{0x0040004000000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXRelationalExpression2942 = new BitSet(new long[]{0x0000000F80000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleXRelationalExpression3003 = new BitSet(new long[]{0x51410C08000401F0L,0x0000000000003FDEL});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression3026 = new BitSet(new long[]{0x0000000F80000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare3066 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare3077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpCompare3115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpCompare3134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpCompare3153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpCompare3172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression3212 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOtherOperatorExpression3222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3269 = new BitSet(new long[]{0x000003FC00000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression3322 = new BitSet(new long[]{0x51410C08000401F0L,0x0000000000003FDEL});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3345 = new BitSet(new long[]{0x000003FC00000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther3384 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOther3395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpOther3433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOpOther3452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOpOther3471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpOther3491 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleOpOther3522 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleOpOther3535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpOther3556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpOther3578 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleOpOther3609 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleOpOther3622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpOther3643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleOpOther3664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleOpOther3683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleOpOther3702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression3742 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAdditiveExpression3752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3799 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression3852 = new BitSet(new long[]{0x51410C08000401F0L,0x0000000000003FDEL});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3875 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd3914 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd3925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleOpAdd3963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleOpAdd3982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression4022 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMultiplicativeExpression4032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression4079 = new BitSet(new long[]{0x0000F00000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression4132 = new BitSet(new long[]{0x51410C08000401F0L,0x0000000000003FDEL});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression4155 = new BitSet(new long[]{0x0000F00000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_entryRuleOpMulti4194 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMulti4205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleOpMulti4243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleOpMulti4262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleOpMulti4281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleOpMulti4300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation4340 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnaryOperation4350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleXUnaryOperation4408 = new BitSet(new long[]{0x51410C08000401F0L,0x0000000000003FDEL});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary4494 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary4505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleOpUnary4543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleOpUnary4562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleOpUnary4581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression4621 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCastedExpression4631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression4678 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49_in_ruleXCastedExpression4713 = new BitSet(new long[]{0x0040004000000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression4736 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall4774 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMemberFeatureCall4784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall4831 = new BitSet(new long[]{0x001C000000000002L});
    public static final BitSet FOLLOW_50_in_ruleXMemberFeatureCall4880 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4903 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall4919 = new BitSet(new long[]{0x51410C08000401F0L,0x0000000000003FDEL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall4941 = new BitSet(new long[]{0x001C000000000002L});
    public static final BitSet FOLLOW_50_in_ruleXMemberFeatureCall5027 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_51_in_ruleXMemberFeatureCall5051 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_52_in_ruleXMemberFeatureCall5088 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_35_in_ruleXMemberFeatureCall5117 = new BitSet(new long[]{0x0040004000000010L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall5138 = new BitSet(new long[]{0x0020000400000000L});
    public static final BitSet FOLLOW_53_in_ruleXMemberFeatureCall5151 = new BitSet(new long[]{0x0040004000000010L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall5172 = new BitSet(new long[]{0x0020000400000000L});
    public static final BitSet FOLLOW_34_in_ruleXMemberFeatureCall5186 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall5211 = new BitSet(new long[]{0x015C000000000002L});
    public static final BitSet FOLLOW_54_in_ruleXMemberFeatureCall5245 = new BitSet(new long[]{0x53C10C48000401F0L,0x0000000000003FDEL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall5330 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall5358 = new BitSet(new long[]{0x00A0000000000000L});
    public static final BitSet FOLLOW_53_in_ruleXMemberFeatureCall5371 = new BitSet(new long[]{0x51410C08000401F0L,0x0000000000003FDEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall5392 = new BitSet(new long[]{0x00A0000000000000L});
    public static final BitSet FOLLOW_55_in_ruleXMemberFeatureCall5409 = new BitSet(new long[]{0x011C000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall5444 = new BitSet(new long[]{0x001C000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression5484 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression5494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression5541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression5568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression5595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression5622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression5649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression5676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression5703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression5730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression5757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression5784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression5811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression5838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression5865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_entryRuleXLiteral5900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXLiteral5910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXLiteral5970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral5998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_ruleXLiteral6025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_ruleXLiteral6052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXLiteral6079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_ruleXLiteral6106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_entryRuleXClosure6141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXClosure6151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleXClosure6211 = new BitSet(new long[]{0x57410C48009401F0L,0x0000000000003FDEL});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure6284 = new BitSet(new long[]{0x0220000000000000L});
    public static final BitSet FOLLOW_53_in_ruleXClosure6297 = new BitSet(new long[]{0x0040004000000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure6318 = new BitSet(new long[]{0x0220000000000000L});
    public static final BitSet FOLLOW_57_in_ruleXClosure6340 = new BitSet(new long[]{0x55410C08009401F0L,0x0000000000003FDEL});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_ruleXClosure6377 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_ruleXClosure6389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure6425 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInClosure6435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure6491 = new BitSet(new long[]{0x59410C08009401F2L,0x0000000000003FDEL});
    public static final BitSet FOLLOW_59_in_ruleXExpressionInClosure6504 = new BitSet(new long[]{0x51410C08009401F2L,0x0000000000003FDEL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure6544 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXShortClosure6554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6662 = new BitSet(new long[]{0x0220000000000000L});
    public static final BitSet FOLLOW_53_in_ruleXShortClosure6675 = new BitSet(new long[]{0x0040004000000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6696 = new BitSet(new long[]{0x0220000000000000L});
    public static final BitSet FOLLOW_57_in_ruleXShortClosure6718 = new BitSet(new long[]{0x51410C08000401F0L,0x0000000000003FDEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXShortClosure6754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression6790 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression6800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleXParenthesizedExpression6837 = new BitSet(new long[]{0x51410C08000401F0L,0x0000000000003FDEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression6859 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleXParenthesizedExpression6870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression6906 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression6916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleXIfExpression6962 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleXIfExpression6974 = new BitSet(new long[]{0x51410C08000401F0L,0x0000000000003FDEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6995 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleXIfExpression7007 = new BitSet(new long[]{0x51410C08000401F0L,0x0000000000003FDEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression7028 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleXIfExpression7049 = new BitSet(new long[]{0x51410C08000401F0L,0x0000000000003FDEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression7071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression7109 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSwitchExpression7119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleXSwitchExpression7165 = new BitSet(new long[]{0x51410C08000401F0L,0x0000000000003FDEL});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression7208 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleXSwitchExpression7220 = new BitSet(new long[]{0x51410C08000401F0L,0x0000000000003FDEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression7244 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_54_in_ruleXSwitchExpression7288 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression7309 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleXSwitchExpression7321 = new BitSet(new long[]{0x51410C08000401F0L,0x0000000000003FDEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression7344 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleXSwitchExpression7356 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleXSwitchExpression7370 = new BitSet(new long[]{0x0040004000200010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleXCasePart_in_ruleXSwitchExpression7391 = new BitSet(new long[]{0x8040004000280010L,0x0000000000000001L});
    public static final BitSet FOLLOW_63_in_ruleXSwitchExpression7405 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleXSwitchExpression7417 = new BitSet(new long[]{0x51410C08000401F0L,0x0000000000003FDEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression7438 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleXSwitchExpression7452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCasePart_in_entryRuleXCasePart7488 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCasePart7498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCasePart7544 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleXCasePart7558 = new BitSet(new long[]{0x51410C08000401F0L,0x0000000000003FDEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart7579 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleXCasePart7593 = new BitSet(new long[]{0x51410C08000401F0L,0x0000000000003FDEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart7614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression7650 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXForLoopExpression7660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleXForLoopExpression7706 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleXForLoopExpression7718 = new BitSet(new long[]{0x0040004000000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression7739 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleXForLoopExpression7751 = new BitSet(new long[]{0x51410C08000401F0L,0x0000000000003FDEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression7772 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleXForLoopExpression7784 = new BitSet(new long[]{0x51410C08000401F0L,0x0000000000003FDEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression7805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression7841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXWhileExpression7851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleXWhileExpression7897 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleXWhileExpression7909 = new BitSet(new long[]{0x51410C08000401F0L,0x0000000000003FDEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression7930 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleXWhileExpression7942 = new BitSet(new long[]{0x51410C08000401F0L,0x0000000000003FDEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression7963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression7999 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDoWhileExpression8009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleXDoWhileExpression8055 = new BitSet(new long[]{0x51410C08000401F0L,0x0000000000003FDEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression8076 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_ruleXDoWhileExpression8088 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleXDoWhileExpression8100 = new BitSet(new long[]{0x51410C08000401F0L,0x0000000000003FDEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression8121 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleXDoWhileExpression8133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression8169 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBlockExpression8179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleXBlockExpression8225 = new BitSet(new long[]{0x51410C08009C01F0L,0x0000000000003FDEL});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression8247 = new BitSet(new long[]{0x59410C08009C01F0L,0x0000000000003FDEL});
    public static final BitSet FOLLOW_59_in_ruleXBlockExpression8260 = new BitSet(new long[]{0x51410C08009C01F0L,0x0000000000003FDEL});
    public static final BitSet FOLLOW_19_in_ruleXBlockExpression8276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock8312 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInsideBlock8322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock8369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock8396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration8431 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXVariableDeclaration8441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleXVariableDeclaration8494 = new BitSet(new long[]{0x0040004000000010L});
    public static final BitSet FOLLOW_23_in_ruleXVariableDeclaration8525 = new BitSet(new long[]{0x0040004000000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration8573 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration8594 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration8623 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleXVariableDeclaration8637 = new BitSet(new long[]{0x51410C08000401F0L,0x0000000000003FDEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXVariableDeclaration8658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter8696 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmFormalParameter8706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter8752 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleJvmFormalParameter8774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter8810 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFullJvmFormalParameter8820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter8866 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter8887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall8923 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFeatureCall8933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall8990 = new BitSet(new long[]{0x0000000800000010L,0x0000000000000010L});
    public static final BitSet FOLLOW_35_in_ruleXFeatureCall9004 = new BitSet(new long[]{0x0040004000000010L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall9025 = new BitSet(new long[]{0x0020000400000000L});
    public static final BitSet FOLLOW_53_in_ruleXFeatureCall9038 = new BitSet(new long[]{0x0040004000000010L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall9059 = new BitSet(new long[]{0x0020000400000000L});
    public static final BitSet FOLLOW_34_in_ruleXFeatureCall9073 = new BitSet(new long[]{0x0000000800000010L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall9098 = new BitSet(new long[]{0x0140000000000002L});
    public static final BitSet FOLLOW_54_in_ruleXFeatureCall9132 = new BitSet(new long[]{0x53C10C48000401F0L,0x0000000000003FDEL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXFeatureCall9217 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall9245 = new BitSet(new long[]{0x00A0000000000000L});
    public static final BitSet FOLLOW_53_in_ruleXFeatureCall9258 = new BitSet(new long[]{0x51410C08000401F0L,0x0000000000003FDEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall9279 = new BitSet(new long[]{0x00A0000000000000L});
    public static final BitSet FOLLOW_55_in_ruleXFeatureCall9296 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXFeatureCall9331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper9369 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdOrSuper9380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleIdOrSuper9427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleIdOrSuper9451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier9492 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticQualifier9503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleStaticQualifier9550 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleStaticQualifier9568 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall9609 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXConstructorCall9619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleXConstructorCall9665 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXConstructorCall9688 = new BitSet(new long[]{0x0140000800000002L});
    public static final BitSet FOLLOW_35_in_ruleXConstructorCall9709 = new BitSet(new long[]{0x0040004000000010L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9731 = new BitSet(new long[]{0x0020000400000000L});
    public static final BitSet FOLLOW_53_in_ruleXConstructorCall9744 = new BitSet(new long[]{0x0040004000000010L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9765 = new BitSet(new long[]{0x0020000400000000L});
    public static final BitSet FOLLOW_34_in_ruleXConstructorCall9779 = new BitSet(new long[]{0x0140000000000002L});
    public static final BitSet FOLLOW_54_in_ruleXConstructorCall9802 = new BitSet(new long[]{0x53C10C48000401F0L,0x0000000000003FDEL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXConstructorCall9875 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall9903 = new BitSet(new long[]{0x00A0000000000000L});
    public static final BitSet FOLLOW_53_in_ruleXConstructorCall9916 = new BitSet(new long[]{0x51410C08000401F0L,0x0000000000003FDEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall9937 = new BitSet(new long[]{0x00A0000000000000L});
    public static final BitSet FOLLOW_55_in_ruleXConstructorCall9954 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXConstructorCall9989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral10026 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBooleanLiteral10036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleXBooleanLiteral10083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleXBooleanLiteral10107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral10157 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNullLiteral10167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleXNullLiteral10213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral10249 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNumberLiteral10259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleXNumberLiteral10314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral10350 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStringLiteral10360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXStringLiteral10411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral10452 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTypeLiteral10462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleXTypeLiteral10508 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleXTypeLiteral10520 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral10543 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleXTypeLiteral10555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression10591 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXThrowExpression10601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleXThrowExpression10647 = new BitSet(new long[]{0x51410C08000401F0L,0x0000000000003FDEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXThrowExpression10668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression10704 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXReturnExpression10714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleXReturnExpression10760 = new BitSet(new long[]{0x51410C08000401F2L,0x0000000000003FDEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXReturnExpression10791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression10828 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression10838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleXTryCatchFinallyExpression10884 = new BitSet(new long[]{0x51410C08000401F0L,0x0000000000003FDEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10905 = new BitSet(new long[]{0x0000000000000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression10935 = new BitSet(new long[]{0x0000000000000002L,0x000000000000C000L});
    public static final BitSet FOLLOW_78_in_ruleXTryCatchFinallyExpression10957 = new BitSet(new long[]{0x51410C08000401F0L,0x0000000000003FDEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleXTryCatchFinallyExpression11001 = new BitSet(new long[]{0x51410C08000401F0L,0x0000000000003FDEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression11022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause11060 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCatchClause11070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleXCatchClause11115 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleXCatchClause11128 = new BitSet(new long[]{0x0040004000000010L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause11149 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleXCatchClause11161 = new BitSet(new long[]{0x51410C08000401F0L,0x0000000000003FDEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCatchClause11182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName11219 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName11230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName11277 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_ruleQualifiedName11305 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName11328 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber11382 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber11393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_ruleNumber11437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber11465 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber11491 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_ruleNumber11511 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber11527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber11553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference11606 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmTypeReference11616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference11664 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_ruleJvmTypeReference11702 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_ruleJvmTypeReference11714 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference11746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef11781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFunctionTypeRef11791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleXFunctionTypeRef11829 = new BitSet(new long[]{0x00C0004000000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11851 = new BitSet(new long[]{0x00A0000000000000L});
    public static final BitSet FOLLOW_53_in_ruleXFunctionTypeRef11864 = new BitSet(new long[]{0x0040004000000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11885 = new BitSet(new long[]{0x00A0000000000000L});
    public static final BitSet FOLLOW_55_in_ruleXFunctionTypeRef11901 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleXFunctionTypeRef11915 = new BitSet(new long[]{0x0040004000000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference11972 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference11982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference12030 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_ruleJvmParameterizedTypeReference12051 = new BitSet(new long[]{0x0040004000000010L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference12073 = new BitSet(new long[]{0x0020000400000000L});
    public static final BitSet FOLLOW_53_in_ruleJvmParameterizedTypeReference12086 = new BitSet(new long[]{0x0040004000000010L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference12107 = new BitSet(new long[]{0x0020000400000000L});
    public static final BitSet FOLLOW_34_in_ruleJvmParameterizedTypeReference12121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference12159 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference12169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference12216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference12243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference12278 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference12288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleJvmWildcardTypeReference12334 = new BitSet(new long[]{0x0000000000020002L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference12356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference12383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound12421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBound12431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleJvmUpperBound12468 = new BitSet(new long[]{0x0040004000000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound12489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded12525 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded12535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleJvmUpperBoundAnded12572 = new BitSet(new long[]{0x0040004000000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded12593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound12629 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmLowerBound12639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleJvmLowerBound12676 = new BitSet(new long[]{0x0040004000000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound12697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID12736 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID12747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID12786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_synpred1_InternalEditor1758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred2_InternalEditor2106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred3_InternalEditor2365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_synpred4_InternalEditor2624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_synpred5_InternalEditor2900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred6_InternalEditor2971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred7_InternalEditor3290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_synpred8_InternalEditor3506 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_synpred8_InternalEditor3511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_synpred9_InternalEditor3593 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_synpred9_InternalEditor3598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred10_InternalEditor3820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_synpred11_InternalEditor4100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_synpred12_InternalEditor4694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_synpred13_InternalEditor4848 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred13_InternalEditor4857 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred13_InternalEditor4863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_synpred14_InternalEditor4966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_synpred14_InternalEditor4980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_synpred14_InternalEditor5000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_synpred15_InternalEditor5227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalEditor5279 = new BitSet(new long[]{0x0220000000000000L});
    public static final BitSet FOLLOW_53_in_synpred16_InternalEditor5286 = new BitSet(new long[]{0x0040004000000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalEditor5293 = new BitSet(new long[]{0x0220000000000000L});
    public static final BitSet FOLLOW_57_in_synpred16_InternalEditor5307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_synpred17_InternalEditor5427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_synpred18_InternalEditor5951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalEditor6230 = new BitSet(new long[]{0x0220000000000000L});
    public static final BitSet FOLLOW_53_in_synpred20_InternalEditor6237 = new BitSet(new long[]{0x0040004000000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalEditor6244 = new BitSet(new long[]{0x0220000000000000L});
    public static final BitSet FOLLOW_57_in_synpred20_InternalEditor6258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_synpred22_InternalEditor7041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred23_InternalEditor7183 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_synpred23_InternalEditor7189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_synpred24_InternalEditor7265 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred24_InternalEditor7272 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_synpred24_InternalEditor7278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_synpred25_InternalEditor8543 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred25_InternalEditor8552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_synpred26_InternalEditor9114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalEditor9166 = new BitSet(new long[]{0x0220000000000000L});
    public static final BitSet FOLLOW_53_in_synpred27_InternalEditor9173 = new BitSet(new long[]{0x0040004000000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalEditor9180 = new BitSet(new long[]{0x0220000000000000L});
    public static final BitSet FOLLOW_57_in_synpred27_InternalEditor9194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_synpred28_InternalEditor9314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_synpred29_InternalEditor9701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_synpred30_InternalEditor9794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalEditor9824 = new BitSet(new long[]{0x0220000000000000L});
    public static final BitSet FOLLOW_53_in_synpred31_InternalEditor9831 = new BitSet(new long[]{0x0040004000000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalEditor9838 = new BitSet(new long[]{0x0220000000000000L});
    public static final BitSet FOLLOW_57_in_synpred31_InternalEditor9852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_synpred32_InternalEditor9972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_synpred33_InternalEditor10774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_synpred34_InternalEditor10919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_synpred35_InternalEditor10949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_synpred37_InternalEditor11296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_synpred38_InternalEditor11679 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_synpred38_InternalEditor11683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_synpred39_InternalEditor12043 = new BitSet(new long[]{0x0000000000000002L});

}