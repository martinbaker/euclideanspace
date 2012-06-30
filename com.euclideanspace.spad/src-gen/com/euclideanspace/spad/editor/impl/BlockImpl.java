/**
 */
package com.euclideanspace.spad.editor.impl;

import com.euclideanspace.spad.editor.Block;
import com.euclideanspace.spad.editor.EditorPackage;
import com.euclideanspace.spad.editor.Statement;

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
 * An implementation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.spad.editor.impl.BlockImpl#getStname <em>Stname</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.BlockImpl#getStatemBl <em>Statem Bl</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BlockImpl extends MinimalEObjectImpl.Container implements Block
{
  /**
   * The default value of the '{@link #getStname() <em>Stname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStname()
   * @generated
   * @ordered
   */
  protected static final String STNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStname() <em>Stname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStname()
   * @generated
   * @ordered
   */
  protected String stname = STNAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getStatemBl() <em>Statem Bl</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatemBl()
   * @generated
   * @ordered
   */
  protected EList<Statement> statemBl;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BlockImpl()
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
    return EditorPackage.Literals.BLOCK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStname()
  {
    return stname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStname(String newStname)
  {
    String oldStname = stname;
    stname = newStname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.BLOCK__STNAME, oldStname, stname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Statement> getStatemBl()
  {
    if (statemBl == null)
    {
      statemBl = new EObjectContainmentEList<Statement>(Statement.class, this, EditorPackage.BLOCK__STATEM_BL);
    }
    return statemBl;
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
      case EditorPackage.BLOCK__STATEM_BL:
        return ((InternalEList<?>)getStatemBl()).basicRemove(otherEnd, msgs);
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
      case EditorPackage.BLOCK__STNAME:
        return getStname();
      case EditorPackage.BLOCK__STATEM_BL:
        return getStatemBl();
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
      case EditorPackage.BLOCK__STNAME:
        setStname((String)newValue);
        return;
      case EditorPackage.BLOCK__STATEM_BL:
        getStatemBl().clear();
        getStatemBl().addAll((Collection<? extends Statement>)newValue);
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
      case EditorPackage.BLOCK__STNAME:
        setStname(STNAME_EDEFAULT);
        return;
      case EditorPackage.BLOCK__STATEM_BL:
        getStatemBl().clear();
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
      case EditorPackage.BLOCK__STNAME:
        return STNAME_EDEFAULT == null ? stname != null : !STNAME_EDEFAULT.equals(stname);
      case EditorPackage.BLOCK__STATEM_BL:
        return statemBl != null && !statemBl.isEmpty();
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
    result.append(" (stname: ");
    result.append(stname);
    result.append(')');
    return result.toString();
  }

} //BlockImpl
