/**
 */
package com.euclideanspace.spad.editor.impl;

import com.euclideanspace.spad.editor.EditorPackage;
import com.euclideanspace.spad.editor.Expr;
import com.euclideanspace.spad.editor.StatementExpression;
import com.euclideanspace.spad.editor.TypeExpression;
import com.euclideanspace.spad.editor.TypeNameOrFunctionCall2;
import com.euclideanspace.spad.editor.TypePrimaryExpression;

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
 * An implementation of the model object '<em><b>Type Name Or Function Call2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.spad.editor.impl.TypeNameOrFunctionCall2Impl#getTfnname <em>Tfnname</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.TypeNameOrFunctionCall2Impl#getT4 <em>T4</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.TypeNameOrFunctionCall2Impl#getT25 <em>T25</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.TypeNameOrFunctionCall2Impl#getT44 <em>T44</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.TypeNameOrFunctionCall2Impl#getT45 <em>T45</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.TypeNameOrFunctionCall2Impl#getT6 <em>T6</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeNameOrFunctionCall2Impl extends TypePrimaryExpressionImpl implements TypeNameOrFunctionCall2
{
  /**
   * The default value of the '{@link #getTfnname() <em>Tfnname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTfnname()
   * @generated
   * @ordered
   */
  protected static final String TFNNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTfnname() <em>Tfnname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTfnname()
   * @generated
   * @ordered
   */
  protected String tfnname = TFNNAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getT4() <em>T4</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT4()
   * @generated
   * @ordered
   */
  protected TypeExpression t4;

  /**
   * The cached value of the '{@link #getT25() <em>T25</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT25()
   * @generated
   * @ordered
   */
  protected EList<TypeExpression> t25;

  /**
   * The cached value of the '{@link #getT44() <em>T44</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT44()
   * @generated
   * @ordered
   */
  protected EList<StatementExpression> t44;

  /**
   * The cached value of the '{@link #getT45() <em>T45</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT45()
   * @generated
   * @ordered
   */
  protected EList<Expr> t45;

  /**
   * The cached value of the '{@link #getT6() <em>T6</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT6()
   * @generated
   * @ordered
   */
  protected TypePrimaryExpression t6;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypeNameOrFunctionCall2Impl()
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
    return EditorPackage.Literals.TYPE_NAME_OR_FUNCTION_CALL2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTfnname()
  {
    return tfnname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTfnname(String newTfnname)
  {
    String oldTfnname = tfnname;
    tfnname = newTfnname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_NAME_OR_FUNCTION_CALL2__TFNNAME, oldTfnname, tfnname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeExpression getT4()
  {
    return t4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetT4(TypeExpression newT4, NotificationChain msgs)
  {
    TypeExpression oldT4 = t4;
    t4 = newT4;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_NAME_OR_FUNCTION_CALL2__T4, oldT4, newT4);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT4(TypeExpression newT4)
  {
    if (newT4 != t4)
    {
      NotificationChain msgs = null;
      if (t4 != null)
        msgs = ((InternalEObject)t4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.TYPE_NAME_OR_FUNCTION_CALL2__T4, null, msgs);
      if (newT4 != null)
        msgs = ((InternalEObject)newT4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.TYPE_NAME_OR_FUNCTION_CALL2__T4, null, msgs);
      msgs = basicSetT4(newT4, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_NAME_OR_FUNCTION_CALL2__T4, newT4, newT4));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeExpression> getT25()
  {
    if (t25 == null)
    {
      t25 = new EObjectContainmentEList<TypeExpression>(TypeExpression.class, this, EditorPackage.TYPE_NAME_OR_FUNCTION_CALL2__T25);
    }
    return t25;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<StatementExpression> getT44()
  {
    if (t44 == null)
    {
      t44 = new EObjectContainmentEList<StatementExpression>(StatementExpression.class, this, EditorPackage.TYPE_NAME_OR_FUNCTION_CALL2__T44);
    }
    return t44;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expr> getT45()
  {
    if (t45 == null)
    {
      t45 = new EObjectContainmentEList<Expr>(Expr.class, this, EditorPackage.TYPE_NAME_OR_FUNCTION_CALL2__T45);
    }
    return t45;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypePrimaryExpression getT6()
  {
    return t6;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetT6(TypePrimaryExpression newT6, NotificationChain msgs)
  {
    TypePrimaryExpression oldT6 = t6;
    t6 = newT6;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_NAME_OR_FUNCTION_CALL2__T6, oldT6, newT6);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT6(TypePrimaryExpression newT6)
  {
    if (newT6 != t6)
    {
      NotificationChain msgs = null;
      if (t6 != null)
        msgs = ((InternalEObject)t6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.TYPE_NAME_OR_FUNCTION_CALL2__T6, null, msgs);
      if (newT6 != null)
        msgs = ((InternalEObject)newT6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.TYPE_NAME_OR_FUNCTION_CALL2__T6, null, msgs);
      msgs = basicSetT6(newT6, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.TYPE_NAME_OR_FUNCTION_CALL2__T6, newT6, newT6));
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
      case EditorPackage.TYPE_NAME_OR_FUNCTION_CALL2__T4:
        return basicSetT4(null, msgs);
      case EditorPackage.TYPE_NAME_OR_FUNCTION_CALL2__T25:
        return ((InternalEList<?>)getT25()).basicRemove(otherEnd, msgs);
      case EditorPackage.TYPE_NAME_OR_FUNCTION_CALL2__T44:
        return ((InternalEList<?>)getT44()).basicRemove(otherEnd, msgs);
      case EditorPackage.TYPE_NAME_OR_FUNCTION_CALL2__T45:
        return ((InternalEList<?>)getT45()).basicRemove(otherEnd, msgs);
      case EditorPackage.TYPE_NAME_OR_FUNCTION_CALL2__T6:
        return basicSetT6(null, msgs);
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
      case EditorPackage.TYPE_NAME_OR_FUNCTION_CALL2__TFNNAME:
        return getTfnname();
      case EditorPackage.TYPE_NAME_OR_FUNCTION_CALL2__T4:
        return getT4();
      case EditorPackage.TYPE_NAME_OR_FUNCTION_CALL2__T25:
        return getT25();
      case EditorPackage.TYPE_NAME_OR_FUNCTION_CALL2__T44:
        return getT44();
      case EditorPackage.TYPE_NAME_OR_FUNCTION_CALL2__T45:
        return getT45();
      case EditorPackage.TYPE_NAME_OR_FUNCTION_CALL2__T6:
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
      case EditorPackage.TYPE_NAME_OR_FUNCTION_CALL2__TFNNAME:
        setTfnname((String)newValue);
        return;
      case EditorPackage.TYPE_NAME_OR_FUNCTION_CALL2__T4:
        setT4((TypeExpression)newValue);
        return;
      case EditorPackage.TYPE_NAME_OR_FUNCTION_CALL2__T25:
        getT25().clear();
        getT25().addAll((Collection<? extends TypeExpression>)newValue);
        return;
      case EditorPackage.TYPE_NAME_OR_FUNCTION_CALL2__T44:
        getT44().clear();
        getT44().addAll((Collection<? extends StatementExpression>)newValue);
        return;
      case EditorPackage.TYPE_NAME_OR_FUNCTION_CALL2__T45:
        getT45().clear();
        getT45().addAll((Collection<? extends Expr>)newValue);
        return;
      case EditorPackage.TYPE_NAME_OR_FUNCTION_CALL2__T6:
        setT6((TypePrimaryExpression)newValue);
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
      case EditorPackage.TYPE_NAME_OR_FUNCTION_CALL2__TFNNAME:
        setTfnname(TFNNAME_EDEFAULT);
        return;
      case EditorPackage.TYPE_NAME_OR_FUNCTION_CALL2__T4:
        setT4((TypeExpression)null);
        return;
      case EditorPackage.TYPE_NAME_OR_FUNCTION_CALL2__T25:
        getT25().clear();
        return;
      case EditorPackage.TYPE_NAME_OR_FUNCTION_CALL2__T44:
        getT44().clear();
        return;
      case EditorPackage.TYPE_NAME_OR_FUNCTION_CALL2__T45:
        getT45().clear();
        return;
      case EditorPackage.TYPE_NAME_OR_FUNCTION_CALL2__T6:
        setT6((TypePrimaryExpression)null);
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
      case EditorPackage.TYPE_NAME_OR_FUNCTION_CALL2__TFNNAME:
        return TFNNAME_EDEFAULT == null ? tfnname != null : !TFNNAME_EDEFAULT.equals(tfnname);
      case EditorPackage.TYPE_NAME_OR_FUNCTION_CALL2__T4:
        return t4 != null;
      case EditorPackage.TYPE_NAME_OR_FUNCTION_CALL2__T25:
        return t25 != null && !t25.isEmpty();
      case EditorPackage.TYPE_NAME_OR_FUNCTION_CALL2__T44:
        return t44 != null && !t44.isEmpty();
      case EditorPackage.TYPE_NAME_OR_FUNCTION_CALL2__T45:
        return t45 != null && !t45.isEmpty();
      case EditorPackage.TYPE_NAME_OR_FUNCTION_CALL2__T6:
        return t6 != null;
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
    result.append(" (tfnname: ");
    result.append(tfnname);
    result.append(')');
    return result.toString();
  }

} //TypeNameOrFunctionCall2Impl
