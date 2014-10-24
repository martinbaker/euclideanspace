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

import org.antlr.runtime.CommonToken;

/**
 * This is intended to hold a phantom token, that it a token that has been
 * inserted in a custom parser but is not linked to any text in the editor.
 * 
 * It relies on returning an index range with zero length which is a hack
 * because it could easily be broken by possible changes in Xtext code.
 */
public class PhantomToken extends CommonToken {

	/**
	 * is Serializable so have static id
	 */
	private static final long serialVersionUID = 1L;

	public PhantomToken(int type) {
		super(type);
	}

	/** Text value is irrelevant since we always return "".
	 */
	@Override
	public String getText() {
		return "";
	}

	@Override
	public int getLine() {
		return -1;
	}

	@Override
	public int getCharPositionInLine() {
		return 0;
	}

	@Override
	public int getStartIndex() {
		return 0;
	}

	/**
	 * Since this is a phantom node we don't want any references back to
	 * the input text so we make the length zero. 
	 * 
	 * Length is calculated from stop-start+1
     * (in AbstractInternalAntlrParser.createLeafNode)
     * so if start is 0 and stop is -1 then length will be zero which is what
     * we want.
	 */
	@Override
	public int getStopIndex() {
		return -1;
	}

	@Override
	public String toString() {
		String channelStr = "";
		if ( channel>0 ) {
			channelStr=",channel="+channel;
		}
		return "[phantom token"+getTokenIndex()+channelStr+"]";
	}
}
