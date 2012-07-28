/**
 */
package com.euclideanspace.spad.editor.impl;

import com.euclideanspace.spad.editor.EditorPackage;
import com.euclideanspace.spad.editor.ExitExpression;
import com.euclideanspace.spad.editor.Expr;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exit Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.spad.editor.impl.ExitExpressionImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.ExitExpressionImpl#getOp <em>Op</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.ExitExpressionImpl#getRight <em>Right</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.ExitExpressionImpl#getR2 <em>R2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExitExpressionImpl extends ExprImpl implements ExitExpression
{
  /**
   * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft()
   * @generated
   * @ordered
   */
  protected Expr left;

  /**
   * The default value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected static final String OP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected String op = OP_EDEFAULT;

  /**
   * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRight()
   * @generated
   * @ordered
   */
  protected Expr right;

  /**
   * The cached value of the '{@link #getR2() <em>R2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getR2()
   * @generated
   * @ordered
   */
  protected Expr r2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExitExpressionImpl()
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
    return EditorPackage.Literals.EXIT_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getLeft()
  {
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeft(Expr newLeft, NotificationChain msgs)
  {
    Expr oldLeft = left;
    left = newLeft;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.EXIT_EXPRESSION__LEFT, oldLeft, newLeft);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeft(Expr newLeft)
  {
    if (newLeft != left)
    {
      NotificationChain msgs = null;
      if (left != null)
        msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.EXIT_EXPRESSION__LEFT, null, msgs);
      if (newLeft != null)
        msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.EXIT_EXPRESSION__LEFT, null, msgs);
      msgs = basicSetLeft(newLeft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.EXIT_EXPRESSION__LEFT, newLeft, newLeft));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOp()
  {
    return op;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOp(String newOp)
  {
    String oldOp = op;
    op = newOp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.EXIT_EXPRESSION__OP, oldOp, op));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getRight()
  {
    return right;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRight(Expr newRight, NotificationChain msgs)
  {
    Expr oldRight = right;
    right = newRight;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.EXIT_EXPRESSION__RIGHT, oldRight, newRight);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRight(Expr newRight)
  {
    if (newRight != right)
    {
      NotificationChain msgs = null;
      if (right != null)
        msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.EXIT_EXPRESSION__RIGHT, null, msgs);
      if (newRight != null)
        msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.EXIT_EXPRESSION__RIGHT, null, msgs);
      msgs = basicSetRight(newRight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.EXIT_EXPRESSION__RIGHT, newRight, newRight));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getR2()
  {
    return r2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetR2(Expr newR2, NotificationChain msgs)
  {
    Expr oldR2 = r2;
    r2 = newR2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.EXIT_EXPRESSION__R2, oldR2, newR2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setR2(Expr newR2)
  {
    if (newR2 != r2)
    {
      NotificationChain msgs = null;
      if (r2 != null)
        msgs = ((InternalEObject)r2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.EXIT_EXPRESSION__R2, null, msgs);
      if (newR2 != null)
        msgs = ((InternalEObject)newR2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.EXIT_EXPRESSION__R2, null, msgs);
      msgs = basicSetR2(newR2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.EXIT_EXPRESSION__R2, newR2, newR2));
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
      case EditorPackage.EXIT_EXPRESSION__LEFT:
        return basicSetLeft(null, msgs);
      case EditorPackage.EXIT_EXPRESSION__RIGHT:
        return basicSetRight(null, msgs);
      case EditorPackage.EXIT_EXPRESSION__R2:
        return basicSetR2(null, msgs);
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
      case EditorPackage.EXIT_EXPRESSION__LEFT:
        return getLeft();
      case EditorPackage.EXIT_EXPRESSION__OP:
        return getOp();
      case EditorPackage.EXIT_EXPRESSION__RIGHT:
        return getRight();
      case EditorPackage.EXIT_EXPRESSION__R2:
        return getR2();
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
      case EditorPackage.EXIT_EXPRESSION__LEFT:
        setLeft((Expr)newValue);
        return;
      case EditorPackage.EXIT_EXPRESSION__OP:
        setOp((String)newValue);
        return;
      case EditorPackage.EXIT_EXPRESSION__RIGHT:
        setRight((Expr)newValue);
        return;
      case EditorPackage.EXIT_EXPRESSION__R2:
        setR2((Expr)newValue);
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
      case EditorPackage.EXIT_EXPRESSION__LEFT:
        setLeft((Expr)null);
        return;
      case EditorPackage.EXIT_EXPRESSION__OP:
        setOp(OP_EDEFAULT);
        return;
      case EditorPackage.EXIT_EXPRESSION__RIGHT:
        setRight((Expr)null);
        return;
      case EditorPackage.EXIT_EXPRESSION__R2:
        setR2((Expr)null);
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
      case EditorPackage.EXIT_EXPRESSION__LEFT:
        return left != null;
      case EditorPackage.EXIT_EXPRESSION__OP:
        return OP_EDEFAULT == null ? op != null : !OP_EDEFAULT.equals(op);
      case EditorPackage.EXIT_EXPRESSION__RIGHT:
        return right != null;
      case EditorPackage.EXIT_EXPRESSION__R2:
        return r2 != null;
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
    result.append(" (op: ");
    result.append(op);
    result.append(')');
    return result.toString();
  }

} //ExitExpressionImpl
