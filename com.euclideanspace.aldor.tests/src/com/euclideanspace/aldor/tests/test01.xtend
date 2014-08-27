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
 * The following tests are designed to test the parser.
 * At the moment it tries a few sample programs from here:
 * http://www.aldor.org/docs/HTML/chap23.html
 * and checks that they compile without errors.
 * 
 * This is not how unit tests should be.
 * I need to split this up much more so that each test
 * tries only one aspect of the syntax.
 *
 */
class test01 {

    @Inject extension ParseHelper<Model>
    @Inject extension ValidationTestHelper

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