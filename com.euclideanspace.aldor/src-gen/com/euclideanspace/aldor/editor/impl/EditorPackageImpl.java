/**
 */
package com.euclideanspace.aldor.editor.impl;

import com.euclideanspace.aldor.editor.AlwaysPart_AnyStatement;
import com.euclideanspace.aldor.editor.AlwaysPart_BalStatement;
import com.euclideanspace.aldor.editor.AnyStatement;
import com.euclideanspace.aldor.editor.ArrowOp;
import com.euclideanspace.aldor.editor.ArrowTok;
import com.euclideanspace.aldor.editor.Atom;
import com.euclideanspace.aldor.editor.BalStatement;
import com.euclideanspace.aldor.editor.BindingL_Infixed_AnyStatement;
import com.euclideanspace.aldor.editor.BindingL_Infixed_BalStatement;
import com.euclideanspace.aldor.editor.BindingL_Infixed_Collection;
import com.euclideanspace.aldor.editor.BindingR_InfixedExprsDecl_AnyStatement;
import com.euclideanspace.aldor.editor.Binding_AnyStatement;
import com.euclideanspace.aldor.editor.Binding_BalStatement;
import com.euclideanspace.aldor.editor.Binding_Collection;
import com.euclideanspace.aldor.editor.Block;
import com.euclideanspace.aldor.editor.BlockEnclosure;
import com.euclideanspace.aldor.editor.BlockMolecule;
import com.euclideanspace.aldor.editor.Bracketed;
import com.euclideanspace.aldor.editor.ButExpr;
import com.euclideanspace.aldor.editor.Cases;
import com.euclideanspace.aldor.editor.Collection;
import com.euclideanspace.aldor.editor.Comma;
import com.euclideanspace.aldor.editor.CommaItem;
import com.euclideanspace.aldor.editor.CurlyContentB_Labeled;
import com.euclideanspace.aldor.editor.CurlyContentsList_Labeled;
import com.euclideanspace.aldor.editor.CurlyContents_Labeled;
import com.euclideanspace.aldor.editor.Curly_Labeled;
import com.euclideanspace.aldor.editor.DeclBinding;
import com.euclideanspace.aldor.editor.DeclMolecule;
import com.euclideanspace.aldor.editor.DeclPart;
import com.euclideanspace.aldor.editor.Declaration;
import com.euclideanspace.aldor.editor.E11_Op;
import com.euclideanspace.aldor.editor.EditorFactory;
import com.euclideanspace.aldor.editor.EditorPackage;
import com.euclideanspace.aldor.editor.Enclosure;
import com.euclideanspace.aldor.editor.ExportDecl;
import com.euclideanspace.aldor.editor.Expr;
import com.euclideanspace.aldor.editor.Expression;
import com.euclideanspace.aldor.editor.Flow_AnyStatement;
import com.euclideanspace.aldor.editor.Flow_BalStatement;
import com.euclideanspace.aldor.editor.ForLhs;
import com.euclideanspace.aldor.editor.FromPart;
import com.euclideanspace.aldor.editor.GenBound;
import com.euclideanspace.aldor.editor.Id;
import com.euclideanspace.aldor.editor.Infixed;
import com.euclideanspace.aldor.editor.InfixedExpr;
import com.euclideanspace.aldor.editor.InfixedExprs;
import com.euclideanspace.aldor.editor.InfixedExprsDecl;
import com.euclideanspace.aldor.editor.Iterator;
import com.euclideanspace.aldor.editor.Iterators;
import com.euclideanspace.aldor.editor.Iterators1;
import com.euclideanspace.aldor.editor.Jleft_Atom;
import com.euclideanspace.aldor.editor.Jleft_Molecule;
import com.euclideanspace.aldor.editor.Jright_Atom;
import com.euclideanspace.aldor.editor.Labeled;
import com.euclideanspace.aldor.editor.LatticeOp;
import com.euclideanspace.aldor.editor.LatticeTok;
import com.euclideanspace.aldor.editor.LeftJuxtaposed;
import com.euclideanspace.aldor.editor.MacroBody;
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
import com.euclideanspace.aldor.editor.QualOp_SegTok;
import com.euclideanspace.aldor.editor.QualOp_TimesTok;
import com.euclideanspace.aldor.editor.QualTail;
import com.euclideanspace.aldor.editor.QuotedIds;
import com.euclideanspace.aldor.editor.QuotientOp;
import com.euclideanspace.aldor.editor.QuotientTok;
import com.euclideanspace.aldor.editor.RelationTok;
import com.euclideanspace.aldor.editor.SegOp;
import com.euclideanspace.aldor.editor.SegTok;
import com.euclideanspace.aldor.editor.Sig;
import com.euclideanspace.aldor.editor.SuchthatPart;
import com.euclideanspace.aldor.editor.TimesOp;
import com.euclideanspace.aldor.editor.TimesTok;
import com.euclideanspace.aldor.editor.ToPart;
import com.euclideanspace.aldor.editor.Type;
import com.euclideanspace.aldor.editor.UnqualOp_ArrowTok;
import com.euclideanspace.aldor.editor.UnqualOp_LatticeTok;
import com.euclideanspace.aldor.editor.UnqualOp_PlusTok;
import com.euclideanspace.aldor.editor.UnqualOp_PowerTok;
import com.euclideanspace.aldor.editor.UnqualOp_QuotientTok;
import com.euclideanspace.aldor.editor.UnqualOp_RelationTok;
import com.euclideanspace.aldor.editor.UnqualOp_SegTok;
import com.euclideanspace.aldor.editor.UnqualOp_TimesTok;
import com.euclideanspace.aldor.editor.enlist1_CommaItem_Comma_AB;
import com.euclideanspace.aldor.editor.enlist1_InfixedExpr_Comma_AB;
import com.euclideanspace.aldor.editor.enlist1_Infixed_Comma_AB;
import com.euclideanspace.aldor.editor.enlist1a_Labeled_Semicolon_AB;
import com.euclideanspace.aldor.editor.enlister1_CommaItem_Comma;
import com.euclideanspace.aldor.editor.enlister1_InfixedExpr_Comma;
import com.euclideanspace.aldor.editor.enlister1_Infixed_Comma;
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
  private EClass declarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exportDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass toPartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fromPartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass macroBodyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sigEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass declPartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass commaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass commaItemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass declBindingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass infixedExprsDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass infixedExprsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass binding_AnyStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass binding_BalStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass binding_CollectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bindingL_Infixed_AnyStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bindingL_Infixed_BalStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bindingL_Infixed_CollectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bindingR_InfixedExprsDecl_AnyStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass anyStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass balStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass flow_AnyStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass flow_BalStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass genBoundEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass butExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass casesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alwaysPart_AnyStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alwaysPart_BalStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass collectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass iteratorsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass iterators1EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass iteratorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass forLhsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass suchthatPartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass infixedEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass infixedExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass e12EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass e13EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass qualTailEClass = null;

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
  private EClass e14EClass = null;

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
  private EClass leftJuxtaposedEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass jright_AtomEClass = null;

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
  private EClass declMoleculeEClass = null;

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
  private EClass blockEClass = null;

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
  private EClass enlist1_CommaItem_Comma_ABEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enlist1_Infixed_Comma_ABEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enlist1_InfixedExpr_Comma_ABEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enlister1_CommaItem_CommaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enlister1_Infixed_CommaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enlister1_InfixedExpr_CommaEClass = null;

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
  private EClass curlyContentB_LabeledEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass e3EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass e4EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass e5EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass e6EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass e7EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass e8EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass e9EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass e11_E12EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass e11_OpEClass = null;

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
  public EAttribute getModel_Insert()
  {
    return (EAttribute)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Cc()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(1);
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
  public EClass getDeclaration()
  {
    return declarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeclaration_Fp()
  {
    return (EReference)declarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExportDecl()
  {
    return exportDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExportDecl_Tp()
  {
    return (EReference)exportDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getToPart()
  {
    return toPartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFromPart()
  {
    return fromPartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMacroBody()
  {
    return macroBodyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSig()
  {
    return sigEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeclPart()
  {
    return declPartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComma()
  {
    return commaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCommaItem()
  {
    return commaItemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCommaItem_Bas()
  {
    return (EReference)commaItemEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCommaItem_Bbs()
  {
    return (EReference)commaItemEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCommaItem_Bbs2()
  {
    return (EReference)commaItemEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCommaItem_Ci()
  {
    return (EReference)commaItemEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeclBinding()
  {
    return declBindingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInfixedExprsDecl()
  {
    return infixedExprsDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInfixedExprsDecl_Bas()
  {
    return (EReference)infixedExprsDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInfixedExprs()
  {
    return infixedExprsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInfixedExprs_Dp()
  {
    return (EReference)infixedExprsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBinding_AnyStatement()
  {
    return binding_AnyStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinding_AnyStatement_Be()
  {
    return (EReference)binding_AnyStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinding_AnyStatement_Apa()
  {
    return (EReference)binding_AnyStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinding_AnyStatement_C()
  {
    return (EReference)binding_AnyStatementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinding_AnyStatement_Apb()
  {
    return (EReference)binding_AnyStatementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBinding_BalStatement()
  {
    return binding_BalStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBinding_Collection()
  {
    return binding_CollectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBindingL_Infixed_AnyStatement()
  {
    return bindingL_Infixed_AnyStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBindingL_Infixed_AnyStatement_Bas9()
  {
    return (EReference)bindingL_Infixed_AnyStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBindingL_Infixed_BalStatement()
  {
    return bindingL_Infixed_BalStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBindingL_Infixed_Collection()
  {
    return bindingL_Infixed_CollectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBindingR_InfixedExprsDecl_AnyStatement()
  {
    return bindingR_InfixedExprsDecl_AnyStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAnyStatement()
  {
    return anyStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBalStatement()
  {
    return balStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFlow_AnyStatement()
  {
    return flow_AnyStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFlow_BalStatement()
  {
    return flow_BalStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFlow_BalStatement_Bbs5()
  {
    return (EReference)flow_BalStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGenBound()
  {
    return genBoundEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGenBound_Bas4()
  {
    return (EReference)genBoundEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getButExpr()
  {
    return butExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getButExpr_Db()
  {
    return (EReference)butExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getButExpr_Ca()
  {
    return (EReference)butExprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCases()
  {
    return casesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAlwaysPart_AnyStatement()
  {
    return alwaysPart_AnyStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAlwaysPart_BalStatement()
  {
    return alwaysPart_BalStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCollection()
  {
    return collectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCollection_Bas2()
  {
    return (EReference)collectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCollection_Bbs3()
  {
    return (EReference)collectionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIterators()
  {
    return iteratorsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIterators_Bas3()
  {
    return (EReference)iteratorsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIterators_Bbs4()
  {
    return (EReference)iteratorsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIterators1()
  {
    return iterators1EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIterators1_Itr()
  {
    return (EReference)iterators1EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIterator()
  {
    return iteratorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIterator_I()
  {
    return (EReference)iteratorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getForLhs()
  {
    return forLhsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getForLhs_Sp()
  {
    return (EReference)forLhsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSuchthatPart()
  {
    return suchthatPartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInfixed()
  {
    return infixedEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInfixed_Bia()
  {
    return (EReference)infixedEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInfixed_Bib()
  {
    return (EReference)infixedEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInfixed_Bic()
  {
    return (EReference)infixedEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInfixed_I3()
  {
    return (EReference)infixedEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInfixed_Ifx()
  {
    return (EReference)infixedEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInfixed_Dp()
  {
    return (EReference)infixedEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInfixed_B()
  {
    return (EReference)infixedEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInfixed_I2()
  {
    return (EReference)infixedEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInfixedExpr()
  {
    return infixedExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInfixedExpr_Ie()
  {
    return (EReference)infixedExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpr()
  {
    return exprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpr_Left()
  {
    return (EReference)exprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpr_Right()
  {
    return (EReference)exprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpr_Op5()
  {
    return (EReference)exprEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getType()
  {
    return typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getE12()
  {
    return e12EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getE12_Left()
  {
    return (EReference)e12EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getE12_Op()
  {
    return (EReference)e12EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getE12_Right()
  {
    return (EReference)e12EClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getE13()
  {
    return e13EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getE13_Left()
  {
    return (EReference)e13EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getE13_Op()
  {
    return (EAttribute)e13EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getE13_Right()
  {
    return (EReference)e13EClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQualTail()
  {
    return qualTailEClass;
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
  public EClass getE14()
  {
    return e14EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getE14_E15left()
  {
    return (EAttribute)e14EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getE14_Dm()
  {
    return (EReference)e14EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getE14_E15right()
  {
    return (EAttribute)e14EClass.getEStructuralFeatures().get(2);
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
  public EClass getLeftJuxtaposed()
  {
    return leftJuxtaposedEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLeftJuxtaposed_Qt()
  {
    return (EReference)leftJuxtaposedEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJright_Atom()
  {
    return jright_AtomEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJright_Atom_Right2()
  {
    return (EReference)jright_AtomEClass.getEStructuralFeatures().get(0);
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
  public EReference getJleft_Molecule_Be()
  {
    return (EReference)jleft_MoleculeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJleft_Molecule_M()
  {
    return (EReference)jleft_MoleculeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJleft_Molecule_Bm()
  {
    return (EReference)jleft_MoleculeEClass.getEStructuralFeatures().get(2);
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
  public EClass getEnclosure()
  {
    return enclosureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeclMolecule()
  {
    return declMoleculeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeclMolecule_A()
  {
    return (EAttribute)declMoleculeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeclMolecule_B()
  {
    return (EReference)declMoleculeEClass.getEStructuralFeatures().get(1);
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
  public EClass getBlock()
  {
    return blockEClass;
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
  public EClass getenlist1_CommaItem_Comma_AB()
  {
    return enlist1_CommaItem_Comma_ABEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getenlist1_Infixed_Comma_AB()
  {
    return enlist1_Infixed_Comma_ABEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getenlist1_InfixedExpr_Comma_AB()
  {
    return enlist1_InfixedExpr_Comma_ABEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getenlister1_CommaItem_Comma()
  {
    return enlister1_CommaItem_CommaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getenlister1_Infixed_Comma()
  {
    return enlister1_Infixed_CommaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getenlister1_InfixedExpr_Comma()
  {
    return enlister1_InfixedExpr_CommaEClass;
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
  public EClass getCurlyContentB_Labeled()
  {
    return curlyContentB_LabeledEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCurlyContentB_Labeled_Pred()
  {
    return (EAttribute)curlyContentB_LabeledEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCurlyContentB_Labeled_L()
  {
    return (EReference)curlyContentB_LabeledEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCurlyContentB_Labeled_Pd()
  {
    return (EAttribute)curlyContentB_LabeledEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getE3()
  {
    return e3EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getE3_Op()
  {
    return (EAttribute)e3EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getE3_Op2()
  {
    return (EReference)e3EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getE4()
  {
    return e4EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getE4_Op()
  {
    return (EAttribute)e4EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getE4_Op2()
  {
    return (EAttribute)e4EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getE5()
  {
    return e5EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getE6()
  {
    return e6EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getE6_Op6()
  {
    return (EReference)e6EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getE7()
  {
    return e7EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getE7_Op7()
  {
    return (EReference)e7EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getE8()
  {
    return e8EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getE8_Op8()
  {
    return (EReference)e8EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getE9()
  {
    return e9EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getE9_Op9()
  {
    return (EReference)e9EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getE11_E12()
  {
    return e11_E12EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getE11_E12_Op()
  {
    return (EAttribute)e11_E12EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getE11_Op()
  {
    return e11_OpEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getE11_Op_Op()
  {
    return (EAttribute)e11_OpEClass.getEStructuralFeatures().get(0);
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
    createEAttribute(modelEClass, MODEL__INSERT);
    createEReference(modelEClass, MODEL__CC);

    expressionEClass = createEClass(EXPRESSION);

    labeledEClass = createEClass(LABELED);

    declarationEClass = createEClass(DECLARATION);
    createEReference(declarationEClass, DECLARATION__FP);

    exportDeclEClass = createEClass(EXPORT_DECL);
    createEReference(exportDeclEClass, EXPORT_DECL__TP);

    toPartEClass = createEClass(TO_PART);

    fromPartEClass = createEClass(FROM_PART);

    macroBodyEClass = createEClass(MACRO_BODY);

    sigEClass = createEClass(SIG);

    declPartEClass = createEClass(DECL_PART);

    commaEClass = createEClass(COMMA);

    commaItemEClass = createEClass(COMMA_ITEM);
    createEReference(commaItemEClass, COMMA_ITEM__BAS);
    createEReference(commaItemEClass, COMMA_ITEM__BBS);
    createEReference(commaItemEClass, COMMA_ITEM__BBS2);
    createEReference(commaItemEClass, COMMA_ITEM__CI);

    declBindingEClass = createEClass(DECL_BINDING);

    infixedExprsDeclEClass = createEClass(INFIXED_EXPRS_DECL);
    createEReference(infixedExprsDeclEClass, INFIXED_EXPRS_DECL__BAS);

    infixedExprsEClass = createEClass(INFIXED_EXPRS);
    createEReference(infixedExprsEClass, INFIXED_EXPRS__DP);

    binding_AnyStatementEClass = createEClass(BINDING_ANY_STATEMENT);
    createEReference(binding_AnyStatementEClass, BINDING_ANY_STATEMENT__BE);
    createEReference(binding_AnyStatementEClass, BINDING_ANY_STATEMENT__APA);
    createEReference(binding_AnyStatementEClass, BINDING_ANY_STATEMENT__C);
    createEReference(binding_AnyStatementEClass, BINDING_ANY_STATEMENT__APB);

    binding_BalStatementEClass = createEClass(BINDING_BAL_STATEMENT);

    binding_CollectionEClass = createEClass(BINDING_COLLECTION);

    bindingL_Infixed_AnyStatementEClass = createEClass(BINDING_LINFIXED_ANY_STATEMENT);
    createEReference(bindingL_Infixed_AnyStatementEClass, BINDING_LINFIXED_ANY_STATEMENT__BAS9);

    bindingL_Infixed_BalStatementEClass = createEClass(BINDING_LINFIXED_BAL_STATEMENT);

    bindingL_Infixed_CollectionEClass = createEClass(BINDING_LINFIXED_COLLECTION);

    bindingR_InfixedExprsDecl_AnyStatementEClass = createEClass(BINDING_RINFIXED_EXPRS_DECL_ANY_STATEMENT);

    anyStatementEClass = createEClass(ANY_STATEMENT);

    balStatementEClass = createEClass(BAL_STATEMENT);

    flow_AnyStatementEClass = createEClass(FLOW_ANY_STATEMENT);

    flow_BalStatementEClass = createEClass(FLOW_BAL_STATEMENT);
    createEReference(flow_BalStatementEClass, FLOW_BAL_STATEMENT__BBS5);

    genBoundEClass = createEClass(GEN_BOUND);
    createEReference(genBoundEClass, GEN_BOUND__BAS4);

    butExprEClass = createEClass(BUT_EXPR);
    createEReference(butExprEClass, BUT_EXPR__DB);
    createEReference(butExprEClass, BUT_EXPR__CA);

    casesEClass = createEClass(CASES);

    alwaysPart_AnyStatementEClass = createEClass(ALWAYS_PART_ANY_STATEMENT);

    alwaysPart_BalStatementEClass = createEClass(ALWAYS_PART_BAL_STATEMENT);

    collectionEClass = createEClass(COLLECTION);
    createEReference(collectionEClass, COLLECTION__BAS2);
    createEReference(collectionEClass, COLLECTION__BBS3);

    iteratorsEClass = createEClass(ITERATORS);
    createEReference(iteratorsEClass, ITERATORS__BAS3);
    createEReference(iteratorsEClass, ITERATORS__BBS4);

    iterators1EClass = createEClass(ITERATORS1);
    createEReference(iterators1EClass, ITERATORS1__ITR);

    iteratorEClass = createEClass(ITERATOR);
    createEReference(iteratorEClass, ITERATOR__I);

    forLhsEClass = createEClass(FOR_LHS);
    createEReference(forLhsEClass, FOR_LHS__SP);

    suchthatPartEClass = createEClass(SUCHTHAT_PART);

    infixedEClass = createEClass(INFIXED);
    createEReference(infixedEClass, INFIXED__BIA);
    createEReference(infixedEClass, INFIXED__BIB);
    createEReference(infixedEClass, INFIXED__BIC);
    createEReference(infixedEClass, INFIXED__I3);
    createEReference(infixedEClass, INFIXED__IFX);
    createEReference(infixedEClass, INFIXED__DP);
    createEReference(infixedEClass, INFIXED__B);
    createEReference(infixedEClass, INFIXED__I2);

    infixedExprEClass = createEClass(INFIXED_EXPR);
    createEReference(infixedExprEClass, INFIXED_EXPR__IE);

    exprEClass = createEClass(EXPR);
    createEReference(exprEClass, EXPR__LEFT);
    createEReference(exprEClass, EXPR__RIGHT);
    createEReference(exprEClass, EXPR__OP5);

    typeEClass = createEClass(TYPE);

    e12EClass = createEClass(E12);
    createEReference(e12EClass, E12__LEFT);
    createEReference(e12EClass, E12__OP);
    createEReference(e12EClass, E12__RIGHT);

    e13EClass = createEClass(E13);
    createEReference(e13EClass, E13__LEFT);
    createEAttribute(e13EClass, E13__OP);
    createEReference(e13EClass, E13__RIGHT);

    qualTailEClass = createEClass(QUAL_TAIL);

    opQualTailEClass = createEClass(OP_QUAL_TAIL);
    createEReference(opQualTailEClass, OP_QUAL_TAIL__NAME);

    e14EClass = createEClass(E14);
    createEAttribute(e14EClass, E14__E15LEFT);
    createEReference(e14EClass, E14__DM);
    createEAttribute(e14EClass, E14__E15RIGHT);

    opEClass = createEClass(OP);

    nakedOpEClass = createEClass(NAKED_OP);

    arrowOpEClass = createEClass(ARROW_OP);

    latticeOpEClass = createEClass(LATTICE_OP);

    segOpEClass = createEClass(SEG_OP);

    plusOpEClass = createEClass(PLUS_OP);

    quotientOpEClass = createEClass(QUOTIENT_OP);

    timesOpEClass = createEClass(TIMES_OP);

    powerOpEClass = createEClass(POWER_OP);

    leftJuxtaposedEClass = createEClass(LEFT_JUXTAPOSED);
    createEReference(leftJuxtaposedEClass, LEFT_JUXTAPOSED__QT);

    jright_AtomEClass = createEClass(JRIGHT_ATOM);
    createEReference(jright_AtomEClass, JRIGHT_ATOM__RIGHT2);

    jleft_MoleculeEClass = createEClass(JLEFT_MOLECULE);
    createEReference(jleft_MoleculeEClass, JLEFT_MOLECULE__BE);
    createEReference(jleft_MoleculeEClass, JLEFT_MOLECULE__M);
    createEReference(jleft_MoleculeEClass, JLEFT_MOLECULE__BM);

    jleft_AtomEClass = createEClass(JLEFT_ATOM);

    moleculeEClass = createEClass(MOLECULE);

    enclosureEClass = createEClass(ENCLOSURE);

    declMoleculeEClass = createEClass(DECL_MOLECULE);
    createEAttribute(declMoleculeEClass, DECL_MOLECULE__A);
    createEReference(declMoleculeEClass, DECL_MOLECULE__B);

    blockMoleculeEClass = createEClass(BLOCK_MOLECULE);

    blockEnclosureEClass = createEClass(BLOCK_ENCLOSURE);

    blockEClass = createEClass(BLOCK);

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

    qualOp_SegTokEClass = createEClass(QUAL_OP_SEG_TOK);

    qualOp_PlusTokEClass = createEClass(QUAL_OP_PLUS_TOK);

    qualOp_QuotientTokEClass = createEClass(QUAL_OP_QUOTIENT_TOK);

    qualOp_TimesTokEClass = createEClass(QUAL_OP_TIMES_TOK);

    qualOp_PowerTokEClass = createEClass(QUAL_OP_POWER_TOK);

    enlist1_CommaItem_Comma_ABEClass = createEClass(ENLIST1_COMMA_ITEM_COMMA_AB);

    enlist1_Infixed_Comma_ABEClass = createEClass(ENLIST1_INFIXED_COMMA_AB);

    enlist1_InfixedExpr_Comma_ABEClass = createEClass(ENLIST1_INFIXED_EXPR_COMMA_AB);

    enlister1_CommaItem_CommaEClass = createEClass(ENLISTER1_COMMA_ITEM_COMMA);

    enlister1_Infixed_CommaEClass = createEClass(ENLISTER1_INFIXED_COMMA);

    enlister1_InfixedExpr_CommaEClass = createEClass(ENLISTER1_INFIXED_EXPR_COMMA);

    enlist1a_Labeled_Semicolon_ABEClass = createEClass(ENLIST1A_LABELED_SEMICOLON_AB);

    enlister1a_Labeled_SemicolonEClass = createEClass(ENLISTER1A_LABELED_SEMICOLON);
    createEReference(enlister1a_Labeled_SemicolonEClass, ENLISTER1A_LABELED_SEMICOLON__STATEMNTS);

    curly_LabeledEClass = createEClass(CURLY_LABELED);

    curlyContents_LabeledEClass = createEClass(CURLY_CONTENTS_LABELED);

    curlyContentsList_LabeledEClass = createEClass(CURLY_CONTENTS_LIST_LABELED);
    createEReference(curlyContentsList_LabeledEClass, CURLY_CONTENTS_LIST_LABELED__STATEMTS);

    curlyContentB_LabeledEClass = createEClass(CURLY_CONTENT_BLABELED);
    createEAttribute(curlyContentB_LabeledEClass, CURLY_CONTENT_BLABELED__PRED);
    createEReference(curlyContentB_LabeledEClass, CURLY_CONTENT_BLABELED__L);
    createEAttribute(curlyContentB_LabeledEClass, CURLY_CONTENT_BLABELED__PD);

    e3EClass = createEClass(E3);
    createEAttribute(e3EClass, E3__OP);
    createEReference(e3EClass, E3__OP2);

    e4EClass = createEClass(E4);
    createEAttribute(e4EClass, E4__OP);
    createEAttribute(e4EClass, E4__OP2);

    e5EClass = createEClass(E5);

    e6EClass = createEClass(E6);
    createEReference(e6EClass, E6__OP6);

    e7EClass = createEClass(E7);
    createEReference(e7EClass, E7__OP7);

    e8EClass = createEClass(E8);
    createEReference(e8EClass, E8__OP8);

    e9EClass = createEClass(E9);
    createEReference(e9EClass, E9__OP9);

    e11_E12EClass = createEClass(E11_E12);
    createEAttribute(e11_E12EClass, E11_E12__OP);

    e11_OpEClass = createEClass(E11_OP);
    createEAttribute(e11_OpEClass, E11_OP__OP);

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
    declarationEClass.getESuperTypes().add(this.getLabeled());
    exportDeclEClass.getESuperTypes().add(this.getDeclaration());
    exportDeclEClass.getESuperTypes().add(this.getMacroBody());
    macroBodyEClass.getESuperTypes().add(this.getDeclaration());
    sigEClass.getESuperTypes().add(this.getDeclaration());
    sigEClass.getESuperTypes().add(this.getExportDecl());
    sigEClass.getESuperTypes().add(this.getMacroBody());
    commaEClass.getESuperTypes().add(this.getLabeled());
    commaItemEClass.getESuperTypes().add(this.getAnyStatement());
    commaItemEClass.getESuperTypes().add(this.getFlow_AnyStatement());
    commaItemEClass.getESuperTypes().add(this.getFlow_BalStatement());
    commaItemEClass.getESuperTypes().add(this.getGenBound());
    commaItemEClass.getESuperTypes().add(this.getenlister1_CommaItem_Comma());
    declBindingEClass.getESuperTypes().add(this.getSig());
    infixedExprsDeclEClass.getESuperTypes().add(this.getBindingR_InfixedExprsDecl_AnyStatement());
    infixedExprsEClass.getESuperTypes().add(this.getInfixedExprsDecl());
    binding_AnyStatementEClass.getESuperTypes().add(this.getCommaItem());
    binding_AnyStatementEClass.getESuperTypes().add(this.getAlwaysPart_AnyStatement());
    binding_BalStatementEClass.getESuperTypes().add(this.getAlwaysPart_BalStatement());
    binding_CollectionEClass.getESuperTypes().add(this.getCases());
    bindingL_Infixed_AnyStatementEClass.getESuperTypes().add(this.getBinding_AnyStatement());
    bindingL_Infixed_BalStatementEClass.getESuperTypes().add(this.getBinding_BalStatement());
    bindingL_Infixed_CollectionEClass.getESuperTypes().add(this.getBinding_Collection());
    bindingR_InfixedExprsDecl_AnyStatementEClass.getESuperTypes().add(this.getDeclBinding());
    balStatementEClass.getESuperTypes().add(this.getBindingL_Infixed_BalStatement());
    flow_AnyStatementEClass.getESuperTypes().add(this.getAnyStatement());
    flow_BalStatementEClass.getESuperTypes().add(this.getBalStatement());
    genBoundEClass.getESuperTypes().add(this.getFlow_AnyStatement());
    genBoundEClass.getESuperTypes().add(this.getFlow_BalStatement());
    collectionEClass.getESuperTypes().add(this.getBindingL_Infixed_Collection());
    collectionEClass.getESuperTypes().add(this.getFlow_AnyStatement());
    collectionEClass.getESuperTypes().add(this.getFlow_BalStatement());
    iteratorsEClass.getESuperTypes().add(this.getFlow_AnyStatement());
    iteratorsEClass.getESuperTypes().add(this.getFlow_BalStatement());
    iterators1EClass.getESuperTypes().add(this.getIterators());
    forLhsEClass.getESuperTypes().add(this.getIterator());
    infixedEClass.getESuperTypes().add(this.getToPart());
    infixedEClass.getESuperTypes().add(this.getBindingL_Infixed_AnyStatement());
    infixedEClass.getESuperTypes().add(this.getBindingL_Infixed_BalStatement());
    infixedEClass.getESuperTypes().add(this.getBindingL_Infixed_Collection());
    infixedEClass.getESuperTypes().add(this.getCollection());
    infixedEClass.getESuperTypes().add(this.getForLhs());
    infixedEClass.getESuperTypes().add(this.getSuchthatPart());
    infixedEClass.getESuperTypes().add(this.getenlister1_Infixed_Comma());
    infixedExprEClass.getESuperTypes().add(this.getenlister1_InfixedExpr_Comma());
    exprEClass.getESuperTypes().add(this.getInfixedExpr());
    exprEClass.getESuperTypes().add(this.getType());
    typeEClass.getESuperTypes().add(this.getDeclPart());
    opQualTailEClass.getESuperTypes().add(this.getQualOp_ArrowTok());
    opQualTailEClass.getESuperTypes().add(this.getQualOp_LatticeTok());
    opQualTailEClass.getESuperTypes().add(this.getQualOp_SegTok());
    opQualTailEClass.getESuperTypes().add(this.getQualOp_PlusTok());
    opQualTailEClass.getESuperTypes().add(this.getQualOp_QuotientTok());
    opQualTailEClass.getESuperTypes().add(this.getQualOp_TimesTok());
    opQualTailEClass.getESuperTypes().add(this.getQualOp_PowerTok());
    nakedOpEClass.getESuperTypes().add(this.getName_());
    arrowOpEClass.getESuperTypes().add(this.getOp());
    latticeOpEClass.getESuperTypes().add(this.getOp());
    segOpEClass.getESuperTypes().add(this.getOp());
    plusOpEClass.getESuperTypes().add(this.getOp());
    quotientOpEClass.getESuperTypes().add(this.getOp());
    timesOpEClass.getESuperTypes().add(this.getOp());
    powerOpEClass.getESuperTypes().add(this.getOp());
    leftJuxtaposedEClass.getESuperTypes().add(this.getQualTail());
    jleft_MoleculeEClass.getESuperTypes().add(this.getLeftJuxtaposed());
    jleft_AtomEClass.getESuperTypes().add(this.getJright_Atom());
    enclosureEClass.getESuperTypes().add(this.getMolecule());
    enclosureEClass.getESuperTypes().add(this.getBlockMolecule());
    enclosureEClass.getESuperTypes().add(this.getBlockEnclosure());
    blockEnclosureEClass.getESuperTypes().add(this.getJleft_Atom());
    blockEClass.getESuperTypes().add(this.getSig());
    blockEClass.getESuperTypes().add(this.getBlockMolecule());
    blockEClass.getESuperTypes().add(this.getBlockEnclosure());
    parenedEClass.getESuperTypes().add(this.getEnclosure());
    bracketedEClass.getESuperTypes().add(this.getEnclosure());
    quotedIdsEClass.getESuperTypes().add(this.getEnclosure());
    namesEClass.getESuperTypes().add(this.getQuotedIds());
    atomEClass.getESuperTypes().add(this.getLabeled());
    atomEClass.getESuperTypes().add(this.getJleft_Atom());
    atomEClass.getESuperTypes().add(this.getMolecule());
    atomEClass.getESuperTypes().add(this.getBlockMolecule());
    nameEClass.getESuperTypes().add(this.getFlow_AnyStatement());
    nameEClass.getESuperTypes().add(this.getFlow_BalStatement());
    idEClass.getESuperTypes().add(this.getFlow_AnyStatement());
    idEClass.getESuperTypes().add(this.getFlow_BalStatement());
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
    qualOp_SegTokEClass.getESuperTypes().add(this.getSegOp());
    qualOp_PlusTokEClass.getESuperTypes().add(this.getPlusOp());
    qualOp_QuotientTokEClass.getESuperTypes().add(this.getQuotientOp());
    qualOp_TimesTokEClass.getESuperTypes().add(this.getTimesOp());
    qualOp_PowerTokEClass.getESuperTypes().add(this.getPowerOp());
    enlist1_CommaItem_Comma_ABEClass.getESuperTypes().add(this.getComma());
    enlist1_Infixed_Comma_ABEClass.getESuperTypes().add(this.getFromPart());
    enlist1_InfixedExpr_Comma_ABEClass.getESuperTypes().add(this.getInfixedExprs());
    enlister1_CommaItem_CommaEClass.getESuperTypes().add(this.getenlist1_CommaItem_Comma_AB());
    enlister1_Infixed_CommaEClass.getESuperTypes().add(this.getenlist1_Infixed_Comma_AB());
    enlister1_InfixedExpr_CommaEClass.getESuperTypes().add(this.getenlist1_InfixedExpr_Comma_AB());
    enlist1a_Labeled_Semicolon_ABEClass.getESuperTypes().add(this.getExpression());
    enlister1a_Labeled_SemicolonEClass.getESuperTypes().add(this.getenlist1a_Labeled_Semicolon_AB());
    curly_LabeledEClass.getESuperTypes().add(this.getBlock());
    curlyContents_LabeledEClass.getESuperTypes().add(this.getCurly_Labeled());
    curlyContentsList_LabeledEClass.getESuperTypes().add(this.getCurlyContents_Labeled());
    e3EClass.getESuperTypes().add(this.getExpr());
    e4EClass.getESuperTypes().add(this.getExpr());
    e5EClass.getESuperTypes().add(this.getExpr());
    e6EClass.getESuperTypes().add(this.getExpr());
    e7EClass.getESuperTypes().add(this.getExpr());
    e8EClass.getESuperTypes().add(this.getExpr());
    e9EClass.getESuperTypes().add(this.getExpr());
    e11_E12EClass.getESuperTypes().add(this.getExpr());
    e11_OpEClass.getESuperTypes().add(this.getExpr());
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
    initEAttribute(getModel_Insert(), ecorePackage.getEString(), "insert", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Cc(), this.getCurlyContents_Labeled(), null, "cc", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(labeledEClass, Labeled.class, "Labeled", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(declarationEClass, Declaration.class, "Declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDeclaration_Fp(), this.getFromPart(), null, "fp", null, 0, 1, Declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exportDeclEClass, ExportDecl.class, "ExportDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExportDecl_Tp(), this.getToPart(), null, "tp", null, 0, 1, ExportDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(toPartEClass, ToPart.class, "ToPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(fromPartEClass, FromPart.class, "FromPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(macroBodyEClass, MacroBody.class, "MacroBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(sigEClass, Sig.class, "Sig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(declPartEClass, DeclPart.class, "DeclPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(commaEClass, Comma.class, "Comma", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(commaItemEClass, CommaItem.class, "CommaItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCommaItem_Bas(), this.getBinding_AnyStatement(), null, "bas", null, 0, 1, CommaItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCommaItem_Bbs(), this.getBinding_BalStatement(), null, "bbs", null, 0, 1, CommaItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCommaItem_Bbs2(), this.getBinding_BalStatement(), null, "bbs2", null, 0, 1, CommaItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCommaItem_Ci(), this.getCommaItem(), null, "ci", null, 0, 1, CommaItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(declBindingEClass, DeclBinding.class, "DeclBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(infixedExprsDeclEClass, InfixedExprsDecl.class, "InfixedExprsDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInfixedExprsDecl_Bas(), this.getBinding_AnyStatement(), null, "bas", null, 0, 1, InfixedExprsDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(infixedExprsEClass, InfixedExprs.class, "InfixedExprs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInfixedExprs_Dp(), this.getDeclPart(), null, "dp", null, 0, -1, InfixedExprs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(binding_AnyStatementEClass, Binding_AnyStatement.class, "Binding_AnyStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBinding_AnyStatement_Be(), this.getButExpr(), null, "be", null, 0, 1, Binding_AnyStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBinding_AnyStatement_Apa(), this.getAlwaysPart_AnyStatement(), null, "apa", null, 0, 1, Binding_AnyStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBinding_AnyStatement_C(), this.getCases(), null, "c", null, 0, 1, Binding_AnyStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBinding_AnyStatement_Apb(), this.getAlwaysPart_BalStatement(), null, "apb", null, 0, 1, Binding_AnyStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(binding_BalStatementEClass, Binding_BalStatement.class, "Binding_BalStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(binding_CollectionEClass, Binding_Collection.class, "Binding_Collection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(bindingL_Infixed_AnyStatementEClass, BindingL_Infixed_AnyStatement.class, "BindingL_Infixed_AnyStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBindingL_Infixed_AnyStatement_Bas9(), this.getAnyStatement(), null, "bas9", null, 0, 1, BindingL_Infixed_AnyStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bindingL_Infixed_BalStatementEClass, BindingL_Infixed_BalStatement.class, "BindingL_Infixed_BalStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(bindingL_Infixed_CollectionEClass, BindingL_Infixed_Collection.class, "BindingL_Infixed_Collection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(bindingR_InfixedExprsDecl_AnyStatementEClass, BindingR_InfixedExprsDecl_AnyStatement.class, "BindingR_InfixedExprsDecl_AnyStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(anyStatementEClass, AnyStatement.class, "AnyStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(balStatementEClass, BalStatement.class, "BalStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(flow_AnyStatementEClass, Flow_AnyStatement.class, "Flow_AnyStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(flow_BalStatementEClass, Flow_BalStatement.class, "Flow_BalStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFlow_BalStatement_Bbs5(), this.getBinding_BalStatement(), null, "bbs5", null, 0, 1, Flow_BalStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(genBoundEClass, GenBound.class, "GenBound", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGenBound_Bas4(), this.getBinding_AnyStatement(), null, "bas4", null, 0, 1, GenBound.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(butExprEClass, ButExpr.class, "ButExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getButExpr_Db(), this.getDeclBinding(), null, "db", null, 0, 1, ButExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getButExpr_Ca(), this.getCases(), null, "ca", null, 0, 1, ButExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(casesEClass, Cases.class, "Cases", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(alwaysPart_AnyStatementEClass, AlwaysPart_AnyStatement.class, "AlwaysPart_AnyStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(alwaysPart_BalStatementEClass, AlwaysPart_BalStatement.class, "AlwaysPart_BalStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(collectionEClass, Collection.class, "Collection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCollection_Bas2(), this.getBinding_AnyStatement(), null, "bas2", null, 0, 1, Collection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCollection_Bbs3(), this.getBinding_BalStatement(), null, "bbs3", null, 0, 1, Collection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(iteratorsEClass, Iterators.class, "Iterators", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIterators_Bas3(), this.getBinding_AnyStatement(), null, "bas3", null, 0, 1, Iterators.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIterators_Bbs4(), this.getBinding_BalStatement(), null, "bbs4", null, 0, 1, Iterators.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(iterators1EClass, Iterators1.class, "Iterators1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIterators1_Itr(), this.getIterator(), null, "itr", null, 0, -1, Iterators1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(iteratorEClass, Iterator.class, "Iterator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIterator_I(), this.getInfixed(), null, "i", null, 0, 1, Iterator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(forLhsEClass, ForLhs.class, "ForLhs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getForLhs_Sp(), this.getSuchthatPart(), null, "sp", null, 0, 1, ForLhs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(suchthatPartEClass, SuchthatPart.class, "SuchthatPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(infixedEClass, Infixed.class, "Infixed", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInfixed_Bia(), this.getBindingL_Infixed_AnyStatement(), null, "bia", null, 0, 1, Infixed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInfixed_Bib(), this.getBindingL_Infixed_BalStatement(), null, "bib", null, 0, 1, Infixed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInfixed_Bic(), this.getBindingL_Infixed_Collection(), null, "bic", null, 0, 1, Infixed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInfixed_I3(), this.getIterators(), null, "i3", null, 0, 1, Infixed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInfixed_Ifx(), this.getInfixedExpr(), null, "ifx", null, 0, 1, Infixed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInfixed_Dp(), this.getDeclPart(), null, "dp", null, 0, -1, Infixed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInfixed_B(), this.getBlock(), null, "b", null, 0, 1, Infixed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInfixed_I2(), this.getInfixed(), null, "i2", null, 0, 1, Infixed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(infixedExprEClass, InfixedExpr.class, "InfixedExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInfixedExpr_Ie(), this.getInfixedExpr(), null, "ie", null, 0, 1, InfixedExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exprEClass, Expr.class, "Expr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExpr_Left(), ecorePackage.getEObject(), null, "left", null, 0, 1, Expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpr_Right(), ecorePackage.getEObject(), null, "right", null, 0, 1, Expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpr_Op5(), this.getSegOp(), null, "op5", null, 0, -1, Expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(e12EClass, com.euclideanspace.aldor.editor.E12.class, "E12", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getE12_Left(), ecorePackage.getEObject(), null, "left", null, 0, 1, com.euclideanspace.aldor.editor.E12.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getE12_Op(), this.getArrowOp(), null, "op", null, 0, -1, com.euclideanspace.aldor.editor.E12.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getE12_Right(), this.getE13(), null, "right", null, 0, 1, com.euclideanspace.aldor.editor.E12.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(e13EClass, com.euclideanspace.aldor.editor.E13.class, "E13", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getE13_Left(), ecorePackage.getEObject(), null, "left", null, 0, 1, com.euclideanspace.aldor.editor.E13.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getE13_Op(), ecorePackage.getEString(), "op", null, 0, -1, com.euclideanspace.aldor.editor.E13.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getE13_Right(), this.getQualTail(), null, "right", null, 0, 1, com.euclideanspace.aldor.editor.E13.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(qualTailEClass, QualTail.class, "QualTail", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(opQualTailEClass, OpQualTail.class, "OpQualTail", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOpQualTail_Name(), this.getMolecule(), null, "name", null, 0, 1, OpQualTail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(e14EClass, com.euclideanspace.aldor.editor.E14.class, "E14", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getE14_E15left(), ecorePackage.getEString(), "e15left", null, 0, 1, com.euclideanspace.aldor.editor.E14.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getE14_Dm(), this.getDeclMolecule(), null, "dm", null, 0, 1, com.euclideanspace.aldor.editor.E14.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getE14_E15right(), ecorePackage.getEString(), "e15right", null, 0, 1, com.euclideanspace.aldor.editor.E14.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(opEClass, Op.class, "Op", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(nakedOpEClass, NakedOp.class, "NakedOp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(arrowOpEClass, ArrowOp.class, "ArrowOp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(latticeOpEClass, LatticeOp.class, "LatticeOp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(segOpEClass, SegOp.class, "SegOp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(plusOpEClass, PlusOp.class, "PlusOp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(quotientOpEClass, QuotientOp.class, "QuotientOp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(timesOpEClass, TimesOp.class, "TimesOp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(powerOpEClass, PowerOp.class, "PowerOp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(leftJuxtaposedEClass, LeftJuxtaposed.class, "LeftJuxtaposed", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLeftJuxtaposed_Qt(), this.getQualTail(), null, "qt", null, 0, 1, LeftJuxtaposed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(jright_AtomEClass, Jright_Atom.class, "Jright_Atom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getJright_Atom_Right2(), this.getJright_Atom(), null, "right2", null, 0, 1, Jright_Atom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(jleft_MoleculeEClass, Jleft_Molecule.class, "Jleft_Molecule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getJleft_Molecule_Be(), this.getBlockEnclosure(), null, "be", null, 0, 1, Jleft_Molecule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getJleft_Molecule_M(), this.getMolecule(), null, "m", null, 0, 1, Jleft_Molecule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getJleft_Molecule_Bm(), this.getBlockMolecule(), null, "bm", null, 0, -1, Jleft_Molecule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(jleft_AtomEClass, Jleft_Atom.class, "Jleft_Atom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(moleculeEClass, Molecule.class, "Molecule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(enclosureEClass, Enclosure.class, "Enclosure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(declMoleculeEClass, DeclMolecule.class, "DeclMolecule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDeclMolecule_A(), ecorePackage.getEString(), "a", null, 0, 1, DeclMolecule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDeclMolecule_B(), this.getBlock(), null, "b", null, 0, 1, DeclMolecule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(blockMoleculeEClass, BlockMolecule.class, "BlockMolecule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(blockEnclosureEClass, BlockEnclosure.class, "BlockEnclosure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(blockEClass, Block.class, "Block", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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

    initEClass(qualOp_SegTokEClass, QualOp_SegTok.class, "QualOp_SegTok", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(qualOp_PlusTokEClass, QualOp_PlusTok.class, "QualOp_PlusTok", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(qualOp_QuotientTokEClass, QualOp_QuotientTok.class, "QualOp_QuotientTok", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(qualOp_TimesTokEClass, QualOp_TimesTok.class, "QualOp_TimesTok", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(qualOp_PowerTokEClass, QualOp_PowerTok.class, "QualOp_PowerTok", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(enlist1_CommaItem_Comma_ABEClass, enlist1_CommaItem_Comma_AB.class, "enlist1_CommaItem_Comma_AB", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(enlist1_Infixed_Comma_ABEClass, enlist1_Infixed_Comma_AB.class, "enlist1_Infixed_Comma_AB", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(enlist1_InfixedExpr_Comma_ABEClass, enlist1_InfixedExpr_Comma_AB.class, "enlist1_InfixedExpr_Comma_AB", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(enlister1_CommaItem_CommaEClass, enlister1_CommaItem_Comma.class, "enlister1_CommaItem_Comma", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(enlister1_Infixed_CommaEClass, enlister1_Infixed_Comma.class, "enlister1_Infixed_Comma", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(enlister1_InfixedExpr_CommaEClass, enlister1_InfixedExpr_Comma.class, "enlister1_InfixedExpr_Comma", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(enlist1a_Labeled_Semicolon_ABEClass, enlist1a_Labeled_Semicolon_AB.class, "enlist1a_Labeled_Semicolon_AB", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(enlister1a_Labeled_SemicolonEClass, enlister1a_Labeled_Semicolon.class, "enlister1a_Labeled_Semicolon", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getenlister1a_Labeled_Semicolon_Statemnts(), this.getLabeled(), null, "statemnts", null, 0, -1, enlister1a_Labeled_Semicolon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(curly_LabeledEClass, Curly_Labeled.class, "Curly_Labeled", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(curlyContents_LabeledEClass, CurlyContents_Labeled.class, "CurlyContents_Labeled", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(curlyContentsList_LabeledEClass, CurlyContentsList_Labeled.class, "CurlyContentsList_Labeled", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCurlyContentsList_Labeled_Statemts(), this.getCurlyContentB_Labeled(), null, "statemts", null, 0, -1, CurlyContentsList_Labeled.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(curlyContentB_LabeledEClass, CurlyContentB_Labeled.class, "CurlyContentB_Labeled", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCurlyContentB_Labeled_Pred(), ecorePackage.getEString(), "pred", null, 0, 1, CurlyContentB_Labeled.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCurlyContentB_Labeled_L(), this.getLabeled(), null, "l", null, 0, 1, CurlyContentB_Labeled.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCurlyContentB_Labeled_Pd(), ecorePackage.getEString(), "pd", null, 0, 1, CurlyContentB_Labeled.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(e3EClass, com.euclideanspace.aldor.editor.E3.class, "E3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getE3_Op(), ecorePackage.getEString(), "op", null, 0, -1, com.euclideanspace.aldor.editor.E3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getE3_Op2(), this.getLatticeOp(), null, "op2", null, 0, -1, com.euclideanspace.aldor.editor.E3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(e4EClass, com.euclideanspace.aldor.editor.E4.class, "E4", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getE4_Op(), ecorePackage.getEString(), "op", null, 0, -1, com.euclideanspace.aldor.editor.E4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getE4_Op2(), ecorePackage.getEString(), "op2", null, 0, -1, com.euclideanspace.aldor.editor.E4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(e5EClass, com.euclideanspace.aldor.editor.E5.class, "E5", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(e6EClass, com.euclideanspace.aldor.editor.E6.class, "E6", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getE6_Op6(), this.getPlusOp(), null, "op6", null, 0, -1, com.euclideanspace.aldor.editor.E6.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(e7EClass, com.euclideanspace.aldor.editor.E7.class, "E7", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getE7_Op7(), this.getQuotientOp(), null, "op7", null, 0, -1, com.euclideanspace.aldor.editor.E7.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(e8EClass, com.euclideanspace.aldor.editor.E8.class, "E8", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getE8_Op8(), this.getTimesOp(), null, "op8", null, 0, -1, com.euclideanspace.aldor.editor.E8.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(e9EClass, com.euclideanspace.aldor.editor.E9.class, "E9", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getE9_Op9(), this.getPowerOp(), null, "op9", null, 0, -1, com.euclideanspace.aldor.editor.E9.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(e11_E12EClass, com.euclideanspace.aldor.editor.E11_E12.class, "E11_E12", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getE11_E12_Op(), ecorePackage.getEString(), "op", null, 0, -1, com.euclideanspace.aldor.editor.E11_E12.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(e11_OpEClass, E11_Op.class, "E11_Op", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getE11_Op_Op(), ecorePackage.getEString(), "op", null, 0, -1, E11_Op.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
