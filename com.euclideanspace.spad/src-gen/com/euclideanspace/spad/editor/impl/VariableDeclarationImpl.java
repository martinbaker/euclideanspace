/**
 */
package com.euclideanspace.spad.editor.impl;

import com.euclideanspace.spad.editor.EditorPackage;
import com.euclideanspace.spad.editor.Expr;
import com.euclideanspace.spad.editor.VariableDeclaration;
import com.euclideanspace.spad.editor.VariableDeclarationBlock;
import com.euclideanspace.spad.editor.VariableTyped;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.spad.editor.impl.VariableDeclarationImpl#getT1 <em>T1</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.VariableDeclarationImpl#getV1 <em>V1</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.VariableDeclarationImpl#getV2 <em>V2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableDeclarationImpl extends WhereAssignmentsImpl implements VariableDeclaration
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
   * The cached value of the '{@link #getV1() <em>V1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getV1()
   * @generated
   * @ordered
   */
  protected VariableTyped v1;

  /**
   * The cached value of the '{@link #getV2() <em>V2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getV2()
   * @generated
   * @ordered
   */
  protected VariableDeclarationBlock v2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VariableDeclarationImpl()
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
    return EditorPackage.Literals.VARIABLE_DECLARATION;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.VARIABLE_DECLARATION__T1, oldT1, newT1);
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
        msgs = ((InternalEObject)t1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.VARIABLE_DECLARATION__T1, null, msgs);
      if (newT1 != null)
        msgs = ((InternalEObject)newT1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.VARIABLE_DECLARATION__T1, null, msgs);
      msgs = basicSetT1(newT1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.VARIABLE_DECLARATION__T1, newT1, newT1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableTyped getV1()
  {
    return v1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetV1(VariableTyped newV1, NotificationChain msgs)
  {
    VariableTyped oldV1 = v1;
    v1 = newV1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.VARIABLE_DECLARATION__V1, oldV1, newV1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setV1(VariableTyped newV1)
  {
    if (newV1 != v1)
    {
      NotificationChain msgs = null;
      if (v1 != null)
        msgs = ((InternalEObject)v1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.VARIABLE_DECLARATION__V1, null, msgs);
      if (newV1 != null)
        msgs = ((InternalEObject)newV1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.VARIABLE_DECLARATION__V1, null, msgs);
      msgs = basicSetV1(newV1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.VARIABLE_DECLARATION__V1, newV1, newV1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDeclarationBlock getV2()
  {
    return v2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetV2(VariableDeclarationBlock newV2, NotificationChain msgs)
  {
    VariableDeclarationBlock oldV2 = v2;
    v2 = newV2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.VARIABLE_DECLARATION__V2, oldV2, newV2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setV2(VariableDeclarationBlock newV2)
  {
    if (newV2 != v2)
    {
      NotificationChain msgs = null;
      if (v2 != null)
        msgs = ((InternalEObject)v2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.VARIABLE_DECLARATION__V2, null, msgs);
      if (newV2 != null)
        msgs = ((InternalEObject)newV2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.VARIABLE_DECLARATION__V2, null, msgs);
      msgs = basicSetV2(newV2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.VARIABLE_DECLARATION__V2, newV2, newV2));
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
      case EditorPackage.VARIABLE_DECLARATION__T1:
        return basicSetT1(null, msgs);
      case EditorPackage.VARIABLE_DECLARATION__V1:
        return basicSetV1(null, msgs);
      case EditorPackage.VARIABLE_DECLARATION__V2:
        return basicSetV2(null, msgs);
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
      case EditorPackage.VARIABLE_DECLARATION__T1:
        return getT1();
      case EditorPackage.VARIABLE_DECLARATION__V1:
        return getV1();
      case EditorPackage.VARIABLE_DECLARATION__V2:
        return getV2();
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
      case EditorPackage.VARIABLE_DECLARATION__T1:
        setT1((Expr)newValue);
        return;
      case EditorPackage.VARIABLE_DECLARATION__V1:
        setV1((VariableTyped)newValue);
        return;
      case EditorPackage.VARIABLE_DECLARATION__V2:
        setV2((VariableDeclarationBlock)newValue);
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
      case EditorPackage.VARIABLE_DECLARATION__T1:
        setT1((Expr)null);
        return;
      case EditorPackage.VARIABLE_DECLARATION__V1:
        setV1((VariableTyped)null);
        return;
      case EditorPackage.VARIABLE_DECLARATION__V2:
        setV2((VariableDeclarationBlock)null);
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
      case EditorPackage.VARIABLE_DECLARATION__T1:
        return t1 != null;
      case EditorPackage.VARIABLE_DECLARATION__V1:
        return v1 != null;
      case EditorPackage.VARIABLE_DECLARATION__V2:
        return v2 != null;
    }
    return super.eIsSet(featureID);
  }

} //VariableDeclarationImpl
