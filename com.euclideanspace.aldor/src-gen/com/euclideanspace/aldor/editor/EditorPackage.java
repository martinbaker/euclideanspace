/**
 */
package com.euclideanspace.aldor.editor;

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
 * @see com.euclideanspace.aldor.editor.EditorFactory
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
  String eNS_URI = "http://www.euclideanspace.com/aldor/Editor";

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
  EditorPackage eINSTANCE = com.euclideanspace.aldor.editor.impl.EditorPackageImpl.init();

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.ModelImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Insert</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__INSERT = 0;

  /**
   * The feature id for the '<em><b>Cc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__CC = 1;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.MoleculeImpl <em>Molecule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.MoleculeImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getMolecule()
   * @generated
   */
  int MOLECULE = 51;

  /**
   * The number of structural features of the '<em>Molecule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOLECULE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.EnclosureImpl <em>Enclosure</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.EnclosureImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getEnclosure()
   * @generated
   */
  int ENCLOSURE = 52;

  /**
   * The feature id for the '<em><b>Right2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENCLOSURE__RIGHT2 = MOLECULE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Enclosure</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENCLOSURE_FEATURE_COUNT = MOLECULE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.ParenedImpl <em>Parened</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.ParenedImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getParened()
   * @generated
   */
  int PARENED = 57;

  /**
   * The feature id for the '<em><b>Right2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENED__RIGHT2 = ENCLOSURE__RIGHT2;

  /**
   * The number of structural features of the '<em>Parened</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENED_FEATURE_COUNT = ENCLOSURE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.ExpressionImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 1;

  /**
   * The feature id for the '<em><b>Right2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__RIGHT2 = PARENED__RIGHT2;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = PARENED_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.LabeledImpl <em>Labeled</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.LabeledImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getLabeled()
   * @generated
   */
  int LABELED = 2;

  /**
   * The number of structural features of the '<em>Labeled</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABELED_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.DeclarationImpl <em>Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.DeclarationImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getDeclaration()
   * @generated
   */
  int DECLARATION = 3;

  /**
   * The feature id for the '<em><b>Fp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__FP = LABELED_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION_FEATURE_COUNT = LABELED_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.ExportDeclImpl <em>Export Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.ExportDeclImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getExportDecl()
   * @generated
   */
  int EXPORT_DECL = 4;

  /**
   * The feature id for the '<em><b>Fp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPORT_DECL__FP = DECLARATION__FP;

  /**
   * The feature id for the '<em><b>Tp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPORT_DECL__TP = DECLARATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Export Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPORT_DECL_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.FromPartImpl <em>From Part</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.FromPartImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getFromPart()
   * @generated
   */
  int FROM_PART = 5;

  /**
   * The number of structural features of the '<em>From Part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FROM_PART_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.MacroBodyImpl <em>Macro Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.MacroBodyImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getMacroBody()
   * @generated
   */
  int MACRO_BODY = 6;

  /**
   * The feature id for the '<em><b>Fp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACRO_BODY__FP = DECLARATION__FP;

  /**
   * The number of structural features of the '<em>Macro Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACRO_BODY_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.SigImpl <em>Sig</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.SigImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getSig()
   * @generated
   */
  int SIG = 7;

  /**
   * The feature id for the '<em><b>Fp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIG__FP = DECLARATION__FP;

  /**
   * The feature id for the '<em><b>Tp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIG__TP = DECLARATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Sig</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIG_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.DeclPartImpl <em>Decl Part</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.DeclPartImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getDeclPart()
   * @generated
   */
  int DECL_PART = 8;

  /**
   * The number of structural features of the '<em>Decl Part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECL_PART_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.CommaImpl <em>Comma</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.CommaImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getComma()
   * @generated
   */
  int COMMA = 9;

  /**
   * The number of structural features of the '<em>Comma</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMA_FEATURE_COUNT = LABELED_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.Flow_AnyStatementImpl <em>Flow Any Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.Flow_AnyStatementImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getFlow_AnyStatement()
   * @generated
   */
  int FLOW_ANY_STATEMENT = 21;

  /**
   * The feature id for the '<em><b>Bas3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_ANY_STATEMENT__BAS3 = 0;

  /**
   * The number of structural features of the '<em>Flow Any Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_ANY_STATEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.CommaItemImpl <em>Comma Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.CommaItemImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getCommaItem()
   * @generated
   */
  int COMMA_ITEM = 10;

  /**
   * The feature id for the '<em><b>Bas3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMA_ITEM__BAS3 = FLOW_ANY_STATEMENT__BAS3;

  /**
   * The feature id for the '<em><b>Bbs4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMA_ITEM__BBS4 = FLOW_ANY_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Bas4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMA_ITEM__BAS4 = FLOW_ANY_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Bbs5</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMA_ITEM__BBS5 = FLOW_ANY_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Bbs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMA_ITEM__BBS = FLOW_ANY_STATEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Bas</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMA_ITEM__BAS = FLOW_ANY_STATEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Bbs2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMA_ITEM__BBS2 = FLOW_ANY_STATEMENT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Ci</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMA_ITEM__CI = FLOW_ANY_STATEMENT_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Comma Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMA_ITEM_FEATURE_COUNT = FLOW_ANY_STATEMENT_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.DeclBindingImpl <em>Decl Binding</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.DeclBindingImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getDeclBinding()
   * @generated
   */
  int DECL_BINDING = 11;

  /**
   * The feature id for the '<em><b>Fp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECL_BINDING__FP = SIG__FP;

  /**
   * The feature id for the '<em><b>Tp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECL_BINDING__TP = SIG__TP;

  /**
   * The number of structural features of the '<em>Decl Binding</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECL_BINDING_FEATURE_COUNT = SIG_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.BindingR_InfixedExprsDecl_AnyStatementImpl <em>Binding RInfixed Exprs Decl Any Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.BindingR_InfixedExprsDecl_AnyStatementImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getBindingR_InfixedExprsDecl_AnyStatement()
   * @generated
   */
  int BINDING_RINFIXED_EXPRS_DECL_ANY_STATEMENT = 20;

  /**
   * The feature id for the '<em><b>Fp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_RINFIXED_EXPRS_DECL_ANY_STATEMENT__FP = DECL_BINDING__FP;

  /**
   * The feature id for the '<em><b>Tp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_RINFIXED_EXPRS_DECL_ANY_STATEMENT__TP = DECL_BINDING__TP;

  /**
   * The number of structural features of the '<em>Binding RInfixed Exprs Decl Any Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_RINFIXED_EXPRS_DECL_ANY_STATEMENT_FEATURE_COUNT = DECL_BINDING_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.InfixedExprsDeclImpl <em>Infixed Exprs Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.InfixedExprsDeclImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getInfixedExprsDecl()
   * @generated
   */
  int INFIXED_EXPRS_DECL = 12;

  /**
   * The feature id for the '<em><b>Fp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFIXED_EXPRS_DECL__FP = BINDING_RINFIXED_EXPRS_DECL_ANY_STATEMENT__FP;

  /**
   * The feature id for the '<em><b>Tp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFIXED_EXPRS_DECL__TP = BINDING_RINFIXED_EXPRS_DECL_ANY_STATEMENT__TP;

  /**
   * The feature id for the '<em><b>Bas</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFIXED_EXPRS_DECL__BAS = BINDING_RINFIXED_EXPRS_DECL_ANY_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Infixed Exprs Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFIXED_EXPRS_DECL_FEATURE_COUNT = BINDING_RINFIXED_EXPRS_DECL_ANY_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.InfixedExprsImpl <em>Infixed Exprs</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.InfixedExprsImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getInfixedExprs()
   * @generated
   */
  int INFIXED_EXPRS = 13;

  /**
   * The feature id for the '<em><b>Fp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFIXED_EXPRS__FP = INFIXED_EXPRS_DECL__FP;

  /**
   * The feature id for the '<em><b>Tp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFIXED_EXPRS__TP = INFIXED_EXPRS_DECL__TP;

  /**
   * The feature id for the '<em><b>Bas</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFIXED_EXPRS__BAS = INFIXED_EXPRS_DECL__BAS;

  /**
   * The feature id for the '<em><b>Dp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFIXED_EXPRS__DP = INFIXED_EXPRS_DECL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Infixed Exprs</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFIXED_EXPRS_FEATURE_COUNT = INFIXED_EXPRS_DECL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.Binding_AnyStatementImpl <em>Binding Any Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.Binding_AnyStatementImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getBinding_AnyStatement()
   * @generated
   */
  int BINDING_ANY_STATEMENT = 14;

  /**
   * The feature id for the '<em><b>Bas3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_ANY_STATEMENT__BAS3 = COMMA_ITEM__BAS3;

  /**
   * The feature id for the '<em><b>Bbs4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_ANY_STATEMENT__BBS4 = COMMA_ITEM__BBS4;

  /**
   * The feature id for the '<em><b>Bas4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_ANY_STATEMENT__BAS4 = COMMA_ITEM__BAS4;

  /**
   * The feature id for the '<em><b>Bbs5</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_ANY_STATEMENT__BBS5 = COMMA_ITEM__BBS5;

  /**
   * The feature id for the '<em><b>Bbs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_ANY_STATEMENT__BBS = COMMA_ITEM__BBS;

  /**
   * The feature id for the '<em><b>Bas</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_ANY_STATEMENT__BAS = COMMA_ITEM__BAS;

  /**
   * The feature id for the '<em><b>Bbs2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_ANY_STATEMENT__BBS2 = COMMA_ITEM__BBS2;

  /**
   * The feature id for the '<em><b>Ci</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_ANY_STATEMENT__CI = COMMA_ITEM__CI;

  /**
   * The feature id for the '<em><b>Be</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_ANY_STATEMENT__BE = COMMA_ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Apa</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_ANY_STATEMENT__APA = COMMA_ITEM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>C</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_ANY_STATEMENT__C = COMMA_ITEM_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Apb</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_ANY_STATEMENT__APB = COMMA_ITEM_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Binding Any Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_ANY_STATEMENT_FEATURE_COUNT = COMMA_ITEM_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.Flow_BalStatementImpl <em>Flow Bal Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.Flow_BalStatementImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getFlow_BalStatement()
   * @generated
   */
  int FLOW_BAL_STATEMENT = 22;

  /**
   * The feature id for the '<em><b>Bbs4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_BAL_STATEMENT__BBS4 = 0;

  /**
   * The number of structural features of the '<em>Flow Bal Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_BAL_STATEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.Binding_BalStatementImpl <em>Binding Bal Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.Binding_BalStatementImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getBinding_BalStatement()
   * @generated
   */
  int BINDING_BAL_STATEMENT = 15;

  /**
   * The feature id for the '<em><b>Bbs4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_BAL_STATEMENT__BBS4 = FLOW_BAL_STATEMENT__BBS4;

  /**
   * The number of structural features of the '<em>Binding Bal Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_BAL_STATEMENT_FEATURE_COUNT = FLOW_BAL_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.CasesImpl <em>Cases</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.CasesImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getCases()
   * @generated
   */
  int CASES = 25;

  /**
   * The number of structural features of the '<em>Cases</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASES_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.Binding_CollectionImpl <em>Binding Collection</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.Binding_CollectionImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getBinding_Collection()
   * @generated
   */
  int BINDING_COLLECTION = 16;

  /**
   * The number of structural features of the '<em>Binding Collection</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_COLLECTION_FEATURE_COUNT = CASES_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.BindingL_Infixed_AnyStatementImpl <em>Binding LInfixed Any Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.BindingL_Infixed_AnyStatementImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getBindingL_Infixed_AnyStatement()
   * @generated
   */
  int BINDING_LINFIXED_ANY_STATEMENT = 17;

  /**
   * The feature id for the '<em><b>Bas3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_LINFIXED_ANY_STATEMENT__BAS3 = BINDING_ANY_STATEMENT__BAS3;

  /**
   * The feature id for the '<em><b>Bbs4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_LINFIXED_ANY_STATEMENT__BBS4 = BINDING_ANY_STATEMENT__BBS4;

  /**
   * The feature id for the '<em><b>Bas4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_LINFIXED_ANY_STATEMENT__BAS4 = BINDING_ANY_STATEMENT__BAS4;

  /**
   * The feature id for the '<em><b>Bbs5</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_LINFIXED_ANY_STATEMENT__BBS5 = BINDING_ANY_STATEMENT__BBS5;

  /**
   * The feature id for the '<em><b>Bbs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_LINFIXED_ANY_STATEMENT__BBS = BINDING_ANY_STATEMENT__BBS;

  /**
   * The feature id for the '<em><b>Bas</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_LINFIXED_ANY_STATEMENT__BAS = BINDING_ANY_STATEMENT__BAS;

  /**
   * The feature id for the '<em><b>Bbs2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_LINFIXED_ANY_STATEMENT__BBS2 = BINDING_ANY_STATEMENT__BBS2;

  /**
   * The feature id for the '<em><b>Ci</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_LINFIXED_ANY_STATEMENT__CI = BINDING_ANY_STATEMENT__CI;

  /**
   * The feature id for the '<em><b>Be</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_LINFIXED_ANY_STATEMENT__BE = BINDING_ANY_STATEMENT__BE;

  /**
   * The feature id for the '<em><b>Apa</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_LINFIXED_ANY_STATEMENT__APA = BINDING_ANY_STATEMENT__APA;

  /**
   * The feature id for the '<em><b>C</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_LINFIXED_ANY_STATEMENT__C = BINDING_ANY_STATEMENT__C;

  /**
   * The feature id for the '<em><b>Apb</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_LINFIXED_ANY_STATEMENT__APB = BINDING_ANY_STATEMENT__APB;

  /**
   * The feature id for the '<em><b>Bia</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_LINFIXED_ANY_STATEMENT__BIA = BINDING_ANY_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Binding LInfixed Any Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_LINFIXED_ANY_STATEMENT_FEATURE_COUNT = BINDING_ANY_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.BindingL_Infixed_BalStatementImpl <em>Binding LInfixed Bal Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.BindingL_Infixed_BalStatementImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getBindingL_Infixed_BalStatement()
   * @generated
   */
  int BINDING_LINFIXED_BAL_STATEMENT = 18;

  /**
   * The feature id for the '<em><b>Bbs4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_LINFIXED_BAL_STATEMENT__BBS4 = BINDING_BAL_STATEMENT__BBS4;

  /**
   * The feature id for the '<em><b>Bib</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_LINFIXED_BAL_STATEMENT__BIB = BINDING_BAL_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Binding LInfixed Bal Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_LINFIXED_BAL_STATEMENT_FEATURE_COUNT = BINDING_BAL_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.BindingL_Infixed_CollectionImpl <em>Binding LInfixed Collection</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.BindingL_Infixed_CollectionImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getBindingL_Infixed_Collection()
   * @generated
   */
  int BINDING_LINFIXED_COLLECTION = 19;

  /**
   * The feature id for the '<em><b>Bic</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_LINFIXED_COLLECTION__BIC = BINDING_COLLECTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Binding LInfixed Collection</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_LINFIXED_COLLECTION_FEATURE_COUNT = BINDING_COLLECTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.GenBoundImpl <em>Gen Bound</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.GenBoundImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getGenBound()
   * @generated
   */
  int GEN_BOUND = 23;

  /**
   * The feature id for the '<em><b>Bas3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEN_BOUND__BAS3 = FLOW_ANY_STATEMENT__BAS3;

  /**
   * The feature id for the '<em><b>Bbs4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEN_BOUND__BBS4 = FLOW_ANY_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Bas4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEN_BOUND__BAS4 = FLOW_ANY_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Bbs5</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEN_BOUND__BBS5 = FLOW_ANY_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Gen Bound</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEN_BOUND_FEATURE_COUNT = FLOW_ANY_STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.ButExprImpl <em>But Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.ButExprImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getButExpr()
   * @generated
   */
  int BUT_EXPR = 24;

  /**
   * The feature id for the '<em><b>Db</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUT_EXPR__DB = 0;

  /**
   * The feature id for the '<em><b>Ca</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUT_EXPR__CA = 1;

  /**
   * The number of structural features of the '<em>But Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUT_EXPR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.AlwaysPart_AnyStatementImpl <em>Always Part Any Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.AlwaysPart_AnyStatementImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getAlwaysPart_AnyStatement()
   * @generated
   */
  int ALWAYS_PART_ANY_STATEMENT = 26;

  /**
   * The number of structural features of the '<em>Always Part Any Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALWAYS_PART_ANY_STATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.AlwaysPart_BalStatementImpl <em>Always Part Bal Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.AlwaysPart_BalStatementImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getAlwaysPart_BalStatement()
   * @generated
   */
  int ALWAYS_PART_BAL_STATEMENT = 27;

  /**
   * The number of structural features of the '<em>Always Part Bal Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALWAYS_PART_BAL_STATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.CollectionImpl <em>Collection</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.CollectionImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getCollection()
   * @generated
   */
  int COLLECTION = 28;

  /**
   * The feature id for the '<em><b>Bic</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION__BIC = BINDING_LINFIXED_COLLECTION__BIC;

  /**
   * The feature id for the '<em><b>Bas3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION__BAS3 = BINDING_LINFIXED_COLLECTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Bbs4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION__BBS4 = BINDING_LINFIXED_COLLECTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Bas2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION__BAS2 = BINDING_LINFIXED_COLLECTION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Bbs3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION__BBS3 = BINDING_LINFIXED_COLLECTION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>I</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION__I = BINDING_LINFIXED_COLLECTION_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Collection</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION_FEATURE_COUNT = BINDING_LINFIXED_COLLECTION_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.IteratorImpl <em>Iterator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.IteratorImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getIterator()
   * @generated
   */
  int ITERATOR = 29;

  /**
   * The feature id for the '<em><b>I</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITERATOR__I = 0;

  /**
   * The feature id for the '<em><b>Sp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITERATOR__SP = 1;

  /**
   * The number of structural features of the '<em>Iterator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITERATOR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.enlist1_InfixedExpr_Comma_ABImpl <em>enlist1 Infixed Expr Comma AB</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.enlist1_InfixedExpr_Comma_ABImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getenlist1_InfixedExpr_Comma_AB()
   * @generated
   */
  int ENLIST1_INFIXED_EXPR_COMMA_AB = 81;

  /**
   * The feature id for the '<em><b>Fp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENLIST1_INFIXED_EXPR_COMMA_AB__FP = INFIXED_EXPRS__FP;

  /**
   * The feature id for the '<em><b>Tp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENLIST1_INFIXED_EXPR_COMMA_AB__TP = INFIXED_EXPRS__TP;

  /**
   * The feature id for the '<em><b>Bas</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENLIST1_INFIXED_EXPR_COMMA_AB__BAS = INFIXED_EXPRS__BAS;

  /**
   * The feature id for the '<em><b>Dp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENLIST1_INFIXED_EXPR_COMMA_AB__DP = INFIXED_EXPRS__DP;

  /**
   * The number of structural features of the '<em>enlist1 Infixed Expr Comma AB</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENLIST1_INFIXED_EXPR_COMMA_AB_FEATURE_COUNT = INFIXED_EXPRS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.enlister1_InfixedExpr_CommaImpl <em>enlister1 Infixed Expr Comma</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.enlister1_InfixedExpr_CommaImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getenlister1_InfixedExpr_Comma()
   * @generated
   */
  int ENLISTER1_INFIXED_EXPR_COMMA = 84;

  /**
   * The feature id for the '<em><b>Fp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENLISTER1_INFIXED_EXPR_COMMA__FP = ENLIST1_INFIXED_EXPR_COMMA_AB__FP;

  /**
   * The feature id for the '<em><b>Tp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENLISTER1_INFIXED_EXPR_COMMA__TP = ENLIST1_INFIXED_EXPR_COMMA_AB__TP;

  /**
   * The feature id for the '<em><b>Bas</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENLISTER1_INFIXED_EXPR_COMMA__BAS = ENLIST1_INFIXED_EXPR_COMMA_AB__BAS;

  /**
   * The feature id for the '<em><b>Dp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENLISTER1_INFIXED_EXPR_COMMA__DP = ENLIST1_INFIXED_EXPR_COMMA_AB__DP;

  /**
   * The number of structural features of the '<em>enlister1 Infixed Expr Comma</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENLISTER1_INFIXED_EXPR_COMMA_FEATURE_COUNT = ENLIST1_INFIXED_EXPR_COMMA_AB_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.InfixedExprImpl <em>Infixed Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.InfixedExprImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getInfixedExpr()
   * @generated
   */
  int INFIXED_EXPR = 30;

  /**
   * The feature id for the '<em><b>Fp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFIXED_EXPR__FP = ENLISTER1_INFIXED_EXPR_COMMA__FP;

  /**
   * The feature id for the '<em><b>Tp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFIXED_EXPR__TP = ENLISTER1_INFIXED_EXPR_COMMA__TP;

  /**
   * The feature id for the '<em><b>Bas</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFIXED_EXPR__BAS = ENLISTER1_INFIXED_EXPR_COMMA__BAS;

  /**
   * The feature id for the '<em><b>Dp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFIXED_EXPR__DP = ENLISTER1_INFIXED_EXPR_COMMA__DP;

  /**
   * The feature id for the '<em><b>Ie</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFIXED_EXPR__IE = ENLISTER1_INFIXED_EXPR_COMMA_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Infixed Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFIXED_EXPR_FEATURE_COUNT = ENLISTER1_INFIXED_EXPR_COMMA_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.ExprImpl <em>Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.ExprImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getExpr()
   * @generated
   */
  int EXPR = 31;

  /**
   * The feature id for the '<em><b>Fp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR__FP = INFIXED_EXPR__FP;

  /**
   * The feature id for the '<em><b>Tp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR__TP = INFIXED_EXPR__TP;

  /**
   * The feature id for the '<em><b>Bas</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR__BAS = INFIXED_EXPR__BAS;

  /**
   * The feature id for the '<em><b>Dp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR__DP = INFIXED_EXPR__DP;

  /**
   * The feature id for the '<em><b>Ie</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR__IE = INFIXED_EXPR__IE;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR__LEFT = INFIXED_EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR__RIGHT = INFIXED_EXPR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Op5</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR__OP5 = INFIXED_EXPR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_FEATURE_COUNT = INFIXED_EXPR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.TypeImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getType()
   * @generated
   */
  int TYPE = 32;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = DECL_PART_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.E12Impl <em>E12</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.E12Impl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getE12()
   * @generated
   */
  int E12 = 33;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E12__LEFT = 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E12__OP = 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E12__RIGHT = 2;

  /**
   * The number of structural features of the '<em>E12</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E12_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.E13Impl <em>E13</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.E13Impl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getE13()
   * @generated
   */
  int E13 = 34;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E13__LEFT = 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E13__OP = 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E13__RIGHT = 2;

  /**
   * The number of structural features of the '<em>E13</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E13_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.QualTailImpl <em>Qual Tail</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.QualTailImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getQualTail()
   * @generated
   */
  int QUAL_TAIL = 35;

  /**
   * The number of structural features of the '<em>Qual Tail</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUAL_TAIL_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.OpImpl <em>Op</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.OpImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getOp()
   * @generated
   */
  int OP = 38;

  /**
   * The number of structural features of the '<em>Op</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OP_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.ArrowOpImpl <em>Arrow Op</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.ArrowOpImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getArrowOp()
   * @generated
   */
  int ARROW_OP = 40;

  /**
   * The number of structural features of the '<em>Arrow Op</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARROW_OP_FEATURE_COUNT = OP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.QualOp_ArrowTokImpl <em>Qual Op Arrow Tok</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.QualOp_ArrowTokImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getQualOp_ArrowTok()
   * @generated
   */
  int QUAL_OP_ARROW_TOK = 72;

  /**
   * The number of structural features of the '<em>Qual Op Arrow Tok</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUAL_OP_ARROW_TOK_FEATURE_COUNT = ARROW_OP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.OpQualTailImpl <em>Op Qual Tail</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.OpQualTailImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getOpQualTail()
   * @generated
   */
  int OP_QUAL_TAIL = 36;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OP_QUAL_TAIL__NAME = QUAL_OP_ARROW_TOK_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Op Qual Tail</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OP_QUAL_TAIL_FEATURE_COUNT = QUAL_OP_ARROW_TOK_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.E14Impl <em>E14</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.E14Impl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getE14()
   * @generated
   */
  int E14 = 37;

  /**
   * The feature id for the '<em><b>E1 5left</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E14__E15LEFT = 0;

  /**
   * The feature id for the '<em><b>Dm</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E14__DM = 1;

  /**
   * The feature id for the '<em><b>E1 5right</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E14__E15RIGHT = 2;

  /**
   * The number of structural features of the '<em>E14</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E14_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.NameImpl <em>Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.NameImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getName_()
   * @generated
   */
  int NAME = 62;

  /**
   * The feature id for the '<em><b>Bas3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME__BAS3 = FLOW_ANY_STATEMENT__BAS3;

  /**
   * The feature id for the '<em><b>Bbs4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME__BBS4 = FLOW_ANY_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_FEATURE_COUNT = FLOW_ANY_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.NakedOpImpl <em>Naked Op</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.NakedOpImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getNakedOp()
   * @generated
   */
  int NAKED_OP = 39;

  /**
   * The feature id for the '<em><b>Bas3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAKED_OP__BAS3 = NAME__BAS3;

  /**
   * The feature id for the '<em><b>Bbs4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAKED_OP__BBS4 = NAME__BBS4;

  /**
   * The number of structural features of the '<em>Naked Op</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAKED_OP_FEATURE_COUNT = NAME_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.LatticeOpImpl <em>Lattice Op</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.LatticeOpImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getLatticeOp()
   * @generated
   */
  int LATTICE_OP = 41;

  /**
   * The number of structural features of the '<em>Lattice Op</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LATTICE_OP_FEATURE_COUNT = OP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.SegOpImpl <em>Seg Op</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.SegOpImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getSegOp()
   * @generated
   */
  int SEG_OP = 42;

  /**
   * The number of structural features of the '<em>Seg Op</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEG_OP_FEATURE_COUNT = OP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.PlusOpImpl <em>Plus Op</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.PlusOpImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getPlusOp()
   * @generated
   */
  int PLUS_OP = 43;

  /**
   * The number of structural features of the '<em>Plus Op</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS_OP_FEATURE_COUNT = OP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.QuotientOpImpl <em>Quotient Op</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.QuotientOpImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getQuotientOp()
   * @generated
   */
  int QUOTIENT_OP = 44;

  /**
   * The number of structural features of the '<em>Quotient Op</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUOTIENT_OP_FEATURE_COUNT = OP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.TimesOpImpl <em>Times Op</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.TimesOpImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getTimesOp()
   * @generated
   */
  int TIMES_OP = 45;

  /**
   * The number of structural features of the '<em>Times Op</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMES_OP_FEATURE_COUNT = OP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.PowerOpImpl <em>Power Op</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.PowerOpImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getPowerOp()
   * @generated
   */
  int POWER_OP = 46;

  /**
   * The number of structural features of the '<em>Power Op</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POWER_OP_FEATURE_COUNT = OP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.LeftJuxtaposedImpl <em>Left Juxtaposed</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.LeftJuxtaposedImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getLeftJuxtaposed()
   * @generated
   */
  int LEFT_JUXTAPOSED = 47;

  /**
   * The feature id for the '<em><b>Qt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEFT_JUXTAPOSED__QT = QUAL_TAIL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Left Juxtaposed</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEFT_JUXTAPOSED_FEATURE_COUNT = QUAL_TAIL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.Jright_AtomImpl <em>Jright Atom</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.Jright_AtomImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getJright_Atom()
   * @generated
   */
  int JRIGHT_ATOM = 48;

  /**
   * The feature id for the '<em><b>Right2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JRIGHT_ATOM__RIGHT2 = 0;

  /**
   * The number of structural features of the '<em>Jright Atom</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JRIGHT_ATOM_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.Jleft_MoleculeImpl <em>Jleft Molecule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.Jleft_MoleculeImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getJleft_Molecule()
   * @generated
   */
  int JLEFT_MOLECULE = 49;

  /**
   * The feature id for the '<em><b>Qt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JLEFT_MOLECULE__QT = LEFT_JUXTAPOSED__QT;

  /**
   * The feature id for the '<em><b>Be</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JLEFT_MOLECULE__BE = LEFT_JUXTAPOSED_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>M</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JLEFT_MOLECULE__M = LEFT_JUXTAPOSED_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Bm</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JLEFT_MOLECULE__BM = LEFT_JUXTAPOSED_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Jleft Molecule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JLEFT_MOLECULE_FEATURE_COUNT = LEFT_JUXTAPOSED_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.Jleft_AtomImpl <em>Jleft Atom</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.Jleft_AtomImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getJleft_Atom()
   * @generated
   */
  int JLEFT_ATOM = 50;

  /**
   * The feature id for the '<em><b>Right2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JLEFT_ATOM__RIGHT2 = JRIGHT_ATOM__RIGHT2;

  /**
   * The number of structural features of the '<em>Jleft Atom</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JLEFT_ATOM_FEATURE_COUNT = JRIGHT_ATOM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.DeclMoleculeImpl <em>Decl Molecule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.DeclMoleculeImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getDeclMolecule()
   * @generated
   */
  int DECL_MOLECULE = 53;

  /**
   * The feature id for the '<em><b>A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECL_MOLECULE__A = 0;

  /**
   * The feature id for the '<em><b>B</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECL_MOLECULE__B = 1;

  /**
   * The number of structural features of the '<em>Decl Molecule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECL_MOLECULE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.BlockMoleculeImpl <em>Block Molecule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.BlockMoleculeImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getBlockMolecule()
   * @generated
   */
  int BLOCK_MOLECULE = 54;

  /**
   * The number of structural features of the '<em>Block Molecule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_MOLECULE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.BlockEnclosureImpl <em>Block Enclosure</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.BlockEnclosureImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getBlockEnclosure()
   * @generated
   */
  int BLOCK_ENCLOSURE = 55;

  /**
   * The feature id for the '<em><b>Right2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_ENCLOSURE__RIGHT2 = JLEFT_ATOM__RIGHT2;

  /**
   * The number of structural features of the '<em>Block Enclosure</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_ENCLOSURE_FEATURE_COUNT = JLEFT_ATOM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.BlockImpl <em>Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.BlockImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getBlock()
   * @generated
   */
  int BLOCK = 56;

  /**
   * The feature id for the '<em><b>Fp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__FP = SIG__FP;

  /**
   * The feature id for the '<em><b>Tp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__TP = SIG__TP;

  /**
   * The feature id for the '<em><b>Right2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__RIGHT2 = SIG_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_FEATURE_COUNT = SIG_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.BracketedImpl <em>Bracketed</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.BracketedImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getBracketed()
   * @generated
   */
  int BRACKETED = 58;

  /**
   * The feature id for the '<em><b>Right2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRACKETED__RIGHT2 = ENCLOSURE__RIGHT2;

  /**
   * The number of structural features of the '<em>Bracketed</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRACKETED_FEATURE_COUNT = ENCLOSURE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.QuotedIdsImpl <em>Quoted Ids</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.QuotedIdsImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getQuotedIds()
   * @generated
   */
  int QUOTED_IDS = 59;

  /**
   * The feature id for the '<em><b>Right2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUOTED_IDS__RIGHT2 = ENCLOSURE__RIGHT2;

  /**
   * The number of structural features of the '<em>Quoted Ids</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUOTED_IDS_FEATURE_COUNT = ENCLOSURE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.NamesImpl <em>Names</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.NamesImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getNames()
   * @generated
   */
  int NAMES = 60;

  /**
   * The feature id for the '<em><b>Right2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMES__RIGHT2 = QUOTED_IDS__RIGHT2;

  /**
   * The feature id for the '<em><b>First Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMES__FIRST_NAME = QUOTED_IDS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Subsequent Names</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMES__SUBSEQUENT_NAMES = QUOTED_IDS_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Names</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMES_FEATURE_COUNT = QUOTED_IDS_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.AtomImpl <em>Atom</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.AtomImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getAtom()
   * @generated
   */
  int ATOM = 61;

  /**
   * The feature id for the '<em><b>Right2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOM__RIGHT2 = LABELED_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Lab</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOM__LAB = LABELED_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Bm4</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOM__BM4 = LABELED_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOM__ID = LABELED_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Lit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOM__LIT = LABELED_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Atom</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOM_FEATURE_COUNT = LABELED_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.IdImpl <em>Id</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.IdImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getId()
   * @generated
   */
  int ID = 63;

  /**
   * The feature id for the '<em><b>Bas3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID__BAS3 = FLOW_ANY_STATEMENT__BAS3;

  /**
   * The feature id for the '<em><b>Bbs4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID__BBS4 = FLOW_ANY_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>AB Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID__AB_ID = FLOW_ANY_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID__OP = FLOW_ANY_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Id</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID_FEATURE_COUNT = FLOW_ANY_STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.UnqualOp_ArrowTokImpl <em>Unqual Op Arrow Tok</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.UnqualOp_ArrowTokImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getUnqualOp_ArrowTok()
   * @generated
   */
  int UNQUAL_OP_ARROW_TOK = 64;

  /**
   * The feature id for the '<em><b>Bas3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNQUAL_OP_ARROW_TOK__BAS3 = NAKED_OP__BAS3;

  /**
   * The feature id for the '<em><b>Bbs4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNQUAL_OP_ARROW_TOK__BBS4 = NAKED_OP__BBS4;

  /**
   * The number of structural features of the '<em>Unqual Op Arrow Tok</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNQUAL_OP_ARROW_TOK_FEATURE_COUNT = NAKED_OP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.UnqualOp_LatticeTokImpl <em>Unqual Op Lattice Tok</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.UnqualOp_LatticeTokImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getUnqualOp_LatticeTok()
   * @generated
   */
  int UNQUAL_OP_LATTICE_TOK = 65;

  /**
   * The feature id for the '<em><b>Bas3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNQUAL_OP_LATTICE_TOK__BAS3 = NAKED_OP__BAS3;

  /**
   * The feature id for the '<em><b>Bbs4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNQUAL_OP_LATTICE_TOK__BBS4 = NAKED_OP__BBS4;

  /**
   * The number of structural features of the '<em>Unqual Op Lattice Tok</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNQUAL_OP_LATTICE_TOK_FEATURE_COUNT = NAKED_OP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.UnqualOp_RelationTokImpl <em>Unqual Op Relation Tok</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.UnqualOp_RelationTokImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getUnqualOp_RelationTok()
   * @generated
   */
  int UNQUAL_OP_RELATION_TOK = 66;

  /**
   * The feature id for the '<em><b>Bas3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNQUAL_OP_RELATION_TOK__BAS3 = NAKED_OP__BAS3;

  /**
   * The feature id for the '<em><b>Bbs4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNQUAL_OP_RELATION_TOK__BBS4 = NAKED_OP__BBS4;

  /**
   * The number of structural features of the '<em>Unqual Op Relation Tok</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNQUAL_OP_RELATION_TOK_FEATURE_COUNT = NAKED_OP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.UnqualOp_SegTokImpl <em>Unqual Op Seg Tok</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.UnqualOp_SegTokImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getUnqualOp_SegTok()
   * @generated
   */
  int UNQUAL_OP_SEG_TOK = 67;

  /**
   * The feature id for the '<em><b>Bas3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNQUAL_OP_SEG_TOK__BAS3 = NAKED_OP__BAS3;

  /**
   * The feature id for the '<em><b>Bbs4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNQUAL_OP_SEG_TOK__BBS4 = NAKED_OP__BBS4;

  /**
   * The number of structural features of the '<em>Unqual Op Seg Tok</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNQUAL_OP_SEG_TOK_FEATURE_COUNT = NAKED_OP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.UnqualOp_PlusTokImpl <em>Unqual Op Plus Tok</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.UnqualOp_PlusTokImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getUnqualOp_PlusTok()
   * @generated
   */
  int UNQUAL_OP_PLUS_TOK = 68;

  /**
   * The feature id for the '<em><b>Bas3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNQUAL_OP_PLUS_TOK__BAS3 = NAKED_OP__BAS3;

  /**
   * The feature id for the '<em><b>Bbs4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNQUAL_OP_PLUS_TOK__BBS4 = NAKED_OP__BBS4;

  /**
   * The number of structural features of the '<em>Unqual Op Plus Tok</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNQUAL_OP_PLUS_TOK_FEATURE_COUNT = NAKED_OP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.UnqualOp_QuotientTokImpl <em>Unqual Op Quotient Tok</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.UnqualOp_QuotientTokImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getUnqualOp_QuotientTok()
   * @generated
   */
  int UNQUAL_OP_QUOTIENT_TOK = 69;

  /**
   * The feature id for the '<em><b>Bas3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNQUAL_OP_QUOTIENT_TOK__BAS3 = NAKED_OP__BAS3;

  /**
   * The feature id for the '<em><b>Bbs4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNQUAL_OP_QUOTIENT_TOK__BBS4 = NAKED_OP__BBS4;

  /**
   * The number of structural features of the '<em>Unqual Op Quotient Tok</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNQUAL_OP_QUOTIENT_TOK_FEATURE_COUNT = NAKED_OP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.UnqualOp_TimesTokImpl <em>Unqual Op Times Tok</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.UnqualOp_TimesTokImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getUnqualOp_TimesTok()
   * @generated
   */
  int UNQUAL_OP_TIMES_TOK = 70;

  /**
   * The feature id for the '<em><b>Bas3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNQUAL_OP_TIMES_TOK__BAS3 = NAKED_OP__BAS3;

  /**
   * The feature id for the '<em><b>Bbs4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNQUAL_OP_TIMES_TOK__BBS4 = NAKED_OP__BBS4;

  /**
   * The number of structural features of the '<em>Unqual Op Times Tok</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNQUAL_OP_TIMES_TOK_FEATURE_COUNT = NAKED_OP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.UnqualOp_PowerTokImpl <em>Unqual Op Power Tok</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.UnqualOp_PowerTokImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getUnqualOp_PowerTok()
   * @generated
   */
  int UNQUAL_OP_POWER_TOK = 71;

  /**
   * The feature id for the '<em><b>Bas3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNQUAL_OP_POWER_TOK__BAS3 = NAKED_OP__BAS3;

  /**
   * The feature id for the '<em><b>Bbs4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNQUAL_OP_POWER_TOK__BBS4 = NAKED_OP__BBS4;

  /**
   * The number of structural features of the '<em>Unqual Op Power Tok</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNQUAL_OP_POWER_TOK_FEATURE_COUNT = NAKED_OP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.QualOp_LatticeTokImpl <em>Qual Op Lattice Tok</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.QualOp_LatticeTokImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getQualOp_LatticeTok()
   * @generated
   */
  int QUAL_OP_LATTICE_TOK = 73;

  /**
   * The number of structural features of the '<em>Qual Op Lattice Tok</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUAL_OP_LATTICE_TOK_FEATURE_COUNT = LATTICE_OP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.QualOp_SegTokImpl <em>Qual Op Seg Tok</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.QualOp_SegTokImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getQualOp_SegTok()
   * @generated
   */
  int QUAL_OP_SEG_TOK = 74;

  /**
   * The number of structural features of the '<em>Qual Op Seg Tok</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUAL_OP_SEG_TOK_FEATURE_COUNT = SEG_OP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.QualOp_PlusTokImpl <em>Qual Op Plus Tok</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.QualOp_PlusTokImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getQualOp_PlusTok()
   * @generated
   */
  int QUAL_OP_PLUS_TOK = 75;

  /**
   * The number of structural features of the '<em>Qual Op Plus Tok</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUAL_OP_PLUS_TOK_FEATURE_COUNT = PLUS_OP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.QualOp_QuotientTokImpl <em>Qual Op Quotient Tok</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.QualOp_QuotientTokImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getQualOp_QuotientTok()
   * @generated
   */
  int QUAL_OP_QUOTIENT_TOK = 76;

  /**
   * The number of structural features of the '<em>Qual Op Quotient Tok</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUAL_OP_QUOTIENT_TOK_FEATURE_COUNT = QUOTIENT_OP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.QualOp_TimesTokImpl <em>Qual Op Times Tok</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.QualOp_TimesTokImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getQualOp_TimesTok()
   * @generated
   */
  int QUAL_OP_TIMES_TOK = 77;

  /**
   * The number of structural features of the '<em>Qual Op Times Tok</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUAL_OP_TIMES_TOK_FEATURE_COUNT = TIMES_OP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.QualOp_PowerTokImpl <em>Qual Op Power Tok</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.QualOp_PowerTokImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getQualOp_PowerTok()
   * @generated
   */
  int QUAL_OP_POWER_TOK = 78;

  /**
   * The number of structural features of the '<em>Qual Op Power Tok</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUAL_OP_POWER_TOK_FEATURE_COUNT = POWER_OP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.enlist1_CommaItem_Comma_ABImpl <em>enlist1 Comma Item Comma AB</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.enlist1_CommaItem_Comma_ABImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getenlist1_CommaItem_Comma_AB()
   * @generated
   */
  int ENLIST1_COMMA_ITEM_COMMA_AB = 79;

  /**
   * The number of structural features of the '<em>enlist1 Comma Item Comma AB</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENLIST1_COMMA_ITEM_COMMA_AB_FEATURE_COUNT = COMMA_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.enlist1_Infixed_Comma_ABImpl <em>enlist1 Infixed Comma AB</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.enlist1_Infixed_Comma_ABImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getenlist1_Infixed_Comma_AB()
   * @generated
   */
  int ENLIST1_INFIXED_COMMA_AB = 80;

  /**
   * The number of structural features of the '<em>enlist1 Infixed Comma AB</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENLIST1_INFIXED_COMMA_AB_FEATURE_COUNT = FROM_PART_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.enlister1_CommaItem_CommaImpl <em>enlister1 Comma Item Comma</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.enlister1_CommaItem_CommaImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getenlister1_CommaItem_Comma()
   * @generated
   */
  int ENLISTER1_COMMA_ITEM_COMMA = 82;

  /**
   * The number of structural features of the '<em>enlister1 Comma Item Comma</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENLISTER1_COMMA_ITEM_COMMA_FEATURE_COUNT = ENLIST1_COMMA_ITEM_COMMA_AB_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.enlister1_Infixed_CommaImpl <em>enlister1 Infixed Comma</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.enlister1_Infixed_CommaImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getenlister1_Infixed_Comma()
   * @generated
   */
  int ENLISTER1_INFIXED_COMMA = 83;

  /**
   * The feature id for the '<em><b>I</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENLISTER1_INFIXED_COMMA__I = ENLIST1_INFIXED_COMMA_AB_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>enlister1 Infixed Comma</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENLISTER1_INFIXED_COMMA_FEATURE_COUNT = ENLIST1_INFIXED_COMMA_AB_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.enlist1a_Labeled_Semicolon_ABImpl <em>enlist1a Labeled Semicolon AB</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.enlist1a_Labeled_Semicolon_ABImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getenlist1a_Labeled_Semicolon_AB()
   * @generated
   */
  int ENLIST1A_LABELED_SEMICOLON_AB = 85;

  /**
   * The feature id for the '<em><b>Right2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENLIST1A_LABELED_SEMICOLON_AB__RIGHT2 = EXPRESSION__RIGHT2;

  /**
   * The number of structural features of the '<em>enlist1a Labeled Semicolon AB</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENLIST1A_LABELED_SEMICOLON_AB_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.enlister1a_Labeled_SemicolonImpl <em>enlister1a Labeled Semicolon</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.enlister1a_Labeled_SemicolonImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getenlister1a_Labeled_Semicolon()
   * @generated
   */
  int ENLISTER1A_LABELED_SEMICOLON = 86;

  /**
   * The feature id for the '<em><b>Right2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENLISTER1A_LABELED_SEMICOLON__RIGHT2 = ENLIST1A_LABELED_SEMICOLON_AB__RIGHT2;

  /**
   * The feature id for the '<em><b>Statemnts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENLISTER1A_LABELED_SEMICOLON__STATEMNTS = ENLIST1A_LABELED_SEMICOLON_AB_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>enlister1a Labeled Semicolon</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENLISTER1A_LABELED_SEMICOLON_FEATURE_COUNT = ENLIST1A_LABELED_SEMICOLON_AB_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.Curly_LabeledImpl <em>Curly Labeled</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.Curly_LabeledImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getCurly_Labeled()
   * @generated
   */
  int CURLY_LABELED = 87;

  /**
   * The feature id for the '<em><b>Fp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CURLY_LABELED__FP = BLOCK__FP;

  /**
   * The feature id for the '<em><b>Tp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CURLY_LABELED__TP = BLOCK__TP;

  /**
   * The feature id for the '<em><b>Right2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CURLY_LABELED__RIGHT2 = BLOCK__RIGHT2;

  /**
   * The number of structural features of the '<em>Curly Labeled</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CURLY_LABELED_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.CurlyContents_LabeledImpl <em>Curly Contents Labeled</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.CurlyContents_LabeledImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getCurlyContents_Labeled()
   * @generated
   */
  int CURLY_CONTENTS_LABELED = 88;

  /**
   * The feature id for the '<em><b>Fp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CURLY_CONTENTS_LABELED__FP = CURLY_LABELED__FP;

  /**
   * The feature id for the '<em><b>Tp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CURLY_CONTENTS_LABELED__TP = CURLY_LABELED__TP;

  /**
   * The feature id for the '<em><b>Right2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CURLY_CONTENTS_LABELED__RIGHT2 = CURLY_LABELED__RIGHT2;

  /**
   * The number of structural features of the '<em>Curly Contents Labeled</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CURLY_CONTENTS_LABELED_FEATURE_COUNT = CURLY_LABELED_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.CurlyContentsList_LabeledImpl <em>Curly Contents List Labeled</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.CurlyContentsList_LabeledImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getCurlyContentsList_Labeled()
   * @generated
   */
  int CURLY_CONTENTS_LIST_LABELED = 89;

  /**
   * The feature id for the '<em><b>Fp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CURLY_CONTENTS_LIST_LABELED__FP = CURLY_CONTENTS_LABELED__FP;

  /**
   * The feature id for the '<em><b>Tp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CURLY_CONTENTS_LIST_LABELED__TP = CURLY_CONTENTS_LABELED__TP;

  /**
   * The feature id for the '<em><b>Right2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CURLY_CONTENTS_LIST_LABELED__RIGHT2 = CURLY_CONTENTS_LABELED__RIGHT2;

  /**
   * The feature id for the '<em><b>Statemts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CURLY_CONTENTS_LIST_LABELED__STATEMTS = CURLY_CONTENTS_LABELED_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Curly Contents List Labeled</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CURLY_CONTENTS_LIST_LABELED_FEATURE_COUNT = CURLY_CONTENTS_LABELED_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.CurlyContentB_LabeledImpl <em>Curly Content BLabeled</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.CurlyContentB_LabeledImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getCurlyContentB_Labeled()
   * @generated
   */
  int CURLY_CONTENT_BLABELED = 90;

  /**
   * The feature id for the '<em><b>Pred</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CURLY_CONTENT_BLABELED__PRED = 0;

  /**
   * The feature id for the '<em><b>L</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CURLY_CONTENT_BLABELED__L = 1;

  /**
   * The feature id for the '<em><b>Pd</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CURLY_CONTENT_BLABELED__PD = 2;

  /**
   * The number of structural features of the '<em>Curly Content BLabeled</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CURLY_CONTENT_BLABELED_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.E3Impl <em>E3</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.E3Impl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getE3()
   * @generated
   */
  int E3 = 91;

  /**
   * The feature id for the '<em><b>Fp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E3__FP = EXPR__FP;

  /**
   * The feature id for the '<em><b>Tp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E3__TP = EXPR__TP;

  /**
   * The feature id for the '<em><b>Bas</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E3__BAS = EXPR__BAS;

  /**
   * The feature id for the '<em><b>Dp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E3__DP = EXPR__DP;

  /**
   * The feature id for the '<em><b>Ie</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E3__IE = EXPR__IE;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E3__LEFT = EXPR__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E3__RIGHT = EXPR__RIGHT;

  /**
   * The feature id for the '<em><b>Op5</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E3__OP5 = EXPR__OP5;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E3__OP = EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E3__OP2 = EXPR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>E3</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E3_FEATURE_COUNT = EXPR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.E4Impl <em>E4</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.E4Impl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getE4()
   * @generated
   */
  int E4 = 92;

  /**
   * The feature id for the '<em><b>Fp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E4__FP = EXPR__FP;

  /**
   * The feature id for the '<em><b>Tp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E4__TP = EXPR__TP;

  /**
   * The feature id for the '<em><b>Bas</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E4__BAS = EXPR__BAS;

  /**
   * The feature id for the '<em><b>Dp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E4__DP = EXPR__DP;

  /**
   * The feature id for the '<em><b>Ie</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E4__IE = EXPR__IE;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E4__LEFT = EXPR__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E4__RIGHT = EXPR__RIGHT;

  /**
   * The feature id for the '<em><b>Op5</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E4__OP5 = EXPR__OP5;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E4__OP = EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op2</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E4__OP2 = EXPR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>E4</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E4_FEATURE_COUNT = EXPR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.E5Impl <em>E5</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.E5Impl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getE5()
   * @generated
   */
  int E5 = 93;

  /**
   * The feature id for the '<em><b>Fp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E5__FP = EXPR__FP;

  /**
   * The feature id for the '<em><b>Tp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E5__TP = EXPR__TP;

  /**
   * The feature id for the '<em><b>Bas</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E5__BAS = EXPR__BAS;

  /**
   * The feature id for the '<em><b>Dp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E5__DP = EXPR__DP;

  /**
   * The feature id for the '<em><b>Ie</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E5__IE = EXPR__IE;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E5__LEFT = EXPR__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E5__RIGHT = EXPR__RIGHT;

  /**
   * The feature id for the '<em><b>Op5</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E5__OP5 = EXPR__OP5;

  /**
   * The number of structural features of the '<em>E5</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E5_FEATURE_COUNT = EXPR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.E6Impl <em>E6</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.E6Impl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getE6()
   * @generated
   */
  int E6 = 94;

  /**
   * The feature id for the '<em><b>Fp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E6__FP = EXPR__FP;

  /**
   * The feature id for the '<em><b>Tp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E6__TP = EXPR__TP;

  /**
   * The feature id for the '<em><b>Bas</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E6__BAS = EXPR__BAS;

  /**
   * The feature id for the '<em><b>Dp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E6__DP = EXPR__DP;

  /**
   * The feature id for the '<em><b>Ie</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E6__IE = EXPR__IE;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E6__LEFT = EXPR__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E6__RIGHT = EXPR__RIGHT;

  /**
   * The feature id for the '<em><b>Op5</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E6__OP5 = EXPR__OP5;

  /**
   * The feature id for the '<em><b>Op6</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E6__OP6 = EXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>E6</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E6_FEATURE_COUNT = EXPR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.E7Impl <em>E7</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.E7Impl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getE7()
   * @generated
   */
  int E7 = 95;

  /**
   * The feature id for the '<em><b>Fp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E7__FP = EXPR__FP;

  /**
   * The feature id for the '<em><b>Tp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E7__TP = EXPR__TP;

  /**
   * The feature id for the '<em><b>Bas</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E7__BAS = EXPR__BAS;

  /**
   * The feature id for the '<em><b>Dp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E7__DP = EXPR__DP;

  /**
   * The feature id for the '<em><b>Ie</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E7__IE = EXPR__IE;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E7__LEFT = EXPR__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E7__RIGHT = EXPR__RIGHT;

  /**
   * The feature id for the '<em><b>Op5</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E7__OP5 = EXPR__OP5;

  /**
   * The feature id for the '<em><b>Op7</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E7__OP7 = EXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>E7</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E7_FEATURE_COUNT = EXPR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.E8Impl <em>E8</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.E8Impl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getE8()
   * @generated
   */
  int E8 = 96;

  /**
   * The feature id for the '<em><b>Fp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E8__FP = EXPR__FP;

  /**
   * The feature id for the '<em><b>Tp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E8__TP = EXPR__TP;

  /**
   * The feature id for the '<em><b>Bas</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E8__BAS = EXPR__BAS;

  /**
   * The feature id for the '<em><b>Dp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E8__DP = EXPR__DP;

  /**
   * The feature id for the '<em><b>Ie</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E8__IE = EXPR__IE;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E8__LEFT = EXPR__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E8__RIGHT = EXPR__RIGHT;

  /**
   * The feature id for the '<em><b>Op5</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E8__OP5 = EXPR__OP5;

  /**
   * The feature id for the '<em><b>Op8</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E8__OP8 = EXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>E8</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E8_FEATURE_COUNT = EXPR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.E9Impl <em>E9</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.E9Impl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getE9()
   * @generated
   */
  int E9 = 97;

  /**
   * The feature id for the '<em><b>Fp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E9__FP = EXPR__FP;

  /**
   * The feature id for the '<em><b>Tp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E9__TP = EXPR__TP;

  /**
   * The feature id for the '<em><b>Bas</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E9__BAS = EXPR__BAS;

  /**
   * The feature id for the '<em><b>Dp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E9__DP = EXPR__DP;

  /**
   * The feature id for the '<em><b>Ie</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E9__IE = EXPR__IE;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E9__LEFT = EXPR__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E9__RIGHT = EXPR__RIGHT;

  /**
   * The feature id for the '<em><b>Op5</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E9__OP5 = EXPR__OP5;

  /**
   * The feature id for the '<em><b>Op9</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E9__OP9 = EXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>E9</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E9_FEATURE_COUNT = EXPR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.E11_E12Impl <em>E11 E12</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.E11_E12Impl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getE11_E12()
   * @generated
   */
  int E11_E12 = 98;

  /**
   * The feature id for the '<em><b>Fp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E11_E12__FP = EXPR__FP;

  /**
   * The feature id for the '<em><b>Tp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E11_E12__TP = EXPR__TP;

  /**
   * The feature id for the '<em><b>Bas</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E11_E12__BAS = EXPR__BAS;

  /**
   * The feature id for the '<em><b>Dp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E11_E12__DP = EXPR__DP;

  /**
   * The feature id for the '<em><b>Ie</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E11_E12__IE = EXPR__IE;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E11_E12__LEFT = EXPR__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E11_E12__RIGHT = EXPR__RIGHT;

  /**
   * The feature id for the '<em><b>Op5</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E11_E12__OP5 = EXPR__OP5;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E11_E12__OP = EXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>E11 E12</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E11_E12_FEATURE_COUNT = EXPR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.E11_OpImpl <em>E11 Op</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.E11_OpImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getE11_Op()
   * @generated
   */
  int E11_OP = 99;

  /**
   * The feature id for the '<em><b>Fp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E11_OP__FP = EXPR__FP;

  /**
   * The feature id for the '<em><b>Tp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E11_OP__TP = EXPR__TP;

  /**
   * The feature id for the '<em><b>Bas</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E11_OP__BAS = EXPR__BAS;

  /**
   * The feature id for the '<em><b>Dp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E11_OP__DP = EXPR__DP;

  /**
   * The feature id for the '<em><b>Ie</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E11_OP__IE = EXPR__IE;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E11_OP__LEFT = EXPR__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E11_OP__RIGHT = EXPR__RIGHT;

  /**
   * The feature id for the '<em><b>Op5</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E11_OP__OP5 = EXPR__OP5;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E11_OP__OP = EXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>E11 Op</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E11_OP_FEATURE_COUNT = EXPR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.ArrowTokImpl <em>Arrow Tok</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.ArrowTokImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getArrowTok()
   * @generated
   */
  int ARROW_TOK = 100;

  /**
   * The feature id for the '<em><b>Bas3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARROW_TOK__BAS3 = UNQUAL_OP_ARROW_TOK__BAS3;

  /**
   * The feature id for the '<em><b>Bbs4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARROW_TOK__BBS4 = UNQUAL_OP_ARROW_TOK__BBS4;

  /**
   * The number of structural features of the '<em>Arrow Tok</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARROW_TOK_FEATURE_COUNT = UNQUAL_OP_ARROW_TOK_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.LatticeTokImpl <em>Lattice Tok</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.LatticeTokImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getLatticeTok()
   * @generated
   */
  int LATTICE_TOK = 101;

  /**
   * The feature id for the '<em><b>Bas3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LATTICE_TOK__BAS3 = UNQUAL_OP_LATTICE_TOK__BAS3;

  /**
   * The feature id for the '<em><b>Bbs4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LATTICE_TOK__BBS4 = UNQUAL_OP_LATTICE_TOK__BBS4;

  /**
   * The number of structural features of the '<em>Lattice Tok</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LATTICE_TOK_FEATURE_COUNT = UNQUAL_OP_LATTICE_TOK_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.RelationTokImpl <em>Relation Tok</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.RelationTokImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getRelationTok()
   * @generated
   */
  int RELATION_TOK = 102;

  /**
   * The feature id for the '<em><b>Bas3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_TOK__BAS3 = UNQUAL_OP_RELATION_TOK__BAS3;

  /**
   * The feature id for the '<em><b>Bbs4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_TOK__BBS4 = UNQUAL_OP_RELATION_TOK__BBS4;

  /**
   * The number of structural features of the '<em>Relation Tok</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_TOK_FEATURE_COUNT = UNQUAL_OP_RELATION_TOK_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.SegTokImpl <em>Seg Tok</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.SegTokImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getSegTok()
   * @generated
   */
  int SEG_TOK = 103;

  /**
   * The feature id for the '<em><b>Bas3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEG_TOK__BAS3 = UNQUAL_OP_SEG_TOK__BAS3;

  /**
   * The feature id for the '<em><b>Bbs4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEG_TOK__BBS4 = UNQUAL_OP_SEG_TOK__BBS4;

  /**
   * The number of structural features of the '<em>Seg Tok</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEG_TOK_FEATURE_COUNT = UNQUAL_OP_SEG_TOK_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.PlusTokImpl <em>Plus Tok</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.PlusTokImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getPlusTok()
   * @generated
   */
  int PLUS_TOK = 104;

  /**
   * The feature id for the '<em><b>Bas3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS_TOK__BAS3 = UNQUAL_OP_PLUS_TOK__BAS3;

  /**
   * The feature id for the '<em><b>Bbs4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS_TOK__BBS4 = UNQUAL_OP_PLUS_TOK__BBS4;

  /**
   * The number of structural features of the '<em>Plus Tok</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS_TOK_FEATURE_COUNT = UNQUAL_OP_PLUS_TOK_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.QuotientTokImpl <em>Quotient Tok</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.QuotientTokImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getQuotientTok()
   * @generated
   */
  int QUOTIENT_TOK = 105;

  /**
   * The feature id for the '<em><b>Bas3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUOTIENT_TOK__BAS3 = UNQUAL_OP_QUOTIENT_TOK__BAS3;

  /**
   * The feature id for the '<em><b>Bbs4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUOTIENT_TOK__BBS4 = UNQUAL_OP_QUOTIENT_TOK__BBS4;

  /**
   * The number of structural features of the '<em>Quotient Tok</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUOTIENT_TOK_FEATURE_COUNT = UNQUAL_OP_QUOTIENT_TOK_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.TimesTokImpl <em>Times Tok</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.TimesTokImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getTimesTok()
   * @generated
   */
  int TIMES_TOK = 106;

  /**
   * The feature id for the '<em><b>Bas3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMES_TOK__BAS3 = UNQUAL_OP_TIMES_TOK__BAS3;

  /**
   * The feature id for the '<em><b>Bbs4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMES_TOK__BBS4 = UNQUAL_OP_TIMES_TOK__BBS4;

  /**
   * The number of structural features of the '<em>Times Tok</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMES_TOK_FEATURE_COUNT = UNQUAL_OP_TIMES_TOK_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.PowerTokImpl <em>Power Tok</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.PowerTokImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getPowerTok()
   * @generated
   */
  int POWER_TOK = 107;

  /**
   * The feature id for the '<em><b>Bas3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POWER_TOK__BAS3 = UNQUAL_OP_POWER_TOK__BAS3;

  /**
   * The feature id for the '<em><b>Bbs4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POWER_TOK__BBS4 = UNQUAL_OP_POWER_TOK__BBS4;

  /**
   * The number of structural features of the '<em>Power Tok</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POWER_TOK_FEATURE_COUNT = UNQUAL_OP_POWER_TOK_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see com.euclideanspace.aldor.editor.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the attribute list '{@link com.euclideanspace.aldor.editor.Model#getInsert <em>Insert</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Insert</em>'.
   * @see com.euclideanspace.aldor.editor.Model#getInsert()
   * @see #getModel()
   * @generated
   */
  EAttribute getModel_Insert();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.aldor.editor.Model#getCc <em>Cc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cc</em>'.
   * @see com.euclideanspace.aldor.editor.Model#getCc()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Cc();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see com.euclideanspace.aldor.editor.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.Labeled <em>Labeled</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Labeled</em>'.
   * @see com.euclideanspace.aldor.editor.Labeled
   * @generated
   */
  EClass getLabeled();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.Declaration <em>Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Declaration</em>'.
   * @see com.euclideanspace.aldor.editor.Declaration
   * @generated
   */
  EClass getDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.aldor.editor.Declaration#getFp <em>Fp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fp</em>'.
   * @see com.euclideanspace.aldor.editor.Declaration#getFp()
   * @see #getDeclaration()
   * @generated
   */
  EReference getDeclaration_Fp();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.ExportDecl <em>Export Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Export Decl</em>'.
   * @see com.euclideanspace.aldor.editor.ExportDecl
   * @generated
   */
  EClass getExportDecl();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.aldor.editor.ExportDecl#getTp <em>Tp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tp</em>'.
   * @see com.euclideanspace.aldor.editor.ExportDecl#getTp()
   * @see #getExportDecl()
   * @generated
   */
  EAttribute getExportDecl_Tp();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.FromPart <em>From Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>From Part</em>'.
   * @see com.euclideanspace.aldor.editor.FromPart
   * @generated
   */
  EClass getFromPart();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.MacroBody <em>Macro Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Macro Body</em>'.
   * @see com.euclideanspace.aldor.editor.MacroBody
   * @generated
   */
  EClass getMacroBody();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.Sig <em>Sig</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sig</em>'.
   * @see com.euclideanspace.aldor.editor.Sig
   * @generated
   */
  EClass getSig();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.DeclPart <em>Decl Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Decl Part</em>'.
   * @see com.euclideanspace.aldor.editor.DeclPart
   * @generated
   */
  EClass getDeclPart();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.Comma <em>Comma</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Comma</em>'.
   * @see com.euclideanspace.aldor.editor.Comma
   * @generated
   */
  EClass getComma();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.CommaItem <em>Comma Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Comma Item</em>'.
   * @see com.euclideanspace.aldor.editor.CommaItem
   * @generated
   */
  EClass getCommaItem();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.aldor.editor.CommaItem#getBbs <em>Bbs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bbs</em>'.
   * @see com.euclideanspace.aldor.editor.CommaItem#getBbs()
   * @see #getCommaItem()
   * @generated
   */
  EReference getCommaItem_Bbs();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.aldor.editor.CommaItem#getBas <em>Bas</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bas</em>'.
   * @see com.euclideanspace.aldor.editor.CommaItem#getBas()
   * @see #getCommaItem()
   * @generated
   */
  EReference getCommaItem_Bas();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.aldor.editor.CommaItem#getBbs2 <em>Bbs2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bbs2</em>'.
   * @see com.euclideanspace.aldor.editor.CommaItem#getBbs2()
   * @see #getCommaItem()
   * @generated
   */
  EReference getCommaItem_Bbs2();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.aldor.editor.CommaItem#getCi <em>Ci</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ci</em>'.
   * @see com.euclideanspace.aldor.editor.CommaItem#getCi()
   * @see #getCommaItem()
   * @generated
   */
  EReference getCommaItem_Ci();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.DeclBinding <em>Decl Binding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Decl Binding</em>'.
   * @see com.euclideanspace.aldor.editor.DeclBinding
   * @generated
   */
  EClass getDeclBinding();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.InfixedExprsDecl <em>Infixed Exprs Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Infixed Exprs Decl</em>'.
   * @see com.euclideanspace.aldor.editor.InfixedExprsDecl
   * @generated
   */
  EClass getInfixedExprsDecl();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.aldor.editor.InfixedExprsDecl#getBas <em>Bas</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bas</em>'.
   * @see com.euclideanspace.aldor.editor.InfixedExprsDecl#getBas()
   * @see #getInfixedExprsDecl()
   * @generated
   */
  EReference getInfixedExprsDecl_Bas();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.InfixedExprs <em>Infixed Exprs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Infixed Exprs</em>'.
   * @see com.euclideanspace.aldor.editor.InfixedExprs
   * @generated
   */
  EClass getInfixedExprs();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.aldor.editor.InfixedExprs#getDp <em>Dp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dp</em>'.
   * @see com.euclideanspace.aldor.editor.InfixedExprs#getDp()
   * @see #getInfixedExprs()
   * @generated
   */
  EReference getInfixedExprs_Dp();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.Binding_AnyStatement <em>Binding Any Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Binding Any Statement</em>'.
   * @see com.euclideanspace.aldor.editor.Binding_AnyStatement
   * @generated
   */
  EClass getBinding_AnyStatement();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.aldor.editor.Binding_AnyStatement#getBe <em>Be</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Be</em>'.
   * @see com.euclideanspace.aldor.editor.Binding_AnyStatement#getBe()
   * @see #getBinding_AnyStatement()
   * @generated
   */
  EReference getBinding_AnyStatement_Be();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.aldor.editor.Binding_AnyStatement#getApa <em>Apa</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Apa</em>'.
   * @see com.euclideanspace.aldor.editor.Binding_AnyStatement#getApa()
   * @see #getBinding_AnyStatement()
   * @generated
   */
  EReference getBinding_AnyStatement_Apa();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.aldor.editor.Binding_AnyStatement#getC <em>C</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>C</em>'.
   * @see com.euclideanspace.aldor.editor.Binding_AnyStatement#getC()
   * @see #getBinding_AnyStatement()
   * @generated
   */
  EReference getBinding_AnyStatement_C();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.aldor.editor.Binding_AnyStatement#getApb <em>Apb</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Apb</em>'.
   * @see com.euclideanspace.aldor.editor.Binding_AnyStatement#getApb()
   * @see #getBinding_AnyStatement()
   * @generated
   */
  EReference getBinding_AnyStatement_Apb();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.Binding_BalStatement <em>Binding Bal Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Binding Bal Statement</em>'.
   * @see com.euclideanspace.aldor.editor.Binding_BalStatement
   * @generated
   */
  EClass getBinding_BalStatement();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.Binding_Collection <em>Binding Collection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Binding Collection</em>'.
   * @see com.euclideanspace.aldor.editor.Binding_Collection
   * @generated
   */
  EClass getBinding_Collection();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.BindingL_Infixed_AnyStatement <em>Binding LInfixed Any Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Binding LInfixed Any Statement</em>'.
   * @see com.euclideanspace.aldor.editor.BindingL_Infixed_AnyStatement
   * @generated
   */
  EClass getBindingL_Infixed_AnyStatement();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.aldor.editor.BindingL_Infixed_AnyStatement#getBia <em>Bia</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bia</em>'.
   * @see com.euclideanspace.aldor.editor.BindingL_Infixed_AnyStatement#getBia()
   * @see #getBindingL_Infixed_AnyStatement()
   * @generated
   */
  EReference getBindingL_Infixed_AnyStatement_Bia();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.BindingL_Infixed_BalStatement <em>Binding LInfixed Bal Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Binding LInfixed Bal Statement</em>'.
   * @see com.euclideanspace.aldor.editor.BindingL_Infixed_BalStatement
   * @generated
   */
  EClass getBindingL_Infixed_BalStatement();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.aldor.editor.BindingL_Infixed_BalStatement#getBib <em>Bib</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bib</em>'.
   * @see com.euclideanspace.aldor.editor.BindingL_Infixed_BalStatement#getBib()
   * @see #getBindingL_Infixed_BalStatement()
   * @generated
   */
  EReference getBindingL_Infixed_BalStatement_Bib();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.BindingL_Infixed_Collection <em>Binding LInfixed Collection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Binding LInfixed Collection</em>'.
   * @see com.euclideanspace.aldor.editor.BindingL_Infixed_Collection
   * @generated
   */
  EClass getBindingL_Infixed_Collection();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.aldor.editor.BindingL_Infixed_Collection#getBic <em>Bic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bic</em>'.
   * @see com.euclideanspace.aldor.editor.BindingL_Infixed_Collection#getBic()
   * @see #getBindingL_Infixed_Collection()
   * @generated
   */
  EReference getBindingL_Infixed_Collection_Bic();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.BindingR_InfixedExprsDecl_AnyStatement <em>Binding RInfixed Exprs Decl Any Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Binding RInfixed Exprs Decl Any Statement</em>'.
   * @see com.euclideanspace.aldor.editor.BindingR_InfixedExprsDecl_AnyStatement
   * @generated
   */
  EClass getBindingR_InfixedExprsDecl_AnyStatement();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.Flow_AnyStatement <em>Flow Any Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Flow Any Statement</em>'.
   * @see com.euclideanspace.aldor.editor.Flow_AnyStatement
   * @generated
   */
  EClass getFlow_AnyStatement();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.aldor.editor.Flow_AnyStatement#getBas3 <em>Bas3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bas3</em>'.
   * @see com.euclideanspace.aldor.editor.Flow_AnyStatement#getBas3()
   * @see #getFlow_AnyStatement()
   * @generated
   */
  EReference getFlow_AnyStatement_Bas3();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.Flow_BalStatement <em>Flow Bal Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Flow Bal Statement</em>'.
   * @see com.euclideanspace.aldor.editor.Flow_BalStatement
   * @generated
   */
  EClass getFlow_BalStatement();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.aldor.editor.Flow_BalStatement#getBbs4 <em>Bbs4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bbs4</em>'.
   * @see com.euclideanspace.aldor.editor.Flow_BalStatement#getBbs4()
   * @see #getFlow_BalStatement()
   * @generated
   */
  EReference getFlow_BalStatement_Bbs4();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.GenBound <em>Gen Bound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Gen Bound</em>'.
   * @see com.euclideanspace.aldor.editor.GenBound
   * @generated
   */
  EClass getGenBound();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.aldor.editor.GenBound#getBas4 <em>Bas4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bas4</em>'.
   * @see com.euclideanspace.aldor.editor.GenBound#getBas4()
   * @see #getGenBound()
   * @generated
   */
  EReference getGenBound_Bas4();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.aldor.editor.GenBound#getBbs5 <em>Bbs5</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bbs5</em>'.
   * @see com.euclideanspace.aldor.editor.GenBound#getBbs5()
   * @see #getGenBound()
   * @generated
   */
  EReference getGenBound_Bbs5();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.ButExpr <em>But Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>But Expr</em>'.
   * @see com.euclideanspace.aldor.editor.ButExpr
   * @generated
   */
  EClass getButExpr();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.aldor.editor.ButExpr#getDb <em>Db</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Db</em>'.
   * @see com.euclideanspace.aldor.editor.ButExpr#getDb()
   * @see #getButExpr()
   * @generated
   */
  EReference getButExpr_Db();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.aldor.editor.ButExpr#getCa <em>Ca</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ca</em>'.
   * @see com.euclideanspace.aldor.editor.ButExpr#getCa()
   * @see #getButExpr()
   * @generated
   */
  EReference getButExpr_Ca();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.Cases <em>Cases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cases</em>'.
   * @see com.euclideanspace.aldor.editor.Cases
   * @generated
   */
  EClass getCases();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.AlwaysPart_AnyStatement <em>Always Part Any Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Always Part Any Statement</em>'.
   * @see com.euclideanspace.aldor.editor.AlwaysPart_AnyStatement
   * @generated
   */
  EClass getAlwaysPart_AnyStatement();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.AlwaysPart_BalStatement <em>Always Part Bal Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Always Part Bal Statement</em>'.
   * @see com.euclideanspace.aldor.editor.AlwaysPart_BalStatement
   * @generated
   */
  EClass getAlwaysPart_BalStatement();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.Collection <em>Collection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Collection</em>'.
   * @see com.euclideanspace.aldor.editor.Collection
   * @generated
   */
  EClass getCollection();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.aldor.editor.Collection#getBas2 <em>Bas2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bas2</em>'.
   * @see com.euclideanspace.aldor.editor.Collection#getBas2()
   * @see #getCollection()
   * @generated
   */
  EReference getCollection_Bas2();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.aldor.editor.Collection#getBbs3 <em>Bbs3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bbs3</em>'.
   * @see com.euclideanspace.aldor.editor.Collection#getBbs3()
   * @see #getCollection()
   * @generated
   */
  EReference getCollection_Bbs3();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.aldor.editor.Collection#getI <em>I</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>I</em>'.
   * @see com.euclideanspace.aldor.editor.Collection#getI()
   * @see #getCollection()
   * @generated
   */
  EAttribute getCollection_I();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.Iterator <em>Iterator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Iterator</em>'.
   * @see com.euclideanspace.aldor.editor.Iterator
   * @generated
   */
  EClass getIterator();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.aldor.editor.Iterator#getI <em>I</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>I</em>'.
   * @see com.euclideanspace.aldor.editor.Iterator#getI()
   * @see #getIterator()
   * @generated
   */
  EAttribute getIterator_I();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.aldor.editor.Iterator#getSp <em>Sp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sp</em>'.
   * @see com.euclideanspace.aldor.editor.Iterator#getSp()
   * @see #getIterator()
   * @generated
   */
  EAttribute getIterator_Sp();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.InfixedExpr <em>Infixed Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Infixed Expr</em>'.
   * @see com.euclideanspace.aldor.editor.InfixedExpr
   * @generated
   */
  EClass getInfixedExpr();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.aldor.editor.InfixedExpr#getIe <em>Ie</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ie</em>'.
   * @see com.euclideanspace.aldor.editor.InfixedExpr#getIe()
   * @see #getInfixedExpr()
   * @generated
   */
  EReference getInfixedExpr_Ie();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.Expr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr</em>'.
   * @see com.euclideanspace.aldor.editor.Expr
   * @generated
   */
  EClass getExpr();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.aldor.editor.Expr#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.euclideanspace.aldor.editor.Expr#getLeft()
   * @see #getExpr()
   * @generated
   */
  EReference getExpr_Left();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.aldor.editor.Expr#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.euclideanspace.aldor.editor.Expr#getRight()
   * @see #getExpr()
   * @generated
   */
  EReference getExpr_Right();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.aldor.editor.Expr#getOp5 <em>Op5</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Op5</em>'.
   * @see com.euclideanspace.aldor.editor.Expr#getOp5()
   * @see #getExpr()
   * @generated
   */
  EReference getExpr_Op5();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see com.euclideanspace.aldor.editor.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.E12 <em>E12</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>E12</em>'.
   * @see com.euclideanspace.aldor.editor.E12
   * @generated
   */
  EClass getE12();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.aldor.editor.E12#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.euclideanspace.aldor.editor.E12#getLeft()
   * @see #getE12()
   * @generated
   */
  EReference getE12_Left();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.aldor.editor.E12#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Op</em>'.
   * @see com.euclideanspace.aldor.editor.E12#getOp()
   * @see #getE12()
   * @generated
   */
  EReference getE12_Op();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.aldor.editor.E12#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.euclideanspace.aldor.editor.E12#getRight()
   * @see #getE12()
   * @generated
   */
  EReference getE12_Right();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.E13 <em>E13</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>E13</em>'.
   * @see com.euclideanspace.aldor.editor.E13
   * @generated
   */
  EClass getE13();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.aldor.editor.E13#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.euclideanspace.aldor.editor.E13#getLeft()
   * @see #getE13()
   * @generated
   */
  EReference getE13_Left();

  /**
   * Returns the meta object for the attribute list '{@link com.euclideanspace.aldor.editor.E13#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Op</em>'.
   * @see com.euclideanspace.aldor.editor.E13#getOp()
   * @see #getE13()
   * @generated
   */
  EAttribute getE13_Op();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.aldor.editor.E13#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.euclideanspace.aldor.editor.E13#getRight()
   * @see #getE13()
   * @generated
   */
  EReference getE13_Right();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.QualTail <em>Qual Tail</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Qual Tail</em>'.
   * @see com.euclideanspace.aldor.editor.QualTail
   * @generated
   */
  EClass getQualTail();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.OpQualTail <em>Op Qual Tail</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Op Qual Tail</em>'.
   * @see com.euclideanspace.aldor.editor.OpQualTail
   * @generated
   */
  EClass getOpQualTail();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.aldor.editor.OpQualTail#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see com.euclideanspace.aldor.editor.OpQualTail#getName()
   * @see #getOpQualTail()
   * @generated
   */
  EReference getOpQualTail_Name();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.E14 <em>E14</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>E14</em>'.
   * @see com.euclideanspace.aldor.editor.E14
   * @generated
   */
  EClass getE14();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.aldor.editor.E14#getE15left <em>E1 5left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>E1 5left</em>'.
   * @see com.euclideanspace.aldor.editor.E14#getE15left()
   * @see #getE14()
   * @generated
   */
  EAttribute getE14_E15left();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.aldor.editor.E14#getDm <em>Dm</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dm</em>'.
   * @see com.euclideanspace.aldor.editor.E14#getDm()
   * @see #getE14()
   * @generated
   */
  EReference getE14_Dm();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.aldor.editor.E14#getE15right <em>E1 5right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>E1 5right</em>'.
   * @see com.euclideanspace.aldor.editor.E14#getE15right()
   * @see #getE14()
   * @generated
   */
  EAttribute getE14_E15right();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.Op <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Op</em>'.
   * @see com.euclideanspace.aldor.editor.Op
   * @generated
   */
  EClass getOp();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.NakedOp <em>Naked Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Naked Op</em>'.
   * @see com.euclideanspace.aldor.editor.NakedOp
   * @generated
   */
  EClass getNakedOp();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.ArrowOp <em>Arrow Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Arrow Op</em>'.
   * @see com.euclideanspace.aldor.editor.ArrowOp
   * @generated
   */
  EClass getArrowOp();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.LatticeOp <em>Lattice Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Lattice Op</em>'.
   * @see com.euclideanspace.aldor.editor.LatticeOp
   * @generated
   */
  EClass getLatticeOp();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.SegOp <em>Seg Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Seg Op</em>'.
   * @see com.euclideanspace.aldor.editor.SegOp
   * @generated
   */
  EClass getSegOp();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.PlusOp <em>Plus Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Plus Op</em>'.
   * @see com.euclideanspace.aldor.editor.PlusOp
   * @generated
   */
  EClass getPlusOp();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.QuotientOp <em>Quotient Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Quotient Op</em>'.
   * @see com.euclideanspace.aldor.editor.QuotientOp
   * @generated
   */
  EClass getQuotientOp();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.TimesOp <em>Times Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Times Op</em>'.
   * @see com.euclideanspace.aldor.editor.TimesOp
   * @generated
   */
  EClass getTimesOp();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.PowerOp <em>Power Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Power Op</em>'.
   * @see com.euclideanspace.aldor.editor.PowerOp
   * @generated
   */
  EClass getPowerOp();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.LeftJuxtaposed <em>Left Juxtaposed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Left Juxtaposed</em>'.
   * @see com.euclideanspace.aldor.editor.LeftJuxtaposed
   * @generated
   */
  EClass getLeftJuxtaposed();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.aldor.editor.LeftJuxtaposed#getQt <em>Qt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Qt</em>'.
   * @see com.euclideanspace.aldor.editor.LeftJuxtaposed#getQt()
   * @see #getLeftJuxtaposed()
   * @generated
   */
  EReference getLeftJuxtaposed_Qt();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.Jright_Atom <em>Jright Atom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Jright Atom</em>'.
   * @see com.euclideanspace.aldor.editor.Jright_Atom
   * @generated
   */
  EClass getJright_Atom();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.aldor.editor.Jright_Atom#getRight2 <em>Right2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right2</em>'.
   * @see com.euclideanspace.aldor.editor.Jright_Atom#getRight2()
   * @see #getJright_Atom()
   * @generated
   */
  EReference getJright_Atom_Right2();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.Jleft_Molecule <em>Jleft Molecule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Jleft Molecule</em>'.
   * @see com.euclideanspace.aldor.editor.Jleft_Molecule
   * @generated
   */
  EClass getJleft_Molecule();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.aldor.editor.Jleft_Molecule#getBe <em>Be</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Be</em>'.
   * @see com.euclideanspace.aldor.editor.Jleft_Molecule#getBe()
   * @see #getJleft_Molecule()
   * @generated
   */
  EReference getJleft_Molecule_Be();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.aldor.editor.Jleft_Molecule#getM <em>M</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>M</em>'.
   * @see com.euclideanspace.aldor.editor.Jleft_Molecule#getM()
   * @see #getJleft_Molecule()
   * @generated
   */
  EReference getJleft_Molecule_M();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.aldor.editor.Jleft_Molecule#getBm <em>Bm</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Bm</em>'.
   * @see com.euclideanspace.aldor.editor.Jleft_Molecule#getBm()
   * @see #getJleft_Molecule()
   * @generated
   */
  EReference getJleft_Molecule_Bm();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.Jleft_Atom <em>Jleft Atom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Jleft Atom</em>'.
   * @see com.euclideanspace.aldor.editor.Jleft_Atom
   * @generated
   */
  EClass getJleft_Atom();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.Molecule <em>Molecule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Molecule</em>'.
   * @see com.euclideanspace.aldor.editor.Molecule
   * @generated
   */
  EClass getMolecule();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.Enclosure <em>Enclosure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enclosure</em>'.
   * @see com.euclideanspace.aldor.editor.Enclosure
   * @generated
   */
  EClass getEnclosure();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.DeclMolecule <em>Decl Molecule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Decl Molecule</em>'.
   * @see com.euclideanspace.aldor.editor.DeclMolecule
   * @generated
   */
  EClass getDeclMolecule();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.aldor.editor.DeclMolecule#getA <em>A</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>A</em>'.
   * @see com.euclideanspace.aldor.editor.DeclMolecule#getA()
   * @see #getDeclMolecule()
   * @generated
   */
  EAttribute getDeclMolecule_A();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.aldor.editor.DeclMolecule#getB <em>B</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>B</em>'.
   * @see com.euclideanspace.aldor.editor.DeclMolecule#getB()
   * @see #getDeclMolecule()
   * @generated
   */
  EReference getDeclMolecule_B();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.BlockMolecule <em>Block Molecule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Block Molecule</em>'.
   * @see com.euclideanspace.aldor.editor.BlockMolecule
   * @generated
   */
  EClass getBlockMolecule();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.BlockEnclosure <em>Block Enclosure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Block Enclosure</em>'.
   * @see com.euclideanspace.aldor.editor.BlockEnclosure
   * @generated
   */
  EClass getBlockEnclosure();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.Block <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Block</em>'.
   * @see com.euclideanspace.aldor.editor.Block
   * @generated
   */
  EClass getBlock();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.Parened <em>Parened</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parened</em>'.
   * @see com.euclideanspace.aldor.editor.Parened
   * @generated
   */
  EClass getParened();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.Bracketed <em>Bracketed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bracketed</em>'.
   * @see com.euclideanspace.aldor.editor.Bracketed
   * @generated
   */
  EClass getBracketed();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.QuotedIds <em>Quoted Ids</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Quoted Ids</em>'.
   * @see com.euclideanspace.aldor.editor.QuotedIds
   * @generated
   */
  EClass getQuotedIds();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.Names <em>Names</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Names</em>'.
   * @see com.euclideanspace.aldor.editor.Names
   * @generated
   */
  EClass getNames();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.aldor.editor.Names#getFirstName <em>First Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>First Name</em>'.
   * @see com.euclideanspace.aldor.editor.Names#getFirstName()
   * @see #getNames()
   * @generated
   */
  EAttribute getNames_FirstName();

  /**
   * Returns the meta object for the attribute list '{@link com.euclideanspace.aldor.editor.Names#getSubsequentNames <em>Subsequent Names</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Subsequent Names</em>'.
   * @see com.euclideanspace.aldor.editor.Names#getSubsequentNames()
   * @see #getNames()
   * @generated
   */
  EAttribute getNames_SubsequentNames();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.Atom <em>Atom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Atom</em>'.
   * @see com.euclideanspace.aldor.editor.Atom
   * @generated
   */
  EClass getAtom();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.aldor.editor.Atom#getLab <em>Lab</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lab</em>'.
   * @see com.euclideanspace.aldor.editor.Atom#getLab()
   * @see #getAtom()
   * @generated
   */
  EReference getAtom_Lab();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.aldor.editor.Atom#getBm4 <em>Bm4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Bm4</em>'.
   * @see com.euclideanspace.aldor.editor.Atom#getBm4()
   * @see #getAtom()
   * @generated
   */
  EReference getAtom_Bm4();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.aldor.editor.Atom#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Id</em>'.
   * @see com.euclideanspace.aldor.editor.Atom#getId()
   * @see #getAtom()
   * @generated
   */
  EReference getAtom_Id();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.aldor.editor.Atom#getLit <em>Lit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lit</em>'.
   * @see com.euclideanspace.aldor.editor.Atom#getLit()
   * @see #getAtom()
   * @generated
   */
  EAttribute getAtom_Lit();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.Name <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Name</em>'.
   * @see com.euclideanspace.aldor.editor.Name
   * @generated
   */
  EClass getName_();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.Id <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Id</em>'.
   * @see com.euclideanspace.aldor.editor.Id
   * @generated
   */
  EClass getId();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.aldor.editor.Id#getAB_Id <em>AB Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>AB Id</em>'.
   * @see com.euclideanspace.aldor.editor.Id#getAB_Id()
   * @see #getId()
   * @generated
   */
  EAttribute getId_AB_Id();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.aldor.editor.Id#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see com.euclideanspace.aldor.editor.Id#getOp()
   * @see #getId()
   * @generated
   */
  EAttribute getId_Op();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.UnqualOp_ArrowTok <em>Unqual Op Arrow Tok</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unqual Op Arrow Tok</em>'.
   * @see com.euclideanspace.aldor.editor.UnqualOp_ArrowTok
   * @generated
   */
  EClass getUnqualOp_ArrowTok();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.UnqualOp_LatticeTok <em>Unqual Op Lattice Tok</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unqual Op Lattice Tok</em>'.
   * @see com.euclideanspace.aldor.editor.UnqualOp_LatticeTok
   * @generated
   */
  EClass getUnqualOp_LatticeTok();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.UnqualOp_RelationTok <em>Unqual Op Relation Tok</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unqual Op Relation Tok</em>'.
   * @see com.euclideanspace.aldor.editor.UnqualOp_RelationTok
   * @generated
   */
  EClass getUnqualOp_RelationTok();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.UnqualOp_SegTok <em>Unqual Op Seg Tok</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unqual Op Seg Tok</em>'.
   * @see com.euclideanspace.aldor.editor.UnqualOp_SegTok
   * @generated
   */
  EClass getUnqualOp_SegTok();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.UnqualOp_PlusTok <em>Unqual Op Plus Tok</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unqual Op Plus Tok</em>'.
   * @see com.euclideanspace.aldor.editor.UnqualOp_PlusTok
   * @generated
   */
  EClass getUnqualOp_PlusTok();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.UnqualOp_QuotientTok <em>Unqual Op Quotient Tok</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unqual Op Quotient Tok</em>'.
   * @see com.euclideanspace.aldor.editor.UnqualOp_QuotientTok
   * @generated
   */
  EClass getUnqualOp_QuotientTok();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.UnqualOp_TimesTok <em>Unqual Op Times Tok</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unqual Op Times Tok</em>'.
   * @see com.euclideanspace.aldor.editor.UnqualOp_TimesTok
   * @generated
   */
  EClass getUnqualOp_TimesTok();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.UnqualOp_PowerTok <em>Unqual Op Power Tok</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unqual Op Power Tok</em>'.
   * @see com.euclideanspace.aldor.editor.UnqualOp_PowerTok
   * @generated
   */
  EClass getUnqualOp_PowerTok();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.QualOp_ArrowTok <em>Qual Op Arrow Tok</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Qual Op Arrow Tok</em>'.
   * @see com.euclideanspace.aldor.editor.QualOp_ArrowTok
   * @generated
   */
  EClass getQualOp_ArrowTok();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.QualOp_LatticeTok <em>Qual Op Lattice Tok</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Qual Op Lattice Tok</em>'.
   * @see com.euclideanspace.aldor.editor.QualOp_LatticeTok
   * @generated
   */
  EClass getQualOp_LatticeTok();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.QualOp_SegTok <em>Qual Op Seg Tok</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Qual Op Seg Tok</em>'.
   * @see com.euclideanspace.aldor.editor.QualOp_SegTok
   * @generated
   */
  EClass getQualOp_SegTok();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.QualOp_PlusTok <em>Qual Op Plus Tok</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Qual Op Plus Tok</em>'.
   * @see com.euclideanspace.aldor.editor.QualOp_PlusTok
   * @generated
   */
  EClass getQualOp_PlusTok();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.QualOp_QuotientTok <em>Qual Op Quotient Tok</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Qual Op Quotient Tok</em>'.
   * @see com.euclideanspace.aldor.editor.QualOp_QuotientTok
   * @generated
   */
  EClass getQualOp_QuotientTok();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.QualOp_TimesTok <em>Qual Op Times Tok</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Qual Op Times Tok</em>'.
   * @see com.euclideanspace.aldor.editor.QualOp_TimesTok
   * @generated
   */
  EClass getQualOp_TimesTok();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.QualOp_PowerTok <em>Qual Op Power Tok</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Qual Op Power Tok</em>'.
   * @see com.euclideanspace.aldor.editor.QualOp_PowerTok
   * @generated
   */
  EClass getQualOp_PowerTok();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.enlist1_CommaItem_Comma_AB <em>enlist1 Comma Item Comma AB</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>enlist1 Comma Item Comma AB</em>'.
   * @see com.euclideanspace.aldor.editor.enlist1_CommaItem_Comma_AB
   * @generated
   */
  EClass getenlist1_CommaItem_Comma_AB();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.enlist1_Infixed_Comma_AB <em>enlist1 Infixed Comma AB</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>enlist1 Infixed Comma AB</em>'.
   * @see com.euclideanspace.aldor.editor.enlist1_Infixed_Comma_AB
   * @generated
   */
  EClass getenlist1_Infixed_Comma_AB();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.enlist1_InfixedExpr_Comma_AB <em>enlist1 Infixed Expr Comma AB</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>enlist1 Infixed Expr Comma AB</em>'.
   * @see com.euclideanspace.aldor.editor.enlist1_InfixedExpr_Comma_AB
   * @generated
   */
  EClass getenlist1_InfixedExpr_Comma_AB();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.enlister1_CommaItem_Comma <em>enlister1 Comma Item Comma</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>enlister1 Comma Item Comma</em>'.
   * @see com.euclideanspace.aldor.editor.enlister1_CommaItem_Comma
   * @generated
   */
  EClass getenlister1_CommaItem_Comma();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.enlister1_Infixed_Comma <em>enlister1 Infixed Comma</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>enlister1 Infixed Comma</em>'.
   * @see com.euclideanspace.aldor.editor.enlister1_Infixed_Comma
   * @generated
   */
  EClass getenlister1_Infixed_Comma();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.aldor.editor.enlister1_Infixed_Comma#getI <em>I</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>I</em>'.
   * @see com.euclideanspace.aldor.editor.enlister1_Infixed_Comma#getI()
   * @see #getenlister1_Infixed_Comma()
   * @generated
   */
  EAttribute getenlister1_Infixed_Comma_I();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.enlister1_InfixedExpr_Comma <em>enlister1 Infixed Expr Comma</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>enlister1 Infixed Expr Comma</em>'.
   * @see com.euclideanspace.aldor.editor.enlister1_InfixedExpr_Comma
   * @generated
   */
  EClass getenlister1_InfixedExpr_Comma();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.enlist1a_Labeled_Semicolon_AB <em>enlist1a Labeled Semicolon AB</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>enlist1a Labeled Semicolon AB</em>'.
   * @see com.euclideanspace.aldor.editor.enlist1a_Labeled_Semicolon_AB
   * @generated
   */
  EClass getenlist1a_Labeled_Semicolon_AB();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.enlister1a_Labeled_Semicolon <em>enlister1a Labeled Semicolon</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>enlister1a Labeled Semicolon</em>'.
   * @see com.euclideanspace.aldor.editor.enlister1a_Labeled_Semicolon
   * @generated
   */
  EClass getenlister1a_Labeled_Semicolon();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.aldor.editor.enlister1a_Labeled_Semicolon#getStatemnts <em>Statemnts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statemnts</em>'.
   * @see com.euclideanspace.aldor.editor.enlister1a_Labeled_Semicolon#getStatemnts()
   * @see #getenlister1a_Labeled_Semicolon()
   * @generated
   */
  EReference getenlister1a_Labeled_Semicolon_Statemnts();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.Curly_Labeled <em>Curly Labeled</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Curly Labeled</em>'.
   * @see com.euclideanspace.aldor.editor.Curly_Labeled
   * @generated
   */
  EClass getCurly_Labeled();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.CurlyContents_Labeled <em>Curly Contents Labeled</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Curly Contents Labeled</em>'.
   * @see com.euclideanspace.aldor.editor.CurlyContents_Labeled
   * @generated
   */
  EClass getCurlyContents_Labeled();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.CurlyContentsList_Labeled <em>Curly Contents List Labeled</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Curly Contents List Labeled</em>'.
   * @see com.euclideanspace.aldor.editor.CurlyContentsList_Labeled
   * @generated
   */
  EClass getCurlyContentsList_Labeled();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.aldor.editor.CurlyContentsList_Labeled#getStatemts <em>Statemts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statemts</em>'.
   * @see com.euclideanspace.aldor.editor.CurlyContentsList_Labeled#getStatemts()
   * @see #getCurlyContentsList_Labeled()
   * @generated
   */
  EReference getCurlyContentsList_Labeled_Statemts();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.CurlyContentB_Labeled <em>Curly Content BLabeled</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Curly Content BLabeled</em>'.
   * @see com.euclideanspace.aldor.editor.CurlyContentB_Labeled
   * @generated
   */
  EClass getCurlyContentB_Labeled();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.aldor.editor.CurlyContentB_Labeled#getPred <em>Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pred</em>'.
   * @see com.euclideanspace.aldor.editor.CurlyContentB_Labeled#getPred()
   * @see #getCurlyContentB_Labeled()
   * @generated
   */
  EAttribute getCurlyContentB_Labeled_Pred();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.aldor.editor.CurlyContentB_Labeled#getL <em>L</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>L</em>'.
   * @see com.euclideanspace.aldor.editor.CurlyContentB_Labeled#getL()
   * @see #getCurlyContentB_Labeled()
   * @generated
   */
  EReference getCurlyContentB_Labeled_L();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.aldor.editor.CurlyContentB_Labeled#getPd <em>Pd</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pd</em>'.
   * @see com.euclideanspace.aldor.editor.CurlyContentB_Labeled#getPd()
   * @see #getCurlyContentB_Labeled()
   * @generated
   */
  EAttribute getCurlyContentB_Labeled_Pd();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.E3 <em>E3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>E3</em>'.
   * @see com.euclideanspace.aldor.editor.E3
   * @generated
   */
  EClass getE3();

  /**
   * Returns the meta object for the attribute list '{@link com.euclideanspace.aldor.editor.E3#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Op</em>'.
   * @see com.euclideanspace.aldor.editor.E3#getOp()
   * @see #getE3()
   * @generated
   */
  EAttribute getE3_Op();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.aldor.editor.E3#getOp2 <em>Op2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Op2</em>'.
   * @see com.euclideanspace.aldor.editor.E3#getOp2()
   * @see #getE3()
   * @generated
   */
  EReference getE3_Op2();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.E4 <em>E4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>E4</em>'.
   * @see com.euclideanspace.aldor.editor.E4
   * @generated
   */
  EClass getE4();

  /**
   * Returns the meta object for the attribute list '{@link com.euclideanspace.aldor.editor.E4#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Op</em>'.
   * @see com.euclideanspace.aldor.editor.E4#getOp()
   * @see #getE4()
   * @generated
   */
  EAttribute getE4_Op();

  /**
   * Returns the meta object for the attribute list '{@link com.euclideanspace.aldor.editor.E4#getOp2 <em>Op2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Op2</em>'.
   * @see com.euclideanspace.aldor.editor.E4#getOp2()
   * @see #getE4()
   * @generated
   */
  EAttribute getE4_Op2();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.E5 <em>E5</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>E5</em>'.
   * @see com.euclideanspace.aldor.editor.E5
   * @generated
   */
  EClass getE5();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.E6 <em>E6</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>E6</em>'.
   * @see com.euclideanspace.aldor.editor.E6
   * @generated
   */
  EClass getE6();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.aldor.editor.E6#getOp6 <em>Op6</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Op6</em>'.
   * @see com.euclideanspace.aldor.editor.E6#getOp6()
   * @see #getE6()
   * @generated
   */
  EReference getE6_Op6();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.E7 <em>E7</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>E7</em>'.
   * @see com.euclideanspace.aldor.editor.E7
   * @generated
   */
  EClass getE7();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.aldor.editor.E7#getOp7 <em>Op7</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Op7</em>'.
   * @see com.euclideanspace.aldor.editor.E7#getOp7()
   * @see #getE7()
   * @generated
   */
  EReference getE7_Op7();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.E8 <em>E8</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>E8</em>'.
   * @see com.euclideanspace.aldor.editor.E8
   * @generated
   */
  EClass getE8();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.aldor.editor.E8#getOp8 <em>Op8</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Op8</em>'.
   * @see com.euclideanspace.aldor.editor.E8#getOp8()
   * @see #getE8()
   * @generated
   */
  EReference getE8_Op8();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.E9 <em>E9</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>E9</em>'.
   * @see com.euclideanspace.aldor.editor.E9
   * @generated
   */
  EClass getE9();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.aldor.editor.E9#getOp9 <em>Op9</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Op9</em>'.
   * @see com.euclideanspace.aldor.editor.E9#getOp9()
   * @see #getE9()
   * @generated
   */
  EReference getE9_Op9();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.E11_E12 <em>E11 E12</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>E11 E12</em>'.
   * @see com.euclideanspace.aldor.editor.E11_E12
   * @generated
   */
  EClass getE11_E12();

  /**
   * Returns the meta object for the attribute list '{@link com.euclideanspace.aldor.editor.E11_E12#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Op</em>'.
   * @see com.euclideanspace.aldor.editor.E11_E12#getOp()
   * @see #getE11_E12()
   * @generated
   */
  EAttribute getE11_E12_Op();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.E11_Op <em>E11 Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>E11 Op</em>'.
   * @see com.euclideanspace.aldor.editor.E11_Op
   * @generated
   */
  EClass getE11_Op();

  /**
   * Returns the meta object for the attribute list '{@link com.euclideanspace.aldor.editor.E11_Op#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Op</em>'.
   * @see com.euclideanspace.aldor.editor.E11_Op#getOp()
   * @see #getE11_Op()
   * @generated
   */
  EAttribute getE11_Op_Op();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.ArrowTok <em>Arrow Tok</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Arrow Tok</em>'.
   * @see com.euclideanspace.aldor.editor.ArrowTok
   * @generated
   */
  EClass getArrowTok();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.LatticeTok <em>Lattice Tok</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Lattice Tok</em>'.
   * @see com.euclideanspace.aldor.editor.LatticeTok
   * @generated
   */
  EClass getLatticeTok();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.RelationTok <em>Relation Tok</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relation Tok</em>'.
   * @see com.euclideanspace.aldor.editor.RelationTok
   * @generated
   */
  EClass getRelationTok();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.SegTok <em>Seg Tok</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Seg Tok</em>'.
   * @see com.euclideanspace.aldor.editor.SegTok
   * @generated
   */
  EClass getSegTok();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.PlusTok <em>Plus Tok</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Plus Tok</em>'.
   * @see com.euclideanspace.aldor.editor.PlusTok
   * @generated
   */
  EClass getPlusTok();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.QuotientTok <em>Quotient Tok</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Quotient Tok</em>'.
   * @see com.euclideanspace.aldor.editor.QuotientTok
   * @generated
   */
  EClass getQuotientTok();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.TimesTok <em>Times Tok</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Times Tok</em>'.
   * @see com.euclideanspace.aldor.editor.TimesTok
   * @generated
   */
  EClass getTimesTok();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.PowerTok <em>Power Tok</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Power Tok</em>'.
   * @see com.euclideanspace.aldor.editor.PowerTok
   * @generated
   */
  EClass getPowerTok();

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
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.ModelImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Insert</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL__INSERT = eINSTANCE.getModel_Insert();

    /**
     * The meta object literal for the '<em><b>Cc</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__CC = eINSTANCE.getModel_Cc();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.ExpressionImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.LabeledImpl <em>Labeled</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.LabeledImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getLabeled()
     * @generated
     */
    EClass LABELED = eINSTANCE.getLabeled();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.DeclarationImpl <em>Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.DeclarationImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getDeclaration()
     * @generated
     */
    EClass DECLARATION = eINSTANCE.getDeclaration();

    /**
     * The meta object literal for the '<em><b>Fp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECLARATION__FP = eINSTANCE.getDeclaration_Fp();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.ExportDeclImpl <em>Export Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.ExportDeclImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getExportDecl()
     * @generated
     */
    EClass EXPORT_DECL = eINSTANCE.getExportDecl();

    /**
     * The meta object literal for the '<em><b>Tp</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPORT_DECL__TP = eINSTANCE.getExportDecl_Tp();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.FromPartImpl <em>From Part</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.FromPartImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getFromPart()
     * @generated
     */
    EClass FROM_PART = eINSTANCE.getFromPart();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.MacroBodyImpl <em>Macro Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.MacroBodyImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getMacroBody()
     * @generated
     */
    EClass MACRO_BODY = eINSTANCE.getMacroBody();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.SigImpl <em>Sig</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.SigImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getSig()
     * @generated
     */
    EClass SIG = eINSTANCE.getSig();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.DeclPartImpl <em>Decl Part</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.DeclPartImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getDeclPart()
     * @generated
     */
    EClass DECL_PART = eINSTANCE.getDeclPart();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.CommaImpl <em>Comma</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.CommaImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getComma()
     * @generated
     */
    EClass COMMA = eINSTANCE.getComma();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.CommaItemImpl <em>Comma Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.CommaItemImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getCommaItem()
     * @generated
     */
    EClass COMMA_ITEM = eINSTANCE.getCommaItem();

    /**
     * The meta object literal for the '<em><b>Bbs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMA_ITEM__BBS = eINSTANCE.getCommaItem_Bbs();

    /**
     * The meta object literal for the '<em><b>Bas</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMA_ITEM__BAS = eINSTANCE.getCommaItem_Bas();

    /**
     * The meta object literal for the '<em><b>Bbs2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMA_ITEM__BBS2 = eINSTANCE.getCommaItem_Bbs2();

    /**
     * The meta object literal for the '<em><b>Ci</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMA_ITEM__CI = eINSTANCE.getCommaItem_Ci();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.DeclBindingImpl <em>Decl Binding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.DeclBindingImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getDeclBinding()
     * @generated
     */
    EClass DECL_BINDING = eINSTANCE.getDeclBinding();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.InfixedExprsDeclImpl <em>Infixed Exprs Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.InfixedExprsDeclImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getInfixedExprsDecl()
     * @generated
     */
    EClass INFIXED_EXPRS_DECL = eINSTANCE.getInfixedExprsDecl();

    /**
     * The meta object literal for the '<em><b>Bas</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INFIXED_EXPRS_DECL__BAS = eINSTANCE.getInfixedExprsDecl_Bas();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.InfixedExprsImpl <em>Infixed Exprs</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.InfixedExprsImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getInfixedExprs()
     * @generated
     */
    EClass INFIXED_EXPRS = eINSTANCE.getInfixedExprs();

    /**
     * The meta object literal for the '<em><b>Dp</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INFIXED_EXPRS__DP = eINSTANCE.getInfixedExprs_Dp();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.Binding_AnyStatementImpl <em>Binding Any Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.Binding_AnyStatementImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getBinding_AnyStatement()
     * @generated
     */
    EClass BINDING_ANY_STATEMENT = eINSTANCE.getBinding_AnyStatement();

    /**
     * The meta object literal for the '<em><b>Be</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINDING_ANY_STATEMENT__BE = eINSTANCE.getBinding_AnyStatement_Be();

    /**
     * The meta object literal for the '<em><b>Apa</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINDING_ANY_STATEMENT__APA = eINSTANCE.getBinding_AnyStatement_Apa();

    /**
     * The meta object literal for the '<em><b>C</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINDING_ANY_STATEMENT__C = eINSTANCE.getBinding_AnyStatement_C();

    /**
     * The meta object literal for the '<em><b>Apb</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINDING_ANY_STATEMENT__APB = eINSTANCE.getBinding_AnyStatement_Apb();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.Binding_BalStatementImpl <em>Binding Bal Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.Binding_BalStatementImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getBinding_BalStatement()
     * @generated
     */
    EClass BINDING_BAL_STATEMENT = eINSTANCE.getBinding_BalStatement();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.Binding_CollectionImpl <em>Binding Collection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.Binding_CollectionImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getBinding_Collection()
     * @generated
     */
    EClass BINDING_COLLECTION = eINSTANCE.getBinding_Collection();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.BindingL_Infixed_AnyStatementImpl <em>Binding LInfixed Any Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.BindingL_Infixed_AnyStatementImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getBindingL_Infixed_AnyStatement()
     * @generated
     */
    EClass BINDING_LINFIXED_ANY_STATEMENT = eINSTANCE.getBindingL_Infixed_AnyStatement();

    /**
     * The meta object literal for the '<em><b>Bia</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINDING_LINFIXED_ANY_STATEMENT__BIA = eINSTANCE.getBindingL_Infixed_AnyStatement_Bia();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.BindingL_Infixed_BalStatementImpl <em>Binding LInfixed Bal Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.BindingL_Infixed_BalStatementImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getBindingL_Infixed_BalStatement()
     * @generated
     */
    EClass BINDING_LINFIXED_BAL_STATEMENT = eINSTANCE.getBindingL_Infixed_BalStatement();

    /**
     * The meta object literal for the '<em><b>Bib</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINDING_LINFIXED_BAL_STATEMENT__BIB = eINSTANCE.getBindingL_Infixed_BalStatement_Bib();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.BindingL_Infixed_CollectionImpl <em>Binding LInfixed Collection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.BindingL_Infixed_CollectionImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getBindingL_Infixed_Collection()
     * @generated
     */
    EClass BINDING_LINFIXED_COLLECTION = eINSTANCE.getBindingL_Infixed_Collection();

    /**
     * The meta object literal for the '<em><b>Bic</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINDING_LINFIXED_COLLECTION__BIC = eINSTANCE.getBindingL_Infixed_Collection_Bic();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.BindingR_InfixedExprsDecl_AnyStatementImpl <em>Binding RInfixed Exprs Decl Any Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.BindingR_InfixedExprsDecl_AnyStatementImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getBindingR_InfixedExprsDecl_AnyStatement()
     * @generated
     */
    EClass BINDING_RINFIXED_EXPRS_DECL_ANY_STATEMENT = eINSTANCE.getBindingR_InfixedExprsDecl_AnyStatement();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.Flow_AnyStatementImpl <em>Flow Any Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.Flow_AnyStatementImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getFlow_AnyStatement()
     * @generated
     */
    EClass FLOW_ANY_STATEMENT = eINSTANCE.getFlow_AnyStatement();

    /**
     * The meta object literal for the '<em><b>Bas3</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FLOW_ANY_STATEMENT__BAS3 = eINSTANCE.getFlow_AnyStatement_Bas3();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.Flow_BalStatementImpl <em>Flow Bal Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.Flow_BalStatementImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getFlow_BalStatement()
     * @generated
     */
    EClass FLOW_BAL_STATEMENT = eINSTANCE.getFlow_BalStatement();

    /**
     * The meta object literal for the '<em><b>Bbs4</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FLOW_BAL_STATEMENT__BBS4 = eINSTANCE.getFlow_BalStatement_Bbs4();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.GenBoundImpl <em>Gen Bound</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.GenBoundImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getGenBound()
     * @generated
     */
    EClass GEN_BOUND = eINSTANCE.getGenBound();

    /**
     * The meta object literal for the '<em><b>Bas4</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GEN_BOUND__BAS4 = eINSTANCE.getGenBound_Bas4();

    /**
     * The meta object literal for the '<em><b>Bbs5</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GEN_BOUND__BBS5 = eINSTANCE.getGenBound_Bbs5();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.ButExprImpl <em>But Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.ButExprImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getButExpr()
     * @generated
     */
    EClass BUT_EXPR = eINSTANCE.getButExpr();

    /**
     * The meta object literal for the '<em><b>Db</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUT_EXPR__DB = eINSTANCE.getButExpr_Db();

    /**
     * The meta object literal for the '<em><b>Ca</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUT_EXPR__CA = eINSTANCE.getButExpr_Ca();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.CasesImpl <em>Cases</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.CasesImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getCases()
     * @generated
     */
    EClass CASES = eINSTANCE.getCases();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.AlwaysPart_AnyStatementImpl <em>Always Part Any Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.AlwaysPart_AnyStatementImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getAlwaysPart_AnyStatement()
     * @generated
     */
    EClass ALWAYS_PART_ANY_STATEMENT = eINSTANCE.getAlwaysPart_AnyStatement();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.AlwaysPart_BalStatementImpl <em>Always Part Bal Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.AlwaysPart_BalStatementImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getAlwaysPart_BalStatement()
     * @generated
     */
    EClass ALWAYS_PART_BAL_STATEMENT = eINSTANCE.getAlwaysPart_BalStatement();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.CollectionImpl <em>Collection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.CollectionImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getCollection()
     * @generated
     */
    EClass COLLECTION = eINSTANCE.getCollection();

    /**
     * The meta object literal for the '<em><b>Bas2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLLECTION__BAS2 = eINSTANCE.getCollection_Bas2();

    /**
     * The meta object literal for the '<em><b>Bbs3</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLLECTION__BBS3 = eINSTANCE.getCollection_Bbs3();

    /**
     * The meta object literal for the '<em><b>I</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLLECTION__I = eINSTANCE.getCollection_I();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.IteratorImpl <em>Iterator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.IteratorImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getIterator()
     * @generated
     */
    EClass ITERATOR = eINSTANCE.getIterator();

    /**
     * The meta object literal for the '<em><b>I</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ITERATOR__I = eINSTANCE.getIterator_I();

    /**
     * The meta object literal for the '<em><b>Sp</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ITERATOR__SP = eINSTANCE.getIterator_Sp();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.InfixedExprImpl <em>Infixed Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.InfixedExprImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getInfixedExpr()
     * @generated
     */
    EClass INFIXED_EXPR = eINSTANCE.getInfixedExpr();

    /**
     * The meta object literal for the '<em><b>Ie</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INFIXED_EXPR__IE = eINSTANCE.getInfixedExpr_Ie();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.ExprImpl <em>Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.ExprImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getExpr()
     * @generated
     */
    EClass EXPR = eINSTANCE.getExpr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR__LEFT = eINSTANCE.getExpr_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR__RIGHT = eINSTANCE.getExpr_Right();

    /**
     * The meta object literal for the '<em><b>Op5</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR__OP5 = eINSTANCE.getExpr_Op5();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.TypeImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.E12Impl <em>E12</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.E12Impl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getE12()
     * @generated
     */
    EClass E12 = eINSTANCE.getE12();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference E12__LEFT = eINSTANCE.getE12_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference E12__OP = eINSTANCE.getE12_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference E12__RIGHT = eINSTANCE.getE12_Right();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.E13Impl <em>E13</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.E13Impl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getE13()
     * @generated
     */
    EClass E13 = eINSTANCE.getE13();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference E13__LEFT = eINSTANCE.getE13_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute E13__OP = eINSTANCE.getE13_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference E13__RIGHT = eINSTANCE.getE13_Right();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.QualTailImpl <em>Qual Tail</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.QualTailImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getQualTail()
     * @generated
     */
    EClass QUAL_TAIL = eINSTANCE.getQualTail();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.OpQualTailImpl <em>Op Qual Tail</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.OpQualTailImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getOpQualTail()
     * @generated
     */
    EClass OP_QUAL_TAIL = eINSTANCE.getOpQualTail();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OP_QUAL_TAIL__NAME = eINSTANCE.getOpQualTail_Name();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.E14Impl <em>E14</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.E14Impl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getE14()
     * @generated
     */
    EClass E14 = eINSTANCE.getE14();

    /**
     * The meta object literal for the '<em><b>E1 5left</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute E14__E15LEFT = eINSTANCE.getE14_E15left();

    /**
     * The meta object literal for the '<em><b>Dm</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference E14__DM = eINSTANCE.getE14_Dm();

    /**
     * The meta object literal for the '<em><b>E1 5right</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute E14__E15RIGHT = eINSTANCE.getE14_E15right();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.OpImpl <em>Op</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.OpImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getOp()
     * @generated
     */
    EClass OP = eINSTANCE.getOp();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.NakedOpImpl <em>Naked Op</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.NakedOpImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getNakedOp()
     * @generated
     */
    EClass NAKED_OP = eINSTANCE.getNakedOp();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.ArrowOpImpl <em>Arrow Op</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.ArrowOpImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getArrowOp()
     * @generated
     */
    EClass ARROW_OP = eINSTANCE.getArrowOp();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.LatticeOpImpl <em>Lattice Op</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.LatticeOpImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getLatticeOp()
     * @generated
     */
    EClass LATTICE_OP = eINSTANCE.getLatticeOp();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.SegOpImpl <em>Seg Op</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.SegOpImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getSegOp()
     * @generated
     */
    EClass SEG_OP = eINSTANCE.getSegOp();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.PlusOpImpl <em>Plus Op</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.PlusOpImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getPlusOp()
     * @generated
     */
    EClass PLUS_OP = eINSTANCE.getPlusOp();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.QuotientOpImpl <em>Quotient Op</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.QuotientOpImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getQuotientOp()
     * @generated
     */
    EClass QUOTIENT_OP = eINSTANCE.getQuotientOp();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.TimesOpImpl <em>Times Op</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.TimesOpImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getTimesOp()
     * @generated
     */
    EClass TIMES_OP = eINSTANCE.getTimesOp();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.PowerOpImpl <em>Power Op</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.PowerOpImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getPowerOp()
     * @generated
     */
    EClass POWER_OP = eINSTANCE.getPowerOp();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.LeftJuxtaposedImpl <em>Left Juxtaposed</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.LeftJuxtaposedImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getLeftJuxtaposed()
     * @generated
     */
    EClass LEFT_JUXTAPOSED = eINSTANCE.getLeftJuxtaposed();

    /**
     * The meta object literal for the '<em><b>Qt</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LEFT_JUXTAPOSED__QT = eINSTANCE.getLeftJuxtaposed_Qt();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.Jright_AtomImpl <em>Jright Atom</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.Jright_AtomImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getJright_Atom()
     * @generated
     */
    EClass JRIGHT_ATOM = eINSTANCE.getJright_Atom();

    /**
     * The meta object literal for the '<em><b>Right2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JRIGHT_ATOM__RIGHT2 = eINSTANCE.getJright_Atom_Right2();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.Jleft_MoleculeImpl <em>Jleft Molecule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.Jleft_MoleculeImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getJleft_Molecule()
     * @generated
     */
    EClass JLEFT_MOLECULE = eINSTANCE.getJleft_Molecule();

    /**
     * The meta object literal for the '<em><b>Be</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JLEFT_MOLECULE__BE = eINSTANCE.getJleft_Molecule_Be();

    /**
     * The meta object literal for the '<em><b>M</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JLEFT_MOLECULE__M = eINSTANCE.getJleft_Molecule_M();

    /**
     * The meta object literal for the '<em><b>Bm</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JLEFT_MOLECULE__BM = eINSTANCE.getJleft_Molecule_Bm();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.Jleft_AtomImpl <em>Jleft Atom</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.Jleft_AtomImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getJleft_Atom()
     * @generated
     */
    EClass JLEFT_ATOM = eINSTANCE.getJleft_Atom();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.MoleculeImpl <em>Molecule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.MoleculeImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getMolecule()
     * @generated
     */
    EClass MOLECULE = eINSTANCE.getMolecule();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.EnclosureImpl <em>Enclosure</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.EnclosureImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getEnclosure()
     * @generated
     */
    EClass ENCLOSURE = eINSTANCE.getEnclosure();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.DeclMoleculeImpl <em>Decl Molecule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.DeclMoleculeImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getDeclMolecule()
     * @generated
     */
    EClass DECL_MOLECULE = eINSTANCE.getDeclMolecule();

    /**
     * The meta object literal for the '<em><b>A</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECL_MOLECULE__A = eINSTANCE.getDeclMolecule_A();

    /**
     * The meta object literal for the '<em><b>B</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECL_MOLECULE__B = eINSTANCE.getDeclMolecule_B();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.BlockMoleculeImpl <em>Block Molecule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.BlockMoleculeImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getBlockMolecule()
     * @generated
     */
    EClass BLOCK_MOLECULE = eINSTANCE.getBlockMolecule();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.BlockEnclosureImpl <em>Block Enclosure</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.BlockEnclosureImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getBlockEnclosure()
     * @generated
     */
    EClass BLOCK_ENCLOSURE = eINSTANCE.getBlockEnclosure();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.BlockImpl <em>Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.BlockImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getBlock()
     * @generated
     */
    EClass BLOCK = eINSTANCE.getBlock();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.ParenedImpl <em>Parened</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.ParenedImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getParened()
     * @generated
     */
    EClass PARENED = eINSTANCE.getParened();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.BracketedImpl <em>Bracketed</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.BracketedImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getBracketed()
     * @generated
     */
    EClass BRACKETED = eINSTANCE.getBracketed();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.QuotedIdsImpl <em>Quoted Ids</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.QuotedIdsImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getQuotedIds()
     * @generated
     */
    EClass QUOTED_IDS = eINSTANCE.getQuotedIds();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.NamesImpl <em>Names</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.NamesImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getNames()
     * @generated
     */
    EClass NAMES = eINSTANCE.getNames();

    /**
     * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAMES__FIRST_NAME = eINSTANCE.getNames_FirstName();

    /**
     * The meta object literal for the '<em><b>Subsequent Names</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAMES__SUBSEQUENT_NAMES = eINSTANCE.getNames_SubsequentNames();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.AtomImpl <em>Atom</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.AtomImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getAtom()
     * @generated
     */
    EClass ATOM = eINSTANCE.getAtom();

    /**
     * The meta object literal for the '<em><b>Lab</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATOM__LAB = eINSTANCE.getAtom_Lab();

    /**
     * The meta object literal for the '<em><b>Bm4</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATOM__BM4 = eINSTANCE.getAtom_Bm4();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATOM__ID = eINSTANCE.getAtom_Id();

    /**
     * The meta object literal for the '<em><b>Lit</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATOM__LIT = eINSTANCE.getAtom_Lit();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.NameImpl <em>Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.NameImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getName_()
     * @generated
     */
    EClass NAME = eINSTANCE.getName_();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.IdImpl <em>Id</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.IdImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getId()
     * @generated
     */
    EClass ID = eINSTANCE.getId();

    /**
     * The meta object literal for the '<em><b>AB Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ID__AB_ID = eINSTANCE.getId_AB_Id();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ID__OP = eINSTANCE.getId_Op();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.UnqualOp_ArrowTokImpl <em>Unqual Op Arrow Tok</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.UnqualOp_ArrowTokImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getUnqualOp_ArrowTok()
     * @generated
     */
    EClass UNQUAL_OP_ARROW_TOK = eINSTANCE.getUnqualOp_ArrowTok();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.UnqualOp_LatticeTokImpl <em>Unqual Op Lattice Tok</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.UnqualOp_LatticeTokImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getUnqualOp_LatticeTok()
     * @generated
     */
    EClass UNQUAL_OP_LATTICE_TOK = eINSTANCE.getUnqualOp_LatticeTok();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.UnqualOp_RelationTokImpl <em>Unqual Op Relation Tok</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.UnqualOp_RelationTokImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getUnqualOp_RelationTok()
     * @generated
     */
    EClass UNQUAL_OP_RELATION_TOK = eINSTANCE.getUnqualOp_RelationTok();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.UnqualOp_SegTokImpl <em>Unqual Op Seg Tok</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.UnqualOp_SegTokImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getUnqualOp_SegTok()
     * @generated
     */
    EClass UNQUAL_OP_SEG_TOK = eINSTANCE.getUnqualOp_SegTok();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.UnqualOp_PlusTokImpl <em>Unqual Op Plus Tok</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.UnqualOp_PlusTokImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getUnqualOp_PlusTok()
     * @generated
     */
    EClass UNQUAL_OP_PLUS_TOK = eINSTANCE.getUnqualOp_PlusTok();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.UnqualOp_QuotientTokImpl <em>Unqual Op Quotient Tok</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.UnqualOp_QuotientTokImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getUnqualOp_QuotientTok()
     * @generated
     */
    EClass UNQUAL_OP_QUOTIENT_TOK = eINSTANCE.getUnqualOp_QuotientTok();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.UnqualOp_TimesTokImpl <em>Unqual Op Times Tok</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.UnqualOp_TimesTokImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getUnqualOp_TimesTok()
     * @generated
     */
    EClass UNQUAL_OP_TIMES_TOK = eINSTANCE.getUnqualOp_TimesTok();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.UnqualOp_PowerTokImpl <em>Unqual Op Power Tok</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.UnqualOp_PowerTokImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getUnqualOp_PowerTok()
     * @generated
     */
    EClass UNQUAL_OP_POWER_TOK = eINSTANCE.getUnqualOp_PowerTok();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.QualOp_ArrowTokImpl <em>Qual Op Arrow Tok</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.QualOp_ArrowTokImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getQualOp_ArrowTok()
     * @generated
     */
    EClass QUAL_OP_ARROW_TOK = eINSTANCE.getQualOp_ArrowTok();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.QualOp_LatticeTokImpl <em>Qual Op Lattice Tok</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.QualOp_LatticeTokImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getQualOp_LatticeTok()
     * @generated
     */
    EClass QUAL_OP_LATTICE_TOK = eINSTANCE.getQualOp_LatticeTok();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.QualOp_SegTokImpl <em>Qual Op Seg Tok</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.QualOp_SegTokImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getQualOp_SegTok()
     * @generated
     */
    EClass QUAL_OP_SEG_TOK = eINSTANCE.getQualOp_SegTok();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.QualOp_PlusTokImpl <em>Qual Op Plus Tok</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.QualOp_PlusTokImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getQualOp_PlusTok()
     * @generated
     */
    EClass QUAL_OP_PLUS_TOK = eINSTANCE.getQualOp_PlusTok();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.QualOp_QuotientTokImpl <em>Qual Op Quotient Tok</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.QualOp_QuotientTokImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getQualOp_QuotientTok()
     * @generated
     */
    EClass QUAL_OP_QUOTIENT_TOK = eINSTANCE.getQualOp_QuotientTok();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.QualOp_TimesTokImpl <em>Qual Op Times Tok</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.QualOp_TimesTokImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getQualOp_TimesTok()
     * @generated
     */
    EClass QUAL_OP_TIMES_TOK = eINSTANCE.getQualOp_TimesTok();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.QualOp_PowerTokImpl <em>Qual Op Power Tok</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.QualOp_PowerTokImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getQualOp_PowerTok()
     * @generated
     */
    EClass QUAL_OP_POWER_TOK = eINSTANCE.getQualOp_PowerTok();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.enlist1_CommaItem_Comma_ABImpl <em>enlist1 Comma Item Comma AB</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.enlist1_CommaItem_Comma_ABImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getenlist1_CommaItem_Comma_AB()
     * @generated
     */
    EClass ENLIST1_COMMA_ITEM_COMMA_AB = eINSTANCE.getenlist1_CommaItem_Comma_AB();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.enlist1_Infixed_Comma_ABImpl <em>enlist1 Infixed Comma AB</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.enlist1_Infixed_Comma_ABImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getenlist1_Infixed_Comma_AB()
     * @generated
     */
    EClass ENLIST1_INFIXED_COMMA_AB = eINSTANCE.getenlist1_Infixed_Comma_AB();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.enlist1_InfixedExpr_Comma_ABImpl <em>enlist1 Infixed Expr Comma AB</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.enlist1_InfixedExpr_Comma_ABImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getenlist1_InfixedExpr_Comma_AB()
     * @generated
     */
    EClass ENLIST1_INFIXED_EXPR_COMMA_AB = eINSTANCE.getenlist1_InfixedExpr_Comma_AB();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.enlister1_CommaItem_CommaImpl <em>enlister1 Comma Item Comma</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.enlister1_CommaItem_CommaImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getenlister1_CommaItem_Comma()
     * @generated
     */
    EClass ENLISTER1_COMMA_ITEM_COMMA = eINSTANCE.getenlister1_CommaItem_Comma();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.enlister1_Infixed_CommaImpl <em>enlister1 Infixed Comma</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.enlister1_Infixed_CommaImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getenlister1_Infixed_Comma()
     * @generated
     */
    EClass ENLISTER1_INFIXED_COMMA = eINSTANCE.getenlister1_Infixed_Comma();

    /**
     * The meta object literal for the '<em><b>I</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENLISTER1_INFIXED_COMMA__I = eINSTANCE.getenlister1_Infixed_Comma_I();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.enlister1_InfixedExpr_CommaImpl <em>enlister1 Infixed Expr Comma</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.enlister1_InfixedExpr_CommaImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getenlister1_InfixedExpr_Comma()
     * @generated
     */
    EClass ENLISTER1_INFIXED_EXPR_COMMA = eINSTANCE.getenlister1_InfixedExpr_Comma();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.enlist1a_Labeled_Semicolon_ABImpl <em>enlist1a Labeled Semicolon AB</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.enlist1a_Labeled_Semicolon_ABImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getenlist1a_Labeled_Semicolon_AB()
     * @generated
     */
    EClass ENLIST1A_LABELED_SEMICOLON_AB = eINSTANCE.getenlist1a_Labeled_Semicolon_AB();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.enlister1a_Labeled_SemicolonImpl <em>enlister1a Labeled Semicolon</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.enlister1a_Labeled_SemicolonImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getenlister1a_Labeled_Semicolon()
     * @generated
     */
    EClass ENLISTER1A_LABELED_SEMICOLON = eINSTANCE.getenlister1a_Labeled_Semicolon();

    /**
     * The meta object literal for the '<em><b>Statemnts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENLISTER1A_LABELED_SEMICOLON__STATEMNTS = eINSTANCE.getenlister1a_Labeled_Semicolon_Statemnts();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.Curly_LabeledImpl <em>Curly Labeled</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.Curly_LabeledImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getCurly_Labeled()
     * @generated
     */
    EClass CURLY_LABELED = eINSTANCE.getCurly_Labeled();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.CurlyContents_LabeledImpl <em>Curly Contents Labeled</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.CurlyContents_LabeledImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getCurlyContents_Labeled()
     * @generated
     */
    EClass CURLY_CONTENTS_LABELED = eINSTANCE.getCurlyContents_Labeled();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.CurlyContentsList_LabeledImpl <em>Curly Contents List Labeled</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.CurlyContentsList_LabeledImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getCurlyContentsList_Labeled()
     * @generated
     */
    EClass CURLY_CONTENTS_LIST_LABELED = eINSTANCE.getCurlyContentsList_Labeled();

    /**
     * The meta object literal for the '<em><b>Statemts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CURLY_CONTENTS_LIST_LABELED__STATEMTS = eINSTANCE.getCurlyContentsList_Labeled_Statemts();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.CurlyContentB_LabeledImpl <em>Curly Content BLabeled</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.CurlyContentB_LabeledImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getCurlyContentB_Labeled()
     * @generated
     */
    EClass CURLY_CONTENT_BLABELED = eINSTANCE.getCurlyContentB_Labeled();

    /**
     * The meta object literal for the '<em><b>Pred</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CURLY_CONTENT_BLABELED__PRED = eINSTANCE.getCurlyContentB_Labeled_Pred();

    /**
     * The meta object literal for the '<em><b>L</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CURLY_CONTENT_BLABELED__L = eINSTANCE.getCurlyContentB_Labeled_L();

    /**
     * The meta object literal for the '<em><b>Pd</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CURLY_CONTENT_BLABELED__PD = eINSTANCE.getCurlyContentB_Labeled_Pd();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.E3Impl <em>E3</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.E3Impl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getE3()
     * @generated
     */
    EClass E3 = eINSTANCE.getE3();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute E3__OP = eINSTANCE.getE3_Op();

    /**
     * The meta object literal for the '<em><b>Op2</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference E3__OP2 = eINSTANCE.getE3_Op2();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.E4Impl <em>E4</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.E4Impl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getE4()
     * @generated
     */
    EClass E4 = eINSTANCE.getE4();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute E4__OP = eINSTANCE.getE4_Op();

    /**
     * The meta object literal for the '<em><b>Op2</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute E4__OP2 = eINSTANCE.getE4_Op2();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.E5Impl <em>E5</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.E5Impl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getE5()
     * @generated
     */
    EClass E5 = eINSTANCE.getE5();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.E6Impl <em>E6</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.E6Impl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getE6()
     * @generated
     */
    EClass E6 = eINSTANCE.getE6();

    /**
     * The meta object literal for the '<em><b>Op6</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference E6__OP6 = eINSTANCE.getE6_Op6();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.E7Impl <em>E7</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.E7Impl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getE7()
     * @generated
     */
    EClass E7 = eINSTANCE.getE7();

    /**
     * The meta object literal for the '<em><b>Op7</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference E7__OP7 = eINSTANCE.getE7_Op7();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.E8Impl <em>E8</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.E8Impl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getE8()
     * @generated
     */
    EClass E8 = eINSTANCE.getE8();

    /**
     * The meta object literal for the '<em><b>Op8</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference E8__OP8 = eINSTANCE.getE8_Op8();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.E9Impl <em>E9</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.E9Impl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getE9()
     * @generated
     */
    EClass E9 = eINSTANCE.getE9();

    /**
     * The meta object literal for the '<em><b>Op9</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference E9__OP9 = eINSTANCE.getE9_Op9();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.E11_E12Impl <em>E11 E12</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.E11_E12Impl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getE11_E12()
     * @generated
     */
    EClass E11_E12 = eINSTANCE.getE11_E12();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute E11_E12__OP = eINSTANCE.getE11_E12_Op();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.E11_OpImpl <em>E11 Op</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.E11_OpImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getE11_Op()
     * @generated
     */
    EClass E11_OP = eINSTANCE.getE11_Op();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute E11_OP__OP = eINSTANCE.getE11_Op_Op();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.ArrowTokImpl <em>Arrow Tok</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.ArrowTokImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getArrowTok()
     * @generated
     */
    EClass ARROW_TOK = eINSTANCE.getArrowTok();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.LatticeTokImpl <em>Lattice Tok</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.LatticeTokImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getLatticeTok()
     * @generated
     */
    EClass LATTICE_TOK = eINSTANCE.getLatticeTok();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.RelationTokImpl <em>Relation Tok</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.RelationTokImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getRelationTok()
     * @generated
     */
    EClass RELATION_TOK = eINSTANCE.getRelationTok();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.SegTokImpl <em>Seg Tok</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.SegTokImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getSegTok()
     * @generated
     */
    EClass SEG_TOK = eINSTANCE.getSegTok();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.PlusTokImpl <em>Plus Tok</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.PlusTokImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getPlusTok()
     * @generated
     */
    EClass PLUS_TOK = eINSTANCE.getPlusTok();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.QuotientTokImpl <em>Quotient Tok</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.QuotientTokImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getQuotientTok()
     * @generated
     */
    EClass QUOTIENT_TOK = eINSTANCE.getQuotientTok();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.TimesTokImpl <em>Times Tok</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.TimesTokImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getTimesTok()
     * @generated
     */
    EClass TIMES_TOK = eINSTANCE.getTimesTok();

    /**
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.PowerTokImpl <em>Power Tok</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.PowerTokImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getPowerTok()
     * @generated
     */
    EClass POWER_TOK = eINSTANCE.getPowerTok();

  }

} //EditorPackage
