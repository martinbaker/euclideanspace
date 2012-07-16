/**
 */
package com.euclideanspace.spad.editor.impl;

import com.euclideanspace.spad.editor.EditorPackage;
import com.euclideanspace.spad.editor.FunctionDefinition;
import com.euclideanspace.spad.editor.FunctionSignature;
import com.euclideanspace.spad.editor.Statement;
import com.euclideanspace.spad.editor.TypeExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.spad.editor.impl.FunctionDefinitionImpl#getPar3 <em>Par3</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.FunctionDefinitionImpl#getPar4 <em>Par4</em>}</li>
 *   <li>{@link com.euclideanspace.spad.editor.impl.FunctionDefinitionImpl#getPar5 <em>Par5</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionDefinitionImpl extends AddStatementsImpl implements FunctionDefinition
{
  /**
   * The cached value of the '{@link #getPar3() <em>Par3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPar3()
   * @generated
   * @ordered
   */
  protected FunctionSignature par3;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FunctionDefinitionImpl()
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
    return EditorPackage.Literals.FUNCTION_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionSignature getPar3()
  {
    return par3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPar3(FunctionSignature newPar3, NotificationChain msgs)
  {
    FunctionSignature oldPar3 = par3;
    par3 = newPar3;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.FUNCTION_DEFINITION__PAR3, oldPar3, newPar3);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPar3(FunctionSignature newPar3)
  {
    if (newPar3 != par3)
    {
      NotificationChain msgs = null;
      if (par3 != null)
        msgs = ((InternalEObject)par3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.FUNCTION_DEFINITION__PAR3, null, msgs);
      if (newPar3 != null)
        msgs = ((InternalEObject)newPar3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.FUNCTION_DEFINITION__PAR3, null, msgs);
      msgs = basicSetPar3(newPar3, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.FUNCTION_DEFINITION__PAR3, newPar3, newPar3));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.FUNCTION_DEFINITION__PAR4, oldPar4, newPar4);
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
        msgs = ((InternalEObject)par4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.FUNCTION_DEFINITION__PAR4, null, msgs);
      if (newPar4 != null)
        msgs = ((InternalEObject)newPar4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.FUNCTION_DEFINITION__PAR4, null, msgs);
      msgs = basicSetPar4(newPar4, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.FUNCTION_DEFINITION__PAR4, newPar4, newPar4));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.FUNCTION_DEFINITION__PAR5, oldPar5, newPar5);
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
        msgs = ((InternalEObject)par5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.FUNCTION_DEFINITION__PAR5, null, msgs);
      if (newPar5 != null)
        msgs = ((InternalEObject)newPar5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.FUNCTION_DEFINITION__PAR5, null, msgs);
      msgs = basicSetPar5(newPar5, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.FUNCTION_DEFINITION__PAR5, newPar5, newPar5));
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
      case EditorPackage.FUNCTION_DEFINITION__PAR3:
        return basicSetPar3(null, msgs);
      case EditorPackage.FUNCTION_DEFINITION__PAR4:
        return basicSetPar4(null, msgs);
      case EditorPackage.FUNCTION_DEFINITION__PAR5:
        return basicSetPar5(null, msgs);
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
      case EditorPackage.FUNCTION_DEFINITION__PAR3:
        return getPar3();
      case EditorPackage.FUNCTION_DEFINITION__PAR4:
        return getPar4();
      case EditorPackage.FUNCTION_DEFINITION__PAR5:
        return getPar5();
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
      case EditorPackage.FUNCTION_DEFINITION__PAR3:
        setPar3((FunctionSignature)newValue);
        return;
      case EditorPackage.FUNCTION_DEFINITION__PAR4:
        setPar4((TypeExpression)newValue);
        return;
      case EditorPackage.FUNCTION_DEFINITION__PAR5:
        setPar5((Statement)newValue);
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
      case EditorPackage.FUNCTION_DEFINITION__PAR3:
        setPar3((FunctionSignature)null);
        return;
      case EditorPackage.FUNCTION_DEFINITION__PAR4:
        setPar4((TypeExpression)null);
        return;
      case EditorPackage.FUNCTION_DEFINITION__PAR5:
        setPar5((Statement)null);
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
      case EditorPackage.FUNCTION_DEFINITION__PAR3:
        return par3 != null;
      case EditorPackage.FUNCTION_DEFINITION__PAR4:
        return par4 != null;
      case EditorPackage.FUNCTION_DEFINITION__PAR5:
        return par5 != null;
    }
    return super.eIsSet(featureID);
  }

} //FunctionDefinitionImpl
