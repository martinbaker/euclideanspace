/**
 */
package com.euclideanspace.aldor.editor;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Any Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.AnyStatement#getBas <em>Bas</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.aldor.editor.EditorPackage#getAnyStatement()
 * @model
 * @generated
 */
public interface AnyStatement extends EObject
{
  /**
   * Returns the value of the '<em><b>Bas</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bas</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bas</em>' containment reference.
   * @see #setBas(Binding_AnyStatement)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getAnyStatement_Bas()
   * @model containment="true"
   * @generated
   */
  Binding_AnyStatement getBas();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.AnyStatement#getBas <em>Bas</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bas</em>' containment reference.
   * @see #getBas()
   * @generated
   */
  void setBas(Binding_AnyStatement value);

} // AnyStatement
