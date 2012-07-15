/**
 */
package com.euclideanspace.spad.editor.impl;

import com.euclideanspace.spad.editor.Block;
import com.euclideanspace.spad.editor.EditorPackage;
import com.euclideanspace.spad.editor.Expr;
import com.euclideanspace.spad.editor.Statement;
import com.euclideanspace.spad.editor.StatementExpression;
import com.euclideanspace.spad.editor.TypeExpression;

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
 * An implementation of the model object '<em><b>Statement Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.spad.editor.impl.StatementExpressionImpl#getT <em>T</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.StatementExpressionImpl#getT2 <em>T2</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.StatementExpressionImpl#getT3 <em>T3</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.StatementExpressionImpl#getT33 <em>T33</em>}</li>
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
   * The cached value of the '{@link #getT2() <em>T2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT2()
   * @generated
   * @ordered
   */
  protected TypeExpression t2;

  /**
   * The cached value of the '{@link #getT3() <em>T3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT3()
   * @generated
   * @ordered
   */
  protected Expr t3;

  /**
   * The cached value of the '{@link #getT33() <em>T33</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT33()
   * @generated
   * @ordered
   */
  protected EList<Expr> t33;

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
  public TypeExpression getT2()
  {
    return t2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetT2(TypeExpression newT2, NotificationChain msgs)
  {
    TypeExpression oldT2 = t2;
    t2 = newT2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.STATEMENT_EXPRESSION__T2, oldT2, newT2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT2(TypeExpression newT2)
  {
    if (newT2 != t2)
    {
      NotificationChain msgs = null;
      if (t2 != null)
        msgs = ((InternalEObject)t2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.STATEMENT_EXPRESSION__T2, null, msgs);
      if (newT2 != null)
        msgs = ((InternalEObject)newT2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.STATEMENT_EXPRESSION__T2, null, msgs);
      msgs = basicSetT2(newT2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.STATEMENT_EXPRESSION__T2, newT2, newT2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getT3()
  {
    return t3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetT3(Expr newT3, NotificationChain msgs)
  {
    Expr oldT3 = t3;
    t3 = newT3;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.STATEMENT_EXPRESSION__T3, oldT3, newT3);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT3(Expr newT3)
  {
    if (newT3 != t3)
    {
      NotificationChain msgs = null;
      if (t3 != null)
        msgs = ((InternalEObject)t3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.STATEMENT_EXPRESSION__T3, null, msgs);
      if (newT3 != null)
        msgs = ((InternalEObject)newT3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.STATEMENT_EXPRESSION__T3, null, msgs);
      msgs = basicSetT3(newT3, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.STATEMENT_EXPRESSION__T3, newT3, newT3));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expr> getT33()
  {
    if (t33 == null)
    {
      t33 = new EObjectContainmentEList<Expr>(Expr.class, this, EditorPackage.STATEMENT_EXPRESSION__T33);
    }
    return t33;
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
      case EditorPackage.STATEMENT_EXPRESSION__T2:
        return basicSetT2(null, msgs);
      case EditorPackage.STATEMENT_EXPRESSION__T3:
        return basicSetT3(null, msgs);
      case EditorPackage.STATEMENT_EXPRESSION__T33:
        return ((InternalEList<?>)getT33()).basicRemove(otherEnd, msgs);
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
      case EditorPackage.STATEMENT_EXPRESSION__T2:
        return getT2();
      case EditorPackage.STATEMENT_EXPRESSION__T3:
        return getT3();
      case EditorPackage.STATEMENT_EXPRESSION__T33:
        return getT33();
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
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EditorPackage.STATEMENT_EXPRESSION__T:
        setT((Expr)newValue);
        return;
      case EditorPackage.STATEMENT_EXPRESSION__T2:
        setT2((TypeExpression)newValue);
        return;
      case EditorPackage.STATEMENT_EXPRESSION__T3:
        setT3((Expr)newValue);
        return;
      case EditorPackage.STATEMENT_EXPRESSION__T33:
        getT33().clear();
        getT33().addAll((Collection<? extends Expr>)newValue);
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
      case EditorPackage.STATEMENT_EXPRESSION__T2:
        setT2((TypeExpression)null);
        return;
      case EditorPackage.STATEMENT_EXPRESSION__T3:
        setT3((Expr)null);
        return;
      case EditorPackage.STATEMENT_EXPRESSION__T33:
        getT33().clear();
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
      case EditorPackage.STATEMENT_EXPRESSION__T2:
        return t2 != null;
      case EditorPackage.STATEMENT_EXPRESSION__T3:
        return t3 != null;
      case EditorPackage.STATEMENT_EXPRESSION__T33:
        return t33 != null && !t33.isEmpty();
      case EditorPackage.STATEMENT_EXPRESSION__T5:
        return t5 != null;
      case EditorPackage.STATEMENT_EXPRESSION__T4:
        return t4 != null;
    }
    return super.eIsSet(featureID);
  }

} //StatementExpressionImpl
