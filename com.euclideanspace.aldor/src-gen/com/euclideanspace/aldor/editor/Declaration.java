/**
 */
package com.euclideanspace.aldor.editor;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.Declaration#getFp <em>Fp</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.aldor.editor.EditorPackage#getDeclaration()
 * @model
 * @generated
 */
public interface Declaration extends Labeled
{
  /**
   * Returns the value of the '<em><b>Fp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fp</em>' containment reference.
   * @see #setFp(FromPart)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getDeclaration_Fp()
   * @model containment="true"
   * @generated
   */
  FromPart getFp();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.Declaration#getFp <em>Fp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fp</em>' containment reference.
   * @see #getFp()
   * @generated
   */
  void setFp(FromPart value);

} // Declaration
