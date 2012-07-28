/**
 */
package com.euclideanspace.spad.editor;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.spad.editor.PackageDef#getName <em>Name</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.PackageDef#getShortname <em>Shortname</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.PackageDef#getLongname <em>Longname</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.PackageDef#getLongname2 <em>Longname2</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.PackageDef#getCp <em>Cp</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.PackageDef#getExportName <em>Export Name</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.PackageDef#getImplName <em>Impl Name</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.PackageDef#getW <em>W</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.PackageDef#getWh5 <em>Wh5</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.PackageDef#getAdd2 <em>Add2</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.spad.editor.EditorPackage#getPackageDef()
 * @model
 * @generated
 */
public interface PackageDef extends EObject
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
   * @see com.euclideanspace.spad.editor.EditorPackage#getPackageDef_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.PackageDef#getName <em>Name</em>}' attribute.
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
   * @see com.euclideanspace.spad.editor.EditorPackage#getPackageDef_Shortname()
   * @model
   * @generated
   */
  String getShortname();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.PackageDef#getShortname <em>Shortname</em>}' attribute.
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
   * @see com.euclideanspace.spad.editor.EditorPackage#getPackageDef_Longname()
   * @model
   * @generated
   */
  String getLongname();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.PackageDef#getLongname <em>Longname</em>}' attribute.
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
   * @see com.euclideanspace.spad.editor.EditorPackage#getPackageDef_Longname2()
   * @model
   * @generated
   */
  String getLongname2();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.PackageDef#getLongname2 <em>Longname2</em>}' attribute.
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
   * @see com.euclideanspace.spad.editor.EditorPackage#getPackageDef_Cp()
   * @model containment="true"
   * @generated
   */
  TypeParameterList getCp();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.PackageDef#getCp <em>Cp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cp</em>' containment reference.
   * @see #getCp()
   * @generated
   */
  void setCp(TypeParameterList value);

  /**
   * Returns the value of the '<em><b>Export Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Export Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Export Name</em>' attribute.
   * @see #setExportName(String)
   * @see com.euclideanspace.spad.editor.EditorPackage#getPackageDef_ExportName()
   * @model
   * @generated
   */
  String getExportName();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.PackageDef#getExportName <em>Export Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Export Name</em>' attribute.
   * @see #getExportName()
   * @generated
   */
  void setExportName(String value);

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
   * @see com.euclideanspace.spad.editor.EditorPackage#getPackageDef_ImplName()
   * @model
   * @generated
   */
  String getImplName();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.PackageDef#getImplName <em>Impl Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Impl Name</em>' attribute.
   * @see #getImplName()
   * @generated
   */
  void setImplName(String value);

  /**
   * Returns the value of the '<em><b>W</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>W</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>W</em>' containment reference.
   * @see #setW(WithPart)
   * @see com.euclideanspace.spad.editor.EditorPackage#getPackageDef_W()
   * @model containment="true"
   * @generated
   */
  WithPart getW();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.PackageDef#getW <em>W</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>W</em>' containment reference.
   * @see #getW()
   * @generated
   */
  void setW(WithPart value);

  /**
   * Returns the value of the '<em><b>Wh5</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Wh5</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Wh5</em>' containment reference.
   * @see #setWh5(WherePart)
   * @see com.euclideanspace.spad.editor.EditorPackage#getPackageDef_Wh5()
   * @model containment="true"
   * @generated
   */
  WherePart getWh5();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.PackageDef#getWh5 <em>Wh5</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Wh5</em>' containment reference.
   * @see #getWh5()
   * @generated
   */
  void setWh5(WherePart value);

  /**
   * Returns the value of the '<em><b>Add2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Add2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Add2</em>' containment reference.
   * @see #setAdd2(AddPart)
   * @see com.euclideanspace.spad.editor.EditorPackage#getPackageDef_Add2()
   * @model containment="true"
   * @generated
   */
  AddPart getAdd2();

  /**
   * Sets the value of the '{@link com.euclideanspace.spad.editor.PackageDef#getAdd2 <em>Add2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Add2</em>' containment reference.
   * @see #getAdd2()
   * @generated
   */
  void setAdd2(AddPart value);

} // PackageDef
