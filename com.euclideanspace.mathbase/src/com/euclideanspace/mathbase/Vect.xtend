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

public class Vect {
	
	val TypeExpression te;
    val int dimen;
    
	new(TypeExpression t,int d){
		te=t
		dimen =d
	}
	
	val List<TypeExpression> rep1=newArrayList(new TypeExpression(TYPE::INT));
	val TypeExpression rep=new TypeExpression(TYPE::RECORD,rep1);

	def Expression Vect(int i){
		return new Expression(i,rep);
	}

	def Expression add(Expression a,Expression b){
		return new Expression(a.intValue+b.intValue,rep);
	}

	def Expression multiply(Expression a,Expression b){
		return new Expression(a.intValue*b.intValue,rep);
	}

	def Expression[] coerce(Expression a){
		return a.arrayValue;
	}
}
