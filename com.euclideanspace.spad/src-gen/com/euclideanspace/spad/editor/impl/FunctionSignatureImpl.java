/**
 */
package com.euclideanspace.spad.editor.impl;

import com.euclideanspace.spad.editor.EditorPackage;
import com.euclideanspace.spad.editor.FunctionSignature;
import com.euclideanspace.spad.editor.Statement;
import com.euclideanspace.spad.editor.TypeExpression;
import com.euclideanspace.spad.editor.VariableDeclaration;

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
 * An implementation of the model object '<em><b>Function Signature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.spad.editor.impl.FunctionSignatureImpl#getPar4 <em>Par4</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.FunctionSignatureImpl#getPar5 <em>Par5</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.FunctionSignatureImpl#getFnNam <em>Fn Nam</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.FunctionSignatureImpl#getPar2 <em>Par2</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.FunctionSignatureImpl#getPar3 <em>Par3</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.FunctionSignatureImpl#getT4 <em>T4</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.FunctionSignatureImpl#getB1 <em>B1</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.FunctionSignatureImpl#getT5 <em>T5</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.FunctionSignatureImpl#getB2 <em>B2</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.FunctionSignatureImpl#getT6 <em>T6</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionSignatureImpl extends FunctionDefinitionImpl implements FunctionSignature
{
  /**
   * The cached value of the '{@link #getPar4() <em>Par4</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPar4()
   * @generated
   * @ordered
   */
  protected TypeExpression par4;

  /**
   * The cached value of the '{@link #getPar5() <em>Par5</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPar5()
   * @generated
   * @ordered
   */
  protected Statement par5;

  /**
   * The default value of the '{@link #getFnNam() <em>Fn Nam</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFnNam()
   * @generated
   * @ordered
   */
  protected static final String FN_NAM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFnNam() <em>Fn Nam</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFnNam()
   * @generated
   * @ordered
   */
  protected String fnNam = FN_NAM_EDEFAULT;

  /**
   * The cached value of the '{@link #getPar2() <em>Par2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPar2()
   * @generated
   * @ordered
   */
  protected VariableDeclaration par2;

  /**
   * The cached value of the '{@link #getPar3() <em>Par3</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPar3()
   * @generated
   * @ordered
   */
  protected EList<VariableDeclaration> par3;

  /**
   * The default value of the '{@link #getT4() <em>T4</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT4()
   * @generated
   * @ordered
   */
  protected static final String T4_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getT4() <em>T4</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT4()
   * @generated
   * @ordered
   */
  protected String t4 = T4_EDEFAULT;

  /**
   * The default value of the '{@link #getB1() <em>B1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getB1()
   * @generated
   * @ordered
   */
  protected static final String B1_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getB1() <em>B1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getB1()
   * @generated
   * @ordered
   */
  protected String b1 = B1_EDEFAULT;

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
   * The default value of the '{@link #getB2() <em>B2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getB2()
   * @generated
   * @ordered
   */
  protected static final String B2_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getB2() <em>B2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getB2()
   * @generated
   * @ordered
   */
  protected String b2 = B2_EDEFAULT;

  /**
   * The default value of the '{@link #getT6() <em>T6</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT6()
   * @generated
   * @ordered
   */
  protected static final String T6_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getT6() <em>T6</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT6()
   * @generated
   * @ordered
   */
  protected String t6 = T6_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FunctionSignatureImpl()
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
    return EditorPackage.Literals.FUNCTION_SIGNATURE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeExpression getPar4()
  {
    return par4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPar4(TypeExpression newPar4, NotificationChain msgs)
  {
    TypeExpression oldPar4 = par4;
    par4 = newPar4;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.FUNCTION_SIGNATURE__PAR4, oldPar4, newPar4);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPar4(TypeExpression newPar4)
  {
    if (newPar4 != par4)
    {
      NotificationChain msgs = null;
      if (par4 != null)
        msgs = ((InternalEObject)par4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.FUNCTION_SIGNATURE__PAR4, null, msgs);
      if (newPar4 != null)
        msgs = ((InternalEObject)newPar4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.FUNCTION_SIGNATURE__PAR4, null, msgs);
      msgs = basicSetPar4(newPar4, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.FUNCTION_SIGNATURE__PAR4, newPar4, newPar4));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement getPar5()
  {
    return par5;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPar5(Statement newPar5, NotificationChain msgs)
  {
    Statement oldPar5 = par5;
    par5 = newPar5;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.FUNCTION_SIGNATURE__PAR5, oldPar5, newPar5);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPar5(Statement newPar5)
  {
    if (newPar5 != par5)
    {
      NotificationChain msgs = null;
      if (par5 != null)
        msgs = ((InternalEObject)par5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.FUNCTION_SIGNATURE__PAR5, null, msgs);
      if (newPar5 != null)
        msgs = ((InternalEObject)newPar5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.FUNCTION_SIGNATURE__PAR5, null, msgs);
      msgs = basicSetPar5(newPar5, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.FUNCTION_SIGNATURE__PAR5, newPar5, newPar5));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFnNam()
  {
    return fnNam;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFnNam(String newFnNam)
  {
    String oldFnNam = fnNam;
    fnNam = newFnNam;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.FUNCTION_SIGNATURE__FN_NAM, oldFnNam, fnNam));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDeclaration getPar2()
  {
    return par2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPar2(VariableDeclaration newPar2, NotificationChain msgs)
  {
    VariableDeclaration oldPar2 = par2;
    par2 = newPar2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.FUNCTION_SIGNATURE__PAR2, oldPar2, newPar2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPar2(VariableDeclaration newPar2)
  {
    if (newPar2 != par2)
    {
      NotificationChain msgs = null;
      if (par2 != null)
        msgs = ((InternalEObject)par2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.FUNCTION_SIGNATURE__PAR2, null, msgs);
      if (newPar2 != null)
        msgs = ((InternalEObject)newPar2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.FUNCTION_SIGNATURE__PAR2, null, msgs);
      msgs = basicSetPar2(newPar2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.FUNCTION_SIGNATURE__PAR2, newPar2, newPar2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<VariableDeclaration> getPar3()
  {
    if (par3 == null)
    {
      par3 = new EObjectContainmentEList<VariableDeclaration>(VariableDeclaration.class, this, EditorPackage.FUNCTION_SIGNATURE__PAR3);
    }
    return par3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getT4()
  {
    return t4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT4(String newT4)
  {
    String oldT4 = t4;
    t4 = newT4;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.FUNCTION_SIGNATURE__T4, oldT4, t4));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getB1()
  {
    return b1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setB1(String newB1)
  {
    String oldB1 = b1;
    b1 = newB1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.FUNCTION_SIGNATURE__B1, oldB1, b1));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.FUNCTION_SIGNATURE__T5, oldT5, t5));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getB2()
  {
    return b2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setB2(String newB2)
  {
    String oldB2 = b2;
    b2 = newB2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.FUNCTION_SIGNATURE__B2, oldB2, b2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getT6()
  {
    return t6;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT6(String newT6)
  {
    String oldT6 = t6;
    t6 = newT6;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.FUNCTION_SIGNATURE__T6, oldT6, t6));
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
      case EditorPackage.FUNCTION_SIGNATURE__PAR4:
        return basicSetPar4(null, msgs);
      case EditorPackage.FUNCTION_SIGNATURE__PAR5:
        return basicSetPar5(null, msgs);
      case EditorPackage.FUNCTION_SIGNATURE__PAR2:
        return basicSetPar2(null, msgs);
      case EditorPackage.FUNCTION_SIGNATURE__PAR3:
        return ((InternalEList<?>)getPar3()).basicRemove(otherEnd, msgs);
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
      case EditorPackage.FUNCTION_SIGNATURE__PAR4:
        return getPar4();
      case EditorPackage.FUNCTION_SIGNATURE__PAR5:
        return getPar5();
      case EditorPackage.FUNCTION_SIGNATURE__FN_NAM:
        return getFnNam();
      case EditorPackage.FUNCTION_SIGNATURE__PAR2:
        return getPar2();
      case EditorPackage.FUNCTION_SIGNATURE__PAR3:
        return getPar3();
      case EditorPackage.FUNCTION_SIGNATURE__T4:
        return getT4();
      case EditorPackage.FUNCTION_SIGNATURE__B1:
        return getB1();
      case EditorPackage.FUNCTION_SIGNATURE__T5:
        return getT5();
      case EditorPackage.FUNCTION_SIGNATURE__B2:
        return getB2();
      case EditorPackage.FUNCTION_SIGNATURE__T6:
        return getT6();
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
      case EditorPackage.FUNCTION_SIGNATURE__PAR4:
        setPar4((TypeExpression)newValue);
        return;
      case EditorPackage.FUNCTION_SIGNATURE__PAR5:
        setPar5((Statement)newValue);
        return;
      case EditorPackage.FUNCTION_SIGNATURE__FN_NAM:
        setFnNam((String)newValue);
        return;
      case EditorPackage.FUNCTION_SIGNATURE__PAR2:
        setPar2((VariableDeclaration)newValue);
        return;
      case EditorPackage.FUNCTION_SIGNATURE__PAR3:
        getPar3().clear();
        getPar3().addAll((Collection<? extends VariableDeclaration>)newValue);
        return;
      case EditorPackage.FUNCTION_SIGNATURE__T4:
        setT4((String)newValue);
        return;
      case EditorPackage.FUNCTION_SIGNATURE__B1:
        setB1((String)newValue);
        return;
      case EditorPackage.FUNCTION_SIGNATURE__T5:
        setT5((String)newValue);
        return;
      case EditorPackage.FUNCTION_SIGNATURE__B2:
        setB2((String)newValue);
        return;
      case EditorPackage.FUNCTION_SIGNATURE__T6:
        setT6((String)newValue);
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
      case EditorPackage.FUNCTION_SIGNATURE__PAR4:
        setPar4((TypeExpression)null);
        return;
      case EditorPackage.FUNCTION_SIGNATURE__PAR5:
        setPar5((Statement)null);
        return;
      case EditorPackage.FUNCTION_SIGNATURE__FN_NAM:
        setFnNam(FN_NAM_EDEFAULT);
        return;
      case EditorPackage.FUNCTION_SIGNATURE__PAR2:
        setPar2((VariableDeclaration)null);
        return;
      case EditorPackage.FUNCTION_SIGNATURE__PAR3:
        getPar3().clear();
        return;
      case EditorPackage.FUNCTION_SIGNATURE__T4:
        setT4(T4_EDEFAULT);
        return;
      case EditorPackage.FUNCTION_SIGNATURE__B1:
        setB1(B1_EDEFAULT);
        return;
      case EditorPackage.FUNCTION_SIGNATURE__T5:
        setT5(T5_EDEFAULT);
        return;
      case EditorPackage.FUNCTION_SIGNATURE__B2:
        setB2(B2_EDEFAULT);
        return;
      case EditorPackage.FUNCTION_SIGNATURE__T6:
        setT6(T6_EDEFAULT);
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
      case EditorPackage.FUNCTION_SIGNATURE__PAR4:
        return par4 != null;
      case EditorPackage.FUNCTION_SIGNATURE__PAR5:
        return par5 != null;
      case EditorPackage.FUNCTION_SIGNATURE__FN_NAM:
        return FN_NAM_EDEFAULT == null ? fnNam != null : !FN_NAM_EDEFAULT.equals(fnNam);
      case EditorPackage.FUNCTION_SIGNATURE__PAR2:
        return par2 != null;
      case EditorPackage.FUNCTION_SIGNATURE__PAR3:
        return par3 != null && !par3.isEmpty();
      case EditorPackage.FUNCTION_SIGNATURE__T4:
        return T4_EDEFAULT == null ? t4 != null : !T4_EDEFAULT.equals(t4);
      case EditorPackage.FUNCTION_SIGNATURE__B1:
        return B1_EDEFAULT == null ? b1 != null : !B1_EDEFAULT.equals(b1);
      case EditorPackage.FUNCTION_SIGNATURE__T5:
        return T5_EDEFAULT == null ? t5 != null : !T5_EDEFAULT.equals(t5);
      case EditorPackage.FUNCTION_SIGNATURE__B2:
        return B2_EDEFAULT == null ? b2 != null : !B2_EDEFAULT.equals(b2);
      case EditorPackage.FUNCTION_SIGNATURE__T6:
        return T6_EDEFAULT == null ? t6 != null : !T6_EDEFAULT.equals(t6);
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
    result.append(" (fnNam: ");
    result.append(fnNam);
    result.append(", t4: ");
    result.append(t4);
    result.append(", b1: ");
    result.append(b1);
    result.append(", t5: ");
    result.append(t5);
    result.append(", b2: ");
    result.append(b2);
    result.append(", t6: ");
    result.append(t6);
    result.append(')');
    return result.toString();
  }

} //FunctionSignatureImpl
