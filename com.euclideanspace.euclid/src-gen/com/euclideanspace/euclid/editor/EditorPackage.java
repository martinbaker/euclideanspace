/**
 */
package com.euclideanspace.euclid.editor;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.euclideanspace.euclid.editor.EditorFactory
 * @model kind="package"
 * @generated
 */
public interface EditorPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "editor";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.euclideanspace.com/euclid/Editor";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "editor";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EditorPackage eINSTANCE = com.euclideanspace.euclid.editor.impl.EditorPackageImpl.init();

  /**
   * The meta object id for the '{@link com.euclideanspace.euclid.editor.impl.DomainmodelImpl <em>Domainmodel</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.euclid.editor.impl.DomainmodelImpl
   * @see com.euclideanspace.euclid.editor.impl.EditorPackageImpl#getDomainmodel()
   * @generated
   */
  int DOMAINMODEL = 0;

  /**
   * The feature id for the '<em><b>Packages</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAINMODEL__PACKAGES = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAINMODEL__IMPORTS = 1;

  /**
   * The feature id for the '<em><b>Classes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAINMODEL__CLASSES = 2;

  /**
   * The number of structural features of the '<em>Domainmodel</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAINMODEL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.euclideanspace.euclid.editor.impl.PackageDeclarationImpl <em>Package Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.euclid.editor.impl.PackageDeclarationImpl
   * @see com.euclideanspace.euclid.editor.impl.EditorPackageImpl#getPackageDeclaration()
   * @generated
   */
  int PACKAGE_DECLARATION = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION__NAME = 0;

  /**
   * The number of structural features of the '<em>Package Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.euclideanspace.euclid.editor.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.euclid.editor.impl.ImportImpl
   * @see com.euclideanspace.euclid.editor.impl.EditorPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 2;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORTED_NAMESPACE = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.euclideanspace.euclid.editor.impl.ClassImpl <em>Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.euclid.editor.impl.ClassImpl
   * @see com.euclideanspace.euclid.editor.impl.EditorPackageImpl#getClass_()
   * @generated
   */
  int CLASS = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__NAME = 0;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__SUPER_TYPE = 1;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__VARIABLES = 2;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__VALUES = 3;

  /**
   * The feature id for the '<em><b>References</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__REFERENCES = 4;

  /**
   * The feature id for the '<em><b>Functions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__FUNCTIONS = 5;

  /**
   * The number of structural features of the '<em>Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link com.euclideanspace.euclid.editor.impl.VariableDefImpl <em>Variable Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.euclid.editor.impl.VariableDefImpl
   * @see com.euclideanspace.euclid.editor.impl.EditorPackageImpl#getVariableDef()
   * @generated
   */
  int VARIABLE_DEF = 4;

  /**
   * The feature id for the '<em><b>Varname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEF__VARNAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEF__TYPE = 1;

  /**
   * The feature id for the '<em><b>Vars</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEF__VARS = 2;

  /**
   * The number of structural features of the '<em>Variable Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEF_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.euclideanspace.euclid.editor.impl.ValueDefImpl <em>Value Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.euclid.editor.impl.ValueDefImpl
   * @see com.euclideanspace.euclid.editor.impl.EditorPackageImpl#getValueDef()
   * @generated
   */
  int VALUE_DEF = 5;

  /**
   * The feature id for the '<em><b>Valname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_DEF__VALNAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_DEF__TYPE = 1;

  /**
   * The feature id for the '<em><b>Vals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_DEF__VALS = 2;

  /**
   * The number of structural features of the '<em>Value Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_DEF_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.euclideanspace.euclid.editor.impl.ReferenceImpl <em>Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.euclid.editor.impl.ReferenceImpl
   * @see com.euclideanspace.euclid.editor.impl.EditorPackageImpl#getReference()
   * @generated
   */
  int REFERENCE = 6;

  /**
   * The feature id for the '<em><b>Refname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__REFNAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__TYPE = 1;

  /**
   * The feature id for the '<em><b>Refs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__REFS = 2;

  /**
   * The number of structural features of the '<em>Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.euclideanspace.euclid.editor.impl.FunctionDefImpl <em>Function Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.euclid.editor.impl.FunctionDefImpl
   * @see com.euclideanspace.euclid.editor.impl.EditorPackageImpl#getFunctionDef()
   * @generated
   */
  int FUNCTION_DEF = 7;

  /**
   * The feature id for the '<em><b>Defname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DEF__DEFNAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DEF__TYPE = 1;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DEF__FEATURES = 2;

  /**
   * The number of structural features of the '<em>Function Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DEF_FEATURE_COUNT = 3;


  /**
   * Returns the meta object for class '{@link com.euclideanspace.euclid.editor.Domainmodel <em>Domainmodel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Domainmodel</em>'.
   * @see com.euclideanspace.euclid.editor.Domainmodel
   * @generated
   */
  EClass getDomainmodel();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.euclid.editor.Domainmodel#getPackages <em>Packages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Packages</em>'.
   * @see com.euclideanspace.euclid.editor.Domainmodel#getPackages()
   * @see #getDomainmodel()
   * @generated
   */
  EReference getDomainmodel_Packages();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.euclid.editor.Domainmodel#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see com.euclideanspace.euclid.editor.Domainmodel#getImports()
   * @see #getDomainmodel()
   * @generated
   */
  EReference getDomainmodel_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.euclid.editor.Domainmodel#getClasses <em>Classes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Classes</em>'.
   * @see com.euclideanspace.euclid.editor.Domainmodel#getClasses()
   * @see #getDomainmodel()
   * @generated
   */
  EReference getDomainmodel_Classes();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.euclid.editor.PackageDeclaration <em>Package Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package Declaration</em>'.
   * @see com.euclideanspace.euclid.editor.PackageDeclaration
   * @generated
   */
  EClass getPackageDeclaration();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.euclid.editor.PackageDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.euclideanspace.euclid.editor.PackageDeclaration#getName()
   * @see #getPackageDeclaration()
   * @generated
   */
  EAttribute getPackageDeclaration_Name();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.euclid.editor.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see com.euclideanspace.euclid.editor.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.euclid.editor.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see com.euclideanspace.euclid.editor.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.euclid.editor.Class <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class</em>'.
   * @see com.euclideanspace.euclid.editor.Class
   * @generated
   */
  EClass getClass_();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.euclid.editor.Class#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.euclideanspace.euclid.editor.Class#getName()
   * @see #getClass_()
   * @generated
   */
  EAttribute getClass_Name();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.euclid.editor.Class#getSuperType <em>Super Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Super Type</em>'.
   * @see com.euclideanspace.euclid.editor.Class#getSuperType()
   * @see #getClass_()
   * @generated
   */
  EReference getClass_SuperType();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.euclid.editor.Class#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variables</em>'.
   * @see com.euclideanspace.euclid.editor.Class#getVariables()
   * @see #getClass_()
   * @generated
   */
  EReference getClass_Variables();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.euclid.editor.Class#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see com.euclideanspace.euclid.editor.Class#getValues()
   * @see #getClass_()
   * @generated
   */
  EReference getClass_Values();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.euclid.editor.Class#getReferences <em>References</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>References</em>'.
   * @see com.euclideanspace.euclid.editor.Class#getReferences()
   * @see #getClass_()
   * @generated
   */
  EReference getClass_References();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.euclid.editor.Class#getFunctions <em>Functions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Functions</em>'.
   * @see com.euclideanspace.euclid.editor.Class#getFunctions()
   * @see #getClass_()
   * @generated
   */
  EReference getClass_Functions();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.euclid.editor.VariableDef <em>Variable Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Def</em>'.
   * @see com.euclideanspace.euclid.editor.VariableDef
   * @generated
   */
  EClass getVariableDef();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.euclid.editor.VariableDef#getVarname <em>Varname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Varname</em>'.
   * @see com.euclideanspace.euclid.editor.VariableDef#getVarname()
   * @see #getVariableDef()
   * @generated
   */
  EAttribute getVariableDef_Varname();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.euclid.editor.VariableDef#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see com.euclideanspace.euclid.editor.VariableDef#getType()
   * @see #getVariableDef()
   * @generated
   */
  EReference getVariableDef_Type();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.euclid.editor.VariableDef#getVars <em>Vars</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Vars</em>'.
   * @see com.euclideanspace.euclid.editor.VariableDef#getVars()
   * @see #getVariableDef()
   * @generated
   */
  EReference getVariableDef_Vars();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.euclid.editor.ValueDef <em>Value Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value Def</em>'.
   * @see com.euclideanspace.euclid.editor.ValueDef
   * @generated
   */
  EClass getValueDef();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.euclid.editor.ValueDef#getValname <em>Valname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Valname</em>'.
   * @see com.euclideanspace.euclid.editor.ValueDef#getValname()
   * @see #getValueDef()
   * @generated
   */
  EAttribute getValueDef_Valname();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.euclid.editor.ValueDef#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see com.euclideanspace.euclid.editor.ValueDef#getType()
   * @see #getValueDef()
   * @generated
   */
  EReference getValueDef_Type();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.euclid.editor.ValueDef#getVals <em>Vals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Vals</em>'.
   * @see com.euclideanspace.euclid.editor.ValueDef#getVals()
   * @see #getValueDef()
   * @generated
   */
  EReference getValueDef_Vals();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.euclid.editor.Reference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reference</em>'.
   * @see com.euclideanspace.euclid.editor.Reference
   * @generated
   */
  EClass getReference();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.euclid.editor.Reference#getRefname <em>Refname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Refname</em>'.
   * @see com.euclideanspace.euclid.editor.Reference#getRefname()
   * @see #getReference()
   * @generated
   */
  EAttribute getReference_Refname();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.euclid.editor.Reference#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see com.euclideanspace.euclid.editor.Reference#getType()
   * @see #getReference()
   * @generated
   */
  EReference getReference_Type();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.euclid.editor.Reference#getRefs <em>Refs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Refs</em>'.
   * @see com.euclideanspace.euclid.editor.Reference#getRefs()
   * @see #getReference()
   * @generated
   */
  EReference getReference_Refs();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.euclid.editor.FunctionDef <em>Function Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Def</em>'.
   * @see com.euclideanspace.euclid.editor.FunctionDef
   * @generated
   */
  EClass getFunctionDef();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.euclid.editor.FunctionDef#getDefname <em>Defname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Defname</em>'.
   * @see com.euclideanspace.euclid.editor.FunctionDef#getDefname()
   * @see #getFunctionDef()
   * @generated
   */
  EAttribute getFunctionDef_Defname();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.euclid.editor.FunctionDef#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see com.euclideanspace.euclid.editor.FunctionDef#getType()
   * @see #getFunctionDef()
   * @generated
   */
  EReference getFunctionDef_Type();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.euclid.editor.FunctionDef#getFeatures <em>Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Features</em>'.
   * @see com.euclideanspace.euclid.editor.FunctionDef#getFeatures()
   * @see #getFunctionDef()
   * @generated
   */
  EReference getFunctionDef_Features();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  EditorFactory getEditorFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.euclideanspace.euclid.editor.impl.DomainmodelImpl <em>Domainmodel</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.euclid.editor.impl.DomainmodelImpl
     * @see com.euclideanspace.euclid.editor.impl.EditorPackageImpl#getDomainmodel()
     * @generated
     */
    EClass DOMAINMODEL = eINSTANCE.getDomainmodel();

    /**
     * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAINMODEL__PACKAGES = eINSTANCE.getDomainmodel_Packages();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAINMODEL__IMPORTS = eINSTANCE.getDomainmodel_Imports();

    /**
     * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAINMODEL__CLASSES = eINSTANCE.getDomainmodel_Classes();

    /**
     * The meta object literal for the '{@link com.euclideanspace.euclid.editor.impl.PackageDeclarationImpl <em>Package Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.euclid.editor.impl.PackageDeclarationImpl
     * @see com.euclideanspace.euclid.editor.impl.EditorPackageImpl#getPackageDeclaration()
     * @generated
     */
    EClass PACKAGE_DECLARATION = eINSTANCE.getPackageDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PACKAGE_DECLARATION__NAME = eINSTANCE.getPackageDeclaration_Name();

    /**
     * The meta object literal for the '{@link com.euclideanspace.euclid.editor.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.euclid.editor.impl.ImportImpl
     * @see com.euclideanspace.euclid.editor.impl.EditorPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

    /**
     * The meta object literal for the '{@link com.euclideanspace.euclid.editor.impl.ClassImpl <em>Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.euclid.editor.impl.ClassImpl
     * @see com.euclideanspace.euclid.editor.impl.EditorPackageImpl#getClass_()
     * @generated
     */
    EClass CLASS = eINSTANCE.getClass_();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS__NAME = eINSTANCE.getClass_Name();

    /**
     * The meta object literal for the '<em><b>Super Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS__SUPER_TYPE = eINSTANCE.getClass_SuperType();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS__VARIABLES = eINSTANCE.getClass_Variables();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS__VALUES = eINSTANCE.getClass_Values();

    /**
     * The meta object literal for the '<em><b>References</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS__REFERENCES = eINSTANCE.getClass_References();

    /**
     * The meta object literal for the '<em><b>Functions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS__FUNCTIONS = eINSTANCE.getClass_Functions();

    /**
     * The meta object literal for the '{@link com.euclideanspace.euclid.editor.impl.VariableDefImpl <em>Variable Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.euclid.editor.impl.VariableDefImpl
     * @see com.euclideanspace.euclid.editor.impl.EditorPackageImpl#getVariableDef()
     * @generated
     */
    EClass VARIABLE_DEF = eINSTANCE.getVariableDef();

    /**
     * The meta object literal for the '<em><b>Varname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_DEF__VARNAME = eINSTANCE.getVariableDef_Varname();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_DEF__TYPE = eINSTANCE.getVariableDef_Type();

    /**
     * The meta object literal for the '<em><b>Vars</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_DEF__VARS = eINSTANCE.getVariableDef_Vars();

    /**
     * The meta object literal for the '{@link com.euclideanspace.euclid.editor.impl.ValueDefImpl <em>Value Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.euclid.editor.impl.ValueDefImpl
     * @see com.euclideanspace.euclid.editor.impl.EditorPackageImpl#getValueDef()
     * @generated
     */
    EClass VALUE_DEF = eINSTANCE.getValueDef();

    /**
     * The meta object literal for the '<em><b>Valname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VALUE_DEF__VALNAME = eINSTANCE.getValueDef_Valname();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VALUE_DEF__TYPE = eINSTANCE.getValueDef_Type();

    /**
     * The meta object literal for the '<em><b>Vals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VALUE_DEF__VALS = eINSTANCE.getValueDef_Vals();

    /**
     * The meta object literal for the '{@link com.euclideanspace.euclid.editor.impl.ReferenceImpl <em>Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.euclid.editor.impl.ReferenceImpl
     * @see com.euclideanspace.euclid.editor.impl.EditorPackageImpl#getReference()
     * @generated
     */
    EClass REFERENCE = eINSTANCE.getReference();

    /**
     * The meta object literal for the '<em><b>Refname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REFERENCE__REFNAME = eINSTANCE.getReference_Refname();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCE__TYPE = eINSTANCE.getReference_Type();

    /**
     * The meta object literal for the '<em><b>Refs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCE__REFS = eINSTANCE.getReference_Refs();

    /**
     * The meta object literal for the '{@link com.euclideanspace.euclid.editor.impl.FunctionDefImpl <em>Function Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.euclid.editor.impl.FunctionDefImpl
     * @see com.euclideanspace.euclid.editor.impl.EditorPackageImpl#getFunctionDef()
     * @generated
     */
    EClass FUNCTION_DEF = eINSTANCE.getFunctionDef();

    /**
     * The meta object literal for the '<em><b>Defname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_DEF__DEFNAME = eINSTANCE.getFunctionDef_Defname();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_DEF__TYPE = eINSTANCE.getFunctionDef_Type();

    /**
     * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_DEF__FEATURES = eINSTANCE.getFunctionDef_Features();

  }

} //EditorPackage
