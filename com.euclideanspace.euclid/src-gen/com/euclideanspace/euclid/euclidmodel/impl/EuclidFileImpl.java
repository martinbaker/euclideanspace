/**
 */
package com.euclideanspace.euclid.euclidmodel.impl;

import com.euclideanspace.euclid.euclidmodel.EuclidFile;
import com.euclideanspace.euclid.euclidmodel.EuclidImport;
import com.euclideanspace.euclid.euclidmodel.EuclidTypeDeclaration;
import com.euclideanspace.euclid.euclidmodel.EuclidmodelPackage;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Euclid File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.euclid.euclidmodel.impl.EuclidFileImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.euclidmodel.impl.EuclidFileImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.euclidmodel.impl.EuclidFileImpl#getEuclidTypes <em>Euclid Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EuclidFileImpl extends MinimalEObjectImpl.Container implements EuclidFile
{
  /**
   * The default value of the '{@link #getPackage() <em>Package</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackage()
   * @generated
   * @ordered
   */
  protected static final String PACKAGE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPackage() <em>Package</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackage()
   * @generated
   * @ordered
   */
  protected String package_ = PACKAGE_EDEFAULT;

  /**
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<EuclidImport> imports;

  /**
   * The cached value of the '{@link #getEuclidTypes() <em>Euclid Types</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEuclidTypes()
   * @generated
   * @ordered
   */
  protected EList<EuclidTypeDeclaration> euclidTypes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EuclidFileImpl()
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
    return EuclidmodelPackage.Literals.EUCLID_FILE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPackage()
  {
    return package_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPackage(String newPackage)
  {
    String oldPackage = package_;
    package_ = newPackage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EuclidmodelPackage.EUCLID_FILE__PACKAGE, oldPackage, package_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EuclidImport> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<EuclidImport>(EuclidImport.class, this, EuclidmodelPackage.EUCLID_FILE__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EuclidTypeDeclaration> getEuclidTypes()
  {
    if (euclidTypes == null)
    {
      euclidTypes = new EObjectContainmentEList<EuclidTypeDeclaration>(EuclidTypeDeclaration.class, this, EuclidmodelPackage.EUCLID_FILE__EUCLID_TYPES);
    }
    return euclidTypes;
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
      case EuclidmodelPackage.EUCLID_FILE__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case EuclidmodelPackage.EUCLID_FILE__EUCLID_TYPES:
        return ((InternalEList<?>)getEuclidTypes()).basicRemove(otherEnd, msgs);
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
      case EuclidmodelPackage.EUCLID_FILE__PACKAGE:
        return getPackage();
      case EuclidmodelPackage.EUCLID_FILE__IMPORTS:
        return getImports();
      case EuclidmodelPackage.EUCLID_FILE__EUCLID_TYPES:
        return getEuclidTypes();
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
      case EuclidmodelPackage.EUCLID_FILE__PACKAGE:
        setPackage((String)newValue);
        return;
      case EuclidmodelPackage.EUCLID_FILE__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends EuclidImport>)newValue);
        return;
      case EuclidmodelPackage.EUCLID_FILE__EUCLID_TYPES:
        getEuclidTypes().clear();
        getEuclidTypes().addAll((Collection<? extends EuclidTypeDeclaration>)newValue);
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
      case EuclidmodelPackage.EUCLID_FILE__PACKAGE:
        setPackage(PACKAGE_EDEFAULT);
        return;
      case EuclidmodelPackage.EUCLID_FILE__IMPORTS:
        getImports().clear();
        return;
      case EuclidmodelPackage.EUCLID_FILE__EUCLID_TYPES:
        getEuclidTypes().clear();
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
      case EuclidmodelPackage.EUCLID_FILE__PACKAGE:
        return PACKAGE_EDEFAULT == null ? package_ != null : !PACKAGE_EDEFAULT.equals(package_);
      case EuclidmodelPackage.EUCLID_FILE__IMPORTS:
        return imports != null && !imports.isEmpty();
      case EuclidmodelPackage.EUCLID_FILE__EUCLID_TYPES:
        return euclidTypes != null && !euclidTypes.isEmpty();
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
    result.append(" (package: ");
    result.append(package_);
    result.append(')');
    return result.toString();
  }

} //EuclidFileImpl
