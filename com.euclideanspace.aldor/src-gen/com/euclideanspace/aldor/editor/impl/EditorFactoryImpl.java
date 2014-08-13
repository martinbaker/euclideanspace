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
      case EditorPackage.DECLARATION: return createDeclaration();
      case EditorPackage.EXPORT_DECL: return createExportDecl();
      case EditorPackage.TO_PART: return createToPart();
      case EditorPackage.FROM_PART: return createFromPart();
      case EditorPackage.MACRO_BODY: return createMacroBody();
      case EditorPackage.SIG: return createSig();
      case EditorPackage.DECL_PART: return createDeclPart();
      case EditorPackage.COMMA: return createComma();
      case EditorPackage.COMMA_ITEM: return createCommaItem();
      case EditorPackage.DECL_BINDING: return createDeclBinding();
      case EditorPackage.INFIXED_EXPRS_DECL: return createInfixedExprsDecl();
      case EditorPackage.INFIXED_EXPRS: return createInfixedExprs();
      case EditorPackage.BINDING_ANY_STATEMENT: return createBinding_AnyStatement();
      case EditorPackage.BINDING_BAL_STATEMENT: return createBinding_BalStatement();
      case EditorPackage.BINDING_COLLECTION: return createBinding_Collection();
      case EditorPackage.BINDING_LINFIXED_ANY_STATEMENT: return createBindingL_Infixed_AnyStatement();
      case EditorPackage.BINDING_LINFIXED_BAL_STATEMENT: return createBindingL_Infixed_BalStatement();
      case EditorPackage.BINDING_LINFIXED_COLLECTION: return createBindingL_Infixed_Collection();
      case EditorPackage.BINDING_RINFIXED_EXPRS_DECL_ANY_STATEMENT: return createBindingR_InfixedExprsDecl_AnyStatement();
      case EditorPackage.ANY_STATEMENT: return createAnyStatement();
      case EditorPackage.BAL_STATEMENT: return createBalStatement();
      case EditorPackage.FLOW_ANY_STATEMENT: return createFlow_AnyStatement();
      case EditorPackage.FLOW_BAL_STATEMENT: return createFlow_BalStatement();
      case EditorPackage.GEN_BOUND: return createGenBound();
      case EditorPackage.BUT_EXPR: return createButExpr();
      case EditorPackage.CASES: return createCases();
      case EditorPackage.ALWAYS_PART_ANY_STATEMENT: return createAlwaysPart_AnyStatement();
      case EditorPackage.ALWAYS_PART_BAL_STATEMENT: return createAlwaysPart_BalStatement();
      case EditorPackage.COLLECTION: return createCollection();
      case EditorPackage.ITERATORS: return createIterators();
      case EditorPackage.ITERATORS1: return createIterators1();
      case EditorPackage.ITERATOR: return createIterator();
      case EditorPackage.FOR_LHS: return createForLhs();
      case EditorPackage.SUCHTHAT_PART: return createSuchthatPart();
      case EditorPackage.INFIXED: return createInfixed();
      case EditorPackage.INFIXED_EXPR: return createInfixedExpr();
      case EditorPackage.EXPR: return createExpr();
      case EditorPackage.TYPE: return createType();
      case EditorPackage.E12: return createE12();
      case EditorPackage.E13: return createE13();
      case EditorPackage.QUAL_TAIL: return createQualTail();
      case EditorPackage.OP_QUAL_TAIL: return createOpQualTail();
      case EditorPackage.E14: return createE14();
      case EditorPackage.E15: return createE15();
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
      case EditorPackage.APPLICATION: return createApplication();
      case EditorPackage.RIGHT_JUXTAPOSED: return createRightJuxtaposed();
      case EditorPackage.LEFT_JUXTAPOSED: return createLeftJuxtaposed();
      case EditorPackage.JRIGHT_MOLECULE: return createJright_Molecule();
      case EditorPackage.JRIGHT_ATOM: return createJright_Atom();
      case EditorPackage.JLEFT_MOLECULE: return createJleft_Molecule();
      case EditorPackage.JLEFT_ATOM: return createJleft_Atom();
      case EditorPackage.MOLECULE: return createMolecule();
      case EditorPackage.ENCLOSURE: return createEnclosure();
      case EditorPackage.DECL_MOLECULE: return createDeclMolecule();
      case EditorPackage.BLOCK_MOLECULE: return createBlockMolecule();
      case EditorPackage.BLOCK_ENCLOSURE: return createBlockEnclosure();
      case EditorPackage.BLOCK: return createBlock();
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
      case EditorPackage.ENLIST1_COMMA_ITEM_COMMA_AB: return createenlist1_CommaItem_Comma_AB();
      case EditorPackage.ENLIST1_INFIXED_COMMA_AB: return createenlist1_Infixed_Comma_AB();
      case EditorPackage.ENLIST1_INFIXED_EXPR_COMMA_AB: return createenlist1_InfixedExpr_Comma_AB();
      case EditorPackage.ENLISTER1_COMMA_ITEM_COMMA: return createenlister1_CommaItem_Comma();
      case EditorPackage.ENLISTER1_INFIXED_COMMA: return createenlister1_Infixed_Comma();
      case EditorPackage.ENLISTER1_INFIXED_EXPR_COMMA: return createenlister1_InfixedExpr_Comma();
      case EditorPackage.ENLIST1A_LABELED_SEMICOLON_AB: return createenlist1a_Labeled_Semicolon_AB();
      case EditorPackage.ENLISTER1A_LABELED_SEMICOLON: return createenlister1a_Labeled_Semicolon();
      case EditorPackage.CURLY_LABELED: return createCurly_Labeled();
      case EditorPackage.CURLY_CONTENTS_LABELED: return createCurlyContents_Labeled();
      case EditorPackage.CURLY_CONTENTS_LIST_LABELED: return createCurlyContentsList_Labeled();
      case EditorPackage.CURLY_CONTENT_BLABELED: return createCurlyContentB_Labeled();
      case EditorPackage.E3: return createE3();
      case EditorPackage.E4: return createE4();
      case EditorPackage.E5: return createE5();
      case EditorPackage.E6: return createE6();
      case EditorPackage.E7: return createE7();
      case EditorPackage.E8: return createE8();
      case EditorPackage.E9: return createE9();
      case EditorPackage.E11_E12: return createE11_E12();
      case EditorPackage.E11_OP: return createE11_Op();
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
  public Declaration createDeclaration()
  {
    DeclarationImpl declaration = new DeclarationImpl();
    return declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExportDecl createExportDecl()
  {
    ExportDeclImpl exportDecl = new ExportDeclImpl();
    return exportDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ToPart createToPart()
  {
    ToPartImpl toPart = new ToPartImpl();
    return toPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FromPart createFromPart()
  {
    FromPartImpl fromPart = new FromPartImpl();
    return fromPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MacroBody createMacroBody()
  {
    MacroBodyImpl macroBody = new MacroBodyImpl();
    return macroBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Sig createSig()
  {
    SigImpl sig = new SigImpl();
    return sig;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeclPart createDeclPart()
  {
    DeclPartImpl declPart = new DeclPartImpl();
    return declPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Comma createComma()
  {
    CommaImpl comma = new CommaImpl();
    return comma;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CommaItem createCommaItem()
  {
    CommaItemImpl commaItem = new CommaItemImpl();
    return commaItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeclBinding createDeclBinding()
  {
    DeclBindingImpl declBinding = new DeclBindingImpl();
    return declBinding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InfixedExprsDecl createInfixedExprsDecl()
  {
    InfixedExprsDeclImpl infixedExprsDecl = new InfixedExprsDeclImpl();
    return infixedExprsDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InfixedExprs createInfixedExprs()
  {
    InfixedExprsImpl infixedExprs = new InfixedExprsImpl();
    return infixedExprs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Binding_AnyStatement createBinding_AnyStatement()
  {
    Binding_AnyStatementImpl binding_AnyStatement = new Binding_AnyStatementImpl();
    return binding_AnyStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Binding_BalStatement createBinding_BalStatement()
  {
    Binding_BalStatementImpl binding_BalStatement = new Binding_BalStatementImpl();
    return binding_BalStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Binding_Collection createBinding_Collection()
  {
    Binding_CollectionImpl binding_Collection = new Binding_CollectionImpl();
    return binding_Collection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BindingL_Infixed_AnyStatement createBindingL_Infixed_AnyStatement()
  {
    BindingL_Infixed_AnyStatementImpl bindingL_Infixed_AnyStatement = new BindingL_Infixed_AnyStatementImpl();
    return bindingL_Infixed_AnyStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BindingL_Infixed_BalStatement createBindingL_Infixed_BalStatement()
  {
    BindingL_Infixed_BalStatementImpl bindingL_Infixed_BalStatement = new BindingL_Infixed_BalStatementImpl();
    return bindingL_Infixed_BalStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BindingL_Infixed_Collection createBindingL_Infixed_Collection()
  {
    BindingL_Infixed_CollectionImpl bindingL_Infixed_Collection = new BindingL_Infixed_CollectionImpl();
    return bindingL_Infixed_Collection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BindingR_InfixedExprsDecl_AnyStatement createBindingR_InfixedExprsDecl_AnyStatement()
  {
    BindingR_InfixedExprsDecl_AnyStatementImpl bindingR_InfixedExprsDecl_AnyStatement = new BindingR_InfixedExprsDecl_AnyStatementImpl();
    return bindingR_InfixedExprsDecl_AnyStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnyStatement createAnyStatement()
  {
    AnyStatementImpl anyStatement = new AnyStatementImpl();
    return anyStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BalStatement createBalStatement()
  {
    BalStatementImpl balStatement = new BalStatementImpl();
    return balStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Flow_AnyStatement createFlow_AnyStatement()
  {
    Flow_AnyStatementImpl flow_AnyStatement = new Flow_AnyStatementImpl();
    return flow_AnyStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Flow_BalStatement createFlow_BalStatement()
  {
    Flow_BalStatementImpl flow_BalStatement = new Flow_BalStatementImpl();
    return flow_BalStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GenBound createGenBound()
  {
    GenBoundImpl genBound = new GenBoundImpl();
    return genBound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ButExpr createButExpr()
  {
    ButExprImpl butExpr = new ButExprImpl();
    return butExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Cases createCases()
  {
    CasesImpl cases = new CasesImpl();
    return cases;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AlwaysPart_AnyStatement createAlwaysPart_AnyStatement()
  {
    AlwaysPart_AnyStatementImpl alwaysPart_AnyStatement = new AlwaysPart_AnyStatementImpl();
    return alwaysPart_AnyStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AlwaysPart_BalStatement createAlwaysPart_BalStatement()
  {
    AlwaysPart_BalStatementImpl alwaysPart_BalStatement = new AlwaysPart_BalStatementImpl();
    return alwaysPart_BalStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Collection createCollection()
  {
    CollectionImpl collection = new CollectionImpl();
    return collection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Iterators createIterators()
  {
    IteratorsImpl iterators = new IteratorsImpl();
    return iterators;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Iterators1 createIterators1()
  {
    Iterators1Impl iterators1 = new Iterators1Impl();
    return iterators1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Iterator createIterator()
  {
    IteratorImpl iterator = new IteratorImpl();
    return iterator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForLhs createForLhs()
  {
    ForLhsImpl forLhs = new ForLhsImpl();
    return forLhs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SuchthatPart createSuchthatPart()
  {
    SuchthatPartImpl suchthatPart = new SuchthatPartImpl();
    return suchthatPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Infixed createInfixed()
  {
    InfixedImpl infixed = new InfixedImpl();
    return infixed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InfixedExpr createInfixedExpr()
  {
    InfixedExprImpl infixedExpr = new InfixedExprImpl();
    return infixedExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr createExpr()
  {
    ExprImpl expr = new ExprImpl();
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public E12 createE12()
  {
    E12Impl e12 = new E12Impl();
    return e12;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public E13 createE13()
  {
    E13Impl e13 = new E13Impl();
    return e13;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QualTail createQualTail()
  {
    QualTailImpl qualTail = new QualTailImpl();
    return qualTail;
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
  public E14 createE14()
  {
    E14Impl e14 = new E14Impl();
    return e14;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public E15 createE15()
  {
    E15Impl e15 = new E15Impl();
    return e15;
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
  public Application createApplication()
  {
    ApplicationImpl application = new ApplicationImpl();
    return application;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RightJuxtaposed createRightJuxtaposed()
  {
    RightJuxtaposedImpl rightJuxtaposed = new RightJuxtaposedImpl();
    return rightJuxtaposed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LeftJuxtaposed createLeftJuxtaposed()
  {
    LeftJuxtaposedImpl leftJuxtaposed = new LeftJuxtaposedImpl();
    return leftJuxtaposed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Jright_Molecule createJright_Molecule()
  {
    Jright_MoleculeImpl jright_Molecule = new Jright_MoleculeImpl();
    return jright_Molecule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Jright_Atom createJright_Atom()
  {
    Jright_AtomImpl jright_Atom = new Jright_AtomImpl();
    return jright_Atom;
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
  public DeclMolecule createDeclMolecule()
  {
    DeclMoleculeImpl declMolecule = new DeclMoleculeImpl();
    return declMolecule;
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
  public Block createBlock()
  {
    BlockImpl block = new BlockImpl();
    return block;
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
  public enlist1_CommaItem_Comma_AB createenlist1_CommaItem_Comma_AB()
  {
    enlist1_CommaItem_Comma_ABImpl enlist1_CommaItem_Comma_AB = new enlist1_CommaItem_Comma_ABImpl();
    return enlist1_CommaItem_Comma_AB;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public enlist1_Infixed_Comma_AB createenlist1_Infixed_Comma_AB()
  {
    enlist1_Infixed_Comma_ABImpl enlist1_Infixed_Comma_AB = new enlist1_Infixed_Comma_ABImpl();
    return enlist1_Infixed_Comma_AB;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public enlist1_InfixedExpr_Comma_AB createenlist1_InfixedExpr_Comma_AB()
  {
    enlist1_InfixedExpr_Comma_ABImpl enlist1_InfixedExpr_Comma_AB = new enlist1_InfixedExpr_Comma_ABImpl();
    return enlist1_InfixedExpr_Comma_AB;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public enlister1_CommaItem_Comma createenlister1_CommaItem_Comma()
  {
    enlister1_CommaItem_CommaImpl enlister1_CommaItem_Comma = new enlister1_CommaItem_CommaImpl();
    return enlister1_CommaItem_Comma;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public enlister1_Infixed_Comma createenlister1_Infixed_Comma()
  {
    enlister1_Infixed_CommaImpl enlister1_Infixed_Comma = new enlister1_Infixed_CommaImpl();
    return enlister1_Infixed_Comma;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public enlister1_InfixedExpr_Comma createenlister1_InfixedExpr_Comma()
  {
    enlister1_InfixedExpr_CommaImpl enlister1_InfixedExpr_Comma = new enlister1_InfixedExpr_CommaImpl();
    return enlister1_InfixedExpr_Comma;
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
  public CurlyContentB_Labeled createCurlyContentB_Labeled()
  {
    CurlyContentB_LabeledImpl curlyContentB_Labeled = new CurlyContentB_LabeledImpl();
    return curlyContentB_Labeled;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public E3 createE3()
  {
    E3Impl e3 = new E3Impl();
    return e3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public E4 createE4()
  {
    E4Impl e4 = new E4Impl();
    return e4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public E5 createE5()
  {
    E5Impl e5 = new E5Impl();
    return e5;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public E6 createE6()
  {
    E6Impl e6 = new E6Impl();
    return e6;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public E7 createE7()
  {
    E7Impl e7 = new E7Impl();
    return e7;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public E8 createE8()
  {
    E8Impl e8 = new E8Impl();
    return e8;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public E9 createE9()
  {
    E9Impl e9 = new E9Impl();
    return e9;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public E11_E12 createE11_E12()
  {
    E11_E12Impl e11_E12 = new E11_E12Impl();
    return e11_E12;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public E11_Op createE11_Op()
  {
    E11_OpImpl e11_Op = new E11_OpImpl();
    return e11_Op;
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
