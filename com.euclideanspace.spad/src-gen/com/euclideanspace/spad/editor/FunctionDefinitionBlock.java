/**
 */
package com.euclideanspace.spad.editor;

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
 *   <li>{@link com.euclideanspace.spad.editor.FunctionDefinitionBlock#getFnDecBr <em>Fn Dec Br</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.FunctionDefinitionBlock#getFnDecBk <em>Fn Dec Bk</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.spad.editor.EditorPackage#getFunctionDefinitionBlock()
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
   * @see com.euclideanspace.spad.editor.EditorPackage#getFunctionDefinitionBlock_FnDecBr()
   * @model
   * @generated
   */
  String getFnDecBr();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.FunctionDefinitionBlock#getFnDecBr <em>Fn Dec Br</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fn Dec Br</em>' attribute.
   * @see #getFnDecBr()
   * @generated
   */
  void setFnDecBr(String value);

  /**
   * Returns the value of the '<em><b>Fn Dec Bk</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.spad.editor.FunctionDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fn Dec Bk</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fn Dec Bk</em>' containment reference list.
   * @see com.euclideanspace.spad.editor.EditorPackage#getFunctionDefinitionBlock_FnDecBk()
   * @model containment="true"
   * @generated
   */
  EList<FunctionDefinition> getFnDecBk();

} // FunctionDefinitionBlock
