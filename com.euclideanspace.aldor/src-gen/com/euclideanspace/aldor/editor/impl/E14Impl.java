/**
 */
package com.euclideanspace.aldor.editor.impl;

import com.euclideanspace.aldor.editor.DeclMolecule;
import com.euclideanspace.aldor.editor.E14;
import com.euclideanspace.aldor.editor.E15;
import com.euclideanspace.aldor.editor.EditorPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>E14</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.E14Impl#getE15left <em>E1 5left</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.E14Impl#getDm <em>Dm</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.E14Impl#getE15right <em>E1 5right</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class E14Impl extends ExprImpl implements E14
{
  /**
   * The cached value of the '{@link #getE15left() <em>E1 5left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getE15left()
   * @generated
   * @ordered
   */
  protected E15 e15left;

  /**
   * The cached value of the '{@link #getDm() <em>Dm</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDm()
   * @generated
   * @ordered
   */
  protected DeclMolecule dm;

  /**
   * The cached value of the '{@link #getE15right() <em>E1 5right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getE15right()
   * @generated
   * @ordered
   */
  protected E15 e15right;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected E14Impl()
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
    return EditorPackage.Literals.E14;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public E15 getE15left()
  {
    return e15left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetE15left(E15 newE15left, NotificationChain msgs)
  {
    E15 oldE15left = e15left;
    e15left = newE15left;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.E14__E15LEFT, oldE15left, newE15left);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setE15left(E15 newE15left)
  {
    if (newE15left != e15left)
    {
      NotificationChain msgs = null;
      if (e15left != null)
        msgs = ((InternalEObject)e15left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.E14__E15LEFT, null, msgs);
      if (newE15left != null)
        msgs = ((InternalEObject)newE15left).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.E14__E15LEFT, null, msgs);
      msgs = basicSetE15left(newE15left, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.E14__E15LEFT, newE15left, newE15left));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeclMolecule getDm()
  {
    return dm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDm(DeclMolecule newDm, NotificationChain msgs)
  {
    DeclMolecule oldDm = dm;
    dm = newDm;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.E14__DM, oldDm, newDm);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDm(DeclMolecule newDm)
  {
    if (newDm != dm)
    {
      NotificationChain msgs = null;
      if (dm != null)
        msgs = ((InternalEObject)dm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.E14__DM, null, msgs);
      if (newDm != null)
        msgs = ((InternalEObject)newDm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.E14__DM, null, msgs);
      msgs = basicSetDm(newDm, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.E14__DM, newDm, newDm));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public E15 getE15right()
  {
    return e15right;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetE15right(E15 newE15right, NotificationChain msgs)
  {
    E15 oldE15right = e15right;
    e15right = newE15right;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.E14__E15RIGHT, oldE15right, newE15right);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setE15right(E15 newE15right)
  {
    if (newE15right != e15right)
    {
      NotificationChain msgs = null;
      if (e15right != null)
        msgs = ((InternalEObject)e15right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.E14__E15RIGHT, null, msgs);
      if (newE15right != null)
        msgs = ((InternalEObject)newE15right).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.E14__E15RIGHT, null, msgs);
      msgs = basicSetE15right(newE15right, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.E14__E15RIGHT, newE15right, newE15right));
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
      case EditorPackage.E14__E15LEFT:
        return basicSetE15left(null, msgs);
      case EditorPackage.E14__DM:
        return basicSetDm(null, msgs);
      case EditorPackage.E14__E15RIGHT:
        return basicSetE15right(null, msgs);
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
      case EditorPackage.E14__E15LEFT:
        return getE15left();
      case EditorPackage.E14__DM:
        return getDm();
      case EditorPackage.E14__E15RIGHT:
        return getE15right();
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
      case EditorPackage.E14__E15LEFT:
        setE15left((E15)newValue);
        return;
      case EditorPackage.E14__DM:
        setDm((DeclMolecule)newValue);
        return;
      case EditorPackage.E14__E15RIGHT:
        setE15right((E15)newValue);
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
      case EditorPackage.E14__E15LEFT:
        setE15left((E15)null);
        return;
      case EditorPackage.E14__DM:
        setDm((DeclMolecule)null);
        return;
      case EditorPackage.E14__E15RIGHT:
        setE15right((E15)null);
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
      case EditorPackage.E14__E15LEFT:
        return e15left != null;
      case EditorPackage.E14__DM:
        return dm != null;
      case EditorPackage.E14__E15RIGHT:
        return e15right != null;
    }
    return super.eIsSet(featureID);
  }

} //E14Impl
