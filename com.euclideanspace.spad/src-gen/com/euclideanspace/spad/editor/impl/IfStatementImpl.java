/**
 */
package com.euclideanspace.spad.editor.impl;

import com.euclideanspace.spad.editor.EditorPackage;
import com.euclideanspace.spad.editor.Expr;
import com.euclideanspace.spad.editor.IfStatement;
import com.euclideanspace.spad.editor.Statement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.spad.editor.impl.IfStatementImpl#getT2 <em>T2</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.IfStatementImpl#getS1 <em>S1</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.IfStatementImpl#getS2 <em>S2</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.IfStatementImpl#isB <em>B</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.IfStatementImpl#getS11 <em>S11</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.IfStatementImpl#getS12 <em>S12</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfStatementImpl extends MinimalEObjectImpl.Container implements IfStatement
{
  /**
   * The cached value of the '{@link #getT2() <em>T2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT2()
   * @generated
   * @ordered
   */
  protected Expr t2;

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
   * The cached value of the '{@link #getS2() <em>S2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getS2()
   * @generated
   * @ordered
   */
  protected Statement s2;

  /**
   * The default value of the '{@link #isB() <em>B</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isB()
   * @generated
   * @ordered
   */
  protected static final boolean B_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isB() <em>B</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isB()
   * @generated
   * @ordered
   */
  protected boolean b = B_EDEFAULT;

  /**
   * The cached value of the '{@link #getS11() <em>S11</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getS11()
   * @generated
   * @ordered
   */
  protected Statement s11;

  /**
   * The cached value of the '{@link #getS12() <em>S12</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getS12()
   * @generated
   * @ordered
   */
  protected Statement s12;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IfStatementImpl()
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
    return EditorPackage.Literals.IF_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getT2()
  {
    return t2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetT2(Expr newT2, NotificationChain msgs)
  {
    Expr oldT2 = t2;
    t2 = newT2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.IF_STATEMENT__T2, oldT2, newT2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT2(Expr newT2)
  {
    if (newT2 != t2)
    {
      NotificationChain msgs = null;
      if (t2 != null)
        msgs = ((InternalEObject)t2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.IF_STATEMENT__T2, null, msgs);
      if (newT2 != null)
        msgs = ((InternalEObject)newT2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.IF_STATEMENT__T2, null, msgs);
      msgs = basicSetT2(newT2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.IF_STATEMENT__T2, newT2, newT2));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.IF_STATEMENT__S1, oldS1, newS1);
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
        msgs = ((InternalEObject)s1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.IF_STATEMENT__S1, null, msgs);
      if (newS1 != null)
        msgs = ((InternalEObject)newS1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.IF_STATEMENT__S1, null, msgs);
      msgs = basicSetS1(newS1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.IF_STATEMENT__S1, newS1, newS1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement getS2()
  {
    return s2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetS2(Statement newS2, NotificationChain msgs)
  {
    Statement oldS2 = s2;
    s2 = newS2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.IF_STATEMENT__S2, oldS2, newS2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setS2(Statement newS2)
  {
    if (newS2 != s2)
    {
      NotificationChain msgs = null;
      if (s2 != null)
        msgs = ((InternalEObject)s2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.IF_STATEMENT__S2, null, msgs);
      if (newS2 != null)
        msgs = ((InternalEObject)newS2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.IF_STATEMENT__S2, null, msgs);
      msgs = basicSetS2(newS2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.IF_STATEMENT__S2, newS2, newS2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isB()
  {
    return b;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setB(boolean newB)
  {
    boolean oldB = b;
    b = newB;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.IF_STATEMENT__B, oldB, b));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement getS11()
  {
    return s11;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetS11(Statement newS11, NotificationChain msgs)
  {
    Statement oldS11 = s11;
    s11 = newS11;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.IF_STATEMENT__S11, oldS11, newS11);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setS11(Statement newS11)
  {
    if (newS11 != s11)
    {
      NotificationChain msgs = null;
      if (s11 != null)
        msgs = ((InternalEObject)s11).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.IF_STATEMENT__S11, null, msgs);
      if (newS11 != null)
        msgs = ((InternalEObject)newS11).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.IF_STATEMENT__S11, null, msgs);
      msgs = basicSetS11(newS11, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.IF_STATEMENT__S11, newS11, newS11));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement getS12()
  {
    return s12;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetS12(Statement newS12, NotificationChain msgs)
  {
    Statement oldS12 = s12;
    s12 = newS12;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.IF_STATEMENT__S12, oldS12, newS12);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setS12(Statement newS12)
  {
    if (newS12 != s12)
    {
      NotificationChain msgs = null;
      if (s12 != null)
        msgs = ((InternalEObject)s12).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.IF_STATEMENT__S12, null, msgs);
      if (newS12 != null)
        msgs = ((InternalEObject)newS12).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.IF_STATEMENT__S12, null, msgs);
      msgs = basicSetS12(newS12, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.IF_STATEMENT__S12, newS12, newS12));
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
      case EditorPackage.IF_STATEMENT__T2:
        return basicSetT2(null, msgs);
      case EditorPackage.IF_STATEMENT__S1:
        return basicSetS1(null, msgs);
      case EditorPackage.IF_STATEMENT__S2:
        return basicSetS2(null, msgs);
      case EditorPackage.IF_STATEMENT__S11:
        return basicSetS11(null, msgs);
      case EditorPackage.IF_STATEMENT__S12:
        return basicSetS12(null, msgs);
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
      case EditorPackage.IF_STATEMENT__T2:
        return getT2();
      case EditorPackage.IF_STATEMENT__S1:
        return getS1();
      case EditorPackage.IF_STATEMENT__S2:
        return getS2();
      case EditorPackage.IF_STATEMENT__B:
        return isB();
      case EditorPackage.IF_STATEMENT__S11:
        return getS11();
      case EditorPackage.IF_STATEMENT__S12:
        return getS12();
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
      case EditorPackage.IF_STATEMENT__T2:
        setT2((Expr)newValue);
        return;
      case EditorPackage.IF_STATEMENT__S1:
        setS1((Statement)newValue);
        return;
      case EditorPackage.IF_STATEMENT__S2:
        setS2((Statement)newValue);
        return;
      case EditorPackage.IF_STATEMENT__B:
        setB((Boolean)newValue);
        return;
      case EditorPackage.IF_STATEMENT__S11:
        setS11((Statement)newValue);
        return;
      case EditorPackage.IF_STATEMENT__S12:
        setS12((Statement)newValue);
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
      case EditorPackage.IF_STATEMENT__T2:
        setT2((Expr)null);
        return;
      case EditorPackage.IF_STATEMENT__S1:
        setS1((Statement)null);
        return;
      case EditorPackage.IF_STATEMENT__S2:
        setS2((Statement)null);
        return;
      case EditorPackage.IF_STATEMENT__B:
        setB(B_EDEFAULT);
        return;
      case EditorPackage.IF_STATEMENT__S11:
        setS11((Statement)null);
        return;
      case EditorPackage.IF_STATEMENT__S12:
        setS12((Statement)null);
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
      case EditorPackage.IF_STATEMENT__T2:
        return t2 != null;
      case EditorPackage.IF_STATEMENT__S1:
        return s1 != null;
      case EditorPackage.IF_STATEMENT__S2:
        return s2 != null;
      case EditorPackage.IF_STATEMENT__B:
        return b != B_EDEFAULT;
      case EditorPackage.IF_STATEMENT__S11:
        return s11 != null;
      case EditorPackage.IF_STATEMENT__S12:
        return s12 != null;
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
    result.append(" (b: ");
    result.append(b);
    result.append(')');
    return result.toString();
  }

} //IfStatementImpl
