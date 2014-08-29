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
import com.euclideanspace.aldor.editor.EditorPackage

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
 * This file contains validator tests. These tests contain incorrect code which is
 *                    checked to make sure of the generation of
 *                    given errors or warnings.
 * 
 * Other files contain:
 * Parser tests - These are tests that check that
 *                correct code parses without error.
 * Model tests - These test that the appropriate model is generated
 *               for given code. These tests will check things like
 *               operator precedence and left/right associativity.
 * Generation tests - These tests check that the correct code is
 *                    generated from the model.
 */
class ValidatorTests {

    @Inject extension ParseHelper<Model>
    @Inject extension ValidationTestHelper

	@Test def void testIf1() {
		'''if'''.parse.assertError(EditorPackage::eINSTANCE.flow_AnyStatement,null,
		                           "predicate must follow 'if' keyword")
	}

	@Test def void testIf2() {
		'''if a'''.parse.assertError(EditorPackage::eINSTANCE.flow_AnyStatement,null,
		                             "missing 'then' following 'if' keyword")
	}

	@Test def void testIfThen1() {
		'''if a then'''.parse.assertError(EditorPackage::eINSTANCE.flow_AnyStatement,null,
		                                  "statement must follow 'then' keyword")
	}

	@Test def void testIfThenElse1() {
		'''if a then b else'''.parse.assertError(EditorPackage::eINSTANCE.flow_AnyStatement,null,
		                                  "statement must follow 'else' keyword")
	}

	@Test def void testRepeat1() {
		'''while'''.parse.assertError(EditorPackage::eINSTANCE.flow_AnyStatement,null,
		                                  "statement must follow 'while' keyword")
	}

	@Test def void testRepeat2() {
		'''while a'''.parse.assertError(EditorPackage::eINSTANCE.flow_AnyStatement,null,
		                                  "'repeat' expected after 'while' keyword")
	}

	@Test def void testRepeat3() {
		'''while a repeat'''.parse.assertError(EditorPackage::eINSTANCE.flow_AnyStatement,null,
		                                  "statement must follow 'repeat' keyword")
	}

	@Test def void testRepeat4() {
		'''for'''.parse.assertError(EditorPackage::eINSTANCE.flow_AnyStatement,null,
		                                  "statement must follow 'for' keyword")
	}

	@Test def void testRepeat5() {
		'''for a'''.parse.assertError(EditorPackage::eINSTANCE.flow_AnyStatement,null,
		                                  "'in' expected after 'for' keyword")
	}

	@Test def void testRepeat6() {
		'''for a in'''.parse.assertError(EditorPackage::eINSTANCE.flow_AnyStatement,null,
		                                  "statement must follow 'in' keyword")
	}

	@Test def void testTry1() {
		'''try'''.parse.assertError(EditorPackage::eINSTANCE.flow_AnyStatement,null,
		                                  "statement must follow 'try' keyword")
	}

	@Test def void testTry2() {
		'''try a'''.parse.assertError(EditorPackage::eINSTANCE.flow_AnyStatement,null,
		                                  "'but' or 'catch' expected after 'try' keyword")
	}

	@Test def void testTry3() {
		'''try a but'''.parse.assertError(EditorPackage::eINSTANCE.flow_AnyStatement,null,
		                                  "statement must follow 'but' keyword")
	}

	@Test def void testTry4() {
		'''try a but b'''.parse.assertError(EditorPackage::eINSTANCE.flow_AnyStatement,null,
		                                  "statement must follow 'but' condition")
	}

	@Test def void testTry5() {
		'''try a catch'''.parse.assertError(EditorPackage::eINSTANCE.flow_AnyStatement,null,
		                                  "statement must follow 'catch' keyword")
	}

	@Test def void testTry6() {
		'''try a catch b'''.parse.assertError(EditorPackage::eINSTANCE.flow_AnyStatement,null,
		                                  "statement must follow 'catch' keyword")
	}

	@Test def void testSelect() {
		'''select a in b'''.parse.assertError(EditorPackage::eINSTANCE.flow_AnyStatement,null,
		                                  "statement must follow 'then' keyword")
	}

}