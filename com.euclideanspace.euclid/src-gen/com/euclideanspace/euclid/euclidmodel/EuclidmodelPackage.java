/**
 */
package com.euclideanspace.euclid.euclidmodel;

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
 * @see com.euclideanspace.euclid.euclidmodel.EuclidmodelFactory
 * @model kind="package"
 * @generated
 */
public interface EuclidmodelPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "euclidmodel";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.euclideanspace.com/euclid";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "euclidmodel";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EuclidmodelPackage eINSTANCE = com.euclideanspace.euclid.euclidmodel.impl.EuclidmodelPackageImpl.init();

  /**
   * The meta object id for the '{@link com.euclideanspace.euclid.euclidmodel.impl.EuclidFileImpl <em>Euclid File</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.euclid.euclidmodel.impl.EuclidFileImpl
   * @see com.euclideanspace.euclid.euclidmodel.impl.EuclidmodelPackageImpl#getEuclidFile()
   * @generated
   */
  int EUCLID_FILE = 0;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_FILE__IMPORTED_NAMESPACE = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_FILE__IMPORTS = 1;

  /**
   * The feature id for the '<em><b>Euclid Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_FILE__EUCLID_TYPES = 2;

  /**
   * The number of structural features of the '<em>Euclid File</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_FILE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.euclideanspace.euclid.euclidmodel.impl.EuclidImportImpl <em>Euclid Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.euclid.euclidmodel.impl.EuclidImportImpl
   * @see com.euclideanspace.euclid.euclidmodel.impl.EuclidmodelPackageImpl#getEuclidImport()
   * @generated
   */
  int EUCLID_IMPORT = 1;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_IMPORT__IMPORTED_NAMESPACE = 0;

  /**
   * The number of structural features of the '<em>Euclid Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.euclideanspace.euclid.euclidmodel.impl.EuclidTypeDeclarationImpl <em>Euclid Type Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.euclid.euclidmodel.impl.EuclidTypeDeclarationImpl
   * @see com.euclideanspace.euclid.euclidmodel.impl.EuclidmodelPackageImpl#getEuclidTypeDeclaration()
   * @generated
   */
  int EUCLID_TYPE_DECLARATION = 2;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_TYPE_DECLARATION__ANNOTATIONS = 0;

  /**
   * The feature id for the '<em><b>Annotation Info</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_TYPE_DECLARATION__ANNOTATION_INFO = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_TYPE_DECLARATION__NAME = 2;

  /**
   * The number of structural features of the '<em>Euclid Type Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_TYPE_DECLARATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.euclideanspace.euclid.euclidmodel.impl.EuclidMemberImpl <em>Euclid Member</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.euclid.euclidmodel.impl.EuclidMemberImpl
   * @see com.euclideanspace.euclid.euclidmodel.impl.EuclidmodelPackageImpl#getEuclidMember()
   * @generated
   */
  int EUCLID_MEMBER = 4;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_MEMBER__ANNOTATIONS = 0;

  /**
   * The feature id for the '<em><b>Annotation Info</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_MEMBER__ANNOTATION_INFO = 1;

  /**
   * The feature id for the '<em><b>Visibility</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_MEMBER__VISIBILITY = 2;

  /**
   * The number of structural features of the '<em>Euclid Member</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_MEMBER_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.euclideanspace.euclid.euclidmodel.impl.EuclidFieldImpl <em>Euclid Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.euclid.euclidmodel.impl.EuclidFieldImpl
   * @see com.euclideanspace.euclid.euclidmodel.impl.EuclidmodelPackageImpl#getEuclidField()
   * @generated
   */
  int EUCLID_FIELD = 3;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_FIELD__ANNOTATIONS = EUCLID_MEMBER__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Annotation Info</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_FIELD__ANNOTATION_INFO = EUCLID_MEMBER__ANNOTATION_INFO;

  /**
   * The feature id for the '<em><b>Visibility</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_FIELD__VISIBILITY = EUCLID_MEMBER__VISIBILITY;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_FIELD__TYPE = EUCLID_MEMBER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Final</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_FIELD__FINAL = EUCLID_MEMBER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_FIELD__NAME = EUCLID_MEMBER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_FIELD__INITIAL_VALUE = EUCLID_MEMBER_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Extension</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_FIELD__EXTENSION = EUCLID_MEMBER_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Static</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_FIELD__STATIC = EUCLID_MEMBER_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Euclid Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_FIELD_FEATURE_COUNT = EUCLID_MEMBER_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link com.euclideanspace.euclid.euclidmodel.impl.CreateExtensionInfoImpl <em>Create Extension Info</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.euclid.euclidmodel.impl.CreateExtensionInfoImpl
   * @see com.euclideanspace.euclid.euclidmodel.impl.EuclidmodelPackageImpl#getCreateExtensionInfo()
   * @generated
   */
  int CREATE_EXTENSION_INFO = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_EXTENSION_INFO__NAME = 0;

  /**
   * The feature id for the '<em><b>Create Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_EXTENSION_INFO__CREATE_EXPRESSION = 1;

  /**
   * The number of structural features of the '<em>Create Extension Info</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_EXTENSION_INFO_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.euclideanspace.euclid.euclidmodel.impl.EuclidParameterImpl <em>Euclid Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.euclid.euclidmodel.impl.EuclidParameterImpl
   * @see com.euclideanspace.euclid.euclidmodel.impl.EuclidmodelPackageImpl#getEuclidParameter()
   * @generated
   */
  int EUCLID_PARAMETER = 6;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_PARAMETER__ANNOTATIONS = 0;

  /**
   * The feature id for the '<em><b>Parameter Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_PARAMETER__PARAMETER_TYPE = 1;

  /**
   * The feature id for the '<em><b>Var Arg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_PARAMETER__VAR_ARG = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_PARAMETER__NAME = 3;

  /**
   * The number of structural features of the '<em>Euclid Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_PARAMETER_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link com.euclideanspace.euclid.euclidmodel.impl.EuclidClassImpl <em>Euclid Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.euclid.euclidmodel.impl.EuclidClassImpl
   * @see com.euclideanspace.euclid.euclidmodel.impl.EuclidmodelPackageImpl#getEuclidClass()
   * @generated
   */
  int EUCLID_CLASS = 7;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_CLASS__ANNOTATIONS = EUCLID_TYPE_DECLARATION__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Annotation Info</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_CLASS__ANNOTATION_INFO = EUCLID_TYPE_DECLARATION__ANNOTATION_INFO;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_CLASS__NAME = EUCLID_TYPE_DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_CLASS__ABSTRACT = EUCLID_TYPE_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_CLASS__TYPE_PARAMETERS = EUCLID_TYPE_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Extends</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_CLASS__EXTENDS = EUCLID_TYPE_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Implements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_CLASS__IMPLEMENTS = EUCLID_TYPE_DECLARATION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_CLASS__MEMBERS = EUCLID_TYPE_DECLARATION_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Euclid Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_CLASS_FEATURE_COUNT = EUCLID_TYPE_DECLARATION_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link com.euclideanspace.euclid.euclidmodel.impl.EuclidAnnotationTypeImpl <em>Euclid Annotation Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.euclid.euclidmodel.impl.EuclidAnnotationTypeImpl
   * @see com.euclideanspace.euclid.euclidmodel.impl.EuclidmodelPackageImpl#getEuclidAnnotationType()
   * @generated
   */
  int EUCLID_ANNOTATION_TYPE = 8;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_ANNOTATION_TYPE__ANNOTATIONS = EUCLID_TYPE_DECLARATION__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Annotation Info</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_ANNOTATION_TYPE__ANNOTATION_INFO = EUCLID_TYPE_DECLARATION__ANNOTATION_INFO;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_ANNOTATION_TYPE__NAME = EUCLID_TYPE_DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_ANNOTATION_TYPE__MEMBERS = EUCLID_TYPE_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Euclid Annotation Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_ANNOTATION_TYPE_FEATURE_COUNT = EUCLID_TYPE_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.euclideanspace.euclid.euclidmodel.impl.EuclidFunctionImpl <em>Euclid Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.euclid.euclidmodel.impl.EuclidFunctionImpl
   * @see com.euclideanspace.euclid.euclidmodel.impl.EuclidmodelPackageImpl#getEuclidFunction()
   * @generated
   */
  int EUCLID_FUNCTION = 9;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_FUNCTION__ANNOTATIONS = EUCLID_MEMBER__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Annotation Info</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_FUNCTION__ANNOTATION_INFO = EUCLID_MEMBER__ANNOTATION_INFO;

  /**
   * The feature id for the '<em><b>Visibility</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_FUNCTION__VISIBILITY = EUCLID_MEMBER__VISIBILITY;

  /**
   * The feature id for the '<em><b>Override</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_FUNCTION__OVERRIDE = EUCLID_MEMBER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Static</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_FUNCTION__STATIC = EUCLID_MEMBER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Dispatch</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_FUNCTION__DISPATCH = EUCLID_MEMBER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_FUNCTION__TYPE_PARAMETERS = EUCLID_MEMBER_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Return Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_FUNCTION__RETURN_TYPE = EUCLID_MEMBER_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Create Extension Info</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_FUNCTION__CREATE_EXTENSION_INFO = EUCLID_MEMBER_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_FUNCTION__NAME = EUCLID_MEMBER_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_FUNCTION__PARAMETERS = EUCLID_MEMBER_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Exceptions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_FUNCTION__EXCEPTIONS = EUCLID_MEMBER_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_FUNCTION__EXPRESSION = EUCLID_MEMBER_FEATURE_COUNT + 9;

  /**
   * The number of structural features of the '<em>Euclid Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_FUNCTION_FEATURE_COUNT = EUCLID_MEMBER_FEATURE_COUNT + 10;

  /**
   * The meta object id for the '{@link com.euclideanspace.euclid.euclidmodel.impl.EuclidConstructorImpl <em>Euclid Constructor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.euclid.euclidmodel.impl.EuclidConstructorImpl
   * @see com.euclideanspace.euclid.euclidmodel.impl.EuclidmodelPackageImpl#getEuclidConstructor()
   * @generated
   */
  int EUCLID_CONSTRUCTOR = 10;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_CONSTRUCTOR__ANNOTATIONS = EUCLID_MEMBER__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Annotation Info</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_CONSTRUCTOR__ANNOTATION_INFO = EUCLID_MEMBER__ANNOTATION_INFO;

  /**
   * The feature id for the '<em><b>Visibility</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_CONSTRUCTOR__VISIBILITY = EUCLID_MEMBER__VISIBILITY;

  /**
   * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_CONSTRUCTOR__TYPE_PARAMETERS = EUCLID_MEMBER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_CONSTRUCTOR__PARAMETERS = EUCLID_MEMBER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Exceptions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_CONSTRUCTOR__EXCEPTIONS = EUCLID_MEMBER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_CONSTRUCTOR__EXPRESSION = EUCLID_MEMBER_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Euclid Constructor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_CONSTRUCTOR_FEATURE_COUNT = EUCLID_MEMBER_FEATURE_COUNT + 4;


  /**
   * Returns the meta object for class '{@link com.euclideanspace.euclid.euclidmodel.EuclidFile <em>Euclid File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Euclid File</em>'.
   * @see com.euclideanspace.euclid.euclidmodel.EuclidFile
   * @generated
   */
  EClass getEuclidFile();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.euclid.euclidmodel.EuclidFile#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see com.euclideanspace.euclid.euclidmodel.EuclidFile#getImportedNamespace()
   * @see #getEuclidFile()
   * @generated
   */
  EAttribute getEuclidFile_ImportedNamespace();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.euclid.euclidmodel.EuclidFile#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see com.euclideanspace.euclid.euclidmodel.EuclidFile#getImports()
   * @see #getEuclidFile()
   * @generated
   */
  EReference getEuclidFile_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.euclid.euclidmodel.EuclidFile#getEuclidTypes <em>Euclid Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Euclid Types</em>'.
   * @see com.euclideanspace.euclid.euclidmodel.EuclidFile#getEuclidTypes()
   * @see #getEuclidFile()
   * @generated
   */
  EReference getEuclidFile_EuclidTypes();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.euclid.euclidmodel.EuclidImport <em>Euclid Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Euclid Import</em>'.
   * @see com.euclideanspace.euclid.euclidmodel.EuclidImport
   * @generated
   */
  EClass getEuclidImport();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.euclid.euclidmodel.EuclidImport#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see com.euclideanspace.euclid.euclidmodel.EuclidImport#getImportedNamespace()
   * @see #getEuclidImport()
   * @generated
   */
  EAttribute getEuclidImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.euclid.euclidmodel.EuclidTypeDeclaration <em>Euclid Type Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Euclid Type Declaration</em>'.
   * @see com.euclideanspace.euclid.euclidmodel.EuclidTypeDeclaration
   * @generated
   */
  EClass getEuclidTypeDeclaration();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.euclid.euclidmodel.EuclidTypeDeclaration#getAnnotations <em>Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotations</em>'.
   * @see com.euclideanspace.euclid.euclidmodel.EuclidTypeDeclaration#getAnnotations()
   * @see #getEuclidTypeDeclaration()
   * @generated
   */
  EReference getEuclidTypeDeclaration_Annotations();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.euclid.euclidmodel.EuclidTypeDeclaration#getAnnotationInfo <em>Annotation Info</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annotation Info</em>'.
   * @see com.euclideanspace.euclid.euclidmodel.EuclidTypeDeclaration#getAnnotationInfo()
   * @see #getEuclidTypeDeclaration()
   * @generated
   */
  EReference getEuclidTypeDeclaration_AnnotationInfo();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.euclid.euclidmodel.EuclidTypeDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.euclideanspace.euclid.euclidmodel.EuclidTypeDeclaration#getName()
   * @see #getEuclidTypeDeclaration()
   * @generated
   */
  EAttribute getEuclidTypeDeclaration_Name();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.euclid.euclidmodel.EuclidField <em>Euclid Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Euclid Field</em>'.
   * @see com.euclideanspace.euclid.euclidmodel.EuclidField
   * @generated
   */
  EClass getEuclidField();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.euclid.euclidmodel.EuclidField#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see com.euclideanspace.euclid.euclidmodel.EuclidField#getType()
   * @see #getEuclidField()
   * @generated
   */
  EReference getEuclidField_Type();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.euclid.euclidmodel.EuclidField#isFinal <em>Final</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Final</em>'.
   * @see com.euclideanspace.euclid.euclidmodel.EuclidField#isFinal()
   * @see #getEuclidField()
   * @generated
   */
  EAttribute getEuclidField_Final();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.euclid.euclidmodel.EuclidField#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.euclideanspace.euclid.euclidmodel.EuclidField#getName()
   * @see #getEuclidField()
   * @generated
   */
  EAttribute getEuclidField_Name();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.euclid.euclidmodel.EuclidField#getInitialValue <em>Initial Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Initial Value</em>'.
   * @see com.euclideanspace.euclid.euclidmodel.EuclidField#getInitialValue()
   * @see #getEuclidField()
   * @generated
   */
  EReference getEuclidField_InitialValue();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.euclid.euclidmodel.EuclidField#isExtension <em>Extension</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Extension</em>'.
   * @see com.euclideanspace.euclid.euclidmodel.EuclidField#isExtension()
   * @see #getEuclidField()
   * @generated
   */
  EAttribute getEuclidField_Extension();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.euclid.euclidmodel.EuclidField#isStatic <em>Static</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Static</em>'.
   * @see com.euclideanspace.euclid.euclidmodel.EuclidField#isStatic()
   * @see #getEuclidField()
   * @generated
   */
  EAttribute getEuclidField_Static();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.euclid.euclidmodel.EuclidMember <em>Euclid Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Euclid Member</em>'.
   * @see com.euclideanspace.euclid.euclidmodel.EuclidMember
   * @generated
   */
  EClass getEuclidMember();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.euclid.euclidmodel.EuclidMember#getAnnotations <em>Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotations</em>'.
   * @see com.euclideanspace.euclid.euclidmodel.EuclidMember#getAnnotations()
   * @see #getEuclidMember()
   * @generated
   */
  EReference getEuclidMember_Annotations();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.euclid.euclidmodel.EuclidMember#getAnnotationInfo <em>Annotation Info</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annotation Info</em>'.
   * @see com.euclideanspace.euclid.euclidmodel.EuclidMember#getAnnotationInfo()
   * @see #getEuclidMember()
   * @generated
   */
  EReference getEuclidMember_AnnotationInfo();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.euclid.euclidmodel.EuclidMember#getVisibility <em>Visibility</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Visibility</em>'.
   * @see com.euclideanspace.euclid.euclidmodel.EuclidMember#getVisibility()
   * @see #getEuclidMember()
   * @generated
   */
  EAttribute getEuclidMember_Visibility();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.euclid.euclidmodel.CreateExtensionInfo <em>Create Extension Info</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Create Extension Info</em>'.
   * @see com.euclideanspace.euclid.euclidmodel.CreateExtensionInfo
   * @generated
   */
  EClass getCreateExtensionInfo();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.euclid.euclidmodel.CreateExtensionInfo#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.euclideanspace.euclid.euclidmodel.CreateExtensionInfo#getName()
   * @see #getCreateExtensionInfo()
   * @generated
   */
  EAttribute getCreateExtensionInfo_Name();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.euclid.euclidmodel.CreateExtensionInfo#getCreateExpression <em>Create Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Create Expression</em>'.
   * @see com.euclideanspace.euclid.euclidmodel.CreateExtensionInfo#getCreateExpression()
   * @see #getCreateExtensionInfo()
   * @generated
   */
  EReference getCreateExtensionInfo_CreateExpression();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.euclid.euclidmodel.EuclidParameter <em>Euclid Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Euclid Parameter</em>'.
   * @see com.euclideanspace.euclid.euclidmodel.EuclidParameter
   * @generated
   */
  EClass getEuclidParameter();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.euclid.euclidmodel.EuclidParameter#getAnnotations <em>Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotations</em>'.
   * @see com.euclideanspace.euclid.euclidmodel.EuclidParameter#getAnnotations()
   * @see #getEuclidParameter()
   * @generated
   */
  EReference getEuclidParameter_Annotations();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.euclid.euclidmodel.EuclidParameter#getParameterType <em>Parameter Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameter Type</em>'.
   * @see com.euclideanspace.euclid.euclidmodel.EuclidParameter#getParameterType()
   * @see #getEuclidParameter()
   * @generated
   */
  EReference getEuclidParameter_ParameterType();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.euclid.euclidmodel.EuclidParameter#isVarArg <em>Var Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Var Arg</em>'.
   * @see com.euclideanspace.euclid.euclidmodel.EuclidParameter#isVarArg()
   * @see #getEuclidParameter()
   * @generated
   */
  EAttribute getEuclidParameter_VarArg();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.euclid.euclidmodel.EuclidParameter#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.euclideanspace.euclid.euclidmodel.EuclidParameter#getName()
   * @see #getEuclidParameter()
   * @generated
   */
  EAttribute getEuclidParameter_Name();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.euclid.euclidmodel.EuclidClass <em>Euclid Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Euclid Class</em>'.
   * @see com.euclideanspace.euclid.euclidmodel.EuclidClass
   * @generated
   */
  EClass getEuclidClass();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.euclid.euclidmodel.EuclidClass#isAbstract <em>Abstract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Abstract</em>'.
   * @see com.euclideanspace.euclid.euclidmodel.EuclidClass#isAbstract()
   * @see #getEuclidClass()
   * @generated
   */
  EAttribute getEuclidClass_Abstract();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.euclid.euclidmodel.EuclidClass#getTypeParameters <em>Type Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Type Parameters</em>'.
   * @see com.euclideanspace.euclid.euclidmodel.EuclidClass#getTypeParameters()
   * @see #getEuclidClass()
   * @generated
   */
  EReference getEuclidClass_TypeParameters();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.euclid.euclidmodel.EuclidClass#getExtends <em>Extends</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Extends</em>'.
   * @see com.euclideanspace.euclid.euclidmodel.EuclidClass#getExtends()
   * @see #getEuclidClass()
   * @generated
   */
  EReference getEuclidClass_Extends();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.euclid.euclidmodel.EuclidClass#getImplements <em>Implements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Implements</em>'.
   * @see com.euclideanspace.euclid.euclidmodel.EuclidClass#getImplements()
   * @see #getEuclidClass()
   * @generated
   */
  EReference getEuclidClass_Implements();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.euclid.euclidmodel.EuclidClass#getMembers <em>Members</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Members</em>'.
   * @see com.euclideanspace.euclid.euclidmodel.EuclidClass#getMembers()
   * @see #getEuclidClass()
   * @generated
   */
  EReference getEuclidClass_Members();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.euclid.euclidmodel.EuclidAnnotationType <em>Euclid Annotation Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Euclid Annotation Type</em>'.
   * @see com.euclideanspace.euclid.euclidmodel.EuclidAnnotationType
   * @generated
   */
  EClass getEuclidAnnotationType();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.euclid.euclidmodel.EuclidAnnotationType#getMembers <em>Members</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Members</em>'.
   * @see com.euclideanspace.euclid.euclidmodel.EuclidAnnotationType#getMembers()
   * @see #getEuclidAnnotationType()
   * @generated
   */
  EReference getEuclidAnnotationType_Members();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.euclid.euclidmodel.EuclidFunction <em>Euclid Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Euclid Function</em>'.
   * @see com.euclideanspace.euclid.euclidmodel.EuclidFunction
   * @generated
   */
  EClass getEuclidFunction();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.euclid.euclidmodel.EuclidFunction#isOverride <em>Override</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Override</em>'.
   * @see com.euclideanspace.euclid.euclidmodel.EuclidFunction#isOverride()
   * @see #getEuclidFunction()
   * @generated
   */
  EAttribute getEuclidFunction_Override();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.euclid.euclidmodel.EuclidFunction#isStatic <em>Static</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Static</em>'.
   * @see com.euclideanspace.euclid.euclidmodel.EuclidFunction#isStatic()
   * @see #getEuclidFunction()
   * @generated
   */
  EAttribute getEuclidFunction_Static();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.euclid.euclidmodel.EuclidFunction#isDispatch <em>Dispatch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dispatch</em>'.
   * @see com.euclideanspace.euclid.euclidmodel.EuclidFunction#isDispatch()
   * @see #getEuclidFunction()
   * @generated
   */
  EAttribute getEuclidFunction_Dispatch();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.euclid.euclidmodel.EuclidFunction#getTypeParameters <em>Type Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Type Parameters</em>'.
   * @see com.euclideanspace.euclid.euclidmodel.EuclidFunction#getTypeParameters()
   * @see #getEuclidFunction()
   * @generated
   */
  EReference getEuclidFunction_TypeParameters();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.euclid.euclidmodel.EuclidFunction#getReturnType <em>Return Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Return Type</em>'.
   * @see com.euclideanspace.euclid.euclidmodel.EuclidFunction#getReturnType()
   * @see #getEuclidFunction()
   * @generated
   */
  EReference getEuclidFunction_ReturnType();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.euclid.euclidmodel.EuclidFunction#getCreateExtensionInfo <em>Create Extension Info</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Create Extension Info</em>'.
   * @see com.euclideanspace.euclid.euclidmodel.EuclidFunction#getCreateExtensionInfo()
   * @see #getEuclidFunction()
   * @generated
   */
  EReference getEuclidFunction_CreateExtensionInfo();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.euclid.euclidmodel.EuclidFunction#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.euclideanspace.euclid.euclidmodel.EuclidFunction#getName()
   * @see #getEuclidFunction()
   * @generated
   */
  EAttribute getEuclidFunction_Name();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.euclid.euclidmodel.EuclidFunction#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see com.euclideanspace.euclid.euclidmodel.EuclidFunction#getParameters()
   * @see #getEuclidFunction()
   * @generated
   */
  EReference getEuclidFunction_Parameters();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.euclid.euclidmodel.EuclidFunction#getExceptions <em>Exceptions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exceptions</em>'.
   * @see com.euclideanspace.euclid.euclidmodel.EuclidFunction#getExceptions()
   * @see #getEuclidFunction()
   * @generated
   */
  EReference getEuclidFunction_Exceptions();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.euclid.euclidmodel.EuclidFunction#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see com.euclideanspace.euclid.euclidmodel.EuclidFunction#getExpression()
   * @see #getEuclidFunction()
   * @generated
   */
  EReference getEuclidFunction_Expression();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.euclid.euclidmodel.EuclidConstructor <em>Euclid Constructor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Euclid Constructor</em>'.
   * @see com.euclideanspace.euclid.euclidmodel.EuclidConstructor
   * @generated
   */
  EClass getEuclidConstructor();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.euclid.euclidmodel.EuclidConstructor#getTypeParameters <em>Type Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Type Parameters</em>'.
   * @see com.euclideanspace.euclid.euclidmodel.EuclidConstructor#getTypeParameters()
   * @see #getEuclidConstructor()
   * @generated
   */
  EReference getEuclidConstructor_TypeParameters();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.euclid.euclidmodel.EuclidConstructor#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see com.euclideanspace.euclid.euclidmodel.EuclidConstructor#getParameters()
   * @see #getEuclidConstructor()
   * @generated
   */
  EReference getEuclidConstructor_Parameters();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.euclid.euclidmodel.EuclidConstructor#getExceptions <em>Exceptions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exceptions</em>'.
   * @see com.euclideanspace.euclid.euclidmodel.EuclidConstructor#getExceptions()
   * @see #getEuclidConstructor()
   * @generated
   */
  EReference getEuclidConstructor_Exceptions();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.euclid.euclidmodel.EuclidConstructor#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see com.euclideanspace.euclid.euclidmodel.EuclidConstructor#getExpression()
   * @see #getEuclidConstructor()
   * @generated
   */
  EReference getEuclidConstructor_Expression();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  EuclidmodelFactory getEuclidmodelFactory();

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
     * The meta object literal for the '{@link com.euclideanspace.euclid.euclidmodel.impl.EuclidFileImpl <em>Euclid File</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.euclid.euclidmodel.impl.EuclidFileImpl
     * @see com.euclideanspace.euclid.euclidmodel.impl.EuclidmodelPackageImpl#getEuclidFile()
     * @generated
     */
    EClass EUCLID_FILE = eINSTANCE.getEuclidFile();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EUCLID_FILE__IMPORTED_NAMESPACE = eINSTANCE.getEuclidFile_ImportedNamespace();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EUCLID_FILE__IMPORTS = eINSTANCE.getEuclidFile_Imports();

    /**
     * The meta object literal for the '<em><b>Euclid Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EUCLID_FILE__EUCLID_TYPES = eINSTANCE.getEuclidFile_EuclidTypes();

    /**
     * The meta object literal for the '{@link com.euclideanspace.euclid.euclidmodel.impl.EuclidImportImpl <em>Euclid Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.euclid.euclidmodel.impl.EuclidImportImpl
     * @see com.euclideanspace.euclid.euclidmodel.impl.EuclidmodelPackageImpl#getEuclidImport()
     * @generated
     */
    EClass EUCLID_IMPORT = eINSTANCE.getEuclidImport();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EUCLID_IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getEuclidImport_ImportedNamespace();

    /**
     * The meta object literal for the '{@link com.euclideanspace.euclid.euclidmodel.impl.EuclidTypeDeclarationImpl <em>Euclid Type Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.euclid.euclidmodel.impl.EuclidTypeDeclarationImpl
     * @see com.euclideanspace.euclid.euclidmodel.impl.EuclidmodelPackageImpl#getEuclidTypeDeclaration()
     * @generated
     */
    EClass EUCLID_TYPE_DECLARATION = eINSTANCE.getEuclidTypeDeclaration();

    /**
     * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EUCLID_TYPE_DECLARATION__ANNOTATIONS = eINSTANCE.getEuclidTypeDeclaration_Annotations();

    /**
     * The meta object literal for the '<em><b>Annotation Info</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EUCLID_TYPE_DECLARATION__ANNOTATION_INFO = eINSTANCE.getEuclidTypeDeclaration_AnnotationInfo();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EUCLID_TYPE_DECLARATION__NAME = eINSTANCE.getEuclidTypeDeclaration_Name();

    /**
     * The meta object literal for the '{@link com.euclideanspace.euclid.euclidmodel.impl.EuclidFieldImpl <em>Euclid Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.euclid.euclidmodel.impl.EuclidFieldImpl
     * @see com.euclideanspace.euclid.euclidmodel.impl.EuclidmodelPackageImpl#getEuclidField()
     * @generated
     */
    EClass EUCLID_FIELD = eINSTANCE.getEuclidField();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EUCLID_FIELD__TYPE = eINSTANCE.getEuclidField_Type();

    /**
     * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EUCLID_FIELD__FINAL = eINSTANCE.getEuclidField_Final();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EUCLID_FIELD__NAME = eINSTANCE.getEuclidField_Name();

    /**
     * The meta object literal for the '<em><b>Initial Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EUCLID_FIELD__INITIAL_VALUE = eINSTANCE.getEuclidField_InitialValue();

    /**
     * The meta object literal for the '<em><b>Extension</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EUCLID_FIELD__EXTENSION = eINSTANCE.getEuclidField_Extension();

    /**
     * The meta object literal for the '<em><b>Static</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EUCLID_FIELD__STATIC = eINSTANCE.getEuclidField_Static();

    /**
     * The meta object literal for the '{@link com.euclideanspace.euclid.euclidmodel.impl.EuclidMemberImpl <em>Euclid Member</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.euclid.euclidmodel.impl.EuclidMemberImpl
     * @see com.euclideanspace.euclid.euclidmodel.impl.EuclidmodelPackageImpl#getEuclidMember()
     * @generated
     */
    EClass EUCLID_MEMBER = eINSTANCE.getEuclidMember();

    /**
     * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EUCLID_MEMBER__ANNOTATIONS = eINSTANCE.getEuclidMember_Annotations();

    /**
     * The meta object literal for the '<em><b>Annotation Info</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EUCLID_MEMBER__ANNOTATION_INFO = eINSTANCE.getEuclidMember_AnnotationInfo();

    /**
     * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EUCLID_MEMBER__VISIBILITY = eINSTANCE.getEuclidMember_Visibility();

    /**
     * The meta object literal for the '{@link com.euclideanspace.euclid.euclidmodel.impl.CreateExtensionInfoImpl <em>Create Extension Info</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.euclid.euclidmodel.impl.CreateExtensionInfoImpl
     * @see com.euclideanspace.euclid.euclidmodel.impl.EuclidmodelPackageImpl#getCreateExtensionInfo()
     * @generated
     */
    EClass CREATE_EXTENSION_INFO = eINSTANCE.getCreateExtensionInfo();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CREATE_EXTENSION_INFO__NAME = eINSTANCE.getCreateExtensionInfo_Name();

    /**
     * The meta object literal for the '<em><b>Create Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CREATE_EXTENSION_INFO__CREATE_EXPRESSION = eINSTANCE.getCreateExtensionInfo_CreateExpression();

    /**
     * The meta object literal for the '{@link com.euclideanspace.euclid.euclidmodel.impl.EuclidParameterImpl <em>Euclid Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.euclid.euclidmodel.impl.EuclidParameterImpl
     * @see com.euclideanspace.euclid.euclidmodel.impl.EuclidmodelPackageImpl#getEuclidParameter()
     * @generated
     */
    EClass EUCLID_PARAMETER = eINSTANCE.getEuclidParameter();

    /**
     * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EUCLID_PARAMETER__ANNOTATIONS = eINSTANCE.getEuclidParameter_Annotations();

    /**
     * The meta object literal for the '<em><b>Parameter Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EUCLID_PARAMETER__PARAMETER_TYPE = eINSTANCE.getEuclidParameter_ParameterType();

    /**
     * The meta object literal for the '<em><b>Var Arg</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EUCLID_PARAMETER__VAR_ARG = eINSTANCE.getEuclidParameter_VarArg();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EUCLID_PARAMETER__NAME = eINSTANCE.getEuclidParameter_Name();

    /**
     * The meta object literal for the '{@link com.euclideanspace.euclid.euclidmodel.impl.EuclidClassImpl <em>Euclid Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.euclid.euclidmodel.impl.EuclidClassImpl
     * @see com.euclideanspace.euclid.euclidmodel.impl.EuclidmodelPackageImpl#getEuclidClass()
     * @generated
     */
    EClass EUCLID_CLASS = eINSTANCE.getEuclidClass();

    /**
     * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EUCLID_CLASS__ABSTRACT = eINSTANCE.getEuclidClass_Abstract();

    /**
     * The meta object literal for the '<em><b>Type Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EUCLID_CLASS__TYPE_PARAMETERS = eINSTANCE.getEuclidClass_TypeParameters();

    /**
     * The meta object literal for the '<em><b>Extends</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EUCLID_CLASS__EXTENDS = eINSTANCE.getEuclidClass_Extends();

    /**
     * The meta object literal for the '<em><b>Implements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EUCLID_CLASS__IMPLEMENTS = eINSTANCE.getEuclidClass_Implements();

    /**
     * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EUCLID_CLASS__MEMBERS = eINSTANCE.getEuclidClass_Members();

    /**
     * The meta object literal for the '{@link com.euclideanspace.euclid.euclidmodel.impl.EuclidAnnotationTypeImpl <em>Euclid Annotation Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.euclid.euclidmodel.impl.EuclidAnnotationTypeImpl
     * @see com.euclideanspace.euclid.euclidmodel.impl.EuclidmodelPackageImpl#getEuclidAnnotationType()
     * @generated
     */
    EClass EUCLID_ANNOTATION_TYPE = eINSTANCE.getEuclidAnnotationType();

    /**
     * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EUCLID_ANNOTATION_TYPE__MEMBERS = eINSTANCE.getEuclidAnnotationType_Members();

    /**
     * The meta object literal for the '{@link com.euclideanspace.euclid.euclidmodel.impl.EuclidFunctionImpl <em>Euclid Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.euclid.euclidmodel.impl.EuclidFunctionImpl
     * @see com.euclideanspace.euclid.euclidmodel.impl.EuclidmodelPackageImpl#getEuclidFunction()
     * @generated
     */
    EClass EUCLID_FUNCTION = eINSTANCE.getEuclidFunction();

    /**
     * The meta object literal for the '<em><b>Override</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EUCLID_FUNCTION__OVERRIDE = eINSTANCE.getEuclidFunction_Override();

    /**
     * The meta object literal for the '<em><b>Static</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EUCLID_FUNCTION__STATIC = eINSTANCE.getEuclidFunction_Static();

    /**
     * The meta object literal for the '<em><b>Dispatch</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EUCLID_FUNCTION__DISPATCH = eINSTANCE.getEuclidFunction_Dispatch();

    /**
     * The meta object literal for the '<em><b>Type Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EUCLID_FUNCTION__TYPE_PARAMETERS = eINSTANCE.getEuclidFunction_TypeParameters();

    /**
     * The meta object literal for the '<em><b>Return Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EUCLID_FUNCTION__RETURN_TYPE = eINSTANCE.getEuclidFunction_ReturnType();

    /**
     * The meta object literal for the '<em><b>Create Extension Info</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EUCLID_FUNCTION__CREATE_EXTENSION_INFO = eINSTANCE.getEuclidFunction_CreateExtensionInfo();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EUCLID_FUNCTION__NAME = eINSTANCE.getEuclidFunction_Name();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EUCLID_FUNCTION__PARAMETERS = eINSTANCE.getEuclidFunction_Parameters();

    /**
     * The meta object literal for the '<em><b>Exceptions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EUCLID_FUNCTION__EXCEPTIONS = eINSTANCE.getEuclidFunction_Exceptions();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EUCLID_FUNCTION__EXPRESSION = eINSTANCE.getEuclidFunction_Expression();

    /**
     * The meta object literal for the '{@link com.euclideanspace.euclid.euclidmodel.impl.EuclidConstructorImpl <em>Euclid Constructor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.euclid.euclidmodel.impl.EuclidConstructorImpl
     * @see com.euclideanspace.euclid.euclidmodel.impl.EuclidmodelPackageImpl#getEuclidConstructor()
     * @generated
     */
    EClass EUCLID_CONSTRUCTOR = eINSTANCE.getEuclidConstructor();

    /**
     * The meta object literal for the '<em><b>Type Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EUCLID_CONSTRUCTOR__TYPE_PARAMETERS = eINSTANCE.getEuclidConstructor_TypeParameters();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EUCLID_CONSTRUCTOR__PARAMETERS = eINSTANCE.getEuclidConstructor_Parameters();

    /**
     * The meta object literal for the '<em><b>Exceptions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EUCLID_CONSTRUCTOR__EXCEPTIONS = eINSTANCE.getEuclidConstructor_Exceptions();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EUCLID_CONSTRUCTOR__EXPRESSION = eINSTANCE.getEuclidConstructor_Expression();

  }

} //EuclidmodelPackage
