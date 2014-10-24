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

import java.io.FileWriter;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.nodemodel.INode;

/**
 * @author Martin Baker
 * Customised logging mechanism to try to help me understand xtext better
 * and debug code.
 */
public class EditorFileWriter {
	static FileWriter writer = null;
	
    static void out(String msg){
    	if (writer==null){
    		try {
    		  writer = new FileWriter("/home/martin/log.txt");
    		} catch (Exception e) {
    			System.out.println("EditorFileWriter:"+e);
    		}
    	}
    	try {
			writer.append(msg+"\n");
			writer.flush();
		} catch (Exception e) {
			System.out.println("EditorFileWriter:"+e);
		}
    }
    
    static public String showGrammarElement(EObject eo){
    	String result = "[eobject="+eo;
		if (eo instanceof org.eclipse.xtext.impl.KeywordImpl){
			org.eclipse.xtext.impl.KeywordImpl rgrammarElement =
					(org.eclipse.xtext.impl.KeywordImpl)eo;			
			result = "[KeywordImpl="+rgrammarElement.eContainerFeatureID()+
					" value="+rgrammarElement.getValue();
		} else if (eo instanceof org.eclipse.xtext.impl.TerminalRuleImpl){
			org.eclipse.xtext.impl.TerminalRuleImpl rgrammarElement =
					(org.eclipse.xtext.impl.TerminalRuleImpl)eo;			
			result = "[TerminalRuleImpl="+rgrammarElement.eContainerFeatureID()+
					" name="+rgrammarElement.getName();
		} else if (eo instanceof org.eclipse.xtext.impl.RuleCallImpl){
			org.eclipse.xtext.impl.RuleCallImpl rgrammarElement =
					(org.eclipse.xtext.impl.RuleCallImpl)eo;
			result = "[RuleCallImpl="+rgrammarElement.eContainerFeatureID();
			result = result + " cardinality="+rgrammarElement.getCardinality();
			AbstractRule ar=rgrammarElement.getRule();
			if (ar !=null) result = result + " ele name="+ar.getName();;
		} else if (eo instanceof org.eclipse.xtext.impl.ParserRuleImpl){
			org.eclipse.xtext.impl.ParserRuleImpl rgrammarElement =
					(org.eclipse.xtext.impl.ParserRuleImpl)eo;			
			result = " [ParserRuleImpl="+rgrammarElement.eContainerFeatureID()+
					" name="+rgrammarElement.getName();
		}    	
    	return result+"]";
    }

    static public String showNodeModel(INode node){
      String result = "[unknown";
	if (node instanceof org.eclipse.xtext.nodemodel.impl.RootNode){
		org.eclipse.xtext.nodemodel.impl.RootNode rnode =(org.eclipse.xtext.nodemodel.impl.RootNode)node;			
		result = "[rootnode "+rnode.getIndex();
	} else if (node instanceof org.eclipse.xtext.nodemodel.impl.CompositeNodeWithSemanticElement){
		org.eclipse.xtext.nodemodel.impl.CompositeNodeWithSemanticElement rnode =(org.eclipse.xtext.nodemodel.impl.CompositeNodeWithSemanticElement)node;
		result = "[CompositeNodeWithSemanticElement";
		if (rnode.hasDirectSemanticElement()) result = result+" direct";
	} else if (node instanceof org.eclipse.xtext.nodemodel.impl.LeafNode){
		//org.eclipse.xtext.nodemodel.impl.LeafNode rnode =(org.eclipse.xtext.nodemodel.impl.LeafNode)node;
		result = "[LeafNode ";
	} else if (node instanceof org.eclipse.xtext.nodemodel.impl.CompositeNodeWithSemanticElement){
		org.eclipse.xtext.nodemodel.impl.CompositeNodeWithSemanticElement rnode =(org.eclipse.xtext.nodemodel.impl.CompositeNodeWithSemanticElement)node;
		result = "[CompositeNodeWithSemanticElement direct="+rnode.hasDirectSemanticElement();
	}
	try {
	  String txt=node.getText();
	  if (txt != null) {
		if ("\n".equals(txt)) txt="NL";
		if ("\r".equals(txt)) txt="NL";
		if (" ".equals(txt)) txt="WS";
		result = result + " text="+txt;	
	  }
	} catch (Exception e) {
		result=result+" err text:"+e;
	}
	try {
	  EObject ge = node.getGrammarElement();
	  if (ge != null) result = result + " grammar="+EditorFileWriter.showGrammarElement(ge);
	  result = result +" line="+node.getStartLine()+" length="+node.getLength();
	} catch (Exception e) {
		result=result+" err line:"+e;
	}
	result = result + " offset="+node.getOffset()+":"+node.getEndOffset();
	result = result + " total offset="+node.getTotalOffset()+":"+node.getTotalEndOffset();
	return result+"]";
    }
}
