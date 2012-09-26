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
    Expression _expression = new Expression(xs, this);
    return _expression;
  }
  
  public Expression operator_plus(final Expression a, final Expression b) {
    List<Expression> elements = null;
    try {
      int _minus = (this.dimen - 1);
      IntegerRange _upTo = new IntegerRange(0, _minus);
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
        String _plus = ("Vect.add error=" + e);
        InputOutput.<String>println(_plus);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    Expression _expression = new Expression(((Expression[])Conversions.unwrapArray(elements, Expression.class)), this);
    return _expression;
  }
  
  public Expression operator_multiply(final Expression a, final Expression b) {
    int _intValue = a.getIntValue();
    int _intValue_1 = b.getIntValue();
    int _multiply = (_intValue * _intValue_1);
    Expression _expression = new Expression(_multiply, this);
    return _expression;
  }
  
  public Expression[] coerce(final Expression a) {
    return a.getArrayValue();
  }
}
