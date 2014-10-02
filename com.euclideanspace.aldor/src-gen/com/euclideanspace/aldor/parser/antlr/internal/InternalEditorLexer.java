package com.euclideanspace.aldor.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEditorLexer extends Lexer {
    public static final int RULE_KW_GE=24;
    public static final int RULE_KW_DOT=39;
    public static final int RULE_KW_AMPERSAND=58;
    public static final int RULE_ANY_OTHER=60;
    public static final int RULE_KW_WEDGE=20;
    public static final int RULE_TK_FLOAT=50;
    public static final int RULE_KW_GT=25;
    public static final int EOF=-1;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int RULE_KW_IMPLIES=59;
    public static final int T__92=92;
    public static final int RULE_KW_2EQ=9;
    public static final int T__90=90;
    public static final int RULE_KW_2LT=29;
    public static final int RULE_KW_DOLLAR=15;
    public static final int RULE_KW_TILDE=48;
    public static final int RULE_KW_MAPSTAR=18;
    public static final int RULE_KW_PLUSMINUS=33;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int RULE_KW_COLON=6;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int T__80=80;
    public static final int RULE_KW_MINUS=32;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_KW_MARROW=10;
    public static final int RULE_KW_MAPSTO=11;
    public static final int RULE_KW_SLASH=35;
    public static final int RULE_KW_2COLON=14;
    public static final int RULE_TK_ID=45;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int RULE_KW_TILDEE=22;
    public static final int RULE_KW_CCURLY=55;
    public static final int T__88=88;
    public static final int T__71=71;
    public static final int RULE_TK_POSTDOC=52;
    public static final int T__72=72;
    public static final int RULE_KW_2GT=26;
    public static final int T__70=70;
    public static final int RULE_KW_ASSIGN=8;
    public static final int RULE_KW_OBRACK=42;
    public static final int T__76=76;
    public static final int RULE_KW_COLONSTAR=7;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int RULE_KW_BAR=13;
    public static final int RULE_KW_CBRACK=43;
    public static final int T__73=73;
    public static final int RULE_KW_RARROW=16;
    public static final int T__79=79;
    public static final int RULE_KW_AT=5;
    public static final int T__78=78;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int RULE_KW_OPAREN=40;
    public static final int T__64=64;
    public static final int RULE_TK_PREDOC=51;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__118=118;
    public static final int T__116=116;
    public static final int RULE_KW_CPAREN=41;
    public static final int T__117=117;
    public static final int RULE_KW_STAR=34;
    public static final int T__114=114;
    public static final int RULE_KW_LT=28;
    public static final int T__115=115;
    public static final int RULE_KW_HATE=23;
    public static final int RULE_KW_PLUS=31;
    public static final int T__61=61;
    public static final int RULE_KW_SEMICOLON=53;
    public static final int RULE_KW_SHARP=47;
    public static final int RULE_KW_LE=27;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__103=103;
    public static final int RULE_KW_QUOTE=44;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int T__113=113;
    public static final int T__112=112;
    public static final int RULE_KW_BACKSLASH=36;
    public static final int RULE_KW_MAPSTOSTAR=12;
    public static final int RULE_KW_VEE=19;
    public static final int RULE_KW_HAT=38;
    public static final int RULE_KW_LARROW=17;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int RULE_KW_EQ=21;
    public static final int RULE_TK_STRING=4;
    public static final int RULE_KW_NEWLINE=57;
    public static final int RULE_KW_OCURLY=54;
    public static final int RULE_KW_2DOT=30;
    public static final int RULE_KW_2STAR=37;
    public static final int RULE_KW_COMMA=46;
    public static final int RULE_TK_INT=49;
    public static final int RULE_WS=56;

    // delegates
    // delegators

    public InternalEditorLexer() {;} 
    public InternalEditorLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalEditorLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g"; }

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:11:7: ( '#include' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:11:9: '#include'
            {
            match("#include"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:12:7: ( 'macro' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:12:9: 'macro'
            {
            match("macro"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:13:7: ( 'extend' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:13:9: 'extend'
            {
            match("extend"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:14:7: ( 'local' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:14:9: 'local'
            {
            match("local"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:15:7: ( 'free' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:15:9: 'free'
            {
            match("free"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:16:7: ( 'fluid' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:16:9: 'fluid'
            {
            match("fluid"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:17:7: ( 'default' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:17:9: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:18:7: ( 'define' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:18:9: 'define'
            {
            match("define"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:19:7: ( 'fix' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:19:9: 'fix'
            {
            match("fix"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:20:7: ( 'inline' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:20:9: 'inline'
            {
            match("inline"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:21:7: ( 'import' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:21:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:22:7: ( 'export' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:22:9: 'export'
            {
            match("export"); 


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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:23:7: ( 'to' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:23:9: 'to'
            {
            match("to"); 


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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:24:7: ( 'from' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:24:9: 'from'
            {
            match("from"); 


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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:25:7: ( 'where' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:25:9: 'where'
            {
            match("where"); 


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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:26:7: ( 'if' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:26:9: 'if'
            {
            match("if"); 


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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:27:7: ( 'then' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:27:9: 'then'
            {
            match("then"); 


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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:28:7: ( 'implies' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:28:9: 'implies'
            {
            match("implies"); 


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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:29:7: ( 'else' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:29:9: 'else'
            {
            match("else"); 


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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:30:7: ( 'repeat' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:30:9: 'repeat'
            {
            match("repeat"); 


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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:31:7: ( 'try' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:31:9: 'try'
            {
            match("try"); 


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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:32:7: ( 'but' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:32:9: 'but'
            {
            match("but"); 


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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:33:7: ( 'catch' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:33:9: 'catch'
            {
            match("catch"); 


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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:34:7: ( 'select' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:34:9: 'select'
            {
            match("select"); 


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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:35:7: ( 'in' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:35:9: 'in'
            {
            match("in"); 


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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:36:7: ( 'do' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:36:9: 'do'
            {
            match("do"); 


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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:37:7: ( 'delay' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:37:9: 'delay'
            {
            match("delay"); 


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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:38:7: ( 'reference' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:38:9: 'reference'
            {
            match("reference"); 


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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:39:7: ( 'generate' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:39:9: 'generate'
            {
            match("generate"); 


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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:40:7: ( 'assert' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:40:9: 'assert'
            {
            match("assert"); 


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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:41:7: ( 'iterate' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:41:9: 'iterate'
            {
            match("iterate"); 


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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:42:7: ( 'break' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:42:9: 'break'
            {
            match("break"); 


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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:43:7: ( 'return' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:43:9: 'return'
            {
            match("return"); 


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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:44:7: ( 'yield' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:44:9: 'yield'
            {
            match("yield"); 


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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:45:7: ( 'except' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:45:9: 'except'
            {
            match("except"); 


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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:46:7: ( 'throw' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:46:9: 'throw'
            {
            match("throw"); 


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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:47:7: ( 'goto' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:47:9: 'goto'
            {
            match("goto"); 


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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:48:7: ( 'never' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:48:9: 'never'
            {
            match("never"); 


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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:49:7: ( 'of' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:49:9: 'of'
            {
            match("of"); 


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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:50:8: ( 'always' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:50:10: 'always'
            {
            match("always"); 


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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:51:8: ( 'finally' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:51:10: 'finally'
            {
            match("finally"); 


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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:52:8: ( 'for' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:52:10: 'for'
            {
            match("for"); 


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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:53:8: ( 'while' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:53:10: 'while'
            {
            match("while"); 


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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:54:8: ( 'and' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:54:10: 'and'
            {
            match("and"); 


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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:55:8: ( 'or' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:55:10: 'or'
            {
            match("or"); 


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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:56:8: ( 'has' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:56:10: 'has'
            {
            match("has"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__106"

    // $ANTLR start "T__107"
    public final void mT__107() throws RecognitionException {
        try {
            int _type = T__107;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:57:8: ( 'pretend' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:57:10: 'pretend'
            {
            match("pretend"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__107"

    // $ANTLR start "T__108"
    public final void mT__108() throws RecognitionException {
        try {
            int _type = T__108;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:58:8: ( 'with' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:58:10: 'with'
            {
            match("with"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__108"

    // $ANTLR start "T__109"
    public final void mT__109() throws RecognitionException {
        try {
            int _type = T__109;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:59:8: ( 'add' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:59:10: 'add'
            {
            match("add"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__109"

    // $ANTLR start "T__110"
    public final void mT__110() throws RecognitionException {
        try {
            int _type = T__110;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:60:8: ( 'is' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:60:10: 'is'
            {
            match("is"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__110"

    // $ANTLR start "T__111"
    public final void mT__111() throws RecognitionException {
        try {
            int _type = T__111;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:61:8: ( 'isnt' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:61:10: 'isnt'
            {
            match("isnt"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__111"

    // $ANTLR start "T__112"
    public final void mT__112() throws RecognitionException {
        try {
            int _type = T__112;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:62:8: ( 'case' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:62:10: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__112"

    // $ANTLR start "T__113"
    public final void mT__113() throws RecognitionException {
        try {
            int _type = T__113;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:63:8: ( 'by' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:63:10: 'by'
            {
            match("by"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__113"

    // $ANTLR start "T__114"
    public final void mT__114() throws RecognitionException {
        try {
            int _type = T__114;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:64:8: ( 'mod' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:64:10: 'mod'
            {
            match("mod"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__114"

    // $ANTLR start "T__115"
    public final void mT__115() throws RecognitionException {
        try {
            int _type = T__115;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:65:8: ( 'quo' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:65:10: 'quo'
            {
            match("quo"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__115"

    // $ANTLR start "T__116"
    public final void mT__116() throws RecognitionException {
        try {
            int _type = T__116;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:66:8: ( 'rem' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:66:10: 'rem'
            {
            match("rem"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__116"

    // $ANTLR start "T__117"
    public final void mT__117() throws RecognitionException {
        try {
            int _type = T__117;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:67:8: ( 'exquo' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:67:10: 'exquo'
            {
            match("exquo"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__117"

    // $ANTLR start "T__118"
    public final void mT__118() throws RecognitionException {
        try {
            int _type = T__118;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:68:8: ( 'not' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:68:10: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__118"

    // $ANTLR start "RULE_TK_ID"
    public final void mRULE_TK_ID() throws RecognitionException {
        try {
            int _type = RULE_TK_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10564:12: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' . ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' . | '0' .. '9' )* ( '!' )? ( '?' )? )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10564:14: ( 'a' .. 'z' | 'A' .. 'Z' | '_' . ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' . | '0' .. '9' )* ( '!' )? ( '?' )?
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10564:14: ( 'a' .. 'z' | 'A' .. 'Z' | '_' . )
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
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10564:15: 'a' .. 'z'
                    {
                    matchRange('a','z'); 

                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10564:24: 'A' .. 'Z'
                    {
                    matchRange('A','Z'); 

                    }
                    break;
                case 3 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10564:33: '_' .
                    {
                    match('_'); 
                    matchAny(); 

                    }
                    break;

            }

            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10564:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' . | '0' .. '9' )*
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
            	    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10564:41: 'a' .. 'z'
            	    {
            	    matchRange('a','z'); 

            	    }
            	    break;
            	case 2 :
            	    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10564:50: 'A' .. 'Z'
            	    {
            	    matchRange('A','Z'); 

            	    }
            	    break;
            	case 3 :
            	    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10564:59: '_' .
            	    {
            	    match('_'); 
            	    matchAny(); 

            	    }
            	    break;
            	case 4 :
            	    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10564:65: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10564:76: ( '!' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='!') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10564:76: '!'
                    {
                    match('!'); 

                    }
                    break;

            }

            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10564:81: ( '?' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='?') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10564:81: '?'
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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10566:9: ( ( ' ' | '\\t' )+ )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10566:11: ( ' ' | '\\t' )+
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10566:11: ( ' ' | '\\t' )+
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
            	    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:
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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10568:17: ( ( '\\r' | '\\n' ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10568:19: ( '\\r' | '\\n' )
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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10570:16: ( '--' (~ ( ( '\\n' | '\\r' ) ) )* )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10570:18: '--' (~ ( ( '\\n' | '\\r' ) ) )*
            {
            match("--"); 

            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10570:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\u0000' && LA6_0<='\t')||(LA6_0>='\u000B' && LA6_0<='\f')||(LA6_0>='\u000E' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10570:23: ~ ( ( '\\n' | '\\r' ) )
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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10572:17: ( '++' (~ ( ( '\\n' | '\\r' ) ) )* )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10572:19: '++' (~ ( ( '\\n' | '\\r' ) ) )*
            {
            match("++"); 

            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10572:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='\u0000' && LA7_0<='\t')||(LA7_0>='\u000B' && LA7_0<='\f')||(LA7_0>='\u000E' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10572:24: ~ ( ( '\\n' | '\\r' ) )
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

    // $ANTLR start "RULE_TK_STRING"
    public final void mRULE_TK_STRING() throws RecognitionException {
        try {
            int _type = RULE_TK_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10574:16: ( '\"' (~ ( '\"' ) )* '\"' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10574:18: '\"' (~ ( '\"' ) )* '\"'
            {
            match('\"'); 
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10574:22: (~ ( '\"' ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='!')||(LA8_0>='#' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10574:22: ~ ( '\"' )
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
            	    break loop8;
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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10576:13: ( ( '0' .. '9' )+ )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10576:15: ( '0' .. '9' )+
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10576:15: ( '0' .. '9' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10576:16: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TK_INT"

    // $ANTLR start "RULE_TK_FLOAT"
    public final void mRULE_TK_FLOAT() throws RecognitionException {
        try {
            int _type = RULE_TK_FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10578:15: ( RULE_TK_INT ( 'e' | 'E' ) ( '+' | '-' )? RULE_TK_INT )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10578:17: RULE_TK_INT ( 'e' | 'E' ) ( '+' | '-' )? RULE_TK_INT
            {
            mRULE_TK_INT(); 
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10578:39: ( '+' | '-' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='+'||LA10_0=='-') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            mRULE_TK_INT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TK_FLOAT"

    // $ANTLR start "RULE_KW_QUOTE"
    public final void mRULE_KW_QUOTE() throws RecognitionException {
        try {
            int _type = RULE_KW_QUOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10580:15: ( '\\'' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10580:17: '\\''
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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10582:16: ( '(' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10582:18: '('
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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10584:16: ( ')' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10584:18: ')'
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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10586:16: ( '{' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10586:18: '{'
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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10588:16: ( '}' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10588:18: '}'
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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10590:16: ( '[' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10590:18: '['
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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10592:16: ( ']' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10592:18: ']'
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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10594:13: ( '<<' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10594:15: '<<'
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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10596:13: ( '>>' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10596:15: '>>'
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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10598:16: ( '==>' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10598:18: '==>'
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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10600:13: ( '|' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10600:15: '|'
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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10602:13: ( '.' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10602:15: '.'
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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10604:16: ( '::' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10604:18: '::'
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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10606:19: ( ':*' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10606:21: ':*'
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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10608:15: ( ':' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10608:17: ':'
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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10610:12: ( '@' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10610:14: '@'
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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10612:15: ( ',' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10612:17: ','
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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10614:19: ( ';' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10614:21: ';'
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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10616:15: ( '**' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10616:17: '**'
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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10618:14: ( '*' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10618:16: '*'
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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10620:14: ( '+' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10620:16: '+'
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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10622:15: ( '-' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10622:17: '-'
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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10624:19: ( '+-' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10624:21: '+-'
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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10626:12: ( '<' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10626:14: '<'
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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10628:12: ( '>' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10628:14: '>'
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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10630:12: ( '<=' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10630:14: '<='
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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10632:12: ( '>=' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10632:14: '>='
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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10634:12: ( '=' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10634:14: '='
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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10636:16: ( '~=' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10636:18: '~='
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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10638:14: ( '^=' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10638:16: '^='
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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10640:15: ( '~' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10640:17: '~'
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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10642:13: ( '^' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10642:15: '^'
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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10644:14: ( '..' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10644:16: '..'
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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10646:15: ( '#' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10646:17: '#'
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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10648:19: ( '&' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10648:21: '&'
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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10650:16: ( '$' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10650:18: '$'
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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10652:15: ( '/' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10652:17: '/'
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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10654:19: ( '\\\\' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10654:21: '\\\\'
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

    // $ANTLR start "RULE_KW_WEDGE"
    public final void mRULE_KW_WEDGE() throws RecognitionException {
        try {
            int _type = RULE_KW_WEDGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10656:15: ( '/\\\\' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10656:17: '/\\\\'
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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10658:13: ( '\\\\/' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10658:15: '\\\\/'
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

    // $ANTLR start "RULE_KW_IMPLIES"
    public final void mRULE_KW_IMPLIES() throws RecognitionException {
        try {
            int _type = RULE_KW_IMPLIES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10660:17: ( '=>' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10660:19: '=>'
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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10662:16: ( ':=' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10662:18: ':='
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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10664:13: ( '==' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10664:15: '=='
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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10666:16: ( '->' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10666:18: '->'
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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10668:16: ( '<-' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10668:18: '<-'
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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10670:16: ( '+->' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10670:18: '+->'
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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10672:20: ( '+->*' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10672:22: '+->*'
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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10674:17: ( '->*' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10674:19: '->*'
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

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10676:16: ( . )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:10676:18: .
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
        // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:8: ( T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | RULE_TK_ID | RULE_WS | RULE_KW_NEWLINE | RULE_TK_PREDOC | RULE_TK_POSTDOC | RULE_TK_STRING | RULE_TK_INT | RULE_TK_FLOAT | RULE_KW_QUOTE | RULE_KW_OPAREN | RULE_KW_CPAREN | RULE_KW_OCURLY | RULE_KW_CCURLY | RULE_KW_OBRACK | RULE_KW_CBRACK | RULE_KW_2LT | RULE_KW_2GT | RULE_KW_MARROW | RULE_KW_BAR | RULE_KW_DOT | RULE_KW_2COLON | RULE_KW_COLONSTAR | RULE_KW_COLON | RULE_KW_AT | RULE_KW_COMMA | RULE_KW_SEMICOLON | RULE_KW_2STAR | RULE_KW_STAR | RULE_KW_PLUS | RULE_KW_MINUS | RULE_KW_PLUSMINUS | RULE_KW_LT | RULE_KW_GT | RULE_KW_LE | RULE_KW_GE | RULE_KW_EQ | RULE_KW_TILDEE | RULE_KW_HATE | RULE_KW_TILDE | RULE_KW_HAT | RULE_KW_2DOT | RULE_KW_SHARP | RULE_KW_AMPERSAND | RULE_KW_DOLLAR | RULE_KW_SLASH | RULE_KW_BACKSLASH | RULE_KW_WEDGE | RULE_KW_VEE | RULE_KW_IMPLIES | RULE_KW_ASSIGN | RULE_KW_2EQ | RULE_KW_RARROW | RULE_KW_LARROW | RULE_KW_MAPSTO | RULE_KW_MAPSTOSTAR | RULE_KW_MAPSTAR | RULE_ANY_OTHER )
        int alt11=115;
        alt11 = dfa11.predict(input);
        switch (alt11) {
            case 1 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:10: T__61
                {
                mT__61(); 

                }
                break;
            case 2 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:16: T__62
                {
                mT__62(); 

                }
                break;
            case 3 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:22: T__63
                {
                mT__63(); 

                }
                break;
            case 4 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:28: T__64
                {
                mT__64(); 

                }
                break;
            case 5 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:34: T__65
                {
                mT__65(); 

                }
                break;
            case 6 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:40: T__66
                {
                mT__66(); 

                }
                break;
            case 7 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:46: T__67
                {
                mT__67(); 

                }
                break;
            case 8 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:52: T__68
                {
                mT__68(); 

                }
                break;
            case 9 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:58: T__69
                {
                mT__69(); 

                }
                break;
            case 10 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:64: T__70
                {
                mT__70(); 

                }
                break;
            case 11 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:70: T__71
                {
                mT__71(); 

                }
                break;
            case 12 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:76: T__72
                {
                mT__72(); 

                }
                break;
            case 13 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:82: T__73
                {
                mT__73(); 

                }
                break;
            case 14 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:88: T__74
                {
                mT__74(); 

                }
                break;
            case 15 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:94: T__75
                {
                mT__75(); 

                }
                break;
            case 16 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:100: T__76
                {
                mT__76(); 

                }
                break;
            case 17 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:106: T__77
                {
                mT__77(); 

                }
                break;
            case 18 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:112: T__78
                {
                mT__78(); 

                }
                break;
            case 19 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:118: T__79
                {
                mT__79(); 

                }
                break;
            case 20 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:124: T__80
                {
                mT__80(); 

                }
                break;
            case 21 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:130: T__81
                {
                mT__81(); 

                }
                break;
            case 22 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:136: T__82
                {
                mT__82(); 

                }
                break;
            case 23 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:142: T__83
                {
                mT__83(); 

                }
                break;
            case 24 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:148: T__84
                {
                mT__84(); 

                }
                break;
            case 25 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:154: T__85
                {
                mT__85(); 

                }
                break;
            case 26 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:160: T__86
                {
                mT__86(); 

                }
                break;
            case 27 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:166: T__87
                {
                mT__87(); 

                }
                break;
            case 28 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:172: T__88
                {
                mT__88(); 

                }
                break;
            case 29 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:178: T__89
                {
                mT__89(); 

                }
                break;
            case 30 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:184: T__90
                {
                mT__90(); 

                }
                break;
            case 31 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:190: T__91
                {
                mT__91(); 

                }
                break;
            case 32 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:196: T__92
                {
                mT__92(); 

                }
                break;
            case 33 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:202: T__93
                {
                mT__93(); 

                }
                break;
            case 34 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:208: T__94
                {
                mT__94(); 

                }
                break;
            case 35 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:214: T__95
                {
                mT__95(); 

                }
                break;
            case 36 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:220: T__96
                {
                mT__96(); 

                }
                break;
            case 37 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:226: T__97
                {
                mT__97(); 

                }
                break;
            case 38 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:232: T__98
                {
                mT__98(); 

                }
                break;
            case 39 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:238: T__99
                {
                mT__99(); 

                }
                break;
            case 40 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:244: T__100
                {
                mT__100(); 

                }
                break;
            case 41 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:251: T__101
                {
                mT__101(); 

                }
                break;
            case 42 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:258: T__102
                {
                mT__102(); 

                }
                break;
            case 43 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:265: T__103
                {
                mT__103(); 

                }
                break;
            case 44 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:272: T__104
                {
                mT__104(); 

                }
                break;
            case 45 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:279: T__105
                {
                mT__105(); 

                }
                break;
            case 46 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:286: T__106
                {
                mT__106(); 

                }
                break;
            case 47 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:293: T__107
                {
                mT__107(); 

                }
                break;
            case 48 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:300: T__108
                {
                mT__108(); 

                }
                break;
            case 49 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:307: T__109
                {
                mT__109(); 

                }
                break;
            case 50 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:314: T__110
                {
                mT__110(); 

                }
                break;
            case 51 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:321: T__111
                {
                mT__111(); 

                }
                break;
            case 52 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:328: T__112
                {
                mT__112(); 

                }
                break;
            case 53 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:335: T__113
                {
                mT__113(); 

                }
                break;
            case 54 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:342: T__114
                {
                mT__114(); 

                }
                break;
            case 55 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:349: T__115
                {
                mT__115(); 

                }
                break;
            case 56 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:356: T__116
                {
                mT__116(); 

                }
                break;
            case 57 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:363: T__117
                {
                mT__117(); 

                }
                break;
            case 58 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:370: T__118
                {
                mT__118(); 

                }
                break;
            case 59 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:377: RULE_TK_ID
                {
                mRULE_TK_ID(); 

                }
                break;
            case 60 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:388: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 61 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:396: RULE_KW_NEWLINE
                {
                mRULE_KW_NEWLINE(); 

                }
                break;
            case 62 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:412: RULE_TK_PREDOC
                {
                mRULE_TK_PREDOC(); 

                }
                break;
            case 63 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:427: RULE_TK_POSTDOC
                {
                mRULE_TK_POSTDOC(); 

                }
                break;
            case 64 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:443: RULE_TK_STRING
                {
                mRULE_TK_STRING(); 

                }
                break;
            case 65 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:458: RULE_TK_INT
                {
                mRULE_TK_INT(); 

                }
                break;
            case 66 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:470: RULE_TK_FLOAT
                {
                mRULE_TK_FLOAT(); 

                }
                break;
            case 67 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:484: RULE_KW_QUOTE
                {
                mRULE_KW_QUOTE(); 

                }
                break;
            case 68 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:498: RULE_KW_OPAREN
                {
                mRULE_KW_OPAREN(); 

                }
                break;
            case 69 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:513: RULE_KW_CPAREN
                {
                mRULE_KW_CPAREN(); 

                }
                break;
            case 70 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:528: RULE_KW_OCURLY
                {
                mRULE_KW_OCURLY(); 

                }
                break;
            case 71 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:543: RULE_KW_CCURLY
                {
                mRULE_KW_CCURLY(); 

                }
                break;
            case 72 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:558: RULE_KW_OBRACK
                {
                mRULE_KW_OBRACK(); 

                }
                break;
            case 73 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:573: RULE_KW_CBRACK
                {
                mRULE_KW_CBRACK(); 

                }
                break;
            case 74 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:588: RULE_KW_2LT
                {
                mRULE_KW_2LT(); 

                }
                break;
            case 75 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:600: RULE_KW_2GT
                {
                mRULE_KW_2GT(); 

                }
                break;
            case 76 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:612: RULE_KW_MARROW
                {
                mRULE_KW_MARROW(); 

                }
                break;
            case 77 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:627: RULE_KW_BAR
                {
                mRULE_KW_BAR(); 

                }
                break;
            case 78 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:639: RULE_KW_DOT
                {
                mRULE_KW_DOT(); 

                }
                break;
            case 79 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:651: RULE_KW_2COLON
                {
                mRULE_KW_2COLON(); 

                }
                break;
            case 80 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:666: RULE_KW_COLONSTAR
                {
                mRULE_KW_COLONSTAR(); 

                }
                break;
            case 81 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:684: RULE_KW_COLON
                {
                mRULE_KW_COLON(); 

                }
                break;
            case 82 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:698: RULE_KW_AT
                {
                mRULE_KW_AT(); 

                }
                break;
            case 83 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:709: RULE_KW_COMMA
                {
                mRULE_KW_COMMA(); 

                }
                break;
            case 84 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:723: RULE_KW_SEMICOLON
                {
                mRULE_KW_SEMICOLON(); 

                }
                break;
            case 85 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:741: RULE_KW_2STAR
                {
                mRULE_KW_2STAR(); 

                }
                break;
            case 86 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:755: RULE_KW_STAR
                {
                mRULE_KW_STAR(); 

                }
                break;
            case 87 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:768: RULE_KW_PLUS
                {
                mRULE_KW_PLUS(); 

                }
                break;
            case 88 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:781: RULE_KW_MINUS
                {
                mRULE_KW_MINUS(); 

                }
                break;
            case 89 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:795: RULE_KW_PLUSMINUS
                {
                mRULE_KW_PLUSMINUS(); 

                }
                break;
            case 90 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:813: RULE_KW_LT
                {
                mRULE_KW_LT(); 

                }
                break;
            case 91 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:824: RULE_KW_GT
                {
                mRULE_KW_GT(); 

                }
                break;
            case 92 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:835: RULE_KW_LE
                {
                mRULE_KW_LE(); 

                }
                break;
            case 93 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:846: RULE_KW_GE
                {
                mRULE_KW_GE(); 

                }
                break;
            case 94 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:857: RULE_KW_EQ
                {
                mRULE_KW_EQ(); 

                }
                break;
            case 95 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:868: RULE_KW_TILDEE
                {
                mRULE_KW_TILDEE(); 

                }
                break;
            case 96 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:883: RULE_KW_HATE
                {
                mRULE_KW_HATE(); 

                }
                break;
            case 97 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:896: RULE_KW_TILDE
                {
                mRULE_KW_TILDE(); 

                }
                break;
            case 98 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:910: RULE_KW_HAT
                {
                mRULE_KW_HAT(); 

                }
                break;
            case 99 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:922: RULE_KW_2DOT
                {
                mRULE_KW_2DOT(); 

                }
                break;
            case 100 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:935: RULE_KW_SHARP
                {
                mRULE_KW_SHARP(); 

                }
                break;
            case 101 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:949: RULE_KW_AMPERSAND
                {
                mRULE_KW_AMPERSAND(); 

                }
                break;
            case 102 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:967: RULE_KW_DOLLAR
                {
                mRULE_KW_DOLLAR(); 

                }
                break;
            case 103 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:982: RULE_KW_SLASH
                {
                mRULE_KW_SLASH(); 

                }
                break;
            case 104 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:996: RULE_KW_BACKSLASH
                {
                mRULE_KW_BACKSLASH(); 

                }
                break;
            case 105 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:1014: RULE_KW_WEDGE
                {
                mRULE_KW_WEDGE(); 

                }
                break;
            case 106 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:1028: RULE_KW_VEE
                {
                mRULE_KW_VEE(); 

                }
                break;
            case 107 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:1040: RULE_KW_IMPLIES
                {
                mRULE_KW_IMPLIES(); 

                }
                break;
            case 108 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:1056: RULE_KW_ASSIGN
                {
                mRULE_KW_ASSIGN(); 

                }
                break;
            case 109 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:1071: RULE_KW_2EQ
                {
                mRULE_KW_2EQ(); 

                }
                break;
            case 110 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:1083: RULE_KW_RARROW
                {
                mRULE_KW_RARROW(); 

                }
                break;
            case 111 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:1098: RULE_KW_LARROW
                {
                mRULE_KW_LARROW(); 

                }
                break;
            case 112 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:1113: RULE_KW_MAPSTO
                {
                mRULE_KW_MAPSTO(); 

                }
                break;
            case 113 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:1128: RULE_KW_MAPSTOSTAR
                {
                mRULE_KW_MAPSTOSTAR(); 

                }
                break;
            case 114 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:1147: RULE_KW_MAPSTAR
                {
                mRULE_KW_MAPSTAR(); 

                }
                break;
            case 115 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/aldor/parser/antlr/internal/InternalEditor.g:1:1163: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\1\uffff\1\70\24\73\2\uffff\1\66\2\uffff\1\147\1\152\1\66\1\154\7\uffff\1\171\1\174\1\177\1\uffff\1\u0082\1\u0086\3\uffff\1\u008b\1\u008d\1\u008f\2\uffff\1\u0093\1\u0095\3\uffff\2\73\1\uffff\10\73\1\u00a6\1\u00a8\1\73\1\u00aa\1\73\1\u00ad\1\u00ae\7\73\1\u00bb\13\73\1\u00c8\1\u00c9\3\73\3\uffff\1\u00ce\2\uffff\1\u00d0\3\uffff\1\154\17\uffff\1\u00d2\30\uffff\1\73\1\u00d4\11\73\1\u00de\1\73\1\u00e0\2\73\1\uffff\1\73\1\uffff\1\73\1\uffff\2\73\2\uffff\2\73\1\u00eb\6\73\1\u00f2\1\u00f3\1\73\1\uffff\7\73\1\u00fc\1\u00fd\2\73\1\u0100\2\uffff\1\u0101\1\73\1\u0103\2\uffff\1\u0105\3\uffff\1\73\1\uffff\4\73\1\u010b\1\73\1\u010d\1\u010e\1\73\1\uffff\1\73\1\uffff\7\73\1\u0118\1\u0119\1\73\1\uffff\2\73\1\u011d\3\73\2\uffff\2\73\1\u0123\2\73\1\u0126\2\73\2\uffff\2\73\2\uffff\1\73\3\uffff\1\u012c\3\73\1\u0130\1\uffff\1\u0131\2\uffff\1\u0132\3\73\1\u0136\4\73\2\uffff\1\u013b\1\u013c\1\u013d\1\uffff\3\73\1\u0141\1\u0142\1\uffff\2\73\1\uffff\2\73\1\u0147\1\u0148\1\73\1\uffff\1\u014a\1\u014b\1\u014c\3\uffff\2\73\1\u014f\1\uffff\1\u0150\1\u0151\2\73\3\uffff\1\u0154\1\73\1\u0156\2\uffff\1\u0157\1\73\1\u0159\1\u015a\2\uffff\1\73\3\uffff\1\u015c\1\u015d\3\uffff\1\u015e\1\u015f\1\uffff\1\73\2\uffff\1\73\2\uffff\1\u0162\4\uffff\1\73\1\u0164\1\uffff\1\u0165\2\uffff";
    static final String DFA11_eofS =
        "\u0166\uffff";
    static final String DFA11_minS =
        "\1\0\1\151\1\141\1\154\1\157\1\151\1\145\1\146\2\150\1\145\1\162\1\141\2\145\1\144\1\151\1\145\1\146\1\141\1\162\1\165\2\uffff\1\0\2\uffff\1\55\1\53\1\0\1\60\7\uffff\1\55\2\75\1\uffff\1\56\1\52\3\uffff\1\52\2\75\2\uffff\1\134\1\57\3\uffff\1\143\1\144\1\uffff\1\143\1\163\1\143\1\145\1\165\1\156\1\162\1\146\2\41\1\160\1\41\1\145\2\41\1\145\1\171\1\145\1\164\1\146\1\164\1\145\1\41\1\163\1\154\1\156\1\164\1\163\1\167\2\144\1\145\1\166\1\164\2\41\1\163\1\145\1\157\3\uffff\1\52\2\uffff\1\76\3\uffff\1\60\17\uffff\1\76\30\uffff\1\162\1\41\1\145\1\157\1\145\1\165\1\145\1\141\1\145\1\155\1\151\1\41\1\141\1\41\2\141\1\uffff\1\151\1\uffff\1\154\1\uffff\1\162\1\164\2\uffff\1\156\1\157\1\41\1\162\1\154\1\150\2\145\1\165\2\41\1\141\1\uffff\1\143\3\145\1\157\1\145\1\141\2\41\1\154\1\145\1\41\2\uffff\1\41\1\164\1\41\2\uffff\1\52\3\uffff\1\157\1\uffff\1\156\1\162\1\160\1\157\1\41\1\154\2\41\1\144\1\uffff\1\154\1\uffff\1\165\1\156\1\171\1\156\1\162\1\151\1\141\2\41\1\167\1\uffff\2\145\1\41\1\141\2\162\2\uffff\1\153\1\150\1\41\1\143\1\162\1\41\1\162\1\171\2\uffff\1\144\1\162\2\uffff\1\145\3\uffff\1\41\1\144\2\164\1\41\1\uffff\1\41\2\uffff\1\41\2\154\1\145\1\41\1\145\1\164\1\145\1\164\2\uffff\3\41\1\uffff\1\164\1\145\1\156\2\41\1\uffff\1\164\1\141\1\uffff\1\164\1\163\2\41\1\156\1\uffff\3\41\3\uffff\1\171\1\164\1\41\1\uffff\2\41\1\163\1\145\3\uffff\1\41\1\156\1\41\2\uffff\1\41\1\164\2\41\2\uffff\1\144\3\uffff\2\41\3\uffff\2\41\1\uffff\1\143\2\uffff\1\145\2\uffff\1\41\4\uffff\1\145\1\41\1\uffff\1\41\2\uffff";
    static final String DFA11_maxS =
        "\1\uffff\1\151\1\157\1\170\1\157\1\162\1\157\1\164\1\162\1\151\1\145\1\171\1\141\1\145\1\157\1\163\1\151\1\157\1\162\1\141\1\162\1\165\2\uffff\1\uffff\2\uffff\1\76\1\55\1\uffff\1\145\7\uffff\1\75\2\76\1\uffff\1\56\1\75\3\uffff\1\52\2\75\2\uffff\1\134\1\57\3\uffff\1\143\1\144\1\uffff\1\164\1\163\1\143\1\157\1\165\1\170\1\162\1\154\2\172\1\160\1\172\1\145\2\172\1\162\1\171\1\151\3\164\1\145\1\172\1\164\1\154\1\156\1\164\1\163\1\167\2\144\1\145\1\166\1\164\2\172\1\163\1\145\1\157\3\uffff\1\52\2\uffff\1\76\3\uffff\1\145\17\uffff\1\76\30\uffff\1\162\1\172\1\145\1\157\1\145\1\165\1\145\1\141\1\145\1\155\1\151\1\172\1\141\1\172\1\151\1\141\1\uffff\1\151\1\uffff\1\157\1\uffff\1\162\1\164\2\uffff\1\156\1\157\1\172\1\162\1\154\1\150\2\145\1\165\2\172\1\141\1\uffff\1\143\3\145\1\157\1\145\1\141\2\172\1\154\1\145\1\172\2\uffff\1\172\1\164\1\172\2\uffff\1\52\3\uffff\1\157\1\uffff\1\156\1\162\1\160\1\157\1\172\1\154\2\172\1\144\1\uffff\1\154\1\uffff\1\165\1\156\1\171\1\156\1\162\1\151\1\141\2\172\1\167\1\uffff\2\145\1\172\1\141\2\162\2\uffff\1\153\1\150\1\172\1\143\1\162\1\172\1\162\1\171\2\uffff\1\144\1\162\2\uffff\1\145\3\uffff\1\172\1\144\2\164\1\172\1\uffff\1\172\2\uffff\1\172\2\154\1\145\1\172\1\145\1\164\1\145\1\164\2\uffff\3\172\1\uffff\1\164\1\145\1\156\2\172\1\uffff\1\164\1\141\1\uffff\1\164\1\163\2\172\1\156\1\uffff\3\172\3\uffff\1\171\1\164\1\172\1\uffff\2\172\1\163\1\145\3\uffff\1\172\1\156\1\172\2\uffff\1\172\1\164\2\172\2\uffff\1\144\3\uffff\2\172\3\uffff\2\172\1\uffff\1\143\2\uffff\1\145\2\uffff\1\172\4\uffff\1\145\1\172\1\uffff\1\172\2\uffff";
    static final String DFA11_acceptS =
        "\26\uffff\2\73\1\uffff\1\74\1\75\4\uffff\1\103\1\104\1\105\1\106\1\107\1\110\1\111\3\uffff\1\115\2\uffff\1\122\1\123\1\124\3\uffff\1\145\1\146\2\uffff\1\163\1\1\1\144\2\uffff\1\73\47\uffff\1\74\1\75\1\76\1\uffff\1\130\1\77\1\uffff\1\127\1\100\1\101\1\uffff\1\102\1\103\1\104\1\105\1\106\1\107\1\110\1\111\1\112\1\134\1\157\1\132\1\113\1\135\1\133\1\uffff\1\153\1\136\1\115\1\143\1\116\1\117\1\120\1\154\1\121\1\122\1\123\1\124\1\125\1\126\1\137\1\141\1\140\1\142\1\145\1\146\1\151\1\147\1\152\1\150\20\uffff\1\32\1\uffff\1\31\1\uffff\1\20\2\uffff\1\62\1\15\14\uffff\1\65\14\uffff\1\47\1\55\3\uffff\1\162\1\156\1\uffff\1\131\1\114\1\155\1\uffff\1\66\11\uffff\1\11\1\uffff\1\52\12\uffff\1\25\6\uffff\1\70\1\26\10\uffff\1\54\1\61\2\uffff\1\72\1\56\1\uffff\1\67\1\161\1\160\5\uffff\1\23\1\uffff\1\5\1\16\11\uffff\1\63\1\21\3\uffff\1\60\5\uffff\1\64\2\uffff\1\45\5\uffff\1\2\3\uffff\1\71\1\4\1\6\3\uffff\1\33\4\uffff\1\44\1\17\1\53\3\uffff\1\40\1\27\4\uffff\1\42\1\46\1\uffff\1\3\1\14\1\43\2\uffff\1\10\1\12\1\13\2\uffff\1\24\1\uffff\1\41\1\30\1\uffff\1\36\1\50\1\uffff\1\51\1\7\1\22\1\37\2\uffff\1\57\1\uffff\1\35\1\34";
    static final String DFA11_specialS =
        "\1\2\27\uffff\1\0\4\uffff\1\1\u0148\uffff}>";
    static final String[] DFA11_transitionS = {
            "\11\66\1\31\1\32\2\66\1\32\22\66\1\31\1\66\1\35\1\1\1\63\1\66\1\62\1\37\1\40\1\41\1\57\1\34\1\55\1\33\1\52\1\64\12\36\1\53\1\56\1\46\1\50\1\47\1\66\1\54\32\27\1\44\1\65\1\45\1\61\1\30\1\66\1\17\1\13\1\14\1\6\1\3\1\5\1\16\1\23\1\7\2\26\1\4\1\2\1\21\1\22\1\24\1\25\1\12\1\15\1\10\2\26\1\11\1\26\1\20\1\26\1\42\1\51\1\43\1\60\uff81\66",
            "\1\67",
            "\1\71\15\uffff\1\72",
            "\1\75\13\uffff\1\74",
            "\1\76",
            "\1\101\2\uffff\1\100\2\uffff\1\102\2\uffff\1\77",
            "\1\103\11\uffff\1\104",
            "\1\107\6\uffff\1\106\1\105\4\uffff\1\111\1\110",
            "\1\113\6\uffff\1\112\2\uffff\1\114",
            "\1\115\1\116",
            "\1\117",
            "\1\121\2\uffff\1\120\3\uffff\1\122",
            "\1\123",
            "\1\124",
            "\1\125\11\uffff\1\126",
            "\1\132\7\uffff\1\130\1\uffff\1\131\4\uffff\1\127",
            "\1\133",
            "\1\134\11\uffff\1\135",
            "\1\136\13\uffff\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "",
            "",
            "\0\73",
            "",
            "",
            "\1\145\20\uffff\1\146",
            "\1\150\1\uffff\1\151",
            "\0\153",
            "\12\155\13\uffff\1\156\37\uffff\1\156",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\170\16\uffff\1\166\1\167",
            "\1\173\1\172",
            "\1\175\1\176",
            "",
            "\1\u0081",
            "\1\u0084\17\uffff\1\u0083\2\uffff\1\u0085",
            "",
            "",
            "",
            "\1\u008a",
            "\1\u008c",
            "\1\u008e",
            "",
            "",
            "\1\u0092",
            "\1\u0094",
            "",
            "",
            "",
            "\1\u0096",
            "\1\u0097",
            "",
            "\1\u009a\14\uffff\1\u0099\1\u009b\2\uffff\1\u0098",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e\11\uffff\1\u009f",
            "\1\u00a0",
            "\1\u00a2\11\uffff\1\u00a1",
            "\1\u00a3",
            "\1\u00a4\5\uffff\1\u00a5",
            "\1\73\16\uffff\12\73\5\uffff\1\73\1\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\73\16\uffff\12\73\5\uffff\1\73\1\uffff\32\73\4\uffff\1\73\1\uffff\13\73\1\u00a7\16\73",
            "\1\u00a9",
            "\1\73\16\uffff\12\73\5\uffff\1\73\1\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u00ab",
            "\1\73\16\uffff\12\73\5\uffff\1\73\1\uffff\32\73\4\uffff\1\73\1\uffff\15\73\1\u00ac\14\73",
            "\1\73\16\uffff\12\73\5\uffff\1\73\1\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u00af\14\uffff\1\u00b0",
            "\1\u00b1",
            "\1\u00b2\3\uffff\1\u00b3",
            "\1\u00b4",
            "\1\u00b6\6\uffff\1\u00b8\2\uffff\1\u00b5\3\uffff\1\u00b7",
            "\1\u00b9",
            "\1\u00ba",
            "\1\73\16\uffff\12\73\5\uffff\1\73\1\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u00bd\1\u00bc",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\73\16\uffff\12\73\5\uffff\1\73\1\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\73\16\uffff\12\73\5\uffff\1\73\1\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "",
            "",
            "",
            "\1\u00cd",
            "",
            "",
            "\1\u00cf",
            "",
            "",
            "",
            "\12\155\13\uffff\1\156\37\uffff\1\156",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00d1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00d3",
            "\1\73\16\uffff\12\73\5\uffff\1\73\1\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\73\16\uffff\12\73\5\uffff\1\73\1\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u00df",
            "\1\73\16\uffff\12\73\5\uffff\1\73\1\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u00e1\7\uffff\1\u00e2",
            "\1\u00e3",
            "",
            "\1\u00e4",
            "",
            "\1\u00e6\2\uffff\1\u00e5",
            "",
            "\1\u00e7",
            "\1\u00e8",
            "",
            "",
            "\1\u00e9",
            "\1\u00ea",
            "\1\73\16\uffff\12\73\5\uffff\1\73\1\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\73\16\uffff\12\73\5\uffff\1\73\1\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\73\16\uffff\12\73\5\uffff\1\73\1\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u00f4",
            "",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\73\16\uffff\12\73\5\uffff\1\73\1\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\73\16\uffff\12\73\5\uffff\1\73\1\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u00fe",
            "\1\u00ff",
            "\1\73\16\uffff\12\73\5\uffff\1\73\1\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "",
            "\1\73\16\uffff\12\73\5\uffff\1\73\1\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0102",
            "\1\73\16\uffff\12\73\5\uffff\1\73\1\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "",
            "\1\u0104",
            "",
            "",
            "",
            "\1\u0106",
            "",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\1\73\16\uffff\12\73\5\uffff\1\73\1\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u010c",
            "\1\73\16\uffff\12\73\5\uffff\1\73\1\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\73\16\uffff\12\73\5\uffff\1\73\1\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u010f",
            "",
            "\1\u0110",
            "",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "\1\73\16\uffff\12\73\5\uffff\1\73\1\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\73\16\uffff\12\73\5\uffff\1\73\1\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u011a",
            "",
            "\1\u011b",
            "\1\u011c",
            "\1\73\16\uffff\12\73\5\uffff\1\73\1\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "",
            "",
            "\1\u0121",
            "\1\u0122",
            "\1\73\16\uffff\12\73\5\uffff\1\73\1\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0124",
            "\1\u0125",
            "\1\73\16\uffff\12\73\5\uffff\1\73\1\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0127",
            "\1\u0128",
            "",
            "",
            "\1\u0129",
            "\1\u012a",
            "",
            "",
            "\1\u012b",
            "",
            "",
            "",
            "\1\73\16\uffff\12\73\5\uffff\1\73\1\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\1\73\16\uffff\12\73\5\uffff\1\73\1\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "\1\73\16\uffff\12\73\5\uffff\1\73\1\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "",
            "\1\73\16\uffff\12\73\5\uffff\1\73\1\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0133",
            "\1\u0134",
            "\1\u0135",
            "\1\73\16\uffff\12\73\5\uffff\1\73\1\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0137",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "",
            "",
            "\1\73\16\uffff\12\73\5\uffff\1\73\1\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\73\16\uffff\12\73\5\uffff\1\73\1\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\73\16\uffff\12\73\5\uffff\1\73\1\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "\1\u013e",
            "\1\u013f",
            "\1\u0140",
            "\1\73\16\uffff\12\73\5\uffff\1\73\1\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\73\16\uffff\12\73\5\uffff\1\73\1\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "\1\u0143",
            "\1\u0144",
            "",
            "\1\u0145",
            "\1\u0146",
            "\1\73\16\uffff\12\73\5\uffff\1\73\1\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\73\16\uffff\12\73\5\uffff\1\73\1\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0149",
            "",
            "\1\73\16\uffff\12\73\5\uffff\1\73\1\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\73\16\uffff\12\73\5\uffff\1\73\1\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\73\16\uffff\12\73\5\uffff\1\73\1\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "",
            "",
            "\1\u014d",
            "\1\u014e",
            "\1\73\16\uffff\12\73\5\uffff\1\73\1\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "\1\73\16\uffff\12\73\5\uffff\1\73\1\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\73\16\uffff\12\73\5\uffff\1\73\1\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0152",
            "\1\u0153",
            "",
            "",
            "",
            "\1\73\16\uffff\12\73\5\uffff\1\73\1\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0155",
            "\1\73\16\uffff\12\73\5\uffff\1\73\1\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "",
            "\1\73\16\uffff\12\73\5\uffff\1\73\1\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0158",
            "\1\73\16\uffff\12\73\5\uffff\1\73\1\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\73\16\uffff\12\73\5\uffff\1\73\1\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "",
            "\1\u015b",
            "",
            "",
            "",
            "\1\73\16\uffff\12\73\5\uffff\1\73\1\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\73\16\uffff\12\73\5\uffff\1\73\1\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "",
            "",
            "\1\73\16\uffff\12\73\5\uffff\1\73\1\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\73\16\uffff\12\73\5\uffff\1\73\1\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "\1\u0160",
            "",
            "",
            "\1\u0161",
            "",
            "",
            "\1\73\16\uffff\12\73\5\uffff\1\73\1\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "",
            "",
            "",
            "\1\u0163",
            "\1\73\16\uffff\12\73\5\uffff\1\73\1\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "\1\73\16\uffff\12\73\5\uffff\1\73\1\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
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
            return "1:1: Tokens : ( T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | RULE_TK_ID | RULE_WS | RULE_KW_NEWLINE | RULE_TK_PREDOC | RULE_TK_POSTDOC | RULE_TK_STRING | RULE_TK_INT | RULE_TK_FLOAT | RULE_KW_QUOTE | RULE_KW_OPAREN | RULE_KW_CPAREN | RULE_KW_OCURLY | RULE_KW_CCURLY | RULE_KW_OBRACK | RULE_KW_CBRACK | RULE_KW_2LT | RULE_KW_2GT | RULE_KW_MARROW | RULE_KW_BAR | RULE_KW_DOT | RULE_KW_2COLON | RULE_KW_COLONSTAR | RULE_KW_COLON | RULE_KW_AT | RULE_KW_COMMA | RULE_KW_SEMICOLON | RULE_KW_2STAR | RULE_KW_STAR | RULE_KW_PLUS | RULE_KW_MINUS | RULE_KW_PLUSMINUS | RULE_KW_LT | RULE_KW_GT | RULE_KW_LE | RULE_KW_GE | RULE_KW_EQ | RULE_KW_TILDEE | RULE_KW_HATE | RULE_KW_TILDE | RULE_KW_HAT | RULE_KW_2DOT | RULE_KW_SHARP | RULE_KW_AMPERSAND | RULE_KW_DOLLAR | RULE_KW_SLASH | RULE_KW_BACKSLASH | RULE_KW_WEDGE | RULE_KW_VEE | RULE_KW_IMPLIES | RULE_KW_ASSIGN | RULE_KW_2EQ | RULE_KW_RARROW | RULE_KW_LARROW | RULE_KW_MAPSTO | RULE_KW_MAPSTOSTAR | RULE_KW_MAPSTAR | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_24 = input.LA(1);

                        s = -1;
                        if ( ((LA11_24>='\u0000' && LA11_24<='\uFFFF')) ) {s = 59;}

                        else s = 54;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA11_29 = input.LA(1);

                        s = -1;
                        if ( ((LA11_29>='\u0000' && LA11_29<='\uFFFF')) ) {s = 107;}

                        else s = 54;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA11_0 = input.LA(1);

                        s = -1;
                        if ( (LA11_0=='#') ) {s = 1;}

                        else if ( (LA11_0=='m') ) {s = 2;}

                        else if ( (LA11_0=='e') ) {s = 3;}

                        else if ( (LA11_0=='l') ) {s = 4;}

                        else if ( (LA11_0=='f') ) {s = 5;}

                        else if ( (LA11_0=='d') ) {s = 6;}

                        else if ( (LA11_0=='i') ) {s = 7;}

                        else if ( (LA11_0=='t') ) {s = 8;}

                        else if ( (LA11_0=='w') ) {s = 9;}

                        else if ( (LA11_0=='r') ) {s = 10;}

                        else if ( (LA11_0=='b') ) {s = 11;}

                        else if ( (LA11_0=='c') ) {s = 12;}

                        else if ( (LA11_0=='s') ) {s = 13;}

                        else if ( (LA11_0=='g') ) {s = 14;}

                        else if ( (LA11_0=='a') ) {s = 15;}

                        else if ( (LA11_0=='y') ) {s = 16;}

                        else if ( (LA11_0=='n') ) {s = 17;}

                        else if ( (LA11_0=='o') ) {s = 18;}

                        else if ( (LA11_0=='h') ) {s = 19;}

                        else if ( (LA11_0=='p') ) {s = 20;}

                        else if ( (LA11_0=='q') ) {s = 21;}

                        else if ( ((LA11_0>='j' && LA11_0<='k')||(LA11_0>='u' && LA11_0<='v')||LA11_0=='x'||LA11_0=='z') ) {s = 22;}

                        else if ( ((LA11_0>='A' && LA11_0<='Z')) ) {s = 23;}

                        else if ( (LA11_0=='_') ) {s = 24;}

                        else if ( (LA11_0=='\t'||LA11_0==' ') ) {s = 25;}

                        else if ( (LA11_0=='\n'||LA11_0=='\r') ) {s = 26;}

                        else if ( (LA11_0=='-') ) {s = 27;}

                        else if ( (LA11_0=='+') ) {s = 28;}

                        else if ( (LA11_0=='\"') ) {s = 29;}

                        else if ( ((LA11_0>='0' && LA11_0<='9')) ) {s = 30;}

                        else if ( (LA11_0=='\'') ) {s = 31;}

                        else if ( (LA11_0=='(') ) {s = 32;}

                        else if ( (LA11_0==')') ) {s = 33;}

                        else if ( (LA11_0=='{') ) {s = 34;}

                        else if ( (LA11_0=='}') ) {s = 35;}

                        else if ( (LA11_0=='[') ) {s = 36;}

                        else if ( (LA11_0==']') ) {s = 37;}

                        else if ( (LA11_0=='<') ) {s = 38;}

                        else if ( (LA11_0=='>') ) {s = 39;}

                        else if ( (LA11_0=='=') ) {s = 40;}

                        else if ( (LA11_0=='|') ) {s = 41;}

                        else if ( (LA11_0=='.') ) {s = 42;}

                        else if ( (LA11_0==':') ) {s = 43;}

                        else if ( (LA11_0=='@') ) {s = 44;}

                        else if ( (LA11_0==',') ) {s = 45;}

                        else if ( (LA11_0==';') ) {s = 46;}

                        else if ( (LA11_0=='*') ) {s = 47;}

                        else if ( (LA11_0=='~') ) {s = 48;}

                        else if ( (LA11_0=='^') ) {s = 49;}

                        else if ( (LA11_0=='&') ) {s = 50;}

                        else if ( (LA11_0=='$') ) {s = 51;}

                        else if ( (LA11_0=='/') ) {s = 52;}

                        else if ( (LA11_0=='\\') ) {s = 53;}

                        else if ( ((LA11_0>='\u0000' && LA11_0<='\b')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\u001F')||LA11_0=='!'||LA11_0=='%'||LA11_0=='?'||LA11_0=='`'||(LA11_0>='\u007F' && LA11_0<='\uFFFF')) ) {s = 54;}

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