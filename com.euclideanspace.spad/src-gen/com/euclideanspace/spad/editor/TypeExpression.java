/**
 */
package com.euclideanspace.spad.editor;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.spad.editor.TypeExpression#getT2 <em>T2</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.TypeExpression#getT3 <em>T3</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.spad.editor.EditorPackage#getTypeExpression()
 * @model
 * @generated
 */
public interface TypeExpression extends EObject
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
   * @see #setT2(TypeArguments)
   * @see com.euclideanspace.spad.editor.EditorPackage#getTypeExpression_T2()
   * @model containment="true"
   * @generated
   */
  TypeArguments getT2();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.TypeExpression#getT2 <em>T2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T2</em>' containment reference.
   * @see #getT2()
   * @generated
   */
  void setT2(TypeArguments value);

  /**
   * Returns the value of the '<em><b>T3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T3</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T3</em>' containment reference.
   * @see #setT3(TypeResult)
   * @see com.euclideanspace.spad.editor.EditorPackage#getTypeExpression_T3()
   * @model containment="true"
   * @generated
   */
  TypeResult getT3();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.TypeExpression#getT3 <em>T3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T3</em>' containment reference.
   * @see #getT3()
   * @generated
   */
  void setT3(TypeResult value);

} // TypeExpression
