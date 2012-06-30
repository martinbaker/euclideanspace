/**
 */
package com.euclideanspace.spad.editor;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.spad.editor.ForStatement#getStname <em>Stname</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.ForStatement#getT1 <em>T1</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.ForStatement#getS1 <em>S1</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.spad.editor.EditorPackage#getForStatement()
 * @model
 * @generated
 */
public interface ForStatement extends EObject
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
   * @see com.euclideanspace.spad.editor.EditorPackage#getForStatement_Stname()
   * @model
   * @generated
   */
  String getStname();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.ForStatement#getStname <em>Stname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stname</em>' attribute.
   * @see #getStname()
   * @generated
   */
  void setStname(String value);

  /**
   * Returns the value of the '<em><b>T1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T1</em>' containment reference.
   * @see #setT1(Expr)
   * @see com.euclideanspace.spad.editor.EditorPackage#getForStatement_T1()
   * @model containment="true"
   * @generated
   */
  Expr getT1();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.ForStatement#getT1 <em>T1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T1</em>' containment reference.
   * @see #getT1()
   * @generated
   */
  void setT1(Expr value);

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
   * @see com.euclideanspace.spad.editor.EditorPackage#getForStatement_S1()
   * @model containment="true"
   * @generated
   */
  Statement getS1();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.ForStatement#getS1 <em>S1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>S1</em>' containment reference.
   * @see #getS1()
   * @generated
   */
  void setS1(Statement value);

} // ForStatement
