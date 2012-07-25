/**
 */
package com.euclideanspace.spad.editor.impl;

import com.euclideanspace.spad.editor.*;

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
      EditorFactory theEditorFactory = (EditorFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.euclideanspace.com/spad/Editor"); 
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
      case EditorPackage.CATEGORY_DEF: return createCategoryDef();
      case EditorPackage.PACKAGE_DEF: return createPackageDef();
      case EditorPackage.DOMAIN_DEF: return createDomainDef();
      case EditorPackage.WHERE_PART: return createWherePart();
      case EditorPackage.WHERE_ASSIGNMENTS: return createWhereAssignments();
      case EditorPackage.WITH_PART: return createWithPart();
      case EditorPackage.ADD_PART: return createAddPart();
      case EditorPackage.ADD_STATEMENTS: return createAddStatements();
      case EditorPackage.FUNCTION_DEFINITION: return createFunctionDefinition();
      case EditorPackage.FUNCTION_DEFINITION_BLOCK: return createFunctionDefinitionBlock();
      case EditorPackage.FUNCTION_SIGNATURE: return createFunctionSignature();
      case EditorPackage.MACRO_DEF: return createMacroDef();
      case EditorPackage.IMPORT: return createImport();
      case EditorPackage.VARIABLE_DECLARATION_BLOCK: return createVariableDeclarationBlock();
      case EditorPackage.VARIABLE_DECLARATION: return createVariableDeclaration();
      case EditorPackage.TYPE_WITH_NAME: return createTypeWithName();
      case EditorPackage.VARIABLE_TYPED: return createVariableTyped();
      case EditorPackage.VARIABLE_DECLARATION_ASSIGN: return createVariableDeclarationAssign();
      case EditorPackage.FREE_VARIABLE: return createFreeVariable();
      case EditorPackage.LOCAL_VARIABLE: return createLocalVariable();
      case EditorPackage.TYPE_EXPRESSION: return createTypeExpression();
      case EditorPackage.TYPE_PARAMETER_LIST: return createTypeParameterList();
      case EditorPackage.TYPE_ARGUMENTS: return createTypeArguments();
      case EditorPackage.TYPE_RESULT: return createTypeResult();
      case EditorPackage.TYPE_PRIMARY_EXPRESSION: return createTypePrimaryExpression();
      case EditorPackage.TYPE_NAME_OR_FUNCTION_CALL: return createTypeNameOrFunctionCall();
      case EditorPackage.TUPLE_DEFINITION: return createTupleDefinition();
      case EditorPackage.TYPE_LITERAL: return createTypeLiteral();
      case EditorPackage.STATEMENT: return createStatement();
      case EditorPackage.BLOCK: return createBlock();
      case EditorPackage.STATEMENT_EXPRESSION: return createStatementExpression();
      case EditorPackage.FOR_STATEMENT: return createForStatement();
      case EditorPackage.WHILE_STATEMENT: return createWhileStatement();
      case EditorPackage.DO_STATEMENT: return createDoStatement();
      case EditorPackage.REPEAT_STATEMENT: return createRepeatStatement();
      case EditorPackage.ITERATE_STATEMENT: return createIterateStatement();
      case EditorPackage.BREAK_STATEMENT: return createBreakStatement();
      case EditorPackage.RETURN_STATEMENT: return createReturnStatement();
      case EditorPackage.IF_STATEMENT: return createIfStatement();
      case EditorPackage.IF_ELSE_STATEMENT: return createIfElseStatement();
      case EditorPackage.EXPR: return createExpr();
      case EditorPackage.PRIMARY_PREFIX: return createPrimaryPrefix();
      case EditorPackage.NAME_OR_FUNCTION_CALL: return createNameOrFunctionCall();
      case EditorPackage.LITERAL: return createLiteral();
      case EditorPackage.CHARACTER_LITERAL: return createCharacterLiteral();
      case EditorPackage.BOOLEAN_LITERAL: return createBooleanLiteral();
      case EditorPackage.LIST_LITERAL: return createListLiteral();
      case EditorPackage.CONDITION_EXPRESSION: return createConditionExpression();
      case EditorPackage.AND_EXPRESSION: return createAndExpression();
      case EditorPackage.INNER_PROD_EXPRESSION: return createInnerProdExpression();
      case EditorPackage.OUTER_PROD_EXPRESSION: return createOuterProdExpression();
      case EditorPackage.HAS_EXPRESSION: return createHasExpression();
      case EditorPackage.CASE_EXPRESSION: return createCaseExpression();
      case EditorPackage.EQUALITY_EXPRESSION: return createEqualityExpression();
      case EditorPackage.RELATIONAL_EXPRESSION: return createRelationalExpression();
      case EditorPackage.IS_EXPRESSION: return createIsExpression();
      case EditorPackage.SEGMENT_EXPRESSION: return createSegmentExpression();
      case EditorPackage.ADDITIVE_EXPRESSION: return createAdditiveExpression();
      case EditorPackage.EXQUO_EXPRESSION: return createExquoExpression();
      case EditorPackage.DIVISION_EXPRESSION: return createDivisionExpression();
      case EditorPackage.QUO_EXPRESSION: return createQuoExpression();
      case EditorPackage.MOD_EXPRESSION: return createModExpression();
      case EditorPackage.REM_EXPRESSION: return createRemExpression();
      case EditorPackage.MULTIPLICATIVE_EXPRESSION: return createMultiplicativeExpression();
      case EditorPackage.EXPONENT_EXPRESSION: return createExponentExpression();
      case EditorPackage.MAP_DEFINITION: return createMapDefinition();
      case EditorPackage.ASSIGN_EXPRESSION: return createAssignExpression();
      case EditorPackage.PRETEND_EXPRESSION: return createPretendExpression();
      case EditorPackage.COERCE_EXPRESSION: return createCoerceExpression();
      case EditorPackage.HINT_TYPE_EXPRESSION: return createHintTypeExpression();
      case EditorPackage.ELT_EXPRESSION: return createEltExpression();
      case EditorPackage.EXPLICIT_TYPE_EXPRESSION: return createExplicitTypeExpression();
      case EditorPackage.UNARY_EXPRESSION: return createUnaryExpression();
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
  public CategoryDef createCategoryDef()
  {
    CategoryDefImpl categoryDef = new CategoryDefImpl();
    return categoryDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PackageDef createPackageDef()
  {
    PackageDefImpl packageDef = new PackageDefImpl();
    return packageDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainDef createDomainDef()
  {
    DomainDefImpl domainDef = new DomainDefImpl();
    return domainDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WherePart createWherePart()
  {
    WherePartImpl wherePart = new WherePartImpl();
    return wherePart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhereAssignments createWhereAssignments()
  {
    WhereAssignmentsImpl whereAssignments = new WhereAssignmentsImpl();
    return whereAssignments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WithPart createWithPart()
  {
    WithPartImpl withPart = new WithPartImpl();
    return withPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AddPart createAddPart()
  {
    AddPartImpl addPart = new AddPartImpl();
    return addPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AddStatements createAddStatements()
  {
    AddStatementsImpl addStatements = new AddStatementsImpl();
    return addStatements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionDefinition createFunctionDefinition()
  {
    FunctionDefinitionImpl functionDefinition = new FunctionDefinitionImpl();
    return functionDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionDefinitionBlock createFunctionDefinitionBlock()
  {
    FunctionDefinitionBlockImpl functionDefinitionBlock = new FunctionDefinitionBlockImpl();
    return functionDefinitionBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionSignature createFunctionSignature()
  {
    FunctionSignatureImpl functionSignature = new FunctionSignatureImpl();
    return functionSignature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MacroDef createMacroDef()
  {
    MacroDefImpl macroDef = new MacroDefImpl();
    return macroDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDeclarationBlock createVariableDeclarationBlock()
  {
    VariableDeclarationBlockImpl variableDeclarationBlock = new VariableDeclarationBlockImpl();
    return variableDeclarationBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDeclaration createVariableDeclaration()
  {
    VariableDeclarationImpl variableDeclaration = new VariableDeclarationImpl();
    return variableDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeWithName createTypeWithName()
  {
    TypeWithNameImpl typeWithName = new TypeWithNameImpl();
    return typeWithName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableTyped createVariableTyped()
  {
    VariableTypedImpl variableTyped = new VariableTypedImpl();
    return variableTyped;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDeclarationAssign createVariableDeclarationAssign()
  {
    VariableDeclarationAssignImpl variableDeclarationAssign = new VariableDeclarationAssignImpl();
    return variableDeclarationAssign;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FreeVariable createFreeVariable()
  {
    FreeVariableImpl freeVariable = new FreeVariableImpl();
    return freeVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocalVariable createLocalVariable()
  {
    LocalVariableImpl localVariable = new LocalVariableImpl();
    return localVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeExpression createTypeExpression()
  {
    TypeExpressionImpl typeExpression = new TypeExpressionImpl();
    return typeExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeParameterList createTypeParameterList()
  {
    TypeParameterListImpl typeParameterList = new TypeParameterListImpl();
    return typeParameterList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeArguments createTypeArguments()
  {
    TypeArgumentsImpl typeArguments = new TypeArgumentsImpl();
    return typeArguments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeResult createTypeResult()
  {
    TypeResultImpl typeResult = new TypeResultImpl();
    return typeResult;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypePrimaryExpression createTypePrimaryExpression()
  {
    TypePrimaryExpressionImpl typePrimaryExpression = new TypePrimaryExpressionImpl();
    return typePrimaryExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeNameOrFunctionCall createTypeNameOrFunctionCall()
  {
    TypeNameOrFunctionCallImpl typeNameOrFunctionCall = new TypeNameOrFunctionCallImpl();
    return typeNameOrFunctionCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TupleDefinition createTupleDefinition()
  {
    TupleDefinitionImpl tupleDefinition = new TupleDefinitionImpl();
    return tupleDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeLiteral createTypeLiteral()
  {
    TypeLiteralImpl typeLiteral = new TypeLiteralImpl();
    return typeLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement createStatement()
  {
    StatementImpl statement = new StatementImpl();
    return statement;
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
  public StatementExpression createStatementExpression()
  {
    StatementExpressionImpl statementExpression = new StatementExpressionImpl();
    return statementExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForStatement createForStatement()
  {
    ForStatementImpl forStatement = new ForStatementImpl();
    return forStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhileStatement createWhileStatement()
  {
    WhileStatementImpl whileStatement = new WhileStatementImpl();
    return whileStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DoStatement createDoStatement()
  {
    DoStatementImpl doStatement = new DoStatementImpl();
    return doStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RepeatStatement createRepeatStatement()
  {
    RepeatStatementImpl repeatStatement = new RepeatStatementImpl();
    return repeatStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IterateStatement createIterateStatement()
  {
    IterateStatementImpl iterateStatement = new IterateStatementImpl();
    return iterateStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BreakStatement createBreakStatement()
  {
    BreakStatementImpl breakStatement = new BreakStatementImpl();
    return breakStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReturnStatement createReturnStatement()
  {
    ReturnStatementImpl returnStatement = new ReturnStatementImpl();
    return returnStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfStatement createIfStatement()
  {
    IfStatementImpl ifStatement = new IfStatementImpl();
    return ifStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfElseStatement createIfElseStatement()
  {
    IfElseStatementImpl ifElseStatement = new IfElseStatementImpl();
    return ifElseStatement;
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
  public PrimaryPrefix createPrimaryPrefix()
  {
    PrimaryPrefixImpl primaryPrefix = new PrimaryPrefixImpl();
    return primaryPrefix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NameOrFunctionCall createNameOrFunctionCall()
  {
    NameOrFunctionCallImpl nameOrFunctionCall = new NameOrFunctionCallImpl();
    return nameOrFunctionCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Literal createLiteral()
  {
    LiteralImpl literal = new LiteralImpl();
    return literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CharacterLiteral createCharacterLiteral()
  {
    CharacterLiteralImpl characterLiteral = new CharacterLiteralImpl();
    return characterLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanLiteral createBooleanLiteral()
  {
    BooleanLiteralImpl booleanLiteral = new BooleanLiteralImpl();
    return booleanLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListLiteral createListLiteral()
  {
    ListLiteralImpl listLiteral = new ListLiteralImpl();
    return listLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConditionExpression createConditionExpression()
  {
    ConditionExpressionImpl conditionExpression = new ConditionExpressionImpl();
    return conditionExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AndExpression createAndExpression()
  {
    AndExpressionImpl andExpression = new AndExpressionImpl();
    return andExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InnerProdExpression createInnerProdExpression()
  {
    InnerProdExpressionImpl innerProdExpression = new InnerProdExpressionImpl();
    return innerProdExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OuterProdExpression createOuterProdExpression()
  {
    OuterProdExpressionImpl outerProdExpression = new OuterProdExpressionImpl();
    return outerProdExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HasExpression createHasExpression()
  {
    HasExpressionImpl hasExpression = new HasExpressionImpl();
    return hasExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CaseExpression createCaseExpression()
  {
    CaseExpressionImpl caseExpression = new CaseExpressionImpl();
    return caseExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EqualityExpression createEqualityExpression()
  {
    EqualityExpressionImpl equalityExpression = new EqualityExpressionImpl();
    return equalityExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelationalExpression createRelationalExpression()
  {
    RelationalExpressionImpl relationalExpression = new RelationalExpressionImpl();
    return relationalExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IsExpression createIsExpression()
  {
    IsExpressionImpl isExpression = new IsExpressionImpl();
    return isExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SegmentExpression createSegmentExpression()
  {
    SegmentExpressionImpl segmentExpression = new SegmentExpressionImpl();
    return segmentExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdditiveExpression createAdditiveExpression()
  {
    AdditiveExpressionImpl additiveExpression = new AdditiveExpressionImpl();
    return additiveExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExquoExpression createExquoExpression()
  {
    ExquoExpressionImpl exquoExpression = new ExquoExpressionImpl();
    return exquoExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DivisionExpression createDivisionExpression()
  {
    DivisionExpressionImpl divisionExpression = new DivisionExpressionImpl();
    return divisionExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QuoExpression createQuoExpression()
  {
    QuoExpressionImpl quoExpression = new QuoExpressionImpl();
    return quoExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModExpression createModExpression()
  {
    ModExpressionImpl modExpression = new ModExpressionImpl();
    return modExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RemExpression createRemExpression()
  {
    RemExpressionImpl remExpression = new RemExpressionImpl();
    return remExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MultiplicativeExpression createMultiplicativeExpression()
  {
    MultiplicativeExpressionImpl multiplicativeExpression = new MultiplicativeExpressionImpl();
    return multiplicativeExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExponentExpression createExponentExpression()
  {
    ExponentExpressionImpl exponentExpression = new ExponentExpressionImpl();
    return exponentExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MapDefinition createMapDefinition()
  {
    MapDefinitionImpl mapDefinition = new MapDefinitionImpl();
    return mapDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssignExpression createAssignExpression()
  {
    AssignExpressionImpl assignExpression = new AssignExpressionImpl();
    return assignExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PretendExpression createPretendExpression()
  {
    PretendExpressionImpl pretendExpression = new PretendExpressionImpl();
    return pretendExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CoerceExpression createCoerceExpression()
  {
    CoerceExpressionImpl coerceExpression = new CoerceExpressionImpl();
    return coerceExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HintTypeExpression createHintTypeExpression()
  {
    HintTypeExpressionImpl hintTypeExpression = new HintTypeExpressionImpl();
    return hintTypeExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EltExpression createEltExpression()
  {
    EltExpressionImpl eltExpression = new EltExpressionImpl();
    return eltExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExplicitTypeExpression createExplicitTypeExpression()
  {
    ExplicitTypeExpressionImpl explicitTypeExpression = new ExplicitTypeExpressionImpl();
    return explicitTypeExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnaryExpression createUnaryExpression()
  {
    UnaryExpressionImpl unaryExpression = new UnaryExpressionImpl();
    return unaryExpression;
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
