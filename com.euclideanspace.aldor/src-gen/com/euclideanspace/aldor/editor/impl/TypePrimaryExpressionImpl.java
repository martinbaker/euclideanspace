/**
 */
package com.euclideanspace.aldor.editor.impl;

import com.euclideanspace.aldor.editor.EditorPackage;
import com.euclideanspace.aldor.editor.TypeExpression;
import com.euclideanspace.aldor.editor.TypePrimaryExpression;

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
 * An implementation of the model object '<em><b>Type Primary Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.TypePrimaryExpressionImpl#getT32 <em>T32</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.TypePrimaryExpressionImpl#getTyname <em>Tyname</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.TypePrimaryExpressionImpl#getT5 <em>T5</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.TypePrimaryExpressionImpl#getT7 <em>T7</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.TypePrimaryExpressionImpl#getT8 <em>T8</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.TypePrimaryExpressionImpl#getT21 <em>T21</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.TypePrimaryExpressionImpl#getT23 <em>T23</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.TypePrimaryExpressionImpl#getT10 <em>T10</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.TypePrimaryExpressionImpl#getT11 <em>T11</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.TypePrimaryExpressionImpl#getT24 <em>T24</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.TypePrimaryExpressionImpl#getT26 <em>T26</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.TypePrimaryExpressionImpl#getT13 <em>T13</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.TypePrimaryExpressionImpl#getT14 <em>T14</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypePrimaryExpressionImpl extends TypeExpressionImpl implements TypePrimaryExpression
{
  /**
   * The default value of the '{@link #getT32() <em>T32</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT32()
   * @generated
   * @ordered
   */
  protected static final String T32_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getT32() <em>T32</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT32()
   * @generated
   * @ordered
   */
  protected String t32 = T32_EDEFAULT;

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
   * The cached value of the '{@link #getT5() <em>T5</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT5()
   * @generated
   * @ordered
   */
  protected TypeExpression t5;

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
   * The cached value of the '{@link #getT13() <em>T13</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT13()
   * @generated
   * @ordered
   */
  protected TypeExpression t13;

  /**
   * The cached value of the '{@link #getT14() <em>T14</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT14()
   * @generated
   * @ordered
   */
  protected EList<TypeExpression> t14;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypePrimaryExpressionImpl()
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
    return EditorPackage.Literals.TYPE_PRIMARY_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getT32()
  {
    return t32;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT32(String newT32)
  {
    String oldT32 = t32;
    t32 = newT32;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_PRIMARY_EXPRESSION__T32, oldT32, t32));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_PRIMARY_EXPRESSION__TYNAME, oldTyname, tyname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeExpression getT5()
  {
    return t5;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetT5(TypeExpression newT5, NotificationChain msgs)
  {
    TypeExpression oldT5 = t5;
    t5 = newT5;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_PRIMARY_EXPRESSION__T5, oldT5, newT5);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT5(TypeExpression newT5)
  {
    if (newT5 != t5)
    {
      NotificationChain msgs = null;
      if (t5 != null)
        msgs = ((InternalEObject)t5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.TYPE_PRIMARY_EXPRESSION__T5, null, msgs);
      if (newT5 != null)
        msgs = ((InternalEObject)newT5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.TYPE_PRIMARY_EXPRESSION__T5, null, msgs);
      msgs = basicSetT5(newT5, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_PRIMARY_EXPRESSION__T5, newT5, newT5));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_PRIMARY_EXPRESSION__T7, oldT7, newT7);
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
        msgs = ((InternalEObject)t7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.TYPE_PRIMARY_EXPRESSION__T7, null, msgs);
      if (newT7 != null)
        msgs = ((InternalEObject)newT7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.TYPE_PRIMARY_EXPRESSION__T7, null, msgs);
      msgs = basicSetT7(newT7, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_PRIMARY_EXPRESSION__T7, newT7, newT7));
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
      t8 = new EObjectContainmentEList<TypeExpression>(TypeExpression.class, this, EditorPackage.TYPE_PRIMARY_EXPRESSION__T8);
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
      t21 = new EObjectContainmentEList<TypeExpression>(TypeExpression.class, this, EditorPackage.TYPE_PRIMARY_EXPRESSION__T21);
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
      t23 = new EObjectContainmentEList<TypeExpression>(TypeExpression.class, this, EditorPackage.TYPE_PRIMARY_EXPRESSION__T23);
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_PRIMARY_EXPRESSION__T10, oldT10, newT10);
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
        msgs = ((InternalEObject)t10).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.TYPE_PRIMARY_EXPRESSION__T10, null, msgs);
      if (newT10 != null)
        msgs = ((InternalEObject)newT10).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.TYPE_PRIMARY_EXPRESSION__T10, null, msgs);
      msgs = basicSetT10(newT10, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_PRIMARY_EXPRESSION__T10, newT10, newT10));
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
      t11 = new EObjectContainmentEList<TypeExpression>(TypeExpression.class, this, EditorPackage.TYPE_PRIMARY_EXPRESSION__T11);
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
      t24 = new EObjectContainmentEList<TypeExpression>(TypeExpression.class, this, EditorPackage.TYPE_PRIMARY_EXPRESSION__T24);
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
      t26 = new EObjectContainmentEList<TypeExpression>(TypeExpression.class, this, EditorPackage.TYPE_PRIMARY_EXPRESSION__T26);
    }
    return t26;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeExpression getT13()
  {
    return t13;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetT13(TypeExpression newT13, NotificationChain msgs)
  {
    TypeExpression oldT13 = t13;
    t13 = newT13;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_PRIMARY_EXPRESSION__T13, oldT13, newT13);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT13(TypeExpression newT13)
  {
    if (newT13 != t13)
    {
      NotificationChain msgs = null;
      if (t13 != null)
        msgs = ((InternalEObject)t13).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.TYPE_PRIMARY_EXPRESSION__T13, null, msgs);
      if (newT13 != null)
        msgs = ((InternalEObject)newT13).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.TYPE_PRIMARY_EXPRESSION__T13, null, msgs);
      msgs = basicSetT13(newT13, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_PRIMARY_EXPRESSION__T13, newT13, newT13));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeExpression> getT14()
  {
    if (t14 == null)
    {
      t14 = new EObjectContainmentEList<TypeExpression>(TypeExpression.class, this, EditorPackage.TYPE_PRIMARY_EXPRESSION__T14);
    }
    return t14;
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
      case EditorPackage.TYPE_PRIMARY_EXPRESSION__T5:
        return basicSetT5(null, msgs);
      case EditorPackage.TYPE_PRIMARY_EXPRESSION__T7:
        return basicSetT7(null, msgs);
      case EditorPackage.TYPE_PRIMARY_EXPRESSION__T8:
        return ((InternalEList<?>)getT8()).basicRemove(otherEnd, msgs);
      case EditorPackage.TYPE_PRIMARY_EXPRESSION__T21:
        return ((InternalEList<?>)getT21()).basicRemove(otherEnd, msgs);
      case EditorPackage.TYPE_PRIMARY_EXPRESSION__T23:
        return ((InternalEList<?>)getT23()).basicRemove(otherEnd, msgs);
      case EditorPackage.TYPE_PRIMARY_EXPRESSION__T10:
        return basicSetT10(null, msgs);
      case EditorPackage.TYPE_PRIMARY_EXPRESSION__T11:
        return ((InternalEList<?>)getT11()).basicRemove(otherEnd, msgs);
      case EditorPackage.TYPE_PRIMARY_EXPRESSION__T24:
        return ((InternalEList<?>)getT24()).basicRemove(otherEnd, msgs);
      case EditorPackage.TYPE_PRIMARY_EXPRESSION__T26:
        return ((InternalEList<?>)getT26()).basicRemove(otherEnd, msgs);
      case EditorPackage.TYPE_PRIMARY_EXPRESSION__T13:
        return basicSetT13(null, msgs);
      case EditorPackage.TYPE_PRIMARY_EXPRESSION__T14:
        return ((InternalEList<?>)getT14()).basicRemove(otherEnd, msgs);
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
      case EditorPackage.TYPE_PRIMARY_EXPRESSION__T32:
        return getT32();
      case EditorPackage.TYPE_PRIMARY_EXPRESSION__TYNAME:
        return getTyname();
      case EditorPackage.TYPE_PRIMARY_EXPRESSION__T5:
        return getT5();
      case EditorPackage.TYPE_PRIMARY_EXPRESSION__T7:
        return getT7();
      case EditorPackage.TYPE_PRIMARY_EXPRESSION__T8:
        return getT8();
      case EditorPackage.TYPE_PRIMARY_EXPRESSION__T21:
        return getT21();
      case EditorPackage.TYPE_PRIMARY_EXPRESSION__T23:
        return getT23();
      case EditorPackage.TYPE_PRIMARY_EXPRESSION__T10:
        return getT10();
      case EditorPackage.TYPE_PRIMARY_EXPRESSION__T11:
        return getT11();
      case EditorPackage.TYPE_PRIMARY_EXPRESSION__T24:
        return getT24();
      case EditorPackage.TYPE_PRIMARY_EXPRESSION__T26:
        return getT26();
      case EditorPackage.TYPE_PRIMARY_EXPRESSION__T13:
        return getT13();
      case EditorPackage.TYPE_PRIMARY_EXPRESSION__T14:
        return getT14();
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
      case EditorPackage.TYPE_PRIMARY_EXPRESSION__T32:
        setT32((String)newValue);
        return;
      case EditorPackage.TYPE_PRIMARY_EXPRESSION__TYNAME:
        setTyname((String)newValue);
        return;
      case EditorPackage.TYPE_PRIMARY_EXPRESSION__T5:
        setT5((TypeExpression)newValue);
        return;
      case EditorPackage.TYPE_PRIMARY_EXPRESSION__T7:
        setT7((TypeExpression)newValue);
        return;
      case EditorPackage.TYPE_PRIMARY_EXPRESSION__T8:
        getT8().clear();
        getT8().addAll((Collection<? extends TypeExpression>)newValue);
        return;
      case EditorPackage.TYPE_PRIMARY_EXPRESSION__T21:
        getT21().clear();
        getT21().addAll((Collection<? extends TypeExpression>)newValue);
        return;
      case EditorPackage.TYPE_PRIMARY_EXPRESSION__T23:
        getT23().clear();
        getT23().addAll((Collection<? extends TypeExpression>)newValue);
        return;
      case EditorPackage.TYPE_PRIMARY_EXPRESSION__T10:
        setT10((TypeExpression)newValue);
        return;
      case EditorPackage.TYPE_PRIMARY_EXPRESSION__T11:
        getT11().clear();
        getT11().addAll((Collection<? extends TypeExpression>)newValue);
        return;
      case EditorPackage.TYPE_PRIMARY_EXPRESSION__T24:
        getT24().clear();
        getT24().addAll((Collection<? extends TypeExpression>)newValue);
        return;
      case EditorPackage.TYPE_PRIMARY_EXPRESSION__T26:
        getT26().clear();
        getT26().addAll((Collection<? extends TypeExpression>)newValue);
        return;
      case EditorPackage.TYPE_PRIMARY_EXPRESSION__T13:
        setT13((TypeExpression)newValue);
        return;
      case EditorPackage.TYPE_PRIMARY_EXPRESSION__T14:
        getT14().clear();
        getT14().addAll((Collection<? extends TypeExpression>)newValue);
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
      case EditorPackage.TYPE_PRIMARY_EXPRESSION__T32:
        setT32(T32_EDEFAULT);
        return;
      case EditorPackage.TYPE_PRIMARY_EXPRESSION__TYNAME:
        setTyname(TYNAME_EDEFAULT);
        return;
      case EditorPackage.TYPE_PRIMARY_EXPRESSION__T5:
        setT5((TypeExpression)null);
        return;
      case EditorPackage.TYPE_PRIMARY_EXPRESSION__T7:
        setT7((TypeExpression)null);
        return;
      case EditorPackage.TYPE_PRIMARY_EXPRESSION__T8:
        getT8().clear();
        return;
      case EditorPackage.TYPE_PRIMARY_EXPRESSION__T21:
        getT21().clear();
        return;
      case EditorPackage.TYPE_PRIMARY_EXPRESSION__T23:
        getT23().clear();
        return;
      case EditorPackage.TYPE_PRIMARY_EXPRESSION__T10:
        setT10((TypeExpression)null);
        return;
      case EditorPackage.TYPE_PRIMARY_EXPRESSION__T11:
        getT11().clear();
        return;
      case EditorPackage.TYPE_PRIMARY_EXPRESSION__T24:
        getT24().clear();
        return;
      case EditorPackage.TYPE_PRIMARY_EXPRESSION__T26:
        getT26().clear();
        return;
      case EditorPackage.TYPE_PRIMARY_EXPRESSION__T13:
        setT13((TypeExpression)null);
        return;
      case EditorPackage.TYPE_PRIMARY_EXPRESSION__T14:
        getT14().clear();
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
      case EditorPackage.TYPE_PRIMARY_EXPRESSION__T32:
        return T32_EDEFAULT == null ? t32 != null : !T32_EDEFAULT.equals(t32);
      case EditorPackage.TYPE_PRIMARY_EXPRESSION__TYNAME:
        return TYNAME_EDEFAULT == null ? tyname != null : !TYNAME_EDEFAULT.equals(tyname);
      case EditorPackage.TYPE_PRIMARY_EXPRESSION__T5:
        return t5 != null;
      case EditorPackage.TYPE_PRIMARY_EXPRESSION__T7:
        return t7 != null;
      case EditorPackage.TYPE_PRIMARY_EXPRESSION__T8:
        return t8 != null && !t8.isEmpty();
      case EditorPackage.TYPE_PRIMARY_EXPRESSION__T21:
        return t21 != null && !t21.isEmpty();
      case EditorPackage.TYPE_PRIMARY_EXPRESSION__T23:
        return t23 != null && !t23.isEmpty();
      case EditorPackage.TYPE_PRIMARY_EXPRESSION__T10:
        return t10 != null;
      case EditorPackage.TYPE_PRIMARY_EXPRESSION__T11:
        return t11 != null && !t11.isEmpty();
      case EditorPackage.TYPE_PRIMARY_EXPRESSION__T24:
        return t24 != null && !t24.isEmpty();
      case EditorPackage.TYPE_PRIMARY_EXPRESSION__T26:
        return t26 != null && !t26.isEmpty();
      case EditorPackage.TYPE_PRIMARY_EXPRESSION__T13:
        return t13 != null;
      case EditorPackage.TYPE_PRIMARY_EXPRESSION__T14:
        return t14 != null && !t14.isEmpty();
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
    result.append(" (t32: ");
    result.append(t32);
    result.append(", tyname: ");
    result.append(tyname);
    result.append(')');
    return result.toString();
  }

} //TypePrimaryExpressionImpl
