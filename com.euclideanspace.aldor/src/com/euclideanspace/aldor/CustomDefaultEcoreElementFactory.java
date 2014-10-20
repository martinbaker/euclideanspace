/*******************************************************************************
 * Copyright (c) 2008 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package com.euclideanspace.aldor;

import org.eclipse.xtext.parser.DefaultEcoreElementFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.nodemodel.INode;

/**
 * @author 
 */
public class CustomDefaultEcoreElementFactory extends DefaultEcoreElementFactory {

	//@SuppressWarnings("unchecked")
	public void add(EObject object, String feature, Object value, String ruleName, INode node) throws ValueConverterException {
	    System.out.println("CustomDefaultEcoreElementFactory.add"+
	            //"object="+object+
				" feature="+feature+
				" ruleName="+ruleName+
				//" node="+node+
				"");
		super.add(object, feature, value, ruleName, node);
	}
}
