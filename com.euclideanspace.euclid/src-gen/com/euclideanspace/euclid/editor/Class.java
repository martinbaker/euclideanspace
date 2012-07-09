/**
 */
package com.euclideanspace.euclid.editor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.euclid.editor.Class#getName <em>Name</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.editor.Class#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.editor.Class#getVariables <em>Variables</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.editor.Class#getValues <em>Values</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.editor.Class#getReferences <em>References</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.editor.Class#getFunctions <em>Functions</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.euclid.editor.EditorPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.euclideanspace.euclid.editor.EditorPackage#getClass_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.euclideanspace.euclid.editor.Class#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Super Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Type</em>' containment reference.
   * @see #setSuperType(JvmTypeReference)
   * @see com.euclideanspace.euclid.editor.EditorPackage#getClass_SuperType()
   * @model containment="true"
   * @generated
   */
  JvmTypeReference getSuperType();

  /**
   * Sets the value of the '{@link com.euclideanspace.euclid.editor.Class#getSuperType <em>Super Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Type</em>' containment reference.
   * @see #getSuperType()
   * @generated
   */
  void setSuperType(JvmTypeReference value);

  /**
   * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.euclid.editor.VariableDef}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variables</em>' containment reference list.
   * @see com.euclideanspace.euclid.editor.EditorPackage#getClass_Variables()
   * @model containment="true"
   * @generated
   */
  EList<VariableDef> getVariables();

  /**
   * Returns the value of the '<em><b>Values</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.euclid.editor.ValueDef}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values</em>' containment reference list.
   * @see com.euclideanspace.euclid.editor.EditorPackage#getClass_Values()
   * @model containment="true"
   * @generated
   */
  EList<ValueDef> getValues();

  /**
   * Returns the value of the '<em><b>References</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.euclid.editor.Reference}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>References</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>References</em>' containment reference list.
   * @see com.euclideanspace.euclid.editor.EditorPackage#getClass_References()
   * @model containment="true"
   * @generated
   */
  EList<Reference> getReferences();

  /**
   * Returns the value of the '<em><b>Functions</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.euclid.editor.FunctionDef}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Functions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Functions</em>' containment reference list.
   * @see com.euclideanspace.euclid.editor.EditorPackage#getClass_Functions()
   * @model containment="true"
   * @generated
   */
  EList<FunctionDef> getFunctions();

} // Class
