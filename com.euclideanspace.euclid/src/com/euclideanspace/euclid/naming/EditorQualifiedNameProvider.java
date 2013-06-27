/*package com.euclideanspace.euclid.naming;

import org.eclipse.emf.ecore.EObject;
import com.euclideanspace.euclid.euclidmodel.EuclidConstructor;
import com.euclideanspace.euclid.euclidmodel.EuclidField;
import com.euclideanspace.euclid.euclidmodel.EuclidFile;
import com.euclideanspace.euclid.euclidmodel.EuclidFunction;
import com.euclideanspace.euclid.euclidmodel.EuclidTypeDeclaration;
import org.eclipse.xtext.common.types.JvmAnnotationType;
import org.eclipse.xtext.common.types.JvmConstructor;
import org.eclipse.xtext.common.types.JvmEnumerationType;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.scoping.XbaseQualifiedNameProvider;
import com.google.inject.Inject;

public class EditorQualifiedNameProvider extends XbaseQualifiedNameProvider {

@Inject
private IQualifiedNameConverter qualifiedNameConverter;

@Override
public QualifiedName getFullyQualifiedName(EObject obj) {
  if (obj instanceof EuclidTypeDeclaration) {
    EuclidTypeDeclaration typeDecl = (EuclidTypeDeclaration) obj;
    if (typeDecl.getName() == null)
      return null;
    EuclidFile file = (EuclidFile) typeDecl.eContainer();
    final String qualifiedName = (file.getPackage() != null ? file.getPackage() + "." : "")
      + typeDecl.getName();
    return qualifiedNameConverter.toQualifiedName(qualifiedName);
  }
  
  if(obj instanceof EuclidConstructor) {
    return getFullyQualifiedName(obj.eContainer());
  }
  
  if (obj instanceof JvmGenericType
    || obj instanceof JvmAnnotationType
    || obj instanceof JvmEnumerationType
    || obj instanceof JvmOperation
    || obj instanceof JvmConstructor
    || obj instanceof JvmField
    || obj instanceof EuclidField
    || obj instanceof EuclidFunction) {
    return super.getFullyQualifiedName(obj);
    }
  return null;
}

}*/
