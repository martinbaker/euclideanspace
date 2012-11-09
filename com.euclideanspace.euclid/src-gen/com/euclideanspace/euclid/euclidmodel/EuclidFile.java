/**
 */
package com.euclideanspace.euclid.euclidmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Euclid File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.euclid.euclidmodel.EuclidFile#getImportedNamespace <em>Imported Namespace</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.euclidmodel.EuclidFile#getImports <em>Imports</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.euclidmodel.EuclidFile#getEuclidTypes <em>Euclid Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.euclid.euclidmodel.EuclidmodelPackage#getEuclidFile()
 * @model
 * @generated
 */
public interface EuclidFile extends EObject
{
  /**
   * Returns the value of the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imported Namespace</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imported Namespace</em>' attribute.
   * @see #setImportedNamespace(String)
   * @see com.euclideanspace.euclid.euclidmodel.EuclidmodelPackage#getEuclidFile_ImportedNamespace()
   * @model
   * @generated
   */
  String getImportedNamespace();

  /**
   * Sets the value of the '{@link com.euclideanspace.euclid.euclidmodel.EuclidFile#getImportedNamespace <em>Imported Namespace</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Imported Namespace</em>' attribute.
   * @see #getImportedNamespace()
   * @generated
   */
  void setImportedNamespace(String value);

  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.euclid.euclidmodel.EuclidImport}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see com.euclideanspace.euclid.euclidmodel.EuclidmodelPackage#getEuclidFile_Imports()
   * @model containment="true"
   * @generated
   */
  EList<EuclidImport> getImports();

  /**
   * Returns the value of the '<em><b>Euclid Types</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.euclid.euclidmodel.EuclidTypeDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Euclid Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Euclid Types</em>' containment reference list.
   * @see com.euclideanspace.euclid.euclidmodel.EuclidmodelPackage#getEuclidFile_EuclidTypes()
   * @model containment="true"
   * @generated
   */
  EList<EuclidTypeDeclaration> getEuclidTypes();

} // EuclidFile
