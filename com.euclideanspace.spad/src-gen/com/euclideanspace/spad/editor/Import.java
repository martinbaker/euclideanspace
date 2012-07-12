/**
 */
package com.euclideanspace.spad.editor;

import org.eclipse.emf.common.util.EList;

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
public interface Import extends WhereAssignments, AddStatements
{
  /**
   * Returns the value of the '<em><b>Impname</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Impname</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Impname</em>' attribute list.
   * @see com.euclideanspace.spad.editor.EditorPackage#getImport_Impname()
   * @model unique="false"
   * @generated
   */
  EList<String> getImpname();

} // Import
