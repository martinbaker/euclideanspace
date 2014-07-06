/**
 */
package com.euclideanspace.aldor.editor;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decl Molecule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.DeclMolecule#getA <em>A</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.DeclMolecule#getB <em>B</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.aldor.editor.EditorPackage#getDeclMolecule()
 * @model
 * @generated
 */
public interface DeclMolecule extends EObject
{
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
   * @see com.euclideanspace.aldor.editor.EditorPackage#getDeclMolecule_A()
   * @model
   * @generated
   */
  String getA();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.DeclMolecule#getA <em>A</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>A</em>' attribute.
   * @see #getA()
   * @generated
   */
  void setA(String value);

  /**
   * Returns the value of the '<em><b>B</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>B</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>B</em>' containment reference.
   * @see #setB(Block)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getDeclMolecule_B()
   * @model containment="true"
   * @generated
   */
  Block getB();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.DeclMolecule#getB <em>B</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>B</em>' containment reference.
   * @see #getB()
   * @generated
   */
  void setB(Block value);

} // DeclMolecule
