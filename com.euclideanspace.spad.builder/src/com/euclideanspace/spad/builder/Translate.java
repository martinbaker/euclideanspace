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

import org.eclipse.core.resources.IFolder;

public class Translate {
	File inFile = null;
	/**
	 * output file for documentation
	 */
	EclipseFileWriter texFile = null;
	/** holds status while reading a file
	 * DOCUM means << .... >>= has not yet been encountered so we are reading documentation
	 * HEAD means << .... has been read and we are looking for )abbrev .... 
	 * CODE means we are reading code body
	 */
	enum Mode {DOCUM,HEAD,CODE}
	Mode mode = Mode.DOCUM;
	/**
	 * line type
	 */
	enum LineType {COMMENT,EMPTY,CONTINUED,CODE}
	/** lineHold is store for lines that have been read but not processed
     * including:
     * any comments before )abbrev
     * comments and empty lines and held pending '}'
     */
	//LinkedBlockingQueue<String> lineHold = new LinkedBlockingQueue<String>();
	/** lineHoldType has an entry for each entry in lineHold to record
	 * what type the corresponding line is.
     */
	//LinkedBlockingQueue<LineType> lineHoldType = new LinkedBlockingQueue<LineType>();
	/**
	 * keep name of last file so we only delete when really changed
	 */
	//String lastFile = null;
	/**
	 * callback allows us to get user options
	 */
	BuilderNewWizard callback;
    /**
     * documentation type
     * 0 = html
     * 1 = tex
     */
	int documentationTypeOption = 0;

	/**
	 * translate a pamphlet file or whole directory
	 * 
	 * @param srcFolder
	 * @param fricasFiles
	 * @param cb
	 */
    public void trans(IFolder srcFolder,String fricasFiles,BuilderNewWizard cb) {
      callback = cb;
      documentationTypeOption = callback.getDocumentationOption();
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
  	  		 //int c=0;
  	  		 for (String s:dirFiles) {
  	  			 callback.UpdateProgress(s,1);
  	    	     int inds = s.indexOf(".");
  	    	     if (inds > -1) {
  	    	       if (s.endsWith("spad.pamphlet")) {
  	    	  	     nam = s.substring(0,inds);
  	    	  	     if (nam==null) return;
  	    	  	     //if (nam.equals("complet")) continue;
  	    	  	     //if (c++ > 2) { // was 58
  	  	  	    	 //    System.out.println("Translate.trans: break at:" + nam);
  	    	  	     //  break;
  	    	  	     //}
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
     * @param directoryFile directory of project
     * @param inFile location of source files
     * @param callback location of wizard
     */
    public void transPamphlet(String nm,IFolder directoryFile,File inFile,
    		                  BuilderNewWizard callback) {
	  	IFolder subDirectoryFile = callback.createFolder(nm,directoryFile);
    	if (subDirectoryFile == null) {
    		System.err.println("no output directory selected");
    		return;
    	}
    	if (inFile == null) {
    		System.err.println("no input file selected");
    		return;
    	}
    	if (documentationTypeOption==0) {
    	  texFile = new EclipseHTMLWriter(nm+".html",subDirectoryFile);
    	} else {
      	  texFile = new EclipseFileWriter(nm+".tex",subDirectoryFile);    		
    	}
    	EclipseSPADWriter output = new EclipseSPADWriter(subDirectoryFile,callback);
    	BufferedReader input = null;
    	try {
      	  input = new BufferedReader(new FileReader(inFile));     
      	  String line = null;
      	  while ((line = input.readLine()) != null) {
      	    //System.out.println(line);
      		switch (mode) {
      		  case DOCUM: mode = transDOCUM(line,texFile,output);break;
      		  case HEAD: mode = transHEAD(line,output);break;
      		  case CODE: mode = output.writeLineFormatted(line,input);break;
      		}
      	  }
      	texFile.openReopen(null);
    	} catch (Exception exception) {
    		System.err.println("cannot translate: " + inFile.getName()+" due to "+ exception);
     	} finally {
     	  try {
      	  //System.out.println("finally");
      	    if (input != null) input.close();
      	    input = null;
      	    if (texFile != null) texFile.commit();
      	    //texFile = null;
      	    if (output != null) output.openReopen(null);
      	    //output = null;
    	  } catch (Exception exception) {
    		System.err.println("translate.transPamphlet:cannot close due to "+ exception);
     	  }
      	}
    }

    /**
     * This is called when a line has been read and
     * mode= HEAD means << .... has been read and we are looking for )abbrev .... 
     * @param line just read
     * @param output stream
     */
    Mode transHEAD(String line,EclipseSPADWriter output){
      try {
  	    if (line.startsWith(")abbrev")) {
  	      output.write(line + "\n");
  	      output.flushLineHold(null,"\n",false);
  	      return Mode.CODE;
  	    } else if (line.startsWith("@")) {
    	  return Mode.DOCUM;
		} else {
  		  output.lineHold.offer(line);
  		  output.lineHoldType.offer(LineType.CODE);
  	   }
	  } catch (Exception exception) {
		System.err.println("cannot process: " + output +" due to "+ exception);
	  }
      return Mode.HEAD;
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
    public Mode transDOCUM(String line,EclipseFileWriter texOutput,
    		               EclipseSPADWriter output){
  	    try {
  	      texOutput.writeLineFormatted(line,null);
	    } catch (Exception e) {
		  System.err.println("transDOCUM cannot write: " +line +" due to "+ e);
	    }
  	    String tline = line.trim();
    	if (tline.startsWith("<<") && tline.endsWith(">>=")) {
      	  tline = tline.replaceAll("<<","");
      	  tline = tline.replaceAll(">>=","");
      	  tline = tline.trim();
    	  String[] st = tline.split("[ ]+"); // any number of spaces are single separator
    	  if (st.length != 3) return Mode.DOCUM;
    	  String nam = st[2];
    	  try {
    		return output.openReopen(nam+".spad");
   	      } catch (Exception e) {
    		System.err.println("transDOCUM cannot open: " + nam +" due to "+ e);
    	    return Mode.DOCUM;
    	  }
   	    }
    	return Mode.DOCUM;
    }

}
