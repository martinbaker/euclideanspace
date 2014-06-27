/**
 */
package com.euclideanspace.aldor.editor.impl;

import com.euclideanspace.aldor.editor.EditorPackage;
import com.euclideanspace.aldor.editor.RepeatStatement;
import com.euclideanspace.aldor.editor.Statement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repeat Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.RepeatStatementImpl#getStname <em>Stname</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.RepeatStatementImpl#getS1 <em>S1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RepeatStatementImpl extends MinimalEObjectImpl.Container implements RepeatStatement
{
  /**
   * The default value of the '{@link #getStname() <em>Stname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStname()
   * @generated
   * @ordered
   */
  protected static final String STNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStname() <em>Stname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStname()
   * @generated
   * @ordered
   */
  protected String stname = STNAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getS1() <em>S1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getS1()
   * @generated
   * @ordered
   */
  protected Statement s1;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RepeatStatementImpl()
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
    return EditorPackage.Literals.REPEAT_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStname()
  {
    return stname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStname(String newStname)
  {
    String oldStname = stname;
    stname = newStname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.REPEAT_STATEMENT__STNAME, oldStname, stname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement getS1()
  {
    return s1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetS1(Statement newS1, NotificationChain msgs)
  {
    Statement oldS1 = s1;
    s1 = newS1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.REPEAT_STATEMENT__S1, oldS1, newS1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setS1(Statement newS1)
  {
    if (newS1 != s1)
    {
      NotificationChain msgs = null;
      if (s1 != null)
        msgs = ((InternalEObject)s1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.REPEAT_STATEMENT__S1, null, msgs);
      if (newS1 != null)
        msgs = ((InternalEObject)newS1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.REPEAT_STATEMENT__S1, null, msgs);
      msgs = basicSetS1(newS1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.REPEAT_STATEMENT__S1, newS1, newS1));
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
      case EditorPackage.REPEAT_STATEMENT__S1:
        return basicSetS1(null, msgs);
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
      case EditorPackage.REPEAT_STATEMENT__STNAME:
        return getStname();
      case EditorPackage.REPEAT_STATEMENT__S1:
        return getS1();
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
      case EditorPackage.REPEAT_STATEMENT__STNAME:
        setStname((String)newValue);
        return;
      case EditorPackage.REPEAT_STATEMENT__S1:
        setS1((Statement)newValue);
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
      case EditorPackage.REPEAT_STATEMENT__STNAME:
        setStname(STNAME_EDEFAULT);
        return;
      case EditorPackage.REPEAT_STATEMENT__S1:
        setS1((Statement)null);
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
      case EditorPackage.REPEAT_STATEMENT__STNAME:
        return STNAME_EDEFAULT == null ? stname != null : !STNAME_EDEFAULT.equals(stname);
      case EditorPackage.REPEAT_STATEMENT__S1:
        return s1 != null;
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
    result.append(" (stname: ");
    result.append(stname);
    result.append(')');
    return result.toString();
  }

} //RepeatStatementImpl
