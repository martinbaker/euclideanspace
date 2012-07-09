/**
 */
package com.euclideanspace.euclid.editor.impl;

import com.euclideanspace.euclid.editor.EditorPackage;
import com.euclideanspace.euclid.editor.FunctionDef;
import com.euclideanspace.euclid.editor.Reference;
import com.euclideanspace.euclid.editor.ValueDef;
import com.euclideanspace.euclid.editor.VariableDef;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.euclid.editor.impl.ClassImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.editor.impl.ClassImpl#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.editor.impl.ClassImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.editor.impl.ClassImpl#getValues <em>Values</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.editor.impl.ClassImpl#getReferences <em>References</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.editor.impl.ClassImpl#getFunctions <em>Functions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassImpl extends MinimalEObjectImpl.Container implements com.euclideanspace.euclid.editor.Class
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getSuperType() <em>Super Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperType()
   * @generated
   * @ordered
   */
  protected JvmTypeReference superType;

  /**
   * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariables()
   * @generated
   * @ordered
   */
  protected EList<VariableDef> variables;

  /**
   * The cached value of the '{@link #getValues() <em>Values</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValues()
   * @generated
   * @ordered
   */
  protected EList<ValueDef> values;

  /**
   * The cached value of the '{@link #getReferences() <em>References</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferences()
   * @generated
   * @ordered
   */
  protected EList<Reference> references;

  /**
   * The cached value of the '{@link #getFunctions() <em>Functions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunctions()
   * @generated
   * @ordered
   */
  protected EList<FunctionDef> functions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ClassImpl()
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
    return EditorPackage.Literals.CLASS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.CLASS__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmTypeReference getSuperType()
  {
    return superType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSuperType(JvmTypeReference newSuperType, NotificationChain msgs)
  {
    JvmTypeReference oldSuperType = superType;
    superType = newSuperType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.CLASS__SUPER_TYPE, oldSuperType, newSuperType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSuperType(JvmTypeReference newSuperType)
  {
    if (newSuperType != superType)
    {
      NotificationChain msgs = null;
      if (superType != null)
        msgs = ((InternalEObject)superType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.CLASS__SUPER_TYPE, null, msgs);
      if (newSuperType != null)
        msgs = ((InternalEObject)newSuperType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.CLASS__SUPER_TYPE, null, msgs);
      msgs = basicSetSuperType(newSuperType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.CLASS__SUPER_TYPE, newSuperType, newSuperType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<VariableDef> getVariables()
  {
    if (variables == null)
    {
      variables = new EObjectContainmentEList<VariableDef>(VariableDef.class, this, EditorPackage.CLASS__VARIABLES);
    }
    return variables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ValueDef> getValues()
  {
    if (values == null)
    {
      values = new EObjectContainmentEList<ValueDef>(ValueDef.class, this, EditorPackage.CLASS__VALUES);
    }
    return values;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Reference> getReferences()
  {
    if (references == null)
    {
      references = new EObjectContainmentEList<Reference>(Reference.class, this, EditorPackage.CLASS__REFERENCES);
    }
    return references;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FunctionDef> getFunctions()
  {
    if (functions == null)
    {
      functions = new EObjectContainmentEList<FunctionDef>(FunctionDef.class, this, EditorPackage.CLASS__FUNCTIONS);
    }
    return functions;
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
      case EditorPackage.CLASS__SUPER_TYPE:
        return basicSetSuperType(null, msgs);
      case EditorPackage.CLASS__VARIABLES:
        return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
      case EditorPackage.CLASS__VALUES:
        return ((InternalEList<?>)getValues()).basicRemove(otherEnd, msgs);
      case EditorPackage.CLASS__REFERENCES:
        return ((InternalEList<?>)getReferences()).basicRemove(otherEnd, msgs);
      case EditorPackage.CLASS__FUNCTIONS:
        return ((InternalEList<?>)getFunctions()).basicRemove(otherEnd, msgs);
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
      case EditorPackage.CLASS__NAME:
        return getName();
      case EditorPackage.CLASS__SUPER_TYPE:
        return getSuperType();
      case EditorPackage.CLASS__VARIABLES:
        return getVariables();
      case EditorPackage.CLASS__VALUES:
        return getValues();
      case EditorPackage.CLASS__REFERENCES:
        return getReferences();
      case EditorPackage.CLASS__FUNCTIONS:
        return getFunctions();
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
      case EditorPackage.CLASS__NAME:
        setName((String)newValue);
        return;
      case EditorPackage.CLASS__SUPER_TYPE:
        setSuperType((JvmTypeReference)newValue);
        return;
      case EditorPackage.CLASS__VARIABLES:
        getVariables().clear();
        getVariables().addAll((Collection<? extends VariableDef>)newValue);
        return;
      case EditorPackage.CLASS__VALUES:
        getValues().clear();
        getValues().addAll((Collection<? extends ValueDef>)newValue);
        return;
      case EditorPackage.CLASS__REFERENCES:
        getReferences().clear();
        getReferences().addAll((Collection<? extends Reference>)newValue);
        return;
      case EditorPackage.CLASS__FUNCTIONS:
        getFunctions().clear();
        getFunctions().addAll((Collection<? extends FunctionDef>)newValue);
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
      case EditorPackage.CLASS__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EditorPackage.CLASS__SUPER_TYPE:
        setSuperType((JvmTypeReference)null);
        return;
      case EditorPackage.CLASS__VARIABLES:
        getVariables().clear();
        return;
      case EditorPackage.CLASS__VALUES:
        getValues().clear();
        return;
      case EditorPackage.CLASS__REFERENCES:
        getReferences().clear();
        return;
      case EditorPackage.CLASS__FUNCTIONS:
        getFunctions().clear();
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
      case EditorPackage.CLASS__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EditorPackage.CLASS__SUPER_TYPE:
        return superType != null;
      case EditorPackage.CLASS__VARIABLES:
        return variables != null && !variables.isEmpty();
      case EditorPackage.CLASS__VALUES:
        return values != null && !values.isEmpty();
      case EditorPackage.CLASS__REFERENCES:
        return references != null && !references.isEmpty();
      case EditorPackage.CLASS__FUNCTIONS:
        return functions != null && !functions.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ClassImpl
