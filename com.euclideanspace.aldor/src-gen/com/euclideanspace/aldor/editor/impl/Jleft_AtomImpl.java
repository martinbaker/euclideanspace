/**
 */
package com.euclideanspace.aldor.editor.impl;

import com.euclideanspace.aldor.editor.Atom;
import com.euclideanspace.aldor.editor.BlockEnclosure;
import com.euclideanspace.aldor.editor.BlockMolecule;
import com.euclideanspace.aldor.editor.EditorPackage;
import com.euclideanspace.aldor.editor.Jleft_Atom;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Jleft Atom</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.Jleft_AtomImpl#getBe <em>Be</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.Jleft_AtomImpl#getA <em>A</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.Jleft_AtomImpl#getBm4 <em>Bm4</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.Jleft_AtomImpl#getA2 <em>A2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Jleft_AtomImpl extends MinimalEObjectImpl.Container implements Jleft_Atom
{
  /**
   * The cached value of the '{@link #getBe() <em>Be</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBe()
   * @generated
   * @ordered
   */
  protected EList<BlockEnclosure> be;

  /**
   * The default value of the '{@link #getA() <em>A</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getA()
   * @generated
   * @ordered
   */
  protected static final String A_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getA() <em>A</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getA()
   * @generated
   * @ordered
   */
  protected String a = A_EDEFAULT;

  /**
   * The cached value of the '{@link #getBm4() <em>Bm4</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBm4()
   * @generated
   * @ordered
   */
  protected EList<BlockMolecule> bm4;

  /**
   * The cached value of the '{@link #getA2() <em>A2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getA2()
   * @generated
   * @ordered
   */
  protected Atom a2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Jleft_AtomImpl()
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
    return EditorPackage.Literals.JLEFT_ATOM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BlockEnclosure> getBe()
  {
    if (be == null)
    {
      be = new EObjectContainmentEList<BlockEnclosure>(BlockEnclosure.class, this, EditorPackage.JLEFT_ATOM__BE);
    }
    return be;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getA()
  {
    return a;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setA(String newA)
  {
    String oldA = a;
    a = newA;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.JLEFT_ATOM__A, oldA, a));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BlockMolecule> getBm4()
  {
    if (bm4 == null)
    {
      bm4 = new EObjectContainmentEList<BlockMolecule>(BlockMolecule.class, this, EditorPackage.JLEFT_ATOM__BM4);
    }
    return bm4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Atom getA2()
  {
    return a2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetA2(Atom newA2, NotificationChain msgs)
  {
    Atom oldA2 = a2;
    a2 = newA2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.JLEFT_ATOM__A2, oldA2, newA2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setA2(Atom newA2)
  {
    if (newA2 != a2)
    {
      NotificationChain msgs = null;
      if (a2 != null)
        msgs = ((InternalEObject)a2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.JLEFT_ATOM__A2, null, msgs);
      if (newA2 != null)
        msgs = ((InternalEObject)newA2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.JLEFT_ATOM__A2, null, msgs);
      msgs = basicSetA2(newA2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.JLEFT_ATOM__A2, newA2, newA2));
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
      case EditorPackage.JLEFT_ATOM__BE:
        return ((InternalEList<?>)getBe()).basicRemove(otherEnd, msgs);
      case EditorPackage.JLEFT_ATOM__BM4:
        return ((InternalEList<?>)getBm4()).basicRemove(otherEnd, msgs);
      case EditorPackage.JLEFT_ATOM__A2:
        return basicSetA2(null, msgs);
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
      case EditorPackage.JLEFT_ATOM__BE:
        return getBe();
      case EditorPackage.JLEFT_ATOM__A:
        return getA();
      case EditorPackage.JLEFT_ATOM__BM4:
        return getBm4();
      case EditorPackage.JLEFT_ATOM__A2:
        return getA2();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EditorPackage.JLEFT_ATOM__BE:
        getBe().clear();
        getBe().addAll((Collection<? extends BlockEnclosure>)newValue);
        return;
      case EditorPackage.JLEFT_ATOM__A:
        setA((String)newValue);
        return;
      case EditorPackage.JLEFT_ATOM__BM4:
        getBm4().clear();
        getBm4().addAll((Collection<? extends BlockMolecule>)newValue);
        return;
      case EditorPackage.JLEFT_ATOM__A2:
        setA2((Atom)newValue);
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
      case EditorPackage.JLEFT_ATOM__BE:
        getBe().clear();
        return;
      case EditorPackage.JLEFT_ATOM__A:
        setA(A_EDEFAULT);
        return;
      case EditorPackage.JLEFT_ATOM__BM4:
        getBm4().clear();
        return;
      case EditorPackage.JLEFT_ATOM__A2:
        setA2((Atom)null);
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
      case EditorPackage.JLEFT_ATOM__BE:
        return be != null && !be.isEmpty();
      case EditorPackage.JLEFT_ATOM__A:
        return A_EDEFAULT == null ? a != null : !A_EDEFAULT.equals(a);
      case EditorPackage.JLEFT_ATOM__BM4:
        return bm4 != null && !bm4.isEmpty();
      case EditorPackage.JLEFT_ATOM__A2:
        return a2 != null;
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
    result.append(" (a: ");
    result.append(a);
    result.append(')');
    return result.toString();
  }

} //Jleft_AtomImpl
