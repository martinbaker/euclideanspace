/**
 */
package com.euclideanspace.aldor.editor;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Always Part Any Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.AlwaysPart_AnyStatement#getBas7 <em>Bas7</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.aldor.editor.EditorPackage#getAlwaysPart_AnyStatement()
 * @model
 * @generated
 */
public interface AlwaysPart_AnyStatement extends EObject
{
  /**
   * Returns the value of the '<em><b>Bas7</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bas7</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bas7</em>' containment reference.
   * @see #setBas7(Binding_AnyStatement)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getAlwaysPart_AnyStatement_Bas7()
   * @model containment="true"
   * @generated
   */
  Binding_AnyStatement getBas7();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.AlwaysPart_AnyStatement#getBas7 <em>Bas7</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bas7</em>' containment reference.
   * @see #getBas7()
   * @generated
   */
  void setBas7(Binding_AnyStatement value);

} // AlwaysPart_AnyStatement
