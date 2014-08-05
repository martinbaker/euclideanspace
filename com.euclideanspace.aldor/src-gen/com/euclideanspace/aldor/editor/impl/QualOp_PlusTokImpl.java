/**
 */
package com.euclideanspace.aldor.editor.impl;

import com.euclideanspace.aldor.editor.EditorPackage;
import com.euclideanspace.aldor.editor.OpQualTail;
import com.euclideanspace.aldor.editor.QualOp_PlusTok;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Qual Op Plus Tok</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.QualOp_PlusTokImpl#getOqt <em>Oqt</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QualOp_PlusTokImpl extends PlusOpImpl implements QualOp_PlusTok
{
  /**
   * The cached value of the '{@link #getOqt() <em>Oqt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOqt()
   * @generated
   * @ordered
   */
  protected OpQualTail oqt;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QualOp_PlusTokImpl()
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
    return EditorPackage.Literals.QUAL_OP_PLUS_TOK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OpQualTail getOqt()
  {
    return oqt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOqt(OpQualTail newOqt, NotificationChain msgs)
  {
    OpQualTail oldOqt = oqt;
    oqt = newOqt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.QUAL_OP_PLUS_TOK__OQT, oldOqt, newOqt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOqt(OpQualTail newOqt)
  {
    if (newOqt != oqt)
    {
      NotificationChain msgs = null;
      if (oqt != null)
        msgs = ((InternalEObject)oqt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.QUAL_OP_PLUS_TOK__OQT, null, msgs);
      if (newOqt != null)
        msgs = ((InternalEObject)newOqt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.QUAL_OP_PLUS_TOK__OQT, null, msgs);
      msgs = basicSetOqt(newOqt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.QUAL_OP_PLUS_TOK__OQT, newOqt, newOqt));
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
      case EditorPackage.QUAL_OP_PLUS_TOK__OQT:
        return basicSetOqt(null, msgs);
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
      case EditorPackage.QUAL_OP_PLUS_TOK__OQT:
        return getOqt();
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
      case EditorPackage.QUAL_OP_PLUS_TOK__OQT:
        setOqt((OpQualTail)newValue);
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
      case EditorPackage.QUAL_OP_PLUS_TOK__OQT:
        setOqt((OpQualTail)null);
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
      case EditorPackage.QUAL_OP_PLUS_TOK__OQT:
        return oqt != null;
    }
    return super.eIsSet(featureID);
  }

} //QualOp_PlusTokImpl
