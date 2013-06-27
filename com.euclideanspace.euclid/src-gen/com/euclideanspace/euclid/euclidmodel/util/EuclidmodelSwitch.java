/**
 */
package com.euclideanspace.euclid.euclidmodel.util;

import com.euclideanspace.euclid.euclidmodel.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.euclideanspace.euclid.euclidmodel.EuclidmodelPackage
 * @generated
 */
public class EuclidmodelSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static EuclidmodelPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EuclidmodelSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = EuclidmodelPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case EuclidmodelPackage.EUCLID_FILE:
      {
        EuclidFile euclidFile = (EuclidFile)theEObject;
        T result = caseEuclidFile(euclidFile);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EuclidmodelPackage.EUCLID_IMPORT:
      {
        EuclidImport euclidImport = (EuclidImport)theEObject;
        T result = caseEuclidImport(euclidImport);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EuclidmodelPackage.EUCLID_TYPE_DECLARATION:
      {
        EuclidTypeDeclaration euclidTypeDeclaration = (EuclidTypeDeclaration)theEObject;
        T result = caseEuclidTypeDeclaration(euclidTypeDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EuclidmodelPackage.EUCLID_FIELD:
      {
        EuclidField euclidField = (EuclidField)theEObject;
        T result = caseEuclidField(euclidField);
        if (result == null) result = caseEuclidMember(euclidField);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EuclidmodelPackage.EUCLID_MEMBER:
      {
        EuclidMember euclidMember = (EuclidMember)theEObject;
        T result = caseEuclidMember(euclidMember);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EuclidmodelPackage.EUCLID_DECLARATION:
      {
        EuclidDeclaration euclidDeclaration = (EuclidDeclaration)theEObject;
        T result = caseEuclidDeclaration(euclidDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EuclidmodelPackage.CREATE_EXTENSION_INFO:
      {
        CreateExtensionInfo createExtensionInfo = (CreateExtensionInfo)theEObject;
        T result = caseCreateExtensionInfo(createExtensionInfo);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EuclidmodelPackage.EUCLID_PARAMETER:
      {
        EuclidParameter euclidParameter = (EuclidParameter)theEObject;
        T result = caseEuclidParameter(euclidParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EuclidmodelPackage.EUCLID_CLASS:
      {
        EuclidClass euclidClass = (EuclidClass)theEObject;
        T result = caseEuclidClass(euclidClass);
        if (result == null) result = caseEuclidTypeDeclaration(euclidClass);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EuclidmodelPackage.EUCLID_INTERFACE:
      {
        EuclidInterface euclidInterface = (EuclidInterface)theEObject;
        T result = caseEuclidInterface(euclidInterface);
        if (result == null) result = caseEuclidTypeDeclaration(euclidInterface);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EuclidmodelPackage.EUCLID_ENUM:
      {
        EuclidEnum euclidEnum = (EuclidEnum)theEObject;
        T result = caseEuclidEnum(euclidEnum);
        if (result == null) result = caseEuclidTypeDeclaration(euclidEnum);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EuclidmodelPackage.EUCLID_ANNOTATION_TYPE:
      {
        EuclidAnnotationType euclidAnnotationType = (EuclidAnnotationType)theEObject;
        T result = caseEuclidAnnotationType(euclidAnnotationType);
        if (result == null) result = caseEuclidTypeDeclaration(euclidAnnotationType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EuclidmodelPackage.EUCLID_INNER_CLASS:
      {
        EuclidInnerClass euclidInnerClass = (EuclidInnerClass)theEObject;
        T result = caseEuclidInnerClass(euclidInnerClass);
        if (result == null) result = caseEuclidMember(euclidInnerClass);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EuclidmodelPackage.EUCLID_FUNCTION:
      {
        EuclidFunction euclidFunction = (EuclidFunction)theEObject;
        T result = caseEuclidFunction(euclidFunction);
        if (result == null) result = caseEuclidMember(euclidFunction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EuclidmodelPackage.EUCLID_CONSTRUCTOR:
      {
        EuclidConstructor euclidConstructor = (EuclidConstructor)theEObject;
        T result = caseEuclidConstructor(euclidConstructor);
        if (result == null) result = caseEuclidMember(euclidConstructor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Euclid File</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Euclid File</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEuclidFile(EuclidFile object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Euclid Import</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Euclid Import</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEuclidImport(EuclidImport object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Euclid Type Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Euclid Type Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEuclidTypeDeclaration(EuclidTypeDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Euclid Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Euclid Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEuclidField(EuclidField object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Euclid Member</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Euclid Member</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEuclidMember(EuclidMember object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Euclid Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Euclid Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEuclidDeclaration(EuclidDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Create Extension Info</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Create Extension Info</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCreateExtensionInfo(CreateExtensionInfo object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Euclid Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Euclid Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEuclidParameter(EuclidParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Euclid Class</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Euclid Class</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEuclidClass(EuclidClass object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Euclid Interface</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Euclid Interface</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEuclidInterface(EuclidInterface object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Euclid Enum</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Euclid Enum</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEuclidEnum(EuclidEnum object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Euclid Annotation Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Euclid Annotation Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEuclidAnnotationType(EuclidAnnotationType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Euclid Inner Class</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Euclid Inner Class</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEuclidInnerClass(EuclidInnerClass object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Euclid Function</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Euclid Function</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEuclidFunction(EuclidFunction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Euclid Constructor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Euclid Constructor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEuclidConstructor(EuclidConstructor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //EuclidmodelSwitch
