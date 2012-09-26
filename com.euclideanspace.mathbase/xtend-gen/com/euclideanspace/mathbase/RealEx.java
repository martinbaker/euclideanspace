package com.euclideanspace.mathbase;

import com.euclideanspace.mathbase.Domain;
import com.euclideanspace.mathbase.Expression;
import com.euclideanspace.mathbase.FieldEx;
import com.euclideanspace.mathbase.TYPE;
import com.google.common.base.Objects;

/**
 * RealEx has two 'types'.
 * A low level 'type' just describes what type of data this holds
 * A high level 'type' describes what it represents.
 * For example a symbolic integer is held as a string at low level but
 * at high level that sting represents an integer.
 * 
 * @Data causes all getters and setters to be generated
 */
@SuppressWarnings("all")
public class RealEx extends FieldEx {
  private double _realValue;
  
  public double getRealValue() {
    return this._realValue;
  }
  
  public void setRealValue(final double realValue) {
    this._realValue = realValue;
  }
  
  /**
   * construct RealEx containing real(float) value
   */
  public RealEx(final double x, final Domain ht) {
    super(x, ht);
    this._realValue = x;
  }
  
  /**
   * construct RealEx containing string value
   */
  public RealEx(final String s, final Domain ht) {
    super(s, ht);
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
        if (Objects.equal(getLowType,TYPE.REAL)) {
          _matched=true;
          double _realValue = this.getRealValue();
          String _plus = ("" + Double.valueOf(_realValue));
          _switchResult = _plus;
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
        _switchResult = "error";
      }
      _xblockexpression = (_switchResult);
    }
    return _xblockexpression;
  }
  
  public int hashCode() {
    final int prime = 31;
    int result = 1;
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
    RealEx other = ((RealEx) obj);
    return true;
  }
}
