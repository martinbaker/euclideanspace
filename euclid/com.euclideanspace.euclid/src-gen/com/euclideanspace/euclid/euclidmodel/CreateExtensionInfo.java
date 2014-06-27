/**
 */
package com.euclideanspace.euclid.euclidmodel;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create Extension Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.euclid.euclidmodel.CreateExtensionInfo#getName <em>Name</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.euclidmodel.CreateExtensionInfo#getCreateExpression <em>Create Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.euclid.euclidmodel.EuclidmodelPackage#getCreateExtensionInfo()
 * @model
 * @generated
 */
public interface CreateExtensionInfo extends EObject
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
   * @see com.euclideanspace.euclid.euclidmodel.EuclidmodelPackage#getCreateExtensionInfo_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.euclideanspace.euclid.euclidmodel.CreateExtensionInfo#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Create Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Create Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Create Expression</em>' containment reference.
   * @see #setCreateExpression(XExpression)
   * @see com.euclideanspace.euclid.euclidmodel.EuclidmodelPackage#getCreateExtensionInfo_CreateExpression()
   * @model containment="true"
   * @generated
   */
  XExpression getCreateExpression();

  /**
   * Sets the value of the '{@link com.euclideanspace.euclid.euclidmodel.CreateExtensionInfo#getCreateExpression <em>Create Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Create Expression</em>' containment reference.
   * @see #getCreateExpression()
   * @generated
   */
  void setCreateExpression(XExpression value);

} // CreateExtensionInfo
