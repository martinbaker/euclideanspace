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

package com.euclideanspace.spad.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess

import com.euclideanspace.spad.editor.AddPart;
import com.euclideanspace.spad.editor.AddStatements;
import com.euclideanspace.spad.editor.AdditiveExpression;
import com.euclideanspace.spad.editor.Block;
import com.euclideanspace.spad.editor.BooleanLiteral;
import com.euclideanspace.spad.editor.BreakStatement;
import com.euclideanspace.spad.editor.CaseExpression;
import com.euclideanspace.spad.editor.CategoryDef;
import com.euclideanspace.spad.editor.CharacterLiteral;
import com.euclideanspace.spad.editor.CoerceExpression;
import com.euclideanspace.spad.editor.ConditionExpression;
import com.euclideanspace.spad.editor.DivisionExpression;
import com.euclideanspace.spad.editor.DoStatement;
import com.euclideanspace.spad.editor.DomainDef;
import com.euclideanspace.spad.editor.EltExpression;
import com.euclideanspace.spad.editor.EqualityExpression;
import com.euclideanspace.spad.editor.ExplicitTypeExpression;
import com.euclideanspace.spad.editor.ExponentExpression;
import com.euclideanspace.spad.editor.Expr;
import com.euclideanspace.spad.editor.ExquoExpression;
import com.euclideanspace.spad.editor.ForStatement;
import com.euclideanspace.spad.editor.FreeVariable;
import com.euclideanspace.spad.editor.FunctionDefinition;
import com.euclideanspace.spad.editor.FunctionSignature;
import com.euclideanspace.spad.editor.HasExpression;
import com.euclideanspace.spad.editor.HintTypeExpression;
import com.euclideanspace.spad.editor.IfStatement;
import com.euclideanspace.spad.editor.Import;
import com.euclideanspace.spad.editor.InnerProdExpression;
import com.euclideanspace.spad.editor.IsExpression;
import com.euclideanspace.spad.editor.IterateStatement;
import com.euclideanspace.spad.editor.ListLiteral;
import com.euclideanspace.spad.editor.Literal;
import com.euclideanspace.spad.editor.LocalVariable;
import com.euclideanspace.spad.editor.MacroDef;
import com.euclideanspace.spad.editor.MapDefinition;
import com.euclideanspace.spad.editor.ModExpression;
import com.euclideanspace.spad.editor.Model;
import com.euclideanspace.spad.editor.MultiplicativeExpression;
import com.euclideanspace.spad.editor.NameOrFunctionCall;
import com.euclideanspace.spad.editor.OuterProdExpression;
import com.euclideanspace.spad.editor.PackageDef;
//import com.euclideanspace.spad.editor.Predicate;
//import com.euclideanspace.spad.editor.PredicateAnd;
//import com.euclideanspace.spad.editor.PredicateNot;
//import com.euclideanspace.spad.editor.PredicateOr;
//import com.euclideanspace.spad.editor.PredicatePrimary;
import com.euclideanspace.spad.editor.PretendExpression;
import com.euclideanspace.spad.editor.PrimaryPrefix;
import com.euclideanspace.spad.editor.QuoExpression;
import com.euclideanspace.spad.editor.RelationalExpression;
import com.euclideanspace.spad.editor.RemExpression;
import com.euclideanspace.spad.editor.ReturnStatement;
import com.euclideanspace.spad.editor.SegmentExpression;
import com.euclideanspace.spad.editor.Statement;
import com.euclideanspace.spad.editor.StatementExpression;
import com.euclideanspace.spad.editor.TypeArguments;
import com.euclideanspace.spad.editor.TypeExpression;
import com.euclideanspace.spad.editor.TypeLiteral;
import com.euclideanspace.spad.editor.TypeNameOrFunctionCall;
import com.euclideanspace.spad.editor.TypeParameterList;
import com.euclideanspace.spad.editor.TypePrimaryExpression;
import com.euclideanspace.spad.editor.TypeResult;
import com.euclideanspace.spad.editor.TypeWithName;
import com.euclideanspace.spad.editor.UnaryExpression;
import com.euclideanspace.spad.editor.VariableDeclaration;
import com.euclideanspace.spad.editor.VariableTyped;
import com.euclideanspace.spad.editor.VariableDeclarationAssign;
import com.euclideanspace.spad.editor.WhereAssignments;
import com.euclideanspace.spad.editor.WherePart;
import com.euclideanspace.spad.editor.WhileStatement;
import com.euclideanspace.spad.editor.WithPart;

class EditorGenerator implements IGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		fsa.generateFile(resource.className+".java", compile(resource.contents.head as Model))
	}

	def className(Resource res) {
		var name = res.URI.lastSegment
		return name.substring(0, name.indexOf('.'))
	}

	def compile(Model model) ''' 
        «IF model.eContainer != null»
            package «model.eResource.className»;
        «ENDIF»
        
        «IF model.c != null» «compile(model.c)» «ENDIF»
        «IF model.p != null» «compile(model.p)» «ENDIF»
        «IF model.d != null» «compile(model.d)» «ENDIF»

        }
    '''

    /* CategoryDef */
    def compile(CategoryDef f) '''
      public interface «f.longname» «IF f.cp != null» «
      compile(f.cp)»«ENDIF»{
      /* extends «f.name» 
      «IF f.implName != null» «f.implName» «ENDIF»*/
      «IF f.w != null» «compile(f.w)» «ENDIF»
      «IF f.wh5 != null» «compile(f.wh5)» «ENDIF»
    }'''
 
    /* PackageDef */
    def compile(PackageDef f) '''
      public static class «f.longname» «
      IF f.cp != null» «compile(f.cp)»«ENDIF»{
      /* extends «f.name» 
      «IF f.exportName != null» «f.exportName» «ENDIF»
      «IF f.implName != null» «f.implName» «ENDIF»*/
      «IF f.w != null» «compile(f.w)» «ENDIF»
      «IF f.wh5 != null» «compile(f.wh5)» «ENDIF»
    }'''

    /* DomainDef */
    def compile(DomainDef f) '''
      public class «f.longname5» «IF f.cp5 != null» «compile(f.cp5)» «ENDIF»{      
      /* extends «f.name» 
      «IF f.exportName != null» «f.exportName» «ENDIF»
      «IF f.implName5 != null» «f.implName5» «ENDIF»*/
      «IF f.w != null» «compile(f.w)» «ENDIF»
      «IF f.wh5 != null» «compile(f.wh5)» «ENDIF»
    }'''

   /* WherePart */
    def compile(WherePart f) '''
       /* WherePart */
       «FOR x:f.whereAssig» «compile(x)» «ENDFOR»
       /*«IF f.longname8 != null» «f.longname8» «ENDIF»
       «IF f.imp != null» «compile(f.imp)» «ENDIF»*/
       «IF f.w8 != null» «compile(f.w8)» «ENDIF»
       /*«IF f.longname9 != null» «f.longname9»*/«ENDIF»
       «IF f.add != null» «compile(f.add)» «ENDIF»
        '''

    /* WhereAssignments */
    def compile(WhereAssignments f) 
       '''«IF f instanceof VariableDeclaration»«
       compile(f as VariableDeclaration)»«ENDIF»«
       IF f instanceof MacroDef»«
       compile(f as MacroDef)»«ENDIF»'''

    /* WithPart */
    def compile(WithPart f) '''
       /* WithPart */
       «FOR x:f.fundec»«compile(x)»
       «ENDFOR»
        '''

    /* AddPart */
    def compile(AddPart f) '''
       /* AddPart */
       «FOR x:f.t» «compile(x)» «ENDFOR»
        '''
  
    /* AddStatements */
    def compile(AddStatements f) '''
       «IF f instanceof VariableDeclarationAssign» «
       compile(f as VariableDeclarationAssign)» «
       ENDIF»
       «IF f instanceof FunctionDefinition» «
       compile(f as FunctionDefinition)» «
       ENDIF»
       «IF f instanceof MacroDef» «
       compile(f as MacroDef)» «ENDIF»
        '''

    /* FunctionDefinition */  
    def compile(FunctionDefinition f)
       '''«IF f instanceof FunctionSignature»«
       compile(f as FunctionSignature)»«ENDIF»
        '''

    /* MapDefinition */
    def compile(MapDefinition f) 
       '''«IF f instanceof FunctionSignature»«
       compile(f as FunctionSignature)»«ENDIF»
        '''
    
    /* FunctionSignature 
     * par4 and par5 inherit from FunctionDefinition*/
    def compile(FunctionSignature f) 
        '''«IF f.fnNam != null»«f.fnNam»(«ENDIF»«
        IF f.par2 != null» «compile(f.par2)»«ENDIF»«
        FOR x:f.par3»,«compile(x)»«ENDFOR»«
        IF f.fnNam != null»)«ENDIF»«
        IF f.b1 != null»«f.b1»«ENDIF»«
        IF f.t4 != null»(«f.t4»«ENDIF»«
        IF f.t5 != null»,«f.t5»)«ENDIF»«
        IF f.b2 != null»«f.b2»«ENDIF»«
        IF f.t6 != null»«f.t6»«ENDIF»''' //«
       // IF f.par4 != null»:«compile(f.par4)» «ENDIF»«
       // IF f.par5 != null»->«compile(f.par5)» «ENDIF»'''
        
  
    /* MacroDef */
    def compile(MacroDef f) 
        '''«IF f.macroname != null» «
        f.macroname» «ENDIF»'''

    /* Import */
    def compile(Import f) 
        '''import«IF f.impname != null» «
        f.impname» «ENDIF»'''

    /* VariableDeclaration */
    def compile(VariableDeclaration f) 
        '''«IF f.v1 != null» «
        compile(f.v1)»«ENDIF»'''
        
    /* TypeWithName */
    def compile(TypeWithName f) 
        '''«IF f.typ != null» «
        compile(f.typ)»«ENDIF»'''

    /* VariableTyped */
    def compile(VariableTyped f) 
        '''«IF f.varName != null» «
        f.varName»«ENDIF»«IF f.typ != null»:«
        compile(f.typ)»«ENDIF»'''

    /* VariableDeclarationAssign */
    def compile(VariableDeclarationAssign f) 
        '''«IF f.varName != null»«f.varName»«ENDIF»«
        FOR x:f.t2»,«x»«ENDFOR»«
        IF f.typ != null»:«compile(f.typ)»«ENDIF»«
        IF f.t4 != null»:=«compile(f.t4)»«ENDIF»'''
  
    /* FreeVariable */
    def compile(FreeVariable f) 
        ''' free '''

    /* LocalVariable */
    def compile(LocalVariable f) 
        ''' local'''
        
    /* TypeExpression */
    def compile(TypeExpression f) 
      '''«IF f.t2 != null»«compile(f.t2)» -> «
      compile(f.t3)»«ENDIF»«
      IF f instanceof TypePrimaryExpression»«
      compile(f as TypePrimaryExpression)»«ENDIF»'''
  
    /* TypeParameterList */
    def compile(TypeParameterList f) 
        '''<«
      IF f.par != null»«f.par»«ENDIF»«
      FOR x:f.par2 »,«x» «ENDFOR»>'''

    /* TypeArguments */  
    def compile(TypeArguments f) 
        '''«IF f.t != null»«compile(f.t)»«
        ENDIF»«IF f.t2 != null»«f.t2» «ENDIF»«
        IF f.t3 != null»«f.t3»«ENDIF»«
        IF f.t4 != null»<«compile(f.t4)»«
          FOR x:f.t16 »,«compile(x)» «ENDFOR»>«ENDIF»«
        IF f.t6 != null»Record(«compile(f.t6)»«
          FOR x:f.t22 »,«compile(x)» «ENDFOR»)«ENDIF»«
        IF f.t10 != null»Union(«compile(f.t10)»«
          FOR x:f.t25 »,«compile(x)» «ENDFOR»)«ENDIF»«
        IF f.t12 != null»Join(«compile(f.t12)»«
          FOR x:f.t13 »,«compile(x)» «ENDFOR»)«ENDIF»«
        IF f.t15 != null»<«compile(f.t15)»>«ENDIF»'''
  
  /* TypeResult */
    def compile(TypeResult f) 
      '''«IF f.t != null»«compile(f.t)»«ENDIF»«
      IF f.t2 != null»«f.t2»«ENDIF»«
      IF f.tyname != null»«f.tyname» «ENDIF»«
      IF f.t7 != null»Record («compile(f.t7)»)«
      ENDIF»«IF f.t10 != null»Union («
      compile(f.t10)»)«ENDIF»«
      IF f.t12 != null»Join («compile(f.t12)»)«
      ENDIF»«
      IF f.t15 != null»«compile(f.t15)»«ENDIF»'''

    /* TypePrimaryExpression */
    def compile(TypePrimaryExpression f) 
      '''«IF f.t32 != null»«f.t32»«ENDIF»«
      IF f.tyname != null»«f.tyname» «ENDIF»«
      IF f.t5 != null»(«compile(f.t5)»)«ENDIF»«
      IF f.t7 != null»(«compile(f.t7)»)«
       FOR x:f.t8»(«compile(x)»)«ENDFOR»«
       FOR x:f.t21»(«compile(x)»)«ENDFOR»«
       FOR x:f.t23»(«compile(x)»)«ENDFOR»«ENDIF»«
      IF f.t10 != null»(«f.t10»)«
       FOR x:f.t11»(«compile(x)»)«ENDFOR»«
       FOR x:f.t24»(«compile(x)»)«ENDFOR»«
       FOR x:f.t26»(«compile(x)»)«ENDFOR»«ENDIF»«
      IF f.t13 != null»(«f.t13»)«
       FOR x:f.t14»(«compile(x)»)«ENDFOR»«ENDIF»«
      IF f instanceof TypeLiteral»«
        compile(f as TypeLiteral)»«ENDIF»«
      IF f instanceof TypeNameOrFunctionCall»«
        compile(f as TypeNameOrFunctionCall)»«ENDIF»'''
      
/* «IF f instanceof TypeLiteral»«
      compile(f as TypeLiteral)»«ENDIF»«
      IF f instanceof TypeNameOrFunctionCall»«
      compile(f as TypeNameOrFunctionCall)»«ENDIF»
      */
              
	/* TypeNameOrFunctionCall
	 * 
	 * tfnname=ID
	 * ( t4=TypeExpression? (, t25+=TypeExpression)*)
  |  * t6=TypePrimaryExpression)?
	 */
     def compile(TypeNameOrFunctionCall f)
        '''«IF f.tfnname != null»«f.tfnname»«ENDIF»«
        IF f.t4 != null»(«compile(f.t4)»«
          FOR x:f.t25»,«compile(x)»«ENDFOR»)«ENDIF»«
        IF f.t6 != null»(«compile(f.t6)»)«ENDIF»'''

/* «
        compile(f as TypePrimaryExpression)»*/

    /* TypeLiteral 
     * t1=INT,t22=STRING,t4=CharacterLiteral,
     * t35=BooleanLiteral*/
    def compile(TypeLiteral f)
      '''«IF f.t1 != null &&
             (f.t22 == null) &&
             (f.t34 == null) &&
             (f.t35== null)» «f.t1»«ENDIF»«
      IF f.t22 != null»"«f.t22»"«ENDIF»«
      IF f.t34 != null»«compile(f.t34)»«ENDIF»«
      IF f.t35 != null»«compile(f.t35)»«ENDIF»'''

/* «
      IF f.t5 != null»«compile(f.t5)»«ENDIF»«
      compile(f as TypePrimaryExpression)»*/

    /* Statement 
     * s1=Block
     * s3= StatementExpression
     * s4=IfStatement
     * s5=WhileStatement
     * s6=DoStatement
     * s7=ForStatement
     * s8=BreakStatement
     * s9= IterateStatement
     * s10= ReturnStatement*/
    def compile(Statement f) 
        '''«IF f.s1 != null» «compile(f.s1)»«ENDIF»«
        IF f.s3 != null»«compile(f.s3)»«ENDIF»«
        IF f.s4 != null»«compile(f.s4)»«ENDIF»«
        IF f.s5 != null»«compile(f.s5)»«ENDIF»«
        IF f.s6 != null»«compile(f.s6)»«ENDIF»«
        IF f.s7 != null»«compile(f.s7)»«ENDIF»«
        IF f.s8 != null»«compile(f.s8)»«ENDIF»«
        IF f.s9 != null»«compile(f.s9)»«ENDIF»«
        IF f.s10 != null»«compile(f.s10)»«ENDIF»'''
  
    /* Block */
    def compile(Block f)
      ''' {
        «FOR x:f.statemBl»«compile(x)»
        «ENDFOR»} '''
  
    /* StatementExpression 
     * t:t2 := t3 => t4*/
    def compile(StatementExpression f) 
        '''«IF f.t != null»«compile(f.t)»«ENDIF»«
        IF f.t2 != null»:«compile(f.t2)»«ENDIF»«
        IF f.t3 != null»=«compile(f.t3)»«ENDIF»«
        IF f.t4 != null»=>«compile(f.t4)»«ENDIF»'''

    /* ForStatement */
    def compile(ForStatement f) 
        '''for «f.stname» in «compile(f.t1)
        » repeat «compile(f.s1)»'''
        
    /* WhileStatement */
    def compile(WhileStatement f)
        '''while «compile(f.t2)
        » repeat «compile(f.s1)»'''
  
    /* DoStatement */
    def compile(DoStatement f)
        '''do «compile(f.s1)
        » while «compile(f.t2)»'''

    /* IterateStatement */
    def compile(IterateStatement f) 
        '''iterate'''

    /* BreakStatement */
    def compile(BreakStatement f) 
        '''break'''

    /* ReturnStatement */
    def compile(ReturnStatement f) 
        '''return «compile(f.t2)»'''
        
    /* IfStatement */
    def compile(IfStatement f) 
      '''if «compile(f.t2)»then «
        compile(f.s1)»'''
//        IF f.s2 != null»else «compile(f.s2)»«
//        «ENDIF»

    /* Predicate */
/*    def compile(Predicate f)
        '''«IF f instanceof PredicateOr»«
        compile(f as PredicateOr)»«ENDIF»«
        IF f instanceof PredicateAnd»«
        compile(f as PredicateAnd)»«ENDIF»«
        IF f instanceof PredicateNot»«
        compile(f as PredicateNot)»«ENDIF»«
        IF f instanceof PredicatePrimary»«
        compile(f as PredicatePrimary)»«ENDIF»'''*/
        
    /* PredicateOr */
/*    def compile(PredicateOr f)
        '''«compile(f.left)»«
        IF f.right != null»or «
        compile(f.right)»«ENDIF»'''*/

    /* PredicateAnd */
/*    def compile(PredicateAnd f)
        '''«compile(f.left)»«
        IF f.right != null»and «
        compile(f.right)»«ENDIF»'''*/

    /* PredicateNot */
/*    def compile(PredicateNot f)
       '''«IF f.t2 != null»not «compile(f.t2)»«ENDIF»'''*/
  
    /* PredicatePrimary */
/*    def compile(PredicatePrimary f) 
       '''«IF f.t != null»(«compile(f.t)»)«ENDIF»«
       IF f.t2 != null»(«compile(f.t2)»)«ENDIF»'''*/

    /* Expr */
    def compile(Expr f)
        '''«IF f instanceof ConditionExpression»«
        compile(f as ConditionExpression)»«ENDIF»«
        IF f instanceof InnerProdExpression»«
        compile(f as InnerProdExpression)»«ENDIF»«
        IF f instanceof OuterProdExpression»«
        compile(f as OuterProdExpression)»«ENDIF»«
        IF f instanceof HasExpression»«
        compile(f as HasExpression)»«ENDIF»«
        IF f instanceof CaseExpression»«
        compile(f as CaseExpression)»«ENDIF»«
        IF f instanceof EqualityExpression»«
        compile(f as EqualityExpression)»«ENDIF»«
        IF f instanceof RelationalExpression»«
        compile(f as RelationalExpression)»«ENDIF»«
        IF f instanceof IsExpression»«
        compile(f as IsExpression)»«ENDIF»«
        IF f instanceof SegmentExpression»«
        compile(f as SegmentExpression)»«ENDIF»«
        IF f instanceof AdditiveExpression»«
        compile(f as AdditiveExpression)»«ENDIF»«
        IF f instanceof ExquoExpression»«
        compile(f as ExquoExpression)»«ENDIF»«
        IF f instanceof DivisionExpression»«
        compile(f as DivisionExpression)»«ENDIF»«
        IF f instanceof QuoExpression»«
        compile(f as QuoExpression)»«ENDIF»«
        IF f instanceof ModExpression»«
        compile(f as ModExpression)»«ENDIF»«
        IF f instanceof RemExpression»«
        compile(f as RemExpression)»«ENDIF»«
        IF f instanceof MultiplicativeExpression»«
        compile(f as MultiplicativeExpression)»«ENDIF»«
        IF f instanceof ExponentExpression»«
        compile(f as ExponentExpression)»«ENDIF»«
        IF f instanceof PretendExpression»«
        compile(f as PretendExpression)»«ENDIF»«
        IF f instanceof HintTypeExpression»«
        compile(f as HintTypeExpression)»«ENDIF»«
        IF f instanceof CoerceExpression»«
        compile(f as CoerceExpression)»«ENDIF»«
        IF f instanceof EltExpression»«
        compile(f as EltExpression)»«ENDIF»«
        IF f instanceof ExplicitTypeExpression»«
        compile(f as ExplicitTypeExpression)»«ENDIF»«
        IF f instanceof UnaryExpression»«
        compile(f as UnaryExpression)»«ENDIF»«
        IF f instanceof PrimaryPrefix»«
        compile(f as PrimaryPrefix)»«ENDIF»«
        IF f.ifpred != null»if «compile(f.ifpred)» «ENDIF»«
        IF f.thenexp != null»then «compile(f.thenexp)» «ENDIF»«
        IF f.elseexp != null»else «compile(f.elseexp)» «ENDIF»'''
  
    def compile(ConditionExpression f)
        '''«compile(f.left)»«
        IF f.right != null»«f.op» «compile(f.right)» «ENDIF»'''
  
    def compile(InnerProdExpression f)
        '''«IF f.left != null»«compile(f.left)»«ENDIF»«
        IF f.right != null»«f.op» «compile(f.right)» «ENDIF»'''
  
    def compile(OuterProdExpression f)
        '''«IF f.left != null»«compile(f.left)»«ENDIF»«
        IF f.right != null»«f.op» «compile(f.right)» «ENDIF»'''
  
    def compile(HasExpression f)
        '''«IF f.left != null»«compile(f.left)»«ENDIF»«
        IF f.rightType != null»«f.op» «compile(f.rightType)» «ENDIF»'''
  
    def compile(CaseExpression f)
        '''«IF f.left != null»«compile(f.left)»«ENDIF»«
        IF f.right != null»«f.op» «compile(f.right)» «ENDIF»'''

    def compile(EqualityExpression f)
        '''«IF f.left != null»«compile(f.left)»«ENDIF»«
        IF f.right != null»«f.op» «compile(f.right)» «ENDIF»'''
  
    /* RelationalExpression */
    def compile(RelationalExpression f)
        '''«IF f.left != null»«compile(f.left)»«ENDIF»«
        IF f.right != null»«f.op» «compile(f.right)» «ENDIF»'''

    def compile(IsExpression f)
        '''«compile(f.left)»«
        IF f.rightType != null»«f.op» «compile(f.rightType)» «ENDIF»'''
  
    def compile(SegmentExpression f)
        '''«IF f.left != null»«compile(f.left)»«ENDIF»«
        IF f.right != null»«f.op»«compile(f.right)» «ENDIF»'''
  
    def compile(AdditiveExpression f)
        '''«IF f.left != null»«compile(f.left)»«ENDIF»«
        IF f.right != null»«f.op» «compile(f.right)» «ENDIF»'''
  
     def compile(ExquoExpression f)
        '''«IF f.left != null»«compile(f.left)»«ENDIF»«
        IF f.right != null»«f.op» «compile(f.right)» «ENDIF»'''
  
    def compile(DivisionExpression f)
        '''«IF f.left != null»«compile(f.left)»«ENDIF»«
        IF f.right != null»«f.op» «compile(f.right)» «ENDIF»'''
  
    def compile(QuoExpression f)
        '''«IF f.left != null»«compile(f.left)»«ENDIF»«
        IF f.right != null»«f.op» «compile(f.right)» «ENDIF»'''
  
    def compile(ModExpression f)
        '''«IF f.left != null»«compile(f.left)»«ENDIF»«
        IF f.right != null»«f.op» «compile(f.right)» «ENDIF»'''
  
    def compile(RemExpression f)
        '''«IF f.left != null»«compile(f.left)»«ENDIF»«
        IF f.right != null»«f.op» «compile(f.right)» «ENDIF»'''
  
    def compile(MultiplicativeExpression f)
        '''«IF f.left != null»«compile(f.left)»«ENDIF»«
        IF f.right != null»«f.op» «compile(f.right)» «ENDIF»'''
  
    def compile(ExponentExpression f)
        '''«IF f.left != null»«compile(f.left)»«ENDIF»«
        IF f.right != null»«f.op» «compile(f.right)» «ENDIF»'''
  
   def compile(PretendExpression f)
        '''«IF f.left != null»«compile(f.left)»«ENDIF»«
        IF f.rightType != null»«f.op» «compile(f.rightType)» «ENDIF»'''
  
   def compile(HintTypeExpression f)
        '''«IF f.left != null»«compile(f.left)»«ENDIF»«
        IF f.rightType != null»«f.op» «compile(f.rightType)» «ENDIF»'''

   def compile(CoerceExpression f)
        '''«IF f.left != null»«compile(f.left)»«ENDIF»«
        IF f.rightType != null»«f.op»«compile(f.rightType)» «ENDIF»'''
  
    /* EltExpression */  
    def compile(EltExpression f)
        '''«IF f.left != null»«compile(f.left)»«ENDIF»«
        IF f.right != null»«f.op» «compile(f.right)» «ENDIF»'''
    
    def compile(ExplicitTypeExpression f)
        '''«IF f.left != null»«compile(f.left)»«ENDIF»«
        IF f.rightType != null»«f.op»«compile(f.rightType)» «ENDIF»'''
  
     def compile(UnaryExpression f)
        '''«IF f.expr != null»«f.uop»«compile(f.expr)» «
        ENDIF»'''
  
 /*   def compile(UnaryExpressionHash f)
        '''«IF f.expr != null»«f.uop»«compile(f.expr)» «
        ENDIF»'''*/
  
//    def compile(PrimaryExpression f) '''
//        '''

//      «IF f. != null» «f.» «ENDIF»
//      «IF f. != null» «compile(f.)» «ENDIF»
//      «FOR x:f. » «x» «ENDFOR»


    /* PrimaryPrefix */
    def compile(PrimaryPrefix f)
        //IF f.t != null» «compile(f.t)» «ENDIF»«
        '''«IF f.t4 != null»(«compile(f.t4)»)«ENDIF»«
        IF f.t7 != null» «compile(f.t7)» «ENDIF»'''

    /* NameOrFunctionCall */
    def compile(NameOrFunctionCall f) 
        '''«IF f.fnname != null»«f.fnname» «ENDIF»«
        IF f.lsp != null»$Lisp «ENDIF»«
        IF f.t4 != null»(«compile(f.t4)»«
        FOR x:f.t5 »,«compile(x)»«ENDFOR»)«ENDIF»«
        IF f.t6 != null»«compile(f.t6)» «ENDIF»'''
  
    /* Literal */
    def compile(Literal f) 
        '''«IF !(f instanceof ListLiteral) &&
               !(f instanceof CharacterLiteral) &&
               !(f instanceof BooleanLiteral) &&
               (f.t2 == null)»«
           IF f.value != null»«f.value» «ENDIF»«
        ENDIF»«
        IF f.t2 != null»"«f.t2»"«ENDIF»«
        IF f instanceof ListLiteral»«
        compile(f as ListLiteral)»«ENDIF»«
        IF f instanceof CharacterLiteral»«
        compile(f as CharacterLiteral)»«ENDIF»«
        IF f instanceof BooleanLiteral»«
        compile(f as BooleanLiteral)»«ENDIF»'''

    /* CharacterLiteral */
    def compile(CharacterLiteral f) 
        '''«IF f.c1 != null» «f.c1»«ENDIF»'''

    /* BooleanLiteral */
    def compile(BooleanLiteral f) 
        ''' «f.litname»'''
        
//      «IF f. != null» «f.» «ENDIF»
//      «IF f. != null» «compile(f.)» «ENDIF»
//      «FOR x:f. » «x» «ENDFOR»
  
    /* ListLiteral */
    def compile(ListLiteral f) 
        '''[«IF f.l2 != null»«
        compile(f.l2)»«ENDIF»«
        FOR x:f.t3 »,«compile(x)»«ENDFOR»«
        FOR x:f.t14 » for «compile(x)» in «ENDFOR»«
        FOR x:f.l5 » «compile(x)» «ENDFOR»]'''
}

