package jplasmax10.visitor;

import java.util.*;

import util.symboltable.Constants;
import util.symboltable.SymbolTable;
import util.symboltable.SymbolTableClassEntry;
import util.symboltable.SymbolTableMethodEntry;

import jplasmax10.syntaxtree.*;

public class ClassEnumeratorVisitor implements GJVisitor<String, String> {
	//
	// Auto class visitors--probably don't need to be overridden.
	//

	public SymbolTable symbolTable;

	public ClassEnumeratorVisitor() {
		this.symbolTable = new SymbolTable();
	}

	public String visit(NodeList n, String argu) {
		String _ret = null;
		int _count = 0;
		for (Enumeration<Node> e = n.elements(); e.hasMoreElements();) {
			e.nextElement().accept(this, argu);
			_count++;
		}
		return _ret;
	}

	public String visit(NodeListOptional n, String argu) {
		if (n.present()) {
			String _ret = null;
			int _count = 0;
			for (Enumeration<Node> e = n.elements(); e.hasMoreElements();) {
				e.nextElement().accept(this, argu);
				_count++;
			}
			return _ret;
		} else
			return null;
	}

	public String visit(NodeOptional n, String argu) {
		if (n.present())
			return n.node.accept(this, argu);
		else
			return null;
	}

	public String visit(NodeSequence n, String argu) {
		String _ret = null;
		int _count = 0;
		for (Enumeration<Node> e = n.elements(); e.hasMoreElements();) {
			e.nextElement().accept(this, argu);
			_count++;
		}
		return _ret;
	}

	public String visit(NodeToken n, String argu) {
		return n.tokenImage;
	}

	//
	// User-generated visitor methods below
	//

	/**
	 * mainClass -> MainClass() programClass -> ProgramClass() nodeListOptional
	 * -> ( TopLevelDeclaration() )* nodeToken -> <EOF>
	 */
	public String visit(File n, String argu) {
		String _ret = null;
		n.mainClass.accept(this, argu);
		n.programClass.accept(this, argu);
		n.nodeListOptional.accept(this, argu);
		n.nodeToken.accept(this, argu);
		return _ret;
	}

	/**
	 * nodeToken -> "public" nodeToken1 -> "class" identifier String ->
	 * Identifier() nodeToken2 -> "{" nodeToken3 -> "public" nodeToken4 ->
	 * "static" nodeToken5 -> "void" nodeToken6 -> "main" nodeToken7 -> "("
	 * nodeToken8 -> "String" nodeToken9 -> "[" nodeToken10 -> "]" identifier1
	 * -> Identifier() nodeToken11 -> ")" nodeToken12 -> "{" identifier2 ->
	 * Identifier() nodeToken13 -> "." identifier3 -> Identifier() nodeToken14
	 * -> "(" nodeToken15 -> ")" nodeToken16 -> ";" nodeToken17 -> "}"
	 * nodeToken18 -> "}"
	 */
	public String visit(MainClass n, String argu) {
		String _ret = null;
		String className = n.identifier.accept(this, argu);
		SymbolTableClassEntry stce = new SymbolTableClassEntry(className,
				Constants.ClassType.REF);
		symbolTable.putClassEntry(className, stce);
		return _ret;
	}

	/**
	 * nodeToken -> "class" identifier String -> Identifier() nodeToken1 -> "{"
	 * nodeListOptional -> ( ConstantDeclaration() )* nodeListOptional1 -> (
	 * StaticMethodDeclaration() )* nodeToken2 -> "}"
	 */
	public String visit(ProgramClass n, String argu) {
		String _ret = null;
		String className = n.identifier.accept(this, argu);
		SymbolTableClassEntry stce = new SymbolTableClassEntry(className,
				Constants.ClassType.REF);
		symbolTable.putClassEntry(className, stce);
		return _ret;
	}

	/**
	 * nodeChoice -> ClassDeclaration() | ValueDeclaration()
	 */
	public String visit(TopLevelDeclaration n, String argu) {
		String _ret = null;
		n.nodeChoice.accept(this, argu);
		return _ret;
	}

	/**
	 * nodeToken -> "class" identifier String -> Identifier() nodeToken1 -> "{"
	 * nodeListOptional -> ( InitializableConstantDeclaration() )*
	 * nodeListOptional1 -> ( UpdatableFieldDeclaration() )* nodeListOptional2
	 * -> ( ConstructorDeclaration() )* nodeListOptional3 -> (
	 * MethodDeclaration() )* nodeToken2 -> "}"
	 */
	public String visit(ClassDeclaration n, String argu) {
		String _ret = null;
		String className = n.identifier.accept(this, argu);
		SymbolTableClassEntry stce = new SymbolTableClassEntry(className,
				Constants.ClassType.REF);
		symbolTable.putClassEntry(className, stce);
		return _ret;
	}

	/**
	 * nodeToken -> "value" identifier String -> Identifier() nodeToken1 -> "{"
	 * nodeListOptional -> ( InitializableConstantDeclaration() )*
	 * nodeListOptional1 -> ( ConstructorDeclaration() )* nodeListOptional2 -> (
	 * MethodDeclaration() )* nodeToken2 -> "}"
	 */
	public String visit(ValueDeclaration n, String argu) {
		String _ret = null;
		String className = n.identifier.accept(this, argu);
		SymbolTableClassEntry stce = new SymbolTableClassEntry(className,
				Constants.ClassType.VALUE);
		symbolTable.putClassEntry(className, stce);
		return _ret;
	}

	/**
	 * nodeToken -> <IDENTIFIER>
	 */
	public String visit(Identifier n, String argu) {
		String _ret = null;
		_ret = n.nodeToken.accept(this, argu);
		return _ret;
	}

	@Override
	public String visit(ConstructorDeclaration n, String argu) {
		return null;
	}

	@Override
	public String visit(ConstantDeclaration n, String argu) {
		return null;
	}

	@Override
	public String visit(InitializableConstantDeclaration n, String argu) {
		return null;
	}

	@Override
	public String visit(UpdatableFieldDeclaration n, String argu) {
		return null;
	}

	@Override
	public String visit(StaticMethodDeclaration n, String argu) {
		return null;
	}

	@Override
	public String visit(MethodDeclaration n, String argu) {
		return null;
	}

	@Override
	public String visit(FormalParameterList n, String argu) {
		return null;
	}

	@Override
	public String visit(FinalFormalParameter n, String argu) {
		return null;
	}

	@Override
	public String visit(FormalParameterRest n, String argu) {
		return null;
	}

	@Override
	public String visit(ReturnType n, String argu) {
		return null;
	}

	@Override
	public String visit(VoidType n, String argu) {
		return null;
	}

	@Override
	public String visit(Type n, String argu) {
		return null;
	}

	@Override
	public String visit(UpdatableArrayType n, String argu) {
		return null;
	}

	@Override
	public String visit(NonArrayType n, String argu) {
		return null;
	}

	@Override
	public String visit(BooleanType n, String argu) {
		return null;
	}

	@Override
	public String visit(ByteType n, String argu) {
		return null;
	}

	@Override
	public String visit(ShortType n, String argu) {
		return null;
	}

	@Override
	public String visit(IntegerType n, String argu) {
		return null;
	}

	@Override
	public String visit(LongType n, String argu) {
		return null;
	}

	@Override
	public String visit(DoubleType n, String argu) {
		return null;
	}

	@Override
	public String visit(StringType n, String argu) {
		return null;
	}

	@Override
	public String visit(PlaceType n, String argu) {
		return null;
	}

	@Override
	public String visit(ClassNameType n, String argu) {
		return null;
	}

	@Override
	public String visit(Block n, String argu) {
		return null;
	}

	@Override
	public String visit(Statement n, String argu) {
		return null;
	}

	@Override
	public String visit(Assignment n, String argu) {
		return null;
	}

	@Override
	public String visit(ArrayAssignment n, String argu) {
		return null;
	}

	@Override
	public String visit(FieldAssignment n, String argu) {
		return null;
	}

	@Override
	public String visit(ThisFieldAssignment n, String argu) {
		return null;
	}

	@Override
	public String visit(AsyncStatement n, String argu) {
		return null;
	}

	@Override
	public String visit(BreakStatement n, String argu) {
		return null;
	}

	@Override
	public String visit(ContinueStatement n, String argu) {
		return null;
	}

	@Override
	public String visit(DoStatement n, String argu) {
		return null;
	}

	@Override
	public String visit(FinishStatement n, String argu) {
		return null;
	}

	@Override
	public String visit(IfStatement n, String argu) {
		return null;
	}

	@Override
	public String visit(ElseClause n, String argu) {
		return null;
	}

	@Override
	public String visit(LoopStatement n, String argu) {
		return null;
	}

	@Override
	public String visit(IdentifierList n, String argu) {
		return null;
	}

	@Override
	public String visit(IdentifierRest n, String argu) {
		return null;
	}

	@Override
	public String visit(MethodCallStatement n, String argu) {
		return null;
	}

	@Override
	public String visit(MethodCallStatementInConstructor n, String argu) {
		return null;
	}

	@Override
	public String visit(PrintlnStatement n, String argu) {
		return null;
	}

	@Override
	public String visit(PrintStatement n, String argu) {
		return null;
	}

	@Override
	public String visit(PrintErrorStatement n, String argu) {
		return null;
	}

	@Override
	public String visit(ReturnStatement n, String argu) {
		return null;
	}

	@Override
	public String visit(SwitchStatement n, String argu) {
		return null;
	}

	@Override
	public String visit(SwitchEntry n, String argu) {
		return null;
	}

	@Override
	public String visit(SwitchLabel n, String argu) {
		return null;
	}

	@Override
	public String visit(Case n, String argu) {
		return null;
	}

	@Override
	public String visit(Default n, String argu) {
		return null;
	}

	@Override
	public String visit(ThrowStatement n, String argu) {
		return null;
	}

	@Override
	public String visit(WhileStatement n, String argu) {
		return null;
	}

	@Override
	public String visit(FinalVariableDeclaration n, String argu) {
		return null;
	}

	@Override
	public String visit(UpdatableVariableDeclaration n, String argu) {
		return null;
	}

	@Override
	public String visit(Expression n, String argu) {
		return null;
	}

	@Override
	public String visit(ExpressionInParentheses n, String argu) {
		return null;
	}

	@Override
	public String visit(ConditionalOrExpression n, String argu) {
		return null;
	}

	@Override
	public String visit(ConditionalAndExpression n, String argu) {
		return null;
	}

	@Override
	public String visit(InclusiveOrExpression n, String argu) {
		return null;
	}

	@Override
	public String visit(ExclusiveOrExpression n, String argu) {
		return null;
	}

	@Override
	public String visit(AndExpression n, String argu) {
		return null;
	}

	@Override
	public String visit(EqualsExpression n, String argu) {
		return null;
	}

	@Override
	public String visit(NonEqualsExpression n, String argu) {
		return null;
	}

	@Override
	public String visit(LessThanExpression n, String argu) {
		return null;
	}

	@Override
	public String visit(GreaterThanExpression n, String argu) {
		return null;
	}

	@Override
	public String visit(LessThanEqualExpression n, String argu) {
		return null;
	}

	@Override
	public String visit(GreaterThanEqualExpression n, String argu) {
		return null;
	}

	@Override
	public String visit(ShiftLeftExpression n, String argu) {
		return null;
	}

	@Override
	public String visit(ShiftRightExpression n, String argu) {
		return null;
	}

	@Override
	public String visit(ShiftRightUnsignedExpression n, String argu) {
		return null;
	}

	@Override
	public String visit(PlusExpression n, String argu) {
		return null;
	}

	@Override
	public String visit(MinusExpression n, String argu) {
		return null;
	}

	@Override
	public String visit(TimesExpression n, String argu) {
		return null;
	}

	@Override
	public String visit(DivideExpression n, String argu) {
		return null;
	}

	@Override
	public String visit(ModulusExpression n, String argu) {
		return null;
	}

	@Override
	public String visit(SinExpression n, String argu) {
		return null;
	}

	@Override
	public String visit(CosExpression n, String argu) {
		return null;
	}

	@Override
	public String visit(PowExpression n, String argu) {
		return null;
	}

	@Override
	public String visit(ExpExpression n, String argu) {
		return null;
	}

	@Override
	public String visit(SqrtExpression n, String argu) {
		return null;
	}

	@Override
	public String visit(AbsExpression n, String argu) {
		return null;
	}

	@Override
	public String visit(MinExpression n, String argu) {
		return null;
	}

	@Override
	public String visit(MaxExpression n, String argu) {
		return null;
	}

	@Override
	public String visit(LogExpression n, String argu) {
		return null;
	}

	@Override
	public String visit(ComplimentExpression n, String argu) {
		return null;
	}

	@Override
	public String visit(NotExpression n, String argu) {
		return null;
	}

	@Override
	public String visit(CoercionToIntExpression n, String argu) {
		return null;
	}

	@Override
	public String visit(CoercionToDoubleExpression n, String argu) {
		return null;
	}

	@Override
	public String visit(CoercionToLongExpression n, String argu) {
		return null;
	}

	@Override
	public String visit(CoercionToShortExpression n, String argu) {
		return null;
	}

	@Override
	public String visit(CoercionToByteExpression n, String argu) {
		return null;
	}

	@Override
	public String visit(Place n, String argu) {
		return null;
	}

	@Override
	public String visit(CurrentTime n, String argu) {
		return null;
	}

	@Override
	public String visit(ArrayAccess n, String argu) {
		return null;
	}

	@Override
	public String visit(MethodCall n, String argu) {
		return null;
	}

	@Override
	public String visit(MethodCallInConstructor n, String argu) {
		return null;
	}

	@Override
	public String visit(DotId n, String argu) {
		return null;
	}

	@Override
	public String visit(DotIdentifierDotGet n, String argu) {
		return null;
	}

	@Override
	public String visit(DotNext n, String argu) {
		return null;
	}

	@Override
	public String visit(DotPrev n, String argu) {
		return null;
	}

	@Override
	public String visit(DotIsFirst n, String argu) {
		return null;
	}

	@Override
	public String visit(DotIsLast n, String argu) {
		return null;
	}

	@Override
	public String visit(DotLength n, String argu) {
		return null;
	}

	@Override
	public String visit(DotIdentifier n, String argu) {
		return null;
	}

	@Override
	public String visit(NewObject n, String argu) {
		return null;
	}

	@Override
	public String visit(NewUpdatableArray n, String argu) {
		return null;
	}

	@Override
	public String visit(IntegerLiteral n, String argu) {
		return null;
	}

	@Override
	public String visit(LongLiteral n, String argu) {
		return null;
	}

	@Override
	public String visit(HexLiteral n, String argu) {
		return null;
	}

	@Override
	public String visit(FloatingPointLiteral n, String argu) {
		return null;
	}

	@Override
	public String visit(StringLiteral n, String argu) {
		return null;
	}

	@Override
	public String visit(True n, String argu) {
		return null;
	}

	@Override
	public String visit(False n, String argu) {
		return null;
	}

	@Override
	public String visit(HereLiteral n, String argu) {
		return null;
	}

	@Override
	public String visit(PlaceFirstPlace n, String argu) {
		return null;
	}

	@Override
	public String visit(PlaceLastPlace n, String argu) {
		return null;
	}

	@Override
	public String visit(PlaceMaxPlaces n, String argu) {
		return null;
	}

	@Override
	public String visit(JavaIntegerSize n, String argu) {
		return null;
	}
}
