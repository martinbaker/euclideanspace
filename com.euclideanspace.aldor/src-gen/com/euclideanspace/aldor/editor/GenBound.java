/**
 */
package com.euclideanspace.aldor.editor;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Bound</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.GenBound#getCi <em>Ci</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.aldor.editor.EditorPackage#getGenBound()
 * @model
 * @generated
 */
public interface GenBound extends EObject
{
  /**
   * Returns the value of the '<em><b>Ci</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ci</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ci</em>' containment reference.
   * @see #setCi(CommaItem)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getGenBound_Ci()
   * @model containment="true"
   * @generated
   */
  CommaItem getCi();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.GenBound#getCi <em>Ci</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ci</em>' containment reference.
   * @see #getCi()
   * @generated
   */
  void setCi(CommaItem value);

} // GenBound
