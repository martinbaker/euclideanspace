/**
 */
package com.euclideanspace.spad.editor.util;

import com.euclideanspace.spad.editor.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.euclideanspace.spad.editor.EditorPackage
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
      public Adapter caseCategoryDef(CategoryDef object)
      {
        return createCategoryDefAdapter();
      }
      @Override
      public Adapter casePackageDef(PackageDef object)
      {
        return createPackageDefAdapter();
      }
      @Override
      public Adapter caseDomainDef(DomainDef object)
      {
        return createDomainDefAdapter();
      }
      @Override
      public Adapter caseWherePart(WherePart object)
      {
        return createWherePartAdapter();
      }
      @Override
      public Adapter caseWhereAssignments(WhereAssignments object)
      {
        return createWhereAssignmentsAdapter();
      }
      @Override
      public Adapter caseWithPart(WithPart object)
      {
        return createWithPartAdapter();
      }
      @Override
      public Adapter caseAddPart(AddPart object)
      {
        return createAddPartAdapter();
      }
      @Override
      public Adapter caseAddStatements(AddStatements object)
      {
        return createAddStatementsAdapter();
      }
      @Override
      public Adapter caseFunctionDefinition(FunctionDefinition object)
      {
        return createFunctionDefinitionAdapter();
      }
      @Override
      public Adapter caseFunctionSignature(FunctionSignature object)
      {
        return createFunctionSignatureAdapter();
      }
      @Override
      public Adapter caseMacroDef(MacroDef object)
      {
        return createMacroDefAdapter();
      }
      @Override
      public Adapter caseImport(Import object)
      {
        return createImportAdapter();
      }
      @Override
      public Adapter caseVariableDeclaration(VariableDeclaration object)
      {
        return createVariableDeclarationAdapter();
      }
      @Override
      public Adapter caseVariableDeclarationAssign(VariableDeclarationAssign object)
      {
        return createVariableDeclarationAssignAdapter();
      }
      @Override
      public Adapter caseFreeVariable(FreeVariable object)
      {
        return createFreeVariableAdapter();
      }
      @Override
      public Adapter caseLocalVariable(LocalVariable object)
      {
        return createLocalVariableAdapter();
      }
      @Override
      public Adapter caseTypeExpression(TypeExpression object)
      {
        return createTypeExpressionAdapter();
      }
      @Override
      public Adapter caseTypeParameterList(TypeParameterList object)
      {
        return createTypeParameterListAdapter();
      }
      @Override
      public Adapter caseTypeArguments(TypeArguments object)
      {
        return createTypeArgumentsAdapter();
      }
      @Override
      public Adapter caseTypeResult(TypeResult object)
      {
        return createTypeResultAdapter();
      }
      @Override
      public Adapter caseTypePrimaryExpression(TypePrimaryExpression object)
      {
        return createTypePrimaryExpressionAdapter();
      }
      @Override
      public Adapter caseTypeNameOrFunctionCall(TypeNameOrFunctionCall object)
      {
        return createTypeNameOrFunctionCallAdapter();
      }
      @Override
      public Adapter caseTypeLiteral(TypeLiteral object)
      {
        return createTypeLiteralAdapter();
      }
      @Override
      public Adapter caseStatement(Statement object)
      {
        return createStatementAdapter();
      }
      @Override
      public Adapter caseBlock(Block object)
      {
        return createBlockAdapter();
      }
      @Override
      public Adapter caseStatementExpression(StatementExpression object)
      {
        return createStatementExpressionAdapter();
      }
      @Override
      public Adapter caseForStatement(ForStatement object)
      {
        return createForStatementAdapter();
      }
      @Override
      public Adapter caseWhileStatement(WhileStatement object)
      {
        return createWhileStatementAdapter();
      }
      @Override
      public Adapter caseDoStatement(DoStatement object)
      {
        return createDoStatementAdapter();
      }
      @Override
      public Adapter caseIterateStatement(IterateStatement object)
      {
        return createIterateStatementAdapter();
      }
      @Override
      public Adapter caseBreakStatement(BreakStatement object)
      {
        return createBreakStatementAdapter();
      }
      @Override
      public Adapter caseReturnStatement(ReturnStatement object)
      {
        return createReturnStatementAdapter();
      }
      @Override
      public Adapter caseIfStatement(IfStatement object)
      {
        return createIfStatementAdapter();
      }
      @Override
      public Adapter casePredicate(Predicate object)
      {
        return createPredicateAdapter();
      }
      @Override
      public Adapter casePredicatePrimary(PredicatePrimary object)
      {
        return createPredicatePrimaryAdapter();
      }
      @Override
      public Adapter caseExpr(Expr object)
      {
        return createExprAdapter();
      }
      @Override
      public Adapter caseMapDefinition(MapDefinition object)
      {
        return createMapDefinitionAdapter();
      }
      @Override
      public Adapter casePrimaryPrefix(PrimaryPrefix object)
      {
        return createPrimaryPrefixAdapter();
      }
      @Override
      public Adapter caseNameOrFunctionCall(NameOrFunctionCall object)
      {
        return createNameOrFunctionCallAdapter();
      }
      @Override
      public Adapter caseLiteral(Literal object)
      {
        return createLiteralAdapter();
      }
      @Override
      public Adapter caseCharacterLiteral(CharacterLiteral object)
      {
        return createCharacterLiteralAdapter();
      }
      @Override
      public Adapter caseBooleanLiteral(BooleanLiteral object)
      {
        return createBooleanLiteralAdapter();
      }
      @Override
      public Adapter caseListLiteral(ListLiteral object)
      {
        return createListLiteralAdapter();
      }
      @Override
      public Adapter casePredicateOr(PredicateOr object)
      {
        return createPredicateOrAdapter();
      }
      @Override
      public Adapter casePredicateAnd(PredicateAnd object)
      {
        return createPredicateAndAdapter();
      }
      @Override
      public Adapter casePredicateNot(PredicateNot object)
      {
        return createPredicateNotAdapter();
      }
      @Override
      public Adapter caseConditionExpression(ConditionExpression object)
      {
        return createConditionExpressionAdapter();
      }
      @Override
      public Adapter caseInnerProdExpression(InnerProdExpression object)
      {
        return createInnerProdExpressionAdapter();
      }
      @Override
      public Adapter caseOuterProdExpression(OuterProdExpression object)
      {
        return createOuterProdExpressionAdapter();
      }
      @Override
      public Adapter caseHasExpression(HasExpression object)
      {
        return createHasExpressionAdapter();
      }
      @Override
      public Adapter caseCaseExpression(CaseExpression object)
      {
        return createCaseExpressionAdapter();
      }
      @Override
      public Adapter caseEqualityExpression(EqualityExpression object)
      {
        return createEqualityExpressionAdapter();
      }
      @Override
      public Adapter caseRelationalExpression(RelationalExpression object)
      {
        return createRelationalExpressionAdapter();
      }
      @Override
      public Adapter caseIsExpression(IsExpression object)
      {
        return createIsExpressionAdapter();
      }
      @Override
      public Adapter caseSegmentExpression(SegmentExpression object)
      {
        return createSegmentExpressionAdapter();
      }
      @Override
      public Adapter caseAdditiveExpression(AdditiveExpression object)
      {
        return createAdditiveExpressionAdapter();
      }
      @Override
      public Adapter caseExquoExpression(ExquoExpression object)
      {
        return createExquoExpressionAdapter();
      }
      @Override
      public Adapter caseDivisionExpression(DivisionExpression object)
      {
        return createDivisionExpressionAdapter();
      }
      @Override
      public Adapter caseQuoExpression(QuoExpression object)
      {
        return createQuoExpressionAdapter();
      }
      @Override
      public Adapter caseModExpression(ModExpression object)
      {
        return createModExpressionAdapter();
      }
      @Override
      public Adapter caseRemExpression(RemExpression object)
      {
        return createRemExpressionAdapter();
      }
      @Override
      public Adapter caseMultiplicativeExpression(MultiplicativeExpression object)
      {
        return createMultiplicativeExpressionAdapter();
      }
      @Override
      public Adapter caseExponentExpression(ExponentExpression object)
      {
        return createExponentExpressionAdapter();
      }
      @Override
      public Adapter casePretendExpression(PretendExpression object)
      {
        return createPretendExpressionAdapter();
      }
      @Override
      public Adapter caseHintTypeExpression(HintTypeExpression object)
      {
        return createHintTypeExpressionAdapter();
      }
      @Override
      public Adapter caseCoerceExpression(CoerceExpression object)
      {
        return createCoerceExpressionAdapter();
      }
      @Override
      public Adapter caseEltExpression(EltExpression object)
      {
        return createEltExpressionAdapter();
      }
      @Override
      public Adapter caseExplicitTypeExpression(ExplicitTypeExpression object)
      {
        return createExplicitTypeExpressionAdapter();
      }
      @Override
      public Adapter caseUnaryExpression(UnaryExpression object)
      {
        return createUnaryExpressionAdapter();
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
   * Creates a new adapter for an object of class '{@link com.euclideanspace.spad.editor.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.spad.editor.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.spad.editor.CategoryDef <em>Category Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.spad.editor.CategoryDef
   * @generated
   */
  public Adapter createCategoryDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.spad.editor.PackageDef <em>Package Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.spad.editor.PackageDef
   * @generated
   */
  public Adapter createPackageDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.spad.editor.DomainDef <em>Domain Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.spad.editor.DomainDef
   * @generated
   */
  public Adapter createDomainDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.spad.editor.WherePart <em>Where Part</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.spad.editor.WherePart
   * @generated
   */
  public Adapter createWherePartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.spad.editor.WhereAssignments <em>Where Assignments</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.spad.editor.WhereAssignments
   * @generated
   */
  public Adapter createWhereAssignmentsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.spad.editor.WithPart <em>With Part</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.spad.editor.WithPart
   * @generated
   */
  public Adapter createWithPartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.spad.editor.AddPart <em>Add Part</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.spad.editor.AddPart
   * @generated
   */
  public Adapter createAddPartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.spad.editor.AddStatements <em>Add Statements</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.spad.editor.AddStatements
   * @generated
   */
  public Adapter createAddStatementsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.spad.editor.FunctionDefinition <em>Function Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.spad.editor.FunctionDefinition
   * @generated
   */
  public Adapter createFunctionDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.spad.editor.FunctionSignature <em>Function Signature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.spad.editor.FunctionSignature
   * @generated
   */
  public Adapter createFunctionSignatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.spad.editor.MacroDef <em>Macro Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.spad.editor.MacroDef
   * @generated
   */
  public Adapter createMacroDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.spad.editor.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.spad.editor.Import
   * @generated
   */
  public Adapter createImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.spad.editor.VariableDeclaration <em>Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.spad.editor.VariableDeclaration
   * @generated
   */
  public Adapter createVariableDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.spad.editor.VariableDeclarationAssign <em>Variable Declaration Assign</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.spad.editor.VariableDeclarationAssign
   * @generated
   */
  public Adapter createVariableDeclarationAssignAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.spad.editor.FreeVariable <em>Free Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.spad.editor.FreeVariable
   * @generated
   */
  public Adapter createFreeVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.spad.editor.LocalVariable <em>Local Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.spad.editor.LocalVariable
   * @generated
   */
  public Adapter createLocalVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.spad.editor.TypeExpression <em>Type Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.spad.editor.TypeExpression
   * @generated
   */
  public Adapter createTypeExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.spad.editor.TypeParameterList <em>Type Parameter List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.spad.editor.TypeParameterList
   * @generated
   */
  public Adapter createTypeParameterListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.spad.editor.TypeArguments <em>Type Arguments</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.spad.editor.TypeArguments
   * @generated
   */
  public Adapter createTypeArgumentsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.spad.editor.TypeResult <em>Type Result</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.spad.editor.TypeResult
   * @generated
   */
  public Adapter createTypeResultAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.spad.editor.TypePrimaryExpression <em>Type Primary Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.spad.editor.TypePrimaryExpression
   * @generated
   */
  public Adapter createTypePrimaryExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.spad.editor.TypeNameOrFunctionCall <em>Type Name Or Function Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.spad.editor.TypeNameOrFunctionCall
   * @generated
   */
  public Adapter createTypeNameOrFunctionCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.spad.editor.TypeLiteral <em>Type Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.spad.editor.TypeLiteral
   * @generated
   */
  public Adapter createTypeLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.spad.editor.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.spad.editor.Statement
   * @generated
   */
  public Adapter createStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.spad.editor.Block <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.spad.editor.Block
   * @generated
   */
  public Adapter createBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.spad.editor.StatementExpression <em>Statement Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.spad.editor.StatementExpression
   * @generated
   */
  public Adapter createStatementExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.spad.editor.ForStatement <em>For Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.spad.editor.ForStatement
   * @generated
   */
  public Adapter createForStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.spad.editor.WhileStatement <em>While Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.spad.editor.WhileStatement
   * @generated
   */
  public Adapter createWhileStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.spad.editor.DoStatement <em>Do Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.spad.editor.DoStatement
   * @generated
   */
  public Adapter createDoStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.spad.editor.IterateStatement <em>Iterate Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.spad.editor.IterateStatement
   * @generated
   */
  public Adapter createIterateStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.spad.editor.BreakStatement <em>Break Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.spad.editor.BreakStatement
   * @generated
   */
  public Adapter createBreakStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.spad.editor.ReturnStatement <em>Return Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.spad.editor.ReturnStatement
   * @generated
   */
  public Adapter createReturnStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.spad.editor.IfStatement <em>If Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.spad.editor.IfStatement
   * @generated
   */
  public Adapter createIfStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.spad.editor.Predicate <em>Predicate</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.spad.editor.Predicate
   * @generated
   */
  public Adapter createPredicateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.spad.editor.PredicatePrimary <em>Predicate Primary</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.spad.editor.PredicatePrimary
   * @generated
   */
  public Adapter createPredicatePrimaryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.spad.editor.Expr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.spad.editor.Expr
   * @generated
   */
  public Adapter createExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.spad.editor.MapDefinition <em>Map Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.spad.editor.MapDefinition
   * @generated
   */
  public Adapter createMapDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.spad.editor.PrimaryPrefix <em>Primary Prefix</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.spad.editor.PrimaryPrefix
   * @generated
   */
  public Adapter createPrimaryPrefixAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.spad.editor.NameOrFunctionCall <em>Name Or Function Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.spad.editor.NameOrFunctionCall
   * @generated
   */
  public Adapter createNameOrFunctionCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.spad.editor.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.spad.editor.Literal
   * @generated
   */
  public Adapter createLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.spad.editor.CharacterLiteral <em>Character Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.spad.editor.CharacterLiteral
   * @generated
   */
  public Adapter createCharacterLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.spad.editor.BooleanLiteral <em>Boolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.spad.editor.BooleanLiteral
   * @generated
   */
  public Adapter createBooleanLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.spad.editor.ListLiteral <em>List Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.spad.editor.ListLiteral
   * @generated
   */
  public Adapter createListLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.spad.editor.PredicateOr <em>Predicate Or</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.spad.editor.PredicateOr
   * @generated
   */
  public Adapter createPredicateOrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.spad.editor.PredicateAnd <em>Predicate And</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.spad.editor.PredicateAnd
   * @generated
   */
  public Adapter createPredicateAndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.spad.editor.PredicateNot <em>Predicate Not</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.spad.editor.PredicateNot
   * @generated
   */
  public Adapter createPredicateNotAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.spad.editor.ConditionExpression <em>Condition Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.spad.editor.ConditionExpression
   * @generated
   */
  public Adapter createConditionExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.spad.editor.InnerProdExpression <em>Inner Prod Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.spad.editor.InnerProdExpression
   * @generated
   */
  public Adapter createInnerProdExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.spad.editor.OuterProdExpression <em>Outer Prod Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.spad.editor.OuterProdExpression
   * @generated
   */
  public Adapter createOuterProdExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.spad.editor.HasExpression <em>Has Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.spad.editor.HasExpression
   * @generated
   */
  public Adapter createHasExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.spad.editor.CaseExpression <em>Case Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.spad.editor.CaseExpression
   * @generated
   */
  public Adapter createCaseExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.spad.editor.EqualityExpression <em>Equality Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.spad.editor.EqualityExpression
   * @generated
   */
  public Adapter createEqualityExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.spad.editor.RelationalExpression <em>Relational Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.spad.editor.RelationalExpression
   * @generated
   */
  public Adapter createRelationalExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.spad.editor.IsExpression <em>Is Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.spad.editor.IsExpression
   * @generated
   */
  public Adapter createIsExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.spad.editor.SegmentExpression <em>Segment Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.spad.editor.SegmentExpression
   * @generated
   */
  public Adapter createSegmentExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.spad.editor.AdditiveExpression <em>Additive Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.spad.editor.AdditiveExpression
   * @generated
   */
  public Adapter createAdditiveExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.spad.editor.ExquoExpression <em>Exquo Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.spad.editor.ExquoExpression
   * @generated
   */
  public Adapter createExquoExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.spad.editor.DivisionExpression <em>Division Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.spad.editor.DivisionExpression
   * @generated
   */
  public Adapter createDivisionExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.spad.editor.QuoExpression <em>Quo Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.spad.editor.QuoExpression
   * @generated
   */
  public Adapter createQuoExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.spad.editor.ModExpression <em>Mod Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.spad.editor.ModExpression
   * @generated
   */
  public Adapter createModExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.spad.editor.RemExpression <em>Rem Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.spad.editor.RemExpression
   * @generated
   */
  public Adapter createRemExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.spad.editor.MultiplicativeExpression <em>Multiplicative Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.spad.editor.MultiplicativeExpression
   * @generated
   */
  public Adapter createMultiplicativeExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.spad.editor.ExponentExpression <em>Exponent Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.spad.editor.ExponentExpression
   * @generated
   */
  public Adapter createExponentExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.spad.editor.PretendExpression <em>Pretend Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.spad.editor.PretendExpression
   * @generated
   */
  public Adapter createPretendExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.spad.editor.HintTypeExpression <em>Hint Type Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.spad.editor.HintTypeExpression
   * @generated
   */
  public Adapter createHintTypeExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.spad.editor.CoerceExpression <em>Coerce Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.spad.editor.CoerceExpression
   * @generated
   */
  public Adapter createCoerceExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.spad.editor.EltExpression <em>Elt Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.spad.editor.EltExpression
   * @generated
   */
  public Adapter createEltExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.spad.editor.ExplicitTypeExpression <em>Explicit Type Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.spad.editor.ExplicitTypeExpression
   * @generated
   */
  public Adapter createExplicitTypeExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.spad.editor.UnaryExpression <em>Unary Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.spad.editor.UnaryExpression
   * @generated
   */
  public Adapter createUnaryExpressionAdapter()
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
