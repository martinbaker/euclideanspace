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

import org.eclipse.xtext.parser.DefaultEcoreElementFactory;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.nodemodel.INode;

/**
 * @author Martin Baker
 * This might be a way to avoid putting phantom tokens in node model and semantic model but
 * this is not used now.
 * Instead we rely on returning an index range with zero length from phantom token which
 * is a hack
 */
public class CustomDefaultEcoreElementFactory extends DefaultEcoreElementFactory {
	
	@Override
	public EObject create(EClassifier classifier) {
		//String sclassifier =classifier.toString();
		//if (classifier instanceof org.eclipse.emf.ecore.impl.EClassImpl){
		//	org.eclipse.emf.ecore.impl.EClassImpl rgrammarElement =(org.eclipse.emf.ecore.impl.EClassImpl)classifier;			
		//	sclassifier = "EClassImpl "+rgrammarElement.eContainerFeatureID();
		//}
		//EditorFileWriter.out("CustomDefaultEcoreElementFactory.create classifier="+sclassifier);
		return super.create(classifier);
	}

	//@SuppressWarnings("unchecked")
	@Override
	public void add(EObject object, String feature, Object value, String ruleName, INode node) throws ValueConverterException {
		//EditorFileWriter.out("CustomDefaultEcoreElementFactory.add"+
	    //        //"object="+object+
		//		" feature="+feature+
		//		" ruleName="+ruleName+
		//		//" node="+node+
		//		"");
		super.add(object, feature, value, ruleName, node);
	}
}
