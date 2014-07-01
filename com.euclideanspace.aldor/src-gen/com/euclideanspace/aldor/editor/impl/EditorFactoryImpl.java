/**
 */
package com.euclideanspace.aldor.editor.impl;

import com.euclideanspace.aldor.editor.*;

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
      EditorFactory theEditorFactory = (EditorFactory)EPackage.Registry.INSTANCE.getEFactory(EditorPackage.eNS_URI);
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
      case EditorPackage.MODEL: return createModel();
      case EditorPackage.EXPRESSION: return createExpression();
      case EditorPackage.LABELED: return createLabeled();
      case EditorPackage.OP_QUAL_TAIL: return createOpQualTail();
      case EditorPackage.OP: return createOp();
      case EditorPackage.NAKED_OP: return createNakedOp();
      case EditorPackage.ARROW_OP: return createArrowOp();
      case EditorPackage.LATTICE_OP: return createLatticeOp();
      case EditorPackage.RELATION_OP: return createRelationOp();
      case EditorPackage.SEG_OP: return createSegOp();
      case EditorPackage.PLUS_OP: return createPlusOp();
      case EditorPackage.QUOTIENT_OP: return createQuotientOp();
      case EditorPackage.TIMES_OP: return createTimesOp();
      case EditorPackage.POWER_OP: return createPowerOp();
      case EditorPackage.JLEFT_MOLECULE: return createJleft_Molecule();
      case EditorPackage.JLEFT_ATOM: return createJleft_Atom();
      case EditorPackage.MOLECULE: return createMolecule();
      case EditorPackage.ENCLOSURE: return createEnclosure();
      case EditorPackage.BLOCK_MOLECULE: return createBlockMolecule();
      case EditorPackage.BLOCK_ENCLOSURE: return createBlockEnclosure();
      case EditorPackage.PARENED: return createParened();
      case EditorPackage.BRACKETED: return createBracketed();
      case EditorPackage.QUOTED_IDS: return createQuotedIds();
      case EditorPackage.NAMES: return createNames();
      case EditorPackage.ATOM: return createAtom();
      case EditorPackage.NAME: return createName();
      case EditorPackage.ID: return createId();
      case EditorPackage.UNQUAL_OP_ARROW_TOK: return createUnqualOp_ArrowTok();
      case EditorPackage.UNQUAL_OP_LATTICE_TOK: return createUnqualOp_LatticeTok();
      case EditorPackage.UNQUAL_OP_RELATION_TOK: return createUnqualOp_RelationTok();
      case EditorPackage.UNQUAL_OP_SEG_TOK: return createUnqualOp_SegTok();
      case EditorPackage.UNQUAL_OP_PLUS_TOK: return createUnqualOp_PlusTok();
      case EditorPackage.UNQUAL_OP_QUOTIENT_TOK: return createUnqualOp_QuotientTok();
      case EditorPackage.UNQUAL_OP_TIMES_TOK: return createUnqualOp_TimesTok();
      case EditorPackage.UNQUAL_OP_POWER_TOK: return createUnqualOp_PowerTok();
      case EditorPackage.QUAL_OP_ARROW_TOK: return createQualOp_ArrowTok();
      case EditorPackage.QUAL_OP_LATTICE_TOK: return createQualOp_LatticeTok();
      case EditorPackage.QUAL_OP_RELATION_TOK: return createQualOp_RelationTok();
      case EditorPackage.QUAL_OP_SEG_TOK: return createQualOp_SegTok();
      case EditorPackage.QUAL_OP_PLUS_TOK: return createQualOp_PlusTok();
      case EditorPackage.QUAL_OP_QUOTIENT_TOK: return createQualOp_QuotientTok();
      case EditorPackage.QUAL_OP_TIMES_TOK: return createQualOp_TimesTok();
      case EditorPackage.QUAL_OP_POWER_TOK: return createQualOp_PowerTok();
      case EditorPackage.ENLIST1A_LABELED_SEMICOLON_AB: return createenlist1a_Labeled_Semicolon_AB();
      case EditorPackage.ENLISTER1A_LABELED_SEMICOLON: return createenlister1a_Labeled_Semicolon();
      case EditorPackage.CURLY_LABELED: return createCurly_Labeled();
      case EditorPackage.CURLY_CONTENTS_LABELED: return createCurlyContents_Labeled();
      case EditorPackage.CURLY_CONTENTS_LIST_LABELED: return createCurlyContentsList_Labeled();
      case EditorPackage.ARROW_TOK: return createArrowTok();
      case EditorPackage.LATTICE_TOK: return createLatticeTok();
      case EditorPackage.RELATION_TOK: return createRelationTok();
      case EditorPackage.SEG_TOK: return createSegTok();
      case EditorPackage.PLUS_TOK: return createPlusTok();
      case EditorPackage.QUOTIENT_TOK: return createQuotientTok();
      case EditorPackage.TIMES_TOK: return createTimesTok();
      case EditorPackage.POWER_TOK: return createPowerTok();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Labeled createLabeled()
  {
    LabeledImpl labeled = new LabeledImpl();
    return labeled;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OpQualTail createOpQualTail()
  {
    OpQualTailImpl opQualTail = new OpQualTailImpl();
    return opQualTail;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Op createOp()
  {
    OpImpl op = new OpImpl();
    return op;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NakedOp createNakedOp()
  {
    NakedOpImpl nakedOp = new NakedOpImpl();
    return nakedOp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrowOp createArrowOp()
  {
    ArrowOpImpl arrowOp = new ArrowOpImpl();
    return arrowOp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LatticeOp createLatticeOp()
  {
    LatticeOpImpl latticeOp = new LatticeOpImpl();
    return latticeOp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelationOp createRelationOp()
  {
    RelationOpImpl relationOp = new RelationOpImpl();
    return relationOp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SegOp createSegOp()
  {
    SegOpImpl segOp = new SegOpImpl();
    return segOp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PlusOp createPlusOp()
  {
    PlusOpImpl plusOp = new PlusOpImpl();
    return plusOp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QuotientOp createQuotientOp()
  {
    QuotientOpImpl quotientOp = new QuotientOpImpl();
    return quotientOp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TimesOp createTimesOp()
  {
    TimesOpImpl timesOp = new TimesOpImpl();
    return timesOp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PowerOp createPowerOp()
  {
    PowerOpImpl powerOp = new PowerOpImpl();
    return powerOp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Jleft_Molecule createJleft_Molecule()
  {
    Jleft_MoleculeImpl jleft_Molecule = new Jleft_MoleculeImpl();
    return jleft_Molecule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Jleft_Atom createJleft_Atom()
  {
    Jleft_AtomImpl jleft_Atom = new Jleft_AtomImpl();
    return jleft_Atom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Molecule createMolecule()
  {
    MoleculeImpl molecule = new MoleculeImpl();
    return molecule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Enclosure createEnclosure()
  {
    EnclosureImpl enclosure = new EnclosureImpl();
    return enclosure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BlockMolecule createBlockMolecule()
  {
    BlockMoleculeImpl blockMolecule = new BlockMoleculeImpl();
    return blockMolecule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BlockEnclosure createBlockEnclosure()
  {
    BlockEnclosureImpl blockEnclosure = new BlockEnclosureImpl();
    return blockEnclosure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parened createParened()
  {
    ParenedImpl parened = new ParenedImpl();
    return parened;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Bracketed createBracketed()
  {
    BracketedImpl bracketed = new BracketedImpl();
    return bracketed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QuotedIds createQuotedIds()
  {
    QuotedIdsImpl quotedIds = new QuotedIdsImpl();
    return quotedIds;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Names createNames()
  {
    NamesImpl names = new NamesImpl();
    return names;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Atom createAtom()
  {
    AtomImpl atom = new AtomImpl();
    return atom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Name createName()
  {
    NameImpl name = new NameImpl();
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Id createId()
  {
    IdImpl id = new IdImpl();
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnqualOp_ArrowTok createUnqualOp_ArrowTok()
  {
    UnqualOp_ArrowTokImpl unqualOp_ArrowTok = new UnqualOp_ArrowTokImpl();
    return unqualOp_ArrowTok;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnqualOp_LatticeTok createUnqualOp_LatticeTok()
  {
    UnqualOp_LatticeTokImpl unqualOp_LatticeTok = new UnqualOp_LatticeTokImpl();
    return unqualOp_LatticeTok;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnqualOp_RelationTok createUnqualOp_RelationTok()
  {
    UnqualOp_RelationTokImpl unqualOp_RelationTok = new UnqualOp_RelationTokImpl();
    return unqualOp_RelationTok;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnqualOp_SegTok createUnqualOp_SegTok()
  {
    UnqualOp_SegTokImpl unqualOp_SegTok = new UnqualOp_SegTokImpl();
    return unqualOp_SegTok;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnqualOp_PlusTok createUnqualOp_PlusTok()
  {
    UnqualOp_PlusTokImpl unqualOp_PlusTok = new UnqualOp_PlusTokImpl();
    return unqualOp_PlusTok;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnqualOp_QuotientTok createUnqualOp_QuotientTok()
  {
    UnqualOp_QuotientTokImpl unqualOp_QuotientTok = new UnqualOp_QuotientTokImpl();
    return unqualOp_QuotientTok;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnqualOp_TimesTok createUnqualOp_TimesTok()
  {
    UnqualOp_TimesTokImpl unqualOp_TimesTok = new UnqualOp_TimesTokImpl();
    return unqualOp_TimesTok;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnqualOp_PowerTok createUnqualOp_PowerTok()
  {
    UnqualOp_PowerTokImpl unqualOp_PowerTok = new UnqualOp_PowerTokImpl();
    return unqualOp_PowerTok;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QualOp_ArrowTok createQualOp_ArrowTok()
  {
    QualOp_ArrowTokImpl qualOp_ArrowTok = new QualOp_ArrowTokImpl();
    return qualOp_ArrowTok;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QualOp_LatticeTok createQualOp_LatticeTok()
  {
    QualOp_LatticeTokImpl qualOp_LatticeTok = new QualOp_LatticeTokImpl();
    return qualOp_LatticeTok;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QualOp_RelationTok createQualOp_RelationTok()
  {
    QualOp_RelationTokImpl qualOp_RelationTok = new QualOp_RelationTokImpl();
    return qualOp_RelationTok;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QualOp_SegTok createQualOp_SegTok()
  {
    QualOp_SegTokImpl qualOp_SegTok = new QualOp_SegTokImpl();
    return qualOp_SegTok;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QualOp_PlusTok createQualOp_PlusTok()
  {
    QualOp_PlusTokImpl qualOp_PlusTok = new QualOp_PlusTokImpl();
    return qualOp_PlusTok;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QualOp_QuotientTok createQualOp_QuotientTok()
  {
    QualOp_QuotientTokImpl qualOp_QuotientTok = new QualOp_QuotientTokImpl();
    return qualOp_QuotientTok;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QualOp_TimesTok createQualOp_TimesTok()
  {
    QualOp_TimesTokImpl qualOp_TimesTok = new QualOp_TimesTokImpl();
    return qualOp_TimesTok;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QualOp_PowerTok createQualOp_PowerTok()
  {
    QualOp_PowerTokImpl qualOp_PowerTok = new QualOp_PowerTokImpl();
    return qualOp_PowerTok;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public enlist1a_Labeled_Semicolon_AB createenlist1a_Labeled_Semicolon_AB()
  {
    enlist1a_Labeled_Semicolon_ABImpl enlist1a_Labeled_Semicolon_AB = new enlist1a_Labeled_Semicolon_ABImpl();
    return enlist1a_Labeled_Semicolon_AB;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public enlister1a_Labeled_Semicolon createenlister1a_Labeled_Semicolon()
  {
    enlister1a_Labeled_SemicolonImpl enlister1a_Labeled_Semicolon = new enlister1a_Labeled_SemicolonImpl();
    return enlister1a_Labeled_Semicolon;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Curly_Labeled createCurly_Labeled()
  {
    Curly_LabeledImpl curly_Labeled = new Curly_LabeledImpl();
    return curly_Labeled;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CurlyContents_Labeled createCurlyContents_Labeled()
  {
    CurlyContents_LabeledImpl curlyContents_Labeled = new CurlyContents_LabeledImpl();
    return curlyContents_Labeled;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CurlyContentsList_Labeled createCurlyContentsList_Labeled()
  {
    CurlyContentsList_LabeledImpl curlyContentsList_Labeled = new CurlyContentsList_LabeledImpl();
    return curlyContentsList_Labeled;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrowTok createArrowTok()
  {
    ArrowTokImpl arrowTok = new ArrowTokImpl();
    return arrowTok;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LatticeTok createLatticeTok()
  {
    LatticeTokImpl latticeTok = new LatticeTokImpl();
    return latticeTok;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelationTok createRelationTok()
  {
    RelationTokImpl relationTok = new RelationTokImpl();
    return relationTok;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SegTok createSegTok()
  {
    SegTokImpl segTok = new SegTokImpl();
    return segTok;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PlusTok createPlusTok()
  {
    PlusTokImpl plusTok = new PlusTokImpl();
    return plusTok;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QuotientTok createQuotientTok()
  {
    QuotientTokImpl quotientTok = new QuotientTokImpl();
    return quotientTok;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TimesTok createTimesTok()
  {
    TimesTokImpl timesTok = new TimesTokImpl();
    return timesTok;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PowerTok createPowerTok()
  {
    PowerTokImpl powerTok = new PowerTokImpl();
    return powerTok;
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
