/**
 */
package com.euclideanspace.aldor.editor.impl;

import com.euclideanspace.aldor.editor.EditorPackage;
import com.euclideanspace.aldor.editor.TypeArguments;
import com.euclideanspace.aldor.editor.TypeExpression;
import com.euclideanspace.aldor.editor.TypeResult;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.TypeExpressionImpl#getT2 <em>T2</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.TypeExpressionImpl#getT3 <em>T3</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.TypeExpressionImpl#getT92 <em>T92</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.TypeExpressionImpl#getT93 <em>T93</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeExpressionImpl extends MinimalEObjectImpl.Container implements TypeExpression
{
  /**
   * The cached value of the '{@link #getT2() <em>T2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT2()
   * @generated
   * @ordered
   */
  protected TypeArguments t2;

  /**
   * The cached value of the '{@link #getT3() <em>T3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT3()
   * @generated
   * @ordered
   */
  protected TypeResult t3;

  /**
   * The cached value of the '{@link #getT92() <em>T92</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT92()
   * @generated
   * @ordered
   */
  protected TypeArguments t92;

  /**
   * The cached value of the '{@link #getT93() <em>T93</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT93()
   * @generated
   * @ordered
   */
  protected TypeResult t93;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypeExpressionImpl()
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
    return EditorPackage.Literals.TYPE_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeArguments getT2()
  {
    return t2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetT2(TypeArguments newT2, NotificationChain msgs)
  {
    TypeArguments oldT2 = t2;
    t2 = newT2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_EXPRESSION__T2, oldT2, newT2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT2(TypeArguments newT2)
  {
    if (newT2 != t2)
    {
      NotificationChain msgs = null;
      if (t2 != null)
        msgs = ((InternalEObject)t2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.TYPE_EXPRESSION__T2, null, msgs);
      if (newT2 != null)
        msgs = ((InternalEObject)newT2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.TYPE_EXPRESSION__T2, null, msgs);
      msgs = basicSetT2(newT2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_EXPRESSION__T2, newT2, newT2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeResult getT3()
  {
    return t3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetT3(TypeResult newT3, NotificationChain msgs)
  {
    TypeResult oldT3 = t3;
    t3 = newT3;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_EXPRESSION__T3, oldT3, newT3);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT3(TypeResult newT3)
  {
    if (newT3 != t3)
    {
      NotificationChain msgs = null;
      if (t3 != null)
        msgs = ((InternalEObject)t3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.TYPE_EXPRESSION__T3, null, msgs);
      if (newT3 != null)
        msgs = ((InternalEObject)newT3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.TYPE_EXPRESSION__T3, null, msgs);
      msgs = basicSetT3(newT3, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_EXPRESSION__T3, newT3, newT3));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeArguments getT92()
  {
    return t92;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetT92(TypeArguments newT92, NotificationChain msgs)
  {
    TypeArguments oldT92 = t92;
    t92 = newT92;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_EXPRESSION__T92, oldT92, newT92);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT92(TypeArguments newT92)
  {
    if (newT92 != t92)
    {
      NotificationChain msgs = null;
      if (t92 != null)
        msgs = ((InternalEObject)t92).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.TYPE_EXPRESSION__T92, null, msgs);
      if (newT92 != null)
        msgs = ((InternalEObject)newT92).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.TYPE_EXPRESSION__T92, null, msgs);
      msgs = basicSetT92(newT92, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_EXPRESSION__T92, newT92, newT92));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeResult getT93()
  {
    return t93;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetT93(TypeResult newT93, NotificationChain msgs)
  {
    TypeResult oldT93 = t93;
    t93 = newT93;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_EXPRESSION__T93, oldT93, newT93);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT93(TypeResult newT93)
  {
    if (newT93 != t93)
    {
      NotificationChain msgs = null;
      if (t93 != null)
        msgs = ((InternalEObject)t93).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.TYPE_EXPRESSION__T93, null, msgs);
      if (newT93 != null)
        msgs = ((InternalEObject)newT93).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.TYPE_EXPRESSION__T93, null, msgs);
      msgs = basicSetT93(newT93, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_EXPRESSION__T93, newT93, newT93));
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
      case EditorPackage.TYPE_EXPRESSION__T2:
        return basicSetT2(null, msgs);
      case EditorPackage.TYPE_EXPRESSION__T3:
        return basicSetT3(null, msgs);
      case EditorPackage.TYPE_EXPRESSION__T92:
        return basicSetT92(null, msgs);
      case EditorPackage.TYPE_EXPRESSION__T93:
        return basicSetT93(null, msgs);
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
      case EditorPackage.TYPE_EXPRESSION__T2:
        return getT2();
      case EditorPackage.TYPE_EXPRESSION__T3:
        return getT3();
      case EditorPackage.TYPE_EXPRESSION__T92:
        return getT92();
      case EditorPackage.TYPE_EXPRESSION__T93:
        return getT93();
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
      case EditorPackage.TYPE_EXPRESSION__T2:
        setT2((TypeArguments)newValue);
        return;
      case EditorPackage.TYPE_EXPRESSION__T3:
        setT3((TypeResult)newValue);
        return;
      case EditorPackage.TYPE_EXPRESSION__T92:
        setT92((TypeArguments)newValue);
        return;
      case EditorPackage.TYPE_EXPRESSION__T93:
        setT93((TypeResult)newValue);
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
      case EditorPackage.TYPE_EXPRESSION__T2:
        setT2((TypeArguments)null);
        return;
      case EditorPackage.TYPE_EXPRESSION__T3:
        setT3((TypeResult)null);
        return;
      case EditorPackage.TYPE_EXPRESSION__T92:
        setT92((TypeArguments)null);
        return;
      case EditorPackage.TYPE_EXPRESSION__T93:
        setT93((TypeResult)null);
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
      case EditorPackage.TYPE_EXPRESSION__T2:
        return t2 != null;
      case EditorPackage.TYPE_EXPRESSION__T3:
        return t3 != null;
      case EditorPackage.TYPE_EXPRESSION__T92:
        return t92 != null;
      case EditorPackage.TYPE_EXPRESSION__T93:
        return t93 != null;
    }
    return super.eIsSet(featureID);
  }

} //TypeExpressionImpl
