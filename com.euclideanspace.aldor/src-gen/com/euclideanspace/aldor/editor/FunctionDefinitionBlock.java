/**
 */
package com.euclideanspace.aldor.editor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Definition Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.FunctionDefinitionBlock#getFnDecBr <em>Fn Dec Br</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.FunctionDefinitionBlock#getFnDecBk <em>Fn Dec Bk</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.FunctionDefinitionBlock#getVars <em>Vars</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.FunctionDefinitionBlock#getT1 <em>T1</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.FunctionDefinitionBlock#getT13 <em>T13</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.FunctionDefinitionBlock#getT14 <em>T14</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.FunctionDefinitionBlock#getI1 <em>I1</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.FunctionDefinitionBlock#getE <em>E</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.aldor.editor.EditorPackage#getFunctionDefinitionBlock()
 * @model
 * @generated
 */
public interface FunctionDefinitionBlock extends EObject
{
  /**
   * Returns the value of the '<em><b>Fn Dec Br</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fn Dec Br</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fn Dec Br</em>' attribute.
   * @see #setFnDecBr(String)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getFunctionDefinitionBlock_FnDecBr()
   * @model
   * @generated
   */
  String getFnDecBr();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.FunctionDefinitionBlock#getFnDecBr <em>Fn Dec Br</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fn Dec Br</em>' attribute.
   * @see #getFnDecBr()
   * @generated
   */
  void setFnDecBr(String value);

  /**
   * Returns the value of the '<em><b>Fn Dec Bk</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.aldor.editor.FunctionDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fn Dec Bk</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fn Dec Bk</em>' containment reference list.
   * @see com.euclideanspace.aldor.editor.EditorPackage#getFunctionDefinitionBlock_FnDecBk()
   * @model containment="true"
   * @generated
   */
  EList<FunctionDefinition> getFnDecBk();

  /**
   * Returns the value of the '<em><b>Vars</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.aldor.editor.VariableDeclarationAssign}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vars</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vars</em>' containment reference list.
   * @see com.euclideanspace.aldor.editor.EditorPackage#getFunctionDefinitionBlock_Vars()
   * @model containment="true"
   * @generated
   */
  EList<VariableDeclarationAssign> getVars();

  /**
   * Returns the value of the '<em><b>T1</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.aldor.editor.Expr}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T1</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T1</em>' containment reference list.
   * @see com.euclideanspace.aldor.editor.EditorPackage#getFunctionDefinitionBlock_T1()
   * @model containment="true"
   * @generated
   */
  EList<Expr> getT1();

  /**
   * Returns the value of the '<em><b>T13</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.aldor.editor.FunctionDefinitionBlock}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T13</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T13</em>' containment reference list.
   * @see com.euclideanspace.aldor.editor.EditorPackage#getFunctionDefinitionBlock_T13()
   * @model containment="true"
   * @generated
   */
  EList<FunctionDefinitionBlock> getT13();

  /**
   * Returns the value of the '<em><b>T14</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.aldor.editor.FunctionDefinitionBlock}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T14</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T14</em>' containment reference list.
   * @see com.euclideanspace.aldor.editor.EditorPackage#getFunctionDefinitionBlock_T14()
   * @model containment="true"
   * @generated
   */
  EList<FunctionDefinitionBlock> getT14();

  /**
   * Returns the value of the '<em><b>I1</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.aldor.editor.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>I1</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>I1</em>' containment reference list.
   * @see com.euclideanspace.aldor.editor.EditorPackage#getFunctionDefinitionBlock_I1()
   * @model containment="true"
   * @generated
   */
  EList<Import> getI1();

  /**
   * Returns the value of the '<em><b>E</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>E</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>E</em>' containment reference.
   * @see #setE(Expr)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getFunctionDefinitionBlock_E()
   * @model containment="true"
   * @generated
   */
  Expr getE();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.FunctionDefinitionBlock#getE <em>E</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>E</em>' containment reference.
   * @see #getE()
   * @generated
   */
  void setE(Expr value);

} // FunctionDefinitionBlock
