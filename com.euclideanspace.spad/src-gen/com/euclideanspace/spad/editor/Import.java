/**
 */
package com.euclideanspace.spad.editor;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.spad.editor.Import#getImpname <em>Impname</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.spad.editor.EditorPackage#getImport()
 * @model
 * @generated
 */
public interface Import extends EObject
{
  /**
   * Returns the value of the '<em><b>Impname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Impname</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Impname</em>' attribute.
   * @see #setImpname(String)
   * @see com.euclideanspace.spad.editor.EditorPackage#getImport_Impname()
   * @model
   * @generated
   */
  String getImpname();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.Import#getImpname <em>Impname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Impname</em>' attribute.
   * @see #getImpname()
   * @generated
   */
  void setImpname(String value);

} // Import
