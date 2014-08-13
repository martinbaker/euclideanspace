/**
 */
package com.euclideanspace.aldor.editor.impl;

import com.euclideanspace.aldor.editor.AlwaysPart_BalStatement;
import com.euclideanspace.aldor.editor.BalStatement;
import com.euclideanspace.aldor.editor.BindingL_Infixed_BalStatement;
import com.euclideanspace.aldor.editor.BindingL_Infixed_Collection;
import com.euclideanspace.aldor.editor.Binding_AnyStatement;
import com.euclideanspace.aldor.editor.Binding_BalStatement;
import com.euclideanspace.aldor.editor.Binding_Collection;
import com.euclideanspace.aldor.editor.Block;
import com.euclideanspace.aldor.editor.ButExpr;
import com.euclideanspace.aldor.editor.Cases;
import com.euclideanspace.aldor.editor.Collection;
import com.euclideanspace.aldor.editor.CommaItem;
import com.euclideanspace.aldor.editor.DeclPart;
import com.euclideanspace.aldor.editor.EditorPackage;
import com.euclideanspace.aldor.editor.Flow_BalStatement;
import com.euclideanspace.aldor.editor.ForLhs;
import com.euclideanspace.aldor.editor.FromPart;
import com.euclideanspace.aldor.editor.GenBound;
import com.euclideanspace.aldor.editor.Infixed;
import com.euclideanspace.aldor.editor.InfixedExpr;
import com.euclideanspace.aldor.editor.Iterator;
import com.euclideanspace.aldor.editor.Name;
import com.euclideanspace.aldor.editor.SuchthatPart;
import com.euclideanspace.aldor.editor.enlist1_Infixed_Comma_AB;
import com.euclideanspace.aldor.editor.enlister1_Infixed_Comma;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Infixed</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.InfixedImpl#getSt2 <em>St2</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.InfixedImpl#getCi2 <em>Ci2</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.InfixedImpl#getBbs4 <em>Bbs4</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.InfixedImpl#getBbs5 <em>Bbs5</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.InfixedImpl#getBbs2 <em>Bbs2</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.InfixedImpl#getBe <em>Be</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.InfixedImpl#getApb <em>Apb</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.InfixedImpl#getCa2 <em>Ca2</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.InfixedImpl#getGb2 <em>Gb2</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.InfixedImpl#getN2 <em>N2</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.InfixedImpl#getC2 <em>C2</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.InfixedImpl#getI3 <em>I3</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.InfixedImpl#getBbs3 <em>Bbs3</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.InfixedImpl#getI <em>I</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.InfixedImpl#getSp <em>Sp</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.InfixedImpl#getBib <em>Bib</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.InfixedImpl#getBic <em>Bic</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.InfixedImpl#getIfx <em>Ifx</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.InfixedImpl#getDp <em>Dp</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.InfixedImpl#getB <em>B</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.InfixedImpl#getI2 <em>I2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InfixedImpl extends ToPartImpl implements Infixed
{
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
   * The cached value of the '{@link #getC2() <em>C2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getC2()
   * @generated
   * @ordered
   */
  protected Collection c2;

  /**
   * The cached value of the '{@link #getI3() <em>I3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getI3()
   * @generated
   * @ordered
   */
  protected EObject i3;

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
   * The cached value of the '{@link #getI() <em>I</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getI()
   * @generated
   * @ordered
   */
  protected Infixed i;

  /**
   * The cached value of the '{@link #getSp() <em>Sp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSp()
   * @generated
   * @ordered
   */
  protected SuchthatPart sp;

  /**
   * The cached value of the '{@link #getBib() <em>Bib</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBib()
   * @generated
   * @ordered
   */
  protected BindingL_Infixed_BalStatement bib;

  /**
   * The cached value of the '{@link #getBic() <em>Bic</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBic()
   * @generated
   * @ordered
   */
  protected BindingL_Infixed_Collection bic;

  /**
   * The cached value of the '{@link #getIfx() <em>Ifx</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIfx()
   * @generated
   * @ordered
   */
  protected InfixedExpr ifx;

  /**
   * The cached value of the '{@link #getDp() <em>Dp</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDp()
   * @generated
   * @ordered
   */
  protected EList<DeclPart> dp;

  /**
   * The cached value of the '{@link #getB() <em>B</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getB()
   * @generated
   * @ordered
   */
  protected Block b;

  /**
   * The cached value of the '{@link #getI2() <em>I2</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getI2()
   * @generated
   * @ordered
   */
  protected EList<Infixed> i2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InfixedImpl()
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
    return EditorPackage.Literals.INFIXED;
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
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.INFIXED__ST2, oldSt2, st2));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.INFIXED__CI2, oldCi2, newCi2);
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
        msgs = ((InternalEObject)ci2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.INFIXED__CI2, null, msgs);
      if (newCi2 != null)
        msgs = ((InternalEObject)newCi2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.INFIXED__CI2, null, msgs);
      msgs = basicSetCi2(newCi2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.INFIXED__CI2, newCi2, newCi2));
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
      bbs4 = new EObjectContainmentEList<Binding_BalStatement>(Binding_BalStatement.class, this, EditorPackage.INFIXED__BBS4);
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.INFIXED__BBS5, oldBbs5, newBbs5);
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
        msgs = ((InternalEObject)bbs5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.INFIXED__BBS5, null, msgs);
      if (newBbs5 != null)
        msgs = ((InternalEObject)newBbs5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.INFIXED__BBS5, null, msgs);
      msgs = basicSetBbs5(newBbs5, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.INFIXED__BBS5, newBbs5, newBbs5));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.INFIXED__BBS2, oldBbs2, newBbs2);
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
        msgs = ((InternalEObject)bbs2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.INFIXED__BBS2, null, msgs);
      if (newBbs2 != null)
        msgs = ((InternalEObject)newBbs2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.INFIXED__BBS2, null, msgs);
      msgs = basicSetBbs2(newBbs2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.INFIXED__BBS2, newBbs2, newBbs2));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.INFIXED__BE, oldBe, newBe);
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
        msgs = ((InternalEObject)be).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.INFIXED__BE, null, msgs);
      if (newBe != null)
        msgs = ((InternalEObject)newBe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.INFIXED__BE, null, msgs);
      msgs = basicSetBe(newBe, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.INFIXED__BE, newBe, newBe));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.INFIXED__APB, oldApb, newApb);
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
        msgs = ((InternalEObject)apb).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.INFIXED__APB, null, msgs);
      if (newApb != null)
        msgs = ((InternalEObject)newApb).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.INFIXED__APB, null, msgs);
      msgs = basicSetApb(newApb, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.INFIXED__APB, newApb, newApb));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.INFIXED__CA2, oldCa2, newCa2);
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
        msgs = ((InternalEObject)ca2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.INFIXED__CA2, null, msgs);
      if (newCa2 != null)
        msgs = ((InternalEObject)newCa2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.INFIXED__CA2, null, msgs);
      msgs = basicSetCa2(newCa2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.INFIXED__CA2, newCa2, newCa2));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.INFIXED__GB2, oldGb2, newGb2);
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
        msgs = ((InternalEObject)gb2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.INFIXED__GB2, null, msgs);
      if (newGb2 != null)
        msgs = ((InternalEObject)newGb2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.INFIXED__GB2, null, msgs);
      msgs = basicSetGb2(newGb2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.INFIXED__GB2, newGb2, newGb2));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.INFIXED__N2, oldN2, newN2);
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
        msgs = ((InternalEObject)n2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.INFIXED__N2, null, msgs);
      if (newN2 != null)
        msgs = ((InternalEObject)newN2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.INFIXED__N2, null, msgs);
      msgs = basicSetN2(newN2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.INFIXED__N2, newN2, newN2));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.INFIXED__C2, oldC2, newC2);
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
        msgs = ((InternalEObject)c2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.INFIXED__C2, null, msgs);
      if (newC2 != null)
        msgs = ((InternalEObject)newC2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.INFIXED__C2, null, msgs);
      msgs = basicSetC2(newC2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.INFIXED__C2, newC2, newC2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getI3()
  {
    return i3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetI3(EObject newI3, NotificationChain msgs)
  {
    EObject oldI3 = i3;
    i3 = newI3;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.INFIXED__I3, oldI3, newI3);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setI3(EObject newI3)
  {
    if (newI3 != i3)
    {
      NotificationChain msgs = null;
      if (i3 != null)
        msgs = ((InternalEObject)i3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.INFIXED__I3, null, msgs);
      if (newI3 != null)
        msgs = ((InternalEObject)newI3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.INFIXED__I3, null, msgs);
      msgs = basicSetI3(newI3, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.INFIXED__I3, newI3, newI3));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.INFIXED__BBS3, oldBbs3, newBbs3);
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
        msgs = ((InternalEObject)bbs3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.INFIXED__BBS3, null, msgs);
      if (newBbs3 != null)
        msgs = ((InternalEObject)newBbs3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.INFIXED__BBS3, null, msgs);
      msgs = basicSetBbs3(newBbs3, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.INFIXED__BBS3, newBbs3, newBbs3));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Infixed getI()
  {
    return i;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetI(Infixed newI, NotificationChain msgs)
  {
    Infixed oldI = i;
    i = newI;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.INFIXED__I, oldI, newI);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setI(Infixed newI)
  {
    if (newI != i)
    {
      NotificationChain msgs = null;
      if (i != null)
        msgs = ((InternalEObject)i).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.INFIXED__I, null, msgs);
      if (newI != null)
        msgs = ((InternalEObject)newI).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.INFIXED__I, null, msgs);
      msgs = basicSetI(newI, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.INFIXED__I, newI, newI));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SuchthatPart getSp()
  {
    return sp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSp(SuchthatPart newSp, NotificationChain msgs)
  {
    SuchthatPart oldSp = sp;
    sp = newSp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.INFIXED__SP, oldSp, newSp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSp(SuchthatPart newSp)
  {
    if (newSp != sp)
    {
      NotificationChain msgs = null;
      if (sp != null)
        msgs = ((InternalEObject)sp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.INFIXED__SP, null, msgs);
      if (newSp != null)
        msgs = ((InternalEObject)newSp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.INFIXED__SP, null, msgs);
      msgs = basicSetSp(newSp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.INFIXED__SP, newSp, newSp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BindingL_Infixed_BalStatement getBib()
  {
    return bib;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBib(BindingL_Infixed_BalStatement newBib, NotificationChain msgs)
  {
    BindingL_Infixed_BalStatement oldBib = bib;
    bib = newBib;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.INFIXED__BIB, oldBib, newBib);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBib(BindingL_Infixed_BalStatement newBib)
  {
    if (newBib != bib)
    {
      NotificationChain msgs = null;
      if (bib != null)
        msgs = ((InternalEObject)bib).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.INFIXED__BIB, null, msgs);
      if (newBib != null)
        msgs = ((InternalEObject)newBib).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.INFIXED__BIB, null, msgs);
      msgs = basicSetBib(newBib, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.INFIXED__BIB, newBib, newBib));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BindingL_Infixed_Collection getBic()
  {
    return bic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBic(BindingL_Infixed_Collection newBic, NotificationChain msgs)
  {
    BindingL_Infixed_Collection oldBic = bic;
    bic = newBic;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.INFIXED__BIC, oldBic, newBic);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBic(BindingL_Infixed_Collection newBic)
  {
    if (newBic != bic)
    {
      NotificationChain msgs = null;
      if (bic != null)
        msgs = ((InternalEObject)bic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.INFIXED__BIC, null, msgs);
      if (newBic != null)
        msgs = ((InternalEObject)newBic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.INFIXED__BIC, null, msgs);
      msgs = basicSetBic(newBic, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.INFIXED__BIC, newBic, newBic));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InfixedExpr getIfx()
  {
    return ifx;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIfx(InfixedExpr newIfx, NotificationChain msgs)
  {
    InfixedExpr oldIfx = ifx;
    ifx = newIfx;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.INFIXED__IFX, oldIfx, newIfx);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIfx(InfixedExpr newIfx)
  {
    if (newIfx != ifx)
    {
      NotificationChain msgs = null;
      if (ifx != null)
        msgs = ((InternalEObject)ifx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.INFIXED__IFX, null, msgs);
      if (newIfx != null)
        msgs = ((InternalEObject)newIfx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.INFIXED__IFX, null, msgs);
      msgs = basicSetIfx(newIfx, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.INFIXED__IFX, newIfx, newIfx));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DeclPart> getDp()
  {
    if (dp == null)
    {
      dp = new EObjectContainmentEList<DeclPart>(DeclPart.class, this, EditorPackage.INFIXED__DP);
    }
    return dp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Block getB()
  {
    return b;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetB(Block newB, NotificationChain msgs)
  {
    Block oldB = b;
    b = newB;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.INFIXED__B, oldB, newB);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setB(Block newB)
  {
    if (newB != b)
    {
      NotificationChain msgs = null;
      if (b != null)
        msgs = ((InternalEObject)b).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.INFIXED__B, null, msgs);
      if (newB != null)
        msgs = ((InternalEObject)newB).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.INFIXED__B, null, msgs);
      msgs = basicSetB(newB, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.INFIXED__B, newB, newB));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Infixed> getI2()
  {
    if (i2 == null)
    {
      i2 = new EObjectContainmentEList<Infixed>(Infixed.class, this, EditorPackage.INFIXED__I2);
    }
    return i2;
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
      case EditorPackage.INFIXED__CI2:
        return basicSetCi2(null, msgs);
      case EditorPackage.INFIXED__BBS4:
        return ((InternalEList<?>)getBbs4()).basicRemove(otherEnd, msgs);
      case EditorPackage.INFIXED__BBS5:
        return basicSetBbs5(null, msgs);
      case EditorPackage.INFIXED__BBS2:
        return basicSetBbs2(null, msgs);
      case EditorPackage.INFIXED__BE:
        return basicSetBe(null, msgs);
      case EditorPackage.INFIXED__APB:
        return basicSetApb(null, msgs);
      case EditorPackage.INFIXED__CA2:
        return basicSetCa2(null, msgs);
      case EditorPackage.INFIXED__GB2:
        return basicSetGb2(null, msgs);
      case EditorPackage.INFIXED__N2:
        return basicSetN2(null, msgs);
      case EditorPackage.INFIXED__C2:
        return basicSetC2(null, msgs);
      case EditorPackage.INFIXED__I3:
        return basicSetI3(null, msgs);
      case EditorPackage.INFIXED__BBS3:
        return basicSetBbs3(null, msgs);
      case EditorPackage.INFIXED__I:
        return basicSetI(null, msgs);
      case EditorPackage.INFIXED__SP:
        return basicSetSp(null, msgs);
      case EditorPackage.INFIXED__BIB:
        return basicSetBib(null, msgs);
      case EditorPackage.INFIXED__BIC:
        return basicSetBic(null, msgs);
      case EditorPackage.INFIXED__IFX:
        return basicSetIfx(null, msgs);
      case EditorPackage.INFIXED__DP:
        return ((InternalEList<?>)getDp()).basicRemove(otherEnd, msgs);
      case EditorPackage.INFIXED__B:
        return basicSetB(null, msgs);
      case EditorPackage.INFIXED__I2:
        return ((InternalEList<?>)getI2()).basicRemove(otherEnd, msgs);
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
      case EditorPackage.INFIXED__ST2:
        return getSt2();
      case EditorPackage.INFIXED__CI2:
        return getCi2();
      case EditorPackage.INFIXED__BBS4:
        return getBbs4();
      case EditorPackage.INFIXED__BBS5:
        return getBbs5();
      case EditorPackage.INFIXED__BBS2:
        return getBbs2();
      case EditorPackage.INFIXED__BE:
        return getBe();
      case EditorPackage.INFIXED__APB:
        return getApb();
      case EditorPackage.INFIXED__CA2:
        return getCa2();
      case EditorPackage.INFIXED__GB2:
        return getGb2();
      case EditorPackage.INFIXED__N2:
        return getN2();
      case EditorPackage.INFIXED__C2:
        return getC2();
      case EditorPackage.INFIXED__I3:
        return getI3();
      case EditorPackage.INFIXED__BBS3:
        return getBbs3();
      case EditorPackage.INFIXED__I:
        return getI();
      case EditorPackage.INFIXED__SP:
        return getSp();
      case EditorPackage.INFIXED__BIB:
        return getBib();
      case EditorPackage.INFIXED__BIC:
        return getBic();
      case EditorPackage.INFIXED__IFX:
        return getIfx();
      case EditorPackage.INFIXED__DP:
        return getDp();
      case EditorPackage.INFIXED__B:
        return getB();
      case EditorPackage.INFIXED__I2:
        return getI2();
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
      case EditorPackage.INFIXED__ST2:
        setSt2((String)newValue);
        return;
      case EditorPackage.INFIXED__CI2:
        setCi2((CommaItem)newValue);
        return;
      case EditorPackage.INFIXED__BBS4:
        getBbs4().clear();
        getBbs4().addAll((java.util.Collection<? extends Binding_BalStatement>)newValue);
        return;
      case EditorPackage.INFIXED__BBS5:
        setBbs5((Binding_BalStatement)newValue);
        return;
      case EditorPackage.INFIXED__BBS2:
        setBbs2((Binding_AnyStatement)newValue);
        return;
      case EditorPackage.INFIXED__BE:
        setBe((ButExpr)newValue);
        return;
      case EditorPackage.INFIXED__APB:
        setApb((AlwaysPart_BalStatement)newValue);
        return;
      case EditorPackage.INFIXED__CA2:
        setCa2((Cases)newValue);
        return;
      case EditorPackage.INFIXED__GB2:
        setGb2((GenBound)newValue);
        return;
      case EditorPackage.INFIXED__N2:
        setN2((Name)newValue);
        return;
      case EditorPackage.INFIXED__C2:
        setC2((Collection)newValue);
        return;
      case EditorPackage.INFIXED__I3:
        setI3((EObject)newValue);
        return;
      case EditorPackage.INFIXED__BBS3:
        setBbs3((Binding_BalStatement)newValue);
        return;
      case EditorPackage.INFIXED__I:
        setI((Infixed)newValue);
        return;
      case EditorPackage.INFIXED__SP:
        setSp((SuchthatPart)newValue);
        return;
      case EditorPackage.INFIXED__BIB:
        setBib((BindingL_Infixed_BalStatement)newValue);
        return;
      case EditorPackage.INFIXED__BIC:
        setBic((BindingL_Infixed_Collection)newValue);
        return;
      case EditorPackage.INFIXED__IFX:
        setIfx((InfixedExpr)newValue);
        return;
      case EditorPackage.INFIXED__DP:
        getDp().clear();
        getDp().addAll((java.util.Collection<? extends DeclPart>)newValue);
        return;
      case EditorPackage.INFIXED__B:
        setB((Block)newValue);
        return;
      case EditorPackage.INFIXED__I2:
        getI2().clear();
        getI2().addAll((java.util.Collection<? extends Infixed>)newValue);
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
      case EditorPackage.INFIXED__ST2:
        setSt2(ST2_EDEFAULT);
        return;
      case EditorPackage.INFIXED__CI2:
        setCi2((CommaItem)null);
        return;
      case EditorPackage.INFIXED__BBS4:
        getBbs4().clear();
        return;
      case EditorPackage.INFIXED__BBS5:
        setBbs5((Binding_BalStatement)null);
        return;
      case EditorPackage.INFIXED__BBS2:
        setBbs2((Binding_AnyStatement)null);
        return;
      case EditorPackage.INFIXED__BE:
        setBe((ButExpr)null);
        return;
      case EditorPackage.INFIXED__APB:
        setApb((AlwaysPart_BalStatement)null);
        return;
      case EditorPackage.INFIXED__CA2:
        setCa2((Cases)null);
        return;
      case EditorPackage.INFIXED__GB2:
        setGb2((GenBound)null);
        return;
      case EditorPackage.INFIXED__N2:
        setN2((Name)null);
        return;
      case EditorPackage.INFIXED__C2:
        setC2((Collection)null);
        return;
      case EditorPackage.INFIXED__I3:
        setI3((EObject)null);
        return;
      case EditorPackage.INFIXED__BBS3:
        setBbs3((Binding_BalStatement)null);
        return;
      case EditorPackage.INFIXED__I:
        setI((Infixed)null);
        return;
      case EditorPackage.INFIXED__SP:
        setSp((SuchthatPart)null);
        return;
      case EditorPackage.INFIXED__BIB:
        setBib((BindingL_Infixed_BalStatement)null);
        return;
      case EditorPackage.INFIXED__BIC:
        setBic((BindingL_Infixed_Collection)null);
        return;
      case EditorPackage.INFIXED__IFX:
        setIfx((InfixedExpr)null);
        return;
      case EditorPackage.INFIXED__DP:
        getDp().clear();
        return;
      case EditorPackage.INFIXED__B:
        setB((Block)null);
        return;
      case EditorPackage.INFIXED__I2:
        getI2().clear();
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
      case EditorPackage.INFIXED__ST2:
        return ST2_EDEFAULT == null ? st2 != null : !ST2_EDEFAULT.equals(st2);
      case EditorPackage.INFIXED__CI2:
        return ci2 != null;
      case EditorPackage.INFIXED__BBS4:
        return bbs4 != null && !bbs4.isEmpty();
      case EditorPackage.INFIXED__BBS5:
        return bbs5 != null;
      case EditorPackage.INFIXED__BBS2:
        return bbs2 != null;
      case EditorPackage.INFIXED__BE:
        return be != null;
      case EditorPackage.INFIXED__APB:
        return apb != null;
      case EditorPackage.INFIXED__CA2:
        return ca2 != null;
      case EditorPackage.INFIXED__GB2:
        return gb2 != null;
      case EditorPackage.INFIXED__N2:
        return n2 != null;
      case EditorPackage.INFIXED__C2:
        return c2 != null;
      case EditorPackage.INFIXED__I3:
        return i3 != null;
      case EditorPackage.INFIXED__BBS3:
        return bbs3 != null;
      case EditorPackage.INFIXED__I:
        return i != null;
      case EditorPackage.INFIXED__SP:
        return sp != null;
      case EditorPackage.INFIXED__BIB:
        return bib != null;
      case EditorPackage.INFIXED__BIC:
        return bic != null;
      case EditorPackage.INFIXED__IFX:
        return ifx != null;
      case EditorPackage.INFIXED__DP:
        return dp != null && !dp.isEmpty();
      case EditorPackage.INFIXED__B:
        return b != null;
      case EditorPackage.INFIXED__I2:
        return i2 != null && !i2.isEmpty();
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
    if (baseClass == Binding_BalStatement.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == BindingL_Infixed_BalStatement.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Cases.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Binding_Collection.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == BindingL_Infixed_Collection.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
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
        case EditorPackage.INFIXED__ST2: return EditorPackage.FLOW_BAL_STATEMENT__ST2;
        case EditorPackage.INFIXED__CI2: return EditorPackage.FLOW_BAL_STATEMENT__CI2;
        case EditorPackage.INFIXED__BBS4: return EditorPackage.FLOW_BAL_STATEMENT__BBS4;
        case EditorPackage.INFIXED__BBS5: return EditorPackage.FLOW_BAL_STATEMENT__BBS5;
        case EditorPackage.INFIXED__BBS2: return EditorPackage.FLOW_BAL_STATEMENT__BBS2;
        case EditorPackage.INFIXED__BE: return EditorPackage.FLOW_BAL_STATEMENT__BE;
        case EditorPackage.INFIXED__APB: return EditorPackage.FLOW_BAL_STATEMENT__APB;
        case EditorPackage.INFIXED__CA2: return EditorPackage.FLOW_BAL_STATEMENT__CA2;
        case EditorPackage.INFIXED__GB2: return EditorPackage.FLOW_BAL_STATEMENT__GB2;
        case EditorPackage.INFIXED__N2: return EditorPackage.FLOW_BAL_STATEMENT__N2;
        case EditorPackage.INFIXED__C2: return EditorPackage.FLOW_BAL_STATEMENT__C2;
        case EditorPackage.INFIXED__I3: return EditorPackage.FLOW_BAL_STATEMENT__I3;
        case EditorPackage.INFIXED__BBS3: return EditorPackage.FLOW_BAL_STATEMENT__BBS3;
        default: return -1;
      }
    }
    if (baseClass == Collection.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Iterator.class)
    {
      switch (derivedFeatureID)
      {
        case EditorPackage.INFIXED__I: return EditorPackage.ITERATOR__I;
        default: return -1;
      }
    }
    if (baseClass == ForLhs.class)
    {
      switch (derivedFeatureID)
      {
        case EditorPackage.INFIXED__SP: return EditorPackage.FOR_LHS__SP;
        default: return -1;
      }
    }
    if (baseClass == SuchthatPart.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == FromPart.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == enlist1_Infixed_Comma_AB.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == enlister1_Infixed_Comma.class)
    {
      switch (derivedFeatureID)
      {
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
    if (baseClass == Binding_BalStatement.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == BindingL_Infixed_BalStatement.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Cases.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Binding_Collection.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == BindingL_Infixed_Collection.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
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
        case EditorPackage.FLOW_BAL_STATEMENT__ST2: return EditorPackage.INFIXED__ST2;
        case EditorPackage.FLOW_BAL_STATEMENT__CI2: return EditorPackage.INFIXED__CI2;
        case EditorPackage.FLOW_BAL_STATEMENT__BBS4: return EditorPackage.INFIXED__BBS4;
        case EditorPackage.FLOW_BAL_STATEMENT__BBS5: return EditorPackage.INFIXED__BBS5;
        case EditorPackage.FLOW_BAL_STATEMENT__BBS2: return EditorPackage.INFIXED__BBS2;
        case EditorPackage.FLOW_BAL_STATEMENT__BE: return EditorPackage.INFIXED__BE;
        case EditorPackage.FLOW_BAL_STATEMENT__APB: return EditorPackage.INFIXED__APB;
        case EditorPackage.FLOW_BAL_STATEMENT__CA2: return EditorPackage.INFIXED__CA2;
        case EditorPackage.FLOW_BAL_STATEMENT__GB2: return EditorPackage.INFIXED__GB2;
        case EditorPackage.FLOW_BAL_STATEMENT__N2: return EditorPackage.INFIXED__N2;
        case EditorPackage.FLOW_BAL_STATEMENT__C2: return EditorPackage.INFIXED__C2;
        case EditorPackage.FLOW_BAL_STATEMENT__I3: return EditorPackage.INFIXED__I3;
        case EditorPackage.FLOW_BAL_STATEMENT__BBS3: return EditorPackage.INFIXED__BBS3;
        default: return -1;
      }
    }
    if (baseClass == Collection.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Iterator.class)
    {
      switch (baseFeatureID)
      {
        case EditorPackage.ITERATOR__I: return EditorPackage.INFIXED__I;
        default: return -1;
      }
    }
    if (baseClass == ForLhs.class)
    {
      switch (baseFeatureID)
      {
        case EditorPackage.FOR_LHS__SP: return EditorPackage.INFIXED__SP;
        default: return -1;
      }
    }
    if (baseClass == SuchthatPart.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == FromPart.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == enlist1_Infixed_Comma_AB.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == enlister1_Infixed_Comma.class)
    {
      switch (baseFeatureID)
      {
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
    result.append(')');
    return result.toString();
  }

} //InfixedImpl
