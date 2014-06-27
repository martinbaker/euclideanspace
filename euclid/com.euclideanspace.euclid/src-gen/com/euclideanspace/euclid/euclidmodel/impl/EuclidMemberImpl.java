/**
 */
package com.euclideanspace.euclid.euclidmodel.impl;

import com.euclideanspace.euclid.euclidmodel.EuclidMember;
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

import org.eclipse.xtext.common.types.JvmVisibility;

import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Euclid Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.euclid.euclidmodel.impl.EuclidMemberImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.euclidmodel.impl.EuclidMemberImpl#getAnnotationInfo <em>Annotation Info</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.euclidmodel.impl.EuclidMemberImpl#getVisibility <em>Visibility</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EuclidMemberImpl extends MinimalEObjectImpl.Container implements EuclidMember
{
  /**
   * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnnotations()
   * @generated
   * @ordered
   */
  protected EList<XAnnotation> annotations;

  /**
   * The cached value of the '{@link #getAnnotationInfo() <em>Annotation Info</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnnotationInfo()
   * @generated
   * @ordered
   */
  protected EuclidMember annotationInfo;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EuclidMemberImpl()
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
    return EuclidmodelPackage.Literals.EUCLID_MEMBER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<XAnnotation> getAnnotations()
  {
    if (annotations == null)
    {
      annotations = new EObjectContainmentEList<XAnnotation>(XAnnotation.class, this, EuclidmodelPackage.EUCLID_MEMBER__ANNOTATIONS);
    }
    return annotations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EuclidMember getAnnotationInfo()
  {
    return annotationInfo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAnnotationInfo(EuclidMember newAnnotationInfo, NotificationChain msgs)
  {
    EuclidMember oldAnnotationInfo = annotationInfo;
    annotationInfo = newAnnotationInfo;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EuclidmodelPackage.EUCLID_MEMBER__ANNOTATION_INFO, oldAnnotationInfo, newAnnotationInfo);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAnnotationInfo(EuclidMember newAnnotationInfo)
  {
    if (newAnnotationInfo != annotationInfo)
    {
      NotificationChain msgs = null;
      if (annotationInfo != null)
        msgs = ((InternalEObject)annotationInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EuclidmodelPackage.EUCLID_MEMBER__ANNOTATION_INFO, null, msgs);
      if (newAnnotationInfo != null)
        msgs = ((InternalEObject)newAnnotationInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EuclidmodelPackage.EUCLID_MEMBER__ANNOTATION_INFO, null, msgs);
      msgs = basicSetAnnotationInfo(newAnnotationInfo, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EuclidmodelPackage.EUCLID_MEMBER__ANNOTATION_INFO, newAnnotationInfo, newAnnotationInfo));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EuclidmodelPackage.EUCLID_MEMBER__VISIBILITY, oldVisibility, visibility));
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
      case EuclidmodelPackage.EUCLID_MEMBER__ANNOTATIONS:
        return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
      case EuclidmodelPackage.EUCLID_MEMBER__ANNOTATION_INFO:
        return basicSetAnnotationInfo(null, msgs);
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
      case EuclidmodelPackage.EUCLID_MEMBER__ANNOTATIONS:
        return getAnnotations();
      case EuclidmodelPackage.EUCLID_MEMBER__ANNOTATION_INFO:
        return getAnnotationInfo();
      case EuclidmodelPackage.EUCLID_MEMBER__VISIBILITY:
        return getVisibility();
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
      case EuclidmodelPackage.EUCLID_MEMBER__ANNOTATIONS:
        getAnnotations().clear();
        getAnnotations().addAll((Collection<? extends XAnnotation>)newValue);
        return;
      case EuclidmodelPackage.EUCLID_MEMBER__ANNOTATION_INFO:
        setAnnotationInfo((EuclidMember)newValue);
        return;
      case EuclidmodelPackage.EUCLID_MEMBER__VISIBILITY:
        setVisibility((JvmVisibility)newValue);
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
      case EuclidmodelPackage.EUCLID_MEMBER__ANNOTATIONS:
        getAnnotations().clear();
        return;
      case EuclidmodelPackage.EUCLID_MEMBER__ANNOTATION_INFO:
        setAnnotationInfo((EuclidMember)null);
        return;
      case EuclidmodelPackage.EUCLID_MEMBER__VISIBILITY:
        setVisibility(VISIBILITY_EDEFAULT);
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
      case EuclidmodelPackage.EUCLID_MEMBER__ANNOTATIONS:
        return annotations != null && !annotations.isEmpty();
      case EuclidmodelPackage.EUCLID_MEMBER__ANNOTATION_INFO:
        return annotationInfo != null;
      case EuclidmodelPackage.EUCLID_MEMBER__VISIBILITY:
        return visibility != VISIBILITY_EDEFAULT;
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
    result.append(')');
    return result.toString();
  }

} //EuclidMemberImpl
