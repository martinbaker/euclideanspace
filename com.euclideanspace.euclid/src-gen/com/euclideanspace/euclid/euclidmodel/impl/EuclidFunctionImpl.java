/**
 */
package com.euclideanspace.euclid.euclidmodel.impl;

import com.euclideanspace.euclid.euclidmodel.CreateExtensionInfo;
import com.euclideanspace.euclid.euclidmodel.EuclidFunction;
import com.euclideanspace.euclid.euclidmodel.EuclidParameter;
import com.euclideanspace.euclid.euclidmodel.EuclidmodelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.common.types.JvmTypeParameter;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmVisibility;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Euclid Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.euclid.euclidmodel.impl.EuclidFunctionImpl#isOverride <em>Override</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.euclidmodel.impl.EuclidFunctionImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.euclidmodel.impl.EuclidFunctionImpl#isStatic <em>Static</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.euclidmodel.impl.EuclidFunctionImpl#isDispatch <em>Dispatch</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.euclidmodel.impl.EuclidFunctionImpl#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.euclidmodel.impl.EuclidFunctionImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.euclidmodel.impl.EuclidFunctionImpl#getCreateExtensionInfo <em>Create Extension Info</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.euclidmodel.impl.EuclidFunctionImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.euclidmodel.impl.EuclidFunctionImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.euclidmodel.impl.EuclidFunctionImpl#getExceptions <em>Exceptions</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.euclidmodel.impl.EuclidFunctionImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EuclidFunctionImpl extends EuclidMemberImpl implements EuclidFunction
{
  /**
   * The default value of the '{@link #isOverride() <em>Override</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOverride()
   * @generated
   * @ordered
   */
  protected static final boolean OVERRIDE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isOverride() <em>Override</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOverride()
   * @generated
   * @ordered
   */
  protected boolean override = OVERRIDE_EDEFAULT;

  /**
   * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVisibility()
   * @generated
   * @ordered
   */
  protected static final JvmVisibility VISIBILITY_EDEFAULT = JvmVisibility.DEFAULT;

  /**
   * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVisibility()
   * @generated
   * @ordered
   */
  protected JvmVisibility visibility = VISIBILITY_EDEFAULT;

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
   * The default value of the '{@link #isDispatch() <em>Dispatch</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDispatch()
   * @generated
   * @ordered
   */
  protected static final boolean DISPATCH_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDispatch() <em>Dispatch</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDispatch()
   * @generated
   * @ordered
   */
  protected boolean dispatch = DISPATCH_EDEFAULT;

  /**
   * The cached value of the '{@link #getTypeParameters() <em>Type Parameters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeParameters()
   * @generated
   * @ordered
   */
  protected EList<JvmTypeParameter> typeParameters;

  /**
   * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturnType()
   * @generated
   * @ordered
   */
  protected JvmTypeReference returnType;

  /**
   * The cached value of the '{@link #getCreateExtensionInfo() <em>Create Extension Info</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCreateExtensionInfo()
   * @generated
   * @ordered
   */
  protected CreateExtensionInfo createExtensionInfo;

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
   * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameters()
   * @generated
   * @ordered
   */
  protected EList<EuclidParameter> parameters;

  /**
   * The cached value of the '{@link #getExceptions() <em>Exceptions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExceptions()
   * @generated
   * @ordered
   */
  protected EList<JvmTypeReference> exceptions;

  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected XExpression expression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EuclidFunctionImpl()
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
    return EuclidmodelPackage.Literals.EUCLID_FUNCTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isOverride()
  {
    return override;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOverride(boolean newOverride)
  {
    boolean oldOverride = override;
    override = newOverride;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EuclidmodelPackage.EUCLID_FUNCTION__OVERRIDE, oldOverride, override));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmVisibility getVisibility()
  {
    return visibility;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVisibility(JvmVisibility newVisibility)
  {
    JvmVisibility oldVisibility = visibility;
    visibility = newVisibility == null ? VISIBILITY_EDEFAULT : newVisibility;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EuclidmodelPackage.EUCLID_FUNCTION__VISIBILITY, oldVisibility, visibility));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EuclidmodelPackage.EUCLID_FUNCTION__STATIC, oldStatic, static_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDispatch()
  {
    return dispatch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDispatch(boolean newDispatch)
  {
    boolean oldDispatch = dispatch;
    dispatch = newDispatch;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EuclidmodelPackage.EUCLID_FUNCTION__DISPATCH, oldDispatch, dispatch));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<JvmTypeParameter> getTypeParameters()
  {
    if (typeParameters == null)
    {
      typeParameters = new EObjectContainmentEList<JvmTypeParameter>(JvmTypeParameter.class, this, EuclidmodelPackage.EUCLID_FUNCTION__TYPE_PARAMETERS);
    }
    return typeParameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmTypeReference getReturnType()
  {
    return returnType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReturnType(JvmTypeReference newReturnType, NotificationChain msgs)
  {
    JvmTypeReference oldReturnType = returnType;
    returnType = newReturnType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EuclidmodelPackage.EUCLID_FUNCTION__RETURN_TYPE, oldReturnType, newReturnType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReturnType(JvmTypeReference newReturnType)
  {
    if (newReturnType != returnType)
    {
      NotificationChain msgs = null;
      if (returnType != null)
        msgs = ((InternalEObject)returnType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EuclidmodelPackage.EUCLID_FUNCTION__RETURN_TYPE, null, msgs);
      if (newReturnType != null)
        msgs = ((InternalEObject)newReturnType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EuclidmodelPackage.EUCLID_FUNCTION__RETURN_TYPE, null, msgs);
      msgs = basicSetReturnType(newReturnType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EuclidmodelPackage.EUCLID_FUNCTION__RETURN_TYPE, newReturnType, newReturnType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CreateExtensionInfo getCreateExtensionInfo()
  {
    return createExtensionInfo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCreateExtensionInfo(CreateExtensionInfo newCreateExtensionInfo, NotificationChain msgs)
  {
    CreateExtensionInfo oldCreateExtensionInfo = createExtensionInfo;
    createExtensionInfo = newCreateExtensionInfo;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EuclidmodelPackage.EUCLID_FUNCTION__CREATE_EXTENSION_INFO, oldCreateExtensionInfo, newCreateExtensionInfo);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCreateExtensionInfo(CreateExtensionInfo newCreateExtensionInfo)
  {
    if (newCreateExtensionInfo != createExtensionInfo)
    {
      NotificationChain msgs = null;
      if (createExtensionInfo != null)
        msgs = ((InternalEObject)createExtensionInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EuclidmodelPackage.EUCLID_FUNCTION__CREATE_EXTENSION_INFO, null, msgs);
      if (newCreateExtensionInfo != null)
        msgs = ((InternalEObject)newCreateExtensionInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EuclidmodelPackage.EUCLID_FUNCTION__CREATE_EXTENSION_INFO, null, msgs);
      msgs = basicSetCreateExtensionInfo(newCreateExtensionInfo, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EuclidmodelPackage.EUCLID_FUNCTION__CREATE_EXTENSION_INFO, newCreateExtensionInfo, newCreateExtensionInfo));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EuclidmodelPackage.EUCLID_FUNCTION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EuclidParameter> getParameters()
  {
    if (parameters == null)
    {
      parameters = new EObjectContainmentEList<EuclidParameter>(EuclidParameter.class, this, EuclidmodelPackage.EUCLID_FUNCTION__PARAMETERS);
    }
    return parameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<JvmTypeReference> getExceptions()
  {
    if (exceptions == null)
    {
      exceptions = new EObjectContainmentEList<JvmTypeReference>(JvmTypeReference.class, this, EuclidmodelPackage.EUCLID_FUNCTION__EXCEPTIONS);
    }
    return exceptions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(XExpression newExpression, NotificationChain msgs)
  {
    XExpression oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EuclidmodelPackage.EUCLID_FUNCTION__EXPRESSION, oldExpression, newExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression(XExpression newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EuclidmodelPackage.EUCLID_FUNCTION__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EuclidmodelPackage.EUCLID_FUNCTION__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EuclidmodelPackage.EUCLID_FUNCTION__EXPRESSION, newExpression, newExpression));
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
      case EuclidmodelPackage.EUCLID_FUNCTION__TYPE_PARAMETERS:
        return ((InternalEList<?>)getTypeParameters()).basicRemove(otherEnd, msgs);
      case EuclidmodelPackage.EUCLID_FUNCTION__RETURN_TYPE:
        return basicSetReturnType(null, msgs);
      case EuclidmodelPackage.EUCLID_FUNCTION__CREATE_EXTENSION_INFO:
        return basicSetCreateExtensionInfo(null, msgs);
      case EuclidmodelPackage.EUCLID_FUNCTION__PARAMETERS:
        return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
      case EuclidmodelPackage.EUCLID_FUNCTION__EXCEPTIONS:
        return ((InternalEList<?>)getExceptions()).basicRemove(otherEnd, msgs);
      case EuclidmodelPackage.EUCLID_FUNCTION__EXPRESSION:
        return basicSetExpression(null, msgs);
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
      case EuclidmodelPackage.EUCLID_FUNCTION__OVERRIDE:
        return isOverride();
      case EuclidmodelPackage.EUCLID_FUNCTION__VISIBILITY:
        return getVisibility();
      case EuclidmodelPackage.EUCLID_FUNCTION__STATIC:
        return isStatic();
      case EuclidmodelPackage.EUCLID_FUNCTION__DISPATCH:
        return isDispatch();
      case EuclidmodelPackage.EUCLID_FUNCTION__TYPE_PARAMETERS:
        return getTypeParameters();
      case EuclidmodelPackage.EUCLID_FUNCTION__RETURN_TYPE:
        return getReturnType();
      case EuclidmodelPackage.EUCLID_FUNCTION__CREATE_EXTENSION_INFO:
        return getCreateExtensionInfo();
      case EuclidmodelPackage.EUCLID_FUNCTION__NAME:
        return getName();
      case EuclidmodelPackage.EUCLID_FUNCTION__PARAMETERS:
        return getParameters();
      case EuclidmodelPackage.EUCLID_FUNCTION__EXCEPTIONS:
        return getExceptions();
      case EuclidmodelPackage.EUCLID_FUNCTION__EXPRESSION:
        return getExpression();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EuclidmodelPackage.EUCLID_FUNCTION__OVERRIDE:
        setOverride((Boolean)newValue);
        return;
      case EuclidmodelPackage.EUCLID_FUNCTION__VISIBILITY:
        setVisibility((JvmVisibility)newValue);
        return;
      case EuclidmodelPackage.EUCLID_FUNCTION__STATIC:
        setStatic((Boolean)newValue);
        return;
      case EuclidmodelPackage.EUCLID_FUNCTION__DISPATCH:
        setDispatch((Boolean)newValue);
        return;
      case EuclidmodelPackage.EUCLID_FUNCTION__TYPE_PARAMETERS:
        getTypeParameters().clear();
        getTypeParameters().addAll((Collection<? extends JvmTypeParameter>)newValue);
        return;
      case EuclidmodelPackage.EUCLID_FUNCTION__RETURN_TYPE:
        setReturnType((JvmTypeReference)newValue);
        return;
      case EuclidmodelPackage.EUCLID_FUNCTION__CREATE_EXTENSION_INFO:
        setCreateExtensionInfo((CreateExtensionInfo)newValue);
        return;
      case EuclidmodelPackage.EUCLID_FUNCTION__NAME:
        setName((String)newValue);
        return;
      case EuclidmodelPackage.EUCLID_FUNCTION__PARAMETERS:
        getParameters().clear();
        getParameters().addAll((Collection<? extends EuclidParameter>)newValue);
        return;
      case EuclidmodelPackage.EUCLID_FUNCTION__EXCEPTIONS:
        getExceptions().clear();
        getExceptions().addAll((Collection<? extends JvmTypeReference>)newValue);
        return;
      case EuclidmodelPackage.EUCLID_FUNCTION__EXPRESSION:
        setExpression((XExpression)newValue);
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
      case EuclidmodelPackage.EUCLID_FUNCTION__OVERRIDE:
        setOverride(OVERRIDE_EDEFAULT);
        return;
      case EuclidmodelPackage.EUCLID_FUNCTION__VISIBILITY:
        setVisibility(VISIBILITY_EDEFAULT);
        return;
      case EuclidmodelPackage.EUCLID_FUNCTION__STATIC:
        setStatic(STATIC_EDEFAULT);
        return;
      case EuclidmodelPackage.EUCLID_FUNCTION__DISPATCH:
        setDispatch(DISPATCH_EDEFAULT);
        return;
      case EuclidmodelPackage.EUCLID_FUNCTION__TYPE_PARAMETERS:
        getTypeParameters().clear();
        return;
      case EuclidmodelPackage.EUCLID_FUNCTION__RETURN_TYPE:
        setReturnType((JvmTypeReference)null);
        return;
      case EuclidmodelPackage.EUCLID_FUNCTION__CREATE_EXTENSION_INFO:
        setCreateExtensionInfo((CreateExtensionInfo)null);
        return;
      case EuclidmodelPackage.EUCLID_FUNCTION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EuclidmodelPackage.EUCLID_FUNCTION__PARAMETERS:
        getParameters().clear();
        return;
      case EuclidmodelPackage.EUCLID_FUNCTION__EXCEPTIONS:
        getExceptions().clear();
        return;
      case EuclidmodelPackage.EUCLID_FUNCTION__EXPRESSION:
        setExpression((XExpression)null);
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
      case EuclidmodelPackage.EUCLID_FUNCTION__OVERRIDE:
        return override != OVERRIDE_EDEFAULT;
      case EuclidmodelPackage.EUCLID_FUNCTION__VISIBILITY:
        return visibility != VISIBILITY_EDEFAULT;
      case EuclidmodelPackage.EUCLID_FUNCTION__STATIC:
        return static_ != STATIC_EDEFAULT;
      case EuclidmodelPackage.EUCLID_FUNCTION__DISPATCH:
        return dispatch != DISPATCH_EDEFAULT;
      case EuclidmodelPackage.EUCLID_FUNCTION__TYPE_PARAMETERS:
        return typeParameters != null && !typeParameters.isEmpty();
      case EuclidmodelPackage.EUCLID_FUNCTION__RETURN_TYPE:
        return returnType != null;
      case EuclidmodelPackage.EUCLID_FUNCTION__CREATE_EXTENSION_INFO:
        return createExtensionInfo != null;
      case EuclidmodelPackage.EUCLID_FUNCTION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EuclidmodelPackage.EUCLID_FUNCTION__PARAMETERS:
        return parameters != null && !parameters.isEmpty();
      case EuclidmodelPackage.EUCLID_FUNCTION__EXCEPTIONS:
        return exceptions != null && !exceptions.isEmpty();
      case EuclidmodelPackage.EUCLID_FUNCTION__EXPRESSION:
        return expression != null;
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
    result.append(" (override: ");
    result.append(override);
    result.append(", visibility: ");
    result.append(visibility);
    result.append(", static: ");
    result.append(static_);
    result.append(", dispatch: ");
    result.append(dispatch);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //EuclidFunctionImpl
