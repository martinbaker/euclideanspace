package com.euclideanspace.spad.validation;
import org.eclipse.xtext.validation.Check;
import com.euclideanspace.spad.editor.EditorPackage;
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

public class EditorJavaValidator extends AbstractEditorJavaValidator {

	/**
	 * checks if given id is valid, that is it must,
	 * Not be null.
	 * Not be empty.
	 * Start with alpha character.
	 * @param id string to check
	 * @return null or error message
	 */
	public String isValidID(String id){
		if (id==null) return "is null";
		if (id.length()<1) return "is empty";
		if (!Character.isAlphabetic(id.charAt(0))) return "does not start with alpha character";
		return null;
	}
	
	@Check
	public void checkDomainDef(DomainDef domainDef) {
		String e1 = isValidID(domainDef.getLongname5());
		if (e1 != null) {
			error("long name "+e1, EditorPackage.Literals.DOMAIN_DEF__LONGNAME5);
			return;
		}
		String e2 = isValidID(domainDef.getLongname6());
		if (e2 != null) {
			error("domain name "+e2, EditorPackage.Literals.DOMAIN_DEF__LONGNAME6);
			return;
		}
		if (!domainDef.getLongname5().equals(domainDef.getLongname6())) {
			error("domain name does not equal long name", EditorPackage.Literals.DOMAIN_DEF__LONGNAME6);
			return;
		}
		String shortname = domainDef.getShortname5();
		String e3 = isValidID(shortname);
		if (e3 != null) {
			error("short name "+e3, EditorPackage.Literals.DOMAIN_DEF__SHORTNAME5);
			return;
		}
		for (Character c: shortname.toCharArray()) {
		  if (!Character.isUpperCase(c)) {
			warning("Short name usually uppercase", EditorPackage.Literals.DOMAIN_DEF__SHORTNAME5);
			return;
		  }
		}
	}

	@Check
	public void checkCategoryDef(CategoryDef categoryDef) {
		String e1 = isValidID(categoryDef.getLongname());
		if (e1 != null) {
			error("long name "+e1, EditorPackage.Literals.CATEGORY_DEF__LONGNAME);
			return;
		}
		String e2 = isValidID(categoryDef.getLongname2());
		if (e2 != null) {
			error("domain name "+e2, EditorPackage.Literals.CATEGORY_DEF__LONGNAME2);
			return;
		}
		if (!categoryDef.getLongname().equals(categoryDef.getLongname2())) {
			error("domain name does not equal long name", EditorPackage.Literals.CATEGORY_DEF__LONGNAME2);
			return;
		}
		String shortname = categoryDef.getShortname();
		String e3 = isValidID(shortname);
		if (e3 != null) {
			error("short name "+e3, EditorPackage.Literals.CATEGORY_DEF__SHORTNAME);
			return;
		}
		for (Character c: shortname.toCharArray()) {
		  if (!Character.isUpperCase(c)) {
			warning("Short name usually uppercase", EditorPackage.Literals.CATEGORY_DEF__SHORTNAME);
			return;
		  }
		}
	}

	@Check
	public void checkPackageDef(PackageDef packageDef) {
		String e1 = isValidID(packageDef.getLongname());
		if (e1 != null) {
			error("long name "+e1, EditorPackage.Literals.PACKAGE_DEF__LONGNAME);
			return;
		}
		String e2 = isValidID(packageDef.getLongname2());
		if (e2 != null) {
			error("domain name "+e2, EditorPackage.Literals.PACKAGE_DEF__LONGNAME2);
			return;
		}
		if (!packageDef.getLongname().equals(packageDef.getLongname2())) {
			error("domain name does not equal long name", EditorPackage.Literals.PACKAGE_DEF__LONGNAME2);
			return;
		}
		String shortname = packageDef.getShortname();
		String e3 = isValidID(shortname);
		if (e3 != null) {
			error("short name "+e3, EditorPackage.Literals.PACKAGE_DEF__SHORTNAME);
			return;
		}
		for (Character c: shortname.toCharArray()) {
		  if (!Character.isUpperCase(c)) {
			warning("Short name usually uppercase", EditorPackage.Literals.PACKAGE_DEF__SHORTNAME);
			return;
		  }
		}
	}

	@Check
	public void checkWherePart(WherePart wherePart) {

	}

}
