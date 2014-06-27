package com.euclideanspace.euclid.jvmmodel

import com.euclideanspace.euclid.euclidmodel.EuclidAnnotationType
import com.euclideanspace.euclid.euclidmodel.EuclidClass
import com.euclideanspace.euclid.euclidmodel.EuclidConstructor
import com.euclideanspace.euclid.euclidmodel.EuclidTypeDeclaration
//import com.euclideanspace.euclid.euclidmodel.EuclidEnum
import com.euclideanspace.euclid.euclidmodel.EuclidField
import com.euclideanspace.euclid.euclidmodel.EuclidFile
import com.euclideanspace.euclid.euclidmodel.EuclidFunction
import com.euclideanspace.euclid.euclidmodel.EuclidImport
//import com.euclideanspace.euclid.euclidmodel.EuclidInnerClass
//import com.euclideanspace.euclid.euclidmodel.EuclidInterface
import com.google.inject.Inject
import org.eclipse.emf.common.util.EList
import org.eclipse.xtext.common.types.JvmConstructor
import org.eclipse.xtext.common.types.JvmField
import org.eclipse.xtext.common.types.JvmOperation
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.eclipse.xtext.common.types.TypesFactory
import org.eclipse.xtext.xbase.XExpression
import org.eclipse.xtext.xbase.typing.ITypeProvider

/**
* The dispatch method {@code infer} is called for each instance of the
* given element's type that is contained in a resource.
*
* @param element
* the model to create one or more
* {@link org.eclipse.xtext.common.types.JvmDeclaredType declared
* types} from.
* @param acceptor
* each created
* {@link org.eclipse.xtext.common.types.JvmDeclaredType type}
* without a container should be passed to the acceptor in order
* get attached to the current resource. The acceptor's
* {@link IJvmDeclaredTypeAcceptor#accept(org.eclipse.xtext.common.types.JvmDeclaredType)
* accept(..)} method takes the constructed empty type for the
* pre-indexing phase. This one is further initialized in the
* indexing phase using the closure you pass to the returned
* {@link org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor.IPostIndexingInitializing#initializeLater(org.eclipse.xtext.xbase.lib.Procedures.Procedure1)
* initializeLater(..)}.
* @param isPreIndexingPhase
* whether the method is called in a pre-indexing phase, i.e.
* when the global index is not yet fully updated. You must not
* rely on linking using the index if isPreIndexingPhase is
* <code>true</code>.
*/
class EditorJvmModelInferrer extends AbstractModelInferrer {
     
  /* required for 'toClass' and so on*/
  @Inject extension JvmTypesBuilder
  /* required for typesFactory.createJvmUnknownTypeReference */
  @Inject TypesFactory typesFactory;
  //@Inject extension IJvmModelAssociations
  /* required for typeProvider.getType(iv, true)
* which infers the type of an expression */
  @Inject ITypeProvider typeProvider
  //@Inject extension IQualifiedNameProvider

  //@Inject extension TypeReferences
  
  def dispatch void infer(EuclidFile element,
      IJvmDeclaredTypeAcceptor acceptor,
      boolean isPrelinkingPhase) {
      for (imp:element.imports){
        var EuclidImport x =imp
        //var keyType = element.newTypeRef(typeof(x)).type
        //x.isStatic()
        //x.isExtension()
        //val JvmType imt = x.importedType
        //val String ins=x.importedNamespace
      }
      for (classElement : element.euclidTypes) {
       if (classElement instanceof EuclidClass) {
       val EuclidClass ec=classElement as EuclidClass
       buildClass(acceptor,ec,element.getPackage())
        }
//       if (classElement instanceof EuclidInterface) {
//       val EuclidInterface ec=classElement as EuclidInterface
//       buildInterface(acceptor,ec,element.getPackage())
//        }
//       if (classElement instanceof EuclidEnum) {
//       val EuclidEnum ec=classElement as EuclidEnum
//       buildEnum(acceptor,ec,element.getPackage())
//        }
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
     // if (methodElement instanceof EuclidFunction) {
     // //val EuclidFunction me=methodElement as EuclidFunction
     // //members += buildMethod(me)
     // }
     // }
     //]
    }

  /**
* pck = package name (qualified name)
*/
  def void buildClass(IJvmDeclaredTypeAcceptor acceptor,
   EuclidClass ec,String pck){
   var String qualifiedName = ec.name //ec.fullyQualifiedName.lastSegment
   if (pck != null){
   qualifiedName = pck + "." + ec.name //ec.fullyQualifiedName.lastSegment
   }
    acceptor.accept(ec.toClass(qualifiedName)).initializeLater [
      documentation = ec.documentation
      var JvmParameterizedTypeReference ext = ec.getExtends()
      if (ext!=null && superTypes!=null) {
        //println("extends="+ext.simpleName)
        superTypes += ext.cloneWithProxies
      }
      var EList<JvmParameterizedTypeReference> imps = ec.getImplements()
      for (imp:imps){
       superTypes += imp.cloneWithProxies
      }
      for (methodElement : ec.members) {
        if (methodElement instanceof EuclidFunction) {
          val EuclidFunction me=methodElement as EuclidFunction
          members += buildMethod(me)
        }
        if (methodElement instanceof EuclidConstructor) {
          val EuclidConstructor me=methodElement as EuclidConstructor
          members += buildConstructor(me)
        }
        if (methodElement instanceof EuclidField) {
          val EuclidField fe=methodElement as EuclidField
          members += buildField(fe)
        }
//        if (methodElement instanceof EuclidInnerClass) {
//          val EuclidInnerClass ic=methodElement as EuclidInnerClass
//          members += buildInnerClass(ic,pck)
//        }
       }
     ]
    }

  /**
* @param pck package name (qualified name as String)
*/
//  def void buildInterface(IJvmDeclaredTypeAcceptor acceptor,
//   EuclidInterface ec,String pck){
//   var String qualifiedName = ec.name //ec.fullyQualifiedName.lastSegment
//   if (pck != null){
//   qualifiedName = pck + "." + ec.name //ec.fullyQualifiedName.lastSegment
//   }
   /* the parameters of 'toInterface' are:
* sourceElement EObject:
* the sourceElement the resulting element is associated
* with.
* name String:
* the qualified name of the resulting class.
* :initializer
* the initializer to apply on the created interface
* element. If <code>null</code>, the interface won't
* be initialized.
*
* returns JvmGenericType
*/
//    acceptor.accept(ec.toInterface(qualifiedName) [
//      documentation = ec.documentation
//      var EList<JvmParameterizedTypeReference> imps = ec.getImplements()
//      for (imp:imps){
//       superTypes += imp.cloneWithProxies
//      }
//      for (methodElement : ec.declarations) {
//        if (methodElement instanceof EuclidDeclaration) {
//          val EuclidDeclaration me=methodElement as EuclidDeclaration
//          members += buildMethodDec(me)
//        }
//       }
//     ])
//    }

  /**
* @param pck package name (qualified name as String)
*/
//  def void buildEnum(IJvmDeclaredTypeAcceptor acceptor,
//   EuclidEnum ec,String pck){
//   var String qualifiedName = ec.name //ec.fullyQualifiedName.lastSegment
//   if (pck != null){
//   qualifiedName = pck + "." + ec.name //ec.fullyQualifiedName.lastSegment
//   }
//    acceptor.accept(ec.toEnumerationType(qualifiedName) [
//      documentation = ec.documentation
//      var EList<String> enumConstants = ec.enumConstants
//      for (enc:enumConstants){
//       members += toEnumerationLiteral(ec,enc)
//      }
//     ])
//    }

/**
* pck = package name (qualified name)
*/
//  def JvmGenericType buildInnerClass(EuclidInnerClass ic,String pck) {
//   var String qualifiedName = ic.name //ec.fullyQualifiedName.lastSegment
//   if (pck != null) {
//   qualifiedName = pck + "." + ic.name //ec.fullyQualifiedName.lastSegment
//   }
//    return ic.toClass(qualifiedName)[
//      documentation = ic.documentation
//      var JvmParameterizedTypeReference ext = ic.getExtends()
//      if (ext!=null && superTypes!=null) {
//        //println("extends="+ext.simpleName)
//        superTypes += ext.cloneWithProxies
//      }
//      var EList<JvmParameterizedTypeReference> imps = ic.getImplements()
//      for (imp:imps){
//       superTypes += imp.cloneWithProxies
//      }
//      for (methodElement : ic.members) {
//        if (methodElement instanceof EuclidFunction) {
//          val EuclidFunction me=methodElement as EuclidFunction
//          members += buildMethod(me)
//        }
//        if (methodElement instanceof EuclidConstructor) {
//          val EuclidConstructor me=methodElement as EuclidConstructor
//          members += buildConstructor(me)
//        }
//        if (methodElement instanceof EuclidField) {
//          val EuclidField fe=methodElement as EuclidField
//          members += buildField(fe)
//        }
//       }
//     ]
//    }

    /**
* method declaration
*/
//    def JvmOperation buildMethodDec(EuclidTypeDeclaration me){
//      var String methodName = me.name;
//      var JvmTypeReference methodType = me.returnType
//   return me.toMethod(methodName,methodType) [
//        //body = [append('''«me.expression»''')]
//        for (par : me.parameters) {
//          if (par.name != null && par.parameterType != null)
//            parameters += par.toParameter(par.name,par.parameterType)
//          //else
//          // println("parameter name or type = null"+par.name)
//        }
//        //varArgs=true // set to give a variable number of arguments
//        documentation = me.documentation
//        setAbstract(true)
//        visibility = me.visibility //JvmVisibility 'public'/'protected'/'private'
//      ]
//   }

    /**
* method definition, starts with 'def' in xtend
*/
    def JvmOperation buildMethod(EuclidFunction me){
      var String methodName = me.name;
      var JvmTypeReference methodType = me.returnType
   return me.toMethod(methodName,methodType) [
        //body = [append('''«me.expression»''')]
        for (par : me.parameters) {
          if (par.name != null && par.parameterType != null)
            parameters += par.toParameter(par.name,par.parameterType)
          //else
          // println("parameter name or type = null"+par.name)
        }
        //varArgs=true // set to give a variable number of arguments
        documentation = me.documentation
        //final=true
        visibility = me.visibility //JvmVisibility 'public'/'protected'/'private'
        body = me.expression	
      ]
   }

    /**
* constructor, starts with 'new' in xtend
*/
    def JvmConstructor buildConstructor(EuclidConstructor me){
        return me.toConstructor() [
        for (par : me.parameters) {
          if (par.name != null && par.parameterType != null)
            parameters += par.toParameter(par.name,par.parameterType)
        }
        //varArgs=true // set to give a variable number of arguments
        documentation = me.documentation
        //final=true
        visibility = me.visibility //JvmVisibility 'public'/'protected'/'private'
        body = me.expression	
      ]
   }

    /**
* variable/value definition, starts with 'var' or 'val' like xtend
*/
    def JvmField buildField(EuclidField fe){
      var JvmTypeReference ty = fe.type
      val XExpression iv = fe.initialValue
      if (ty == null) {
       if (iv != null) {
       ty=typeProvider.getType(iv, true)
       }
      }
      if (ty == null) {
        ty = typesFactory.createJvmUnknownTypeReference
      }
   return fe.toField(fe.name,ty) [
   setInitializer(iv)
   ]
   }
}