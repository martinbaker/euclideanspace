/**
 */
package com.euclideanspace.aldor.editor;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Molecule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.Molecule#getBm <em>Bm</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.aldor.editor.EditorPackage#getMolecule()
 * @model
 * @generated
 */
public interface Molecule extends Jleft_Molecule
{
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
   * @see com.euclideanspace.aldor.editor.EditorPackage#getMolecule_Bm()
   * @model containment="true"
   * @generated
   */
  EList<BlockMolecule> getBm();

} // Molecule
