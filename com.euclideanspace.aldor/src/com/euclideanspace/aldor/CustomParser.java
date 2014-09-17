package com.euclideanspace.aldor;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.TokenSource;

public class CustomParser extends com.euclideanspace.aldor.parser.antlr.EditorParser {
  @Override
  protected TokenSource createLexer(CharStream stream) {
	CustomLexer lexer = new CustomLexer(stream);
    return lexer;
  }
}