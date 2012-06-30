/**
 */
package com.euclideanspace.spad.editor;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Predicate Not</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.spad.editor.PredicateNot#getT2 <em>T2</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.spad.editor.EditorPackage#getPredicateNot()
 * @model
 * @generated
 */
public interface PredicateNot extends Predicate
{
  /**
   * Returns the value of the '<em><b>T2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T2</em>' containment reference.
   * @see #setT2(PredicatePrimary)
   * @see com.euclideanspace.spad.editor.EditorPackage#getPredicateNot_T2()
   * @model containment="true"
   * @generated
   */
  PredicatePrimary getT2();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.PredicateNot#getT2 <em>T2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T2</em>' containment reference.
   * @see #getT2()
   * @generated
   */
  void setT2(PredicatePrimary value);

} // PredicateNot
