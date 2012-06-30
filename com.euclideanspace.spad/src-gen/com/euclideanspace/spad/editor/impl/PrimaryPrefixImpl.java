/**
 */
package com.euclideanspace.spad.editor.impl;

import com.euclideanspace.spad.editor.EditorPackage;
import com.euclideanspace.spad.editor.Expr;
import com.euclideanspace.spad.editor.NameOrFunctionCall;
import com.euclideanspace.spad.editor.PrimaryPrefix;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primary Prefix</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.spad.editor.impl.PrimaryPrefixImpl#getT4 <em>T4</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.PrimaryPrefixImpl#getT7 <em>T7</em>}</li>
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
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EditorPackage.PRIMARY_PREFIX__T4:
        setT4((Expr)newValue);
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
      case EditorPackage.PRIMARY_PREFIX__T7:
        return t7 != null;
    }
    return super.eIsSet(featureID);
  }

} //PrimaryPrefixImpl
