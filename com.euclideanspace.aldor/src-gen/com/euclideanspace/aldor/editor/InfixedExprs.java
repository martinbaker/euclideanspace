/**
 */
package com.euclideanspace.aldor.editor;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Infixed Exprs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.InfixedExprs#getDp <em>Dp</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.aldor.editor.EditorPackage#getInfixedExprs()
 * @model
 * @generated
 */
public interface InfixedExprs extends InfixedExprsDecl
{
  /**
   * Returns the value of the '<em><b>Dp</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.aldor.editor.DeclPart}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dp</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dp</em>' containment reference list.
   * @see com.euclideanspace.aldor.editor.EditorPackage#getInfixedExprs_Dp()
   * @model containment="true"
   * @generated
   */
  EList<DeclPart> getDp();

} // InfixedExprs
