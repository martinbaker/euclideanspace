/**
 */
package com.euclideanspace.aldor.editor.impl;

import com.euclideanspace.aldor.editor.EditorPackage;
import com.euclideanspace.aldor.editor.enlister1_Infixed_Comma;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>enlister1 Infixed Comma</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.enlister1_Infixed_CommaImpl#getI <em>I</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class enlister1_Infixed_CommaImpl extends enlist1_Infixed_Comma_ABImpl implements enlister1_Infixed_Comma
{
  /**
   * The default value of the '{@link #getI() <em>I</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getI()
   * @generated
   * @ordered
   */
  protected static final String I_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getI() <em>I</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getI()
   * @generated
   * @ordered
   */
  protected String i = I_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected enlister1_Infixed_CommaImpl()
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
    return EditorPackage.Literals.ENLISTER1_INFIXED_COMMA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getI()
  {
    return i;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setI(String newI)
  {
    String oldI = i;
    i = newI;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.ENLISTER1_INFIXED_COMMA__I, oldI, i));
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
      case EditorPackage.ENLISTER1_INFIXED_COMMA__I:
        return getI();
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
      case EditorPackage.ENLISTER1_INFIXED_COMMA__I:
        setI((String)newValue);
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
      case EditorPackage.ENLISTER1_INFIXED_COMMA__I:
        setI(I_EDEFAULT);
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
      case EditorPackage.ENLISTER1_INFIXED_COMMA__I:
        return I_EDEFAULT == null ? i != null : !I_EDEFAULT.equals(i);
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
    result.append(" (i: ");
    result.append(i);
    result.append(')');
    return result.toString();
  }

} //enlister1_Infixed_CommaImpl
