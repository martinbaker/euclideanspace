/**
 */
package com.euclideanspace.aldor.editor;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow Bal Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.Flow_BalStatement#getC2 <em>C2</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.Flow_BalStatement#getSt2 <em>St2</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.Flow_BalStatement#getBbs3 <em>Bbs3</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.Flow_BalStatement#getCi2 <em>Ci2</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.Flow_BalStatement#getBbs4 <em>Bbs4</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.Flow_BalStatement#getBbs5 <em>Bbs5</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.Flow_BalStatement#getBbs2 <em>Bbs2</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.Flow_BalStatement#getBe <em>Be</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.Flow_BalStatement#getApb <em>Apb</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.Flow_BalStatement#getCa2 <em>Ca2</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.Flow_BalStatement#getGb2 <em>Gb2</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.Flow_BalStatement#getN2 <em>N2</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.Flow_BalStatement#getI3 <em>I3</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.aldor.editor.EditorPackage#getFlow_BalStatement()
 * @model
 * @generated
 */
public interface Flow_BalStatement extends BalStatement
{
  /**
   * Returns the value of the '<em><b>C2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>C2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>C2</em>' containment reference.
   * @see #setC2(Collection)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getFlow_BalStatement_C2()
   * @model containment="true"
   * @generated
   */
  Collection getC2();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.Flow_BalStatement#getC2 <em>C2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>C2</em>' containment reference.
   * @see #getC2()
   * @generated
   */
  void setC2(Collection value);

  /**
   * Returns the value of the '<em><b>St2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>St2</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>St2</em>' attribute.
   * @see #setSt2(String)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getFlow_BalStatement_St2()
   * @model
   * @generated
   */
  String getSt2();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.Flow_BalStatement#getSt2 <em>St2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>St2</em>' attribute.
   * @see #getSt2()
   * @generated
   */
  void setSt2(String value);

  /**
   * Returns the value of the '<em><b>Bbs3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bbs3</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bbs3</em>' containment reference.
   * @see #setBbs3(Binding_BalStatement)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getFlow_BalStatement_Bbs3()
   * @model containment="true"
   * @generated
   */
  Binding_BalStatement getBbs3();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.Flow_BalStatement#getBbs3 <em>Bbs3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bbs3</em>' containment reference.
   * @see #getBbs3()
   * @generated
   */
  void setBbs3(Binding_BalStatement value);

  /**
   * Returns the value of the '<em><b>Ci2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ci2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ci2</em>' containment reference.
   * @see #setCi2(CommaItem)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getFlow_BalStatement_Ci2()
   * @model containment="true"
   * @generated
   */
  CommaItem getCi2();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.Flow_BalStatement#getCi2 <em>Ci2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ci2</em>' containment reference.
   * @see #getCi2()
   * @generated
   */
  void setCi2(CommaItem value);

  /**
   * Returns the value of the '<em><b>Bbs4</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.aldor.editor.Binding_BalStatement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bbs4</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bbs4</em>' containment reference list.
   * @see com.euclideanspace.aldor.editor.EditorPackage#getFlow_BalStatement_Bbs4()
   * @model containment="true"
   * @generated
   */
  EList<Binding_BalStatement> getBbs4();

  /**
   * Returns the value of the '<em><b>Bbs5</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bbs5</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bbs5</em>' containment reference.
   * @see #setBbs5(Binding_BalStatement)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getFlow_BalStatement_Bbs5()
   * @model containment="true"
   * @generated
   */
  Binding_BalStatement getBbs5();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.Flow_BalStatement#getBbs5 <em>Bbs5</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bbs5</em>' containment reference.
   * @see #getBbs5()
   * @generated
   */
  void setBbs5(Binding_BalStatement value);

  /**
   * Returns the value of the '<em><b>Bbs2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bbs2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bbs2</em>' containment reference.
   * @see #setBbs2(Binding_AnyStatement)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getFlow_BalStatement_Bbs2()
   * @model containment="true"
   * @generated
   */
  Binding_AnyStatement getBbs2();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.Flow_BalStatement#getBbs2 <em>Bbs2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bbs2</em>' containment reference.
   * @see #getBbs2()
   * @generated
   */
  void setBbs2(Binding_AnyStatement value);

  /**
   * Returns the value of the '<em><b>Be</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Be</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Be</em>' containment reference.
   * @see #setBe(ButExpr)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getFlow_BalStatement_Be()
   * @model containment="true"
   * @generated
   */
  ButExpr getBe();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.Flow_BalStatement#getBe <em>Be</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Be</em>' containment reference.
   * @see #getBe()
   * @generated
   */
  void setBe(ButExpr value);

  /**
   * Returns the value of the '<em><b>Apb</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Apb</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Apb</em>' containment reference.
   * @see #setApb(AlwaysPart_BalStatement)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getFlow_BalStatement_Apb()
   * @model containment="true"
   * @generated
   */
  AlwaysPart_BalStatement getApb();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.Flow_BalStatement#getApb <em>Apb</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Apb</em>' containment reference.
   * @see #getApb()
   * @generated
   */
  void setApb(AlwaysPart_BalStatement value);

  /**
   * Returns the value of the '<em><b>Ca2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ca2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ca2</em>' containment reference.
   * @see #setCa2(Cases)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getFlow_BalStatement_Ca2()
   * @model containment="true"
   * @generated
   */
  Cases getCa2();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.Flow_BalStatement#getCa2 <em>Ca2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ca2</em>' containment reference.
   * @see #getCa2()
   * @generated
   */
  void setCa2(Cases value);

  /**
   * Returns the value of the '<em><b>Gb2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Gb2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Gb2</em>' containment reference.
   * @see #setGb2(GenBound)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getFlow_BalStatement_Gb2()
   * @model containment="true"
   * @generated
   */
  GenBound getGb2();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.Flow_BalStatement#getGb2 <em>Gb2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Gb2</em>' containment reference.
   * @see #getGb2()
   * @generated
   */
  void setGb2(GenBound value);

  /**
   * Returns the value of the '<em><b>N2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>N2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>N2</em>' containment reference.
   * @see #setN2(Name)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getFlow_BalStatement_N2()
   * @model containment="true"
   * @generated
   */
  Name getN2();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.Flow_BalStatement#getN2 <em>N2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>N2</em>' containment reference.
   * @see #getN2()
   * @generated
   */
  void setN2(Name value);

  /**
   * Returns the value of the '<em><b>I3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>I3</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>I3</em>' containment reference.
   * @see #setI3(Id)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getFlow_BalStatement_I3()
   * @model containment="true"
   * @generated
   */
  Id getI3();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.Flow_BalStatement#getI3 <em>I3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>I3</em>' containment reference.
   * @see #getI3()
   * @generated
   */
  void setI3(Id value);

} // Flow_BalStatement
