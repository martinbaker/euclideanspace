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

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
//import org.eclipse.core.runtime.CoreException;

import com.euclideanspace.spad.builder.Translate.Mode;

/**
 * @author Martin John Baker
 */
public class EclipseFileWriter{

	/**
	 * holds the data 
	 */
	FileContentBuffer data = new FileContentBuffer();
	/**
	 * name of file, with extension but not directory
	 */
	String name;
	/**
	 * folder where this file will be located
	 */
	IFolder parent;
	
	public EclipseFileWriter(String n,IFolder p){
		name = n;
		parent = p;
	}

	public void write(String line){
		data.write(line);
	}

    /**
     * Translate a single line of code. Intended to be overridden for each
     * file type
     * 
     * @param line to be written
     * @param input in case line is continued we can get more
     */
	Mode writeLineFormatted(String line,BufferedReader input){
		write(line + "\n");
		return Mode.DOCUM;
	}
	
	/**
	 * test if file already exists
	 * @return true if file already exists
	 */
	public boolean exists(){
	    IFile file = parent.getFile(name);
	    return file.exists();
	}

	/**
	 * This may resume an existing file or start a new one depending on
	 * whether n is equal to the previous name.
	 * @param n new file name
	 */
	public Mode openReopen(String n) {
		return Mode.DOCUM;
	}

	/**
	 * indicates we have collected all the data so we can write
	 * the file.
	 */
	public void commit(){
	  if (parent == null) return;
	  try {
	    IFile file = parent.getFile(name);
	    if (!file.exists()) {
	    	file.create(data, true,null);
	    } else {
	    	System.err.println("EclipseFileWriter.commit() file:" + name+" already exists");
	    	//System.out.println("EclipseFileWriter.close() appending" + file);
	    	file.appendContents(data, true,true,null);
	    }
	    // the old data is now in use by create, so any follow-on
	    // content must not use this, so create new one.
	    data = new FileContentBuffer();
      } catch (Exception e) {
    	System.err.println("EclipseFileWriter.commit() " + e);
	    //e.printStackTrace();
	  }
	  return;
    }

	/**
	 * close is not needed.
	 */
	/*public void close(){
		System.err.println("EclipseFileWriter.close():" + name);
	}*/

}
