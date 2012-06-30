/**
 */
package com.euclideanspace.spad.editor;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.spad.editor.UnaryExpression#getUop <em>Uop</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.UnaryExpression#getExpr <em>Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.spad.editor.EditorPackage#getUnaryExpression()
 * @model
 * @generated
 */
public interface UnaryExpression extends Expr
{
  /**
   * Returns the value of the '<em><b>Uop</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Uop</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Uop</em>' attribute.
   * @see #setUop(String)
   * @see com.euclideanspace.spad.editor.EditorPackage#getUnaryExpression_Uop()
   * @model
   * @generated
   */
  String getUop();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.UnaryExpression#getUop <em>Uop</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Uop</em>' attribute.
   * @see #getUop()
   * @generated
   */
  void setUop(String value);

  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference.
   * @see #setExpr(Expr)
   * @see com.euclideanspace.spad.editor.EditorPackage#getUnaryExpression_Expr()
   * @model containment="true"
   * @generated
   */
  Expr getExpr();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.UnaryExpression#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(Expr value);

} // UnaryExpression
