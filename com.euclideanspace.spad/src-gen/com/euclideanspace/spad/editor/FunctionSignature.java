/**
 */
package com.euclideanspace.spad.editor;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Signature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.spad.editor.FunctionSignature#getPar4 <em>Par4</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.FunctionSignature#getPar5 <em>Par5</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.FunctionSignature#getFnNam <em>Fn Nam</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.FunctionSignature#getPar2 <em>Par2</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.FunctionSignature#getPar3 <em>Par3</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.FunctionSignature#getT4 <em>T4</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.FunctionSignature#getB1 <em>B1</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.FunctionSignature#getT5 <em>T5</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.FunctionSignature#getB2 <em>B2</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.FunctionSignature#getT6 <em>T6</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.spad.editor.EditorPackage#getFunctionSignature()
 * @model
 * @generated
 */
public interface FunctionSignature extends FunctionDefinition
{
  /**
   * Returns the value of the '<em><b>Par4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Par4</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Par4</em>' containment reference.
   * @see #setPar4(TypeExpression)
   * @see com.euclideanspace.spad.editor.EditorPackage#getFunctionSignature_Par4()
   * @model containment="true"
   * @generated
   */
  TypeExpression getPar4();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.FunctionSignature#getPar4 <em>Par4</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Par4</em>' containment reference.
   * @see #getPar4()
   * @generated
   */
  void setPar4(TypeExpression value);

  /**
   * Returns the value of the '<em><b>Par5</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Par5</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Par5</em>' containment reference.
   * @see #setPar5(Statement)
   * @see com.euclideanspace.spad.editor.EditorPackage#getFunctionSignature_Par5()
   * @model containment="true"
   * @generated
   */
  Statement getPar5();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.FunctionSignature#getPar5 <em>Par5</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Par5</em>' containment reference.
   * @see #getPar5()
   * @generated
   */
  void setPar5(Statement value);

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
   * @see #setPar2(VariableDeclaration)
   * @see com.euclideanspace.spad.editor.EditorPackage#getFunctionSignature_Par2()
   * @model containment="true"
   * @generated
   */
  VariableDeclaration getPar2();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.FunctionSignature#getPar2 <em>Par2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Par2</em>' containment reference.
   * @see #getPar2()
   * @generated
   */
  void setPar2(VariableDeclaration value);

  /**
   * Returns the value of the '<em><b>Par3</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.spad.editor.VariableDeclaration}.
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
  EList<VariableDeclaration> getPar3();

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

} // FunctionSignature
