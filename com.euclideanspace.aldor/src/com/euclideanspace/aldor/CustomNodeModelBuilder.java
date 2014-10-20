/*******************************************************************************
 * Copyright (c) 2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package com.euclideanspace.aldor;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.impl.NodeModelBuilder;
import org.eclipse.xtext.nodemodel.impl.AbstractNode;
import org.eclipse.xtext.nodemodel.ICompositeNode;
//import org.eclipse.xtext.nodemodel.ILeafNode;
//import org.eclipse.xtext.nodemodel.INode;
//import org.eclipse.xtext.nodemodel.SyntaxErrorMessage;

/**
 * We need to customise the node model builder so that inserted nodes do not
 * point back into text.
 */
public class CustomNodeModelBuilder extends NodeModelBuilder{

	@Override
	public void addChild(ICompositeNode node, AbstractNode child) {
		if (child == null) {
			System.out.println("CustomNodeModelBuilder.addChild child==null");
			return;
		}
		int len = -3;
		try {len = child.getLength();} catch(Exception e) {}
		int offset = -4;
		try {offset = child.getOffset();} catch(Exception e) {}
		String str = "";
		try {			
			EObject obj = child.getGrammarElement();
			if (obj instanceof org.eclipse.xtext.impl.TerminalRuleImpl) {
				org.eclipse.xtext.impl.TerminalRuleImpl tr=(org.eclipse.xtext.impl.TerminalRuleImpl)obj;
				str=tr.getName();
			    System.out.println("CustomNodeModelBuilder.addChild text="+child.getText()+
						" offset="+offset+
						" length="+len+
						" grammar="+str+
						"");
			}
		} catch(Exception e) {}
		//if ("KW_SEMICOLON".equals(str)) {
		  if (offset == -1) {
		    System.out.println("CustomNodeModelBuilder.addChild 1 text="+child.getText()+
				" offset="+offset+
				" length="+len+
				" grammar="+child.getGrammarElement()+
				" grammarstr="+str+
				"");
		    return;
		  }
		  //System.out.println("CustomNodeModelBuilder.addChild 2 text="+child.getText()+
			//	" offset="+offset+
			//	" length="+len+
			//	" grammar="+str+
			//	"");
		//}
		super.addChild(node, child);
	}
	

}
