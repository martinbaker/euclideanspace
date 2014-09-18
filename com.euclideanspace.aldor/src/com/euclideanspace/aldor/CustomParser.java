package com.euclideanspace.aldor;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.TokenSource;

/*
 * This class is not used at present.
 * 
 * When I was searching for a way to customise the lexer I tried the method described
 * in this thread:
 * http://stackoverflow.com/questions/8039357/writing-a-custom-xtext-antlr-lexer-without-a-grammar-file
 * This customises the EditorParser and then changes its createLexer method to call
 * our custom lexer. 
 * However since I am now using a simpler approach, this is no longer used.
 * I have left this here in case I ever need to customise the parser
 * in the future.
 */
public class CustomParser extends com.euclideanspace.aldor.parser.antlr.EditorParser {
  @Override
  protected TokenSource createLexer(CharStream stream) {
	CustomLexer lexer = new CustomLexer(stream);
    return lexer;
  }
}