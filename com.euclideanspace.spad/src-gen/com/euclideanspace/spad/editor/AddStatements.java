/**
 */
package com.euclideanspace.spad.editor;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add Statements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.spad.editor.AddStatements#getT1 <em>T1</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.AddStatements#getT13 <em>T13</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.spad.editor.EditorPackage#getAddStatements()
 * @model
 * @generated
 */
public interface AddStatements extends EObject
{
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
   * @see com.euclideanspace.spad.editor.EditorPackage#getAddStatements_T1()
   * @model containment="true"
   * @generated
   */
  Expr getT1();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.AddStatements#getT1 <em>T1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T1</em>' containment reference.
   * @see #getT1()
   * @generated
   */
  void setT1(Expr value);

  /**
   * Returns the value of the '<em><b>T13</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T13</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T13</em>' containment reference.
   * @see #setT13(FunctionDefinitionBlock)
   * @see com.euclideanspace.spad.editor.EditorPackage#getAddStatements_T13()
   * @model containment="true"
   * @generated
   */
  FunctionDefinitionBlock getT13();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.AddStatements#getT13 <em>T13</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T13</em>' containment reference.
   * @see #getT13()
   * @generated
   */
  void setT13(FunctionDefinitionBlock value);

} // AddStatements
