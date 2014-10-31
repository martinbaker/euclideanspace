/**
 */
package com.euclideanspace.aldor.editor.impl;

import com.euclideanspace.aldor.editor.AlwaysPart_BalStatement;
import com.euclideanspace.aldor.editor.BalStatement;
import com.euclideanspace.aldor.editor.Binding_AnyStatement;
import com.euclideanspace.aldor.editor.Binding_BalStatement;
import com.euclideanspace.aldor.editor.ButExpr;
import com.euclideanspace.aldor.editor.Cases;
import com.euclideanspace.aldor.editor.Collection;
import com.euclideanspace.aldor.editor.CommaItem;
import com.euclideanspace.aldor.editor.EditorPackage;
import com.euclideanspace.aldor.editor.Flow_BalStatement;
import com.euclideanspace.aldor.editor.GenBound;
import com.euclideanspace.aldor.editor.Iterators;
import com.euclideanspace.aldor.editor.Name;

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
 * An implementation of the model object '<em><b>Iterators</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.IteratorsImpl#getC2 <em>C2</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.IteratorsImpl#getSt2 <em>St2</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.IteratorsImpl#getBbs3 <em>Bbs3</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.IteratorsImpl#getCi2 <em>Ci2</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.IteratorsImpl#getBbs4 <em>Bbs4</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.IteratorsImpl#getBbs5 <em>Bbs5</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.IteratorsImpl#getBbs2 <em>Bbs2</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.IteratorsImpl#getBe <em>Be</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.IteratorsImpl#getApb <em>Apb</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.IteratorsImpl#getCa2 <em>Ca2</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.IteratorsImpl#getGb2 <em>Gb2</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.IteratorsImpl#getN2 <em>N2</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.IteratorsImpl#getI3 <em>I3</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.IteratorsImpl#getBas3 <em>Bas3</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IteratorsImpl extends Flow_AnyStatementImpl implements Iterators
{
  /**
   * The cached value of the '{@link #getC2() <em>C2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getC2()
   * @generated
   * @ordered
   */
  protected Collection c2;

  /**
   * The default value of the '{@link #getSt2() <em>St2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSt2()
   * @generated
   * @ordered
   */
  protected static final String ST2_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSt2() <em>St2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSt2()
   * @generated
   * @ordered
   */
  protected String st2 = ST2_EDEFAULT;

  /**
   * The cached value of the '{@link #getBbs3() <em>Bbs3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBbs3()
   * @generated
   * @ordered
   */
  protected Binding_BalStatement bbs3;

  /**
   * The cached value of the '{@link #getCi2() <em>Ci2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCi2()
   * @generated
   * @ordered
   */
  protected CommaItem ci2;

  /**
   * The cached value of the '{@link #getBbs4() <em>Bbs4</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBbs4()
   * @generated
   * @ordered
   */
  protected EList<Binding_BalStatement> bbs4;

  /**
   * The cached value of the '{@link #getBbs5() <em>Bbs5</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBbs5()
   * @generated
   * @ordered
   */
  protected Binding_BalStatement bbs5;

  /**
   * The cached value of the '{@link #getBbs2() <em>Bbs2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBbs2()
   * @generated
   * @ordered
   */
  protected Binding_AnyStatement bbs2;

  /**
   * The cached value of the '{@link #getBe() <em>Be</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBe()
   * @generated
   * @ordered
   */
  protected ButExpr be;

  /**
   * The cached value of the '{@link #getApb() <em>Apb</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getApb()
   * @generated
   * @ordered
   */
  protected AlwaysPart_BalStatement apb;

  /**
   * The cached value of the '{@link #getCa2() <em>Ca2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCa2()
   * @generated
   * @ordered
   */
  protected Cases ca2;

  /**
   * The cached value of the '{@link #getGb2() <em>Gb2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGb2()
   * @generated
   * @ordered
   */
  protected GenBound gb2;

  /**
   * The cached value of the '{@link #getN2() <em>N2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getN2()
   * @generated
   * @ordered
   */
  protected Name n2;

  /**
   * The default value of the '{@link #getI3() <em>I3</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getI3()
   * @generated
   * @ordered
   */
  protected static final String I3_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getI3() <em>I3</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getI3()
   * @generated
   * @ordered
   */
  protected String i3 = I3_EDEFAULT;

  /**
   * The cached value of the '{@link #getBas3() <em>Bas3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBas3()
   * @generated
   * @ordered
   */
  protected Binding_AnyStatement bas3;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IteratorsImpl()
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
    return EditorPackage.Literals.ITERATORS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Collection getC2()
  {
    return c2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetC2(Collection newC2, NotificationChain msgs)
  {
    Collection oldC2 = c2;
    c2 = newC2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.ITERATORS__C2, oldC2, newC2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setC2(Collection newC2)
  {
    if (newC2 != c2)
    {
      NotificationChain msgs = null;
      if (c2 != null)
        msgs = ((InternalEObject)c2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.ITERATORS__C2, null, msgs);
      if (newC2 != null)
        msgs = ((InternalEObject)newC2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.ITERATORS__C2, null, msgs);
      msgs = basicSetC2(newC2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.ITERATORS__C2, newC2, newC2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSt2()
  {
    return st2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSt2(String newSt2)
  {
    String oldSt2 = st2;
    st2 = newSt2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.ITERATORS__ST2, oldSt2, st2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Binding_BalStatement getBbs3()
  {
    return bbs3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBbs3(Binding_BalStatement newBbs3, NotificationChain msgs)
  {
    Binding_BalStatement oldBbs3 = bbs3;
    bbs3 = newBbs3;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.ITERATORS__BBS3, oldBbs3, newBbs3);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBbs3(Binding_BalStatement newBbs3)
  {
    if (newBbs3 != bbs3)
    {
      NotificationChain msgs = null;
      if (bbs3 != null)
        msgs = ((InternalEObject)bbs3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.ITERATORS__BBS3, null, msgs);
      if (newBbs3 != null)
        msgs = ((InternalEObject)newBbs3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.ITERATORS__BBS3, null, msgs);
      msgs = basicSetBbs3(newBbs3, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.ITERATORS__BBS3, newBbs3, newBbs3));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CommaItem getCi2()
  {
    return ci2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCi2(CommaItem newCi2, NotificationChain msgs)
  {
    CommaItem oldCi2 = ci2;
    ci2 = newCi2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.ITERATORS__CI2, oldCi2, newCi2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCi2(CommaItem newCi2)
  {
    if (newCi2 != ci2)
    {
      NotificationChain msgs = null;
      if (ci2 != null)
        msgs = ((InternalEObject)ci2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.ITERATORS__CI2, null, msgs);
      if (newCi2 != null)
        msgs = ((InternalEObject)newCi2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.ITERATORS__CI2, null, msgs);
      msgs = basicSetCi2(newCi2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.ITERATORS__CI2, newCi2, newCi2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Binding_BalStatement> getBbs4()
  {
    if (bbs4 == null)
    {
      bbs4 = new EObjectContainmentEList<Binding_BalStatement>(Binding_BalStatement.class, this, EditorPackage.ITERATORS__BBS4);
    }
    return bbs4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Binding_BalStatement getBbs5()
  {
    return bbs5;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBbs5(Binding_BalStatement newBbs5, NotificationChain msgs)
  {
    Binding_BalStatement oldBbs5 = bbs5;
    bbs5 = newBbs5;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.ITERATORS__BBS5, oldBbs5, newBbs5);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBbs5(Binding_BalStatement newBbs5)
  {
    if (newBbs5 != bbs5)
    {
      NotificationChain msgs = null;
      if (bbs5 != null)
        msgs = ((InternalEObject)bbs5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.ITERATORS__BBS5, null, msgs);
      if (newBbs5 != null)
        msgs = ((InternalEObject)newBbs5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.ITERATORS__BBS5, null, msgs);
      msgs = basicSetBbs5(newBbs5, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.ITERATORS__BBS5, newBbs5, newBbs5));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Binding_AnyStatement getBbs2()
  {
    return bbs2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBbs2(Binding_AnyStatement newBbs2, NotificationChain msgs)
  {
    Binding_AnyStatement oldBbs2 = bbs2;
    bbs2 = newBbs2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.ITERATORS__BBS2, oldBbs2, newBbs2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBbs2(Binding_AnyStatement newBbs2)
  {
    if (newBbs2 != bbs2)
    {
      NotificationChain msgs = null;
      if (bbs2 != null)
        msgs = ((InternalEObject)bbs2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.ITERATORS__BBS2, null, msgs);
      if (newBbs2 != null)
        msgs = ((InternalEObject)newBbs2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.ITERATORS__BBS2, null, msgs);
      msgs = basicSetBbs2(newBbs2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.ITERATORS__BBS2, newBbs2, newBbs2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ButExpr getBe()
  {
    return be;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBe(ButExpr newBe, NotificationChain msgs)
  {
    ButExpr oldBe = be;
    be = newBe;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.ITERATORS__BE, oldBe, newBe);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBe(ButExpr newBe)
  {
    if (newBe != be)
    {
      NotificationChain msgs = null;
      if (be != null)
        msgs = ((InternalEObject)be).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.ITERATORS__BE, null, msgs);
      if (newBe != null)
        msgs = ((InternalEObject)newBe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.ITERATORS__BE, null, msgs);
      msgs = basicSetBe(newBe, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.ITERATORS__BE, newBe, newBe));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AlwaysPart_BalStatement getApb()
  {
    return apb;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetApb(AlwaysPart_BalStatement newApb, NotificationChain msgs)
  {
    AlwaysPart_BalStatement oldApb = apb;
    apb = newApb;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.ITERATORS__APB, oldApb, newApb);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setApb(AlwaysPart_BalStatement newApb)
  {
    if (newApb != apb)
    {
      NotificationChain msgs = null;
      if (apb != null)
        msgs = ((InternalEObject)apb).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.ITERATORS__APB, null, msgs);
      if (newApb != null)
        msgs = ((InternalEObject)newApb).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.ITERATORS__APB, null, msgs);
      msgs = basicSetApb(newApb, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.ITERATORS__APB, newApb, newApb));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Cases getCa2()
  {
    return ca2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCa2(Cases newCa2, NotificationChain msgs)
  {
    Cases oldCa2 = ca2;
    ca2 = newCa2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.ITERATORS__CA2, oldCa2, newCa2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCa2(Cases newCa2)
  {
    if (newCa2 != ca2)
    {
      NotificationChain msgs = null;
      if (ca2 != null)
        msgs = ((InternalEObject)ca2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.ITERATORS__CA2, null, msgs);
      if (newCa2 != null)
        msgs = ((InternalEObject)newCa2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.ITERATORS__CA2, null, msgs);
      msgs = basicSetCa2(newCa2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.ITERATORS__CA2, newCa2, newCa2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GenBound getGb2()
  {
    return gb2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGb2(GenBound newGb2, NotificationChain msgs)
  {
    GenBound oldGb2 = gb2;
    gb2 = newGb2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.ITERATORS__GB2, oldGb2, newGb2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGb2(GenBound newGb2)
  {
    if (newGb2 != gb2)
    {
      NotificationChain msgs = null;
      if (gb2 != null)
        msgs = ((InternalEObject)gb2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.ITERATORS__GB2, null, msgs);
      if (newGb2 != null)
        msgs = ((InternalEObject)newGb2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.ITERATORS__GB2, null, msgs);
      msgs = basicSetGb2(newGb2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.ITERATORS__GB2, newGb2, newGb2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Name getN2()
  {
    return n2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetN2(Name newN2, NotificationChain msgs)
  {
    Name oldN2 = n2;
    n2 = newN2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.ITERATORS__N2, oldN2, newN2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setN2(Name newN2)
  {
    if (newN2 != n2)
    {
      NotificationChain msgs = null;
      if (n2 != null)
        msgs = ((InternalEObject)n2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.ITERATORS__N2, null, msgs);
      if (newN2 != null)
        msgs = ((InternalEObject)newN2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.ITERATORS__N2, null, msgs);
      msgs = basicSetN2(newN2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.ITERATORS__N2, newN2, newN2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getI3()
  {
    return i3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setI3(String newI3)
  {
    String oldI3 = i3;
    i3 = newI3;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.ITERATORS__I3, oldI3, i3));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Binding_AnyStatement getBas3()
  {
    return bas3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBas3(Binding_AnyStatement newBas3, NotificationChain msgs)
  {
    Binding_AnyStatement oldBas3 = bas3;
    bas3 = newBas3;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.ITERATORS__BAS3, oldBas3, newBas3);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBas3(Binding_AnyStatement newBas3)
  {
    if (newBas3 != bas3)
    {
      NotificationChain msgs = null;
      if (bas3 != null)
        msgs = ((InternalEObject)bas3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.ITERATORS__BAS3, null, msgs);
      if (newBas3 != null)
        msgs = ((InternalEObject)newBas3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.ITERATORS__BAS3, null, msgs);
      msgs = basicSetBas3(newBas3, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.ITERATORS__BAS3, newBas3, newBas3));
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
      case EditorPackage.ITERATORS__C2:
        return basicSetC2(null, msgs);
      case EditorPackage.ITERATORS__BBS3:
        return basicSetBbs3(null, msgs);
      case EditorPackage.ITERATORS__CI2:
        return basicSetCi2(null, msgs);
      case EditorPackage.ITERATORS__BBS4:
        return ((InternalEList<?>)getBbs4()).basicRemove(otherEnd, msgs);
      case EditorPackage.ITERATORS__BBS5:
        return basicSetBbs5(null, msgs);
      case EditorPackage.ITERATORS__BBS2:
        return basicSetBbs2(null, msgs);
      case EditorPackage.ITERATORS__BE:
        return basicSetBe(null, msgs);
      case EditorPackage.ITERATORS__APB:
        return basicSetApb(null, msgs);
      case EditorPackage.ITERATORS__CA2:
        return basicSetCa2(null, msgs);
      case EditorPackage.ITERATORS__GB2:
        return basicSetGb2(null, msgs);
      case EditorPackage.ITERATORS__N2:
        return basicSetN2(null, msgs);
      case EditorPackage.ITERATORS__BAS3:
        return basicSetBas3(null, msgs);
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
      case EditorPackage.ITERATORS__C2:
        return getC2();
      case EditorPackage.ITERATORS__ST2:
        return getSt2();
      case EditorPackage.ITERATORS__BBS3:
        return getBbs3();
      case EditorPackage.ITERATORS__CI2:
        return getCi2();
      case EditorPackage.ITERATORS__BBS4:
        return getBbs4();
      case EditorPackage.ITERATORS__BBS5:
        return getBbs5();
      case EditorPackage.ITERATORS__BBS2:
        return getBbs2();
      case EditorPackage.ITERATORS__BE:
        return getBe();
      case EditorPackage.ITERATORS__APB:
        return getApb();
      case EditorPackage.ITERATORS__CA2:
        return getCa2();
      case EditorPackage.ITERATORS__GB2:
        return getGb2();
      case EditorPackage.ITERATORS__N2:
        return getN2();
      case EditorPackage.ITERATORS__I3:
        return getI3();
      case EditorPackage.ITERATORS__BAS3:
        return getBas3();
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
      case EditorPackage.ITERATORS__C2:
        setC2((Collection)newValue);
        return;
      case EditorPackage.ITERATORS__ST2:
        setSt2((String)newValue);
        return;
      case EditorPackage.ITERATORS__BBS3:
        setBbs3((Binding_BalStatement)newValue);
        return;
      case EditorPackage.ITERATORS__CI2:
        setCi2((CommaItem)newValue);
        return;
      case EditorPackage.ITERATORS__BBS4:
        getBbs4().clear();
        getBbs4().addAll((java.util.Collection<? extends Binding_BalStatement>)newValue);
        return;
      case EditorPackage.ITERATORS__BBS5:
        setBbs5((Binding_BalStatement)newValue);
        return;
      case EditorPackage.ITERATORS__BBS2:
        setBbs2((Binding_AnyStatement)newValue);
        return;
      case EditorPackage.ITERATORS__BE:
        setBe((ButExpr)newValue);
        return;
      case EditorPackage.ITERATORS__APB:
        setApb((AlwaysPart_BalStatement)newValue);
        return;
      case EditorPackage.ITERATORS__CA2:
        setCa2((Cases)newValue);
        return;
      case EditorPackage.ITERATORS__GB2:
        setGb2((GenBound)newValue);
        return;
      case EditorPackage.ITERATORS__N2:
        setN2((Name)newValue);
        return;
      case EditorPackage.ITERATORS__I3:
        setI3((String)newValue);
        return;
      case EditorPackage.ITERATORS__BAS3:
        setBas3((Binding_AnyStatement)newValue);
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
      case EditorPackage.ITERATORS__C2:
        setC2((Collection)null);
        return;
      case EditorPackage.ITERATORS__ST2:
        setSt2(ST2_EDEFAULT);
        return;
      case EditorPackage.ITERATORS__BBS3:
        setBbs3((Binding_BalStatement)null);
        return;
      case EditorPackage.ITERATORS__CI2:
        setCi2((CommaItem)null);
        return;
      case EditorPackage.ITERATORS__BBS4:
        getBbs4().clear();
        return;
      case EditorPackage.ITERATORS__BBS5:
        setBbs5((Binding_BalStatement)null);
        return;
      case EditorPackage.ITERATORS__BBS2:
        setBbs2((Binding_AnyStatement)null);
        return;
      case EditorPackage.ITERATORS__BE:
        setBe((ButExpr)null);
        return;
      case EditorPackage.ITERATORS__APB:
        setApb((AlwaysPart_BalStatement)null);
        return;
      case EditorPackage.ITERATORS__CA2:
        setCa2((Cases)null);
        return;
      case EditorPackage.ITERATORS__GB2:
        setGb2((GenBound)null);
        return;
      case EditorPackage.ITERATORS__N2:
        setN2((Name)null);
        return;
      case EditorPackage.ITERATORS__I3:
        setI3(I3_EDEFAULT);
        return;
      case EditorPackage.ITERATORS__BAS3:
        setBas3((Binding_AnyStatement)null);
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
      case EditorPackage.ITERATORS__C2:
        return c2 != null;
      case EditorPackage.ITERATORS__ST2:
        return ST2_EDEFAULT == null ? st2 != null : !ST2_EDEFAULT.equals(st2);
      case EditorPackage.ITERATORS__BBS3:
        return bbs3 != null;
      case EditorPackage.ITERATORS__CI2:
        return ci2 != null;
      case EditorPackage.ITERATORS__BBS4:
        return bbs4 != null && !bbs4.isEmpty();
      case EditorPackage.ITERATORS__BBS5:
        return bbs5 != null;
      case EditorPackage.ITERATORS__BBS2:
        return bbs2 != null;
      case EditorPackage.ITERATORS__BE:
        return be != null;
      case EditorPackage.ITERATORS__APB:
        return apb != null;
      case EditorPackage.ITERATORS__CA2:
        return ca2 != null;
      case EditorPackage.ITERATORS__GB2:
        return gb2 != null;
      case EditorPackage.ITERATORS__N2:
        return n2 != null;
      case EditorPackage.ITERATORS__I3:
        return I3_EDEFAULT == null ? i3 != null : !I3_EDEFAULT.equals(i3);
      case EditorPackage.ITERATORS__BAS3:
        return bas3 != null;
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
    if (baseClass == BalStatement.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Flow_BalStatement.class)
    {
      switch (derivedFeatureID)
      {
        case EditorPackage.ITERATORS__C2: return EditorPackage.FLOW_BAL_STATEMENT__C2;
        case EditorPackage.ITERATORS__ST2: return EditorPackage.FLOW_BAL_STATEMENT__ST2;
        case EditorPackage.ITERATORS__BBS3: return EditorPackage.FLOW_BAL_STATEMENT__BBS3;
        case EditorPackage.ITERATORS__CI2: return EditorPackage.FLOW_BAL_STATEMENT__CI2;
        case EditorPackage.ITERATORS__BBS4: return EditorPackage.FLOW_BAL_STATEMENT__BBS4;
        case EditorPackage.ITERATORS__BBS5: return EditorPackage.FLOW_BAL_STATEMENT__BBS5;
        case EditorPackage.ITERATORS__BBS2: return EditorPackage.FLOW_BAL_STATEMENT__BBS2;
        case EditorPackage.ITERATORS__BE: return EditorPackage.FLOW_BAL_STATEMENT__BE;
        case EditorPackage.ITERATORS__APB: return EditorPackage.FLOW_BAL_STATEMENT__APB;
        case EditorPackage.ITERATORS__CA2: return EditorPackage.FLOW_BAL_STATEMENT__CA2;
        case EditorPackage.ITERATORS__GB2: return EditorPackage.FLOW_BAL_STATEMENT__GB2;
        case EditorPackage.ITERATORS__N2: return EditorPackage.FLOW_BAL_STATEMENT__N2;
        case EditorPackage.ITERATORS__I3: return EditorPackage.FLOW_BAL_STATEMENT__I3;
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
    if (baseClass == BalStatement.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Flow_BalStatement.class)
    {
      switch (baseFeatureID)
      {
        case EditorPackage.FLOW_BAL_STATEMENT__C2: return EditorPackage.ITERATORS__C2;
        case EditorPackage.FLOW_BAL_STATEMENT__ST2: return EditorPackage.ITERATORS__ST2;
        case EditorPackage.FLOW_BAL_STATEMENT__BBS3: return EditorPackage.ITERATORS__BBS3;
        case EditorPackage.FLOW_BAL_STATEMENT__CI2: return EditorPackage.ITERATORS__CI2;
        case EditorPackage.FLOW_BAL_STATEMENT__BBS4: return EditorPackage.ITERATORS__BBS4;
        case EditorPackage.FLOW_BAL_STATEMENT__BBS5: return EditorPackage.ITERATORS__BBS5;
        case EditorPackage.FLOW_BAL_STATEMENT__BBS2: return EditorPackage.ITERATORS__BBS2;
        case EditorPackage.FLOW_BAL_STATEMENT__BE: return EditorPackage.ITERATORS__BE;
        case EditorPackage.FLOW_BAL_STATEMENT__APB: return EditorPackage.ITERATORS__APB;
        case EditorPackage.FLOW_BAL_STATEMENT__CA2: return EditorPackage.ITERATORS__CA2;
        case EditorPackage.FLOW_BAL_STATEMENT__GB2: return EditorPackage.ITERATORS__GB2;
        case EditorPackage.FLOW_BAL_STATEMENT__N2: return EditorPackage.ITERATORS__N2;
        case EditorPackage.FLOW_BAL_STATEMENT__I3: return EditorPackage.ITERATORS__I3;
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
    result.append(" (st2: ");
    result.append(st2);
    result.append(", i3: ");
    result.append(i3);
    result.append(')');
    return result.toString();
  }

} //IteratorsImpl
