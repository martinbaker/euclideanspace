/**
 */
package com.euclideanspace.euclid.euclidmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Euclid Type Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.euclid.euclidmodel.EuclidTypeDeclaration#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.euclidmodel.EuclidTypeDeclaration#getAnnotationInfo <em>Annotation Info</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.euclidmodel.EuclidTypeDeclaration#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.euclid.euclidmodel.EuclidmodelPackage#getEuclidTypeDeclaration()
 * @model
 * @generated
 */
public interface EuclidTypeDeclaration extends EObject
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
   * @see com.euclideanspace.euclid.euclidmodel.EuclidmodelPackage#getEuclidTypeDeclaration_Annotations()
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
   * @see #setAnnotationInfo(EuclidTypeDeclaration)
   * @see com.euclideanspace.euclid.euclidmodel.EuclidmodelPackage#getEuclidTypeDeclaration_AnnotationInfo()
   * @model containment="true"
   * @generated
   */
  EuclidTypeDeclaration getAnnotationInfo();

  /**
   * Sets the value of the '{@link com.euclideanspace.euclid.euclidmodel.EuclidTypeDeclaration#getAnnotationInfo <em>Annotation Info</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Annotation Info</em>' containment reference.
   * @see #getAnnotationInfo()
   * @generated
   */
  void setAnnotationInfo(EuclidTypeDeclaration value);

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
   * @see com.euclideanspace.euclid.euclidmodel.EuclidmodelPackage#getEuclidTypeDeclaration_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.euclideanspace.euclid.euclidmodel.EuclidTypeDeclaration#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // EuclidTypeDeclaration
