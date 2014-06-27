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
import com.euclideanspace.mathbase.Field;
import com.euclideanspace.mathbase.TYPE;
import com.euclideanspace.mathbase.TypeExpression;
import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IntegerRange;

@SuppressWarnings("all")
public class Vect implements Domain {
  private final Field te;
  
  private final int dimen;
  
  private List<TypeExpression> rep1;
  
  private TypeExpression rep;
  
  public Vect(final Field t, final int d) {
    this.te = t;
    this.dimen = d;
    TypeExpression _rep = this.te.getRep();
    ArrayList<TypeExpression> _newArrayList = CollectionLiterals.<TypeExpression>newArrayList(_rep);
    this.rep1 = _newArrayList;
    TypeExpression _typeExpression = new TypeExpression(TYPE.RECORD, ((TypeExpression[])Conversions.unwrapArray(this.rep1, TypeExpression.class)));
    this.rep = _typeExpression;
  }
  
  public TypeExpression getRep() {
    return this.rep;
  }
  
  /**
   * constructs a compound expression from a list of expressions
   * representing the elements.
   * 
   * How can we ensure these elements are of type 'te' which is 'Field'
   */
  public Expression vect(final Expression[] xs) {
    return new Expression(xs, this);
  }
  
  public Expression operator_plus(final Expression a, final Expression b) {
    List<Expression> elements = null;
    try {
      IntegerRange _upTo = new IntegerRange(0, (this.dimen - 1));
      for (final int i : _upTo) {
        {
          Expression _elt = a.elt(i);
          Expression _elt_1 = b.elt(i);
          Expression element = this.te.operator_plus(_elt, _elt_1);
          boolean _equals = Objects.equal(elements, null);
          if (_equals) {
            ArrayList<Expression> _newArrayList = CollectionLiterals.<Expression>newArrayList(element);
            elements = _newArrayList;
          } else {
            elements.add(element);
          }
        }
      }
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception e = (Exception)_t;
        InputOutput.<String>println(("Vect.add error=" + e));
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    final List<Expression> _converted_elements = (List<Expression>)elements;
    return new Expression(((Expression[])Conversions.unwrapArray(_converted_elements, Expression.class)), this);
  }
  
  public Expression operator_multiply(final Expression a, final Expression b) {
    int _intValue = a.getIntValue();
    int _intValue_1 = b.getIntValue();
    int _multiply = (_intValue * _intValue_1);
    return new Expression(_multiply, this);
  }
  
  public Expression[] coerce(final Expression a) {
    return a.getArrayValue();
  }
}
