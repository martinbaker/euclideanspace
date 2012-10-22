package com.euclideanspace.euclid.jvmmodel

import com.google.inject.Inject
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import com.euclideanspace.euclid.euclidmodel.EuclidFile
import com.euclideanspace.euclid.euclidmodel.EuclidAnnotationType
import com.euclideanspace.euclid.euclidmodel.EuclidClass
import com.euclideanspace.euclid.euclidmodel.EuclidConstructor
import com.euclideanspace.euclid.euclidmodel.EuclidField
import com.euclideanspace.euclid.euclidmodel.EuclidFunction
import com.euclideanspace.euclid.euclidmodel.EuclidMember
import com.euclideanspace.euclid.euclidmodel.EuclidParameter
import com.euclideanspace.euclid.euclidmodel.EuclidTypeDeclaration
import java.util.ArrayList
import java.util.Collection
import java.util.HashMap
import java.util.Iterator
import java.util.List
import java.util.Map
import java.util.Set
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.InternalEObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.jdt.annotation.NonNull
import org.eclipse.jdt.annotation.Nullable
import com.google.common.base.Predicate
import com.google.common.collect.Multimap
import org.eclipse.xtext.naming.IQualifiedNameProvider

import static org.eclipse.xtext.util.Strings.*

/**
 * <p>Infers a JVM model from the source model.</p> 
 *
 * <p>The JVM model should contain all elements that would appear in the Java code 
 * which is generated from the source model. Other models link against the JVM model rather than the source model.</p>     
 */
//class EditorJvmModelInferrer extends AbstractModelInferrer {

    /**
     * convenience API to build and initialize JVM types and their members.
     */
//	@Inject extension JvmTypesBuilder

	/**
	 * The dispatch method {@code infer} is called for each instance of the
	 * given element's type that is contained in a resource.
	 * 
	 * @param element
	 *            the model to create one or more
	 *            {@link org.eclipse.xtext.common.types.JvmDeclaredType declared
	 *            types} from.
	 * @param acceptor
	 *            each created
	 *            {@link org.eclipse.xtext.common.types.JvmDeclaredType type}
	 *            without a container should be passed to the acceptor in order
	 *            get attached to the current resource. The acceptor's
	 *            {@link IJvmDeclaredTypeAcceptor#accept(org.eclipse.xtext.common.types.JvmDeclaredType)
	 *            accept(..)} method takes the constructed empty type for the
	 *            pre-indexing phase. This one is further initialized in the
	 *            indexing phase using the closure you pass to the returned
	 *            {@link org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor.IPostIndexingInitializing#initializeLater(org.eclipse.xtext.xbase.lib.Procedures.Procedure1)
	 *            initializeLater(..)}.
	 * @param isPreIndexingPhase
	 *            whether the method is called in a pre-indexing phase, i.e.
	 *            when the global index is not yet fully updated. You must not
	 *            rely on linking using the index if isPreIndexingPhase is
	 *            <code>true</code>.
	 */
class EditorJvmModelInferrer extends AbstractModelInferrer {
     
  @Inject extension JvmTypesBuilder
//  @Inject extension IQualifiedNameProvider
  def dispatch void infer(EuclidFile element,
      IJvmDeclaredTypeAcceptor acceptor,
      boolean isPrelinkingPhase) {
      for (classElement : element.euclidTypes) {
      	if (classElement instanceof EuclidClass) {
      	  val EuclidClass ec=classElement as EuclidClass
          acceptor.accept(ec.toClass(ec.name)).initializeLater [
          documentation = element.documentation
          for (methodElement : ec.members) {
      	    if (methodElement instanceof EuclidFunction) {
      	      val EuclidFunction me=methodElement as EuclidFunction
               members += me.toMethod(me.name,me.returnType) [
    		     //parameters += me.toParameter("my parameter", me.expression)
    		   ]
        }
          }
        ]
        }
      }
  }
}

