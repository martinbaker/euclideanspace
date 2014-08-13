/**
 */
package com.euclideanspace.aldor.editor;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Iterators</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.Iterators#getBas3 <em>Bas3</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.aldor.editor.EditorPackage#getIterators()
 * @model
 * @generated
 */
public interface Iterators extends Flow_AnyStatement, Flow_BalStatement
{
  /**
   * Returns the value of the '<em><b>Bas3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bas3</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bas3</em>' containment reference.
   * @see #setBas3(Binding_AnyStatement)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getIterators_Bas3()
   * @model containment="true"
   * @generated
   */
  Binding_AnyStatement getBas3();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.Iterators#getBas3 <em>Bas3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bas3</em>' containment reference.
   * @see #getBas3()
   * @generated
   */
  void setBas3(Binding_AnyStatement value);

} // Iterators
