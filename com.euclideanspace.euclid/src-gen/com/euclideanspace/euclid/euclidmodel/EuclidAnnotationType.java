/**
 */
package com.euclideanspace.euclid.euclidmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Euclid Annotation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.euclid.euclidmodel.EuclidAnnotationType#getMembers <em>Members</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.euclid.euclidmodel.EuclidmodelPackage#getEuclidAnnotationType()
 * @model
 * @generated
 */
public interface EuclidAnnotationType extends EuclidTypeDeclaration
{
  /**
   * Returns the value of the '<em><b>Members</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.euclid.euclidmodel.EuclidField}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Members</em>' containment reference list.
   * @see com.euclideanspace.euclid.euclidmodel.EuclidmodelPackage#getEuclidAnnotationType_Members()
   * @model containment="true"
   * @generated
   */
  EList<EuclidField> getMembers();

} // EuclidAnnotationType
