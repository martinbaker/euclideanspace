/**
 */
package com.euclideanspace.aldor.editor.impl;

import com.euclideanspace.aldor.editor.Block;
import com.euclideanspace.aldor.editor.BreakStatement;
import com.euclideanspace.aldor.editor.DoStatement;
import com.euclideanspace.aldor.editor.EditorPackage;
import com.euclideanspace.aldor.editor.Expr;
import com.euclideanspace.aldor.editor.ForStatement;
import com.euclideanspace.aldor.editor.IfElseStatement;
import com.euclideanspace.aldor.editor.IfStatement;
import com.euclideanspace.aldor.editor.IterateStatement;
import com.euclideanspace.aldor.editor.RepeatStatement;
import com.euclideanspace.aldor.editor.ReturnStatement;
import com.euclideanspace.aldor.editor.Statement;
import com.euclideanspace.aldor.editor.StatementExpression;
import com.euclideanspace.aldor.editor.WhileStatement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.StatementImpl#getS1 <em>S1</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.StatementImpl#getS3 <em>S3</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.StatementImpl#getS4 <em>S4</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.StatementImpl#getS4b <em>S4b</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.StatementImpl#getS5 <em>S5</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.StatementImpl#getS6 <em>S6</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.StatementImpl#getS7 <em>S7</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.StatementImpl#getS8 <em>S8</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.StatementImpl#getS12 <em>S12</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.StatementImpl#getS9 <em>S9</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.StatementImpl#getS10 <em>S10</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.StatementImpl#getE <em>E</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StatementImpl extends MinimalEObjectImpl.Container implements Statement
{
  /**
   * The cached value of the '{@link #getS1() <em>S1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getS1()
   * @generated
   * @ordered
   */
  protected Block s1;

  /**
   * The cached value of the '{@link #getS3() <em>S3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getS3()
   * @generated
   * @ordered
   */
  protected StatementExpression s3;

  /**
   * The cached value of the '{@link #getS4() <em>S4</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getS4()
   * @generated
   * @ordered
   */
  protected IfStatement s4;

  /**
   * The cached value of the '{@link #getS4b() <em>S4b</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getS4b()
   * @generated
   * @ordered
   */
  protected IfElseStatement s4b;

  /**
   * The cached value of the '{@link #getS5() <em>S5</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getS5()
   * @generated
   * @ordered
   */
  protected WhileStatement s5;

  /**
   * The cached value of the '{@link #getS6() <em>S6</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getS6()
   * @generated
   * @ordered
   */
  protected DoStatement s6;

  /**
   * The cached value of the '{@link #getS7() <em>S7</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getS7()
   * @generated
   * @ordered
   */
  protected ForStatement s7;

  /**
   * The cached value of the '{@link #getS8() <em>S8</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getS8()
   * @generated
   * @ordered
   */
  protected BreakStatement s8;

  /**
   * The cached value of the '{@link #getS12() <em>S12</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getS12()
   * @generated
   * @ordered
   */
  protected RepeatStatement s12;

  /**
   * The cached value of the '{@link #getS9() <em>S9</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getS9()
   * @generated
   * @ordered
   */
  protected IterateStatement s9;

  /**
   * The cached value of the '{@link #getS10() <em>S10</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getS10()
   * @generated
   * @ordered
   */
  protected ReturnStatement s10;

  /**
   * The cached value of the '{@link #getE() <em>E</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getE()
   * @generated
   * @ordered
   */
  protected Expr e;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StatementImpl()
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
    return EditorPackage.Literals.STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Block getS1()
  {
    return s1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetS1(Block newS1, NotificationChain msgs)
  {
    Block oldS1 = s1;
    s1 = newS1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.STATEMENT__S1, oldS1, newS1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setS1(Block newS1)
  {
    if (newS1 != s1)
    {
      NotificationChain msgs = null;
      if (s1 != null)
        msgs = ((InternalEObject)s1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.STATEMENT__S1, null, msgs);
      if (newS1 != null)
        msgs = ((InternalEObject)newS1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.STATEMENT__S1, null, msgs);
      msgs = basicSetS1(newS1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.STATEMENT__S1, newS1, newS1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StatementExpression getS3()
  {
    return s3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetS3(StatementExpression newS3, NotificationChain msgs)
  {
    StatementExpression oldS3 = s3;
    s3 = newS3;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.STATEMENT__S3, oldS3, newS3);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setS3(StatementExpression newS3)
  {
    if (newS3 != s3)
    {
      NotificationChain msgs = null;
      if (s3 != null)
        msgs = ((InternalEObject)s3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.STATEMENT__S3, null, msgs);
      if (newS3 != null)
        msgs = ((InternalEObject)newS3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.STATEMENT__S3, null, msgs);
      msgs = basicSetS3(newS3, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.STATEMENT__S3, newS3, newS3));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfStatement getS4()
  {
    return s4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetS4(IfStatement newS4, NotificationChain msgs)
  {
    IfStatement oldS4 = s4;
    s4 = newS4;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.STATEMENT__S4, oldS4, newS4);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setS4(IfStatement newS4)
  {
    if (newS4 != s4)
    {
      NotificationChain msgs = null;
      if (s4 != null)
        msgs = ((InternalEObject)s4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.STATEMENT__S4, null, msgs);
      if (newS4 != null)
        msgs = ((InternalEObject)newS4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.STATEMENT__S4, null, msgs);
      msgs = basicSetS4(newS4, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.STATEMENT__S4, newS4, newS4));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfElseStatement getS4b()
  {
    return s4b;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetS4b(IfElseStatement newS4b, NotificationChain msgs)
  {
    IfElseStatement oldS4b = s4b;
    s4b = newS4b;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.STATEMENT__S4B, oldS4b, newS4b);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setS4b(IfElseStatement newS4b)
  {
    if (newS4b != s4b)
    {
      NotificationChain msgs = null;
      if (s4b != null)
        msgs = ((InternalEObject)s4b).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.STATEMENT__S4B, null, msgs);
      if (newS4b != null)
        msgs = ((InternalEObject)newS4b).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.STATEMENT__S4B, null, msgs);
      msgs = basicSetS4b(newS4b, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.STATEMENT__S4B, newS4b, newS4b));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhileStatement getS5()
  {
    return s5;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetS5(WhileStatement newS5, NotificationChain msgs)
  {
    WhileStatement oldS5 = s5;
    s5 = newS5;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.STATEMENT__S5, oldS5, newS5);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setS5(WhileStatement newS5)
  {
    if (newS5 != s5)
    {
      NotificationChain msgs = null;
      if (s5 != null)
        msgs = ((InternalEObject)s5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.STATEMENT__S5, null, msgs);
      if (newS5 != null)
        msgs = ((InternalEObject)newS5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.STATEMENT__S5, null, msgs);
      msgs = basicSetS5(newS5, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.STATEMENT__S5, newS5, newS5));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DoStatement getS6()
  {
    return s6;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetS6(DoStatement newS6, NotificationChain msgs)
  {
    DoStatement oldS6 = s6;
    s6 = newS6;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.STATEMENT__S6, oldS6, newS6);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setS6(DoStatement newS6)
  {
    if (newS6 != s6)
    {
      NotificationChain msgs = null;
      if (s6 != null)
        msgs = ((InternalEObject)s6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.STATEMENT__S6, null, msgs);
      if (newS6 != null)
        msgs = ((InternalEObject)newS6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.STATEMENT__S6, null, msgs);
      msgs = basicSetS6(newS6, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.STATEMENT__S6, newS6, newS6));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForStatement getS7()
  {
    return s7;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetS7(ForStatement newS7, NotificationChain msgs)
  {
    ForStatement oldS7 = s7;
    s7 = newS7;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.STATEMENT__S7, oldS7, newS7);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setS7(ForStatement newS7)
  {
    if (newS7 != s7)
    {
      NotificationChain msgs = null;
      if (s7 != null)
        msgs = ((InternalEObject)s7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.STATEMENT__S7, null, msgs);
      if (newS7 != null)
        msgs = ((InternalEObject)newS7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.STATEMENT__S7, null, msgs);
      msgs = basicSetS7(newS7, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.STATEMENT__S7, newS7, newS7));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BreakStatement getS8()
  {
    return s8;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetS8(BreakStatement newS8, NotificationChain msgs)
  {
    BreakStatement oldS8 = s8;
    s8 = newS8;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.STATEMENT__S8, oldS8, newS8);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setS8(BreakStatement newS8)
  {
    if (newS8 != s8)
    {
      NotificationChain msgs = null;
      if (s8 != null)
        msgs = ((InternalEObject)s8).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.STATEMENT__S8, null, msgs);
      if (newS8 != null)
        msgs = ((InternalEObject)newS8).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.STATEMENT__S8, null, msgs);
      msgs = basicSetS8(newS8, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.STATEMENT__S8, newS8, newS8));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RepeatStatement getS12()
  {
    return s12;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetS12(RepeatStatement newS12, NotificationChain msgs)
  {
    RepeatStatement oldS12 = s12;
    s12 = newS12;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.STATEMENT__S12, oldS12, newS12);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setS12(RepeatStatement newS12)
  {
    if (newS12 != s12)
    {
      NotificationChain msgs = null;
      if (s12 != null)
        msgs = ((InternalEObject)s12).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.STATEMENT__S12, null, msgs);
      if (newS12 != null)
        msgs = ((InternalEObject)newS12).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.STATEMENT__S12, null, msgs);
      msgs = basicSetS12(newS12, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.STATEMENT__S12, newS12, newS12));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IterateStatement getS9()
  {
    return s9;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetS9(IterateStatement newS9, NotificationChain msgs)
  {
    IterateStatement oldS9 = s9;
    s9 = newS9;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.STATEMENT__S9, oldS9, newS9);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setS9(IterateStatement newS9)
  {
    if (newS9 != s9)
    {
      NotificationChain msgs = null;
      if (s9 != null)
        msgs = ((InternalEObject)s9).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.STATEMENT__S9, null, msgs);
      if (newS9 != null)
        msgs = ((InternalEObject)newS9).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.STATEMENT__S9, null, msgs);
      msgs = basicSetS9(newS9, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.STATEMENT__S9, newS9, newS9));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReturnStatement getS10()
  {
    return s10;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetS10(ReturnStatement newS10, NotificationChain msgs)
  {
    ReturnStatement oldS10 = s10;
    s10 = newS10;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.STATEMENT__S10, oldS10, newS10);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setS10(ReturnStatement newS10)
  {
    if (newS10 != s10)
    {
      NotificationChain msgs = null;
      if (s10 != null)
        msgs = ((InternalEObject)s10).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.STATEMENT__S10, null, msgs);
      if (newS10 != null)
        msgs = ((InternalEObject)newS10).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.STATEMENT__S10, null, msgs);
      msgs = basicSetS10(newS10, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.STATEMENT__S10, newS10, newS10));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getE()
  {
    return e;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetE(Expr newE, NotificationChain msgs)
  {
    Expr oldE = e;
    e = newE;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.STATEMENT__E, oldE, newE);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setE(Expr newE)
  {
    if (newE != e)
    {
      NotificationChain msgs = null;
      if (e != null)
        msgs = ((InternalEObject)e).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.STATEMENT__E, null, msgs);
      if (newE != null)
        msgs = ((InternalEObject)newE).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.STATEMENT__E, null, msgs);
      msgs = basicSetE(newE, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.STATEMENT__E, newE, newE));
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
      case EditorPackage.STATEMENT__S1:
        return basicSetS1(null, msgs);
      case EditorPackage.STATEMENT__S3:
        return basicSetS3(null, msgs);
      case EditorPackage.STATEMENT__S4:
        return basicSetS4(null, msgs);
      case EditorPackage.STATEMENT__S4B:
        return basicSetS4b(null, msgs);
      case EditorPackage.STATEMENT__S5:
        return basicSetS5(null, msgs);
      case EditorPackage.STATEMENT__S6:
        return basicSetS6(null, msgs);
      case EditorPackage.STATEMENT__S7:
        return basicSetS7(null, msgs);
      case EditorPackage.STATEMENT__S8:
        return basicSetS8(null, msgs);
      case EditorPackage.STATEMENT__S12:
        return basicSetS12(null, msgs);
      case EditorPackage.STATEMENT__S9:
        return basicSetS9(null, msgs);
      case EditorPackage.STATEMENT__S10:
        return basicSetS10(null, msgs);
      case EditorPackage.STATEMENT__E:
        return basicSetE(null, msgs);
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
      case EditorPackage.STATEMENT__S1:
        return getS1();
      case EditorPackage.STATEMENT__S3:
        return getS3();
      case EditorPackage.STATEMENT__S4:
        return getS4();
      case EditorPackage.STATEMENT__S4B:
        return getS4b();
      case EditorPackage.STATEMENT__S5:
        return getS5();
      case EditorPackage.STATEMENT__S6:
        return getS6();
      case EditorPackage.STATEMENT__S7:
        return getS7();
      case EditorPackage.STATEMENT__S8:
        return getS8();
      case EditorPackage.STATEMENT__S12:
        return getS12();
      case EditorPackage.STATEMENT__S9:
        return getS9();
      case EditorPackage.STATEMENT__S10:
        return getS10();
      case EditorPackage.STATEMENT__E:
        return getE();
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
      case EditorPackage.STATEMENT__S1:
        setS1((Block)newValue);
        return;
      case EditorPackage.STATEMENT__S3:
        setS3((StatementExpression)newValue);
        return;
      case EditorPackage.STATEMENT__S4:
        setS4((IfStatement)newValue);
        return;
      case EditorPackage.STATEMENT__S4B:
        setS4b((IfElseStatement)newValue);
        return;
      case EditorPackage.STATEMENT__S5:
        setS5((WhileStatement)newValue);
        return;
      case EditorPackage.STATEMENT__S6:
        setS6((DoStatement)newValue);
        return;
      case EditorPackage.STATEMENT__S7:
        setS7((ForStatement)newValue);
        return;
      case EditorPackage.STATEMENT__S8:
        setS8((BreakStatement)newValue);
        return;
      case EditorPackage.STATEMENT__S12:
        setS12((RepeatStatement)newValue);
        return;
      case EditorPackage.STATEMENT__S9:
        setS9((IterateStatement)newValue);
        return;
      case EditorPackage.STATEMENT__S10:
        setS10((ReturnStatement)newValue);
        return;
      case EditorPackage.STATEMENT__E:
        setE((Expr)newValue);
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
      case EditorPackage.STATEMENT__S1:
        setS1((Block)null);
        return;
      case EditorPackage.STATEMENT__S3:
        setS3((StatementExpression)null);
        return;
      case EditorPackage.STATEMENT__S4:
        setS4((IfStatement)null);
        return;
      case EditorPackage.STATEMENT__S4B:
        setS4b((IfElseStatement)null);
        return;
      case EditorPackage.STATEMENT__S5:
        setS5((WhileStatement)null);
        return;
      case EditorPackage.STATEMENT__S6:
        setS6((DoStatement)null);
        return;
      case EditorPackage.STATEMENT__S7:
        setS7((ForStatement)null);
        return;
      case EditorPackage.STATEMENT__S8:
        setS8((BreakStatement)null);
        return;
      case EditorPackage.STATEMENT__S12:
        setS12((RepeatStatement)null);
        return;
      case EditorPackage.STATEMENT__S9:
        setS9((IterateStatement)null);
        return;
      case EditorPackage.STATEMENT__S10:
        setS10((ReturnStatement)null);
        return;
      case EditorPackage.STATEMENT__E:
        setE((Expr)null);
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
      case EditorPackage.STATEMENT__S1:
        return s1 != null;
      case EditorPackage.STATEMENT__S3:
        return s3 != null;
      case EditorPackage.STATEMENT__S4:
        return s4 != null;
      case EditorPackage.STATEMENT__S4B:
        return s4b != null;
      case EditorPackage.STATEMENT__S5:
        return s5 != null;
      case EditorPackage.STATEMENT__S6:
        return s6 != null;
      case EditorPackage.STATEMENT__S7:
        return s7 != null;
      case EditorPackage.STATEMENT__S8:
        return s8 != null;
      case EditorPackage.STATEMENT__S12:
        return s12 != null;
      case EditorPackage.STATEMENT__S9:
        return s9 != null;
      case EditorPackage.STATEMENT__S10:
        return s10 != null;
      case EditorPackage.STATEMENT__E:
        return e != null;
    }
    return super.eIsSet(featureID);
  }

} //StatementImpl
