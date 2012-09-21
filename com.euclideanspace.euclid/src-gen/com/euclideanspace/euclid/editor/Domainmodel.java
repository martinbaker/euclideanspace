/**
 */
package com.euclideanspace.euclid.editor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domainmodel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.euclid.editor.Domainmodel#getPackages <em>Packages</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.editor.Domainmodel#getImports <em>Imports</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.editor.Domainmodel#getClasses <em>Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.euclid.editor.EditorPackage#getDomainmodel()
 * @model
 * @generated
 */
public interface Domainmodel extends EObject
{
  /**
   * Returns the value of the '<em><b>Packages</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.euclid.editor.PackageDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Packages</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Packages</em>' containment reference list.
   * @see com.euclideanspace.euclid.editor.EditorPackage#getDomainmodel_Packages()
   * @model containment="true"
   * @generated
   */
  EList<PackageDeclaration> getPackages();

  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.euclid.editor.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see com.euclideanspace.euclid.editor.EditorPackage#getDomainmodel_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImports();

  /**
   * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.euclid.editor.Class}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Classes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Classes</em>' containment reference list.
   * @see com.euclideanspace.euclid.editor.EditorPackage#getDomainmodel_Classes()
   * @model containment="true"
   * @generated
   */
  EList<com.euclideanspace.euclid.editor.Class> getClasses();

} // Domainmodel
