/**
 */
package com.euclideanspace.euclid.euclidmodel.impl;

import com.euclideanspace.euclid.euclidmodel.CreateExtensionInfo;
import com.euclideanspace.euclid.euclidmodel.EuclidAnnotationType;
import com.euclideanspace.euclid.euclidmodel.EuclidClass;
import com.euclideanspace.euclid.euclidmodel.EuclidConstructor;
import com.euclideanspace.euclid.euclidmodel.EuclidDeclaration;
import com.euclideanspace.euclid.euclidmodel.EuclidEnum;
import com.euclideanspace.euclid.euclidmodel.EuclidField;
import com.euclideanspace.euclid.euclidmodel.EuclidFile;
import com.euclideanspace.euclid.euclidmodel.EuclidFunction;
import com.euclideanspace.euclid.euclidmodel.EuclidImport;
import com.euclideanspace.euclid.euclidmodel.EuclidInnerClass;
import com.euclideanspace.euclid.euclidmodel.EuclidInterface;
import com.euclideanspace.euclid.euclidmodel.EuclidMember;
import com.euclideanspace.euclid.euclidmodel.EuclidParameter;
import com.euclideanspace.euclid.euclidmodel.EuclidTypeDeclaration;
import com.euclideanspace.euclid.euclidmodel.EuclidmodelFactory;
import com.euclideanspace.euclid.euclidmodel.EuclidmodelPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.xtext.common.types.TypesPackage;

import org.eclipse.xtext.xbase.XbasePackage;

import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotationsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EuclidmodelPackageImpl extends EPackageImpl implements EuclidmodelPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass euclidFileEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass euclidImportEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass euclidTypeDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass euclidFieldEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass euclidMemberEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass euclidDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass createExtensionInfoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass euclidParameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass euclidClassEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass euclidInterfaceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass euclidEnumEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass euclidAnnotationTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass euclidInnerClassEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass euclidFunctionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass euclidConstructorEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see com.euclideanspace.euclid.euclidmodel.EuclidmodelPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private EuclidmodelPackageImpl()
  {
    super(eNS_URI, EuclidmodelFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link EuclidmodelPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static EuclidmodelPackage init()
  {
    if (isInited) return (EuclidmodelPackage)EPackage.Registry.INSTANCE.getEPackage(EuclidmodelPackage.eNS_URI);

    // Obtain or create and register package
    EuclidmodelPackageImpl theEuclidmodelPackage = (EuclidmodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EuclidmodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EuclidmodelPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    XAnnotationsPackage.eINSTANCE.eClass();
    XbasePackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theEuclidmodelPackage.createPackageContents();

    // Initialize created meta-data
    theEuclidmodelPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theEuclidmodelPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(EuclidmodelPackage.eNS_URI, theEuclidmodelPackage);
    return theEuclidmodelPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEuclidFile()
  {
    return euclidFileEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEuclidFile_Package()
  {
    return (EAttribute)euclidFileEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEuclidFile_Imports()
  {
    return (EReference)euclidFileEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEuclidFile_EuclidTypes()
  {
    return (EReference)euclidFileEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEuclidImport()
  {
    return euclidImportEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEuclidImport_ImportedType()
  {
    return (EReference)euclidImportEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEuclidImport_ImportedNamespace()
  {
    return (EAttribute)euclidImportEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEuclidTypeDeclaration()
  {
    return euclidTypeDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEuclidTypeDeclaration_Annotations()
  {
    return (EReference)euclidTypeDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEuclidTypeDeclaration_AnnotationInfo()
  {
    return (EReference)euclidTypeDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEuclidTypeDeclaration_Name()
  {
    return (EAttribute)euclidTypeDeclarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEuclidField()
  {
    return euclidFieldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEuclidField_Type()
  {
    return (EReference)euclidFieldEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEuclidField_Final()
  {
    return (EAttribute)euclidFieldEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEuclidField_Name()
  {
    return (EAttribute)euclidFieldEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEuclidField_InitialValue()
  {
    return (EReference)euclidFieldEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEuclidField_Visibility()
  {
    return (EAttribute)euclidFieldEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEuclidField_Extension()
  {
    return (EAttribute)euclidFieldEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEuclidField_Static()
  {
    return (EAttribute)euclidFieldEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEuclidMember()
  {
    return euclidMemberEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEuclidMember_Annotations()
  {
    return (EReference)euclidMemberEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEuclidMember_AnnotationInfo()
  {
    return (EReference)euclidMemberEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEuclidDeclaration()
  {
    return euclidDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEuclidDeclaration_Visibility()
  {
    return (EAttribute)euclidDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEuclidDeclaration_Extension()
  {
    return (EAttribute)euclidDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEuclidDeclaration_Final()
  {
    return (EAttribute)euclidDeclarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEuclidDeclaration_Type()
  {
    return (EReference)euclidDeclarationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEuclidDeclaration_Name()
  {
    return (EAttribute)euclidDeclarationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEuclidDeclaration_Static()
  {
    return (EAttribute)euclidDeclarationEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEuclidDeclaration_Override()
  {
    return (EAttribute)euclidDeclarationEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEuclidDeclaration_Dispatch()
  {
    return (EAttribute)euclidDeclarationEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEuclidDeclaration_TypeParameters()
  {
    return (EReference)euclidDeclarationEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEuclidDeclaration_ReturnType()
  {
    return (EReference)euclidDeclarationEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEuclidDeclaration_CreateExtensionInfo()
  {
    return (EReference)euclidDeclarationEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEuclidDeclaration_Parameters()
  {
    return (EReference)euclidDeclarationEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEuclidDeclaration_Exceptions()
  {
    return (EReference)euclidDeclarationEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCreateExtensionInfo()
  {
    return createExtensionInfoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCreateExtensionInfo_Name()
  {
    return (EAttribute)createExtensionInfoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCreateExtensionInfo_CreateExpression()
  {
    return (EReference)createExtensionInfoEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEuclidParameter()
  {
    return euclidParameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEuclidParameter_Annotations()
  {
    return (EReference)euclidParameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEuclidParameter_ParameterType()
  {
    return (EReference)euclidParameterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEuclidParameter_VarArg()
  {
    return (EAttribute)euclidParameterEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEuclidParameter_Name()
  {
    return (EAttribute)euclidParameterEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEuclidClass()
  {
    return euclidClassEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEuclidClass_Abstract()
  {
    return (EAttribute)euclidClassEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEuclidClass_TypeParameters()
  {
    return (EReference)euclidClassEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEuclidClass_Extends()
  {
    return (EReference)euclidClassEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEuclidClass_Implements()
  {
    return (EReference)euclidClassEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEuclidClass_Members()
  {
    return (EReference)euclidClassEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEuclidInterface()
  {
    return euclidInterfaceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEuclidInterface_Abstract()
  {
    return (EAttribute)euclidInterfaceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEuclidInterface_TypeParameters()
  {
    return (EReference)euclidInterfaceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEuclidInterface_Implements()
  {
    return (EReference)euclidInterfaceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEuclidInterface_Declarations()
  {
    return (EReference)euclidInterfaceEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEuclidEnum()
  {
    return euclidEnumEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEuclidEnum_Abstract()
  {
    return (EAttribute)euclidEnumEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEuclidEnum_TypeParameters()
  {
    return (EReference)euclidEnumEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEuclidEnum_EnumConstants()
  {
    return (EAttribute)euclidEnumEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEuclidAnnotationType()
  {
    return euclidAnnotationTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEuclidAnnotationType_Members()
  {
    return (EReference)euclidAnnotationTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEuclidInnerClass()
  {
    return euclidInnerClassEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEuclidInnerClass_Name()
  {
    return (EAttribute)euclidInnerClassEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEuclidInnerClass_TypeParameters()
  {
    return (EReference)euclidInnerClassEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEuclidInnerClass_Extends()
  {
    return (EReference)euclidInnerClassEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEuclidInnerClass_Implements()
  {
    return (EReference)euclidInnerClassEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEuclidInnerClass_Members()
  {
    return (EReference)euclidInnerClassEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEuclidFunction()
  {
    return euclidFunctionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEuclidFunction_Override()
  {
    return (EAttribute)euclidFunctionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEuclidFunction_Visibility()
  {
    return (EAttribute)euclidFunctionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEuclidFunction_Static()
  {
    return (EAttribute)euclidFunctionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEuclidFunction_Dispatch()
  {
    return (EAttribute)euclidFunctionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEuclidFunction_TypeParameters()
  {
    return (EReference)euclidFunctionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEuclidFunction_ReturnType()
  {
    return (EReference)euclidFunctionEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEuclidFunction_CreateExtensionInfo()
  {
    return (EReference)euclidFunctionEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEuclidFunction_Name()
  {
    return (EAttribute)euclidFunctionEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEuclidFunction_Parameters()
  {
    return (EReference)euclidFunctionEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEuclidFunction_Exceptions()
  {
    return (EReference)euclidFunctionEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEuclidFunction_Expression()
  {
    return (EReference)euclidFunctionEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEuclidConstructor()
  {
    return euclidConstructorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEuclidConstructor_Visibility()
  {
    return (EAttribute)euclidConstructorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEuclidConstructor_TypeParameters()
  {
    return (EReference)euclidConstructorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEuclidConstructor_Parameters()
  {
    return (EReference)euclidConstructorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEuclidConstructor_Exceptions()
  {
    return (EReference)euclidConstructorEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEuclidConstructor_Expression()
  {
    return (EReference)euclidConstructorEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EuclidmodelFactory getEuclidmodelFactory()
  {
    return (EuclidmodelFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    euclidFileEClass = createEClass(EUCLID_FILE);
    createEAttribute(euclidFileEClass, EUCLID_FILE__PACKAGE);
    createEReference(euclidFileEClass, EUCLID_FILE__IMPORTS);
    createEReference(euclidFileEClass, EUCLID_FILE__EUCLID_TYPES);

    euclidImportEClass = createEClass(EUCLID_IMPORT);
    createEReference(euclidImportEClass, EUCLID_IMPORT__IMPORTED_TYPE);
    createEAttribute(euclidImportEClass, EUCLID_IMPORT__IMPORTED_NAMESPACE);

    euclidTypeDeclarationEClass = createEClass(EUCLID_TYPE_DECLARATION);
    createEReference(euclidTypeDeclarationEClass, EUCLID_TYPE_DECLARATION__ANNOTATIONS);
    createEReference(euclidTypeDeclarationEClass, EUCLID_TYPE_DECLARATION__ANNOTATION_INFO);
    createEAttribute(euclidTypeDeclarationEClass, EUCLID_TYPE_DECLARATION__NAME);

    euclidFieldEClass = createEClass(EUCLID_FIELD);
    createEReference(euclidFieldEClass, EUCLID_FIELD__TYPE);
    createEAttribute(euclidFieldEClass, EUCLID_FIELD__FINAL);
    createEAttribute(euclidFieldEClass, EUCLID_FIELD__NAME);
    createEReference(euclidFieldEClass, EUCLID_FIELD__INITIAL_VALUE);
    createEAttribute(euclidFieldEClass, EUCLID_FIELD__VISIBILITY);
    createEAttribute(euclidFieldEClass, EUCLID_FIELD__EXTENSION);
    createEAttribute(euclidFieldEClass, EUCLID_FIELD__STATIC);

    euclidMemberEClass = createEClass(EUCLID_MEMBER);
    createEReference(euclidMemberEClass, EUCLID_MEMBER__ANNOTATIONS);
    createEReference(euclidMemberEClass, EUCLID_MEMBER__ANNOTATION_INFO);

    euclidDeclarationEClass = createEClass(EUCLID_DECLARATION);
    createEAttribute(euclidDeclarationEClass, EUCLID_DECLARATION__VISIBILITY);
    createEAttribute(euclidDeclarationEClass, EUCLID_DECLARATION__EXTENSION);
    createEAttribute(euclidDeclarationEClass, EUCLID_DECLARATION__FINAL);
    createEReference(euclidDeclarationEClass, EUCLID_DECLARATION__TYPE);
    createEAttribute(euclidDeclarationEClass, EUCLID_DECLARATION__NAME);
    createEAttribute(euclidDeclarationEClass, EUCLID_DECLARATION__STATIC);
    createEAttribute(euclidDeclarationEClass, EUCLID_DECLARATION__OVERRIDE);
    createEAttribute(euclidDeclarationEClass, EUCLID_DECLARATION__DISPATCH);
    createEReference(euclidDeclarationEClass, EUCLID_DECLARATION__TYPE_PARAMETERS);
    createEReference(euclidDeclarationEClass, EUCLID_DECLARATION__RETURN_TYPE);
    createEReference(euclidDeclarationEClass, EUCLID_DECLARATION__CREATE_EXTENSION_INFO);
    createEReference(euclidDeclarationEClass, EUCLID_DECLARATION__PARAMETERS);
    createEReference(euclidDeclarationEClass, EUCLID_DECLARATION__EXCEPTIONS);

    createExtensionInfoEClass = createEClass(CREATE_EXTENSION_INFO);
    createEAttribute(createExtensionInfoEClass, CREATE_EXTENSION_INFO__NAME);
    createEReference(createExtensionInfoEClass, CREATE_EXTENSION_INFO__CREATE_EXPRESSION);

    euclidParameterEClass = createEClass(EUCLID_PARAMETER);
    createEReference(euclidParameterEClass, EUCLID_PARAMETER__ANNOTATIONS);
    createEReference(euclidParameterEClass, EUCLID_PARAMETER__PARAMETER_TYPE);
    createEAttribute(euclidParameterEClass, EUCLID_PARAMETER__VAR_ARG);
    createEAttribute(euclidParameterEClass, EUCLID_PARAMETER__NAME);

    euclidClassEClass = createEClass(EUCLID_CLASS);
    createEAttribute(euclidClassEClass, EUCLID_CLASS__ABSTRACT);
    createEReference(euclidClassEClass, EUCLID_CLASS__TYPE_PARAMETERS);
    createEReference(euclidClassEClass, EUCLID_CLASS__EXTENDS);
    createEReference(euclidClassEClass, EUCLID_CLASS__IMPLEMENTS);
    createEReference(euclidClassEClass, EUCLID_CLASS__MEMBERS);

    euclidInterfaceEClass = createEClass(EUCLID_INTERFACE);
    createEAttribute(euclidInterfaceEClass, EUCLID_INTERFACE__ABSTRACT);
    createEReference(euclidInterfaceEClass, EUCLID_INTERFACE__TYPE_PARAMETERS);
    createEReference(euclidInterfaceEClass, EUCLID_INTERFACE__IMPLEMENTS);
    createEReference(euclidInterfaceEClass, EUCLID_INTERFACE__DECLARATIONS);

    euclidEnumEClass = createEClass(EUCLID_ENUM);
    createEAttribute(euclidEnumEClass, EUCLID_ENUM__ABSTRACT);
    createEReference(euclidEnumEClass, EUCLID_ENUM__TYPE_PARAMETERS);
    createEAttribute(euclidEnumEClass, EUCLID_ENUM__ENUM_CONSTANTS);

    euclidAnnotationTypeEClass = createEClass(EUCLID_ANNOTATION_TYPE);
    createEReference(euclidAnnotationTypeEClass, EUCLID_ANNOTATION_TYPE__MEMBERS);

    euclidInnerClassEClass = createEClass(EUCLID_INNER_CLASS);
    createEAttribute(euclidInnerClassEClass, EUCLID_INNER_CLASS__NAME);
    createEReference(euclidInnerClassEClass, EUCLID_INNER_CLASS__TYPE_PARAMETERS);
    createEReference(euclidInnerClassEClass, EUCLID_INNER_CLASS__EXTENDS);
    createEReference(euclidInnerClassEClass, EUCLID_INNER_CLASS__IMPLEMENTS);
    createEReference(euclidInnerClassEClass, EUCLID_INNER_CLASS__MEMBERS);

    euclidFunctionEClass = createEClass(EUCLID_FUNCTION);
    createEAttribute(euclidFunctionEClass, EUCLID_FUNCTION__OVERRIDE);
    createEAttribute(euclidFunctionEClass, EUCLID_FUNCTION__VISIBILITY);
    createEAttribute(euclidFunctionEClass, EUCLID_FUNCTION__STATIC);
    createEAttribute(euclidFunctionEClass, EUCLID_FUNCTION__DISPATCH);
    createEReference(euclidFunctionEClass, EUCLID_FUNCTION__TYPE_PARAMETERS);
    createEReference(euclidFunctionEClass, EUCLID_FUNCTION__RETURN_TYPE);
    createEReference(euclidFunctionEClass, EUCLID_FUNCTION__CREATE_EXTENSION_INFO);
    createEAttribute(euclidFunctionEClass, EUCLID_FUNCTION__NAME);
    createEReference(euclidFunctionEClass, EUCLID_FUNCTION__PARAMETERS);
    createEReference(euclidFunctionEClass, EUCLID_FUNCTION__EXCEPTIONS);
    createEReference(euclidFunctionEClass, EUCLID_FUNCTION__EXPRESSION);

    euclidConstructorEClass = createEClass(EUCLID_CONSTRUCTOR);
    createEAttribute(euclidConstructorEClass, EUCLID_CONSTRUCTOR__VISIBILITY);
    createEReference(euclidConstructorEClass, EUCLID_CONSTRUCTOR__TYPE_PARAMETERS);
    createEReference(euclidConstructorEClass, EUCLID_CONSTRUCTOR__PARAMETERS);
    createEReference(euclidConstructorEClass, EUCLID_CONSTRUCTOR__EXCEPTIONS);
    createEReference(euclidConstructorEClass, EUCLID_CONSTRUCTOR__EXPRESSION);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
    XAnnotationsPackage theXAnnotationsPackage = (XAnnotationsPackage)EPackage.Registry.INSTANCE.getEPackage(XAnnotationsPackage.eNS_URI);
    XbasePackage theXbasePackage = (XbasePackage)EPackage.Registry.INSTANCE.getEPackage(XbasePackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    euclidFieldEClass.getESuperTypes().add(this.getEuclidMember());
    euclidClassEClass.getESuperTypes().add(this.getEuclidTypeDeclaration());
    euclidInterfaceEClass.getESuperTypes().add(this.getEuclidTypeDeclaration());
    euclidEnumEClass.getESuperTypes().add(this.getEuclidTypeDeclaration());
    euclidAnnotationTypeEClass.getESuperTypes().add(this.getEuclidTypeDeclaration());
    euclidInnerClassEClass.getESuperTypes().add(this.getEuclidMember());
    euclidFunctionEClass.getESuperTypes().add(this.getEuclidMember());
    euclidConstructorEClass.getESuperTypes().add(this.getEuclidMember());

    // Initialize classes and features; add operations and parameters
    initEClass(euclidFileEClass, EuclidFile.class, "EuclidFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEuclidFile_Package(), ecorePackage.getEString(), "package", null, 0, 1, EuclidFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEuclidFile_Imports(), this.getEuclidImport(), null, "imports", null, 0, -1, EuclidFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEuclidFile_EuclidTypes(), this.getEuclidTypeDeclaration(), null, "euclidTypes", null, 0, -1, EuclidFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(euclidImportEClass, EuclidImport.class, "EuclidImport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEuclidImport_ImportedType(), theTypesPackage.getJvmType(), null, "importedType", null, 0, 1, EuclidImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEuclidImport_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace", null, 0, 1, EuclidImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(euclidTypeDeclarationEClass, EuclidTypeDeclaration.class, "EuclidTypeDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEuclidTypeDeclaration_Annotations(), theXAnnotationsPackage.getXAnnotation(), null, "annotations", null, 0, -1, EuclidTypeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEuclidTypeDeclaration_AnnotationInfo(), this.getEuclidTypeDeclaration(), null, "annotationInfo", null, 0, 1, EuclidTypeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEuclidTypeDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, EuclidTypeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(euclidFieldEClass, EuclidField.class, "EuclidField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEuclidField_Type(), theTypesPackage.getJvmTypeReference(), null, "type", null, 0, 1, EuclidField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEuclidField_Final(), ecorePackage.getEBoolean(), "final", null, 0, 1, EuclidField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEuclidField_Name(), ecorePackage.getEString(), "name", null, 0, 1, EuclidField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEuclidField_InitialValue(), theXbasePackage.getXExpression(), null, "initialValue", null, 0, 1, EuclidField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEuclidField_Visibility(), theTypesPackage.getJvmVisibility(), "visibility", null, 0, 1, EuclidField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEuclidField_Extension(), ecorePackage.getEBoolean(), "extension", null, 0, 1, EuclidField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEuclidField_Static(), ecorePackage.getEBoolean(), "static", null, 0, 1, EuclidField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(euclidMemberEClass, EuclidMember.class, "EuclidMember", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEuclidMember_Annotations(), theXAnnotationsPackage.getXAnnotation(), null, "annotations", null, 0, -1, EuclidMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEuclidMember_AnnotationInfo(), this.getEuclidMember(), null, "annotationInfo", null, 0, 1, EuclidMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(euclidDeclarationEClass, EuclidDeclaration.class, "EuclidDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEuclidDeclaration_Visibility(), theTypesPackage.getJvmVisibility(), "visibility", null, 0, 1, EuclidDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEuclidDeclaration_Extension(), ecorePackage.getEBoolean(), "extension", null, 0, 1, EuclidDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEuclidDeclaration_Final(), ecorePackage.getEBoolean(), "final", null, 0, 1, EuclidDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEuclidDeclaration_Type(), theTypesPackage.getJvmTypeReference(), null, "type", null, 0, 1, EuclidDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEuclidDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, EuclidDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEuclidDeclaration_Static(), ecorePackage.getEBoolean(), "static", null, 0, 1, EuclidDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEuclidDeclaration_Override(), ecorePackage.getEBoolean(), "override", null, 0, 1, EuclidDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEuclidDeclaration_Dispatch(), ecorePackage.getEBoolean(), "dispatch", null, 0, 1, EuclidDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEuclidDeclaration_TypeParameters(), theTypesPackage.getJvmTypeParameter(), null, "typeParameters", null, 0, -1, EuclidDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEuclidDeclaration_ReturnType(), theTypesPackage.getJvmTypeReference(), null, "returnType", null, 0, 1, EuclidDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEuclidDeclaration_CreateExtensionInfo(), this.getCreateExtensionInfo(), null, "createExtensionInfo", null, 0, 1, EuclidDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEuclidDeclaration_Parameters(), this.getEuclidParameter(), null, "parameters", null, 0, -1, EuclidDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEuclidDeclaration_Exceptions(), theTypesPackage.getJvmTypeReference(), null, "exceptions", null, 0, -1, EuclidDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(createExtensionInfoEClass, CreateExtensionInfo.class, "CreateExtensionInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCreateExtensionInfo_Name(), ecorePackage.getEString(), "name", null, 0, 1, CreateExtensionInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCreateExtensionInfo_CreateExpression(), theXbasePackage.getXExpression(), null, "createExpression", null, 0, 1, CreateExtensionInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(euclidParameterEClass, EuclidParameter.class, "EuclidParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEuclidParameter_Annotations(), theXAnnotationsPackage.getXAnnotation(), null, "annotations", null, 0, -1, EuclidParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEuclidParameter_ParameterType(), theTypesPackage.getJvmTypeReference(), null, "parameterType", null, 0, 1, EuclidParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEuclidParameter_VarArg(), ecorePackage.getEBoolean(), "varArg", null, 0, 1, EuclidParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEuclidParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, EuclidParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(euclidClassEClass, EuclidClass.class, "EuclidClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEuclidClass_Abstract(), ecorePackage.getEBoolean(), "abstract", null, 0, 1, EuclidClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEuclidClass_TypeParameters(), theTypesPackage.getJvmTypeParameter(), null, "typeParameters", null, 0, -1, EuclidClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEuclidClass_Extends(), theTypesPackage.getJvmParameterizedTypeReference(), null, "extends", null, 0, 1, EuclidClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEuclidClass_Implements(), theTypesPackage.getJvmParameterizedTypeReference(), null, "implements", null, 0, -1, EuclidClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEuclidClass_Members(), this.getEuclidMember(), null, "members", null, 0, -1, EuclidClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(euclidInterfaceEClass, EuclidInterface.class, "EuclidInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEuclidInterface_Abstract(), ecorePackage.getEBoolean(), "abstract", null, 0, 1, EuclidInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEuclidInterface_TypeParameters(), theTypesPackage.getJvmTypeParameter(), null, "typeParameters", null, 0, -1, EuclidInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEuclidInterface_Implements(), theTypesPackage.getJvmParameterizedTypeReference(), null, "implements", null, 0, -1, EuclidInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEuclidInterface_Declarations(), this.getEuclidDeclaration(), null, "declarations", null, 0, -1, EuclidInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(euclidEnumEClass, EuclidEnum.class, "EuclidEnum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEuclidEnum_Abstract(), ecorePackage.getEBoolean(), "abstract", null, 0, 1, EuclidEnum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEuclidEnum_TypeParameters(), theTypesPackage.getJvmTypeParameter(), null, "typeParameters", null, 0, -1, EuclidEnum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEuclidEnum_EnumConstants(), ecorePackage.getEString(), "enumConstants", null, 0, -1, EuclidEnum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(euclidAnnotationTypeEClass, EuclidAnnotationType.class, "EuclidAnnotationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEuclidAnnotationType_Members(), this.getEuclidField(), null, "members", null, 0, -1, EuclidAnnotationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(euclidInnerClassEClass, EuclidInnerClass.class, "EuclidInnerClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEuclidInnerClass_Name(), ecorePackage.getEString(), "name", null, 0, 1, EuclidInnerClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEuclidInnerClass_TypeParameters(), theTypesPackage.getJvmTypeParameter(), null, "typeParameters", null, 0, -1, EuclidInnerClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEuclidInnerClass_Extends(), theTypesPackage.getJvmParameterizedTypeReference(), null, "extends", null, 0, 1, EuclidInnerClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEuclidInnerClass_Implements(), theTypesPackage.getJvmParameterizedTypeReference(), null, "implements", null, 0, -1, EuclidInnerClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEuclidInnerClass_Members(), this.getEuclidMember(), null, "members", null, 0, -1, EuclidInnerClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(euclidFunctionEClass, EuclidFunction.class, "EuclidFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEuclidFunction_Override(), ecorePackage.getEBoolean(), "override", null, 0, 1, EuclidFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEuclidFunction_Visibility(), theTypesPackage.getJvmVisibility(), "visibility", null, 0, 1, EuclidFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEuclidFunction_Static(), ecorePackage.getEBoolean(), "static", null, 0, 1, EuclidFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEuclidFunction_Dispatch(), ecorePackage.getEBoolean(), "dispatch", null, 0, 1, EuclidFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEuclidFunction_TypeParameters(), theTypesPackage.getJvmTypeParameter(), null, "typeParameters", null, 0, -1, EuclidFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEuclidFunction_ReturnType(), theTypesPackage.getJvmTypeReference(), null, "returnType", null, 0, 1, EuclidFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEuclidFunction_CreateExtensionInfo(), this.getCreateExtensionInfo(), null, "createExtensionInfo", null, 0, 1, EuclidFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEuclidFunction_Name(), ecorePackage.getEString(), "name", null, 0, 1, EuclidFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEuclidFunction_Parameters(), this.getEuclidParameter(), null, "parameters", null, 0, -1, EuclidFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEuclidFunction_Exceptions(), theTypesPackage.getJvmTypeReference(), null, "exceptions", null, 0, -1, EuclidFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEuclidFunction_Expression(), theXbasePackage.getXExpression(), null, "expression", null, 0, 1, EuclidFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(euclidConstructorEClass, EuclidConstructor.class, "EuclidConstructor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEuclidConstructor_Visibility(), theTypesPackage.getJvmVisibility(), "visibility", null, 0, 1, EuclidConstructor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEuclidConstructor_TypeParameters(), theTypesPackage.getJvmTypeParameter(), null, "typeParameters", null, 0, -1, EuclidConstructor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEuclidConstructor_Parameters(), this.getEuclidParameter(), null, "parameters", null, 0, -1, EuclidConstructor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEuclidConstructor_Exceptions(), theTypesPackage.getJvmTypeReference(), null, "exceptions", null, 0, -1, EuclidConstructor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEuclidConstructor_Expression(), theXbasePackage.getXExpression(), null, "expression", null, 0, 1, EuclidConstructor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //EuclidmodelPackageImpl
