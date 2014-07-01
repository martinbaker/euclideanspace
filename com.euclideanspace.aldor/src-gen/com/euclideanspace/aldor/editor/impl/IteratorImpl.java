/**
 */
package com.euclideanspace.aldor.editor.impl;

import com.euclideanspace.aldor.editor.EditorPackage;
import com.euclideanspace.aldor.editor.Iterator;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Iterator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.IteratorImpl#getI <em>I</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.IteratorImpl#getSp <em>Sp</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IteratorImpl extends MinimalEObjectImpl.Container implements Iterator
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
   * The default value of the '{@link #getSp() <em>Sp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSp()
   * @generated
   * @ordered
   */
  protected static final String SP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSp() <em>Sp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSp()
   * @generated
   * @ordered
   */
  protected String sp = SP_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IteratorImpl()
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
    return EditorPackage.Literals.ITERATOR;
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
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.ITERATOR__I, oldI, i));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSp()
  {
    return sp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSp(String newSp)
  {
    String oldSp = sp;
    sp = newSp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.ITERATOR__SP, oldSp, sp));
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
      case EditorPackage.ITERATOR__I:
        return getI();
      case EditorPackage.ITERATOR__SP:
        return getSp();
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
      case EditorPackage.ITERATOR__I:
        setI((String)newValue);
        return;
      case EditorPackage.ITERATOR__SP:
        setSp((String)newValue);
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
      case EditorPackage.ITERATOR__I:
        setI(I_EDEFAULT);
        return;
      case EditorPackage.ITERATOR__SP:
        setSp(SP_EDEFAULT);
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
      case EditorPackage.ITERATOR__I:
        return I_EDEFAULT == null ? i != null : !I_EDEFAULT.equals(i);
      case EditorPackage.ITERATOR__SP:
        return SP_EDEFAULT == null ? sp != null : !SP_EDEFAULT.equals(sp);
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
    result.append(", sp: ");
    result.append(sp);
    result.append(')');
    return result.toString();
  }

} //IteratorImpl
