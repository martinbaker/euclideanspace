/**
 */
package com.euclideanspace.euclid.editor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmTypeReference;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.euclid.editor.FunctionDef#getDefname <em>Defname</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.editor.FunctionDef#getType <em>Type</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.editor.FunctionDef#getFeatures <em>Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.euclid.editor.EditorPackage#getFunctionDef()
 * @model
 * @generated
 */
public interface FunctionDef extends EObject
{
  /**
   * Returns the value of the '<em><b>Defname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Defname</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Defname</em>' attribute.
   * @see #setDefname(String)
   * @see com.euclideanspace.euclid.editor.EditorPackage#getFunctionDef_Defname()
   * @model
   * @generated
   */
  String getDefname();

  /**
   * Sets the value of the '{@link com.euclideanspace.euclid.editor.FunctionDef#getDefname <em>Defname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Defname</em>' attribute.
   * @see #getDefname()
   * @generated
   */
  void setDefname(String value);

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
   * @see com.euclideanspace.euclid.editor.EditorPackage#getFunctionDef_Type()
   * @model containment="true"
   * @generated
   */
  JvmTypeReference getType();

  /**
   * Sets the value of the '{@link com.euclideanspace.euclid.editor.FunctionDef#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(JvmTypeReference value);

  /**
   * Returns the value of the '<em><b>Features</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.xbase.XExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Features</em>' containment reference list.
   * @see com.euclideanspace.euclid.editor.EditorPackage#getFunctionDef_Features()
   * @model containment="true"
   * @generated
   */
  EList<XExpression> getFeatures();

} // FunctionDef
