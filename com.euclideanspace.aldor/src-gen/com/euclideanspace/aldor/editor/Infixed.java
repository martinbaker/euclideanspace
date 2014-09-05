/**
 */
package com.euclideanspace.aldor.editor;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Infixed</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.Infixed#getI3 <em>I3</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.Infixed#getIfx <em>Ifx</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.Infixed#getDp <em>Dp</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.Infixed#getB <em>B</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.Infixed#getI2 <em>I2</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.aldor.editor.EditorPackage#getInfixed()
 * @model
 * @generated
 */
public interface Infixed extends ToPart, Collection, ForLhs, SuchthatPart, enlister1_Infixed_Comma
{
  /**
   * Returns the value of the '<em><b>I3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>I3</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>I3</em>' containment reference.
   * @see #setI3(Iterators)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getInfixed_I3()
   * @model containment="true"
   * @generated
   */
  Iterators getI3();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.Infixed#getI3 <em>I3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>I3</em>' containment reference.
   * @see #getI3()
   * @generated
   */
  void setI3(Iterators value);

  /**
   * Returns the value of the '<em><b>Ifx</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ifx</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ifx</em>' containment reference.
   * @see #setIfx(InfixedExpr)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getInfixed_Ifx()
   * @model containment="true"
   * @generated
   */
  InfixedExpr getIfx();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.Infixed#getIfx <em>Ifx</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ifx</em>' containment reference.
   * @see #getIfx()
   * @generated
   */
  void setIfx(InfixedExpr value);

  /**
   * Returns the value of the '<em><b>Dp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dp</em>' containment reference.
   * @see #setDp(DeclPart)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getInfixed_Dp()
   * @model containment="true"
   * @generated
   */
  DeclPart getDp();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.Infixed#getDp <em>Dp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dp</em>' containment reference.
   * @see #getDp()
   * @generated
   */
  void setDp(DeclPart value);

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
   * @see com.euclideanspace.aldor.editor.EditorPackage#getInfixed_B()
   * @model containment="true"
   * @generated
   */
  Block getB();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.Infixed#getB <em>B</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>B</em>' containment reference.
   * @see #getB()
   * @generated
   */
  void setB(Block value);

  /**
   * Returns the value of the '<em><b>I2</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.aldor.editor.Infixed}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>I2</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>I2</em>' containment reference list.
   * @see com.euclideanspace.aldor.editor.EditorPackage#getInfixed_I2()
   * @model containment="true"
   * @generated
   */
  EList<Infixed> getI2();

} // Infixed
