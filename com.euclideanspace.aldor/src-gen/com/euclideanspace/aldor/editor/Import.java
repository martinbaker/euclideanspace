/**
 */
package com.euclideanspace.aldor.editor;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.Import#getImpname <em>Impname</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.Import#getPar22 <em>Par22</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.aldor.editor.EditorPackage#getImport()
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
   * @see com.euclideanspace.aldor.editor.EditorPackage#getImport_Impname()
   * @model unique="false"
   * @generated
   */
  EList<String> getImpname();

  /**
   * Returns the value of the '<em><b>Par22</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.aldor.editor.TypeExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Par22</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Par22</em>' containment reference list.
   * @see com.euclideanspace.aldor.editor.EditorPackage#getImport_Par22()
   * @model containment="true"
   * @generated
   */
  EList<TypeExpression> getPar22();

} // Import
