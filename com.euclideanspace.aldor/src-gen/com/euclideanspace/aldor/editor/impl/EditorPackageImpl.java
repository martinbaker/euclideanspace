/**
 */
package com.euclideanspace.aldor.editor.impl;

import com.euclideanspace.aldor.editor.ArrowOp;
import com.euclideanspace.aldor.editor.ArrowTok;
import com.euclideanspace.aldor.editor.Atom;
import com.euclideanspace.aldor.editor.BlockEnclosure;
import com.euclideanspace.aldor.editor.BlockMolecule;
import com.euclideanspace.aldor.editor.Bracketed;
import com.euclideanspace.aldor.editor.CurlyContentsList_Labeled;
import com.euclideanspace.aldor.editor.CurlyContents_Labeled;
import com.euclideanspace.aldor.editor.Curly_Labeled;
import com.euclideanspace.aldor.editor.EditorFactory;
import com.euclideanspace.aldor.editor.EditorPackage;
import com.euclideanspace.aldor.editor.Enclosure;
import com.euclideanspace.aldor.editor.Expression;
import com.euclideanspace.aldor.editor.Id;
import com.euclideanspace.aldor.editor.Jleft_Atom;
import com.euclideanspace.aldor.editor.Jleft_Molecule;
import com.euclideanspace.aldor.editor.Labeled;
import com.euclideanspace.aldor.editor.LatticeOp;
import com.euclideanspace.aldor.editor.LatticeTok;
import com.euclideanspace.aldor.editor.Model;
import com.euclideanspace.aldor.editor.Molecule;
import com.euclideanspace.aldor.editor.NakedOp;
import com.euclideanspace.aldor.editor.Name;
import com.euclideanspace.aldor.editor.Names;
import com.euclideanspace.aldor.editor.Op;
import com.euclideanspace.aldor.editor.OpQualTail;
import com.euclideanspace.aldor.editor.Parened;
import com.euclideanspace.aldor.editor.PlusOp;
import com.euclideanspace.aldor.editor.PlusTok;
import com.euclideanspace.aldor.editor.PowerOp;
import com.euclideanspace.aldor.editor.PowerTok;
import com.euclideanspace.aldor.editor.QualOp_ArrowTok;
import com.euclideanspace.aldor.editor.QualOp_LatticeTok;
import com.euclideanspace.aldor.editor.QualOp_PlusTok;
import com.euclideanspace.aldor.editor.QualOp_PowerTok;
import com.euclideanspace.aldor.editor.QualOp_QuotientTok;
import com.euclideanspace.aldor.editor.QualOp_RelationTok;
import com.euclideanspace.aldor.editor.QualOp_SegTok;
import com.euclideanspace.aldor.editor.QualOp_TimesTok;
import com.euclideanspace.aldor.editor.QuotedIds;
import com.euclideanspace.aldor.editor.QuotientOp;
import com.euclideanspace.aldor.editor.QuotientTok;
import com.euclideanspace.aldor.editor.RelationOp;
import com.euclideanspace.aldor.editor.RelationTok;
import com.euclideanspace.aldor.editor.SegOp;
import com.euclideanspace.aldor.editor.SegTok;
import com.euclideanspace.aldor.editor.TimesOp;
import com.euclideanspace.aldor.editor.TimesTok;
import com.euclideanspace.aldor.editor.UnqualOp_ArrowTok;
import com.euclideanspace.aldor.editor.UnqualOp_LatticeTok;
import com.euclideanspace.aldor.editor.UnqualOp_PlusTok;
import com.euclideanspace.aldor.editor.UnqualOp_PowerTok;
import com.euclideanspace.aldor.editor.UnqualOp_QuotientTok;
import com.euclideanspace.aldor.editor.UnqualOp_RelationTok;
import com.euclideanspace.aldor.editor.UnqualOp_SegTok;
import com.euclideanspace.aldor.editor.UnqualOp_TimesTok;
import com.euclideanspace.aldor.editor.enlist1a_Labeled_Semicolon_AB;
import com.euclideanspace.aldor.editor.enlister1a_Labeled_Semicolon;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EditorPackageImpl extends EPackageImpl implements EditorPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass labeledEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass opQualTailEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass opEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nakedOpEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass arrowOpEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass latticeOpEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass relationOpEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass segOpEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass plusOpEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass quotientOpEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass timesOpEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass powerOpEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass jleft_MoleculeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass jleft_AtomEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass moleculeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enclosureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass blockMoleculeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass blockEnclosureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parenedEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bracketedEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass quotedIdsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass namesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass atomEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass idEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unqualOp_ArrowTokEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unqualOp_LatticeTokEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unqualOp_RelationTokEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unqualOp_SegTokEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unqualOp_PlusTokEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unqualOp_QuotientTokEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unqualOp_TimesTokEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unqualOp_PowerTokEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass qualOp_ArrowTokEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass qualOp_LatticeTokEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass qualOp_RelationTokEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass qualOp_SegTokEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass qualOp_PlusTokEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass qualOp_QuotientTokEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass qualOp_TimesTokEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass qualOp_PowerTokEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enlist1a_Labeled_Semicolon_ABEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enlister1a_Labeled_SemicolonEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass curly_LabeledEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass curlyContents_LabeledEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass curlyContentsList_LabeledEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass arrowTokEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass latticeTokEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass relationTokEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass segTokEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass plusTokEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass quotientTokEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass timesTokEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass powerTokEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see com.euclideanspace.aldor.editor.EditorPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private EditorPackageImpl()
  {
    super(eNS_URI, EditorFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link EditorPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static EditorPackage init()
  {
    if (isInited) return (EditorPackage)EPackage.Registry.INSTANCE.getEPackage(EditorPackage.eNS_URI);

    // Obtain or create and register package
    EditorPackageImpl theEditorPackage = (EditorPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EditorPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EditorPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theEditorPackage.createPackageContents();

    // Initialize created meta-data
    theEditorPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theEditorPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(EditorPackage.eNS_URI, theEditorPackage);
    return theEditorPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression()
  {
    return expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLabeled()
  {
    return labeledEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOpQualTail()
  {
    return opQualTailEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOpQualTail_Name()
  {
    return (EReference)opQualTailEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOp()
  {
    return opEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNakedOp()
  {
    return nakedOpEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArrowOp()
  {
    return arrowOpEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLatticeOp()
  {
    return latticeOpEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRelationOp()
  {
    return relationOpEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSegOp()
  {
    return segOpEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPlusOp()
  {
    return plusOpEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQuotientOp()
  {
    return quotientOpEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTimesOp()
  {
    return timesOpEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPowerOp()
  {
    return powerOpEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJleft_Molecule()
  {
    return jleft_MoleculeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJleft_Atom()
  {
    return jleft_AtomEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMolecule()
  {
    return moleculeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMolecule_Bm()
  {
    return (EReference)moleculeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnclosure()
  {
    return enclosureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBlockMolecule()
  {
    return blockMoleculeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBlockEnclosure()
  {
    return blockEnclosureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParened()
  {
    return parenedEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBracketed()
  {
    return bracketedEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQuotedIds()
  {
    return quotedIdsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNames()
  {
    return namesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNames_FirstName()
  {
    return (EAttribute)namesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNames_SubsequentNames()
  {
    return (EAttribute)namesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAtom()
  {
    return atomEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAtom_Lab()
  {
    return (EReference)atomEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAtom_Bm4()
  {
    return (EReference)atomEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAtom_Id()
  {
    return (EReference)atomEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAtom_Lit()
  {
    return (EAttribute)atomEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getName_()
  {
    return nameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getId()
  {
    return idEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getId_AB_Id()
  {
    return (EAttribute)idEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getId_Op()
  {
    return (EAttribute)idEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnqualOp_ArrowTok()
  {
    return unqualOp_ArrowTokEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnqualOp_LatticeTok()
  {
    return unqualOp_LatticeTokEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnqualOp_RelationTok()
  {
    return unqualOp_RelationTokEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnqualOp_SegTok()
  {
    return unqualOp_SegTokEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnqualOp_PlusTok()
  {
    return unqualOp_PlusTokEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnqualOp_QuotientTok()
  {
    return unqualOp_QuotientTokEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnqualOp_TimesTok()
  {
    return unqualOp_TimesTokEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnqualOp_PowerTok()
  {
    return unqualOp_PowerTokEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQualOp_ArrowTok()
  {
    return qualOp_ArrowTokEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQualOp_LatticeTok()
  {
    return qualOp_LatticeTokEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQualOp_RelationTok()
  {
    return qualOp_RelationTokEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQualOp_SegTok()
  {
    return qualOp_SegTokEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQualOp_PlusTok()
  {
    return qualOp_PlusTokEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQualOp_QuotientTok()
  {
    return qualOp_QuotientTokEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQualOp_TimesTok()
  {
    return qualOp_TimesTokEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQualOp_PowerTok()
  {
    return qualOp_PowerTokEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getenlist1a_Labeled_Semicolon_AB()
  {
    return enlist1a_Labeled_Semicolon_ABEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getenlister1a_Labeled_Semicolon()
  {
    return enlister1a_Labeled_SemicolonEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getenlister1a_Labeled_Semicolon_Statemnts()
  {
    return (EReference)enlister1a_Labeled_SemicolonEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCurly_Labeled()
  {
    return curly_LabeledEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCurlyContents_Labeled()
  {
    return curlyContents_LabeledEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCurlyContentsList_Labeled()
  {
    return curlyContentsList_LabeledEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCurlyContentsList_Labeled_Statemts()
  {
    return (EReference)curlyContentsList_LabeledEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArrowTok()
  {
    return arrowTokEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLatticeTok()
  {
    return latticeTokEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRelationTok()
  {
    return relationTokEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSegTok()
  {
    return segTokEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPlusTok()
  {
    return plusTokEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQuotientTok()
  {
    return quotientTokEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTimesTok()
  {
    return timesTokEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPowerTok()
  {
    return powerTokEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EditorFactory getEditorFactory()
  {
    return (EditorFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);

    expressionEClass = createEClass(EXPRESSION);

    labeledEClass = createEClass(LABELED);

    opQualTailEClass = createEClass(OP_QUAL_TAIL);
    createEReference(opQualTailEClass, OP_QUAL_TAIL__NAME);

    opEClass = createEClass(OP);

    nakedOpEClass = createEClass(NAKED_OP);

    arrowOpEClass = createEClass(ARROW_OP);

    latticeOpEClass = createEClass(LATTICE_OP);

    relationOpEClass = createEClass(RELATION_OP);

    segOpEClass = createEClass(SEG_OP);

    plusOpEClass = createEClass(PLUS_OP);

    quotientOpEClass = createEClass(QUOTIENT_OP);

    timesOpEClass = createEClass(TIMES_OP);

    powerOpEClass = createEClass(POWER_OP);

    jleft_MoleculeEClass = createEClass(JLEFT_MOLECULE);

    jleft_AtomEClass = createEClass(JLEFT_ATOM);

    moleculeEClass = createEClass(MOLECULE);
    createEReference(moleculeEClass, MOLECULE__BM);

    enclosureEClass = createEClass(ENCLOSURE);

    blockMoleculeEClass = createEClass(BLOCK_MOLECULE);

    blockEnclosureEClass = createEClass(BLOCK_ENCLOSURE);

    parenedEClass = createEClass(PARENED);

    bracketedEClass = createEClass(BRACKETED);

    quotedIdsEClass = createEClass(QUOTED_IDS);

    namesEClass = createEClass(NAMES);
    createEAttribute(namesEClass, NAMES__FIRST_NAME);
    createEAttribute(namesEClass, NAMES__SUBSEQUENT_NAMES);

    atomEClass = createEClass(ATOM);
    createEReference(atomEClass, ATOM__LAB);
    createEReference(atomEClass, ATOM__BM4);
    createEReference(atomEClass, ATOM__ID);
    createEAttribute(atomEClass, ATOM__LIT);

    nameEClass = createEClass(NAME);

    idEClass = createEClass(ID);
    createEAttribute(idEClass, ID__AB_ID);
    createEAttribute(idEClass, ID__OP);

    unqualOp_ArrowTokEClass = createEClass(UNQUAL_OP_ARROW_TOK);

    unqualOp_LatticeTokEClass = createEClass(UNQUAL_OP_LATTICE_TOK);

    unqualOp_RelationTokEClass = createEClass(UNQUAL_OP_RELATION_TOK);

    unqualOp_SegTokEClass = createEClass(UNQUAL_OP_SEG_TOK);

    unqualOp_PlusTokEClass = createEClass(UNQUAL_OP_PLUS_TOK);

    unqualOp_QuotientTokEClass = createEClass(UNQUAL_OP_QUOTIENT_TOK);

    unqualOp_TimesTokEClass = createEClass(UNQUAL_OP_TIMES_TOK);

    unqualOp_PowerTokEClass = createEClass(UNQUAL_OP_POWER_TOK);

    qualOp_ArrowTokEClass = createEClass(QUAL_OP_ARROW_TOK);

    qualOp_LatticeTokEClass = createEClass(QUAL_OP_LATTICE_TOK);

    qualOp_RelationTokEClass = createEClass(QUAL_OP_RELATION_TOK);

    qualOp_SegTokEClass = createEClass(QUAL_OP_SEG_TOK);

    qualOp_PlusTokEClass = createEClass(QUAL_OP_PLUS_TOK);

    qualOp_QuotientTokEClass = createEClass(QUAL_OP_QUOTIENT_TOK);

    qualOp_TimesTokEClass = createEClass(QUAL_OP_TIMES_TOK);

    qualOp_PowerTokEClass = createEClass(QUAL_OP_POWER_TOK);

    enlist1a_Labeled_Semicolon_ABEClass = createEClass(ENLIST1A_LABELED_SEMICOLON_AB);

    enlister1a_Labeled_SemicolonEClass = createEClass(ENLISTER1A_LABELED_SEMICOLON);
    createEReference(enlister1a_Labeled_SemicolonEClass, ENLISTER1A_LABELED_SEMICOLON__STATEMNTS);

    curly_LabeledEClass = createEClass(CURLY_LABELED);

    curlyContents_LabeledEClass = createEClass(CURLY_CONTENTS_LABELED);

    curlyContentsList_LabeledEClass = createEClass(CURLY_CONTENTS_LIST_LABELED);
    createEReference(curlyContentsList_LabeledEClass, CURLY_CONTENTS_LIST_LABELED__STATEMTS);

    arrowTokEClass = createEClass(ARROW_TOK);

    latticeTokEClass = createEClass(LATTICE_TOK);

    relationTokEClass = createEClass(RELATION_TOK);

    segTokEClass = createEClass(SEG_TOK);

    plusTokEClass = createEClass(PLUS_TOK);

    quotientTokEClass = createEClass(QUOTIENT_TOK);

    timesTokEClass = createEClass(TIMES_TOK);

    powerTokEClass = createEClass(POWER_TOK);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    expressionEClass.getESuperTypes().add(this.getParened());
    expressionEClass.getESuperTypes().add(this.getBracketed());
    opQualTailEClass.getESuperTypes().add(this.getQualOp_ArrowTok());
    opQualTailEClass.getESuperTypes().add(this.getQualOp_LatticeTok());
    opQualTailEClass.getESuperTypes().add(this.getQualOp_RelationTok());
    opQualTailEClass.getESuperTypes().add(this.getQualOp_SegTok());
    opQualTailEClass.getESuperTypes().add(this.getQualOp_PlusTok());
    opQualTailEClass.getESuperTypes().add(this.getQualOp_QuotientTok());
    opQualTailEClass.getESuperTypes().add(this.getQualOp_TimesTok());
    opQualTailEClass.getESuperTypes().add(this.getQualOp_PowerTok());
    nakedOpEClass.getESuperTypes().add(this.getName_());
    arrowOpEClass.getESuperTypes().add(this.getOp());
    latticeOpEClass.getESuperTypes().add(this.getOp());
    relationOpEClass.getESuperTypes().add(this.getOp());
    segOpEClass.getESuperTypes().add(this.getOp());
    plusOpEClass.getESuperTypes().add(this.getOp());
    quotientOpEClass.getESuperTypes().add(this.getOp());
    timesOpEClass.getESuperTypes().add(this.getOp());
    powerOpEClass.getESuperTypes().add(this.getOp());
    moleculeEClass.getESuperTypes().add(this.getJleft_Molecule());
    enclosureEClass.getESuperTypes().add(this.getMolecule());
    enclosureEClass.getESuperTypes().add(this.getBlockMolecule());
    enclosureEClass.getESuperTypes().add(this.getBlockEnclosure());
    blockEnclosureEClass.getESuperTypes().add(this.getJleft_Molecule());
    blockEnclosureEClass.getESuperTypes().add(this.getJleft_Atom());
    parenedEClass.getESuperTypes().add(this.getEnclosure());
    bracketedEClass.getESuperTypes().add(this.getEnclosure());
    quotedIdsEClass.getESuperTypes().add(this.getEnclosure());
    namesEClass.getESuperTypes().add(this.getQuotedIds());
    atomEClass.getESuperTypes().add(this.getLabeled());
    atomEClass.getESuperTypes().add(this.getJleft_Atom());
    atomEClass.getESuperTypes().add(this.getMolecule());
    atomEClass.getESuperTypes().add(this.getBlockMolecule());
    idEClass.getESuperTypes().add(this.getName_());
    unqualOp_ArrowTokEClass.getESuperTypes().add(this.getNakedOp());
    unqualOp_LatticeTokEClass.getESuperTypes().add(this.getNakedOp());
    unqualOp_RelationTokEClass.getESuperTypes().add(this.getNakedOp());
    unqualOp_SegTokEClass.getESuperTypes().add(this.getNakedOp());
    unqualOp_PlusTokEClass.getESuperTypes().add(this.getNakedOp());
    unqualOp_QuotientTokEClass.getESuperTypes().add(this.getNakedOp());
    unqualOp_TimesTokEClass.getESuperTypes().add(this.getNakedOp());
    unqualOp_PowerTokEClass.getESuperTypes().add(this.getNakedOp());
    qualOp_ArrowTokEClass.getESuperTypes().add(this.getArrowOp());
    qualOp_LatticeTokEClass.getESuperTypes().add(this.getLatticeOp());
    qualOp_RelationTokEClass.getESuperTypes().add(this.getRelationOp());
    qualOp_SegTokEClass.getESuperTypes().add(this.getSegOp());
    qualOp_PlusTokEClass.getESuperTypes().add(this.getPlusOp());
    qualOp_QuotientTokEClass.getESuperTypes().add(this.getQuotientOp());
    qualOp_TimesTokEClass.getESuperTypes().add(this.getTimesOp());
    qualOp_PowerTokEClass.getESuperTypes().add(this.getPowerOp());
    enlist1a_Labeled_Semicolon_ABEClass.getESuperTypes().add(this.getExpression());
    enlister1a_Labeled_SemicolonEClass.getESuperTypes().add(this.getenlist1a_Labeled_Semicolon_AB());
    curlyContents_LabeledEClass.getESuperTypes().add(this.getModel());
    curlyContents_LabeledEClass.getESuperTypes().add(this.getCurly_Labeled());
    curlyContentsList_LabeledEClass.getESuperTypes().add(this.getCurlyContents_Labeled());
    arrowTokEClass.getESuperTypes().add(this.getUnqualOp_ArrowTok());
    latticeTokEClass.getESuperTypes().add(this.getUnqualOp_LatticeTok());
    relationTokEClass.getESuperTypes().add(this.getUnqualOp_RelationTok());
    segTokEClass.getESuperTypes().add(this.getUnqualOp_SegTok());
    plusTokEClass.getESuperTypes().add(this.getUnqualOp_PlusTok());
    quotientTokEClass.getESuperTypes().add(this.getUnqualOp_QuotientTok());
    timesTokEClass.getESuperTypes().add(this.getUnqualOp_TimesTok());
    powerTokEClass.getESuperTypes().add(this.getUnqualOp_PowerTok());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(labeledEClass, Labeled.class, "Labeled", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(opQualTailEClass, OpQualTail.class, "OpQualTail", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOpQualTail_Name(), this.getMolecule(), null, "name", null, 0, 1, OpQualTail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(opEClass, Op.class, "Op", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(nakedOpEClass, NakedOp.class, "NakedOp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(arrowOpEClass, ArrowOp.class, "ArrowOp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(latticeOpEClass, LatticeOp.class, "LatticeOp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(relationOpEClass, RelationOp.class, "RelationOp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(segOpEClass, SegOp.class, "SegOp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(plusOpEClass, PlusOp.class, "PlusOp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(quotientOpEClass, QuotientOp.class, "QuotientOp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(timesOpEClass, TimesOp.class, "TimesOp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(powerOpEClass, PowerOp.class, "PowerOp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(jleft_MoleculeEClass, Jleft_Molecule.class, "Jleft_Molecule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(jleft_AtomEClass, Jleft_Atom.class, "Jleft_Atom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(moleculeEClass, Molecule.class, "Molecule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMolecule_Bm(), this.getBlockMolecule(), null, "bm", null, 0, -1, Molecule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enclosureEClass, Enclosure.class, "Enclosure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(blockMoleculeEClass, BlockMolecule.class, "BlockMolecule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(blockEnclosureEClass, BlockEnclosure.class, "BlockEnclosure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(parenedEClass, Parened.class, "Parened", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(bracketedEClass, Bracketed.class, "Bracketed", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(quotedIdsEClass, QuotedIds.class, "QuotedIds", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(namesEClass, Names.class, "Names", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNames_FirstName(), ecorePackage.getEString(), "firstName", null, 0, 1, Names.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNames_SubsequentNames(), ecorePackage.getEString(), "subsequentNames", null, 0, -1, Names.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(atomEClass, Atom.class, "Atom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAtom_Lab(), this.getLabeled(), null, "lab", null, 0, 1, Atom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAtom_Bm4(), this.getBlockMolecule(), null, "bm4", null, 0, -1, Atom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAtom_Id(), this.getId(), null, "id", null, 0, 1, Atom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAtom_Lit(), ecorePackage.getEString(), "lit", null, 0, 1, Atom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nameEClass, Name.class, "Name", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(idEClass, Id.class, "Id", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getId_AB_Id(), ecorePackage.getEString(), "AB_Id", null, 0, 1, Id.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getId_Op(), ecorePackage.getEString(), "op", null, 0, 1, Id.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unqualOp_ArrowTokEClass, UnqualOp_ArrowTok.class, "UnqualOp_ArrowTok", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(unqualOp_LatticeTokEClass, UnqualOp_LatticeTok.class, "UnqualOp_LatticeTok", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(unqualOp_RelationTokEClass, UnqualOp_RelationTok.class, "UnqualOp_RelationTok", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(unqualOp_SegTokEClass, UnqualOp_SegTok.class, "UnqualOp_SegTok", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(unqualOp_PlusTokEClass, UnqualOp_PlusTok.class, "UnqualOp_PlusTok", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(unqualOp_QuotientTokEClass, UnqualOp_QuotientTok.class, "UnqualOp_QuotientTok", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(unqualOp_TimesTokEClass, UnqualOp_TimesTok.class, "UnqualOp_TimesTok", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(unqualOp_PowerTokEClass, UnqualOp_PowerTok.class, "UnqualOp_PowerTok", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(qualOp_ArrowTokEClass, QualOp_ArrowTok.class, "QualOp_ArrowTok", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(qualOp_LatticeTokEClass, QualOp_LatticeTok.class, "QualOp_LatticeTok", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(qualOp_RelationTokEClass, QualOp_RelationTok.class, "QualOp_RelationTok", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(qualOp_SegTokEClass, QualOp_SegTok.class, "QualOp_SegTok", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(qualOp_PlusTokEClass, QualOp_PlusTok.class, "QualOp_PlusTok", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(qualOp_QuotientTokEClass, QualOp_QuotientTok.class, "QualOp_QuotientTok", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(qualOp_TimesTokEClass, QualOp_TimesTok.class, "QualOp_TimesTok", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(qualOp_PowerTokEClass, QualOp_PowerTok.class, "QualOp_PowerTok", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(enlist1a_Labeled_Semicolon_ABEClass, enlist1a_Labeled_Semicolon_AB.class, "enlist1a_Labeled_Semicolon_AB", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(enlister1a_Labeled_SemicolonEClass, enlister1a_Labeled_Semicolon.class, "enlister1a_Labeled_Semicolon", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getenlister1a_Labeled_Semicolon_Statemnts(), this.getLabeled(), null, "statemnts", null, 0, -1, enlister1a_Labeled_Semicolon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(curly_LabeledEClass, Curly_Labeled.class, "Curly_Labeled", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(curlyContents_LabeledEClass, CurlyContents_Labeled.class, "CurlyContents_Labeled", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(curlyContentsList_LabeledEClass, CurlyContentsList_Labeled.class, "CurlyContentsList_Labeled", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCurlyContentsList_Labeled_Statemts(), this.getLabeled(), null, "statemts", null, 0, -1, CurlyContentsList_Labeled.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(arrowTokEClass, ArrowTok.class, "ArrowTok", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(latticeTokEClass, LatticeTok.class, "LatticeTok", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(relationTokEClass, RelationTok.class, "RelationTok", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(segTokEClass, SegTok.class, "SegTok", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(plusTokEClass, PlusTok.class, "PlusTok", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(quotientTokEClass, QuotientTok.class, "QuotientTok", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(timesTokEClass, TimesTok.class, "TimesTok", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(powerTokEClass, PowerTok.class, "PowerTok", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //EditorPackageImpl
