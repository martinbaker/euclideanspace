package com.euclideanspace.aldor;

/* Copyright 2014 Martin John Baker
*
* This file is part of EuclideanSpace.
*
* EuclideanSpace is free software: you can redistribute it and/or modify
* it under the terms of the GNU Affero General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
*
* EuclideanSpace is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
* GNU Affero General Public License for more details.
*
* You should have received a copy of the GNU Affero General Public License
* along with EuclideanSpace. If not, see <http://www.gnu.org/licenses/>.
*/

import java.util.Deque;
import java.util.Iterator;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.MismatchedTokenException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.Token;

/**
 * For an explanation of how I have implemented the custom lexer see 
 * <a href="http://www.euclideanspace.com/software/development/eclipse/xtext/grammar/lexer/custom/">
 * this page</a>
 * 
 * The reason that we need a custom lexer is to make the grammar work in the same way that
 * the Aldor grammar works. Aldor inserts a phantom semicolon after curly brackets when
 * needed so we need to do this also. 
 * This is where Aldor does it:</a>
 * <a href="https://github.com/pippijn/aldor/blob/master/aldor/aldor/src/linear.c#L1082">
 * 
 * We insert phantom semicolon after curly brackets only if following token is allowed to follow
 * a semicolon. Aldor uses a table of flags to determine which keywords are allowed to follow the
 * semicolon: see 'tokInfoTable'. Here we just test the following string in the character stream,
 * this is not ideal because it makes it harder to skip over comments.
 * 
 */
public class CustomLexer extends com.euclideanspace.aldor.parser.antlr.internal.InternalEditorLexer {


/*
 * This queue allows additional tokens to be triggered when 
 * nextToken() is called.
 */
  Deque<Token> tokens = new java.util.ArrayDeque<Token>();
	
  public CustomLexer() {
    super();
  }
  
  public CustomLexer(CharStream input) {
    super(input);
  }

  public CustomLexer(CharStream input, RecognizerSharedState state) {
    super(input,state);
  }

  @Override
  public void emit(Token token) {
      state.token = token;
      tokens.addLast(token);
//	  EditorFileWriter.out("CustomLexer.emit"+
//	  " tex="+token.getText()+
//      " index="+token.getTokenIndex()+
//	  " pos="+token.getCharPositionInLine()+
//      " line="+token.getLine()+
//      " channel="+token.getChannel());
  } 

  /**
   * overridden to insert phantom semicolon after curly brackets
   * but only if following token is allowed to follow a semicolon.
   * 
   * TODO When checking following token we skip whitespace but we should
   * also skip over comments. That would be easier if we could scan the token
   * stream rather than the character stream (that is: lexer output rather
   * than lexer input).
   */
  @Override
  public Token nextToken() {
    super.nextToken(); // reads a token from input and set state then emits it
    //System.out.println("CustomLexer - nextToken");
    if (tokens.isEmpty()) return Token.EOF_TOKEN;
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

//    	  EditorFileWriter.out("CustomLexer.nextToken"+
//    	  " index="+state.tokenStartCharIndex+
//    	  " pos="+state.tokenStartCharPositionInLine+
//          " pos was="+startCharPositionInLine+
//    	  " line="+state.tokenStartLine+
//          " line was="+tokenStartLine);
      }
	} catch(Exception e) {
      System.out.println("CustomLexer.nextToken error="+e);
	}
    return firstToken;
  }

  /*
   * return true if supplied token cannot follow ; or {}
   * i.e. then else always in etc
   * 
   * TODO this is a hack - we should really be checking the token stream not the character
   * stream. For instance isFollower("and",pos) would return 'false' if it read 'andy' for
   * example.
   */
  public boolean isFollower(String keyw,int pos){
    int i = 0;
    try {
      // put in try/catch in case we go beyond end if input
      while ( i<keyw.length() ) {
        if ( input.LA(pos+i)!=keyw.charAt(i) ) return false;
        i++;
      }
	} catch(Exception e) {
	  System.out.println("CustomLexer.isFollower error="+e);
	}
	return true;
  }

  public String intToStr(int ch){
	  if (ch==0) return "ZERO";
	  if (ch==10) return "NL";
	  char[] chs=Character.toChars(ch);
	  return String.valueOf(chs);
  }

}