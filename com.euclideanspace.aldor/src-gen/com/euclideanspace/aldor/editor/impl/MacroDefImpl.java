/**
 */
package com.euclideanspace.aldor.editor.impl;

import com.euclideanspace.aldor.editor.AddStatements;
import com.euclideanspace.aldor.editor.EditorPackage;
import com.euclideanspace.aldor.editor.Expr;
import com.euclideanspace.aldor.editor.FunctionDefinitionBlock;
import com.euclideanspace.aldor.editor.MacroDef;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Macro Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.MacroDefImpl#getT1 <em>T1</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.MacroDefImpl#getT13 <em>T13</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.MacroDefImpl#getT14 <em>T14</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.MacroDefImpl#getT15 <em>T15</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.MacroDefImpl#getMacroname <em>Macroname</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MacroDefImpl extends WhereAssignmentsImpl implements MacroDef
{
  /**
   * The cached value of the '{@link #getT1() <em>T1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT1()
   * @generated
   * @ordered
   */
  protected Expr t1;

  /**
   * The cached value of the '{@link #getT13() <em>T13</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT13()
   * @generated
   * @ordered
   */
  protected FunctionDefinitionBlock t13;

  /**
   * The cached value of the '{@link #getT14() <em>T14</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT14()
   * @generated
   * @ordered
   */
  protected FunctionDefinitionBlock t14;

  /**
   * The cached value of the '{@link #getT15() <em>T15</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT15()
   * @generated
   * @ordered
   */
  protected AddStatements t15;

  /**
   * The default value of the '{@link #getMacroname() <em>Macroname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMacroname()
   * @generated
   * @ordered
   */
  protected static final String MACRONAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMacroname() <em>Macroname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMacroname()
   * @generated
   * @ordered
   */
  protected String macroname = MACRONAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MacroDefImpl()
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
    return EditorPackage.Literals.MACRO_DEF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getT1()
  {
    return t1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetT1(Expr newT1, NotificationChain msgs)
  {
    Expr oldT1 = t1;
    t1 = newT1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.MACRO_DEF__T1, oldT1, newT1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT1(Expr newT1)
  {
    if (newT1 != t1)
    {
      NotificationChain msgs = null;
      if (t1 != null)
        msgs = ((InternalEObject)t1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.MACRO_DEF__T1, null, msgs);
      if (newT1 != null)
        msgs = ((InternalEObject)newT1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.MACRO_DEF__T1, null, msgs);
      msgs = basicSetT1(newT1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.MACRO_DEF__T1, newT1, newT1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionDefinitionBlock getT13()
  {
    return t13;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetT13(FunctionDefinitionBlock newT13, NotificationChain msgs)
  {
    FunctionDefinitionBlock oldT13 = t13;
    t13 = newT13;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.MACRO_DEF__T13, oldT13, newT13);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT13(FunctionDefinitionBlock newT13)
  {
    if (newT13 != t13)
    {
      NotificationChain msgs = null;
      if (t13 != null)
        msgs = ((InternalEObject)t13).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.MACRO_DEF__T13, null, msgs);
      if (newT13 != null)
        msgs = ((InternalEObject)newT13).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.MACRO_DEF__T13, null, msgs);
      msgs = basicSetT13(newT13, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.MACRO_DEF__T13, newT13, newT13));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionDefinitionBlock getT14()
  {
    return t14;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetT14(FunctionDefinitionBlock newT14, NotificationChain msgs)
  {
    FunctionDefinitionBlock oldT14 = t14;
    t14 = newT14;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.MACRO_DEF__T14, oldT14, newT14);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT14(FunctionDefinitionBlock newT14)
  {
    if (newT14 != t14)
    {
      NotificationChain msgs = null;
      if (t14 != null)
        msgs = ((InternalEObject)t14).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.MACRO_DEF__T14, null, msgs);
      if (newT14 != null)
        msgs = ((InternalEObject)newT14).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.MACRO_DEF__T14, null, msgs);
      msgs = basicSetT14(newT14, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.MACRO_DEF__T14, newT14, newT14));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AddStatements getT15()
  {
    return t15;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetT15(AddStatements newT15, NotificationChain msgs)
  {
    AddStatements oldT15 = t15;
    t15 = newT15;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.MACRO_DEF__T15, oldT15, newT15);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT15(AddStatements newT15)
  {
    if (newT15 != t15)
    {
      NotificationChain msgs = null;
      if (t15 != null)
        msgs = ((InternalEObject)t15).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.MACRO_DEF__T15, null, msgs);
      if (newT15 != null)
        msgs = ((InternalEObject)newT15).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.MACRO_DEF__T15, null, msgs);
      msgs = basicSetT15(newT15, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.MACRO_DEF__T15, newT15, newT15));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMacroname()
  {
    return macroname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMacroname(String newMacroname)
  {
    String oldMacroname = macroname;
    macroname = newMacroname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.MACRO_DEF__MACRONAME, oldMacroname, macroname));
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
      case EditorPackage.MACRO_DEF__T1:
        return basicSetT1(null, msgs);
      case EditorPackage.MACRO_DEF__T13:
        return basicSetT13(null, msgs);
      case EditorPackage.MACRO_DEF__T14:
        return basicSetT14(null, msgs);
      case EditorPackage.MACRO_DEF__T15:
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
      case EditorPackage.MACRO_DEF__T1:
        return getT1();
      case EditorPackage.MACRO_DEF__T13:
        return getT13();
      case EditorPackage.MACRO_DEF__T14:
        return getT14();
      case EditorPackage.MACRO_DEF__T15:
        return getT15();
      case EditorPackage.MACRO_DEF__MACRONAME:
        return getMacroname();
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
      case EditorPackage.MACRO_DEF__T1:
        setT1((Expr)newValue);
        return;
      case EditorPackage.MACRO_DEF__T13:
        setT13((FunctionDefinitionBlock)newValue);
        return;
      case EditorPackage.MACRO_DEF__T14:
        setT14((FunctionDefinitionBlock)newValue);
        return;
      case EditorPackage.MACRO_DEF__T15:
        setT15((AddStatements)newValue);
        return;
      case EditorPackage.MACRO_DEF__MACRONAME:
        setMacroname((String)newValue);
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
      case EditorPackage.MACRO_DEF__T1:
        setT1((Expr)null);
        return;
      case EditorPackage.MACRO_DEF__T13:
        setT13((FunctionDefinitionBlock)null);
        return;
      case EditorPackage.MACRO_DEF__T14:
        setT14((FunctionDefinitionBlock)null);
        return;
      case EditorPackage.MACRO_DEF__T15:
        setT15((AddStatements)null);
        return;
      case EditorPackage.MACRO_DEF__MACRONAME:
        setMacroname(MACRONAME_EDEFAULT);
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
      case EditorPackage.MACRO_DEF__T1:
        return t1 != null;
      case EditorPackage.MACRO_DEF__T13:
        return t13 != null;
      case EditorPackage.MACRO_DEF__T14:
        return t14 != null;
      case EditorPackage.MACRO_DEF__T15:
        return t15 != null;
      case EditorPackage.MACRO_DEF__MACRONAME:
        return MACRONAME_EDEFAULT == null ? macroname != null : !MACRONAME_EDEFAULT.equals(macroname);
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
    if (baseClass == AddStatements.class)
    {
      switch (derivedFeatureID)
      {
        case EditorPackage.MACRO_DEF__T1: return EditorPackage.ADD_STATEMENTS__T1;
        case EditorPackage.MACRO_DEF__T13: return EditorPackage.ADD_STATEMENTS__T13;
        case EditorPackage.MACRO_DEF__T14: return EditorPackage.ADD_STATEMENTS__T14;
        case EditorPackage.MACRO_DEF__T15: return EditorPackage.ADD_STATEMENTS__T15;
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
    if (baseClass == AddStatements.class)
    {
      switch (baseFeatureID)
      {
        case EditorPackage.ADD_STATEMENTS__T1: return EditorPackage.MACRO_DEF__T1;
        case EditorPackage.ADD_STATEMENTS__T13: return EditorPackage.MACRO_DEF__T13;
        case EditorPackage.ADD_STATEMENTS__T14: return EditorPackage.MACRO_DEF__T14;
        case EditorPackage.ADD_STATEMENTS__T15: return EditorPackage.MACRO_DEF__T15;
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
    result.append(" (macroname: ");
    result.append(macroname);
    result.append(')');
    return result.toString();
  }

} //MacroDefImpl
