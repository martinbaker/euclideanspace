/**
 */
package com.euclideanspace.spad.editor;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.spad.editor.Statement#getS1 <em>S1</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.Statement#getS3 <em>S3</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.Statement#getS4 <em>S4</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.Statement#getS4b <em>S4b</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.Statement#getS5 <em>S5</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.Statement#getS6 <em>S6</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.Statement#getS7 <em>S7</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.Statement#getS8 <em>S8</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.Statement#getS12 <em>S12</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.Statement#getS9 <em>S9</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.Statement#getS10 <em>S10</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.Statement#getE <em>E</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.spad.editor.EditorPackage#getStatement()
 * @model
 * @generated
 */
public interface Statement extends EObject
{
  /**
   * Returns the value of the '<em><b>S1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>S1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>S1</em>' containment reference.
   * @see #setS1(Block)
   * @see com.euclideanspace.spad.editor.EditorPackage#getStatement_S1()
   * @model containment="true"
   * @generated
   */
  Block getS1();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.Statement#getS1 <em>S1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>S1</em>' containment reference.
   * @see #getS1()
   * @generated
   */
  void setS1(Block value);

  /**
   * Returns the value of the '<em><b>S3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>S3</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>S3</em>' containment reference.
   * @see #setS3(StatementExpression)
   * @see com.euclideanspace.spad.editor.EditorPackage#getStatement_S3()
   * @model containment="true"
   * @generated
   */
  StatementExpression getS3();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.Statement#getS3 <em>S3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>S3</em>' containment reference.
   * @see #getS3()
   * @generated
   */
  void setS3(StatementExpression value);

  /**
   * Returns the value of the '<em><b>S4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>S4</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>S4</em>' containment reference.
   * @see #setS4(IfStatement)
   * @see com.euclideanspace.spad.editor.EditorPackage#getStatement_S4()
   * @model containment="true"
   * @generated
   */
  IfStatement getS4();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.Statement#getS4 <em>S4</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>S4</em>' containment reference.
   * @see #getS4()
   * @generated
   */
  void setS4(IfStatement value);

  /**
   * Returns the value of the '<em><b>S4b</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>S4b</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>S4b</em>' containment reference.
   * @see #setS4b(IfElseStatement)
   * @see com.euclideanspace.spad.editor.EditorPackage#getStatement_S4b()
   * @model containment="true"
   * @generated
   */
  IfElseStatement getS4b();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.Statement#getS4b <em>S4b</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>S4b</em>' containment reference.
   * @see #getS4b()
   * @generated
   */
  void setS4b(IfElseStatement value);

  /**
   * Returns the value of the '<em><b>S5</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>S5</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>S5</em>' containment reference.
   * @see #setS5(WhileStatement)
   * @see com.euclideanspace.spad.editor.EditorPackage#getStatement_S5()
   * @model containment="true"
   * @generated
   */
  WhileStatement getS5();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.Statement#getS5 <em>S5</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>S5</em>' containment reference.
   * @see #getS5()
   * @generated
   */
  void setS5(WhileStatement value);

  /**
   * Returns the value of the '<em><b>S6</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>S6</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>S6</em>' containment reference.
   * @see #setS6(DoStatement)
   * @see com.euclideanspace.spad.editor.EditorPackage#getStatement_S6()
   * @model containment="true"
   * @generated
   */
  DoStatement getS6();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.Statement#getS6 <em>S6</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>S6</em>' containment reference.
   * @see #getS6()
   * @generated
   */
  void setS6(DoStatement value);

  /**
   * Returns the value of the '<em><b>S7</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>S7</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>S7</em>' containment reference.
   * @see #setS7(ForStatement)
   * @see com.euclideanspace.spad.editor.EditorPackage#getStatement_S7()
   * @model containment="true"
   * @generated
   */
  ForStatement getS7();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.Statement#getS7 <em>S7</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>S7</em>' containment reference.
   * @see #getS7()
   * @generated
   */
  void setS7(ForStatement value);

  /**
   * Returns the value of the '<em><b>S8</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>S8</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>S8</em>' containment reference.
   * @see #setS8(BreakStatement)
   * @see com.euclideanspace.spad.editor.EditorPackage#getStatement_S8()
   * @model containment="true"
   * @generated
   */
  BreakStatement getS8();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.Statement#getS8 <em>S8</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>S8</em>' containment reference.
   * @see #getS8()
   * @generated
   */
  void setS8(BreakStatement value);

  /**
   * Returns the value of the '<em><b>S12</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>S12</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>S12</em>' containment reference.
   * @see #setS12(RepeatStatement)
   * @see com.euclideanspace.spad.editor.EditorPackage#getStatement_S12()
   * @model containment="true"
   * @generated
   */
  RepeatStatement getS12();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.Statement#getS12 <em>S12</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>S12</em>' containment reference.
   * @see #getS12()
   * @generated
   */
  void setS12(RepeatStatement value);

  /**
   * Returns the value of the '<em><b>S9</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>S9</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>S9</em>' containment reference.
   * @see #setS9(IterateStatement)
   * @see com.euclideanspace.spad.editor.EditorPackage#getStatement_S9()
   * @model containment="true"
   * @generated
   */
  IterateStatement getS9();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.Statement#getS9 <em>S9</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>S9</em>' containment reference.
   * @see #getS9()
   * @generated
   */
  void setS9(IterateStatement value);

  /**
   * Returns the value of the '<em><b>S10</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>S10</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>S10</em>' containment reference.
   * @see #setS10(ReturnStatement)
   * @see com.euclideanspace.spad.editor.EditorPackage#getStatement_S10()
   * @model containment="true"
   * @generated
   */
  ReturnStatement getS10();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.Statement#getS10 <em>S10</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>S10</em>' containment reference.
   * @see #getS10()
   * @generated
   */
  void setS10(ReturnStatement value);

  /**
   * Returns the value of the '<em><b>E</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>E</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>E</em>' containment reference.
   * @see #setE(Expr)
   * @see com.euclideanspace.spad.editor.EditorPackage#getStatement_E()
   * @model containment="true"
   * @generated
   */
  Expr getE();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.Statement#getE <em>E</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>E</em>' containment reference.
   * @see #getE()
   * @generated
   */
  void setE(Expr value);

} // Statement
