package com.euclideanspace.spad.builder;

import java.io.BufferedReader;

import org.eclipse.core.resources.IFolder;

import com.euclideanspace.spad.builder.Translate.Mode;

public class EclipseHTMLWriter extends EclipseFileWriter {

	public EclipseHTMLWriter(String n, IFolder p) {
		super(n, p);
		// TODO Auto-generated constructor stub
		write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">"+ "\n");
		write("<html>\n<head>"+ "\n");
		write("<title>SPAD documentation</title>"+ "\n");
		write("</head>"+ "\n");
		write("<body>"+ "\n");
	}

/*
 * \\documentclass{article}
\\usepackage{axiom}
\\begin{document}
\\title{\\$SPAD/src/algebra acplot.spad}
\\author{Clifton J. Williamson}
\\maketitle
\\begin{abstract}
\\end{abstract}
\\eject
\\tableofcontents
\\eject
\\section{package REALSOLV RealSolvePackage}
<<package REALSOLV RealSolvePackage>>=
\\section{domain ACPLOT PlaneAlgebraicCurvePlot}
<<domain ACPLOT PlaneAlgebraicCurvePlot>>=
\\section{License}
<<license>>=
 */
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
			write("<ul>\n");
			return Mode.DOCUM;
		}
		if (tline.startsWith("\\begin")) return Mode.DOCUM;
		if (tline.startsWith("\\item")) {
			write("<li>"+ tline + "</li>\n");
			return Mode.DOCUM;
		}
		if (tline.startsWith("\\url")) {
			write("<a href=\""+extractFromBraces(line)+"\">"+ extractFromBraces(line) + "</a>\n");
			return Mode.DOCUM;
		}
		//if (line.startsWith("\\begin")) return Mode.DOCUM;
		//if (line.startsWith("\\begin")) return Mode.DOCUM;
		if (tline.startsWith("\\title")) return Mode.DOCUM;
		if (tline.startsWith("\\author")) return Mode.DOCUM;
		if (tline.startsWith("\\maketitle")) return Mode.DOCUM;
		if (tline.startsWith("\\end{itemize}")) {
			write("</ul>\n");
			return Mode.DOCUM;
		}
		if (tline.startsWith("\\end")) return Mode.DOCUM;
		if (tline.startsWith("\\eject")) return Mode.DOCUM;
		if (tline.startsWith("\\section")) {
			write("<h2>"+ extractFromBraces(line) + "</h2>\n");
			return Mode.DOCUM;
		}
		if (tline.startsWith("\\subsection")) {
			write("<h3>"+ extractFromBraces(line) + "</h3>\n");
			return Mode.DOCUM;
		}
		if (tline.startsWith("<<package")) return Mode.DOCUM;
		if (tline.startsWith("<<domain")) return Mode.DOCUM;
		if (tline.startsWith("<<category")) return Mode.DOCUM;
		if (tline.startsWith("<<license")) return Mode.DOCUM;
		tline = tline.replaceAll("&","&amp;");// change & to &amp;
		tline = tline.replaceAll("<","&lt;");// change < to &lt;
		tline = tline.replaceAll(">","&gt;");// change > to &gt;
		write("</p>"+ tline + "</p>\n");
		return Mode.DOCUM;
	}

    public String extractFromBraces(String line){
	  if (line==null) return "";
	  int startIndex = line.indexOf("{")+1;
	  int endIndex = line.indexOf("}");
	  if (startIndex<0 || endIndex<0) return line;
	  if (startIndex > endIndex) return line;
	  return line.substring(startIndex, endIndex);
    }

	/**
	 * This may resume an existing file or start a new one depending on
	 * whether n is equal to the previous name.
	 * @param n new file name
	 */
	@Override
	public Mode openReopen(String n) {
		write("</body>"+ "\n");
		write("</html>"+ "\n");
		return Mode.DOCUM;
	}
}
