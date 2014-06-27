/**
 */
package com.euclideanspace.aldor.editor;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.TypeLiteral#getT1 <em>T1</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.TypeLiteral#getT22 <em>T22</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.TypeLiteral#getT34 <em>T34</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.TypeLiteral#getT35 <em>T35</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.aldor.editor.EditorPackage#getTypeLiteral()
 * @model
 * @generated
 */
public interface TypeLiteral extends TypePrimaryExpression
{
  /**
   * Returns the value of the '<em><b>T1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T1</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T1</em>' attribute.
   * @see #setT1(int)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getTypeLiteral_T1()
   * @model
   * @generated
   */
  int getT1();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.TypeLiteral#getT1 <em>T1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T1</em>' attribute.
   * @see #getT1()
   * @generated
   */
  void setT1(int value);

  /**
   * Returns the value of the '<em><b>T22</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T22</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T22</em>' attribute.
   * @see #setT22(String)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getTypeLiteral_T22()
   * @model
   * @generated
   */
  String getT22();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.TypeLiteral#getT22 <em>T22</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T22</em>' attribute.
   * @see #getT22()
   * @generated
   */
  void setT22(String value);

  /**
   * Returns the value of the '<em><b>T34</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T34</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T34</em>' containment reference.
   * @see #setT34(CharacterLiteral)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getTypeLiteral_T34()
   * @model containment="true"
   * @generated
   */
  CharacterLiteral getT34();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.TypeLiteral#getT34 <em>T34</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T34</em>' containment reference.
   * @see #getT34()
   * @generated
   */
  void setT34(CharacterLiteral value);

  /**
   * Returns the value of the '<em><b>T35</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T35</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T35</em>' containment reference.
   * @see #setT35(BooleanLiteral)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getTypeLiteral_T35()
   * @model containment="true"
   * @generated
   */
  BooleanLiteral getT35();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.TypeLiteral#getT35 <em>T35</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T35</em>' containment reference.
   * @see #getT35()
   * @generated
   */
  void setT35(BooleanLiteral value);

} // TypeLiteral
