/**
 */
package com.euclideanspace.spad.editor;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Category Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.spad.editor.CategoryDef#getName <em>Name</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.CategoryDef#getShortname <em>Shortname</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.CategoryDef#getLongname <em>Longname</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.CategoryDef#getLongname2 <em>Longname2</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.CategoryDef#getCp <em>Cp</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.CategoryDef#getImplName <em>Impl Name</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.CategoryDef#getWh <em>Wh</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.spad.editor.EditorPackage#getCategoryDef()
 * @model
 * @generated
 */
public interface CategoryDef extends EObject
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
   * @see com.euclideanspace.spad.editor.EditorPackage#getCategoryDef_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.CategoryDef#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Shortname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Shortname</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Shortname</em>' attribute.
   * @see #setShortname(String)
   * @see com.euclideanspace.spad.editor.EditorPackage#getCategoryDef_Shortname()
   * @model
   * @generated
   */
  String getShortname();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.CategoryDef#getShortname <em>Shortname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Shortname</em>' attribute.
   * @see #getShortname()
   * @generated
   */
  void setShortname(String value);

  /**
   * Returns the value of the '<em><b>Longname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Longname</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Longname</em>' attribute.
   * @see #setLongname(String)
   * @see com.euclideanspace.spad.editor.EditorPackage#getCategoryDef_Longname()
   * @model
   * @generated
   */
  String getLongname();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.CategoryDef#getLongname <em>Longname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Longname</em>' attribute.
   * @see #getLongname()
   * @generated
   */
  void setLongname(String value);

  /**
   * Returns the value of the '<em><b>Longname2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Longname2</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Longname2</em>' attribute.
   * @see #setLongname2(String)
   * @see com.euclideanspace.spad.editor.EditorPackage#getCategoryDef_Longname2()
   * @model
   * @generated
   */
  String getLongname2();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.CategoryDef#getLongname2 <em>Longname2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Longname2</em>' attribute.
   * @see #getLongname2()
   * @generated
   */
  void setLongname2(String value);

  /**
   * Returns the value of the '<em><b>Cp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cp</em>' containment reference.
   * @see #setCp(TypeParameterList)
   * @see com.euclideanspace.spad.editor.EditorPackage#getCategoryDef_Cp()
   * @model containment="true"
   * @generated
   */
  TypeParameterList getCp();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.CategoryDef#getCp <em>Cp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cp</em>' containment reference.
   * @see #getCp()
   * @generated
   */
  void setCp(TypeParameterList value);

  /**
   * Returns the value of the '<em><b>Impl Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Impl Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Impl Name</em>' attribute.
   * @see #setImplName(String)
   * @see com.euclideanspace.spad.editor.EditorPackage#getCategoryDef_ImplName()
   * @model
   * @generated
   */
  String getImplName();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.CategoryDef#getImplName <em>Impl Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Impl Name</em>' attribute.
   * @see #getImplName()
   * @generated
   */
  void setImplName(String value);

  /**
   * Returns the value of the '<em><b>Wh</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Wh</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Wh</em>' containment reference.
   * @see #setWh(WherePart)
   * @see com.euclideanspace.spad.editor.EditorPackage#getCategoryDef_Wh()
   * @model containment="true"
   * @generated
   */
  WherePart getWh();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.CategoryDef#getWh <em>Wh</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Wh</em>' containment reference.
   * @see #getWh()
   * @generated
   */
  void setWh(WherePart value);

} // CategoryDef
