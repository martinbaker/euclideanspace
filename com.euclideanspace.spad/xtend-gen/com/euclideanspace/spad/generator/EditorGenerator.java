/**
 * Copyright 2012 Martin John Baker
 * 
 * This file is part of EuclideanSpace.
 * 
 *  EuclideanSpace is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Affero General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 * 
 *  EuclideanSpace is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Affero General Public License for more details.
 * 
 *  You should have received a copy of the GNU Affero General Public License
 *  along with EuclideanSpace.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.euclideanspace.spad.generator;

import com.euclideanspace.spad.editor.AddPart;
import com.euclideanspace.spad.editor.AddStatements;
import com.euclideanspace.spad.editor.AdditiveExpression;
import com.euclideanspace.spad.editor.AndExpression;
import com.euclideanspace.spad.editor.AssignExpression;
import com.euclideanspace.spad.editor.Block;
import com.euclideanspace.spad.editor.BooleanLiteral;
import com.euclideanspace.spad.editor.BreakStatement;
import com.euclideanspace.spad.editor.CaseExpression;
import com.euclideanspace.spad.editor.CategoryDef;
import com.euclideanspace.spad.editor.CharacterLiteral;
import com.euclideanspace.spad.editor.CoerceExpression;
import com.euclideanspace.spad.editor.ConditionExpression;
import com.euclideanspace.spad.editor.DivisionExpression;
import com.euclideanspace.spad.editor.DoStatement;
import com.euclideanspace.spad.editor.DomainDef;
import com.euclideanspace.spad.editor.EltExpression;
import com.euclideanspace.spad.editor.EqualityExpression;
import com.euclideanspace.spad.editor.ExitExpression;
import com.euclideanspace.spad.editor.ExplicitTypeExpression;
import com.euclideanspace.spad.editor.ExponentExpression;
import com.euclideanspace.spad.editor.Expr;
import com.euclideanspace.spad.editor.ExquoExpression;
import com.euclideanspace.spad.editor.ForStatement;
import com.euclideanspace.spad.editor.FreeVariable;
import com.euclideanspace.spad.editor.FunctionDefinition;
import com.euclideanspace.spad.editor.FunctionDefinitionBlock;
import com.euclideanspace.spad.editor.FunctionSignature;
import com.euclideanspace.spad.editor.HasExpression;
import com.euclideanspace.spad.editor.HintTypeExpression;
import com.euclideanspace.spad.editor.IfElseStatement;
import com.euclideanspace.spad.editor.IfStatement;
import com.euclideanspace.spad.editor.Import;
import com.euclideanspace.spad.editor.InnerProdExpression;
import com.euclideanspace.spad.editor.IsExpression;
import com.euclideanspace.spad.editor.IterateStatement;
import com.euclideanspace.spad.editor.ListLiteral;
import com.euclideanspace.spad.editor.Literal;
import com.euclideanspace.spad.editor.LocalVariable;
import com.euclideanspace.spad.editor.MacroDef;
import com.euclideanspace.spad.editor.MapDefinition;
import com.euclideanspace.spad.editor.ModExpression;
import com.euclideanspace.spad.editor.Model;
import com.euclideanspace.spad.editor.MultiplicativeExpression;
import com.euclideanspace.spad.editor.NameOrFunctionCall;
import com.euclideanspace.spad.editor.OrExpression;
import com.euclideanspace.spad.editor.OuterProdExpression;
import com.euclideanspace.spad.editor.PackageDef;
import com.euclideanspace.spad.editor.PretendExpression;
import com.euclideanspace.spad.editor.PrimaryPrefix;
import com.euclideanspace.spad.editor.QuoExpression;
import com.euclideanspace.spad.editor.RelationalExpression;
import com.euclideanspace.spad.editor.RemExpression;
import com.euclideanspace.spad.editor.RepeatStatement;
import com.euclideanspace.spad.editor.ReturnStatement;
import com.euclideanspace.spad.editor.SegmentExpression;
import com.euclideanspace.spad.editor.Statement;
import com.euclideanspace.spad.editor.StatementExpression;
import com.euclideanspace.spad.editor.TupleDefinition;
import com.euclideanspace.spad.editor.TypeArguments;
import com.euclideanspace.spad.editor.TypeExpression;
import com.euclideanspace.spad.editor.TypeLiteral;
import com.euclideanspace.spad.editor.TypeNameOrFunctionCall;
import com.euclideanspace.spad.editor.TypeNameOrFunctionCall2;
import com.euclideanspace.spad.editor.TypeParameterList;
import com.euclideanspace.spad.editor.TypePrimaryExpression;
import com.euclideanspace.spad.editor.TypeResult;
import com.euclideanspace.spad.editor.TypeWithName;
import com.euclideanspace.spad.editor.UnaryExpression;
import com.euclideanspace.spad.editor.VariableDeclaration;
import com.euclideanspace.spad.editor.VariableDeclarationAssign;
import com.euclideanspace.spad.editor.VariableDeclarationBlock;
import com.euclideanspace.spad.editor.VariableTyped;
import com.euclideanspace.spad.editor.WhereAssignments;
import com.euclideanspace.spad.editor.WherePart;
import com.euclideanspace.spad.editor.WhileStatement;
import com.euclideanspace.spad.editor.WithInline;
import com.euclideanspace.spad.editor.WithPart;
import com.google.common.base.Objects;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class EditorGenerator implements IGenerator {
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    String _className = this.className(resource);
    String _plus = (_className + ".java");
    EList<EObject> _contents = resource.getContents();
    EObject _head = IterableExtensions.<EObject>head(_contents);
    CharSequence _compile = this.compile(((Model) _head));
    fsa.generateFile(_plus, _compile);
  }
  
  public String className(final Resource res) {
    URI _uRI = res.getURI();
    String name = _uRI.lastSegment();
    int _indexOf = name.indexOf(".");
    return name.substring(0, _indexOf);
  }
  
  public CharSequence compile(final Model model) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EObject _eContainer = model.eContainer();
      boolean _notEquals = (!Objects.equal(_eContainer, null));
      if (_notEquals) {
        _builder.append("package ");
        Resource _eResource = model.eResource();
        String _className = this.className(_eResource);
        _builder.append(_className, "");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    {
      CategoryDef _c = model.getC();
      boolean _notEquals_1 = (!Objects.equal(_c, null));
      if (_notEquals_1) {
        _builder.append(" ");
        CategoryDef _c_1 = model.getC();
        CharSequence _compile = this.compile(_c_1);
        _builder.append(_compile, "");
        _builder.append(" ");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      PackageDef _p = model.getP();
      boolean _notEquals_2 = (!Objects.equal(_p, null));
      if (_notEquals_2) {
        _builder.append(" ");
        PackageDef _p_1 = model.getP();
        CharSequence _compile_1 = this.compile(_p_1);
        _builder.append(_compile_1, "");
        _builder.append(" ");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      DomainDef _d = model.getD();
      boolean _notEquals_3 = (!Objects.equal(_d, null));
      if (_notEquals_3) {
        _builder.append(" ");
        DomainDef _d_1 = model.getD();
        CharSequence _compile_2 = this.compile(_d_1);
        _builder.append(_compile_2, "");
        _builder.append(" ");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  /**
   * CategoryDef
   */
  public CharSequence compile(final CategoryDef f) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("  ");
    _builder.append("public interface ");
    String _longname = f.getLongname();
    _builder.append(_longname, "  ");
    _builder.append(" ");
    {
      TypeParameterList _cp = f.getCp();
      boolean _notEquals = (!Objects.equal(_cp, null));
      if (_notEquals) {
        _builder.append(" ");
        TypeParameterList _cp_1 = f.getCp();
        CharSequence _compile = this.compile(_cp_1);
        _builder.append(_compile, "  ");
      }
    }
    _builder.append("{");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("/* extends ");
    String _name = f.getName();
    _builder.append(_name, "  ");
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    {
      TypeArguments _implName = f.getImplName();
      boolean _notEquals_1 = (!Objects.equal(_implName, null));
      if (_notEquals_1) {
        _builder.append(" ");
        TypeArguments _implName_1 = f.getImplName();
        _builder.append(_implName_1, "  ");
        _builder.append(" ");
      }
    }
    _builder.append("*/");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    {
      WithPart _w = f.getW();
      boolean _notEquals_2 = (!Objects.equal(_w, null));
      if (_notEquals_2) {
        _builder.append(" ");
        WithPart _w_1 = f.getW();
        CharSequence _compile_1 = this.compile(_w_1);
        _builder.append(_compile_1, "  ");
        _builder.append(" ");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    {
      WherePart _wh5 = f.getWh5();
      boolean _notEquals_3 = (!Objects.equal(_wh5, null));
      if (_notEquals_3) {
        _builder.append(" ");
        WherePart _wh5_1 = f.getWh5();
        CharSequence _compile_2 = this.compile(_wh5_1);
        _builder.append(_compile_2, "  ");
        _builder.append(" ");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    return _builder;
  }
  
  /**
   * PackageDef
   */
  public CharSequence compile(final PackageDef f) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("  ");
    _builder.append("public static class ");
    String _longname = f.getLongname();
    _builder.append(_longname, "  ");
    _builder.append(" ");
    {
      TypeParameterList _cp = f.getCp();
      boolean _notEquals = (!Objects.equal(_cp, null));
      if (_notEquals) {
        _builder.append(" ");
        TypeParameterList _cp_1 = f.getCp();
        CharSequence _compile = this.compile(_cp_1);
        _builder.append(_compile, "  ");
      }
    }
    _builder.append("{");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("/* extends ");
    String _name = f.getName();
    _builder.append(_name, "  ");
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    {
      String _exportName = f.getExportName();
      boolean _notEquals_1 = (!Objects.equal(_exportName, null));
      if (_notEquals_1) {
        _builder.append(" ");
        String _exportName_1 = f.getExportName();
        _builder.append(_exportName_1, "  ");
        _builder.append(" ");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    {
      String _implName = f.getImplName();
      boolean _notEquals_2 = (!Objects.equal(_implName, null));
      if (_notEquals_2) {
        _builder.append(" ");
        String _implName_1 = f.getImplName();
        _builder.append(_implName_1, "  ");
        _builder.append(" ");
      }
    }
    _builder.append("*/");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    {
      WithPart _w = f.getW();
      boolean _notEquals_3 = (!Objects.equal(_w, null));
      if (_notEquals_3) {
        _builder.append(" ");
        WithPart _w_1 = f.getW();
        CharSequence _compile_1 = this.compile(_w_1);
        _builder.append(_compile_1, "  ");
        _builder.append(" ");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    {
      WherePart _wh5 = f.getWh5();
      boolean _notEquals_4 = (!Objects.equal(_wh5, null));
      if (_notEquals_4) {
        _builder.append(" ");
        WherePart _wh5_1 = f.getWh5();
        CharSequence _compile_2 = this.compile(_wh5_1);
        _builder.append(_compile_2, "  ");
        _builder.append(" ");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    return _builder;
  }
  
  /**
   * DomainDef
   */
  public CharSequence compile(final DomainDef f) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("  ");
    _builder.append("public class ");
    String _longname5 = f.getLongname5();
    _builder.append(_longname5, "  ");
    _builder.append(" ");
    {
      TypeParameterList _cp5 = f.getCp5();
      boolean _notEquals = (!Objects.equal(_cp5, null));
      if (_notEquals) {
        _builder.append("/*");
        TypeParameterList _cp5_1 = f.getCp5();
        CharSequence _compile = this.compile(_cp5_1);
        _builder.append(_compile, "  ");
        _builder.append("*/");
      }
    }
    _builder.append("extends ");
    String _name = f.getName();
    _builder.append(_name, "  ");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("/*");
    {
      String _exportName = f.getExportName();
      boolean _notEquals_1 = (!Objects.equal(_exportName, null));
      if (_notEquals_1) {
        _builder.append(" ");
        String _exportName_1 = f.getExportName();
        _builder.append(_exportName_1, "  ");
        _builder.append(" ");
      }
    }
    {
      String _implName5 = f.getImplName5();
      boolean _notEquals_2 = (!Objects.equal(_implName5, null));
      if (_notEquals_2) {
        _builder.append(" ");
        String _implName5_1 = f.getImplName5();
        _builder.append(_implName5_1, "  ");
        _builder.append(" ");
      }
    }
    _builder.append("*/");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    {
      WithPart _w = f.getW();
      boolean _notEquals_3 = (!Objects.equal(_w, null));
      if (_notEquals_3) {
        _builder.append(" ");
        WithPart _w_1 = f.getW();
        CharSequence _compile_1 = this.compile(_w_1);
        _builder.append(_compile_1, "  ");
        _builder.append(" ");
      }
    }
    {
      WherePart _wh5 = f.getWh5();
      boolean _notEquals_4 = (!Objects.equal(_wh5, null));
      if (_notEquals_4) {
        _builder.append(" ");
        WherePart _wh5_1 = f.getWh5();
        CharSequence _compile_2 = this.compile(_wh5_1);
        _builder.append(_compile_2, "  ");
        _builder.append(" ");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    return _builder;
  }
  
  /**
   * WherePart
   */
  public CharSequence compile(final WherePart f) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/* WherePart */");
    _builder.newLine();
    {
      EList<WhereAssignments> _whereAssig = f.getWhereAssig();
      for(final WhereAssignments x : _whereAssig) {
        _builder.append(" ");
        CharSequence _compile = this.compile(x);
        _builder.append(_compile, "");
        _builder.append(" ");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("/*");
    {
      String _longname8 = f.getLongname8();
      boolean _notEquals = (!Objects.equal(_longname8, null));
      if (_notEquals) {
        _builder.append(" ");
        String _longname8_1 = f.getLongname8();
        _builder.append(_longname8_1, "");
        _builder.append(" ");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      TypeExpression _imp = f.getImp();
      boolean _notEquals_1 = (!Objects.equal(_imp, null));
      if (_notEquals_1) {
        _builder.append(" ");
        TypeExpression _imp_1 = f.getImp();
        CharSequence _compile_1 = this.compile(_imp_1);
        _builder.append(_compile_1, "");
        _builder.append(" ");
      }
    }
    _builder.append("*/");
    _builder.newLineIfNotEmpty();
    {
      WithPart _w8 = f.getW8();
      boolean _notEquals_2 = (!Objects.equal(_w8, null));
      if (_notEquals_2) {
        _builder.append(" ");
        WithPart _w8_1 = f.getW8();
        CharSequence _compile_2 = this.compile(_w8_1);
        _builder.append(_compile_2, "");
        _builder.append(" ");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("/*");
    {
      String _longname9 = f.getLongname9();
      boolean _notEquals_3 = (!Objects.equal(_longname9, null));
      if (_notEquals_3) {
        _builder.append(" ");
        String _longname9_1 = f.getLongname9();
        _builder.append(_longname9_1, "");
        _builder.append("*/");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      AddPart _add = f.getAdd();
      boolean _notEquals_4 = (!Objects.equal(_add, null));
      if (_notEquals_4) {
        _builder.append(" ");
        AddPart _add_1 = f.getAdd();
        CharSequence _compile_3 = this.compile(_add_1);
        _builder.append(_compile_3, "");
        _builder.append(" ");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * WhereAssignments
   */
  public CharSequence compile(final WhereAssignments f) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((f instanceof VariableDeclaration)) {
        CharSequence _compile = this.compile(((VariableDeclaration) f));
        _builder.append(_compile, "");
      }
    }
    {
      if ((f instanceof MacroDef)) {
        CharSequence _compile_1 = this.compile(((MacroDef) f));
        _builder.append(_compile_1, "");
      }
    }
    return _builder;
  }
  
  /**
   * WithPart
   */
  public CharSequence compile(final WithPart f) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/* WithPart */");
    _builder.newLine();
    {
      EList<VariableDeclaration> _fundec = f.getFundec();
      for(final VariableDeclaration x : _fundec) {
        CharSequence _compile = this.compile(x);
        _builder.append(_compile, "");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("/* end WithPart */");
    return _builder;
  }
  
  /**
   * AddPart
   */
  public CharSequence compile(final AddPart f) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/* AddPart */");
    _builder.newLine();
    {
      EList<AddStatements> _t = f.getT();
      for(final AddStatements x : _t) {
        _builder.append(" ");
        CharSequence _compile = this.compile(x);
        _builder.append(_compile, "");
        _builder.append(" ");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("/* end AddPart */");
    return _builder;
  }
  
  /**
   * AddStatements
   * VariableDeclarationAssign
   * FunctionDefinition
   * t1= 'if' Expression
   * t13= 'then' FunctionDefinitionBlock
   * t14='else' FunctionDefinitionBlock
   * MacroDef
   * Import
   */
  public CharSequence compile(final AddStatements f) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((f instanceof VariableDeclarationAssign)) {
        CharSequence _compile = this.compile(((VariableDeclarationAssign) f));
        _builder.append(_compile, "");
      }
    }
    {
      if ((f instanceof FunctionDefinition)) {
        CharSequence _compile_1 = this.compile(((FunctionDefinition) f));
        _builder.append(_compile_1, "");
      }
    }
    {
      if ((f instanceof MacroDef)) {
        _builder.append(" ");
        CharSequence _compile_2 = this.compile(((MacroDef) f));
        _builder.append(_compile_2, "");
        _builder.append(" ");
      }
    }
    {
      Expr _t1 = f.getT1();
      boolean _notEquals = (!Objects.equal(_t1, null));
      if (_notEquals) {
        _builder.append("if(");
        Expr _t1_1 = f.getT1();
        CharSequence _compile_3 = this.compile(_t1_1);
        _builder.append(_compile_3, "");
        _builder.append(")");
      }
    }
    {
      FunctionDefinitionBlock _t13 = f.getT13();
      boolean _notEquals_1 = (!Objects.equal(_t13, null));
      if (_notEquals_1) {
        _builder.append("then");
        FunctionDefinitionBlock _t13_1 = f.getT13();
        CharSequence _compile_4 = this.compile(_t13_1);
        _builder.append(_compile_4, "");
      }
    }
    {
      AddStatements _t15 = f.getT15();
      boolean _notEquals_2 = (!Objects.equal(_t15, null));
      if (_notEquals_2) {
        _builder.append("else");
        AddStatements _t15_1 = f.getT15();
        CharSequence _compile_5 = this.compile(_t15_1);
        _builder.append(_compile_5, "");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * FunctionDefinition
   * par3=FunctionSignature
   * par4=TypeExpression
   * par5=Statement
   */
  public CharSequence compile(final FunctionDefinition f) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public ");
    {
      TypeExpression _par4 = f.getPar4();
      boolean _notEquals = (!Objects.equal(_par4, null));
      if (_notEquals) {
        TypeExpression _par4_1 = f.getPar4();
        CharSequence _compile = this.compile(_par4_1);
        _builder.append(_compile, "");
        _builder.append(" ");
      }
    }
    {
      FunctionSignature _par3 = f.getPar3();
      boolean _notEquals_1 = (!Objects.equal(_par3, null));
      if (_notEquals_1) {
        FunctionSignature _par3_1 = f.getPar3();
        CharSequence _compile_1 = this.compile(_par3_1);
        _builder.append(_compile_1, "");
      }
    }
    {
      Statement _par5 = f.getPar5();
      boolean _notEquals_2 = (!Objects.equal(_par5, null));
      if (_notEquals_2) {
        Statement _par5_1 = f.getPar5();
        CharSequence _compile_2 = this.compile(_par5_1);
        _builder.append(_compile_2, "");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    return _builder;
  }
  
  /**
   * FunctionDefinitionBlock
   * fnDecBk += FunctionDefinition
   * vars+=VariableDeclarationAssign
   * 'if' t1+=Expression
   * 'then' t13+=FunctionDefinitionBlock
   * 'else' t14+=FunctionDefinitionBlock
   */
  public CharSequence compile(final FunctionDefinitionBlock f) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    _builder.append("       \t");
    {
      EList<FunctionDefinition> _fnDecBk = f.getFnDecBk();
      for(final FunctionDefinition x : _fnDecBk) {
        _builder.append(",");
        CharSequence _compile = this.compile(x);
        _builder.append(_compile, "       \t");
      }
    }
    {
      EList<VariableDeclarationAssign> _vars = f.getVars();
      for(final VariableDeclarationAssign x_1 : _vars) {
        _builder.append(",");
        CharSequence _compile_1 = this.compile(x_1);
        _builder.append(_compile_1, "       \t");
      }
    }
    {
      EList<Expr> _t1 = f.getT1();
      boolean _notEquals = (!Objects.equal(_t1, null));
      if (_notEquals) {
        _builder.append("if ");
        {
          EList<Expr> _t1_1 = f.getT1();
          for(final Expr x_2 : _t1_1) {
            _builder.append(",");
            CharSequence _compile_2 = this.compile(x_2);
            _builder.append(_compile_2, "       \t");
          }
        }
        _builder.append("then ");
        {
          EList<FunctionDefinitionBlock> _t13 = f.getT13();
          for(final FunctionDefinitionBlock x_3 : _t13) {
            _builder.append(",");
            CharSequence _compile_3 = this.compile(x_3);
            _builder.append(_compile_3, "       \t");
          }
        }
        _builder.append("else ");
        {
          EList<FunctionDefinitionBlock> _t14 = f.getT14();
          for(final FunctionDefinitionBlock x_4 : _t14) {
            _builder.append(",");
            CharSequence _compile_4 = this.compile(x_4);
            _builder.append(_compile_4, "       \t");
          }
        }
      }
    }
    _builder.append("} ");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * FunctionSignature
   * par4 and par5 inherit from FunctionDefinition
   */
  public CharSequence compile(final FunctionSignature f) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _fnNam = f.getFnNam();
      boolean _notEquals = (!Objects.equal(_fnNam, null));
      if (_notEquals) {
        String _fnNam_1 = f.getFnNam();
        _builder.append(_fnNam_1, "");
        _builder.append("(");
      }
    }
    {
      VariableTyped _par2 = f.getPar2();
      boolean _notEquals_1 = (!Objects.equal(_par2, null));
      if (_notEquals_1) {
        _builder.append(" ");
        VariableTyped _par2_1 = f.getPar2();
        CharSequence _compile = this.compile(_par2_1);
        _builder.append(_compile, "");
      }
    }
    {
      EList<VariableTyped> _par3 = f.getPar3();
      for(final VariableTyped x : _par3) {
        _builder.append(",");
        CharSequence _compile_1 = this.compile(x);
        _builder.append(_compile_1, "");
      }
    }
    {
      String _fnNam_2 = f.getFnNam();
      boolean _notEquals_2 = (!Objects.equal(_fnNam_2, null));
      if (_notEquals_2) {
        _builder.append(")");
      }
    }
    {
      String _b1 = f.getB1();
      boolean _notEquals_3 = (!Objects.equal(_b1, null));
      if (_notEquals_3) {
        String _b1_1 = f.getB1();
        _builder.append(_b1_1, "");
      }
    }
    {
      String _t4 = f.getT4();
      boolean _notEquals_4 = (!Objects.equal(_t4, null));
      if (_notEquals_4) {
        _builder.append("(");
        String _t4_1 = f.getT4();
        _builder.append(_t4_1, "");
      }
    }
    {
      String _t5 = f.getT5();
      boolean _notEquals_5 = (!Objects.equal(_t5, null));
      if (_notEquals_5) {
        _builder.append(",");
        String _t5_1 = f.getT5();
        _builder.append(_t5_1, "");
        _builder.append(")");
      }
    }
    {
      String _b2 = f.getB2();
      boolean _notEquals_6 = (!Objects.equal(_b2, null));
      if (_notEquals_6) {
        String _b2_1 = f.getB2();
        _builder.append(_b2_1, "");
      }
    }
    {
      String _t6 = f.getT6();
      boolean _notEquals_7 = (!Objects.equal(_t6, null));
      if (_notEquals_7) {
        String _t6_1 = f.getT6();
        _builder.append(_t6_1, "");
      }
    }
    return _builder;
  }
  
  /**
   * MacroDef
   */
  public CharSequence compile(final MacroDef f) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _macroname = f.getMacroname();
      boolean _notEquals = (!Objects.equal(_macroname, null));
      if (_notEquals) {
        _builder.append(" ");
        String _macroname_1 = f.getMacroname();
        _builder.append(_macroname_1, "");
        _builder.append(" ");
      }
    }
    return _builder;
  }
  
  /**
   * Import
   */
  public CharSequence compile(final Import f) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import");
    {
      EList<String> _impname = f.getImpname();
      boolean _notEquals = (!Objects.equal(_impname, null));
      if (_notEquals) {
        _builder.append(" ");
        EList<String> _impname_1 = f.getImpname();
        _builder.append(_impname_1, "");
        _builder.append(" ");
      }
    }
    return _builder;
  }
  
  /**
   * VariableDeclaration
   * ('if' t1=Expression 'then')?
   * (v1=TypeWithName | v2=VariableDeclarationBlock)
   */
  public CharSequence compile(final VariableDeclaration f) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Expr _t1 = f.getT1();
      boolean _notEquals = (!Objects.equal(_t1, null));
      if (_notEquals) {
        _builder.append("if ");
        Expr _t1_1 = f.getT1();
        CharSequence _compile = this.compile(_t1_1);
        _builder.append(_compile, "");
        _builder.append(" then ");
      }
    }
    {
      TypeWithName _v1 = f.getV1();
      boolean _notEquals_1 = (!Objects.equal(_v1, null));
      if (_notEquals_1) {
        _builder.append(" ");
        TypeWithName _v1_1 = f.getV1();
        CharSequence _compile_1 = this.compile(_v1_1);
        _builder.append(_compile_1, "");
      }
    }
    {
      VariableDeclarationBlock _v2 = f.getV2();
      boolean _notEquals_2 = (!Objects.equal(_v2, null));
      if (_notEquals_2) {
        _builder.append(" ");
        VariableDeclarationBlock _v2_1 = f.getV2();
        CharSequence _compile_2 = this.compile(_v2_1);
        _builder.append(_compile_2, "");
      }
    }
    return _builder;
  }
  
  /**
   * VariableDeclarationBlock
   * vardecbr=LBRACE NL
   * (vardecBlk += VariableDeclaration (NL|SEMICOLON)+)
   * RBRACE
   */
  public CharSequence compile(final VariableDeclarationBlock f) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<VariableDeclaration> _vardecBlk = f.getVardecBlk();
      for(final VariableDeclaration x : _vardecBlk) {
        _builder.append(x, "");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("        ");
      }
    }
    return _builder;
  }
  
  /**
   * TypeWithName
   * (
   * (varName=ID | varNameSt=STRING) (COMMA varName2=ID)?
   * COLON
   * )? typ=TypeExpression
   */
  public CharSequence compile(final TypeWithName f) {
    StringConcatenation _builder = new StringConcatenation();
    {
      TypeExpression _typ = f.getTyp();
      boolean _notEquals = (!Objects.equal(_typ, null));
      if (_notEquals) {
        {
          TypeExpression _typ_1 = f.getTyp();
          TypeArguments _t2 = _typ_1.getT2();
          boolean _notEquals_1 = (!Objects.equal(_t2, null));
          if (_notEquals_1) {
            {
              String _varName = f.getVarName();
              boolean _notEquals_2 = (!Objects.equal(_varName, null));
              if (_notEquals_2) {
                _builder.append(" ");
                String _varName_1 = f.getVarName();
                _builder.append(_varName_1, "");
                _builder.append(" ");
              }
            }
            TypeExpression _typ_2 = f.getTyp();
            TypeResult _t3 = _typ_2.getT3();
            CharSequence _compile = this.compile(_t3);
            _builder.append(_compile, "");
            _builder.append(" ");
            {
              String _varNameSt = f.getVarNameSt();
              boolean _notEquals_3 = (!Objects.equal(_varNameSt, null));
              if (_notEquals_3) {
                _builder.append(" ");
                String _varNameSt_1 = f.getVarNameSt();
                _builder.append(_varNameSt_1, "");
                _builder.append(" ");
              }
            }
            TypeExpression _typ_3 = f.getTyp();
            TypeArguments _t2_1 = _typ_3.getT2();
            CharSequence _compile_1 = this.compile(_t2_1);
            _builder.append(_compile_1, "");
          } else {
            {
              TypeExpression _typ_4 = f.getTyp();
              TypeArguments _t2_2 = _typ_4.getT2();
              boolean _notEquals_4 = (!Objects.equal(_t2_2, null));
              if (_notEquals_4) {
                TypeExpression _typ_5 = f.getTyp();
                CharSequence _compile_2 = this.compile(_typ_5);
                _builder.append(_compile_2, "");
              }
            }
            {
              String _varName_2 = f.getVarName();
              boolean _notEquals_5 = (!Objects.equal(_varName_2, null));
              if (_notEquals_5) {
                _builder.append(" ");
                String _varName_3 = f.getVarName();
                _builder.append(_varName_3, "");
              }
            }
            {
              String _varNameSt_2 = f.getVarNameSt();
              boolean _notEquals_6 = (!Objects.equal(_varNameSt_2, null));
              if (_notEquals_6) {
                _builder.append(" ");
                String _varNameSt_3 = f.getVarNameSt();
                _builder.append(_varNameSt_3, "");
              }
            }
            {
              String _varName2 = f.getVarName2();
              boolean _notEquals_7 = (!Objects.equal(_varName2, null));
              if (_notEquals_7) {
                _builder.append(",");
                String _varName2_1 = f.getVarName2();
                _builder.append(_varName2_1, "");
              }
            }
          }
        }
      }
    }
    return _builder;
  }
  
  /**
   * VariableTyped
   */
  public CharSequence compile(final VariableTyped f) {
    StringConcatenation _builder = new StringConcatenation();
    {
      TypeExpression _typ = f.getTyp();
      boolean _notEquals = (!Objects.equal(_typ, null));
      if (_notEquals) {
        TypeExpression _typ_1 = f.getTyp();
        CharSequence _compile = this.compile(_typ_1);
        _builder.append(_compile, "");
      }
    }
    {
      String _varName = f.getVarName();
      boolean _notEquals_1 = (!Objects.equal(_varName, null));
      if (_notEquals_1) {
        _builder.append(" ");
        String _varName_1 = f.getVarName();
        _builder.append(_varName_1, "");
      }
    }
    return _builder;
  }
  
  /**
   * VariableDeclarationAssign
   * varName=ID // name of variable
   * t12=ID
   * typ=TypeExpression
   * t4=BECOMES Expression
   */
  public CharSequence compile(final VariableDeclarationAssign f) {
    StringConcatenation _builder = new StringConcatenation();
    {
      TypeExpression _typ = f.getTyp();
      boolean _notEquals = (!Objects.equal(_typ, null));
      if (_notEquals) {
        TypeExpression _typ_1 = f.getTyp();
        CharSequence _compile = this.compile(_typ_1);
        _builder.append(_compile, "");
      }
    }
    {
      String _varName = f.getVarName();
      boolean _notEquals_1 = (!Objects.equal(_varName, null));
      if (_notEquals_1) {
        _builder.append(" ");
        String _varName_1 = f.getVarName();
        _builder.append(_varName_1, "");
      }
    }
    {
      EList<String> _t12 = f.getT12();
      for(final String x : _t12) {
        _builder.append(",");
        _builder.append(x, "");
      }
    }
    {
      Expr _t4 = f.getT4();
      boolean _notEquals_2 = (!Objects.equal(_t4, null));
      if (_notEquals_2) {
        _builder.append(":=");
        Expr _t4_1 = f.getT4();
        CharSequence _compile_1 = this.compile(_t4_1);
        _builder.append(_compile_1, "");
      }
    }
    _builder.append(";");
    return _builder;
  }
  
  /**
   * FreeVariable
   */
  public CharSequence compile(final FreeVariable f) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(" ");
    _builder.append("free ");
    return _builder;
  }
  
  /**
   * LocalVariable
   */
  public CharSequence compile(final LocalVariable f) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(" ");
    _builder.append("local");
    return _builder;
  }
  
  /**
   * TypeExpression
   * (t2=TypeArguments -> t3=TypeResult)
   * | TypePrimaryExpression
   */
  public CharSequence compile(final TypeExpression f) {
    StringConcatenation _builder = new StringConcatenation();
    {
      TypeArguments _t2 = f.getT2();
      boolean _notEquals = (!Objects.equal(_t2, null));
      if (_notEquals) {
        _builder.append(" ");
        TypeArguments _t2_1 = f.getT2();
        CharSequence _compile = this.compile(_t2_1);
        _builder.append(_compile, "");
        _builder.append("->");
        TypeResult _t3 = f.getT3();
        CharSequence _compile_1 = this.compile(_t3);
        _builder.append(_compile_1, "");
      }
    }
    {
      if ((f instanceof TypePrimaryExpression)) {
        CharSequence _compile_2 = this.compile(((TypePrimaryExpression) f));
        _builder.append(_compile_2, "");
      }
    }
    {
      TypeArguments _t92 = f.getT92();
      boolean _notEquals_1 = (!Objects.equal(_t92, null));
      if (_notEquals_1) {
        TypeArguments _t92_1 = f.getT92();
        CharSequence _compile_3 = this.compile(_t92_1);
        _builder.append(_compile_3, "");
        _builder.append(" -> ");
        TypeResult _t93 = f.getT93();
        CharSequence _compile_4 = this.compile(_t93);
        _builder.append(_compile_4, "");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("      ");
    _builder.append("//IF f instanceof TypePrimaryExpression2»");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("//compile(f as TypePrimaryExpression2)»");
    _builder.newLine();
    return _builder;
  }
  
  /**
   * TypeParameterList
   * we use a type parameter list for parameters of category, package or domains
   * Parameter list may be empty '()'.
   * in this case parameters may be just ID or they may be nameID:typeID
   * 
   * examples are:
   * ()
   * (String)
   * (s:String)
   * (String,Integer)
   * (s:String,i:Integer)
   * 
   * tyname=LPAREN par=ID?
   * (COLON par21=TypeExpression)?
   * (COMMA par2 += ID (COLON par22+=TypeExpression)?)* RPAREN;
   */
  public CharSequence compile(final TypeParameterList f) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    {
      String _par = f.getPar();
      boolean _notEquals = (!Objects.equal(_par, null));
      if (_notEquals) {
        String _par_1 = f.getPar();
        _builder.append(_par_1, "");
      }
    }
    {
      TypeExpression _par21 = f.getPar21();
      boolean _notEquals_1 = (!Objects.equal(_par21, null));
      if (_notEquals_1) {
        _builder.append(":");
        TypeExpression _par21_1 = f.getPar21();
        _builder.append(_par21_1, "");
      }
    }
    {
      EList<String> _par2 = f.getPar2();
      for(final String x : _par2) {
        _builder.append(",");
        _builder.append(x, "");
        _builder.append(" ");
      }
    }
    {
      EList<TypeExpression> _par22 = f.getPar22();
      boolean _notEquals_2 = (!Objects.equal(_par22, null));
      if (_notEquals_2) {
        _builder.append(":");
      }
    }
    {
      EList<TypeExpression> _par22_1 = f.getPar22();
      for(final TypeExpression x_1 : _par22_1) {
        _builder.append(",");
        _builder.append(x_1, "");
        _builder.append(" ");
      }
    }
    _builder.append(")");
    return _builder;
  }
  
  /**
   * TupleDefinition
   * t4= first TypeExpression
   * t25 = following TypeExpressions)
   */
  public CharSequence compile(final TupleDefinition f) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    {
      TypeExpression _t4 = f.getT4();
      boolean _notEquals = (!Objects.equal(_t4, null));
      if (_notEquals) {
        TypeExpression _t4_1 = f.getT4();
        _builder.append(_t4_1, "");
      }
    }
    {
      EList<TypeExpression> _t25 = f.getT25();
      for(final TypeExpression x : _t25) {
        _builder.append(",");
        _builder.append(x, "");
        _builder.append(" ");
      }
    }
    _builder.append(")");
    return _builder;
  }
  
  /**
   * TypeArguments
   *   t=TypeLiteral |
   * t2=PERCENT |
   * t3='Type' |
   * // usually, but not always type arguments are in parenthesis, and empty
   * // parenthesis are allowed
   * b1 ?= LPAREN ((ID COLON)? t4=TypeExpression)? ( COMMA (ID COLON)? t16 +=TypeExpression)* RPAREN |
   * t5='Record' LPAREN t6=TypeExpression
   * (COLON t22+=TypeExpression)?
   * (COMMA t21+=TypeExpression (COLON t23+=TypeExpression)?)
   * RPAREN |
   * t9='Union' LPAREN t10=TypeExpression
   * (COLON t25+=TypeExpression)?
   * (COMMA t24+=TypeExpression (COLON t26+=TypeExpression)?)
   * RPAREN |
   * t11='Join' LPAREN t12=TypeExpression (COMMA t13+=TypeExpression)* RPAREN |
   * t15=TypeNameOrFunctionCall
   */
  public CharSequence compile(final TypeArguments f) {
    StringConcatenation _builder = new StringConcatenation();
    {
      TypeLiteral _t = f.getT();
      boolean _notEquals = (!Objects.equal(_t, null));
      if (_notEquals) {
        TypeLiteral _t_1 = f.getT();
        CharSequence _compile = this.compile(_t_1);
        _builder.append(_compile, "");
      }
    }
    {
      String _t2 = f.getT2();
      boolean _notEquals_1 = (!Objects.equal(_t2, null));
      if (_notEquals_1) {
        String _t2_1 = f.getT2();
        _builder.append(_t2_1, "");
        _builder.append(" ");
      }
    }
    {
      String _t3 = f.getT3();
      boolean _notEquals_2 = (!Objects.equal(_t3, null));
      if (_notEquals_2) {
        String _t3_1 = f.getT3();
        _builder.append(_t3_1, "");
      }
    }
    {
      TypeExpression _t4 = f.getT4();
      boolean _notEquals_3 = (!Objects.equal(_t4, null));
      if (_notEquals_3) {
        _builder.append("(");
        TypeExpression _t4_1 = f.getT4();
        CharSequence _compile_1 = this.compile(_t4_1);
        _builder.append(_compile_1, "");
        {
          EList<TypeExpression> _t16 = f.getT16();
          for(final TypeExpression x : _t16) {
            _builder.append(",");
            CharSequence _compile_2 = this.compile(x);
            _builder.append(_compile_2, "");
            _builder.append(" ");
          }
        }
        _builder.append(")");
      }
    }
    {
      TypeExpression _t6 = f.getT6();
      boolean _notEquals_4 = (!Objects.equal(_t6, null));
      if (_notEquals_4) {
        _builder.append("Record(");
        TypeExpression _t6_1 = f.getT6();
        CharSequence _compile_3 = this.compile(_t6_1);
        _builder.append(_compile_3, "");
        {
          EList<TypeExpression> _t22 = f.getT22();
          for(final TypeExpression x_1 : _t22) {
            _builder.append(",");
            CharSequence _compile_4 = this.compile(x_1);
            _builder.append(_compile_4, "");
            _builder.append(" ");
          }
        }
        _builder.append(")");
      }
    }
    {
      TypeExpression _t10 = f.getT10();
      boolean _notEquals_5 = (!Objects.equal(_t10, null));
      if (_notEquals_5) {
        _builder.append("Union(");
        TypeExpression _t10_1 = f.getT10();
        CharSequence _compile_5 = this.compile(_t10_1);
        _builder.append(_compile_5, "");
        {
          EList<TypeExpression> _t25 = f.getT25();
          for(final TypeExpression x_2 : _t25) {
            _builder.append(",");
            CharSequence _compile_6 = this.compile(x_2);
            _builder.append(_compile_6, "");
            _builder.append(" ");
          }
        }
        _builder.append(")");
      }
    }
    {
      TypeExpression _t12 = f.getT12();
      boolean _notEquals_6 = (!Objects.equal(_t12, null));
      if (_notEquals_6) {
        _builder.append("Join(");
        TypeExpression _t12_1 = f.getT12();
        CharSequence _compile_7 = this.compile(_t12_1);
        _builder.append(_compile_7, "");
        {
          EList<TypeExpression> _t13 = f.getT13();
          for(final TypeExpression x_3 : _t13) {
            _builder.append(",");
            CharSequence _compile_8 = this.compile(x_3);
            _builder.append(_compile_8, "");
            _builder.append(" ");
          }
        }
        _builder.append(")");
      }
    }
    {
      TypeNameOrFunctionCall _t15 = f.getT15();
      boolean _notEquals_7 = (!Objects.equal(_t15, null));
      if (_notEquals_7) {
        TypeNameOrFunctionCall _t15_1 = f.getT15();
        CharSequence _compile_9 = this.compile(_t15_1);
        _builder.append(_compile_9, "");
        _builder.append(" ");
      }
    }
    return _builder;
  }
  
  /**
   * TypeResult
   *   t=TypeLiteral |
   * t2=PERCENT |
   * tyname='Type' |
   * tyname='Record' LPAREN t7=TypeExpression
   * (COLON t8+=TypeExpression)?
   * (COMMA t21+=TypeExpression (COLON t23+=TypeExpression)?)
   * RPAREN |
   * tyname='Union' LPAREN t10=TypeExpression
   * (COLON t11+=TypeExpression)?
   * (COMMA t24+=TypeExpression (COLON t26+=TypeExpression)?)
   * RPAREN |
   * tyname='Join' LPAREN t12=TypeExpression (COMMA t13+=TypeExpression)* RPAREN |
   * t15=TypeNameOrFunctionCall
   */
  public CharSequence compile(final TypeResult f) {
    StringConcatenation _builder = new StringConcatenation();
    {
      TypeLiteral _t = f.getT();
      boolean _notEquals = (!Objects.equal(_t, null));
      if (_notEquals) {
        TypeLiteral _t_1 = f.getT();
        CharSequence _compile = this.compile(_t_1);
        _builder.append(_compile, "");
      }
    }
    {
      String _t2 = f.getT2();
      boolean _notEquals_1 = (!Objects.equal(_t2, null));
      if (_notEquals_1) {
        _builder.append("Rep");
      }
    }
    {
      String _tyname = f.getTyname();
      boolean _notEquals_2 = (!Objects.equal(_tyname, null));
      if (_notEquals_2) {
        String _tyname_1 = f.getTyname();
        _builder.append(_tyname_1, "");
        _builder.append(" ");
      }
    }
    {
      TypeExpression _t7 = f.getT7();
      boolean _notEquals_3 = (!Objects.equal(_t7, null));
      if (_notEquals_3) {
        _builder.append("Record(");
        TypeExpression _t7_1 = f.getT7();
        CharSequence _compile_1 = this.compile(_t7_1);
        _builder.append(_compile_1, "");
        _builder.append(")");
      }
    }
    {
      TypeExpression _t10 = f.getT10();
      boolean _notEquals_4 = (!Objects.equal(_t10, null));
      if (_notEquals_4) {
        _builder.append("Union(");
        TypeExpression _t10_1 = f.getT10();
        CharSequence _compile_2 = this.compile(_t10_1);
        _builder.append(_compile_2, "");
        _builder.append(")");
      }
    }
    {
      TypeExpression _t12 = f.getT12();
      boolean _notEquals_5 = (!Objects.equal(_t12, null));
      if (_notEquals_5) {
        _builder.append("Join(");
        TypeExpression _t12_1 = f.getT12();
        CharSequence _compile_3 = this.compile(_t12_1);
        _builder.append(_compile_3, "");
        _builder.append(")");
      }
    }
    {
      TypeNameOrFunctionCall _t15 = f.getT15();
      boolean _notEquals_6 = (!Objects.equal(_t15, null));
      if (_notEquals_6) {
        TypeNameOrFunctionCall _t15_1 = f.getT15();
        CharSequence _compile_4 = this.compile(_t15_1);
        _builder.append(_compile_4, "");
      }
    }
    return _builder;
  }
  
  /**
   * TypePrimaryExpression
   *  TypeLiteral
   * | ({TypePrimaryExpression}t32=PERCENT)
   * | ({TypePrimaryExpression}tyname='Type') // 'Type' is top of the category hierarchy
   * | ({TypePrimaryExpression}tyname='Lisp') // 'Lisp' is used for native lisp function calls such as Say$Lisp
   * | ({TypePrimaryExpression}LPAREN t5=TypeExpression RPAREN)
   * | ({TypePrimaryExpression}tyname='Record' LPAREN t7=TypeExpression
   * (COLON t8+=TypeExpression)?
   * (COMMA t21+=TypeExpression (COLON t23+=TypeExpression)?)
   * RPAREN)
   * | ({TypePrimaryExpression}tyname='Union' LPAREN t10=TypeExpression
   * (COLON t11+=TypeExpression)?
   * (COMMA t24+=TypeExpression (COLON t26+=TypeExpression)?)
   * RPAREN)
   * | ({TypePrimaryExpression}tyname='Join'
   * LPAREN t13=TypeExpression (COMMA t14+=TypeExpression)* RPAREN)
   * | TypeNameOrFunctionCall
   * | => TupleDefinition
   */
  public CharSequence compile(final TypePrimaryExpression f) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _t32 = f.getT32();
      boolean _notEquals = (!Objects.equal(_t32, null));
      if (_notEquals) {
        _builder.append("Rep ");
      }
    }
    {
      String _tyname = f.getTyname();
      boolean _notEquals_1 = (!Objects.equal(_tyname, null));
      if (_notEquals_1) {
        String _tyname_1 = f.getTyname();
        _builder.append(_tyname_1, "");
        _builder.append(" ");
      }
    }
    {
      TypeExpression _t5 = f.getT5();
      boolean _notEquals_2 = (!Objects.equal(_t5, null));
      if (_notEquals_2) {
        _builder.append("(");
        TypeExpression _t5_1 = f.getT5();
        CharSequence _compile = this.compile(_t5_1);
        _builder.append(_compile, "");
        _builder.append(")");
      }
    }
    {
      TypeExpression _t7 = f.getT7();
      boolean _notEquals_3 = (!Objects.equal(_t7, null));
      if (_notEquals_3) {
        _builder.append("(");
        TypeExpression _t7_1 = f.getT7();
        CharSequence _compile_1 = this.compile(_t7_1);
        _builder.append(_compile_1, "");
        _builder.append(")");
        {
          EList<TypeExpression> _t8 = f.getT8();
          for(final TypeExpression x : _t8) {
            _builder.append("(");
            CharSequence _compile_2 = this.compile(x);
            _builder.append(_compile_2, "");
            _builder.append(")");
          }
        }
        {
          EList<TypeExpression> _t21 = f.getT21();
          for(final TypeExpression x_1 : _t21) {
            _builder.append("(");
            CharSequence _compile_3 = this.compile(x_1);
            _builder.append(_compile_3, "");
            _builder.append(")");
          }
        }
        {
          EList<TypeExpression> _t23 = f.getT23();
          for(final TypeExpression x_2 : _t23) {
            _builder.append("(");
            CharSequence _compile_4 = this.compile(x_2);
            _builder.append(_compile_4, "");
            _builder.append(")");
          }
        }
      }
    }
    {
      TypeExpression _t10 = f.getT10();
      boolean _notEquals_4 = (!Objects.equal(_t10, null));
      if (_notEquals_4) {
        _builder.append("(");
        TypeExpression _t10_1 = f.getT10();
        _builder.append(_t10_1, "");
        _builder.append(")");
        {
          EList<TypeExpression> _t11 = f.getT11();
          for(final TypeExpression x_3 : _t11) {
            _builder.append("(");
            CharSequence _compile_5 = this.compile(x_3);
            _builder.append(_compile_5, "");
            _builder.append(")");
          }
        }
        {
          EList<TypeExpression> _t24 = f.getT24();
          for(final TypeExpression x_4 : _t24) {
            _builder.append("(");
            CharSequence _compile_6 = this.compile(x_4);
            _builder.append(_compile_6, "");
            _builder.append(")");
          }
        }
        {
          EList<TypeExpression> _t26 = f.getT26();
          for(final TypeExpression x_5 : _t26) {
            _builder.append("(");
            CharSequence _compile_7 = this.compile(x_5);
            _builder.append(_compile_7, "");
            _builder.append(")");
          }
        }
      }
    }
    {
      TypeExpression _t13 = f.getT13();
      boolean _notEquals_5 = (!Objects.equal(_t13, null));
      if (_notEquals_5) {
        _builder.append("(");
        TypeExpression _t13_1 = f.getT13();
        _builder.append(_t13_1, "");
        _builder.append(")");
        {
          EList<TypeExpression> _t14 = f.getT14();
          for(final TypeExpression x_6 : _t14) {
            _builder.append("(");
            CharSequence _compile_8 = this.compile(x_6);
            _builder.append(_compile_8, "");
            _builder.append(")");
          }
        }
      }
    }
    {
      if ((f instanceof TypeLiteral)) {
        CharSequence _compile_9 = this.compile(((TypeLiteral) f));
        _builder.append(_compile_9, "");
      }
    }
    {
      if ((f instanceof TypeNameOrFunctionCall)) {
        CharSequence _compile_10 = this.compile(((TypeNameOrFunctionCall) f));
        _builder.append(_compile_10, "");
      }
    }
    {
      if ((f instanceof TupleDefinition)) {
        CharSequence _compile_11 = this.compile(((TupleDefinition) f));
        _builder.append(_compile_11, "");
      }
    }
    return _builder;
  }
  
  /**
   * TypeNameOrFunctionCall
   * 
   * tfnname=ID
   * ( t4=TypeExpression? (, t25+=TypeExpression)*)
   * |  * t6=TypePrimaryExpression)?
   */
  public CharSequence compile(final TypeNameOrFunctionCall f) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _tfnname = f.getTfnname();
      boolean _notEquals = (!Objects.equal(_tfnname, null));
      if (_notEquals) {
        String _tfnname_1 = f.getTfnname();
        _builder.append(_tfnname_1, "");
      }
    }
    {
      TypeExpression _t4 = f.getT4();
      boolean _notEquals_1 = (!Objects.equal(_t4, null));
      if (_notEquals_1) {
        _builder.append("(");
        TypeExpression _t4_1 = f.getT4();
        CharSequence _compile = this.compile(_t4_1);
        _builder.append(_compile, "");
        {
          EList<TypeExpression> _t25 = f.getT25();
          for(final TypeExpression x : _t25) {
            _builder.append(",");
            CharSequence _compile_1 = this.compile(x);
            _builder.append(_compile_1, "");
          }
        }
        _builder.append(")");
      }
    }
    {
      TypePrimaryExpression _t6 = f.getT6();
      boolean _notEquals_2 = (!Objects.equal(_t6, null));
      if (_notEquals_2) {
        _builder.append("(");
        TypePrimaryExpression _t6_1 = f.getT6();
        CharSequence _compile_2 = this.compile(_t6_1);
        _builder.append(_compile_2, "");
        _builder.append(")");
      }
    }
    {
      WithInline _w = f.getW();
      boolean _notEquals_3 = (!Objects.equal(_w, null));
      if (_notEquals_3) {
        _builder.append("(");
        WithInline _w_1 = f.getW();
        _builder.append(_w_1, "");
        _builder.append(")");
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final TypeNameOrFunctionCall2 f) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _tfnname = f.getTfnname();
      boolean _notEquals = (!Objects.equal(_tfnname, null));
      if (_notEquals) {
        String _tfnname_1 = f.getTfnname();
        _builder.append(_tfnname_1, "");
      }
    }
    {
      TypeExpression _t4 = f.getT4();
      boolean _notEquals_1 = (!Objects.equal(_t4, null));
      if (_notEquals_1) {
        _builder.append("(");
        TypeExpression _t4_1 = f.getT4();
        CharSequence _compile = this.compile(_t4_1);
        _builder.append(_compile, "");
        {
          EList<TypeExpression> _t25 = f.getT25();
          for(final TypeExpression x : _t25) {
            _builder.append(",");
            CharSequence _compile_1 = this.compile(x);
            _builder.append(_compile_1, "");
          }
        }
        _builder.append(")");
      }
    }
    {
      TypePrimaryExpression _t6 = f.getT6();
      boolean _notEquals_2 = (!Objects.equal(_t6, null));
      if (_notEquals_2) {
        _builder.append("(");
        TypePrimaryExpression _t6_1 = f.getT6();
        CharSequence _compile_2 = this.compile(_t6_1);
        _builder.append(_compile_2, "");
        _builder.append(")");
      }
    }
    return _builder;
  }
  
  /**
   * TypeLiteral
   * t1=INT,t22=STRING,t4=CharacterLiteral,
   * t35=BooleanLiteral
   */
  public CharSequence compile(final TypeLiteral f) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _and = false;
      boolean _and_1 = false;
      boolean _and_2 = false;
      boolean _notEquals = (!Objects.equal(f, null));
      if (!_notEquals) {
        _and_2 = false;
      } else {
        String _t22 = f.getT22();
        boolean _equals = Objects.equal(_t22, null);
        _and_2 = _equals;
      }
      if (!_and_2) {
        _and_1 = false;
      } else {
        CharacterLiteral _t34 = f.getT34();
        boolean _equals_1 = Objects.equal(_t34, null);
        _and_1 = _equals_1;
      }
      if (!_and_1) {
        _and = false;
      } else {
        BooleanLiteral _t35 = f.getT35();
        boolean _equals_2 = Objects.equal(_t35, null);
        _and = _equals_2;
      }
      if (_and) {
        _builder.append(" ");
        int _t1 = f.getT1();
        _builder.append(_t1, "");
      }
    }
    {
      String _t22_1 = f.getT22();
      boolean _notEquals_1 = (!Objects.equal(_t22_1, null));
      if (_notEquals_1) {
        _builder.append("\"");
        String _t22_2 = f.getT22();
        _builder.append(_t22_2, "");
        _builder.append("\"");
      }
    }
    {
      CharacterLiteral _t34_1 = f.getT34();
      boolean _notEquals_2 = (!Objects.equal(_t34_1, null));
      if (_notEquals_2) {
        CharacterLiteral _t34_2 = f.getT34();
        CharSequence _compile = this.compile(_t34_2);
        _builder.append(_compile, "");
      }
    }
    {
      BooleanLiteral _t35_1 = f.getT35();
      boolean _notEquals_3 = (!Objects.equal(_t35_1, null));
      if (_notEquals_3) {
        BooleanLiteral _t35_2 = f.getT35();
        CharSequence _compile_1 = this.compile(_t35_2);
        _builder.append(_compile_1, "");
      }
    }
    return _builder;
  }
  
  /**
   * Statement
   * s1=Block
   * s3= StatementExpression
   * s4=IfStatement
   * s5=WhileStatement
   * s6=DoStatement
   * s7=ForStatement
   * s8=BreakStatement
   * s9= IterateStatement
   * s10= ReturnStatement
   */
  public CharSequence compile(final Statement f) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Block _s1 = f.getS1();
      boolean _notEquals = (!Objects.equal(_s1, null));
      if (_notEquals) {
        _builder.append(" ");
        Block _s1_1 = f.getS1();
        CharSequence _compile = this.compile(_s1_1);
        _builder.append(_compile, "");
      }
    }
    {
      StatementExpression _s3 = f.getS3();
      boolean _notEquals_1 = (!Objects.equal(_s3, null));
      if (_notEquals_1) {
        StatementExpression _s3_1 = f.getS3();
        CharSequence _compile_1 = this.compile(_s3_1);
        _builder.append(_compile_1, "");
      }
    }
    {
      IfStatement _s4 = f.getS4();
      boolean _notEquals_2 = (!Objects.equal(_s4, null));
      if (_notEquals_2) {
        IfStatement _s4_1 = f.getS4();
        CharSequence _compile_2 = this.compile(_s4_1);
        _builder.append(_compile_2, "");
      }
    }
    {
      WhileStatement _s5 = f.getS5();
      boolean _notEquals_3 = (!Objects.equal(_s5, null));
      if (_notEquals_3) {
        WhileStatement _s5_1 = f.getS5();
        CharSequence _compile_3 = this.compile(_s5_1);
        _builder.append(_compile_3, "");
      }
    }
    {
      DoStatement _s6 = f.getS6();
      boolean _notEquals_4 = (!Objects.equal(_s6, null));
      if (_notEquals_4) {
        DoStatement _s6_1 = f.getS6();
        CharSequence _compile_4 = this.compile(_s6_1);
        _builder.append(_compile_4, "");
      }
    }
    {
      ForStatement _s7 = f.getS7();
      boolean _notEquals_5 = (!Objects.equal(_s7, null));
      if (_notEquals_5) {
        ForStatement _s7_1 = f.getS7();
        CharSequence _compile_5 = this.compile(_s7_1);
        _builder.append(_compile_5, "");
      }
    }
    {
      BreakStatement _s8 = f.getS8();
      boolean _notEquals_6 = (!Objects.equal(_s8, null));
      if (_notEquals_6) {
        BreakStatement _s8_1 = f.getS8();
        CharSequence _compile_6 = this.compile(_s8_1);
        _builder.append(_compile_6, "");
      }
    }
    {
      IterateStatement _s9 = f.getS9();
      boolean _notEquals_7 = (!Objects.equal(_s9, null));
      if (_notEquals_7) {
        IterateStatement _s9_1 = f.getS9();
        CharSequence _compile_7 = this.compile(_s9_1);
        _builder.append(_compile_7, "");
      }
    }
    {
      ReturnStatement _s10 = f.getS10();
      boolean _notEquals_8 = (!Objects.equal(_s10, null));
      if (_notEquals_8) {
        ReturnStatement _s10_1 = f.getS10();
        CharSequence _compile_8 = this.compile(_s10_1);
        _builder.append(_compile_8, "");
      }
    }
    return _builder;
  }
  
  /**
   * Block
   */
  public CharSequence compile(final Block f) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(" ");
    _builder.append("{");
    _builder.newLine();
    _builder.append("        ");
    {
      EList<Statement> _statemBl = f.getStatemBl();
      for(final Statement x : _statemBl) {
        CharSequence _compile = this.compile(x);
        _builder.append(_compile, "        ");
        _builder.newLineIfNotEmpty();
        _builder.append("        ");
      }
    }
    _builder.append("}");
    return _builder;
  }
  
  /**
   * StatementExpression
   * t=ConditionExpression
   * t5 =BECOMES block
   * t4 =EXIT Statement
   */
  public CharSequence compile(final StatementExpression f) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Expr _t = f.getT();
      boolean _notEquals = (!Objects.equal(_t, null));
      if (_notEquals) {
        Expr _t_1 = f.getT();
        CharSequence _compile = this.compile(_t_1);
        _builder.append(_compile, "");
      }
    }
    {
      Block _t5 = f.getT5();
      boolean _notEquals_1 = (!Objects.equal(_t5, null));
      if (_notEquals_1) {
        _builder.append("=");
        Block _t5_1 = f.getT5();
        CharSequence _compile_1 = this.compile(_t5_1);
        _builder.append(_compile_1, "");
      }
    }
    {
      Statement _t4 = f.getT4();
      boolean _notEquals_2 = (!Objects.equal(_t4, null));
      if (_notEquals_2) {
        _builder.append("=>");
        Statement _t4_1 = f.getT4();
        CharSequence _compile_2 = this.compile(_t4_1);
        _builder.append(_compile_2, "");
      }
    }
    _builder.append(";");
    return _builder;
  }
  
  /**
   * ForStatement
   */
  public CharSequence compile(final ForStatement f) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("for ");
    String _stname = f.getStname();
    _builder.append(_stname, "");
    _builder.append(" in ");
    Expr _t1 = f.getT1();
    CharSequence _compile = this.compile(_t1);
    _builder.append(_compile, "");
    _builder.append("repeat ");
    Statement _s1 = f.getS1();
    CharSequence _compile_1 = this.compile(_s1);
    _builder.append(_compile_1, "");
    return _builder;
  }
  
  /**
   * WhileStatement
   */
  public CharSequence compile(final WhileStatement f) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("while ");
    Expr _t2 = f.getT2();
    CharSequence _compile = this.compile(_t2);
    _builder.append(_compile, "");
    _builder.append("repeat ");
    Statement _s1 = f.getS1();
    CharSequence _compile_1 = this.compile(_s1);
    _builder.append(_compile_1, "");
    return _builder;
  }
  
  /**
   * DoStatement
   */
  public CharSequence compile(final DoStatement f) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("do ");
    Statement _s1 = f.getS1();
    CharSequence _compile = this.compile(_s1);
    _builder.append(_compile, "");
    _builder.append("while ");
    Expr _t2 = f.getT2();
    CharSequence _compile_1 = this.compile(_t2);
    _builder.append(_compile_1, "");
    return _builder;
  }
  
  /**
   * IterateStatement
   */
  public CharSequence compile(final IterateStatement f) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("iterate;");
    return _builder;
  }
  
  /**
   * BreakStatement
   */
  public CharSequence compile(final BreakStatement f) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("break;");
    return _builder;
  }
  
  /**
   * ReturnStatement
   */
  public CharSequence compile(final ReturnStatement f) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Expr _t2 = f.getT2();
      boolean _notEquals = (!Objects.equal(_t2, null));
      if (_notEquals) {
        _builder.append("return ");
        Expr _t2_1 = f.getT2();
        CharSequence _compile = this.compile(_t2_1);
        _builder.append(_compile, "");
        _builder.append(";");
      }
    }
    return _builder;
  }
  
  /**
   * RepeatStatement
   */
  public CharSequence compile(final RepeatStatement f) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Statement _s1 = f.getS1();
      boolean _notEquals = (!Objects.equal(_s1, null));
      if (_notEquals) {
        _builder.append("repeat ");
        Statement _s1_1 = f.getS1();
        CharSequence _compile = this.compile(_s1_1);
        _builder.append(_compile, "");
        _builder.append(";");
      }
    }
    return _builder;
  }
  
  /**
   * IfStatement
   * t2='if' Expression
   * s1='then' Statement
   * s2='else' s2=Statement)?
   * s11 and s12 are form of s1 and s2 in brace
   */
  public CharSequence compile(final IfStatement f) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Expr _t2 = f.getT2();
      boolean _notEquals = (!Objects.equal(_t2, null));
      if (_notEquals) {
        _builder.append("if (");
        Expr _t2_1 = f.getT2();
        CharSequence _compile = this.compile(_t2_1);
        _builder.append(_compile, "");
        _builder.append(")");
        {
          Statement _s1 = f.getS1();
          boolean _notEquals_1 = (!Objects.equal(_s1, null));
          if (_notEquals_1) {
            Statement _s1_1 = f.getS1();
            CharSequence _compile_1 = this.compile(_s1_1);
            _builder.append(_compile_1, "");
          }
        }
        {
          Statement _s2 = f.getS2();
          boolean _notEquals_2 = (!Objects.equal(_s2, null));
          if (_notEquals_2) {
            _builder.append("else ");
            Statement _s2_1 = f.getS2();
            CharSequence _compile_2 = this.compile(_s2_1);
            _builder.append(_compile_2, "");
          }
        }
        {
          Statement _s11 = f.getS11();
          boolean _notEquals_3 = (!Objects.equal(_s11, null));
          if (_notEquals_3) {
            Statement _s11_1 = f.getS11();
            CharSequence _compile_3 = this.compile(_s11_1);
            _builder.append(_compile_3, "");
          }
        }
        {
          Statement _s12 = f.getS12();
          boolean _notEquals_4 = (!Objects.equal(_s12, null));
          if (_notEquals_4) {
            _builder.append("else ");
            Statement _s12_1 = f.getS12();
            CharSequence _compile_4 = this.compile(_s12_1);
            _builder.append(_compile_4, "");
          }
        }
      }
    }
    return _builder;
  }
  
  /**
   * IfElseStatement
   */
  public CharSequence compile(final IfElseStatement f) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Statement _s2 = f.getS2();
      boolean _notEquals = (!Objects.equal(_s2, null));
      if (_notEquals) {
        _builder.append("else ");
        Statement _s2_1 = f.getS2();
        CharSequence _compile = this.compile(_s2_1);
        _builder.append(_compile, "");
      }
    }
    return _builder;
  }
  
  /**
   * Expr
   */
  public CharSequence compile(final Expr f) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((f instanceof ConditionExpression)) {
        CharSequence _compile = this.compile(((ConditionExpression) f));
        _builder.append(_compile, "");
      }
    }
    {
      if ((f instanceof AndExpression)) {
        CharSequence _compile_1 = this.compile(((AndExpression) f));
        _builder.append(_compile_1, "");
      }
    }
    {
      if ((f instanceof OrExpression)) {
        CharSequence _compile_2 = this.compile(((OrExpression) f));
        _builder.append(_compile_2, "");
      }
    }
    {
      if ((f instanceof ExitExpression)) {
        CharSequence _compile_3 = this.compile(((ExitExpression) f));
        _builder.append(_compile_3, "");
      }
    }
    {
      if ((f instanceof AssignExpression)) {
        CharSequence _compile_4 = this.compile(((AssignExpression) f));
        _builder.append(_compile_4, "");
      }
    }
    {
      if ((f instanceof InnerProdExpression)) {
        CharSequence _compile_5 = this.compile(((InnerProdExpression) f));
        _builder.append(_compile_5, "");
      }
    }
    {
      if ((f instanceof OuterProdExpression)) {
        CharSequence _compile_6 = this.compile(((OuterProdExpression) f));
        _builder.append(_compile_6, "");
      }
    }
    {
      if ((f instanceof HasExpression)) {
        CharSequence _compile_7 = this.compile(((HasExpression) f));
        _builder.append(_compile_7, "");
      }
    }
    {
      if ((f instanceof CaseExpression)) {
        CharSequence _compile_8 = this.compile(((CaseExpression) f));
        _builder.append(_compile_8, "");
      }
    }
    {
      if ((f instanceof EqualityExpression)) {
        CharSequence _compile_9 = this.compile(((EqualityExpression) f));
        _builder.append(_compile_9, "");
      }
    }
    {
      if ((f instanceof RelationalExpression)) {
        CharSequence _compile_10 = this.compile(((RelationalExpression) f));
        _builder.append(_compile_10, "");
      }
    }
    {
      if ((f instanceof IsExpression)) {
        CharSequence _compile_11 = this.compile(((IsExpression) f));
        _builder.append(_compile_11, "");
      }
    }
    {
      if ((f instanceof SegmentExpression)) {
        CharSequence _compile_12 = this.compile(((SegmentExpression) f));
        _builder.append(_compile_12, "");
      }
    }
    {
      if ((f instanceof AdditiveExpression)) {
        CharSequence _compile_13 = this.compile(((AdditiveExpression) f));
        _builder.append(_compile_13, "");
      }
    }
    {
      if ((f instanceof ExquoExpression)) {
        CharSequence _compile_14 = this.compile(((ExquoExpression) f));
        _builder.append(_compile_14, "");
      }
    }
    {
      if ((f instanceof DivisionExpression)) {
        CharSequence _compile_15 = this.compile(((DivisionExpression) f));
        _builder.append(_compile_15, "");
      }
    }
    {
      if ((f instanceof QuoExpression)) {
        CharSequence _compile_16 = this.compile(((QuoExpression) f));
        _builder.append(_compile_16, "");
      }
    }
    {
      if ((f instanceof ModExpression)) {
        CharSequence _compile_17 = this.compile(((ModExpression) f));
        _builder.append(_compile_17, "");
      }
    }
    {
      if ((f instanceof RemExpression)) {
        CharSequence _compile_18 = this.compile(((RemExpression) f));
        _builder.append(_compile_18, "");
      }
    }
    {
      if ((f instanceof MapDefinition)) {
        CharSequence _compile_19 = this.compile(((MapDefinition) f));
        _builder.append(_compile_19, "");
      }
    }
    {
      if ((f instanceof MultiplicativeExpression)) {
        CharSequence _compile_20 = this.compile(((MultiplicativeExpression) f));
        _builder.append(_compile_20, "");
      }
    }
    {
      if ((f instanceof ExponentExpression)) {
        CharSequence _compile_21 = this.compile(((ExponentExpression) f));
        _builder.append(_compile_21, "");
      }
    }
    {
      if ((f instanceof PretendExpression)) {
        CharSequence _compile_22 = this.compile(((PretendExpression) f));
        _builder.append(_compile_22, "");
      }
    }
    {
      if ((f instanceof HintTypeExpression)) {
        CharSequence _compile_23 = this.compile(((HintTypeExpression) f));
        _builder.append(_compile_23, "");
      }
    }
    {
      if ((f instanceof CoerceExpression)) {
        CharSequence _compile_24 = this.compile(((CoerceExpression) f));
        _builder.append(_compile_24, "");
      }
    }
    {
      if ((f instanceof EltExpression)) {
        CharSequence _compile_25 = this.compile(((EltExpression) f));
        _builder.append(_compile_25, "");
      }
    }
    {
      if ((f instanceof ExplicitTypeExpression)) {
        CharSequence _compile_26 = this.compile(((ExplicitTypeExpression) f));
        _builder.append(_compile_26, "");
      }
    }
    {
      if ((f instanceof UnaryExpression)) {
        CharSequence _compile_27 = this.compile(((UnaryExpression) f));
        _builder.append(_compile_27, "");
      }
    }
    {
      if ((f instanceof PrimaryPrefix)) {
        CharSequence _compile_28 = this.compile(((PrimaryPrefix) f));
        _builder.append(_compile_28, "");
      }
    }
    {
      Expr _ifpred = f.getIfpred();
      boolean _notEquals = (!Objects.equal(_ifpred, null));
      if (_notEquals) {
        _builder.append("if ");
        Expr _ifpred_1 = f.getIfpred();
        CharSequence _compile_29 = this.compile(_ifpred_1);
        _builder.append(_compile_29, "");
        _builder.append(" ");
      }
    }
    {
      Expr _thenexp = f.getThenexp();
      boolean _notEquals_1 = (!Objects.equal(_thenexp, null));
      if (_notEquals_1) {
        _builder.append("then ");
        Expr _thenexp_1 = f.getThenexp();
        CharSequence _compile_30 = this.compile(_thenexp_1);
        _builder.append(_compile_30, "");
        _builder.append(" ");
      }
    }
    {
      Expr _elseexp = f.getElseexp();
      boolean _notEquals_2 = (!Objects.equal(_elseexp, null));
      if (_notEquals_2) {
        _builder.append("else ");
        Expr _elseexp_1 = f.getElseexp();
        CharSequence _compile_31 = this.compile(_elseexp_1);
        _builder.append(_compile_31, "");
        _builder.append(" ");
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final ConditionExpression f) {
    StringConcatenation _builder = new StringConcatenation();
    Expr _left = f.getLeft();
    CharSequence _compile = this.compile(_left);
    _builder.append(_compile, "");
    {
      Expr _right = f.getRight();
      boolean _notEquals = (!Objects.equal(_right, null));
      if (_notEquals) {
        String _op = f.getOp();
        _builder.append(_op, "");
        Expr _right_1 = f.getRight();
        CharSequence _compile_1 = this.compile(_right_1);
        _builder.append(_compile_1, "");
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final InnerProdExpression f) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Expr _left = f.getLeft();
      boolean _notEquals = (!Objects.equal(_left, null));
      if (_notEquals) {
        Expr _left_1 = f.getLeft();
        CharSequence _compile = this.compile(_left_1);
        _builder.append(_compile, "");
      }
    }
    {
      Expr _right = f.getRight();
      boolean _notEquals_1 = (!Objects.equal(_right, null));
      if (_notEquals_1) {
        _builder.append("wedge");
        Expr _right_1 = f.getRight();
        CharSequence _compile_1 = this.compile(_right_1);
        _builder.append(_compile_1, "");
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final OuterProdExpression f) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Expr _left = f.getLeft();
      boolean _notEquals = (!Objects.equal(_left, null));
      if (_notEquals) {
        Expr _left_1 = f.getLeft();
        CharSequence _compile = this.compile(_left_1);
        _builder.append(_compile, "");
      }
    }
    {
      Expr _right = f.getRight();
      boolean _notEquals_1 = (!Objects.equal(_right, null));
      if (_notEquals_1) {
        _builder.append("hat");
        Expr _right_1 = f.getRight();
        CharSequence _compile_1 = this.compile(_right_1);
        _builder.append(_compile_1, "");
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final AndExpression f) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Expr _left = f.getLeft();
      boolean _notEquals = (!Objects.equal(_left, null));
      if (_notEquals) {
        Expr _left_1 = f.getLeft();
        CharSequence _compile = this.compile(_left_1);
        _builder.append(_compile, "");
      }
    }
    {
      Expr _right = f.getRight();
      boolean _notEquals_1 = (!Objects.equal(_right, null));
      if (_notEquals_1) {
        _builder.append("&");
        Expr _right_1 = f.getRight();
        CharSequence _compile_1 = this.compile(_right_1);
        _builder.append(_compile_1, "");
      }
    }
    return _builder;
  }
  
  /**
   * AssignExpression
   */
  public CharSequence compile(final AssignExpression f) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Expr _left = f.getLeft();
      boolean _notEquals = (!Objects.equal(_left, null));
      if (_notEquals) {
        Expr _left_1 = f.getLeft();
        CharSequence _compile = this.compile(_left_1);
        _builder.append(_compile, "");
      }
    }
    {
      Expr _right = f.getRight();
      boolean _notEquals_1 = (!Objects.equal(_right, null));
      if (_notEquals_1) {
        _builder.append("=");
        Expr _right_1 = f.getRight();
        CharSequence _compile_1 = this.compile(_right_1);
        _builder.append(_compile_1, "");
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final ExitExpression f) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Expr _left = f.getLeft();
      boolean _notEquals = (!Objects.equal(_left, null));
      if (_notEquals) {
        Expr _left_1 = f.getLeft();
        CharSequence _compile = this.compile(_left_1);
        _builder.append(_compile, "");
      }
    }
    {
      Expr _right = f.getRight();
      boolean _notEquals_1 = (!Objects.equal(_right, null));
      if (_notEquals_1) {
        String _op = f.getOp();
        _builder.append(_op, "");
        Expr _right_1 = f.getRight();
        CharSequence _compile_1 = this.compile(_right_1);
        _builder.append(_compile_1, "");
      }
    }
    return _builder;
  }
  
  /**
   * MapDefinition
   */
  public CharSequence compile(final MapDefinition f) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Expr _left = f.getLeft();
      boolean _notEquals = (!Objects.equal(_left, null));
      if (_notEquals) {
        Expr _left_1 = f.getLeft();
        CharSequence _compile = this.compile(_left_1);
        _builder.append(_compile, "");
      }
    }
    {
      Expr _right = f.getRight();
      boolean _notEquals_1 = (!Objects.equal(_right, null));
      if (_notEquals_1) {
        String _op = f.getOp();
        _builder.append(_op, "");
        Expr _right_1 = f.getRight();
        CharSequence _compile_1 = this.compile(_right_1);
        _builder.append(_compile_1, "");
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final OrExpression f) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Expr _left = f.getLeft();
      boolean _notEquals = (!Objects.equal(_left, null));
      if (_notEquals) {
        Expr _left_1 = f.getLeft();
        CharSequence _compile = this.compile(_left_1);
        _builder.append(_compile, "");
      }
    }
    {
      Expr _right = f.getRight();
      boolean _notEquals_1 = (!Objects.equal(_right, null));
      if (_notEquals_1) {
        _builder.append("|");
        Expr _right_1 = f.getRight();
        CharSequence _compile_1 = this.compile(_right_1);
        _builder.append(_compile_1, "");
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final HasExpression f) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Expr _left = f.getLeft();
      boolean _notEquals = (!Objects.equal(_left, null));
      if (_notEquals) {
        Expr _left_1 = f.getLeft();
        CharSequence _compile = this.compile(_left_1);
        _builder.append(_compile, "");
      }
    }
    {
      TypeExpression _rightType = f.getRightType();
      boolean _notEquals_1 = (!Objects.equal(_rightType, null));
      if (_notEquals_1) {
        String _op = f.getOp();
        _builder.append(_op, "");
        TypeExpression _rightType_1 = f.getRightType();
        CharSequence _compile_1 = this.compile(_rightType_1);
        _builder.append(_compile_1, "");
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final CaseExpression f) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Expr _left = f.getLeft();
      boolean _notEquals = (!Objects.equal(_left, null));
      if (_notEquals) {
        Expr _left_1 = f.getLeft();
        CharSequence _compile = this.compile(_left_1);
        _builder.append(_compile, "");
      }
    }
    {
      Expr _right = f.getRight();
      boolean _notEquals_1 = (!Objects.equal(_right, null));
      if (_notEquals_1) {
        String _op = f.getOp();
        _builder.append(_op, "");
        _builder.append(" ");
        Expr _right_1 = f.getRight();
        CharSequence _compile_1 = this.compile(_right_1);
        _builder.append(_compile_1, "");
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final EqualityExpression f) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Expr _left = f.getLeft();
      boolean _notEquals = (!Objects.equal(_left, null));
      if (_notEquals) {
        Expr _left_1 = f.getLeft();
        CharSequence _compile = this.compile(_left_1);
        _builder.append(_compile, "");
      }
    }
    {
      Expr _right = f.getRight();
      boolean _notEquals_1 = (!Objects.equal(_right, null));
      if (_notEquals_1) {
        String _op = f.getOp();
        _builder.append(_op, "");
        _builder.append(" ");
        Expr _right_1 = f.getRight();
        CharSequence _compile_1 = this.compile(_right_1);
        _builder.append(_compile_1, "");
      }
    }
    return _builder;
  }
  
  /**
   * RelationalExpression
   */
  public CharSequence compile(final RelationalExpression f) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Expr _left = f.getLeft();
      boolean _notEquals = (!Objects.equal(_left, null));
      if (_notEquals) {
        Expr _left_1 = f.getLeft();
        CharSequence _compile = this.compile(_left_1);
        _builder.append(_compile, "");
      }
    }
    {
      Expr _right = f.getRight();
      boolean _notEquals_1 = (!Objects.equal(_right, null));
      if (_notEquals_1) {
        String _op = f.getOp();
        _builder.append(_op, "");
        Expr _right_1 = f.getRight();
        CharSequence _compile_1 = this.compile(_right_1);
        _builder.append(_compile_1, "");
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final IsExpression f) {
    StringConcatenation _builder = new StringConcatenation();
    Expr _left = f.getLeft();
    CharSequence _compile = this.compile(_left);
    _builder.append(_compile, "");
    {
      TypeExpression _rightType = f.getRightType();
      boolean _notEquals = (!Objects.equal(_rightType, null));
      if (_notEquals) {
        String _op = f.getOp();
        _builder.append(_op, "");
        TypeExpression _rightType_1 = f.getRightType();
        CharSequence _compile_1 = this.compile(_rightType_1);
        _builder.append(_compile_1, "");
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final SegmentExpression f) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Expr _left = f.getLeft();
      boolean _notEquals = (!Objects.equal(_left, null));
      if (_notEquals) {
        Expr _left_1 = f.getLeft();
        CharSequence _compile = this.compile(_left_1);
        _builder.append(_compile, "");
      }
    }
    {
      Expr _right = f.getRight();
      boolean _notEquals_1 = (!Objects.equal(_right, null));
      if (_notEquals_1) {
        String _op = f.getOp();
        _builder.append(_op, "");
        Expr _right_1 = f.getRight();
        CharSequence _compile_1 = this.compile(_right_1);
        _builder.append(_compile_1, "");
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final AdditiveExpression f) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Expr _left = f.getLeft();
      boolean _notEquals = (!Objects.equal(_left, null));
      if (_notEquals) {
        Expr _left_1 = f.getLeft();
        CharSequence _compile = this.compile(_left_1);
        _builder.append(_compile, "");
      }
    }
    {
      Expr _right = f.getRight();
      boolean _notEquals_1 = (!Objects.equal(_right, null));
      if (_notEquals_1) {
        String _op = f.getOp();
        _builder.append(_op, "");
        Expr _right_1 = f.getRight();
        CharSequence _compile_1 = this.compile(_right_1);
        _builder.append(_compile_1, "");
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final ExquoExpression f) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Expr _left = f.getLeft();
      boolean _notEquals = (!Objects.equal(_left, null));
      if (_notEquals) {
        Expr _left_1 = f.getLeft();
        CharSequence _compile = this.compile(_left_1);
        _builder.append(_compile, "");
      }
    }
    {
      Expr _right = f.getRight();
      boolean _notEquals_1 = (!Objects.equal(_right, null));
      if (_notEquals_1) {
        String _op = f.getOp();
        _builder.append(_op, "");
        Expr _right_1 = f.getRight();
        CharSequence _compile_1 = this.compile(_right_1);
        _builder.append(_compile_1, "");
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final DivisionExpression f) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Expr _left = f.getLeft();
      boolean _notEquals = (!Objects.equal(_left, null));
      if (_notEquals) {
        Expr _left_1 = f.getLeft();
        CharSequence _compile = this.compile(_left_1);
        _builder.append(_compile, "");
      }
    }
    {
      Expr _right = f.getRight();
      boolean _notEquals_1 = (!Objects.equal(_right, null));
      if (_notEquals_1) {
        String _op = f.getOp();
        _builder.append(_op, "");
        Expr _right_1 = f.getRight();
        CharSequence _compile_1 = this.compile(_right_1);
        _builder.append(_compile_1, "");
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final QuoExpression f) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Expr _left = f.getLeft();
      boolean _notEquals = (!Objects.equal(_left, null));
      if (_notEquals) {
        Expr _left_1 = f.getLeft();
        CharSequence _compile = this.compile(_left_1);
        _builder.append(_compile, "");
      }
    }
    {
      Expr _right = f.getRight();
      boolean _notEquals_1 = (!Objects.equal(_right, null));
      if (_notEquals_1) {
        String _op = f.getOp();
        _builder.append(_op, "");
        _builder.append(" ");
        Expr _right_1 = f.getRight();
        CharSequence _compile_1 = this.compile(_right_1);
        _builder.append(_compile_1, "");
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final ModExpression f) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Expr _left = f.getLeft();
      boolean _notEquals = (!Objects.equal(_left, null));
      if (_notEquals) {
        Expr _left_1 = f.getLeft();
        CharSequence _compile = this.compile(_left_1);
        _builder.append(_compile, "");
      }
    }
    {
      Expr _right = f.getRight();
      boolean _notEquals_1 = (!Objects.equal(_right, null));
      if (_notEquals_1) {
        String _op = f.getOp();
        _builder.append(_op, "");
        _builder.append(" ");
        Expr _right_1 = f.getRight();
        CharSequence _compile_1 = this.compile(_right_1);
        _builder.append(_compile_1, "");
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final RemExpression f) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Expr _left = f.getLeft();
      boolean _notEquals = (!Objects.equal(_left, null));
      if (_notEquals) {
        Expr _left_1 = f.getLeft();
        CharSequence _compile = this.compile(_left_1);
        _builder.append(_compile, "");
      }
    }
    {
      Expr _right = f.getRight();
      boolean _notEquals_1 = (!Objects.equal(_right, null));
      if (_notEquals_1) {
        String _op = f.getOp();
        _builder.append(_op, "");
        Expr _right_1 = f.getRight();
        CharSequence _compile_1 = this.compile(_right_1);
        _builder.append(_compile_1, "");
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final MultiplicativeExpression f) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Expr _left = f.getLeft();
      boolean _notEquals = (!Objects.equal(_left, null));
      if (_notEquals) {
        Expr _left_1 = f.getLeft();
        CharSequence _compile = this.compile(_left_1);
        _builder.append(_compile, "");
      }
    }
    {
      Expr _right = f.getRight();
      boolean _notEquals_1 = (!Objects.equal(_right, null));
      if (_notEquals_1) {
        String _op = f.getOp();
        _builder.append(_op, "");
        Expr _right_1 = f.getRight();
        CharSequence _compile_1 = this.compile(_right_1);
        _builder.append(_compile_1, "");
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final ExponentExpression f) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Expr _left = f.getLeft();
      boolean _notEquals = (!Objects.equal(_left, null));
      if (_notEquals) {
        Expr _left_1 = f.getLeft();
        CharSequence _compile = this.compile(_left_1);
        _builder.append(_compile, "");
      }
    }
    {
      Expr _right = f.getRight();
      boolean _notEquals_1 = (!Objects.equal(_right, null));
      if (_notEquals_1) {
        String _op = f.getOp();
        _builder.append(_op, "");
        Expr _right_1 = f.getRight();
        CharSequence _compile_1 = this.compile(_right_1);
        _builder.append(_compile_1, "");
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final PretendExpression f) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Expr _left = f.getLeft();
      boolean _notEquals = (!Objects.equal(_left, null));
      if (_notEquals) {
        Expr _left_1 = f.getLeft();
        CharSequence _compile = this.compile(_left_1);
        _builder.append(_compile, "");
      }
    }
    {
      TypeExpression _rightType = f.getRightType();
      boolean _notEquals_1 = (!Objects.equal(_rightType, null));
      if (_notEquals_1) {
        String _op = f.getOp();
        _builder.append(_op, "");
        TypeExpression _rightType_1 = f.getRightType();
        CharSequence _compile_1 = this.compile(_rightType_1);
        _builder.append(_compile_1, "");
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final HintTypeExpression f) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Expr _left = f.getLeft();
      boolean _notEquals = (!Objects.equal(_left, null));
      if (_notEquals) {
        Expr _left_1 = f.getLeft();
        CharSequence _compile = this.compile(_left_1);
        _builder.append(_compile, "");
      }
    }
    {
      TypeExpression _rightType = f.getRightType();
      boolean _notEquals_1 = (!Objects.equal(_rightType, null));
      if (_notEquals_1) {
        String _op = f.getOp();
        _builder.append(_op, "");
        TypeExpression _rightType_1 = f.getRightType();
        CharSequence _compile_1 = this.compile(_rightType_1);
        _builder.append(_compile_1, "");
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final CoerceExpression f) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Expr _left = f.getLeft();
      boolean _notEquals = (!Objects.equal(_left, null));
      if (_notEquals) {
        Expr _left_1 = f.getLeft();
        CharSequence _compile = this.compile(_left_1);
        _builder.append(_compile, "");
      }
    }
    {
      TypeExpression _rightType = f.getRightType();
      boolean _notEquals_1 = (!Objects.equal(_rightType, null));
      if (_notEquals_1) {
        String _op = f.getOp();
        _builder.append(_op, "");
        TypeExpression _rightType_1 = f.getRightType();
        CharSequence _compile_1 = this.compile(_rightType_1);
        _builder.append(_compile_1, "");
      }
    }
    return _builder;
  }
  
  /**
   * EltExpression
   */
  public CharSequence compile(final EltExpression f) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Expr _left = f.getLeft();
      boolean _notEquals = (!Objects.equal(_left, null));
      if (_notEquals) {
        Expr _left_1 = f.getLeft();
        CharSequence _compile = this.compile(_left_1);
        _builder.append(_compile, "");
      }
    }
    {
      Expr _right = f.getRight();
      boolean _notEquals_1 = (!Objects.equal(_right, null));
      if (_notEquals_1) {
        String _op = f.getOp();
        _builder.append(_op, "");
        Expr _right_1 = f.getRight();
        CharSequence _compile_1 = this.compile(_right_1);
        _builder.append(_compile_1, "");
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final ExplicitTypeExpression f) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Expr _left = f.getLeft();
      boolean _notEquals = (!Objects.equal(_left, null));
      if (_notEquals) {
        Expr _left_1 = f.getLeft();
        CharSequence _compile = this.compile(_left_1);
        _builder.append(_compile, "");
      }
    }
    {
      TypeExpression _rightType = f.getRightType();
      boolean _notEquals_1 = (!Objects.equal(_rightType, null));
      if (_notEquals_1) {
        String _op = f.getOp();
        _builder.append(_op, "");
        TypeExpression _rightType_1 = f.getRightType();
        CharSequence _compile_1 = this.compile(_rightType_1);
        _builder.append(_compile_1, "");
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final UnaryExpression f) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Expr _expr = f.getExpr();
      boolean _notEquals = (!Objects.equal(_expr, null));
      if (_notEquals) {
        String _uop = f.getUop();
        _builder.append(_uop, "");
        Expr _expr_1 = f.getExpr();
        CharSequence _compile = this.compile(_expr_1);
        _builder.append(_compile, "");
      }
    }
    return _builder;
  }
  
  /**
   * PrimaryPrefix
   *  Literal
   *  LPAREN t4=Expression (COMMA t25+=Expression)* RPAREN =>(COLON rightType3 =TypeExpression)?
   *  t7=NameOrFunctionCall
   */
  public CharSequence compile(final PrimaryPrefix f) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((f instanceof Literal)) {
        CharSequence _compile = this.compile(((Literal) f));
        _builder.append(_compile, "");
      }
    }
    {
      Expr _t4 = f.getT4();
      boolean _notEquals = (!Objects.equal(_t4, null));
      if (_notEquals) {
        _builder.append("(");
        Expr _t4_1 = f.getT4();
        CharSequence _compile_1 = this.compile(_t4_1);
        _builder.append(_compile_1, "");
        _builder.append(")");
      }
    }
    {
      NameOrFunctionCall _t7 = f.getT7();
      boolean _notEquals_1 = (!Objects.equal(_t7, null));
      if (_notEquals_1) {
        NameOrFunctionCall _t7_1 = f.getT7();
        CharSequence _compile_2 = this.compile(_t7_1);
        _builder.append(_compile_2, "");
      }
    }
    return _builder;
  }
  
  /**
   * NameOrFunctionCall
   * 
   * fnname=ID (=> lsp=DOLAR 'Lisp't2=TypeExpression
   * LPAREN t4=Expression? (COMMA t5+=Expression)* RPAREN //(COLON rightType2 =TypeExpression)?
   * (LPAREN t14+=Statement? (COMMA t15+=Expression)* RPAREN)
   *  t6=PrimaryExpression
   * ((COMMA ID)* COLON rightType2 =TypeExpression
   */
  public CharSequence compile(final NameOrFunctionCall f) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _fnname = f.getFnname();
      boolean _notEquals = (!Objects.equal(_fnname, null));
      if (_notEquals) {
        String _fnname_1 = f.getFnname();
        _builder.append(_fnname_1, "");
      }
    }
    {
      String _lsp = f.getLsp();
      boolean _notEquals_1 = (!Objects.equal(_lsp, null));
      if (_notEquals_1) {
        _builder.append("$Lisp ");
      }
    }
    {
      Expr _t4 = f.getT4();
      boolean _notEquals_2 = (!Objects.equal(_t4, null));
      if (_notEquals_2) {
        _builder.append("(");
        Expr _t4_1 = f.getT4();
        CharSequence _compile = this.compile(_t4_1);
        _builder.append(_compile, "");
        {
          EList<Expr> _t5 = f.getT5();
          for(final Expr x : _t5) {
            _builder.append(",");
            CharSequence _compile_1 = this.compile(x);
            _builder.append(_compile_1, "");
          }
        }
        _builder.append(")");
      }
    }
    {
      Expr _t6 = f.getT6();
      boolean _notEquals_3 = (!Objects.equal(_t6, null));
      if (_notEquals_3) {
        Expr _t6_1 = f.getT6();
        CharSequence _compile_2 = this.compile(_t6_1);
        _builder.append(_compile_2, "");
      }
    }
    return _builder;
  }
  
  /**
   * Literal
   * value=INT
   * t2=STRING (=> e1=NameOrFunctionCall =>(t31+=STRING (=> e4+=NameOrFunctionCall)?)*)?
   * t3=FloatLiteral // conflicts with use of '.' for elt
   * ListLiteral
   * CharacterLiteral
   * BooleanLiteral
   */
  public CharSequence compile(final Literal f) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _and = false;
      if (!(((!(f instanceof ListLiteral)) && 
        (!(f instanceof CharacterLiteral))) && 
        (!(f instanceof BooleanLiteral)))) {
        _and = false;
      } else {
        String _t2 = f.getT2();
        boolean _equals = Objects.equal(_t2, null);
        _and = _equals;
      }
      if (_and) {
        int _value = f.getValue();
        _builder.append(_value, "");
      }
    }
    {
      String _t2_1 = f.getT2();
      boolean _notEquals = (!Objects.equal(_t2_1, null));
      if (_notEquals) {
        _builder.append("\"");
        String _t2_2 = f.getT2();
        _builder.append(_t2_2, "");
        _builder.append("\"");
      }
    }
    {
      if ((f instanceof ListLiteral)) {
        CharSequence _compile = this.compile(((ListLiteral) f));
        _builder.append(_compile, "");
      }
    }
    {
      if ((f instanceof CharacterLiteral)) {
        CharSequence _compile_1 = this.compile(((CharacterLiteral) f));
        _builder.append(_compile_1, "");
      }
    }
    {
      if ((f instanceof BooleanLiteral)) {
        CharSequence _compile_2 = this.compile(((BooleanLiteral) f));
        _builder.append(_compile_2, "");
      }
    }
    return _builder;
  }
  
  /**
   * CharacterLiteral
   */
  public CharSequence compile(final CharacterLiteral f) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _c1 = f.getC1();
      boolean _notEquals = (!Objects.equal(_c1, null));
      if (_notEquals) {
        String _c1_1 = f.getC1();
        _builder.append(_c1_1, "");
      }
    }
    return _builder;
  }
  
  /**
   * BooleanLiteral
   */
  public CharSequence compile(final BooleanLiteral f) {
    StringConcatenation _builder = new StringConcatenation();
    String _litname = f.getLitname();
    _builder.append(_litname, "");
    return _builder;
  }
  
  /**
   * ListLiteral
   */
  public CharSequence compile(final ListLiteral f) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("[");
    {
      Expr _l2 = f.getL2();
      boolean _notEquals = (!Objects.equal(_l2, null));
      if (_notEquals) {
        Expr _l2_1 = f.getL2();
        CharSequence _compile = this.compile(_l2_1);
        _builder.append(_compile, "");
      }
    }
    {
      EList<Expr> _t3 = f.getT3();
      for(final Expr x : _t3) {
        _builder.append(",");
        CharSequence _compile_1 = this.compile(x);
        _builder.append(_compile_1, "");
      }
    }
    {
      EList<Expr> _t14 = f.getT14();
      for(final Expr x_1 : _t14) {
        _builder.append("for ");
        CharSequence _compile_2 = this.compile(x_1);
        _builder.append(_compile_2, "");
        _builder.append("in ");
      }
    }
    {
      EList<Expr> _l5 = f.getL5();
      for(final Expr x_2 : _l5) {
        CharSequence _compile_3 = this.compile(x_2);
        _builder.append(_compile_3, "");
        _builder.append(" ");
      }
    }
    _builder.append("]");
    return _builder;
  }
}
