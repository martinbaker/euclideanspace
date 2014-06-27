/**
 */
package com.euclideanspace.aldor.editor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.Block#getStname <em>Stname</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.Block#getStatemBl <em>Statem Bl</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.aldor.editor.EditorPackage#getBlock()
 * @model
 * @generated
 */
public interface Block extends EObject
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
   * @see com.euclideanspace.aldor.editor.EditorPackage#getBlock_Stname()
   * @model
   * @generated
   */
  String getStname();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.Block#getStname <em>Stname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stname</em>' attribute.
   * @see #getStname()
   * @generated
   */
  void setStname(String value);

  /**
   * Returns the value of the '<em><b>Statem Bl</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.aldor.editor.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statem Bl</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statem Bl</em>' containment reference list.
   * @see com.euclideanspace.aldor.editor.EditorPackage#getBlock_StatemBl()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getStatemBl();

} // Block
