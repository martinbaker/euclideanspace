/**
 */
package com.euclideanspace.aldor.editor.impl;

import com.euclideanspace.aldor.editor.BindingL_Infixed_Collection;
import com.euclideanspace.aldor.editor.EditorPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding LInfixed Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.BindingL_Infixed_CollectionImpl#getBic <em>Bic</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BindingL_Infixed_CollectionImpl extends Binding_CollectionImpl implements BindingL_Infixed_Collection
{
  /**
   * The cached value of the '{@link #getBic() <em>Bic</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBic()
   * @generated
   * @ordered
   */
  protected BindingL_Infixed_Collection bic;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BindingL_Infixed_CollectionImpl()
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
    return EditorPackage.Literals.BINDING_LINFIXED_COLLECTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BindingL_Infixed_Collection getBic()
  {
    return bic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBic(BindingL_Infixed_Collection newBic, NotificationChain msgs)
  {
    BindingL_Infixed_Collection oldBic = bic;
    bic = newBic;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.BINDING_LINFIXED_COLLECTION__BIC, oldBic, newBic);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBic(BindingL_Infixed_Collection newBic)
  {
    if (newBic != bic)
    {
      NotificationChain msgs = null;
      if (bic != null)
        msgs = ((InternalEObject)bic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.BINDING_LINFIXED_COLLECTION__BIC, null, msgs);
      if (newBic != null)
        msgs = ((InternalEObject)newBic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.BINDING_LINFIXED_COLLECTION__BIC, null, msgs);
      msgs = basicSetBic(newBic, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.BINDING_LINFIXED_COLLECTION__BIC, newBic, newBic));
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
      case EditorPackage.BINDING_LINFIXED_COLLECTION__BIC:
        return basicSetBic(null, msgs);
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
      case EditorPackage.BINDING_LINFIXED_COLLECTION__BIC:
        return getBic();
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
      case EditorPackage.BINDING_LINFIXED_COLLECTION__BIC:
        setBic((BindingL_Infixed_Collection)newValue);
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
      case EditorPackage.BINDING_LINFIXED_COLLECTION__BIC:
        setBic((BindingL_Infixed_Collection)null);
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
      case EditorPackage.BINDING_LINFIXED_COLLECTION__BIC:
        return bic != null;
    }
    return super.eIsSet(featureID);
  }

} //BindingL_Infixed_CollectionImpl
