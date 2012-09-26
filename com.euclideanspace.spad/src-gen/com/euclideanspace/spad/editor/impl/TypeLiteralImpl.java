/**
 */
package com.euclideanspace.spad.editor.impl;

import com.euclideanspace.spad.editor.BooleanLiteral;
import com.euclideanspace.spad.editor.CharacterLiteral;
import com.euclideanspace.spad.editor.EditorPackage;
import com.euclideanspace.spad.editor.TypeArguments;
import com.euclideanspace.spad.editor.TypeExpression;
import com.euclideanspace.spad.editor.TypeExpression2;
import com.euclideanspace.spad.editor.TypeLiteral;
import com.euclideanspace.spad.editor.TypePrimaryExpression2;
import com.euclideanspace.spad.editor.TypeResult;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.spad.editor.impl.TypeLiteralImpl#getT92 <em>T92</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.TypeLiteralImpl#getT93 <em>T93</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.TypeLiteralImpl#getXt32 <em>Xt32</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.TypeLiteralImpl#getXtyname <em>Xtyname</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.TypeLiteralImpl#getXt5 <em>Xt5</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.TypeLiteralImpl#getXt7 <em>Xt7</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.TypeLiteralImpl#getXt8 <em>Xt8</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.TypeLiteralImpl#getXt21 <em>Xt21</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.TypeLiteralImpl#getXt23 <em>Xt23</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.TypeLiteralImpl#getXt10 <em>Xt10</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.TypeLiteralImpl#getXt11 <em>Xt11</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.TypeLiteralImpl#getXt24 <em>Xt24</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.TypeLiteralImpl#getXt26 <em>Xt26</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.TypeLiteralImpl#getXt13 <em>Xt13</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.TypeLiteralImpl#getXt14 <em>Xt14</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.TypeLiteralImpl#getT1 <em>T1</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.TypeLiteralImpl#getT22 <em>T22</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.TypeLiteralImpl#getT34 <em>T34</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.TypeLiteralImpl#getT35 <em>T35</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeLiteralImpl extends TypePrimaryExpressionImpl implements TypeLiteral
{
  /**
   * The cached value of the '{@link #getT92() <em>T92</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT92()
   * @generated
   * @ordered
   */
  protected TypeArguments t92;

  /**
   * The cached value of the '{@link #getT93() <em>T93</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT93()
   * @generated
   * @ordered
   */
  protected TypeResult t93;

  /**
   * The default value of the '{@link #getXt32() <em>Xt32</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXt32()
   * @generated
   * @ordered
   */
  protected static final String XT32_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getXt32() <em>Xt32</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXt32()
   * @generated
   * @ordered
   */
  protected String xt32 = XT32_EDEFAULT;

  /**
   * The default value of the '{@link #getXtyname() <em>Xtyname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXtyname()
   * @generated
   * @ordered
   */
  protected static final String XTYNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getXtyname() <em>Xtyname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXtyname()
   * @generated
   * @ordered
   */
  protected String xtyname = XTYNAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getXt5() <em>Xt5</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXt5()
   * @generated
   * @ordered
   */
  protected TypeExpression xt5;

  /**
   * The cached value of the '{@link #getXt7() <em>Xt7</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXt7()
   * @generated
   * @ordered
   */
  protected TypeExpression xt7;

  /**
   * The cached value of the '{@link #getXt8() <em>Xt8</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXt8()
   * @generated
   * @ordered
   */
  protected EList<TypeExpression> xt8;

  /**
   * The cached value of the '{@link #getXt21() <em>Xt21</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXt21()
   * @generated
   * @ordered
   */
  protected EList<TypeExpression> xt21;

  /**
   * The cached value of the '{@link #getXt23() <em>Xt23</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXt23()
   * @generated
   * @ordered
   */
  protected EList<TypeExpression> xt23;

  /**
   * The cached value of the '{@link #getXt10() <em>Xt10</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXt10()
   * @generated
   * @ordered
   */
  protected TypeExpression xt10;

  /**
   * The cached value of the '{@link #getXt11() <em>Xt11</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXt11()
   * @generated
   * @ordered
   */
  protected EList<TypeExpression> xt11;

  /**
   * The cached value of the '{@link #getXt24() <em>Xt24</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXt24()
   * @generated
   * @ordered
   */
  protected EList<TypeExpression> xt24;

  /**
   * The cached value of the '{@link #getXt26() <em>Xt26</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXt26()
   * @generated
   * @ordered
   */
  protected EList<TypeExpression> xt26;

  /**
   * The cached value of the '{@link #getXt13() <em>Xt13</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXt13()
   * @generated
   * @ordered
   */
  protected TypeExpression xt13;

  /**
   * The cached value of the '{@link #getXt14() <em>Xt14</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXt14()
   * @generated
   * @ordered
   */
  protected EList<TypeExpression> xt14;

  /**
   * The default value of the '{@link #getT1() <em>T1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT1()
   * @generated
   * @ordered
   */
  protected static final int T1_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getT1() <em>T1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT1()
   * @generated
   * @ordered
   */
  protected int t1 = T1_EDEFAULT;

  /**
   * The default value of the '{@link #getT22() <em>T22</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT22()
   * @generated
   * @ordered
   */
  protected static final String T22_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getT22() <em>T22</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT22()
   * @generated
   * @ordered
   */
  protected String t22 = T22_EDEFAULT;

  /**
   * The cached value of the '{@link #getT34() <em>T34</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT34()
   * @generated
   * @ordered
   */
  protected CharacterLiteral t34;

  /**
   * The cached value of the '{@link #getT35() <em>T35</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT35()
   * @generated
   * @ordered
   */
  protected BooleanLiteral t35;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypeLiteralImpl()
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
    return EditorPackage.Literals.TYPE_LITERAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeArguments getT92()
  {
    return t92;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetT92(TypeArguments newT92, NotificationChain msgs)
  {
    TypeArguments oldT92 = t92;
    t92 = newT92;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_LITERAL__T92, oldT92, newT92);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT92(TypeArguments newT92)
  {
    if (newT92 != t92)
    {
      NotificationChain msgs = null;
      if (t92 != null)
        msgs = ((InternalEObject)t92).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.TYPE_LITERAL__T92, null, msgs);
      if (newT92 != null)
        msgs = ((InternalEObject)newT92).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.TYPE_LITERAL__T92, null, msgs);
      msgs = basicSetT92(newT92, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_LITERAL__T92, newT92, newT92));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeResult getT93()
  {
    return t93;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetT93(TypeResult newT93, NotificationChain msgs)
  {
    TypeResult oldT93 = t93;
    t93 = newT93;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_LITERAL__T93, oldT93, newT93);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT93(TypeResult newT93)
  {
    if (newT93 != t93)
    {
      NotificationChain msgs = null;
      if (t93 != null)
        msgs = ((InternalEObject)t93).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.TYPE_LITERAL__T93, null, msgs);
      if (newT93 != null)
        msgs = ((InternalEObject)newT93).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.TYPE_LITERAL__T93, null, msgs);
      msgs = basicSetT93(newT93, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_LITERAL__T93, newT93, newT93));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getXt32()
  {
    return xt32;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setXt32(String newXt32)
  {
    String oldXt32 = xt32;
    xt32 = newXt32;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_LITERAL__XT32, oldXt32, xt32));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getXtyname()
  {
    return xtyname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setXtyname(String newXtyname)
  {
    String oldXtyname = xtyname;
    xtyname = newXtyname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_LITERAL__XTYNAME, oldXtyname, xtyname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeExpression getXt5()
  {
    return xt5;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetXt5(TypeExpression newXt5, NotificationChain msgs)
  {
    TypeExpression oldXt5 = xt5;
    xt5 = newXt5;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_LITERAL__XT5, oldXt5, newXt5);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setXt5(TypeExpression newXt5)
  {
    if (newXt5 != xt5)
    {
      NotificationChain msgs = null;
      if (xt5 != null)
        msgs = ((InternalEObject)xt5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.TYPE_LITERAL__XT5, null, msgs);
      if (newXt5 != null)
        msgs = ((InternalEObject)newXt5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.TYPE_LITERAL__XT5, null, msgs);
      msgs = basicSetXt5(newXt5, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_LITERAL__XT5, newXt5, newXt5));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeExpression getXt7()
  {
    return xt7;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetXt7(TypeExpression newXt7, NotificationChain msgs)
  {
    TypeExpression oldXt7 = xt7;
    xt7 = newXt7;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_LITERAL__XT7, oldXt7, newXt7);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setXt7(TypeExpression newXt7)
  {
    if (newXt7 != xt7)
    {
      NotificationChain msgs = null;
      if (xt7 != null)
        msgs = ((InternalEObject)xt7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.TYPE_LITERAL__XT7, null, msgs);
      if (newXt7 != null)
        msgs = ((InternalEObject)newXt7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.TYPE_LITERAL__XT7, null, msgs);
      msgs = basicSetXt7(newXt7, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_LITERAL__XT7, newXt7, newXt7));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeExpression> getXt8()
  {
    if (xt8 == null)
    {
      xt8 = new EObjectContainmentEList<TypeExpression>(TypeExpression.class, this, EditorPackage.TYPE_LITERAL__XT8);
    }
    return xt8;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeExpression> getXt21()
  {
    if (xt21 == null)
    {
      xt21 = new EObjectContainmentEList<TypeExpression>(TypeExpression.class, this, EditorPackage.TYPE_LITERAL__XT21);
    }
    return xt21;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeExpression> getXt23()
  {
    if (xt23 == null)
    {
      xt23 = new EObjectContainmentEList<TypeExpression>(TypeExpression.class, this, EditorPackage.TYPE_LITERAL__XT23);
    }
    return xt23;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeExpression getXt10()
  {
    return xt10;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetXt10(TypeExpression newXt10, NotificationChain msgs)
  {
    TypeExpression oldXt10 = xt10;
    xt10 = newXt10;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_LITERAL__XT10, oldXt10, newXt10);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setXt10(TypeExpression newXt10)
  {
    if (newXt10 != xt10)
    {
      NotificationChain msgs = null;
      if (xt10 != null)
        msgs = ((InternalEObject)xt10).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.TYPE_LITERAL__XT10, null, msgs);
      if (newXt10 != null)
        msgs = ((InternalEObject)newXt10).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.TYPE_LITERAL__XT10, null, msgs);
      msgs = basicSetXt10(newXt10, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_LITERAL__XT10, newXt10, newXt10));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeExpression> getXt11()
  {
    if (xt11 == null)
    {
      xt11 = new EObjectContainmentEList<TypeExpression>(TypeExpression.class, this, EditorPackage.TYPE_LITERAL__XT11);
    }
    return xt11;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeExpression> getXt24()
  {
    if (xt24 == null)
    {
      xt24 = new EObjectContainmentEList<TypeExpression>(TypeExpression.class, this, EditorPackage.TYPE_LITERAL__XT24);
    }
    return xt24;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeExpression> getXt26()
  {
    if (xt26 == null)
    {
      xt26 = new EObjectContainmentEList<TypeExpression>(TypeExpression.class, this, EditorPackage.TYPE_LITERAL__XT26);
    }
    return xt26;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeExpression getXt13()
  {
    return xt13;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetXt13(TypeExpression newXt13, NotificationChain msgs)
  {
    TypeExpression oldXt13 = xt13;
    xt13 = newXt13;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_LITERAL__XT13, oldXt13, newXt13);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setXt13(TypeExpression newXt13)
  {
    if (newXt13 != xt13)
    {
      NotificationChain msgs = null;
      if (xt13 != null)
        msgs = ((InternalEObject)xt13).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.TYPE_LITERAL__XT13, null, msgs);
      if (newXt13 != null)
        msgs = ((InternalEObject)newXt13).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.TYPE_LITERAL__XT13, null, msgs);
      msgs = basicSetXt13(newXt13, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_LITERAL__XT13, newXt13, newXt13));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeExpression> getXt14()
  {
    if (xt14 == null)
    {
      xt14 = new EObjectContainmentEList<TypeExpression>(TypeExpression.class, this, EditorPackage.TYPE_LITERAL__XT14);
    }
    return xt14;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getT1()
  {
    return t1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT1(int newT1)
  {
    int oldT1 = t1;
    t1 = newT1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_LITERAL__T1, oldT1, t1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getT22()
  {
    return t22;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT22(String newT22)
  {
    String oldT22 = t22;
    t22 = newT22;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_LITERAL__T22, oldT22, t22));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CharacterLiteral getT34()
  {
    return t34;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetT34(CharacterLiteral newT34, NotificationChain msgs)
  {
    CharacterLiteral oldT34 = t34;
    t34 = newT34;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_LITERAL__T34, oldT34, newT34);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT34(CharacterLiteral newT34)
  {
    if (newT34 != t34)
    {
      NotificationChain msgs = null;
      if (t34 != null)
        msgs = ((InternalEObject)t34).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.TYPE_LITERAL__T34, null, msgs);
      if (newT34 != null)
        msgs = ((InternalEObject)newT34).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.TYPE_LITERAL__T34, null, msgs);
      msgs = basicSetT34(newT34, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_LITERAL__T34, newT34, newT34));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanLiteral getT35()
  {
    return t35;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetT35(BooleanLiteral newT35, NotificationChain msgs)
  {
    BooleanLiteral oldT35 = t35;
    t35 = newT35;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_LITERAL__T35, oldT35, newT35);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT35(BooleanLiteral newT35)
  {
    if (newT35 != t35)
    {
      NotificationChain msgs = null;
      if (t35 != null)
        msgs = ((InternalEObject)t35).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.TYPE_LITERAL__T35, null, msgs);
      if (newT35 != null)
        msgs = ((InternalEObject)newT35).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.TYPE_LITERAL__T35, null, msgs);
      msgs = basicSetT35(newT35, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_LITERAL__T35, newT35, newT35));
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
      case EditorPackage.TYPE_LITERAL__T92:
        return basicSetT92(null, msgs);
      case EditorPackage.TYPE_LITERAL__T93:
        return basicSetT93(null, msgs);
      case EditorPackage.TYPE_LITERAL__XT5:
        return basicSetXt5(null, msgs);
      case EditorPackage.TYPE_LITERAL__XT7:
        return basicSetXt7(null, msgs);
      case EditorPackage.TYPE_LITERAL__XT8:
        return ((InternalEList<?>)getXt8()).basicRemove(otherEnd, msgs);
      case EditorPackage.TYPE_LITERAL__XT21:
        return ((InternalEList<?>)getXt21()).basicRemove(otherEnd, msgs);
      case EditorPackage.TYPE_LITERAL__XT23:
        return ((InternalEList<?>)getXt23()).basicRemove(otherEnd, msgs);
      case EditorPackage.TYPE_LITERAL__XT10:
        return basicSetXt10(null, msgs);
      case EditorPackage.TYPE_LITERAL__XT11:
        return ((InternalEList<?>)getXt11()).basicRemove(otherEnd, msgs);
      case EditorPackage.TYPE_LITERAL__XT24:
        return ((InternalEList<?>)getXt24()).basicRemove(otherEnd, msgs);
      case EditorPackage.TYPE_LITERAL__XT26:
        return ((InternalEList<?>)getXt26()).basicRemove(otherEnd, msgs);
      case EditorPackage.TYPE_LITERAL__XT13:
        return basicSetXt13(null, msgs);
      case EditorPackage.TYPE_LITERAL__XT14:
        return ((InternalEList<?>)getXt14()).basicRemove(otherEnd, msgs);
      case EditorPackage.TYPE_LITERAL__T34:
        return basicSetT34(null, msgs);
      case EditorPackage.TYPE_LITERAL__T35:
        return basicSetT35(null, msgs);
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
      case EditorPackage.TYPE_LITERAL__T92:
        return getT92();
      case EditorPackage.TYPE_LITERAL__T93:
        return getT93();
      case EditorPackage.TYPE_LITERAL__XT32:
        return getXt32();
      case EditorPackage.TYPE_LITERAL__XTYNAME:
        return getXtyname();
      case EditorPackage.TYPE_LITERAL__XT5:
        return getXt5();
      case EditorPackage.TYPE_LITERAL__XT7:
        return getXt7();
      case EditorPackage.TYPE_LITERAL__XT8:
        return getXt8();
      case EditorPackage.TYPE_LITERAL__XT21:
        return getXt21();
      case EditorPackage.TYPE_LITERAL__XT23:
        return getXt23();
      case EditorPackage.TYPE_LITERAL__XT10:
        return getXt10();
      case EditorPackage.TYPE_LITERAL__XT11:
        return getXt11();
      case EditorPackage.TYPE_LITERAL__XT24:
        return getXt24();
      case EditorPackage.TYPE_LITERAL__XT26:
        return getXt26();
      case EditorPackage.TYPE_LITERAL__XT13:
        return getXt13();
      case EditorPackage.TYPE_LITERAL__XT14:
        return getXt14();
      case EditorPackage.TYPE_LITERAL__T1:
        return getT1();
      case EditorPackage.TYPE_LITERAL__T22:
        return getT22();
      case EditorPackage.TYPE_LITERAL__T34:
        return getT34();
      case EditorPackage.TYPE_LITERAL__T35:
        return getT35();
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
      case EditorPackage.TYPE_LITERAL__T92:
        setT92((TypeArguments)newValue);
        return;
      case EditorPackage.TYPE_LITERAL__T93:
        setT93((TypeResult)newValue);
        return;
      case EditorPackage.TYPE_LITERAL__XT32:
        setXt32((String)newValue);
        return;
      case EditorPackage.TYPE_LITERAL__XTYNAME:
        setXtyname((String)newValue);
        return;
      case EditorPackage.TYPE_LITERAL__XT5:
        setXt5((TypeExpression)newValue);
        return;
      case EditorPackage.TYPE_LITERAL__XT7:
        setXt7((TypeExpression)newValue);
        return;
      case EditorPackage.TYPE_LITERAL__XT8:
        getXt8().clear();
        getXt8().addAll((Collection<? extends TypeExpression>)newValue);
        return;
      case EditorPackage.TYPE_LITERAL__XT21:
        getXt21().clear();
        getXt21().addAll((Collection<? extends TypeExpression>)newValue);
        return;
      case EditorPackage.TYPE_LITERAL__XT23:
        getXt23().clear();
        getXt23().addAll((Collection<? extends TypeExpression>)newValue);
        return;
      case EditorPackage.TYPE_LITERAL__XT10:
        setXt10((TypeExpression)newValue);
        return;
      case EditorPackage.TYPE_LITERAL__XT11:
        getXt11().clear();
        getXt11().addAll((Collection<? extends TypeExpression>)newValue);
        return;
      case EditorPackage.TYPE_LITERAL__XT24:
        getXt24().clear();
        getXt24().addAll((Collection<? extends TypeExpression>)newValue);
        return;
      case EditorPackage.TYPE_LITERAL__XT26:
        getXt26().clear();
        getXt26().addAll((Collection<? extends TypeExpression>)newValue);
        return;
      case EditorPackage.TYPE_LITERAL__XT13:
        setXt13((TypeExpression)newValue);
        return;
      case EditorPackage.TYPE_LITERAL__XT14:
        getXt14().clear();
        getXt14().addAll((Collection<? extends TypeExpression>)newValue);
        return;
      case EditorPackage.TYPE_LITERAL__T1:
        setT1((Integer)newValue);
        return;
      case EditorPackage.TYPE_LITERAL__T22:
        setT22((String)newValue);
        return;
      case EditorPackage.TYPE_LITERAL__T34:
        setT34((CharacterLiteral)newValue);
        return;
      case EditorPackage.TYPE_LITERAL__T35:
        setT35((BooleanLiteral)newValue);
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
      case EditorPackage.TYPE_LITERAL__T92:
        setT92((TypeArguments)null);
        return;
      case EditorPackage.TYPE_LITERAL__T93:
        setT93((TypeResult)null);
        return;
      case EditorPackage.TYPE_LITERAL__XT32:
        setXt32(XT32_EDEFAULT);
        return;
      case EditorPackage.TYPE_LITERAL__XTYNAME:
        setXtyname(XTYNAME_EDEFAULT);
        return;
      case EditorPackage.TYPE_LITERAL__XT5:
        setXt5((TypeExpression)null);
        return;
      case EditorPackage.TYPE_LITERAL__XT7:
        setXt7((TypeExpression)null);
        return;
      case EditorPackage.TYPE_LITERAL__XT8:
        getXt8().clear();
        return;
      case EditorPackage.TYPE_LITERAL__XT21:
        getXt21().clear();
        return;
      case EditorPackage.TYPE_LITERAL__XT23:
        getXt23().clear();
        return;
      case EditorPackage.TYPE_LITERAL__XT10:
        setXt10((TypeExpression)null);
        return;
      case EditorPackage.TYPE_LITERAL__XT11:
        getXt11().clear();
        return;
      case EditorPackage.TYPE_LITERAL__XT24:
        getXt24().clear();
        return;
      case EditorPackage.TYPE_LITERAL__XT26:
        getXt26().clear();
        return;
      case EditorPackage.TYPE_LITERAL__XT13:
        setXt13((TypeExpression)null);
        return;
      case EditorPackage.TYPE_LITERAL__XT14:
        getXt14().clear();
        return;
      case EditorPackage.TYPE_LITERAL__T1:
        setT1(T1_EDEFAULT);
        return;
      case EditorPackage.TYPE_LITERAL__T22:
        setT22(T22_EDEFAULT);
        return;
      case EditorPackage.TYPE_LITERAL__T34:
        setT34((CharacterLiteral)null);
        return;
      case EditorPackage.TYPE_LITERAL__T35:
        setT35((BooleanLiteral)null);
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
      case EditorPackage.TYPE_LITERAL__T92:
        return t92 != null;
      case EditorPackage.TYPE_LITERAL__T93:
        return t93 != null;
      case EditorPackage.TYPE_LITERAL__XT32:
        return XT32_EDEFAULT == null ? xt32 != null : !XT32_EDEFAULT.equals(xt32);
      case EditorPackage.TYPE_LITERAL__XTYNAME:
        return XTYNAME_EDEFAULT == null ? xtyname != null : !XTYNAME_EDEFAULT.equals(xtyname);
      case EditorPackage.TYPE_LITERAL__XT5:
        return xt5 != null;
      case EditorPackage.TYPE_LITERAL__XT7:
        return xt7 != null;
      case EditorPackage.TYPE_LITERAL__XT8:
        return xt8 != null && !xt8.isEmpty();
      case EditorPackage.TYPE_LITERAL__XT21:
        return xt21 != null && !xt21.isEmpty();
      case EditorPackage.TYPE_LITERAL__XT23:
        return xt23 != null && !xt23.isEmpty();
      case EditorPackage.TYPE_LITERAL__XT10:
        return xt10 != null;
      case EditorPackage.TYPE_LITERAL__XT11:
        return xt11 != null && !xt11.isEmpty();
      case EditorPackage.TYPE_LITERAL__XT24:
        return xt24 != null && !xt24.isEmpty();
      case EditorPackage.TYPE_LITERAL__XT26:
        return xt26 != null && !xt26.isEmpty();
      case EditorPackage.TYPE_LITERAL__XT13:
        return xt13 != null;
      case EditorPackage.TYPE_LITERAL__XT14:
        return xt14 != null && !xt14.isEmpty();
      case EditorPackage.TYPE_LITERAL__T1:
        return t1 != T1_EDEFAULT;
      case EditorPackage.TYPE_LITERAL__T22:
        return T22_EDEFAULT == null ? t22 != null : !T22_EDEFAULT.equals(t22);
      case EditorPackage.TYPE_LITERAL__T34:
        return t34 != null;
      case EditorPackage.TYPE_LITERAL__T35:
        return t35 != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == TypeExpression2.class)
    {
      switch (derivedFeatureID)
      {
        case EditorPackage.TYPE_LITERAL__T92: return EditorPackage.TYPE_EXPRESSION2__T92;
        case EditorPackage.TYPE_LITERAL__T93: return EditorPackage.TYPE_EXPRESSION2__T93;
        default: return -1;
      }
    }
    if (baseClass == TypePrimaryExpression2.class)
    {
      switch (derivedFeatureID)
      {
        case EditorPackage.TYPE_LITERAL__XT32: return EditorPackage.TYPE_PRIMARY_EXPRESSION2__XT32;
        case EditorPackage.TYPE_LITERAL__XTYNAME: return EditorPackage.TYPE_PRIMARY_EXPRESSION2__XTYNAME;
        case EditorPackage.TYPE_LITERAL__XT5: return EditorPackage.TYPE_PRIMARY_EXPRESSION2__XT5;
        case EditorPackage.TYPE_LITERAL__XT7: return EditorPackage.TYPE_PRIMARY_EXPRESSION2__XT7;
        case EditorPackage.TYPE_LITERAL__XT8: return EditorPackage.TYPE_PRIMARY_EXPRESSION2__XT8;
        case EditorPackage.TYPE_LITERAL__XT21: return EditorPackage.TYPE_PRIMARY_EXPRESSION2__XT21;
        case EditorPackage.TYPE_LITERAL__XT23: return EditorPackage.TYPE_PRIMARY_EXPRESSION2__XT23;
        case EditorPackage.TYPE_LITERAL__XT10: return EditorPackage.TYPE_PRIMARY_EXPRESSION2__XT10;
        case EditorPackage.TYPE_LITERAL__XT11: return EditorPackage.TYPE_PRIMARY_EXPRESSION2__XT11;
        case EditorPackage.TYPE_LITERAL__XT24: return EditorPackage.TYPE_PRIMARY_EXPRESSION2__XT24;
        case EditorPackage.TYPE_LITERAL__XT26: return EditorPackage.TYPE_PRIMARY_EXPRESSION2__XT26;
        case EditorPackage.TYPE_LITERAL__XT13: return EditorPackage.TYPE_PRIMARY_EXPRESSION2__XT13;
        case EditorPackage.TYPE_LITERAL__XT14: return EditorPackage.TYPE_PRIMARY_EXPRESSION2__XT14;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == TypeExpression2.class)
    {
      switch (baseFeatureID)
      {
        case EditorPackage.TYPE_EXPRESSION2__T92: return EditorPackage.TYPE_LITERAL__T92;
        case EditorPackage.TYPE_EXPRESSION2__T93: return EditorPackage.TYPE_LITERAL__T93;
        default: return -1;
      }
    }
    if (baseClass == TypePrimaryExpression2.class)
    {
      switch (baseFeatureID)
      {
        case EditorPackage.TYPE_PRIMARY_EXPRESSION2__XT32: return EditorPackage.TYPE_LITERAL__XT32;
        case EditorPackage.TYPE_PRIMARY_EXPRESSION2__XTYNAME: return EditorPackage.TYPE_LITERAL__XTYNAME;
        case EditorPackage.TYPE_PRIMARY_EXPRESSION2__XT5: return EditorPackage.TYPE_LITERAL__XT5;
        case EditorPackage.TYPE_PRIMARY_EXPRESSION2__XT7: return EditorPackage.TYPE_LITERAL__XT7;
        case EditorPackage.TYPE_PRIMARY_EXPRESSION2__XT8: return EditorPackage.TYPE_LITERAL__XT8;
        case EditorPackage.TYPE_PRIMARY_EXPRESSION2__XT21: return EditorPackage.TYPE_LITERAL__XT21;
        case EditorPackage.TYPE_PRIMARY_EXPRESSION2__XT23: return EditorPackage.TYPE_LITERAL__XT23;
        case EditorPackage.TYPE_PRIMARY_EXPRESSION2__XT10: return EditorPackage.TYPE_LITERAL__XT10;
        case EditorPackage.TYPE_PRIMARY_EXPRESSION2__XT11: return EditorPackage.TYPE_LITERAL__XT11;
        case EditorPackage.TYPE_PRIMARY_EXPRESSION2__XT24: return EditorPackage.TYPE_LITERAL__XT24;
        case EditorPackage.TYPE_PRIMARY_EXPRESSION2__XT26: return EditorPackage.TYPE_LITERAL__XT26;
        case EditorPackage.TYPE_PRIMARY_EXPRESSION2__XT13: return EditorPackage.TYPE_LITERAL__XT13;
        case EditorPackage.TYPE_PRIMARY_EXPRESSION2__XT14: return EditorPackage.TYPE_LITERAL__XT14;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
    result.append(" (xt32: ");
    result.append(xt32);
    result.append(", xtyname: ");
    result.append(xtyname);
    result.append(", t1: ");
    result.append(t1);
    result.append(", t22: ");
    result.append(t22);
    result.append(')');
    return result.toString();
  }

} //TypeLiteralImpl
