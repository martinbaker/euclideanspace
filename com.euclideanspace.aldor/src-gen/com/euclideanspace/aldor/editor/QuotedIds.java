/**
 */
package com.euclideanspace.aldor.editor;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quoted Ids</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.QuotedIds#getN <em>N</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.aldor.editor.EditorPackage#getQuotedIds()
 * @model
 * @generated
 */
public interface QuotedIds extends Enclosure
{
  /**
   * Returns the value of the '<em><b>N</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>N</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>N</em>' containment reference.
   * @see #setN(Names)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getQuotedIds_N()
   * @model containment="true"
   * @generated
   */
  Names getN();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.QuotedIds#getN <em>N</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>N</em>' containment reference.
   * @see #getN()
   * @generated
   */
  void setN(Names value);

} // QuotedIds
