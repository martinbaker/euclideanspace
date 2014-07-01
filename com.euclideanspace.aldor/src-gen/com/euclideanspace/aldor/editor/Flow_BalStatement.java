/**
 */
package com.euclideanspace.aldor.editor;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow Bal Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.Flow_BalStatement#getBbs4 <em>Bbs4</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.aldor.editor.EditorPackage#getFlow_BalStatement()
 * @model
 * @generated
 */
public interface Flow_BalStatement extends EObject
{
  /**
   * Returns the value of the '<em><b>Bbs4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bbs4</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bbs4</em>' containment reference.
   * @see #setBbs4(Binding_BalStatement)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getFlow_BalStatement_Bbs4()
   * @model containment="true"
   * @generated
   */
  Binding_BalStatement getBbs4();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.Flow_BalStatement#getBbs4 <em>Bbs4</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bbs4</em>' containment reference.
   * @see #getBbs4()
   * @generated
   */
  void setBbs4(Binding_BalStatement value);

} // Flow_BalStatement
