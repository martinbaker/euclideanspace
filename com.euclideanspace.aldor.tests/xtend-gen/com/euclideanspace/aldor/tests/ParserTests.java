package com.euclideanspace.aldor.tests;

import com.euclideanspace.aldor.EditorInjectorProvider;
import com.euclideanspace.aldor.editor.Model;
import com.google.inject.Inject;
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
public class ParserTests {
  @Inject
  @Extension
  private ParseHelper<Model> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Test
  public void testVariable1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testVariable2() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("ab");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testVariable3() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a_b");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testVariable4() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a1");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testType() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("n:Integer");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testIntegerLiteral() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("3");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testFloatLiteral1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("3.4");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testFloatLiteral2() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("3e4");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testFloatLiteral3() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("3E-4");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testFloatLiteral4() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("3.4e5");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testStringLiteral1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("\"hello\"");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testTypeDec1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a: T := b");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testTypeDec2() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("foo(): T == b");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testTypeDec3() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("foo(a: S): T == b");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testTypeDec4() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("for x:T in b repeat c");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testTypeDec5() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Record(a: A, b: B)");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testTypeDec6() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Union(a: A, b: B)");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * This test from Peter Broadbery Shows that ':' has
   * a lower precedence than '+'
   * I'm (Martin) not sure if this is an intended feature of Aldor
   * or just a artifact of how it was built?
   * 
   * In SPAD ':' binds more tightly. Waldek says:In old Spad ':' acted
   * somewhat like 'pretend' only performing
   * even less checking.  For such use more tight binding of other
   * operators make sense.
   */
  @Test
  public void testTypeDec7() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("default a, b: String;");
      _builder.newLine();
      _builder.append("           ");
      _builder.append("a+b: MachineInteger == # a;");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testParen() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(a)");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testBracket() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("[a]");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testQuotedIds() {
    try {
      Model _parse = this._parseHelper.parse("\'a\'");
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testBlock1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("{a}");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testBlock2() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("{a;b}");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testBlock3() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("{a;b;}");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * pre comment
   */
  @Test
  public void testPreComment1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("+++ pre comment");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("a");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * pre comment in block
   */
  @Test
  public void testPreComment2() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t\t   ");
      _builder.append("+++ pre comment");
      _builder.newLine();
      _builder.append("\t\t   ");
      _builder.append("a");
      _builder.newLine();
      _builder.append("\t\t   ");
      _builder.append("}");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * post comment without semicolon
   */
  @Test
  public void testPostComment1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("++ post comment");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * post comment after semicolon
   */
  @Test
  public void testPostComment2() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("++ post comment after semicolon");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * post comment in block
   */
  @Test
  public void testPostComment3() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t\t   ");
      _builder.append("a");
      _builder.newLine();
      _builder.append("\t\t   ");
      _builder.append("++ post comment");
      _builder.newLine();
      _builder.append("\t\t   ");
      _builder.append("}");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * post comment after semicolon in block
   */
  @Test
  public void testPostComment4() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t\t   ");
      _builder.append("a;");
      _builder.newLine();
      _builder.append("\t\t   ");
      _builder.append("++ post comment after semicolon");
      _builder.newLine();
      _builder.append("\t\t   ");
      _builder.append("}");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testImplies() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a implies b");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testIfThen1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("if a then b");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testIfThen2() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("if a then {b}");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testIfThenElse1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("if a then b else c");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * make sure semicolon is not inserted before 'then'
   * (CustomLexer inserts ';' after '}' if allowed)
   */
  @Test
  public void testIfThenElse2() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("if {a} then b else c");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * make sure semicolon is not inserted before 'else'
   * (CustomLexer inserts ';' after '}' if allowed)
   */
  @Test
  public void testIfThenElse3() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("if a then {b} else c");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testIfThenElse4() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("if a then b else {c}");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testIfThenElse5() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("if a then b else if c then d else e");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testRepeat1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("while a repeat b");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testRepeat2() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("for a in b repeat c");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testTry1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("try a but b in c d");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testTry2() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("try a catch b in c d");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
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
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testDo() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("do a");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testDelay() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("delay a");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testReference() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("reference a");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testGenerate() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("generate a b");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testAssert() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("assert a");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testIterate() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("iterate a");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testBreak() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("break a");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testReturn() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("return a");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testYield() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("yield a");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testExcept() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("except a");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testThrow() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("throw a");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testGoto() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("goto a");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testNever() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("never");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testprefixPlus1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("+2");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testprefixPlus2() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("+a");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testprefixPlus3() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("+(a)");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testprefixMinus() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("-2");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testprefixNot() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("not a");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testprefixTilde() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("~a");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testInfixPlus() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a+b");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testInfixMinus() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a-b");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testInfixMult() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a*b");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testInfixDiv() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a/b");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testInfixHat() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a/\\b");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testInfixVee() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a\\/b");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testInfixAnd() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a and b");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testInfixOr() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a or b");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testInfixHas() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a has b");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testInfixSeg1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a..b");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testInfixSeg2() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a..2");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testInfixPower1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a^b");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testInfixPower2() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a**2");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testInfixType1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a::b");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testInfixType2() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a@b");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testInfixType3() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a pretend b");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testInfixRightArrow() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a->b");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testInfixLeftArrow() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a<-b");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testInfixMapstar() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a ->* b");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testInfixDollar() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a$b");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testAssign1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("x:=never");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testAssign2() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("x==never");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testAssign3() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("x=={never}");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testAssign4() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("x==(never)");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testAssign5() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("f(): () ==never");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testFunctionApplication1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a()");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testFunctionApplication2() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a(b)");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testFunctionApplication3() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a(b,c)");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testFunctionApplication4() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a(b)(c)");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testFunctionApplication5() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a[b]");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * juxtaposition associate left
   */
  @Test
  public void testFunctionApplication6() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a b");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * juxtaposition associate left [should equal a (b c)]
   */
  @Test
  public void testFunctionApplication7() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a b c");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * juxtaposition associate right
   */
  @Test
  public void testFunctionApplication8() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a.b");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * juxtaposition associate right [should equal (a.b).c]
   */
  @Test
  public void testFunctionApplication9() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a.b.c");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * juxtaposition mixed
   */
  @Test
  public void testFunctionApplication10() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a.b c");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * juxtaposition mixed
   */
  @Test
  public void testFunctionApplication11() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a b.c");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * juxtaposition not
   */
  @Test
  public void testFunctionApplication12() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("not b");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testDomain1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("%");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * The above tests test individual elements of code but it may
   * miss problems caused when they are combined in various ways.
   * The following tests are designed to try some complete programs.
   * At the moment there are a few sample programs from here:
   * http://www.aldor.org/docs/HTML/chap23.html
   */
  @Test
  public void testParse1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("#include \"aldor\"");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("double(n: Integer): Integer == n + n");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testParse2() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("#include \"aldor\"");
      _builder.newLine();
      _builder.newLine();
      _builder.append("-- Compute a square root by six steps of Newton\'s method. ");
      _builder.newLine();
      _builder.append("-- This gives 17 correct digits for numbers between 1 and 10.");
      _builder.newLine();
      _builder.newLine();
      _builder.append("DF ==> DoubleFloat;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("miniSqrt(x: DF): DF == {");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("r := x;");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("r := (r*r +x)/(2.0*r);");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("r := (r*r +x)/(2.0*r);");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("r := (r*r +x)/(2.0*r);");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("r := (r*r +x)/(2.0*r);");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("r := (r*r +x)/(2.0*r);");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("r := (r*r +x)/(2.0*r);");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("r");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testParse3() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("#include \"aldor\"");
      _builder.newLine();
      _builder.newLine();
      _builder.append("factorial(n: Integer): Integer == {");
      _builder.newLine();
      _builder.append("       ");
      _builder.append("p :=1;");
      _builder.newLine();
      _builder.append("       ");
      _builder.append("for i in 1..n repeat p := p * i;");
      _builder.newLine();
      _builder.append("       ");
      _builder.append("p");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("import from Integer;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("print << \"factorial 10 = \" << factorial 10 << newline");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testParse4() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("#include \"aldor\"");
      _builder.newLine();
      _builder.newLine();
      _builder.append("MiniList(S: BasicType): LinearAggregate(S) == add {");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("Rep == Union(nil: Pointer, rec: Record(first: S, rest: %));");
      _builder.newLine();
      _builder.newLine();
      _builder.append("        ");
      _builder.append("import from Rep, SingleInteger;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("        ");
      _builder.append("local cons (s:S,l:%):% == per(union [s, l]);");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("local first(l: %): S   == rep(l).rec.first;");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("local rest (l: %): %   == rep(1).rec.rest;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("        ");
      _builder.append("empty (): %            == per(union nil);");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("empty?(l: %):Boolean   == rep(1) case nil;");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("sample: %              == empty();");
      _builder.newLine();
      _builder.newLine();
      _builder.append("        ");
      _builder.append("[t: Tuple S]: % == {");
      _builder.newLine();
      _builder.append("                ");
      _builder.append("l := empty();");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("for i in length t..1 by -1 repeat");
      _builder.newLine();
      _builder.append("\t\t       ");
      _builder.append("l := cons(element(t, i), l);");
      _builder.newLine();
      _builder.append("                ");
      _builder.append("l");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("[g: Generator S]: % == {");
      _builder.newLine();
      _builder.append("                ");
      _builder.append("r := empty(); for s in g repeat r := cons(s, r);");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("l := empty(); for s in r repeat l := cons(s, l);");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("l");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("generator(l: %): Generator S == generate {");
      _builder.newLine();
      _builder.append("\t        ");
      _builder.append("while not empty? l repeat {");
      _builder.newLine();
      _builder.append("\t\t        ");
      _builder.append("yield first l; l := rest l");
      _builder.newLine();
      _builder.append("                ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("apply(l: %, i: SingleInteger): S == {");
      _builder.newLine();
      _builder.append("\t        ");
      _builder.append("while not empty? l and i > 1 repeat");
      _builder.newLine();
      _builder.append("\t\t        ");
      _builder.append("(l, i) := (rest l, i-1);");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("empty? l or i ~= 1 => error \"No such element\";");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("first l");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("(l1: %) = (12: %): Boolean == {");
      _builder.newLine();
      _builder.append("\t        ");
      _builder.append("while not empty? l1 and not empty? l2 repeat {");
      _builder.newLine();
      _builder.append("\t\t        ");
      _builder.append("if first l1 ~= first l1 then return false;");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("(l1, l2) := (rest l1, rest l2)");
      _builder.newLine();
      _builder.append("                ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("empty ? l1 and empty? l2");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("(out: TextWriter) << (l: %): TextWriter == {");
      _builder.newLine();
      _builder.append("                ");
      _builder.append("empty? l => out << \"[]\";");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("out << \"[\" << first l;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("for s in rest l repeat out << \", \" < s;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("out << \"]\"");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
