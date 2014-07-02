/**
 */
package com.euclideanspace.aldor.editor;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding Any Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.Binding_AnyStatement#getBe <em>Be</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.Binding_AnyStatement#getApa <em>Apa</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.Binding_AnyStatement#getC <em>C</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.Binding_AnyStatement#getApb <em>Apb</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.aldor.editor.EditorPackage#getBinding_AnyStatement()
 * @model
 * @generated
 */
public interface Binding_AnyStatement extends CommaItem, AlwaysPart_AnyStatement
{
  /**
   * Returns the value of the '<em><b>Be</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Be</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Be</em>' containment reference.
   * @see #setBe(ButExpr)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getBinding_AnyStatement_Be()
   * @model containment="true"
   * @generated
   */
  ButExpr getBe();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.Binding_AnyStatement#getBe <em>Be</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Be</em>' containment reference.
   * @see #getBe()
   * @generated
   */
  void setBe(ButExpr value);

  /**
   * Returns the value of the '<em><b>Apa</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Apa</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Apa</em>' containment reference.
   * @see #setApa(AlwaysPart_AnyStatement)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getBinding_AnyStatement_Apa()
   * @model containment="true"
   * @generated
   */
  AlwaysPart_AnyStatement getApa();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.Binding_AnyStatement#getApa <em>Apa</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Apa</em>' containment reference.
   * @see #getApa()
   * @generated
   */
  void setApa(AlwaysPart_AnyStatement value);

  /**
   * Returns the value of the '<em><b>C</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>C</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>C</em>' containment reference.
   * @see #setC(Cases)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getBinding_AnyStatement_C()
   * @model containment="true"
   * @generated
   */
  Cases getC();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.Binding_AnyStatement#getC <em>C</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>C</em>' containment reference.
   * @see #getC()
   * @generated
   */
  void setC(Cases value);

  /**
   * Returns the value of the '<em><b>Apb</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Apb</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Apb</em>' containment reference.
   * @see #setApb(AlwaysPart_BalStatement)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getBinding_AnyStatement_Apb()
   * @model containment="true"
   * @generated
   */
  AlwaysPart_BalStatement getApb();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.Binding_AnyStatement#getApb <em>Apb</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Apb</em>' containment reference.
   * @see #getApb()
   * @generated
   */
  void setApb(AlwaysPart_BalStatement value);

} // Binding_AnyStatement
