/**
 */
package com.euclideanspace.aldor.editor.impl;

import com.euclideanspace.aldor.editor.AlwaysPart_BalStatement;
import com.euclideanspace.aldor.editor.BalStatement;
import com.euclideanspace.aldor.editor.BindingL_Infixed_BalStatement;
import com.euclideanspace.aldor.editor.Binding_AnyStatement;
import com.euclideanspace.aldor.editor.Binding_BalStatement;
import com.euclideanspace.aldor.editor.EditorPackage;
import com.euclideanspace.aldor.editor.Flow_BalStatement;
import com.euclideanspace.aldor.editor.GenBound;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Bound</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.GenBoundImpl#getBbs5 <em>Bbs5</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.GenBoundImpl#getBas4 <em>Bas4</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenBoundImpl extends Flow_AnyStatementImpl implements GenBound
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
   * The cached value of the '{@link #getBas4() <em>Bas4</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBas4()
   * @generated
   * @ordered
   */
  protected Binding_AnyStatement bas4;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GenBoundImpl()
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
    return EditorPackage.Literals.GEN_BOUND;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.GEN_BOUND__BBS5, oldBbs5, newBbs5);
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
        msgs = ((InternalEObject)bbs5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.GEN_BOUND__BBS5, null, msgs);
      if (newBbs5 != null)
        msgs = ((InternalEObject)newBbs5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.GEN_BOUND__BBS5, null, msgs);
      msgs = basicSetBbs5(newBbs5, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.GEN_BOUND__BBS5, newBbs5, newBbs5));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Binding_AnyStatement getBas4()
  {
    return bas4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBas4(Binding_AnyStatement newBas4, NotificationChain msgs)
  {
    Binding_AnyStatement oldBas4 = bas4;
    bas4 = newBas4;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.GEN_BOUND__BAS4, oldBas4, newBas4);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBas4(Binding_AnyStatement newBas4)
  {
    if (newBas4 != bas4)
    {
      NotificationChain msgs = null;
      if (bas4 != null)
        msgs = ((InternalEObject)bas4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.GEN_BOUND__BAS4, null, msgs);
      if (newBas4 != null)
        msgs = ((InternalEObject)newBas4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.GEN_BOUND__BAS4, null, msgs);
      msgs = basicSetBas4(newBas4, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.GEN_BOUND__BAS4, newBas4, newBas4));
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
      case EditorPackage.GEN_BOUND__BBS5:
        return basicSetBbs5(null, msgs);
      case EditorPackage.GEN_BOUND__BAS4:
        return basicSetBas4(null, msgs);
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
      case EditorPackage.GEN_BOUND__BBS5:
        return getBbs5();
      case EditorPackage.GEN_BOUND__BAS4:
        return getBas4();
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
      case EditorPackage.GEN_BOUND__BBS5:
        setBbs5((Binding_BalStatement)newValue);
        return;
      case EditorPackage.GEN_BOUND__BAS4:
        setBas4((Binding_AnyStatement)newValue);
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
      case EditorPackage.GEN_BOUND__BBS5:
        setBbs5((Binding_BalStatement)null);
        return;
      case EditorPackage.GEN_BOUND__BAS4:
        setBas4((Binding_AnyStatement)null);
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
      case EditorPackage.GEN_BOUND__BBS5:
        return bbs5 != null;
      case EditorPackage.GEN_BOUND__BAS4:
        return bas4 != null;
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
        case EditorPackage.GEN_BOUND__BBS5: return EditorPackage.FLOW_BAL_STATEMENT__BBS5;
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
        case EditorPackage.FLOW_BAL_STATEMENT__BBS5: return EditorPackage.GEN_BOUND__BBS5;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} //GenBoundImpl
