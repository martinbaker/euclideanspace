/**
 */
package com.euclideanspace.aldor.editor;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Infixed Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.InfixedExpr#getIe <em>Ie</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.aldor.editor.EditorPackage#getInfixedExpr()
 * @model
 * @generated
 */
public interface InfixedExpr extends enlister1_InfixedExpr_Comma
{
  /**
   * Returns the value of the '<em><b>Ie</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.aldor.editor.InfixedExpr}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ie</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ie</em>' containment reference list.
   * @see com.euclideanspace.aldor.editor.EditorPackage#getInfixedExpr_Ie()
   * @model containment="true"
   * @generated
   */
  EList<InfixedExpr> getIe();

} // InfixedExpr
