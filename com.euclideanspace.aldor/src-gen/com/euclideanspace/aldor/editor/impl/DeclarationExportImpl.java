/**
 */
package com.euclideanspace.aldor.editor.impl;

import com.euclideanspace.aldor.editor.DeclarationExport;
import com.euclideanspace.aldor.editor.EditorPackage;
import com.euclideanspace.aldor.editor.ExportDecl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Declaration Export</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.DeclarationExportImpl#getEd <em>Ed</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeclarationExportImpl extends DeclarationImpl implements DeclarationExport
{
  /**
   * The cached value of the '{@link #getEd() <em>Ed</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEd()
   * @generated
   * @ordered
   */
  protected ExportDecl ed;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeclarationExportImpl()
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
    return EditorPackage.Literals.DECLARATION_EXPORT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExportDecl getEd()
  {
    return ed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEd(ExportDecl newEd, NotificationChain msgs)
  {
    ExportDecl oldEd = ed;
    ed = newEd;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.DECLARATION_EXPORT__ED, oldEd, newEd);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEd(ExportDecl newEd)
  {
    if (newEd != ed)
    {
      NotificationChain msgs = null;
      if (ed != null)
        msgs = ((InternalEObject)ed).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.DECLARATION_EXPORT__ED, null, msgs);
      if (newEd != null)
        msgs = ((InternalEObject)newEd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.DECLARATION_EXPORT__ED, null, msgs);
      msgs = basicSetEd(newEd, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.DECLARATION_EXPORT__ED, newEd, newEd));
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
      case EditorPackage.DECLARATION_EXPORT__ED:
        return basicSetEd(null, msgs);
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
      case EditorPackage.DECLARATION_EXPORT__ED:
        return getEd();
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
      case EditorPackage.DECLARATION_EXPORT__ED:
        setEd((ExportDecl)newValue);
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
      case EditorPackage.DECLARATION_EXPORT__ED:
        setEd((ExportDecl)null);
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
      case EditorPackage.DECLARATION_EXPORT__ED:
        return ed != null;
    }
    return super.eIsSet(featureID);
  }

} //DeclarationExportImpl
