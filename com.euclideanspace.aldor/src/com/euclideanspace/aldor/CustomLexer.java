package com.euclideanspace.aldor;

import java.util.Deque;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.Token;

/**
*
*/
public class CustomLexer extends com.euclideanspace.aldor.parser.antlr.internal.InternalEditorLexer {

  public CustomLexer() {
    super();
  }
  
  public CustomLexer(CharStream input) {
    super(input);
  }

  public CustomLexer(CharStream input, RecognizerSharedState state) {
    super(input,state);
  }

  Deque<Token> tokens = new java.util.ArrayDeque<Token>();

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
      return tokens.removeFirst();
  }

}