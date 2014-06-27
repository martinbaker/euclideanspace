/**
 */
package com.euclideanspace.aldor.editor;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.FunctionDefinition#getPar3 <em>Par3</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.FunctionDefinition#getPar4 <em>Par4</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.FunctionDefinition#getPar5 <em>Par5</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.FunctionDefinition#getFnNam <em>Fn Nam</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.aldor.editor.EditorPackage#getFunctionDefinition()
 * @model
 * @generated
 */
public interface FunctionDefinition extends AddStatements
{
  /**
   * Returns the value of the '<em><b>Par3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Par3</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Par3</em>' containment reference.
   * @see #setPar3(FunctionSignature)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getFunctionDefinition_Par3()
   * @model containment="true"
   * @generated
   */
  FunctionSignature getPar3();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.FunctionDefinition#getPar3 <em>Par3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Par3</em>' containment reference.
   * @see #getPar3()
   * @generated
   */
  void setPar3(FunctionSignature value);

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
   * @see com.euclideanspace.aldor.editor.EditorPackage#getFunctionDefinition_Par4()
   * @model containment="true"
   * @generated
   */
  TypeExpression getPar4();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.FunctionDefinition#getPar4 <em>Par4</em>}' containment reference.
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
   * @see com.euclideanspace.aldor.editor.EditorPackage#getFunctionDefinition_Par5()
   * @model containment="true"
   * @generated
   */
  Statement getPar5();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.FunctionDefinition#getPar5 <em>Par5</em>}' containment reference.
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
   * @see com.euclideanspace.aldor.editor.EditorPackage#getFunctionDefinition_FnNam()
   * @model
   * @generated
   */
  String getFnNam();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.FunctionDefinition#getFnNam <em>Fn Nam</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fn Nam</em>' attribute.
   * @see #getFnNam()
   * @generated
   */
  void setFnNam(String value);

} // FunctionDefinition
