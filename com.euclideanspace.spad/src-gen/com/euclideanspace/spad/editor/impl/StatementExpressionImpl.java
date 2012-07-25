/**
 */
package com.euclideanspace.spad.editor.impl;

import com.euclideanspace.spad.editor.Block;
import com.euclideanspace.spad.editor.EditorPackage;
import com.euclideanspace.spad.editor.Expr;
import com.euclideanspace.spad.editor.Statement;
import com.euclideanspace.spad.editor.StatementExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statement Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.spad.editor.impl.StatementExpressionImpl#getT <em>T</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.StatementExpressionImpl#getT5 <em>T5</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.StatementExpressionImpl#getT4 <em>T4</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StatementExpressionImpl extends MinimalEObjectImpl.Container implements StatementExpression
{
  /**
   * The cached value of the '{@link #getT() <em>T</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT()
   * @generated
   * @ordered
   */
  protected Expr t;

  /**
   * The cached value of the '{@link #getT5() <em>T5</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT5()
   * @generated
   * @ordered
   */
  protected Block t5;

  /**
   * The cached value of the '{@link #getT4() <em>T4</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT4()
   * @generated
   * @ordered
   */
  protected Statement t4;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StatementExpressionImpl()
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
    return EditorPackage.Literals.STATEMENT_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getT()
  {
    return t;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetT(Expr newT, NotificationChain msgs)
  {
    Expr oldT = t;
    t = newT;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.STATEMENT_EXPRESSION__T, oldT, newT);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT(Expr newT)
  {
    if (newT != t)
    {
      NotificationChain msgs = null;
      if (t != null)
        msgs = ((InternalEObject)t).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.STATEMENT_EXPRESSION__T, null, msgs);
      if (newT != null)
        msgs = ((InternalEObject)newT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.STATEMENT_EXPRESSION__T, null, msgs);
      msgs = basicSetT(newT, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.STATEMENT_EXPRESSION__T, newT, newT));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Block getT5()
  {
    return t5;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetT5(Block newT5, NotificationChain msgs)
  {
    Block oldT5 = t5;
    t5 = newT5;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.STATEMENT_EXPRESSION__T5, oldT5, newT5);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT5(Block newT5)
  {
    if (newT5 != t5)
    {
      NotificationChain msgs = null;
      if (t5 != null)
        msgs = ((InternalEObject)t5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.STATEMENT_EXPRESSION__T5, null, msgs);
      if (newT5 != null)
        msgs = ((InternalEObject)newT5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.STATEMENT_EXPRESSION__T5, null, msgs);
      msgs = basicSetT5(newT5, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.STATEMENT_EXPRESSION__T5, newT5, newT5));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement getT4()
  {
    return t4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetT4(Statement newT4, NotificationChain msgs)
  {
    Statement oldT4 = t4;
    t4 = newT4;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.STATEMENT_EXPRESSION__T4, oldT4, newT4);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT4(Statement newT4)
  {
    if (newT4 != t4)
    {
      NotificationChain msgs = null;
      if (t4 != null)
        msgs = ((InternalEObject)t4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.STATEMENT_EXPRESSION__T4, null, msgs);
      if (newT4 != null)
        msgs = ((InternalEObject)newT4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.STATEMENT_EXPRESSION__T4, null, msgs);
      msgs = basicSetT4(newT4, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.STATEMENT_EXPRESSION__T4, newT4, newT4));
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
      case EditorPackage.STATEMENT_EXPRESSION__T:
        return basicSetT(null, msgs);
      case EditorPackage.STATEMENT_EXPRESSION__T5:
        return basicSetT5(null, msgs);
      case EditorPackage.STATEMENT_EXPRESSION__T4:
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
      case EditorPackage.STATEMENT_EXPRESSION__T:
        return getT();
      case EditorPackage.STATEMENT_EXPRESSION__T5:
        return getT5();
      case EditorPackage.STATEMENT_EXPRESSION__T4:
        return getT4();
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
      case EditorPackage.STATEMENT_EXPRESSION__T:
        setT((Expr)newValue);
        return;
      case EditorPackage.STATEMENT_EXPRESSION__T5:
        setT5((Block)newValue);
        return;
      case EditorPackage.STATEMENT_EXPRESSION__T4:
        setT4((Statement)newValue);
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
      case EditorPackage.STATEMENT_EXPRESSION__T:
        setT((Expr)null);
        return;
      case EditorPackage.STATEMENT_EXPRESSION__T5:
        setT5((Block)null);
        return;
      case EditorPackage.STATEMENT_EXPRESSION__T4:
        setT4((Statement)null);
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
      case EditorPackage.STATEMENT_EXPRESSION__T:
        return t != null;
      case EditorPackage.STATEMENT_EXPRESSION__T5:
        return t5 != null;
      case EditorPackage.STATEMENT_EXPRESSION__T4:
        return t4 != null;
    }
    return super.eIsSet(featureID);
  }

} //StatementExpressionImpl
