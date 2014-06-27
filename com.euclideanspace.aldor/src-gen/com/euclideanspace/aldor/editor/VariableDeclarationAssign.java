/**
 */
package com.euclideanspace.aldor.editor;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Declaration Assign</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.VariableDeclarationAssign#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.VariableDeclarationAssign#getT12 <em>T12</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.VariableDeclarationAssign#getTyp <em>Typ</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.VariableDeclarationAssign#getT4 <em>T4</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.aldor.editor.EditorPackage#getVariableDeclarationAssign()
 * @model
 * @generated
 */
public interface VariableDeclarationAssign extends AddStatements
{
  /**
   * Returns the value of the '<em><b>Var Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var Name</em>' attribute.
   * @see #setVarName(String)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getVariableDeclarationAssign_VarName()
   * @model
   * @generated
   */
  String getVarName();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.VariableDeclarationAssign#getVarName <em>Var Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var Name</em>' attribute.
   * @see #getVarName()
   * @generated
   */
  void setVarName(String value);

  /**
   * Returns the value of the '<em><b>T12</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T12</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T12</em>' attribute list.
   * @see com.euclideanspace.aldor.editor.EditorPackage#getVariableDeclarationAssign_T12()
   * @model unique="false"
   * @generated
   */
  EList<String> getT12();

  /**
   * Returns the value of the '<em><b>Typ</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Typ</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Typ</em>' containment reference.
   * @see #setTyp(TypeExpression)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getVariableDeclarationAssign_Typ()
   * @model containment="true"
   * @generated
   */
  TypeExpression getTyp();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.VariableDeclarationAssign#getTyp <em>Typ</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Typ</em>' containment reference.
   * @see #getTyp()
   * @generated
   */
  void setTyp(TypeExpression value);

  /**
   * Returns the value of the '<em><b>T4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T4</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T4</em>' containment reference.
   * @see #setT4(Expr)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getVariableDeclarationAssign_T4()
   * @model containment="true"
   * @generated
   */
  Expr getT4();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.VariableDeclarationAssign#getT4 <em>T4</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T4</em>' containment reference.
   * @see #getT4()
   * @generated
   */
  void setT4(Expr value);

} // VariableDeclarationAssign
