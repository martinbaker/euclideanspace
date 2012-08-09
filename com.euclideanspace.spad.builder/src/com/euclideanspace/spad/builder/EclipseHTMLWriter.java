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
import org.eclipse.core.resources.IFolder;
import com.euclideanspace.spad.builder.Translate.Mode;

public class EclipseHTMLWriter extends EclipseFileWriter {

	enum CurrentTag {NONE,P,PRE,UL,LI,TABLE}
	CurrentTag tag = CurrentTag.NONE;

	public EclipseHTMLWriter(String n, IFolder p) {
		super(n, p);
		write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">"+ "\n");
		write("<html>\n<head>"+ "\n");
		write("<title>SPAD documentation</title>"+ "\n");
		write("</head>"+ "\n");
		write("<body>"+ "\n");
	}

    /**
     * Translate a single line of HTML code
     * 
     * @param line to be written
     * @param input in case line is continued we can get more
     */
	@Override
    Mode writeLineFormatted(String line,BufferedReader input){
		String tline = line.trim();
		if (tline.startsWith("\\documentclass")) return Mode.DOCUM;
		if (tline.startsWith("\\usepackage")) return Mode.DOCUM;
		if (tline.startsWith("\\begin{itemize}")) {
			closeCurrentTag();
			tag=CurrentTag.UL;
			write("<ul>\n");
			return Mode.DOCUM;
		}
		if (tline.startsWith("\\begin{verbatim}")) {
			closeCurrentTag();
			tag=CurrentTag.PRE;
			write("<pre>\n");
			return Mode.DOCUM;
		}
		if (tline.startsWith("\\begin{list}")) {
			closeCurrentTag();
			tag=CurrentTag.TABLE;
			write("<table><tr><td>\n");
			return Mode.DOCUM;
			// this handles tables - columns are separated by whitespace
		}
		if (tline.startsWith("\\begin")) return Mode.DOCUM;
		if (tline.startsWith("\\item")) {
			switch (tag) {
			  case NONE: write("<ul><li>\n");break;
			  case P: write("</p><ul><li>\n");break;
			  case PRE: write("</pre><ul><li>\n");break;
			  case UL: write("<li>\n");break;
			  case LI: write("</li><li>\n");break;
			  case TABLE: write("\n");break;
			}			
			write(tline.substring(5,tline.length()));
			tag=CurrentTag.LI;
			return Mode.DOCUM;
		}
		if (tline.startsWith("\\url")) {
			closeCurrentTag();
			write("<a href=\""+extractFromBraces(line)+"\">"+ extractFromBraces(line) + "</a>\n");
			return Mode.DOCUM;
		}
		if (tline.startsWith("\\title")) {
		  closeCurrentTag();
		  write("<h1>Title - "+ extractFromBraces(line) + "</h1>\n");
		  return Mode.DOCUM;
		}
		if (tline.startsWith("\\author")) {
			  closeCurrentTag();
			  write("<h2>Author - "+ extractFromBraces(line) + "</h2>\n");
			  return Mode.DOCUM;
			}

		if (tline.startsWith("\\maketitle")) return Mode.DOCUM;
		if (tline.startsWith("\\end{itemize}")) {
			closeCurrentTag();
			return Mode.DOCUM;
		}
		if (tline.startsWith("\\end{verbatim}")) {
			closeCurrentTag();
			return Mode.DOCUM;
		}
		if (tline.startsWith("\\end{table}")) {
			closeCurrentTag();
			return Mode.DOCUM;
		}
		if (tline.startsWith("\\end")) return Mode.DOCUM;
		if (tline.startsWith("\\eject")) {
		    write("<hr />\n");
			return Mode.DOCUM;
		}
		if (tline.startsWith("\\section")) {
			closeCurrentTag();
			write("<h2>"+ extractFromBraces(line) + "</h2>\n");
			return Mode.DOCUM;
		}
		if (tline.startsWith("\\subsection")) {
			closeCurrentTag();
			write("<h3>"+ extractFromBraces(line) + "</h3>\n");
			return Mode.DOCUM;
		}
		if (tline.startsWith("<<package")) return Mode.DOCUM;
		if (tline.startsWith("<<domain")) return Mode.DOCUM;
		if (tline.startsWith("<<category")) return Mode.DOCUM;
		if (tline.startsWith("<<license")) return Mode.DOCUM;
		if (tline.startsWith("\\newcommand")) return Mode.DOCUM;
		if (tline.startsWith("\\bibitem")) return Mode.DOCUM;
		if (tline.startsWith("\\tableofcontents")) return Mode.DOCUM;
		if (tline.startsWith("\\verb")) return Mode.DOCUM;
		if (tline.equals("")) {
			switch (tag) {
			  case NONE: break;
			  case P: write("</p>\n");tag=CurrentTag.NONE;break;
			  case PRE: break;
			  case UL: write("</ul>\n");tag=CurrentTag.NONE;break;
			  case LI: write("</li></ul>\n");tag=CurrentTag.NONE;break;
			  case TABLE: write("<td></td>\n");break;
			}			
			return Mode.DOCUM;
		}
		tline = tline.replaceAll("&","&amp;");// change & to &amp;
		tline = tline.replaceAll("<","&lt;");// change < to &lt;
		tline = tline.replaceAll(">","&gt;");// change > to &gt;
		if (tline.startsWith("--")) tline = "<br />"+tline;
		switch (tag) {
		  case NONE: write("<p>");tag=CurrentTag.P;break;
		  case P: break;
		  case PRE: break;
		  case UL: break;
		  case LI: break;
		  case TABLE:
			  String[] st = tline.split("[ ]+");
			  write("<tr>\n");
			  for (String s:st){
				  write("<td>"+s+"</td>\n");
			  }
			  write("</tr>\n");
			  return Mode.DOCUM;
		}
		write(tline+"\n");
		return Mode.DOCUM;
	}

	public void closeCurrentTag(){
		switch (tag) {
		  case NONE: break;
		  case P: write("</p>\n");break;
		  case PRE: write("</pre>\n");break;
		  case UL: write("</ul>\n");break;
		  case LI: write("</li></ul>\n");break;
		  case TABLE: write("</table>\n");break;
		}			
		tag=CurrentTag.NONE;		
	}
	
    public String extractFromBraces(String line){
	  if (line==null) return "";
	  int startIndex = line.indexOf("{")+1;
	  int endIndex = line.indexOf("}");
	  if (startIndex<0 || endIndex<0) return line;
	  if (startIndex > endIndex) return line;
	  String tline = line.substring(startIndex, endIndex);
	  tline = tline.replaceAll("&","&amp;");// change & to &amp;
	  tline = tline.replaceAll("<","&lt;");// change < to &lt;
	  tline = tline.replaceAll(">","&gt;");// change > to &gt;
	  return tline;
    }

	/**
	 * This may resume an existing file or start a new one depending on
	 * whether n is equal to the previous name.
	 * @param n new file name
	 */
	@Override
	public Mode openReopen(String n) {
		closeCurrentTag();
		write("</body>"+ "\n");
		write("</html>"+ "\n");
		commit();
		return Mode.DOCUM;
	}
	
}
