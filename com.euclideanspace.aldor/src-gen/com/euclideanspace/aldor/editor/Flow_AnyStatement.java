/**
 */
package com.euclideanspace.aldor.editor;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow Any Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.Flow_AnyStatement#getC <em>C</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.Flow_AnyStatement#getSt <em>St</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.Flow_AnyStatement#getBas2 <em>Bas2</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.Flow_AnyStatement#getCi <em>Ci</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.Flow_AnyStatement#getBbs <em>Bbs</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.Flow_AnyStatement#getBas <em>Bas</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.Flow_AnyStatement#getBe2 <em>Be2</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.Flow_AnyStatement#getApa <em>Apa</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.Flow_AnyStatement#getCa <em>Ca</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.Flow_AnyStatement#getGb <em>Gb</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.Flow_AnyStatement#getBas4 <em>Bas4</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.Flow_AnyStatement#getN <em>N</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.Flow_AnyStatement#getI2 <em>I2</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.aldor.editor.EditorPackage#getFlow_AnyStatement()
 * @model
 * @generated
 */
public interface Flow_AnyStatement extends AnyStatement
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
   * @see #setC(Collection)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getFlow_AnyStatement_C()
   * @model containment="true"
   * @generated
   */
  Collection getC();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.Flow_AnyStatement#getC <em>C</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>C</em>' containment reference.
   * @see #getC()
   * @generated
   */
  void setC(Collection value);

  /**
   * Returns the value of the '<em><b>St</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>St</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>St</em>' attribute.
   * @see #setSt(String)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getFlow_AnyStatement_St()
   * @model
   * @generated
   */
  String getSt();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.Flow_AnyStatement#getSt <em>St</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>St</em>' attribute.
   * @see #getSt()
   * @generated
   */
  void setSt(String value);

  /**
   * Returns the value of the '<em><b>Bas2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bas2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bas2</em>' containment reference.
   * @see #setBas2(Binding_AnyStatement)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getFlow_AnyStatement_Bas2()
   * @model containment="true"
   * @generated
   */
  Binding_AnyStatement getBas2();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.Flow_AnyStatement#getBas2 <em>Bas2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bas2</em>' containment reference.
   * @see #getBas2()
   * @generated
   */
  void setBas2(Binding_AnyStatement value);

  /**
   * Returns the value of the '<em><b>Ci</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ci</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ci</em>' containment reference.
   * @see #setCi(CommaItem)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getFlow_AnyStatement_Ci()
   * @model containment="true"
   * @generated
   */
  CommaItem getCi();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.Flow_AnyStatement#getCi <em>Ci</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ci</em>' containment reference.
   * @see #getCi()
   * @generated
   */
  void setCi(CommaItem value);

  /**
   * Returns the value of the '<em><b>Bbs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bbs</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bbs</em>' containment reference.
   * @see #setBbs(Binding_BalStatement)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getFlow_AnyStatement_Bbs()
   * @model containment="true"
   * @generated
   */
  Binding_BalStatement getBbs();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.Flow_AnyStatement#getBbs <em>Bbs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bbs</em>' containment reference.
   * @see #getBbs()
   * @generated
   */
  void setBbs(Binding_BalStatement value);

  /**
   * Returns the value of the '<em><b>Bas</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bas</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bas</em>' containment reference.
   * @see #setBas(Binding_AnyStatement)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getFlow_AnyStatement_Bas()
   * @model containment="true"
   * @generated
   */
  Binding_AnyStatement getBas();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.Flow_AnyStatement#getBas <em>Bas</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bas</em>' containment reference.
   * @see #getBas()
   * @generated
   */
  void setBas(Binding_AnyStatement value);

  /**
   * Returns the value of the '<em><b>Be2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Be2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Be2</em>' containment reference.
   * @see #setBe2(ButExpr)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getFlow_AnyStatement_Be2()
   * @model containment="true"
   * @generated
   */
  ButExpr getBe2();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.Flow_AnyStatement#getBe2 <em>Be2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Be2</em>' containment reference.
   * @see #getBe2()
   * @generated
   */
  void setBe2(ButExpr value);

  /**
   * Returns the value of the '<em><b>Apa</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Apa</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Apa</em>' containment reference.
   * @see #setApa(AlwaysPart_AnyStatement)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getFlow_AnyStatement_Apa()
   * @model containment="true"
   * @generated
   */
  AlwaysPart_AnyStatement getApa();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.Flow_AnyStatement#getApa <em>Apa</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Apa</em>' containment reference.
   * @see #getApa()
   * @generated
   */
  void setApa(AlwaysPart_AnyStatement value);

  /**
   * Returns the value of the '<em><b>Ca</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ca</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ca</em>' containment reference.
   * @see #setCa(Cases)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getFlow_AnyStatement_Ca()
   * @model containment="true"
   * @generated
   */
  Cases getCa();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.Flow_AnyStatement#getCa <em>Ca</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ca</em>' containment reference.
   * @see #getCa()
   * @generated
   */
  void setCa(Cases value);

  /**
   * Returns the value of the '<em><b>Gb</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Gb</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Gb</em>' containment reference.
   * @see #setGb(GenBound)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getFlow_AnyStatement_Gb()
   * @model containment="true"
   * @generated
   */
  GenBound getGb();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.Flow_AnyStatement#getGb <em>Gb</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Gb</em>' containment reference.
   * @see #getGb()
   * @generated
   */
  void setGb(GenBound value);

  /**
   * Returns the value of the '<em><b>Bas4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bas4</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bas4</em>' containment reference.
   * @see #setBas4(Binding_AnyStatement)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getFlow_AnyStatement_Bas4()
   * @model containment="true"
   * @generated
   */
  Binding_AnyStatement getBas4();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.Flow_AnyStatement#getBas4 <em>Bas4</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bas4</em>' containment reference.
   * @see #getBas4()
   * @generated
   */
  void setBas4(Binding_AnyStatement value);

  /**
   * Returns the value of the '<em><b>N</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>N</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>N</em>' containment reference.
   * @see #setN(Name)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getFlow_AnyStatement_N()
   * @model containment="true"
   * @generated
   */
  Name getN();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.Flow_AnyStatement#getN <em>N</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>N</em>' containment reference.
   * @see #getN()
   * @generated
   */
  void setN(Name value);

  /**
   * Returns the value of the '<em><b>I2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>I2</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>I2</em>' attribute.
   * @see #setI2(String)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getFlow_AnyStatement_I2()
   * @model
   * @generated
   */
  String getI2();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.Flow_AnyStatement#getI2 <em>I2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>I2</em>' attribute.
   * @see #getI2()
   * @generated
   */
  void setI2(String value);

} // Flow_AnyStatement
