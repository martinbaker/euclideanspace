/**
 */
package com.euclideanspace.spad.editor;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Else Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.spad.editor.IfElseStatement#getS2 <em>S2</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.spad.editor.EditorPackage#getIfElseStatement()
 * @model
 * @generated
 */
public interface IfElseStatement extends EObject
{
  /**
   * Returns the value of the '<em><b>S2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>S2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>S2</em>' containment reference.
   * @see #setS2(Statement)
   * @see com.euclideanspace.spad.editor.EditorPackage#getIfElseStatement_S2()
   * @model containment="true"
   * @generated
   */
  Statement getS2();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.IfElseStatement#getS2 <em>S2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>S2</em>' containment reference.
   * @see #getS2()
   * @generated
   */
  void setS2(Statement value);

} // IfElseStatement
