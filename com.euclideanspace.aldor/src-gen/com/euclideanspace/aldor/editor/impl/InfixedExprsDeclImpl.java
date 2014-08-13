/**
 */
package com.euclideanspace.aldor.editor.impl;

import com.euclideanspace.aldor.editor.Binding_AnyStatement;
import com.euclideanspace.aldor.editor.EditorPackage;
import com.euclideanspace.aldor.editor.InfixedExprsDecl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Infixed Exprs Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.InfixedExprsDeclImpl#getBas <em>Bas</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InfixedExprsDeclImpl extends BindingR_InfixedExprsDecl_AnyStatementImpl implements InfixedExprsDecl
{
  /**
   * The cached value of the '{@link #getBas() <em>Bas</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBas()
   * @generated
   * @ordered
   */
  protected Binding_AnyStatement bas;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InfixedExprsDeclImpl()
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
    return EditorPackage.Literals.INFIXED_EXPRS_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Binding_AnyStatement getBas()
  {
    return bas;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBas(Binding_AnyStatement newBas, NotificationChain msgs)
  {
    Binding_AnyStatement oldBas = bas;
    bas = newBas;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.INFIXED_EXPRS_DECL__BAS, oldBas, newBas);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBas(Binding_AnyStatement newBas)
  {
    if (newBas != bas)
    {
      NotificationChain msgs = null;
      if (bas != null)
        msgs = ((InternalEObject)bas).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.INFIXED_EXPRS_DECL__BAS, null, msgs);
      if (newBas != null)
        msgs = ((InternalEObject)newBas).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.INFIXED_EXPRS_DECL__BAS, null, msgs);
      msgs = basicSetBas(newBas, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.INFIXED_EXPRS_DECL__BAS, newBas, newBas));
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
      case EditorPackage.INFIXED_EXPRS_DECL__BAS:
        return basicSetBas(null, msgs);
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
      case EditorPackage.INFIXED_EXPRS_DECL__BAS:
        return getBas();
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
      case EditorPackage.INFIXED_EXPRS_DECL__BAS:
        setBas((Binding_AnyStatement)newValue);
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
      case EditorPackage.INFIXED_EXPRS_DECL__BAS:
        setBas((Binding_AnyStatement)null);
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
      case EditorPackage.INFIXED_EXPRS_DECL__BAS:
        return bas != null;
    }
    return super.eIsSet(featureID);
  }

} //InfixedExprsDeclImpl
