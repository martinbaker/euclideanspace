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
 *   <li>{@link com.euclideanspace.aldor.editor.Declaration#getMb <em>Mb</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.Declaration#getSi <em>Si</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.Declaration#getFp <em>Fp</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.Declaration#getEd <em>Ed</em>}</li>
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
   * Returns the value of the '<em><b>Mb</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mb</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mb</em>' containment reference.
   * @see #setMb(MacroBody)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getDeclaration_Mb()
   * @model containment="true"
   * @generated
   */
  MacroBody getMb();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.Declaration#getMb <em>Mb</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mb</em>' containment reference.
   * @see #getMb()
   * @generated
   */
  void setMb(MacroBody value);

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
   * @see com.euclideanspace.aldor.editor.EditorPackage#getDeclaration_Si()
   * @model containment="true"
   * @generated
   */
  Sig getSi();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.Declaration#getSi <em>Si</em>}' containment reference.
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
   * @see com.euclideanspace.aldor.editor.EditorPackage#getDeclaration_Ed()
   * @model containment="true"
   * @generated
   */
  ExportDecl getEd();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.Declaration#getEd <em>Ed</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ed</em>' containment reference.
   * @see #getEd()
   * @generated
   */
  void setEd(ExportDecl value);

} // Declaration
