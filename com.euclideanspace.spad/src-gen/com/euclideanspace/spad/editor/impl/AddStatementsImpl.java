/**
 */
package com.euclideanspace.spad.editor.impl;

import com.euclideanspace.spad.editor.AddStatements;
import com.euclideanspace.spad.editor.EditorPackage;
import com.euclideanspace.spad.editor.Expr;
import com.euclideanspace.spad.editor.FunctionDefinitionBlock;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add Statements</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.spad.editor.impl.AddStatementsImpl#getT1 <em>T1</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.AddStatementsImpl#getT13 <em>T13</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.AddStatementsImpl#getT14 <em>T14</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AddStatementsImpl extends MinimalEObjectImpl.Container implements AddStatements
{
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
   * The cached value of the '{@link #getT13() <em>T13</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT13()
   * @generated
   * @ordered
   */
  protected FunctionDefinitionBlock t13;

  /**
   * The cached value of the '{@link #getT14() <em>T14</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT14()
   * @generated
   * @ordered
   */
  protected FunctionDefinitionBlock t14;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AddStatementsImpl()
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
    return EditorPackage.Literals.ADD_STATEMENTS;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.ADD_STATEMENTS__T1, oldT1, newT1);
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
        msgs = ((InternalEObject)t1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.ADD_STATEMENTS__T1, null, msgs);
      if (newT1 != null)
        msgs = ((InternalEObject)newT1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.ADD_STATEMENTS__T1, null, msgs);
      msgs = basicSetT1(newT1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.ADD_STATEMENTS__T1, newT1, newT1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionDefinitionBlock getT13()
  {
    return t13;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetT13(FunctionDefinitionBlock newT13, NotificationChain msgs)
  {
    FunctionDefinitionBlock oldT13 = t13;
    t13 = newT13;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.ADD_STATEMENTS__T13, oldT13, newT13);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT13(FunctionDefinitionBlock newT13)
  {
    if (newT13 != t13)
    {
      NotificationChain msgs = null;
      if (t13 != null)
        msgs = ((InternalEObject)t13).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.ADD_STATEMENTS__T13, null, msgs);
      if (newT13 != null)
        msgs = ((InternalEObject)newT13).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.ADD_STATEMENTS__T13, null, msgs);
      msgs = basicSetT13(newT13, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.ADD_STATEMENTS__T13, newT13, newT13));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionDefinitionBlock getT14()
  {
    return t14;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetT14(FunctionDefinitionBlock newT14, NotificationChain msgs)
  {
    FunctionDefinitionBlock oldT14 = t14;
    t14 = newT14;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.ADD_STATEMENTS__T14, oldT14, newT14);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT14(FunctionDefinitionBlock newT14)
  {
    if (newT14 != t14)
    {
      NotificationChain msgs = null;
      if (t14 != null)
        msgs = ((InternalEObject)t14).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.ADD_STATEMENTS__T14, null, msgs);
      if (newT14 != null)
        msgs = ((InternalEObject)newT14).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.ADD_STATEMENTS__T14, null, msgs);
      msgs = basicSetT14(newT14, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.ADD_STATEMENTS__T14, newT14, newT14));
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
      case EditorPackage.ADD_STATEMENTS__T1:
        return basicSetT1(null, msgs);
      case EditorPackage.ADD_STATEMENTS__T13:
        return basicSetT13(null, msgs);
      case EditorPackage.ADD_STATEMENTS__T14:
        return basicSetT14(null, msgs);
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
      case EditorPackage.ADD_STATEMENTS__T1:
        return getT1();
      case EditorPackage.ADD_STATEMENTS__T13:
        return getT13();
      case EditorPackage.ADD_STATEMENTS__T14:
        return getT14();
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
      case EditorPackage.ADD_STATEMENTS__T1:
        setT1((Expr)newValue);
        return;
      case EditorPackage.ADD_STATEMENTS__T13:
        setT13((FunctionDefinitionBlock)newValue);
        return;
      case EditorPackage.ADD_STATEMENTS__T14:
        setT14((FunctionDefinitionBlock)newValue);
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
      case EditorPackage.ADD_STATEMENTS__T1:
        setT1((Expr)null);
        return;
      case EditorPackage.ADD_STATEMENTS__T13:
        setT13((FunctionDefinitionBlock)null);
        return;
      case EditorPackage.ADD_STATEMENTS__T14:
        setT14((FunctionDefinitionBlock)null);
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
      case EditorPackage.ADD_STATEMENTS__T1:
        return t1 != null;
      case EditorPackage.ADD_STATEMENTS__T13:
        return t13 != null;
      case EditorPackage.ADD_STATEMENTS__T14:
        return t14 != null;
    }
    return super.eIsSet(featureID);
  }

} //AddStatementsImpl
