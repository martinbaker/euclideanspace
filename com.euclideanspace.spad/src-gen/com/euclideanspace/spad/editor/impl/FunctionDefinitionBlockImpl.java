/**
 */
package com.euclideanspace.spad.editor.impl;

import com.euclideanspace.spad.editor.EditorPackage;
import com.euclideanspace.spad.editor.Expr;
import com.euclideanspace.spad.editor.FunctionDefinition;
import com.euclideanspace.spad.editor.FunctionDefinitionBlock;
import com.euclideanspace.spad.editor.VariableDeclarationAssign;

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
 * An implementation of the model object '<em><b>Function Definition Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.spad.editor.impl.FunctionDefinitionBlockImpl#getFnDecBr <em>Fn Dec Br</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.FunctionDefinitionBlockImpl#getFnDecBk <em>Fn Dec Bk</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.FunctionDefinitionBlockImpl#getVars <em>Vars</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.FunctionDefinitionBlockImpl#getT1 <em>T1</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.FunctionDefinitionBlockImpl#getT13 <em>T13</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionDefinitionBlockImpl extends MinimalEObjectImpl.Container implements FunctionDefinitionBlock
{
  /**
   * The default value of the '{@link #getFnDecBr() <em>Fn Dec Br</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFnDecBr()
   * @generated
   * @ordered
   */
  protected static final String FN_DEC_BR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFnDecBr() <em>Fn Dec Br</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFnDecBr()
   * @generated
   * @ordered
   */
  protected String fnDecBr = FN_DEC_BR_EDEFAULT;

  /**
   * The cached value of the '{@link #getFnDecBk() <em>Fn Dec Bk</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFnDecBk()
   * @generated
   * @ordered
   */
  protected EList<FunctionDefinition> fnDecBk;

  /**
   * The cached value of the '{@link #getVars() <em>Vars</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVars()
   * @generated
   * @ordered
   */
  protected EList<VariableDeclarationAssign> vars;

  /**
   * The cached value of the '{@link #getT1() <em>T1</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT1()
   * @generated
   * @ordered
   */
  protected EList<Expr> t1;

  /**
   * The cached value of the '{@link #getT13() <em>T13</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT13()
   * @generated
   * @ordered
   */
  protected EList<FunctionDefinitionBlock> t13;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FunctionDefinitionBlockImpl()
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
    return EditorPackage.Literals.FUNCTION_DEFINITION_BLOCK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFnDecBr()
  {
    return fnDecBr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFnDecBr(String newFnDecBr)
  {
    String oldFnDecBr = fnDecBr;
    fnDecBr = newFnDecBr;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.FUNCTION_DEFINITION_BLOCK__FN_DEC_BR, oldFnDecBr, fnDecBr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FunctionDefinition> getFnDecBk()
  {
    if (fnDecBk == null)
    {
      fnDecBk = new EObjectContainmentEList<FunctionDefinition>(FunctionDefinition.class, this, EditorPackage.FUNCTION_DEFINITION_BLOCK__FN_DEC_BK);
    }
    return fnDecBk;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<VariableDeclarationAssign> getVars()
  {
    if (vars == null)
    {
      vars = new EObjectContainmentEList<VariableDeclarationAssign>(VariableDeclarationAssign.class, this, EditorPackage.FUNCTION_DEFINITION_BLOCK__VARS);
    }
    return vars;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expr> getT1()
  {
    if (t1 == null)
    {
      t1 = new EObjectContainmentEList<Expr>(Expr.class, this, EditorPackage.FUNCTION_DEFINITION_BLOCK__T1);
    }
    return t1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FunctionDefinitionBlock> getT13()
  {
    if (t13 == null)
    {
      t13 = new EObjectContainmentEList<FunctionDefinitionBlock>(FunctionDefinitionBlock.class, this, EditorPackage.FUNCTION_DEFINITION_BLOCK__T13);
    }
    return t13;
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
      case EditorPackage.FUNCTION_DEFINITION_BLOCK__FN_DEC_BK:
        return ((InternalEList<?>)getFnDecBk()).basicRemove(otherEnd, msgs);
      case EditorPackage.FUNCTION_DEFINITION_BLOCK__VARS:
        return ((InternalEList<?>)getVars()).basicRemove(otherEnd, msgs);
      case EditorPackage.FUNCTION_DEFINITION_BLOCK__T1:
        return ((InternalEList<?>)getT1()).basicRemove(otherEnd, msgs);
      case EditorPackage.FUNCTION_DEFINITION_BLOCK__T13:
        return ((InternalEList<?>)getT13()).basicRemove(otherEnd, msgs);
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
      case EditorPackage.FUNCTION_DEFINITION_BLOCK__FN_DEC_BR:
        return getFnDecBr();
      case EditorPackage.FUNCTION_DEFINITION_BLOCK__FN_DEC_BK:
        return getFnDecBk();
      case EditorPackage.FUNCTION_DEFINITION_BLOCK__VARS:
        return getVars();
      case EditorPackage.FUNCTION_DEFINITION_BLOCK__T1:
        return getT1();
      case EditorPackage.FUNCTION_DEFINITION_BLOCK__T13:
        return getT13();
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
      case EditorPackage.FUNCTION_DEFINITION_BLOCK__FN_DEC_BR:
        setFnDecBr((String)newValue);
        return;
      case EditorPackage.FUNCTION_DEFINITION_BLOCK__FN_DEC_BK:
        getFnDecBk().clear();
        getFnDecBk().addAll((Collection<? extends FunctionDefinition>)newValue);
        return;
      case EditorPackage.FUNCTION_DEFINITION_BLOCK__VARS:
        getVars().clear();
        getVars().addAll((Collection<? extends VariableDeclarationAssign>)newValue);
        return;
      case EditorPackage.FUNCTION_DEFINITION_BLOCK__T1:
        getT1().clear();
        getT1().addAll((Collection<? extends Expr>)newValue);
        return;
      case EditorPackage.FUNCTION_DEFINITION_BLOCK__T13:
        getT13().clear();
        getT13().addAll((Collection<? extends FunctionDefinitionBlock>)newValue);
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
      case EditorPackage.FUNCTION_DEFINITION_BLOCK__FN_DEC_BR:
        setFnDecBr(FN_DEC_BR_EDEFAULT);
        return;
      case EditorPackage.FUNCTION_DEFINITION_BLOCK__FN_DEC_BK:
        getFnDecBk().clear();
        return;
      case EditorPackage.FUNCTION_DEFINITION_BLOCK__VARS:
        getVars().clear();
        return;
      case EditorPackage.FUNCTION_DEFINITION_BLOCK__T1:
        getT1().clear();
        return;
      case EditorPackage.FUNCTION_DEFINITION_BLOCK__T13:
        getT13().clear();
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
      case EditorPackage.FUNCTION_DEFINITION_BLOCK__FN_DEC_BR:
        return FN_DEC_BR_EDEFAULT == null ? fnDecBr != null : !FN_DEC_BR_EDEFAULT.equals(fnDecBr);
      case EditorPackage.FUNCTION_DEFINITION_BLOCK__FN_DEC_BK:
        return fnDecBk != null && !fnDecBk.isEmpty();
      case EditorPackage.FUNCTION_DEFINITION_BLOCK__VARS:
        return vars != null && !vars.isEmpty();
      case EditorPackage.FUNCTION_DEFINITION_BLOCK__T1:
        return t1 != null && !t1.isEmpty();
      case EditorPackage.FUNCTION_DEFINITION_BLOCK__T13:
        return t13 != null && !t13.isEmpty();
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
    result.append(" (fnDecBr: ");
    result.append(fnDecBr);
    result.append(')');
    return result.toString();
  }

} //FunctionDefinitionBlockImpl
