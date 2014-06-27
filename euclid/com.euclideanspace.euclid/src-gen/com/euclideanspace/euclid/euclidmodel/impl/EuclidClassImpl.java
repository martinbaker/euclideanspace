/**
 */
package com.euclideanspace.euclid.euclidmodel.impl;

import com.euclideanspace.euclid.euclidmodel.EuclidClass;
import com.euclideanspace.euclid.euclidmodel.EuclidMember;
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

import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmTypeParameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Euclid Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.euclid.euclidmodel.impl.EuclidClassImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.euclidmodel.impl.EuclidClassImpl#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.euclidmodel.impl.EuclidClassImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.euclidmodel.impl.EuclidClassImpl#getImplements <em>Implements</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.euclidmodel.impl.EuclidClassImpl#getMembers <em>Members</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EuclidClassImpl extends EuclidTypeDeclarationImpl implements EuclidClass
{
  /**
   * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAbstract()
   * @generated
   * @ordered
   */
  protected static final boolean ABSTRACT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAbstract()
   * @generated
   * @ordered
   */
  protected boolean abstract_ = ABSTRACT_EDEFAULT;

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
   * The cached value of the '{@link #getExtends() <em>Extends</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtends()
   * @generated
   * @ordered
   */
  protected JvmParameterizedTypeReference extends_;

  /**
   * The cached value of the '{@link #getImplements() <em>Implements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImplements()
   * @generated
   * @ordered
   */
  protected EList<JvmParameterizedTypeReference> implements_;

  /**
   * The cached value of the '{@link #getMembers() <em>Members</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMembers()
   * @generated
   * @ordered
   */
  protected EList<EuclidMember> members;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EuclidClassImpl()
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
    return EuclidmodelPackage.Literals.EUCLID_CLASS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAbstract()
  {
    return abstract_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAbstract(boolean newAbstract)
  {
    boolean oldAbstract = abstract_;
    abstract_ = newAbstract;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EuclidmodelPackage.EUCLID_CLASS__ABSTRACT, oldAbstract, abstract_));
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
      typeParameters = new EObjectContainmentEList<JvmTypeParameter>(JvmTypeParameter.class, this, EuclidmodelPackage.EUCLID_CLASS__TYPE_PARAMETERS);
    }
    return typeParameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmParameterizedTypeReference getExtends()
  {
    return extends_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExtends(JvmParameterizedTypeReference newExtends, NotificationChain msgs)
  {
    JvmParameterizedTypeReference oldExtends = extends_;
    extends_ = newExtends;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EuclidmodelPackage.EUCLID_CLASS__EXTENDS, oldExtends, newExtends);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExtends(JvmParameterizedTypeReference newExtends)
  {
    if (newExtends != extends_)
    {
      NotificationChain msgs = null;
      if (extends_ != null)
        msgs = ((InternalEObject)extends_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EuclidmodelPackage.EUCLID_CLASS__EXTENDS, null, msgs);
      if (newExtends != null)
        msgs = ((InternalEObject)newExtends).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EuclidmodelPackage.EUCLID_CLASS__EXTENDS, null, msgs);
      msgs = basicSetExtends(newExtends, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EuclidmodelPackage.EUCLID_CLASS__EXTENDS, newExtends, newExtends));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<JvmParameterizedTypeReference> getImplements()
  {
    if (implements_ == null)
    {
      implements_ = new EObjectContainmentEList<JvmParameterizedTypeReference>(JvmParameterizedTypeReference.class, this, EuclidmodelPackage.EUCLID_CLASS__IMPLEMENTS);
    }
    return implements_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EuclidMember> getMembers()
  {
    if (members == null)
    {
      members = new EObjectContainmentEList<EuclidMember>(EuclidMember.class, this, EuclidmodelPackage.EUCLID_CLASS__MEMBERS);
    }
    return members;
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
      case EuclidmodelPackage.EUCLID_CLASS__TYPE_PARAMETERS:
        return ((InternalEList<?>)getTypeParameters()).basicRemove(otherEnd, msgs);
      case EuclidmodelPackage.EUCLID_CLASS__EXTENDS:
        return basicSetExtends(null, msgs);
      case EuclidmodelPackage.EUCLID_CLASS__IMPLEMENTS:
        return ((InternalEList<?>)getImplements()).basicRemove(otherEnd, msgs);
      case EuclidmodelPackage.EUCLID_CLASS__MEMBERS:
        return ((InternalEList<?>)getMembers()).basicRemove(otherEnd, msgs);
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
      case EuclidmodelPackage.EUCLID_CLASS__ABSTRACT:
        return isAbstract();
      case EuclidmodelPackage.EUCLID_CLASS__TYPE_PARAMETERS:
        return getTypeParameters();
      case EuclidmodelPackage.EUCLID_CLASS__EXTENDS:
        return getExtends();
      case EuclidmodelPackage.EUCLID_CLASS__IMPLEMENTS:
        return getImplements();
      case EuclidmodelPackage.EUCLID_CLASS__MEMBERS:
        return getMembers();
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
      case EuclidmodelPackage.EUCLID_CLASS__ABSTRACT:
        setAbstract((Boolean)newValue);
        return;
      case EuclidmodelPackage.EUCLID_CLASS__TYPE_PARAMETERS:
        getTypeParameters().clear();
        getTypeParameters().addAll((Collection<? extends JvmTypeParameter>)newValue);
        return;
      case EuclidmodelPackage.EUCLID_CLASS__EXTENDS:
        setExtends((JvmParameterizedTypeReference)newValue);
        return;
      case EuclidmodelPackage.EUCLID_CLASS__IMPLEMENTS:
        getImplements().clear();
        getImplements().addAll((Collection<? extends JvmParameterizedTypeReference>)newValue);
        return;
      case EuclidmodelPackage.EUCLID_CLASS__MEMBERS:
        getMembers().clear();
        getMembers().addAll((Collection<? extends EuclidMember>)newValue);
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
      case EuclidmodelPackage.EUCLID_CLASS__ABSTRACT:
        setAbstract(ABSTRACT_EDEFAULT);
        return;
      case EuclidmodelPackage.EUCLID_CLASS__TYPE_PARAMETERS:
        getTypeParameters().clear();
        return;
      case EuclidmodelPackage.EUCLID_CLASS__EXTENDS:
        setExtends((JvmParameterizedTypeReference)null);
        return;
      case EuclidmodelPackage.EUCLID_CLASS__IMPLEMENTS:
        getImplements().clear();
        return;
      case EuclidmodelPackage.EUCLID_CLASS__MEMBERS:
        getMembers().clear();
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
      case EuclidmodelPackage.EUCLID_CLASS__ABSTRACT:
        return abstract_ != ABSTRACT_EDEFAULT;
      case EuclidmodelPackage.EUCLID_CLASS__TYPE_PARAMETERS:
        return typeParameters != null && !typeParameters.isEmpty();
      case EuclidmodelPackage.EUCLID_CLASS__EXTENDS:
        return extends_ != null;
      case EuclidmodelPackage.EUCLID_CLASS__IMPLEMENTS:
        return implements_ != null && !implements_.isEmpty();
      case EuclidmodelPackage.EUCLID_CLASS__MEMBERS:
        return members != null && !members.isEmpty();
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
    result.append(" (abstract: ");
    result.append(abstract_);
    result.append(')');
    return result.toString();
  }

} //EuclidClassImpl
