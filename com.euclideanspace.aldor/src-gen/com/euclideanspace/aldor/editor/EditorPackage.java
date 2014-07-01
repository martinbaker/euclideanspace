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
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.Jleft_MoleculeImpl <em>Jleft Molecule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.Jleft_MoleculeImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getJleft_Molecule()
   * @generated
   */
  int JLEFT_MOLECULE = 38;

  /**
   * The number of structural features of the '<em>Jleft Molecule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JLEFT_MOLECULE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.MoleculeImpl <em>Molecule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.MoleculeImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getMolecule()
   * @generated
   */
  int MOLECULE = 40;

  /**
   * The feature id for the '<em><b>Bm</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOLECULE__BM = JLEFT_MOLECULE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Molecule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOLECULE_FEATURE_COUNT = JLEFT_MOLECULE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.EnclosureImpl <em>Enclosure</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.EnclosureImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getEnclosure()
   * @generated
   */
  int ENCLOSURE = 41;

  /**
   * The feature id for the '<em><b>Bm</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENCLOSURE__BM = MOLECULE__BM;

  /**
   * The number of structural features of the '<em>Enclosure</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENCLOSURE_FEATURE_COUNT = MOLECULE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.ParenedImpl <em>Parened</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.ParenedImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getParened()
   * @generated
   */
  int PARENED = 46;

  /**
   * The feature id for the '<em><b>Bm</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENED__BM = ENCLOSURE__BM;

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
   * The feature id for the '<em><b>Bm</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__BM = PARENED__BM;

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
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.CommaImpl <em>Comma</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.CommaImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getComma()
   * @generated
   */
  int COMMA = 8;

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
  int FLOW_ANY_STATEMENT = 18;

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
  int COMMA_ITEM = 9;

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
  int DECL_BINDING = 10;

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
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.Binding_AnyStatementImpl <em>Binding Any Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.Binding_AnyStatementImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getBinding_AnyStatement()
   * @generated
   */
  int BINDING_ANY_STATEMENT = 11;

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
   * The feature id for the '<em><b>Fp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_ANY_STATEMENT__FP = COMMA_ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Tp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_ANY_STATEMENT__TP = COMMA_ITEM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Be</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_ANY_STATEMENT__BE = COMMA_ITEM_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Apa</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_ANY_STATEMENT__APA = COMMA_ITEM_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>C</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_ANY_STATEMENT__C = COMMA_ITEM_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Apb</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_ANY_STATEMENT__APB = COMMA_ITEM_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Binding Any Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_ANY_STATEMENT_FEATURE_COUNT = COMMA_ITEM_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.Flow_BalStatementImpl <em>Flow Bal Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.Flow_BalStatementImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getFlow_BalStatement()
   * @generated
   */
  int FLOW_BAL_STATEMENT = 19;

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
  int BINDING_BAL_STATEMENT = 12;

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
  int CASES = 22;

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
  int BINDING_COLLECTION = 13;

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
  int BINDING_LINFIXED_ANY_STATEMENT = 14;

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
   * The feature id for the '<em><b>Fp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_LINFIXED_ANY_STATEMENT__FP = BINDING_ANY_STATEMENT__FP;

  /**
   * The feature id for the '<em><b>Tp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_LINFIXED_ANY_STATEMENT__TP = BINDING_ANY_STATEMENT__TP;

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
  int BINDING_LINFIXED_BAL_STATEMENT = 15;

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
  int BINDING_LINFIXED_COLLECTION = 16;

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
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.BindingR_InfixedExprsDecl_AnyStatementImpl <em>Binding RInfixed Exprs Decl Any Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.BindingR_InfixedExprsDecl_AnyStatementImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getBindingR_InfixedExprsDecl_AnyStatement()
   * @generated
   */
  int BINDING_RINFIXED_EXPRS_DECL_ANY_STATEMENT = 17;

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
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.GenBoundImpl <em>Gen Bound</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.GenBoundImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getGenBound()
   * @generated
   */
  int GEN_BOUND = 20;

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
  int BUT_EXPR = 21;

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
  int ALWAYS_PART_ANY_STATEMENT = 23;

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
  int ALWAYS_PART_BAL_STATEMENT = 24;

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
  int COLLECTION = 25;

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
  int ITERATOR = 26;

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
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.OpImpl <em>Op</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.OpImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getOp()
   * @generated
   */
  int OP = 28;

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
  int ARROW_OP = 30;

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
  int QUAL_OP_ARROW_TOK = 61;

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
  int OP_QUAL_TAIL = 27;

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
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.NameImpl <em>Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.NameImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getName_()
   * @generated
   */
  int NAME = 51;

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
  int NAKED_OP = 29;

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
  int LATTICE_OP = 31;

  /**
   * The number of structural features of the '<em>Lattice Op</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LATTICE_OP_FEATURE_COUNT = OP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.RelationOpImpl <em>Relation Op</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.RelationOpImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getRelationOp()
   * @generated
   */
  int RELATION_OP = 32;

  /**
   * The number of structural features of the '<em>Relation Op</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_OP_FEATURE_COUNT = OP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.SegOpImpl <em>Seg Op</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.SegOpImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getSegOp()
   * @generated
   */
  int SEG_OP = 33;

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
  int PLUS_OP = 34;

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
  int QUOTIENT_OP = 35;

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
  int TIMES_OP = 36;

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
  int POWER_OP = 37;

  /**
   * The number of structural features of the '<em>Power Op</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POWER_OP_FEATURE_COUNT = OP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.Jleft_AtomImpl <em>Jleft Atom</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.Jleft_AtomImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getJleft_Atom()
   * @generated
   */
  int JLEFT_ATOM = 39;

  /**
   * The number of structural features of the '<em>Jleft Atom</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JLEFT_ATOM_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.DeclMoleculeImpl <em>Decl Molecule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.DeclMoleculeImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getDeclMolecule()
   * @generated
   */
  int DECL_MOLECULE = 42;

  /**
   * The number of structural features of the '<em>Decl Molecule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECL_MOLECULE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.BlockMoleculeImpl <em>Block Molecule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.BlockMoleculeImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getBlockMolecule()
   * @generated
   */
  int BLOCK_MOLECULE = 43;

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
  int BLOCK_ENCLOSURE = 44;

  /**
   * The number of structural features of the '<em>Block Enclosure</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_ENCLOSURE_FEATURE_COUNT = JLEFT_MOLECULE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.BlockImpl <em>Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.BlockImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getBlock()
   * @generated
   */
  int BLOCK = 45;

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
   * The number of structural features of the '<em>Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_FEATURE_COUNT = SIG_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.BracketedImpl <em>Bracketed</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.BracketedImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getBracketed()
   * @generated
   */
  int BRACKETED = 47;

  /**
   * The feature id for the '<em><b>Bm</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRACKETED__BM = ENCLOSURE__BM;

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
  int QUOTED_IDS = 48;

  /**
   * The feature id for the '<em><b>Bm</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUOTED_IDS__BM = ENCLOSURE__BM;

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
  int NAMES = 49;

  /**
   * The feature id for the '<em><b>Bm</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMES__BM = QUOTED_IDS__BM;

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
  int ATOM = 50;

  /**
   * The feature id for the '<em><b>Bm</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOM__BM = LABELED_FEATURE_COUNT + 0;

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
  int ID = 52;

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
  int UNQUAL_OP_ARROW_TOK = 53;

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
  int UNQUAL_OP_LATTICE_TOK = 54;

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
  int UNQUAL_OP_RELATION_TOK = 55;

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
  int UNQUAL_OP_SEG_TOK = 56;

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
  int UNQUAL_OP_PLUS_TOK = 57;

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
  int UNQUAL_OP_QUOTIENT_TOK = 58;

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
  int UNQUAL_OP_TIMES_TOK = 59;

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
  int UNQUAL_OP_POWER_TOK = 60;

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
  int QUAL_OP_LATTICE_TOK = 62;

  /**
   * The number of structural features of the '<em>Qual Op Lattice Tok</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUAL_OP_LATTICE_TOK_FEATURE_COUNT = LATTICE_OP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.QualOp_RelationTokImpl <em>Qual Op Relation Tok</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.QualOp_RelationTokImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getQualOp_RelationTok()
   * @generated
   */
  int QUAL_OP_RELATION_TOK = 63;

  /**
   * The number of structural features of the '<em>Qual Op Relation Tok</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUAL_OP_RELATION_TOK_FEATURE_COUNT = RELATION_OP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.QualOp_SegTokImpl <em>Qual Op Seg Tok</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.QualOp_SegTokImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getQualOp_SegTok()
   * @generated
   */
  int QUAL_OP_SEG_TOK = 64;

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
  int QUAL_OP_PLUS_TOK = 65;

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
  int QUAL_OP_QUOTIENT_TOK = 66;

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
  int QUAL_OP_TIMES_TOK = 67;

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
  int QUAL_OP_POWER_TOK = 68;

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
  int ENLIST1_COMMA_ITEM_COMMA_AB = 69;

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
  int ENLIST1_INFIXED_COMMA_AB = 70;

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
  int ENLISTER1_COMMA_ITEM_COMMA = 71;

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
  int ENLISTER1_INFIXED_COMMA = 72;

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
  int ENLIST1A_LABELED_SEMICOLON_AB = 73;

  /**
   * The feature id for the '<em><b>Bm</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENLIST1A_LABELED_SEMICOLON_AB__BM = EXPRESSION__BM;

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
  int ENLISTER1A_LABELED_SEMICOLON = 74;

  /**
   * The feature id for the '<em><b>Bm</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENLISTER1A_LABELED_SEMICOLON__BM = ENLIST1A_LABELED_SEMICOLON_AB__BM;

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
  int CURLY_LABELED = 75;

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
  int CURLY_CONTENTS_LABELED = 76;

  /**
   * The feature id for the '<em><b>Fp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CURLY_CONTENTS_LABELED__FP = MODEL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Tp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CURLY_CONTENTS_LABELED__TP = MODEL_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Curly Contents Labeled</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CURLY_CONTENTS_LABELED_FEATURE_COUNT = MODEL_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.CurlyContentsList_LabeledImpl <em>Curly Contents List Labeled</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.CurlyContentsList_LabeledImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getCurlyContentsList_Labeled()
   * @generated
   */
  int CURLY_CONTENTS_LIST_LABELED = 77;

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
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.ArrowTokImpl <em>Arrow Tok</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.ArrowTokImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getArrowTok()
   * @generated
   */
  int ARROW_TOK = 78;

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
  int LATTICE_TOK = 79;

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
  int RELATION_TOK = 80;

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
  int SEG_TOK = 81;

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
  int PLUS_TOK = 82;

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
  int QUOTIENT_TOK = 83;

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
  int TIMES_TOK = 84;

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
  int POWER_TOK = 85;

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
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.RelationOp <em>Relation Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relation Op</em>'.
   * @see com.euclideanspace.aldor.editor.RelationOp
   * @generated
   */
  EClass getRelationOp();

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
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.Jleft_Molecule <em>Jleft Molecule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Jleft Molecule</em>'.
   * @see com.euclideanspace.aldor.editor.Jleft_Molecule
   * @generated
   */
  EClass getJleft_Molecule();

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
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.aldor.editor.Molecule#getBm <em>Bm</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Bm</em>'.
   * @see com.euclideanspace.aldor.editor.Molecule#getBm()
   * @see #getMolecule()
   * @generated
   */
  EReference getMolecule_Bm();

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
   * Returns the meta object for class '{@link com.euclideanspace.aldor.editor.QualOp_RelationTok <em>Qual Op Relation Tok</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Qual Op Relation Tok</em>'.
   * @see com.euclideanspace.aldor.editor.QualOp_RelationTok
   * @generated
   */
  EClass getQualOp_RelationTok();

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
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.RelationOpImpl <em>Relation Op</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.RelationOpImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getRelationOp()
     * @generated
     */
    EClass RELATION_OP = eINSTANCE.getRelationOp();

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
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.Jleft_MoleculeImpl <em>Jleft Molecule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.Jleft_MoleculeImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getJleft_Molecule()
     * @generated
     */
    EClass JLEFT_MOLECULE = eINSTANCE.getJleft_Molecule();

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
     * The meta object literal for the '<em><b>Bm</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MOLECULE__BM = eINSTANCE.getMolecule_Bm();

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
     * The meta object literal for the '{@link com.euclideanspace.aldor.editor.impl.QualOp_RelationTokImpl <em>Qual Op Relation Tok</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.aldor.editor.impl.QualOp_RelationTokImpl
     * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getQualOp_RelationTok()
     * @generated
     */
    EClass QUAL_OP_RELATION_TOK = eINSTANCE.getQualOp_RelationTok();

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
