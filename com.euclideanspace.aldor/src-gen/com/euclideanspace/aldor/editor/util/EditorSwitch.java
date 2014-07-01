/**
 */
package com.euclideanspace.aldor.editor.util;

import com.euclideanspace.aldor.editor.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.euclideanspace.aldor.editor.EditorPackage
 * @generated
 */
public class EditorSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static EditorPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EditorSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = EditorPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case EditorPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = caseParened(expression);
        if (result == null) result = caseBracketed(expression);
        if (result == null) result = caseEnclosure(expression);
        if (result == null) result = caseMolecule(expression);
        if (result == null) result = caseBlockMolecule(expression);
        if (result == null) result = caseBlockEnclosure(expression);
        if (result == null) result = caseJleft_Molecule(expression);
        if (result == null) result = caseJleft_Atom(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.LABELED:
      {
        Labeled labeled = (Labeled)theEObject;
        T result = caseLabeled(labeled);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.OP_QUAL_TAIL:
      {
        OpQualTail opQualTail = (OpQualTail)theEObject;
        T result = caseOpQualTail(opQualTail);
        if (result == null) result = caseQualOp_ArrowTok(opQualTail);
        if (result == null) result = caseQualOp_LatticeTok(opQualTail);
        if (result == null) result = caseQualOp_RelationTok(opQualTail);
        if (result == null) result = caseQualOp_SegTok(opQualTail);
        if (result == null) result = caseQualOp_PlusTok(opQualTail);
        if (result == null) result = caseQualOp_QuotientTok(opQualTail);
        if (result == null) result = caseQualOp_TimesTok(opQualTail);
        if (result == null) result = caseQualOp_PowerTok(opQualTail);
        if (result == null) result = caseArrowOp(opQualTail);
        if (result == null) result = caseLatticeOp(opQualTail);
        if (result == null) result = caseRelationOp(opQualTail);
        if (result == null) result = caseSegOp(opQualTail);
        if (result == null) result = casePlusOp(opQualTail);
        if (result == null) result = caseQuotientOp(opQualTail);
        if (result == null) result = caseTimesOp(opQualTail);
        if (result == null) result = casePowerOp(opQualTail);
        if (result == null) result = caseOp(opQualTail);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.OP:
      {
        Op op = (Op)theEObject;
        T result = caseOp(op);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.NAKED_OP:
      {
        NakedOp nakedOp = (NakedOp)theEObject;
        T result = caseNakedOp(nakedOp);
        if (result == null) result = caseName(nakedOp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.ARROW_OP:
      {
        ArrowOp arrowOp = (ArrowOp)theEObject;
        T result = caseArrowOp(arrowOp);
        if (result == null) result = caseOp(arrowOp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.LATTICE_OP:
      {
        LatticeOp latticeOp = (LatticeOp)theEObject;
        T result = caseLatticeOp(latticeOp);
        if (result == null) result = caseOp(latticeOp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.RELATION_OP:
      {
        RelationOp relationOp = (RelationOp)theEObject;
        T result = caseRelationOp(relationOp);
        if (result == null) result = caseOp(relationOp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.SEG_OP:
      {
        SegOp segOp = (SegOp)theEObject;
        T result = caseSegOp(segOp);
        if (result == null) result = caseOp(segOp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.PLUS_OP:
      {
        PlusOp plusOp = (PlusOp)theEObject;
        T result = casePlusOp(plusOp);
        if (result == null) result = caseOp(plusOp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.QUOTIENT_OP:
      {
        QuotientOp quotientOp = (QuotientOp)theEObject;
        T result = caseQuotientOp(quotientOp);
        if (result == null) result = caseOp(quotientOp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.TIMES_OP:
      {
        TimesOp timesOp = (TimesOp)theEObject;
        T result = caseTimesOp(timesOp);
        if (result == null) result = caseOp(timesOp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.POWER_OP:
      {
        PowerOp powerOp = (PowerOp)theEObject;
        T result = casePowerOp(powerOp);
        if (result == null) result = caseOp(powerOp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.JLEFT_MOLECULE:
      {
        Jleft_Molecule jleft_Molecule = (Jleft_Molecule)theEObject;
        T result = caseJleft_Molecule(jleft_Molecule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.JLEFT_ATOM:
      {
        Jleft_Atom jleft_Atom = (Jleft_Atom)theEObject;
        T result = caseJleft_Atom(jleft_Atom);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.MOLECULE:
      {
        Molecule molecule = (Molecule)theEObject;
        T result = caseMolecule(molecule);
        if (result == null) result = caseJleft_Molecule(molecule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.ENCLOSURE:
      {
        Enclosure enclosure = (Enclosure)theEObject;
        T result = caseEnclosure(enclosure);
        if (result == null) result = caseMolecule(enclosure);
        if (result == null) result = caseBlockMolecule(enclosure);
        if (result == null) result = caseBlockEnclosure(enclosure);
        if (result == null) result = caseJleft_Molecule(enclosure);
        if (result == null) result = caseJleft_Atom(enclosure);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.BLOCK_MOLECULE:
      {
        BlockMolecule blockMolecule = (BlockMolecule)theEObject;
        T result = caseBlockMolecule(blockMolecule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.BLOCK_ENCLOSURE:
      {
        BlockEnclosure blockEnclosure = (BlockEnclosure)theEObject;
        T result = caseBlockEnclosure(blockEnclosure);
        if (result == null) result = caseJleft_Molecule(blockEnclosure);
        if (result == null) result = caseJleft_Atom(blockEnclosure);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.PARENED:
      {
        Parened parened = (Parened)theEObject;
        T result = caseParened(parened);
        if (result == null) result = caseEnclosure(parened);
        if (result == null) result = caseMolecule(parened);
        if (result == null) result = caseBlockMolecule(parened);
        if (result == null) result = caseBlockEnclosure(parened);
        if (result == null) result = caseJleft_Molecule(parened);
        if (result == null) result = caseJleft_Atom(parened);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.BRACKETED:
      {
        Bracketed bracketed = (Bracketed)theEObject;
        T result = caseBracketed(bracketed);
        if (result == null) result = caseEnclosure(bracketed);
        if (result == null) result = caseMolecule(bracketed);
        if (result == null) result = caseBlockMolecule(bracketed);
        if (result == null) result = caseBlockEnclosure(bracketed);
        if (result == null) result = caseJleft_Molecule(bracketed);
        if (result == null) result = caseJleft_Atom(bracketed);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.QUOTED_IDS:
      {
        QuotedIds quotedIds = (QuotedIds)theEObject;
        T result = caseQuotedIds(quotedIds);
        if (result == null) result = caseEnclosure(quotedIds);
        if (result == null) result = caseMolecule(quotedIds);
        if (result == null) result = caseBlockMolecule(quotedIds);
        if (result == null) result = caseBlockEnclosure(quotedIds);
        if (result == null) result = caseJleft_Molecule(quotedIds);
        if (result == null) result = caseJleft_Atom(quotedIds);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.NAMES:
      {
        Names names = (Names)theEObject;
        T result = caseNames(names);
        if (result == null) result = caseQuotedIds(names);
        if (result == null) result = caseEnclosure(names);
        if (result == null) result = caseMolecule(names);
        if (result == null) result = caseBlockMolecule(names);
        if (result == null) result = caseBlockEnclosure(names);
        if (result == null) result = caseJleft_Molecule(names);
        if (result == null) result = caseJleft_Atom(names);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.ATOM:
      {
        Atom atom = (Atom)theEObject;
        T result = caseAtom(atom);
        if (result == null) result = caseLabeled(atom);
        if (result == null) result = caseJleft_Atom(atom);
        if (result == null) result = caseMolecule(atom);
        if (result == null) result = caseBlockMolecule(atom);
        if (result == null) result = caseJleft_Molecule(atom);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.NAME:
      {
        Name name = (Name)theEObject;
        T result = caseName(name);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.ID:
      {
        Id id = (Id)theEObject;
        T result = caseId(id);
        if (result == null) result = caseName(id);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.UNQUAL_OP_ARROW_TOK:
      {
        UnqualOp_ArrowTok unqualOp_ArrowTok = (UnqualOp_ArrowTok)theEObject;
        T result = caseUnqualOp_ArrowTok(unqualOp_ArrowTok);
        if (result == null) result = caseNakedOp(unqualOp_ArrowTok);
        if (result == null) result = caseName(unqualOp_ArrowTok);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.UNQUAL_OP_LATTICE_TOK:
      {
        UnqualOp_LatticeTok unqualOp_LatticeTok = (UnqualOp_LatticeTok)theEObject;
        T result = caseUnqualOp_LatticeTok(unqualOp_LatticeTok);
        if (result == null) result = caseNakedOp(unqualOp_LatticeTok);
        if (result == null) result = caseName(unqualOp_LatticeTok);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.UNQUAL_OP_RELATION_TOK:
      {
        UnqualOp_RelationTok unqualOp_RelationTok = (UnqualOp_RelationTok)theEObject;
        T result = caseUnqualOp_RelationTok(unqualOp_RelationTok);
        if (result == null) result = caseNakedOp(unqualOp_RelationTok);
        if (result == null) result = caseName(unqualOp_RelationTok);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.UNQUAL_OP_SEG_TOK:
      {
        UnqualOp_SegTok unqualOp_SegTok = (UnqualOp_SegTok)theEObject;
        T result = caseUnqualOp_SegTok(unqualOp_SegTok);
        if (result == null) result = caseNakedOp(unqualOp_SegTok);
        if (result == null) result = caseName(unqualOp_SegTok);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.UNQUAL_OP_PLUS_TOK:
      {
        UnqualOp_PlusTok unqualOp_PlusTok = (UnqualOp_PlusTok)theEObject;
        T result = caseUnqualOp_PlusTok(unqualOp_PlusTok);
        if (result == null) result = caseNakedOp(unqualOp_PlusTok);
        if (result == null) result = caseName(unqualOp_PlusTok);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.UNQUAL_OP_QUOTIENT_TOK:
      {
        UnqualOp_QuotientTok unqualOp_QuotientTok = (UnqualOp_QuotientTok)theEObject;
        T result = caseUnqualOp_QuotientTok(unqualOp_QuotientTok);
        if (result == null) result = caseNakedOp(unqualOp_QuotientTok);
        if (result == null) result = caseName(unqualOp_QuotientTok);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.UNQUAL_OP_TIMES_TOK:
      {
        UnqualOp_TimesTok unqualOp_TimesTok = (UnqualOp_TimesTok)theEObject;
        T result = caseUnqualOp_TimesTok(unqualOp_TimesTok);
        if (result == null) result = caseNakedOp(unqualOp_TimesTok);
        if (result == null) result = caseName(unqualOp_TimesTok);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.UNQUAL_OP_POWER_TOK:
      {
        UnqualOp_PowerTok unqualOp_PowerTok = (UnqualOp_PowerTok)theEObject;
        T result = caseUnqualOp_PowerTok(unqualOp_PowerTok);
        if (result == null) result = caseNakedOp(unqualOp_PowerTok);
        if (result == null) result = caseName(unqualOp_PowerTok);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.QUAL_OP_ARROW_TOK:
      {
        QualOp_ArrowTok qualOp_ArrowTok = (QualOp_ArrowTok)theEObject;
        T result = caseQualOp_ArrowTok(qualOp_ArrowTok);
        if (result == null) result = caseArrowOp(qualOp_ArrowTok);
        if (result == null) result = caseOp(qualOp_ArrowTok);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.QUAL_OP_LATTICE_TOK:
      {
        QualOp_LatticeTok qualOp_LatticeTok = (QualOp_LatticeTok)theEObject;
        T result = caseQualOp_LatticeTok(qualOp_LatticeTok);
        if (result == null) result = caseLatticeOp(qualOp_LatticeTok);
        if (result == null) result = caseOp(qualOp_LatticeTok);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.QUAL_OP_RELATION_TOK:
      {
        QualOp_RelationTok qualOp_RelationTok = (QualOp_RelationTok)theEObject;
        T result = caseQualOp_RelationTok(qualOp_RelationTok);
        if (result == null) result = caseRelationOp(qualOp_RelationTok);
        if (result == null) result = caseOp(qualOp_RelationTok);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.QUAL_OP_SEG_TOK:
      {
        QualOp_SegTok qualOp_SegTok = (QualOp_SegTok)theEObject;
        T result = caseQualOp_SegTok(qualOp_SegTok);
        if (result == null) result = caseSegOp(qualOp_SegTok);
        if (result == null) result = caseOp(qualOp_SegTok);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.QUAL_OP_PLUS_TOK:
      {
        QualOp_PlusTok qualOp_PlusTok = (QualOp_PlusTok)theEObject;
        T result = caseQualOp_PlusTok(qualOp_PlusTok);
        if (result == null) result = casePlusOp(qualOp_PlusTok);
        if (result == null) result = caseOp(qualOp_PlusTok);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.QUAL_OP_QUOTIENT_TOK:
      {
        QualOp_QuotientTok qualOp_QuotientTok = (QualOp_QuotientTok)theEObject;
        T result = caseQualOp_QuotientTok(qualOp_QuotientTok);
        if (result == null) result = caseQuotientOp(qualOp_QuotientTok);
        if (result == null) result = caseOp(qualOp_QuotientTok);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.QUAL_OP_TIMES_TOK:
      {
        QualOp_TimesTok qualOp_TimesTok = (QualOp_TimesTok)theEObject;
        T result = caseQualOp_TimesTok(qualOp_TimesTok);
        if (result == null) result = caseTimesOp(qualOp_TimesTok);
        if (result == null) result = caseOp(qualOp_TimesTok);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.QUAL_OP_POWER_TOK:
      {
        QualOp_PowerTok qualOp_PowerTok = (QualOp_PowerTok)theEObject;
        T result = caseQualOp_PowerTok(qualOp_PowerTok);
        if (result == null) result = casePowerOp(qualOp_PowerTok);
        if (result == null) result = caseOp(qualOp_PowerTok);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.ENLIST1A_LABELED_SEMICOLON_AB:
      {
        enlist1a_Labeled_Semicolon_AB enlist1a_Labeled_Semicolon_AB = (enlist1a_Labeled_Semicolon_AB)theEObject;
        T result = caseenlist1a_Labeled_Semicolon_AB(enlist1a_Labeled_Semicolon_AB);
        if (result == null) result = caseExpression(enlist1a_Labeled_Semicolon_AB);
        if (result == null) result = caseParened(enlist1a_Labeled_Semicolon_AB);
        if (result == null) result = caseBracketed(enlist1a_Labeled_Semicolon_AB);
        if (result == null) result = caseEnclosure(enlist1a_Labeled_Semicolon_AB);
        if (result == null) result = caseMolecule(enlist1a_Labeled_Semicolon_AB);
        if (result == null) result = caseBlockMolecule(enlist1a_Labeled_Semicolon_AB);
        if (result == null) result = caseBlockEnclosure(enlist1a_Labeled_Semicolon_AB);
        if (result == null) result = caseJleft_Molecule(enlist1a_Labeled_Semicolon_AB);
        if (result == null) result = caseJleft_Atom(enlist1a_Labeled_Semicolon_AB);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.ENLISTER1A_LABELED_SEMICOLON:
      {
        enlister1a_Labeled_Semicolon enlister1a_Labeled_Semicolon = (enlister1a_Labeled_Semicolon)theEObject;
        T result = caseenlister1a_Labeled_Semicolon(enlister1a_Labeled_Semicolon);
        if (result == null) result = caseenlist1a_Labeled_Semicolon_AB(enlister1a_Labeled_Semicolon);
        if (result == null) result = caseExpression(enlister1a_Labeled_Semicolon);
        if (result == null) result = caseParened(enlister1a_Labeled_Semicolon);
        if (result == null) result = caseBracketed(enlister1a_Labeled_Semicolon);
        if (result == null) result = caseEnclosure(enlister1a_Labeled_Semicolon);
        if (result == null) result = caseMolecule(enlister1a_Labeled_Semicolon);
        if (result == null) result = caseBlockMolecule(enlister1a_Labeled_Semicolon);
        if (result == null) result = caseBlockEnclosure(enlister1a_Labeled_Semicolon);
        if (result == null) result = caseJleft_Molecule(enlister1a_Labeled_Semicolon);
        if (result == null) result = caseJleft_Atom(enlister1a_Labeled_Semicolon);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.CURLY_LABELED:
      {
        Curly_Labeled curly_Labeled = (Curly_Labeled)theEObject;
        T result = caseCurly_Labeled(curly_Labeled);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.CURLY_CONTENTS_LABELED:
      {
        CurlyContents_Labeled curlyContents_Labeled = (CurlyContents_Labeled)theEObject;
        T result = caseCurlyContents_Labeled(curlyContents_Labeled);
        if (result == null) result = caseModel(curlyContents_Labeled);
        if (result == null) result = caseCurly_Labeled(curlyContents_Labeled);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.CURLY_CONTENTS_LIST_LABELED:
      {
        CurlyContentsList_Labeled curlyContentsList_Labeled = (CurlyContentsList_Labeled)theEObject;
        T result = caseCurlyContentsList_Labeled(curlyContentsList_Labeled);
        if (result == null) result = caseCurlyContents_Labeled(curlyContentsList_Labeled);
        if (result == null) result = caseModel(curlyContentsList_Labeled);
        if (result == null) result = caseCurly_Labeled(curlyContentsList_Labeled);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.ARROW_TOK:
      {
        ArrowTok arrowTok = (ArrowTok)theEObject;
        T result = caseArrowTok(arrowTok);
        if (result == null) result = caseUnqualOp_ArrowTok(arrowTok);
        if (result == null) result = caseNakedOp(arrowTok);
        if (result == null) result = caseName(arrowTok);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.LATTICE_TOK:
      {
        LatticeTok latticeTok = (LatticeTok)theEObject;
        T result = caseLatticeTok(latticeTok);
        if (result == null) result = caseUnqualOp_LatticeTok(latticeTok);
        if (result == null) result = caseNakedOp(latticeTok);
        if (result == null) result = caseName(latticeTok);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.RELATION_TOK:
      {
        RelationTok relationTok = (RelationTok)theEObject;
        T result = caseRelationTok(relationTok);
        if (result == null) result = caseUnqualOp_RelationTok(relationTok);
        if (result == null) result = caseNakedOp(relationTok);
        if (result == null) result = caseName(relationTok);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.SEG_TOK:
      {
        SegTok segTok = (SegTok)theEObject;
        T result = caseSegTok(segTok);
        if (result == null) result = caseUnqualOp_SegTok(segTok);
        if (result == null) result = caseNakedOp(segTok);
        if (result == null) result = caseName(segTok);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.PLUS_TOK:
      {
        PlusTok plusTok = (PlusTok)theEObject;
        T result = casePlusTok(plusTok);
        if (result == null) result = caseUnqualOp_PlusTok(plusTok);
        if (result == null) result = caseNakedOp(plusTok);
        if (result == null) result = caseName(plusTok);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.QUOTIENT_TOK:
      {
        QuotientTok quotientTok = (QuotientTok)theEObject;
        T result = caseQuotientTok(quotientTok);
        if (result == null) result = caseUnqualOp_QuotientTok(quotientTok);
        if (result == null) result = caseNakedOp(quotientTok);
        if (result == null) result = caseName(quotientTok);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.TIMES_TOK:
      {
        TimesTok timesTok = (TimesTok)theEObject;
        T result = caseTimesTok(timesTok);
        if (result == null) result = caseUnqualOp_TimesTok(timesTok);
        if (result == null) result = caseNakedOp(timesTok);
        if (result == null) result = caseName(timesTok);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.POWER_TOK:
      {
        PowerTok powerTok = (PowerTok)theEObject;
        T result = casePowerTok(powerTok);
        if (result == null) result = caseUnqualOp_PowerTok(powerTok);
        if (result == null) result = caseNakedOp(powerTok);
        if (result == null) result = caseName(powerTok);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression(Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Labeled</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Labeled</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLabeled(Labeled object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Op Qual Tail</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Op Qual Tail</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOpQualTail(OpQualTail object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Op</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Op</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOp(Op object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Naked Op</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Naked Op</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNakedOp(NakedOp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Arrow Op</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Arrow Op</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArrowOp(ArrowOp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Lattice Op</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Lattice Op</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLatticeOp(LatticeOp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Relation Op</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Relation Op</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRelationOp(RelationOp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Seg Op</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Seg Op</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSegOp(SegOp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Plus Op</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Plus Op</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePlusOp(PlusOp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Quotient Op</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Quotient Op</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQuotientOp(QuotientOp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Times Op</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Times Op</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTimesOp(TimesOp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Power Op</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Power Op</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePowerOp(PowerOp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Jleft Molecule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Jleft Molecule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJleft_Molecule(Jleft_Molecule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Jleft Atom</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Jleft Atom</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJleft_Atom(Jleft_Atom object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Molecule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Molecule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMolecule(Molecule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enclosure</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enclosure</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnclosure(Enclosure object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Block Molecule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Block Molecule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBlockMolecule(BlockMolecule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Block Enclosure</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Block Enclosure</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBlockEnclosure(BlockEnclosure object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parened</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parened</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParened(Parened object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bracketed</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bracketed</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBracketed(Bracketed object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Quoted Ids</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Quoted Ids</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQuotedIds(QuotedIds object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Names</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Names</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNames(Names object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Atom</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Atom</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAtom(Atom object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseName(Name object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Id</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Id</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseId(Id object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unqual Op Arrow Tok</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unqual Op Arrow Tok</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnqualOp_ArrowTok(UnqualOp_ArrowTok object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unqual Op Lattice Tok</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unqual Op Lattice Tok</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnqualOp_LatticeTok(UnqualOp_LatticeTok object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unqual Op Relation Tok</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unqual Op Relation Tok</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnqualOp_RelationTok(UnqualOp_RelationTok object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unqual Op Seg Tok</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unqual Op Seg Tok</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnqualOp_SegTok(UnqualOp_SegTok object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unqual Op Plus Tok</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unqual Op Plus Tok</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnqualOp_PlusTok(UnqualOp_PlusTok object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unqual Op Quotient Tok</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unqual Op Quotient Tok</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnqualOp_QuotientTok(UnqualOp_QuotientTok object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unqual Op Times Tok</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unqual Op Times Tok</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnqualOp_TimesTok(UnqualOp_TimesTok object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unqual Op Power Tok</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unqual Op Power Tok</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnqualOp_PowerTok(UnqualOp_PowerTok object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Qual Op Arrow Tok</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Qual Op Arrow Tok</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQualOp_ArrowTok(QualOp_ArrowTok object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Qual Op Lattice Tok</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Qual Op Lattice Tok</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQualOp_LatticeTok(QualOp_LatticeTok object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Qual Op Relation Tok</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Qual Op Relation Tok</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQualOp_RelationTok(QualOp_RelationTok object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Qual Op Seg Tok</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Qual Op Seg Tok</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQualOp_SegTok(QualOp_SegTok object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Qual Op Plus Tok</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Qual Op Plus Tok</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQualOp_PlusTok(QualOp_PlusTok object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Qual Op Quotient Tok</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Qual Op Quotient Tok</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQualOp_QuotientTok(QualOp_QuotientTok object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Qual Op Times Tok</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Qual Op Times Tok</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQualOp_TimesTok(QualOp_TimesTok object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Qual Op Power Tok</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Qual Op Power Tok</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQualOp_PowerTok(QualOp_PowerTok object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>enlist1a Labeled Semicolon AB</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>enlist1a Labeled Semicolon AB</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseenlist1a_Labeled_Semicolon_AB(enlist1a_Labeled_Semicolon_AB object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>enlister1a Labeled Semicolon</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>enlister1a Labeled Semicolon</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseenlister1a_Labeled_Semicolon(enlister1a_Labeled_Semicolon object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Curly Labeled</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Curly Labeled</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCurly_Labeled(Curly_Labeled object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Curly Contents Labeled</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Curly Contents Labeled</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCurlyContents_Labeled(CurlyContents_Labeled object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Curly Contents List Labeled</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Curly Contents List Labeled</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCurlyContentsList_Labeled(CurlyContentsList_Labeled object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Arrow Tok</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Arrow Tok</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArrowTok(ArrowTok object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Lattice Tok</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Lattice Tok</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLatticeTok(LatticeTok object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Relation Tok</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Relation Tok</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRelationTok(RelationTok object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Seg Tok</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Seg Tok</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSegTok(SegTok object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Plus Tok</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Plus Tok</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePlusTok(PlusTok object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Quotient Tok</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Quotient Tok</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQuotientTok(QuotientTok object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Times Tok</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Times Tok</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTimesTok(TimesTok object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Power Tok</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Power Tok</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePowerTok(PowerTok object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //EditorSwitch
