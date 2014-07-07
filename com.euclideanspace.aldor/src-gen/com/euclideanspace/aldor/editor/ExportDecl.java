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
   * Returns the value of the '<em><b>Tp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tp</em>' containment reference.
   * @see #setTp(ToPart)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getExportDecl_Tp()
   * @model containment="true"
   * @generated
   */
  ToPart getTp();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.ExportDecl#getTp <em>Tp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tp</em>' containment reference.
   * @see #getTp()
   * @generated
   */
  void setTp(ToPart value);

} // ExportDecl
