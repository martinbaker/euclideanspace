/**
 */
package com.euclideanspace.aldor.editor.impl;

import com.euclideanspace.aldor.editor.ButExpr;
import com.euclideanspace.aldor.editor.Cases;
import com.euclideanspace.aldor.editor.DeclBinding;
import com.euclideanspace.aldor.editor.EditorPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>But Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.ButExprImpl#getDb <em>Db</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.ButExprImpl#getCa <em>Ca</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ButExprImpl extends MinimalEObjectImpl.Container implements ButExpr
{
  /**
   * The cached value of the '{@link #getDb() <em>Db</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDb()
   * @generated
   * @ordered
   */
  protected DeclBinding db;

  /**
   * The cached value of the '{@link #getCa() <em>Ca</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCa()
   * @generated
   * @ordered
   */
  protected Cases ca;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ButExprImpl()
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
    return EditorPackage.Literals.BUT_EXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeclBinding getDb()
  {
    return db;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDb(DeclBinding newDb, NotificationChain msgs)
  {
    DeclBinding oldDb = db;
    db = newDb;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.BUT_EXPR__DB, oldDb, newDb);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDb(DeclBinding newDb)
  {
    if (newDb != db)
    {
      NotificationChain msgs = null;
      if (db != null)
        msgs = ((InternalEObject)db).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.BUT_EXPR__DB, null, msgs);
      if (newDb != null)
        msgs = ((InternalEObject)newDb).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.BUT_EXPR__DB, null, msgs);
      msgs = basicSetDb(newDb, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.BUT_EXPR__DB, newDb, newDb));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Cases getCa()
  {
    return ca;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCa(Cases newCa, NotificationChain msgs)
  {
    Cases oldCa = ca;
    ca = newCa;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.BUT_EXPR__CA, oldCa, newCa);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCa(Cases newCa)
  {
    if (newCa != ca)
    {
      NotificationChain msgs = null;
      if (ca != null)
        msgs = ((InternalEObject)ca).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.BUT_EXPR__CA, null, msgs);
      if (newCa != null)
        msgs = ((InternalEObject)newCa).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.BUT_EXPR__CA, null, msgs);
      msgs = basicSetCa(newCa, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.BUT_EXPR__CA, newCa, newCa));
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
      case EditorPackage.BUT_EXPR__DB:
        return basicSetDb(null, msgs);
      case EditorPackage.BUT_EXPR__CA:
        return basicSetCa(null, msgs);
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
      case EditorPackage.BUT_EXPR__DB:
        return getDb();
      case EditorPackage.BUT_EXPR__CA:
        return getCa();
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
      case EditorPackage.BUT_EXPR__DB:
        setDb((DeclBinding)newValue);
        return;
      case EditorPackage.BUT_EXPR__CA:
        setCa((Cases)newValue);
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
      case EditorPackage.BUT_EXPR__DB:
        setDb((DeclBinding)null);
        return;
      case EditorPackage.BUT_EXPR__CA:
        setCa((Cases)null);
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
      case EditorPackage.BUT_EXPR__DB:
        return db != null;
      case EditorPackage.BUT_EXPR__CA:
        return ca != null;
    }
    return super.eIsSet(featureID);
  }

} //ButExprImpl
