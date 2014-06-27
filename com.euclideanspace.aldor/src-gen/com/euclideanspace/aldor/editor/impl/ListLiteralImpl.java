/**
 */
package com.euclideanspace.aldor.editor.impl;

import com.euclideanspace.aldor.editor.EditorPackage;
import com.euclideanspace.aldor.editor.Expr;
import com.euclideanspace.aldor.editor.ListLiteral;

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
 * An implementation of the model object '<em><b>List Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.ListLiteralImpl#getLitname <em>Litname</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.ListLiteralImpl#getL2 <em>L2</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.ListLiteralImpl#getT3 <em>T3</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.ListLiteralImpl#getT14 <em>T14</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.ListLiteralImpl#getL5 <em>L5</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ListLiteralImpl extends LiteralImpl implements ListLiteral
{
  /**
   * The default value of the '{@link #getLitname() <em>Litname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLitname()
   * @generated
   * @ordered
   */
  protected static final String LITNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLitname() <em>Litname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLitname()
   * @generated
   * @ordered
   */
  protected String litname = LITNAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getL2() <em>L2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getL2()
   * @generated
   * @ordered
   */
  protected Expr l2;

  /**
   * The cached value of the '{@link #getT3() <em>T3</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT3()
   * @generated
   * @ordered
   */
  protected EList<Expr> t3;

  /**
   * The cached value of the '{@link #getT14() <em>T14</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT14()
   * @generated
   * @ordered
   */
  protected EList<Expr> t14;

  /**
   * The cached value of the '{@link #getL5() <em>L5</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getL5()
   * @generated
   * @ordered
   */
  protected EList<Expr> l5;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ListLiteralImpl()
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
    return EditorPackage.Literals.LIST_LITERAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLitname()
  {
    return litname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLitname(String newLitname)
  {
    String oldLitname = litname;
    litname = newLitname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.LIST_LITERAL__LITNAME, oldLitname, litname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getL2()
  {
    return l2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetL2(Expr newL2, NotificationChain msgs)
  {
    Expr oldL2 = l2;
    l2 = newL2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.LIST_LITERAL__L2, oldL2, newL2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setL2(Expr newL2)
  {
    if (newL2 != l2)
    {
      NotificationChain msgs = null;
      if (l2 != null)
        msgs = ((InternalEObject)l2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.LIST_LITERAL__L2, null, msgs);
      if (newL2 != null)
        msgs = ((InternalEObject)newL2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.LIST_LITERAL__L2, null, msgs);
      msgs = basicSetL2(newL2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.LIST_LITERAL__L2, newL2, newL2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expr> getT3()
  {
    if (t3 == null)
    {
      t3 = new EObjectContainmentEList<Expr>(Expr.class, this, EditorPackage.LIST_LITERAL__T3);
    }
    return t3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expr> getT14()
  {
    if (t14 == null)
    {
      t14 = new EObjectContainmentEList<Expr>(Expr.class, this, EditorPackage.LIST_LITERAL__T14);
    }
    return t14;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expr> getL5()
  {
    if (l5 == null)
    {
      l5 = new EObjectContainmentEList<Expr>(Expr.class, this, EditorPackage.LIST_LITERAL__L5);
    }
    return l5;
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
      case EditorPackage.LIST_LITERAL__L2:
        return basicSetL2(null, msgs);
      case EditorPackage.LIST_LITERAL__T3:
        return ((InternalEList<?>)getT3()).basicRemove(otherEnd, msgs);
      case EditorPackage.LIST_LITERAL__T14:
        return ((InternalEList<?>)getT14()).basicRemove(otherEnd, msgs);
      case EditorPackage.LIST_LITERAL__L5:
        return ((InternalEList<?>)getL5()).basicRemove(otherEnd, msgs);
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
      case EditorPackage.LIST_LITERAL__LITNAME:
        return getLitname();
      case EditorPackage.LIST_LITERAL__L2:
        return getL2();
      case EditorPackage.LIST_LITERAL__T3:
        return getT3();
      case EditorPackage.LIST_LITERAL__T14:
        return getT14();
      case EditorPackage.LIST_LITERAL__L5:
        return getL5();
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
      case EditorPackage.LIST_LITERAL__LITNAME:
        setLitname((String)newValue);
        return;
      case EditorPackage.LIST_LITERAL__L2:
        setL2((Expr)newValue);
        return;
      case EditorPackage.LIST_LITERAL__T3:
        getT3().clear();
        getT3().addAll((Collection<? extends Expr>)newValue);
        return;
      case EditorPackage.LIST_LITERAL__T14:
        getT14().clear();
        getT14().addAll((Collection<? extends Expr>)newValue);
        return;
      case EditorPackage.LIST_LITERAL__L5:
        getL5().clear();
        getL5().addAll((Collection<? extends Expr>)newValue);
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
      case EditorPackage.LIST_LITERAL__LITNAME:
        setLitname(LITNAME_EDEFAULT);
        return;
      case EditorPackage.LIST_LITERAL__L2:
        setL2((Expr)null);
        return;
      case EditorPackage.LIST_LITERAL__T3:
        getT3().clear();
        return;
      case EditorPackage.LIST_LITERAL__T14:
        getT14().clear();
        return;
      case EditorPackage.LIST_LITERAL__L5:
        getL5().clear();
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
      case EditorPackage.LIST_LITERAL__LITNAME:
        return LITNAME_EDEFAULT == null ? litname != null : !LITNAME_EDEFAULT.equals(litname);
      case EditorPackage.LIST_LITERAL__L2:
        return l2 != null;
      case EditorPackage.LIST_LITERAL__T3:
        return t3 != null && !t3.isEmpty();
      case EditorPackage.LIST_LITERAL__T14:
        return t14 != null && !t14.isEmpty();
      case EditorPackage.LIST_LITERAL__L5:
        return l5 != null && !l5.isEmpty();
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
    result.append(" (litname: ");
    result.append(litname);
    result.append(')');
    return result.toString();
  }

} //ListLiteralImpl
