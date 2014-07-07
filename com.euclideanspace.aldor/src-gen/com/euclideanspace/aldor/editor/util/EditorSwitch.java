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
        if (result == null) result = caseJleft_Atom(expression);
        if (result == null) result = caseJright_Atom(expression);
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
      case EditorPackage.DECLARATION:
      {
        Declaration declaration = (Declaration)theEObject;
        T result = caseDeclaration(declaration);
        if (result == null) result = caseLabeled(declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.EXPORT_DECL:
      {
        ExportDecl exportDecl = (ExportDecl)theEObject;
        T result = caseExportDecl(exportDecl);
        if (result == null) result = caseMacroBody(exportDecl);
        if (result == null) result = caseDeclaration(exportDecl);
        if (result == null) result = caseLabeled(exportDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.TO_PART:
      {
        ToPart toPart = (ToPart)theEObject;
        T result = caseToPart(toPart);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.FROM_PART:
      {
        FromPart fromPart = (FromPart)theEObject;
        T result = caseFromPart(fromPart);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.MACRO_BODY:
      {
        MacroBody macroBody = (MacroBody)theEObject;
        T result = caseMacroBody(macroBody);
        if (result == null) result = caseDeclaration(macroBody);
        if (result == null) result = caseLabeled(macroBody);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.SIG:
      {
        Sig sig = (Sig)theEObject;
        T result = caseSig(sig);
        if (result == null) result = caseExportDecl(sig);
        if (result == null) result = caseLabeled(sig);
        if (result == null) result = caseMacroBody(sig);
        if (result == null) result = caseDeclaration(sig);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.DECL_PART:
      {
        DeclPart declPart = (DeclPart)theEObject;
        T result = caseDeclPart(declPart);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.COMMA:
      {
        Comma comma = (Comma)theEObject;
        T result = caseComma(comma);
        if (result == null) result = caseLabeled(comma);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.COMMA_ITEM:
      {
        CommaItem commaItem = (CommaItem)theEObject;
        T result = caseCommaItem(commaItem);
        if (result == null) result = caseGenBound(commaItem);
        if (result == null) result = caseenlister1_CommaItem_Comma(commaItem);
        if (result == null) result = caseAnyStatement(commaItem);
        if (result == null) result = caseFlow_AnyStatement(commaItem);
        if (result == null) result = caseFlow_BalStatement(commaItem);
        if (result == null) result = caseBalStatement(commaItem);
        if (result == null) result = caseenlist1_CommaItem_Comma_AB(commaItem);
        if (result == null) result = caseBindingL_Infixed_BalStatement(commaItem);
        if (result == null) result = caseComma(commaItem);
        if (result == null) result = caseBinding_BalStatement(commaItem);
        if (result == null) result = caseLabeled(commaItem);
        if (result == null) result = caseAlwaysPart_BalStatement(commaItem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.DECL_BINDING:
      {
        DeclBinding declBinding = (DeclBinding)theEObject;
        T result = caseDeclBinding(declBinding);
        if (result == null) result = caseSig(declBinding);
        if (result == null) result = caseExportDecl(declBinding);
        if (result == null) result = caseLabeled(declBinding);
        if (result == null) result = caseMacroBody(declBinding);
        if (result == null) result = caseDeclaration(declBinding);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.INFIXED_EXPRS_DECL:
      {
        InfixedExprsDecl infixedExprsDecl = (InfixedExprsDecl)theEObject;
        T result = caseInfixedExprsDecl(infixedExprsDecl);
        if (result == null) result = caseBindingR_InfixedExprsDecl_AnyStatement(infixedExprsDecl);
        if (result == null) result = caseDeclBinding(infixedExprsDecl);
        if (result == null) result = caseSig(infixedExprsDecl);
        if (result == null) result = caseExportDecl(infixedExprsDecl);
        if (result == null) result = caseLabeled(infixedExprsDecl);
        if (result == null) result = caseMacroBody(infixedExprsDecl);
        if (result == null) result = caseDeclaration(infixedExprsDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.INFIXED_EXPRS:
      {
        InfixedExprs infixedExprs = (InfixedExprs)theEObject;
        T result = caseInfixedExprs(infixedExprs);
        if (result == null) result = caseInfixedExprsDecl(infixedExprs);
        if (result == null) result = caseBindingR_InfixedExprsDecl_AnyStatement(infixedExprs);
        if (result == null) result = caseDeclBinding(infixedExprs);
        if (result == null) result = caseSig(infixedExprs);
        if (result == null) result = caseExportDecl(infixedExprs);
        if (result == null) result = caseLabeled(infixedExprs);
        if (result == null) result = caseMacroBody(infixedExprs);
        if (result == null) result = caseDeclaration(infixedExprs);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.BINDING_ANY_STATEMENT:
      {
        Binding_AnyStatement binding_AnyStatement = (Binding_AnyStatement)theEObject;
        T result = caseBinding_AnyStatement(binding_AnyStatement);
        if (result == null) result = caseCommaItem(binding_AnyStatement);
        if (result == null) result = caseAlwaysPart_AnyStatement(binding_AnyStatement);
        if (result == null) result = caseGenBound(binding_AnyStatement);
        if (result == null) result = caseenlister1_CommaItem_Comma(binding_AnyStatement);
        if (result == null) result = caseAnyStatement(binding_AnyStatement);
        if (result == null) result = caseFlow_AnyStatement(binding_AnyStatement);
        if (result == null) result = caseFlow_BalStatement(binding_AnyStatement);
        if (result == null) result = caseBalStatement(binding_AnyStatement);
        if (result == null) result = caseenlist1_CommaItem_Comma_AB(binding_AnyStatement);
        if (result == null) result = caseBindingL_Infixed_BalStatement(binding_AnyStatement);
        if (result == null) result = caseComma(binding_AnyStatement);
        if (result == null) result = caseBinding_BalStatement(binding_AnyStatement);
        if (result == null) result = caseLabeled(binding_AnyStatement);
        if (result == null) result = caseAlwaysPart_BalStatement(binding_AnyStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.BINDING_BAL_STATEMENT:
      {
        Binding_BalStatement binding_BalStatement = (Binding_BalStatement)theEObject;
        T result = caseBinding_BalStatement(binding_BalStatement);
        if (result == null) result = caseAlwaysPart_BalStatement(binding_BalStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.BINDING_COLLECTION:
      {
        Binding_Collection binding_Collection = (Binding_Collection)theEObject;
        T result = caseBinding_Collection(binding_Collection);
        if (result == null) result = caseCases(binding_Collection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.BINDING_LINFIXED_ANY_STATEMENT:
      {
        BindingL_Infixed_AnyStatement bindingL_Infixed_AnyStatement = (BindingL_Infixed_AnyStatement)theEObject;
        T result = caseBindingL_Infixed_AnyStatement(bindingL_Infixed_AnyStatement);
        if (result == null) result = caseBinding_AnyStatement(bindingL_Infixed_AnyStatement);
        if (result == null) result = caseCommaItem(bindingL_Infixed_AnyStatement);
        if (result == null) result = caseAlwaysPart_AnyStatement(bindingL_Infixed_AnyStatement);
        if (result == null) result = caseGenBound(bindingL_Infixed_AnyStatement);
        if (result == null) result = caseenlister1_CommaItem_Comma(bindingL_Infixed_AnyStatement);
        if (result == null) result = caseAnyStatement(bindingL_Infixed_AnyStatement);
        if (result == null) result = caseFlow_AnyStatement(bindingL_Infixed_AnyStatement);
        if (result == null) result = caseFlow_BalStatement(bindingL_Infixed_AnyStatement);
        if (result == null) result = caseBalStatement(bindingL_Infixed_AnyStatement);
        if (result == null) result = caseenlist1_CommaItem_Comma_AB(bindingL_Infixed_AnyStatement);
        if (result == null) result = caseBindingL_Infixed_BalStatement(bindingL_Infixed_AnyStatement);
        if (result == null) result = caseComma(bindingL_Infixed_AnyStatement);
        if (result == null) result = caseBinding_BalStatement(bindingL_Infixed_AnyStatement);
        if (result == null) result = caseLabeled(bindingL_Infixed_AnyStatement);
        if (result == null) result = caseAlwaysPart_BalStatement(bindingL_Infixed_AnyStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.BINDING_LINFIXED_BAL_STATEMENT:
      {
        BindingL_Infixed_BalStatement bindingL_Infixed_BalStatement = (BindingL_Infixed_BalStatement)theEObject;
        T result = caseBindingL_Infixed_BalStatement(bindingL_Infixed_BalStatement);
        if (result == null) result = caseBinding_BalStatement(bindingL_Infixed_BalStatement);
        if (result == null) result = caseAlwaysPart_BalStatement(bindingL_Infixed_BalStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.BINDING_LINFIXED_COLLECTION:
      {
        BindingL_Infixed_Collection bindingL_Infixed_Collection = (BindingL_Infixed_Collection)theEObject;
        T result = caseBindingL_Infixed_Collection(bindingL_Infixed_Collection);
        if (result == null) result = caseBinding_Collection(bindingL_Infixed_Collection);
        if (result == null) result = caseCases(bindingL_Infixed_Collection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.BINDING_RINFIXED_EXPRS_DECL_ANY_STATEMENT:
      {
        BindingR_InfixedExprsDecl_AnyStatement bindingR_InfixedExprsDecl_AnyStatement = (BindingR_InfixedExprsDecl_AnyStatement)theEObject;
        T result = caseBindingR_InfixedExprsDecl_AnyStatement(bindingR_InfixedExprsDecl_AnyStatement);
        if (result == null) result = caseDeclBinding(bindingR_InfixedExprsDecl_AnyStatement);
        if (result == null) result = caseSig(bindingR_InfixedExprsDecl_AnyStatement);
        if (result == null) result = caseExportDecl(bindingR_InfixedExprsDecl_AnyStatement);
        if (result == null) result = caseLabeled(bindingR_InfixedExprsDecl_AnyStatement);
        if (result == null) result = caseMacroBody(bindingR_InfixedExprsDecl_AnyStatement);
        if (result == null) result = caseDeclaration(bindingR_InfixedExprsDecl_AnyStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.ANY_STATEMENT:
      {
        AnyStatement anyStatement = (AnyStatement)theEObject;
        T result = caseAnyStatement(anyStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.BAL_STATEMENT:
      {
        BalStatement balStatement = (BalStatement)theEObject;
        T result = caseBalStatement(balStatement);
        if (result == null) result = caseBindingL_Infixed_BalStatement(balStatement);
        if (result == null) result = caseBinding_BalStatement(balStatement);
        if (result == null) result = caseAlwaysPart_BalStatement(balStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.FLOW_ANY_STATEMENT:
      {
        Flow_AnyStatement flow_AnyStatement = (Flow_AnyStatement)theEObject;
        T result = caseFlow_AnyStatement(flow_AnyStatement);
        if (result == null) result = caseAnyStatement(flow_AnyStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.FLOW_BAL_STATEMENT:
      {
        Flow_BalStatement flow_BalStatement = (Flow_BalStatement)theEObject;
        T result = caseFlow_BalStatement(flow_BalStatement);
        if (result == null) result = caseBalStatement(flow_BalStatement);
        if (result == null) result = caseBindingL_Infixed_BalStatement(flow_BalStatement);
        if (result == null) result = caseBinding_BalStatement(flow_BalStatement);
        if (result == null) result = caseAlwaysPart_BalStatement(flow_BalStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.GEN_BOUND:
      {
        GenBound genBound = (GenBound)theEObject;
        T result = caseGenBound(genBound);
        if (result == null) result = caseFlow_AnyStatement(genBound);
        if (result == null) result = caseFlow_BalStatement(genBound);
        if (result == null) result = caseAnyStatement(genBound);
        if (result == null) result = caseBalStatement(genBound);
        if (result == null) result = caseBindingL_Infixed_BalStatement(genBound);
        if (result == null) result = caseBinding_BalStatement(genBound);
        if (result == null) result = caseAlwaysPart_BalStatement(genBound);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.BUT_EXPR:
      {
        ButExpr butExpr = (ButExpr)theEObject;
        T result = caseButExpr(butExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.CASES:
      {
        Cases cases = (Cases)theEObject;
        T result = caseCases(cases);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.ALWAYS_PART_ANY_STATEMENT:
      {
        AlwaysPart_AnyStatement alwaysPart_AnyStatement = (AlwaysPart_AnyStatement)theEObject;
        T result = caseAlwaysPart_AnyStatement(alwaysPart_AnyStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.ALWAYS_PART_BAL_STATEMENT:
      {
        AlwaysPart_BalStatement alwaysPart_BalStatement = (AlwaysPart_BalStatement)theEObject;
        T result = caseAlwaysPart_BalStatement(alwaysPart_BalStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.COLLECTION:
      {
        Collection collection = (Collection)theEObject;
        T result = caseCollection(collection);
        if (result == null) result = caseBindingL_Infixed_Collection(collection);
        if (result == null) result = caseFlow_AnyStatement(collection);
        if (result == null) result = caseFlow_BalStatement(collection);
        if (result == null) result = caseBinding_Collection(collection);
        if (result == null) result = caseAnyStatement(collection);
        if (result == null) result = caseBalStatement(collection);
        if (result == null) result = caseCases(collection);
        if (result == null) result = caseBindingL_Infixed_BalStatement(collection);
        if (result == null) result = caseBinding_BalStatement(collection);
        if (result == null) result = caseAlwaysPart_BalStatement(collection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.ITERATORS:
      {
        Iterators iterators = (Iterators)theEObject;
        T result = caseIterators(iterators);
        if (result == null) result = caseFlow_AnyStatement(iterators);
        if (result == null) result = caseFlow_BalStatement(iterators);
        if (result == null) result = caseAnyStatement(iterators);
        if (result == null) result = caseBalStatement(iterators);
        if (result == null) result = caseBindingL_Infixed_BalStatement(iterators);
        if (result == null) result = caseBinding_BalStatement(iterators);
        if (result == null) result = caseAlwaysPart_BalStatement(iterators);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.ITERATORS1:
      {
        Iterators1 iterators1 = (Iterators1)theEObject;
        T result = caseIterators1(iterators1);
        if (result == null) result = caseIterators(iterators1);
        if (result == null) result = caseFlow_AnyStatement(iterators1);
        if (result == null) result = caseFlow_BalStatement(iterators1);
        if (result == null) result = caseAnyStatement(iterators1);
        if (result == null) result = caseBalStatement(iterators1);
        if (result == null) result = caseBindingL_Infixed_BalStatement(iterators1);
        if (result == null) result = caseBinding_BalStatement(iterators1);
        if (result == null) result = caseAlwaysPart_BalStatement(iterators1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.ITERATOR:
      {
        Iterator iterator = (Iterator)theEObject;
        T result = caseIterator(iterator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.FOR_LHS:
      {
        ForLhs forLhs = (ForLhs)theEObject;
        T result = caseForLhs(forLhs);
        if (result == null) result = caseIterator(forLhs);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.SUCHTHAT_PART:
      {
        SuchthatPart suchthatPart = (SuchthatPart)theEObject;
        T result = caseSuchthatPart(suchthatPart);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.INFIXED:
      {
        Infixed infixed = (Infixed)theEObject;
        T result = caseInfixed(infixed);
        if (result == null) result = caseToPart(infixed);
        if (result == null) result = caseBindingL_Infixed_AnyStatement(infixed);
        if (result == null) result = caseCollection(infixed);
        if (result == null) result = caseForLhs(infixed);
        if (result == null) result = caseSuchthatPart(infixed);
        if (result == null) result = caseenlister1_Infixed_Comma(infixed);
        if (result == null) result = caseBinding_AnyStatement(infixed);
        if (result == null) result = caseBindingL_Infixed_Collection(infixed);
        if (result == null) result = caseBinding_Collection(infixed);
        if (result == null) result = caseIterator(infixed);
        if (result == null) result = caseenlist1_Infixed_Comma_AB(infixed);
        if (result == null) result = caseCommaItem(infixed);
        if (result == null) result = caseAlwaysPart_AnyStatement(infixed);
        if (result == null) result = caseCases(infixed);
        if (result == null) result = caseFromPart(infixed);
        if (result == null) result = caseGenBound(infixed);
        if (result == null) result = caseenlister1_CommaItem_Comma(infixed);
        if (result == null) result = caseAnyStatement(infixed);
        if (result == null) result = caseFlow_AnyStatement(infixed);
        if (result == null) result = caseFlow_BalStatement(infixed);
        if (result == null) result = caseBalStatement(infixed);
        if (result == null) result = caseenlist1_CommaItem_Comma_AB(infixed);
        if (result == null) result = caseBindingL_Infixed_BalStatement(infixed);
        if (result == null) result = caseComma(infixed);
        if (result == null) result = caseBinding_BalStatement(infixed);
        if (result == null) result = caseLabeled(infixed);
        if (result == null) result = caseAlwaysPart_BalStatement(infixed);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.INFIXED_EXPR:
      {
        InfixedExpr infixedExpr = (InfixedExpr)theEObject;
        T result = caseInfixedExpr(infixedExpr);
        if (result == null) result = caseenlister1_InfixedExpr_Comma(infixedExpr);
        if (result == null) result = caseenlist1_InfixedExpr_Comma_AB(infixedExpr);
        if (result == null) result = caseInfixedExprs(infixedExpr);
        if (result == null) result = caseInfixedExprsDecl(infixedExpr);
        if (result == null) result = caseBindingR_InfixedExprsDecl_AnyStatement(infixedExpr);
        if (result == null) result = caseDeclBinding(infixedExpr);
        if (result == null) result = caseSig(infixedExpr);
        if (result == null) result = caseExportDecl(infixedExpr);
        if (result == null) result = caseLabeled(infixedExpr);
        if (result == null) result = caseMacroBody(infixedExpr);
        if (result == null) result = caseDeclaration(infixedExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.EXPR:
      {
        Expr expr = (Expr)theEObject;
        T result = caseExpr(expr);
        if (result == null) result = caseInfixedExpr(expr);
        if (result == null) result = caseType(expr);
        if (result == null) result = caseenlister1_InfixedExpr_Comma(expr);
        if (result == null) result = caseDeclPart(expr);
        if (result == null) result = caseenlist1_InfixedExpr_Comma_AB(expr);
        if (result == null) result = caseInfixedExprs(expr);
        if (result == null) result = caseInfixedExprsDecl(expr);
        if (result == null) result = caseBindingR_InfixedExprsDecl_AnyStatement(expr);
        if (result == null) result = caseDeclBinding(expr);
        if (result == null) result = caseSig(expr);
        if (result == null) result = caseExportDecl(expr);
        if (result == null) result = caseLabeled(expr);
        if (result == null) result = caseMacroBody(expr);
        if (result == null) result = caseDeclaration(expr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.TYPE:
      {
        Type type = (Type)theEObject;
        T result = caseType(type);
        if (result == null) result = caseDeclPart(type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.E12:
      {
        E12 e12 = (E12)theEObject;
        T result = caseE12(e12);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.E13:
      {
        E13 e13 = (E13)theEObject;
        T result = caseE13(e13);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.QUAL_TAIL:
      {
        QualTail qualTail = (QualTail)theEObject;
        T result = caseQualTail(qualTail);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.OP_QUAL_TAIL:
      {
        OpQualTail opQualTail = (OpQualTail)theEObject;
        T result = caseOpQualTail(opQualTail);
        if (result == null) result = caseQualOp_ArrowTok(opQualTail);
        if (result == null) result = caseQualOp_LatticeTok(opQualTail);
        if (result == null) result = caseQualOp_SegTok(opQualTail);
        if (result == null) result = caseQualOp_PlusTok(opQualTail);
        if (result == null) result = caseQualOp_QuotientTok(opQualTail);
        if (result == null) result = caseQualOp_TimesTok(opQualTail);
        if (result == null) result = caseQualOp_PowerTok(opQualTail);
        if (result == null) result = caseArrowOp(opQualTail);
        if (result == null) result = caseLatticeOp(opQualTail);
        if (result == null) result = caseSegOp(opQualTail);
        if (result == null) result = casePlusOp(opQualTail);
        if (result == null) result = caseQuotientOp(opQualTail);
        if (result == null) result = caseTimesOp(opQualTail);
        if (result == null) result = casePowerOp(opQualTail);
        if (result == null) result = caseOp(opQualTail);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.E14:
      {
        E14 e14 = (E14)theEObject;
        T result = caseE14(e14);
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
        if (result == null) result = caseFlow_AnyStatement(nakedOp);
        if (result == null) result = caseFlow_BalStatement(nakedOp);
        if (result == null) result = caseAnyStatement(nakedOp);
        if (result == null) result = caseBalStatement(nakedOp);
        if (result == null) result = caseBindingL_Infixed_BalStatement(nakedOp);
        if (result == null) result = caseBinding_BalStatement(nakedOp);
        if (result == null) result = caseAlwaysPart_BalStatement(nakedOp);
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
      case EditorPackage.LEFT_JUXTAPOSED:
      {
        LeftJuxtaposed leftJuxtaposed = (LeftJuxtaposed)theEObject;
        T result = caseLeftJuxtaposed(leftJuxtaposed);
        if (result == null) result = caseQualTail(leftJuxtaposed);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.JRIGHT_ATOM:
      {
        Jright_Atom jright_Atom = (Jright_Atom)theEObject;
        T result = caseJright_Atom(jright_Atom);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.JLEFT_MOLECULE:
      {
        Jleft_Molecule jleft_Molecule = (Jleft_Molecule)theEObject;
        T result = caseJleft_Molecule(jleft_Molecule);
        if (result == null) result = caseLeftJuxtaposed(jleft_Molecule);
        if (result == null) result = caseQualTail(jleft_Molecule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.JLEFT_ATOM:
      {
        Jleft_Atom jleft_Atom = (Jleft_Atom)theEObject;
        T result = caseJleft_Atom(jleft_Atom);
        if (result == null) result = caseJright_Atom(jleft_Atom);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.MOLECULE:
      {
        Molecule molecule = (Molecule)theEObject;
        T result = caseMolecule(molecule);
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
        if (result == null) result = caseJleft_Atom(enclosure);
        if (result == null) result = caseJright_Atom(enclosure);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.DECL_MOLECULE:
      {
        DeclMolecule declMolecule = (DeclMolecule)theEObject;
        T result = caseDeclMolecule(declMolecule);
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
        if (result == null) result = caseJleft_Atom(blockEnclosure);
        if (result == null) result = caseJright_Atom(blockEnclosure);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.BLOCK:
      {
        Block block = (Block)theEObject;
        T result = caseBlock(block);
        if (result == null) result = caseSig(block);
        if (result == null) result = caseBlockMolecule(block);
        if (result == null) result = caseBlockEnclosure(block);
        if (result == null) result = caseExportDecl(block);
        if (result == null) result = caseJleft_Atom(block);
        if (result == null) result = caseLabeled(block);
        if (result == null) result = caseMacroBody(block);
        if (result == null) result = caseJright_Atom(block);
        if (result == null) result = caseDeclaration(block);
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
        if (result == null) result = caseJleft_Atom(parened);
        if (result == null) result = caseJright_Atom(parened);
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
        if (result == null) result = caseJleft_Atom(bracketed);
        if (result == null) result = caseJright_Atom(bracketed);
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
        if (result == null) result = caseJleft_Atom(quotedIds);
        if (result == null) result = caseJright_Atom(quotedIds);
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
        if (result == null) result = caseJleft_Atom(names);
        if (result == null) result = caseJright_Atom(names);
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
        if (result == null) result = caseJright_Atom(atom);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.NAME:
      {
        Name name = (Name)theEObject;
        T result = caseName(name);
        if (result == null) result = caseFlow_AnyStatement(name);
        if (result == null) result = caseFlow_BalStatement(name);
        if (result == null) result = caseAnyStatement(name);
        if (result == null) result = caseBalStatement(name);
        if (result == null) result = caseBindingL_Infixed_BalStatement(name);
        if (result == null) result = caseBinding_BalStatement(name);
        if (result == null) result = caseAlwaysPart_BalStatement(name);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.ID:
      {
        Id id = (Id)theEObject;
        T result = caseId(id);
        if (result == null) result = caseName(id);
        if (result == null) result = caseFlow_AnyStatement(id);
        if (result == null) result = caseAnyStatement(id);
        if (result == null) result = caseFlow_BalStatement(id);
        if (result == null) result = caseBalStatement(id);
        if (result == null) result = caseBindingL_Infixed_BalStatement(id);
        if (result == null) result = caseBinding_BalStatement(id);
        if (result == null) result = caseAlwaysPart_BalStatement(id);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.UNQUAL_OP_ARROW_TOK:
      {
        UnqualOp_ArrowTok unqualOp_ArrowTok = (UnqualOp_ArrowTok)theEObject;
        T result = caseUnqualOp_ArrowTok(unqualOp_ArrowTok);
        if (result == null) result = caseNakedOp(unqualOp_ArrowTok);
        if (result == null) result = caseName(unqualOp_ArrowTok);
        if (result == null) result = caseFlow_AnyStatement(unqualOp_ArrowTok);
        if (result == null) result = caseFlow_BalStatement(unqualOp_ArrowTok);
        if (result == null) result = caseAnyStatement(unqualOp_ArrowTok);
        if (result == null) result = caseBalStatement(unqualOp_ArrowTok);
        if (result == null) result = caseBindingL_Infixed_BalStatement(unqualOp_ArrowTok);
        if (result == null) result = caseBinding_BalStatement(unqualOp_ArrowTok);
        if (result == null) result = caseAlwaysPart_BalStatement(unqualOp_ArrowTok);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.UNQUAL_OP_LATTICE_TOK:
      {
        UnqualOp_LatticeTok unqualOp_LatticeTok = (UnqualOp_LatticeTok)theEObject;
        T result = caseUnqualOp_LatticeTok(unqualOp_LatticeTok);
        if (result == null) result = caseNakedOp(unqualOp_LatticeTok);
        if (result == null) result = caseName(unqualOp_LatticeTok);
        if (result == null) result = caseFlow_AnyStatement(unqualOp_LatticeTok);
        if (result == null) result = caseFlow_BalStatement(unqualOp_LatticeTok);
        if (result == null) result = caseAnyStatement(unqualOp_LatticeTok);
        if (result == null) result = caseBalStatement(unqualOp_LatticeTok);
        if (result == null) result = caseBindingL_Infixed_BalStatement(unqualOp_LatticeTok);
        if (result == null) result = caseBinding_BalStatement(unqualOp_LatticeTok);
        if (result == null) result = caseAlwaysPart_BalStatement(unqualOp_LatticeTok);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.UNQUAL_OP_RELATION_TOK:
      {
        UnqualOp_RelationTok unqualOp_RelationTok = (UnqualOp_RelationTok)theEObject;
        T result = caseUnqualOp_RelationTok(unqualOp_RelationTok);
        if (result == null) result = caseNakedOp(unqualOp_RelationTok);
        if (result == null) result = caseName(unqualOp_RelationTok);
        if (result == null) result = caseFlow_AnyStatement(unqualOp_RelationTok);
        if (result == null) result = caseFlow_BalStatement(unqualOp_RelationTok);
        if (result == null) result = caseAnyStatement(unqualOp_RelationTok);
        if (result == null) result = caseBalStatement(unqualOp_RelationTok);
        if (result == null) result = caseBindingL_Infixed_BalStatement(unqualOp_RelationTok);
        if (result == null) result = caseBinding_BalStatement(unqualOp_RelationTok);
        if (result == null) result = caseAlwaysPart_BalStatement(unqualOp_RelationTok);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.UNQUAL_OP_SEG_TOK:
      {
        UnqualOp_SegTok unqualOp_SegTok = (UnqualOp_SegTok)theEObject;
        T result = caseUnqualOp_SegTok(unqualOp_SegTok);
        if (result == null) result = caseNakedOp(unqualOp_SegTok);
        if (result == null) result = caseName(unqualOp_SegTok);
        if (result == null) result = caseFlow_AnyStatement(unqualOp_SegTok);
        if (result == null) result = caseFlow_BalStatement(unqualOp_SegTok);
        if (result == null) result = caseAnyStatement(unqualOp_SegTok);
        if (result == null) result = caseBalStatement(unqualOp_SegTok);
        if (result == null) result = caseBindingL_Infixed_BalStatement(unqualOp_SegTok);
        if (result == null) result = caseBinding_BalStatement(unqualOp_SegTok);
        if (result == null) result = caseAlwaysPart_BalStatement(unqualOp_SegTok);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.UNQUAL_OP_PLUS_TOK:
      {
        UnqualOp_PlusTok unqualOp_PlusTok = (UnqualOp_PlusTok)theEObject;
        T result = caseUnqualOp_PlusTok(unqualOp_PlusTok);
        if (result == null) result = caseNakedOp(unqualOp_PlusTok);
        if (result == null) result = caseName(unqualOp_PlusTok);
        if (result == null) result = caseFlow_AnyStatement(unqualOp_PlusTok);
        if (result == null) result = caseFlow_BalStatement(unqualOp_PlusTok);
        if (result == null) result = caseAnyStatement(unqualOp_PlusTok);
        if (result == null) result = caseBalStatement(unqualOp_PlusTok);
        if (result == null) result = caseBindingL_Infixed_BalStatement(unqualOp_PlusTok);
        if (result == null) result = caseBinding_BalStatement(unqualOp_PlusTok);
        if (result == null) result = caseAlwaysPart_BalStatement(unqualOp_PlusTok);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.UNQUAL_OP_QUOTIENT_TOK:
      {
        UnqualOp_QuotientTok unqualOp_QuotientTok = (UnqualOp_QuotientTok)theEObject;
        T result = caseUnqualOp_QuotientTok(unqualOp_QuotientTok);
        if (result == null) result = caseNakedOp(unqualOp_QuotientTok);
        if (result == null) result = caseName(unqualOp_QuotientTok);
        if (result == null) result = caseFlow_AnyStatement(unqualOp_QuotientTok);
        if (result == null) result = caseFlow_BalStatement(unqualOp_QuotientTok);
        if (result == null) result = caseAnyStatement(unqualOp_QuotientTok);
        if (result == null) result = caseBalStatement(unqualOp_QuotientTok);
        if (result == null) result = caseBindingL_Infixed_BalStatement(unqualOp_QuotientTok);
        if (result == null) result = caseBinding_BalStatement(unqualOp_QuotientTok);
        if (result == null) result = caseAlwaysPart_BalStatement(unqualOp_QuotientTok);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.UNQUAL_OP_TIMES_TOK:
      {
        UnqualOp_TimesTok unqualOp_TimesTok = (UnqualOp_TimesTok)theEObject;
        T result = caseUnqualOp_TimesTok(unqualOp_TimesTok);
        if (result == null) result = caseNakedOp(unqualOp_TimesTok);
        if (result == null) result = caseName(unqualOp_TimesTok);
        if (result == null) result = caseFlow_AnyStatement(unqualOp_TimesTok);
        if (result == null) result = caseFlow_BalStatement(unqualOp_TimesTok);
        if (result == null) result = caseAnyStatement(unqualOp_TimesTok);
        if (result == null) result = caseBalStatement(unqualOp_TimesTok);
        if (result == null) result = caseBindingL_Infixed_BalStatement(unqualOp_TimesTok);
        if (result == null) result = caseBinding_BalStatement(unqualOp_TimesTok);
        if (result == null) result = caseAlwaysPart_BalStatement(unqualOp_TimesTok);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.UNQUAL_OP_POWER_TOK:
      {
        UnqualOp_PowerTok unqualOp_PowerTok = (UnqualOp_PowerTok)theEObject;
        T result = caseUnqualOp_PowerTok(unqualOp_PowerTok);
        if (result == null) result = caseNakedOp(unqualOp_PowerTok);
        if (result == null) result = caseName(unqualOp_PowerTok);
        if (result == null) result = caseFlow_AnyStatement(unqualOp_PowerTok);
        if (result == null) result = caseFlow_BalStatement(unqualOp_PowerTok);
        if (result == null) result = caseAnyStatement(unqualOp_PowerTok);
        if (result == null) result = caseBalStatement(unqualOp_PowerTok);
        if (result == null) result = caseBindingL_Infixed_BalStatement(unqualOp_PowerTok);
        if (result == null) result = caseBinding_BalStatement(unqualOp_PowerTok);
        if (result == null) result = caseAlwaysPart_BalStatement(unqualOp_PowerTok);
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
      case EditorPackage.ENLIST1_COMMA_ITEM_COMMA_AB:
      {
        enlist1_CommaItem_Comma_AB enlist1_CommaItem_Comma_AB = (enlist1_CommaItem_Comma_AB)theEObject;
        T result = caseenlist1_CommaItem_Comma_AB(enlist1_CommaItem_Comma_AB);
        if (result == null) result = caseComma(enlist1_CommaItem_Comma_AB);
        if (result == null) result = caseLabeled(enlist1_CommaItem_Comma_AB);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.ENLIST1_INFIXED_COMMA_AB:
      {
        enlist1_Infixed_Comma_AB enlist1_Infixed_Comma_AB = (enlist1_Infixed_Comma_AB)theEObject;
        T result = caseenlist1_Infixed_Comma_AB(enlist1_Infixed_Comma_AB);
        if (result == null) result = caseFromPart(enlist1_Infixed_Comma_AB);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.ENLIST1_INFIXED_EXPR_COMMA_AB:
      {
        enlist1_InfixedExpr_Comma_AB enlist1_InfixedExpr_Comma_AB = (enlist1_InfixedExpr_Comma_AB)theEObject;
        T result = caseenlist1_InfixedExpr_Comma_AB(enlist1_InfixedExpr_Comma_AB);
        if (result == null) result = caseInfixedExprs(enlist1_InfixedExpr_Comma_AB);
        if (result == null) result = caseInfixedExprsDecl(enlist1_InfixedExpr_Comma_AB);
        if (result == null) result = caseBindingR_InfixedExprsDecl_AnyStatement(enlist1_InfixedExpr_Comma_AB);
        if (result == null) result = caseDeclBinding(enlist1_InfixedExpr_Comma_AB);
        if (result == null) result = caseSig(enlist1_InfixedExpr_Comma_AB);
        if (result == null) result = caseExportDecl(enlist1_InfixedExpr_Comma_AB);
        if (result == null) result = caseLabeled(enlist1_InfixedExpr_Comma_AB);
        if (result == null) result = caseMacroBody(enlist1_InfixedExpr_Comma_AB);
        if (result == null) result = caseDeclaration(enlist1_InfixedExpr_Comma_AB);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.ENLISTER1_COMMA_ITEM_COMMA:
      {
        enlister1_CommaItem_Comma enlister1_CommaItem_Comma = (enlister1_CommaItem_Comma)theEObject;
        T result = caseenlister1_CommaItem_Comma(enlister1_CommaItem_Comma);
        if (result == null) result = caseenlist1_CommaItem_Comma_AB(enlister1_CommaItem_Comma);
        if (result == null) result = caseComma(enlister1_CommaItem_Comma);
        if (result == null) result = caseLabeled(enlister1_CommaItem_Comma);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.ENLISTER1_INFIXED_COMMA:
      {
        enlister1_Infixed_Comma enlister1_Infixed_Comma = (enlister1_Infixed_Comma)theEObject;
        T result = caseenlister1_Infixed_Comma(enlister1_Infixed_Comma);
        if (result == null) result = caseenlist1_Infixed_Comma_AB(enlister1_Infixed_Comma);
        if (result == null) result = caseFromPart(enlister1_Infixed_Comma);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.ENLISTER1_INFIXED_EXPR_COMMA:
      {
        enlister1_InfixedExpr_Comma enlister1_InfixedExpr_Comma = (enlister1_InfixedExpr_Comma)theEObject;
        T result = caseenlister1_InfixedExpr_Comma(enlister1_InfixedExpr_Comma);
        if (result == null) result = caseenlist1_InfixedExpr_Comma_AB(enlister1_InfixedExpr_Comma);
        if (result == null) result = caseInfixedExprs(enlister1_InfixedExpr_Comma);
        if (result == null) result = caseInfixedExprsDecl(enlister1_InfixedExpr_Comma);
        if (result == null) result = caseBindingR_InfixedExprsDecl_AnyStatement(enlister1_InfixedExpr_Comma);
        if (result == null) result = caseDeclBinding(enlister1_InfixedExpr_Comma);
        if (result == null) result = caseSig(enlister1_InfixedExpr_Comma);
        if (result == null) result = caseExportDecl(enlister1_InfixedExpr_Comma);
        if (result == null) result = caseLabeled(enlister1_InfixedExpr_Comma);
        if (result == null) result = caseMacroBody(enlister1_InfixedExpr_Comma);
        if (result == null) result = caseDeclaration(enlister1_InfixedExpr_Comma);
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
        if (result == null) result = caseJleft_Atom(enlist1a_Labeled_Semicolon_AB);
        if (result == null) result = caseJright_Atom(enlist1a_Labeled_Semicolon_AB);
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
        if (result == null) result = caseJleft_Atom(enlister1a_Labeled_Semicolon);
        if (result == null) result = caseJright_Atom(enlister1a_Labeled_Semicolon);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.CURLY_LABELED:
      {
        Curly_Labeled curly_Labeled = (Curly_Labeled)theEObject;
        T result = caseCurly_Labeled(curly_Labeled);
        if (result == null) result = caseBlock(curly_Labeled);
        if (result == null) result = caseSig(curly_Labeled);
        if (result == null) result = caseBlockMolecule(curly_Labeled);
        if (result == null) result = caseBlockEnclosure(curly_Labeled);
        if (result == null) result = caseExportDecl(curly_Labeled);
        if (result == null) result = caseJleft_Atom(curly_Labeled);
        if (result == null) result = caseLabeled(curly_Labeled);
        if (result == null) result = caseMacroBody(curly_Labeled);
        if (result == null) result = caseJright_Atom(curly_Labeled);
        if (result == null) result = caseDeclaration(curly_Labeled);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.CURLY_CONTENTS_LABELED:
      {
        CurlyContents_Labeled curlyContents_Labeled = (CurlyContents_Labeled)theEObject;
        T result = caseCurlyContents_Labeled(curlyContents_Labeled);
        if (result == null) result = caseCurly_Labeled(curlyContents_Labeled);
        if (result == null) result = caseBlock(curlyContents_Labeled);
        if (result == null) result = caseSig(curlyContents_Labeled);
        if (result == null) result = caseBlockMolecule(curlyContents_Labeled);
        if (result == null) result = caseBlockEnclosure(curlyContents_Labeled);
        if (result == null) result = caseExportDecl(curlyContents_Labeled);
        if (result == null) result = caseJleft_Atom(curlyContents_Labeled);
        if (result == null) result = caseLabeled(curlyContents_Labeled);
        if (result == null) result = caseMacroBody(curlyContents_Labeled);
        if (result == null) result = caseJright_Atom(curlyContents_Labeled);
        if (result == null) result = caseDeclaration(curlyContents_Labeled);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.CURLY_CONTENTS_LIST_LABELED:
      {
        CurlyContentsList_Labeled curlyContentsList_Labeled = (CurlyContentsList_Labeled)theEObject;
        T result = caseCurlyContentsList_Labeled(curlyContentsList_Labeled);
        if (result == null) result = caseCurlyContents_Labeled(curlyContentsList_Labeled);
        if (result == null) result = caseCurly_Labeled(curlyContentsList_Labeled);
        if (result == null) result = caseBlock(curlyContentsList_Labeled);
        if (result == null) result = caseSig(curlyContentsList_Labeled);
        if (result == null) result = caseBlockMolecule(curlyContentsList_Labeled);
        if (result == null) result = caseBlockEnclosure(curlyContentsList_Labeled);
        if (result == null) result = caseExportDecl(curlyContentsList_Labeled);
        if (result == null) result = caseJleft_Atom(curlyContentsList_Labeled);
        if (result == null) result = caseLabeled(curlyContentsList_Labeled);
        if (result == null) result = caseMacroBody(curlyContentsList_Labeled);
        if (result == null) result = caseJright_Atom(curlyContentsList_Labeled);
        if (result == null) result = caseDeclaration(curlyContentsList_Labeled);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.CURLY_CONTENT_BLABELED:
      {
        CurlyContentB_Labeled curlyContentB_Labeled = (CurlyContentB_Labeled)theEObject;
        T result = caseCurlyContentB_Labeled(curlyContentB_Labeled);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.E3:
      {
        E3 e3 = (E3)theEObject;
        T result = caseE3(e3);
        if (result == null) result = caseExpr(e3);
        if (result == null) result = caseInfixedExpr(e3);
        if (result == null) result = caseType(e3);
        if (result == null) result = caseenlister1_InfixedExpr_Comma(e3);
        if (result == null) result = caseDeclPart(e3);
        if (result == null) result = caseenlist1_InfixedExpr_Comma_AB(e3);
        if (result == null) result = caseInfixedExprs(e3);
        if (result == null) result = caseInfixedExprsDecl(e3);
        if (result == null) result = caseBindingR_InfixedExprsDecl_AnyStatement(e3);
        if (result == null) result = caseDeclBinding(e3);
        if (result == null) result = caseSig(e3);
        if (result == null) result = caseExportDecl(e3);
        if (result == null) result = caseLabeled(e3);
        if (result == null) result = caseMacroBody(e3);
        if (result == null) result = caseDeclaration(e3);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.E4:
      {
        E4 e4 = (E4)theEObject;
        T result = caseE4(e4);
        if (result == null) result = caseExpr(e4);
        if (result == null) result = caseInfixedExpr(e4);
        if (result == null) result = caseType(e4);
        if (result == null) result = caseenlister1_InfixedExpr_Comma(e4);
        if (result == null) result = caseDeclPart(e4);
        if (result == null) result = caseenlist1_InfixedExpr_Comma_AB(e4);
        if (result == null) result = caseInfixedExprs(e4);
        if (result == null) result = caseInfixedExprsDecl(e4);
        if (result == null) result = caseBindingR_InfixedExprsDecl_AnyStatement(e4);
        if (result == null) result = caseDeclBinding(e4);
        if (result == null) result = caseSig(e4);
        if (result == null) result = caseExportDecl(e4);
        if (result == null) result = caseLabeled(e4);
        if (result == null) result = caseMacroBody(e4);
        if (result == null) result = caseDeclaration(e4);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.E5:
      {
        E5 e5 = (E5)theEObject;
        T result = caseE5(e5);
        if (result == null) result = caseExpr(e5);
        if (result == null) result = caseInfixedExpr(e5);
        if (result == null) result = caseType(e5);
        if (result == null) result = caseenlister1_InfixedExpr_Comma(e5);
        if (result == null) result = caseDeclPart(e5);
        if (result == null) result = caseenlist1_InfixedExpr_Comma_AB(e5);
        if (result == null) result = caseInfixedExprs(e5);
        if (result == null) result = caseInfixedExprsDecl(e5);
        if (result == null) result = caseBindingR_InfixedExprsDecl_AnyStatement(e5);
        if (result == null) result = caseDeclBinding(e5);
        if (result == null) result = caseSig(e5);
        if (result == null) result = caseExportDecl(e5);
        if (result == null) result = caseLabeled(e5);
        if (result == null) result = caseMacroBody(e5);
        if (result == null) result = caseDeclaration(e5);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.E6:
      {
        E6 e6 = (E6)theEObject;
        T result = caseE6(e6);
        if (result == null) result = caseExpr(e6);
        if (result == null) result = caseInfixedExpr(e6);
        if (result == null) result = caseType(e6);
        if (result == null) result = caseenlister1_InfixedExpr_Comma(e6);
        if (result == null) result = caseDeclPart(e6);
        if (result == null) result = caseenlist1_InfixedExpr_Comma_AB(e6);
        if (result == null) result = caseInfixedExprs(e6);
        if (result == null) result = caseInfixedExprsDecl(e6);
        if (result == null) result = caseBindingR_InfixedExprsDecl_AnyStatement(e6);
        if (result == null) result = caseDeclBinding(e6);
        if (result == null) result = caseSig(e6);
        if (result == null) result = caseExportDecl(e6);
        if (result == null) result = caseLabeled(e6);
        if (result == null) result = caseMacroBody(e6);
        if (result == null) result = caseDeclaration(e6);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.E7:
      {
        E7 e7 = (E7)theEObject;
        T result = caseE7(e7);
        if (result == null) result = caseExpr(e7);
        if (result == null) result = caseInfixedExpr(e7);
        if (result == null) result = caseType(e7);
        if (result == null) result = caseenlister1_InfixedExpr_Comma(e7);
        if (result == null) result = caseDeclPart(e7);
        if (result == null) result = caseenlist1_InfixedExpr_Comma_AB(e7);
        if (result == null) result = caseInfixedExprs(e7);
        if (result == null) result = caseInfixedExprsDecl(e7);
        if (result == null) result = caseBindingR_InfixedExprsDecl_AnyStatement(e7);
        if (result == null) result = caseDeclBinding(e7);
        if (result == null) result = caseSig(e7);
        if (result == null) result = caseExportDecl(e7);
        if (result == null) result = caseLabeled(e7);
        if (result == null) result = caseMacroBody(e7);
        if (result == null) result = caseDeclaration(e7);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.E8:
      {
        E8 e8 = (E8)theEObject;
        T result = caseE8(e8);
        if (result == null) result = caseExpr(e8);
        if (result == null) result = caseInfixedExpr(e8);
        if (result == null) result = caseType(e8);
        if (result == null) result = caseenlister1_InfixedExpr_Comma(e8);
        if (result == null) result = caseDeclPart(e8);
        if (result == null) result = caseenlist1_InfixedExpr_Comma_AB(e8);
        if (result == null) result = caseInfixedExprs(e8);
        if (result == null) result = caseInfixedExprsDecl(e8);
        if (result == null) result = caseBindingR_InfixedExprsDecl_AnyStatement(e8);
        if (result == null) result = caseDeclBinding(e8);
        if (result == null) result = caseSig(e8);
        if (result == null) result = caseExportDecl(e8);
        if (result == null) result = caseLabeled(e8);
        if (result == null) result = caseMacroBody(e8);
        if (result == null) result = caseDeclaration(e8);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.E9:
      {
        E9 e9 = (E9)theEObject;
        T result = caseE9(e9);
        if (result == null) result = caseExpr(e9);
        if (result == null) result = caseInfixedExpr(e9);
        if (result == null) result = caseType(e9);
        if (result == null) result = caseenlister1_InfixedExpr_Comma(e9);
        if (result == null) result = caseDeclPart(e9);
        if (result == null) result = caseenlist1_InfixedExpr_Comma_AB(e9);
        if (result == null) result = caseInfixedExprs(e9);
        if (result == null) result = caseInfixedExprsDecl(e9);
        if (result == null) result = caseBindingR_InfixedExprsDecl_AnyStatement(e9);
        if (result == null) result = caseDeclBinding(e9);
        if (result == null) result = caseSig(e9);
        if (result == null) result = caseExportDecl(e9);
        if (result == null) result = caseLabeled(e9);
        if (result == null) result = caseMacroBody(e9);
        if (result == null) result = caseDeclaration(e9);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.E11_E12:
      {
        E11_E12 e11_E12 = (E11_E12)theEObject;
        T result = caseE11_E12(e11_E12);
        if (result == null) result = caseExpr(e11_E12);
        if (result == null) result = caseInfixedExpr(e11_E12);
        if (result == null) result = caseType(e11_E12);
        if (result == null) result = caseenlister1_InfixedExpr_Comma(e11_E12);
        if (result == null) result = caseDeclPart(e11_E12);
        if (result == null) result = caseenlist1_InfixedExpr_Comma_AB(e11_E12);
        if (result == null) result = caseInfixedExprs(e11_E12);
        if (result == null) result = caseInfixedExprsDecl(e11_E12);
        if (result == null) result = caseBindingR_InfixedExprsDecl_AnyStatement(e11_E12);
        if (result == null) result = caseDeclBinding(e11_E12);
        if (result == null) result = caseSig(e11_E12);
        if (result == null) result = caseExportDecl(e11_E12);
        if (result == null) result = caseLabeled(e11_E12);
        if (result == null) result = caseMacroBody(e11_E12);
        if (result == null) result = caseDeclaration(e11_E12);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.E11_OP:
      {
        E11_Op e11_Op = (E11_Op)theEObject;
        T result = caseE11_Op(e11_Op);
        if (result == null) result = caseExpr(e11_Op);
        if (result == null) result = caseInfixedExpr(e11_Op);
        if (result == null) result = caseType(e11_Op);
        if (result == null) result = caseenlister1_InfixedExpr_Comma(e11_Op);
        if (result == null) result = caseDeclPart(e11_Op);
        if (result == null) result = caseenlist1_InfixedExpr_Comma_AB(e11_Op);
        if (result == null) result = caseInfixedExprs(e11_Op);
        if (result == null) result = caseInfixedExprsDecl(e11_Op);
        if (result == null) result = caseBindingR_InfixedExprsDecl_AnyStatement(e11_Op);
        if (result == null) result = caseDeclBinding(e11_Op);
        if (result == null) result = caseSig(e11_Op);
        if (result == null) result = caseExportDecl(e11_Op);
        if (result == null) result = caseLabeled(e11_Op);
        if (result == null) result = caseMacroBody(e11_Op);
        if (result == null) result = caseDeclaration(e11_Op);
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
        if (result == null) result = caseFlow_AnyStatement(arrowTok);
        if (result == null) result = caseFlow_BalStatement(arrowTok);
        if (result == null) result = caseAnyStatement(arrowTok);
        if (result == null) result = caseBalStatement(arrowTok);
        if (result == null) result = caseBindingL_Infixed_BalStatement(arrowTok);
        if (result == null) result = caseBinding_BalStatement(arrowTok);
        if (result == null) result = caseAlwaysPart_BalStatement(arrowTok);
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
        if (result == null) result = caseFlow_AnyStatement(latticeTok);
        if (result == null) result = caseFlow_BalStatement(latticeTok);
        if (result == null) result = caseAnyStatement(latticeTok);
        if (result == null) result = caseBalStatement(latticeTok);
        if (result == null) result = caseBindingL_Infixed_BalStatement(latticeTok);
        if (result == null) result = caseBinding_BalStatement(latticeTok);
        if (result == null) result = caseAlwaysPart_BalStatement(latticeTok);
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
        if (result == null) result = caseFlow_AnyStatement(relationTok);
        if (result == null) result = caseFlow_BalStatement(relationTok);
        if (result == null) result = caseAnyStatement(relationTok);
        if (result == null) result = caseBalStatement(relationTok);
        if (result == null) result = caseBindingL_Infixed_BalStatement(relationTok);
        if (result == null) result = caseBinding_BalStatement(relationTok);
        if (result == null) result = caseAlwaysPart_BalStatement(relationTok);
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
        if (result == null) result = caseFlow_AnyStatement(segTok);
        if (result == null) result = caseFlow_BalStatement(segTok);
        if (result == null) result = caseAnyStatement(segTok);
        if (result == null) result = caseBalStatement(segTok);
        if (result == null) result = caseBindingL_Infixed_BalStatement(segTok);
        if (result == null) result = caseBinding_BalStatement(segTok);
        if (result == null) result = caseAlwaysPart_BalStatement(segTok);
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
        if (result == null) result = caseFlow_AnyStatement(plusTok);
        if (result == null) result = caseFlow_BalStatement(plusTok);
        if (result == null) result = caseAnyStatement(plusTok);
        if (result == null) result = caseBalStatement(plusTok);
        if (result == null) result = caseBindingL_Infixed_BalStatement(plusTok);
        if (result == null) result = caseBinding_BalStatement(plusTok);
        if (result == null) result = caseAlwaysPart_BalStatement(plusTok);
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
        if (result == null) result = caseFlow_AnyStatement(quotientTok);
        if (result == null) result = caseFlow_BalStatement(quotientTok);
        if (result == null) result = caseAnyStatement(quotientTok);
        if (result == null) result = caseBalStatement(quotientTok);
        if (result == null) result = caseBindingL_Infixed_BalStatement(quotientTok);
        if (result == null) result = caseBinding_BalStatement(quotientTok);
        if (result == null) result = caseAlwaysPart_BalStatement(quotientTok);
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
        if (result == null) result = caseFlow_AnyStatement(timesTok);
        if (result == null) result = caseFlow_BalStatement(timesTok);
        if (result == null) result = caseAnyStatement(timesTok);
        if (result == null) result = caseBalStatement(timesTok);
        if (result == null) result = caseBindingL_Infixed_BalStatement(timesTok);
        if (result == null) result = caseBinding_BalStatement(timesTok);
        if (result == null) result = caseAlwaysPart_BalStatement(timesTok);
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
        if (result == null) result = caseFlow_AnyStatement(powerTok);
        if (result == null) result = caseFlow_BalStatement(powerTok);
        if (result == null) result = caseAnyStatement(powerTok);
        if (result == null) result = caseBalStatement(powerTok);
        if (result == null) result = caseBindingL_Infixed_BalStatement(powerTok);
        if (result == null) result = caseBinding_BalStatement(powerTok);
        if (result == null) result = caseAlwaysPart_BalStatement(powerTok);
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
   * Returns the result of interpreting the object as an instance of '<em>Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeclaration(Declaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Export Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Export Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExportDecl(ExportDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>To Part</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>To Part</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseToPart(ToPart object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>From Part</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>From Part</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFromPart(FromPart object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Macro Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Macro Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMacroBody(MacroBody object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sig</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sig</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSig(Sig object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Decl Part</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Decl Part</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeclPart(DeclPart object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Comma</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Comma</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComma(Comma object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Comma Item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Comma Item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCommaItem(CommaItem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Decl Binding</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Decl Binding</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeclBinding(DeclBinding object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Infixed Exprs Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Infixed Exprs Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInfixedExprsDecl(InfixedExprsDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Infixed Exprs</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Infixed Exprs</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInfixedExprs(InfixedExprs object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Binding Any Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Binding Any Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBinding_AnyStatement(Binding_AnyStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Binding Bal Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Binding Bal Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBinding_BalStatement(Binding_BalStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Binding Collection</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Binding Collection</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBinding_Collection(Binding_Collection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Binding LInfixed Any Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Binding LInfixed Any Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBindingL_Infixed_AnyStatement(BindingL_Infixed_AnyStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Binding LInfixed Bal Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Binding LInfixed Bal Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBindingL_Infixed_BalStatement(BindingL_Infixed_BalStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Binding LInfixed Collection</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Binding LInfixed Collection</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBindingL_Infixed_Collection(BindingL_Infixed_Collection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Binding RInfixed Exprs Decl Any Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Binding RInfixed Exprs Decl Any Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBindingR_InfixedExprsDecl_AnyStatement(BindingR_InfixedExprsDecl_AnyStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Any Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Any Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnyStatement(AnyStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bal Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bal Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBalStatement(BalStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Flow Any Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Flow Any Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFlow_AnyStatement(Flow_AnyStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Flow Bal Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Flow Bal Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFlow_BalStatement(Flow_BalStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Gen Bound</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Gen Bound</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGenBound(GenBound object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>But Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>But Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseButExpr(ButExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cases</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cases</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCases(Cases object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Always Part Any Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Always Part Any Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAlwaysPart_AnyStatement(AlwaysPart_AnyStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Always Part Bal Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Always Part Bal Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAlwaysPart_BalStatement(AlwaysPart_BalStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Collection</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Collection</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCollection(Collection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Iterators</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Iterators</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIterators(Iterators object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Iterators1</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Iterators1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIterators1(Iterators1 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Iterator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Iterator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIterator(Iterator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>For Lhs</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>For Lhs</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseForLhs(ForLhs object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Suchthat Part</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Suchthat Part</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSuchthatPart(SuchthatPart object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Infixed</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Infixed</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInfixed(Infixed object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Infixed Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Infixed Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInfixedExpr(InfixedExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpr(Expr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseType(Type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>E12</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>E12</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseE12(E12 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>E13</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>E13</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseE13(E13 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Qual Tail</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Qual Tail</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQualTail(QualTail object)
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
   * Returns the result of interpreting the object as an instance of '<em>E14</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>E14</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseE14(E14 object)
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
   * Returns the result of interpreting the object as an instance of '<em>Left Juxtaposed</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Left Juxtaposed</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLeftJuxtaposed(LeftJuxtaposed object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Jright Atom</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Jright Atom</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJright_Atom(Jright_Atom object)
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
   * Returns the result of interpreting the object as an instance of '<em>Decl Molecule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Decl Molecule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeclMolecule(DeclMolecule object)
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
   * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBlock(Block object)
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
   * Returns the result of interpreting the object as an instance of '<em>enlist1 Comma Item Comma AB</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>enlist1 Comma Item Comma AB</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseenlist1_CommaItem_Comma_AB(enlist1_CommaItem_Comma_AB object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>enlist1 Infixed Comma AB</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>enlist1 Infixed Comma AB</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseenlist1_Infixed_Comma_AB(enlist1_Infixed_Comma_AB object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>enlist1 Infixed Expr Comma AB</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>enlist1 Infixed Expr Comma AB</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseenlist1_InfixedExpr_Comma_AB(enlist1_InfixedExpr_Comma_AB object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>enlister1 Comma Item Comma</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>enlister1 Comma Item Comma</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseenlister1_CommaItem_Comma(enlister1_CommaItem_Comma object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>enlister1 Infixed Comma</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>enlister1 Infixed Comma</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseenlister1_Infixed_Comma(enlister1_Infixed_Comma object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>enlister1 Infixed Expr Comma</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>enlister1 Infixed Expr Comma</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseenlister1_InfixedExpr_Comma(enlister1_InfixedExpr_Comma object)
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
   * Returns the result of interpreting the object as an instance of '<em>Curly Content BLabeled</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Curly Content BLabeled</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCurlyContentB_Labeled(CurlyContentB_Labeled object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>E3</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>E3</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseE3(E3 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>E4</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>E4</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseE4(E4 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>E5</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>E5</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseE5(E5 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>E6</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>E6</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseE6(E6 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>E7</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>E7</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseE7(E7 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>E8</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>E8</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseE8(E8 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>E9</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>E9</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseE9(E9 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>E11 E12</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>E11 E12</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseE11_E12(E11_E12 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>E11 Op</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>E11 Op</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseE11_Op(E11_Op object)
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
