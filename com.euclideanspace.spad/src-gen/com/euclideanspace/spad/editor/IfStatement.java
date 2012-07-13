/**
 */
package com.euclideanspace.spad.editor;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.spad.editor.IfStatement#getT2 <em>T2</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.IfStatement#getS1 <em>S1</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.IfStatement#getS2 <em>S2</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.spad.editor.EditorPackage#getIfStatement()
 * @model
 * @generated
 */
public interface IfStatement extends EObject
{
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
   * @see com.euclideanspace.spad.editor.EditorPackage#getIfStatement_T2()
   * @model containment="true"
   * @generated
   */
  Expr getT2();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.IfStatement#getT2 <em>T2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T2</em>' containment reference.
   * @see #getT2()
   * @generated
   */
  void setT2(Expr value);

  /**
   * Returns the value of the '<em><b>S1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>S1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>S1</em>' containment reference.
   * @see #setS1(Statement)
   * @see com.euclideanspace.spad.editor.EditorPackage#getIfStatement_S1()
   * @model containment="true"
   * @generated
   */
  Statement getS1();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.IfStatement#getS1 <em>S1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>S1</em>' containment reference.
   * @see #getS1()
   * @generated
   */
  void setS1(Statement value);

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
   * @see com.euclideanspace.spad.editor.EditorPackage#getIfStatement_S2()
   * @model containment="true"
   * @generated
   */
  Statement getS2();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.IfStatement#getS2 <em>S2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>S2</em>' containment reference.
   * @see #getS2()
   * @generated
   */
  void setS2(Statement value);

} // IfStatement
