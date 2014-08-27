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

@RunWith(XtextRunner.class)
@InjectWith(EditorInjectorProvider.class)
@SuppressWarnings("all")
public class test01 {
  @Inject
  @Extension
  private ParseHelper<Model> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
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
      _builder.append("MiniList(S: BasicType): LinearAggregate(S) = add {");
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
