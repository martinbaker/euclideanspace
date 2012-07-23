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

import java.io.*;
import java.util.Stack;
import java.util.concurrent.*;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;

import org.eclipse.core.resources.IFolder;

public class Translate {
	File inFile = null;
	EclipseFileWriter texFile = null;
	/** holds status while reading a file
	 * DOCUM means << .... >>= has not yet been encountered so we are reading documentation
	 * HEAD means << .... has been read and we are looking for )abbrev .... 
	 * CODE means we are reading code body
	 */
	enum Mode {DOCUM,HEAD,CODE}
	Mode mode = Mode.DOCUM;
	/** holds previous indent values */
	Stack<Integer> pile = new Stack<Integer>();
	/** when we have a continuation we need to use the indent for the first part
	 * of the line
	 */
	int indentForContinuation = -1;
	/** store macros */
	Map<String,String> macros = new HashMap<String,String>();
	/**
	 * line type
	 */
	enum LineType {COMMENT,EMPTY,CONTINUED,CODE}
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
     * bracketDebth and parenthesisDebth are counters which are incremented when
     * bracket closes, therefore positive value tells us that not all brackets
     * are closed and therefore implies that line is continued.
     * 
     * the values are class wide to allow values to roll over to following
     * lines.
     */
	int bracketDebth = 0;
    /**
     * bracketDebth and parenthesisDebth are counters which are incremented when
     * bracket closes, therefore positive value tells us that not all brackets
     * are closed and therefore implies that line is continued.
     * 
     * the values are class wide to allow values to roll over to following
     * lines.
     */
	int parenthesisDebth = 0;
	
	/**
	 * translate a pamphlet file or whole directory
	 * 
	 * @param srcFolder
	 * @param fricasFiles
	 */
    public void trans(IFolder srcFolder,String fricasFiles,BuilderNewWizard callback) {
      inFile = new File(fricasFiles);
      String nm = inFile.getName();
      String nam = nm;
      int ind = nm.indexOf(".");
      if (ind > -1) {
        nam = nm.substring(0,ind);
      }
      if (inFile.isFile()) {
  	    transPamphlet(nam,srcFolder,inFile,callback);
  	  } else if (inFile.isDirectory()) {
  	  		//System.out.println("filename: "+inFile.getName());
  	  		 if ("fricas".equals(inFile.getName())) {
  	  			 File subdir = new File(inFile,"src");
  	  		     System.out.println("checking: "+subdir);
  	  			 if (subdir.exists()) inFile = subdir;
  	  		 }
  	  		 if ("src".equals(inFile.getName())) {
  	  			 File subdir = new File(inFile,"algebra");
  	  		     System.out.println("checking: "+subdir);
  	  			 if (subdir.exists()) inFile = subdir;
  	  		 }
  	  		 String dirFiles[] = inFile.list();
  	  		 callback.StartProgress("progress",dirFiles.length);
  	  		 //int progressIndex=0;
  	  		 for (String s:dirFiles) {
  	  			 callback.UpdateProgress(s,1);
  	    	     int inds = s.indexOf(".");
  	    	     if (inds > -1) {
  	    	       if (s.endsWith("spad.pamphlet")) {
  	    	  	     nam = s.substring(0,inds);
  	    	  	     File pamphFile = new File(inFile,s);
  	  	    	     //System.out.println("File: " + nam +
  	  	    	     //		 " directory:"+srcFolder +
  	  	    	     //		 " "+progressIndex +
  	  	    	     //		 " of "+dirFiles.length);
  	  	  	  		 transPamphlet(nam,srcFolder,pamphFile,callback);
  	    	       }
  	    	     } 	  			 
  	  		 }
  	  		 System.out.println("Completed translation of: "+inFile);
  	  	 }
    }

    /**
     * transform a single pamphlet file into a directory containing
     * various spad and tex files.
     * @param nm name of pamphlet file 
     * @param subDirectoryFile
     * @param inFile
     */
    public void transPamphlet(String nm,IFolder directoryFile,File inFile,BuilderNewWizard callback) {
	  	IFolder subDirectoryFile = callback.createFolder(nm,directoryFile);
    	if (subDirectoryFile == null) {
    		System.err.println("no output directory selected");
    		return;
    	}
    	if (inFile == null) {
    		System.err.println("no input file selected");
    		return;
    	}
    	texFile = new EclipseFileWriter(nm+".txt",subDirectoryFile);
    	EclipseFileWriter output = null;
    	BufferedReader input = null;
    	try {
      	  input = new BufferedReader(new FileReader(inFile));     
      	  String line = null;
      	  while ((line = input.readLine()) != null) {
      	    //System.out.println(line);
      		switch (mode) {
      		  case DOCUM: output = transDOCUM(line,texFile,subDirectoryFile);
      		              if (output == null && mode==Mode.HEAD) System.err.println("open returns null " + line);
      		              break;
      		  case HEAD: output = transHEAD(line,output);break;
      		  case CODE: output = transCODE(line,output,input);break;
      		}
      	  }
		  while (!pile.empty()) {
			 pile.pop();
			 if (!pile.empty()) writeIndent(pile.peek(),output);
    		 output.write("}" + "\n");
		  }
    	} catch (Exception exception) {
    		System.err.println("cannot translate: " + inFile.getName()+" due to "+ exception);
     	} finally {
     	  try {
      	  //System.out.println("finally");
      	    if (input != null) input.close();
      	    if (texFile != null) texFile.close();
      	    if (output != null) output.close();
    	  } catch (Exception exception) {
    		System.err.println("cannot close due to "+ exception);
     	  }
      	}
    }

    /**
     * This is called when a line has been read and
     * mode= HEAD means << .... has been read and we are looking for )abbrev .... 
     * @param line just read
     * @param output stream
     */
    EclipseFileWriter transHEAD(String line,EclipseFileWriter output){
      try {
  	    if (line.startsWith(")abbrev")) {
  	      mode=Mode.CODE;
  	      output.write(line + "\n");
  	      flushLineHold(output,null);
  	    } else if (line.startsWith("@")) {
  	      flushLineHold(output,line);
    	  //System.out.println("macros: " + macros);
    	  macros.clear(); // don't use macros in next file
    	  mode=Mode.DOCUM;
    	  output.close();
    	  output = null;
    	  return null;
		} else {
  		  lineHold.offer(line);
  		  lineHoldType.offer(LineType.CODE);
  	   }
	  } catch (Exception exception) {
		System.err.println("cannot process: " + output +" due to "+ exception);
	  }
      return output;
    }

    /**
     * If not currently reading code then check for the start of a code
     * block which starts with a line like:
     * <<package REALSOLV RealSolvePackage>>=
     * if this is found then open an output file
     * 
     * @param line String being read
     * @return Writer if this is the start of a code block otherwise null.
     */
    public EclipseFileWriter transDOCUM(String line,EclipseFileWriter texOutput,IFolder subDirectoryFile){
  	    try {
  	      texOutput.write(line + "\n");
	    } catch (Exception e) {
		  System.err.println("transDOCUM cannot write: " +line +" due to "+ e);
	    }
  	    String tline = line.trim();
    	if (tline.startsWith("<<") && tline.endsWith(">>=")) {
      	  tline = tline.replaceAll("<<","");
      	  tline = tline.replaceAll(">>=","");
      	  tline = tline.trim();
    	  String[] st = tline.split("[ ]+"); // any number of spaces are single separator
    	  if (st.length != 3) return null;
    	  String nam = st[2];
    	  mode=Mode.HEAD;
    	  try {
    		EclipseFileWriter output = new EclipseFileWriter(nam+".spad",subDirectoryFile);
    		return output;
    	  } catch (Exception e) {
    		System.err.println("transDOCUM cannot open: " + nam +" due to "+ e);
    		mode=Mode.DOCUM;
    	    return null;
    	  }
   	    }
    	return null;
    }

    /**
     * we are currently reading SPAD code
     * @param line
     * @param output
     */
    EclipseFileWriter transCODE(String line,EclipseFileWriter output,BufferedReader input){
  	  try{
		//System.out.println("transCODE 0");
  		if (line == null) return null;
    	if (line.startsWith("@")) {
    	  if (!pile.empty()) output.write("\n");
		  while (!pile.empty()) {
			pile.pop();
			if (!pile.empty()) writeIndent(pile.peek(),output);
  			output.write("}" + "\n");
		  }
		  flushLineHold(output,line);
  		  //System.out.println("macros: " + macros);
  		  macros.clear(); // don't use macros in next file
  		  mode=Mode.DOCUM;
  		  output.close();
  		  output = null;
      	  bracketDebth = parenthesisDebth = 0;
  		  return null;
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
		line =applyMacroes(line,input); // apply here so macros don't affect indent
		line =bracketedStatements(line); // where statements are grouped together by
                                         // brackets then change to use braces instead.
		line =SubstituteStringEscape(line);  // in java the '/' character is considered
	                                     // an escape character so we need to duplicate
		                                 // it when it occurs in a string.
		String trimedLine = line.trim();
        // if line contains comment (not just starts with comment) then
        // set following
        //boolean containsComment =  (getCommentIndex(line) >= 0);
    	/** continuationLine is set to true if line ends with '_' */
    	boolean continuationLine = impliedContinuation(trimedLine);
    	// remove the trailing '_'
    	if (trimedLine.endsWith("_")) {
        	line = line.substring(0,line.length()-1);
        	trimedLine = line.trim();
        }
        if (continuationLine && indentForContinuation<0){
        	indentForContinuation = ind;
        }
        if (!continuationLine) bracketDebth = parenthesisDebth = 0;
        // if we have just read a comment, or an empty line, or a continuation
        // line (ends with _) then put it into holding stack otherwise process it.
    	LineType lineType = LineType.CODE;
    	if (continuationLine) lineType = LineType.CONTINUED;
    	if (trimedLine.startsWith("--") ||
    	          trimedLine.startsWith("++")) lineType = LineType.COMMENT;
    	if (trimedLine.equals("") ||
    	          trimedLine.length() == 0) lineType = LineType.EMPTY;
        if (lineType != LineType.CODE) {
            lineHold.offer(line);
            lineHoldType.offer(lineType);
    	} else {
    		  if (indentForContinuation >= 0){
    			  ind = indentForContinuation;
    			  indentForContinuation = -1;
    		  }
    		  // if line contains comment then split into two separate
    		  // strings
    		  int cmtInd = getCommentIndex(line);
    		  if (cmtInd > -1) {
    			if (lineHoldType.peek() == LineType.CONTINUED){
    			  String cmt = line.substring(cmtInd,line.length());
                  line = line.substring(0,cmtInd);
                  lineHold.offer(line);
                  lineHoldType.offer(LineType.CODE);
                  line = cmt.toString()+"\n";
    			} else {
      			  String cmt = line.substring(cmtInd,line.length());
                  line = line.substring(0,cmtInd);
                  lineHold.offer(cmt);
                  lineHoldType.offer(LineType.COMMENT);
      			}
    		  }
    		  //System.out.println(line2);
    		  if (ind == indent) { // indent unchanged so no brace
    			  flushLineHold(output,line);
    		  } else if (ind > indent) { // indent increased so insert '{'
   			    output.write(" {"); // put brace before any pending comments
    			    flushLineHold(output,line);
    			    //output.write("push ind=" +ind+" indent="+ indent);
    			    pile.push(ind);
    		  } else if (ind < indent) { // indent reduced so insert '}'
    			  while (!pile.empty() && ind < indent) {
                    pile.pop();
                    if (!pile.empty()) indent = pile.peek();
                    else indent = 0;
       			    output.write("\n");
       			    writeIndent(ind,output);
       			    output.write("}");
       			    //output.write(" ind=" + ind +" pop indent="+ indent);
    			  }
    			  flushLineHold(output,line);
    		  }
    	}
      } catch (Exception e) {
        System.err.println("error in transCODE: " + line +" due to "+ e);
      }
      return output;
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

    /**
     * Check if line ends with '+','-' or ','
     * or does not close all brackets or parenthesis
     * if it does not then we will assume that it is continued on
     * next line
     * @param line to be checked for continuation
     * @return true if more opening than closing
     */
    boolean impliedContinuation(String line){
    	// return false if line contains comment
    	if  (getCommentIndex(line) >= 0) return false;
    	// don't count brackets in strings
    	boolean inStr =false;
    	//int bracketDebth = 0;
    	//int parenthesisDebth = 0;
    	for (int i=0;i<(line.length());i++) {
    		char c = line.charAt(i);
    		if (c=='"') inStr=!inStr;
    		if (inStr) continue;
    		//if (i<(line.length()-1)) {
    		//	if (c=='-' && line.charAt(i+1)=='-') return false;
    		//	if (c=='+' && line.charAt(i+1)=='+') return false;
    		//}
    		if (c=='(') ++parenthesisDebth;
    		if (c==')') --parenthesisDebth;
    		if (c=='[') ++bracketDebth;
    		if (c==']') --bracketDebth;
    	}
    	//if ((bracketDebth > 0)||(parenthesisDebth > 0)) 
    	//	System.out.println("containsHangingBracket: " + line + " "+((bracketDebth > 0)||(parenthesisDebth > 0)));
    	if (line.endsWith("_")) return true;
    	if (line.endsWith("+")) return true;
    	if (line.endsWith("-")) return true;
    	if (line.endsWith(",")) return true;
    	if (line.endsWith(":")) return true;
    	return ((bracketDebth > 0)||(parenthesisDebth > 0));
    }

    /**
     * output any pending lines in lineHold, then output supplied line if
     * it is not null.
     * @param output where to output
     * @param line if not null this line will be appended to flushed output
     */
    void flushLineHold(EclipseFileWriter output,String line){
      boolean continuation = false;
      try {
	    while (! lineHold.isEmpty()) {
		  String li = lineHold.poll();
	      LineType t=lineHoldType.poll();
		  if (!continuation) {
			  output.write("\n"+li);
		  } else {
			  if (li.length() > 0) output.write(" "+li.trim());
		  }
	      continuation = (t==LineType.CONTINUED);
	    }
	    if (line != null) {
	      if (!continuation) {
	    	  output.write("\n"+line);
	      } else{
	    	  if (line.length() > 0) output.write(" "+line.trim());
	      }
	    }
      } catch (Exception e) {
        System.err.println("error in flushLineHold: " + line +" due to "+ e);
      }
    }

    /**
     * a macro can be defined by '==>' or keyword 'Macro'
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
  	    	for (int x=3;x<st.length;x++){
  	    		if (st[x].equals("add") || st[x].equals("with")) return line;
  	    	}
  	    	String value = "";
  	    	String spacer = "";
  	    	for (int x=3;x<st.length;x++){
  	    		value = value + spacer + st[x];
  	    		spacer = " ";
  	    	}
  	    	while (line.endsWith("_")) {
  	    	  if (value.endsWith("_")) value = value.substring(0,value.length()-1);
  	    	  String line2 = input.readLine();
  	    	  value = value + line2.trim();
    	      line = line + line2.trim();
  	    	}
  	    	value = SubstituteMacro(value);
  	    	macros.put(st[1],value);
  	    	return "-- "+line;
  	    } else if (st[1].equals("--") || st[1].equals("--")){
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
     * write indent 
     * @param ind = number of spaces
     * @param output
     */
    public void writeIndent(int ind,EclipseFileWriter output){
   	  for (int x=0;x<ind;x++) output.write(" ");
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
    	for (int i=0;i<line.length();i++) {
    		Character c=line.charAt(i);
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
}
