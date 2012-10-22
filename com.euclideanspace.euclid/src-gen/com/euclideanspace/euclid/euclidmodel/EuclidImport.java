/**
 */
package com.euclideanspace.euclid.euclidmodel;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Euclid Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.euclid.euclidmodel.EuclidImport#isStatic <em>Static</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.euclidmodel.EuclidImport#isExtension <em>Extension</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.euclidmodel.EuclidImport#getImportedType <em>Imported Type</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.euclidmodel.EuclidImport#getImportedNamespace <em>Imported Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.euclid.euclidmodel.EuclidmodelPackage#getEuclidImport()
 * @model
 * @generated
 */
public interface EuclidImport extends EObject
{
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
   * @see com.euclideanspace.euclid.euclidmodel.EuclidmodelPackage#getEuclidImport_Static()
   * @model
   * @generated
   */
  boolean isStatic();

  /**
   * Sets the value of the '{@link com.euclideanspace.euclid.euclidmodel.EuclidImport#isStatic <em>Static</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Static</em>' attribute.
   * @see #isStatic()
   * @generated
   */
  void setStatic(boolean value);

  /**
   * Returns the value of the '<em><b>Extension</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Extension</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extension</em>' attribute.
   * @see #setExtension(boolean)
   * @see com.euclideanspace.euclid.euclidmodel.EuclidmodelPackage#getEuclidImport_Extension()
   * @model
   * @generated
   */
  boolean isExtension();

  /**
   * Sets the value of the '{@link com.euclideanspace.euclid.euclidmodel.EuclidImport#isExtension <em>Extension</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Extension</em>' attribute.
   * @see #isExtension()
   * @generated
   */
  void setExtension(boolean value);

  /**
   * Returns the value of the '<em><b>Imported Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imported Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imported Type</em>' reference.
   * @see #setImportedType(JvmType)
   * @see com.euclideanspace.euclid.euclidmodel.EuclidmodelPackage#getEuclidImport_ImportedType()
   * @model
   * @generated
   */
  JvmType getImportedType();

  /**
   * Sets the value of the '{@link com.euclideanspace.euclid.euclidmodel.EuclidImport#getImportedType <em>Imported Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Imported Type</em>' reference.
   * @see #getImportedType()
   * @generated
   */
  void setImportedType(JvmType value);

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
   * @see com.euclideanspace.euclid.euclidmodel.EuclidmodelPackage#getEuclidImport_ImportedNamespace()
   * @model
   * @generated
   */
  String getImportedNamespace();

  /**
   * Sets the value of the '{@link com.euclideanspace.euclid.euclidmodel.EuclidImport#getImportedNamespace <em>Imported Namespace</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Imported Namespace</em>' attribute.
   * @see #getImportedNamespace()
   * @generated
   */
  void setImportedNamespace(String value);

} // EuclidImport
