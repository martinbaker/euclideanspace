/**
 */
package com.euclideanspace.spad.editor;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link com.euclideanspace.spad.editor.Expr#getE2 <em>E2</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.Expr#getE3 <em>E3</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.Expr#getE5 <em>E5</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.Expr#getE6 <em>E6</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.Expr#getE22 <em>E22</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.Expr#getE21 <em>E21</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.Expr#getE23 <em>E23</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.Expr#getE9 <em>E9</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.Expr#getE10 <em>E10</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.Expr#getE25 <em>E25</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.Expr#getE24 <em>E24</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.Expr#getE26 <em>E26</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.Expr#getE11 <em>E11</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.Expr#getE12 <em>E12</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.Expr#getE13 <em>E13</em>}</li>
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
   * @see #setIfpred(Expr)
   * @see com.euclideanspace.spad.editor.EditorPackage#getExpr_Ifpred()
   * @model containment="true"
   * @generated
   */
  Expr getIfpred();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.Expr#getIfpred <em>Ifpred</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ifpred</em>' containment reference.
   * @see #getIfpred()
   * @generated
   */
  void setIfpred(Expr value);

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

  /**
   * Returns the value of the '<em><b>E2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>E2</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>E2</em>' attribute.
   * @see #setE2(String)
   * @see com.euclideanspace.spad.editor.EditorPackage#getExpr_E2()
   * @model
   * @generated
   */
  String getE2();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.Expr#getE2 <em>E2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>E2</em>' attribute.
   * @see #getE2()
   * @generated
   */
  void setE2(String value);

  /**
   * Returns the value of the '<em><b>E3</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>E3</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>E3</em>' attribute.
   * @see #setE3(String)
   * @see com.euclideanspace.spad.editor.EditorPackage#getExpr_E3()
   * @model
   * @generated
   */
  String getE3();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.Expr#getE3 <em>E3</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>E3</em>' attribute.
   * @see #getE3()
   * @generated
   */
  void setE3(String value);

  /**
   * Returns the value of the '<em><b>E5</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>E5</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>E5</em>' attribute.
   * @see #setE5(String)
   * @see com.euclideanspace.spad.editor.EditorPackage#getExpr_E5()
   * @model
   * @generated
   */
  String getE5();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.Expr#getE5 <em>E5</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>E5</em>' attribute.
   * @see #getE5()
   * @generated
   */
  void setE5(String value);

  /**
   * Returns the value of the '<em><b>E6</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>E6</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>E6</em>' containment reference.
   * @see #setE6(TypeExpression)
   * @see com.euclideanspace.spad.editor.EditorPackage#getExpr_E6()
   * @model containment="true"
   * @generated
   */
  TypeExpression getE6();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.Expr#getE6 <em>E6</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>E6</em>' containment reference.
   * @see #getE6()
   * @generated
   */
  void setE6(TypeExpression value);

  /**
   * Returns the value of the '<em><b>E22</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.spad.editor.TypeExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>E22</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>E22</em>' containment reference list.
   * @see com.euclideanspace.spad.editor.EditorPackage#getExpr_E22()
   * @model containment="true"
   * @generated
   */
  EList<TypeExpression> getE22();

  /**
   * Returns the value of the '<em><b>E21</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.spad.editor.TypeExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>E21</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>E21</em>' containment reference list.
   * @see com.euclideanspace.spad.editor.EditorPackage#getExpr_E21()
   * @model containment="true"
   * @generated
   */
  EList<TypeExpression> getE21();

  /**
   * Returns the value of the '<em><b>E23</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.spad.editor.TypeExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>E23</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>E23</em>' containment reference list.
   * @see com.euclideanspace.spad.editor.EditorPackage#getExpr_E23()
   * @model containment="true"
   * @generated
   */
  EList<TypeExpression> getE23();

  /**
   * Returns the value of the '<em><b>E9</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>E9</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>E9</em>' attribute.
   * @see #setE9(String)
   * @see com.euclideanspace.spad.editor.EditorPackage#getExpr_E9()
   * @model
   * @generated
   */
  String getE9();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.Expr#getE9 <em>E9</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>E9</em>' attribute.
   * @see #getE9()
   * @generated
   */
  void setE9(String value);

  /**
   * Returns the value of the '<em><b>E10</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>E10</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>E10</em>' containment reference.
   * @see #setE10(TypeExpression)
   * @see com.euclideanspace.spad.editor.EditorPackage#getExpr_E10()
   * @model containment="true"
   * @generated
   */
  TypeExpression getE10();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.Expr#getE10 <em>E10</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>E10</em>' containment reference.
   * @see #getE10()
   * @generated
   */
  void setE10(TypeExpression value);

  /**
   * Returns the value of the '<em><b>E25</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.spad.editor.TypeExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>E25</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>E25</em>' containment reference list.
   * @see com.euclideanspace.spad.editor.EditorPackage#getExpr_E25()
   * @model containment="true"
   * @generated
   */
  EList<TypeExpression> getE25();

  /**
   * Returns the value of the '<em><b>E24</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.spad.editor.TypeExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>E24</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>E24</em>' containment reference list.
   * @see com.euclideanspace.spad.editor.EditorPackage#getExpr_E24()
   * @model containment="true"
   * @generated
   */
  EList<TypeExpression> getE24();

  /**
   * Returns the value of the '<em><b>E26</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.spad.editor.TypeExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>E26</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>E26</em>' containment reference list.
   * @see com.euclideanspace.spad.editor.EditorPackage#getExpr_E26()
   * @model containment="true"
   * @generated
   */
  EList<TypeExpression> getE26();

  /**
   * Returns the value of the '<em><b>E11</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>E11</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>E11</em>' attribute.
   * @see #setE11(String)
   * @see com.euclideanspace.spad.editor.EditorPackage#getExpr_E11()
   * @model
   * @generated
   */
  String getE11();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.Expr#getE11 <em>E11</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>E11</em>' attribute.
   * @see #getE11()
   * @generated
   */
  void setE11(String value);

  /**
   * Returns the value of the '<em><b>E12</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>E12</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>E12</em>' containment reference.
   * @see #setE12(TypeExpression)
   * @see com.euclideanspace.spad.editor.EditorPackage#getExpr_E12()
   * @model containment="true"
   * @generated
   */
  TypeExpression getE12();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.Expr#getE12 <em>E12</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>E12</em>' containment reference.
   * @see #getE12()
   * @generated
   */
  void setE12(TypeExpression value);

  /**
   * Returns the value of the '<em><b>E13</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.spad.editor.TypeExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>E13</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>E13</em>' containment reference list.
   * @see com.euclideanspace.spad.editor.EditorPackage#getExpr_E13()
   * @model containment="true"
   * @generated
   */
  EList<TypeExpression> getE13();

} // Expr
