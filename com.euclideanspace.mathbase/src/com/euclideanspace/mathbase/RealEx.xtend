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
 * RealEx has two 'types'.
 * A low level 'type' just describes what type of data this holds
 * A high level 'type' describes what it represents.
 * For example a symbolic integer is held as a string at low level but
 * at high level that sting represents an integer.
 * 
 * @Data causes all getters and setters to be generated
 */
class RealEx extends FieldEx{

	@Property double realValue
    
    /*
     * construct RealEx containing real(float) value
     */
 	new(double x,Domain ht) {
 		super(x,ht)
		_realValue=x;
	}


    /*
     * construct RealEx containing string value
     */
 	new(String s,Domain ht) {
 		super(s,ht)
	}

 override String toString() {
 	// first check for function or symbolic value 
 	if (stringValue != null) if (! stringValue.equals("")) {
 		if (arrayValue == null) return stringValue;
 	 	return stringValue+stringArray();
 	}
 	switch lowType {
 		case TYPE::REAL: ""+realValue
 		case TYPE::STRING: stringValue
 		default: "error"
 	}
  }
  

  override int hashCode() {
    val int prime = 31;
    var int result = 1;
    //result = prime * result + (int) (Double.doubleToLongBits(_realValue) ^ (Double.doubleToLongBits(_realValue) >>> 32));
    //result = prime * result + ((_stringValue== null) ? 0 : _stringValue.hashCode());
    return result;
  }
  
  override boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    var RealEx other = obj as RealEx;
//    if (Double.doubleToLongBits(other._realValue) != Double.doubleToLongBits(_realValue))
//      return false;
//    if (_stringValue == null) {
//      if (other._stringValue != null)
//        return false;
//    } else if (!_stringValue.equals(other._stringValue))
//      return false;
    return true;
  }
  
}
