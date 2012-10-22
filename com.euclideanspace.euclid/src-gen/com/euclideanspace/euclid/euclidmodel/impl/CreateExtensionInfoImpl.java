/**
 */
package com.euclideanspace.euclid.euclidmodel.impl;

import com.euclideanspace.euclid.euclidmodel.CreateExtensionInfo;
import com.euclideanspace.euclid.euclidmodel.EuclidmodelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create Extension Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.euclid.euclidmodel.impl.CreateExtensionInfoImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.euclidmodel.impl.CreateExtensionInfoImpl#getCreateExpression <em>Create Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CreateExtensionInfoImpl extends MinimalEObjectImpl.Container implements CreateExtensionInfo
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getCreateExpression() <em>Create Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCreateExpression()
   * @generated
   * @ordered
   */
  protected XExpression createExpression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CreateExtensionInfoImpl()
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
    return EuclidmodelPackage.Literals.CREATE_EXTENSION_INFO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EuclidmodelPackage.CREATE_EXTENSION_INFO__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression getCreateExpression()
  {
    return createExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCreateExpression(XExpression newCreateExpression, NotificationChain msgs)
  {
    XExpression oldCreateExpression = createExpression;
    createExpression = newCreateExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EuclidmodelPackage.CREATE_EXTENSION_INFO__CREATE_EXPRESSION, oldCreateExpression, newCreateExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCreateExpression(XExpression newCreateExpression)
  {
    if (newCreateExpression != createExpression)
    {
      NotificationChain msgs = null;
      if (createExpression != null)
        msgs = ((InternalEObject)createExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EuclidmodelPackage.CREATE_EXTENSION_INFO__CREATE_EXPRESSION, null, msgs);
      if (newCreateExpression != null)
        msgs = ((InternalEObject)newCreateExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EuclidmodelPackage.CREATE_EXTENSION_INFO__CREATE_EXPRESSION, null, msgs);
      msgs = basicSetCreateExpression(newCreateExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EuclidmodelPackage.CREATE_EXTENSION_INFO__CREATE_EXPRESSION, newCreateExpression, newCreateExpression));
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
      case EuclidmodelPackage.CREATE_EXTENSION_INFO__CREATE_EXPRESSION:
        return basicSetCreateExpression(null, msgs);
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
      case EuclidmodelPackage.CREATE_EXTENSION_INFO__NAME:
        return getName();
      case EuclidmodelPackage.CREATE_EXTENSION_INFO__CREATE_EXPRESSION:
        return getCreateExpression();
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
      case EuclidmodelPackage.CREATE_EXTENSION_INFO__NAME:
        setName((String)newValue);
        return;
      case EuclidmodelPackage.CREATE_EXTENSION_INFO__CREATE_EXPRESSION:
        setCreateExpression((XExpression)newValue);
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
      case EuclidmodelPackage.CREATE_EXTENSION_INFO__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EuclidmodelPackage.CREATE_EXTENSION_INFO__CREATE_EXPRESSION:
        setCreateExpression((XExpression)null);
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
      case EuclidmodelPackage.CREATE_EXTENSION_INFO__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EuclidmodelPackage.CREATE_EXTENSION_INFO__CREATE_EXPRESSION:
        return createExpression != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //CreateExtensionInfoImpl
