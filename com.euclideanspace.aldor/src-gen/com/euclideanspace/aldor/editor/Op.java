/**
 */
package com.euclideanspace.aldor.editor;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Op</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.Op#getAop <em>Aop</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.aldor.editor.EditorPackage#getOp()
 * @model
 * @generated
 */
public interface Op extends Expr
{
  /**
   * Returns the value of the '<em><b>Aop</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Aop</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Aop</em>' containment reference.
   * @see #setAop(EObject)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getOp_Aop()
   * @model containment="true"
   * @generated
   */
  EObject getAop();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.Op#getAop <em>Aop</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Aop</em>' containment reference.
   * @see #getAop()
   * @generated
   */
  void setAop(EObject value);

} // Op
