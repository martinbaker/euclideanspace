/**
 */
package com.euclideanspace.aldor.editor.impl;

import com.euclideanspace.aldor.editor.EditorPackage;
import com.euclideanspace.aldor.editor.TypeExpression;
import com.euclideanspace.aldor.editor.TypeParameterList;

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
 *   <li>{@link com.euclideanspace.aldor.editor.impl.TypeParameterListImpl#getTyname <em>Tyname</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.TypeParameterListImpl#getPar <em>Par</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.TypeParameterListImpl#getPar21 <em>Par21</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.TypeParameterListImpl#getPar2 <em>Par2</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.TypeParameterListImpl#getPar22 <em>Par22</em>}</li>
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
   * The cached value of the '{@link #getPar21() <em>Par21</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPar21()
   * @generated
   * @ordered
   */
  protected TypeExpression par21;

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
   * The cached value of the '{@link #getPar22() <em>Par22</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPar22()
   * @generated
   * @ordered
   */
  protected EList<TypeExpression> par22;

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
  public TypeExpression getPar21()
  {
    return par21;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPar21(TypeExpression newPar21, NotificationChain msgs)
  {
    TypeExpression oldPar21 = par21;
    par21 = newPar21;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_PARAMETER_LIST__PAR21, oldPar21, newPar21);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPar21(TypeExpression newPar21)
  {
    if (newPar21 != par21)
    {
      NotificationChain msgs = null;
      if (par21 != null)
        msgs = ((InternalEObject)par21).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.TYPE_PARAMETER_LIST__PAR21, null, msgs);
      if (newPar21 != null)
        msgs = ((InternalEObject)newPar21).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.TYPE_PARAMETER_LIST__PAR21, null, msgs);
      msgs = basicSetPar21(newPar21, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_PARAMETER_LIST__PAR21, newPar21, newPar21));
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
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case EditorPackage.TYPE_PARAMETER_LIST__PAR21:
        return basicSetPar21(null, msgs);
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
      case EditorPackage.TYPE_PARAMETER_LIST__PAR21:
        return getPar21();
      case EditorPackage.TYPE_PARAMETER_LIST__PAR2:
        return getPar2();
      case EditorPackage.TYPE_PARAMETER_LIST__PAR22:
        return getPar22();
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
      case EditorPackage.TYPE_PARAMETER_LIST__PAR21:
        setPar21((TypeExpression)newValue);
        return;
      case EditorPackage.TYPE_PARAMETER_LIST__PAR2:
        getPar2().clear();
        getPar2().addAll((Collection<? extends String>)newValue);
        return;
      case EditorPackage.TYPE_PARAMETER_LIST__PAR22:
        getPar22().clear();
        getPar22().addAll((Collection<? extends TypeExpression>)newValue);
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
      case EditorPackage.TYPE_PARAMETER_LIST__PAR21:
        setPar21((TypeExpression)null);
        return;
      case EditorPackage.TYPE_PARAMETER_LIST__PAR2:
        getPar2().clear();
        return;
      case EditorPackage.TYPE_PARAMETER_LIST__PAR22:
        getPar22().clear();
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
      case EditorPackage.TYPE_PARAMETER_LIST__PAR21:
        return par21 != null;
      case EditorPackage.TYPE_PARAMETER_LIST__PAR2:
        return par2 != null && !par2.isEmpty();
      case EditorPackage.TYPE_PARAMETER_LIST__PAR22:
        return par22 != null && !par22.isEmpty();
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
