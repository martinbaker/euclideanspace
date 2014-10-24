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
package com.euclideanspace.aldor;

//import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.impl.NodeModelBuilder;
import org.eclipse.xtext.nodemodel.impl.AbstractNode;
import org.eclipse.xtext.nodemodel.ICompositeNode;
//import org.eclipse.xtext.nodemodel.ILeafNode;
//import org.eclipse.xtext.nodemodel.INode;
//import org.eclipse.xtext.nodemodel.SyntaxErrorMessage;
//import org.eclipse.xtext.nodemodel.ILeafNode;
//import org.eclipse.xtext.nodemodel.SyntaxErrorMessage;

/**
 * Allow possible customisations to the node model builder.
 */
public class CustomNodeModelBuilder extends NodeModelBuilder{

	@Override
	public void addChild(ICompositeNode node, AbstractNode child) {
		//EditorFileWriter.out("CustomNodeModelBuilder.addChild begin");
		/*if (child == null) {
		  EditorFileWriter.out("CustomNodeModelBuilder.addChild child==null");
		  return;
	    }
		if ((child.getOffset()==0)&&(child.getLength()==1)) {
			EditorFileWriter.out("CustomNodeModelBuilder.addChild end: don't add inserted node");
			return;
		}*/
		super.addChild(node, child);
//		String snode =EditorFileWriter.showNodeModel(node);
//		String schild = EditorFileWriter.showNodeModel(child);
//		EditorFileWriter.out("CustomNodeModelBuilder.addChild node="+snode+" child="+schild);
		/*if (child == null) {
			EditorFileWriter.out("CustomNodeModelBuilder.addChild child==null");
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
				EditorFileWriter.out("CustomNodeModelBuilder.addChild text="+child.getText()+
						" offset="+offset+
						" length="+len+
						" grammar="+str+
						"");
			}
		} catch(Exception e) {}
		//if ("KW_SEMICOLON".equals(str)) {
		  if (offset == -1) {
			  EditorFileWriter.out("CustomNodeModelBuilder.addChild 1 text="+child.getText()+
				" offset="+offset+
				" length="+len+
				" grammar="+child.getGrammarElement()+
				" grammarstr="+str+
				"");
		    return;
		  }
		  //EditorFileWriter.out("CustomNodeModelBuilder.addChild 2 text="+child.getText()+
			//	" offset="+offset+
			//	" length="+len+
			//	" grammar="+str+
			//	"");
		//}*/
	}

/*	@Override
	public ILeafNode newLeafNode(int offset, int length, EObject grammarElement, boolean isHidden, SyntaxErrorMessage errorMessage,
			ICompositeNode parent) {
		EditorFileWriter.out("CustomNodeModelBuilder.newLeafNode begin");
		ILeafNode result = super.newLeafNode(offset, length, grammarElement, isHidden, errorMessage, parent);
		String sgrammarElement =EditorFileWriter.showGrammarElement(grammarElement);
		EditorFileWriter.out("CustomNodeModelBuilder.newLeafNode end"+
				" offset="+offset+
				" length="+length+
				" isHidden="+isHidden+
				" grammarElement="+sgrammarElement
				);
		return result;
	}*/
	
/*	@Override
	public ICompositeNode newCompositeNodeAsParentOf(EObject grammarElement, int lookahead, ICompositeNode existing) {
		EditorFileWriter.out("CustomNodeModelBuilder.newCompositeNodeAsParentOf begin");
		ICompositeNode result = super.newCompositeNodeAsParentOf(grammarElement, lookahead, existing);
		String sgrammarElement =EditorFileWriter.showGrammarElement(grammarElement);
		EditorFileWriter.out("CustomNodeModelBuilder.newCompositeNodeAsParentOf end"+
				" lookahead="+lookahead+
				" grammarElement="+sgrammarElement
				);
		return result;
	}*/
	
/*	@Override
	public ICompositeNode newCompositeNode(EObject grammarElement, int lookahead, ICompositeNode parent) {
		EditorFileWriter.out("CustomNodeModelBuilder.newCompositeNode begin");
		ICompositeNode result = super.newCompositeNode(grammarElement, lookahead, parent);
		String sgrammarElement =EditorFileWriter.showGrammarElement(grammarElement);
		EditorFileWriter.out("CustomNodeModelBuilder.newCompositeNode end"+
				" lookahead="+lookahead+
				" grammarElement="+sgrammarElement
				);
		return result;
	}*/

/*	public ICompositeNode newRootNode(String input) {
		EditorFileWriter.out("CustomNodeModelBuilder.newRootNode begin");
		ICompositeNode result = super.newRootNode(input);
		EditorFileWriter.out("CustomNodeModelBuilder.newRootNode end"+
				" input="+input
				);
		return result;
	}*/

}
