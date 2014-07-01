/**
 */
package com.euclideanspace.aldor.editor;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Export Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.ExportDecl#getTp <em>Tp</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.aldor.editor.EditorPackage#getExportDecl()
 * @model
 * @generated
 */
public interface ExportDecl extends Declaration, MacroBody
{
  /**
   * Returns the value of the '<em><b>Tp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tp</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tp</em>' attribute.
   * @see #setTp(String)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getExportDecl_Tp()
   * @model
   * @generated
   */
  String getTp();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.ExportDecl#getTp <em>Tp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tp</em>' attribute.
   * @see #getTp()
   * @generated
   */
  void setTp(String value);

} // ExportDecl
