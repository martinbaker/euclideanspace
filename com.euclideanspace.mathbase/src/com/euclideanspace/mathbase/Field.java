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

public interface Field extends Catagory {
	/**
	 * virtual function to add two fields together, I have used the name
	 * operator_plus to give the possibility of using infix notation in
	 * the future but this only works like this:
	 * a.operator_plus(b) not in a static form as at present.
	 * @param a
	 * @param b
	 * @return
	 */
	public Expression operator_plus(Expression a,Expression b);
	/**
	 * virtual function to multiply two fields together, I have used the name
	 * operator_multiply to give the possibility of using infix notation in
	 * the future but this only works like this:
	 * a.operator_multiply(b) not in a static form as at present.
	 * @param a
	 * @param b
	 * @return
	 */
	public Expression operator_multiply(Expression a,Expression b);
	public TypeExpression getRep();
}
