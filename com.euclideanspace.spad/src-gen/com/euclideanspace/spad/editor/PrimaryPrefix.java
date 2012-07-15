/**
 */
package com.euclideanspace.spad.editor;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primary Prefix</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.spad.editor.PrimaryPrefix#getT4 <em>T4</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.PrimaryPrefix#getT25 <em>T25</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.PrimaryPrefix#getT7 <em>T7</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.spad.editor.EditorPackage#getPrimaryPrefix()
 * @model
 * @generated
 */
public interface PrimaryPrefix extends Expr
{
  /**
   * Returns the value of the '<em><b>T4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T4</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T4</em>' containment reference.
   * @see #setT4(StatementExpression)
   * @see com.euclideanspace.spad.editor.EditorPackage#getPrimaryPrefix_T4()
   * @model containment="true"
   * @generated
   */
  StatementExpression getT4();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.PrimaryPrefix#getT4 <em>T4</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T4</em>' containment reference.
   * @see #getT4()
   * @generated
   */
  void setT4(StatementExpression value);

  /**
   * Returns the value of the '<em><b>T25</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.spad.editor.Expr}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T25</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T25</em>' containment reference list.
   * @see com.euclideanspace.spad.editor.EditorPackage#getPrimaryPrefix_T25()
   * @model containment="true"
   * @generated
   */
  EList<Expr> getT25();

  /**
   * Returns the value of the '<em><b>T7</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T7</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T7</em>' containment reference.
   * @see #setT7(NameOrFunctionCall)
   * @see com.euclideanspace.spad.editor.EditorPackage#getPrimaryPrefix_T7()
   * @model containment="true"
   * @generated
   */
  NameOrFunctionCall getT7();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.PrimaryPrefix#getT7 <em>T7</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T7</em>' containment reference.
   * @see #getT7()
   * @generated
   */
  void setT7(NameOrFunctionCall value);

} // PrimaryPrefix
