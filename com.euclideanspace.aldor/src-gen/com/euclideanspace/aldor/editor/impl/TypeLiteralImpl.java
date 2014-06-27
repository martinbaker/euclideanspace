/**
 */
package com.euclideanspace.aldor.editor.impl;

import com.euclideanspace.aldor.editor.BooleanLiteral;
import com.euclideanspace.aldor.editor.CharacterLiteral;
import com.euclideanspace.aldor.editor.EditorPackage;
import com.euclideanspace.aldor.editor.TypeLiteral;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.TypeLiteralImpl#getT1 <em>T1</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.TypeLiteralImpl#getT22 <em>T22</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.TypeLiteralImpl#getT34 <em>T34</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.TypeLiteralImpl#getT35 <em>T35</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeLiteralImpl extends TypePrimaryExpressionImpl implements TypeLiteral
{
  /**
   * The default value of the '{@link #getT1() <em>T1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT1()
   * @generated
   * @ordered
   */
  protected static final int T1_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getT1() <em>T1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT1()
   * @generated
   * @ordered
   */
  protected int t1 = T1_EDEFAULT;

  /**
   * The default value of the '{@link #getT22() <em>T22</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT22()
   * @generated
   * @ordered
   */
  protected static final String T22_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getT22() <em>T22</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT22()
   * @generated
   * @ordered
   */
  protected String t22 = T22_EDEFAULT;

  /**
   * The cached value of the '{@link #getT34() <em>T34</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT34()
   * @generated
   * @ordered
   */
  protected CharacterLiteral t34;

  /**
   * The cached value of the '{@link #getT35() <em>T35</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT35()
   * @generated
   * @ordered
   */
  protected BooleanLiteral t35;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypeLiteralImpl()
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
    return EditorPackage.Literals.TYPE_LITERAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getT1()
  {
    return t1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT1(int newT1)
  {
    int oldT1 = t1;
    t1 = newT1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_LITERAL__T1, oldT1, t1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getT22()
  {
    return t22;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT22(String newT22)
  {
    String oldT22 = t22;
    t22 = newT22;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_LITERAL__T22, oldT22, t22));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CharacterLiteral getT34()
  {
    return t34;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetT34(CharacterLiteral newT34, NotificationChain msgs)
  {
    CharacterLiteral oldT34 = t34;
    t34 = newT34;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_LITERAL__T34, oldT34, newT34);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT34(CharacterLiteral newT34)
  {
    if (newT34 != t34)
    {
      NotificationChain msgs = null;
      if (t34 != null)
        msgs = ((InternalEObject)t34).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.TYPE_LITERAL__T34, null, msgs);
      if (newT34 != null)
        msgs = ((InternalEObject)newT34).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.TYPE_LITERAL__T34, null, msgs);
      msgs = basicSetT34(newT34, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_LITERAL__T34, newT34, newT34));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanLiteral getT35()
  {
    return t35;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetT35(BooleanLiteral newT35, NotificationChain msgs)
  {
    BooleanLiteral oldT35 = t35;
    t35 = newT35;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_LITERAL__T35, oldT35, newT35);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT35(BooleanLiteral newT35)
  {
    if (newT35 != t35)
    {
      NotificationChain msgs = null;
      if (t35 != null)
        msgs = ((InternalEObject)t35).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.TYPE_LITERAL__T35, null, msgs);
      if (newT35 != null)
        msgs = ((InternalEObject)newT35).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.TYPE_LITERAL__T35, null, msgs);
      msgs = basicSetT35(newT35, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_LITERAL__T35, newT35, newT35));
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
      case EditorPackage.TYPE_LITERAL__T34:
        return basicSetT34(null, msgs);
      case EditorPackage.TYPE_LITERAL__T35:
        return basicSetT35(null, msgs);
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
      case EditorPackage.TYPE_LITERAL__T1:
        return getT1();
      case EditorPackage.TYPE_LITERAL__T22:
        return getT22();
      case EditorPackage.TYPE_LITERAL__T34:
        return getT34();
      case EditorPackage.TYPE_LITERAL__T35:
        return getT35();
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
      case EditorPackage.TYPE_LITERAL__T1:
        setT1((Integer)newValue);
        return;
      case EditorPackage.TYPE_LITERAL__T22:
        setT22((String)newValue);
        return;
      case EditorPackage.TYPE_LITERAL__T34:
        setT34((CharacterLiteral)newValue);
        return;
      case EditorPackage.TYPE_LITERAL__T35:
        setT35((BooleanLiteral)newValue);
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
      case EditorPackage.TYPE_LITERAL__T1:
        setT1(T1_EDEFAULT);
        return;
      case EditorPackage.TYPE_LITERAL__T22:
        setT22(T22_EDEFAULT);
        return;
      case EditorPackage.TYPE_LITERAL__T34:
        setT34((CharacterLiteral)null);
        return;
      case EditorPackage.TYPE_LITERAL__T35:
        setT35((BooleanLiteral)null);
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
      case EditorPackage.TYPE_LITERAL__T1:
        return t1 != T1_EDEFAULT;
      case EditorPackage.TYPE_LITERAL__T22:
        return T22_EDEFAULT == null ? t22 != null : !T22_EDEFAULT.equals(t22);
      case EditorPackage.TYPE_LITERAL__T34:
        return t34 != null;
      case EditorPackage.TYPE_LITERAL__T35:
        return t35 != null;
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
    result.append(" (t1: ");
    result.append(t1);
    result.append(", t22: ");
    result.append(t22);
    result.append(')');
    return result.toString();
  }

} //TypeLiteralImpl
