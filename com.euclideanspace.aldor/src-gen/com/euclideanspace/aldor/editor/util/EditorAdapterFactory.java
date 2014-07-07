/**
 */
package com.euclideanspace.aldor.editor.util;

import com.euclideanspace.aldor.editor.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.euclideanspace.aldor.editor.EditorPackage
 * @generated
 */
public class EditorAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static EditorPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EditorAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = EditorPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EditorSwitch<Adapter> modelSwitch =
    new EditorSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseLabeled(Labeled object)
      {
        return createLabeledAdapter();
      }
      @Override
      public Adapter caseDeclaration(Declaration object)
      {
        return createDeclarationAdapter();
      }
      @Override
      public Adapter caseExportDecl(ExportDecl object)
      {
        return createExportDeclAdapter();
      }
      @Override
      public Adapter caseToPart(ToPart object)
      {
        return createToPartAdapter();
      }
      @Override
      public Adapter caseFromPart(FromPart object)
      {
        return createFromPartAdapter();
      }
      @Override
      public Adapter caseMacroBody(MacroBody object)
      {
        return createMacroBodyAdapter();
      }
      @Override
      public Adapter caseSig(Sig object)
      {
        return createSigAdapter();
      }
      @Override
      public Adapter caseDeclPart(DeclPart object)
      {
        return createDeclPartAdapter();
      }
      @Override
      public Adapter caseComma(Comma object)
      {
        return createCommaAdapter();
      }
      @Override
      public Adapter caseCommaItem(CommaItem object)
      {
        return createCommaItemAdapter();
      }
      @Override
      public Adapter caseDeclBinding(DeclBinding object)
      {
        return createDeclBindingAdapter();
      }
      @Override
      public Adapter caseInfixedExprsDecl(InfixedExprsDecl object)
      {
        return createInfixedExprsDeclAdapter();
      }
      @Override
      public Adapter caseInfixedExprs(InfixedExprs object)
      {
        return createInfixedExprsAdapter();
      }
      @Override
      public Adapter caseBinding_AnyStatement(Binding_AnyStatement object)
      {
        return createBinding_AnyStatementAdapter();
      }
      @Override
      public Adapter caseBinding_BalStatement(Binding_BalStatement object)
      {
        return createBinding_BalStatementAdapter();
      }
      @Override
      public Adapter caseBinding_Collection(Binding_Collection object)
      {
        return createBinding_CollectionAdapter();
      }
      @Override
      public Adapter caseBindingL_Infixed_AnyStatement(BindingL_Infixed_AnyStatement object)
      {
        return createBindingL_Infixed_AnyStatementAdapter();
      }
      @Override
      public Adapter caseBindingL_Infixed_BalStatement(BindingL_Infixed_BalStatement object)
      {
        return createBindingL_Infixed_BalStatementAdapter();
      }
      @Override
      public Adapter caseBindingL_Infixed_Collection(BindingL_Infixed_Collection object)
      {
        return createBindingL_Infixed_CollectionAdapter();
      }
      @Override
      public Adapter caseBindingR_InfixedExprsDecl_AnyStatement(BindingR_InfixedExprsDecl_AnyStatement object)
      {
        return createBindingR_InfixedExprsDecl_AnyStatementAdapter();
      }
      @Override
      public Adapter caseAnyStatement(AnyStatement object)
      {
        return createAnyStatementAdapter();
      }
      @Override
      public Adapter caseBalStatement(BalStatement object)
      {
        return createBalStatementAdapter();
      }
      @Override
      public Adapter caseFlow_AnyStatement(Flow_AnyStatement object)
      {
        return createFlow_AnyStatementAdapter();
      }
      @Override
      public Adapter caseFlow_BalStatement(Flow_BalStatement object)
      {
        return createFlow_BalStatementAdapter();
      }
      @Override
      public Adapter caseGenBound(GenBound object)
      {
        return createGenBoundAdapter();
      }
      @Override
      public Adapter caseButExpr(ButExpr object)
      {
        return createButExprAdapter();
      }
      @Override
      public Adapter caseCases(Cases object)
      {
        return createCasesAdapter();
      }
      @Override
      public Adapter caseAlwaysPart_AnyStatement(AlwaysPart_AnyStatement object)
      {
        return createAlwaysPart_AnyStatementAdapter();
      }
      @Override
      public Adapter caseAlwaysPart_BalStatement(AlwaysPart_BalStatement object)
      {
        return createAlwaysPart_BalStatementAdapter();
      }
      @Override
      public Adapter caseCollection(Collection object)
      {
        return createCollectionAdapter();
      }
      @Override
      public Adapter caseIterators(Iterators object)
      {
        return createIteratorsAdapter();
      }
      @Override
      public Adapter caseIterators1(Iterators1 object)
      {
        return createIterators1Adapter();
      }
      @Override
      public Adapter caseIterator(Iterator object)
      {
        return createIteratorAdapter();
      }
      @Override
      public Adapter caseForLhs(ForLhs object)
      {
        return createForLhsAdapter();
      }
      @Override
      public Adapter caseSuchthatPart(SuchthatPart object)
      {
        return createSuchthatPartAdapter();
      }
      @Override
      public Adapter caseInfixed(Infixed object)
      {
        return createInfixedAdapter();
      }
      @Override
      public Adapter caseInfixedExpr(InfixedExpr object)
      {
        return createInfixedExprAdapter();
      }
      @Override
      public Adapter caseExpr(Expr object)
      {
        return createExprAdapter();
      }
      @Override
      public Adapter caseType(Type object)
      {
        return createTypeAdapter();
      }
      @Override
      public Adapter caseE12(E12 object)
      {
        return createE12Adapter();
      }
      @Override
      public Adapter caseE13(E13 object)
      {
        return createE13Adapter();
      }
      @Override
      public Adapter caseQualTail(QualTail object)
      {
        return createQualTailAdapter();
      }
      @Override
      public Adapter caseOpQualTail(OpQualTail object)
      {
        return createOpQualTailAdapter();
      }
      @Override
      public Adapter caseE14(E14 object)
      {
        return createE14Adapter();
      }
      @Override
      public Adapter caseOp(Op object)
      {
        return createOpAdapter();
      }
      @Override
      public Adapter caseNakedOp(NakedOp object)
      {
        return createNakedOpAdapter();
      }
      @Override
      public Adapter caseArrowOp(ArrowOp object)
      {
        return createArrowOpAdapter();
      }
      @Override
      public Adapter caseLatticeOp(LatticeOp object)
      {
        return createLatticeOpAdapter();
      }
      @Override
      public Adapter caseSegOp(SegOp object)
      {
        return createSegOpAdapter();
      }
      @Override
      public Adapter casePlusOp(PlusOp object)
      {
        return createPlusOpAdapter();
      }
      @Override
      public Adapter caseQuotientOp(QuotientOp object)
      {
        return createQuotientOpAdapter();
      }
      @Override
      public Adapter caseTimesOp(TimesOp object)
      {
        return createTimesOpAdapter();
      }
      @Override
      public Adapter casePowerOp(PowerOp object)
      {
        return createPowerOpAdapter();
      }
      @Override
      public Adapter caseLeftJuxtaposed(LeftJuxtaposed object)
      {
        return createLeftJuxtaposedAdapter();
      }
      @Override
      public Adapter caseJright_Atom(Jright_Atom object)
      {
        return createJright_AtomAdapter();
      }
      @Override
      public Adapter caseJleft_Molecule(Jleft_Molecule object)
      {
        return createJleft_MoleculeAdapter();
      }
      @Override
      public Adapter caseJleft_Atom(Jleft_Atom object)
      {
        return createJleft_AtomAdapter();
      }
      @Override
      public Adapter caseMolecule(Molecule object)
      {
        return createMoleculeAdapter();
      }
      @Override
      public Adapter caseEnclosure(Enclosure object)
      {
        return createEnclosureAdapter();
      }
      @Override
      public Adapter caseDeclMolecule(DeclMolecule object)
      {
        return createDeclMoleculeAdapter();
      }
      @Override
      public Adapter caseBlockMolecule(BlockMolecule object)
      {
        return createBlockMoleculeAdapter();
      }
      @Override
      public Adapter caseBlockEnclosure(BlockEnclosure object)
      {
        return createBlockEnclosureAdapter();
      }
      @Override
      public Adapter caseBlock(Block object)
      {
        return createBlockAdapter();
      }
      @Override
      public Adapter caseParened(Parened object)
      {
        return createParenedAdapter();
      }
      @Override
      public Adapter caseBracketed(Bracketed object)
      {
        return createBracketedAdapter();
      }
      @Override
      public Adapter caseQuotedIds(QuotedIds object)
      {
        return createQuotedIdsAdapter();
      }
      @Override
      public Adapter caseNames(Names object)
      {
        return createNamesAdapter();
      }
      @Override
      public Adapter caseAtom(Atom object)
      {
        return createAtomAdapter();
      }
      @Override
      public Adapter caseName(Name object)
      {
        return createNameAdapter();
      }
      @Override
      public Adapter caseId(Id object)
      {
        return createIdAdapter();
      }
      @Override
      public Adapter caseUnqualOp_ArrowTok(UnqualOp_ArrowTok object)
      {
        return createUnqualOp_ArrowTokAdapter();
      }
      @Override
      public Adapter caseUnqualOp_LatticeTok(UnqualOp_LatticeTok object)
      {
        return createUnqualOp_LatticeTokAdapter();
      }
      @Override
      public Adapter caseUnqualOp_RelationTok(UnqualOp_RelationTok object)
      {
        return createUnqualOp_RelationTokAdapter();
      }
      @Override
      public Adapter caseUnqualOp_SegTok(UnqualOp_SegTok object)
      {
        return createUnqualOp_SegTokAdapter();
      }
      @Override
      public Adapter caseUnqualOp_PlusTok(UnqualOp_PlusTok object)
      {
        return createUnqualOp_PlusTokAdapter();
      }
      @Override
      public Adapter caseUnqualOp_QuotientTok(UnqualOp_QuotientTok object)
      {
        return createUnqualOp_QuotientTokAdapter();
      }
      @Override
      public Adapter caseUnqualOp_TimesTok(UnqualOp_TimesTok object)
      {
        return createUnqualOp_TimesTokAdapter();
      }
      @Override
      public Adapter caseUnqualOp_PowerTok(UnqualOp_PowerTok object)
      {
        return createUnqualOp_PowerTokAdapter();
      }
      @Override
      public Adapter caseQualOp_ArrowTok(QualOp_ArrowTok object)
      {
        return createQualOp_ArrowTokAdapter();
      }
      @Override
      public Adapter caseQualOp_LatticeTok(QualOp_LatticeTok object)
      {
        return createQualOp_LatticeTokAdapter();
      }
      @Override
      public Adapter caseQualOp_SegTok(QualOp_SegTok object)
      {
        return createQualOp_SegTokAdapter();
      }
      @Override
      public Adapter caseQualOp_PlusTok(QualOp_PlusTok object)
      {
        return createQualOp_PlusTokAdapter();
      }
      @Override
      public Adapter caseQualOp_QuotientTok(QualOp_QuotientTok object)
      {
        return createQualOp_QuotientTokAdapter();
      }
      @Override
      public Adapter caseQualOp_TimesTok(QualOp_TimesTok object)
      {
        return createQualOp_TimesTokAdapter();
      }
      @Override
      public Adapter caseQualOp_PowerTok(QualOp_PowerTok object)
      {
        return createQualOp_PowerTokAdapter();
      }
      @Override
      public Adapter caseenlist1_CommaItem_Comma_AB(enlist1_CommaItem_Comma_AB object)
      {
        return createenlist1_CommaItem_Comma_ABAdapter();
      }
      @Override
      public Adapter caseenlist1_Infixed_Comma_AB(enlist1_Infixed_Comma_AB object)
      {
        return createenlist1_Infixed_Comma_ABAdapter();
      }
      @Override
      public Adapter caseenlist1_InfixedExpr_Comma_AB(enlist1_InfixedExpr_Comma_AB object)
      {
        return createenlist1_InfixedExpr_Comma_ABAdapter();
      }
      @Override
      public Adapter caseenlister1_CommaItem_Comma(enlister1_CommaItem_Comma object)
      {
        return createenlister1_CommaItem_CommaAdapter();
      }
      @Override
      public Adapter caseenlister1_Infixed_Comma(enlister1_Infixed_Comma object)
      {
        return createenlister1_Infixed_CommaAdapter();
      }
      @Override
      public Adapter caseenlister1_InfixedExpr_Comma(enlister1_InfixedExpr_Comma object)
      {
        return createenlister1_InfixedExpr_CommaAdapter();
      }
      @Override
      public Adapter caseenlist1a_Labeled_Semicolon_AB(enlist1a_Labeled_Semicolon_AB object)
      {
        return createenlist1a_Labeled_Semicolon_ABAdapter();
      }
      @Override
      public Adapter caseenlister1a_Labeled_Semicolon(enlister1a_Labeled_Semicolon object)
      {
        return createenlister1a_Labeled_SemicolonAdapter();
      }
      @Override
      public Adapter caseCurly_Labeled(Curly_Labeled object)
      {
        return createCurly_LabeledAdapter();
      }
      @Override
      public Adapter caseCurlyContents_Labeled(CurlyContents_Labeled object)
      {
        return createCurlyContents_LabeledAdapter();
      }
      @Override
      public Adapter caseCurlyContentsList_Labeled(CurlyContentsList_Labeled object)
      {
        return createCurlyContentsList_LabeledAdapter();
      }
      @Override
      public Adapter caseCurlyContentB_Labeled(CurlyContentB_Labeled object)
      {
        return createCurlyContentB_LabeledAdapter();
      }
      @Override
      public Adapter caseE3(E3 object)
      {
        return createE3Adapter();
      }
      @Override
      public Adapter caseE4(E4 object)
      {
        return createE4Adapter();
      }
      @Override
      public Adapter caseE5(E5 object)
      {
        return createE5Adapter();
      }
      @Override
      public Adapter caseE6(E6 object)
      {
        return createE6Adapter();
      }
      @Override
      public Adapter caseE7(E7 object)
      {
        return createE7Adapter();
      }
      @Override
      public Adapter caseE8(E8 object)
      {
        return createE8Adapter();
      }
      @Override
      public Adapter caseE9(E9 object)
      {
        return createE9Adapter();
      }
      @Override
      public Adapter caseE11_E12(E11_E12 object)
      {
        return createE11_E12Adapter();
      }
      @Override
      public Adapter caseE11_Op(E11_Op object)
      {
        return createE11_OpAdapter();
      }
      @Override
      public Adapter caseArrowTok(ArrowTok object)
      {
        return createArrowTokAdapter();
      }
      @Override
      public Adapter caseLatticeTok(LatticeTok object)
      {
        return createLatticeTokAdapter();
      }
      @Override
      public Adapter caseRelationTok(RelationTok object)
      {
        return createRelationTokAdapter();
      }
      @Override
      public Adapter caseSegTok(SegTok object)
      {
        return createSegTokAdapter();
      }
      @Override
      public Adapter casePlusTok(PlusTok object)
      {
        return createPlusTokAdapter();
      }
      @Override
      public Adapter caseQuotientTok(QuotientTok object)
      {
        return createQuotientTokAdapter();
      }
      @Override
      public Adapter caseTimesTok(TimesTok object)
      {
        return createTimesTokAdapter();
      }
      @Override
      public Adapter casePowerTok(PowerTok object)
      {
        return createPowerTokAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.Labeled <em>Labeled</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.Labeled
   * @generated
   */
  public Adapter createLabeledAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.Declaration <em>Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.Declaration
   * @generated
   */
  public Adapter createDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.ExportDecl <em>Export Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.ExportDecl
   * @generated
   */
  public Adapter createExportDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.ToPart <em>To Part</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.ToPart
   * @generated
   */
  public Adapter createToPartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.FromPart <em>From Part</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.FromPart
   * @generated
   */
  public Adapter createFromPartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.MacroBody <em>Macro Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.MacroBody
   * @generated
   */
  public Adapter createMacroBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.Sig <em>Sig</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.Sig
   * @generated
   */
  public Adapter createSigAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.DeclPart <em>Decl Part</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.DeclPart
   * @generated
   */
  public Adapter createDeclPartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.Comma <em>Comma</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.Comma
   * @generated
   */
  public Adapter createCommaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.CommaItem <em>Comma Item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.CommaItem
   * @generated
   */
  public Adapter createCommaItemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.DeclBinding <em>Decl Binding</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.DeclBinding
   * @generated
   */
  public Adapter createDeclBindingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.InfixedExprsDecl <em>Infixed Exprs Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.InfixedExprsDecl
   * @generated
   */
  public Adapter createInfixedExprsDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.InfixedExprs <em>Infixed Exprs</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.InfixedExprs
   * @generated
   */
  public Adapter createInfixedExprsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.Binding_AnyStatement <em>Binding Any Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.Binding_AnyStatement
   * @generated
   */
  public Adapter createBinding_AnyStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.Binding_BalStatement <em>Binding Bal Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.Binding_BalStatement
   * @generated
   */
  public Adapter createBinding_BalStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.Binding_Collection <em>Binding Collection</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.Binding_Collection
   * @generated
   */
  public Adapter createBinding_CollectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.BindingL_Infixed_AnyStatement <em>Binding LInfixed Any Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.BindingL_Infixed_AnyStatement
   * @generated
   */
  public Adapter createBindingL_Infixed_AnyStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.BindingL_Infixed_BalStatement <em>Binding LInfixed Bal Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.BindingL_Infixed_BalStatement
   * @generated
   */
  public Adapter createBindingL_Infixed_BalStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.BindingL_Infixed_Collection <em>Binding LInfixed Collection</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.BindingL_Infixed_Collection
   * @generated
   */
  public Adapter createBindingL_Infixed_CollectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.BindingR_InfixedExprsDecl_AnyStatement <em>Binding RInfixed Exprs Decl Any Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.BindingR_InfixedExprsDecl_AnyStatement
   * @generated
   */
  public Adapter createBindingR_InfixedExprsDecl_AnyStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.AnyStatement <em>Any Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.AnyStatement
   * @generated
   */
  public Adapter createAnyStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.BalStatement <em>Bal Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.BalStatement
   * @generated
   */
  public Adapter createBalStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.Flow_AnyStatement <em>Flow Any Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.Flow_AnyStatement
   * @generated
   */
  public Adapter createFlow_AnyStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.Flow_BalStatement <em>Flow Bal Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.Flow_BalStatement
   * @generated
   */
  public Adapter createFlow_BalStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.GenBound <em>Gen Bound</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.GenBound
   * @generated
   */
  public Adapter createGenBoundAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.ButExpr <em>But Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.ButExpr
   * @generated
   */
  public Adapter createButExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.Cases <em>Cases</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.Cases
   * @generated
   */
  public Adapter createCasesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.AlwaysPart_AnyStatement <em>Always Part Any Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.AlwaysPart_AnyStatement
   * @generated
   */
  public Adapter createAlwaysPart_AnyStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.AlwaysPart_BalStatement <em>Always Part Bal Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.AlwaysPart_BalStatement
   * @generated
   */
  public Adapter createAlwaysPart_BalStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.Collection <em>Collection</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.Collection
   * @generated
   */
  public Adapter createCollectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.Iterators <em>Iterators</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.Iterators
   * @generated
   */
  public Adapter createIteratorsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.Iterators1 <em>Iterators1</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.Iterators1
   * @generated
   */
  public Adapter createIterators1Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.Iterator <em>Iterator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.Iterator
   * @generated
   */
  public Adapter createIteratorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.ForLhs <em>For Lhs</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.ForLhs
   * @generated
   */
  public Adapter createForLhsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.SuchthatPart <em>Suchthat Part</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.SuchthatPart
   * @generated
   */
  public Adapter createSuchthatPartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.Infixed <em>Infixed</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.Infixed
   * @generated
   */
  public Adapter createInfixedAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.InfixedExpr <em>Infixed Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.InfixedExpr
   * @generated
   */
  public Adapter createInfixedExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.Expr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.Expr
   * @generated
   */
  public Adapter createExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.Type
   * @generated
   */
  public Adapter createTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.E12 <em>E12</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.E12
   * @generated
   */
  public Adapter createE12Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.E13 <em>E13</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.E13
   * @generated
   */
  public Adapter createE13Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.QualTail <em>Qual Tail</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.QualTail
   * @generated
   */
  public Adapter createQualTailAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.OpQualTail <em>Op Qual Tail</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.OpQualTail
   * @generated
   */
  public Adapter createOpQualTailAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.E14 <em>E14</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.E14
   * @generated
   */
  public Adapter createE14Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.Op <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.Op
   * @generated
   */
  public Adapter createOpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.NakedOp <em>Naked Op</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.NakedOp
   * @generated
   */
  public Adapter createNakedOpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.ArrowOp <em>Arrow Op</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.ArrowOp
   * @generated
   */
  public Adapter createArrowOpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.LatticeOp <em>Lattice Op</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.LatticeOp
   * @generated
   */
  public Adapter createLatticeOpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.SegOp <em>Seg Op</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.SegOp
   * @generated
   */
  public Adapter createSegOpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.PlusOp <em>Plus Op</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.PlusOp
   * @generated
   */
  public Adapter createPlusOpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.QuotientOp <em>Quotient Op</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.QuotientOp
   * @generated
   */
  public Adapter createQuotientOpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.TimesOp <em>Times Op</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.TimesOp
   * @generated
   */
  public Adapter createTimesOpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.PowerOp <em>Power Op</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.PowerOp
   * @generated
   */
  public Adapter createPowerOpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.LeftJuxtaposed <em>Left Juxtaposed</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.LeftJuxtaposed
   * @generated
   */
  public Adapter createLeftJuxtaposedAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.Jright_Atom <em>Jright Atom</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.Jright_Atom
   * @generated
   */
  public Adapter createJright_AtomAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.Jleft_Molecule <em>Jleft Molecule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.Jleft_Molecule
   * @generated
   */
  public Adapter createJleft_MoleculeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.Jleft_Atom <em>Jleft Atom</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.Jleft_Atom
   * @generated
   */
  public Adapter createJleft_AtomAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.Molecule <em>Molecule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.Molecule
   * @generated
   */
  public Adapter createMoleculeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.Enclosure <em>Enclosure</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.Enclosure
   * @generated
   */
  public Adapter createEnclosureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.DeclMolecule <em>Decl Molecule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.DeclMolecule
   * @generated
   */
  public Adapter createDeclMoleculeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.BlockMolecule <em>Block Molecule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.BlockMolecule
   * @generated
   */
  public Adapter createBlockMoleculeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.BlockEnclosure <em>Block Enclosure</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.BlockEnclosure
   * @generated
   */
  public Adapter createBlockEnclosureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.Block <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.Block
   * @generated
   */
  public Adapter createBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.Parened <em>Parened</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.Parened
   * @generated
   */
  public Adapter createParenedAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.Bracketed <em>Bracketed</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.Bracketed
   * @generated
   */
  public Adapter createBracketedAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.QuotedIds <em>Quoted Ids</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.QuotedIds
   * @generated
   */
  public Adapter createQuotedIdsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.Names <em>Names</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.Names
   * @generated
   */
  public Adapter createNamesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.Atom <em>Atom</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.Atom
   * @generated
   */
  public Adapter createAtomAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.Name <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.Name
   * @generated
   */
  public Adapter createNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.Id <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.Id
   * @generated
   */
  public Adapter createIdAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.UnqualOp_ArrowTok <em>Unqual Op Arrow Tok</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.UnqualOp_ArrowTok
   * @generated
   */
  public Adapter createUnqualOp_ArrowTokAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.UnqualOp_LatticeTok <em>Unqual Op Lattice Tok</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.UnqualOp_LatticeTok
   * @generated
   */
  public Adapter createUnqualOp_LatticeTokAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.UnqualOp_RelationTok <em>Unqual Op Relation Tok</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.UnqualOp_RelationTok
   * @generated
   */
  public Adapter createUnqualOp_RelationTokAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.UnqualOp_SegTok <em>Unqual Op Seg Tok</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.UnqualOp_SegTok
   * @generated
   */
  public Adapter createUnqualOp_SegTokAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.UnqualOp_PlusTok <em>Unqual Op Plus Tok</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.UnqualOp_PlusTok
   * @generated
   */
  public Adapter createUnqualOp_PlusTokAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.UnqualOp_QuotientTok <em>Unqual Op Quotient Tok</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.UnqualOp_QuotientTok
   * @generated
   */
  public Adapter createUnqualOp_QuotientTokAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.UnqualOp_TimesTok <em>Unqual Op Times Tok</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.UnqualOp_TimesTok
   * @generated
   */
  public Adapter createUnqualOp_TimesTokAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.UnqualOp_PowerTok <em>Unqual Op Power Tok</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.UnqualOp_PowerTok
   * @generated
   */
  public Adapter createUnqualOp_PowerTokAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.QualOp_ArrowTok <em>Qual Op Arrow Tok</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.QualOp_ArrowTok
   * @generated
   */
  public Adapter createQualOp_ArrowTokAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.QualOp_LatticeTok <em>Qual Op Lattice Tok</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.QualOp_LatticeTok
   * @generated
   */
  public Adapter createQualOp_LatticeTokAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.QualOp_SegTok <em>Qual Op Seg Tok</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.QualOp_SegTok
   * @generated
   */
  public Adapter createQualOp_SegTokAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.QualOp_PlusTok <em>Qual Op Plus Tok</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.QualOp_PlusTok
   * @generated
   */
  public Adapter createQualOp_PlusTokAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.QualOp_QuotientTok <em>Qual Op Quotient Tok</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.QualOp_QuotientTok
   * @generated
   */
  public Adapter createQualOp_QuotientTokAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.QualOp_TimesTok <em>Qual Op Times Tok</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.QualOp_TimesTok
   * @generated
   */
  public Adapter createQualOp_TimesTokAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.QualOp_PowerTok <em>Qual Op Power Tok</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.QualOp_PowerTok
   * @generated
   */
  public Adapter createQualOp_PowerTokAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.enlist1_CommaItem_Comma_AB <em>enlist1 Comma Item Comma AB</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.enlist1_CommaItem_Comma_AB
   * @generated
   */
  public Adapter createenlist1_CommaItem_Comma_ABAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.enlist1_Infixed_Comma_AB <em>enlist1 Infixed Comma AB</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.enlist1_Infixed_Comma_AB
   * @generated
   */
  public Adapter createenlist1_Infixed_Comma_ABAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.enlist1_InfixedExpr_Comma_AB <em>enlist1 Infixed Expr Comma AB</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.enlist1_InfixedExpr_Comma_AB
   * @generated
   */
  public Adapter createenlist1_InfixedExpr_Comma_ABAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.enlister1_CommaItem_Comma <em>enlister1 Comma Item Comma</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.enlister1_CommaItem_Comma
   * @generated
   */
  public Adapter createenlister1_CommaItem_CommaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.enlister1_Infixed_Comma <em>enlister1 Infixed Comma</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.enlister1_Infixed_Comma
   * @generated
   */
  public Adapter createenlister1_Infixed_CommaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.enlister1_InfixedExpr_Comma <em>enlister1 Infixed Expr Comma</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.enlister1_InfixedExpr_Comma
   * @generated
   */
  public Adapter createenlister1_InfixedExpr_CommaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.enlist1a_Labeled_Semicolon_AB <em>enlist1a Labeled Semicolon AB</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.enlist1a_Labeled_Semicolon_AB
   * @generated
   */
  public Adapter createenlist1a_Labeled_Semicolon_ABAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.enlister1a_Labeled_Semicolon <em>enlister1a Labeled Semicolon</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.enlister1a_Labeled_Semicolon
   * @generated
   */
  public Adapter createenlister1a_Labeled_SemicolonAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.Curly_Labeled <em>Curly Labeled</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.Curly_Labeled
   * @generated
   */
  public Adapter createCurly_LabeledAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.CurlyContents_Labeled <em>Curly Contents Labeled</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.CurlyContents_Labeled
   * @generated
   */
  public Adapter createCurlyContents_LabeledAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.CurlyContentsList_Labeled <em>Curly Contents List Labeled</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.CurlyContentsList_Labeled
   * @generated
   */
  public Adapter createCurlyContentsList_LabeledAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.CurlyContentB_Labeled <em>Curly Content BLabeled</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.CurlyContentB_Labeled
   * @generated
   */
  public Adapter createCurlyContentB_LabeledAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.E3 <em>E3</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.E3
   * @generated
   */
  public Adapter createE3Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.E4 <em>E4</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.E4
   * @generated
   */
  public Adapter createE4Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.E5 <em>E5</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.E5
   * @generated
   */
  public Adapter createE5Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.E6 <em>E6</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.E6
   * @generated
   */
  public Adapter createE6Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.E7 <em>E7</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.E7
   * @generated
   */
  public Adapter createE7Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.E8 <em>E8</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.E8
   * @generated
   */
  public Adapter createE8Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.E9 <em>E9</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.E9
   * @generated
   */
  public Adapter createE9Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.E11_E12 <em>E11 E12</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.E11_E12
   * @generated
   */
  public Adapter createE11_E12Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.E11_Op <em>E11 Op</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.E11_Op
   * @generated
   */
  public Adapter createE11_OpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.ArrowTok <em>Arrow Tok</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.ArrowTok
   * @generated
   */
  public Adapter createArrowTokAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.LatticeTok <em>Lattice Tok</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.LatticeTok
   * @generated
   */
  public Adapter createLatticeTokAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.RelationTok <em>Relation Tok</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.RelationTok
   * @generated
   */
  public Adapter createRelationTokAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.SegTok <em>Seg Tok</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.SegTok
   * @generated
   */
  public Adapter createSegTokAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.PlusTok <em>Plus Tok</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.PlusTok
   * @generated
   */
  public Adapter createPlusTokAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.QuotientTok <em>Quotient Tok</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.QuotientTok
   * @generated
   */
  public Adapter createQuotientTokAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.TimesTok <em>Times Tok</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.TimesTok
   * @generated
   */
  public Adapter createTimesTokAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.aldor.editor.PowerTok <em>Power Tok</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.aldor.editor.PowerTok
   * @generated
   */
  public Adapter createPowerTokAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //EditorAdapterFactory
