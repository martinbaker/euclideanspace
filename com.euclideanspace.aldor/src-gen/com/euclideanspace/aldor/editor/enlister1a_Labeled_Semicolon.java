/**
 */
package com.euclideanspace.aldor.editor;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>enlister1a Labeled Semicolon</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.enlister1a_Labeled_Semicolon#getStatemnts <em>Statemnts</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.aldor.editor.EditorPackage#getenlister1a_Labeled_Semicolon()
 * @model
 * @generated
 */
public interface enlister1a_Labeled_Semicolon extends enlist1a_Labeled_Semicolon_AB
{
  /**
   * Returns the value of the '<em><b>Statemnts</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.aldor.editor.Labeled}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statemnts</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statemnts</em>' containment reference list.
   * @see com.euclideanspace.aldor.editor.EditorPackage#getenlister1a_Labeled_Semicolon_Statemnts()
   * @model containment="true"
   * @generated
   */
  EList<Labeled> getStatemnts();

} // enlister1a_Labeled_Semicolon
