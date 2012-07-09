/**
 */
package com.euclideanspace.euclid.editor.impl;

import com.euclideanspace.euclid.editor.Domainmodel;
import com.euclideanspace.euclid.editor.EditorFactory;
import com.euclideanspace.euclid.editor.EditorPackage;
import com.euclideanspace.euclid.editor.FunctionDef;
import com.euclideanspace.euclid.editor.Import;
import com.euclideanspace.euclid.editor.PackageDeclaration;
import com.euclideanspace.euclid.editor.Reference;
import com.euclideanspace.euclid.editor.ValueDef;
import com.euclideanspace.euclid.editor.VariableDef;

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
public class EditorFactoryImpl extends EFactoryImpl implements EditorFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static EditorFactory init()
  {
    try
    {
      EditorFactory theEditorFactory = (EditorFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.euclideanspace.com/euclid/Editor"); 
      if (theEditorFactory != null)
      {
        return theEditorFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new EditorFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EditorFactoryImpl()
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
      case EditorPackage.DOMAINMODEL: return createDomainmodel();
      case EditorPackage.PACKAGE_DECLARATION: return createPackageDeclaration();
      case EditorPackage.IMPORT: return createImport();
      case EditorPackage.CLASS: return createClass();
      case EditorPackage.VARIABLE_DEF: return createVariableDef();
      case EditorPackage.VALUE_DEF: return createValueDef();
      case EditorPackage.REFERENCE: return createReference();
      case EditorPackage.FUNCTION_DEF: return createFunctionDef();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Domainmodel createDomainmodel()
  {
    DomainmodelImpl domainmodel = new DomainmodelImpl();
    return domainmodel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PackageDeclaration createPackageDeclaration()
  {
    PackageDeclarationImpl packageDeclaration = new PackageDeclarationImpl();
    return packageDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public com.euclideanspace.euclid.editor.Class createClass()
  {
    ClassImpl class_ = new ClassImpl();
    return class_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDef createVariableDef()
  {
    VariableDefImpl variableDef = new VariableDefImpl();
    return variableDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueDef createValueDef()
  {
    ValueDefImpl valueDef = new ValueDefImpl();
    return valueDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Reference createReference()
  {
    ReferenceImpl reference = new ReferenceImpl();
    return reference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionDef createFunctionDef()
  {
    FunctionDefImpl functionDef = new FunctionDefImpl();
    return functionDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EditorPackage getEditorPackage()
  {
    return (EditorPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static EditorPackage getPackage()
  {
    return EditorPackage.eINSTANCE;
  }

} //EditorFactoryImpl
