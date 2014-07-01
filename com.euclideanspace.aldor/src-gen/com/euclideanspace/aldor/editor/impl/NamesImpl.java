/**
 */
package com.euclideanspace.aldor.editor.impl;

import com.euclideanspace.aldor.editor.EditorPackage;
import com.euclideanspace.aldor.editor.Names;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Names</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.NamesImpl#getFirstName <em>First Name</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.NamesImpl#getSubsequentNames <em>Subsequent Names</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NamesImpl extends QuotedIdsImpl implements Names
{
  /**
   * The default value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirstName()
   * @generated
   * @ordered
   */
  protected static final String FIRST_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirstName()
   * @generated
   * @ordered
   */
  protected String firstName = FIRST_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getSubsequentNames() <em>Subsequent Names</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubsequentNames()
   * @generated
   * @ordered
   */
  protected EList<String> subsequentNames;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NamesImpl()
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
    return EditorPackage.Literals.NAMES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFirstName()
  {
    return firstName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFirstName(String newFirstName)
  {
    String oldFirstName = firstName;
    firstName = newFirstName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.NAMES__FIRST_NAME, oldFirstName, firstName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getSubsequentNames()
  {
    if (subsequentNames == null)
    {
      subsequentNames = new EDataTypeEList<String>(String.class, this, EditorPackage.NAMES__SUBSEQUENT_NAMES);
    }
    return subsequentNames;
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
      case EditorPackage.NAMES__FIRST_NAME:
        return getFirstName();
      case EditorPackage.NAMES__SUBSEQUENT_NAMES:
        return getSubsequentNames();
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
      case EditorPackage.NAMES__FIRST_NAME:
        setFirstName((String)newValue);
        return;
      case EditorPackage.NAMES__SUBSEQUENT_NAMES:
        getSubsequentNames().clear();
        getSubsequentNames().addAll((Collection<? extends String>)newValue);
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
      case EditorPackage.NAMES__FIRST_NAME:
        setFirstName(FIRST_NAME_EDEFAULT);
        return;
      case EditorPackage.NAMES__SUBSEQUENT_NAMES:
        getSubsequentNames().clear();
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
      case EditorPackage.NAMES__FIRST_NAME:
        return FIRST_NAME_EDEFAULT == null ? firstName != null : !FIRST_NAME_EDEFAULT.equals(firstName);
      case EditorPackage.NAMES__SUBSEQUENT_NAMES:
        return subsequentNames != null && !subsequentNames.isEmpty();
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
    result.append(" (firstName: ");
    result.append(firstName);
    result.append(", subsequentNames: ");
    result.append(subsequentNames);
    result.append(')');
    return result.toString();
  }

} //NamesImpl
