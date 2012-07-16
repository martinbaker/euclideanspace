/**
 */
package com.euclideanspace.spad.editor.impl;

import com.euclideanspace.spad.editor.AddStatements;
import com.euclideanspace.spad.editor.EditorPackage;
import com.euclideanspace.spad.editor.FunctionDefinitionBlock;
import com.euclideanspace.spad.editor.MacroDef;
import com.euclideanspace.spad.editor.TypeExpression;

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
 *   <li>{@link com.euclideanspace.spad.editor.impl.MacroDefImpl#getT1 <em>T1</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.MacroDefImpl#getT12 <em>T12</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.MacroDefImpl#getT13 <em>T13</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.MacroDefImpl#getMacroname <em>Macroname</em>}</li>
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
  protected TypeExpression t1;

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
   * The cached value of the '{@link #getT13() <em>T13</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT13()
   * @generated
   * @ordered
   */
  protected FunctionDefinitionBlock t13;

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
  public TypeExpression getT1()
  {
    return t1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetT1(TypeExpression newT1, NotificationChain msgs)
  {
    TypeExpression oldT1 = t1;
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
  public void setT1(TypeExpression newT1)
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.MACRO_DEF__T12, oldT12, newT12);
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
        msgs = ((InternalEObject)t12).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.MACRO_DEF__T12, null, msgs);
      if (newT12 != null)
        msgs = ((InternalEObject)newT12).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.MACRO_DEF__T12, null, msgs);
      msgs = basicSetT12(newT12, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.MACRO_DEF__T12, newT12, newT12));
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
      case EditorPackage.MACRO_DEF__T12:
        return basicSetT12(null, msgs);
      case EditorPackage.MACRO_DEF__T13:
        return basicSetT13(null, msgs);
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
      case EditorPackage.MACRO_DEF__T12:
        return getT12();
      case EditorPackage.MACRO_DEF__T13:
        return getT13();
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
        setT1((TypeExpression)newValue);
        return;
      case EditorPackage.MACRO_DEF__T12:
        setT12((TypeExpression)newValue);
        return;
      case EditorPackage.MACRO_DEF__T13:
        setT13((FunctionDefinitionBlock)newValue);
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
        setT1((TypeExpression)null);
        return;
      case EditorPackage.MACRO_DEF__T12:
        setT12((TypeExpression)null);
        return;
      case EditorPackage.MACRO_DEF__T13:
        setT13((FunctionDefinitionBlock)null);
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
      case EditorPackage.MACRO_DEF__T12:
        return t12 != null;
      case EditorPackage.MACRO_DEF__T13:
        return t13 != null;
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
        case EditorPackage.MACRO_DEF__T12: return EditorPackage.ADD_STATEMENTS__T12;
        case EditorPackage.MACRO_DEF__T13: return EditorPackage.ADD_STATEMENTS__T13;
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
        case EditorPackage.ADD_STATEMENTS__T12: return EditorPackage.MACRO_DEF__T12;
        case EditorPackage.ADD_STATEMENTS__T13: return EditorPackage.MACRO_DEF__T13;
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
