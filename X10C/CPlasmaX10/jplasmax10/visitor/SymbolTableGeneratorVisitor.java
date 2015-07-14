package jplasmax10.visitor;
import java.util.*;

import jplasmax10.syntaxtree.*;
import util.types.*;
import util.symboltable.*;
import util.symboltable.Symbol.SymIndex;
/**
 * Provides default methods which visit each node in the tree in depth-first
 * order.  Your visitors may extend this class.
 */
public class SymbolTableGeneratorVisitor implements GJVisitor<X10Type,X10Type> {
	//
	// Auto class visitors--probably don't need to be overridden.
	//

	static ArrayList<X10Type> formalParameters = new ArrayList<X10Type>(0);
	
	
	
	public String currentClassName;
	public String currentMethodName;
	SymbolTableClassEntry currentClass;
	SymbolTableMethodEntry currentMethod;
	
	public int parentBlock, currentBlock;
	public int blockDepth;

	public HashMap<SymIndex, Symbol> variables;
	
	public SymbolTable symbolTable;
	
	public SymbolTableGeneratorVisitor(SymbolTable symbolTable) {
		this.symbolTable = symbolTable;
	}
	
	public X10Type visit(NodeList n, X10Type argu) {
		X10Type _ret=null;
		int _count=0;
		for ( Enumeration<Node> e = n.elements(); e.hasMoreElements(); ) {
			e.nextElement().accept(this,argu);
			_count++;
		}
		return _ret;
	}

	public X10Type visit(NodeListOptional n, X10Type argu) {
		if ( n.present() ) {
			X10Type _ret=null;
			int _count=0;
			for ( Enumeration<Node> e = n.elements(); e.hasMoreElements(); ) {
				e.nextElement().accept(this,argu);
				_count++;
			}
			return _ret;
		}
		else
			return null;
	}

	public X10Type visit(NodeOptional n, X10Type argu) {
		if ( n.present() )
			return n.node.accept(this,argu);
		else
			return null;
	}

	public X10Type visit(NodeSequence n, X10Type argu) {
		X10Type _ret=null;
		int _count=0;
		for ( Enumeration<Node> e = n.elements(); e.hasMoreElements(); ) {
			e.nextElement().accept(this,argu);
			_count++;
		}
		return _ret;
	}

	public X10Type visit(NodeToken n, X10Type argu) { return new X10Unassigned(n.tokenImage, null); }

	//
	// User-generated visitor methods below
	//

	/**
	 * mainClass -> MainClass()
	 * programClass -> ProgramClass()
	 * nodeListOptional -> ( TopLevelDeclaration() )*
	 * nodeToken -> <EOF>
	 */
	public X10Type visit(File n, X10Type argu) {
		X10Type _ret=null;
		n.mainClass.accept(this, argu);
		n.programClass.accept(this, argu);
		n.nodeListOptional.accept(this, argu);
		n.nodeToken.accept(this, argu);
		return _ret;
	}

	/**
	 * nodeToken -> "public"
	 * nodeToken1 -> "class"
	 * identifier -> Identifier()
	 * nodeToken2 -> "{"
	 * nodeToken3 -> "public"
	 * nodeToken4 -> "static"
	 * nodeToken5 -> "void"
	 * nodeToken6 -> "main"
	 * nodeToken7 -> "("
	 * nodeToken8 -> "String"
	 * nodeToken9 -> "["
	 * nodeToken10 -> "]"
	 * identifier1 -> Identifier()
	 * nodeToken11 -> ")"
	 * nodeToken12 -> "{"
	 * identifier2 -> Identifier()
	 * nodeToken13 -> "."
	 * identifier3 -> Identifier()
	 * nodeToken14 -> "("
	 * nodeToken15 -> ")"
	 * nodeToken16 -> ";"
	 * nodeToken17 -> "}"
	 * nodeToken18 -> "}"
	 */
	public X10Type visit(MainClass n, X10Type argu) {
		X10Type _ret=null;
		n.nodeToken.accept(this, argu);
		n.nodeToken1.accept(this, argu);
		currentClassName = n.identifier.accept(this, argu).typeName;
		currentClass = symbolTable.getClassEntry(currentClassName);
		n.nodeToken2.accept(this, argu);
		n.nodeToken3.accept(this, argu);
		n.nodeToken4.accept(this, argu);
		n.nodeToken5.accept(this, argu);
		currentMethodName = n.nodeToken6.accept(this, argu).typeName;
		currentMethod = new SymbolTableMethodEntry(currentClassName, new X10Void(), currentMethodName, formalParameters);
		n.nodeToken7.accept(this, argu);
		n.nodeToken8.accept(this, argu);
		n.nodeToken9.accept(this, argu);
		n.nodeToken10.accept(this, argu);
		n.identifier1.accept(this, argu);
		n.nodeToken11.accept(this, argu);
		parentBlock = 0;
		currentBlock = 0;
		blockDepth = 0;
		n.nodeToken12.accept(this, argu);
		n.identifier2.accept(this, argu);
		n.nodeToken13.accept(this, argu);
		n.identifier3.accept(this, argu);
		n.nodeToken14.accept(this, argu);
		n.nodeToken15.accept(this, argu);
		n.nodeToken16.accept(this, argu);
		n.nodeToken17.accept(this, argu);
		n.nodeToken18.accept(this, argu);
		currentClass.methods.put(currentMethodName, currentMethod);
		symbolTable.putClassEntry(currentClassName, currentClass);
		return _ret;
	}

	/**
	 * nodeToken -> "class"
	 * identifier -> Identifier()
	 * nodeToken1 -> "{"
	 * nodeListOptional -> ( ConstantDeclaration() )*
	 * nodeListOptional1 -> ( StaticMethodDeclaration() )*
	 * nodeToken2 -> "}"
	 */
	public X10Type visit(ProgramClass n, X10Type argu) {
		X10Type _ret=null;
		n.nodeToken.accept(this, argu);
		currentClassName = n.identifier.accept(this, argu).typeName;
		currentClass = symbolTable.getClassEntry(currentClassName);
		parentBlock = 0;
		currentBlock = 0;
		blockDepth = 0;
		n.nodeToken1.accept(this, argu);
		n.nodeListOptional.accept(this, argu);
		n.nodeListOptional1.accept(this, argu);
		n.nodeToken2.accept(this, argu);
		symbolTable.putClassEntry(currentClassName, currentClass);
		return _ret;
	}

	/**
	 * nodeChoice -> ClassDeclaration()
	 *       | ValueDeclaration()
	 */
	public X10Type visit(TopLevelDeclaration n, X10Type argu) {
		X10Type _ret=null;
		n.nodeChoice.accept(this, argu);
		return _ret;
	}

	/**
	 * nodeToken -> "class"
	 * identifier -> Identifier()
	 * nodeToken1 -> "{"
	 * nodeListOptional -> ( InitializableConstantDeclaration() )*
	 * nodeListOptional1 -> ( UpdatableFieldDeclaration() )*
	 * nodeListOptional2 -> ( ConstructorDeclaration() )*
	 * nodeListOptional3 -> ( MethodDeclaration() )*
	 * nodeToken2 -> "}"
	 */
	public X10Type visit(ClassDeclaration n, X10Type argu) {
		X10Type _ret=null;
		n.nodeToken.accept(this, argu);
		currentClassName = n.identifier.accept(this, argu).typeName;
		currentClass = symbolTable.getClassEntry(currentClassName);
		parentBlock = 0;
		currentBlock = 0;
		blockDepth = 0;
		n.nodeToken1.accept(this, argu);
		n.nodeListOptional.accept(this, argu);
		n.nodeListOptional1.accept(this, argu);
		
		n.nodeListOptional2.accept(this, argu);
		n.nodeListOptional3.accept(this, argu);
		n.nodeToken2.accept(this, argu);
		symbolTable.putClassEntry(currentClassName, currentClass);
		return _ret;
	}

	/**
	 * nodeToken -> "value"
	 * identifier -> Identifier()
	 * nodeToken1 -> "{"
	 * nodeListOptional -> ( InitializableConstantDeclaration() )*
	 * nodeListOptional1 -> ( ConstructorDeclaration() )*
	 * nodeListOptional2 -> ( MethodDeclaration() )*
	 * nodeToken2 -> "}"
	 */
	public X10Type visit(ValueDeclaration n, X10Type argu) {
		X10Type _ret=null;
		n.nodeToken.accept(this, argu);
		currentClassName = n.identifier.accept(this, argu).typeName;
		currentClass = symbolTable.getClassEntry(currentClassName);
		parentBlock = 0;
		currentBlock = 0;
		blockDepth = 0;
		n.nodeToken1.accept(this, argu);
		n.nodeListOptional.accept(this, argu);
		n.nodeListOptional1.accept(this, argu);
		n.nodeListOptional2.accept(this, argu);
		n.nodeToken2.accept(this, argu);
		symbolTable.putClassEntry(currentClassName, currentClass);
		return _ret;
	}

	/**
	 * nodeToken -> "public"
	 * identifier -> Identifier()
	 * nodeToken1 -> "("
	 * nodeOptional -> ( FormalParameterList() )?
	 * nodeToken2 -> ")"
	 * block -> Block()
	 */
	public X10Type visit(ConstructorDeclaration n, X10Type argu) {
		X10Type _ret=null;
		n.nodeToken.accept(this, argu);
		currentMethodName = n.identifier.accept(this, argu).typeName;
		formalParameters = new ArrayList<X10Type>(0);
		currentBlock = 1;
		n.nodeToken1.accept(this, argu);
		n.nodeOptional.accept(this, argu);
		n.nodeToken2.accept(this, argu);
		currentMethodName += "_"+formalParameters.size();
		currentMethod = new SymbolTableMethodEntry(currentClassName, new X10Void(), currentMethodName, formalParameters);
		currentMethod.variables.putAll(variables);
		currentBlock = 0;
		blockDepth = 0;
		n.block.accept(this, argu);
		currentClass.methods.put(currentMethodName, currentMethod);
		return _ret;
	}

	/**
	 * nodeToken -> "public"
	 * nodeToken1 -> "static"
	 * nodeToken2 -> "final"
	 * type -> Type()
	 * identifier -> Identifier()
	 * nodeToken3 -> "="
	 * methodCall -> MethodCall()
	 * nodeToken4 -> ";"
	 */
	public X10Type visit(ConstantDeclaration n, X10Type argu) {
		X10Type _ret=null;
		n.nodeToken.accept(this, argu);
		n.nodeToken1.accept(this, argu);
		n.nodeToken2.accept(this, argu);
		X10Type returnType = n.type.accept(this, argu);
		String identifier = n.identifier.accept(this, argu).typeName;
		SymIndex symId = new SymIndex(identifier, currentBlock);
		Symbol sym = new Symbol(symId, returnType);
		currentClass.fields.put(symId, sym);
		n.nodeToken3.accept(this, argu);
		n.methodCall.accept(this, argu);
		n.nodeToken4.accept(this, argu);
		return _ret;
	}

	/**
	 * nodeToken -> "public"
	 * nodeToken1 -> "final"
	 * type -> Type()
	 * identifier -> Identifier()
	 * nodeToken2 -> ";"
	 */
	public X10Type visit(InitializableConstantDeclaration n, X10Type argu) {
		X10Type _ret=null;
		n.nodeToken.accept(this, argu);
		n.nodeToken1.accept(this, argu);
		X10Type returnType = n.type.accept(this, argu);
		String identifier = n.identifier.accept(this, argu).typeName;
		SymIndex symId = new SymIndex(identifier, currentBlock);
		Symbol sym = new Symbol(symId, returnType);
		currentClass.fields.put(symId, sym);
		n.nodeToken2.accept(this, argu);
		return _ret;
	}

	/**
	 * nodeToken -> "public"
	 * type -> Type()
	 * identifier -> Identifier()
	 * nodeToken1 -> ";"
	 */
	public X10Type visit(UpdatableFieldDeclaration n, X10Type argu) {
		X10Type _ret=null;
		n.nodeToken.accept(this, argu);
		X10Type returnType = n.type.accept(this, argu);
		String identifier = n.identifier.accept(this, argu).typeName;
		SymIndex symId = new SymIndex(identifier, currentBlock);
		Symbol sym = new Symbol(symId, returnType);
		currentClass.fields.put(symId, sym);
		n.nodeToken1.accept(this, argu);
		return _ret;
	}

	/**
	 * nodeToken -> "public"
	 * nodeToken1 -> "static"
	 * returnType -> ReturnType()
	 * identifier -> Identifier()
	 * nodeToken2 -> "("
	 * nodeOptional -> ( FormalParameterList() )?
	 * nodeToken3 -> ")"
	 * block -> Block()
	 */
	public X10Type visit(StaticMethodDeclaration n, X10Type argu) {
		X10Type _ret=null;
		n.nodeToken.accept(this, argu);
		n.nodeToken1.accept(this, argu);
		X10Type returnType = n.returnType.accept(this, argu);
		currentMethodName = n.identifier.accept(this, argu).typeName;
		formalParameters = new ArrayList<X10Type>(0);
		variables = new HashMap<SymIndex, Symbol>(0);
		currentBlock = 1;
		n.nodeToken2.accept(this, argu);
		n.nodeOptional.accept(this, argu);
		n.nodeToken3.accept(this, argu);
		currentMethod = new SymbolTableMethodEntry(currentClassName, returnType, currentMethodName, formalParameters);
		currentMethod.variables.putAll(variables);
		currentBlock = 0;
		blockDepth = 0;
		n.block.accept(this, argu);
		currentClass.methods.put(currentMethodName, currentMethod);
		return _ret;
	}

	/**
	 * nodeToken -> "public"
	 * returnType -> ReturnType()
	 * identifier -> Identifier()
	 * nodeToken1 -> "("
	 * nodeOptional -> ( FormalParameterList() )?
	 * nodeToken2 -> ")"
	 * block -> Block()
	 */
	public X10Type visit(MethodDeclaration n, X10Type argu) {
		X10Type _ret=null;
		n.nodeToken.accept(this, argu);
		X10Type returnType = n.returnType.accept(this, argu);
		currentMethodName = n.identifier.accept(this, argu).typeName;
		formalParameters = new ArrayList<X10Type>(0);
		variables = new HashMap<SymIndex, Symbol>(0);
		currentBlock = 1;
		n.nodeToken1.accept(this, argu);
		n.nodeOptional.accept(this, argu);
		n.nodeToken2.accept(this, argu);
		currentMethod = new SymbolTableMethodEntry(currentClassName, returnType, currentMethodName, formalParameters);
		currentMethod.variables.putAll(variables);
		currentBlock = 0;
		blockDepth = 0;
		n.block.accept(this, argu);
		currentClass.methods.put(currentMethodName, currentMethod);
		return _ret;
	}

	/**
	 * finalFormalParameter -> FinalFormalParameter()
	 * nodeListOptional -> ( FormalParameterRest() )*
	 */
	public X10Type visit(FormalParameterList n, X10Type argu) {
		X10Type _ret=null;
		n.finalFormalParameter.accept(this, argu);
		n.nodeListOptional.accept(this, argu);
		return _ret;
	}

	/**
	 * nodeToken -> "final"
	 * type -> Type()
	 * identifier -> Identifier()
	 */
	public X10Type visit(FinalFormalParameter n, X10Type argu) {
		X10Type _ret=null;
		n.nodeToken.accept(this, argu);
		X10Type returnType = n.type.accept(this, argu);
		String identifier = n.identifier.accept(this, argu).typeName;
		SymIndex symId = new SymIndex(identifier, currentBlock);
		Symbol sym = new Symbol(symId, returnType);
		variables.put(symId, sym);		
		formalParameters.add(returnType);
		return _ret;
	}

	/**
	 * nodeToken -> ","
	 * finalFormalParameter -> FinalFormalParameter()
	 */
	public X10Type visit(FormalParameterRest n, X10Type argu) {
		X10Type _ret=null;
		n.nodeToken.accept(this, argu);
		n.finalFormalParameter.accept(this, argu);
		return _ret;
	}

	/**
	 * nodeChoice -> VoidType()
	 *       | Type()
	 */
	public X10Type visit(ReturnType n, X10Type argu) {
		X10Type _ret=null;
		_ret = n.nodeChoice.accept(this, argu);
		return _ret;
	}

	/**
	 * nodeToken -> "void"
	 */
	public X10Type visit(VoidType n, X10Type argu) {
		return new X10Void();
	}

	/**
	 * nodeChoice -> UpdatableArrayType()
	 *       | NonArrayType()
	 */
	public X10Type visit(Type n, X10Type argu) {
		X10Type _ret=null;
		_ret = n.nodeChoice.accept(this, argu);
		return _ret;
	}

	/**
	 * nonArrayType -> NonArrayType()
	 * nodeToken -> "["
	 * nodeToken1 -> "]"
	 */
	public X10Type visit(UpdatableArrayType n, X10Type argu) {
		X10Type _ret=null;
		_ret = n.nonArrayType.accept(this, argu);
		return new X10Array(1, _ret);
	}

	/**
	 * nodeChoice -> BooleanType()
	 *       | ByteType()
	 *       | ShortType()
	 *       | IntegerType()
	 *       | LongType()
	 *       | DoubleType()
	 *       | StringType()
	 *       | PlaceType()
	 *       | ClassNameType()
	 */
	public X10Type visit(NonArrayType n, X10Type argu) {
		X10Type _ret=null;
		_ret = n.nodeChoice.accept(this, argu);
		return _ret;
	}

	/**
	 * nodeToken -> "boolean"
	 */
	public X10Type visit(BooleanType n, X10Type argu) {
		return new X10Boolean();
	}

	/**
	 * nodeToken -> "byte"
	 */
	public X10Type visit(ByteType n, X10Type argu) {
		return new X10Byte();
	}

	/**
	 * nodeToken -> "short"
	 */
	public X10Type visit(ShortType n, X10Type argu) {
		return new X10Short();
	}

	/**
	 * nodeToken -> "int"
	 */
	public X10Type visit(IntegerType n, X10Type argu) {
		return new X10Integer();
	}

	/**
	 * nodeToken -> "long"
	 */
	public X10Type visit(LongType n, X10Type argu) {
		return new X10Long();
	}

	/**
	 * nodeToken -> "double"
	 */
	public X10Type visit(DoubleType n, X10Type argu) {
		return new X10Double();
	}

	/**
	 * nodeToken -> "String"
	 */
	public X10Type visit(StringType n, X10Type argu) {
		return new X10String();
	}

	/**
	 * nodeToken -> "place"
	 */
	public X10Type visit(PlaceType n, X10Type argu) {
		return new X10Place();
	}

	/**
	 * identifier -> Identifier()
	 */
	public X10Type visit(ClassNameType n, X10Type argu) {
		String className = n.identifier.accept(this, argu).typeName;
		SymbolTableClassEntry stce = symbolTable.getClassEntry(className);
		return new X10Class(className, stce.classType);
	}

	/**
	 * nodeToken -> <IDENTIFIER>
	 */
	public X10Type visit(Identifier n, X10Type argu) {
		X10Type _ret=null;
		_ret = n.nodeToken.accept(this, argu);
		return _ret;
	}

	/**
	 * nodeToken -> "{"
	 * nodeListOptional -> ( Statement() )*
	 * nodeToken1 -> "}"
	 */
	public X10Type visit(Block n, X10Type argu) {
		X10Type _ret=null;
		n.nodeToken.accept(this, argu);	
		int temp = parentBlock;
		parentBlock = currentBlock;
		currentBlock = ++blockDepth;
		currentMethod.blockMap.put(currentBlock, parentBlock);
		n.nodeListOptional.accept(this, argu);
		currentBlock = parentBlock;
		parentBlock = temp;
		n.nodeToken1.accept(this, argu);
		return _ret;
	}

	/**
	 * nodeChoice -> Assignment()
	 *       | ArrayAssignment()
	 *       | FieldAssignment()
	 *       | ThisFieldAssignment()
	 *       | AsyncStatement()
	 *       | Block()
	 *       | BreakStatement()
	 *       | ContinueStatement()
	 *       | DoStatement()
	 *       | FinishStatement()
	 *       | IfStatement()
	 *       | LoopStatement()
	 *       | MethodCallStatement()
	 *       | MethodCallStatementInConstructor()
	 *       | PrintlnStatement()
	 *       | PrintStatement()
	 *       | PrintErrorStatement()
	 *       | ReturnStatement()
	 *       | SwitchStatement()
	 *       | ThrowStatement()
	 *       | WhileStatement()
	 *       | FinalVariableDeclaration()
	 *       | UpdatableVariableDeclaration()
	 */
	public X10Type visit(Statement n, X10Type argu) {
		X10Type _ret=null;
		n.nodeChoice.accept(this, argu);
		return _ret;
	}

	/**
	 * identifier -> Identifier()
	 * nodeToken -> "="
	 * expression -> Expression()
	 * nodeToken1 -> ";"
	 */
	public X10Type visit(Assignment n, X10Type argu) {
		X10Type _ret=null;
		n.identifier.accept(this, argu);
		n.nodeToken.accept(this, argu);
		n.expression.accept(this, argu);
		n.nodeToken1.accept(this, argu);
		return _ret;
	}

	/**
	 * identifier -> Identifier()
	 * nodeToken -> "["
	 * identifierList -> IdentifierList()
	 * nodeToken1 -> "]"
	 * nodeToken2 -> "="
	 * identifier1 -> Identifier()
	 * nodeToken3 -> ";"
	 */
	public X10Type visit(ArrayAssignment n, X10Type argu) {
		X10Type _ret=null;
		n.identifier.accept(this, argu);
		n.nodeToken.accept(this, argu);
		n.identifierList.accept(this, argu);
		n.nodeToken1.accept(this, argu);
		n.nodeToken2.accept(this, argu);
		n.identifier1.accept(this, argu);
		n.nodeToken3.accept(this, argu);
		return _ret;
	}

	/**
	 * identifier -> Identifier()
	 * nodeToken -> "."
	 * identifier1 -> Identifier()
	 * nodeToken1 -> "="
	 * nodeToken2 -> "("
	 * identifier2 -> Identifier()
	 * nodeToken3 -> ")"
	 * nodeToken4 -> ";"
	 */
	public X10Type visit(FieldAssignment n, X10Type argu) {
		X10Type _ret=null;
		n.identifier.accept(this, argu);
		n.nodeToken.accept(this, argu);
		n.identifier1.accept(this, argu);
		n.nodeToken1.accept(this, argu);
		n.nodeToken2.accept(this, argu);
		n.identifier2.accept(this, argu);
		n.nodeToken3.accept(this, argu);
		n.nodeToken4.accept(this, argu);
		return _ret;
	}

	/**
	 * nodeToken -> "this"
	 * nodeToken1 -> "."
	 * identifier -> Identifier()
	 * nodeToken2 -> "="
	 * nodeToken3 -> "("
	 * identifier1 -> Identifier()
	 * nodeToken4 -> ")"
	 * nodeToken5 -> ";"
	 */
	public X10Type visit(ThisFieldAssignment n, X10Type argu) {
		X10Type _ret=null;
		n.nodeToken.accept(this, argu);
		n.nodeToken1.accept(this, argu);
		n.identifier.accept(this, argu);
		n.nodeToken2.accept(this, argu);
		n.nodeToken3.accept(this, argu);
		n.identifier1.accept(this, argu);
		n.nodeToken4.accept(this, argu);
		n.nodeToken5.accept(this, argu);
		return _ret;
	}

	/**
	 * nodeToken -> "async"
	 * nodeToken1 -> "("
	 * identifier -> Identifier()
	 * nodeToken2 -> ")"
	 * block -> Block()
	 */
	public X10Type visit(AsyncStatement n, X10Type argu) {
		X10Type _ret=null;
		n.nodeToken.accept(this, argu);
		n.nodeToken1.accept(this, argu);
		n.identifier.accept(this, argu);
		n.nodeToken2.accept(this, argu);
		n.block.accept(this, argu);
		return _ret;
	}

	/**
	 * nodeToken -> "break"
	 * nodeToken1 -> ";"
	 */
	public X10Type visit(BreakStatement n, X10Type argu) {
		X10Type _ret=null;
		n.nodeToken.accept(this, argu);
		n.nodeToken1.accept(this, argu);
		return _ret;
	}

	/**
	 * nodeToken -> "continue"
	 * nodeToken1 -> ";"
	 */
	public X10Type visit(ContinueStatement n, X10Type argu) {
		X10Type _ret=null;
		n.nodeToken.accept(this, argu);
		n.nodeToken1.accept(this, argu);
		return _ret;
	}

	/**
	 * nodeToken -> "do"
	 * block -> Block()
	 * nodeToken1 -> "while"
	 * nodeToken2 -> "("
	 * identifier -> Identifier()
	 * nodeToken3 -> ")"
	 * nodeToken4 -> ";"
	 */
	public X10Type visit(DoStatement n, X10Type argu) {
		X10Type _ret=null;
		n.nodeToken.accept(this, argu);
		n.block.accept(this, argu);
		n.nodeToken1.accept(this, argu);
		n.nodeToken2.accept(this, argu);
		n.identifier.accept(this, argu);
		n.nodeToken3.accept(this, argu);
		n.nodeToken4.accept(this, argu);
		return _ret;
	}

	/**
	 * nodeToken -> "finish"
	 * block -> Block()
	 */
	public X10Type visit(FinishStatement n, X10Type argu) {
		X10Type _ret=null;
		n.nodeToken.accept(this, argu);
		n.block.accept(this, argu);
		return _ret;
	}

	/**
	 * nodeToken -> "if"
	 * nodeToken1 -> "("
	 * identifier -> Identifier()
	 * nodeToken2 -> ")"
	 * block -> Block()
	 * nodeOptional -> [ ElseClause() ]
	 */
	public X10Type visit(IfStatement n, X10Type argu) {
		X10Type _ret=null;
		n.nodeToken.accept(this, argu);
		n.nodeToken1.accept(this, argu);
		n.identifier.accept(this, argu);
		n.nodeToken2.accept(this, argu);
		n.block.accept(this, argu);
		n.nodeOptional.accept(this, argu);
		return _ret;
	}

	/**
	 * nodeToken -> "else"
	 * block -> Block()
	 */
	public X10Type visit(ElseClause n, X10Type argu) {
		X10Type _ret=null;
		n.nodeToken.accept(this, argu);
		n.block.accept(this, argu);
		return _ret;
	}

	/**
	 * nodeToken -> "for"
	 * nodeToken1 -> "("
	 * nodeToken2 -> "int"
	 * identifier -> Identifier()
	 * nodeToken3 -> "="
	 * integerLiteral -> IntegerLiteral()
	 * nodeToken4 -> ";"
	 * identifier1 -> Identifier()
	 * nodeToken5 -> "<"
	 * identifier2 -> Identifier()
	 * nodeToken6 -> ";"
	 * identifier3 -> Identifier()
	 * nodeToken7 -> "++"
	 * nodeToken8 -> ")"
	 * block -> Block()
	 */
	public X10Type visit(LoopStatement n, X10Type argu) {
		X10Type _ret=null;
		n.nodeToken.accept(this, argu);
		n.nodeToken1.accept(this, argu);
		n.nodeToken2.accept(this, argu);
		String identifier = n.identifier.accept(this, argu).typeName;

		SymIndex symId = new SymIndex(identifier, currentBlock+1);
		Symbol sym = new Symbol(symId, new X10Integer());
		currentMethod.variables.put(symId, sym);		
		
		n.nodeToken3.accept(this, argu);
		n.integerLiteral.accept(this, argu);
		n.nodeToken4.accept(this, argu);
		n.identifier1.accept(this, argu);
		n.nodeToken5.accept(this, argu);
		n.identifier2.accept(this, argu);
		n.nodeToken6.accept(this, argu);
		n.identifier3.accept(this, argu);
		n.nodeToken7.accept(this, argu);
		n.nodeToken8.accept(this, argu);
		n.block.accept(this, argu);
		return _ret;
	}

	/**
	 * identifier -> Identifier()
	 * nodeListOptional -> ( IdentifierRest() )*
	 */
	public X10Type visit(IdentifierList n, X10Type argu) {
		X10Type _ret=null;
		n.identifier.accept(this, argu);
		n.nodeListOptional.accept(this, argu);
		return _ret;
	}

	/**
	 * nodeToken -> ","
	 * identifier -> Identifier()
	 */
	public X10Type visit(IdentifierRest n, X10Type argu) {
		X10Type _ret=null;
		n.nodeToken.accept(this, argu);
		n.identifier.accept(this, argu);
		return _ret;
	}

	/**
	 * methodCall -> MethodCall()
	 * nodeToken -> ";"
	 */
	public X10Type visit(MethodCallStatement n, X10Type argu) {
		X10Type _ret=null;
		n.methodCall.accept(this, argu);
		n.nodeToken.accept(this, argu);
		return _ret;
	}

	/**
	 * methodCallInConstructor -> MethodCallInConstructor()
	 * nodeToken -> ";"
	 */
	public X10Type visit(MethodCallStatementInConstructor n, X10Type argu) {
		X10Type _ret=null;
		n.methodCallInConstructor.accept(this, argu);
		n.nodeToken.accept(this, argu);
		return _ret;
	}

	/**
	 * nodeToken -> "System.out.println"
	 * nodeToken1 -> "("
	 * identifier -> Identifier()
	 * nodeToken2 -> ")"
	 * nodeToken3 -> ";"
	 */
	public X10Type visit(PrintlnStatement n, X10Type argu) {
		X10Type _ret=null;
		n.nodeToken.accept(this, argu);
		n.nodeToken1.accept(this, argu);
		n.identifier.accept(this, argu);
		n.nodeToken2.accept(this, argu);
		n.nodeToken3.accept(this, argu);
		return _ret;
	}

	/**
	 * nodeToken -> "System.out.print"
	 * nodeToken1 -> "("
	 * identifier -> Identifier()
	 * nodeToken2 -> ")"
	 * nodeToken3 -> ";"
	 */
	public X10Type visit(PrintStatement n, X10Type argu) {
		X10Type _ret=null;
		n.nodeToken.accept(this, argu);
		n.nodeToken1.accept(this, argu);
		n.identifier.accept(this, argu);
		n.nodeToken2.accept(this, argu);
		n.nodeToken3.accept(this, argu);
		return _ret;
	}

	/**
	 * nodeToken -> "System.err.println"
	 * nodeToken1 -> "("
	 * identifier -> Identifier()
	 * nodeToken2 -> ")"
	 * nodeToken3 -> ";"
	 */
	public X10Type visit(PrintErrorStatement n, X10Type argu) {
		X10Type _ret=null;
		n.nodeToken.accept(this, argu);
		n.nodeToken1.accept(this, argu);
		n.identifier.accept(this, argu);
		n.nodeToken2.accept(this, argu);
		n.nodeToken3.accept(this, argu);
		return _ret;
	}

	/**
	 * nodeToken -> "return"
	 * nodeOptional -> [ Identifier() ]
	 * nodeToken1 -> ";"
	 */
	public X10Type visit(ReturnStatement n, X10Type argu) {
		X10Type _ret=null;
		n.nodeToken.accept(this, argu);
		n.nodeOptional.accept(this, argu);
		n.nodeToken1.accept(this, argu);
		return _ret;
	}

	/**
	 * nodeToken -> "switch"
	 * nodeToken1 -> "("
	 * identifier -> Identifier()
	 * nodeToken2 -> ")"
	 * nodeToken3 -> "{"
	 * nodeListOptional -> ( SwitchEntry() )*
	 * nodeToken4 -> "}"
	 */
	public X10Type visit(SwitchStatement n, X10Type argu) {
		X10Type _ret=null;
		n.nodeToken.accept(this, argu);
		n.nodeToken1.accept(this, argu);
		n.identifier.accept(this, argu);
		n.nodeToken2.accept(this, argu);
		n.nodeToken3.accept(this, argu);
		int temp = parentBlock;
		parentBlock = currentBlock;
		currentBlock = ++blockDepth;
		currentMethod.blockMap.put(currentBlock, parentBlock);
		n.nodeListOptional.accept(this, argu);
		currentBlock = parentBlock;
		parentBlock = temp;
		n.nodeToken4.accept(this, argu);
		return _ret;
	}

	/**
	 * switchLabel -> SwitchLabel()
	 * nodeToken -> ":"
	 * block -> Block()
	 */
	public X10Type visit(SwitchEntry n, X10Type argu) {
		X10Type _ret=null;
		n.switchLabel.accept(this, argu);
		n.nodeToken.accept(this, argu);
		n.block.accept(this, argu);
		return _ret;
	}

	/**
	 * nodeChoice -> Case()
	 *       | Default()
	 */
	public X10Type visit(SwitchLabel n, X10Type argu) {
		X10Type _ret=null;
		n.nodeChoice.accept(this, argu);
		return _ret;
	}

	/**
	 * nodeToken -> "case"
	 * identifier -> Identifier()
	 */
	public X10Type visit(Case n, X10Type argu) {
		X10Type _ret=null;
		n.nodeToken.accept(this, argu);
		n.identifier.accept(this, argu);
		return _ret;
	}

	/**
	 * nodeToken -> "default"
	 */
	public X10Type visit(Default n, X10Type argu) {
		X10Type _ret=null;
		n.nodeToken.accept(this, argu);
		return _ret;
	}

	/**
	 * nodeToken -> "throw"
	 * nodeToken1 -> "new"
	 * nodeToken2 -> "RuntimeException"
	 * nodeToken3 -> "("
	 * identifier -> Identifier()
	 * nodeToken4 -> ")"
	 * nodeToken5 -> ";"
	 */
	public X10Type visit(ThrowStatement n, X10Type argu) {
		X10Type _ret=null;
		n.nodeToken.accept(this, argu);
		n.nodeToken1.accept(this, argu);
		n.nodeToken2.accept(this, argu);
		n.nodeToken3.accept(this, argu);
		n.identifier.accept(this, argu);
		n.nodeToken4.accept(this, argu);
		n.nodeToken5.accept(this, argu);
		return _ret;
	}

	/**
	 * nodeToken -> "while"
	 * nodeToken1 -> "("
	 * identifier -> Identifier()
	 * nodeToken2 -> ")"
	 * block -> Block()
	 */
	public X10Type visit(WhileStatement n, X10Type argu) {
		X10Type _ret=null;
		n.nodeToken.accept(this, argu);
		n.nodeToken1.accept(this, argu);
		n.identifier.accept(this, argu);
		n.nodeToken2.accept(this, argu);
		n.block.accept(this, argu);
		return _ret;
	}

	/**
	 * nodeToken -> "final"
	 * type -> Type()
	 * identifier -> Identifier()
	 * nodeToken1 -> "="
	 * expression -> Expression()
	 * nodeToken2 -> ";"
	 */
	public X10Type visit(FinalVariableDeclaration n, X10Type argu) {
		X10Type _ret=null;
		n.nodeToken.accept(this, argu);
		X10Type returnType = n.type.accept(this, argu);
		String identifier = n.identifier.accept(this, argu).typeName;
		SymIndex symId = new SymIndex(identifier, currentBlock);
		Symbol sym = new Symbol(symId, returnType);
		currentMethod.variables.put(symId, sym);
		n.nodeToken1.accept(this, argu);
		n.expression.accept(this, argu);
		n.nodeToken2.accept(this, argu);
		return _ret;
	}

	/**
	 * type -> Type()
	 * identifier -> Identifier()
	 * nodeToken -> "="
	 * expression -> Expression()
	 * nodeToken1 -> ";"
	 */
	public X10Type visit(UpdatableVariableDeclaration n, X10Type argu) {
		X10Type _ret=null;
		X10Type returnType = n.type.accept(this, argu);
		String identifier = n.identifier.accept(this, argu).typeName;
		SymIndex symId = new SymIndex(identifier, currentBlock);
		Symbol sym = new Symbol(symId, returnType);
		currentMethod.variables.put(symId, sym);
		n.nodeToken.accept(this, argu);
		n.expression.accept(this, argu);
		n.nodeToken1.accept(this, argu);
		return _ret;
	}

	/**
	 * nodeChoice -> ExpressionInParentheses()
	 *       | ConditionalOrExpression()
	 *       | ConditionalAndExpression()
	 *       | InclusiveOrExpression()
	 *       | ExclusiveOrExpression()
	 *       | AndExpression()
	 *       | EqualsExpression()
	 *       | NonEqualsExpression()
	 *       | LessThanExpression()
	 *       | GreaterThanExpression()
	 *       | LessThanEqualExpression()
	 *       | GreaterThanEqualExpression()
	 *       | ShiftLeftExpression()
	 *       | ShiftRightExpression()
	 *       | ShiftRightUnsignedExpression()
	 *       | PlusExpression()
	 *       | MinusExpression()
	 *       | TimesExpression()
	 *       | DivideExpression()
	 *       | ModulusExpression()
	 *       | SinExpression()
	 *       | CosExpression()
	 *       | PowExpression()
	 *       | ExpExpression()
	 *       | SqrtExpression()
	 *       | AbsExpression()
	 *       | MinExpression()
	 *       | MaxExpression()
	 *       | LogExpression()
	 *       | ComplimentExpression()
	 *       | NotExpression()
	 *       | CoercionToIntExpression()
	 *       | CoercionToDoubleExpression()
	 *       | CoercionToLongExpression()
	 *       | CoercionToShortExpression()
	 *       | CoercionToByteExpression()
	 *       | Place()
	 *       | CurrentTime()
	 *       | ArrayAccess()
	 *       | MethodCall()
	 *       | MethodCallInConstructor()
	 *       | DotId()
	 *       | DotIdentifierDotGet()
	 *       | DotNext()
	 *       | DotPrev()
	 *       | DotIsFirst()
	 *       | DotIsLast()
	 *       | DotLength()
	 *       | DotIdentifier()
	 *       | NewObject()
	 *       | NewUpdatableArray()
	 *       | IntegerLiteral()
	 *       | LongLiteral()
	 *       | HexLiteral()
	 *       | FloatingPointLiteral()
	 *       | StringLiteral()
	 *       | True()
	 *       | False()
	 *       | HereLiteral()
	 *       | PlaceFirstPlace()
	 *       | PlaceLastPlace()
	 *       | PlaceMaxPlaces()
	 *       | JavaIntegerSize()
	 *       | Identifier()
	 */
	public X10Type visit(Expression n, X10Type argu) {
		X10Type _ret=null;
		n.nodeChoice.accept(this, argu);
		return _ret;
	}

	/**
	 * nodeToken -> "("
	 * expression -> Expression()
	 * nodeToken1 -> ")"
	 */
	public X10Type visit(ExpressionInParentheses n, X10Type argu) {
		X10Type _ret=null;
		n.nodeToken.accept(this, argu);
		n.expression.accept(this, argu);
		n.nodeToken1.accept(this, argu);
		return _ret;
	}

	/**
	 * identifier -> Identifier()
	 * nodeToken -> "||"
	 * identifier1 -> Identifier()
	 */
	public X10Type visit(ConditionalOrExpression n, X10Type argu) {
		X10Type _ret=null;
		n.identifier.accept(this, argu);
		n.nodeToken.accept(this, argu);
		n.identifier1.accept(this, argu);
		return _ret;
	}

	/**
	 * identifier -> Identifier()
	 * nodeToken -> "&&"
	 * identifier1 -> Identifier()
	 */
	public X10Type visit(ConditionalAndExpression n, X10Type argu) {
		X10Type _ret=null;
		n.identifier.accept(this, argu);
		n.nodeToken.accept(this, argu);
		n.identifier1.accept(this, argu);
		return _ret;
	}

	/**
	 * identifier -> Identifier()
	 * nodeToken -> "|"
	 * identifier1 -> Identifier()
	 */
	public X10Type visit(InclusiveOrExpression n, X10Type argu) {
		X10Type _ret=null;
		n.identifier.accept(this, argu);
		n.nodeToken.accept(this, argu);
		n.identifier1.accept(this, argu);
		return _ret;
	}

	/**
	 * identifier -> Identifier()
	 * nodeToken -> "^"
	 * identifier1 -> Identifier()
	 */
	public X10Type visit(ExclusiveOrExpression n, X10Type argu) {
		X10Type _ret=null;
		n.identifier.accept(this, argu);
		n.nodeToken.accept(this, argu);
		n.identifier1.accept(this, argu);
		return _ret;
	}

	/**
	 * identifier -> Identifier()
	 * nodeToken -> "&"
	 * identifier1 -> Identifier()
	 */
	public X10Type visit(AndExpression n, X10Type argu) {
		X10Type _ret=null;
		n.identifier.accept(this, argu);
		n.nodeToken.accept(this, argu);
		n.identifier1.accept(this, argu);
		return _ret;
	}

	/**
	 * identifier -> Identifier()
	 * nodeToken -> "=="
	 * identifier1 -> Identifier()
	 */
	public X10Type visit(EqualsExpression n, X10Type argu) {
		X10Type _ret=null;
		n.identifier.accept(this, argu);
		n.nodeToken.accept(this, argu);
		n.identifier1.accept(this, argu);
		return _ret;
	}

	/**
	 * identifier -> Identifier()
	 * nodeToken -> "!="
	 * identifier1 -> Identifier()
	 */
	public X10Type visit(NonEqualsExpression n, X10Type argu) {
		X10Type _ret=null;
		n.identifier.accept(this, argu);
		n.nodeToken.accept(this, argu);
		n.identifier1.accept(this, argu);
		return _ret;
	}

	/**
	 * identifier -> Identifier()
	 * nodeToken -> "<"
	 * identifier1 -> Identifier()
	 */
	public X10Type visit(LessThanExpression n, X10Type argu) {
		X10Type _ret=null;
		n.identifier.accept(this, argu);
		n.nodeToken.accept(this, argu);
		n.identifier1.accept(this, argu);
		return _ret;
	}

	/**
	 * identifier -> Identifier()
	 * nodeToken -> ">"
	 * identifier1 -> Identifier()
	 */
	public X10Type visit(GreaterThanExpression n, X10Type argu) {
		X10Type _ret=null;
		n.identifier.accept(this, argu);
		n.nodeToken.accept(this, argu);
		n.identifier1.accept(this, argu);
		return _ret;
	}

	/**
	 * identifier -> Identifier()
	 * nodeToken -> "<="
	 * identifier1 -> Identifier()
	 */
	public X10Type visit(LessThanEqualExpression n, X10Type argu) {
		X10Type _ret=null;
		n.identifier.accept(this, argu);
		n.nodeToken.accept(this, argu);
		n.identifier1.accept(this, argu);
		return _ret;
	}

	/**
	 * identifier -> Identifier()
	 * nodeToken -> ">="
	 * identifier1 -> Identifier()
	 */
	public X10Type visit(GreaterThanEqualExpression n, X10Type argu) {
		X10Type _ret=null;
		n.identifier.accept(this, argu);
		n.nodeToken.accept(this, argu);
		n.identifier1.accept(this, argu);
		return _ret;
	}

	/**
	 * identifier -> Identifier()
	 * nodeToken -> "<<"
	 * identifier1 -> Identifier()
	 */
	public X10Type visit(ShiftLeftExpression n, X10Type argu) {
		X10Type _ret=null;
		n.identifier.accept(this, argu);
		n.nodeToken.accept(this, argu);
		n.identifier1.accept(this, argu);
		return _ret;
	}

	/**
	 * identifier -> Identifier()
	 * nodeToken -> ">>"
	 * identifier1 -> Identifier()
	 */
	public X10Type visit(ShiftRightExpression n, X10Type argu) {
		X10Type _ret=null;
		n.identifier.accept(this, argu);
		n.nodeToken.accept(this, argu);
		n.identifier1.accept(this, argu);
		return _ret;
	}

	/**
	 * identifier -> Identifier()
	 * nodeToken -> ">>>"
	 * identifier1 -> Identifier()
	 */
	public X10Type visit(ShiftRightUnsignedExpression n, X10Type argu) {
		X10Type _ret=null;
		n.identifier.accept(this, argu);
		n.nodeToken.accept(this, argu);
		n.identifier1.accept(this, argu);
		return _ret;
	}

	/**
	 * identifier -> Identifier()
	 * nodeToken -> "+"
	 * identifier1 -> Identifier()
	 */
	public X10Type visit(PlusExpression n, X10Type argu) {
		X10Type _ret=null;
		n.identifier.accept(this, argu);
		n.nodeToken.accept(this, argu);
		n.identifier1.accept(this, argu);
		return _ret;
	}

	/**
	 * identifier -> Identifier()
	 * nodeToken -> "-"
	 * identifier1 -> Identifier()
	 */
	public X10Type visit(MinusExpression n, X10Type argu) {
		X10Type _ret=null;
		n.identifier.accept(this, argu);
		n.nodeToken.accept(this, argu);
		n.identifier1.accept(this, argu);
		return _ret;
	}

	/**
	 * identifier -> Identifier()
	 * nodeToken -> "*"
	 * identifier1 -> Identifier()
	 */
	public X10Type visit(TimesExpression n, X10Type argu) {
		X10Type _ret=null;
		n.identifier.accept(this, argu);
		n.nodeToken.accept(this, argu);
		n.identifier1.accept(this, argu);
		return _ret;
	}

	/**
	 * identifier -> Identifier()
	 * nodeToken -> "/"
	 * identifier1 -> Identifier()
	 */
	public X10Type visit(DivideExpression n, X10Type argu) {
		X10Type _ret=null;
		n.identifier.accept(this, argu);
		n.nodeToken.accept(this, argu);
		n.identifier1.accept(this, argu);
		return _ret;
	}

	/**
	 * identifier -> Identifier()
	 * nodeToken -> "%"
	 * identifier1 -> Identifier()
	 */
	public X10Type visit(ModulusExpression n, X10Type argu) {
		X10Type _ret=null;
		n.identifier.accept(this, argu);
		n.nodeToken.accept(this, argu);
		n.identifier1.accept(this, argu);
		return _ret;
	}

	/**
	 * nodeToken -> "Math"
	 * nodeToken1 -> "."
	 * nodeToken2 -> "sin"
	 * nodeToken3 -> "("
	 * identifier -> Identifier()
	 * nodeToken4 -> ")"
	 */
	public X10Type visit(SinExpression n, X10Type argu) {
		X10Type _ret=null;
		n.nodeToken.accept(this, argu);
		n.nodeToken1.accept(this, argu);
		n.nodeToken2.accept(this, argu);
		n.nodeToken3.accept(this, argu);
		n.identifier.accept(this, argu);
		n.nodeToken4.accept(this, argu);
		return _ret;
	}

	/**
	 * nodeToken -> "Math"
	 * nodeToken1 -> "."
	 * nodeToken2 -> "cos"
	 * nodeToken3 -> "("
	 * identifier -> Identifier()
	 * nodeToken4 -> ")"
	 */
	public X10Type visit(CosExpression n, X10Type argu) {
		X10Type _ret=null;
		n.nodeToken.accept(this, argu);
		n.nodeToken1.accept(this, argu);
		n.nodeToken2.accept(this, argu);
		n.nodeToken3.accept(this, argu);
		n.identifier.accept(this, argu);
		n.nodeToken4.accept(this, argu);
		return _ret;
	}

	/**
	 * nodeToken -> "Math"
	 * nodeToken1 -> "."
	 * nodeToken2 -> "pow"
	 * nodeToken3 -> "("
	 * identifier -> Identifier()
	 * nodeToken4 -> ","
	 * identifier1 -> Identifier()
	 * nodeToken5 -> ")"
	 */
	public X10Type visit(PowExpression n, X10Type argu) {
		X10Type _ret=null;
		n.nodeToken.accept(this, argu);
		n.nodeToken1.accept(this, argu);
		n.nodeToken2.accept(this, argu);
		n.nodeToken3.accept(this, argu);
		n.identifier.accept(this, argu);
		n.nodeToken4.accept(this, argu);
		n.identifier1.accept(this, argu);
		n.nodeToken5.accept(this, argu);
		return _ret;
	}

	/**
	 * nodeToken -> "Math"
	 * nodeToken1 -> "."
	 * nodeToken2 -> "exp"
	 * nodeToken3 -> "("
	 * identifier -> Identifier()
	 * nodeToken4 -> ")"
	 */
	public X10Type visit(ExpExpression n, X10Type argu) {
		X10Type _ret=null;
		n.nodeToken.accept(this, argu);
		n.nodeToken1.accept(this, argu);
		n.nodeToken2.accept(this, argu);
		n.nodeToken3.accept(this, argu);
		n.identifier.accept(this, argu);
		n.nodeToken4.accept(this, argu);
		return _ret;
	}

	/**
	 * nodeToken -> "Math"
	 * nodeToken1 -> "."
	 * nodeToken2 -> "sqrt"
	 * nodeToken3 -> "("
	 * identifier -> Identifier()
	 * nodeToken4 -> ")"
	 */
	public X10Type visit(SqrtExpression n, X10Type argu) {
		X10Type _ret=null;
		n.nodeToken.accept(this, argu);
		n.nodeToken1.accept(this, argu);
		n.nodeToken2.accept(this, argu);
		n.nodeToken3.accept(this, argu);
		n.identifier.accept(this, argu);
		n.nodeToken4.accept(this, argu);
		return _ret;
	}

	/**
	 * nodeToken -> "Math"
	 * nodeToken1 -> "."
	 * nodeToken2 -> "abs"
	 * nodeToken3 -> "("
	 * identifier -> Identifier()
	 * nodeToken4 -> ")"
	 */
	public X10Type visit(AbsExpression n, X10Type argu) {
		X10Type _ret=null;
		n.nodeToken.accept(this, argu);
		n.nodeToken1.accept(this, argu);
		n.nodeToken2.accept(this, argu);
		n.nodeToken3.accept(this, argu);
		n.identifier.accept(this, argu);
		n.nodeToken4.accept(this, argu);
		return _ret;
	}

	/**
	 * nodeToken -> "Math"
	 * nodeToken1 -> "."
	 * nodeToken2 -> "min"
	 * nodeToken3 -> "("
	 * identifier -> Identifier()
	 * nodeToken4 -> ","
	 * identifier1 -> Identifier()
	 * nodeToken5 -> ")"
	 */
	public X10Type visit(MinExpression n, X10Type argu) {
		X10Type _ret=null;
		n.nodeToken.accept(this, argu);
		n.nodeToken1.accept(this, argu);
		n.nodeToken2.accept(this, argu);
		n.nodeToken3.accept(this, argu);
		n.identifier.accept(this, argu);
		n.nodeToken4.accept(this, argu);
		n.identifier1.accept(this, argu);
		n.nodeToken5.accept(this, argu);
		return _ret;
	}

	/**
	 * nodeToken -> "Math"
	 * nodeToken1 -> "."
	 * nodeToken2 -> "max"
	 * nodeToken3 -> "("
	 * identifier -> Identifier()
	 * nodeToken4 -> ","
	 * identifier1 -> Identifier()
	 * nodeToken5 -> ")"
	 */
	public X10Type visit(MaxExpression n, X10Type argu) {
		X10Type _ret=null;
		n.nodeToken.accept(this, argu);
		n.nodeToken1.accept(this, argu);
		n.nodeToken2.accept(this, argu);
		n.nodeToken3.accept(this, argu);
		n.identifier.accept(this, argu);
		n.nodeToken4.accept(this, argu);
		n.identifier1.accept(this, argu);
		n.nodeToken5.accept(this, argu);
		return _ret;
	}

	/**
	 * nodeToken -> "Math"
	 * nodeToken1 -> "."
	 * nodeToken2 -> "log"
	 * nodeToken3 -> "("
	 * identifier -> Identifier()
	 * nodeToken4 -> ")"
	 */
	public X10Type visit(LogExpression n, X10Type argu) {
		X10Type _ret=null;
		n.nodeToken.accept(this, argu);
		n.nodeToken1.accept(this, argu);
		n.nodeToken2.accept(this, argu);
		n.nodeToken3.accept(this, argu);
		n.identifier.accept(this, argu);
		n.nodeToken4.accept(this, argu);
		return _ret;
	}

	/**
	 * nodeToken -> "~"
	 * identifier -> Identifier()
	 */
	public X10Type visit(ComplimentExpression n, X10Type argu) {
		X10Type _ret=null;
		n.nodeToken.accept(this, argu);
		n.identifier.accept(this, argu);
		return _ret;
	}

	/**
	 * nodeToken -> "!"
	 * identifier -> Identifier()
	 */
	public X10Type visit(NotExpression n, X10Type argu) {
		X10Type _ret=null;
		n.nodeToken.accept(this, argu);
		n.identifier.accept(this, argu);
		return _ret;
	}

	/**
	 * nodeToken -> "("
	 * nodeToken1 -> "int"
	 * nodeToken2 -> ")"
	 * expression -> Expression()
	 */
	public X10Type visit(CoercionToIntExpression n, X10Type argu) {
		X10Type _ret=null;
		n.nodeToken.accept(this, argu);
		n.nodeToken1.accept(this, argu);
		n.nodeToken2.accept(this, argu);
		n.expression.accept(this, argu);
		return _ret;
	}

	/**
	 * nodeToken -> "("
	 * nodeToken1 -> "double"
	 * nodeToken2 -> ")"
	 * expression -> Expression()
	 */
	public X10Type visit(CoercionToDoubleExpression n, X10Type argu) {
		X10Type _ret=null;
		n.nodeToken.accept(this, argu);
		n.nodeToken1.accept(this, argu);
		n.nodeToken2.accept(this, argu);
		n.expression.accept(this, argu);
		return _ret;
	}

	/**
	 * nodeToken -> "("
	 * nodeToken1 -> "long"
	 * nodeToken2 -> ")"
	 * expression -> Expression()
	 */
	public X10Type visit(CoercionToLongExpression n, X10Type argu) {
		X10Type _ret=null;
		n.nodeToken.accept(this, argu);
		n.nodeToken1.accept(this, argu);
		n.nodeToken2.accept(this, argu);
		n.expression.accept(this, argu);
		return _ret;
	}

	/**
	 * nodeToken -> "("
	 * nodeToken1 -> "short"
	 * nodeToken2 -> ")"
	 * expression -> Expression()
	 */
	public X10Type visit(CoercionToShortExpression n, X10Type argu) {
		X10Type _ret=null;
		n.nodeToken.accept(this, argu);
		n.nodeToken1.accept(this, argu);
		n.nodeToken2.accept(this, argu);
		n.expression.accept(this, argu);
		return _ret;
	}

	/**
	 * nodeToken -> "("
	 * nodeToken1 -> "byte"
	 * nodeToken2 -> ")"
	 * expression -> Expression()
	 */
	public X10Type visit(CoercionToByteExpression n, X10Type argu) {
		X10Type _ret=null;
		n.nodeToken.accept(this, argu);
		n.nodeToken1.accept(this, argu);
		n.nodeToken2.accept(this, argu);
		n.expression.accept(this, argu);
		return _ret;
	}

	/**
	 * nodeToken -> "place.places"
	 * nodeToken1 -> "("
	 * identifier -> Identifier()
	 * nodeToken2 -> ")"
	 */
	public X10Type visit(Place n, X10Type argu) {
		X10Type _ret=null;
		n.nodeToken.accept(this, argu);
		n.nodeToken1.accept(this, argu);
		n.identifier.accept(this, argu);
		n.nodeToken2.accept(this, argu);
		return _ret;
	}

	/**
	 * nodeToken -> "System.currentTimeMillis"
	 * nodeToken1 -> "("
	 * nodeToken2 -> ")"
	 */
	public X10Type visit(CurrentTime n, X10Type argu) {
		X10Type _ret=null;
		n.nodeToken.accept(this, argu);
		n.nodeToken1.accept(this, argu);
		n.nodeToken2.accept(this, argu);
		return _ret;
	}

	/**
	 * identifier -> Identifier()
	 * nodeToken -> "["
	 * identifier1 -> Identifier()
	 * nodeToken1 -> "]"
	 */
	public X10Type visit(ArrayAccess n, X10Type argu) {
		X10Type _ret=null;
		n.identifier.accept(this, argu);
		n.nodeToken.accept(this, argu);
		n.identifier1.accept(this, argu);
		n.nodeToken1.accept(this, argu);
		return _ret;
	}

	/**
	 * identifier -> Identifier()
	 * nodeToken -> "."
	 * identifier1 -> Identifier()
	 * nodeToken1 -> "("
	 * nodeOptional -> ( IdentifierList() )?
	 * nodeToken2 -> ")"
	 */
	public X10Type visit(MethodCall n, X10Type argu) {
		X10Type _ret=null;
		n.identifier.accept(this, argu);
		n.nodeToken.accept(this, argu);
		n.identifier1.accept(this, argu);
		n.nodeToken1.accept(this, argu);
		n.nodeOptional.accept(this, argu);
		n.nodeToken2.accept(this, argu);
		return _ret;
	}

	/**
	 * nodeToken -> "this"
	 * nodeToken1 -> "."
	 * identifier -> Identifier()
	 * nodeToken2 -> "("
	 * nodeOptional -> ( IdentifierList() )?
	 * nodeToken3 -> ")"
	 */
	public X10Type visit(MethodCallInConstructor n, X10Type argu) {
		X10Type _ret=null;
		n.nodeToken.accept(this, argu);
		n.nodeToken1.accept(this, argu);
		n.identifier.accept(this, argu);
		n.nodeToken2.accept(this, argu);
		n.nodeOptional.accept(this, argu);
		n.nodeToken3.accept(this, argu);
		return _ret;
	}

	/**
	 * identifier -> Identifier()
	 * nodeToken -> "."
	 * nodeToken1 -> "id"
	 */
	public X10Type visit(DotId n, X10Type argu) {
		X10Type _ret=null;
		n.identifier.accept(this, argu);
		n.nodeToken.accept(this, argu);
		n.nodeToken1.accept(this, argu);
		return _ret;
	}

	/**
	 * identifier -> Identifier()
	 * nodeToken -> "."
	 * identifier1 -> Identifier()
	 * nodeToken1 -> "."
	 * nodeToken2 -> "get"
	 * nodeToken3 -> "("
	 * identifierList -> IdentifierList()
	 * nodeToken4 -> ")"
	 */
	public X10Type visit(DotIdentifierDotGet n, X10Type argu) {
		X10Type _ret=null;
		n.identifier.accept(this, argu);
		n.nodeToken.accept(this, argu);
		n.identifier1.accept(this, argu);
		n.nodeToken1.accept(this, argu);
		n.nodeToken2.accept(this, argu);
		n.nodeToken3.accept(this, argu);
		n.identifierList.accept(this, argu);
		n.nodeToken4.accept(this, argu);
		return _ret;
	}

	/**
	 * identifier -> Identifier()
	 * nodeToken -> "."
	 * nodeToken1 -> "next"
	 * nodeToken2 -> "("
	 * nodeToken3 -> ")"
	 */
	public X10Type visit(DotNext n, X10Type argu) {
		X10Type _ret=null;
		n.identifier.accept(this, argu);
		n.nodeToken.accept(this, argu);
		n.nodeToken1.accept(this, argu);
		n.nodeToken2.accept(this, argu);
		n.nodeToken3.accept(this, argu);
		return _ret;
	}

	/**
	 * identifier -> Identifier()
	 * nodeToken -> "."
	 * nodeToken1 -> "prev"
	 * nodeToken2 -> "("
	 * nodeToken3 -> ")"
	 */
	public X10Type visit(DotPrev n, X10Type argu) {
		X10Type _ret=null;
		n.identifier.accept(this, argu);
		n.nodeToken.accept(this, argu);
		n.nodeToken1.accept(this, argu);
		n.nodeToken2.accept(this, argu);
		n.nodeToken3.accept(this, argu);
		return _ret;
	}

	/**
	 * identifier -> Identifier()
	 * nodeToken -> "."
	 * nodeToken1 -> "isFirst"
	 * nodeToken2 -> "("
	 * nodeToken3 -> ")"
	 */
	public X10Type visit(DotIsFirst n, X10Type argu) {
		X10Type _ret=null;
		n.identifier.accept(this, argu);
		n.nodeToken.accept(this, argu);
		n.nodeToken1.accept(this, argu);
		n.nodeToken2.accept(this, argu);
		n.nodeToken3.accept(this, argu);
		return _ret;
	}

	/**
	 * identifier -> Identifier()
	 * nodeToken -> "."
	 * nodeToken1 -> "isLast"
	 * nodeToken2 -> "("
	 * nodeToken3 -> ")"
	 */
	public X10Type visit(DotIsLast n, X10Type argu) {
		X10Type _ret=null;
		n.identifier.accept(this, argu);
		n.nodeToken.accept(this, argu);
		n.nodeToken1.accept(this, argu);
		n.nodeToken2.accept(this, argu);
		n.nodeToken3.accept(this, argu);
		return _ret;
	}

	/**
	 * identifier -> Identifier()
	 * nodeToken -> "."
	 * nodeToken1 -> "length"
	 */
	public X10Type visit(DotLength n, X10Type argu) {
		X10Type _ret=null;
		n.identifier.accept(this, argu);
		n.nodeToken.accept(this, argu);
		n.nodeToken1.accept(this, argu);
		return _ret;
	}

	/**
	 * identifier -> Identifier()
	 * nodeToken -> "."
	 * identifier1 -> Identifier()
	 */
	public X10Type visit(DotIdentifier n, X10Type argu) {
		X10Type _ret=null;
		n.identifier.accept(this, argu);
		n.nodeToken.accept(this, argu);
		n.identifier1.accept(this, argu);
		return _ret;
	}

	/**
	 * nodeToken -> "new"
	 * identifier -> Identifier()
	 * nodeToken1 -> "("
	 * nodeOptional -> [ IdentifierList() ]
	 * nodeToken2 -> ")"
	 */
	public X10Type visit(NewObject n, X10Type argu) {
		X10Type _ret=null;
		n.nodeToken.accept(this, argu);
		n.identifier.accept(this, argu);
		n.nodeToken1.accept(this, argu);
		n.nodeOptional.accept(this, argu);
		n.nodeToken2.accept(this, argu);
		return _ret;
	}

	/**
	 * nodeToken -> "new"
	 * nonArrayType -> NonArrayType()
	 * nodeToken1 -> "["
	 * identifier -> Identifier()
	 * nodeToken2 -> "]"
	 */
	public X10Type visit(NewUpdatableArray n, X10Type argu) {
		X10Type _ret=null;
		n.nodeToken.accept(this, argu);
		n.nonArrayType.accept(this, argu);
		n.nodeToken1.accept(this, argu);
		n.identifier.accept(this, argu);
		n.nodeToken2.accept(this, argu);
		return _ret;
	}

	/**
	 * nodeToken -> <INTEGER_LITERAL>
	 */
	public X10Type visit(IntegerLiteral n, X10Type argu) {
		X10Type _ret=null;
		n.nodeToken.accept(this, argu);
		return _ret;
	}

	/**
	 * nodeToken -> <LONG_LITERAL>
	 */
	public X10Type visit(LongLiteral n, X10Type argu) {
		X10Type _ret=null;
		n.nodeToken.accept(this, argu);
		return _ret;
	}

	/**
	 * nodeToken -> <HEX_LITERAL>
	 */
	public X10Type visit(HexLiteral n, X10Type argu) {
		X10Type _ret=null;
		n.nodeToken.accept(this, argu);
		return _ret;
	}

	/**
	 * nodeToken -> <FLOATING_POINT_LITERAL>
	 */
	public X10Type visit(FloatingPointLiteral n, X10Type argu) {
		X10Type _ret=null;
		n.nodeToken.accept(this, argu);
		return _ret;
	}

	/**
	 * nodeToken -> <STRING_LITERAL>
	 */
	public X10Type visit(StringLiteral n, X10Type argu) {
		X10Type _ret=null;
		n.nodeToken.accept(this, argu);
		return _ret;
	}

	/**
	 * nodeToken -> "true"
	 */
	public X10Type visit(True n, X10Type argu) {
		X10Type _ret=null;
		n.nodeToken.accept(this, argu);
		return _ret;
	}

	/**
	 * nodeToken -> "false"
	 */
	public X10Type visit(False n, X10Type argu) {
		X10Type _ret=null;
		n.nodeToken.accept(this, argu);
		return _ret;
	}

	/**
	 * nodeToken -> "here"
	 */
	public X10Type visit(HereLiteral n, X10Type argu) {
		X10Type _ret=null;
		n.nodeToken.accept(this, argu);
		return _ret;
	}

	/**
	 * nodeToken -> "place.FIRST_PLACE"
	 */
	public X10Type visit(PlaceFirstPlace n, X10Type argu) {
		X10Type _ret=null;
		n.nodeToken.accept(this, argu);
		return _ret;
	}

	/**
	 * nodeToken -> "place.LAST_PLACE"
	 */
	public X10Type visit(PlaceLastPlace n, X10Type argu) {
		X10Type _ret=null;
		n.nodeToken.accept(this, argu);
		return _ret;
	}

	/**
	 * nodeToken -> "place.MAX_PLACES"
	 */
	public X10Type visit(PlaceMaxPlaces n, X10Type argu) {
		X10Type _ret=null;
		n.nodeToken.accept(this, argu);
		return _ret;
	}

	/**
	 * nodeToken -> "java.lang.Integer.SIZE"
	 */
	public X10Type visit(JavaIntegerSize n, X10Type argu) {
		X10Type _ret=null;
		n.nodeToken.accept(this, argu);
		return _ret;
	}

}