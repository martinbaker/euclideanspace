/**
 */
package com.euclideanspace.spad.editor.impl;

import com.euclideanspace.spad.editor.AddPart;
import com.euclideanspace.spad.editor.AddStatements;
import com.euclideanspace.spad.editor.AdditiveExpression;
import com.euclideanspace.spad.editor.AndExpression;
import com.euclideanspace.spad.editor.Block;
import com.euclideanspace.spad.editor.BooleanLiteral;
import com.euclideanspace.spad.editor.BreakStatement;
import com.euclideanspace.spad.editor.CaseExpression;
import com.euclideanspace.spad.editor.CategoryDef;
import com.euclideanspace.spad.editor.CharacterLiteral;
import com.euclideanspace.spad.editor.CoerceExpression;
import com.euclideanspace.spad.editor.ConditionExpression;
import com.euclideanspace.spad.editor.DivisionExpression;
import com.euclideanspace.spad.editor.DoStatement;
import com.euclideanspace.spad.editor.DomainDef;
import com.euclideanspace.spad.editor.EditorFactory;
import com.euclideanspace.spad.editor.EditorPackage;
import com.euclideanspace.spad.editor.EltExpression;
import com.euclideanspace.spad.editor.EqualityExpression;
import com.euclideanspace.spad.editor.ExplicitTypeExpression;
import com.euclideanspace.spad.editor.ExponentExpression;
import com.euclideanspace.spad.editor.Expr;
import com.euclideanspace.spad.editor.ExquoExpression;
import com.euclideanspace.spad.editor.ForStatement;
import com.euclideanspace.spad.editor.FreeVariable;
import com.euclideanspace.spad.editor.FunctionDefinition;
import com.euclideanspace.spad.editor.FunctionDefinitionBlock;
import com.euclideanspace.spad.editor.FunctionSignature;
import com.euclideanspace.spad.editor.HasExpression;
import com.euclideanspace.spad.editor.HintTypeExpression;
import com.euclideanspace.spad.editor.IfElseStatement;
import com.euclideanspace.spad.editor.IfStatement;
import com.euclideanspace.spad.editor.Import;
import com.euclideanspace.spad.editor.InnerProdExpression;
import com.euclideanspace.spad.editor.IsExpression;
import com.euclideanspace.spad.editor.IterateStatement;
import com.euclideanspace.spad.editor.ListLiteral;
import com.euclideanspace.spad.editor.Literal;
import com.euclideanspace.spad.editor.LocalVariable;
import com.euclideanspace.spad.editor.MacroDef;
import com.euclideanspace.spad.editor.MapDefinition;
import com.euclideanspace.spad.editor.ModExpression;
import com.euclideanspace.spad.editor.Model;
import com.euclideanspace.spad.editor.MultiplicativeExpression;
import com.euclideanspace.spad.editor.NameOrFunctionCall;
import com.euclideanspace.spad.editor.OuterProdExpression;
import com.euclideanspace.spad.editor.PackageDef;
import com.euclideanspace.spad.editor.PretendExpression;
import com.euclideanspace.spad.editor.PrimaryPrefix;
import com.euclideanspace.spad.editor.QuoExpression;
import com.euclideanspace.spad.editor.RelationalExpression;
import com.euclideanspace.spad.editor.RemExpression;
import com.euclideanspace.spad.editor.RepeatStatement;
import com.euclideanspace.spad.editor.ReturnStatement;
import com.euclideanspace.spad.editor.SegmentExpression;
import com.euclideanspace.spad.editor.Statement;
import com.euclideanspace.spad.editor.StatementExpression;
import com.euclideanspace.spad.editor.TupleDefinition;
import com.euclideanspace.spad.editor.TypeArguments;
import com.euclideanspace.spad.editor.TypeExpression;
import com.euclideanspace.spad.editor.TypeLiteral;
import com.euclideanspace.spad.editor.TypeNameOrFunctionCall;
import com.euclideanspace.spad.editor.TypeParameterList;
import com.euclideanspace.spad.editor.TypePrimaryExpression;
import com.euclideanspace.spad.editor.TypeResult;
import com.euclideanspace.spad.editor.TypeWithName;
import com.euclideanspace.spad.editor.UnaryExpression;
import com.euclideanspace.spad.editor.VariableDeclaration;
import com.euclideanspace.spad.editor.VariableDeclarationAssign;
import com.euclideanspace.spad.editor.VariableDeclarationBlock;
import com.euclideanspace.spad.editor.VariableTyped;
import com.euclideanspace.spad.editor.WhereAssignments;
import com.euclideanspace.spad.editor.WherePart;
import com.euclideanspace.spad.editor.WhileStatement;
import com.euclideanspace.spad.editor.WithPart;

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
  private EClass categoryDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass packageDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass domainDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wherePartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass whereAssignmentsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass withPartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass addPartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass addStatementsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionDefinitionBlockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionSignatureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass macroDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableDeclarationBlockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeWithNameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableTypedEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableDeclarationAssignEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass freeVariableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass localVariableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeParameterListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeArgumentsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeResultEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typePrimaryExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeNameOrFunctionCallEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tupleDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statementEClass = null;

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
  private EClass statementExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass forStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass whileStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass doStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass repeatStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass iterateStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass breakStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass returnStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ifStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ifElseStatementEClass = null;

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
  private EClass primaryPrefixEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nameOrFunctionCallEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass literalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass characterLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleanLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass listLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conditionExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass andExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass innerProdExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass outerProdExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hasExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass caseExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass equalityExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass relationalExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass isExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass segmentExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass additiveExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exquoExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass divisionExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass quoExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass remExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass multiplicativeExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exponentExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mapDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pretendExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hintTypeExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass coerceExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eltExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass explicitTypeExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unaryExpressionEClass = null;

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
   * @see com.euclideanspace.spad.editor.EditorPackage#eNS_URI
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
  public EReference getModel_C()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_P()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_D()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCategoryDef()
  {
    return categoryDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCategoryDef_Name()
  {
    return (EAttribute)categoryDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCategoryDef_Shortname()
  {
    return (EAttribute)categoryDefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCategoryDef_Longname()
  {
    return (EAttribute)categoryDefEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCategoryDef_Longname2()
  {
    return (EAttribute)categoryDefEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCategoryDef_Cp()
  {
    return (EReference)categoryDefEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCategoryDef_ImplName()
  {
    return (EReference)categoryDefEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCategoryDef_W()
  {
    return (EReference)categoryDefEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCategoryDef_A()
  {
    return (EReference)categoryDefEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCategoryDef_Wh5()
  {
    return (EReference)categoryDefEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPackageDef()
  {
    return packageDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPackageDef_Name()
  {
    return (EAttribute)packageDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPackageDef_Shortname()
  {
    return (EAttribute)packageDefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPackageDef_Longname()
  {
    return (EAttribute)packageDefEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPackageDef_Longname2()
  {
    return (EAttribute)packageDefEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPackageDef_Cp()
  {
    return (EReference)packageDefEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPackageDef_ExportName()
  {
    return (EAttribute)packageDefEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPackageDef_ImplName()
  {
    return (EAttribute)packageDefEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPackageDef_W()
  {
    return (EReference)packageDefEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPackageDef_Wh5()
  {
    return (EReference)packageDefEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDomainDef()
  {
    return domainDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDomainDef_Name()
  {
    return (EAttribute)domainDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDomainDef_Shortname5()
  {
    return (EAttribute)domainDefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDomainDef_Longname5()
  {
    return (EAttribute)domainDefEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDomainDef_Longname6()
  {
    return (EAttribute)domainDefEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDomainDef_Cp5()
  {
    return (EReference)domainDefEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDomainDef_ExportName()
  {
    return (EAttribute)domainDefEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDomainDef_ImplName5()
  {
    return (EAttribute)domainDefEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDomainDef_W()
  {
    return (EReference)domainDefEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDomainDef_Wh5()
  {
    return (EReference)domainDefEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWherePart()
  {
    return wherePartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWherePart_Name()
  {
    return (EAttribute)wherePartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWherePart_WhereAssig()
  {
    return (EReference)wherePartEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWherePart_Longname8()
  {
    return (EAttribute)wherePartEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWherePart_Imp()
  {
    return (EReference)wherePartEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWherePart_W8()
  {
    return (EReference)wherePartEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWherePart_Longname9()
  {
    return (EAttribute)wherePartEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWherePart_Fs()
  {
    return (EAttribute)wherePartEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWherePart_Par2()
  {
    return (EAttribute)wherePartEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWherePart_Par3()
  {
    return (EAttribute)wherePartEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWherePart_Add()
  {
    return (EReference)wherePartEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWhereAssignments()
  {
    return whereAssignmentsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWithPart()
  {
    return withPartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWithPart_Name()
  {
    return (EAttribute)withPartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWithPart_Fundec()
  {
    return (EReference)withPartEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAddPart()
  {
    return addPartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAddPart_Name()
  {
    return (EAttribute)addPartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAddPart_T()
  {
    return (EReference)addPartEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAddStatements()
  {
    return addStatementsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAddStatements_T1()
  {
    return (EReference)addStatementsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAddStatements_T13()
  {
    return (EReference)addStatementsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunctionDefinition()
  {
    return functionDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionDefinition_Par3()
  {
    return (EReference)functionDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionDefinition_Par4()
  {
    return (EReference)functionDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionDefinition_Par5()
  {
    return (EReference)functionDefinitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunctionDefinitionBlock()
  {
    return functionDefinitionBlockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunctionDefinitionBlock_FnDecBr()
  {
    return (EAttribute)functionDefinitionBlockEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionDefinitionBlock_FnDecBk()
  {
    return (EReference)functionDefinitionBlockEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunctionSignature()
  {
    return functionSignatureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunctionSignature_FnNam()
  {
    return (EAttribute)functionSignatureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionSignature_Par2()
  {
    return (EReference)functionSignatureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionSignature_Par3()
  {
    return (EReference)functionSignatureEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunctionSignature_Par()
  {
    return (EAttribute)functionSignatureEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunctionSignature_T4()
  {
    return (EAttribute)functionSignatureEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunctionSignature_B1()
  {
    return (EAttribute)functionSignatureEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunctionSignature_T5()
  {
    return (EAttribute)functionSignatureEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunctionSignature_B3()
  {
    return (EAttribute)functionSignatureEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunctionSignature_B2()
  {
    return (EAttribute)functionSignatureEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunctionSignature_T6()
  {
    return (EAttribute)functionSignatureEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMacroDef()
  {
    return macroDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMacroDef_Macroname()
  {
    return (EAttribute)macroDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImport()
  {
    return importEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImport_Impname()
  {
    return (EAttribute)importEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariableDeclarationBlock()
  {
    return variableDeclarationBlockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariableDeclarationBlock_Vardecbr()
  {
    return (EAttribute)variableDeclarationBlockEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariableDeclarationBlock_VardecBlk()
  {
    return (EReference)variableDeclarationBlockEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariableDeclaration()
  {
    return variableDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariableDeclaration_T1()
  {
    return (EReference)variableDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariableDeclaration_V1()
  {
    return (EReference)variableDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariableDeclaration_V2()
  {
    return (EReference)variableDeclarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeWithName()
  {
    return typeWithNameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeWithName_VarName()
  {
    return (EAttribute)typeWithNameEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeWithName_VarNameSt()
  {
    return (EAttribute)typeWithNameEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeWithName_Typ()
  {
    return (EReference)typeWithNameEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariableTyped()
  {
    return variableTypedEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariableTyped_VarName()
  {
    return (EAttribute)variableTypedEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariableTyped_VarNameSt()
  {
    return (EAttribute)variableTypedEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariableTyped_Typ()
  {
    return (EReference)variableTypedEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariableDeclarationAssign()
  {
    return variableDeclarationAssignEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariableDeclarationAssign_VarName()
  {
    return (EAttribute)variableDeclarationAssignEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariableDeclarationAssign_T2()
  {
    return (EAttribute)variableDeclarationAssignEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariableDeclarationAssign_Typ()
  {
    return (EReference)variableDeclarationAssignEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariableDeclarationAssign_T4()
  {
    return (EReference)variableDeclarationAssignEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFreeVariable()
  {
    return freeVariableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFreeVariable_Var()
  {
    return (EAttribute)freeVariableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLocalVariable()
  {
    return localVariableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLocalVariable_Var()
  {
    return (EAttribute)localVariableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeExpression()
  {
    return typeExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeExpression_T2()
  {
    return (EReference)typeExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeExpression_T3()
  {
    return (EReference)typeExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeParameterList()
  {
    return typeParameterListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeParameterList_Tyname()
  {
    return (EAttribute)typeParameterListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeParameterList_Par()
  {
    return (EAttribute)typeParameterListEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeParameterList_Par22()
  {
    return (EReference)typeParameterListEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeParameterList_Par2()
  {
    return (EAttribute)typeParameterListEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeArguments()
  {
    return typeArgumentsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeArguments_T()
  {
    return (EReference)typeArgumentsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeArguments_T2()
  {
    return (EAttribute)typeArgumentsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeArguments_T3()
  {
    return (EAttribute)typeArgumentsEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeArguments_B1()
  {
    return (EAttribute)typeArgumentsEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeArguments_T4()
  {
    return (EReference)typeArgumentsEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeArguments_T16()
  {
    return (EReference)typeArgumentsEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeArguments_T5()
  {
    return (EAttribute)typeArgumentsEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeArguments_T6()
  {
    return (EReference)typeArgumentsEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeArguments_T22()
  {
    return (EReference)typeArgumentsEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeArguments_T21()
  {
    return (EReference)typeArgumentsEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeArguments_T23()
  {
    return (EReference)typeArgumentsEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeArguments_T9()
  {
    return (EAttribute)typeArgumentsEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeArguments_T10()
  {
    return (EReference)typeArgumentsEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeArguments_T25()
  {
    return (EReference)typeArgumentsEClass.getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeArguments_T24()
  {
    return (EReference)typeArgumentsEClass.getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeArguments_T26()
  {
    return (EReference)typeArgumentsEClass.getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeArguments_T11()
  {
    return (EAttribute)typeArgumentsEClass.getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeArguments_T12()
  {
    return (EReference)typeArgumentsEClass.getEStructuralFeatures().get(17);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeArguments_T13()
  {
    return (EReference)typeArgumentsEClass.getEStructuralFeatures().get(18);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeArguments_T15()
  {
    return (EReference)typeArgumentsEClass.getEStructuralFeatures().get(19);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeResult()
  {
    return typeResultEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeResult_T()
  {
    return (EReference)typeResultEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeResult_T2()
  {
    return (EAttribute)typeResultEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeResult_Tyname()
  {
    return (EAttribute)typeResultEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeResult_T7()
  {
    return (EReference)typeResultEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeResult_T8()
  {
    return (EReference)typeResultEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeResult_T21()
  {
    return (EReference)typeResultEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeResult_T23()
  {
    return (EReference)typeResultEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeResult_T10()
  {
    return (EReference)typeResultEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeResult_T11()
  {
    return (EReference)typeResultEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeResult_T24()
  {
    return (EReference)typeResultEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeResult_T26()
  {
    return (EReference)typeResultEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeResult_T12()
  {
    return (EReference)typeResultEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeResult_T13()
  {
    return (EReference)typeResultEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeResult_T15()
  {
    return (EReference)typeResultEClass.getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypePrimaryExpression()
  {
    return typePrimaryExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypePrimaryExpression_T32()
  {
    return (EAttribute)typePrimaryExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypePrimaryExpression_Tyname()
  {
    return (EAttribute)typePrimaryExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypePrimaryExpression_T5()
  {
    return (EReference)typePrimaryExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypePrimaryExpression_T7()
  {
    return (EReference)typePrimaryExpressionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypePrimaryExpression_T8()
  {
    return (EReference)typePrimaryExpressionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypePrimaryExpression_T21()
  {
    return (EReference)typePrimaryExpressionEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypePrimaryExpression_T23()
  {
    return (EReference)typePrimaryExpressionEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypePrimaryExpression_T10()
  {
    return (EReference)typePrimaryExpressionEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypePrimaryExpression_T11()
  {
    return (EReference)typePrimaryExpressionEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypePrimaryExpression_T24()
  {
    return (EReference)typePrimaryExpressionEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypePrimaryExpression_T26()
  {
    return (EReference)typePrimaryExpressionEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypePrimaryExpression_T13()
  {
    return (EReference)typePrimaryExpressionEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypePrimaryExpression_T14()
  {
    return (EReference)typePrimaryExpressionEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeNameOrFunctionCall()
  {
    return typeNameOrFunctionCallEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeNameOrFunctionCall_Tfnname()
  {
    return (EAttribute)typeNameOrFunctionCallEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeNameOrFunctionCall_T4()
  {
    return (EReference)typeNameOrFunctionCallEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeNameOrFunctionCall_T25()
  {
    return (EReference)typeNameOrFunctionCallEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeNameOrFunctionCall_T44()
  {
    return (EReference)typeNameOrFunctionCallEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeNameOrFunctionCall_T45()
  {
    return (EReference)typeNameOrFunctionCallEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeNameOrFunctionCall_T6()
  {
    return (EReference)typeNameOrFunctionCallEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTupleDefinition()
  {
    return tupleDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTupleDefinition_T4()
  {
    return (EReference)tupleDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTupleDefinition_T25()
  {
    return (EReference)tupleDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeLiteral()
  {
    return typeLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeLiteral_T1()
  {
    return (EAttribute)typeLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeLiteral_T22()
  {
    return (EAttribute)typeLiteralEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeLiteral_T34()
  {
    return (EReference)typeLiteralEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeLiteral_T35()
  {
    return (EReference)typeLiteralEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStatement()
  {
    return statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_S1()
  {
    return (EReference)statementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_S3()
  {
    return (EReference)statementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_S4()
  {
    return (EReference)statementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_S4b()
  {
    return (EReference)statementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_S5()
  {
    return (EReference)statementEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_S6()
  {
    return (EReference)statementEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_S7()
  {
    return (EReference)statementEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_S8()
  {
    return (EReference)statementEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_S12()
  {
    return (EReference)statementEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_S9()
  {
    return (EReference)statementEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_S10()
  {
    return (EReference)statementEClass.getEStructuralFeatures().get(10);
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
  public EAttribute getBlock_Stname()
  {
    return (EAttribute)blockEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBlock_StatemBl()
  {
    return (EReference)blockEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStatementExpression()
  {
    return statementExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatementExpression_T()
  {
    return (EReference)statementExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatementExpression_T2()
  {
    return (EReference)statementExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatementExpression_T3()
  {
    return (EReference)statementExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatementExpression_T33()
  {
    return (EReference)statementExpressionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatementExpression_T5()
  {
    return (EReference)statementExpressionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatementExpression_T4()
  {
    return (EReference)statementExpressionEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getForStatement()
  {
    return forStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getForStatement_Stname()
  {
    return (EAttribute)forStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getForStatement_T1()
  {
    return (EReference)forStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getForStatement_S1()
  {
    return (EReference)forStatementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWhileStatement()
  {
    return whileStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWhileStatement_Stname()
  {
    return (EAttribute)whileStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhileStatement_T2()
  {
    return (EReference)whileStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhileStatement_S1()
  {
    return (EReference)whileStatementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDoStatement()
  {
    return doStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDoStatement_Stname()
  {
    return (EAttribute)doStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDoStatement_S1()
  {
    return (EReference)doStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDoStatement_T2()
  {
    return (EReference)doStatementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRepeatStatement()
  {
    return repeatStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRepeatStatement_Stname()
  {
    return (EAttribute)repeatStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRepeatStatement_S1()
  {
    return (EReference)repeatStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIterateStatement()
  {
    return iterateStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIterateStatement_Stname()
  {
    return (EAttribute)iterateStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBreakStatement()
  {
    return breakStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBreakStatement_Stname()
  {
    return (EAttribute)breakStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReturnStatement()
  {
    return returnStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getReturnStatement_Stname()
  {
    return (EAttribute)returnStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReturnStatement_T2()
  {
    return (EReference)returnStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIfStatement()
  {
    return ifStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfStatement_T2()
  {
    return (EReference)ifStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfStatement_S1()
  {
    return (EReference)ifStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfStatement_S2()
  {
    return (EReference)ifStatementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIfStatement_B()
  {
    return (EAttribute)ifStatementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfStatement_S11()
  {
    return (EReference)ifStatementEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfStatement_S12()
  {
    return (EReference)ifStatementEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIfElseStatement()
  {
    return ifElseStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfElseStatement_S2()
  {
    return (EReference)ifElseStatementEClass.getEStructuralFeatures().get(0);
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
  public EAttribute getExpr_Ifname()
  {
    return (EAttribute)exprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpr_Ifpred()
  {
    return (EReference)exprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpr_Thenexp()
  {
    return (EReference)exprEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpr_Elseexp()
  {
    return (EReference)exprEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExpr_E2()
  {
    return (EAttribute)exprEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExpr_E3()
  {
    return (EAttribute)exprEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExpr_E5()
  {
    return (EAttribute)exprEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpr_E6()
  {
    return (EReference)exprEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpr_E22()
  {
    return (EReference)exprEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpr_E21()
  {
    return (EReference)exprEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpr_E23()
  {
    return (EReference)exprEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExpr_E9()
  {
    return (EAttribute)exprEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpr_E10()
  {
    return (EReference)exprEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpr_E25()
  {
    return (EReference)exprEClass.getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpr_E24()
  {
    return (EReference)exprEClass.getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpr_E26()
  {
    return (EReference)exprEClass.getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExpr_E11()
  {
    return (EAttribute)exprEClass.getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpr_E12()
  {
    return (EReference)exprEClass.getEStructuralFeatures().get(17);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpr_E13()
  {
    return (EReference)exprEClass.getEStructuralFeatures().get(18);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPrimaryPrefix()
  {
    return primaryPrefixEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPrimaryPrefix_T4()
  {
    return (EReference)primaryPrefixEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPrimaryPrefix_T25()
  {
    return (EReference)primaryPrefixEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPrimaryPrefix_T7()
  {
    return (EReference)primaryPrefixEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNameOrFunctionCall()
  {
    return nameOrFunctionCallEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNameOrFunctionCall_Fnname()
  {
    return (EAttribute)nameOrFunctionCallEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNameOrFunctionCall_Lsp()
  {
    return (EAttribute)nameOrFunctionCallEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNameOrFunctionCall_T4()
  {
    return (EReference)nameOrFunctionCallEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNameOrFunctionCall_T5()
  {
    return (EReference)nameOrFunctionCallEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNameOrFunctionCall_T14()
  {
    return (EReference)nameOrFunctionCallEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNameOrFunctionCall_T15()
  {
    return (EReference)nameOrFunctionCallEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNameOrFunctionCall_T6()
  {
    return (EReference)nameOrFunctionCallEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLiteral()
  {
    return literalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLiteral_Value()
  {
    return (EAttribute)literalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLiteral_T2()
  {
    return (EAttribute)literalEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCharacterLiteral()
  {
    return characterLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCharacterLiteral_C1()
  {
    return (EAttribute)characterLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBooleanLiteral()
  {
    return booleanLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBooleanLiteral_Litname()
  {
    return (EAttribute)booleanLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getListLiteral()
  {
    return listLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getListLiteral_Litname()
  {
    return (EAttribute)listLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getListLiteral_L2()
  {
    return (EReference)listLiteralEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getListLiteral_T3()
  {
    return (EReference)listLiteralEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getListLiteral_T14()
  {
    return (EReference)listLiteralEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getListLiteral_L5()
  {
    return (EReference)listLiteralEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConditionExpression()
  {
    return conditionExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConditionExpression_Left()
  {
    return (EReference)conditionExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConditionExpression_Op()
  {
    return (EAttribute)conditionExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConditionExpression_Right()
  {
    return (EReference)conditionExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAndExpression()
  {
    return andExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAndExpression_Left()
  {
    return (EReference)andExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAndExpression_Op()
  {
    return (EAttribute)andExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAndExpression_Right()
  {
    return (EReference)andExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInnerProdExpression()
  {
    return innerProdExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInnerProdExpression_Left()
  {
    return (EReference)innerProdExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInnerProdExpression_Op()
  {
    return (EAttribute)innerProdExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInnerProdExpression_Right()
  {
    return (EReference)innerProdExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOuterProdExpression()
  {
    return outerProdExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOuterProdExpression_Left()
  {
    return (EReference)outerProdExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOuterProdExpression_Op()
  {
    return (EAttribute)outerProdExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOuterProdExpression_Right()
  {
    return (EReference)outerProdExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHasExpression()
  {
    return hasExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHasExpression_Left()
  {
    return (EReference)hasExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHasExpression_Op()
  {
    return (EAttribute)hasExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHasExpression_RightType()
  {
    return (EReference)hasExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCaseExpression()
  {
    return caseExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCaseExpression_Left()
  {
    return (EReference)caseExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCaseExpression_Op()
  {
    return (EAttribute)caseExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCaseExpression_Right()
  {
    return (EReference)caseExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEqualityExpression()
  {
    return equalityExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEqualityExpression_Left()
  {
    return (EReference)equalityExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEqualityExpression_Op()
  {
    return (EAttribute)equalityExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEqualityExpression_Right()
  {
    return (EReference)equalityExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRelationalExpression()
  {
    return relationalExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelationalExpression_Left()
  {
    return (EReference)relationalExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRelationalExpression_Op()
  {
    return (EAttribute)relationalExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelationalExpression_Right()
  {
    return (EReference)relationalExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIsExpression()
  {
    return isExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIsExpression_Left()
  {
    return (EReference)isExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIsExpression_Op()
  {
    return (EAttribute)isExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIsExpression_RightType()
  {
    return (EReference)isExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSegmentExpression()
  {
    return segmentExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSegmentExpression_Left()
  {
    return (EReference)segmentExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSegmentExpression_Op()
  {
    return (EAttribute)segmentExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSegmentExpression_Right()
  {
    return (EReference)segmentExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAdditiveExpression()
  {
    return additiveExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAdditiveExpression_Left()
  {
    return (EReference)additiveExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAdditiveExpression_Op()
  {
    return (EAttribute)additiveExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAdditiveExpression_Right()
  {
    return (EReference)additiveExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExquoExpression()
  {
    return exquoExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExquoExpression_Left()
  {
    return (EReference)exquoExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExquoExpression_Op()
  {
    return (EAttribute)exquoExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExquoExpression_Right()
  {
    return (EReference)exquoExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDivisionExpression()
  {
    return divisionExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDivisionExpression_Left()
  {
    return (EReference)divisionExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDivisionExpression_Op()
  {
    return (EAttribute)divisionExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDivisionExpression_Right()
  {
    return (EReference)divisionExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQuoExpression()
  {
    return quoExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQuoExpression_Left()
  {
    return (EReference)quoExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQuoExpression_Op()
  {
    return (EAttribute)quoExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQuoExpression_Right()
  {
    return (EReference)quoExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModExpression()
  {
    return modExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModExpression_Left()
  {
    return (EReference)modExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModExpression_Op()
  {
    return (EAttribute)modExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModExpression_Right()
  {
    return (EReference)modExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRemExpression()
  {
    return remExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRemExpression_Left()
  {
    return (EReference)remExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRemExpression_Op()
  {
    return (EAttribute)remExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRemExpression_Right()
  {
    return (EReference)remExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMultiplicativeExpression()
  {
    return multiplicativeExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMultiplicativeExpression_Left()
  {
    return (EReference)multiplicativeExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMultiplicativeExpression_Op()
  {
    return (EAttribute)multiplicativeExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMultiplicativeExpression_Right()
  {
    return (EReference)multiplicativeExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExponentExpression()
  {
    return exponentExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExponentExpression_Left()
  {
    return (EReference)exponentExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExponentExpression_Op()
  {
    return (EAttribute)exponentExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExponentExpression_Right()
  {
    return (EReference)exponentExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMapDefinition()
  {
    return mapDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMapDefinition_Left()
  {
    return (EReference)mapDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMapDefinition_Op()
  {
    return (EAttribute)mapDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMapDefinition_Right()
  {
    return (EReference)mapDefinitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPretendExpression()
  {
    return pretendExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPretendExpression_Left()
  {
    return (EReference)pretendExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPretendExpression_Op()
  {
    return (EAttribute)pretendExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPretendExpression_RightType()
  {
    return (EReference)pretendExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHintTypeExpression()
  {
    return hintTypeExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHintTypeExpression_Left()
  {
    return (EReference)hintTypeExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHintTypeExpression_Op()
  {
    return (EAttribute)hintTypeExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHintTypeExpression_RightType()
  {
    return (EReference)hintTypeExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCoerceExpression()
  {
    return coerceExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCoerceExpression_Left()
  {
    return (EReference)coerceExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCoerceExpression_Op()
  {
    return (EAttribute)coerceExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCoerceExpression_RightType()
  {
    return (EReference)coerceExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEltExpression()
  {
    return eltExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEltExpression_Left()
  {
    return (EReference)eltExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEltExpression_Op()
  {
    return (EAttribute)eltExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEltExpression_Right()
  {
    return (EReference)eltExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExplicitTypeExpression()
  {
    return explicitTypeExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExplicitTypeExpression_Left()
  {
    return (EReference)explicitTypeExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExplicitTypeExpression_Op()
  {
    return (EAttribute)explicitTypeExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExplicitTypeExpression_RightType()
  {
    return (EReference)explicitTypeExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnaryExpression()
  {
    return unaryExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUnaryExpression_Uop()
  {
    return (EAttribute)unaryExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnaryExpression_Expr()
  {
    return (EReference)unaryExpressionEClass.getEStructuralFeatures().get(1);
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
    createEReference(modelEClass, MODEL__C);
    createEReference(modelEClass, MODEL__P);
    createEReference(modelEClass, MODEL__D);

    categoryDefEClass = createEClass(CATEGORY_DEF);
    createEAttribute(categoryDefEClass, CATEGORY_DEF__NAME);
    createEAttribute(categoryDefEClass, CATEGORY_DEF__SHORTNAME);
    createEAttribute(categoryDefEClass, CATEGORY_DEF__LONGNAME);
    createEAttribute(categoryDefEClass, CATEGORY_DEF__LONGNAME2);
    createEReference(categoryDefEClass, CATEGORY_DEF__CP);
    createEReference(categoryDefEClass, CATEGORY_DEF__IMPL_NAME);
    createEReference(categoryDefEClass, CATEGORY_DEF__W);
    createEReference(categoryDefEClass, CATEGORY_DEF__A);
    createEReference(categoryDefEClass, CATEGORY_DEF__WH5);

    packageDefEClass = createEClass(PACKAGE_DEF);
    createEAttribute(packageDefEClass, PACKAGE_DEF__NAME);
    createEAttribute(packageDefEClass, PACKAGE_DEF__SHORTNAME);
    createEAttribute(packageDefEClass, PACKAGE_DEF__LONGNAME);
    createEAttribute(packageDefEClass, PACKAGE_DEF__LONGNAME2);
    createEReference(packageDefEClass, PACKAGE_DEF__CP);
    createEAttribute(packageDefEClass, PACKAGE_DEF__EXPORT_NAME);
    createEAttribute(packageDefEClass, PACKAGE_DEF__IMPL_NAME);
    createEReference(packageDefEClass, PACKAGE_DEF__W);
    createEReference(packageDefEClass, PACKAGE_DEF__WH5);

    domainDefEClass = createEClass(DOMAIN_DEF);
    createEAttribute(domainDefEClass, DOMAIN_DEF__NAME);
    createEAttribute(domainDefEClass, DOMAIN_DEF__SHORTNAME5);
    createEAttribute(domainDefEClass, DOMAIN_DEF__LONGNAME5);
    createEAttribute(domainDefEClass, DOMAIN_DEF__LONGNAME6);
    createEReference(domainDefEClass, DOMAIN_DEF__CP5);
    createEAttribute(domainDefEClass, DOMAIN_DEF__EXPORT_NAME);
    createEAttribute(domainDefEClass, DOMAIN_DEF__IMPL_NAME5);
    createEReference(domainDefEClass, DOMAIN_DEF__W);
    createEReference(domainDefEClass, DOMAIN_DEF__WH5);

    wherePartEClass = createEClass(WHERE_PART);
    createEAttribute(wherePartEClass, WHERE_PART__NAME);
    createEReference(wherePartEClass, WHERE_PART__WHERE_ASSIG);
    createEAttribute(wherePartEClass, WHERE_PART__LONGNAME8);
    createEReference(wherePartEClass, WHERE_PART__IMP);
    createEReference(wherePartEClass, WHERE_PART__W8);
    createEAttribute(wherePartEClass, WHERE_PART__LONGNAME9);
    createEAttribute(wherePartEClass, WHERE_PART__FS);
    createEAttribute(wherePartEClass, WHERE_PART__PAR2);
    createEAttribute(wherePartEClass, WHERE_PART__PAR3);
    createEReference(wherePartEClass, WHERE_PART__ADD);

    whereAssignmentsEClass = createEClass(WHERE_ASSIGNMENTS);

    withPartEClass = createEClass(WITH_PART);
    createEAttribute(withPartEClass, WITH_PART__NAME);
    createEReference(withPartEClass, WITH_PART__FUNDEC);

    addPartEClass = createEClass(ADD_PART);
    createEAttribute(addPartEClass, ADD_PART__NAME);
    createEReference(addPartEClass, ADD_PART__T);

    addStatementsEClass = createEClass(ADD_STATEMENTS);
    createEReference(addStatementsEClass, ADD_STATEMENTS__T1);
    createEReference(addStatementsEClass, ADD_STATEMENTS__T13);

    functionDefinitionEClass = createEClass(FUNCTION_DEFINITION);
    createEReference(functionDefinitionEClass, FUNCTION_DEFINITION__PAR3);
    createEReference(functionDefinitionEClass, FUNCTION_DEFINITION__PAR4);
    createEReference(functionDefinitionEClass, FUNCTION_DEFINITION__PAR5);

    functionDefinitionBlockEClass = createEClass(FUNCTION_DEFINITION_BLOCK);
    createEAttribute(functionDefinitionBlockEClass, FUNCTION_DEFINITION_BLOCK__FN_DEC_BR);
    createEReference(functionDefinitionBlockEClass, FUNCTION_DEFINITION_BLOCK__FN_DEC_BK);

    functionSignatureEClass = createEClass(FUNCTION_SIGNATURE);
    createEAttribute(functionSignatureEClass, FUNCTION_SIGNATURE__FN_NAM);
    createEReference(functionSignatureEClass, FUNCTION_SIGNATURE__PAR2);
    createEReference(functionSignatureEClass, FUNCTION_SIGNATURE__PAR3);
    createEAttribute(functionSignatureEClass, FUNCTION_SIGNATURE__PAR);
    createEAttribute(functionSignatureEClass, FUNCTION_SIGNATURE__T4);
    createEAttribute(functionSignatureEClass, FUNCTION_SIGNATURE__B1);
    createEAttribute(functionSignatureEClass, FUNCTION_SIGNATURE__T5);
    createEAttribute(functionSignatureEClass, FUNCTION_SIGNATURE__B3);
    createEAttribute(functionSignatureEClass, FUNCTION_SIGNATURE__B2);
    createEAttribute(functionSignatureEClass, FUNCTION_SIGNATURE__T6);

    macroDefEClass = createEClass(MACRO_DEF);
    createEAttribute(macroDefEClass, MACRO_DEF__MACRONAME);

    importEClass = createEClass(IMPORT);
    createEAttribute(importEClass, IMPORT__IMPNAME);

    variableDeclarationBlockEClass = createEClass(VARIABLE_DECLARATION_BLOCK);
    createEAttribute(variableDeclarationBlockEClass, VARIABLE_DECLARATION_BLOCK__VARDECBR);
    createEReference(variableDeclarationBlockEClass, VARIABLE_DECLARATION_BLOCK__VARDEC_BLK);

    variableDeclarationEClass = createEClass(VARIABLE_DECLARATION);
    createEReference(variableDeclarationEClass, VARIABLE_DECLARATION__T1);
    createEReference(variableDeclarationEClass, VARIABLE_DECLARATION__V1);
    createEReference(variableDeclarationEClass, VARIABLE_DECLARATION__V2);

    typeWithNameEClass = createEClass(TYPE_WITH_NAME);
    createEAttribute(typeWithNameEClass, TYPE_WITH_NAME__VAR_NAME);
    createEAttribute(typeWithNameEClass, TYPE_WITH_NAME__VAR_NAME_ST);
    createEReference(typeWithNameEClass, TYPE_WITH_NAME__TYP);

    variableTypedEClass = createEClass(VARIABLE_TYPED);
    createEAttribute(variableTypedEClass, VARIABLE_TYPED__VAR_NAME);
    createEAttribute(variableTypedEClass, VARIABLE_TYPED__VAR_NAME_ST);
    createEReference(variableTypedEClass, VARIABLE_TYPED__TYP);

    variableDeclarationAssignEClass = createEClass(VARIABLE_DECLARATION_ASSIGN);
    createEAttribute(variableDeclarationAssignEClass, VARIABLE_DECLARATION_ASSIGN__VAR_NAME);
    createEAttribute(variableDeclarationAssignEClass, VARIABLE_DECLARATION_ASSIGN__T2);
    createEReference(variableDeclarationAssignEClass, VARIABLE_DECLARATION_ASSIGN__TYP);
    createEReference(variableDeclarationAssignEClass, VARIABLE_DECLARATION_ASSIGN__T4);

    freeVariableEClass = createEClass(FREE_VARIABLE);
    createEAttribute(freeVariableEClass, FREE_VARIABLE__VAR);

    localVariableEClass = createEClass(LOCAL_VARIABLE);
    createEAttribute(localVariableEClass, LOCAL_VARIABLE__VAR);

    typeExpressionEClass = createEClass(TYPE_EXPRESSION);
    createEReference(typeExpressionEClass, TYPE_EXPRESSION__T2);
    createEReference(typeExpressionEClass, TYPE_EXPRESSION__T3);

    typeParameterListEClass = createEClass(TYPE_PARAMETER_LIST);
    createEAttribute(typeParameterListEClass, TYPE_PARAMETER_LIST__TYNAME);
    createEAttribute(typeParameterListEClass, TYPE_PARAMETER_LIST__PAR);
    createEReference(typeParameterListEClass, TYPE_PARAMETER_LIST__PAR22);
    createEAttribute(typeParameterListEClass, TYPE_PARAMETER_LIST__PAR2);

    typeArgumentsEClass = createEClass(TYPE_ARGUMENTS);
    createEReference(typeArgumentsEClass, TYPE_ARGUMENTS__T);
    createEAttribute(typeArgumentsEClass, TYPE_ARGUMENTS__T2);
    createEAttribute(typeArgumentsEClass, TYPE_ARGUMENTS__T3);
    createEAttribute(typeArgumentsEClass, TYPE_ARGUMENTS__B1);
    createEReference(typeArgumentsEClass, TYPE_ARGUMENTS__T4);
    createEReference(typeArgumentsEClass, TYPE_ARGUMENTS__T16);
    createEAttribute(typeArgumentsEClass, TYPE_ARGUMENTS__T5);
    createEReference(typeArgumentsEClass, TYPE_ARGUMENTS__T6);
    createEReference(typeArgumentsEClass, TYPE_ARGUMENTS__T22);
    createEReference(typeArgumentsEClass, TYPE_ARGUMENTS__T21);
    createEReference(typeArgumentsEClass, TYPE_ARGUMENTS__T23);
    createEAttribute(typeArgumentsEClass, TYPE_ARGUMENTS__T9);
    createEReference(typeArgumentsEClass, TYPE_ARGUMENTS__T10);
    createEReference(typeArgumentsEClass, TYPE_ARGUMENTS__T25);
    createEReference(typeArgumentsEClass, TYPE_ARGUMENTS__T24);
    createEReference(typeArgumentsEClass, TYPE_ARGUMENTS__T26);
    createEAttribute(typeArgumentsEClass, TYPE_ARGUMENTS__T11);
    createEReference(typeArgumentsEClass, TYPE_ARGUMENTS__T12);
    createEReference(typeArgumentsEClass, TYPE_ARGUMENTS__T13);
    createEReference(typeArgumentsEClass, TYPE_ARGUMENTS__T15);

    typeResultEClass = createEClass(TYPE_RESULT);
    createEReference(typeResultEClass, TYPE_RESULT__T);
    createEAttribute(typeResultEClass, TYPE_RESULT__T2);
    createEAttribute(typeResultEClass, TYPE_RESULT__TYNAME);
    createEReference(typeResultEClass, TYPE_RESULT__T7);
    createEReference(typeResultEClass, TYPE_RESULT__T8);
    createEReference(typeResultEClass, TYPE_RESULT__T21);
    createEReference(typeResultEClass, TYPE_RESULT__T23);
    createEReference(typeResultEClass, TYPE_RESULT__T10);
    createEReference(typeResultEClass, TYPE_RESULT__T11);
    createEReference(typeResultEClass, TYPE_RESULT__T24);
    createEReference(typeResultEClass, TYPE_RESULT__T26);
    createEReference(typeResultEClass, TYPE_RESULT__T12);
    createEReference(typeResultEClass, TYPE_RESULT__T13);
    createEReference(typeResultEClass, TYPE_RESULT__T15);

    typePrimaryExpressionEClass = createEClass(TYPE_PRIMARY_EXPRESSION);
    createEAttribute(typePrimaryExpressionEClass, TYPE_PRIMARY_EXPRESSION__T32);
    createEAttribute(typePrimaryExpressionEClass, TYPE_PRIMARY_EXPRESSION__TYNAME);
    createEReference(typePrimaryExpressionEClass, TYPE_PRIMARY_EXPRESSION__T5);
    createEReference(typePrimaryExpressionEClass, TYPE_PRIMARY_EXPRESSION__T7);
    createEReference(typePrimaryExpressionEClass, TYPE_PRIMARY_EXPRESSION__T8);
    createEReference(typePrimaryExpressionEClass, TYPE_PRIMARY_EXPRESSION__T21);
    createEReference(typePrimaryExpressionEClass, TYPE_PRIMARY_EXPRESSION__T23);
    createEReference(typePrimaryExpressionEClass, TYPE_PRIMARY_EXPRESSION__T10);
    createEReference(typePrimaryExpressionEClass, TYPE_PRIMARY_EXPRESSION__T11);
    createEReference(typePrimaryExpressionEClass, TYPE_PRIMARY_EXPRESSION__T24);
    createEReference(typePrimaryExpressionEClass, TYPE_PRIMARY_EXPRESSION__T26);
    createEReference(typePrimaryExpressionEClass, TYPE_PRIMARY_EXPRESSION__T13);
    createEReference(typePrimaryExpressionEClass, TYPE_PRIMARY_EXPRESSION__T14);

    typeNameOrFunctionCallEClass = createEClass(TYPE_NAME_OR_FUNCTION_CALL);
    createEAttribute(typeNameOrFunctionCallEClass, TYPE_NAME_OR_FUNCTION_CALL__TFNNAME);
    createEReference(typeNameOrFunctionCallEClass, TYPE_NAME_OR_FUNCTION_CALL__T4);
    createEReference(typeNameOrFunctionCallEClass, TYPE_NAME_OR_FUNCTION_CALL__T25);
    createEReference(typeNameOrFunctionCallEClass, TYPE_NAME_OR_FUNCTION_CALL__T44);
    createEReference(typeNameOrFunctionCallEClass, TYPE_NAME_OR_FUNCTION_CALL__T45);
    createEReference(typeNameOrFunctionCallEClass, TYPE_NAME_OR_FUNCTION_CALL__T6);

    tupleDefinitionEClass = createEClass(TUPLE_DEFINITION);
    createEReference(tupleDefinitionEClass, TUPLE_DEFINITION__T4);
    createEReference(tupleDefinitionEClass, TUPLE_DEFINITION__T25);

    typeLiteralEClass = createEClass(TYPE_LITERAL);
    createEAttribute(typeLiteralEClass, TYPE_LITERAL__T1);
    createEAttribute(typeLiteralEClass, TYPE_LITERAL__T22);
    createEReference(typeLiteralEClass, TYPE_LITERAL__T34);
    createEReference(typeLiteralEClass, TYPE_LITERAL__T35);

    statementEClass = createEClass(STATEMENT);
    createEReference(statementEClass, STATEMENT__S1);
    createEReference(statementEClass, STATEMENT__S3);
    createEReference(statementEClass, STATEMENT__S4);
    createEReference(statementEClass, STATEMENT__S4B);
    createEReference(statementEClass, STATEMENT__S5);
    createEReference(statementEClass, STATEMENT__S6);
    createEReference(statementEClass, STATEMENT__S7);
    createEReference(statementEClass, STATEMENT__S8);
    createEReference(statementEClass, STATEMENT__S12);
    createEReference(statementEClass, STATEMENT__S9);
    createEReference(statementEClass, STATEMENT__S10);

    blockEClass = createEClass(BLOCK);
    createEAttribute(blockEClass, BLOCK__STNAME);
    createEReference(blockEClass, BLOCK__STATEM_BL);

    statementExpressionEClass = createEClass(STATEMENT_EXPRESSION);
    createEReference(statementExpressionEClass, STATEMENT_EXPRESSION__T);
    createEReference(statementExpressionEClass, STATEMENT_EXPRESSION__T2);
    createEReference(statementExpressionEClass, STATEMENT_EXPRESSION__T3);
    createEReference(statementExpressionEClass, STATEMENT_EXPRESSION__T33);
    createEReference(statementExpressionEClass, STATEMENT_EXPRESSION__T5);
    createEReference(statementExpressionEClass, STATEMENT_EXPRESSION__T4);

    forStatementEClass = createEClass(FOR_STATEMENT);
    createEAttribute(forStatementEClass, FOR_STATEMENT__STNAME);
    createEReference(forStatementEClass, FOR_STATEMENT__T1);
    createEReference(forStatementEClass, FOR_STATEMENT__S1);

    whileStatementEClass = createEClass(WHILE_STATEMENT);
    createEAttribute(whileStatementEClass, WHILE_STATEMENT__STNAME);
    createEReference(whileStatementEClass, WHILE_STATEMENT__T2);
    createEReference(whileStatementEClass, WHILE_STATEMENT__S1);

    doStatementEClass = createEClass(DO_STATEMENT);
    createEAttribute(doStatementEClass, DO_STATEMENT__STNAME);
    createEReference(doStatementEClass, DO_STATEMENT__S1);
    createEReference(doStatementEClass, DO_STATEMENT__T2);

    repeatStatementEClass = createEClass(REPEAT_STATEMENT);
    createEAttribute(repeatStatementEClass, REPEAT_STATEMENT__STNAME);
    createEReference(repeatStatementEClass, REPEAT_STATEMENT__S1);

    iterateStatementEClass = createEClass(ITERATE_STATEMENT);
    createEAttribute(iterateStatementEClass, ITERATE_STATEMENT__STNAME);

    breakStatementEClass = createEClass(BREAK_STATEMENT);
    createEAttribute(breakStatementEClass, BREAK_STATEMENT__STNAME);

    returnStatementEClass = createEClass(RETURN_STATEMENT);
    createEAttribute(returnStatementEClass, RETURN_STATEMENT__STNAME);
    createEReference(returnStatementEClass, RETURN_STATEMENT__T2);

    ifStatementEClass = createEClass(IF_STATEMENT);
    createEReference(ifStatementEClass, IF_STATEMENT__T2);
    createEReference(ifStatementEClass, IF_STATEMENT__S1);
    createEReference(ifStatementEClass, IF_STATEMENT__S2);
    createEAttribute(ifStatementEClass, IF_STATEMENT__B);
    createEReference(ifStatementEClass, IF_STATEMENT__S11);
    createEReference(ifStatementEClass, IF_STATEMENT__S12);

    ifElseStatementEClass = createEClass(IF_ELSE_STATEMENT);
    createEReference(ifElseStatementEClass, IF_ELSE_STATEMENT__S2);

    exprEClass = createEClass(EXPR);
    createEAttribute(exprEClass, EXPR__IFNAME);
    createEReference(exprEClass, EXPR__IFPRED);
    createEReference(exprEClass, EXPR__THENEXP);
    createEReference(exprEClass, EXPR__ELSEEXP);
    createEAttribute(exprEClass, EXPR__E2);
    createEAttribute(exprEClass, EXPR__E3);
    createEAttribute(exprEClass, EXPR__E5);
    createEReference(exprEClass, EXPR__E6);
    createEReference(exprEClass, EXPR__E22);
    createEReference(exprEClass, EXPR__E21);
    createEReference(exprEClass, EXPR__E23);
    createEAttribute(exprEClass, EXPR__E9);
    createEReference(exprEClass, EXPR__E10);
    createEReference(exprEClass, EXPR__E25);
    createEReference(exprEClass, EXPR__E24);
    createEReference(exprEClass, EXPR__E26);
    createEAttribute(exprEClass, EXPR__E11);
    createEReference(exprEClass, EXPR__E12);
    createEReference(exprEClass, EXPR__E13);

    primaryPrefixEClass = createEClass(PRIMARY_PREFIX);
    createEReference(primaryPrefixEClass, PRIMARY_PREFIX__T4);
    createEReference(primaryPrefixEClass, PRIMARY_PREFIX__T25);
    createEReference(primaryPrefixEClass, PRIMARY_PREFIX__T7);

    nameOrFunctionCallEClass = createEClass(NAME_OR_FUNCTION_CALL);
    createEAttribute(nameOrFunctionCallEClass, NAME_OR_FUNCTION_CALL__FNNAME);
    createEAttribute(nameOrFunctionCallEClass, NAME_OR_FUNCTION_CALL__LSP);
    createEReference(nameOrFunctionCallEClass, NAME_OR_FUNCTION_CALL__T4);
    createEReference(nameOrFunctionCallEClass, NAME_OR_FUNCTION_CALL__T5);
    createEReference(nameOrFunctionCallEClass, NAME_OR_FUNCTION_CALL__T14);
    createEReference(nameOrFunctionCallEClass, NAME_OR_FUNCTION_CALL__T15);
    createEReference(nameOrFunctionCallEClass, NAME_OR_FUNCTION_CALL__T6);

    literalEClass = createEClass(LITERAL);
    createEAttribute(literalEClass, LITERAL__VALUE);
    createEAttribute(literalEClass, LITERAL__T2);

    characterLiteralEClass = createEClass(CHARACTER_LITERAL);
    createEAttribute(characterLiteralEClass, CHARACTER_LITERAL__C1);

    booleanLiteralEClass = createEClass(BOOLEAN_LITERAL);
    createEAttribute(booleanLiteralEClass, BOOLEAN_LITERAL__LITNAME);

    listLiteralEClass = createEClass(LIST_LITERAL);
    createEAttribute(listLiteralEClass, LIST_LITERAL__LITNAME);
    createEReference(listLiteralEClass, LIST_LITERAL__L2);
    createEReference(listLiteralEClass, LIST_LITERAL__T3);
    createEReference(listLiteralEClass, LIST_LITERAL__T14);
    createEReference(listLiteralEClass, LIST_LITERAL__L5);

    conditionExpressionEClass = createEClass(CONDITION_EXPRESSION);
    createEReference(conditionExpressionEClass, CONDITION_EXPRESSION__LEFT);
    createEAttribute(conditionExpressionEClass, CONDITION_EXPRESSION__OP);
    createEReference(conditionExpressionEClass, CONDITION_EXPRESSION__RIGHT);

    andExpressionEClass = createEClass(AND_EXPRESSION);
    createEReference(andExpressionEClass, AND_EXPRESSION__LEFT);
    createEAttribute(andExpressionEClass, AND_EXPRESSION__OP);
    createEReference(andExpressionEClass, AND_EXPRESSION__RIGHT);

    innerProdExpressionEClass = createEClass(INNER_PROD_EXPRESSION);
    createEReference(innerProdExpressionEClass, INNER_PROD_EXPRESSION__LEFT);
    createEAttribute(innerProdExpressionEClass, INNER_PROD_EXPRESSION__OP);
    createEReference(innerProdExpressionEClass, INNER_PROD_EXPRESSION__RIGHT);

    outerProdExpressionEClass = createEClass(OUTER_PROD_EXPRESSION);
    createEReference(outerProdExpressionEClass, OUTER_PROD_EXPRESSION__LEFT);
    createEAttribute(outerProdExpressionEClass, OUTER_PROD_EXPRESSION__OP);
    createEReference(outerProdExpressionEClass, OUTER_PROD_EXPRESSION__RIGHT);

    hasExpressionEClass = createEClass(HAS_EXPRESSION);
    createEReference(hasExpressionEClass, HAS_EXPRESSION__LEFT);
    createEAttribute(hasExpressionEClass, HAS_EXPRESSION__OP);
    createEReference(hasExpressionEClass, HAS_EXPRESSION__RIGHT_TYPE);

    caseExpressionEClass = createEClass(CASE_EXPRESSION);
    createEReference(caseExpressionEClass, CASE_EXPRESSION__LEFT);
    createEAttribute(caseExpressionEClass, CASE_EXPRESSION__OP);
    createEReference(caseExpressionEClass, CASE_EXPRESSION__RIGHT);

    equalityExpressionEClass = createEClass(EQUALITY_EXPRESSION);
    createEReference(equalityExpressionEClass, EQUALITY_EXPRESSION__LEFT);
    createEAttribute(equalityExpressionEClass, EQUALITY_EXPRESSION__OP);
    createEReference(equalityExpressionEClass, EQUALITY_EXPRESSION__RIGHT);

    relationalExpressionEClass = createEClass(RELATIONAL_EXPRESSION);
    createEReference(relationalExpressionEClass, RELATIONAL_EXPRESSION__LEFT);
    createEAttribute(relationalExpressionEClass, RELATIONAL_EXPRESSION__OP);
    createEReference(relationalExpressionEClass, RELATIONAL_EXPRESSION__RIGHT);

    isExpressionEClass = createEClass(IS_EXPRESSION);
    createEReference(isExpressionEClass, IS_EXPRESSION__LEFT);
    createEAttribute(isExpressionEClass, IS_EXPRESSION__OP);
    createEReference(isExpressionEClass, IS_EXPRESSION__RIGHT_TYPE);

    segmentExpressionEClass = createEClass(SEGMENT_EXPRESSION);
    createEReference(segmentExpressionEClass, SEGMENT_EXPRESSION__LEFT);
    createEAttribute(segmentExpressionEClass, SEGMENT_EXPRESSION__OP);
    createEReference(segmentExpressionEClass, SEGMENT_EXPRESSION__RIGHT);

    additiveExpressionEClass = createEClass(ADDITIVE_EXPRESSION);
    createEReference(additiveExpressionEClass, ADDITIVE_EXPRESSION__LEFT);
    createEAttribute(additiveExpressionEClass, ADDITIVE_EXPRESSION__OP);
    createEReference(additiveExpressionEClass, ADDITIVE_EXPRESSION__RIGHT);

    exquoExpressionEClass = createEClass(EXQUO_EXPRESSION);
    createEReference(exquoExpressionEClass, EXQUO_EXPRESSION__LEFT);
    createEAttribute(exquoExpressionEClass, EXQUO_EXPRESSION__OP);
    createEReference(exquoExpressionEClass, EXQUO_EXPRESSION__RIGHT);

    divisionExpressionEClass = createEClass(DIVISION_EXPRESSION);
    createEReference(divisionExpressionEClass, DIVISION_EXPRESSION__LEFT);
    createEAttribute(divisionExpressionEClass, DIVISION_EXPRESSION__OP);
    createEReference(divisionExpressionEClass, DIVISION_EXPRESSION__RIGHT);

    quoExpressionEClass = createEClass(QUO_EXPRESSION);
    createEReference(quoExpressionEClass, QUO_EXPRESSION__LEFT);
    createEAttribute(quoExpressionEClass, QUO_EXPRESSION__OP);
    createEReference(quoExpressionEClass, QUO_EXPRESSION__RIGHT);

    modExpressionEClass = createEClass(MOD_EXPRESSION);
    createEReference(modExpressionEClass, MOD_EXPRESSION__LEFT);
    createEAttribute(modExpressionEClass, MOD_EXPRESSION__OP);
    createEReference(modExpressionEClass, MOD_EXPRESSION__RIGHT);

    remExpressionEClass = createEClass(REM_EXPRESSION);
    createEReference(remExpressionEClass, REM_EXPRESSION__LEFT);
    createEAttribute(remExpressionEClass, REM_EXPRESSION__OP);
    createEReference(remExpressionEClass, REM_EXPRESSION__RIGHT);

    multiplicativeExpressionEClass = createEClass(MULTIPLICATIVE_EXPRESSION);
    createEReference(multiplicativeExpressionEClass, MULTIPLICATIVE_EXPRESSION__LEFT);
    createEAttribute(multiplicativeExpressionEClass, MULTIPLICATIVE_EXPRESSION__OP);
    createEReference(multiplicativeExpressionEClass, MULTIPLICATIVE_EXPRESSION__RIGHT);

    exponentExpressionEClass = createEClass(EXPONENT_EXPRESSION);
    createEReference(exponentExpressionEClass, EXPONENT_EXPRESSION__LEFT);
    createEAttribute(exponentExpressionEClass, EXPONENT_EXPRESSION__OP);
    createEReference(exponentExpressionEClass, EXPONENT_EXPRESSION__RIGHT);

    mapDefinitionEClass = createEClass(MAP_DEFINITION);
    createEReference(mapDefinitionEClass, MAP_DEFINITION__LEFT);
    createEAttribute(mapDefinitionEClass, MAP_DEFINITION__OP);
    createEReference(mapDefinitionEClass, MAP_DEFINITION__RIGHT);

    pretendExpressionEClass = createEClass(PRETEND_EXPRESSION);
    createEReference(pretendExpressionEClass, PRETEND_EXPRESSION__LEFT);
    createEAttribute(pretendExpressionEClass, PRETEND_EXPRESSION__OP);
    createEReference(pretendExpressionEClass, PRETEND_EXPRESSION__RIGHT_TYPE);

    hintTypeExpressionEClass = createEClass(HINT_TYPE_EXPRESSION);
    createEReference(hintTypeExpressionEClass, HINT_TYPE_EXPRESSION__LEFT);
    createEAttribute(hintTypeExpressionEClass, HINT_TYPE_EXPRESSION__OP);
    createEReference(hintTypeExpressionEClass, HINT_TYPE_EXPRESSION__RIGHT_TYPE);

    coerceExpressionEClass = createEClass(COERCE_EXPRESSION);
    createEReference(coerceExpressionEClass, COERCE_EXPRESSION__LEFT);
    createEAttribute(coerceExpressionEClass, COERCE_EXPRESSION__OP);
    createEReference(coerceExpressionEClass, COERCE_EXPRESSION__RIGHT_TYPE);

    eltExpressionEClass = createEClass(ELT_EXPRESSION);
    createEReference(eltExpressionEClass, ELT_EXPRESSION__LEFT);
    createEAttribute(eltExpressionEClass, ELT_EXPRESSION__OP);
    createEReference(eltExpressionEClass, ELT_EXPRESSION__RIGHT);

    explicitTypeExpressionEClass = createEClass(EXPLICIT_TYPE_EXPRESSION);
    createEReference(explicitTypeExpressionEClass, EXPLICIT_TYPE_EXPRESSION__LEFT);
    createEAttribute(explicitTypeExpressionEClass, EXPLICIT_TYPE_EXPRESSION__OP);
    createEReference(explicitTypeExpressionEClass, EXPLICIT_TYPE_EXPRESSION__RIGHT_TYPE);

    unaryExpressionEClass = createEClass(UNARY_EXPRESSION);
    createEAttribute(unaryExpressionEClass, UNARY_EXPRESSION__UOP);
    createEReference(unaryExpressionEClass, UNARY_EXPRESSION__EXPR);
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
    functionDefinitionEClass.getESuperTypes().add(this.getAddStatements());
    macroDefEClass.getESuperTypes().add(this.getWhereAssignments());
    macroDefEClass.getESuperTypes().add(this.getAddStatements());
    importEClass.getESuperTypes().add(this.getWhereAssignments());
    importEClass.getESuperTypes().add(this.getAddStatements());
    variableDeclarationEClass.getESuperTypes().add(this.getWhereAssignments());
    variableDeclarationAssignEClass.getESuperTypes().add(this.getAddStatements());
    typePrimaryExpressionEClass.getESuperTypes().add(this.getTypeExpression());
    typeNameOrFunctionCallEClass.getESuperTypes().add(this.getTypePrimaryExpression());
    tupleDefinitionEClass.getESuperTypes().add(this.getTypePrimaryExpression());
    typeLiteralEClass.getESuperTypes().add(this.getTypePrimaryExpression());
    primaryPrefixEClass.getESuperTypes().add(this.getExpr());
    literalEClass.getESuperTypes().add(this.getPrimaryPrefix());
    characterLiteralEClass.getESuperTypes().add(this.getLiteral());
    booleanLiteralEClass.getESuperTypes().add(this.getLiteral());
    listLiteralEClass.getESuperTypes().add(this.getLiteral());
    conditionExpressionEClass.getESuperTypes().add(this.getExpr());
    andExpressionEClass.getESuperTypes().add(this.getExpr());
    innerProdExpressionEClass.getESuperTypes().add(this.getExpr());
    outerProdExpressionEClass.getESuperTypes().add(this.getExpr());
    hasExpressionEClass.getESuperTypes().add(this.getExpr());
    caseExpressionEClass.getESuperTypes().add(this.getExpr());
    equalityExpressionEClass.getESuperTypes().add(this.getExpr());
    relationalExpressionEClass.getESuperTypes().add(this.getExpr());
    isExpressionEClass.getESuperTypes().add(this.getExpr());
    segmentExpressionEClass.getESuperTypes().add(this.getExpr());
    additiveExpressionEClass.getESuperTypes().add(this.getExpr());
    exquoExpressionEClass.getESuperTypes().add(this.getExpr());
    divisionExpressionEClass.getESuperTypes().add(this.getExpr());
    quoExpressionEClass.getESuperTypes().add(this.getExpr());
    modExpressionEClass.getESuperTypes().add(this.getExpr());
    remExpressionEClass.getESuperTypes().add(this.getExpr());
    multiplicativeExpressionEClass.getESuperTypes().add(this.getExpr());
    exponentExpressionEClass.getESuperTypes().add(this.getExpr());
    mapDefinitionEClass.getESuperTypes().add(this.getExpr());
    pretendExpressionEClass.getESuperTypes().add(this.getExpr());
    hintTypeExpressionEClass.getESuperTypes().add(this.getExpr());
    coerceExpressionEClass.getESuperTypes().add(this.getExpr());
    eltExpressionEClass.getESuperTypes().add(this.getExpr());
    explicitTypeExpressionEClass.getESuperTypes().add(this.getExpr());
    unaryExpressionEClass.getESuperTypes().add(this.getExpr());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_C(), this.getCategoryDef(), null, "c", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_P(), this.getPackageDef(), null, "p", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_D(), this.getDomainDef(), null, "d", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(categoryDefEClass, CategoryDef.class, "CategoryDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCategoryDef_Name(), ecorePackage.getEString(), "name", null, 0, 1, CategoryDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCategoryDef_Shortname(), ecorePackage.getEString(), "shortname", null, 0, 1, CategoryDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCategoryDef_Longname(), ecorePackage.getEString(), "longname", null, 0, 1, CategoryDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCategoryDef_Longname2(), ecorePackage.getEString(), "longname2", null, 0, 1, CategoryDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCategoryDef_Cp(), this.getTypeParameterList(), null, "cp", null, 0, 1, CategoryDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCategoryDef_ImplName(), this.getTypeArguments(), null, "implName", null, 0, 1, CategoryDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCategoryDef_W(), this.getWithPart(), null, "w", null, 0, 1, CategoryDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCategoryDef_A(), this.getAddPart(), null, "a", null, 0, 1, CategoryDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCategoryDef_Wh5(), this.getWherePart(), null, "wh5", null, 0, 1, CategoryDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(packageDefEClass, PackageDef.class, "PackageDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPackageDef_Name(), ecorePackage.getEString(), "name", null, 0, 1, PackageDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPackageDef_Shortname(), ecorePackage.getEString(), "shortname", null, 0, 1, PackageDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPackageDef_Longname(), ecorePackage.getEString(), "longname", null, 0, 1, PackageDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPackageDef_Longname2(), ecorePackage.getEString(), "longname2", null, 0, 1, PackageDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPackageDef_Cp(), this.getTypeParameterList(), null, "cp", null, 0, 1, PackageDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPackageDef_ExportName(), ecorePackage.getEString(), "exportName", null, 0, 1, PackageDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPackageDef_ImplName(), ecorePackage.getEString(), "implName", null, 0, 1, PackageDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPackageDef_W(), this.getWithPart(), null, "w", null, 0, 1, PackageDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPackageDef_Wh5(), this.getWherePart(), null, "wh5", null, 0, 1, PackageDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(domainDefEClass, DomainDef.class, "DomainDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDomainDef_Name(), ecorePackage.getEString(), "name", null, 0, 1, DomainDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDomainDef_Shortname5(), ecorePackage.getEString(), "shortname5", null, 0, 1, DomainDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDomainDef_Longname5(), ecorePackage.getEString(), "longname5", null, 0, 1, DomainDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDomainDef_Longname6(), ecorePackage.getEString(), "longname6", null, 0, 1, DomainDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDomainDef_Cp5(), this.getTypeParameterList(), null, "cp5", null, 0, 1, DomainDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDomainDef_ExportName(), ecorePackage.getEString(), "exportName", null, 0, 1, DomainDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDomainDef_ImplName5(), ecorePackage.getEString(), "implName5", null, 0, 1, DomainDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDomainDef_W(), this.getWithPart(), null, "w", null, 0, 1, DomainDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDomainDef_Wh5(), this.getWherePart(), null, "wh5", null, 0, 1, DomainDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(wherePartEClass, WherePart.class, "WherePart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWherePart_Name(), ecorePackage.getEString(), "name", null, 0, 1, WherePart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWherePart_WhereAssig(), this.getWhereAssignments(), null, "whereAssig", null, 0, -1, WherePart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWherePart_Longname8(), ecorePackage.getEString(), "longname8", null, 0, 1, WherePart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWherePart_Imp(), this.getTypeExpression(), null, "imp", null, 0, 1, WherePart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWherePart_W8(), this.getWithPart(), null, "w8", null, 0, 1, WherePart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWherePart_Longname9(), ecorePackage.getEString(), "longname9", null, 0, 1, WherePart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWherePart_Fs(), ecorePackage.getEString(), "fs", null, 0, 1, WherePart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWherePart_Par2(), ecorePackage.getEString(), "par2", null, 0, 1, WherePart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWherePart_Par3(), ecorePackage.getEString(), "par3", null, 0, -1, WherePart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWherePart_Add(), this.getAddPart(), null, "add", null, 0, 1, WherePart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(whereAssignmentsEClass, WhereAssignments.class, "WhereAssignments", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(withPartEClass, WithPart.class, "WithPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWithPart_Name(), ecorePackage.getEString(), "name", null, 0, 1, WithPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWithPart_Fundec(), this.getVariableDeclaration(), null, "fundec", null, 0, -1, WithPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(addPartEClass, AddPart.class, "AddPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAddPart_Name(), ecorePackage.getEString(), "name", null, 0, 1, AddPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAddPart_T(), this.getAddStatements(), null, "t", null, 0, -1, AddPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(addStatementsEClass, AddStatements.class, "AddStatements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAddStatements_T1(), this.getExpr(), null, "t1", null, 0, 1, AddStatements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAddStatements_T13(), this.getFunctionDefinitionBlock(), null, "t13", null, 0, 1, AddStatements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionDefinitionEClass, FunctionDefinition.class, "FunctionDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFunctionDefinition_Par3(), this.getFunctionSignature(), null, "par3", null, 0, 1, FunctionDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunctionDefinition_Par4(), this.getTypeExpression(), null, "par4", null, 0, 1, FunctionDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunctionDefinition_Par5(), this.getStatement(), null, "par5", null, 0, 1, FunctionDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionDefinitionBlockEClass, FunctionDefinitionBlock.class, "FunctionDefinitionBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFunctionDefinitionBlock_FnDecBr(), ecorePackage.getEString(), "fnDecBr", null, 0, 1, FunctionDefinitionBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunctionDefinitionBlock_FnDecBk(), this.getFunctionDefinition(), null, "fnDecBk", null, 0, -1, FunctionDefinitionBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionSignatureEClass, FunctionSignature.class, "FunctionSignature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFunctionSignature_FnNam(), ecorePackage.getEString(), "fnNam", null, 0, 1, FunctionSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunctionSignature_Par2(), this.getVariableTyped(), null, "par2", null, 0, 1, FunctionSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunctionSignature_Par3(), this.getVariableTyped(), null, "par3", null, 0, -1, FunctionSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFunctionSignature_Par(), ecorePackage.getEString(), "par", null, 0, 1, FunctionSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFunctionSignature_T4(), ecorePackage.getEString(), "t4", null, 0, 1, FunctionSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFunctionSignature_B1(), ecorePackage.getEString(), "b1", null, 0, 1, FunctionSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFunctionSignature_T5(), ecorePackage.getEString(), "t5", null, 0, 1, FunctionSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFunctionSignature_B3(), ecorePackage.getEInt(), "b3", null, 0, 1, FunctionSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFunctionSignature_B2(), ecorePackage.getEString(), "b2", null, 0, 1, FunctionSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFunctionSignature_T6(), ecorePackage.getEString(), "t6", null, 0, 1, FunctionSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(macroDefEClass, MacroDef.class, "MacroDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMacroDef_Macroname(), ecorePackage.getEString(), "macroname", null, 0, 1, MacroDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImport_Impname(), ecorePackage.getEString(), "impname", null, 0, -1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableDeclarationBlockEClass, VariableDeclarationBlock.class, "VariableDeclarationBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVariableDeclarationBlock_Vardecbr(), ecorePackage.getEString(), "vardecbr", null, 0, 1, VariableDeclarationBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVariableDeclarationBlock_VardecBlk(), this.getVariableDeclaration(), null, "vardecBlk", null, 0, -1, VariableDeclarationBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableDeclarationEClass, VariableDeclaration.class, "VariableDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVariableDeclaration_T1(), this.getExpr(), null, "t1", null, 0, 1, VariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVariableDeclaration_V1(), this.getTypeWithName(), null, "v1", null, 0, 1, VariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVariableDeclaration_V2(), this.getVariableDeclarationBlock(), null, "v2", null, 0, 1, VariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeWithNameEClass, TypeWithName.class, "TypeWithName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTypeWithName_VarName(), ecorePackage.getEString(), "varName", null, 0, 1, TypeWithName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTypeWithName_VarNameSt(), ecorePackage.getEString(), "varNameSt", null, 0, 1, TypeWithName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypeWithName_Typ(), this.getTypeExpression(), null, "typ", null, 0, 1, TypeWithName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableTypedEClass, VariableTyped.class, "VariableTyped", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVariableTyped_VarName(), ecorePackage.getEString(), "varName", null, 0, 1, VariableTyped.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVariableTyped_VarNameSt(), ecorePackage.getEString(), "varNameSt", null, 0, 1, VariableTyped.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVariableTyped_Typ(), this.getTypeExpression(), null, "typ", null, 0, 1, VariableTyped.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableDeclarationAssignEClass, VariableDeclarationAssign.class, "VariableDeclarationAssign", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVariableDeclarationAssign_VarName(), ecorePackage.getEString(), "varName", null, 0, 1, VariableDeclarationAssign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVariableDeclarationAssign_T2(), ecorePackage.getEString(), "t2", null, 0, -1, VariableDeclarationAssign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVariableDeclarationAssign_Typ(), this.getTypeExpression(), null, "typ", null, 0, 1, VariableDeclarationAssign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVariableDeclarationAssign_T4(), this.getExpr(), null, "t4", null, 0, 1, VariableDeclarationAssign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(freeVariableEClass, FreeVariable.class, "FreeVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFreeVariable_Var(), ecorePackage.getEString(), "var", null, 0, 1, FreeVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(localVariableEClass, LocalVariable.class, "LocalVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLocalVariable_Var(), ecorePackage.getEString(), "var", null, 0, 1, LocalVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeExpressionEClass, TypeExpression.class, "TypeExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTypeExpression_T2(), this.getTypeArguments(), null, "t2", null, 0, 1, TypeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypeExpression_T3(), this.getTypeResult(), null, "t3", null, 0, 1, TypeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeParameterListEClass, TypeParameterList.class, "TypeParameterList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTypeParameterList_Tyname(), ecorePackage.getEString(), "tyname", null, 0, 1, TypeParameterList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTypeParameterList_Par(), ecorePackage.getEString(), "par", null, 0, 1, TypeParameterList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypeParameterList_Par22(), this.getTypeExpression(), null, "par22", null, 0, -1, TypeParameterList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTypeParameterList_Par2(), ecorePackage.getEString(), "par2", null, 0, -1, TypeParameterList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeArgumentsEClass, TypeArguments.class, "TypeArguments", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTypeArguments_T(), this.getTypeLiteral(), null, "t", null, 0, 1, TypeArguments.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTypeArguments_T2(), ecorePackage.getEString(), "t2", null, 0, 1, TypeArguments.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTypeArguments_T3(), ecorePackage.getEString(), "t3", null, 0, 1, TypeArguments.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTypeArguments_B1(), ecorePackage.getEBoolean(), "b1", null, 0, 1, TypeArguments.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypeArguments_T4(), this.getTypeExpression(), null, "t4", null, 0, 1, TypeArguments.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypeArguments_T16(), this.getTypeExpression(), null, "t16", null, 0, -1, TypeArguments.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTypeArguments_T5(), ecorePackage.getEString(), "t5", null, 0, 1, TypeArguments.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypeArguments_T6(), this.getTypeExpression(), null, "t6", null, 0, 1, TypeArguments.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypeArguments_T22(), this.getTypeExpression(), null, "t22", null, 0, -1, TypeArguments.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypeArguments_T21(), this.getTypeExpression(), null, "t21", null, 0, -1, TypeArguments.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypeArguments_T23(), this.getTypeExpression(), null, "t23", null, 0, -1, TypeArguments.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTypeArguments_T9(), ecorePackage.getEString(), "t9", null, 0, 1, TypeArguments.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypeArguments_T10(), this.getTypeExpression(), null, "t10", null, 0, 1, TypeArguments.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypeArguments_T25(), this.getTypeExpression(), null, "t25", null, 0, -1, TypeArguments.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypeArguments_T24(), this.getTypeExpression(), null, "t24", null, 0, -1, TypeArguments.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypeArguments_T26(), this.getTypeExpression(), null, "t26", null, 0, -1, TypeArguments.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTypeArguments_T11(), ecorePackage.getEString(), "t11", null, 0, 1, TypeArguments.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypeArguments_T12(), this.getTypeExpression(), null, "t12", null, 0, 1, TypeArguments.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypeArguments_T13(), this.getTypeExpression(), null, "t13", null, 0, -1, TypeArguments.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypeArguments_T15(), this.getTypeNameOrFunctionCall(), null, "t15", null, 0, 1, TypeArguments.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeResultEClass, TypeResult.class, "TypeResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTypeResult_T(), this.getTypeLiteral(), null, "t", null, 0, 1, TypeResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTypeResult_T2(), ecorePackage.getEString(), "t2", null, 0, 1, TypeResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTypeResult_Tyname(), ecorePackage.getEString(), "tyname", null, 0, 1, TypeResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypeResult_T7(), this.getTypeExpression(), null, "t7", null, 0, 1, TypeResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypeResult_T8(), this.getTypeExpression(), null, "t8", null, 0, -1, TypeResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypeResult_T21(), this.getTypeExpression(), null, "t21", null, 0, -1, TypeResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypeResult_T23(), this.getTypeExpression(), null, "t23", null, 0, -1, TypeResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypeResult_T10(), this.getTypeExpression(), null, "t10", null, 0, 1, TypeResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypeResult_T11(), this.getTypeExpression(), null, "t11", null, 0, -1, TypeResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypeResult_T24(), this.getTypeExpression(), null, "t24", null, 0, -1, TypeResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypeResult_T26(), this.getTypeExpression(), null, "t26", null, 0, -1, TypeResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypeResult_T12(), this.getTypeExpression(), null, "t12", null, 0, 1, TypeResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypeResult_T13(), this.getTypeExpression(), null, "t13", null, 0, -1, TypeResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypeResult_T15(), this.getTypeNameOrFunctionCall(), null, "t15", null, 0, 1, TypeResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typePrimaryExpressionEClass, TypePrimaryExpression.class, "TypePrimaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTypePrimaryExpression_T32(), ecorePackage.getEString(), "t32", null, 0, 1, TypePrimaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTypePrimaryExpression_Tyname(), ecorePackage.getEString(), "tyname", null, 0, 1, TypePrimaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypePrimaryExpression_T5(), this.getTypeExpression(), null, "t5", null, 0, 1, TypePrimaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypePrimaryExpression_T7(), this.getTypeExpression(), null, "t7", null, 0, 1, TypePrimaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypePrimaryExpression_T8(), this.getTypeExpression(), null, "t8", null, 0, -1, TypePrimaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypePrimaryExpression_T21(), this.getTypeExpression(), null, "t21", null, 0, -1, TypePrimaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypePrimaryExpression_T23(), this.getTypeExpression(), null, "t23", null, 0, -1, TypePrimaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypePrimaryExpression_T10(), this.getTypeExpression(), null, "t10", null, 0, 1, TypePrimaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypePrimaryExpression_T11(), this.getTypeExpression(), null, "t11", null, 0, -1, TypePrimaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypePrimaryExpression_T24(), this.getTypeExpression(), null, "t24", null, 0, -1, TypePrimaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypePrimaryExpression_T26(), this.getTypeExpression(), null, "t26", null, 0, -1, TypePrimaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypePrimaryExpression_T13(), this.getTypeExpression(), null, "t13", null, 0, 1, TypePrimaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypePrimaryExpression_T14(), this.getTypeExpression(), null, "t14", null, 0, -1, TypePrimaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeNameOrFunctionCallEClass, TypeNameOrFunctionCall.class, "TypeNameOrFunctionCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTypeNameOrFunctionCall_Tfnname(), ecorePackage.getEString(), "tfnname", null, 0, 1, TypeNameOrFunctionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypeNameOrFunctionCall_T4(), this.getTypeExpression(), null, "t4", null, 0, 1, TypeNameOrFunctionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypeNameOrFunctionCall_T25(), this.getTypeExpression(), null, "t25", null, 0, -1, TypeNameOrFunctionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypeNameOrFunctionCall_T44(), this.getStatementExpression(), null, "t44", null, 0, -1, TypeNameOrFunctionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypeNameOrFunctionCall_T45(), this.getExpr(), null, "t45", null, 0, -1, TypeNameOrFunctionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypeNameOrFunctionCall_T6(), this.getTypePrimaryExpression(), null, "t6", null, 0, 1, TypeNameOrFunctionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tupleDefinitionEClass, TupleDefinition.class, "TupleDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTupleDefinition_T4(), this.getTypeExpression(), null, "t4", null, 0, 1, TupleDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTupleDefinition_T25(), this.getTypeExpression(), null, "t25", null, 0, -1, TupleDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeLiteralEClass, TypeLiteral.class, "TypeLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTypeLiteral_T1(), ecorePackage.getEInt(), "t1", null, 0, 1, TypeLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTypeLiteral_T22(), ecorePackage.getEString(), "t22", null, 0, 1, TypeLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypeLiteral_T34(), this.getCharacterLiteral(), null, "t34", null, 0, 1, TypeLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypeLiteral_T35(), this.getBooleanLiteral(), null, "t35", null, 0, 1, TypeLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(statementEClass, Statement.class, "Statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStatement_S1(), this.getBlock(), null, "s1", null, 0, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStatement_S3(), this.getStatementExpression(), null, "s3", null, 0, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStatement_S4(), this.getIfStatement(), null, "s4", null, 0, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStatement_S4b(), this.getIfElseStatement(), null, "s4b", null, 0, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStatement_S5(), this.getWhileStatement(), null, "s5", null, 0, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStatement_S6(), this.getDoStatement(), null, "s6", null, 0, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStatement_S7(), this.getForStatement(), null, "s7", null, 0, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStatement_S8(), this.getBreakStatement(), null, "s8", null, 0, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStatement_S12(), this.getRepeatStatement(), null, "s12", null, 0, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStatement_S9(), this.getIterateStatement(), null, "s9", null, 0, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStatement_S10(), this.getReturnStatement(), null, "s10", null, 0, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(blockEClass, Block.class, "Block", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBlock_Stname(), ecorePackage.getEString(), "stname", null, 0, 1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBlock_StatemBl(), this.getStatement(), null, "statemBl", null, 0, -1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(statementExpressionEClass, StatementExpression.class, "StatementExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStatementExpression_T(), this.getExpr(), null, "t", null, 0, 1, StatementExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStatementExpression_T2(), this.getTypeExpression(), null, "t2", null, 0, 1, StatementExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStatementExpression_T3(), this.getExpr(), null, "t3", null, 0, 1, StatementExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStatementExpression_T33(), this.getExpr(), null, "t33", null, 0, -1, StatementExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStatementExpression_T5(), this.getBlock(), null, "t5", null, 0, 1, StatementExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStatementExpression_T4(), this.getStatement(), null, "t4", null, 0, 1, StatementExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(forStatementEClass, ForStatement.class, "ForStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getForStatement_Stname(), ecorePackage.getEString(), "stname", null, 0, 1, ForStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getForStatement_T1(), this.getExpr(), null, "t1", null, 0, 1, ForStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getForStatement_S1(), this.getStatement(), null, "s1", null, 0, 1, ForStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(whileStatementEClass, WhileStatement.class, "WhileStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWhileStatement_Stname(), ecorePackage.getEString(), "stname", null, 0, 1, WhileStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWhileStatement_T2(), this.getExpr(), null, "t2", null, 0, 1, WhileStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWhileStatement_S1(), this.getStatement(), null, "s1", null, 0, 1, WhileStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(doStatementEClass, DoStatement.class, "DoStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDoStatement_Stname(), ecorePackage.getEString(), "stname", null, 0, 1, DoStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDoStatement_S1(), this.getStatement(), null, "s1", null, 0, 1, DoStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDoStatement_T2(), this.getExpr(), null, "t2", null, 0, 1, DoStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(repeatStatementEClass, RepeatStatement.class, "RepeatStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRepeatStatement_Stname(), ecorePackage.getEString(), "stname", null, 0, 1, RepeatStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRepeatStatement_S1(), this.getStatement(), null, "s1", null, 0, 1, RepeatStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(iterateStatementEClass, IterateStatement.class, "IterateStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIterateStatement_Stname(), ecorePackage.getEString(), "stname", null, 0, 1, IterateStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(breakStatementEClass, BreakStatement.class, "BreakStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBreakStatement_Stname(), ecorePackage.getEString(), "stname", null, 0, 1, BreakStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(returnStatementEClass, ReturnStatement.class, "ReturnStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getReturnStatement_Stname(), ecorePackage.getEString(), "stname", null, 0, 1, ReturnStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getReturnStatement_T2(), this.getExpr(), null, "t2", null, 0, 1, ReturnStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ifStatementEClass, IfStatement.class, "IfStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIfStatement_T2(), this.getExpr(), null, "t2", null, 0, 1, IfStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfStatement_S1(), this.getStatement(), null, "s1", null, 0, 1, IfStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfStatement_S2(), this.getStatement(), null, "s2", null, 0, 1, IfStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIfStatement_B(), ecorePackage.getEBoolean(), "b", null, 0, 1, IfStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfStatement_S11(), this.getStatement(), null, "s11", null, 0, 1, IfStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfStatement_S12(), this.getStatement(), null, "s12", null, 0, 1, IfStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ifElseStatementEClass, IfElseStatement.class, "IfElseStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIfElseStatement_S2(), this.getStatement(), null, "s2", null, 0, 1, IfElseStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exprEClass, Expr.class, "Expr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExpr_Ifname(), ecorePackage.getEString(), "ifname", null, 0, 1, Expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpr_Ifpred(), this.getExpr(), null, "ifpred", null, 0, 1, Expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpr_Thenexp(), this.getExpr(), null, "thenexp", null, 0, 1, Expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpr_Elseexp(), this.getExpr(), null, "elseexp", null, 0, 1, Expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExpr_E2(), ecorePackage.getEString(), "e2", null, 0, 1, Expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExpr_E3(), ecorePackage.getEString(), "e3", null, 0, 1, Expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExpr_E5(), ecorePackage.getEString(), "e5", null, 0, 1, Expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpr_E6(), this.getTypeExpression(), null, "e6", null, 0, 1, Expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpr_E22(), this.getTypeExpression(), null, "e22", null, 0, -1, Expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpr_E21(), this.getTypeExpression(), null, "e21", null, 0, -1, Expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpr_E23(), this.getTypeExpression(), null, "e23", null, 0, -1, Expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExpr_E9(), ecorePackage.getEString(), "e9", null, 0, 1, Expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpr_E10(), this.getTypeExpression(), null, "e10", null, 0, 1, Expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpr_E25(), this.getTypeExpression(), null, "e25", null, 0, -1, Expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpr_E24(), this.getTypeExpression(), null, "e24", null, 0, -1, Expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpr_E26(), this.getTypeExpression(), null, "e26", null, 0, -1, Expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExpr_E11(), ecorePackage.getEString(), "e11", null, 0, 1, Expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpr_E12(), this.getTypeExpression(), null, "e12", null, 0, 1, Expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpr_E13(), this.getTypeExpression(), null, "e13", null, 0, -1, Expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(primaryPrefixEClass, PrimaryPrefix.class, "PrimaryPrefix", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPrimaryPrefix_T4(), this.getExpr(), null, "t4", null, 0, 1, PrimaryPrefix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPrimaryPrefix_T25(), this.getExpr(), null, "t25", null, 0, -1, PrimaryPrefix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPrimaryPrefix_T7(), this.getNameOrFunctionCall(), null, "t7", null, 0, 1, PrimaryPrefix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nameOrFunctionCallEClass, NameOrFunctionCall.class, "NameOrFunctionCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNameOrFunctionCall_Fnname(), ecorePackage.getEString(), "fnname", null, 0, 1, NameOrFunctionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNameOrFunctionCall_Lsp(), ecorePackage.getEString(), "lsp", null, 0, 1, NameOrFunctionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNameOrFunctionCall_T4(), this.getStatementExpression(), null, "t4", null, 0, 1, NameOrFunctionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNameOrFunctionCall_T5(), this.getExpr(), null, "t5", null, 0, -1, NameOrFunctionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNameOrFunctionCall_T14(), this.getStatementExpression(), null, "t14", null, 0, -1, NameOrFunctionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNameOrFunctionCall_T15(), this.getExpr(), null, "t15", null, 0, -1, NameOrFunctionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNameOrFunctionCall_T6(), this.getExpr(), null, "t6", null, 0, 1, NameOrFunctionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(literalEClass, Literal.class, "Literal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLiteral_Value(), ecorePackage.getEInt(), "value", null, 0, 1, Literal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLiteral_T2(), ecorePackage.getEString(), "t2", null, 0, 1, Literal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(characterLiteralEClass, CharacterLiteral.class, "CharacterLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCharacterLiteral_C1(), ecorePackage.getEString(), "c1", null, 0, 1, CharacterLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(booleanLiteralEClass, BooleanLiteral.class, "BooleanLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBooleanLiteral_Litname(), ecorePackage.getEString(), "litname", null, 0, 1, BooleanLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(listLiteralEClass, ListLiteral.class, "ListLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getListLiteral_Litname(), ecorePackage.getEString(), "litname", null, 0, 1, ListLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getListLiteral_L2(), this.getExpr(), null, "l2", null, 0, 1, ListLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getListLiteral_T3(), this.getExpr(), null, "t3", null, 0, -1, ListLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getListLiteral_T14(), this.getExpr(), null, "t14", null, 0, -1, ListLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getListLiteral_L5(), this.getExpr(), null, "l5", null, 0, -1, ListLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(conditionExpressionEClass, ConditionExpression.class, "ConditionExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConditionExpression_Left(), this.getExpr(), null, "left", null, 0, 1, ConditionExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConditionExpression_Op(), ecorePackage.getEString(), "op", null, 0, 1, ConditionExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConditionExpression_Right(), this.getExpr(), null, "right", null, 0, 1, ConditionExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(andExpressionEClass, AndExpression.class, "AndExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAndExpression_Left(), this.getExpr(), null, "left", null, 0, 1, AndExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAndExpression_Op(), ecorePackage.getEString(), "op", null, 0, 1, AndExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAndExpression_Right(), this.getExpr(), null, "right", null, 0, 1, AndExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(innerProdExpressionEClass, InnerProdExpression.class, "InnerProdExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInnerProdExpression_Left(), this.getExpr(), null, "left", null, 0, 1, InnerProdExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInnerProdExpression_Op(), ecorePackage.getEString(), "op", null, 0, 1, InnerProdExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInnerProdExpression_Right(), this.getExpr(), null, "right", null, 0, 1, InnerProdExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(outerProdExpressionEClass, OuterProdExpression.class, "OuterProdExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOuterProdExpression_Left(), this.getExpr(), null, "left", null, 0, 1, OuterProdExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOuterProdExpression_Op(), ecorePackage.getEString(), "op", null, 0, 1, OuterProdExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOuterProdExpression_Right(), this.getExpr(), null, "right", null, 0, 1, OuterProdExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(hasExpressionEClass, HasExpression.class, "HasExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHasExpression_Left(), this.getExpr(), null, "left", null, 0, 1, HasExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHasExpression_Op(), ecorePackage.getEString(), "op", null, 0, 1, HasExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHasExpression_RightType(), this.getTypeExpression(), null, "rightType", null, 0, 1, HasExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(caseExpressionEClass, CaseExpression.class, "CaseExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCaseExpression_Left(), this.getExpr(), null, "left", null, 0, 1, CaseExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCaseExpression_Op(), ecorePackage.getEString(), "op", null, 0, 1, CaseExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCaseExpression_Right(), this.getExpr(), null, "right", null, 0, 1, CaseExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(equalityExpressionEClass, EqualityExpression.class, "EqualityExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEqualityExpression_Left(), this.getExpr(), null, "left", null, 0, 1, EqualityExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEqualityExpression_Op(), ecorePackage.getEString(), "op", null, 0, 1, EqualityExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEqualityExpression_Right(), this.getExpr(), null, "right", null, 0, 1, EqualityExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(relationalExpressionEClass, RelationalExpression.class, "RelationalExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRelationalExpression_Left(), this.getExpr(), null, "left", null, 0, 1, RelationalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRelationalExpression_Op(), ecorePackage.getEString(), "op", null, 0, 1, RelationalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRelationalExpression_Right(), this.getExpr(), null, "right", null, 0, 1, RelationalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(isExpressionEClass, IsExpression.class, "IsExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIsExpression_Left(), this.getExpr(), null, "left", null, 0, 1, IsExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIsExpression_Op(), ecorePackage.getEString(), "op", null, 0, 1, IsExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIsExpression_RightType(), this.getTypeExpression(), null, "rightType", null, 0, 1, IsExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(segmentExpressionEClass, SegmentExpression.class, "SegmentExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSegmentExpression_Left(), this.getExpr(), null, "left", null, 0, 1, SegmentExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSegmentExpression_Op(), ecorePackage.getEString(), "op", null, 0, 1, SegmentExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSegmentExpression_Right(), this.getExpr(), null, "right", null, 0, 1, SegmentExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(additiveExpressionEClass, AdditiveExpression.class, "AdditiveExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAdditiveExpression_Left(), this.getExpr(), null, "left", null, 0, 1, AdditiveExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAdditiveExpression_Op(), ecorePackage.getEString(), "op", null, 0, 1, AdditiveExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAdditiveExpression_Right(), this.getExpr(), null, "right", null, 0, 1, AdditiveExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exquoExpressionEClass, ExquoExpression.class, "ExquoExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExquoExpression_Left(), this.getExpr(), null, "left", null, 0, 1, ExquoExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExquoExpression_Op(), ecorePackage.getEString(), "op", null, 0, 1, ExquoExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExquoExpression_Right(), this.getExpr(), null, "right", null, 0, 1, ExquoExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(divisionExpressionEClass, DivisionExpression.class, "DivisionExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDivisionExpression_Left(), this.getExpr(), null, "left", null, 0, 1, DivisionExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDivisionExpression_Op(), ecorePackage.getEString(), "op", null, 0, 1, DivisionExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDivisionExpression_Right(), this.getExpr(), null, "right", null, 0, 1, DivisionExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(quoExpressionEClass, QuoExpression.class, "QuoExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getQuoExpression_Left(), this.getExpr(), null, "left", null, 0, 1, QuoExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getQuoExpression_Op(), ecorePackage.getEString(), "op", null, 0, 1, QuoExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getQuoExpression_Right(), this.getExpr(), null, "right", null, 0, 1, QuoExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(modExpressionEClass, ModExpression.class, "ModExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModExpression_Left(), this.getExpr(), null, "left", null, 0, 1, ModExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getModExpression_Op(), ecorePackage.getEString(), "op", null, 0, 1, ModExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModExpression_Right(), this.getExpr(), null, "right", null, 0, 1, ModExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(remExpressionEClass, RemExpression.class, "RemExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRemExpression_Left(), this.getExpr(), null, "left", null, 0, 1, RemExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRemExpression_Op(), ecorePackage.getEString(), "op", null, 0, 1, RemExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRemExpression_Right(), this.getExpr(), null, "right", null, 0, 1, RemExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(multiplicativeExpressionEClass, MultiplicativeExpression.class, "MultiplicativeExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMultiplicativeExpression_Left(), this.getExpr(), null, "left", null, 0, 1, MultiplicativeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMultiplicativeExpression_Op(), ecorePackage.getEString(), "op", null, 0, 1, MultiplicativeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMultiplicativeExpression_Right(), this.getExpr(), null, "right", null, 0, 1, MultiplicativeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exponentExpressionEClass, ExponentExpression.class, "ExponentExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExponentExpression_Left(), this.getExpr(), null, "left", null, 0, 1, ExponentExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExponentExpression_Op(), ecorePackage.getEString(), "op", null, 0, 1, ExponentExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExponentExpression_Right(), this.getExpr(), null, "right", null, 0, 1, ExponentExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mapDefinitionEClass, MapDefinition.class, "MapDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMapDefinition_Left(), this.getExpr(), null, "left", null, 0, 1, MapDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMapDefinition_Op(), ecorePackage.getEString(), "op", null, 0, 1, MapDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMapDefinition_Right(), this.getExpr(), null, "right", null, 0, 1, MapDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pretendExpressionEClass, PretendExpression.class, "PretendExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPretendExpression_Left(), this.getExpr(), null, "left", null, 0, 1, PretendExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPretendExpression_Op(), ecorePackage.getEString(), "op", null, 0, 1, PretendExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPretendExpression_RightType(), this.getTypeExpression(), null, "rightType", null, 0, 1, PretendExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(hintTypeExpressionEClass, HintTypeExpression.class, "HintTypeExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHintTypeExpression_Left(), this.getExpr(), null, "left", null, 0, 1, HintTypeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHintTypeExpression_Op(), ecorePackage.getEString(), "op", null, 0, 1, HintTypeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHintTypeExpression_RightType(), this.getTypeExpression(), null, "rightType", null, 0, 1, HintTypeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(coerceExpressionEClass, CoerceExpression.class, "CoerceExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCoerceExpression_Left(), this.getExpr(), null, "left", null, 0, 1, CoerceExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCoerceExpression_Op(), ecorePackage.getEString(), "op", null, 0, 1, CoerceExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCoerceExpression_RightType(), this.getTypeExpression(), null, "rightType", null, 0, 1, CoerceExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eltExpressionEClass, EltExpression.class, "EltExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEltExpression_Left(), this.getExpr(), null, "left", null, 0, 1, EltExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEltExpression_Op(), ecorePackage.getEString(), "op", null, 0, 1, EltExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEltExpression_Right(), this.getExpr(), null, "right", null, 0, 1, EltExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(explicitTypeExpressionEClass, ExplicitTypeExpression.class, "ExplicitTypeExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExplicitTypeExpression_Left(), this.getExpr(), null, "left", null, 0, 1, ExplicitTypeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExplicitTypeExpression_Op(), ecorePackage.getEString(), "op", null, 0, 1, ExplicitTypeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExplicitTypeExpression_RightType(), this.getTypeExpression(), null, "rightType", null, 0, 1, ExplicitTypeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unaryExpressionEClass, UnaryExpression.class, "UnaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUnaryExpression_Uop(), ecorePackage.getEString(), "uop", null, 0, 1, UnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUnaryExpression_Expr(), this.getExpr(), null, "expr", null, 0, 1, UnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //EditorPackageImpl
