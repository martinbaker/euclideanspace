/**
 */
package com.euclideanspace.spad.editor.impl;

import com.euclideanspace.spad.editor.AddStatements;
import com.euclideanspace.spad.editor.EditorPackage;
import com.euclideanspace.spad.editor.Expr;
import com.euclideanspace.spad.editor.FunctionDefinitionBlock;
import com.euclideanspace.spad.editor.Import;
import com.euclideanspace.spad.editor.TypeExpression;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.spad.editor.impl.ImportImpl#getT1 <em>T1</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.ImportImpl#getT13 <em>T13</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.ImportImpl#getImpname <em>Impname</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.ImportImpl#getPar22 <em>Par22</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImportImpl extends WhereAssignmentsImpl implements Import
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
   * The cached value of the '{@link #getImpname() <em>Impname</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImpname()
   * @generated
   * @ordered
   */
  protected EList<String> impname;

  /**
   * The cached value of the '{@link #getPar22() <em>Par22</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPar22()
   * @generated
   * @ordered
   */
  protected EList<TypeExpression> par22;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ImportImpl()
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
    return EditorPackage.Literals.IMPORT;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.IMPORT__T1, oldT1, newT1);
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
        msgs = ((InternalEObject)t1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.IMPORT__T1, null, msgs);
      if (newT1 != null)
        msgs = ((InternalEObject)newT1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.IMPORT__T1, null, msgs);
      msgs = basicSetT1(newT1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.IMPORT__T1, newT1, newT1));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.IMPORT__T13, oldT13, newT13);
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
        msgs = ((InternalEObject)t13).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.IMPORT__T13, null, msgs);
      if (newT13 != null)
        msgs = ((InternalEObject)newT13).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.IMPORT__T13, null, msgs);
      msgs = basicSetT13(newT13, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.IMPORT__T13, newT13, newT13));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getImpname()
  {
    if (impname == null)
    {
      impname = new EDataTypeEList<String>(String.class, this, EditorPackage.IMPORT__IMPNAME);
    }
    return impname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeExpression> getPar22()
  {
    if (par22 == null)
    {
      par22 = new EObjectContainmentEList<TypeExpression>(TypeExpression.class, this, EditorPackage.IMPORT__PAR22);
    }
    return par22;
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
      case EditorPackage.IMPORT__T1:
        return basicSetT1(null, msgs);
      case EditorPackage.IMPORT__T13:
        return basicSetT13(null, msgs);
      case EditorPackage.IMPORT__PAR22:
        return ((InternalEList<?>)getPar22()).basicRemove(otherEnd, msgs);
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
      case EditorPackage.IMPORT__T1:
        return getT1();
      case EditorPackage.IMPORT__T13:
        return getT13();
      case EditorPackage.IMPORT__IMPNAME:
        return getImpname();
      case EditorPackage.IMPORT__PAR22:
        return getPar22();
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
      case EditorPackage.IMPORT__T1:
        setT1((Expr)newValue);
        return;
      case EditorPackage.IMPORT__T13:
        setT13((FunctionDefinitionBlock)newValue);
        return;
      case EditorPackage.IMPORT__IMPNAME:
        getImpname().clear();
        getImpname().addAll((Collection<? extends String>)newValue);
        return;
      case EditorPackage.IMPORT__PAR22:
        getPar22().clear();
        getPar22().addAll((Collection<? extends TypeExpression>)newValue);
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
      case EditorPackage.IMPORT__T1:
        setT1((Expr)null);
        return;
      case EditorPackage.IMPORT__T13:
        setT13((FunctionDefinitionBlock)null);
        return;
      case EditorPackage.IMPORT__IMPNAME:
        getImpname().clear();
        return;
      case EditorPackage.IMPORT__PAR22:
        getPar22().clear();
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
      case EditorPackage.IMPORT__T1:
        return t1 != null;
      case EditorPackage.IMPORT__T13:
        return t13 != null;
      case EditorPackage.IMPORT__IMPNAME:
        return impname != null && !impname.isEmpty();
      case EditorPackage.IMPORT__PAR22:
        return par22 != null && !par22.isEmpty();
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
        case EditorPackage.IMPORT__T1: return EditorPackage.ADD_STATEMENTS__T1;
        case EditorPackage.IMPORT__T13: return EditorPackage.ADD_STATEMENTS__T13;
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
        case EditorPackage.ADD_STATEMENTS__T1: return EditorPackage.IMPORT__T1;
        case EditorPackage.ADD_STATEMENTS__T13: return EditorPackage.IMPORT__T13;
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
    result.append(" (impname: ");
    result.append(impname);
    result.append(')');
    return result.toString();
  }

} //ImportImpl
