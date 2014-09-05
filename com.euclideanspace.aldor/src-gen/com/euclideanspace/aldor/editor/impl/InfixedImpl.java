/**
 */
package com.euclideanspace.aldor.editor.impl;

import com.euclideanspace.aldor.editor.Block;
import com.euclideanspace.aldor.editor.DeclPart;
import com.euclideanspace.aldor.editor.EditorPackage;
import com.euclideanspace.aldor.editor.ForLhs;
import com.euclideanspace.aldor.editor.FromPart;
import com.euclideanspace.aldor.editor.Infixed;
import com.euclideanspace.aldor.editor.InfixedExpr;
import com.euclideanspace.aldor.editor.Iterator;
import com.euclideanspace.aldor.editor.Iterators;
import com.euclideanspace.aldor.editor.SuchthatPart;
import com.euclideanspace.aldor.editor.enlist1_Infixed_Comma_AB;
import com.euclideanspace.aldor.editor.enlister1_Infixed_Comma;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Infixed</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.InfixedImpl#getI <em>I</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.InfixedImpl#getSp <em>Sp</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.InfixedImpl#getI3 <em>I3</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.InfixedImpl#getIfx <em>Ifx</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.InfixedImpl#getDp <em>Dp</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.InfixedImpl#getB <em>B</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.InfixedImpl#getI2 <em>I2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InfixedImpl extends ToPartImpl implements Infixed
{
  /**
   * The cached value of the '{@link #getI() <em>I</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getI()
   * @generated
   * @ordered
   */
  protected Infixed i;

  /**
   * The cached value of the '{@link #getSp() <em>Sp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSp()
   * @generated
   * @ordered
   */
  protected SuchthatPart sp;

  /**
   * The cached value of the '{@link #getI3() <em>I3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getI3()
   * @generated
   * @ordered
   */
  protected Iterators i3;

  /**
   * The cached value of the '{@link #getIfx() <em>Ifx</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIfx()
   * @generated
   * @ordered
   */
  protected InfixedExpr ifx;

  /**
   * The cached value of the '{@link #getDp() <em>Dp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDp()
   * @generated
   * @ordered
   */
  protected DeclPart dp;

  /**
   * The cached value of the '{@link #getB() <em>B</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getB()
   * @generated
   * @ordered
   */
  protected Block b;

  /**
   * The cached value of the '{@link #getI2() <em>I2</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getI2()
   * @generated
   * @ordered
   */
  protected EList<Infixed> i2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InfixedImpl()
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
    return EditorPackage.Literals.INFIXED;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Infixed getI()
  {
    return i;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetI(Infixed newI, NotificationChain msgs)
  {
    Infixed oldI = i;
    i = newI;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.INFIXED__I, oldI, newI);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setI(Infixed newI)
  {
    if (newI != i)
    {
      NotificationChain msgs = null;
      if (i != null)
        msgs = ((InternalEObject)i).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.INFIXED__I, null, msgs);
      if (newI != null)
        msgs = ((InternalEObject)newI).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.INFIXED__I, null, msgs);
      msgs = basicSetI(newI, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.INFIXED__I, newI, newI));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SuchthatPart getSp()
  {
    return sp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSp(SuchthatPart newSp, NotificationChain msgs)
  {
    SuchthatPart oldSp = sp;
    sp = newSp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.INFIXED__SP, oldSp, newSp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSp(SuchthatPart newSp)
  {
    if (newSp != sp)
    {
      NotificationChain msgs = null;
      if (sp != null)
        msgs = ((InternalEObject)sp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.INFIXED__SP, null, msgs);
      if (newSp != null)
        msgs = ((InternalEObject)newSp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.INFIXED__SP, null, msgs);
      msgs = basicSetSp(newSp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.INFIXED__SP, newSp, newSp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Iterators getI3()
  {
    return i3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetI3(Iterators newI3, NotificationChain msgs)
  {
    Iterators oldI3 = i3;
    i3 = newI3;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.INFIXED__I3, oldI3, newI3);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setI3(Iterators newI3)
  {
    if (newI3 != i3)
    {
      NotificationChain msgs = null;
      if (i3 != null)
        msgs = ((InternalEObject)i3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.INFIXED__I3, null, msgs);
      if (newI3 != null)
        msgs = ((InternalEObject)newI3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.INFIXED__I3, null, msgs);
      msgs = basicSetI3(newI3, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.INFIXED__I3, newI3, newI3));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InfixedExpr getIfx()
  {
    return ifx;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIfx(InfixedExpr newIfx, NotificationChain msgs)
  {
    InfixedExpr oldIfx = ifx;
    ifx = newIfx;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.INFIXED__IFX, oldIfx, newIfx);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIfx(InfixedExpr newIfx)
  {
    if (newIfx != ifx)
    {
      NotificationChain msgs = null;
      if (ifx != null)
        msgs = ((InternalEObject)ifx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.INFIXED__IFX, null, msgs);
      if (newIfx != null)
        msgs = ((InternalEObject)newIfx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.INFIXED__IFX, null, msgs);
      msgs = basicSetIfx(newIfx, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.INFIXED__IFX, newIfx, newIfx));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeclPart getDp()
  {
    return dp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDp(DeclPart newDp, NotificationChain msgs)
  {
    DeclPart oldDp = dp;
    dp = newDp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.INFIXED__DP, oldDp, newDp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDp(DeclPart newDp)
  {
    if (newDp != dp)
    {
      NotificationChain msgs = null;
      if (dp != null)
        msgs = ((InternalEObject)dp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.INFIXED__DP, null, msgs);
      if (newDp != null)
        msgs = ((InternalEObject)newDp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.INFIXED__DP, null, msgs);
      msgs = basicSetDp(newDp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.INFIXED__DP, newDp, newDp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Block getB()
  {
    return b;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetB(Block newB, NotificationChain msgs)
  {
    Block oldB = b;
    b = newB;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.INFIXED__B, oldB, newB);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setB(Block newB)
  {
    if (newB != b)
    {
      NotificationChain msgs = null;
      if (b != null)
        msgs = ((InternalEObject)b).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.INFIXED__B, null, msgs);
      if (newB != null)
        msgs = ((InternalEObject)newB).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.INFIXED__B, null, msgs);
      msgs = basicSetB(newB, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.INFIXED__B, newB, newB));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Infixed> getI2()
  {
    if (i2 == null)
    {
      i2 = new EObjectContainmentEList<Infixed>(Infixed.class, this, EditorPackage.INFIXED__I2);
    }
    return i2;
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
      case EditorPackage.INFIXED__I:
        return basicSetI(null, msgs);
      case EditorPackage.INFIXED__SP:
        return basicSetSp(null, msgs);
      case EditorPackage.INFIXED__I3:
        return basicSetI3(null, msgs);
      case EditorPackage.INFIXED__IFX:
        return basicSetIfx(null, msgs);
      case EditorPackage.INFIXED__DP:
        return basicSetDp(null, msgs);
      case EditorPackage.INFIXED__B:
        return basicSetB(null, msgs);
      case EditorPackage.INFIXED__I2:
        return ((InternalEList<?>)getI2()).basicRemove(otherEnd, msgs);
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
      case EditorPackage.INFIXED__I:
        return getI();
      case EditorPackage.INFIXED__SP:
        return getSp();
      case EditorPackage.INFIXED__I3:
        return getI3();
      case EditorPackage.INFIXED__IFX:
        return getIfx();
      case EditorPackage.INFIXED__DP:
        return getDp();
      case EditorPackage.INFIXED__B:
        return getB();
      case EditorPackage.INFIXED__I2:
        return getI2();
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
      case EditorPackage.INFIXED__I:
        setI((Infixed)newValue);
        return;
      case EditorPackage.INFIXED__SP:
        setSp((SuchthatPart)newValue);
        return;
      case EditorPackage.INFIXED__I3:
        setI3((Iterators)newValue);
        return;
      case EditorPackage.INFIXED__IFX:
        setIfx((InfixedExpr)newValue);
        return;
      case EditorPackage.INFIXED__DP:
        setDp((DeclPart)newValue);
        return;
      case EditorPackage.INFIXED__B:
        setB((Block)newValue);
        return;
      case EditorPackage.INFIXED__I2:
        getI2().clear();
        getI2().addAll((Collection<? extends Infixed>)newValue);
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
      case EditorPackage.INFIXED__I:
        setI((Infixed)null);
        return;
      case EditorPackage.INFIXED__SP:
        setSp((SuchthatPart)null);
        return;
      case EditorPackage.INFIXED__I3:
        setI3((Iterators)null);
        return;
      case EditorPackage.INFIXED__IFX:
        setIfx((InfixedExpr)null);
        return;
      case EditorPackage.INFIXED__DP:
        setDp((DeclPart)null);
        return;
      case EditorPackage.INFIXED__B:
        setB((Block)null);
        return;
      case EditorPackage.INFIXED__I2:
        getI2().clear();
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
      case EditorPackage.INFIXED__I:
        return i != null;
      case EditorPackage.INFIXED__SP:
        return sp != null;
      case EditorPackage.INFIXED__I3:
        return i3 != null;
      case EditorPackage.INFIXED__IFX:
        return ifx != null;
      case EditorPackage.INFIXED__DP:
        return dp != null;
      case EditorPackage.INFIXED__B:
        return b != null;
      case EditorPackage.INFIXED__I2:
        return i2 != null && !i2.isEmpty();
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
    if (baseClass == com.euclideanspace.aldor.editor.Collection.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Iterator.class)
    {
      switch (derivedFeatureID)
      {
        case EditorPackage.INFIXED__I: return EditorPackage.ITERATOR__I;
        default: return -1;
      }
    }
    if (baseClass == ForLhs.class)
    {
      switch (derivedFeatureID)
      {
        case EditorPackage.INFIXED__SP: return EditorPackage.FOR_LHS__SP;
        default: return -1;
      }
    }
    if (baseClass == SuchthatPart.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == FromPart.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == enlist1_Infixed_Comma_AB.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == enlister1_Infixed_Comma.class)
    {
      switch (derivedFeatureID)
      {
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
    if (baseClass == com.euclideanspace.aldor.editor.Collection.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Iterator.class)
    {
      switch (baseFeatureID)
      {
        case EditorPackage.ITERATOR__I: return EditorPackage.INFIXED__I;
        default: return -1;
      }
    }
    if (baseClass == ForLhs.class)
    {
      switch (baseFeatureID)
      {
        case EditorPackage.FOR_LHS__SP: return EditorPackage.INFIXED__SP;
        default: return -1;
      }
    }
    if (baseClass == SuchthatPart.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == FromPart.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == enlist1_Infixed_Comma_AB.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == enlister1_Infixed_Comma.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} //InfixedImpl
