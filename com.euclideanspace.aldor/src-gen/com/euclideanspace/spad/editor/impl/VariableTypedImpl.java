/**
 */
package com.euclideanspace.spad.editor.impl;

import com.euclideanspace.spad.editor.EditorPackage;
import com.euclideanspace.spad.editor.TypeExpression;
import com.euclideanspace.spad.editor.VariableTyped;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Typed</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.spad.editor.impl.VariableTypedImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.VariableTypedImpl#getVarNameSt <em>Var Name St</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.VariableTypedImpl#getTyp <em>Typ</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableTypedImpl extends MinimalEObjectImpl.Container implements VariableTyped
{
  /**
   * The default value of the '{@link #getVarName() <em>Var Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarName()
   * @generated
   * @ordered
   */
  protected static final String VAR_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVarName() <em>Var Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarName()
   * @generated
   * @ordered
   */
  protected String varName = VAR_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getVarNameSt() <em>Var Name St</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarNameSt()
   * @generated
   * @ordered
   */
  protected static final String VAR_NAME_ST_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVarNameSt() <em>Var Name St</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarNameSt()
   * @generated
   * @ordered
   */
  protected String varNameSt = VAR_NAME_ST_EDEFAULT;

  /**
   * The cached value of the '{@link #getTyp() <em>Typ</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTyp()
   * @generated
   * @ordered
   */
  protected TypeExpression typ;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VariableTypedImpl()
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
    return EditorPackage.Literals.VARIABLE_TYPED;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVarName()
  {
    return varName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVarName(String newVarName)
  {
    String oldVarName = varName;
    varName = newVarName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.VARIABLE_TYPED__VAR_NAME, oldVarName, varName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVarNameSt()
  {
    return varNameSt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVarNameSt(String newVarNameSt)
  {
    String oldVarNameSt = varNameSt;
    varNameSt = newVarNameSt;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.VARIABLE_TYPED__VAR_NAME_ST, oldVarNameSt, varNameSt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeExpression getTyp()
  {
    return typ;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTyp(TypeExpression newTyp, NotificationChain msgs)
  {
    TypeExpression oldTyp = typ;
    typ = newTyp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.VARIABLE_TYPED__TYP, oldTyp, newTyp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTyp(TypeExpression newTyp)
  {
    if (newTyp != typ)
    {
      NotificationChain msgs = null;
      if (typ != null)
        msgs = ((InternalEObject)typ).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.VARIABLE_TYPED__TYP, null, msgs);
      if (newTyp != null)
        msgs = ((InternalEObject)newTyp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.VARIABLE_TYPED__TYP, null, msgs);
      msgs = basicSetTyp(newTyp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.VARIABLE_TYPED__TYP, newTyp, newTyp));
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
      case EditorPackage.VARIABLE_TYPED__TYP:
        return basicSetTyp(null, msgs);
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
      case EditorPackage.VARIABLE_TYPED__VAR_NAME:
        return getVarName();
      case EditorPackage.VARIABLE_TYPED__VAR_NAME_ST:
        return getVarNameSt();
      case EditorPackage.VARIABLE_TYPED__TYP:
        return getTyp();
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
      case EditorPackage.VARIABLE_TYPED__VAR_NAME:
        setVarName((String)newValue);
        return;
      case EditorPackage.VARIABLE_TYPED__VAR_NAME_ST:
        setVarNameSt((String)newValue);
        return;
      case EditorPackage.VARIABLE_TYPED__TYP:
        setTyp((TypeExpression)newValue);
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
      case EditorPackage.VARIABLE_TYPED__VAR_NAME:
        setVarName(VAR_NAME_EDEFAULT);
        return;
      case EditorPackage.VARIABLE_TYPED__VAR_NAME_ST:
        setVarNameSt(VAR_NAME_ST_EDEFAULT);
        return;
      case EditorPackage.VARIABLE_TYPED__TYP:
        setTyp((TypeExpression)null);
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
      case EditorPackage.VARIABLE_TYPED__VAR_NAME:
        return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
      case EditorPackage.VARIABLE_TYPED__VAR_NAME_ST:
        return VAR_NAME_ST_EDEFAULT == null ? varNameSt != null : !VAR_NAME_ST_EDEFAULT.equals(varNameSt);
      case EditorPackage.VARIABLE_TYPED__TYP:
        return typ != null;
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
    result.append(" (varName: ");
    result.append(varName);
    result.append(", varNameSt: ");
    result.append(varNameSt);
    result.append(')');
    return result.toString();
  }

} //VariableTypedImpl
