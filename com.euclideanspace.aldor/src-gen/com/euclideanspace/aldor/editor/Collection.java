/**
 */
package com.euclideanspace.aldor.editor;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.Collection#getBas2 <em>Bas2</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.Collection#getBbs3 <em>Bbs3</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.aldor.editor.EditorPackage#getCollection()
 * @model
 * @generated
 */
public interface Collection extends BindingL_Infixed_Collection, Flow_AnyStatement, Flow_BalStatement
{
  /**
   * Returns the value of the '<em><b>Bas2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bas2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bas2</em>' containment reference.
   * @see #setBas2(Binding_AnyStatement)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getCollection_Bas2()
   * @model containment="true"
   * @generated
   */
  Binding_AnyStatement getBas2();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.Collection#getBas2 <em>Bas2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bas2</em>' containment reference.
   * @see #getBas2()
   * @generated
   */
  void setBas2(Binding_AnyStatement value);

  /**
   * Returns the value of the '<em><b>Bbs3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bbs3</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bbs3</em>' containment reference.
   * @see #setBbs3(Binding_BalStatement)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getCollection_Bbs3()
   * @model containment="true"
   * @generated
   */
  Binding_BalStatement getBbs3();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.Collection#getBbs3 <em>Bbs3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bbs3</em>' containment reference.
   * @see #getBbs3()
   * @generated
   */
  void setBbs3(Binding_BalStatement value);

} // Collection
