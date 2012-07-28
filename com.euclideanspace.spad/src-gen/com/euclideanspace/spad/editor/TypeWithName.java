/**
 */
package com.euclideanspace.spad.editor;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type With Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.spad.editor.TypeWithName#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.TypeWithName#getVarNameSt <em>Var Name St</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.TypeWithName#getVarName2 <em>Var Name2</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.TypeWithName#getTyp <em>Typ</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.spad.editor.EditorPackage#getTypeWithName()
 * @model
 * @generated
 */
public interface TypeWithName extends EObject
{
  /**
   * Returns the value of the '<em><b>Var Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var Name</em>' attribute.
   * @see #setVarName(String)
   * @see com.euclideanspace.spad.editor.EditorPackage#getTypeWithName_VarName()
   * @model
   * @generated
   */
  String getVarName();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.TypeWithName#getVarName <em>Var Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var Name</em>' attribute.
   * @see #getVarName()
   * @generated
   */
  void setVarName(String value);

  /**
   * Returns the value of the '<em><b>Var Name St</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var Name St</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var Name St</em>' attribute.
   * @see #setVarNameSt(String)
   * @see com.euclideanspace.spad.editor.EditorPackage#getTypeWithName_VarNameSt()
   * @model
   * @generated
   */
  String getVarNameSt();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.TypeWithName#getVarNameSt <em>Var Name St</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var Name St</em>' attribute.
   * @see #getVarNameSt()
   * @generated
   */
  void setVarNameSt(String value);

  /**
   * Returns the value of the '<em><b>Var Name2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var Name2</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var Name2</em>' attribute.
   * @see #setVarName2(String)
   * @see com.euclideanspace.spad.editor.EditorPackage#getTypeWithName_VarName2()
   * @model
   * @generated
   */
  String getVarName2();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.TypeWithName#getVarName2 <em>Var Name2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var Name2</em>' attribute.
   * @see #getVarName2()
   * @generated
   */
  void setVarName2(String value);

  /**
   * Returns the value of the '<em><b>Typ</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Typ</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Typ</em>' containment reference.
   * @see #setTyp(TypeExpression)
   * @see com.euclideanspace.spad.editor.EditorPackage#getTypeWithName_Typ()
   * @model containment="true"
   * @generated
   */
  TypeExpression getTyp();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.TypeWithName#getTyp <em>Typ</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Typ</em>' containment reference.
   * @see #getTyp()
   * @generated
   */
  void setTyp(TypeExpression value);

} // TypeWithName
