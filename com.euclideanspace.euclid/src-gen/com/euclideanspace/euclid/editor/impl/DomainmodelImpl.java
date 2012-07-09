/**
 */
package com.euclideanspace.euclid.editor.impl;

import com.euclideanspace.euclid.editor.Domainmodel;
import com.euclideanspace.euclid.editor.EditorPackage;
import com.euclideanspace.euclid.editor.Import;
import com.euclideanspace.euclid.editor.PackageDeclaration;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domainmodel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.euclid.editor.impl.DomainmodelImpl#getPackages <em>Packages</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.editor.impl.DomainmodelImpl#getImportss <em>Importss</em>}</li>
 *   <li>{@link com.euclideanspace.euclid.editor.impl.DomainmodelImpl#getClasses <em>Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DomainmodelImpl extends MinimalEObjectImpl.Container implements Domainmodel
{
  /**
   * The cached value of the '{@link #getPackages() <em>Packages</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackages()
   * @generated
   * @ordered
   */
  protected EList<PackageDeclaration> packages;

  /**
   * The cached value of the '{@link #getImportss() <em>Importss</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportss()
   * @generated
   * @ordered
   */
  protected EList<Import> importss;

  /**
   * The cached value of the '{@link #getClasses() <em>Classes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClasses()
   * @generated
   * @ordered
   */
  protected EList<com.euclideanspace.euclid.editor.Class> classes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DomainmodelImpl()
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
    return EditorPackage.Literals.DOMAINMODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PackageDeclaration> getPackages()
  {
    if (packages == null)
    {
      packages = new EObjectContainmentEList<PackageDeclaration>(PackageDeclaration.class, this, EditorPackage.DOMAINMODEL__PACKAGES);
    }
    return packages;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Import> getImportss()
  {
    if (importss == null)
    {
      importss = new EObjectContainmentEList<Import>(Import.class, this, EditorPackage.DOMAINMODEL__IMPORTSS);
    }
    return importss;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<com.euclideanspace.euclid.editor.Class> getClasses()
  {
    if (classes == null)
    {
      classes = new EObjectContainmentEList<com.euclideanspace.euclid.editor.Class>(com.euclideanspace.euclid.editor.Class.class, this, EditorPackage.DOMAINMODEL__CLASSES);
    }
    return classes;
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
      case EditorPackage.DOMAINMODEL__PACKAGES:
        return ((InternalEList<?>)getPackages()).basicRemove(otherEnd, msgs);
      case EditorPackage.DOMAINMODEL__IMPORTSS:
        return ((InternalEList<?>)getImportss()).basicRemove(otherEnd, msgs);
      case EditorPackage.DOMAINMODEL__CLASSES:
        return ((InternalEList<?>)getClasses()).basicRemove(otherEnd, msgs);
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
      case EditorPackage.DOMAINMODEL__PACKAGES:
        return getPackages();
      case EditorPackage.DOMAINMODEL__IMPORTSS:
        return getImportss();
      case EditorPackage.DOMAINMODEL__CLASSES:
        return getClasses();
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
      case EditorPackage.DOMAINMODEL__PACKAGES:
        getPackages().clear();
        getPackages().addAll((Collection<? extends PackageDeclaration>)newValue);
        return;
      case EditorPackage.DOMAINMODEL__IMPORTSS:
        getImportss().clear();
        getImportss().addAll((Collection<? extends Import>)newValue);
        return;
      case EditorPackage.DOMAINMODEL__CLASSES:
        getClasses().clear();
        getClasses().addAll((Collection<? extends com.euclideanspace.euclid.editor.Class>)newValue);
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
      case EditorPackage.DOMAINMODEL__PACKAGES:
        getPackages().clear();
        return;
      case EditorPackage.DOMAINMODEL__IMPORTSS:
        getImportss().clear();
        return;
      case EditorPackage.DOMAINMODEL__CLASSES:
        getClasses().clear();
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
      case EditorPackage.DOMAINMODEL__PACKAGES:
        return packages != null && !packages.isEmpty();
      case EditorPackage.DOMAINMODEL__IMPORTSS:
        return importss != null && !importss.isEmpty();
      case EditorPackage.DOMAINMODEL__CLASSES:
        return classes != null && !classes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DomainmodelImpl
