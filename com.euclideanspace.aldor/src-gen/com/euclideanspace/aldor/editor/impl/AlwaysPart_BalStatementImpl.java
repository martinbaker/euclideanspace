/**
 */
package com.euclideanspace.aldor.editor.impl;

import com.euclideanspace.aldor.editor.AlwaysPart_BalStatement;
import com.euclideanspace.aldor.editor.Binding_BalStatement;
import com.euclideanspace.aldor.editor.EditorPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Always Part Bal Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.AlwaysPart_BalStatementImpl#getBas7 <em>Bas7</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AlwaysPart_BalStatementImpl extends MinimalEObjectImpl.Container implements AlwaysPart_BalStatement
{
  /**
   * The cached value of the '{@link #getBas7() <em>Bas7</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBas7()
   * @generated
   * @ordered
   */
  protected Binding_BalStatement bas7;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AlwaysPart_BalStatementImpl()
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
    return EditorPackage.Literals.ALWAYS_PART_BAL_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Binding_BalStatement getBas7()
  {
    return bas7;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBas7(Binding_BalStatement newBas7, NotificationChain msgs)
  {
    Binding_BalStatement oldBas7 = bas7;
    bas7 = newBas7;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.ALWAYS_PART_BAL_STATEMENT__BAS7, oldBas7, newBas7);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBas7(Binding_BalStatement newBas7)
  {
    if (newBas7 != bas7)
    {
      NotificationChain msgs = null;
      if (bas7 != null)
        msgs = ((InternalEObject)bas7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.ALWAYS_PART_BAL_STATEMENT__BAS7, null, msgs);
      if (newBas7 != null)
        msgs = ((InternalEObject)newBas7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.ALWAYS_PART_BAL_STATEMENT__BAS7, null, msgs);
      msgs = basicSetBas7(newBas7, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.ALWAYS_PART_BAL_STATEMENT__BAS7, newBas7, newBas7));
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
      case EditorPackage.ALWAYS_PART_BAL_STATEMENT__BAS7:
        return basicSetBas7(null, msgs);
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
      case EditorPackage.ALWAYS_PART_BAL_STATEMENT__BAS7:
        return getBas7();
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
      case EditorPackage.ALWAYS_PART_BAL_STATEMENT__BAS7:
        setBas7((Binding_BalStatement)newValue);
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
      case EditorPackage.ALWAYS_PART_BAL_STATEMENT__BAS7:
        setBas7((Binding_BalStatement)null);
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
      case EditorPackage.ALWAYS_PART_BAL_STATEMENT__BAS7:
        return bas7 != null;
    }
    return super.eIsSet(featureID);
  }

} //AlwaysPart_BalStatementImpl
