/**
 */
package com.euclideanspace.aldor.editor.impl;

import com.euclideanspace.aldor.editor.Application;
import com.euclideanspace.aldor.editor.BlockEnclosure;
import com.euclideanspace.aldor.editor.BlockMolecule;
import com.euclideanspace.aldor.editor.E15;
import com.euclideanspace.aldor.editor.EditorPackage;
import com.euclideanspace.aldor.editor.Jleft_Molecule;
import com.euclideanspace.aldor.editor.Jright_Atom;
import com.euclideanspace.aldor.editor.Jright_Molecule;
import com.euclideanspace.aldor.editor.Molecule;
import com.euclideanspace.aldor.editor.RightJuxtaposed;

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
 *   <li>{@link com.euclideanspace.aldor.editor.impl.Jleft_MoleculeImpl#getRight <em>Right</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.Jleft_MoleculeImpl#getBe <em>Be</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.Jleft_MoleculeImpl#getM <em>M</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.Jleft_MoleculeImpl#getBm <em>Bm</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Jleft_MoleculeImpl extends LeftJuxtaposedImpl implements Jleft_Molecule
{
  /**
   * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRight()
   * @generated
   * @ordered
   */
  protected Jright_Atom right;

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
   * The cached value of the '{@link #getM() <em>M</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getM()
   * @generated
   * @ordered
   */
  protected Molecule m;

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
  public Jright_Atom getRight()
  {
    return right;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRight(Jright_Atom newRight, NotificationChain msgs)
  {
    Jright_Atom oldRight = right;
    right = newRight;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.JLEFT_MOLECULE__RIGHT, oldRight, newRight);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRight(Jright_Atom newRight)
  {
    if (newRight != right)
    {
      NotificationChain msgs = null;
      if (right != null)
        msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.JLEFT_MOLECULE__RIGHT, null, msgs);
      if (newRight != null)
        msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.JLEFT_MOLECULE__RIGHT, null, msgs);
      msgs = basicSetRight(newRight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.JLEFT_MOLECULE__RIGHT, newRight, newRight));
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
  public Molecule getM()
  {
    return m;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetM(Molecule newM, NotificationChain msgs)
  {
    Molecule oldM = m;
    m = newM;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.JLEFT_MOLECULE__M, oldM, newM);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setM(Molecule newM)
  {
    if (newM != m)
    {
      NotificationChain msgs = null;
      if (m != null)
        msgs = ((InternalEObject)m).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.JLEFT_MOLECULE__M, null, msgs);
      if (newM != null)
        msgs = ((InternalEObject)newM).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.JLEFT_MOLECULE__M, null, msgs);
      msgs = basicSetM(newM, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.JLEFT_MOLECULE__M, newM, newM));
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
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case EditorPackage.JLEFT_MOLECULE__RIGHT:
        return basicSetRight(null, msgs);
      case EditorPackage.JLEFT_MOLECULE__BE:
        return ((InternalEList<?>)getBe()).basicRemove(otherEnd, msgs);
      case EditorPackage.JLEFT_MOLECULE__M:
        return basicSetM(null, msgs);
      case EditorPackage.JLEFT_MOLECULE__BM:
        return ((InternalEList<?>)getBm()).basicRemove(otherEnd, msgs);
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
      case EditorPackage.JLEFT_MOLECULE__RIGHT:
        return getRight();
      case EditorPackage.JLEFT_MOLECULE__BE:
        return getBe();
      case EditorPackage.JLEFT_MOLECULE__M:
        return getM();
      case EditorPackage.JLEFT_MOLECULE__BM:
        return getBm();
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
      case EditorPackage.JLEFT_MOLECULE__RIGHT:
        setRight((Jright_Atom)newValue);
        return;
      case EditorPackage.JLEFT_MOLECULE__BE:
        getBe().clear();
        getBe().addAll((Collection<? extends BlockEnclosure>)newValue);
        return;
      case EditorPackage.JLEFT_MOLECULE__M:
        setM((Molecule)newValue);
        return;
      case EditorPackage.JLEFT_MOLECULE__BM:
        getBm().clear();
        getBm().addAll((Collection<? extends BlockMolecule>)newValue);
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
      case EditorPackage.JLEFT_MOLECULE__RIGHT:
        setRight((Jright_Atom)null);
        return;
      case EditorPackage.JLEFT_MOLECULE__BE:
        getBe().clear();
        return;
      case EditorPackage.JLEFT_MOLECULE__M:
        setM((Molecule)null);
        return;
      case EditorPackage.JLEFT_MOLECULE__BM:
        getBm().clear();
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
      case EditorPackage.JLEFT_MOLECULE__RIGHT:
        return right != null;
      case EditorPackage.JLEFT_MOLECULE__BE:
        return be != null && !be.isEmpty();
      case EditorPackage.JLEFT_MOLECULE__M:
        return m != null;
      case EditorPackage.JLEFT_MOLECULE__BM:
        return bm != null && !bm.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == E15.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Application.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == RightJuxtaposed.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Jright_Molecule.class)
    {
      switch (derivedFeatureID)
      {
        case EditorPackage.JLEFT_MOLECULE__RIGHT: return EditorPackage.JRIGHT_MOLECULE__RIGHT;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == E15.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Application.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == RightJuxtaposed.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Jright_Molecule.class)
    {
      switch (baseFeatureID)
      {
        case EditorPackage.JRIGHT_MOLECULE__RIGHT: return EditorPackage.JLEFT_MOLECULE__RIGHT;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} //Jleft_MoleculeImpl
