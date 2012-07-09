/**
 */
package com.euclideanspace.euclid.editor.impl;

import com.euclideanspace.euclid.editor.EditorPackage;
import com.euclideanspace.euclid.editor.VariableDef;

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
 * An implementation of the model object '<em><b>Variable Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.euclid.editor.impl.VariableDefImpl#getVarname <em>Varname</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.editor.impl.VariableDefImpl#getType <em>Type</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.editor.impl.VariableDefImpl#getVars <em>Vars</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableDefImpl extends MinimalEObjectImpl.Container implements VariableDef
{
  /**
   * The default value of the '{@link #getVarname() <em>Varname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarname()
   * @generated
   * @ordered
   */
  protected static final String VARNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVarname() <em>Varname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarname()
   * @generated
   * @ordered
   */
  protected String varname = VARNAME_EDEFAULT;

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
   * The cached value of the '{@link #getVars() <em>Vars</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVars()
   * @generated
   * @ordered
   */
  protected EList<XExpression> vars;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VariableDefImpl()
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
    return EditorPackage.Literals.VARIABLE_DEF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVarname()
  {
    return varname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVarname(String newVarname)
  {
    String oldVarname = varname;
    varname = newVarname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.VARIABLE_DEF__VARNAME, oldVarname, varname));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.VARIABLE_DEF__TYPE, oldType, newType);
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
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.VARIABLE_DEF__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.VARIABLE_DEF__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.VARIABLE_DEF__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<XExpression> getVars()
  {
    if (vars == null)
    {
      vars = new EObjectContainmentEList<XExpression>(XExpression.class, this, EditorPackage.VARIABLE_DEF__VARS);
    }
    return vars;
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
      case EditorPackage.VARIABLE_DEF__TYPE:
        return basicSetType(null, msgs);
      case EditorPackage.VARIABLE_DEF__VARS:
        return ((InternalEList<?>)getVars()).basicRemove(otherEnd, msgs);
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
      case EditorPackage.VARIABLE_DEF__VARNAME:
        return getVarname();
      case EditorPackage.VARIABLE_DEF__TYPE:
        return getType();
      case EditorPackage.VARIABLE_DEF__VARS:
        return getVars();
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
      case EditorPackage.VARIABLE_DEF__VARNAME:
        setVarname((String)newValue);
        return;
      case EditorPackage.VARIABLE_DEF__TYPE:
        setType((JvmTypeReference)newValue);
        return;
      case EditorPackage.VARIABLE_DEF__VARS:
        getVars().clear();
        getVars().addAll((Collection<? extends XExpression>)newValue);
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
      case EditorPackage.VARIABLE_DEF__VARNAME:
        setVarname(VARNAME_EDEFAULT);
        return;
      case EditorPackage.VARIABLE_DEF__TYPE:
        setType((JvmTypeReference)null);
        return;
      case EditorPackage.VARIABLE_DEF__VARS:
        getVars().clear();
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
      case EditorPackage.VARIABLE_DEF__VARNAME:
        return VARNAME_EDEFAULT == null ? varname != null : !VARNAME_EDEFAULT.equals(varname);
      case EditorPackage.VARIABLE_DEF__TYPE:
        return type != null;
      case EditorPackage.VARIABLE_DEF__VARS:
        return vars != null && !vars.isEmpty();
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
    result.append(" (varname: ");
    result.append(varname);
    result.append(')');
    return result.toString();
  }

} //VariableDefImpl
