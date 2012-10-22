/**
 */
package com.euclideanspace.euclid.euclidmodel.impl;

import com.euclideanspace.euclid.euclidmodel.EuclidImport;
import com.euclideanspace.euclid.euclidmodel.EuclidmodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.xtext.common.types.JvmType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Euclid Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.euclid.euclidmodel.impl.EuclidImportImpl#isStatic <em>Static</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.euclidmodel.impl.EuclidImportImpl#isExtension <em>Extension</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.euclidmodel.impl.EuclidImportImpl#getImportedType <em>Imported Type</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.euclidmodel.impl.EuclidImportImpl#getImportedNamespace <em>Imported Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EuclidImportImpl extends MinimalEObjectImpl.Container implements EuclidImport
{
  /**
   * The default value of the '{@link #isStatic() <em>Static</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isStatic()
   * @generated
   * @ordered
   */
  protected static final boolean STATIC_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isStatic() <em>Static</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isStatic()
   * @generated
   * @ordered
   */
  protected boolean static_ = STATIC_EDEFAULT;

  /**
   * The default value of the '{@link #isExtension() <em>Extension</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isExtension()
   * @generated
   * @ordered
   */
  protected static final boolean EXTENSION_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isExtension() <em>Extension</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isExtension()
   * @generated
   * @ordered
   */
  protected boolean extension = EXTENSION_EDEFAULT;

  /**
   * The cached value of the '{@link #getImportedType() <em>Imported Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportedType()
   * @generated
   * @ordered
   */
  protected JvmType importedType;

  /**
   * The default value of the '{@link #getImportedNamespace() <em>Imported Namespace</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportedNamespace()
   * @generated
   * @ordered
   */
  protected static final String IMPORTED_NAMESPACE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getImportedNamespace() <em>Imported Namespace</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportedNamespace()
   * @generated
   * @ordered
   */
  protected String importedNamespace = IMPORTED_NAMESPACE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EuclidImportImpl()
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
    return EuclidmodelPackage.Literals.EUCLID_IMPORT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isStatic()
  {
    return static_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStatic(boolean newStatic)
  {
    boolean oldStatic = static_;
    static_ = newStatic;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EuclidmodelPackage.EUCLID_IMPORT__STATIC, oldStatic, static_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isExtension()
  {
    return extension;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExtension(boolean newExtension)
  {
    boolean oldExtension = extension;
    extension = newExtension;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EuclidmodelPackage.EUCLID_IMPORT__EXTENSION, oldExtension, extension));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmType getImportedType()
  {
    if (importedType != null && importedType.eIsProxy())
    {
      InternalEObject oldImportedType = (InternalEObject)importedType;
      importedType = (JvmType)eResolveProxy(oldImportedType);
      if (importedType != oldImportedType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EuclidmodelPackage.EUCLID_IMPORT__IMPORTED_TYPE, oldImportedType, importedType));
      }
    }
    return importedType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmType basicGetImportedType()
  {
    return importedType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImportedType(JvmType newImportedType)
  {
    JvmType oldImportedType = importedType;
    importedType = newImportedType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EuclidmodelPackage.EUCLID_IMPORT__IMPORTED_TYPE, oldImportedType, importedType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getImportedNamespace()
  {
    return importedNamespace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImportedNamespace(String newImportedNamespace)
  {
    String oldImportedNamespace = importedNamespace;
    importedNamespace = newImportedNamespace;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EuclidmodelPackage.EUCLID_IMPORT__IMPORTED_NAMESPACE, oldImportedNamespace, importedNamespace));
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
      case EuclidmodelPackage.EUCLID_IMPORT__STATIC:
        return isStatic();
      case EuclidmodelPackage.EUCLID_IMPORT__EXTENSION:
        return isExtension();
      case EuclidmodelPackage.EUCLID_IMPORT__IMPORTED_TYPE:
        if (resolve) return getImportedType();
        return basicGetImportedType();
      case EuclidmodelPackage.EUCLID_IMPORT__IMPORTED_NAMESPACE:
        return getImportedNamespace();
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
      case EuclidmodelPackage.EUCLID_IMPORT__STATIC:
        setStatic((Boolean)newValue);
        return;
      case EuclidmodelPackage.EUCLID_IMPORT__EXTENSION:
        setExtension((Boolean)newValue);
        return;
      case EuclidmodelPackage.EUCLID_IMPORT__IMPORTED_TYPE:
        setImportedType((JvmType)newValue);
        return;
      case EuclidmodelPackage.EUCLID_IMPORT__IMPORTED_NAMESPACE:
        setImportedNamespace((String)newValue);
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
      case EuclidmodelPackage.EUCLID_IMPORT__STATIC:
        setStatic(STATIC_EDEFAULT);
        return;
      case EuclidmodelPackage.EUCLID_IMPORT__EXTENSION:
        setExtension(EXTENSION_EDEFAULT);
        return;
      case EuclidmodelPackage.EUCLID_IMPORT__IMPORTED_TYPE:
        setImportedType((JvmType)null);
        return;
      case EuclidmodelPackage.EUCLID_IMPORT__IMPORTED_NAMESPACE:
        setImportedNamespace(IMPORTED_NAMESPACE_EDEFAULT);
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
      case EuclidmodelPackage.EUCLID_IMPORT__STATIC:
        return static_ != STATIC_EDEFAULT;
      case EuclidmodelPackage.EUCLID_IMPORT__EXTENSION:
        return extension != EXTENSION_EDEFAULT;
      case EuclidmodelPackage.EUCLID_IMPORT__IMPORTED_TYPE:
        return importedType != null;
      case EuclidmodelPackage.EUCLID_IMPORT__IMPORTED_NAMESPACE:
        return IMPORTED_NAMESPACE_EDEFAULT == null ? importedNamespace != null : !IMPORTED_NAMESPACE_EDEFAULT.equals(importedNamespace);
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
    result.append(" (static: ");
    result.append(static_);
    result.append(", extension: ");
    result.append(extension);
    result.append(", importedNamespace: ");
    result.append(importedNamespace);
    result.append(')');
    return result.toString();
  }

} //EuclidImportImpl
