/**
 */
package com.euclideanspace.spad.editor;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Name Or Function Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.spad.editor.TypeNameOrFunctionCall#getTfnname <em>Tfnname</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.TypeNameOrFunctionCall#getT4 <em>T4</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.TypeNameOrFunctionCall#getT25 <em>T25</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.TypeNameOrFunctionCall#getT6 <em>T6</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.spad.editor.EditorPackage#getTypeNameOrFunctionCall()
 * @model
 * @generated
 */
public interface TypeNameOrFunctionCall extends TypePrimaryExpression
{
  /**
   * Returns the value of the '<em><b>Tfnname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tfnname</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tfnname</em>' attribute.
   * @see #setTfnname(String)
   * @see com.euclideanspace.spad.editor.EditorPackage#getTypeNameOrFunctionCall_Tfnname()
   * @model
   * @generated
   */
  String getTfnname();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.TypeNameOrFunctionCall#getTfnname <em>Tfnname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tfnname</em>' attribute.
   * @see #getTfnname()
   * @generated
   */
  void setTfnname(String value);

  /**
   * Returns the value of the '<em><b>T4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T4</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T4</em>' containment reference.
   * @see #setT4(TypeExpression)
   * @see com.euclideanspace.spad.editor.EditorPackage#getTypeNameOrFunctionCall_T4()
   * @model containment="true"
   * @generated
   */
  TypeExpression getT4();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.TypeNameOrFunctionCall#getT4 <em>T4</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T4</em>' containment reference.
   * @see #getT4()
   * @generated
   */
  void setT4(TypeExpression value);

  /**
   * Returns the value of the '<em><b>T25</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.spad.editor.TypeExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T25</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T25</em>' containment reference list.
   * @see com.euclideanspace.spad.editor.EditorPackage#getTypeNameOrFunctionCall_T25()
   * @model containment="true"
   * @generated
   */
  EList<TypeExpression> getT25();

  /**
   * Returns the value of the '<em><b>T6</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T6</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T6</em>' containment reference.
   * @see #setT6(TypePrimaryExpression)
   * @see com.euclideanspace.spad.editor.EditorPackage#getTypeNameOrFunctionCall_T6()
   * @model containment="true"
   * @generated
   */
  TypePrimaryExpression getT6();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.TypeNameOrFunctionCall#getT6 <em>T6</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T6</em>' containment reference.
   * @see #getT6()
   * @generated
   */
  void setT6(TypePrimaryExpression value);

} // TypeNameOrFunctionCall
