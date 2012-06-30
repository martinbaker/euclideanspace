/**
 */
package com.euclideanspace.spad.editor;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.spad.editor.Expr#getIfname <em>Ifname</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.Expr#getIfpred <em>Ifpred</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.Expr#getThenexp <em>Thenexp</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.Expr#getElseexp <em>Elseexp</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.spad.editor.EditorPackage#getExpr()
 * @model
 * @generated
 */
public interface Expr extends EObject
{
  /**
   * Returns the value of the '<em><b>Ifname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ifname</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ifname</em>' attribute.
   * @see #setIfname(String)
   * @see com.euclideanspace.spad.editor.EditorPackage#getExpr_Ifname()
   * @model
   * @generated
   */
  String getIfname();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.Expr#getIfname <em>Ifname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ifname</em>' attribute.
   * @see #getIfname()
   * @generated
   */
  void setIfname(String value);

  /**
   * Returns the value of the '<em><b>Ifpred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ifpred</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ifpred</em>' containment reference.
   * @see #setIfpred(Predicate)
   * @see com.euclideanspace.spad.editor.EditorPackage#getExpr_Ifpred()
   * @model containment="true"
   * @generated
   */
  Predicate getIfpred();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.Expr#getIfpred <em>Ifpred</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ifpred</em>' containment reference.
   * @see #getIfpred()
   * @generated
   */
  void setIfpred(Predicate value);

  /**
   * Returns the value of the '<em><b>Thenexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Thenexp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Thenexp</em>' containment reference.
   * @see #setThenexp(Expr)
   * @see com.euclideanspace.spad.editor.EditorPackage#getExpr_Thenexp()
   * @model containment="true"
   * @generated
   */
  Expr getThenexp();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.Expr#getThenexp <em>Thenexp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Thenexp</em>' containment reference.
   * @see #getThenexp()
   * @generated
   */
  void setThenexp(Expr value);

  /**
   * Returns the value of the '<em><b>Elseexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elseexp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elseexp</em>' containment reference.
   * @see #setElseexp(Expr)
   * @see com.euclideanspace.spad.editor.EditorPackage#getExpr_Elseexp()
   * @model containment="true"
   * @generated
   */
  Expr getElseexp();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.Expr#getElseexp <em>Elseexp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Elseexp</em>' containment reference.
   * @see #getElseexp()
   * @generated
   */
  void setElseexp(Expr value);

} // Expr
