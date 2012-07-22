/**
 */
package com.euclideanspace.spad.editor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Signature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.spad.editor.FunctionSignature#getFnNam <em>Fn Nam</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.FunctionSignature#getPar2 <em>Par2</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.FunctionSignature#getPar3 <em>Par3</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.FunctionSignature#getPar <em>Par</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.FunctionSignature#getT4 <em>T4</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.FunctionSignature#getB1 <em>B1</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.FunctionSignature#getT5 <em>T5</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.FunctionSignature#getB3 <em>B3</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.FunctionSignature#getB2 <em>B2</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.FunctionSignature#getT6 <em>T6</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.FunctionSignature#getB4 <em>B4</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.FunctionSignature#getT7 <em>T7</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.FunctionSignature#getB5 <em>B5</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.FunctionSignature#getT8 <em>T8</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.spad.editor.EditorPackage#getFunctionSignature()
 * @model
 * @generated
 */
public interface FunctionSignature extends EObject
{
  /**
   * Returns the value of the '<em><b>Fn Nam</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fn Nam</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fn Nam</em>' attribute.
   * @see #setFnNam(String)
   * @see com.euclideanspace.spad.editor.EditorPackage#getFunctionSignature_FnNam()
   * @model
   * @generated
   */
  String getFnNam();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.FunctionSignature#getFnNam <em>Fn Nam</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fn Nam</em>' attribute.
   * @see #getFnNam()
   * @generated
   */
  void setFnNam(String value);

  /**
   * Returns the value of the '<em><b>Par2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Par2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Par2</em>' containment reference.
   * @see #setPar2(VariableTyped)
   * @see com.euclideanspace.spad.editor.EditorPackage#getFunctionSignature_Par2()
   * @model containment="true"
   * @generated
   */
  VariableTyped getPar2();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.FunctionSignature#getPar2 <em>Par2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Par2</em>' containment reference.
   * @see #getPar2()
   * @generated
   */
  void setPar2(VariableTyped value);

  /**
   * Returns the value of the '<em><b>Par3</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.spad.editor.VariableTyped}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Par3</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Par3</em>' containment reference list.
   * @see com.euclideanspace.spad.editor.EditorPackage#getFunctionSignature_Par3()
   * @model containment="true"
   * @generated
   */
  EList<VariableTyped> getPar3();

  /**
   * Returns the value of the '<em><b>Par</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Par</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Par</em>' attribute.
   * @see #setPar(String)
   * @see com.euclideanspace.spad.editor.EditorPackage#getFunctionSignature_Par()
   * @model
   * @generated
   */
  String getPar();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.FunctionSignature#getPar <em>Par</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Par</em>' attribute.
   * @see #getPar()
   * @generated
   */
  void setPar(String value);

  /**
   * Returns the value of the '<em><b>T4</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T4</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T4</em>' attribute.
   * @see #setT4(String)
   * @see com.euclideanspace.spad.editor.EditorPackage#getFunctionSignature_T4()
   * @model
   * @generated
   */
  String getT4();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.FunctionSignature#getT4 <em>T4</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T4</em>' attribute.
   * @see #getT4()
   * @generated
   */
  void setT4(String value);

  /**
   * Returns the value of the '<em><b>B1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>B1</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>B1</em>' attribute.
   * @see #setB1(String)
   * @see com.euclideanspace.spad.editor.EditorPackage#getFunctionSignature_B1()
   * @model
   * @generated
   */
  String getB1();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.FunctionSignature#getB1 <em>B1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>B1</em>' attribute.
   * @see #getB1()
   * @generated
   */
  void setB1(String value);

  /**
   * Returns the value of the '<em><b>T5</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T5</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T5</em>' attribute.
   * @see #setT5(String)
   * @see com.euclideanspace.spad.editor.EditorPackage#getFunctionSignature_T5()
   * @model
   * @generated
   */
  String getT5();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.FunctionSignature#getT5 <em>T5</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T5</em>' attribute.
   * @see #getT5()
   * @generated
   */
  void setT5(String value);

  /**
   * Returns the value of the '<em><b>B3</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>B3</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>B3</em>' attribute.
   * @see #setB3(int)
   * @see com.euclideanspace.spad.editor.EditorPackage#getFunctionSignature_B3()
   * @model
   * @generated
   */
  int getB3();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.FunctionSignature#getB3 <em>B3</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>B3</em>' attribute.
   * @see #getB3()
   * @generated
   */
  void setB3(int value);

  /**
   * Returns the value of the '<em><b>B2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>B2</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>B2</em>' attribute.
   * @see #setB2(String)
   * @see com.euclideanspace.spad.editor.EditorPackage#getFunctionSignature_B2()
   * @model
   * @generated
   */
  String getB2();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.FunctionSignature#getB2 <em>B2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>B2</em>' attribute.
   * @see #getB2()
   * @generated
   */
  void setB2(String value);

  /**
   * Returns the value of the '<em><b>T6</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T6</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T6</em>' attribute.
   * @see #setT6(String)
   * @see com.euclideanspace.spad.editor.EditorPackage#getFunctionSignature_T6()
   * @model
   * @generated
   */
  String getT6();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.FunctionSignature#getT6 <em>T6</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T6</em>' attribute.
   * @see #getT6()
   * @generated
   */
  void setT6(String value);

  /**
   * Returns the value of the '<em><b>B4</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>B4</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>B4</em>' attribute.
   * @see #setB4(String)
   * @see com.euclideanspace.spad.editor.EditorPackage#getFunctionSignature_B4()
   * @model
   * @generated
   */
  String getB4();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.FunctionSignature#getB4 <em>B4</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>B4</em>' attribute.
   * @see #getB4()
   * @generated
   */
  void setB4(String value);

  /**
   * Returns the value of the '<em><b>T7</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T7</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T7</em>' attribute.
   * @see #setT7(String)
   * @see com.euclideanspace.spad.editor.EditorPackage#getFunctionSignature_T7()
   * @model
   * @generated
   */
  String getT7();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.FunctionSignature#getT7 <em>T7</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T7</em>' attribute.
   * @see #getT7()
   * @generated
   */
  void setT7(String value);

  /**
   * Returns the value of the '<em><b>B5</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>B5</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>B5</em>' attribute.
   * @see #setB5(String)
   * @see com.euclideanspace.spad.editor.EditorPackage#getFunctionSignature_B5()
   * @model
   * @generated
   */
  String getB5();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.FunctionSignature#getB5 <em>B5</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>B5</em>' attribute.
   * @see #getB5()
   * @generated
   */
  void setB5(String value);

  /**
   * Returns the value of the '<em><b>T8</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T8</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T8</em>' attribute.
   * @see #setT8(String)
   * @see com.euclideanspace.spad.editor.EditorPackage#getFunctionSignature_T8()
   * @model
   * @generated
   */
  String getT8();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.FunctionSignature#getT8 <em>T8</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T8</em>' attribute.
   * @see #getT8()
   * @generated
   */
  void setT8(String value);

} // FunctionSignature
