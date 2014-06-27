/**
 */
package com.euclideanspace.euclid.euclidmodel.impl;

import com.euclideanspace.euclid.euclidmodel.EuclidField;
import com.euclideanspace.euclid.euclidmodel.EuclidmodelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xtext.common.types.JvmTypeReference;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Euclid Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.euclid.euclidmodel.impl.EuclidFieldImpl#getType <em>Type</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.euclidmodel.impl.EuclidFieldImpl#isFinal <em>Final</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.euclidmodel.impl.EuclidFieldImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.euclidmodel.impl.EuclidFieldImpl#getInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.euclidmodel.impl.EuclidFieldImpl#isExtension <em>Extension</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.euclidmodel.impl.EuclidFieldImpl#isStatic <em>Static</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EuclidFieldImpl extends EuclidMemberImpl implements EuclidField
{
  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected JvmTypeReference type;

  /**
   * The default value of the '{@link #isFinal() <em>Final</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFinal()
   * @generated
   * @ordered
   */
  protected static final boolean FINAL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isFinal() <em>Final</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFinal()
   * @generated
   * @ordered
   */
  protected boolean final_ = FINAL_EDEFAULT;

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
   * The cached value of the '{@link #getInitialValue() <em>Initial Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitialValue()
   * @generated
   * @ordered
   */
  protected XExpression initialValue;

  /**
   * The default value of the '{@link #isExtension() <em>Extension</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isExtension()
   * @generated
   * @ordered
   */
  protected static final boolean EXTENSION_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isExtension() <em>Extension</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isExtension()
   * @generated
   * @ordered
   */
  protected boolean extension = EXTENSION_EDEFAULT;

  /**
   * The default value of the '{@link #isStatic() <em>Static</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isStatic()
   * @generated
   * @ordered
   */
  protected static final boolean STATIC_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isStatic() <em>Static</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isStatic()
   * @generated
   * @ordered
   */
  protected boolean static_ = STATIC_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EuclidFieldImpl()
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
    return EuclidmodelPackage.Literals.EUCLID_FIELD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmTypeReference getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(JvmTypeReference newType, NotificationChain msgs)
  {
    JvmTypeReference oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EuclidmodelPackage.EUCLID_FIELD__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(JvmTypeReference newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EuclidmodelPackage.EUCLID_FIELD__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EuclidmodelPackage.EUCLID_FIELD__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EuclidmodelPackage.EUCLID_FIELD__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isFinal()
  {
    return final_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFinal(boolean newFinal)
  {
    boolean oldFinal = final_;
    final_ = newFinal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EuclidmodelPackage.EUCLID_FIELD__FINAL, oldFinal, final_));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EuclidmodelPackage.EUCLID_FIELD__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression getInitialValue()
  {
    return initialValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInitialValue(XExpression newInitialValue, NotificationChain msgs)
  {
    XExpression oldInitialValue = initialValue;
    initialValue = newInitialValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EuclidmodelPackage.EUCLID_FIELD__INITIAL_VALUE, oldInitialValue, newInitialValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInitialValue(XExpression newInitialValue)
  {
    if (newInitialValue != initialValue)
    {
      NotificationChain msgs = null;
      if (initialValue != null)
        msgs = ((InternalEObject)initialValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EuclidmodelPackage.EUCLID_FIELD__INITIAL_VALUE, null, msgs);
      if (newInitialValue != null)
        msgs = ((InternalEObject)newInitialValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EuclidmodelPackage.EUCLID_FIELD__INITIAL_VALUE, null, msgs);
      msgs = basicSetInitialValue(newInitialValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EuclidmodelPackage.EUCLID_FIELD__INITIAL_VALUE, newInitialValue, newInitialValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isExtension()
  {
    return extension;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExtension(boolean newExtension)
  {
    boolean oldExtension = extension;
    extension = newExtension;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EuclidmodelPackage.EUCLID_FIELD__EXTENSION, oldExtension, extension));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isStatic()
  {
    return static_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStatic(boolean newStatic)
  {
    boolean oldStatic = static_;
    static_ = newStatic;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EuclidmodelPackage.EUCLID_FIELD__STATIC, oldStatic, static_));
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
      case EuclidmodelPackage.EUCLID_FIELD__TYPE:
        return basicSetType(null, msgs);
      case EuclidmodelPackage.EUCLID_FIELD__INITIAL_VALUE:
        return basicSetInitialValue(null, msgs);
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
      case EuclidmodelPackage.EUCLID_FIELD__TYPE:
        return getType();
      case EuclidmodelPackage.EUCLID_FIELD__FINAL:
        return isFinal();
      case EuclidmodelPackage.EUCLID_FIELD__NAME:
        return getName();
      case EuclidmodelPackage.EUCLID_FIELD__INITIAL_VALUE:
        return getInitialValue();
      case EuclidmodelPackage.EUCLID_FIELD__EXTENSION:
        return isExtension();
      case EuclidmodelPackage.EUCLID_FIELD__STATIC:
        return isStatic();
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
      case EuclidmodelPackage.EUCLID_FIELD__TYPE:
        setType((JvmTypeReference)newValue);
        return;
      case EuclidmodelPackage.EUCLID_FIELD__FINAL:
        setFinal((Boolean)newValue);
        return;
      case EuclidmodelPackage.EUCLID_FIELD__NAME:
        setName((String)newValue);
        return;
      case EuclidmodelPackage.EUCLID_FIELD__INITIAL_VALUE:
        setInitialValue((XExpression)newValue);
        return;
      case EuclidmodelPackage.EUCLID_FIELD__EXTENSION:
        setExtension((Boolean)newValue);
        return;
      case EuclidmodelPackage.EUCLID_FIELD__STATIC:
        setStatic((Boolean)newValue);
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
      case EuclidmodelPackage.EUCLID_FIELD__TYPE:
        setType((JvmTypeReference)null);
        return;
      case EuclidmodelPackage.EUCLID_FIELD__FINAL:
        setFinal(FINAL_EDEFAULT);
        return;
      case EuclidmodelPackage.EUCLID_FIELD__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EuclidmodelPackage.EUCLID_FIELD__INITIAL_VALUE:
        setInitialValue((XExpression)null);
        return;
      case EuclidmodelPackage.EUCLID_FIELD__EXTENSION:
        setExtension(EXTENSION_EDEFAULT);
        return;
      case EuclidmodelPackage.EUCLID_FIELD__STATIC:
        setStatic(STATIC_EDEFAULT);
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
      case EuclidmodelPackage.EUCLID_FIELD__TYPE:
        return type != null;
      case EuclidmodelPackage.EUCLID_FIELD__FINAL:
        return final_ != FINAL_EDEFAULT;
      case EuclidmodelPackage.EUCLID_FIELD__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EuclidmodelPackage.EUCLID_FIELD__INITIAL_VALUE:
        return initialValue != null;
      case EuclidmodelPackage.EUCLID_FIELD__EXTENSION:
        return extension != EXTENSION_EDEFAULT;
      case EuclidmodelPackage.EUCLID_FIELD__STATIC:
        return static_ != STATIC_EDEFAULT;
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
    result.append(" (final: ");
    result.append(final_);
    result.append(", name: ");
    result.append(name);
    result.append(", extension: ");
    result.append(extension);
    result.append(", static: ");
    result.append(static_);
    result.append(')');
    return result.toString();
  }

} //EuclidFieldImpl
