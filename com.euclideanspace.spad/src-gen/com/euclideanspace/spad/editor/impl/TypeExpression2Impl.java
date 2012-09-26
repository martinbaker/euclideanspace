/**
 */
package com.euclideanspace.spad.editor.impl;

import com.euclideanspace.spad.editor.EditorPackage;
import com.euclideanspace.spad.editor.TypeArguments;
import com.euclideanspace.spad.editor.TypeExpression2;
import com.euclideanspace.spad.editor.TypeResult;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Expression2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.spad.editor.impl.TypeExpression2Impl#getT92 <em>T92</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.TypeExpression2Impl#getT93 <em>T93</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeExpression2Impl extends MinimalEObjectImpl.Container implements TypeExpression2
{
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
  protected TypeExpression2Impl()
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
    return EditorPackage.Literals.TYPE_EXPRESSION2;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_EXPRESSION2__T92, oldT92, newT92);
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
        msgs = ((InternalEObject)t92).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.TYPE_EXPRESSION2__T92, null, msgs);
      if (newT92 != null)
        msgs = ((InternalEObject)newT92).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.TYPE_EXPRESSION2__T92, null, msgs);
      msgs = basicSetT92(newT92, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_EXPRESSION2__T92, newT92, newT92));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_EXPRESSION2__T93, oldT93, newT93);
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
        msgs = ((InternalEObject)t93).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.TYPE_EXPRESSION2__T93, null, msgs);
      if (newT93 != null)
        msgs = ((InternalEObject)newT93).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.TYPE_EXPRESSION2__T93, null, msgs);
      msgs = basicSetT93(newT93, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_EXPRESSION2__T93, newT93, newT93));
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
      case EditorPackage.TYPE_EXPRESSION2__T92:
        return basicSetT92(null, msgs);
      case EditorPackage.TYPE_EXPRESSION2__T93:
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
      case EditorPackage.TYPE_EXPRESSION2__T92:
        return getT92();
      case EditorPackage.TYPE_EXPRESSION2__T93:
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
      case EditorPackage.TYPE_EXPRESSION2__T92:
        setT92((TypeArguments)newValue);
        return;
      case EditorPackage.TYPE_EXPRESSION2__T93:
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
      case EditorPackage.TYPE_EXPRESSION2__T92:
        setT92((TypeArguments)null);
        return;
      case EditorPackage.TYPE_EXPRESSION2__T93:
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
      case EditorPackage.TYPE_EXPRESSION2__T92:
        return t92 != null;
      case EditorPackage.TYPE_EXPRESSION2__T93:
        return t93 != null;
    }
    return super.eIsSet(featureID);
  }

} //TypeExpression2Impl
