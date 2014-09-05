/**
 */
package com.euclideanspace.aldor.editor.impl;

import com.euclideanspace.aldor.editor.DeclarationDefine;
import com.euclideanspace.aldor.editor.EditorPackage;
import com.euclideanspace.aldor.editor.Sig;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Declaration Define</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.DeclarationDefineImpl#getSi <em>Si</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeclarationDefineImpl extends DeclarationImpl implements DeclarationDefine
{
  /**
   * The cached value of the '{@link #getSi() <em>Si</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSi()
   * @generated
   * @ordered
   */
  protected Sig si;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeclarationDefineImpl()
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
    return EditorPackage.Literals.DECLARATION_DEFINE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Sig getSi()
  {
    return si;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSi(Sig newSi, NotificationChain msgs)
  {
    Sig oldSi = si;
    si = newSi;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.DECLARATION_DEFINE__SI, oldSi, newSi);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSi(Sig newSi)
  {
    if (newSi != si)
    {
      NotificationChain msgs = null;
      if (si != null)
        msgs = ((InternalEObject)si).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.DECLARATION_DEFINE__SI, null, msgs);
      if (newSi != null)
        msgs = ((InternalEObject)newSi).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.DECLARATION_DEFINE__SI, null, msgs);
      msgs = basicSetSi(newSi, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.DECLARATION_DEFINE__SI, newSi, newSi));
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
      case EditorPackage.DECLARATION_DEFINE__SI:
        return basicSetSi(null, msgs);
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
      case EditorPackage.DECLARATION_DEFINE__SI:
        return getSi();
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
      case EditorPackage.DECLARATION_DEFINE__SI:
        setSi((Sig)newValue);
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
      case EditorPackage.DECLARATION_DEFINE__SI:
        setSi((Sig)null);
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
      case EditorPackage.DECLARATION_DEFINE__SI:
        return si != null;
    }
    return super.eIsSet(featureID);
  }

} //DeclarationDefineImpl
