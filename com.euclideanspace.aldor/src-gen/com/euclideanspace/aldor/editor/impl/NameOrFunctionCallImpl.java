/**
 */
package com.euclideanspace.aldor.editor.impl;

import com.euclideanspace.aldor.editor.EditorPackage;
import com.euclideanspace.aldor.editor.Expr;
import com.euclideanspace.aldor.editor.NameOrFunctionCall;
import com.euclideanspace.aldor.editor.Statement;
import com.euclideanspace.aldor.editor.TypeExpression;

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
 * An implementation of the model object '<em><b>Name Or Function Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.NameOrFunctionCallImpl#getFnname <em>Fnname</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.NameOrFunctionCallImpl#getLsp <em>Lsp</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.NameOrFunctionCallImpl#getT4 <em>T4</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.NameOrFunctionCallImpl#getT5 <em>T5</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.NameOrFunctionCallImpl#getT14 <em>T14</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.NameOrFunctionCallImpl#getT15 <em>T15</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.NameOrFunctionCallImpl#getT6 <em>T6</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.NameOrFunctionCallImpl#getRightType2 <em>Right Type2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NameOrFunctionCallImpl extends MinimalEObjectImpl.Container implements NameOrFunctionCall
{
  /**
   * The default value of the '{@link #getFnname() <em>Fnname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFnname()
   * @generated
   * @ordered
   */
  protected static final String FNNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFnname() <em>Fnname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFnname()
   * @generated
   * @ordered
   */
  protected String fnname = FNNAME_EDEFAULT;

  /**
   * The default value of the '{@link #getLsp() <em>Lsp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLsp()
   * @generated
   * @ordered
   */
  protected static final String LSP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLsp() <em>Lsp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLsp()
   * @generated
   * @ordered
   */
  protected String lsp = LSP_EDEFAULT;

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
   * The cached value of the '{@link #getT5() <em>T5</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT5()
   * @generated
   * @ordered
   */
  protected EList<Expr> t5;

  /**
   * The cached value of the '{@link #getT14() <em>T14</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT14()
   * @generated
   * @ordered
   */
  protected EList<Statement> t14;

  /**
   * The cached value of the '{@link #getT15() <em>T15</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT15()
   * @generated
   * @ordered
   */
  protected EList<Expr> t15;

  /**
   * The cached value of the '{@link #getT6() <em>T6</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT6()
   * @generated
   * @ordered
   */
  protected Expr t6;

  /**
   * The cached value of the '{@link #getRightType2() <em>Right Type2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRightType2()
   * @generated
   * @ordered
   */
  protected TypeExpression rightType2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NameOrFunctionCallImpl()
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
    return EditorPackage.Literals.NAME_OR_FUNCTION_CALL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFnname()
  {
    return fnname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFnname(String newFnname)
  {
    String oldFnname = fnname;
    fnname = newFnname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.NAME_OR_FUNCTION_CALL__FNNAME, oldFnname, fnname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLsp()
  {
    return lsp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLsp(String newLsp)
  {
    String oldLsp = lsp;
    lsp = newLsp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.NAME_OR_FUNCTION_CALL__LSP, oldLsp, lsp));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.NAME_OR_FUNCTION_CALL__T4, oldT4, newT4);
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
        msgs = ((InternalEObject)t4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.NAME_OR_FUNCTION_CALL__T4, null, msgs);
      if (newT4 != null)
        msgs = ((InternalEObject)newT4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.NAME_OR_FUNCTION_CALL__T4, null, msgs);
      msgs = basicSetT4(newT4, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.NAME_OR_FUNCTION_CALL__T4, newT4, newT4));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expr> getT5()
  {
    if (t5 == null)
    {
      t5 = new EObjectContainmentEList<Expr>(Expr.class, this, EditorPackage.NAME_OR_FUNCTION_CALL__T5);
    }
    return t5;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Statement> getT14()
  {
    if (t14 == null)
    {
      t14 = new EObjectContainmentEList<Statement>(Statement.class, this, EditorPackage.NAME_OR_FUNCTION_CALL__T14);
    }
    return t14;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expr> getT15()
  {
    if (t15 == null)
    {
      t15 = new EObjectContainmentEList<Expr>(Expr.class, this, EditorPackage.NAME_OR_FUNCTION_CALL__T15);
    }
    return t15;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getT6()
  {
    return t6;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetT6(Expr newT6, NotificationChain msgs)
  {
    Expr oldT6 = t6;
    t6 = newT6;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.NAME_OR_FUNCTION_CALL__T6, oldT6, newT6);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT6(Expr newT6)
  {
    if (newT6 != t6)
    {
      NotificationChain msgs = null;
      if (t6 != null)
        msgs = ((InternalEObject)t6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.NAME_OR_FUNCTION_CALL__T6, null, msgs);
      if (newT6 != null)
        msgs = ((InternalEObject)newT6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.NAME_OR_FUNCTION_CALL__T6, null, msgs);
      msgs = basicSetT6(newT6, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.NAME_OR_FUNCTION_CALL__T6, newT6, newT6));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeExpression getRightType2()
  {
    return rightType2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRightType2(TypeExpression newRightType2, NotificationChain msgs)
  {
    TypeExpression oldRightType2 = rightType2;
    rightType2 = newRightType2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.NAME_OR_FUNCTION_CALL__RIGHT_TYPE2, oldRightType2, newRightType2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRightType2(TypeExpression newRightType2)
  {
    if (newRightType2 != rightType2)
    {
      NotificationChain msgs = null;
      if (rightType2 != null)
        msgs = ((InternalEObject)rightType2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.NAME_OR_FUNCTION_CALL__RIGHT_TYPE2, null, msgs);
      if (newRightType2 != null)
        msgs = ((InternalEObject)newRightType2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.NAME_OR_FUNCTION_CALL__RIGHT_TYPE2, null, msgs);
      msgs = basicSetRightType2(newRightType2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.NAME_OR_FUNCTION_CALL__RIGHT_TYPE2, newRightType2, newRightType2));
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
      case EditorPackage.NAME_OR_FUNCTION_CALL__T4:
        return basicSetT4(null, msgs);
      case EditorPackage.NAME_OR_FUNCTION_CALL__T5:
        return ((InternalEList<?>)getT5()).basicRemove(otherEnd, msgs);
      case EditorPackage.NAME_OR_FUNCTION_CALL__T14:
        return ((InternalEList<?>)getT14()).basicRemove(otherEnd, msgs);
      case EditorPackage.NAME_OR_FUNCTION_CALL__T15:
        return ((InternalEList<?>)getT15()).basicRemove(otherEnd, msgs);
      case EditorPackage.NAME_OR_FUNCTION_CALL__T6:
        return basicSetT6(null, msgs);
      case EditorPackage.NAME_OR_FUNCTION_CALL__RIGHT_TYPE2:
        return basicSetRightType2(null, msgs);
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
      case EditorPackage.NAME_OR_FUNCTION_CALL__FNNAME:
        return getFnname();
      case EditorPackage.NAME_OR_FUNCTION_CALL__LSP:
        return getLsp();
      case EditorPackage.NAME_OR_FUNCTION_CALL__T4:
        return getT4();
      case EditorPackage.NAME_OR_FUNCTION_CALL__T5:
        return getT5();
      case EditorPackage.NAME_OR_FUNCTION_CALL__T14:
        return getT14();
      case EditorPackage.NAME_OR_FUNCTION_CALL__T15:
        return getT15();
      case EditorPackage.NAME_OR_FUNCTION_CALL__T6:
        return getT6();
      case EditorPackage.NAME_OR_FUNCTION_CALL__RIGHT_TYPE2:
        return getRightType2();
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
      case EditorPackage.NAME_OR_FUNCTION_CALL__FNNAME:
        setFnname((String)newValue);
        return;
      case EditorPackage.NAME_OR_FUNCTION_CALL__LSP:
        setLsp((String)newValue);
        return;
      case EditorPackage.NAME_OR_FUNCTION_CALL__T4:
        setT4((Expr)newValue);
        return;
      case EditorPackage.NAME_OR_FUNCTION_CALL__T5:
        getT5().clear();
        getT5().addAll((Collection<? extends Expr>)newValue);
        return;
      case EditorPackage.NAME_OR_FUNCTION_CALL__T14:
        getT14().clear();
        getT14().addAll((Collection<? extends Statement>)newValue);
        return;
      case EditorPackage.NAME_OR_FUNCTION_CALL__T15:
        getT15().clear();
        getT15().addAll((Collection<? extends Expr>)newValue);
        return;
      case EditorPackage.NAME_OR_FUNCTION_CALL__T6:
        setT6((Expr)newValue);
        return;
      case EditorPackage.NAME_OR_FUNCTION_CALL__RIGHT_TYPE2:
        setRightType2((TypeExpression)newValue);
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
      case EditorPackage.NAME_OR_FUNCTION_CALL__FNNAME:
        setFnname(FNNAME_EDEFAULT);
        return;
      case EditorPackage.NAME_OR_FUNCTION_CALL__LSP:
        setLsp(LSP_EDEFAULT);
        return;
      case EditorPackage.NAME_OR_FUNCTION_CALL__T4:
        setT4((Expr)null);
        return;
      case EditorPackage.NAME_OR_FUNCTION_CALL__T5:
        getT5().clear();
        return;
      case EditorPackage.NAME_OR_FUNCTION_CALL__T14:
        getT14().clear();
        return;
      case EditorPackage.NAME_OR_FUNCTION_CALL__T15:
        getT15().clear();
        return;
      case EditorPackage.NAME_OR_FUNCTION_CALL__T6:
        setT6((Expr)null);
        return;
      case EditorPackage.NAME_OR_FUNCTION_CALL__RIGHT_TYPE2:
        setRightType2((TypeExpression)null);
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
      case EditorPackage.NAME_OR_FUNCTION_CALL__FNNAME:
        return FNNAME_EDEFAULT == null ? fnname != null : !FNNAME_EDEFAULT.equals(fnname);
      case EditorPackage.NAME_OR_FUNCTION_CALL__LSP:
        return LSP_EDEFAULT == null ? lsp != null : !LSP_EDEFAULT.equals(lsp);
      case EditorPackage.NAME_OR_FUNCTION_CALL__T4:
        return t4 != null;
      case EditorPackage.NAME_OR_FUNCTION_CALL__T5:
        return t5 != null && !t5.isEmpty();
      case EditorPackage.NAME_OR_FUNCTION_CALL__T14:
        return t14 != null && !t14.isEmpty();
      case EditorPackage.NAME_OR_FUNCTION_CALL__T15:
        return t15 != null && !t15.isEmpty();
      case EditorPackage.NAME_OR_FUNCTION_CALL__T6:
        return t6 != null;
      case EditorPackage.NAME_OR_FUNCTION_CALL__RIGHT_TYPE2:
        return rightType2 != null;
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
    result.append(" (fnname: ");
    result.append(fnname);
    result.append(", lsp: ");
    result.append(lsp);
    result.append(')');
    return result.toString();
  }

} //NameOrFunctionCallImpl
