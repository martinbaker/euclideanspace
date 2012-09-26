package com.euclideanspace.mathbase;

import com.euclideanspace.mathbase.Domain;
import com.euclideanspace.mathbase.Expression;

/**
 * FieldEx has two 'types'.
 * A low level 'type' just describes what type of data this holds
 * A high level 'type' describes what it represents.
 * For example a symbolic integer is held as a string at low level but
 * at high level that sting represents an integer.
 * 
 * @Data causes all getters and setters to be generated
 */
@SuppressWarnings("all")
public class FieldEx extends Expression {
  /**
   * construct FieldEx containing real(float) value
   */
  public FieldEx(final double x, final Domain ht) {
    super(x, ht);
  }
  
  /**
   * construct FieldEx containing string value
   */
  public FieldEx(final String s, final Domain ht) {
    super(s, ht);
  }
}
