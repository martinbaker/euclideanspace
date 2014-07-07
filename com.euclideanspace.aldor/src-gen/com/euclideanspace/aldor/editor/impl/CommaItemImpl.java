/**
 */
package com.euclideanspace.aldor.editor.impl;

import com.euclideanspace.aldor.editor.AlwaysPart_BalStatement;
import com.euclideanspace.aldor.editor.BalStatement;
import com.euclideanspace.aldor.editor.BindingL_Infixed_BalStatement;
import com.euclideanspace.aldor.editor.Binding_AnyStatement;
import com.euclideanspace.aldor.editor.Binding_BalStatement;
import com.euclideanspace.aldor.editor.Comma;
import com.euclideanspace.aldor.editor.CommaItem;
import com.euclideanspace.aldor.editor.EditorPackage;
import com.euclideanspace.aldor.editor.Flow_AnyStatement;
import com.euclideanspace.aldor.editor.Flow_BalStatement;
import com.euclideanspace.aldor.editor.GenBound;
import com.euclideanspace.aldor.editor.Labeled;
import com.euclideanspace.aldor.editor.enlist1_CommaItem_Comma_AB;
import com.euclideanspace.aldor.editor.enlister1_CommaItem_Comma;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comma Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.CommaItemImpl#getBbs5 <em>Bbs5</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.CommaItemImpl#getBas4 <em>Bas4</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.CommaItemImpl#getBas <em>Bas</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.CommaItemImpl#getBbs <em>Bbs</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.CommaItemImpl#getBbs2 <em>Bbs2</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.CommaItemImpl#getCi <em>Ci</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CommaItemImpl extends AnyStatementImpl implements CommaItem
{
  /**
   * The cached value of the '{@link #getBbs5() <em>Bbs5</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBbs5()
   * @generated
   * @ordered
   */
  protected Binding_BalStatement bbs5;

  /**
   * The cached value of the '{@link #getBas4() <em>Bas4</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBas4()
   * @generated
   * @ordered
   */
  protected Binding_AnyStatement bas4;

  /**
   * The cached value of the '{@link #getBas() <em>Bas</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBas()
   * @generated
   * @ordered
   */
  protected Binding_AnyStatement bas;

  /**
   * The cached value of the '{@link #getBbs() <em>Bbs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBbs()
   * @generated
   * @ordered
   */
  protected Binding_BalStatement bbs;

  /**
   * The cached value of the '{@link #getBbs2() <em>Bbs2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBbs2()
   * @generated
   * @ordered
   */
  protected Binding_BalStatement bbs2;

  /**
   * The cached value of the '{@link #getCi() <em>Ci</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCi()
   * @generated
   * @ordered
   */
  protected CommaItem ci;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CommaItemImpl()
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
    return EditorPackage.Literals.COMMA_ITEM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Binding_BalStatement getBbs5()
  {
    return bbs5;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBbs5(Binding_BalStatement newBbs5, NotificationChain msgs)
  {
    Binding_BalStatement oldBbs5 = bbs5;
    bbs5 = newBbs5;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.COMMA_ITEM__BBS5, oldBbs5, newBbs5);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBbs5(Binding_BalStatement newBbs5)
  {
    if (newBbs5 != bbs5)
    {
      NotificationChain msgs = null;
      if (bbs5 != null)
        msgs = ((InternalEObject)bbs5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.COMMA_ITEM__BBS5, null, msgs);
      if (newBbs5 != null)
        msgs = ((InternalEObject)newBbs5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.COMMA_ITEM__BBS5, null, msgs);
      msgs = basicSetBbs5(newBbs5, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.COMMA_ITEM__BBS5, newBbs5, newBbs5));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Binding_AnyStatement getBas4()
  {
    return bas4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBas4(Binding_AnyStatement newBas4, NotificationChain msgs)
  {
    Binding_AnyStatement oldBas4 = bas4;
    bas4 = newBas4;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.COMMA_ITEM__BAS4, oldBas4, newBas4);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBas4(Binding_AnyStatement newBas4)
  {
    if (newBas4 != bas4)
    {
      NotificationChain msgs = null;
      if (bas4 != null)
        msgs = ((InternalEObject)bas4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.COMMA_ITEM__BAS4, null, msgs);
      if (newBas4 != null)
        msgs = ((InternalEObject)newBas4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.COMMA_ITEM__BAS4, null, msgs);
      msgs = basicSetBas4(newBas4, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.COMMA_ITEM__BAS4, newBas4, newBas4));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Binding_AnyStatement getBas()
  {
    return bas;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBas(Binding_AnyStatement newBas, NotificationChain msgs)
  {
    Binding_AnyStatement oldBas = bas;
    bas = newBas;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.COMMA_ITEM__BAS, oldBas, newBas);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBas(Binding_AnyStatement newBas)
  {
    if (newBas != bas)
    {
      NotificationChain msgs = null;
      if (bas != null)
        msgs = ((InternalEObject)bas).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.COMMA_ITEM__BAS, null, msgs);
      if (newBas != null)
        msgs = ((InternalEObject)newBas).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.COMMA_ITEM__BAS, null, msgs);
      msgs = basicSetBas(newBas, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.COMMA_ITEM__BAS, newBas, newBas));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Binding_BalStatement getBbs()
  {
    return bbs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBbs(Binding_BalStatement newBbs, NotificationChain msgs)
  {
    Binding_BalStatement oldBbs = bbs;
    bbs = newBbs;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.COMMA_ITEM__BBS, oldBbs, newBbs);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBbs(Binding_BalStatement newBbs)
  {
    if (newBbs != bbs)
    {
      NotificationChain msgs = null;
      if (bbs != null)
        msgs = ((InternalEObject)bbs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.COMMA_ITEM__BBS, null, msgs);
      if (newBbs != null)
        msgs = ((InternalEObject)newBbs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.COMMA_ITEM__BBS, null, msgs);
      msgs = basicSetBbs(newBbs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.COMMA_ITEM__BBS, newBbs, newBbs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Binding_BalStatement getBbs2()
  {
    return bbs2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBbs2(Binding_BalStatement newBbs2, NotificationChain msgs)
  {
    Binding_BalStatement oldBbs2 = bbs2;
    bbs2 = newBbs2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.COMMA_ITEM__BBS2, oldBbs2, newBbs2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBbs2(Binding_BalStatement newBbs2)
  {
    if (newBbs2 != bbs2)
    {
      NotificationChain msgs = null;
      if (bbs2 != null)
        msgs = ((InternalEObject)bbs2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.COMMA_ITEM__BBS2, null, msgs);
      if (newBbs2 != null)
        msgs = ((InternalEObject)newBbs2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.COMMA_ITEM__BBS2, null, msgs);
      msgs = basicSetBbs2(newBbs2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.COMMA_ITEM__BBS2, newBbs2, newBbs2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CommaItem getCi()
  {
    return ci;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCi(CommaItem newCi, NotificationChain msgs)
  {
    CommaItem oldCi = ci;
    ci = newCi;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.COMMA_ITEM__CI, oldCi, newCi);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCi(CommaItem newCi)
  {
    if (newCi != ci)
    {
      NotificationChain msgs = null;
      if (ci != null)
        msgs = ((InternalEObject)ci).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.COMMA_ITEM__CI, null, msgs);
      if (newCi != null)
        msgs = ((InternalEObject)newCi).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.COMMA_ITEM__CI, null, msgs);
      msgs = basicSetCi(newCi, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.COMMA_ITEM__CI, newCi, newCi));
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
      case EditorPackage.COMMA_ITEM__BBS5:
        return basicSetBbs5(null, msgs);
      case EditorPackage.COMMA_ITEM__BAS4:
        return basicSetBas4(null, msgs);
      case EditorPackage.COMMA_ITEM__BAS:
        return basicSetBas(null, msgs);
      case EditorPackage.COMMA_ITEM__BBS:
        return basicSetBbs(null, msgs);
      case EditorPackage.COMMA_ITEM__BBS2:
        return basicSetBbs2(null, msgs);
      case EditorPackage.COMMA_ITEM__CI:
        return basicSetCi(null, msgs);
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
      case EditorPackage.COMMA_ITEM__BBS5:
        return getBbs5();
      case EditorPackage.COMMA_ITEM__BAS4:
        return getBas4();
      case EditorPackage.COMMA_ITEM__BAS:
        return getBas();
      case EditorPackage.COMMA_ITEM__BBS:
        return getBbs();
      case EditorPackage.COMMA_ITEM__BBS2:
        return getBbs2();
      case EditorPackage.COMMA_ITEM__CI:
        return getCi();
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
      case EditorPackage.COMMA_ITEM__BBS5:
        setBbs5((Binding_BalStatement)newValue);
        return;
      case EditorPackage.COMMA_ITEM__BAS4:
        setBas4((Binding_AnyStatement)newValue);
        return;
      case EditorPackage.COMMA_ITEM__BAS:
        setBas((Binding_AnyStatement)newValue);
        return;
      case EditorPackage.COMMA_ITEM__BBS:
        setBbs((Binding_BalStatement)newValue);
        return;
      case EditorPackage.COMMA_ITEM__BBS2:
        setBbs2((Binding_BalStatement)newValue);
        return;
      case EditorPackage.COMMA_ITEM__CI:
        setCi((CommaItem)newValue);
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
      case EditorPackage.COMMA_ITEM__BBS5:
        setBbs5((Binding_BalStatement)null);
        return;
      case EditorPackage.COMMA_ITEM__BAS4:
        setBas4((Binding_AnyStatement)null);
        return;
      case EditorPackage.COMMA_ITEM__BAS:
        setBas((Binding_AnyStatement)null);
        return;
      case EditorPackage.COMMA_ITEM__BBS:
        setBbs((Binding_BalStatement)null);
        return;
      case EditorPackage.COMMA_ITEM__BBS2:
        setBbs2((Binding_BalStatement)null);
        return;
      case EditorPackage.COMMA_ITEM__CI:
        setCi((CommaItem)null);
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
      case EditorPackage.COMMA_ITEM__BBS5:
        return bbs5 != null;
      case EditorPackage.COMMA_ITEM__BAS4:
        return bas4 != null;
      case EditorPackage.COMMA_ITEM__BAS:
        return bas != null;
      case EditorPackage.COMMA_ITEM__BBS:
        return bbs != null;
      case EditorPackage.COMMA_ITEM__BBS2:
        return bbs2 != null;
      case EditorPackage.COMMA_ITEM__CI:
        return ci != null;
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
    if (baseClass == Flow_AnyStatement.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == AlwaysPart_BalStatement.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Binding_BalStatement.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == BindingL_Infixed_BalStatement.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == BalStatement.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Flow_BalStatement.class)
    {
      switch (derivedFeatureID)
      {
        case EditorPackage.COMMA_ITEM__BBS5: return EditorPackage.FLOW_BAL_STATEMENT__BBS5;
        default: return -1;
      }
    }
    if (baseClass == GenBound.class)
    {
      switch (derivedFeatureID)
      {
        case EditorPackage.COMMA_ITEM__BAS4: return EditorPackage.GEN_BOUND__BAS4;
        default: return -1;
      }
    }
    if (baseClass == Labeled.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Comma.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == enlist1_CommaItem_Comma_AB.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == enlister1_CommaItem_Comma.class)
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
    if (baseClass == Flow_AnyStatement.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == AlwaysPart_BalStatement.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Binding_BalStatement.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == BindingL_Infixed_BalStatement.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == BalStatement.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Flow_BalStatement.class)
    {
      switch (baseFeatureID)
      {
        case EditorPackage.FLOW_BAL_STATEMENT__BBS5: return EditorPackage.COMMA_ITEM__BBS5;
        default: return -1;
      }
    }
    if (baseClass == GenBound.class)
    {
      switch (baseFeatureID)
      {
        case EditorPackage.GEN_BOUND__BAS4: return EditorPackage.COMMA_ITEM__BAS4;
        default: return -1;
      }
    }
    if (baseClass == Labeled.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Comma.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == enlist1_CommaItem_Comma_AB.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == enlister1_CommaItem_Comma.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} //CommaItemImpl
