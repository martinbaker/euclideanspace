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
 *   <li>{@link com.euclideanspace.spad.editor.VariableDeclaration#getT1 <em>T1</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.VariableDeclaration#getT2 <em>T2</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.VariableDeclaration#getV1 <em>V1</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.VariableDeclaration#getV2 <em>V2</em>}</li>
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
   * Returns the value of the '<em><b>T1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T1</em>' containment reference.
   * @see #setT1(TypeExpression)
   * @see com.euclideanspace.spad.editor.EditorPackage#getVariableDeclaration_T1()
   * @model containment="true"
   * @generated
   */
  TypeExpression getT1();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.VariableDeclaration#getT1 <em>T1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T1</em>' containment reference.
   * @see #getT1()
   * @generated
   */
  void setT1(TypeExpression value);

  /**
   * Returns the value of the '<em><b>T2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T2</em>' containment reference.
   * @see #setT2(TypeExpression)
   * @see com.euclideanspace.spad.editor.EditorPackage#getVariableDeclaration_T2()
   * @model containment="true"
   * @generated
   */
  TypeExpression getT2();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.VariableDeclaration#getT2 <em>T2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T2</em>' containment reference.
   * @see #getT2()
   * @generated
   */
  void setT2(TypeExpression value);

  /**
   * Returns the value of the '<em><b>V1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>V1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>V1</em>' containment reference.
   * @see #setV1(VariableTyped)
   * @see com.euclideanspace.spad.editor.EditorPackage#getVariableDeclaration_V1()
   * @model containment="true"
   * @generated
   */
  VariableTyped getV1();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.VariableDeclaration#getV1 <em>V1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>V1</em>' containment reference.
   * @see #getV1()
   * @generated
   */
  void setV1(VariableTyped value);

  /**
   * Returns the value of the '<em><b>V2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>V2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>V2</em>' containment reference.
   * @see #setV2(VariableDeclarationBlock)
   * @see com.euclideanspace.spad.editor.EditorPackage#getVariableDeclaration_V2()
   * @model containment="true"
   * @generated
   */
  VariableDeclarationBlock getV2();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.VariableDeclaration#getV2 <em>V2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>V2</em>' containment reference.
   * @see #getV2()
   * @generated
   */
  void setV2(VariableDeclarationBlock value);

} // VariableDeclaration
