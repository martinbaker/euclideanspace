/**
 */
package com.euclideanspace.spad.editor;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.spad.editor.VariableDeclaration#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.VariableDeclaration#getTyp <em>Typ</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.spad.editor.EditorPackage#getVariableDeclaration()
 * @model
 * @generated
 */
public interface VariableDeclaration extends WhereAssignments
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
   * @see com.euclideanspace.spad.editor.EditorPackage#getVariableDeclaration_VarName()
   * @model
   * @generated
   */
  String getVarName();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.VariableDeclaration#getVarName <em>Var Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var Name</em>' attribute.
   * @see #getVarName()
   * @generated
   */
  void setVarName(String value);

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
   * @see com.euclideanspace.spad.editor.EditorPackage#getVariableDeclaration_Typ()
   * @model containment="true"
   * @generated
   */
  TypeExpression getTyp();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.VariableDeclaration#getTyp <em>Typ</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Typ</em>' containment reference.
   * @see #getTyp()
   * @generated
   */
  void setTyp(TypeExpression value);

} // VariableDeclaration
