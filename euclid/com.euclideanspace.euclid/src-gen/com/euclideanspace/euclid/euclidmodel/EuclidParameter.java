/**
 */
package com.euclideanspace.euclid.euclidmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmTypeReference;

import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Euclid Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.euclid.euclidmodel.EuclidParameter#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.euclidmodel.EuclidParameter#getParameterType <em>Parameter Type</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.euclidmodel.EuclidParameter#isVarArg <em>Var Arg</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.euclidmodel.EuclidParameter#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.euclid.euclidmodel.EuclidmodelPackage#getEuclidParameter()
 * @model
 * @generated
 */
public interface EuclidParameter extends EObject
{
  /**
   * Returns the value of the '<em><b>Annotations</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annotations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Annotations</em>' containment reference list.
   * @see com.euclideanspace.euclid.euclidmodel.EuclidmodelPackage#getEuclidParameter_Annotations()
   * @model containment="true"
   * @generated
   */
  EList<XAnnotation> getAnnotations();

  /**
   * Returns the value of the '<em><b>Parameter Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter Type</em>' containment reference.
   * @see #setParameterType(JvmTypeReference)
   * @see com.euclideanspace.euclid.euclidmodel.EuclidmodelPackage#getEuclidParameter_ParameterType()
   * @model containment="true"
   * @generated
   */
  JvmTypeReference getParameterType();

  /**
   * Sets the value of the '{@link com.euclideanspace.euclid.euclidmodel.EuclidParameter#getParameterType <em>Parameter Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter Type</em>' containment reference.
   * @see #getParameterType()
   * @generated
   */
  void setParameterType(JvmTypeReference value);

  /**
   * Returns the value of the '<em><b>Var Arg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var Arg</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var Arg</em>' attribute.
   * @see #setVarArg(boolean)
   * @see com.euclideanspace.euclid.euclidmodel.EuclidmodelPackage#getEuclidParameter_VarArg()
   * @model
   * @generated
   */
  boolean isVarArg();

  /**
   * Sets the value of the '{@link com.euclideanspace.euclid.euclidmodel.EuclidParameter#isVarArg <em>Var Arg</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var Arg</em>' attribute.
   * @see #isVarArg()
   * @generated
   */
  void setVarArg(boolean value);

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
   * @see com.euclideanspace.euclid.euclidmodel.EuclidmodelPackage#getEuclidParameter_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.euclideanspace.euclid.euclidmodel.EuclidParameter#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // EuclidParameter
