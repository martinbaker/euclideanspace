/**
 */
package com.euclideanspace.spad.editor;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.spad.editor.Literal#getValue <em>Value</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.Literal#getT2 <em>T2</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.Literal#getE1 <em>E1</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.Literal#getT31 <em>T31</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.Literal#getE4 <em>E4</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.spad.editor.EditorPackage#getLiteral()
 * @model
 * @generated
 */
public interface Literal extends PrimaryPrefix
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(int)
   * @see com.euclideanspace.spad.editor.EditorPackage#getLiteral_Value()
   * @model
   * @generated
   */
  int getValue();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.Literal#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(int value);

  /**
   * Returns the value of the '<em><b>T2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T2</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T2</em>' attribute.
   * @see #setT2(String)
   * @see com.euclideanspace.spad.editor.EditorPackage#getLiteral_T2()
   * @model
   * @generated
   */
  String getT2();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.Literal#getT2 <em>T2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T2</em>' attribute.
   * @see #getT2()
   * @generated
   */
  void setT2(String value);

  /**
   * Returns the value of the '<em><b>E1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>E1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>E1</em>' containment reference.
   * @see #setE1(NameOrFunctionCall)
   * @see com.euclideanspace.spad.editor.EditorPackage#getLiteral_E1()
   * @model containment="true"
   * @generated
   */
  NameOrFunctionCall getE1();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.Literal#getE1 <em>E1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>E1</em>' containment reference.
   * @see #getE1()
   * @generated
   */
  void setE1(NameOrFunctionCall value);

  /**
   * Returns the value of the '<em><b>T31</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T31</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T31</em>' attribute list.
   * @see com.euclideanspace.spad.editor.EditorPackage#getLiteral_T31()
   * @model unique="false"
   * @generated
   */
  EList<String> getT31();

  /**
   * Returns the value of the '<em><b>E4</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.spad.editor.NameOrFunctionCall}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>E4</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>E4</em>' containment reference list.
   * @see com.euclideanspace.spad.editor.EditorPackage#getLiteral_E4()
   * @model containment="true"
   * @generated
   */
  EList<NameOrFunctionCall> getE4();

} // Literal
