/**
 */
package com.euclideanspace.spad.editor;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Return Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.spad.editor.ReturnStatement#getStname <em>Stname</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.ReturnStatement#getT2 <em>T2</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.spad.editor.EditorPackage#getReturnStatement()
 * @model
 * @generated
 */
public interface ReturnStatement extends EObject
{
  /**
   * Returns the value of the '<em><b>Stname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stname</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stname</em>' attribute.
   * @see #setStname(String)
   * @see com.euclideanspace.spad.editor.EditorPackage#getReturnStatement_Stname()
   * @model
   * @generated
   */
  String getStname();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.ReturnStatement#getStname <em>Stname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stname</em>' attribute.
   * @see #getStname()
   * @generated
   */
  void setStname(String value);

  /**
   * Returns the value of the '<em><b>T2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T2</em>' containment reference.
   * @see #setT2(Expr)
   * @see com.euclideanspace.spad.editor.EditorPackage#getReturnStatement_T2()
   * @model containment="true"
   * @generated
   */
  Expr getT2();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.ReturnStatement#getT2 <em>T2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T2</em>' containment reference.
   * @see #getT2()
   * @generated
   */
  void setT2(Expr value);

} // ReturnStatement
