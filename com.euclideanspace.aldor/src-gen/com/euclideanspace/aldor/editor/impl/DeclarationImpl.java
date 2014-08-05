/**
 */
package com.euclideanspace.aldor.editor.impl;

import com.euclideanspace.aldor.editor.Declaration;
import com.euclideanspace.aldor.editor.EditorPackage;
import com.euclideanspace.aldor.editor.ExportDecl;
import com.euclideanspace.aldor.editor.FromPart;
import com.euclideanspace.aldor.editor.MacroBody;
import com.euclideanspace.aldor.editor.Sig;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.DeclarationImpl#getMb <em>Mb</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.DeclarationImpl#getSi <em>Si</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.DeclarationImpl#getFp <em>Fp</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.DeclarationImpl#getEd <em>Ed</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeclarationImpl extends LabeledImpl implements Declaration
{
  /**
   * The cached value of the '{@link #getMb() <em>Mb</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMb()
   * @generated
   * @ordered
   */
  protected MacroBody mb;

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
  protected DeclarationImpl()
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
    return EditorPackage.Literals.DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MacroBody getMb()
  {
    return mb;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMb(MacroBody newMb, NotificationChain msgs)
  {
    MacroBody oldMb = mb;
    mb = newMb;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.DECLARATION__MB, oldMb, newMb);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMb(MacroBody newMb)
  {
    if (newMb != mb)
    {
      NotificationChain msgs = null;
      if (mb != null)
        msgs = ((InternalEObject)mb).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.DECLARATION__MB, null, msgs);
      if (newMb != null)
        msgs = ((InternalEObject)newMb).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.DECLARATION__MB, null, msgs);
      msgs = basicSetMb(newMb, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.DECLARATION__MB, newMb, newMb));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.DECLARATION__SI, oldSi, newSi);
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
        msgs = ((InternalEObject)si).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.DECLARATION__SI, null, msgs);
      if (newSi != null)
        msgs = ((InternalEObject)newSi).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.DECLARATION__SI, null, msgs);
      msgs = basicSetSi(newSi, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.DECLARATION__SI, newSi, newSi));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.DECLARATION__FP, oldFp, newFp);
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
        msgs = ((InternalEObject)fp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.DECLARATION__FP, null, msgs);
      if (newFp != null)
        msgs = ((InternalEObject)newFp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.DECLARATION__FP, null, msgs);
      msgs = basicSetFp(newFp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.DECLARATION__FP, newFp, newFp));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.DECLARATION__ED, oldEd, newEd);
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
        msgs = ((InternalEObject)ed).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.DECLARATION__ED, null, msgs);
      if (newEd != null)
        msgs = ((InternalEObject)newEd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.DECLARATION__ED, null, msgs);
      msgs = basicSetEd(newEd, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.DECLARATION__ED, newEd, newEd));
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
      case EditorPackage.DECLARATION__MB:
        return basicSetMb(null, msgs);
      case EditorPackage.DECLARATION__SI:
        return basicSetSi(null, msgs);
      case EditorPackage.DECLARATION__FP:
        return basicSetFp(null, msgs);
      case EditorPackage.DECLARATION__ED:
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
      case EditorPackage.DECLARATION__MB:
        return getMb();
      case EditorPackage.DECLARATION__SI:
        return getSi();
      case EditorPackage.DECLARATION__FP:
        return getFp();
      case EditorPackage.DECLARATION__ED:
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
      case EditorPackage.DECLARATION__MB:
        setMb((MacroBody)newValue);
        return;
      case EditorPackage.DECLARATION__SI:
        setSi((Sig)newValue);
        return;
      case EditorPackage.DECLARATION__FP:
        setFp((FromPart)newValue);
        return;
      case EditorPackage.DECLARATION__ED:
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
      case EditorPackage.DECLARATION__MB:
        setMb((MacroBody)null);
        return;
      case EditorPackage.DECLARATION__SI:
        setSi((Sig)null);
        return;
      case EditorPackage.DECLARATION__FP:
        setFp((FromPart)null);
        return;
      case EditorPackage.DECLARATION__ED:
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
      case EditorPackage.DECLARATION__MB:
        return mb != null;
      case EditorPackage.DECLARATION__SI:
        return si != null;
      case EditorPackage.DECLARATION__FP:
        return fp != null;
      case EditorPackage.DECLARATION__ED:
        return ed != null;
    }
    return super.eIsSet(featureID);
  }

} //DeclarationImpl
