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

package com.euclideanspace.mathbase;

/**
 * @Data causes all getters and setters to be generated
 */
@Data class Expression {

	int intValue
	double realValue
	char charValue
	String stringValue
	boolean boolValue
	Expression[] arrayValue
	TypeExpression typeExp

    /*
     * construct expression containing int value
     */
 	new(int i,TypeExpression te) {
		_intValue=i
		_realValue=0.0;
		_charValue='.'.charAt(0) // xtend does not support char literals directly
		_stringValue="";
		_boolValue=false;
		_arrayValue={};
		_typeExp=te;	
	}

    /*
     * construct expression containing real(float) value
     */
 	new(double x,TypeExpression te) {
		_intValue=0
		_realValue=x;
		_charValue='.'.charAt(0) // xtend does not support char literals directly
		_stringValue="";
		_boolValue=false;
		_arrayValue={};
		_typeExp=te;	
	}

    /*
     * construct expression containing char value
     */
 	new(char c,TypeExpression te) {
		_intValue=0
		_realValue=0.0;
		_charValue=c
		_stringValue="";
		_boolValue=false;
		_arrayValue={};
		_typeExp=te;	
	}

    /*
     * construct expression containing string value
     */
 	new(String s,TypeExpression te) {
		_intValue=0
		_realValue=0.0;
		_charValue='.'.charAt(0) // xtend does not support char literals directly
		_stringValue=s;
		_boolValue=false;
		_arrayValue={};
		_typeExp=te;	
	}

    /*
     * construct expression containing boolean value
     */
 	new(boolean b,TypeExpression te) {
		_intValue=0
		_realValue=0.0;
		_charValue='.'.charAt(0) // xtend does not support char literals directly
		_stringValue="";
		_boolValue=b;
		_arrayValue={};
		_typeExp=te;	
	}

    /*
     * construct expression containing compound value
     */
 	new(Expression[] e,TypeExpression te) {
		_intValue=0
		_realValue=0.0;
		_charValue='.'.charAt(0) // xtend does not support char literals directly
		_stringValue="";
		_boolValue=false;
		_arrayValue=e;
		_typeExp=te;	
	}

    /*
     * construct expression containing compound value with select strings
     */
 	new(Expression[] e,String[] sa,TypeExpression te) {
		_intValue=0
		_realValue=0.0;
		_charValue='.'.charAt(0) // xtend does not support char literals directly
		_stringValue="";
		_boolValue=false;
		_arrayValue=e;
		_typeExp=te;	
	}

 override String toString() {
 	switch typeExp {
 		case typeExp.type == TYPE::INT: ""+intValue
 		case typeExp.type == TYPE::REAL: ""+realValue
 		case typeExp.type == TYPE::CHAR: ""+charValue
 		case typeExp.type == TYPE::STRING: stringValue
 		case typeExp.type == TYPE::BOOL: ""+boolValue
 		case typeExp.type == TYPE::SYMBOL: ""+stringValue
 		case typeExp.type == TYPE::FUNCT: ""+arrayValue
 		case typeExp.type == TYPE::RECORD: ""+arrayValue
 		case typeExp.type == TYPE::UNION: ""+arrayValue
 		case typeExp.type == TYPE::SELF: "*"
 		default: "error"
 	}
  }
}
