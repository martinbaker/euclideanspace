/**
 */
package com.euclideanspace.spad.editor.impl;

import com.euclideanspace.spad.editor.EditorPackage;
import com.euclideanspace.spad.editor.Expr;
import com.euclideanspace.spad.editor.UnaryExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unary Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.spad.editor.impl.UnaryExpressionImpl#getUop <em>Uop</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.UnaryExpressionImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.UnaryExpressionImpl#getTe <em>Te</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnaryExpressionImpl extends ExprImpl implements UnaryExpression
{
  /**
   * The default value of the '{@link #getUop() <em>Uop</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUop()
   * @generated
   * @ordered
   */
  protected static final String UOP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUop() <em>Uop</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUop()
   * @generated
   * @ordered
   */
  protected String uop = UOP_EDEFAULT;

  /**
   * The cached value of the '{@link #getExpr() <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr()
   * @generated
   * @ordered
   */
  protected Expr expr;

  /**
   * The default value of the '{@link #getTe() <em>Te</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTe()
   * @generated
   * @ordered
   */
  protected static final String TE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTe() <em>Te</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTe()
   * @generated
   * @ordered
   */
  protected String te = TE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UnaryExpressionImpl()
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
    return EditorPackage.Literals.UNARY_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUop()
  {
    return uop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUop(String newUop)
  {
    String oldUop = uop;
    uop = newUop;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.UNARY_EXPRESSION__UOP, oldUop, uop));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getExpr()
  {
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpr(Expr newExpr, NotificationChain msgs)
  {
    Expr oldExpr = expr;
    expr = newExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.UNARY_EXPRESSION__EXPR, oldExpr, newExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpr(Expr newExpr)
  {
    if (newExpr != expr)
    {
      NotificationChain msgs = null;
      if (expr != null)
        msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.UNARY_EXPRESSION__EXPR, null, msgs);
      if (newExpr != null)
        msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.UNARY_EXPRESSION__EXPR, null, msgs);
      msgs = basicSetExpr(newExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.UNARY_EXPRESSION__EXPR, newExpr, newExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTe()
  {
    return te;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTe(String newTe)
  {
    String oldTe = te;
    te = newTe;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.UNARY_EXPRESSION__TE, oldTe, te));
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
      case EditorPackage.UNARY_EXPRESSION__EXPR:
        return basicSetExpr(null, msgs);
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
      case EditorPackage.UNARY_EXPRESSION__UOP:
        return getUop();
      case EditorPackage.UNARY_EXPRESSION__EXPR:
        return getExpr();
      case EditorPackage.UNARY_EXPRESSION__TE:
        return getTe();
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
      case EditorPackage.UNARY_EXPRESSION__UOP:
        setUop((String)newValue);
        return;
      case EditorPackage.UNARY_EXPRESSION__EXPR:
        setExpr((Expr)newValue);
        return;
      case EditorPackage.UNARY_EXPRESSION__TE:
        setTe((String)newValue);
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
      case EditorPackage.UNARY_EXPRESSION__UOP:
        setUop(UOP_EDEFAULT);
        return;
      case EditorPackage.UNARY_EXPRESSION__EXPR:
        setExpr((Expr)null);
        return;
      case EditorPackage.UNARY_EXPRESSION__TE:
        setTe(TE_EDEFAULT);
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
      case EditorPackage.UNARY_EXPRESSION__UOP:
        return UOP_EDEFAULT == null ? uop != null : !UOP_EDEFAULT.equals(uop);
      case EditorPackage.UNARY_EXPRESSION__EXPR:
        return expr != null;
      case EditorPackage.UNARY_EXPRESSION__TE:
        return TE_EDEFAULT == null ? te != null : !TE_EDEFAULT.equals(te);
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
    result.append(" (uop: ");
    result.append(uop);
    result.append(", te: ");
    result.append(te);
    result.append(')');
    return result.toString();
  }

} //UnaryExpressionImpl
