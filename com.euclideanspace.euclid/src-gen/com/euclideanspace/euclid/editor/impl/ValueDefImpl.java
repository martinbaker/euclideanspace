/**
 */
package com.euclideanspace.euclid.editor.impl;

import com.euclideanspace.euclid.editor.EditorPackage;
import com.euclideanspace.euclid.editor.ValueDef;

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

import org.eclipse.xtext.common.types.JvmTypeReference;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.euclid.editor.impl.ValueDefImpl#getValname <em>Valname</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.editor.impl.ValueDefImpl#getType <em>Type</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.editor.impl.ValueDefImpl#getVals <em>Vals</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ValueDefImpl extends MinimalEObjectImpl.Container implements ValueDef
{
  /**
   * The default value of the '{@link #getValname() <em>Valname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValname()
   * @generated
   * @ordered
   */
  protected static final String VALNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValname() <em>Valname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValname()
   * @generated
   * @ordered
   */
  protected String valname = VALNAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected JvmTypeReference type;

  /**
   * The cached value of the '{@link #getVals() <em>Vals</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVals()
   * @generated
   * @ordered
   */
  protected EList<XExpression> vals;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ValueDefImpl()
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
    return EditorPackage.Literals.VALUE_DEF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getValname()
  {
    return valname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValname(String newValname)
  {
    String oldValname = valname;
    valname = newValname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.VALUE_DEF__VALNAME, oldValname, valname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmTypeReference getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(JvmTypeReference newType, NotificationChain msgs)
  {
    JvmTypeReference oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.VALUE_DEF__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(JvmTypeReference newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.VALUE_DEF__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.VALUE_DEF__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.VALUE_DEF__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<XExpression> getVals()
  {
    if (vals == null)
    {
      vals = new EObjectContainmentEList<XExpression>(XExpression.class, this, EditorPackage.VALUE_DEF__VALS);
    }
    return vals;
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
      case EditorPackage.VALUE_DEF__TYPE:
        return basicSetType(null, msgs);
      case EditorPackage.VALUE_DEF__VALS:
        return ((InternalEList<?>)getVals()).basicRemove(otherEnd, msgs);
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
      case EditorPackage.VALUE_DEF__VALNAME:
        return getValname();
      case EditorPackage.VALUE_DEF__TYPE:
        return getType();
      case EditorPackage.VALUE_DEF__VALS:
        return getVals();
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
      case EditorPackage.VALUE_DEF__VALNAME:
        setValname((String)newValue);
        return;
      case EditorPackage.VALUE_DEF__TYPE:
        setType((JvmTypeReference)newValue);
        return;
      case EditorPackage.VALUE_DEF__VALS:
        getVals().clear();
        getVals().addAll((Collection<? extends XExpression>)newValue);
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
      case EditorPackage.VALUE_DEF__VALNAME:
        setValname(VALNAME_EDEFAULT);
        return;
      case EditorPackage.VALUE_DEF__TYPE:
        setType((JvmTypeReference)null);
        return;
      case EditorPackage.VALUE_DEF__VALS:
        getVals().clear();
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
      case EditorPackage.VALUE_DEF__VALNAME:
        return VALNAME_EDEFAULT == null ? valname != null : !VALNAME_EDEFAULT.equals(valname);
      case EditorPackage.VALUE_DEF__TYPE:
        return type != null;
      case EditorPackage.VALUE_DEF__VALS:
        return vals != null && !vals.isEmpty();
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
    result.append(" (valname: ");
    result.append(valname);
    result.append(')');
    return result.toString();
  }

} //ValueDefImpl
