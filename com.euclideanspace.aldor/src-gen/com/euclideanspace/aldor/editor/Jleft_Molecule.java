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
 *   <li>{@link com.euclideanspace.aldor.editor.Jleft_Molecule#getM2 <em>M2</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.aldor.editor.EditorPackage#getJleft_Molecule()
 * @model
 * @generated
 */
public interface Jleft_Molecule extends LeftJuxtaposed
{
  /**
   * Returns the value of the '<em><b>Be</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.aldor.editor.BlockEnclosure}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Be</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Be</em>' containment reference list.
   * @see com.euclideanspace.aldor.editor.EditorPackage#getJleft_Molecule_Be()
   * @model containment="true"
   * @generated
   */
  EList<BlockEnclosure> getBe();

  /**
   * Returns the value of the '<em><b>M</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>M</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>M</em>' attribute.
   * @see #setM(String)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getJleft_Molecule_M()
   * @model
   * @generated
   */
  String getM();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.Jleft_Molecule#getM <em>M</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>M</em>' attribute.
   * @see #getM()
   * @generated
   */
  void setM(String value);

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

  /**
   * Returns the value of the '<em><b>M2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>M2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>M2</em>' containment reference.
   * @see #setM2(Molecule)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getJleft_Molecule_M2()
   * @model containment="true"
   * @generated
   */
  Molecule getM2();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.Jleft_Molecule#getM2 <em>M2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>M2</em>' containment reference.
   * @see #getM2()
   * @generated
   */
  void setM2(Molecule value);

} // Jleft_Molecule
