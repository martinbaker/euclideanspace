/**
 */
package com.euclideanspace.aldor.editor;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.euclideanspace.aldor.editor.EditorPackage
 * @generated
 */
public interface EditorFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EditorFactory eINSTANCE = com.euclideanspace.aldor.editor.impl.EditorFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>Labeled</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Labeled</em>'.
   * @generated
   */
  Labeled createLabeled();

  /**
   * Returns a new object of class '<em>Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Declaration</em>'.
   * @generated
   */
  Declaration createDeclaration();

  /**
   * Returns a new object of class '<em>Export Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Export Decl</em>'.
   * @generated
   */
  ExportDecl createExportDecl();

  /**
   * Returns a new object of class '<em>To Part</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>To Part</em>'.
   * @generated
   */
  ToPart createToPart();

  /**
   * Returns a new object of class '<em>From Part</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>From Part</em>'.
   * @generated
   */
  FromPart createFromPart();

  /**
   * Returns a new object of class '<em>Macro Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Macro Body</em>'.
   * @generated
   */
  MacroBody createMacroBody();

  /**
   * Returns a new object of class '<em>Sig</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sig</em>'.
   * @generated
   */
  Sig createSig();

  /**
   * Returns a new object of class '<em>Decl Part</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Decl Part</em>'.
   * @generated
   */
  DeclPart createDeclPart();

  /**
   * Returns a new object of class '<em>Comma</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Comma</em>'.
   * @generated
   */
  Comma createComma();

  /**
   * Returns a new object of class '<em>Comma Item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Comma Item</em>'.
   * @generated
   */
  CommaItem createCommaItem();

  /**
   * Returns a new object of class '<em>Decl Binding</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Decl Binding</em>'.
   * @generated
   */
  DeclBinding createDeclBinding();

  /**
   * Returns a new object of class '<em>Infixed Exprs Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Infixed Exprs Decl</em>'.
   * @generated
   */
  InfixedExprsDecl createInfixedExprsDecl();

  /**
   * Returns a new object of class '<em>Infixed Exprs</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Infixed Exprs</em>'.
   * @generated
   */
  InfixedExprs createInfixedExprs();

  /**
   * Returns a new object of class '<em>Binding Any Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Binding Any Statement</em>'.
   * @generated
   */
  Binding_AnyStatement createBinding_AnyStatement();

  /**
   * Returns a new object of class '<em>Binding Bal Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Binding Bal Statement</em>'.
   * @generated
   */
  Binding_BalStatement createBinding_BalStatement();

  /**
   * Returns a new object of class '<em>Binding Collection</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Binding Collection</em>'.
   * @generated
   */
  Binding_Collection createBinding_Collection();

  /**
   * Returns a new object of class '<em>Binding LInfixed Any Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Binding LInfixed Any Statement</em>'.
   * @generated
   */
  BindingL_Infixed_AnyStatement createBindingL_Infixed_AnyStatement();

  /**
   * Returns a new object of class '<em>Binding LInfixed Bal Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Binding LInfixed Bal Statement</em>'.
   * @generated
   */
  BindingL_Infixed_BalStatement createBindingL_Infixed_BalStatement();

  /**
   * Returns a new object of class '<em>Binding LInfixed Collection</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Binding LInfixed Collection</em>'.
   * @generated
   */
  BindingL_Infixed_Collection createBindingL_Infixed_Collection();

  /**
   * Returns a new object of class '<em>Binding RInfixed Exprs Decl Any Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Binding RInfixed Exprs Decl Any Statement</em>'.
   * @generated
   */
  BindingR_InfixedExprsDecl_AnyStatement createBindingR_InfixedExprsDecl_AnyStatement();

  /**
   * Returns a new object of class '<em>Any Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Any Statement</em>'.
   * @generated
   */
  AnyStatement createAnyStatement();

  /**
   * Returns a new object of class '<em>Bal Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bal Statement</em>'.
   * @generated
   */
  BalStatement createBalStatement();

  /**
   * Returns a new object of class '<em>Flow Any Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Flow Any Statement</em>'.
   * @generated
   */
  Flow_AnyStatement createFlow_AnyStatement();

  /**
   * Returns a new object of class '<em>Flow Bal Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Flow Bal Statement</em>'.
   * @generated
   */
  Flow_BalStatement createFlow_BalStatement();

  /**
   * Returns a new object of class '<em>Gen Bound</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Gen Bound</em>'.
   * @generated
   */
  GenBound createGenBound();

  /**
   * Returns a new object of class '<em>But Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>But Expr</em>'.
   * @generated
   */
  ButExpr createButExpr();

  /**
   * Returns a new object of class '<em>Cases</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cases</em>'.
   * @generated
   */
  Cases createCases();

  /**
   * Returns a new object of class '<em>Always Part Any Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Always Part Any Statement</em>'.
   * @generated
   */
  AlwaysPart_AnyStatement createAlwaysPart_AnyStatement();

  /**
   * Returns a new object of class '<em>Always Part Bal Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Always Part Bal Statement</em>'.
   * @generated
   */
  AlwaysPart_BalStatement createAlwaysPart_BalStatement();

  /**
   * Returns a new object of class '<em>Collection</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Collection</em>'.
   * @generated
   */
  Collection createCollection();

  /**
   * Returns a new object of class '<em>Iterators</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Iterators</em>'.
   * @generated
   */
  Iterators createIterators();

  /**
   * Returns a new object of class '<em>Iterators1</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Iterators1</em>'.
   * @generated
   */
  Iterators1 createIterators1();

  /**
   * Returns a new object of class '<em>Iterator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Iterator</em>'.
   * @generated
   */
  Iterator createIterator();

  /**
   * Returns a new object of class '<em>For Lhs</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>For Lhs</em>'.
   * @generated
   */
  ForLhs createForLhs();

  /**
   * Returns a new object of class '<em>Suchthat Part</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Suchthat Part</em>'.
   * @generated
   */
  SuchthatPart createSuchthatPart();

  /**
   * Returns a new object of class '<em>Infixed</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Infixed</em>'.
   * @generated
   */
  Infixed createInfixed();

  /**
   * Returns a new object of class '<em>Infixed Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Infixed Expr</em>'.
   * @generated
   */
  InfixedExpr createInfixedExpr();

  /**
   * Returns a new object of class '<em>Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr</em>'.
   * @generated
   */
  Expr createExpr();

  /**
   * Returns a new object of class '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type</em>'.
   * @generated
   */
  Type createType();

  /**
   * Returns a new object of class '<em>Qual Tail</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Qual Tail</em>'.
   * @generated
   */
  QualTail createQualTail();

  /**
   * Returns a new object of class '<em>Op Qual Tail</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Op Qual Tail</em>'.
   * @generated
   */
  OpQualTail createOpQualTail();

  /**
   * Returns a new object of class '<em>E14</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>E14</em>'.
   * @generated
   */
  E14 createE14();

  /**
   * Returns a new object of class '<em>E15</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>E15</em>'.
   * @generated
   */
  E15 createE15();

  /**
   * Returns a new object of class '<em>Op</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Op</em>'.
   * @generated
   */
  Op createOp();

  /**
   * Returns a new object of class '<em>Naked Op</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Naked Op</em>'.
   * @generated
   */
  NakedOp createNakedOp();

  /**
   * Returns a new object of class '<em>Arrow Op</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Arrow Op</em>'.
   * @generated
   */
  ArrowOp createArrowOp();

  /**
   * Returns a new object of class '<em>Lattice Op</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Lattice Op</em>'.
   * @generated
   */
  LatticeOp createLatticeOp();

  /**
   * Returns a new object of class '<em>Relation Op</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Relation Op</em>'.
   * @generated
   */
  RelationOp createRelationOp();

  /**
   * Returns a new object of class '<em>Seg Op</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Seg Op</em>'.
   * @generated
   */
  SegOp createSegOp();

  /**
   * Returns a new object of class '<em>Plus Op</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Plus Op</em>'.
   * @generated
   */
  PlusOp createPlusOp();

  /**
   * Returns a new object of class '<em>Quotient Op</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Quotient Op</em>'.
   * @generated
   */
  QuotientOp createQuotientOp();

  /**
   * Returns a new object of class '<em>Times Op</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Times Op</em>'.
   * @generated
   */
  TimesOp createTimesOp();

  /**
   * Returns a new object of class '<em>Power Op</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Power Op</em>'.
   * @generated
   */
  PowerOp createPowerOp();

  /**
   * Returns a new object of class '<em>Application</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Application</em>'.
   * @generated
   */
  Application createApplication();

  /**
   * Returns a new object of class '<em>Right Juxtaposed</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Right Juxtaposed</em>'.
   * @generated
   */
  RightJuxtaposed createRightJuxtaposed();

  /**
   * Returns a new object of class '<em>Left Juxtaposed</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Left Juxtaposed</em>'.
   * @generated
   */
  LeftJuxtaposed createLeftJuxtaposed();

  /**
   * Returns a new object of class '<em>Jright Molecule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Jright Molecule</em>'.
   * @generated
   */
  Jright_Molecule createJright_Molecule();

  /**
   * Returns a new object of class '<em>Jright Atom</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Jright Atom</em>'.
   * @generated
   */
  Jright_Atom createJright_Atom();

  /**
   * Returns a new object of class '<em>Jleft Molecule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Jleft Molecule</em>'.
   * @generated
   */
  Jleft_Molecule createJleft_Molecule();

  /**
   * Returns a new object of class '<em>Jleft Atom</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Jleft Atom</em>'.
   * @generated
   */
  Jleft_Atom createJleft_Atom();

  /**
   * Returns a new object of class '<em>Molecule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Molecule</em>'.
   * @generated
   */
  Molecule createMolecule();

  /**
   * Returns a new object of class '<em>Enclosure</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enclosure</em>'.
   * @generated
   */
  Enclosure createEnclosure();

  /**
   * Returns a new object of class '<em>Decl Molecule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Decl Molecule</em>'.
   * @generated
   */
  DeclMolecule createDeclMolecule();

  /**
   * Returns a new object of class '<em>Block Molecule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Block Molecule</em>'.
   * @generated
   */
  BlockMolecule createBlockMolecule();

  /**
   * Returns a new object of class '<em>Block Enclosure</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Block Enclosure</em>'.
   * @generated
   */
  BlockEnclosure createBlockEnclosure();

  /**
   * Returns a new object of class '<em>Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Block</em>'.
   * @generated
   */
  Block createBlock();

  /**
   * Returns a new object of class '<em>Parened</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parened</em>'.
   * @generated
   */
  Parened createParened();

  /**
   * Returns a new object of class '<em>Bracketed</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bracketed</em>'.
   * @generated
   */
  Bracketed createBracketed();

  /**
   * Returns a new object of class '<em>Quoted Ids</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Quoted Ids</em>'.
   * @generated
   */
  QuotedIds createQuotedIds();

  /**
   * Returns a new object of class '<em>Names</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Names</em>'.
   * @generated
   */
  Names createNames();

  /**
   * Returns a new object of class '<em>Atom</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Atom</em>'.
   * @generated
   */
  Atom createAtom();

  /**
   * Returns a new object of class '<em>Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Name</em>'.
   * @generated
   */
  Name createName();

  /**
   * Returns a new object of class '<em>Id</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Id</em>'.
   * @generated
   */
  Id createId();

  /**
   * Returns a new object of class '<em>Unqual Op Arrow Tok</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unqual Op Arrow Tok</em>'.
   * @generated
   */
  UnqualOp_ArrowTok createUnqualOp_ArrowTok();

  /**
   * Returns a new object of class '<em>Unqual Op Lattice Tok</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unqual Op Lattice Tok</em>'.
   * @generated
   */
  UnqualOp_LatticeTok createUnqualOp_LatticeTok();

  /**
   * Returns a new object of class '<em>Unqual Op Relation Tok</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unqual Op Relation Tok</em>'.
   * @generated
   */
  UnqualOp_RelationTok createUnqualOp_RelationTok();

  /**
   * Returns a new object of class '<em>Unqual Op Seg Tok</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unqual Op Seg Tok</em>'.
   * @generated
   */
  UnqualOp_SegTok createUnqualOp_SegTok();

  /**
   * Returns a new object of class '<em>Unqual Op Plus Tok</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unqual Op Plus Tok</em>'.
   * @generated
   */
  UnqualOp_PlusTok createUnqualOp_PlusTok();

  /**
   * Returns a new object of class '<em>Unqual Op Quotient Tok</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unqual Op Quotient Tok</em>'.
   * @generated
   */
  UnqualOp_QuotientTok createUnqualOp_QuotientTok();

  /**
   * Returns a new object of class '<em>Unqual Op Times Tok</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unqual Op Times Tok</em>'.
   * @generated
   */
  UnqualOp_TimesTok createUnqualOp_TimesTok();

  /**
   * Returns a new object of class '<em>Unqual Op Power Tok</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unqual Op Power Tok</em>'.
   * @generated
   */
  UnqualOp_PowerTok createUnqualOp_PowerTok();

  /**
   * Returns a new object of class '<em>Qual Op Arrow Tok</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Qual Op Arrow Tok</em>'.
   * @generated
   */
  QualOp_ArrowTok createQualOp_ArrowTok();

  /**
   * Returns a new object of class '<em>Qual Op Lattice Tok</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Qual Op Lattice Tok</em>'.
   * @generated
   */
  QualOp_LatticeTok createQualOp_LatticeTok();

  /**
   * Returns a new object of class '<em>Qual Op Relation Tok</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Qual Op Relation Tok</em>'.
   * @generated
   */
  QualOp_RelationTok createQualOp_RelationTok();

  /**
   * Returns a new object of class '<em>Qual Op Seg Tok</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Qual Op Seg Tok</em>'.
   * @generated
   */
  QualOp_SegTok createQualOp_SegTok();

  /**
   * Returns a new object of class '<em>Qual Op Plus Tok</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Qual Op Plus Tok</em>'.
   * @generated
   */
  QualOp_PlusTok createQualOp_PlusTok();

  /**
   * Returns a new object of class '<em>Qual Op Quotient Tok</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Qual Op Quotient Tok</em>'.
   * @generated
   */
  QualOp_QuotientTok createQualOp_QuotientTok();

  /**
   * Returns a new object of class '<em>Qual Op Times Tok</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Qual Op Times Tok</em>'.
   * @generated
   */
  QualOp_TimesTok createQualOp_TimesTok();

  /**
   * Returns a new object of class '<em>Qual Op Power Tok</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Qual Op Power Tok</em>'.
   * @generated
   */
  QualOp_PowerTok createQualOp_PowerTok();

  /**
   * Returns a new object of class '<em>enlist1 Comma Item Comma AB</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>enlist1 Comma Item Comma AB</em>'.
   * @generated
   */
  enlist1_CommaItem_Comma_AB createenlist1_CommaItem_Comma_AB();

  /**
   * Returns a new object of class '<em>enlist1 Infixed Comma AB</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>enlist1 Infixed Comma AB</em>'.
   * @generated
   */
  enlist1_Infixed_Comma_AB createenlist1_Infixed_Comma_AB();

  /**
   * Returns a new object of class '<em>enlist1 Infixed Expr Comma AB</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>enlist1 Infixed Expr Comma AB</em>'.
   * @generated
   */
  enlist1_InfixedExpr_Comma_AB createenlist1_InfixedExpr_Comma_AB();

  /**
   * Returns a new object of class '<em>enlister1 Comma Item Comma</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>enlister1 Comma Item Comma</em>'.
   * @generated
   */
  enlister1_CommaItem_Comma createenlister1_CommaItem_Comma();

  /**
   * Returns a new object of class '<em>enlister1 Infixed Comma</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>enlister1 Infixed Comma</em>'.
   * @generated
   */
  enlister1_Infixed_Comma createenlister1_Infixed_Comma();

  /**
   * Returns a new object of class '<em>enlister1 Infixed Expr Comma</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>enlister1 Infixed Expr Comma</em>'.
   * @generated
   */
  enlister1_InfixedExpr_Comma createenlister1_InfixedExpr_Comma();

  /**
   * Returns a new object of class '<em>enlist1a Labeled Semicolon AB</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>enlist1a Labeled Semicolon AB</em>'.
   * @generated
   */
  enlist1a_Labeled_Semicolon_AB createenlist1a_Labeled_Semicolon_AB();

  /**
   * Returns a new object of class '<em>enlister1a Labeled Semicolon</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>enlister1a Labeled Semicolon</em>'.
   * @generated
   */
  enlister1a_Labeled_Semicolon createenlister1a_Labeled_Semicolon();

  /**
   * Returns a new object of class '<em>Curly Labeled</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Curly Labeled</em>'.
   * @generated
   */
  Curly_Labeled createCurly_Labeled();

  /**
   * Returns a new object of class '<em>Curly Contents Labeled</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Curly Contents Labeled</em>'.
   * @generated
   */
  CurlyContents_Labeled createCurlyContents_Labeled();

  /**
   * Returns a new object of class '<em>Curly Contents List Labeled</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Curly Contents List Labeled</em>'.
   * @generated
   */
  CurlyContentsList_Labeled createCurlyContentsList_Labeled();

  /**
   * Returns a new object of class '<em>Curly Content BLabeled</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Curly Content BLabeled</em>'.
   * @generated
   */
  CurlyContentB_Labeled createCurlyContentB_Labeled();

  /**
   * Returns a new object of class '<em>E3</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>E3</em>'.
   * @generated
   */
  E3 createE3();

  /**
   * Returns a new object of class '<em>E4</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>E4</em>'.
   * @generated
   */
  E4 createE4();

  /**
   * Returns a new object of class '<em>E5</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>E5</em>'.
   * @generated
   */
  E5 createE5();

  /**
   * Returns a new object of class '<em>E6</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>E6</em>'.
   * @generated
   */
  E6 createE6();

  /**
   * Returns a new object of class '<em>E7</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>E7</em>'.
   * @generated
   */
  E7 createE7();

  /**
   * Returns a new object of class '<em>E8</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>E8</em>'.
   * @generated
   */
  E8 createE8();

  /**
   * Returns a new object of class '<em>E9</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>E9</em>'.
   * @generated
   */
  E9 createE9();

  /**
   * Returns a new object of class '<em>E11 E12</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>E11 E12</em>'.
   * @generated
   */
  E11_E12 createE11_E12();

  /**
   * Returns a new object of class '<em>E11 Op</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>E11 Op</em>'.
   * @generated
   */
  E11_Op createE11_Op();

  /**
   * Returns a new object of class '<em>E12</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>E12</em>'.
   * @generated
   */
  E12 createE12();

  /**
   * Returns a new object of class '<em>E13</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>E13</em>'.
   * @generated
   */
  E13 createE13();

  /**
   * Returns a new object of class '<em>Arrow Tok</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Arrow Tok</em>'.
   * @generated
   */
  ArrowTok createArrowTok();

  /**
   * Returns a new object of class '<em>Lattice Tok</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Lattice Tok</em>'.
   * @generated
   */
  LatticeTok createLatticeTok();

  /**
   * Returns a new object of class '<em>Relation Tok</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Relation Tok</em>'.
   * @generated
   */
  RelationTok createRelationTok();

  /**
   * Returns a new object of class '<em>Seg Tok</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Seg Tok</em>'.
   * @generated
   */
  SegTok createSegTok();

  /**
   * Returns a new object of class '<em>Plus Tok</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Plus Tok</em>'.
   * @generated
   */
  PlusTok createPlusTok();

  /**
   * Returns a new object of class '<em>Quotient Tok</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Quotient Tok</em>'.
   * @generated
   */
  QuotientTok createQuotientTok();

  /**
   * Returns a new object of class '<em>Times Tok</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Times Tok</em>'.
   * @generated
   */
  TimesTok createTimesTok();

  /**
   * Returns a new object of class '<em>Power Tok</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Power Tok</em>'.
   * @generated
   */
  PowerTok createPowerTok();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  EditorPackage getEditorPackage();

} //EditorFactory
