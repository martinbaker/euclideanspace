/**
 */
package com.euclideanspace.aldor.editor;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Iterator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.Iterator#getI <em>I</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.Iterator#getSp <em>Sp</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.aldor.editor.EditorPackage#getIterator()
 * @model
 * @generated
 */
public interface Iterator extends EObject
{
  /**
   * Returns the value of the '<em><b>I</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>I</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>I</em>' attribute.
   * @see #setI(String)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getIterator_I()
   * @model
   * @generated
   */
  String getI();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.Iterator#getI <em>I</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>I</em>' attribute.
   * @see #getI()
   * @generated
   */
  void setI(String value);

  /**
   * Returns the value of the '<em><b>Sp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sp</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sp</em>' attribute.
   * @see #setSp(String)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getIterator_Sp()
   * @model
   * @generated
   */
  String getSp();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.Iterator#getSp <em>Sp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sp</em>' attribute.
   * @see #getSp()
   * @generated
   */
  void setSp(String value);

} // Iterator
