package com.euclideanspace.aldor.ui;

import java.util.Deque;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.Token;

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
//    	  pendingToken = new CommonToken(RULE_KW_SEMICOLON,""); // empty string to avoid overlapping tokens
    	  pendingToken = new CommonToken(RULE_KW_SEMICOLON,null); // null string to avoid overlapping tokens
    	  pendingToken.setChannel(org.antlr.runtime.Token.HIDDEN_CHANNEL); // ignored by parser, not what we want
//     	  pendingToken.setLine(firstToken.getLine());
//    	  pendingToken.setCharPositionInLine(firstToken.getCharPositionInLine()+1);
    	  pendingToken.setStartIndex(state.tokenStartCharIndex-1);
    	  pendingToken.setStopIndex(state.tokenStartCharIndex-1);
    	  pendingToken.setLine(-1);
    	  pendingToken.setCharPositionInLine(-1);
// if I set start or stop index to -1 then editor cannot be created
//    	  pendingToken.setStartIndex(-1);
//    	  pendingToken.setStopIndex(-1);
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