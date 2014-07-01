/**
 */
package com.euclideanspace.aldor.editor.impl;

import com.euclideanspace.aldor.editor.Binding_AnyStatement;
import com.euclideanspace.aldor.editor.Binding_BalStatement;
import com.euclideanspace.aldor.editor.Collection;
import com.euclideanspace.aldor.editor.EditorPackage;
import com.euclideanspace.aldor.editor.Flow_AnyStatement;
import com.euclideanspace.aldor.editor.Flow_BalStatement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.CollectionImpl#getBas3 <em>Bas3</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.CollectionImpl#getBbs4 <em>Bbs4</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.CollectionImpl#getBas2 <em>Bas2</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.CollectionImpl#getBbs3 <em>Bbs3</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.CollectionImpl#getI <em>I</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CollectionImpl extends BindingL_Infixed_CollectionImpl implements Collection
{
  /**
   * The cached value of the '{@link #getBas3() <em>Bas3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBas3()
   * @generated
   * @ordered
   */
  protected Binding_AnyStatement bas3;

  /**
   * The cached value of the '{@link #getBbs4() <em>Bbs4</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBbs4()
   * @generated
   * @ordered
   */
  protected Binding_BalStatement bbs4;

  /**
   * The cached value of the '{@link #getBas2() <em>Bas2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBas2()
   * @generated
   * @ordered
   */
  protected Binding_AnyStatement bas2;

  /**
   * The cached value of the '{@link #getBbs3() <em>Bbs3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBbs3()
   * @generated
   * @ordered
   */
  protected Binding_BalStatement bbs3;

  /**
   * The default value of the '{@link #getI() <em>I</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getI()
   * @generated
   * @ordered
   */
  protected static final String I_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getI() <em>I</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getI()
   * @generated
   * @ordered
   */
  protected String i = I_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CollectionImpl()
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
    return EditorPackage.Literals.COLLECTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Binding_AnyStatement getBas3()
  {
    return bas3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBas3(Binding_AnyStatement newBas3, NotificationChain msgs)
  {
    Binding_AnyStatement oldBas3 = bas3;
    bas3 = newBas3;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.COLLECTION__BAS3, oldBas3, newBas3);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBas3(Binding_AnyStatement newBas3)
  {
    if (newBas3 != bas3)
    {
      NotificationChain msgs = null;
      if (bas3 != null)
        msgs = ((InternalEObject)bas3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.COLLECTION__BAS3, null, msgs);
      if (newBas3 != null)
        msgs = ((InternalEObject)newBas3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.COLLECTION__BAS3, null, msgs);
      msgs = basicSetBas3(newBas3, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.COLLECTION__BAS3, newBas3, newBas3));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Binding_BalStatement getBbs4()
  {
    return bbs4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBbs4(Binding_BalStatement newBbs4, NotificationChain msgs)
  {
    Binding_BalStatement oldBbs4 = bbs4;
    bbs4 = newBbs4;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.COLLECTION__BBS4, oldBbs4, newBbs4);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBbs4(Binding_BalStatement newBbs4)
  {
    if (newBbs4 != bbs4)
    {
      NotificationChain msgs = null;
      if (bbs4 != null)
        msgs = ((InternalEObject)bbs4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.COLLECTION__BBS4, null, msgs);
      if (newBbs4 != null)
        msgs = ((InternalEObject)newBbs4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.COLLECTION__BBS4, null, msgs);
      msgs = basicSetBbs4(newBbs4, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.COLLECTION__BBS4, newBbs4, newBbs4));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Binding_AnyStatement getBas2()
  {
    return bas2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBas2(Binding_AnyStatement newBas2, NotificationChain msgs)
  {
    Binding_AnyStatement oldBas2 = bas2;
    bas2 = newBas2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.COLLECTION__BAS2, oldBas2, newBas2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBas2(Binding_AnyStatement newBas2)
  {
    if (newBas2 != bas2)
    {
      NotificationChain msgs = null;
      if (bas2 != null)
        msgs = ((InternalEObject)bas2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.COLLECTION__BAS2, null, msgs);
      if (newBas2 != null)
        msgs = ((InternalEObject)newBas2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.COLLECTION__BAS2, null, msgs);
      msgs = basicSetBas2(newBas2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.COLLECTION__BAS2, newBas2, newBas2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Binding_BalStatement getBbs3()
  {
    return bbs3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBbs3(Binding_BalStatement newBbs3, NotificationChain msgs)
  {
    Binding_BalStatement oldBbs3 = bbs3;
    bbs3 = newBbs3;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.COLLECTION__BBS3, oldBbs3, newBbs3);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBbs3(Binding_BalStatement newBbs3)
  {
    if (newBbs3 != bbs3)
    {
      NotificationChain msgs = null;
      if (bbs3 != null)
        msgs = ((InternalEObject)bbs3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.COLLECTION__BBS3, null, msgs);
      if (newBbs3 != null)
        msgs = ((InternalEObject)newBbs3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.COLLECTION__BBS3, null, msgs);
      msgs = basicSetBbs3(newBbs3, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.COLLECTION__BBS3, newBbs3, newBbs3));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getI()
  {
    return i;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setI(String newI)
  {
    String oldI = i;
    i = newI;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.COLLECTION__I, oldI, i));
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
      case EditorPackage.COLLECTION__BAS3:
        return basicSetBas3(null, msgs);
      case EditorPackage.COLLECTION__BBS4:
        return basicSetBbs4(null, msgs);
      case EditorPackage.COLLECTION__BAS2:
        return basicSetBas2(null, msgs);
      case EditorPackage.COLLECTION__BBS3:
        return basicSetBbs3(null, msgs);
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
      case EditorPackage.COLLECTION__BAS3:
        return getBas3();
      case EditorPackage.COLLECTION__BBS4:
        return getBbs4();
      case EditorPackage.COLLECTION__BAS2:
        return getBas2();
      case EditorPackage.COLLECTION__BBS3:
        return getBbs3();
      case EditorPackage.COLLECTION__I:
        return getI();
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
      case EditorPackage.COLLECTION__BAS3:
        setBas3((Binding_AnyStatement)newValue);
        return;
      case EditorPackage.COLLECTION__BBS4:
        setBbs4((Binding_BalStatement)newValue);
        return;
      case EditorPackage.COLLECTION__BAS2:
        setBas2((Binding_AnyStatement)newValue);
        return;
      case EditorPackage.COLLECTION__BBS3:
        setBbs3((Binding_BalStatement)newValue);
        return;
      case EditorPackage.COLLECTION__I:
        setI((String)newValue);
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
      case EditorPackage.COLLECTION__BAS3:
        setBas3((Binding_AnyStatement)null);
        return;
      case EditorPackage.COLLECTION__BBS4:
        setBbs4((Binding_BalStatement)null);
        return;
      case EditorPackage.COLLECTION__BAS2:
        setBas2((Binding_AnyStatement)null);
        return;
      case EditorPackage.COLLECTION__BBS3:
        setBbs3((Binding_BalStatement)null);
        return;
      case EditorPackage.COLLECTION__I:
        setI(I_EDEFAULT);
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
      case EditorPackage.COLLECTION__BAS3:
        return bas3 != null;
      case EditorPackage.COLLECTION__BBS4:
        return bbs4 != null;
      case EditorPackage.COLLECTION__BAS2:
        return bas2 != null;
      case EditorPackage.COLLECTION__BBS3:
        return bbs3 != null;
      case EditorPackage.COLLECTION__I:
        return I_EDEFAULT == null ? i != null : !I_EDEFAULT.equals(i);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == Flow_AnyStatement.class)
    {
      switch (derivedFeatureID)
      {
        case EditorPackage.COLLECTION__BAS3: return EditorPackage.FLOW_ANY_STATEMENT__BAS3;
        default: return -1;
      }
    }
    if (baseClass == Flow_BalStatement.class)
    {
      switch (derivedFeatureID)
      {
        case EditorPackage.COLLECTION__BBS4: return EditorPackage.FLOW_BAL_STATEMENT__BBS4;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == Flow_AnyStatement.class)
    {
      switch (baseFeatureID)
      {
        case EditorPackage.FLOW_ANY_STATEMENT__BAS3: return EditorPackage.COLLECTION__BAS3;
        default: return -1;
      }
    }
    if (baseClass == Flow_BalStatement.class)
    {
      switch (baseFeatureID)
      {
        case EditorPackage.FLOW_BAL_STATEMENT__BBS4: return EditorPackage.COLLECTION__BBS4;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
    result.append(" (i: ");
    result.append(i);
    result.append(')');
    return result.toString();
  }

} //CollectionImpl
