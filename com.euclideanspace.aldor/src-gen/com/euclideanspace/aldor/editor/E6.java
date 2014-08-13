/**
 */
package com.euclideanspace.aldor.editor;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>E6</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.E6#getOp6 <em>Op6</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.E6#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.aldor.editor.EditorPackage#getE6()
 * @model
 * @generated
 */
public interface E6 extends Expr
{
  /**
   * Returns the value of the '<em><b>Op6</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.aldor.editor.PlusOp}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op6</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op6</em>' containment reference list.
   * @see com.euclideanspace.aldor.editor.EditorPackage#getE6_Op6()
   * @model containment="true"
   * @generated
   */
  EList<PlusOp> getOp6();

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Expr)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getE6_Right()
   * @model containment="true"
   * @generated
   */
  Expr getRight();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.E6#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Expr value);

} // E6
