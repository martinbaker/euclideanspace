/**
 */
package com.euclideanspace.spad.editor.impl;

import com.euclideanspace.spad.editor.EditorPackage;
import com.euclideanspace.spad.editor.Expr;
import com.euclideanspace.spad.editor.Predicate;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.spad.editor.impl.ExprImpl#getIfname <em>Ifname</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.ExprImpl#getIfpred <em>Ifpred</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.ExprImpl#getThenexp <em>Thenexp</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.ExprImpl#getElseexp <em>Elseexp</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExprImpl extends MinimalEObjectImpl.Container implements Expr
{
  /**
   * The default value of the '{@link #getIfname() <em>Ifname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIfname()
   * @generated
   * @ordered
   */
  protected static final String IFNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIfname() <em>Ifname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIfname()
   * @generated
   * @ordered
   */
  protected String ifname = IFNAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getIfpred() <em>Ifpred</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIfpred()
   * @generated
   * @ordered
   */
  protected Predicate ifpred;

  /**
   * The cached value of the '{@link #getThenexp() <em>Thenexp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThenexp()
   * @generated
   * @ordered
   */
  protected Expr thenexp;

  /**
   * The cached value of the '{@link #getElseexp() <em>Elseexp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElseexp()
   * @generated
   * @ordered
   */
  protected Expr elseexp;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExprImpl()
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
    return EditorPackage.Literals.EXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIfname()
  {
    return ifname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIfname(String newIfname)
  {
    String oldIfname = ifname;
    ifname = newIfname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.EXPR__IFNAME, oldIfname, ifname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Predicate getIfpred()
  {
    return ifpred;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIfpred(Predicate newIfpred, NotificationChain msgs)
  {
    Predicate oldIfpred = ifpred;
    ifpred = newIfpred;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.EXPR__IFPRED, oldIfpred, newIfpred);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIfpred(Predicate newIfpred)
  {
    if (newIfpred != ifpred)
    {
      NotificationChain msgs = null;
      if (ifpred != null)
        msgs = ((InternalEObject)ifpred).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.EXPR__IFPRED, null, msgs);
      if (newIfpred != null)
        msgs = ((InternalEObject)newIfpred).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.EXPR__IFPRED, null, msgs);
      msgs = basicSetIfpred(newIfpred, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.EXPR__IFPRED, newIfpred, newIfpred));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getThenexp()
  {
    return thenexp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetThenexp(Expr newThenexp, NotificationChain msgs)
  {
    Expr oldThenexp = thenexp;
    thenexp = newThenexp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.EXPR__THENEXP, oldThenexp, newThenexp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setThenexp(Expr newThenexp)
  {
    if (newThenexp != thenexp)
    {
      NotificationChain msgs = null;
      if (thenexp != null)
        msgs = ((InternalEObject)thenexp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.EXPR__THENEXP, null, msgs);
      if (newThenexp != null)
        msgs = ((InternalEObject)newThenexp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.EXPR__THENEXP, null, msgs);
      msgs = basicSetThenexp(newThenexp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.EXPR__THENEXP, newThenexp, newThenexp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getElseexp()
  {
    return elseexp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElseexp(Expr newElseexp, NotificationChain msgs)
  {
    Expr oldElseexp = elseexp;
    elseexp = newElseexp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.EXPR__ELSEEXP, oldElseexp, newElseexp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElseexp(Expr newElseexp)
  {
    if (newElseexp != elseexp)
    {
      NotificationChain msgs = null;
      if (elseexp != null)
        msgs = ((InternalEObject)elseexp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.EXPR__ELSEEXP, null, msgs);
      if (newElseexp != null)
        msgs = ((InternalEObject)newElseexp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.EXPR__ELSEEXP, null, msgs);
      msgs = basicSetElseexp(newElseexp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.EXPR__ELSEEXP, newElseexp, newElseexp));
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
      case EditorPackage.EXPR__IFPRED:
        return basicSetIfpred(null, msgs);
      case EditorPackage.EXPR__THENEXP:
        return basicSetThenexp(null, msgs);
      case EditorPackage.EXPR__ELSEEXP:
        return basicSetElseexp(null, msgs);
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
      case EditorPackage.EXPR__IFNAME:
        return getIfname();
      case EditorPackage.EXPR__IFPRED:
        return getIfpred();
      case EditorPackage.EXPR__THENEXP:
        return getThenexp();
      case EditorPackage.EXPR__ELSEEXP:
        return getElseexp();
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
      case EditorPackage.EXPR__IFNAME:
        setIfname((String)newValue);
        return;
      case EditorPackage.EXPR__IFPRED:
        setIfpred((Predicate)newValue);
        return;
      case EditorPackage.EXPR__THENEXP:
        setThenexp((Expr)newValue);
        return;
      case EditorPackage.EXPR__ELSEEXP:
        setElseexp((Expr)newValue);
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
      case EditorPackage.EXPR__IFNAME:
        setIfname(IFNAME_EDEFAULT);
        return;
      case EditorPackage.EXPR__IFPRED:
        setIfpred((Predicate)null);
        return;
      case EditorPackage.EXPR__THENEXP:
        setThenexp((Expr)null);
        return;
      case EditorPackage.EXPR__ELSEEXP:
        setElseexp((Expr)null);
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
      case EditorPackage.EXPR__IFNAME:
        return IFNAME_EDEFAULT == null ? ifname != null : !IFNAME_EDEFAULT.equals(ifname);
      case EditorPackage.EXPR__IFPRED:
        return ifpred != null;
      case EditorPackage.EXPR__THENEXP:
        return thenexp != null;
      case EditorPackage.EXPR__ELSEEXP:
        return elseexp != null;
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
    result.append(" (ifname: ");
    result.append(ifname);
    result.append(')');
    return result.toString();
  }

} //ExprImpl
