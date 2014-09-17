package com.euclideanspace.aldor.ui;

import org.antlr.runtime.CharStream;
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

//  private final Map<Token, String> tokenErrorMap = new HashMap<Token, String>();
  
  @Override
  public Token nextToken() {
	return super.nextToken();
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