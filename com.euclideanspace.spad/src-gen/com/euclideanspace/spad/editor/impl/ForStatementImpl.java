/**
 */
package com.euclideanspace.spad.editor.impl;

import com.euclideanspace.spad.editor.EditorPackage;
import com.euclideanspace.spad.editor.Expr;
import com.euclideanspace.spad.editor.ForStatement;
import com.euclideanspace.spad.editor.Statement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.spad.editor.impl.ForStatementImpl#getStname <em>Stname</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.ForStatementImpl#getT1 <em>T1</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.ForStatementImpl#getS1 <em>S1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForStatementImpl extends MinimalEObjectImpl.Container implements ForStatement
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
   * The cached value of the '{@link #getT1() <em>T1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT1()
   * @generated
   * @ordered
   */
  protected Expr t1;

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
  protected ForStatementImpl()
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
    return EditorPackage.Literals.FOR_STATEMENT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.FOR_STATEMENT__STNAME, oldStname, stname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getT1()
  {
    return t1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetT1(Expr newT1, NotificationChain msgs)
  {
    Expr oldT1 = t1;
    t1 = newT1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.FOR_STATEMENT__T1, oldT1, newT1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT1(Expr newT1)
  {
    if (newT1 != t1)
    {
      NotificationChain msgs = null;
      if (t1 != null)
        msgs = ((InternalEObject)t1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.FOR_STATEMENT__T1, null, msgs);
      if (newT1 != null)
        msgs = ((InternalEObject)newT1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.FOR_STATEMENT__T1, null, msgs);
      msgs = basicSetT1(newT1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.FOR_STATEMENT__T1, newT1, newT1));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.FOR_STATEMENT__S1, oldS1, newS1);
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
        msgs = ((InternalEObject)s1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.FOR_STATEMENT__S1, null, msgs);
      if (newS1 != null)
        msgs = ((InternalEObject)newS1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.FOR_STATEMENT__S1, null, msgs);
      msgs = basicSetS1(newS1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.FOR_STATEMENT__S1, newS1, newS1));
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
      case EditorPackage.FOR_STATEMENT__T1:
        return basicSetT1(null, msgs);
      case EditorPackage.FOR_STATEMENT__S1:
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
      case EditorPackage.FOR_STATEMENT__STNAME:
        return getStname();
      case EditorPackage.FOR_STATEMENT__T1:
        return getT1();
      case EditorPackage.FOR_STATEMENT__S1:
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
      case EditorPackage.FOR_STATEMENT__STNAME:
        setStname((String)newValue);
        return;
      case EditorPackage.FOR_STATEMENT__T1:
        setT1((Expr)newValue);
        return;
      case EditorPackage.FOR_STATEMENT__S1:
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
      case EditorPackage.FOR_STATEMENT__STNAME:
        setStname(STNAME_EDEFAULT);
        return;
      case EditorPackage.FOR_STATEMENT__T1:
        setT1((Expr)null);
        return;
      case EditorPackage.FOR_STATEMENT__S1:
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
      case EditorPackage.FOR_STATEMENT__STNAME:
        return STNAME_EDEFAULT == null ? stname != null : !STNAME_EDEFAULT.equals(stname);
      case EditorPackage.FOR_STATEMENT__T1:
        return t1 != null;
      case EditorPackage.FOR_STATEMENT__S1:
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

} //ForStatementImpl
