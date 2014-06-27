/**
 */
package com.euclideanspace.aldor.editor.impl;

import com.euclideanspace.aldor.editor.EditorPackage;
import com.euclideanspace.aldor.editor.Expr;
import com.euclideanspace.aldor.editor.NameOrFunctionCall;
import com.euclideanspace.aldor.editor.PrimaryPrefix;
import com.euclideanspace.aldor.editor.TypeExpression;

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
 * An implementation of the model object '<em><b>Primary Prefix</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.PrimaryPrefixImpl#getT4 <em>T4</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.PrimaryPrefixImpl#getT25 <em>T25</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.PrimaryPrefixImpl#getRightType3 <em>Right Type3</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.PrimaryPrefixImpl#getT7 <em>T7</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrimaryPrefixImpl extends ExprImpl implements PrimaryPrefix
{
  /**
   * The cached value of the '{@link #getT4() <em>T4</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT4()
   * @generated
   * @ordered
   */
  protected Expr t4;

  /**
   * The cached value of the '{@link #getT25() <em>T25</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT25()
   * @generated
   * @ordered
   */
  protected EList<Expr> t25;

  /**
   * The cached value of the '{@link #getRightType3() <em>Right Type3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRightType3()
   * @generated
   * @ordered
   */
  protected TypeExpression rightType3;

  /**
   * The cached value of the '{@link #getT7() <em>T7</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT7()
   * @generated
   * @ordered
   */
  protected NameOrFunctionCall t7;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PrimaryPrefixImpl()
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
    return EditorPackage.Literals.PRIMARY_PREFIX;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getT4()
  {
    return t4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetT4(Expr newT4, NotificationChain msgs)
  {
    Expr oldT4 = t4;
    t4 = newT4;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.PRIMARY_PREFIX__T4, oldT4, newT4);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT4(Expr newT4)
  {
    if (newT4 != t4)
    {
      NotificationChain msgs = null;
      if (t4 != null)
        msgs = ((InternalEObject)t4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.PRIMARY_PREFIX__T4, null, msgs);
      if (newT4 != null)
        msgs = ((InternalEObject)newT4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.PRIMARY_PREFIX__T4, null, msgs);
      msgs = basicSetT4(newT4, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.PRIMARY_PREFIX__T4, newT4, newT4));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expr> getT25()
  {
    if (t25 == null)
    {
      t25 = new EObjectContainmentEList<Expr>(Expr.class, this, EditorPackage.PRIMARY_PREFIX__T25);
    }
    return t25;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeExpression getRightType3()
  {
    return rightType3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRightType3(TypeExpression newRightType3, NotificationChain msgs)
  {
    TypeExpression oldRightType3 = rightType3;
    rightType3 = newRightType3;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.PRIMARY_PREFIX__RIGHT_TYPE3, oldRightType3, newRightType3);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRightType3(TypeExpression newRightType3)
  {
    if (newRightType3 != rightType3)
    {
      NotificationChain msgs = null;
      if (rightType3 != null)
        msgs = ((InternalEObject)rightType3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.PRIMARY_PREFIX__RIGHT_TYPE3, null, msgs);
      if (newRightType3 != null)
        msgs = ((InternalEObject)newRightType3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.PRIMARY_PREFIX__RIGHT_TYPE3, null, msgs);
      msgs = basicSetRightType3(newRightType3, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.PRIMARY_PREFIX__RIGHT_TYPE3, newRightType3, newRightType3));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NameOrFunctionCall getT7()
  {
    return t7;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetT7(NameOrFunctionCall newT7, NotificationChain msgs)
  {
    NameOrFunctionCall oldT7 = t7;
    t7 = newT7;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.PRIMARY_PREFIX__T7, oldT7, newT7);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT7(NameOrFunctionCall newT7)
  {
    if (newT7 != t7)
    {
      NotificationChain msgs = null;
      if (t7 != null)
        msgs = ((InternalEObject)t7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.PRIMARY_PREFIX__T7, null, msgs);
      if (newT7 != null)
        msgs = ((InternalEObject)newT7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.PRIMARY_PREFIX__T7, null, msgs);
      msgs = basicSetT7(newT7, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.PRIMARY_PREFIX__T7, newT7, newT7));
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
      case EditorPackage.PRIMARY_PREFIX__T4:
        return basicSetT4(null, msgs);
      case EditorPackage.PRIMARY_PREFIX__T25:
        return ((InternalEList<?>)getT25()).basicRemove(otherEnd, msgs);
      case EditorPackage.PRIMARY_PREFIX__RIGHT_TYPE3:
        return basicSetRightType3(null, msgs);
      case EditorPackage.PRIMARY_PREFIX__T7:
        return basicSetT7(null, msgs);
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
      case EditorPackage.PRIMARY_PREFIX__T4:
        return getT4();
      case EditorPackage.PRIMARY_PREFIX__T25:
        return getT25();
      case EditorPackage.PRIMARY_PREFIX__RIGHT_TYPE3:
        return getRightType3();
      case EditorPackage.PRIMARY_PREFIX__T7:
        return getT7();
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
      case EditorPackage.PRIMARY_PREFIX__T4:
        setT4((Expr)newValue);
        return;
      case EditorPackage.PRIMARY_PREFIX__T25:
        getT25().clear();
        getT25().addAll((Collection<? extends Expr>)newValue);
        return;
      case EditorPackage.PRIMARY_PREFIX__RIGHT_TYPE3:
        setRightType3((TypeExpression)newValue);
        return;
      case EditorPackage.PRIMARY_PREFIX__T7:
        setT7((NameOrFunctionCall)newValue);
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
      case EditorPackage.PRIMARY_PREFIX__T4:
        setT4((Expr)null);
        return;
      case EditorPackage.PRIMARY_PREFIX__T25:
        getT25().clear();
        return;
      case EditorPackage.PRIMARY_PREFIX__RIGHT_TYPE3:
        setRightType3((TypeExpression)null);
        return;
      case EditorPackage.PRIMARY_PREFIX__T7:
        setT7((NameOrFunctionCall)null);
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
      case EditorPackage.PRIMARY_PREFIX__T4:
        return t4 != null;
      case EditorPackage.PRIMARY_PREFIX__T25:
        return t25 != null && !t25.isEmpty();
      case EditorPackage.PRIMARY_PREFIX__RIGHT_TYPE3:
        return rightType3 != null;
      case EditorPackage.PRIMARY_PREFIX__T7:
        return t7 != null;
    }
    return super.eIsSet(featureID);
  }

} //PrimaryPrefixImpl
