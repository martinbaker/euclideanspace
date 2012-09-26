/**
 */
package com.euclideanspace.spad.editor;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Expression2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.spad.editor.TypeExpression2#getT92 <em>T92</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.TypeExpression2#getT93 <em>T93</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.spad.editor.EditorPackage#getTypeExpression2()
 * @model
 * @generated
 */
public interface TypeExpression2 extends EObject
{
  /**
   * Returns the value of the '<em><b>T92</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T92</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T92</em>' containment reference.
   * @see #setT92(TypeArguments)
   * @see com.euclideanspace.spad.editor.EditorPackage#getTypeExpression2_T92()
   * @model containment="true"
   * @generated
   */
  TypeArguments getT92();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.TypeExpression2#getT92 <em>T92</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T92</em>' containment reference.
   * @see #getT92()
   * @generated
   */
  void setT92(TypeArguments value);

  /**
   * Returns the value of the '<em><b>T93</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T93</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T93</em>' containment reference.
   * @see #setT93(TypeResult)
   * @see com.euclideanspace.spad.editor.EditorPackage#getTypeExpression2_T93()
   * @model containment="true"
   * @generated
   */
  TypeResult getT93();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.TypeExpression2#getT93 <em>T93</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T93</em>' containment reference.
   * @see #getT93()
   * @generated
   */
  void setT93(TypeResult value);

} // TypeExpression2
