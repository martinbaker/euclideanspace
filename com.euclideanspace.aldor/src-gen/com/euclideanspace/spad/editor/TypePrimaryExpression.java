/**
 */
package com.euclideanspace.spad.editor;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Primary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.spad.editor.TypePrimaryExpression#getT32 <em>T32</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.TypePrimaryExpression#getTyname <em>Tyname</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.TypePrimaryExpression#getT5 <em>T5</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.TypePrimaryExpression#getT7 <em>T7</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.TypePrimaryExpression#getT8 <em>T8</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.TypePrimaryExpression#getT21 <em>T21</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.TypePrimaryExpression#getT23 <em>T23</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.TypePrimaryExpression#getT10 <em>T10</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.TypePrimaryExpression#getT11 <em>T11</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.TypePrimaryExpression#getT24 <em>T24</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.TypePrimaryExpression#getT26 <em>T26</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.TypePrimaryExpression#getT13 <em>T13</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.TypePrimaryExpression#getT14 <em>T14</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.spad.editor.EditorPackage#getTypePrimaryExpression()
 * @model
 * @generated
 */
public interface TypePrimaryExpression extends TypeExpression
{
  /**
   * Returns the value of the '<em><b>T32</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T32</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T32</em>' attribute.
   * @see #setT32(String)
   * @see com.euclideanspace.spad.editor.EditorPackage#getTypePrimaryExpression_T32()
   * @model
   * @generated
   */
  String getT32();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.TypePrimaryExpression#getT32 <em>T32</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T32</em>' attribute.
   * @see #getT32()
   * @generated
   */
  void setT32(String value);

  /**
   * Returns the value of the '<em><b>Tyname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tyname</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tyname</em>' attribute.
   * @see #setTyname(String)
   * @see com.euclideanspace.spad.editor.EditorPackage#getTypePrimaryExpression_Tyname()
   * @model
   * @generated
   */
  String getTyname();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.TypePrimaryExpression#getTyname <em>Tyname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tyname</em>' attribute.
   * @see #getTyname()
   * @generated
   */
  void setTyname(String value);

  /**
   * Returns the value of the '<em><b>T5</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T5</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T5</em>' containment reference.
   * @see #setT5(TypeExpression)
   * @see com.euclideanspace.spad.editor.EditorPackage#getTypePrimaryExpression_T5()
   * @model containment="true"
   * @generated
   */
  TypeExpression getT5();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.TypePrimaryExpression#getT5 <em>T5</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T5</em>' containment reference.
   * @see #getT5()
   * @generated
   */
  void setT5(TypeExpression value);

  /**
   * Returns the value of the '<em><b>T7</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T7</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T7</em>' containment reference.
   * @see #setT7(TypeExpression)
   * @see com.euclideanspace.spad.editor.EditorPackage#getTypePrimaryExpression_T7()
   * @model containment="true"
   * @generated
   */
  TypeExpression getT7();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.TypePrimaryExpression#getT7 <em>T7</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T7</em>' containment reference.
   * @see #getT7()
   * @generated
   */
  void setT7(TypeExpression value);

  /**
   * Returns the value of the '<em><b>T8</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.spad.editor.TypeExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T8</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T8</em>' containment reference list.
   * @see com.euclideanspace.spad.editor.EditorPackage#getTypePrimaryExpression_T8()
   * @model containment="true"
   * @generated
   */
  EList<TypeExpression> getT8();

  /**
   * Returns the value of the '<em><b>T21</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.spad.editor.TypeExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T21</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T21</em>' containment reference list.
   * @see com.euclideanspace.spad.editor.EditorPackage#getTypePrimaryExpression_T21()
   * @model containment="true"
   * @generated
   */
  EList<TypeExpression> getT21();

  /**
   * Returns the value of the '<em><b>T23</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.spad.editor.TypeExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T23</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T23</em>' containment reference list.
   * @see com.euclideanspace.spad.editor.EditorPackage#getTypePrimaryExpression_T23()
   * @model containment="true"
   * @generated
   */
  EList<TypeExpression> getT23();

  /**
   * Returns the value of the '<em><b>T10</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T10</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T10</em>' containment reference.
   * @see #setT10(TypeExpression)
   * @see com.euclideanspace.spad.editor.EditorPackage#getTypePrimaryExpression_T10()
   * @model containment="true"
   * @generated
   */
  TypeExpression getT10();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.TypePrimaryExpression#getT10 <em>T10</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T10</em>' containment reference.
   * @see #getT10()
   * @generated
   */
  void setT10(TypeExpression value);

  /**
   * Returns the value of the '<em><b>T11</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.spad.editor.TypeExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T11</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T11</em>' containment reference list.
   * @see com.euclideanspace.spad.editor.EditorPackage#getTypePrimaryExpression_T11()
   * @model containment="true"
   * @generated
   */
  EList<TypeExpression> getT11();

  /**
   * Returns the value of the '<em><b>T24</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.spad.editor.TypeExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T24</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T24</em>' containment reference list.
   * @see com.euclideanspace.spad.editor.EditorPackage#getTypePrimaryExpression_T24()
   * @model containment="true"
   * @generated
   */
  EList<TypeExpression> getT24();

  /**
   * Returns the value of the '<em><b>T26</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.spad.editor.TypeExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T26</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T26</em>' containment reference list.
   * @see com.euclideanspace.spad.editor.EditorPackage#getTypePrimaryExpression_T26()
   * @model containment="true"
   * @generated
   */
  EList<TypeExpression> getT26();

  /**
   * Returns the value of the '<em><b>T13</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T13</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T13</em>' containment reference.
   * @see #setT13(TypeExpression)
   * @see com.euclideanspace.spad.editor.EditorPackage#getTypePrimaryExpression_T13()
   * @model containment="true"
   * @generated
   */
  TypeExpression getT13();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.TypePrimaryExpression#getT13 <em>T13</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T13</em>' containment reference.
   * @see #getT13()
   * @generated
   */
  void setT13(TypeExpression value);

  /**
   * Returns the value of the '<em><b>T14</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.spad.editor.TypeExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T14</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T14</em>' containment reference list.
   * @see com.euclideanspace.spad.editor.EditorPackage#getTypePrimaryExpression_T14()
   * @model containment="true"
   * @generated
   */
  EList<TypeExpression> getT14();

} // TypePrimaryExpression
