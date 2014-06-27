/**
 */
package com.euclideanspace.spad.editor.impl;

import com.euclideanspace.spad.editor.EditorPackage;
import com.euclideanspace.spad.editor.Literal;
import com.euclideanspace.spad.editor.NameOrFunctionCall;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.spad.editor.impl.LiteralImpl#getValue <em>Value</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.LiteralImpl#getT2 <em>T2</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.LiteralImpl#getE1 <em>E1</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.LiteralImpl#getT31 <em>T31</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.LiteralImpl#getE4 <em>E4</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LiteralImpl extends PrimaryPrefixImpl implements Literal
{
  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final int VALUE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected int value = VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getT2() <em>T2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT2()
   * @generated
   * @ordered
   */
  protected static final String T2_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getT2() <em>T2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT2()
   * @generated
   * @ordered
   */
  protected String t2 = T2_EDEFAULT;

  /**
   * The cached value of the '{@link #getE1() <em>E1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getE1()
   * @generated
   * @ordered
   */
  protected NameOrFunctionCall e1;

  /**
   * The cached value of the '{@link #getT31() <em>T31</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT31()
   * @generated
   * @ordered
   */
  protected EList<String> t31;

  /**
   * The cached value of the '{@link #getE4() <em>E4</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getE4()
   * @generated
   * @ordered
   */
  protected EList<NameOrFunctionCall> e4;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LiteralImpl()
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
    return EditorPackage.Literals.LITERAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(int newValue)
  {
    int oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.LITERAL__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getT2()
  {
    return t2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT2(String newT2)
  {
    String oldT2 = t2;
    t2 = newT2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.LITERAL__T2, oldT2, t2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NameOrFunctionCall getE1()
  {
    return e1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetE1(NameOrFunctionCall newE1, NotificationChain msgs)
  {
    NameOrFunctionCall oldE1 = e1;
    e1 = newE1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.LITERAL__E1, oldE1, newE1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setE1(NameOrFunctionCall newE1)
  {
    if (newE1 != e1)
    {
      NotificationChain msgs = null;
      if (e1 != null)
        msgs = ((InternalEObject)e1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.LITERAL__E1, null, msgs);
      if (newE1 != null)
        msgs = ((InternalEObject)newE1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.LITERAL__E1, null, msgs);
      msgs = basicSetE1(newE1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.LITERAL__E1, newE1, newE1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getT31()
  {
    if (t31 == null)
    {
      t31 = new EDataTypeEList<String>(String.class, this, EditorPackage.LITERAL__T31);
    }
    return t31;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<NameOrFunctionCall> getE4()
  {
    if (e4 == null)
    {
      e4 = new EObjectContainmentEList<NameOrFunctionCall>(NameOrFunctionCall.class, this, EditorPackage.LITERAL__E4);
    }
    return e4;
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
      case EditorPackage.LITERAL__E1:
        return basicSetE1(null, msgs);
      case EditorPackage.LITERAL__E4:
        return ((InternalEList<?>)getE4()).basicRemove(otherEnd, msgs);
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
      case EditorPackage.LITERAL__VALUE:
        return getValue();
      case EditorPackage.LITERAL__T2:
        return getT2();
      case EditorPackage.LITERAL__E1:
        return getE1();
      case EditorPackage.LITERAL__T31:
        return getT31();
      case EditorPackage.LITERAL__E4:
        return getE4();
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
      case EditorPackage.LITERAL__VALUE:
        setValue((Integer)newValue);
        return;
      case EditorPackage.LITERAL__T2:
        setT2((String)newValue);
        return;
      case EditorPackage.LITERAL__E1:
        setE1((NameOrFunctionCall)newValue);
        return;
      case EditorPackage.LITERAL__T31:
        getT31().clear();
        getT31().addAll((Collection<? extends String>)newValue);
        return;
      case EditorPackage.LITERAL__E4:
        getE4().clear();
        getE4().addAll((Collection<? extends NameOrFunctionCall>)newValue);
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
      case EditorPackage.LITERAL__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
      case EditorPackage.LITERAL__T2:
        setT2(T2_EDEFAULT);
        return;
      case EditorPackage.LITERAL__E1:
        setE1((NameOrFunctionCall)null);
        return;
      case EditorPackage.LITERAL__T31:
        getT31().clear();
        return;
      case EditorPackage.LITERAL__E4:
        getE4().clear();
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
      case EditorPackage.LITERAL__VALUE:
        return value != VALUE_EDEFAULT;
      case EditorPackage.LITERAL__T2:
        return T2_EDEFAULT == null ? t2 != null : !T2_EDEFAULT.equals(t2);
      case EditorPackage.LITERAL__E1:
        return e1 != null;
      case EditorPackage.LITERAL__T31:
        return t31 != null && !t31.isEmpty();
      case EditorPackage.LITERAL__E4:
        return e4 != null && !e4.isEmpty();
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
    result.append(" (value: ");
    result.append(value);
    result.append(", t2: ");
    result.append(t2);
    result.append(", t31: ");
    result.append(t31);
    result.append(')');
    return result.toString();
  }

} //LiteralImpl
