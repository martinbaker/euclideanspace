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
      if (tt == RULE_KW_CCURLY) {
    	  pendingToken = new PhantomToken(RULE_KW_SEMICOLON); // PhantomToken extends DefaultToken and
                                                              // represents a token not linked to any
                                                              // text in the text editor.
    	  emit(pendingToken);
      }
      return firstToken;
  }

//  public String getErrorMessage(Token t) {
//    return tokenErrorMap.get(t);
//  }

//  @Override
//  public void emitErrorMessage(String msg) {
    // don't call super, since it would do a plain vanilla
    // System.err.println(msg);
//    if (logger.isTraceEnabled())
//    logger.trace(msg);
//  }
}