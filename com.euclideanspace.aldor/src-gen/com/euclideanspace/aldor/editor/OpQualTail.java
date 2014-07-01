/**
 */
package com.euclideanspace.aldor.editor;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Op Qual Tail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.OpQualTail#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.aldor.editor.EditorPackage#getOpQualTail()
 * @model
 * @generated
 */
public interface OpQualTail extends QualOp_ArrowTok, QualOp_LatticeTok, QualOp_RelationTok, QualOp_SegTok, QualOp_PlusTok, QualOp_QuotientTok, QualOp_TimesTok, QualOp_PowerTok
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(Molecule)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getOpQualTail_Name()
   * @model containment="true"
   * @generated
   */
  Molecule getName();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.OpQualTail#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(Molecule value);

} // OpQualTail
