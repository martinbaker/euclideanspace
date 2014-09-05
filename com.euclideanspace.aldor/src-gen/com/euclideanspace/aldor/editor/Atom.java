/**
 */
package com.euclideanspace.aldor.editor;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.Atom#getIden <em>Iden</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.Atom#getLit <em>Lit</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.aldor.editor.EditorPackage#getAtom()
 * @model
 * @generated
 */
public interface Atom extends Molecule, BlockMolecule
{
  /**
   * Returns the value of the '<em><b>Iden</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Iden</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Iden</em>' containment reference.
   * @see #setIden(Id)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getAtom_Iden()
   * @model containment="true"
   * @generated
   */
  Id getIden();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.Atom#getIden <em>Iden</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Iden</em>' containment reference.
   * @see #getIden()
   * @generated
   */
  void setIden(Id value);

  /**
   * Returns the value of the '<em><b>Lit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lit</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lit</em>' attribute.
   * @see #setLit(String)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getAtom_Lit()
   * @model
   * @generated
   */
  String getLit();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.Atom#getLit <em>Lit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lit</em>' attribute.
   * @see #getLit()
   * @generated
   */
  void setLit(String value);

} // Atom
