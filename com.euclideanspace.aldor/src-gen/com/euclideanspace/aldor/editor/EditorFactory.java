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
   * Returns a new object of class '<em>Op Qual Tail</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Op Qual Tail</em>'.
   * @generated
   */
  OpQualTail createOpQualTail();

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
