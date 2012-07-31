/* Copyright 2012 Martin John Baker
 * 
 * This file is part of EuclideanSpace.
 *
 *  EuclideanSpace is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Affero General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  EuclideanSpace is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Affero General Public License for more details.
 *
 *  You should have received a copy of the GNU Affero General Public License
 *  along with EuclideanSpace.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.euclideanspace.spad.builder;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;

import org.eclipse.core.resources.IFolder;

import com.euclideanspace.spad.builder.Translate.LineType;
import com.euclideanspace.spad.builder.Translate.Mode;

/**
 * @author Martin John Baker
 *
 */
public class EclipseSPADWriter extends EclipseFileWriter {
	
	/** holds previous indent values */
	Stack<Integer> pile = new Stack<Integer>();
	/** lineHold is store for lines that have been read but not processed
     * including:
     * any comments before )abbrev
     * comments and empty lines and held pending '}'
     */
	LinkedBlockingQueue<String> lineHold = new LinkedBlockingQueue<String>();
	/** lineHoldType has an entry for each entry in lineHold to record
	 * what type the corresponding line is.
     */
	LinkedBlockingQueue<LineType> lineHoldType = new LinkedBlockingQueue<LineType>();
	/**
	 * set to true if last line may be continued (but only if indent increases)
	 * That is, last line ends with '_','where','with','add','==' and so on.
	 */
	boolean lastLineMayContinue = false;
	/**
	 * set to true if last line is not empty,comment, '{' or '}'
	 */
	boolean lastLineIsStatement = false;
	/*
	 * set when '@' is received at the start of a line
	 * this indicates the SPAD structure may be completed or
	 * it may resume after some documentation.
	 */
	boolean suspended = false;
	/** store macros */
	Map<String,String> macros = new HashMap<String,String>();
    /**
     * User selection for statement terminator option:
     * 0=new line, 1=semicolon
     */
	int statementTerminatorOption = 0;
	int macroOption = 0;
	int bracketedOption = 0;
	int escapeOption = 0;

	/**
	 * @param n file name
	 * @param p file directory
	 */
	public EclipseSPADWriter(String n, IFolder p,BuilderNewWizard callback) {
		super(n, p);
	    statementTerminatorOption = callback.getStatementTerminatorOption();
		macroOption = callback.getMacroOption();
		bracketedOption = callback.getBracketedOption();
		escapeOption = callback.getEscapeOption();
	}

	/**
	 * This may resume an existing file or start a new one depending on
	 * whether n is equal to the previous name.
	 * @param n new file name
	 */
	@Override
	public Mode openReopen(String n) {
	  // if name == null this is first SPAD file in pamphlet
	  if (name == null) {
		name = n;
		return Mode.HEAD;
	  }
	  suspended = false;
	  // now check to see if we are resuming a previously started file
	  // after some documentation
	  if (n != null) if (n.equals(name)) {
		return Mode.CODE;
	  }
	  // if we have reached here then we are stating a new file
	  // so we need to flush the old one and then start the new one.
  	  if (!pile.empty()) write("\n");
		while (!pile.empty()) {
		  pile.pop();
		  if (!pile.empty()) writeIndent(pile.peek());
		  write("}" + "\n");
		}
		flushLineHold("@","\n",true);
		//System.out.println("macros: " + macros);
		macros.clear(); // don't use macros in next file
		close();
		lastLineMayContinue = false;
		lastLineIsStatement = false;
		name = n;
		return Mode.HEAD;
	}

    /**
     * Translate a single line of SPAD code
     * 
     * @param line to be written
     * @param input in case line is continued we can get more
     */
	@Override
    Mode writeLineFormatted(String line,BufferedReader input){
  	  try{
		//System.out.println("transCODE 0");
  		if (line == null) return null;
		String nl = "\n";
		if (statementTerminatorOption==1 &&
                lastLineIsStatement) nl = ";"+nl;
    	if (line.startsWith("@")) {
    	  suspended = true;
  		  return Mode.DOCUM;
  		}
    	if (suspended) {
    		suspended = false;
    		System.out.println("EclipseSPADWriter.transCODE line rec'd while suspended " + name +" in "+parent);
    	}
        String prefix = " ";
        /** ind is indent of this line */
        int ind = 0;
        /** indent is current indent setting (previous indent) */
        int indent = 0;
        if (!pile.empty()) indent = pile.peek();
        // calculate current indent
        while (line.startsWith(prefix)) {
          prefix = prefix+" ";
          ind++;
        }

        if (macroOption==0) {
		  line =applyMacroes(line,input); // apply here so macros don't affect indent
        }
        if (bracketedOption==0) {
		  line =bracketedStatements(line); // where statements are grouped together by
                                         // brackets then change to use braces instead.
        }
		if (escapeOption==0) {
		  line =SubstituteStringEscape(line);  // in java the '/' character is considered
	                                     // an escape character so we need to duplicate
		                                 // it when it occurs in a string.
		}
		String trimedLine = line.trim();
    	/**  continuationLine indicates that the line could be
		 * continued (rather than start a new block) but only
		 * if the next line has increased indent.
		 * So we put in line hold, so we can test next line.
		 */
    	boolean continuationLine = impliedContinuation(trimedLine);
    	/** statementLine is set if this is a statement, that is it does
    	 * not end with '{','}','_','where','with','add','==' and so on.
    	 */
    	boolean statementLine = false;
    	// remove the trailing '_'
    	if (trimedLine.endsWith("_")) {
        	line = line.substring(0,line.length()-1);
        	trimedLine = line.trim();
        }
       // if we have just read a comment, or an empty line, or a continuation
        // line (ends with _) then put it into holding stack otherwise process it.
    	LineType lineType = LineType.CODE;
    	if (trimedLine.startsWith("--") ||
    	          trimedLine.startsWith("++")) lineType = LineType.COMMENT;
    	if (trimedLine.equals("") ||
    	          trimedLine.length() == 0) lineType = LineType.EMPTY;
        if (lineType != LineType.CODE) {
            lineHold.offer(line);
            lineHoldType.offer(lineType);
            continuationLine = lastLineMayContinue;
            statementLine = lastLineIsStatement;
    	} else {
    		  /*if (indentForContinuation >= 0){
    			  ind = indentForContinuation;
    			  indentForContinuation = -1;
    		  }*/
    		  // if line contains comment then split into two separate
    		  // strings
    		  int cmtInd = getCommentIndex(line);
    		  if (cmtInd > -1) {
      			  String cmt = line.substring(cmtInd,line.length());
                  line = line.substring(0,cmtInd);
                  lineHold.offer(cmt);
                  lineHoldType.offer(LineType.COMMENT);
    		  }
    		  //System.out.println(line2);
    		  if (ind == indent) { // indent unchanged so no brace
    			  flushLineHold(line,nl,true);
    			  if (continuationLine) statementLine = true;
    		  } else if (ind > indent) { // indent increased so insert '{'
    			  if (continuationLine) statementLine = true;
      			trimedLine = line.trim();
    			//boolean continuationLine = impliedContinuation(trimedLine);
    			if (lastLineMayContinue) {
    			  // continue statement
    		      if (trimedLine.endsWith("_")) {
    		        line = line.substring(0,line.length()-1);
    		        trimedLine = line.trim();
    		      }
    		      write(" "+line.trim());
    			  //flushLineHold(output," "+line.trim());    			  
    			  //flushLineHold(output,"\n>"+line.trim());    			  
    			} else {
    			  // start new block
   			      write(" {"); // put brace before any pending comments
   			      write("\n"+line);
    			  //flushLineHold(output,"\n"+line);
    			  //output.write("push ind=" +ind+" indent="+ indent);
    			  pile.push(ind);
    			}
    		  } else if (ind < indent) { // indent reduced so insert '}'
    			  boolean firstrbrace = true;
    			  while (!pile.empty() && ind < indent) {
                    pile.pop();
                    if (!pile.empty()) indent = pile.peek();
                    else indent = 0;
       			    if (firstrbrace) write(nl); else write("\n");
       			    writeIndent(ind);
       			    write("}");
       			   firstrbrace = false;
       			    //output.write(" ind=" + ind +" pop indent="+ indent);
    			  }
    			  if (firstrbrace) flushLineHold(line,nl,true);
    			  else flushLineHold(line,"\n",true);
    		  }
    	}
        lastLineMayContinue = continuationLine;
        lastLineIsStatement = statementLine;
      } catch (Exception e) {
        System.err.println("error in transCODE: " + line +" due to "+ e);
      }
      return Mode.CODE;
    }

    /**
     * write indent 
     * @param ind = number of spaces
     * @param output
     */
    public void writeIndent(int ind){
   	  for (int x=0;x<ind;x++) write(" ");
    }
    
    /**
     * output any pending lines in lineHold, then output supplied line if
     * it is not null.
     * @param line if not null this line will be appended to flushed output
     * @param nl newline character(s) including ';' if needed
     * @param prefixnl if true write newline before line
     */
    void flushLineHold(String line,String nl,boolean prefixnl){
      boolean first = true;
      try {
	    while (! lineHold.isEmpty()) {
		  String li = lineHold.poll();
	      if (first) write(nl+li);else write("\n"+li);
	      first = false;
	    }
	    if (line != null) {
	      if (prefixnl) {
		    if (first) write(nl+line);else write("\n"+line);
	      } else {
	    	write(line);
	      }
	    }
      } catch (Exception e) {
        System.err.println("error in flushLineHold: " + line +" due to "+ e);
      }
    }

    /**
     * a macro can be defined by '==>' or keyword 'Macro'
     * 
     * if line starts with 'ID ==>' then store macro otherwise
     * apply macro
     * 
     * @param line possibly containing macro definition or which
     *        may be expanded using existing macros.
     * @param input
     * @return line with macros applied.
     */
    public String applyMacroes(String line,BufferedReader input){
      try {
  	    String[] st = line.replaceAll("==>"," ==> ").split("[ ]+"); // any number of spaces are single separator
  	    if (st.length < 4) return line;
  	    if (st[2].equals("==>")){
  	    	// combine together all parts following '==>' into 'value'
  	    	String value = "";
  	    	String spacer = "";
  	    	for (int x=3;x<st.length;x++){
  	    		value = value + spacer + st[x];
  	    		spacer = " ";
  	    	}
  	    	// if macro is continued on next line then get it
  	    	while (line.endsWith("_")) {
  	    	  if (value.endsWith("_")) value = value.substring(0,value.length()-1);
  	    	  String line2 = input.readLine();
  	    	  value = value + line2.trim();
    	      line = line + line2.trim();
  	    	}
  	    	// if macro contains comment then remove it
  		    int cmtInd = getCommentIndex(value);
  		    if (cmtInd > -1) {
  		        //System.out.println("applyMacroes: removed comment in:" + line);
                value = value.substring(0,cmtInd);
  		    }
  	    	// '==>' in 'add' or 'with' constructs is not a macro so, in this
  	    	// case, do nothing.
  	  	    String[] st2 = value.replaceAll("==>"," ==> ").split("[ ]+"); // any number of spaces are single separator
  	    	for (int x=0;x<st2.length;x++){
  	    		if (st2[x].equals("add") || st2[x].equals("with")) return line;
  	    	}
  	    	// macros may themselves contain other macros, so substitute
  	    	// any existing macros.
  	    	value = SubstituteMacro(value);
  	    	macros.put(st[1],value);
  	    	return "-- "+line;
  	    } else if (st[1].equals("--") || st[1].equals("++")){
  	    	// don't apply macros to comments
  	    	return line;
  	    } else {
  	    	line = SubstituteMacro(line);
  	    }
      } catch (IOException ioException) {
        System.err.println("cannot process: " + line +" due to "+ ioException);
      }
      return line;
    }
    
    /**
     * Applies the macro expansion to 'shortText' and returns a String
     * with the expanded text.
     * @param shortText
     * @return
     */
    public String SubstituteMacro(String shortText){
	  Set<String> keys = macros.keySet();
	  for (String key:keys){
	  	String value = macros.get(key);
	  	// prefix $ with escape in value. We can't
	  	// use: key.replaceAll("\\$","\\\\$"); because $ has special meaning
	  	int dollar = value.indexOf("$");
	  	while (dollar > 0) {
	  	  StringBuffer v=new StringBuffer(value);
	  	  v.insert(dollar,"\\");
	  	  value = v.toString();
	  	  dollar = value.indexOf("$",dollar+2);
	  	  //System.out.println("value:"+value);
	  	}
	  	//System.out.println("searching key:"+key+" res:"+value);
	  	try {
	  	  shortText = shortText.replaceAll("\\b"+key+"\\b", value);
        } catch (IllegalArgumentException e) {
          System.err.println("cannot subst: " + key +" in "+ shortText +" due to "+ e);
          return "cannot subst: " + key +" in "+ shortText +" due to "+ e;
        }
    }
	  return shortText;
    }

    /**
     * in java the '/' character is considered an escape character
     * so we need to duplicate it when it occurs in a string.
     * @param lineIn line to be processed
     * @return line with '/' character duplicated
     */
    public String SubstituteStringEscape(String lineIn){
    	StringBuffer line = new StringBuffer(lineIn);
        boolean inSrt = false;
        // iterate backwards so that inserts do not affect position of
        // characters not yet processed
    	for (int i=line.length()-1;i > -1;i--) {
    		Character c=line.charAt(i);
    		if (c=='"') {
    			inSrt = !inSrt;
    		} else if (c=='\\' && inSrt) {
    			line.insert(i,'\\');
    		}
    	}
    	return line.toString();
    }

    /**
     * where statements are grouped together by brackets then
     * change to use braces instead.
     * @param line which may potentially have bracketed statements
     * @return line with braces.
     */
    public String bracketedStatements(String line){
    	boolean seperatorFound = false;
    	int depth = 0;
    	int openIndex = -1;
    	int closeIndex = -1;
    	boolean inStr =false;
    	for (int i=0;i<line.length();i++) {
    		Character c=line.charAt(i);
    		if (c=='"') {
    			inStr=!inStr;
    		}
    		// ignore '(',';' and ')' if they occur in strings
    		if (inStr) continue;
            if (c=='(') {
    			if (depth == 0) openIndex=i;
    			depth++;
    		} else if (c==')') {
    			depth--;
    			if ((depth == 0) && seperatorFound && closeIndex == -1)
                  closeIndex=i;
    		} else if (c==';') {
    			if (depth == 1) seperatorFound = true;
    		}
    	}
    	if ((openIndex >= 0) && (closeIndex > 0)) {
    		StringBuffer sb = new StringBuffer(line);
    		sb.setCharAt(openIndex,'{');
    		sb.setCharAt(closeIndex,'}');
    		sb.insert(closeIndex,';');
    		line = sb.toString();
    	}
    	return line;
    }

    /**
     * Check if line ends with '+','-' or ','
     * or does not close all brackets or parenthesis
     * if it does not then we will assume that it is continued on
     * next line
     * @param line to be checked for continuation
     * @return true if we concatenate rather than start new block
     */
    boolean impliedContinuation(String line){
    	// return false if line contains comment
    	if  (getCommentIndex(line) >= 0) return false;
    	// don't count brackets in strings
    	if (line.endsWith("_")) return true;
    	if (line.endsWith("where")) return false;
    	if (line.endsWith("with")) return false;
    	if (line.endsWith("add")) return false;
    	if (line.endsWith("==")) return false;
    	if (line.endsWith("=>")) return false;
    	if (line.endsWith(":=")) return false;
    	if (line.endsWith("repeat")) return false;
    	if (line.endsWith("then")) return false;
    	if (line.endsWith("else")) return false;
    	if (line.endsWith("while")) return false;
    	if (line.endsWith("do")) return false;
    	return true;
    }
    
    /**
     * If line contains a comment, indicated by "++" or "--", then
     * return its index. Otherwise return -1
     * If "++" or "--" is part of a string then its not a comment.
     * @param line input line
     * @return index of comment or -1
     */
    int getCommentIndex(String line){
    	boolean inStr =false;
    	for (int i=0;i<(line.length()-1);i++) {
    		char c = line.charAt(i);
    		if (c=='"') inStr=!inStr;
    		if (!inStr) {
    			if (c=='-' && line.charAt(i+1)=='-') return i;
    			if (c=='+' && line.charAt(i+1)=='+') return i;
    		}
    	}
    	return -1;
   }
}
