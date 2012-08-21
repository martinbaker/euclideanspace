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

public class Real implements Field,Domain{
	
	val TypeExpression rep=new TypeExpression(TYPE::REAL);

    override TypeExpression getRep(){
    	rep
    }
    
	def Expression real(double d){
		return new RealEx(d,this);
	}

	/**
	 * virtual function to add two fields together, I have used the name
	 * operator_plus to give the possibility of using infix notation in
	 * the future but this only works like this:
	 * a.operator_plus(b) not in a static form as at present.
	 * 
     * this overrides Field.operator_plus but its only useful
     * if operands are both RealEx.
     * 
     * We therefore have some ugly code to test type of operands
     * It would be cleaner to use dispatch methods to do this
     * but I can't work out how to do this.
     * 
	 * @param a
	 * @param b
	 * @return
     */
 	override operator_plus(Expression a,Expression b){
 		if (a instanceof RealEx && b instanceof RealEx) 
		  return operator_plus(a as RealEx,b as RealEx);
		println("Real.plus must have real operands")
		return null
	}

	def operator_plus(RealEx a,RealEx b){
		return new RealEx(a.realValue+b.realValue,this);
	}

    /**
	 * virtual function to multiply two fields together, I have used the name
	 * operator_plus to give the possibility of using infix notation in
	 * the future but this only works like this:
	 * a.operator_plus(b) not in a static form as at present.
	 * 
     * this overrides Field.operator_multiply but its only useful
     * if operands are both RealEx.
     * 
     * We therefore have some ugly code to test type of operands
     * It would be cleaner to use dispatch methods to do this
     * but I can't work out how to do this.
     * 
	 * @param a
	 * @param b
	 * @return
     */
	override operator_multiply(Expression a,Expression b){
 		if (a instanceof RealEx && b instanceof RealEx) 
		  return operator_multiply(a as RealEx,b as RealEx);
		println("Real.multiply must have real operands")
		return null
	}

	def operator_multiply(RealEx a,RealEx b){
		return new RealEx(a.realValue*b.realValue,this);
	}

	def double coerce(RealEx a){
		return a.realValue;
	}
}
