/**
 */
package com.euclideanspace.aldor.editor;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Curly Content BLabeled</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.CurlyContentB_Labeled#getPred <em>Pred</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.CurlyContentB_Labeled#getL <em>L</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.CurlyContentB_Labeled#getPd <em>Pd</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.aldor.editor.EditorPackage#getCurlyContentB_Labeled()
 * @model
 * @generated
 */
public interface CurlyContentB_Labeled extends EObject
{
  /**
   * Returns the value of the '<em><b>Pred</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pred</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pred</em>' attribute.
   * @see #setPred(String)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getCurlyContentB_Labeled_Pred()
   * @model
   * @generated
   */
  String getPred();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.CurlyContentB_Labeled#getPred <em>Pred</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pred</em>' attribute.
   * @see #getPred()
   * @generated
   */
  void setPred(String value);

  /**
   * Returns the value of the '<em><b>L</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>L</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>L</em>' containment reference.
   * @see #setL(Labeled)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getCurlyContentB_Labeled_L()
   * @model containment="true"
   * @generated
   */
  Labeled getL();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.CurlyContentB_Labeled#getL <em>L</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>L</em>' containment reference.
   * @see #getL()
   * @generated
   */
  void setL(Labeled value);

  /**
   * Returns the value of the '<em><b>Pd</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pd</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pd</em>' attribute.
   * @see #setPd(String)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getCurlyContentB_Labeled_Pd()
   * @model
   * @generated
   */
  String getPd();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.CurlyContentB_Labeled#getPd <em>Pd</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pd</em>' attribute.
   * @see #getPd()
   * @generated
   */
  void setPd(String value);

} // CurlyContentB_Labeled
