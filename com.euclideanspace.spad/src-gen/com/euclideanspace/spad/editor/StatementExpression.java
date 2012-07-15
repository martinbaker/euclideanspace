/**
 */
package com.euclideanspace.spad.editor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.spad.editor.StatementExpression#getT <em>T</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.StatementExpression#getT2 <em>T2</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.StatementExpression#getT3 <em>T3</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.StatementExpression#getT33 <em>T33</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.StatementExpression#getT5 <em>T5</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.StatementExpression#getT4 <em>T4</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.spad.editor.EditorPackage#getStatementExpression()
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
   * @see com.euclideanspace.spad.editor.EditorPackage#getStatementExpression_T()
   * @model containment="true"
   * @generated
   */
  Expr getT();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.StatementExpression#getT <em>T</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T</em>' containment reference.
   * @see #getT()
   * @generated
   */
  void setT(Expr value);

  /**
   * Returns the value of the '<em><b>T2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T2</em>' containment reference.
   * @see #setT2(TypeExpression)
   * @see com.euclideanspace.spad.editor.EditorPackage#getStatementExpression_T2()
   * @model containment="true"
   * @generated
   */
  TypeExpression getT2();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.StatementExpression#getT2 <em>T2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T2</em>' containment reference.
   * @see #getT2()
   * @generated
   */
  void setT2(TypeExpression value);

  /**
   * Returns the value of the '<em><b>T3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T3</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T3</em>' containment reference.
   * @see #setT3(Expr)
   * @see com.euclideanspace.spad.editor.EditorPackage#getStatementExpression_T3()
   * @model containment="true"
   * @generated
   */
  Expr getT3();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.StatementExpression#getT3 <em>T3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T3</em>' containment reference.
   * @see #getT3()
   * @generated
   */
  void setT3(Expr value);

  /**
   * Returns the value of the '<em><b>T33</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.spad.editor.Expr}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T33</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T33</em>' containment reference list.
   * @see com.euclideanspace.spad.editor.EditorPackage#getStatementExpression_T33()
   * @model containment="true"
   * @generated
   */
  EList<Expr> getT33();

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
   * @see com.euclideanspace.spad.editor.EditorPackage#getStatementExpression_T5()
   * @model containment="true"
   * @generated
   */
  Block getT5();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.StatementExpression#getT5 <em>T5</em>}' containment reference.
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
   * @see com.euclideanspace.spad.editor.EditorPackage#getStatementExpression_T4()
   * @model containment="true"
   * @generated
   */
  Statement getT4();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.StatementExpression#getT4 <em>T4</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T4</em>' containment reference.
   * @see #getT4()
   * @generated
   */
  void setT4(Statement value);

} // StatementExpression
