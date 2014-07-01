/**
 */
package com.euclideanspace.aldor.editor;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>But Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.ButExpr#getDb <em>Db</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.ButExpr#getCa <em>Ca</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.aldor.editor.EditorPackage#getButExpr()
 * @model
 * @generated
 */
public interface ButExpr extends EObject
{
  /**
   * Returns the value of the '<em><b>Db</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Db</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Db</em>' containment reference.
   * @see #setDb(DeclBinding)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getButExpr_Db()
   * @model containment="true"
   * @generated
   */
  DeclBinding getDb();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.ButExpr#getDb <em>Db</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Db</em>' containment reference.
   * @see #getDb()
   * @generated
   */
  void setDb(DeclBinding value);

  /**
   * Returns the value of the '<em><b>Ca</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ca</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ca</em>' containment reference.
   * @see #setCa(Cases)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getButExpr_Ca()
   * @model containment="true"
   * @generated
   */
  Cases getCa();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.ButExpr#getCa <em>Ca</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ca</em>' containment reference.
   * @see #getCa()
   * @generated
   */
  void setCa(Cases value);

} // ButExpr
