/**
 */
package com.euclideanspace.spad.editor.impl;

import com.euclideanspace.spad.editor.EditorPackage;
import com.euclideanspace.spad.editor.TypeExpression;
import com.euclideanspace.spad.editor.TypeParameterList;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Parameter List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.spad.editor.impl.TypeParameterListImpl#getTyname <em>Tyname</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.TypeParameterListImpl#getPar <em>Par</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.TypeParameterListImpl#getPar22 <em>Par22</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.TypeParameterListImpl#getPar2 <em>Par2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeParameterListImpl extends MinimalEObjectImpl.Container implements TypeParameterList
{
  /**
   * The default value of the '{@link #getTyname() <em>Tyname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTyname()
   * @generated
   * @ordered
   */
  protected static final String TYNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTyname() <em>Tyname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTyname()
   * @generated
   * @ordered
   */
  protected String tyname = TYNAME_EDEFAULT;

  /**
   * The default value of the '{@link #getPar() <em>Par</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPar()
   * @generated
   * @ordered
   */
  protected static final String PAR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPar() <em>Par</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPar()
   * @generated
   * @ordered
   */
  protected String par = PAR_EDEFAULT;

  /**
   * The cached value of the '{@link #getPar22() <em>Par22</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPar22()
   * @generated
   * @ordered
   */
  protected EList<TypeExpression> par22;

  /**
   * The cached value of the '{@link #getPar2() <em>Par2</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPar2()
   * @generated
   * @ordered
   */
  protected EList<String> par2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypeParameterListImpl()
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
    return EditorPackage.Literals.TYPE_PARAMETER_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTyname()
  {
    return tyname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTyname(String newTyname)
  {
    String oldTyname = tyname;
    tyname = newTyname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_PARAMETER_LIST__TYNAME, oldTyname, tyname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPar()
  {
    return par;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPar(String newPar)
  {
    String oldPar = par;
    par = newPar;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_PARAMETER_LIST__PAR, oldPar, par));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeExpression> getPar22()
  {
    if (par22 == null)
    {
      par22 = new EObjectContainmentEList<TypeExpression>(TypeExpression.class, this, EditorPackage.TYPE_PARAMETER_LIST__PAR22);
    }
    return par22;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getPar2()
  {
    if (par2 == null)
    {
      par2 = new EDataTypeEList<String>(String.class, this, EditorPackage.TYPE_PARAMETER_LIST__PAR2);
    }
    return par2;
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
      case EditorPackage.TYPE_PARAMETER_LIST__PAR22:
        return ((InternalEList<?>)getPar22()).basicRemove(otherEnd, msgs);
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
      case EditorPackage.TYPE_PARAMETER_LIST__TYNAME:
        return getTyname();
      case EditorPackage.TYPE_PARAMETER_LIST__PAR:
        return getPar();
      case EditorPackage.TYPE_PARAMETER_LIST__PAR22:
        return getPar22();
      case EditorPackage.TYPE_PARAMETER_LIST__PAR2:
        return getPar2();
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
      case EditorPackage.TYPE_PARAMETER_LIST__TYNAME:
        setTyname((String)newValue);
        return;
      case EditorPackage.TYPE_PARAMETER_LIST__PAR:
        setPar((String)newValue);
        return;
      case EditorPackage.TYPE_PARAMETER_LIST__PAR22:
        getPar22().clear();
        getPar22().addAll((Collection<? extends TypeExpression>)newValue);
        return;
      case EditorPackage.TYPE_PARAMETER_LIST__PAR2:
        getPar2().clear();
        getPar2().addAll((Collection<? extends String>)newValue);
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
      case EditorPackage.TYPE_PARAMETER_LIST__TYNAME:
        setTyname(TYNAME_EDEFAULT);
        return;
      case EditorPackage.TYPE_PARAMETER_LIST__PAR:
        setPar(PAR_EDEFAULT);
        return;
      case EditorPackage.TYPE_PARAMETER_LIST__PAR22:
        getPar22().clear();
        return;
      case EditorPackage.TYPE_PARAMETER_LIST__PAR2:
        getPar2().clear();
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
      case EditorPackage.TYPE_PARAMETER_LIST__TYNAME:
        return TYNAME_EDEFAULT == null ? tyname != null : !TYNAME_EDEFAULT.equals(tyname);
      case EditorPackage.TYPE_PARAMETER_LIST__PAR:
        return PAR_EDEFAULT == null ? par != null : !PAR_EDEFAULT.equals(par);
      case EditorPackage.TYPE_PARAMETER_LIST__PAR22:
        return par22 != null && !par22.isEmpty();
      case EditorPackage.TYPE_PARAMETER_LIST__PAR2:
        return par2 != null && !par2.isEmpty();
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
    result.append(" (tyname: ");
    result.append(tyname);
    result.append(", par: ");
    result.append(par);
    result.append(", par2: ");
    result.append(par2);
    result.append(')');
    return result.toString();
  }

} //TypeParameterListImpl
