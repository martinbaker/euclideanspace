/**
 */
package com.euclideanspace.aldor.editor;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding LInfixed Any Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.BindingL_Infixed_AnyStatement#getLft <em>Lft</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.BindingL_Infixed_AnyStatement#getOp <em>Op</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.BindingL_Infixed_AnyStatement#getBia <em>Bia</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.BindingL_Infixed_AnyStatement#getBas9 <em>Bas9</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.aldor.editor.EditorPackage#getBindingL_Infixed_AnyStatement()
 * @model
 * @generated
 */
public interface BindingL_Infixed_AnyStatement extends Binding_AnyStatement
{
  /**
   * Returns the value of the '<em><b>Lft</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lft</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lft</em>' containment reference.
   * @see #setLft(Infixed)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getBindingL_Infixed_AnyStatement_Lft()
   * @model containment="true"
   * @generated
   */
  Infixed getLft();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.BindingL_Infixed_AnyStatement#getLft <em>Lft</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lft</em>' containment reference.
   * @see #getLft()
   * @generated
   */
  void setLft(Infixed value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see #setOp(String)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getBindingL_Infixed_AnyStatement_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.BindingL_Infixed_AnyStatement#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

  /**
   * Returns the value of the '<em><b>Bia</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bia</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bia</em>' containment reference.
   * @see #setBia(BindingL_Infixed_AnyStatement)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getBindingL_Infixed_AnyStatement_Bia()
   * @model containment="true"
   * @generated
   */
  BindingL_Infixed_AnyStatement getBia();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.BindingL_Infixed_AnyStatement#getBia <em>Bia</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bia</em>' containment reference.
   * @see #getBia()
   * @generated
   */
  void setBia(BindingL_Infixed_AnyStatement value);

  /**
   * Returns the value of the '<em><b>Bas9</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bas9</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bas9</em>' containment reference.
   * @see #setBas9(AnyStatement)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getBindingL_Infixed_AnyStatement_Bas9()
   * @model containment="true"
   * @generated
   */
  AnyStatement getBas9();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.BindingL_Infixed_AnyStatement#getBas9 <em>Bas9</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bas9</em>' containment reference.
   * @see #getBas9()
   * @generated
   */
  void setBas9(AnyStatement value);

} // BindingL_Infixed_AnyStatement
