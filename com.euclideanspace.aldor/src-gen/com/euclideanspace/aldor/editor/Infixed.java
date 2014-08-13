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
 *   <li>{@link com.euclideanspace.aldor.editor.Infixed#getBib <em>Bib</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.Infixed#getBic <em>Bic</em>}</li>
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
public interface Infixed extends ToPart, BindingL_Infixed_BalStatement, BindingL_Infixed_Collection, Collection, ForLhs, SuchthatPart, enlister1_Infixed_Comma
{
  /**
   * Returns the value of the '<em><b>Bib</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bib</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bib</em>' containment reference.
   * @see #setBib(BindingL_Infixed_BalStatement)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getInfixed_Bib()
   * @model containment="true"
   * @generated
   */
  BindingL_Infixed_BalStatement getBib();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.Infixed#getBib <em>Bib</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bib</em>' containment reference.
   * @see #getBib()
   * @generated
   */
  void setBib(BindingL_Infixed_BalStatement value);

  /**
   * Returns the value of the '<em><b>Bic</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bic</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bic</em>' containment reference.
   * @see #setBic(BindingL_Infixed_Collection)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getInfixed_Bic()
   * @model containment="true"
   * @generated
   */
  BindingL_Infixed_Collection getBic();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.Infixed#getBic <em>Bic</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bic</em>' containment reference.
   * @see #getBic()
   * @generated
   */
  void setBic(BindingL_Infixed_Collection value);

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
   * Returns the value of the '<em><b>Dp</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.aldor.editor.DeclPart}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dp</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dp</em>' containment reference list.
   * @see com.euclideanspace.aldor.editor.EditorPackage#getInfixed_Dp()
   * @model containment="true"
   * @generated
   */
  EList<DeclPart> getDp();

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
