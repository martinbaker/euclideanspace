/**
 */
package com.euclideanspace.aldor.editor;

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
 *   <li>{@link com.euclideanspace.aldor.editor.WherePart#getName <em>Name</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.WherePart#getWhereAssig <em>Where Assig</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.WherePart#getLongname8 <em>Longname8</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.WherePart#getImp <em>Imp</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.WherePart#getW8 <em>W8</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.WherePart#getLongname9 <em>Longname9</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.WherePart#getFs <em>Fs</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.WherePart#getPar2 <em>Par2</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.WherePart#getPar3 <em>Par3</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.WherePart#getF2 <em>F2</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.WherePart#getAdd <em>Add</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.aldor.editor.EditorPackage#getWherePart()
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
   * @see com.euclideanspace.aldor.editor.EditorPackage#getWherePart_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.WherePart#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Where Assig</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.aldor.editor.WhereAssignments}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Where Assig</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Where Assig</em>' containment reference list.
   * @see com.euclideanspace.aldor.editor.EditorPackage#getWherePart_WhereAssig()
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
   * @see com.euclideanspace.aldor.editor.EditorPackage#getWherePart_Longname8()
   * @model
   * @generated
   */
  String getLongname8();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.WherePart#getLongname8 <em>Longname8</em>}' attribute.
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
   * @see com.euclideanspace.aldor.editor.EditorPackage#getWherePart_Imp()
   * @model containment="true"
   * @generated
   */
  TypeExpression getImp();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.WherePart#getImp <em>Imp</em>}' containment reference.
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
   * @see com.euclideanspace.aldor.editor.EditorPackage#getWherePart_W8()
   * @model containment="true"
   * @generated
   */
  WithPart getW8();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.WherePart#getW8 <em>W8</em>}' containment reference.
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
   * @see com.euclideanspace.aldor.editor.EditorPackage#getWherePart_Longname9()
   * @model
   * @generated
   */
  String getLongname9();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.WherePart#getLongname9 <em>Longname9</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Longname9</em>' attribute.
   * @see #getLongname9()
   * @generated
   */
  void setLongname9(String value);

  /**
   * Returns the value of the '<em><b>Fs</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fs</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fs</em>' attribute.
   * @see #setFs(String)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getWherePart_Fs()
   * @model
   * @generated
   */
  String getFs();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.WherePart#getFs <em>Fs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fs</em>' attribute.
   * @see #getFs()
   * @generated
   */
  void setFs(String value);

  /**
   * Returns the value of the '<em><b>Par2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Par2</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Par2</em>' attribute.
   * @see #setPar2(String)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getWherePart_Par2()
   * @model
   * @generated
   */
  String getPar2();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.WherePart#getPar2 <em>Par2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Par2</em>' attribute.
   * @see #getPar2()
   * @generated
   */
  void setPar2(String value);

  /**
   * Returns the value of the '<em><b>Par3</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Par3</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Par3</em>' attribute list.
   * @see com.euclideanspace.aldor.editor.EditorPackage#getWherePart_Par3()
   * @model unique="false"
   * @generated
   */
  EList<String> getPar3();

  /**
   * Returns the value of the '<em><b>F2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>F2</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>F2</em>' attribute.
   * @see #setF2(String)
   * @see com.euclideanspace.aldor.editor.EditorPackage#getWherePart_F2()
   * @model
   * @generated
   */
  String getF2();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.WherePart#getF2 <em>F2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>F2</em>' attribute.
   * @see #getF2()
   * @generated
   */
  void setF2(String value);

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
   * @see com.euclideanspace.aldor.editor.EditorPackage#getWherePart_Add()
   * @model containment="true"
   * @generated
   */
  AddPart getAdd();

  /**
   * Sets the value of the '{@link com.euclideanspace.aldor.editor.WherePart#getAdd <em>Add</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Add</em>' containment reference.
   * @see #getAdd()
   * @generated
   */
  void setAdd(AddPart value);

} // WherePart
