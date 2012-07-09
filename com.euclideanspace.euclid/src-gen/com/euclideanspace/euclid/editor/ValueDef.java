/**
 */
package com.euclideanspace.euclid.editor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmTypeReference;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.euclid.editor.ValueDef#getValname <em>Valname</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.editor.ValueDef#getType <em>Type</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.editor.ValueDef#getVals <em>Vals</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.euclid.editor.EditorPackage#getValueDef()
 * @model
 * @generated
 */
public interface ValueDef extends EObject
{
  /**
   * Returns the value of the '<em><b>Valname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Valname</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Valname</em>' attribute.
   * @see #setValname(String)
   * @see com.euclideanspace.euclid.editor.EditorPackage#getValueDef_Valname()
   * @model
   * @generated
   */
  String getValname();

  /**
   * Sets the value of the '{@link com.euclideanspace.euclid.editor.ValueDef#getValname <em>Valname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Valname</em>' attribute.
   * @see #getValname()
   * @generated
   */
  void setValname(String value);

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
   * @see com.euclideanspace.euclid.editor.EditorPackage#getValueDef_Type()
   * @model containment="true"
   * @generated
   */
  JvmTypeReference getType();

  /**
   * Sets the value of the '{@link com.euclideanspace.euclid.editor.ValueDef#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(JvmTypeReference value);

  /**
   * Returns the value of the '<em><b>Vals</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.xbase.XExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vals</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vals</em>' containment reference list.
   * @see com.euclideanspace.euclid.editor.EditorPackage#getValueDef_Vals()
   * @model containment="true"
   * @generated
   */
  EList<XExpression> getVals();

} // ValueDef
