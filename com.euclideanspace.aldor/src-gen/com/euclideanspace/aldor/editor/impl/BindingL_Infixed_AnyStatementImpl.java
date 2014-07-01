/**
 */
package com.euclideanspace.aldor.editor.impl;

import com.euclideanspace.aldor.editor.BindingL_Infixed_AnyStatement;
import com.euclideanspace.aldor.editor.EditorPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding LInfixed Any Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.BindingL_Infixed_AnyStatementImpl#getBia <em>Bia</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BindingL_Infixed_AnyStatementImpl extends Binding_AnyStatementImpl implements BindingL_Infixed_AnyStatement
{
  /**
   * The cached value of the '{@link #getBia() <em>Bia</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBia()
   * @generated
   * @ordered
   */
  protected BindingL_Infixed_AnyStatement bia;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BindingL_Infixed_AnyStatementImpl()
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
    return EditorPackage.Literals.BINDING_LINFIXED_ANY_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BindingL_Infixed_AnyStatement getBia()
  {
    return bia;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBia(BindingL_Infixed_AnyStatement newBia, NotificationChain msgs)
  {
    BindingL_Infixed_AnyStatement oldBia = bia;
    bia = newBia;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.BINDING_LINFIXED_ANY_STATEMENT__BIA, oldBia, newBia);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBia(BindingL_Infixed_AnyStatement newBia)
  {
    if (newBia != bia)
    {
      NotificationChain msgs = null;
      if (bia != null)
        msgs = ((InternalEObject)bia).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.BINDING_LINFIXED_ANY_STATEMENT__BIA, null, msgs);
      if (newBia != null)
        msgs = ((InternalEObject)newBia).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.BINDING_LINFIXED_ANY_STATEMENT__BIA, null, msgs);
      msgs = basicSetBia(newBia, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.BINDING_LINFIXED_ANY_STATEMENT__BIA, newBia, newBia));
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
      case EditorPackage.BINDING_LINFIXED_ANY_STATEMENT__BIA:
        return basicSetBia(null, msgs);
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
      case EditorPackage.BINDING_LINFIXED_ANY_STATEMENT__BIA:
        return getBia();
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
      case EditorPackage.BINDING_LINFIXED_ANY_STATEMENT__BIA:
        setBia((BindingL_Infixed_AnyStatement)newValue);
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
      case EditorPackage.BINDING_LINFIXED_ANY_STATEMENT__BIA:
        setBia((BindingL_Infixed_AnyStatement)null);
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
      case EditorPackage.BINDING_LINFIXED_ANY_STATEMENT__BIA:
        return bia != null;
    }
    return super.eIsSet(featureID);
  }

} //BindingL_Infixed_AnyStatementImpl
