/**
 */
package com.euclideanspace.aldor.editor;

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
 *   <li>{@link com.euclideanspace.aldor.editor.Expr#getLeft <em>Left</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.Expr#getOp5 <em>Op5</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.aldor.editor.EditorPackage#getExpr()
 * @model
 * @generated
 */
public interface Expr extends InfixedExpr, Type
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(EObject)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getExpr_Left()
   * @model containment="true"
   * @generated
   */
  EObject getLeft();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.Expr#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(EObject value);

  /**
   * Returns the value of the '<em><b>Op5</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.aldor.editor.SegOp}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op5</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op5</em>' containment reference list.
   * @see com.euclideanspace.aldor.editor.EditorPackage#getExpr_Op5()
   * @model containment="true"
   * @generated
   */
  EList<SegOp> getOp5();

} // Expr
