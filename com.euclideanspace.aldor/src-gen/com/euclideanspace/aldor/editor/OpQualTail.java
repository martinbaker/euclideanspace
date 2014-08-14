/**
 */
package com.euclideanspace.aldor.editor;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Op Qual Tail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.OpQualTail#getNam <em>Nam</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.aldor.editor.EditorPackage#getOpQualTail()
 * @model
 * @generated
 */
public interface OpQualTail extends EObject
{
  /**
   * Returns the value of the '<em><b>Nam</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nam</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nam</em>' containment reference.
   * @see #setNam(Molecule)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getOpQualTail_Nam()
   * @model containment="true"
   * @generated
   */
  Molecule getNam();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.OpQualTail#getNam <em>Nam</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nam</em>' containment reference.
   * @see #getNam()
   * @generated
   */
  void setNam(Molecule value);

} // OpQualTail
