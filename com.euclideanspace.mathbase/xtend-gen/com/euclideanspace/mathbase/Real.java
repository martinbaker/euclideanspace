package com.euclideanspace.mathbase;

import com.euclideanspace.mathbase.Domain;
import com.euclideanspace.mathbase.Expression;
import com.euclideanspace.mathbase.Field;
import com.euclideanspace.mathbase.RealEx;
import com.euclideanspace.mathbase.TYPE;
import com.euclideanspace.mathbase.TypeExpression;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class Real implements Field, Domain {
  private final TypeExpression rep = new Function0<TypeExpression>() {
    public TypeExpression apply() {
      TypeExpression _typeExpression = new TypeExpression(TYPE.REAL);
      return _typeExpression;
    }
  }.apply();
  
  public TypeExpression getRep() {
    return this.rep;
  }
  
  public Expression real(final double d) {
    RealEx _realEx = new RealEx(d, this);
    return _realEx;
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
  public Expression operator_plus(final Expression a, final Expression b) {
    boolean _and = false;
    if (!(a instanceof RealEx)) {
      _and = false;
    } else {
      _and = ((a instanceof RealEx) && (b instanceof RealEx));
    }
    if (_and) {
      return this.operator_plus(((RealEx) a), ((RealEx) b));
    }
    InputOutput.<String>println("Real.plus must have real operands");
    return null;
  }
  
  public RealEx operator_plus(final RealEx a, final RealEx b) {
    double _realValue = a.getRealValue();
    double _realValue_1 = b.getRealValue();
    double _plus = (_realValue + _realValue_1);
    RealEx _realEx = new RealEx(_plus, this);
    return _realEx;
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
  public Expression operator_multiply(final Expression a, final Expression b) {
    boolean _and = false;
    if (!(a instanceof RealEx)) {
      _and = false;
    } else {
      _and = ((a instanceof RealEx) && (b instanceof RealEx));
    }
    if (_and) {
      return this.operator_multiply(((RealEx) a), ((RealEx) b));
    }
    InputOutput.<String>println("Real.multiply must have real operands");
    return null;
  }
  
  public RealEx operator_multiply(final RealEx a, final RealEx b) {
    double _realValue = a.getRealValue();
    double _realValue_1 = b.getRealValue();
    double _multiply = (_realValue * _realValue_1);
    RealEx _realEx = new RealEx(_multiply, this);
    return _realEx;
  }
  
  public double coerce(final RealEx a) {
    return a.getRealValue();
  }
}
