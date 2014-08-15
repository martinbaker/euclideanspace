/**
 */
package com.euclideanspace.aldor.editor.impl;

import com.euclideanspace.aldor.editor.BalStatement;
import com.euclideanspace.aldor.editor.BindingL_Infixed_BalStatement;
import com.euclideanspace.aldor.editor.EditorPackage;
import com.euclideanspace.aldor.editor.Infixed;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding LInfixed Bal Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.BindingL_Infixed_BalStatementImpl#getBas9 <em>Bas9</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.BindingL_Infixed_BalStatementImpl#getLft <em>Lft</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.BindingL_Infixed_BalStatementImpl#getOp <em>Op</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.BindingL_Infixed_BalStatementImpl#getBia <em>Bia</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BindingL_Infixed_BalStatementImpl extends Binding_BalStatementImpl implements BindingL_Infixed_BalStatement
{
  /**
   * The cached value of the '{@link #getBas9() <em>Bas9</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBas9()
   * @generated
   * @ordered
   */
  protected BalStatement bas9;

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
  protected BindingL_Infixed_BalStatement bia;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BindingL_Infixed_BalStatementImpl()
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
    return EditorPackage.Literals.BINDING_LINFIXED_BAL_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BalStatement getBas9()
  {
    return bas9;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBas9(BalStatement newBas9, NotificationChain msgs)
  {
    BalStatement oldBas9 = bas9;
    bas9 = newBas9;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.BINDING_LINFIXED_BAL_STATEMENT__BAS9, oldBas9, newBas9);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBas9(BalStatement newBas9)
  {
    if (newBas9 != bas9)
    {
      NotificationChain msgs = null;
      if (bas9 != null)
        msgs = ((InternalEObject)bas9).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.BINDING_LINFIXED_BAL_STATEMENT__BAS9, null, msgs);
      if (newBas9 != null)
        msgs = ((InternalEObject)newBas9).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.BINDING_LINFIXED_BAL_STATEMENT__BAS9, null, msgs);
      msgs = basicSetBas9(newBas9, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.BINDING_LINFIXED_BAL_STATEMENT__BAS9, newBas9, newBas9));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.BINDING_LINFIXED_BAL_STATEMENT__LFT, oldLft, newLft);
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
        msgs = ((InternalEObject)lft).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.BINDING_LINFIXED_BAL_STATEMENT__LFT, null, msgs);
      if (newLft != null)
        msgs = ((InternalEObject)newLft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.BINDING_LINFIXED_BAL_STATEMENT__LFT, null, msgs);
      msgs = basicSetLft(newLft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.BINDING_LINFIXED_BAL_STATEMENT__LFT, newLft, newLft));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.BINDING_LINFIXED_BAL_STATEMENT__OP, oldOp, op));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BindingL_Infixed_BalStatement getBia()
  {
    return bia;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBia(BindingL_Infixed_BalStatement newBia, NotificationChain msgs)
  {
    BindingL_Infixed_BalStatement oldBia = bia;
    bia = newBia;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.BINDING_LINFIXED_BAL_STATEMENT__BIA, oldBia, newBia);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBia(BindingL_Infixed_BalStatement newBia)
  {
    if (newBia != bia)
    {
      NotificationChain msgs = null;
      if (bia != null)
        msgs = ((InternalEObject)bia).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.BINDING_LINFIXED_BAL_STATEMENT__BIA, null, msgs);
      if (newBia != null)
        msgs = ((InternalEObject)newBia).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.BINDING_LINFIXED_BAL_STATEMENT__BIA, null, msgs);
      msgs = basicSetBia(newBia, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.BINDING_LINFIXED_BAL_STATEMENT__BIA, newBia, newBia));
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
      case EditorPackage.BINDING_LINFIXED_BAL_STATEMENT__BAS9:
        return basicSetBas9(null, msgs);
      case EditorPackage.BINDING_LINFIXED_BAL_STATEMENT__LFT:
        return basicSetLft(null, msgs);
      case EditorPackage.BINDING_LINFIXED_BAL_STATEMENT__BIA:
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
      case EditorPackage.BINDING_LINFIXED_BAL_STATEMENT__BAS9:
        return getBas9();
      case EditorPackage.BINDING_LINFIXED_BAL_STATEMENT__LFT:
        return getLft();
      case EditorPackage.BINDING_LINFIXED_BAL_STATEMENT__OP:
        return getOp();
      case EditorPackage.BINDING_LINFIXED_BAL_STATEMENT__BIA:
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
      case EditorPackage.BINDING_LINFIXED_BAL_STATEMENT__BAS9:
        setBas9((BalStatement)newValue);
        return;
      case EditorPackage.BINDING_LINFIXED_BAL_STATEMENT__LFT:
        setLft((Infixed)newValue);
        return;
      case EditorPackage.BINDING_LINFIXED_BAL_STATEMENT__OP:
        setOp((String)newValue);
        return;
      case EditorPackage.BINDING_LINFIXED_BAL_STATEMENT__BIA:
        setBia((BindingL_Infixed_BalStatement)newValue);
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
      case EditorPackage.BINDING_LINFIXED_BAL_STATEMENT__BAS9:
        setBas9((BalStatement)null);
        return;
      case EditorPackage.BINDING_LINFIXED_BAL_STATEMENT__LFT:
        setLft((Infixed)null);
        return;
      case EditorPackage.BINDING_LINFIXED_BAL_STATEMENT__OP:
        setOp(OP_EDEFAULT);
        return;
      case EditorPackage.BINDING_LINFIXED_BAL_STATEMENT__BIA:
        setBia((BindingL_Infixed_BalStatement)null);
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
      case EditorPackage.BINDING_LINFIXED_BAL_STATEMENT__BAS9:
        return bas9 != null;
      case EditorPackage.BINDING_LINFIXED_BAL_STATEMENT__LFT:
        return lft != null;
      case EditorPackage.BINDING_LINFIXED_BAL_STATEMENT__OP:
        return OP_EDEFAULT == null ? op != null : !OP_EDEFAULT.equals(op);
      case EditorPackage.BINDING_LINFIXED_BAL_STATEMENT__BIA:
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

} //BindingL_Infixed_BalStatementImpl
