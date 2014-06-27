/**
 */
package com.euclideanspace.aldor.editor;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tuple Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.TupleDefinition#getT4 <em>T4</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.TupleDefinition#getT25 <em>T25</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.aldor.editor.EditorPackage#getTupleDefinition()
 * @model
 * @generated
 */
public interface TupleDefinition extends TypePrimaryExpression
{
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
   * @see com.euclideanspace.aldor.editor.EditorPackage#getTupleDefinition_T4()
   * @model containment="true"
   * @generated
   */
  TypeExpression getT4();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.TupleDefinition#getT4 <em>T4</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T4</em>' containment reference.
   * @see #getT4()
   * @generated
   */
  void setT4(TypeExpression value);

  /**
   * Returns the value of the '<em><b>T25</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.aldor.editor.TypeExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T25</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T25</em>' containment reference list.
   * @see com.euclideanspace.aldor.editor.EditorPackage#getTupleDefinition_T25()
   * @model containment="true"
   * @generated
   */
  EList<TypeExpression> getT25();

} // TupleDefinition
