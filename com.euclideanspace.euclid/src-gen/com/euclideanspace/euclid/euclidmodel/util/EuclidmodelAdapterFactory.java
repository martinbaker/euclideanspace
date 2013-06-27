/**
 */
package com.euclideanspace.euclid.euclidmodel.util;

import com.euclideanspace.euclid.euclidmodel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.euclideanspace.euclid.euclidmodel.EuclidmodelPackage
 * @generated
 */
public class EuclidmodelAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static EuclidmodelPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EuclidmodelAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = EuclidmodelPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EuclidmodelSwitch<Adapter> modelSwitch =
    new EuclidmodelSwitch<Adapter>()
    {
      @Override
      public Adapter caseEuclidFile(EuclidFile object)
      {
        return createEuclidFileAdapter();
      }
      @Override
      public Adapter caseEuclidImport(EuclidImport object)
      {
        return createEuclidImportAdapter();
      }
      @Override
      public Adapter caseEuclidTypeDeclaration(EuclidTypeDeclaration object)
      {
        return createEuclidTypeDeclarationAdapter();
      }
      @Override
      public Adapter caseEuclidField(EuclidField object)
      {
        return createEuclidFieldAdapter();
      }
      @Override
      public Adapter caseEuclidMember(EuclidMember object)
      {
        return createEuclidMemberAdapter();
      }
      @Override
      public Adapter caseEuclidDeclaration(EuclidDeclaration object)
      {
        return createEuclidDeclarationAdapter();
      }
      @Override
      public Adapter caseCreateExtensionInfo(CreateExtensionInfo object)
      {
        return createCreateExtensionInfoAdapter();
      }
      @Override
      public Adapter caseEuclidParameter(EuclidParameter object)
      {
        return createEuclidParameterAdapter();
      }
      @Override
      public Adapter caseEuclidClass(EuclidClass object)
      {
        return createEuclidClassAdapter();
      }
      @Override
      public Adapter caseEuclidInterface(EuclidInterface object)
      {
        return createEuclidInterfaceAdapter();
      }
      @Override
      public Adapter caseEuclidEnum(EuclidEnum object)
      {
        return createEuclidEnumAdapter();
      }
      @Override
      public Adapter caseEuclidAnnotationType(EuclidAnnotationType object)
      {
        return createEuclidAnnotationTypeAdapter();
      }
      @Override
      public Adapter caseEuclidInnerClass(EuclidInnerClass object)
      {
        return createEuclidInnerClassAdapter();
      }
      @Override
      public Adapter caseEuclidFunction(EuclidFunction object)
      {
        return createEuclidFunctionAdapter();
      }
      @Override
      public Adapter caseEuclidConstructor(EuclidConstructor object)
      {
        return createEuclidConstructorAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.euclid.euclidmodel.EuclidFile <em>Euclid File</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.euclid.euclidmodel.EuclidFile
   * @generated
   */
  public Adapter createEuclidFileAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.euclid.euclidmodel.EuclidImport <em>Euclid Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.euclid.euclidmodel.EuclidImport
   * @generated
   */
  public Adapter createEuclidImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.euclid.euclidmodel.EuclidTypeDeclaration <em>Euclid Type Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.euclid.euclidmodel.EuclidTypeDeclaration
   * @generated
   */
  public Adapter createEuclidTypeDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.euclid.euclidmodel.EuclidField <em>Euclid Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.euclid.euclidmodel.EuclidField
   * @generated
   */
  public Adapter createEuclidFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.euclid.euclidmodel.EuclidMember <em>Euclid Member</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.euclid.euclidmodel.EuclidMember
   * @generated
   */
  public Adapter createEuclidMemberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.euclid.euclidmodel.EuclidDeclaration <em>Euclid Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.euclid.euclidmodel.EuclidDeclaration
   * @generated
   */
  public Adapter createEuclidDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.euclid.euclidmodel.CreateExtensionInfo <em>Create Extension Info</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.euclid.euclidmodel.CreateExtensionInfo
   * @generated
   */
  public Adapter createCreateExtensionInfoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.euclid.euclidmodel.EuclidParameter <em>Euclid Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.euclid.euclidmodel.EuclidParameter
   * @generated
   */
  public Adapter createEuclidParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.euclid.euclidmodel.EuclidClass <em>Euclid Class</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.euclid.euclidmodel.EuclidClass
   * @generated
   */
  public Adapter createEuclidClassAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.euclid.euclidmodel.EuclidInterface <em>Euclid Interface</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.euclid.euclidmodel.EuclidInterface
   * @generated
   */
  public Adapter createEuclidInterfaceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.euclid.euclidmodel.EuclidEnum <em>Euclid Enum</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.euclid.euclidmodel.EuclidEnum
   * @generated
   */
  public Adapter createEuclidEnumAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.euclid.euclidmodel.EuclidAnnotationType <em>Euclid Annotation Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.euclid.euclidmodel.EuclidAnnotationType
   * @generated
   */
  public Adapter createEuclidAnnotationTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.euclid.euclidmodel.EuclidInnerClass <em>Euclid Inner Class</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.euclid.euclidmodel.EuclidInnerClass
   * @generated
   */
  public Adapter createEuclidInnerClassAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.euclid.euclidmodel.EuclidFunction <em>Euclid Function</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.euclid.euclidmodel.EuclidFunction
   * @generated
   */
  public Adapter createEuclidFunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.euclid.euclidmodel.EuclidConstructor <em>Euclid Constructor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.euclid.euclidmodel.EuclidConstructor
   * @generated
   */
  public Adapter createEuclidConstructorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //EuclidmodelAdapterFactory
