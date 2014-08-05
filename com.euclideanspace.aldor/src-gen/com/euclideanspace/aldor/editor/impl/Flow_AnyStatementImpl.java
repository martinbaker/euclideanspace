/**
 */
package com.euclideanspace.aldor.editor.impl;

import com.euclideanspace.aldor.editor.AlwaysPart_AnyStatement;
import com.euclideanspace.aldor.editor.Binding_AnyStatement;
import com.euclideanspace.aldor.editor.Binding_BalStatement;
import com.euclideanspace.aldor.editor.ButExpr;
import com.euclideanspace.aldor.editor.Cases;
import com.euclideanspace.aldor.editor.Collection;
import com.euclideanspace.aldor.editor.CommaItem;
import com.euclideanspace.aldor.editor.EditorPackage;
import com.euclideanspace.aldor.editor.Flow_AnyStatement;
import com.euclideanspace.aldor.editor.GenBound;
import com.euclideanspace.aldor.editor.Id;
import com.euclideanspace.aldor.editor.Name;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow Any Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.Flow_AnyStatementImpl#getC <em>C</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.Flow_AnyStatementImpl#getSt <em>St</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.Flow_AnyStatementImpl#getBas2 <em>Bas2</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.Flow_AnyStatementImpl#getCi <em>Ci</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.Flow_AnyStatementImpl#getBbs <em>Bbs</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.Flow_AnyStatementImpl#getBe2 <em>Be2</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.Flow_AnyStatementImpl#getApa <em>Apa</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.Flow_AnyStatementImpl#getCa <em>Ca</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.Flow_AnyStatementImpl#getGb <em>Gb</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.Flow_AnyStatementImpl#getBas4 <em>Bas4</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.Flow_AnyStatementImpl#getN <em>N</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.Flow_AnyStatementImpl#getI2 <em>I2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Flow_AnyStatementImpl extends AnyStatementImpl implements Flow_AnyStatement
{
  /**
   * The cached value of the '{@link #getC() <em>C</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getC()
   * @generated
   * @ordered
   */
  protected Collection c;

  /**
   * The default value of the '{@link #getSt() <em>St</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSt()
   * @generated
   * @ordered
   */
  protected static final String ST_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSt() <em>St</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSt()
   * @generated
   * @ordered
   */
  protected String st = ST_EDEFAULT;

  /**
   * The cached value of the '{@link #getBas2() <em>Bas2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBas2()
   * @generated
   * @ordered
   */
  protected Binding_AnyStatement bas2;

  /**
   * The cached value of the '{@link #getCi() <em>Ci</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCi()
   * @generated
   * @ordered
   */
  protected CommaItem ci;

  /**
   * The cached value of the '{@link #getBbs() <em>Bbs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBbs()
   * @generated
   * @ordered
   */
  protected Binding_BalStatement bbs;

  /**
   * The cached value of the '{@link #getBe2() <em>Be2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBe2()
   * @generated
   * @ordered
   */
  protected ButExpr be2;

  /**
   * The cached value of the '{@link #getApa() <em>Apa</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getApa()
   * @generated
   * @ordered
   */
  protected AlwaysPart_AnyStatement apa;

  /**
   * The cached value of the '{@link #getCa() <em>Ca</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCa()
   * @generated
   * @ordered
   */
  protected Cases ca;

  /**
   * The cached value of the '{@link #getGb() <em>Gb</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGb()
   * @generated
   * @ordered
   */
  protected GenBound gb;

  /**
   * The cached value of the '{@link #getBas4() <em>Bas4</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBas4()
   * @generated
   * @ordered
   */
  protected Binding_AnyStatement bas4;

  /**
   * The cached value of the '{@link #getN() <em>N</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getN()
   * @generated
   * @ordered
   */
  protected Name n;

  /**
   * The cached value of the '{@link #getI2() <em>I2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getI2()
   * @generated
   * @ordered
   */
  protected Id i2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Flow_AnyStatementImpl()
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
    return EditorPackage.Literals.FLOW_ANY_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Collection getC()
  {
    return c;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetC(Collection newC, NotificationChain msgs)
  {
    Collection oldC = c;
    c = newC;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.FLOW_ANY_STATEMENT__C, oldC, newC);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setC(Collection newC)
  {
    if (newC != c)
    {
      NotificationChain msgs = null;
      if (c != null)
        msgs = ((InternalEObject)c).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.FLOW_ANY_STATEMENT__C, null, msgs);
      if (newC != null)
        msgs = ((InternalEObject)newC).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.FLOW_ANY_STATEMENT__C, null, msgs);
      msgs = basicSetC(newC, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.FLOW_ANY_STATEMENT__C, newC, newC));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSt()
  {
    return st;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSt(String newSt)
  {
    String oldSt = st;
    st = newSt;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.FLOW_ANY_STATEMENT__ST, oldSt, st));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Binding_AnyStatement getBas2()
  {
    return bas2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBas2(Binding_AnyStatement newBas2, NotificationChain msgs)
  {
    Binding_AnyStatement oldBas2 = bas2;
    bas2 = newBas2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.FLOW_ANY_STATEMENT__BAS2, oldBas2, newBas2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBas2(Binding_AnyStatement newBas2)
  {
    if (newBas2 != bas2)
    {
      NotificationChain msgs = null;
      if (bas2 != null)
        msgs = ((InternalEObject)bas2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.FLOW_ANY_STATEMENT__BAS2, null, msgs);
      if (newBas2 != null)
        msgs = ((InternalEObject)newBas2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.FLOW_ANY_STATEMENT__BAS2, null, msgs);
      msgs = basicSetBas2(newBas2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.FLOW_ANY_STATEMENT__BAS2, newBas2, newBas2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CommaItem getCi()
  {
    return ci;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCi(CommaItem newCi, NotificationChain msgs)
  {
    CommaItem oldCi = ci;
    ci = newCi;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.FLOW_ANY_STATEMENT__CI, oldCi, newCi);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCi(CommaItem newCi)
  {
    if (newCi != ci)
    {
      NotificationChain msgs = null;
      if (ci != null)
        msgs = ((InternalEObject)ci).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.FLOW_ANY_STATEMENT__CI, null, msgs);
      if (newCi != null)
        msgs = ((InternalEObject)newCi).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.FLOW_ANY_STATEMENT__CI, null, msgs);
      msgs = basicSetCi(newCi, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.FLOW_ANY_STATEMENT__CI, newCi, newCi));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Binding_BalStatement getBbs()
  {
    return bbs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBbs(Binding_BalStatement newBbs, NotificationChain msgs)
  {
    Binding_BalStatement oldBbs = bbs;
    bbs = newBbs;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.FLOW_ANY_STATEMENT__BBS, oldBbs, newBbs);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBbs(Binding_BalStatement newBbs)
  {
    if (newBbs != bbs)
    {
      NotificationChain msgs = null;
      if (bbs != null)
        msgs = ((InternalEObject)bbs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.FLOW_ANY_STATEMENT__BBS, null, msgs);
      if (newBbs != null)
        msgs = ((InternalEObject)newBbs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.FLOW_ANY_STATEMENT__BBS, null, msgs);
      msgs = basicSetBbs(newBbs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.FLOW_ANY_STATEMENT__BBS, newBbs, newBbs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ButExpr getBe2()
  {
    return be2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBe2(ButExpr newBe2, NotificationChain msgs)
  {
    ButExpr oldBe2 = be2;
    be2 = newBe2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.FLOW_ANY_STATEMENT__BE2, oldBe2, newBe2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBe2(ButExpr newBe2)
  {
    if (newBe2 != be2)
    {
      NotificationChain msgs = null;
      if (be2 != null)
        msgs = ((InternalEObject)be2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.FLOW_ANY_STATEMENT__BE2, null, msgs);
      if (newBe2 != null)
        msgs = ((InternalEObject)newBe2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.FLOW_ANY_STATEMENT__BE2, null, msgs);
      msgs = basicSetBe2(newBe2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.FLOW_ANY_STATEMENT__BE2, newBe2, newBe2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AlwaysPart_AnyStatement getApa()
  {
    return apa;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetApa(AlwaysPart_AnyStatement newApa, NotificationChain msgs)
  {
    AlwaysPart_AnyStatement oldApa = apa;
    apa = newApa;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.FLOW_ANY_STATEMENT__APA, oldApa, newApa);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setApa(AlwaysPart_AnyStatement newApa)
  {
    if (newApa != apa)
    {
      NotificationChain msgs = null;
      if (apa != null)
        msgs = ((InternalEObject)apa).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.FLOW_ANY_STATEMENT__APA, null, msgs);
      if (newApa != null)
        msgs = ((InternalEObject)newApa).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.FLOW_ANY_STATEMENT__APA, null, msgs);
      msgs = basicSetApa(newApa, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.FLOW_ANY_STATEMENT__APA, newApa, newApa));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Cases getCa()
  {
    return ca;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCa(Cases newCa, NotificationChain msgs)
  {
    Cases oldCa = ca;
    ca = newCa;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.FLOW_ANY_STATEMENT__CA, oldCa, newCa);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCa(Cases newCa)
  {
    if (newCa != ca)
    {
      NotificationChain msgs = null;
      if (ca != null)
        msgs = ((InternalEObject)ca).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.FLOW_ANY_STATEMENT__CA, null, msgs);
      if (newCa != null)
        msgs = ((InternalEObject)newCa).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.FLOW_ANY_STATEMENT__CA, null, msgs);
      msgs = basicSetCa(newCa, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.FLOW_ANY_STATEMENT__CA, newCa, newCa));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GenBound getGb()
  {
    return gb;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGb(GenBound newGb, NotificationChain msgs)
  {
    GenBound oldGb = gb;
    gb = newGb;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.FLOW_ANY_STATEMENT__GB, oldGb, newGb);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGb(GenBound newGb)
  {
    if (newGb != gb)
    {
      NotificationChain msgs = null;
      if (gb != null)
        msgs = ((InternalEObject)gb).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.FLOW_ANY_STATEMENT__GB, null, msgs);
      if (newGb != null)
        msgs = ((InternalEObject)newGb).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.FLOW_ANY_STATEMENT__GB, null, msgs);
      msgs = basicSetGb(newGb, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.FLOW_ANY_STATEMENT__GB, newGb, newGb));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Binding_AnyStatement getBas4()
  {
    return bas4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBas4(Binding_AnyStatement newBas4, NotificationChain msgs)
  {
    Binding_AnyStatement oldBas4 = bas4;
    bas4 = newBas4;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.FLOW_ANY_STATEMENT__BAS4, oldBas4, newBas4);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBas4(Binding_AnyStatement newBas4)
  {
    if (newBas4 != bas4)
    {
      NotificationChain msgs = null;
      if (bas4 != null)
        msgs = ((InternalEObject)bas4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.FLOW_ANY_STATEMENT__BAS4, null, msgs);
      if (newBas4 != null)
        msgs = ((InternalEObject)newBas4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.FLOW_ANY_STATEMENT__BAS4, null, msgs);
      msgs = basicSetBas4(newBas4, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.FLOW_ANY_STATEMENT__BAS4, newBas4, newBas4));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Name getN()
  {
    return n;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetN(Name newN, NotificationChain msgs)
  {
    Name oldN = n;
    n = newN;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.FLOW_ANY_STATEMENT__N, oldN, newN);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setN(Name newN)
  {
    if (newN != n)
    {
      NotificationChain msgs = null;
      if (n != null)
        msgs = ((InternalEObject)n).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.FLOW_ANY_STATEMENT__N, null, msgs);
      if (newN != null)
        msgs = ((InternalEObject)newN).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.FLOW_ANY_STATEMENT__N, null, msgs);
      msgs = basicSetN(newN, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.FLOW_ANY_STATEMENT__N, newN, newN));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Id getI2()
  {
    return i2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetI2(Id newI2, NotificationChain msgs)
  {
    Id oldI2 = i2;
    i2 = newI2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.FLOW_ANY_STATEMENT__I2, oldI2, newI2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setI2(Id newI2)
  {
    if (newI2 != i2)
    {
      NotificationChain msgs = null;
      if (i2 != null)
        msgs = ((InternalEObject)i2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.FLOW_ANY_STATEMENT__I2, null, msgs);
      if (newI2 != null)
        msgs = ((InternalEObject)newI2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.FLOW_ANY_STATEMENT__I2, null, msgs);
      msgs = basicSetI2(newI2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.FLOW_ANY_STATEMENT__I2, newI2, newI2));
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
      case EditorPackage.FLOW_ANY_STATEMENT__C:
        return basicSetC(null, msgs);
      case EditorPackage.FLOW_ANY_STATEMENT__BAS2:
        return basicSetBas2(null, msgs);
      case EditorPackage.FLOW_ANY_STATEMENT__CI:
        return basicSetCi(null, msgs);
      case EditorPackage.FLOW_ANY_STATEMENT__BBS:
        return basicSetBbs(null, msgs);
      case EditorPackage.FLOW_ANY_STATEMENT__BE2:
        return basicSetBe2(null, msgs);
      case EditorPackage.FLOW_ANY_STATEMENT__APA:
        return basicSetApa(null, msgs);
      case EditorPackage.FLOW_ANY_STATEMENT__CA:
        return basicSetCa(null, msgs);
      case EditorPackage.FLOW_ANY_STATEMENT__GB:
        return basicSetGb(null, msgs);
      case EditorPackage.FLOW_ANY_STATEMENT__BAS4:
        return basicSetBas4(null, msgs);
      case EditorPackage.FLOW_ANY_STATEMENT__N:
        return basicSetN(null, msgs);
      case EditorPackage.FLOW_ANY_STATEMENT__I2:
        return basicSetI2(null, msgs);
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
      case EditorPackage.FLOW_ANY_STATEMENT__C:
        return getC();
      case EditorPackage.FLOW_ANY_STATEMENT__ST:
        return getSt();
      case EditorPackage.FLOW_ANY_STATEMENT__BAS2:
        return getBas2();
      case EditorPackage.FLOW_ANY_STATEMENT__CI:
        return getCi();
      case EditorPackage.FLOW_ANY_STATEMENT__BBS:
        return getBbs();
      case EditorPackage.FLOW_ANY_STATEMENT__BE2:
        return getBe2();
      case EditorPackage.FLOW_ANY_STATEMENT__APA:
        return getApa();
      case EditorPackage.FLOW_ANY_STATEMENT__CA:
        return getCa();
      case EditorPackage.FLOW_ANY_STATEMENT__GB:
        return getGb();
      case EditorPackage.FLOW_ANY_STATEMENT__BAS4:
        return getBas4();
      case EditorPackage.FLOW_ANY_STATEMENT__N:
        return getN();
      case EditorPackage.FLOW_ANY_STATEMENT__I2:
        return getI2();
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
      case EditorPackage.FLOW_ANY_STATEMENT__C:
        setC((Collection)newValue);
        return;
      case EditorPackage.FLOW_ANY_STATEMENT__ST:
        setSt((String)newValue);
        return;
      case EditorPackage.FLOW_ANY_STATEMENT__BAS2:
        setBas2((Binding_AnyStatement)newValue);
        return;
      case EditorPackage.FLOW_ANY_STATEMENT__CI:
        setCi((CommaItem)newValue);
        return;
      case EditorPackage.FLOW_ANY_STATEMENT__BBS:
        setBbs((Binding_BalStatement)newValue);
        return;
      case EditorPackage.FLOW_ANY_STATEMENT__BE2:
        setBe2((ButExpr)newValue);
        return;
      case EditorPackage.FLOW_ANY_STATEMENT__APA:
        setApa((AlwaysPart_AnyStatement)newValue);
        return;
      case EditorPackage.FLOW_ANY_STATEMENT__CA:
        setCa((Cases)newValue);
        return;
      case EditorPackage.FLOW_ANY_STATEMENT__GB:
        setGb((GenBound)newValue);
        return;
      case EditorPackage.FLOW_ANY_STATEMENT__BAS4:
        setBas4((Binding_AnyStatement)newValue);
        return;
      case EditorPackage.FLOW_ANY_STATEMENT__N:
        setN((Name)newValue);
        return;
      case EditorPackage.FLOW_ANY_STATEMENT__I2:
        setI2((Id)newValue);
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
      case EditorPackage.FLOW_ANY_STATEMENT__C:
        setC((Collection)null);
        return;
      case EditorPackage.FLOW_ANY_STATEMENT__ST:
        setSt(ST_EDEFAULT);
        return;
      case EditorPackage.FLOW_ANY_STATEMENT__BAS2:
        setBas2((Binding_AnyStatement)null);
        return;
      case EditorPackage.FLOW_ANY_STATEMENT__CI:
        setCi((CommaItem)null);
        return;
      case EditorPackage.FLOW_ANY_STATEMENT__BBS:
        setBbs((Binding_BalStatement)null);
        return;
      case EditorPackage.FLOW_ANY_STATEMENT__BE2:
        setBe2((ButExpr)null);
        return;
      case EditorPackage.FLOW_ANY_STATEMENT__APA:
        setApa((AlwaysPart_AnyStatement)null);
        return;
      case EditorPackage.FLOW_ANY_STATEMENT__CA:
        setCa((Cases)null);
        return;
      case EditorPackage.FLOW_ANY_STATEMENT__GB:
        setGb((GenBound)null);
        return;
      case EditorPackage.FLOW_ANY_STATEMENT__BAS4:
        setBas4((Binding_AnyStatement)null);
        return;
      case EditorPackage.FLOW_ANY_STATEMENT__N:
        setN((Name)null);
        return;
      case EditorPackage.FLOW_ANY_STATEMENT__I2:
        setI2((Id)null);
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
      case EditorPackage.FLOW_ANY_STATEMENT__C:
        return c != null;
      case EditorPackage.FLOW_ANY_STATEMENT__ST:
        return ST_EDEFAULT == null ? st != null : !ST_EDEFAULT.equals(st);
      case EditorPackage.FLOW_ANY_STATEMENT__BAS2:
        return bas2 != null;
      case EditorPackage.FLOW_ANY_STATEMENT__CI:
        return ci != null;
      case EditorPackage.FLOW_ANY_STATEMENT__BBS:
        return bbs != null;
      case EditorPackage.FLOW_ANY_STATEMENT__BE2:
        return be2 != null;
      case EditorPackage.FLOW_ANY_STATEMENT__APA:
        return apa != null;
      case EditorPackage.FLOW_ANY_STATEMENT__CA:
        return ca != null;
      case EditorPackage.FLOW_ANY_STATEMENT__GB:
        return gb != null;
      case EditorPackage.FLOW_ANY_STATEMENT__BAS4:
        return bas4 != null;
      case EditorPackage.FLOW_ANY_STATEMENT__N:
        return n != null;
      case EditorPackage.FLOW_ANY_STATEMENT__I2:
        return i2 != null;
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
    result.append(" (st: ");
    result.append(st);
    result.append(')');
    return result.toString();
  }

} //Flow_AnyStatementImpl
