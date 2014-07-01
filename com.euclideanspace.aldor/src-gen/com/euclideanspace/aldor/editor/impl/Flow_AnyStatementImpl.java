/**
 */
package com.euclideanspace.aldor.editor.impl;

import com.euclideanspace.aldor.editor.Binding_AnyStatement;
import com.euclideanspace.aldor.editor.EditorPackage;
import com.euclideanspace.aldor.editor.Flow_AnyStatement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow Any Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.Flow_AnyStatementImpl#getBas3 <em>Bas3</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Flow_AnyStatementImpl extends MinimalEObjectImpl.Container implements Flow_AnyStatement
{
  /**
   * The cached value of the '{@link #getBas3() <em>Bas3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBas3()
   * @generated
   * @ordered
   */
  protected Binding_AnyStatement bas3;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Flow_AnyStatementImpl()
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
    return EditorPackage.Literals.FLOW_ANY_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Binding_AnyStatement getBas3()
  {
    return bas3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBas3(Binding_AnyStatement newBas3, NotificationChain msgs)
  {
    Binding_AnyStatement oldBas3 = bas3;
    bas3 = newBas3;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.FLOW_ANY_STATEMENT__BAS3, oldBas3, newBas3);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBas3(Binding_AnyStatement newBas3)
  {
    if (newBas3 != bas3)
    {
      NotificationChain msgs = null;
      if (bas3 != null)
        msgs = ((InternalEObject)bas3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.FLOW_ANY_STATEMENT__BAS3, null, msgs);
      if (newBas3 != null)
        msgs = ((InternalEObject)newBas3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.FLOW_ANY_STATEMENT__BAS3, null, msgs);
      msgs = basicSetBas3(newBas3, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.FLOW_ANY_STATEMENT__BAS3, newBas3, newBas3));
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
      case EditorPackage.FLOW_ANY_STATEMENT__BAS3:
        return basicSetBas3(null, msgs);
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
      case EditorPackage.FLOW_ANY_STATEMENT__BAS3:
        return getBas3();
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
      case EditorPackage.FLOW_ANY_STATEMENT__BAS3:
        setBas3((Binding_AnyStatement)newValue);
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
      case EditorPackage.FLOW_ANY_STATEMENT__BAS3:
        setBas3((Binding_AnyStatement)null);
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
      case EditorPackage.FLOW_ANY_STATEMENT__BAS3:
        return bas3 != null;
    }
    return super.eIsSet(featureID);
  }

} //Flow_AnyStatementImpl
