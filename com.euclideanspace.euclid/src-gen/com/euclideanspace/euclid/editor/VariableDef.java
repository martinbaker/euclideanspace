/**
 */
package com.euclideanspace.euclid.editor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmTypeReference;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.euclid.editor.VariableDef#getVarname <em>Varname</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.editor.VariableDef#getType <em>Type</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.editor.VariableDef#getVars <em>Vars</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.euclid.editor.EditorPackage#getVariableDef()
 * @model
 * @generated
 */
public interface VariableDef extends EObject
{
  /**
   * Returns the value of the '<em><b>Varname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Varname</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Varname</em>' attribute.
   * @see #setVarname(String)
   * @see com.euclideanspace.euclid.editor.EditorPackage#getVariableDef_Varname()
   * @model
   * @generated
   */
  String getVarname();

  /**
   * Sets the value of the '{@link com.euclideanspace.euclid.editor.VariableDef#getVarname <em>Varname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Varname</em>' attribute.
   * @see #getVarname()
   * @generated
   */
  void setVarname(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(JvmTypeReference)
   * @see com.euclideanspace.euclid.editor.EditorPackage#getVariableDef_Type()
   * @model containment="true"
   * @generated
   */
  JvmTypeReference getType();

  /**
   * Sets the value of the '{@link com.euclideanspace.euclid.editor.VariableDef#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(JvmTypeReference value);

  /**
   * Returns the value of the '<em><b>Vars</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.xbase.XExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vars</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vars</em>' containment reference list.
   * @see com.euclideanspace.euclid.editor.EditorPackage#getVariableDef_Vars()
   * @model containment="true"
   * @generated
   */
  EList<XExpression> getVars();

} // VariableDef
