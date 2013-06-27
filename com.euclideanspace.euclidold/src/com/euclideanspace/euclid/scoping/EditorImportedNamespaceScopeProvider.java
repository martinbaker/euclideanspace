package com.euclideanspace.euclid.scoping;

import static com.google.common.collect.Lists.*;

import java.util.Collections;
import static java.util.Collections.*;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtend.expression.Resource;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmTypeParameter;
import org.eclipse.xtext.common.types.JvmTypeParameterDeclarator;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.ISelectable;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.ImportNormalizer;
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider;
import org.eclipse.xtext.scoping.impl.MapBasedScope;
import org.eclipse.xtext.scoping.impl.ScopeBasedSelectable;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.xbase.scoping.XbaseImportedNamespaceScopeProvider;
//import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations;
import com.euclideanspace.euclid.euclidmodel.EuclidFile;
import com.euclideanspace.euclid.euclidmodel.EuclidImport;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.inject.Inject;

/**
 * extends ImportedNamespaceAwareLocalScopeProvider
 * http://git.eclipse.org/c/tmf/org.eclipse.xtext.git/plain/plugins/org.eclipse.xtext/src/org/eclipse/xtext/scoping/impl/ImportedNamespaceAwareLocalScopeProvider.java
 * 
 * This is a local scope provider that understands namespace imports.
 * 
 * It scans model elements for an EAttribute <code>importedNamespace</code>. The value of this attribute is interpreted
 * as qualified name to be imported. Wildcards are supported (see {@link #getWildCard()} for details).
 * 
 * Imports are valid for all elements in the same container and their children.
 * 
 * In the case of xtend then XbaseImportedNamespaceScopeProvider
 * is extended instead.
 * http://git.eclipse.org/c/tmf/org.eclipse.xtext.git/plain/plugins/org.eclipse.xtext.xbase/src/org/eclipse/xtext/xbase/scoping/XbaseImportedNamespaceScopeProvider.java
 */
public class EditorImportedNamespaceScopeProvider extends
		ImportedNamespaceAwareLocalScopeProvider {

	/**
	 * Converts QualifiedNames to strings and back
	 */
	@Inject private IQualifiedNameConverter qualifiedNameConverter;
//	@Inject private IJvmModelAssociations associations;

	public static final QualifiedName JAVA_LANG = QualifiedName.create("java","lang");
	public static final QualifiedName EUCLID_LIB = QualifiedName.create("com","euclideanspace","euclid","Editor");
	//public static final QualifiedName EUCLID_LIB = QualifiedName.create("interfaces");

	// automatically import all types from the package we are in
	@Override
	protected List<ImportNormalizer> internalGetImportedNamespaceResolvers(
			EObject context, boolean ignoreCase) {
		  if (!(context instanceof EuclidFile)) return Collections.emptyList();
		  EuclidFile file = (EuclidFile) context;
		  List<ImportNormalizer> importedNamespaceResolvers = Lists.newArrayList();
		  // add the import statements
		  for (EuclidImport imp : file.getImports()) {
//		    if (!imp.isStatic()) {
		      String value = imp.getImportedNamespace();
		      if (value == null) {
				value = imp.getImportedType().getQualifiedName();
		       System.out.println(file.getPackage()+" importedType="+value);
		      } else {
			   System.out.println(file.getPackage()+" ImportedNamespace="+value);		    	  
		      }
	          ImportNormalizer resolver = createImportedNamespaceResolver(value, ignoreCase);
		      if (resolver != null)
		        importedNamespaceResolvers.add(resolver);
//		    }
		   }
		  // then add types from own package
		  if (!Strings.isEmpty(file.getPackage())) {
		    importedNamespaceResolvers.add(
		      // construct ImportNormalizer with wildCard set to true
		      // ImportNormalizer constructor has this form:
		      // ImportNormalizer(QualifiedName importedNamespace, boolean wildCard, boolean ignoreCase)
              // https://github.com/eclipse/xtext/blob/master/plugins/org.eclipse.xtext/src/org/eclipse/xtext/scoping/impl/ImportNormalizer.java
		      new ImportNormalizer(
		        qualifiedNameConverter.toQualifiedName(
                  file.getPackage()
                ), true, ignoreCase
              )
		    );
		  }
		return importedNamespaceResolvers;
	}


/* from: xtend
	@Override
	protected List<ImportNormalizer> internalGetImportedNamespaceResolvers(EObject context, boolean ignoreCase) {
	  if (!(context instanceof EuclidFile)) return Collections.emptyList();
	  EuclidFile file = (EuclidFile) context;
	  List<ImportNormalizer> importedNamespaceResolvers = Lists.newArrayList();
	  for (EuclidImport imp : file.getImports()) {
	    if (!imp.isStatic()) {
	      String value = imp.getImportedNamespace();
	      if (value == null)
	        value = imp.getImportedTypeName();
	      ImportNormalizer resolver = createImportedNamespaceResolver(value, ignoreCase);
	      if (resolver != null)
	        importedNamespaceResolvers.add(resolver);
	    }
	  }
	  if (!Strings.isEmpty(((XtendFile) context).getPackage())) {
	    importedNamespaceResolvers.add(new ImportNormalizer(nameConverter.toQualifiedName(((XtendFile) context)
	      .getPackage()), true, ignoreCase));
	  }
	  return importedNamespaceResolvers;
    }
*/

/*	@Override
	protected IScope internalGetScope(IScope parent, IScope globalScope, EObject context, EReference reference) {
	  if (context instanceof EuclidImport) {
	    return globalScope;
	  } else {
	    return super.internalGetScope(parent, globalScope, context, reference);
	  }
	}*/


/*	protected IScope internalGetScope(IScope parent, IScope globalScope, EObject context, EReference reference) {
		if (context instanceof EuclidImport) return globalScope;
		IScope result = parent;
		if (context.eContainer() == null) {
			if (parent != globalScope)
				throw new IllegalStateException("the parent should be the global scope");
			result = getResourceScope(globalScope, (Resource) context.eResource(), reference);
		} else {
			result = internalGetScope(parent, globalScope, context.eContainer(), reference);
		}
		return getLocalElementsScope(result, globalScope, context, reference);
	}

	protected IScope getResourceScope(IScope globalScope, @SuppressWarnings("unused") Resource res, EReference reference) {
		IScope result = globalScope;
		ISelectable globalScopeSelectable = new ScopeBasedSelectable(result);
		
		// implicit imports (i.e. java.lang.*)
		List<ImportNormalizer> normalizers = getImplicitImports(isIgnoreCase(reference));
		if (!normalizers.isEmpty()) {
			result = createImportScope(result, normalizers, globalScopeSelectable, reference.getEReferenceType(), isIgnoreCase(reference));
		}
		
		return result;
	}

	protected IScope getLocalElementsScope(IScope parent, IScope globalScope, EObject context, EReference reference) {
		IScope result = parent;
		QualifiedName name = getQualifiedNameOfLocalElement(context);
		boolean ignoreCase = isIgnoreCase(reference);
		ISelectable resourceOnlySelectable = getAllDescriptions(context.eResource());
		ISelectable globalScopeSelectable = new ScopeBasedSelectable(globalScope);
		
		// imports
		List<ImportNormalizer> explicitImports = getImportedNamespaceResolvers(context, ignoreCase);
		if (!explicitImports.isEmpty()) {
			result = createImportScope(result, explicitImports, globalScopeSelectable, reference.getEReferenceType(), ignoreCase);
		}
		
		// local element
		if (name!=null) {
			ImportNormalizer localNormalizer = new ImportNormalizer(name, true, ignoreCase); 
			result = createImportScope(result, singletonList(localNormalizer), resourceOnlySelectable, reference.getEReferenceType(), ignoreCase);
		}
		
		// scope for jvm elements
		Set<EObject> elements = associations.getJvmElements(context);
		for (EObject derivedJvmElement : elements) {
			// scope for JvmDeclaredTypes
			if (derivedJvmElement instanceof JvmDeclaredType) {
				JvmDeclaredType declaredType = (JvmDeclaredType) derivedJvmElement;
				QualifiedName jvmTypeName = getQualifiedNameOfLocalElement(declaredType);
				if (declaredType.getDeclaringType() == null && !Strings.isEmpty(declaredType.getPackageName())) {
					QualifiedName packageName = this.qualifiedNameConverter.toQualifiedName(declaredType.getPackageName());
					ImportNormalizer normalizer = new ImportNormalizer(packageName, true, ignoreCase);
					result = createImportScope(result, singletonList(normalizer), globalScopeSelectable, reference.getEReferenceType(), ignoreCase);
				}
				if (jvmTypeName != null && !jvmTypeName.equals(name)) {
					ImportNormalizer localNormalizer = new ImportNormalizer(jvmTypeName, true, ignoreCase); 
					result = createImportScope(result, singletonList(localNormalizer), resourceOnlySelectable, reference.getEReferenceType(), ignoreCase);
				}
			}
			// scope for JvmTypeParameterDeclarator
			if (derivedJvmElement instanceof JvmTypeParameterDeclarator) {
				JvmTypeParameterDeclarator parameterDeclarator = (JvmTypeParameterDeclarator) derivedJvmElement;
				List<IEObjectDescription> descriptions = null;
				for (JvmTypeParameter param : parameterDeclarator.getTypeParameters()) {
					if (param.getSimpleName() != null) {
						if (descriptions == null)
							descriptions = Lists.newArrayList();
						QualifiedName paramName = QualifiedName.create(param.getSimpleName());
						descriptions.add(EObjectDescription.create(paramName, param));
					}
				}
				if (descriptions != null && !descriptions.isEmpty())
					result = MapBasedScope.createScope(result, descriptions);
			}
		}
		return result;
	}*/

	/**
	 * This allows us to import classes from the java library.
	 * This is supported out-of-the-box when the 'magic' name
	 * 'importedNamespace' is used but has to be put back in
	 * when ImportedNamespaceAwareLocalScopeProvider is
	 * overridden.
	 */
	@Override
	protected List<ImportNormalizer> getImplicitImports(boolean ignoreCase) {
	  return newArrayList(new ImportNormalizer(JAVA_LANG, true, false),
	    new ImportNormalizer(EUCLID_LIB, true, false));
	}
	
}

