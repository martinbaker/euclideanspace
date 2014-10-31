/**
 */
package com.euclideanspace.aldor.editor;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Jright Molecule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.Jright_Molecule#getLeft3 <em>Left3</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.Jright_Molecule#getRight3 <em>Right3</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.aldor.editor.EditorPackage#getJright_Molecule()
 * @model
 * @generated
 */
public interface Jright_Molecule extends RightJuxtaposed
{
  /**
   * Returns the value of the '<em><b>Left3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left3</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left3</em>' containment reference.
   * @see #setLeft3(Jleft_Molecule)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getJright_Molecule_Left3()
   * @model containment="true"
   * @generated
   */
  Jleft_Molecule getLeft3();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.Jright_Molecule#getLeft3 <em>Left3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left3</em>' containment reference.
   * @see #getLeft3()
   * @generated
   */
  void setLeft3(Jleft_Molecule value);

  /**
   * Returns the value of the '<em><b>Right3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right3</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right3</em>' containment reference.
   * @see #setRight3(Jright_Atom)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getJright_Molecule_Right3()
   * @model containment="true"
   * @generated
   */
  Jright_Atom getRight3();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.Jright_Molecule#getRight3 <em>Right3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right3</em>' containment reference.
   * @see #getRight3()
   * @generated
   */
  void setRight3(Jright_Atom value);

} // Jright_Molecule
