package com.euclideanspace.euclid.jvmmodel

import com.google.inject.Inject
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.eclipse.xtext.xbase.jvmmodel.JvmVisibilityExtension
import com.euclideanspace.euclid.euclidmodel.EuclidFile
import com.euclideanspace.euclid.euclidmodel.EuclidAnnotationType
import com.euclideanspace.euclid.euclidmodel.EuclidClass
import com.euclideanspace.euclid.euclidmodel.EuclidConstructor
import com.euclideanspace.euclid.euclidmodel.EuclidField
import com.euclideanspace.euclid.euclidmodel.EuclidFunction

import static org.eclipse.xtext.util.Strings.*
import org.eclipse.xtext.common.types.JvmOperation
import org.eclipse.xtext.common.types.JvmField

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
      	  buildClass(acceptor,ec)
        }
      	if (classElement instanceof EuclidAnnotationType) {
      	  val EuclidAnnotationType eat=classElement as EuclidAnnotationType
      	  buildAnnotation(acceptor,eat)
        }
      }
  }

  def void buildAnnotation(IJvmDeclaredTypeAcceptor acceptor,
  	                 EuclidAnnotationType eat){
  	// should be toAnnotationType ?
    //acceptor.accept('''//annotation type goes here''')
    //acceptor.accept(eat.toAnnotation(eat.name)).initializeLater [
      //documentation = element.documentation
     // documentation = eat.documentation
     // for (methodElement : eat.members) {
     //   if (methodElement instanceof EuclidFunction) {
     //     //val EuclidFunction me=methodElement as EuclidFunction
     //     //members += buildMethod(me)
     //   }
     //  }
     //]
    }

  
  def void buildClass(IJvmDeclaredTypeAcceptor acceptor,
  	                 EuclidClass ec){
    acceptor.accept(ec.toClass(ec.name)).initializeLater [
      //documentation = element.documentation
      documentation = ec.documentation
      for (methodElement : ec.members) {
        if (methodElement instanceof EuclidFunction) {
          val EuclidFunction me=methodElement as EuclidFunction
          members += buildMethod(me)
        }
        if (methodElement instanceof EuclidField) {
          val EuclidField fe=methodElement as EuclidField
          members += buildField(fe)
        }
       }
     ]
    }

    /**
     * method definition, starts with 'def' in xtend
     */
    def JvmOperation buildMethod(EuclidFunction me){
  	  return me.toMethod(me.name,me.returnType) [
        //body = [append('''«me.expression»''')]
        for (par : me.parameters) {
          if (par.name != null && par.parameterType != null)
            parameters += par.toParameter(par.name,par.parameterType)
          //else
          //  println("parameter name or type = null"+par.name)
        }
        //varArgs=true // set to give a variable number of arguments
        documentation = me.documentation
        //final=true
        visibility = me.visibility //JvmVisibility 'public'/'protected'/'private'
        body = me.expression	
      ]
  	}

    /**
     * variable/value definition, starts with 'var' or 'val' in xtend
     */
    def JvmField buildField(EuclidField fe){
      if (fe.type == null) {
      	println("type = null")
      	return null;
      }
  	  return fe.toField(fe.name,fe.type) [
        //body = [append('''«me.expression»''')] 	
        //body = fe.expression	
      ]
  	}

}

