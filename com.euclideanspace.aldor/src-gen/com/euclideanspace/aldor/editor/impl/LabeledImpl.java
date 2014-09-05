/**
 */
package com.euclideanspace.aldor.editor.impl;

import com.euclideanspace.aldor.editor.Atom;
import com.euclideanspace.aldor.editor.Comma;
import com.euclideanspace.aldor.editor.Declaration;
import com.euclideanspace.aldor.editor.EditorPackage;
import com.euclideanspace.aldor.editor.Labeled;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Labeled</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.LabeledImpl#getC <em>C</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.LabeledImpl#getD <em>D</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.LabeledImpl#getA <em>A</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.LabeledImpl#getLab <em>Lab</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LabeledImpl extends MinimalEObjectImpl.Container implements Labeled
{
  /**
   * The cached value of the '{@link #getC() <em>C</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getC()
   * @generated
   * @ordered
   */
  protected Comma c;

  /**
   * The cached value of the '{@link #getD() <em>D</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getD()
   * @generated
   * @ordered
   */
  protected Declaration d;

  /**
   * The cached value of the '{@link #getA() <em>A</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getA()
   * @generated
   * @ordered
   */
  protected Atom a;

  /**
   * The cached value of the '{@link #getLab() <em>Lab</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLab()
   * @generated
   * @ordered
   */
  protected Labeled lab;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LabeledImpl()
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
    return EditorPackage.Literals.LABELED;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Comma getC()
  {
    return c;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetC(Comma newC, NotificationChain msgs)
  {
    Comma oldC = c;
    c = newC;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.LABELED__C, oldC, newC);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setC(Comma newC)
  {
    if (newC != c)
    {
      NotificationChain msgs = null;
      if (c != null)
        msgs = ((InternalEObject)c).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.LABELED__C, null, msgs);
      if (newC != null)
        msgs = ((InternalEObject)newC).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.LABELED__C, null, msgs);
      msgs = basicSetC(newC, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.LABELED__C, newC, newC));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Declaration getD()
  {
    return d;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetD(Declaration newD, NotificationChain msgs)
  {
    Declaration oldD = d;
    d = newD;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.LABELED__D, oldD, newD);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setD(Declaration newD)
  {
    if (newD != d)
    {
      NotificationChain msgs = null;
      if (d != null)
        msgs = ((InternalEObject)d).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.LABELED__D, null, msgs);
      if (newD != null)
        msgs = ((InternalEObject)newD).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.LABELED__D, null, msgs);
      msgs = basicSetD(newD, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.LABELED__D, newD, newD));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Atom getA()
  {
    return a;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetA(Atom newA, NotificationChain msgs)
  {
    Atom oldA = a;
    a = newA;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.LABELED__A, oldA, newA);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setA(Atom newA)
  {
    if (newA != a)
    {
      NotificationChain msgs = null;
      if (a != null)
        msgs = ((InternalEObject)a).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.LABELED__A, null, msgs);
      if (newA != null)
        msgs = ((InternalEObject)newA).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.LABELED__A, null, msgs);
      msgs = basicSetA(newA, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.LABELED__A, newA, newA));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Labeled getLab()
  {
    return lab;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLab(Labeled newLab, NotificationChain msgs)
  {
    Labeled oldLab = lab;
    lab = newLab;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.LABELED__LAB, oldLab, newLab);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLab(Labeled newLab)
  {
    if (newLab != lab)
    {
      NotificationChain msgs = null;
      if (lab != null)
        msgs = ((InternalEObject)lab).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.LABELED__LAB, null, msgs);
      if (newLab != null)
        msgs = ((InternalEObject)newLab).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.LABELED__LAB, null, msgs);
      msgs = basicSetLab(newLab, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.LABELED__LAB, newLab, newLab));
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
      case EditorPackage.LABELED__C:
        return basicSetC(null, msgs);
      case EditorPackage.LABELED__D:
        return basicSetD(null, msgs);
      case EditorPackage.LABELED__A:
        return basicSetA(null, msgs);
      case EditorPackage.LABELED__LAB:
        return basicSetLab(null, msgs);
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
      case EditorPackage.LABELED__C:
        return getC();
      case EditorPackage.LABELED__D:
        return getD();
      case EditorPackage.LABELED__A:
        return getA();
      case EditorPackage.LABELED__LAB:
        return getLab();
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
      case EditorPackage.LABELED__C:
        setC((Comma)newValue);
        return;
      case EditorPackage.LABELED__D:
        setD((Declaration)newValue);
        return;
      case EditorPackage.LABELED__A:
        setA((Atom)newValue);
        return;
      case EditorPackage.LABELED__LAB:
        setLab((Labeled)newValue);
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
      case EditorPackage.LABELED__C:
        setC((Comma)null);
        return;
      case EditorPackage.LABELED__D:
        setD((Declaration)null);
        return;
      case EditorPackage.LABELED__A:
        setA((Atom)null);
        return;
      case EditorPackage.LABELED__LAB:
        setLab((Labeled)null);
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
      case EditorPackage.LABELED__C:
        return c != null;
      case EditorPackage.LABELED__D:
        return d != null;
      case EditorPackage.LABELED__A:
        return a != null;
      case EditorPackage.LABELED__LAB:
        return lab != null;
    }
    return super.eIsSet(featureID);
  }

} //LabeledImpl
