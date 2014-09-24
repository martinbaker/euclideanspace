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
import com.euclideanspace.spad.editor.AndExpression;
import com.euclideanspace.spad.editor.AssignExpression;
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
import com.euclideanspace.spad.editor.ExitExpression;
import com.euclideanspace.spad.editor.Expr;
import com.euclideanspace.spad.editor.ExquoExpression;
import com.euclideanspace.spad.editor.ForStatement;
import com.euclideanspace.spad.editor.FreeVariable;
import com.euclideanspace.spad.editor.FunctionDefinition;
import com.euclideanspace.spad.editor.FunctionDefinitionBlock;
import com.euclideanspace.spad.editor.FunctionSignature;
import com.euclideanspace.spad.editor.HasExpression;
import com.euclideanspace.spad.editor.HintTypeExpression;
import com.euclideanspace.spad.editor.IfStatement;
import com.euclideanspace.spad.editor.IfElseStatement;
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
import com.euclideanspace.spad.editor.OrExpression;
import com.euclideanspace.spad.editor.OuterProdExpression;
import com.euclideanspace.spad.editor.PackageDef;
import com.euclideanspace.spad.editor.PretendExpression;
import com.euclideanspace.spad.editor.PrimaryPrefix;
import com.euclideanspace.spad.editor.QuoExpression;
import com.euclideanspace.spad.editor.RelationalExpression;
import com.euclideanspace.spad.editor.RemExpression;
import com.euclideanspace.spad.editor.ReturnStatement;
import com.euclideanspace.spad.editor.RepeatStatement;
import com.euclideanspace.spad.editor.SegmentExpression;
import com.euclideanspace.spad.editor.Statement;
import com.euclideanspace.spad.editor.StatementExpression;
import com.euclideanspace.spad.editor.TupleDefinition;
import com.euclideanspace.spad.editor.TypeArguments;
import com.euclideanspace.spad.editor.TypeExpression;
import com.euclideanspace.spad.editor.TypeLiteral;
import com.euclideanspace.spad.editor.TypeNameOrFunctionCall;
import com.euclideanspace.spad.editor.TypeNameOrFunctionCall2;
import com.euclideanspace.spad.editor.TypeParameterList;
import com.euclideanspace.spad.editor.TypePrimaryExpression;
import com.euclideanspace.spad.editor.TypeResult;
import com.euclideanspace.spad.editor.TypeWithName;
import com.euclideanspace.spad.editor.UnaryExpression;
import com.euclideanspace.spad.editor.VariableDeclaration;
import com.euclideanspace.spad.editor.VariableDeclarationBlock;
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

	def CharSequence compile(Model model) ''' 
        «IF model.eContainer != null»
            package «model.eResource.className»;
        «ENDIF»
        
        «IF model.c != null» «compile(model.c)» «ENDIF»
        «IF model.p != null» «compile(model.p)» «ENDIF»
        «IF model.d != null» «compile(model.d)» «ENDIF»

        }
    '''

    /* CategoryDef */
    def CharSequence compile(CategoryDef f) '''
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
      public class «f.longname5» «IF f.cp5 != null»/*«compile(f.cp5)»*/«ENDIF      
       »extends «f.name» {
      /*«IF f.exportName != null» «f.exportName» «ENDIF
      »«IF f.implName5 != null» «f.implName5» «ENDIF»*/
      «IF f.w != null» «compile(f.w)» «ENDIF
      »«IF f.wh5 != null» «compile(f.wh5)» «ENDIF»
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
       «FOR x:f.fundec»«compile(x)»;
       «ENDFOR»
       /* end WithPart */'''

    /* AddPart */
    def compile(AddPart f) '''
       /* AddPart */
       «FOR x:f.t» «compile(x)» «ENDFOR»
       /* end AddPart */'''

    /* AddStatements 
     * VariableDeclarationAssign
     * FunctionDefinition
     * t1= 'if' Expression
     * t13= 'then' FunctionDefinitionBlock
     * t14='else' FunctionDefinitionBlock
     * MacroDef
     * Import*/
    def CharSequence compile(AddStatements f) '''
       «IF f instanceof VariableDeclarationAssign»«
       compile(f as VariableDeclarationAssign)»«
       ENDIF»«IF f instanceof FunctionDefinition»«
       compile(f as FunctionDefinition)»«
       ENDIF»«IF f instanceof MacroDef» «
       compile(f as MacroDef)» «ENDIF»«
        IF f.t1 != null»if(«compile(f.t1)»)«ENDIF»«
        IF f.t13 != null»then«compile(f.t13)»«ENDIF»«
        IF f.t15 != null»else«compile(f.t15)»«ENDIF»
        '''

    /* FunctionDefinition 
     * par3=FunctionSignature
     * par4=TypeExpression
     * par5=Statement
     */  
    def compile(FunctionDefinition f)
       '''
       public «IF f.par4 != null»«compile(f.par4)» «ENDIF
       »«IF f.par3 != null»«compile(f.par3)»«ENDIF
       »«IF f.par5 != null»«compile(f.par5)»«ENDIF»

       '''

    /* FunctionDefinitionBlock
     * fnDecBk += FunctionDefinition
     * vars+=VariableDeclarationAssign
     * 'if' t1+=Expression
     * 'then' t13+=FunctionDefinitionBlock    	
     * 'else' t14+=FunctionDefinitionBlock*/
    def CharSequence compile(FunctionDefinitionBlock f)
       '''{
       	«FOR x:f.fnDecBk»,«compile(x)»«ENDFOR
       	»«FOR x:f.vars»,«compile(x)»«ENDFOR»«
       	IF f.t1 != null»if «FOR x:f.t1»,«compile(x)»«ENDFOR»then «
       	  FOR x:f.t13»,«compile(x)»«ENDFOR»else «
       	  FOR x:f.t14»,«compile(x)»«ENDFOR»«
       	ENDIF»} 
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

    /* VariableDeclaration 
    ('if' t1=Expression 'then')?
	(v1=TypeWithName | v2=VariableDeclarationBlock)
     * */
    def compile(VariableDeclaration f) 
        '''«IF f.t1 != null»if «
        compile(f.t1)» then «ENDIF»«IF f.v1 != null» «
        compile(f.v1)»«ENDIF»«IF f.v2 != null» «
        compile(f.v2)»«ENDIF»'''

    /* VariableDeclarationBlock 
       vardecbr=LBRACE NL*
      (vardecBlk += VariableDeclaration (NL|SEMICOLON)+)*
      RBRACE	
     */
    def compile(VariableDeclarationBlock f) 
        '''«FOR x:f.vardecBlk»«x»;
        «ENDFOR»'''

    /* TypeWithName 
     * (
	  (varName=ID | varNameSt=STRING) (COMMA varName2=ID)?
	  COLON
	)? typ=TypeExpression*/
      def compile(TypeWithName f) 
        '''«IF f.typ != null»«
          IF f.typ.t2 != null»«
            IF f.varName != null» «f.varName» «ENDIF»«
            compile(f.typ.t3)» «
            IF f.varNameSt != null» «f.varNameSt» «ENDIF»«
            compile(f.typ.t2)»«
          ELSE»«
            IF f.typ.t2 != null»«compile(f.typ)»«ENDIF»«
            IF f.varName != null» «f.varName»«ENDIF»«
            IF f.varNameSt != null» «f.varNameSt»«ENDIF»«
            IF f.varName2 != null»,«f.varName2»«ENDIF»«
          ENDIF»«
        ENDIF»'''

    /* VariableTyped */
    def compile(VariableTyped f) 
        '''«IF f.typ != null»«
        compile(f.typ)»«ENDIF»«IF f.varName != null» «
        f.varName»«ENDIF»'''

    /* VariableDeclarationAssign
     * varName=ID // name of variable
     * t12=ID
     * typ=TypeExpression
     * t4=BECOMES Expression*/
    def compile(VariableDeclarationAssign f) 
        '''«IF f.typ != null»«
        compile(f.typ)»«
        ENDIF
        »«IF f.varName != null» «f.varName»«ENDIF»«
        FOR x:f.t12»,«x»«ENDFOR»«
        IF f.t4 != null»:=«compile(f.t4)»«ENDIF»;'''
  
    /* FreeVariable */
    def compile(FreeVariable f) 
        ''' free '''

    /* LocalVariable */
    def compile(LocalVariable f) 
        ''' local'''
        
    /* TypeExpression
     * (t2=TypeArguments -> t3=TypeResult)
     * | TypePrimaryExpression
     */
    def CharSequence compile(TypeExpression f) 
      '''«
      IF f.t2 != null» «compile(f.t2)»->«
      compile(f.t3)»«ENDIF»«
      IF f instanceof TypePrimaryExpression»«
      compile(f as TypePrimaryExpression)»«ENDIF»«
      IF f.t92 != null»«compile(f.t92)» -> «
      compile(f.t93)»«ENDIF»
      //IF f instanceof TypePrimaryExpression2»
      //compile(f as TypePrimaryExpression2)»
      '''

/* TypeParameterList
 * we use a type parameter list for parameters of category, package or domains
 * Parameter list may be empty '()'.
 * in this case parameters may be just ID or they may be nameID:typeID
 * 
 * examples are:
 * ()
 * (String)
 * (s:String)
 * (String,Integer)
 * (s:String,i:Integer)
 *
 * tyname=LPAREN par=ID? 
 * (COLON par21=TypeExpression)?
 * (COMMA par2 += ID (COLON par22+=TypeExpression)?)* RPAREN;
 */
    def compile(TypeParameterList f) 
        '''(«
      IF f.par != null»«f.par»«ENDIF»«
      IF f.par21 != null»:«f.par21»«ENDIF»«
      FOR x:f.par2 »,«x» «ENDFOR»«
      IF f.par22 != null»:«ENDIF»«
      FOR x:f.par22 »,«x» «ENDFOR»)'''

    /* TupleDefinition 
     * t4= first TypeExpression
     * t25 = following TypeExpressions)
     */
    def compile(TupleDefinition f) 
      '''(«
      IF f.t4 != null»«f.t4»«ENDIF»«
      FOR x:f.t25 »,«x» «ENDFOR»)'''

    /* TypeArguments 
     *   t=TypeLiteral |
  t2=PERCENT |
  t3='Type' |
  // usually, but not always type arguments are in parenthesis, and empty
  // parenthesis are allowed
  b1 ?= LPAREN ((ID COLON)? t4=TypeExpression)? ( COMMA (ID COLON)? t16 +=TypeExpression)* RPAREN |
  t5='Record' LPAREN t6=TypeExpression
               (COLON t22+=TypeExpression)?
               (COMMA t21+=TypeExpression (COLON t23+=TypeExpression)?)*
                RPAREN |
  t9='Union' LPAREN t10=TypeExpression
              (COLON t25+=TypeExpression)?
              (COMMA t24+=TypeExpression (COLON t26+=TypeExpression)?)*
              RPAREN |
  t11='Join' LPAREN t12=TypeExpression (COMMA t13+=TypeExpression)* RPAREN |
  t15=TypeNameOrFunctionCall
     */  
    def compile(TypeArguments f) 
        '''«IF f.t != null»«compile(f.t)»«
        ENDIF»«IF f.t2 != null»«f.t2» «ENDIF»«
        IF f.t3 != null»«f.t3»«ENDIF»«
        IF f.t4 != null»(«compile(f.t4)»«
          FOR x:f.t16 »,«compile(x)» «ENDFOR»)«ENDIF»«
        IF f.t6 != null»Record(«compile(f.t6)»«
          FOR x:f.t22 »,«compile(x)» «ENDFOR»)«ENDIF»«
        IF f.t10 != null»Union(«compile(f.t10)»«
          FOR x:f.t25 »,«compile(x)» «ENDFOR»)«ENDIF»«
        IF f.t12 != null»Join(«compile(f.t12)»«
          FOR x:f.t13 »,«compile(x)» «ENDFOR»)«ENDIF»«
        IF f.t15 != null»«compile(f.t15)» «ENDIF»'''
  
  /* TypeResult
   *   t=TypeLiteral |
  t2=PERCENT |
  tyname='Type' |
  tyname='Record' LPAREN t7=TypeExpression
               (COLON t8+=TypeExpression)?
               (COMMA t21+=TypeExpression (COLON t23+=TypeExpression)?)*
                RPAREN |
  tyname='Union' LPAREN t10=TypeExpression
              (COLON t11+=TypeExpression)?
              (COMMA t24+=TypeExpression (COLON t26+=TypeExpression)?)*
              RPAREN |
  tyname='Join' LPAREN t12=TypeExpression (COMMA t13+=TypeExpression)* RPAREN |
  t15=TypeNameOrFunctionCall
   */
    def compile(TypeResult f) 
      '''«IF f.t != null»«compile(f.t)»«ENDIF»«
      IF f.t2 != null»Rep«ENDIF»«
      IF f.tyname != null»«f.tyname» «ENDIF»«
      IF f.t7 != null»Record(«compile(f.t7)»)«
      ENDIF»«IF f.t10 != null»Union(«
      compile(f.t10)»)«ENDIF»«
      IF f.t12 != null»Join(«compile(f.t12)»)«
      ENDIF»«
      IF f.t15 != null»«compile(f.t15)»«ENDIF»'''

    /* TypePrimaryExpression 
     *  TypeLiteral
 | ({TypePrimaryExpression}t32=PERCENT)
 | ({TypePrimaryExpression}tyname='Type') // 'Type' is top of the category hierarchy
 | ({TypePrimaryExpression}tyname='Lisp') // 'Lisp' is used for native lisp function calls such as Say$Lisp
 | ({TypePrimaryExpression}LPAREN t5=TypeExpression RPAREN)
 | ({TypePrimaryExpression}tyname='Record' LPAREN t7=TypeExpression
               (COLON t8+=TypeExpression)?
               (COMMA t21+=TypeExpression (COLON t23+=TypeExpression)?)*
                RPAREN)
 | ({TypePrimaryExpression}tyname='Union' LPAREN t10=TypeExpression
              (COLON t11+=TypeExpression)?
              (COMMA t24+=TypeExpression (COLON t26+=TypeExpression)?)*
              RPAREN)
 | ({TypePrimaryExpression}tyname='Join'
    LPAREN t13=TypeExpression (COMMA t14+=TypeExpression)* RPAREN)
 | TypeNameOrFunctionCall
 | => TupleDefinition
 */
    def CharSequence compile(TypePrimaryExpression f) 
      '''«IF f.t32 != null»Rep «ENDIF»«
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
        compile(f as TypeNameOrFunctionCall)»«ENDIF»«
      IF f instanceof TupleDefinition»«
        compile(f as TupleDefinition)»«ENDIF»'''

    /* TypePrimaryExpression2
    def CharSequence compile(TypePrimaryExpression2 f) 
      «IF f.xt32 != null»Rep «ENDIF»«
      IF f.xtyname != null»«f.xtyname» «ENDIF»«
      IF f.xt5 != null»(«compile(f.xt5)»)«ENDIF»«
      IF f.xt7 != null»(«compile(f.xt7)»)«
       FOR x:f.xt8»(«compile(x)»)«ENDFOR»«
       FOR x:f.xt21»(«compile(x)»)«ENDFOR»«
       FOR x:f.xt23»(«compile(x)»)«ENDFOR»«ENDIF»«
      IF f.xt10 != null»(«f.xt10»)«
       FOR x:f.xt11»(«compile(x)»)«ENDFOR»«
       FOR x:f.xt24»(«compile(x)»)«ENDFOR»«
       FOR x:f.xt26»(«compile(x)»)«ENDFOR»«ENDIF»«
      IF f.xt13 != null»(«f.xt13»)«
       FOR x:f.xt14»(«compile(x)»)«ENDFOR»«ENDIF»«
      IF f instanceof TypeLiteral»«
        compile(f as TypeLiteral)»«ENDIF»«
      IF f instanceof TypeNameOrFunctionCall2»«
        compile(f as TypeNameOrFunctionCall2)»«ENDIF»«
      IF f instanceof TupleDefinition»«
        compile(f as TupleDefinition)»«ENDIF»*/
              
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
        IF f.t6 != null»(«compile(f.t6)»)«ENDIF»«
        IF f.w!= null»(«f.w»)«ENDIF»'''

     def compile(TypeNameOrFunctionCall2 f)
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
      '''«IF f != null &&
             (f.t22 == null) &&
             (f.t34 == null) &&
             (f.t35== null)» «f.t1»«ENDIF»«
      IF f.t22 != null»"«f.t22»"«ENDIF»«
      IF f.t34 != null»«compile(f.t34)»«ENDIF»«
      IF f.t35 != null»«compile(f.t35)»«ENDIF»'''

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
    def CharSequence compile(Statement f) 
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
        «ENDFOR»}'''
  
    /* StatementExpression 
     * t=ConditionExpression 
     * t5 =BECOMES block
     * t4 =EXIT Statement
     */
    def compile(StatementExpression f) 
        '''«IF f.t != null»«compile(f.t)»«ENDIF»«
        IF f.t5 != null»=«compile(f.t5)»«ENDIF»«
        IF f.t4 != null»=>«compile(f.t4)»«ENDIF»;'''

    /* ForStatement */
    def compile(ForStatement f) 
        '''for «f.stname» in «compile(f.t1)
        »repeat «compile(f.s1)»'''
        
    /* WhileStatement */
    def compile(WhileStatement f)
        '''while «compile(f.t2)
        »repeat «compile(f.s1)»'''
  
    /* DoStatement */
    def compile(DoStatement f)
        '''do «compile(f.s1)
        »while «compile(f.t2)»'''

    /* IterateStatement */
    def compile(IterateStatement f) 
        '''iterate;'''

    /* BreakStatement */
    def compile(BreakStatement f) 
        '''break;'''

    /* ReturnStatement */
    def compile(ReturnStatement f) 
        '''«IF f.t2 != null»return «compile(f.t2)»;«ENDIF»'''
        
    /* RepeatStatement */
    def compile(RepeatStatement f) 
        '''«IF f.s1 != null»repeat «compile(f.s1)»;«ENDIF»'''
        
    /* IfStatement 
     * t2='if' Expression
     * s1='then' Statement
     * s2='else' s2=Statement)?
     * s11 and s12 are form of s1 and s2 in brace*/
    def compile(IfStatement f) 
      '''«IF f.t2 != null»if («compile(f.t2)»)«IF f.s1 != null»«
        compile(f.s1)»«
        ENDIF»«IF f.s2 != null»else «compile(f.s2)»«
        ENDIF»«IF f.s11 != null»«compile(f.s11)»«
        ENDIF»«IF f.s12 != null»else «compile(f.s12)»«
        ENDIF»«ENDIF»'''

    /* IfElseStatement */
    def compile(IfElseStatement f) 
      '''«IF f.s2 != null»else «compile(f.s2)»«
        ENDIF»'''

    /* Expr */
    def CharSequence compile(Expr f)
        '''«IF f instanceof ConditionExpression»«compile(f as ConditionExpression)»«ENDIF»«
        IF f instanceof AndExpression»«compile(f as AndExpression)»«ENDIF»« 
        IF f instanceof OrExpression»«compile(f as OrExpression)»«ENDIF»«
        IF f instanceof ExitExpression»«compile(f as ExitExpression)»«ENDIF»«
        IF f instanceof AssignExpression»«compile(f as AssignExpression)»«ENDIF»«
        IF f instanceof InnerProdExpression»«compile(f as InnerProdExpression)»«ENDIF»«
        IF f instanceof OuterProdExpression»«compile(f as OuterProdExpression)»«ENDIF»«
        IF f instanceof HasExpression»«compile(f as HasExpression)»«ENDIF»«
        IF f instanceof CaseExpression»«compile(f as CaseExpression)»«ENDIF»«
        IF f instanceof EqualityExpression»«compile(f as EqualityExpression)»«ENDIF»«
        IF f instanceof RelationalExpression»«compile(f as RelationalExpression)»«ENDIF»«
        IF f instanceof IsExpression»«compile(f as IsExpression)»«ENDIF»«
        IF f instanceof SegmentExpression»«compile(f as SegmentExpression)»«ENDIF»«
        IF f instanceof AdditiveExpression»«compile(f as AdditiveExpression)»«ENDIF»«
        IF f instanceof ExquoExpression»«compile(f as ExquoExpression)»«ENDIF»«
        IF f instanceof DivisionExpression»«compile(f as DivisionExpression)»«ENDIF»«
        IF f instanceof QuoExpression»«compile(f as QuoExpression)»«ENDIF»«
        IF f instanceof ModExpression»«compile(f as ModExpression)»«ENDIF»«
        IF f instanceof RemExpression»«compile(f as RemExpression)»«ENDIF»«
        IF f instanceof MapDefinition»«compile(f as MapDefinition)»«ENDIF»«
        IF f instanceof MultiplicativeExpression»«compile(f as MultiplicativeExpression)»«ENDIF»«
        IF f instanceof ExponentExpression»«compile(f as ExponentExpression)»«ENDIF»«
        IF f instanceof PretendExpression»«compile(f as PretendExpression)»«ENDIF»«
        IF f instanceof HintTypeExpression»«compile(f as HintTypeExpression)»«ENDIF»«
        IF f instanceof CoerceExpression»«compile(f as CoerceExpression)»«ENDIF»«
        IF f instanceof EltExpression»«compile(f as EltExpression)»«ENDIF»«
        IF f instanceof ExplicitTypeExpression»«compile(f as ExplicitTypeExpression)»«ENDIF»«
        IF f instanceof UnaryExpression»«compile(f as UnaryExpression)»«ENDIF»«
        IF f instanceof PrimaryPrefix»«compile(f as PrimaryPrefix)»«ENDIF»«
        IF f.ifpred != null»if «compile(f.ifpred)» «ENDIF»«
        IF f.thenexp != null»then «compile(f.thenexp)» «ENDIF»«
        IF f.elseexp != null»else «compile(f.elseexp)» «ENDIF»'''
  
    def compile(ConditionExpression f)
        '''«compile(f.left)»«
        IF f.right != null»«f.op»«compile(f.right)»«ENDIF»'''
  
    def compile(InnerProdExpression f)
        '''«IF f.left != null»«compile(f.left)»«ENDIF»«
        IF f.right != null»wedge«compile(f.right)»«ENDIF»'''
  
    def compile(OuterProdExpression f)
        '''«IF f.left != null»«compile(f.left)»«ENDIF»«
        IF f.right != null»hat«compile(f.right)»«ENDIF»'''
  
    def compile(AndExpression f)
        '''«IF f.left != null»«compile(f.left)»«ENDIF»«
        IF f.right != null»&«compile(f.right)»«ENDIF»'''
  
    /* AssignExpression
     * 
     */
    def compile(AssignExpression f)
        '''«IF f.left != null»«compile(f.left)»«ENDIF»«
        IF f.right != null»=«compile(f.right)»«ENDIF»'''
  
    def compile(ExitExpression f)
        '''«IF f.left != null»«compile(f.left)»«ENDIF»«
        IF f.right != null»«f.op»«compile(f.right)»«ENDIF»'''

    /* MapDefinition */
    def compile(MapDefinition f) 
        '''«IF f.left != null»«compile(f.left)»«ENDIF»«
        IF f.right != null»«f.op»«compile(f.right)»«ENDIF»'''

    def compile(OrExpression f)
        '''«IF f.left != null»«compile(f.left)»«ENDIF»«
        IF f.right != null»|«compile(f.right)»«ENDIF»'''
  
    def compile(HasExpression f)
        '''«IF f.left != null»«compile(f.left)»«ENDIF»«
        IF f.rightType != null»«f.op»«compile(f.rightType)»«ENDIF»'''
  
    def compile(CaseExpression f)
        '''«IF f.left != null»«compile(f.left)»«ENDIF»«
        IF f.right != null»«f.op» «compile(f.right)»«ENDIF»'''

    def compile(EqualityExpression f)
        '''«IF f.left != null»«compile(f.left)»«ENDIF»«
        IF f.right != null»«f.op» «compile(f.right)»«ENDIF»'''
  
    /* RelationalExpression */
    def compile(RelationalExpression f)
        '''«IF f.left != null»«compile(f.left)»«ENDIF»«
        IF f.right != null»«f.op»«compile(f.right)»«ENDIF»'''

    def compile(IsExpression f)
        '''«compile(f.left)»«
        IF f.rightType != null»«f.op»«compile(f.rightType)»«ENDIF»'''
  
    def compile(SegmentExpression f)
        '''«IF f.left != null»«compile(f.left)»«ENDIF»«
        IF f.right != null»«f.op»«compile(f.right)»«ENDIF»'''
  
    def compile(AdditiveExpression f)
        '''«IF f.left != null»«compile(f.left)»«ENDIF»«
        IF f.right != null»«f.op»«compile(f.right)»«ENDIF»'''
  
     def compile(ExquoExpression f)
        '''«IF f.left != null»«compile(f.left)»«ENDIF»«
        IF f.right != null»«f.op»«compile(f.right)»«ENDIF»'''
  
    def compile(DivisionExpression f)
        '''«IF f.left != null»«compile(f.left)»«ENDIF»«
        IF f.right != null»«f.op»«compile(f.right)»«ENDIF»'''
  
    def compile(QuoExpression f)
        '''«IF f.left != null»«compile(f.left)»«ENDIF»«
        IF f.right != null»«f.op» «compile(f.right)»«ENDIF»'''
  
    def compile(ModExpression f)
        '''«IF f.left != null»«compile(f.left)»«ENDIF»«
        IF f.right != null»«f.op» «compile(f.right)»«ENDIF»'''
  
    def compile(RemExpression f)
        '''«IF f.left != null»«compile(f.left)»«ENDIF»«
        IF f.right != null»«f.op»«compile(f.right)»«ENDIF»'''
  
    def compile(MultiplicativeExpression f)
        '''«IF f.left != null»«compile(f.left)»«ENDIF»«
        IF f.right != null»«f.op»«compile(f.right)»«ENDIF»'''
  
    def compile(ExponentExpression f)
        '''«IF f.left != null»«compile(f.left)»«ENDIF»«
        IF f.right != null»«f.op»«compile(f.right)»«ENDIF»'''
  
   def compile(PretendExpression f)
        '''«IF f.left != null»«compile(f.left)»«ENDIF»«
        IF f.rightType != null»«f.op»«compile(f.rightType)»«ENDIF»'''
  
   def compile(HintTypeExpression f)
        '''«IF f.left != null»«compile(f.left)»«ENDIF»«
        IF f.rightType != null»«f.op»«compile(f.rightType)»«ENDIF»'''

   def compile(CoerceExpression f)
        '''«IF f.left != null»«compile(f.left)»«ENDIF»«
        IF f.rightType != null»«f.op»«compile(f.rightType)»«ENDIF»'''
  
    /* EltExpression */  
    def compile(EltExpression f)
        '''«IF f.left != null»«compile(f.left)»«ENDIF»«
        IF f.right != null»«f.op»«compile(f.right)»«ENDIF»'''
    
    def compile(ExplicitTypeExpression f)
        '''«IF f.left != null»«compile(f.left)»«ENDIF»«
        IF f.rightType != null»«f.op»«compile(f.rightType)»«ENDIF»'''
  
     def compile(UnaryExpression f)
        '''«IF f.expr != null»«f.uop»«compile(f.expr)»«
        ENDIF»'''
  
 /*   def compile(UnaryExpressionHash f)
        '''«IF f.expr != null»«f.uop»«compile(f.expr)» «
        ENDIF»'''*/
  
//    def compile(PrimaryExpression f) '''
//        '''


    /* PrimaryPrefix 
     *  Literal
     *  LPAREN t4=Expression (COMMA t25+=Expression)* RPAREN =>(COLON rightType3 =TypeExpression)?
     *  t7=NameOrFunctionCall*/
    def compile(PrimaryPrefix f)
      '''«IF f instanceof Literal»«compile(f as Literal)»«ENDIF»«
        IF f.t4 != null»(«compile(f.t4)»)«ENDIF»«
        IF f.t7 != null»«compile(f.t7)»«ENDIF»'''

    /* NameOrFunctionCall
     * 
     * fnname=ID (=> lsp=DOLAR 'Lisp't2=TypeExpression
     * LPAREN t4=Expression? (COMMA t5+=Expression)* RPAREN //(COLON rightType2 =TypeExpression)?
     * (LPAREN t14+=Statement? (COMMA t15+=Expression)* RPAREN)*
     *  t6=PrimaryExpression
     * ((COMMA ID)* COLON rightType2 =TypeExpression
     */
    def compile(NameOrFunctionCall f) 
        '''«IF f.fnname != null»«f.fnname»«ENDIF»«
        IF f.lsp != null»$Lisp «ENDIF»«
        IF f.t4 != null»(«compile(f.t4)»«
        FOR x:f.t5 »,«compile(x)»«ENDFOR»)«ENDIF»«
        IF f.t6 != null»«compile(f.t6)»«ENDIF»'''
  
    /* Literal 
     * value=INT
     * t2=STRING (=> e1=NameOrFunctionCall =>(t31+=STRING (=> e4+=NameOrFunctionCall)?)*)?
     * t3=FloatLiteral // conflicts with use of '.' for elt
     * ListLiteral
     * CharacterLiteral
     * BooleanLiteral*/
    def compile(Literal f) 
        '''«IF !(f instanceof ListLiteral) &&
               !(f instanceof CharacterLiteral) &&
               !(f instanceof BooleanLiteral) &&
               (f.t2 == null)»«f.value»«
        ENDIF»«
        IF f.t2 != null»"«f.t2»"«ENDIF»«
        IF f instanceof ListLiteral»«compile(f as ListLiteral)»«ENDIF»«
        IF f instanceof CharacterLiteral»«compile(f as CharacterLiteral)»«ENDIF»«
        IF f instanceof BooleanLiteral»«compile(f as BooleanLiteral)»«ENDIF»'''

    /* CharacterLiteral */
    def compile(CharacterLiteral f) 
        '''«IF f.c1 != null»«f.c1»«ENDIF»'''

    /* BooleanLiteral */
    def compile(BooleanLiteral f) 
        '''«f.litname»'''
  
    /* ListLiteral */
    def compile(ListLiteral f) 
        '''[«IF f.l2 != null»«
        compile(f.l2)»«ENDIF»«
        FOR x:f.t3 »,«compile(x)»«ENDFOR»«
        FOR x:f.t14 »for «compile(x)»in «ENDFOR»«
        FOR x:f.l5 »«compile(x)» «ENDFOR»]'''
}

