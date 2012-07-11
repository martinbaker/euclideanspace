/**
 */
package com.euclideanspace.spad.editor.impl;

import com.euclideanspace.spad.editor.CategoryDef;
import com.euclideanspace.spad.editor.EditorPackage;
import com.euclideanspace.spad.editor.TypeArguments;
import com.euclideanspace.spad.editor.TypeParameterList;
import com.euclideanspace.spad.editor.WherePart;
import com.euclideanspace.spad.editor.WithPart;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Category Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.spad.editor.impl.CategoryDefImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.CategoryDefImpl#getShortname <em>Shortname</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.CategoryDefImpl#getLongname <em>Longname</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.CategoryDefImpl#getLongname2 <em>Longname2</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.CategoryDefImpl#getCp <em>Cp</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.CategoryDefImpl#getImplName <em>Impl Name</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.CategoryDefImpl#getW <em>W</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.CategoryDefImpl#getWh5 <em>Wh5</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CategoryDefImpl extends MinimalEObjectImpl.Container implements CategoryDef
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
   * The default value of the '{@link #getShortname() <em>Shortname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getShortname()
   * @generated
   * @ordered
   */
  protected static final String SHORTNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getShortname() <em>Shortname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getShortname()
   * @generated
   * @ordered
   */
  protected String shortname = SHORTNAME_EDEFAULT;

  /**
   * The default value of the '{@link #getLongname() <em>Longname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLongname()
   * @generated
   * @ordered
   */
  protected static final String LONGNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLongname() <em>Longname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLongname()
   * @generated
   * @ordered
   */
  protected String longname = LONGNAME_EDEFAULT;

  /**
   * The default value of the '{@link #getLongname2() <em>Longname2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLongname2()
   * @generated
   * @ordered
   */
  protected static final String LONGNAME2_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLongname2() <em>Longname2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLongname2()
   * @generated
   * @ordered
   */
  protected String longname2 = LONGNAME2_EDEFAULT;

  /**
   * The cached value of the '{@link #getCp() <em>Cp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCp()
   * @generated
   * @ordered
   */
  protected TypeParameterList cp;

  /**
   * The cached value of the '{@link #getImplName() <em>Impl Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImplName()
   * @generated
   * @ordered
   */
  protected TypeArguments implName;

  /**
   * The cached value of the '{@link #getW() <em>W</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getW()
   * @generated
   * @ordered
   */
  protected WithPart w;

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
  protected CategoryDefImpl()
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
    return EditorPackage.Literals.CATEGORY_DEF;
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
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.CATEGORY_DEF__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getShortname()
  {
    return shortname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setShortname(String newShortname)
  {
    String oldShortname = shortname;
    shortname = newShortname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.CATEGORY_DEF__SHORTNAME, oldShortname, shortname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLongname()
  {
    return longname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLongname(String newLongname)
  {
    String oldLongname = longname;
    longname = newLongname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.CATEGORY_DEF__LONGNAME, oldLongname, longname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLongname2()
  {
    return longname2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLongname2(String newLongname2)
  {
    String oldLongname2 = longname2;
    longname2 = newLongname2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.CATEGORY_DEF__LONGNAME2, oldLongname2, longname2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeParameterList getCp()
  {
    return cp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCp(TypeParameterList newCp, NotificationChain msgs)
  {
    TypeParameterList oldCp = cp;
    cp = newCp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.CATEGORY_DEF__CP, oldCp, newCp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCp(TypeParameterList newCp)
  {
    if (newCp != cp)
    {
      NotificationChain msgs = null;
      if (cp != null)
        msgs = ((InternalEObject)cp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.CATEGORY_DEF__CP, null, msgs);
      if (newCp != null)
        msgs = ((InternalEObject)newCp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.CATEGORY_DEF__CP, null, msgs);
      msgs = basicSetCp(newCp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.CATEGORY_DEF__CP, newCp, newCp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeArguments getImplName()
  {
    return implName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetImplName(TypeArguments newImplName, NotificationChain msgs)
  {
    TypeArguments oldImplName = implName;
    implName = newImplName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.CATEGORY_DEF__IMPL_NAME, oldImplName, newImplName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImplName(TypeArguments newImplName)
  {
    if (newImplName != implName)
    {
      NotificationChain msgs = null;
      if (implName != null)
        msgs = ((InternalEObject)implName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.CATEGORY_DEF__IMPL_NAME, null, msgs);
      if (newImplName != null)
        msgs = ((InternalEObject)newImplName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.CATEGORY_DEF__IMPL_NAME, null, msgs);
      msgs = basicSetImplName(newImplName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.CATEGORY_DEF__IMPL_NAME, newImplName, newImplName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WithPart getW()
  {
    return w;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetW(WithPart newW, NotificationChain msgs)
  {
    WithPart oldW = w;
    w = newW;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.CATEGORY_DEF__W, oldW, newW);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setW(WithPart newW)
  {
    if (newW != w)
    {
      NotificationChain msgs = null;
      if (w != null)
        msgs = ((InternalEObject)w).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.CATEGORY_DEF__W, null, msgs);
      if (newW != null)
        msgs = ((InternalEObject)newW).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.CATEGORY_DEF__W, null, msgs);
      msgs = basicSetW(newW, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.CATEGORY_DEF__W, newW, newW));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.CATEGORY_DEF__WH5, oldWh5, newWh5);
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
        msgs = ((InternalEObject)wh5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.CATEGORY_DEF__WH5, null, msgs);
      if (newWh5 != null)
        msgs = ((InternalEObject)newWh5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.CATEGORY_DEF__WH5, null, msgs);
      msgs = basicSetWh5(newWh5, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.CATEGORY_DEF__WH5, newWh5, newWh5));
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
      case EditorPackage.CATEGORY_DEF__CP:
        return basicSetCp(null, msgs);
      case EditorPackage.CATEGORY_DEF__IMPL_NAME:
        return basicSetImplName(null, msgs);
      case EditorPackage.CATEGORY_DEF__W:
        return basicSetW(null, msgs);
      case EditorPackage.CATEGORY_DEF__WH5:
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
      case EditorPackage.CATEGORY_DEF__NAME:
        return getName();
      case EditorPackage.CATEGORY_DEF__SHORTNAME:
        return getShortname();
      case EditorPackage.CATEGORY_DEF__LONGNAME:
        return getLongname();
      case EditorPackage.CATEGORY_DEF__LONGNAME2:
        return getLongname2();
      case EditorPackage.CATEGORY_DEF__CP:
        return getCp();
      case EditorPackage.CATEGORY_DEF__IMPL_NAME:
        return getImplName();
      case EditorPackage.CATEGORY_DEF__W:
        return getW();
      case EditorPackage.CATEGORY_DEF__WH5:
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
      case EditorPackage.CATEGORY_DEF__NAME:
        setName((String)newValue);
        return;
      case EditorPackage.CATEGORY_DEF__SHORTNAME:
        setShortname((String)newValue);
        return;
      case EditorPackage.CATEGORY_DEF__LONGNAME:
        setLongname((String)newValue);
        return;
      case EditorPackage.CATEGORY_DEF__LONGNAME2:
        setLongname2((String)newValue);
        return;
      case EditorPackage.CATEGORY_DEF__CP:
        setCp((TypeParameterList)newValue);
        return;
      case EditorPackage.CATEGORY_DEF__IMPL_NAME:
        setImplName((TypeArguments)newValue);
        return;
      case EditorPackage.CATEGORY_DEF__W:
        setW((WithPart)newValue);
        return;
      case EditorPackage.CATEGORY_DEF__WH5:
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
      case EditorPackage.CATEGORY_DEF__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EditorPackage.CATEGORY_DEF__SHORTNAME:
        setShortname(SHORTNAME_EDEFAULT);
        return;
      case EditorPackage.CATEGORY_DEF__LONGNAME:
        setLongname(LONGNAME_EDEFAULT);
        return;
      case EditorPackage.CATEGORY_DEF__LONGNAME2:
        setLongname2(LONGNAME2_EDEFAULT);
        return;
      case EditorPackage.CATEGORY_DEF__CP:
        setCp((TypeParameterList)null);
        return;
      case EditorPackage.CATEGORY_DEF__IMPL_NAME:
        setImplName((TypeArguments)null);
        return;
      case EditorPackage.CATEGORY_DEF__W:
        setW((WithPart)null);
        return;
      case EditorPackage.CATEGORY_DEF__WH5:
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
      case EditorPackage.CATEGORY_DEF__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EditorPackage.CATEGORY_DEF__SHORTNAME:
        return SHORTNAME_EDEFAULT == null ? shortname != null : !SHORTNAME_EDEFAULT.equals(shortname);
      case EditorPackage.CATEGORY_DEF__LONGNAME:
        return LONGNAME_EDEFAULT == null ? longname != null : !LONGNAME_EDEFAULT.equals(longname);
      case EditorPackage.CATEGORY_DEF__LONGNAME2:
        return LONGNAME2_EDEFAULT == null ? longname2 != null : !LONGNAME2_EDEFAULT.equals(longname2);
      case EditorPackage.CATEGORY_DEF__CP:
        return cp != null;
      case EditorPackage.CATEGORY_DEF__IMPL_NAME:
        return implName != null;
      case EditorPackage.CATEGORY_DEF__W:
        return w != null;
      case EditorPackage.CATEGORY_DEF__WH5:
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
    result.append(", shortname: ");
    result.append(shortname);
    result.append(", longname: ");
    result.append(longname);
    result.append(", longname2: ");
    result.append(longname2);
    result.append(')');
    return result.toString();
  }

} //CategoryDefImpl
