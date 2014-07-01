package com.euclideanspace.aldor.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEditorLexer extends Lexer {
    public static final int RULE_KW_GE=12;
    public static final int RULE_KW_DOT=55;
    public static final int RULE_KW_AMPERSAND=57;
    public static final int RULE_ANY_OTHER=71;
    public static final int RULE_KW_WEDGE=8;
    public static final int RULE_PERCENT=67;
    public static final int RULE_PRIMEPERCENT=68;
    public static final int RULE_KW_GT=13;
    public static final int EOF=-1;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int RULE_KW_IMPLIES=65;
    public static final int T__92=92;
    public static final int RULE_KW_2EQ=32;
    public static final int T__90=90;
    public static final int RULE_KW_2LT=17;
    public static final int RULE_KW_DOLLAR=37;
    public static final int RULE_KW_TILDE=51;
    public static final int RULE_KW_PLUSMINUS=21;
    public static final int RULE_KW_MAPSTAR=6;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int RULE_KW_COLON=30;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int T__80=80;
    public static final int RULE_KW_MINUS=20;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_KW_MARROW=33;
    public static final int RULE_KW_MAPSTO=34;
    public static final int RULE_KW_SLASH=23;
    public static final int RULE_KW_2COLON=56;
    public static final int RULE_TK_ID=49;
    public static final int RULE_PLUSDOLAR=62;
    public static final int RULE_ELLIPSIS=69;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int RULE_KW_TILDEE=10;
    public static final int T__88=88;
    public static final int RULE_KW_CCURLY=48;
    public static final int RULE_MACROVALUE=54;
    public static final int T__72=72;
    public static final int RULE_TK_POSTDOC=45;
    public static final int RULE_KW_2GT=14;
    public static final int RULE_SUMLIST=70;
    public static final int RULE_KW_ASSIGN=66;
    public static final int T__76=76;
    public static final int RULE_KW_COLONSTAR=31;
    public static final int RULE_KW_OBRACK=40;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int RULE_KW_BAR=36;
    public static final int T__73=73;
    public static final int RULE_KW_CBRACK=41;
    public static final int RULE_KW_RARROW=4;
    public static final int T__79=79;
    public static final int RULE_KW_AT=29;
    public static final int T__78=78;
    public static final int T__77=77;
    public static final int RULE_KW_OPAREN=38;
    public static final int RULE_TIMESDOLAR=60;
    public static final int RULE_TK_PREDOC=44;
    public static final int RULE_KW_CPAREN=39;
    public static final int RULE_KW_LT=16;
    public static final int RULE_KW_STAR=22;
    public static final int RULE_KW_HATE=11;
    public static final int RULE_KW_PLUS=19;
    public static final int RULE_KW_SEMICOLON=46;
    public static final int RULE_KW_SHARP=50;
    public static final int RULE_KW_LE=15;
    public static final int RULE_EQUALSDOLAR=64;
    public static final int T__103=103;
    public static final int RULE_KW_QUOTE=42;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int RULE_KW_BACKSLASH=24;
    public static final int RULE_KW_MAPSTOSTAR=35;
    public static final int RULE_KW_VEE=7;
    public static final int RULE_KW_HAT=26;
    public static final int RULE_KW_LARROW=5;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int RULE_KW_EQ=9;
    public static final int RULE_KW_NEWLINE=53;
    public static final int RULE_TK_STRING=28;
    public static final int RULE_MINUSDOLAR=63;
    public static final int RULE_BACKSLASHBACKSLASH=59;
    public static final int RULE_KW_OCURLY=47;
    public static final int RULE_SLASHSLASH=58;
    public static final int RULE_DIVDOLAR=61;
    public static final int RULE_KW_COMMA=43;
    public static final int RULE_KW_2STAR=25;
    public static final int RULE_KW_2DOT=18;
    public static final int RULE_WS=52;
    public static final int RULE_TK_INT=27;

    // delegates
    // delegators

    public InternalEditorLexer() {;} 
    public InternalEditorLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalEditorLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g"; }

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:11:7: ( 'temp19' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:11:9: 'temp19'
            {
            match("temp19"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12:7: ( 'temp20' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12:9: 'temp20'
            {
            match("temp20"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:13:7: ( 'temp27' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:13:9: 'temp27'
            {
            match("temp27"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:14:7: ( 'temp31' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:14:9: 'temp31'
            {
            match("temp31"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:15:7: ( 'temp32' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:15:9: 'temp32'
            {
            match("temp32"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:16:7: ( 'temp41' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:16:9: 'temp41'
            {
            match("temp41"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:17:7: ( 'temp52' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:17:9: 'temp52'
            {
            match("temp52"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:18:7: ( 'is' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:18:9: 'is'
            {
            match("is"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:19:7: ( 'isnt' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:19:9: 'isnt'
            {
            match("isnt"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:20:7: ( 'case' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:20:9: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:21:7: ( 'by' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:21:9: 'by'
            {
            match("by"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:22:7: ( 'mod' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:22:9: 'mod'
            {
            match("mod"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:23:7: ( 'quo' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:23:9: 'quo'
            {
            match("quo"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:24:7: ( 'rem' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:24:9: 'rem'
            {
            match("rem"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:25:7: ( 'exquo' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:25:9: 'exquo'
            {
            match("exquo"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:26:7: ( 'macro' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:26:9: 'macro'
            {
            match("macro"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:27:7: ( 'extend' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:27:9: 'extend'
            {
            match("extend"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:28:7: ( 'local' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:28:9: 'local'
            {
            match("local"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:29:7: ( 'free' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:29:9: 'free'
            {
            match("free"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:30:7: ( 'fluid' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:30:9: 'fluid'
            {
            match("fluid"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:31:7: ( 'default' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:31:9: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:32:7: ( 'define' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:32:9: 'define'
            {
            match("define"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:33:7: ( 'fix' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:33:9: 'fix'
            {
            match("fix"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:34:7: ( 'inline' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:34:9: 'inline'
            {
            match("inline"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:35:7: ( 'import' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:35:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:36:7: ( 'export' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:36:9: 'export'
            {
            match("export"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:37:7: ( 'to' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:37:9: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:38:7: ( 'from' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:38:9: 'from'
            {
            match("from"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:39:8: ( 'where' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:39:10: 'where'
            {
            match("where"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:40:8: ( 'assign' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:40:10: 'assign'
            {
            match("assign"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:41:8: ( 'of' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:41:10: 'of'
            {
            match("of"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:42:8: ( 'in' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:42:10: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:43:8: ( 'always' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:43:10: 'always'
            {
            match("always"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "T__105"
    public final void mT__105() throws RecognitionException {
        try {
            int _type = T__105;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:44:8: ( 'finally' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:44:10: 'finally'
            {
            match("finally"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__105"

    // $ANTLR start "T__106"
    public final void mT__106() throws RecognitionException {
        try {
            int _type = T__106;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:45:8: ( 'temp30' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:45:10: 'temp30'
            {
            match("temp30"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__106"

    // $ANTLR start "RULE_TK_ID"
    public final void mRULE_TK_ID() throws RecognitionException {
        try {
            int _type = RULE_TK_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12537:12: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' . ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' . | '0' .. '9' )* ( '!' )? ( '?' )? )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12537:14: ( 'a' .. 'z' | 'A' .. 'Z' | '_' . ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' . | '0' .. '9' )* ( '!' )? ( '?' )?
            {
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12537:14: ( 'a' .. 'z' | 'A' .. 'Z' | '_' . )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'f':
            case 'g':
            case 'h':
            case 'i':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'o':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'u':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                {
                alt1=1;
                }
                break;
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
            case 'G':
            case 'H':
            case 'I':
            case 'J':
            case 'K':
            case 'L':
            case 'M':
            case 'N':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
            case 'T':
            case 'U':
            case 'V':
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
                {
                alt1=2;
                }
                break;
            case '_':
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12537:15: 'a' .. 'z'
                    {
                    matchRange('a','z'); 

                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12537:24: 'A' .. 'Z'
                    {
                    matchRange('A','Z'); 

                    }
                    break;
                case 3 :
                    // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12537:33: '_' .
                    {
                    match('_'); 
                    matchAny(); 

                    }
                    break;

            }

            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12537:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' . | '0' .. '9' )*
            loop2:
            do {
                int alt2=5;
                switch ( input.LA(1) ) {
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 't':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    alt2=1;
                    }
                    break;
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                case 'G':
                case 'H':
                case 'I':
                case 'J':
                case 'K':
                case 'L':
                case 'M':
                case 'N':
                case 'O':
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                case 'T':
                case 'U':
                case 'V':
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    {
                    alt2=2;
                    }
                    break;
                case '_':
                    {
                    alt2=3;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    {
                    alt2=4;
                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12537:41: 'a' .. 'z'
            	    {
            	    matchRange('a','z'); 

            	    }
            	    break;
            	case 2 :
            	    // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12537:50: 'A' .. 'Z'
            	    {
            	    matchRange('A','Z'); 

            	    }
            	    break;
            	case 3 :
            	    // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12537:59: '_' .
            	    {
            	    match('_'); 
            	    matchAny(); 

            	    }
            	    break;
            	case 4 :
            	    // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12537:65: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12537:76: ( '!' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='!') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12537:76: '!'
                    {
                    match('!'); 

                    }
                    break;

            }

            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12537:81: ( '?' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='?') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12537:81: '?'
                    {
                    match('?'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TK_ID"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12539:9: ( ( ' ' | '\\t' )+ )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12539:11: ( ' ' | '\\t' )+
            {
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12539:11: ( ' ' | '\\t' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='\t'||LA5_0==' ') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_KW_NEWLINE"
    public final void mRULE_KW_NEWLINE() throws RecognitionException {
        try {
            int _type = RULE_KW_NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12541:17: ( ( '\\r' | '\\n' ) )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12541:19: ( '\\r' | '\\n' )
            {
            if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_NEWLINE"

    // $ANTLR start "RULE_TK_PREDOC"
    public final void mRULE_TK_PREDOC() throws RecognitionException {
        try {
            int _type = RULE_TK_PREDOC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12543:16: ( '--' (~ ( ( '\\n' | '\\r' ) ) )* )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12543:18: '--' (~ ( ( '\\n' | '\\r' ) ) )*
            {
            match("--"); 

            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12543:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\u0000' && LA6_0<='\t')||(LA6_0>='\u000B' && LA6_0<='\f')||(LA6_0>='\u000E' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12543:23: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TK_PREDOC"

    // $ANTLR start "RULE_TK_POSTDOC"
    public final void mRULE_TK_POSTDOC() throws RecognitionException {
        try {
            int _type = RULE_TK_POSTDOC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12545:17: ( '++' (~ ( ( '\\n' | '\\r' ) ) )* )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12545:19: '++' (~ ( ( '\\n' | '\\r' ) ) )*
            {
            match("++"); 

            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12545:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='\u0000' && LA7_0<='\t')||(LA7_0>='\u000B' && LA7_0<='\f')||(LA7_0>='\u000E' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12545:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TK_POSTDOC"

    // $ANTLR start "RULE_MACROVALUE"
    public final void mRULE_MACROVALUE() throws RecognitionException {
        try {
            int _type = RULE_MACROVALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12547:17: ( '===>' (~ ( ( '\\n' | '\\r' ) ) )* )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12547:19: '===>' (~ ( ( '\\n' | '\\r' ) ) )*
            {
            match("===>"); 

            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12547:26: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12547:26: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MACROVALUE"

    // $ANTLR start "RULE_TK_STRING"
    public final void mRULE_TK_STRING() throws RecognitionException {
        try {
            int _type = RULE_TK_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12549:16: ( '\"' (~ ( '\"' ) )* '\"' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12549:18: '\"' (~ ( '\"' ) )* '\"'
            {
            match('\"'); 
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12549:22: (~ ( '\"' ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='!')||(LA9_0>='#' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12549:22: ~ ( '\"' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TK_STRING"

    // $ANTLR start "RULE_TK_INT"
    public final void mRULE_TK_INT() throws RecognitionException {
        try {
            int _type = RULE_TK_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12551:13: ( ( '0' .. '9' )+ )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12551:15: ( '0' .. '9' )+
            {
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12551:15: ( '0' .. '9' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12551:16: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TK_INT"

    // $ANTLR start "RULE_KW_QUOTE"
    public final void mRULE_KW_QUOTE() throws RecognitionException {
        try {
            int _type = RULE_KW_QUOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12553:15: ( '\\'' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12553:17: '\\''
            {
            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_QUOTE"

    // $ANTLR start "RULE_KW_OPAREN"
    public final void mRULE_KW_OPAREN() throws RecognitionException {
        try {
            int _type = RULE_KW_OPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12555:16: ( '(' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12555:18: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_OPAREN"

    // $ANTLR start "RULE_KW_CPAREN"
    public final void mRULE_KW_CPAREN() throws RecognitionException {
        try {
            int _type = RULE_KW_CPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12557:16: ( ')' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12557:18: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_CPAREN"

    // $ANTLR start "RULE_KW_OCURLY"
    public final void mRULE_KW_OCURLY() throws RecognitionException {
        try {
            int _type = RULE_KW_OCURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12559:16: ( '{' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12559:18: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_OCURLY"

    // $ANTLR start "RULE_KW_CCURLY"
    public final void mRULE_KW_CCURLY() throws RecognitionException {
        try {
            int _type = RULE_KW_CCURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12561:16: ( '}' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12561:18: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_CCURLY"

    // $ANTLR start "RULE_KW_OBRACK"
    public final void mRULE_KW_OBRACK() throws RecognitionException {
        try {
            int _type = RULE_KW_OBRACK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12563:16: ( '[' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12563:18: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_OBRACK"

    // $ANTLR start "RULE_KW_CBRACK"
    public final void mRULE_KW_CBRACK() throws RecognitionException {
        try {
            int _type = RULE_KW_CBRACK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12565:16: ( ']' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12565:18: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_CBRACK"

    // $ANTLR start "RULE_KW_2LT"
    public final void mRULE_KW_2LT() throws RecognitionException {
        try {
            int _type = RULE_KW_2LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12567:13: ( '<<' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12567:15: '<<'
            {
            match("<<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_2LT"

    // $ANTLR start "RULE_KW_2GT"
    public final void mRULE_KW_2GT() throws RecognitionException {
        try {
            int _type = RULE_KW_2GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12569:13: ( '>>' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12569:15: '>>'
            {
            match(">>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_2GT"

    // $ANTLR start "RULE_KW_MARROW"
    public final void mRULE_KW_MARROW() throws RecognitionException {
        try {
            int _type = RULE_KW_MARROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12571:16: ( '==>' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12571:18: '==>'
            {
            match("==>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_MARROW"

    // $ANTLR start "RULE_KW_BAR"
    public final void mRULE_KW_BAR() throws RecognitionException {
        try {
            int _type = RULE_KW_BAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12573:13: ( '|' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12573:15: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_BAR"

    // $ANTLR start "RULE_KW_DOT"
    public final void mRULE_KW_DOT() throws RecognitionException {
        try {
            int _type = RULE_KW_DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12575:13: ( '.' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12575:15: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_DOT"

    // $ANTLR start "RULE_KW_2COLON"
    public final void mRULE_KW_2COLON() throws RecognitionException {
        try {
            int _type = RULE_KW_2COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12577:16: ( '::' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12577:18: '::'
            {
            match("::"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_2COLON"

    // $ANTLR start "RULE_KW_COLONSTAR"
    public final void mRULE_KW_COLONSTAR() throws RecognitionException {
        try {
            int _type = RULE_KW_COLONSTAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12579:19: ( ':*' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12579:21: ':*'
            {
            match(":*"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_COLONSTAR"

    // $ANTLR start "RULE_KW_COLON"
    public final void mRULE_KW_COLON() throws RecognitionException {
        try {
            int _type = RULE_KW_COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12581:15: ( ':' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12581:17: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_COLON"

    // $ANTLR start "RULE_KW_AT"
    public final void mRULE_KW_AT() throws RecognitionException {
        try {
            int _type = RULE_KW_AT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12583:12: ( '@' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12583:14: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_AT"

    // $ANTLR start "RULE_KW_COMMA"
    public final void mRULE_KW_COMMA() throws RecognitionException {
        try {
            int _type = RULE_KW_COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12585:15: ( ',' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12585:17: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_COMMA"

    // $ANTLR start "RULE_KW_SEMICOLON"
    public final void mRULE_KW_SEMICOLON() throws RecognitionException {
        try {
            int _type = RULE_KW_SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12587:19: ( ';' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12587:21: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_SEMICOLON"

    // $ANTLR start "RULE_KW_2STAR"
    public final void mRULE_KW_2STAR() throws RecognitionException {
        try {
            int _type = RULE_KW_2STAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12589:15: ( '**' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12589:17: '**'
            {
            match("**"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_2STAR"

    // $ANTLR start "RULE_KW_STAR"
    public final void mRULE_KW_STAR() throws RecognitionException {
        try {
            int _type = RULE_KW_STAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12591:14: ( '*' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12591:16: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_STAR"

    // $ANTLR start "RULE_KW_PLUS"
    public final void mRULE_KW_PLUS() throws RecognitionException {
        try {
            int _type = RULE_KW_PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12593:14: ( '+' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12593:16: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_PLUS"

    // $ANTLR start "RULE_KW_MINUS"
    public final void mRULE_KW_MINUS() throws RecognitionException {
        try {
            int _type = RULE_KW_MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12595:15: ( '-' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12595:17: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_MINUS"

    // $ANTLR start "RULE_KW_PLUSMINUS"
    public final void mRULE_KW_PLUSMINUS() throws RecognitionException {
        try {
            int _type = RULE_KW_PLUSMINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12597:19: ( '+-' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12597:21: '+-'
            {
            match("+-"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_PLUSMINUS"

    // $ANTLR start "RULE_KW_LT"
    public final void mRULE_KW_LT() throws RecognitionException {
        try {
            int _type = RULE_KW_LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12599:12: ( '<' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12599:14: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_LT"

    // $ANTLR start "RULE_KW_GT"
    public final void mRULE_KW_GT() throws RecognitionException {
        try {
            int _type = RULE_KW_GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12601:12: ( '>' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12601:14: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_GT"

    // $ANTLR start "RULE_KW_LE"
    public final void mRULE_KW_LE() throws RecognitionException {
        try {
            int _type = RULE_KW_LE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12603:12: ( '<=' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12603:14: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_LE"

    // $ANTLR start "RULE_KW_GE"
    public final void mRULE_KW_GE() throws RecognitionException {
        try {
            int _type = RULE_KW_GE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12605:12: ( '>=' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12605:14: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_GE"

    // $ANTLR start "RULE_KW_EQ"
    public final void mRULE_KW_EQ() throws RecognitionException {
        try {
            int _type = RULE_KW_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12607:12: ( '=' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12607:14: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_EQ"

    // $ANTLR start "RULE_KW_TILDEE"
    public final void mRULE_KW_TILDEE() throws RecognitionException {
        try {
            int _type = RULE_KW_TILDEE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12609:16: ( '~=' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12609:18: '~='
            {
            match("~="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_TILDEE"

    // $ANTLR start "RULE_KW_HATE"
    public final void mRULE_KW_HATE() throws RecognitionException {
        try {
            int _type = RULE_KW_HATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12611:14: ( '^=' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12611:16: '^='
            {
            match("^="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_HATE"

    // $ANTLR start "RULE_KW_TILDE"
    public final void mRULE_KW_TILDE() throws RecognitionException {
        try {
            int _type = RULE_KW_TILDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12613:15: ( '~' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12613:17: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_TILDE"

    // $ANTLR start "RULE_KW_HAT"
    public final void mRULE_KW_HAT() throws RecognitionException {
        try {
            int _type = RULE_KW_HAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12615:13: ( '^' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12615:15: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_HAT"

    // $ANTLR start "RULE_KW_2DOT"
    public final void mRULE_KW_2DOT() throws RecognitionException {
        try {
            int _type = RULE_KW_2DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12617:14: ( '..' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12617:16: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_2DOT"

    // $ANTLR start "RULE_KW_SHARP"
    public final void mRULE_KW_SHARP() throws RecognitionException {
        try {
            int _type = RULE_KW_SHARP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12619:15: ( '#' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12619:17: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_SHARP"

    // $ANTLR start "RULE_KW_AMPERSAND"
    public final void mRULE_KW_AMPERSAND() throws RecognitionException {
        try {
            int _type = RULE_KW_AMPERSAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12621:19: ( '&' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12621:21: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_AMPERSAND"

    // $ANTLR start "RULE_KW_DOLLAR"
    public final void mRULE_KW_DOLLAR() throws RecognitionException {
        try {
            int _type = RULE_KW_DOLLAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12623:16: ( '$' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12623:18: '$'
            {
            match('$'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_DOLLAR"

    // $ANTLR start "RULE_KW_SLASH"
    public final void mRULE_KW_SLASH() throws RecognitionException {
        try {
            int _type = RULE_KW_SLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12625:15: ( '/' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12625:17: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_SLASH"

    // $ANTLR start "RULE_KW_BACKSLASH"
    public final void mRULE_KW_BACKSLASH() throws RecognitionException {
        try {
            int _type = RULE_KW_BACKSLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12627:19: ( '\\\\' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12627:21: '\\\\'
            {
            match('\\'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_BACKSLASH"

    // $ANTLR start "RULE_SLASHSLASH"
    public final void mRULE_SLASHSLASH() throws RecognitionException {
        try {
            int _type = RULE_SLASHSLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12629:17: ( '//' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12629:19: '//'
            {
            match("//"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SLASHSLASH"

    // $ANTLR start "RULE_BACKSLASHBACKSLASH"
    public final void mRULE_BACKSLASHBACKSLASH() throws RecognitionException {
        try {
            int _type = RULE_BACKSLASHBACKSLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12631:25: ( '\\\\\\\\' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12631:27: '\\\\\\\\'
            {
            match("\\\\"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BACKSLASHBACKSLASH"

    // $ANTLR start "RULE_KW_WEDGE"
    public final void mRULE_KW_WEDGE() throws RecognitionException {
        try {
            int _type = RULE_KW_WEDGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12633:15: ( '/\\\\' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12633:17: '/\\\\'
            {
            match("/\\"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_WEDGE"

    // $ANTLR start "RULE_KW_VEE"
    public final void mRULE_KW_VEE() throws RecognitionException {
        try {
            int _type = RULE_KW_VEE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12635:13: ( '\\\\/' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12635:15: '\\\\/'
            {
            match("\\/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_VEE"

    // $ANTLR start "RULE_TIMESDOLAR"
    public final void mRULE_TIMESDOLAR() throws RecognitionException {
        try {
            int _type = RULE_TIMESDOLAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12637:17: ( '*$' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12637:19: '*$'
            {
            match("*$"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TIMESDOLAR"

    // $ANTLR start "RULE_DIVDOLAR"
    public final void mRULE_DIVDOLAR() throws RecognitionException {
        try {
            int _type = RULE_DIVDOLAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12639:15: ( '/$' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12639:17: '/$'
            {
            match("/$"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIVDOLAR"

    // $ANTLR start "RULE_PLUSDOLAR"
    public final void mRULE_PLUSDOLAR() throws RecognitionException {
        try {
            int _type = RULE_PLUSDOLAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12641:16: ( '+$' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12641:18: '+$'
            {
            match("+$"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PLUSDOLAR"

    // $ANTLR start "RULE_MINUSDOLAR"
    public final void mRULE_MINUSDOLAR() throws RecognitionException {
        try {
            int _type = RULE_MINUSDOLAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12643:17: ( '-$' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12643:19: '-$'
            {
            match("-$"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MINUSDOLAR"

    // $ANTLR start "RULE_EQUALSDOLAR"
    public final void mRULE_EQUALSDOLAR() throws RecognitionException {
        try {
            int _type = RULE_EQUALSDOLAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12645:18: ( '=$' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12645:20: '=$'
            {
            match("=$"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EQUALSDOLAR"

    // $ANTLR start "RULE_KW_IMPLIES"
    public final void mRULE_KW_IMPLIES() throws RecognitionException {
        try {
            int _type = RULE_KW_IMPLIES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12647:17: ( '=>' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12647:19: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_IMPLIES"

    // $ANTLR start "RULE_KW_ASSIGN"
    public final void mRULE_KW_ASSIGN() throws RecognitionException {
        try {
            int _type = RULE_KW_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12649:16: ( ':=' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12649:18: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_ASSIGN"

    // $ANTLR start "RULE_KW_2EQ"
    public final void mRULE_KW_2EQ() throws RecognitionException {
        try {
            int _type = RULE_KW_2EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12651:13: ( '==' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12651:15: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_2EQ"

    // $ANTLR start "RULE_KW_RARROW"
    public final void mRULE_KW_RARROW() throws RecognitionException {
        try {
            int _type = RULE_KW_RARROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12653:16: ( '->' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12653:18: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_RARROW"

    // $ANTLR start "RULE_KW_LARROW"
    public final void mRULE_KW_LARROW() throws RecognitionException {
        try {
            int _type = RULE_KW_LARROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12655:16: ( '<-' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12655:18: '<-'
            {
            match("<-"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_LARROW"

    // $ANTLR start "RULE_KW_MAPSTO"
    public final void mRULE_KW_MAPSTO() throws RecognitionException {
        try {
            int _type = RULE_KW_MAPSTO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12657:16: ( '+->' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12657:18: '+->'
            {
            match("+->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_MAPSTO"

    // $ANTLR start "RULE_KW_MAPSTOSTAR"
    public final void mRULE_KW_MAPSTOSTAR() throws RecognitionException {
        try {
            int _type = RULE_KW_MAPSTOSTAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12659:20: ( '+->*' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12659:22: '+->*'
            {
            match("+->*"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_MAPSTOSTAR"

    // $ANTLR start "RULE_KW_MAPSTAR"
    public final void mRULE_KW_MAPSTAR() throws RecognitionException {
        try {
            int _type = RULE_KW_MAPSTAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12661:17: ( '->*' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12661:19: '->*'
            {
            match("->*"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_MAPSTAR"

    // $ANTLR start "RULE_PERCENT"
    public final void mRULE_PERCENT() throws RecognitionException {
        try {
            int _type = RULE_PERCENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12663:14: ( '%' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12663:16: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PERCENT"

    // $ANTLR start "RULE_PRIMEPERCENT"
    public final void mRULE_PRIMEPERCENT() throws RecognitionException {
        try {
            int _type = RULE_PRIMEPERCENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12665:19: ( '\\'%' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12665:21: '\\'%'
            {
            match("'%"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PRIMEPERCENT"

    // $ANTLR start "RULE_ELLIPSIS"
    public final void mRULE_ELLIPSIS() throws RecognitionException {
        try {
            int _type = RULE_ELLIPSIS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12667:15: ( '...' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12667:17: '...'
            {
            match("..."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ELLIPSIS"

    // $ANTLR start "RULE_SUMLIST"
    public final void mRULE_SUMLIST() throws RecognitionException {
        try {
            int _type = RULE_SUMLIST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12669:14: ( '+/' )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12669:16: '+/'
            {
            match("+/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SUMLIST"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12671:16: ( . )
            // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:12671:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:8: ( T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | RULE_TK_ID | RULE_WS | RULE_KW_NEWLINE | RULE_TK_PREDOC | RULE_TK_POSTDOC | RULE_MACROVALUE | RULE_TK_STRING | RULE_TK_INT | RULE_KW_QUOTE | RULE_KW_OPAREN | RULE_KW_CPAREN | RULE_KW_OCURLY | RULE_KW_CCURLY | RULE_KW_OBRACK | RULE_KW_CBRACK | RULE_KW_2LT | RULE_KW_2GT | RULE_KW_MARROW | RULE_KW_BAR | RULE_KW_DOT | RULE_KW_2COLON | RULE_KW_COLONSTAR | RULE_KW_COLON | RULE_KW_AT | RULE_KW_COMMA | RULE_KW_SEMICOLON | RULE_KW_2STAR | RULE_KW_STAR | RULE_KW_PLUS | RULE_KW_MINUS | RULE_KW_PLUSMINUS | RULE_KW_LT | RULE_KW_GT | RULE_KW_LE | RULE_KW_GE | RULE_KW_EQ | RULE_KW_TILDEE | RULE_KW_HATE | RULE_KW_TILDE | RULE_KW_HAT | RULE_KW_2DOT | RULE_KW_SHARP | RULE_KW_AMPERSAND | RULE_KW_DOLLAR | RULE_KW_SLASH | RULE_KW_BACKSLASH | RULE_SLASHSLASH | RULE_BACKSLASHBACKSLASH | RULE_KW_WEDGE | RULE_KW_VEE | RULE_TIMESDOLAR | RULE_DIVDOLAR | RULE_PLUSDOLAR | RULE_MINUSDOLAR | RULE_EQUALSDOLAR | RULE_KW_IMPLIES | RULE_KW_ASSIGN | RULE_KW_2EQ | RULE_KW_RARROW | RULE_KW_LARROW | RULE_KW_MAPSTO | RULE_KW_MAPSTOSTAR | RULE_KW_MAPSTAR | RULE_PERCENT | RULE_PRIMEPERCENT | RULE_ELLIPSIS | RULE_SUMLIST | RULE_ANY_OTHER )
        int alt11=103;
        alt11 = dfa11.predict(input);
        switch (alt11) {
            case 1 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:10: T__72
                {
                mT__72(); 

                }
                break;
            case 2 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:16: T__73
                {
                mT__73(); 

                }
                break;
            case 3 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:22: T__74
                {
                mT__74(); 

                }
                break;
            case 4 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:28: T__75
                {
                mT__75(); 

                }
                break;
            case 5 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:34: T__76
                {
                mT__76(); 

                }
                break;
            case 6 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:40: T__77
                {
                mT__77(); 

                }
                break;
            case 7 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:46: T__78
                {
                mT__78(); 

                }
                break;
            case 8 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:52: T__79
                {
                mT__79(); 

                }
                break;
            case 9 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:58: T__80
                {
                mT__80(); 

                }
                break;
            case 10 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:64: T__81
                {
                mT__81(); 

                }
                break;
            case 11 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:70: T__82
                {
                mT__82(); 

                }
                break;
            case 12 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:76: T__83
                {
                mT__83(); 

                }
                break;
            case 13 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:82: T__84
                {
                mT__84(); 

                }
                break;
            case 14 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:88: T__85
                {
                mT__85(); 

                }
                break;
            case 15 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:94: T__86
                {
                mT__86(); 

                }
                break;
            case 16 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:100: T__87
                {
                mT__87(); 

                }
                break;
            case 17 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:106: T__88
                {
                mT__88(); 

                }
                break;
            case 18 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:112: T__89
                {
                mT__89(); 

                }
                break;
            case 19 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:118: T__90
                {
                mT__90(); 

                }
                break;
            case 20 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:124: T__91
                {
                mT__91(); 

                }
                break;
            case 21 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:130: T__92
                {
                mT__92(); 

                }
                break;
            case 22 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:136: T__93
                {
                mT__93(); 

                }
                break;
            case 23 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:142: T__94
                {
                mT__94(); 

                }
                break;
            case 24 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:148: T__95
                {
                mT__95(); 

                }
                break;
            case 25 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:154: T__96
                {
                mT__96(); 

                }
                break;
            case 26 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:160: T__97
                {
                mT__97(); 

                }
                break;
            case 27 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:166: T__98
                {
                mT__98(); 

                }
                break;
            case 28 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:172: T__99
                {
                mT__99(); 

                }
                break;
            case 29 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:178: T__100
                {
                mT__100(); 

                }
                break;
            case 30 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:185: T__101
                {
                mT__101(); 

                }
                break;
            case 31 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:192: T__102
                {
                mT__102(); 

                }
                break;
            case 32 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:199: T__103
                {
                mT__103(); 

                }
                break;
            case 33 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:206: T__104
                {
                mT__104(); 

                }
                break;
            case 34 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:213: T__105
                {
                mT__105(); 

                }
                break;
            case 35 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:220: T__106
                {
                mT__106(); 

                }
                break;
            case 36 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:227: RULE_TK_ID
                {
                mRULE_TK_ID(); 

                }
                break;
            case 37 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:238: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 38 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:246: RULE_KW_NEWLINE
                {
                mRULE_KW_NEWLINE(); 

                }
                break;
            case 39 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:262: RULE_TK_PREDOC
                {
                mRULE_TK_PREDOC(); 

                }
                break;
            case 40 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:277: RULE_TK_POSTDOC
                {
                mRULE_TK_POSTDOC(); 

                }
                break;
            case 41 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:293: RULE_MACROVALUE
                {
                mRULE_MACROVALUE(); 

                }
                break;
            case 42 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:309: RULE_TK_STRING
                {
                mRULE_TK_STRING(); 

                }
                break;
            case 43 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:324: RULE_TK_INT
                {
                mRULE_TK_INT(); 

                }
                break;
            case 44 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:336: RULE_KW_QUOTE
                {
                mRULE_KW_QUOTE(); 

                }
                break;
            case 45 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:350: RULE_KW_OPAREN
                {
                mRULE_KW_OPAREN(); 

                }
                break;
            case 46 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:365: RULE_KW_CPAREN
                {
                mRULE_KW_CPAREN(); 

                }
                break;
            case 47 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:380: RULE_KW_OCURLY
                {
                mRULE_KW_OCURLY(); 

                }
                break;
            case 48 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:395: RULE_KW_CCURLY
                {
                mRULE_KW_CCURLY(); 

                }
                break;
            case 49 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:410: RULE_KW_OBRACK
                {
                mRULE_KW_OBRACK(); 

                }
                break;
            case 50 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:425: RULE_KW_CBRACK
                {
                mRULE_KW_CBRACK(); 

                }
                break;
            case 51 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:440: RULE_KW_2LT
                {
                mRULE_KW_2LT(); 

                }
                break;
            case 52 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:452: RULE_KW_2GT
                {
                mRULE_KW_2GT(); 

                }
                break;
            case 53 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:464: RULE_KW_MARROW
                {
                mRULE_KW_MARROW(); 

                }
                break;
            case 54 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:479: RULE_KW_BAR
                {
                mRULE_KW_BAR(); 

                }
                break;
            case 55 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:491: RULE_KW_DOT
                {
                mRULE_KW_DOT(); 

                }
                break;
            case 56 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:503: RULE_KW_2COLON
                {
                mRULE_KW_2COLON(); 

                }
                break;
            case 57 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:518: RULE_KW_COLONSTAR
                {
                mRULE_KW_COLONSTAR(); 

                }
                break;
            case 58 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:536: RULE_KW_COLON
                {
                mRULE_KW_COLON(); 

                }
                break;
            case 59 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:550: RULE_KW_AT
                {
                mRULE_KW_AT(); 

                }
                break;
            case 60 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:561: RULE_KW_COMMA
                {
                mRULE_KW_COMMA(); 

                }
                break;
            case 61 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:575: RULE_KW_SEMICOLON
                {
                mRULE_KW_SEMICOLON(); 

                }
                break;
            case 62 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:593: RULE_KW_2STAR
                {
                mRULE_KW_2STAR(); 

                }
                break;
            case 63 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:607: RULE_KW_STAR
                {
                mRULE_KW_STAR(); 

                }
                break;
            case 64 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:620: RULE_KW_PLUS
                {
                mRULE_KW_PLUS(); 

                }
                break;
            case 65 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:633: RULE_KW_MINUS
                {
                mRULE_KW_MINUS(); 

                }
                break;
            case 66 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:647: RULE_KW_PLUSMINUS
                {
                mRULE_KW_PLUSMINUS(); 

                }
                break;
            case 67 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:665: RULE_KW_LT
                {
                mRULE_KW_LT(); 

                }
                break;
            case 68 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:676: RULE_KW_GT
                {
                mRULE_KW_GT(); 

                }
                break;
            case 69 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:687: RULE_KW_LE
                {
                mRULE_KW_LE(); 

                }
                break;
            case 70 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:698: RULE_KW_GE
                {
                mRULE_KW_GE(); 

                }
                break;
            case 71 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:709: RULE_KW_EQ
                {
                mRULE_KW_EQ(); 

                }
                break;
            case 72 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:720: RULE_KW_TILDEE
                {
                mRULE_KW_TILDEE(); 

                }
                break;
            case 73 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:735: RULE_KW_HATE
                {
                mRULE_KW_HATE(); 

                }
                break;
            case 74 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:748: RULE_KW_TILDE
                {
                mRULE_KW_TILDE(); 

                }
                break;
            case 75 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:762: RULE_KW_HAT
                {
                mRULE_KW_HAT(); 

                }
                break;
            case 76 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:774: RULE_KW_2DOT
                {
                mRULE_KW_2DOT(); 

                }
                break;
            case 77 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:787: RULE_KW_SHARP
                {
                mRULE_KW_SHARP(); 

                }
                break;
            case 78 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:801: RULE_KW_AMPERSAND
                {
                mRULE_KW_AMPERSAND(); 

                }
                break;
            case 79 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:819: RULE_KW_DOLLAR
                {
                mRULE_KW_DOLLAR(); 

                }
                break;
            case 80 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:834: RULE_KW_SLASH
                {
                mRULE_KW_SLASH(); 

                }
                break;
            case 81 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:848: RULE_KW_BACKSLASH
                {
                mRULE_KW_BACKSLASH(); 

                }
                break;
            case 82 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:866: RULE_SLASHSLASH
                {
                mRULE_SLASHSLASH(); 

                }
                break;
            case 83 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:882: RULE_BACKSLASHBACKSLASH
                {
                mRULE_BACKSLASHBACKSLASH(); 

                }
                break;
            case 84 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:906: RULE_KW_WEDGE
                {
                mRULE_KW_WEDGE(); 

                }
                break;
            case 85 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:920: RULE_KW_VEE
                {
                mRULE_KW_VEE(); 

                }
                break;
            case 86 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:932: RULE_TIMESDOLAR
                {
                mRULE_TIMESDOLAR(); 

                }
                break;
            case 87 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:948: RULE_DIVDOLAR
                {
                mRULE_DIVDOLAR(); 

                }
                break;
            case 88 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:962: RULE_PLUSDOLAR
                {
                mRULE_PLUSDOLAR(); 

                }
                break;
            case 89 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:977: RULE_MINUSDOLAR
                {
                mRULE_MINUSDOLAR(); 

                }
                break;
            case 90 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:993: RULE_EQUALSDOLAR
                {
                mRULE_EQUALSDOLAR(); 

                }
                break;
            case 91 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:1010: RULE_KW_IMPLIES
                {
                mRULE_KW_IMPLIES(); 

                }
                break;
            case 92 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:1026: RULE_KW_ASSIGN
                {
                mRULE_KW_ASSIGN(); 

                }
                break;
            case 93 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:1041: RULE_KW_2EQ
                {
                mRULE_KW_2EQ(); 

                }
                break;
            case 94 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:1053: RULE_KW_RARROW
                {
                mRULE_KW_RARROW(); 

                }
                break;
            case 95 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:1068: RULE_KW_LARROW
                {
                mRULE_KW_LARROW(); 

                }
                break;
            case 96 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:1083: RULE_KW_MAPSTO
                {
                mRULE_KW_MAPSTO(); 

                }
                break;
            case 97 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:1098: RULE_KW_MAPSTOSTAR
                {
                mRULE_KW_MAPSTOSTAR(); 

                }
                break;
            case 98 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:1117: RULE_KW_MAPSTAR
                {
                mRULE_KW_MAPSTAR(); 

                }
                break;
            case 99 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:1133: RULE_PERCENT
                {
                mRULE_PERCENT(); 

                }
                break;
            case 100 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:1146: RULE_PRIMEPERCENT
                {
                mRULE_PRIMEPERCENT(); 

                }
                break;
            case 101 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:1164: RULE_ELLIPSIS
                {
                mRULE_ELLIPSIS(); 

                }
                break;
            case 102 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:1178: RULE_SUMLIST
                {
                mRULE_SUMLIST(); 

                }
                break;
            case 103 :
                // ../com.euclideanspace.aldor.ui/src-gen/com/euclideanspace/aldor/ui/contentassist/antlr/internal/InternalEditor.g:1:1191: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\1\uffff\16\64\2\uffff\1\61\2\uffff\1\115\1\122\1\126\1\61\1\uffff"+
        "\1\132\6\uffff\1\144\1\147\1\uffff\1\152\1\156\3\uffff\1\164\1\166"+
        "\1\170\3\uffff\1\177\1\u0082\2\uffff\1\64\1\u0085\1\uffff\1\u0087"+
        "\1\u0089\2\64\1\u008c\15\64\1\u009e\4\uffff\1\u00a0\2\uffff\1\u00a2"+
        "\3\uffff\1\u00a5\25\uffff\1\u00a7\32\uffff\1\64\1\uffff\1\64\1\uffff"+
        "\1\64\1\uffff\2\64\1\uffff\1\u00ad\1\64\1\u00af\1\u00b0\7\64\1\u00b8"+
        "\5\64\3\uffff\1\u00c0\6\uffff\1\64\1\u00c6\2\64\1\u00c9\1\uffff"+
        "\1\64\2\uffff\4\64\1\u00cf\1\u00d0\1\64\1\uffff\6\64\2\uffff\5\64"+
        "\1\uffff\2\64\1\uffff\1\u00e2\1\u00e3\2\64\1\u00e6\2\uffff\1\u00e7"+
        "\3\64\1\u00eb\2\64\1\u00ee\1\u00ef\1\u00f0\1\u00f1\1\u00f2\1\u00f3"+
        "\1\u00f4\1\u00f5\1\u00f6\1\u00f7\2\uffff\1\u00f8\1\u00f9\2\uffff"+
        "\2\64\1\u00fc\1\uffff\1\u00fd\1\u00fe\14\uffff\1\u00ff\1\u0100\5"+
        "\uffff";
    static final String DFA11_eofS =
        "\u0101\uffff";
    static final String DFA11_minS =
        "\1\0\1\145\1\155\1\141\1\171\1\141\1\165\1\145\1\170\1\157\1\151"+
        "\1\145\1\150\1\154\1\146\2\uffff\1\0\2\uffff\3\44\1\0\1\uffff\1"+
        "\45\6\uffff\1\55\1\75\1\uffff\1\56\1\52\3\uffff\1\44\2\75\3\uffff"+
        "\1\44\1\57\2\uffff\1\155\1\41\1\uffff\2\41\1\160\1\163\1\41\1\144"+
        "\1\143\1\157\1\155\1\160\1\143\1\145\1\165\1\156\1\146\1\145\1\163"+
        "\1\167\1\41\4\uffff\1\52\2\uffff\1\76\3\uffff\1\75\25\uffff\1\56"+
        "\32\uffff\1\160\1\uffff\1\164\1\uffff\1\151\1\uffff\1\157\1\145"+
        "\1\uffff\1\41\1\162\2\41\1\165\1\145\1\157\1\141\1\145\1\155\1\151"+
        "\1\41\2\141\1\162\1\151\1\141\3\uffff\1\52\6\uffff\1\61\1\41\1\156"+
        "\1\162\1\41\1\uffff\1\157\2\uffff\1\157\1\156\1\162\1\154\2\41\1"+
        "\144\1\uffff\1\154\1\165\1\156\1\145\1\147\1\171\2\uffff\1\71\2"+
        "\60\1\61\1\62\1\uffff\1\145\1\164\1\uffff\2\41\1\144\1\164\1\41"+
        "\2\uffff\1\41\2\154\1\145\1\41\1\156\1\163\12\41\2\uffff\2\41\2"+
        "\uffff\1\171\1\164\1\41\1\uffff\2\41\14\uffff\2\41\5\uffff";
    static final String DFA11_maxS =
        "\1\uffff\1\157\1\163\1\141\1\171\1\157\1\165\1\145\1\170\1\157\1"+
        "\162\1\145\1\150\1\163\1\146\2\uffff\1\uffff\2\uffff\1\76\1\57\1"+
        "\76\1\uffff\1\uffff\1\45\6\uffff\1\75\1\76\1\uffff\1\56\1\75\3\uffff"+
        "\1\52\2\75\3\uffff\2\134\2\uffff\1\155\1\172\1\uffff\2\172\1\160"+
        "\1\163\1\172\1\144\1\143\1\157\1\155\1\164\1\143\1\157\1\165\1\170"+
        "\1\146\1\145\1\163\1\167\1\172\4\uffff\1\52\2\uffff\1\76\3\uffff"+
        "\1\76\25\uffff\1\56\32\uffff\1\160\1\uffff\1\164\1\uffff\1\151\1"+
        "\uffff\1\157\1\145\1\uffff\1\172\1\162\2\172\1\165\1\145\1\157\1"+
        "\141\1\145\1\155\1\151\1\172\1\141\1\151\1\162\1\151\1\141\3\uffff"+
        "\1\52\6\uffff\1\65\1\172\1\156\1\162\1\172\1\uffff\1\157\2\uffff"+
        "\1\157\1\156\1\162\1\154\2\172\1\144\1\uffff\1\154\1\165\1\156\1"+
        "\145\1\147\1\171\2\uffff\1\71\1\67\1\62\1\61\1\62\1\uffff\1\145"+
        "\1\164\1\uffff\2\172\1\144\1\164\1\172\2\uffff\1\172\2\154\1\145"+
        "\1\172\1\156\1\163\12\172\2\uffff\2\172\2\uffff\1\171\1\164\1\172"+
        "\1\uffff\2\172\14\uffff\2\172\5\uffff";
    static final String DFA11_acceptS =
        "\17\uffff\2\44\1\uffff\1\45\1\46\4\uffff\1\53\1\uffff\1\55\1\56"+
        "\1\57\1\60\1\61\1\62\2\uffff\1\66\2\uffff\1\73\1\74\1\75\3\uffff"+
        "\1\115\1\116\1\117\2\uffff\1\143\1\147\2\uffff\1\44\23\uffff\1\45"+
        "\1\46\1\47\1\131\1\uffff\1\101\1\50\1\uffff\1\130\1\146\1\100\1"+
        "\uffff\1\132\1\133\1\107\1\52\1\53\1\144\1\54\1\55\1\56\1\57\1\60"+
        "\1\61\1\62\1\63\1\105\1\137\1\103\1\64\1\106\1\104\1\66\1\uffff"+
        "\1\67\1\70\1\71\1\134\1\72\1\73\1\74\1\75\1\76\1\126\1\77\1\110"+
        "\1\112\1\111\1\113\1\115\1\116\1\117\1\122\1\124\1\127\1\120\1\123"+
        "\1\125\1\121\1\143\1\uffff\1\33\1\uffff\1\10\1\uffff\1\40\2\uffff"+
        "\1\13\21\uffff\1\37\1\142\1\136\1\uffff\1\102\1\51\1\65\1\135\1"+
        "\145\1\114\5\uffff\1\14\1\uffff\1\15\1\16\7\uffff\1\27\6\uffff\1"+
        "\141\1\140\5\uffff\1\11\2\uffff\1\12\5\uffff\1\23\1\34\21\uffff"+
        "\1\20\1\17\2\uffff\1\22\1\24\3\uffff\1\35\2\uffff\1\1\1\2\1\3\1"+
        "\4\1\5\1\43\1\6\1\7\1\30\1\31\1\21\1\32\2\uffff\1\26\1\36\1\41\1"+
        "\42\1\25";
    static final String DFA11_specialS =
        "\1\1\20\uffff\1\0\5\uffff\1\2\u00e9\uffff}>";
    static final String[] DFA11_transitionS = {
            "\11\61\1\22\1\23\2\61\1\23\22\61\1\22\1\61\1\27\1\53\1\55\1"+
            "\60\1\54\1\31\1\32\1\33\1\50\1\25\1\46\1\24\1\43\1\56\12\30"+
            "\1\44\1\47\1\40\1\26\1\41\1\61\1\45\32\20\1\36\1\57\1\37\1\52"+
            "\1\21\1\61\1\15\1\4\1\3\1\13\1\10\1\12\2\17\1\2\2\17\1\11\1"+
            "\5\1\17\1\16\1\17\1\6\1\7\1\17\1\1\2\17\1\14\3\17\1\34\1\42"+
            "\1\35\1\51\uff81\61",
            "\1\62\11\uffff\1\63",
            "\1\67\1\66\4\uffff\1\65",
            "\1\70",
            "\1\71",
            "\1\73\15\uffff\1\72",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\102\2\uffff\1\101\5\uffff\1\100",
            "\1\103",
            "\1\104",
            "\1\106\6\uffff\1\105",
            "\1\107",
            "",
            "",
            "\0\64",
            "",
            "",
            "\1\113\10\uffff\1\112\20\uffff\1\114",
            "\1\120\6\uffff\1\116\1\uffff\1\117\1\uffff\1\121",
            "\1\124\30\uffff\1\123\1\125",
            "\0\127",
            "",
            "\1\131",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\143\16\uffff\1\141\1\142",
            "\1\146\1\145",
            "",
            "\1\151",
            "\1\154\17\uffff\1\153\2\uffff\1\155",
            "",
            "",
            "",
            "\1\163\5\uffff\1\162",
            "\1\165",
            "\1\167",
            "",
            "",
            "",
            "\1\176\12\uffff\1\174\54\uffff\1\175",
            "\1\u0081\54\uffff\1\u0080",
            "",
            "",
            "\1\u0084",
            "\1\64\16\uffff\12\64\5\uffff\1\64\1\uffff\32\64\4\uffff\1\64"+
            "\1\uffff\32\64",
            "",
            "\1\64\16\uffff\12\64\5\uffff\1\64\1\uffff\32\64\4\uffff\1\64"+
            "\1\uffff\15\64\1\u0086\14\64",
            "\1\64\16\uffff\12\64\5\uffff\1\64\1\uffff\32\64\4\uffff\1\64"+
            "\1\uffff\13\64\1\u0088\16\64",
            "\1\u008a",
            "\1\u008b",
            "\1\64\16\uffff\12\64\5\uffff\1\64\1\uffff\32\64\4\uffff\1\64"+
            "\1\uffff\32\64",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0093\1\u0091\2\uffff\1\u0092",
            "\1\u0094",
            "\1\u0095\11\uffff\1\u0096",
            "\1\u0097",
            "\1\u0099\11\uffff\1\u0098",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\64\16\uffff\12\64\5\uffff\1\64\1\uffff\32\64\4\uffff\1\64"+
            "\1\uffff\32\64",
            "",
            "",
            "",
            "",
            "\1\u009f",
            "",
            "",
            "\1\u00a1",
            "",
            "",
            "",
            "\1\u00a3\1\u00a4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00a6",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00a8",
            "",
            "\1\u00a9",
            "",
            "\1\u00aa",
            "",
            "\1\u00ab",
            "\1\u00ac",
            "",
            "\1\64\16\uffff\12\64\5\uffff\1\64\1\uffff\32\64\4\uffff\1\64"+
            "\1\uffff\32\64",
            "\1\u00ae",
            "\1\64\16\uffff\12\64\5\uffff\1\64\1\uffff\32\64\4\uffff\1\64"+
            "\1\uffff\32\64",
            "\1\64\16\uffff\12\64\5\uffff\1\64\1\uffff\32\64\4\uffff\1\64"+
            "\1\uffff\32\64",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\64\16\uffff\12\64\5\uffff\1\64\1\uffff\32\64\4\uffff\1\64"+
            "\1\uffff\32\64",
            "\1\u00b9",
            "\1\u00ba\7\uffff\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "",
            "",
            "",
            "\1\u00bf",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00c1\1\u00c2\1\u00c3\1\u00c4\1\u00c5",
            "\1\64\16\uffff\12\64\5\uffff\1\64\1\uffff\32\64\4\uffff\1\64"+
            "\1\uffff\32\64",
            "\1\u00c7",
            "\1\u00c8",
            "\1\64\16\uffff\12\64\5\uffff\1\64\1\uffff\32\64\4\uffff\1\64"+
            "\1\uffff\32\64",
            "",
            "\1\u00ca",
            "",
            "",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\64\16\uffff\12\64\5\uffff\1\64\1\uffff\32\64\4\uffff\1\64"+
            "\1\uffff\32\64",
            "\1\64\16\uffff\12\64\5\uffff\1\64\1\uffff\32\64\4\uffff\1\64"+
            "\1\uffff\32\64",
            "\1\u00d1",
            "",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "",
            "",
            "\1\u00d8",
            "\1\u00d9\6\uffff\1\u00da",
            "\1\u00dd\1\u00db\1\u00dc",
            "\1\u00de",
            "\1\u00df",
            "",
            "\1\u00e0",
            "\1\u00e1",
            "",
            "\1\64\16\uffff\12\64\5\uffff\1\64\1\uffff\32\64\4\uffff\1\64"+
            "\1\uffff\32\64",
            "\1\64\16\uffff\12\64\5\uffff\1\64\1\uffff\32\64\4\uffff\1\64"+
            "\1\uffff\32\64",
            "\1\u00e4",
            "\1\u00e5",
            "\1\64\16\uffff\12\64\5\uffff\1\64\1\uffff\32\64\4\uffff\1\64"+
            "\1\uffff\32\64",
            "",
            "",
            "\1\64\16\uffff\12\64\5\uffff\1\64\1\uffff\32\64\4\uffff\1\64"+
            "\1\uffff\32\64",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\64\16\uffff\12\64\5\uffff\1\64\1\uffff\32\64\4\uffff\1\64"+
            "\1\uffff\32\64",
            "\1\u00ec",
            "\1\u00ed",
            "\1\64\16\uffff\12\64\5\uffff\1\64\1\uffff\32\64\4\uffff\1\64"+
            "\1\uffff\32\64",
            "\1\64\16\uffff\12\64\5\uffff\1\64\1\uffff\32\64\4\uffff\1\64"+
            "\1\uffff\32\64",
            "\1\64\16\uffff\12\64\5\uffff\1\64\1\uffff\32\64\4\uffff\1\64"+
            "\1\uffff\32\64",
            "\1\64\16\uffff\12\64\5\uffff\1\64\1\uffff\32\64\4\uffff\1\64"+
            "\1\uffff\32\64",
            "\1\64\16\uffff\12\64\5\uffff\1\64\1\uffff\32\64\4\uffff\1\64"+
            "\1\uffff\32\64",
            "\1\64\16\uffff\12\64\5\uffff\1\64\1\uffff\32\64\4\uffff\1\64"+
            "\1\uffff\32\64",
            "\1\64\16\uffff\12\64\5\uffff\1\64\1\uffff\32\64\4\uffff\1\64"+
            "\1\uffff\32\64",
            "\1\64\16\uffff\12\64\5\uffff\1\64\1\uffff\32\64\4\uffff\1\64"+
            "\1\uffff\32\64",
            "\1\64\16\uffff\12\64\5\uffff\1\64\1\uffff\32\64\4\uffff\1\64"+
            "\1\uffff\32\64",
            "\1\64\16\uffff\12\64\5\uffff\1\64\1\uffff\32\64\4\uffff\1\64"+
            "\1\uffff\32\64",
            "",
            "",
            "\1\64\16\uffff\12\64\5\uffff\1\64\1\uffff\32\64\4\uffff\1\64"+
            "\1\uffff\32\64",
            "\1\64\16\uffff\12\64\5\uffff\1\64\1\uffff\32\64\4\uffff\1\64"+
            "\1\uffff\32\64",
            "",
            "",
            "\1\u00fa",
            "\1\u00fb",
            "\1\64\16\uffff\12\64\5\uffff\1\64\1\uffff\32\64\4\uffff\1\64"+
            "\1\uffff\32\64",
            "",
            "\1\64\16\uffff\12\64\5\uffff\1\64\1\uffff\32\64\4\uffff\1\64"+
            "\1\uffff\32\64",
            "\1\64\16\uffff\12\64\5\uffff\1\64\1\uffff\32\64\4\uffff\1\64"+
            "\1\uffff\32\64",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\64\16\uffff\12\64\5\uffff\1\64\1\uffff\32\64\4\uffff\1\64"+
            "\1\uffff\32\64",
            "\1\64\16\uffff\12\64\5\uffff\1\64\1\uffff\32\64\4\uffff\1\64"+
            "\1\uffff\32\64",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | RULE_TK_ID | RULE_WS | RULE_KW_NEWLINE | RULE_TK_PREDOC | RULE_TK_POSTDOC | RULE_MACROVALUE | RULE_TK_STRING | RULE_TK_INT | RULE_KW_QUOTE | RULE_KW_OPAREN | RULE_KW_CPAREN | RULE_KW_OCURLY | RULE_KW_CCURLY | RULE_KW_OBRACK | RULE_KW_CBRACK | RULE_KW_2LT | RULE_KW_2GT | RULE_KW_MARROW | RULE_KW_BAR | RULE_KW_DOT | RULE_KW_2COLON | RULE_KW_COLONSTAR | RULE_KW_COLON | RULE_KW_AT | RULE_KW_COMMA | RULE_KW_SEMICOLON | RULE_KW_2STAR | RULE_KW_STAR | RULE_KW_PLUS | RULE_KW_MINUS | RULE_KW_PLUSMINUS | RULE_KW_LT | RULE_KW_GT | RULE_KW_LE | RULE_KW_GE | RULE_KW_EQ | RULE_KW_TILDEE | RULE_KW_HATE | RULE_KW_TILDE | RULE_KW_HAT | RULE_KW_2DOT | RULE_KW_SHARP | RULE_KW_AMPERSAND | RULE_KW_DOLLAR | RULE_KW_SLASH | RULE_KW_BACKSLASH | RULE_SLASHSLASH | RULE_BACKSLASHBACKSLASH | RULE_KW_WEDGE | RULE_KW_VEE | RULE_TIMESDOLAR | RULE_DIVDOLAR | RULE_PLUSDOLAR | RULE_MINUSDOLAR | RULE_EQUALSDOLAR | RULE_KW_IMPLIES | RULE_KW_ASSIGN | RULE_KW_2EQ | RULE_KW_RARROW | RULE_KW_LARROW | RULE_KW_MAPSTO | RULE_KW_MAPSTOSTAR | RULE_KW_MAPSTAR | RULE_PERCENT | RULE_PRIMEPERCENT | RULE_ELLIPSIS | RULE_SUMLIST | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_17 = input.LA(1);

                        s = -1;
                        if ( ((LA11_17>='\u0000' && LA11_17<='\uFFFF')) ) {s = 52;}

                        else s = 49;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA11_0 = input.LA(1);

                        s = -1;
                        if ( (LA11_0=='t') ) {s = 1;}

                        else if ( (LA11_0=='i') ) {s = 2;}

                        else if ( (LA11_0=='c') ) {s = 3;}

                        else if ( (LA11_0=='b') ) {s = 4;}

                        else if ( (LA11_0=='m') ) {s = 5;}

                        else if ( (LA11_0=='q') ) {s = 6;}

                        else if ( (LA11_0=='r') ) {s = 7;}

                        else if ( (LA11_0=='e') ) {s = 8;}

                        else if ( (LA11_0=='l') ) {s = 9;}

                        else if ( (LA11_0=='f') ) {s = 10;}

                        else if ( (LA11_0=='d') ) {s = 11;}

                        else if ( (LA11_0=='w') ) {s = 12;}

                        else if ( (LA11_0=='a') ) {s = 13;}

                        else if ( (LA11_0=='o') ) {s = 14;}

                        else if ( ((LA11_0>='g' && LA11_0<='h')||(LA11_0>='j' && LA11_0<='k')||LA11_0=='n'||LA11_0=='p'||LA11_0=='s'||(LA11_0>='u' && LA11_0<='v')||(LA11_0>='x' && LA11_0<='z')) ) {s = 15;}

                        else if ( ((LA11_0>='A' && LA11_0<='Z')) ) {s = 16;}

                        else if ( (LA11_0=='_') ) {s = 17;}

                        else if ( (LA11_0=='\t'||LA11_0==' ') ) {s = 18;}

                        else if ( (LA11_0=='\n'||LA11_0=='\r') ) {s = 19;}

                        else if ( (LA11_0=='-') ) {s = 20;}

                        else if ( (LA11_0=='+') ) {s = 21;}

                        else if ( (LA11_0=='=') ) {s = 22;}

                        else if ( (LA11_0=='\"') ) {s = 23;}

                        else if ( ((LA11_0>='0' && LA11_0<='9')) ) {s = 24;}

                        else if ( (LA11_0=='\'') ) {s = 25;}

                        else if ( (LA11_0=='(') ) {s = 26;}

                        else if ( (LA11_0==')') ) {s = 27;}

                        else if ( (LA11_0=='{') ) {s = 28;}

                        else if ( (LA11_0=='}') ) {s = 29;}

                        else if ( (LA11_0=='[') ) {s = 30;}

                        else if ( (LA11_0==']') ) {s = 31;}

                        else if ( (LA11_0=='<') ) {s = 32;}

                        else if ( (LA11_0=='>') ) {s = 33;}

                        else if ( (LA11_0=='|') ) {s = 34;}

                        else if ( (LA11_0=='.') ) {s = 35;}

                        else if ( (LA11_0==':') ) {s = 36;}

                        else if ( (LA11_0=='@') ) {s = 37;}

                        else if ( (LA11_0==',') ) {s = 38;}

                        else if ( (LA11_0==';') ) {s = 39;}

                        else if ( (LA11_0=='*') ) {s = 40;}

                        else if ( (LA11_0=='~') ) {s = 41;}

                        else if ( (LA11_0=='^') ) {s = 42;}

                        else if ( (LA11_0=='#') ) {s = 43;}

                        else if ( (LA11_0=='&') ) {s = 44;}

                        else if ( (LA11_0=='$') ) {s = 45;}

                        else if ( (LA11_0=='/') ) {s = 46;}

                        else if ( (LA11_0=='\\') ) {s = 47;}

                        else if ( (LA11_0=='%') ) {s = 48;}

                        else if ( ((LA11_0>='\u0000' && LA11_0<='\b')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\u001F')||LA11_0=='!'||LA11_0=='?'||LA11_0=='`'||(LA11_0>='\u007F' && LA11_0<='\uFFFF')) ) {s = 49;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA11_23 = input.LA(1);

                        s = -1;
                        if ( ((LA11_23>='\u0000' && LA11_23<='\uFFFF')) ) {s = 87;}

                        else s = 49;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 11, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}