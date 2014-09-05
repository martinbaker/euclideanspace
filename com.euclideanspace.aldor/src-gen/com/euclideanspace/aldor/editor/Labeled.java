/**
 */
package com.euclideanspace.aldor.editor;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Labeled</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.Labeled#getC <em>C</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.Labeled#getD <em>D</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.Labeled#getA <em>A</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.Labeled#getLab <em>Lab</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.aldor.editor.EditorPackage#getLabeled()
 * @model
 * @generated
 */
public interface Labeled extends EObject
{
  /**
   * Returns the value of the '<em><b>C</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>C</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>C</em>' containment reference.
   * @see #setC(Comma)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getLabeled_C()
   * @model containment="true"
   * @generated
   */
  Comma getC();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.Labeled#getC <em>C</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>C</em>' containment reference.
   * @see #getC()
   * @generated
   */
  void setC(Comma value);

  /**
   * Returns the value of the '<em><b>D</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>D</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>D</em>' containment reference.
   * @see #setD(Declaration)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getLabeled_D()
   * @model containment="true"
   * @generated
   */
  Declaration getD();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.Labeled#getD <em>D</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>D</em>' containment reference.
   * @see #getD()
   * @generated
   */
  void setD(Declaration value);

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
   * @see com.euclideanspace.aldor.editor.EditorPackage#getLabeled_A()
   * @model containment="true"
   * @generated
   */
  Atom getA();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.Labeled#getA <em>A</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>A</em>' containment reference.
   * @see #getA()
   * @generated
   */
  void setA(Atom value);

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
   * @see com.euclideanspace.aldor.editor.EditorPackage#getLabeled_Lab()
   * @model containment="true"
   * @generated
   */
  Labeled getLab();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.Labeled#getLab <em>Lab</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lab</em>' containment reference.
   * @see #getLab()
   * @generated
   */
  void setLab(Labeled value);

} // Labeled
