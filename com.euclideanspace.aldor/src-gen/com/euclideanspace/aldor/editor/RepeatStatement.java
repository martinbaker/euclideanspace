/**
 */
package com.euclideanspace.aldor.editor;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repeat Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.RepeatStatement#getStname <em>Stname</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.RepeatStatement#getS1 <em>S1</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.aldor.editor.EditorPackage#getRepeatStatement()
 * @model
 * @generated
 */
public interface RepeatStatement extends EObject
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
   * @see com.euclideanspace.aldor.editor.EditorPackage#getRepeatStatement_Stname()
   * @model
   * @generated
   */
  String getStname();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.RepeatStatement#getStname <em>Stname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stname</em>' attribute.
   * @see #getStname()
   * @generated
   */
  void setStname(String value);

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
   * @see com.euclideanspace.aldor.editor.EditorPackage#getRepeatStatement_S1()
   * @model containment="true"
   * @generated
   */
  Statement getS1();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.RepeatStatement#getS1 <em>S1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>S1</em>' containment reference.
   * @see #getS1()
   * @generated
   */
  void setS1(Statement value);

} // RepeatStatement
