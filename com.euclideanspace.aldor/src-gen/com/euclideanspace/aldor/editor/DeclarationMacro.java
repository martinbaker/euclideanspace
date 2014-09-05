/**
 */
package com.euclideanspace.aldor.editor;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declaration Macro</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.DeclarationMacro#getMb <em>Mb</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.aldor.editor.EditorPackage#getDeclarationMacro()
 * @model
 * @generated
 */
public interface DeclarationMacro extends Declaration
{
  /**
   * Returns the value of the '<em><b>Mb</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mb</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mb</em>' containment reference.
   * @see #setMb(MacroBody)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getDeclarationMacro_Mb()
   * @model containment="true"
   * @generated
   */
  MacroBody getMb();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.DeclarationMacro#getMb <em>Mb</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mb</em>' containment reference.
   * @see #getMb()
   * @generated
   */
  void setMb(MacroBody value);

} // DeclarationMacro
