/**
 */
package com.euclideanspace.aldor.editor.impl;

import com.euclideanspace.aldor.editor.CurlyContentsList_Labeled;
import com.euclideanspace.aldor.editor.EditorPackage;
import com.euclideanspace.aldor.editor.Labeled;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Curly Contents List Labeled</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.CurlyContentsList_LabeledImpl#getStatemts <em>Statemts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CurlyContentsList_LabeledImpl extends CurlyContents_LabeledImpl implements CurlyContentsList_Labeled
{
  /**
   * The cached value of the '{@link #getStatemts() <em>Statemts</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatemts()
   * @generated
   * @ordered
   */
  protected EList<Labeled> statemts;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CurlyContentsList_LabeledImpl()
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
    return EditorPackage.Literals.CURLY_CONTENTS_LIST_LABELED;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Labeled> getStatemts()
  {
    if (statemts == null)
    {
      statemts = new EObjectContainmentEList<Labeled>(Labeled.class, this, EditorPackage.CURLY_CONTENTS_LIST_LABELED__STATEMTS);
    }
    return statemts;
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
      case EditorPackage.CURLY_CONTENTS_LIST_LABELED__STATEMTS:
        return ((InternalEList<?>)getStatemts()).basicRemove(otherEnd, msgs);
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
      case EditorPackage.CURLY_CONTENTS_LIST_LABELED__STATEMTS:
        return getStatemts();
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
      case EditorPackage.CURLY_CONTENTS_LIST_LABELED__STATEMTS:
        getStatemts().clear();
        getStatemts().addAll((Collection<? extends Labeled>)newValue);
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
      case EditorPackage.CURLY_CONTENTS_LIST_LABELED__STATEMTS:
        getStatemts().clear();
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
      case EditorPackage.CURLY_CONTENTS_LIST_LABELED__STATEMTS:
        return statemts != null && !statemts.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //CurlyContentsList_LabeledImpl
