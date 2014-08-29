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

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(EditorInjectorProvider))
/**
 * @author Martin Baker
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

/* The above tests test individual elements of code but not if they
 * fit together in big chunks. The following tests are designed to
 * try some complete programs.
 * At the moment there are a few sample programs from here:
 * http://www.aldor.org/docs/HTML/chap23.html
 * and checks that they compile without errors.
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

MiniList(S: BasicType): LinearAggregate(S) = add {
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