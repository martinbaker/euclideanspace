/**
 */
package com.euclideanspace.aldor.editor.impl;

import com.euclideanspace.aldor.editor.EditorPackage;
import com.euclideanspace.aldor.editor.TypeArguments;
import com.euclideanspace.aldor.editor.TypeExpression;
import com.euclideanspace.aldor.editor.TypeLiteral;
import com.euclideanspace.aldor.editor.TypeNameOrFunctionCall;

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
 * An implementation of the model object '<em><b>Type Arguments</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.TypeArgumentsImpl#getT <em>T</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.TypeArgumentsImpl#getT2 <em>T2</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.TypeArgumentsImpl#getT3 <em>T3</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.TypeArgumentsImpl#isB1 <em>B1</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.TypeArgumentsImpl#getT4 <em>T4</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.TypeArgumentsImpl#getT16 <em>T16</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.TypeArgumentsImpl#getT5 <em>T5</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.TypeArgumentsImpl#getT6 <em>T6</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.TypeArgumentsImpl#getT22 <em>T22</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.TypeArgumentsImpl#getT21 <em>T21</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.TypeArgumentsImpl#getT23 <em>T23</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.TypeArgumentsImpl#getT9 <em>T9</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.TypeArgumentsImpl#getT10 <em>T10</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.TypeArgumentsImpl#getT25 <em>T25</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.TypeArgumentsImpl#getT24 <em>T24</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.TypeArgumentsImpl#getT26 <em>T26</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.TypeArgumentsImpl#getT11 <em>T11</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.TypeArgumentsImpl#getT12 <em>T12</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.TypeArgumentsImpl#getT13 <em>T13</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.TypeArgumentsImpl#getT15 <em>T15</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeArgumentsImpl extends MinimalEObjectImpl.Container implements TypeArguments
{
  /**
   * The cached value of the '{@link #getT() <em>T</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT()
   * @generated
   * @ordered
   */
  protected TypeLiteral t;

  /**
   * The default value of the '{@link #getT2() <em>T2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT2()
   * @generated
   * @ordered
   */
  protected static final String T2_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getT2() <em>T2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT2()
   * @generated
   * @ordered
   */
  protected String t2 = T2_EDEFAULT;

  /**
   * The default value of the '{@link #getT3() <em>T3</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT3()
   * @generated
   * @ordered
   */
  protected static final String T3_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getT3() <em>T3</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT3()
   * @generated
   * @ordered
   */
  protected String t3 = T3_EDEFAULT;

  /**
   * The default value of the '{@link #isB1() <em>B1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isB1()
   * @generated
   * @ordered
   */
  protected static final boolean B1_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isB1() <em>B1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isB1()
   * @generated
   * @ordered
   */
  protected boolean b1 = B1_EDEFAULT;

  /**
   * The cached value of the '{@link #getT4() <em>T4</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT4()
   * @generated
   * @ordered
   */
  protected TypeExpression t4;

  /**
   * The cached value of the '{@link #getT16() <em>T16</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT16()
   * @generated
   * @ordered
   */
  protected EList<TypeExpression> t16;

  /**
   * The default value of the '{@link #getT5() <em>T5</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT5()
   * @generated
   * @ordered
   */
  protected static final String T5_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getT5() <em>T5</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT5()
   * @generated
   * @ordered
   */
  protected String t5 = T5_EDEFAULT;

  /**
   * The cached value of the '{@link #getT6() <em>T6</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT6()
   * @generated
   * @ordered
   */
  protected TypeExpression t6;

  /**
   * The cached value of the '{@link #getT22() <em>T22</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT22()
   * @generated
   * @ordered
   */
  protected EList<TypeExpression> t22;

  /**
   * The cached value of the '{@link #getT21() <em>T21</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT21()
   * @generated
   * @ordered
   */
  protected EList<TypeExpression> t21;

  /**
   * The cached value of the '{@link #getT23() <em>T23</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT23()
   * @generated
   * @ordered
   */
  protected EList<TypeExpression> t23;

  /**
   * The default value of the '{@link #getT9() <em>T9</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT9()
   * @generated
   * @ordered
   */
  protected static final String T9_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getT9() <em>T9</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT9()
   * @generated
   * @ordered
   */
  protected String t9 = T9_EDEFAULT;

  /**
   * The cached value of the '{@link #getT10() <em>T10</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT10()
   * @generated
   * @ordered
   */
  protected TypeExpression t10;

  /**
   * The cached value of the '{@link #getT25() <em>T25</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT25()
   * @generated
   * @ordered
   */
  protected EList<TypeExpression> t25;

  /**
   * The cached value of the '{@link #getT24() <em>T24</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT24()
   * @generated
   * @ordered
   */
  protected EList<TypeExpression> t24;

  /**
   * The cached value of the '{@link #getT26() <em>T26</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT26()
   * @generated
   * @ordered
   */
  protected EList<TypeExpression> t26;

  /**
   * The default value of the '{@link #getT11() <em>T11</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT11()
   * @generated
   * @ordered
   */
  protected static final String T11_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getT11() <em>T11</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT11()
   * @generated
   * @ordered
   */
  protected String t11 = T11_EDEFAULT;

  /**
   * The cached value of the '{@link #getT12() <em>T12</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT12()
   * @generated
   * @ordered
   */
  protected TypeExpression t12;

  /**
   * The cached value of the '{@link #getT13() <em>T13</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT13()
   * @generated
   * @ordered
   */
  protected EList<TypeExpression> t13;

  /**
   * The cached value of the '{@link #getT15() <em>T15</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT15()
   * @generated
   * @ordered
   */
  protected TypeNameOrFunctionCall t15;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypeArgumentsImpl()
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
    return EditorPackage.Literals.TYPE_ARGUMENTS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeLiteral getT()
  {
    return t;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetT(TypeLiteral newT, NotificationChain msgs)
  {
    TypeLiteral oldT = t;
    t = newT;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_ARGUMENTS__T, oldT, newT);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT(TypeLiteral newT)
  {
    if (newT != t)
    {
      NotificationChain msgs = null;
      if (t != null)
        msgs = ((InternalEObject)t).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.TYPE_ARGUMENTS__T, null, msgs);
      if (newT != null)
        msgs = ((InternalEObject)newT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.TYPE_ARGUMENTS__T, null, msgs);
      msgs = basicSetT(newT, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_ARGUMENTS__T, newT, newT));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getT2()
  {
    return t2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT2(String newT2)
  {
    String oldT2 = t2;
    t2 = newT2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_ARGUMENTS__T2, oldT2, t2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getT3()
  {
    return t3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT3(String newT3)
  {
    String oldT3 = t3;
    t3 = newT3;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_ARGUMENTS__T3, oldT3, t3));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isB1()
  {
    return b1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setB1(boolean newB1)
  {
    boolean oldB1 = b1;
    b1 = newB1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_ARGUMENTS__B1, oldB1, b1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeExpression getT4()
  {
    return t4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetT4(TypeExpression newT4, NotificationChain msgs)
  {
    TypeExpression oldT4 = t4;
    t4 = newT4;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_ARGUMENTS__T4, oldT4, newT4);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT4(TypeExpression newT4)
  {
    if (newT4 != t4)
    {
      NotificationChain msgs = null;
      if (t4 != null)
        msgs = ((InternalEObject)t4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.TYPE_ARGUMENTS__T4, null, msgs);
      if (newT4 != null)
        msgs = ((InternalEObject)newT4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.TYPE_ARGUMENTS__T4, null, msgs);
      msgs = basicSetT4(newT4, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_ARGUMENTS__T4, newT4, newT4));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeExpression> getT16()
  {
    if (t16 == null)
    {
      t16 = new EObjectContainmentEList<TypeExpression>(TypeExpression.class, this, EditorPackage.TYPE_ARGUMENTS__T16);
    }
    return t16;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getT5()
  {
    return t5;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT5(String newT5)
  {
    String oldT5 = t5;
    t5 = newT5;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_ARGUMENTS__T5, oldT5, t5));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeExpression getT6()
  {
    return t6;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetT6(TypeExpression newT6, NotificationChain msgs)
  {
    TypeExpression oldT6 = t6;
    t6 = newT6;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_ARGUMENTS__T6, oldT6, newT6);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT6(TypeExpression newT6)
  {
    if (newT6 != t6)
    {
      NotificationChain msgs = null;
      if (t6 != null)
        msgs = ((InternalEObject)t6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.TYPE_ARGUMENTS__T6, null, msgs);
      if (newT6 != null)
        msgs = ((InternalEObject)newT6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.TYPE_ARGUMENTS__T6, null, msgs);
      msgs = basicSetT6(newT6, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_ARGUMENTS__T6, newT6, newT6));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeExpression> getT22()
  {
    if (t22 == null)
    {
      t22 = new EObjectContainmentEList<TypeExpression>(TypeExpression.class, this, EditorPackage.TYPE_ARGUMENTS__T22);
    }
    return t22;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeExpression> getT21()
  {
    if (t21 == null)
    {
      t21 = new EObjectContainmentEList<TypeExpression>(TypeExpression.class, this, EditorPackage.TYPE_ARGUMENTS__T21);
    }
    return t21;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeExpression> getT23()
  {
    if (t23 == null)
    {
      t23 = new EObjectContainmentEList<TypeExpression>(TypeExpression.class, this, EditorPackage.TYPE_ARGUMENTS__T23);
    }
    return t23;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getT9()
  {
    return t9;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT9(String newT9)
  {
    String oldT9 = t9;
    t9 = newT9;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_ARGUMENTS__T9, oldT9, t9));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeExpression getT10()
  {
    return t10;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetT10(TypeExpression newT10, NotificationChain msgs)
  {
    TypeExpression oldT10 = t10;
    t10 = newT10;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_ARGUMENTS__T10, oldT10, newT10);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT10(TypeExpression newT10)
  {
    if (newT10 != t10)
    {
      NotificationChain msgs = null;
      if (t10 != null)
        msgs = ((InternalEObject)t10).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.TYPE_ARGUMENTS__T10, null, msgs);
      if (newT10 != null)
        msgs = ((InternalEObject)newT10).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.TYPE_ARGUMENTS__T10, null, msgs);
      msgs = basicSetT10(newT10, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_ARGUMENTS__T10, newT10, newT10));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeExpression> getT25()
  {
    if (t25 == null)
    {
      t25 = new EObjectContainmentEList<TypeExpression>(TypeExpression.class, this, EditorPackage.TYPE_ARGUMENTS__T25);
    }
    return t25;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeExpression> getT24()
  {
    if (t24 == null)
    {
      t24 = new EObjectContainmentEList<TypeExpression>(TypeExpression.class, this, EditorPackage.TYPE_ARGUMENTS__T24);
    }
    return t24;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeExpression> getT26()
  {
    if (t26 == null)
    {
      t26 = new EObjectContainmentEList<TypeExpression>(TypeExpression.class, this, EditorPackage.TYPE_ARGUMENTS__T26);
    }
    return t26;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getT11()
  {
    return t11;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT11(String newT11)
  {
    String oldT11 = t11;
    t11 = newT11;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_ARGUMENTS__T11, oldT11, t11));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeExpression getT12()
  {
    return t12;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetT12(TypeExpression newT12, NotificationChain msgs)
  {
    TypeExpression oldT12 = t12;
    t12 = newT12;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_ARGUMENTS__T12, oldT12, newT12);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT12(TypeExpression newT12)
  {
    if (newT12 != t12)
    {
      NotificationChain msgs = null;
      if (t12 != null)
        msgs = ((InternalEObject)t12).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.TYPE_ARGUMENTS__T12, null, msgs);
      if (newT12 != null)
        msgs = ((InternalEObject)newT12).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.TYPE_ARGUMENTS__T12, null, msgs);
      msgs = basicSetT12(newT12, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_ARGUMENTS__T12, newT12, newT12));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeExpression> getT13()
  {
    if (t13 == null)
    {
      t13 = new EObjectContainmentEList<TypeExpression>(TypeExpression.class, this, EditorPackage.TYPE_ARGUMENTS__T13);
    }
    return t13;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeNameOrFunctionCall getT15()
  {
    return t15;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetT15(TypeNameOrFunctionCall newT15, NotificationChain msgs)
  {
    TypeNameOrFunctionCall oldT15 = t15;
    t15 = newT15;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_ARGUMENTS__T15, oldT15, newT15);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT15(TypeNameOrFunctionCall newT15)
  {
    if (newT15 != t15)
    {
      NotificationChain msgs = null;
      if (t15 != null)
        msgs = ((InternalEObject)t15).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.TYPE_ARGUMENTS__T15, null, msgs);
      if (newT15 != null)
        msgs = ((InternalEObject)newT15).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.TYPE_ARGUMENTS__T15, null, msgs);
      msgs = basicSetT15(newT15, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_ARGUMENTS__T15, newT15, newT15));
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
      case EditorPackage.TYPE_ARGUMENTS__T:
        return basicSetT(null, msgs);
      case EditorPackage.TYPE_ARGUMENTS__T4:
        return basicSetT4(null, msgs);
      case EditorPackage.TYPE_ARGUMENTS__T16:
        return ((InternalEList<?>)getT16()).basicRemove(otherEnd, msgs);
      case EditorPackage.TYPE_ARGUMENTS__T6:
        return basicSetT6(null, msgs);
      case EditorPackage.TYPE_ARGUMENTS__T22:
        return ((InternalEList<?>)getT22()).basicRemove(otherEnd, msgs);
      case EditorPackage.TYPE_ARGUMENTS__T21:
        return ((InternalEList<?>)getT21()).basicRemove(otherEnd, msgs);
      case EditorPackage.TYPE_ARGUMENTS__T23:
        return ((InternalEList<?>)getT23()).basicRemove(otherEnd, msgs);
      case EditorPackage.TYPE_ARGUMENTS__T10:
        return basicSetT10(null, msgs);
      case EditorPackage.TYPE_ARGUMENTS__T25:
        return ((InternalEList<?>)getT25()).basicRemove(otherEnd, msgs);
      case EditorPackage.TYPE_ARGUMENTS__T24:
        return ((InternalEList<?>)getT24()).basicRemove(otherEnd, msgs);
      case EditorPackage.TYPE_ARGUMENTS__T26:
        return ((InternalEList<?>)getT26()).basicRemove(otherEnd, msgs);
      case EditorPackage.TYPE_ARGUMENTS__T12:
        return basicSetT12(null, msgs);
      case EditorPackage.TYPE_ARGUMENTS__T13:
        return ((InternalEList<?>)getT13()).basicRemove(otherEnd, msgs);
      case EditorPackage.TYPE_ARGUMENTS__T15:
        return basicSetT15(null, msgs);
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
      case EditorPackage.TYPE_ARGUMENTS__T:
        return getT();
      case EditorPackage.TYPE_ARGUMENTS__T2:
        return getT2();
      case EditorPackage.TYPE_ARGUMENTS__T3:
        return getT3();
      case EditorPackage.TYPE_ARGUMENTS__B1:
        return isB1();
      case EditorPackage.TYPE_ARGUMENTS__T4:
        return getT4();
      case EditorPackage.TYPE_ARGUMENTS__T16:
        return getT16();
      case EditorPackage.TYPE_ARGUMENTS__T5:
        return getT5();
      case EditorPackage.TYPE_ARGUMENTS__T6:
        return getT6();
      case EditorPackage.TYPE_ARGUMENTS__T22:
        return getT22();
      case EditorPackage.TYPE_ARGUMENTS__T21:
        return getT21();
      case EditorPackage.TYPE_ARGUMENTS__T23:
        return getT23();
      case EditorPackage.TYPE_ARGUMENTS__T9:
        return getT9();
      case EditorPackage.TYPE_ARGUMENTS__T10:
        return getT10();
      case EditorPackage.TYPE_ARGUMENTS__T25:
        return getT25();
      case EditorPackage.TYPE_ARGUMENTS__T24:
        return getT24();
      case EditorPackage.TYPE_ARGUMENTS__T26:
        return getT26();
      case EditorPackage.TYPE_ARGUMENTS__T11:
        return getT11();
      case EditorPackage.TYPE_ARGUMENTS__T12:
        return getT12();
      case EditorPackage.TYPE_ARGUMENTS__T13:
        return getT13();
      case EditorPackage.TYPE_ARGUMENTS__T15:
        return getT15();
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
      case EditorPackage.TYPE_ARGUMENTS__T:
        setT((TypeLiteral)newValue);
        return;
      case EditorPackage.TYPE_ARGUMENTS__T2:
        setT2((String)newValue);
        return;
      case EditorPackage.TYPE_ARGUMENTS__T3:
        setT3((String)newValue);
        return;
      case EditorPackage.TYPE_ARGUMENTS__B1:
        setB1((Boolean)newValue);
        return;
      case EditorPackage.TYPE_ARGUMENTS__T4:
        setT4((TypeExpression)newValue);
        return;
      case EditorPackage.TYPE_ARGUMENTS__T16:
        getT16().clear();
        getT16().addAll((Collection<? extends TypeExpression>)newValue);
        return;
      case EditorPackage.TYPE_ARGUMENTS__T5:
        setT5((String)newValue);
        return;
      case EditorPackage.TYPE_ARGUMENTS__T6:
        setT6((TypeExpression)newValue);
        return;
      case EditorPackage.TYPE_ARGUMENTS__T22:
        getT22().clear();
        getT22().addAll((Collection<? extends TypeExpression>)newValue);
        return;
      case EditorPackage.TYPE_ARGUMENTS__T21:
        getT21().clear();
        getT21().addAll((Collection<? extends TypeExpression>)newValue);
        return;
      case EditorPackage.TYPE_ARGUMENTS__T23:
        getT23().clear();
        getT23().addAll((Collection<? extends TypeExpression>)newValue);
        return;
      case EditorPackage.TYPE_ARGUMENTS__T9:
        setT9((String)newValue);
        return;
      case EditorPackage.TYPE_ARGUMENTS__T10:
        setT10((TypeExpression)newValue);
        return;
      case EditorPackage.TYPE_ARGUMENTS__T25:
        getT25().clear();
        getT25().addAll((Collection<? extends TypeExpression>)newValue);
        return;
      case EditorPackage.TYPE_ARGUMENTS__T24:
        getT24().clear();
        getT24().addAll((Collection<? extends TypeExpression>)newValue);
        return;
      case EditorPackage.TYPE_ARGUMENTS__T26:
        getT26().clear();
        getT26().addAll((Collection<? extends TypeExpression>)newValue);
        return;
      case EditorPackage.TYPE_ARGUMENTS__T11:
        setT11((String)newValue);
        return;
      case EditorPackage.TYPE_ARGUMENTS__T12:
        setT12((TypeExpression)newValue);
        return;
      case EditorPackage.TYPE_ARGUMENTS__T13:
        getT13().clear();
        getT13().addAll((Collection<? extends TypeExpression>)newValue);
        return;
      case EditorPackage.TYPE_ARGUMENTS__T15:
        setT15((TypeNameOrFunctionCall)newValue);
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
      case EditorPackage.TYPE_ARGUMENTS__T:
        setT((TypeLiteral)null);
        return;
      case EditorPackage.TYPE_ARGUMENTS__T2:
        setT2(T2_EDEFAULT);
        return;
      case EditorPackage.TYPE_ARGUMENTS__T3:
        setT3(T3_EDEFAULT);
        return;
      case EditorPackage.TYPE_ARGUMENTS__B1:
        setB1(B1_EDEFAULT);
        return;
      case EditorPackage.TYPE_ARGUMENTS__T4:
        setT4((TypeExpression)null);
        return;
      case EditorPackage.TYPE_ARGUMENTS__T16:
        getT16().clear();
        return;
      case EditorPackage.TYPE_ARGUMENTS__T5:
        setT5(T5_EDEFAULT);
        return;
      case EditorPackage.TYPE_ARGUMENTS__T6:
        setT6((TypeExpression)null);
        return;
      case EditorPackage.TYPE_ARGUMENTS__T22:
        getT22().clear();
        return;
      case EditorPackage.TYPE_ARGUMENTS__T21:
        getT21().clear();
        return;
      case EditorPackage.TYPE_ARGUMENTS__T23:
        getT23().clear();
        return;
      case EditorPackage.TYPE_ARGUMENTS__T9:
        setT9(T9_EDEFAULT);
        return;
      case EditorPackage.TYPE_ARGUMENTS__T10:
        setT10((TypeExpression)null);
        return;
      case EditorPackage.TYPE_ARGUMENTS__T25:
        getT25().clear();
        return;
      case EditorPackage.TYPE_ARGUMENTS__T24:
        getT24().clear();
        return;
      case EditorPackage.TYPE_ARGUMENTS__T26:
        getT26().clear();
        return;
      case EditorPackage.TYPE_ARGUMENTS__T11:
        setT11(T11_EDEFAULT);
        return;
      case EditorPackage.TYPE_ARGUMENTS__T12:
        setT12((TypeExpression)null);
        return;
      case EditorPackage.TYPE_ARGUMENTS__T13:
        getT13().clear();
        return;
      case EditorPackage.TYPE_ARGUMENTS__T15:
        setT15((TypeNameOrFunctionCall)null);
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
      case EditorPackage.TYPE_ARGUMENTS__T:
        return t != null;
      case EditorPackage.TYPE_ARGUMENTS__T2:
        return T2_EDEFAULT == null ? t2 != null : !T2_EDEFAULT.equals(t2);
      case EditorPackage.TYPE_ARGUMENTS__T3:
        return T3_EDEFAULT == null ? t3 != null : !T3_EDEFAULT.equals(t3);
      case EditorPackage.TYPE_ARGUMENTS__B1:
        return b1 != B1_EDEFAULT;
      case EditorPackage.TYPE_ARGUMENTS__T4:
        return t4 != null;
      case EditorPackage.TYPE_ARGUMENTS__T16:
        return t16 != null && !t16.isEmpty();
      case EditorPackage.TYPE_ARGUMENTS__T5:
        return T5_EDEFAULT == null ? t5 != null : !T5_EDEFAULT.equals(t5);
      case EditorPackage.TYPE_ARGUMENTS__T6:
        return t6 != null;
      case EditorPackage.TYPE_ARGUMENTS__T22:
        return t22 != null && !t22.isEmpty();
      case EditorPackage.TYPE_ARGUMENTS__T21:
        return t21 != null && !t21.isEmpty();
      case EditorPackage.TYPE_ARGUMENTS__T23:
        return t23 != null && !t23.isEmpty();
      case EditorPackage.TYPE_ARGUMENTS__T9:
        return T9_EDEFAULT == null ? t9 != null : !T9_EDEFAULT.equals(t9);
      case EditorPackage.TYPE_ARGUMENTS__T10:
        return t10 != null;
      case EditorPackage.TYPE_ARGUMENTS__T25:
        return t25 != null && !t25.isEmpty();
      case EditorPackage.TYPE_ARGUMENTS__T24:
        return t24 != null && !t24.isEmpty();
      case EditorPackage.TYPE_ARGUMENTS__T26:
        return t26 != null && !t26.isEmpty();
      case EditorPackage.TYPE_ARGUMENTS__T11:
        return T11_EDEFAULT == null ? t11 != null : !T11_EDEFAULT.equals(t11);
      case EditorPackage.TYPE_ARGUMENTS__T12:
        return t12 != null;
      case EditorPackage.TYPE_ARGUMENTS__T13:
        return t13 != null && !t13.isEmpty();
      case EditorPackage.TYPE_ARGUMENTS__T15:
        return t15 != null;
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
    result.append(" (t2: ");
    result.append(t2);
    result.append(", t3: ");
    result.append(t3);
    result.append(", b1: ");
    result.append(b1);
    result.append(", t5: ");
    result.append(t5);
    result.append(", t9: ");
    result.append(t9);
    result.append(", t11: ");
    result.append(t11);
    result.append(')');
    return result.toString();
  }

} //TypeArgumentsImpl
