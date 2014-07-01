/**
 */
package com.euclideanspace.aldor.editor.impl;

import com.euclideanspace.aldor.editor.AlwaysPart_AnyStatement;
import com.euclideanspace.aldor.editor.AlwaysPart_BalStatement;
import com.euclideanspace.aldor.editor.BindingR_InfixedExprsDecl_AnyStatement;
import com.euclideanspace.aldor.editor.Binding_AnyStatement;
import com.euclideanspace.aldor.editor.ButExpr;
import com.euclideanspace.aldor.editor.Cases;
import com.euclideanspace.aldor.editor.DeclBinding;
import com.euclideanspace.aldor.editor.Declaration;
import com.euclideanspace.aldor.editor.EditorPackage;
import com.euclideanspace.aldor.editor.ExportDecl;
import com.euclideanspace.aldor.editor.FromPart;
import com.euclideanspace.aldor.editor.MacroBody;
import com.euclideanspace.aldor.editor.Sig;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding Any Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.Binding_AnyStatementImpl#getFp <em>Fp</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.Binding_AnyStatementImpl#getTp <em>Tp</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.Binding_AnyStatementImpl#getBe <em>Be</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.Binding_AnyStatementImpl#getApa <em>Apa</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.Binding_AnyStatementImpl#getC <em>C</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.Binding_AnyStatementImpl#getApb <em>Apb</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Binding_AnyStatementImpl extends CommaItemImpl implements Binding_AnyStatement
{
  /**
   * The cached value of the '{@link #getFp() <em>Fp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFp()
   * @generated
   * @ordered
   */
  protected FromPart fp;

  /**
   * The default value of the '{@link #getTp() <em>Tp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTp()
   * @generated
   * @ordered
   */
  protected static final String TP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTp() <em>Tp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTp()
   * @generated
   * @ordered
   */
  protected String tp = TP_EDEFAULT;

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
   * The cached value of the '{@link #getApa() <em>Apa</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getApa()
   * @generated
   * @ordered
   */
  protected AlwaysPart_AnyStatement apa;

  /**
   * The cached value of the '{@link #getC() <em>C</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getC()
   * @generated
   * @ordered
   */
  protected Cases c;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Binding_AnyStatementImpl()
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
    return EditorPackage.Literals.BINDING_ANY_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FromPart getFp()
  {
    return fp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFp(FromPart newFp, NotificationChain msgs)
  {
    FromPart oldFp = fp;
    fp = newFp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.BINDING_ANY_STATEMENT__FP, oldFp, newFp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFp(FromPart newFp)
  {
    if (newFp != fp)
    {
      NotificationChain msgs = null;
      if (fp != null)
        msgs = ((InternalEObject)fp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.BINDING_ANY_STATEMENT__FP, null, msgs);
      if (newFp != null)
        msgs = ((InternalEObject)newFp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.BINDING_ANY_STATEMENT__FP, null, msgs);
      msgs = basicSetFp(newFp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.BINDING_ANY_STATEMENT__FP, newFp, newFp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTp()
  {
    return tp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTp(String newTp)
  {
    String oldTp = tp;
    tp = newTp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.BINDING_ANY_STATEMENT__TP, oldTp, tp));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.BINDING_ANY_STATEMENT__BE, oldBe, newBe);
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
        msgs = ((InternalEObject)be).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.BINDING_ANY_STATEMENT__BE, null, msgs);
      if (newBe != null)
        msgs = ((InternalEObject)newBe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.BINDING_ANY_STATEMENT__BE, null, msgs);
      msgs = basicSetBe(newBe, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.BINDING_ANY_STATEMENT__BE, newBe, newBe));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.BINDING_ANY_STATEMENT__APA, oldApa, newApa);
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
        msgs = ((InternalEObject)apa).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.BINDING_ANY_STATEMENT__APA, null, msgs);
      if (newApa != null)
        msgs = ((InternalEObject)newApa).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.BINDING_ANY_STATEMENT__APA, null, msgs);
      msgs = basicSetApa(newApa, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.BINDING_ANY_STATEMENT__APA, newApa, newApa));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Cases getC()
  {
    return c;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetC(Cases newC, NotificationChain msgs)
  {
    Cases oldC = c;
    c = newC;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.BINDING_ANY_STATEMENT__C, oldC, newC);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setC(Cases newC)
  {
    if (newC != c)
    {
      NotificationChain msgs = null;
      if (c != null)
        msgs = ((InternalEObject)c).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.BINDING_ANY_STATEMENT__C, null, msgs);
      if (newC != null)
        msgs = ((InternalEObject)newC).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.BINDING_ANY_STATEMENT__C, null, msgs);
      msgs = basicSetC(newC, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.BINDING_ANY_STATEMENT__C, newC, newC));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.BINDING_ANY_STATEMENT__APB, oldApb, newApb);
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
        msgs = ((InternalEObject)apb).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.BINDING_ANY_STATEMENT__APB, null, msgs);
      if (newApb != null)
        msgs = ((InternalEObject)newApb).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.BINDING_ANY_STATEMENT__APB, null, msgs);
      msgs = basicSetApb(newApb, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.BINDING_ANY_STATEMENT__APB, newApb, newApb));
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
      case EditorPackage.BINDING_ANY_STATEMENT__FP:
        return basicSetFp(null, msgs);
      case EditorPackage.BINDING_ANY_STATEMENT__BE:
        return basicSetBe(null, msgs);
      case EditorPackage.BINDING_ANY_STATEMENT__APA:
        return basicSetApa(null, msgs);
      case EditorPackage.BINDING_ANY_STATEMENT__C:
        return basicSetC(null, msgs);
      case EditorPackage.BINDING_ANY_STATEMENT__APB:
        return basicSetApb(null, msgs);
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
      case EditorPackage.BINDING_ANY_STATEMENT__FP:
        return getFp();
      case EditorPackage.BINDING_ANY_STATEMENT__TP:
        return getTp();
      case EditorPackage.BINDING_ANY_STATEMENT__BE:
        return getBe();
      case EditorPackage.BINDING_ANY_STATEMENT__APA:
        return getApa();
      case EditorPackage.BINDING_ANY_STATEMENT__C:
        return getC();
      case EditorPackage.BINDING_ANY_STATEMENT__APB:
        return getApb();
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
      case EditorPackage.BINDING_ANY_STATEMENT__FP:
        setFp((FromPart)newValue);
        return;
      case EditorPackage.BINDING_ANY_STATEMENT__TP:
        setTp((String)newValue);
        return;
      case EditorPackage.BINDING_ANY_STATEMENT__BE:
        setBe((ButExpr)newValue);
        return;
      case EditorPackage.BINDING_ANY_STATEMENT__APA:
        setApa((AlwaysPart_AnyStatement)newValue);
        return;
      case EditorPackage.BINDING_ANY_STATEMENT__C:
        setC((Cases)newValue);
        return;
      case EditorPackage.BINDING_ANY_STATEMENT__APB:
        setApb((AlwaysPart_BalStatement)newValue);
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
      case EditorPackage.BINDING_ANY_STATEMENT__FP:
        setFp((FromPart)null);
        return;
      case EditorPackage.BINDING_ANY_STATEMENT__TP:
        setTp(TP_EDEFAULT);
        return;
      case EditorPackage.BINDING_ANY_STATEMENT__BE:
        setBe((ButExpr)null);
        return;
      case EditorPackage.BINDING_ANY_STATEMENT__APA:
        setApa((AlwaysPart_AnyStatement)null);
        return;
      case EditorPackage.BINDING_ANY_STATEMENT__C:
        setC((Cases)null);
        return;
      case EditorPackage.BINDING_ANY_STATEMENT__APB:
        setApb((AlwaysPart_BalStatement)null);
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
      case EditorPackage.BINDING_ANY_STATEMENT__FP:
        return fp != null;
      case EditorPackage.BINDING_ANY_STATEMENT__TP:
        return TP_EDEFAULT == null ? tp != null : !TP_EDEFAULT.equals(tp);
      case EditorPackage.BINDING_ANY_STATEMENT__BE:
        return be != null;
      case EditorPackage.BINDING_ANY_STATEMENT__APA:
        return apa != null;
      case EditorPackage.BINDING_ANY_STATEMENT__C:
        return c != null;
      case EditorPackage.BINDING_ANY_STATEMENT__APB:
        return apb != null;
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
    if (baseClass == Declaration.class)
    {
      switch (derivedFeatureID)
      {
        case EditorPackage.BINDING_ANY_STATEMENT__FP: return EditorPackage.DECLARATION__FP;
        default: return -1;
      }
    }
    if (baseClass == MacroBody.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == ExportDecl.class)
    {
      switch (derivedFeatureID)
      {
        case EditorPackage.BINDING_ANY_STATEMENT__TP: return EditorPackage.EXPORT_DECL__TP;
        default: return -1;
      }
    }
    if (baseClass == Sig.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == DeclBinding.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == BindingR_InfixedExprsDecl_AnyStatement.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == AlwaysPart_AnyStatement.class)
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
    if (baseClass == Declaration.class)
    {
      switch (baseFeatureID)
      {
        case EditorPackage.DECLARATION__FP: return EditorPackage.BINDING_ANY_STATEMENT__FP;
        default: return -1;
      }
    }
    if (baseClass == MacroBody.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == ExportDecl.class)
    {
      switch (baseFeatureID)
      {
        case EditorPackage.EXPORT_DECL__TP: return EditorPackage.BINDING_ANY_STATEMENT__TP;
        default: return -1;
      }
    }
    if (baseClass == Sig.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == DeclBinding.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == BindingR_InfixedExprsDecl_AnyStatement.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == AlwaysPart_AnyStatement.class)
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
    result.append(" (tp: ");
    result.append(tp);
    result.append(')');
    return result.toString();
  }

} //Binding_AnyStatementImpl
