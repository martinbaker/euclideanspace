/**
 */
package com.euclideanspace.aldor.editor.impl;

import com.euclideanspace.aldor.editor.EditorPackage;
import com.euclideanspace.aldor.editor.TypeExpression;
import com.euclideanspace.aldor.editor.TypeLiteral;
import com.euclideanspace.aldor.editor.TypeNameOrFunctionCall;
import com.euclideanspace.aldor.editor.TypeResult;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.TypeResultImpl#getT <em>T</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.TypeResultImpl#getT2 <em>T2</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.TypeResultImpl#getTyname <em>Tyname</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.TypeResultImpl#getT7 <em>T7</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.TypeResultImpl#getT8 <em>T8</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.TypeResultImpl#getT21 <em>T21</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.TypeResultImpl#getT23 <em>T23</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.TypeResultImpl#getT10 <em>T10</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.TypeResultImpl#getT11 <em>T11</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.TypeResultImpl#getT24 <em>T24</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.TypeResultImpl#getT26 <em>T26</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.TypeResultImpl#getT12 <em>T12</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.TypeResultImpl#getT13 <em>T13</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.TypeResultImpl#getT15 <em>T15</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeResultImpl extends MinimalEObjectImpl.Container implements TypeResult
{
  /**
   * The cached value of the '{@link #getT() <em>T</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT()
   * @generated
   * @ordered
   */
  protected TypeLiteral t;

  /**
   * The default value of the '{@link #getT2() <em>T2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT2()
   * @generated
   * @ordered
   */
  protected static final String T2_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getT2() <em>T2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT2()
   * @generated
   * @ordered
   */
  protected String t2 = T2_EDEFAULT;

  /**
   * The default value of the '{@link #getTyname() <em>Tyname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTyname()
   * @generated
   * @ordered
   */
  protected static final String TYNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTyname() <em>Tyname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTyname()
   * @generated
   * @ordered
   */
  protected String tyname = TYNAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getT7() <em>T7</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT7()
   * @generated
   * @ordered
   */
  protected TypeExpression t7;

  /**
   * The cached value of the '{@link #getT8() <em>T8</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT8()
   * @generated
   * @ordered
   */
  protected EList<TypeExpression> t8;

  /**
   * The cached value of the '{@link #getT21() <em>T21</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT21()
   * @generated
   * @ordered
   */
  protected EList<TypeExpression> t21;

  /**
   * The cached value of the '{@link #getT23() <em>T23</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT23()
   * @generated
   * @ordered
   */
  protected EList<TypeExpression> t23;

  /**
   * The cached value of the '{@link #getT10() <em>T10</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT10()
   * @generated
   * @ordered
   */
  protected TypeExpression t10;

  /**
   * The cached value of the '{@link #getT11() <em>T11</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT11()
   * @generated
   * @ordered
   */
  protected EList<TypeExpression> t11;

  /**
   * The cached value of the '{@link #getT24() <em>T24</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT24()
   * @generated
   * @ordered
   */
  protected EList<TypeExpression> t24;

  /**
   * The cached value of the '{@link #getT26() <em>T26</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT26()
   * @generated
   * @ordered
   */
  protected EList<TypeExpression> t26;

  /**
   * The cached value of the '{@link #getT12() <em>T12</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT12()
   * @generated
   * @ordered
   */
  protected TypeExpression t12;

  /**
   * The cached value of the '{@link #getT13() <em>T13</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT13()
   * @generated
   * @ordered
   */
  protected EList<TypeExpression> t13;

  /**
   * The cached value of the '{@link #getT15() <em>T15</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT15()
   * @generated
   * @ordered
   */
  protected TypeNameOrFunctionCall t15;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypeResultImpl()
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
    return EditorPackage.Literals.TYPE_RESULT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeLiteral getT()
  {
    return t;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetT(TypeLiteral newT, NotificationChain msgs)
  {
    TypeLiteral oldT = t;
    t = newT;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_RESULT__T, oldT, newT);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT(TypeLiteral newT)
  {
    if (newT != t)
    {
      NotificationChain msgs = null;
      if (t != null)
        msgs = ((InternalEObject)t).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.TYPE_RESULT__T, null, msgs);
      if (newT != null)
        msgs = ((InternalEObject)newT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.TYPE_RESULT__T, null, msgs);
      msgs = basicSetT(newT, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_RESULT__T, newT, newT));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getT2()
  {
    return t2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT2(String newT2)
  {
    String oldT2 = t2;
    t2 = newT2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_RESULT__T2, oldT2, t2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTyname()
  {
    return tyname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTyname(String newTyname)
  {
    String oldTyname = tyname;
    tyname = newTyname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_RESULT__TYNAME, oldTyname, tyname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeExpression getT7()
  {
    return t7;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetT7(TypeExpression newT7, NotificationChain msgs)
  {
    TypeExpression oldT7 = t7;
    t7 = newT7;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_RESULT__T7, oldT7, newT7);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT7(TypeExpression newT7)
  {
    if (newT7 != t7)
    {
      NotificationChain msgs = null;
      if (t7 != null)
        msgs = ((InternalEObject)t7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.TYPE_RESULT__T7, null, msgs);
      if (newT7 != null)
        msgs = ((InternalEObject)newT7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.TYPE_RESULT__T7, null, msgs);
      msgs = basicSetT7(newT7, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_RESULT__T7, newT7, newT7));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeExpression> getT8()
  {
    if (t8 == null)
    {
      t8 = new EObjectContainmentEList<TypeExpression>(TypeExpression.class, this, EditorPackage.TYPE_RESULT__T8);
    }
    return t8;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeExpression> getT21()
  {
    if (t21 == null)
    {
      t21 = new EObjectContainmentEList<TypeExpression>(TypeExpression.class, this, EditorPackage.TYPE_RESULT__T21);
    }
    return t21;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeExpression> getT23()
  {
    if (t23 == null)
    {
      t23 = new EObjectContainmentEList<TypeExpression>(TypeExpression.class, this, EditorPackage.TYPE_RESULT__T23);
    }
    return t23;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeExpression getT10()
  {
    return t10;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetT10(TypeExpression newT10, NotificationChain msgs)
  {
    TypeExpression oldT10 = t10;
    t10 = newT10;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_RESULT__T10, oldT10, newT10);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT10(TypeExpression newT10)
  {
    if (newT10 != t10)
    {
      NotificationChain msgs = null;
      if (t10 != null)
        msgs = ((InternalEObject)t10).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.TYPE_RESULT__T10, null, msgs);
      if (newT10 != null)
        msgs = ((InternalEObject)newT10).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.TYPE_RESULT__T10, null, msgs);
      msgs = basicSetT10(newT10, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_RESULT__T10, newT10, newT10));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeExpression> getT11()
  {
    if (t11 == null)
    {
      t11 = new EObjectContainmentEList<TypeExpression>(TypeExpression.class, this, EditorPackage.TYPE_RESULT__T11);
    }
    return t11;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeExpression> getT24()
  {
    if (t24 == null)
    {
      t24 = new EObjectContainmentEList<TypeExpression>(TypeExpression.class, this, EditorPackage.TYPE_RESULT__T24);
    }
    return t24;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeExpression> getT26()
  {
    if (t26 == null)
    {
      t26 = new EObjectContainmentEList<TypeExpression>(TypeExpression.class, this, EditorPackage.TYPE_RESULT__T26);
    }
    return t26;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeExpression getT12()
  {
    return t12;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetT12(TypeExpression newT12, NotificationChain msgs)
  {
    TypeExpression oldT12 = t12;
    t12 = newT12;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_RESULT__T12, oldT12, newT12);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT12(TypeExpression newT12)
  {
    if (newT12 != t12)
    {
      NotificationChain msgs = null;
      if (t12 != null)
        msgs = ((InternalEObject)t12).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.TYPE_RESULT__T12, null, msgs);
      if (newT12 != null)
        msgs = ((InternalEObject)newT12).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.TYPE_RESULT__T12, null, msgs);
      msgs = basicSetT12(newT12, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_RESULT__T12, newT12, newT12));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeExpression> getT13()
  {
    if (t13 == null)
    {
      t13 = new EObjectContainmentEList<TypeExpression>(TypeExpression.class, this, EditorPackage.TYPE_RESULT__T13);
    }
    return t13;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeNameOrFunctionCall getT15()
  {
    return t15;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetT15(TypeNameOrFunctionCall newT15, NotificationChain msgs)
  {
    TypeNameOrFunctionCall oldT15 = t15;
    t15 = newT15;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_RESULT__T15, oldT15, newT15);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT15(TypeNameOrFunctionCall newT15)
  {
    if (newT15 != t15)
    {
      NotificationChain msgs = null;
      if (t15 != null)
        msgs = ((InternalEObject)t15).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.TYPE_RESULT__T15, null, msgs);
      if (newT15 != null)
        msgs = ((InternalEObject)newT15).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.TYPE_RESULT__T15, null, msgs);
      msgs = basicSetT15(newT15, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_RESULT__T15, newT15, newT15));
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
      case EditorPackage.TYPE_RESULT__T:
        return basicSetT(null, msgs);
      case EditorPackage.TYPE_RESULT__T7:
        return basicSetT7(null, msgs);
      case EditorPackage.TYPE_RESULT__T8:
        return ((InternalEList<?>)getT8()).basicRemove(otherEnd, msgs);
      case EditorPackage.TYPE_RESULT__T21:
        return ((InternalEList<?>)getT21()).basicRemove(otherEnd, msgs);
      case EditorPackage.TYPE_RESULT__T23:
        return ((InternalEList<?>)getT23()).basicRemove(otherEnd, msgs);
      case EditorPackage.TYPE_RESULT__T10:
        return basicSetT10(null, msgs);
      case EditorPackage.TYPE_RESULT__T11:
        return ((InternalEList<?>)getT11()).basicRemove(otherEnd, msgs);
      case EditorPackage.TYPE_RESULT__T24:
        return ((InternalEList<?>)getT24()).basicRemove(otherEnd, msgs);
      case EditorPackage.TYPE_RESULT__T26:
        return ((InternalEList<?>)getT26()).basicRemove(otherEnd, msgs);
      case EditorPackage.TYPE_RESULT__T12:
        return basicSetT12(null, msgs);
      case EditorPackage.TYPE_RESULT__T13:
        return ((InternalEList<?>)getT13()).basicRemove(otherEnd, msgs);
      case EditorPackage.TYPE_RESULT__T15:
        return basicSetT15(null, msgs);
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
      case EditorPackage.TYPE_RESULT__T:
        return getT();
      case EditorPackage.TYPE_RESULT__T2:
        return getT2();
      case EditorPackage.TYPE_RESULT__TYNAME:
        return getTyname();
      case EditorPackage.TYPE_RESULT__T7:
        return getT7();
      case EditorPackage.TYPE_RESULT__T8:
        return getT8();
      case EditorPackage.TYPE_RESULT__T21:
        return getT21();
      case EditorPackage.TYPE_RESULT__T23:
        return getT23();
      case EditorPackage.TYPE_RESULT__T10:
        return getT10();
      case EditorPackage.TYPE_RESULT__T11:
        return getT11();
      case EditorPackage.TYPE_RESULT__T24:
        return getT24();
      case EditorPackage.TYPE_RESULT__T26:
        return getT26();
      case EditorPackage.TYPE_RESULT__T12:
        return getT12();
      case EditorPackage.TYPE_RESULT__T13:
        return getT13();
      case EditorPackage.TYPE_RESULT__T15:
        return getT15();
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
      case EditorPackage.TYPE_RESULT__T:
        setT((TypeLiteral)newValue);
        return;
      case EditorPackage.TYPE_RESULT__T2:
        setT2((String)newValue);
        return;
      case EditorPackage.TYPE_RESULT__TYNAME:
        setTyname((String)newValue);
        return;
      case EditorPackage.TYPE_RESULT__T7:
        setT7((TypeExpression)newValue);
        return;
      case EditorPackage.TYPE_RESULT__T8:
        getT8().clear();
        getT8().addAll((Collection<? extends TypeExpression>)newValue);
        return;
      case EditorPackage.TYPE_RESULT__T21:
        getT21().clear();
        getT21().addAll((Collection<? extends TypeExpression>)newValue);
        return;
      case EditorPackage.TYPE_RESULT__T23:
        getT23().clear();
        getT23().addAll((Collection<? extends TypeExpression>)newValue);
        return;
      case EditorPackage.TYPE_RESULT__T10:
        setT10((TypeExpression)newValue);
        return;
      case EditorPackage.TYPE_RESULT__T11:
        getT11().clear();
        getT11().addAll((Collection<? extends TypeExpression>)newValue);
        return;
      case EditorPackage.TYPE_RESULT__T24:
        getT24().clear();
        getT24().addAll((Collection<? extends TypeExpression>)newValue);
        return;
      case EditorPackage.TYPE_RESULT__T26:
        getT26().clear();
        getT26().addAll((Collection<? extends TypeExpression>)newValue);
        return;
      case EditorPackage.TYPE_RESULT__T12:
        setT12((TypeExpression)newValue);
        return;
      case EditorPackage.TYPE_RESULT__T13:
        getT13().clear();
        getT13().addAll((Collection<? extends TypeExpression>)newValue);
        return;
      case EditorPackage.TYPE_RESULT__T15:
        setT15((TypeNameOrFunctionCall)newValue);
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
      case EditorPackage.TYPE_RESULT__T:
        setT((TypeLiteral)null);
        return;
      case EditorPackage.TYPE_RESULT__T2:
        setT2(T2_EDEFAULT);
        return;
      case EditorPackage.TYPE_RESULT__TYNAME:
        setTyname(TYNAME_EDEFAULT);
        return;
      case EditorPackage.TYPE_RESULT__T7:
        setT7((TypeExpression)null);
        return;
      case EditorPackage.TYPE_RESULT__T8:
        getT8().clear();
        return;
      case EditorPackage.TYPE_RESULT__T21:
        getT21().clear();
        return;
      case EditorPackage.TYPE_RESULT__T23:
        getT23().clear();
        return;
      case EditorPackage.TYPE_RESULT__T10:
        setT10((TypeExpression)null);
        return;
      case EditorPackage.TYPE_RESULT__T11:
        getT11().clear();
        return;
      case EditorPackage.TYPE_RESULT__T24:
        getT24().clear();
        return;
      case EditorPackage.TYPE_RESULT__T26:
        getT26().clear();
        return;
      case EditorPackage.TYPE_RESULT__T12:
        setT12((TypeExpression)null);
        return;
      case EditorPackage.TYPE_RESULT__T13:
        getT13().clear();
        return;
      case EditorPackage.TYPE_RESULT__T15:
        setT15((TypeNameOrFunctionCall)null);
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
      case EditorPackage.TYPE_RESULT__T:
        return t != null;
      case EditorPackage.TYPE_RESULT__T2:
        return T2_EDEFAULT == null ? t2 != null : !T2_EDEFAULT.equals(t2);
      case EditorPackage.TYPE_RESULT__TYNAME:
        return TYNAME_EDEFAULT == null ? tyname != null : !TYNAME_EDEFAULT.equals(tyname);
      case EditorPackage.TYPE_RESULT__T7:
        return t7 != null;
      case EditorPackage.TYPE_RESULT__T8:
        return t8 != null && !t8.isEmpty();
      case EditorPackage.TYPE_RESULT__T21:
        return t21 != null && !t21.isEmpty();
      case EditorPackage.TYPE_RESULT__T23:
        return t23 != null && !t23.isEmpty();
      case EditorPackage.TYPE_RESULT__T10:
        return t10 != null;
      case EditorPackage.TYPE_RESULT__T11:
        return t11 != null && !t11.isEmpty();
      case EditorPackage.TYPE_RESULT__T24:
        return t24 != null && !t24.isEmpty();
      case EditorPackage.TYPE_RESULT__T26:
        return t26 != null && !t26.isEmpty();
      case EditorPackage.TYPE_RESULT__T12:
        return t12 != null;
      case EditorPackage.TYPE_RESULT__T13:
        return t13 != null && !t13.isEmpty();
      case EditorPackage.TYPE_RESULT__T15:
        return t15 != null;
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
    result.append(" (t2: ");
    result.append(t2);
    result.append(", tyname: ");
    result.append(tyname);
    result.append(')');
    return result.toString();
  }

} //TypeResultImpl
