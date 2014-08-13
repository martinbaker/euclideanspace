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

package com.euclideanspace.mathbase

import java.util.List

public class Vect implements Domain {
	
	val Field te;
    val int dimen;
	var List<TypeExpression> rep1
	var TypeExpression rep
    
	new(Field t,int d){
		te=t
		dimen =d
	    rep1=newArrayList(te.getRep())
	    rep=new TypeExpression(TYPE::RECORD,rep1);
	}

    override TypeExpression getRep(){
    	rep
    }
    
    /**
     * constructs a compound expression from a list of expressions
     * representing the elements.
     * 
     * How can we ensure these elements are of type 'te' which is 'Field'
     */
	def Expression vect(Expression[] xs){
		return new Expression(xs,this);
	}

	def Expression operator_plus(Expression a,Expression b){
	  var List<Expression> elements = null;
	  try {
	  	for(int i: 0..(dimen-1)) {
			var Expression element = te.operator_plus(a.elt(i),b.elt(i))
			if (elements == null) elements = newArrayList(element)
			else elements.add(element)
		}
	  } catch (Exception e) {
	      println("Vect.add error="+e)
	  }
	  return new Expression(elements,this);
	}

	def Expression operator_multiply(Expression a,Expression b){
		return new Expression(a.intValue*b.intValue,this);
	}

	def Expression[] coerce(Expression a){
		return a.arrayValue;
	}
}
