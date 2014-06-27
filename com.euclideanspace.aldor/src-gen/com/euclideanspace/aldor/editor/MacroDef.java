/**
 */
package com.euclideanspace.aldor.editor;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Macro Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.MacroDef#getMacroname <em>Macroname</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.aldor.editor.EditorPackage#getMacroDef()
 * @model
 * @generated
 */
public interface MacroDef extends WhereAssignments, AddStatements
{
  /**
   * Returns the value of the '<em><b>Macroname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Macroname</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Macroname</em>' attribute.
   * @see #setMacroname(String)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getMacroDef_Macroname()
   * @model
   * @generated
   */
  String getMacroname();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.MacroDef#getMacroname <em>Macroname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Macroname</em>' attribute.
   * @see #getMacroname()
   * @generated
   */
  void setMacroname(String value);

} // MacroDef
