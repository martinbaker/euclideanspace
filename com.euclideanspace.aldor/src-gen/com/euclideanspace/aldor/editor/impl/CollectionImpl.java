/**
 */
package com.euclideanspace.aldor.editor.impl;

import com.euclideanspace.aldor.editor.AlwaysPart_BalStatement;
import com.euclideanspace.aldor.editor.AnyStatement;
import com.euclideanspace.aldor.editor.BalStatement;
import com.euclideanspace.aldor.editor.BindingL_Infixed_BalStatement;
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
 *   <li>{@link com.euclideanspace.aldor.editor.impl.CollectionImpl#getBbs5 <em>Bbs5</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.CollectionImpl#getBas2 <em>Bas2</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.CollectionImpl#getBbs3 <em>Bbs3</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CollectionImpl extends BindingL_Infixed_CollectionImpl implements Collection
{
  /**
   * The cached value of the '{@link #getBbs5() <em>Bbs5</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBbs5()
   * @generated
   * @ordered
   */
  protected Binding_BalStatement bbs5;

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
  public Binding_BalStatement getBbs5()
  {
    return bbs5;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBbs5(Binding_BalStatement newBbs5, NotificationChain msgs)
  {
    Binding_BalStatement oldBbs5 = bbs5;
    bbs5 = newBbs5;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.COLLECTION__BBS5, oldBbs5, newBbs5);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBbs5(Binding_BalStatement newBbs5)
  {
    if (newBbs5 != bbs5)
    {
      NotificationChain msgs = null;
      if (bbs5 != null)
        msgs = ((InternalEObject)bbs5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.COLLECTION__BBS5, null, msgs);
      if (newBbs5 != null)
        msgs = ((InternalEObject)newBbs5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.COLLECTION__BBS5, null, msgs);
      msgs = basicSetBbs5(newBbs5, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.COLLECTION__BBS5, newBbs5, newBbs5));
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
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case EditorPackage.COLLECTION__BBS5:
        return basicSetBbs5(null, msgs);
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
      case EditorPackage.COLLECTION__BBS5:
        return getBbs5();
      case EditorPackage.COLLECTION__BAS2:
        return getBas2();
      case EditorPackage.COLLECTION__BBS3:
        return getBbs3();
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
      case EditorPackage.COLLECTION__BBS5:
        setBbs5((Binding_BalStatement)newValue);
        return;
      case EditorPackage.COLLECTION__BAS2:
        setBas2((Binding_AnyStatement)newValue);
        return;
      case EditorPackage.COLLECTION__BBS3:
        setBbs3((Binding_BalStatement)newValue);
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
      case EditorPackage.COLLECTION__BBS5:
        setBbs5((Binding_BalStatement)null);
        return;
      case EditorPackage.COLLECTION__BAS2:
        setBas2((Binding_AnyStatement)null);
        return;
      case EditorPackage.COLLECTION__BBS3:
        setBbs3((Binding_BalStatement)null);
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
      case EditorPackage.COLLECTION__BBS5:
        return bbs5 != null;
      case EditorPackage.COLLECTION__BAS2:
        return bas2 != null;
      case EditorPackage.COLLECTION__BBS3:
        return bbs3 != null;
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
    if (baseClass == AnyStatement.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Flow_AnyStatement.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == AlwaysPart_BalStatement.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Binding_BalStatement.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == BindingL_Infixed_BalStatement.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == BalStatement.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Flow_BalStatement.class)
    {
      switch (derivedFeatureID)
      {
        case EditorPackage.COLLECTION__BBS5: return EditorPackage.FLOW_BAL_STATEMENT__BBS5;
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
    if (baseClass == AnyStatement.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Flow_AnyStatement.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == AlwaysPart_BalStatement.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Binding_BalStatement.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == BindingL_Infixed_BalStatement.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == BalStatement.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Flow_BalStatement.class)
    {
      switch (baseFeatureID)
      {
        case EditorPackage.FLOW_BAL_STATEMENT__BBS5: return EditorPackage.COLLECTION__BBS5;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} //CollectionImpl
