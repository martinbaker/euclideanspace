/**
 */
package com.euclideanspace.spad.editor;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.spad.editor.Model#getC <em>C</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.Model#getP <em>P</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.Model#getD <em>D</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.spad.editor.EditorPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
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
   * @see #setC(CategoryDef)
   * @see com.euclideanspace.spad.editor.EditorPackage#getModel_C()
   * @model containment="true"
   * @generated
   */
  CategoryDef getC();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.Model#getC <em>C</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>C</em>' containment reference.
   * @see #getC()
   * @generated
   */
  void setC(CategoryDef value);

  /**
   * Returns the value of the '<em><b>P</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>P</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>P</em>' containment reference.
   * @see #setP(PackageDef)
   * @see com.euclideanspace.spad.editor.EditorPackage#getModel_P()
   * @model containment="true"
   * @generated
   */
  PackageDef getP();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.Model#getP <em>P</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>P</em>' containment reference.
   * @see #getP()
   * @generated
   */
  void setP(PackageDef value);

  /**
   * Returns the value of the '<em><b>D</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>D</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>D</em>' containment reference.
   * @see #setD(DomainDef)
   * @see com.euclideanspace.spad.editor.EditorPackage#getModel_D()
   * @model containment="true"
   * @generated
   */
  DomainDef getD();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.Model#getD <em>D</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>D</em>' containment reference.
   * @see #getD()
   * @generated
   */
  void setD(DomainDef value);

} // Model
