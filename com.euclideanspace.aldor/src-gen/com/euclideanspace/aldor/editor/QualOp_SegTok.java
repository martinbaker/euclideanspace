/**
 */
package com.euclideanspace.aldor.editor;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qual Op Seg Tok</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.QualOp_SegTok#getOqt <em>Oqt</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.aldor.editor.EditorPackage#getQualOp_SegTok()
 * @model
 * @generated
 */
public interface QualOp_SegTok extends SegOp
{
  /**
   * Returns the value of the '<em><b>Oqt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Oqt</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Oqt</em>' containment reference.
   * @see #setOqt(OpQualTail)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getQualOp_SegTok_Oqt()
   * @model containment="true"
   * @generated
   */
  OpQualTail getOqt();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.QualOp_SegTok#getOqt <em>Oqt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Oqt</em>' containment reference.
   * @see #getOqt()
   * @generated
   */
  void setOqt(OpQualTail value);

} // QualOp_SegTok
