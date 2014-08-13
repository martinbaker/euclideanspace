/**
 */
package com.euclideanspace.aldor.editor.impl;

import com.euclideanspace.aldor.editor.EditorPackage;
import com.euclideanspace.aldor.editor.LeftJuxtaposed;
import com.euclideanspace.aldor.editor.QualTail;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Left Juxtaposed</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.LeftJuxtaposedImpl#getQt <em>Qt</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LeftJuxtaposedImpl extends QualTailImpl implements LeftJuxtaposed
{
  /**
   * The cached value of the '{@link #getQt() <em>Qt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQt()
   * @generated
   * @ordered
   */
  protected QualTail qt;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LeftJuxtaposedImpl()
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
    return EditorPackage.Literals.LEFT_JUXTAPOSED;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QualTail getQt()
  {
    return qt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetQt(QualTail newQt, NotificationChain msgs)
  {
    QualTail oldQt = qt;
    qt = newQt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.LEFT_JUXTAPOSED__QT, oldQt, newQt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQt(QualTail newQt)
  {
    if (newQt != qt)
    {
      NotificationChain msgs = null;
      if (qt != null)
        msgs = ((InternalEObject)qt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.LEFT_JUXTAPOSED__QT, null, msgs);
      if (newQt != null)
        msgs = ((InternalEObject)newQt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.LEFT_JUXTAPOSED__QT, null, msgs);
      msgs = basicSetQt(newQt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.LEFT_JUXTAPOSED__QT, newQt, newQt));
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
      case EditorPackage.LEFT_JUXTAPOSED__QT:
        return basicSetQt(null, msgs);
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
      case EditorPackage.LEFT_JUXTAPOSED__QT:
        return getQt();
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
      case EditorPackage.LEFT_JUXTAPOSED__QT:
        setQt((QualTail)newValue);
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
      case EditorPackage.LEFT_JUXTAPOSED__QT:
        setQt((QualTail)null);
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
      case EditorPackage.LEFT_JUXTAPOSED__QT:
        return qt != null;
    }
    return super.eIsSet(featureID);
  }

} //LeftJuxtaposedImpl
