/**
 */
package com.euclideanspace.aldor.editor;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.StatementExpression#getT <em>T</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.StatementExpression#getT5 <em>T5</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.StatementExpression#getT4 <em>T4</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.aldor.editor.EditorPackage#getStatementExpression()
 * @model
 * @generated
 */
public interface StatementExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>T</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T</em>' containment reference.
   * @see #setT(Expr)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getStatementExpression_T()
   * @model containment="true"
   * @generated
   */
  Expr getT();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.StatementExpression#getT <em>T</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T</em>' containment reference.
   * @see #getT()
   * @generated
   */
  void setT(Expr value);

  /**
   * Returns the value of the '<em><b>T5</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T5</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T5</em>' containment reference.
   * @see #setT5(Block)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getStatementExpression_T5()
   * @model containment="true"
   * @generated
   */
  Block getT5();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.StatementExpression#getT5 <em>T5</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T5</em>' containment reference.
   * @see #getT5()
   * @generated
   */
  void setT5(Block value);

  /**
   * Returns the value of the '<em><b>T4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T4</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T4</em>' containment reference.
   * @see #setT4(Statement)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getStatementExpression_T4()
   * @model containment="true"
   * @generated
   */
  Statement getT4();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.StatementExpression#getT4 <em>T4</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T4</em>' containment reference.
   * @see #getT4()
   * @generated
   */
  void setT4(Statement value);

} // StatementExpression
