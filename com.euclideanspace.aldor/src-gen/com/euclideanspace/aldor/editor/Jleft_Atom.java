/**
 */
package com.euclideanspace.aldor.editor;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Jleft Atom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.Jleft_Atom#getA <em>A</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.Jleft_Atom#getBe <em>Be</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.Jleft_Atom#getN <em>N</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.aldor.editor.EditorPackage#getJleft_Atom()
 * @model
 * @generated
 */
public interface Jleft_Atom extends Jright_Atom
{
  /**
   * Returns the value of the '<em><b>A</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>A</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>A</em>' containment reference.
   * @see #setA(Atom)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getJleft_Atom_A()
   * @model containment="true"
   * @generated
   */
  Atom getA();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.Jleft_Atom#getA <em>A</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>A</em>' containment reference.
   * @see #getA()
   * @generated
   */
  void setA(Atom value);

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
   * Returns the value of the '<em><b>N</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>N</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>N</em>' attribute.
   * @see #setN(String)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getJleft_Atom_N()
   * @model
   * @generated
   */
  String getN();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.Jleft_Atom#getN <em>N</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>N</em>' attribute.
   * @see #getN()
   * @generated
   */
  void setN(String value);

} // Jleft_Atom
