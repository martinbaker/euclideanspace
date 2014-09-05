/**
 */
package com.euclideanspace.aldor.editor;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declaration Inline</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.DeclarationInline#getSi <em>Si</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.DeclarationInline#getFp <em>Fp</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.aldor.editor.EditorPackage#getDeclarationInline()
 * @model
 * @generated
 */
public interface DeclarationInline extends Declaration
{
  /**
   * Returns the value of the '<em><b>Si</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Si</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Si</em>' containment reference.
   * @see #setSi(Sig)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getDeclarationInline_Si()
   * @model containment="true"
   * @generated
   */
  Sig getSi();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.DeclarationInline#getSi <em>Si</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Si</em>' containment reference.
   * @see #getSi()
   * @generated
   */
  void setSi(Sig value);

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
   * @see com.euclideanspace.aldor.editor.EditorPackage#getDeclarationInline_Fp()
   * @model containment="true"
   * @generated
   */
  FromPart getFp();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.DeclarationInline#getFp <em>Fp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fp</em>' containment reference.
   * @see #getFp()
   * @generated
   */
  void setFp(FromPart value);

} // DeclarationInline
