/**
 */
package com.euclideanspace.aldor.editor;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declaration Export</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.DeclarationExport#getEd <em>Ed</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.aldor.editor.EditorPackage#getDeclarationExport()
 * @model
 * @generated
 */
public interface DeclarationExport extends Declaration
{
  /**
   * Returns the value of the '<em><b>Ed</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ed</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ed</em>' containment reference.
   * @see #setEd(ExportDecl)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getDeclarationExport_Ed()
   * @model containment="true"
   * @generated
   */
  ExportDecl getEd();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.DeclarationExport#getEd <em>Ed</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ed</em>' containment reference.
   * @see #getEd()
   * @generated
   */
  void setEd(ExportDecl value);

} // DeclarationExport
