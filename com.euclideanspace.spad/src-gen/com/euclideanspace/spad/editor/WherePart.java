/**
 */
package com.euclideanspace.spad.editor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Where Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.spad.editor.WherePart#getName <em>Name</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.WherePart#getWhereAssig <em>Where Assig</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.WherePart#getLongname8 <em>Longname8</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.WherePart#getImp <em>Imp</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.WherePart#getW8 <em>W8</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.WherePart#getLongname9 <em>Longname9</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.WherePart#getAdd <em>Add</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.spad.editor.EditorPackage#getWherePart()
 * @model
 * @generated
 */
public interface WherePart extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.euclideanspace.spad.editor.EditorPackage#getWherePart_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.WherePart#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Where Assig</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.spad.editor.WhereAssignments}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Where Assig</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Where Assig</em>' containment reference list.
   * @see com.euclideanspace.spad.editor.EditorPackage#getWherePart_WhereAssig()
   * @model containment="true"
   * @generated
   */
  EList<WhereAssignments> getWhereAssig();

  /**
   * Returns the value of the '<em><b>Longname8</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Longname8</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Longname8</em>' attribute.
   * @see #setLongname8(String)
   * @see com.euclideanspace.spad.editor.EditorPackage#getWherePart_Longname8()
   * @model
   * @generated
   */
  String getLongname8();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.WherePart#getLongname8 <em>Longname8</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Longname8</em>' attribute.
   * @see #getLongname8()
   * @generated
   */
  void setLongname8(String value);

  /**
   * Returns the value of the '<em><b>Imp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imp</em>' containment reference.
   * @see #setImp(TypeExpression)
   * @see com.euclideanspace.spad.editor.EditorPackage#getWherePart_Imp()
   * @model containment="true"
   * @generated
   */
  TypeExpression getImp();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.WherePart#getImp <em>Imp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Imp</em>' containment reference.
   * @see #getImp()
   * @generated
   */
  void setImp(TypeExpression value);

  /**
   * Returns the value of the '<em><b>W8</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>W8</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>W8</em>' containment reference.
   * @see #setW8(WithPart)
   * @see com.euclideanspace.spad.editor.EditorPackage#getWherePart_W8()
   * @model containment="true"
   * @generated
   */
  WithPart getW8();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.WherePart#getW8 <em>W8</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>W8</em>' containment reference.
   * @see #getW8()
   * @generated
   */
  void setW8(WithPart value);

  /**
   * Returns the value of the '<em><b>Longname9</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Longname9</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Longname9</em>' attribute.
   * @see #setLongname9(String)
   * @see com.euclideanspace.spad.editor.EditorPackage#getWherePart_Longname9()
   * @model
   * @generated
   */
  String getLongname9();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.WherePart#getLongname9 <em>Longname9</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Longname9</em>' attribute.
   * @see #getLongname9()
   * @generated
   */
  void setLongname9(String value);

  /**
   * Returns the value of the '<em><b>Add</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Add</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Add</em>' containment reference.
   * @see #setAdd(AddPart)
   * @see com.euclideanspace.spad.editor.EditorPackage#getWherePart_Add()
   * @model containment="true"
   * @generated
   */
  AddPart getAdd();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.WherePart#getAdd <em>Add</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Add</em>' containment reference.
   * @see #getAdd()
   * @generated
   */
  void setAdd(AddPart value);

} // WherePart
