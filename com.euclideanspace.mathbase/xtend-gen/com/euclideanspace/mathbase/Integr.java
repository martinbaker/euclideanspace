/**
 * Copyright 2012 Martin John Baker
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

import com.euclideanspace.mathbase.Domain;
import com.euclideanspace.mathbase.Expression;
import com.euclideanspace.mathbase.TYPE;
import com.euclideanspace.mathbase.TypeExpression;

@SuppressWarnings("all")
public class Integr implements Domain {
  private final TypeExpression rep = new TypeExpression(TYPE.INT);
  
  public TypeExpression getRep() {
    return this.rep;
  }
  
  /**
   * value constructor for int literal
   */
  public Expression integr(final int i) {
    return new Expression(i, this);
  }
  
  /**
   * value constructor for symbolic int
   */
  public Expression integr(final String i) {
    return new Expression(i, this);
  }
  
  public Expression add(final Expression a, final Expression b) {
    return new Expression("+", a, b);
  }
  
  public Expression multiply(final Expression a, final Expression b) {
    int _intValue = a.getIntValue();
    int _intValue_1 = b.getIntValue();
    int _multiply = (_intValue * _intValue_1);
    return new Expression(_multiply, this);
  }
  
  public int coerce(final Expression a) {
    return a.getIntValue();
  }
}
