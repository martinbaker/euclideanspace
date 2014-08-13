/**
 */
package com.euclideanspace.aldor.editor.impl;

import com.euclideanspace.aldor.editor.CurlyContentB_Labeled;
import com.euclideanspace.aldor.editor.EditorPackage;
import com.euclideanspace.aldor.editor.Labeled;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Curly Content BLabeled</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.CurlyContentB_LabeledImpl#getPred <em>Pred</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.CurlyContentB_LabeledImpl#getL <em>L</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.CurlyContentB_LabeledImpl#getPd <em>Pd</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CurlyContentB_LabeledImpl extends MinimalEObjectImpl.Container implements CurlyContentB_Labeled
{
  /**
   * The default value of the '{@link #getPred() <em>Pred</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPred()
   * @generated
   * @ordered
   */
  protected static final String PRED_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPred() <em>Pred</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPred()
   * @generated
   * @ordered
   */
  protected String pred = PRED_EDEFAULT;

  /**
   * The cached value of the '{@link #getL() <em>L</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getL()
   * @generated
   * @ordered
   */
  protected Labeled l;

  /**
   * The default value of the '{@link #getPd() <em>Pd</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPd()
   * @generated
   * @ordered
   */
  protected static final String PD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPd() <em>Pd</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPd()
   * @generated
   * @ordered
   */
  protected String pd = PD_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CurlyContentB_LabeledImpl()
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
    return EditorPackage.Literals.CURLY_CONTENT_BLABELED;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPred()
  {
    return pred;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPred(String newPred)
  {
    String oldPred = pred;
    pred = newPred;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.CURLY_CONTENT_BLABELED__PRED, oldPred, pred));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Labeled getL()
  {
    return l;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetL(Labeled newL, NotificationChain msgs)
  {
    Labeled oldL = l;
    l = newL;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.CURLY_CONTENT_BLABELED__L, oldL, newL);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setL(Labeled newL)
  {
    if (newL != l)
    {
      NotificationChain msgs = null;
      if (l != null)
        msgs = ((InternalEObject)l).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.CURLY_CONTENT_BLABELED__L, null, msgs);
      if (newL != null)
        msgs = ((InternalEObject)newL).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.CURLY_CONTENT_BLABELED__L, null, msgs);
      msgs = basicSetL(newL, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.CURLY_CONTENT_BLABELED__L, newL, newL));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPd()
  {
    return pd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPd(String newPd)
  {
    String oldPd = pd;
    pd = newPd;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.CURLY_CONTENT_BLABELED__PD, oldPd, pd));
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
      case EditorPackage.CURLY_CONTENT_BLABELED__L:
        return basicSetL(null, msgs);
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
      case EditorPackage.CURLY_CONTENT_BLABELED__PRED:
        return getPred();
      case EditorPackage.CURLY_CONTENT_BLABELED__L:
        return getL();
      case EditorPackage.CURLY_CONTENT_BLABELED__PD:
        return getPd();
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
      case EditorPackage.CURLY_CONTENT_BLABELED__PRED:
        setPred((String)newValue);
        return;
      case EditorPackage.CURLY_CONTENT_BLABELED__L:
        setL((Labeled)newValue);
        return;
      case EditorPackage.CURLY_CONTENT_BLABELED__PD:
        setPd((String)newValue);
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
      case EditorPackage.CURLY_CONTENT_BLABELED__PRED:
        setPred(PRED_EDEFAULT);
        return;
      case EditorPackage.CURLY_CONTENT_BLABELED__L:
        setL((Labeled)null);
        return;
      case EditorPackage.CURLY_CONTENT_BLABELED__PD:
        setPd(PD_EDEFAULT);
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
      case EditorPackage.CURLY_CONTENT_BLABELED__PRED:
        return PRED_EDEFAULT == null ? pred != null : !PRED_EDEFAULT.equals(pred);
      case EditorPackage.CURLY_CONTENT_BLABELED__L:
        return l != null;
      case EditorPackage.CURLY_CONTENT_BLABELED__PD:
        return PD_EDEFAULT == null ? pd != null : !PD_EDEFAULT.equals(pd);
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
    result.append(" (pred: ");
    result.append(pred);
    result.append(", pd: ");
    result.append(pd);
    result.append(')');
    return result.toString();
  }

} //CurlyContentB_LabeledImpl
