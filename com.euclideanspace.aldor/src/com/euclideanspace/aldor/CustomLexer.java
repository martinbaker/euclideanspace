package com.euclideanspace.aldor;

import java.util.Deque;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonToken;
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
 * <a href="https://github.com/pippijn/aldor/blob/master/aldor/aldor/src/linear.c#L1082">
 * This is where Aldor does it.</a>
 * 
 * Aldor uses a table of flags for each token type 'tokInfoTable'. I have put a version of this
 * table here. In this java version it has a slightly different function since Xtext generates its
 * own token types automatically. We need a safe way to map the Xtext token types to this table.
 * 
 * TODO use a safer method to link tokInfoTable to Xtext tokens, using the token tags is very
 * dangerous since they can change when parser is modified.
 */
public class CustomLexer extends com.euclideanspace.aldor.parser.antlr.internal.InternalEditorLexer {

	/*
	* [A] TokenTag tag
	* [B] Symbol sym
	* [C] String str
	* [D] Byte hasString i.e. use val.str (vs val.sym)
	* [E] Byte isComment i.e. ++ --
	* [F] Byte isOpener i.e. ( [ { etc
	* [G] Byte isCloser i.e. ) ] } etc
	* [H] Byte isFollower i.e. then else always in etc
	* [I] Byte isLangword i.e. if then etc
	* [J] Byte isLeftAssoc i.e., associates left to right
	* [K] Byte isMaybeInfix i.e., add, with, +
	* [L] Byte precedence i.e., 0 is lowest, or don't know
	* [M] Byte isDisabled i.e., non-zero means disabled
	*
	* [A] [B][C] [D][E] [F] [G] [H] [I] [J] [K] [L] [M]
	*/
	static int[][] tokInfoTable = {
			{RULE_TK_ID, 0, 0, 0, 0, 0, 0, 0, 1, 0, 170, 0}, //TK_Id
			{RULE_WS, 0, 0, 0, 0, 0, 0, 0, 1, 0, 170, 0}, // TK_Blank
			{RULE_TK_INT, 0, 1, 0, 0, 0, 0, 0, 1, 0, 170, 0}, // TK_Int
			{RULE_TK_FLOAT, 0, 1, 0, 0, 0, 0, 0, 1, 0, 170, 0}, // TK_Float
			{RULE_TK_STRING, 0, 1, 0, 0, 0, 0, 0, 1, 0, 170, 0}, // TK_String
			{RULE_TK_PREDOC, 0, 1, 1, 0, 0, 0, 0, 1, 0, 170, 0}, //TK_PreDoc
			{RULE_TK_POSTDOC, 0, 1, 1, 0, 0, 0, 0, 1, 0, 170, 0}, //TK_PostDoc
			{-1, 0, 1, 1, 0, 0, 0, 0, 1, 0, 170, 0}, //TK_Comment
			{-1, 0, 1, 1, 0, 0, 0, 0, 1, 0, 170, 0}, //TK_SysCmd
			{-1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0}, //TK_Error
			{T__109, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0}, // KW_Add
			{T__104, 0, 0, 0, 0, 0, 1, 1, 1, 1, 40, 0}, // KW_And
			{T__100, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0}, // KW_Always
			{T__90, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0}, // KW_Assert
			{T__92, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0}, // KW_Break
			{T__82, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0}, // KW_But
			{T__113, 0, 0, 0, 0, 0, 0, 0, 1, 1, 110, 0}, // KW_By
			{T__112, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0}, // KW_Case
			{T__83, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0}, // KW_Catch
			{T__67, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0}, // KW_Default
			{T__68, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0}, // KW_Define
			{T__87, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0}, // KW_Delay
			{T__86, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0}, // KW_Do
			{T__79, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0}, // KW_Else
			{T__95, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0}, // KW_Except
			{T__72, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0}, // KW_Export
			{T__117, 0, 0, 0, 0, 0, 0, 0, 1, 1, 125, 0}, // KW_Exquo
			{T__63, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0}, // KW_Extend
			{T__101, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0}, // KW_Finally
			{T__69, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0}, // KW_Fix
			{T__102, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0}, // KW_For
			{T__66, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0}, // KW_Fluid
			{T__65, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0}, // KW_Free
			{T__74, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0}, // KW_From
			{T__89, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0}, // KW_Generate
			{T__97, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0}, // KW_Goto
			{T__106, 0, 0, 0, 0, 0, 0, 0, 1, 1, 40, 0}, // KW_Has
			{T__76, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0}, // KW_If
			{T__71, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0}, // KW_Import
			{T__85, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0}, // KW_In
			{T__70, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0}, // KW_Inline
			{T__110, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0}, // KW_Is
			{T__111, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0}, // KW_Isnt
			{T__91, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0}, // KW_Iterate
			{-1, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0}, // KW_Let
			{T__64, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0}, // KW_Local
			{T__62, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0}, // KW_Macro
			{T__114, 0, 0, 0, 0, 0, 0, 0, 1, 1, 125, 0}, // KW_Mod
			{T__98, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0}, // KW_Never
			{T__118, 0, 0, 0, 0, 0, 0, 1, 1, 1, 150, 0}, // KW_Not
			{T__99, 0, 0, 0, 0, 0, 1, 1, 1, 1, 40, 0}, // KW_Of
			{T__105, 0, 0, 0, 0, 0, 1, 1, 1, 1, 40, 0}, // KW_Or
			{T__107, 0, 0, 0, 0, 0, 1, 1, 1, 1, 150, 0}, // KW_Pretend
			{T__115, 0, 0, 0, 0, 0, 0, 0, 1, 1, 125, 0}, // KW_Quo
			{T__88, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0}, // KW_Reference
			{T__116, 0, 0, 0, 0, 0, 0, 0, 1, 1, 125, 0}, // KW_Rem
			{T__80, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0}, // KW_Repeat
			{T__93, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0}, // KW_Return
			{-1, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0}, // KW_Rule
			{T__84, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0}, // KW_Select
			{T__77, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0}, // KW_Then
			{T__96, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0}, // KW_Throw
			{T__73, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0}, // KW_To
			{T__81, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0}, // KW_Try
			{T__75, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0}, // KW_Where
			{T__103, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0}, // KW_While
			{T__108, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0}, // KW_With
			{T__94, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0}, // KW_Yield
			{RULE_KW_QUOTE, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0}, // KW_Quote
			{-1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0}, // KW_Grave
			{RULE_KW_AMPERSAND, 0, 0, 0, 0, 0, 0, 0, 1, 0, 160, 0}, // KW_Ampersand
			{RULE_KW_COMMA, 0, 0, 0, 0, 0, 1, 0, 1, 1, 11, 0}, // KW_Comma
			{RULE_KW_SEMICOLON, 0, 0, 0, 0, 0, 0, 0, 1, 0, 10, 0}, // KW_Semicolon
			{RULE_KW_DOLLAR, 0, 0, 0, 0, 0, 1, 0, 0, 1, 70, 0}, // KW_Dollar
			{RULE_KW_SHARP, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0}, // KW_Sharp
			{RULE_KW_AT, 0, 0, 0, 0, 0, 0, 0, 1, 1, 150, 0}, // KW_At
			{RULE_KW_ASSIGN, 0, 0, 0, 0, 0, 1, 0, 0, 1, 20, 0}, // KW_Assign
			{RULE_KW_COLON, 0, 0, 0, 0, 0, 1, 0, 1, 1, 36, 0}, // KW_Colon
			{RULE_KW_COLONSTAR, 0, 0, 0, 0, 0, 1, 0, 1, 1, 36, 0}, // KW_ColonStar
			{RULE_KW_2COLON, 0, 0, 0, 0, 0, 1, 0, 1, 1, 150, 0}, // KW_2Colon
			{RULE_KW_STAR, 0, 0, 0, 0, 0, 0, 0, 1, 1, 130, 0}, // KW_Star
			{RULE_KW_2STAR, 0, 0, 0, 0, 0, 0, 0, 1, 1, 140, 0}, // KW_2Star
			{RULE_KW_DOT, 0, 0, 0, 0, 0, 1, 0, 1, 1, 170, 0}, // KW_Dot
			{RULE_KW_2DOT, 0, 0, 0, 0, 0, 0, 0, 1, 1, 110, 0}, // KW_2Dot
			{RULE_KW_EQ, 0, 0, 0, 0, 0, 0, 0, 1, 1, 100, 0}, // KW_EQ
			{RULE_KW_2EQ, 0, 0, 0, 0, 0, 1, 0, 0, 1, 25, 0}, // KW_2EQ
			{RULE_KW_MARROW, 0, 0, 0, 0, 0, 1, 0, 0, 1, 25, 0}, // KW_MArrow
			{T__78, 0, 0, 0, 0, 0, 0, 0, 1, 1, 35, 0}, // KW_Implies
			{RULE_KW_GT, 0, 0, 0, 0, 0, 0, 0, 1, 1, 100, 0}, // KW_GT
			{RULE_KW_2GT, 0, 0, 0, 0, 0, 0, 0, 1, 1, 100, 0}, // KW_2GT
			{RULE_KW_GE, 0, 0, 0, 0, 0, 0, 0, 1, 1, 100, 0}, // KW_GE
			{RULE_KW_LT, 0, 0, 0, 0, 0, 0, 0, 1, 1, 100, 0}, // KW_LT
			{RULE_KW_2LT, 0, 0, 0, 0, 0, 0, 0, 1, 1, 100, 0}, // KW_2LT
			{RULE_KW_LE, 0, 0, 0, 0, 0, 0, 0, 1, 1, 100, 0}, // KW_LE
			{RULE_KW_LARROW, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0}, // KW_LArrow
			{RULE_KW_HAT, 0, 0, 0, 0, 0, 0, 0, 1, 1, 140, 0}, // KW_Hat
			{RULE_KW_HATE, 0, 0, 0, 0, 0, 0, 0, 1, 1, 90, 0}, // KW_HatE
			{RULE_KW_TILDE, 0, 0, 0, 0, 0, 0, 0, 0, 1, 150, 0}, // KW_Tilde
			{RULE_KW_TILDEE, 0, 0, 0, 0, 0, 0, 0, 1, 1, 90, 0}, // KW_TildeE
			{RULE_KW_PLUS, 0, 0, 0, 0, 0, 0, 0, 1, 1, 120, 0}, // KW_Plus
			{RULE_KW_PLUSMINUS, 0, 0, 0, 0, 0, 0, 0, 1, 1, 120, 0}, // KW_PlusMinus
			{RULE_KW_MAPSTO, 0, 0, 0, 0, 0, 1, 0, 1, 1, 30, 0}, // KW_MapsTo
			{RULE_KW_MAPSTOSTAR, 0, 0, 0, 0, 0, 1, 0, 1, 1, 30, 0}, // KW_MapsToStar
			{RULE_KW_MINUS, 0, 0, 0, 0, 0, 0, 0, 1, 1, 120, 0}, // KW_Minus
			{RULE_KW_RARROW, 0, 0, 0, 0, 0, 0, 0, 0, 1, 80, 0}, // KW_RArrow,
			{RULE_KW_MAPSTAR, 0, 0, 0, 0, 0, 0, 0, 0, 1, 80, 0}, // KW_MapStar
			{RULE_KW_SLASH, 0, 0, 0, 0, 0, 0, 0, 1, 1, 130, 0}, // KW_Slash
			{RULE_KW_WEDGE, 0, 0, 0, 0, 0, 0, 0, 1, 1, 40, 0}, // KW_Wedge
			{RULE_KW_BACKSLASH, 0, 0, 0, 0, 0, 0, 0, 1, 1, 130, 0}, // KW_Backslash
			{RULE_KW_VEE, 0, 0, 0, 0, 0, 0, 0, 1, 1, 40, 0}, // KW_Vee
			{RULE_KW_OBRACK, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, // KW_OBrack
			{-1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, // KW_OBBrack
			{RULE_KW_OCURLY, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, // KW_OCurly
			{-1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, // KW_OBCurly
			{RULE_KW_OPAREN, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, // KW_OParen
			{-1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, // KW_OBParen
			{RULE_KW_CBRACK, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0}, // KW_CBrack
			{RULE_KW_CCURLY, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0}, // KW_CCurly
			{RULE_KW_CPAREN, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0}, // KW_CParen
			{RULE_KW_BAR, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0}, // KW_Bar
			{-1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0}, // KW_CBBrack
			{-1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0}, // KW_CBCurly
			{-1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0}, // KW_CBParen
			{-1, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0}, // KW_2Bar
			{RULE_KW_NEWLINE, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0}, // KW_NewLine
			{-1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0}, // KW_StartPile
			{-1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0}, // KW_EndPile
			{-1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0}, // KW_SetTab
			{-1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0}, // KW_BackSet
			{-1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0}, // KW_BackTab
			{-1, 0,0, 0, 0, 0, 0, 0, 0, 0, 170, 0}, // KW_Juxtapose
			{-1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0}, // TK_LIMIT
			// additional entries not in original Aldor table
			{T__61, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, // #include
			{RULE_ANY_OTHER, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, // %
			{RULE_KW_IMPLIES, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, // =>
			{RULE_ANY_OTHER, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, // ?
			};

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
  } 

  /*
   * overridden to insert phantom semicolon after curly brackets
   * 
   * (non-Javadoc)
   * @see org.eclipse.xtext.parser.antlr.Lexer#nextToken()
   */
  @Override
  public Token nextToken() {
      super.nextToken();
  	  //System.out.println("CustomLexer - nextToken");
      if (tokens.isEmpty())
          return Token.EOF_TOKEN;
      Token firstToken = tokens.removeFirst();
      int tt = firstToken.getType();
      if (tt == RULE_KW_CCURLY) {
      	  //System.out.println("CustomLexer - nextToken() "+ts +" type="+firstToken.getType());
    	  Token semicolonToken = new CommonToken(input,RULE_KW_SEMICOLON, state.channel, state.tokenStartCharIndex, getCharIndex()-1);
    	  emit(semicolonToken);
      }
      return firstToken;
  }

  /*
   * return true if supplied token is a comment
   * i.e. -- or ++
   */
  public boolean isComment(Token t){
	  for (int[] tokentype:tokInfoTable){
		  if (t.getType()==tokentype[0]) {
			  if (tokentype[3] != 0) return true;
			  return false;
		  }
	  }
	  System.out.println("CustomLexer - isComment can't find token "+t.getType() +":"+t.getText());
	  return false;
  }

  /*
   * return true if supplied token is a type of opening bracket
   * i.e. ( [ { etc
   */
  public boolean isOpener(Token t){
	  for (int[] tokentype:tokInfoTable){
		  if (t.getType()==tokentype[0]) {
			  if (tokentype[4] != 0) return true;
			  return false;
		  }
	  }
	  System.out.println("CustomLexer - isComment can't find token "+t.getType() +":"+t.getText());
	  return false;
  }

  /*
   * return true if supplied token is a type of closing bracket
   * i.e. ) ] } etc
   */
  public boolean isCloser(Token t){
	  for (int[] tokentype:tokInfoTable){
		  if (t.getType()==tokentype[0]) {
			  if (tokentype[5] != 0) return true;
			  return false;
		  }
	  }
	  System.out.println("CustomLexer - isComment can't find token "+t.getType() +":"+t.getText());
	  return false;
  }

  /*
   * return true if supplied token cannot follow ; or {}
   * i.e. then else always in etc
   */
  public boolean isFollower(Token t){
	  for (int[] tokentype:tokInfoTable){
		  if (t.getType()==tokentype[0]) {
			  if (tokentype[6] != 0) return true;
			  return false;
		  }
	  }
	  System.out.println("CustomLexer - isComment can't find token "+t.getType() +":"+t.getText());
	  return false;
  }
  
  /*
   * return true if token is whitespace or a comment
   */
  public boolean isWsOrComment(Token t){
	  if (t.getType()==RULE_WS) return true;
	  if (t.getType()==RULE_KW_NEWLINE) return true;
	  return isComment(t);
  }
}