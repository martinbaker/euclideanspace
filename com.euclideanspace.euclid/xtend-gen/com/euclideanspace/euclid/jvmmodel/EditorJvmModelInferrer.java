package com.euclideanspace.euclid.jvmmodel;

import com.euclideanspace.euclid.euclidmodel.EuclidAnnotationType;
import com.euclideanspace.euclid.euclidmodel.EuclidClass;
import com.euclideanspace.euclid.euclidmodel.EuclidField;
import com.euclideanspace.euclid.euclidmodel.EuclidFile;
import com.euclideanspace.euclid.euclidmodel.EuclidFunction;
import com.euclideanspace.euclid.euclidmodel.EuclidMember;
import com.euclideanspace.euclid.euclidmodel.EuclidParameter;
import com.euclideanspace.euclid.euclidmodel.EuclidTypeDeclaration;
import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmVisibility;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor.IPostIndexingInitializing;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.InputOutput;
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
      {
        if ((classElement instanceof EuclidClass)) {
          final EuclidClass ec = ((EuclidClass) classElement);
          this.buildClass(acceptor, ec);
        }
        if ((classElement instanceof EuclidAnnotationType)) {
          final EuclidAnnotationType eat = ((EuclidAnnotationType) classElement);
          this.buildAnnotation(acceptor, eat);
        }
      }
    }
  }
  
  public void buildAnnotation(final IJvmDeclaredTypeAcceptor acceptor, final EuclidAnnotationType eat) {
  }
  
  public void buildClass(final IJvmDeclaredTypeAcceptor acceptor, final EuclidClass ec) {
    String _name = ec.getName();
    JvmGenericType _class = this._jvmTypesBuilder.toClass(ec, _name);
    IPostIndexingInitializing<JvmGenericType> _accept = acceptor.<JvmGenericType>accept(_class);
    final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
        public void apply(final JvmGenericType it) {
          String _documentation = EditorJvmModelInferrer.this._jvmTypesBuilder.getDocumentation(ec);
          EditorJvmModelInferrer.this._jvmTypesBuilder.setDocumentation(it, _documentation);
          EList<EuclidMember> _members = ec.getMembers();
          for (final EuclidMember methodElement : _members) {
            {
              if ((methodElement instanceof EuclidFunction)) {
                final EuclidFunction me = ((EuclidFunction) methodElement);
                EList<JvmMember> _members_1 = it.getMembers();
                JvmOperation _buildMethod = EditorJvmModelInferrer.this.buildMethod(me);
                EditorJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_1, _buildMethod);
              }
              if ((methodElement instanceof EuclidField)) {
                final EuclidField fe = ((EuclidField) methodElement);
                EList<JvmMember> _members_2 = it.getMembers();
                JvmField _buildField = EditorJvmModelInferrer.this.buildField(fe);
                EditorJvmModelInferrer.this._jvmTypesBuilder.<JvmField>operator_add(_members_2, _buildField);
              }
            }
          }
        }
      };
    _accept.initializeLater(_function);
  }
  
  /**
   * method definition, starts with 'def' in xtend
   */
  public JvmOperation buildMethod(final EuclidFunction me) {
    String _name = me.getName();
    JvmTypeReference _returnType = me.getReturnType();
    final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
        public void apply(final JvmOperation it) {
          EList<EuclidParameter> _parameters = me.getParameters();
          for (final EuclidParameter par : _parameters) {
            boolean _and = false;
            String _name = par.getName();
            boolean _notEquals = (!Objects.equal(_name, null));
            if (!_notEquals) {
              _and = false;
            } else {
              JvmTypeReference _parameterType = par.getParameterType();
              boolean _notEquals_1 = (!Objects.equal(_parameterType, null));
              _and = (_notEquals && _notEquals_1);
            }
            if (_and) {
              EList<JvmFormalParameter> _parameters_1 = it.getParameters();
              String _name_1 = par.getName();
              JvmTypeReference _parameterType_1 = par.getParameterType();
              JvmFormalParameter _parameter = EditorJvmModelInferrer.this._jvmTypesBuilder.toParameter(par, _name_1, _parameterType_1);
              EditorJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters_1, _parameter);
            }
          }
          String _documentation = EditorJvmModelInferrer.this._jvmTypesBuilder.getDocumentation(me);
          EditorJvmModelInferrer.this._jvmTypesBuilder.setDocumentation(it, _documentation);
          JvmVisibility _visibility = me.getVisibility();
          it.setVisibility(_visibility);
          XExpression _expression = me.getExpression();
          EditorJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _expression);
        }
      };
    return this._jvmTypesBuilder.toMethod(me, _name, _returnType, _function);
  }
  
  /**
   * variable/value definition, starts with 'var' or 'val' in xtend
   */
  public JvmField buildField(final EuclidField fe) {
    JvmTypeReference _type = fe.getType();
    boolean _equals = Objects.equal(_type, null);
    if (_equals) {
      InputOutput.<String>println("type = null");
      return null;
    }
    String _name = fe.getName();
    JvmTypeReference _type_1 = fe.getType();
    final Procedure1<JvmField> _function = new Procedure1<JvmField>() {
        public void apply(final JvmField it) {
        }
      };
    return this._jvmTypesBuilder.toField(fe, _name, _type_1, _function);
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
