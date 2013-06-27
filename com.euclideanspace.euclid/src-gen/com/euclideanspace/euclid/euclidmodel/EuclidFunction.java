/**
 */
package com.euclideanspace.euclid.euclidmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.xtext.common.types.JvmTypeParameter;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmVisibility;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Euclid Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.euclid.euclidmodel.EuclidFunction#isOverride <em>Override</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.euclidmodel.EuclidFunction#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.euclidmodel.EuclidFunction#isStatic <em>Static</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.euclidmodel.EuclidFunction#isDispatch <em>Dispatch</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.euclidmodel.EuclidFunction#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.euclidmodel.EuclidFunction#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.euclidmodel.EuclidFunction#getCreateExtensionInfo <em>Create Extension Info</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.euclidmodel.EuclidFunction#getName <em>Name</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.euclidmodel.EuclidFunction#getParameters <em>Parameters</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.euclidmodel.EuclidFunction#getExceptions <em>Exceptions</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.euclidmodel.EuclidFunction#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.euclid.euclidmodel.EuclidmodelPackage#getEuclidFunction()
 * @model
 * @generated
 */
public interface EuclidFunction extends EuclidMember
{
  /**
   * Returns the value of the '<em><b>Override</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Override</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Override</em>' attribute.
   * @see #setOverride(boolean)
   * @see com.euclideanspace.euclid.euclidmodel.EuclidmodelPackage#getEuclidFunction_Override()
   * @model
   * @generated
   */
  boolean isOverride();

  /**
   * Sets the value of the '{@link com.euclideanspace.euclid.euclidmodel.EuclidFunction#isOverride <em>Override</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Override</em>' attribute.
   * @see #isOverride()
   * @generated
   */
  void setOverride(boolean value);

  /**
   * Returns the value of the '<em><b>Visibility</b></em>' attribute.
   * The literals are from the enumeration {@link org.eclipse.xtext.common.types.JvmVisibility}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Visibility</em>' attribute.
   * @see org.eclipse.xtext.common.types.JvmVisibility
   * @see #setVisibility(JvmVisibility)
   * @see com.euclideanspace.euclid.euclidmodel.EuclidmodelPackage#getEuclidFunction_Visibility()
   * @model
   * @generated
   */
  JvmVisibility getVisibility();

  /**
   * Sets the value of the '{@link com.euclideanspace.euclid.euclidmodel.EuclidFunction#getVisibility <em>Visibility</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Visibility</em>' attribute.
   * @see org.eclipse.xtext.common.types.JvmVisibility
   * @see #getVisibility()
   * @generated
   */
  void setVisibility(JvmVisibility value);

  /**
   * Returns the value of the '<em><b>Static</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Static</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Static</em>' attribute.
   * @see #setStatic(boolean)
   * @see com.euclideanspace.euclid.euclidmodel.EuclidmodelPackage#getEuclidFunction_Static()
   * @model
   * @generated
   */
  boolean isStatic();

  /**
   * Sets the value of the '{@link com.euclideanspace.euclid.euclidmodel.EuclidFunction#isStatic <em>Static</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Static</em>' attribute.
   * @see #isStatic()
   * @generated
   */
  void setStatic(boolean value);

  /**
   * Returns the value of the '<em><b>Dispatch</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dispatch</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dispatch</em>' attribute.
   * @see #setDispatch(boolean)
   * @see com.euclideanspace.euclid.euclidmodel.EuclidmodelPackage#getEuclidFunction_Dispatch()
   * @model
   * @generated
   */
  boolean isDispatch();

  /**
   * Sets the value of the '{@link com.euclideanspace.euclid.euclidmodel.EuclidFunction#isDispatch <em>Dispatch</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dispatch</em>' attribute.
   * @see #isDispatch()
   * @generated
   */
  void setDispatch(boolean value);

  /**
   * Returns the value of the '<em><b>Type Parameters</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.common.types.JvmTypeParameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Parameters</em>' containment reference list.
   * @see com.euclideanspace.euclid.euclidmodel.EuclidmodelPackage#getEuclidFunction_TypeParameters()
   * @model containment="true"
   * @generated
   */
  EList<JvmTypeParameter> getTypeParameters();

  /**
   * Returns the value of the '<em><b>Return Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Return Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return Type</em>' containment reference.
   * @see #setReturnType(JvmTypeReference)
   * @see com.euclideanspace.euclid.euclidmodel.EuclidmodelPackage#getEuclidFunction_ReturnType()
   * @model containment="true"
   * @generated
   */
  JvmTypeReference getReturnType();

  /**
   * Sets the value of the '{@link com.euclideanspace.euclid.euclidmodel.EuclidFunction#getReturnType <em>Return Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return Type</em>' containment reference.
   * @see #getReturnType()
   * @generated
   */
  void setReturnType(JvmTypeReference value);

  /**
   * Returns the value of the '<em><b>Create Extension Info</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Create Extension Info</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Create Extension Info</em>' containment reference.
   * @see #setCreateExtensionInfo(CreateExtensionInfo)
   * @see com.euclideanspace.euclid.euclidmodel.EuclidmodelPackage#getEuclidFunction_CreateExtensionInfo()
   * @model containment="true"
   * @generated
   */
  CreateExtensionInfo getCreateExtensionInfo();

  /**
   * Sets the value of the '{@link com.euclideanspace.euclid.euclidmodel.EuclidFunction#getCreateExtensionInfo <em>Create Extension Info</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Create Extension Info</em>' containment reference.
   * @see #getCreateExtensionInfo()
   * @generated
   */
  void setCreateExtensionInfo(CreateExtensionInfo value);

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
   * @see com.euclideanspace.euclid.euclidmodel.EuclidmodelPackage#getEuclidFunction_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.euclideanspace.euclid.euclidmodel.EuclidFunction#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.euclid.euclidmodel.EuclidParameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see com.euclideanspace.euclid.euclidmodel.EuclidmodelPackage#getEuclidFunction_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<EuclidParameter> getParameters();

  /**
   * Returns the value of the '<em><b>Exceptions</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.common.types.JvmTypeReference}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exceptions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exceptions</em>' containment reference list.
   * @see com.euclideanspace.euclid.euclidmodel.EuclidmodelPackage#getEuclidFunction_Exceptions()
   * @model containment="true"
   * @generated
   */
  EList<JvmTypeReference> getExceptions();

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(XExpression)
   * @see com.euclideanspace.euclid.euclidmodel.EuclidmodelPackage#getEuclidFunction_Expression()
   * @model containment="true"
   * @generated
   */
  XExpression getExpression();

  /**
   * Sets the value of the '{@link com.euclideanspace.euclid.euclidmodel.EuclidFunction#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(XExpression value);

} // EuclidFunction
