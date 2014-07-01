/**
 */
package com.euclideanspace.aldor.editor;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Curly Contents List Labeled</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.CurlyContentsList_Labeled#getStatemts <em>Statemts</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.aldor.editor.EditorPackage#getCurlyContentsList_Labeled()
 * @model
 * @generated
 */
public interface CurlyContentsList_Labeled extends CurlyContents_Labeled
{
  /**
   * Returns the value of the '<em><b>Statemts</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.aldor.editor.Labeled}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statemts</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statemts</em>' containment reference list.
   * @see com.euclideanspace.aldor.editor.EditorPackage#getCurlyContentsList_Labeled_Statemts()
   * @model containment="true"
   * @generated
   */
  EList<Labeled> getStatemts();

} // CurlyContentsList_Labeled
