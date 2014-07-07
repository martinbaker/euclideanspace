/**
 */
package com.euclideanspace.aldor.editor;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comma Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.CommaItem#getBas <em>Bas</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.CommaItem#getBbs <em>Bbs</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.CommaItem#getBbs2 <em>Bbs2</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.CommaItem#getCi <em>Ci</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.aldor.editor.EditorPackage#getCommaItem()
 * @model
 * @generated
 */
public interface CommaItem extends AnyStatement, Flow_AnyStatement, Flow_BalStatement, GenBound, enlister1_CommaItem_Comma
{
  /**
   * Returns the value of the '<em><b>Bas</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bas</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bas</em>' containment reference.
   * @see #setBas(Binding_AnyStatement)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getCommaItem_Bas()
   * @model containment="true"
   * @generated
   */
  Binding_AnyStatement getBas();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.CommaItem#getBas <em>Bas</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bas</em>' containment reference.
   * @see #getBas()
   * @generated
   */
  void setBas(Binding_AnyStatement value);

  /**
   * Returns the value of the '<em><b>Bbs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bbs</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bbs</em>' containment reference.
   * @see #setBbs(Binding_BalStatement)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getCommaItem_Bbs()
   * @model containment="true"
   * @generated
   */
  Binding_BalStatement getBbs();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.CommaItem#getBbs <em>Bbs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bbs</em>' containment reference.
   * @see #getBbs()
   * @generated
   */
  void setBbs(Binding_BalStatement value);

  /**
   * Returns the value of the '<em><b>Bbs2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bbs2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bbs2</em>' containment reference.
   * @see #setBbs2(Binding_BalStatement)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getCommaItem_Bbs2()
   * @model containment="true"
   * @generated
   */
  Binding_BalStatement getBbs2();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.CommaItem#getBbs2 <em>Bbs2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bbs2</em>' containment reference.
   * @see #getBbs2()
   * @generated
   */
  void setBbs2(Binding_BalStatement value);

  /**
   * Returns the value of the '<em><b>Ci</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ci</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ci</em>' containment reference.
   * @see #setCi(CommaItem)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getCommaItem_Ci()
   * @model containment="true"
   * @generated
   */
  CommaItem getCi();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.CommaItem#getCi <em>Ci</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ci</em>' containment reference.
   * @see #getCi()
   * @generated
   */
  void setCi(CommaItem value);

} // CommaItem
