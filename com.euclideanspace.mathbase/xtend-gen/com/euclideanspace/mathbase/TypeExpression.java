package com.euclideanspace.mathbase;

import com.euclideanspace.mathbase.TYPE;
import org.eclipse.xtend.lib.Data;
import org.eclipse.xtext.xbase.lib.util.ToStringHelper;

@Data
@SuppressWarnings("all")
public class TypeExpression {
  private final TYPE _type;
  
  public TYPE getType() {
    return this._type;
  }
  
  private final TypeExpression[] _params;
  
  public TypeExpression[] getParams() {
    return this._params;
  }
  
  public TypeExpression(final TYPE t) {
    this._type = t;
    this._params = null;
  }
  
  public TypeExpression(final TYPE t, final TypeExpression[] p) {
    this._type = t;
    this._params = p;
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((_type== null) ? 0 : _type.hashCode());
    result = prime * result + ((_params== null) ? 0 : _params.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    TypeExpression other = (TypeExpression) obj;
    if (_type == null) {
      if (other._type != null)
        return false;
    } else if (!_type.equals(other._type))
      return false;
    if (_params == null) {
      if (other._params != null)
        return false;
    } else if (!_params.equals(other._params))
      return false;
    return true;
  }
  
  @Override
  public String toString() {
    String result = new ToStringHelper().toString(this);
    return result;
  }
}
