/**
 */
package com.euclideanspace.aldor.editor.impl;

import com.euclideanspace.aldor.editor.EditorPackage;
import com.euclideanspace.aldor.editor.Jleft_Molecule;
import com.euclideanspace.aldor.editor.Jright_Atom;
import com.euclideanspace.aldor.editor.Jright_Molecule;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Jright Molecule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.Jright_MoleculeImpl#getLeft3 <em>Left3</em>}</li>
 *   <li>{@link com.euclideanspace.aldor.editor.impl.Jright_MoleculeImpl#getRight3 <em>Right3</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Jright_MoleculeImpl extends RightJuxtaposedImpl implements Jright_Molecule
{
  /**
   * The cached value of the '{@link #getLeft3() <em>Left3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft3()
   * @generated
   * @ordered
   */
  protected Jleft_Molecule left3;

  /**
   * The cached value of the '{@link #getRight3() <em>Right3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRight3()
   * @generated
   * @ordered
   */
  protected Jright_Atom right3;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Jright_MoleculeImpl()
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
    return EditorPackage.Literals.JRIGHT_MOLECULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Jleft_Molecule getLeft3()
  {
    return left3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeft3(Jleft_Molecule newLeft3, NotificationChain msgs)
  {
    Jleft_Molecule oldLeft3 = left3;
    left3 = newLeft3;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.JRIGHT_MOLECULE__LEFT3, oldLeft3, newLeft3);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeft3(Jleft_Molecule newLeft3)
  {
    if (newLeft3 != left3)
    {
      NotificationChain msgs = null;
      if (left3 != null)
        msgs = ((InternalEObject)left3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.JRIGHT_MOLECULE__LEFT3, null, msgs);
      if (newLeft3 != null)
        msgs = ((InternalEObject)newLeft3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.JRIGHT_MOLECULE__LEFT3, null, msgs);
      msgs = basicSetLeft3(newLeft3, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.JRIGHT_MOLECULE__LEFT3, newLeft3, newLeft3));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Jright_Atom getRight3()
  {
    return right3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRight3(Jright_Atom newRight3, NotificationChain msgs)
  {
    Jright_Atom oldRight3 = right3;
    right3 = newRight3;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.JRIGHT_MOLECULE__RIGHT3, oldRight3, newRight3);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRight3(Jright_Atom newRight3)
  {
    if (newRight3 != right3)
    {
      NotificationChain msgs = null;
      if (right3 != null)
        msgs = ((InternalEObject)right3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.JRIGHT_MOLECULE__RIGHT3, null, msgs);
      if (newRight3 != null)
        msgs = ((InternalEObject)newRight3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.JRIGHT_MOLECULE__RIGHT3, null, msgs);
      msgs = basicSetRight3(newRight3, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.JRIGHT_MOLECULE__RIGHT3, newRight3, newRight3));
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
      case EditorPackage.JRIGHT_MOLECULE__LEFT3:
        return basicSetLeft3(null, msgs);
      case EditorPackage.JRIGHT_MOLECULE__RIGHT3:
        return basicSetRight3(null, msgs);
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
      case EditorPackage.JRIGHT_MOLECULE__LEFT3:
        return getLeft3();
      case EditorPackage.JRIGHT_MOLECULE__RIGHT3:
        return getRight3();
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
      case EditorPackage.JRIGHT_MOLECULE__LEFT3:
        setLeft3((Jleft_Molecule)newValue);
        return;
      case EditorPackage.JRIGHT_MOLECULE__RIGHT3:
        setRight3((Jright_Atom)newValue);
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
      case EditorPackage.JRIGHT_MOLECULE__LEFT3:
        setLeft3((Jleft_Molecule)null);
        return;
      case EditorPackage.JRIGHT_MOLECULE__RIGHT3:
        setRight3((Jright_Atom)null);
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
      case EditorPackage.JRIGHT_MOLECULE__LEFT3:
        return left3 != null;
      case EditorPackage.JRIGHT_MOLECULE__RIGHT3:
        return right3 != null;
    }
    return super.eIsSet(featureID);
  }

} //Jright_MoleculeImpl
