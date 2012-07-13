/* Copyright 2012 Martin John Baker
 * 
 * This file is part of EuclideanSpace.
 *
 *  EuclideanSpace is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Affero General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  EuclideanSpace is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Affero General Public License for more details.
 *
 *  You should have received a copy of the GNU Affero General Public License
 *  along with EuclideanSpace.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.euclideanspace.spad.ui.labeling;
/*
*/

/*
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;

import com.google.inject.Inject;
*/

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.common.types.JvmArrayType;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericArrayTypeReference;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeConstraint;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmUpperBound;
import org.eclipse.xtext.common.types.JvmWildcardTypeReference;
import com.euclideanspace.spad.editor.*;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;
import org.eclipse.xtext.util.Strings;

import com.google.inject.Inject;


/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation/latest/xtext.html#labelProvider
 */
public class EditorLabelProvider extends DefaultEObjectLabelProvider {

	@Inject
	public EditorLabelProvider(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}


	//Labels and icons can be computed like this:
	
	String text(Model ele) {
	  return "Model";
	}
	
	public String text(CategoryDef ele) {
		    StringBuilder builder = new StringBuilder();
		    builder.append(Strings.notNull(ele.getName()));
		    builder.append(" : "+ele.getLongname());
		    //append(builder, ele.getLongname());
		    return builder.toString();
	}

	public String text(PackageDef ele) {
	    StringBuilder builder = new StringBuilder();
	    builder.append(Strings.notNull(ele.getName()));
	    builder.append(" : "+ele.getLongname());
	    //append(builder, ele.getType());
	    return builder.toString();
}

	public String text(DomainDef ele) {
	    StringBuilder builder = new StringBuilder();
	    builder.append(Strings.notNull(ele.getName()));
	    builder.append(" : "+ele.getLongname5());
	    //append(builder, ele.getType());
	    return builder.toString();
}

	String text(WherePart ele) {
		  return "WherePart :"+ele.getName();
	}

	String text(WithPart ele) {
		  return "WithPart :"+ele.getName();
	}

	String text(AddPart ele) {
		  return "AddPart :"+ele.getName();
	}

	String text(FunctionDefinition ele) {
		  return "FunctionDefinition :";
	}

	String text(MapDefinition ele) {
		  return "MapDefinition :";
	}

	String text(FunctionSignature ele) {
		  return "FunctionSignature :"+ele.getFnNam();
	}

	String text(MacroDef ele) {
		  return "MacroDef :"+ele.getMacroname()+ele.getMacroname();
	}

	String text(Import ele) {
		  return "Import :";
	}

	String text(VariableDeclaration ele) {
		  return "VariableDeclaration :"+ele.getVarName();
	}

	String text(VariableDeclarationAssign ele) {
		  return "VariableDeclarationAssign :"+ele.getVarName();
	}

	String text(FreeVariable ele) {
		  return "FreeVariable :"+ele.getVar();
	}

	String text(LocalVariable ele) {
		  return "LocalVariable :"+ele.getVar();
	}

	String text(TypeExpression ele) {
		  return "TypeExpression :";
	}

	String text(TypeParameterList ele) {
		  return "TypeParameterList :"+ele.getTyname();
	}

	String text(TypeArguments ele) {
		  return "TypeArguments :";
	}

	String text(TypeResult ele) {
		  return "TypeResult :"+ele.getName();
	}

	String text(TypePrimaryExpression ele) {
		  return commonTPE(ele,"TP");
	}

	/* TypeNameOrFunctionCall
	 * 
	 * tfnname=ID
	 * ( t4=TypeExpression? (, t25+=TypeExpression)*)
  |  * t6=TypePrimaryExpression)?
	 */
	String text(TypeNameOrFunctionCall ele) {
		if (ele.getTfnname() != null) return "TypeNameOrFunctionCall1 :"+ele.getTfnname();
		  if (ele.getT4() != null) return "TypeNameOrFunctionCall2 : "+ele.getT4();
		  if (ele.getT6() != null) return "TypeNameOrFunctionCall : contains primary expression";
		  //if (ele.getT25() != null) return "TypeNameOrFunctionCall4 :"+ele.getT25();
		return commonTPE(ele,"TNFC");		  
	}

	String commonTPE(TypePrimaryExpression ele,String caller) {
		  if (ele.getT32() != null) {
			  if (ele.getT7() != null) return "TypePrimaryExpression:"+caller+"4 : Record "+ele.getT32();
			  if (ele.getT10() != null) return "TypePrimaryExpression:"+caller+"5 : Union "+ele.getT32();
			  if (ele.getT13() != null) return "TypePrimaryExpression:"+caller+"6 : Join "+ele.getT32();
			  return "TypePrimaryExpression1 :"+ele.getT32();
		  }
		  if (ele.getTyname() != null) return "TypePrimaryExpression:"+caller+"2 :"+ele.getTyname();
		  if (ele.getT5() != null) return "TypePrimaryExpression:"+caller+" : (...)";
		  if (ele.getT7() != null) return "TypePrimaryExpression:"+caller+" : Record?";
		  if (ele.getT10() != null) return "TypePrimaryExpression:"+caller+" : Union?";
		  if (ele.getT13() != null) return "TypePrimaryExpression:"+caller+" : Join?";
		  return "TypePrimaryExpression?"+caller+" : "+ele.getT32();
	}

    /* TypeLiteral 
     * t1=INT,t22=STRING,t4=CharacterLiteral,
     * t35=BooleanLiteral*/
    String text(TypeLiteral ele) {
		  if (ele.getT22() != null) return "TypeLiteral :"+ele.getT22();
		  if (ele.getT35() != null) return "TypeLiteral :"+ele.getT35();
		  if (ele.getT34() != null) return "TypeLiteral :"+ele.getT34();
		  return commonTPE(ele,"TL")+ele.getT1();		  
		  //return "TypeLiteral :"+ele.getT1();
	}

	/*String commonTL(TypeLiteral ele) {
	}*/

	String text(Statement ele) {
		  return "Statement :";
	}

	String text(Block ele) {
		  return "Block :";
	}

	String text(StatementExpression ele) {
		  return "StatementExpression :";
	}

	String text(ForStatement ele) {
		  return "ForStatement :";
	}

	String text(WhileStatement ele) {
		  return "WhileStatement :";
	}

	String text(DoStatement ele) {
		  return "DoStatement :";
	}

	String text(IterateStatement ele) {
		  return "IterateStatement :";
	}

	String text(BreakStatement ele) {
		  return "BreakStatement :";
	}

	String text(ReturnStatement ele) {
		  return "ReturnStatement :";
	}

	String text(IfStatement ele) {
		  return "IfStatement :";
	}

/*	String text(PredicateOr ele) {
		  return "PredicateOr :";
	}

	String text(PredicateAnd ele) {
		  return "PredicateAnd :";
	}

	String text(PredicateNot ele) {
		  return "IfStatement :";
	}

	String text(PredicatePrimary ele) {
		  return "PredicatePrimary :";
	}*/

	String text(Expr ele) {
		  return "Expr :"+ele.getIfname();
	}

	String text(ConditionExpression ele) {
		  return "ConditionExpression :"+ele.getOp();
	}

	String text(InnerProdExpression ele) {
		  return "InnerProdExpression :"+ele.getOp();
	}

	String text(OuterProdExpression ele) {
		  return "OuterProdExpression :"+ele.getOp();
	}

	String text(HasExpression ele) {
		  return "HasExpression :"+ele.getOp();
	}

	String text(CaseExpression ele) {
		  return "CaseExpression :"+ele.getOp();
	}

	String text(EqualityExpression ele) {
		  return "EqualityExpression :"+ele.getOp();
	}

	String text(RelationalExpression ele) {
		  return "RelationalExpression :"+ele.getOp();
	}

	String text(IsExpression ele) {
		  return "IsExpression :"+ele.getOp();
	}

	String text(SegmentExpression ele) {
		  return "SegmentExpression :"+ele.getOp();
	}

	String text(AdditiveExpression ele) {
		  return "AdditiveExpression :"+ele.getOp();
	}

	String text(ExquoExpression ele) {
		  return "ExquoExpression :"+ele.getOp();
	}

	String text(DivisionExpression ele) {
		  return "DivisionExpression :"+ele.getOp();
	}

	String text(QuoExpression ele) {
		  return "QuoExpression :"+ele.getOp();
	}

	String text(ModExpression ele) {
		  return "ModExpression :"+ele.getOp();
	}

	String text(RemExpression ele) {
		  return "RemExpression :"+ele.getOp();
	}

	String text(MultiplicativeExpression ele) {
		  return "MultiplicativeExpression :"+ele.getOp();
	}

	String text(ExponentExpression ele) {
		  return "ExponentExpression :"+ele.getOp();
	}

	String text(PretendExpression ele) {
		  return "PretendExpression :"+ele.getOp();
	}

	String text(HintTypeExpression ele) {
		  return "HintTypeExpression :"+ele.getOp();
	}
	
	String text(CoerceExpression ele) {
		  return "CoerceExpression :"+ele.getOp();
	}

	String text(EltExpression ele) {
		  return "EltExpression :"+ele.getOp();
	}

	String text(ExplicitTypeExpression ele) {
		  return "ExplicitTypeExpression :"+ele.getOp();
	}

	String text(UnaryExpression ele) {
		  return "UnaryExpression :"+ele.getUop();
	}

/*	String text(UnaryExpressionHash ele) {
		  return "UnaryExpressionHash :"+ele.getIfname();
	}*/

	String text(PrimaryPrefix ele) {
		  return "PrimaryPrefix :"+ele.getIfname();
	}

	String text(NameOrFunctionCall ele) {
		  return "NameOrFunctionCall :"+ele.getFnname();
	}

	String text(Literal ele) {
		if (ele.getT2() != null)
          return "Literal :"+ele.getT2();
		return "Literal :"+ele.getValue();
	}

	String text(CharacterLiteral ele) {
		  return "CharacterLiteral :"+ele.getC1();
	}

	String text(BooleanLiteral ele) {
		  return "BooleanLiteral :"+ele.getLitname();
	}

	String text(ListLiteral ele) {
		  return "ListLiteral :"+ele.getLitname();
	}

	/*	 
    String image(MyModel ele) {
      return "MyModel.gif";
    }
*/
}


