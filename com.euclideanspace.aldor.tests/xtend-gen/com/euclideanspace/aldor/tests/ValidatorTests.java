package com.euclideanspace.aldor.tests;

import com.euclideanspace.aldor.EditorInjectorProvider;
import com.euclideanspace.aldor.editor.EditorPackage;
import com.euclideanspace.aldor.editor.Model;
import com.google.inject.Inject;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Copyright 2014 Martin John Baker
 * 
 * This file is part of EuclideanSpace.
 * 
 * EuclideanSpace is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * EuclideanSpace is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with EuclideanSpace. If not, see <http://www.gnu.org/licenses/>.
 */
@RunWith(XtextRunner.class)
@InjectWith(EditorInjectorProvider.class)
@SuppressWarnings("all")
public class ValidatorTests {
  @Inject
  @Extension
  private ParseHelper<Model> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Test
  public void testIf1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("if");
      Model _parse = this._parseHelper.parse(_builder);
      EClass _flow_AnyStatement = EditorPackage.eINSTANCE.getFlow_AnyStatement();
      this._validationTestHelper.assertError(_parse, _flow_AnyStatement, null, 
        "predicate must follow \'if\' keyword");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testIf2() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("if a");
      Model _parse = this._parseHelper.parse(_builder);
      EClass _flow_AnyStatement = EditorPackage.eINSTANCE.getFlow_AnyStatement();
      this._validationTestHelper.assertError(_parse, _flow_AnyStatement, null, 
        "missing \'then\' following \'if\' keyword");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testIfThen1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("if a then");
      Model _parse = this._parseHelper.parse(_builder);
      EClass _flow_AnyStatement = EditorPackage.eINSTANCE.getFlow_AnyStatement();
      this._validationTestHelper.assertError(_parse, _flow_AnyStatement, null, 
        "statement must follow \'then\' keyword");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testIfThenElse1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("if a then b else");
      Model _parse = this._parseHelper.parse(_builder);
      EClass _flow_AnyStatement = EditorPackage.eINSTANCE.getFlow_AnyStatement();
      this._validationTestHelper.assertError(_parse, _flow_AnyStatement, null, 
        "statement must follow \'else\' keyword");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testRepeat1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("while");
      Model _parse = this._parseHelper.parse(_builder);
      EClass _flow_AnyStatement = EditorPackage.eINSTANCE.getFlow_AnyStatement();
      this._validationTestHelper.assertError(_parse, _flow_AnyStatement, null, 
        "statement must follow \'while\' keyword");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testRepeat2() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("while a");
      Model _parse = this._parseHelper.parse(_builder);
      EClass _flow_AnyStatement = EditorPackage.eINSTANCE.getFlow_AnyStatement();
      this._validationTestHelper.assertError(_parse, _flow_AnyStatement, null, 
        "\'repeat\' expected after \'while\' keyword");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testRepeat3() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("while a repeat");
      Model _parse = this._parseHelper.parse(_builder);
      EClass _flow_AnyStatement = EditorPackage.eINSTANCE.getFlow_AnyStatement();
      this._validationTestHelper.assertError(_parse, _flow_AnyStatement, null, 
        "statement must follow \'repeat\' keyword");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testRepeat4() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("for");
      Model _parse = this._parseHelper.parse(_builder);
      EClass _flow_AnyStatement = EditorPackage.eINSTANCE.getFlow_AnyStatement();
      this._validationTestHelper.assertError(_parse, _flow_AnyStatement, null, 
        "statement must follow \'for\' keyword");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testRepeat5() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("for a");
      Model _parse = this._parseHelper.parse(_builder);
      EClass _flow_AnyStatement = EditorPackage.eINSTANCE.getFlow_AnyStatement();
      this._validationTestHelper.assertError(_parse, _flow_AnyStatement, null, 
        "\'in\' expected after \'for\' keyword");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testRepeat6() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("for a in");
      Model _parse = this._parseHelper.parse(_builder);
      EClass _flow_AnyStatement = EditorPackage.eINSTANCE.getFlow_AnyStatement();
      this._validationTestHelper.assertError(_parse, _flow_AnyStatement, null, 
        "statement must follow \'in\' keyword");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testTry1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("try");
      Model _parse = this._parseHelper.parse(_builder);
      EClass _flow_AnyStatement = EditorPackage.eINSTANCE.getFlow_AnyStatement();
      this._validationTestHelper.assertError(_parse, _flow_AnyStatement, null, 
        "statement must follow \'try\' keyword");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testTry2() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("try a");
      Model _parse = this._parseHelper.parse(_builder);
      EClass _flow_AnyStatement = EditorPackage.eINSTANCE.getFlow_AnyStatement();
      this._validationTestHelper.assertError(_parse, _flow_AnyStatement, null, 
        "\'but\' or \'catch\' expected after \'try\' keyword");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testTry3() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("try a but");
      Model _parse = this._parseHelper.parse(_builder);
      EClass _flow_AnyStatement = EditorPackage.eINSTANCE.getFlow_AnyStatement();
      this._validationTestHelper.assertError(_parse, _flow_AnyStatement, null, 
        "statement must follow \'but\' keyword");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testTry4() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("try a but b");
      Model _parse = this._parseHelper.parse(_builder);
      EClass _flow_AnyStatement = EditorPackage.eINSTANCE.getFlow_AnyStatement();
      this._validationTestHelper.assertError(_parse, _flow_AnyStatement, null, 
        "statement must follow \'but\' condition");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testTry5() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("try a catch b c");
      Model _parse = this._parseHelper.parse(_builder);
      EClass _flow_AnyStatement = EditorPackage.eINSTANCE.getFlow_AnyStatement();
      this._validationTestHelper.assertError(_parse, _flow_AnyStatement, null, 
        "statement must follow \'catch\' keyword");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSelect() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("select a in b");
      Model _parse = this._parseHelper.parse(_builder);
      EClass _flow_AnyStatement = EditorPackage.eINSTANCE.getFlow_AnyStatement();
      this._validationTestHelper.assertError(_parse, _flow_AnyStatement, null, 
        "statement must follow \'then\' keyword");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
