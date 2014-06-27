/**
 */
package com.euclideanspace.aldor.editor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Name Or Function Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.NameOrFunctionCall#getFnname <em>Fnname</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.NameOrFunctionCall#getLsp <em>Lsp</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.NameOrFunctionCall#getT4 <em>T4</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.NameOrFunctionCall#getT5 <em>T5</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.NameOrFunctionCall#getT14 <em>T14</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.NameOrFunctionCall#getT15 <em>T15</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.NameOrFunctionCall#getT6 <em>T6</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.NameOrFunctionCall#getRightType2 <em>Right Type2</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.aldor.editor.EditorPackage#getNameOrFunctionCall()
 * @model
 * @generated
 */
public interface NameOrFunctionCall extends EObject
{
  /**
   * Returns the value of the '<em><b>Fnname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fnname</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fnname</em>' attribute.
   * @see #setFnname(String)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getNameOrFunctionCall_Fnname()
   * @model
   * @generated
   */
  String getFnname();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.NameOrFunctionCall#getFnname <em>Fnname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fnname</em>' attribute.
   * @see #getFnname()
   * @generated
   */
  void setFnname(String value);

  /**
   * Returns the value of the '<em><b>Lsp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lsp</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lsp</em>' attribute.
   * @see #setLsp(String)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getNameOrFunctionCall_Lsp()
   * @model
   * @generated
   */
  String getLsp();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.NameOrFunctionCall#getLsp <em>Lsp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lsp</em>' attribute.
   * @see #getLsp()
   * @generated
   */
  void setLsp(String value);

  /**
   * Returns the value of the '<em><b>T4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T4</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T4</em>' containment reference.
   * @see #setT4(Expr)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getNameOrFunctionCall_T4()
   * @model containment="true"
   * @generated
   */
  Expr getT4();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.NameOrFunctionCall#getT4 <em>T4</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T4</em>' containment reference.
   * @see #getT4()
   * @generated
   */
  void setT4(Expr value);

  /**
   * Returns the value of the '<em><b>T5</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.aldor.editor.Expr}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T5</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T5</em>' containment reference list.
   * @see com.euclideanspace.aldor.editor.EditorPackage#getNameOrFunctionCall_T5()
   * @model containment="true"
   * @generated
   */
  EList<Expr> getT5();

  /**
   * Returns the value of the '<em><b>T14</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.aldor.editor.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T14</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T14</em>' containment reference list.
   * @see com.euclideanspace.aldor.editor.EditorPackage#getNameOrFunctionCall_T14()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getT14();

  /**
   * Returns the value of the '<em><b>T15</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.aldor.editor.Expr}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T15</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T15</em>' containment reference list.
   * @see com.euclideanspace.aldor.editor.EditorPackage#getNameOrFunctionCall_T15()
   * @model containment="true"
   * @generated
   */
  EList<Expr> getT15();

  /**
   * Returns the value of the '<em><b>T6</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T6</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T6</em>' containment reference.
   * @see #setT6(Expr)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getNameOrFunctionCall_T6()
   * @model containment="true"
   * @generated
   */
  Expr getT6();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.NameOrFunctionCall#getT6 <em>T6</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T6</em>' containment reference.
   * @see #getT6()
   * @generated
   */
  void setT6(Expr value);

  /**
   * Returns the value of the '<em><b>Right Type2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right Type2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right Type2</em>' containment reference.
   * @see #setRightType2(TypeExpression)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getNameOrFunctionCall_RightType2()
   * @model containment="true"
   * @generated
   */
  TypeExpression getRightType2();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.NameOrFunctionCall#getRightType2 <em>Right Type2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right Type2</em>' containment reference.
   * @see #getRightType2()
   * @generated
   */
  void setRightType2(TypeExpression value);

} // NameOrFunctionCall
