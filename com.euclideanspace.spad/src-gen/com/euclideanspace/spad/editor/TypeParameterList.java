/**
 */
package com.euclideanspace.spad.editor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Parameter List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.spad.editor.TypeParameterList#getTyname <em>Tyname</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.TypeParameterList#getPar <em>Par</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.TypeParameterList#getPar2 <em>Par2</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.spad.editor.EditorPackage#getTypeParameterList()
 * @model
 * @generated
 */
public interface TypeParameterList extends EObject
{
  /**
   * Returns the value of the '<em><b>Tyname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tyname</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tyname</em>' attribute.
   * @see #setTyname(String)
   * @see com.euclideanspace.spad.editor.EditorPackage#getTypeParameterList_Tyname()
   * @model
   * @generated
   */
  String getTyname();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.TypeParameterList#getTyname <em>Tyname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tyname</em>' attribute.
   * @see #getTyname()
   * @generated
   */
  void setTyname(String value);

  /**
   * Returns the value of the '<em><b>Par</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Par</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Par</em>' attribute.
   * @see #setPar(String)
   * @see com.euclideanspace.spad.editor.EditorPackage#getTypeParameterList_Par()
   * @model
   * @generated
   */
  String getPar();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.TypeParameterList#getPar <em>Par</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Par</em>' attribute.
   * @see #getPar()
   * @generated
   */
  void setPar(String value);

  /**
   * Returns the value of the '<em><b>Par2</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Par2</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Par2</em>' attribute list.
   * @see com.euclideanspace.spad.editor.EditorPackage#getTypeParameterList_Par2()
   * @model unique="false"
   * @generated
   */
  EList<String> getPar2();

} // TypeParameterList
