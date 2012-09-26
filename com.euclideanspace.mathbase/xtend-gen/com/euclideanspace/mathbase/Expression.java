package com.euclideanspace.mathbase;

import com.euclideanspace.mathbase.Domain;
import com.euclideanspace.mathbase.TYPE;
import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;

/**
 * Expression has two 'types'.
 * A low level 'type' just describes what type of data this holds
 * A high level 'type' describes what it represents.
 * For example a symbolic integer is held as a string at low level but
 * at high level that sting represents an integer.
 * 
 * @Data causes all getters and setters to be generated
 */
@SuppressWarnings("all")
public class Expression {
  private int _intValue;
  
  public int getIntValue() {
    return this._intValue;
  }
  
  public void setIntValue(final int intValue) {
    this._intValue = intValue;
  }
  
  private double _realValue;
  
  public double getRealValue() {
    return this._realValue;
  }
  
  public void setRealValue(final double realValue) {
    this._realValue = realValue;
  }
  
  private char _charValue;
  
  public char getCharValue() {
    return this._charValue;
  }
  
  public void setCharValue(final char charValue) {
    this._charValue = charValue;
  }
  
  private String _stringValue;
  
  public String getStringValue() {
    return this._stringValue;
  }
  
  public void setStringValue(final String stringValue) {
    this._stringValue = stringValue;
  }
  
  private boolean _boolValue;
  
  public boolean isBoolValue() {
    return this._boolValue;
  }
  
  public void setBoolValue(final boolean boolValue) {
    this._boolValue = boolValue;
  }
  
  private Expression[] _arrayValue;
  
  public Expression[] getArrayValue() {
    return this._arrayValue;
  }
  
  public void setArrayValue(final Expression[] arrayValue) {
    this._arrayValue = arrayValue;
  }
  
  private TYPE _lowType;
  
  public TYPE getLowType() {
    return this._lowType;
  }
  
  public void setLowType(final TYPE lowType) {
    this._lowType = lowType;
  }
  
  private Domain _highType;
  
  public Domain getHighType() {
    return this._highType;
  }
  
  public void setHighType(final Domain highType) {
    this._highType = highType;
  }
  
  /**
   * construct expression containing int value
   */
  public Expression(final int i, final Domain ht) {
    this._intValue = i;
    this._realValue = 0.0;
    char _charAt = ".".charAt(0);
    this._charValue = _charAt;
    this._stringValue = "";
    this._boolValue = false;
    this._arrayValue = null;
    this._lowType = TYPE.INT;
    this._highType = ht;
  }
  
  /**
   * construct expression containing real(float) value
   */
  public Expression(final double x, final Domain ht) {
    this._intValue = 0;
    this._realValue = x;
    char _charAt = ".".charAt(0);
    this._charValue = _charAt;
    this._stringValue = "";
    this._boolValue = false;
    this._arrayValue = null;
    this._lowType = TYPE.REAL;
    this._highType = ht;
  }
  
  /**
   * construct expression containing char value
   */
  public Expression(final char c, final Domain ht) {
    this._intValue = 0;
    this._realValue = 0.0;
    this._charValue = c;
    this._stringValue = "";
    this._boolValue = false;
    this._arrayValue = null;
    this._lowType = TYPE.CHAR;
    this._highType = ht;
  }
  
  /**
   * construct expression containing string value
   */
  public Expression(final String s, final Domain ht) {
    this._intValue = 0;
    this._realValue = 0.0;
    char _charAt = ".".charAt(0);
    this._charValue = _charAt;
    this._stringValue = s;
    this._boolValue = false;
    this._arrayValue = null;
    this._lowType = TYPE.STRING;
    this._highType = ht;
  }
  
  /**
   * construct expression containing boolean value
   */
  public Expression(final boolean b, final Domain ht) {
    this._intValue = 0;
    this._realValue = 0.0;
    char _charAt = ".".charAt(0);
    this._charValue = _charAt;
    this._stringValue = "";
    this._boolValue = b;
    this._arrayValue = null;
    this._lowType = TYPE.BOOL;
    this._highType = ht;
  }
  
  /**
   * construct expression containing compound value
   */
  public Expression(final Expression[] e, final Domain ht) {
    this._intValue = 0;
    this._realValue = 0.0;
    char _charAt = ".".charAt(0);
    this._charValue = _charAt;
    this._stringValue = "";
    this._boolValue = false;
    this._arrayValue = e;
    this._lowType = TYPE.FUNCT;
    this._highType = ht;
  }
  
  /**
   * construct a function
   * or for some functions/operands we may apply the function
   */
  public Expression(final String s, final Expression a, final Expression b) {
    boolean _and = false;
    boolean _isNumeric = a.isNumeric();
    if (!_isNumeric) {
      _and = false;
    } else {
      boolean _isNumeric_1 = b.isNumeric();
      _and = (_isNumeric && _isNumeric_1);
    }
    if (_and) {
      int _intValue = a.getIntValue();
      int _intValue_1 = b.getIntValue();
      int _plus = (_intValue + _intValue_1);
      this._intValue = _plus;
      double _realValue = a.getRealValue();
      double _realValue_1 = b.getRealValue();
      double _plus_1 = (_realValue + _realValue_1);
      this._realValue = _plus_1;
      this._arrayValue = null;
      this._stringValue = "";
    } else {
      this._intValue = 0;
      this._realValue = 0.0;
      ArrayList<Expression> _newArrayList = CollectionLiterals.<Expression>newArrayList(a, b);
      this._arrayValue = ((Expression[])Conversions.unwrapArray(_newArrayList, Expression.class));
      this._stringValue = s;
    }
    char _charAt = ".".charAt(0);
    this._charValue = _charAt;
    this._boolValue = false;
    this._lowType = TYPE.INT;
    Domain _highType = a.getHighType();
    this._highType = _highType;
  }
  
  public boolean isNumeric() {
    boolean _xblockexpression = false;
    {
      String _stringValue = this.getStringValue();
      boolean _equals = Objects.equal(_stringValue, null);
      if (_equals) {
        return true;
      }
      String _stringValue_1 = this.getStringValue();
      boolean _equals_1 = _stringValue_1.equals("");
      _xblockexpression = (_equals_1);
    }
    return _xblockexpression;
  }
  
  public Expression elt(final int i) {
    Expression _xblockexpression = null;
    {
      Expression[] _arrayValue = this.getArrayValue();
      boolean _equals = Objects.equal(_arrayValue, null);
      if (_equals) {
        return null;
      }
      Expression[] _arrayValue_1 = this.getArrayValue();
      Expression _get = ((List<Expression>)Conversions.doWrapArray(_arrayValue_1)).get(i);
      _xblockexpression = (_get);
    }
    return _xblockexpression;
  }
  
  public String stringArray() {
    String _xblockexpression = null;
    {
      String _stringValue = this.getStringValue();
      String strVal = (_stringValue + "(");
      boolean follow = false;
      Expression[] _arrayValue = this.getArrayValue();
      for (final Expression a : _arrayValue) {
        {
          if (follow) {
            String _plus = (strVal + ",");
            strVal = _plus;
          }
          String _plus_1 = (strVal + a);
          strVal = _plus_1;
          follow = true;
        }
      }
      String _plus = (strVal + ")");
      _xblockexpression = (_plus);
    }
    return _xblockexpression;
  }
  
  public String toString() {
    String _xblockexpression = null;
    {
      String _stringValue = this.getStringValue();
      boolean _notEquals = (!Objects.equal(_stringValue, null));
      if (_notEquals) {
        String _stringValue_1 = this.getStringValue();
        boolean _equals = _stringValue_1.equals("");
        boolean _not = (!_equals);
        if (_not) {
          Expression[] _arrayValue = this.getArrayValue();
          boolean _equals_1 = Objects.equal(_arrayValue, null);
          if (_equals_1) {
            return this.getStringValue();
          }
          String _stringValue_2 = this.getStringValue();
          String _stringArray = this.stringArray();
          return (_stringValue_2 + _stringArray);
        }
      }
      String _switchResult = null;
      TYPE _lowType = this.getLowType();
      final TYPE getLowType = _lowType;
      boolean _matched = false;
      if (!_matched) {
        if (Objects.equal(getLowType,TYPE.INT)) {
          _matched=true;
          int _intValue = this.getIntValue();
          String _plus = ("" + Integer.valueOf(_intValue));
          _switchResult = _plus;
        }
      }
      if (!_matched) {
        if (Objects.equal(getLowType,TYPE.REAL)) {
          _matched=true;
          double _realValue = this.getRealValue();
          String _plus_1 = ("" + Double.valueOf(_realValue));
          _switchResult = _plus_1;
        }
      }
      if (!_matched) {
        if (Objects.equal(getLowType,TYPE.CHAR)) {
          _matched=true;
          char _charValue = this.getCharValue();
          String _plus_2 = ("" + Character.valueOf(_charValue));
          _switchResult = _plus_2;
        }
      }
      if (!_matched) {
        if (Objects.equal(getLowType,TYPE.STRING)) {
          _matched=true;
          String _stringValue_3 = this.getStringValue();
          _switchResult = _stringValue_3;
        }
      }
      if (!_matched) {
        if (Objects.equal(getLowType,TYPE.BOOL)) {
          _matched=true;
          boolean _isBoolValue = this.isBoolValue();
          String _plus_3 = ("" + Boolean.valueOf(_isBoolValue));
          _switchResult = _plus_3;
        }
      }
      if (!_matched) {
        if (Objects.equal(getLowType,TYPE.SYMBOL)) {
          _matched=true;
          String _stringValue_4 = this.getStringValue();
          String _plus_4 = ("" + _stringValue_4);
          _switchResult = _plus_4;
        }
      }
      if (!_matched) {
        if (Objects.equal(getLowType,TYPE.FUNCT)) {
          _matched=true;
          String _stringArray_1 = this.stringArray();
          String _plus_5 = ("" + _stringArray_1);
          _switchResult = _plus_5;
        }
      }
      if (!_matched) {
        if (Objects.equal(getLowType,TYPE.RECORD)) {
          _matched=true;
          String _stringArray_2 = this.stringArray();
          String _plus_6 = ("" + _stringArray_2);
          _switchResult = _plus_6;
        }
      }
      if (!_matched) {
        if (Objects.equal(getLowType,TYPE.UNION)) {
          _matched=true;
          String _stringArray_3 = this.stringArray();
          String _plus_7 = ("" + _stringArray_3);
          _switchResult = _plus_7;
        }
      }
      if (!_matched) {
        if (Objects.equal(getLowType,TYPE.SELF)) {
          _matched=true;
          _switchResult = "*";
        }
      }
      if (!_matched) {
        _switchResult = "error";
      }
      _xblockexpression = (_switchResult);
    }
    return _xblockexpression;
  }
  
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    int _multiply = (prime * result);
    int _plus = (_multiply + this._intValue);
    result = _plus;
    int _multiply_1 = (prime * result);
    int _plus_1 = (_multiply_1 + this._charValue);
    result = _plus_1;
    return result;
  }
  
  public boolean equals(final Object obj) {
    boolean _equals = Objects.equal(this, obj);
    if (_equals) {
      return true;
    }
    boolean _equals_1 = Objects.equal(obj, null);
    if (_equals_1) {
      return false;
    }
    Class<? extends Object> _class = this.getClass();
    Class<? extends Object> _class_1 = obj.getClass();
    boolean _notEquals = (!Objects.equal(_class, _class_1));
    if (_notEquals) {
      return false;
    }
    Expression other = ((Expression) obj);
    boolean _notEquals_1 = (other._intValue != this._intValue);
    if (_notEquals_1) {
      return false;
    }
    boolean _notEquals_2 = (other._charValue != this._charValue);
    if (_notEquals_2) {
      return false;
    }
    boolean _equals_2 = Objects.equal(this._stringValue, null);
    if (_equals_2) {
      boolean _notEquals_3 = (!Objects.equal(other._stringValue, null));
      if (_notEquals_3) {
        return false;
      }
    } else {
      boolean _equals_3 = this._stringValue.equals(other._stringValue);
      boolean _not = (!_equals_3);
      if (_not) {
        return false;
      }
    }
    boolean _notEquals_4 = (other._boolValue != this._boolValue);
    if (_notEquals_4) {
      return false;
    }
    boolean _equals_4 = Objects.equal(this._arrayValue, null);
    if (_equals_4) {
      boolean _notEquals_5 = (!Objects.equal(other._arrayValue, null));
      if (_notEquals_5) {
        return false;
      }
    } else {
      boolean _equals_5 = ((List<Expression>)Conversions.doWrapArray(this._arrayValue)).equals(other._arrayValue);
      boolean _not_1 = (!_equals_5);
      if (_not_1) {
        return false;
      }
    }
    boolean _equals_6 = Objects.equal(this._lowType, null);
    if (_equals_6) {
      boolean _notEquals_6 = (!Objects.equal(other._lowType, null));
      if (_notEquals_6) {
        return false;
      }
    } else {
      boolean _equals_7 = this._lowType.equals(other._lowType);
      boolean _not_2 = (!_equals_7);
      if (_not_2) {
        return false;
      }
    }
    boolean _equals_8 = Objects.equal(this._highType, null);
    if (_equals_8) {
      boolean _notEquals_7 = (!Objects.equal(other._highType, null));
      if (_notEquals_7) {
        return false;
      }
    } else {
      boolean _equals_9 = this._highType.equals(other._highType);
      boolean _not_3 = (!_equals_9);
      if (_not_3) {
        return false;
      }
    }
    return true;
  }
}
