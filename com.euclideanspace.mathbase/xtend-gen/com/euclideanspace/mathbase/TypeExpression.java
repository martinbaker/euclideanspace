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
