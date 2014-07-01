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
  int JLEFT_MOLECULE = 14;

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
  int MOLECULE = 16;

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
  int ENCLOSURE = 17;

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
  int PARENED = 20;

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
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.OpImpl <em>Op</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.OpImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getOp()
   * @generated
   */
  int OP = 4;

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
  int ARROW_OP = 6;

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
  int QUAL_OP_ARROW_TOK = 35;

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
  int OP_QUAL_TAIL = 3;

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
  int NAME = 25;

  /**
   * The number of structural features of the '<em>Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.NakedOpImpl <em>Naked Op</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.NakedOpImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getNakedOp()
   * @generated
   */
  int NAKED_OP = 5;

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
  int LATTICE_OP = 7;

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
  int RELATION_OP = 8;

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
  int SEG_OP = 9;

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
  int PLUS_OP = 10;

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
  int QUOTIENT_OP = 11;

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
  int TIMES_OP = 12;

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
  int POWER_OP = 13;

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
  int JLEFT_ATOM = 15;

  /**
   * The number of structural features of the '<em>Jleft Atom</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JLEFT_ATOM_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.BlockMoleculeImpl <em>Block Molecule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.BlockMoleculeImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getBlockMolecule()
   * @generated
   */
  int BLOCK_MOLECULE = 18;

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
  int BLOCK_ENCLOSURE = 19;

  /**
   * The number of structural features of the '<em>Block Enclosure</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_ENCLOSURE_FEATURE_COUNT = JLEFT_MOLECULE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.BracketedImpl <em>Bracketed</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.BracketedImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getBracketed()
   * @generated
   */
  int BRACKETED = 21;

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
  int QUOTED_IDS = 22;

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
  int NAMES = 23;

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
  int ATOM = 24;

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
  int ID = 26;

  /**
   * The feature id for the '<em><b>AB Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID__AB_ID = NAME_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID__OP = NAME_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Id</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID_FEATURE_COUNT = NAME_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.UnqualOp_ArrowTokImpl <em>Unqual Op Arrow Tok</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.UnqualOp_ArrowTokImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getUnqualOp_ArrowTok()
   * @generated
   */
  int UNQUAL_OP_ARROW_TOK = 27;

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
  int UNQUAL_OP_LATTICE_TOK = 28;

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
  int UNQUAL_OP_RELATION_TOK = 29;

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
  int UNQUAL_OP_SEG_TOK = 30;

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
  int UNQUAL_OP_PLUS_TOK = 31;

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
  int UNQUAL_OP_QUOTIENT_TOK = 32;

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
  int UNQUAL_OP_TIMES_TOK = 33;

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
  int UNQUAL_OP_POWER_TOK = 34;

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
  int QUAL_OP_LATTICE_TOK = 36;

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
  int QUAL_OP_RELATION_TOK = 37;

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
  int QUAL_OP_SEG_TOK = 38;

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
  int QUAL_OP_PLUS_TOK = 39;

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
  int QUAL_OP_QUOTIENT_TOK = 40;

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
  int QUAL_OP_TIMES_TOK = 41;

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
  int QUAL_OP_POWER_TOK = 42;

  /**
   * The number of structural features of the '<em>Qual Op Power Tok</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUAL_OP_POWER_TOK_FEATURE_COUNT = POWER_OP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.enlist1a_Labeled_Semicolon_ABImpl <em>enlist1a Labeled Semicolon AB</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.enlist1a_Labeled_Semicolon_ABImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getenlist1a_Labeled_Semicolon_AB()
   * @generated
   */
  int ENLIST1A_LABELED_SEMICOLON_AB = 43;

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
  int ENLISTER1A_LABELED_SEMICOLON = 44;

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
  int CURLY_LABELED = 45;

  /**
   * The number of structural features of the '<em>Curly Labeled</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CURLY_LABELED_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.CurlyContents_LabeledImpl <em>Curly Contents Labeled</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.CurlyContents_LabeledImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getCurlyContents_Labeled()
   * @generated
   */
  int CURLY_CONTENTS_LABELED = 46;

  /**
   * The number of structural features of the '<em>Curly Contents Labeled</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CURLY_CONTENTS_LABELED_FEATURE_COUNT = MODEL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.aldor.editor.impl.CurlyContentsList_LabeledImpl <em>Curly Contents List Labeled</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.aldor.editor.impl.CurlyContentsList_LabeledImpl
   * @see com.euclideanspace.aldor.editor.impl.EditorPackageImpl#getCurlyContentsList_Labeled()
   * @generated
   */
  int CURLY_CONTENTS_LIST_LABELED = 47;

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
  int ARROW_TOK = 48;

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
  int LATTICE_TOK = 49;

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
  int RELATION_TOK = 50;

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
  int SEG_TOK = 51;

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
  int PLUS_TOK = 52;

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
  int QUOTIENT_TOK = 53;

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
  int TIMES_TOK = 54;

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
  int POWER_TOK = 55;

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
