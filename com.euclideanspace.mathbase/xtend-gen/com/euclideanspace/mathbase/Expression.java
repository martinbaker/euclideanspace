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
import com.euclideanspace.mathbase.TYPE;
import com.google.common.base.Objects;
import java.util.ArrayList;
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
      _and = _isNumeric_1;
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
      _xblockexpression = _stringValue_1.equals("");
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
      _xblockexpression = _arrayValue_1[i];
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
            strVal = (strVal + ",");
          }
          strVal = (strVal + a);
          follow = true;
        }
      }
      _xblockexpression = (strVal + ")");
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
      if (_lowType != null) {
        switch (_lowType) {
          case INT:
            int _intValue = this.getIntValue();
            _switchResult = ("" + Integer.valueOf(_intValue));
            break;
          case REAL:
            double _realValue = this.getRealValue();
            _switchResult = ("" + Double.valueOf(_realValue));
            break;
          case CHAR:
            char _charValue = this.getCharValue();
            _switchResult = ("" + Character.valueOf(_charValue));
            break;
          case STRING:
            _switchResult = this.getStringValue();
            break;
          case BOOL:
            boolean _isBoolValue = this.isBoolValue();
            _switchResult = ("" + Boolean.valueOf(_isBoolValue));
            break;
          case SYMBOL:
            String _stringValue_3 = this.getStringValue();
            _switchResult = ("" + _stringValue_3);
            break;
          case FUNCT:
            String _stringArray_1 = this.stringArray();
            _switchResult = ("" + _stringArray_1);
            break;
          case RECORD:
            String _stringArray_2 = this.stringArray();
            _switchResult = ("" + _stringArray_2);
            break;
          case UNION:
            String _stringArray_3 = this.stringArray();
            _switchResult = ("" + _stringArray_3);
            break;
          case SELF:
            _switchResult = "*";
            break;
          default:
            _switchResult = "error";
            break;
        }
      } else {
        _switchResult = "error";
      }
      _xblockexpression = _switchResult;
    }
    return _xblockexpression;
  }
  
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = ((prime * result) + this._intValue);
    result = ((prime * result) + this._charValue);
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
    Class<? extends Expression> _class = this.getClass();
    Class<?> _class_1 = obj.getClass();
    boolean _notEquals = (!Objects.equal(_class, _class_1));
    if (_notEquals) {
      return false;
    }
    Expression other = ((Expression) obj);
    if ((other._intValue != this._intValue)) {
      return false;
    }
    if ((other._charValue != this._charValue)) {
      return false;
    }
    boolean _equals_2 = Objects.equal(this._stringValue, null);
    if (_equals_2) {
      boolean _notEquals_1 = (!Objects.equal(other._stringValue, null));
      if (_notEquals_1) {
        return false;
      }
    } else {
      boolean _equals_3 = this._stringValue.equals(other._stringValue);
      boolean _not = (!_equals_3);
      if (_not) {
        return false;
      }
    }
    if ((other._boolValue != this._boolValue)) {
      return false;
    }
    boolean _equals_4 = Objects.equal(this._arrayValue, null);
    if (_equals_4) {
      boolean _notEquals_2 = (!Objects.equal(other._arrayValue, null));
      if (_notEquals_2) {
        return false;
      }
    } else {
      boolean _equals_5 = this._arrayValue.equals(other._arrayValue);
      boolean _not_1 = (!_equals_5);
      if (_not_1) {
        return false;
      }
    }
    boolean _equals_6 = Objects.equal(this._lowType, null);
    if (_equals_6) {
      boolean _notEquals_3 = (!Objects.equal(other._lowType, null));
      if (_notEquals_3) {
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
      boolean _notEquals_4 = (!Objects.equal(other._highType, null));
      if (_notEquals_4) {
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
