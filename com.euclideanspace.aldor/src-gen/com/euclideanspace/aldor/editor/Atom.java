/**
 */
package com.euclideanspace.aldor.editor;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.Atom#getLab <em>Lab</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.Atom#getBm4 <em>Bm4</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.Atom#getId <em>Id</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.Atom#getLit <em>Lit</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.aldor.editor.EditorPackage#getAtom()
 * @model
 * @generated
 */
public interface Atom extends Labeled, Jleft_Atom, Molecule, BlockMolecule
{
  /**
   * Returns the value of the '<em><b>Lab</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lab</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lab</em>' containment reference.
   * @see #setLab(Labeled)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getAtom_Lab()
   * @model containment="true"
   * @generated
   */
  Labeled getLab();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.Atom#getLab <em>Lab</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lab</em>' containment reference.
   * @see #getLab()
   * @generated
   */
  void setLab(Labeled value);

  /**
   * Returns the value of the '<em><b>Bm4</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.aldor.editor.BlockMolecule}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bm4</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bm4</em>' containment reference list.
   * @see com.euclideanspace.aldor.editor.EditorPackage#getAtom_Bm4()
   * @model containment="true"
   * @generated
   */
  EList<BlockMolecule> getBm4();

  /**
   * Returns the value of the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' containment reference.
   * @see #setId(Id)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getAtom_Id()
   * @model containment="true"
   * @generated
   */
  Id getId();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.Atom#getId <em>Id</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' containment reference.
   * @see #getId()
   * @generated
   */
  void setId(Id value);

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
