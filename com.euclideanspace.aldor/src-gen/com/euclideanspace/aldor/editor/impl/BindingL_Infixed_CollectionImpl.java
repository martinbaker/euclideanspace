/**
 */
package com.euclideanspace.aldor.editor.impl;

import com.euclideanspace.aldor.editor.BindingL_Infixed_Collection;
import com.euclideanspace.aldor.editor.Collection;
import com.euclideanspace.aldor.editor.EditorPackage;
import com.euclideanspace.aldor.editor.Infixed;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding LInfixed Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.BindingL_Infixed_CollectionImpl#getBas9 <em>Bas9</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.BindingL_Infixed_CollectionImpl#getLft <em>Lft</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.BindingL_Infixed_CollectionImpl#getOp <em>Op</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.BindingL_Infixed_CollectionImpl#getBia <em>Bia</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BindingL_Infixed_CollectionImpl extends Binding_CollectionImpl implements BindingL_Infixed_Collection
{
  /**
   * The cached value of the '{@link #getBas9() <em>Bas9</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBas9()
   * @generated
   * @ordered
   */
  protected Collection bas9;

  /**
   * The cached value of the '{@link #getLft() <em>Lft</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLft()
   * @generated
   * @ordered
   */
  protected Infixed lft;

  /**
   * The default value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected static final String OP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected String op = OP_EDEFAULT;

  /**
   * The cached value of the '{@link #getBia() <em>Bia</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBia()
   * @generated
   * @ordered
   */
  protected BindingL_Infixed_Collection bia;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BindingL_Infixed_CollectionImpl()
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
    return EditorPackage.Literals.BINDING_LINFIXED_COLLECTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Collection getBas9()
  {
    return bas9;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBas9(Collection newBas9, NotificationChain msgs)
  {
    Collection oldBas9 = bas9;
    bas9 = newBas9;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.BINDING_LINFIXED_COLLECTION__BAS9, oldBas9, newBas9);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBas9(Collection newBas9)
  {
    if (newBas9 != bas9)
    {
      NotificationChain msgs = null;
      if (bas9 != null)
        msgs = ((InternalEObject)bas9).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.BINDING_LINFIXED_COLLECTION__BAS9, null, msgs);
      if (newBas9 != null)
        msgs = ((InternalEObject)newBas9).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.BINDING_LINFIXED_COLLECTION__BAS9, null, msgs);
      msgs = basicSetBas9(newBas9, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.BINDING_LINFIXED_COLLECTION__BAS9, newBas9, newBas9));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Infixed getLft()
  {
    return lft;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLft(Infixed newLft, NotificationChain msgs)
  {
    Infixed oldLft = lft;
    lft = newLft;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.BINDING_LINFIXED_COLLECTION__LFT, oldLft, newLft);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLft(Infixed newLft)
  {
    if (newLft != lft)
    {
      NotificationChain msgs = null;
      if (lft != null)
        msgs = ((InternalEObject)lft).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.BINDING_LINFIXED_COLLECTION__LFT, null, msgs);
      if (newLft != null)
        msgs = ((InternalEObject)newLft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.BINDING_LINFIXED_COLLECTION__LFT, null, msgs);
      msgs = basicSetLft(newLft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.BINDING_LINFIXED_COLLECTION__LFT, newLft, newLft));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOp()
  {
    return op;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOp(String newOp)
  {
    String oldOp = op;
    op = newOp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.BINDING_LINFIXED_COLLECTION__OP, oldOp, op));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BindingL_Infixed_Collection getBia()
  {
    return bia;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBia(BindingL_Infixed_Collection newBia, NotificationChain msgs)
  {
    BindingL_Infixed_Collection oldBia = bia;
    bia = newBia;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.BINDING_LINFIXED_COLLECTION__BIA, oldBia, newBia);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBia(BindingL_Infixed_Collection newBia)
  {
    if (newBia != bia)
    {
      NotificationChain msgs = null;
      if (bia != null)
        msgs = ((InternalEObject)bia).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.BINDING_LINFIXED_COLLECTION__BIA, null, msgs);
      if (newBia != null)
        msgs = ((InternalEObject)newBia).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.BINDING_LINFIXED_COLLECTION__BIA, null, msgs);
      msgs = basicSetBia(newBia, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.BINDING_LINFIXED_COLLECTION__BIA, newBia, newBia));
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
      case EditorPackage.BINDING_LINFIXED_COLLECTION__BAS9:
        return basicSetBas9(null, msgs);
      case EditorPackage.BINDING_LINFIXED_COLLECTION__LFT:
        return basicSetLft(null, msgs);
      case EditorPackage.BINDING_LINFIXED_COLLECTION__BIA:
        return basicSetBia(null, msgs);
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
      case EditorPackage.BINDING_LINFIXED_COLLECTION__BAS9:
        return getBas9();
      case EditorPackage.BINDING_LINFIXED_COLLECTION__LFT:
        return getLft();
      case EditorPackage.BINDING_LINFIXED_COLLECTION__OP:
        return getOp();
      case EditorPackage.BINDING_LINFIXED_COLLECTION__BIA:
        return getBia();
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
      case EditorPackage.BINDING_LINFIXED_COLLECTION__BAS9:
        setBas9((Collection)newValue);
        return;
      case EditorPackage.BINDING_LINFIXED_COLLECTION__LFT:
        setLft((Infixed)newValue);
        return;
      case EditorPackage.BINDING_LINFIXED_COLLECTION__OP:
        setOp((String)newValue);
        return;
      case EditorPackage.BINDING_LINFIXED_COLLECTION__BIA:
        setBia((BindingL_Infixed_Collection)newValue);
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
      case EditorPackage.BINDING_LINFIXED_COLLECTION__BAS9:
        setBas9((Collection)null);
        return;
      case EditorPackage.BINDING_LINFIXED_COLLECTION__LFT:
        setLft((Infixed)null);
        return;
      case EditorPackage.BINDING_LINFIXED_COLLECTION__OP:
        setOp(OP_EDEFAULT);
        return;
      case EditorPackage.BINDING_LINFIXED_COLLECTION__BIA:
        setBia((BindingL_Infixed_Collection)null);
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
      case EditorPackage.BINDING_LINFIXED_COLLECTION__BAS9:
        return bas9 != null;
      case EditorPackage.BINDING_LINFIXED_COLLECTION__LFT:
        return lft != null;
      case EditorPackage.BINDING_LINFIXED_COLLECTION__OP:
        return OP_EDEFAULT == null ? op != null : !OP_EDEFAULT.equals(op);
      case EditorPackage.BINDING_LINFIXED_COLLECTION__BIA:
        return bia != null;
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
    result.append(" (op: ");
    result.append(op);
    result.append(')');
    return result.toString();
  }

} //BindingL_Infixed_CollectionImpl
