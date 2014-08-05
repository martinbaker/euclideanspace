/**
 */
package com.euclideanspace.aldor.editor;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.Name#getName <em>Name</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.Name#getNo <em>No</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.aldor.editor.EditorPackage#getName_()
 * @model
 * @generated
 */
public interface Name extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(Id)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getName_Name()
   * @model containment="true"
   * @generated
   */
  Id getName();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.Name#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(Id value);

  /**
   * Returns the value of the '<em><b>No</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>No</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>No</em>' containment reference.
   * @see #setNo(NakedOp)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getName_No()
   * @model containment="true"
   * @generated
   */
  NakedOp getNo();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.Name#getNo <em>No</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>No</em>' containment reference.
   * @see #getNo()
   * @generated
   */
  void setNo(NakedOp value);

} // Name
