package com.euclideanspace.spad.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEditorLexer extends Lexer {
    public static final int RULE_TILDE=31;
    public static final int RULE_ID=6;
    public static final int RULE_ANY_OTHER=54;
    public static final int RULE_PERCENT=17;
    public static final int RULE_PRIMEPERCENT=53;
    public static final int EOF=-1;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int RULE_LARROW=63;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int RULE_BACKSLASHSLASH=39;
    public static final int T__90=90;
    public static final int RULE_LPAREN=14;
    public static final int RULE_GT=20;
    public static final int RULE_BACKSLASH=60;
    public static final int RULE_CARAT=29;
    public static final int RULE_AMPERSAND=27;
    public static final int T__99=99;
    public static final int RULE_RBRACKET=56;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int RULE_GE=22;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int T__80=80;
    public static final int RULE_RBRACE=11;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_EXIT=37;
    public static final int RULE_HASH=32;
    public static final int RULE_COMMA=15;
    public static final int RULE_PLUSDOLAR=43;
    public static final int RULE_ELLIPSIS=64;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int RULE_TIMES=25;
    public static final int RULE_MACROVALUE=33;
    public static final int RULE_MINUS=24;
    public static final int RULE_STRING=34;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int RULE_SUMLIST=52;
    public static final int RULE_CANGLE=59;
    public static final int RULE_BAR=28;
    public static final int RULE_SLASH=26;
    public static final int RULE_RPAREN=16;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int RULE_AT=5;
    public static final int T__77=77;
    public static final int RULE_GIVES=48;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__65=65;
    public static final int RULE_TIMESDOLAR=46;
    public static final int RULE_COERCE=49;
    public static final int RULE_SEMICOLON=12;
    public static final int RULE_OANGLE=58;
    public static final int RULE_LBRACKET=55;
    public static final int RULE_LT=19;
    public static final int RULE_DOT=50;
    public static final int RULE_EQUALSDOLAR=42;
    public static final int T__107=107;
    public static final int RULE_LE=21;
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int RULE_SEG=38;
    public static final int RULE_INT=30;
    public static final int RULE_SLASHBACKSLASH=40;
    public static final int RULE_LBRACE=9;
    public static final int RULE_POWER=47;
    public static final int RULE_NOTEQUAL=41;
    public static final int RULE_DOLAR=51;
    public static final int RULE_MDEF=13;
    public static final int RULE_BECOMES=35;
    public static final int RULE_PLUS=23;
    public static final int RULE_NL=10;
    public static final int T__102=102;
    public static final int RULE_EQUAL=18;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int RULE_SL_COMMENT=57;
    public static final int RULE_MINUSDOLAR=44;
    public static final int RULE_BACKSLASHBACKSLASH=62;
    public static final int RULE_COLON=7;
    public static final int RULE_SLASHSLASH=61;
    public static final int RULE_DIVDOLAR=45;
    public static final int RULE_ARROW=36;
    public static final int RULE_DEF=8;
    public static final int RULE_WS=4;

    // delegates
    // delegators

    public InternalEditorLexer() {;} 
    public InternalEditorLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalEditorLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g"; }

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11:7: ( ')abbrev' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11:9: ')abbrev'
            {
            match(")abbrev"); 


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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:12:7: ( 'category' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:12:9: 'category'
            {
            match("category"); 


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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:13:7: ( 'Category' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:13:9: 'Category'
            {
            match("Category"); 


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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:14:7: ( 'package' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:14:9: 'package'
            {
            match("package"); 


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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:15:7: ( 'domain' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:15:9: 'domain'
            {
            match("domain"); 


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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:16:7: ( 'where' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:16:9: 'where'
            {
            match("where"); 


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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:17:7: ( 'with' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:17:9: 'with'
            {
            match("with"); 


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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:18:7: ( 'add' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:18:9: 'add'
            {
            match("add"); 


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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:19:7: ( 'if' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:19:9: 'if'
            {
            match("if"); 


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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:20:7: ( 'then' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:20:9: 'then'
            {
            match("then"); 


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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:21:7: ( 'else' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:21:9: 'else'
            {
            match("else"); 


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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:22:7: ( 'error' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:22:9: 'error'
            {
            match("error"); 


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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:23:7: ( 'not' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:23:9: 'not'
            {
            match("not"); 


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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:24:7: ( 'import' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:24:9: 'import'
            {
            match("import"); 


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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:25:7: ( 'Type' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:25:9: 'Type'
            {
            match("Type"); 


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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:26:7: ( 'Record' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:26:9: 'Record'
            {
            match("Record"); 


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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:27:7: ( 'Union' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:27:9: 'Union'
            {
            match("Union"); 


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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:28:7: ( 'Join' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:28:9: 'Join'
            {
            match("Join"); 


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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:29:7: ( 'Lisp' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:29:9: 'Lisp'
            {
            match("Lisp"); 


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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:30:7: ( 'for' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:30:9: 'for'
            {
            match("for"); 


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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:31:7: ( 'in' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:31:9: 'in'
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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:32:7: ( 'by' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:32:9: 'by'
            {
            match("by"); 


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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:33:7: ( 'while' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:33:9: 'while'
            {
            match("while"); 


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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:34:7: ( 'repeat' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:34:9: 'repeat'
            {
            match("repeat"); 


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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:35:7: ( 'do' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:35:9: 'do'
            {
            match("do"); 


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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:36:7: ( 'iterate' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:36:9: 'iterate'
            {
            match("iterate"); 


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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:37:7: ( 'break' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:37:9: 'break'
            {
            match("break"); 


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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:38:7: ( 'return' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:38:9: 'return'
            {
            match("return"); 


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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:39:7: ( 'or' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:39:9: 'or'
            {
            match("or"); 


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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:40:7: ( 'and' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:40:9: 'and'
            {
            match("and"); 


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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:41:7: ( 'has' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:41:9: 'has'
            {
            match("has"); 


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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:42:7: ( 'case' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:42:9: 'case'
            {
            match("case"); 


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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:43:7: ( '^=' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:43:9: '^='
            {
            match("^="); 


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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:44:7: ( 'is' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:44:9: 'is'
            {
            match("is"); 


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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:45:7: ( 'isnt' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:45:9: 'isnt'
            {
            match("isnt"); 


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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:46:8: ( 'exquo' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:46:10: 'exquo'
            {
            match("exquo"); 


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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:47:8: ( 'quo' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:47:10: 'quo'
            {
            match("quo"); 


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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:48:8: ( 'mod' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:48:10: 'mod'
            {
            match("mod"); 


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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:49:8: ( 'rem' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:49:10: 'rem'
            {
            match("rem"); 


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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:50:8: ( 'pretend' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:50:10: 'pretend'
            {
            match("pretend"); 


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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:51:8: ( '\\'' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:51:10: '\\''
            {
            match('\''); 

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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:52:8: ( 'true' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:52:10: 'true'
            {
            match("true"); 


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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:53:8: ( 'false' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:53:10: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__107"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11638:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' . ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' . | '0' .. '9' )* ( '!' )? ( '?' )? )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11638:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' . ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' . | '0' .. '9' )* ( '!' )? ( '?' )?
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11638:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' . )
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
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11638:12: 'a' .. 'z'
                    {
                    matchRange('a','z'); 

                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11638:21: 'A' .. 'Z'
                    {
                    matchRange('A','Z'); 

                    }
                    break;
                case 3 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11638:30: '_' .
                    {
                    match('_'); 
                    matchAny(); 

                    }
                    break;

            }

            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11638:37: ( 'a' .. 'z' | 'A' .. 'Z' | '_' . | '0' .. '9' )*
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
            	    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11638:38: 'a' .. 'z'
            	    {
            	    matchRange('a','z'); 

            	    }
            	    break;
            	case 2 :
            	    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11638:47: 'A' .. 'Z'
            	    {
            	    matchRange('A','Z'); 

            	    }
            	    break;
            	case 3 :
            	    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11638:56: '_' .
            	    {
            	    match('_'); 
            	    matchAny(); 

            	    }
            	    break;
            	case 4 :
            	    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11638:62: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11638:73: ( '!' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='!') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11638:73: '!'
                    {
                    match('!'); 

                    }
                    break;

            }

            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11638:78: ( '?' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='?') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11638:78: '?'
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
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11640:9: ( ( ' ' | '\\t' )+ )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11640:11: ( ' ' | '\\t' )+
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11640:11: ( ' ' | '\\t' )+
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
            	    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:
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

    // $ANTLR start "RULE_NL"
    public final void mRULE_NL() throws RecognitionException {
        try {
            int _type = RULE_NL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11642:9: ( ( '\\r' | '\\n' ) )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11642:11: ( '\\r' | '\\n' )
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
    // $ANTLR end "RULE_NL"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11644:17: ( ( '--' | '++' ) (~ ( ( '\\n' | '\\r' ) ) )* )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11644:19: ( '--' | '++' ) (~ ( ( '\\n' | '\\r' ) ) )*
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11644:19: ( '--' | '++' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='-') ) {
                alt6=1;
            }
            else if ( (LA6_0=='+') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11644:20: '--'
                    {
                    match("--"); 


                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11644:25: '++'
                    {
                    match("++"); 


                    }
                    break;

            }

            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11644:31: (~ ( ( '\\n' | '\\r' ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='\u0000' && LA7_0<='\t')||(LA7_0>='\u000B' && LA7_0<='\f')||(LA7_0>='\u000E' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11644:31: ~ ( ( '\\n' | '\\r' ) )
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
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_MACROVALUE"
    public final void mRULE_MACROVALUE() throws RecognitionException {
        try {
            int _type = RULE_MACROVALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11646:17: ( '===>' (~ ( ( '\\n' | '\\r' ) ) )* )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11646:19: '===>' (~ ( ( '\\n' | '\\r' ) ) )*
            {
            match("===>"); 

            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11646:26: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11646:26: ~ ( ( '\\n' | '\\r' ) )
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

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11648:13: ( '\"' (~ ( '\"' ) )* '\"' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11648:15: '\"' (~ ( '\"' ) )* '\"'
            {
            match('\"'); 
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11648:19: (~ ( '\"' ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='!')||(LA9_0>='#' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11648:19: ~ ( '\"' )
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
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11650:10: ( ( '0' .. '9' )+ )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11650:12: ( '0' .. '9' )+
            {
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11650:12: ( '0' .. '9' )+
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
            	    // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11650:13: '0' .. '9'
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
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_LPAREN"
    public final void mRULE_LPAREN() throws RecognitionException {
        try {
            int _type = RULE_LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11652:13: ( '(' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11652:15: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LPAREN"

    // $ANTLR start "RULE_RPAREN"
    public final void mRULE_RPAREN() throws RecognitionException {
        try {
            int _type = RULE_RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11654:13: ( ')' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11654:15: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RPAREN"

    // $ANTLR start "RULE_LBRACE"
    public final void mRULE_LBRACE() throws RecognitionException {
        try {
            int _type = RULE_LBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11656:13: ( '{' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11656:15: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LBRACE"

    // $ANTLR start "RULE_RBRACE"
    public final void mRULE_RBRACE() throws RecognitionException {
        try {
            int _type = RULE_RBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11658:13: ( '}' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11658:15: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RBRACE"

    // $ANTLR start "RULE_LBRACKET"
    public final void mRULE_LBRACKET() throws RecognitionException {
        try {
            int _type = RULE_LBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11660:15: ( '[' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11660:17: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LBRACKET"

    // $ANTLR start "RULE_RBRACKET"
    public final void mRULE_RBRACKET() throws RecognitionException {
        try {
            int _type = RULE_RBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11662:15: ( ']' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11662:17: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RBRACKET"

    // $ANTLR start "RULE_OANGLE"
    public final void mRULE_OANGLE() throws RecognitionException {
        try {
            int _type = RULE_OANGLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11664:13: ( '<<' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11664:15: '<<'
            {
            match("<<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OANGLE"

    // $ANTLR start "RULE_CANGLE"
    public final void mRULE_CANGLE() throws RecognitionException {
        try {
            int _type = RULE_CANGLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11666:13: ( '>>' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11666:15: '>>'
            {
            match(">>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CANGLE"

    // $ANTLR start "RULE_MDEF"
    public final void mRULE_MDEF() throws RecognitionException {
        try {
            int _type = RULE_MDEF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11668:11: ( '==>' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11668:13: '==>'
            {
            match("==>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MDEF"

    // $ANTLR start "RULE_BAR"
    public final void mRULE_BAR() throws RecognitionException {
        try {
            int _type = RULE_BAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11670:10: ( '|' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11670:12: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BAR"

    // $ANTLR start "RULE_DOT"
    public final void mRULE_DOT() throws RecognitionException {
        try {
            int _type = RULE_DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11672:10: ( '.' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11672:12: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOT"

    // $ANTLR start "RULE_COERCE"
    public final void mRULE_COERCE() throws RecognitionException {
        try {
            int _type = RULE_COERCE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11674:13: ( '::' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11674:15: '::'
            {
            match("::"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COERCE"

    // $ANTLR start "RULE_COLON"
    public final void mRULE_COLON() throws RecognitionException {
        try {
            int _type = RULE_COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11676:12: ( ':' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11676:14: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COLON"

    // $ANTLR start "RULE_AT"
    public final void mRULE_AT() throws RecognitionException {
        try {
            int _type = RULE_AT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11678:9: ( '@' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11678:11: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_AT"

    // $ANTLR start "RULE_COMMA"
    public final void mRULE_COMMA() throws RecognitionException {
        try {
            int _type = RULE_COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11680:12: ( ',' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11680:14: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMA"

    // $ANTLR start "RULE_SEMICOLON"
    public final void mRULE_SEMICOLON() throws RecognitionException {
        try {
            int _type = RULE_SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11682:16: ( ';' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11682:18: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SEMICOLON"

    // $ANTLR start "RULE_POWER"
    public final void mRULE_POWER() throws RecognitionException {
        try {
            int _type = RULE_POWER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11684:12: ( '**' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11684:14: '**'
            {
            match("**"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_POWER"

    // $ANTLR start "RULE_TIMES"
    public final void mRULE_TIMES() throws RecognitionException {
        try {
            int _type = RULE_TIMES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11686:12: ( '*' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11686:14: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TIMES"

    // $ANTLR start "RULE_PLUS"
    public final void mRULE_PLUS() throws RecognitionException {
        try {
            int _type = RULE_PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11688:11: ( '+' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11688:13: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PLUS"

    // $ANTLR start "RULE_MINUS"
    public final void mRULE_MINUS() throws RecognitionException {
        try {
            int _type = RULE_MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11690:12: ( '-' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11690:14: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MINUS"

    // $ANTLR start "RULE_LT"
    public final void mRULE_LT() throws RecognitionException {
        try {
            int _type = RULE_LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11692:9: ( '<' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11692:11: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LT"

    // $ANTLR start "RULE_GT"
    public final void mRULE_GT() throws RecognitionException {
        try {
            int _type = RULE_GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11694:9: ( '>' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11694:11: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_GT"

    // $ANTLR start "RULE_LE"
    public final void mRULE_LE() throws RecognitionException {
        try {
            int _type = RULE_LE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11696:9: ( '<=' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11696:11: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LE"

    // $ANTLR start "RULE_GE"
    public final void mRULE_GE() throws RecognitionException {
        try {
            int _type = RULE_GE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11698:9: ( '>=' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11698:11: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_GE"

    // $ANTLR start "RULE_EQUAL"
    public final void mRULE_EQUAL() throws RecognitionException {
        try {
            int _type = RULE_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11700:12: ( '=' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11700:14: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EQUAL"

    // $ANTLR start "RULE_NOTEQUAL"
    public final void mRULE_NOTEQUAL() throws RecognitionException {
        try {
            int _type = RULE_NOTEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11702:15: ( '~=' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11702:17: '~='
            {
            match("~="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NOTEQUAL"

    // $ANTLR start "RULE_TILDE"
    public final void mRULE_TILDE() throws RecognitionException {
        try {
            int _type = RULE_TILDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11704:12: ( '~' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11704:14: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TILDE"

    // $ANTLR start "RULE_CARAT"
    public final void mRULE_CARAT() throws RecognitionException {
        try {
            int _type = RULE_CARAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11706:12: ( '^' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11706:14: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CARAT"

    // $ANTLR start "RULE_SEG"
    public final void mRULE_SEG() throws RecognitionException {
        try {
            int _type = RULE_SEG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11708:10: ( '..' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11708:12: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SEG"

    // $ANTLR start "RULE_HASH"
    public final void mRULE_HASH() throws RecognitionException {
        try {
            int _type = RULE_HASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11710:11: ( '#' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11710:13: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HASH"

    // $ANTLR start "RULE_AMPERSAND"
    public final void mRULE_AMPERSAND() throws RecognitionException {
        try {
            int _type = RULE_AMPERSAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11712:16: ( '&' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11712:18: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_AMPERSAND"

    // $ANTLR start "RULE_DOLAR"
    public final void mRULE_DOLAR() throws RecognitionException {
        try {
            int _type = RULE_DOLAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11714:12: ( '$' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11714:14: '$'
            {
            match('$'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOLAR"

    // $ANTLR start "RULE_SLASH"
    public final void mRULE_SLASH() throws RecognitionException {
        try {
            int _type = RULE_SLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11716:12: ( '/' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11716:14: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SLASH"

    // $ANTLR start "RULE_BACKSLASH"
    public final void mRULE_BACKSLASH() throws RecognitionException {
        try {
            int _type = RULE_BACKSLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11718:16: ( '\\\\' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11718:18: '\\\\'
            {
            match('\\'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BACKSLASH"

    // $ANTLR start "RULE_SLASHSLASH"
    public final void mRULE_SLASHSLASH() throws RecognitionException {
        try {
            int _type = RULE_SLASHSLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11720:17: ( '//' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11720:19: '//'
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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11722:25: ( '\\\\\\\\' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11722:27: '\\\\\\\\'
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

    // $ANTLR start "RULE_SLASHBACKSLASH"
    public final void mRULE_SLASHBACKSLASH() throws RecognitionException {
        try {
            int _type = RULE_SLASHBACKSLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11724:21: ( '/\\\\' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11724:23: '/\\\\'
            {
            match("/\\"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SLASHBACKSLASH"

    // $ANTLR start "RULE_BACKSLASHSLASH"
    public final void mRULE_BACKSLASHSLASH() throws RecognitionException {
        try {
            int _type = RULE_BACKSLASHSLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11726:21: ( '\\\\/' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11726:23: '\\\\/'
            {
            match("\\/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BACKSLASHSLASH"

    // $ANTLR start "RULE_TIMESDOLAR"
    public final void mRULE_TIMESDOLAR() throws RecognitionException {
        try {
            int _type = RULE_TIMESDOLAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11728:17: ( '*$' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11728:19: '*$'
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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11730:15: ( '/$' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11730:17: '/$'
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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11732:16: ( '+$' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11732:18: '+$'
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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11734:17: ( '-$' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11734:19: '-$'
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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11736:18: ( '=$' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11736:20: '=$'
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

    // $ANTLR start "RULE_EXIT"
    public final void mRULE_EXIT() throws RecognitionException {
        try {
            int _type = RULE_EXIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11738:11: ( '=>' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11738:13: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXIT"

    // $ANTLR start "RULE_BECOMES"
    public final void mRULE_BECOMES() throws RecognitionException {
        try {
            int _type = RULE_BECOMES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11740:14: ( ':=' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11740:16: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BECOMES"

    // $ANTLR start "RULE_DEF"
    public final void mRULE_DEF() throws RecognitionException {
        try {
            int _type = RULE_DEF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11742:10: ( '==' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11742:12: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DEF"

    // $ANTLR start "RULE_ARROW"
    public final void mRULE_ARROW() throws RecognitionException {
        try {
            int _type = RULE_ARROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11744:12: ( '->' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11744:14: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ARROW"

    // $ANTLR start "RULE_LARROW"
    public final void mRULE_LARROW() throws RecognitionException {
        try {
            int _type = RULE_LARROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11746:13: ( '<-' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11746:15: '<-'
            {
            match("<-"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LARROW"

    // $ANTLR start "RULE_GIVES"
    public final void mRULE_GIVES() throws RecognitionException {
        try {
            int _type = RULE_GIVES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11748:12: ( '+->' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11748:14: '+->'
            {
            match("+->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_GIVES"

    // $ANTLR start "RULE_PERCENT"
    public final void mRULE_PERCENT() throws RecognitionException {
        try {
            int _type = RULE_PERCENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11750:14: ( '%' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11750:16: '%'
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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11752:19: ( '\\'%' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11752:21: '\\'%'
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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11754:15: ( '...' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11754:17: '...'
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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11756:14: ( '+/' )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11756:16: '+/'
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
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11758:16: ( . )
            // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:11758:18: .
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
        // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:8: ( T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | RULE_ID | RULE_WS | RULE_NL | RULE_SL_COMMENT | RULE_MACROVALUE | RULE_STRING | RULE_INT | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_RBRACE | RULE_LBRACKET | RULE_RBRACKET | RULE_OANGLE | RULE_CANGLE | RULE_MDEF | RULE_BAR | RULE_DOT | RULE_COERCE | RULE_COLON | RULE_AT | RULE_COMMA | RULE_SEMICOLON | RULE_POWER | RULE_TIMES | RULE_PLUS | RULE_MINUS | RULE_LT | RULE_GT | RULE_LE | RULE_GE | RULE_EQUAL | RULE_NOTEQUAL | RULE_TILDE | RULE_CARAT | RULE_SEG | RULE_HASH | RULE_AMPERSAND | RULE_DOLAR | RULE_SLASH | RULE_BACKSLASH | RULE_SLASHSLASH | RULE_BACKSLASHBACKSLASH | RULE_SLASHBACKSLASH | RULE_BACKSLASHSLASH | RULE_TIMESDOLAR | RULE_DIVDOLAR | RULE_PLUSDOLAR | RULE_MINUSDOLAR | RULE_EQUALSDOLAR | RULE_EXIT | RULE_BECOMES | RULE_DEF | RULE_ARROW | RULE_LARROW | RULE_GIVES | RULE_PERCENT | RULE_PRIMEPERCENT | RULE_ELLIPSIS | RULE_SUMLIST | RULE_ANY_OTHER )
        int alt11=104;
        alt11 = dfa11.predict(input);
        switch (alt11) {
            case 1 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:10: T__65
                {
                mT__65(); 

                }
                break;
            case 2 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:16: T__66
                {
                mT__66(); 

                }
                break;
            case 3 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:22: T__67
                {
                mT__67(); 

                }
                break;
            case 4 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:28: T__68
                {
                mT__68(); 

                }
                break;
            case 5 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:34: T__69
                {
                mT__69(); 

                }
                break;
            case 6 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:40: T__70
                {
                mT__70(); 

                }
                break;
            case 7 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:46: T__71
                {
                mT__71(); 

                }
                break;
            case 8 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:52: T__72
                {
                mT__72(); 

                }
                break;
            case 9 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:58: T__73
                {
                mT__73(); 

                }
                break;
            case 10 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:64: T__74
                {
                mT__74(); 

                }
                break;
            case 11 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:70: T__75
                {
                mT__75(); 

                }
                break;
            case 12 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:76: T__76
                {
                mT__76(); 

                }
                break;
            case 13 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:82: T__77
                {
                mT__77(); 

                }
                break;
            case 14 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:88: T__78
                {
                mT__78(); 

                }
                break;
            case 15 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:94: T__79
                {
                mT__79(); 

                }
                break;
            case 16 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:100: T__80
                {
                mT__80(); 

                }
                break;
            case 17 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:106: T__81
                {
                mT__81(); 

                }
                break;
            case 18 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:112: T__82
                {
                mT__82(); 

                }
                break;
            case 19 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:118: T__83
                {
                mT__83(); 

                }
                break;
            case 20 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:124: T__84
                {
                mT__84(); 

                }
                break;
            case 21 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:130: T__85
                {
                mT__85(); 

                }
                break;
            case 22 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:136: T__86
                {
                mT__86(); 

                }
                break;
            case 23 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:142: T__87
                {
                mT__87(); 

                }
                break;
            case 24 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:148: T__88
                {
                mT__88(); 

                }
                break;
            case 25 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:154: T__89
                {
                mT__89(); 

                }
                break;
            case 26 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:160: T__90
                {
                mT__90(); 

                }
                break;
            case 27 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:166: T__91
                {
                mT__91(); 

                }
                break;
            case 28 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:172: T__92
                {
                mT__92(); 

                }
                break;
            case 29 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:178: T__93
                {
                mT__93(); 

                }
                break;
            case 30 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:184: T__94
                {
                mT__94(); 

                }
                break;
            case 31 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:190: T__95
                {
                mT__95(); 

                }
                break;
            case 32 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:196: T__96
                {
                mT__96(); 

                }
                break;
            case 33 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:202: T__97
                {
                mT__97(); 

                }
                break;
            case 34 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:208: T__98
                {
                mT__98(); 

                }
                break;
            case 35 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:214: T__99
                {
                mT__99(); 

                }
                break;
            case 36 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:220: T__100
                {
                mT__100(); 

                }
                break;
            case 37 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:227: T__101
                {
                mT__101(); 

                }
                break;
            case 38 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:234: T__102
                {
                mT__102(); 

                }
                break;
            case 39 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:241: T__103
                {
                mT__103(); 

                }
                break;
            case 40 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:248: T__104
                {
                mT__104(); 

                }
                break;
            case 41 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:255: T__105
                {
                mT__105(); 

                }
                break;
            case 42 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:262: T__106
                {
                mT__106(); 

                }
                break;
            case 43 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:269: T__107
                {
                mT__107(); 

                }
                break;
            case 44 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:276: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 45 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:284: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 46 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:292: RULE_NL
                {
                mRULE_NL(); 

                }
                break;
            case 47 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:300: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 48 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:316: RULE_MACROVALUE
                {
                mRULE_MACROVALUE(); 

                }
                break;
            case 49 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:332: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 50 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:344: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 51 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:353: RULE_LPAREN
                {
                mRULE_LPAREN(); 

                }
                break;
            case 52 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:365: RULE_RPAREN
                {
                mRULE_RPAREN(); 

                }
                break;
            case 53 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:377: RULE_LBRACE
                {
                mRULE_LBRACE(); 

                }
                break;
            case 54 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:389: RULE_RBRACE
                {
                mRULE_RBRACE(); 

                }
                break;
            case 55 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:401: RULE_LBRACKET
                {
                mRULE_LBRACKET(); 

                }
                break;
            case 56 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:415: RULE_RBRACKET
                {
                mRULE_RBRACKET(); 

                }
                break;
            case 57 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:429: RULE_OANGLE
                {
                mRULE_OANGLE(); 

                }
                break;
            case 58 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:441: RULE_CANGLE
                {
                mRULE_CANGLE(); 

                }
                break;
            case 59 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:453: RULE_MDEF
                {
                mRULE_MDEF(); 

                }
                break;
            case 60 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:463: RULE_BAR
                {
                mRULE_BAR(); 

                }
                break;
            case 61 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:472: RULE_DOT
                {
                mRULE_DOT(); 

                }
                break;
            case 62 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:481: RULE_COERCE
                {
                mRULE_COERCE(); 

                }
                break;
            case 63 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:493: RULE_COLON
                {
                mRULE_COLON(); 

                }
                break;
            case 64 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:504: RULE_AT
                {
                mRULE_AT(); 

                }
                break;
            case 65 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:512: RULE_COMMA
                {
                mRULE_COMMA(); 

                }
                break;
            case 66 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:523: RULE_SEMICOLON
                {
                mRULE_SEMICOLON(); 

                }
                break;
            case 67 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:538: RULE_POWER
                {
                mRULE_POWER(); 

                }
                break;
            case 68 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:549: RULE_TIMES
                {
                mRULE_TIMES(); 

                }
                break;
            case 69 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:560: RULE_PLUS
                {
                mRULE_PLUS(); 

                }
                break;
            case 70 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:570: RULE_MINUS
                {
                mRULE_MINUS(); 

                }
                break;
            case 71 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:581: RULE_LT
                {
                mRULE_LT(); 

                }
                break;
            case 72 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:589: RULE_GT
                {
                mRULE_GT(); 

                }
                break;
            case 73 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:597: RULE_LE
                {
                mRULE_LE(); 

                }
                break;
            case 74 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:605: RULE_GE
                {
                mRULE_GE(); 

                }
                break;
            case 75 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:613: RULE_EQUAL
                {
                mRULE_EQUAL(); 

                }
                break;
            case 76 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:624: RULE_NOTEQUAL
                {
                mRULE_NOTEQUAL(); 

                }
                break;
            case 77 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:638: RULE_TILDE
                {
                mRULE_TILDE(); 

                }
                break;
            case 78 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:649: RULE_CARAT
                {
                mRULE_CARAT(); 

                }
                break;
            case 79 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:660: RULE_SEG
                {
                mRULE_SEG(); 

                }
                break;
            case 80 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:669: RULE_HASH
                {
                mRULE_HASH(); 

                }
                break;
            case 81 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:679: RULE_AMPERSAND
                {
                mRULE_AMPERSAND(); 

                }
                break;
            case 82 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:694: RULE_DOLAR
                {
                mRULE_DOLAR(); 

                }
                break;
            case 83 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:705: RULE_SLASH
                {
                mRULE_SLASH(); 

                }
                break;
            case 84 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:716: RULE_BACKSLASH
                {
                mRULE_BACKSLASH(); 

                }
                break;
            case 85 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:731: RULE_SLASHSLASH
                {
                mRULE_SLASHSLASH(); 

                }
                break;
            case 86 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:747: RULE_BACKSLASHBACKSLASH
                {
                mRULE_BACKSLASHBACKSLASH(); 

                }
                break;
            case 87 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:771: RULE_SLASHBACKSLASH
                {
                mRULE_SLASHBACKSLASH(); 

                }
                break;
            case 88 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:791: RULE_BACKSLASHSLASH
                {
                mRULE_BACKSLASHSLASH(); 

                }
                break;
            case 89 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:811: RULE_TIMESDOLAR
                {
                mRULE_TIMESDOLAR(); 

                }
                break;
            case 90 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:827: RULE_DIVDOLAR
                {
                mRULE_DIVDOLAR(); 

                }
                break;
            case 91 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:841: RULE_PLUSDOLAR
                {
                mRULE_PLUSDOLAR(); 

                }
                break;
            case 92 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:856: RULE_MINUSDOLAR
                {
                mRULE_MINUSDOLAR(); 

                }
                break;
            case 93 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:872: RULE_EQUALSDOLAR
                {
                mRULE_EQUALSDOLAR(); 

                }
                break;
            case 94 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:889: RULE_EXIT
                {
                mRULE_EXIT(); 

                }
                break;
            case 95 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:899: RULE_BECOMES
                {
                mRULE_BECOMES(); 

                }
                break;
            case 96 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:912: RULE_DEF
                {
                mRULE_DEF(); 

                }
                break;
            case 97 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:921: RULE_ARROW
                {
                mRULE_ARROW(); 

                }
                break;
            case 98 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:932: RULE_LARROW
                {
                mRULE_LARROW(); 

                }
                break;
            case 99 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:944: RULE_GIVES
                {
                mRULE_GIVES(); 

                }
                break;
            case 100 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:955: RULE_PERCENT
                {
                mRULE_PERCENT(); 

                }
                break;
            case 101 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:968: RULE_PRIMEPERCENT
                {
                mRULE_PRIMEPERCENT(); 

                }
                break;
            case 102 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:986: RULE_ELLIPSIS
                {
                mRULE_ELLIPSIS(); 

                }
                break;
            case 103 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:1000: RULE_SUMLIST
                {
                mRULE_SUMLIST(); 

                }
                break;
            case 104 :
                // ../com.euclideanspace.aldor/src-gen/com/euclideanspace/spad/parser/antlr/internal/InternalEditor.g:1:1013: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\1\uffff\1\73\24\75\1\136\2\75\1\142\2\uffff\1\71\2\uffff\1\150"+
        "\1\154\1\160\1\71\6\uffff\1\173\1\176\1\uffff\1\u0081\1\u0084\3"+
        "\uffff\1\u008a\1\u008c\3\uffff\1\u0093\1\u0096\4\uffff\1\75\1\uffff"+
        "\3\75\1\u009e\4\75\1\u00a4\1\75\1\u00a6\1\75\1\u00a9\15\75\1\u00b7"+
        "\2\75\1\u00bc\1\75\2\uffff\2\75\14\uffff\1\u00c2\22\uffff\1\u00c4"+
        "\27\uffff\6\75\1\uffff\3\75\1\u00ce\1\u00cf\1\uffff\1\75\1\uffff"+
        "\2\75\1\uffff\5\75\1\u00d8\5\75\1\u00de\1\75\1\uffff\3\75\1\u00e3"+
        "\1\uffff\1\u00e4\1\u00e5\1\u00e6\5\uffff\1\75\1\u00e8\6\75\1\u00ef"+
        "\2\uffff\2\75\1\u00f2\1\u00f3\1\u00f4\1\u00f5\2\75\1\uffff\1\u00f8"+
        "\2\75\1\u00fb\1\u00fc\1\uffff\4\75\4\uffff\1\75\1\uffff\4\75\1\u0106"+
        "\1\u0107\1\uffff\2\75\4\uffff\1\u010a\1\u010b\1\uffff\1\75\1\u010d"+
        "\2\uffff\1\u010e\1\u010f\6\75\1\u0116\2\uffff\1\u0117\1\75\2\uffff"+
        "\1\u0119\3\uffff\1\u011a\1\u011b\2\75\1\u011e\1\u011f\2\uffff\1"+
        "\u0120\3\uffff\1\u0121\1\u0122\5\uffff";
    static final String DFA11_eofS =
        "\u0123\uffff";
    static final String DFA11_minS =
        "\1\0\4\141\1\157\1\150\1\144\1\146\1\150\1\154\1\157\1\171\1\145"+
        "\1\156\1\157\1\151\1\141\1\162\1\145\1\162\1\141\1\75\1\165\1\157"+
        "\1\45\2\uffff\1\0\2\uffff\3\44\1\0\6\uffff\1\55\1\75\1\uffff\1\56"+
        "\1\72\3\uffff\1\44\1\75\3\uffff\1\44\1\57\4\uffff\1\163\1\uffff"+
        "\1\164\1\143\1\145\1\41\1\145\1\164\2\144\1\41\1\160\1\41\1\145"+
        "\1\41\1\145\1\165\1\163\1\162\1\161\1\164\1\160\1\143\2\151\1\163"+
        "\1\162\1\154\1\41\1\145\1\155\1\41\1\163\2\uffff\1\157\1\144\14"+
        "\uffff\1\75\22\uffff\1\56\27\uffff\3\145\1\153\1\164\1\141\1\uffff"+
        "\1\162\1\154\1\150\2\41\1\uffff\1\157\1\uffff\1\162\1\164\1\uffff"+
        "\1\156\2\145\1\157\1\165\1\41\1\145\2\157\1\156\1\160\1\41\1\163"+
        "\1\uffff\1\141\1\145\1\165\1\41\1\uffff\3\41\5\uffff\1\147\1\41"+
        "\1\147\1\141\1\145\1\151\2\145\1\41\2\uffff\1\162\1\141\4\41\1\162"+
        "\1\157\1\uffff\1\41\1\162\1\156\2\41\1\uffff\1\145\1\153\1\141\1"+
        "\162\4\uffff\1\157\1\uffff\1\157\1\147\2\156\2\41\1\uffff\2\164"+
        "\4\uffff\2\41\1\uffff\1\144\1\41\2\uffff\2\41\1\164\1\156\2\162"+
        "\1\145\1\144\1\41\2\uffff\1\41\1\145\2\uffff\1\41\3\uffff\2\41\2"+
        "\171\2\41\2\uffff\1\41\3\uffff\2\41\5\uffff";
    static final String DFA11_maxS =
        "\1\uffff\3\141\1\162\1\157\1\151\1\156\1\164\1\162\1\170\1\157\1"+
        "\171\1\145\1\156\1\157\1\151\1\157\1\171\1\145\1\162\1\141\1\75"+
        "\1\165\1\157\1\45\2\uffff\1\uffff\2\uffff\1\76\1\57\1\76\1\uffff"+
        "\6\uffff\1\75\1\76\1\uffff\1\56\1\75\3\uffff\1\52\1\75\3\uffff\2"+
        "\134\4\uffff\1\164\1\uffff\1\164\1\143\1\145\1\172\1\151\1\164\2"+
        "\144\1\172\1\160\1\172\1\145\1\172\1\145\1\165\1\163\1\162\1\161"+
        "\1\164\1\160\1\143\2\151\1\163\1\162\1\154\1\172\1\145\1\164\1\172"+
        "\1\163\2\uffff\1\157\1\144\14\uffff\1\76\22\uffff\1\56\27\uffff"+
        "\3\145\1\153\1\164\1\141\1\uffff\1\162\1\154\1\150\2\172\1\uffff"+
        "\1\157\1\uffff\1\162\1\164\1\uffff\1\156\2\145\1\157\1\165\1\172"+
        "\1\145\2\157\1\156\1\160\1\172\1\163\1\uffff\1\141\1\145\1\165\1"+
        "\172\1\uffff\3\172\5\uffff\1\147\1\172\1\147\1\141\1\145\1\151\2"+
        "\145\1\172\2\uffff\1\162\1\141\4\172\1\162\1\157\1\uffff\1\172\1"+
        "\162\1\156\2\172\1\uffff\1\145\1\153\1\141\1\162\4\uffff\1\157\1"+
        "\uffff\1\157\1\147\2\156\2\172\1\uffff\2\164\4\uffff\2\172\1\uffff"+
        "\1\144\1\172\2\uffff\2\172\1\164\1\156\2\162\1\145\1\144\1\172\2"+
        "\uffff\1\172\1\145\2\uffff\1\172\3\uffff\2\172\2\171\2\172\2\uffff"+
        "\1\172\3\uffff\2\172\5\uffff";
    static final String DFA11_acceptS =
        "\32\uffff\2\54\1\uffff\1\55\1\56\4\uffff\1\62\1\63\1\65\1\66\1\67"+
        "\1\70\2\uffff\1\74\2\uffff\1\100\1\101\1\102\2\uffff\1\120\1\121"+
        "\1\122\2\uffff\1\144\1\150\1\1\1\64\1\uffff\1\54\37\uffff\1\41\1"+
        "\116\2\uffff\1\145\1\51\1\55\1\56\1\57\1\134\1\141\1\106\1\133\1"+
        "\143\1\147\1\105\1\uffff\1\135\1\136\1\113\1\61\1\62\1\63\1\65\1"+
        "\66\1\67\1\70\1\71\1\111\1\142\1\107\1\72\1\112\1\110\1\74\1\uffff"+
        "\1\75\1\76\1\137\1\77\1\100\1\101\1\102\1\103\1\131\1\104\1\114"+
        "\1\115\1\120\1\121\1\122\1\125\1\127\1\132\1\123\1\126\1\130\1\124"+
        "\1\144\6\uffff\1\31\5\uffff\1\11\1\uffff\1\25\2\uffff\1\42\15\uffff"+
        "\1\26\4\uffff\1\35\3\uffff\1\60\1\73\1\140\1\146\1\117\11\uffff"+
        "\1\10\1\36\10\uffff\1\15\5\uffff\1\24\4\uffff\1\47\1\37\1\45\1\46"+
        "\1\uffff\1\40\6\uffff\1\7\2\uffff\1\43\1\12\1\52\1\13\2\uffff\1"+
        "\17\2\uffff\1\22\1\23\11\uffff\1\6\1\27\2\uffff\1\14\1\44\1\uffff"+
        "\1\21\1\53\1\33\6\uffff\1\5\1\16\1\uffff\1\20\1\30\1\34\2\uffff"+
        "\1\4\1\50\1\32\1\2\1\3";
    static final String DFA11_specialS =
        "\1\0\33\uffff\1\2\5\uffff\1\1\u0100\uffff}>";
    static final String[] DFA11_transitionS = {
            "\11\71\1\35\1\36\2\71\1\36\22\71\1\35\1\71\1\42\1\63\1\65\1"+
            "\70\1\64\1\31\1\44\1\1\1\61\1\40\1\57\1\37\1\54\1\66\12\43\1"+
            "\55\1\60\1\51\1\41\1\52\1\71\1\56\2\33\1\3\6\33\1\17\1\33\1"+
            "\20\5\33\1\15\1\33\1\14\1\16\5\33\1\47\1\67\1\50\1\26\1\34\1"+
            "\71\1\7\1\22\1\2\1\5\1\12\1\21\1\32\1\25\1\10\3\32\1\30\1\13"+
            "\1\24\1\4\1\27\1\23\1\32\1\11\2\32\1\6\3\32\1\45\1\53\1\46\1"+
            "\62\uff81\71",
            "\1\72",
            "\1\74",
            "\1\76",
            "\1\77\20\uffff\1\100",
            "\1\101",
            "\1\102\1\103",
            "\1\104\11\uffff\1\105",
            "\1\106\6\uffff\1\107\1\110\4\uffff\1\112\1\111",
            "\1\113\11\uffff\1\114",
            "\1\115\5\uffff\1\116\5\uffff\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\127\15\uffff\1\126",
            "\1\131\6\uffff\1\130",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\137",
            "\1\140",
            "\1\141",
            "",
            "",
            "\0\75",
            "",
            "",
            "\1\146\10\uffff\1\145\20\uffff\1\147",
            "\1\151\6\uffff\1\145\1\uffff\1\152\1\uffff\1\153",
            "\1\156\30\uffff\1\155\1\157",
            "\0\161",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\172\16\uffff\1\170\1\171",
            "\1\175\1\174",
            "",
            "\1\u0080",
            "\1\u0082\2\uffff\1\u0083",
            "",
            "",
            "",
            "\1\u0089\5\uffff\1\u0088",
            "\1\u008b",
            "",
            "",
            "",
            "\1\u0092\12\uffff\1\u0090\54\uffff\1\u0091",
            "\1\u0095\54\uffff\1\u0094",
            "",
            "",
            "",
            "",
            "\1\u0099\1\u0098",
            "",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\75\16\uffff\12\75\5\uffff\1\75\1\uffff\32\75\4\uffff\1\75"+
            "\1\uffff\14\75\1\u009d\15\75",
            "\1\u009f\3\uffff\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\75\16\uffff\12\75\5\uffff\1\75\1\uffff\32\75\4\uffff\1\75"+
            "\1\uffff\32\75",
            "\1\u00a5",
            "\1\75\16\uffff\12\75\5\uffff\1\75\1\uffff\32\75\4\uffff\1\75"+
            "\1\uffff\32\75",
            "\1\u00a7",
            "\1\75\16\uffff\12\75\5\uffff\1\75\1\uffff\32\75\4\uffff\1\75"+
            "\1\uffff\15\75\1\u00a8\14\75",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\75\16\uffff\12\75\5\uffff\1\75\1\uffff\32\75\4\uffff\1\75"+
            "\1\uffff\32\75",
            "\1\u00b8",
            "\1\u00bb\2\uffff\1\u00b9\3\uffff\1\u00ba",
            "\1\75\16\uffff\12\75\5\uffff\1\75\1\uffff\32\75\4\uffff\1\75"+
            "\1\uffff\32\75",
            "\1\u00bd",
            "",
            "",
            "\1\u00be",
            "\1\u00bf",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00c0\1\u00c1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00c3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\75\16\uffff\12\75\5\uffff\1\75\1\uffff\32\75\4\uffff\1\75"+
            "\1\uffff\32\75",
            "\1\75\16\uffff\12\75\5\uffff\1\75\1\uffff\32\75\4\uffff\1\75"+
            "\1\uffff\32\75",
            "",
            "\1\u00d0",
            "",
            "\1\u00d1",
            "\1\u00d2",
            "",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\75\16\uffff\12\75\5\uffff\1\75\1\uffff\32\75\4\uffff\1\75"+
            "\1\uffff\32\75",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\75\16\uffff\12\75\5\uffff\1\75\1\uffff\32\75\4\uffff\1\75"+
            "\1\uffff\32\75",
            "\1\u00df",
            "",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\75\16\uffff\12\75\5\uffff\1\75\1\uffff\32\75\4\uffff\1\75"+
            "\1\uffff\32\75",
            "",
            "\1\75\16\uffff\12\75\5\uffff\1\75\1\uffff\32\75\4\uffff\1\75"+
            "\1\uffff\32\75",
            "\1\75\16\uffff\12\75\5\uffff\1\75\1\uffff\32\75\4\uffff\1\75"+
            "\1\uffff\32\75",
            "\1\75\16\uffff\12\75\5\uffff\1\75\1\uffff\32\75\4\uffff\1\75"+
            "\1\uffff\32\75",
            "",
            "",
            "",
            "",
            "",
            "\1\u00e7",
            "\1\75\16\uffff\12\75\5\uffff\1\75\1\uffff\32\75\4\uffff\1\75"+
            "\1\uffff\32\75",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\75\16\uffff\12\75\5\uffff\1\75\1\uffff\32\75\4\uffff\1\75"+
            "\1\uffff\32\75",
            "",
            "",
            "\1\u00f0",
            "\1\u00f1",
            "\1\75\16\uffff\12\75\5\uffff\1\75\1\uffff\32\75\4\uffff\1\75"+
            "\1\uffff\32\75",
            "\1\75\16\uffff\12\75\5\uffff\1\75\1\uffff\32\75\4\uffff\1\75"+
            "\1\uffff\32\75",
            "\1\75\16\uffff\12\75\5\uffff\1\75\1\uffff\32\75\4\uffff\1\75"+
            "\1\uffff\32\75",
            "\1\75\16\uffff\12\75\5\uffff\1\75\1\uffff\32\75\4\uffff\1\75"+
            "\1\uffff\32\75",
            "\1\u00f6",
            "\1\u00f7",
            "",
            "\1\75\16\uffff\12\75\5\uffff\1\75\1\uffff\32\75\4\uffff\1\75"+
            "\1\uffff\32\75",
            "\1\u00f9",
            "\1\u00fa",
            "\1\75\16\uffff\12\75\5\uffff\1\75\1\uffff\32\75\4\uffff\1\75"+
            "\1\uffff\32\75",
            "\1\75\16\uffff\12\75\5\uffff\1\75\1\uffff\32\75\4\uffff\1\75"+
            "\1\uffff\32\75",
            "",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "",
            "",
            "",
            "",
            "\1\u0101",
            "",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\75\16\uffff\12\75\5\uffff\1\75\1\uffff\32\75\4\uffff\1\75"+
            "\1\uffff\32\75",
            "\1\75\16\uffff\12\75\5\uffff\1\75\1\uffff\32\75\4\uffff\1\75"+
            "\1\uffff\32\75",
            "",
            "\1\u0108",
            "\1\u0109",
            "",
            "",
            "",
            "",
            "\1\75\16\uffff\12\75\5\uffff\1\75\1\uffff\32\75\4\uffff\1\75"+
            "\1\uffff\32\75",
            "\1\75\16\uffff\12\75\5\uffff\1\75\1\uffff\32\75\4\uffff\1\75"+
            "\1\uffff\32\75",
            "",
            "\1\u010c",
            "\1\75\16\uffff\12\75\5\uffff\1\75\1\uffff\32\75\4\uffff\1\75"+
            "\1\uffff\32\75",
            "",
            "",
            "\1\75\16\uffff\12\75\5\uffff\1\75\1\uffff\32\75\4\uffff\1\75"+
            "\1\uffff\32\75",
            "\1\75\16\uffff\12\75\5\uffff\1\75\1\uffff\32\75\4\uffff\1\75"+
            "\1\uffff\32\75",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\75\16\uffff\12\75\5\uffff\1\75\1\uffff\32\75\4\uffff\1\75"+
            "\1\uffff\32\75",
            "",
            "",
            "\1\75\16\uffff\12\75\5\uffff\1\75\1\uffff\32\75\4\uffff\1\75"+
            "\1\uffff\32\75",
            "\1\u0118",
            "",
            "",
            "\1\75\16\uffff\12\75\5\uffff\1\75\1\uffff\32\75\4\uffff\1\75"+
            "\1\uffff\32\75",
            "",
            "",
            "",
            "\1\75\16\uffff\12\75\5\uffff\1\75\1\uffff\32\75\4\uffff\1\75"+
            "\1\uffff\32\75",
            "\1\75\16\uffff\12\75\5\uffff\1\75\1\uffff\32\75\4\uffff\1\75"+
            "\1\uffff\32\75",
            "\1\u011c",
            "\1\u011d",
            "\1\75\16\uffff\12\75\5\uffff\1\75\1\uffff\32\75\4\uffff\1\75"+
            "\1\uffff\32\75",
            "\1\75\16\uffff\12\75\5\uffff\1\75\1\uffff\32\75\4\uffff\1\75"+
            "\1\uffff\32\75",
            "",
            "",
            "\1\75\16\uffff\12\75\5\uffff\1\75\1\uffff\32\75\4\uffff\1\75"+
            "\1\uffff\32\75",
            "",
            "",
            "",
            "\1\75\16\uffff\12\75\5\uffff\1\75\1\uffff\32\75\4\uffff\1\75"+
            "\1\uffff\32\75",
            "\1\75\16\uffff\12\75\5\uffff\1\75\1\uffff\32\75\4\uffff\1\75"+
            "\1\uffff\32\75",
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
            return "1:1: Tokens : ( T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | RULE_ID | RULE_WS | RULE_NL | RULE_SL_COMMENT | RULE_MACROVALUE | RULE_STRING | RULE_INT | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_RBRACE | RULE_LBRACKET | RULE_RBRACKET | RULE_OANGLE | RULE_CANGLE | RULE_MDEF | RULE_BAR | RULE_DOT | RULE_COERCE | RULE_COLON | RULE_AT | RULE_COMMA | RULE_SEMICOLON | RULE_POWER | RULE_TIMES | RULE_PLUS | RULE_MINUS | RULE_LT | RULE_GT | RULE_LE | RULE_GE | RULE_EQUAL | RULE_NOTEQUAL | RULE_TILDE | RULE_CARAT | RULE_SEG | RULE_HASH | RULE_AMPERSAND | RULE_DOLAR | RULE_SLASH | RULE_BACKSLASH | RULE_SLASHSLASH | RULE_BACKSLASHBACKSLASH | RULE_SLASHBACKSLASH | RULE_BACKSLASHSLASH | RULE_TIMESDOLAR | RULE_DIVDOLAR | RULE_PLUSDOLAR | RULE_MINUSDOLAR | RULE_EQUALSDOLAR | RULE_EXIT | RULE_BECOMES | RULE_DEF | RULE_ARROW | RULE_LARROW | RULE_GIVES | RULE_PERCENT | RULE_PRIMEPERCENT | RULE_ELLIPSIS | RULE_SUMLIST | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_0 = input.LA(1);

                        s = -1;
                        if ( (LA11_0==')') ) {s = 1;}

                        else if ( (LA11_0=='c') ) {s = 2;}

                        else if ( (LA11_0=='C') ) {s = 3;}

                        else if ( (LA11_0=='p') ) {s = 4;}

                        else if ( (LA11_0=='d') ) {s = 5;}

                        else if ( (LA11_0=='w') ) {s = 6;}

                        else if ( (LA11_0=='a') ) {s = 7;}

                        else if ( (LA11_0=='i') ) {s = 8;}

                        else if ( (LA11_0=='t') ) {s = 9;}

                        else if ( (LA11_0=='e') ) {s = 10;}

                        else if ( (LA11_0=='n') ) {s = 11;}

                        else if ( (LA11_0=='T') ) {s = 12;}

                        else if ( (LA11_0=='R') ) {s = 13;}

                        else if ( (LA11_0=='U') ) {s = 14;}

                        else if ( (LA11_0=='J') ) {s = 15;}

                        else if ( (LA11_0=='L') ) {s = 16;}

                        else if ( (LA11_0=='f') ) {s = 17;}

                        else if ( (LA11_0=='b') ) {s = 18;}

                        else if ( (LA11_0=='r') ) {s = 19;}

                        else if ( (LA11_0=='o') ) {s = 20;}

                        else if ( (LA11_0=='h') ) {s = 21;}

                        else if ( (LA11_0=='^') ) {s = 22;}

                        else if ( (LA11_0=='q') ) {s = 23;}

                        else if ( (LA11_0=='m') ) {s = 24;}

                        else if ( (LA11_0=='\'') ) {s = 25;}

                        else if ( (LA11_0=='g'||(LA11_0>='j' && LA11_0<='l')||LA11_0=='s'||(LA11_0>='u' && LA11_0<='v')||(LA11_0>='x' && LA11_0<='z')) ) {s = 26;}

                        else if ( ((LA11_0>='A' && LA11_0<='B')||(LA11_0>='D' && LA11_0<='I')||LA11_0=='K'||(LA11_0>='M' && LA11_0<='Q')||LA11_0=='S'||(LA11_0>='V' && LA11_0<='Z')) ) {s = 27;}

                        else if ( (LA11_0=='_') ) {s = 28;}

                        else if ( (LA11_0=='\t'||LA11_0==' ') ) {s = 29;}

                        else if ( (LA11_0=='\n'||LA11_0=='\r') ) {s = 30;}

                        else if ( (LA11_0=='-') ) {s = 31;}

                        else if ( (LA11_0=='+') ) {s = 32;}

                        else if ( (LA11_0=='=') ) {s = 33;}

                        else if ( (LA11_0=='\"') ) {s = 34;}

                        else if ( ((LA11_0>='0' && LA11_0<='9')) ) {s = 35;}

                        else if ( (LA11_0=='(') ) {s = 36;}

                        else if ( (LA11_0=='{') ) {s = 37;}

                        else if ( (LA11_0=='}') ) {s = 38;}

                        else if ( (LA11_0=='[') ) {s = 39;}

                        else if ( (LA11_0==']') ) {s = 40;}

                        else if ( (LA11_0=='<') ) {s = 41;}

                        else if ( (LA11_0=='>') ) {s = 42;}

                        else if ( (LA11_0=='|') ) {s = 43;}

                        else if ( (LA11_0=='.') ) {s = 44;}

                        else if ( (LA11_0==':') ) {s = 45;}

                        else if ( (LA11_0=='@') ) {s = 46;}

                        else if ( (LA11_0==',') ) {s = 47;}

                        else if ( (LA11_0==';') ) {s = 48;}

                        else if ( (LA11_0=='*') ) {s = 49;}

                        else if ( (LA11_0=='~') ) {s = 50;}

                        else if ( (LA11_0=='#') ) {s = 51;}

                        else if ( (LA11_0=='&') ) {s = 52;}

                        else if ( (LA11_0=='$') ) {s = 53;}

                        else if ( (LA11_0=='/') ) {s = 54;}

                        else if ( (LA11_0=='\\') ) {s = 55;}

                        else if ( (LA11_0=='%') ) {s = 56;}

                        else if ( ((LA11_0>='\u0000' && LA11_0<='\b')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\u001F')||LA11_0=='!'||LA11_0=='?'||LA11_0=='`'||(LA11_0>='\u007F' && LA11_0<='\uFFFF')) ) {s = 57;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA11_34 = input.LA(1);

                        s = -1;
                        if ( ((LA11_34>='\u0000' && LA11_34<='\uFFFF')) ) {s = 113;}

                        else s = 57;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA11_28 = input.LA(1);

                        s = -1;
                        if ( ((LA11_28>='\u0000' && LA11_28<='\uFFFF')) ) {s = 61;}

                        else s = 57;

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