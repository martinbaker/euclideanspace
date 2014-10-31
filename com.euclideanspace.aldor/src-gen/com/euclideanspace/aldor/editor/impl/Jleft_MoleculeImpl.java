/**
 */
package com.euclideanspace.aldor.editor.impl;

import com.euclideanspace.aldor.editor.BlockEnclosure;
import com.euclideanspace.aldor.editor.BlockMolecule;
import com.euclideanspace.aldor.editor.EditorPackage;
import com.euclideanspace.aldor.editor.Jleft_Molecule;
import com.euclideanspace.aldor.editor.Molecule;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Jleft Molecule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.Jleft_MoleculeImpl#getBe <em>Be</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.Jleft_MoleculeImpl#getM <em>M</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.Jleft_MoleculeImpl#getBm <em>Bm</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.Jleft_MoleculeImpl#getM2 <em>M2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Jleft_MoleculeImpl extends LeftJuxtaposedImpl implements Jleft_Molecule
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
   * The default value of the '{@link #getM() <em>M</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getM()
   * @generated
   * @ordered
   */
  protected static final String M_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getM() <em>M</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getM()
   * @generated
   * @ordered
   */
  protected String m = M_EDEFAULT;

  /**
   * The cached value of the '{@link #getBm() <em>Bm</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBm()
   * @generated
   * @ordered
   */
  protected EList<BlockMolecule> bm;

  /**
   * The cached value of the '{@link #getM2() <em>M2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getM2()
   * @generated
   * @ordered
   */
  protected Molecule m2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Jleft_MoleculeImpl()
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
    return EditorPackage.Literals.JLEFT_MOLECULE;
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
      be = new EObjectContainmentEList<BlockEnclosure>(BlockEnclosure.class, this, EditorPackage.JLEFT_MOLECULE__BE);
    }
    return be;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getM()
  {
    return m;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setM(String newM)
  {
    String oldM = m;
    m = newM;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.JLEFT_MOLECULE__M, oldM, m));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BlockMolecule> getBm()
  {
    if (bm == null)
    {
      bm = new EObjectContainmentEList<BlockMolecule>(BlockMolecule.class, this, EditorPackage.JLEFT_MOLECULE__BM);
    }
    return bm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Molecule getM2()
  {
    return m2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetM2(Molecule newM2, NotificationChain msgs)
  {
    Molecule oldM2 = m2;
    m2 = newM2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.JLEFT_MOLECULE__M2, oldM2, newM2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setM2(Molecule newM2)
  {
    if (newM2 != m2)
    {
      NotificationChain msgs = null;
      if (m2 != null)
        msgs = ((InternalEObject)m2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.JLEFT_MOLECULE__M2, null, msgs);
      if (newM2 != null)
        msgs = ((InternalEObject)newM2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.JLEFT_MOLECULE__M2, null, msgs);
      msgs = basicSetM2(newM2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.JLEFT_MOLECULE__M2, newM2, newM2));
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
      case EditorPackage.JLEFT_MOLECULE__BE:
        return ((InternalEList<?>)getBe()).basicRemove(otherEnd, msgs);
      case EditorPackage.JLEFT_MOLECULE__BM:
        return ((InternalEList<?>)getBm()).basicRemove(otherEnd, msgs);
      case EditorPackage.JLEFT_MOLECULE__M2:
        return basicSetM2(null, msgs);
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
      case EditorPackage.JLEFT_MOLECULE__BE:
        return getBe();
      case EditorPackage.JLEFT_MOLECULE__M:
        return getM();
      case EditorPackage.JLEFT_MOLECULE__BM:
        return getBm();
      case EditorPackage.JLEFT_MOLECULE__M2:
        return getM2();
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
      case EditorPackage.JLEFT_MOLECULE__BE:
        getBe().clear();
        getBe().addAll((Collection<? extends BlockEnclosure>)newValue);
        return;
      case EditorPackage.JLEFT_MOLECULE__M:
        setM((String)newValue);
        return;
      case EditorPackage.JLEFT_MOLECULE__BM:
        getBm().clear();
        getBm().addAll((Collection<? extends BlockMolecule>)newValue);
        return;
      case EditorPackage.JLEFT_MOLECULE__M2:
        setM2((Molecule)newValue);
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
      case EditorPackage.JLEFT_MOLECULE__BE:
        getBe().clear();
        return;
      case EditorPackage.JLEFT_MOLECULE__M:
        setM(M_EDEFAULT);
        return;
      case EditorPackage.JLEFT_MOLECULE__BM:
        getBm().clear();
        return;
      case EditorPackage.JLEFT_MOLECULE__M2:
        setM2((Molecule)null);
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
      case EditorPackage.JLEFT_MOLECULE__BE:
        return be != null && !be.isEmpty();
      case EditorPackage.JLEFT_MOLECULE__M:
        return M_EDEFAULT == null ? m != null : !M_EDEFAULT.equals(m);
      case EditorPackage.JLEFT_MOLECULE__BM:
        return bm != null && !bm.isEmpty();
      case EditorPackage.JLEFT_MOLECULE__M2:
        return m2 != null;
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
    result.append(" (m: ");
    result.append(m);
    result.append(')');
    return result.toString();
  }

} //Jleft_MoleculeImpl
