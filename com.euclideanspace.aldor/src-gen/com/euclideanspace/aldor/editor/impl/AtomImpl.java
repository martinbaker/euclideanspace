/**
 */
package com.euclideanspace.aldor.editor.impl;

import com.euclideanspace.aldor.editor.Atom;
import com.euclideanspace.aldor.editor.BlockEnclosure;
import com.euclideanspace.aldor.editor.BlockMolecule;
import com.euclideanspace.aldor.editor.EditorPackage;
import com.euclideanspace.aldor.editor.Id;
import com.euclideanspace.aldor.editor.Jleft_Atom;
import com.euclideanspace.aldor.editor.Jright_Atom;
import com.euclideanspace.aldor.editor.Labeled;
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
 * An implementation of the model object '<em><b>Atom</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.AtomImpl#getRight2 <em>Right2</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.AtomImpl#getA <em>A</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.AtomImpl#getBe <em>Be</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.AtomImpl#getN <em>N</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.AtomImpl#getLab <em>Lab</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.AtomImpl#getBm4 <em>Bm4</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.AtomImpl#getIden <em>Iden</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.AtomImpl#getLit <em>Lit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AtomImpl extends LabeledImpl implements Atom
{
  /**
   * The cached value of the '{@link #getRight2() <em>Right2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRight2()
   * @generated
   * @ordered
   */
  protected Jright_Atom right2;

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
   * The cached value of the '{@link #getBe() <em>Be</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBe()
   * @generated
   * @ordered
   */
  protected EList<BlockEnclosure> be;

  /**
   * The default value of the '{@link #getN() <em>N</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getN()
   * @generated
   * @ordered
   */
  protected static final String N_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getN() <em>N</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getN()
   * @generated
   * @ordered
   */
  protected String n = N_EDEFAULT;

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
   * The cached value of the '{@link #getBm4() <em>Bm4</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBm4()
   * @generated
   * @ordered
   */
  protected EList<BlockMolecule> bm4;

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
  public Jright_Atom getRight2()
  {
    return right2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRight2(Jright_Atom newRight2, NotificationChain msgs)
  {
    Jright_Atom oldRight2 = right2;
    right2 = newRight2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.ATOM__RIGHT2, oldRight2, newRight2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRight2(Jright_Atom newRight2)
  {
    if (newRight2 != right2)
    {
      NotificationChain msgs = null;
      if (right2 != null)
        msgs = ((InternalEObject)right2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.ATOM__RIGHT2, null, msgs);
      if (newRight2 != null)
        msgs = ((InternalEObject)newRight2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.ATOM__RIGHT2, null, msgs);
      msgs = basicSetRight2(newRight2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.ATOM__RIGHT2, newRight2, newRight2));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.ATOM__A, oldA, newA);
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
        msgs = ((InternalEObject)a).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.ATOM__A, null, msgs);
      if (newA != null)
        msgs = ((InternalEObject)newA).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.ATOM__A, null, msgs);
      msgs = basicSetA(newA, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.ATOM__A, newA, newA));
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
      be = new EObjectContainmentEList<BlockEnclosure>(BlockEnclosure.class, this, EditorPackage.ATOM__BE);
    }
    return be;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getN()
  {
    return n;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setN(String newN)
  {
    String oldN = n;
    n = newN;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.ATOM__N, oldN, n));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.ATOM__LAB, oldLab, newLab);
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
        msgs = ((InternalEObject)lab).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.ATOM__LAB, null, msgs);
      if (newLab != null)
        msgs = ((InternalEObject)newLab).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.ATOM__LAB, null, msgs);
      msgs = basicSetLab(newLab, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.ATOM__LAB, newLab, newLab));
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
      bm4 = new EObjectContainmentEList<BlockMolecule>(BlockMolecule.class, this, EditorPackage.ATOM__BM4);
    }
    return bm4;
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
      case EditorPackage.ATOM__RIGHT2:
        return basicSetRight2(null, msgs);
      case EditorPackage.ATOM__A:
        return basicSetA(null, msgs);
      case EditorPackage.ATOM__BE:
        return ((InternalEList<?>)getBe()).basicRemove(otherEnd, msgs);
      case EditorPackage.ATOM__LAB:
        return basicSetLab(null, msgs);
      case EditorPackage.ATOM__BM4:
        return ((InternalEList<?>)getBm4()).basicRemove(otherEnd, msgs);
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
      case EditorPackage.ATOM__RIGHT2:
        return getRight2();
      case EditorPackage.ATOM__A:
        return getA();
      case EditorPackage.ATOM__BE:
        return getBe();
      case EditorPackage.ATOM__N:
        return getN();
      case EditorPackage.ATOM__LAB:
        return getLab();
      case EditorPackage.ATOM__BM4:
        return getBm4();
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
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EditorPackage.ATOM__RIGHT2:
        setRight2((Jright_Atom)newValue);
        return;
      case EditorPackage.ATOM__A:
        setA((Atom)newValue);
        return;
      case EditorPackage.ATOM__BE:
        getBe().clear();
        getBe().addAll((Collection<? extends BlockEnclosure>)newValue);
        return;
      case EditorPackage.ATOM__N:
        setN((String)newValue);
        return;
      case EditorPackage.ATOM__LAB:
        setLab((Labeled)newValue);
        return;
      case EditorPackage.ATOM__BM4:
        getBm4().clear();
        getBm4().addAll((Collection<? extends BlockMolecule>)newValue);
        return;
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
      case EditorPackage.ATOM__RIGHT2:
        setRight2((Jright_Atom)null);
        return;
      case EditorPackage.ATOM__A:
        setA((Atom)null);
        return;
      case EditorPackage.ATOM__BE:
        getBe().clear();
        return;
      case EditorPackage.ATOM__N:
        setN(N_EDEFAULT);
        return;
      case EditorPackage.ATOM__LAB:
        setLab((Labeled)null);
        return;
      case EditorPackage.ATOM__BM4:
        getBm4().clear();
        return;
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
      case EditorPackage.ATOM__RIGHT2:
        return right2 != null;
      case EditorPackage.ATOM__A:
        return a != null;
      case EditorPackage.ATOM__BE:
        return be != null && !be.isEmpty();
      case EditorPackage.ATOM__N:
        return N_EDEFAULT == null ? n != null : !N_EDEFAULT.equals(n);
      case EditorPackage.ATOM__LAB:
        return lab != null;
      case EditorPackage.ATOM__BM4:
        return bm4 != null && !bm4.isEmpty();
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
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == Jright_Atom.class)
    {
      switch (derivedFeatureID)
      {
        case EditorPackage.ATOM__RIGHT2: return EditorPackage.JRIGHT_ATOM__RIGHT2;
        default: return -1;
      }
    }
    if (baseClass == Jleft_Atom.class)
    {
      switch (derivedFeatureID)
      {
        case EditorPackage.ATOM__A: return EditorPackage.JLEFT_ATOM__A;
        case EditorPackage.ATOM__BE: return EditorPackage.JLEFT_ATOM__BE;
        case EditorPackage.ATOM__N: return EditorPackage.JLEFT_ATOM__N;
        default: return -1;
      }
    }
    if (baseClass == Molecule.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == BlockMolecule.class)
    {
      switch (derivedFeatureID)
      {
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
    if (baseClass == Jright_Atom.class)
    {
      switch (baseFeatureID)
      {
        case EditorPackage.JRIGHT_ATOM__RIGHT2: return EditorPackage.ATOM__RIGHT2;
        default: return -1;
      }
    }
    if (baseClass == Jleft_Atom.class)
    {
      switch (baseFeatureID)
      {
        case EditorPackage.JLEFT_ATOM__A: return EditorPackage.ATOM__A;
        case EditorPackage.JLEFT_ATOM__BE: return EditorPackage.ATOM__BE;
        case EditorPackage.JLEFT_ATOM__N: return EditorPackage.ATOM__N;
        default: return -1;
      }
    }
    if (baseClass == Molecule.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == BlockMolecule.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
    result.append(" (n: ");
    result.append(n);
    result.append(", lit: ");
    result.append(lit);
    result.append(')');
    return result.toString();
  }

} //AtomImpl
