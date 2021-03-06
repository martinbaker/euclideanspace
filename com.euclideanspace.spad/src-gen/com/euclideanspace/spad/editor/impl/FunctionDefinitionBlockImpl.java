/**
 */
package com.euclideanspace.spad.editor.impl;

import com.euclideanspace.spad.editor.EditorPackage;
import com.euclideanspace.spad.editor.Expr;
import com.euclideanspace.spad.editor.FunctionDefinition;
import com.euclideanspace.spad.editor.FunctionDefinitionBlock;
import com.euclideanspace.spad.editor.Import;
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
 *   <li>{@link com.euclideanspace.spad.editor.impl.FunctionDefinitionBlockImpl#getT14 <em>T14</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.FunctionDefinitionBlockImpl#getI1 <em>I1</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.FunctionDefinitionBlockImpl#getE <em>E</em>}</li>
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
   * The cached value of the '{@link #getT14() <em>T14</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT14()
   * @generated
   * @ordered
   */
  protected EList<FunctionDefinitionBlock> t14;

  /**
   * The cached value of the '{@link #getI1() <em>I1</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getI1()
   * @generated
   * @ordered
   */
  protected EList<Import> i1;

  /**
   * The cached value of the '{@link #getE() <em>E</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getE()
   * @generated
   * @ordered
   */
  protected Expr e;

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
  public EList<FunctionDefinitionBlock> getT14()
  {
    if (t14 == null)
    {
      t14 = new EObjectContainmentEList<FunctionDefinitionBlock>(FunctionDefinitionBlock.class, this, EditorPackage.FUNCTION_DEFINITION_BLOCK__T14);
    }
    return t14;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Import> getI1()
  {
    if (i1 == null)
    {
      i1 = new EObjectContainmentEList<Import>(Import.class, this, EditorPackage.FUNCTION_DEFINITION_BLOCK__I1);
    }
    return i1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getE()
  {
    return e;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetE(Expr newE, NotificationChain msgs)
  {
    Expr oldE = e;
    e = newE;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.FUNCTION_DEFINITION_BLOCK__E, oldE, newE);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setE(Expr newE)
  {
    if (newE != e)
    {
      NotificationChain msgs = null;
      if (e != null)
        msgs = ((InternalEObject)e).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.FUNCTION_DEFINITION_BLOCK__E, null, msgs);
      if (newE != null)
        msgs = ((InternalEObject)newE).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.FUNCTION_DEFINITION_BLOCK__E, null, msgs);
      msgs = basicSetE(newE, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.FUNCTION_DEFINITION_BLOCK__E, newE, newE));
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
      case EditorPackage.FUNCTION_DEFINITION_BLOCK__T14:
        return ((InternalEList<?>)getT14()).basicRemove(otherEnd, msgs);
      case EditorPackage.FUNCTION_DEFINITION_BLOCK__I1:
        return ((InternalEList<?>)getI1()).basicRemove(otherEnd, msgs);
      case EditorPackage.FUNCTION_DEFINITION_BLOCK__E:
        return basicSetE(null, msgs);
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
      case EditorPackage.FUNCTION_DEFINITION_BLOCK__T14:
        return getT14();
      case EditorPackage.FUNCTION_DEFINITION_BLOCK__I1:
        return getI1();
      case EditorPackage.FUNCTION_DEFINITION_BLOCK__E:
        return getE();
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
      case EditorPackage.FUNCTION_DEFINITION_BLOCK__T14:
        getT14().clear();
        getT14().addAll((Collection<? extends FunctionDefinitionBlock>)newValue);
        return;
      case EditorPackage.FUNCTION_DEFINITION_BLOCK__I1:
        getI1().clear();
        getI1().addAll((Collection<? extends Import>)newValue);
        return;
      case EditorPackage.FUNCTION_DEFINITION_BLOCK__E:
        setE((Expr)newValue);
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
      case EditorPackage.FUNCTION_DEFINITION_BLOCK__T14:
        getT14().clear();
        return;
      case EditorPackage.FUNCTION_DEFINITION_BLOCK__I1:
        getI1().clear();
        return;
      case EditorPackage.FUNCTION_DEFINITION_BLOCK__E:
        setE((Expr)null);
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
      case EditorPackage.FUNCTION_DEFINITION_BLOCK__T14:
        return t14 != null && !t14.isEmpty();
      case EditorPackage.FUNCTION_DEFINITION_BLOCK__I1:
        return i1 != null && !i1.isEmpty();
      case EditorPackage.FUNCTION_DEFINITION_BLOCK__E:
        return e != null;
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
