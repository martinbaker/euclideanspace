/**
 */
package com.euclideanspace.aldor.editor;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Id</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.Id#getAB_Id <em>AB Id</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.Id#getOp <em>Op</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.aldor.editor.EditorPackage#getId()
 * @model
 * @generated
 */
public interface Id extends Flow_AnyStatement, Flow_BalStatement, Name
{
  /**
   * Returns the value of the '<em><b>AB Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>AB Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>AB Id</em>' attribute.
   * @see #setAB_Id(String)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getId_AB_Id()
   * @model
   * @generated
   */
  String getAB_Id();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.Id#getAB_Id <em>AB Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>AB Id</em>' attribute.
   * @see #getAB_Id()
   * @generated
   */
  void setAB_Id(String value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see #setOp(String)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getId_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.Id#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

} // Id
