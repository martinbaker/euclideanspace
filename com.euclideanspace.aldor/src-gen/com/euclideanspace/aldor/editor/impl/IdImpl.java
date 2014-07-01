/**
 */
package com.euclideanspace.aldor.editor.impl;

import com.euclideanspace.aldor.editor.Binding_BalStatement;
import com.euclideanspace.aldor.editor.EditorPackage;
import com.euclideanspace.aldor.editor.Flow_BalStatement;
import com.euclideanspace.aldor.editor.Id;
import com.euclideanspace.aldor.editor.Name;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Id</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.IdImpl#getBbs4 <em>Bbs4</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.IdImpl#getAB_Id <em>AB Id</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.IdImpl#getOp <em>Op</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IdImpl extends Flow_AnyStatementImpl implements Id
{
  /**
   * The cached value of the '{@link #getBbs4() <em>Bbs4</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBbs4()
   * @generated
   * @ordered
   */
  protected Binding_BalStatement bbs4;

  /**
   * The default value of the '{@link #getAB_Id() <em>AB Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAB_Id()
   * @generated
   * @ordered
   */
  protected static final String AB_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAB_Id() <em>AB Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAB_Id()
   * @generated
   * @ordered
   */
  protected String aB_Id = AB_ID_EDEFAULT;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IdImpl()
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
    return EditorPackage.Literals.ID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Binding_BalStatement getBbs4()
  {
    return bbs4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBbs4(Binding_BalStatement newBbs4, NotificationChain msgs)
  {
    Binding_BalStatement oldBbs4 = bbs4;
    bbs4 = newBbs4;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.ID__BBS4, oldBbs4, newBbs4);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBbs4(Binding_BalStatement newBbs4)
  {
    if (newBbs4 != bbs4)
    {
      NotificationChain msgs = null;
      if (bbs4 != null)
        msgs = ((InternalEObject)bbs4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.ID__BBS4, null, msgs);
      if (newBbs4 != null)
        msgs = ((InternalEObject)newBbs4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.ID__BBS4, null, msgs);
      msgs = basicSetBbs4(newBbs4, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.ID__BBS4, newBbs4, newBbs4));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAB_Id()
  {
    return aB_Id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAB_Id(String newAB_Id)
  {
    String oldAB_Id = aB_Id;
    aB_Id = newAB_Id;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.ID__AB_ID, oldAB_Id, aB_Id));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.ID__OP, oldOp, op));
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
      case EditorPackage.ID__BBS4:
        return basicSetBbs4(null, msgs);
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
      case EditorPackage.ID__BBS4:
        return getBbs4();
      case EditorPackage.ID__AB_ID:
        return getAB_Id();
      case EditorPackage.ID__OP:
        return getOp();
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
      case EditorPackage.ID__BBS4:
        setBbs4((Binding_BalStatement)newValue);
        return;
      case EditorPackage.ID__AB_ID:
        setAB_Id((String)newValue);
        return;
      case EditorPackage.ID__OP:
        setOp((String)newValue);
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
      case EditorPackage.ID__BBS4:
        setBbs4((Binding_BalStatement)null);
        return;
      case EditorPackage.ID__AB_ID:
        setAB_Id(AB_ID_EDEFAULT);
        return;
      case EditorPackage.ID__OP:
        setOp(OP_EDEFAULT);
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
      case EditorPackage.ID__BBS4:
        return bbs4 != null;
      case EditorPackage.ID__AB_ID:
        return AB_ID_EDEFAULT == null ? aB_Id != null : !AB_ID_EDEFAULT.equals(aB_Id);
      case EditorPackage.ID__OP:
        return OP_EDEFAULT == null ? op != null : !OP_EDEFAULT.equals(op);
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
    if (baseClass == Flow_BalStatement.class)
    {
      switch (derivedFeatureID)
      {
        case EditorPackage.ID__BBS4: return EditorPackage.FLOW_BAL_STATEMENT__BBS4;
        default: return -1;
      }
    }
    if (baseClass == Name.class)
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
    if (baseClass == Flow_BalStatement.class)
    {
      switch (baseFeatureID)
      {
        case EditorPackage.FLOW_BAL_STATEMENT__BBS4: return EditorPackage.ID__BBS4;
        default: return -1;
      }
    }
    if (baseClass == Name.class)
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
    result.append(" (AB_Id: ");
    result.append(aB_Id);
    result.append(", op: ");
    result.append(op);
    result.append(')');
    return result.toString();
  }

} //IdImpl
