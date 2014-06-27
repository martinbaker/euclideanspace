/**
 */
package com.euclideanspace.aldor.editor.impl;

import com.euclideanspace.aldor.editor.EditorPackage;
import com.euclideanspace.aldor.editor.VariableDeclaration;
import com.euclideanspace.aldor.editor.VariableDeclarationBlock;

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
 * An implementation of the model object '<em><b>Variable Declaration Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.VariableDeclarationBlockImpl#getVardecbr <em>Vardecbr</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.VariableDeclarationBlockImpl#getVardecBlk <em>Vardec Blk</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableDeclarationBlockImpl extends MinimalEObjectImpl.Container implements VariableDeclarationBlock
{
  /**
   * The default value of the '{@link #getVardecbr() <em>Vardecbr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVardecbr()
   * @generated
   * @ordered
   */
  protected static final String VARDECBR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVardecbr() <em>Vardecbr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVardecbr()
   * @generated
   * @ordered
   */
  protected String vardecbr = VARDECBR_EDEFAULT;

  /**
   * The cached value of the '{@link #getVardecBlk() <em>Vardec Blk</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVardecBlk()
   * @generated
   * @ordered
   */
  protected EList<VariableDeclaration> vardecBlk;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VariableDeclarationBlockImpl()
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
    return EditorPackage.Literals.VARIABLE_DECLARATION_BLOCK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVardecbr()
  {
    return vardecbr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVardecbr(String newVardecbr)
  {
    String oldVardecbr = vardecbr;
    vardecbr = newVardecbr;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.VARIABLE_DECLARATION_BLOCK__VARDECBR, oldVardecbr, vardecbr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<VariableDeclaration> getVardecBlk()
  {
    if (vardecBlk == null)
    {
      vardecBlk = new EObjectContainmentEList<VariableDeclaration>(VariableDeclaration.class, this, EditorPackage.VARIABLE_DECLARATION_BLOCK__VARDEC_BLK);
    }
    return vardecBlk;
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
      case EditorPackage.VARIABLE_DECLARATION_BLOCK__VARDEC_BLK:
        return ((InternalEList<?>)getVardecBlk()).basicRemove(otherEnd, msgs);
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
      case EditorPackage.VARIABLE_DECLARATION_BLOCK__VARDECBR:
        return getVardecbr();
      case EditorPackage.VARIABLE_DECLARATION_BLOCK__VARDEC_BLK:
        return getVardecBlk();
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
      case EditorPackage.VARIABLE_DECLARATION_BLOCK__VARDECBR:
        setVardecbr((String)newValue);
        return;
      case EditorPackage.VARIABLE_DECLARATION_BLOCK__VARDEC_BLK:
        getVardecBlk().clear();
        getVardecBlk().addAll((Collection<? extends VariableDeclaration>)newValue);
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
      case EditorPackage.VARIABLE_DECLARATION_BLOCK__VARDECBR:
        setVardecbr(VARDECBR_EDEFAULT);
        return;
      case EditorPackage.VARIABLE_DECLARATION_BLOCK__VARDEC_BLK:
        getVardecBlk().clear();
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
      case EditorPackage.VARIABLE_DECLARATION_BLOCK__VARDECBR:
        return VARDECBR_EDEFAULT == null ? vardecbr != null : !VARDECBR_EDEFAULT.equals(vardecbr);
      case EditorPackage.VARIABLE_DECLARATION_BLOCK__VARDEC_BLK:
        return vardecBlk != null && !vardecBlk.isEmpty();
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
    result.append(" (vardecbr: ");
    result.append(vardecbr);
    result.append(')');
    return result.toString();
  }

} //VariableDeclarationBlockImpl
