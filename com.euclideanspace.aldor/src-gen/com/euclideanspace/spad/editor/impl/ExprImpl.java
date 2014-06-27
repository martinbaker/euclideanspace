/**
 */
package com.euclideanspace.spad.editor.impl;

import com.euclideanspace.spad.editor.EditorPackage;
import com.euclideanspace.spad.editor.Expr;
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
 * An implementation of the model object '<em><b>Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.spad.editor.impl.ExprImpl#getIfname <em>Ifname</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.ExprImpl#getIfpred <em>Ifpred</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.ExprImpl#getThenexp <em>Thenexp</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.ExprImpl#getElseexp <em>Elseexp</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.ExprImpl#getE2 <em>E2</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.ExprImpl#getE3 <em>E3</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.ExprImpl#getE5 <em>E5</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.ExprImpl#getE6 <em>E6</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.ExprImpl#getE22 <em>E22</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.ExprImpl#getE21 <em>E21</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.ExprImpl#getE23 <em>E23</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.ExprImpl#getE9 <em>E9</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.ExprImpl#getE10 <em>E10</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.ExprImpl#getE25 <em>E25</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.ExprImpl#getE24 <em>E24</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.ExprImpl#getE26 <em>E26</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.ExprImpl#getE11 <em>E11</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.ExprImpl#getE12 <em>E12</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.ExprImpl#getE13 <em>E13</em>}</li>
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
  protected Expr ifpred;

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
   * The default value of the '{@link #getE2() <em>E2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getE2()
   * @generated
   * @ordered
   */
  protected static final String E2_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getE2() <em>E2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getE2()
   * @generated
   * @ordered
   */
  protected String e2 = E2_EDEFAULT;

  /**
   * The default value of the '{@link #getE3() <em>E3</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getE3()
   * @generated
   * @ordered
   */
  protected static final String E3_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getE3() <em>E3</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getE3()
   * @generated
   * @ordered
   */
  protected String e3 = E3_EDEFAULT;

  /**
   * The default value of the '{@link #getE5() <em>E5</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getE5()
   * @generated
   * @ordered
   */
  protected static final String E5_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getE5() <em>E5</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getE5()
   * @generated
   * @ordered
   */
  protected String e5 = E5_EDEFAULT;

  /**
   * The cached value of the '{@link #getE6() <em>E6</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getE6()
   * @generated
   * @ordered
   */
  protected TypeExpression e6;

  /**
   * The cached value of the '{@link #getE22() <em>E22</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getE22()
   * @generated
   * @ordered
   */
  protected EList<TypeExpression> e22;

  /**
   * The cached value of the '{@link #getE21() <em>E21</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getE21()
   * @generated
   * @ordered
   */
  protected EList<TypeExpression> e21;

  /**
   * The cached value of the '{@link #getE23() <em>E23</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getE23()
   * @generated
   * @ordered
   */
  protected EList<TypeExpression> e23;

  /**
   * The default value of the '{@link #getE9() <em>E9</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getE9()
   * @generated
   * @ordered
   */
  protected static final String E9_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getE9() <em>E9</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getE9()
   * @generated
   * @ordered
   */
  protected String e9 = E9_EDEFAULT;

  /**
   * The cached value of the '{@link #getE10() <em>E10</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getE10()
   * @generated
   * @ordered
   */
  protected TypeExpression e10;

  /**
   * The cached value of the '{@link #getE25() <em>E25</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getE25()
   * @generated
   * @ordered
   */
  protected EList<TypeExpression> e25;

  /**
   * The cached value of the '{@link #getE24() <em>E24</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getE24()
   * @generated
   * @ordered
   */
  protected EList<TypeExpression> e24;

  /**
   * The cached value of the '{@link #getE26() <em>E26</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getE26()
   * @generated
   * @ordered
   */
  protected EList<TypeExpression> e26;

  /**
   * The default value of the '{@link #getE11() <em>E11</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getE11()
   * @generated
   * @ordered
   */
  protected static final String E11_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getE11() <em>E11</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getE11()
   * @generated
   * @ordered
   */
  protected String e11 = E11_EDEFAULT;

  /**
   * The cached value of the '{@link #getE12() <em>E12</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getE12()
   * @generated
   * @ordered
   */
  protected TypeExpression e12;

  /**
   * The cached value of the '{@link #getE13() <em>E13</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getE13()
   * @generated
   * @ordered
   */
  protected EList<TypeExpression> e13;

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
  public Expr getIfpred()
  {
    return ifpred;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIfpred(Expr newIfpred, NotificationChain msgs)
  {
    Expr oldIfpred = ifpred;
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
  public void setIfpred(Expr newIfpred)
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
  public String getE2()
  {
    return e2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setE2(String newE2)
  {
    String oldE2 = e2;
    e2 = newE2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.EXPR__E2, oldE2, e2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getE3()
  {
    return e3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setE3(String newE3)
  {
    String oldE3 = e3;
    e3 = newE3;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.EXPR__E3, oldE3, e3));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getE5()
  {
    return e5;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setE5(String newE5)
  {
    String oldE5 = e5;
    e5 = newE5;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.EXPR__E5, oldE5, e5));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeExpression getE6()
  {
    return e6;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetE6(TypeExpression newE6, NotificationChain msgs)
  {
    TypeExpression oldE6 = e6;
    e6 = newE6;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.EXPR__E6, oldE6, newE6);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setE6(TypeExpression newE6)
  {
    if (newE6 != e6)
    {
      NotificationChain msgs = null;
      if (e6 != null)
        msgs = ((InternalEObject)e6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.EXPR__E6, null, msgs);
      if (newE6 != null)
        msgs = ((InternalEObject)newE6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.EXPR__E6, null, msgs);
      msgs = basicSetE6(newE6, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.EXPR__E6, newE6, newE6));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeExpression> getE22()
  {
    if (e22 == null)
    {
      e22 = new EObjectContainmentEList<TypeExpression>(TypeExpression.class, this, EditorPackage.EXPR__E22);
    }
    return e22;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeExpression> getE21()
  {
    if (e21 == null)
    {
      e21 = new EObjectContainmentEList<TypeExpression>(TypeExpression.class, this, EditorPackage.EXPR__E21);
    }
    return e21;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeExpression> getE23()
  {
    if (e23 == null)
    {
      e23 = new EObjectContainmentEList<TypeExpression>(TypeExpression.class, this, EditorPackage.EXPR__E23);
    }
    return e23;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getE9()
  {
    return e9;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setE9(String newE9)
  {
    String oldE9 = e9;
    e9 = newE9;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.EXPR__E9, oldE9, e9));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeExpression getE10()
  {
    return e10;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetE10(TypeExpression newE10, NotificationChain msgs)
  {
    TypeExpression oldE10 = e10;
    e10 = newE10;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.EXPR__E10, oldE10, newE10);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setE10(TypeExpression newE10)
  {
    if (newE10 != e10)
    {
      NotificationChain msgs = null;
      if (e10 != null)
        msgs = ((InternalEObject)e10).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.EXPR__E10, null, msgs);
      if (newE10 != null)
        msgs = ((InternalEObject)newE10).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.EXPR__E10, null, msgs);
      msgs = basicSetE10(newE10, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.EXPR__E10, newE10, newE10));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeExpression> getE25()
  {
    if (e25 == null)
    {
      e25 = new EObjectContainmentEList<TypeExpression>(TypeExpression.class, this, EditorPackage.EXPR__E25);
    }
    return e25;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeExpression> getE24()
  {
    if (e24 == null)
    {
      e24 = new EObjectContainmentEList<TypeExpression>(TypeExpression.class, this, EditorPackage.EXPR__E24);
    }
    return e24;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeExpression> getE26()
  {
    if (e26 == null)
    {
      e26 = new EObjectContainmentEList<TypeExpression>(TypeExpression.class, this, EditorPackage.EXPR__E26);
    }
    return e26;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getE11()
  {
    return e11;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setE11(String newE11)
  {
    String oldE11 = e11;
    e11 = newE11;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.EXPR__E11, oldE11, e11));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeExpression getE12()
  {
    return e12;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetE12(TypeExpression newE12, NotificationChain msgs)
  {
    TypeExpression oldE12 = e12;
    e12 = newE12;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.EXPR__E12, oldE12, newE12);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setE12(TypeExpression newE12)
  {
    if (newE12 != e12)
    {
      NotificationChain msgs = null;
      if (e12 != null)
        msgs = ((InternalEObject)e12).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.EXPR__E12, null, msgs);
      if (newE12 != null)
        msgs = ((InternalEObject)newE12).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.EXPR__E12, null, msgs);
      msgs = basicSetE12(newE12, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.EXPR__E12, newE12, newE12));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeExpression> getE13()
  {
    if (e13 == null)
    {
      e13 = new EObjectContainmentEList<TypeExpression>(TypeExpression.class, this, EditorPackage.EXPR__E13);
    }
    return e13;
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
      case EditorPackage.EXPR__E6:
        return basicSetE6(null, msgs);
      case EditorPackage.EXPR__E22:
        return ((InternalEList<?>)getE22()).basicRemove(otherEnd, msgs);
      case EditorPackage.EXPR__E21:
        return ((InternalEList<?>)getE21()).basicRemove(otherEnd, msgs);
      case EditorPackage.EXPR__E23:
        return ((InternalEList<?>)getE23()).basicRemove(otherEnd, msgs);
      case EditorPackage.EXPR__E10:
        return basicSetE10(null, msgs);
      case EditorPackage.EXPR__E25:
        return ((InternalEList<?>)getE25()).basicRemove(otherEnd, msgs);
      case EditorPackage.EXPR__E24:
        return ((InternalEList<?>)getE24()).basicRemove(otherEnd, msgs);
      case EditorPackage.EXPR__E26:
        return ((InternalEList<?>)getE26()).basicRemove(otherEnd, msgs);
      case EditorPackage.EXPR__E12:
        return basicSetE12(null, msgs);
      case EditorPackage.EXPR__E13:
        return ((InternalEList<?>)getE13()).basicRemove(otherEnd, msgs);
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
      case EditorPackage.EXPR__E2:
        return getE2();
      case EditorPackage.EXPR__E3:
        return getE3();
      case EditorPackage.EXPR__E5:
        return getE5();
      case EditorPackage.EXPR__E6:
        return getE6();
      case EditorPackage.EXPR__E22:
        return getE22();
      case EditorPackage.EXPR__E21:
        return getE21();
      case EditorPackage.EXPR__E23:
        return getE23();
      case EditorPackage.EXPR__E9:
        return getE9();
      case EditorPackage.EXPR__E10:
        return getE10();
      case EditorPackage.EXPR__E25:
        return getE25();
      case EditorPackage.EXPR__E24:
        return getE24();
      case EditorPackage.EXPR__E26:
        return getE26();
      case EditorPackage.EXPR__E11:
        return getE11();
      case EditorPackage.EXPR__E12:
        return getE12();
      case EditorPackage.EXPR__E13:
        return getE13();
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
      case EditorPackage.EXPR__IFNAME:
        setIfname((String)newValue);
        return;
      case EditorPackage.EXPR__IFPRED:
        setIfpred((Expr)newValue);
        return;
      case EditorPackage.EXPR__THENEXP:
        setThenexp((Expr)newValue);
        return;
      case EditorPackage.EXPR__ELSEEXP:
        setElseexp((Expr)newValue);
        return;
      case EditorPackage.EXPR__E2:
        setE2((String)newValue);
        return;
      case EditorPackage.EXPR__E3:
        setE3((String)newValue);
        return;
      case EditorPackage.EXPR__E5:
        setE5((String)newValue);
        return;
      case EditorPackage.EXPR__E6:
        setE6((TypeExpression)newValue);
        return;
      case EditorPackage.EXPR__E22:
        getE22().clear();
        getE22().addAll((Collection<? extends TypeExpression>)newValue);
        return;
      case EditorPackage.EXPR__E21:
        getE21().clear();
        getE21().addAll((Collection<? extends TypeExpression>)newValue);
        return;
      case EditorPackage.EXPR__E23:
        getE23().clear();
        getE23().addAll((Collection<? extends TypeExpression>)newValue);
        return;
      case EditorPackage.EXPR__E9:
        setE9((String)newValue);
        return;
      case EditorPackage.EXPR__E10:
        setE10((TypeExpression)newValue);
        return;
      case EditorPackage.EXPR__E25:
        getE25().clear();
        getE25().addAll((Collection<? extends TypeExpression>)newValue);
        return;
      case EditorPackage.EXPR__E24:
        getE24().clear();
        getE24().addAll((Collection<? extends TypeExpression>)newValue);
        return;
      case EditorPackage.EXPR__E26:
        getE26().clear();
        getE26().addAll((Collection<? extends TypeExpression>)newValue);
        return;
      case EditorPackage.EXPR__E11:
        setE11((String)newValue);
        return;
      case EditorPackage.EXPR__E12:
        setE12((TypeExpression)newValue);
        return;
      case EditorPackage.EXPR__E13:
        getE13().clear();
        getE13().addAll((Collection<? extends TypeExpression>)newValue);
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
        setIfpred((Expr)null);
        return;
      case EditorPackage.EXPR__THENEXP:
        setThenexp((Expr)null);
        return;
      case EditorPackage.EXPR__ELSEEXP:
        setElseexp((Expr)null);
        return;
      case EditorPackage.EXPR__E2:
        setE2(E2_EDEFAULT);
        return;
      case EditorPackage.EXPR__E3:
        setE3(E3_EDEFAULT);
        return;
      case EditorPackage.EXPR__E5:
        setE5(E5_EDEFAULT);
        return;
      case EditorPackage.EXPR__E6:
        setE6((TypeExpression)null);
        return;
      case EditorPackage.EXPR__E22:
        getE22().clear();
        return;
      case EditorPackage.EXPR__E21:
        getE21().clear();
        return;
      case EditorPackage.EXPR__E23:
        getE23().clear();
        return;
      case EditorPackage.EXPR__E9:
        setE9(E9_EDEFAULT);
        return;
      case EditorPackage.EXPR__E10:
        setE10((TypeExpression)null);
        return;
      case EditorPackage.EXPR__E25:
        getE25().clear();
        return;
      case EditorPackage.EXPR__E24:
        getE24().clear();
        return;
      case EditorPackage.EXPR__E26:
        getE26().clear();
        return;
      case EditorPackage.EXPR__E11:
        setE11(E11_EDEFAULT);
        return;
      case EditorPackage.EXPR__E12:
        setE12((TypeExpression)null);
        return;
      case EditorPackage.EXPR__E13:
        getE13().clear();
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
      case EditorPackage.EXPR__E2:
        return E2_EDEFAULT == null ? e2 != null : !E2_EDEFAULT.equals(e2);
      case EditorPackage.EXPR__E3:
        return E3_EDEFAULT == null ? e3 != null : !E3_EDEFAULT.equals(e3);
      case EditorPackage.EXPR__E5:
        return E5_EDEFAULT == null ? e5 != null : !E5_EDEFAULT.equals(e5);
      case EditorPackage.EXPR__E6:
        return e6 != null;
      case EditorPackage.EXPR__E22:
        return e22 != null && !e22.isEmpty();
      case EditorPackage.EXPR__E21:
        return e21 != null && !e21.isEmpty();
      case EditorPackage.EXPR__E23:
        return e23 != null && !e23.isEmpty();
      case EditorPackage.EXPR__E9:
        return E9_EDEFAULT == null ? e9 != null : !E9_EDEFAULT.equals(e9);
      case EditorPackage.EXPR__E10:
        return e10 != null;
      case EditorPackage.EXPR__E25:
        return e25 != null && !e25.isEmpty();
      case EditorPackage.EXPR__E24:
        return e24 != null && !e24.isEmpty();
      case EditorPackage.EXPR__E26:
        return e26 != null && !e26.isEmpty();
      case EditorPackage.EXPR__E11:
        return E11_EDEFAULT == null ? e11 != null : !E11_EDEFAULT.equals(e11);
      case EditorPackage.EXPR__E12:
        return e12 != null;
      case EditorPackage.EXPR__E13:
        return e13 != null && !e13.isEmpty();
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
    result.append(", e2: ");
    result.append(e2);
    result.append(", e3: ");
    result.append(e3);
    result.append(", e5: ");
    result.append(e5);
    result.append(", e9: ");
    result.append(e9);
    result.append(", e11: ");
    result.append(e11);
    result.append(')');
    return result.toString();
  }

} //ExprImpl
