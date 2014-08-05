/**
 */
package com.euclideanspace.aldor.editor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Names</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.Names#getFirstName <em>First Name</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.Names#getSubsequentNames <em>Subsequent Names</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.aldor.editor.EditorPackage#getNames()
 * @model
 * @generated
 */
public interface Names extends EObject
{
  /**
   * Returns the value of the '<em><b>First Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>First Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>First Name</em>' attribute.
   * @see #setFirstName(String)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getNames_FirstName()
   * @model
   * @generated
   */
  String getFirstName();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.Names#getFirstName <em>First Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>First Name</em>' attribute.
   * @see #getFirstName()
   * @generated
   */
  void setFirstName(String value);

  /**
   * Returns the value of the '<em><b>Subsequent Names</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Subsequent Names</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subsequent Names</em>' attribute list.
   * @see com.euclideanspace.aldor.editor.EditorPackage#getNames_SubsequentNames()
   * @model unique="false"
   * @generated
   */
  EList<String> getSubsequentNames();

} // Names
