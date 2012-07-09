/**
 */
package com.euclideanspace.euclid.editor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmTypeReference;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.euclid.editor.Reference#getRefname <em>Refname</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.editor.Reference#getType <em>Type</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.editor.Reference#getRefs <em>Refs</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.euclid.editor.EditorPackage#getReference()
 * @model
 * @generated
 */
public interface Reference extends EObject
{
  /**
   * Returns the value of the '<em><b>Refname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Refname</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Refname</em>' attribute.
   * @see #setRefname(String)
   * @see com.euclideanspace.euclid.editor.EditorPackage#getReference_Refname()
   * @model
   * @generated
   */
  String getRefname();

  /**
   * Sets the value of the '{@link com.euclideanspace.euclid.editor.Reference#getRefname <em>Refname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Refname</em>' attribute.
   * @see #getRefname()
   * @generated
   */
  void setRefname(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(JvmTypeReference)
   * @see com.euclideanspace.euclid.editor.EditorPackage#getReference_Type()
   * @model containment="true"
   * @generated
   */
  JvmTypeReference getType();

  /**
   * Sets the value of the '{@link com.euclideanspace.euclid.editor.Reference#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(JvmTypeReference value);

  /**
   * Returns the value of the '<em><b>Refs</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.xbase.XExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Refs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Refs</em>' containment reference list.
   * @see com.euclideanspace.euclid.editor.EditorPackage#getReference_Refs()
   * @model containment="true"
   * @generated
   */
  EList<XExpression> getRefs();

} // Reference
