/**
 */
package com.euclideanspace.aldor.editor;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declaration Define</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.DeclarationDefine#getSi <em>Si</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.aldor.editor.EditorPackage#getDeclarationDefine()
 * @model
 * @generated
 */
public interface DeclarationDefine extends Declaration
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
   * @see com.euclideanspace.aldor.editor.EditorPackage#getDeclarationDefine_Si()
   * @model containment="true"
   * @generated
   */
  Sig getSi();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.DeclarationDefine#getSi <em>Si</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Si</em>' containment reference.
   * @see #getSi()
   * @generated
   */
  void setSi(Sig value);

} // DeclarationDefine
