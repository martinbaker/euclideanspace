/**
 */
package com.euclideanspace.spad.editor.impl;

import com.euclideanspace.spad.editor.EditorPackage;
import com.euclideanspace.spad.editor.TupleDefinition;
import com.euclideanspace.spad.editor.TypeArguments;
import com.euclideanspace.spad.editor.TypeExpression;
import com.euclideanspace.spad.editor.TypeExpression2;
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
 * An implementation of the model object '<em><b>Tuple Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.spad.editor.impl.TupleDefinitionImpl#getT92 <em>T92</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.TupleDefinitionImpl#getT93 <em>T93</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.TupleDefinitionImpl#getXt32 <em>Xt32</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.TupleDefinitionImpl#getXtyname <em>Xtyname</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.TupleDefinitionImpl#getXt5 <em>Xt5</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.TupleDefinitionImpl#getXt7 <em>Xt7</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.TupleDefinitionImpl#getXt8 <em>Xt8</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.TupleDefinitionImpl#getXt21 <em>Xt21</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.TupleDefinitionImpl#getXt23 <em>Xt23</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.TupleDefinitionImpl#getXt10 <em>Xt10</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.TupleDefinitionImpl#getXt11 <em>Xt11</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.TupleDefinitionImpl#getXt24 <em>Xt24</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.TupleDefinitionImpl#getXt26 <em>Xt26</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.TupleDefinitionImpl#getXt13 <em>Xt13</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.TupleDefinitionImpl#getXt14 <em>Xt14</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.TupleDefinitionImpl#getT4 <em>T4</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.TupleDefinitionImpl#getT25 <em>T25</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TupleDefinitionImpl extends TypePrimaryExpressionImpl implements TupleDefinition
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
   * The cached value of the '{@link #getT4() <em>T4</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT4()
   * @generated
   * @ordered
   */
  protected TypeExpression t4;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TupleDefinitionImpl()
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
    return EditorPackage.Literals.TUPLE_DEFINITION;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.TUPLE_DEFINITION__T92, oldT92, newT92);
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
        msgs = ((InternalEObject)t92).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.TUPLE_DEFINITION__T92, null, msgs);
      if (newT92 != null)
        msgs = ((InternalEObject)newT92).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.TUPLE_DEFINITION__T92, null, msgs);
      msgs = basicSetT92(newT92, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.TUPLE_DEFINITION__T92, newT92, newT92));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.TUPLE_DEFINITION__T93, oldT93, newT93);
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
        msgs = ((InternalEObject)t93).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.TUPLE_DEFINITION__T93, null, msgs);
      if (newT93 != null)
        msgs = ((InternalEObject)newT93).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.TUPLE_DEFINITION__T93, null, msgs);
      msgs = basicSetT93(newT93, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.TUPLE_DEFINITION__T93, newT93, newT93));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.TUPLE_DEFINITION__XT32, oldXt32, xt32));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.TUPLE_DEFINITION__XTYNAME, oldXtyname, xtyname));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.TUPLE_DEFINITION__XT5, oldXt5, newXt5);
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
        msgs = ((InternalEObject)xt5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.TUPLE_DEFINITION__XT5, null, msgs);
      if (newXt5 != null)
        msgs = ((InternalEObject)newXt5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.TUPLE_DEFINITION__XT5, null, msgs);
      msgs = basicSetXt5(newXt5, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.TUPLE_DEFINITION__XT5, newXt5, newXt5));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.TUPLE_DEFINITION__XT7, oldXt7, newXt7);
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
        msgs = ((InternalEObject)xt7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.TUPLE_DEFINITION__XT7, null, msgs);
      if (newXt7 != null)
        msgs = ((InternalEObject)newXt7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.TUPLE_DEFINITION__XT7, null, msgs);
      msgs = basicSetXt7(newXt7, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.TUPLE_DEFINITION__XT7, newXt7, newXt7));
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
      xt8 = new EObjectContainmentEList<TypeExpression>(TypeExpression.class, this, EditorPackage.TUPLE_DEFINITION__XT8);
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
      xt21 = new EObjectContainmentEList<TypeExpression>(TypeExpression.class, this, EditorPackage.TUPLE_DEFINITION__XT21);
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
      xt23 = new EObjectContainmentEList<TypeExpression>(TypeExpression.class, this, EditorPackage.TUPLE_DEFINITION__XT23);
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.TUPLE_DEFINITION__XT10, oldXt10, newXt10);
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
        msgs = ((InternalEObject)xt10).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.TUPLE_DEFINITION__XT10, null, msgs);
      if (newXt10 != null)
        msgs = ((InternalEObject)newXt10).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.TUPLE_DEFINITION__XT10, null, msgs);
      msgs = basicSetXt10(newXt10, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.TUPLE_DEFINITION__XT10, newXt10, newXt10));
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
      xt11 = new EObjectContainmentEList<TypeExpression>(TypeExpression.class, this, EditorPackage.TUPLE_DEFINITION__XT11);
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
      xt24 = new EObjectContainmentEList<TypeExpression>(TypeExpression.class, this, EditorPackage.TUPLE_DEFINITION__XT24);
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
      xt26 = new EObjectContainmentEList<TypeExpression>(TypeExpression.class, this, EditorPackage.TUPLE_DEFINITION__XT26);
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.TUPLE_DEFINITION__XT13, oldXt13, newXt13);
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
        msgs = ((InternalEObject)xt13).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.TUPLE_DEFINITION__XT13, null, msgs);
      if (newXt13 != null)
        msgs = ((InternalEObject)newXt13).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.TUPLE_DEFINITION__XT13, null, msgs);
      msgs = basicSetXt13(newXt13, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.TUPLE_DEFINITION__XT13, newXt13, newXt13));
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
      xt14 = new EObjectContainmentEList<TypeExpression>(TypeExpression.class, this, EditorPackage.TUPLE_DEFINITION__XT14);
    }
    return xt14;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.TUPLE_DEFINITION__T4, oldT4, newT4);
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
        msgs = ((InternalEObject)t4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.TUPLE_DEFINITION__T4, null, msgs);
      if (newT4 != null)
        msgs = ((InternalEObject)newT4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.TUPLE_DEFINITION__T4, null, msgs);
      msgs = basicSetT4(newT4, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.TUPLE_DEFINITION__T4, newT4, newT4));
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
      t25 = new EObjectContainmentEList<TypeExpression>(TypeExpression.class, this, EditorPackage.TUPLE_DEFINITION__T25);
    }
    return t25;
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
      case EditorPackage.TUPLE_DEFINITION__T92:
        return basicSetT92(null, msgs);
      case EditorPackage.TUPLE_DEFINITION__T93:
        return basicSetT93(null, msgs);
      case EditorPackage.TUPLE_DEFINITION__XT5:
        return basicSetXt5(null, msgs);
      case EditorPackage.TUPLE_DEFINITION__XT7:
        return basicSetXt7(null, msgs);
      case EditorPackage.TUPLE_DEFINITION__XT8:
        return ((InternalEList<?>)getXt8()).basicRemove(otherEnd, msgs);
      case EditorPackage.TUPLE_DEFINITION__XT21:
        return ((InternalEList<?>)getXt21()).basicRemove(otherEnd, msgs);
      case EditorPackage.TUPLE_DEFINITION__XT23:
        return ((InternalEList<?>)getXt23()).basicRemove(otherEnd, msgs);
      case EditorPackage.TUPLE_DEFINITION__XT10:
        return basicSetXt10(null, msgs);
      case EditorPackage.TUPLE_DEFINITION__XT11:
        return ((InternalEList<?>)getXt11()).basicRemove(otherEnd, msgs);
      case EditorPackage.TUPLE_DEFINITION__XT24:
        return ((InternalEList<?>)getXt24()).basicRemove(otherEnd, msgs);
      case EditorPackage.TUPLE_DEFINITION__XT26:
        return ((InternalEList<?>)getXt26()).basicRemove(otherEnd, msgs);
      case EditorPackage.TUPLE_DEFINITION__XT13:
        return basicSetXt13(null, msgs);
      case EditorPackage.TUPLE_DEFINITION__XT14:
        return ((InternalEList<?>)getXt14()).basicRemove(otherEnd, msgs);
      case EditorPackage.TUPLE_DEFINITION__T4:
        return basicSetT4(null, msgs);
      case EditorPackage.TUPLE_DEFINITION__T25:
        return ((InternalEList<?>)getT25()).basicRemove(otherEnd, msgs);
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
      case EditorPackage.TUPLE_DEFINITION__T92:
        return getT92();
      case EditorPackage.TUPLE_DEFINITION__T93:
        return getT93();
      case EditorPackage.TUPLE_DEFINITION__XT32:
        return getXt32();
      case EditorPackage.TUPLE_DEFINITION__XTYNAME:
        return getXtyname();
      case EditorPackage.TUPLE_DEFINITION__XT5:
        return getXt5();
      case EditorPackage.TUPLE_DEFINITION__XT7:
        return getXt7();
      case EditorPackage.TUPLE_DEFINITION__XT8:
        return getXt8();
      case EditorPackage.TUPLE_DEFINITION__XT21:
        return getXt21();
      case EditorPackage.TUPLE_DEFINITION__XT23:
        return getXt23();
      case EditorPackage.TUPLE_DEFINITION__XT10:
        return getXt10();
      case EditorPackage.TUPLE_DEFINITION__XT11:
        return getXt11();
      case EditorPackage.TUPLE_DEFINITION__XT24:
        return getXt24();
      case EditorPackage.TUPLE_DEFINITION__XT26:
        return getXt26();
      case EditorPackage.TUPLE_DEFINITION__XT13:
        return getXt13();
      case EditorPackage.TUPLE_DEFINITION__XT14:
        return getXt14();
      case EditorPackage.TUPLE_DEFINITION__T4:
        return getT4();
      case EditorPackage.TUPLE_DEFINITION__T25:
        return getT25();
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
      case EditorPackage.TUPLE_DEFINITION__T92:
        setT92((TypeArguments)newValue);
        return;
      case EditorPackage.TUPLE_DEFINITION__T93:
        setT93((TypeResult)newValue);
        return;
      case EditorPackage.TUPLE_DEFINITION__XT32:
        setXt32((String)newValue);
        return;
      case EditorPackage.TUPLE_DEFINITION__XTYNAME:
        setXtyname((String)newValue);
        return;
      case EditorPackage.TUPLE_DEFINITION__XT5:
        setXt5((TypeExpression)newValue);
        return;
      case EditorPackage.TUPLE_DEFINITION__XT7:
        setXt7((TypeExpression)newValue);
        return;
      case EditorPackage.TUPLE_DEFINITION__XT8:
        getXt8().clear();
        getXt8().addAll((Collection<? extends TypeExpression>)newValue);
        return;
      case EditorPackage.TUPLE_DEFINITION__XT21:
        getXt21().clear();
        getXt21().addAll((Collection<? extends TypeExpression>)newValue);
        return;
      case EditorPackage.TUPLE_DEFINITION__XT23:
        getXt23().clear();
        getXt23().addAll((Collection<? extends TypeExpression>)newValue);
        return;
      case EditorPackage.TUPLE_DEFINITION__XT10:
        setXt10((TypeExpression)newValue);
        return;
      case EditorPackage.TUPLE_DEFINITION__XT11:
        getXt11().clear();
        getXt11().addAll((Collection<? extends TypeExpression>)newValue);
        return;
      case EditorPackage.TUPLE_DEFINITION__XT24:
        getXt24().clear();
        getXt24().addAll((Collection<? extends TypeExpression>)newValue);
        return;
      case EditorPackage.TUPLE_DEFINITION__XT26:
        getXt26().clear();
        getXt26().addAll((Collection<? extends TypeExpression>)newValue);
        return;
      case EditorPackage.TUPLE_DEFINITION__XT13:
        setXt13((TypeExpression)newValue);
        return;
      case EditorPackage.TUPLE_DEFINITION__XT14:
        getXt14().clear();
        getXt14().addAll((Collection<? extends TypeExpression>)newValue);
        return;
      case EditorPackage.TUPLE_DEFINITION__T4:
        setT4((TypeExpression)newValue);
        return;
      case EditorPackage.TUPLE_DEFINITION__T25:
        getT25().clear();
        getT25().addAll((Collection<? extends TypeExpression>)newValue);
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
      case EditorPackage.TUPLE_DEFINITION__T92:
        setT92((TypeArguments)null);
        return;
      case EditorPackage.TUPLE_DEFINITION__T93:
        setT93((TypeResult)null);
        return;
      case EditorPackage.TUPLE_DEFINITION__XT32:
        setXt32(XT32_EDEFAULT);
        return;
      case EditorPackage.TUPLE_DEFINITION__XTYNAME:
        setXtyname(XTYNAME_EDEFAULT);
        return;
      case EditorPackage.TUPLE_DEFINITION__XT5:
        setXt5((TypeExpression)null);
        return;
      case EditorPackage.TUPLE_DEFINITION__XT7:
        setXt7((TypeExpression)null);
        return;
      case EditorPackage.TUPLE_DEFINITION__XT8:
        getXt8().clear();
        return;
      case EditorPackage.TUPLE_DEFINITION__XT21:
        getXt21().clear();
        return;
      case EditorPackage.TUPLE_DEFINITION__XT23:
        getXt23().clear();
        return;
      case EditorPackage.TUPLE_DEFINITION__XT10:
        setXt10((TypeExpression)null);
        return;
      case EditorPackage.TUPLE_DEFINITION__XT11:
        getXt11().clear();
        return;
      case EditorPackage.TUPLE_DEFINITION__XT24:
        getXt24().clear();
        return;
      case EditorPackage.TUPLE_DEFINITION__XT26:
        getXt26().clear();
        return;
      case EditorPackage.TUPLE_DEFINITION__XT13:
        setXt13((TypeExpression)null);
        return;
      case EditorPackage.TUPLE_DEFINITION__XT14:
        getXt14().clear();
        return;
      case EditorPackage.TUPLE_DEFINITION__T4:
        setT4((TypeExpression)null);
        return;
      case EditorPackage.TUPLE_DEFINITION__T25:
        getT25().clear();
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
      case EditorPackage.TUPLE_DEFINITION__T92:
        return t92 != null;
      case EditorPackage.TUPLE_DEFINITION__T93:
        return t93 != null;
      case EditorPackage.TUPLE_DEFINITION__XT32:
        return XT32_EDEFAULT == null ? xt32 != null : !XT32_EDEFAULT.equals(xt32);
      case EditorPackage.TUPLE_DEFINITION__XTYNAME:
        return XTYNAME_EDEFAULT == null ? xtyname != null : !XTYNAME_EDEFAULT.equals(xtyname);
      case EditorPackage.TUPLE_DEFINITION__XT5:
        return xt5 != null;
      case EditorPackage.TUPLE_DEFINITION__XT7:
        return xt7 != null;
      case EditorPackage.TUPLE_DEFINITION__XT8:
        return xt8 != null && !xt8.isEmpty();
      case EditorPackage.TUPLE_DEFINITION__XT21:
        return xt21 != null && !xt21.isEmpty();
      case EditorPackage.TUPLE_DEFINITION__XT23:
        return xt23 != null && !xt23.isEmpty();
      case EditorPackage.TUPLE_DEFINITION__XT10:
        return xt10 != null;
      case EditorPackage.TUPLE_DEFINITION__XT11:
        return xt11 != null && !xt11.isEmpty();
      case EditorPackage.TUPLE_DEFINITION__XT24:
        return xt24 != null && !xt24.isEmpty();
      case EditorPackage.TUPLE_DEFINITION__XT26:
        return xt26 != null && !xt26.isEmpty();
      case EditorPackage.TUPLE_DEFINITION__XT13:
        return xt13 != null;
      case EditorPackage.TUPLE_DEFINITION__XT14:
        return xt14 != null && !xt14.isEmpty();
      case EditorPackage.TUPLE_DEFINITION__T4:
        return t4 != null;
      case EditorPackage.TUPLE_DEFINITION__T25:
        return t25 != null && !t25.isEmpty();
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
        case EditorPackage.TUPLE_DEFINITION__T92: return EditorPackage.TYPE_EXPRESSION2__T92;
        case EditorPackage.TUPLE_DEFINITION__T93: return EditorPackage.TYPE_EXPRESSION2__T93;
        default: return -1;
      }
    }
    if (baseClass == TypePrimaryExpression2.class)
    {
      switch (derivedFeatureID)
      {
        case EditorPackage.TUPLE_DEFINITION__XT32: return EditorPackage.TYPE_PRIMARY_EXPRESSION2__XT32;
        case EditorPackage.TUPLE_DEFINITION__XTYNAME: return EditorPackage.TYPE_PRIMARY_EXPRESSION2__XTYNAME;
        case EditorPackage.TUPLE_DEFINITION__XT5: return EditorPackage.TYPE_PRIMARY_EXPRESSION2__XT5;
        case EditorPackage.TUPLE_DEFINITION__XT7: return EditorPackage.TYPE_PRIMARY_EXPRESSION2__XT7;
        case EditorPackage.TUPLE_DEFINITION__XT8: return EditorPackage.TYPE_PRIMARY_EXPRESSION2__XT8;
        case EditorPackage.TUPLE_DEFINITION__XT21: return EditorPackage.TYPE_PRIMARY_EXPRESSION2__XT21;
        case EditorPackage.TUPLE_DEFINITION__XT23: return EditorPackage.TYPE_PRIMARY_EXPRESSION2__XT23;
        case EditorPackage.TUPLE_DEFINITION__XT10: return EditorPackage.TYPE_PRIMARY_EXPRESSION2__XT10;
        case EditorPackage.TUPLE_DEFINITION__XT11: return EditorPackage.TYPE_PRIMARY_EXPRESSION2__XT11;
        case EditorPackage.TUPLE_DEFINITION__XT24: return EditorPackage.TYPE_PRIMARY_EXPRESSION2__XT24;
        case EditorPackage.TUPLE_DEFINITION__XT26: return EditorPackage.TYPE_PRIMARY_EXPRESSION2__XT26;
        case EditorPackage.TUPLE_DEFINITION__XT13: return EditorPackage.TYPE_PRIMARY_EXPRESSION2__XT13;
        case EditorPackage.TUPLE_DEFINITION__XT14: return EditorPackage.TYPE_PRIMARY_EXPRESSION2__XT14;
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
        case EditorPackage.TYPE_EXPRESSION2__T92: return EditorPackage.TUPLE_DEFINITION__T92;
        case EditorPackage.TYPE_EXPRESSION2__T93: return EditorPackage.TUPLE_DEFINITION__T93;
        default: return -1;
      }
    }
    if (baseClass == TypePrimaryExpression2.class)
    {
      switch (baseFeatureID)
      {
        case EditorPackage.TYPE_PRIMARY_EXPRESSION2__XT32: return EditorPackage.TUPLE_DEFINITION__XT32;
        case EditorPackage.TYPE_PRIMARY_EXPRESSION2__XTYNAME: return EditorPackage.TUPLE_DEFINITION__XTYNAME;
        case EditorPackage.TYPE_PRIMARY_EXPRESSION2__XT5: return EditorPackage.TUPLE_DEFINITION__XT5;
        case EditorPackage.TYPE_PRIMARY_EXPRESSION2__XT7: return EditorPackage.TUPLE_DEFINITION__XT7;
        case EditorPackage.TYPE_PRIMARY_EXPRESSION2__XT8: return EditorPackage.TUPLE_DEFINITION__XT8;
        case EditorPackage.TYPE_PRIMARY_EXPRESSION2__XT21: return EditorPackage.TUPLE_DEFINITION__XT21;
        case EditorPackage.TYPE_PRIMARY_EXPRESSION2__XT23: return EditorPackage.TUPLE_DEFINITION__XT23;
        case EditorPackage.TYPE_PRIMARY_EXPRESSION2__XT10: return EditorPackage.TUPLE_DEFINITION__XT10;
        case EditorPackage.TYPE_PRIMARY_EXPRESSION2__XT11: return EditorPackage.TUPLE_DEFINITION__XT11;
        case EditorPackage.TYPE_PRIMARY_EXPRESSION2__XT24: return EditorPackage.TUPLE_DEFINITION__XT24;
        case EditorPackage.TYPE_PRIMARY_EXPRESSION2__XT26: return EditorPackage.TUPLE_DEFINITION__XT26;
        case EditorPackage.TYPE_PRIMARY_EXPRESSION2__XT13: return EditorPackage.TUPLE_DEFINITION__XT13;
        case EditorPackage.TYPE_PRIMARY_EXPRESSION2__XT14: return EditorPackage.TUPLE_DEFINITION__XT14;
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
    result.append(')');
    return result.toString();
  }

} //TupleDefinitionImpl
