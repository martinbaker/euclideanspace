/**
 */
package com.euclideanspace.euclid.euclidmodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.euclideanspace.euclid.euclidmodel.EuclidmodelPackage
 * @generated
 */
public interface EuclidmodelFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EuclidmodelFactory eINSTANCE = com.euclideanspace.euclid.euclidmodel.impl.EuclidmodelFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Euclid File</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Euclid File</em>'.
   * @generated
   */
  EuclidFile createEuclidFile();

  /**
   * Returns a new object of class '<em>Euclid Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Euclid Import</em>'.
   * @generated
   */
  EuclidImport createEuclidImport();

  /**
   * Returns a new object of class '<em>Euclid Type Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Euclid Type Declaration</em>'.
   * @generated
   */
  EuclidTypeDeclaration createEuclidTypeDeclaration();

  /**
   * Returns a new object of class '<em>Euclid Field</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Euclid Field</em>'.
   * @generated
   */
  EuclidField createEuclidField();

  /**
   * Returns a new object of class '<em>Euclid Member</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Euclid Member</em>'.
   * @generated
   */
  EuclidMember createEuclidMember();

  /**
   * Returns a new object of class '<em>Euclid Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Euclid Declaration</em>'.
   * @generated
   */
  EuclidDeclaration createEuclidDeclaration();

  /**
   * Returns a new object of class '<em>Create Extension Info</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Create Extension Info</em>'.
   * @generated
   */
  CreateExtensionInfo createCreateExtensionInfo();

  /**
   * Returns a new object of class '<em>Euclid Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Euclid Parameter</em>'.
   * @generated
   */
  EuclidParameter createEuclidParameter();

  /**
   * Returns a new object of class '<em>Euclid Class</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Euclid Class</em>'.
   * @generated
   */
  EuclidClass createEuclidClass();

  /**
   * Returns a new object of class '<em>Euclid Interface</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Euclid Interface</em>'.
   * @generated
   */
  EuclidInterface createEuclidInterface();

  /**
   * Returns a new object of class '<em>Euclid Enum</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Euclid Enum</em>'.
   * @generated
   */
  EuclidEnum createEuclidEnum();

  /**
   * Returns a new object of class '<em>Euclid Annotation Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Euclid Annotation Type</em>'.
   * @generated
   */
  EuclidAnnotationType createEuclidAnnotationType();

  /**
   * Returns a new object of class '<em>Euclid Inner Class</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Euclid Inner Class</em>'.
   * @generated
   */
  EuclidInnerClass createEuclidInnerClass();

  /**
   * Returns a new object of class '<em>Euclid Function</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Euclid Function</em>'.
   * @generated
   */
  EuclidFunction createEuclidFunction();

  /**
   * Returns a new object of class '<em>Euclid Constructor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Euclid Constructor</em>'.
   * @generated
   */
  EuclidConstructor createEuclidConstructor();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  EuclidmodelPackage getEuclidmodelPackage();

} //EuclidmodelFactory
