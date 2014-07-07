/**
 */
package com.euclideanspace.aldor.editor.impl;

import com.euclideanspace.aldor.editor.Binding_BalStatement;
import com.euclideanspace.aldor.editor.EditorPackage;
import com.euclideanspace.aldor.editor.Flow_BalStatement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow Bal Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.Flow_BalStatementImpl#getBbs5 <em>Bbs5</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Flow_BalStatementImpl extends BalStatementImpl implements Flow_BalStatement
{
  /**
   * The cached value of the '{@link #getBbs5() <em>Bbs5</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBbs5()
   * @generated
   * @ordered
   */
  protected Binding_BalStatement bbs5;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Flow_BalStatementImpl()
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
    return EditorPackage.Literals.FLOW_BAL_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Binding_BalStatement getBbs5()
  {
    return bbs5;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBbs5(Binding_BalStatement newBbs5, NotificationChain msgs)
  {
    Binding_BalStatement oldBbs5 = bbs5;
    bbs5 = newBbs5;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.FLOW_BAL_STATEMENT__BBS5, oldBbs5, newBbs5);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBbs5(Binding_BalStatement newBbs5)
  {
    if (newBbs5 != bbs5)
    {
      NotificationChain msgs = null;
      if (bbs5 != null)
        msgs = ((InternalEObject)bbs5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.FLOW_BAL_STATEMENT__BBS5, null, msgs);
      if (newBbs5 != null)
        msgs = ((InternalEObject)newBbs5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.FLOW_BAL_STATEMENT__BBS5, null, msgs);
      msgs = basicSetBbs5(newBbs5, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.FLOW_BAL_STATEMENT__BBS5, newBbs5, newBbs5));
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
      case EditorPackage.FLOW_BAL_STATEMENT__BBS5:
        return basicSetBbs5(null, msgs);
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
      case EditorPackage.FLOW_BAL_STATEMENT__BBS5:
        return getBbs5();
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
      case EditorPackage.FLOW_BAL_STATEMENT__BBS5:
        setBbs5((Binding_BalStatement)newValue);
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
      case EditorPackage.FLOW_BAL_STATEMENT__BBS5:
        setBbs5((Binding_BalStatement)null);
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
      case EditorPackage.FLOW_BAL_STATEMENT__BBS5:
        return bbs5 != null;
    }
    return super.eIsSet(featureID);
  }

} //Flow_BalStatementImpl
