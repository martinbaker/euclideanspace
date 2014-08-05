/**
 */
package com.euclideanspace.aldor.editor;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comma Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.CommaItem#getCi <em>Ci</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.aldor.editor.EditorPackage#getCommaItem()
 * @model
 * @generated
 */
public interface CommaItem extends AnyStatement, enlister1_CommaItem_Comma
{
  /**
   * Returns the value of the '<em><b>Ci</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.aldor.editor.CommaItem}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ci</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ci</em>' containment reference list.
   * @see com.euclideanspace.aldor.editor.EditorPackage#getCommaItem_Ci()
   * @model containment="true"
   * @generated
   */
  EList<CommaItem> getCi();

} // CommaItem
