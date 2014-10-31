/**
 */
package com.euclideanspace.aldor.editor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Jleft Atom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.Jleft_Atom#getBe <em>Be</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.Jleft_Atom#getA <em>A</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.Jleft_Atom#getBm4 <em>Bm4</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.aldor.editor.EditorPackage#getJleft_Atom()
 * @model
 * @generated
 */
public interface Jleft_Atom extends EObject
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
   * @see com.euclideanspace.aldor.editor.EditorPackage#getJleft_Atom_Be()
   * @model containment="true"
   * @generated
   */
  EList<BlockEnclosure> getBe();

  /**
   * Returns the value of the '<em><b>A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>A</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>A</em>' attribute.
   * @see #setA(String)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getJleft_Atom_A()
   * @model
   * @generated
   */
  String getA();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.Jleft_Atom#getA <em>A</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>A</em>' attribute.
   * @see #getA()
   * @generated
   */
  void setA(String value);

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
   * @see com.euclideanspace.aldor.editor.EditorPackage#getJleft_Atom_Bm4()
   * @model containment="true"
   * @generated
   */
  EList<BlockMolecule> getBm4();

} // Jleft_Atom
