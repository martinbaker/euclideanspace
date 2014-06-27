/**
 */
package com.euclideanspace.aldor.editor.impl;

import com.euclideanspace.aldor.editor.EditorPackage;
import com.euclideanspace.aldor.editor.Expr;
import com.euclideanspace.aldor.editor.TypeExpression;
import com.euclideanspace.aldor.editor.VariableDeclarationAssign;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Declaration Assign</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.VariableDeclarationAssignImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.VariableDeclarationAssignImpl#getT12 <em>T12</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.VariableDeclarationAssignImpl#getTyp <em>Typ</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.VariableDeclarationAssignImpl#getT4 <em>T4</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableDeclarationAssignImpl extends AddStatementsImpl implements VariableDeclarationAssign
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
   * The cached value of the '{@link #getT12() <em>T12</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT12()
   * @generated
   * @ordered
   */
  protected EList<String> t12;

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
   * The cached value of the '{@link #getT4() <em>T4</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT4()
   * @generated
   * @ordered
   */
  protected Expr t4;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VariableDeclarationAssignImpl()
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
    return EditorPackage.Literals.VARIABLE_DECLARATION_ASSIGN;
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
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.VARIABLE_DECLARATION_ASSIGN__VAR_NAME, oldVarName, varName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getT12()
  {
    if (t12 == null)
    {
      t12 = new EDataTypeEList<String>(String.class, this, EditorPackage.VARIABLE_DECLARATION_ASSIGN__T12);
    }
    return t12;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.VARIABLE_DECLARATION_ASSIGN__TYP, oldTyp, newTyp);
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
        msgs = ((InternalEObject)typ).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.VARIABLE_DECLARATION_ASSIGN__TYP, null, msgs);
      if (newTyp != null)
        msgs = ((InternalEObject)newTyp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.VARIABLE_DECLARATION_ASSIGN__TYP, null, msgs);
      msgs = basicSetTyp(newTyp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.VARIABLE_DECLARATION_ASSIGN__TYP, newTyp, newTyp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getT4()
  {
    return t4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetT4(Expr newT4, NotificationChain msgs)
  {
    Expr oldT4 = t4;
    t4 = newT4;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.VARIABLE_DECLARATION_ASSIGN__T4, oldT4, newT4);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT4(Expr newT4)
  {
    if (newT4 != t4)
    {
      NotificationChain msgs = null;
      if (t4 != null)
        msgs = ((InternalEObject)t4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.VARIABLE_DECLARATION_ASSIGN__T4, null, msgs);
      if (newT4 != null)
        msgs = ((InternalEObject)newT4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.VARIABLE_DECLARATION_ASSIGN__T4, null, msgs);
      msgs = basicSetT4(newT4, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.VARIABLE_DECLARATION_ASSIGN__T4, newT4, newT4));
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
      case EditorPackage.VARIABLE_DECLARATION_ASSIGN__TYP:
        return basicSetTyp(null, msgs);
      case EditorPackage.VARIABLE_DECLARATION_ASSIGN__T4:
        return basicSetT4(null, msgs);
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
      case EditorPackage.VARIABLE_DECLARATION_ASSIGN__VAR_NAME:
        return getVarName();
      case EditorPackage.VARIABLE_DECLARATION_ASSIGN__T12:
        return getT12();
      case EditorPackage.VARIABLE_DECLARATION_ASSIGN__TYP:
        return getTyp();
      case EditorPackage.VARIABLE_DECLARATION_ASSIGN__T4:
        return getT4();
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
      case EditorPackage.VARIABLE_DECLARATION_ASSIGN__VAR_NAME:
        setVarName((String)newValue);
        return;
      case EditorPackage.VARIABLE_DECLARATION_ASSIGN__T12:
        getT12().clear();
        getT12().addAll((Collection<? extends String>)newValue);
        return;
      case EditorPackage.VARIABLE_DECLARATION_ASSIGN__TYP:
        setTyp((TypeExpression)newValue);
        return;
      case EditorPackage.VARIABLE_DECLARATION_ASSIGN__T4:
        setT4((Expr)newValue);
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
      case EditorPackage.VARIABLE_DECLARATION_ASSIGN__VAR_NAME:
        setVarName(VAR_NAME_EDEFAULT);
        return;
      case EditorPackage.VARIABLE_DECLARATION_ASSIGN__T12:
        getT12().clear();
        return;
      case EditorPackage.VARIABLE_DECLARATION_ASSIGN__TYP:
        setTyp((TypeExpression)null);
        return;
      case EditorPackage.VARIABLE_DECLARATION_ASSIGN__T4:
        setT4((Expr)null);
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
      case EditorPackage.VARIABLE_DECLARATION_ASSIGN__VAR_NAME:
        return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
      case EditorPackage.VARIABLE_DECLARATION_ASSIGN__T12:
        return t12 != null && !t12.isEmpty();
      case EditorPackage.VARIABLE_DECLARATION_ASSIGN__TYP:
        return typ != null;
      case EditorPackage.VARIABLE_DECLARATION_ASSIGN__T4:
        return t4 != null;
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
    result.append(", t12: ");
    result.append(t12);
    result.append(')');
    return result.toString();
  }

} //VariableDeclarationAssignImpl
