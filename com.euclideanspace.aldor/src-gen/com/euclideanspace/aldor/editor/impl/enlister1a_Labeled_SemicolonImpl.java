/**
 */
package com.euclideanspace.aldor.editor.impl;

import com.euclideanspace.aldor.editor.EditorPackage;
import com.euclideanspace.aldor.editor.Labeled;
import com.euclideanspace.aldor.editor.enlister1a_Labeled_Semicolon;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>enlister1a Labeled Semicolon</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.enlister1a_Labeled_SemicolonImpl#getStatemnts <em>Statemnts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class enlister1a_Labeled_SemicolonImpl extends enlist1a_Labeled_Semicolon_ABImpl implements enlister1a_Labeled_Semicolon
{
  /**
   * The cached value of the '{@link #getStatemnts() <em>Statemnts</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatemnts()
   * @generated
   * @ordered
   */
  protected EList<Labeled> statemnts;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected enlister1a_Labeled_SemicolonImpl()
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
    return EditorPackage.Literals.ENLISTER1A_LABELED_SEMICOLON;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Labeled> getStatemnts()
  {
    if (statemnts == null)
    {
      statemnts = new EObjectContainmentEList<Labeled>(Labeled.class, this, EditorPackage.ENLISTER1A_LABELED_SEMICOLON__STATEMNTS);
    }
    return statemnts;
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
      case EditorPackage.ENLISTER1A_LABELED_SEMICOLON__STATEMNTS:
        return ((InternalEList<?>)getStatemnts()).basicRemove(otherEnd, msgs);
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
      case EditorPackage.ENLISTER1A_LABELED_SEMICOLON__STATEMNTS:
        return getStatemnts();
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
      case EditorPackage.ENLISTER1A_LABELED_SEMICOLON__STATEMNTS:
        getStatemnts().clear();
        getStatemnts().addAll((Collection<? extends Labeled>)newValue);
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
      case EditorPackage.ENLISTER1A_LABELED_SEMICOLON__STATEMNTS:
        getStatemnts().clear();
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
      case EditorPackage.ENLISTER1A_LABELED_SEMICOLON__STATEMNTS:
        return statemnts != null && !statemnts.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //enlister1a_Labeled_SemicolonImpl
