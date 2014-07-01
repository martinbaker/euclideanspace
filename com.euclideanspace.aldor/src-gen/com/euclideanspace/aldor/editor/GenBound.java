/**
 */
package com.euclideanspace.aldor.editor;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Bound</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.GenBound#getBas4 <em>Bas4</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.GenBound#getBbs5 <em>Bbs5</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.aldor.editor.EditorPackage#getGenBound()
 * @model
 * @generated
 */
public interface GenBound extends Flow_AnyStatement, Flow_BalStatement
{
  /**
   * Returns the value of the '<em><b>Bas4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bas4</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bas4</em>' containment reference.
   * @see #setBas4(Binding_AnyStatement)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getGenBound_Bas4()
   * @model containment="true"
   * @generated
   */
  Binding_AnyStatement getBas4();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.GenBound#getBas4 <em>Bas4</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bas4</em>' containment reference.
   * @see #getBas4()
   * @generated
   */
  void setBas4(Binding_AnyStatement value);

  /**
   * Returns the value of the '<em><b>Bbs5</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bbs5</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bbs5</em>' containment reference.
   * @see #setBbs5(Binding_BalStatement)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getGenBound_Bbs5()
   * @model containment="true"
   * @generated
   */
  Binding_BalStatement getBbs5();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.GenBound#getBbs5 <em>Bbs5</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bbs5</em>' containment reference.
   * @see #getBbs5()
   * @generated
   */
  void setBbs5(Binding_BalStatement value);

} // GenBound
