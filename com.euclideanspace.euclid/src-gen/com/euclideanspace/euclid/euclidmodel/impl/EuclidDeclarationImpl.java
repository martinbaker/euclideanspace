/**
 */
package com.euclideanspace.euclid.euclidmodel.impl;

import com.euclideanspace.euclid.euclidmodel.CreateExtensionInfo;
import com.euclideanspace.euclid.euclidmodel.EuclidDeclaration;
import com.euclideanspace.euclid.euclidmodel.EuclidParameter;
import com.euclideanspace.euclid.euclidmodel.EuclidmodelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.common.types.JvmTypeParameter;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmVisibility;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Euclid Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.euclid.euclidmodel.impl.EuclidDeclarationImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.euclidmodel.impl.EuclidDeclarationImpl#isExtension <em>Extension</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.euclidmodel.impl.EuclidDeclarationImpl#isFinal <em>Final</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.euclidmodel.impl.EuclidDeclarationImpl#getType <em>Type</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.euclidmodel.impl.EuclidDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.euclidmodel.impl.EuclidDeclarationImpl#isStatic <em>Static</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.euclidmodel.impl.EuclidDeclarationImpl#isOverride <em>Override</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.euclidmodel.impl.EuclidDeclarationImpl#isDispatch <em>Dispatch</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.euclidmodel.impl.EuclidDeclarationImpl#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.euclidmodel.impl.EuclidDeclarationImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.euclidmodel.impl.EuclidDeclarationImpl#getCreateExtensionInfo <em>Create Extension Info</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.euclidmodel.impl.EuclidDeclarationImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.euclidmodel.impl.EuclidDeclarationImpl#getExceptions <em>Exceptions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EuclidDeclarationImpl extends MinimalEObjectImpl.Container implements EuclidDeclaration
{
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
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected JvmTypeReference type;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EuclidDeclarationImpl()
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
    return EuclidmodelPackage.Literals.EUCLID_DECLARATION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, EuclidmodelPackage.EUCLID_DECLARATION__VISIBILITY, oldVisibility, visibility));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EuclidmodelPackage.EUCLID_DECLARATION__EXTENSION, oldExtension, extension));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EuclidmodelPackage.EUCLID_DECLARATION__FINAL, oldFinal, final_));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EuclidmodelPackage.EUCLID_DECLARATION__TYPE, oldType, newType);
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
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EuclidmodelPackage.EUCLID_DECLARATION__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EuclidmodelPackage.EUCLID_DECLARATION__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EuclidmodelPackage.EUCLID_DECLARATION__TYPE, newType, newType));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EuclidmodelPackage.EUCLID_DECLARATION__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EuclidmodelPackage.EUCLID_DECLARATION__STATIC, oldStatic, static_));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EuclidmodelPackage.EUCLID_DECLARATION__OVERRIDE, oldOverride, override));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EuclidmodelPackage.EUCLID_DECLARATION__DISPATCH, oldDispatch, dispatch));
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
      typeParameters = new EObjectContainmentEList<JvmTypeParameter>(JvmTypeParameter.class, this, EuclidmodelPackage.EUCLID_DECLARATION__TYPE_PARAMETERS);
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EuclidmodelPackage.EUCLID_DECLARATION__RETURN_TYPE, oldReturnType, newReturnType);
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
        msgs = ((InternalEObject)returnType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EuclidmodelPackage.EUCLID_DECLARATION__RETURN_TYPE, null, msgs);
      if (newReturnType != null)
        msgs = ((InternalEObject)newReturnType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EuclidmodelPackage.EUCLID_DECLARATION__RETURN_TYPE, null, msgs);
      msgs = basicSetReturnType(newReturnType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EuclidmodelPackage.EUCLID_DECLARATION__RETURN_TYPE, newReturnType, newReturnType));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EuclidmodelPackage.EUCLID_DECLARATION__CREATE_EXTENSION_INFO, oldCreateExtensionInfo, newCreateExtensionInfo);
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
        msgs = ((InternalEObject)createExtensionInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EuclidmodelPackage.EUCLID_DECLARATION__CREATE_EXTENSION_INFO, null, msgs);
      if (newCreateExtensionInfo != null)
        msgs = ((InternalEObject)newCreateExtensionInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EuclidmodelPackage.EUCLID_DECLARATION__CREATE_EXTENSION_INFO, null, msgs);
      msgs = basicSetCreateExtensionInfo(newCreateExtensionInfo, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EuclidmodelPackage.EUCLID_DECLARATION__CREATE_EXTENSION_INFO, newCreateExtensionInfo, newCreateExtensionInfo));
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
      parameters = new EObjectContainmentEList<EuclidParameter>(EuclidParameter.class, this, EuclidmodelPackage.EUCLID_DECLARATION__PARAMETERS);
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
      exceptions = new EObjectContainmentEList<JvmTypeReference>(JvmTypeReference.class, this, EuclidmodelPackage.EUCLID_DECLARATION__EXCEPTIONS);
    }
    return exceptions;
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
      case EuclidmodelPackage.EUCLID_DECLARATION__TYPE:
        return basicSetType(null, msgs);
      case EuclidmodelPackage.EUCLID_DECLARATION__TYPE_PARAMETERS:
        return ((InternalEList<?>)getTypeParameters()).basicRemove(otherEnd, msgs);
      case EuclidmodelPackage.EUCLID_DECLARATION__RETURN_TYPE:
        return basicSetReturnType(null, msgs);
      case EuclidmodelPackage.EUCLID_DECLARATION__CREATE_EXTENSION_INFO:
        return basicSetCreateExtensionInfo(null, msgs);
      case EuclidmodelPackage.EUCLID_DECLARATION__PARAMETERS:
        return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
      case EuclidmodelPackage.EUCLID_DECLARATION__EXCEPTIONS:
        return ((InternalEList<?>)getExceptions()).basicRemove(otherEnd, msgs);
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
      case EuclidmodelPackage.EUCLID_DECLARATION__VISIBILITY:
        return getVisibility();
      case EuclidmodelPackage.EUCLID_DECLARATION__EXTENSION:
        return isExtension();
      case EuclidmodelPackage.EUCLID_DECLARATION__FINAL:
        return isFinal();
      case EuclidmodelPackage.EUCLID_DECLARATION__TYPE:
        return getType();
      case EuclidmodelPackage.EUCLID_DECLARATION__NAME:
        return getName();
      case EuclidmodelPackage.EUCLID_DECLARATION__STATIC:
        return isStatic();
      case EuclidmodelPackage.EUCLID_DECLARATION__OVERRIDE:
        return isOverride();
      case EuclidmodelPackage.EUCLID_DECLARATION__DISPATCH:
        return isDispatch();
      case EuclidmodelPackage.EUCLID_DECLARATION__TYPE_PARAMETERS:
        return getTypeParameters();
      case EuclidmodelPackage.EUCLID_DECLARATION__RETURN_TYPE:
        return getReturnType();
      case EuclidmodelPackage.EUCLID_DECLARATION__CREATE_EXTENSION_INFO:
        return getCreateExtensionInfo();
      case EuclidmodelPackage.EUCLID_DECLARATION__PARAMETERS:
        return getParameters();
      case EuclidmodelPackage.EUCLID_DECLARATION__EXCEPTIONS:
        return getExceptions();
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
      case EuclidmodelPackage.EUCLID_DECLARATION__VISIBILITY:
        setVisibility((JvmVisibility)newValue);
        return;
      case EuclidmodelPackage.EUCLID_DECLARATION__EXTENSION:
        setExtension((Boolean)newValue);
        return;
      case EuclidmodelPackage.EUCLID_DECLARATION__FINAL:
        setFinal((Boolean)newValue);
        return;
      case EuclidmodelPackage.EUCLID_DECLARATION__TYPE:
        setType((JvmTypeReference)newValue);
        return;
      case EuclidmodelPackage.EUCLID_DECLARATION__NAME:
        setName((String)newValue);
        return;
      case EuclidmodelPackage.EUCLID_DECLARATION__STATIC:
        setStatic((Boolean)newValue);
        return;
      case EuclidmodelPackage.EUCLID_DECLARATION__OVERRIDE:
        setOverride((Boolean)newValue);
        return;
      case EuclidmodelPackage.EUCLID_DECLARATION__DISPATCH:
        setDispatch((Boolean)newValue);
        return;
      case EuclidmodelPackage.EUCLID_DECLARATION__TYPE_PARAMETERS:
        getTypeParameters().clear();
        getTypeParameters().addAll((Collection<? extends JvmTypeParameter>)newValue);
        return;
      case EuclidmodelPackage.EUCLID_DECLARATION__RETURN_TYPE:
        setReturnType((JvmTypeReference)newValue);
        return;
      case EuclidmodelPackage.EUCLID_DECLARATION__CREATE_EXTENSION_INFO:
        setCreateExtensionInfo((CreateExtensionInfo)newValue);
        return;
      case EuclidmodelPackage.EUCLID_DECLARATION__PARAMETERS:
        getParameters().clear();
        getParameters().addAll((Collection<? extends EuclidParameter>)newValue);
        return;
      case EuclidmodelPackage.EUCLID_DECLARATION__EXCEPTIONS:
        getExceptions().clear();
        getExceptions().addAll((Collection<? extends JvmTypeReference>)newValue);
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
      case EuclidmodelPackage.EUCLID_DECLARATION__VISIBILITY:
        setVisibility(VISIBILITY_EDEFAULT);
        return;
      case EuclidmodelPackage.EUCLID_DECLARATION__EXTENSION:
        setExtension(EXTENSION_EDEFAULT);
        return;
      case EuclidmodelPackage.EUCLID_DECLARATION__FINAL:
        setFinal(FINAL_EDEFAULT);
        return;
      case EuclidmodelPackage.EUCLID_DECLARATION__TYPE:
        setType((JvmTypeReference)null);
        return;
      case EuclidmodelPackage.EUCLID_DECLARATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EuclidmodelPackage.EUCLID_DECLARATION__STATIC:
        setStatic(STATIC_EDEFAULT);
        return;
      case EuclidmodelPackage.EUCLID_DECLARATION__OVERRIDE:
        setOverride(OVERRIDE_EDEFAULT);
        return;
      case EuclidmodelPackage.EUCLID_DECLARATION__DISPATCH:
        setDispatch(DISPATCH_EDEFAULT);
        return;
      case EuclidmodelPackage.EUCLID_DECLARATION__TYPE_PARAMETERS:
        getTypeParameters().clear();
        return;
      case EuclidmodelPackage.EUCLID_DECLARATION__RETURN_TYPE:
        setReturnType((JvmTypeReference)null);
        return;
      case EuclidmodelPackage.EUCLID_DECLARATION__CREATE_EXTENSION_INFO:
        setCreateExtensionInfo((CreateExtensionInfo)null);
        return;
      case EuclidmodelPackage.EUCLID_DECLARATION__PARAMETERS:
        getParameters().clear();
        return;
      case EuclidmodelPackage.EUCLID_DECLARATION__EXCEPTIONS:
        getExceptions().clear();
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
      case EuclidmodelPackage.EUCLID_DECLARATION__VISIBILITY:
        return visibility != VISIBILITY_EDEFAULT;
      case EuclidmodelPackage.EUCLID_DECLARATION__EXTENSION:
        return extension != EXTENSION_EDEFAULT;
      case EuclidmodelPackage.EUCLID_DECLARATION__FINAL:
        return final_ != FINAL_EDEFAULT;
      case EuclidmodelPackage.EUCLID_DECLARATION__TYPE:
        return type != null;
      case EuclidmodelPackage.EUCLID_DECLARATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EuclidmodelPackage.EUCLID_DECLARATION__STATIC:
        return static_ != STATIC_EDEFAULT;
      case EuclidmodelPackage.EUCLID_DECLARATION__OVERRIDE:
        return override != OVERRIDE_EDEFAULT;
      case EuclidmodelPackage.EUCLID_DECLARATION__DISPATCH:
        return dispatch != DISPATCH_EDEFAULT;
      case EuclidmodelPackage.EUCLID_DECLARATION__TYPE_PARAMETERS:
        return typeParameters != null && !typeParameters.isEmpty();
      case EuclidmodelPackage.EUCLID_DECLARATION__RETURN_TYPE:
        return returnType != null;
      case EuclidmodelPackage.EUCLID_DECLARATION__CREATE_EXTENSION_INFO:
        return createExtensionInfo != null;
      case EuclidmodelPackage.EUCLID_DECLARATION__PARAMETERS:
        return parameters != null && !parameters.isEmpty();
      case EuclidmodelPackage.EUCLID_DECLARATION__EXCEPTIONS:
        return exceptions != null && !exceptions.isEmpty();
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
    result.append(" (visibility: ");
    result.append(visibility);
    result.append(", extension: ");
    result.append(extension);
    result.append(", final: ");
    result.append(final_);
    result.append(", name: ");
    result.append(name);
    result.append(", static: ");
    result.append(static_);
    result.append(", override: ");
    result.append(override);
    result.append(", dispatch: ");
    result.append(dispatch);
    result.append(')');
    return result.toString();
  }

} //EuclidDeclarationImpl
