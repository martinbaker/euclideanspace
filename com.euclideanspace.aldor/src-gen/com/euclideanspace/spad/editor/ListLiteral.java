/**
 */
package com.euclideanspace.spad.editor;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.spad.editor.ListLiteral#getLitname <em>Litname</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.ListLiteral#getL2 <em>L2</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.ListLiteral#getT3 <em>T3</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.ListLiteral#getT14 <em>T14</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.ListLiteral#getL5 <em>L5</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.spad.editor.EditorPackage#getListLiteral()
 * @model
 * @generated
 */
public interface ListLiteral extends Literal
{
  /**
   * Returns the value of the '<em><b>Litname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Litname</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Litname</em>' attribute.
   * @see #setLitname(String)
   * @see com.euclideanspace.spad.editor.EditorPackage#getListLiteral_Litname()
   * @model
   * @generated
   */
  String getLitname();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.ListLiteral#getLitname <em>Litname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Litname</em>' attribute.
   * @see #getLitname()
   * @generated
   */
  void setLitname(String value);

  /**
   * Returns the value of the '<em><b>L2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>L2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>L2</em>' containment reference.
   * @see #setL2(Expr)
   * @see com.euclideanspace.spad.editor.EditorPackage#getListLiteral_L2()
   * @model containment="true"
   * @generated
   */
  Expr getL2();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.ListLiteral#getL2 <em>L2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>L2</em>' containment reference.
   * @see #getL2()
   * @generated
   */
  void setL2(Expr value);

  /**
   * Returns the value of the '<em><b>T3</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.spad.editor.Expr}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T3</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T3</em>' containment reference list.
   * @see com.euclideanspace.spad.editor.EditorPackage#getListLiteral_T3()
   * @model containment="true"
   * @generated
   */
  EList<Expr> getT3();

  /**
   * Returns the value of the '<em><b>T14</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.spad.editor.Expr}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T14</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T14</em>' containment reference list.
   * @see com.euclideanspace.spad.editor.EditorPackage#getListLiteral_T14()
   * @model containment="true"
   * @generated
   */
  EList<Expr> getT14();

  /**
   * Returns the value of the '<em><b>L5</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.spad.editor.Expr}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>L5</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>L5</em>' containment reference list.
   * @see com.euclideanspace.spad.editor.EditorPackage#getListLiteral_L5()
   * @model containment="true"
   * @generated
   */
  EList<Expr> getL5();

} // ListLiteral
