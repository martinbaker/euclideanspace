/**
 */
package com.euclideanspace.euclid.euclidmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmVisibility;

import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Euclid Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.euclid.euclidmodel.EuclidMember#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.euclidmodel.EuclidMember#getAnnotationInfo <em>Annotation Info</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.euclidmodel.EuclidMember#getVisibility <em>Visibility</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.euclid.euclidmodel.EuclidmodelPackage#getEuclidMember()
 * @model
 * @generated
 */
public interface EuclidMember extends EObject
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
   * @see com.euclideanspace.euclid.euclidmodel.EuclidmodelPackage#getEuclidMember_Annotations()
   * @model containment="true"
   * @generated
   */
  EList<XAnnotation> getAnnotations();

  /**
   * Returns the value of the '<em><b>Annotation Info</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annotation Info</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Annotation Info</em>' containment reference.
   * @see #setAnnotationInfo(EuclidMember)
   * @see com.euclideanspace.euclid.euclidmodel.EuclidmodelPackage#getEuclidMember_AnnotationInfo()
   * @model containment="true"
   * @generated
   */
  EuclidMember getAnnotationInfo();

  /**
   * Sets the value of the '{@link com.euclideanspace.euclid.euclidmodel.EuclidMember#getAnnotationInfo <em>Annotation Info</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Annotation Info</em>' containment reference.
   * @see #getAnnotationInfo()
   * @generated
   */
  void setAnnotationInfo(EuclidMember value);

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
   * @see com.euclideanspace.euclid.euclidmodel.EuclidmodelPackage#getEuclidMember_Visibility()
   * @model
   * @generated
   */
  JvmVisibility getVisibility();

  /**
   * Sets the value of the '{@link com.euclideanspace.euclid.euclidmodel.EuclidMember#getVisibility <em>Visibility</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Visibility</em>' attribute.
   * @see org.eclipse.xtext.common.types.JvmVisibility
   * @see #getVisibility()
   * @generated
   */
  void setVisibility(JvmVisibility value);

} // EuclidMember
