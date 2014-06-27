/**
 */
package com.euclideanspace.euclid.euclidmodel.impl;

import com.euclideanspace.euclid.euclidmodel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EuclidmodelFactoryImpl extends EFactoryImpl implements EuclidmodelFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static EuclidmodelFactory init()
  {
    try
    {
      EuclidmodelFactory theEuclidmodelFactory = (EuclidmodelFactory)EPackage.Registry.INSTANCE.getEFactory(EuclidmodelPackage.eNS_URI);
      if (theEuclidmodelFactory != null)
      {
        return theEuclidmodelFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new EuclidmodelFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EuclidmodelFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case EuclidmodelPackage.EUCLID_FILE: return createEuclidFile();
      case EuclidmodelPackage.EUCLID_IMPORT: return createEuclidImport();
      case EuclidmodelPackage.EUCLID_TYPE_DECLARATION: return createEuclidTypeDeclaration();
      case EuclidmodelPackage.EUCLID_FIELD: return createEuclidField();
      case EuclidmodelPackage.EUCLID_MEMBER: return createEuclidMember();
      case EuclidmodelPackage.CREATE_EXTENSION_INFO: return createCreateExtensionInfo();
      case EuclidmodelPackage.EUCLID_PARAMETER: return createEuclidParameter();
      case EuclidmodelPackage.EUCLID_CLASS: return createEuclidClass();
      case EuclidmodelPackage.EUCLID_ANNOTATION_TYPE: return createEuclidAnnotationType();
      case EuclidmodelPackage.EUCLID_FUNCTION: return createEuclidFunction();
      case EuclidmodelPackage.EUCLID_CONSTRUCTOR: return createEuclidConstructor();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EuclidFile createEuclidFile()
  {
    EuclidFileImpl euclidFile = new EuclidFileImpl();
    return euclidFile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EuclidImport createEuclidImport()
  {
    EuclidImportImpl euclidImport = new EuclidImportImpl();
    return euclidImport;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EuclidTypeDeclaration createEuclidTypeDeclaration()
  {
    EuclidTypeDeclarationImpl euclidTypeDeclaration = new EuclidTypeDeclarationImpl();
    return euclidTypeDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EuclidField createEuclidField()
  {
    EuclidFieldImpl euclidField = new EuclidFieldImpl();
    return euclidField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EuclidMember createEuclidMember()
  {
    EuclidMemberImpl euclidMember = new EuclidMemberImpl();
    return euclidMember;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CreateExtensionInfo createCreateExtensionInfo()
  {
    CreateExtensionInfoImpl createExtensionInfo = new CreateExtensionInfoImpl();
    return createExtensionInfo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EuclidParameter createEuclidParameter()
  {
    EuclidParameterImpl euclidParameter = new EuclidParameterImpl();
    return euclidParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EuclidClass createEuclidClass()
  {
    EuclidClassImpl euclidClass = new EuclidClassImpl();
    return euclidClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EuclidAnnotationType createEuclidAnnotationType()
  {
    EuclidAnnotationTypeImpl euclidAnnotationType = new EuclidAnnotationTypeImpl();
    return euclidAnnotationType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EuclidFunction createEuclidFunction()
  {
    EuclidFunctionImpl euclidFunction = new EuclidFunctionImpl();
    return euclidFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EuclidConstructor createEuclidConstructor()
  {
    EuclidConstructorImpl euclidConstructor = new EuclidConstructorImpl();
    return euclidConstructor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EuclidmodelPackage getEuclidmodelPackage()
  {
    return (EuclidmodelPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static EuclidmodelPackage getPackage()
  {
    return EuclidmodelPackage.eINSTANCE;
  }

} //EuclidmodelFactoryImpl
