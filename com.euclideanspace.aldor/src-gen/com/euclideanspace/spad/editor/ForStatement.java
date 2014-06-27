/**
 */
package com.euclideanspace.spad.editor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.spad.editor.ForStatement#getStname <em>Stname</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.ForStatement#getT1 <em>T1</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.ForStatement#getBy1 <em>By1</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.ForStatement#getStname2 <em>Stname2</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.ForStatement#getT2 <em>T2</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.ForStatement#getBy2 <em>By2</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.ForStatement#getS1 <em>S1</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.spad.editor.EditorPackage#getForStatement()
 * @model
 * @generated
 */
public interface ForStatement extends EObject
{
  /**
   * Returns the value of the '<em><b>Stname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stname</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stname</em>' attribute.
   * @see #setStname(String)
   * @see com.euclideanspace.spad.editor.EditorPackage#getForStatement_Stname()
   * @model
   * @generated
   */
  String getStname();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.ForStatement#getStname <em>Stname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stname</em>' attribute.
   * @see #getStname()
   * @generated
   */
  void setStname(String value);

  /**
   * Returns the value of the '<em><b>T1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T1</em>' containment reference.
   * @see #setT1(Expr)
   * @see com.euclideanspace.spad.editor.EditorPackage#getForStatement_T1()
   * @model containment="true"
   * @generated
   */
  Expr getT1();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.ForStatement#getT1 <em>T1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T1</em>' containment reference.
   * @see #getT1()
   * @generated
   */
  void setT1(Expr value);

  /**
   * Returns the value of the '<em><b>By1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>By1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>By1</em>' containment reference.
   * @see #setBy1(Expr)
   * @see com.euclideanspace.spad.editor.EditorPackage#getForStatement_By1()
   * @model containment="true"
   * @generated
   */
  Expr getBy1();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.ForStatement#getBy1 <em>By1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>By1</em>' containment reference.
   * @see #getBy1()
   * @generated
   */
  void setBy1(Expr value);

  /**
   * Returns the value of the '<em><b>Stname2</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stname2</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stname2</em>' attribute list.
   * @see com.euclideanspace.spad.editor.EditorPackage#getForStatement_Stname2()
   * @model unique="false"
   * @generated
   */
  EList<String> getStname2();

  /**
   * Returns the value of the '<em><b>T2</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.spad.editor.Expr}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T2</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T2</em>' containment reference list.
   * @see com.euclideanspace.spad.editor.EditorPackage#getForStatement_T2()
   * @model containment="true"
   * @generated
   */
  EList<Expr> getT2();

  /**
   * Returns the value of the '<em><b>By2</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.spad.editor.Expr}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>By2</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>By2</em>' containment reference list.
   * @see com.euclideanspace.spad.editor.EditorPackage#getForStatement_By2()
   * @model containment="true"
   * @generated
   */
  EList<Expr> getBy2();

  /**
   * Returns the value of the '<em><b>S1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>S1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>S1</em>' containment reference.
   * @see #setS1(Statement)
   * @see com.euclideanspace.spad.editor.EditorPackage#getForStatement_S1()
   * @model containment="true"
   * @generated
   */
  Statement getS1();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.ForStatement#getS1 <em>S1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>S1</em>' containment reference.
   * @see #getS1()
   * @generated
   */
  void setS1(Statement value);

} // ForStatement
