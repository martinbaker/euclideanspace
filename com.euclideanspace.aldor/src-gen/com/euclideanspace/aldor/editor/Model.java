/**
 */
package com.euclideanspace.aldor.editor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.Model#getInsert <em>Insert</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.Model#getCc <em>Cc</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.aldor.editor.EditorPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Insert</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Insert</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Insert</em>' attribute list.
   * @see com.euclideanspace.aldor.editor.EditorPackage#getModel_Insert()
   * @model unique="false"
   * @generated
   */
  EList<String> getInsert();

  /**
   * Returns the value of the '<em><b>Cc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cc</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cc</em>' containment reference.
   * @see #setCc(CurlyContents_Labeled)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getModel_Cc()
   * @model containment="true"
   * @generated
   */
  CurlyContents_Labeled getCc();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.Model#getCc <em>Cc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cc</em>' containment reference.
   * @see #getCc()
   * @generated
   */
  void setCc(CurlyContents_Labeled value);

} // Model
