package com.euclideanspace.spad.builder;

import java.io.*;
import java.util.Stack;
import java.util.concurrent.*;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;
//import java.util.regex.Matcher;
import javax.swing.*;
import javax.swing.filechooser.*;

import org.eclipse.core.resources.IFolder;

public class Translate extends JFrame {
	static final long serialVersionUID = 0;
	File inFile = null;
	File texFile = null;
	File directoryFile = null;
	File outFile = null;
	/** holds status while reading a file
	 * DOCUM means << .... >>= has not yet been encountered so we are reading documentation
	 * HEAD means << .... has been read and we are looking for )abbrev .... 
	 * CODE means we are reading code body
	 */
	enum Mode {DOCUM,HEAD,CODE}
	Mode mode = Mode.DOCUM;
	/** continuationLine is set to true if previous line ended with '_' */
	boolean continuationLine = false;
	/** holds previous indent values */
	Stack<Integer> pile = new Stack<Integer>();
	/** lineHold is store for lines that have been read but not processed
     * including:
     * any comments before )abbrev
     * comments and empty lines and held pending '}'
     */
	LinkedBlockingQueue<String> lineHold = new LinkedBlockingQueue<String>();
	/** store macros */
	Map<String,String> macros = new HashMap<String,String>();
	
	/**
	 * allows a pamphlet file or whole directory to be translated
	 */
    public void trans(IFolder srcFolder,String fricasFiles) {
      String nam = null;
  	  JFileChooser chooser = new JFileChooser();
  	  chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
  	  FileNameExtensionFilter filter = new FileNameExtensionFilter(
  	        "pamphlet file", "pamphlet");
      chooser.setFileFilter(filter);
      int returnVal = chooser.showOpenDialog(this);
  	  if(returnVal == JFileChooser.APPROVE_OPTION) {
  	     inFile = chooser.getSelectedFile();
  	     String nm = inFile.getName();
  	     int ind = nm.indexOf(".");
  	     if (ind > -1) {
  	  	   nam = nm.substring(0,ind);
  	     }
  	     System.out.println("Opening: " +nam +"("+nm+")");
  	  	 if (inFile.isFile()) {
  		    directoryFile = new File(System.getProperty("user.home")+"/workspace/test/src",nam);
  	  		transPamphlet(nam,directoryFile,inFile);
  	  	 }
  	  	 else if (inFile.isDirectory()) {
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
  	  		 for (String s:dirFiles) {
  	    	     int inds = s.indexOf(".");
  	    	     if (inds > -1) {
  	    	       if (s.endsWith("spad.pamphlet")) {
  	    	  	     nam = s.substring(0,inds);
  	    	  	     File pamphFile = new File(inFile,s);
  	  	  		     directoryFile = new File(System.getProperty("user.home")+"/workspace/test/src",nam);
  	  	    	     System.out.println("File: " + nam +" directory:"+directoryFile);
  	  	  	  		 transPamphlet(nam,directoryFile,pamphFile);
  	    	       }
  	    	     } 	  			 
  	  		 }
  	  		 System.out.println("Completed translation of: "+inFile);
  	  	 }
  	  }
    }
    
    /**
     * transform a single pamphlet file into a directory containing
     * various spad and tex files.
     * @param nm 
     * @param directoryFile
     */
    public void transPamphlet(String nm,File directoryFile,File inFile) {
    	if (directoryFile == null) {
    		System.err.println("no output directory selected");
    		return;
    	}
	    System.out.println("Set output directory: " + directoryFile.getName());
	    boolean success = directoryFile.mkdirs();
	    if (success) {
	      System.out.println("Create output directory: " + directoryFile.getName() + "("+directoryFile+")");
	    }
    	//chooseOut();
    	if (inFile == null) {
    		System.err.println("no input file selected");
    		return;
    	}
    	texFile = new File(directoryFile,nm+".txt");
    	Writer output = null;
    	Writer texOutput = null;
    	BufferedReader input = null;
    	try {
    	  //FileInputStream input = new FileInputStream(inFile);
      	  input = new BufferedReader(new FileReader(inFile));     
      	  texOutput = new BufferedWriter(new FileWriter(texFile));
      	  String line = null;
      	  while ((line = input.readLine()) != null) {
      	    //System.out.println(line);
      		switch (mode) {
      		  case DOCUM: output = transDOCUM(line,texOutput);
      		              if (output == null && mode==Mode.HEAD) System.err.println("open returns null " + line + "("+outFile+")");
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
      	    if (texOutput != null) texOutput.close();
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
    Writer transHEAD(String line,Writer output){
      try {
    		
  	    if (line.startsWith(")abbrev")) {
  	      mode=Mode.CODE;
  	      output.write(line + "\n");
  	      while (! lineHold.isEmpty()) output.write(lineHold.poll());	
  	    } else if (line.startsWith("@")) {
  	  	  while (! lineHold.isEmpty()) output.write(lineHold.poll());	
    	  output.write(line);
    	  System.out.println("macros: " + macros);
    	  macros.clear(); // don't use macros in next file
    	  mode=Mode.DOCUM;
    	  output.close();
    	  output = null;
    	  return null;
		} else {
  		  lineHold.offer("\n" + line);
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
    public Writer transDOCUM(String line,Writer texOutput){
  	    try {
  	      texOutput.write(line + "\n");
	    } catch (IOException ioException) {
		  System.err.println("transDOCUM cannot write: " +line +" due to "+ ioException);
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
    		outFile = new File(directoryFile,nam+".spad");
    		if (outFile.exists()) {
    			System.err.println("transDOCUM: " + nam + "is duplicated");
    			mode=Mode.DOCUM;
    			return null;
    		}
      	    System.out.println("open: " + nam + "("+outFile+")");
    		Writer output = new BufferedWriter(new FileWriter(outFile));
    		return output;
    	  } catch (IOException ioException) {
    		System.err.println("transDOCUM cannot open: " + nam +" due to "+ ioException);
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
    Writer transCODE(String line,Writer output,BufferedReader input){
      try {
  		if (line.startsWith("@")) {
		  while (!pile.empty()) {
			pile.pop();
			if (!pile.empty()) writeIndent(pile.peek(),output);
  			output.write("}" + "\n");
		  }
	  	  while (! lineHold.isEmpty()) output.write(lineHold.poll());	
  		  output.write(line);
  		  System.out.println("macros: " + macros);
  		  macros.clear(); // don't use macros in next file
  		  mode=Mode.DOCUM;
  		  output.close();
  		  output = null;
  		  return null;
  		}
        String prefix = " ";
        /** ind is indent of this line */
        int ind = 0;
        /** indent is current indent setting (previous indent) */
        int indent = 0;
        if (!pile.empty()) indent = pile.peek();
        while (line.startsWith(prefix)) {
          prefix = prefix+" ";
          ind++;
        }
		line =applyMacroes(line,input); // apply here so macroes don't affect indent
		line =bracketedStatements(line);
        String trimedLine = line.trim();
        if (trimedLine.startsWith("--") ||
          trimedLine.startsWith("++") ||
          line == null ||
          trimedLine.equals("") ||
          trimedLine.length() == 0 ||
          continuationLine) {
        	lineHold.offer("\n" + line);
    		//output.write("\n" + line);
    	 } else {
    		  int cmtInd = line.indexOf("--");
    		  if (cmtInd<0) cmtInd = line.indexOf("++");
    		  if (cmtInd > -1) {
    			  String cmt = line.substring(cmtInd,line.length());
                  lineHold.offer(cmt);
                  line = line.substring(0,cmtInd);
    		  }
    		  //System.out.println(line2);
    		  if (ind == indent) { // indent unchanged so no brace
    		  	  while (! lineHold.isEmpty()) output.write(lineHold.poll());	
    			  output.write("\n" + line);
    		  } else if (ind > indent) { // indent increased so insert '{'
    			  output.write(" {"); // put brace before any pending comments
    		  	  while (! lineHold.isEmpty()) output.write(lineHold.poll());	
    			  //output.write("push ind=" +ind+" indent="+ indent);
    			  output.write("\n" +  line);
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
    		  	  while (! lineHold.isEmpty()) output.write(lineHold.poll());	
      			  output.write("\n" + line);
    		  }
    	}
    	if (trimedLine.endsWith("_")) continuationLine =true;
    	else continuationLine =false;
    	//String st = line.replace("\"","");//.split(",");
    	//System.out.println(st);
    	//output.write(st + "\n");    	
      } catch (IOException ioException) {
          System.err.println("cannot process: " + output.toString()+" due to "+ ioException);
  		  output = null;
  		  return null;
      }
      return output;
    }
    
    /**
     * a macro can be defined by '==>' or keyword 'Macro'
     * @param line possibly containing macro definition or which
     *        may be expanded using existing macros.
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
	  	  //v.insert(dollar+1,"{pageContext.request.contextPath}/");
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
     * write indent 
     * @param ind = number of spaces
     * @param output
     */
    public void writeIndent(int ind,Writer output){
      try {
    	for (int x=0;x<ind;x++) output.write(" ");
	  } catch (IOException ioException) {
		System.err.println("cannot process: " + output.toString()+" due to "+ ioException);
		return;
	  }
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

    /**
     * choose a directory to hold output files
     */
    /*public void chooseOut() {
	  JFileChooser chooser = new JFileChooser();
	  chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
	  //FileNameExtensionFilter filter = new FileNameExtensionFilter(
	  //      "text file", "txt");
	  //  chooser.setFileFilter(filter);
	    int returnVal = chooser.showOpenDialog(this);
	    if(returnVal == JFileChooser.APPROVE_OPTION) {
	      directoryFile = chooser.getSelectedFile();
	      System.out.println("Creating directory: " + directoryFile.getName());
	      boolean success = directoryFile.mkdirs();
	      if (success) {
	        System.out.println("Directories: " + directoryFile + " created");
	      }
	    }
    }*/

    /**
     * when a line like:
     * <<package REALSOLV RealSolvePackage>>=
     * is read then we need to construct a file called RealSolvePackage.spad
     * in the current directory.
     * 
     * @param n name of file to be created
     * @return file created
     */
    public File outputFile(String n) {
    	return new File(directoryFile,n+".spad");
    }
}
