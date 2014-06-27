/**
 */
package com.euclideanspace.spad.editor.impl;

import com.euclideanspace.spad.editor.AddPart;
import com.euclideanspace.spad.editor.EditorPackage;
import com.euclideanspace.spad.editor.TypeExpression;
import com.euclideanspace.spad.editor.WhereAssignments;
import com.euclideanspace.spad.editor.WherePart;
import com.euclideanspace.spad.editor.WithPart;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Where Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.spad.editor.impl.WherePartImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.WherePartImpl#getWhereAssig <em>Where Assig</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.WherePartImpl#getLongname8 <em>Longname8</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.WherePartImpl#getImp <em>Imp</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.WherePartImpl#getW8 <em>W8</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.WherePartImpl#getLongname9 <em>Longname9</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.WherePartImpl#getFs <em>Fs</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.WherePartImpl#getPar2 <em>Par2</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.WherePartImpl#getPar3 <em>Par3</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.WherePartImpl#getF2 <em>F2</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.WherePartImpl#getAdd <em>Add</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WherePartImpl extends MinimalEObjectImpl.Container implements WherePart
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
   * The cached value of the '{@link #getWhereAssig() <em>Where Assig</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWhereAssig()
   * @generated
   * @ordered
   */
  protected EList<WhereAssignments> whereAssig;

  /**
   * The default value of the '{@link #getLongname8() <em>Longname8</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLongname8()
   * @generated
   * @ordered
   */
  protected static final String LONGNAME8_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLongname8() <em>Longname8</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLongname8()
   * @generated
   * @ordered
   */
  protected String longname8 = LONGNAME8_EDEFAULT;

  /**
   * The cached value of the '{@link #getImp() <em>Imp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImp()
   * @generated
   * @ordered
   */
  protected TypeExpression imp;

  /**
   * The cached value of the '{@link #getW8() <em>W8</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getW8()
   * @generated
   * @ordered
   */
  protected WithPart w8;

  /**
   * The default value of the '{@link #getLongname9() <em>Longname9</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLongname9()
   * @generated
   * @ordered
   */
  protected static final String LONGNAME9_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLongname9() <em>Longname9</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLongname9()
   * @generated
   * @ordered
   */
  protected String longname9 = LONGNAME9_EDEFAULT;

  /**
   * The default value of the '{@link #getFs() <em>Fs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFs()
   * @generated
   * @ordered
   */
  protected static final String FS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFs() <em>Fs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFs()
   * @generated
   * @ordered
   */
  protected String fs = FS_EDEFAULT;

  /**
   * The default value of the '{@link #getPar2() <em>Par2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPar2()
   * @generated
   * @ordered
   */
  protected static final String PAR2_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPar2() <em>Par2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPar2()
   * @generated
   * @ordered
   */
  protected String par2 = PAR2_EDEFAULT;

  /**
   * The cached value of the '{@link #getPar3() <em>Par3</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPar3()
   * @generated
   * @ordered
   */
  protected EList<String> par3;

  /**
   * The default value of the '{@link #getF2() <em>F2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getF2()
   * @generated
   * @ordered
   */
  protected static final String F2_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getF2() <em>F2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getF2()
   * @generated
   * @ordered
   */
  protected String f2 = F2_EDEFAULT;

  /**
   * The cached value of the '{@link #getAdd() <em>Add</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAdd()
   * @generated
   * @ordered
   */
  protected AddPart add;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WherePartImpl()
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
    return EditorPackage.Literals.WHERE_PART;
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
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.WHERE_PART__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<WhereAssignments> getWhereAssig()
  {
    if (whereAssig == null)
    {
      whereAssig = new EObjectContainmentEList<WhereAssignments>(WhereAssignments.class, this, EditorPackage.WHERE_PART__WHERE_ASSIG);
    }
    return whereAssig;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLongname8()
  {
    return longname8;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLongname8(String newLongname8)
  {
    String oldLongname8 = longname8;
    longname8 = newLongname8;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.WHERE_PART__LONGNAME8, oldLongname8, longname8));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeExpression getImp()
  {
    return imp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetImp(TypeExpression newImp, NotificationChain msgs)
  {
    TypeExpression oldImp = imp;
    imp = newImp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.WHERE_PART__IMP, oldImp, newImp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImp(TypeExpression newImp)
  {
    if (newImp != imp)
    {
      NotificationChain msgs = null;
      if (imp != null)
        msgs = ((InternalEObject)imp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.WHERE_PART__IMP, null, msgs);
      if (newImp != null)
        msgs = ((InternalEObject)newImp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.WHERE_PART__IMP, null, msgs);
      msgs = basicSetImp(newImp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.WHERE_PART__IMP, newImp, newImp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WithPart getW8()
  {
    return w8;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetW8(WithPart newW8, NotificationChain msgs)
  {
    WithPart oldW8 = w8;
    w8 = newW8;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.WHERE_PART__W8, oldW8, newW8);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setW8(WithPart newW8)
  {
    if (newW8 != w8)
    {
      NotificationChain msgs = null;
      if (w8 != null)
        msgs = ((InternalEObject)w8).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.WHERE_PART__W8, null, msgs);
      if (newW8 != null)
        msgs = ((InternalEObject)newW8).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.WHERE_PART__W8, null, msgs);
      msgs = basicSetW8(newW8, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.WHERE_PART__W8, newW8, newW8));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLongname9()
  {
    return longname9;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLongname9(String newLongname9)
  {
    String oldLongname9 = longname9;
    longname9 = newLongname9;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.WHERE_PART__LONGNAME9, oldLongname9, longname9));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFs()
  {
    return fs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFs(String newFs)
  {
    String oldFs = fs;
    fs = newFs;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.WHERE_PART__FS, oldFs, fs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPar2()
  {
    return par2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPar2(String newPar2)
  {
    String oldPar2 = par2;
    par2 = newPar2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.WHERE_PART__PAR2, oldPar2, par2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getPar3()
  {
    if (par3 == null)
    {
      par3 = new EDataTypeEList<String>(String.class, this, EditorPackage.WHERE_PART__PAR3);
    }
    return par3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getF2()
  {
    return f2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setF2(String newF2)
  {
    String oldF2 = f2;
    f2 = newF2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.WHERE_PART__F2, oldF2, f2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AddPart getAdd()
  {
    return add;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAdd(AddPart newAdd, NotificationChain msgs)
  {
    AddPart oldAdd = add;
    add = newAdd;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.WHERE_PART__ADD, oldAdd, newAdd);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAdd(AddPart newAdd)
  {
    if (newAdd != add)
    {
      NotificationChain msgs = null;
      if (add != null)
        msgs = ((InternalEObject)add).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.WHERE_PART__ADD, null, msgs);
      if (newAdd != null)
        msgs = ((InternalEObject)newAdd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.WHERE_PART__ADD, null, msgs);
      msgs = basicSetAdd(newAdd, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.WHERE_PART__ADD, newAdd, newAdd));
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
      case EditorPackage.WHERE_PART__WHERE_ASSIG:
        return ((InternalEList<?>)getWhereAssig()).basicRemove(otherEnd, msgs);
      case EditorPackage.WHERE_PART__IMP:
        return basicSetImp(null, msgs);
      case EditorPackage.WHERE_PART__W8:
        return basicSetW8(null, msgs);
      case EditorPackage.WHERE_PART__ADD:
        return basicSetAdd(null, msgs);
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
      case EditorPackage.WHERE_PART__NAME:
        return getName();
      case EditorPackage.WHERE_PART__WHERE_ASSIG:
        return getWhereAssig();
      case EditorPackage.WHERE_PART__LONGNAME8:
        return getLongname8();
      case EditorPackage.WHERE_PART__IMP:
        return getImp();
      case EditorPackage.WHERE_PART__W8:
        return getW8();
      case EditorPackage.WHERE_PART__LONGNAME9:
        return getLongname9();
      case EditorPackage.WHERE_PART__FS:
        return getFs();
      case EditorPackage.WHERE_PART__PAR2:
        return getPar2();
      case EditorPackage.WHERE_PART__PAR3:
        return getPar3();
      case EditorPackage.WHERE_PART__F2:
        return getF2();
      case EditorPackage.WHERE_PART__ADD:
        return getAdd();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EditorPackage.WHERE_PART__NAME:
        setName((String)newValue);
        return;
      case EditorPackage.WHERE_PART__WHERE_ASSIG:
        getWhereAssig().clear();
        getWhereAssig().addAll((Collection<? extends WhereAssignments>)newValue);
        return;
      case EditorPackage.WHERE_PART__LONGNAME8:
        setLongname8((String)newValue);
        return;
      case EditorPackage.WHERE_PART__IMP:
        setImp((TypeExpression)newValue);
        return;
      case EditorPackage.WHERE_PART__W8:
        setW8((WithPart)newValue);
        return;
      case EditorPackage.WHERE_PART__LONGNAME9:
        setLongname9((String)newValue);
        return;
      case EditorPackage.WHERE_PART__FS:
        setFs((String)newValue);
        return;
      case EditorPackage.WHERE_PART__PAR2:
        setPar2((String)newValue);
        return;
      case EditorPackage.WHERE_PART__PAR3:
        getPar3().clear();
        getPar3().addAll((Collection<? extends String>)newValue);
        return;
      case EditorPackage.WHERE_PART__F2:
        setF2((String)newValue);
        return;
      case EditorPackage.WHERE_PART__ADD:
        setAdd((AddPart)newValue);
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
      case EditorPackage.WHERE_PART__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EditorPackage.WHERE_PART__WHERE_ASSIG:
        getWhereAssig().clear();
        return;
      case EditorPackage.WHERE_PART__LONGNAME8:
        setLongname8(LONGNAME8_EDEFAULT);
        return;
      case EditorPackage.WHERE_PART__IMP:
        setImp((TypeExpression)null);
        return;
      case EditorPackage.WHERE_PART__W8:
        setW8((WithPart)null);
        return;
      case EditorPackage.WHERE_PART__LONGNAME9:
        setLongname9(LONGNAME9_EDEFAULT);
        return;
      case EditorPackage.WHERE_PART__FS:
        setFs(FS_EDEFAULT);
        return;
      case EditorPackage.WHERE_PART__PAR2:
        setPar2(PAR2_EDEFAULT);
        return;
      case EditorPackage.WHERE_PART__PAR3:
        getPar3().clear();
        return;
      case EditorPackage.WHERE_PART__F2:
        setF2(F2_EDEFAULT);
        return;
      case EditorPackage.WHERE_PART__ADD:
        setAdd((AddPart)null);
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
      case EditorPackage.WHERE_PART__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EditorPackage.WHERE_PART__WHERE_ASSIG:
        return whereAssig != null && !whereAssig.isEmpty();
      case EditorPackage.WHERE_PART__LONGNAME8:
        return LONGNAME8_EDEFAULT == null ? longname8 != null : !LONGNAME8_EDEFAULT.equals(longname8);
      case EditorPackage.WHERE_PART__IMP:
        return imp != null;
      case EditorPackage.WHERE_PART__W8:
        return w8 != null;
      case EditorPackage.WHERE_PART__LONGNAME9:
        return LONGNAME9_EDEFAULT == null ? longname9 != null : !LONGNAME9_EDEFAULT.equals(longname9);
      case EditorPackage.WHERE_PART__FS:
        return FS_EDEFAULT == null ? fs != null : !FS_EDEFAULT.equals(fs);
      case EditorPackage.WHERE_PART__PAR2:
        return PAR2_EDEFAULT == null ? par2 != null : !PAR2_EDEFAULT.equals(par2);
      case EditorPackage.WHERE_PART__PAR3:
        return par3 != null && !par3.isEmpty();
      case EditorPackage.WHERE_PART__F2:
        return F2_EDEFAULT == null ? f2 != null : !F2_EDEFAULT.equals(f2);
      case EditorPackage.WHERE_PART__ADD:
        return add != null;
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
    result.append(", longname8: ");
    result.append(longname8);
    result.append(", longname9: ");
    result.append(longname9);
    result.append(", fs: ");
    result.append(fs);
    result.append(", par2: ");
    result.append(par2);
    result.append(", par3: ");
    result.append(par3);
    result.append(", f2: ");
    result.append(f2);
    result.append(')');
    return result.toString();
  }

} //WherePartImpl
