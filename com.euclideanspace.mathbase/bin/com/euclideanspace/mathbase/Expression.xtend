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

//import java.lang.Double

/**
 * Expression has two 'types'.
 * A low level 'type' just describes what type of data this holds
 * A high level 'type' describes what it represents.
 * For example a symbolic integer is held as a string at low level but
 * at high level that sting represents an integer.
 * 
 * @Data causes all getters and setters to be generated
 */
class Expression {

	@Property int intValue
	@Property double realValue
	@Property char charValue
	@Property String stringValue
	@Property boolean boolValue
	@Property Expression[] arrayValue
	@Property TYPE lowType
    @Property Domain highType
    
    /*
     * construct expression containing int value
     */
 	new(int i,Domain ht) {
		_intValue=i
		_realValue=0.0;
		_charValue='.'.charAt(0) // xtend does not support char literals directly
		_stringValue="";
		_boolValue=false;
		_arrayValue={};
		_lowType=TYPE::INT;
		_highType=ht
	}

    /*
     * construct expression containing real(float) value
     */
 	new(double x,Domain ht) {
		_intValue=0
		_realValue=x;
		_charValue='.'.charAt(0) // xtend does not support char literals directly
		_stringValue="";
		_boolValue=false;
		_arrayValue={};
		_lowType=TYPE::REAL;	
		_highType=ht
	}

    /*
     * construct expression containing char value
     */
 	new(char c,Domain ht) {
		_intValue=0
		_realValue=0.0;
		_charValue=c
		_stringValue="";
		_boolValue=false;
		_arrayValue={};
		_lowType=TYPE::CHAR;	
		_highType=ht
	}

    /*
     * construct expression containing string value
     */
 	new(String s,Domain ht) {
		_intValue=0
		_realValue=0.0;
		_charValue='.'.charAt(0) // xtend does not support char literals directly
		_stringValue=s;
		_boolValue=false;
		_arrayValue={};
		_lowType=TYPE::STRING;	
		_highType=ht
	}

    /*
     * construct expression containing boolean value
     */
 	new(boolean b,Domain ht) {
		_intValue=0
		_realValue=0.0;
		_charValue='.'.charAt(0) // xtend does not support char literals directly
		_stringValue="";
		_boolValue=b;
		_arrayValue={};
		_lowType=TYPE::BOOL;	
		_highType=ht
	}

    /*
     * construct expression containing compound value
     */
 	new(Expression[] e,Domain ht) {
		_intValue=0
		_realValue=0.0;
		_charValue='.'.charAt(0) // xtend does not support char literals directly
		_stringValue="";
		_boolValue=false;
		_arrayValue=e;
		_lowType=TYPE::FUNCT;	
		_highType=ht
	}

 /**
  * construct a function
  * or for some functions/operands we may apply the function
  */
 new(String s,Expression a,Expression b){
 	if (a.isNumeric() && b.isNumeric()) {
 	  _intValue=a.intValue + b.intValue
 	  _realValue=a.realValue + b.realValue
 	  _arrayValue={}
	  _stringValue="";
 	} else {
 	  _intValue=0
	  _realValue=0.0
	  _arrayValue=newArrayList(a,b)
	  _stringValue=s;
 	}
 	_charValue='.'.charAt(0) // xtend does not support char literals directly
	_boolValue=false;
	_lowType=TYPE::INT;	
	_highType=a.highType
 }

 def boolean isNumeric() {
 	if (stringValue == null) return true
 	stringValue.equals("")
 }

 def Expression elt(int i){
 	if (arrayValue == null) return null
 	arrayValue.get(i)
 }

  def String stringArray(){
 		var strVal = stringValue+"(";
 		var follow = false;
 		for (Expression a:arrayValue){
 			if (follow) strVal = strVal + ","
 			strVal = strVal + a
 			follow = true
 		}
 	 	strVal+")";
  }

 override String toString() {
 	// first check for function or symbolic value 
 	if (stringValue != null) if (! stringValue.equals("")) {
 		if (arrayValue == null) return stringValue;
 	 	return stringValue+stringArray();
 	}
 	switch lowType {
 		case TYPE::INT: ""+intValue
 		case TYPE::REAL: ""+realValue
 		case TYPE::CHAR: ""+charValue
 		case TYPE::STRING: stringValue
 		case TYPE::BOOL: ""+boolValue
 		case TYPE::SYMBOL: ""+stringValue
 		case TYPE::FUNCT: ""+stringArray()
 		case TYPE::RECORD: ""+stringArray()
 		case TYPE::UNION: ""+stringArray()
 		case TYPE::SELF: "*"
 		default: "error"
 	}
  }
  

  override int hashCode() {
    val int prime = 31;
    var int result = 1;
    result = prime * result + _intValue;
    //result = prime * result + (int) (Double.doubleToLongBits(_realValue) ^ (Double.doubleToLongBits(_realValue) >>> 32));
    result = prime * result + _charValue;
    //result = prime * result + ((_stringValue== null) ? 0 : _stringValue.hashCode());
    //result = prime * result + (_boolValue ? 1231 : 1237);
    //result = prime * result + ((_arrayValue== null) ? 0 : _arrayValue.hashCode());
    //result = prime * result + ((_lowType== null) ? 0 : _lowType.hashCode());
    //result = prime * result + ((_highType== null) ? 0 : _highType.hashCode());
    return result;
  }
  
  override boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    var Expression other = obj as Expression;
    if (other._intValue != _intValue)
      return false;
//    if (Double.doubleToLongBits(other._realValue) != Double.doubleToLongBits(_realValue))
//      return false;
    if (other._charValue != _charValue)
      return false;
    if (_stringValue == null) {
      if (other._stringValue != null)
        return false;
    } else if (!_stringValue.equals(other._stringValue))
      return false;
    if (other._boolValue != _boolValue)
      return false;
    if (_arrayValue == null) {
      if (other._arrayValue != null)
        return false;
    } else if (!_arrayValue.equals(other._arrayValue))
      return false;
    if (_lowType == null) {
      if (other._lowType != null)
        return false;
    } else if (!_lowType.equals(other._lowType))
      return false;
    if (_highType == null) {
      if (other._highType != null)
        return false;
    } else if (!_highType.equals(other._highType))
      return false;
    return true;
  }
  
}
