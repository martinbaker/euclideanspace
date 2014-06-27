/**
 */
package com.euclideanspace.aldor.editor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Declaration Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.VariableDeclarationBlock#getVardecbr <em>Vardecbr</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.VariableDeclarationBlock#getVardecBlk <em>Vardec Blk</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.aldor.editor.EditorPackage#getVariableDeclarationBlock()
 * @model
 * @generated
 */
public interface VariableDeclarationBlock extends EObject
{
  /**
   * Returns the value of the '<em><b>Vardecbr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vardecbr</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vardecbr</em>' attribute.
   * @see #setVardecbr(String)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getVariableDeclarationBlock_Vardecbr()
   * @model
   * @generated
   */
  String getVardecbr();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.VariableDeclarationBlock#getVardecbr <em>Vardecbr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vardecbr</em>' attribute.
   * @see #getVardecbr()
   * @generated
   */
  void setVardecbr(String value);

  /**
   * Returns the value of the '<em><b>Vardec Blk</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.aldor.editor.VariableDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vardec Blk</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vardec Blk</em>' containment reference list.
   * @see com.euclideanspace.aldor.editor.EditorPackage#getVariableDeclarationBlock_VardecBlk()
   * @model containment="true"
   * @generated
   */
  EList<VariableDeclaration> getVardecBlk();

} // VariableDeclarationBlock
