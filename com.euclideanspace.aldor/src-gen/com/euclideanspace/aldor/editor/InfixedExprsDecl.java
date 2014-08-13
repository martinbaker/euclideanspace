/**
 */
package com.euclideanspace.aldor.editor;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Infixed Exprs Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.InfixedExprsDecl#getBas <em>Bas</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.aldor.editor.EditorPackage#getInfixedExprsDecl()
 * @model
 * @generated
 */
public interface InfixedExprsDecl extends BindingR_InfixedExprsDecl_AnyStatement
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
   * @see com.euclideanspace.aldor.editor.EditorPackage#getInfixedExprsDecl_Bas()
   * @model containment="true"
   * @generated
   */
  Binding_AnyStatement getBas();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.InfixedExprsDecl#getBas <em>Bas</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bas</em>' containment reference.
   * @see #getBas()
   * @generated
   */
  void setBas(Binding_AnyStatement value);

} // InfixedExprsDecl
