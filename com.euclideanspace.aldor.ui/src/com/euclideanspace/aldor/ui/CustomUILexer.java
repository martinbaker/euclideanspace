package com.euclideanspace.aldor.ui;

import java.util.Deque;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.Token;

import com.euclideanspace.aldor.PhantomToken;

//import com.euclideanspace.aldor.parser.antlr.internal.InternalEditorLexer;
/**
*
*/
public class CustomUILexer extends com.euclideanspace.aldor.ui.contentassist.antlr.internal.InternalEditorLexer {
//  private static final Logger logger = Logger.getLogger(CustomLexer.class);

  public CustomUILexer() {
    super();
  }
  
  public CustomUILexer(CharStream input) {
    super(input);
  }

  public CustomUILexer(CharStream input, RecognizerSharedState state) {
    super(input,state);
  }
  
	/*
	 * This queue allows additional tokens to be triggered when 
	 * nextToken() is called.
	 */
	Deque<Token> tokens = new java.util.ArrayDeque<Token>();

	CommonToken pendingToken = null;

//  private final Map<Token, String> tokenErrorMap = new HashMap<Token, String>();
  @Override
  public void emit(Token token) {
      state.token = token;
      tokens.addLast(token);
  }

  @Override
  public Token nextToken() {
      super.nextToken();
  	  //System.out.println("CustomLexer - nextToken");
      if (tokens.isEmpty())
          return Token.EOF_TOKEN;
      Token firstToken = tokens.removeFirst();
      int tt = firstToken.getType();
      try {
          if (tt == RULE_KW_CCURLY) {
        	  int pos = 1;
        	  // 'input' is input to lexer we want output from lexer (token stream)
        	  int ch=input.LA(pos);
        	  //EditorFileWriter.out("CustomLexer.nextToken LA ***********");
        	  // skip whitespace (we also need to skip comments but thats not yet implemented)
        	  while ((ch!= -1)&&(ch!= CharStream.EOF)&&Character.isWhitespace(ch)) {
            	  //EditorFileWriter.out("CustomLexer.nextToken"+" ch="+ch+" ch="+intToStr(ch)+" index="+input.index());
            	  pos++;
            	  ch=input.LA(pos);
        	  }
        	  if (
        		(ch == -1) ||
        		(ch == CharStream.EOF) ||
        		isFollower("and",pos) ||
        		isFollower("always",pos) ||
        	    isFollower("but",pos) ||
        	    isFollower("catch",pos) ||
        	    isFollower("else",pos) ||
        	    isFollower("finally",pos) ||
        	    isFollower("from",pos) ||
        	    isFollower("in",pos) ||
        	    isFollower("of",pos) ||
        	    isFollower("or",pos) ||
        	    isFollower("pretend",pos) ||
        	    isFollower("then",pos) ||
        	    isFollower("to",pos) ||
        	    isFollower("where",pos) ||
        	    isFollower(",",pos) ||
        	    isFollower("$",pos) ||
        	    isFollower(":=",pos) ||
        	    isFollower(":",pos) ||
        	    isFollower(":*",pos) ||
        	    isFollower("::",pos) ||
        	    isFollower(".",pos) ||
        	    isFollower("..",pos) ||
        	    isFollower("==",pos) ||
        	    isFollower("==>",pos) ||
        	    isFollower("+->",pos) ||
        	    isFollower("+->*",pos)
        	  ) return firstToken;
        	  PhantomToken pendingToken = new PhantomToken(RULE_KW_SEMICOLON); // PhantomToken extends DefaultToken and
              // represents a token not linked to any
              // text in the text editor.
              emit(pendingToken);

//        	  EditorFileWriter.out("CustomLexer.nextToken"+
//        	  " index="+state.tokenStartCharIndex+
//        	  " pos="+state.tokenStartCharPositionInLine+
//              " pos was="+startCharPositionInLine+
//        	  " line="+state.tokenStartLine+
//              " line was="+tokenStartLine);
          }
    	} catch(Exception e) {
          System.out.println("CustomUILexer.nextToken error="+e);
    	}
      return firstToken;
  }

  /*
   * return true if supplied token cannot follow ; or {}
   * i.e. then else always in etc
   */
  public boolean isFollower(String keyw,int pos){
		int i = 0;
		while ( i<keyw.length() ) {
		  if ( input.LA(pos+i)!=keyw.charAt(i) ) return false;
		  i++;
		}
		return true;
  }

}