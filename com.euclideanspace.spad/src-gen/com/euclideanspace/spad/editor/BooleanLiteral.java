/**
 */
package com.euclideanspace.spad.editor;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.spad.editor.BooleanLiteral#getLitname <em>Litname</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.spad.editor.EditorPackage#getBooleanLiteral()
 * @model
 * @generated
 */
public interface BooleanLiteral extends Literal
{
  /**
   * Returns the value of the '<em><b>Litname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Litname</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Litname</em>' attribute.
   * @see #setLitname(String)
   * @see com.euclideanspace.spad.editor.EditorPackage#getBooleanLiteral_Litname()
   * @model
   * @generated
   */
  String getLitname();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.BooleanLiteral#getLitname <em>Litname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Litname</em>' attribute.
   * @see #getLitname()
   * @generated
   */
  void setLitname(String value);

} // BooleanLiteral
