package com.euclideanspace.euclid.jvmmodel;

import com.euclideanspace.euclid.euclidmodel.EuclidClass;
import com.euclideanspace.euclid.euclidmodel.EuclidFile;
import com.euclideanspace.euclid.euclidmodel.EuclidFunction;
import com.euclideanspace.euclid.euclidmodel.EuclidMember;
import com.euclideanspace.euclid.euclidmodel.EuclidTypeDeclaration;
import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor.IPostIndexingInitializing;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

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
@SuppressWarnings("all")
public class EditorJvmModelInferrer extends AbstractModelInferrer {
  @Inject
  private JvmTypesBuilder _jvmTypesBuilder;
  
  protected void _infer(final EuclidFile element, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPrelinkingPhase) {
    EList<EuclidTypeDeclaration> _euclidTypes = element.getEuclidTypes();
    for (final EuclidTypeDeclaration classElement : _euclidTypes) {
      if ((classElement instanceof EuclidClass)) {
        final EuclidClass ec = ((EuclidClass) classElement);
        String _name = ec.getName();
        JvmGenericType _class = this._jvmTypesBuilder.toClass(ec, _name);
        IPostIndexingInitializing<JvmGenericType> _accept = acceptor.<JvmGenericType>accept(_class);
        final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
            public void apply(final JvmGenericType it) {
              String _documentation = EditorJvmModelInferrer.this._jvmTypesBuilder.getDocumentation(element);
              EditorJvmModelInferrer.this._jvmTypesBuilder.setDocumentation(it, _documentation);
              EList<EuclidMember> _members = ec.getMembers();
              for (final EuclidMember methodElement : _members) {
                if ((methodElement instanceof EuclidFunction)) {
                  final EuclidFunction me = ((EuclidFunction) methodElement);
                  EList<JvmMember> _members_1 = it.getMembers();
                  String _name = me.getName();
                  JvmTypeReference _returnType = me.getReturnType();
                  final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
                      public void apply(final JvmOperation it) {
                      }
                    };
                  JvmOperation _method = EditorJvmModelInferrer.this._jvmTypesBuilder.toMethod(me, _name, _returnType, _function);
                  EditorJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_1, _method);
                }
              }
            }
          };
        _accept.initializeLater(_function);
      }
    }
  }
  
  public void infer(final EObject element, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPrelinkingPhase) {
    if (element instanceof EuclidFile) {
      _infer((EuclidFile)element, acceptor, isPrelinkingPhase);
      return;
    } else if (element != null) {
      _infer(element, acceptor, isPrelinkingPhase);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(element, acceptor, isPrelinkingPhase).toString());
    }
  }
}
