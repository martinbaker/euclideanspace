/**
 */
package com.euclideanspace.spad.editor;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.spad.editor.MapDefinition#getFnSig <em>Fn Sig</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.MapDefinition#getPar4 <em>Par4</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.MapDefinition#getPar5 <em>Par5</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.spad.editor.EditorPackage#getMapDefinition()
 * @model
 * @generated
 */
public interface MapDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Fn Sig</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fn Sig</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fn Sig</em>' containment reference.
   * @see #setFnSig(FunctionSignature)
   * @see com.euclideanspace.spad.editor.EditorPackage#getMapDefinition_FnSig()
   * @model containment="true"
   * @generated
   */
  FunctionSignature getFnSig();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.MapDefinition#getFnSig <em>Fn Sig</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fn Sig</em>' containment reference.
   * @see #getFnSig()
   * @generated
   */
  void setFnSig(FunctionSignature value);

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
   * @see com.euclideanspace.spad.editor.EditorPackage#getMapDefinition_Par4()
   * @model containment="true"
   * @generated
   */
  TypeExpression getPar4();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.MapDefinition#getPar4 <em>Par4</em>}' containment reference.
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
   * @see com.euclideanspace.spad.editor.EditorPackage#getMapDefinition_Par5()
   * @model containment="true"
   * @generated
   */
  Statement getPar5();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.MapDefinition#getPar5 <em>Par5</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Par5</em>' containment reference.
   * @see #getPar5()
   * @generated
   */
  void setPar5(Statement value);

} // MapDefinition
