/**
 */
package com.euclideanspace.aldor.editor;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>E14</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.E14#getE15left <em>E1 5left</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.E14#getOp <em>Op</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.E14#getDm <em>Dm</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.E14#getE15right <em>E1 5right</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.aldor.editor.EditorPackage#getE14()
 * @model
 * @generated
 */
public interface E14 extends Expr
{
  /**
   * Returns the value of the '<em><b>E1 5left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>E1 5left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>E1 5left</em>' containment reference.
   * @see #setE15left(E15)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getE14_E15left()
   * @model containment="true"
   * @generated
   */
  E15 getE15left();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.E14#getE15left <em>E1 5left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>E1 5left</em>' containment reference.
   * @see #getE15left()
   * @generated
   */
  void setE15left(E15 value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see #setOp(String)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getE14_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.E14#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

  /**
   * Returns the value of the '<em><b>Dm</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dm</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dm</em>' containment reference.
   * @see #setDm(DeclMolecule)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getE14_Dm()
   * @model containment="true"
   * @generated
   */
  DeclMolecule getDm();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.E14#getDm <em>Dm</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dm</em>' containment reference.
   * @see #getDm()
   * @generated
   */
  void setDm(DeclMolecule value);

  /**
   * Returns the value of the '<em><b>E1 5right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>E1 5right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>E1 5right</em>' containment reference.
   * @see #setE15right(E15)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getE14_E15right()
   * @model containment="true"
   * @generated
   */
  E15 getE15right();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.E14#getE15right <em>E1 5right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>E1 5right</em>' containment reference.
   * @see #getE15right()
   * @generated
   */
  void setE15right(E15 value);

} // E14
