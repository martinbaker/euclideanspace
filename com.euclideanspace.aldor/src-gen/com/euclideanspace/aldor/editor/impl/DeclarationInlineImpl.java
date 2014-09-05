/**
 */
package com.euclideanspace.aldor.editor.impl;

import com.euclideanspace.aldor.editor.DeclarationInline;
import com.euclideanspace.aldor.editor.EditorPackage;
import com.euclideanspace.aldor.editor.FromPart;
import com.euclideanspace.aldor.editor.Sig;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Declaration Inline</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.DeclarationInlineImpl#getSi <em>Si</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.DeclarationInlineImpl#getFp <em>Fp</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeclarationInlineImpl extends DeclarationImpl implements DeclarationInline
{
  /**
   * The cached value of the '{@link #getSi() <em>Si</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSi()
   * @generated
   * @ordered
   */
  protected Sig si;

  /**
   * The cached value of the '{@link #getFp() <em>Fp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFp()
   * @generated
   * @ordered
   */
  protected FromPart fp;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeclarationInlineImpl()
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
    return EditorPackage.Literals.DECLARATION_INLINE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Sig getSi()
  {
    return si;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSi(Sig newSi, NotificationChain msgs)
  {
    Sig oldSi = si;
    si = newSi;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.DECLARATION_INLINE__SI, oldSi, newSi);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSi(Sig newSi)
  {
    if (newSi != si)
    {
      NotificationChain msgs = null;
      if (si != null)
        msgs = ((InternalEObject)si).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.DECLARATION_INLINE__SI, null, msgs);
      if (newSi != null)
        msgs = ((InternalEObject)newSi).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.DECLARATION_INLINE__SI, null, msgs);
      msgs = basicSetSi(newSi, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.DECLARATION_INLINE__SI, newSi, newSi));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FromPart getFp()
  {
    return fp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFp(FromPart newFp, NotificationChain msgs)
  {
    FromPart oldFp = fp;
    fp = newFp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.DECLARATION_INLINE__FP, oldFp, newFp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFp(FromPart newFp)
  {
    if (newFp != fp)
    {
      NotificationChain msgs = null;
      if (fp != null)
        msgs = ((InternalEObject)fp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.DECLARATION_INLINE__FP, null, msgs);
      if (newFp != null)
        msgs = ((InternalEObject)newFp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.DECLARATION_INLINE__FP, null, msgs);
      msgs = basicSetFp(newFp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.DECLARATION_INLINE__FP, newFp, newFp));
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
      case EditorPackage.DECLARATION_INLINE__SI:
        return basicSetSi(null, msgs);
      case EditorPackage.DECLARATION_INLINE__FP:
        return basicSetFp(null, msgs);
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
      case EditorPackage.DECLARATION_INLINE__SI:
        return getSi();
      case EditorPackage.DECLARATION_INLINE__FP:
        return getFp();
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
      case EditorPackage.DECLARATION_INLINE__SI:
        setSi((Sig)newValue);
        return;
      case EditorPackage.DECLARATION_INLINE__FP:
        setFp((FromPart)newValue);
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
      case EditorPackage.DECLARATION_INLINE__SI:
        setSi((Sig)null);
        return;
      case EditorPackage.DECLARATION_INLINE__FP:
        setFp((FromPart)null);
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
      case EditorPackage.DECLARATION_INLINE__SI:
        return si != null;
      case EditorPackage.DECLARATION_INLINE__FP:
        return fp != null;
    }
    return super.eIsSet(featureID);
  }

} //DeclarationInlineImpl
