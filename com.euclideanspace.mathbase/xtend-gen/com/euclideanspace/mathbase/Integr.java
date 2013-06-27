package com.euclideanspace.mathbase;

import com.euclideanspace.mathbase.Domain;
import com.euclideanspace.mathbase.Expression;
import com.euclideanspace.mathbase.TYPE;
import com.euclideanspace.mathbase.TypeExpression;
import org.eclipse.xtext.xbase.lib.Functions.Function0;

@SuppressWarnings("all")
public class Integr implements Domain {
  private final TypeExpression rep = new Function0<TypeExpression>() {
    public TypeExpression apply() {
      TypeExpression _typeExpression = new TypeExpression(TYPE.INT);
      return _typeExpression;
    }
  }.apply();
  
  public TypeExpression getRep() {
    return this.rep;
  }
  
  /**
   * value constructor for int literal
   */
  public Expression integr(final int i) {
    Expression _expression = new Expression(i, this);
    return _expression;
  }
  
  /**
   * value constructor for symbolic int
   */
  public Expression integr(final String i) {
    Expression _expression = new Expression(i, this);
    return _expression;
  }
  
  public Expression add(final Expression a, final Expression b) {
    Expression _expression = new Expression("+", a, b);
    return _expression;
  }
  
  public Expression multiply(final Expression a, final Expression b) {
    int _intValue = a.getIntValue();
    int _intValue_1 = b.getIntValue();
    int _multiply = (_intValue * _intValue_1);
    Expression _expression = new Expression(_multiply, this);
    return _expression;
  }
  
  public int coerce(final Expression a) {
    return a.getIntValue();
  }
}
