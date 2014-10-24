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
package com.euclideanspace.aldor;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.TokenSource;
import org.eclipse.xtext.nodemodel.impl.NodeModelBuilder;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parser.ParseException;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.IUnorderedGroupHelper;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

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
/*  @Override
  protected TokenSource createLexer(CharStream stream) {
	CustomLexer lexer = new CustomLexer(stream);
    return lexer;
  }*/
  
  @Override
	protected IParseResult doParse(String ruleName, CharStream in, NodeModelBuilder nodeModelBuilder, int initialLookAhead) {
	  //EditorFileWriter.out("CustomParser.doParse");
	  TokenSource tokenSource = createLexer(in);
		XtextTokenStream tokenStream = createTokenStream(tokenSource);
		tokenStream.initCurrentLookAhead(initialLookAhead);
		setInitialHiddenTokens(tokenStream);
		AbstractInternalAntlrParser parser = createParser(tokenStream);
		parser.setTokenTypeMap(getTokenDefProvider().getTokenDefMap());
		parser.setSyntaxErrorProvider(getSyntaxErrorProvider());
		parser.setNodeModelBuilder(nodeModelBuilder);
		parser.setSemanticModelBuilder(getElementFactory());
		IUnorderedGroupHelper helper = getUnorderedGroupHelper().get();
		parser.setUnorderedGroupHelper(helper);
		helper.initializeWith(parser);
		try {
			if(ruleName != null)
				return parser.parse(ruleName);
			return parser.parse();
		} catch (Exception re) {
			throw new ParseException(re.getMessage(),re);
		}
	}

}