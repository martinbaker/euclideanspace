/**
 */
package com.euclideanspace.spad.editor;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Predicate Or</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.spad.editor.PredicateOr#getLeft <em>Left</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.PredicateOr#getPrname <em>Prname</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.PredicateOr#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.spad.editor.EditorPackage#getPredicateOr()
 * @model
 * @generated
 */
public interface PredicateOr extends Predicate
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Predicate)
   * @see com.euclideanspace.spad.editor.EditorPackage#getPredicateOr_Left()
   * @model containment="true"
   * @generated
   */
  Predicate getLeft();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.PredicateOr#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Predicate value);

  /**
   * Returns the value of the '<em><b>Prname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Prname</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prname</em>' attribute.
   * @see #setPrname(String)
   * @see com.euclideanspace.spad.editor.EditorPackage#getPredicateOr_Prname()
   * @model
   * @generated
   */
  String getPrname();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.PredicateOr#getPrname <em>Prname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Prname</em>' attribute.
   * @see #getPrname()
   * @generated
   */
  void setPrname(String value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Predicate)
   * @see com.euclideanspace.spad.editor.EditorPackage#getPredicateOr_Right()
   * @model containment="true"
   * @generated
   */
  Predicate getRight();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.PredicateOr#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Predicate value);

} // PredicateOr
