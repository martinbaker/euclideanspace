/**
 */
package com.euclideanspace.aldor.editor.impl;

import com.euclideanspace.aldor.editor.Atom;
import com.euclideanspace.aldor.editor.EditorPackage;
import com.euclideanspace.aldor.editor.Id;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atom</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.AtomImpl#getIden <em>Iden</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.AtomImpl#getLit <em>Lit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AtomImpl extends MoleculeImpl implements Atom
{
  /**
   * The cached value of the '{@link #getIden() <em>Iden</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIden()
   * @generated
   * @ordered
   */
  protected Id iden;

  /**
   * The default value of the '{@link #getLit() <em>Lit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLit()
   * @generated
   * @ordered
   */
  protected static final String LIT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLit() <em>Lit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLit()
   * @generated
   * @ordered
   */
  protected String lit = LIT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AtomImpl()
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
    return EditorPackage.Literals.ATOM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Id getIden()
  {
    return iden;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIden(Id newIden, NotificationChain msgs)
  {
    Id oldIden = iden;
    iden = newIden;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.ATOM__IDEN, oldIden, newIden);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIden(Id newIden)
  {
    if (newIden != iden)
    {
      NotificationChain msgs = null;
      if (iden != null)
        msgs = ((InternalEObject)iden).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.ATOM__IDEN, null, msgs);
      if (newIden != null)
        msgs = ((InternalEObject)newIden).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.ATOM__IDEN, null, msgs);
      msgs = basicSetIden(newIden, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.ATOM__IDEN, newIden, newIden));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLit()
  {
    return lit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLit(String newLit)
  {
    String oldLit = lit;
    lit = newLit;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.ATOM__LIT, oldLit, lit));
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
      case EditorPackage.ATOM__IDEN:
        return basicSetIden(null, msgs);
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
      case EditorPackage.ATOM__IDEN:
        return getIden();
      case EditorPackage.ATOM__LIT:
        return getLit();
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
      case EditorPackage.ATOM__IDEN:
        setIden((Id)newValue);
        return;
      case EditorPackage.ATOM__LIT:
        setLit((String)newValue);
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
      case EditorPackage.ATOM__IDEN:
        setIden((Id)null);
        return;
      case EditorPackage.ATOM__LIT:
        setLit(LIT_EDEFAULT);
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
      case EditorPackage.ATOM__IDEN:
        return iden != null;
      case EditorPackage.ATOM__LIT:
        return LIT_EDEFAULT == null ? lit != null : !LIT_EDEFAULT.equals(lit);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (lit: ");
    result.append(lit);
    result.append(')');
    return result.toString();
  }

} //AtomImpl
