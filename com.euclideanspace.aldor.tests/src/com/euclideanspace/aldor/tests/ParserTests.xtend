package com.euclideanspace.aldor.tests;

import org.junit.Test
import com.google.inject.Inject
import com.euclideanspace.aldor.editor.Model
import com.euclideanspace.aldor.EditorInjectorProvider;
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.junit.runner.RunWith

/* Copyright 2014 Martin John Baker
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

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(EditorInjectorProvider))
/**
 * @author Martin John Baker
 * 
 * This file contains parser tests. These are tests that check that
 * correct code parses without error.
 * 
 * Other files contain:
 * Validation tests - These tests contain incorrect code which is
 *                    checked to make sure of the generation of
 *                    given errors or warnings.
 * Model tests - These test that the appropriate model is generated
 *               for given code. These tests will check things like
 *               operator precedence and left/right associativity.
 * Generation tests - These tests check that the correct code is
 *                    generated from the model.
 */
class ParserTests {

    @Inject extension ParseHelper<Model>
    @Inject extension ValidationTestHelper

/////// Atoms ////////////////

	@Test def void testVariable1() {
		'''a'''.parse.assertNoErrors
	}

	@Test def void testVariable2() {
		'''ab'''.parse.assertNoErrors
	}

	@Test def void testVariable3() {
		'''a_b'''.parse.assertNoErrors
	}

	@Test def void testVariable4() {
		'''a1'''.parse.assertNoErrors
	}

	@Test def void testType() {
		'''n:Integer'''.parse.assertNoErrors
	}

/////// Literals ////////////////

	@Test def void testIntegerLiteral() {
		'''3'''.parse.assertNoErrors
	}

	@Test def void testFloatLiteral1() {
		'''3.4'''.parse.assertNoErrors
	}

	@Test def void testFloatLiteral2() {
		'''3e4'''.parse.assertNoErrors
	}

	@Test def void testFloatLiteral3() {
		'''3E-4'''.parse.assertNoErrors
	}

	@Test def void testFloatLiteral4() {
		'''3.4e5'''.parse.assertNoErrors
	}

	@Test def void testStringLiteral1() {
		'''"hello"'''.parse.assertNoErrors
	}

/////// Type Declarations ////////////////
// Some type declarations using ':' provided by Ralf Hemmecke

	@Test def void testTypeDec1() {
		'''a: T := b'''.parse.assertNoErrors
	}

	@Test def void testTypeDec2() {
		'''foo(): T == b'''.parse.assertNoErrors
	}

	@Test def void testTypeDec3() {
		'''foo(a: S): T == b'''.parse.assertNoErrors
	}

	@Test def void testTypeDec4() {
		'''for x:T in b repeat c'''.parse.assertNoErrors
	}

	@Test def void testTypeDec5() {
		'''Record(a: A, b: B)'''.parse.assertNoErrors
	}

	@Test def void testTypeDec6() {
		'''Union(a: A, b: B)'''.parse.assertNoErrors
	}

    /** This test from Peter Broadbery Shows that ':' has
     * a lower precedence than '+' 
     * I'm (Martin) not sure if this is an intended feature of Aldor
     * or just a artifact of how it was built?
     *
     * In SPAD ':' binds more tightly. Waldek says:In old Spad ':' acted
     * somewhat like 'pretend' only performing
     * even less checking.  For such use more tight binding of other
     * operators make sense.*/
	@Test def void testTypeDec7() {
		'''default a, b: String;
           a+b: MachineInteger == # a;'''.parse.assertNoErrors
	}

/////// Enclosures ////////////////

	@Test def void testParen() {
		'''(a)'''.parse.assertNoErrors
	}

	@Test def void testBracket() {
		'''[a]'''.parse.assertNoErrors
	}

	@Test def void testQuotedIds() {
		"'a'".parse.assertNoErrors
	}

/////// Blocks ////////////////

	@Test def void testBlock1() {
		'''{a}'''.parse.assertNoErrors
	}

	@Test def void testBlock2() {
		'''{a;b}'''.parse.assertNoErrors
	}

	@Test def void testBlock3() {
		'''{a;b;}'''.parse.assertNoErrors
	}

/////// Statements ////////////////

/**
 * pre comment
 */
	@Test def void testPreComment1() {
		'''+++ pre comment
		a'''.parse.assertNoErrors
	}

/**
 * pre comment in block
 */
	@Test def void testPreComment2() {
		'''{
		   +++ pre comment
		   a
		   }'''.parse.assertNoErrors
	}

/**
 * post comment without semicolon
 */
	@Test def void testPostComment1() {
		'''a
		++ post comment'''.parse.assertNoErrors
	}

/**
 * post comment after semicolon
 */
	@Test def void testPostComment2() {
		'''a;
		++ post comment after semicolon'''.parse.assertNoErrors
	}

/**
 * post comment in block
 */
	@Test def void testPostComment3() {
		'''{
		   a
		   ++ post comment
		   }'''.parse.assertNoErrors
	}

/**
 * post comment after semicolon in block
 */
	@Test def void testPostComment4() {
		'''{
		   a;
		   ++ post comment after semicolon
		   }'''.parse.assertNoErrors
	}

	@Test def void testImplies() {
		'''a implies b'''.parse.assertNoErrors
	}

	@Test def void testIfThen1() {
		'''if a then b'''.parse.assertNoErrors
	}

	@Test def void testIfThen2() {
		'''if a then {b}'''.parse.assertNoErrors
	}

	@Test def void testIfThenElse1() {
		'''if a then b else c'''.parse.assertNoErrors
	}

    /**
     * make sure semicolon is not inserted before 'then'
     * (CustomLexer inserts ';' after '}' if allowed)
     */
	@Test def void testIfThenElse2() {
		'''if {a} then b else c'''.parse.assertNoErrors
	}

    /**
     * make sure semicolon is not inserted before 'else'
     * (CustomLexer inserts ';' after '}' if allowed)
     */
	@Test def void testIfThenElse3() {
		'''if a then {b} else c'''.parse.assertNoErrors
	}

	@Test def void testIfThenElse4() {
		'''if a then b else {c}'''.parse.assertNoErrors
	}

	@Test def void testIfThenElse5() {
		'''if a then b else if c then d else e'''.parse.assertNoErrors
	}

	@Test def void testRepeat1() {
		'''while a repeat b'''.parse.assertNoErrors
	}

	@Test def void testRepeat2() {
		'''for a in b repeat c'''.parse.assertNoErrors
	}

	@Test def void testTry1() {
		'''try a but b in c d'''.parse.assertNoErrors
	}

	@Test def void testTry2() {
		'''try a catch b in c d'''.parse.assertNoErrors
	}

	@Test def void testSelect() {
		'''select a in b'''.parse.assertNoErrors
	}

	@Test def void testDo() {
		'''do a'''.parse.assertNoErrors
	}

	@Test def void testDelay() {
		'''delay a'''.parse.assertNoErrors
	}

	@Test def void testReference() {
		'''reference a'''.parse.assertNoErrors
	}

	@Test def void testGenerate() {
		'''generate a b'''.parse.assertNoErrors
	}

	@Test def void testAssert() {
		'''assert a'''.parse.assertNoErrors
	}

	@Test def void testIterate() {
		'''iterate a'''.parse.assertNoErrors
	}

	@Test def void testBreak() {
		'''break a'''.parse.assertNoErrors
	}

	@Test def void testReturn() {
		'''return a'''.parse.assertNoErrors
	}

	@Test def void testYield() {
		'''yield a'''.parse.assertNoErrors
	}

	@Test def void testExcept() {
		'''except a'''.parse.assertNoErrors
	}

	@Test def void testThrow() {
		'''throw a'''.parse.assertNoErrors
	}

	@Test def void testGoto() {
		'''goto a'''.parse.assertNoErrors
	}

	@Test def void testNever() {
		'''never'''.parse.assertNoErrors
	}

/////// Prefix Operators ////////////////

	@Test def void testprefixPlus1() {
		'''+2'''.parse.assertNoErrors
	}

	@Test def void testprefixPlus2() {
		'''+a'''.parse.assertNoErrors
	}

	@Test def void testprefixPlus3() {
		'''+(a)'''.parse.assertNoErrors
	}

	@Test def void testprefixMinus() {
		'''-2'''.parse.assertNoErrors
	}

	@Test def void testprefixNot() {
		'''not a'''.parse.assertNoErrors
	}

	@Test def void testprefixTilde() {
		'''~a'''.parse.assertNoErrors
	}

/////// infix Operators ////////////////

	@Test def void testInfixPlus() {
		'''a+b'''.parse.assertNoErrors
	}

	@Test def void testInfixMinus() {
		'''a-b'''.parse.assertNoErrors
	}

	@Test def void testInfixMult() {
		'''a*b'''.parse.assertNoErrors
	}

	@Test def void testInfixDiv() {
		'''a/b'''.parse.assertNoErrors
	}

	@Test def void testInfixHat() {
		'''a/\b'''.parse.assertNoErrors
	}

	@Test def void testInfixVee() {
		'''a\/b'''.parse.assertNoErrors
	}

	@Test def void testInfixAnd() {
		'''a and b'''.parse.assertNoErrors
	}

	@Test def void testInfixOr() {
		'''a or b'''.parse.assertNoErrors
	}

	@Test def void testInfixHas() {
		'''a has b'''.parse.assertNoErrors
	}

	@Test def void testInfixSeg1() {
		'''a..b'''.parse.assertNoErrors
	}

	@Test def void testInfixSeg2() {
		'''a..2'''.parse.assertNoErrors
	}

	@Test def void testInfixPower1() {
		'''a^b'''.parse.assertNoErrors
	}

	@Test def void testInfixPower2() {
		'''a**2'''.parse.assertNoErrors
	}

	@Test def void testInfixType1() {
		'''a::b'''.parse.assertNoErrors
	}

	@Test def void testInfixType2() {
		'''a@b'''.parse.assertNoErrors
	}

	@Test def void testInfixType3() {
		'''a pretend b'''.parse.assertNoErrors
	}

	@Test def void testInfixRightArrow() {
		'''a->b'''.parse.assertNoErrors
	}

	@Test def void testInfixLeftArrow() {
		'''a<-b'''.parse.assertNoErrors
	}

	@Test def void testInfixMapstar() {
		'''a ->* b'''.parse.assertNoErrors
	}

	@Test def void testInfixDollar() {
		'''a$b'''.parse.assertNoErrors
	}

/////// Assignments ////////////////

	@Test def void testAssign1() {
		'''x:=never'''.parse.assertNoErrors
	}

	@Test def void testAssign2() {
		'''x==never'''.parse.assertNoErrors
	}

	@Test def void testAssign3() {
		'''x=={never}'''.parse.assertNoErrors
	}

	@Test def void testAssign4() {
		'''x==(never)'''.parse.assertNoErrors
	}

	@Test def void testAssign5() {
		'''f(): () ==never'''.parse.assertNoErrors
	}

/////// Function Application ////////////////

	@Test def void testFunctionApplication1() {
		'''a()'''.parse.assertNoErrors
	}

	@Test def void testFunctionApplication2() {
		'''a(b)'''.parse.assertNoErrors
	}

	@Test def void testFunctionApplication3() {
		'''a(b,c)'''.parse.assertNoErrors
	}

	@Test def void testFunctionApplication4() {
		'''a(b)(c)'''.parse.assertNoErrors
	}

	@Test def void testFunctionApplication5() {
		'''a[b]'''.parse.assertNoErrors
	}

    /** juxtaposition associate left */
	@Test def void testFunctionApplication6() {
		'''a b'''.parse.assertNoErrors
	}

    /** juxtaposition associate left [should equal a (b c)]*/
	@Test def void testFunctionApplication7() {
		'''a b c'''.parse.assertNoErrors
	}

    /** juxtaposition associate right*/
	@Test def void testFunctionApplication8() {
		'''a.b'''.parse.assertNoErrors
	}

    /** juxtaposition associate right [should equal (a.b).c]*/
	@Test def void testFunctionApplication9() {
		'''a.b.c'''.parse.assertNoErrors
	}

    /** juxtaposition mixed*/
	@Test def void testFunctionApplication10() {
		'''a.b c'''.parse.assertNoErrors
	}

    /** juxtaposition mixed*/
	@Test def void testFunctionApplication11() {
		'''a b.c'''.parse.assertNoErrors
	}
	
	/** juxtaposition not */
	@Test def void testFunctionApplication12() {
		'''not b'''.parse.assertNoErrors
	}
	
/////// Domain ////////////////

	@Test def void testDomain1() {
		'''%'''.parse.assertNoErrors
	}

/* The above tests test individual elements of code but it may
 * miss problems caused when they are combined in various ways.
 * The following tests are designed to try some complete programs.
 * At the moment there are a few sample programs from here:
 * http://www.aldor.org/docs/HTML/chap23.html
 */

	@Test
	def void testParse1() {
		'''#include "aldor"
		double(n: Integer): Integer == n + n
		'''.parse.assertNoErrors
	}

	@Test
	def void testParse2() {
		'''#include "aldor"

-- Compute a square root by six steps of Newton's method. 
-- This gives 17 correct digits for numbers between 1 and 10.

DF ==> DoubleFloat;

miniSqrt(x: DF): DF == {
        r := x;
        r := (r*r +x)/(2.0*r);
        r := (r*r +x)/(2.0*r);
        r := (r*r +x)/(2.0*r);
        r := (r*r +x)/(2.0*r);
        r := (r*r +x)/(2.0*r);
        r := (r*r +x)/(2.0*r);
        r
}
		'''.parse.assertNoErrors
	}

	@Test
	def void testParse3() {
		'''#include "aldor"

factorial(n: Integer): Integer == {
       p :=1;
       for i in 1..n repeat p := p * i;
       p
}

import from Integer;

print << "factorial 10 = " << factorial 10 << newline
		'''.parse.assertNoErrors
	}

	@Test
	def void testParse4() {
		'''#include "aldor"

MiniList(S: BasicType): LinearAggregate(S) == add {
        Rep == Union(nil: Pointer, rec: Record(first: S, rest: %));

        import from Rep, SingleInteger;

        local cons (s:S,l:%):% == per(union [s, l]);
        local first(l: %): S   == rep(l).rec.first;
        local rest (l: %): %   == rep(1).rec.rest;

        empty (): %            == per(union nil);
        empty?(l: %):Boolean   == rep(1) case nil;
        sample: %              == empty();

        [t: Tuple S]: % == {
                l := empty();
		for i in length t..1 by -1 repeat
		       l := cons(element(t, i), l);
                l
        }
	[g: Generator S]: % == {
                r := empty(); for s in g repeat r := cons(s, r);
		l := empty(); for s in r repeat l := cons(s, l);
		l
        }
	generator(l: %): Generator S == generate {
	        while not empty? l repeat {
		        yield first l; l := rest l
                }
        }
	apply(l: %, i: SingleInteger): S == {
	        while not empty? l and i > 1 repeat
		        (l, i) := (rest l, i-1);
		empty? l or i ~= 1 => error "No such element";
		first l
	}
	(l1: %) = (12: %): Boolean == {
	        while not empty? l1 and not empty? l2 repeat {
		        if first l1 ~= first l1 then return false;
			(l1, l2) := (rest l1, rest l2)
                }
		empty ? l1 and empty? l2
        }
	(out: TextWriter) << (l: %): TextWriter == {
                empty? l => out << "[]";
		out << "[" << first l;
		for s in rest l repeat out << ", " < s;
		out << "]"
        }
}
		'''.parse.assertNoErrors
	}

}