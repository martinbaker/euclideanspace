/*
 * First Junit test written by Peter Broadbery
 */

package com.euclideanspace.aldor.tests;

import java.util.Arrays;
import java.util.List;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.parser.IParseResult;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.euclideanspace.aldor.EditorInjectorProvider;
import com.euclideanspace.aldor.parser.antlr.EditorParser;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;

@RunWith(XtextRunner.class)
@InjectWith(EditorInjectorProvider.class)
public class AldorTextTest {

    @Inject EditorParser parser;

    @Test
    public void testOne() {
        List<String> examples = Arrays.asList(new String[] {//
                "never",
                "x:=never",
                "x==never",
                "x=={never}",
                "x==(never)",
                "f(): () ==never"
        });

        for (String string: examples) {
            IParseResult pp = parser.doParse(string);
            Assert.assertTrue(Iterables.isEmpty(pp.getSyntaxErrors()));
        }
    }

}
