/**
 */
package com.euclideanspace.spad.editor.impl;

import com.euclideanspace.spad.editor.DomainDef;
import com.euclideanspace.spad.editor.EditorPackage;
import com.euclideanspace.spad.editor.TypeParameterList;
import com.euclideanspace.spad.editor.WherePart;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.spad.editor.impl.DomainDefImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.DomainDefImpl#getShortname5 <em>Shortname5</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.DomainDefImpl#getLongname5 <em>Longname5</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.DomainDefImpl#getLongname6 <em>Longname6</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.DomainDefImpl#getCp5 <em>Cp5</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.DomainDefImpl#getExportName <em>Export Name</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.DomainDefImpl#getImplName5 <em>Impl Name5</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.DomainDefImpl#getWh5 <em>Wh5</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DomainDefImpl extends MinimalEObjectImpl.Container implements DomainDef
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getShortname5() <em>Shortname5</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getShortname5()
   * @generated
   * @ordered
   */
  protected static final String SHORTNAME5_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getShortname5() <em>Shortname5</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getShortname5()
   * @generated
   * @ordered
   */
  protected String shortname5 = SHORTNAME5_EDEFAULT;

  /**
   * The default value of the '{@link #getLongname5() <em>Longname5</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLongname5()
   * @generated
   * @ordered
   */
  protected static final String LONGNAME5_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLongname5() <em>Longname5</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLongname5()
   * @generated
   * @ordered
   */
  protected String longname5 = LONGNAME5_EDEFAULT;

  /**
   * The default value of the '{@link #getLongname6() <em>Longname6</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLongname6()
   * @generated
   * @ordered
   */
  protected static final String LONGNAME6_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLongname6() <em>Longname6</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLongname6()
   * @generated
   * @ordered
   */
  protected String longname6 = LONGNAME6_EDEFAULT;

  /**
   * The cached value of the '{@link #getCp5() <em>Cp5</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCp5()
   * @generated
   * @ordered
   */
  protected TypeParameterList cp5;

  /**
   * The default value of the '{@link #getExportName() <em>Export Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExportName()
   * @generated
   * @ordered
   */
  protected static final String EXPORT_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExportName() <em>Export Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExportName()
   * @generated
   * @ordered
   */
  protected String exportName = EXPORT_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getImplName5() <em>Impl Name5</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImplName5()
   * @generated
   * @ordered
   */
  protected static final String IMPL_NAME5_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getImplName5() <em>Impl Name5</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImplName5()
   * @generated
   * @ordered
   */
  protected String implName5 = IMPL_NAME5_EDEFAULT;

  /**
   * The cached value of the '{@link #getWh5() <em>Wh5</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWh5()
   * @generated
   * @ordered
   */
  protected WherePart wh5;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DomainDefImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return EditorPackage.Literals.DOMAIN_DEF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.DOMAIN_DEF__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getShortname5()
  {
    return shortname5;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setShortname5(String newShortname5)
  {
    String oldShortname5 = shortname5;
    shortname5 = newShortname5;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.DOMAIN_DEF__SHORTNAME5, oldShortname5, shortname5));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLongname5()
  {
    return longname5;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLongname5(String newLongname5)
  {
    String oldLongname5 = longname5;
    longname5 = newLongname5;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.DOMAIN_DEF__LONGNAME5, oldLongname5, longname5));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLongname6()
  {
    return longname6;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLongname6(String newLongname6)
  {
    String oldLongname6 = longname6;
    longname6 = newLongname6;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.DOMAIN_DEF__LONGNAME6, oldLongname6, longname6));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeParameterList getCp5()
  {
    return cp5;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCp5(TypeParameterList newCp5, NotificationChain msgs)
  {
    TypeParameterList oldCp5 = cp5;
    cp5 = newCp5;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.DOMAIN_DEF__CP5, oldCp5, newCp5);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCp5(TypeParameterList newCp5)
  {
    if (newCp5 != cp5)
    {
      NotificationChain msgs = null;
      if (cp5 != null)
        msgs = ((InternalEObject)cp5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.DOMAIN_DEF__CP5, null, msgs);
      if (newCp5 != null)
        msgs = ((InternalEObject)newCp5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.DOMAIN_DEF__CP5, null, msgs);
      msgs = basicSetCp5(newCp5, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.DOMAIN_DEF__CP5, newCp5, newCp5));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getExportName()
  {
    return exportName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExportName(String newExportName)
  {
    String oldExportName = exportName;
    exportName = newExportName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.DOMAIN_DEF__EXPORT_NAME, oldExportName, exportName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getImplName5()
  {
    return implName5;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImplName5(String newImplName5)
  {
    String oldImplName5 = implName5;
    implName5 = newImplName5;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.DOMAIN_DEF__IMPL_NAME5, oldImplName5, implName5));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WherePart getWh5()
  {
    return wh5;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWh5(WherePart newWh5, NotificationChain msgs)
  {
    WherePart oldWh5 = wh5;
    wh5 = newWh5;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.DOMAIN_DEF__WH5, oldWh5, newWh5);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWh5(WherePart newWh5)
  {
    if (newWh5 != wh5)
    {
      NotificationChain msgs = null;
      if (wh5 != null)
        msgs = ((InternalEObject)wh5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.DOMAIN_DEF__WH5, null, msgs);
      if (newWh5 != null)
        msgs = ((InternalEObject)newWh5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.DOMAIN_DEF__WH5, null, msgs);
      msgs = basicSetWh5(newWh5, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.DOMAIN_DEF__WH5, newWh5, newWh5));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case EditorPackage.DOMAIN_DEF__CP5:
        return basicSetCp5(null, msgs);
      case EditorPackage.DOMAIN_DEF__WH5:
        return basicSetWh5(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case EditorPackage.DOMAIN_DEF__NAME:
        return getName();
      case EditorPackage.DOMAIN_DEF__SHORTNAME5:
        return getShortname5();
      case EditorPackage.DOMAIN_DEF__LONGNAME5:
        return getLongname5();
      case EditorPackage.DOMAIN_DEF__LONGNAME6:
        return getLongname6();
      case EditorPackage.DOMAIN_DEF__CP5:
        return getCp5();
      case EditorPackage.DOMAIN_DEF__EXPORT_NAME:
        return getExportName();
      case EditorPackage.DOMAIN_DEF__IMPL_NAME5:
        return getImplName5();
      case EditorPackage.DOMAIN_DEF__WH5:
        return getWh5();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EditorPackage.DOMAIN_DEF__NAME:
        setName((String)newValue);
        return;
      case EditorPackage.DOMAIN_DEF__SHORTNAME5:
        setShortname5((String)newValue);
        return;
      case EditorPackage.DOMAIN_DEF__LONGNAME5:
        setLongname5((String)newValue);
        return;
      case EditorPackage.DOMAIN_DEF__LONGNAME6:
        setLongname6((String)newValue);
        return;
      case EditorPackage.DOMAIN_DEF__CP5:
        setCp5((TypeParameterList)newValue);
        return;
      case EditorPackage.DOMAIN_DEF__EXPORT_NAME:
        setExportName((String)newValue);
        return;
      case EditorPackage.DOMAIN_DEF__IMPL_NAME5:
        setImplName5((String)newValue);
        return;
      case EditorPackage.DOMAIN_DEF__WH5:
        setWh5((WherePart)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case EditorPackage.DOMAIN_DEF__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EditorPackage.DOMAIN_DEF__SHORTNAME5:
        setShortname5(SHORTNAME5_EDEFAULT);
        return;
      case EditorPackage.DOMAIN_DEF__LONGNAME5:
        setLongname5(LONGNAME5_EDEFAULT);
        return;
      case EditorPackage.DOMAIN_DEF__LONGNAME6:
        setLongname6(LONGNAME6_EDEFAULT);
        return;
      case EditorPackage.DOMAIN_DEF__CP5:
        setCp5((TypeParameterList)null);
        return;
      case EditorPackage.DOMAIN_DEF__EXPORT_NAME:
        setExportName(EXPORT_NAME_EDEFAULT);
        return;
      case EditorPackage.DOMAIN_DEF__IMPL_NAME5:
        setImplName5(IMPL_NAME5_EDEFAULT);
        return;
      case EditorPackage.DOMAIN_DEF__WH5:
        setWh5((WherePart)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case EditorPackage.DOMAIN_DEF__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EditorPackage.DOMAIN_DEF__SHORTNAME5:
        return SHORTNAME5_EDEFAULT == null ? shortname5 != null : !SHORTNAME5_EDEFAULT.equals(shortname5);
      case EditorPackage.DOMAIN_DEF__LONGNAME5:
        return LONGNAME5_EDEFAULT == null ? longname5 != null : !LONGNAME5_EDEFAULT.equals(longname5);
      case EditorPackage.DOMAIN_DEF__LONGNAME6:
        return LONGNAME6_EDEFAULT == null ? longname6 != null : !LONGNAME6_EDEFAULT.equals(longname6);
      case EditorPackage.DOMAIN_DEF__CP5:
        return cp5 != null;
      case EditorPackage.DOMAIN_DEF__EXPORT_NAME:
        return EXPORT_NAME_EDEFAULT == null ? exportName != null : !EXPORT_NAME_EDEFAULT.equals(exportName);
      case EditorPackage.DOMAIN_DEF__IMPL_NAME5:
        return IMPL_NAME5_EDEFAULT == null ? implName5 != null : !IMPL_NAME5_EDEFAULT.equals(implName5);
      case EditorPackage.DOMAIN_DEF__WH5:
        return wh5 != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", shortname5: ");
    result.append(shortname5);
    result.append(", longname5: ");
    result.append(longname5);
    result.append(", longname6: ");
    result.append(longname6);
    result.append(", exportName: ");
    result.append(exportName);
    result.append(", implName5: ");
    result.append(implName5);
    result.append(')');
    return result.toString();
  }

} //DomainDefImpl
