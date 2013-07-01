/**
 */
package com.euclideanspace.spad.editor;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.euclideanspace.spad.editor.EditorPackage
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
  EditorFactory eINSTANCE = com.euclideanspace.spad.editor.impl.EditorFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Category Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Category Def</em>'.
   * @generated
   */
  CategoryDef createCategoryDef();

  /**
   * Returns a new object of class '<em>Package Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Package Def</em>'.
   * @generated
   */
  PackageDef createPackageDef();

  /**
   * Returns a new object of class '<em>Domain Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Domain Def</em>'.
   * @generated
   */
  DomainDef createDomainDef();

  /**
   * Returns a new object of class '<em>Where Part</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Where Part</em>'.
   * @generated
   */
  WherePart createWherePart();

  /**
   * Returns a new object of class '<em>Where Assignments</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Where Assignments</em>'.
   * @generated
   */
  WhereAssignments createWhereAssignments();

  /**
   * Returns a new object of class '<em>With Part</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>With Part</em>'.
   * @generated
   */
  WithPart createWithPart();

  /**
   * Returns a new object of class '<em>With Inline</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>With Inline</em>'.
   * @generated
   */
  WithInline createWithInline();

  /**
   * Returns a new object of class '<em>Add Part</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Add Part</em>'.
   * @generated
   */
  AddPart createAddPart();

  /**
   * Returns a new object of class '<em>Add Statements</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Add Statements</em>'.
   * @generated
   */
  AddStatements createAddStatements();

  /**
   * Returns a new object of class '<em>Function Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Definition</em>'.
   * @generated
   */
  FunctionDefinition createFunctionDefinition();

  /**
   * Returns a new object of class '<em>Function Definition Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Definition Block</em>'.
   * @generated
   */
  FunctionDefinitionBlock createFunctionDefinitionBlock();

  /**
   * Returns a new object of class '<em>Function Signature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Signature</em>'.
   * @generated
   */
  FunctionSignature createFunctionSignature();

  /**
   * Returns a new object of class '<em>Macro Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Macro Def</em>'.
   * @generated
   */
  MacroDef createMacroDef();

  /**
   * Returns a new object of class '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import</em>'.
   * @generated
   */
  Import createImport();

  /**
   * Returns a new object of class '<em>Variable Declaration Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Declaration Block</em>'.
   * @generated
   */
  VariableDeclarationBlock createVariableDeclarationBlock();

  /**
   * Returns a new object of class '<em>Variable Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Declaration</em>'.
   * @generated
   */
  VariableDeclaration createVariableDeclaration();

  /**
   * Returns a new object of class '<em>Type With Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type With Name</em>'.
   * @generated
   */
  TypeWithName createTypeWithName();

  /**
   * Returns a new object of class '<em>Variable Typed</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Typed</em>'.
   * @generated
   */
  VariableTyped createVariableTyped();

  /**
   * Returns a new object of class '<em>Variable Declaration Assign</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Declaration Assign</em>'.
   * @generated
   */
  VariableDeclarationAssign createVariableDeclarationAssign();

  /**
   * Returns a new object of class '<em>Free Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Free Variable</em>'.
   * @generated
   */
  FreeVariable createFreeVariable();

  /**
   * Returns a new object of class '<em>Local Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Local Variable</em>'.
   * @generated
   */
  LocalVariable createLocalVariable();

  /**
   * Returns a new object of class '<em>Type Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Expression</em>'.
   * @generated
   */
  TypeExpression createTypeExpression();

  /**
   * Returns a new object of class '<em>Type Parameter List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Parameter List</em>'.
   * @generated
   */
  TypeParameterList createTypeParameterList();

  /**
   * Returns a new object of class '<em>Type Arguments</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Arguments</em>'.
   * @generated
   */
  TypeArguments createTypeArguments();

  /**
   * Returns a new object of class '<em>Type Result</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Result</em>'.
   * @generated
   */
  TypeResult createTypeResult();

  /**
   * Returns a new object of class '<em>Type Primary Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Primary Expression</em>'.
   * @generated
   */
  TypePrimaryExpression createTypePrimaryExpression();

  /**
   * Returns a new object of class '<em>Type Name Or Function Call</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Name Or Function Call</em>'.
   * @generated
   */
  TypeNameOrFunctionCall createTypeNameOrFunctionCall();

  /**
   * Returns a new object of class '<em>Type Name Or Function Call2</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Name Or Function Call2</em>'.
   * @generated
   */
  TypeNameOrFunctionCall2 createTypeNameOrFunctionCall2();

  /**
   * Returns a new object of class '<em>Tuple Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Tuple Definition</em>'.
   * @generated
   */
  TupleDefinition createTupleDefinition();

  /**
   * Returns a new object of class '<em>Type Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Literal</em>'.
   * @generated
   */
  TypeLiteral createTypeLiteral();

  /**
   * Returns a new object of class '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Statement</em>'.
   * @generated
   */
  Statement createStatement();

  /**
   * Returns a new object of class '<em>Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Block</em>'.
   * @generated
   */
  Block createBlock();

  /**
   * Returns a new object of class '<em>Statement Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Statement Expression</em>'.
   * @generated
   */
  StatementExpression createStatementExpression();

  /**
   * Returns a new object of class '<em>For Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>For Statement</em>'.
   * @generated
   */
  ForStatement createForStatement();

  /**
   * Returns a new object of class '<em>While Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>While Statement</em>'.
   * @generated
   */
  WhileStatement createWhileStatement();

  /**
   * Returns a new object of class '<em>Do Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Do Statement</em>'.
   * @generated
   */
  DoStatement createDoStatement();

  /**
   * Returns a new object of class '<em>Repeat Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Repeat Statement</em>'.
   * @generated
   */
  RepeatStatement createRepeatStatement();

  /**
   * Returns a new object of class '<em>Iterate Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Iterate Statement</em>'.
   * @generated
   */
  IterateStatement createIterateStatement();

  /**
   * Returns a new object of class '<em>Break Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Break Statement</em>'.
   * @generated
   */
  BreakStatement createBreakStatement();

  /**
   * Returns a new object of class '<em>Return Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Return Statement</em>'.
   * @generated
   */
  ReturnStatement createReturnStatement();

  /**
   * Returns a new object of class '<em>If Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>If Statement</em>'.
   * @generated
   */
  IfStatement createIfStatement();

  /**
   * Returns a new object of class '<em>If Else Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>If Else Statement</em>'.
   * @generated
   */
  IfElseStatement createIfElseStatement();

  /**
   * Returns a new object of class '<em>Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr</em>'.
   * @generated
   */
  Expr createExpr();

  /**
   * Returns a new object of class '<em>Primary Prefix</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Primary Prefix</em>'.
   * @generated
   */
  PrimaryPrefix createPrimaryPrefix();

  /**
   * Returns a new object of class '<em>Name Or Function Call</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Name Or Function Call</em>'.
   * @generated
   */
  NameOrFunctionCall createNameOrFunctionCall();

  /**
   * Returns a new object of class '<em>Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Literal</em>'.
   * @generated
   */
  Literal createLiteral();

  /**
   * Returns a new object of class '<em>Character Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Character Literal</em>'.
   * @generated
   */
  CharacterLiteral createCharacterLiteral();

  /**
   * Returns a new object of class '<em>Boolean Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Boolean Literal</em>'.
   * @generated
   */
  BooleanLiteral createBooleanLiteral();

  /**
   * Returns a new object of class '<em>List Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>List Literal</em>'.
   * @generated
   */
  ListLiteral createListLiteral();

  /**
   * Returns a new object of class '<em>Exit Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Exit Expression</em>'.
   * @generated
   */
  ExitExpression createExitExpression();

  /**
   * Returns a new object of class '<em>Condition Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Condition Expression</em>'.
   * @generated
   */
  ConditionExpression createConditionExpression();

  /**
   * Returns a new object of class '<em>Or Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Or Expression</em>'.
   * @generated
   */
  OrExpression createOrExpression();

  /**
   * Returns a new object of class '<em>And Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>And Expression</em>'.
   * @generated
   */
  AndExpression createAndExpression();

  /**
   * Returns a new object of class '<em>Inner Prod Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Inner Prod Expression</em>'.
   * @generated
   */
  InnerProdExpression createInnerProdExpression();

  /**
   * Returns a new object of class '<em>Outer Prod Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Outer Prod Expression</em>'.
   * @generated
   */
  OuterProdExpression createOuterProdExpression();

  /**
   * Returns a new object of class '<em>Has Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Has Expression</em>'.
   * @generated
   */
  HasExpression createHasExpression();

  /**
   * Returns a new object of class '<em>Case Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Case Expression</em>'.
   * @generated
   */
  CaseExpression createCaseExpression();

  /**
   * Returns a new object of class '<em>Equality Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Equality Expression</em>'.
   * @generated
   */
  EqualityExpression createEqualityExpression();

  /**
   * Returns a new object of class '<em>Relational Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Relational Expression</em>'.
   * @generated
   */
  RelationalExpression createRelationalExpression();

  /**
   * Returns a new object of class '<em>Is Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Is Expression</em>'.
   * @generated
   */
  IsExpression createIsExpression();

  /**
   * Returns a new object of class '<em>Segment Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Segment Expression</em>'.
   * @generated
   */
  SegmentExpression createSegmentExpression();

  /**
   * Returns a new object of class '<em>Additive Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Additive Expression</em>'.
   * @generated
   */
  AdditiveExpression createAdditiveExpression();

  /**
   * Returns a new object of class '<em>Exquo Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Exquo Expression</em>'.
   * @generated
   */
  ExquoExpression createExquoExpression();

  /**
   * Returns a new object of class '<em>Division Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Division Expression</em>'.
   * @generated
   */
  DivisionExpression createDivisionExpression();

  /**
   * Returns a new object of class '<em>Quo Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Quo Expression</em>'.
   * @generated
   */
  QuoExpression createQuoExpression();

  /**
   * Returns a new object of class '<em>Mod Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mod Expression</em>'.
   * @generated
   */
  ModExpression createModExpression();

  /**
   * Returns a new object of class '<em>Rem Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rem Expression</em>'.
   * @generated
   */
  RemExpression createRemExpression();

  /**
   * Returns a new object of class '<em>Multiplicative Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Multiplicative Expression</em>'.
   * @generated
   */
  MultiplicativeExpression createMultiplicativeExpression();

  /**
   * Returns a new object of class '<em>Exponent Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Exponent Expression</em>'.
   * @generated
   */
  ExponentExpression createExponentExpression();

  /**
   * Returns a new object of class '<em>Map Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Map Definition</em>'.
   * @generated
   */
  MapDefinition createMapDefinition();

  /**
   * Returns a new object of class '<em>Assign Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Assign Expression</em>'.
   * @generated
   */
  AssignExpression createAssignExpression();

  /**
   * Returns a new object of class '<em>Pretend Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pretend Expression</em>'.
   * @generated
   */
  PretendExpression createPretendExpression();

  /**
   * Returns a new object of class '<em>Coerce Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Coerce Expression</em>'.
   * @generated
   */
  CoerceExpression createCoerceExpression();

  /**
   * Returns a new object of class '<em>Hint Type Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Hint Type Expression</em>'.
   * @generated
   */
  HintTypeExpression createHintTypeExpression();

  /**
   * Returns a new object of class '<em>Elt Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Elt Expression</em>'.
   * @generated
   */
  EltExpression createEltExpression();

  /**
   * Returns a new object of class '<em>Explicit Type Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Explicit Type Expression</em>'.
   * @generated
   */
  ExplicitTypeExpression createExplicitTypeExpression();

  /**
   * Returns a new object of class '<em>Unary Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unary Expression</em>'.
   * @generated
   */
  UnaryExpression createUnaryExpression();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  EditorPackage getEditorPackage();

} //EditorFactory
