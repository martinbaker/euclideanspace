/**
 */
package com.euclideanspace.aldor.editor.impl;

import com.euclideanspace.aldor.editor.EditorPackage;
import com.euclideanspace.aldor.editor.IfElseStatement;
import com.euclideanspace.aldor.editor.Statement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Else Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.IfElseStatementImpl#getS2 <em>S2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfElseStatementImpl extends MinimalEObjectImpl.Container implements IfElseStatement
{
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IfElseStatementImpl()
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
    return EditorPackage.Literals.IF_ELSE_STATEMENT;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.IF_ELSE_STATEMENT__S2, oldS2, newS2);
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
        msgs = ((InternalEObject)s2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.IF_ELSE_STATEMENT__S2, null, msgs);
      if (newS2 != null)
        msgs = ((InternalEObject)newS2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.IF_ELSE_STATEMENT__S2, null, msgs);
      msgs = basicSetS2(newS2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.IF_ELSE_STATEMENT__S2, newS2, newS2));
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
      case EditorPackage.IF_ELSE_STATEMENT__S2:
        return basicSetS2(null, msgs);
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
      case EditorPackage.IF_ELSE_STATEMENT__S2:
        return getS2();
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
      case EditorPackage.IF_ELSE_STATEMENT__S2:
        setS2((Statement)newValue);
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
      case EditorPackage.IF_ELSE_STATEMENT__S2:
        setS2((Statement)null);
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
      case EditorPackage.IF_ELSE_STATEMENT__S2:
        return s2 != null;
    }
    return super.eIsSet(featureID);
  }

} //IfElseStatementImpl
