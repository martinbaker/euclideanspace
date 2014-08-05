/**
 */
package com.euclideanspace.aldor.editor;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Jleft Molecule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.Jleft_Molecule#getBe <em>Be</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.Jleft_Molecule#getM <em>M</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.Jleft_Molecule#getBm <em>Bm</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.aldor.editor.EditorPackage#getJleft_Molecule()
 * @model
 * @generated
 */
public interface Jleft_Molecule extends LeftJuxtaposed, Jright_Molecule
{
  /**
   * Returns the value of the '<em><b>Be</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Be</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Be</em>' containment reference.
   * @see #setBe(BlockEnclosure)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getJleft_Molecule_Be()
   * @model containment="true"
   * @generated
   */
  BlockEnclosure getBe();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.Jleft_Molecule#getBe <em>Be</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Be</em>' containment reference.
   * @see #getBe()
   * @generated
   */
  void setBe(BlockEnclosure value);

  /**
   * Returns the value of the '<em><b>M</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>M</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>M</em>' containment reference.
   * @see #setM(Molecule)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getJleft_Molecule_M()
   * @model containment="true"
   * @generated
   */
  Molecule getM();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.Jleft_Molecule#getM <em>M</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>M</em>' containment reference.
   * @see #getM()
   * @generated
   */
  void setM(Molecule value);

  /**
   * Returns the value of the '<em><b>Bm</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.aldor.editor.BlockMolecule}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bm</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bm</em>' containment reference list.
   * @see com.euclideanspace.aldor.editor.EditorPackage#getJleft_Molecule_Bm()
   * @model containment="true"
   * @generated
   */
  EList<BlockMolecule> getBm();

} // Jleft_Molecule
