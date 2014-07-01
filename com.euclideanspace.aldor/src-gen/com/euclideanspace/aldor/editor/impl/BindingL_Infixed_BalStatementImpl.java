/**
 */
package com.euclideanspace.aldor.editor.impl;

import com.euclideanspace.aldor.editor.BindingL_Infixed_BalStatement;
import com.euclideanspace.aldor.editor.EditorPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding LInfixed Bal Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.BindingL_Infixed_BalStatementImpl#getBib <em>Bib</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BindingL_Infixed_BalStatementImpl extends Binding_BalStatementImpl implements BindingL_Infixed_BalStatement
{
  /**
   * The cached value of the '{@link #getBib() <em>Bib</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBib()
   * @generated
   * @ordered
   */
  protected BindingL_Infixed_BalStatement bib;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BindingL_Infixed_BalStatementImpl()
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
    return EditorPackage.Literals.BINDING_LINFIXED_BAL_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BindingL_Infixed_BalStatement getBib()
  {
    return bib;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBib(BindingL_Infixed_BalStatement newBib, NotificationChain msgs)
  {
    BindingL_Infixed_BalStatement oldBib = bib;
    bib = newBib;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.BINDING_LINFIXED_BAL_STATEMENT__BIB, oldBib, newBib);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBib(BindingL_Infixed_BalStatement newBib)
  {
    if (newBib != bib)
    {
      NotificationChain msgs = null;
      if (bib != null)
        msgs = ((InternalEObject)bib).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.BINDING_LINFIXED_BAL_STATEMENT__BIB, null, msgs);
      if (newBib != null)
        msgs = ((InternalEObject)newBib).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.BINDING_LINFIXED_BAL_STATEMENT__BIB, null, msgs);
      msgs = basicSetBib(newBib, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.BINDING_LINFIXED_BAL_STATEMENT__BIB, newBib, newBib));
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
      case EditorPackage.BINDING_LINFIXED_BAL_STATEMENT__BIB:
        return basicSetBib(null, msgs);
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
      case EditorPackage.BINDING_LINFIXED_BAL_STATEMENT__BIB:
        return getBib();
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
      case EditorPackage.BINDING_LINFIXED_BAL_STATEMENT__BIB:
        setBib((BindingL_Infixed_BalStatement)newValue);
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
      case EditorPackage.BINDING_LINFIXED_BAL_STATEMENT__BIB:
        setBib((BindingL_Infixed_BalStatement)null);
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
      case EditorPackage.BINDING_LINFIXED_BAL_STATEMENT__BIB:
        return bib != null;
    }
    return super.eIsSet(featureID);
  }

} //BindingL_Infixed_BalStatementImpl
